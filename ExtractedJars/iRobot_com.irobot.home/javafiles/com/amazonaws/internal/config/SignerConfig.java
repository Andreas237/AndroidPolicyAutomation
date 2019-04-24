// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.internal.config;


public class SignerConfig
{

	SignerConfig(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String a>
	//    5    9:return          
	}

	public String toString()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String a>
	//    2    4:areturn         
	}

	private final String a;
}
