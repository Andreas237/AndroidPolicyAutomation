// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			ShowLogcatActivity

class ShowLogcatActivity$2 extends AssetNetworkUIServiceDataCallback
{

	public void onAssetNetworkUIServiceDataChanged(AssetNetworkUIServiceData assetnetworkuiservicedata)
	{
		if(assetnetworkuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Iterator iterator = assetnetworkuiservicedata.getDataStateChangelist().iterator();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method ArrayList AssetNetworkUIServiceData.getDataStateChangelist()>
	//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    6   12:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   13:aload_2         
	//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            61
			AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class AssetNetworkUIServiceDataState>
	//   13   31:astore_3        
			if(ShowLogcatActivity$3.a[assetnetworkuiservicedatastate.ordinal()] == 1)
	//*  14   32:getstatic       #47  <Field int[] ShowLogcatActivity$3.a>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #51  <Method int AssetNetworkUIServiceDataState.ordinal()>
	//*  17   39:iaload          
	//*  18   40:iconst_1        
	//*  19   41:icmpeq          47
	//*  20   44:goto            13
				ShowLogcatActivity.a(a, assetnetworkuiservicedata.getWifiLogs());
	//   21   47:aload_0         
	//   22   48:getfield        #12  <Field ShowLogcatActivity a>
	//   23   51:aload_1         
	//   24   52:invokevirtual   #55  <Method com.irobot.core.AssetWifiLogEvent AssetNetworkUIServiceData.getWifiLogs()>
	//   25   55:invokestatic    #58  <Method void ShowLogcatActivity.a(ShowLogcatActivity, com.irobot.core.AssetWifiLogEvent)>
		} while(true);
	//   26   58:goto            13
	//   27   61:return          
	}

	final ShowLogcatActivity a;

	ShowLogcatActivity$2(ShowLogcatActivity showlogcatactivity)
	{
		a = showlogcatactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ShowLogcatActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
	//    5    9:return          
	}
}