// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			b

class b$9
	implements b$e
{

	public void a(View view, int i, int j, int k, int l)
	{
		a.b.setOnLayoutChangeListener(((b$e) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field b a>
	//    2    4:getfield        #25  <Field b$f b.b>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #31  <Method void b$f.setOnLayoutChangeListener(b$e)>
		if(a.g())
	//*   5   11:aload_0         
	//*   6   12:getfield        #17  <Field b a>
	//*   7   15:invokevirtual   #35  <Method boolean b.g()>
	//*   8   18:ifeq            29
		{
			a.e();
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field b a>
	//   11   25:invokevirtual   #38  <Method void b.e()>
			return;
	//   12   28:return          
		} else
		{
			a.f();
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field b a>
	//   15   33:invokevirtual   #41  <Method void b.f()>
			return;
	//   16   36:return          
		}
	}

	final b a;

	b$9(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
