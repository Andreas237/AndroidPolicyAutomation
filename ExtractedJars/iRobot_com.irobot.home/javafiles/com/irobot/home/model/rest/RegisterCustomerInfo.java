// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;


public class RegisterCustomerInfo
{

	public RegisterCustomerInfo(int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int id>
		previouslyRegistered = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field boolean previouslyRegistered>
	//    8   14:return          
	}

	public int id;
	public boolean previouslyRegistered;
}
