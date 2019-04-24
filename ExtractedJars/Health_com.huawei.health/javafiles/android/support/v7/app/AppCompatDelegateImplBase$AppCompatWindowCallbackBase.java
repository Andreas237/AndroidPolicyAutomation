// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.MenuBuilder;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplBase

class AppCompatDelegateImplBase$AppCompatWindowCallbackBase extends WindowCallbackWrapper
{

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return AppCompatDelegateImplBase.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AppCompatDelegateImplBase this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #21  <Method boolean AppCompatDelegateImplBase.dispatchKeyEvent(KeyEvent)>
	//    4    8:ifne            19
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #22  <Method boolean WindowCallbackWrapper.dispatchKeyEvent(KeyEvent)>
	//    8   16:ifeq            21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyShortcutEvent(keyevent) || onKeyShortcut(keyevent.getKeyCode(), keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method boolean WindowCallbackWrapper.dispatchKeyShortcutEvent(KeyEvent)>
	//    3    5:ifne            23
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field AppCompatDelegateImplBase this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #31  <Method int KeyEvent.getKeyCode()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #35  <Method boolean AppCompatDelegateImplBase.onKeyShortcut(int, KeyEvent)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public void onContentChanged()
	{
	//    0    0:return          
	}

	public boolean onCreatePanelMenu(int i, Menu menu)
	{
		if(i == 0 && !(menu instanceof MenuBuilder))
	//*   0    0:iload_1         
	//*   1    1:ifne            13
	//*   2    4:aload_2         
	//*   3    5:instanceof      #41  <Class MenuBuilder>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return super.onCreatePanelMenu(i, menu);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #43  <Method boolean WindowCallbackWrapper.onCreatePanelMenu(int, Menu)>
	//   11   19:ireturn         
	}

	public boolean onMenuOpened(int i, Menu menu)
	{
		super.onMenuOpened(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method boolean WindowCallbackWrapper.onMenuOpened(int, Menu)>
	//    4    6:pop             
		AppCompatDelegateImplBase.this.onMenuOpened(i, menu);
	//    5    7:aload_0         
	//    6    8:getfield        #13  <Field AppCompatDelegateImplBase this$0>
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #47  <Method boolean AppCompatDelegateImplBase.onMenuOpened(int, Menu)>
	//   10   16:pop             
		return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
	}

	public void onPanelClosed(int i, Menu menu)
	{
		super.onPanelClosed(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #51  <Method void WindowCallbackWrapper.onPanelClosed(int, Menu)>
		AppCompatDelegateImplBase.this.onPanelClosed(i, menu);
	//    4    6:aload_0         
	//    5    7:getfield        #13  <Field AppCompatDelegateImplBase this$0>
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #52  <Method void AppCompatDelegateImplBase.onPanelClosed(int, Menu)>
	//    9   15:return          
	}

	public boolean onPreparePanel(int i, View view, Menu menu)
	{
		MenuBuilder menubuilder;
		if(menu instanceof MenuBuilder)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #41  <Class MenuBuilder>
	//*   2    4:ifeq            16
			menubuilder = (MenuBuilder)menu;
	//    3    7:aload_3         
	//    4    8:checkcast       #41  <Class MenuBuilder>
	//    5   11:astore          5
		else
	//*   6   13:goto            19
			menubuilder = null;
	//    7   16:aconst_null     
	//    8   17:astore          5
		if(i == 0 && menubuilder == null)
	//*   9   19:iload_1         
	//*  10   20:ifne            30
	//*  11   23:aload           5
	//*  12   25:ifnonnull       30
			return false;
	//   13   28:iconst_0        
	//   14   29:ireturn         
		if(menubuilder != null)
	//*  15   30:aload           5
	//*  16   32:ifnull          41
			menubuilder.setOverrideVisibleItems(true);
	//   17   35:aload           5
	//   18   37:iconst_1        
	//   19   38:invokevirtual   #58  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
		boolean flag = super.onPreparePanel(i, view, menu);
	//   20   41:aload_0         
	//   21   42:iload_1         
	//   22   43:aload_2         
	//   23   44:aload_3         
	//   24   45:invokespecial   #60  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
	//   25   48:istore          4
		if(menubuilder != null)
	//*  26   50:aload           5
	//*  27   52:ifnull          61
			menubuilder.setOverrideVisibleItems(false);
	//   28   55:aload           5
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #58  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
		return flag;
	//   31   61:iload           4
	//   32   63:ireturn         
	}

	final AppCompatDelegateImplBase this$0;

	AppCompatDelegateImplBase$AppCompatWindowCallbackBase(android.view.Window.Callback callback)
	{
		this$0 = AppCompatDelegateImplBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppCompatDelegateImplBase this$0>
		super(callback);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void WindowCallbackWrapper(android.view.Window$Callback)>
	//    6   10:return          
	}
}
