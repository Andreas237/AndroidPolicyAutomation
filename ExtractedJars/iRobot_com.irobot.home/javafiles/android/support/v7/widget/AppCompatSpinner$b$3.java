// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner

class AppCompatSpinner$b$3
	implements android.widget.Listener
{

	public void onDismiss()
	{
		ViewTreeObserver viewtreeobserver = b.b.getViewTreeObserver();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AppCompatSpinner$b b>
	//    2    4:getfield        #30  <Field AppCompatSpinner AppCompatSpinner$b.b>
	//    3    7:invokevirtual   #34  <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
	//    4   10:astore_1        
		if(viewtreeobserver != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			viewtreeobserver.removeGlobalOnLayoutListener(a);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener a>
	//   10   20:invokevirtual   #40  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   11   23:return          
	}

	final android.view.obalLayoutListener a;
	final AppCompatSpinner.b b;

	AppCompatSpinner$b$3(AppCompatSpinner.b b1, android.view.obalLayoutListener oballayoutlistener)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AppCompatSpinner$b b>
		a = oballayoutlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
