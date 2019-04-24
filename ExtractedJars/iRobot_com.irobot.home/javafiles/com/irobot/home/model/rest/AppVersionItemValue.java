// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;


public class AppVersionItemValue
{

	public AppVersionItemValue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		version = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <String "">
	//    4    7:putfield        #16  <Field String version>
		priority = 1;
	//    5   10:aload_0         
	//    6   11:iconst_1        
	//    7   12:putfield        #18  <Field int priority>
	//    8   15:return          
	}

	public int priority;
	public String version;
}
