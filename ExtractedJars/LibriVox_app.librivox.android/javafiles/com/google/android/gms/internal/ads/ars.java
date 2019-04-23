// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			arr, asf, art, asl, 
//			atv

public class ars
{

	ars()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		e = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void HashMap()>
	//    6   12:putfield        #35  <Field Map e>
	//    7   15:return          
	}

	private ars(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		e = Collections.emptyMap();
	//    2    4:aload_0         
	//    3    5:invokestatic    #41  <Method Map Collections.emptyMap()>
	//    4    8:putfield        #35  <Field Map e>
	//    5   11:return          
	}

	public static ars a()
	{
		return arr.a();
	//    0    0:invokestatic    #46  <Method ars arr.a()>
	//    1    3:areturn         
	}

	public static ars b()
	{
		Object obj;
		obj = ((Object) (d));
	//    0    0:getstatic       #48  <Field ars d>
	//    1    3:astore_0        
		if(obj != null)
			break MISSING_BLOCK_LABEL_40;
	//    2    4:aload_0         
	//    3    5:ifnonnull       40
		com/google/android/gms/internal/ads/ars;
	//    4    8:ldc1            #2   <Class ars>
		JVM INSTR monitorenter ;
	//    5   10:monitorenter    
		ars ars1 = d;
	//    6   11:getstatic       #48  <Field ars d>
	//    7   14:astore_1        
		obj = ((Object) (ars1));
	//    8   15:aload_1         
	//    9   16:astore_0        
		if(ars1 != null)
			break MISSING_BLOCK_LABEL_29;
	//   10   17:aload_1         
	//   11   18:ifnonnull       29
		obj = ((Object) (arr.b()));
	//   12   21:invokestatic    #50  <Method ars arr.b()>
	//   13   24:astore_0        
		d = ((ars) (obj));
	//   14   25:aload_0         
	//   15   26:putstatic       #48  <Field ars d>
		com/google/android/gms/internal/ads/ars;
	//   16   29:ldc1            #2   <Class ars>
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return ((ars) (obj));
	//   18   32:aload_0         
	//   19   33:areturn         
		obj;
	//   20   34:astore_0        
		com/google/android/gms/internal/ads/ars;
	//   21   35:ldc1            #2   <Class ars>
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw obj;
	//   23   38:aload_0         
	//   24   39:athrow          
		return ((ars) (obj));
	//   25   40:aload_0         
	//   26   41:areturn         
	}

	static ars c()
	{
		return asf.a(com/google/android/gms/internal/ads/ars);
	//    0    0:ldc1            #2   <Class ars>
	//    1    2:invokestatic    #55  <Method ars asf.a(Class)>
	//    2    5:areturn         
	}

	private static Class d()
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

	public final asl a(atv atv, int i)
	{
		return (asl)e.get(((Object) (new art(((Object) (atv)), i))));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Map e>
	//    2    4:new             #68  <Class art>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #71  <Method void art(Object, int)>
	//    7   13:invokeinterface #77  <Method Object Map.get(Object)>
	//    8   18:checkcast       #79  <Class asl>
	//    9   21:areturn         
	}

	static final ars a = new ars(true);
	private static volatile boolean b = false;
	private static final Class c = d();
	private static volatile ars d;
	private final Map e;

	static 
	{
	//    0    0:invokestatic    #19  <Method Class d()>
	//    1    3:putstatic       #21  <Field Class c>
	//    2    6:new             #2   <Class ars>
	//    3    9:dup             
	//    4   10:iconst_1        
	//    5   11:invokespecial   #25  <Method void ars(boolean)>
	//    6   14:putstatic       #27  <Field ars a>
	//*   7   17:return          
	}
}
