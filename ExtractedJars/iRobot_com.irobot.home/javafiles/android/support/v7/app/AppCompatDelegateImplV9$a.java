// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.menu.h;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

private final class AppCompatDelegateImplV9$a
	implements android.support.v7.view.menu.o.a
{

	public void a(h h, boolean flag)
	{
		a.b(h);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method void AppCompatDelegateImplV9.b(h)>
	//    4    8:return          
	}

	public boolean a(h h)
	{
		android.view.Window.Callback callback = a.q();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppCompatDelegateImplV9 a>
	//    2    4:invokevirtual   #28  <Method android.view.Window$Callback AppCompatDelegateImplV9.q()>
	//    3    7:astore_2        
		if(callback != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          22
			callback.onMenuOpened(108, ((android.view.Menu) (h)));
	//    6   12:aload_2         
	//    7   13:bipush          108
	//    8   15:aload_1         
	//    9   16:invokeinterface #34  <Method boolean android.view.Window$Callback.onMenuOpened(int, android.view.Menu)>
	//   10   21:pop             
		return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
	}

	final AppCompatDelegateImplV9 a;

	AppCompatDelegateImplV9$a(AppCompatDelegateImplV9 appcompatdelegateimplv9)
	{
		a = appcompatdelegateimplv9;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AppCompatDelegateImplV9 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
