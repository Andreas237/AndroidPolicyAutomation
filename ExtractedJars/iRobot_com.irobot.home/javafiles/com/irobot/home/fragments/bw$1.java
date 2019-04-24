// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			bw

class bw$1 extends AssetSetupUIServiceDataCallback
{

	public void onAssetSetupUIServiceDataChanged(AssetSetupUIServiceData assetsetupuiservicedata)
	{
		if(assetsetupuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Iterator iterator = assetsetupuiservicedata.getViewStateChangelist().iterator();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method ArrayList AssetSetupUIServiceData.getViewStateChangelist()>
	//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    6   12:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   13:aload_2         
	//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            229
			AssetSetupUIServiceViewState assetsetupuiserviceviewstate = (AssetSetupUIServiceViewState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class AssetSetupUIServiceViewState>
	//   13   31:astore_3        
			switch(bw$2.b[assetsetupuiserviceviewstate.ordinal()])
	//*  14   32:getstatic       #48  <Field int[] bw$2.b>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #52  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  17   39:iaload          
			{
	//*  18   40:tableswitch     1 8: default 88
	//	               1 215
	//	               2 201
	//	               3 187
	//	               4 173
	//	               5 159
	//	               6 145
	//	               7 131
	//	               8 91
	//*  19   88:goto            13
			case 8: // '\b'
				StringBuilder stringbuilder = new StringBuilder();
	//   20   91:new             #54  <Class StringBuilder>
	//   21   94:dup             
	//   22   95:invokespecial   #55  <Method void StringBuilder()>
	//   23   98:astore          4
				stringbuilder.append("Unknown state received from AssertSetupUIService: ");
	//   24  100:aload           4
	//   25  102:ldc1            #57  <String "Unknown state received from AssertSetupUIService: ">
	//   26  104:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   27  107:pop             
				stringbuilder.append(assetsetupuiserviceviewstate.name());
	//   28  108:aload           4
	//   29  110:aload_3         
	//   30  111:invokevirtual   #65  <Method String AssetSetupUIServiceViewState.name()>
	//   31  114:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   32  117:pop             
				o.e("SetupRV2NetworkFragment", stringbuilder.toString());
	//   33  118:ldc1            #67  <String "SetupRV2NetworkFragment">
	//   34  120:aload           4
	//   35  122:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   36  125:invokestatic    #76  <Method void o.e(String, String)>
				break;

	//*  37  128:goto            13
			case 7: // '\007'
				bw.a(a, assetsetupuiservicedata.getProvisioningTypeToTransitionTo());
	//   38  131:aload_0         
	//   39  132:getfield        #12  <Field bw a>
	//   40  135:aload_1         
	//   41  136:invokevirtual   #80  <Method com.irobot.core.ProvisioningType AssetSetupUIServiceData.getProvisioningTypeToTransitionTo()>
	//   42  139:invokestatic    #83  <Method void bw.a(bw, com.irobot.core.ProvisioningType)>
				break;

	//*  43  142:goto            13
			case 6: // '\006'
				bw.a(a, assetsetupuiservicedata.getAssetDiscoveredOnHomeNetwork());
	//   44  145:aload_0         
	//   45  146:getfield        #12  <Field bw a>
	//   46  149:aload_1         
	//   47  150:invokevirtual   #87  <Method com.irobot.core.DiscoveredWifiAsset AssetSetupUIServiceData.getAssetDiscoveredOnHomeNetwork()>
	//   48  153:invokestatic    #90  <Method void bw.a(bw, com.irobot.core.DiscoveredWifiAsset)>
				break;

	//*  49  156:goto            13
			case 5: // '\005'
				bw.a(a, assetsetupuiservicedata.getWifiProvisioningError());
	//   50  159:aload_0         
	//   51  160:getfield        #12  <Field bw a>
	//   52  163:aload_1         
	//   53  164:invokevirtual   #94  <Method com.irobot.core.Error AssetSetupUIServiceData.getWifiProvisioningError()>
	//   54  167:invokestatic    #97  <Method void bw.a(bw, com.irobot.core.Error)>
				break;

	//*  55  170:goto            13
			case 4: // '\004'
				bw.c(a, assetsetupuiservicedata.getHomeWifiSsid());
	//   56  173:aload_0         
	//   57  174:getfield        #12  <Field bw a>
	//   58  177:aload_1         
	//   59  178:invokevirtual   #100 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
	//   60  181:invokestatic    #104 <Method void bw.c(bw, String)>
				break;

	//*  61  184:goto            13
			case 3: // '\003'
				bw.b(a, assetsetupuiservicedata.getHomeWifiSsid());
	//   62  187:aload_0         
	//   63  188:getfield        #12  <Field bw a>
	//   64  191:aload_1         
	//   65  192:invokevirtual   #100 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
	//   66  195:invokestatic    #106 <Method void bw.b(bw, String)>
				break;

	//*  67  198:goto            13
			case 2: // '\002'
				bw.a(a, assetsetupuiservicedata.getSoftApSsid());
	//   68  201:aload_0         
	//   69  202:getfield        #12  <Field bw a>
	//   70  205:aload_1         
	//   71  206:invokevirtual   #109 <Method String AssetSetupUIServiceData.getSoftApSsid()>
	//   72  209:invokestatic    #111 <Method void bw.a(bw, String)>
				break;

	//*  73  212:goto            13
			case 1: // '\001'
				bw.a(a, assetsetupuiservicedata.getCurrentProvisioningStatus());
	//   74  215:aload_0         
	//   75  216:getfield        #12  <Field bw a>
	//   76  219:aload_1         
	//   77  220:invokevirtual   #115 <Method com.irobot.core.WifiProvisioningStatus AssetSetupUIServiceData.getCurrentProvisioningStatus()>
	//   78  223:invokestatic    #118 <Method void bw.a(bw, com.irobot.core.WifiProvisioningStatus)>
				break;
			}
		} while(true);
	//*  79  226:goto            13
	//   80  229:return          
	}

	final bw a;

	bw$1(bw bw1)
	{
		a = bw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bw a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
	//    5    9:return          
	}
}
