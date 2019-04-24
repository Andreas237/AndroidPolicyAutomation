// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetSetupUIService;
import com.irobot.core.AssetSetupUIServiceCommand;
import com.irobot.core.AssetSetupUIServiceData;
import com.irobot.core.AssetSetupUIServiceDataCallback;
import com.irobot.core.AssetSetupUIServiceViewState;
import com.irobot.core.DiscoveredAsset;
import com.irobot.core.DiscoveredWifiAsset;
import com.irobot.core.DiscoveryType;
import com.irobot.core.NetworkAddress;
import com.irobot.core.RobotDiscoveryListItem;
import com.irobot.home.b.ac;
import com.irobot.home.r.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, RoombaAddRobotSetupActivity_, BroadcastSetupActivity_, WiFiInfoActivity_, 
//			IRobotApplication

public class Roomba900SetupActivity extends BaseFragmentActivity
{
	private class a
		implements Runnable
	{

		public void run()
		{
			AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
		//    0    0:invokestatic    #28  <Method Assembler Assembler.getInstance()>
		//    1    3:invokevirtual   #32  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
		//    2    6:astore_1        
			assetsetupuiservice.registerUISubscriber(com.irobot.home.Roomba900SetupActivity.a(a));
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #14  <Field Roomba900SetupActivity a>
		//    6   12:invokestatic    #35  <Method AssetSetupUIServiceDataCallback com.irobot.home.Roomba900SetupActivity.a(Roomba900SetupActivity)>
		//    7   15:invokevirtual   #41  <Method boolean AssetSetupUIService.registerUISubscriber(AssetSetupUIServiceDataCallback)>
		//    8   18:pop             
			AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
		//    9   19:invokestatic    #47  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
		//   10   22:astore_2        
			assetsetupuiservicedata.setDiscoveryTypeForListItemsPresentation(DiscoveryType.Wifi);
		//   11   23:aload_2         
		//   12   24:getstatic       #53  <Field DiscoveryType DiscoveryType.Wifi>
		//   13   27:invokevirtual   #57  <Method void AssetSetupUIServiceData.setDiscoveryTypeForListItemsPresentation(DiscoveryType)>
			assetsetupuiservicedata.setDiscoveryIdForListItemsPresentation(0);
		//   14   30:aload_2         
		//   15   31:iconst_0        
		//   16   32:invokevirtual   #61  <Method void AssetSetupUIServiceData.setDiscoveryIdForListItemsPresentation(int)>
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StartFetchingDiscoveryListItems, assetsetupuiservicedata);
		//   17   35:aload_1         
		//   18   36:getstatic       #67  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StartFetchingDiscoveryListItems>
		//   19   39:aload_2         
		//   20   40:invokevirtual   #71  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		//   21   43:return          
		}

		final Roomba900SetupActivity a;

		private a()
		{
			a = Roomba900SetupActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field Roomba900SetupActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}

	}

	private class b
		implements Runnable
	{

		public void run()
		{
			AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
		//    0    0:invokestatic    #29  <Method Assembler Assembler.getInstance()>
		//    1    3:invokevirtual   #33  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
		//    2    6:astore_1        
			assetsetupuiservice.unregisterSubscriber(com.irobot.home.Roomba900SetupActivity.a(a));
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #15  <Field Roomba900SetupActivity a>
		//    6   12:invokestatic    #36  <Method AssetSetupUIServiceDataCallback com.irobot.home.Roomba900SetupActivity.a(Roomba900SetupActivity)>
		//    7   15:invokevirtual   #42  <Method boolean AssetSetupUIService.unregisterSubscriber(AssetSetupUIServiceDataCallback)>
		//    8   18:pop             
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StopFetchingDiscoveryListItems, ((AssetSetupUIServiceData) (null)));
		//    9   19:aload_1         
		//   10   20:getstatic       #48  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StopFetchingDiscoveryListItems>
		//   11   23:aconst_null     
		//   12   24:invokevirtual   #52  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		//   13   27:return          
		}

		final Roomba900SetupActivity a;

		private b()
		{
			a = Roomba900SetupActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field Roomba900SetupActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public Roomba900SetupActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:new             #43  <Class a>
	//    5    9:dup             
	//    6   10:ldc1            #45  <String "PresenterLifecycleThread">
	//    7   12:iconst_0        
	//    8   13:invokespecial   #48  <Method void a(String, boolean)>
	//    9   16:invokestatic    #54  <Method ExecutorService Executors.newFixedThreadPool(int, java.util.concurrent.ThreadFactory)>
	//   10   19:putfield        #56  <Field ExecutorService i>
		j = ((AssetSetupUIServiceDataCallback) (new AssetSetupUIServiceDataCallback() {

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
					static class _cls3
					{

						static final int a[];

						static 
						{
							a = new int[AssetSetupUIServiceViewState.values().length];
						//    0    0:invokestatic    #18  <Method AssetSetupUIServiceViewState[] AssetSetupUIServiceViewState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] a>
							try
							{
								a[AssetSetupUIServiceViewState.RobotDiscovered.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.RobotDiscovered>
						//    6   15:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.DiscoveryInProgress>
						//*  11   26:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] a>
						//*  15   34:getstatic       #34  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.DiscoveryTerminated>
						//*  16   37:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:getstatic       #20  <Field int[] a>
						//*  20   45:getstatic       #37  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.RefreshRobotDiscoveryList>
						//*  21   48:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:getstatic       #20  <Field int[] a>
						//*  25   56:getstatic       #40  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.NavigateToProvisioningFlow>
						//*  26   59:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  27   62:iconst_5        
						//*  28   63:iastore         
						//*  29   64:getstatic       #20  <Field int[] a>
						//*  30   67:getstatic       #43  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.NavigateToAddRobotFlow>
						//*  31   70:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  32   73:bipush          6
						//*  33   75:iastore         
						//*  34   76:getstatic       #20  <Field int[] a>
						//*  35   79:getstatic       #46  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.NavigateToWifiSettings>
						//*  36   82:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
						//*  37   85:bipush          7
						//*  38   87:iastore         
						//*  39   88:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   40   89:astore_0        
							try
							{
								a[AssetSetupUIServiceViewState.DiscoveryInProgress.ordinal()] = 2;
							}
						//*  41   90:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   42   93:astore_0        
							try
							{
								a[AssetSetupUIServiceViewState.DiscoveryTerminated.ordinal()] = 3;
							}
						//*  43   94:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   44   97:astore_0        
							try
							{
								a[AssetSetupUIServiceViewState.RefreshRobotDiscoveryList.ordinal()] = 4;
							}
						//*  45   98:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   46  101:astore_0        
							try
							{
								a[AssetSetupUIServiceViewState.NavigateToProvisioningFlow.ordinal()] = 5;
							}
						//*  47  102:goto            53
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   48  105:astore_0        
							try
							{
								a[AssetSetupUIServiceViewState.NavigateToAddRobotFlow.ordinal()] = 6;
							}
						//*  49  106:goto            64
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   50  109:astore_0        
							try
							{
								a[AssetSetupUIServiceViewState.NavigateToWifiSettings.ordinal()] = 7;
							}
						//*  51  110:goto            76
							catch(NoSuchFieldError nosuchfielderror6) { }
						//   52  113:astore_0        
						//*  53  114:return          
						}
					}

					switch(com.irobot.home._cls3.a[assetsetupuiserviceviewstate.ordinal()])
			//*  14   32:getstatic       #47  <Field int[] com.irobot.home.Roomba900SetupActivity$3.a>
			//*  15   35:aload_3         
			//*  16   36:invokevirtual   #51  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  17   39:iaload          
					{
			//*  18   40:tableswitch     1 7: default 84
			//			               1 198
			//			               2 187
			//			               3 177
			//			               4 163
			//			               5 153
			//			               6 139
			//			               7 129
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
						com.irobot.home.Roomba900SetupActivity.a(a, assetsetupuiservicedata.getSelectedDiscoveryListItem());
			//   43  139:aload_0         
			//   44  140:getfield        #12  <Field Roomba900SetupActivity a>
			//   45  143:aload_1         
			//   46  144:invokevirtual   #83  <Method RobotDiscoveryListItem AssetSetupUIServiceData.getSelectedDiscoveryListItem()>
			//   47  147:invokestatic    #86  <Method void com.irobot.home.Roomba900SetupActivity.a(Roomba900SetupActivity, RobotDiscoveryListItem)>
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
						com.irobot.home.Roomba900SetupActivity.a(a, assetsetupuiservicedata.getDiscoveryListItems());
			//   53  163:aload_0         
			//   54  164:getfield        #12  <Field Roomba900SetupActivity a>
			//   55  167:aload_1         
			//   56  168:invokevirtual   #92  <Method ArrayList AssetSetupUIServiceData.getDiscoveryListItems()>
			//   57  171:invokestatic    #95  <Method void com.irobot.home.Roomba900SetupActivity.a(Roomba900SetupActivity, ArrayList)>
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
						com.irobot.home.Roomba900SetupActivity.a(a, 0);
			//   63  187:aload_0         
			//   64  188:getfield        #12  <Field Roomba900SetupActivity a>
			//   65  191:iconst_0        
			//   66  192:invokestatic    #101 <Method void com.irobot.home.Roomba900SetupActivity.a(Roomba900SetupActivity, int)>
						break;

			//*  67  195:goto            13
					case 1: // '\001'
						com.irobot.home.Roomba900SetupActivity.a(a, assetsetupuiservicedata.getDiscoveredAsset());
			//   68  198:aload_0         
			//   69  199:getfield        #12  <Field Roomba900SetupActivity a>
			//   70  202:aload_1         
			//   71  203:invokevirtual   #105 <Method DiscoveredAsset AssetSetupUIServiceData.getDiscoveredAsset()>
			//   72  206:invokestatic    #108 <Method void com.irobot.home.Roomba900SetupActivity.a(Roomba900SetupActivity, DiscoveredAsset)>
						break;
					}
				} while(true);
			//*  73  209:goto            13
			//   74  212:return          
			}

			final Roomba900SetupActivity a;

			
			{
				a = Roomba900SetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field Roomba900SetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   11   22:aload_0         
	//   12   23:new             #6   <Class Roomba900SetupActivity$1>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:invokespecial   #59  <Method void Roomba900SetupActivity$1(Roomba900SetupActivity)>
	//   16   31:putfield        #61  <Field AssetSetupUIServiceDataCallback j>
	//   17   34:return          
	}

	static AssetSetupUIServiceDataCallback a(Roomba900SetupActivity roomba900setupactivity)
	{
		return roomba900setupactivity.j;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field AssetSetupUIServiceDataCallback j>
	//    2    4:areturn         
	}

	private void a(int k)
	{
		f(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #65  <Method void f(int)>
	//    3    5:return          
	}

	private void a(DiscoveredAsset discoveredasset)
	{
	//    0    0:return          
	}

	private void a(RobotDiscoveryListItem robotdiscoverylistitem)
	{
		robotdiscoverylistitem = ((RobotDiscoveryListItem) (robotdiscoverylistitem.getDiscoveredAsset()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #73  <Method DiscoveredAsset RobotDiscoveryListItem.getDiscoveredAsset()>
	//    2    4:astore_1        
		junit.b.a.a("RobotDiscoveryListItem expected to contain DiscoveredWifiAsset object", robotdiscoverylistitem instanceof DiscoveredWifiAsset);
	//    3    5:ldc1            #75  <String "RobotDiscoveryListItem expected to contain DiscoveredWifiAsset object">
	//    4    7:aload_1         
	//    5    8:instanceof      #77  <Class DiscoveredWifiAsset>
	//    6   11:invokestatic    #81  <Method void junit.b.a.a(String, boolean)>
		((DiscoveredAsset) (robotdiscoverylistitem)).assetInfo();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #87  <Method AssetInfo DiscoveredAsset.assetInfo()>
	//    9   18:pop             
		com.irobot.home.RoombaAddRobotSetupActivity_.a(((android.content.Context) (this))).a(((DiscoveredAsset) (robotdiscoverylistitem)).assetInfo().asJson()).b(((DiscoveredWifiAsset)robotdiscoverylistitem).networkAddress().host()).a(1);
	//   10   19:aload_0         
	//   11   20:invokestatic    #92  <Method RoombaAddRobotSetupActivity_$a com.irobot.home.RoombaAddRobotSetupActivity_.a(android.content.Context)>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #87  <Method AssetInfo DiscoveredAsset.assetInfo()>
	//   14   27:invokevirtual   #98  <Method String AssetInfo.asJson()>
	//   15   30:invokevirtual   #103 <Method RoombaAddRobotSetupActivity_$a com.irobot.home.RoombaAddRobotSetupActivity_$a.a(String)>
	//   16   33:aload_1         
	//   17   34:checkcast       #77  <Class DiscoveredWifiAsset>
	//   18   37:invokevirtual   #107 <Method NetworkAddress DiscoveredWifiAsset.networkAddress()>
	//   19   40:invokevirtual   #112 <Method String NetworkAddress.host()>
	//   20   43:invokevirtual   #114 <Method RoombaAddRobotSetupActivity_$a RoombaAddRobotSetupActivity_$a.b(String)>
	//   21   46:iconst_1        
	//   22   47:invokevirtual   #117 <Method org.androidannotations.api.a.e com.irobot.home.RoombaAddRobotSetupActivity_$a.a(int)>
	//   23   50:pop             
	//   24   51:return          
	}

	static void a(Roomba900SetupActivity roomba900setupactivity, int k)
	{
		roomba900setupactivity.a(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #120 <Method void a(int)>
	//    3    5:return          
	}

	static void a(Roomba900SetupActivity roomba900setupactivity, DiscoveredAsset discoveredasset)
	{
		roomba900setupactivity.a(discoveredasset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void a(DiscoveredAsset)>
	//    3    5:return          
	}

	static void a(Roomba900SetupActivity roomba900setupactivity, RobotDiscoveryListItem robotdiscoverylistitem)
	{
		roomba900setupactivity.a(robotdiscoverylistitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void a(RobotDiscoveryListItem)>
	//    3    5:return          
	}

	static void a(Roomba900SetupActivity roomba900setupactivity, ArrayList arraylist)
	{
		roomba900setupactivity.b(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void b(ArrayList)>
	//    3    5:return          
	}

	static void b(Roomba900SetupActivity roomba900setupactivity)
	{
		roomba900setupactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method void g()>
	//    2    4:return          
	}

	private void b(ArrayList arraylist)
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field ac h>
	//*   2    4:ifnonnull       49
		{
			h = new ac(((android.app.Activity) (this)), 0x7f0b00e5, ((java.util.List) (arraylist)));
	//    3    7:aload_0         
	//    4    8:new             #136 <Class ac>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:ldc1            #137 <Int 0x7f0b00e5>
	//    8   15:aload_1         
	//    9   16:invokespecial   #140 <Method void ac(android.app.Activity, int, java.util.List)>
	//   10   19:putfield        #134 <Field ac h>
			f.setAdapter(((android.widget.ListAdapter) (h)));
	//   11   22:aload_0         
	//   12   23:getfield        #142 <Field ListView f>
	//   13   26:aload_0         
	//   14   27:getfield        #134 <Field ac h>
	//   15   30:invokevirtual   #148 <Method void ListView.setAdapter(android.widget.ListAdapter)>
			f.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

				public void onItemClick(AdapterView adapterview, View view, int k, long l)
				{
					adapterview = ((AdapterView) (Assembler.getInstance().getAssetSetupUIService()));
				//    0    0:invokestatic    #29  <Method Assembler Assembler.getInstance()>
				//    1    3:invokevirtual   #33  <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
				//    2    6:astore_1        
					view = ((View) (AssetSetupUIServiceData.create()));
				//    3    7:invokestatic    #39  <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
				//    4   10:astore_2        
					((AssetSetupUIServiceData) (view)).setSelectedRobotListItemIndex(k);
				//    5   11:aload_2         
				//    6   12:iload_3         
				//    7   13:invokevirtual   #43  <Method void AssetSetupUIServiceData.setSelectedRobotListItemIndex(int)>
					((AssetSetupUIService) (adapterview)).sendCommand(AssetSetupUIServiceCommand.RobotListItemSelected, ((AssetSetupUIServiceData) (view)));
				//    8   16:aload_1         
				//    9   17:getstatic       #49  <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.RobotListItemSelected>
				//   10   20:aload_2         
				//   11   21:invokevirtual   #55  <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
				//   12   24:return          
				}

				final Roomba900SetupActivity a;

			
			{
				a = Roomba900SetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Roomba900SetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   16   33:aload_0         
	//   17   34:getfield        #142 <Field ListView f>
	//   18   37:new             #8   <Class Roomba900SetupActivity$2>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:invokespecial   #149 <Method void Roomba900SetupActivity$2(Roomba900SetupActivity)>
	//   22   45:invokevirtual   #153 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			return;
	//   23   48:return          
		} else
		{
			a(arraylist);
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #155 <Method void a(ArrayList)>
			return;
	//   27   54:return          
		}
	}

	static void c(Roomba900SetupActivity roomba900setupactivity)
	{
		roomba900setupactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void h()>
	//    2    4:return          
	}

	static void d(Roomba900SetupActivity roomba900setupactivity)
	{
		roomba900setupactivity.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #161 <Method void i()>
	//    2    4:return          
	}

	static String f()
	{
		return g;
	//    0    0:getstatic       #163 <Field String g>
	//    1    3:areturn         
	}

	private void g()
	{
		int k;
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field ac h>
	//*   2    4:ifnull          20
			k = h.getCount() - 1;
	//    3    7:aload_0         
	//    4    8:getfield        #134 <Field ac h>
	//    5   11:invokevirtual   #167 <Method int ac.getCount()>
	//    6   14:iconst_1        
	//    7   15:isub            
	//    8   16:istore_1        
		else
	//*   9   17:goto            22
			k = 0;
	//   10   20:iconst_0        
	//   11   21:istore_1        
		g(k);
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #169 <Method void g(int)>
	//   15   27:return          
	}

	private void h()
	{
		com.irobot.home.BroadcastSetupActivity_.a(((android.content.Context) (this))).a(true).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #174 <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #179 <Method BroadcastSetupActivity_$a com.irobot.home.BroadcastSetupActivity_$a.a(boolean)>
	//    4    8:invokevirtual   #182 <Method org.androidannotations.api.a.e com.irobot.home.BroadcastSetupActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	private void i()
	{
		startActivity(new Intent(((android.content.Context) (this)), com/irobot/home/WiFiInfoActivity_));
	//    0    0:aload_0         
	//    1    1:new             #184 <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:ldc1            #186 <Class WiFiInfoActivity_>
	//    5    8:invokespecial   #189 <Method void Intent(android.content.Context, Class)>
	//    6   11:invokevirtual   #193 <Method void startActivity(Intent)>
	//    7   14:return          
	}

	protected void a(ArrayList arraylist)
	{
		h.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field ac h>
	//    2    4:invokevirtual   #196 <Method void ac.clear()>
		h.addAll(((java.util.Collection) (arraylist)));
	//    3    7:aload_0         
	//    4    8:getfield        #134 <Field ac h>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #200 <Method void ac.addAll(java.util.Collection)>
		h.notifyDataSetChanged();
	//    7   15:aload_0         
	//    8   16:getfield        #134 <Field ac h>
	//    9   19:invokevirtual   #203 <Method void ac.notifyDataSetChanged()>
		f(arraylist.size() - 1);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #208 <Method int ArrayList.size()>
	//   13   27:iconst_1        
	//   14   28:isub            
	//   15   29:invokevirtual   #65  <Method void f(int)>
	//   16   32:return          
	}

	public void e()
	{
		Assembler.getInstance().getAssetSetupUIService().sendCommand(AssetSetupUIServiceCommand.ChangeWifiSettingsClicked, ((AssetSetupUIServiceData) (null)));
	//    0    0:invokestatic    #214 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #218 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:getstatic       #224 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.ChangeWifiSettingsClicked>
	//    3    9:aconst_null     
	//    4   10:invokevirtual   #230 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//    5   13:return          
	}

	protected void f(int k)
	{
		c.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field ProgressBar c>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #237 <Method void ProgressBar.setVisibility(int)>
		e.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #239 <Field CustomTextView e>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #242 <Method void CustomTextView.setVisibility(int)>
		d.setText(0x7f0f0301);
	//    8   16:aload_0         
	//    9   17:getfield        #244 <Field CustomTextView d>
	//   10   20:ldc1            #245 <Int 0x7f0f0301>
	//   11   22:invokevirtual   #248 <Method void CustomTextView.setText(int)>
		CustomTextView customtextview;
		if(k == 0)
	//*  12   25:iload_1         
	//*  13   26:ifne            43
		{
			customtextview = e;
	//   14   29:aload_0         
	//   15   30:getfield        #239 <Field CustomTextView e>
	//   16   33:astore_2        
			k = 0x7f0f04e3;
	//   17   34:ldc1            #249 <Int 0x7f0f04e3>
	//   18   36:istore_1        
		} else
	//*  19   37:aload_2         
	//*  20   38:iload_1         
	//*  21   39:invokevirtual   #248 <Method void CustomTextView.setText(int)>
	//*  22   42:return          
		{
			customtextview = e;
	//   23   43:aload_0         
	//   24   44:getfield        #239 <Field CustomTextView e>
	//   25   47:astore_2        
			k = 0x7f0f027c;
	//   26   48:ldc1            #250 <Int 0x7f0f027c>
	//   27   50:istore_1        
		}
		customtextview.setText(k);
	//*  28   51:goto            37
	}

	protected void g(int k)
	{
		c.setVisibility(4);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field ProgressBar c>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #237 <Method void ProgressBar.setVisibility(int)>
	//    4    8:return          
	}

	protected void onActivityResult(int k, int l, Intent intent)
	{
		if(k == 1 && l == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          25
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          25
		{
			if(!b)
	//*   6   10:aload_0         
	//*   7   11:getfield        #254 <Field boolean b>
	//*   8   14:ifne            21
				com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//    9   17:aload_0         
	//   10   18:invokestatic    #259 <Method void j.a(android.app.Activity)>
			finish();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #262 <Method void finish()>
		}
	//   13   25:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #265 <Method void BaseFragmentActivity.onStart()>
		i.submit(((Runnable) (new a())));
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ExecutorService i>
	//    4    8:new             #12  <Class Roomba900SetupActivity$a>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #268 <Method void Roomba900SetupActivity$a(Roomba900SetupActivity, Roomba900SetupActivity$1)>
	//    9   17:invokeinterface #274 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method void BaseFragmentActivity.onStop()>
		i.submit(((Runnable) (new b())));
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ExecutorService i>
	//    4    8:new             #15  <Class Roomba900SetupActivity$b>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #278 <Method void Roomba900SetupActivity$b(Roomba900SetupActivity, Roomba900SetupActivity$1)>
	//    9   17:invokeinterface #274 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   10   22:pop             
		RobotDiscoveryListItem robotdiscoverylistitem = (RobotDiscoveryListItem)h.getItem(h.getCount() - 1);
	//   11   23:aload_0         
	//   12   24:getfield        #134 <Field ac h>
	//   13   27:aload_0         
	//   14   28:getfield        #134 <Field ac h>
	//   15   31:invokevirtual   #167 <Method int ac.getCount()>
	//   16   34:iconst_1        
	//   17   35:isub            
	//   18   36:invokevirtual   #282 <Method Object ac.getItem(int)>
	//   19   39:checkcast       #69  <Class RobotDiscoveryListItem>
	//   20   42:astore_1        
		h.clear();
	//   21   43:aload_0         
	//   22   44:getfield        #134 <Field ac h>
	//   23   47:invokevirtual   #196 <Method void ac.clear()>
		h.add(((Object) (robotdiscoverylistitem)));
	//   24   50:aload_0         
	//   25   51:getfield        #134 <Field ac h>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #286 <Method void ac.add(Object)>
		h.notifyDataSetChanged();
	//   28   58:aload_0         
	//   29   59:getfield        #134 <Field ac h>
	//   30   62:invokevirtual   #203 <Method void ac.notifyDataSetChanged()>
	//   31   65:return          
	}

	private static final String g = "Roomba900SetupActivity";
	protected IRobotApplication a;
	protected boolean b;
	protected ProgressBar c;
	protected CustomTextView d;
	protected CustomTextView e;
	protected ListView f;
	private ac h;
	private final ExecutorService i = Executors.newFixedThreadPool(1, ((java.util.concurrent.ThreadFactory) (new com.irobot.home.r.a("PresenterLifecycleThread", false))));
	private AssetSetupUIServiceDataCallback j;

	static 
	{
	//    0    0:return          
	}
}
