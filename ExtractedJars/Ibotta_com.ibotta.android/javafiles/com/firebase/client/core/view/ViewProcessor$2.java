// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;


// Referenced classes of package com.firebase.client.core.view:
//			ViewProcessor

static class ViewProcessor$2
{

	static final int $SwitchMap$com$firebase$client$core$operation$Operation$OperationType[];

	static 
	{
		$SwitchMap$com$firebase$client$core$operation$Operation$OperationType = new int[com.firebase.client.core.operation.ionType.values().length];
	//    0    0:invokestatic    #18  <Method com.firebase.client.core.operation.Operation$OperationType[] com.firebase.client.core.operation.Operation$OperationType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
		try
		{
			$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.ionType.Overwrite.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
	//    5   12:getstatic       #24  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.Overwrite>
	//    6   15:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
	//*  10   23:getstatic       #31  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.Merge>
	//*  11   26:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
	//*  15   34:getstatic       #34  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.AckUserWrite>
	//*  16   37:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$core$operation$Operation$OperationType>
	//*  20   45:getstatic       #37  <Field com.firebase.client.core.operation.Operation$OperationType com.firebase.client.core.operation.Operation$OperationType.ListenComplete>
	//*  21   48:invokevirtual   #28  <Method int com.firebase.client.core.operation.Operation$OperationType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   25   54:astore_0        
		try
		{
			$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.ionType.Merge.ordinal()] = 2;
		}
	//*  26   55:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   27   58:astore_0        
		try
		{
			$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.ionType.AckUserWrite.ordinal()] = 3;
		}
	//*  28   59:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   29   62:astore_0        
		try
		{
			$SwitchMap$com$firebase$client$core$operation$Operation$OperationType[com.firebase.client.core.operation.ionType.ListenComplete.ordinal()] = 4;
		}
	//*  30   63:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
