// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.view.View;

// Referenced classes of package android.support.v7:
//			bv

class bv$a$1
	implements android.view.LongClickListener
{

	public boolean onLongClick(View view)
	{
		bv.a(b.f).b(view, b.getAdapterPosition());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field bv$a b>
	//    2    4:getfield        #31  <Field bv bv$a.f>
	//    3    7:invokestatic    #34  <Method bv$b bv.a(bv)>
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field bv$a b>
	//    7   15:invokevirtual   #38  <Method int bv$a.getAdapterPosition()>
	//    8   18:invokeinterface #43  <Method void bv$b.b(View, int)>
		return true;
	//    9   23:iconst_1        
	//   10   24:ireturn         
	}

	final bv a;
	final bv.a b;

	bv$a$1(bv.a a1, bv bv1)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field bv$a b>
		a = bv1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field bv a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
