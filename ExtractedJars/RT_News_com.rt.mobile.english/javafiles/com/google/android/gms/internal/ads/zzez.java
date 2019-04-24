// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgd, zzey, zzajh

public final class zzez
	implements zzgd
{

	public zzez(View view, zzajh zzajh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzafo = new WeakReference(((Object) (view)));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #21  <Method void WeakReference(Object)>
	//    7   13:putfield        #23  <Field WeakReference zzafo>
		zzafp = new WeakReference(((Object) (zzajh1)));
	//    8   16:aload_0         
	//    9   17:new             #18  <Class WeakReference>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:invokespecial   #21  <Method void WeakReference(Object)>
	//   13   25:putfield        #25  <Field WeakReference zzafp>
	//   14   28:return          
	}

	public final View zzgh()
	{
		return (View)zzafo.get();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field WeakReference zzafo>
	//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
	//    3    7:checkcast       #34  <Class View>
	//    4   10:areturn         
	}

	public final boolean zzgi()
	{
		return zzafo.get() == null || zzafp.get() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field WeakReference zzafo>
	//    2    4:invokevirtual   #32  <Method Object WeakReference.get()>
	//    3    7:ifnull          25
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field WeakReference zzafp>
	//    6   14:invokevirtual   #32  <Method Object WeakReference.get()>
	//    7   17:ifnonnull       23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public final zzgd zzgj()
	{
		return ((zzgd) (new zzey((View)zzafo.get(), (zzajh)zzafp.get())));
	//    0    0:new             #40  <Class zzey>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field WeakReference zzafo>
	//    4    8:invokevirtual   #32  <Method Object WeakReference.get()>
	//    5   11:checkcast       #34  <Class View>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field WeakReference zzafp>
	//    8   18:invokevirtual   #32  <Method Object WeakReference.get()>
	//    9   21:checkcast       #42  <Class zzajh>
	//   10   24:invokespecial   #44  <Method void zzey(View, zzajh)>
	//   11   27:areturn         
	}

	private final WeakReference zzafo;
	private final WeakReference zzafp;
}
