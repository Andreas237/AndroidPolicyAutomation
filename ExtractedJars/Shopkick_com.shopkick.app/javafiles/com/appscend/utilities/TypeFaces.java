// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;

public class TypeFaces
{

	public TypeFaces()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static Typeface get(Context context, String s)
	{
		Hashtable hashtable = cache;
	//    0    0:getstatic       #16  <Field Hashtable cache>
	//    1    3:astore_3        
		hashtable;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag = cache.containsKey(((Object) (s)));
	//    4    6:getstatic       #16  <Field Hashtable cache>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #26  <Method boolean Hashtable.containsKey(Object)>
	//    7   13:istore_2        
		if(flag) goto _L2; else goto _L1
	//    8   14:iload_2         
	//    9   15:ifne            43
_L1:
		context = ((Context) (Typeface.createFromAsset(context.getAssets(), s)));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #32  <Method android.content.res.AssetManager Context.getAssets()>
	//   12   22:aload_1         
	//   13   23:invokestatic    #38  <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//   14   26:astore_0        
		cache.put(((Object) (s)), ((Object) (context)));
	//   15   27:getstatic       #16  <Field Hashtable cache>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #42  <Method Object Hashtable.put(Object, Object)>
	//   19   35:pop             
		  goto _L2
	//*  20   36:goto            43
_L4:
		hashtable;
	//   21   39:aload_3         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		return null;
	//   23   41:aconst_null     
	//   24   42:areturn         
_L2:
		context = ((Context) ((Typeface)cache.get(((Object) (s)))));
	//   25   43:getstatic       #16  <Field Hashtable cache>
	//   26   46:aload_1         
	//   27   47:invokevirtual   #45  <Method Object Hashtable.get(Object)>
	//   28   50:checkcast       #34  <Class Typeface>
	//   29   53:astore_0        
		hashtable;
	//   30   54:aload_3         
		JVM INSTR monitorexit ;
	//   31   55:monitorexit     
		return ((Typeface) (context));
	//   32   56:aload_0         
	//   33   57:areturn         
		context;
	//   34   58:astore_0        
		hashtable;
	//   35   59:aload_3         
		JVM INSTR monitorexit ;
	//   36   60:monitorexit     
		throw context;
	//   37   61:aload_0         
	//   38   62:athrow          
		context;
	//   39   63:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  40   64:goto            39
	}

	private static final Hashtable cache = new Hashtable();

	static 
	{
	//    0    0:new             #11  <Class Hashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void Hashtable()>
	//    3    7:putstatic       #16  <Field Hashtable cache>
	//*   4   10:return          
	}
}
