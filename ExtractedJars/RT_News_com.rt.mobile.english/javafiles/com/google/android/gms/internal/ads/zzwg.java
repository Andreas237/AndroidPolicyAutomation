// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzwn, zzkb, zzni, 
//			zzang

public final class zzwg
{

	public zzwg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Object()>
	//    6   12:putfield        #18  <Field Object mLock>
	//    7   15:return          
	}

	public final zzwn zzb(Context context, zzang zzang)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mLock>
	//    2    4:astore          4
		obj1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj;
		if(zzbrb != null)
			break MISSING_BLOCK_LABEL_55;
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field zzwn zzbrb>
	//    7   13:ifnonnull       55
		obj = ((Object) (context.getApplicationContext()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//   10   20:astore_3        
		if(obj != null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       71
	//*  13   25:goto            28
	//*  14   28:getstatic       #35  <Field zzna zznk.zzaub>
	//*  15   31:astore_3        
	//*  16   32:aload_0         
	//*  17   33:new             #37  <Class zzwn>
	//*  18   36:dup             
	//*  19   37:aload_1         
	//*  20   38:aload_2         
	//*  21   39:invokestatic    #43  <Method zzni zzkb.zzik()>
	//*  22   42:aload_3         
	//*  23   43:invokevirtual   #49  <Method Object zzni.zzd(zzna)>
	//*  24   46:checkcast       #51  <Class String>
	//*  25   49:invokespecial   #54  <Method void zzwn(Context, zzang, String)>
	//*  26   52:putfield        #23  <Field zzwn zzbrb>
	//*  27   55:aload_0         
	//*  28   56:getfield        #23  <Field zzwn zzbrb>
	//*  29   59:astore_1        
	//*  30   60:aload           4
	//*  31   62:monitorexit     
	//*  32   63:aload_1         
	//*  33   64:areturn         
	//*  34   65:astore_1        
	//*  35   66:aload           4
	//*  36   68:monitorexit     
	//*  37   69:aload_1         
	//*  38   70:athrow          
			context = ((Context) (obj));
	//   39   71:aload_3         
	//   40   72:astore_1        
		obj = ((Object) (zznk.zzaub));
		zzbrb = new zzwn(context, zzang, (String)zzkb.zzik().zzd(((zzna) (obj))));
		context = ((Context) (zzbrb));
		obj1;
		JVM INSTR monitorexit ;
		return ((zzwn) (context));
		context;
		obj1;
		JVM INSTR monitorexit ;
		throw context;
	//*  41   73:goto            28
	}

	private final Object mLock = new Object();
	private zzwn zzbrb;
}
