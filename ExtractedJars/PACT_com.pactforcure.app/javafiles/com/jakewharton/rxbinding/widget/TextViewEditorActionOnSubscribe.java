// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;
import rx.functions.Func1;

final class TextViewEditorActionOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public TextViewEditorActionOnSubscribe(TextView textview, Func1 func1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		view = textview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field TextView view>
		handled = func1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Func1 handled>
	//    8   14:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Subscriber>
	//    3    5:invokevirtual   #39  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #44  <Method void Preconditions.checkUiThread()>
		android.widget.TextView.OnEditorActionListener oneditoractionlistener = new android.widget.TextView.OnEditorActionListener() {

			public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
			{
				if(((Boolean)handled.call(((Object) (Integer.valueOf(i))))).booleanValue())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field TextViewEditorActionOnSubscribe this$0>
			//*   2    4:invokestatic    #31  <Method Func1 TextViewEditorActionOnSubscribe.access$000(TextViewEditorActionOnSubscribe)>
			//*   3    7:iload_2         
			//*   4    8:invokestatic    #37  <Method Integer Integer.valueOf(int)>
			//*   5   11:invokeinterface #42  <Method Object Func1.call(Object)>
			//*   6   16:checkcast       #44  <Class Boolean>
			//*   7   19:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
			//*   8   22:ifeq            48
				{
					if(!subscriber.isUnsubscribed())
			//*   9   25:aload_0         
			//*  10   26:getfield        #21  <Field Subscriber val$subscriber>
			//*  11   29:invokevirtual   #53  <Method boolean Subscriber.isUnsubscribed()>
			//*  12   32:ifne            46
						subscriber.onNext(((Object) (Integer.valueOf(i))));
			//   13   35:aload_0         
			//   14   36:getfield        #21  <Field Subscriber val$subscriber>
			//   15   39:iload_2         
			//   16   40:invokestatic    #37  <Method Integer Integer.valueOf(int)>
			//   17   43:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
					return true;
			//   18   46:iconst_1        
			//   19   47:ireturn         
				} else
				{
					return false;
			//   20   48:iconst_0        
			//   21   49:ireturn         
				}
			}

			final TextViewEditorActionOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = TextViewEditorActionOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TextViewEditorActionOnSubscribe this$0>
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
	//    1    3:new             #9   <Class TextViewEditorActionOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #47  <Method void TextViewEditorActionOnSubscribe$1(TextViewEditorActionOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnEditorActionListener(oneditoractionlistener);
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field TextView view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #53  <Method void TextView.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnEditorActionListener(((android.widget.TextView.OnEditorActionListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field TextViewEditorActionOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method TextView TextViewEditorActionOnSubscribe.access$100(TextViewEditorActionOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void TextView.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
			//    5   11:return          
			}

			final TextViewEditorActionOnSubscribe this$0;

			
			{
				this$0 = TextViewEditorActionOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field TextViewEditorActionOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class TextViewEditorActionOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #56  <Method void TextViewEditorActionOnSubscribe$2(TextViewEditorActionOnSubscribe)>
	//   16   30:invokevirtual   #60  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Func1 handled;
	private final TextView view;


/*
	static Func1 access$000(TextViewEditorActionOnSubscribe textvieweditoractiononsubscribe)
	{
		return textvieweditoractiononsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Func1 handled>
	//    2    4:areturn         
	}

*/


/*
	static TextView access$100(TextViewEditorActionOnSubscribe textvieweditoractiononsubscribe)
	{
		return textvieweditoractiononsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TextView view>
	//    2    4:areturn         
	}

*/
}
