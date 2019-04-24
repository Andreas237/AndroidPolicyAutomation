// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.rawcc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

public final class RawCcExtractor
	implements Extractor
{

	public RawCcExtractor(Format format1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		format = format1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field Format format>
	//    5    9:aload_0         
	//    6   10:new             #54  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:bipush          9
	//    9   16:invokespecial   #57  <Method void ParsableByteArray(int)>
	//   10   19:putfield        #59  <Field ParsableByteArray dataScratch>
		parserState = 0;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #61  <Field int parserState>
	//   14   27:return          
	}

	private boolean parseHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		dataScratch.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ParsableByteArray dataScratch>
	//    2    4:invokevirtual   #70  <Method void ParsableByteArray.reset()>
		if(extractorinput.readFully(dataScratch.data, 0, 8, true))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #59  <Field ParsableByteArray dataScratch>
	//*   6   12:getfield        #74  <Field byte[] ParsableByteArray.data>
	//*   7   15:iconst_0        
	//*   8   16:bipush          8
	//*   9   18:iconst_1        
	//*  10   19:invokeinterface #80  <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  11   24:ifeq            63
		{
			if(dataScratch.readInt() != HEADER_ID)
	//*  12   27:aload_0         
	//*  13   28:getfield        #59  <Field ParsableByteArray dataScratch>
	//*  14   31:invokevirtual   #84  <Method int ParsableByteArray.readInt()>
	//*  15   34:getstatic       #45  <Field int HEADER_ID>
	//*  16   37:icmpeq          50
			{
				throw new IOException("Input not RawCC");
	//   17   40:new             #65  <Class IOException>
	//   18   43:dup             
	//   19   44:ldc1            #86  <String "Input not RawCC">
	//   20   46:invokespecial   #89  <Method void IOException(String)>
	//   21   49:athrow          
			} else
			{
				version = dataScratch.readUnsignedByte();
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #59  <Field ParsableByteArray dataScratch>
	//   25   55:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedByte()>
	//   26   58:putfield        #94  <Field int version>
				return true;
	//   27   61:iconst_1        
	//   28   62:ireturn         
			}
		} else
		{
			return false;
	//   29   63:iconst_0        
	//   30   64:ireturn         
		}
	}

	private void parseSamples(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		for(; remainingSampleCount > 0; remainingSampleCount = remainingSampleCount - 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field int remainingSampleCount>
	//*   2    4:ifle            66
		{
			dataScratch.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field ParsableByteArray dataScratch>
	//    5   11:invokevirtual   #70  <Method void ParsableByteArray.reset()>
			extractorinput.readFully(dataScratch.data, 0, 3);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #59  <Field ParsableByteArray dataScratch>
	//    9   19:getfield        #74  <Field byte[] ParsableByteArray.data>
	//   10   22:iconst_0        
	//   11   23:iconst_3        
	//   12   24:invokeinterface #102 <Method void ExtractorInput.readFully(byte[], int, int)>
			trackOutput.sampleData(dataScratch, 3);
	//   13   29:aload_0         
	//   14   30:getfield        #104 <Field TrackOutput trackOutput>
	//   15   33:aload_0         
	//   16   34:getfield        #59  <Field ParsableByteArray dataScratch>
	//   17   37:iconst_3        
	//   18   38:invokeinterface #110 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			sampleBytesWritten = sampleBytesWritten + 3;
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #112 <Field int sampleBytesWritten>
	//   22   48:iconst_3        
	//   23   49:iadd            
	//   24   50:putfield        #112 <Field int sampleBytesWritten>
		}

	//   25   53:aload_0         
	//   26   54:aload_0         
	//   27   55:getfield        #99  <Field int remainingSampleCount>
	//   28   58:iconst_1        
	//   29   59:isub            
	//   30   60:putfield        #99  <Field int remainingSampleCount>
	//*  31   63:goto            0
		if(sampleBytesWritten > 0)
	//*  32   66:aload_0         
	//*  33   67:getfield        #112 <Field int sampleBytesWritten>
	//*  34   70:ifle            93
			trackOutput.sampleMetadata(timestampUs, 1, sampleBytesWritten, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   35   73:aload_0         
	//   36   74:getfield        #104 <Field TrackOutput trackOutput>
	//   37   77:aload_0         
	//   38   78:getfield        #114 <Field long timestampUs>
	//   39   81:iconst_1        
	//   40   82:aload_0         
	//   41   83:getfield        #112 <Field int sampleBytesWritten>
	//   42   86:iconst_0        
	//   43   87:aconst_null     
	//   44   88:invokeinterface #118 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
	//   45   93:return          
	}

	private boolean parseTimestampAndSampleCount(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
label0:
		{
			dataScratch.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ParsableByteArray dataScratch>
	//    2    4:invokevirtual   #70  <Method void ParsableByteArray.reset()>
			if(version == 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #94  <Field int version>
	//*   5   11:ifne            57
			{
				if(!extractorinput.readFully(dataScratch.data, 0, 5, true))
	//*   6   14:aload_1         
	//*   7   15:aload_0         
	//*   8   16:getfield        #59  <Field ParsableByteArray dataScratch>
	//*   9   19:getfield        #74  <Field byte[] ParsableByteArray.data>
	//*  10   22:iconst_0        
	//*  11   23:iconst_5        
	//*  12   24:iconst_1        
	//*  13   25:invokeinterface #80  <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  14   30:ifne            35
					return false;
	//   15   33:iconst_0        
	//   16   34:ireturn         
				timestampUs = (dataScratch.readUnsignedInt() * 1000L) / 45L;
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #59  <Field ParsableByteArray dataScratch>
	//   20   40:invokevirtual   #123 <Method long ParsableByteArray.readUnsignedInt()>
	//   21   43:ldc2w           #124 <Long 1000L>
	//   22   46:lmul            
	//   23   47:ldc2w           #126 <Long 45L>
	//   24   50:ldiv            
	//   25   51:putfield        #114 <Field long timestampUs>
			} else
	//*  26   54:goto            98
			{
				if(version != 1)
					break label0;
	//   27   57:aload_0         
	//   28   58:getfield        #94  <Field int version>
	//   29   61:iconst_1        
	//   30   62:icmpne          116
				if(!extractorinput.readFully(dataScratch.data, 0, 9, true))
	//*  31   65:aload_1         
	//*  32   66:aload_0         
	//*  33   67:getfield        #59  <Field ParsableByteArray dataScratch>
	//*  34   70:getfield        #74  <Field byte[] ParsableByteArray.data>
	//*  35   73:iconst_0        
	//*  36   74:bipush          9
	//*  37   76:iconst_1        
	//*  38   77:invokeinterface #80  <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  39   82:ifne            87
					return false;
	//   40   85:iconst_0        
	//   41   86:ireturn         
				timestampUs = dataScratch.readLong();
	//   42   87:aload_0         
	//   43   88:aload_0         
	//   44   89:getfield        #59  <Field ParsableByteArray dataScratch>
	//   45   92:invokevirtual   #130 <Method long ParsableByteArray.readLong()>
	//   46   95:putfield        #114 <Field long timestampUs>
			}
			remainingSampleCount = dataScratch.readUnsignedByte();
	//   47   98:aload_0         
	//   48   99:aload_0         
	//   49  100:getfield        #59  <Field ParsableByteArray dataScratch>
	//   50  103:invokevirtual   #92  <Method int ParsableByteArray.readUnsignedByte()>
	//   51  106:putfield        #99  <Field int remainingSampleCount>
			sampleBytesWritten = 0;
	//   52  109:aload_0         
	//   53  110:iconst_0        
	//   54  111:putfield        #112 <Field int sampleBytesWritten>
			return true;
	//   55  114:iconst_1        
	//   56  115:ireturn         
		}
		extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   57  116:new             #132 <Class StringBuilder>
	//   58  119:dup             
	//   59  120:invokespecial   #133 <Method void StringBuilder()>
	//   60  123:astore_1        
		((StringBuilder) (extractorinput)).append("Unsupported version number: ");
	//   61  124:aload_1         
	//   62  125:ldc1            #135 <String "Unsupported version number: ">
	//   63  127:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   64  130:pop             
		((StringBuilder) (extractorinput)).append(version);
	//   65  131:aload_1         
	//   66  132:aload_0         
	//   67  133:getfield        #94  <Field int version>
	//   68  136:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   69  139:pop             
		throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//   70  140:new             #144 <Class ParserException>
	//   71  143:dup             
	//   72  144:aload_1         
	//   73  145:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   74  148:invokespecial   #149 <Method void ParserException(String)>
	//   75  151:athrow          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractoroutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L))));
	//    0    0:aload_1         
	//    1    1:new             #153 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//    2    4:dup             
	//    3    5:ldc2w           #154 <Long 0x1L>
	//    4    8:invokespecial   #158 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//    5   11:invokeinterface #164 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
		trackOutput = extractoroutput.track(0, 3);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:iconst_0        
	//    9   19:iconst_3        
	//   10   20:invokeinterface #168 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   11   25:putfield        #104 <Field TrackOutput trackOutput>
		extractoroutput.endTracks();
	//   12   28:aload_1         
	//   13   29:invokeinterface #171 <Method void ExtractorOutput.endTracks()>
		trackOutput.format(format);
	//   14   34:aload_0         
	//   15   35:getfield        #104 <Field TrackOutput trackOutput>
	//   16   38:aload_0         
	//   17   39:getfield        #52  <Field Format format>
	//   18   42:invokeinterface #173 <Method void TrackOutput.format(Format)>
	//   19   47:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		do
			switch(parserState)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int parserState>
			{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 75
	//	               1 52
	//	               2 40
			default:
				throw new IllegalStateException();
	//    3   32:new             #177 <Class IllegalStateException>
	//    4   35:dup             
	//    5   36:invokespecial   #178 <Method void IllegalStateException()>
	//    6   39:athrow          

			case 2: // '\002'
				parseSamples(extractorinput);
	//    7   40:aload_0         
	//    8   41:aload_1         
	//    9   42:invokespecial   #180 <Method void parseSamples(ExtractorInput)>
				parserState = 1;
	//   10   45:aload_0         
	//   11   46:iconst_1        
	//   12   47:putfield        #61  <Field int parserState>
				return 0;
	//   13   50:iconst_0        
	//   14   51:ireturn         

			case 1: // '\001'
				if(parseTimestampAndSampleCount(extractorinput))
	//*  15   52:aload_0         
	//*  16   53:aload_1         
	//*  17   54:invokespecial   #182 <Method boolean parseTimestampAndSampleCount(ExtractorInput)>
	//*  18   57:ifeq            68
				{
					parserState = 2;
	//   19   60:aload_0         
	//   20   61:iconst_2        
	//   21   62:putfield        #61  <Field int parserState>
				} else
	//*  22   65:goto            0
				{
					parserState = 0;
	//   23   68:aload_0         
	//   24   69:iconst_0        
	//   25   70:putfield        #61  <Field int parserState>
					return -1;
	//   26   73:iconst_m1       
	//   27   74:ireturn         
				}
				break;

			case 0: // '\0'
				if(parseHeader(extractorinput))
	//*  28   75:aload_0         
	//*  29   76:aload_1         
	//*  30   77:invokespecial   #184 <Method boolean parseHeader(ExtractorInput)>
	//*  31   80:ifeq            91
					parserState = 1;
	//   32   83:aload_0         
	//   33   84:iconst_1        
	//   34   85:putfield        #61  <Field int parserState>
				else
	//*  35   88:goto            0
					return -1;
	//   36   91:iconst_m1       
	//   37   92:ireturn         
				break;
			}
		while(true);
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		parserState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #61  <Field int parserState>
	//    3    5:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		dataScratch.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ParsableByteArray dataScratch>
	//    2    4:invokevirtual   #70  <Method void ParsableByteArray.reset()>
		byte abyte0[] = dataScratch.data;
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field ParsableByteArray dataScratch>
	//    5   11:getfield        #74  <Field byte[] ParsableByteArray.data>
	//    6   14:astore_3        
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		extractorinput.peekFully(abyte0, 0, 8);
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:bipush          8
	//   13   22:invokeinterface #191 <Method void ExtractorInput.peekFully(byte[], int, int)>
		if(dataScratch.readInt() == HEADER_ID)
	//*  14   27:aload_0         
	//*  15   28:getfield        #59  <Field ParsableByteArray dataScratch>
	//*  16   31:invokevirtual   #84  <Method int ParsableByteArray.readInt()>
	//*  17   34:getstatic       #45  <Field int HEADER_ID>
	//*  18   37:icmpne          42
			flag = true;
	//   19   40:iconst_1        
	//   20   41:istore_2        
		return flag;
	//   21   42:iload_2         
	//   22   43:ireturn         
	}

	private static final int HEADER_ID = Util.getIntegerCodeForString("RCC\001");
	private static final int HEADER_SIZE = 8;
	private static final int SCRATCH_SIZE = 9;
	private static final int STATE_READING_HEADER = 0;
	private static final int STATE_READING_SAMPLES = 2;
	private static final int STATE_READING_TIMESTAMP_AND_COUNT = 1;
	private static final int TIMESTAMP_SIZE_V0 = 4;
	private static final int TIMESTAMP_SIZE_V1 = 8;
	private final ParsableByteArray dataScratch = new ParsableByteArray(9);
	private final Format format;
	private int parserState;
	private int remainingSampleCount;
	private int sampleBytesWritten;
	private long timestampUs;
	private TrackOutput trackOutput;
	private int version;

	static 
	{
	//    0    0:ldc1            #37  <String "RCC\001">
	//    1    2:invokestatic    #43  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #45  <Field int HEADER_ID>
	//*   3    8:return          
	}
}
