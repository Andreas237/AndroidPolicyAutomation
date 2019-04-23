// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			TrackSampleTable, Atom, AtomParsers, Track, 
//			Sniffer

public final class Mp4Extractor
	implements Extractor, SeekMap
{
	private static final class Mp4Track
	{

		public int sampleIndex;
		public final TrackSampleTable sampleTable;
		public final Track track;
		public final TrackOutput trackOutput;

		public Mp4Track(Track track1, TrackSampleTable tracksampletable, TrackOutput trackoutput)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			track = track1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Track track>
			sampleTable = tracksampletable;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field TrackSampleTable sampleTable>
			trackOutput = trackoutput;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field TrackOutput trackOutput>
		//   11   19:return          
		}
	}


	public Mp4Extractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #64  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:invokespecial   #67  <Method void ParsableByteArray(int)>
	//    7   14:putfield        #69  <Field ParsableByteArray atomHeader>
	//    8   17:aload_0         
	//    9   18:new             #71  <Class Stack>
	//   10   21:dup             
	//   11   22:invokespecial   #72  <Method void Stack()>
	//   12   25:putfield        #74  <Field Stack containerAtoms>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//   13   28:aload_0         
	//   14   29:new             #64  <Class ParsableByteArray>
	//   15   32:dup             
	//   16   33:getstatic       #80  <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   17   36:invokespecial   #83  <Method void ParsableByteArray(byte[])>
	//   18   39:putfield        #85  <Field ParsableByteArray nalStartCode>
	//   19   42:aload_0         
	//   20   43:new             #64  <Class ParsableByteArray>
	//   21   46:dup             
	//   22   47:iconst_4        
	//   23   48:invokespecial   #67  <Method void ParsableByteArray(int)>
	//   24   51:putfield        #87  <Field ParsableByteArray nalLength>
		enterReadingAtomHeaderState();
	//   25   54:aload_0         
	//   26   55:invokespecial   #90  <Method void enterReadingAtomHeaderState()>
	//   27   58:return          
	}

	private void enterReadingAtomHeaderState()
	{
		parserState = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #92  <Field int parserState>
		atomHeaderBytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #94  <Field int atomHeaderBytesRead>
	//    6   10:return          
	}

	private int getTrackIndexOfEarliestCurrentSample()
	{
		int j = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		long l = 0xffffffffL;
	//    2    2:ldc2w           #97  <Long 0xffffffffL>
	//    3    5:lstore          4
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_1        
		do
		{
			Mp4Track amp4track[] = tracks;
	//    6    9:aload_0         
	//    7   10:getfield        #100 <Field Mp4Extractor$Mp4Track[] tracks>
	//    8   13:astore          10
			if(i < amp4track.length)
	//*   9   15:iload_1         
	//*  10   16:aload           10
	//*  11   18:arraylength     
	//*  12   19:icmpge          94
			{
				Mp4Track mp4track = amp4track[i];
	//   13   22:aload           10
	//   14   24:iload_1         
	//   15   25:aaload          
	//   16   26:astore          10
				int k = mp4track.sampleIndex;
	//   17   28:aload           10
	//   18   30:getfield        #103 <Field int Mp4Extractor$Mp4Track.sampleIndex>
	//   19   33:istore_3        
				long l1;
				if(k == mp4track.sampleTable.sampleCount)
	//*  20   34:iload_3         
	//*  21   35:aload           10
	//*  22   37:getfield        #107 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//*  23   40:getfield        #112 <Field int TrackSampleTable.sampleCount>
	//*  24   43:icmpne          53
				{
					l1 = l;
	//   25   46:lload           4
	//   26   48:lstore          6
				} else
	//*  27   50:goto            83
				{
					long l2 = mp4track.sampleTable.offsets[k];
	//   28   53:aload           10
	//   29   55:getfield        #107 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   30   58:getfield        #116 <Field long[] TrackSampleTable.offsets>
	//   31   61:iload_3         
	//   32   62:laload          
	//   33   63:lstore          8
					l1 = l;
	//   34   65:lload           4
	//   35   67:lstore          6
					if(l2 < l)
	//*  36   69:lload           8
	//*  37   71:lload           4
	//*  38   73:lcmp            
	//*  39   74:ifge            83
					{
						j = i;
	//   40   77:iload_1         
	//   41   78:istore_2        
						l1 = l2;
	//   42   79:lload           8
	//   43   81:lstore          6
					}
				}
				i++;
	//   44   83:iload_1         
	//   45   84:iconst_1        
	//   46   85:iadd            
	//   47   86:istore_1        
				l = l1;
	//   48   87:lload           6
	//   49   89:lstore          4
			} else
	//*  50   91:goto            9
			{
				return j;
	//   51   94:iload_2         
	//   52   95:ireturn         
			}
		} while(true);
	}

	private void processAtomEnded(long l)
		throws ParserException
	{
		do
		{
			if(containerAtoms.isEmpty() || ((Atom.ContainerAtom)containerAtoms.peek()).endPosition != l)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Stack containerAtoms>
	//    2    4:invokevirtual   #124 <Method boolean Stack.isEmpty()>
	//    3    7:ifne            96
	//    4   10:aload_0         
	//    5   11:getfield        #74  <Field Stack containerAtoms>
	//    6   14:invokevirtual   #128 <Method Object Stack.peek()>
	//    7   17:checkcast       #130 <Class Atom$ContainerAtom>
	//    8   20:getfield        #133 <Field long Atom$ContainerAtom.endPosition>
	//    9   23:lload_1         
	//   10   24:lcmp            
	//   11   25:ifne            96
			Atom.ContainerAtom containeratom = (Atom.ContainerAtom)containerAtoms.pop();
	//   12   28:aload_0         
	//   13   29:getfield        #74  <Field Stack containerAtoms>
	//   14   32:invokevirtual   #136 <Method Object Stack.pop()>
	//   15   35:checkcast       #130 <Class Atom$ContainerAtom>
	//   16   38:astore_3        
			if(containeratom.type == Atom.TYPE_moov)
	//*  17   39:aload_3         
	//*  18   40:getfield        #139 <Field int Atom$ContainerAtom.type>
	//*  19   43:getstatic       #144 <Field int Atom.TYPE_moov>
	//*  20   46:icmpne          69
			{
				processMoovAtom(containeratom);
	//   21   49:aload_0         
	//   22   50:aload_3         
	//   23   51:invokespecial   #148 <Method void processMoovAtom(Atom$ContainerAtom)>
				containerAtoms.clear();
	//   24   54:aload_0         
	//   25   55:getfield        #74  <Field Stack containerAtoms>
	//   26   58:invokevirtual   #151 <Method void Stack.clear()>
				parserState = 3;
	//   27   61:aload_0         
	//   28   62:iconst_3        
	//   29   63:putfield        #92  <Field int parserState>
			} else
	//*  30   66:goto            0
			if(!containerAtoms.isEmpty())
	//*  31   69:aload_0         
	//*  32   70:getfield        #74  <Field Stack containerAtoms>
	//*  33   73:invokevirtual   #124 <Method boolean Stack.isEmpty()>
	//*  34   76:ifne            0
				((Atom.ContainerAtom)containerAtoms.peek()).add(containeratom);
	//   35   79:aload_0         
	//   36   80:getfield        #74  <Field Stack containerAtoms>
	//   37   83:invokevirtual   #128 <Method Object Stack.peek()>
	//   38   86:checkcast       #130 <Class Atom$ContainerAtom>
	//   39   89:aload_3         
	//   40   90:invokevirtual   #154 <Method void Atom$ContainerAtom.add(Atom$ContainerAtom)>
		} while(true);
	//   41   93:goto            0
		if(parserState != 3)
	//*  42   96:aload_0         
	//*  43   97:getfield        #92  <Field int parserState>
	//*  44  100:iconst_3        
	//*  45  101:icmpeq          108
			enterReadingAtomHeaderState();
	//   46  104:aload_0         
	//   47  105:invokespecial   #90  <Method void enterReadingAtomHeaderState()>
	//   48  108:return          
	}

	private static boolean processFtypAtom(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #160 <Method void ParsableByteArray.setPosition(int)>
		if(parsablebytearray.readInt() == BRAND_QUICKTIME)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #163 <Method int ParsableByteArray.readInt()>
	//*   5   10:getstatic       #58  <Field int BRAND_QUICKTIME>
	//*   6   13:icmpne          18
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
		parsablebytearray.skipBytes(4);
	//    9   18:aload_0         
	//   10   19:iconst_4        
	//   11   20:invokevirtual   #166 <Method void ParsableByteArray.skipBytes(int)>
		while(parsablebytearray.bytesLeft() > 0) 
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #169 <Method int ParsableByteArray.bytesLeft()>
	//*  14   27:ifle            42
			if(parsablebytearray.readInt() == BRAND_QUICKTIME)
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #163 <Method int ParsableByteArray.readInt()>
	//*  17   34:getstatic       #58  <Field int BRAND_QUICKTIME>
	//*  18   37:icmpne          23
				return true;
	//   19   40:iconst_1        
	//   20   41:ireturn         
		return false;
	//   21   42:iconst_0        
	//   22   43:ireturn         
	}

	private void processMoovAtom(Atom.ContainerAtom containeratom)
		throws ParserException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #171 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void ArrayList()>
	//    3    7:astore          13
		Object obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_udta)));
	//    4    9:aload_1         
	//    5   10:getstatic       #175 <Field int Atom.TYPE_udta>
	//    6   13:invokevirtual   #179 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    7   16:astore          10
		if(obj != null)
	//*   8   18:aload           10
	//*   9   20:ifnull          37
			obj = ((Object) (AtomParsers.parseUdta(((Atom.LeafAtom) (obj)), isQuickTime)));
	//   10   23:aload           10
	//   11   25:aload_0         
	//   12   26:getfield        #181 <Field boolean isQuickTime>
	//   13   29:invokestatic    #187 <Method GaplessInfo AtomParsers.parseUdta(Atom$LeafAtom, boolean)>
	//   14   32:astore          10
		else
	//*  15   34:goto            40
			obj = null;
	//   16   37:aconst_null     
	//   17   38:astore          10
		long l = 0xffffffffL;
	//   18   40:ldc2w           #97  <Long 0xffffffffL>
	//   19   43:lstore          4
		for(int i = 0; i < containeratom.containerChildren.size();)
	//*  20   45:iconst_0        
	//*  21   46:istore_2        
	//*  22   47:iload_2         
	//*  23   48:aload_1         
	//*  24   49:getfield        #191 <Field List Atom$ContainerAtom.containerChildren>
	//*  25   52:invokeinterface #196 <Method int List.size()>
	//*  26   57:icmpge          295
		{
			Atom.ContainerAtom containeratom1 = (Atom.ContainerAtom)containeratom.containerChildren.get(i);
	//   27   60:aload_1         
	//   28   61:getfield        #191 <Field List Atom$ContainerAtom.containerChildren>
	//   29   64:iload_2         
	//   30   65:invokeinterface #200 <Method Object List.get(int)>
	//   31   70:checkcast       #130 <Class Atom$ContainerAtom>
	//   32   73:astore          12
			long l1;
			if(containeratom1.type != Atom.TYPE_trak)
	//*  33   75:aload           12
	//*  34   77:getfield        #139 <Field int Atom$ContainerAtom.type>
	//*  35   80:getstatic       #203 <Field int Atom.TYPE_trak>
	//*  36   83:icmpeq          93
			{
				l1 = l;
	//   37   86:lload           4
	//   38   88:lstore          6
			} else
	//*  39   90:goto            284
			{
				Object obj1 = ((Object) (AtomParsers.parseTrak(containeratom1, containeratom.getLeafAtomOfType(Atom.TYPE_mvhd), -1L, isQuickTime)));
	//   40   93:aload           12
	//   41   95:aload_1         
	//   42   96:getstatic       #206 <Field int Atom.TYPE_mvhd>
	//   43   99:invokevirtual   #179 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   44  102:ldc2w           #207 <Long -1L>
	//   45  105:aload_0         
	//   46  106:getfield        #181 <Field boolean isQuickTime>
	//   47  109:invokestatic    #212 <Method Track AtomParsers.parseTrak(Atom$ContainerAtom, Atom$LeafAtom, long, boolean)>
	//   48  112:astore          11
				if(obj1 == null)
	//*  49  114:aload           11
	//*  50  116:ifnonnull       126
				{
					l1 = l;
	//   51  119:lload           4
	//   52  121:lstore          6
				} else
	//*  53  123:goto            284
				{
					TrackSampleTable tracksampletable = AtomParsers.parseStbl(((Track) (obj1)), containeratom1.getContainerAtomOfType(Atom.TYPE_mdia).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl));
	//   54  126:aload           11
	//   55  128:aload           12
	//   56  130:getstatic       #215 <Field int Atom.TYPE_mdia>
	//   57  133:invokevirtual   #219 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   58  136:getstatic       #222 <Field int Atom.TYPE_minf>
	//   59  139:invokevirtual   #219 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   60  142:getstatic       #225 <Field int Atom.TYPE_stbl>
	//   61  145:invokevirtual   #219 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   62  148:invokestatic    #229 <Method TrackSampleTable AtomParsers.parseStbl(Track, Atom$ContainerAtom)>
	//   63  151:astore          14
					if(tracksampletable.sampleCount == 0)
	//*  64  153:aload           14
	//*  65  155:getfield        #112 <Field int TrackSampleTable.sampleCount>
	//*  66  158:ifne            168
					{
						l1 = l;
	//   67  161:lload           4
	//   68  163:lstore          6
					} else
	//*  69  165:goto            284
					{
						Mp4Track mp4track = new Mp4Track(((Track) (obj1)), tracksampletable, extractorOutput.track(i));
	//   70  168:new             #10  <Class Mp4Extractor$Mp4Track>
	//   71  171:dup             
	//   72  172:aload           11
	//   73  174:aload           14
	//   74  176:aload_0         
	//   75  177:getfield        #231 <Field ExtractorOutput extractorOutput>
	//   76  180:iload_2         
	//   77  181:invokeinterface #237 <Method TrackOutput ExtractorOutput.track(int)>
	//   78  186:invokespecial   #240 <Method void Mp4Extractor$Mp4Track(Track, TrackSampleTable, TrackOutput)>
	//   79  189:astore          15
						int j = tracksampletable.maximumSize;
	//   80  191:aload           14
	//   81  193:getfield        #243 <Field int TrackSampleTable.maximumSize>
	//   82  196:istore_3        
						MediaFormat mediaformat = ((Track) (obj1)).mediaFormat.copyWithMaxInputSize(j + 30);
	//   83  197:aload           11
	//   84  199:getfield        #249 <Field MediaFormat Track.mediaFormat>
	//   85  202:iload_3         
	//   86  203:bipush          30
	//   87  205:iadd            
	//   88  206:invokevirtual   #255 <Method MediaFormat MediaFormat.copyWithMaxInputSize(int)>
	//   89  209:astore          12
						obj1 = ((Object) (mediaformat));
	//   90  211:aload           12
	//   91  213:astore          11
						if(obj != null)
	//*  92  215:aload           10
	//*  93  217:ifnull          237
							obj1 = ((Object) (mediaformat.copyWithGaplessInfo(((GaplessInfo) (obj)).encoderDelay, ((GaplessInfo) (obj)).encoderPadding)));
	//   94  220:aload           12
	//   95  222:aload           10
	//   96  224:getfield        #260 <Field int GaplessInfo.encoderDelay>
	//   97  227:aload           10
	//   98  229:getfield        #263 <Field int GaplessInfo.encoderPadding>
	//   99  232:invokevirtual   #267 <Method MediaFormat MediaFormat.copyWithGaplessInfo(int, int)>
	//  100  235:astore          11
						mp4track.trackOutput.format(((MediaFormat) (obj1)));
	//  101  237:aload           15
	//  102  239:getfield        #271 <Field TrackOutput Mp4Extractor$Mp4Track.trackOutput>
	//  103  242:aload           11
	//  104  244:invokeinterface #277 <Method void TrackOutput.format(MediaFormat)>
						((List) (arraylist)).add(((Object) (mp4track)));
	//  105  249:aload           13
	//  106  251:aload           15
	//  107  253:invokeinterface #280 <Method boolean List.add(Object)>
	//  108  258:pop             
						long l2 = tracksampletable.offsets[0];
	//  109  259:aload           14
	//  110  261:getfield        #116 <Field long[] TrackSampleTable.offsets>
	//  111  264:iconst_0        
	//  112  265:laload          
	//  113  266:lstore          8
						l1 = l;
	//  114  268:lload           4
	//  115  270:lstore          6
						if(l2 < l)
	//* 116  272:lload           8
	//* 117  274:lload           4
	//* 118  276:lcmp            
	//* 119  277:ifge            284
							l1 = l2;
	//  120  280:lload           8
	//  121  282:lstore          6
					}
				}
			}
			i++;
	//  122  284:iload_2         
	//  123  285:iconst_1        
	//  124  286:iadd            
	//  125  287:istore_2        
			l = l1;
	//  126  288:lload           6
	//  127  290:lstore          4
		}

	//* 128  292:goto            47
		tracks = (Mp4Track[])((List) (arraylist)).toArray(((Object []) (new Mp4Track[0])));
	//  129  295:aload_0         
	//  130  296:aload           13
	//  131  298:iconst_0        
	//  132  299:anewarray       Mp4Track[]
	//  133  302:invokeinterface #284 <Method Object[] List.toArray(Object[])>
	//  134  307:checkcast       #285 <Class Mp4Extractor$Mp4Track[]>
	//  135  310:putfield        #100 <Field Mp4Extractor$Mp4Track[] tracks>
		extractorOutput.endTracks();
	//  136  313:aload_0         
	//  137  314:getfield        #231 <Field ExtractorOutput extractorOutput>
	//  138  317:invokeinterface #288 <Method void ExtractorOutput.endTracks()>
		extractorOutput.seekMap(((SeekMap) (this)));
	//  139  322:aload_0         
	//  140  323:getfield        #231 <Field ExtractorOutput extractorOutput>
	//  141  326:aload_0         
	//  142  327:invokeinterface #292 <Method void ExtractorOutput.seekMap(SeekMap)>
	//  143  332:return          
	}

	private boolean readAtomHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(atomHeaderBytesRead == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field int atomHeaderBytesRead>
	//*   2    4:ifne            65
		{
			if(!extractorinput.readFully(atomHeader.data, 0, 8, true))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field ParsableByteArray atomHeader>
	//*   6   12:getfield        #301 <Field byte[] ParsableByteArray.data>
	//*   7   15:iconst_0        
	//*   8   16:bipush          8
	//*   9   18:iconst_1        
	//*  10   19:invokeinterface #307 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  11   24:ifne            29
				return false;
	//   12   27:iconst_0        
	//   13   28:ireturn         
			atomHeaderBytesRead = 8;
	//   14   29:aload_0         
	//   15   30:bipush          8
	//   16   32:putfield        #94  <Field int atomHeaderBytesRead>
			atomHeader.setPosition(0);
	//   17   35:aload_0         
	//   18   36:getfield        #69  <Field ParsableByteArray atomHeader>
	//   19   39:iconst_0        
	//   20   40:invokevirtual   #160 <Method void ParsableByteArray.setPosition(int)>
			atomSize = atomHeader.readUnsignedInt();
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #69  <Field ParsableByteArray atomHeader>
	//   24   48:invokevirtual   #311 <Method long ParsableByteArray.readUnsignedInt()>
	//   25   51:putfield        #313 <Field long atomSize>
			atomType = atomHeader.readInt();
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #69  <Field ParsableByteArray atomHeader>
	//   29   59:invokevirtual   #163 <Method int ParsableByteArray.readInt()>
	//   30   62:putfield        #315 <Field int atomType>
		}
		if(atomSize == 1L)
	//*  31   65:aload_0         
	//*  32   66:getfield        #313 <Field long atomSize>
	//*  33   69:lconst_1        
	//*  34   70:lcmp            
	//*  35   71:ifne            113
		{
			extractorinput.readFully(atomHeader.data, 8, 8);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #69  <Field ParsableByteArray atomHeader>
	//   39   79:getfield        #301 <Field byte[] ParsableByteArray.data>
	//   40   82:bipush          8
	//   41   84:bipush          8
	//   42   86:invokeinterface #318 <Method void ExtractorInput.readFully(byte[], int, int)>
			atomHeaderBytesRead = atomHeaderBytesRead + 8;
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:getfield        #94  <Field int atomHeaderBytesRead>
	//   46   96:bipush          8
	//   47   98:iadd            
	//   48   99:putfield        #94  <Field int atomHeaderBytesRead>
			atomSize = atomHeader.readUnsignedLongToLong();
	//   49  102:aload_0         
	//   50  103:aload_0         
	//   51  104:getfield        #69  <Field ParsableByteArray atomHeader>
	//   52  107:invokevirtual   #321 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   53  110:putfield        #313 <Field long atomSize>
		}
		if(shouldParseContainerAtom(atomType))
	//*  54  113:aload_0         
	//*  55  114:getfield        #315 <Field int atomType>
	//*  56  117:invokestatic    #325 <Method boolean shouldParseContainerAtom(int)>
	//*  57  120:ifeq            187
		{
			long l = (extractorinput.getPosition() + atomSize) - (long)atomHeaderBytesRead;
	//   58  123:aload_1         
	//   59  124:invokeinterface #328 <Method long ExtractorInput.getPosition()>
	//   60  129:aload_0         
	//   61  130:getfield        #313 <Field long atomSize>
	//   62  133:ladd            
	//   63  134:aload_0         
	//   64  135:getfield        #94  <Field int atomHeaderBytesRead>
	//   65  138:i2l             
	//   66  139:lsub            
	//   67  140:lstore_2        
			containerAtoms.add(((Object) (new Atom.ContainerAtom(atomType, l))));
	//   68  141:aload_0         
	//   69  142:getfield        #74  <Field Stack containerAtoms>
	//   70  145:new             #130 <Class Atom$ContainerAtom>
	//   71  148:dup             
	//   72  149:aload_0         
	//   73  150:getfield        #315 <Field int atomType>
	//   74  153:lload_2         
	//   75  154:invokespecial   #331 <Method void Atom$ContainerAtom(int, long)>
	//   76  157:invokevirtual   #332 <Method boolean Stack.add(Object)>
	//   77  160:pop             
			if(atomSize == (long)atomHeaderBytesRead)
	//*  78  161:aload_0         
	//*  79  162:getfield        #313 <Field long atomSize>
	//*  80  165:aload_0         
	//*  81  166:getfield        #94  <Field int atomHeaderBytesRead>
	//*  82  169:i2l             
	//*  83  170:lcmp            
	//*  84  171:ifne            181
			{
				processAtomEnded(l);
	//   85  174:aload_0         
	//   86  175:lload_2         
	//   87  176:invokespecial   #334 <Method void processAtomEnded(long)>
				return true;
	//   88  179:iconst_1        
	//   89  180:ireturn         
			} else
			{
				enterReadingAtomHeaderState();
	//   90  181:aload_0         
	//   91  182:invokespecial   #90  <Method void enterReadingAtomHeaderState()>
				return true;
	//   92  185:iconst_1        
	//   93  186:ireturn         
			}
		}
		if(shouldParseLeafAtom(atomType))
	//*  94  187:aload_0         
	//*  95  188:getfield        #315 <Field int atomType>
	//*  96  191:invokestatic    #337 <Method boolean shouldParseLeafAtom(int)>
	//*  97  194:ifeq            289
		{
			boolean flag;
			if(atomHeaderBytesRead == 8)
	//*  98  197:aload_0         
	//*  99  198:getfield        #94  <Field int atomHeaderBytesRead>
	//* 100  201:bipush          8
	//* 101  203:icmpne          212
				flag = true;
	//  102  206:iconst_1        
	//  103  207:istore          4
			else
	//* 104  209:goto            215
				flag = false;
	//  105  212:iconst_0        
	//  106  213:istore          4
			Assertions.checkState(flag);
	//  107  215:iload           4
	//  108  217:invokestatic    #343 <Method void Assertions.checkState(boolean)>
			if(atomSize <= 0x7fffffffL)
	//* 109  220:aload_0         
	//* 110  221:getfield        #313 <Field long atomSize>
	//* 111  224:ldc2w           #344 <Long 0x7fffffffL>
	//* 112  227:lcmp            
	//* 113  228:ifgt            237
				flag = true;
	//  114  231:iconst_1        
	//  115  232:istore          4
			else
	//* 116  234:goto            240
				flag = false;
	//  117  237:iconst_0        
	//  118  238:istore          4
			Assertions.checkState(flag);
	//  119  240:iload           4
	//  120  242:invokestatic    #343 <Method void Assertions.checkState(boolean)>
			atomData = new ParsableByteArray((int)atomSize);
	//  121  245:aload_0         
	//  122  246:new             #64  <Class ParsableByteArray>
	//  123  249:dup             
	//  124  250:aload_0         
	//  125  251:getfield        #313 <Field long atomSize>
	//  126  254:l2i             
	//  127  255:invokespecial   #67  <Method void ParsableByteArray(int)>
	//  128  258:putfield        #347 <Field ParsableByteArray atomData>
			System.arraycopy(((Object) (atomHeader.data)), 0, ((Object) (atomData.data)), 0, 8);
	//  129  261:aload_0         
	//  130  262:getfield        #69  <Field ParsableByteArray atomHeader>
	//  131  265:getfield        #301 <Field byte[] ParsableByteArray.data>
	//  132  268:iconst_0        
	//  133  269:aload_0         
	//  134  270:getfield        #347 <Field ParsableByteArray atomData>
	//  135  273:getfield        #301 <Field byte[] ParsableByteArray.data>
	//  136  276:iconst_0        
	//  137  277:bipush          8
	//  138  279:invokestatic    #353 <Method void System.arraycopy(Object, int, Object, int, int)>
			parserState = 2;
	//  139  282:aload_0         
	//  140  283:iconst_2        
	//  141  284:putfield        #92  <Field int parserState>
			return true;
	//  142  287:iconst_1        
	//  143  288:ireturn         
		} else
		{
			atomData = null;
	//  144  289:aload_0         
	//  145  290:aconst_null     
	//  146  291:putfield        #347 <Field ParsableByteArray atomData>
			parserState = 2;
	//  147  294:aload_0         
	//  148  295:iconst_2        
	//  149  296:putfield        #92  <Field int parserState>
			return true;
	//  150  299:iconst_1        
	//  151  300:ireturn         
		}
	}

	private boolean readAtomPayload(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		boolean flag;
		long l;
		long l1;
label0:
		{
label1:
			{
				l = atomSize - (long)atomHeaderBytesRead;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field long atomSize>
	//    2    4:aload_0         
	//    3    5:getfield        #94  <Field int atomHeaderBytesRead>
	//    4    8:i2l             
	//    5    9:lsub            
	//    6   10:lstore          4
				l1 = extractorinput.getPosition();
	//    7   12:aload_1         
	//    8   13:invokeinterface #328 <Method long ExtractorInput.getPosition()>
	//    9   18:lstore          6
				ParsableByteArray parsablebytearray = atomData;
	//   10   20:aload_0         
	//   11   21:getfield        #347 <Field ParsableByteArray atomData>
	//   12   24:astore          8
				if(parsablebytearray != null)
	//*  13   26:aload           8
	//*  14   28:ifnull          114
				{
					extractorinput.readFully(parsablebytearray.data, atomHeaderBytesRead, (int)l);
	//   15   31:aload_1         
	//   16   32:aload           8
	//   17   34:getfield        #301 <Field byte[] ParsableByteArray.data>
	//   18   37:aload_0         
	//   19   38:getfield        #94  <Field int atomHeaderBytesRead>
	//   20   41:lload           4
	//   21   43:l2i             
	//   22   44:invokeinterface #318 <Method void ExtractorInput.readFully(byte[], int, int)>
					if(atomType == Atom.TYPE_ftyp)
	//*  23   49:aload_0         
	//*  24   50:getfield        #315 <Field int atomType>
	//*  25   53:getstatic       #358 <Field int Atom.TYPE_ftyp>
	//*  26   56:icmpne          73
						isQuickTime = processFtypAtom(atomData);
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:getfield        #347 <Field ParsableByteArray atomData>
	//   30   64:invokestatic    #360 <Method boolean processFtypAtom(ParsableByteArray)>
	//   31   67:putfield        #181 <Field boolean isQuickTime>
					else
	//*  32   70:goto            132
					if(!containerAtoms.isEmpty())
	//*  33   73:aload_0         
	//*  34   74:getfield        #74  <Field Stack containerAtoms>
	//*  35   77:invokevirtual   #124 <Method boolean Stack.isEmpty()>
	//*  36   80:ifne            132
						((Atom.ContainerAtom)containerAtoms.peek()).add(new Atom.LeafAtom(atomType, atomData));
	//   37   83:aload_0         
	//   38   84:getfield        #74  <Field Stack containerAtoms>
	//   39   87:invokevirtual   #128 <Method Object Stack.peek()>
	//   40   90:checkcast       #130 <Class Atom$ContainerAtom>
	//   41   93:new             #362 <Class Atom$LeafAtom>
	//   42   96:dup             
	//   43   97:aload_0         
	//   44   98:getfield        #315 <Field int atomType>
	//   45  101:aload_0         
	//   46  102:getfield        #347 <Field ParsableByteArray atomData>
	//   47  105:invokespecial   #365 <Method void Atom$LeafAtom(int, ParsableByteArray)>
	//   48  108:invokevirtual   #368 <Method void Atom$ContainerAtom.add(Atom$LeafAtom)>
				} else
	//*  49  111:goto            132
				{
					if(l >= 0x40000L)
						break label1;
	//   50  114:lload           4
	//   51  116:ldc2w           #16  <Long 0x40000L>
	//   52  119:lcmp            
	//   53  120:ifge            137
					extractorinput.skipFully((int)l);
	//   54  123:aload_1         
	//   55  124:lload           4
	//   56  126:l2i             
	//   57  127:invokeinterface #371 <Method void ExtractorInput.skipFully(int)>
				}
				flag = false;
	//   58  132:iconst_0        
	//   59  133:istore_3        
				break label0;
	//   60  134:goto            152
			}
			positionholder.position = extractorinput.getPosition() + l;
	//   61  137:aload_2         
	//   62  138:aload_1         
	//   63  139:invokeinterface #328 <Method long ExtractorInput.getPosition()>
	//   64  144:lload           4
	//   65  146:ladd            
	//   66  147:putfield        #376 <Field long PositionHolder.position>
			flag = true;
	//   67  150:iconst_1        
	//   68  151:istore_3        
		}
		processAtomEnded(l1 + l);
	//   69  152:aload_0         
	//   70  153:lload           6
	//   71  155:lload           4
	//   72  157:ladd            
	//   73  158:invokespecial   #334 <Method void processAtomEnded(long)>
		return flag && parserState != 3;
	//   74  161:iload_3         
	//   75  162:ifeq            175
	//   76  165:aload_0         
	//   77  166:getfield        #92  <Field int parserState>
	//   78  169:iconst_3        
	//   79  170:icmpeq          175
	//   80  173:iconst_1        
	//   81  174:ireturn         
	//   82  175:iconst_0        
	//   83  176:ireturn         
	}

	private int readSample(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		int i = getTrackIndexOfEarliestCurrentSample();
	//    0    0:aload_0         
	//    1    1:invokespecial   #380 <Method int getTrackIndexOfEarliestCurrentSample()>
	//    2    4:istore_3        
		if(i == -1)
	//*   3    5:iload_3         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
			return -1;
	//    6   10:iconst_m1       
	//    7   11:ireturn         
		Mp4Track mp4track = tracks[i];
	//    8   12:aload_0         
	//    9   13:getfield        #100 <Field Mp4Extractor$Mp4Track[] tracks>
	//   10   16:iload_3         
	//   11   17:aaload          
	//   12   18:astore          11
		TrackOutput trackoutput = mp4track.trackOutput;
	//   13   20:aload           11
	//   14   22:getfield        #271 <Field TrackOutput Mp4Extractor$Mp4Track.trackOutput>
	//   15   25:astore          12
		i = mp4track.sampleIndex;
	//   16   27:aload           11
	//   17   29:getfield        #103 <Field int Mp4Extractor$Mp4Track.sampleIndex>
	//   18   32:istore_3        
		long l1 = mp4track.sampleTable.offsets[i];
	//   19   33:aload           11
	//   20   35:getfield        #107 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   21   38:getfield        #116 <Field long[] TrackSampleTable.offsets>
	//   22   41:iload_3         
	//   23   42:laload          
	//   24   43:lstore          7
		long l2 = (l1 - extractorinput.getPosition()) + (long)sampleBytesWritten;
	//   25   45:lload           7
	//   26   47:aload_1         
	//   27   48:invokeinterface #328 <Method long ExtractorInput.getPosition()>
	//   28   53:lsub            
	//   29   54:aload_0         
	//   30   55:getfield        #382 <Field int sampleBytesWritten>
	//   31   58:i2l             
	//   32   59:ladd            
	//   33   60:lstore          9
		if(l2 >= 0L && l2 < 0x40000L)
	//*  34   62:lload           9
	//*  35   64:lconst_0        
	//*  36   65:lcmp            
	//*  37   66:iflt            415
	//*  38   69:lload           9
	//*  39   71:ldc2w           #16  <Long 0x40000L>
	//*  40   74:lcmp            
	//*  41   75:iflt            81
	//*  42   78:goto            415
		{
			extractorinput.skipFully((int)l2);
	//   43   81:aload_1         
	//   44   82:lload           9
	//   45   84:l2i             
	//   46   85:invokeinterface #371 <Method void ExtractorInput.skipFully(int)>
			sampleSize = mp4track.sampleTable.sizes[i];
	//   47   90:aload_0         
	//   48   91:aload           11
	//   49   93:getfield        #107 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   50   96:getfield        #386 <Field int[] TrackSampleTable.sizes>
	//   51   99:iload_3         
	//   52  100:iaload          
	//   53  101:putfield        #388 <Field int sampleSize>
			if(mp4track.track.nalUnitLengthFieldLength != -1)
	//*  54  104:aload           11
	//*  55  106:getfield        #391 <Field Track Mp4Extractor$Mp4Track.track>
	//*  56  109:getfield        #394 <Field int Track.nalUnitLengthFieldLength>
	//*  57  112:iconst_m1       
	//*  58  113:icmpeq          298
			{
				positionholder = ((PositionHolder) (nalLength.data));
	//   59  116:aload_0         
	//   60  117:getfield        #87  <Field ParsableByteArray nalLength>
	//   61  120:getfield        #301 <Field byte[] ParsableByteArray.data>
	//   62  123:astore_2        
				positionholder[0] = 0;
	//   63  124:aload_2         
	//   64  125:iconst_0        
	//   65  126:iconst_0        
	//   66  127:bastore         
				positionholder[1] = 0;
	//   67  128:aload_2         
	//   68  129:iconst_1        
	//   69  130:iconst_0        
	//   70  131:bastore         
				positionholder[2] = 0;
	//   71  132:aload_2         
	//   72  133:iconst_2        
	//   73  134:iconst_0        
	//   74  135:bastore         
				int j = mp4track.track.nalUnitLengthFieldLength;
	//   75  136:aload           11
	//   76  138:getfield        #391 <Field Track Mp4Extractor$Mp4Track.track>
	//   77  141:getfield        #394 <Field int Track.nalUnitLengthFieldLength>
	//   78  144:istore          4
				int l = 4 - mp4track.track.nalUnitLengthFieldLength;
	//   79  146:iconst_4        
	//   80  147:aload           11
	//   81  149:getfield        #391 <Field Track Mp4Extractor$Mp4Track.track>
	//   82  152:getfield        #394 <Field int Track.nalUnitLengthFieldLength>
	//   83  155:isub            
	//   84  156:istore          5
				while(sampleBytesWritten < sampleSize) 
	//*  85  158:aload_0         
	//*  86  159:getfield        #382 <Field int sampleBytesWritten>
	//*  87  162:aload_0         
	//*  88  163:getfield        #388 <Field int sampleSize>
	//*  89  166:icmpge          358
				{
					int j1 = sampleCurrentNalBytesRemaining;
	//   90  169:aload_0         
	//   91  170:getfield        #396 <Field int sampleCurrentNalBytesRemaining>
	//   92  173:istore          6
					if(j1 == 0)
	//*  93  175:iload           6
	//*  94  177:ifne            260
					{
						extractorinput.readFully(nalLength.data, l, j);
	//   95  180:aload_1         
	//   96  181:aload_0         
	//   97  182:getfield        #87  <Field ParsableByteArray nalLength>
	//   98  185:getfield        #301 <Field byte[] ParsableByteArray.data>
	//   99  188:iload           5
	//  100  190:iload           4
	//  101  192:invokeinterface #318 <Method void ExtractorInput.readFully(byte[], int, int)>
						nalLength.setPosition(0);
	//  102  197:aload_0         
	//  103  198:getfield        #87  <Field ParsableByteArray nalLength>
	//  104  201:iconst_0        
	//  105  202:invokevirtual   #160 <Method void ParsableByteArray.setPosition(int)>
						sampleCurrentNalBytesRemaining = nalLength.readUnsignedIntToInt();
	//  106  205:aload_0         
	//  107  206:aload_0         
	//  108  207:getfield        #87  <Field ParsableByteArray nalLength>
	//  109  210:invokevirtual   #399 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  110  213:putfield        #396 <Field int sampleCurrentNalBytesRemaining>
						nalStartCode.setPosition(0);
	//  111  216:aload_0         
	//  112  217:getfield        #85  <Field ParsableByteArray nalStartCode>
	//  113  220:iconst_0        
	//  114  221:invokevirtual   #160 <Method void ParsableByteArray.setPosition(int)>
						trackoutput.sampleData(nalStartCode, 4);
	//  115  224:aload           12
	//  116  226:aload_0         
	//  117  227:getfield        #85  <Field ParsableByteArray nalStartCode>
	//  118  230:iconst_4        
	//  119  231:invokeinterface #403 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + 4;
	//  120  236:aload_0         
	//  121  237:aload_0         
	//  122  238:getfield        #382 <Field int sampleBytesWritten>
	//  123  241:iconst_4        
	//  124  242:iadd            
	//  125  243:putfield        #382 <Field int sampleBytesWritten>
						sampleSize = sampleSize + l;
	//  126  246:aload_0         
	//  127  247:aload_0         
	//  128  248:getfield        #388 <Field int sampleSize>
	//  129  251:iload           5
	//  130  253:iadd            
	//  131  254:putfield        #388 <Field int sampleSize>
					} else
	//* 132  257:goto            158
					{
						j1 = trackoutput.sampleData(extractorinput, j1, false);
	//  133  260:aload           12
	//  134  262:aload_1         
	//  135  263:iload           6
	//  136  265:iconst_0        
	//  137  266:invokeinterface #406 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//  138  271:istore          6
						sampleBytesWritten = sampleBytesWritten + j1;
	//  139  273:aload_0         
	//  140  274:aload_0         
	//  141  275:getfield        #382 <Field int sampleBytesWritten>
	//  142  278:iload           6
	//  143  280:iadd            
	//  144  281:putfield        #382 <Field int sampleBytesWritten>
						sampleCurrentNalBytesRemaining = sampleCurrentNalBytesRemaining - j1;
	//  145  284:aload_0         
	//  146  285:aload_0         
	//  147  286:getfield        #396 <Field int sampleCurrentNalBytesRemaining>
	//  148  289:iload           6
	//  149  291:isub            
	//  150  292:putfield        #396 <Field int sampleCurrentNalBytesRemaining>
					}
				}
			} else
	//* 151  295:goto            158
			{
				do
				{
					int k = sampleBytesWritten;
	//  152  298:aload_0         
	//  153  299:getfield        #382 <Field int sampleBytesWritten>
	//  154  302:istore          4
					int i1 = sampleSize;
	//  155  304:aload_0         
	//  156  305:getfield        #388 <Field int sampleSize>
	//  157  308:istore          5
					if(k >= i1)
						break;
	//  158  310:iload           4
	//  159  312:iload           5
	//  160  314:icmpge          358
					k = trackoutput.sampleData(extractorinput, i1 - k, false);
	//  161  317:aload           12
	//  162  319:aload_1         
	//  163  320:iload           5
	//  164  322:iload           4
	//  165  324:isub            
	//  166  325:iconst_0        
	//  167  326:invokeinterface #406 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//  168  331:istore          4
					sampleBytesWritten = sampleBytesWritten + k;
	//  169  333:aload_0         
	//  170  334:aload_0         
	//  171  335:getfield        #382 <Field int sampleBytesWritten>
	//  172  338:iload           4
	//  173  340:iadd            
	//  174  341:putfield        #382 <Field int sampleBytesWritten>
					sampleCurrentNalBytesRemaining = sampleCurrentNalBytesRemaining - k;
	//  175  344:aload_0         
	//  176  345:aload_0         
	//  177  346:getfield        #396 <Field int sampleCurrentNalBytesRemaining>
	//  178  349:iload           4
	//  179  351:isub            
	//  180  352:putfield        #396 <Field int sampleCurrentNalBytesRemaining>
				} while(true);
	//  181  355:goto            298
			}
			trackoutput.sampleMetadata(mp4track.sampleTable.timestampsUs[i], mp4track.sampleTable.flags[i], sampleSize, 0, ((byte []) (null)));
	//  182  358:aload           12
	//  183  360:aload           11
	//  184  362:getfield        #107 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//  185  365:getfield        #409 <Field long[] TrackSampleTable.timestampsUs>
	//  186  368:iload_3         
	//  187  369:laload          
	//  188  370:aload           11
	//  189  372:getfield        #107 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//  190  375:getfield        #412 <Field int[] TrackSampleTable.flags>
	//  191  378:iload_3         
	//  192  379:iaload          
	//  193  380:aload_0         
	//  194  381:getfield        #388 <Field int sampleSize>
	//  195  384:iconst_0        
	//  196  385:aconst_null     
	//  197  386:invokeinterface #416 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
			mp4track.sampleIndex = mp4track.sampleIndex + 1;
	//  198  391:aload           11
	//  199  393:aload           11
	//  200  395:getfield        #103 <Field int Mp4Extractor$Mp4Track.sampleIndex>
	//  201  398:iconst_1        
	//  202  399:iadd            
	//  203  400:putfield        #103 <Field int Mp4Extractor$Mp4Track.sampleIndex>
			sampleBytesWritten = 0;
	//  204  403:aload_0         
	//  205  404:iconst_0        
	//  206  405:putfield        #382 <Field int sampleBytesWritten>
			sampleCurrentNalBytesRemaining = 0;
	//  207  408:aload_0         
	//  208  409:iconst_0        
	//  209  410:putfield        #396 <Field int sampleCurrentNalBytesRemaining>
			return 0;
	//  210  413:iconst_0        
	//  211  414:ireturn         
		} else
		{
			positionholder.position = l1;
	//  212  415:aload_2         
	//  213  416:lload           7
	//  214  418:putfield        #376 <Field long PositionHolder.position>
			return 1;
	//  215  421:iconst_1        
	//  216  422:ireturn         
		}
	}

	private static boolean shouldParseContainerAtom(int i)
	{
		return i == Atom.TYPE_moov || i == Atom.TYPE_trak || i == Atom.TYPE_mdia || i == Atom.TYPE_minf || i == Atom.TYPE_stbl || i == Atom.TYPE_edts;
	//    0    0:iload_0         
	//    1    1:getstatic       #144 <Field int Atom.TYPE_moov>
	//    2    4:icmpeq          47
	//    3    7:iload_0         
	//    4    8:getstatic       #203 <Field int Atom.TYPE_trak>
	//    5   11:icmpeq          47
	//    6   14:iload_0         
	//    7   15:getstatic       #215 <Field int Atom.TYPE_mdia>
	//    8   18:icmpeq          47
	//    9   21:iload_0         
	//   10   22:getstatic       #222 <Field int Atom.TYPE_minf>
	//   11   25:icmpeq          47
	//   12   28:iload_0         
	//   13   29:getstatic       #225 <Field int Atom.TYPE_stbl>
	//   14   32:icmpeq          47
	//   15   35:iload_0         
	//   16   36:getstatic       #419 <Field int Atom.TYPE_edts>
	//   17   39:icmpne          45
	//   18   42:goto            47
	//   19   45:iconst_0        
	//   20   46:ireturn         
	//   21   47:iconst_1        
	//   22   48:ireturn         
	}

	private static boolean shouldParseLeafAtom(int i)
	{
		return i == Atom.TYPE_mdhd || i == Atom.TYPE_mvhd || i == Atom.TYPE_hdlr || i == Atom.TYPE_stsd || i == Atom.TYPE_stts || i == Atom.TYPE_stss || i == Atom.TYPE_ctts || i == Atom.TYPE_elst || i == Atom.TYPE_stsc || i == Atom.TYPE_stsz || i == Atom.TYPE_stz2 || i == Atom.TYPE_stco || i == Atom.TYPE_co64 || i == Atom.TYPE_tkhd || i == Atom.TYPE_ftyp || i == Atom.TYPE_udta;
	//    0    0:iload_0         
	//    1    1:getstatic       #422 <Field int Atom.TYPE_mdhd>
	//    2    4:icmpeq          117
	//    3    7:iload_0         
	//    4    8:getstatic       #206 <Field int Atom.TYPE_mvhd>
	//    5   11:icmpeq          117
	//    6   14:iload_0         
	//    7   15:getstatic       #425 <Field int Atom.TYPE_hdlr>
	//    8   18:icmpeq          117
	//    9   21:iload_0         
	//   10   22:getstatic       #428 <Field int Atom.TYPE_stsd>
	//   11   25:icmpeq          117
	//   12   28:iload_0         
	//   13   29:getstatic       #431 <Field int Atom.TYPE_stts>
	//   14   32:icmpeq          117
	//   15   35:iload_0         
	//   16   36:getstatic       #434 <Field int Atom.TYPE_stss>
	//   17   39:icmpeq          117
	//   18   42:iload_0         
	//   19   43:getstatic       #437 <Field int Atom.TYPE_ctts>
	//   20   46:icmpeq          117
	//   21   49:iload_0         
	//   22   50:getstatic       #440 <Field int Atom.TYPE_elst>
	//   23   53:icmpeq          117
	//   24   56:iload_0         
	//   25   57:getstatic       #443 <Field int Atom.TYPE_stsc>
	//   26   60:icmpeq          117
	//   27   63:iload_0         
	//   28   64:getstatic       #446 <Field int Atom.TYPE_stsz>
	//   29   67:icmpeq          117
	//   30   70:iload_0         
	//   31   71:getstatic       #449 <Field int Atom.TYPE_stz2>
	//   32   74:icmpeq          117
	//   33   77:iload_0         
	//   34   78:getstatic       #452 <Field int Atom.TYPE_stco>
	//   35   81:icmpeq          117
	//   36   84:iload_0         
	//   37   85:getstatic       #455 <Field int Atom.TYPE_co64>
	//   38   88:icmpeq          117
	//   39   91:iload_0         
	//   40   92:getstatic       #458 <Field int Atom.TYPE_tkhd>
	//   41   95:icmpeq          117
	//   42   98:iload_0         
	//   43   99:getstatic       #358 <Field int Atom.TYPE_ftyp>
	//   44  102:icmpeq          117
	//   45  105:iload_0         
	//   46  106:getstatic       #175 <Field int Atom.TYPE_udta>
	//   47  109:icmpne          115
	//   48  112:goto            117
	//   49  115:iconst_0        
	//   50  116:ireturn         
	//   51  117:iconst_1        
	//   52  118:ireturn         
	}

	public long getPosition(long l)
	{
		long l1 = 0xffffffffL;
	//    0    0:ldc2w           #97  <Long 0xffffffffL>
	//    1    3:lstore          6
		int i = 0;
	//    2    5:iconst_0        
	//    3    6:istore_3        
		do
		{
			Mp4Track amp4track[] = tracks;
	//    4    7:aload_0         
	//    5    8:getfield        #100 <Field Mp4Extractor$Mp4Track[] tracks>
	//    6   11:astore          12
			if(i < amp4track.length)
	//*   7   13:iload_3         
	//*   8   14:aload           12
	//*   9   16:arraylength     
	//*  10   17:icmpge          103
			{
				TrackSampleTable tracksampletable = amp4track[i].sampleTable;
	//   11   20:aload           12
	//   12   22:iload_3         
	//   13   23:aaload          
	//   14   24:getfield        #107 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   15   27:astore          12
				int k = tracksampletable.getIndexOfEarlierOrEqualSynchronizationSample(l);
	//   16   29:aload           12
	//   17   31:lload_1         
	//   18   32:invokevirtual   #463 <Method int TrackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(long)>
	//   19   35:istore          5
				int j = k;
	//   20   37:iload           5
	//   21   39:istore          4
				if(k == -1)
	//*  22   41:iload           5
	//*  23   43:iconst_m1       
	//*  24   44:icmpne          55
					j = tracksampletable.getIndexOfLaterOrEqualSynchronizationSample(l);
	//   25   47:aload           12
	//   26   49:lload_1         
	//   27   50:invokevirtual   #466 <Method int TrackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(long)>
	//   28   53:istore          4
				tracks[i].sampleIndex = j;
	//   29   55:aload_0         
	//   30   56:getfield        #100 <Field Mp4Extractor$Mp4Track[] tracks>
	//   31   59:iload_3         
	//   32   60:aaload          
	//   33   61:iload           4
	//   34   63:putfield        #103 <Field int Mp4Extractor$Mp4Track.sampleIndex>
				long l3 = tracksampletable.offsets[j];
	//   35   66:aload           12
	//   36   68:getfield        #116 <Field long[] TrackSampleTable.offsets>
	//   37   71:iload           4
	//   38   73:laload          
	//   39   74:lstore          10
				long l2 = l1;
	//   40   76:lload           6
	//   41   78:lstore          8
				if(l3 < l1)
	//*  42   80:lload           10
	//*  43   82:lload           6
	//*  44   84:lcmp            
	//*  45   85:ifge            92
					l2 = l3;
	//   46   88:lload           10
	//   47   90:lstore          8
				i++;
	//   48   92:iload_3         
	//   49   93:iconst_1        
	//   50   94:iadd            
	//   51   95:istore_3        
				l1 = l2;
	//   52   96:lload           8
	//   53   98:lstore          6
			} else
	//*  54  100:goto            7
			{
				return l1;
	//   55  103:lload           6
	//   56  105:lreturn         
			}
		} while(true);
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #231 <Field ExtractorOutput extractorOutput>
	//    3    5:return          
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		do
			switch(parserState)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field int parserState>
			{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 60
	//	               1 50
	//	               2 39
			default:
				return readSample(extractorinput, positionholder);
	//    3   32:aload_0         
	//    4   33:aload_1         
	//    5   34:aload_2         
	//    6   35:invokespecial   #472 <Method int readSample(ExtractorInput, PositionHolder)>
	//    7   38:ireturn         

			case 2: // '\002'
				if(readAtomPayload(extractorinput, positionholder))
	//*   8   39:aload_0         
	//*   9   40:aload_1         
	//*  10   41:aload_2         
	//*  11   42:invokespecial   #474 <Method boolean readAtomPayload(ExtractorInput, PositionHolder)>
	//*  12   45:ifeq            0
					return 1;
	//   13   48:iconst_1        
	//   14   49:ireturn         
				break;

			case 1: // '\001'
				if(!readAtomHeader(extractorinput))
	//*  15   50:aload_0         
	//*  16   51:aload_1         
	//*  17   52:invokespecial   #476 <Method boolean readAtomHeader(ExtractorInput)>
	//*  18   55:ifne            0
					return -1;
	//   19   58:iconst_m1       
	//   20   59:ireturn         
				break;

			case 0: // '\0'
				if(extractorinput.getPosition() == 0L)
	//*  21   60:aload_1         
	//*  22   61:invokeinterface #328 <Method long ExtractorInput.getPosition()>
	//*  23   66:lconst_0        
	//*  24   67:lcmp            
	//*  25   68:ifne            78
					enterReadingAtomHeaderState();
	//   26   71:aload_0         
	//   27   72:invokespecial   #90  <Method void enterReadingAtomHeaderState()>
				else
	//*  28   75:goto            0
					parserState = 3;
	//   29   78:aload_0         
	//   30   79:iconst_3        
	//   31   80:putfield        #92  <Field int parserState>
				break;
			}
		while(true);
	//   32   83:goto            0
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		containerAtoms.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Stack containerAtoms>
	//    2    4:invokevirtual   #151 <Method void Stack.clear()>
		atomHeaderBytesRead = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #94  <Field int atomHeaderBytesRead>
		sampleBytesWritten = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #382 <Field int sampleBytesWritten>
		sampleCurrentNalBytesRemaining = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #396 <Field int sampleCurrentNalBytesRemaining>
		parserState = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #92  <Field int parserState>
	//   15   27:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return Sniffer.sniffUnfragmented(extractorinput);
	//    0    0:aload_1         
	//    1    1:invokestatic    #484 <Method boolean Sniffer.sniffUnfragmented(ExtractorInput)>
	//    2    4:ireturn         
	}

	private static final int BRAND_QUICKTIME = Util.getIntegerCodeForString("qt  ");
	private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 0x40000L;
	private static final int STATE_AFTER_SEEK = 0;
	private static final int STATE_READING_ATOM_HEADER = 1;
	private static final int STATE_READING_ATOM_PAYLOAD = 2;
	private static final int STATE_READING_SAMPLE = 3;
	private ParsableByteArray atomData;
	private final ParsableByteArray atomHeader = new ParsableByteArray(16);
	private int atomHeaderBytesRead;
	private long atomSize;
	private int atomType;
	private final Stack containerAtoms = new Stack();
	private ExtractorOutput extractorOutput;
	private boolean isQuickTime;
	private final ParsableByteArray nalLength = new ParsableByteArray(4);
	private final ParsableByteArray nalStartCode;
	private int parserState;
	private int sampleBytesWritten;
	private int sampleCurrentNalBytesRemaining;
	private int sampleSize;
	private Mp4Track tracks[];

	static 
	{
	//    0    0:ldc1            #50  <String "qt  ">
	//    1    2:invokestatic    #56  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #58  <Field int BRAND_QUICKTIME>
	//*   3    8:return          
	}
}
