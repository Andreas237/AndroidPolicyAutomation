// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SeekBarProgressChangeEvent, SeekBarStartChangeEvent, SeekBarStopChangeEvent

final class SeekBarChangeEventOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public SeekBarChangeEventOnSubscribe(SeekBar seekbar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = seekbar;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field SeekBar view>
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
		android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener = new android.widget.SeekBar.OnSeekBarChangeListener() {

			public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            23
					subscriber.onNext(((Object) (SeekBarProgressChangeEvent.create(seekbar, i, flag))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:iload_2         
			//    8   16:iload_3         
			//    9   17:invokestatic    #39  <Method SeekBarProgressChangeEvent SeekBarProgressChangeEvent.create(SeekBar, int, boolean)>
			//   10   20:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//   11   23:return          
			}

			public void onStartTrackingTouch(SeekBar seekbar)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            21
					subscriber.onNext(((Object) (SeekBarStartChangeEvent.create(seekbar))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:invokestatic    #50  <Method SeekBarStartChangeEvent SeekBarStartChangeEvent.create(SeekBar)>
			//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//    9   21:return          
			}

			public void onStopTrackingTouch(SeekBar seekbar)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            21
					subscriber.onNext(((Object) (SeekBarStopChangeEvent.create(seekbar))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:invokestatic    #56  <Method SeekBarStopChangeEvent SeekBarStopChangeEvent.create(SeekBar)>
			//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//    9   21:return          
			}

			final SeekBarChangeEventOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = SeekBarChangeEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SeekBarChangeEventOnSubscribe this$0>
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
	//    1    3:new             #9   <Class SeekBarChangeEventOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void SeekBarChangeEventOnSubscribe$1(SeekBarChangeEventOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnSeekBarChangeListener(onseekbarchangelistener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field SeekBar view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SeekBarChangeEventOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method SeekBar SeekBarChangeEventOnSubscribe.access$000(SeekBarChangeEventOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
			//    5   11:return          
			}

			final SeekBarChangeEventOnSubscribe this$0;

			
			{
				this$0 = SeekBarChangeEventOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SeekBarChangeEventOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class SeekBarChangeEventOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void SeekBarChangeEventOnSubscribe$2(SeekBarChangeEventOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (SeekBarProgressChangeEvent.create(view, view.getProgress(), false))));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #20  <Field SeekBar view>
	//   20   38:aload_0         
	//   21   39:getfield        #20  <Field SeekBar view>
	//   22   42:invokevirtual   #55  <Method int SeekBar.getProgress()>
	//   23   45:iconst_0        
	//   24   46:invokestatic    #61  <Method SeekBarProgressChangeEvent SeekBarProgressChangeEvent.create(SeekBar, int, boolean)>
	//   25   49:invokevirtual   #64  <Method void Subscriber.onNext(Object)>
	//   26   52:return          
	}

	private final SeekBar view;


/*
	static SeekBar access$000(SeekBarChangeEventOnSubscribe seekbarchangeeventonsubscribe)
	{
		return seekbarchangeeventonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SeekBar view>
	//    2    4:areturn         
	}

*/
}
