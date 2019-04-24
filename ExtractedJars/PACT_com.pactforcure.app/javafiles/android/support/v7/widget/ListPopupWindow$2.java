// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow

class ListPopupWindow$2
	implements Runnable
{

	public void run()
	{
		View view = getAnchorView();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ListPopupWindow this$0>
	//    2    4:invokevirtual   #26  <Method View ListPopupWindow.getAnchorView()>
	//    3    7:astore_1        
		if(view != null && view.getWindowToken() != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          26
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #32  <Method android.os.IBinder View.getWindowToken()>
	//*   8   16:ifnull          26
			show();
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field ListPopupWindow this$0>
	//   11   23:invokevirtual   #35  <Method void ListPopupWindow.show()>
	//   12   26:return          
	}

	final ListPopupWindow this$0;

	ListPopupWindow$2()
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ListPopupWindow this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
