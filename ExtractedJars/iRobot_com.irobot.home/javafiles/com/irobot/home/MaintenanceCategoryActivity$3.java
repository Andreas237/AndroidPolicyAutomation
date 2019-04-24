// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MaintenanceViewState;
import com.irobot.core.RobotCareType;

// Referenced classes of package com.irobot.home:
//			MaintenanceCategoryActivity

static class MaintenanceCategoryActivity$3
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[MaintenanceViewState.values().length];
	//    0    0:invokestatic    #19  <Method MaintenanceViewState[] MaintenanceViewState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[MaintenanceViewState.UpdatePartsList.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field MaintenanceViewState MaintenanceViewState.UpdatePartsList>
	//    6   15:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field MaintenanceViewState MaintenanceViewState.EnableCategoryStatusReset>
	//*  11   26:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field MaintenanceViewState MaintenanceViewState.ShowResetInProgress>
	//*  16   37:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] b>
	//*  20   45:getstatic       #38  <Field MaintenanceViewState MaintenanceViewState.ShowResetCategorySuccess>
	//*  21   48:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] b>
	//*  25   56:getstatic       #41  <Field MaintenanceViewState MaintenanceViewState.ShowResetCategoryFailed>
	//*  26   59:invokevirtual   #29  <Method int MaintenanceViewState.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:invokestatic    #46  <Method RobotCareType[] RobotCareType.values()>
	//*  30   67:arraylength     
	//*  31   68:newarray        int[]
	//*  32   70:putstatic       #48  <Field int[] a>
	//*  33   73:getstatic       #48  <Field int[] a>
	//*  34   76:getstatic       #52  <Field RobotCareType RobotCareType.Bin>
	//*  35   79:invokevirtual   #53  <Method int RobotCareType.ordinal()>
	//*  36   82:iconst_1        
	//*  37   83:iastore         
	//*  38   84:getstatic       #48  <Field int[] a>
	//*  39   87:getstatic       #56  <Field RobotCareType RobotCareType.Core>
	//*  40   90:invokevirtual   #53  <Method int RobotCareType.ordinal()>
	//*  41   93:iconst_2        
	//*  42   94:iastore         
	//*  43   95:getstatic       #48  <Field int[] a>
	//*  44   98:getstatic       #59  <Field RobotCareType RobotCareType.Debris>
	//*  45  101:invokevirtual   #53  <Method int RobotCareType.ordinal()>
	//*  46  104:iconst_3        
	//*  47  105:iastore         
	//*  48  106:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   49  107:astore_0        
		try
		{
			b[MaintenanceViewState.EnableCategoryStatusReset.ordinal()] = 2;
		}
	//*  50  108:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   51  111:astore_0        
		try
		{
			b[MaintenanceViewState.ShowResetInProgress.ordinal()] = 3;
		}
	//*  52  112:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   53  115:astore_0        
		try
		{
			b[MaintenanceViewState.ShowResetCategorySuccess.ordinal()] = 4;
		}
	//*  54  116:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   55  119:astore_0        
		try
		{
			b[MaintenanceViewState.ShowResetCategoryFailed.ordinal()] = 5;
		}
	//*  56  120:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   57  123:astore_0        
		a = new int[RobotCareType.values().length];
		try
		{
			a[RobotCareType.Bin.ordinal()] = 1;
		}
	//*  58  124:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   59  127:astore_0        
		try
		{
			a[RobotCareType.Core.ordinal()] = 2;
		}
	//*  60  128:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   61  131:astore_0        
		try
		{
			a[RobotCareType.Debris.ordinal()] = 3;
		}
	//*  62  132:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   63  135:astore_0        
	//*  64  136:return          
	}
}
