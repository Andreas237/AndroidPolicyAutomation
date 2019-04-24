// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

class MediaSessionCompat$Callback$StubApi26 extends MediaSessionCompat$Callback$StubApi24
	implements MediaSessionCompatApi26.Callback
{

	public void onSetRepeatMode(int i)
	{
		MediaSessionCompat.Callback.this.onSetRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #27  <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
	//    4    8:return          
	}

	public void onSetShuffleModeEnabled(boolean flag)
	{
		MediaSessionCompat.Callback.this.onSetShuffleModeEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #31  <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
	//    4    8:return          
	}

	final MediaSessionCompat.Callback this$0;

	private MediaSessionCompat$Callback$StubApi26()
	{
		this$0 = MediaSessionCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaSessionCompat$Callback this$0>
		super(MediaSessionCompat.Callback.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #20  <Method void MediaSessionCompat$Callback$StubApi24(MediaSessionCompat$Callback)>
	//    6   10:return          
	}

	MediaSessionCompat$Callback$StubApi26(MediaSessionCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void MediaSessionCompat$Callback$StubApi26(MediaSessionCompat$Callback)>
	//    3    5:return          
	}
}
