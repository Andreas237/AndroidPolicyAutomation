// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			b, l

class b$7
	implements eDismissBehavior.a
{

	public void a(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 43
	//	               1 29
	//	               2 29
		default:
			return;
	//    2   28:return          

		case 1: // '\001'
		case 2: // '\002'
			l.a().c(a.c);
	//    3   29:invokestatic    #26  <Method l l.a()>
	//    4   32:aload_0         
	//    5   33:getfield        #17  <Field b a>
	//    6   36:getfield        #30  <Field l$a b.c>
	//    7   39:invokevirtual   #33  <Method void l.c(l$a)>
			return;
	//    8   42:return          

		case 0: // '\0'
			l.a().d(a.c);
	//    9   43:invokestatic    #26  <Method l l.a()>
	//   10   46:aload_0         
	//   11   47:getfield        #17  <Field b a>
	//   12   50:getfield        #30  <Field l$a b.c>
	//   13   53:invokevirtual   #35  <Method void l.d(l$a)>
			return;
	//   14   56:return          
		}
	}

	public void a(View view)
	{
		view.setVisibility(8);
	//    0    0:aload_1         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #41  <Method void View.setVisibility(int)>
		a.b(0);
	//    3    6:aload_0         
	//    4    7:getfield        #17  <Field b a>
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #44  <Method void b.b(int)>
	//    7   14:return          
	}

	final b a;

	b$7(b b1)
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
