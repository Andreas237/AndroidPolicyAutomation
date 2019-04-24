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
		boolean flag;
		MenuBuilder menubuilder;
		if(menu instanceof MenuBuilder)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #41  <Class MenuBuilder>
	//*   2    4:ifeq            28
			menubuilder = (MenuBuilder)menu;
	//    3    7:aload_3         
	//    4    8:checkcast       #41  <Class MenuBuilder>
	//    5   11:astore          6
		else
	//*   6   13:iload_1         
	//*   7   14:ifne            34
	//*   8   17:aload           6
	//*   9   19:ifnonnull       34
	//*  10   22:iconst_0        
	//*  11   23:istore          4
	//*  12   25:iload           4
	//*  13   27:ireturn         
			menubuilder = null;
	//   14   28:aconst_null     
	//   15   29:astore          6
		if(i == 0 && menubuilder == null)
		{
			flag = false;
		} else
	//*  16   31:goto            13
		{
			if(menubuilder != null)
	//*  17   34:aload           6
	//*  18   36:ifnull          45
				menubuilder.setOverrideVisibleItems(true);
	//   19   39:aload           6
	//   20   41:iconst_1        
	//   21   42:invokevirtual   #58  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
			boolean flag1 = super.onPreparePanel(i, view, menu);
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:aload_2         
	//   25   48:aload_3         
	//   26   49:invokespecial   #60  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
	//   27   52:istore          5
			flag = flag1;
	//   28   54:iload           5
	//   29   56:istore          4
			if(menubuilder != null)
	//*  30   58:aload           6
	//*  31   60:ifnull          25
			{
				menubuilder.setOverrideVisibleItems(false);
	//   32   63:aload           6
	//   33   65:iconst_0        
	//   34   66:invokevirtual   #58  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
				return flag1;
	//   35   69:iload           5
	//   36   71:ireturn         
			}
		}
		return flag;
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
