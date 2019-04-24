// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.irobot.core.AccountService;
import com.irobot.core.AddRobotSelection;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetImageLocation;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetSetupUIService;
import com.irobot.core.AssetSetupUIServiceCommand;
import com.irobot.core.AssetSetupUIServiceData;
import com.irobot.core.AssetSetupUIServiceDataCallback;
import com.irobot.core.AssetSetupUIServiceViewState;
import com.irobot.core.DiscoveredAsset;
import com.irobot.core.DiscoveredWifiAsset;
import com.irobot.core.DiscoveryState;
import com.irobot.core.DiscoveryType;
import com.irobot.core.NetworkAddress;
import com.irobot.core.SkuType;
import com.irobot.core.SkuUtils;
import com.irobot.home.b.ad;
import com.irobot.home.g.d;
import com.irobot.home.g.e;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.RobotTypeListDiscoveredItem;
import com.irobot.home.model.RobotTypeListItem;
import com.irobot.home.model.m;
import com.irobot.home.model.rest.TermsInfo;
import com.irobot.home.model.v;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.BluetoothStateReceiver;
import com.irobot.home.util.c;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import com.irobot.home.util.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import junit.b.a;

// Referenced classes of package com.irobot.home:
//			BaseListActivity, RoombaAddRobotSetupActivity_, BraavaSetupActivity_, BroadcastSetupActivity_, 
//			AccountLoginActivity_, IRobotApplication, AccountOverviewActivity_, LegalTermsActivity_

public class SelectRobotTypeActivity extends BaseListActivity
	implements android.widget.AdapterView.OnItemClickListener, e, com.irobot.home.p.a.a, com.irobot.home.util.BluetoothStateReceiver.a
{

	public SelectRobotTypeActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void BaseListActivity()>
		n = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #87  <Field int n>
		y = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #89  <Field AlertDialog y>
		B = ((AssetSetupUIServiceDataCallback) (new AssetSetupUIServiceDataCallback() {

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
					static class _cls3
					{

						static final int a[];
						static final int b[];

						static 
						{
							b = new int[AssetSetupUIServiceViewState.values().length];
						//    0    0:invokestatic    #19  <Method AssetSetupUIServiceViewState[] AssetSetupUIServiceViewState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #21  <Field int[] b>
							try
							{
								b[AssetSetupUIServiceViewState.DiscoveryStateChanged.ordinal()] = 1;
						//    4    9:getstatic       #21  <Field int[] b>
						//    5   12:getstatic       #25  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.DiscoveryStateChanged>
						//    6   15:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #21  <Field int[] b>
						//*  10   23:getstatic       #32  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.DiscoveredWifiAssetsListUpdated>
						//*  11   26:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #21  <Field int[] b>
						//*  15   34:getstatic       #35  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.DiscoveredBleAssetsListUpdated>
						//*  16   37:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:invokestatic    #40  <Method SkuType[] SkuType.values()>
						//*  20   45:arraylength     
						//*  21   46:newarray        int[]
						//*  22   48:putstatic       #42  <Field int[] a>
						//*  23   51:getstatic       #42  <Field int[] a>
						//*  24   54:getstatic       #46  <Field SkuType SkuType.Series900>
						//*  25   57:invokevirtual   #47  <Method int SkuType.ordinal()>
						//*  26   60:iconst_1        
						//*  27   61:iastore         
						//*  28   62:getstatic       #42  <Field int[] a>
						//*  29   65:getstatic       #50  <Field SkuType SkuType.Soho>
						//*  30   68:invokevirtual   #47  <Method int SkuType.ordinal()>
						//*  31   71:iconst_2        
						//*  32   72:iastore         
						//*  33   73:getstatic       #42  <Field int[] a>
						//*  34   76:getstatic       #53  <Field SkuType SkuType.SanMarino>
						//*  35   79:invokevirtual   #47  <Method int SkuType.ordinal()>
						//*  36   82:iconst_3        
						//*  37   83:iastore         
						//*  38   84:getstatic       #42  <Field int[] a>
						//*  39   87:getstatic       #56  <Field SkuType SkuType.Altadena>
						//*  40   90:invokevirtual   #47  <Method int SkuType.ordinal()>
						//*  41   93:iconst_4        
						//*  42   94:iastore         
						//*  43   95:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   44   96:astore_0        
							try
							{
								b[AssetSetupUIServiceViewState.DiscoveredWifiAssetsListUpdated.ordinal()] = 2;
							}
						//*  45   97:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   46  100:astore_0        
							try
							{
								b[AssetSetupUIServiceViewState.DiscoveredBleAssetsListUpdated.ordinal()] = 3;
							}
						//*  47  101:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   48  104:astore_0        
							a = new int[SkuType.values().length];
							try
							{
								a[SkuType.Series900.ordinal()] = 1;
							}
						//*  49  105:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   50  108:astore_0        
							try
							{
								a[SkuType.Soho.ordinal()] = 2;
							}
						//*  51  109:goto            62
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   52  112:astore_0        
							try
							{
								a[SkuType.SanMarino.ordinal()] = 3;
							}
						//*  53  113:goto            73
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   54  116:astore_0        
							try
							{
								a[SkuType.Altadena.ordinal()] = 4;
							}
						//*  55  117:goto            84
							catch(NoSuchFieldError nosuchfielderror6) { }
						//   56  120:astore_0        
						//*  57  121:return          
						}
					}

					switch(_cls3.b[assetsetupuiserviceviewstate.ordinal()])
			//*  14   32:getstatic       #48  <Field int[] SelectRobotTypeActivity$3.b>
			//*  15   35:aload_3         
			//*  16   36:invokevirtual   #52  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  17   39:iaload          
					{
			//*  18   40:tableswitch     1 3: default 68
			//			               1 141
			//			               2 127
			//			               3 113
					default:
						String s1 = SelectRobotTypeActivity.h();
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
						com.irobot.home.util.o.e(s1, stringbuilder.toString());
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
						com.irobot.home.SelectRobotTypeActivity.a(a, assetsetupuiservicedata.getDiscoveredWifiAssets());
			//   45  127:aload_0         
			//   46  128:getfield        #12  <Field SelectRobotTypeActivity a>
			//   47  131:aload_1         
			//   48  132:invokevirtual   #86  <Method ArrayList AssetSetupUIServiceData.getDiscoveredWifiAssets()>
			//   49  135:invokestatic    #88  <Method void com.irobot.home.SelectRobotTypeActivity.a(SelectRobotTypeActivity, ArrayList)>
						break;

			//*  50  138:goto            13
					case 1: // '\001'
						com.irobot.home.SelectRobotTypeActivity.a(a, assetsetupuiservicedata.getDiscoveryState());
			//   51  141:aload_0         
			//   52  142:getfield        #12  <Field SelectRobotTypeActivity a>
			//   53  145:aload_1         
			//   54  146:invokevirtual   #92  <Method DiscoveryState AssetSetupUIServiceData.getDiscoveryState()>
			//   55  149:invokestatic    #95  <Method void com.irobot.home.SelectRobotTypeActivity.a(SelectRobotTypeActivity, DiscoveryState)>
						break;
					}
				} while(true);
			//*  56  152:goto            13
			//   57  155:return          
			}

			final SelectRobotTypeActivity a;

			
			{
				a = SelectRobotTypeActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SelectRobotTypeActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    8   14:aload_0         
	//    9   15:new             #16  <Class SelectRobotTypeActivity$2>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #92  <Method void SelectRobotTypeActivity$2(SelectRobotTypeActivity)>
	//   13   23:putfield        #94  <Field AssetSetupUIServiceDataCallback B>
	//   14   26:return          
	}

	private void a(DiscoveredAsset discoveredasset)
	{
		AnalyticsSubsystem.getInstance().trackProvAddRobotSelected(AddRobotSelection.Roomba);
	//    0    0:invokestatic    #102 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:getstatic       #108 <Field AddRobotSelection AddRobotSelection.Roomba>
	//    2    6:invokevirtual   #112 <Method void AnalyticsSubsystem.trackProvAddRobotSelected(AddRobotSelection)>
		junit.b.a.a("RobotDiscoveryListItem expected to contain DiscoveredWifiAsset object", discoveredasset instanceof DiscoveredWifiAsset);
	//    3    9:ldc1            #114 <String "RobotDiscoveryListItem expected to contain DiscoveredWifiAsset object">
	//    4   11:aload_1         
	//    5   12:instanceof      #116 <Class DiscoveredWifiAsset>
	//    6   15:invokestatic    #121 <Method void a.a(String, boolean)>
		discoveredasset.assetInfo();
	//    7   18:aload_1         
	//    8   19:invokevirtual   #127 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//    9   22:pop             
		com.irobot.home.RoombaAddRobotSetupActivity_.a(((android.content.Context) (this))).a(discoveredasset.assetInfo().asJson()).b(((DiscoveredWifiAsset)discoveredasset).networkAddress().host()).a(1);
	//   10   23:aload_0         
	//   11   24:invokestatic    #132 <Method RoombaAddRobotSetupActivity_$a com.irobot.home.RoombaAddRobotSetupActivity_.a(android.content.Context)>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #127 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   14   31:invokevirtual   #137 <Method String AssetInfo.asJson()>
	//   15   34:invokevirtual   #142 <Method RoombaAddRobotSetupActivity_$a com.irobot.home.RoombaAddRobotSetupActivity_$a.a(String)>
	//   16   37:aload_1         
	//   17   38:checkcast       #116 <Class DiscoveredWifiAsset>
	//   18   41:invokevirtual   #146 <Method NetworkAddress DiscoveredWifiAsset.networkAddress()>
	//   19   44:invokevirtual   #151 <Method String NetworkAddress.host()>
	//   20   47:invokevirtual   #154 <Method RoombaAddRobotSetupActivity_$a RoombaAddRobotSetupActivity_$a.b(String)>
	//   21   50:iconst_1        
	//   22   51:invokevirtual   #157 <Method org.androidannotations.api.a.e com.irobot.home.RoombaAddRobotSetupActivity_$a.a(int)>
	//   23   54:pop             
	//   24   55:return          
	}

	private void a(DiscoveryState discoverystate)
	{
	//    0    0:return          
	}

	private void a(SkuType skutype)
	{
		AddRobotSelection addrobotselection;
		switch(com.irobot.home._cls3.a[skutype.ordinal()])
	//*   0    0:getstatic       #162 <Field int[] com.irobot.home.SelectRobotTypeActivity$3.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #168 <Method int SkuType.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     3 4: default 32
	//	               3 46
	//	               4 39
		default:
			addrobotselection = AddRobotSelection.Roomba;
	//    5   32:getstatic       #108 <Field AddRobotSelection AddRobotSelection.Roomba>
	//    6   35:astore_2        
			break;

	//*   7   36:goto            50
		case 4: // '\004'
			addrobotselection = AddRobotSelection.BraavaJet;
	//    8   39:getstatic       #171 <Field AddRobotSelection AddRobotSelection.BraavaJet>
	//    9   42:astore_2        
			break;

	//*  10   43:goto            50
		case 3: // '\003'
			addrobotselection = AddRobotSelection.BraavaJetM;
	//   11   46:getstatic       #174 <Field AddRobotSelection AddRobotSelection.BraavaJetM>
	//   12   49:astore_2        
			break;
		}
		AnalyticsSubsystem.getInstance().trackProvAddRobotSelected(addrobotselection);
	//   13   50:invokestatic    #102 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   14   53:aload_2         
	//   15   54:invokevirtual   #112 <Method void AnalyticsSubsystem.trackProvAddRobotSelected(AddRobotSelection)>
		if(skutype == SkuType.Altadena)
	//*  16   57:aload_1         
	//*  17   58:getstatic       #178 <Field SkuType SkuType.Altadena>
	//*  18   61:if_acmpne       79
		{
			startActivity(new Intent(((android.content.Context) (this)), com/irobot/home/BraavaSetupActivity_));
	//   19   64:aload_0         
	//   20   65:new             #180 <Class Intent>
	//   21   68:dup             
	//   22   69:aload_0         
	//   23   70:ldc1            #182 <Class BraavaSetupActivity_>
	//   24   72:invokespecial   #185 <Method void Intent(android.content.Context, Class)>
	//   25   75:invokevirtual   #189 <Method void startActivity(Intent)>
			return;
	//   26   78:return          
		} else
		{
			com.irobot.home.BroadcastSetupActivity_.a(((android.content.Context) (this))).a(true).a();
	//   27   79:aload_0         
	//   28   80:invokestatic    #194 <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_.a(android.content.Context)>
	//   29   83:iconst_1        
	//   30   84:invokevirtual   #199 <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_$a.a(boolean)>
	//   31   87:invokevirtual   #202 <Method org.androidannotations.api.a.e com.irobot.home.BroadcastSetupActivity_$a.a()>
	//   32   90:pop             
			return;
	//   33   91:return          
		}
	}

	static void a(SelectRobotTypeActivity selectrobottypeactivity, DiscoveryState discoverystate)
	{
		selectrobottypeactivity.a(discoverystate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method void a(DiscoveryState)>
	//    3    5:return          
	}

	static void a(SelectRobotTypeActivity selectrobottypeactivity, ArrayList arraylist)
	{
		selectrobottypeactivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void a(ArrayList)>
	//    3    5:return          
	}

	private void a(ArrayList arraylist)
	{
		j = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #211 <Field ArrayList j>
		a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #213 <Method void a()>
	//    5    9:return          
	}

	private void a(boolean flag)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #218 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void HashSet()>
	//    3    7:astore_2        
		hashset.add(((Object) (DiscoveryType.Wifi)));
	//    4    8:aload_2         
	//    5    9:getstatic       #225 <Field DiscoveryType DiscoveryType.Wifi>
	//    6   12:invokevirtual   #229 <Method boolean HashSet.add(Object)>
	//    7   15:pop             
		if(flag)
	//*   8   16:iload_1         
	//*   9   17:ifeq            28
			hashset.add(((Object) (DiscoveryType.Ble)));
	//   10   20:aload_2         
	//   11   21:getstatic       #232 <Field DiscoveryType DiscoveryType.Ble>
	//   12   24:invokevirtual   #229 <Method boolean HashSet.add(Object)>
	//   13   27:pop             
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//   14   28:invokestatic    #237 <Method Assembler Assembler.getInstance()>
	//   15   31:invokevirtual   #241 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   16   34:astore_3        
		assetsetupuiservice.registerUISubscriber(B);
	//   17   35:aload_3         
	//   18   36:aload_0         
	//   19   37:getfield        #94  <Field AssetSetupUIServiceDataCallback B>
	//   20   40:invokevirtual   #247 <Method boolean AssetSetupUIService.registerUISubscriber(AssetSetupUIServiceDataCallback)>
	//   21   43:pop             
		AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//   22   44:invokestatic    #253 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   23   47:astore          4
		assetsetupuiservicedata.setDiscoveryTypesForSelectRobotPresentationStart(hashset);
	//   24   49:aload           4
	//   25   51:aload_2         
	//   26   52:invokevirtual   #257 <Method void AssetSetupUIServiceData.setDiscoveryTypesForSelectRobotPresentationStart(HashSet)>
		assetsetupuiservicedata.setDiscoveryTypesForSelectRobotPresentationEnd(hashset);
	//   27   55:aload           4
	//   28   57:aload_2         
	//   29   58:invokevirtual   #260 <Method void AssetSetupUIServiceData.setDiscoveryTypesForSelectRobotPresentationEnd(HashSet)>
		assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StartSelectARobotPresentationFlow, assetsetupuiservicedata);
	//   30   61:aload_3         
	//   31   62:getstatic       #266 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StartSelectARobotPresentationFlow>
	//   32   65:aload           4
	//   33   67:invokevirtual   #270 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//   34   70:return          
	}

	static void b(SelectRobotTypeActivity selectrobottypeactivity, ArrayList arraylist)
	{
		selectrobottypeactivity.b(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #272 <Method void b(ArrayList)>
	//    3    5:return          
	}

	private void b(ArrayList arraylist)
	{
		i = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #274 <Field ArrayList i>
		a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #213 <Method void a()>
	//    5    9:return          
	}

	static String h()
	{
		return l;
	//    0    0:getstatic       #81  <Field String l>
	//    1    3:areturn         
	}

	private void i()
	{
		b = new com.irobot.home.p.a(((android.app.Activity) (this)), ((com.irobot.home.p.a.a) (this)));
	//    0    0:aload_0         
	//    1    1:new             #276 <Class com.irobot.home.p.a>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #279 <Method void com.irobot.home.p.a(android.app.Activity, com.irobot.home.p.a$a)>
	//    6   10:putfield        #282 <Field com.irobot.home.p.a b>
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   7   13:getstatic       #287 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   16:bipush          27
	//*   9   18:icmplt          63
		{
			if(!b.b("android.permission.ACCESS_COARSE_LOCATION"))
	//*  10   21:aload_0         
	//*  11   22:getfield        #282 <Field com.irobot.home.p.a b>
	//*  12   25:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  13   28:invokevirtual   #292 <Method boolean com.irobot.home.p.a.b(String)>
	//*  14   31:ifne            52
			{
				b.a(new String[] {
					"android.permission.ACCESS_COARSE_LOCATION"
				});
	//   15   34:aload_0         
	//   16   35:getfield        #282 <Field com.irobot.home.p.a b>
	//   17   38:iconst_1        
	//   18   39:anewarray       String[]
	//   19   42:dup             
	//   20   43:iconst_0        
	//   21   44:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   22   47:aastore         
	//   23   48:invokevirtual   #297 <Method void com.irobot.home.p.a.a(String[])>
				return;
	//   24   51:return          
			}
			if(!com.irobot.home.util.j.j(((android.content.Context) (this))))
	//*  25   52:aload_0         
	//*  26   53:invokestatic    #300 <Method boolean j.j(android.content.Context)>
	//*  27   56:ifne            63
				f();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #302 <Method void f()>
		}
	//   30   63:return          
	}

	private void j()
	{
		Object obj = ((Object) (Assembler.getInstance().getAssetSetupUIService()));
	//    0    0:invokestatic    #237 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #241 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:astore_1        
		if(obj != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          19
			((AssetSetupUIService) (obj)).sendCommand(AssetSetupUIServiceCommand.CancelProvisioning, ((AssetSetupUIServiceData) (null)));
	//    5   11:aload_1         
	//    6   12:getstatic       #305 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.CancelProvisioning>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #270 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		if(!Assembler.getInstance().getAccountService().isLoggedIn())
	//*   9   19:invokestatic    #237 <Method Assembler Assembler.getInstance()>
	//*  10   22:invokevirtual   #309 <Method AccountService Assembler.getAccountService()>
	//*  11   25:invokevirtual   #315 <Method boolean AccountService.isLoggedIn()>
	//*  12   28:ifne            42
			com.irobot.home.util.j.a(((android.app.Activity) (this)), com.irobot.home.AccountLoginActivity_.a(((android.content.Context) (this))).b());
	//   13   31:aload_0         
	//   14   32:aload_0         
	//   15   33:invokestatic    #320 <Method AccountLoginActivity_$a com.irobot.home.AccountLoginActivity_.a(android.content.Context)>
	//   16   36:invokevirtual   #325 <Method Intent AccountLoginActivity_$a.b()>
	//   17   39:invokestatic    #328 <Method void j.a(android.app.Activity, Intent)>
		if(android.os.Build.VERSION.SDK_INT >= 27 && (!b.b("android.permission.ACCESS_COARSE_LOCATION") || !com.irobot.home.util.j.j(((android.content.Context) (this)))))
	//*  18   42:getstatic       #287 <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   45:bipush          27
	//*  20   47:icmplt          80
	//*  21   50:aload_0         
	//*  22   51:getfield        #282 <Field com.irobot.home.p.a b>
	//*  23   54:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  24   57:invokevirtual   #292 <Method boolean com.irobot.home.p.a.b(String)>
	//*  25   60:ifeq            73
	//*  26   63:aload_0         
	//*  27   64:invokestatic    #300 <Method boolean j.j(android.content.Context)>
	//*  28   67:ifeq            73
	//*  29   70:goto            80
			obj = "";
	//   30   73:ldc2            #330 <String "">
	//   31   76:astore_1        
		else
	//*  32   77:goto            84
			obj = ((Object) (com.irobot.home.util.j.d()));
	//   33   80:invokestatic    #332 <Method String j.d()>
	//   34   83:astore_1        
		A = ((String) (obj));
	//   35   84:aload_1         
	//   36   85:putstatic       #334 <Field String A>
		if(g != null)
	//*  37   88:aload_0         
	//*  38   89:getfield        #336 <Field List g>
	//*  39   92:ifnull          104
			g.clear();
	//   40   95:aload_0         
	//   41   96:getfield        #336 <Field List g>
	//   42   99:invokeinterface #341 <Method void List.clear()>
		if(i != null)
	//*  43  104:aload_0         
	//*  44  105:getfield        #274 <Field ArrayList i>
	//*  45  108:ifnull          118
			i.clear();
	//   46  111:aload_0         
	//   47  112:getfield        #274 <Field ArrayList i>
	//   48  115:invokevirtual   #344 <Method void ArrayList.clear()>
		if(j != null)
	//*  49  118:aload_0         
	//*  50  119:getfield        #211 <Field ArrayList j>
	//*  51  122:ifnull          132
			j.clear();
	//   52  125:aload_0         
	//   53  126:getfield        #211 <Field ArrayList j>
	//   54  129:invokevirtual   #344 <Method void ArrayList.clear()>
		if(m != null)
	//*  55  132:aload_0         
	//*  56  133:getfield        #346 <Field ad m>
	//*  57  136:ifnull          153
		{
			m.clear();
	//   58  139:aload_0         
	//   59  140:getfield        #346 <Field ad m>
	//   60  143:invokevirtual   #349 <Method void ad.clear()>
			m.notifyDataSetChanged();
	//   61  146:aload_0         
	//   62  147:getfield        #346 <Field ad m>
	//   63  150:invokevirtual   #352 <Method void ad.notifyDataSetChanged()>
		}
		a();
	//   64  153:aload_0         
	//   65  154:invokevirtual   #213 <Method void a()>
		if(k() && com.irobot.home.util.j.j(((android.content.Context) (this))))
	//*  66  157:aload_0         
	//*  67  158:invokespecial   #354 <Method boolean k()>
	//*  68  161:ifeq            178
	//*  69  164:aload_0         
	//*  70  165:invokestatic    #300 <Method boolean j.j(android.content.Context)>
	//*  71  168:ifeq            178
			y.dismiss();
	//   72  171:aload_0         
	//   73  172:getfield        #89  <Field AlertDialog y>
	//   74  175:invokevirtual   #359 <Method void AlertDialog.dismiss()>
		a(l());
	//   75  178:aload_0         
	//   76  179:aload_0         
	//   77  180:invokespecial   #361 <Method boolean l()>
	//   78  183:invokespecial   #363 <Method void a(boolean)>
	//   79  186:return          
	}

	private boolean k()
	{
		return y != null && y.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field AlertDialog y>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field AlertDialog y>
	//    5   11:invokevirtual   #366 <Method boolean AlertDialog.isShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private boolean l()
	{
		if(z == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #368 <Field BluetoothAdapter z>
	//*   2    4:ifnonnull       22
		{
			com.irobot.home.util.o.e(l, "Bluetooth not supported on this device!");
	//    3    7:getstatic       #81  <Field String l>
	//    4   10:ldc2            #370 <String "Bluetooth not supported on this device!">
	//    5   13:invokestatic    #375 <Method void o.e(String, String)>
			b();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #377 <Method void b()>
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		}
		return z.isEnabled();
	//   10   22:aload_0         
	//   11   23:getfield        #368 <Field BluetoothAdapter z>
	//   12   26:invokevirtual   #382 <Method boolean BluetoothAdapter.isEnabled()>
	//   13   29:ifne            34
	//   14   32:iconst_0        
	//   15   33:ireturn         
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	private void m()
	{
		m = new ad(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #348 <Class ad>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #385 <Method void ad(android.content.Context)>
	//    5    9:putfield        #346 <Field ad m>
		m m1;
		for(Iterator iterator = g.iterator(); iterator.hasNext(); m.add(((Object) (m1))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #336 <Field List g>
	//*   8   16:invokeinterface #389 <Method Iterator List.iterator()>
	//*   9   21:astore_1        
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #394 <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            52
			m1 = (m)iterator.next();
	//   13   31:aload_1         
	//   14   32:invokeinterface #398 <Method Object Iterator.next()>
	//   15   37:checkcast       #400 <Class m>
	//   16   40:astore_2        

	//   17   41:aload_0         
	//   18   42:getfield        #346 <Field ad m>
	//   19   45:aload_2         
	//   20   46:invokevirtual   #403 <Method void ad.add(Object)>
	//*  21   49:goto            22
		setListAdapter(((android.widget.ListAdapter) (m)));
	//   22   52:aload_0         
	//   23   53:aload_0         
	//   24   54:getfield        #346 <Field ad m>
	//   25   57:invokevirtual   #407 <Method void setListAdapter(android.widget.ListAdapter)>
		getListView().setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   26   60:aload_0         
	//   27   61:invokevirtual   #411 <Method ListView getListView()>
	//   28   64:aload_0         
	//   29   65:invokevirtual   #417 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//   30   68:return          
	}

	private void n()
	{
		if(n < g.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field int n>
	//*   2    4:aload_0         
	//*   3    5:getfield        #336 <Field List g>
	//*   4    8:invokeinterface #420 <Method int List.size()>
	//*   5   13:icmpge          278
		{
			AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//    6   16:invokestatic    #237 <Method Assembler Assembler.getInstance()>
	//    7   19:invokevirtual   #241 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    8   22:astore_2        
			AssetSetupUIServiceData assetsetupuiservicedata1 = AssetSetupUIServiceData.create();
	//    9   23:invokestatic    #253 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   10   26:astore_3        
			Object obj = ((Object) ((m)g.get(n)));
	//   11   27:aload_0         
	//   12   28:getfield        #336 <Field List g>
	//   13   31:aload_0         
	//   14   32:getfield        #87  <Field int n>
	//   15   35:invokeinterface #424 <Method Object List.get(int)>
	//   16   40:checkcast       #400 <Class m>
	//   17   43:astore_1        
			if(com.irobot.home.model.m.b.LIST_ITEM.ordinal() == ((m) (obj)).a())
	//*  18   44:getstatic       #430 <Field com.irobot.home.model.m$b com.irobot.home.model.m$b.LIST_ITEM>
	//*  19   47:invokevirtual   #431 <Method int com.irobot.home.model.m$b.ordinal()>
	//*  20   50:aload_1         
	//*  21   51:invokeinterface #433 <Method int m.a()>
	//*  22   56:icmpne          145
			{
				if(assetsetupuiservice != null)
	//*  23   59:aload_2         
	//*  24   60:ifnull          71
					assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.ResetAssetSetup, ((AssetSetupUIServiceData) (null)));
	//   25   63:aload_2         
	//   26   64:getstatic       #436 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.ResetAssetSetup>
	//   27   67:aconst_null     
	//   28   68:invokevirtual   #270 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
				obj = ((Object) (((RobotTypeListItem)obj).e()));
	//   29   71:aload_1         
	//   30   72:checkcast       #438 <Class RobotTypeListItem>
	//   31   75:invokevirtual   #441 <Method SkuType RobotTypeListItem.e()>
	//   32   78:astore_1        
				switch(com.irobot.home._cls3.a[((SkuType) (obj)).ordinal()])
	//*  33   79:getstatic       #162 <Field int[] com.irobot.home.SelectRobotTypeActivity$3.a>
	//*  34   82:aload_1         
	//*  35   83:invokevirtual   #168 <Method int SkuType.ordinal()>
	//*  36   86:iaload          
				{
	//*  37   87:tableswitch     1 4: default 116
	//	               1 126
	//	               2 126
	//	               3 126
	//	               4 139
				default:
					com.irobot.home.util.o.e(l, "startNextActivity: Unhandled SKU type");
	//   38  116:getstatic       #81  <Field String l>
	//   39  119:ldc2            #443 <String "startNextActivity: Unhandled SKU type">
	//   40  122:invokestatic    #375 <Method void o.e(String, String)>
					return;
	//   41  125:return          

				case 1: // '\001'
				case 2: // '\002'
				case 3: // '\003'
					assetsetupuiservicedata1.setPlaceholderSkuType(((SkuType) (obj)));
	//   42  126:aload_3         
	//   43  127:aload_1         
	//   44  128:invokevirtual   #446 <Method void AssetSetupUIServiceData.setPlaceholderSkuType(SkuType)>
					assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.UpdateServiceData, assetsetupuiservicedata1);
	//   45  131:aload_2         
	//   46  132:getstatic       #449 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.UpdateServiceData>
	//   47  135:aload_3         
	//   48  136:invokevirtual   #270 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
					// fall through

				case 4: // '\004'
					a(((SkuType) (obj)));
	//   49  139:aload_0         
	//   50  140:aload_1         
	//   51  141:invokespecial   #451 <Method void a(SkuType)>
					break;
				}
				return;
	//   52  144:return          
			}
			if(com.irobot.home.model.m.b.DISCOVERED_ITEM.ordinal() == ((m) (obj)).a())
	//*  53  145:getstatic       #454 <Field com.irobot.home.model.m$b com.irobot.home.model.m$b.DISCOVERED_ITEM>
	//*  54  148:invokevirtual   #431 <Method int com.irobot.home.model.m$b.ordinal()>
	//*  55  151:aload_1         
	//*  56  152:invokeinterface #433 <Method int m.a()>
	//*  57  157:icmpne          278
			{
				DiscoveredAsset discoveredasset = (DiscoveredAsset)k.get(obj);
	//   58  160:aload_0         
	//   59  161:getfield        #456 <Field HashMap k>
	//   60  164:aload_1         
	//   61  165:invokevirtual   #461 <Method Object HashMap.get(Object)>
	//   62  168:checkcast       #123 <Class DiscoveredAsset>
	//   63  171:astore          4
				obj = ((Object) (discoveredasset.assetInfo().getSku()));
	//   64  173:aload           4
	//   65  175:invokevirtual   #127 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   66  178:invokevirtual   #464 <Method String AssetInfo.getSku()>
	//   67  181:astore_1        
				if(obj != null && ((String) (obj)).length() > 0)
	//*  68  182:aload_1         
	//*  69  183:ifnull          201
	//*  70  186:aload_1         
	//*  71  187:invokevirtual   #467 <Method int String.length()>
	//*  72  190:ifle            201
				{
					obj = ((Object) (SkuUtils.getSkuType(((String) (obj)))));
	//   73  193:aload_1         
	//   74  194:invokestatic    #473 <Method SkuType SkuUtils.getSkuType(String)>
	//   75  197:astore_1        
				} else
	//*  76  198:goto            214
				{
					com.irobot.home.util.o.e(l, "Selected discovered asset has no sku.");
	//   77  201:getstatic       #81  <Field String l>
	//   78  204:ldc2            #475 <String "Selected discovered asset has no sku.">
	//   79  207:invokestatic    #375 <Method void o.e(String, String)>
					obj = ((Object) (SkuType.Unknown));
	//   80  210:getstatic       #478 <Field SkuType SkuType.Unknown>
	//   81  213:astore_1        
				}
				assetsetupuiservicedata1.setPlaceholderSkuType(((SkuType) (obj)));
	//   82  214:aload_3         
	//   83  215:aload_1         
	//   84  216:invokevirtual   #446 <Method void AssetSetupUIServiceData.setPlaceholderSkuType(SkuType)>
				assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.UpdateServiceData, assetsetupuiservicedata1);
	//   85  219:aload_2         
	//   86  220:getstatic       #449 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.UpdateServiceData>
	//   87  223:aload_3         
	//   88  224:invokevirtual   #270 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
				if(discoveredasset.discoveryType() == DiscoveryType.Wifi)
	//*  89  227:aload           4
	//*  90  229:invokevirtual   #482 <Method DiscoveryType DiscoveredAsset.discoveryType()>
	//*  91  232:getstatic       #225 <Field DiscoveryType DiscoveryType.Wifi>
	//*  92  235:if_acmpne       245
				{
					a(discoveredasset);
	//   93  238:aload_0         
	//   94  239:aload           4
	//   95  241:invokespecial   #484 <Method void a(DiscoveredAsset)>
					return;
	//   96  244:return          
				}
				if(discoveredasset.discoveryType() == DiscoveryType.Ble)
	//*  97  245:aload           4
	//*  98  247:invokevirtual   #482 <Method DiscoveryType DiscoveredAsset.discoveryType()>
	//*  99  250:getstatic       #232 <Field DiscoveryType DiscoveryType.Ble>
	//* 100  253:if_acmpne       278
				{
					AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//  101  256:invokestatic    #253 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//  102  259:astore_1        
					assetsetupuiservicedata.setDiscoveredAssetForProvisioning(discoveredasset);
	//  103  260:aload_1         
	//  104  261:aload           4
	//  105  263:invokevirtual   #487 <Method void AssetSetupUIServiceData.setDiscoveredAssetForProvisioning(DiscoveredAsset)>
					assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.AssetSelectedForProvisioning, assetsetupuiservicedata);
	//  106  266:aload_2         
	//  107  267:getstatic       #490 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.AssetSelectedForProvisioning>
	//  108  270:aload_1         
	//  109  271:invokevirtual   #270 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
					o();
	//  110  274:aload_0         
	//  111  275:invokespecial   #492 <Method void o()>
				}
			}
		}
	//  112  278:return          
	}

	private void o()
	{
		AnalyticsSubsystem.getInstance().trackProvAddRobotSelected(AddRobotSelection.Bluetooth);
	//    0    0:invokestatic    #102 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:getstatic       #495 <Field AddRobotSelection AddRobotSelection.Bluetooth>
	//    2    6:invokevirtual   #112 <Method void AnalyticsSubsystem.trackProvAddRobotSelected(AddRobotSelection)>
		startActivity((new Intent(((android.content.Context) (this)), com/irobot/home/BroadcastSetupActivity_)).putExtra("newRobotConfig", true));
	//    3    9:aload_0         
	//    4   10:new             #180 <Class Intent>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:ldc1            #191 <Class BroadcastSetupActivity_>
	//    8   17:invokespecial   #185 <Method void Intent(android.content.Context, Class)>
	//    9   20:ldc2            #497 <String "newRobotConfig">
	//   10   23:iconst_1        
	//   11   24:invokevirtual   #501 <Method Intent Intent.putExtra(String, boolean)>
	//   12   27:invokevirtual   #189 <Method void startActivity(Intent)>
	//   13   30:return          
	}

	public void a()
	{
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #343 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #502 <Method void ArrayList()>
	//    3    7:astore          4
		if(i != null && !i.isEmpty())
	//*   4    9:aload_0         
	//*   5   10:getfield        #274 <Field ArrayList i>
	//*   6   13:ifnull          36
	//*   7   16:aload_0         
	//*   8   17:getfield        #274 <Field ArrayList i>
	//*   9   20:invokevirtual   #505 <Method boolean ArrayList.isEmpty()>
	//*  10   23:ifne            36
			arraylist.addAll(((java.util.Collection) (i)));
	//   11   26:aload           4
	//   12   28:aload_0         
	//   13   29:getfield        #274 <Field ArrayList i>
	//   14   32:invokevirtual   #509 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   15   35:pop             
		if(j != null && !j.isEmpty())
	//*  16   36:aload_0         
	//*  17   37:getfield        #211 <Field ArrayList j>
	//*  18   40:ifnull          63
	//*  19   43:aload_0         
	//*  20   44:getfield        #211 <Field ArrayList j>
	//*  21   47:invokevirtual   #505 <Method boolean ArrayList.isEmpty()>
	//*  22   50:ifne            63
			arraylist.addAll(((java.util.Collection) (j)));
	//   23   53:aload           4
	//   24   55:aload_0         
	//   25   56:getfield        #211 <Field ArrayList j>
	//   26   59:invokevirtual   #509 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   27   62:pop             
		k.clear();
	//   28   63:aload_0         
	//   29   64:getfield        #456 <Field HashMap k>
	//   30   67:invokevirtual   #510 <Method void HashMap.clear()>
		g.clear();
	//   31   70:aload_0         
	//   32   71:getfield        #336 <Field List g>
	//   33   74:invokeinterface #341 <Method void List.clear()>
		if(arraylist.size() != 0) goto _L2; else goto _L1
	//   34   79:aload           4
	//   35   81:invokevirtual   #511 <Method int ArrayList.size()>
	//   36   84:ifne            108
_L1:
		List list;
		v v1;
		list = g;
	//   37   87:aload_0         
	//   38   88:getfield        #336 <Field List g>
	//   39   91:astore_2        
		v1 = q;
	//   40   92:aload_0         
	//   41   93:getfield        #513 <Field v q>
	//   42   96:astore_3        
_L4:
		list.add(((Object) (v1)));
	//   43   97:aload_2         
	//   44   98:aload_3         
	//   45   99:invokeinterface #514 <Method boolean List.add(Object)>
	//   46  104:pop             
		break; /* Loop/switch isn't completed */
	//   47  105:goto            129
_L2:
		if(arraylist.size() <= 0)
			break; /* Loop/switch isn't completed */
	//   48  108:aload           4
	//   49  110:invokevirtual   #511 <Method int ArrayList.size()>
	//   50  113:ifle            129
		list = g;
	//   51  116:aload_0         
	//   52  117:getfield        #336 <Field List g>
	//   53  120:astore_2        
		v1 = r;
	//   54  121:aload_0         
	//   55  122:getfield        #516 <Field v r>
	//   56  125:astore_3        
		if(true) goto _L4; else goto _L3
	//   57  126:goto            97
_L3:
		Object obj;
		DiscoveredAsset discoveredasset;
		for(Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); k.put(obj, ((Object) (discoveredasset))))
	//*  58  129:aload           4
	//*  59  131:invokevirtual   #517 <Method Iterator ArrayList.iterator()>
	//*  60  134:astore          5
	//*  61  136:aload           5
	//*  62  138:invokeinterface #394 <Method boolean Iterator.hasNext()>
	//*  63  143:ifeq            380
		{
			String s3;
			String s4;
label0:
			{
				discoveredasset = (DiscoveredAsset)iterator1.next();
	//   64  146:aload           5
	//   65  148:invokeinterface #398 <Method Object Iterator.next()>
	//   66  153:checkcast       #123 <Class DiscoveredAsset>
	//   67  156:astore          6
				s3 = discoveredasset.assetInfo().getAssetId().getId();
	//   68  158:aload           6
	//   69  160:invokevirtual   #127 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   70  163:invokevirtual   #521 <Method AssetId AssetInfo.getAssetId()>
	//   71  166:invokevirtual   #526 <Method String AssetId.getId()>
	//   72  169:astore          7
				String s1 = discoveredasset.assetInfo().getName();
	//   73  171:aload           6
	//   74  173:invokevirtual   #127 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   75  176:invokevirtual   #529 <Method String AssetInfo.getName()>
	//   76  179:astore_3        
				s4 = discoveredasset.assetInfo().getSku();
	//   77  180:aload           6
	//   78  182:invokevirtual   #127 <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   79  185:invokevirtual   #464 <Method String AssetInfo.getSku()>
	//   80  188:astore          8
				if(s1 != null)
	//*  81  190:aload_3         
	//*  82  191:ifnull          203
				{
					obj = ((Object) (s1));
	//   83  194:aload_3         
	//   84  195:astore_2        
					if(!s1.isEmpty())
						break label0;
	//   85  196:aload_3         
	//   86  197:invokevirtual   #530 <Method boolean String.isEmpty()>
	//   87  200:ifeq            211
				}
				obj = ((Object) (getString(0x7f0f07ab)));
	//   88  203:aload_0         
	//   89  204:ldc2            #531 <Int 0x7f0f07ab>
	//   90  207:invokevirtual   #535 <Method String getString(int)>
	//   91  210:astore_2        
			}
			String s2 = ((String) (obj)).substring(0, Math.min(18, ((String) (obj)).length()));
	//   92  211:aload_2         
	//   93  212:iconst_0        
	//   94  213:bipush          18
	//   95  215:aload_2         
	//   96  216:invokevirtual   #467 <Method int String.length()>
	//   97  219:invokestatic    #541 <Method int Math.min(int, int)>
	//   98  222:invokevirtual   #545 <Method String String.substring(int, int)>
	//   99  225:astore_3        
			int i1 = com.irobot.home.util.x.a(AssetImageLocation.Discovery, s4);
	//  100  226:getstatic       #551 <Field AssetImageLocation AssetImageLocation.Discovery>
	//  101  229:aload           8
	//  102  231:invokestatic    #556 <Method int x.a(AssetImageLocation, String)>
	//  103  234:istore_1        
			if(A.isEmpty())
	//* 104  235:getstatic       #334 <Field String A>
	//* 105  238:invokevirtual   #530 <Method boolean String.isEmpty()>
	//* 106  241:ifeq            251
				obj = "";
	//  107  244:ldc2            #330 <String "">
	//  108  247:astore_2        
			else
	//* 109  248:goto            269
				obj = ((Object) (getString(0x7f0f00a0, new Object[] {
					A
				})));
	//  110  251:aload_0         
	//  111  252:ldc2            #557 <Int 0x7f0f00a0>
	//  112  255:iconst_1        
	//  113  256:anewarray       Object[]
	//  114  259:dup             
	//  115  260:iconst_0        
	//  116  261:getstatic       #334 <Field String A>
	//  117  264:aastore         
	//  118  265:invokevirtual   #562 <Method String getString(int, Object[])>
	//  119  268:astore_2        
			if(DiscoveryType.Ble == discoveredasset.discoveryType())
	//* 120  269:getstatic       #232 <Field DiscoveryType DiscoveryType.Ble>
	//* 121  272:aload           6
	//* 122  274:invokevirtual   #482 <Method DiscoveryType DiscoveredAsset.discoveryType()>
	//* 123  277:if_acmpne       328
			{
				obj = ((Object) (new StringBuilder()));
	//  124  280:new             #564 <Class StringBuilder>
	//  125  283:dup             
	//  126  284:invokespecial   #565 <Method void StringBuilder()>
	//  127  287:astore_2        
				((StringBuilder) (obj)).append(getString(0x7f0f07ab));
	//  128  288:aload_2         
	//  129  289:aload_0         
	//  130  290:ldc2            #531 <Int 0x7f0f07ab>
	//  131  293:invokevirtual   #535 <Method String getString(int)>
	//  132  296:invokevirtual   #569 <Method StringBuilder StringBuilder.append(String)>
	//  133  299:pop             
				((StringBuilder) (obj)).append(" ");
	//  134  300:aload_2         
	//  135  301:ldc2            #571 <String " ">
	//  136  304:invokevirtual   #569 <Method StringBuilder StringBuilder.append(String)>
	//  137  307:pop             
				((StringBuilder) (obj)).append(s4);
	//  138  308:aload_2         
	//  139  309:aload           8
	//  140  311:invokevirtual   #569 <Method StringBuilder StringBuilder.append(String)>
	//  141  314:pop             
				s2 = ((StringBuilder) (obj)).toString();
	//  142  315:aload_2         
	//  143  316:invokevirtual   #574 <Method String StringBuilder.toString()>
	//  144  319:astore_3        
				obj = ((Object) (getString(0x7f0f00a1)));
	//  145  320:aload_0         
	//  146  321:ldc2            #575 <Int 0x7f0f00a1>
	//  147  324:invokevirtual   #535 <Method String getString(int)>
	//  148  327:astore_2        
			}
			obj = ((Object) (new RobotTypeListDiscoveredItem(s2, s3.substring(0, Math.min(10, s3.length())), ((String) (obj)), i1)));
	//  149  328:new             #577 <Class RobotTypeListDiscoveredItem>
	//  150  331:dup             
	//  151  332:aload_3         
	//  152  333:aload           7
	//  153  335:iconst_0        
	//  154  336:bipush          10
	//  155  338:aload           7
	//  156  340:invokevirtual   #467 <Method int String.length()>
	//  157  343:invokestatic    #541 <Method int Math.min(int, int)>
	//  158  346:invokevirtual   #545 <Method String String.substring(int, int)>
	//  159  349:aload_2         
	//  160  350:iload_1         
	//  161  351:invokespecial   #580 <Method void RobotTypeListDiscoveredItem(String, String, String, int)>
	//  162  354:astore_2        
			g.add(obj);
	//  163  355:aload_0         
	//  164  356:getfield        #336 <Field List g>
	//  165  359:aload_2         
	//  166  360:invokeinterface #514 <Method boolean List.add(Object)>
	//  167  365:pop             
		}

	//  168  366:aload_0         
	//  169  367:getfield        #456 <Field HashMap k>
	//  170  370:aload_2         
	//  171  371:aload           6
	//  172  373:invokevirtual   #584 <Method Object HashMap.put(Object, Object)>
	//  173  376:pop             
	//* 174  377:goto            136
		if(g.size() > 0 && arraylist.size() > 0)
	//* 175  380:aload_0         
	//* 176  381:getfield        #336 <Field List g>
	//* 177  384:invokeinterface #420 <Method int List.size()>
	//* 178  389:ifle            414
	//* 179  392:aload           4
	//* 180  394:invokevirtual   #511 <Method int ArrayList.size()>
	//* 181  397:ifle            414
			g.add(((Object) (s)));
	//  182  400:aload_0         
	//  183  401:getfield        #336 <Field List g>
	//  184  404:aload_0         
	//  185  405:getfield        #586 <Field v s>
	//  186  408:invokeinterface #514 <Method boolean List.add(Object)>
	//  187  413:pop             
		g.add(((Object) (t)));
	//  188  414:aload_0         
	//  189  415:getfield        #336 <Field List g>
	//  190  418:aload_0         
	//  191  419:getfield        #588 <Field RobotTypeListItem t>
	//  192  422:invokeinterface #514 <Method boolean List.add(Object)>
	//  193  427:pop             
		g.add(((Object) (u)));
	//  194  428:aload_0         
	//  195  429:getfield        #336 <Field List g>
	//  196  432:aload_0         
	//  197  433:getfield        #590 <Field RobotTypeListItem u>
	//  198  436:invokeinterface #514 <Method boolean List.add(Object)>
	//  199  441:pop             
		m.clear();
	//  200  442:aload_0         
	//  201  443:getfield        #346 <Field ad m>
	//  202  446:invokevirtual   #349 <Method void ad.clear()>
		m m1;
		for(Iterator iterator = g.iterator(); iterator.hasNext(); m.add(((Object) (m1))))
	//* 203  449:aload_0         
	//* 204  450:getfield        #336 <Field List g>
	//* 205  453:invokeinterface #389 <Method Iterator List.iterator()>
	//* 206  458:astore_2        
	//* 207  459:aload_2         
	//* 208  460:invokeinterface #394 <Method boolean Iterator.hasNext()>
	//* 209  465:ifeq            489
			m1 = (m)iterator.next();
	//  210  468:aload_2         
	//  211  469:invokeinterface #398 <Method Object Iterator.next()>
	//  212  474:checkcast       #400 <Class m>
	//  213  477:astore_3        

	//  214  478:aload_0         
	//  215  479:getfield        #346 <Field ad m>
	//  216  482:aload_3         
	//  217  483:invokevirtual   #403 <Method void ad.add(Object)>
	//* 218  486:goto            459
		m.notifyDataSetChanged();
	//  219  489:aload_0         
	//  220  490:getfield        #346 <Field ad m>
	//  221  493:invokevirtual   #352 <Method void ad.notifyDataSetChanged()>
		return;
	//  222  496:return          
	}

	public void a(List list, List list1, List list2, int i1)
	{
		if(b.b("android.permission.ACCESS_COARSE_LOCATION"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #282 <Field com.irobot.home.p.a b>
	//*   2    4:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*   3    7:invokevirtual   #292 <Method boolean com.irobot.home.p.a.b(String)>
	//*   4   10:ifeq            37
		{
			if(!com.irobot.home.util.j.j(((android.content.Context) (this))))
	//*   5   13:aload_0         
	//*   6   14:invokestatic    #300 <Method boolean j.j(android.content.Context)>
	//*   7   17:ifne            25
			{
				f();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #302 <Method void f()>
				return;
	//   10   24:return          
			}
			if(n >= 0)
	//*  11   25:aload_0         
	//*  12   26:getfield        #87  <Field int n>
	//*  13   29:iflt            84
			{
				n();
	//   14   32:aload_0         
	//   15   33:invokespecial   #593 <Method void n()>
				return;
	//   16   36:return          
			}
		} else
		{
			if(b.c("android.permission.ACCESS_COARSE_LOCATION"))
	//*  17   37:aload_0         
	//*  18   38:getfield        #282 <Field com.irobot.home.p.a b>
	//*  19   41:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  20   44:invokevirtual   #595 <Method boolean com.irobot.home.p.a.c(String)>
	//*  21   47:ifeq            61
			{
				b.d("android.permission.ACCESS_COARSE_LOCATION");
	//   22   50:aload_0         
	//   23   51:getfield        #282 <Field com.irobot.home.p.a b>
	//   24   54:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   25   57:invokevirtual   #598 <Method void com.irobot.home.p.a.d(String)>
				return;
	//   26   60:return          
			}
			if(b.e("android.permission.ACCESS_COARSE_LOCATION"))
	//*  27   61:aload_0         
	//*  28   62:getfield        #282 <Field com.irobot.home.p.a b>
	//*  29   65:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  30   68:invokevirtual   #600 <Method boolean com.irobot.home.p.a.e(String)>
	//*  31   71:ifeq            84
				b.f("android.permission.ACCESS_COARSE_LOCATION");
	//   32   74:aload_0         
	//   33   75:getfield        #282 <Field com.irobot.home.p.a b>
	//   34   78:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   35   81:invokevirtual   #602 <Method void com.irobot.home.p.a.f(String)>
		}
	//   36   84:return          
	}

	protected void b()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f022b).setMessage(0x7f0f00f6).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #605 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #606 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #607 <Int 0x7f0f022b>
	//    5   11:invokevirtual   #611 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//    6   14:ldc2            #612 <Int 0x7f0f00f6>
	//    7   17:invokevirtual   #615 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    8   20:ldc2            #616 <Int 0x7f0f05bb>
	//    9   23:aconst_null     
	//   10   24:invokevirtual   #620 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   11   27:invokevirtual   #624 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   12   30:pop             
	//   13   31:return          
	}

	void c()
	{
		c(0x7f0f0061);
	//    0    0:aload_0         
	//    1    1:ldc2            #625 <Int 0x7f0f0061>
	//    2    4:invokevirtual   #628 <Method void c(int)>
		com.irobot.home.util.c.a(((android.app.Activity) (this)), c.findViewById(0x7f0901b7));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #630 <Field LinearLayout c>
	//    6   12:ldc2            #631 <Int 0x7f0901b7>
	//    7   15:invokevirtual   #637 <Method View LinearLayout.findViewById(int)>
	//    8   18:invokestatic    #642 <Method void c.a(android.app.Activity, View)>
		z = ((BluetoothManager)getSystemService("bluetooth")).getAdapter();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:ldc2            #644 <String "bluetooth">
	//   12   26:invokevirtual   #648 <Method Object getSystemService(String)>
	//   13   29:checkcast       #650 <Class BluetoothManager>
	//   14   32:invokevirtual   #654 <Method BluetoothAdapter BluetoothManager.getAdapter()>
	//   15   35:putfield        #368 <Field BluetoothAdapter z>
		m();
	//   16   38:aload_0         
	//   17   39:invokespecial   #656 <Method void m()>
		h = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   18   42:aload_0         
	//   19   43:aload_0         
	//   20   44:invokestatic    #659 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   21   47:putfield        #661 <Field CustomerCareRestClient h>
		d();
	//   22   50:aload_0         
	//   23   51:invokevirtual   #663 <Method void d()>
	//   24   54:return          
	}

	public void d()
	{
		try
		{
			Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #671 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
			o = h.getTermsInfo(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((android.content.Context) (this))), "R980020");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #661 <Field CustomerCareRestClient h>
	//    5    9:aload_1         
	//    6   10:invokestatic    #674 <Method String j.a(Locale)>
	//    7   13:aload_0         
	//    8   14:invokestatic    #677 <Method String j.h(android.content.Context)>
	//    9   17:ldc2            #679 <String "R980020">
	//   10   20:invokeinterface #685 <Method TermsInfo CustomerCareRestClient.getTermsInfo(String, String, String)>
	//   11   25:putfield        #687 <Field TermsInfo o>
			if(o != null && com.irobot.home.util.j.i(o.version) && !o.version.equals(((Object) (d.e()))))
	//*  12   28:aload_0         
	//*  13   29:getfield        #687 <Field TermsInfo o>
	//*  14   32:ifnull          119
	//*  15   35:aload_0         
	//*  16   36:getfield        #687 <Field TermsInfo o>
	//*  17   39:getfield        #692 <Field String TermsInfo.version>
	//*  18   42:invokestatic    #694 <Method boolean j.i(String)>
	//*  19   45:ifeq            119
	//*  20   48:aload_0         
	//*  21   49:getfield        #687 <Field TermsInfo o>
	//*  22   52:getfield        #692 <Field String TermsInfo.version>
	//*  23   55:aload_0         
	//*  24   56:getfield        #696 <Field IRobotApplication d>
	//*  25   59:invokevirtual   #700 <Method String com.irobot.home.IRobotApplication.e()>
	//*  26   62:invokevirtual   #703 <Method boolean String.equals(Object)>
	//*  27   65:ifne            119
			{
				d.a(false);
	//   28   68:aload_0         
	//   29   69:getfield        #696 <Field IRobotApplication d>
	//   30   72:iconst_0        
	//   31   73:invokevirtual   #704 <Method void com.irobot.home.IRobotApplication.a(boolean)>
				e();
	//   32   76:aload_0         
	//   33   77:invokevirtual   #706 <Method void e()>
				return;
	//   34   80:return          
			}
		}
		catch(Exception exception)
	//*  35   81:astore_1        
		{
			String s1 = l;
	//   36   82:getstatic       #81  <Field String l>
	//   37   85:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   38   86:new             #564 <Class StringBuilder>
	//   39   89:dup             
	//   40   90:invokespecial   #565 <Method void StringBuilder()>
	//   41   93:astore_3        
			stringbuilder.append("Cannot retrieve TermsInfo: ");
	//   42   94:aload_3         
	//   43   95:ldc2            #708 <String "Cannot retrieve TermsInfo: ">
	//   44   98:invokevirtual   #569 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:pop             
			stringbuilder.append(exception.getMessage());
	//   46  102:aload_3         
	//   47  103:aload_1         
	//   48  104:invokevirtual   #711 <Method String Exception.getMessage()>
	//   49  107:invokevirtual   #569 <Method StringBuilder StringBuilder.append(String)>
	//   50  110:pop             
			com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   51  111:aload_2         
	//   52  112:aload_3         
	//   53  113:invokevirtual   #574 <Method String StringBuilder.toString()>
	//   54  116:invokestatic    #375 <Method void o.e(String, String)>
		}
	//   55  119:return          
	}

	public void e()
	{
		android.app.FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #715 <Method FragmentManager getFragmentManager()>
	//    2    4:invokevirtual   #721 <Method android.app.FragmentTransaction FragmentManager.beginTransaction()>
	//    3    7:astore_1        
		p = com.irobot.home.g.d.a(((e) (this)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokestatic    #726 <Method d d.a(e)>
	//    7   13:putfield        #728 <Field d p>
		p.setCancelable(false);
	//    8   16:aload_0         
	//    9   17:getfield        #728 <Field d p>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #731 <Method void d.setCancelable(boolean)>
		p.show(fragmenttransaction, "legalTermsDialog");
	//   12   24:aload_0         
	//   13   25:getfield        #728 <Field d p>
	//   14   28:aload_1         
	//   15   29:ldc2            #733 <String "legalTermsDialog">
	//   16   32:invokevirtual   #736 <Method int d.show(android.app.FragmentTransaction, String)>
	//   17   35:pop             
	//   18   36:return          
	}

	protected void f()
	{
		y = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (getString(0x7f0f0449)))).setNegativeButton(0x7f0f0275, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(0x7f0f034a, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				dialoginterface = ((DialogInterface) (new Intent("android.settings.LOCATION_SOURCE_SETTINGS")));
			//    0    0:new             #24  <Class Intent>
			//    1    3:dup             
			//    2    4:ldc1            #26  <String "android.settings.LOCATION_SOURCE_SETTINGS">
			//    3    6:invokespecial   #29  <Method void Intent(String)>
			//    4    9:astore_1        
				a.startActivityForResult(((Intent) (dialoginterface)), 3);
			//    5   10:aload_0         
			//    6   11:getfield        #17  <Field SelectRobotTypeActivity a>
			//    7   14:aload_1         
			//    8   15:iconst_3        
			//    9   16:invokevirtual   #33  <Method void SelectRobotTypeActivity.startActivityForResult(Intent, int)>
			//   10   19:return          
			}

			final SelectRobotTypeActivity a;

			
			{
				a = SelectRobotTypeActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SelectRobotTypeActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    0    0:aload_0         
	//    1    1:new             #605 <Class android.app.AlertDialog$Builder>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #606 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    5    9:aload_0         
	//    6   10:ldc2            #737 <Int 0x7f0f0449>
	//    7   13:invokevirtual   #535 <Method String getString(int)>
	//    8   16:invokevirtual   #740 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    9   19:ldc2            #741 <Int 0x7f0f0275>
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #744 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   12   26:ldc2            #745 <Int 0x7f0f034a>
	//   13   29:new             #14  <Class SelectRobotTypeActivity$1>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #746 <Method void SelectRobotTypeActivity$1(SelectRobotTypeActivity)>
	//   17   37:invokevirtual   #620 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   18   40:invokevirtual   #624 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   19   43:putfield        #89  <Field AlertDialog y>
	//   20   46:return          
	}

	protected void g()
	{
		com.irobot.home.AccountOverviewActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #751 <Method AccountOverviewActivity_$a com.irobot.home.AccountOverviewActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #754 <Method org.androidannotations.api.a.e com.irobot.home.AccountOverviewActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
		default:
			break;

	//*   1    1:tableswitch     1 3: default 28
	//	               1 77
	//	               2 45
	//	               3 31
	//*   2   28:goto            90
		case 3: // '\003'
			if(!com.irobot.home.util.j.j(((android.content.Context) (this))))
	//*   3   31:aload_0         
	//*   4   32:invokestatic    #300 <Method boolean j.j(android.content.Context)>
	//*   5   35:ifne            90
				f();
	//    6   38:aload_0         
	//    7   39:invokevirtual   #302 <Method void f()>
			break;
	//    8   42:goto            90

		case 2: // '\002'
			if(p != null && p.isVisible() && j1 == -1)
	//*   9   45:aload_0         
	//*  10   46:getfield        #728 <Field d p>
	//*  11   49:ifnull          90
	//*  12   52:aload_0         
	//*  13   53:getfield        #728 <Field d p>
	//*  14   56:invokevirtual   #759 <Method boolean d.isVisible()>
	//*  15   59:ifeq            90
	//*  16   62:iload_2         
	//*  17   63:iconst_m1       
	//*  18   64:icmpne          90
				p.dismiss();
	//   19   67:aload_0         
	//   20   68:getfield        #728 <Field d p>
	//   21   71:invokevirtual   #760 <Method void d.dismiss()>
			break;
	//   22   74:goto            90

		case 1: // '\001'
			if(j1 == -1)
	//*  23   77:iload_2         
	//*  24   78:iconst_m1       
	//*  25   79:icmpne          90
			{
				com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//   26   82:aload_0         
	//   27   83:invokestatic    #763 <Method void j.a(android.app.Activity)>
				finish();
	//   28   86:aload_0         
	//   29   87:invokevirtual   #766 <Method void finish()>
			}
			break;
		}
		super.onActivityResult(i1, j1, intent);
	//   30   90:aload_0         
	//   31   91:iload_1         
	//   32   92:iload_2         
	//   33   93:aload_3         
	//   34   94:invokespecial   #768 <Method void BaseListActivity.onActivityResult(int, int, Intent)>
	//   35   97:return          
	}

	public void onBackPressed()
	{
		if(d.h().b() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #696 <Field IRobotApplication d>
	//*   2    4:invokevirtual   #772 <Method IRobotModel IRobotApplication.h()>
	//*   3    7:invokevirtual   #776 <Method int IRobotModel.b()>
	//*   4   10:ifle            39
		{
			if(f)
	//*   5   13:aload_0         
	//*   6   14:getfield        #778 <Field boolean f>
	//*   7   17:ifeq            34
			{
				((IRobotApplication)getApplication()).j();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #782 <Method android.app.Application getApplication()>
	//   10   24:checkcast       #698 <Class IRobotApplication>
	//   11   27:invokevirtual   #784 <Method void com.irobot.home.IRobotApplication.j()>
				com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//   12   30:aload_0         
	//   13   31:invokestatic    #763 <Method void j.a(android.app.Activity)>
			}
			super.onBackPressed();
	//   14   34:aload_0         
	//   15   35:invokespecial   #786 <Method void BaseListActivity.onBackPressed()>
			return;
	//   16   38:return          
		} else
		{
			finish();
	//   17   39:aload_0         
	//   18   40:invokevirtual   #766 <Method void finish()>
			return;
	//   19   43:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #790 <Method void BaseListActivity.onCreate(Bundle)>
		k = new HashMap();
	//    3    5:aload_0         
	//    4    6:new             #458 <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #791 <Method void HashMap()>
	//    7   13:putfield        #456 <Field HashMap k>
		g = ((List) (new ArrayList()));
	//    8   16:aload_0         
	//    9   17:new             #343 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #502 <Method void ArrayList()>
	//   12   24:putfield        #336 <Field List g>
		q = new v(getString(0x7f0f07dd), true);
	//   13   27:aload_0         
	//   14   28:new             #793 <Class v>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:ldc2            #794 <Int 0x7f0f07dd>
	//   18   36:invokevirtual   #535 <Method String getString(int)>
	//   19   39:iconst_1        
	//   20   40:invokespecial   #796 <Method void v(String, boolean)>
	//   21   43:putfield        #513 <Field v q>
		r = new v(getString(0x7f0f0338));
	//   22   46:aload_0         
	//   23   47:new             #793 <Class v>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:ldc2            #797 <Int 0x7f0f0338>
	//   27   55:invokevirtual   #535 <Method String getString(int)>
	//   28   58:invokespecial   #799 <Method void v(String)>
	//   29   61:putfield        #516 <Field v r>
		s = new v(getString(0x7f0f006e));
	//   30   64:aload_0         
	//   31   65:new             #793 <Class v>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:ldc2            #800 <Int 0x7f0f006e>
	//   35   73:invokevirtual   #535 <Method String getString(int)>
	//   36   76:invokespecial   #799 <Method void v(String)>
	//   37   79:putfield        #586 <Field v s>
		t = new RobotTypeListItem(getString(0x7f0f07ab), getString(0x7f0f0951), com.irobot.home.util.x.a(AssetImageLocation.AddRobot, SkuType.Series900), SkuType.Series900);
	//   38   82:aload_0         
	//   39   83:new             #438 <Class RobotTypeListItem>
	//   40   86:dup             
	//   41   87:aload_0         
	//   42   88:ldc2            #531 <Int 0x7f0f07ab>
	//   43   91:invokevirtual   #535 <Method String getString(int)>
	//   44   94:aload_0         
	//   45   95:ldc2            #801 <Int 0x7f0f0951>
	//   46   98:invokevirtual   #535 <Method String getString(int)>
	//   47  101:getstatic       #804 <Field AssetImageLocation AssetImageLocation.AddRobot>
	//   48  104:getstatic       #807 <Field SkuType SkuType.Series900>
	//   49  107:invokestatic    #810 <Method int x.a(AssetImageLocation, SkuType)>
	//   50  110:getstatic       #807 <Field SkuType SkuType.Series900>
	//   51  113:invokespecial   #813 <Method void RobotTypeListItem(String, String, int, SkuType)>
	//   52  116:putfield        #588 <Field RobotTypeListItem t>
		w = new RobotTypeListItem(getString(0x7f0f085d), getString(0x7f0f0951), com.irobot.home.util.x.a(AssetImageLocation.AddRobot, SkuType.Soho), SkuType.Soho);
	//   53  119:aload_0         
	//   54  120:new             #438 <Class RobotTypeListItem>
	//   55  123:dup             
	//   56  124:aload_0         
	//   57  125:ldc2            #814 <Int 0x7f0f085d>
	//   58  128:invokevirtual   #535 <Method String getString(int)>
	//   59  131:aload_0         
	//   60  132:ldc2            #801 <Int 0x7f0f0951>
	//   61  135:invokevirtual   #535 <Method String getString(int)>
	//   62  138:getstatic       #804 <Field AssetImageLocation AssetImageLocation.AddRobot>
	//   63  141:getstatic       #817 <Field SkuType SkuType.Soho>
	//   64  144:invokestatic    #810 <Method int x.a(AssetImageLocation, SkuType)>
	//   65  147:getstatic       #817 <Field SkuType SkuType.Soho>
	//   66  150:invokespecial   #813 <Method void RobotTypeListItem(String, String, int, SkuType)>
	//   67  153:putfield        #819 <Field RobotTypeListItem w>
		v = new RobotTypeListItem(getString(0x7f0f00ee), getString(0x7f0f049c), com.irobot.home.util.x.a(AssetImageLocation.AddRobot, SkuType.SanMarino), SkuType.SanMarino);
	//   68  156:aload_0         
	//   69  157:new             #438 <Class RobotTypeListItem>
	//   70  160:dup             
	//   71  161:aload_0         
	//   72  162:ldc2            #820 <Int 0x7f0f00ee>
	//   73  165:invokevirtual   #535 <Method String getString(int)>
	//   74  168:aload_0         
	//   75  169:ldc2            #821 <Int 0x7f0f049c>
	//   76  172:invokevirtual   #535 <Method String getString(int)>
	//   77  175:getstatic       #804 <Field AssetImageLocation AssetImageLocation.AddRobot>
	//   78  178:getstatic       #824 <Field SkuType SkuType.SanMarino>
	//   79  181:invokestatic    #810 <Method int x.a(AssetImageLocation, SkuType)>
	//   80  184:getstatic       #824 <Field SkuType SkuType.SanMarino>
	//   81  187:invokespecial   #813 <Method void RobotTypeListItem(String, String, int, SkuType)>
	//   82  190:putfield        #826 <Field RobotTypeListItem v>
		u = new RobotTypeListItem(getString(0x7f0f013d), getString(0x7f0f049d), com.irobot.home.util.x.a(AssetImageLocation.AddRobot, SkuType.Altadena), SkuType.Altadena);
	//   83  193:aload_0         
	//   84  194:new             #438 <Class RobotTypeListItem>
	//   85  197:dup             
	//   86  198:aload_0         
	//   87  199:ldc2            #827 <Int 0x7f0f013d>
	//   88  202:invokevirtual   #535 <Method String getString(int)>
	//   89  205:aload_0         
	//   90  206:ldc2            #828 <Int 0x7f0f049d>
	//   91  209:invokevirtual   #535 <Method String getString(int)>
	//   92  212:getstatic       #804 <Field AssetImageLocation AssetImageLocation.AddRobot>
	//   93  215:getstatic       #178 <Field SkuType SkuType.Altadena>
	//   94  218:invokestatic    #810 <Method int x.a(AssetImageLocation, SkuType)>
	//   95  221:getstatic       #178 <Field SkuType SkuType.Altadena>
	//   96  224:invokespecial   #813 <Method void RobotTypeListItem(String, String, int, SkuType)>
	//   97  227:putfield        #590 <Field RobotTypeListItem u>
		com.irobot.home.util.j.a(e);
	//   98  230:aload_0         
	//   99  231:getfield        #830 <Field k e>
	//  100  234:invokestatic    #833 <Method void j.a(k)>
		i();
	//  101  237:aload_0         
	//  102  238:invokespecial   #835 <Method void i()>
	//  103  241:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
	{
		n = i1;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #87  <Field int n>
		if(b.b("android.permission.ACCESS_COARSE_LOCATION"))
	//*   3    5:aload_0         
	//*   4    6:getfield        #282 <Field com.irobot.home.p.a b>
	//*   5    9:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*   6   12:invokevirtual   #292 <Method boolean com.irobot.home.p.a.b(String)>
	//*   7   15:ifeq            35
		{
			if(com.irobot.home.util.j.j(((android.content.Context) (this))))
	//*   8   18:aload_0         
	//*   9   19:invokestatic    #300 <Method boolean j.j(android.content.Context)>
	//*  10   22:ifeq            30
			{
				n();
	//   11   25:aload_0         
	//   12   26:invokespecial   #593 <Method void n()>
				return;
	//   13   29:return          
			} else
			{
				f();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #302 <Method void f()>
				return;
	//   16   34:return          
			}
		} else
		{
			b.a(new String[] {
				"android.permission.ACCESS_COARSE_LOCATION"
			});
	//   17   35:aload_0         
	//   18   36:getfield        #282 <Field com.irobot.home.p.a b>
	//   19   39:iconst_1        
	//   20   40:anewarray       String[]
	//   21   43:dup             
	//   22   44:iconst_0        
	//   23   45:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   24   48:aastore         
	//   25   49:invokevirtual   #297 <Method void com.irobot.home.p.a.a(String[])>
			return;
	//   26   52:return          
		}
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #843 <Method void BaseListActivity.onPause()>
		com.irobot.home.util.c.a();
	//    2    4:invokestatic    #844 <Method void c.a()>
		if(x != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #846 <Field BluetoothStateReceiver x>
	//*   5   11:ifnull          63
			try
			{
				unregisterReceiver(((android.content.BroadcastReceiver) (x)));
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #846 <Field BluetoothStateReceiver x>
	//    9   19:invokevirtual   #850 <Method void unregisterReceiver(android.content.BroadcastReceiver)>
			}
	//*  10   22:goto            63
			catch(IllegalArgumentException illegalargumentexception)
	//*  11   25:astore_1        
			{
				String s1 = l;
	//   12   26:getstatic       #81  <Field String l>
	//   13   29:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   14   30:new             #564 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #565 <Method void StringBuilder()>
	//   17   37:astore_3        
				stringbuilder.append("Failed to unregister receiver: ");
	//   18   38:aload_3         
	//   19   39:ldc2            #852 <String "Failed to unregister receiver: ">
	//   20   42:invokevirtual   #569 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   22   46:aload_3         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #853 <Method String IllegalArgumentException.getMessage()>
	//   25   51:invokevirtual   #569 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
				com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   27   55:aload_2         
	//   28   56:aload_3         
	//   29   57:invokevirtual   #574 <Method String StringBuilder.toString()>
	//   30   60:invokestatic    #375 <Method void o.e(String, String)>
			}
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//   31   63:invokestatic    #237 <Method Assembler Assembler.getInstance()>
	//   32   66:invokevirtual   #241 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   33   69:astore_1        
		assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StopSelectARobotPresentationFlow, ((AssetSetupUIServiceData) (null)));
	//   34   70:aload_1         
	//   35   71:getstatic       #856 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StopSelectARobotPresentationFlow>
	//   36   74:aconst_null     
	//   37   75:invokevirtual   #270 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		assetsetupuiservice.unregisterSubscriber(B);
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #94  <Field AssetSetupUIServiceDataCallback B>
	//   41   83:invokevirtual   #859 <Method boolean AssetSetupUIService.unregisterSubscriber(AssetSetupUIServiceDataCallback)>
	//   42   86:pop             
	//   43   87:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #862 <Method void BaseListActivity.onResume()>
		if(g == null || n < 0 || !b.b("android.permission.ACCESS_COARSE_LOCATION"))
	//*   2    4:aload_0         
	//*   3    5:getfield        #336 <Field List g>
	//*   4    8:ifnull          31
	//*   5   11:aload_0         
	//*   6   12:getfield        #87  <Field int n>
	//*   7   15:iflt            31
	//*   8   18:aload_0         
	//*   9   19:getfield        #282 <Field com.irobot.home.p.a b>
	//*  10   22:ldc2            #289 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  11   25:invokevirtual   #292 <Method boolean com.irobot.home.p.a.b(String)>
	//*  12   28:ifne            35
			j();
	//   13   31:aload_0         
	//   14   32:invokespecial   #863 <Method void j()>
	//   15   35:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #866 <Method void BaseListActivity.onStop()>
		n = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #87  <Field int n>
	//    5    9:return          
	}

	public void r()
	{
		com.irobot.home.LegalTermsActivity_.a(((android.content.Context) (this))).a(true).a(2);
	//    0    0:aload_0         
	//    1    1:invokestatic    #871 <Method LegalTermsActivity_$a com.irobot.home.LegalTermsActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #876 <Method LegalTermsActivity_$a com.irobot.home.LegalTermsActivity_$a.a(boolean)>
	//    4    8:iconst_2        
	//    5    9:invokevirtual   #877 <Method org.androidannotations.api.a.e com.irobot.home.LegalTermsActivity_$a.a(int)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void x()
	{
		a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #363 <Method void a(boolean)>
	//    3    5:return          
	}

	private static String A;
	private static final String l = com.irobot.home.util.j.r(((Class) (com/irobot/home/SelectRobotTypeActivity)).getSimpleName());
	private AssetSetupUIServiceDataCallback B;
	LinearLayout c;
	IRobotApplication d;
	k e;
	protected boolean f;
	List g;
	CustomerCareRestClient h;
	ArrayList i;
	ArrayList j;
	HashMap k;
	private ad m;
	private int n;
	private TermsInfo o;
	private d p;
	private v q;
	private v r;
	private v s;
	private RobotTypeListItem t;
	private RobotTypeListItem u;
	private RobotTypeListItem v;
	private RobotTypeListItem w;
	private BluetoothStateReceiver x;
	private AlertDialog y;
	private BluetoothAdapter z;

	static 
	{
	//    0    0:ldc1            #2   <Class SelectRobotTypeActivity>
	//    1    2:invokevirtual   #74  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #79  <Method String j.r(String)>
	//    3    8:putstatic       #81  <Field String l>
	//*   4   11:return          
	}
}
