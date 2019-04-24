// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.view.menu:
//			d, k

private class k$d extends d
	implements android.view.Item.OnMenuItemClickListener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		return ((android.view.Item.OnMenuItemClickListener)b).onMenuItemClick(a.a(menuitem));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object b>
	//    2    4:checkcast       #7   <Class android.view.MenuItem$OnMenuItemClickListener>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field k a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #29  <Method MenuItem k.a(MenuItem)>
	//    7   15:invokeinterface #31  <Method boolean android.view.MenuItem$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
	//    8   20:ireturn         
	}

	final k a;

	k$d(k k1, android.view.Item.OnMenuItemClickListener onmenuitemclicklistener)
	{
		a = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field k a>
		super(((Object) (onmenuitemclicklistener)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void d(Object)>
	//    6   10:return          
	}
}
