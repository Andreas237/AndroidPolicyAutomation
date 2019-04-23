// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.view.menu:
//			CascadingMenuPopup, MenuBuilder

class CascadingMenuPopup$3$1
	implements Runnable
{

	public void run()
	{
		if(val$nextInfo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
	//*   2    4:ifnull          40
		{
			mShouldCloseImmediately = true;
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field CascadingMenuPopup$3 this$1>
	//    5   11:getfield        #35  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
	//    6   14:iconst_1        
	//    7   15:putfield        #41  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
			val$nextInfo.menu.b(false);
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
	//   10   22:getfield        #46  <Field MenuBuilder CascadingMenuPopup$CascadingMenuInfo.menu>
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #52  <Method void MenuBuilder.b(boolean)>
			mShouldCloseImmediately = false;
	//   13   29:aload_0         
	//   14   30:getfield        #18  <Field CascadingMenuPopup$3 this$1>
	//   15   33:getfield        #35  <Field CascadingMenuPopup CascadingMenuPopup$3.this$0>
	//   16   36:iconst_0        
	//   17   37:putfield        #41  <Field boolean CascadingMenuPopup.mShouldCloseImmediately>
		}
		if(val$item.isEnabled() && val$item.hasSubMenu())
	//*  18   40:aload_0         
	//*  19   41:getfield        #22  <Field MenuItem val$item>
	//*  20   44:invokeinterface #58  <Method boolean MenuItem.isEnabled()>
	//*  21   49:ifeq            77
	//*  22   52:aload_0         
	//*  23   53:getfield        #22  <Field MenuItem val$item>
	//*  24   56:invokeinterface #61  <Method boolean MenuItem.hasSubMenu()>
	//*  25   61:ifeq            77
			val$menu.a(val$item, 4);
	//   26   64:aload_0         
	//   27   65:getfield        #24  <Field MenuBuilder val$menu>
	//   28   68:aload_0         
	//   29   69:getfield        #22  <Field MenuItem val$item>
	//   30   72:iconst_4        
	//   31   73:invokevirtual   #65  <Method boolean MenuBuilder.a(MenuItem, int)>
	//   32   76:pop             
	//   33   77:return          
	}

	final CascadingMenuPopup._cls3 this$1;
	final MenuItem val$item;
	final MenuBuilder val$menu;
	final adingMenuInfo val$nextInfo;

	CascadingMenuPopup$3$1()
	{
		this$1 = final__pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CascadingMenuPopup$3 this$1>
		val$nextInfo = adingmenuinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field CascadingMenuPopup$CascadingMenuInfo val$nextInfo>
		val$item = menuitem;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field MenuItem val$item>
		val$menu = MenuBuilder.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field MenuBuilder val$menu>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}
}
