// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.tasks:
//			Tasks, zzu

private static final class Tasks$zzc
	implements Tasks$zzb
{

	private final void zzf()
	{
		if(zzah + zzai + zzaj == zzag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int zzah>
	//*   2    4:aload_0         
	//*   3    5:getfield        #44  <Field int zzai>
	//*   4    8:iadd            
	//*   5    9:aload_0         
	//*   6   10:getfield        #46  <Field int zzaj>
	//*   7   13:iadd            
	//*   8   14:aload_0         
	//*   9   15:getfield        #34  <Field int zzag>
	//*  10   18:icmpne          129
		{
			if(zzab != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #48  <Field Exception zzab>
	//*  13   25:ifnull          105
			{
				zzu zzu1 = zza;
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field zzu zza>
	//   16   32:astore_3        
				int i = zzai;
	//   17   33:aload_0         
	//   18   34:getfield        #44  <Field int zzai>
	//   19   37:istore_1        
				int j = zzag;
	//   20   38:aload_0         
	//   21   39:getfield        #34  <Field int zzag>
	//   22   42:istore_2        
				StringBuilder stringbuilder = new StringBuilder(54);
	//   23   43:new             #50  <Class StringBuilder>
	//   24   46:dup             
	//   25   47:bipush          54
	//   26   49:invokespecial   #53  <Method void StringBuilder(int)>
	//   27   52:astore          4
				stringbuilder.append(i);
	//   28   54:aload           4
	//   29   56:iload_1         
	//   30   57:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   31   60:pop             
				stringbuilder.append(" out of ");
	//   32   61:aload           4
	//   33   63:ldc1            #59  <String " out of ">
	//   34   65:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
				stringbuilder.append(j);
	//   36   69:aload           4
	//   37   71:iload_2         
	//   38   72:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   39   75:pop             
				stringbuilder.append(" underlying tasks failed");
	//   40   76:aload           4
	//   41   78:ldc1            #64  <String " underlying tasks failed">
	//   42   80:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
				zzu1.setException(((Exception) (new ExecutionException(stringbuilder.toString(), ((Throwable) (zzab))))));
	//   44   84:aload_3         
	//   45   85:new             #66  <Class ExecutionException>
	//   46   88:dup             
	//   47   89:aload           4
	//   48   91:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   49   94:aload_0         
	//   50   95:getfield        #48  <Field Exception zzab>
	//   51   98:invokespecial   #73  <Method void ExecutionException(String, Throwable)>
	//   52  101:invokevirtual   #79  <Method void zzu.setException(Exception)>
				return;
	//   53  104:return          
			}
			if(zzak)
	//*  54  105:aload_0         
	//*  55  106:getfield        #81  <Field boolean zzak>
	//*  56  109:ifeq            121
			{
				zza.zza();
	//   57  112:aload_0         
	//   58  113:getfield        #36  <Field zzu zza>
	//   59  116:invokevirtual   #84  <Method boolean zzu.zza()>
	//   60  119:pop             
				return;
	//   61  120:return          
			}
			zza.setResult(((Object) (null)));
	//   62  121:aload_0         
	//   63  122:getfield        #36  <Field zzu zza>
	//   64  125:aconst_null     
	//   65  126:invokevirtual   #88  <Method void zzu.setResult(Object)>
		}
	//   66  129:return          
	}

	public final void onCanceled()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzaj = zzaj + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #46  <Field int zzaj>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #46  <Field int zzaj>
			zzak = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #81  <Field boolean zzak>
			zzf();
	//   14   22:aload_0         
	//   15   23:invokespecial   #92  <Method void zzf()>
		}
	//   16   26:aload_1         
	//   17   27:monitorexit     
		return;
	//   18   28:return          
		exception;
	//   19   29:astore_2        
		obj;
	//   20   30:aload_1         
		JVM INSTR monitorexit ;
	//   21   31:monitorexit     
		throw exception;
	//   22   32:aload_2         
	//   23   33:athrow          
	}

	public final void onFailure(Exception exception)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzai = zzai + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #44  <Field int zzai>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #44  <Field int zzai>
			zzab = exception;
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:putfield        #48  <Field Exception zzab>
			zzf();
	//   14   22:aload_0         
	//   15   23:invokespecial   #92  <Method void zzf()>
		}
	//   16   26:aload_2         
	//   17   27:monitorexit     
		return;
	//   18   28:return          
		exception;
	//   19   29:astore_1        
		obj;
	//   20   30:aload_2         
		JVM INSTR monitorexit ;
	//   21   31:monitorexit     
		throw exception;
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	public final void onSuccess(Object obj)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzah = zzah + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #42  <Field int zzah>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #42  <Field int zzah>
			zzf();
	//   11   17:aload_0         
	//   12   18:invokespecial   #92  <Method void zzf()>
		}
	//   13   21:aload_1         
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		exception;
	//   16   24:astore_2        
		obj;
	//   17   25:aload_1         
		JVM INSTR monitorexit ;
	//   18   26:monitorexit     
		throw exception;
	//   19   27:aload_2         
	//   20   28:athrow          
	}

	private final Object mLock = new Object();
	private final zzu zza;
	private Exception zzab;
	private final int zzag;
	private int zzah;
	private int zzai;
	private int zzaj;
	private boolean zzak;

	public Tasks$zzc(int i, zzu zzu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void Object()>
	//    6   12:putfield        #32  <Field Object mLock>
		zzag = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #34  <Field int zzag>
		zza = zzu1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #36  <Field zzu zza>
	//   13   25:return          
	}
}
