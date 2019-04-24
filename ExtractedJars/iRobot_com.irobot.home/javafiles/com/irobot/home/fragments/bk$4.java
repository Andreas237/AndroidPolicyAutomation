// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.MissionStatusAction;
import com.irobot.core.ResolvedMissionStatus;

// Referenced classes of package com.irobot.home.fragments:
//			bk

static class bk$4
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[ResolvedMissionStatus.values().length];
	//    0    0:invokestatic    #19  <Method ResolvedMissionStatus[] ResolvedMissionStatus.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[ResolvedMissionStatus.Paused.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field ResolvedMissionStatus ResolvedMissionStatus.Paused>
	//    6   15:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field ResolvedMissionStatus ResolvedMissionStatus.PausedWithError>
	//*  11   26:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field ResolvedMissionStatus ResolvedMissionStatus.PausedWithStartRefuse>
	//*  16   37:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] b>
	//*  20   45:getstatic       #38  <Field ResolvedMissionStatus ResolvedMissionStatus.EndJobNoDock>
	//*  21   48:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] b>
	//*  25   56:getstatic       #41  <Field ResolvedMissionStatus ResolvedMissionStatus.EndJobWithDock>
	//*  26   59:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #21  <Field int[] b>
	//*  30   67:getstatic       #44  <Field ResolvedMissionStatus ResolvedMissionStatus.ReturnToDock>
	//*  31   70:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #21  <Field int[] b>
	//*  35   79:getstatic       #47  <Field ResolvedMissionStatus ResolvedMissionStatus.WetMoppingPausedWithStartRefuse>
	//*  36   82:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:invokestatic    #52  <Method MissionStatusAction[] MissionStatusAction.values()>
	//*  40   91:arraylength     
	//*  41   92:newarray        int[]
	//*  42   94:putstatic       #54  <Field int[] a>
	//*  43   97:getstatic       #54  <Field int[] a>
	//*  44  100:getstatic       #58  <Field MissionStatusAction MissionStatusAction.EndJob>
	//*  45  103:invokevirtual   #59  <Method int MissionStatusAction.ordinal()>
	//*  46  106:iconst_1        
	//*  47  107:iastore         
	//*  48  108:getstatic       #54  <Field int[] a>
	//*  49  111:getstatic       #61  <Field MissionStatusAction MissionStatusAction.ReturnToDock>
	//*  50  114:invokevirtual   #59  <Method int MissionStatusAction.ordinal()>
	//*  51  117:iconst_2        
	//*  52  118:iastore         
	//*  53  119:getstatic       #54  <Field int[] a>
	//*  54  122:getstatic       #64  <Field MissionStatusAction MissionStatusAction.EndNow>
	//*  55  125:invokevirtual   #59  <Method int MissionStatusAction.ordinal()>
	//*  56  128:iconst_3        
	//*  57  129:iastore         
	//*  58  130:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   59  131:astore_0        
		try
		{
			b[ResolvedMissionStatus.PausedWithError.ordinal()] = 2;
		}
	//*  60  132:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   61  135:astore_0        
		try
		{
			b[ResolvedMissionStatus.PausedWithStartRefuse.ordinal()] = 3;
		}
	//*  62  136:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   63  139:astore_0        
		try
		{
			b[ResolvedMissionStatus.EndJobNoDock.ordinal()] = 4;
		}
	//*  64  140:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   65  143:astore_0        
		try
		{
			b[ResolvedMissionStatus.EndJobWithDock.ordinal()] = 5;
		}
	//*  66  144:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   67  147:astore_0        
		try
		{
			b[ResolvedMissionStatus.ReturnToDock.ordinal()] = 6;
		}
	//*  68  148:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   69  151:astore_0        
		try
		{
			b[ResolvedMissionStatus.WetMoppingPausedWithStartRefuse.ordinal()] = 7;
		}
	//*  70  152:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   71  155:astore_0        
		a = new int[MissionStatusAction.values().length];
		try
		{
			a[MissionStatusAction.EndJob.ordinal()] = 1;
		}
	//*  72  156:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   73  159:astore_0        
		try
		{
			a[MissionStatusAction.ReturnToDock.ordinal()] = 2;
		}
	//*  74  160:goto            108
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   75  163:astore_0        
		try
		{
			a[MissionStatusAction.EndNow.ordinal()] = 3;
		}
	//*  76  164:goto            119
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   77  167:astore_0        
	//*  78  168:return          
	}
}
