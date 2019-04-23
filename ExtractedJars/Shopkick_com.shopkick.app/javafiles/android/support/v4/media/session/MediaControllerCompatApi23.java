// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

class MediaControllerCompatApi23
{
	public static class TransportControls
	{

		public static void playFromUri(Object obj, Uri uri, Bundle bundle)
		{
			((android.media.session.MediaController.TransportControls)obj).playFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #19  <Method void android.media.session.MediaController$TransportControls.playFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		private TransportControls()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private MediaControllerCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
