// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.net.Uri;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompatApi23

static class MediaDescriptionCompatApi23$Builder
{

	public static void setMediaUri(Object obj, Uri uri)
	{
		((android.media.MediaDescription.Builder)obj).setMediaUri(uri);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaDescription$Builder>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #19  <Method android.media.MediaDescription$Builder android.media.MediaDescription$Builder.setMediaUri(Uri)>
	//    4    8:pop             
	//    5    9:return          
	}

	private MediaDescriptionCompatApi23$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
