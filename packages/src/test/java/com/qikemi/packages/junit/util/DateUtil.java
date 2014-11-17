package com.qikemi.packages.junit.util;

import org.junit.Test;

import com.qikemi.packages.utils.Dateutil;

public class DateUtil {

	@Test
	public void t() {
		System.out.println(Dateutil.getCurrentSeconds());
		System.out.println(Dateutil.convertSeconds2DateTime(Dateutil
				.getCurrentSeconds()));
		System.out.println(Dateutil.getCurrentMillisecond());
		System.out.println(Dateutil.convertCurrentMillisecond2DateTime(Dateutil
				.getCurrentMillisecond()));
	}
}
