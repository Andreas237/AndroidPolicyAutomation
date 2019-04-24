// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;


// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			FragmentedMp4Extractor

private static final class FragmentedMp4Extractor$MetadataSampleInfo
{

	public final long presentationTimeDeltaUs;
	public final int size;

	public FragmentedMp4Extractor$MetadataSampleInfo(long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		presentationTimeDeltaUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #18  <Field long presentationTimeDeltaUs>
		size = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #20  <Field int size>
	//    8   14:return          
	}
}
