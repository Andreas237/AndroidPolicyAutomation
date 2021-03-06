// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class RadioGroupCheckedChangeOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public RadioGroupCheckedChangeOnSubscribe(RadioGroup radiogroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = radiogroup;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field RadioGroup view>
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
		android.widget.RadioGroup.OnCheckedChangeListener oncheckedchangelistener = new android.widget.RadioGroup.OnCheckedChangeListener() {

			public void onCheckedChanged(RadioGroup radiogroup, int i)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            21
					subscriber.onNext(((Object) (Integer.valueOf(i))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:iload_2         
			//    7   15:invokestatic    #39  <Method Integer Integer.valueOf(int)>
			//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//    9   21:return          
			}

			final RadioGroupCheckedChangeOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = RadioGroupCheckedChangeOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RadioGroupCheckedChangeOnSubscribe this$0>
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
	//    1    3:new             #9   <Class RadioGroupCheckedChangeOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void RadioGroupCheckedChangeOnSubscribe$1(RadioGroupCheckedChangeOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnCheckedChangeListener(oncheckedchangelistener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field RadioGroup view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void RadioGroup.setOnCheckedChangeListener(android.widget.RadioGroup$OnCheckedChangeListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnCheckedChangeListener(((android.widget.RadioGroup.OnCheckedChangeListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RadioGroupCheckedChangeOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method RadioGroup RadioGroupCheckedChangeOnSubscribe.access$000(RadioGroupCheckedChangeOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void RadioGroup.setOnCheckedChangeListener(android.widget.RadioGroup$OnCheckedChangeListener)>
			//    5   11:return          
			}

			final RadioGroupCheckedChangeOnSubscribe this$0;

			
			{
				this$0 = RadioGroupCheckedChangeOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RadioGroupCheckedChangeOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class RadioGroupCheckedChangeOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void RadioGroupCheckedChangeOnSubscribe$2(RadioGroupCheckedChangeOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (Integer.valueOf(view.getCheckedRadioButtonId()))));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #20  <Field RadioGroup view>
	//   20   38:invokevirtual   #55  <Method int RadioGroup.getCheckedRadioButtonId()>
	//   21   41:invokestatic    #61  <Method Integer Integer.valueOf(int)>
	//   22   44:invokevirtual   #64  <Method void Subscriber.onNext(Object)>
	//   23   47:return          
	}

	private final RadioGroup view;


/*
	static RadioGroup access$000(RadioGroupCheckedChangeOnSubscribe radiogroupcheckedchangeonsubscribe)
	{
		return radiogroupcheckedchangeonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RadioGroup view>
	//    2    4:areturn         
	}

*/
}
