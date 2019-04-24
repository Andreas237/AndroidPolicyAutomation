// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			AtomParsers, TrackEncryptionBox

private static final class AtomParsers$StsdData
{

	public static final int STSD_HEADER_SIZE = 8;
	public Format format;
	public int nalUnitLengthFieldLength;
	public int requiredSampleTransformation;
	public final TrackEncryptionBox trackEncryptionBoxes[];

	public AtomParsers$StsdData(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		trackEncryptionBoxes = new TrackEncryptionBox[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:anewarray       TrackEncryptionBox[]
	//    5    9:putfield        #25  <Field TrackEncryptionBox[] trackEncryptionBoxes>
		requiredSampleTransformation = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #27  <Field int requiredSampleTransformation>
	//    9   17:return          
	}
}
