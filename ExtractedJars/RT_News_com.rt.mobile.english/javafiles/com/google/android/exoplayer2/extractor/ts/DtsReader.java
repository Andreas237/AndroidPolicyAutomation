// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			ElementaryStreamReader

public final class DtsReader
	implements ElementaryStreamReader
{

	public DtsReader(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #38  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:bipush          18
	//    6   11:newarray        byte[]
	//    7   13:invokespecial   #41  <Method void ParsableByteArray(byte[])>
	//    8   16:putfield        #43  <Field ParsableByteArray headerScratchBytes>
		state = 0;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #45  <Field int state>
		language = s;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #47  <Field String language>
	//   15   29:return          
	}

	private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
	{
		int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field int bytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #62  <Method int Math.min(int, int)>
	//    7   13:istore          4
		parsablebytearray.readBytes(abyte0, bytesRead, j);
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #56  <Field int bytesRead>
	//   12   21:iload           4
	//   13   23:invokevirtual   #66  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		bytesRead = bytesRead + j;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #56  <Field int bytesRead>
	//   17   31:iload           4
	//   18   33:iadd            
	//   19   34:putfield        #56  <Field int bytesRead>
		return bytesRead == i;
	//   20   37:aload_0         
	//   21   38:getfield        #56  <Field int bytesRead>
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
	//    1    1:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//    2    4:getfield        #71  <Field byte[] ParsableByteArray.data>
	//    3    7:astore_1        
		if(format == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #73  <Field Format format>
	//*   6   12:ifnonnull       45
		{
			format = DtsUtil.parseDtsFormat(abyte0, formatId, language, ((com.google.android.exoplayer2.drm.DrmInitData) (null)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #75  <Field String formatId>
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field String language>
	//   13   25:aconst_null     
	//   14   26:invokestatic    #81  <Method Format DtsUtil.parseDtsFormat(byte[], String, String, com.google.android.exoplayer2.drm.DrmInitData)>
	//   15   29:putfield        #73  <Field Format format>
			output.format(format);
	//   16   32:aload_0         
	//   17   33:getfield        #83  <Field TrackOutput output>
	//   18   36:aload_0         
	//   19   37:getfield        #73  <Field Format format>
	//   20   40:invokeinterface #88  <Method void TrackOutput.format(Format)>
		}
		sampleSize = DtsUtil.getDtsFrameSize(abyte0);
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokestatic    #92  <Method int DtsUtil.getDtsFrameSize(byte[])>
	//   24   50:putfield        #94  <Field int sampleSize>
		sampleDurationUs = (int)((0xf4240L * (long)DtsUtil.parseDtsAudioSampleCount(abyte0)) / (long)format.sampleRate);
	//   25   53:aload_0         
	//   26   54:ldc2w           #95  <Long 0xf4240L>
	//   27   57:aload_1         
	//   28   58:invokestatic    #99  <Method int DtsUtil.parseDtsAudioSampleCount(byte[])>
	//   29   61:i2l             
	//   30   62:lmul            
	//   31   63:aload_0         
	//   32   64:getfield        #73  <Field Format format>
	//   33   67:getfield        #104 <Field int Format.sampleRate>
	//   34   70:i2l             
	//   35   71:ldiv            
	//   36   72:l2i             
	//   37   73:i2l             
	//   38   74:putfield        #106 <Field long sampleDurationUs>
	//   39   77:return          
	}

	private boolean skipToNextSync(ParsableByteArray parsablebytearray)
	{
		while(parsablebytearray.bytesLeft() > 0) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #54  <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:ifle            134
		{
			syncBytes = syncBytes << 8;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #110 <Field int syncBytes>
	//    6   12:bipush          8
	//    7   14:ishl            
	//    8   15:putfield        #110 <Field int syncBytes>
			syncBytes = syncBytes | parsablebytearray.readUnsignedByte();
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #110 <Field int syncBytes>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #113 <Method int ParsableByteArray.readUnsignedByte()>
	//   14   27:ior             
	//   15   28:putfield        #110 <Field int syncBytes>
			if(DtsUtil.isSyncWord(syncBytes))
	//*  16   31:aload_0         
	//*  17   32:getfield        #110 <Field int syncBytes>
	//*  18   35:invokestatic    #117 <Method boolean DtsUtil.isSyncWord(int)>
	//*  19   38:ifeq            0
			{
				headerScratchBytes.data[0] = (byte)(syncBytes >> 24 & 0xff);
	//   20   41:aload_0         
	//   21   42:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//   22   45:getfield        #71  <Field byte[] ParsableByteArray.data>
	//   23   48:iconst_0        
	//   24   49:aload_0         
	//   25   50:getfield        #110 <Field int syncBytes>
	//   26   53:bipush          24
	//   27   55:ishr            
	//   28   56:sipush          255
	//   29   59:iand            
	//   30   60:int2byte        
	//   31   61:bastore         
				headerScratchBytes.data[1] = (byte)(syncBytes >> 16 & 0xff);
	//   32   62:aload_0         
	//   33   63:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//   34   66:getfield        #71  <Field byte[] ParsableByteArray.data>
	//   35   69:iconst_1        
	//   36   70:aload_0         
	//   37   71:getfield        #110 <Field int syncBytes>
	//   38   74:bipush          16
	//   39   76:ishr            
	//   40   77:sipush          255
	//   41   80:iand            
	//   42   81:int2byte        
	//   43   82:bastore         
				headerScratchBytes.data[2] = (byte)(syncBytes >> 8 & 0xff);
	//   44   83:aload_0         
	//   45   84:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//   46   87:getfield        #71  <Field byte[] ParsableByteArray.data>
	//   47   90:iconst_2        
	//   48   91:aload_0         
	//   49   92:getfield        #110 <Field int syncBytes>
	//   50   95:bipush          8
	//   51   97:ishr            
	//   52   98:sipush          255
	//   53  101:iand            
	//   54  102:int2byte        
	//   55  103:bastore         
				headerScratchBytes.data[3] = (byte)(syncBytes & 0xff);
	//   56  104:aload_0         
	//   57  105:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//   58  108:getfield        #71  <Field byte[] ParsableByteArray.data>
	//   59  111:iconst_3        
	//   60  112:aload_0         
	//   61  113:getfield        #110 <Field int syncBytes>
	//   62  116:sipush          255
	//   63  119:iand            
	//   64  120:int2byte        
	//   65  121:bastore         
				bytesRead = 4;
	//   66  122:aload_0         
	//   67  123:iconst_4        
	//   68  124:putfield        #56  <Field int bytesRead>
				syncBytes = 0;
	//   69  127:aload_0         
	//   70  128:iconst_0        
	//   71  129:putfield        #110 <Field int syncBytes>
				return true;
	//   72  132:iconst_1        
	//   73  133:ireturn         
			}
		}
		return false;
	//   74  134:iconst_0        
	//   75  135:ireturn         
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            197
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
	//    8   40:invokevirtual   #54  <Method int ParsableByteArray.bytesLeft()>
	//    9   43:aload_0         
	//   10   44:getfield        #94  <Field int sampleSize>
	//   11   47:aload_0         
	//   12   48:getfield        #56  <Field int bytesRead>
	//   13   51:isub            
	//   14   52:invokestatic    #62  <Method int Math.min(int, int)>
	//   15   55:istore_2        
				output.sampleData(parsablebytearray, i);
	//   16   56:aload_0         
	//   17   57:getfield        #83  <Field TrackOutput output>
	//   18   60:aload_1         
	//   19   61:iload_2         
	//   20   62:invokeinterface #123 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
				bytesRead = bytesRead + i;
	//   21   67:aload_0         
	//   22   68:aload_0         
	//   23   69:getfield        #56  <Field int bytesRead>
	//   24   72:iload_2         
	//   25   73:iadd            
	//   26   74:putfield        #56  <Field int bytesRead>
				if(bytesRead == sampleSize)
	//*  27   77:aload_0         
	//*  28   78:getfield        #56  <Field int bytesRead>
	//*  29   81:aload_0         
	//*  30   82:getfield        #94  <Field int sampleSize>
	//*  31   85:icmpne          0
				{
					output.sampleMetadata(timeUs, 1, sampleSize, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   32   88:aload_0         
	//   33   89:getfield        #83  <Field TrackOutput output>
	//   34   92:aload_0         
	//   35   93:getfield        #125 <Field long timeUs>
	//   36   96:iconst_1        
	//   37   97:aload_0         
	//   38   98:getfield        #94  <Field int sampleSize>
	//   39  101:iconst_0        
	//   40  102:aconst_null     
	//   41  103:invokeinterface #129 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
					timeUs = timeUs + sampleDurationUs;
	//   42  108:aload_0         
	//   43  109:aload_0         
	//   44  110:getfield        #125 <Field long timeUs>
	//   45  113:aload_0         
	//   46  114:getfield        #106 <Field long sampleDurationUs>
	//   47  117:ladd            
	//   48  118:putfield        #125 <Field long timeUs>
					state = 0;
	//   49  121:aload_0         
	//   50  122:iconst_0        
	//   51  123:putfield        #45  <Field int state>
				}
				break;

	//*  52  126:goto            0
			case 1: // '\001'
				if(continueRead(parsablebytearray, headerScratchBytes.data, 18))
	//*  53  129:aload_0         
	//*  54  130:aload_1         
	//*  55  131:aload_0         
	//*  56  132:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//*  57  135:getfield        #71  <Field byte[] ParsableByteArray.data>
	//*  58  138:bipush          18
	//*  59  140:invokespecial   #131 <Method boolean continueRead(ParsableByteArray, byte[], int)>
	//*  60  143:ifeq            0
				{
					parseHeader();
	//   61  146:aload_0         
	//   62  147:invokespecial   #133 <Method void parseHeader()>
					headerScratchBytes.setPosition(0);
	//   63  150:aload_0         
	//   64  151:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//   65  154:iconst_0        
	//   66  155:invokevirtual   #137 <Method void ParsableByteArray.setPosition(int)>
					output.sampleData(headerScratchBytes, 18);
	//   67  158:aload_0         
	//   68  159:getfield        #83  <Field TrackOutput output>
	//   69  162:aload_0         
	//   70  163:getfield        #43  <Field ParsableByteArray headerScratchBytes>
	//   71  166:bipush          18
	//   72  168:invokeinterface #123 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
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
	//*  79  183:invokespecial   #139 <Method boolean skipToNextSync(ParsableByteArray)>
	//*  80  186:ifeq            0
					state = 1;
	//   81  189:aload_0         
	//   82  190:iconst_1        
	//   83  191:putfield        #45  <Field int state>
				break;
			}
		} while(true);
	//   84  194:goto            0
	//   85  197:return          
	}

	public void createTracks(ExtractorOutput extractoroutput, TsPayloadReader.TrackIdGenerator trackidgenerator)
	{
		trackidgenerator.generateNewId();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #146 <Method void TsPayloadReader$TrackIdGenerator.generateNewId()>
		formatId = trackidgenerator.getFormatId();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #150 <Method String TsPayloadReader$TrackIdGenerator.getFormatId()>
	//    5    9:putfield        #75  <Field String formatId>
		output = extractoroutput.track(trackidgenerator.getTrackId(), 1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #153 <Method int TsPayloadReader$TrackIdGenerator.getTrackId()>
	//   10   18:iconst_1        
	//   11   19:invokeinterface #159 <Method TrackOutput ExtractorOutput.track(int, int)>
	//   12   24:putfield        #83  <Field TrackOutput output>
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
	//    2    2:putfield        #125 <Field long timeUs>
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
	//    5    7:putfield        #56  <Field int bytesRead>
		syncBytes = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #110 <Field int syncBytes>
	//    9   15:return          
	}

	private static final int HEADER_SIZE = 18;
	private static final int STATE_FINDING_SYNC = 0;
	private static final int STATE_READING_HEADER = 1;
	private static final int STATE_READING_SAMPLE = 2;
	private int bytesRead;
	private Format format;
	private String formatId;
	private final ParsableByteArray headerScratchBytes = new ParsableByteArray(new byte[18]);
	private final String language;
	private TrackOutput output;
	private long sampleDurationUs;
	private int sampleSize;
	private int state;
	private int syncBytes;
	private long timeUs;
}
