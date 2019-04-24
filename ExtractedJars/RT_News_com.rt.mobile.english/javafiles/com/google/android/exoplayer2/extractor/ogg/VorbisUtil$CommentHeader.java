// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;


// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			VorbisUtil

public static final class VorbisUtil$CommentHeader
{

	public final String comments[];
	public final int length;
	public final String vendor;

	public VorbisUtil$CommentHeader(String s, String as[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		vendor = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String vendor>
		comments = as;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String[] comments>
		length = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int length>
	//   11   19:return          
	}
}
