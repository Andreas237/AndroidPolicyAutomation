// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Bundle;

public class TaskParams
{

	public TaskParams(String s)
	{
		this(s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #13  <Method void TaskParams(String, Bundle)>
	//    4    6:return          
	}

	public TaskParams(String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		tag = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String tag>
		extras = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Bundle extras>
	//    8   14:return          
	}

	public Bundle getExtras()
	{
		return extras;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle extras>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String tag>
	//    2    4:areturn         
	}

	private final Bundle extras;
	private final String tag;
}
