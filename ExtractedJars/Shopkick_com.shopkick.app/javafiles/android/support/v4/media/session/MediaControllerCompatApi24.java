// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

class MediaControllerCompatApi24
{
	public static class TransportControls
	{

		public static void prepare(Object obj)
		{
			((android.media.session.MediaController.TransportControls)obj).prepare();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:invokevirtual   #18  <Method void android.media.session.MediaController$TransportControls.prepare()>
		//    3    7:return          
		}

		public static void prepareFromMediaId(Object obj, String s, Bundle bundle)
		{
			((android.media.session.MediaController.TransportControls)obj).prepareFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #23  <Method void android.media.session.MediaController$TransportControls.prepareFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public static void prepareFromSearch(Object obj, String s, Bundle bundle)
		{
			((android.media.session.MediaController.TransportControls)obj).prepareFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #26  <Method void android.media.session.MediaController$TransportControls.prepareFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public static void prepareFromUri(Object obj, Uri uri, Bundle bundle)
		{
			((android.media.session.MediaController.TransportControls)obj).prepareFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #31  <Method void android.media.session.MediaController$TransportControls.prepareFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		private TransportControls()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private MediaControllerCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
