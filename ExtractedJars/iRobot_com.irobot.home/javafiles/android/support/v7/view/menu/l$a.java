// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			l

class l$a extends k$a
	implements android.view.onProvider.VisibilityListener
{

	public View a(MenuItem menuitem)
	{
		return a.onCreateActionView(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ActionProvider a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method View ActionProvider.onCreateActionView(MenuItem)>
	//    4    8:areturn         
	}

	public void a(android.support.v4.view.b$b b$b1)
	{
		c = b$b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field android.support.v4.view.b$b c>
		ActionProvider actionprovider = a;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field ActionProvider a>
	//    5    9:astore_2        
		if(b$b1 != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          19
			b$b1 = ((android.support.v4.view.b$b) (this));
	//    8   14:aload_0         
	//    9   15:astore_1        
		else
	//*  10   16:goto            21
			b$b1 = null;
	//   11   19:aconst_null     
	//   12   20:astore_1        
		actionprovider.setVisibilityListener(((android.view.onProvider.VisibilityListener) (b$b1)));
	//   13   21:aload_2         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #37  <Method void ActionProvider.setVisibilityListener(android.view.ActionProvider$VisibilityListener)>
	//   16   26:return          
	}

	public boolean b()
	{
		return a.overridesItemVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ActionProvider a>
	//    2    4:invokevirtual   #42  <Method boolean ActionProvider.overridesItemVisibility()>
	//    3    7:ireturn         
	}

	public boolean c()
	{
		return a.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ActionProvider a>
	//    2    4:invokevirtual   #45  <Method boolean ActionProvider.isVisible()>
	//    3    7:ireturn         
	}

	public void onActionProviderVisibilityChanged(boolean flag)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field android.support.v4.view.b$b c>
	//*   2    4:ifnull          17
			c.a(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field android.support.v4.view.b$b c>
	//    5   11:iload_1         
	//    6   12:invokeinterface #51  <Method void android.support.v4.view.b$b.a(boolean)>
	//    7   17:return          
	}

	android.support.v4.view.b$b c;
	final l d;

	public l$a(l l1, Context context, ActionProvider actionprovider)
	{
		d = l1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field l d>
		super(((k) (l1)), context, actionprovider);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #20  <Method void k$a(k, Context, ActionProvider)>
	//    8   12:return          
	}
}
