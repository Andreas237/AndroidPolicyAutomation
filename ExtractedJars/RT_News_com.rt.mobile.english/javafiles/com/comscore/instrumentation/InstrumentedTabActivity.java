// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.instrumentation;

import android.app.TabActivity;
import android.os.Bundle;
import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;

public class InstrumentedTabActivity extends TabActivity
{

	public InstrumentedTabActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TabActivity()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void TabActivity.onCreate(Bundle)>
		comScore.setAppContext(getApplicationContext());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #18  <Method android.content.Context getApplicationContext()>
	//    5    9:invokestatic    #24  <Method void comScore.setAppContext(android.content.Context)>
	//    6   12:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void TabActivity.onPause()>
		comScore.onExitForeground();
	//    2    4:invokestatic    #30  <Method void comScore.onExitForeground()>
	//    3    7:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void TabActivity.onResume()>
		comScore.getCore().setCurrentActivityName(((Object)this).getClass().getSimpleName());
	//    2    4:invokestatic    #37  <Method Core comScore.getCore()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #49  <Method String Class.getSimpleName()>
	//    6   14:invokevirtual   #55  <Method void Core.setCurrentActivityName(String)>
		comScore.onEnterForeground();
	//    7   17:invokestatic    #58  <Method void comScore.onEnterForeground()>
	//    8   20:return          
	}
}
