// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.irobot.core.*;
import com.irobot.home.b.ag;

// Referenced classes of package com.irobot.home.fragments:
//			bm

class bm$1
	implements android.widget.erView.OnItemClickListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		bm.a(a).a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bm a>
	//    2    4:invokestatic    #23  <Method ag bm.a(bm)>
	//    3    7:iload_3         
	//    4    8:invokevirtual   #28  <Method void ag.a(int)>
		adapterview = ((AdapterView) (SettingsUIServiceData.create()));
	//    5   11:invokestatic    #34  <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    6   14:astore_1        
		((SettingsUIServiceData) (adapterview)).setIntegerSetting(SettingType.RobotRankOverlap, bm.a(a, i).ordinal());
	//    7   15:aload_1         
	//    8   16:getstatic       #40  <Field SettingType SettingType.RobotRankOverlap>
	//    9   19:aload_0         
	//   10   20:getfield        #14  <Field bm a>
	//   11   23:iload_3         
	//   12   24:invokestatic    #43  <Method RobotRankOverlap bm.a(bm, int)>
	//   13   27:invokevirtual   #49  <Method int RobotRankOverlap.ordinal()>
	//   14   30:invokevirtual   #53  <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
		a.b.sendCommand(SettingsUIServiceCommand.SetCleaningPreference, ((SettingsUIServiceData) (adapterview)));
	//   15   33:aload_0         
	//   16   34:getfield        #14  <Field bm a>
	//   17   37:getfield        #57  <Field SettingsSubsystem bm.b>
	//   18   40:getstatic       #63  <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #69  <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
	//   21   47:return          
	}

	final bm a;

	bm$1(bm bm1)
	{
		a = bm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bm a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
