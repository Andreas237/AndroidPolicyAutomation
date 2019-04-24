// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AssetSetupUIServiceViewState;
import com.irobot.core.SkuType;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

static class BroadcastSetupActivity$18
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
			b[AssetSetupUIServiceViewState.CurrentProvisioningStatus.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.CurrentProvisioningStatus>
	//    6   15:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ConnectToSoftAp>
	//*  11   26:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ConnectToHomeAp>
	//*  16   37:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] b>
	//*  20   45:getstatic       #38  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.ReconnectedToIncorrectHomeAccessPoint>
	//*  21   48:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] b>
	//*  25   56:getstatic       #41  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.WifiProvisioningError>
	//*  26   59:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #21  <Field int[] b>
	//*  30   67:getstatic       #44  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.AssetDiscoveredOnHomeNetworkUpdated>
	//*  31   70:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #21  <Field int[] b>
	//*  35   79:getstatic       #47  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.TransitionToProvisioningType>
	//*  36   82:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #21  <Field int[] b>
	//*  40   91:getstatic       #50  <Field AssetSetupUIServiceViewState AssetSetupUIServiceViewState.Invalid>
	//*  41   94:invokevirtual   #29  <Method int AssetSetupUIServiceViewState.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:invokestatic    #55  <Method SkuType[] SkuType.values()>
	//*  45  103:arraylength     
	//*  46  104:newarray        int[]
	//*  47  106:putstatic       #57  <Field int[] a>
	//*  48  109:getstatic       #57  <Field int[] a>
	//*  49  112:getstatic       #61  <Field SkuType SkuType.SanMarino>
	//*  50  115:invokevirtual   #62  <Method int SkuType.ordinal()>
	//*  51  118:iconst_1        
	//*  52  119:iastore         
	//*  53  120:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   54  121:astore_0        
		try
		{
			b[AssetSetupUIServiceViewState.ConnectToSoftAp.ordinal()] = 2;
		}
	//*  55  122:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   56  125:astore_0        
		try
		{
			b[AssetSetupUIServiceViewState.ConnectToHomeAp.ordinal()] = 3;
		}
	//*  57  126:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   58  129:astore_0        
		try
		{
			b[AssetSetupUIServiceViewState.ReconnectedToIncorrectHomeAccessPoint.ordinal()] = 4;
		}
	//*  59  130:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   60  133:astore_0        
		try
		{
			b[AssetSetupUIServiceViewState.WifiProvisioningError.ordinal()] = 5;
		}
	//*  61  134:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   62  137:astore_0        
		try
		{
			b[AssetSetupUIServiceViewState.AssetDiscoveredOnHomeNetworkUpdated.ordinal()] = 6;
		}
	//*  63  138:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   64  141:astore_0        
		try
		{
			b[AssetSetupUIServiceViewState.TransitionToProvisioningType.ordinal()] = 7;
		}
	//*  65  142:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   66  145:astore_0        
		try
		{
			b[AssetSetupUIServiceViewState.Invalid.ordinal()] = 8;
		}
	//*  67  146:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   68  149:astore_0        
		a = new int[SkuType.values().length];
		try
		{
			a[SkuType.SanMarino.ordinal()] = 1;
		}
	//*  69  150:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   70  153:astore_0        
	//*  71  154:return          
	}
}
