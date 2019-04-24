// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$4
	implements Runnable
{

	public void run()
	{
		MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.access$500(MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.this).onShuffleModeChanged(val$enabled);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
	//    2    4:invokestatic    #36  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field boolean val$enabled>
	//    5   11:invokevirtual   #39  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
	//    6   14:return          
	}

	final MediaControllerCompat.MediaControllerImplApi21.ExtraCallback this$1;
	final boolean val$enabled;

	MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$4()
	{
		this$1 = final_extracallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
		val$enabled = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #27  <Field boolean val$enabled>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #30  <Method void Object()>
	//    8   14:return          
	}
}
