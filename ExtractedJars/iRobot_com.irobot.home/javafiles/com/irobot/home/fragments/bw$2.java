// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.AssetSetupUIServiceViewState;
import com.irobot.core.WifiProvisioningStatus;

// Referenced classes of package com.irobot.home.fragments:
//			bw

static class bw$2
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
		a = new int[android.net.rkInfo.State.values().length];
		try
		{
			a[android.net.rkInfo.State.CONNECTED.ordinal()] = 1;
		}
	//* 122  266:goto            188
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  123  269:astore_0        
	//* 124  270:return          
	}
}
