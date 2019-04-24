// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MissionDataState;
import com.irobot.core.SettingType;

// Referenced classes of package com.irobot.home:
//			CustomerRegistrationActivity

static class CustomerRegistrationActivity$2
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[SettingType.values().length];
	//    0    0:invokestatic    #19  <Method SettingType[] SettingType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[SettingType.SerialNumber.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field SettingType SettingType.SerialNumber>
	//    6   15:invokevirtual   #29  <Method int SettingType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #34  <Method MissionDataState[] MissionDataState.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #36  <Field int[] a>
	//*  13   29:getstatic       #36  <Field int[] a>
	//*  14   32:getstatic       #40  <Field MissionDataState MissionDataState.EvacHelpContentId>
	//*  15   35:invokevirtual   #41  <Method int MissionDataState.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   19   41:astore_0        
		a = new int[MissionDataState.values().length];
		try
		{
			a[MissionDataState.EvacHelpContentId.ordinal()] = 1;
		}
	//*  20   42:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   21   45:astore_0        
	//*  22   46:return          
	}
}
