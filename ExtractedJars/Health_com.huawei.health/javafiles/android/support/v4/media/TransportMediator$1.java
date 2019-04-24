// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media:
//			TransportMediatorCallback, TransportMediator, TransportPerformer

class TransportMediator$1
	implements TransportMediatorCallback
{

	public long getPlaybackPosition()
	{
		return mCallbacks.onGetCurrentPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field TransportMediator this$0>
	//    2    4:getfield        #24  <Field TransportPerformer TransportMediator.mCallbacks>
	//    3    7:invokevirtual   #29  <Method long TransportPerformer.onGetCurrentPosition()>
	//    4   10:lreturn         
	}

	public void handleAudioFocusChange(int i)
	{
		mCallbacks.onAudioFocusChange(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field TransportMediator this$0>
	//    2    4:getfield        #24  <Field TransportPerformer TransportMediator.mCallbacks>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #34  <Method void TransportPerformer.onAudioFocusChange(int)>
	//    5   11:return          
	}

	public void handleKey(KeyEvent keyevent)
	{
		keyevent.dispatch(mKeyEventCallback);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field TransportMediator this$0>
	//    3    5:getfield        #40  <Field android.view.KeyEvent$Callback TransportMediator.mKeyEventCallback>
	//    4    8:invokevirtual   #46  <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void playbackPositionUpdate(long l)
	{
		mCallbacks.onSeekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field TransportMediator this$0>
	//    2    4:getfield        #24  <Field TransportPerformer TransportMediator.mCallbacks>
	//    3    7:lload_1         
	//    4    8:invokevirtual   #51  <Method void TransportPerformer.onSeekTo(long)>
	//    5   11:return          
	}

	final TransportMediator this$0;

	TransportMediator$1()
	{
		this$0 = TransportMediator.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field TransportMediator this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
