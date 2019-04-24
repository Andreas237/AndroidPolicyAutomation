// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AssetNetworkUIServiceViewState;
import com.irobot.core.CurrentConnectionState;

// Referenced classes of package com.irobot.home:
//			BraavaCleanActivity

static class BraavaCleanActivity$5
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[AssetNetworkUIServiceViewState.values().length];
	//    0    0:invokestatic    #19  <Method AssetNetworkUIServiceViewState[] AssetNetworkUIServiceViewState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[AssetNetworkUIServiceViewState.CurrentConnectionState.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field AssetNetworkUIServiceViewState AssetNetworkUIServiceViewState.CurrentConnectionState>
	//    6   15:invokevirtual   #29  <Method int AssetNetworkUIServiceViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #34  <Method CurrentConnectionState[] CurrentConnectionState.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #36  <Field int[] a>
	//*  13   29:getstatic       #36  <Field int[] a>
	//*  14   32:getstatic       #40  <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*  15   35:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:getstatic       #36  <Field int[] a>
	//*  19   43:getstatic       #44  <Field CurrentConnectionState CurrentConnectionState.Connecting>
	//*  20   46:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
	//*  21   49:iconst_2        
	//*  22   50:iastore         
	//*  23   51:getstatic       #36  <Field int[] a>
	//*  24   54:getstatic       #47  <Field CurrentConnectionState CurrentConnectionState.Error>
	//*  25   57:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
	//*  26   60:iconst_3        
	//*  27   61:iastore         
	//*  28   62:getstatic       #36  <Field int[] a>
	//*  29   65:getstatic       #50  <Field CurrentConnectionState CurrentConnectionState.Disconnected>
	//*  30   68:invokevirtual   #41  <Method int CurrentConnectionState.ordinal()>
	//*  31   71:iconst_4        
	//*  32   72:iastore         
	//*  33   73:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   34   74:astore_0        
		a = new int[CurrentConnectionState.values().length];
		try
		{
			a[CurrentConnectionState.ConnectedLocally.ordinal()] = 1;
		}
	//*  35   75:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   36   78:astore_0        
		try
		{
			a[CurrentConnectionState.Connecting.ordinal()] = 2;
		}
	//*  37   79:goto            40
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   38   82:astore_0        
		try
		{
			a[CurrentConnectionState.Error.ordinal()] = 3;
		}
	//*  39   83:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   40   86:astore_0        
		try
		{
			a[CurrentConnectionState.Disconnected.ordinal()] = 4;
		}
	//*  41   87:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   90:astore_0        
	//*  43   91:return          
	}
}
