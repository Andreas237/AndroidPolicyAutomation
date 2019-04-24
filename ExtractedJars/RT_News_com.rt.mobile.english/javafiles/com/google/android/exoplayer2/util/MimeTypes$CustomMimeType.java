// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;


// Referenced classes of package com.google.android.exoplayer2.util:
//			MimeTypes

private static final class MimeTypes$CustomMimeType
{

	public final String codecPrefix;
	public final String mimeType;
	public final int trackType;

	public MimeTypes$CustomMimeType(String s, String s1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mimeType = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String mimeType>
		codecPrefix = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String codecPrefix>
		trackType = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int trackType>
	//   11   19:return          
	}
}
