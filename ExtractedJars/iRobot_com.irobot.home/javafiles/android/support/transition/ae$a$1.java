// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.f.a;
import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			ad, ae, Transition

class ae$a$1 extends ad
{

	public void a(Transition transition)
	{
		((ArrayList)a.get(((Object) (b.b)))).remove(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field a a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ae$a b>
	//    4    8:getfield        #29  <Field android.view.ViewGroup ae$a.b>
	//    5   11:invokevirtual   #35  <Method Object a.get(Object)>
	//    6   14:checkcast       #37  <Class ArrayList>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #41  <Method boolean ArrayList.remove(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	final a a;
	final ae.a b;

	ae$a$1(ae.a a1, a a2)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ae$a b>
		a = a2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void ad()>
	//    8   14:return          
	}
}
