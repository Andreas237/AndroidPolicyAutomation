// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			Roomba900SetupActivity

private class Roomba900SetupActivity$a
	implements Runnable
{

	public void run()
	{
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #32  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:astore_1        
		assetsetupuiservice.registerUISubscriber(Roomba900SetupActivity.a(a));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field Roomba900SetupActivity a>
	//    6   12:invokestatic    #35  <Method com.irobot.core.AssetSetupUIServiceDataCallback Roomba900SetupActivity.a(Roomba900SetupActivity)>
	//    7   15:invokevirtual   #41  <Method boolean AssetSetupUIService.registerUISubscriber(com.irobot.core.AssetSetupUIServiceDataCallback)>
	//    8   18:pop             
		AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//    9   19:invokestatic    #47  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   10   22:astore_2        
		assetsetupuiservicedata.setDiscoveryTypeForListItemsPresentation(DiscoveryType.Wifi);
	//   11   23:aload_2         
	//   12   24:getstatic       #53  <Field DiscoveryType DiscoveryType.Wifi>
	//   13   27:invokevirtual   #57  <Method void AssetSetupUIServiceData.setDiscoveryTypeForListItemsPresentation(DiscoveryType)>
		assetsetupuiservicedata.setDiscoveryIdForListItemsPresentation(0);
	//   14   30:aload_2         
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #61  <Method void AssetSetupUIServiceData.setDiscoveryIdForListItemsPresentation(int)>
		assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StartFetchingDiscoveryListItems, assetsetupuiservicedata);
	//   17   35:aload_1         
	//   18   36:getstatic       #67  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StartFetchingDiscoveryListItems>
	//   19   39:aload_2         
	//   20   40:invokevirtual   #71  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//   21   43:return          
	}

	final Roomba900SetupActivity a;

	private Roomba900SetupActivity$a(Roomba900SetupActivity roomba900setupactivity)
	{
		a = roomba900setupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Roomba900SetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	Roomba900SetupActivity$a(Roomba900SetupActivity roomba900setupactivity, Roomba900SetupActivity$1 roomba900setupactivity$1)
	{
		this(roomba900setupactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void Roomba900SetupActivity$a(Roomba900SetupActivity)>
	//    3    5:return          
	}
}
