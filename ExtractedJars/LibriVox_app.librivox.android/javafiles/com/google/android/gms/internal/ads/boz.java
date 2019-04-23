// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqi, bh, bpb

public final class boz
	implements bqi
{

	public boz(bh bh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = new WeakReference(((Object) (bh1)));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #18  <Method void WeakReference(Object)>
	//    7   13:putfield        #20  <Field WeakReference a>
	//    8   16:return          
	}

	public final View a()
	{
		bh bh1 = (bh)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WeakReference a>
	//    2    4:invokevirtual   #26  <Method Object WeakReference.get()>
	//    3    7:checkcast       #28  <Class bh>
	//    4   10:astore_1        
		if(bh1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			return bh1.o();
	//    7   15:aload_1         
	//    8   16:invokeinterface #31  <Method View bh.o()>
	//    9   21:areturn         
		else
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	public final boolean b()
	{
		return a.get() == null;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WeakReference a>
	//    2    4:invokevirtual   #26  <Method Object WeakReference.get()>
	//    3    7:ifnonnull       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final bqi c()
	{
		return ((bqi) (new bpb((bh)a.get())));
	//    0    0:new             #37  <Class bpb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field WeakReference a>
	//    4    8:invokevirtual   #26  <Method Object WeakReference.get()>
	//    5   11:checkcast       #28  <Class bh>
	//    6   14:invokespecial   #39  <Method void bpb(bh)>
	//    7   17:areturn         
	}

	private WeakReference a;
}
