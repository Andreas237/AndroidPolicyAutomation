// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;


public class SocialInfo
{

	public SocialInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		name = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "">
	//    4    7:putfield        #17  <Field String name>
		URL = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #15  <String "">
	//    7   13:putfield        #19  <Field String URL>
		iconLowResURL = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #15  <String "">
	//   10   19:putfield        #21  <Field String iconLowResURL>
		iconHighResURL = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #15  <String "">
	//   13   25:putfield        #23  <Field String iconHighResURL>
	//   14   28:return          
	}

	public String URL;
	public String iconHighResURL;
	public String iconLowResURL;
	public String name;
}
