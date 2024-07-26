package day0325;

import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.*;
import java.util.Date;



public class ImportTest {

	public static void main(String[] args) {
		
		java.util.Date now = new java.util.Date();//현재 시간을 저장하고 있는 Data객체 생성
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		int r = (int)(Math.random()*10);
		System.out.println(r);

	}

}
