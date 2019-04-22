// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core.internal.models;


public class SignalData
{

	public SignalData(String s, String s1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String name>
		code = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field String code>
		faultAddress = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #20  <Field long faultAddress>
	//   11   19:return          
	}

	public final String code;
	public final long faultAddress;
	public final String name;
}
