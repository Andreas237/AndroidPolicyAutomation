// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;


public abstract class HlsPlaylist
{

	protected HlsPlaylist(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		baseUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String baseUri>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int type>
	//    8   14:return          
	}

	public static final int TYPE_MASTER = 0;
	public static final int TYPE_MEDIA = 1;
	public final String baseUri;
	public final int type;
}
