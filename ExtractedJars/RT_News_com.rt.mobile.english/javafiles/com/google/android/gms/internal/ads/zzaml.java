// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzane, zzadb, zzadf

public final class zzaml
{

	public static Object zza(Context context, Callable callable)
	{
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #15  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore_2        
		StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder(threadpolicy)).permitDiskReads().permitDiskWrites().build());
	//    2    4:new             #17  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokespecial   #21  <Method void android.os.StrictMode$ThreadPolicy$Builder(android.os.StrictMode$ThreadPolicy)>
	//    6   12:invokevirtual   #25  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitDiskReads()>
	//    7   15:invokevirtual   #28  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitDiskWrites()>
	//    8   18:invokevirtual   #31  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//    9   21:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		callable = ((Callable) (callable.call()));
	//   10   24:aload_1         
	//   11   25:invokeinterface #40  <Method Object Callable.call()>
	//   12   30:astore_1        
		StrictMode.setThreadPolicy(threadpolicy);
	//   13   31:aload_2         
	//   14   32:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return ((Object) (callable));
	//   15   35:aload_1         
	//   16   36:areturn         
		context;
	//   17   37:astore_0        
		break MISSING_BLOCK_LABEL_66;
	//   18   38:goto            66
		callable;
	//   19   41:astore_1        
		zzane.zzb("Unexpected exception.", ((Throwable) (callable)));
	//   20   42:ldc1            #42  <String "Unexpected exception.">
	//   21   44:aload_1         
	//   22   45:invokestatic    #48  <Method void zzane.zzb(String, Throwable)>
		zzadb.zzl(context).zza(((Throwable) (callable)), "StrictModeUtil.runWithLaxStrictMode");
	//   23   48:aload_0         
	//   24   49:invokestatic    #54  <Method zzadf zzadb.zzl(Context)>
	//   25   52:aload_1         
	//   26   53:ldc1            #56  <String "StrictModeUtil.runWithLaxStrictMode">
	//   27   55:invokeinterface #61  <Method void zzadf.zza(Throwable, String)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   28   60:aload_2         
	//   29   61:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return ((Object) (null));
	//   30   64:aconst_null     
	//   31   65:areturn         
		StrictMode.setThreadPolicy(threadpolicy);
	//   32   66:aload_2         
	//   33   67:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw context;
	//   34   70:aload_0         
	//   35   71:athrow          
	}

	public static Object zzb(Callable callable)
		throws Exception
	{
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #15  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore_1        
		StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder(threadpolicy)).permitDiskReads().permitDiskWrites().build());
	//    2    4:new             #17  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void android.os.StrictMode$ThreadPolicy$Builder(android.os.StrictMode$ThreadPolicy)>
	//    6   12:invokevirtual   #25  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitDiskReads()>
	//    7   15:invokevirtual   #28  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.permitDiskWrites()>
	//    8   18:invokevirtual   #31  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//    9   21:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		callable = ((Callable) (callable.call()));
	//   10   24:aload_0         
	//   11   25:invokeinterface #40  <Method Object Callable.call()>
	//   12   30:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   13   31:aload_1         
	//   14   32:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return ((Object) (callable));
	//   15   35:aload_0         
	//   16   36:areturn         
		callable;
	//   17   37:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   18   38:aload_1         
	//   19   39:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw callable;
	//   20   42:aload_0         
	//   21   43:athrow          
	}
}
