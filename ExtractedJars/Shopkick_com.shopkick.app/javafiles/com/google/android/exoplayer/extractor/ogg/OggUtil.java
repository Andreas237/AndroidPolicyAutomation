// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.io.EOFException;
import java.io.IOException;

final class OggUtil
{
	public static class PacketInfoHolder
	{

		public int segmentCount;
		public int size;

		public PacketInfoHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class PageHeader
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

		public PageHeader()
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


	OggUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static void calculatePacketSize(PageHeader pageheader, int i, PacketInfoHolder packetinfoholder)
	{
		packetinfoholder.segmentCount = 0;
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:putfield        #35  <Field int OggUtil$PacketInfoHolder.segmentCount>
		packetinfoholder.size = 0;
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:putfield        #38  <Field int OggUtil$PacketInfoHolder.size>
		int j;
		do
		{
			if(packetinfoholder.segmentCount + i >= pageheader.pageSegmentCount)
				break;
	//    6   10:aload_2         
	//    7   11:getfield        #35  <Field int OggUtil$PacketInfoHolder.segmentCount>
	//    8   14:iload_1         
	//    9   15:iadd            
	//   10   16:aload_0         
	//   11   17:getfield        #41  <Field int OggUtil$PageHeader.pageSegmentCount>
	//   12   20:icmpge          65
			int ai[] = pageheader.laces;
	//   13   23:aload_0         
	//   14   24:getfield        #45  <Field int[] OggUtil$PageHeader.laces>
	//   15   27:astore          4
			j = packetinfoholder.segmentCount;
	//   16   29:aload_2         
	//   17   30:getfield        #35  <Field int OggUtil$PacketInfoHolder.segmentCount>
	//   18   33:istore_3        
			packetinfoholder.segmentCount = j + 1;
	//   19   34:aload_2         
	//   20   35:iload_3         
	//   21   36:iconst_1        
	//   22   37:iadd            
	//   23   38:putfield        #35  <Field int OggUtil$PacketInfoHolder.segmentCount>
			j = ai[j + i];
	//   24   41:aload           4
	//   25   43:iload_3         
	//   26   44:iload_1         
	//   27   45:iadd            
	//   28   46:iaload          
	//   29   47:istore_3        
			packetinfoholder.size = packetinfoholder.size + j;
	//   30   48:aload_2         
	//   31   49:aload_2         
	//   32   50:getfield        #38  <Field int OggUtil$PacketInfoHolder.size>
	//   33   53:iload_3         
	//   34   54:iadd            
	//   35   55:putfield        #38  <Field int OggUtil$PacketInfoHolder.size>
		} while(j == 255);
	//   36   58:iload_3         
	//   37   59:sipush          255
	//   38   62:icmpeq          10
	//   39   65:return          
	}

	public static boolean populatePageHeader(ExtractorInput extractorinput, PageHeader pageheader, ParsableByteArray parsablebytearray, boolean flag)
		throws IOException, InterruptedException
	{
		parsablebytearray.reset();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #56  <Method void ParsableByteArray.reset()>
		pageheader.reset();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method void OggUtil$PageHeader.reset()>
		long l = extractorinput.getLength();
	//    4    8:aload_0         
	//    5    9:invokeinterface #63  <Method long ExtractorInput.getLength()>
	//    6   14:lstore          6
		boolean flag2 = false;
	//    7   16:iconst_0        
	//    8   17:istore          5
		boolean flag1;
		if(l != -1L && extractorinput.getLength() - extractorinput.getPeekPosition() < 27L)
	//*   9   19:lload           6
	//*  10   21:ldc2w           #64  <Long -1L>
	//*  11   24:lcmp            
	//*  12   25:ifeq            57
	//*  13   28:aload_0         
	//*  14   29:invokeinterface #63  <Method long ExtractorInput.getLength()>
	//*  15   34:aload_0         
	//*  16   35:invokeinterface #68  <Method long ExtractorInput.getPeekPosition()>
	//*  17   40:lsub            
	//*  18   41:ldc2w           #69  <Long 27L>
	//*  19   44:lcmp            
	//*  20   45:iflt            51
	//*  21   48:goto            57
			flag1 = false;
	//   22   51:iconst_0        
	//   23   52:istore          4
		else
	//*  24   54:goto            60
			flag1 = true;
	//   25   57:iconst_1        
	//   26   58:istore          4
		if(flag1 && extractorinput.peekFully(parsablebytearray.data, 0, 27, true))
	//*  27   60:iload           4
	//*  28   62:ifeq            273
	//*  29   65:aload_0         
	//*  30   66:aload_2         
	//*  31   67:getfield        #74  <Field byte[] ParsableByteArray.data>
	//*  32   70:iconst_0        
	//*  33   71:bipush          27
	//*  34   73:iconst_1        
	//*  35   74:invokeinterface #78  <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  36   79:ifne            85
	//*  37   82:goto            273
		{
			if(parsablebytearray.readUnsignedInt() != (long)TYPE_OGGS)
	//*  38   85:aload_2         
	//*  39   86:invokevirtual   #81  <Method long ParsableByteArray.readUnsignedInt()>
	//*  40   89:getstatic       #26  <Field int TYPE_OGGS>
	//*  41   92:i2l             
	//*  42   93:lcmp            
	//*  43   94:ifeq            113
				if(flag)
	//*  44   97:iload_3         
	//*  45   98:ifeq            103
					return false;
	//   46  101:iconst_0        
	//   47  102:ireturn         
				else
					throw new ParserException("expected OggS capture pattern at begin of page");
	//   48  103:new             #83  <Class ParserException>
	//   49  106:dup             
	//   50  107:ldc1            #85  <String "expected OggS capture pattern at begin of page">
	//   51  109:invokespecial   #88  <Method void ParserException(String)>
	//   52  112:athrow          
			pageheader.revision = parsablebytearray.readUnsignedByte();
	//   53  113:aload_1         
	//   54  114:aload_2         
	//   55  115:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedByte()>
	//   56  118:putfield        #95  <Field int OggUtil$PageHeader.revision>
			if(pageheader.revision != 0)
	//*  57  121:aload_1         
	//*  58  122:getfield        #95  <Field int OggUtil$PageHeader.revision>
	//*  59  125:ifeq            144
				if(flag)
	//*  60  128:iload_3         
	//*  61  129:ifeq            134
					return false;
	//   62  132:iconst_0        
	//   63  133:ireturn         
				else
					throw new ParserException("unsupported bit stream revision");
	//   64  134:new             #83  <Class ParserException>
	//   65  137:dup             
	//   66  138:ldc1            #97  <String "unsupported bit stream revision">
	//   67  140:invokespecial   #88  <Method void ParserException(String)>
	//   68  143:athrow          
			pageheader.type = parsablebytearray.readUnsignedByte();
	//   69  144:aload_1         
	//   70  145:aload_2         
	//   71  146:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedByte()>
	//   72  149:putfield        #100 <Field int OggUtil$PageHeader.type>
			pageheader.granulePosition = parsablebytearray.readLittleEndianLong();
	//   73  152:aload_1         
	//   74  153:aload_2         
	//   75  154:invokevirtual   #103 <Method long ParsableByteArray.readLittleEndianLong()>
	//   76  157:putfield        #107 <Field long OggUtil$PageHeader.granulePosition>
			pageheader.streamSerialNumber = parsablebytearray.readLittleEndianUnsignedInt();
	//   77  160:aload_1         
	//   78  161:aload_2         
	//   79  162:invokevirtual   #110 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   80  165:putfield        #113 <Field long OggUtil$PageHeader.streamSerialNumber>
			pageheader.pageSequenceNumber = parsablebytearray.readLittleEndianUnsignedInt();
	//   81  168:aload_1         
	//   82  169:aload_2         
	//   83  170:invokevirtual   #110 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   84  173:putfield        #116 <Field long OggUtil$PageHeader.pageSequenceNumber>
			pageheader.pageChecksum = parsablebytearray.readLittleEndianUnsignedInt();
	//   85  176:aload_1         
	//   86  177:aload_2         
	//   87  178:invokevirtual   #110 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   88  181:putfield        #119 <Field long OggUtil$PageHeader.pageChecksum>
			pageheader.pageSegmentCount = parsablebytearray.readUnsignedByte();
	//   89  184:aload_1         
	//   90  185:aload_2         
	//   91  186:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedByte()>
	//   92  189:putfield        #41  <Field int OggUtil$PageHeader.pageSegmentCount>
			parsablebytearray.reset();
	//   93  192:aload_2         
	//   94  193:invokevirtual   #56  <Method void ParsableByteArray.reset()>
			pageheader.headerSize = pageheader.pageSegmentCount + 27;
	//   95  196:aload_1         
	//   96  197:aload_1         
	//   97  198:getfield        #41  <Field int OggUtil$PageHeader.pageSegmentCount>
	//   98  201:bipush          27
	//   99  203:iadd            
	//  100  204:putfield        #122 <Field int OggUtil$PageHeader.headerSize>
			extractorinput.peekFully(parsablebytearray.data, 0, pageheader.pageSegmentCount);
	//  101  207:aload_0         
	//  102  208:aload_2         
	//  103  209:getfield        #74  <Field byte[] ParsableByteArray.data>
	//  104  212:iconst_0        
	//  105  213:aload_1         
	//  106  214:getfield        #41  <Field int OggUtil$PageHeader.pageSegmentCount>
	//  107  217:invokeinterface #125 <Method void ExtractorInput.peekFully(byte[], int, int)>
			for(int i = ((int) (flag2)); i < pageheader.pageSegmentCount; i++)
	//* 108  222:iload           5
	//* 109  224:istore          4
	//* 110  226:iload           4
	//* 111  228:aload_1         
	//* 112  229:getfield        #41  <Field int OggUtil$PageHeader.pageSegmentCount>
	//* 113  232:icmpge          271
			{
				pageheader.laces[i] = parsablebytearray.readUnsignedByte();
	//  114  235:aload_1         
	//  115  236:getfield        #45  <Field int[] OggUtil$PageHeader.laces>
	//  116  239:iload           4
	//  117  241:aload_2         
	//  118  242:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedByte()>
	//  119  245:iastore         
				pageheader.bodySize = pageheader.bodySize + pageheader.laces[i];
	//  120  246:aload_1         
	//  121  247:aload_1         
	//  122  248:getfield        #128 <Field int OggUtil$PageHeader.bodySize>
	//  123  251:aload_1         
	//  124  252:getfield        #45  <Field int[] OggUtil$PageHeader.laces>
	//  125  255:iload           4
	//  126  257:iaload          
	//  127  258:iadd            
	//  128  259:putfield        #128 <Field int OggUtil$PageHeader.bodySize>
			}

	//  129  262:iload           4
	//  130  264:iconst_1        
	//  131  265:iadd            
	//  132  266:istore          4
	//* 133  268:goto            226
			return true;
	//  134  271:iconst_1        
	//  135  272:ireturn         
		}
		if(flag)
	//* 136  273:iload_3         
	//* 137  274:ifeq            279
			return false;
	//  138  277:iconst_0        
	//  139  278:ireturn         
		else
			throw new EOFException();
	//  140  279:new             #130 <Class EOFException>
	//  141  282:dup             
	//  142  283:invokespecial   #131 <Method void EOFException()>
	//  143  286:athrow          
	}

	public static int readBits(byte byte0, int i, int j)
	{
		return byte0 >> j & 255 >>> 8 - i;
	//    0    0:iload_0         
	//    1    1:iload_2         
	//    2    2:ishr            
	//    3    3:sipush          255
	//    4    6:bipush          8
	//    5    8:iload_1         
	//    6    9:isub            
	//    7   10:iushr           
	//    8   11:iand            
	//    9   12:ireturn         
	}

	public static void skipToNextPage(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = new byte[2048];
	//    0    0:sipush          2048
	//    1    3:newarray        byte[]
	//    2    5:astore          4
		int j = abyte0.length;
	//    3    7:aload           4
	//    4    9:arraylength     
	//    5   10:istore_2        
		do
		{
			int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
			if(extractorinput.getLength() != -1L)
	//*   8   13:aload_0         
	//*   9   14:invokeinterface #63  <Method long ExtractorInput.getLength()>
	//*  10   19:ldc2w           #64  <Long -1L>
	//*  11   22:lcmp            
	//*  12   23:ifeq            78
			{
				i = j;
	//   13   26:iload_2         
	//   14   27:istore_1        
				if(extractorinput.getPosition() + (long)j > extractorinput.getLength())
	//*  15   28:aload_0         
	//*  16   29:invokeinterface #139 <Method long ExtractorInput.getPosition()>
	//*  17   34:iload_2         
	//*  18   35:i2l             
	//*  19   36:ladd            
	//*  20   37:aload_0         
	//*  21   38:invokeinterface #63  <Method long ExtractorInput.getLength()>
	//*  22   43:lcmp            
	//*  23   44:ifle            78
				{
					i = (int)(extractorinput.getLength() - extractorinput.getPosition());
	//   24   47:aload_0         
	//   25   48:invokeinterface #63  <Method long ExtractorInput.getLength()>
	//   26   53:aload_0         
	//   27   54:invokeinterface #139 <Method long ExtractorInput.getPosition()>
	//   28   59:lsub            
	//   29   60:l2i             
	//   30   61:istore_1        
					if(i < 4)
	//*  31   62:iload_1         
	//*  32   63:iconst_4        
	//*  33   64:icmplt          70
	//*  34   67:goto            78
						throw new EOFException();
	//   35   70:new             #130 <Class EOFException>
	//   36   73:dup             
	//   37   74:invokespecial   #131 <Method void EOFException()>
	//   38   77:athrow          
				}
			}
			j = 0;
	//   39   78:iconst_0        
	//   40   79:istore_2        
			extractorinput.peekFully(abyte0, 0, i, false);
	//   41   80:aload_0         
	//   42   81:aload           4
	//   43   83:iconst_0        
	//   44   84:iload_1         
	//   45   85:iconst_0        
	//   46   86:invokeinterface #78  <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//   47   91:pop             
			int k;
			do
			{
				k = i - 3;
	//   48   92:iload_1         
	//   49   93:iconst_3        
	//   50   94:isub            
	//   51   95:istore_3        
				if(j >= k)
					break;
	//   52   96:iload_2         
	//   53   97:iload_3         
	//   54   98:icmpge          158
				if(abyte0[j] == 79 && abyte0[j + 1] == 103 && abyte0[j + 2] == 103 && abyte0[j + 3] == 83)
	//*  55  101:aload           4
	//*  56  103:iload_2         
	//*  57  104:baload          
	//*  58  105:bipush          79
	//*  59  107:icmpne          151
	//*  60  110:aload           4
	//*  61  112:iload_2         
	//*  62  113:iconst_1        
	//*  63  114:iadd            
	//*  64  115:baload          
	//*  65  116:bipush          103
	//*  66  118:icmpne          151
	//*  67  121:aload           4
	//*  68  123:iload_2         
	//*  69  124:iconst_2        
	//*  70  125:iadd            
	//*  71  126:baload          
	//*  72  127:bipush          103
	//*  73  129:icmpne          151
	//*  74  132:aload           4
	//*  75  134:iload_2         
	//*  76  135:iconst_3        
	//*  77  136:iadd            
	//*  78  137:baload          
	//*  79  138:bipush          83
	//*  80  140:icmpne          151
				{
					extractorinput.skipFully(j);
	//   81  143:aload_0         
	//   82  144:iload_2         
	//   83  145:invokeinterface #143 <Method void ExtractorInput.skipFully(int)>
					return;
	//   84  150:return          
				}
				j++;
	//   85  151:iload_2         
	//   86  152:iconst_1        
	//   87  153:iadd            
	//   88  154:istore_2        
			} while(true);
	//   89  155:goto            92
			extractorinput.skipFully(k);
	//   90  158:aload_0         
	//   91  159:iload_3         
	//   92  160:invokeinterface #143 <Method void ExtractorInput.skipFully(int)>
			j = i;
	//   93  165:iload_1         
	//   94  166:istore_2        
		} while(true);
	//   95  167:goto            11
	}

	public static final int PAGE_HEADER_SIZE = 27;
	private static final int TYPE_OGGS = Util.getIntegerCodeForString("OggS");

	static 
	{
	//    0    0:ldc1            #18  <String "OggS">
	//    1    2:invokestatic    #24  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #26  <Field int TYPE_OGGS>
	//*   3    8:return          
	}
}
