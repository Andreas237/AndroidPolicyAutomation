// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class TextViewTextOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public TextViewTextOnSubscribe(TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = textview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field TextView view>
	//    5    9:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class Subscriber>
	//    3    5:invokevirtual   #30  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #35  <Method void Preconditions.checkUiThread()>
		final TextWatcher watcher = new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
			//    0    0:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int i, int j, int k)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #36  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            18
					subscriber.onNext(((Object) (charsequence)));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:invokevirtual   #40  <Method void Subscriber.onNext(Object)>
			//    8   18:return          
			}

			final TextViewTextOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = TextViewTextOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TextViewTextOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class TextViewTextOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void TextViewTextOnSubscribe$1(TextViewTextOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.addTextChangedListener(watcher);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field TextView view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void TextView.addTextChangedListener(TextWatcher)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.removeTextChangedListener(watcher);
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

			
			{
				this$0 = TextViewTextOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextViewTextOnSubscribe this$0>
				watcher = textwatcher;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field TextWatcher val$watcher>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void MainThreadSubscription()>
			//    8   14:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class TextViewTextOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:invokespecial   #47  <Method void TextViewTextOnSubscribe$2(TextViewTextOnSubscribe, TextWatcher)>
	//   17   31:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (view.getText())));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #20  <Field TextView view>
	//   21   39:invokevirtual   #55  <Method CharSequence TextView.getText()>
	//   22   42:invokevirtual   #58  <Method void Subscriber.onNext(Object)>
	//   23   45:return          
	}

	private final TextView view;


/*
	static TextView access$000(TextViewTextOnSubscribe textviewtextonsubscribe)
	{
		return textviewtextonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field TextView view>
	//    2    4:areturn         
	}

*/
}
