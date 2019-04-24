// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.*;

public class JBIG2SegmentReader
{
	public static class JBIG2Page
	{

		public void addSegment(JBIG2Segment jbig2segment)
		{
			segs.put(((Object) (Integer.valueOf(jbig2segment.segmentNumber))), ((Object) (jbig2segment)));
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
				obj = ((Object) ((JBIG2Segment)segs.get(obj)));
		//   16   43:aload_0         
		//   17   44:getfield        #26  <Field SortedMap segs>
		//   18   47:aload           4
		//   19   49:invokeinterface #85  <Method Object SortedMap.get(Object)>
		//   20   54:checkcast       #39  <Class JBIG2SegmentReader$JBIG2Segment>
		//   21   57:astore          4
				if(!flag || ((JBIG2Segment) (obj)).type != 51 && ((JBIG2Segment) (obj)).type != 49)
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
						byte abyte0[] = JBIG2SegmentReader.copyByteArray(((JBIG2Segment) (obj)).headerData);
		//   34   87:aload           4
		//   35   89:getfield        #92  <Field byte[] JBIG2SegmentReader$JBIG2Segment.headerData>
		//   36   92:invokestatic    #96  <Method byte[] JBIG2SegmentReader.copyByteArray(byte[])>
		//   37   95:astore          5
						if(((JBIG2Segment) (obj)).page_association_size)
		//*  38   97:aload           4
		//*  39   99:getfield        #100 <Field boolean JBIG2SegmentReader$JBIG2Segment.page_association_size>
		//*  40  102:ifeq            165
						{
							abyte0[((JBIG2Segment) (obj)).page_association_offset] = 0;
		//   41  105:aload           5
		//   42  107:aload           4
		//   43  109:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
		//   44  112:iconst_0        
		//   45  113:bastore         
							abyte0[((JBIG2Segment) (obj)).page_association_offset + 1] = 0;
		//   46  114:aload           5
		//   47  116:aload           4
		//   48  118:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
		//   49  121:iconst_1        
		//   50  122:iadd            
		//   51  123:iconst_0        
		//   52  124:bastore         
							abyte0[((JBIG2Segment) (obj)).page_association_offset + 2] = 0;
		//   53  125:aload           5
		//   54  127:aload           4
		//   55  129:getfield        #103 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
		//   56  132:iconst_2        
		//   57  133:iadd            
		//   58  134:iconst_0        
		//   59  135:bastore         
							abyte0[((JBIG2Segment) (obj)).page_association_offset + 3] = 1;
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
							abyte0[((JBIG2Segment) (obj)).page_association_offset] = 1;
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
						bytearrayoutputstream.write(((JBIG2Segment) (obj)).headerData);
		//   81  177:aload_2         
		//   82  178:aload           4
		//   83  180:getfield        #92  <Field byte[] JBIG2SegmentReader$JBIG2Segment.headerData>
		//   84  183:invokevirtual   #107 <Method void ByteArrayOutputStream.write(byte[])>
					}
					bytearrayoutputstream.write(((JBIG2Segment) (obj)).data);
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

		public JBIG2Page(int i, JBIG2SegmentReader jbig2segmentreader)
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

	public static class JBIG2Segment
		implements Comparable
	{

		public int compareTo(JBIG2Segment jbig2segment)
		{
			return segmentNumber - jbig2segment.segmentNumber;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field int segmentNumber>
		//    2    4:aload_1         
		//    3    5:getfield        #59  <Field int segmentNumber>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((JBIG2Segment)obj);
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

		public JBIG2Segment(int i)
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


	public JBIG2SegmentReader(RandomAccessFileOrArray randomaccessfileorarray)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #77  <Class TreeMap>
	//    4    8:dup             
	//    5    9:invokespecial   #78  <Method void TreeMap()>
	//    6   12:putfield        #80  <Field SortedMap segments>
	//    7   15:aload_0         
	//    8   16:new             #77  <Class TreeMap>
	//    9   19:dup             
	//   10   20:invokespecial   #78  <Method void TreeMap()>
	//   11   23:putfield        #82  <Field SortedMap pages>
	//   12   26:aload_0         
	//   13   27:new             #84  <Class TreeSet>
	//   14   30:dup             
	//   15   31:invokespecial   #85  <Method void TreeSet()>
	//   16   34:putfield        #87  <Field SortedSet globals>
		number_of_pages = -1;
	//   17   37:aload_0         
	//   18   38:iconst_m1       
	//   19   39:putfield        #89  <Field int number_of_pages>
		read = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #91  <Field boolean read>
		ra = randomaccessfileorarray;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:putfield        #93  <Field RandomAccessFileOrArray ra>
	//   26   52:return          
	}

	public static byte[] copyByteArray(byte abyte0[])
	{
		byte abyte1[] = new byte[abyte0.length];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:newarray        byte[]
	//    3    4:astore_1        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, abyte0.length);
	//    4    5:aload_0         
	//    5    6:iconst_0        
	//    6    7:aload_1         
	//    7    8:iconst_0        
	//    8    9:aload_0         
	//    9   10:arraylength     
	//   10   11:invokestatic    #103 <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//   11   14:aload_1         
	//   12   15:areturn         
	}

	public byte[] getGlobal(boolean flag)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #107 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		Iterator iterator = globals.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field SortedSet globals>
	//    6   12:invokeinterface #114 <Method Iterator SortedSet.iterator()>
	//    7   17:astore_3        
_L3:
		JBIG2Segment jbig2segment;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_97;
	//    8   18:aload_3         
	//    9   19:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            97
		jbig2segment = (JBIG2Segment)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #124 <Method Object Iterator.next()>
	//   13   33:checkcast       #9   <Class JBIG2SegmentReader$JBIG2Segment>
	//   14   36:astore          4
		if(!flag) goto _L2; else goto _L1
	//   15   38:iload_1         
	//   16   39:ifeq            62
_L1:
		if(jbig2segment.type == 51 || jbig2segment.type == 49) goto _L3; else goto _L2
	//   17   42:aload           4
	//   18   44:getfield        #127 <Field int JBIG2SegmentReader$JBIG2Segment.type>
	//   19   47:bipush          51
	//   20   49:icmpeq          18
	//   21   52:aload           4
	//   22   54:getfield        #127 <Field int JBIG2SegmentReader$JBIG2Segment.type>
	//   23   57:bipush          49
	//   24   59:icmpeq          18
_L2:
		IOException ioexception;
		bytearrayoutputstream.write(jbig2segment.headerData);
	//   25   62:aload_2         
	//   26   63:aload           4
	//   27   65:getfield        #131 <Field byte[] JBIG2SegmentReader$JBIG2Segment.headerData>
	//   28   68:invokevirtual   #135 <Method void ByteArrayOutputStream.write(byte[])>
		bytearrayoutputstream.write(jbig2segment.data);
	//   29   71:aload_2         
	//   30   72:aload           4
	//   31   74:getfield        #138 <Field byte[] JBIG2SegmentReader$JBIG2Segment.data>
	//   32   77:invokevirtual   #135 <Method void ByteArrayOutputStream.write(byte[])>
		  goto _L3
	//*  33   80:goto            18
	//*  34   83:astore_3        
	//*  35   84:aload_3         
	//*  36   85:invokevirtual   #141 <Method void IOException.printStackTrace()>
	//*  37   88:aload_2         
	//*  38   89:invokevirtual   #145 <Method int ByteArrayOutputStream.size()>
	//*  39   92:ifgt            104
	//*  40   95:aconst_null     
	//*  41   96:areturn         
		try
		{
			bytearrayoutputstream.close();
	//   42   97:aload_2         
	//   43   98:invokevirtual   #148 <Method void ByteArrayOutputStream.close()>
		}
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			ioexception.printStackTrace();
		}
		if(bytearrayoutputstream.size() <= 0)
			return null;
		else
	//*  44  101:goto            88
			return bytearrayoutputstream.toByteArray();
	//   45  104:aload_2         
	//   46  105:invokevirtual   #152 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   47  108:areturn         
	}

	public JBIG2Page getPage(int i)
	{
		return (JBIG2Page)pages.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field SortedMap pages>
	//    2    4:iload_1         
	//    3    5:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #166 <Method Object SortedMap.get(Object)>
	//    5   13:checkcast       #6   <Class JBIG2SegmentReader$JBIG2Page>
	//    6   16:areturn         
	}

	public int getPageHeight(int i)
	{
		return ((JBIG2Page)pages.get(((Object) (Integer.valueOf(i))))).pageBitmapHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field SortedMap pages>
	//    2    4:iload_1         
	//    3    5:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #166 <Method Object SortedMap.get(Object)>
	//    5   13:checkcast       #6   <Class JBIG2SegmentReader$JBIG2Page>
	//    6   16:getfield        #171 <Field int JBIG2SegmentReader$JBIG2Page.pageBitmapHeight>
	//    7   19:ireturn         
	}

	public int getPageWidth(int i)
	{
		return ((JBIG2Page)pages.get(((Object) (Integer.valueOf(i))))).pageBitmapWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field SortedMap pages>
	//    2    4:iload_1         
	//    3    5:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #166 <Method Object SortedMap.get(Object)>
	//    5   13:checkcast       #6   <Class JBIG2SegmentReader$JBIG2Page>
	//    6   16:getfield        #175 <Field int JBIG2SegmentReader$JBIG2Page.pageBitmapWidth>
	//    7   19:ireturn         
	}

	public int numberOfPages()
	{
		return pages.size();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field SortedMap pages>
	//    2    4:invokeinterface #177 <Method int SortedMap.size()>
	//    3    9:ireturn         
	}

	public void read()
		throws IOException
	{
		if(read)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field boolean read>
	//*   2    4:ifeq            24
			throw new IllegalStateException(MessageLocalization.getComposedMessage("already.attempted.a.read.on.this.jbig2.file", new Object[0]));
	//    3    7:new             #179 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #181 <String "already.attempted.a.read.on.this.jbig2.file">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #187 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #190 <Method void IllegalStateException(String)>
	//   10   23:athrow          
		read = true;
	//   11   24:aload_0         
	//   12   25:iconst_1        
	//   13   26:putfield        #91  <Field boolean read>
		readFileHeader();
	//   14   29:aload_0         
	//   15   30:invokevirtual   #193 <Method void readFileHeader()>
		if(sequential)
	//*  16   33:aload_0         
	//*  17   34:getfield        #195 <Field boolean sequential>
	//*  18   37:ifeq            87
		{
			do
			{
				JBIG2Segment jbig2segment = readHeader();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #199 <Method JBIG2SegmentReader$JBIG2Segment readHeader()>
	//   21   44:astore_1        
				readSegment(jbig2segment);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:invokevirtual   #203 <Method void readSegment(JBIG2SegmentReader$JBIG2Segment)>
				segments.put(((Object) (Integer.valueOf(jbig2segment.segmentNumber))), ((Object) (jbig2segment)));
	//   25   50:aload_0         
	//   26   51:getfield        #80  <Field SortedMap segments>
	//   27   54:aload_1         
	//   28   55:getfield        #206 <Field int JBIG2SegmentReader$JBIG2Segment.segmentNumber>
	//   29   58:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   30   61:aload_1         
	//   31   62:invokeinterface #210 <Method Object SortedMap.put(Object, Object)>
	//   32   67:pop             
			} while(ra.getFilePointer() < ra.length());
	//   33   68:aload_0         
	//   34   69:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   35   72:invokevirtual   #216 <Method long RandomAccessFileOrArray.getFilePointer()>
	//   36   75:aload_0         
	//   37   76:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   38   79:invokevirtual   #219 <Method long RandomAccessFileOrArray.length()>
	//   39   82:lcmp            
	//   40   83:iflt            40
		} else
	//*  41   86:return          
		{
			Object obj;
			do
			{
				obj = ((Object) (readHeader()));
	//   42   87:aload_0         
	//   43   88:invokevirtual   #199 <Method JBIG2SegmentReader$JBIG2Segment readHeader()>
	//   44   91:astore_1        
				segments.put(((Object) (Integer.valueOf(((JBIG2Segment) (obj)).segmentNumber))), obj);
	//   45   92:aload_0         
	//   46   93:getfield        #80  <Field SortedMap segments>
	//   47   96:aload_1         
	//   48   97:getfield        #206 <Field int JBIG2SegmentReader$JBIG2Segment.segmentNumber>
	//   49  100:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   50  103:aload_1         
	//   51  104:invokeinterface #210 <Method Object SortedMap.put(Object, Object)>
	//   52  109:pop             
			} while(((JBIG2Segment) (obj)).type != 51);
	//   53  110:aload_1         
	//   54  111:getfield        #127 <Field int JBIG2SegmentReader$JBIG2Segment.type>
	//   55  114:bipush          51
	//   56  116:icmpne          87
			obj = ((Object) (segments.keySet().iterator()));
	//   57  119:aload_0         
	//   58  120:getfield        #80  <Field SortedMap segments>
	//   59  123:invokeinterface #223 <Method Set SortedMap.keySet()>
	//   60  128:invokeinterface #226 <Method Iterator Set.iterator()>
	//   61  133:astore_1        
			while(((Iterator) (obj)).hasNext()) 
	//*  62  134:aload_1         
	//*  63  135:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//*  64  140:ifeq            86
				readSegment((JBIG2Segment)segments.get(((Iterator) (obj)).next()));
	//   65  143:aload_0         
	//   66  144:aload_0         
	//   67  145:getfield        #80  <Field SortedMap segments>
	//   68  148:aload_1         
	//   69  149:invokeinterface #124 <Method Object Iterator.next()>
	//   70  154:invokeinterface #166 <Method Object SortedMap.get(Object)>
	//   71  159:checkcast       #9   <Class JBIG2SegmentReader$JBIG2Segment>
	//   72  162:invokevirtual   #203 <Method void readSegment(JBIG2SegmentReader$JBIG2Segment)>
		}
	//*  73  165:goto            134
	}

	void readFileHeader()
		throws IOException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		ra.seek(0L);
	//    2    2:aload_0         
	//    3    3:getfield        #93  <Field RandomAccessFileOrArray ra>
	//    4    6:lconst_0        
	//    5    7:invokevirtual   #230 <Method void RandomAccessFileOrArray.seek(long)>
		byte abyte0[] = new byte[8];
	//    6   10:bipush          8
	//    7   12:newarray        byte[]
	//    8   14:astore          4
		ra.read(abyte0);
	//    9   16:aload_0         
	//   10   17:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   11   20:aload           4
	//   12   22:invokevirtual   #233 <Method int RandomAccessFileOrArray.read(byte[])>
	//   13   25:pop             
		for(int i = 0; i < abyte0.length; i++)
	//*  14   26:iconst_0        
	//*  15   27:istore_1        
	//*  16   28:iload_1         
	//*  17   29:aload           4
	//*  18   31:arraylength     
	//*  19   32:icmpge          111
			if(abyte0[i] != (new byte[] {
	-105, 74, 66, 50, 13, 10, 26, 10
})[i])
	//*  20   35:aload           4
	//*  21   37:iload_1         
	//*  22   38:baload          
	//*  23   39:bipush          8
	//*  24   41:newarray        byte[]
	//*  25   43:dup             
	//*  26   44:iconst_0        
	//*  27   45:ldc1            #234 <Int -105>
	//*  28   47:bastore         
	//*  29   48:dup             
	//*  30   49:iconst_1        
	//*  31   50:ldc1            #235 <Int 74>
	//*  32   52:bastore         
	//*  33   53:dup             
	//*  34   54:iconst_2        
	//*  35   55:ldc1            #236 <Int 66>
	//*  36   57:bastore         
	//*  37   58:dup             
	//*  38   59:iconst_3        
	//*  39   60:ldc1            #17  <Int 50>
	//*  40   62:bastore         
	//*  41   63:dup             
	//*  42   64:iconst_4        
	//*  43   65:ldc1            #237 <Int 13>
	//*  44   67:bastore         
	//*  45   68:dup             
	//*  46   69:iconst_5        
	//*  47   70:ldc1            #238 <Int 10>
	//*  48   72:bastore         
	//*  49   73:dup             
	//*  50   74:bipush          6
	//*  51   76:ldc1            #239 <Int 26>
	//*  52   78:bastore         
	//*  53   79:dup             
	//*  54   80:bipush          7
	//*  55   82:ldc1            #238 <Int 10>
	//*  56   84:bastore         
	//*  57   85:iload_1         
	//*  58   86:baload          
	//*  59   87:icmpeq          104
				throw new IllegalStateException(MessageLocalization.getComposedMessage("file.header.idstring.not.good.at.byte.1", i));
	//   60   90:new             #179 <Class IllegalStateException>
	//   61   93:dup             
	//   62   94:ldc1            #241 <String "file.header.idstring.not.good.at.byte.1">
	//   63   96:iload_1         
	//   64   97:invokestatic    #244 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   65  100:invokespecial   #190 <Method void IllegalStateException(String)>
	//   66  103:athrow          

	//   67  104:iload_1         
	//   68  105:iconst_1        
	//   69  106:iadd            
	//   70  107:istore_1        
	//*  71  108:goto            28
		int j = ra.read();
	//   72  111:aload_0         
	//   73  112:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   74  115:invokevirtual   #246 <Method int RandomAccessFileOrArray.read()>
	//   75  118:istore_1        
		boolean flag;
		if((j & 1) == 1)
	//*  76  119:iload_1         
	//*  77  120:iconst_1        
	//*  78  121:iand            
	//*  79  122:iconst_1        
	//*  80  123:icmpne          171
			flag = true;
	//   81  126:iconst_1        
	//   82  127:istore_2        
		else
	//*  83  128:aload_0         
	//*  84  129:iload_2         
	//*  85  130:putfield        #195 <Field boolean sequential>
	//*  86  133:iload_1         
	//*  87  134:iconst_2        
	//*  88  135:iand            
	//*  89  136:ifne            176
	//*  90  139:iload_3         
	//*  91  140:istore_2        
	//*  92  141:aload_0         
	//*  93  142:iload_2         
	//*  94  143:putfield        #248 <Field boolean number_of_pages_known>
	//*  95  146:iload_1         
	//*  96  147:sipush          252
	//*  97  150:iand            
	//*  98  151:ifeq            181
	//*  99  154:new             #179 <Class IllegalStateException>
	//* 100  157:dup             
	//* 101  158:ldc1            #250 <String "file.header.flags.bits.2.7.not.0">
	//* 102  160:iconst_0        
	//* 103  161:anewarray       Object[]
	//* 104  164:invokestatic    #187 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 105  167:invokespecial   #190 <Method void IllegalStateException(String)>
	//* 106  170:athrow          
			flag = false;
	//  107  171:iconst_0        
	//  108  172:istore_2        
		sequential = flag;
		if((j & 2) == 0)
			flag = flag1;
		else
	//* 109  173:goto            128
			flag = false;
	//  110  176:iconst_0        
	//  111  177:istore_2        
		number_of_pages_known = flag;
		if((j & 0xfc) != 0)
			throw new IllegalStateException(MessageLocalization.getComposedMessage("file.header.flags.bits.2.7.not.0", new Object[0]));
	//* 112  178:goto            141
		if(number_of_pages_known)
	//* 113  181:aload_0         
	//* 114  182:getfield        #248 <Field boolean number_of_pages_known>
	//* 115  185:ifeq            199
			number_of_pages = ra.readInt();
	//  116  188:aload_0         
	//  117  189:aload_0         
	//  118  190:getfield        #93  <Field RandomAccessFileOrArray ra>
	//  119  193:invokevirtual   #253 <Method int RandomAccessFileOrArray.readInt()>
	//  120  196:putfield        #89  <Field int number_of_pages>
	//  121  199:return          
	}

	JBIG2Segment readHeader()
		throws IOException
	{
		int i;
		int k;
		int i1;
		int j1;
		int k1;
		int l1;
		boolean flag;
		int ai[];
		JBIG2Segment jbig2segment;
		k1 = (int)ra.getFilePointer();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RandomAccessFileOrArray ra>
	//    2    4:invokevirtual   #216 <Method long RandomAccessFileOrArray.getFilePointer()>
	//    3    7:l2i             
	//    4    8:istore          5
		l1 = ra.readInt();
	//    5   10:aload_0         
	//    6   11:getfield        #93  <Field RandomAccessFileOrArray ra>
	//    7   14:invokevirtual   #253 <Method int RandomAccessFileOrArray.readInt()>
	//    8   17:istore          6
		jbig2segment = new JBIG2Segment(l1);
	//    9   19:new             #9   <Class JBIG2SegmentReader$JBIG2Segment>
	//   10   22:dup             
	//   11   23:iload           6
	//   12   25:invokespecial   #256 <Method void JBIG2SegmentReader$JBIG2Segment(int)>
	//   13   28:astore          11
		i = ra.read();
	//   14   30:aload_0         
	//   15   31:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   16   34:invokevirtual   #246 <Method int RandomAccessFileOrArray.read()>
	//   17   37:istore_1        
		if((i & 0x80) == 128)
	//*  18   38:iload_1         
	//*  19   39:sipush          128
	//*  20   42:iand            
	//*  21   43:sipush          128
	//*  22   46:icmpne          256
			flag = true;
	//   23   49:iconst_1        
	//   24   50:istore          7
		else
	//*  25   52:aload           11
	//*  26   54:iload           7
	//*  27   56:putfield        #259 <Field boolean JBIG2SegmentReader$JBIG2Segment.deferredNonRetain>
	//*  28   59:iload_1         
	//*  29   60:bipush          64
	//*  30   62:iand            
	//*  31   63:bipush          64
	//*  32   65:icmpne          262
	//*  33   68:iconst_1        
	//*  34   69:istore          7
	//*  35   71:aload           11
	//*  36   73:iload_1         
	//*  37   74:bipush          63
	//*  38   76:iand            
	//*  39   77:putfield        #127 <Field int JBIG2SegmentReader$JBIG2Segment.type>
	//*  40   80:aload_0         
	//*  41   81:getfield        #93  <Field RandomAccessFileOrArray ra>
	//*  42   84:invokevirtual   #246 <Method int RandomAccessFileOrArray.read()>
	//*  43   87:istore          4
	//*  44   89:iload           4
	//*  45   91:sipush          224
	//*  46   94:iand            
	//*  47   95:iconst_5        
	//*  48   96:ishr            
	//*  49   97:istore_3        
	//*  50   98:aconst_null     
	//*  51   99:astore          9
	//*  52  101:iload_3         
	//*  53  102:bipush          7
	//*  54  104:icmpne          274
	//*  55  107:aload_0         
	//*  56  108:getfield        #93  <Field RandomAccessFileOrArray ra>
	//*  57  111:aload_0         
	//*  58  112:getfield        #93  <Field RandomAccessFileOrArray ra>
	//*  59  115:invokevirtual   #216 <Method long RandomAccessFileOrArray.getFilePointer()>
	//*  60  118:lconst_1        
	//*  61  119:lsub            
	//*  62  120:invokevirtual   #230 <Method void RandomAccessFileOrArray.seek(long)>
	//*  63  123:aload_0         
	//*  64  124:getfield        #93  <Field RandomAccessFileOrArray ra>
	//*  65  127:invokevirtual   #253 <Method int RandomAccessFileOrArray.readInt()>
	//*  66  130:ldc2            #260 <Int 0x1fffffff>
	//*  67  133:iand            
	//*  68  134:istore_3        
	//*  69  135:iload_3         
	//*  70  136:iconst_1        
	//*  71  137:iadd            
	//*  72  138:newarray        boolean[]
	//*  73  140:astore          9
	//*  74  142:iconst_0        
	//*  75  143:istore_1        
	//*  76  144:iconst_0        
	//*  77  145:istore_2        
	//*  78  146:iload_1         
	//*  79  147:bipush          8
	//*  80  149:irem            
	//*  81  150:istore          4
	//*  82  152:iload           4
	//*  83  154:ifne            165
	//*  84  157:aload_0         
	//*  85  158:getfield        #93  <Field RandomAccessFileOrArray ra>
	//*  86  161:invokevirtual   #246 <Method int RandomAccessFileOrArray.read()>
	//*  87  164:istore_2        
	//*  88  165:iconst_1        
	//*  89  166:iload           4
	//*  90  168:ishl            
	//*  91  169:iload_2         
	//*  92  170:iand            
	//*  93  171:iload           4
	//*  94  173:ishr            
	//*  95  174:iconst_1        
	//*  96  175:icmpne          268
	//*  97  178:iconst_1        
	//*  98  179:istore          8
	//*  99  181:aload           9
	//* 100  183:iload_1         
	//* 101  184:iload           8
	//* 102  186:bastore         
	//* 103  187:iload_1         
	//* 104  188:iconst_1        
	//* 105  189:iadd            
	//* 106  190:istore          4
	//* 107  192:iload           4
	//* 108  194:istore_1        
	//* 109  195:iload           4
	//* 110  197:iload_3         
	//* 111  198:icmple          146
	//* 112  201:iload_3         
	//* 113  202:istore_1        
	//* 114  203:aload           11
	//* 115  205:aload           9
	//* 116  207:putfield        #264 <Field boolean[] JBIG2SegmentReader$JBIG2Segment.segmentRetentionFlags>
	//* 117  210:aload           11
	//* 118  212:iload_1         
	//* 119  213:putfield        #267 <Field int JBIG2SegmentReader$JBIG2Segment.countOfReferredToSegments>
	//* 120  216:iload_1         
	//* 121  217:iconst_1        
	//* 122  218:iadd            
	//* 123  219:newarray        int[]
	//* 124  221:astore          9
	//* 125  223:iconst_1        
	//* 126  224:istore_2        
	//* 127  225:iload_2         
	//* 128  226:iload_1         
	//* 129  227:icmpgt          420
	//* 130  230:iload           6
	//* 131  232:sipush          256
	//* 132  235:icmpgt          383
	//* 133  238:aload           9
	//* 134  240:iload_2         
	//* 135  241:aload_0         
	//* 136  242:getfield        #93  <Field RandomAccessFileOrArray ra>
	//* 137  245:invokevirtual   #246 <Method int RandomAccessFileOrArray.read()>
	//* 138  248:iastore         
	//* 139  249:iload_2         
	//* 140  250:iconst_1        
	//* 141  251:iadd            
	//* 142  252:istore_2        
	//* 143  253:goto            225
			flag = false;
	//  144  256:iconst_0        
	//  145  257:istore          7
		jbig2segment.deferredNonRetain = flag;
		if((i & 0x40) == 64)
			flag = true;
		else
	//* 146  259:goto            52
			flag = false;
	//  147  262:iconst_0        
	//  148  263:istore          7
		jbig2segment.type = i & 0x3f;
		j1 = ra.read();
		i1 = (j1 & 0xe0) >> 5;
		ai = null;
		if(i1 != 7) goto _L2; else goto _L1
_L1:
		ra.seek(ra.getFilePointer() - 1L);
		i1 = ra.readInt() & 0x1fffffff;
		ai = ((int []) (new boolean[i1 + 1]));
		i = 0;
		k = 0;
		do
		{
			j1 = i % 8;
			if(j1 == 0)
				k = ra.read();
			boolean flag1;
			if((1 << j1 & k) >> j1 == 1)
				flag1 = true;
			else
	//* 149  265:goto            71
				flag1 = false;
	//  150  268:iconst_0        
	//  151  269:istore          8
			ai[i] = flag1;
			j1 = i + 1;
			i = j1;
		} while(j1 <= i1);
		i = i1;
_L4:
		jbig2segment.segmentRetentionFlags = ((boolean []) (ai));
		jbig2segment.countOfReferredToSegments = i;
		ai = new int[i + 1];
		k = 1;
		while(k <= i) 
		{
			boolean flag2;
			boolean aflag[];
			if(l1 <= 256)
				ai[k] = ra.read();
			else
	//* 152  271:goto            181
	//* 153  274:iload_3         
	//* 154  275:iconst_4        
	//* 155  276:icmpgt          336
	//* 156  279:iload_3         
	//* 157  280:iconst_1        
	//* 158  281:iadd            
	//* 159  282:newarray        boolean[]
	//* 160  284:astore          10
	//* 161  286:iconst_0        
	//* 162  287:istore_2        
	//* 163  288:iload_3         
	//* 164  289:istore_1        
	//* 165  290:aload           10
	//* 166  292:astore          9
	//* 167  294:iload_2         
	//* 168  295:iload_3         
	//* 169  296:icmpgt          203
	//* 170  299:iconst_1        
	//* 171  300:iload_2         
	//* 172  301:ishl            
	//* 173  302:iload           4
	//* 174  304:bipush          31
	//* 175  306:iand            
	//* 176  307:iand            
	//* 177  308:iload_2         
	//* 178  309:ishr            
	//* 179  310:iconst_1        
	//* 180  311:icmpne          330
	//* 181  314:iconst_1        
	//* 182  315:istore          8
	//* 183  317:aload           10
	//* 184  319:iload_2         
	//* 185  320:iload           8
	//* 186  322:bastore         
	//* 187  323:iload_2         
	//* 188  324:iconst_1        
	//* 189  325:iadd            
	//* 190  326:istore_2        
	//* 191  327:goto            288
	//* 192  330:iconst_0        
	//* 193  331:istore          8
	//* 194  333:goto            317
	//* 195  336:iload_3         
	//* 196  337:iconst_5        
	//* 197  338:icmpeq          349
	//* 198  341:iload_3         
	//* 199  342:istore_1        
	//* 200  343:iload_3         
	//* 201  344:bipush          6
	//* 202  346:icmpne          203
	//* 203  349:new             #179 <Class IllegalStateException>
	//* 204  352:dup             
	//* 205  353:ldc2            #269 <String "count.of.referred.to.segments.had.bad.value.in.header.for.segment.1.starting.at.2">
	//* 206  356:iconst_2        
	//* 207  357:anewarray       Object[]
	//* 208  360:dup             
	//* 209  361:iconst_0        
	//* 210  362:iload           6
	//* 211  364:invokestatic    #274 <Method String String.valueOf(int)>
	//* 212  367:aastore         
	//* 213  368:dup             
	//* 214  369:iconst_1        
	//* 215  370:iload           5
	//* 216  372:invokestatic    #274 <Method String String.valueOf(int)>
	//* 217  375:aastore         
	//* 218  376:invokestatic    #187 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 219  379:invokespecial   #190 <Method void IllegalStateException(String)>
	//* 220  382:athrow          
			if(l1 <= 0x10000)
	//* 221  383:iload           6
	//* 222  385:ldc2            #275 <Int 0x10000>
	//* 223  388:icmpgt          405
				ai[k] = ra.readUnsignedShort();
	//  224  391:aload           9
	//  225  393:iload_2         
	//  226  394:aload_0         
	//  227  395:getfield        #93  <Field RandomAccessFileOrArray ra>
	//  228  398:invokevirtual   #278 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  229  401:iastore         
			else
	//* 230  402:goto            249
				ai[k] = (int)ra.readUnsignedInt();
	//  231  405:aload           9
	//  232  407:iload_2         
	//  233  408:aload_0         
	//  234  409:getfield        #93  <Field RandomAccessFileOrArray ra>
	//  235  412:invokevirtual   #281 <Method long RandomAccessFileOrArray.readUnsignedInt()>
	//  236  415:l2i             
	//  237  416:iastore         
			k++;
		}
		break MISSING_BLOCK_LABEL_420;
	//  238  417:goto            249
_L2:
		if(i1 > 4)
			break MISSING_BLOCK_LABEL_336;
		aflag = new boolean[i1 + 1];
		k = 0;
_L5:
		i = i1;
		ai = ((int []) (aflag));
		if(k > i1) goto _L4; else goto _L3
_L3:
		if((1 << k & (j1 & 0x1f)) >> k == 1)
			flag2 = true;
		else
			flag2 = false;
		aflag[k] = flag2;
		k++;
		  goto _L5
		if(i1 == 5)
			break; /* Loop/switch isn't completed */
		i = i1;
		if(i1 != 6) goto _L4; else goto _L6
_L6:
		throw new IllegalStateException(MessageLocalization.getComposedMessage("count.of.referred.to.segments.had.bad.value.in.header.for.segment.1.starting.at.2", new Object[] {
			String.valueOf(l1), String.valueOf(k1)
		}));
		jbig2segment.referredToSegmentNumbers = ai;
	//  239  420:aload           11
	//  240  422:aload           9
	//  241  424:putfield        #285 <Field int[] JBIG2SegmentReader$JBIG2Segment.referredToSegmentNumbers>
		int l = (int)ra.getFilePointer();
	//  242  427:aload_0         
	//  243  428:getfield        #93  <Field RandomAccessFileOrArray ra>
	//  244  431:invokevirtual   #216 <Method long RandomAccessFileOrArray.getFilePointer()>
	//  245  434:l2i             
	//  246  435:istore_2        
		int j;
		if(flag)
	//* 247  436:iload           7
	//* 248  438:ifeq            494
			j = ra.readInt();
	//  249  441:aload_0         
	//  250  442:getfield        #93  <Field RandomAccessFileOrArray ra>
	//  251  445:invokevirtual   #253 <Method int RandomAccessFileOrArray.readInt()>
	//  252  448:istore_1        
		else
	//* 253  449:iload_1         
	//* 254  450:ifge            505
	//* 255  453:new             #179 <Class IllegalStateException>
	//* 256  456:dup             
	//* 257  457:ldc2            #287 <String "page.1.invalid.for.segment.2.starting.at.3">
	//* 258  460:iconst_3        
	//* 259  461:anewarray       Object[]
	//* 260  464:dup             
	//* 261  465:iconst_0        
	//* 262  466:iload_1         
	//* 263  467:invokestatic    #274 <Method String String.valueOf(int)>
	//* 264  470:aastore         
	//* 265  471:dup             
	//* 266  472:iconst_1        
	//* 267  473:iload           6
	//* 268  475:invokestatic    #274 <Method String String.valueOf(int)>
	//* 269  478:aastore         
	//* 270  479:dup             
	//* 271  480:iconst_2        
	//* 272  481:iload           5
	//* 273  483:invokestatic    #274 <Method String String.valueOf(int)>
	//* 274  486:aastore         
	//* 275  487:invokestatic    #187 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 276  490:invokespecial   #190 <Method void IllegalStateException(String)>
	//* 277  493:athrow          
			j = ra.read();
	//  278  494:aload_0         
	//  279  495:getfield        #93  <Field RandomAccessFileOrArray ra>
	//  280  498:invokevirtual   #246 <Method int RandomAccessFileOrArray.read()>
	//  281  501:istore_1        
		if(j < 0)
			throw new IllegalStateException(MessageLocalization.getComposedMessage("page.1.invalid.for.segment.2.starting.at.3", new Object[] {
				String.valueOf(j), String.valueOf(l1), String.valueOf(k1)
			}));
	//* 282  502:goto            449
		jbig2segment.page = j;
	//  283  505:aload           11
	//  284  507:iload_1         
	//  285  508:putfield        #290 <Field int JBIG2SegmentReader$JBIG2Segment.page>
		jbig2segment.page_association_size = flag;
	//  286  511:aload           11
	//  287  513:iload           7
	//  288  515:putfield        #293 <Field boolean JBIG2SegmentReader$JBIG2Segment.page_association_size>
		jbig2segment.page_association_offset = l - k1;
	//  289  518:aload           11
	//  290  520:iload_2         
	//  291  521:iload           5
	//  292  523:isub            
	//  293  524:putfield        #296 <Field int JBIG2SegmentReader$JBIG2Segment.page_association_offset>
		if(j > 0 && !pages.containsKey(((Object) (Integer.valueOf(j)))))
	//* 294  527:iload_1         
	//* 295  528:ifle            570
	//* 296  531:aload_0         
	//* 297  532:getfield        #82  <Field SortedMap pages>
	//* 298  535:iload_1         
	//* 299  536:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//* 300  539:invokeinterface #300 <Method boolean SortedMap.containsKey(Object)>
	//* 301  544:ifne            570
			pages.put(((Object) (Integer.valueOf(j))), ((Object) (new JBIG2Page(j, this))));
	//  302  547:aload_0         
	//  303  548:getfield        #82  <Field SortedMap pages>
	//  304  551:iload_1         
	//  305  552:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  306  555:new             #6   <Class JBIG2SegmentReader$JBIG2Page>
	//  307  558:dup             
	//  308  559:iload_1         
	//  309  560:aload_0         
	//  310  561:invokespecial   #303 <Method void JBIG2SegmentReader$JBIG2Page(int, JBIG2SegmentReader)>
	//  311  564:invokeinterface #210 <Method Object SortedMap.put(Object, Object)>
	//  312  569:pop             
		if(j > 0)
	//* 313  570:iload_1         
	//* 314  571:ifle            654
			((JBIG2Page)pages.get(((Object) (Integer.valueOf(j))))).addSegment(jbig2segment);
	//  315  574:aload_0         
	//  316  575:getfield        #82  <Field SortedMap pages>
	//  317  578:iload_1         
	//  318  579:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//  319  582:invokeinterface #166 <Method Object SortedMap.get(Object)>
	//  320  587:checkcast       #6   <Class JBIG2SegmentReader$JBIG2Page>
	//  321  590:aload           11
	//  322  592:invokevirtual   #306 <Method void JBIG2SegmentReader$JBIG2Page.addSegment(JBIG2SegmentReader$JBIG2Segment)>
		else
	//* 323  595:aload           11
	//* 324  597:aload_0         
	//* 325  598:getfield        #93  <Field RandomAccessFileOrArray ra>
	//* 326  601:invokevirtual   #281 <Method long RandomAccessFileOrArray.readUnsignedInt()>
	//* 327  604:putfield        #310 <Field long JBIG2SegmentReader$JBIG2Segment.dataLength>
	//* 328  607:aload_0         
	//* 329  608:getfield        #93  <Field RandomAccessFileOrArray ra>
	//* 330  611:invokevirtual   #216 <Method long RandomAccessFileOrArray.getFilePointer()>
	//* 331  614:l2i             
	//* 332  615:istore_1        
	//* 333  616:aload_0         
	//* 334  617:getfield        #93  <Field RandomAccessFileOrArray ra>
	//* 335  620:iload           5
	//* 336  622:i2l             
	//* 337  623:invokevirtual   #230 <Method void RandomAccessFileOrArray.seek(long)>
	//* 338  626:iload_1         
	//* 339  627:iload           5
	//* 340  629:isub            
	//* 341  630:newarray        byte[]
	//* 342  632:astore          9
	//* 343  634:aload_0         
	//* 344  635:getfield        #93  <Field RandomAccessFileOrArray ra>
	//* 345  638:aload           9
	//* 346  640:invokevirtual   #233 <Method int RandomAccessFileOrArray.read(byte[])>
	//* 347  643:pop             
	//* 348  644:aload           11
	//* 349  646:aload           9
	//* 350  648:putfield        #131 <Field byte[] JBIG2SegmentReader$JBIG2Segment.headerData>
	//* 351  651:aload           11
	//* 352  653:areturn         
			globals.add(((Object) (jbig2segment)));
	//  353  654:aload_0         
	//  354  655:getfield        #87  <Field SortedSet globals>
	//  355  658:aload           11
	//  356  660:invokeinterface #313 <Method boolean SortedSet.add(Object)>
	//  357  665:pop             
		jbig2segment.dataLength = ra.readUnsignedInt();
		j = (int)ra.getFilePointer();
		ra.seek(k1);
		ai = ((int []) (new byte[j - k1]));
		ra.read(((byte []) (ai)));
		jbig2segment.headerData = ((byte []) (ai));
		return jbig2segment;
	//* 358  666:goto            595
	}

	void readSegment(JBIG2Segment jbig2segment)
		throws IOException
	{
		int j = (int)ra.getFilePointer();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RandomAccessFileOrArray ra>
	//    2    4:invokevirtual   #216 <Method long RandomAccessFileOrArray.getFilePointer()>
	//    3    7:l2i             
	//    4    8:istore_3        
		if(jbig2segment.dataLength != 0xffffffffL)
	//*   5    9:aload_1         
	//*   6   10:getfield        #310 <Field long JBIG2SegmentReader$JBIG2Segment.dataLength>
	//*   7   13:ldc2w           #314 <Long 0xffffffffL>
	//*   8   16:lcmp            
	//*   9   17:ifne            21
	//*  10   20:return          
		{
			byte abyte0[] = new byte[(int)jbig2segment.dataLength];
	//   11   21:aload_1         
	//   12   22:getfield        #310 <Field long JBIG2SegmentReader$JBIG2Segment.dataLength>
	//   13   25:l2i             
	//   14   26:newarray        byte[]
	//   15   28:astore          5
			ra.read(abyte0);
	//   16   30:aload_0         
	//   17   31:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   18   34:aload           5
	//   19   36:invokevirtual   #233 <Method int RandomAccessFileOrArray.read(byte[])>
	//   20   39:pop             
			jbig2segment.data = abyte0;
	//   21   40:aload_1         
	//   22   41:aload           5
	//   23   43:putfield        #138 <Field byte[] JBIG2SegmentReader$JBIG2Segment.data>
			if(jbig2segment.type == 48)
	//*  24   46:aload_1         
	//*  25   47:getfield        #127 <Field int JBIG2SegmentReader$JBIG2Segment.type>
	//*  26   50:bipush          48
	//*  27   52:icmpne          20
			{
				int i = (int)ra.getFilePointer();
	//   28   55:aload_0         
	//   29   56:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   30   59:invokevirtual   #216 <Method long RandomAccessFileOrArray.getFilePointer()>
	//   31   62:l2i             
	//   32   63:istore_2        
				ra.seek(j);
	//   33   64:aload_0         
	//   34   65:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   35   68:iload_3         
	//   36   69:i2l             
	//   37   70:invokevirtual   #230 <Method void RandomAccessFileOrArray.seek(long)>
				j = ra.readInt();
	//   38   73:aload_0         
	//   39   74:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   40   77:invokevirtual   #253 <Method int RandomAccessFileOrArray.readInt()>
	//   41   80:istore_3        
				int k = ra.readInt();
	//   42   81:aload_0         
	//   43   82:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   44   85:invokevirtual   #253 <Method int RandomAccessFileOrArray.readInt()>
	//   45   88:istore          4
				ra.seek(i);
	//   46   90:aload_0         
	//   47   91:getfield        #93  <Field RandomAccessFileOrArray ra>
	//   48   94:iload_2         
	//   49   95:i2l             
	//   50   96:invokevirtual   #230 <Method void RandomAccessFileOrArray.seek(long)>
				JBIG2Page jbig2page = (JBIG2Page)pages.get(((Object) (Integer.valueOf(jbig2segment.page))));
	//   51   99:aload_0         
	//   52  100:getfield        #82  <Field SortedMap pages>
	//   53  103:aload_1         
	//   54  104:getfield        #290 <Field int JBIG2SegmentReader$JBIG2Segment.page>
	//   55  107:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   56  110:invokeinterface #166 <Method Object SortedMap.get(Object)>
	//   57  115:checkcast       #6   <Class JBIG2SegmentReader$JBIG2Page>
	//   58  118:astore          5
				if(jbig2page == null)
	//*  59  120:aload           5
	//*  60  122:ifnonnull       143
				{
					throw new IllegalStateException(MessageLocalization.getComposedMessage("referring.to.widht.height.of.page.we.havent.seen.yet.1", jbig2segment.page));
	//   61  125:new             #179 <Class IllegalStateException>
	//   62  128:dup             
	//   63  129:ldc2            #317 <String "referring.to.widht.height.of.page.we.havent.seen.yet.1">
	//   64  132:aload_1         
	//   65  133:getfield        #290 <Field int JBIG2SegmentReader$JBIG2Segment.page>
	//   66  136:invokestatic    #244 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   67  139:invokespecial   #190 <Method void IllegalStateException(String)>
	//   68  142:athrow          
				} else
				{
					jbig2page.pageBitmapWidth = j;
	//   69  143:aload           5
	//   70  145:iload_3         
	//   71  146:putfield        #175 <Field int JBIG2SegmentReader$JBIG2Page.pageBitmapWidth>
					jbig2page.pageBitmapHeight = k;
	//   72  149:aload           5
	//   73  151:iload           4
	//   74  153:putfield        #171 <Field int JBIG2SegmentReader$JBIG2Page.pageBitmapHeight>
					return;
	//   75  156:return          
				}
			}
		}
	}

	public String toString()
	{
		if(read)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field boolean read>
	//*   2    4:ifeq            31
			return (new StringBuilder()).append("Jbig2SegmentReader: number of pages: ").append(numberOfPages()).toString();
	//    3    7:new             #321 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #322 <Method void StringBuilder()>
	//    6   14:ldc2            #324 <String "Jbig2SegmentReader: number of pages: ">
	//    7   17:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #330 <Method int numberOfPages()>
	//   10   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(int)>
	//   11   27:invokevirtual   #335 <Method String StringBuilder.toString()>
	//   12   30:areturn         
		else
			return "Jbig2SegmentReader in indeterminate state.";
	//   13   31:ldc2            #337 <String "Jbig2SegmentReader in indeterminate state.">
	//   14   34:areturn         
	}

	public static final int END_OF_FILE = 51;
	public static final int END_OF_PAGE = 49;
	public static final int END_OF_STRIPE = 50;
	public static final int EXTENSION = 62;
	public static final int IMMEDIATE_GENERIC_REFINEMENT_REGION = 42;
	public static final int IMMEDIATE_GENERIC_REGION = 38;
	public static final int IMMEDIATE_HALFTONE_REGION = 22;
	public static final int IMMEDIATE_LOSSLESS_GENERIC_REFINEMENT_REGION = 43;
	public static final int IMMEDIATE_LOSSLESS_GENERIC_REGION = 39;
	public static final int IMMEDIATE_LOSSLESS_HALFTONE_REGION = 23;
	public static final int IMMEDIATE_LOSSLESS_TEXT_REGION = 7;
	public static final int IMMEDIATE_TEXT_REGION = 6;
	public static final int INTERMEDIATE_GENERIC_REFINEMENT_REGION = 40;
	public static final int INTERMEDIATE_GENERIC_REGION = 36;
	public static final int INTERMEDIATE_HALFTONE_REGION = 20;
	public static final int INTERMEDIATE_TEXT_REGION = 4;
	public static final int PAGE_INFORMATION = 48;
	public static final int PATTERN_DICTIONARY = 16;
	public static final int PROFILES = 52;
	public static final int SYMBOL_DICTIONARY = 0;
	public static final int TABLES = 53;
	private final SortedSet globals = new TreeSet();
	private int number_of_pages;
	private boolean number_of_pages_known;
	private final SortedMap pages = new TreeMap();
	private RandomAccessFileOrArray ra;
	private boolean read;
	private final SortedMap segments = new TreeMap();
	private boolean sequential;
}
