// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

class MediaControllerCompat$Callback$StubApi26 extends MediaControllerCompat$Callback$StubApi21
	implements MediaControllerCompatApi26.Callback
{

	public void onRepeatModeChanged(int i)
	{
		MediaControllerCompat.Callback.this.onRepeatModeChanged(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #27  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
	//    4    8:return          
	}

	public void onShuffleModeChanged(boolean flag)
	{
		MediaControllerCompat.Callback.this.onShuffleModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #31  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
	//    4    8:return          
	}

	final MediaControllerCompat.Callback this$0;

	private MediaControllerCompat$Callback$StubApi26()
	{
		this$0 = MediaControllerCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaControllerCompat$Callback this$0>
		super(MediaControllerCompat.Callback.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #20  <Method void MediaControllerCompat$Callback$StubApi21(MediaControllerCompat$Callback)>
	//    6   10:return          
	}

	MediaControllerCompat$Callback$StubApi26(MediaControllerCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void MediaControllerCompat$Callback$StubApi26(MediaControllerCompat$Callback)>
	//    3    5:return          
	}
}
