// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.zzaaf;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResult, BatchResult, Status, GoogleApiClient, 
//			Result, BatchResultToken

public final class Batch extends zzaaf
{
	public static final class Builder
	{

		public BatchResultToken add(PendingResult pendingresult)
		{
			BatchResultToken batchresulttoken = new BatchResultToken(zzayR.size());
		//    0    0:new             #29  <Class BatchResultToken>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field List zzayR>
		//    4    8:invokeinterface #35  <Method int List.size()>
		//    5   13:invokespecial   #38  <Method void BatchResultToken(int)>
		//    6   16:astore_2        
			zzayR.add(((Object) (pendingresult)));
		//    7   17:aload_0         
		//    8   18:getfield        #22  <Field List zzayR>
		//    9   21:aload_1         
		//   10   22:invokeinterface #41  <Method boolean List.add(Object)>
		//   11   27:pop             
			return batchresulttoken;
		//   12   28:aload_2         
		//   13   29:areturn         
		}

		public Batch build()
		{
			return new Batch(zzayR, zzanE);
		//    0    0:new             #6   <Class Batch>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field List zzayR>
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field GoogleApiClient zzanE>
		//    6   12:aconst_null     
		//    7   13:invokespecial   #48  <Method void Batch(List, GoogleApiClient, Batch$1)>
		//    8   16:areturn         
		}

		private GoogleApiClient zzanE;
		private List zzayR;

		public Builder(GoogleApiClient googleapiclient)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzayR = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void ArrayList()>
		//    6   12:putfield        #22  <Field List zzayR>
			zzanE = googleapiclient;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #24  <Field GoogleApiClient zzanE>
		//   10   20:return          
		}
	}


	private Batch(List list, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #25  <Method void zzaaf(GoogleApiClient)>
		zzrJ = new Object();
	//    3    5:aload_0         
	//    4    6:new             #27  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #30  <Method void Object()>
	//    7   13:putfield        #32  <Field Object zzrJ>
		zzayM = list.size();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokeinterface #38  <Method int List.size()>
	//   11   23:putfield        #40  <Field int zzayM>
		zzayP = new PendingResult[zzayM];
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field int zzayM>
	//   15   31:anewarray       PendingResult[]
	//   16   34:putfield        #44  <Field PendingResult[] zzayP>
		if(list.isEmpty())
	//*  17   37:aload_1         
	//*  18   38:invokeinterface #48  <Method boolean List.isEmpty()>
	//*  19   43:ifeq            65
		{
			zzb(((Result) (new BatchResult(Status.zzazx, zzayP))));
	//   20   46:aload_0         
	//   21   47:new             #50  <Class BatchResult>
	//   22   50:dup             
	//   23   51:getstatic       #56  <Field Status Status.zzazx>
	//   24   54:aload_0         
	//   25   55:getfield        #44  <Field PendingResult[] zzayP>
	//   26   58:invokespecial   #59  <Method void BatchResult(Status, PendingResult[])>
	//   27   61:invokevirtual   #63  <Method void zzb(Result)>
			return;
	//   28   64:return          
		}
		for(int i = 0; i < list.size(); i++)
	//*  29   65:iconst_0        
	//*  30   66:istore_3        
	//*  31   67:iload_3         
	//*  32   68:aload_1         
	//*  33   69:invokeinterface #38  <Method int List.size()>
	//*  34   74:icmpge          114
		{
			googleapiclient = ((GoogleApiClient) ((PendingResult)list.get(i)));
	//   35   77:aload_1         
	//   36   78:iload_3         
	//   37   79:invokeinterface #67  <Method Object List.get(int)>
	//   38   84:checkcast       #42  <Class PendingResult>
	//   39   87:astore_2        
			zzayP[i] = ((PendingResult) (googleapiclient));
	//   40   88:aload_0         
	//   41   89:getfield        #44  <Field PendingResult[] zzayP>
	//   42   92:iload_3         
	//   43   93:aload_2         
	//   44   94:aastore         
			((PendingResult) (googleapiclient)).zza(new PendingResult.zza() {

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

			
			{
				zzayQ = Batch.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Batch zzayQ>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   45   95:aload_2         
	//   46   96:new             #7   <Class Batch$1>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:invokespecial   #70  <Method void Batch$1(Batch)>
	//   50  104:invokevirtual   #74  <Method void PendingResult.zza(PendingResult$zza)>
		}

	//   51  107:iload_3         
	//   52  108:iconst_1        
	//   53  109:iadd            
	//   54  110:istore_3        
	//*  55  111:goto            67
	//   56  114:return          
	}


	static Object zza(Batch batch)
	{
		return batch.zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Object zzrJ>
	//    2    4:areturn         
	}

	static boolean zza(Batch batch, boolean flag)
	{
		batch.zzayO = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean zzayO>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int zzb(Batch batch)
	{
		int i = batch.zzayM;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzayM>
	//    2    4:istore_1        
		batch.zzayM = i - 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:putfield        #40  <Field int zzayM>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

	static boolean zzb(Batch batch, boolean flag)
	{
		batch.zzayN = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean zzayN>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int zzc(Batch batch)
	{
		return batch.zzayM;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzayM>
	//    2    4:ireturn         
	}

	static boolean zzd(Batch batch)
	{
		return batch.zzayO;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean zzayO>
	//    2    4:ireturn         
	}

	static void zze(Batch batch)
	{
		((zzaaf) (batch)).zzaaf.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void zzaaf.cancel()>
	//    2    4:return          
	}

	static boolean zzf(Batch batch)
	{
		return batch.zzayN;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean zzayN>
	//    2    4:ireturn         
	}

	static PendingResult[] zzg(Batch batch)
	{
		return batch.zzayP;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field PendingResult[] zzayP>
	//    2    4:areturn         
	}

	public void cancel()
	{
		super.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void zzaaf.cancel()>
		PendingResult apendingresult[] = zzayP;
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field PendingResult[] zzayP>
	//    4    8:astore_3        
		int j = apendingresult.length;
	//    5    9:aload_3         
	//    6   10:arraylength     
	//    7   11:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          32
			apendingresult[i].cancel();
	//   13   19:aload_3         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:invokevirtual   #98  <Method void PendingResult.cancel()>

	//   17   25:iload_1         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            14
	//   22   32:return          
	}

	public BatchResult createFailedResult(Status status)
	{
		return new BatchResult(status, zzayP);
	//    0    0:new             #50  <Class BatchResult>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field PendingResult[] zzayP>
	//    5    9:invokespecial   #59  <Method void BatchResult(Status, PendingResult[])>
	//    6   12:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (createFailedResult(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method BatchResult createFailedResult(Status)>
	//    3    5:areturn         
	}

	private int zzayM;
	private boolean zzayN;
	private boolean zzayO;
	private final PendingResult zzayP[];
	private final Object zzrJ;
}
