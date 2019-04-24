// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

static class MediaControllerCompat$TransportControlsApi24 extends MediaControllerCompat$TransportControlsApi23
{

	public void prepare()
	{
		MediaControllerCompatApi24$TransportControls.prepare(mControlsObj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mControlsObj>
	//    2    4:invokestatic    #25  <Method void MediaControllerCompatApi24$TransportControls.prepare(Object)>
	//    3    7:return          
	}

	public void prepareFromMediaId(String s, Bundle bundle)
	{
		MediaControllerCompatApi24$TransportControls.prepareFromMediaId(mControlsObj, s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mControlsObj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #30  <Method void MediaControllerCompatApi24$TransportControls.prepareFromMediaId(Object, String, Bundle)>
	//    5    9:return          
	}

	public void prepareFromSearch(String s, Bundle bundle)
	{
		MediaControllerCompatApi24$TransportControls.prepareFromSearch(mControlsObj, s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mControlsObj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #33  <Method void MediaControllerCompatApi24$TransportControls.prepareFromSearch(Object, String, Bundle)>
	//    5    9:return          
	}

	public void prepareFromUri(Uri uri, Bundle bundle)
	{
		MediaControllerCompatApi24$TransportControls.prepareFromUri(mControlsObj, uri, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mControlsObj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #38  <Method void MediaControllerCompatApi24$TransportControls.prepareFromUri(Object, Uri, Bundle)>
	//    5    9:return          
	}

	public MediaControllerCompat$TransportControlsApi24(Object obj)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void MediaControllerCompat$TransportControlsApi23(Object)>
	//    3    5:return          
	}
}
