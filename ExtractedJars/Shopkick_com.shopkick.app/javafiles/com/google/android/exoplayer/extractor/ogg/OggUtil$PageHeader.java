// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;


// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			OggUtil

public static final class OggUtil$PageHeader
{

	public void reset()
	{
		revision = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #30  <Field int revision>
		type = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #32  <Field int type>
		granulePosition = 0L;
	//    6   10:aload_0         
	//    7   11:lconst_0        
	//    8   12:putfield        #34  <Field long granulePosition>
		streamSerialNumber = 0L;
	//    9   15:aload_0         
	//   10   16:lconst_0        
	//   11   17:putfield        #36  <Field long streamSerialNumber>
		pageSequenceNumber = 0L;
	//   12   20:aload_0         
	//   13   21:lconst_0        
	//   14   22:putfield        #38  <Field long pageSequenceNumber>
		pageChecksum = 0L;
	//   15   25:aload_0         
	//   16   26:lconst_0        
	//   17   27:putfield        #40  <Field long pageChecksum>
		pageSegmentCount = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #42  <Field int pageSegmentCount>
		headerSize = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #44  <Field int headerSize>
		bodySize = 0;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #46  <Field int bodySize>
	//   27   45:return          
	}

	public int bodySize;
	public long granulePosition;
	public int headerSize;
	public final int laces[] = new int[255];
	public long pageChecksum;
	public int pageSegmentCount;
	public long pageSequenceNumber;
	public int revision;
	public long streamSerialNumber;
	public int type;

	public OggUtil$PageHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          255
	//    4    8:newarray        int[]
	//    5   10:putfield        #26  <Field int[] laces>
	//    6   13:return          
	}
}
