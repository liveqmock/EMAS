package com.evmtv.epg.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.util.StringUtils;

/**
 * 
 * @author fangzhu(fangzhu@evmtv.com)
 * @time 2013-6-3 下午9:04:43
 */
public class DateUtils {
	/**
	 * yyyyMMddHHmmss
	 * @return
	 */
	public static String getCurrentDay(){
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(currentTimeMillis()));
	}
	/**
	 * yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getCurrentTime(){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(currentTimeMillis()));
	}
	/**
	 * yyyyMMddHHmmss
	 * @return
	 */
	public static String formatTime(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		return format.format(new Date(currentTimeMillis()));
	}
	/**
	 * 当前毫秒
	 * @return
	 */
	public static long currentTimeMillis(){
		return System.currentTimeMillis();
	}
	/**
	 * yyyy-MM-dd
	 * @return
	 */
	public static String formatDate(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(new Date(currentTimeMillis()));
	}
	/**
	 * 格式化
	 * @param fmt
	 * @return
	 */
	public static String formatDate(String fmt){
		SimpleDateFormat format = new SimpleDateFormat(fmt);
		return format.format(new Date(currentTimeMillis()));
	}
	/**
	 * yyyy-MM-dd
	 * @param day
	 * @param date
	 * @param time
	 * @return
	 */
	public static String addDay(int day,String date,long time){
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if(StringUtils.hasText(date)){
			try {
				c.setTime(format.parse(date));
			} catch (ParseException e) {
			}
		}else{
			c.setTimeInMillis(time);
		}
		c.add(Calendar.DAY_OF_MONTH, day);
		return format.format(c.getTime());
	}
	
	/**
	 * yyyy-MM-dd
	 * @param day
	 * @param date
	 * @param time
	 * @return
	 */
	public static String addYear(int year,String date){
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if(StringUtils.hasText(date)){
			try {
				c.setTime(format.parse(date));
			} catch (ParseException e) {
			}
		}else{
			c.setTimeInMillis(currentTimeMillis());
		}
		c.add(Calendar.YEAR, year);
		return format.format(c.getTime());
	}
	/**
	 * 字符串转长整型
	 * @param s1
	 * @return
	 */
	public static long toLong(String s1){

		try {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s1).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 字符串转长整型
	 * @param s1
	 * @return
	 */
	public static long dataToLong(String s1){

		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(s1).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static long timeToLong(String s){
		try {
			return new SimpleDateFormat("HH:mm").parse(s).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 时间字符串比较
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String compare(String s1,String s2){
		return (toLong(s1) > toLong(s2)) ? s1 : s2;
	}
}