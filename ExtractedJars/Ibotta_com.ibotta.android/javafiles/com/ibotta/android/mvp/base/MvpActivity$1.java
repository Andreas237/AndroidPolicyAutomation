// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.mvp.ui.view.dialog.NotificationDialog;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpActivity

class MvpActivity$1
	implements com.ibotta.android.mvp.ui.view.dialog.alog.NotificationDialogListener
{

	public void onDismissedNotificationClicked()
	{
		MvpActivity.this.onDismissedNotificationClicked(val$notificationDialog);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MvpActivity this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field NotificationDialog val$notificationDialog>
	//    4    8:invokevirtual   #29  <Method void MvpActivity.onDismissedNotificationClicked(NotificationDialog)>
	//    5   11:return          
	}

	final MvpActivity this$0;
	final NotificationDialog val$notificationDialog;

	MvpActivity$1()
	{
		this$0 = final_mvpactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MvpActivity this$0>
		val$notificationDialog = NotificationDialog.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field NotificationDialog val$notificationDialog>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
