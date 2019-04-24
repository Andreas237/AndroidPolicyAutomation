// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.Menu;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplN

class AppCompatDelegateImplN$AppCompatWindowCallbackN extends V23
{

	public void onProvideKeyboardShortcuts(List list, Menu menu, int i)
	{
		AppCompatDelegateImplV9.PanelFeatureState panelfeaturestate = getPanelState(0, true);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AppCompatDelegateImplN this$0>
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #23  <Method AppCompatDelegateImplV9$PanelFeatureState AppCompatDelegateImplN.getPanelState(int, boolean)>
	//    5    9:astore          4
		if(panelfeaturestate != null && panelfeaturestate.menu != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          36
	//*   8   16:aload           4
	//*   9   18:getfield        #29  <Field android.support.v7.view.menu.MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  10   21:ifnull          36
		{
			super.onProvideKeyboardShortcuts(list, ((Menu) (panelfeaturestate.menu)), i);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:aload           4
	//   14   28:getfield        #29  <Field android.support.v7.view.menu.MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   15   31:iload_3         
	//   16   32:invokespecial   #31  <Method void AppCompatDelegateImplV23$AppCompatWindowCallbackV23.onProvideKeyboardShortcuts(List, Menu, int)>
			return;
	//   17   35:return          
		} else
		{
			super.onProvideKeyboardShortcuts(list, menu, i);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:iload_3         
	//   22   40:invokespecial   #31  <Method void AppCompatDelegateImplV23$AppCompatWindowCallbackV23.onProvideKeyboardShortcuts(List, Menu, int)>
			return;
	//   23   43:return          
		}
	}

	final AppCompatDelegateImplN this$0;

	AppCompatDelegateImplN$AppCompatWindowCallbackN(android.view.Window.Callback callback)
	{
		this$0 = AppCompatDelegateImplN.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppCompatDelegateImplN this$0>
		super(((AppCompatDelegateImplV23) (AppCompatDelegateImplN.this)), callback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #16  <Method void AppCompatDelegateImplV23$AppCompatWindowCallbackV23(AppCompatDelegateImplV23, android.view.Window$Callback)>
	//    7   11:return          
	}
}
