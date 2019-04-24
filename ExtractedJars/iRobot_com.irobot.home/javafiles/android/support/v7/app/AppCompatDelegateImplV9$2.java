// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$2
	implements o
{

	public aa a(View view, aa aa1)
	{
		int i = aa1.b();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #28  <Method int aa.b()>
	//    2    4:istore_3        
		int j = a.g(i);
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field AppCompatDelegateImplV9 a>
	//    5    9:iload_3         
	//    6   10:invokevirtual   #32  <Method int AppCompatDelegateImplV9.g(int)>
	//    7   13:istore          4
		aa aa2 = aa1;
	//    8   15:aload_2         
	//    9   16:astore          5
		if(i != j)
	//*  10   18:iload_3         
	//*  11   19:iload           4
	//*  12   21:icmpeq          44
			aa2 = aa1.a(aa1.a(), j, aa1.c(), aa1.d());
	//   13   24:aload_2         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #34  <Method int aa.a()>
	//   16   29:iload           4
	//   17   31:aload_2         
	//   18   32:invokevirtual   #37  <Method int aa.c()>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #40  <Method int aa.d()>
	//   21   39:invokevirtual   #43  <Method aa aa.a(int, int, int, int)>
	//   22   42:astore          5
		return s.a(view, aa2);
	//   23   44:aload_1         
	//   24   45:aload           5
	//   25   47:invokestatic    #47  <Method aa s.a(View, aa)>
	//   26   50:areturn         
	}

	final AppCompatDelegateImplV9 a;

	AppCompatDelegateImplV9$2(AppCompatDelegateImplV9 appcompatdelegateimplv9)
	{
		a = appcompatdelegateimplv9;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppCompatDelegateImplV9 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
