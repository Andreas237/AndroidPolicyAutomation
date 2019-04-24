// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			JBIG2SegmentReader

public static class JBIG2SegmentReader$JBIG2Segment
	implements Comparable
{

	public int compareTo(JBIG2SegmentReader$JBIG2Segment jbig2segmentreader$jbig2segment)
	{
		return segmentNumber - jbig2segmentreader$jbig2segment.segmentNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int segmentNumber>
	//    2    4:aload_1         
	//    3    5:getfield        #59  <Field int segmentNumber>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((JBIG2SegmentReader$JBIG2Segment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class JBIG2SegmentReader$JBIG2Segment>
	//    3    5:invokevirtual   #65  <Method int compareTo(JBIG2SegmentReader$JBIG2Segment)>
	//    4    8:ireturn         
	}

	public int countOfReferredToSegments;
	public byte data[];
	public long dataLength;
	public boolean deferredNonRetain;
	public byte headerData[];
	public int page;
	public int page_association_offset;
	public boolean page_association_size;
	public int referredToSegmentNumbers[];
	public final int segmentNumber;
	public boolean segmentRetentionFlags[];
	public int type;

	public JBIG2SegmentReader$JBIG2Segment(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		dataLength = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #34  <Long -1L>
	//    4    8:putfield        #37  <Field long dataLength>
		page = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #39  <Field int page>
		referredToSegmentNumbers = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #41  <Field int[] referredToSegmentNumbers>
		segmentRetentionFlags = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #43  <Field boolean[] segmentRetentionFlags>
		type = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #45  <Field int type>
		deferredNonRetain = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #47  <Field boolean deferredNonRetain>
		countOfReferredToSegments = -1;
	//   20   36:aload_0         
	//   21   37:iconst_m1       
	//   22   38:putfield        #49  <Field int countOfReferredToSegments>
		data = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #51  <Field byte[] data>
		headerData = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #53  <Field byte[] headerData>
		page_association_size = false;
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:putfield        #55  <Field boolean page_association_size>
		page_association_offset = -1;
	//   32   56:aload_0         
	//   33   57:iconst_m1       
	//   34   58:putfield        #57  <Field int page_association_offset>
		segmentNumber = i;
	//   35   61:aload_0         
	//   36   62:iload_1         
	//   37   63:putfield        #59  <Field int segmentNumber>
	//   38   66:return          
	}
}
