// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

final class OggPageHeader
{

	OggPageHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          255
	//    4    8:newarray        int[]
	//    5   10:putfield        #46  <Field int[] laces>
	//    6   13:aload_0         
	//    7   14:new             #48  <Class ParsableByteArray>
	//    8   17:dup             
	//    9   18:sipush          255
	//   10   21:invokespecial   #51  <Method void ParsableByteArray(int)>
	//   11   24:putfield        #53  <Field ParsableByteArray scratch>
	//   12   27:return          
	}

	public boolean populate(ExtractorInput extractorinput, boolean flag)
		throws IOException, InterruptedException
	{
		scratch.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ParsableByteArray scratch>
	//    2    4:invokevirtual   #62  <Method void ParsableByteArray.reset()>
		reset();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #63  <Method void reset()>
		long l = extractorinput.getLength();
	//    5   11:aload_1         
	//    6   12:invokeinterface #69  <Method long ExtractorInput.getLength()>
	//    7   17:lstore          5
		boolean flag2 = false;
	//    8   19:iconst_0        
	//    9   20:istore          4
		boolean flag1;
		if(l != -1L && extractorinput.getLength() - extractorinput.getPeekPosition() < 27L)
	//*  10   22:lload           5
	//*  11   24:ldc2w           #70  <Long -1L>
	//*  12   27:lcmp            
	//*  13   28:ifeq            59
	//*  14   31:aload_1         
	//*  15   32:invokeinterface #69  <Method long ExtractorInput.getLength()>
	//*  16   37:aload_1         
	//*  17   38:invokeinterface #74  <Method long ExtractorInput.getPeekPosition()>
	//*  18   43:lsub            
	//*  19   44:ldc2w           #75  <Long 27L>
	//*  20   47:lcmp            
	//*  21   48:iflt            54
	//*  22   51:goto            59
			flag1 = false;
	//   23   54:iconst_0        
	//   24   55:istore_3        
		else
	//*  25   56:goto            61
			flag1 = true;
	//   26   59:iconst_1        
	//   27   60:istore_3        
		if(flag1 && extractorinput.peekFully(scratch.data, 0, 27, true))
	//*  28   61:iload_3         
	//*  29   62:ifeq            303
	//*  30   65:aload_1         
	//*  31   66:aload_0         
	//*  32   67:getfield        #53  <Field ParsableByteArray scratch>
	//*  33   70:getfield        #80  <Field byte[] ParsableByteArray.data>
	//*  34   73:iconst_0        
	//*  35   74:bipush          27
	//*  36   76:iconst_1        
	//*  37   77:invokeinterface #84  <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  38   82:ifne            88
	//*  39   85:goto            303
		{
			if(scratch.readUnsignedInt() != (long)TYPE_OGGS)
	//*  40   88:aload_0         
	//*  41   89:getfield        #53  <Field ParsableByteArray scratch>
	//*  42   92:invokevirtual   #87  <Method long ParsableByteArray.readUnsignedInt()>
	//*  43   95:getstatic       #40  <Field int TYPE_OGGS>
	//*  44   98:i2l             
	//*  45   99:lcmp            
	//*  46  100:ifeq            119
				if(flag)
	//*  47  103:iload_2         
	//*  48  104:ifeq            109
					return false;
	//   49  107:iconst_0        
	//   50  108:ireturn         
				else
					throw new ParserException("expected OggS capture pattern at begin of page");
	//   51  109:new             #89  <Class ParserException>
	//   52  112:dup             
	//   53  113:ldc1            #91  <String "expected OggS capture pattern at begin of page">
	//   54  115:invokespecial   #94  <Method void ParserException(String)>
	//   55  118:athrow          
			revision = scratch.readUnsignedByte();
	//   56  119:aload_0         
	//   57  120:aload_0         
	//   58  121:getfield        #53  <Field ParsableByteArray scratch>
	//   59  124:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//   60  127:putfield        #100 <Field int revision>
			if(revision != 0)
	//*  61  130:aload_0         
	//*  62  131:getfield        #100 <Field int revision>
	//*  63  134:ifeq            153
				if(flag)
	//*  64  137:iload_2         
	//*  65  138:ifeq            143
					return false;
	//   66  141:iconst_0        
	//   67  142:ireturn         
				else
					throw new ParserException("unsupported bit stream revision");
	//   68  143:new             #89  <Class ParserException>
	//   69  146:dup             
	//   70  147:ldc1            #102 <String "unsupported bit stream revision">
	//   71  149:invokespecial   #94  <Method void ParserException(String)>
	//   72  152:athrow          
			type = scratch.readUnsignedByte();
	//   73  153:aload_0         
	//   74  154:aload_0         
	//   75  155:getfield        #53  <Field ParsableByteArray scratch>
	//   76  158:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//   77  161:putfield        #104 <Field int type>
			granulePosition = scratch.readLittleEndianLong();
	//   78  164:aload_0         
	//   79  165:aload_0         
	//   80  166:getfield        #53  <Field ParsableByteArray scratch>
	//   81  169:invokevirtual   #107 <Method long ParsableByteArray.readLittleEndianLong()>
	//   82  172:putfield        #109 <Field long granulePosition>
			streamSerialNumber = scratch.readLittleEndianUnsignedInt();
	//   83  175:aload_0         
	//   84  176:aload_0         
	//   85  177:getfield        #53  <Field ParsableByteArray scratch>
	//   86  180:invokevirtual   #112 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   87  183:putfield        #114 <Field long streamSerialNumber>
			pageSequenceNumber = scratch.readLittleEndianUnsignedInt();
	//   88  186:aload_0         
	//   89  187:aload_0         
	//   90  188:getfield        #53  <Field ParsableByteArray scratch>
	//   91  191:invokevirtual   #112 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   92  194:putfield        #116 <Field long pageSequenceNumber>
			pageChecksum = scratch.readLittleEndianUnsignedInt();
	//   93  197:aload_0         
	//   94  198:aload_0         
	//   95  199:getfield        #53  <Field ParsableByteArray scratch>
	//   96  202:invokevirtual   #112 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   97  205:putfield        #118 <Field long pageChecksum>
			pageSegmentCount = scratch.readUnsignedByte();
	//   98  208:aload_0         
	//   99  209:aload_0         
	//  100  210:getfield        #53  <Field ParsableByteArray scratch>
	//  101  213:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//  102  216:putfield        #120 <Field int pageSegmentCount>
			headerSize = 27 + pageSegmentCount;
	//  103  219:aload_0         
	//  104  220:bipush          27
	//  105  222:aload_0         
	//  106  223:getfield        #120 <Field int pageSegmentCount>
	//  107  226:iadd            
	//  108  227:putfield        #122 <Field int headerSize>
			scratch.reset();
	//  109  230:aload_0         
	//  110  231:getfield        #53  <Field ParsableByteArray scratch>
	//  111  234:invokevirtual   #62  <Method void ParsableByteArray.reset()>
			extractorinput.peekFully(scratch.data, 0, pageSegmentCount);
	//  112  237:aload_1         
	//  113  238:aload_0         
	//  114  239:getfield        #53  <Field ParsableByteArray scratch>
	//  115  242:getfield        #80  <Field byte[] ParsableByteArray.data>
	//  116  245:iconst_0        
	//  117  246:aload_0         
	//  118  247:getfield        #120 <Field int pageSegmentCount>
	//  119  250:invokeinterface #125 <Method void ExtractorInput.peekFully(byte[], int, int)>
			for(int i = ((int) (flag2)); i < pageSegmentCount; i++)
	//* 120  255:iload           4
	//* 121  257:istore_3        
	//* 122  258:iload_3         
	//* 123  259:aload_0         
	//* 124  260:getfield        #120 <Field int pageSegmentCount>
	//* 125  263:icmpge          301
			{
				laces[i] = scratch.readUnsignedByte();
	//  126  266:aload_0         
	//  127  267:getfield        #46  <Field int[] laces>
	//  128  270:iload_3         
	//  129  271:aload_0         
	//  130  272:getfield        #53  <Field ParsableByteArray scratch>
	//  131  275:invokevirtual   #98  <Method int ParsableByteArray.readUnsignedByte()>
	//  132  278:iastore         
				bodySize = bodySize + laces[i];
	//  133  279:aload_0         
	//  134  280:aload_0         
	//  135  281:getfield        #127 <Field int bodySize>
	//  136  284:aload_0         
	//  137  285:getfield        #46  <Field int[] laces>
	//  138  288:iload_3         
	//  139  289:iaload          
	//  140  290:iadd            
	//  141  291:putfield        #127 <Field int bodySize>
			}

	//  142  294:iload_3         
	//  143  295:iconst_1        
	//  144  296:iadd            
	//  145  297:istore_3        
	//* 146  298:goto            258
			return true;
	//  147  301:iconst_1        
	//  148  302:ireturn         
		}
		if(flag)
	//* 149  303:iload_2         
	//* 150  304:ifeq            309
			return false;
	//  151  307:iconst_0        
	//  152  308:ireturn         
		else
			throw new EOFException();
	//  153  309:new             #129 <Class EOFException>
	//  154  312:dup             
	//  155  313:invokespecial   #130 <Method void EOFException()>
	//  156  316:athrow          
	}

	public void reset()
	{
		revision = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #100 <Field int revision>
		type = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #104 <Field int type>
		granulePosition = 0L;
	//    6   10:aload_0         
	//    7   11:lconst_0        
	//    8   12:putfield        #109 <Field long granulePosition>
		streamSerialNumber = 0L;
	//    9   15:aload_0         
	//   10   16:lconst_0        
	//   11   17:putfield        #114 <Field long streamSerialNumber>
		pageSequenceNumber = 0L;
	//   12   20:aload_0         
	//   13   21:lconst_0        
	//   14   22:putfield        #116 <Field long pageSequenceNumber>
		pageChecksum = 0L;
	//   15   25:aload_0         
	//   16   26:lconst_0        
	//   17   27:putfield        #118 <Field long pageChecksum>
		pageSegmentCount = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #120 <Field int pageSegmentCount>
		headerSize = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #122 <Field int headerSize>
		bodySize = 0;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #127 <Field int bodySize>
	//   27   45:return          
	}

	public static final int EMPTY_PAGE_HEADER_SIZE = 27;
	public static final int MAX_PAGE_PAYLOAD = 65025;
	public static final int MAX_PAGE_SIZE = 65307;
	public static final int MAX_SEGMENT_COUNT = 255;
	private static final int TYPE_OGGS = Util.getIntegerCodeForString("OggS");
	public int bodySize;
	public long granulePosition;
	public int headerSize;
	public final int laces[] = new int[255];
	public long pageChecksum;
	public int pageSegmentCount;
	public long pageSequenceNumber;
	public int revision;
	private final ParsableByteArray scratch = new ParsableByteArray(255);
	public long streamSerialNumber;
	public int type;

	static 
	{
	//    0    0:ldc1            #32  <String "OggS">
	//    1    2:invokestatic    #38  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #40  <Field int TYPE_OGGS>
	//*   3    8:return          
	}
}
