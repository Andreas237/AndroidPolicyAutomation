// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AssetSetupUIServiceViewState;
import com.irobot.core.SkuType;

// Referenced classes of package com.irobot.home:
//			SelectRobotTypeActivity

static class SelectRobotTypeActivity$3
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
