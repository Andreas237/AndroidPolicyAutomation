// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.tasks:
//			Tasks, zzh

static final class Tasks$zzc
	implements Tasks$zzb
{

	private void zzTJ()
	{
		if(zzbNK + zzbNL == zzbNJ)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int zzbNK>
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field int zzbNL>
	//*   4    8:iadd            
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field int zzbNJ>
	//*   7   13:icmpne          92
		{
			if(zzbNH == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #41  <Field Exception zzbNH>
	//*  10   20:ifnonnull       32
			{
				zzbNC.setResult(((Object) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #31  <Field zzh zzbNC>
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #47  <Method void zzh.setResult(Object)>
				return;
	//   15   31:return          
			}
			zzh zzh1 = zzbNC;
	//   16   32:aload_0         
	//   17   33:getfield        #31  <Field zzh zzbNC>
	//   18   36:astore_3        
			int i = zzbNL;
	//   19   37:aload_0         
	//   20   38:getfield        #39  <Field int zzbNL>
	//   21   41:istore_1        
			int j = zzbNJ;
	//   22   42:aload_0         
	//   23   43:getfield        #29  <Field int zzbNJ>
	//   24   46:istore_2        
			zzh1.setException(((Exception) (new ExecutionException((new StringBuilder(54)).append(i).append(" out of ").append(j).append(" underlying tasks failed").toString(), ((Throwable) (zzbNH))))));
	//   25   47:aload_3         
	//   26   48:new             #49  <Class ExecutionException>
	//   27   51:dup             
	//   28   52:new             #51  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:bipush          54
	//   31   58:invokespecial   #54  <Method void StringBuilder(int)>
	//   32   61:iload_1         
	//   33   62:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   34   65:ldc1            #60  <String " out of ">
	//   35   67:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   36   70:iload_2         
	//   37   71:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   38   74:ldc1            #65  <String " underlying tasks failed">
	//   39   76:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   41   82:aload_0         
	//   42   83:getfield        #41  <Field Exception zzbNH>
	//   43   86:invokespecial   #72  <Method void ExecutionException(String, Throwable)>
	//   44   89:invokevirtual   #76  <Method void zzh.setException(Exception)>
		}
	//   45   92:return          
	}

	public void onFailure(Exception exception)
	{
		Object obj = zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object zzrJ>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzbNL = zzbNL + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #39  <Field int zzbNL>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #39  <Field int zzbNL>
		zzbNH = exception;
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:putfield        #41  <Field Exception zzbNH>
		zzTJ();
	//   14   22:aload_0         
	//   15   23:invokespecial   #80  <Method void zzTJ()>
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		return;
	//   18   28:return          
		exception;
	//   19   29:astore_1        
	//*  20   30:aload_2         
		throw exception;
	//   21   31:monitorexit     
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	public void onSuccess(Object obj)
	{
		obj = zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object zzrJ>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzbNK = zzbNK + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #37  <Field int zzbNK>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #37  <Field int zzbNK>
		zzTJ();
	//   11   17:aload_0         
	//   12   18:invokespecial   #80  <Method void zzTJ()>
		obj;
	//   13   21:aload_1         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		Exception exception;
		exception;
	//   16   24:astore_2        
	//*  17   25:aload_1         
		throw exception;
	//   18   26:monitorexit     
	//   19   27:aload_2         
	//   20   28:athrow          
	}

	private final zzh zzbNC;
	private Exception zzbNH;
	private final int zzbNJ;
	private int zzbNK;
	private int zzbNL;
	private final Object zzrJ = new Object();

	public Tasks$zzc(int i, zzh zzh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void Object()>
	//    6   12:putfield        #27  <Field Object zzrJ>
		zzbNJ = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #29  <Field int zzbNJ>
		zzbNC = zzh1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #31  <Field zzh zzbNC>
	//   13   25:return          
	}
}
