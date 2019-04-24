// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			OggPacket, DefaultOggSeeker, OggPageHeader, OggSeeker

abstract class StreamReader
{
	static class SetupData
	{

		Format format;
		OggSeeker oggSeeker;

		SetupData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class UnseekableOggSeeker
		implements OggSeeker
	{

		public SeekMap createSeekMap()
		{
			return ((SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L)));
		//    0    0:new             #20  <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
		//    1    3:dup             
		//    2    4:ldc2w           #21  <Long 0x1L>
		//    3    7:invokespecial   #25  <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
		//    4   10:areturn         
		}

		public long read(ExtractorInput extractorinput)
			throws IOException, InterruptedException
		{
			return -1L;
		//    0    0:ldc2w           #32  <Long -1L>
		//    1    3:lreturn         
		}

		public long startSeek(long l)
		{
			return 0L;
		//    0    0:lconst_0        
		//    1    1:lreturn         
		}

		private UnseekableOggSeeker()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public StreamReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class OggPacket>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void OggPacket()>
	//    6   12:putfield        #50  <Field OggPacket oggPacket>
	//    7   15:return          
	}

	private int readHeaders(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		do
		{
			if(!flag)
				break;
	//    2    2:iload_2         
	//    3    3:ifeq            80
			if(!oggPacket.populate(extractorinput))
	//*   4    6:aload_0         
	//*   5    7:getfield        #50  <Field OggPacket oggPacket>
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #61  <Method boolean OggPacket.populate(ExtractorInput)>
	//*   8   14:ifne            24
			{
				state = 3;
	//    9   17:aload_0         
	//   10   18:iconst_3        
	//   11   19:putfield        #63  <Field int state>
				return -1;
	//   12   22:iconst_m1       
	//   13   23:ireturn         
			}
			lengthOfReadPacket = extractorinput.getPosition() - payloadStartPosition;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokeinterface #69  <Method long ExtractorInput.getPosition()>
	//   17   31:aload_0         
	//   18   32:getfield        #71  <Field long payloadStartPosition>
	//   19   35:lsub            
	//   20   36:putfield        #73  <Field long lengthOfReadPacket>
			boolean flag1 = readHeaders(oggPacket.getPayload(), payloadStartPosition, setupData);
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #50  <Field OggPacket oggPacket>
	//   24   44:invokevirtual   #77  <Method ParsableByteArray OggPacket.getPayload()>
	//   25   47:aload_0         
	//   26   48:getfield        #71  <Field long payloadStartPosition>
	//   27   51:aload_0         
	//   28   52:getfield        #79  <Field StreamReader$SetupData setupData>
	//   29   55:invokevirtual   #82  <Method boolean readHeaders(ParsableByteArray, long, StreamReader$SetupData)>
	//   30   58:istore_3        
			flag = flag1;
	//   31   59:iload_3         
	//   32   60:istore_2        
			if(flag1)
	//*  33   61:iload_3         
	//*  34   62:ifeq            2
			{
				payloadStartPosition = extractorinput.getPosition();
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokeinterface #69  <Method long ExtractorInput.getPosition()>
	//   38   72:putfield        #71  <Field long payloadStartPosition>
				flag = flag1;
	//   39   75:iload_3         
	//   40   76:istore_2        
			}
		} while(true);
	//   41   77:goto            2
		sampleRate = setupData.format.sampleRate;
	//   42   80:aload_0         
	//   43   81:aload_0         
	//   44   82:getfield        #79  <Field StreamReader$SetupData setupData>
	//   45   85:getfield        #86  <Field Format StreamReader$SetupData.format>
	//   46   88:getfield        #90  <Field int Format.sampleRate>
	//   47   91:putfield        #91  <Field int sampleRate>
		if(!formatSet)
	//*  48   94:aload_0         
	//*  49   95:getfield        #93  <Field boolean formatSet>
	//*  50   98:ifne            122
		{
			trackOutput.format(setupData.format);
	//   51  101:aload_0         
	//   52  102:getfield        #95  <Field TrackOutput trackOutput>
	//   53  105:aload_0         
	//   54  106:getfield        #79  <Field StreamReader$SetupData setupData>
	//   55  109:getfield        #86  <Field Format StreamReader$SetupData.format>
	//   56  112:invokeinterface #100 <Method void TrackOutput.format(Format)>
			formatSet = true;
	//   57  117:aload_0         
	//   58  118:iconst_1        
	//   59  119:putfield        #93  <Field boolean formatSet>
		}
		if(setupData.oggSeeker != null)
	//*  60  122:aload_0         
	//*  61  123:getfield        #79  <Field StreamReader$SetupData setupData>
	//*  62  126:getfield        #102 <Field OggSeeker StreamReader$SetupData.oggSeeker>
	//*  63  129:ifnull          146
			oggSeeker = setupData.oggSeeker;
	//   64  132:aload_0         
	//   65  133:aload_0         
	//   66  134:getfield        #79  <Field StreamReader$SetupData setupData>
	//   67  137:getfield        #102 <Field OggSeeker StreamReader$SetupData.oggSeeker>
	//   68  140:putfield        #103 <Field OggSeeker oggSeeker>
		else
	//*  69  143:goto            221
		if(extractorinput.getLength() == -1L)
	//*  70  146:aload_1         
	//*  71  147:invokeinterface #106 <Method long ExtractorInput.getLength()>
	//*  72  152:ldc2w           #107 <Long -1L>
	//*  73  155:lcmp            
	//*  74  156:ifne            174
		{
			oggSeeker = ((OggSeeker) (new UnseekableOggSeeker()));
	//   75  159:aload_0         
	//   76  160:new             #11  <Class StreamReader$UnseekableOggSeeker>
	//   77  163:dup             
	//   78  164:aconst_null     
	//   79  165:invokespecial   #111 <Method void StreamReader$UnseekableOggSeeker(StreamReader$1)>
	//   80  168:putfield        #103 <Field OggSeeker oggSeeker>
		} else
	//*  81  171:goto            221
		{
			OggPageHeader oggpageheader = oggPacket.getPageHeader();
	//   82  174:aload_0         
	//   83  175:getfield        #50  <Field OggPacket oggPacket>
	//   84  178:invokevirtual   #115 <Method OggPageHeader OggPacket.getPageHeader()>
	//   85  181:astore          4
			oggSeeker = ((OggSeeker) (new DefaultOggSeeker(payloadStartPosition, extractorinput.getLength(), this, oggpageheader.headerSize + oggpageheader.bodySize, oggpageheader.granulePosition)));
	//   86  183:aload_0         
	//   87  184:new             #117 <Class DefaultOggSeeker>
	//   88  187:dup             
	//   89  188:aload_0         
	//   90  189:getfield        #71  <Field long payloadStartPosition>
	//   91  192:aload_1         
	//   92  193:invokeinterface #106 <Method long ExtractorInput.getLength()>
	//   93  198:aload_0         
	//   94  199:aload           4
	//   95  201:getfield        #122 <Field int OggPageHeader.headerSize>
	//   96  204:aload           4
	//   97  206:getfield        #125 <Field int OggPageHeader.bodySize>
	//   98  209:iadd            
	//   99  210:aload           4
	//  100  212:getfield        #128 <Field long OggPageHeader.granulePosition>
	//  101  215:invokespecial   #131 <Method void DefaultOggSeeker(long, long, StreamReader, int, long)>
	//  102  218:putfield        #103 <Field OggSeeker oggSeeker>
		}
		setupData = null;
	//  103  221:aload_0         
	//  104  222:aconst_null     
	//  105  223:putfield        #79  <Field StreamReader$SetupData setupData>
		state = 2;
	//  106  226:aload_0         
	//  107  227:iconst_2        
	//  108  228:putfield        #63  <Field int state>
		oggPacket.trimPayload();
	//  109  231:aload_0         
	//  110  232:getfield        #50  <Field OggPacket oggPacket>
	//  111  235:invokevirtual   #134 <Method void OggPacket.trimPayload()>
		return 0;
	//  112  238:iconst_0        
	//  113  239:ireturn         
	}

	private int readPayload(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		long l = oggSeeker.read(extractorinput);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field OggSeeker oggSeeker>
	//    2    4:aload_1         
	//    3    5:invokeinterface #143 <Method long OggSeeker.read(ExtractorInput)>
	//    4   10:lstore_3        
		if(l >= 0L)
	//*   5   11:lload_3         
	//*   6   12:lconst_0        
	//*   7   13:lcmp            
	//*   8   14:iflt            24
		{
			positionholder.position = l;
	//    9   17:aload_2         
	//   10   18:lload_3         
	//   11   19:putfield        #148 <Field long PositionHolder.position>
			return 1;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		}
		if(l < -1L)
	//*  14   24:lload_3         
	//*  15   25:ldc2w           #107 <Long -1L>
	//*  16   28:lcmp            
	//*  17   29:ifge            42
			onSeekEnd(-(l + 2L));
	//   18   32:aload_0         
	//   19   33:lload_3         
	//   20   34:ldc2w           #149 <Long 2L>
	//   21   37:ladd            
	//   22   38:lneg            
	//   23   39:invokevirtual   #154 <Method void onSeekEnd(long)>
		if(!seekMapSet)
	//*  24   42:aload_0         
	//*  25   43:getfield        #156 <Field boolean seekMapSet>
	//*  26   46:ifne            74
		{
			positionholder = ((PositionHolder) (oggSeeker.createSeekMap()));
	//   27   49:aload_0         
	//   28   50:getfield        #103 <Field OggSeeker oggSeeker>
	//   29   53:invokeinterface #160 <Method SeekMap OggSeeker.createSeekMap()>
	//   30   58:astore_2        
			extractorOutput.seekMap(((SeekMap) (positionholder)));
	//   31   59:aload_0         
	//   32   60:getfield        #162 <Field ExtractorOutput extractorOutput>
	//   33   63:aload_2         
	//   34   64:invokeinterface #168 <Method void ExtractorOutput.seekMap(SeekMap)>
			seekMapSet = true;
	//   35   69:aload_0         
	//   36   70:iconst_1        
	//   37   71:putfield        #156 <Field boolean seekMapSet>
		}
		if(lengthOfReadPacket <= 0L && !oggPacket.populate(extractorinput))
	//*  38   74:aload_0         
	//*  39   75:getfield        #73  <Field long lengthOfReadPacket>
	//*  40   78:lconst_0        
	//*  41   79:lcmp            
	//*  42   80:ifgt            104
	//*  43   83:aload_0         
	//*  44   84:getfield        #50  <Field OggPacket oggPacket>
	//*  45   87:aload_1         
	//*  46   88:invokevirtual   #61  <Method boolean OggPacket.populate(ExtractorInput)>
	//*  47   91:ifeq            97
	//*  48   94:goto            104
		{
			state = 3;
	//   49   97:aload_0         
	//   50   98:iconst_3        
	//   51   99:putfield        #63  <Field int state>
			return -1;
	//   52  102:iconst_m1       
	//   53  103:ireturn         
		}
		lengthOfReadPacket = 0L;
	//   54  104:aload_0         
	//   55  105:lconst_0        
	//   56  106:putfield        #73  <Field long lengthOfReadPacket>
		extractorinput = ((ExtractorInput) (oggPacket.getPayload()));
	//   57  109:aload_0         
	//   58  110:getfield        #50  <Field OggPacket oggPacket>
	//   59  113:invokevirtual   #77  <Method ParsableByteArray OggPacket.getPayload()>
	//   60  116:astore_1        
		l = preparePayload(((ParsableByteArray) (extractorinput)));
	//   61  117:aload_0         
	//   62  118:aload_1         
	//   63  119:invokevirtual   #172 <Method long preparePayload(ParsableByteArray)>
	//   64  122:lstore_3        
		if(l >= 0L && currentGranule + l >= targetGranule)
	//*  65  123:lload_3         
	//*  66  124:lconst_0        
	//*  67  125:lcmp            
	//*  68  126:iflt            192
	//*  69  129:aload_0         
	//*  70  130:getfield        #174 <Field long currentGranule>
	//*  71  133:lload_3         
	//*  72  134:ladd            
	//*  73  135:aload_0         
	//*  74  136:getfield        #176 <Field long targetGranule>
	//*  75  139:lcmp            
	//*  76  140:iflt            192
		{
			long l1 = convertGranuleToTime(currentGranule);
	//   77  143:aload_0         
	//   78  144:aload_0         
	//   79  145:getfield        #174 <Field long currentGranule>
	//   80  148:invokevirtual   #180 <Method long convertGranuleToTime(long)>
	//   81  151:lstore          5
			trackOutput.sampleData(((ParsableByteArray) (extractorinput)), ((ParsableByteArray) (extractorinput)).limit());
	//   82  153:aload_0         
	//   83  154:getfield        #95  <Field TrackOutput trackOutput>
	//   84  157:aload_1         
	//   85  158:aload_1         
	//   86  159:invokevirtual   #186 <Method int ParsableByteArray.limit()>
	//   87  162:invokeinterface #190 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			trackOutput.sampleMetadata(l1, 1, ((ParsableByteArray) (extractorinput)).limit(), 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   88  167:aload_0         
	//   89  168:getfield        #95  <Field TrackOutput trackOutput>
	//   90  171:lload           5
	//   91  173:iconst_1        
	//   92  174:aload_1         
	//   93  175:invokevirtual   #186 <Method int ParsableByteArray.limit()>
	//   94  178:iconst_0        
	//   95  179:aconst_null     
	//   96  180:invokeinterface #194 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
			targetGranule = -1L;
	//   97  185:aload_0         
	//   98  186:ldc2w           #107 <Long -1L>
	//   99  189:putfield        #176 <Field long targetGranule>
		}
		currentGranule = currentGranule + l;
	//  100  192:aload_0         
	//  101  193:aload_0         
	//  102  194:getfield        #174 <Field long currentGranule>
	//  103  197:lload_3         
	//  104  198:ladd            
	//  105  199:putfield        #174 <Field long currentGranule>
		return 0;
	//  106  202:iconst_0        
	//  107  203:ireturn         
	}

	protected long convertGranuleToTime(long l)
	{
		return (l * 0xf4240L) / (long)sampleRate;
	//    0    0:lload_1         
	//    1    1:ldc2w           #195 <Long 0xf4240L>
	//    2    4:lmul            
	//    3    5:aload_0         
	//    4    6:getfield        #91  <Field int sampleRate>
	//    5    9:i2l             
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	protected long convertTimeToGranule(long l)
	{
		return ((long)sampleRate * l) / 0xf4240L;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int sampleRate>
	//    2    4:i2l             
	//    3    5:lload_1         
	//    4    6:lmul            
	//    5    7:ldc2w           #195 <Long 0xf4240L>
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	void init(ExtractorOutput extractoroutput, TrackOutput trackoutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field ExtractorOutput extractorOutput>
		trackOutput = trackoutput;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #95  <Field TrackOutput trackOutput>
		reset(true);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #203 <Method void reset(boolean)>
	//    9   15:return          
	}

	protected void onSeekEnd(long l)
	{
		currentGranule = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #174 <Field long currentGranule>
	//    3    5:return          
	}

	protected abstract long preparePayload(ParsableByteArray parsablebytearray);

	final int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		switch(state)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int state>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 65
	//	               1 47
	//	               2 40
		default:
			throw new IllegalStateException();
	//    3   32:new             #205 <Class IllegalStateException>
	//    4   35:dup             
	//    5   36:invokespecial   #206 <Method void IllegalStateException()>
	//    6   39:athrow          

		case 2: // '\002'
			return readPayload(extractorinput, positionholder);
	//    7   40:aload_0         
	//    8   41:aload_1         
	//    9   42:aload_2         
	//   10   43:invokespecial   #208 <Method int readPayload(ExtractorInput, PositionHolder)>
	//   11   46:ireturn         

		case 1: // '\001'
			extractorinput.skipFully((int)payloadStartPosition);
	//   12   47:aload_1         
	//   13   48:aload_0         
	//   14   49:getfield        #71  <Field long payloadStartPosition>
	//   15   52:l2i             
	//   16   53:invokeinterface #212 <Method void ExtractorInput.skipFully(int)>
			state = 2;
	//   17   58:aload_0         
	//   18   59:iconst_2        
	//   19   60:putfield        #63  <Field int state>
			return 0;
	//   20   63:iconst_0        
	//   21   64:ireturn         

		case 0: // '\0'
			return readHeaders(extractorinput);
	//   22   65:aload_0         
	//   23   66:aload_1         
	//   24   67:invokespecial   #214 <Method int readHeaders(ExtractorInput)>
	//   25   70:ireturn         
		}
	}

	protected abstract boolean readHeaders(ParsableByteArray parsablebytearray, long l, SetupData setupdata)
		throws IOException, InterruptedException;

	protected void reset(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            28
		{
			setupData = new SetupData();
	//    2    4:aload_0         
	//    3    5:new             #8   <Class StreamReader$SetupData>
	//    4    8:dup             
	//    5    9:invokespecial   #215 <Method void StreamReader$SetupData()>
	//    6   12:putfield        #79  <Field StreamReader$SetupData setupData>
			payloadStartPosition = 0L;
	//    7   15:aload_0         
	//    8   16:lconst_0        
	//    9   17:putfield        #71  <Field long payloadStartPosition>
			state = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #63  <Field int state>
		} else
	//*  13   25:goto            33
		{
			state = 1;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #63  <Field int state>
		}
		targetGranule = -1L;
	//   17   33:aload_0         
	//   18   34:ldc2w           #107 <Long -1L>
	//   19   37:putfield        #176 <Field long targetGranule>
		currentGranule = 0L;
	//   20   40:aload_0         
	//   21   41:lconst_0        
	//   22   42:putfield        #174 <Field long currentGranule>
	//   23   45:return          
	}

	final void seek(long l, long l1)
	{
		oggPacket.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field OggPacket oggPacket>
	//    2    4:invokevirtual   #219 <Method void OggPacket.reset()>
		if(l == 0L)
	//*   3    7:lload_1         
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            24
		{
			reset(seekMapSet ^ true);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #156 <Field boolean seekMapSet>
	//   10   18:iconst_1        
	//   11   19:ixor            
	//   12   20:invokevirtual   #203 <Method void reset(boolean)>
			return;
	//   13   23:return          
		}
		if(state != 0)
	//*  14   24:aload_0         
	//*  15   25:getfield        #63  <Field int state>
	//*  16   28:ifeq            50
		{
			targetGranule = oggSeeker.startSeek(l1);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #103 <Field OggSeeker oggSeeker>
	//   20   36:lload_3         
	//   21   37:invokeinterface #222 <Method long OggSeeker.startSeek(long)>
	//   22   42:putfield        #176 <Field long targetGranule>
			state = 2;
	//   23   45:aload_0         
	//   24   46:iconst_2        
	//   25   47:putfield        #63  <Field int state>
		}
	//   26   50:return          
	}

	private static final int STATE_END_OF_INPUT = 3;
	private static final int STATE_READ_HEADERS = 0;
	private static final int STATE_READ_PAYLOAD = 2;
	private static final int STATE_SKIP_HEADERS = 1;
	private long currentGranule;
	private ExtractorOutput extractorOutput;
	private boolean formatSet;
	private long lengthOfReadPacket;
	private final OggPacket oggPacket = new OggPacket();
	private OggSeeker oggSeeker;
	private long payloadStartPosition;
	private int sampleRate;
	private boolean seekMapSet;
	private SetupData setupData;
	private int state;
	private long targetGranule;
	private TrackOutput trackOutput;
}
