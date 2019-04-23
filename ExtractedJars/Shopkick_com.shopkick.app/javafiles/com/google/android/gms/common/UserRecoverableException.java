// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception
{

	public UserRecoverableException(String s, Intent intent)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void Exception(String)>
		mIntent = intent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #13  <Field Intent mIntent>
	//    6   10:return          
	}

	public Intent getIntent()
	{
		return new Intent(mIntent);
	//    0    0:new             #18  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field Intent mIntent>
	//    4    8:invokespecial   #21  <Method void Intent(Intent)>
	//    5   11:areturn         
	}

	private final Intent mIntent;
}
