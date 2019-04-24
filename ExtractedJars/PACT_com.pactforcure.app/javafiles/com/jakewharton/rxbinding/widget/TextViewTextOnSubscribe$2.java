// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			TextViewTextOnSubscribe

class TextViewTextOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		TextViewTextOnSubscribe.access$000(TextViewTextOnSubscribe.this).removeTextChangedListener(val$watcher);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextViewTextOnSubscribe this$0>
	//    2    4:invokestatic    #28  <Method TextView TextViewTextOnSubscribe.access$000(TextViewTextOnSubscribe)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field TextWatcher val$watcher>
	//    5   11:invokevirtual   #34  <Method void TextView.removeTextChangedListener(TextWatcher)>
	//    6   14:return          
	}

	final TextViewTextOnSubscribe this$0;
	final TextWatcher val$watcher;

	TextViewTextOnSubscribe$2()
	{
		this$0 = final_textviewtextonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextViewTextOnSubscribe this$0>
		val$watcher = TextWatcher.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field TextWatcher val$watcher>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void MainThreadSubscription()>
	//    8   14:return          
	}
}
