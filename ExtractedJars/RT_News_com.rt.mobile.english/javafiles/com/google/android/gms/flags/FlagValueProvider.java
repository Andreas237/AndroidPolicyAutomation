// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

// Referenced classes of package com.google.android.gms.flags:
//			Flag, IFlagProvider

public class FlagValueProvider
{

	public FlagValueProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzacf = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean zzacf>
		zzacg = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field IFlagProvider zzacg>
	//    8   14:return          
	}

	public Object getFlagValue(Flag flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzacf)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean zzacf>
	//    4    6:ifne            18
		flag = ((Flag) (flag.getDefault()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #25  <Method Object Flag.getDefault()>
	//    7   13:astore_1        
	//*   8   14:aload_0         
	//*   9   15:monitorexit     
		return ((Object) (flag));
	//   10   16:aload_1         
	//   11   17:areturn         
		this;
	//   12   18:aload_0         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		return flag.get(zzacg);
	//   14   20:aload_1         
	//   15   21:aload_0         
	//   16   22:getfield        #16  <Field IFlagProvider zzacg>
	//   17   25:invokevirtual   #29  <Method Object Flag.get(IFlagProvider)>
	//   18   28:areturn         
		flag;
	//   19   29:astore_1        
		this;
	//   20   30:aload_0         
		JVM INSTR monitorexit ;
	//   21   31:monitorexit     
		throw flag;
	//   22   32:aload_1         
	//   23   33:athrow          
	}

	public void initialize(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzacf)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field boolean zzacf>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		try
		{
			zzacg = IFlagProvider.Stub.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION_NO_FORCE_STAGING, "com.google.android.gms.flags").instantiate("com.google.android.gms.flags.impl.FlagProviderImpl"));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:getstatic       #43  <Field com.google.android.gms.dynamite.DynamiteModule$VersionPolicy DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION_NO_FORCE_STAGING>
	//   11   17:ldc1            #45  <String "com.google.android.gms.flags">
	//   12   19:invokestatic    #49  <Method DynamiteModule DynamiteModule.load(Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, String)>
	//   13   22:ldc1            #51  <String "com.google.android.gms.flags.impl.FlagProviderImpl">
	//   14   24:invokevirtual   #55  <Method android.os.IBinder DynamiteModule.instantiate(String)>
	//   15   27:invokestatic    #61  <Method IFlagProvider IFlagProvider$Stub.asInterface(android.os.IBinder)>
	//   16   30:putfield        #16  <Field IFlagProvider zzacg>
			zzacg.init(ObjectWrapper.wrap(((Object) (context))));
	//   17   33:aload_0         
	//   18   34:getfield        #16  <Field IFlagProvider zzacg>
	//   19   37:aload_1         
	//   20   38:invokestatic    #67  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   21   41:invokeinterface #73  <Method void IFlagProvider.init(com.google.android.gms.dynamic.IObjectWrapper)>
			zzacf = true;
	//   22   46:aload_0         
	//   23   47:iconst_1        
	//   24   48:putfield        #14  <Field boolean zzacf>
			break MISSING_BLOCK_LABEL_64;
	//   25   51:goto            64
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   26   54:astore_1        
		Log.w("FlagValueProvider", "Failed to initialize flags module.", ((Throwable) (context)));
	//   27   55:ldc1            #75  <String "FlagValueProvider">
	//   28   57:ldc1            #77  <String "Failed to initialize flags module.">
	//   29   59:aload_1         
	//   30   60:invokestatic    #83  <Method int Log.w(String, String, Throwable)>
	//   31   63:pop             
		this;
	//   32   64:aload_0         
		JVM INSTR monitorexit ;
	//   33   65:monitorexit     
		return;
	//   34   66:return          
		context;
	//   35   67:astore_1        
		this;
	//   36   68:aload_0         
		JVM INSTR monitorexit ;
	//   37   69:monitorexit     
		throw context;
	//   38   70:aload_1         
	//   39   71:athrow          
	}

	private boolean zzacf;
	private IFlagProvider zzacg;
}
