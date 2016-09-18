package com.cundong.apkdiff;

import com.cundong.common.Constants;
import com.cundong.utils.DiffUtils;

/**
 * 类说明：  新旧apk包，生成差分包实例
 * 
 * @author  Gjson
 * @date    2015-9-6
 * @update  2016-06-01
 * @version 1.6
 */
public class ApkDiffDemo {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		System.out.println("开始生成差分包，请等待...");

		int genDiff = DiffUtils.genDiff(Constants.OLD_APK, Constants.NEW_APK,
				Constants.PATCH_FILE);

		long end = System.currentTimeMillis();

		System.out.println("生成差分包成功：" + Constants.PATCH_FILE + "，耗时："
				+ (end - start) / 1000 + "秒, result=" + genDiff);
	}

	static {
		System.loadLibrary("ApkPatchLibraryServer");
	}
}
