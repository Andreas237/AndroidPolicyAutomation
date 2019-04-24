// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			StreamReader, OggSeeker

final class FlacReader extends StreamReader
{
	private class FlacOggSeeker
		implements OggSeeker, SeekMap
	{

		public SeekMap createSeekMap()
		{
			return ((SeekMap) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public long getDurationUs()
		{
			return streamInfo.durationUs();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field FlacReader this$0>
		//    2    4:invokestatic    #46  <Method FlacStreamInfo FlacReader.access$000(FlacReader)>
		//    3    7:invokevirtual   #51  <Method long FlacStreamInfo.durationUs()>
		//    4   10:lreturn         
		}

		public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
		{
			long l1 = convertTimeToGranule(l);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field FlacReader this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #57  <Method long FlacReader.convertTimeToGranule(long)>
		//    4    8:lstore          4
			int i = Util.binarySearchFloor(seekPointGranules, l1, true, true);
		//    5   10:aload_0         
		//    6   11:getfield        #59  <Field long[] seekPointGranules>
		//    7   14:lload           4
		//    8   16:iconst_1        
		//    9   17:iconst_1        
		//   10   18:invokestatic    #65  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
		//   11   21:istore_3        
			l1 = convertGranuleToTime(seekPointGranules[i]);
		//   12   22:aload_0         
		//   13   23:getfield        #28  <Field FlacReader this$0>
		//   14   26:aload_0         
		//   15   27:getfield        #59  <Field long[] seekPointGranules>
		//   16   30:iload_3         
		//   17   31:laload          
		//   18   32:invokevirtual   #68  <Method long FlacReader.convertGranuleToTime(long)>
		//   19   35:lstore          4
			SeekPoint seekpoint = new SeekPoint(l1, firstFrameOffset + seekPointOffsets[i]);
		//   20   37:new             #70  <Class SeekPoint>
		//   21   40:dup             
		//   22   41:lload           4
		//   23   43:aload_0         
		//   24   44:getfield        #35  <Field long firstFrameOffset>
		//   25   47:aload_0         
		//   26   48:getfield        #72  <Field long[] seekPointOffsets>
		//   27   51:iload_3         
		//   28   52:laload          
		//   29   53:ladd            
		//   30   54:invokespecial   #75  <Method void SeekPoint(long, long)>
		//   31   57:astore          6
			if(l1 < l && i != seekPointGranules.length - 1)
		//*  32   59:lload           4
		//*  33   61:lload_1         
		//*  34   62:lcmp            
		//*  35   63:ifge            133
		//*  36   66:iload_3         
		//*  37   67:aload_0         
		//*  38   68:getfield        #59  <Field long[] seekPointGranules>
		//*  39   71:arraylength     
		//*  40   72:iconst_1        
		//*  41   73:isub            
		//*  42   74:icmpne          80
		//*  43   77:goto            133
			{
				FlacReader flacreader = FlacReader.this;
		//   44   80:aload_0         
		//   45   81:getfield        #28  <Field FlacReader this$0>
		//   46   84:astore          7
				long al[] = seekPointGranules;
		//   47   86:aload_0         
		//   48   87:getfield        #59  <Field long[] seekPointGranules>
		//   49   90:astore          8
				i++;
		//   50   92:iload_3         
		//   51   93:iconst_1        
		//   52   94:iadd            
		//   53   95:istore_3        
				return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint, new SeekPoint(flacreader.convertGranuleToTime(al[i]), firstFrameOffset + seekPointOffsets[i]));
		//   54   96:new             #77  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
		//   55   99:dup             
		//   56  100:aload           6
		//   57  102:new             #70  <Class SeekPoint>
		//   58  105:dup             
		//   59  106:aload           7
		//   60  108:aload           8
		//   61  110:iload_3         
		//   62  111:laload          
		//   63  112:invokevirtual   #68  <Method long FlacReader.convertGranuleToTime(long)>
		//   64  115:aload_0         
		//   65  116:getfield        #35  <Field long firstFrameOffset>
		//   66  119:aload_0         
		//   67  120:getfield        #72  <Field long[] seekPointOffsets>
		//   68  123:iload_3         
		//   69  124:laload          
		//   70  125:ladd            
		//   71  126:invokespecial   #75  <Method void SeekPoint(long, long)>
		//   72  129:invokespecial   #80  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint, SeekPoint)>
		//   73  132:areturn         
			} else
			{
				return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint);
		//   74  133:new             #77  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
		//   75  136:dup             
		//   76  137:aload           6
		//   77  139:invokespecial   #83  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
		//   78  142:areturn         
			}
		}

		public boolean isSeekable()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void parseSeekTable(ParsableByteArray parsablebytearray)
		{
			parsablebytearray.skipBytes(1);
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:invokevirtual   #93  <Method void ParsableByteArray.skipBytes(int)>
			int j = parsablebytearray.readUnsignedInt24() / 18;
		//    3    5:aload_1         
		//    4    6:invokevirtual   #97  <Method int ParsableByteArray.readUnsignedInt24()>
		//    5    9:bipush          18
		//    6   11:idiv            
		//    7   12:istore_3        
			seekPointGranules = new long[j];
		//    8   13:aload_0         
		//    9   14:iload_3         
		//   10   15:newarray        long[]
		//   11   17:putfield        #59  <Field long[] seekPointGranules>
			seekPointOffsets = new long[j];
		//   12   20:aload_0         
		//   13   21:iload_3         
		//   14   22:newarray        long[]
		//   15   24:putfield        #72  <Field long[] seekPointOffsets>
			for(int i = 0; i < j; i++)
		//*  16   27:iconst_0        
		//*  17   28:istore_2        
		//*  18   29:iload_2         
		//*  19   30:iload_3         
		//*  20   31:icmpge          66
			{
				seekPointGranules[i] = parsablebytearray.readLong();
		//   21   34:aload_0         
		//   22   35:getfield        #59  <Field long[] seekPointGranules>
		//   23   38:iload_2         
		//   24   39:aload_1         
		//   25   40:invokevirtual   #100 <Method long ParsableByteArray.readLong()>
		//   26   43:lastore         
				seekPointOffsets[i] = parsablebytearray.readLong();
		//   27   44:aload_0         
		//   28   45:getfield        #72  <Field long[] seekPointOffsets>
		//   29   48:iload_2         
		//   30   49:aload_1         
		//   31   50:invokevirtual   #100 <Method long ParsableByteArray.readLong()>
		//   32   53:lastore         
				parsablebytearray.skipBytes(2);
		//   33   54:aload_1         
		//   34   55:iconst_2        
		//   35   56:invokevirtual   #93  <Method void ParsableByteArray.skipBytes(int)>
			}

		//   36   59:iload_2         
		//   37   60:iconst_1        
		//   38   61:iadd            
		//   39   62:istore_2        
		//*  40   63:goto            29
		//   41   66:return          
		}

		public long read(ExtractorInput extractorinput)
			throws IOException, InterruptedException
		{
			if(pendingSeekGranule >= 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field long pendingSeekGranule>
		//*   2    4:lconst_0        
		//*   3    5:lcmp            
		//*   4    6:iflt            28
			{
				long l = -(pendingSeekGranule + 2L);
		//    5    9:aload_0         
		//    6   10:getfield        #37  <Field long pendingSeekGranule>
		//    7   13:ldc2w           #107 <Long 2L>
		//    8   16:ladd            
		//    9   17:lneg            
		//   10   18:lstore_2        
				pendingSeekGranule = -1L;
		//   11   19:aload_0         
		//   12   20:ldc2w           #32  <Long -1L>
		//   13   23:putfield        #37  <Field long pendingSeekGranule>
				return l;
		//   14   26:lload_2         
		//   15   27:lreturn         
			} else
			{
				return -1L;
		//   16   28:ldc2w           #32  <Long -1L>
		//   17   31:lreturn         
			}
		}

		public void setFirstFrameOffset(long l)
		{
			firstFrameOffset = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #35  <Field long firstFrameOffset>
		//    3    5:return          
		}

		public long startSeek(long l)
		{
			l = convertTimeToGranule(l);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field FlacReader this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #57  <Method long FlacReader.convertTimeToGranule(long)>
		//    4    8:lstore_1        
			int i = Util.binarySearchFloor(seekPointGranules, l, true, true);
		//    5    9:aload_0         
		//    6   10:getfield        #59  <Field long[] seekPointGranules>
		//    7   13:lload_1         
		//    8   14:iconst_1        
		//    9   15:iconst_1        
		//   10   16:invokestatic    #65  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
		//   11   19:istore_3        
			pendingSeekGranule = seekPointGranules[i];
		//   12   20:aload_0         
		//   13   21:aload_0         
		//   14   22:getfield        #59  <Field long[] seekPointGranules>
		//   15   25:iload_3         
		//   16   26:laload          
		//   17   27:putfield        #37  <Field long pendingSeekGranule>
			return l;
		//   18   30:lload_1         
		//   19   31:lreturn         
		}

		private static final int METADATA_LENGTH_OFFSET = 1;
		private static final int SEEK_POINT_SIZE = 18;
		private long firstFrameOffset;
		private long pendingSeekGranule;
		private long seekPointGranules[];
		private long seekPointOffsets[];
		final FlacReader this$0;

		public FlacOggSeeker()
		{
			this$0 = FlacReader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field FlacReader this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #31  <Method void Object()>
			firstFrameOffset = -1L;
		//    5    9:aload_0         
		//    6   10:ldc2w           #32  <Long -1L>
		//    7   13:putfield        #35  <Field long firstFrameOffset>
			pendingSeekGranule = -1L;
		//    8   16:aload_0         
		//    9   17:ldc2w           #32  <Long -1L>
		//   10   20:putfield        #37  <Field long pendingSeekGranule>
		//   11   23:return          
		}
	}


	FlacReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void StreamReader()>
	//    2    4:return          
	}

	private int getFlacFrameBlockSize(ParsableByteArray parsablebytearray)
	{
		int i = (parsablebytearray.data[2] & 0xff) >> 4;
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field byte[] ParsableByteArray.data>
	//    2    4:iconst_2        
	//    3    5:baload          
	//    4    6:sipush          255
	//    5    9:iand            
	//    6   10:iconst_4        
	//    7   11:ishr            
	//    8   12:istore_2        
		switch(i)
	//*   9   13:iload_2         
		{
	//*  10   14:tableswitch     1 15: default 88
	//	               1 145
	//	               2 137
	//	               3 137
	//	               4 137
	//	               5 137
	//	               6 99
	//	               7 99
	//	               8 90
	//	               9 90
	//	               10 90
	//	               11 90
	//	               12 90
	//	               13 90
	//	               14 90
	//	               15 90
		default:
			return -1;
	//   11   88:iconst_m1       
	//   12   89:ireturn         

		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 11: // '\013'
		case 12: // '\f'
		case 13: // '\r'
		case 14: // '\016'
		case 15: // '\017'
			return 256 << i - 8;
	//   13   90:sipush          256
	//   14   93:iload_2         
	//   15   94:bipush          8
	//   16   96:isub            
	//   17   97:ishl            
	//   18   98:ireturn         

		case 6: // '\006'
		case 7: // '\007'
			parsablebytearray.skipBytes(4);
	//   19   99:aload_1         
	//   20  100:iconst_4        
	//   21  101:invokevirtual   #40  <Method void ParsableByteArray.skipBytes(int)>
			parsablebytearray.readUtf8EncodedLong();
	//   22  104:aload_1         
	//   23  105:invokevirtual   #44  <Method long ParsableByteArray.readUtf8EncodedLong()>
	//   24  108:pop2            
			if(i == 6)
	//*  25  109:iload_2         
	//*  26  110:bipush          6
	//*  27  112:icmpne          123
				i = parsablebytearray.readUnsignedByte();
	//   28  115:aload_1         
	//   29  116:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//   30  119:istore_2        
			else
	//*  31  120:goto            128
				i = parsablebytearray.readUnsignedShort();
	//   32  123:aload_1         
	//   33  124:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedShort()>
	//   34  127:istore_2        
			parsablebytearray.setPosition(0);
	//   35  128:aload_1         
	//   36  129:iconst_0        
	//   37  130:invokevirtual   #54  <Method void ParsableByteArray.setPosition(int)>
			return i + 1;
	//   38  133:iload_2         
	//   39  134:iconst_1        
	//   40  135:iadd            
	//   41  136:ireturn         

		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return 576 << i - 2;
	//   42  137:sipush          576
	//   43  140:iload_2         
	//   44  141:iconst_2        
	//   45  142:isub            
	//   46  143:ishl            
	//   47  144:ireturn         

		case 1: // '\001'
			return 192;
	//   48  145:sipush          192
	//   49  148:ireturn         
		}
	}

	private static boolean isAudioPacket(byte abyte0[])
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(abyte0[0] == -1)
	//*   2    2:aload_0         
	//*   3    3:iconst_0        
	//*   4    4:baload          
	//*   5    5:iconst_m1       
	//*   6    6:icmpne          11
			flag = true;
	//    7    9:iconst_1        
	//    8   10:istore_1        
		return flag;
	//    9   11:iload_1         
	//   10   12:ireturn         
	}

	public static boolean verifyBitstreamType(ParsableByteArray parsablebytearray)
	{
		return parsablebytearray.bytesLeft() >= 5 && parsablebytearray.readUnsignedByte() == 127 && parsablebytearray.readUnsignedInt() == 0x464c4143L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iconst_5        
	//    3    5:icmplt          30
	//    4    8:aload_0         
	//    5    9:invokevirtual   #48  <Method int ParsableByteArray.readUnsignedByte()>
	//    6   12:bipush          127
	//    7   14:icmpne          30
	//    8   17:aload_0         
	//    9   18:invokevirtual   #64  <Method long ParsableByteArray.readUnsignedInt()>
	//   10   21:ldc2w           #65  <Long 0x464c4143L>
	//   11   24:lcmp            
	//   12   25:ifne            30
	//   13   28:iconst_1        
	//   14   29:ireturn         
	//   15   30:iconst_0        
	//   16   31:ireturn         
	}

	protected long preparePayload(ParsableByteArray parsablebytearray)
	{
		if(!isAudioPacket(parsablebytearray.data))
	//*   0    0:aload_1         
	//*   1    1:getfield        #36  <Field byte[] ParsableByteArray.data>
	//*   2    4:invokestatic    #70  <Method boolean isAudioPacket(byte[])>
	//*   3    7:ifne            14
			return -1L;
	//    4   10:ldc2w           #71  <Long -1L>
	//    5   13:lreturn         
		else
			return (long)getFlacFrameBlockSize(parsablebytearray);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #74  <Method int getFlacFrameBlockSize(ParsableByteArray)>
	//    9   19:i2l             
	//   10   20:lreturn         
	}

	protected boolean readHeaders(ParsableByteArray parsablebytearray, long l, StreamReader.SetupData setupdata)
		throws IOException, InterruptedException
	{
		byte abyte0[] = parsablebytearray.data;
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field byte[] ParsableByteArray.data>
	//    2    4:astore          5
		if(streamInfo == null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #28  <Field FlacStreamInfo streamInfo>
	//*   5   10:ifnonnull       91
		{
			streamInfo = new FlacStreamInfo(abyte0, 17);
	//    6   13:aload_0         
	//    7   14:new             #82  <Class FlacStreamInfo>
	//    8   17:dup             
	//    9   18:aload           5
	//   10   20:bipush          17
	//   11   22:invokespecial   #85  <Method void FlacStreamInfo(byte[], int)>
	//   12   25:putfield        #28  <Field FlacStreamInfo streamInfo>
			parsablebytearray = ((ParsableByteArray) (Arrays.copyOfRange(abyte0, 9, parsablebytearray.limit())));
	//   13   28:aload           5
	//   14   30:bipush          9
	//   15   32:aload_1         
	//   16   33:invokevirtual   #88  <Method int ParsableByteArray.limit()>
	//   17   36:invokestatic    #94  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   18   39:astore_1        
			parsablebytearray[4] = -128;
	//   19   40:aload_1         
	//   20   41:iconst_4        
	//   21   42:bipush          -128
	//   22   44:bastore         
			parsablebytearray = ((ParsableByteArray) (Collections.singletonList(((Object) (parsablebytearray)))));
	//   23   45:aload_1         
	//   24   46:invokestatic    #100 <Method java.util.List Collections.singletonList(Object)>
	//   25   49:astore_1        
			setupdata.format = Format.createAudioSampleFormat(((String) (null)), "audio/flac", ((String) (null)), -1, streamInfo.bitRate(), streamInfo.channels, streamInfo.sampleRate, ((java.util.List) (parsablebytearray)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)));
	//   26   50:aload           4
	//   27   52:aconst_null     
	//   28   53:ldc1            #102 <String "audio/flac">
	//   29   55:aconst_null     
	//   30   56:iconst_m1       
	//   31   57:aload_0         
	//   32   58:getfield        #28  <Field FlacStreamInfo streamInfo>
	//   33   61:invokevirtual   #105 <Method int FlacStreamInfo.bitRate()>
	//   34   64:aload_0         
	//   35   65:getfield        #28  <Field FlacStreamInfo streamInfo>
	//   36   68:getfield        #108 <Field int FlacStreamInfo.channels>
	//   37   71:aload_0         
	//   38   72:getfield        #28  <Field FlacStreamInfo streamInfo>
	//   39   75:getfield        #111 <Field int FlacStreamInfo.sampleRate>
	//   40   78:aload_1         
	//   41   79:aconst_null     
	//   42   80:iconst_0        
	//   43   81:aconst_null     
	//   44   82:invokestatic    #117 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   45   85:putfield        #123 <Field Format StreamReader$SetupData.format>
		} else
	//*  46   88:goto            159
		if((abyte0[0] & 0x7f) == 3)
	//*  47   91:aload           5
	//*  48   93:iconst_0        
	//*  49   94:baload          
	//*  50   95:bipush          127
	//*  51   97:iand            
	//*  52   98:iconst_3        
	//*  53   99:icmpne          125
		{
			flacOggSeeker = new FlacOggSeeker();
	//   54  102:aload_0         
	//   55  103:new             #6   <Class FlacReader$FlacOggSeeker>
	//   56  106:dup             
	//   57  107:aload_0         
	//   58  108:invokespecial   #126 <Method void FlacReader$FlacOggSeeker(FlacReader)>
	//   59  111:putfield        #128 <Field FlacReader$FlacOggSeeker flacOggSeeker>
			flacOggSeeker.parseSeekTable(parsablebytearray);
	//   60  114:aload_0         
	//   61  115:getfield        #128 <Field FlacReader$FlacOggSeeker flacOggSeeker>
	//   62  118:aload_1         
	//   63  119:invokevirtual   #132 <Method void FlacReader$FlacOggSeeker.parseSeekTable(ParsableByteArray)>
		} else
	//*  64  122:goto            159
		if(isAudioPacket(abyte0))
	//*  65  125:aload           5
	//*  66  127:invokestatic    #70  <Method boolean isAudioPacket(byte[])>
	//*  67  130:ifeq            159
		{
			if(flacOggSeeker != null)
	//*  68  133:aload_0         
	//*  69  134:getfield        #128 <Field FlacReader$FlacOggSeeker flacOggSeeker>
	//*  70  137:ifnull          157
			{
				flacOggSeeker.setFirstFrameOffset(l);
	//   71  140:aload_0         
	//   72  141:getfield        #128 <Field FlacReader$FlacOggSeeker flacOggSeeker>
	//   73  144:lload_2         
	//   74  145:invokevirtual   #136 <Method void FlacReader$FlacOggSeeker.setFirstFrameOffset(long)>
				setupdata.oggSeeker = ((OggSeeker) (flacOggSeeker));
	//   75  148:aload           4
	//   76  150:aload_0         
	//   77  151:getfield        #128 <Field FlacReader$FlacOggSeeker flacOggSeeker>
	//   78  154:putfield        #140 <Field OggSeeker StreamReader$SetupData.oggSeeker>
			}
			return false;
	//   79  157:iconst_0        
	//   80  158:ireturn         
		}
		return true;
	//   81  159:iconst_1        
	//   82  160:ireturn         
	}

	protected void reset(boolean flag)
	{
		super.reset(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #145 <Method void StreamReader.reset(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            19
		{
			streamInfo = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field FlacStreamInfo streamInfo>
			flacOggSeeker = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #128 <Field FlacReader$FlacOggSeeker flacOggSeeker>
		}
	//   11   19:return          
	}

	private static final byte AUDIO_PACKET_TYPE = -1;
	private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
	private static final byte SEEKTABLE_PACKET_TYPE = 3;
	private FlacOggSeeker flacOggSeeker;
	private FlacStreamInfo streamInfo;


/*
	static FlacStreamInfo access$000(FlacReader flacreader)
	{
		return flacreader.streamInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field FlacStreamInfo streamInfo>
	//    2    4:areturn         
	}

*/
}
