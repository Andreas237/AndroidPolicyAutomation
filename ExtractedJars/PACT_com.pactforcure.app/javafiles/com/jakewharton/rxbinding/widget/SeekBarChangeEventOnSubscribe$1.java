// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SeekBarChangeEventOnSubscribe, SeekBarProgressChangeEvent, SeekBarStartChangeEvent, SeekBarStopChangeEvent

class SeekBarChangeEventOnSubscribe$1
	implements android.widget.SeekBar$OnSeekBarChangeListener
{

	public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            23
			val$subscriber.onNext(((Object) (SeekBarProgressChangeEvent.create(seekbar, i, flag))));
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
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            21
			val$subscriber.onNext(((Object) (SeekBarStartChangeEvent.create(seekbar))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_1         
	//    7   15:invokestatic    #50  <Method SeekBarStartChangeEvent SeekBarStartChangeEvent.create(SeekBar)>
	//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
	//    9   21:return          
	}

	public void onStopTrackingTouch(SeekBar seekbar)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            21
			val$subscriber.onNext(((Object) (SeekBarStopChangeEvent.create(seekbar))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_1         
	//    7   15:invokestatic    #56  <Method SeekBarStopChangeEvent SeekBarStopChangeEvent.create(SeekBar)>
	//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
	//    9   21:return          
	}

	final SeekBarChangeEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	SeekBarChangeEventOnSubscribe$1()
	{
		this$0 = final_seekbarchangeeventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SeekBarChangeEventOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
