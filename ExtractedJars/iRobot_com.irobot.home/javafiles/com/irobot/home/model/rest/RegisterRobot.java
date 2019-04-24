// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;


public class RegisterRobot
{

	public RegisterRobot(String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		email = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String email>
		serialNumber = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String serialNumber>
		robotName = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field String robotName>
		purchaseDate = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #23  <Field String purchaseDate>
	//   14   25:return          
	}

	String email;
	String purchaseDate;
	String purchaseLocation;
	String robotName;
	String serialNumber;
}
