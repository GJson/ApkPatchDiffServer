package com.cundong.utils;

/**
 * 类说明： 	APK Diff工具类
 * 
* @author  Gjson
 * @date    2015-9-6
 * @update  2016-06-01
 * @version 1.6
 */
public class DiffUtils {

	/**
	 * native方法 比较路径为oldPath的apk与newPath的apk之间差异，并生成patch包，存储于patchPath
	 * 
	 * 返回：0，说明操作成功
	 *  
	 * @param oldApkPath 示例:/sdcard/old.apk
	 * @param newApkPath 示例:/sdcard/new.apk
	 * @param patchPath  示例:/sdcard/xx.patch
	 * @return
	 */
	public static native int genDiff(String oldApkPath, String newApkPath, String patchPath);
}