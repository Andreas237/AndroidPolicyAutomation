// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader

final class Ac3Reader extends ElementaryStreamReader
{

	public Ac3Reader(TrackOutput trackoutput, boolean flag)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void ElementaryStreamReader(TrackOutput)>
		isEac3 = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #35  <Field boolean isEac3>
	//    6   10:aload_0         
	//    7   11:new             #37  <Class ParsableBitArray>
	//    8   14:dup             
	//    9   15:bipush          8
	//   10   17:newarray        byte[]
	//   11   19:invokespecial   #40  <Method void ParsableBitArray(byte[])>
	//   12   22:putfield        #42  <Field ParsableBitArray headerScratchBits>
		headerScratchBytes = new ParsableByteArray(headerScratchBits.data);
	//   13   25:aload_0         
	//   14   26:new             #44  <Class ParsableByteArray>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #42  <Field ParsableBitArray headerScratchBits>
	//   18   34:getfield        #48  <Field byte[] ParsableBitArray.data>
	//   19   37:invokespecial   #49  <Method void ParsableByteArray(byte[])>
	//   20   40:putfield        #51  <Field ParsableByteArray headerScratchBytes>
		state = 0;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #53  <Field int state>
	//   24   48:return          
	}

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #68  <Method int Math.min(int, int)>
	//    7   13:istore          4
		parsablebytearray.readBytes(abyte0, bytesRead, j);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #62  <Field int bytesRead>
	//   12   21:iload           4
	//   13   23:invokevirtual   #72  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #62  <Field int bytesRead>
	//   17   31:iload           4
	//   18   33:iadd            
	//   19   34:putfield        #62  <Field int bytesRead>
		return bytesRead == i;
	//   20   37:aload_0         
	//   21   38:getfield        #62  <Field int bytesRead>
	//   22   41:iload_3         
	//   23   42:icmpne          47
	//   24   45:iconst_1        
	//   25   46:ireturn         
	//   26   47:iconst_0        
	//   27   48:ireturn         
	}

	private void parseHeader()
	{
		if(mediaFormat == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field MediaFormat mediaFormat>
	//*   2    4:ifnonnull       61
		{
			MediaFormat mediaformat;
			if(isEac3)
	//*   3    7:aload_0         
	//*   4    8:getfield        #35  <Field boolean isEac3>
	//*   5   11:ifeq            30
				mediaformat = Ac3Util.parseEac3SyncframeFormat(headerScratchBits, ((String) (null)), -1L, ((String) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #42  <Field ParsableBitArray headerScratchBits>
	//    8   18:aconst_null     
	//    9   19:ldc2w           #77  <Long -1L>
	//   10   22:aconst_null     
	//   11   23:invokestatic    #84  <Method MediaFormat Ac3Util.parseEac3SyncframeFormat(ParsableBitArray, String, long, String)>
	//   12   26:astore_2        
			else
	//*  13   27:goto            43
				mediaformat = Ac3Util.parseAc3SyncframeFormat(headerScratchBits, ((String) (null)), -1L, ((String) (null)));
	//   14   30:aload_0         
	//   15   31:getfield        #42  <Field ParsableBitArray headerScratchBits>
	//   16   34:aconst_null     
	//   17   35:ldc2w           #77  <Long -1L>
	//   18   38:aconst_null     
	//   19   39:invokestatic    #87  <Method MediaFormat Ac3Util.parseAc3SyncframeFormat(ParsableBitArray, String, long, String)>
	//   20   42:astore_2        
			mediaFormat = mediaformat;
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:putfield        #76  <Field MediaFormat mediaFormat>
			output.format(mediaFormat);
	//   24   48:aload_0         
	//   25   49:getfield        #91  <Field TrackOutput output>
	//   26   52:aload_0         
	//   27   53:getfield        #76  <Field MediaFormat mediaFormat>
	//   28   56:invokeinterface #97  <Method void TrackOutput.format(MediaFormat)>
		}
		int i;
		if(isEac3)
	//*  29   61:aload_0         
	//*  30   62:getfield        #35  <Field boolean isEac3>
	//*  31   65:ifeq            82
			i = Ac3Util.parseEAc3SyncframeSize(headerScratchBits.data);
	//   32   68:aload_0         
	//   33   69:getfield        #42  <Field ParsableBitArray headerScratchBits>
	//   34   72:getfield        #48  <Field byte[] ParsableBitArray.data>
	//   35   75:invokestatic    #101 <Method int Ac3Util.parseEAc3SyncframeSize(byte[])>
	//   36   78:istore_1        
		else
	//*  37   79:goto            93
			i = Ac3Util.parseAc3SyncframeSize(headerScratchBits.data);
	//   38   82:aload_0         
	//   39   83:getfield        #42  <Field ParsableBitArray headerScratchBits>
	//   40   86:getfield        #48  <Field byte[] ParsableBitArray.data>
	//   41   89:invokestatic    #104 <Method int Ac3Util.parseAc3SyncframeSize(byte[])>
	//   42   92:istore_1        
		sampleSize = i;
	//   43   93:aload_0         
	//   44   94:iload_1         
	//   45   95:putfield        #106 <Field int sampleSize>
		if(isEac3)
	//*  46   98:aload_0         
	//*  47   99:getfield        #35  <Field boolean isEac3>
	//*  48  102:ifeq            119
			i = Ac3Util.parseEAc3SyncframeAudioSampleCount(headerScratchBits.data);
	//   49  105:aload_0         
	//   50  106:getfield        #42  <Field ParsableBitArray headerScratchBits>
	//   51  109:getfield        #48  <Field byte[] ParsableBitArray.data>
	//   52  112:invokestatic    #109 <Method int Ac3Util.parseEAc3SyncframeAudioSampleCount(byte[])>
	//   53  115:istore_1        
		else
	//*  54  116:goto            123
			i = Ac3Util.getAc3SyncframeAudioSampleCount();
	//   55  119:invokestatic    #112 <Method int Ac3Util.getAc3SyncframeAudioSampleCount()>
	//   56  122:istore_1        
		sampleDurationUs = (int)(((long)i * 0xf4240L) / (long)mediaFormat.sampleRate);
	//   57  123:aload_0         
	//   58  124:iload_1         
	//   59  125:i2l             
	//   60  126:ldc2w           #113 <Long 0xf4240L>
	//   61  129:lmul            
	//   62  130:aload_0         
	//   63  131:getfield        #76  <Field MediaFormat mediaFormat>
	//   64  134:getfield        #119 <Field int MediaFormat.sampleRate>
	//   65  137:i2l             
	//   66  138:ldiv            
	//   67  139:l2i             
	//   68  140:i2l             
	//   69  141:putfield        #121 <Field long sampleDurationUs>
	//   70  144:return          
	}

	private boolean skipToNextSync(ParsableByteArray parsablebytearray)
	{
		do
		{
			int i = parsablebytearray.bytesLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:istore_2        
			boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
			boolean flag = false;
	//    5    8:iconst_0        
	//    6    9:istore_3        
			if(i > 0)
	//*   7   10:iload_2         
	//*   8   11:ifle            77
			{
				if(!lastByteWas0B)
	//*   9   14:aload_0         
	//*  10   15:getfield        #125 <Field boolean lastByteWas0B>
	//*  11   18:ifne            40
				{
					if(parsablebytearray.readUnsignedByte() == 11)
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #128 <Method int ParsableByteArray.readUnsignedByte()>
	//*  14   25:bipush          11
	//*  15   27:icmpne          32
						flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_3        
					lastByteWas0B = flag;
	//   18   32:aload_0         
	//   19   33:iload_3         
	//   20   34:putfield        #125 <Field boolean lastByteWas0B>
				} else
	//*  21   37:goto            0
				{
					int j = parsablebytearray.readUnsignedByte();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #128 <Method int ParsableByteArray.readUnsignedByte()>
	//   24   44:istore_2        
					if(j == 119)
	//*  25   45:iload_2         
	//*  26   46:bipush          119
	//*  27   48:icmpne          58
					{
						lastByteWas0B = false;
	//   28   51:aload_0         
	//   29   52:iconst_0        
	//   30   53:putfield        #125 <Field boolean lastByteWas0B>
						return true;
	//   31   56:iconst_1        
	//   32   57:ireturn         
					}
					boolean flag1 = flag2;
	//   33   58:iload           4
	//   34   60:istore_3        
					if(j == 11)
	//*  35   61:iload_2         
	//*  36   62:bipush          11
	//*  37   64:icmpne          69
						flag1 = true;
	//   38   67:iconst_1        
	//   39   68:istore_3        
					lastByteWas0B = flag1;
	//   40   69:aload_0         
	//   41   70:iload_3         
	//   42   71:putfield        #125 <Field boolean lastByteWas0B>
				}
			} else
	//*  43   74:goto            0
			{
				return false;
	//   44   77:iconst_0        
	//   45   78:ireturn         
			}
		} while(true);
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            224
			switch(state)
	//*   3    7:aload_0         
	//*   4    8:getfield        #53  <Field int state>
			{
	//*   5   11:tableswitch     0 2: default 36
	//	               0 181
	//	               1 129
	//	               2 39
	//*   6   36:goto            0
			case 2: // '\002'
				int i = Math.min(parsablebytearray.bytesLeft(), sampleSize - bytesRead);
	//    7   39:aload_1         
	//    8   40:invokevirtual   #60  <Method int ParsableByteArray.bytesLeft()>
	//    9   43:aload_0         
	//   10   44:getfield        #106 <Field int sampleSize>
	//   11   47:aload_0         
	//   12   48:getfield        #62  <Field int bytesRead>
	//   13   51:isub            
	//   14   52:invokestatic    #68  <Method int Math.min(int, int)>
	//   15   55:istore_2        
				output.sampleData(parsablebytearray, i);
	//   16   56:aload_0         
	//   17   57:getfield        #91  <Field TrackOutput output>
	//   18   60:aload_1         
	//   19   61:iload_2         
	//   20   62:invokeinterface #134 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
				bytesRead = bytesRead + i;
	//   21   67:aload_0         
	//   22   68:aload_0         
	//   23   69:getfield        #62  <Field int bytesRead>
	//   24   72:iload_2         
	//   25   73:iadd            
	//   26   74:putfield        #62  <Field int bytesRead>
				if(bytesRead == sampleSize)
	//*  27   77:aload_0         
	//*  28   78:getfield        #62  <Field int bytesRead>
	//*  29   81:aload_0         
	//*  30   82:getfield        #106 <Field int sampleSize>
	//*  31   85:icmpne          0
				{
					output.sampleMetadata(timeUs, 1, sampleSize, 0, ((byte []) (null)));
	//   32   88:aload_0         
	//   33   89:getfield        #91  <Field TrackOutput output>
	//   34   92:aload_0         
	//   35   93:getfield        #136 <Field long timeUs>
	//   36   96:iconst_1        
	//   37   97:aload_0         
	//   38   98:getfield        #106 <Field int sampleSize>
	//   39  101:iconst_0        
	//   40  102:aconst_null     
	//   41  103:invokeinterface #140 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
					timeUs = timeUs + sampleDurationUs;
	//   42  108:aload_0         
	//   43  109:aload_0         
	//   44  110:getfield        #136 <Field long timeUs>
	//   45  113:aload_0         
	//   46  114:getfield        #121 <Field long sampleDurationUs>
	//   47  117:ladd            
	//   48  118:putfield        #136 <Field long timeUs>
					state = 0;
	//   49  121:aload_0         
	//   50  122:iconst_0        
	//   51  123:putfield        #53  <Field int state>
				}
				break;

	//*  52  126:goto            0
			case 1: // '\001'
				if(continueRead(parsablebytearray, headerScratchBytes.data, 8))
	//*  53  129:aload_0         
	//*  54  130:aload_1         
	//*  55  131:aload_0         
	//*  56  132:getfield        #51  <Field ParsableByteArray headerScratchBytes>
	//*  57  135:getfield        #141 <Field byte[] ParsableByteArray.data>
	//*  58  138:bipush          8
	//*  59  140:invokespecial   #143 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  60  143:ifeq            0
				{
					parseHeader();
	//   61  146:aload_0         
	//   62  147:invokespecial   #145 <Method void parseHeader()>
					headerScratchBytes.setPosition(0);
	//   63  150:aload_0         
	//   64  151:getfield        #51  <Field ParsableByteArray headerScratchBytes>
	//   65  154:iconst_0        
	//   66  155:invokevirtual   #149 <Method void ParsableByteArray.setPosition(int)>
					output.sampleData(headerScratchBytes, 8);
	//   67  158:aload_0         
	//   68  159:getfield        #91  <Field TrackOutput output>
	//   69  162:aload_0         
	//   70  163:getfield        #51  <Field ParsableByteArray headerScratchBytes>
	//   71  166:bipush          8
	//   72  168:invokeinterface #134 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					state = 2;
	//   73  173:aload_0         
	//   74  174:iconst_2        
	//   75  175:putfield        #53  <Field int state>
				}
				break;

	//*  76  178:goto            0
			case 0: // '\0'
				if(skipToNextSync(parsablebytearray))
	//*  77  181:aload_0         
	//*  78  182:aload_1         
	//*  79  183:invokespecial   #151 <Method boolean skipToNextSync(ParsableByteArray)>
	//*  80  186:ifeq            0
				{
					state = 1;
	//   81  189:aload_0         
	//   82  190:iconst_1        
	//   83  191:putfield        #53  <Field int state>
					headerScratchBytes.data[0] = 11;
	//   84  194:aload_0         
	//   85  195:getfield        #51  <Field ParsableByteArray headerScratchBytes>
	//   86  198:getfield        #141 <Field byte[] ParsableByteArray.data>
	//   87  201:iconst_0        
	//   88  202:bipush          11
	//   89  204:bastore         
					headerScratchBytes.data[1] = 119;
	//   90  205:aload_0         
	//   91  206:getfield        #51  <Field ParsableByteArray headerScratchBytes>
	//   92  209:getfield        #141 <Field byte[] ParsableByteArray.data>
	//   93  212:iconst_1        
	//   94  213:bipush          119
	//   95  215:bastore         
					bytesRead = 2;
	//   96  216:aload_0         
	//   97  217:iconst_2        
	//   98  218:putfield        #62  <Field int bytesRead>
				}
				break;
			}
		} while(true);
	//   99  221:goto            0
	//  100  224:return          
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
	//    2    2:putfield        #136 <Field long timeUs>
	//    3    5:return          
	}

	public void seek()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #53  <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #62  <Field int bytesRead>
		lastByteWas0B = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #125 <Field boolean lastByteWas0B>
	//    9   15:return          
	}

	private static final int HEADER_SIZE = 8;
	private static final int STATE_FINDING_SYNC = 0;
	private static final int STATE_READING_HEADER = 1;
	private static final int STATE_READING_SAMPLE = 2;
	private int bytesRead;
	private final ParsableBitArray headerScratchBits = new ParsableBitArray(new byte[8]);
	private final ParsableByteArray headerScratchBytes;
	private final boolean isEac3;
	private boolean lastByteWas0B;
	private MediaFormat mediaFormat;
	private long sampleDurationUs;
	private int sampleSize;
	private int state;
	private long timeUs;
}
