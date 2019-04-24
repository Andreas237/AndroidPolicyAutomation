// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//			Batch, Status, BatchResult

class Batch$1
	implements esult.zza
{

	public void zzy(Status status)
	{
		Object obj = Batch.zza(zzayQ);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Batch zzayQ>
	//    2    4:invokestatic    #26  <Method Object Batch.zza(Batch)>
	//    3    7:astore_3        
		obj;
	//    4    8:aload_3         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		boolean flag = zzayQ.isCanceled();
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field Batch zzayQ>
	//    8   14:invokevirtual   #30  <Method boolean Batch.isCanceled()>
	//    9   17:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_25;
	//   10   18:iload_2         
	//   11   19:ifeq            25
		obj;
	//   12   22:aload_3         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		if(status.isCanceled())
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #33  <Method boolean Status.isCanceled()>
	//*  17   29:ifeq            44
		{
			Batch.zza(zzayQ, true);
	//   18   32:aload_0         
	//   19   33:getfield        #16  <Field Batch zzayQ>
	//   20   36:iconst_1        
	//   21   37:invokestatic    #36  <Method boolean Batch.zza(Batch, boolean)>
	//   22   40:pop             
			break MISSING_BLOCK_LABEL_60;
	//   23   41:goto            60
		}
		if(!status.isSuccess())
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #39  <Method boolean Status.isSuccess()>
	//*  26   48:ifne            60
			Batch.zzb(zzayQ, true);
	//   27   51:aload_0         
	//   28   52:getfield        #16  <Field Batch zzayQ>
	//   29   55:iconst_1        
	//   30   56:invokestatic    #42  <Method boolean Batch.zzb(Batch, boolean)>
	//   31   59:pop             
		Batch.zzb(zzayQ);
	//   32   60:aload_0         
	//   33   61:getfield        #16  <Field Batch zzayQ>
	//   34   64:invokestatic    #45  <Method int Batch.zzb(Batch)>
	//   35   67:pop             
		if(Batch.zzc(zzayQ) != 0)
			break MISSING_BLOCK_LABEL_147;
	//   36   68:aload_0         
	//   37   69:getfield        #16  <Field Batch zzayQ>
	//   38   72:invokestatic    #48  <Method int Batch.zzc(Batch)>
	//   39   75:ifne            147
		if(Batch.zzd(zzayQ))
	//*  40   78:aload_0         
	//*  41   79:getfield        #16  <Field Batch zzayQ>
	//*  42   82:invokestatic    #52  <Method boolean Batch.zzd(Batch)>
	//*  43   85:ifeq            98
		{
			Batch.zze(zzayQ);
	//   44   88:aload_0         
	//   45   89:getfield        #16  <Field Batch zzayQ>
	//   46   92:invokestatic    #55  <Method void Batch.zze(Batch)>
			break MISSING_BLOCK_LABEL_147;
	//   47   95:goto            147
		}
		if(Batch.zzf(zzayQ))
	//*  48   98:aload_0         
	//*  49   99:getfield        #16  <Field Batch zzayQ>
	//*  50  102:invokestatic    #58  <Method boolean Batch.zzf(Batch)>
	//*  51  105:ifeq            121
		{
			status = new Status(13);
	//   52  108:new             #32  <Class Status>
	//   53  111:dup             
	//   54  112:bipush          13
	//   55  114:invokespecial   #61  <Method void Status(int)>
	//   56  117:astore_1        
			break MISSING_BLOCK_LABEL_125;
	//   57  118:goto            125
		}
		status = Status.zzazx;
	//   58  121:getstatic       #65  <Field Status Status.zzazx>
	//   59  124:astore_1        
		zzayQ.zzb(((Result) (new BatchResult(status, Batch.zzg(zzayQ)))));
	//   60  125:aload_0         
	//   61  126:getfield        #16  <Field Batch zzayQ>
	//   62  129:new             #67  <Class BatchResult>
	//   63  132:dup             
	//   64  133:aload_1         
	//   65  134:aload_0         
	//   66  135:getfield        #16  <Field Batch zzayQ>
	//   67  138:invokestatic    #71  <Method PendingResult[] Batch.zzg(Batch)>
	//   68  141:invokespecial   #74  <Method void BatchResult(Status, PendingResult[])>
	//   69  144:invokevirtual   #77  <Method void Batch.zzb(Result)>
		obj;
	//   70  147:aload_3         
		JVM INSTR monitorexit ;
	//   71  148:monitorexit     
		return;
	//   72  149:return          
		status;
	//   73  150:astore_1        
	//*  74  151:aload_3         
		throw status;
	//   75  152:monitorexit     
	//   76  153:aload_1         
	//   77  154:athrow          
	}

	final Batch zzayQ;

	Batch$1(Batch batch)
	{
		zzayQ = batch;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Batch zzayQ>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
