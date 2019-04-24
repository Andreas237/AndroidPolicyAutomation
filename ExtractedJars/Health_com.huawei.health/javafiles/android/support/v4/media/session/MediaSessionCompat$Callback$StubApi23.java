// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

class MediaSessionCompat$Callback$StubApi23 extends MediaSessionCompat$Callback$StubApi21
	implements MediaSessionCompatApi23.Callback
{

	public void onPlayFromUri(Uri uri, Bundle bundle)
	{
		MediaSessionCompat.Callback.this.onPlayFromUri(uri, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
	//    5    9:return          
	}

	final MediaSessionCompat.Callback this$0;

	MediaSessionCompat$Callback$StubApi23()
	{
		this$0 = MediaSessionCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaSessionCompat$Callback this$0>
		super(MediaSessionCompat.Callback.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #20  <Method void MediaSessionCompat$Callback$StubApi21(MediaSessionCompat$Callback)>
	//    6   10:return          
	}
}
