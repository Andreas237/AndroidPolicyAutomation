// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.zzzx;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResult, BatchResult, Status, GoogleApiClient, 
//			Result, BatchResultToken

public final class Batch extends zzzx
{
	public static final class Builder
	{

		public BatchResultToken add(PendingResult pendingresult)
		{
			BatchResultToken batchresulttoken = new BatchResultToken(zzaxE.size());
		//    0    0:new             #29  <Class BatchResultToken>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field List zzaxE>
		//    4    8:invokeinterface #35  <Method int List.size()>
		//    5   13:invokespecial   #38  <Method void BatchResultToken(int)>
		//    6   16:astore_2        
			zzaxE.add(((Object) (pendingresult)));
		//    7   17:aload_0         
		//    8   18:getfield        #22  <Field List zzaxE>
		//    9   21:aload_1         
		//   10   22:invokeinterface #41  <Method boolean List.add(Object)>
		//   11   27:pop             
			return batchresulttoken;
		//   12   28:aload_2         
		//   13   29:areturn         
		}

		public Batch build()
		{
			return new Batch(zzaxE, zzamy);
		//    0    0:new             #6   <Class Batch>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field List zzaxE>
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field GoogleApiClient zzamy>
		//    6   12:aconst_null     
		//    7   13:invokespecial   #48  <Method void Batch(List, GoogleApiClient, Batch$1)>
		//    8   16:areturn         
		}

		private GoogleApiClient zzamy;
		private List zzaxE;

		public Builder(GoogleApiClient googleapiclient)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzaxE = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void ArrayList()>
		//    6   12:putfield        #22  <Field List zzaxE>
			zzamy = googleapiclient;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #24  <Field GoogleApiClient zzamy>
		//   10   20:return          
		}
	}


	private Batch(List list, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #25  <Method void zzzx(GoogleApiClient)>
		zzrN = new Object();
	//    3    5:aload_0         
	//    4    6:new             #27  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #30  <Method void Object()>
	//    7   13:putfield        #32  <Field Object zzrN>
		zzaxz = list.size();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokeinterface #38  <Method int List.size()>
	//   11   23:putfield        #40  <Field int zzaxz>
		zzaxC = new PendingResult[zzaxz];
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field int zzaxz>
	//   15   31:anewarray       PendingResult[]
	//   16   34:putfield        #44  <Field PendingResult[] zzaxC>
		if(list.isEmpty())
	//*  17   37:aload_1         
	//*  18   38:invokeinterface #48  <Method boolean List.isEmpty()>
	//*  19   43:ifeq            65
		{
			zzb(((Result) (new BatchResult(Status.zzayh, zzaxC))));
	//   20   46:aload_0         
	//   21   47:new             #50  <Class BatchResult>
	//   22   50:dup             
	//   23   51:getstatic       #56  <Field Status Status.zzayh>
	//   24   54:aload_0         
	//   25   55:getfield        #44  <Field PendingResult[] zzaxC>
	//   26   58:invokespecial   #59  <Method void BatchResult(Status, PendingResult[])>
	//   27   61:invokevirtual   #63  <Method void zzb(Result)>
		} else
	//*  28   64:return          
		{
			int i = 0;
	//   29   65:iconst_0        
	//   30   66:istore_3        
			while(i < list.size()) 
	//*  31   67:iload_3         
	//*  32   68:aload_1         
	//*  33   69:invokeinterface #38  <Method int List.size()>
	//*  34   74:icmpge          64
			{
				googleapiclient = ((GoogleApiClient) ((PendingResult)list.get(i)));
	//   35   77:aload_1         
	//   36   78:iload_3         
	//   37   79:invokeinterface #67  <Method Object List.get(int)>
	//   38   84:checkcast       #42  <Class PendingResult>
	//   39   87:astore_2        
				zzaxC[i] = ((PendingResult) (googleapiclient));
	//   40   88:aload_0         
	//   41   89:getfield        #44  <Field PendingResult[] zzaxC>
	//   42   92:iload_3         
	//   43   93:aload_2         
	//   44   94:aastore         
				((PendingResult) (googleapiclient)).zza(new PendingResult.zza() {

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

			
			{
				zzaxD = Batch.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Batch zzaxD>
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
				i++;
	//   51  107:iload_3         
	//   52  108:iconst_1        
	//   53  109:iadd            
	//   54  110:istore_3        
			}
		}
	//*  55  111:goto            67
	}


	static Object zza(Batch batch)
	{
		return batch.zzrN;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Object zzrN>
	//    2    4:areturn         
	}

	static boolean zza(Batch batch, boolean flag)
	{
		batch.zzaxB = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean zzaxB>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int zzb(Batch batch)
	{
		int i = batch.zzaxz;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzaxz>
	//    2    4:istore_1        
		batch.zzaxz = i - 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:putfield        #40  <Field int zzaxz>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

	static boolean zzb(Batch batch, boolean flag)
	{
		batch.zzaxA = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean zzaxA>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int zzc(Batch batch)
	{
		return batch.zzaxz;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzaxz>
	//    2    4:ireturn         
	}

	static boolean zzd(Batch batch)
	{
		return batch.zzaxB;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean zzaxB>
	//    2    4:ireturn         
	}

	static void zze(Batch batch)
	{
		((zzzx) (batch)).zzzx.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void zzzx.cancel()>
	//    2    4:return          
	}

	static boolean zzf(Batch batch)
	{
		return batch.zzaxA;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean zzaxA>
	//    2    4:ireturn         
	}

	static PendingResult[] zzg(Batch batch)
	{
		return batch.zzaxC;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field PendingResult[] zzaxC>
	//    2    4:areturn         
	}

	public void cancel()
	{
		super.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void zzzx.cancel()>
		PendingResult apendingresult[] = zzaxC;
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field PendingResult[] zzaxC>
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
		return new BatchResult(status, zzaxC);
	//    0    0:new             #50  <Class BatchResult>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field PendingResult[] zzaxC>
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

	private boolean zzaxA;
	private boolean zzaxB;
	private final PendingResult zzaxC[];
	private int zzaxz;
	private final Object zzrN;
}
