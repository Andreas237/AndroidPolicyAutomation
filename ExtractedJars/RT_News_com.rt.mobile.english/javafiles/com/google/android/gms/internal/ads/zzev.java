// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgd, zzoz, zzex

public final class zzev
	implements zzgd
{

	public zzev(zzoz zzoz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzafl = new WeakReference(((Object) (zzoz1)));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #19  <Method void WeakReference(Object)>
	//    7   13:putfield        #21  <Field WeakReference zzafl>
	//    8   16:return          
	}

	public final View zzgh()
	{
		zzoz zzoz1 = (zzoz)zzafl.get();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WeakReference zzafl>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #31  <Class zzoz>
	//    4   10:astore_1        
		if(zzoz1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			return zzoz1.zzkr();
	//    7   15:aload_1         
	//    8   16:invokeinterface #34  <Method View zzoz.zzkr()>
	//    9   21:areturn         
		else
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	public final boolean zzgi()
	{
		return zzafl.get() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WeakReference zzafl>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:ifnonnull       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final zzgd zzgj()
	{
		return ((zzgd) (new zzex((zzoz)zzafl.get())));
	//    0    0:new             #41  <Class zzex>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field WeakReference zzafl>
	//    4    8:invokevirtual   #29  <Method Object WeakReference.get()>
	//    5   11:checkcast       #31  <Class zzoz>
	//    6   14:invokespecial   #43  <Method void zzex(zzoz)>
	//    7   17:areturn         
	}

	private WeakReference zzafl;
}
