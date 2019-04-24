// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.OTAUIServiceDataState;
import com.irobot.core.SoftwareUpdateStatus;

// Referenced classes of package com.irobot.home:
//			AboutRobotTableViewActivity

static class AboutRobotTableViewActivity$3
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[SoftwareUpdateStatus.values().length];
	//    0    0:invokestatic    #19  <Method SoftwareUpdateStatus[] SoftwareUpdateStatus.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[SoftwareUpdateStatus.InProgress.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field SoftwareUpdateStatus SoftwareUpdateStatus.InProgress>
	//    6   15:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
	//*  11   26:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field SoftwareUpdateStatus SoftwareUpdateStatus.UpToDate>
	//*  16   37:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] b>
	//*  20   45:getstatic       #38  <Field SoftwareUpdateStatus SoftwareUpdateStatus.Unavailable>
	//*  21   48:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #43  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #45  <Field int[] a>
	//*  28   62:getstatic       #45  <Field int[] a>
	//*  29   65:getstatic       #49  <Field OTAUIServiceDataState OTAUIServiceDataState.ExpeditedOTAStatus>
	//*  30   68:invokevirtual   #50  <Method int OTAUIServiceDataState.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #45  <Field int[] a>
	//*  34   76:getstatic       #53  <Field OTAUIServiceDataState OTAUIServiceDataState.SoftwareUpdateStatus>
	//*  35   79:invokevirtual   #50  <Method int OTAUIServiceDataState.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   39   85:astore_0        
		try
		{
			b[SoftwareUpdateStatus.AvailableAndReady.ordinal()] = 2;
		}
	//*  40   86:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   41   89:astore_0        
		try
		{
			b[SoftwareUpdateStatus.UpToDate.ordinal()] = 3;
		}
	//*  42   90:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   43   93:astore_0        
		try
		{
			b[SoftwareUpdateStatus.Unavailable.ordinal()] = 4;
		}
	//*  44   94:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   45   97:astore_0        
		a = new int[OTAUIServiceDataState.values().length];
		try
		{
			a[OTAUIServiceDataState.ExpeditedOTAStatus.ordinal()] = 1;
		}
	//*  46   98:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   47  101:astore_0        
		try
		{
			a[OTAUIServiceDataState.SoftwareUpdateStatus.ordinal()] = 2;
		}
	//*  48  102:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  105:astore_0        
	//*  50  106:return          
	}
}
