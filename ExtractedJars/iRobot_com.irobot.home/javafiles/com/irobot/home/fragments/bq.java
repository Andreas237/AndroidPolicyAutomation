// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.BroadcastSetupActivity;
import com.irobot.home.IRobotApplication;
import com.irobot.home.b.aa;
import com.irobot.home.i.a;
import com.irobot.home.util.*;
import java.util.*;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class bq extends g
	implements android.widget.AdapterView.OnItemClickListener
{
	public static interface a
	{

		public abstract void a(AssetInfo assetinfo);
	}


	public bq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void g()>
		f = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayList()>
	//    6   12:putfield        #49  <Field List f>
		g = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #46  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #47  <Method void ArrayList()>
	//   11   23:putfield        #51  <Field ArrayList g>
	//   12   26:aload_0         
	//   13   27:iconst_m1       
	//   14   28:putfield        #53  <Field int j>
		k = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #55  <Field Context k>
		l = ((AssetSetupUIServiceDataCallback) (new AssetSetupUIServiceDataCallback() {

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
										a[AssetSetupUIServiceViewState.DiscoveryStateChanged.ordinal()] = 1;
								//    4    9:getstatic       #20  <Field int[] a>
								//    5   12:getstatic       #24  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.DiscoveryStateChanged>
								//    6   15:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
								//    7   18:iconst_1        
								//    8   19:iastore         
									}
								//*   9   20:getstatic       #20  <Field int[] a>
								//*  10   23:getstatic       #31  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.DiscoveredBleAssetsListUpdated>
								//*  11   26:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
								//*  12   29:iconst_2        
								//*  13   30:iastore         
								//*  14   31:getstatic       #20  <Field int[] a>
								//*  15   34:getstatic       #34  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ShowDontSeeMyRobotOption>
								//*  16   37:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
								//*  17   40:iconst_3        
								//*  18   41:iastore         
								//*  19   42:getstatic       #20  <Field int[] a>
								//*  20   45:getstatic       #37  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.HideDontSeeMyRobotOption>
								//*  21   48:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
								//*  22   51:iconst_4        
								//*  23   52:iastore         
								//*  24   53:getstatic       #20  <Field int[] a>
								//*  25   56:getstatic       #40  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ProceedToBleProvisioning>
								//*  26   59:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
								//*  27   62:iconst_5        
								//*  28   63:iastore         
								//*  29   64:getstatic       #20  <Field int[] a>
								//*  30   67:getstatic       #43  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ProceedToWifiProvisioning>
								//*  31   70:invokevirtual   #28  <Method int AssetSetupUIServiceViewState.ordinal()>
								//*  32   73:bipush          6
								//*  33   75:iastore         
								//*  34   76:return          
									catch(NoSuchFieldError nosuchfielderror) { }
								//   35   77:astore_0        
									try
									{
										a[AssetSetupUIServiceViewState.DiscoveredBleAssetsListUpdated.ordinal()] = 2;
									}
								//*  36   78:goto            20
									catch(NoSuchFieldError nosuchfielderror1) { }
								//   37   81:astore_0        
									try
									{
										a[AssetSetupUIServiceViewState.ShowDontSeeMyRobotOption.ordinal()] = 3;
									}
								//*  38   82:goto            31
									catch(NoSuchFieldError nosuchfielderror2) { }
								//   39   85:astore_0        
									try
									{
										a[AssetSetupUIServiceViewState.HideDontSeeMyRobotOption.ordinal()] = 4;
									}
								//*  40   86:goto            42
									catch(NoSuchFieldError nosuchfielderror3) { }
								//   41   89:astore_0        
									try
									{
										a[AssetSetupUIServiceViewState.ProceedToBleProvisioning.ordinal()] = 5;
									}
								//*  42   90:goto            53
									catch(NoSuchFieldError nosuchfielderror4) { }
								//   43   93:astore_0        
									try
									{
										a[AssetSetupUIServiceViewState.ProceedToWifiProvisioning.ordinal()] = 6;
									}
								//*  44   94:goto            64
									catch(NoSuchFieldError nosuchfielderror5) { }
								//   45   97:astore_0        
								//*  46   98:return          
								}
							}

							boolean flag;
							switch(com.irobot.home.fragments._cls3.a[((AssetSetupUIServiceViewState) (obj)).ordinal()])
			//*  14   35:getstatic       #47  <Field int[] com.irobot.home.fragments.bq$3.a>
			//*  15   38:aload_3         
			//*  16   39:invokevirtual   #51  <Method int AssetSetupUIServiceViewState.ordinal()>
			//*  17   42:iaload          
							{
			//*  18   43:tableswitch     1 6: default 80
			//			               1 183
			//			               2 169
			//			               3 154
			//			               4 144
			//			               5 130
			//			               6 120
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
								com.irobot.home.fragments.bq.a(a);
			//   37  120:aload_0         
			//   38  121:getfield        #12  <Field bq a>
			//   39  124:invokestatic    #77  <Method void com.irobot.home.fragments.bq.a(bq)>
								continue;
			//   40  127:goto            14

							case 5: // '\005'
								com.irobot.home.fragments.bq.a(a, assetsetupuiservicedata.discoveredAssetBeingProvisioned());
			//   41  130:aload_0         
			//   42  131:getfield        #12  <Field bq a>
			//   43  134:aload_1         
			//   44  135:invokevirtual   #81  <Method DiscoveredAsset AssetSetupUIServiceData.discoveredAssetBeingProvisioned()>
			//   45  138:invokestatic    #84  <Method void com.irobot.home.fragments.bq.a(bq, DiscoveredAsset)>
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
							com.irobot.home.fragments.bq.a(((bq) (obj)), flag);
			//   58  161:aload_3         
			//   59  162:iload_2         
			//   60  163:invokestatic    #87  <Method void com.irobot.home.fragments.bq.a(bq, boolean)>
							continue;
			//   61  166:goto            14
						}
						com.irobot.home.fragments.bq.a(a, assetsetupuiservicedata.getDiscoveredBleAssets());
			//   62  169:aload_0         
			//   63  170:getfield        #12  <Field bq a>
			//   64  173:aload_1         
			//   65  174:invokevirtual   #90  <Method ArrayList AssetSetupUIServiceData.getDiscoveredBleAssets()>
			//   66  177:invokestatic    #93  <Method void com.irobot.home.fragments.bq.a(bq, ArrayList)>
						continue;
			//   67  180:goto            14
					}
					com.irobot.home.fragments.bq.a(a, assetsetupuiservicedata.getDiscoveryState());
			//   68  183:aload_0         
			//   69  184:getfield        #12  <Field bq a>
			//   70  187:aload_1         
			//   71  188:invokevirtual   #97  <Method DiscoveryState AssetSetupUIServiceData.getDiscoveryState()>
			//   72  191:invokestatic    #100 <Method void com.irobot.home.fragments.bq.a(bq, DiscoveryState)>
				} while(true);
			//   73  194:goto            14
			//   74  197:return          
			}

			final bq a;

			
			{
				a = bq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field bq a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   18   36:aload_0         
	//   19   37:new             #10  <Class bq$2>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #58  <Method void bq$2(bq)>
	//   23   45:putfield        #60  <Field AssetSetupUIServiceDataCallback l>
	//   24   48:return          
	}

	private void a(int i1)
	{
		BroadcastSetupActivity broadcastsetupactivity = (BroadcastSetupActivity)getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Activity getActivity()>
	//    2    4:checkcast       #68  <Class BroadcastSetupActivity>
	//    3    7:astore_2        
		if(broadcastsetupactivity == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       20
		{
			o.d("PickABLERobot", "BroadcastSetupActivity is null when setting discovered robot count in title.");
	//    6   12:ldc1            #70  <String "PickABLERobot">
	//    7   14:ldc1            #72  <String "BroadcastSetupActivity is null when setting discovered robot count in title.">
	//    8   16:invokestatic    #77  <Method void o.d(String, String)>
			return;
	//    9   19:return          
		} else
		{
			broadcastsetupactivity.runOnUiThread(new Runnable(i1, broadcastsetupactivity) {

				public void run()
				{
					c.e.setVisibility(8);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field bq c>
				//    2    4:getfield        #33  <Field LinearLayout bq.e>
				//    3    7:bipush          8
				//    4    9:invokevirtual   #38  <Method void LinearLayout.setVisibility(int)>
					String s;
					if(a > 0)
				//*   5   12:aload_0         
				//*   6   13:getfield        #22  <Field int a>
				//*   7   16:ifle            90
					{
						c.d.setVisibility(4);
				//    8   19:aload_0         
				//    9   20:getfield        #20  <Field bq c>
				//   10   23:getfield        #42  <Field FrameLayout bq.d>
				//   11   26:iconst_4        
				//   12   27:invokevirtual   #45  <Method void FrameLayout.setVisibility(int)>
						String s1 = c.getResources().getQuantityString(0x7f0d0023, a);
				//   13   30:aload_0         
				//   14   31:getfield        #20  <Field bq c>
				//   15   34:invokevirtual   #49  <Method Resources bq.getResources()>
				//   16   37:ldc1            #50  <Int 0x7f0d0023>
				//   17   39:aload_0         
				//   18   40:getfield        #22  <Field int a>
				//   19   43:invokevirtual   #56  <Method String Resources.getQuantityString(int, int)>
				//   20   46:astore_2        
						c.e.setVisibility(0);
				//   21   47:aload_0         
				//   22   48:getfield        #20  <Field bq c>
				//   23   51:getfield        #33  <Field LinearLayout bq.e>
				//   24   54:iconst_0        
				//   25   55:invokevirtual   #38  <Method void LinearLayout.setVisibility(int)>
						s = s1;
				//   26   58:aload_2         
				//   27   59:astore_1        
						if(1 < a)
				//*  28   60:iconst_1        
				//*  29   61:aload_0         
				//*  30   62:getfield        #22  <Field int a>
				//*  31   65:icmpge          127
							s = String.format(s1, new Object[] {
								Integer.valueOf(a)
							});
				//   32   68:aload_2         
				//   33   69:iconst_1        
				//   34   70:anewarray       Object[]
				//   35   73:dup             
				//   36   74:iconst_0        
				//   37   75:aload_0         
				//   38   76:getfield        #22  <Field int a>
				//   39   79:invokestatic    #62  <Method Integer Integer.valueOf(int)>
				//   40   82:aastore         
				//   41   83:invokestatic    #68  <Method String String.format(String, Object[])>
				//   42   86:astore_1        
					} else
				//*  43   87:goto            127
					if(-1 == a)
				//*  44   90:iconst_m1       
				//*  45   91:aload_0         
				//*  46   92:getfield        #22  <Field int a>
				//*  47   95:icmpne          125
					{
						c.d.setVisibility(0);
				//   48   98:aload_0         
				//   49   99:getfield        #20  <Field bq c>
				//   50  102:getfield        #42  <Field FrameLayout bq.d>
				//   51  105:iconst_0        
				//   52  106:invokevirtual   #45  <Method void FrameLayout.setVisibility(int)>
						s = c.getResources().getString(0x7f0f07dd);
				//   53  109:aload_0         
				//   54  110:getfield        #20  <Field bq c>
				//   55  113:invokevirtual   #49  <Method Resources bq.getResources()>
				//   56  116:ldc1            #69  <Int 0x7f0f07dd>
				//   57  118:invokevirtual   #73  <Method String Resources.getString(int)>
				//   58  121:astore_1        
					} else
				//*  59  122:goto            127
					{
						s = null;
				//   60  125:aconst_null     
				//   61  126:astore_1        
					}
					if(s != null)
				//*  62  127:aload_1         
				//*  63  128:ifnull          139
						b.a(s);
				//   64  131:aload_0         
				//   65  132:getfield        #24  <Field BroadcastSetupActivity b>
				//   66  135:aload_1         
				//   67  136:invokevirtual   #78  <Method void BroadcastSetupActivity.a(String)>
				//   68  139:return          
				}

				final int a;
				final BroadcastSetupActivity b;
				final bq c;

			
			{
				c = bq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field bq c>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int a>
				b = broadcastsetupactivity;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field BroadcastSetupActivity b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   10   20:aload_2         
	//   11   21:new             #8   <Class bq$1>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:aload_2         
	//   16   28:invokespecial   #80  <Method void bq$1(bq, int, BroadcastSetupActivity)>
	//   17   31:invokevirtual   #84  <Method void BroadcastSetupActivity.runOnUiThread(Runnable)>
			return;
	//   18   34:return          
		}
	}

	private void a(DiscoveredAsset discoveredasset)
	{
		if(i != null && discoveredasset != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field bq$a i>
	//*   2    4:ifnull          24
	//*   3    7:aload_1         
	//*   4    8:ifnull          24
			i.a(discoveredasset.assetInfo());
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field bq$a i>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #93  <Method AssetInfo DiscoveredAsset.assetInfo()>
	//    9   19:invokeinterface #96  <Method void com.irobot.home.fragments.bq$a.a(AssetInfo)>
	//   10   24:return          
	}

	private void a(DiscoveryState discoverystate)
	{
	//    0    0:return          
	}

	static void a(bq bq1)
	{
		bq1.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void f()>
	//    2    4:return          
	}

	static void a(bq bq1, DiscoveredAsset discoveredasset)
	{
		bq1.a(discoveredasset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #102 <Method void a(DiscoveredAsset)>
	//    3    5:return          
	}

	static void a(bq bq1, DiscoveryState discoverystate)
	{
		bq1.a(discoverystate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #105 <Method void a(DiscoveryState)>
	//    3    5:return          
	}

	static void a(bq bq1, ArrayList arraylist)
	{
		bq1.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #109 <Method void a(ArrayList)>
	//    3    5:return          
	}

	static void a(bq bq1, boolean flag)
	{
		bq1.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #113 <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(ArrayList arraylist)
	{
		BroadcastSetupActivity broadcastsetupactivity = (BroadcastSetupActivity)getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Activity getActivity()>
	//    2    4:checkcast       #68  <Class BroadcastSetupActivity>
	//    3    7:astore_2        
		if(broadcastsetupactivity == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       20
		{
			o.d("PickABLERobot", "BroadcastSetupActivity is null when disovering ble assets.");
	//    6   12:ldc1            #70  <String "PickABLERobot">
	//    7   14:ldc1            #115 <String "BroadcastSetupActivity is null when disovering ble assets.">
	//    8   16:invokestatic    #77  <Method void o.d(String, String)>
			return;
	//    9   19:return          
		}
		g = arraylist;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #51  <Field ArrayList g>
		a(arraylist.size());
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #119 <Method int ArrayList.size()>
	//   16   30:invokespecial   #121 <Method void a(int)>
		if(f.size() == 0 && android.os.Build.VERSION.SDK_INT == 23 && !com.irobot.home.util.j.j(k))
	//*  17   33:aload_0         
	//*  18   34:getfield        #49  <Field List f>
	//*  19   37:invokeinterface #124 <Method int List.size()>
	//*  20   42:ifne            68
	//*  21   45:getstatic       #129 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   48:bipush          23
	//*  23   50:icmpne          68
	//*  24   53:aload_0         
	//*  25   54:getfield        #55  <Field Context k>
	//*  26   57:invokestatic    #134 <Method boolean j.j(Context)>
	//*  27   60:ifne            68
		{
			broadcastsetupactivity.o();
	//   28   63:aload_2         
	//   29   64:invokevirtual   #137 <Method void BroadcastSetupActivity.o()>
			return;
	//   30   67:return          
		} else
		{
			h.clear();
	//   31   68:aload_0         
	//   32   69:getfield        #139 <Field aa h>
	//   33   72:invokevirtual   #144 <Method void aa.clear()>
			h.addAll(((java.util.Collection) (arraylist)));
	//   34   75:aload_0         
	//   35   76:getfield        #139 <Field aa h>
	//   36   79:aload_1         
	//   37   80:invokevirtual   #148 <Method void aa.addAll(java.util.Collection)>
			h.notifyDataSetChanged();
	//   38   83:aload_0         
	//   39   84:getfield        #139 <Field aa h>
	//   40   87:invokevirtual   #151 <Method void aa.notifyDataSetChanged()>
			return;
	//   41   90:return          
		}
	}

	private void a(boolean flag)
	{
		BroadcastSetupActivity broadcastsetupactivity = (BroadcastSetupActivity)getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Activity getActivity()>
	//    2    4:checkcast       #68  <Class BroadcastSetupActivity>
	//    3    7:astore_2        
		if(broadcastsetupactivity != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          25
		{
			if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            21
			{
				broadcastsetupactivity.k();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #155 <Method void BroadcastSetupActivity.k()>
				return;
	//   10   20:return          
			}
			broadcastsetupactivity.l();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #157 <Method void BroadcastSetupActivity.l()>
		}
	//   13   25:return          
	}

	private void d()
	{
		h = new aa(((Context) (getActivity())));
	//    0    0:aload_0         
	//    1    1:new             #141 <Class aa>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method Activity getActivity()>
	//    5    9:invokespecial   #160 <Method void aa(Context)>
	//    6   12:putfield        #139 <Field aa h>
		c = (ListView)getActivity().findViewById(0x102000a);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #66  <Method Activity getActivity()>
	//   10   20:ldc1            #161 <Int 0x102000a>
	//   11   22:invokevirtual   #167 <Method View Activity.findViewById(int)>
	//   12   25:checkcast       #169 <Class ListView>
	//   13   28:putfield        #171 <Field ListView c>
		c.setAdapter(((android.widget.ListAdapter) (h)));
	//   14   31:aload_0         
	//   15   32:getfield        #171 <Field ListView c>
	//   16   35:aload_0         
	//   17   36:getfield        #139 <Field aa h>
	//   18   39:invokevirtual   #175 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		c.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   19   42:aload_0         
	//   20   43:getfield        #171 <Field ListView c>
	//   21   46:aload_0         
	//   22   47:invokevirtual   #179 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//   23   50:return          
	}

	private void e()
	{
		a(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokespecial   #121 <Method void a(int)>
		d.setVisibility(0);
	//    3    5:aload_0         
	//    4    6:getfield        #181 <Field FrameLayout d>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #186 <Method void FrameLayout.setVisibility(int)>
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//    7   13:invokestatic    #192 <Method Assembler Assembler.getInstance()>
	//    8   16:invokevirtual   #196 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    9   19:astore_1        
		assetsetupuiservice.registerUISubscriber(l);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #60  <Field AssetSetupUIServiceDataCallback l>
	//   13   25:invokevirtual   #202 <Method boolean AssetSetupUIService.registerUISubscriber(AssetSetupUIServiceDataCallback)>
	//   14   28:pop             
		assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StartPickBLERobotPresentationFlow, ((AssetSetupUIServiceData) (null)));
	//   15   29:aload_1         
	//   16   30:getstatic       #208 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StartPickBLERobotPresentationFlow>
	//   17   33:aconst_null     
	//   18   34:invokevirtual   #212 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//   19   37:return          
	}

	private void f()
	{
		i.a(((AssetInfo) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field bq$a i>
	//    2    4:aconst_null     
	//    3    5:invokeinterface #96  <Method void com.irobot.home.fragments.bq$a.a(AssetInfo)>
	//    4   10:return          
	}

	void a()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void d()>
	//    2    4:return          
	}

	public void a(a a1)
	{
		i = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field bq$a i>
	//    3    5:return          
	}

	public void b()
	{
		f.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field List f>
	//    2    4:invokeinterface #216 <Method void List.clear()>
		h.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #139 <Field aa h>
	//    5   13:invokevirtual   #144 <Method void aa.clear()>
		g.clear();
	//    6   16:aload_0         
	//    7   17:getfield        #51  <Field ArrayList g>
	//    8   20:invokevirtual   #217 <Method void ArrayList.clear()>
	//    9   23:return          
	}

	public void c()
	{
		BroadcastSetupActivity broadcastsetupactivity = (BroadcastSetupActivity)getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Activity getActivity()>
	//    2    4:checkcast       #68  <Class BroadcastSetupActivity>
	//    3    7:astore_1        
		if(broadcastsetupactivity != null && broadcastsetupactivity.f())
	//*   4    8:aload_1         
	//*   5    9:ifnull          23
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #220 <Method boolean BroadcastSetupActivity.f()>
	//*   8   16:ifeq            23
			b();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #222 <Method void b()>
	//   11   23:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #226 <Method void g.onAttach(Activity)>
		k = activity.getApplicationContext();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #230 <Method Context Activity.getApplicationContext()>
	//    6   10:putfield        #55  <Field Context k>
	//    7   13:return          
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #232 <Method void g.onAttach(Context)>
		k = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #55  <Field Context k>
	//    6   10:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
	{
		adapterview = ((AdapterView) ((DiscoveredAsset)g.get(i1)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList g>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #238 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #89  <Class DiscoveredAsset>
	//    5   11:astore_1        
		view = ((View) (Assembler.getInstance().getAssetSetupUIService()));
	//    6   12:invokestatic    #192 <Method Assembler Assembler.getInstance()>
	//    7   15:invokevirtual   #196 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    8   18:astore_2        
		AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//    9   19:invokestatic    #244 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   10   22:astore          6
		assetsetupuiservicedata.setDiscoveredAssetForProvisioning(((DiscoveredAsset) (adapterview)));
	//   11   24:aload           6
	//   12   26:aload_1         
	//   13   27:invokevirtual   #247 <Method void AssetSetupUIServiceData.setDiscoveredAssetForProvisioning(DiscoveredAsset)>
		((AssetSetupUIService) (view)).sendCommand(AssetSetupUIServiceCommand.AssetSelectedForProvisioning, assetsetupuiservicedata);
	//   14   30:aload_2         
	//   15   31:getstatic       #250 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.AssetSelectedForProvisioning>
	//   16   34:aload           6
	//   17   36:invokevirtual   #212 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
	//   18   39:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #254 <Method void g.onPause()>
		com.irobot.home.i.a a1 = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//    2    4:invokestatic    #192 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #258 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    4   10:checkcast       #260 <Class a>
	//    5   13:astore_1        
		if(a1 != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          23
			a1.a(((Object) (this)));
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:invokevirtual   #263 <Method void a.a(Object)>
		if(l != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #60  <Field AssetSetupUIServiceDataCallback l>
	//*  13   27:ifnull          54
		{
			AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//   14   30:invokestatic    #192 <Method Assembler Assembler.getInstance()>
	//   15   33:invokevirtual   #196 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//   16   36:astore_1        
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StopPickBLERobotPresentationFlow, ((AssetSetupUIServiceData) (null)));
	//   17   37:aload_1         
	//   18   38:getstatic       #266 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StopPickBLERobotPresentationFlow>
	//   19   41:aconst_null     
	//   20   42:invokevirtual   #212 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
			assetsetupuiservice.unregisterSubscriber(l);
	//   21   45:aload_1         
	//   22   46:aload_0         
	//   23   47:getfield        #60  <Field AssetSetupUIServiceDataCallback l>
	//   24   50:invokevirtual   #269 <Method boolean AssetSetupUIService.unregisterSubscriber(AssetSetupUIServiceDataCallback)>
	//   25   53:pop             
		}
	//   26   54:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #272 <Method void g.onResume()>
		BroadcastSetupActivity broadcastsetupactivity = (BroadcastSetupActivity)getActivity();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #66  <Method Activity getActivity()>
	//    4    8:checkcast       #68  <Class BroadcastSetupActivity>
	//    5   11:astore_1        
		if(broadcastsetupactivity != null && broadcastsetupactivity.f())
	//*   6   12:aload_1         
	//*   7   13:ifnull          27
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #220 <Method boolean BroadcastSetupActivity.f()>
	//*  10   20:ifeq            27
			e();
	//   11   23:aload_0         
	//   12   24:invokespecial   #274 <Method void e()>
	//   13   27:return          
	}

	IRobotApplication a;
	AssetSoftwareUpdateUtils b;
	ListView c;
	FrameLayout d;
	LinearLayout e;
	List f;
	ArrayList g;
	private aa h;
	private a i;
	private final int j = -1;
	private Context k;
	private AssetSetupUIServiceDataCallback l;
}
