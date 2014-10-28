package com.qikemi.packages.utils;

/**
 * 处理钱的工具类 
 * 
 * @create date : 2014年10月28日 上午9:12:48
 * @Author XieXianbin<a.b@hotmail.com>
 * @Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class MoneyUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(numToCN(11514L));
//		System.out.println(cnToNum("玖拾亿伍仟万零伍元"));
//		System.out.println(Integer.MAX_VALUE);
	}
	/**
	 * 阿拉伯数字转为人民币大写
	 * @param num 123456789
	 */
	protected static String numToCN(long momey){
		String[] unitArray = {"分", "角", "元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟"};
		String[] numArray = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
		if (momey == 0) {
            return "零元整";
        }
		String str = Long.toString(momey*100);
		char[] arr = str.toCharArray();
		int len = arr.length;
		int zero = 0;
		StringBuffer targetNum = new StringBuffer();
		for(int i=0;i<arr.length;i++){
			String s = arr[i]+"";
			int num = Integer.parseInt(s);
			int unitNum = len-i-1;
			if(num==0){
				zero++;
                if (unitNum == 2 || unitNum == 6 || unitNum == 10)
                {
                    if (unitNum == 2 || zero < 4)
                    	targetNum.append(unitArray[unitNum]);
                    zero = 0;
                }
			}else{
				if (zero > 0)
                {
                    targetNum.append(numArray[0]);
                    zero = 0;
                }
				targetNum.append(numArray[num]);
				targetNum.append(unitArray[unitNum]);
			}
		}
		if(zero>0){
			targetNum.append("整");
		}
		return targetNum.toString();
	}
	/**
	 * 人民币大写转换成阿拉伯数字
	 * @param str 壹亿五千零二十万零五元
	 * @return
	 */
	
	protected static long cnToNum(String str){
		String numStr = "零壹贰叁肆伍陆柒捌玖";
		String unitStr = "分角圆拾佰仟万拾佰仟亿拾佰仟";
		char[] arr = str.toCharArray();
		long sum = 0l;
		int len = arr.length;
		int num = 0;
		int unit = 0;
		for(int i=0;i<len;i++){
			String key = arr[i]+"";
			int index = numStr.indexOf(key);
			if(index!=-1) {
				num = index;
			}else {
				unit = unitStr.indexOf(key);
				if(num!=0){
					if(unit==6 || unit==10 || unit==14){
						sum *=  Math.pow(10,unit-2);
					}else {
						if(unit<=2){
							sum +=num;
							num = 0;
						}else{
							sum += num * Math.pow(10,unit-2);
						}
					
					}
				}
			}
		}
		return sum;
	}
}
