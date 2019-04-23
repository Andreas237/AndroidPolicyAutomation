// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.SparseArray;

// Referenced classes of package com.google.android.gms.internal.ads:
//			biv, bip, bjf

final class bis
	implements Runnable
{

	bis(bip bip1, biv biv1)
	{
		b = bip1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bip b>
		a = biv1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field biv a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field biv a>
	//    2    4:invokevirtual   #25  <Method void biv.a()>
		int j = bip.d(b).size();
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field bip b>
	//    5   11:invokestatic    #31  <Method SparseArray bip.d(bip)>
	//    6   14:invokevirtual   #37  <Method int SparseArray.size()>
	//    7   17:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   18:iconst_0        
	//*   9   19:istore_1        
	//*  10   20:iload_1         
	//*  11   21:iload_2         
	//*  12   22:icmpge          49
			((bjf)bip.d(b).valueAt(i)).b();
	//   13   25:aload_0         
	//   14   26:getfield        #14  <Field bip b>
	//   15   29:invokestatic    #31  <Method SparseArray bip.d(bip)>
	//   16   32:iload_1         
	//   17   33:invokevirtual   #41  <Method Object SparseArray.valueAt(int)>
	//   18   36:checkcast       #43  <Class bjf>
	//   19   39:invokevirtual   #45  <Method void bjf.b()>

	//   20   42:iload_1         
	//   21   43:iconst_1        
	//   22   44:iadd            
	//   23   45:istore_1        
	//*  24   46:goto            20
	//   25   49:return          
	}

	private final biv a;
	private final bip b;
}
