// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.view.View;

// Referenced classes of package android.support.v7:
//			bv

class bv$1
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		bv.a(a).onAdapterViewClick(view);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bv a>
	//    2    4:invokestatic    #25  <Method bv$b bv.a(bv)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #30  <Method void bv$b.onAdapterViewClick(View)>
	//    5   13:return          
	}

	final bv a;

	bv$1(bv bv1)
	{
		a = bv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field bv a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
