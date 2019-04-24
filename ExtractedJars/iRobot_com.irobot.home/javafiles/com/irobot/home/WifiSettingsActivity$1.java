// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			WifiSettingsActivity, BroadcastSetupActivity_

class WifiSettingsActivity$1
	implements android.content.Listener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (Assembler.getInstance().getAssetService().currentAssetInfo()));
	//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #32  <Method AssetService Assembler.getAssetService()>
	//    2    6:invokevirtual   #38  <Method AssetInfo AssetService.currentAssetInfo()>
	//    3    9:astore_1        
		if(dialoginterface != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          53
		{
			AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//    6   14:invokestatic    #28  <Method Assembler Assembler.getInstance()>
	//    7   17:invokevirtual   #42  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    8   20:astore_3        
			AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//    9   21:invokestatic    #48  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   10   24:astore          4
			assetsetupuiservicedata.setPlaceholderSkuType(SkuUtils.getSkuType(((AssetInfo) (dialoginterface)).getSku()));
	//   11   26:aload           4
	//   12   28:aload_1         
	//   13   29:invokevirtual   #54  <Method String AssetInfo.getSku()>
	//   14   32:invokestatic    #60  <Method com.irobot.core.SkuType SkuUtils.getSkuType(String)>
	//   15   35:invokevirtual   #64  <Method void AssetSetupUIServiceData.setPlaceholderSkuType(com.irobot.core.SkuType)>
			assetsetupuiservicedata.setAssetBeingReprovisioned(((AssetInfo) (dialoginterface)));
	//   16   38:aload           4
	//   17   40:aload_1         
	//   18   41:invokevirtual   #68  <Method void AssetSetupUIServiceData.setAssetBeingReprovisioned(AssetInfo)>
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.UpdateServiceData, assetsetupuiservicedata);
	//   19   44:aload_3         
	//   20   45:getstatic       #74  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.UpdateServiceData>
	//   21   48:aload           4
	//   22   50:invokevirtual   #80  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		}
		BroadcastSetupActivity_.a(((android.content.Context) (a))).a(false).a(a.d).a(1);
	//   23   53:aload_0         
	//   24   54:getfield        #17  <Field WifiSettingsActivity a>
	//   25   57:invokestatic    #85  <Method BroadcastSetupActivity_$a BroadcastSetupActivity_.a(android.content.Context)>
	//   26   60:iconst_0        
	//   27   61:invokevirtual   #90  <Method BroadcastSetupActivity_$a BroadcastSetupActivity_$a.a(boolean)>
	//   28   64:aload_0         
	//   29   65:getfield        #17  <Field WifiSettingsActivity a>
	//   30   68:getfield        #94  <Field String WifiSettingsActivity.d>
	//   31   71:invokevirtual   #97  <Method BroadcastSetupActivity_$a BroadcastSetupActivity_$a.a(String)>
	//   32   74:iconst_1        
	//   33   75:invokevirtual   #100 <Method org.androidannotations.api.a.e BroadcastSetupActivity_$a.a(int)>
	//   34   78:pop             
	//   35   79:return          
	}

	final WifiSettingsActivity a;

	WifiSettingsActivity$1(WifiSettingsActivity wifisettingsactivity)
	{
		a = wifisettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WifiSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
