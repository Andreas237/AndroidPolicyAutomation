// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

protected abstract class zzf$zze
{

	public void unregister()
	{
		zzxI();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method void zzxI()>
		ArrayList arraylist = zzf.zzc(zzaFu);
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field zzf zzaFu>
	//    4    8:invokestatic    #37  <Method ArrayList zzf.zzc(zzf)>
	//    5   11:astore_1        
		arraylist;
	//    6   12:aload_1         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		zzf.zzc(zzaFu).remove(((Object) (this)));
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field zzf zzaFu>
	//   10   18:invokestatic    #37  <Method ArrayList zzf.zzc(zzf)>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #43  <Method boolean ArrayList.remove(Object)>
	//   13   25:pop             
		arraylist;
	//   14   26:aload_1         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		Exception exception;
		exception;
	//   17   29:astore_2        
	//*  18   30:aload_1         
		throw exception;
	//   19   31:monitorexit     
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	protected abstract void zzu(Object obj);

	public void zzxH()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		obj = mListener;
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field Object mListener>
	//    4    6:astore_1        
		if(zzaFv)
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field boolean zzaFv>
	//*   7   11:ifeq            59
		{
			String s = String.valueOf(((Object) (this)));
	//    8   14:aload_0         
	//    9   15:invokestatic    #54  <Method String String.valueOf(Object)>
	//   10   18:astore_2        
			Log.w("GmsClient", (new StringBuilder(String.valueOf(((Object) (s))).length() + 47)).append("Callback proxy ").append(s).append(" being reused. This is not safe.").toString());
	//   11   19:ldc1            #56  <String "GmsClient">
	//   12   21:new             #58  <Class StringBuilder>
	//   13   24:dup             
	//   14   25:aload_2         
	//   15   26:invokestatic    #54  <Method String String.valueOf(Object)>
	//   16   29:invokevirtual   #62  <Method int String.length()>
	//   17   32:bipush          47
	//   18   34:iadd            
	//   19   35:invokespecial   #65  <Method void StringBuilder(int)>
	//   20   38:ldc1            #67  <String "Callback proxy ">
	//   21   40:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:aload_2         
	//   23   44:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:ldc1            #73  <String " being reused. This is not safe.">
	//   25   49:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   27   55:invokestatic    #83  <Method int Log.w(String, String)>
	//   28   58:pop             
		}
		this;
	//   29   59:aload_0         
		JVM INSTR monitorexit ;
	//   30   60:monitorexit     
		  goto _L1
	//*  31   61:goto            69
		obj;
	//   32   64:astore_1        
	//*  33   65:aload_0         
		throw obj;
	//   34   66:monitorexit     
	//   35   67:aload_1         
	//   36   68:athrow          
_L1:
		if(obj != null)
	//*  37   69:aload_1         
	//*  38   70:ifnull          84
			try
			{
				zzu(obj);
	//   39   73:aload_0         
	//   40   74:aload_1         
	//   41   75:invokevirtual   #85  <Method void zzu(Object)>
			}
	//*  42   78:goto            84
			catch(RuntimeException runtimeexception)
	//*  43   81:astore_1        
			{
				throw runtimeexception;
	//   44   82:aload_1         
	//   45   83:athrow          
			}
		this;
	//   46   84:aload_0         
		JVM INSTR monitorenter ;
	//   47   85:monitorenter    
		zzaFv = true;
	//   48   86:aload_0         
	//   49   87:iconst_1        
	//   50   88:putfield        #26  <Field boolean zzaFv>
		this;
	//   51   91:aload_0         
		JVM INSTR monitorexit ;
	//   52   92:monitorexit     
		  goto _L2
	//*  53   93:goto            101
		Exception exception;
		exception;
	//   54   96:astore_1        
	//*  55   97:aload_0         
		throw exception;
	//   56   98:monitorexit     
	//   57   99:aload_1         
	//   58  100:athrow          
_L2:
		unregister();
	//   59  101:aload_0         
	//   60  102:invokevirtual   #87  <Method void unregister()>
		return;
	//   61  105:return          
	}

	public void zzxI()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mListener = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #24  <Field Object mListener>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	private Object mListener;
	final zzf zzaFu;
	private boolean zzaFv;

	public zzf$zze(zzf zzf1, Object obj)
	{
		zzaFu = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzf zzaFu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mListener = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object mListener>
		zzaFv = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean zzaFv>
	//   11   19:return          
	}
}
