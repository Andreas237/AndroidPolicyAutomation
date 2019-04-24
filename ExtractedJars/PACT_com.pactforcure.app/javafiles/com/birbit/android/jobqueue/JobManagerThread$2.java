// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.messaging.Type;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManagerThread

static class JobManagerThread$2
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
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.ADD_JOB.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//    5   12:getstatic       #24  <Field Type Type.ADD_JOB>
	//    6   15:invokevirtual   #28  <Method int Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  10   23:getstatic       #31  <Field Type Type.JOB_CONSUMER_IDLE>
	//*  11   26:invokevirtual   #28  <Method int Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  15   34:getstatic       #34  <Field Type Type.RUN_JOB_RESULT>
	//*  16   37:invokevirtual   #28  <Method int Type.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  20   45:getstatic       #37  <Field Type Type.CONSTRAINT_CHANGE>
	//*  21   48:invokevirtual   #28  <Method int Type.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  25   56:getstatic       #40  <Field Type Type.CANCEL>
	//*  26   59:invokevirtual   #28  <Method int Type.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  30   67:getstatic       #43  <Field Type Type.PUBLIC_QUERY>
	//*  31   70:invokevirtual   #28  <Method int Type.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  35   79:getstatic       #46  <Field Type Type.COMMAND>
	//*  36   82:invokevirtual   #28  <Method int Type.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//*  40   91:getstatic       #49  <Field Type Type.SCHEDULER>
	//*  41   94:invokevirtual   #28  <Method int Type.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:return          
	//*  45  101:astore_0        
	//*  46  102:return          
	//*  47  103:astore_0        
	//*  48  104:goto            88
	//*  49  107:astore_0        
	//*  50  108:goto            76
	//*  51  111:astore_0        
	//*  52  112:goto            64
	//*  53  115:astore_0        
	//*  54  116:goto            53
	//*  55  119:astore_0        
	//*  56  120:goto            42
	//*  57  123:astore_0        
	//*  58  124:goto            31
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   59  127:astore_0        
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.JOB_CONSUMER_IDLE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.RUN_JOB_RESULT.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.CONSTRAINT_CHANGE.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.CANCEL.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.PUBLIC_QUERY.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.COMMAND.ordinal()] = 7;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.SCHEDULER.ordinal()] = 8;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  60  128:goto            20
	}
}
