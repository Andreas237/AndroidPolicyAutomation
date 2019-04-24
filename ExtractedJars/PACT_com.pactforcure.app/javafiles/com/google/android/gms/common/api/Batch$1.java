// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//			Batch, Status, BatchResult

class Batch$1
	implements esult.zza
{

	public void zzx(Status status)
	{
label0:
		{
			synchronized(Batch.zza(zzaxD))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Batch zzaxD>
	//*   2    4:invokestatic    #26  <Method Object Batch.zza(Batch)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
			{
				if(!zzaxD.isCanceled())
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field Batch zzaxD>
	//    8   14:invokevirtual   #30  <Method boolean Batch.isCanceled()>
	//    9   17:ifeq            23
			}
	//   10   20:aload_2         
	//   11   21:monitorexit     
			return;
	//   12   22:return          
		}
		if(!status.isCanceled()) goto _L2; else goto _L1
	//   13   23:aload_1         
	//   14   24:invokevirtual   #33  <Method boolean Status.isCanceled()>
	//   15   27:ifeq            82
_L1:
		Batch.zza(zzaxD, true);
	//   16   30:aload_0         
	//   17   31:getfield        #16  <Field Batch zzaxD>
	//   18   34:iconst_1        
	//   19   35:invokestatic    #36  <Method boolean Batch.zza(Batch, boolean)>
	//   20   38:pop             
_L8:
		Batch.zzb(zzaxD);
	//   21   39:aload_0         
	//   22   40:getfield        #16  <Field Batch zzaxD>
	//   23   43:invokestatic    #40  <Method int Batch.zzb(Batch)>
	//   24   46:pop             
		if(Batch.zzc(zzaxD) != 0) goto _L4; else goto _L3
	//   25   47:aload_0         
	//   26   48:getfield        #16  <Field Batch zzaxD>
	//   27   51:invokestatic    #43  <Method int Batch.zzc(Batch)>
	//   28   54:ifne            74
_L3:
		if(!Batch.zzd(zzaxD)) goto _L6; else goto _L5
	//   29   57:aload_0         
	//   30   58:getfield        #16  <Field Batch zzaxD>
	//   31   61:invokestatic    #47  <Method boolean Batch.zzd(Batch)>
	//   32   64:ifeq            101
_L5:
		Batch.zze(zzaxD);
	//   33   67:aload_0         
	//   34   68:getfield        #16  <Field Batch zzaxD>
	//   35   71:invokestatic    #50  <Method void Batch.zze(Batch)>
_L4:
		obj;
	//   36   74:aload_2         
		JVM INSTR monitorexit ;
	//   37   75:monitorexit     
		return;
	//   38   76:return          
		status;
	//   39   77:astore_1        
		obj;
	//   40   78:aload_2         
		JVM INSTR monitorexit ;
	//   41   79:monitorexit     
		throw status;
	//   42   80:aload_1         
	//   43   81:athrow          
_L2:
		if(status.isSuccess()) goto _L8; else goto _L7
	//   44   82:aload_1         
	//   45   83:invokevirtual   #53  <Method boolean Status.isSuccess()>
	//   46   86:ifne            39
_L7:
		Batch.zzb(zzaxD, true);
	//   47   89:aload_0         
	//   48   90:getfield        #16  <Field Batch zzaxD>
	//   49   93:iconst_1        
	//   50   94:invokestatic    #55  <Method boolean Batch.zzb(Batch, boolean)>
	//   51   97:pop             
		  goto _L8
	//*  52   98:goto            39
_L6:
		if(!Batch.zzf(zzaxD))
			break MISSING_BLOCK_LABEL_146;
	//   53  101:aload_0         
	//   54  102:getfield        #16  <Field Batch zzaxD>
	//   55  105:invokestatic    #58  <Method boolean Batch.zzf(Batch)>
	//   56  108:ifeq            146
		status = new Status(13);
	//   57  111:new             #32  <Class Status>
	//   58  114:dup             
	//   59  115:bipush          13
	//   60  117:invokespecial   #61  <Method void Status(int)>
	//   61  120:astore_1        
_L9:
		zzaxD.zzb(((Result) (new BatchResult(status, Batch.zzg(zzaxD)))));
	//   62  121:aload_0         
	//   63  122:getfield        #16  <Field Batch zzaxD>
	//   64  125:new             #63  <Class BatchResult>
	//   65  128:dup             
	//   66  129:aload_1         
	//   67  130:aload_0         
	//   68  131:getfield        #16  <Field Batch zzaxD>
	//   69  134:invokestatic    #67  <Method PendingResult[] Batch.zzg(Batch)>
	//   70  137:invokespecial   #70  <Method void BatchResult(Status, PendingResult[])>
	//   71  140:invokevirtual   #73  <Method void Batch.zzb(Result)>
		  goto _L4
	//*  72  143:goto            74
		status = Status.zzayh;
	//   73  146:getstatic       #77  <Field Status Status.zzayh>
	//   74  149:astore_1        
		  goto _L9
	//*  75  150:goto            121
	}

	final Batch zzaxD;

	Batch$1(Batch batch)
	{
		zzaxD = batch;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Batch zzaxD>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
