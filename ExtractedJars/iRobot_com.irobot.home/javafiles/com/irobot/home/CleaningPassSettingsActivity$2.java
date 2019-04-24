// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MultiPassMode;
import com.irobot.core.SettingType;

// Referenced classes of package com.irobot.home:
//			CleaningPassSettingsActivity

static class CleaningPassSettingsActivity$2
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
			b[SettingType.MultiPass.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field SettingType SettingType.MultiPass>
	//    6   15:invokevirtual   #29  <Method int SettingType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field SettingType SettingType.MultiPassModesAvailable>
	//*  11   26:invokevirtual   #29  <Method int SettingType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:invokestatic    #37  <Method MultiPassMode[] MultiPassMode.values()>
	//*  15   34:arraylength     
	//*  16   35:newarray        int[]
	//*  17   37:putstatic       #39  <Field int[] a>
	//*  18   40:getstatic       #39  <Field int[] a>
	//*  19   43:getstatic       #43  <Field MultiPassMode MultiPassMode.Auto>
	//*  20   46:invokevirtual   #44  <Method int MultiPassMode.ordinal()>
	//*  21   49:iconst_1        
	//*  22   50:iastore         
	//*  23   51:getstatic       #39  <Field int[] a>
	//*  24   54:getstatic       #47  <Field MultiPassMode MultiPassMode.One>
	//*  25   57:invokevirtual   #44  <Method int MultiPassMode.ordinal()>
	//*  26   60:iconst_2        
	//*  27   61:iastore         
	//*  28   62:getstatic       #39  <Field int[] a>
	//*  29   65:getstatic       #50  <Field MultiPassMode MultiPassMode.Two>
	//*  30   68:invokevirtual   #44  <Method int MultiPassMode.ordinal()>
	//*  31   71:iconst_3        
	//*  32   72:iastore         
	//*  33   73:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   34   74:astore_0        
		try
		{
			b[SettingType.MultiPassModesAvailable.ordinal()] = 2;
		}
	//*  35   75:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   36   78:astore_0        
		a = new int[MultiPassMode.values().length];
		try
		{
			a[MultiPassMode.Auto.ordinal()] = 1;
		}
	//*  37   79:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   38   82:astore_0        
		try
		{
			a[MultiPassMode.One.ordinal()] = 2;
		}
	//*  39   83:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   40   86:astore_0        
		try
		{
			a[MultiPassMode.Two.ordinal()] = 3;
		}
	//*  41   87:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   90:astore_0        
	//*  43   91:return          
	}
}
