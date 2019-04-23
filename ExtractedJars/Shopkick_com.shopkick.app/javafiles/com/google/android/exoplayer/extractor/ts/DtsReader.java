// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.DtsUtil;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader

final class DtsReader extends ElementaryStreamReader
{

	public DtsReader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void ElementaryStreamReader(TrackOutput)>
	//    3    5:aload_0         
	//    4    6:new             #34  <Class ParsableByteArray>
	//    5    9:dup             
	//    6   10:bipush          15
	//    7   12:newarray        byte[]
	//    8   14:invokespecial   #37  <Method void ParsableByteArray(byte[])>
	//    9   17:putfield        #39  <Field ParsableByteArray headerScratchBytes>
		headerScratchBytes.data[0] = 127;
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//   12   24:getfield        #43  <Field byte[] ParsableByteArray.data>
	//   13   27:iconst_0        
	//   14   28:bipush          127
	//   15   30:bastore         
		headerScratchBytes.data[1] = -2;
	//   16   31:aload_0         
	//   17   32:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//   18   35:getfield        #43  <Field byte[] ParsableByteArray.data>
	//   19   38:iconst_1        
	//   20   39:bipush          -2
	//   21   41:bastore         
		headerScratchBytes.data[2] = -128;
	//   22   42:aload_0         
	//   23   43:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//   24   46:getfield        #43  <Field byte[] ParsableByteArray.data>
	//   25   49:iconst_2        
	//   26   50:bipush          -128
	//   27   52:bastore         
		headerScratchBytes.data[3] = 1;
	//   28   53:aload_0         
	//   29   54:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//   30   57:getfield        #43  <Field byte[] ParsableByteArray.data>
	//   31   60:iconst_3        
	//   32   61:iconst_1        
	//   33   62:bastore         
		state = 0;
	//   34   63:aload_0         
	//   35   64:iconst_0        
	//   36   65:putfield        #45  <Field int state>
	//   37   68:return          
	}

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #60  <Method int Math.min(int, int)>
	//    7   13:istore          4
		parsablebytearray.readBytes(abyte0, bytesRead, j);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #54  <Field int bytesRead>
	//   12   21:iload           4
	//   13   23:invokevirtual   #64  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #54  <Field int bytesRead>
	//   17   31:iload           4
	//   18   33:iadd            
	//   19   34:putfield        #54  <Field int bytesRead>
		return bytesRead == i;
	//   20   37:aload_0         
	//   21   38:getfield        #54  <Field int bytesRead>
	//   22   41:iload_3         
	//   23   42:icmpne          47
	//   24   45:iconst_1        
	//   25   46:ireturn         
	//   26   47:iconst_0        
	//   27   48:ireturn         
	}

	private void parseHeader()
	{
		byte abyte0[] = headerScratchBytes.data;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//    2    4:getfield        #43  <Field byte[] ParsableByteArray.data>
	//    3    7:astore_1        
		if(mediaFormat == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #68  <Field MediaFormat mediaFormat>
	//*   6   12:ifnonnull       41
		{
			mediaFormat = DtsUtil.parseDtsFormat(abyte0, ((String) (null)), -1L, ((String) (null)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aconst_null     
	//   10   18:ldc2w           #69  <Long -1L>
	//   11   21:aconst_null     
	//   12   22:invokestatic    #76  <Method MediaFormat DtsUtil.parseDtsFormat(byte[], String, long, String)>
	//   13   25:putfield        #68  <Field MediaFormat mediaFormat>
			output.format(mediaFormat);
	//   14   28:aload_0         
	//   15   29:getfield        #80  <Field TrackOutput output>
	//   16   32:aload_0         
	//   17   33:getfield        #68  <Field MediaFormat mediaFormat>
	//   18   36:invokeinterface #86  <Method void TrackOutput.format(MediaFormat)>
		}
		sampleSize = DtsUtil.getDtsFrameSize(abyte0);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokestatic    #90  <Method int DtsUtil.getDtsFrameSize(byte[])>
	//   22   46:putfield        #92  <Field int sampleSize>
		sampleDurationUs = (int)(((long)DtsUtil.parseDtsAudioSampleCount(abyte0) * 0xf4240L) / (long)mediaFormat.sampleRate);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokestatic    #95  <Method int DtsUtil.parseDtsAudioSampleCount(byte[])>
	//   26   54:i2l             
	//   27   55:ldc2w           #96  <Long 0xf4240L>
	//   28   58:lmul            
	//   29   59:aload_0         
	//   30   60:getfield        #68  <Field MediaFormat mediaFormat>
	//   31   63:getfield        #102 <Field int MediaFormat.sampleRate>
	//   32   66:i2l             
	//   33   67:ldiv            
	//   34   68:l2i             
	//   35   69:i2l             
	//   36   70:putfield        #104 <Field long sampleDurationUs>
	//   37   73:return          
	}

	private boolean skipToNextSync(ParsableByteArray parsablebytearray)
	{
		while(parsablebytearray.bytesLeft() > 0) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #52  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:ifle            47
		{
			syncBytes = syncBytes << 8;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #108 <Field int syncBytes>
	//    6   12:bipush          8
	//    7   14:ishl            
	//    8   15:putfield        #108 <Field int syncBytes>
			syncBytes = syncBytes | parsablebytearray.readUnsignedByte();
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #108 <Field int syncBytes>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #111 <Method int ParsableByteArray.readUnsignedByte()>
	//   14   27:ior             
	//   15   28:putfield        #108 <Field int syncBytes>
			if(syncBytes == 0x7ffe8001)
	//*  16   31:aload_0         
	//*  17   32:getfield        #108 <Field int syncBytes>
	//*  18   35:ldc1            #15  <Int 0x7ffe8001>
	//*  19   37:icmpne          0
			{
				syncBytes = 0;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #108 <Field int syncBytes>
				return true;
	//   23   45:iconst_1        
	//   24   46:ireturn         
			}
		}
		return false;
	//   25   47:iconst_0        
	//   26   48:ireturn         
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            202
			switch(state)
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field int state>
			{
	//*   5   11:tableswitch     0 2: default 36
	//	               0 181
	//	               1 129
	//	               2 39
	//*   6   36:goto            0
			case 2: // '\002'
				int i = Math.min(parsablebytearray.bytesLeft(), sampleSize - bytesRead);
	//    7   39:aload_1         
	//    8   40:invokevirtual   #52  <Method int ParsableByteArray.bytesLeft()>
	//    9   43:aload_0         
	//   10   44:getfield        #92  <Field int sampleSize>
	//   11   47:aload_0         
	//   12   48:getfield        #54  <Field int bytesRead>
	//   13   51:isub            
	//   14   52:invokestatic    #60  <Method int Math.min(int, int)>
	//   15   55:istore_2        
				output.sampleData(parsablebytearray, i);
	//   16   56:aload_0         
	//   17   57:getfield        #80  <Field TrackOutput output>
	//   18   60:aload_1         
	//   19   61:iload_2         
	//   20   62:invokeinterface #117 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
				bytesRead = bytesRead + i;
	//   21   67:aload_0         
	//   22   68:aload_0         
	//   23   69:getfield        #54  <Field int bytesRead>
	//   24   72:iload_2         
	//   25   73:iadd            
	//   26   74:putfield        #54  <Field int bytesRead>
				if(bytesRead == sampleSize)
	//*  27   77:aload_0         
	//*  28   78:getfield        #54  <Field int bytesRead>
	//*  29   81:aload_0         
	//*  30   82:getfield        #92  <Field int sampleSize>
	//*  31   85:icmpne          0
				{
					output.sampleMetadata(timeUs, 1, sampleSize, 0, ((byte []) (null)));
	//   32   88:aload_0         
	//   33   89:getfield        #80  <Field TrackOutput output>
	//   34   92:aload_0         
	//   35   93:getfield        #119 <Field long timeUs>
	//   36   96:iconst_1        
	//   37   97:aload_0         
	//   38   98:getfield        #92  <Field int sampleSize>
	//   39  101:iconst_0        
	//   40  102:aconst_null     
	//   41  103:invokeinterface #123 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
					timeUs = timeUs + sampleDurationUs;
	//   42  108:aload_0         
	//   43  109:aload_0         
	//   44  110:getfield        #119 <Field long timeUs>
	//   45  113:aload_0         
	//   46  114:getfield        #104 <Field long sampleDurationUs>
	//   47  117:ladd            
	//   48  118:putfield        #119 <Field long timeUs>
					state = 0;
	//   49  121:aload_0         
	//   50  122:iconst_0        
	//   51  123:putfield        #45  <Field int state>
				}
				break;

	//*  52  126:goto            0
			case 1: // '\001'
				if(continueRead(parsablebytearray, headerScratchBytes.data, 15))
	//*  53  129:aload_0         
	//*  54  130:aload_1         
	//*  55  131:aload_0         
	//*  56  132:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//*  57  135:getfield        #43  <Field byte[] ParsableByteArray.data>
	//*  58  138:bipush          15
	//*  59  140:invokespecial   #125 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  60  143:ifeq            0
				{
					parseHeader();
	//   61  146:aload_0         
	//   62  147:invokespecial   #127 <Method void parseHeader()>
					headerScratchBytes.setPosition(0);
	//   63  150:aload_0         
	//   64  151:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//   65  154:iconst_0        
	//   66  155:invokevirtual   #131 <Method void ParsableByteArray.setPosition(int)>
					output.sampleData(headerScratchBytes, 15);
	//   67  158:aload_0         
	//   68  159:getfield        #80  <Field TrackOutput output>
	//   69  162:aload_0         
	//   70  163:getfield        #39  <Field ParsableByteArray headerScratchBytes>
	//   71  166:bipush          15
	//   72  168:invokeinterface #117 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					state = 2;
	//   73  173:aload_0         
	//   74  174:iconst_2        
	//   75  175:putfield        #45  <Field int state>
				}
				break;

	//*  76  178:goto            0
			case 0: // '\0'
				if(skipToNextSync(parsablebytearray))
	//*  77  181:aload_0         
	//*  78  182:aload_1         
	//*  79  183:invokespecial   #133 <Method boolean skipToNextSync(ParsableByteArray)>
	//*  80  186:ifeq            0
				{
					bytesRead = 4;
	//   81  189:aload_0         
	//   82  190:iconst_4        
	//   83  191:putfield        #54  <Field int bytesRead>
					state = 1;
	//   84  194:aload_0         
	//   85  195:iconst_1        
	//   86  196:putfield        #45  <Field int state>
				}
				break;
			}
		} while(true);
	//   87  199:goto            0
	//   88  202:return          
	}

	public void packetFinished()
	{
	//    0    0:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		timeUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #119 <Field long timeUs>
	//    3    5:return          
	}

	public void seek()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #54  <Field int bytesRead>
		syncBytes = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #108 <Field int syncBytes>
	//    9   15:return          
	}

	private static final int HEADER_SIZE = 15;
	private static final int STATE_FINDING_SYNC = 0;
	private static final int STATE_READING_HEADER = 1;
	private static final int STATE_READING_SAMPLE = 2;
	private static final int SYNC_VALUE = 0x7ffe8001;
	private static final int SYNC_VALUE_SIZE = 4;
	private int bytesRead;
	private final ParsableByteArray headerScratchBytes = new ParsableByteArray(new byte[15]);
	private MediaFormat mediaFormat;
	private long sampleDurationUs;
	private int sampleSize;
	private int state;
	private int syncBytes;
	private long timeUs;
}
