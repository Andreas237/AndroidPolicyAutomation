// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamite.DynamiteModule;

// Referenced classes of package com.google.android.gms.internal:
//			zzaqd, zzaqa

public class zzaqc
{

	public zzaqc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zztZ = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean zztZ>
		zzaXk = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field zzaqd zzaXk>
	//    8   14:return          
	}

	public void initialize(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zztZ;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean zztZ>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		try
		{
			zzaXk = zzaqd.zza.asInterface(DynamiteModule.zza(context, DynamiteModule.zzaRY, "com.google.android.gms.flags").zzdT("com.google.android.gms.flags.impl.FlagProviderImpl"));
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:getstatic       #29  <Field com.google.android.gms.dynamite.DynamiteModule$zzb DynamiteModule.zzaRY>
	//   13   19:ldc1            #31  <String "com.google.android.gms.flags">
	//   14   21:invokestatic    #35  <Method DynamiteModule DynamiteModule.zza(Context, com.google.android.gms.dynamite.DynamiteModule$zzb, String)>
	//   15   24:ldc1            #37  <String "com.google.android.gms.flags.impl.FlagProviderImpl">
	//   16   26:invokevirtual   #41  <Method android.os.IBinder DynamiteModule.zzdT(String)>
	//   17   29:invokestatic    #47  <Method zzaqd zzaqd$zza.asInterface(android.os.IBinder)>
	//   18   32:putfield        #16  <Field zzaqd zzaXk>
			zzaXk.init(zzd.zzA(((Object) (context))));
	//   19   35:aload_0         
	//   20   36:getfield        #16  <Field zzaqd zzaXk>
	//   21   39:aload_1         
	//   22   40:invokestatic    #53  <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   23   43:invokeinterface #59  <Method void zzaqd.init(com.google.android.gms.dynamic.IObjectWrapper)>
			zztZ = true;
	//   24   48:aload_0         
	//   25   49:iconst_1        
	//   26   50:putfield        #14  <Field boolean zztZ>
			break MISSING_BLOCK_LABEL_66;
	//   27   53:goto            66
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   28   56:astore_1        
		Log.w("FlagValueProvider", "Failed to initialize flags module.", ((Throwable) (context)));
	//   29   57:ldc1            #61  <String "FlagValueProvider">
	//   30   59:ldc1            #63  <String "Failed to initialize flags module.">
	//   31   61:aload_1         
	//   32   62:invokestatic    #69  <Method int Log.w(String, String, Throwable)>
	//   33   65:pop             
		this;
	//   34   66:aload_0         
		JVM INSTR monitorexit ;
	//   35   67:monitorexit     
		return;
	//   36   68:return          
		context;
	//   37   69:astore_1        
	//*  38   70:aload_0         
		throw context;
	//   39   71:monitorexit     
	//   40   72:aload_1         
	//   41   73:athrow          
	}

	public Object zzb(zzaqa zzaqa1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zztZ)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean zztZ>
	//    4    6:ifne            18
		zzaqa1 = ((zzaqa) (zzaqa1.zzfr()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method Object zzaqa.zzfr()>
	//    7   13:astore_1        
	//*   8   14:aload_0         
	//*   9   15:monitorexit     
		return ((Object) (zzaqa1));
	//   10   16:aload_1         
	//   11   17:areturn         
		this;
	//   12   18:aload_0         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		  goto _L1
	//*  14   20:goto            28
		zzaqa1;
	//   15   23:astore_1        
	//*  16   24:aload_0         
		throw zzaqa1;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
_L1:
		return zzaqa1.zza(zzaXk);
	//   20   28:aload_1         
	//   21   29:aload_0         
	//   22   30:getfield        #16  <Field zzaqd zzaXk>
	//   23   33:invokevirtual   #80  <Method Object zzaqa.zza(zzaqd)>
	//   24   36:areturn         
	}

	private zzaqd zzaXk;
	private boolean zztZ;
}
