// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.wrappers;

import android.content.Context;

// Referenced classes of package com.google.android.gms.common.wrappers:
//			PackageManagerWrapper

public class Wrappers
{

	public Wrappers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzaba = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field PackageManagerWrapper zzaba>
	//    5    9:return          
	}

	public static PackageManagerWrapper packageManager(Context context)
	{
		return zzabb.getPackageManagerWrapper(context);
	//    0    0:getstatic       #15  <Field Wrappers zzabb>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #24  <Method PackageManagerWrapper getPackageManagerWrapper(Context)>
	//    3    7:areturn         
	}

	public static void resetForTests()
	{
		zzabb = new Wrappers();
	//    0    0:new             #2   <Class Wrappers>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void Wrappers()>
	//    3    7:putstatic       #15  <Field Wrappers zzabb>
	//    4   10:return          
	}

	public static void setWrappers(Wrappers wrappers)
	{
		zzabb = wrappers;
	//    0    0:aload_0         
	//    1    1:putstatic       #15  <Field Wrappers zzabb>
	//    2    4:return          
	}

	public PackageManagerWrapper getPackageManagerWrapper(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzaba != null)
			break MISSING_BLOCK_LABEL_36;
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field PackageManagerWrapper zzaba>
	//    4    6:ifnonnull       36
		if(context.getApplicationContext() == null)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #35  <Method Context Context.getApplicationContext()>
	//*   7   13:ifnonnull       19
			break MISSING_BLOCK_LABEL_24;
	//    8   16:goto            24
		context = context.getApplicationContext();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #35  <Method Context Context.getApplicationContext()>
	//   11   23:astore_1        
		zzaba = new PackageManagerWrapper(context);
	//   12   24:aload_0         
	//   13   25:new             #37  <Class PackageManagerWrapper>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:invokespecial   #40  <Method void PackageManagerWrapper(Context)>
	//   17   33:putfield        #19  <Field PackageManagerWrapper zzaba>
		context = ((Context) (zzaba));
	//   18   36:aload_0         
	//   19   37:getfield        #19  <Field PackageManagerWrapper zzaba>
	//   20   40:astore_1        
		this;
	//   21   41:aload_0         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		return ((PackageManagerWrapper) (context));
	//   23   43:aload_1         
	//   24   44:areturn         
		context;
	//   25   45:astore_1        
	//*  26   46:aload_0         
		throw context;
	//   27   47:monitorexit     
	//   28   48:aload_1         
	//   29   49:athrow          
	}

	private static Wrappers zzabb = new Wrappers();
	private PackageManagerWrapper zzaba;

	static 
	{
	//    0    0:new             #2   <Class Wrappers>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void Wrappers()>
	//    3    7:putstatic       #15  <Field Wrappers zzabb>
	//*   4   10:return          
	}
}
