// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v7.view.menu.h;
import android.view.MenuItem;

// Referenced classes of package android.support.design.widget:
//			BottomNavigationView

class BottomNavigationView$1
	implements android.support.v7.view.menu.h.a
{

	public void a(h h)
	{
	//    0    0:return          
	}

	public boolean a(h h, MenuItem menuitem)
	{
		if(BottomNavigationView.a(a) != null && menuitem.getItemId() == a.getSelectedItemId())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field BottomNavigationView a>
	//*   2    4:invokestatic    #25  <Method BottomNavigationView$a BottomNavigationView.a(BottomNavigationView)>
	//*   3    7:ifnull          41
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #31  <Method int MenuItem.getItemId()>
	//*   6   16:aload_0         
	//*   7   17:getfield        #16  <Field BottomNavigationView a>
	//*   8   20:invokevirtual   #34  <Method int BottomNavigationView.getSelectedItemId()>
	//*   9   23:icmpne          41
		{
			BottomNavigationView.a(a).a(menuitem);
	//   10   26:aload_0         
	//   11   27:getfield        #16  <Field BottomNavigationView a>
	//   12   30:invokestatic    #25  <Method BottomNavigationView$a BottomNavigationView.a(BottomNavigationView)>
	//   13   33:aload_2         
	//   14   34:invokeinterface #39  <Method void BottomNavigationView$a.a(MenuItem)>
			return true;
	//   15   39:iconst_1        
	//   16   40:ireturn         
		}
		return BottomNavigationView.b(a) != null && !BottomNavigationView.b(a).a(menuitem);
	//   17   41:aload_0         
	//   18   42:getfield        #16  <Field BottomNavigationView a>
	//   19   45:invokestatic    #43  <Method BottomNavigationView$b BottomNavigationView.b(BottomNavigationView)>
	//   20   48:ifnull          69
	//   21   51:aload_0         
	//   22   52:getfield        #16  <Field BottomNavigationView a>
	//   23   55:invokestatic    #43  <Method BottomNavigationView$b BottomNavigationView.b(BottomNavigationView)>
	//   24   58:aload_2         
	//   25   59:invokeinterface #48  <Method boolean BottomNavigationView$b.a(MenuItem)>
	//   26   64:ifne            69
	//   27   67:iconst_1        
	//   28   68:ireturn         
	//   29   69:iconst_0        
	//   30   70:ireturn         
	}

	final BottomNavigationView a;

	BottomNavigationView$1(BottomNavigationView bottomnavigationview)
	{
		a = bottomnavigationview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BottomNavigationView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
