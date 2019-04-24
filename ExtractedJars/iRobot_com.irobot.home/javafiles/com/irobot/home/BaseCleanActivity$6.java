// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.NotificationCenterServiceDataState;
import com.irobot.core.SettingType;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity

static class BaseCleanActivity$6
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[NotificationCenterServiceDataState.values().length];
	//    0    0:invokestatic    #19  <Method NotificationCenterServiceDataState[] NotificationCenterServiceDataState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[NotificationCenterServiceDataState.NotificationListUpdated.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field NotificationCenterServiceDataState NotificationCenterServiceDataState.NotificationListUpdated>
	//    6   15:invokevirtual   #29  <Method int NotificationCenterServiceDataState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field NotificationCenterServiceDataState NotificationCenterServiceDataState.NotificationRequestFailure>
	//*  11   26:invokevirtual   #29  <Method int NotificationCenterServiceDataState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field NotificationCenterServiceDataState NotificationCenterServiceDataState.Invalid>
	//*  16   37:invokevirtual   #29  <Method int NotificationCenterServiceDataState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #40  <Method SettingType[] SettingType.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #42  <Field int[] a>
	//*  23   51:getstatic       #42  <Field int[] a>
	//*  24   54:getstatic       #46  <Field SettingType SettingType.Name>
	//*  25   57:invokevirtual   #47  <Method int SettingType.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   29   63:astore_0        
		try
		{
			b[NotificationCenterServiceDataState.NotificationRequestFailure.ordinal()] = 2;
		}
	//*  30   64:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   31   67:astore_0        
		try
		{
			b[NotificationCenterServiceDataState.Invalid.ordinal()] = 3;
		}
	//*  32   68:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   33   71:astore_0        
		a = new int[SettingType.values().length];
		try
		{
			a[SettingType.Name.ordinal()] = 1;
		}
	//*  34   72:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   35   75:astore_0        
	//*  36   76:return          
	}
}
