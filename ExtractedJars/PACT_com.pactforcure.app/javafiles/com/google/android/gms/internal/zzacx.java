// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//			zzacw

public class zzacx
{

	public zzacx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzaHk = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field zzacw zzaHk>
	//    5    9:return          
	}

	public static zzacw zzaQ(Context context)
	{
		return zzaHl.zzaP(context);
	//    0    0:getstatic       #15  <Field zzacx zzaHl>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #24  <Method zzacw zzaP(Context)>
	//    3    7:areturn         
	}

	public zzacw zzaP(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzaHk != null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field zzacw zzaHk>
	//    4    6:ifnonnull       28
_L1:
		if(context.getApplicationContext() != null)
			break MISSING_BLOCK_LABEL_37;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #30  <Method Context Context.getApplicationContext()>
	//    7   13:ifnonnull       37
_L3:
		zzaHk = new zzacw(context);
	//    8   16:aload_0         
	//    9   17:new             #32  <Class zzacw>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #35  <Method void zzacw(Context)>
	//   13   25:putfield        #19  <Field zzacw zzaHk>
_L2:
		context = ((Context) (zzaHk));
	//   14   28:aload_0         
	//   15   29:getfield        #19  <Field zzacw zzaHk>
	//   16   32:astore_1        
		this;
	//   17   33:aload_0         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		return ((zzacw) (context));
	//   19   35:aload_1         
	//   20   36:areturn         
		context = context.getApplicationContext();
	//   21   37:aload_1         
	//   22   38:invokevirtual   #30  <Method Context Context.getApplicationContext()>
	//   23   41:astore_1        
		  goto _L3
	//*  24   42:goto            16
		context;
	//   25   45:astore_1        
	//*  26   46:aload_0         
		throw context;
	//   27   47:monitorexit     
	//   28   48:aload_1         
	//   29   49:athrow          
	}

	private static zzacx zzaHl = new zzacx();
	private zzacw zzaHk;

	static 
	{
	//    0    0:new             #2   <Class zzacx>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzacx()>
	//    3    7:putstatic       #15  <Field zzacx zzaHl>
	//*   4   10:return          
	}
}
