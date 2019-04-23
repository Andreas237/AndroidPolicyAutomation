// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.MediaFormat;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			AtomParsers, TrackEncryptionBox

private static final class AtomParsers$StsdData
{

	public MediaFormat mediaFormat;
	public int nalUnitLengthFieldLength;
	public final TrackEncryptionBox trackEncryptionBoxes[];

	public AtomParsers$StsdData(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		trackEncryptionBoxes = new TrackEncryptionBox[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:anewarray       TrackEncryptionBox[]
	//    5    9:putfield        #22  <Field TrackEncryptionBox[] trackEncryptionBoxes>
		nalUnitLengthFieldLength = -1;
	//    6   12:aload_0         
	//    7   13:iconst_m1       
	//    8   14:putfield        #24  <Field int nalUnitLengthFieldLength>
	//    9   17:return          
	}
}
