// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			FloorPlanActivity

static class FloorPlanActivity$5
{

	static final int a[];
	static final int b[];
	static final int c[];

	static 
	{
		c = new int[AssetNetworkUIServiceDataState.values().length];
	//    0    0:invokestatic    #20  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #22  <Field int[] c>
		try
		{
			c[AssetNetworkUIServiceDataState.RemoteConnectionState.ordinal()] = 1;
	//    4    9:getstatic       #22  <Field int[] c>
	//    5   12:getstatic       #26  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.RemoteConnectionState>
	//    6   15:invokevirtual   #30  <Method int AssetNetworkUIServiceDataState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #35  <Method MapsViewState[] MapsViewState.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #37  <Field int[] b>
	//*  13   29:getstatic       #37  <Field int[] b>
	//*  14   32:getstatic       #41  <Field MapsViewState MapsViewState.FloorPlanNavigation>
	//*  15   35:invokevirtual   #42  <Method int MapsViewState.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:getstatic       #37  <Field int[] b>
	//*  19   43:getstatic       #45  <Field MapsViewState MapsViewState.FloorPlanError>
	//*  20   46:invokevirtual   #42  <Method int MapsViewState.ordinal()>
	//*  21   49:iconst_2        
	//*  22   50:iastore         
	//*  23   51:invokestatic    #50  <Method PersistentMapsDestination[] PersistentMapsDestination.values()>
	//*  24   54:arraylength     
	//*  25   55:newarray        int[]
	//*  26   57:putstatic       #52  <Field int[] a>
	//*  27   60:getstatic       #52  <Field int[] a>
	//*  28   63:getstatic       #56  <Field PersistentMapsDestination PersistentMapsDestination.MapCustomizaton>
	//*  29   66:invokevirtual   #57  <Method int PersistentMapsDestination.ordinal()>
	//*  30   69:iconst_1        
	//*  31   70:iastore         
	//*  32   71:getstatic       #52  <Field int[] a>
	//*  33   74:getstatic       #60  <Field PersistentMapsDestination PersistentMapsDestination.FloorPlans>
	//*  34   77:invokevirtual   #57  <Method int PersistentMapsDestination.ordinal()>
	//*  35   80:iconst_2        
	//*  36   81:iastore         
	//*  37   82:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   38   83:astore_0        
		b = new int[MapsViewState.values().length];
		try
		{
			b[MapsViewState.FloorPlanNavigation.ordinal()] = 1;
		}
	//*  39   84:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   40   87:astore_0        
		try
		{
			b[MapsViewState.FloorPlanError.ordinal()] = 2;
		}
	//*  41   88:goto            40
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   42   91:astore_0        
		a = new int[PersistentMapsDestination.values().length];
		try
		{
			a[PersistentMapsDestination.MapCustomizaton.ordinal()] = 1;
		}
	//*  43   92:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   44   95:astore_0        
		try
		{
			a[PersistentMapsDestination.FloorPlans.ordinal()] = 2;
		}
	//*  45   96:goto            71
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   46   99:astore_0        
	//*  47  100:return          
	}
}
