// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResult, BatchResult, Status, zaa, 
//			GoogleApiClient, Result, BatchResultToken

public final class Batch extends BasePendingResult
{
	public static final class Builder
	{

		public final BatchResultToken add(PendingResult pendingresult)
		{
			BatchResultToken batchresulttoken = new BatchResultToken(zabe.size());
		//    0    0:new             #29  <Class BatchResultToken>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field List zabe>
		//    4    8:invokeinterface #35  <Method int List.size()>
		//    5   13:invokespecial   #38  <Method void BatchResultToken(int)>
		//    6   16:astore_2        
			zabe.add(((Object) (pendingresult)));
		//    7   17:aload_0         
		//    8   18:getfield        #22  <Field List zabe>
		//    9   21:aload_1         
		//   10   22:invokeinterface #41  <Method boolean List.add(Object)>
		//   11   27:pop             
			return batchresulttoken;
		//   12   28:aload_2         
		//   13   29:areturn         
		}

		public final Batch build()
		{
			return new Batch(zabe, zabf, ((zaa) (null)));
		//    0    0:new             #6   <Class Batch>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field List zabe>
		//    4    8:aload_0         
		//    5    9:getfield        #24  <Field GoogleApiClient zabf>
		//    6   12:aconst_null     
		//    7   13:invokespecial   #48  <Method void Batch(List, GoogleApiClient, zaa)>
		//    8   16:areturn         
		}

		private List zabe;
		private GoogleApiClient zabf;

		public Builder(GoogleApiClient googleapiclient)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zabe = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void ArrayList()>
		//    6   12:putfield        #22  <Field List zabe>
			zabf = googleapiclient;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #24  <Field GoogleApiClient zabf>
		//   10   20:return          
		}
	}


	private Batch(List list, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #23  <Method void BasePendingResult(GoogleApiClient)>
		mLock = new Object();
	//    3    5:aload_0         
	//    4    6:new             #25  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void Object()>
	//    7   13:putfield        #30  <Field Object mLock>
		zaaz = list.size();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokeinterface #36  <Method int List.size()>
	//   11   23:putfield        #38  <Field int zaaz>
		zabc = new PendingResult[zaaz];
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #38  <Field int zaaz>
	//   15   31:anewarray       PendingResult[]
	//   16   34:putfield        #42  <Field PendingResult[] zabc>
		if(list.isEmpty())
	//*  17   37:aload_1         
	//*  18   38:invokeinterface #46  <Method boolean List.isEmpty()>
	//*  19   43:ifeq            65
		{
			((BasePendingResult)this).setResult(((Result) (new BatchResult(Status.RESULT_SUCCESS, zabc))));
	//   20   46:aload_0         
	//   21   47:new             #48  <Class BatchResult>
	//   22   50:dup             
	//   23   51:getstatic       #54  <Field Status Status.RESULT_SUCCESS>
	//   24   54:aload_0         
	//   25   55:getfield        #42  <Field PendingResult[] zabc>
	//   26   58:invokespecial   #57  <Method void BatchResult(Status, PendingResult[])>
	//   27   61:invokevirtual   #61  <Method void BasePendingResult.setResult(Result)>
			return;
	//   28   64:return          
		}
		for(int i = 0; i < list.size(); i++)
	//*  29   65:iconst_0        
	//*  30   66:istore_3        
	//*  31   67:iload_3         
	//*  32   68:aload_1         
	//*  33   69:invokeinterface #36  <Method int List.size()>
	//*  34   74:icmpge          114
		{
			googleapiclient = ((GoogleApiClient) ((PendingResult)list.get(i)));
	//   35   77:aload_1         
	//   36   78:iload_3         
	//   37   79:invokeinterface #65  <Method Object List.get(int)>
	//   38   84:checkcast       #40  <Class PendingResult>
	//   39   87:astore_2        
			zabc[i] = ((PendingResult) (googleapiclient));
	//   40   88:aload_0         
	//   41   89:getfield        #42  <Field PendingResult[] zabc>
	//   42   92:iload_3         
	//   43   93:aload_2         
	//   44   94:aastore         
			((PendingResult) (googleapiclient)).addStatusListener(((PendingResult.StatusListener) (new zaa(this))));
	//   45   95:aload_2         
	//   46   96:new             #67  <Class zaa>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:invokespecial   #70  <Method void zaa(Batch)>
	//   50  104:invokevirtual   #74  <Method void PendingResult.addStatusListener(PendingResult$StatusListener)>
		}

	//   51  107:iload_3         
	//   52  108:iconst_1        
	//   53  109:iadd            
	//   54  110:istore_3        
	//*  55  111:goto            67
	//   56  114:return          
	}

	Batch(List list, GoogleApiClient googleapiclient, zaa zaa1)
	{
		this(list, googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #80  <Method void Batch(List, GoogleApiClient)>
	//    4    6:return          
	}

	static Object zaa(Batch batch)
	{
		return batch.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object mLock>
	//    2    4:areturn         
	}

	static boolean zaa(Batch batch, boolean flag)
	{
		batch.zabb = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #85  <Field boolean zabb>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static int zab(Batch batch)
	{
		int i = batch.zaaz;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int zaaz>
	//    2    4:istore_1        
		batch.zaaz = i - 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:putfield        #38  <Field int zaaz>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

	static boolean zab(Batch batch, boolean flag)
	{
		batch.zaba = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #89  <Field boolean zaba>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	static int zac(Batch batch)
	{
		return batch.zaaz;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int zaaz>
	//    2    4:ireturn         
	}

	static boolean zad(Batch batch)
	{
		return batch.zabb;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field boolean zabb>
	//    2    4:ireturn         
	}

	static void zae(Batch batch)
	{
		((BasePendingResult) (batch)).BasePendingResult.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void BasePendingResult.cancel()>
	//    2    4:return          
	}

	static boolean zaf(Batch batch)
	{
		return batch.zaba;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field boolean zaba>
	//    2    4:ireturn         
	}

	static PendingResult[] zag(Batch batch)
	{
		return batch.zabc;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field PendingResult[] zabc>
	//    2    4:areturn         
	}

	public final void cancel()
	{
		super.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void BasePendingResult.cancel()>
		PendingResult apendingresult[] = zabc;
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field PendingResult[] zabc>
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
	//   16   22:invokevirtual   #100 <Method void PendingResult.cancel()>

	//   17   25:iload_1         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            14
	//   22   32:return          
	}

	public final BatchResult createFailedResult(Status status)
	{
		return new BatchResult(status, zabc);
	//    0    0:new             #48  <Class BatchResult>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field PendingResult[] zabc>
	//    5    9:invokespecial   #57  <Method void BatchResult(Status, PendingResult[])>
	//    6   12:areturn         
	}

	public final volatile Result createFailedResult(Status status)
	{
		return ((Result) (createFailedResult(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method BatchResult createFailedResult(Status)>
	//    3    5:areturn         
	}

	private final Object mLock;
	private int zaaz;
	private boolean zaba;
	private boolean zabb;
	private final PendingResult zabc[];
}
