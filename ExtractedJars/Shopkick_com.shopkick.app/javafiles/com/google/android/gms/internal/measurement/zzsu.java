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
		if(throwable != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          19
		{
			zzbsi = System.identityHashCode(((Object) (throwable)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #18  <Method int System.identityHashCode(Object)>
	//    9   15:putfield        #20  <Field int zzbsi>
			return;
	//   10   18:return          
		} else
		{
			throw new NullPointerException("The referent cannot be null");
	//   11   19:new             #22  <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc1            #24  <String "The referent cannot be null">
	//   14   25:invokespecial   #27  <Method void NullPointerException(String)>
	//   15   28:athrow          
		}
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          55
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
			return zzbsi == ((zzsu) (obj)).zzbsi && get() == ((zzsu) (obj)).get();
	//   17   29:aload_0         
	//   18   30:getfield        #20  <Field int zzbsi>
	//   19   33:aload_1         
	//   20   34:getfield        #20  <Field int zzbsi>
	//   21   37:icmpne          53
	//   22   40:aload_0         
	//   23   41:invokevirtual   #42  <Method Object get()>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #42  <Method Object get()>
	//   26   48:if_acmpne       53
	//   27   51:iconst_1        
	//   28   52:ireturn         
	//   29   53:iconst_0        
	//   30   54:ireturn         
		} else
		{
			return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
		}
	}

	public final int hashCode()
	{
		return zzbsi;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int zzbsi>
	//    2    4:ireturn         
	}

	private final int zzbsi;
}
