// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

private class MediaSessionCompat$Callback$StubApi24 extends MediaSessionCompat$Callback$StubApi23
	implements MediaSessionCompatApi24.Callback
{

	public void onPrepare()
	{
		MediaSessionCompat.Callback.this.onPrepare();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #28  <Method void MediaSessionCompat$Callback.onPrepare()>
	//    3    7:return          
	}

	public void onPrepareFromMediaId(String s, Bundle bundle)
	{
		MediaSessionCompat.Callback.this.onPrepareFromMediaId(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #32  <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
	//    5    9:return          
	}

	public void onPrepareFromSearch(String s, Bundle bundle)
	{
		MediaSessionCompat.Callback.this.onPrepareFromSearch(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #35  <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
	//    5    9:return          
	}

	public void onPrepareFromUri(Uri uri, Bundle bundle)
	{
		MediaSessionCompat.Callback.this.onPrepareFromUri(uri, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
	//    5    9:return          
	}

	final MediaSessionCompat.Callback this$0;

	MediaSessionCompat$Callback$StubApi24()
	{
		this$0 = MediaSessionCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaSessionCompat$Callback this$0>
		super(MediaSessionCompat.Callback.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #23  <Method void MediaSessionCompat$Callback$StubApi23(MediaSessionCompat$Callback)>
	//    6   10:return          
	}
}
