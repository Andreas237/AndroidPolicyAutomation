// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			MapPrivacyActivity

class MapPrivacyActivity$1 extends AssetNetworkUIServiceDataCallback
{

	public void onAssetNetworkUIServiceDataChanged(AssetNetworkUIServiceData assetnetworkuiservicedata)
	{
		Iterator iterator = assetnetworkuiservicedata.getDataStateChangelist().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method ArrayList AssetNetworkUIServiceData.getDataStateChangelist()>
	//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            70
			AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class AssetNetworkUIServiceDataState>
	//   10   26:astore_3        
			switch(MapPrivacyActivity$3.a[assetnetworkuiservicedatastate.ordinal()])
	//*  11   27:getstatic       #47  <Field int[] MapPrivacyActivity$3.a>
	//*  12   30:aload_3         
	//*  13   31:invokevirtual   #51  <Method int AssetNetworkUIServiceDataState.ordinal()>
	//*  14   34:iaload          
			{
	//*  15   35:tableswitch     1 2: default 56
	//	               1 59
	//	               2 59
	//*  16   56:goto            8
			case 1: // '\001'
			case 2: // '\002'
				a.a(assetnetworkuiservicedata);
	//   17   59:aload_0         
	//   18   60:getfield        #12  <Field MapPrivacyActivity a>
	//   19   63:aload_1         
	//   20   64:invokevirtual   #53  <Method void MapPrivacyActivity.a(AssetNetworkUIServiceData)>
				break;
			}
		} while(true);
	//*  21   67:goto            8
	//   22   70:return          
	}

	final MapPrivacyActivity a;

	MapPrivacyActivity$1(MapPrivacyActivity mapprivacyactivity)
	{
		a = mapprivacyactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MapPrivacyActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
	//    5    9:return          
	}
}
