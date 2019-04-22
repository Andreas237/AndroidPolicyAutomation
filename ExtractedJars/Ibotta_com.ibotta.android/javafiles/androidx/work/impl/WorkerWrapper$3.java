// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;


// Referenced classes of package androidx.work.impl:
//			WorkerWrapper

static class WorkerWrapper$3
{

	static final int $SwitchMap$androidx$work$ListenableWorker$Result[];

	static 
	{
		$SwitchMap$androidx$work$ListenableWorker$Result = new int[androidx.work..Result.values().length];
	//    0    0:invokestatic    #18  <Method androidx.work.ListenableWorker$Result[] androidx.work.ListenableWorker$Result.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
		try
		{
			$SwitchMap$androidx$work$ListenableWorker$Result[androidx.work..Result.SUCCESS.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
	//    5   12:getstatic       #24  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.SUCCESS>
	//    6   15:invokevirtual   #28  <Method int androidx.work.ListenableWorker$Result.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
	//*  10   23:getstatic       #31  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.RETRY>
	//*  11   26:invokevirtual   #28  <Method int androidx.work.ListenableWorker$Result.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
	//*  15   34:getstatic       #34  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.FAILURE>
	//*  16   37:invokevirtual   #28  <Method int androidx.work.ListenableWorker$Result.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$androidx$work$ListenableWorker$Result[androidx.work..Result.RETRY.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$androidx$work$ListenableWorker$Result[androidx.work..Result.FAILURE.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
