// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.NetworkSettings;
import com.irobot.home.model.Robot;
import com.irobot.home.util.j;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class DetailedWifiSettingsActivity extends BaseFragmentActivity
{

	public DetailedWifiSettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void BaseFragmentActivity()>
		n = ((AssetNetworkUIServiceDataCallback) (new AssetNetworkUIServiceDataCallback() {

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
					static class _cls2
					{

						static final int a[];
						static final int b[];

						static 
						{
							b = new int[AssetNetworkUIServiceDataState.values().length];
						//    0    0:invokestatic    #19  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #21  <Field int[] b>
							try
							{
								b[AssetNetworkUIServiceDataState.SignalStrength.ordinal()] = 1;
						//    4    9:getstatic       #21  <Field int[] b>
						//    5   12:getstatic       #25  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.SignalStrength>
						//    6   15:invokevirtual   #29  <Method int AssetNetworkUIServiceDataState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:invokestatic    #34  <Method CloudServerState[] CloudServerState.values()>
						//*  10   23:arraylength     
						//*  11   24:newarray        int[]
						//*  12   26:putstatic       #36  <Field int[] a>
						//*  13   29:getstatic       #36  <Field int[] a>
						//*  14   32:getstatic       #40  <Field CloudServerState CloudServerState.Off>
						//*  15   35:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  16   38:iconst_1        
						//*  17   39:iastore         
						//*  18   40:getstatic       #36  <Field int[] a>
						//*  19   43:getstatic       #44  <Field CloudServerState CloudServerState.On>
						//*  20   46:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  21   49:iconst_2        
						//*  22   50:iastore         
						//*  23   51:getstatic       #36  <Field int[] a>
						//*  24   54:getstatic       #47  <Field CloudServerState CloudServerState.ServerError>
						//*  25   57:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  26   60:iconst_3        
						//*  27   61:iastore         
						//*  28   62:getstatic       #36  <Field int[] a>
						//*  29   65:getstatic       #50  <Field CloudServerState CloudServerState.ServerDown>
						//*  30   68:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  31   71:iconst_4        
						//*  32   72:iastore         
						//*  33   73:getstatic       #36  <Field int[] a>
						//*  34   76:getstatic       #53  <Field CloudServerState CloudServerState.NtpError>
						//*  35   79:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  36   82:iconst_5        
						//*  37   83:iastore         
						//*  38   84:getstatic       #36  <Field int[] a>
						//*  39   87:getstatic       #56  <Field CloudServerState CloudServerState.ServiceDiscoveryError>
						//*  40   90:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  41   93:bipush          6
						//*  42   95:iastore         
						//*  43   96:getstatic       #36  <Field int[] a>
						//*  44   99:getstatic       #59  <Field CloudServerState CloudServerState.RegistrationFailedError>
						//*  45  102:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  46  105:bipush          7
						//*  47  107:iastore         
						//*  48  108:getstatic       #36  <Field int[] a>
						//*  49  111:getstatic       #62  <Field CloudServerState CloudServerState.CloudStateUnknown>
						//*  50  114:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  51  117:bipush          8
						//*  52  119:iastore         
						//*  53  120:getstatic       #36  <Field int[] a>
						//*  54  123:getstatic       #65  <Field CloudServerState CloudServerState.CloudStateUnconfigured>
						//*  55  126:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  56  129:bipush          9
						//*  57  131:iastore         
						//*  58  132:getstatic       #36  <Field int[] a>
						//*  59  135:getstatic       #68  <Field CloudServerState CloudServerState.CloudStateWaitForNtp>
						//*  60  138:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  61  141:bipush          10
						//*  62  143:iastore         
						//*  63  144:getstatic       #36  <Field int[] a>
						//*  64  147:getstatic       #71  <Field CloudServerState CloudServerState.CloudStateServiceDiscovery>
						//*  65  150:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  66  153:bipush          11
						//*  67  155:iastore         
						//*  68  156:getstatic       #36  <Field int[] a>
						//*  69  159:getstatic       #74  <Field CloudServerState CloudServerState.CloudStateRegistration>
						//*  70  162:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  71  165:bipush          12
						//*  72  167:iastore         
						//*  73  168:getstatic       #36  <Field int[] a>
						//*  74  171:getstatic       #77  <Field CloudServerState CloudServerState.CloudStateConnecting>
						//*  75  174:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  76  177:bipush          13
						//*  77  179:iastore         
						//*  78  180:getstatic       #36  <Field int[] a>
						//*  79  183:getstatic       #80  <Field CloudServerState CloudServerState.CloudStateConnected>
						//*  80  186:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  81  189:bipush          14
						//*  82  191:iastore         
						//*  83  192:getstatic       #36  <Field int[] a>
						//*  84  195:getstatic       #83  <Field CloudServerState CloudServerState.NetworkError>
						//*  85  198:invokevirtual   #41  <Method int CloudServerState.ordinal()>
						//*  86  201:bipush          15
						//*  87  203:iastore         
						//*  88  204:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   89  205:astore_0        
							a = new int[CloudServerState.values().length];
							try
							{
								a[CloudServerState.Off.ordinal()] = 1;
							}
						//*  90  206:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   91  209:astore_0        
							try
							{
								a[CloudServerState.On.ordinal()] = 2;
							}
						//*  92  210:goto            40
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   93  213:astore_0        
							try
							{
								a[CloudServerState.ServerError.ordinal()] = 3;
							}
						//*  94  214:goto            51
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   95  217:astore_0        
							try
							{
								a[CloudServerState.ServerDown.ordinal()] = 4;
							}
						//*  96  218:goto            62
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   97  221:astore_0        
							try
							{
								a[CloudServerState.NtpError.ordinal()] = 5;
							}
						//*  98  222:goto            73
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   99  225:astore_0        
							try
							{
								a[CloudServerState.ServiceDiscoveryError.ordinal()] = 6;
							}
						//* 100  226:goto            84
							catch(NoSuchFieldError nosuchfielderror6) { }
						//  101  229:astore_0        
							try
							{
								a[CloudServerState.RegistrationFailedError.ordinal()] = 7;
							}
						//* 102  230:goto            96
							catch(NoSuchFieldError nosuchfielderror7) { }
						//  103  233:astore_0        
							try
							{
								a[CloudServerState.CloudStateUnknown.ordinal()] = 8;
							}
						//* 104  234:goto            108
							catch(NoSuchFieldError nosuchfielderror8) { }
						//  105  237:astore_0        
							try
							{
								a[CloudServerState.CloudStateUnconfigured.ordinal()] = 9;
							}
						//* 106  238:goto            120
							catch(NoSuchFieldError nosuchfielderror9) { }
						//  107  241:astore_0        
							try
							{
								a[CloudServerState.CloudStateWaitForNtp.ordinal()] = 10;
							}
						//* 108  242:goto            132
							catch(NoSuchFieldError nosuchfielderror10) { }
						//  109  245:astore_0        
							try
							{
								a[CloudServerState.CloudStateServiceDiscovery.ordinal()] = 11;
							}
						//* 110  246:goto            144
							catch(NoSuchFieldError nosuchfielderror11) { }
						//  111  249:astore_0        
							try
							{
								a[CloudServerState.CloudStateRegistration.ordinal()] = 12;
							}
						//* 112  250:goto            156
							catch(NoSuchFieldError nosuchfielderror12) { }
						//  113  253:astore_0        
							try
							{
								a[CloudServerState.CloudStateConnecting.ordinal()] = 13;
							}
						//* 114  254:goto            168
							catch(NoSuchFieldError nosuchfielderror13) { }
						//  115  257:astore_0        
							try
							{
								a[CloudServerState.CloudStateConnected.ordinal()] = 14;
							}
						//* 116  258:goto            180
							catch(NoSuchFieldError nosuchfielderror14) { }
						//  117  261:astore_0        
							try
							{
								a[CloudServerState.NetworkError.ordinal()] = 15;
							}
						//* 118  262:goto            192
							catch(NoSuchFieldError nosuchfielderror15) { }
						//  119  265:astore_0        
						//* 120  266:return          
						}
					}

					if(_cls2.b[assetnetworkuiservicedatastate.ordinal()] == 1)
			//*  14   32:getstatic       #48  <Field int[] DetailedWifiSettingsActivity$2.b>
			//*  15   35:aload_3         
			//*  16   36:invokevirtual   #52  <Method int AssetNetworkUIServiceDataState.ordinal()>
			//*  17   39:iaload          
			//*  18   40:iconst_1        
			//*  19   41:icmpeq          47
			//*  20   44:goto            13
						DetailedWifiSettingsActivity.a(a, assetnetworkuiservicedata.getWifiSignalStrength());
			//   21   47:aload_0         
			//   22   48:getfield        #12  <Field DetailedWifiSettingsActivity a>
			//   23   51:aload_1         
			//   24   52:invokevirtual   #56  <Method AssetWifiSignalStrengthEvent AssetNetworkUIServiceData.getWifiSignalStrength()>
			//   25   55:invokestatic    #59  <Method void DetailedWifiSettingsActivity.a(DetailedWifiSettingsActivity, AssetWifiSignalStrengthEvent)>
				} while(true);
			//   26   58:goto            13
			//   27   61:return          
			}

			final DetailedWifiSettingsActivity a;

			
			{
				a = DetailedWifiSettingsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field DetailedWifiSettingsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class DetailedWifiSettingsActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #33  <Method void DetailedWifiSettingsActivity$1(DetailedWifiSettingsActivity)>
	//    7   13:putfield        #35  <Field AssetNetworkUIServiceDataCallback n>
	//    8   16:return          
	}

	private void a(RelativeLayout relativelayout, int i1, String s)
	{
		com.irobot.home.util.j.a(relativelayout, i1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #42  <Method TextView j.a(RelativeLayout, int)>
	//    3    5:pop             
		com.irobot.home.util.j.c(relativelayout, s).setTextColor(getResources().getColor(0x7f06006d));
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokestatic    #45  <Method TextView j.c(RelativeLayout, String)>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #49  <Method Resources getResources()>
	//    9   15:ldc1            #50  <Int 0x7f06006d>
	//   10   17:invokevirtual   #56  <Method int Resources.getColor(int)>
	//   11   20:invokevirtual   #62  <Method void TextView.setTextColor(int)>
	//   12   23:return          
	}

	private void a(AssetWifiSignalStrengthEvent assetwifisignalstrengthevent)
	{
		a(a, 0x7f0f0843, String.valueOf(((int) (assetwifisignalstrengthevent.signalStrength()))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field RelativeLayout a>
	//    3    5:ldc1            #66  <Int 0x7f0f0843>
	//    4    7:aload_1         
	//    5    8:invokevirtual   #72  <Method short AssetWifiSignalStrengthEvent.signalStrength()>
	//    6   11:invokestatic    #78  <Method String String.valueOf(int)>
	//    7   14:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
	//    8   17:return          
	}

	static void a(DetailedWifiSettingsActivity detailedwifisettingsactivity, AssetWifiSignalStrengthEvent assetwifisignalstrengthevent)
	{
		detailedwifisettingsactivity.a(assetwifisignalstrengthevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void a(AssetWifiSignalStrengthEvent)>
	//    3    5:return          
	}

	void e()
	{
		String s;
		AssetNetworkStatusEvent assetnetworkstatusevent;
		String s1;
		AssetNetworkSettingsEvent assetnetworksettingsevent;
		Object obj1;
		b(0x7f0f08c9);
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <Int 0x7f0f08c9>
	//    2    3:invokevirtual   #86  <Method void b(int)>
		m = Assembler.getInstance().getNetworkUIService(AssetId.assetIdForString(k));
	//    3    6:aload_0         
	//    4    7:invokestatic    #92  <Method Assembler Assembler.getInstance()>
	//    5   10:aload_0         
	//    6   11:getfield        #94  <Field String k>
	//    7   14:invokestatic    #100 <Method AssetId AssetId.assetIdForString(String)>
	//    8   17:invokevirtual   #104 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//    9   20:putfield        #106 <Field AssetNetworkUIService m>
		assetnetworkstatusevent = m.getServiceData().getNetworkStatus();
	//   10   23:aload_0         
	//   11   24:getfield        #106 <Field AssetNetworkUIService m>
	//   12   27:invokevirtual   #112 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   13   30:invokevirtual   #118 <Method AssetNetworkStatusEvent AssetNetworkUIServiceData.getNetworkStatus()>
	//   14   33:astore_3        
		assetnetworksettingsevent = m.getServiceData().getNetworkSettings();
	//   15   34:aload_0         
	//   16   35:getfield        #106 <Field AssetNetworkUIService m>
	//   17   38:invokevirtual   #112 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   18   41:invokevirtual   #122 <Method AssetNetworkSettingsEvent AssetNetworkUIServiceData.getNetworkSettings()>
	//   19   44:astore          5
		obj1 = ((Object) (m.getServiceData().getNetworkAddress()));
	//   20   46:aload_0         
	//   21   47:getfield        #106 <Field AssetNetworkUIService m>
	//   22   50:invokevirtual   #112 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   23   53:invokevirtual   #126 <Method NetworkAddressEvent AssetNetworkUIServiceData.getNetworkAddress()>
	//   24   56:astore          7
		if(m.getServiceData().getSupportedNetworkDataTypes().contains(((Object) (AssetNetworkUIServiceDataState.MacAddress))) && m.getServiceData().getMacAddress() != null)
	//*  25   58:aload_0         
	//*  26   59:getfield        #106 <Field AssetNetworkUIService m>
	//*  27   62:invokevirtual   #112 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  28   65:invokevirtual   #130 <Method ArrayList AssetNetworkUIServiceData.getSupportedNetworkDataTypes()>
	//*  29   68:getstatic       #136 <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.MacAddress>
	//*  30   71:invokevirtual   #142 <Method boolean ArrayList.contains(Object)>
	//*  31   74:ifeq            107
	//*  32   77:aload_0         
	//*  33   78:getfield        #106 <Field AssetNetworkUIService m>
	//*  34   81:invokevirtual   #112 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  35   84:invokevirtual   #146 <Method AssetMacAddressEvent AssetNetworkUIServiceData.getMacAddress()>
	//*  36   87:ifnull          107
			s = m.getServiceData().getMacAddress().macAddress();
	//   37   90:aload_0         
	//   38   91:getfield        #106 <Field AssetNetworkUIService m>
	//   39   94:invokevirtual   #112 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//   40   97:invokevirtual   #146 <Method AssetMacAddressEvent AssetNetworkUIServiceData.getMacAddress()>
	//   41  100:invokevirtual   #152 <Method String AssetMacAddressEvent.macAddress()>
	//   42  103:astore_2        
		else
	//*  43  104:goto            121
			s = com.irobot.home.util.j.o(k).d().p();
	//   44  107:aload_0         
	//   45  108:getfield        #94  <Field String k>
	//   46  111:invokestatic    #156 <Method Robot j.o(String)>
	//   47  114:invokevirtual   #161 <Method NetworkSettings Robot.d()>
	//   48  117:invokevirtual   #166 <Method String NetworkSettings.p()>
	//   49  120:astore_2        
		s1 = "";
	//   50  121:ldc1            #168 <String "">
	//   51  123:astore          4
		if(assetnetworkstatusevent == null) goto _L2; else goto _L1
	//   52  125:aload_3         
	//   53  126:ifnull          309
_L1:
		_cls2.a[assetnetworkstatusevent.cloudState().ordinal()];
	//   54  129:getstatic       #171 <Field int[] DetailedWifiSettingsActivity$2.a>
	//   55  132:aload_3         
	//   56  133:invokevirtual   #177 <Method CloudServerState AssetNetworkStatusEvent.cloudState()>
	//   57  136:invokevirtual   #183 <Method int CloudServerState.ordinal()>
	//   58  139:iaload          
		JVM INSTR tableswitch 1 14: default 212
	//	               1 303
	//	               2 297
	//	               3 291
	//	               4 285
	//	               5 279
	//	               6 273
	//	               7 267
	//	               8 261
	//	               9 255
	//	               10 249
	//	               11 243
	//	               12 237
	//	               13 231
	//	               14 225;
	//   59  140:tableswitch     1 14: default 212
	//	               1 303
	//	               2 297
	//	               3 291
	//	               4 285
	//	               5 279
	//	               6 273
	//	               7 267
	//	               8 261
	//	               9 255
	//	               10 249
	//	               11 243
	//	               12 237
	//	               13 231
	//	               14 225
		   goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L3:
		int i1 = 0x7f0f01d9;
	//   60  212:ldc1            #184 <Int 0x7f0f01d9>
	//   61  214:istore_1        
_L18:
		s1 = getString(i1);
	//   62  215:aload_0         
	//   63  216:iload_1         
	//   64  217:invokevirtual   #187 <Method String getString(int)>
	//   65  220:astore          4
		break; /* Loop/switch isn't completed */
	//   66  222:goto            309
_L17:
		i1 = 0x7f0f01df;
	//   67  225:ldc1            #188 <Int 0x7f0f01df>
	//   68  227:istore_1        
		continue; /* Loop/switch isn't completed */
	//   69  228:goto            215
_L16:
		i1 = 0x7f0f01e0;
	//   70  231:ldc1            #189 <Int 0x7f0f01e0>
	//   71  233:istore_1        
		continue; /* Loop/switch isn't completed */
	//   72  234:goto            215
_L15:
		i1 = 0x7f0f01e1;
	//   73  237:ldc1            #190 <Int 0x7f0f01e1>
	//   74  239:istore_1        
		continue; /* Loop/switch isn't completed */
	//   75  240:goto            215
_L14:
		i1 = 0x7f0f01e2;
	//   76  243:ldc1            #191 <Int 0x7f0f01e2>
	//   77  245:istore_1        
		continue; /* Loop/switch isn't completed */
	//   78  246:goto            215
_L13:
		i1 = 0x7f0f01e5;
	//   79  249:ldc1            #192 <Int 0x7f0f01e5>
	//   80  251:istore_1        
		continue; /* Loop/switch isn't completed */
	//   81  252:goto            215
_L12:
		i1 = 0x7f0f01e3;
	//   82  255:ldc1            #193 <Int 0x7f0f01e3>
	//   83  257:istore_1        
		continue; /* Loop/switch isn't completed */
	//   84  258:goto            215
_L11:
		i1 = 0x7f0f01e4;
	//   85  261:ldc1            #194 <Int 0x7f0f01e4>
	//   86  263:istore_1        
		continue; /* Loop/switch isn't completed */
	//   87  264:goto            215
_L10:
		i1 = 0x7f0f01dd;
	//   88  267:ldc1            #195 <Int 0x7f0f01dd>
	//   89  269:istore_1        
		continue; /* Loop/switch isn't completed */
	//   90  270:goto            215
_L9:
		i1 = 0x7f0f01de;
	//   91  273:ldc1            #196 <Int 0x7f0f01de>
	//   92  275:istore_1        
		continue; /* Loop/switch isn't completed */
	//   93  276:goto            215
_L8:
		i1 = 0x7f0f01da;
	//   94  279:ldc1            #197 <Int 0x7f0f01da>
	//   95  281:istore_1        
		continue; /* Loop/switch isn't completed */
	//   96  282:goto            215
_L7:
		i1 = 0x7f0f01d7;
	//   97  285:ldc1            #198 <Int 0x7f0f01d7>
	//   98  287:istore_1        
		continue; /* Loop/switch isn't completed */
	//   99  288:goto            215
_L6:
		i1 = 0x7f0f01d8;
	//  100  291:ldc1            #199 <Int 0x7f0f01d8>
	//  101  293:istore_1        
		continue; /* Loop/switch isn't completed */
	//  102  294:goto            215
_L5:
		i1 = 0x7f0f01dc;
	//  103  297:ldc1            #200 <Int 0x7f0f01dc>
	//  104  299:istore_1        
		continue; /* Loop/switch isn't completed */
	//  105  300:goto            215
_L4:
		i1 = 0x7f0f01db;
	//  106  303:ldc1            #201 <Int 0x7f0f01db>
	//  107  305:istore_1        
		if(true) goto _L18; else goto _L2
	//  108  306:goto            215
_L2:
		Object obj;
		Object obj2;
		if(assetnetworksettingsevent == null)
	//* 109  309:aload           5
	//* 110  311:ifnonnull       327
			obj = ((Object) (WifiSecurityType.WildCard));
	//  111  314:getstatic       #207 <Field WifiSecurityType WifiSecurityType.WildCard>
	//  112  317:astore_3        
		else
	//* 113  318:aload_3         
	//* 114  319:invokevirtual   #210 <Method String WifiSecurityType.name()>
	//* 115  322:astore          8
	//* 116  324:goto            336
			obj = ((Object) (assetnetworksettingsevent.securityType()));
	//  117  327:aload           5
	//  118  329:invokevirtual   #216 <Method WifiSecurityType AssetNetworkSettingsEvent.securityType()>
	//  119  332:astore_3        
		obj2 = ((Object) (((WifiSecurityType) (obj)).name()));
	//* 120  333:goto            318
		int j1;
		if(assetnetworksettingsevent != null && assetnetworksettingsevent.isDhcpEnabled())
	//* 121  336:aload           5
	//* 122  338:ifnull          355
	//* 123  341:aload           5
	//* 124  343:invokevirtual   #220 <Method boolean AssetNetworkSettingsEvent.isDhcpEnabled()>
	//* 125  346:ifeq            355
			j1 = 0x7f0f0986;
	//  126  349:ldc1            #221 <Int 0x7f0f0986>
	//  127  351:istore_1        
		else
	//* 128  352:goto            358
			j1 = 0x7f0f04d3;
	//  129  355:ldc1            #222 <Int 0x7f0f04d3>
	//  130  357:istore_1        
		String s2 = getString(j1);
	//  131  358:aload_0         
	//  132  359:iload_1         
	//  133  360:invokevirtual   #187 <Method String getString(int)>
	//  134  363:astore          6
		obj = "";
	//  135  365:ldc1            #168 <String "">
	//  136  367:astore_3        
		if(assetnetworksettingsevent != null)
	//* 137  368:aload           5
	//* 138  370:ifnull          405
			obj = ((Object) (String.format("%s/%s", new Object[] {
				NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.dns1()), NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.dns2())
			})));
	//  139  373:ldc1            #224 <String "%s/%s">
	//  140  375:iconst_2        
	//  141  376:anewarray       Object[]
	//  142  379:dup             
	//  143  380:iconst_0        
	//  144  381:aload           5
	//  145  383:invokevirtual   #230 <Method long AssetNetworkSettingsEvent.dns1()>
	//  146  386:invokestatic    #236 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//  147  389:aastore         
	//  148  390:dup             
	//  149  391:iconst_1        
	//  150  392:aload           5
	//  151  394:invokevirtual   #239 <Method long AssetNetworkSettingsEvent.dns2()>
	//  152  397:invokestatic    #236 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//  153  400:aastore         
	//  154  401:invokestatic    #243 <Method String String.format(String, Object[])>
	//  155  404:astore_3        
		a(b, 0x7f0f022d, s1);
	//  156  405:aload_0         
	//  157  406:aload_0         
	//  158  407:getfield        #245 <Field RelativeLayout b>
	//  159  410:ldc1            #246 <Int 0x7f0f022d>
	//  160  412:aload           4
	//  161  414:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		a(c, 0x7f0f07e1, ((String) (obj2)));
	//  162  417:aload_0         
	//  163  418:aload_0         
	//  164  419:getfield        #248 <Field RelativeLayout c>
	//  165  422:ldc1            #249 <Int 0x7f0f07e1>
	//  166  424:aload           8
	//  167  426:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		obj2 = ((Object) (d));
	//  168  429:aload_0         
	//  169  430:getfield        #251 <Field RelativeLayout d>
	//  170  433:astore          8
		if(obj1 != null)
	//* 171  435:aload           7
	//* 172  437:ifnull          453
			s1 = ((NetworkAddressEvent) (obj1)).networkAddress().host();
	//  173  440:aload           7
	//  174  442:invokevirtual   #257 <Method NetworkAddress NetworkAddressEvent.networkAddress()>
	//  175  445:invokevirtual   #260 <Method String NetworkAddress.host()>
	//  176  448:astore          4
		else
	//* 177  450:goto            457
			s1 = "";
	//  178  453:ldc1            #168 <String "">
	//  179  455:astore          4
		a(((RelativeLayout) (obj2)), 0x7f0f040b, s1);
	//  180  457:aload_0         
	//  181  458:aload           8
	//  182  460:ldc2            #261 <Int 0x7f0f040b>
	//  183  463:aload           4
	//  184  465:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		obj1 = ((Object) (e));
	//  185  468:aload_0         
	//  186  469:getfield        #263 <Field RelativeLayout e>
	//  187  472:astore          7
		if(assetnetworksettingsevent != null)
	//* 188  474:aload           5
	//* 189  476:ifnull          492
			s1 = NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.subnetMask());
	//  190  479:aload           5
	//  191  481:invokevirtual   #266 <Method long AssetNetworkSettingsEvent.subnetMask()>
	//  192  484:invokestatic    #236 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//  193  487:astore          4
		else
	//* 194  489:goto            496
			s1 = "";
	//  195  492:ldc1            #168 <String "">
	//  196  494:astore          4
		a(((RelativeLayout) (obj1)), 0x7f0f08a4, s1);
	//  197  496:aload_0         
	//  198  497:aload           7
	//  199  499:ldc2            #267 <Int 0x7f0f08a4>
	//  200  502:aload           4
	//  201  504:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		obj1 = ((Object) (g));
	//  202  507:aload_0         
	//  203  508:getfield        #269 <Field RelativeLayout g>
	//  204  511:astore          7
		if(assetnetworksettingsevent != null)
	//* 205  513:aload           5
	//* 206  515:ifnull          531
			s1 = NetworkAddress.IPv4NumericToDottedDecimal(assetnetworksettingsevent.gateway());
	//  207  518:aload           5
	//  208  520:invokevirtual   #272 <Method long AssetNetworkSettingsEvent.gateway()>
	//  209  523:invokestatic    #236 <Method String NetworkAddress.IPv4NumericToDottedDecimal(long)>
	//  210  526:astore          4
		else
	//* 211  528:goto            535
			s1 = "";
	//  212  531:ldc1            #168 <String "">
	//  213  533:astore          4
		a(((RelativeLayout) (obj1)), 0x7f0f07b5, s1);
	//  214  535:aload_0         
	//  215  536:aload           7
	//  216  538:ldc2            #273 <Int 0x7f0f07b5>
	//  217  541:aload           4
	//  218  543:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		obj1 = ((Object) (j));
	//  219  546:aload_0         
	//  220  547:getfield        #275 <Field RelativeLayout j>
	//  221  550:astore          7
		if(assetnetworksettingsevent != null)
	//* 222  552:aload           5
	//* 223  554:ifnull          570
			s1 = com.irobot.home.util.j.a(((java.util.List) (assetnetworksettingsevent.bssid())));
	//  224  557:aload           5
	//  225  559:invokevirtual   #278 <Method ArrayList AssetNetworkSettingsEvent.bssid()>
	//  226  562:invokestatic    #281 <Method String j.a(java.util.List)>
	//  227  565:astore          4
		else
	//* 228  567:goto            574
			s1 = "";
	//  229  570:ldc1            #168 <String "">
	//  230  572:astore          4
		a(((RelativeLayout) (obj1)), 0x7f0f016c, s1);
	//  231  574:aload_0         
	//  232  575:aload           7
	//  233  577:ldc2            #282 <Int 0x7f0f016c>
	//  234  580:aload           4
	//  235  582:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		a(f, 0x7f0f0268, s2);
	//  236  585:aload_0         
	//  237  586:aload_0         
	//  238  587:getfield        #284 <Field RelativeLayout f>
	//  239  590:ldc2            #285 <Int 0x7f0f0268>
	//  240  593:aload           6
	//  241  595:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		a(i, 0x7f0f0452, s);
	//  242  598:aload_0         
	//  243  599:aload_0         
	//  244  600:getfield        #287 <Field RelativeLayout i>
	//  245  603:ldc2            #288 <Int 0x7f0f0452>
	//  246  606:aload_2         
	//  247  607:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		a(h, 0x7f0f0279, ((String) (obj)));
	//  248  610:aload_0         
	//  249  611:aload_0         
	//  250  612:getfield        #290 <Field RelativeLayout h>
	//  251  615:ldc2            #291 <Int 0x7f0f0279>
	//  252  618:aload_3         
	//  253  619:invokespecial   #80  <Method void a(RelativeLayout, int, String)>
		return;
	//  254  622:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #294 <Method void BaseFragmentActivity.onStart()>
		m.registerSubscriber(n);
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field AssetNetworkUIService m>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field AssetNetworkUIServiceDataCallback n>
	//    6   12:invokevirtual   #298 <Method boolean AssetNetworkUIService.registerSubscriber(AssetNetworkUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #301 <Method void BaseFragmentActivity.onStop()>
		m.unregisterSubscriber(n);
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field AssetNetworkUIService m>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field AssetNetworkUIServiceDataCallback n>
	//    6   12:invokevirtual   #304 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	RelativeLayout a;
	RelativeLayout b;
	RelativeLayout c;
	RelativeLayout d;
	RelativeLayout e;
	RelativeLayout f;
	RelativeLayout g;
	RelativeLayout h;
	RelativeLayout i;
	RelativeLayout j;
	String k;
	String l;
	private AssetNetworkUIService m;
	private AssetNetworkUIServiceDataCallback n;
}
