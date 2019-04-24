// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.Snackbar;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			SnackbarDismissesOnSubscribe

class SnackbarDismissesOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		SnackbarDismissesOnSubscribe.access$000(SnackbarDismissesOnSubscribe.this).setCallback(((android.support.design.widget.Snackbar.Callback) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SnackbarDismissesOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method Snackbar SnackbarDismissesOnSubscribe.access$000(SnackbarDismissesOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method Snackbar Snackbar.setCallback(android.support.design.widget.Snackbar$Callback)>
	//    5   11:pop             
	//    6   12:return          
	}

	final SnackbarDismissesOnSubscribe this$0;

	SnackbarDismissesOnSubscribe$2()
	{
		this$0 = SnackbarDismissesOnSubscribe.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SnackbarDismissesOnSubscribe this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
	//    5    9:return          
	}
}
