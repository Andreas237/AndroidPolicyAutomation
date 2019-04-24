// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.app.IntentService;
import android.content.Intent;

public class PeriodicMetaDataService extends IntentService
{

	public PeriodicMetaDataService()
	{
		super(((Class) (com/startapp/android/publish/common/metaData/PeriodicMetaDataService)).getSimpleName());
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class PeriodicMetaDataService>
	//    2    3:invokevirtual   #12  <Method String Class.getSimpleName()>
	//    3    6:invokespecial   #15  <Method void IntentService(String)>
	//    4    9:return          
	}

	protected void onHandleIntent(Intent intent)
	{
	//    0    0:return          
	}
}
