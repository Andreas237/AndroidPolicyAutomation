// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			Roomba900SetupActivity

private class Roomba900SetupActivity$b
	implements Runnable
{

	public void run()
	{
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//    0    0:invokestatic    #29  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #33  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:astore_1        
		assetsetupuiservice.unregisterSubscriber(Roomba900SetupActivity.a(a));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field Roomba900SetupActivity a>
	//    6   12:invokestatic    #36  <Method com.irobot.core.AssetSetupUIServiceDataCallback Roomba900SetupActivity.a(Roomba900SetupActivity)>
	//    7   15:invokevirtual   #42  <Method boolean AssetSetupUIService.unregisterSubscriber(com.irobot.core.AssetSetupUIServiceDataCallback)>
	//    8   18:pop             
		assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StopFetchingDiscoveryListItems, ((com.irobot.core.AssetSetupUIServiceData) (null)));
	//    9   19:aload_1         
	//   10   20:getstatic       #48  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StopFetchingDiscoveryListItems>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #52  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, com.irobot.core.AssetSetupUIServiceData)>
	//   13   27:return          
	}

	final Roomba900SetupActivity a;

	private Roomba900SetupActivity$b(Roomba900SetupActivity roomba900setupactivity)
	{
		a = roomba900setupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Roomba900SetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	Roomba900SetupActivity$b(Roomba900SetupActivity roomba900setupactivity, Roomba900SetupActivity$1 roomba900setupactivity$1)
	{
		this(roomba900setupactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Roomba900SetupActivity$b(Roomba900SetupActivity)>
	//    3    5:return          
	}
}
