// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.instrumentation;

import android.app.Activity;
import android.os.Bundle;
import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;

public class InstrumentedActivity extends Activity
{

	public InstrumentedActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Activity()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void Activity.onCreate(Bundle)>
		comScore.setAppContext(getApplicationContext());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #17  <Method android.content.Context getApplicationContext()>
	//    5    9:invokestatic    #23  <Method void comScore.setAppContext(android.content.Context)>
	//    6   12:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Activity.onPause()>
		comScore.onExitForeground();
	//    2    4:invokestatic    #29  <Method void comScore.onExitForeground()>
	//    3    7:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Activity.onResume()>
		comScore.getCore().setCurrentActivityName(((Object)this).getClass().getSimpleName());
	//    2    4:invokestatic    #36  <Method Core comScore.getCore()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #42  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #48  <Method String Class.getSimpleName()>
	//    6   14:invokevirtual   #54  <Method void Core.setCurrentActivityName(String)>
		comScore.onEnterForeground();
	//    7   17:invokestatic    #57  <Method void comScore.onEnterForeground()>
	//    8   20:return          
	}
}
