// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.view.View;

// Referenced classes of package android.support.v7:
//			bv

class bv$2
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		bv.a(b).a(view, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field bv b>
	//    2    4:invokestatic    #29  <Method bv$b bv.a(bv)>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field int a>
	//    6   12:invokeinterface #34  <Method void bv$b.a(View, int)>
	//    7   17:return          
	}

	final int a;
	final bv b;

	bv$2(bv bv1, int i)
	{
		b = bv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field bv b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
