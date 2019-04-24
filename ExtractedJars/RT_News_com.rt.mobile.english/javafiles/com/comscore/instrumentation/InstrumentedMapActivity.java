// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.instrumentation;

import android.os.Bundle;
import com.comscore.analytics.Core;
import com.comscore.analytics.comScore;
import com.google.android.maps.MapActivity;

public class InstrumentedMapActivity extends MapActivity
{

	public InstrumentedMapActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void MapActivity()>
	//    2    4:return          
	}

	protected boolean isRouteDisplayed()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void MapActivity.onCreate(Bundle)>
		comScore.setAppContext(getApplicationContext());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #19  <Method android.content.Context getApplicationContext()>
	//    5    9:invokestatic    #25  <Method void comScore.setAppContext(android.content.Context)>
	//    6   12:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void MapActivity.onPause()>
		comScore.onExitForeground();
	//    2    4:invokestatic    #31  <Method void comScore.onExitForeground()>
	//    3    7:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void MapActivity.onResume()>
		comScore.getCore().setCurrentActivityName(((Object)this).getClass().getSimpleName());
	//    2    4:invokestatic    #38  <Method Core comScore.getCore()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #44  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #50  <Method String Class.getSimpleName()>
	//    6   14:invokevirtual   #56  <Method void Core.setCurrentActivityName(String)>
		comScore.onEnterForeground();
	//    7   17:invokestatic    #59  <Method void comScore.onEnterForeground()>
	//    8   20:return          
	}
}
