// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;

// Referenced classes of package android.support.design.widget:
//			BottomNavigationView

class BottomNavigationView$1
	implements android.support.v7.view.menu.MenuBuilder.Callback
{

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		if(BottomNavigationView.access$000(BottomNavigationView.this) != null && menuitem.getItemId() == getSelectedItemId())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field BottomNavigationView this$0>
	//*   2    4:invokestatic    #26  <Method BottomNavigationView$OnNavigationItemReselectedListener BottomNavigationView.access$000(BottomNavigationView)>
	//*   3    7:ifnull          41
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #32  <Method int MenuItem.getItemId()>
	//*   6   16:aload_0         
	//*   7   17:getfield        #16  <Field BottomNavigationView this$0>
	//*   8   20:invokevirtual   #35  <Method int BottomNavigationView.getSelectedItemId()>
	//*   9   23:icmpne          41
			BottomNavigationView.access$000(BottomNavigationView.this).onNavigationItemReselected(menuitem);
	//   10   26:aload_0         
	//   11   27:getfield        #16  <Field BottomNavigationView this$0>
	//   12   30:invokestatic    #26  <Method BottomNavigationView$OnNavigationItemReselectedListener BottomNavigationView.access$000(BottomNavigationView)>
	//   13   33:aload_2         
	//   14   34:invokeinterface #41  <Method void BottomNavigationView$OnNavigationItemReselectedListener.onNavigationItemReselected(MenuItem)>
		else
	//*  15   39:iconst_1        
	//*  16   40:ireturn         
		if(BottomNavigationView.access$100(BottomNavigationView.this) == null || BottomNavigationView.access$100(BottomNavigationView.this).onNavigationItemSelected(menuitem))
	//*  17   41:aload_0         
	//*  18   42:getfield        #16  <Field BottomNavigationView this$0>
	//*  19   45:invokestatic    #45  <Method BottomNavigationView$OnNavigationItemSelectedListener BottomNavigationView.access$100(BottomNavigationView)>
	//*  20   48:ifnull          67
	//*  21   51:aload_0         
	//*  22   52:getfield        #16  <Field BottomNavigationView this$0>
	//*  23   55:invokestatic    #45  <Method BottomNavigationView$OnNavigationItemSelectedListener BottomNavigationView.access$100(BottomNavigationView)>
	//*  24   58:aload_2         
	//*  25   59:invokeinterface #51  <Method boolean BottomNavigationView$OnNavigationItemSelectedListener.onNavigationItemSelected(MenuItem)>
	//*  26   64:ifeq            39
			return false;
	//   27   67:iconst_0        
	//   28   68:ireturn         
		return true;
	}

	public void onMenuModeChange(MenuBuilder menubuilder)
	{
	//    0    0:return          
	}

	final BottomNavigationView this$0;

	BottomNavigationView$1()
	{
		this$0 = BottomNavigationView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BottomNavigationView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
