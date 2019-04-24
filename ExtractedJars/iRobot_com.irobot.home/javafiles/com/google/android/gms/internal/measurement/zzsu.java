// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzsu extends WeakReference
{

	public zzsu(Throwable throwable, ReferenceQueue referencequeue)
	{
		super(((Object) (throwable)), ((ReferenceQueue) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #12  <Method void WeakReference(Object, ReferenceQueue)>
		if(throwable == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       20
		{
			throw new NullPointerException("The referent cannot be null");
	//    6   10:new             #14  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:ldc1            #16  <String "The referent cannot be null">
	//    9   16:invokespecial   #19  <Method void NullPointerException(String)>
	//   10   19:athrow          
		} else
		{
			zzbsk = System.identityHashCode(((Object) (throwable)));
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokestatic    #25  <Method int System.identityHashCode(Object)>
	//   14   25:putfield        #27  <Field int zzbsk>
			return;
	//   15   28:return          
		}
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          53
		{
			if(obj.getClass() != ((Object)this).getClass())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #38  <Method Class Object.getClass()>
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #38  <Method Class Object.getClass()>
	//*   6   12:if_acmpeq       17
				return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
			if(this == obj)
	//*   9   17:aload_0         
	//*  10   18:aload_1         
	//*  11   19:if_acmpne       24
				return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
			obj = ((Object) ((zzsu)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzsu>
	//   16   28:astore_1        
			if(zzbsk == ((zzsu) (obj)).zzbsk && get() == ((zzsu) (obj)).get())
	//*  17   29:aload_0         
	//*  18   30:getfield        #27  <Field int zzbsk>
	//*  19   33:aload_1         
	//*  20   34:getfield        #27  <Field int zzbsk>
	//*  21   37:icmpne          53
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #42  <Method Object get()>
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #42  <Method Object get()>
	//*  26   48:if_acmpne       53
				return true;
	//   27   51:iconst_1        
	//   28   52:ireturn         
		}
		return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
	}

	public final int hashCode()
	{
		return zzbsk;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int zzbsk>
	//    2    4:ireturn         
	}

	private final int zzbsk;
}
