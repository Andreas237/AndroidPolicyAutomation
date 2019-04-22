// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails
{

	public ReferrerDetails(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mOriginalBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Bundle mOriginalBundle>
	//    5    9:return          
	}

	public long getInstallBeginTimestampSeconds()
	{
		return mOriginalBundle.getLong("install_begin_timestamp_seconds");
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Bundle mOriginalBundle>
	//    2    4:ldc1            #18  <String "install_begin_timestamp_seconds">
	//    3    6:invokevirtual   #24  <Method long Bundle.getLong(String)>
	//    4    9:lreturn         
	}

	public String getInstallReferrer()
	{
		return mOriginalBundle.getString("install_referrer");
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Bundle mOriginalBundle>
	//    2    4:ldc1            #28  <String "install_referrer">
	//    3    6:invokevirtual   #32  <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public long getReferrerClickTimestampSeconds()
	{
		return mOriginalBundle.getLong("referrer_click_timestamp_seconds");
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Bundle mOriginalBundle>
	//    2    4:ldc1            #35  <String "referrer_click_timestamp_seconds">
	//    3    6:invokevirtual   #24  <Method long Bundle.getLong(String)>
	//    4    9:lreturn         
	}

	private final Bundle mOriginalBundle;
}
