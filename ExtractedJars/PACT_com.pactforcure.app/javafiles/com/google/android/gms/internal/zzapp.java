// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamite.DynamiteModule;

// Referenced classes of package com.google.android.gms.internal:
//			zzapq, zzapn

public class zzapp
{

	public zzapp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zztW = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean zztW>
		zzaWI = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field zzapq zzaWI>
	//    8   14:return          
	}

	public void initialize(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zztW)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean zztW>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		zzaWI = zzapq.zza.asInterface(DynamiteModule.zza(context, DynamiteModule.zzaQw, "com.google.android.gms.flags").zzdX("com.google.android.gms.flags.impl.FlagProviderImpl"));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:getstatic       #29  <Field com.google.android.gms.dynamite.DynamiteModule$zzb DynamiteModule.zzaQw>
	//   11   17:ldc1            #31  <String "com.google.android.gms.flags">
	//   12   19:invokestatic    #35  <Method DynamiteModule DynamiteModule.zza(Context, com.google.android.gms.dynamite.DynamiteModule$zzb, String)>
	//   13   22:ldc1            #37  <String "com.google.android.gms.flags.impl.FlagProviderImpl">
	//   14   24:invokevirtual   #41  <Method android.os.IBinder DynamiteModule.zzdX(String)>
	//   15   27:invokestatic    #47  <Method zzapq zzapq$zza.asInterface(android.os.IBinder)>
	//   16   30:putfield        #16  <Field zzapq zzaWI>
		zzaWI.init(zze.zzA(((Object) (context))));
	//   17   33:aload_0         
	//   18   34:getfield        #16  <Field zzapq zzaWI>
	//   19   37:aload_1         
	//   20   38:invokestatic    #53  <Method com.google.android.gms.dynamic.zzd zze.zzA(Object)>
	//   21   41:invokeinterface #59  <Method void zzapq.init(com.google.android.gms.dynamic.zzd)>
		zztW = true;
	//   22   46:aload_0         
	//   23   47:iconst_1        
	//   24   48:putfield        #14  <Field boolean zztW>
_L1:
		this;
	//   25   51:aload_0         
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		return;
	//   27   53:return          
		context;
	//   28   54:astore_1        
		this;
	//   29   55:aload_0         
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		throw context;
	//   31   57:aload_1         
	//   32   58:athrow          
		context;
	//   33   59:astore_1        
_L2:
		Log.w("FlagValueProvider", "Failed to initialize flags module.", ((Throwable) (context)));
	//   34   60:ldc1            #61  <String "FlagValueProvider">
	//   35   62:ldc1            #63  <String "Failed to initialize flags module.">
	//   36   64:aload_1         
	//   37   65:invokestatic    #69  <Method int Log.w(String, String, Throwable)>
	//   38   68:pop             
		  goto _L1
	//*  39   69:goto            51
		context;
	//   40   72:astore_1        
		  goto _L2
	//*  41   73:goto            60
	}

	public Object zzb(zzapn zzapn1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zztW)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean zztW>
	//    4    6:ifne            18
		zzapn1 = ((zzapn) (zzapn1.zzfm()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method Object zzapn.zzfm()>
	//    7   13:astore_1        
	//*   8   14:aload_0         
	//*   9   15:monitorexit     
		return ((Object) (zzapn1));
	//   10   16:aload_1         
	//   11   17:areturn         
		this;
	//   12   18:aload_0         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		return zzapn1.zza(zzaWI);
	//   14   20:aload_1         
	//   15   21:aload_0         
	//   16   22:getfield        #16  <Field zzapq zzaWI>
	//   17   25:invokevirtual   #80  <Method Object zzapn.zza(zzapq)>
	//   18   28:areturn         
		zzapn1;
	//   19   29:astore_1        
		this;
	//   20   30:aload_0         
		JVM INSTR monitorexit ;
	//   21   31:monitorexit     
		throw zzapn1;
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	private zzapq zzaWI;
	private boolean zztW;
}
