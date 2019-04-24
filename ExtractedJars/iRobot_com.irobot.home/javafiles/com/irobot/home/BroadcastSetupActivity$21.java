// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Handler;
import android.os.Looper;
import com.irobot.core.*;
import com.irobot.home.h.b;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$21
	implements b
{

	public void a(DiscoveryType discoverytype)
	{
		o.e(a.w, "Finished doing discovery");
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BroadcastSetupActivity a>
	//    2    4:getfield        #27  <Field String BroadcastSetupActivity.w>
	//    3    7:ldc1            #29  <String "Finished doing discovery">
	//    4    9:invokestatic    #35  <Method void o.e(String, String)>
	//    5   12:return          
	}

	public void a(DiscoveryType discoverytype, DiscoveredAsset discoveredasset)
	{
		discoverytype = ((DiscoveryType) (a.w));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BroadcastSetupActivity a>
	//    2    4:getfield        #27  <Field String BroadcastSetupActivity.w>
	//    3    7:astore_1        
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #38  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void StringBuilder()>
	//    7   15:astore_3        
		((StringBuilder) (obj)).append("Discovered Asset ");
	//    8   16:aload_3         
	//    9   17:ldc1            #41  <String "Discovered Asset ">
	//   10   19:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		((StringBuilder) (obj)).append(discoveredasset.assetInfo().getAssetId().getId());
	//   12   23:aload_3         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #51  <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   15   28:invokevirtual   #57  <Method AssetId AssetInfo.getAssetId()>
	//   16   31:invokevirtual   #63  <Method String AssetId.getId()>
	//   17   34:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		o.e(((String) (discoverytype)), ((StringBuilder) (obj)).toString());
	//   19   38:aload_1         
	//   20   39:aload_3         
	//   21   40:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   22   43:invokestatic    #35  <Method void o.e(String, String)>
		discoverytype = ((DiscoveryType) ((DiscoveredWifiAsset)discoveredasset));
	//   23   46:aload_2         
	//   24   47:checkcast       #68  <Class DiscoveredWifiAsset>
	//   25   50:astore_1        
		if(((DiscoveredWifiAsset) (discoverytype)).discoveryVersion() > 1)
	//*  26   51:aload_1         
	//*  27   52:invokevirtual   #72  <Method int DiscoveredWifiAsset.discoveryVersion()>
	//*  28   55:iconst_1        
	//*  29   56:icmple          74
			BroadcastSetupActivity.a(a, AssetCapabilityUtils.isAwsEnabledAsset(((DiscoveredWifiAsset) (discoverytype)).assetInfo()));
	//   30   59:aload_0         
	//   31   60:getfield        #19  <Field BroadcastSetupActivity a>
	//   32   63:aload_1         
	//   33   64:invokevirtual   #73  <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
	//   34   67:invokestatic    #79  <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//   35   70:invokestatic    #82  <Method boolean BroadcastSetupActivity.a(BroadcastSetupActivity, boolean)>
	//   36   73:pop             
		obj = ((Object) (Assembler.getInstance()));
	//   37   74:invokestatic    #88  <Method Assembler Assembler.getInstance()>
	//   38   77:astore_3        
		if(!BroadcastSetupActivity.i(a) && !((Assembler) (obj)).isInitialized(((DiscoveredWifiAsset) (discoverytype)).assetInfo().getAssetId()))
	//*  39   78:aload_0         
	//*  40   79:getfield        #19  <Field BroadcastSetupActivity a>
	//*  41   82:invokestatic    #92  <Method boolean BroadcastSetupActivity.i(BroadcastSetupActivity)>
	//*  42   85:ifne            110
	//*  43   88:aload_3         
	//*  44   89:aload_1         
	//*  45   90:invokevirtual   #73  <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
	//*  46   93:invokevirtual   #57  <Method AssetId AssetInfo.getAssetId()>
	//*  47   96:invokevirtual   #96  <Method boolean Assembler.isInitialized(AssetId)>
	//*  48   99:ifne            110
			((Assembler) (obj)).initializeAsset(((DiscoveredWifiAsset) (discoverytype)).assetInfo());
	//   49  102:aload_3         
	//   50  103:aload_1         
	//   51  104:invokevirtual   #73  <Method AssetInfo DiscoveredWifiAsset.assetInfo()>
	//   52  107:invokevirtual   #100 <Method void Assembler.initializeAsset(AssetInfo)>
		BroadcastSetupActivity.a(a, discoveredasset.assetInfo());
	//   53  110:aload_0         
	//   54  111:getfield        #19  <Field BroadcastSetupActivity a>
	//   55  114:aload_2         
	//   56  115:invokevirtual   #51  <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   57  118:invokestatic    #103 <Method AssetInfo BroadcastSetupActivity.a(BroadcastSetupActivity, AssetInfo)>
	//   58  121:pop             
		BroadcastSetupActivity.j(a);
	//   59  122:aload_0         
	//   60  123:getfield        #19  <Field BroadcastSetupActivity a>
	//   61  126:invokestatic    #105 <Method void BroadcastSetupActivity.j(BroadcastSetupActivity)>
		(new Handler(Looper.getMainLooper())).post(new Runnable(((DiscoveredWifiAsset) (discoverytype)), discoveredasset) {

			public void run()
			{
				AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
			//    0    0:invokestatic    #35  <Method Assembler Assembler.getInstance()>
			//    1    3:invokevirtual   #39  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
			//    2    6:astore_1        
				AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
			//    3    7:invokestatic    #45  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
			//    4   10:astore_2        
				assetsetupuiservicedata.setProvisioningType(a.provisioningType());
			//    5   11:aload_2         
			//    6   12:aload_0         
			//    7   13:getfield        #22  <Field DiscoveredWifiAsset a>
			//    8   16:invokevirtual   #51  <Method com.irobot.core.ProvisioningType DiscoveredWifiAsset.provisioningType()>
			//    9   19:invokevirtual   #55  <Method void AssetSetupUIServiceData.setProvisioningType(com.irobot.core.ProvisioningType)>
				assetsetupuiservicedata.setDiscoveredAssetForProvisioning(b);
			//   10   22:aload_2         
			//   11   23:aload_0         
			//   12   24:getfield        #24  <Field DiscoveredAsset b>
			//   13   27:invokevirtual   #59  <Method void AssetSetupUIServiceData.setDiscoveredAssetForProvisioning(DiscoveredAsset)>
				assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.PrepareForProvisioning, assetsetupuiservicedata);
			//   14   30:aload_1         
			//   15   31:getstatic       #65  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.PrepareForProvisioning>
			//   16   34:aload_2         
			//   17   35:invokevirtual   #71  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
			//   18   38:return          
			}

			final DiscoveredWifiAsset a;
			final DiscoveredAsset b;
			final BroadcastSetupActivity._cls21 c;

			
			{
				c = BroadcastSetupActivity._cls21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field BroadcastSetupActivity$21 c>
				a = discoveredwifiasset;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field DiscoveredWifiAsset a>
				b = discoveredasset;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field DiscoveredAsset b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   62  129:new             #107 <Class Handler>
	//   63  132:dup             
	//   64  133:invokestatic    #113 <Method Looper Looper.getMainLooper()>
	//   65  136:invokespecial   #116 <Method void Handler(Looper)>
	//   66  139:new             #13  <Class BroadcastSetupActivity$21$1>
	//   67  142:dup             
	//   68  143:aload_0         
	//   69  144:aload_1         
	//   70  145:aload_2         
	//   71  146:invokespecial   #119 <Method void BroadcastSetupActivity$21$1(BroadcastSetupActivity$21, DiscoveredWifiAsset, DiscoveredAsset)>
	//   72  149:invokevirtual   #123 <Method boolean Handler.post(Runnable)>
	//   73  152:pop             
	//   74  153:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$21(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
