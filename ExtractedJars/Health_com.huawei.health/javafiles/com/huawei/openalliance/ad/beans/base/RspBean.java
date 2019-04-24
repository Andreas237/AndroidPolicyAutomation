// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.base;


public class RspBean
{

	public RspBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		responseCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #19  <Field int responseCode>
	//    5    9:return          
	}

	public static final int ERROR = 1;
	public static final int OK = 0;
	public String errorReason;
	public int responseCode;
}
