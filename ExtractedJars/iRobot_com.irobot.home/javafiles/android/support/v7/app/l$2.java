// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//			l

class l$2
	implements android.support.v7.widget.bar.b
{

	public boolean a(MenuItem menuitem)
	{
		return a.c.onMenuItemSelected(0, menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field l a>
	//    2    4:getfield        #23  <Field android.view.Window$Callback l.c>
	//    3    7:iconst_0        
	//    4    8:aload_1         
	//    5    9:invokeinterface #29  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
	//    6   14:ireturn         
	}

	final l a;

	l$2(l l1)
	{
		a = l1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field l a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
