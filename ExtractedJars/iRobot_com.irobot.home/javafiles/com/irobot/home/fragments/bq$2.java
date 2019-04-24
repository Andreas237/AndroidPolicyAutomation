// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			bq

class bq$2 extends AssetSetupUIServiceDataCallback
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
	//    6   12:astore          4
label0:
		do
		{
label1:
			{
label2:
				{
					if(!iterator.hasNext())
						break label0;
	//    7   14:aload           4
	//    8   16:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            197
					Object obj = ((Object) ((AssetSetupUIServiceViewState)iterator.next()));
	//   10   24:aload           4
	//   11   26:invokeinterface #40  <Method Object Iterator.next()>
	//   12   31:checkcast       #42  <Class AssetSetupUIServiceViewState>
	//   13   34:astore_3        
					boolean flag;
					switch(bq$3.a[((AssetSetupUIServiceViewState) (obj)).ordinal()])
	//*  14   35:getstatic       #47  <Field int[] bq$3.a>
	//*  15   38:aload_3         
	//*  16   39:invokevirtual   #51  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  17   42:iaload          
					{
	//*  18   43:tableswitch     1 6: default 80
	//	               1 183
	//	               2 169
	//	               3 154
	//	               4 144
	//	               5 130
	//	               6 120
					default:
						StringBuilder stringbuilder = new StringBuilder();
	//   19   80:new             #53  <Class StringBuilder>
	//   20   83:dup             
	//   21   84:invokespecial   #54  <Method void StringBuilder()>
	//   22   87:astore          5
						stringbuilder.append("Unhandled AssetSetupUIServiceViewState: ");
	//   23   89:aload           5
	//   24   91:ldc1            #56  <String "Unhandled AssetSetupUIServiceViewState: ">
	//   25   93:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   26   96:pop             
						stringbuilder.append(((AssetSetupUIServiceViewState) (obj)).name());
	//   27   97:aload           5
	//   28   99:aload_3         
	//   29  100:invokevirtual   #64  <Method String AssetSetupUIServiceViewState.name()>
	//   30  103:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   31  106:pop             
						o.e("PickABLERobot", stringbuilder.toString());
	//   32  107:ldc1            #66  <String "PickABLERobot">
	//   33  109:aload           5
	//   34  111:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   35  114:invokestatic    #75  <Method void o.e(String, String)>
						continue;
	//   36  117:goto            14

					case 1: // '\001'
						break label1;

					case 2: // '\002'
						break label2;

					case 6: // '\006'
						bq.a(a);
	//   37  120:aload_0         
	//   38  121:getfield        #12  <Field bq a>
	//   39  124:invokestatic    #77  <Method void bq.a(bq)>
						continue;
	//   40  127:goto            14

					case 5: // '\005'
						bq.a(a, assetsetupuiservicedata.discoveredAssetBeingProvisioned());
	//   41  130:aload_0         
	//   42  131:getfield        #12  <Field bq a>
	//   43  134:aload_1         
	//   44  135:invokevirtual   #81  <Method com.irobot.core.DiscoveredAsset AssetSetupUIServiceData.discoveredAssetBeingProvisioned()>
	//   45  138:invokestatic    #84  <Method void bq.a(bq, com.irobot.core.DiscoveredAsset)>
						continue;
	//   46  141:goto            14

					case 4: // '\004'
						obj = ((Object) (a));
	//   47  144:aload_0         
	//   48  145:getfield        #12  <Field bq a>
	//   49  148:astore_3        
						flag = false;
	//   50  149:iconst_0        
	//   51  150:istore_2        
						break;
	//   52  151:goto            161

					case 3: // '\003'
						obj = ((Object) (a));
	//   53  154:aload_0         
	//   54  155:getfield        #12  <Field bq a>
	//   55  158:astore_3        
						flag = true;
	//   56  159:iconst_1        
	//   57  160:istore_2        
						break;
					}
					bq.a(((bq) (obj)), flag);
	//   58  161:aload_3         
	//   59  162:iload_2         
	//   60  163:invokestatic    #87  <Method void bq.a(bq, boolean)>
					continue;
	//   61  166:goto            14
				}
				bq.a(a, assetsetupuiservicedata.getDiscoveredBleAssets());
	//   62  169:aload_0         
	//   63  170:getfield        #12  <Field bq a>
	//   64  173:aload_1         
	//   65  174:invokevirtual   #90  <Method ArrayList AssetSetupUIServiceData.getDiscoveredBleAssets()>
	//   66  177:invokestatic    #93  <Method void bq.a(bq, ArrayList)>
				continue;
	//   67  180:goto            14
			}
			bq.a(a, assetsetupuiservicedata.getDiscoveryState());
	//   68  183:aload_0         
	//   69  184:getfield        #12  <Field bq a>
	//   70  187:aload_1         
	//   71  188:invokevirtual   #97  <Method com.irobot.core.DiscoveryState AssetSetupUIServiceData.getDiscoveryState()>
	//   72  191:invokestatic    #100 <Method void bq.a(bq, com.irobot.core.DiscoveryState)>
		} while(true);
	//   73  194:goto            14
	//   74  197:return          
	}

	final bq a;

	bq$2(bq bq1)
	{
		a = bq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bq a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
	//    5    9:return          
	}
}
