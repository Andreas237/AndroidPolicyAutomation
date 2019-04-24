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
		zzxb();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method void zzxb()>
		synchronized(zzf.zzc(zzaDV))
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field zzf zzaDV>
	//*   4    8:invokestatic    #37  <Method ArrayList zzf.zzc(zzf)>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:monitorenter    
		{
			zzf.zzc(zzaDV).remove(((Object) (this)));
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field zzf zzaDV>
	//   10   18:invokestatic    #37  <Method ArrayList zzf.zzc(zzf)>
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

	protected abstract void zzu(Object obj);

	public void zzxa()
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
		if(zzaDW)
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field boolean zzaDW>
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
		Object obj1;
		if(obj != null)
	//*  31   61:aload_1         
	//*  32   62:ifnull          70
			try
			{
				zzu(obj);
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #85  <Method void zzu(Object)>
			}
	//*  36   70:aload_0         
	//*  37   71:monitorenter    
	//*  38   72:aload_0         
	//*  39   73:iconst_1        
	//*  40   74:putfield        #26  <Field boolean zzaDW>
	//*  41   77:aload_0         
	//*  42   78:monitorexit     
	//*  43   79:aload_0         
	//*  44   80:invokevirtual   #87  <Method void unregister()>
	//*  45   83:return          
	//*  46   84:astore_1        
	//*  47   85:aload_0         
	//*  48   86:monitorexit     
	//*  49   87:aload_1         
	//*  50   88:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//*  51   89:astore_1        
			{
				throw obj1;
	//   52   90:aload_1         
	//   53   91:athrow          
			}
		this;
		JVM INSTR monitorenter ;
		zzaDW = true;
		this;
		JVM INSTR monitorexit ;
		unregister();
		return;
		obj1;
		this;
		JVM INSTR monitorexit ;
		throw obj1;
		obj1;
	//   54   92:astore_1        
		this;
	//   55   93:aload_0         
		JVM INSTR monitorexit ;
	//   56   94:monitorexit     
		throw obj1;
	//   57   95:aload_1         
	//   58   96:athrow          
	}

	public void zzxb()
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
		this;
	//    9   11:aload_0         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		throw exception;
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	private Object mListener;
	final zzf zzaDV;
	private boolean zzaDW;

	public zzf$zze(zzf zzf1, Object obj)
	{
		zzaDV = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzf zzaDV>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mListener = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Object mListener>
		zzaDW = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean zzaDW>
	//   11   19:return          
	}
}
