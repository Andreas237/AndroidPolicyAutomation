// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.MediaSession;

class MediaSessionCompatApi22
{

	private MediaSessionCompatApi22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void setRatingType(Object obj, int i)
	{
		((MediaSession)obj).setRatingType(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class MediaSession>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #19  <Method void MediaSession.setRatingType(int)>
	//    4    8:return          
	}
}
