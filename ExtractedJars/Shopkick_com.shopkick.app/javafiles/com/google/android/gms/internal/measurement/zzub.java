// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzum, zzua, zzvv

public class zzub
{
	static final class zza
	{

		public final boolean equals(Object obj)
		{
			if(!(obj instanceof zza))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class zzub$zza>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			obj = ((Object) ((zza)obj));
		//    5    9:aload_1         
		//    6   10:checkcast       #2   <Class zzub$zza>
		//    7   13:astore_1        
			return object == ((zza) (obj)).object && number == ((zza) (obj)).number;
		//    8   14:aload_0         
		//    9   15:getfield        #18  <Field Object object>
		//   10   18:aload_1         
		//   11   19:getfield        #18  <Field Object object>
		//   12   22:if_acmpne       38
		//   13   25:aload_0         
		//   14   26:getfield        #20  <Field int number>
		//   15   29:aload_1         
		//   16   30:getfield        #20  <Field int number>
		//   17   33:icmpne          38
		//   18   36:iconst_1        
		//   19   37:ireturn         
		//   20   38:iconst_0        
		//   21   39:ireturn         
		}

		public final int hashCode()
		{
			return System.identityHashCode(object) * 65535 + number;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Object object>
		//    2    4:invokestatic    #31  <Method int System.identityHashCode(Object)>
		//    3    7:ldc1            #32  <Int 65535>
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #20  <Field int number>
		//    7   14:iadd            
		//    8   15:ireturn         
		}

		private final int number;
		private final Object object;

		zza(Object obj, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			object = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Object object>
			number = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field int number>
		//    8   14:return          
		}
	}


	zzub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		zzbve = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #38  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void HashMap()>
	//    6   12:putfield        #41  <Field Map zzbve>
	//    7   15:return          
	}

	private zzub(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		zzbve = Collections.emptyMap();
	//    2    4:aload_0         
	//    3    5:invokestatic    #47  <Method Map Collections.emptyMap()>
	//    4    8:putfield        #41  <Field Map zzbve>
	//    5   11:return          
	}

	static zzub zzvp()
	{
		return zzum.zzd(com/google/android/gms/internal/measurement/zzub);
	//    0    0:ldc1            #2   <Class zzub>
	//    1    2:invokestatic    #55  <Method zzub zzum.zzd(Class)>
	//    2    5:areturn         
	}

	private static Class zzvq()
	{
		ClassNotFoundException classnotfoundexception;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.Extension");
	//    0    0:ldc1            #59  <String "com.google.protobuf.Extension">
	//    1    2:invokestatic    #65  <Method Class Class.forName(String)>
	//    2    5:astore_0        
		}
	//*   3    6:aload_0         
	//*   4    7:areturn         
	//*   5    8:aconst_null     
	//*   6    9:areturn         
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			return null;
		}
		return class1;
	//*   7   10:astore_0        
	//*   8   11:goto            8
	}

	public static zzub zzvr()
	{
		return zzua.zzvo();
	//    0    0:invokestatic    #73  <Method zzub zzua.zzvo()>
	//    1    3:areturn         
	}

	public static zzub zzvs()
	{
		Object obj;
		obj = ((Object) (zzbvc));
	//    0    0:getstatic       #76  <Field zzub zzbvc>
	//    1    3:astore_0        
		if(obj != null)
			break MISSING_BLOCK_LABEL_40;
	//    2    4:aload_0         
	//    3    5:ifnonnull       40
		com/google/android/gms/internal/measurement/zzub;
	//    4    8:ldc1            #2   <Class zzub>
		JVM INSTR monitorenter ;
	//    5   10:monitorenter    
		zzub zzub1 = zzbvc;
	//    6   11:getstatic       #76  <Field zzub zzbvc>
	//    7   14:astore_1        
		obj = ((Object) (zzub1));
	//    8   15:aload_1         
	//    9   16:astore_0        
		if(zzub1 != null)
			break MISSING_BLOCK_LABEL_29;
	//   10   17:aload_1         
	//   11   18:ifnonnull       29
		obj = ((Object) (zzua.zzvp()));
	//   12   21:invokestatic    #78  <Method zzub zzua.zzvp()>
	//   13   24:astore_0        
		zzbvc = ((zzub) (obj));
	//   14   25:aload_0         
	//   15   26:putstatic       #76  <Field zzub zzbvc>
		com/google/android/gms/internal/measurement/zzub;
	//   16   29:ldc1            #2   <Class zzub>
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return ((zzub) (obj));
	//   18   32:aload_0         
	//   19   33:areturn         
		obj;
	//   20   34:astore_0        
		com/google/android/gms/internal/measurement/zzub;
	//   21   35:ldc1            #2   <Class zzub>
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw obj;
	//   23   38:aload_0         
	//   24   39:athrow          
		return ((zzub) (obj));
	//   25   40:aload_0         
	//   26   41:areturn         
	}

	public final zzuo.zzd zza(zzvv zzvv, int i)
	{
		return (zzuo.zzd)zzbve.get(((Object) (new zza(((Object) (zzvv)), i))));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map zzbve>
	//    2    4:new             #6   <Class zzub$zza>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #82  <Method void zzub$zza(Object, int)>
	//    7   13:invokeinterface #88  <Method Object Map.get(Object)>
	//    8   18:checkcast       #90  <Class zzuo$zzd>
	//    9   21:areturn         
	}

	private static volatile boolean zzbva = false;
	private static final Class zzbvb = zzvq();
	private static volatile zzub zzbvc;
	static final zzub zzbvd = new zzub(true);
	private final Map zzbve;

	static 
	{
	//    0    0:invokestatic    #25  <Method Class zzvq()>
	//    1    3:putstatic       #27  <Field Class zzbvb>
	//    2    6:new             #2   <Class zzub>
	//    3    9:dup             
	//    4   10:iconst_1        
	//    5   11:invokespecial   #31  <Method void zzub(boolean)>
	//    6   14:putstatic       #33  <Field zzub zzbvd>
	//*   7   17:return          
	}
}
