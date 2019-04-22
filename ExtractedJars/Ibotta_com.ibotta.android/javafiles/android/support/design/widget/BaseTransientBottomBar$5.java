// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar, SnackbarManager

class BaseTransientBottomBar$5
	implements smissListener
{

	public void onDismiss(View view)
	{
		view.setVisibility(8);
	//    0    0:aload_1         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #28  <Method void View.setVisibility(int)>
		dispatchDismiss(0);
	//    3    6:aload_0         
	//    4    7:getfield        #17  <Field BaseTransientBottomBar this$0>
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #31  <Method void BaseTransientBottomBar.dispatchDismiss(int)>
	//    7   14:return          
	}

	public void onDragStateChanged(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 43
	//	               1 29
	//	               2 29
		default:
			return;
	//    2   28:return          

		case 1: // '\001'
		case 2: // '\002'
			SnackbarManager.getInstance().pauseTimeout(managerCallback);
	//    3   29:invokestatic    #38  <Method SnackbarManager SnackbarManager.getInstance()>
	//    4   32:aload_0         
	//    5   33:getfield        #17  <Field BaseTransientBottomBar this$0>
	//    6   36:getfield        #42  <Field SnackbarManager$Callback BaseTransientBottomBar.managerCallback>
	//    7   39:invokevirtual   #46  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
			return;
	//    8   42:return          

		case 0: // '\0'
			SnackbarManager.getInstance().restoreTimeoutIfPaused(managerCallback);
	//    9   43:invokestatic    #38  <Method SnackbarManager SnackbarManager.getInstance()>
	//   10   46:aload_0         
	//   11   47:getfield        #17  <Field BaseTransientBottomBar this$0>
	//   12   50:getfield        #42  <Field SnackbarManager$Callback BaseTransientBottomBar.managerCallback>
	//   13   53:invokevirtual   #49  <Method void SnackbarManager.restoreTimeoutIfPaused(SnackbarManager$Callback)>
			return;
	//   14   56:return          
		}
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$5()
	{
		this$0 = BaseTransientBottomBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseTransientBottomBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
