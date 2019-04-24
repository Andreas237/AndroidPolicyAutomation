// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//			s, aa, o

class s$f$1
	implements android.view.nApplyWindowInsetsListener
{

	public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
	{
		windowinsets = ((WindowInsets) (aa.a(((Object) (windowinsets)))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #34  <Method aa aa.a(Object)>
	//    2    4:astore_2        
		return (WindowInsets)aa.a(a.a(view, ((aa) (windowinsets))));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field o a>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #39  <Method aa o.a(View, aa)>
	//    8   16:invokestatic    #42  <Method Object aa.a(aa)>
	//    9   19:checkcast       #44  <Class WindowInsets>
	//   10   22:areturn         
	}

	final o a;
	final s.f b;

	s$f$1(s.f f1, o o1)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field s$f b>
		a = o1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field o a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
