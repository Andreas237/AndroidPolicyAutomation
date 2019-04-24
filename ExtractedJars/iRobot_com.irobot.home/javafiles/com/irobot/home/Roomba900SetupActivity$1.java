// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			Roomba900SetupActivity

class Roomba900SetupActivity$1 extends AssetSetupUIServiceDataCallback
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
	//    9   19:ifeq            212
			AssetSetupUIServiceViewState assetsetupuiserviceviewstate = (AssetSetupUIServiceViewState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class AssetSetupUIServiceViewState>
	//   13   31:astore_3        
			switch(Roomba900SetupActivity$3.a[assetsetupuiserviceviewstate.ordinal()])
	//*  14   32:getstatic       #47  <Field int[] Roomba900SetupActivity$3.a>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #51  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  17   39:iaload          
			{
	//*  18   40:tableswitch     1 7: default 84
	//	               1 198
	//	               2 187
	//	               3 177
	//	               4 163
	//	               5 153
	//	               6 139
	//	               7 129
			default:
				String s = Roomba900SetupActivity.f();
	//   19   84:invokestatic    #55  <Method String Roomba900SetupActivity.f()>
	//   20   87:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   21   89:new             #57  <Class StringBuilder>
	//   22   92:dup             
	//   23   93:invokespecial   #58  <Method void StringBuilder()>
	//   24   96:astore          5
				stringbuilder.append("Unhandled AssetSetupUIServiceViewState: ");
	//   25   98:aload           5
	//   26  100:ldc1            #60  <String "Unhandled AssetSetupUIServiceViewState: ">
	//   27  102:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   28  105:pop             
				stringbuilder.append(assetsetupuiserviceviewstate.name());
	//   29  106:aload           5
	//   30  108:aload_3         
	//   31  109:invokevirtual   #67  <Method String AssetSetupUIServiceViewState.name()>
	//   32  112:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   33  115:pop             
				o.e(s, stringbuilder.toString());
	//   34  116:aload           4
	//   35  118:aload           5
	//   36  120:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   37  123:invokestatic    #76  <Method void o.e(String, String)>
				break;

	//*  38  126:goto            13
			case 7: // '\007'
				Roomba900SetupActivity.d(a);
	//   39  129:aload_0         
	//   40  130:getfield        #12  <Field Roomba900SetupActivity a>
	//   41  133:invokestatic    #79  <Method void Roomba900SetupActivity.d(Roomba900SetupActivity)>
				break;

	//*  42  136:goto            13
			case 6: // '\006'
				Roomba900SetupActivity.a(a, assetsetupuiservicedata.getSelectedDiscoveryListItem());
	//   43  139:aload_0         
	//   44  140:getfield        #12  <Field Roomba900SetupActivity a>
	//   45  143:aload_1         
	//   46  144:invokevirtual   #83  <Method com.irobot.core.RobotDiscoveryListItem AssetSetupUIServiceData.getSelectedDiscoveryListItem()>
	//   47  147:invokestatic    #86  <Method void Roomba900SetupActivity.a(Roomba900SetupActivity, com.irobot.core.RobotDiscoveryListItem)>
				break;

	//*  48  150:goto            13
			case 5: // '\005'
				Roomba900SetupActivity.c(a);
	//   49  153:aload_0         
	//   50  154:getfield        #12  <Field Roomba900SetupActivity a>
	//   51  157:invokestatic    #89  <Method void Roomba900SetupActivity.c(Roomba900SetupActivity)>
				break;

	//*  52  160:goto            13
			case 4: // '\004'
				Roomba900SetupActivity.a(a, assetsetupuiservicedata.getDiscoveryListItems());
	//   53  163:aload_0         
	//   54  164:getfield        #12  <Field Roomba900SetupActivity a>
	//   55  167:aload_1         
	//   56  168:invokevirtual   #92  <Method ArrayList AssetSetupUIServiceData.getDiscoveryListItems()>
	//   57  171:invokestatic    #95  <Method void Roomba900SetupActivity.a(Roomba900SetupActivity, ArrayList)>
				break;

	//*  58  174:goto            13
			case 3: // '\003'
				Roomba900SetupActivity.b(a);
	//   59  177:aload_0         
	//   60  178:getfield        #12  <Field Roomba900SetupActivity a>
	//   61  181:invokestatic    #98  <Method void Roomba900SetupActivity.b(Roomba900SetupActivity)>
				break;

	//*  62  184:goto            13
			case 2: // '\002'
				Roomba900SetupActivity.a(a, 0);
	//   63  187:aload_0         
	//   64  188:getfield        #12  <Field Roomba900SetupActivity a>
	//   65  191:iconst_0        
	//   66  192:invokestatic    #101 <Method void Roomba900SetupActivity.a(Roomba900SetupActivity, int)>
				break;

	//*  67  195:goto            13
			case 1: // '\001'
				Roomba900SetupActivity.a(a, assetsetupuiservicedata.getDiscoveredAsset());
	//   68  198:aload_0         
	//   69  199:getfield        #12  <Field Roomba900SetupActivity a>
	//   70  202:aload_1         
	//   71  203:invokevirtual   #105 <Method com.irobot.core.DiscoveredAsset AssetSetupUIServiceData.getDiscoveredAsset()>
	//   72  206:invokestatic    #108 <Method void Roomba900SetupActivity.a(Roomba900SetupActivity, com.irobot.core.DiscoveredAsset)>
				break;
			}
		} while(true);
	//*  73  209:goto            13
	//   74  212:return          
	}

	final Roomba900SetupActivity a;

	Roomba900SetupActivity$1(Roomba900SetupActivity roomba900setupactivity)
	{
		a = roomba900setupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Roomba900SetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
	//    5    9:return          
	}
}
