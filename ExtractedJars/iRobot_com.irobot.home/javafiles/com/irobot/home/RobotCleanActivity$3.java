// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

class RobotCleanActivity$3 extends AssetNetworkUIServiceDataCallback
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
label0:
		do
		{
			if(iterator.hasNext())
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            85
			{
				AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class AssetNetworkUIServiceDataState>
	//   13   31:astore_3        
				switch(RobotCleanActivity$4.d[assetnetworkuiservicedatastate.ordinal()])
	//*  14   32:getstatic       #48  <Field int[] RobotCleanActivity$4.d>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #52  <Method int AssetNetworkUIServiceDataState.ordinal()>
	//*  17   39:iaload          
				{
	//*  18   40:tableswitch     1 2: default 64
	//	               1 67
	//	               2 67
	//*  19   64:goto            13
				case 1: // '\001'
				case 2: // '\002'
					RobotCleanActivity.a(a, assetnetworkuiservicedata.getConnectionStateForLocal(), assetnetworkuiservicedata.getConnectionStateForRemote());
	//   20   67:aload_0         
	//   21   68:getfield        #12  <Field RobotCleanActivity a>
	//   22   71:aload_1         
	//   23   72:invokevirtual   #56  <Method com.irobot.core.NetworkState AssetNetworkUIServiceData.getConnectionStateForLocal()>
	//   24   75:aload_1         
	//   25   76:invokevirtual   #59  <Method com.irobot.core.NetworkState AssetNetworkUIServiceData.getConnectionStateForRemote()>
	//   26   79:invokestatic    #62  <Method void RobotCleanActivity.a(RobotCleanActivity, com.irobot.core.NetworkState, com.irobot.core.NetworkState)>
					break;
				}
				continue;
	//   27   82:goto            13
			}
			iterator = assetnetworkuiservicedata.getViewStateChangelist().iterator();
	//   28   85:aload_1         
	//   29   86:invokevirtual   #65  <Method ArrayList AssetNetworkUIServiceData.getViewStateChangelist()>
	//   30   89:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//   31   92:astore_2        
			do
			{
				AssetNetworkUIServiceViewState assetnetworkuiserviceviewstate;
				do
				{
					if(!iterator.hasNext())
						break label0;
	//   32   93:aload_2         
	//   33   94:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//   34   99:ifeq            141
					assetnetworkuiserviceviewstate = (AssetNetworkUIServiceViewState)iterator.next();
	//   35  102:aload_2         
	//   36  103:invokeinterface #40  <Method Object Iterator.next()>
	//   37  108:checkcast       #67  <Class AssetNetworkUIServiceViewState>
	//   38  111:astore_3        
				} while(RobotCleanActivity$4.e[assetnetworkuiserviceviewstate.ordinal()] != 1);
	//   39  112:getstatic       #70  <Field int[] RobotCleanActivity$4.e>
	//   40  115:aload_3         
	//   41  116:invokevirtual   #71  <Method int AssetNetworkUIServiceViewState.ordinal()>
	//   42  119:iaload          
	//   43  120:iconst_1        
	//   44  121:icmpeq          127
	//*  45  124:goto            93
				RobotCleanActivity.a(a, assetnetworkuiservicedata.getCurrentConnectionEvent());
	//   46  127:aload_0         
	//   47  128:getfield        #12  <Field RobotCleanActivity a>
	//   48  131:aload_1         
	//   49  132:invokevirtual   #75  <Method com.irobot.core.CurrentConnectionStateEvent AssetNetworkUIServiceData.getCurrentConnectionEvent()>
	//   50  135:invokestatic    #78  <Method void RobotCleanActivity.a(RobotCleanActivity, com.irobot.core.CurrentConnectionStateEvent)>
			} while(true);
	//   51  138:goto            93
		} while(true);
	//   52  141:return          
	}

	final RobotCleanActivity a;

	RobotCleanActivity$3(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
	//    5    9:return          
	}
}
