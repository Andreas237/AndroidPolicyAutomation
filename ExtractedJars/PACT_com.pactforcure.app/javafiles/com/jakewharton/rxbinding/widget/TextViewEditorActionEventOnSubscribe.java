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

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			TextViewEditorActionEvent

final class TextViewEditorActionEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public TextViewEditorActionEventOnSubscribe(TextView textview, Func1 func1)
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
				textview = ((TextView) (TextViewEditorActionEvent.create(textview, i, keyevent)));
			//    0    0:aload_1         
			//    1    1:iload_2         
			//    2    2:aload_3         
			//    3    3:invokestatic    #33  <Method TextViewEditorActionEvent TextViewEditorActionEvent.create(TextView, int, KeyEvent)>
			//    4    6:astore_1        
				if(((Boolean)handled.call(((Object) (textview)))).booleanValue())
			//*   5    7:aload_0         
			//*   6    8:getfield        #19  <Field TextViewEditorActionEventOnSubscribe this$0>
			//*   7   11:invokestatic    #37  <Method Func1 TextViewEditorActionEventOnSubscribe.access$000(TextViewEditorActionEventOnSubscribe)>
			//*   8   14:aload_1         
			//*   9   15:invokeinterface #42  <Method Object Func1.call(Object)>
			//*  10   20:checkcast       #44  <Class Boolean>
			//*  11   23:invokevirtual   #48  <Method boolean Boolean.booleanValue()>
			//*  12   26:ifeq            49
				{
					if(!subscriber.isUnsubscribed())
			//*  13   29:aload_0         
			//*  14   30:getfield        #21  <Field Subscriber val$subscriber>
			//*  15   33:invokevirtual   #53  <Method boolean Subscriber.isUnsubscribed()>
			//*  16   36:ifne            47
						subscriber.onNext(((Object) (textview)));
			//   17   39:aload_0         
			//   18   40:getfield        #21  <Field Subscriber val$subscriber>
			//   19   43:aload_1         
			//   20   44:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
					return true;
			//   21   47:iconst_1        
			//   22   48:ireturn         
				} else
				{
					return false;
			//   23   49:iconst_0        
			//   24   50:ireturn         
				}
			}

			final TextViewEditorActionEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = TextViewEditorActionEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TextViewEditorActionEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class TextViewEditorActionEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #47  <Method void TextViewEditorActionEventOnSubscribe$1(TextViewEditorActionEventOnSubscribe, Subscriber)>
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
			//    1    1:getfield        #15  <Field TextViewEditorActionEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method TextView TextViewEditorActionEventOnSubscribe.access$100(TextViewEditorActionEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void TextView.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
			//    5   11:return          
			}

			final TextViewEditorActionEventOnSubscribe this$0;

			
			{
				this$0 = TextViewEditorActionEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field TextViewEditorActionEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class TextViewEditorActionEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #56  <Method void TextViewEditorActionEventOnSubscribe$2(TextViewEditorActionEventOnSubscribe)>
	//   16   30:invokevirtual   #60  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Func1 handled;
	private final TextView view;


/*
	static Func1 access$000(TextViewEditorActionEventOnSubscribe textvieweditoractioneventonsubscribe)
	{
		return textvieweditoractioneventonsubscribe.handled;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Func1 handled>
	//    2    4:areturn         
	}

*/


/*
	static TextView access$100(TextViewEditorActionEventOnSubscribe textvieweditoractioneventonsubscribe)
	{
		return textvieweditoractioneventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TextView view>
	//    2    4:areturn         
	}

*/
}
