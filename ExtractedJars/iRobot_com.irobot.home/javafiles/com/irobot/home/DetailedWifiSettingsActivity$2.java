// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AssetNetworkUIServiceDataState;
import com.irobot.core.CloudServerState;

// Referenced classes of package com.irobot.home:
//			DetailedWifiSettingsActivity

static class DetailedWifiSettingsActivity$2
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
