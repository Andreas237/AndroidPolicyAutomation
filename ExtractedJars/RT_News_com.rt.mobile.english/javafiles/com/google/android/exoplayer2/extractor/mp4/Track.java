// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			TrackEncryptionBox

public final class Track
{
	public static interface Transformation
		extends Annotation
	{
	}


	public Track(int i, int j, long l, long l1, long l2, Format format1, int k, TrackEncryptionBox atrackencryptionbox[], int i1, long al[], long al1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field int id>
		type = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #37  <Field int type>
		timescale = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #39  <Field long timescale>
		movieTimescale = l1;
	//   11   19:aload_0         
	//   12   20:lload           5
	//   13   22:putfield        #41  <Field long movieTimescale>
		durationUs = l2;
	//   14   25:aload_0         
	//   15   26:lload           7
	//   16   28:putfield        #43  <Field long durationUs>
		format = format1;
	//   17   31:aload_0         
	//   18   32:aload           9
	//   19   34:putfield        #45  <Field Format format>
		sampleTransformation = k;
	//   20   37:aload_0         
	//   21   38:iload           10
	//   22   40:putfield        #47  <Field int sampleTransformation>
		sampleDescriptionEncryptionBoxes = atrackencryptionbox;
	//   23   43:aload_0         
	//   24   44:aload           11
	//   25   46:putfield        #49  <Field TrackEncryptionBox[] sampleDescriptionEncryptionBoxes>
		nalUnitLengthFieldLength = i1;
	//   26   49:aload_0         
	//   27   50:iload           12
	//   28   52:putfield        #51  <Field int nalUnitLengthFieldLength>
		editListDurations = al;
	//   29   55:aload_0         
	//   30   56:aload           13
	//   31   58:putfield        #53  <Field long[] editListDurations>
		editListMediaTimes = al1;
	//   32   61:aload_0         
	//   33   62:aload           14
	//   34   64:putfield        #55  <Field long[] editListMediaTimes>
	//   35   67:return          
	}

	public TrackEncryptionBox getSampleDescriptionEncryptionBox(int i)
	{
		if(sampleDescriptionEncryptionBoxes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field TrackEncryptionBox[] sampleDescriptionEncryptionBoxes>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return sampleDescriptionEncryptionBoxes[i];
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field TrackEncryptionBox[] sampleDescriptionEncryptionBoxes>
	//    7   13:iload_1         
	//    8   14:aaload          
	//    9   15:areturn         
	}

	public static final int TRANSFORMATION_CEA608_CDAT = 1;
	public static final int TRANSFORMATION_NONE = 0;
	public final long durationUs;
	public final long editListDurations[];
	public final long editListMediaTimes[];
	public final Format format;
	public final int id;
	public final long movieTimescale;
	public final int nalUnitLengthFieldLength;
	private final TrackEncryptionBox sampleDescriptionEncryptionBoxes[];
	public final int sampleTransformation;
	public final long timescale;
	public final int type;
}
