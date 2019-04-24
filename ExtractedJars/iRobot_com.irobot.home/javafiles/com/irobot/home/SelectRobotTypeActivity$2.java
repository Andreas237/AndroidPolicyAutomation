// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			SelectRobotTypeActivity

class SelectRobotTypeActivity$2 extends AssetSetupUIServiceDataCallback
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
	//    9   19:ifeq            155
			AssetSetupUIServiceViewState assetsetupuiserviceviewstate = (AssetSetupUIServiceViewState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class AssetSetupUIServiceViewState>
	//   13   31:astore_3        
			switch(SelectRobotTypeActivity$3.b[assetsetupuiserviceviewstate.ordinal()])
	//*  14   32:getstatic       #48  <Field int[] SelectRobotTypeActivity$3.b>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #52  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  17   39:iaload          
			{
	//*  18   40:tableswitch     1 3: default 68
	//	               1 141
	//	               2 127
	//	               3 113
			default:
				String s = SelectRobotTypeActivity.h();
	//   19   68:invokestatic    #56  <Method String SelectRobotTypeActivity.h()>
	//   20   71:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   21   73:new             #58  <Class StringBuilder>
	//   22   76:dup             
	//   23   77:invokespecial   #59  <Method void StringBuilder()>
	//   24   80:astore          5
				stringbuilder.append("Unhandled viewState: ");
	//   25   82:aload           5
	//   26   84:ldc1            #61  <String "Unhandled viewState: ">
	//   27   86:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   28   89:pop             
				stringbuilder.append(assetsetupuiserviceviewstate.name());
	//   29   90:aload           5
	//   30   92:aload_3         
	//   31   93:invokevirtual   #68  <Method String AssetSetupUIServiceViewState.name()>
	//   32   96:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   33   99:pop             
				o.e(s, stringbuilder.toString());
	//   34  100:aload           4
	//   35  102:aload           5
	//   36  104:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   37  107:invokestatic    #77  <Method void o.e(String, String)>
				break;

	//*  38  110:goto            13
			case 3: // '\003'
				SelectRobotTypeActivity.b(a, assetsetupuiservicedata.getDiscoveredBleAssets());
	//   39  113:aload_0         
	//   40  114:getfield        #12  <Field SelectRobotTypeActivity a>
	//   41  117:aload_1         
	//   42  118:invokevirtual   #80  <Method ArrayList AssetSetupUIServiceData.getDiscoveredBleAssets()>
	//   43  121:invokestatic    #83  <Method void SelectRobotTypeActivity.b(SelectRobotTypeActivity, ArrayList)>
				break;

	//*  44  124:goto            13
			case 2: // '\002'
				SelectRobotTypeActivity.a(a, assetsetupuiservicedata.getDiscoveredWifiAssets());
	//   45  127:aload_0         
	//   46  128:getfield        #12  <Field SelectRobotTypeActivity a>
	//   47  131:aload_1         
	//   48  132:invokevirtual   #86  <Method ArrayList AssetSetupUIServiceData.getDiscoveredWifiAssets()>
	//   49  135:invokestatic    #88  <Method void SelectRobotTypeActivity.a(SelectRobotTypeActivity, ArrayList)>
				break;

	//*  50  138:goto            13
			case 1: // '\001'
				SelectRobotTypeActivity.a(a, assetsetupuiservicedata.getDiscoveryState());
	//   51  141:aload_0         
	//   52  142:getfield        #12  <Field SelectRobotTypeActivity a>
	//   53  145:aload_1         
	//   54  146:invokevirtual   #92  <Method com.irobot.core.DiscoveryState AssetSetupUIServiceData.getDiscoveryState()>
	//   55  149:invokestatic    #95  <Method void SelectRobotTypeActivity.a(SelectRobotTypeActivity, com.irobot.core.DiscoveryState)>
				break;
			}
		} while(true);
	//*  56  152:goto            13
	//   57  155:return          
	}

	final SelectRobotTypeActivity a;

	SelectRobotTypeActivity$2(SelectRobotTypeActivity selectrobottypeactivity)
	{
		a = selectrobottypeactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field SelectRobotTypeActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
	//    5    9:return          
	}
}
