// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

protected abstract class BaseGmsClient$zzc
{

	public final void removeListener()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzcu = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #24  <Field Object zzcu>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
		this;
	//    9   11:aload_0         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		throw exception;
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void unregister()
	{
		removeListener();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method void removeListener()>
		synchronized(BaseGmsClient.zzf(zzct))
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field BaseGmsClient zzct>
	//*   4    8:invokestatic    #37  <Method ArrayList BaseGmsClient.zzf(BaseGmsClient)>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:monitorenter    
		{
			BaseGmsClient.zzf(zzct).remove(((Object) (this)));
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field BaseGmsClient zzct>
	//   10   18:invokestatic    #37  <Method ArrayList BaseGmsClient.zzf(BaseGmsClient)>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #43  <Method boolean ArrayList.remove(Object)>
	//   13   25:pop             
		}
	//   14   26:aload_1         
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		exception;
	//   17   29:astore_2        
		arraylist;
	//   18   30:aload_1         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw exception;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	protected abstract void zza(Object obj);

	protected abstract void zzn();

	public final void zzo()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		obj = zzcu;
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field Object zzcu>
	//    4    6:astore_1        
		if(zzcv)
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field boolean zzcv>
	//*   7   11:ifeq            67
		{
			String s = String.valueOf(((Object) (this)));
	//    8   14:aload_0         
	//    9   15:invokestatic    #55  <Method String String.valueOf(Object)>
	//   10   18:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 47);
	//   11   19:new             #57  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:aload_2         
	//   14   24:invokestatic    #55  <Method String String.valueOf(Object)>
	//   15   27:invokevirtual   #61  <Method int String.length()>
	//   16   30:bipush          47
	//   17   32:iadd            
	//   18   33:invokespecial   #64  <Method void StringBuilder(int)>
	//   19   36:astore_3        
			stringbuilder.append("Callback proxy ");
	//   20   37:aload_3         
	//   21   38:ldc1            #66  <String "Callback proxy ">
	//   22   40:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			stringbuilder.append(s);
	//   24   44:aload_3         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			stringbuilder.append(" being reused. This is not safe.");
	//   28   50:aload_3         
	//   29   51:ldc1            #72  <String " being reused. This is not safe.">
	//   30   53:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
			Log.w("GmsClient", stringbuilder.toString());
	//   32   57:ldc1            #74  <String "GmsClient">
	//   33   59:aload_3         
	//   34   60:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   35   63:invokestatic    #84  <Method int Log.w(String, String)>
	//   36   66:pop             
		}
		this;
	//   37   67:aload_0         
		JVM INSTR monitorexit ;
	//   38   68:monitorexit     
		if(obj != null)
	//*  39   69:aload_1         
	//*  40   70:ifnull          88
			try
			{
				zza(obj);
	//   41   73:aload_0         
	//   42   74:aload_1         
	//   43   75:invokevirtual   #86  <Method void zza(Object)>
			}
	//*  44   78:goto            92
			catch(RuntimeException runtimeexception)
	//*  45   81:astore_1        
			{
				zzn();
	//   46   82:aload_0         
	//   47   83:invokevirtual   #88  <Method void zzn()>
				throw runtimeexception;
	//   48   86:aload_1         
	//   49   87:athrow          
			}
		else
			zzn();
	//   50   88:aload_0         
	//   51   89:invokevirtual   #88  <Method void zzn()>
		this;
	//   52   92:aload_0         
		JVM INSTR monitorenter ;
	//   53   93:monitorenter    
		zzcv = true;
	//   54   94:aload_0         
	//   55   95:iconst_1        
	//   56   96:putfield        #26  <Field boolean zzcv>
		this;
	//   57   99:aload_0         
		JVM INSTR monitorexit ;
	//   58  100:monitorexit     
		unregister();
	//   59  101:aload_0         
	//   60  102:invokevirtual   #90  <Method void unregister()>
		return;
	//   61  105:return          
		Exception exception;
		exception;
	//   62  106:astore_1        
		this;
	//   63  107:aload_0         
		JVM INSTR monitorexit ;
	//   64  108:monitorexit     
		throw exception;
	//   65  109:aload_1         
	//   66  110:athrow          
		exception;
	//   67  111:astore_1        
		this;
	//   68  112:aload_0         
		JVM INSTR monitorexit ;
	//   69  113:monitorexit     
		throw exception;
	//   70  114:aload_1         
	//   71  115:athrow          
	}

	private final BaseGmsClient zzct;
	private Object zzcu;
	private boolean zzcv;

	public BaseGmsClient$zzc(BaseGmsClient basegmsclient, Object obj)
	{
		zzct = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseGmsClient zzct>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		zzcu = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object zzcu>
		zzcv = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean zzcv>
	//   11   19:return          
	}
}
