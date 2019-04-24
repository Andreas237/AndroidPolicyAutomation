// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$3 extends AssetSetupUIServiceDataCallback
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
	//    9   19:ifeq            238
			AssetSetupUIServiceViewState assetsetupuiserviceviewstate = (AssetSetupUIServiceViewState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class AssetSetupUIServiceViewState>
	//   13   31:astore_3        
			switch(.b[assetsetupuiserviceviewstate.ordinal()])
	//*  14   32:getstatic       #48  <Field int[] BroadcastSetupActivity$18.b>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #52  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  17   39:iaload          
			{
	//*  18   40:tableswitch     1 8: default 88
	//	               1 224
	//	               2 210
	//	               3 196
	//	               4 182
	//	               5 168
	//	               6 154
	//	               7 140
	//	               8 91
	//*  19   88:goto            13
			case 8: // '\b'
				String s = a.w;
	//   20   91:aload_0         
	//   21   92:getfield        #12  <Field BroadcastSetupActivity a>
	//   22   95:getfield        #56  <Field String BroadcastSetupActivity.w>
	//   23   98:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   24  100:new             #58  <Class StringBuilder>
	//   25  103:dup             
	//   26  104:invokespecial   #59  <Method void StringBuilder()>
	//   27  107:astore          5
				stringbuilder.append("Unknown state received from AssertSetupUIService ");
	//   28  109:aload           5
	//   29  111:ldc1            #61  <String "Unknown state received from AssertSetupUIService ">
	//   30  113:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   31  116:pop             
				stringbuilder.append(assetsetupuiserviceviewstate.name());
	//   32  117:aload           5
	//   33  119:aload_3         
	//   34  120:invokevirtual   #69  <Method String AssetSetupUIServiceViewState.name()>
	//   35  123:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   36  126:pop             
				o.e(s, stringbuilder.toString());
	//   37  127:aload           4
	//   38  129:aload           5
	//   39  131:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   40  134:invokestatic    #78  <Method void o.e(String, String)>
				break;

	//*  41  137:goto            13
			case 7: // '\007'
				BroadcastSetupActivity.a(a, assetsetupuiservicedata.getProvisioningTypeToTransitionTo());
	//   42  140:aload_0         
	//   43  141:getfield        #12  <Field BroadcastSetupActivity a>
	//   44  144:aload_1         
	//   45  145:invokevirtual   #82  <Method com.irobot.core.ProvisioningType AssetSetupUIServiceData.getProvisioningTypeToTransitionTo()>
	//   46  148:invokestatic    #85  <Method void BroadcastSetupActivity.a(BroadcastSetupActivity, com.irobot.core.ProvisioningType)>
				break;

	//*  47  151:goto            13
			case 6: // '\006'
				BroadcastSetupActivity.a(a, assetsetupuiservicedata.getAssetDiscoveredOnHomeNetwork());
	//   48  154:aload_0         
	//   49  155:getfield        #12  <Field BroadcastSetupActivity a>
	//   50  158:aload_1         
	//   51  159:invokevirtual   #89  <Method com.irobot.core.DiscoveredWifiAsset AssetSetupUIServiceData.getAssetDiscoveredOnHomeNetwork()>
	//   52  162:invokestatic    #92  <Method void BroadcastSetupActivity.a(BroadcastSetupActivity, com.irobot.core.DiscoveredWifiAsset)>
				break;

	//*  53  165:goto            13
			case 5: // '\005'
				BroadcastSetupActivity.a(a, assetsetupuiservicedata.getWifiProvisioningError());
	//   54  168:aload_0         
	//   55  169:getfield        #12  <Field BroadcastSetupActivity a>
	//   56  172:aload_1         
	//   57  173:invokevirtual   #96  <Method com.irobot.core.Error AssetSetupUIServiceData.getWifiProvisioningError()>
	//   58  176:invokestatic    #99  <Method void BroadcastSetupActivity.a(BroadcastSetupActivity, com.irobot.core.Error)>
				break;

	//*  59  179:goto            13
			case 4: // '\004'
				BroadcastSetupActivity.c(a, assetsetupuiservicedata.getHomeWifiSsid());
	//   60  182:aload_0         
	//   61  183:getfield        #12  <Field BroadcastSetupActivity a>
	//   62  186:aload_1         
	//   63  187:invokevirtual   #102 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
	//   64  190:invokestatic    #106 <Method void BroadcastSetupActivity.c(BroadcastSetupActivity, String)>
				break;

	//*  65  193:goto            13
			case 3: // '\003'
				BroadcastSetupActivity.b(a, assetsetupuiservicedata.getHomeWifiSsid());
	//   66  196:aload_0         
	//   67  197:getfield        #12  <Field BroadcastSetupActivity a>
	//   68  200:aload_1         
	//   69  201:invokevirtual   #102 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
	//   70  204:invokestatic    #108 <Method void BroadcastSetupActivity.b(BroadcastSetupActivity, String)>
				break;

	//*  71  207:goto            13
			case 2: // '\002'
				BroadcastSetupActivity.a(a, assetsetupuiservicedata.getSoftApSsid());
	//   72  210:aload_0         
	//   73  211:getfield        #12  <Field BroadcastSetupActivity a>
	//   74  214:aload_1         
	//   75  215:invokevirtual   #111 <Method String AssetSetupUIServiceData.getSoftApSsid()>
	//   76  218:invokestatic    #113 <Method void BroadcastSetupActivity.a(BroadcastSetupActivity, String)>
				break;

	//*  77  221:goto            13
			case 1: // '\001'
				BroadcastSetupActivity.a(a, assetsetupuiservicedata.getCurrentProvisioningStatus());
	//   78  224:aload_0         
	//   79  225:getfield        #12  <Field BroadcastSetupActivity a>
	//   80  228:aload_1         
	//   81  229:invokevirtual   #117 <Method com.irobot.core.WifiProvisioningStatus AssetSetupUIServiceData.getCurrentProvisioningStatus()>
	//   82  232:invokestatic    #120 <Method void BroadcastSetupActivity.a(BroadcastSetupActivity, com.irobot.core.WifiProvisioningStatus)>
				break;
			}
		} while(true);
	//*  83  235:goto            13
	//   84  238:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$3(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
	//    5    9:return          
	}
}
