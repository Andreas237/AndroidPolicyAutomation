// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompatApi21

class MediaDescriptionCompatApi23 extends MediaDescriptionCompatApi21
{
	static class Builder extends MediaDescriptionCompatApi21.Builder
	{

		public static void setMediaUri(Object obj, Uri uri)
		{
			((android.media.MediaDescription.Builder)obj).setMediaUri(uri);
		//    0    0:aload_0         
		//    1    1:checkcast       #11  <Class android.media.MediaDescription$Builder>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #14  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setMediaUri(Uri)>
		//    4    8:pop             
		//    5    9:return          
		}
	}


	public static Uri getMediaUri(Object obj)
	{
		return ((MediaDescription)obj).getMediaUri();
	//    0    0:aload_0         
	//    1    1:checkcast       #14  <Class MediaDescription>
	//    2    4:invokevirtual   #17  <Method Uri MediaDescription.getMediaUri()>
	//    3    7:areturn         
	}
}
