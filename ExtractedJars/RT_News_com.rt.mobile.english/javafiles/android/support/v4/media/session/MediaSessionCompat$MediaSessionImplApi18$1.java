// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

class MediaSessionCompat$MediaSessionImplApi18$1
	implements android.media.eListener
{

	public void onPlaybackPositionUpdate(long l)
	{
		postToHandler(18, ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaSessionCompat$MediaSessionImplApi18 this$0>
	//    2    4:bipush          18
	//    3    6:lload_1         
	//    4    7:invokestatic    #32  <Method Long Long.valueOf(long)>
	//    5   10:invokevirtual   #36  <Method void MediaSessionCompat$MediaSessionImplApi18.postToHandler(int, Object)>
	//    6   13:return          
	}

	final MediaSessionCompat.MediaSessionImplApi18 this$0;

	MediaSessionCompat$MediaSessionImplApi18$1()
	{
		this$0 = MediaSessionCompat.MediaSessionImplApi18.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaSessionCompat$MediaSessionImplApi18 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
