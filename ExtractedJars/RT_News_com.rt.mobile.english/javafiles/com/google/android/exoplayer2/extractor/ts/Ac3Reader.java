// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader

public final class Ac3Reader
	implements ElementaryStreamReader
{

	public Ac3Reader()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #39  <Method void Ac3Reader(String)>
	//    3    5:return          
	}

	public Ac3Reader(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		headerScratchBits = new ParsableBitArray(new byte[128]);
	//    2    4:aload_0         
	//    3    5:new             #44  <Class ParsableBitArray>
	//    4    8:dup             
	//    5    9:sipush          128
	//    6   12:newarray        byte[]
	//    7   14:invokespecial   #47  <Method void ParsableBitArray(byte[])>
	//    8   17:putfield        #49  <Field ParsableBitArray headerScratchBits>
		headerScratchBytes = new ParsableByteArray(headerScratchBits.data);
	//    9   20:aload_0         
	//   10   21:new             #51  <Class ParsableByteArray>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:getfield        #49  <Field ParsableBitArray headerScratchBits>
	//   14   29:getfield        #55  <Field byte[] ParsableBitArray.data>
	//   15   32:invokespecial   #56  <Method void ParsableByteArray(byte[])>
	//   16   35:putfield        #58  <Field ParsableByteArray headerScratchBytes>
		state = 0;
	//   17   38:aload_0         
	//   18   39:iconst_0        
	//   19   40:putfield        #60  <Field int state>
		language = s;
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:putfield        #62  <Field String language>
	//   23   48:return          
	}

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #76  <Method int Math.min(int, int)>
	//    7   13:istore          4
		parsablebytearray.readBytes(abyte0, bytesRead, j);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #70  <Field int bytesRead>
	//   12   21:iload           4
	//   13   23:invokevirtual   #80  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #70  <Field int bytesRead>
	//   17   31:iload           4
	//   18   33:iadd            
	//   19   34:putfield        #70  <Field int bytesRead>
		return bytesRead == i;
	//   20   37:aload_0         
	//   21   38:getfield        #70  <Field int bytesRead>
	//   22   41:iload_3         
	//   23   42:icmpne          47
	//   24   45:iconst_1        
	//   25   46:ireturn         
	//   26   47:iconst_0        
	//   27   48:ireturn         
	}

	private void parseHeader()
	{
		headerScratchBits.setPosition(0);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ParsableBitArray headerScratchBits>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #85  <Method void ParsableBitArray.setPosition(int)>
		com.google.android.exoplayer2.audio.Ac3Util.SyncFrameInfo syncframeinfo = Ac3Util.parseAc3SyncframeInfo(headerScratchBits);
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field ParsableBitArray headerScratchBits>
	//    6   12:invokestatic    #91  <Method com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo Ac3Util.parseAc3SyncframeInfo(ParsableBitArray)>
	//    7   15:astore_1        
		if(format == null || syncframeinfo.channelCount != format.channelCount || syncframeinfo.sampleRate != format.sampleRate || syncframeinfo.mimeType != format.sampleMimeType)
	//*   8   16:aload_0         
	//*   9   17:getfield        #93  <Field Format format>
	//*  10   20:ifnull          65
	//*  11   23:aload_1         
	//*  12   24:getfield        #98  <Field int com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.channelCount>
	//*  13   27:aload_0         
	//*  14   28:getfield        #93  <Field Format format>
	//*  15   31:getfield        #101 <Field int Format.channelCount>
	//*  16   34:icmpne          65
	//*  17   37:aload_1         
	//*  18   38:getfield        #104 <Field int com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.sampleRate>
	//*  19   41:aload_0         
	//*  20   42:getfield        #93  <Field Format format>
	//*  21   45:getfield        #105 <Field int Format.sampleRate>
	//*  22   48:icmpne          65
	//*  23   51:aload_1         
	//*  24   52:getfield        #108 <Field String com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.mimeType>
	//*  25   55:aload_0         
	//*  26   56:getfield        #93  <Field Format format>
	//*  27   59:getfield        #111 <Field String Format.sampleMimeType>
	//*  28   62:if_acmpeq       111
		{
			format = Format.createAudioSampleFormat(trackFormatId, syncframeinfo.mimeType, ((String) (null)), -1, -1, syncframeinfo.channelCount, syncframeinfo.sampleRate, ((java.util.List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, language);
	//   29   65:aload_0         
	//   30   66:aload_0         
	//   31   67:getfield        #113 <Field String trackFormatId>
	//   32   70:aload_1         
	//   33   71:getfield        #108 <Field String com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.mimeType>
	//   34   74:aconst_null     
	//   35   75:iconst_m1       
	//   36   76:iconst_m1       
	//   37   77:aload_1         
	//   38   78:getfield        #98  <Field int com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.channelCount>
	//   39   81:aload_1         
	//   40   82:getfield        #104 <Field int com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.sampleRate>
	//   41   85:aconst_null     
	//   42   86:aconst_null     
	//   43   87:iconst_0        
	//   44   88:aload_0         
	//   45   89:getfield        #62  <Field String language>
	//   46   92:invokestatic    #117 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   47   95:putfield        #93  <Field Format format>
			output.format(format);
	//   48   98:aload_0         
	//   49   99:getfield        #119 <Field TrackOutput output>
	//   50  102:aload_0         
	//   51  103:getfield        #93  <Field Format format>
	//   52  106:invokeinterface #124 <Method void TrackOutput.format(Format)>
		}
		sampleSize = syncframeinfo.frameSize;
	//   53  111:aload_0         
	//   54  112:aload_1         
	//   55  113:getfield        #127 <Field int com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.frameSize>
	//   56  116:putfield        #129 <Field int sampleSize>
		sampleDurationUs = (0xf4240L * (long)syncframeinfo.sampleCount) / (long)format.sampleRate;
	//   57  119:aload_0         
	//   58  120:ldc2w           #130 <Long 0xf4240L>
	//   59  123:aload_1         
	//   60  124:getfield        #134 <Field int com.google.android.exoplayer2.audio.Ac3Util$SyncFrameInfo.sampleCount>
	//   61  127:i2l             
	//   62  128:lmul            
	//   63  129:aload_0         
	//   64  130:getfield        #93  <Field Format format>
	//   65  133:getfield        #105 <Field int Format.sampleRate>
	//   66  136:i2l             
	//   67  137:ldiv            
	//   68  138:putfield        #136 <Field long sampleDurationUs>
	//   69  141:return          
	}

	private boolean skipToNextSync(ParsableByteArray parsablebytearray)
	{
		do
		{
			int i = parsablebytearray.bytesLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method int ParsableByteArray.bytesLeft()>
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
	//*  10   15:getfield        #140 <Field boolean lastByteWas0B>
	//*  11   18:ifne            40
				{
					if(parsablebytearray.readUnsignedByte() == 11)
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #143 <Method int ParsableByteArray.readUnsignedByte()>
	//*  14   25:bipush          11
	//*  15   27:icmpne          32
						flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_3        
					lastByteWas0B = flag;
	//   18   32:aload_0         
	//   19   33:iload_3         
	//   20   34:putfield        #140 <Field boolean lastByteWas0B>
				} else
	//*  21   37:goto            0
				{
					int j = parsablebytearray.readUnsignedByte();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #143 <Method int ParsableByteArray.readUnsignedByte()>
	//   24   44:istore_2        
					if(j == 119)
	//*  25   45:iload_2         
	//*  26   46:bipush          119
	//*  27   48:icmpne          58
					{
						lastByteWas0B = false;
	//   28   51:aload_0         
	//   29   52:iconst_0        
	//   30   53:putfield        #140 <Field boolean lastByteWas0B>
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
	//   42   71:putfield        #140 <Field boolean lastByteWas0B>
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
	//    1    1:invokevirtual   #68  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            226
			switch(state)
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field int state>
			{
	//*   5   11:tableswitch     0 2: default 36
	//	               0 183
	//	               1 129
	//	               2 39
	//*   6   36:goto            0
			case 2: // '\002'
				int i = Math.min(parsablebytearray.bytesLeft(), sampleSize - bytesRead);
	//    7   39:aload_1         
	//    8   40:invokevirtual   #68  <Method int ParsableByteArray.bytesLeft()>
	//    9   43:aload_0         
	//   10   44:getfield        #129 <Field int sampleSize>
	//   11   47:aload_0         
	//   12   48:getfield        #70  <Field int bytesRead>
	//   13   51:isub            
	//   14   52:invokestatic    #76  <Method int Math.min(int, int)>
	//   15   55:istore_2        
				output.sampleData(parsablebytearray, i);
	//   16   56:aload_0         
	//   17   57:getfield        #119 <Field TrackOutput output>
	//   18   60:aload_1         
	//   19   61:iload_2         
	//   20   62:invokeinterface #149 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
				bytesRead = bytesRead + i;
	//   21   67:aload_0         
	//   22   68:aload_0         
	//   23   69:getfield        #70  <Field int bytesRead>
	//   24   72:iload_2         
	//   25   73:iadd            
	//   26   74:putfield        #70  <Field int bytesRead>
				if(bytesRead == sampleSize)
	//*  27   77:aload_0         
	//*  28   78:getfield        #70  <Field int bytesRead>
	//*  29   81:aload_0         
	//*  30   82:getfield        #129 <Field int sampleSize>
	//*  31   85:icmpne          0
				{
					output.sampleMetadata(timeUs, 1, sampleSize, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   32   88:aload_0         
	//   33   89:getfield        #119 <Field TrackOutput output>
	//   34   92:aload_0         
	//   35   93:getfield        #151 <Field long timeUs>
	//   36   96:iconst_1        
	//   37   97:aload_0         
	//   38   98:getfield        #129 <Field int sampleSize>
	//   39  101:iconst_0        
	//   40  102:aconst_null     
	//   41  103:invokeinterface #155 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
					timeUs = timeUs + sampleDurationUs;
	//   42  108:aload_0         
	//   43  109:aload_0         
	//   44  110:getfield        #151 <Field long timeUs>
	//   45  113:aload_0         
	//   46  114:getfield        #136 <Field long sampleDurationUs>
	//   47  117:ladd            
	//   48  118:putfield        #151 <Field long timeUs>
					state = 0;
	//   49  121:aload_0         
	//   50  122:iconst_0        
	//   51  123:putfield        #60  <Field int state>
				}
				break;

	//*  52  126:goto            0
			case 1: // '\001'
				if(continueRead(parsablebytearray, headerScratchBytes.data, 128))
	//*  53  129:aload_0         
	//*  54  130:aload_1         
	//*  55  131:aload_0         
	//*  56  132:getfield        #58  <Field ParsableByteArray headerScratchBytes>
	//*  57  135:getfield        #156 <Field byte[] ParsableByteArray.data>
	//*  58  138:sipush          128
	//*  59  141:invokespecial   #158 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  60  144:ifeq            0
				{
					parseHeader();
	//   61  147:aload_0         
	//   62  148:invokespecial   #160 <Method void parseHeader()>
					headerScratchBytes.setPosition(0);
	//   63  151:aload_0         
	//   64  152:getfield        #58  <Field ParsableByteArray headerScratchBytes>
	//   65  155:iconst_0        
	//   66  156:invokevirtual   #161 <Method void ParsableByteArray.setPosition(int)>
					output.sampleData(headerScratchBytes, 128);
	//   67  159:aload_0         
	//   68  160:getfield        #119 <Field TrackOutput output>
	//   69  163:aload_0         
	//   70  164:getfield        #58  <Field ParsableByteArray headerScratchBytes>
	//   71  167:sipush          128
	//   72  170:invokeinterface #149 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					state = 2;
	//   73  175:aload_0         
	//   74  176:iconst_2        
	//   75  177:putfield        #60  <Field int state>
				}
				break;

	//*  76  180:goto            0
			case 0: // '\0'
				if(skipToNextSync(parsablebytearray))
	//*  77  183:aload_0         
	//*  78  184:aload_1         
	//*  79  185:invokespecial   #163 <Method boolean skipToNextSync(ParsableByteArray)>
	//*  80  188:ifeq            0
				{
					state = 1;
	//   81  191:aload_0         
	//   82  192:iconst_1        
	//   83  193:putfield        #60  <Field int state>
					headerScratchBytes.data[0] = 11;
	//   84  196:aload_0         
	//   85  197:getfield        #58  <Field ParsableByteArray headerScratchBytes>
	//   86  200:getfield        #156 <Field byte[] ParsableByteArray.data>
	//   87  203:iconst_0        
	//   88  204:bipush          11
	//   89  206:bastore         
					headerScratchBytes.data[1] = 119;
	//   90  207:aload_0         
	//   91  208:getfield        #58  <Field ParsableByteArray headerScratchBytes>
	//   92  211:getfield        #156 <Field byte[] ParsableByteArray.data>
	//   93  214:iconst_1        
	//   94  215:bipush          119
	//   95  217:bastore         
					bytesRead = 2;
	//   96  218:aload_0         
	//   97  219:iconst_2        
	//   98  220:putfield        #70  <Field int bytesRead>
				}
				break;
			}
		} while(true);
	//   99  223:goto            0
	//  100  226:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #170 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		trackFormatId = trackidgenerator.getFormatId();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #174 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//    5    9:putfield        #113 <Field String trackFormatId>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #177 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   10   18:iconst_1        
	//   11   19:invokeinterface #183 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   12   24:putfield        #119 <Field TrackOutput output>
	//   13   27:return          
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
	//    2    2:putfield        #151 <Field long timeUs>
	//    3    5:return          
	}

	public void seek()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #60  <Field int state>
		bytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #70  <Field int bytesRead>
		lastByteWas0B = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #140 <Field boolean lastByteWas0B>
	//    9   15:return          
	}

	private static final int HEADER_SIZE = 128;
	private static final int STATE_FINDING_SYNC = 0;
	private static final int STATE_READING_HEADER = 1;
	private static final int STATE_READING_SAMPLE = 2;
	private int bytesRead;
	private Format format;
	private final ParsableBitArray headerScratchBits;
	private final ParsableByteArray headerScratchBytes;
	private final String language;
	private boolean lastByteWas0B;
	private TrackOutput output;
	private long sampleDurationUs;
	private int sampleSize;
	private int state;
	private long timeUs;
	private String trackFormatId;
}
