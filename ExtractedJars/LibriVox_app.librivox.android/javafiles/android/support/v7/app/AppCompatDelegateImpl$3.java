// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$3
	implements y
{

	public bb onApplyWindowInsets(View view, bb bb1)
	{
		int i = bb1.b();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #24  <Method int bb.b()>
	//    2    4:istore_3        
		int j = updateStatusGuard(i);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field AppCompatDelegateImpl this$0>
	//    5    9:iload_3         
	//    6   10:invokevirtual   #30  <Method int AppCompatDelegateImpl.updateStatusGuard(int)>
	//    7   13:istore          4
		bb bb2 = bb1;
	//    8   15:aload_2         
	//    9   16:astore          5
		if(i != j)
	//*  10   18:iload_3         
	//*  11   19:iload           4
	//*  12   21:icmpeq          44
			bb2 = bb1.a(bb1.a(), j, bb1.c(), bb1.d());
	//   13   24:aload_2         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #33  <Method int bb.a()>
	//   16   29:iload           4
	//   17   31:aload_2         
	//   18   32:invokevirtual   #36  <Method int bb.c()>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #39  <Method int bb.d()>
	//   21   39:invokevirtual   #42  <Method bb bb.a(int, int, int, int)>
	//   22   42:astore          5
		return ac.a(view, bb2);
	//   23   44:aload_1         
	//   24   45:aload           5
	//   25   47:invokestatic    #46  <Method bb ac.a(View, bb)>
	//   26   50:areturn         
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$3()
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
