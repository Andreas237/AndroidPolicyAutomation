// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			JBIG2SegmentReader

public static class JBIG2SegmentReader$JBIG2Page
{

	public void addSegment(nt nt)
	{
		segs.put(((Object) (Integer.valueOf(nt.segmentNumber))), ((Object) (nt)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SortedMap segs>
	//    2    4:aload_1         
	//    3    5:getfield        #42  <Field int JBIG2SegmentReader$JBIG2Segment.segmentNumber>
	//    4    8:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//    5   11:aload_1         
	//    6   12:invokeinterface #54  <Method Object SortedMap.put(Object, Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public byte[] getData(boolean flag)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #60  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		Iterator iterator = segs.keySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field SortedMap segs>
	//    6   12:invokeinterface #65  <Method Set SortedMap.keySet()>
	//    7   17:invokeinterface #71  <Method Iterator Set.iterator()>
	//    8   22:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   23:aload_3         
	//   10   24:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            189
			Object obj = ((Object) ((Integer)iterator.next()));
	//   12   32:aload_3         
	//   13   33:invokeinterface #81  <Method Object Iterator.next()>
	//   14   38:checkcast       #44  <Class Integer>
	//   15   41:astore          4
			obj = ((Object) ((nt)segs.get(obj)));
	//   16   43:aload_0         
	//   17   44:getfield        #26  <Field SortedMap segs>
	//   18   47:aload           4
	//   19   49:invokeinterface #85  <Method Object SortedMap.get(Object)>
	//   20   54:checkcast       #39  <Class JBIG2SegmentReader$JBIG2Segment>
	//   21   57:astore          4
			if(!flag || ((nt) (obj)).type != 51 && ((nt) (obj)).type != 49)
	//*  22   59:iload_1         
	//*  23   60:ifeq            83
	//*  24   63:aload           4
	//*  25   65:getfield        #88  <Field int JBIG2SegmentReader$JBIG2Segment.type>
	//*  26   68:bipush          51
	//*  27   70:icmpeq          23
	//*  28   73:aload           4
	//*  29   75:getfield        #88  <Field int JBIG2SegmentReader$JBIG2Segment.type>
	//*  30   78:bipush          49
	//*  31   80:icmpeq          23
			{
				if(flag)
	//*  32   83:iload_1         
	//*  33   84:ifeq            177
				{
					byte abyte0[] = JBIG2SegmentReader.copyByteArray(((nt) (obj)).headerData);
	//   34   87:aload           4
	//   35   89:getfield        #92  <Field byte[] JBIG2SegmentReader$JBIG2Segment.headerData>
	//   36   92:invokestatic    #96  <Method byte[] JBIG2SegmentReader.copyByteArray(byte[])>
	//   37   95:astore          5
					if(((nt) (obj)).page_association_size)
	//*  38   97:aload           4
	//*  39   99:getfield        #100 <Field boolean JBIG2SegmentReader$JBIG2Segment.page_association_size>
	//*  40  102:ifeq            165
					{
						abyte0[((nt) (obj)).page_association_offset] = 0;
	//   41  105:aload           5
	//   42  107:aload           4
	//   43  109:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
	//   44  112:iconst_0        
	//   45  113:bastore         
						abyte0[((nt) (obj)).page_association_offset + 1] = 0;
	//   46  114:aload           5
	//   47  116:aload           4
	//   48  118:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
	//   49  121:iconst_1        
	//   50  122:iadd            
	//   51  123:iconst_0        
	//   52  124:bastore         
						abyte0[((nt) (obj)).page_association_offset + 2] = 0;
	//   53  125:aload           5
	//   54  127:aload           4
	//   55  129:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
	//   56  132:iconst_2        
	//   57  133:iadd            
	//   58  134:iconst_0        
	//   59  135:bastore         
						abyte0[((nt) (obj)).page_association_offset + 3] = 1;
	//   60  136:aload           5
	//   61  138:aload           4
	//   62  140:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
	//   63  143:iconst_3        
	//   64  144:iadd            
	//   65  145:iconst_1        
	//   66  146:bastore         
					} else
	//*  67  147:aload_2         
	//*  68  148:aload           5
	//*  69  150:invokevirtual   #107 <Method void ByteArrayOutputStream.write(byte[])>
	//*  70  153:aload_2         
	//*  71  154:aload           4
	//*  72  156:getfield        #110 <Field byte[] JBIG2SegmentReader$JBIG2Segment.data>
	//*  73  159:invokevirtual   #107 <Method void ByteArrayOutputStream.write(byte[])>
	//*  74  162:goto            23
					{
						abyte0[((nt) (obj)).page_association_offset] = 1;
	//   75  165:aload           5
	//   76  167:aload           4
	//   77  169:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
	//   78  172:iconst_1        
	//   79  173:bastore         
					}
					bytearrayoutputstream.write(abyte0);
				} else
	//*  80  174:goto            147
				{
					bytearrayoutputstream.write(((nt) (obj)).headerData);
	//   81  177:aload_2         
	//   82  178:aload           4
	//   83  180:getfield        #92  <Field byte[] JBIG2SegmentReader$JBIG2Segment.headerData>
	//   84  183:invokevirtual   #107 <Method void ByteArrayOutputStream.write(byte[])>
				}
				bytearrayoutputstream.write(((nt) (obj)).data);
			}
		} while(true);
	//   85  186:goto            153
		bytearrayoutputstream.close();
	//   86  189:aload_2         
	//   87  190:invokevirtual   #113 <Method void ByteArrayOutputStream.close()>
		return bytearrayoutputstream.toByteArray();
	//   88  193:aload_2         
	//   89  194:invokevirtual   #117 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   90  197:areturn         
	}

	public final int page;
	public int pageBitmapHeight;
	public int pageBitmapWidth;
	private final SortedMap segs = new TreeMap();
	private final JBIG2SegmentReader sr;

	public JBIG2SegmentReader$JBIG2Page(int i, JBIG2SegmentReader jbig2segmentreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class TreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void TreeMap()>
	//    6   12:putfield        #26  <Field SortedMap segs>
		pageBitmapWidth = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #28  <Field int pageBitmapWidth>
		pageBitmapHeight = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #30  <Field int pageBitmapHeight>
		page = i;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:putfield        #32  <Field int page>
		sr = jbig2segmentreader;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #34  <Field JBIG2SegmentReader sr>
	//   19   35:return          
	}
}
