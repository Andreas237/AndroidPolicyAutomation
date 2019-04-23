// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			StreamReader, OggSeeker, OggUtil, VorbisUtil, 
//			OggParser

final class VorbisReader extends StreamReader
	implements SeekMap
{
	static final class VorbisSetup
	{

		public final VorbisUtil.CommentHeader commentHeader;
		public final int iLogModes;
		public final VorbisUtil.VorbisIdHeader idHeader;
		public final VorbisUtil.Mode modes[];
		public final byte setupHeaderData[];

		public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisidheader, VorbisUtil.CommentHeader commentheader, byte abyte0[], VorbisUtil.Mode amode[], int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			idHeader = vorbisidheader;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field VorbisUtil$VorbisIdHeader idHeader>
			commentHeader = commentheader;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field VorbisUtil$CommentHeader commentHeader>
			setupHeaderData = abyte0;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field byte[] setupHeaderData>
			modes = amode;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field VorbisUtil$Mode[] modes>
			iLogModes = i;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #32  <Field int iLogModes>
		//   17   31:return          
		}
	}


	VorbisReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void StreamReader()>
	//    2    4:aload_0         
	//    3    5:new             #37  <Class OggSeeker>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void OggSeeker()>
	//    6   12:putfield        #40  <Field OggSeeker oggSeeker>
		targetGranule = -1L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #41  <Long -1L>
	//    9   19:putfield        #44  <Field long targetGranule>
	//   10   22:return          
	}

	static void appendNumberOfSamples(ParsableByteArray parsablebytearray, long l)
	{
		parsablebytearray.setLimit(parsablebytearray.limit() + 4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//    3    5:iconst_4        
	//    4    6:iadd            
	//    5    7:invokevirtual   #57  <Method void ParsableByteArray.setLimit(int)>
		parsablebytearray.data[parsablebytearray.limit() - 4] = (byte)(int)(l & 255L);
	//    6   10:aload_0         
	//    7   11:getfield        #61  <Field byte[] ParsableByteArray.data>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//   10   18:iconst_4        
	//   11   19:isub            
	//   12   20:lload_1         
	//   13   21:ldc2w           #62  <Long 255L>
	//   14   24:land            
	//   15   25:l2i             
	//   16   26:int2byte        
	//   17   27:bastore         
		parsablebytearray.data[parsablebytearray.limit() - 3] = (byte)(int)(l >>> 8 & 255L);
	//   18   28:aload_0         
	//   19   29:getfield        #61  <Field byte[] ParsableByteArray.data>
	//   20   32:aload_0         
	//   21   33:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//   22   36:iconst_3        
	//   23   37:isub            
	//   24   38:lload_1         
	//   25   39:bipush          8
	//   26   41:lushr           
	//   27   42:ldc2w           #62  <Long 255L>
	//   28   45:land            
	//   29   46:l2i             
	//   30   47:int2byte        
	//   31   48:bastore         
		parsablebytearray.data[parsablebytearray.limit() - 2] = (byte)(int)(l >>> 16 & 255L);
	//   32   49:aload_0         
	//   33   50:getfield        #61  <Field byte[] ParsableByteArray.data>
	//   34   53:aload_0         
	//   35   54:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//   36   57:iconst_2        
	//   37   58:isub            
	//   38   59:lload_1         
	//   39   60:bipush          16
	//   40   62:lushr           
	//   41   63:ldc2w           #62  <Long 255L>
	//   42   66:land            
	//   43   67:l2i             
	//   44   68:int2byte        
	//   45   69:bastore         
		parsablebytearray.data[parsablebytearray.limit() - 1] = (byte)(int)(l >>> 24 & 255L);
	//   46   70:aload_0         
	//   47   71:getfield        #61  <Field byte[] ParsableByteArray.data>
	//   48   74:aload_0         
	//   49   75:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//   50   78:iconst_1        
	//   51   79:isub            
	//   52   80:lload_1         
	//   53   81:bipush          24
	//   54   83:lushr           
	//   55   84:ldc2w           #62  <Long 255L>
	//   56   87:land            
	//   57   88:l2i             
	//   58   89:int2byte        
	//   59   90:bastore         
	//   60   91:return          
	}

	private static int decodeBlockSize(byte byte0, VorbisSetup vorbissetup)
	{
		int i = OggUtil.readBits(byte0, vorbissetup.iLogModes, 1);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #68  <Field int VorbisReader$VorbisSetup.iLogModes>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #74  <Method int OggUtil.readBits(byte, int, int)>
	//    5    9:istore_2        
		if(!vorbissetup.modes[i].blockFlag)
	//*   6   10:aload_1         
	//*   7   11:getfield        #78  <Field VorbisUtil$Mode[] VorbisReader$VorbisSetup.modes>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:getfield        #83  <Field boolean VorbisUtil$Mode.blockFlag>
	//*  11   19:ifne            30
			return vorbissetup.idHeader.blockSize0;
	//   12   22:aload_1         
	//   13   23:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   14   26:getfield        #91  <Field int VorbisUtil$VorbisIdHeader.blockSize0>
	//   15   29:ireturn         
		else
			return vorbissetup.idHeader.blockSize1;
	//   16   30:aload_1         
	//   17   31:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   18   34:getfield        #94  <Field int VorbisUtil$VorbisIdHeader.blockSize1>
	//   19   37:ireturn         
	}

	static boolean verifyBitstreamType(ParsableByteArray parsablebytearray)
	{
		boolean flag;
		try
		{
			flag = VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsablebytearray, true);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #104 <Method boolean VorbisUtil.verifyVorbisHeaderCapturePattern(int, ParsableByteArray, boolean)>
	//    4    6:istore_1        
		}
	//*   5    7:iload_1         
	//*   6    8:ireturn         
	//*   7    9:iconst_0        
	//*   8   10:ireturn         
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
		{
			return false;
		}
		return flag;
	//*   9   11:astore_0        
	//*  10   12:goto            9
	}

	public long getPosition(long l)
	{
		if(l == 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            18
		{
			targetGranule = -1L;
	//    4    6:aload_0         
	//    5    7:ldc2w           #41  <Long -1L>
	//    6   10:putfield        #44  <Field long targetGranule>
			return audioStartPosition;
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field long audioStartPosition>
	//    9   17:lreturn         
		} else
		{
			targetGranule = (vorbisSetup.idHeader.sampleRate * l) / 0xf4240L;
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//   13   23:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   14   26:getfield        #113 <Field long VorbisUtil$VorbisIdHeader.sampleRate>
	//   15   29:lload_1         
	//   16   30:lmul            
	//   17   31:ldc2w           #114 <Long 0xf4240L>
	//   18   34:ldiv            
	//   19   35:putfield        #44  <Field long targetGranule>
			long l1 = audioStartPosition;
	//   20   38:aload_0         
	//   21   39:getfield        #108 <Field long audioStartPosition>
	//   22   42:lstore_3        
			return Math.max(l1, ((inputLength - l1) * l) / duration - 4000L);
	//   23   43:lload_3         
	//   24   44:aload_0         
	//   25   45:getfield        #117 <Field long inputLength>
	//   26   48:lload_3         
	//   27   49:lsub            
	//   28   50:lload_1         
	//   29   51:lmul            
	//   30   52:aload_0         
	//   31   53:getfield        #119 <Field long duration>
	//   32   56:ldiv            
	//   33   57:ldc2w           #120 <Long 4000L>
	//   34   60:lsub            
	//   35   61:invokestatic    #127 <Method long Math.max(long, long)>
	//   36   64:lreturn         
		}
	}

	public boolean isSeekable()
	{
		return vorbisSetup != null && inputLength != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #117 <Field long inputLength>
	//    5   11:ldc2w           #41  <Long -1L>
	//    6   14:lcmp            
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(totalSamples == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field long totalSamples>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            307
		{
			if(vorbisSetup == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//*   7   13:ifnonnull       90
			{
				inputLength = extractorinput.getLength();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokeinterface #143 <Method long ExtractorInput.getLength()>
	//   11   23:putfield        #117 <Field long inputLength>
				vorbisSetup = readSetupHeaders(extractorinput, scratch);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #147 <Field ParsableByteArray scratch>
	//   17   33:invokevirtual   #151 <Method VorbisReader$VorbisSetup readSetupHeaders(ExtractorInput, ParsableByteArray)>
	//   18   36:putfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
				audioStartPosition = extractorinput.getPosition();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokeinterface #153 <Method long ExtractorInput.getPosition()>
	//   22   46:putfield        #108 <Field long audioStartPosition>
				extractorOutput.seekMap(((SeekMap) (this)));
	//   23   49:aload_0         
	//   24   50:getfield        #157 <Field ExtractorOutput extractorOutput>
	//   25   53:aload_0         
	//   26   54:invokeinterface #163 <Method void ExtractorOutput.seekMap(SeekMap)>
				if(inputLength != -1L)
	//*  27   59:aload_0         
	//*  28   60:getfield        #117 <Field long inputLength>
	//*  29   63:ldc2w           #41  <Long -1L>
	//*  30   66:lcmp            
	//*  31   67:ifeq            90
				{
					positionholder.position = Math.max(0L, extractorinput.getLength() - 8000L);
	//   32   70:aload_2         
	//   33   71:lconst_0        
	//   34   72:aload_1         
	//   35   73:invokeinterface #143 <Method long ExtractorInput.getLength()>
	//   36   78:ldc2w           #12  <Long 8000L>
	//   37   81:lsub            
	//   38   82:invokestatic    #127 <Method long Math.max(long, long)>
	//   39   85:putfield        #168 <Field long PositionHolder.position>
					return 1;
	//   40   88:iconst_1        
	//   41   89:ireturn         
				}
			}
			long l;
			if(inputLength == -1L)
	//*  42   90:aload_0         
	//*  43   91:getfield        #117 <Field long inputLength>
	//*  44   94:ldc2w           #41  <Long -1L>
	//*  45   97:lcmp            
	//*  46   98:ifne            109
				l = -1L;
	//   47  101:ldc2w           #41  <Long -1L>
	//   48  104:lstore          5
			else
	//*  49  106:goto            119
				l = oggParser.readGranuleOfLastPage(extractorinput);
	//   50  109:aload_0         
	//   51  110:getfield        #172 <Field OggParser oggParser>
	//   52  113:aload_1         
	//   53  114:invokevirtual   #178 <Method long OggParser.readGranuleOfLastPage(ExtractorInput)>
	//   54  117:lstore          5
			totalSamples = l;
	//   55  119:aload_0         
	//   56  120:lload           5
	//   57  122:putfield        #137 <Field long totalSamples>
			ArrayList arraylist = new ArrayList();
	//   58  125:new             #180 <Class ArrayList>
	//   59  128:dup             
	//   60  129:invokespecial   #181 <Method void ArrayList()>
	//   61  132:astore          9
			arraylist.add(((Object) (vorbisSetup.idHeader.data)));
	//   62  134:aload           9
	//   63  136:aload_0         
	//   64  137:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//   65  140:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   66  143:getfield        #182 <Field byte[] VorbisUtil$VorbisIdHeader.data>
	//   67  146:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
	//   68  149:pop             
			arraylist.add(((Object) (vorbisSetup.setupHeaderData)));
	//   69  150:aload           9
	//   70  152:aload_0         
	//   71  153:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//   72  156:getfield        #189 <Field byte[] VorbisReader$VorbisSetup.setupHeaderData>
	//   73  159:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
	//   74  162:pop             
			if(inputLength == -1L)
	//*  75  163:aload_0         
	//*  76  164:getfield        #117 <Field long inputLength>
	//*  77  167:ldc2w           #41  <Long -1L>
	//*  78  170:lcmp            
	//*  79  171:ifne            182
				l = -1L;
	//   80  174:ldc2w           #41  <Long -1L>
	//   81  177:lstore          5
			else
	//*  82  179:goto            203
				l = (totalSamples * 0xf4240L) / vorbisSetup.idHeader.sampleRate;
	//   83  182:aload_0         
	//   84  183:getfield        #137 <Field long totalSamples>
	//   85  186:ldc2w           #114 <Long 0xf4240L>
	//   86  189:lmul            
	//   87  190:aload_0         
	//   88  191:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//   89  194:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//   90  197:getfield        #113 <Field long VorbisUtil$VorbisIdHeader.sampleRate>
	//   91  200:ldiv            
	//   92  201:lstore          5
			duration = l;
	//   93  203:aload_0         
	//   94  204:lload           5
	//   95  206:putfield        #119 <Field long duration>
			trackOutput.format(MediaFormat.createAudioFormat(((String) (null)), "audio/vorbis", vorbisSetup.idHeader.bitrateNominal, 65025, duration, vorbisSetup.idHeader.channels, (int)vorbisSetup.idHeader.sampleRate, ((java.util.List) (arraylist)), ((String) (null))));
	//   96  209:aload_0         
	//   97  210:getfield        #193 <Field TrackOutput trackOutput>
	//   98  213:aconst_null     
	//   99  214:ldc1            #195 <String "audio/vorbis">
	//  100  216:aload_0         
	//  101  217:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//  102  220:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//  103  223:getfield        #198 <Field int VorbisUtil$VorbisIdHeader.bitrateNominal>
	//  104  226:ldc1            #199 <Int 65025>
	//  105  228:aload_0         
	//  106  229:getfield        #119 <Field long duration>
	//  107  232:aload_0         
	//  108  233:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//  109  236:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//  110  239:getfield        #202 <Field int VorbisUtil$VorbisIdHeader.channels>
	//  111  242:aload_0         
	//  112  243:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//  113  246:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//  114  249:getfield        #113 <Field long VorbisUtil$VorbisIdHeader.sampleRate>
	//  115  252:l2i             
	//  116  253:aload           9
	//  117  255:aconst_null     
	//  118  256:invokestatic    #208 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String)>
	//  119  259:invokeinterface #214 <Method void TrackOutput.format(MediaFormat)>
			l = inputLength;
	//  120  264:aload_0         
	//  121  265:getfield        #117 <Field long inputLength>
	//  122  268:lstore          5
			if(l != -1L)
	//* 123  270:lload           5
	//* 124  272:ldc2w           #41  <Long -1L>
	//* 125  275:lcmp            
	//* 126  276:ifeq            307
			{
				oggSeeker.setup(l - audioStartPosition, totalSamples);
	//  127  279:aload_0         
	//  128  280:getfield        #40  <Field OggSeeker oggSeeker>
	//  129  283:lload           5
	//  130  285:aload_0         
	//  131  286:getfield        #108 <Field long audioStartPosition>
	//  132  289:lsub            
	//  133  290:aload_0         
	//  134  291:getfield        #137 <Field long totalSamples>
	//  135  294:invokevirtual   #218 <Method void OggSeeker.setup(long, long)>
				positionholder.position = audioStartPosition;
	//  136  297:aload_2         
	//  137  298:aload_0         
	//  138  299:getfield        #108 <Field long audioStartPosition>
	//  139  302:putfield        #168 <Field long PositionHolder.position>
				return 1;
	//  140  305:iconst_1        
	//  141  306:ireturn         
			}
		}
		if(!seenFirstAudioPacket && targetGranule > -1L)
	//* 142  307:aload_0         
	//* 143  308:getfield        #220 <Field boolean seenFirstAudioPacket>
	//* 144  311:ifne            392
	//* 145  314:aload_0         
	//* 146  315:getfield        #44  <Field long targetGranule>
	//* 147  318:ldc2w           #41  <Long -1L>
	//* 148  321:lcmp            
	//* 149  322:ifle            392
		{
			OggUtil.skipToNextPage(extractorinput);
	//  150  325:aload_1         
	//  151  326:invokestatic    #224 <Method void OggUtil.skipToNextPage(ExtractorInput)>
			long l1 = oggSeeker.getNextSeekPosition(targetGranule, extractorinput);
	//  152  329:aload_0         
	//  153  330:getfield        #40  <Field OggSeeker oggSeeker>
	//  154  333:aload_0         
	//  155  334:getfield        #44  <Field long targetGranule>
	//  156  337:aload_1         
	//  157  338:invokevirtual   #228 <Method long OggSeeker.getNextSeekPosition(long, ExtractorInput)>
	//  158  341:lstore          5
			if(l1 != -1L)
	//* 159  343:lload           5
	//* 160  345:ldc2w           #41  <Long -1L>
	//* 161  348:lcmp            
	//* 162  349:ifeq            360
			{
				positionholder.position = l1;
	//  163  352:aload_2         
	//  164  353:lload           5
	//  165  355:putfield        #168 <Field long PositionHolder.position>
				return 1;
	//  166  358:iconst_1        
	//  167  359:ireturn         
			}
			elapsedSamples = oggParser.skipToPageOfGranule(extractorinput, targetGranule);
	//  168  360:aload_0         
	//  169  361:aload_0         
	//  170  362:getfield        #172 <Field OggParser oggParser>
	//  171  365:aload_1         
	//  172  366:aload_0         
	//  173  367:getfield        #44  <Field long targetGranule>
	//  174  370:invokevirtual   #232 <Method long OggParser.skipToPageOfGranule(ExtractorInput, long)>
	//  175  373:putfield        #234 <Field long elapsedSamples>
			previousPacketBlockSize = vorbisIdHeader.blockSize0;
	//  176  376:aload_0         
	//  177  377:aload_0         
	//  178  378:getfield        #236 <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//  179  381:getfield        #91  <Field int VorbisUtil$VorbisIdHeader.blockSize0>
	//  180  384:putfield        #238 <Field int previousPacketBlockSize>
			seenFirstAudioPacket = true;
	//  181  387:aload_0         
	//  182  388:iconst_1        
	//  183  389:putfield        #220 <Field boolean seenFirstAudioPacket>
		}
		if(oggParser.readPacket(extractorinput, scratch))
	//* 184  392:aload_0         
	//* 185  393:getfield        #172 <Field OggParser oggParser>
	//* 186  396:aload_1         
	//* 187  397:aload_0         
	//* 188  398:getfield        #147 <Field ParsableByteArray scratch>
	//* 189  401:invokevirtual   #242 <Method boolean OggParser.readPacket(ExtractorInput, ParsableByteArray)>
	//* 190  404:ifeq            594
		{
			if((scratch.data[0] & 1) != 1)
	//* 191  407:aload_0         
	//* 192  408:getfield        #147 <Field ParsableByteArray scratch>
	//* 193  411:getfield        #61  <Field byte[] ParsableByteArray.data>
	//* 194  414:iconst_0        
	//* 195  415:baload          
	//* 196  416:iconst_1        
	//* 197  417:iand            
	//* 198  418:iconst_1        
	//* 199  419:icmpeq          585
			{
				int j = decodeBlockSize(scratch.data[0], vorbisSetup);
	//  200  422:aload_0         
	//  201  423:getfield        #147 <Field ParsableByteArray scratch>
	//  202  426:getfield        #61  <Field byte[] ParsableByteArray.data>
	//  203  429:iconst_0        
	//  204  430:baload          
	//  205  431:aload_0         
	//  206  432:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//  207  435:invokestatic    #244 <Method int decodeBlockSize(byte, VorbisReader$VorbisSetup)>
	//  208  438:istore          4
				int i;
				if(seenFirstAudioPacket)
	//* 209  440:aload_0         
	//* 210  441:getfield        #220 <Field boolean seenFirstAudioPacket>
	//* 211  444:ifeq            460
					i = (previousPacketBlockSize + j) / 4;
	//  212  447:aload_0         
	//  213  448:getfield        #238 <Field int previousPacketBlockSize>
	//  214  451:iload           4
	//  215  453:iadd            
	//  216  454:iconst_4        
	//  217  455:idiv            
	//  218  456:istore_3        
				else
	//* 219  457:goto            462
					i = 0;
	//  220  460:iconst_0        
	//  221  461:istore_3        
				long l3 = elapsedSamples;
	//  222  462:aload_0         
	//  223  463:getfield        #234 <Field long elapsedSamples>
	//  224  466:lstore          7
				long l2 = i;
	//  225  468:iload_3         
	//  226  469:i2l             
	//  227  470:lstore          5
				if(l3 + l2 >= targetGranule)
	//* 228  472:lload           7
	//* 229  474:lload           5
	//* 230  476:ladd            
	//* 231  477:aload_0         
	//* 232  478:getfield        #44  <Field long targetGranule>
	//* 233  481:lcmp            
	//* 234  482:iflt            563
				{
					appendNumberOfSamples(scratch, l2);
	//  235  485:aload_0         
	//  236  486:getfield        #147 <Field ParsableByteArray scratch>
	//  237  489:lload           5
	//  238  491:invokestatic    #246 <Method void appendNumberOfSamples(ParsableByteArray, long)>
					long l4 = (elapsedSamples * 0xf4240L) / vorbisSetup.idHeader.sampleRate;
	//  239  494:aload_0         
	//  240  495:getfield        #234 <Field long elapsedSamples>
	//  241  498:ldc2w           #114 <Long 0xf4240L>
	//  242  501:lmul            
	//  243  502:aload_0         
	//  244  503:getfield        #110 <Field VorbisReader$VorbisSetup vorbisSetup>
	//  245  506:getfield        #86  <Field VorbisUtil$VorbisIdHeader VorbisReader$VorbisSetup.idHeader>
	//  246  509:getfield        #113 <Field long VorbisUtil$VorbisIdHeader.sampleRate>
	//  247  512:ldiv            
	//  248  513:lstore          7
					trackOutput.sampleData(scratch, scratch.limit());
	//  249  515:aload_0         
	//  250  516:getfield        #193 <Field TrackOutput trackOutput>
	//  251  519:aload_0         
	//  252  520:getfield        #147 <Field ParsableByteArray scratch>
	//  253  523:aload_0         
	//  254  524:getfield        #147 <Field ParsableByteArray scratch>
	//  255  527:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//  256  530:invokeinterface #250 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					trackOutput.sampleMetadata(l4, 1, scratch.limit(), 0, ((byte []) (null)));
	//  257  535:aload_0         
	//  258  536:getfield        #193 <Field TrackOutput trackOutput>
	//  259  539:lload           7
	//  260  541:iconst_1        
	//  261  542:aload_0         
	//  262  543:getfield        #147 <Field ParsableByteArray scratch>
	//  263  546:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//  264  549:iconst_0        
	//  265  550:aconst_null     
	//  266  551:invokeinterface #254 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
					targetGranule = -1L;
	//  267  556:aload_0         
	//  268  557:ldc2w           #41  <Long -1L>
	//  269  560:putfield        #44  <Field long targetGranule>
				}
				seenFirstAudioPacket = true;
	//  270  563:aload_0         
	//  271  564:iconst_1        
	//  272  565:putfield        #220 <Field boolean seenFirstAudioPacket>
				elapsedSamples = elapsedSamples + l2;
	//  273  568:aload_0         
	//  274  569:aload_0         
	//  275  570:getfield        #234 <Field long elapsedSamples>
	//  276  573:lload           5
	//  277  575:ladd            
	//  278  576:putfield        #234 <Field long elapsedSamples>
				previousPacketBlockSize = j;
	//  279  579:aload_0         
	//  280  580:iload           4
	//  281  582:putfield        #238 <Field int previousPacketBlockSize>
			}
			scratch.reset();
	//  282  585:aload_0         
	//  283  586:getfield        #147 <Field ParsableByteArray scratch>
	//  284  589:invokevirtual   #257 <Method void ParsableByteArray.reset()>
			return 0;
	//  285  592:iconst_0        
	//  286  593:ireturn         
		} else
		{
			return -1;
	//  287  594:iconst_m1       
	//  288  595:ireturn         
		}
	}

	VorbisSetup readSetupHeaders(ExtractorInput extractorinput, ParsableByteArray parsablebytearray)
		throws IOException, InterruptedException
	{
		if(vorbisIdHeader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #236 <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//*   2    4:ifnonnull       29
		{
			oggParser.readPacket(extractorinput, parsablebytearray);
	//    3    7:aload_0         
	//    4    8:getfield        #172 <Field OggParser oggParser>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #242 <Method boolean OggParser.readPacket(ExtractorInput, ParsableByteArray)>
	//    8   16:pop             
			vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(parsablebytearray);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokestatic    #262 <Method VorbisUtil$VorbisIdHeader VorbisUtil.readVorbisIdentificationHeader(ParsableByteArray)>
	//   12   22:putfield        #236 <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
			parsablebytearray.reset();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #257 <Method void ParsableByteArray.reset()>
		}
		if(commentHeader == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #264 <Field VorbisUtil$CommentHeader commentHeader>
	//*  17   33:ifnonnull       58
		{
			oggParser.readPacket(extractorinput, parsablebytearray);
	//   18   36:aload_0         
	//   19   37:getfield        #172 <Field OggParser oggParser>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokevirtual   #242 <Method boolean OggParser.readPacket(ExtractorInput, ParsableByteArray)>
	//   23   45:pop             
			commentHeader = VorbisUtil.readVorbisCommentHeader(parsablebytearray);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokestatic    #268 <Method VorbisUtil$CommentHeader VorbisUtil.readVorbisCommentHeader(ParsableByteArray)>
	//   27   51:putfield        #264 <Field VorbisUtil$CommentHeader commentHeader>
			parsablebytearray.reset();
	//   28   54:aload_2         
	//   29   55:invokevirtual   #257 <Method void ParsableByteArray.reset()>
		}
		oggParser.readPacket(extractorinput, parsablebytearray);
	//   30   58:aload_0         
	//   31   59:getfield        #172 <Field OggParser oggParser>
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #242 <Method boolean OggParser.readPacket(ExtractorInput, ParsableByteArray)>
	//   35   67:pop             
		extractorinput = ((ExtractorInput) (new byte[parsablebytearray.limit()]));
	//   36   68:aload_2         
	//   37   69:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//   38   72:newarray        byte[]
	//   39   74:astore_1        
		System.arraycopy(((Object) (parsablebytearray.data)), 0, ((Object) (extractorinput)), 0, parsablebytearray.limit());
	//   40   75:aload_2         
	//   41   76:getfield        #61  <Field byte[] ParsableByteArray.data>
	//   42   79:iconst_0        
	//   43   80:aload_1         
	//   44   81:iconst_0        
	//   45   82:aload_2         
	//   46   83:invokevirtual   #53  <Method int ParsableByteArray.limit()>
	//   47   86:invokestatic    #274 <Method void System.arraycopy(Object, int, Object, int, int)>
		VorbisUtil.Mode amode[] = VorbisUtil.readVorbisModes(parsablebytearray, vorbisIdHeader.channels);
	//   48   89:aload_2         
	//   49   90:aload_0         
	//   50   91:getfield        #236 <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//   51   94:getfield        #202 <Field int VorbisUtil$VorbisIdHeader.channels>
	//   52   97:invokestatic    #278 <Method VorbisUtil$Mode[] VorbisUtil.readVorbisModes(ParsableByteArray, int)>
	//   53  100:astore          4
		int i = VorbisUtil.iLog(amode.length - 1);
	//   54  102:aload           4
	//   55  104:arraylength     
	//   56  105:iconst_1        
	//   57  106:isub            
	//   58  107:invokestatic    #282 <Method int VorbisUtil.iLog(int)>
	//   59  110:istore_3        
		parsablebytearray.reset();
	//   60  111:aload_2         
	//   61  112:invokevirtual   #257 <Method void ParsableByteArray.reset()>
		return new VorbisSetup(vorbisIdHeader, commentHeader, ((byte []) (extractorinput)), amode, i);
	//   62  115:new             #8   <Class VorbisReader$VorbisSetup>
	//   63  118:dup             
	//   64  119:aload_0         
	//   65  120:getfield        #236 <Field VorbisUtil$VorbisIdHeader vorbisIdHeader>
	//   66  123:aload_0         
	//   67  124:getfield        #264 <Field VorbisUtil$CommentHeader commentHeader>
	//   68  127:aload_1         
	//   69  128:aload           4
	//   70  130:iload_3         
	//   71  131:invokespecial   #285 <Method void VorbisReader$VorbisSetup(VorbisUtil$VorbisIdHeader, VorbisUtil$CommentHeader, byte[], VorbisUtil$Mode[], int)>
	//   72  134:areturn         
	}

	public void seek()
	{
		super.seek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #288 <Method void StreamReader.seek()>
		previousPacketBlockSize = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #238 <Field int previousPacketBlockSize>
		elapsedSamples = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #234 <Field long elapsedSamples>
		seenFirstAudioPacket = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #220 <Field boolean seenFirstAudioPacket>
	//   11   19:return          
	}

	private static final long LARGEST_EXPECTED_PAGE_SIZE = 8000L;
	private long audioStartPosition;
	private VorbisUtil.CommentHeader commentHeader;
	private long duration;
	private long elapsedSamples;
	private long inputLength;
	private final OggSeeker oggSeeker = new OggSeeker();
	private int previousPacketBlockSize;
	private boolean seenFirstAudioPacket;
	private long targetGranule;
	private long totalSamples;
	private VorbisUtil.VorbisIdHeader vorbisIdHeader;
	private VorbisSetup vorbisSetup;
}
