// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemSelectionOnSubscribe

class AdapterViewItemSelectionOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		AdapterViewItemSelectionOnSubscribe.access$000(AdapterViewItemSelectionOnSubscribe.this).setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AdapterViewItemSelectionOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method AdapterView AdapterViewItemSelectionOnSubscribe.access$000(AdapterViewItemSelectionOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void AdapterView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//    5   11:return          
	}

	final AdapterViewItemSelectionOnSubscribe this$0;

	AdapterViewItemSelectionOnSubscribe$2()
	{
		this$0 = AdapterViewItemSelectionOnSubscribe.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AdapterViewItemSelectionOnSubscribe this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
	//    5    9:return          
	}
}
