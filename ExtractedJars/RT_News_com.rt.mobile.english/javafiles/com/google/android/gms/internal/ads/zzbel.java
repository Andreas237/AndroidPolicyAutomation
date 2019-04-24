// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zzbel
	implements PrivilegedExceptionAction
{

	zzbel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object run()
		throws Exception
	{
		Field afield[] = ((Class) (sun/misc/Unsafe)).getDeclaredFields();
	//    0    0:ldc1            #18  <Class Unsafe>
	//    1    2:invokevirtual   #24  <Method Field[] Class.getDeclaredFields()>
	//    2    5:astore_3        
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_1        
		for(int j = afield.length; i < j; i++)
	//*   5    8:aload_3         
	//*   6    9:arraylength     
	//*   7   10:istore_2        
	//*   8   11:iload_1         
	//*   9   12:iload_2         
	//*  10   13:icmpge          63
		{
			Object obj = ((Object) (afield[i]));
	//   11   16:aload_3         
	//   12   17:iload_1         
	//   13   18:aaload          
	//   14   19:astore          4
			((Field) (obj)).setAccessible(true);
	//   15   21:aload           4
	//   16   23:iconst_1        
	//   17   24:invokevirtual   #30  <Method void Field.setAccessible(boolean)>
			obj = ((Field) (obj)).get(((Object) (null)));
	//   18   27:aload           4
	//   19   29:aconst_null     
	//   20   30:invokevirtual   #34  <Method Object Field.get(Object)>
	//   21   33:astore          4
			if(((Class) (sun/misc/Unsafe)).isInstance(obj))
	//*  22   35:ldc1            #18  <Class Unsafe>
	//*  23   37:aload           4
	//*  24   39:invokevirtual   #38  <Method boolean Class.isInstance(Object)>
	//*  25   42:ifeq            56
				return ((Object) ((Unsafe)((Class) (sun/misc/Unsafe)).cast(obj)));
	//   26   45:ldc1            #18  <Class Unsafe>
	//   27   47:aload           4
	//   28   49:invokevirtual   #41  <Method Object Class.cast(Object)>
	//   29   52:checkcast       #18  <Class Unsafe>
	//   30   55:areturn         
		}

	//   31   56:iload_1         
	//   32   57:iconst_1        
	//   33   58:iadd            
	//   34   59:istore_1        
	//*  35   60:goto            11
		return ((Object) (null));
	//   36   63:aconst_null     
	//   37   64:areturn         
	}
}
