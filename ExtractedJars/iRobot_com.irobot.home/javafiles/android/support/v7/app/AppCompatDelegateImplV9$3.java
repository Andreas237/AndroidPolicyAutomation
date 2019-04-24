// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.graphics.Rect;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$3
	implements android.support.v7.widget.ab.a
{

	public void a(Rect rect)
	{
		rect.top = a.g(rect.top);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field AppCompatDelegateImplV9 a>
	//    3    5:aload_1         
	//    4    6:getfield        #28  <Field int Rect.top>
	//    5    9:invokevirtual   #32  <Method int AppCompatDelegateImplV9.g(int)>
	//    6   12:putfield        #28  <Field int Rect.top>
	//    7   15:return          
	}

	final AppCompatDelegateImplV9 a;

	AppCompatDelegateImplV9$3(AppCompatDelegateImplV9 appcompatdelegateimplv9)
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
