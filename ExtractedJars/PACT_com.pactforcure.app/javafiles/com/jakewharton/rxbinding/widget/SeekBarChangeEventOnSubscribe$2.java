// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SeekBarChangeEventOnSubscribe

class SeekBarChangeEventOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		SeekBarChangeEventOnSubscribe.access$000(SeekBarChangeEventOnSubscribe.this).setOnSeekBarChangeListener(((android.widget.SeekBar$OnSeekBarChangeListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SeekBarChangeEventOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method SeekBar SeekBarChangeEventOnSubscribe.access$000(SeekBarChangeEventOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
	//    5   11:return          
	}

	final SeekBarChangeEventOnSubscribe this$0;

	SeekBarChangeEventOnSubscribe$2()
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
