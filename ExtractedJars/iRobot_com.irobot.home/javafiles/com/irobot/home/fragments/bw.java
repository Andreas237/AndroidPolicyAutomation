// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.*;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.irobot.core.*;
import com.irobot.home.BroadcastSetupActivity;
import com.irobot.home.IRobotApplication;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.WifiConfig;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomVideoView;
import java.util.*;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class bw extends g
{
	public static interface a
	{

		public abstract void a(int l);

		public abstract void a(String s);

		public abstract void b(String s);
	}

	class b extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(!a.isAdded())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field bw a>
		//*   2    4:invokevirtual   #23  <Method boolean bw.isAdded()>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			if(intent.getAction().equals("android.net.wifi.STATE_CHANGE"))
		//*   5   11:aload_2         
		//*   6   12:invokevirtual   #29  <Method String Intent.getAction()>
		//*   7   15:ldc1            #31  <String "android.net.wifi.STATE_CHANGE">
		//*   8   17:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*   9   20:ifeq            115
			{
				context = ((Context) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
		//   10   23:aload_2         
		//   11   24:ldc1            #39  <String "networkInfo">
		//   12   26:invokevirtual   #43  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//   13   29:checkcast       #45  <Class NetworkInfo>
		//   14   32:astore_1        
				intent = ((Intent) (new StringBuilder()));
		//   15   33:new             #47  <Class StringBuilder>
		//   16   36:dup             
		//   17   37:invokespecial   #48  <Method void StringBuilder()>
		//   18   40:astore_2        
				((StringBuilder) (intent)).append("WifiReceiver: ");
		//   19   41:aload_2         
		//   20   42:ldc1            #50  <String "WifiReceiver: ">
		//   21   44:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   22   47:pop             
				((StringBuilder) (intent)).append(((NetworkInfo) (context)).getState().name());
		//   23   48:aload_2         
		//   24   49:aload_1         
		//   25   50:invokevirtual   #58  <Method android.net.NetworkInfo$State NetworkInfo.getState()>
		//   26   53:invokevirtual   #63  <Method String android.net.NetworkInfo$State.name()>
		//   27   56:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   28   59:pop             
				o.b("SetupRV2NetworkFragment", ((StringBuilder) (intent)).toString());
		//   29   60:ldc1            #65  <String "SetupRV2NetworkFragment">
		//   30   62:aload_2         
		//   31   63:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   32   66:invokestatic    #73  <Method void o.b(String, String)>
				static class _cls2
				{

					static final int a[];
					static final int b[];
					static final int c[];

					static 
					{
						c = new int[WifiProvisioningStatus.values().length];
					//    0    0:invokestatic    #20  <Method WifiProvisioningStatus[] WifiProvisioningStatus.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #22  <Field int[] c>
						try
						{
							c[WifiProvisioningStatus.Started.ordinal()] = 1;
					//    4    9:getstatic       #22  <Field int[] c>
					//    5   12:getstatic       #26  <Field WifiProvisioningStatus WifiProvisioningStatus.Started>
					//    6   15:invokevirtual   #30  <Method int WifiProvisioningStatus.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #22  <Field int[] c>
					//*  10   23:getstatic       #33  <Field WifiProvisioningStatus WifiProvisioningStatus.ConnectedToAsset>
					//*  11   26:invokevirtual   #30  <Method int WifiProvisioningStatus.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #22  <Field int[] c>
					//*  15   34:getstatic       #36  <Field WifiProvisioningStatus WifiProvisioningStatus.SendingWifiConfig>
					//*  16   37:invokevirtual   #30  <Method int WifiProvisioningStatus.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #22  <Field int[] c>
					//*  20   45:getstatic       #39  <Field WifiProvisioningStatus WifiProvisioningStatus.CheckingConfiguration>
					//*  21   48:invokevirtual   #30  <Method int WifiProvisioningStatus.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:getstatic       #22  <Field int[] c>
					//*  25   56:getstatic       #42  <Field WifiProvisioningStatus WifiProvisioningStatus.ActivatingWifi>
					//*  26   59:invokevirtual   #30  <Method int WifiProvisioningStatus.ordinal()>
					//*  27   62:iconst_5        
					//*  28   63:iastore         
					//*  29   64:getstatic       #22  <Field int[] c>
					//*  30   67:getstatic       #45  <Field WifiProvisioningStatus WifiProvisioningStatus.VerifyingConnectionOnHomeNetwork>
					//*  31   70:invokevirtual   #30  <Method int WifiProvisioningStatus.ordinal()>
					//*  32   73:bipush          6
					//*  33   75:iastore         
					//*  34   76:getstatic       #22  <Field int[] c>
					//*  35   79:getstatic       #48  <Field WifiProvisioningStatus WifiProvisioningStatus.Finished>
					//*  36   82:invokevirtual   #30  <Method int WifiProvisioningStatus.ordinal()>
					//*  37   85:bipush          7
					//*  38   87:iastore         
					//*  39   88:invokestatic    #53  <Method AssetSetupUIServiceViewState[] AssetSetupUIServiceViewState.values()>
					//*  40   91:arraylength     
					//*  41   92:newarray        int[]
					//*  42   94:putstatic       #55  <Field int[] b>
					//*  43   97:getstatic       #55  <Field int[] b>
					//*  44  100:getstatic       #59  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.CurrentProvisioningStatus>
					//*  45  103:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  46  106:iconst_1        
					//*  47  107:iastore         
					//*  48  108:getstatic       #55  <Field int[] b>
					//*  49  111:getstatic       #63  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ConnectToSoftAp>
					//*  50  114:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  51  117:iconst_2        
					//*  52  118:iastore         
					//*  53  119:getstatic       #55  <Field int[] b>
					//*  54  122:getstatic       #66  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ConnectToHomeAp>
					//*  55  125:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  56  128:iconst_3        
					//*  57  129:iastore         
					//*  58  130:getstatic       #55  <Field int[] b>
					//*  59  133:getstatic       #69  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ReconnectedToIncorrectHomeAccessPoint>
					//*  60  136:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  61  139:iconst_4        
					//*  62  140:iastore         
					//*  63  141:getstatic       #55  <Field int[] b>
					//*  64  144:getstatic       #72  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.WifiProvisioningError>
					//*  65  147:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  66  150:iconst_5        
					//*  67  151:iastore         
					//*  68  152:getstatic       #55  <Field int[] b>
					//*  69  155:getstatic       #75  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.AssetDiscoveredOnHomeNetworkUpdated>
					//*  70  158:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  71  161:bipush          6
					//*  72  163:iastore         
					//*  73  164:getstatic       #55  <Field int[] b>
					//*  74  167:getstatic       #78  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.TransitionToProvisioningType>
					//*  75  170:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  76  173:bipush          7
					//*  77  175:iastore         
					//*  78  176:getstatic       #55  <Field int[] b>
					//*  79  179:getstatic       #81  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.Invalid>
					//*  80  182:invokevirtual   #60  <Method int AssetSetupUIServiceViewState.ordinal()>
					//*  81  185:bipush          8
					//*  82  187:iastore         
					//*  83  188:invokestatic    #86  <Method android.net.NetworkInfo$State[] android.net.NetworkInfo$State.values()>
					//*  84  191:arraylength     
					//*  85  192:newarray        int[]
					//*  86  194:putstatic       #88  <Field int[] a>
					//*  87  197:getstatic       #88  <Field int[] a>
					//*  88  200:getstatic       #92  <Field android.net.NetworkInfo$State android.net.NetworkInfo$State.CONNECTED>
					//*  89  203:invokevirtual   #93  <Method int android.net.NetworkInfo$State.ordinal()>
					//*  90  206:iconst_1        
					//*  91  207:iastore         
					//*  92  208:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   93  209:astore_0        
						try
						{
							c[WifiProvisioningStatus.ConnectedToAsset.ordinal()] = 2;
						}
					//*  94  210:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   95  213:astore_0        
						try
						{
							c[WifiProvisioningStatus.SendingWifiConfig.ordinal()] = 3;
						}
					//*  96  214:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   97  217:astore_0        
						try
						{
							c[WifiProvisioningStatus.CheckingConfiguration.ordinal()] = 4;
						}
					//*  98  218:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   99  221:astore_0        
						try
						{
							c[WifiProvisioningStatus.ActivatingWifi.ordinal()] = 5;
						}
					//* 100  222:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//  101  225:astore_0        
						try
						{
							c[WifiProvisioningStatus.VerifyingConnectionOnHomeNetwork.ordinal()] = 6;
						}
					//* 102  226:goto            64
						catch(NoSuchFieldError nosuchfielderror5) { }
					//  103  229:astore_0        
						try
						{
							c[WifiProvisioningStatus.Finished.ordinal()] = 7;
						}
					//* 104  230:goto            76
						catch(NoSuchFieldError nosuchfielderror6) { }
					//  105  233:astore_0        
						b = new int[AssetSetupUIServiceViewState.values().length];
						try
						{
							b[AssetSetupUIServiceViewState.CurrentProvisioningStatus.ordinal()] = 1;
						}
					//* 106  234:goto            88
						catch(NoSuchFieldError nosuchfielderror7) { }
					//  107  237:astore_0        
						try
						{
							b[AssetSetupUIServiceViewState.ConnectToSoftAp.ordinal()] = 2;
						}
					//* 108  238:goto            108
						catch(NoSuchFieldError nosuchfielderror8) { }
					//  109  241:astore_0        
						try
						{
							b[AssetSetupUIServiceViewState.ConnectToHomeAp.ordinal()] = 3;
						}
					//* 110  242:goto            119
						catch(NoSuchFieldError nosuchfielderror9) { }
					//  111  245:astore_0        
						try
						{
							b[AssetSetupUIServiceViewState.ReconnectedToIncorrectHomeAccessPoint.ordinal()] = 4;
						}
					//* 112  246:goto            130
						catch(NoSuchFieldError nosuchfielderror10) { }
					//  113  249:astore_0        
						try
						{
							b[AssetSetupUIServiceViewState.WifiProvisioningError.ordinal()] = 5;
						}
					//* 114  250:goto            141
						catch(NoSuchFieldError nosuchfielderror11) { }
					//  115  253:astore_0        
						try
						{
							b[AssetSetupUIServiceViewState.AssetDiscoveredOnHomeNetworkUpdated.ordinal()] = 6;
						}
					//* 116  254:goto            152
						catch(NoSuchFieldError nosuchfielderror12) { }
					//  117  257:astore_0        
						try
						{
							b[AssetSetupUIServiceViewState.TransitionToProvisioningType.ordinal()] = 7;
						}
					//* 118  258:goto            164
						catch(NoSuchFieldError nosuchfielderror13) { }
					//  119  261:astore_0        
						try
						{
							b[AssetSetupUIServiceViewState.Invalid.ordinal()] = 8;
						}
					//* 120  262:goto            176
						catch(NoSuchFieldError nosuchfielderror14) { }
					//  121  265:astore_0        
						a = new int[android.net.NetworkInfo.State.values().length];
						try
						{
							a[android.net.NetworkInfo.State.CONNECTED.ordinal()] = 1;
						}
					//* 122  266:goto            188
						catch(NoSuchFieldError nosuchfielderror15) { }
					//  123  269:astore_0        
					//* 124  270:return          
					}
				}

				if(_cls2.a[((NetworkInfo) (context)).getState().ordinal()] != 1)
		//*  33   69:getstatic       #78  <Field int[] bw$2.a>
		//*  34   72:aload_1         
		//*  35   73:invokevirtual   #58  <Method android.net.NetworkInfo$State NetworkInfo.getState()>
		//*  36   76:invokevirtual   #82  <Method int android.net.NetworkInfo$State.ordinal()>
		//*  37   79:iaload          
		//*  38   80:iconst_1        
		//*  39   81:icmpeq          85
					return;
		//   40   84:return          
				if(bw.a(a).contains("unknown ssid"))
		//*  41   85:aload_0         
		//*  42   86:getfield        #13  <Field bw a>
		//*  43   89:invokestatic    #85  <Method String bw.a(bw)>
		//*  44   92:ldc1            #87  <String "unknown ssid">
		//*  45   94:invokevirtual   #91  <Method boolean String.contains(CharSequence)>
		//*  46   97:ifeq            101
					return;
		//   47  100:return          
				a.b(bw.a(a));
		//   48  101:aload_0         
		//   49  102:getfield        #13  <Field bw a>
		//   50  105:aload_0         
		//   51  106:getfield        #13  <Field bw a>
		//   52  109:invokestatic    #85  <Method String bw.a(bw)>
		//   53  112:invokevirtual   #94  <Method void com.irobot.home.fragments.bw.b(String)>
			}
		//   54  115:return          
		}

		final bw a;

		b()
		{
			a = bw.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field bw a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}


	public bw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void g()>
		h = new b();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class bw$b>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #40  <Method void bw$b(bw)>
	//    7   13:putfield        #42  <Field bw$b h>
	//    8   16:aload_0         
	//    9   17:new             #6   <Class bw$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #43  <Method void bw$1(bw)>
	//   13   25:putfield        #45  <Field AssetSetupUIServiceDataCallback j>
		k = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #47  <Field boolean k>
	//   17   33:return          
	}

	static String a(bw bw1)
	{
		return bw1.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method String h()>
	//    2    4:areturn         
	}

	private void a(int l)
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field bw$a i>
	//*   2    4:ifnull          31
		{
			String s = getResources().getString(l);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #59  <Method Resources getResources()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #65  <Method String Resources.getString(int)>
	//    7   15:astore_2        
			i.b(s);
	//    8   16:aload_0         
	//    9   17:getfield        #55  <Field bw$a i>
	//   10   20:aload_2         
	//   11   21:invokeinterface #68  <Method void com.irobot.home.fragments.bw$a.b(String)>
			a(s);
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #70  <Method void a(String)>
		}
	//   15   31:return          
	}

	private void a(DiscoveredWifiAsset discoveredwifiasset)
	{
	//    0    0:return          
	}

	private void a(Error error)
	{
		if(error != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          89
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #74  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #75  <Method void StringBuilder()>
	//    5   11:astore_2        
			stringbuilder.append("Received error ");
	//    6   12:aload_2         
	//    7   13:ldc1            #77  <String "Received error ">
	//    8   15:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			stringbuilder.append(error.code());
	//   10   19:aload_2         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #87  <Method int Error.code()>
	//   13   24:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
			stringbuilder.append(" ");
	//   15   28:aload_2         
	//   16   29:ldc1            #92  <String " ">
	//   17   31:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(error.message());
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #95  <Method String Error.message()>
	//   22   40:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			o.e("SetupRV2NetworkFragment", stringbuilder.toString());
	//   24   44:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   25   46:aload_2         
	//   26   47:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   27   50:invokestatic    #105 <Method void o.e(String, String)>
			if(error.code() == 8 || error.code() == 16)
	//*  28   53:aload_1         
	//*  29   54:invokevirtual   #87  <Method int Error.code()>
	//*  30   57:bipush          8
	//*  31   59:icmpeq          71
	//*  32   62:aload_1         
	//*  33   63:invokevirtual   #87  <Method int Error.code()>
	//*  34   66:bipush          16
	//*  35   68:icmpne          75
				g();
	//   36   71:aload_0         
	//   37   72:invokespecial   #107 <Method void g()>
			i.a(error.code());
	//   38   75:aload_0         
	//   39   76:getfield        #55  <Field bw$a i>
	//   40   79:aload_1         
	//   41   80:invokevirtual   #87  <Method int Error.code()>
	//   42   83:invokeinterface #109 <Method void bw$a.a(int)>
			return;
	//   43   88:return          
		} else
		{
			o.e("SetupRV2NetworkFragment", "handleProvisioningError() called with error == null");
	//   44   89:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   45   91:ldc1            #111 <String "handleProvisioningError() called with error == null">
	//   46   93:invokestatic    #105 <Method void o.e(String, String)>
			return;
	//   47   96:return          
		}
	}

	private void a(ProvisioningType provisioningtype)
	{
		o.e("SetupRV2NetworkFragment", "Version 2 provisioning does not support transitioning to another type.");
	//    0    0:ldc1            #97  <String "SetupRV2NetworkFragment">
	//    1    2:ldc1            #114 <String "Version 2 provisioning does not support transitioning to another type.">
	//    2    4:invokestatic    #105 <Method void o.e(String, String)>
	//    3    7:return          
	}

	private void a(WifiProvisioningStatus wifiprovisioningstatus)
	{
label0:
		{
			Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore_3        
			((StringBuilder) (obj)).append("Received status ");
	//    4    8:aload_3         
	//    5    9:ldc1            #117 <String "Received status ">
	//    6   11:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
			((StringBuilder) (obj)).append(wifiprovisioningstatus.name());
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #122 <Method String WifiProvisioningStatus.name()>
	//   11   20:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			o.c("SetupRV2NetworkFragment", ((StringBuilder) (obj)).toString());
	//   13   24:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   14   26:aload_3         
	//   15   27:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #124 <Method void o.c(String, String)>
			obj = ((Object) ((WifiManager)a.getApplicationContext().getSystemService("wifi")));
	//   17   33:aload_0         
	//   18   34:getfield        #126 <Field IRobotApplication a>
	//   19   37:invokevirtual   #132 <Method Context IRobotApplication.getApplicationContext()>
	//   20   40:ldc1            #134 <String "wifi">
	//   21   42:invokevirtual   #140 <Method Object Context.getSystemService(String)>
	//   22   45:checkcast       #142 <Class WifiManager>
	//   23   48:astore_3        
			int l;
			switch(_cls2.c[wifiprovisioningstatus.ordinal()])
	//*  24   49:getstatic       #145 <Field int[] bw$2.c>
	//*  25   52:aload_1         
	//*  26   53:invokevirtual   #148 <Method int WifiProvisioningStatus.ordinal()>
	//*  27   56:iaload          
			{
	//*  28   57:tableswitch     1 7: default 100
	//	               1 324
	//	               2 316
	//	               3 310
	//	               4 310
	//	               5 304
	//	               6 156
	//	               7 101
			default:
				return;
	//   29  100:return          

			case 1: // '\001'
				break label0;

			case 7: // '\007'
				a(0x7f0f04be);
	//   30  101:aload_0         
	//   31  102:ldc1            #149 <Int 0x7f0f04be>
	//   32  104:invokespecial   #150 <Method void a(int)>
				a.h().d(com.irobot.home.util.j.a(g.getAssetId().getId()));
	//   33  107:aload_0         
	//   34  108:getfield        #126 <Field IRobotApplication a>
	//   35  111:invokevirtual   #153 <Method IRobotModel IRobotApplication.h()>
	//   36  114:aload_0         
	//   37  115:getfield        #155 <Field AssetInfo g>
	//   38  118:invokevirtual   #161 <Method AssetId AssetInfo.getAssetId()>
	//   39  121:invokevirtual   #166 <Method String AssetId.getId()>
	//   40  124:invokestatic    #171 <Method com.irobot.home.model.a j.a(String)>
	//   41  127:invokevirtual   #176 <Method void IRobotModel.d(com.irobot.home.model.a)>
				m.b(g.getAssetId().getId());
	//   42  130:aload_0         
	//   43  131:getfield        #180 <Field b m>
	//   44  134:aload_0         
	//   45  135:getfield        #155 <Field AssetInfo g>
	//   46  138:invokevirtual   #161 <Method AssetId AssetInfo.getAssetId()>
	//   47  141:invokevirtual   #166 <Method String AssetId.getId()>
	//   48  144:invokevirtual   #183 <Method void b.b(String)>
				g();
	//   49  147:aload_0         
	//   50  148:invokespecial   #107 <Method void g()>
				b();
	//   51  151:aload_0         
	//   52  152:invokevirtual   #185 <Method void b()>
				return;
	//   53  155:return          

			case 6: // '\006'
				((WifiManager) (obj)).enableNetwork(c.getNetworkId(), true);
	//   54  156:aload_3         
	//   55  157:aload_0         
	//   56  158:getfield        #187 <Field WifiInfo c>
	//   57  161:invokevirtual   #192 <Method int WifiInfo.getNetworkId()>
	//   58  164:iconst_1        
	//   59  165:invokevirtual   #196 <Method boolean WifiManager.enableNetwork(int, boolean)>
	//   60  168:pop             
				((WifiManager) (obj)).saveConfiguration();
	//   61  169:aload_3         
	//   62  170:invokevirtual   #200 <Method boolean WifiManager.saveConfiguration()>
	//   63  173:pop             
				if(((WifiManager) (obj)).disableNetwork(d.getNetworkId()))
	//*  64  174:aload_3         
	//*  65  175:aload_0         
	//*  66  176:getfield        #202 <Field WifiInfo d>
	//*  67  179:invokevirtual   #192 <Method int WifiInfo.getNetworkId()>
	//*  68  182:invokevirtual   #206 <Method boolean WifiManager.disableNetwork(int)>
	//*  69  185:ifeq            227
				{
					wifiprovisioningstatus = ((WifiProvisioningStatus) (new StringBuilder()));
	//   70  188:new             #74  <Class StringBuilder>
	//   71  191:dup             
	//   72  192:invokespecial   #75  <Method void StringBuilder()>
	//   73  195:astore_1        
					((StringBuilder) (wifiprovisioningstatus)).append("Disabled auto reconnects to robot SoftAP: ");
	//   74  196:aload_1         
	//   75  197:ldc1            #208 <String "Disabled auto reconnects to robot SoftAP: ">
	//   76  199:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   77  202:pop             
					((StringBuilder) (wifiprovisioningstatus)).append(d.getSSID());
	//   78  203:aload_1         
	//   79  204:aload_0         
	//   80  205:getfield        #202 <Field WifiInfo d>
	//   81  208:invokevirtual   #211 <Method String WifiInfo.getSSID()>
	//   82  211:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   83  214:pop             
					o.b("SetupRV2NetworkFragment", ((StringBuilder) (wifiprovisioningstatus)).toString());
	//   84  215:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   85  217:aload_1         
	//   86  218:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   87  221:invokestatic    #213 <Method void o.b(String, String)>
				} else
	//*  88  224:goto            263
				{
					wifiprovisioningstatus = ((WifiProvisioningStatus) (new StringBuilder()));
	//   89  227:new             #74  <Class StringBuilder>
	//   90  230:dup             
	//   91  231:invokespecial   #75  <Method void StringBuilder()>
	//   92  234:astore_1        
					((StringBuilder) (wifiprovisioningstatus)).append("Disable auto reconnects to robot SoftAP failed or already disabled for: ");
	//   93  235:aload_1         
	//   94  236:ldc1            #215 <String "Disable auto reconnects to robot SoftAP failed or already disabled for: ">
	//   95  238:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   96  241:pop             
					((StringBuilder) (wifiprovisioningstatus)).append(d.getSSID());
	//   97  242:aload_1         
	//   98  243:aload_0         
	//   99  244:getfield        #202 <Field WifiInfo d>
	//  100  247:invokevirtual   #211 <Method String WifiInfo.getSSID()>
	//  101  250:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  102  253:pop             
					o.d("SetupRV2NetworkFragment", ((StringBuilder) (wifiprovisioningstatus)).toString());
	//  103  254:ldc1            #97  <String "SetupRV2NetworkFragment">
	//  104  256:aload_1         
	//  105  257:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  106  260:invokestatic    #217 <Method void o.d(String, String)>
				}
				if(i != null)
	//* 107  263:aload_0         
	//* 108  264:getfield        #55  <Field bw$a i>
	//* 109  267:ifnull          324
				{
					wifiprovisioningstatus = ((WifiProvisioningStatus) (getString(0x7f0f04bd, new Object[] {
						e()
					})));
	//  110  270:aload_0         
	//  111  271:ldc1            #218 <Int 0x7f0f04bd>
	//  112  273:iconst_1        
	//  113  274:anewarray       Object[]
	//  114  277:dup             
	//  115  278:iconst_0        
	//  116  279:aload_0         
	//  117  280:invokespecial   #222 <Method String e()>
	//  118  283:aastore         
	//  119  284:invokevirtual   #225 <Method String getString(int, Object[])>
	//  120  287:astore_1        
					i.b(((String) (wifiprovisioningstatus)));
	//  121  288:aload_0         
	//  122  289:getfield        #55  <Field bw$a i>
	//  123  292:aload_1         
	//  124  293:invokeinterface #68  <Method void com.irobot.home.fragments.bw$a.b(String)>
					a(((String) (wifiprovisioningstatus)));
	//  125  298:aload_0         
	//  126  299:aload_1         
	//  127  300:invokevirtual   #70  <Method void a(String)>
					return;
	//  128  303:return          
				}
				break label0;

			case 5: // '\005'
				l = 0x7f0f04bc;
	//  129  304:ldc1            #226 <Int 0x7f0f04bc>
	//  130  306:istore_2        
				break;
	//  131  307:goto            319

			case 3: // '\003'
			case 4: // '\004'
				l = 0x7f0f04bb;
	//  132  310:ldc1            #227 <Int 0x7f0f04bb>
	//  133  312:istore_2        
				break;
	//  134  313:goto            319

			case 2: // '\002'
				l = 0x7f0f04ba;
	//  135  316:ldc1            #228 <Int 0x7f0f04ba>
	//  136  318:istore_2        
				break;
			}
			a(l);
	//  137  319:aload_0         
	//  138  320:iload_2         
	//  139  321:invokespecial   #150 <Method void a(int)>
		}
	//  140  324:return          
	}

	static void a(bw bw1, DiscoveredWifiAsset discoveredwifiasset)
	{
		bw1.a(discoveredwifiasset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #231 <Method void a(DiscoveredWifiAsset)>
	//    3    5:return          
	}

	static void a(bw bw1, Error error)
	{
		bw1.a(error);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #234 <Method void a(Error)>
	//    3    5:return          
	}

	static void a(bw bw1, ProvisioningType provisioningtype)
	{
		bw1.a(provisioningtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #237 <Method void a(ProvisioningType)>
	//    3    5:return          
	}

	static void a(bw bw1, WifiProvisioningStatus wifiprovisioningstatus)
	{
		bw1.a(wifiprovisioningstatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method void a(WifiProvisioningStatus)>
	//    3    5:return          
	}

	static void a(bw bw1, String s)
	{
		bw1.c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #243 <Method void c(String)>
	//    3    5:return          
	}

	static void b(bw bw1, String s)
	{
		bw1.d(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #245 <Method void d(String)>
	//    3    5:return          
	}

	private void c()
	{
		if(!e.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field WifiConfig e>
	//*   2    4:invokevirtual   #251 <Method boolean WifiConfig.a()>
	//*   3    7:ifne            65
		{
			NetworkAddress.IPv4NumericToDottedDecimal(e.f());
	//    4   10:aload_0         
	//    5   11:getfield        #247 <Field WifiConfig e>
	//    6   14:invokevirtual   #254 <Method long WifiConfig.f()>
	//    7   17:invokestatic    #260 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//    8   20:pop             
			NetworkAddress.IPv4NumericToDottedDecimal(e.e());
	//    9   21:aload_0         
	//   10   22:getfield        #247 <Field WifiConfig e>
	//   11   25:invokevirtual   #262 <Method long WifiConfig.e()>
	//   12   28:invokestatic    #260 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   13   31:pop             
			NetworkAddress.IPv4NumericToDottedDecimal(e.g());
	//   14   32:aload_0         
	//   15   33:getfield        #247 <Field WifiConfig e>
	//   16   36:invokevirtual   #264 <Method long WifiConfig.g()>
	//   17   39:invokestatic    #260 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   18   42:pop             
			NetworkAddress.IPv4NumericToDottedDecimal(e.h());
	//   19   43:aload_0         
	//   20   44:getfield        #247 <Field WifiConfig e>
	//   21   47:invokevirtual   #266 <Method long WifiConfig.h()>
	//   22   50:invokestatic    #260 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   23   53:pop             
			NetworkAddress.IPv4NumericToDottedDecimal(e.i());
	//   24   54:aload_0         
	//   25   55:getfield        #247 <Field WifiConfig e>
	//   26   58:invokevirtual   #268 <Method long WifiConfig.i()>
	//   27   61:invokestatic    #260 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//   28   64:pop             
		}
		if(e.b() == null)
	//*  29   65:aload_0         
	//*  30   66:getfield        #247 <Field WifiConfig e>
	//*  31   69:invokevirtual   #270 <Method String WifiConfig.b()>
	//*  32   72:ifnonnull       83
			o.e("SetupRV2NetworkFragment", "null string value for Ssid in setWifiInfo being sent to core");
	//   33   75:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   34   77:ldc2            #272 <String "null string value for Ssid in setWifiInfo being sent to core">
	//   35   80:invokestatic    #105 <Method void o.e(String, String)>
	//   36   83:return          
	}

	static void c(bw bw1, String s)
	{
		bw1.e(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #274 <Method void e(String)>
	//    3    5:return          
	}

	private void c(String s)
	{
		if(s.contains(((CharSequence) (g.getAssetId().getId()))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #155 <Field AssetInfo g>
	//*   3    5:invokevirtual   #161 <Method AssetId AssetInfo.getAssetId()>
	//*   4    8:invokevirtual   #166 <Method String AssetId.getId()>
	//*   5   11:invokevirtual   #280 <Method boolean String.contains(CharSequence)>
	//*   6   14:ifeq            48
		{
			o.b("SetupRV2NetworkFragment", "Core told the app to reconnect to the robot's wifi network.");
	//    7   17:ldc1            #97  <String "SetupRV2NetworkFragment">
	//    8   19:ldc2            #282 <String "Core told the app to reconnect to the robot's wifi network.">
	//    9   22:invokestatic    #213 <Method void o.b(String, String)>
			com.irobot.home.util.j.a((WifiManager)a.getApplicationContext().getSystemService("wifi"), d);
	//   10   25:aload_0         
	//   11   26:getfield        #126 <Field IRobotApplication a>
	//   12   29:invokevirtual   #132 <Method Context IRobotApplication.getApplicationContext()>
	//   13   32:ldc1            #134 <String "wifi">
	//   14   34:invokevirtual   #140 <Method Object Context.getSystemService(String)>
	//   15   37:checkcast       #142 <Class WifiManager>
	//   16   40:aload_0         
	//   17   41:getfield        #202 <Field WifiInfo d>
	//   18   44:invokestatic    #285 <Method void j.a(WifiManager, WifiInfo)>
			return;
	//   19   47:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   48:new             #74  <Class StringBuilder>
	//   21   51:dup             
	//   22   52:invokespecial   #75  <Method void StringBuilder()>
	//   23   55:astore_2        
			stringbuilder.append("Told to reconnect to unrecognized wifi network ");
	//   24   56:aload_2         
	//   25   57:ldc2            #287 <String "Told to reconnect to unrecognized wifi network ">
	//   26   60:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   27   63:pop             
			stringbuilder.append(s);
	//   28   64:aload_2         
	//   29   65:aload_1         
	//   30   66:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   31   69:pop             
			o.e("SetupRV2NetworkFragment", stringbuilder.toString());
	//   32   70:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   33   72:aload_2         
	//   34   73:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   35   76:invokestatic    #105 <Method void o.e(String, String)>
			return;
	//   36   79:return          
		}
	}

	private void d()
	{
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//    0    0:invokestatic    #293 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #297 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:astore_1        
		assetsetupuiservice.registerUISubscriber(j);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field AssetSetupUIServiceDataCallback j>
	//    6   12:invokevirtual   #303 <Method boolean AssetSetupUIService.registerUISubscriber(AssetSetupUIServiceDataCallback)>
	//    7   15:pop             
		if(k)
	//*   8   16:aload_0         
	//*   9   17:getfield        #47  <Field boolean k>
	//*  10   20:ifeq            24
		{
			return;
	//   11   23:return          
		} else
		{
			k = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #47  <Field boolean k>
			com.irobot.core.AppInfoEvent appinfoevent = com.irobot.home.util.j.a(g.getAssetId());
	//   15   29:aload_0         
	//   16   30:getfield        #155 <Field AssetInfo g>
	//   17   33:invokevirtual   #161 <Method AssetId AssetInfo.getAssetId()>
	//   18   36:invokestatic    #306 <Method com.irobot.core.AppInfoEvent j.a(AssetId)>
	//   19   39:astore_2        
			AssetSetupUIServiceData assetsetupuiservicedata = AssetSetupUIServiceData.create();
	//   20   40:invokestatic    #312 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   21   43:astore_3        
			assetsetupuiservicedata.setProvisioningType(ProvisioningType.WifiV2);
	//   22   44:aload_3         
	//   23   45:getstatic       #318 <Field ProvisioningType ProvisioningType.WifiV2>
	//   24   48:invokevirtual   #321 <Method void AssetSetupUIServiceData.setProvisioningType(ProvisioningType)>
			assetsetupuiservicedata.setDiscoveredAssetInfo(g);
	//   25   51:aload_3         
	//   26   52:aload_0         
	//   27   53:getfield        #155 <Field AssetInfo g>
	//   28   56:invokevirtual   #325 <Method void AssetSetupUIServiceData.setDiscoveredAssetInfo(AssetInfo)>
			assetsetupuiservicedata.setAppInfo(appinfoevent);
	//   29   59:aload_3         
	//   30   60:aload_2         
	//   31   61:invokevirtual   #329 <Method void AssetSetupUIServiceData.setAppInfo(com.irobot.core.AppInfoEvent)>
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.StartProvisioning, assetsetupuiservicedata);
	//   32   64:aload_1         
	//   33   65:getstatic       #335 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.StartProvisioning>
	//   34   68:aload_3         
	//   35   69:invokevirtual   #339 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
			return;
	//   36   72:return          
		}
	}

	private void d(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Device needs to connect to the users ssid. Device didn't do it. ");
	//    4    8:aload_2         
	//    5    9:ldc2            #341 <String "Device needs to connect to the users ssid. Device didn't do it. ">
	//    6   12:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		o.c("SetupRV2NetworkFragment", stringbuilder.toString());
	//   12   22:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #124 <Method void o.c(String, String)>
		e(s);
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokespecial   #274 <Method void e(String)>
	//   19   36:return          
	}

	private String e()
	{
		return com.irobot.home.util.j.e(c.getSSID());
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field WifiInfo c>
	//    2    4:invokevirtual   #211 <Method String WifiInfo.getSSID()>
	//    3    7:invokestatic    #344 <Method String j.e(String)>
	//    4   10:areturn         
	}

	private void e(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Need to connect to a new home access point ");
	//    4    8:aload_2         
	//    5    9:ldc2            #346 <String "Need to connect to a new home access point ">
	//    6   12:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		o.c("SetupRV2NetworkFragment", stringbuilder.toString());
	//   12   22:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #124 <Method void o.c(String, String)>
		com.irobot.home.util.j.a((WifiManager)a.getApplicationContext().getSystemService("wifi"), c);
	//   16   31:aload_0         
	//   17   32:getfield        #126 <Field IRobotApplication a>
	//   18   35:invokevirtual   #132 <Method Context IRobotApplication.getApplicationContext()>
	//   19   38:ldc1            #134 <String "wifi">
	//   20   40:invokevirtual   #140 <Method Object Context.getSystemService(String)>
	//   21   43:checkcast       #142 <Class WifiManager>
	//   22   46:aload_0         
	//   23   47:getfield        #187 <Field WifiInfo c>
	//   24   50:invokestatic    #285 <Method void j.a(WifiManager, WifiInfo)>
	//   25   53:return          
	}

	private void f()
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field bw$b h>
	//*   2    4:ifnonnull       19
			h = new b();
	//    3    7:aload_0         
	//    4    8:new             #13  <Class bw$b>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #40  <Method void bw$b(bw)>
	//    8   16:putfield        #42  <Field bw$b h>
		if(isAdded() && h != null)
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #349 <Method boolean isAdded()>
	//*  11   23:ifeq            55
	//*  12   26:aload_0         
	//*  13   27:getfield        #42  <Field bw$b h>
	//*  14   30:ifnull          55
			getActivity().registerReceiver(((BroadcastReceiver) (h)), new IntentFilter("android.net.wifi.STATE_CHANGE"));
	//   15   33:aload_0         
	//   16   34:invokevirtual   #353 <Method Activity getActivity()>
	//   17   37:aload_0         
	//   18   38:getfield        #42  <Field bw$b h>
	//   19   41:new             #355 <Class IntentFilter>
	//   20   44:dup             
	//   21   45:ldc2            #357 <String "android.net.wifi.STATE_CHANGE">
	//   22   48:invokespecial   #359 <Method void IntentFilter(String)>
	//   23   51:invokevirtual   #365 <Method Intent Activity.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   24   54:pop             
	//   25   55:return          
	}

	private void g()
	{
		if(isAdded() && h != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #349 <Method boolean isAdded()>
	//*   2    4:ifeq            66
	//*   3    7:aload_0         
	//*   4    8:getfield        #42  <Field bw$b h>
	//*   5   11:ifnull          66
			try
			{
				getActivity().unregisterReceiver(((BroadcastReceiver) (h)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #353 <Method Activity getActivity()>
	//    8   18:aload_0         
	//    9   19:getfield        #42  <Field bw$b h>
	//   10   22:invokevirtual   #371 <Method void Activity.unregisterReceiver(BroadcastReceiver)>
				h = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #42  <Field bw$b h>
				return;
	//   14   30:return          
			}
			catch(IllegalArgumentException illegalargumentexception)
	//*  15   31:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #74  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #75  <Method void StringBuilder()>
	//   19   39:astore_2        
				stringbuilder.append("Failed to unregister receiver: ");
	//   20   40:aload_2         
	//   21   41:ldc2            #373 <String "Failed to unregister receiver: ">
	//   22   44:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				stringbuilder.append(illegalargumentexception.getMessage());
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #376 <Method String IllegalArgumentException.getMessage()>
	//   27   53:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
				o.e("SetupRV2NetworkFragment", stringbuilder.toString());
	//   29   57:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   30   59:aload_2         
	//   31   60:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   32   63:invokestatic    #105 <Method void o.e(String, String)>
			}
	//   33   66:return          
	}

	private String h()
	{
		WifiInfo wifiinfo = ((WifiManager)a.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field IRobotApplication a>
	//    2    4:invokevirtual   #132 <Method Context IRobotApplication.getApplicationContext()>
	//    3    7:ldc1            #134 <String "wifi">
	//    4    9:invokevirtual   #140 <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #142 <Class WifiManager>
	//    6   15:invokevirtual   #380 <Method WifiInfo WifiManager.getConnectionInfo()>
	//    7   18:astore_2        
		String s = "";
	//    8   19:ldc2            #382 <String "">
	//    9   22:astore_1        
		if(wifiinfo != null)
	//*  10   23:aload_2         
	//*  11   24:ifnull          35
			s = com.irobot.home.util.j.e(wifiinfo.getSSID());
	//   12   27:aload_2         
	//   13   28:invokevirtual   #211 <Method String WifiInfo.getSSID()>
	//   14   31:invokestatic    #344 <Method String j.e(String)>
	//   15   34:astore_1        
		return s;
	//   16   35:aload_1         
	//   17   36:areturn         
	}

	void a()
	{
		g = AssetInfo.createFromJson(b);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #384 <Field String b>
	//    3    5:invokestatic    #388 <Method AssetInfo AssetInfo.createFromJson(String)>
	//    4    8:putfield        #155 <Field AssetInfo g>
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(g) && AssetCapabilityUtils.isMoppingRobot(g))
	//*   5   11:aload_0         
	//*   6   12:getfield        #155 <Field AssetInfo g>
	//*   7   15:invokestatic    #394 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   8   18:ifeq            36
	//*   9   21:aload_0         
	//*  10   22:getfield        #155 <Field AssetInfo g>
	//*  11   25:invokestatic    #397 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  12   28:ifeq            36
			flag = true;
	//   13   31:iconst_1        
	//   14   32:istore_1        
		else
	//*  15   33:goto            38
			flag = false;
	//   16   36:iconst_0        
	//   17   37:istore_1        
		Object obj = ((Object) (getActivity()));
	//   18   38:aload_0         
	//   19   39:invokevirtual   #353 <Method Activity getActivity()>
	//   20   42:astore_2        
		int l;
		if(flag)
	//*  21   43:iload_1         
	//*  22   44:ifeq            54
			l = 0x7f0e020c;
	//   23   47:ldc2            #398 <Int 0x7f0e020c>
	//   24   50:istore_1        
		else
	//*  25   51:goto            58
			l = 0x7f0e01ff;
	//   26   54:ldc2            #399 <Int 0x7f0e01ff>
	//   27   57:istore_1        
		obj = ((Object) (com.irobot.home.util.j.a(((Context) (obj)), l)));
	//   28   58:aload_2         
	//   29   59:iload_1         
	//   30   60:invokestatic    #402 <Method android.net.Uri j.a(Context, int)>
	//   31   63:astore_2        
		f.setSource(((android.net.Uri) (obj)));
	//   32   64:aload_0         
	//   33   65:getfield        #404 <Field CustomVideoView f>
	//   34   68:aload_2         
	//   35   69:invokevirtual   #410 <Method void CustomVideoView.setSource(android.net.Uri)>
		f.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, com.irobot.home.util.j.a(getActivity(), ((android.net.Uri) (obj)))))));
	//   36   72:aload_0         
	//   37   73:getfield        #404 <Field CustomVideoView f>
	//   38   76:new             #412 <Class android.widget.LinearLayout$LayoutParams>
	//   39   79:dup             
	//   40   80:iconst_m1       
	//   41   81:aload_0         
	//   42   82:invokevirtual   #353 <Method Activity getActivity()>
	//   43   85:aload_2         
	//   44   86:invokestatic    #415 <Method int j.a(Activity, android.net.Uri)>
	//   45   89:invokespecial   #418 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   46   92:invokevirtual   #422 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		f.setLooping(true);
	//   47   95:aload_0         
	//   48   96:getfield        #404 <Field CustomVideoView f>
	//   49   99:iconst_1        
	//   50  100:invokevirtual   #426 <Method void CustomVideoView.setLooping(boolean)>
		f.a();
	//   51  103:aload_0         
	//   52  104:getfield        #404 <Field CustomVideoView f>
	//   53  107:invokevirtual   #428 <Method void CustomVideoView.a()>
		a(0x7f0f04b9);
	//   54  110:aload_0         
	//   55  111:ldc2            #429 <Int 0x7f0f04b9>
	//   56  114:invokespecial   #150 <Method void a(int)>
		o.c("*** PROVISIONING ***", String.format(Locale.US, getString(0x7f0f04ae), new Object[0]));
	//   57  117:ldc2            #431 <String "*** PROVISIONING ***">
	//   58  120:getstatic       #437 <Field Locale Locale.US>
	//   59  123:aload_0         
	//   60  124:ldc2            #438 <Int 0x7f0f04ae>
	//   61  127:invokevirtual   #439 <Method String getString(int)>
	//   62  130:iconst_0        
	//   63  131:anewarray       Object[]
	//   64  134:invokestatic    #443 <Method String String.format(Locale, String, Object[])>
	//   65  137:invokestatic    #124 <Method void o.c(String, String)>
		c();
	//   66  140:aload_0         
	//   67  141:invokespecial   #445 <Method void c()>
	//   68  144:return          
	}

	public void a(a a1)
	{
		i = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field bw$a i>
	//    3    5:return          
	}

	protected void a(String s)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #349 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			((BroadcastSetupActivity)getActivity()).a(s);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #353 <Method Activity getActivity()>
	//    6   12:checkcast       #448 <Class BroadcastSetupActivity>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #449 <Method void BroadcastSetupActivity.a(String)>
			return;
	//    9   19:return          
		}
	}

	void b()
	{
		o.b("SetupRV2NetworkFragment", "Provisioning finished : done");
	//    0    0:ldc1            #97  <String "SetupRV2NetworkFragment">
	//    1    2:ldc2            #451 <String "Provisioning finished : done">
	//    2    5:invokestatic    #213 <Method void o.b(String, String)>
		i.a(g.getSku());
	//    3    8:aload_0         
	//    4    9:getfield        #55  <Field bw$a i>
	//    5   12:aload_0         
	//    6   13:getfield        #155 <Field AssetInfo g>
	//    7   16:invokevirtual   #454 <Method String AssetInfo.getSku()>
	//    8   19:invokeinterface #455 <Method void bw$a.a(String)>
	//    9   24:return          
	}

	public void b(String s)
	{
		AssetSetupUIService assetsetupuiservice = Assembler.getInstance().getAssetSetupUIService();
	//    0    0:invokestatic    #293 <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #297 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    2    6:astore_2        
		if(assetsetupuiservice != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          59
		{
			Object obj = ((Object) (new StringBuilder()));
	//    5   11:new             #74  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #75  <Method void StringBuilder()>
	//    8   18:astore_3        
			((StringBuilder) (obj)).append("Telling core about new ssid:");
	//    9   19:aload_3         
	//   10   20:ldc2            #457 <String "Telling core about new ssid:">
	//   11   23:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			((StringBuilder) (obj)).append(s);
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			o.b("SetupRV2NetworkFragment", ((StringBuilder) (obj)).toString());
	//   17   33:ldc1            #97  <String "SetupRV2NetworkFragment">
	//   18   35:aload_3         
	//   19   36:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   20   39:invokestatic    #213 <Method void o.b(String, String)>
			obj = ((Object) (AssetSetupUIServiceData.create()));
	//   21   42:invokestatic    #312 <Method AssetSetupUIServiceData AssetSetupUIServiceData.create()>
	//   22   45:astore_3        
			((AssetSetupUIServiceData) (obj)).setCurrentApSsid(s);
	//   23   46:aload_3         
	//   24   47:aload_1         
	//   25   48:invokevirtual   #460 <Method void AssetSetupUIServiceData.setCurrentApSsid(String)>
			assetsetupuiservice.sendCommand(AssetSetupUIServiceCommand.SSIDChanged, ((AssetSetupUIServiceData) (obj)));
	//   26   51:aload_2         
	//   27   52:getstatic       #463 <Field AssetSetupUIServiceCommand AssetSetupUIServiceCommand.SSIDChanged>
	//   28   55:aload_3         
	//   29   56:invokevirtual   #339 <Method void AssetSetupUIService.sendCommand(AssetSetupUIServiceCommand, AssetSetupUIServiceData)>
		}
	//   30   59:return          
	}

	public void onDestroy()
	{
		o.b("SetupRV2NetworkFragment", "Setup Aws Network Fragment destroyed.");
	//    0    0:ldc1            #97  <String "SetupRV2NetworkFragment">
	//    1    2:ldc2            #466 <String "Setup Aws Network Fragment destroyed.">
	//    2    5:invokestatic    #213 <Method void o.b(String, String)>
		super.onDestroy();
	//    3    8:aload_0         
	//    4    9:invokespecial   #468 <Method void g.onDestroy()>
	//    5   12:return          
	}

	public void onPause()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void g()>
		super.onPause();
	//    2    4:aload_0         
	//    3    5:invokespecial   #471 <Method void g.onPause()>
	//    4    8:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #474 <Method void g.onResume()>
		f();
	//    2    4:aload_0         
	//    3    5:invokespecial   #476 <Method void f()>
	//    4    8:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #479 <Method void g.onStart()>
		d();
	//    2    4:aload_0         
	//    3    5:invokespecial   #481 <Method void d()>
	//    4    8:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #484 <Method void g.onStop()>
		Assembler.getInstance().getAssetSetupUIService().unregisterSubscriber(j);
	//    2    4:invokestatic    #293 <Method Assembler Assembler.getInstance()>
	//    3    7:invokevirtual   #297 <Method AssetSetupUIService Assembler.getAssetSetupUIService()>
	//    4   10:aload_0         
	//    5   11:getfield        #45  <Field AssetSetupUIServiceDataCallback j>
	//    6   14:invokevirtual   #487 <Method boolean AssetSetupUIService.unregisterSubscriber(AssetSetupUIServiceDataCallback)>
	//    7   17:pop             
	//    8   18:return          
	}

	IRobotApplication a;
	String b;
	WifiInfo c;
	WifiInfo d;
	WifiConfig e;
	CustomVideoView f;
	private AssetInfo g;
	private b h;
	private a i;
	private final AssetSetupUIServiceDataCallback j = new AssetSetupUIServiceDataCallback() {

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
		//    9   19:ifeq            229
				AssetSetupUIServiceViewState assetsetupuiserviceviewstate = (AssetSetupUIServiceViewState)iterator.next();
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Object Iterator.next()>
		//   12   28:checkcast       #42  <Class AssetSetupUIServiceViewState>
		//   13   31:astore_3        
				switch(com.irobot.home.fragments._cls2.b[assetsetupuiserviceviewstate.ordinal()])
		//*  14   32:getstatic       #48  <Field int[] com.irobot.home.fragments.bw$2.b>
		//*  15   35:aload_3         
		//*  16   36:invokevirtual   #52  <Method int AssetSetupUIServiceViewState.ordinal()>
		//*  17   39:iaload          
				{
		//*  18   40:tableswitch     1 8: default 88
		//		               1 215
		//		               2 201
		//		               3 187
		//		               4 173
		//		               5 159
		//		               6 145
		//		               7 131
		//		               8 91
		//*  19   88:goto            13
				case 8: // '\b'
					StringBuilder stringbuilder = new StringBuilder();
		//   20   91:new             #54  <Class StringBuilder>
		//   21   94:dup             
		//   22   95:invokespecial   #55  <Method void StringBuilder()>
		//   23   98:astore          4
					stringbuilder.append("Unknown state received from AssertSetupUIService: ");
		//   24  100:aload           4
		//   25  102:ldc1            #57  <String "Unknown state received from AssertSetupUIService: ">
		//   26  104:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
		//   27  107:pop             
					stringbuilder.append(assetsetupuiserviceviewstate.name());
		//   28  108:aload           4
		//   29  110:aload_3         
		//   30  111:invokevirtual   #65  <Method String AssetSetupUIServiceViewState.name()>
		//   31  114:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
		//   32  117:pop             
					o.e("SetupRV2NetworkFragment", stringbuilder.toString());
		//   33  118:ldc1            #67  <String "SetupRV2NetworkFragment">
		//   34  120:aload           4
		//   35  122:invokevirtual   #70  <Method String StringBuilder.toString()>
		//   36  125:invokestatic    #76  <Method void o.e(String, String)>
					break;

		//*  37  128:goto            13
				case 7: // '\007'
					bw.a(a, assetsetupuiservicedata.getProvisioningTypeToTransitionTo());
		//   38  131:aload_0         
		//   39  132:getfield        #12  <Field bw a>
		//   40  135:aload_1         
		//   41  136:invokevirtual   #80  <Method ProvisioningType AssetSetupUIServiceData.getProvisioningTypeToTransitionTo()>
		//   42  139:invokestatic    #83  <Method void bw.a(bw, ProvisioningType)>
					break;

		//*  43  142:goto            13
				case 6: // '\006'
					bw.a(a, assetsetupuiservicedata.getAssetDiscoveredOnHomeNetwork());
		//   44  145:aload_0         
		//   45  146:getfield        #12  <Field bw a>
		//   46  149:aload_1         
		//   47  150:invokevirtual   #87  <Method DiscoveredWifiAsset AssetSetupUIServiceData.getAssetDiscoveredOnHomeNetwork()>
		//   48  153:invokestatic    #90  <Method void bw.a(bw, DiscoveredWifiAsset)>
					break;

		//*  49  156:goto            13
				case 5: // '\005'
					bw.a(a, assetsetupuiservicedata.getWifiProvisioningError());
		//   50  159:aload_0         
		//   51  160:getfield        #12  <Field bw a>
		//   52  163:aload_1         
		//   53  164:invokevirtual   #94  <Method Error AssetSetupUIServiceData.getWifiProvisioningError()>
		//   54  167:invokestatic    #97  <Method void bw.a(bw, Error)>
					break;

		//*  55  170:goto            13
				case 4: // '\004'
					bw.c(a, assetsetupuiservicedata.getHomeWifiSsid());
		//   56  173:aload_0         
		//   57  174:getfield        #12  <Field bw a>
		//   58  177:aload_1         
		//   59  178:invokevirtual   #100 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
		//   60  181:invokestatic    #104 <Method void bw.c(bw, String)>
					break;

		//*  61  184:goto            13
				case 3: // '\003'
					com.irobot.home.fragments.bw.b(a, assetsetupuiservicedata.getHomeWifiSsid());
		//   62  187:aload_0         
		//   63  188:getfield        #12  <Field bw a>
		//   64  191:aload_1         
		//   65  192:invokevirtual   #100 <Method String AssetSetupUIServiceData.getHomeWifiSsid()>
		//   66  195:invokestatic    #106 <Method void com.irobot.home.fragments.bw.b(bw, String)>
					break;

		//*  67  198:goto            13
				case 2: // '\002'
					bw.a(a, assetsetupuiservicedata.getSoftApSsid());
		//   68  201:aload_0         
		//   69  202:getfield        #12  <Field bw a>
		//   70  205:aload_1         
		//   71  206:invokevirtual   #109 <Method String AssetSetupUIServiceData.getSoftApSsid()>
		//   72  209:invokestatic    #111 <Method void bw.a(bw, String)>
					break;

		//*  73  212:goto            13
				case 1: // '\001'
					bw.a(a, assetsetupuiservicedata.getCurrentProvisioningStatus());
		//   74  215:aload_0         
		//   75  216:getfield        #12  <Field bw a>
		//   76  219:aload_1         
		//   77  220:invokevirtual   #115 <Method WifiProvisioningStatus AssetSetupUIServiceData.getCurrentProvisioningStatus()>
		//   78  223:invokestatic    #118 <Method void bw.a(bw, WifiProvisioningStatus)>
					break;
				}
			} while(true);
		//*  79  226:goto            13
		//   80  229:return          
		}

		final bw a;

			
			{
				a = bw.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field bw a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetSetupUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;
	private boolean k;
}
