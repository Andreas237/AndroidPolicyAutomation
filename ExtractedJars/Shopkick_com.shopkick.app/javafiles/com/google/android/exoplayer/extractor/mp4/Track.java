// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			TrackEncryptionBox

public final class Track
{

	public Track(int i, int j, long l, long l1, long l2, MediaFormat mediaformat, TrackEncryptionBox atrackencryptionbox[], int k, long al[], long al1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #64  <Field int id>
		type = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #66  <Field int type>
		timescale = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #68  <Field long timescale>
		movieTimescale = l1;
	//   11   19:aload_0         
	//   12   20:lload           5
	//   13   22:putfield        #70  <Field long movieTimescale>
		durationUs = l2;
	//   14   25:aload_0         
	//   15   26:lload           7
	//   16   28:putfield        #72  <Field long durationUs>
		mediaFormat = mediaformat;
	//   17   31:aload_0         
	//   18   32:aload           9
	//   19   34:putfield        #74  <Field MediaFormat mediaFormat>
		sampleDescriptionEncryptionBoxes = atrackencryptionbox;
	//   20   37:aload_0         
	//   21   38:aload           10
	//   22   40:putfield        #76  <Field TrackEncryptionBox[] sampleDescriptionEncryptionBoxes>
		nalUnitLengthFieldLength = k;
	//   23   43:aload_0         
	//   24   44:iload           11
	//   25   46:putfield        #78  <Field int nalUnitLengthFieldLength>
		editListDurations = al;
	//   26   49:aload_0         
	//   27   50:aload           12
	//   28   52:putfield        #80  <Field long[] editListDurations>
		editListMediaTimes = al1;
	//   29   55:aload_0         
	//   30   56:aload           13
	//   31   58:putfield        #82  <Field long[] editListMediaTimes>
	//   32   61:return          
	}

	public static final int TYPE_meta = Util.getIntegerCodeForString("meta");
	public static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
	public static final int TYPE_soun = Util.getIntegerCodeForString("soun");
	public static final int TYPE_subt = Util.getIntegerCodeForString("subt");
	public static final int TYPE_text = Util.getIntegerCodeForString("text");
	public static final int TYPE_vide = Util.getIntegerCodeForString("vide");
	public final long durationUs;
	public final long editListDurations[];
	public final long editListMediaTimes[];
	public final int id;
	public final MediaFormat mediaFormat;
	public final long movieTimescale;
	public final int nalUnitLengthFieldLength;
	public final TrackEncryptionBox sampleDescriptionEncryptionBoxes[];
	public final long timescale;
	public final int type;

	static 
	{
	//    0    0:ldc1            #29  <String "vide">
	//    1    2:invokestatic    #35  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #37  <Field int TYPE_vide>
	//    3    8:ldc1            #39  <String "soun">
	//    4   10:invokestatic    #35  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #41  <Field int TYPE_soun>
	//    6   16:ldc1            #43  <String "text">
	//    7   18:invokestatic    #35  <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #45  <Field int TYPE_text>
	//    9   24:ldc1            #47  <String "sbtl">
	//   10   26:invokestatic    #35  <Method int Util.getIntegerCodeForString(String)>
	//   11   29:putstatic       #49  <Field int TYPE_sbtl>
	//   12   32:ldc1            #51  <String "subt">
	//   13   34:invokestatic    #35  <Method int Util.getIntegerCodeForString(String)>
	//   14   37:putstatic       #53  <Field int TYPE_subt>
	//   15   40:ldc1            #55  <String "meta">
	//   16   42:invokestatic    #35  <Method int Util.getIntegerCodeForString(String)>
	//   17   45:putstatic       #57  <Field int TYPE_meta>
	//*  18   48:return          
	}
}
