// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.MenuBuilder;
import android.view.*;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$AppCompatWindowCallback extends WindowCallbackWrapper
{

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return AppCompatDelegateImpl.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #20  <Method boolean AppCompatDelegateImpl.dispatchKeyEvent(KeyEvent)>
	//    4    8:ifne            24
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #21  <Method boolean WindowCallbackWrapper.dispatchKeyEvent(KeyEvent)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyShortcutEvent(keyevent) || onKeyShortcut(keyevent.getKeyCode(), keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method boolean WindowCallbackWrapper.dispatchKeyShortcutEvent(KeyEvent)>
	//    3    5:ifne            28
	//    4    8:aload_0         
	//    5    9:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #30  <Method int KeyEvent.getKeyCode()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #34  <Method boolean AppCompatDelegateImpl.onKeyShortcut(int, KeyEvent)>
	//   10   20:ifeq            26
	//   11   23:goto            28
	//   12   26:iconst_0        
	//   13   27:ireturn         
	//   14   28:iconst_1        
	//   15   29:ireturn         
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
	//*   3    5:instanceof      #40  <Class MenuBuilder>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return super.onCreatePanelMenu(i, menu);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #42  <Method boolean WindowCallbackWrapper.onCreatePanelMenu(int, Menu)>
	//   11   19:ireturn         
	}

	public boolean onMenuOpened(int i, Menu menu)
	{
		super.onMenuOpened(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method boolean WindowCallbackWrapper.onMenuOpened(int, Menu)>
	//    4    6:pop             
		AppCompatDelegateImpl.this.onMenuOpened(i);
	//    5    7:aload_0         
	//    6    8:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    7   11:iload_1         
	//    8   12:invokevirtual   #48  <Method void AppCompatDelegateImpl.onMenuOpened(int)>
		return true;
	//    9   15:iconst_1        
	//   10   16:ireturn         
	}

	public void onPanelClosed(int i, Menu menu)
	{
		super.onPanelClosed(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #52  <Method void WindowCallbackWrapper.onPanelClosed(int, Menu)>
		AppCompatDelegateImpl.this.onPanelClosed(i);
	//    4    6:aload_0         
	//    5    7:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #54  <Method void AppCompatDelegateImpl.onPanelClosed(int)>
	//    8   14:return          
	}

	public boolean onPreparePanel(int i, View view, Menu menu)
	{
		MenuBuilder menubuilder;
		if(menu instanceof MenuBuilder)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #40  <Class MenuBuilder>
	//*   2    4:ifeq            16
			menubuilder = (MenuBuilder)menu;
	//    3    7:aload_3         
	//    4    8:checkcast       #40  <Class MenuBuilder>
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
			menubuilder.c(true);
	//   17   35:aload           5
	//   18   37:iconst_1        
	//   19   38:invokevirtual   #60  <Method void MenuBuilder.c(boolean)>
		boolean flag = super.onPreparePanel(i, view, menu);
	//   20   41:aload_0         
	//   21   42:iload_1         
	//   22   43:aload_2         
	//   23   44:aload_3         
	//   24   45:invokespecial   #62  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
	//   25   48:istore          4
		if(menubuilder != null)
	//*  26   50:aload           5
	//*  27   52:ifnull          61
			menubuilder.c(false);
	//   28   55:aload           5
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #60  <Method void MenuBuilder.c(boolean)>
		return flag;
	//   31   61:iload           4
	//   32   63:ireturn         
	}

	public void onProvideKeyboardShortcuts(List list, Menu menu, int i)
	{
		AppCompatDelegateImpl.PanelFeatureState panelfeaturestate = getPanelState(0, true);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #68  <Method AppCompatDelegateImpl$PanelFeatureState AppCompatDelegateImpl.getPanelState(int, boolean)>
	//    5    9:astore          4
		if(panelfeaturestate != null && panelfeaturestate.menu != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          36
	//*   8   16:aload           4
	//*   9   18:getfield        #74  <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  10   21:ifnull          36
		{
			super.onProvideKeyboardShortcuts(list, ((Menu) (panelfeaturestate.menu)), i);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:aload           4
	//   14   28:getfield        #74  <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   15   31:iload_3         
	//   16   32:invokespecial   #76  <Method void WindowCallbackWrapper.onProvideKeyboardShortcuts(List, Menu, int)>
			return;
	//   17   35:return          
		} else
		{
			super.onProvideKeyboardShortcuts(list, menu, i);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:iload_3         
	//   22   40:invokespecial   #76  <Method void WindowCallbackWrapper.onProvideKeyboardShortcuts(List, Menu, int)>
			return;
	//   23   43:return          
		}
	}

	public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #84  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		if(isHandleNativeActionModesEnabled())
	//*   5   10:aload_0         
	//*   6   11:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//*   7   14:invokevirtual   #88  <Method boolean AppCompatDelegateImpl.isHandleNativeActionModesEnabled()>
	//*   8   17:ifeq            26
			return startAsSupportActionMode(callback);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokevirtual   #91  <Method ActionMode startAsSupportActionMode(android.view.ActionMode$Callback)>
	//   12   25:areturn         
		else
			return super.onWindowStartingActionMode(callback);
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokespecial   #93  <Method ActionMode WindowCallbackWrapper.onWindowStartingActionMode(android.view.ActionMode$Callback)>
	//   16   31:areturn         
	}

	public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
	{
		if(isHandleNativeActionModesEnabled() && i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//*   2    4:invokevirtual   #88  <Method boolean AppCompatDelegateImpl.isHandleNativeActionModesEnabled()>
	//*   3    7:ifeq            23
	//*   4   10:iload_2         
	//*   5   11:ifeq            17
	//*   6   14:goto            23
			return startAsSupportActionMode(callback);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #91  <Method ActionMode startAsSupportActionMode(android.view.ActionMode$Callback)>
	//   10   22:areturn         
		else
			return super.onWindowStartingActionMode(callback, i);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokespecial   #96  <Method ActionMode WindowCallbackWrapper.onWindowStartingActionMode(android.view.ActionMode$Callback, int)>
	//   15   29:areturn         
	}

	final ActionMode startAsSupportActionMode(android.view.ActionMode.Callback callback)
	{
		callback = ((android.view.ActionMode.Callback) (new android.support.v7.view.SupportActionModeWrapper.CallbackWrapper(mContext, callback)));
	//    0    0:new             #98  <Class android.support.v7.view.SupportActionModeWrapper$CallbackWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//    4    8:getfield        #102 <Field android.content.Context AppCompatDelegateImpl.mContext>
	//    5   11:aload_1         
	//    6   12:invokespecial   #105 <Method void android.support.v7.view.SupportActionModeWrapper$CallbackWrapper(android.content.Context, android.view.ActionMode$Callback)>
	//    7   15:astore_1        
		android.support.v7.view.ActionMode actionmode = startSupportActionMode(((android.support.v7.view.ActionMode.Callback) (callback)));
	//    8   16:aload_0         
	//    9   17:getfield        #10  <Field AppCompatDelegateImpl this$0>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #109 <Method android.support.v7.view.ActionMode AppCompatDelegateImpl.startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   12   24:astore_2        
		if(actionmode != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          35
			return ((android.support.v7.view.SupportActionModeWrapper.CallbackWrapper) (callback)).getActionModeWrapper(actionmode);
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #113 <Method ActionMode android.support.v7.view.SupportActionModeWrapper$CallbackWrapper.getActionModeWrapper(android.support.v7.view.ActionMode)>
	//   18   34:areturn         
		else
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$AppCompatWindowCallback(android.view.Window.Callback callback)
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field AppCompatDelegateImpl this$0>
		super(callback);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void WindowCallbackWrapper(android.view.Window$Callback)>
	//    6   10:return          
	}
}
