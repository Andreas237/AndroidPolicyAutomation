// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$MediaBrowserImplApi21$1
	implements Runnable
{

	public void run()
	{
		val$cb.onError(val$mediaId);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field String val$mediaId>
	//    4    8:invokevirtual   #39  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
	//    5   11:return          
	}

	final MediaBrowserCompat.MediaBrowserImplApi21 this$0;
	final MediaBrowserCompat.ItemCallback val$cb;
	final String val$mediaId;

	MediaBrowserCompat$MediaBrowserImplApi21$1()
	{
		this$0 = final_mediabrowserimplapi21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplApi21 this$0>
		val$cb = itemcallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
		val$mediaId = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String val$mediaId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
