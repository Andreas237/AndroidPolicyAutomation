// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.AdapterView;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			Roomba900SetupActivity

class Roomba900SetupActivity$2
	implements android.widget.stener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) (Assembler.getInstance().getAssetSetupUIService()));
	//    0    0:invokestatic    #29  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #33  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:astore_1        
		view = ((View) (AssetSetupUIServiceData.create()));
	//    3    7:invokestatic    #39  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//    4   10:astore_2        
		((AssetSetupUIServiceData) (view)).setSelectedRobotListItemIndex(i);
	//    5   11:aload_2         
	//    6   12:iload_3         
	//    7   13:invokevirtual   #43  <Method void AssetSetupUIServiceData.setSelectedRobotListItemIndex(int)>
		((AssetSetupUIService) (adapterview)).sendCommand(AssetSetupUIServiceCommand.RobotListItemSelected, ((AssetSetupUIServiceData) (view)));
	//    8   16:aload_1         
	//    9   17:getstatic       #49  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.RobotListItemSelected>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #55  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//   12   24:return          
	}

	final Roomba900SetupActivity a;

	Roomba900SetupActivity$2(Roomba900SetupActivity roomba900setupactivity)
	{
		a = roomba900setupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Roomba900SetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
