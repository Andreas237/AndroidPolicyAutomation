// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.messaging.Type;

// Referenced classes of package com.birbit.android.jobqueue:
//			ConsumerManager

static class ConsumerManager$1
{

	static final int $SwitchMap$com$birbit$android$jobqueue$messaging$Type[];

	static 
	{
		$SwitchMap$com$birbit$android$jobqueue$messaging$Type = new int[Type.values().length];
	//    0    0:invokestatic    #18  <Method Type[] Type.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.RUN_JOB.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//    5   12:getstatic       #24  <Field Type Type.RUN_JOB>
	//    6   15:invokevirtual   #28  <Method int Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  10   23:getstatic       #31  <Field Type Type.COMMAND>
	//*  11   26:invokevirtual   #28  <Method int Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
	//*  15   32:astore_0        
	//*  16   33:return          
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   34:astore_0        
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.COMMAND.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  18   35:goto            20
	}
}
