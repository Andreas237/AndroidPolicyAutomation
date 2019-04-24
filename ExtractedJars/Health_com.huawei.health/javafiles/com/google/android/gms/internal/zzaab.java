// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zzb;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzzz

public final class zzaab
{

	public zzaab(Iterable iterable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class TaskCompletionSource>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void TaskCompletionSource()>
	//    6   12:putfield        #24  <Field TaskCompletionSource zzazS>
		zzazU = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #26  <Field boolean zzazU>
	//   10   20:aload_0         
	//   11   21:new             #28  <Class ArrayMap>
	//   12   24:dup             
	//   13   25:invokespecial   #29  <Method void ArrayMap()>
	//   14   28:putfield        #31  <Field ArrayMap zzayL>
		zzc zzc1;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); zzayL.put(((Object) (zzc1.getApiKey())), ((Object) (null))))
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #37  <Method Iterator Iterable.iterator()>
	//*  17   37:astore_1        
	//*  18   38:aload_1         
	//*  19   39:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  20   44:ifeq            73
			zzc1 = (zzc)((Iterator) (iterable)).next();
	//   21   47:aload_1         
	//   22   48:invokeinterface #47  <Method Object Iterator.next()>
	//   23   53:checkcast       #49  <Class zzc>
	//   24   56:astore_2        

	//   25   57:aload_0         
	//   26   58:getfield        #31  <Field ArrayMap zzayL>
	//   27   61:aload_2         
	//   28   62:invokevirtual   #53  <Method zzzz zzc.getApiKey()>
	//   29   65:aconst_null     
	//   30   66:invokevirtual   #57  <Method Object ArrayMap.put(Object, Object)>
	//   31   69:pop             
	//*  32   70:goto            38
		zzazT = zzayL.keySet().size();
	//   33   73:aload_0         
	//   34   74:aload_0         
	//   35   75:getfield        #31  <Field ArrayMap zzayL>
	//   36   78:invokevirtual   #61  <Method Set ArrayMap.keySet()>
	//   37   81:invokeinterface #67  <Method int Set.size()>
	//   38   86:putfield        #69  <Field int zzazT>
	//   39   89:return          
	}

	public Task getTask()
	{
		return zzazS.getTask();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field TaskCompletionSource zzazS>
	//    2    4:invokevirtual   #76  <Method Task TaskCompletionSource.getTask()>
	//    3    7:areturn         
	}

	public void zza(zzzz zzzz, ConnectionResult connectionresult)
	{
		zzayL.put(((Object) (zzzz)), ((Object) (connectionresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayMap zzayL>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #57  <Method Object ArrayMap.put(Object, Object)>
	//    5    9:pop             
		zzazT = zzazT - 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #69  <Field int zzazT>
	//    9   15:iconst_1        
	//   10   16:isub            
	//   11   17:putfield        #69  <Field int zzazT>
		if(!connectionresult.isSuccess())
	//*  12   20:aload_2         
	//*  13   21:invokevirtual   #84  <Method boolean ConnectionResult.isSuccess()>
	//*  14   24:ifne            32
			zzazU = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #26  <Field boolean zzazU>
		if(zzazT == 0)
	//*  18   32:aload_0         
	//*  19   33:getfield        #69  <Field int zzazT>
	//*  20   36:ifne            75
		{
			if(zzazU)
	//*  21   39:aload_0         
	//*  22   40:getfield        #26  <Field boolean zzazU>
	//*  23   43:ifeq            67
			{
				zzzz = ((zzzz) (new zzb(zzayL)));
	//   24   46:new             #86  <Class zzb>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:getfield        #31  <Field ArrayMap zzayL>
	//   28   54:invokespecial   #89  <Method void zzb(ArrayMap)>
	//   29   57:astore_1        
				zzazS.setException(((Exception) (zzzz)));
	//   30   58:aload_0         
	//   31   59:getfield        #24  <Field TaskCompletionSource zzazS>
	//   32   62:aload_1         
	//   33   63:invokevirtual   #93  <Method void TaskCompletionSource.setException(Exception)>
				return;
	//   34   66:return          
			}
			zzazS.setResult(((Object) (null)));
	//   35   67:aload_0         
	//   36   68:getfield        #24  <Field TaskCompletionSource zzazS>
	//   37   71:aconst_null     
	//   38   72:invokevirtual   #97  <Method void TaskCompletionSource.setResult(Object)>
		}
	//   39   75:return          
	}

	public void zzvA()
	{
		zzazS.setResult(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field TaskCompletionSource zzazS>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #97  <Method void TaskCompletionSource.setResult(Object)>
	//    4    8:return          
	}

	public Set zzvz()
	{
		return zzayL.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayMap zzayL>
	//    2    4:invokevirtual   #61  <Method Set ArrayMap.keySet()>
	//    3    7:areturn         
	}

	private final ArrayMap zzayL = new ArrayMap();
	private final TaskCompletionSource zzazS = new TaskCompletionSource();
	private int zzazT;
	private boolean zzazU;
}
