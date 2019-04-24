// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;


// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			TsPayloadReader

public static final class TsPayloadReader$DvbSubtitleInfo
{

	public final byte initializationData[];
	public final String language;
	public final int type;

	public TsPayloadReader$DvbSubtitleInfo(String s, int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		language = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String language>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int type>
		initializationData = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field byte[] initializationData>
	//   11   19:return          
	}
}
