// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner

class AppCompatSpinner$DropdownPopup$3
	implements android.widget.PopupWindow.OnDismissListener
{

	public void onDismiss()
	{
		ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AppCompatSpinner$DropdownPopup this$1>
	//    2    4:getfield        #32  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
	//    3    7:invokevirtual   #36  <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
	//    4   10:astore_1        
		if(viewtreeobserver != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			viewtreeobserver.removeGlobalOnLayoutListener(val$layoutListener);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
	//   10   20:invokevirtual   #42  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   11   23:return          
	}

	final AppCompatSpinner.DropdownPopup this$1;
	final android.view.stener val$layoutListener;

	AppCompatSpinner$DropdownPopup$3()
	{
		this$1 = final_dropdownpopup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AppCompatSpinner$DropdownPopup this$1>
		val$layoutListener = android.view.stener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener val$layoutListener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
