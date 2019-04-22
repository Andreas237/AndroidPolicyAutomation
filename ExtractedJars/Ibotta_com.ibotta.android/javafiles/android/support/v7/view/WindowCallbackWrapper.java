// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class WindowCallbackWrapper
	implements android.view.Window.Callback
{

	public WindowCallbackWrapper(android.view.Window.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		if(callback != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          14
		{
			mWrapped = callback;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #19  <Field android.view.Window$Callback mWrapped>
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalArgumentException("Window callback may not be null");
	//    8   14:new             #21  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #23  <String "Window callback may not be null">
	//   11   20:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		}
	}

	public boolean dispatchGenericMotionEvent(MotionEvent motionevent)
	{
		return mWrapped.dispatchGenericMotionEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method boolean android.view.Window$Callback.dispatchGenericMotionEvent(MotionEvent)>
	//    4   10:ireturn         
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return mWrapped.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #35  <Method boolean android.view.Window$Callback.dispatchKeyEvent(KeyEvent)>
	//    4   10:ireturn         
	}

	public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
	{
		return mWrapped.dispatchKeyShortcutEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #38  <Method boolean android.view.Window$Callback.dispatchKeyShortcutEvent(KeyEvent)>
	//    4   10:ireturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		return mWrapped.dispatchPopulateAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method boolean android.view.Window$Callback.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//    4   10:ireturn         
	}

	public boolean dispatchTouchEvent(MotionEvent motionevent)
	{
		return mWrapped.dispatchTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #45  <Method boolean android.view.Window$Callback.dispatchTouchEvent(MotionEvent)>
	//    4   10:ireturn         
	}

	public boolean dispatchTrackballEvent(MotionEvent motionevent)
	{
		return mWrapped.dispatchTrackballEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #48  <Method boolean android.view.Window$Callback.dispatchTrackballEvent(MotionEvent)>
	//    4   10:ireturn         
	}

	public void onActionModeFinished(ActionMode actionmode)
	{
		mWrapped.onActionModeFinished(actionmode);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method void android.view.Window$Callback.onActionModeFinished(ActionMode)>
	//    4   10:return          
	}

	public void onActionModeStarted(ActionMode actionmode)
	{
		mWrapped.onActionModeStarted(actionmode);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #55  <Method void android.view.Window$Callback.onActionModeStarted(ActionMode)>
	//    4   10:return          
	}

	public void onAttachedToWindow()
	{
		mWrapped.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:invokeinterface #58  <Method void android.view.Window$Callback.onAttachedToWindow()>
	//    3    9:return          
	}

	public void onContentChanged()
	{
		mWrapped.onContentChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:invokeinterface #61  <Method void android.view.Window$Callback.onContentChanged()>
	//    3    9:return          
	}

	public boolean onCreatePanelMenu(int i, Menu menu)
	{
		return mWrapped.onCreatePanelMenu(i, menu);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #65  <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//    5   11:ireturn         
	}

	public View onCreatePanelView(int i)
	{
		return mWrapped.onCreatePanelView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:invokeinterface #69  <Method View android.view.Window$Callback.onCreatePanelView(int)>
	//    4   10:areturn         
	}

	public void onDetachedFromWindow()
	{
		mWrapped.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:invokeinterface #72  <Method void android.view.Window$Callback.onDetachedFromWindow()>
	//    3    9:return          
	}

	public boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		return mWrapped.onMenuItemSelected(i, menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #76  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
	//    5   11:ireturn         
	}

	public boolean onMenuOpened(int i, Menu menu)
	{
		return mWrapped.onMenuOpened(i, menu);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #79  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//    5   11:ireturn         
	}

	public void onPanelClosed(int i, Menu menu)
	{
		mWrapped.onPanelClosed(i, menu);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #83  <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
	//    5   11:return          
	}

	public void onPointerCaptureChanged(boolean flag)
	{
		mWrapped.onPointerCaptureChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:invokeinterface #89  <Method void android.view.Window$Callback.onPointerCaptureChanged(boolean)>
	//    4   10:return          
	}

	public boolean onPreparePanel(int i, View view, Menu menu)
	{
		return mWrapped.onPreparePanel(i, view, menu);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #94  <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//    6   12:ireturn         
	}

	public void onProvideKeyboardShortcuts(List list, Menu menu, int i)
	{
		mWrapped.onProvideKeyboardShortcuts(list, menu, i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #99  <Method void android.view.Window$Callback.onProvideKeyboardShortcuts(List, Menu, int)>
	//    6   12:return          
	}

	public boolean onSearchRequested()
	{
		return mWrapped.onSearchRequested();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:invokeinterface #105 <Method boolean android.view.Window$Callback.onSearchRequested()>
	//    3    9:ireturn         
	}

	public boolean onSearchRequested(SearchEvent searchevent)
	{
		return mWrapped.onSearchRequested(searchevent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #109 <Method boolean android.view.Window$Callback.onSearchRequested(SearchEvent)>
	//    4   10:ireturn         
	}

	public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutparams)
	{
		mWrapped.onWindowAttributesChanged(layoutparams);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #113 <Method void android.view.Window$Callback.onWindowAttributesChanged(android.view.WindowManager$LayoutParams)>
	//    4   10:return          
	}

	public void onWindowFocusChanged(boolean flag)
	{
		mWrapped.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:iload_1         
	//    3    5:invokeinterface #116 <Method void android.view.Window$Callback.onWindowFocusChanged(boolean)>
	//    4   10:return          
	}

	public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
	{
		return mWrapped.onWindowStartingActionMode(callback);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #120 <Method ActionMode android.view.Window$Callback.onWindowStartingActionMode(android.view.ActionMode$Callback)>
	//    4   10:areturn         
	}

	public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
	{
		return mWrapped.onWindowStartingActionMode(callback, i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.view.Window$Callback mWrapped>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #123 <Method ActionMode android.view.Window$Callback.onWindowStartingActionMode(android.view.ActionMode$Callback, int)>
	//    5   11:areturn         
	}

	final android.view.Window.Callback mWrapped;
}
