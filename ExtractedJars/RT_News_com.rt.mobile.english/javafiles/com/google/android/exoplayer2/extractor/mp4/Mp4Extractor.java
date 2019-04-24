// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			TrackSampleTable, Atom, AtomParsers, Track, 
//			Sniffer

public final class Mp4Extractor
	implements Extractor, SeekMap
{
	public static interface Flags
		extends Annotation
	{
	}

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
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #81  <Method void Mp4Extractor(int)>
	//    3    5:return          
	}

	public Mp4Extractor(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		flags = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #84  <Field int flags>
		atomHeader = new ParsableByteArray(16);
	//    5    9:aload_0         
	//    6   10:new             #86  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:bipush          16
	//    9   16:invokespecial   #87  <Method void ParsableByteArray(int)>
	//   10   19:putfield        #89  <Field ParsableByteArray atomHeader>
		containerAtoms = new ArrayDeque();
	//   11   22:aload_0         
	//   12   23:new             #91  <Class ArrayDeque>
	//   13   26:dup             
	//   14   27:invokespecial   #92  <Method void ArrayDeque()>
	//   15   30:putfield        #94  <Field ArrayDeque containerAtoms>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//   16   33:aload_0         
	//   17   34:new             #86  <Class ParsableByteArray>
	//   18   37:dup             
	//   19   38:getstatic       #100 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   20   41:invokespecial   #103 <Method void ParsableByteArray(byte[])>
	//   21   44:putfield        #105 <Field ParsableByteArray nalStartCode>
		nalLength = new ParsableByteArray(4);
	//   22   47:aload_0         
	//   23   48:new             #86  <Class ParsableByteArray>
	//   24   51:dup             
	//   25   52:iconst_4        
	//   26   53:invokespecial   #87  <Method void ParsableByteArray(int)>
	//   27   56:putfield        #107 <Field ParsableByteArray nalLength>
		sampleTrackIndex = -1;
	//   28   59:aload_0         
	//   29   60:iconst_m1       
	//   30   61:putfield        #109 <Field int sampleTrackIndex>
	//   31   64:return          
	}

	private static long[][] calculateAccumulatedSampleSizes(Mp4Track amp4track[])
	{
		long al[][] = new long[amp4track.length][];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:anewarray       long[][]
	//    3    5:astore          11
		int ai[] = new int[amp4track.length];
	//    4    7:aload_0         
	//    5    8:arraylength     
	//    6    9:newarray        int[]
	//    7   11:astore          12
		long al1[] = new long[amp4track.length];
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:newarray        long[]
	//   11   17:astore          13
		boolean aflag[] = new boolean[amp4track.length];
	//   12   19:aload_0         
	//   13   20:arraylength     
	//   14   21:newarray        boolean[]
	//   15   23:astore          14
		for(int i = 0; i < amp4track.length; i++)
	//*  16   25:iconst_0        
	//*  17   26:istore_1        
	//*  18   27:iload_1         
	//*  19   28:aload_0         
	//*  20   29:arraylength     
	//*  21   30:icmpge          70
		{
			al[i] = new long[amp4track[i].sampleTable.sampleCount];
	//   22   33:aload           11
	//   23   35:iload_1         
	//   24   36:aload_0         
	//   25   37:iload_1         
	//   26   38:aaload          
	//   27   39:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   28   42:getfield        #122 <Field int TrackSampleTable.sampleCount>
	//   29   45:newarray        long[]
	//   30   47:aastore         
			al1[i] = amp4track[i].sampleTable.timestampsUs[0];
	//   31   48:aload           13
	//   32   50:iload_1         
	//   33   51:aload_0         
	//   34   52:iload_1         
	//   35   53:aaload          
	//   36   54:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   37   57:getfield        #125 <Field long[] TrackSampleTable.timestampsUs>
	//   38   60:iconst_0        
	//   39   61:laload          
	//   40   62:lastore         
		}

	//   41   63:iload_1         
	//   42   64:iconst_1        
	//   43   65:iadd            
	//   44   66:istore_1        
	//*  45   67:goto            27
		long l1 = 0L;
	//   46   70:lconst_0        
	//   47   71:lstore          5
		for(int l = 0; l < amp4track.length;)
	//*  48   73:iconst_0        
	//*  49   74:istore_2        
	//*  50   75:iload_2         
	//*  51   76:aload_0         
	//*  52   77:arraylength     
	//*  53   78:icmpge          232
		{
			int i1 = -1;
	//   54   81:iconst_m1       
	//   55   82:istore_3        
			long l2 = 0xffffffffL;
	//   56   83:ldc2w           #126 <Long 0xffffffffL>
	//   57   86:lstore          7
			for(int j = 0; j < amp4track.length;)
	//*  58   88:iconst_0        
	//*  59   89:istore_1        
	//*  60   90:iload_1         
	//*  61   91:aload_0         
	//*  62   92:arraylength     
	//*  63   93:icmpge          150
			{
				int j1 = i1;
	//   64   96:iload_3         
	//   65   97:istore          4
				long l3 = l2;
	//   66   99:lload           7
	//   67  101:lstore          9
				if(!aflag[j])
	//*  68  103:aload           14
	//*  69  105:iload_1         
	//*  70  106:baload          
	//*  71  107:ifne            136
				{
					j1 = i1;
	//   72  110:iload_3         
	//   73  111:istore          4
					l3 = l2;
	//   74  113:lload           7
	//   75  115:lstore          9
					if(al1[j] <= l2)
	//*  76  117:aload           13
	//*  77  119:iload_1         
	//*  78  120:laload          
	//*  79  121:lload           7
	//*  80  123:lcmp            
	//*  81  124:ifgt            136
					{
						l3 = al1[j];
	//   82  127:aload           13
	//   83  129:iload_1         
	//   84  130:laload          
	//   85  131:lstore          9
						j1 = j;
	//   86  133:iload_1         
	//   87  134:istore          4
					}
				}
				j++;
	//   88  136:iload_1         
	//   89  137:iconst_1        
	//   90  138:iadd            
	//   91  139:istore_1        
				i1 = j1;
	//   92  140:iload           4
	//   93  142:istore_3        
				l2 = l3;
	//   94  143:lload           9
	//   95  145:lstore          7
			}

	//*  96  147:goto            90
			int k = ai[i1];
	//   97  150:aload           12
	//   98  152:iload_3         
	//   99  153:iaload          
	//  100  154:istore_1        
			al[i1][k] = l1;
	//  101  155:aload           11
	//  102  157:iload_3         
	//  103  158:aaload          
	//  104  159:iload_1         
	//  105  160:lload           5
	//  106  162:lastore         
			l2 = amp4track[i1].sampleTable.sizes[k];
	//  107  163:aload_0         
	//  108  164:iload_3         
	//  109  165:aaload          
	//  110  166:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//  111  169:getfield        #131 <Field int[] TrackSampleTable.sizes>
	//  112  172:iload_1         
	//  113  173:iaload          
	//  114  174:i2l             
	//  115  175:lstore          7
			k++;
	//  116  177:iload_1         
	//  117  178:iconst_1        
	//  118  179:iadd            
	//  119  180:istore_1        
			ai[i1] = k;
	//  120  181:aload           12
	//  121  183:iload_3         
	//  122  184:iload_1         
	//  123  185:iastore         
			if(k < al[i1].length)
	//* 124  186:iload_1         
	//* 125  187:aload           11
	//* 126  189:iload_3         
	//* 127  190:aaload          
	//* 128  191:arraylength     
	//* 129  192:icmpge          213
			{
				al1[i1] = amp4track[i1].sampleTable.timestampsUs[k];
	//  130  195:aload           13
	//  131  197:iload_3         
	//  132  198:aload_0         
	//  133  199:iload_3         
	//  134  200:aaload          
	//  135  201:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//  136  204:getfield        #125 <Field long[] TrackSampleTable.timestampsUs>
	//  137  207:iload_1         
	//  138  208:laload          
	//  139  209:lastore         
			} else
	//* 140  210:goto            222
			{
				aflag[i1] = true;
	//  141  213:aload           14
	//  142  215:iload_3         
	//  143  216:iconst_1        
	//  144  217:bastore         
				l++;
	//  145  218:iload_2         
	//  146  219:iconst_1        
	//  147  220:iadd            
	//  148  221:istore_2        
			}
			l1 += l2;
	//  149  222:lload           5
	//  150  224:lload           7
	//  151  226:ladd            
	//  152  227:lstore          5
		}

	//* 153  229:goto            75
		return al;
	//  154  232:aload           11
	//  155  234:areturn         
	}

	private void enterReadingAtomHeaderState()
	{
		parserState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #134 <Field int parserState>
		atomHeaderBytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #136 <Field int atomHeaderBytesRead>
	//    6   10:return          
	}

	private static int getSynchronizationSampleIndex(TrackSampleTable tracksampletable, long l)
	{
		int j = tracksampletable.getIndexOfEarlierOrEqualSynchronizationSample(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #142 <Method int TrackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(long)>
	//    3    5:istore          4
		int i = j;
	//    4    7:iload           4
	//    5    9:istore_3        
		if(j == -1)
	//*   6   10:iload           4
	//*   7   12:iconst_m1       
	//*   8   13:icmpne          22
			i = tracksampletable.getIndexOfLaterOrEqualSynchronizationSample(l);
	//    9   16:aload_0         
	//   10   17:lload_1         
	//   11   18:invokevirtual   #145 <Method int TrackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(long)>
	//   12   21:istore_3        
		return i;
	//   13   22:iload_3         
	//   14   23:ireturn         
	}

	private int getTrackIndexOfNextReadSample(long l)
	{
		int j = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		int i1 = j;
	//    2    3:iload           4
	//    3    5:istore          6
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		long l5 = 0xffffffffL;
	//    6    9:ldc2w           #126 <Long 0xffffffffL>
	//    7   12:lstore          19
		boolean flag3 = true;
	//    8   14:iconst_1        
	//    9   15:istore          10
		long l3 = 0xffffffffL;
	//   10   17:ldc2w           #126 <Long 0xffffffffL>
	//   11   20:lstore          15
		boolean flag1 = true;
	//   12   22:iconst_1        
	//   13   23:istore          7
		long l1 = 0xffffffffL;
	//   14   25:ldc2w           #126 <Long 0xffffffffL>
	//   15   28:lstore          11
		while(i < tracks.length) 
	//*  16   30:iload_3         
	//*  17   31:aload_0         
	//*  18   32:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//*  19   35:arraylength     
	//*  20   36:icmpge          270
		{
			long l7;
label0:
			{
				boolean flag;
				boolean flag2;
				int j1;
				long l2;
				long l4;
				long l6;
label1:
				{
					Mp4Track mp4track = tracks[i];
	//   21   39:aload_0         
	//   22   40:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//   23   43:iload_3         
	//   24   44:aaload          
	//   25   45:astore          25
					int k = mp4track.sampleIndex;
	//   26   47:aload           25
	//   27   49:getfield        #151 <Field int Mp4Extractor$Mp4Track.sampleIndex>
	//   28   52:istore          5
					if(k == mp4track.sampleTable.sampleCount)
	//*  29   54:iload           5
	//*  30   56:aload           25
	//*  31   58:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//*  32   61:getfield        #122 <Field int TrackSampleTable.sampleCount>
	//*  33   64:icmpne          74
					{
						l7 = l5;
	//   34   67:lload           19
	//   35   69:lstore          23
						break label0;
	//   36   71:goto            259
					}
					l2 = mp4track.sampleTable.offsets[k];
	//   37   74:aload           25
	//   38   76:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   39   79:getfield        #154 <Field long[] TrackSampleTable.offsets>
	//   40   82:iload           5
	//   41   84:laload          
	//   42   85:lstore          13
					l6 = accumulatedSampleSizes[i][k];
	//   43   87:aload_0         
	//   44   88:getfield        #156 <Field long[][] accumulatedSampleSizes>
	//   45   91:iload_3         
	//   46   92:aaload          
	//   47   93:iload           5
	//   48   95:laload          
	//   49   96:lstore          21
					l7 = l2 - l;
	//   50   98:lload           13
	//   51  100:lload_1         
	//   52  101:lsub            
	//   53  102:lstore          23
					if(l7 >= 0L && l7 < 0x40000L)
	//*  54  104:lload           23
	//*  55  106:lconst_0        
	//*  56  107:lcmp            
	//*  57  108:iflt            129
	//*  58  111:lload           23
	//*  59  113:ldc2w           #28  <Long 0x40000L>
	//*  60  116:lcmp            
	//*  61  117:iflt            123
	//*  62  120:goto            129
						flag = false;
	//   63  123:iconst_0        
	//   64  124:istore          5
					else
	//*  65  126:goto            132
						flag = true;
	//   66  129:iconst_1        
	//   67  130:istore          5
					if(flag || !flag1)
	//*  68  132:iload           5
	//*  69  134:ifne            142
	//*  70  137:iload           7
	//*  71  139:ifne            189
					{
						l4 = l3;
	//   72  142:lload           15
	//   73  144:lstore          17
						j1 = j;
	//   74  146:iload           4
	//   75  148:istore          9
						flag2 = flag1;
	//   76  150:iload           7
	//   77  152:istore          8
						l2 = l1;
	//   78  154:lload           11
	//   79  156:lstore          13
						if(flag != flag1)
							break label1;
	//   80  158:iload           5
	//   81  160:iload           7
	//   82  162:icmpne          204
						l4 = l3;
	//   83  165:lload           15
	//   84  167:lstore          17
						j1 = j;
	//   85  169:iload           4
	//   86  171:istore          9
						flag2 = flag1;
	//   87  173:iload           7
	//   88  175:istore          8
						l2 = l1;
	//   89  177:lload           11
	//   90  179:lstore          13
						if(l7 >= l1)
							break label1;
	//   91  181:lload           23
	//   92  183:lload           11
	//   93  185:lcmp            
	//   94  186:ifge            204
					}
					flag2 = flag;
	//   95  189:iload           5
	//   96  191:istore          8
					j1 = i;
	//   97  193:iload_3         
	//   98  194:istore          9
					l4 = l6;
	//   99  196:lload           21
	//  100  198:lstore          17
					l2 = l7;
	//  101  200:lload           23
	//  102  202:lstore          13
				}
				l7 = l5;
	//  103  204:lload           19
	//  104  206:lstore          23
				l3 = l4;
	//  105  208:lload           17
	//  106  210:lstore          15
				j = j1;
	//  107  212:iload           9
	//  108  214:istore          4
				flag1 = flag2;
	//  109  216:iload           8
	//  110  218:istore          7
				l1 = l2;
	//  111  220:lload           13
	//  112  222:lstore          11
				if(l6 < l5)
	//* 113  224:lload           21
	//* 114  226:lload           19
	//* 115  228:lcmp            
	//* 116  229:ifge            259
				{
					i1 = i;
	//  117  232:iload_3         
	//  118  233:istore          6
					l1 = l2;
	//  119  235:lload           13
	//  120  237:lstore          11
					flag1 = flag2;
	//  121  239:iload           8
	//  122  241:istore          7
					j = j1;
	//  123  243:iload           9
	//  124  245:istore          4
					l3 = l4;
	//  125  247:lload           17
	//  126  249:lstore          15
					flag3 = flag;
	//  127  251:iload           5
	//  128  253:istore          10
					l7 = l6;
	//  129  255:lload           21
	//  130  257:lstore          23
				}
			}
			i++;
	//  131  259:iload_3         
	//  132  260:iconst_1        
	//  133  261:iadd            
	//  134  262:istore_3        
			l5 = l7;
	//  135  263:lload           23
	//  136  265:lstore          19
		}
	//* 137  267:goto            30
		i = j;
	//  138  270:iload           4
	//  139  272:istore_3        
		if(l5 != 0xffffffffL)
	//* 140  273:lload           19
	//* 141  275:ldc2w           #126 <Long 0xffffffffL>
	//* 142  278:lcmp            
	//* 143  279:ifeq            308
		{
			i = j;
	//  144  282:iload           4
	//  145  284:istore_3        
			if(flag3)
	//* 146  285:iload           10
	//* 147  287:ifeq            308
			{
				if(l3 < l5 + 0xa00000L)
	//* 148  290:lload           15
	//* 149  292:lload           19
	//* 150  294:ldc2w           #25  <Long 0xa00000L>
	//* 151  297:ladd            
	//* 152  298:lcmp            
	//* 153  299:ifge            305
					return j;
	//  154  302:iload           4
	//  155  304:ireturn         
				i = i1;
	//  156  305:iload           6
	//  157  307:istore_3        
			}
		}
		return i;
	//  158  308:iload_3         
	//  159  309:ireturn         
	}

	private ArrayList getTrackSampleTables(Atom.ContainerAtom containeratom, GaplessInfoHolder gaplessinfoholder, boolean flag)
		throws ParserException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #162 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void ArrayList()>
	//    3    7:astore          5
		for(int i = 0; i < containeratom.containerChildren.size(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:aload_1         
	//*   8   15:getfield        #169 <Field List Atom$ContainerAtom.containerChildren>
	//*   9   18:invokeinterface #175 <Method int List.size()>
	//*  10   23:icmpge          143
		{
			Object obj = ((Object) ((Atom.ContainerAtom)containeratom.containerChildren.get(i)));
	//   11   26:aload_1         
	//   12   27:getfield        #169 <Field List Atom$ContainerAtom.containerChildren>
	//   13   30:iload           4
	//   14   32:invokeinterface #179 <Method Object List.get(int)>
	//   15   37:checkcast       #165 <Class Atom$ContainerAtom>
	//   16   40:astore          6
			if(((Atom.ContainerAtom) (obj)).type != Atom.TYPE_trak)
	//*  17   42:aload           6
	//*  18   44:getfield        #182 <Field int Atom$ContainerAtom.type>
	//*  19   47:getstatic       #187 <Field int Atom.TYPE_trak>
	//*  20   50:icmpeq          56
				continue;
	//   21   53:goto            134
			Track track = AtomParsers.parseTrak(((Atom.ContainerAtom) (obj)), containeratom.getLeafAtomOfType(Atom.TYPE_mvhd), 0x1L, ((com.google.android.exoplayer2.drm.DrmInitData) (null)), flag, isQuickTime);
	//   22   56:aload           6
	//   23   58:aload_1         
	//   24   59:getstatic       #190 <Field int Atom.TYPE_mvhd>
	//   25   62:invokevirtual   #194 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   26   65:ldc2w           #195 <Long 0x1L>
	//   27   68:aconst_null     
	//   28   69:iload_3         
	//   29   70:aload_0         
	//   30   71:getfield        #198 <Field boolean isQuickTime>
	//   31   74:invokestatic    #204 <Method Track AtomParsers.parseTrak(Atom$ContainerAtom, Atom$LeafAtom, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean)>
	//   32   77:astore          7
			if(track == null)
	//*  33   79:aload           7
	//*  34   81:ifnonnull       87
				continue;
	//   35   84:goto            134
			obj = ((Object) (AtomParsers.parseStbl(track, ((Atom.ContainerAtom) (obj)).getContainerAtomOfType(Atom.TYPE_mdia).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl), gaplessinfoholder)));
	//   36   87:aload           7
	//   37   89:aload           6
	//   38   91:getstatic       #207 <Field int Atom.TYPE_mdia>
	//   39   94:invokevirtual   #211 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   40   97:getstatic       #214 <Field int Atom.TYPE_minf>
	//   41  100:invokevirtual   #211 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   42  103:getstatic       #217 <Field int Atom.TYPE_stbl>
	//   43  106:invokevirtual   #211 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   44  109:aload_2         
	//   45  110:invokestatic    #221 <Method TrackSampleTable AtomParsers.parseStbl(Track, Atom$ContainerAtom, GaplessInfoHolder)>
	//   46  113:astore          6
			if(((TrackSampleTable) (obj)).sampleCount != 0)
	//*  47  115:aload           6
	//*  48  117:getfield        #122 <Field int TrackSampleTable.sampleCount>
	//*  49  120:ifne            126
	//*  50  123:goto            134
				arraylist.add(obj);
	//   51  126:aload           5
	//   52  128:aload           6
	//   53  130:invokevirtual   #225 <Method boolean ArrayList.add(Object)>
	//   54  133:pop             
		}

	//   55  134:iload           4
	//   56  136:iconst_1        
	//   57  137:iadd            
	//   58  138:istore          4
	//*  59  140:goto            12
		return arraylist;
	//   60  143:aload           5
	//   61  145:areturn         
	}

	private static long maybeAdjustSeekOffset(TrackSampleTable tracksampletable, long l, long l1)
	{
		int i = getSynchronizationSampleIndex(tracksampletable, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #232 <Method int getSynchronizationSampleIndex(TrackSampleTable, long)>
	//    3    5:istore          5
		if(i == -1)
	//*   4    7:iload           5
	//*   5    9:iconst_m1       
	//*   6   10:icmpne          15
			return l1;
	//    7   13:lload_3         
	//    8   14:lreturn         
		else
			return Math.min(tracksampletable.offsets[i], l1);
	//    9   15:aload_0         
	//   10   16:getfield        #154 <Field long[] TrackSampleTable.offsets>
	//   11   19:iload           5
	//   12   21:laload          
	//   13   22:lload_3         
	//   14   23:invokestatic    #238 <Method long Math.min(long, long)>
	//   15   26:lreturn         
	}

	private void processAtomEnded(long l)
		throws ParserException
	{
		do
		{
			if(containerAtoms.isEmpty() || ((Atom.ContainerAtom)containerAtoms.peek()).endPosition != l)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ArrayDeque containerAtoms>
	//    2    4:invokevirtual   #244 <Method boolean ArrayDeque.isEmpty()>
	//    3    7:ifne            96
	//    4   10:aload_0         
	//    5   11:getfield        #94  <Field ArrayDeque containerAtoms>
	//    6   14:invokevirtual   #248 <Method Object ArrayDeque.peek()>
	//    7   17:checkcast       #165 <Class Atom$ContainerAtom>
	//    8   20:getfield        #251 <Field long Atom$ContainerAtom.endPosition>
	//    9   23:lload_1         
	//   10   24:lcmp            
	//   11   25:ifne            96
			Atom.ContainerAtom containeratom = (Atom.ContainerAtom)containerAtoms.pop();
	//   12   28:aload_0         
	//   13   29:getfield        #94  <Field ArrayDeque containerAtoms>
	//   14   32:invokevirtual   #254 <Method Object ArrayDeque.pop()>
	//   15   35:checkcast       #165 <Class Atom$ContainerAtom>
	//   16   38:astore_3        
			if(containeratom.type == Atom.TYPE_moov)
	//*  17   39:aload_3         
	//*  18   40:getfield        #182 <Field int Atom$ContainerAtom.type>
	//*  19   43:getstatic       #257 <Field int Atom.TYPE_moov>
	//*  20   46:icmpne          69
			{
				processMoovAtom(containeratom);
	//   21   49:aload_0         
	//   22   50:aload_3         
	//   23   51:invokespecial   #261 <Method void processMoovAtom(Atom$ContainerAtom)>
				containerAtoms.clear();
	//   24   54:aload_0         
	//   25   55:getfield        #94  <Field ArrayDeque containerAtoms>
	//   26   58:invokevirtual   #264 <Method void ArrayDeque.clear()>
				parserState = 2;
	//   27   61:aload_0         
	//   28   62:iconst_2        
	//   29   63:putfield        #134 <Field int parserState>
			} else
	//*  30   66:goto            0
			if(!containerAtoms.isEmpty())
	//*  31   69:aload_0         
	//*  32   70:getfield        #94  <Field ArrayDeque containerAtoms>
	//*  33   73:invokevirtual   #244 <Method boolean ArrayDeque.isEmpty()>
	//*  34   76:ifne            0
				((Atom.ContainerAtom)containerAtoms.peek()).add(containeratom);
	//   35   79:aload_0         
	//   36   80:getfield        #94  <Field ArrayDeque containerAtoms>
	//   37   83:invokevirtual   #248 <Method Object ArrayDeque.peek()>
	//   38   86:checkcast       #165 <Class Atom$ContainerAtom>
	//   39   89:aload_3         
	//   40   90:invokevirtual   #266 <Method void Atom$ContainerAtom.add(Atom$ContainerAtom)>
		} while(true);
	//   41   93:goto            0
		if(parserState != 2)
	//*  42   96:aload_0         
	//*  43   97:getfield        #134 <Field int parserState>
	//*  44  100:iconst_2        
	//*  45  101:icmpeq          108
			enterReadingAtomHeaderState();
	//   46  104:aload_0         
	//   47  105:invokespecial   #268 <Method void enterReadingAtomHeaderState()>
	//   48  108:return          
	}

	private static boolean processFtypAtom(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #273 <Method void ParsableByteArray.setPosition(int)>
		if(parsablebytearray.readInt() == BRAND_QUICKTIME)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #276 <Method int ParsableByteArray.readInt()>
	//*   5   10:getstatic       #77  <Field int BRAND_QUICKTIME>
	//*   6   13:icmpne          18
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
		parsablebytearray.skipBytes(4);
	//    9   18:aload_0         
	//   10   19:iconst_4        
	//   11   20:invokevirtual   #279 <Method void ParsableByteArray.skipBytes(int)>
		while(parsablebytearray.bytesLeft() > 0) 
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #282 <Method int ParsableByteArray.bytesLeft()>
	//*  14   27:ifle            42
			if(parsablebytearray.readInt() == BRAND_QUICKTIME)
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #276 <Method int ParsableByteArray.readInt()>
	//*  17   34:getstatic       #77  <Field int BRAND_QUICKTIME>
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
		AtomParsers.UnhandledEditListException unhandlededitlistexception;
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #162 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void ArrayList()>
	//    3    7:astore          16
		GaplessInfoHolder gaplessinfoholder = new GaplessInfoHolder();
	//    4    9:new             #286 <Class GaplessInfoHolder>
	//    5   12:dup             
	//    6   13:invokespecial   #287 <Method void GaplessInfoHolder()>
	//    7   16:astore          13
		Object obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_udta)));
	//    8   18:aload_1         
	//    9   19:getstatic       #290 <Field int Atom.TYPE_udta>
	//   10   22:invokevirtual   #194 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   11   25:astore          11
		com.google.android.exoplayer2.metadata.Metadata metadata;
		if(obj != null)
	//*  12   27:aload           11
	//*  13   29:ifnull          67
		{
			obj = ((Object) (AtomParsers.parseUdta(((Atom.LeafAtom) (obj)), isQuickTime)));
	//   14   32:aload           11
	//   15   34:aload_0         
	//   16   35:getfield        #198 <Field boolean isQuickTime>
	//   17   38:invokestatic    #294 <Method com.google.android.exoplayer2.metadata.Metadata AtomParsers.parseUdta(Atom$LeafAtom, boolean)>
	//   18   41:astore          11
			metadata = ((com.google.android.exoplayer2.metadata.Metadata) (obj));
	//   19   43:aload           11
	//   20   45:astore          12
			if(obj != null)
	//*  21   47:aload           11
	//*  22   49:ifnull          70
			{
				gaplessinfoholder.setFromMetadata(((com.google.android.exoplayer2.metadata.Metadata) (obj)));
	//   23   52:aload           13
	//   24   54:aload           11
	//   25   56:invokevirtual   #298 <Method boolean GaplessInfoHolder.setFromMetadata(com.google.android.exoplayer2.metadata.Metadata)>
	//   26   59:pop             
				metadata = ((com.google.android.exoplayer2.metadata.Metadata) (obj));
	//   27   60:aload           11
	//   28   62:astore          12
			}
		} else
	//*  29   64:goto            70
		{
			metadata = null;
	//   30   67:aconst_null     
	//   31   68:astore          12
		}
		int j = flags;
	//   32   70:aload_0         
	//   33   71:getfield        #84  <Field int flags>
	//   34   74:istore_3        
		int i = 0;
	//   35   75:iconst_0        
	//   36   76:istore_2        
		boolean flag;
		if((j & 1) != 0)
	//*  37   77:iload_3         
	//*  38   78:iconst_1        
	//*  39   79:iand            
	//*  40   80:ifeq            89
			flag = true;
	//   41   83:iconst_1        
	//   42   84:istore          6
		else
	//*  43   86:goto            92
			flag = false;
	//   44   89:iconst_0        
	//   45   90:istore          6
		ArrayList arraylist;
		try
		{
			arraylist = getTrackSampleTables(containeratom, gaplessinfoholder, flag);
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:aload           13
	//   49   96:iload           6
	//   50   98:invokespecial   #300 <Method ArrayList getTrackSampleTables(Atom$ContainerAtom, GaplessInfoHolder, boolean)>
	//   51  101:astore          14
		}
	//*  52  103:goto            125
	//*  53  106:new             #286 <Class GaplessInfoHolder>
	//*  54  109:dup             
	//*  55  110:invokespecial   #287 <Method void GaplessInfoHolder()>
	//*  56  113:astore          13
	//*  57  115:aload_0         
	//*  58  116:aload_1         
	//*  59  117:aload           13
	//*  60  119:iconst_1        
	//*  61  120:invokespecial   #300 <Method ArrayList getTrackSampleTables(Atom$ContainerAtom, GaplessInfoHolder, boolean)>
	//*  62  123:astore          14
	//*  63  125:aload           14
	//*  64  127:invokevirtual   #301 <Method int ArrayList.size()>
	//*  65  130:istore          5
	//*  66  132:iconst_m1       
	//*  67  133:istore_3        
	//*  68  134:ldc2w           #195 <Long 0x1L>
	//*  69  137:lstore          7
	//*  70  139:iload_2         
	//*  71  140:iload           5
	//*  72  142:icmpge          371
	//*  73  145:aload           14
	//*  74  147:iload_2         
	//*  75  148:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//*  76  151:checkcast       #119 <Class TrackSampleTable>
	//*  77  154:astore          17
	//*  78  156:aload           17
	//*  79  158:getfield        #306 <Field Track TrackSampleTable.track>
	//*  80  161:astore          18
	//*  81  163:new             #15  <Class Mp4Extractor$Mp4Track>
	//*  82  166:dup             
	//*  83  167:aload           18
	//*  84  169:aload           17
	//*  85  171:aload_0         
	//*  86  172:getfield        #308 <Field ExtractorOutput extractorOutput>
	//*  87  175:iload_2         
	//*  88  176:aload           18
	//*  89  178:getfield        #311 <Field int Track.type>
	//*  90  181:invokeinterface #316 <Method TrackOutput ExtractorOutput.track(int, int)>
	//*  91  186:invokespecial   #319 <Method void Mp4Extractor$Mp4Track(Track, TrackSampleTable, TrackOutput)>
	//*  92  189:astore          19
	//*  93  191:aload           17
	//*  94  193:getfield        #322 <Field int TrackSampleTable.maximumSize>
	//*  95  196:istore          4
	//*  96  198:aload           18
	//*  97  200:getfield        #326 <Field Format Track.format>
	//*  98  203:iload           4
	//*  99  205:bipush          30
	//* 100  207:iadd            
	//* 101  208:invokevirtual   #332 <Method Format Format.copyWithMaxInputSize(int)>
	//* 102  211:astore          15
	//* 103  213:aload           15
	//* 104  215:astore          11
	//* 105  217:aload           18
	//* 106  219:getfield        #311 <Field int Track.type>
	//* 107  222:iconst_1        
	//* 108  223:icmpne          269
	//* 109  226:aload           15
	//* 110  228:astore_1        
	//* 111  229:aload           13
	//* 112  231:invokevirtual   #335 <Method boolean GaplessInfoHolder.hasGaplessInfo()>
	//* 113  234:ifeq            253
	//* 114  237:aload           15
	//* 115  239:aload           13
	//* 116  241:getfield        #338 <Field int GaplessInfoHolder.encoderDelay>
	//* 117  244:aload           13
	//* 118  246:getfield        #341 <Field int GaplessInfoHolder.encoderPadding>
	//* 119  249:invokevirtual   #345 <Method Format Format.copyWithGaplessInfo(int, int)>
	//* 120  252:astore_1        
	//* 121  253:aload_1         
	//* 122  254:astore          11
	//* 123  256:aload           12
	//* 124  258:ifnull          269
	//* 125  261:aload_1         
	//* 126  262:aload           12
	//* 127  264:invokevirtual   #349 <Method Format Format.copyWithMetadata(com.google.android.exoplayer2.metadata.Metadata)>
	//* 128  267:astore          11
	//* 129  269:aload           19
	//* 130  271:getfield        #353 <Field TrackOutput Mp4Extractor$Mp4Track.trackOutput>
	//* 131  274:aload           11
	//* 132  276:invokeinterface #358 <Method void TrackOutput.format(Format)>
	//* 133  281:aload           18
	//* 134  283:getfield        #360 <Field long Track.durationUs>
	//* 135  286:ldc2w           #195 <Long 0x1L>
	//* 136  289:lcmp            
	//* 137  290:ifeq            303
	//* 138  293:aload           18
	//* 139  295:getfield        #360 <Field long Track.durationUs>
	//* 140  298:lstore          9
	//* 141  300:goto            310
	//* 142  303:aload           17
	//* 143  305:getfield        #361 <Field long TrackSampleTable.durationUs>
	//* 144  308:lstore          9
	//* 145  310:lload           7
	//* 146  312:lload           9
	//* 147  314:invokestatic    #364 <Method long Math.max(long, long)>
	//* 148  317:lstore          7
	//* 149  319:aload           18
	//* 150  321:getfield        #311 <Field int Track.type>
	//* 151  324:iconst_2        
	//* 152  325:icmpne          348
	//* 153  328:iload_3         
	//* 154  329:istore          4
	//* 155  331:iload_3         
	//* 156  332:iconst_m1       
	//* 157  333:icmpne          351
	//* 158  336:aload           16
	//* 159  338:invokeinterface #175 <Method int List.size()>
	//* 160  343:istore          4
	//* 161  345:goto            351
	//* 162  348:iload_3         
	//* 163  349:istore          4
	//* 164  351:aload           16
	//* 165  353:aload           19
	//* 166  355:invokeinterface #365 <Method boolean List.add(Object)>
	//* 167  360:pop             
	//* 168  361:iload_2         
	//* 169  362:iconst_1        
	//* 170  363:iadd            
	//* 171  364:istore_2        
	//* 172  365:iload           4
	//* 173  367:istore_3        
	//* 174  368:goto            139
	//* 175  371:aload_0         
	//* 176  372:iload_3         
	//* 177  373:putfield        #367 <Field int firstVideoTrackIndex>
	//* 178  376:aload_0         
	//* 179  377:lload           7
	//* 180  379:putfield        #368 <Field long durationUs>
	//* 181  382:aload_0         
	//* 182  383:aload           16
	//* 183  385:aload           16
	//* 184  387:invokeinterface #175 <Method int List.size()>
	//* 185  392:anewarray       Mp4Track[]
	//* 186  395:invokeinterface #372 <Method Object[] List.toArray(Object[])>
	//* 187  400:checkcast       #373 <Class Mp4Extractor$Mp4Track[]>
	//* 188  403:putfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//* 189  406:aload_0         
	//* 190  407:aload_0         
	//* 191  408:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//* 192  411:invokestatic    #375 <Method long[][] calculateAccumulatedSampleSizes(Mp4Extractor$Mp4Track[])>
	//* 193  414:putfield        #156 <Field long[][] accumulatedSampleSizes>
	//* 194  417:aload_0         
	//* 195  418:getfield        #308 <Field ExtractorOutput extractorOutput>
	//* 196  421:invokeinterface #378 <Method void ExtractorOutput.endTracks()>
	//* 197  426:aload_0         
	//* 198  427:getfield        #308 <Field ExtractorOutput extractorOutput>
	//* 199  430:aload_0         
	//* 200  431:invokeinterface #382 <Method void ExtractorOutput.seekMap(SeekMap)>
	//* 201  436:return          
		// Misplaced declaration of an exception variable
		catch(AtomParsers.UnhandledEditListException unhandlededitlistexception)
		{
			gaplessinfoholder = new GaplessInfoHolder();
			arraylist = getTrackSampleTables(containeratom, gaplessinfoholder, true);
		}
		int l = arraylist.size();
		j = -1;
		long l1 = 0x1L;
		while(i < l) 
		{
			TrackSampleTable tracksampletable = (TrackSampleTable)arraylist.get(i);
			Track track = tracksampletable.track;
			Mp4Track mp4track = new Mp4Track(track, tracksampletable, extractorOutput.track(i, track.type));
			int k = tracksampletable.maximumSize;
			Format format = track.format.copyWithMaxInputSize(k + 30);
			Object obj1 = ((Object) (format));
			if(track.type == 1)
			{
				containeratom = ((Atom.ContainerAtom) (format));
				if(gaplessinfoholder.hasGaplessInfo())
					containeratom = ((Atom.ContainerAtom) (format.copyWithGaplessInfo(gaplessinfoholder.encoderDelay, gaplessinfoholder.encoderPadding)));
				obj1 = ((Object) (containeratom));
				if(metadata != null)
					obj1 = ((Object) (((Format) (containeratom)).copyWithMetadata(metadata)));
			}
			mp4track.trackOutput.format(((Format) (obj1)));
			long l2;
			if(track.durationUs != 0x1L)
				l2 = track.durationUs;
			else
				l2 = tracksampletable.durationUs;
			l1 = Math.max(l1, l2);
			if(track.type == 2)
			{
				k = j;
				if(j == -1)
					k = ((List) (arraylist1)).size();
			} else
			{
				k = j;
			}
			((List) (arraylist1)).add(((Object) (mp4track)));
			i++;
			j = k;
		}
		firstVideoTrackIndex = j;
		durationUs = l1;
		tracks = (Mp4Track[])((List) (arraylist1)).toArray(((Object []) (new Mp4Track[((List) (arraylist1)).size()])));
		accumulatedSampleSizes = calculateAccumulatedSampleSizes(tracks);
		extractorOutput.endTracks();
		extractorOutput.seekMap(((SeekMap) (this)));
	//* 202  437:astore          11
	//* 203  439:goto            106
	}

	private boolean readAtomHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(atomHeaderBytesRead == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field int atomHeaderBytesRead>
	//*   2    4:ifne            65
		{
			if(!extractorinput.readFully(atomHeader.data, 0, 8, true))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #89  <Field ParsableByteArray atomHeader>
	//*   6   12:getfield        #391 <Field byte[] ParsableByteArray.data>
	//*   7   15:iconst_0        
	//*   8   16:bipush          8
	//*   9   18:iconst_1        
	//*  10   19:invokeinterface #397 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  11   24:ifne            29
				return false;
	//   12   27:iconst_0        
	//   13   28:ireturn         
			atomHeaderBytesRead = 8;
	//   14   29:aload_0         
	//   15   30:bipush          8
	//   16   32:putfield        #136 <Field int atomHeaderBytesRead>
			atomHeader.setPosition(0);
	//   17   35:aload_0         
	//   18   36:getfield        #89  <Field ParsableByteArray atomHeader>
	//   19   39:iconst_0        
	//   20   40:invokevirtual   #273 <Method void ParsableByteArray.setPosition(int)>
			atomSize = atomHeader.readUnsignedInt();
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #89  <Field ParsableByteArray atomHeader>
	//   24   48:invokevirtual   #401 <Method long ParsableByteArray.readUnsignedInt()>
	//   25   51:putfield        #403 <Field long atomSize>
			atomType = atomHeader.readInt();
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #89  <Field ParsableByteArray atomHeader>
	//   29   59:invokevirtual   #276 <Method int ParsableByteArray.readInt()>
	//   30   62:putfield        #405 <Field int atomType>
		}
		if(atomSize == 1L)
	//*  31   65:aload_0         
	//*  32   66:getfield        #403 <Field long atomSize>
	//*  33   69:lconst_1        
	//*  34   70:lcmp            
	//*  35   71:ifne            116
		{
			extractorinput.readFully(atomHeader.data, 8, 8);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #89  <Field ParsableByteArray atomHeader>
	//   39   79:getfield        #391 <Field byte[] ParsableByteArray.data>
	//   40   82:bipush          8
	//   41   84:bipush          8
	//   42   86:invokeinterface #408 <Method void ExtractorInput.readFully(byte[], int, int)>
			atomHeaderBytesRead = atomHeaderBytesRead + 8;
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:getfield        #136 <Field int atomHeaderBytesRead>
	//   46   96:bipush          8
	//   47   98:iadd            
	//   48   99:putfield        #136 <Field int atomHeaderBytesRead>
			atomSize = atomHeader.readUnsignedLongToLong();
	//   49  102:aload_0         
	//   50  103:aload_0         
	//   51  104:getfield        #89  <Field ParsableByteArray atomHeader>
	//   52  107:invokevirtual   #411 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   53  110:putfield        #403 <Field long atomSize>
		} else
	//*  54  113:goto            198
		if(atomSize == 0L)
	//*  55  116:aload_0         
	//*  56  117:getfield        #403 <Field long atomSize>
	//*  57  120:lconst_0        
	//*  58  121:lcmp            
	//*  59  122:ifne            198
		{
			long l2 = extractorinput.getLength();
	//   60  125:aload_1         
	//   61  126:invokeinterface #414 <Method long ExtractorInput.getLength()>
	//   62  131:lstore          4
			long l = l2;
	//   63  133:lload           4
	//   64  135:lstore_2        
			if(l2 == -1L)
	//*  65  136:lload           4
	//*  66  138:ldc2w           #415 <Long -1L>
	//*  67  141:lcmp            
	//*  68  142:ifne            172
			{
				l = l2;
	//   69  145:lload           4
	//   70  147:lstore_2        
				if(!containerAtoms.isEmpty())
	//*  71  148:aload_0         
	//*  72  149:getfield        #94  <Field ArrayDeque containerAtoms>
	//*  73  152:invokevirtual   #244 <Method boolean ArrayDeque.isEmpty()>
	//*  74  155:ifne            172
					l = ((Atom.ContainerAtom)containerAtoms.peek()).endPosition;
	//   75  158:aload_0         
	//   76  159:getfield        #94  <Field ArrayDeque containerAtoms>
	//   77  162:invokevirtual   #248 <Method Object ArrayDeque.peek()>
	//   78  165:checkcast       #165 <Class Atom$ContainerAtom>
	//   79  168:getfield        #251 <Field long Atom$ContainerAtom.endPosition>
	//   80  171:lstore_2        
			}
			if(l != -1L)
	//*  81  172:lload_2         
	//*  82  173:ldc2w           #415 <Long -1L>
	//*  83  176:lcmp            
	//*  84  177:ifeq            198
				atomSize = (l - extractorinput.getPosition()) + (long)atomHeaderBytesRead;
	//   85  180:aload_0         
	//   86  181:lload_2         
	//   87  182:aload_1         
	//   88  183:invokeinterface #419 <Method long ExtractorInput.getPosition()>
	//   89  188:lsub            
	//   90  189:aload_0         
	//   91  190:getfield        #136 <Field int atomHeaderBytesRead>
	//   92  193:i2l             
	//   93  194:ladd            
	//   94  195:putfield        #403 <Field long atomSize>
		}
		if(atomSize < (long)atomHeaderBytesRead)
	//*  95  198:aload_0         
	//*  96  199:getfield        #403 <Field long atomSize>
	//*  97  202:aload_0         
	//*  98  203:getfield        #136 <Field int atomHeaderBytesRead>
	//*  99  206:i2l             
	//* 100  207:lcmp            
	//* 101  208:ifge            222
			throw new ParserException("Atom size less than header length (unsupported).");
	//  102  211:new             #160 <Class ParserException>
	//  103  214:dup             
	//  104  215:ldc2            #421 <String "Atom size less than header length (unsupported).">
	//  105  218:invokespecial   #424 <Method void ParserException(String)>
	//  106  221:athrow          
		if(shouldParseContainerAtom(atomType))
	//* 107  222:aload_0         
	//* 108  223:getfield        #405 <Field int atomType>
	//* 109  226:invokestatic    #428 <Method boolean shouldParseContainerAtom(int)>
	//* 110  229:ifeq            295
		{
			long l1 = (extractorinput.getPosition() + atomSize) - (long)atomHeaderBytesRead;
	//  111  232:aload_1         
	//  112  233:invokeinterface #419 <Method long ExtractorInput.getPosition()>
	//  113  238:aload_0         
	//  114  239:getfield        #403 <Field long atomSize>
	//  115  242:ladd            
	//  116  243:aload_0         
	//  117  244:getfield        #136 <Field int atomHeaderBytesRead>
	//  118  247:i2l             
	//  119  248:lsub            
	//  120  249:lstore_2        
			containerAtoms.push(((Object) (new Atom.ContainerAtom(atomType, l1))));
	//  121  250:aload_0         
	//  122  251:getfield        #94  <Field ArrayDeque containerAtoms>
	//  123  254:new             #165 <Class Atom$ContainerAtom>
	//  124  257:dup             
	//  125  258:aload_0         
	//  126  259:getfield        #405 <Field int atomType>
	//  127  262:lload_2         
	//  128  263:invokespecial   #431 <Method void Atom$ContainerAtom(int, long)>
	//  129  266:invokevirtual   #435 <Method void ArrayDeque.push(Object)>
			if(atomSize == (long)atomHeaderBytesRead)
	//* 130  269:aload_0         
	//* 131  270:getfield        #403 <Field long atomSize>
	//* 132  273:aload_0         
	//* 133  274:getfield        #136 <Field int atomHeaderBytesRead>
	//* 134  277:i2l             
	//* 135  278:lcmp            
	//* 136  279:ifne            289
			{
				processAtomEnded(l1);
	//  137  282:aload_0         
	//  138  283:lload_2         
	//  139  284:invokespecial   #437 <Method void processAtomEnded(long)>
				return true;
	//  140  287:iconst_1        
	//  141  288:ireturn         
			} else
			{
				enterReadingAtomHeaderState();
	//  142  289:aload_0         
	//  143  290:invokespecial   #268 <Method void enterReadingAtomHeaderState()>
				return true;
	//  144  293:iconst_1        
	//  145  294:ireturn         
			}
		}
		if(shouldParseLeafAtom(atomType))
	//* 146  295:aload_0         
	//* 147  296:getfield        #405 <Field int atomType>
	//* 148  299:invokestatic    #440 <Method boolean shouldParseLeafAtom(int)>
	//* 149  302:ifeq            397
		{
			boolean flag;
			if(atomHeaderBytesRead == 8)
	//* 150  305:aload_0         
	//* 151  306:getfield        #136 <Field int atomHeaderBytesRead>
	//* 152  309:bipush          8
	//* 153  311:icmpne          320
				flag = true;
	//  154  314:iconst_1        
	//  155  315:istore          6
			else
	//* 156  317:goto            323
				flag = false;
	//  157  320:iconst_0        
	//  158  321:istore          6
			Assertions.checkState(flag);
	//  159  323:iload           6
	//  160  325:invokestatic    #446 <Method void Assertions.checkState(boolean)>
			if(atomSize <= 0x7fffffffL)
	//* 161  328:aload_0         
	//* 162  329:getfield        #403 <Field long atomSize>
	//* 163  332:ldc2w           #447 <Long 0x7fffffffL>
	//* 164  335:lcmp            
	//* 165  336:ifgt            345
				flag = true;
	//  166  339:iconst_1        
	//  167  340:istore          6
			else
	//* 168  342:goto            348
				flag = false;
	//  169  345:iconst_0        
	//  170  346:istore          6
			Assertions.checkState(flag);
	//  171  348:iload           6
	//  172  350:invokestatic    #446 <Method void Assertions.checkState(boolean)>
			atomData = new ParsableByteArray((int)atomSize);
	//  173  353:aload_0         
	//  174  354:new             #86  <Class ParsableByteArray>
	//  175  357:dup             
	//  176  358:aload_0         
	//  177  359:getfield        #403 <Field long atomSize>
	//  178  362:l2i             
	//  179  363:invokespecial   #87  <Method void ParsableByteArray(int)>
	//  180  366:putfield        #450 <Field ParsableByteArray atomData>
			System.arraycopy(((Object) (atomHeader.data)), 0, ((Object) (atomData.data)), 0, 8);
	//  181  369:aload_0         
	//  182  370:getfield        #89  <Field ParsableByteArray atomHeader>
	//  183  373:getfield        #391 <Field byte[] ParsableByteArray.data>
	//  184  376:iconst_0        
	//  185  377:aload_0         
	//  186  378:getfield        #450 <Field ParsableByteArray atomData>
	//  187  381:getfield        #391 <Field byte[] ParsableByteArray.data>
	//  188  384:iconst_0        
	//  189  385:bipush          8
	//  190  387:invokestatic    #456 <Method void System.arraycopy(Object, int, Object, int, int)>
			parserState = 1;
	//  191  390:aload_0         
	//  192  391:iconst_1        
	//  193  392:putfield        #134 <Field int parserState>
			return true;
	//  194  395:iconst_1        
	//  195  396:ireturn         
		} else
		{
			atomData = null;
	//  196  397:aload_0         
	//  197  398:aconst_null     
	//  198  399:putfield        #450 <Field ParsableByteArray atomData>
			parserState = 1;
	//  199  402:aload_0         
	//  200  403:iconst_1        
	//  201  404:putfield        #134 <Field int parserState>
			return true;
	//  202  407:iconst_1        
	//  203  408:ireturn         
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
	//    1    1:getfield        #403 <Field long atomSize>
	//    2    4:aload_0         
	//    3    5:getfield        #136 <Field int atomHeaderBytesRead>
	//    4    8:i2l             
	//    5    9:lsub            
	//    6   10:lstore          4
				l1 = extractorinput.getPosition();
	//    7   12:aload_1         
	//    8   13:invokeinterface #419 <Method long ExtractorInput.getPosition()>
	//    9   18:lstore          6
				if(atomData != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #450 <Field ParsableByteArray atomData>
	//*  12   24:ifnull          112
				{
					extractorinput.readFully(atomData.data, atomHeaderBytesRead, (int)l);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #450 <Field ParsableByteArray atomData>
	//   16   32:getfield        #391 <Field byte[] ParsableByteArray.data>
	//   17   35:aload_0         
	//   18   36:getfield        #136 <Field int atomHeaderBytesRead>
	//   19   39:lload           4
	//   20   41:l2i             
	//   21   42:invokeinterface #408 <Method void ExtractorInput.readFully(byte[], int, int)>
					if(atomType == Atom.TYPE_ftyp)
	//*  22   47:aload_0         
	//*  23   48:getfield        #405 <Field int atomType>
	//*  24   51:getstatic       #461 <Field int Atom.TYPE_ftyp>
	//*  25   54:icmpne          71
						isQuickTime = processFtypAtom(atomData);
	//   26   57:aload_0         
	//   27   58:aload_0         
	//   28   59:getfield        #450 <Field ParsableByteArray atomData>
	//   29   62:invokestatic    #463 <Method boolean processFtypAtom(ParsableByteArray)>
	//   30   65:putfield        #198 <Field boolean isQuickTime>
					else
	//*  31   68:goto            130
					if(!containerAtoms.isEmpty())
	//*  32   71:aload_0         
	//*  33   72:getfield        #94  <Field ArrayDeque containerAtoms>
	//*  34   75:invokevirtual   #244 <Method boolean ArrayDeque.isEmpty()>
	//*  35   78:ifne            130
						((Atom.ContainerAtom)containerAtoms.peek()).add(new Atom.LeafAtom(atomType, atomData));
	//   36   81:aload_0         
	//   37   82:getfield        #94  <Field ArrayDeque containerAtoms>
	//   38   85:invokevirtual   #248 <Method Object ArrayDeque.peek()>
	//   39   88:checkcast       #165 <Class Atom$ContainerAtom>
	//   40   91:new             #465 <Class Atom$LeafAtom>
	//   41   94:dup             
	//   42   95:aload_0         
	//   43   96:getfield        #405 <Field int atomType>
	//   44   99:aload_0         
	//   45  100:getfield        #450 <Field ParsableByteArray atomData>
	//   46  103:invokespecial   #468 <Method void Atom$LeafAtom(int, ParsableByteArray)>
	//   47  106:invokevirtual   #471 <Method void Atom$ContainerAtom.add(Atom$LeafAtom)>
				} else
	//*  48  109:goto            130
				{
					if(l >= 0x40000L)
						break label1;
	//   49  112:lload           4
	//   50  114:ldc2w           #28  <Long 0x40000L>
	//   51  117:lcmp            
	//   52  118:ifge            135
					extractorinput.skipFully((int)l);
	//   53  121:aload_1         
	//   54  122:lload           4
	//   55  124:l2i             
	//   56  125:invokeinterface #474 <Method void ExtractorInput.skipFully(int)>
				}
				flag = false;
	//   57  130:iconst_0        
	//   58  131:istore_3        
				break label0;
	//   59  132:goto            150
			}
			positionholder.position = extractorinput.getPosition() + l;
	//   60  135:aload_2         
	//   61  136:aload_1         
	//   62  137:invokeinterface #419 <Method long ExtractorInput.getPosition()>
	//   63  142:lload           4
	//   64  144:ladd            
	//   65  145:putfield        #479 <Field long PositionHolder.position>
			flag = true;
	//   66  148:iconst_1        
	//   67  149:istore_3        
		}
		processAtomEnded(l1 + l);
	//   68  150:aload_0         
	//   69  151:lload           6
	//   70  153:lload           4
	//   71  155:ladd            
	//   72  156:invokespecial   #437 <Method void processAtomEnded(long)>
		return flag && parserState != 2;
	//   73  159:iload_3         
	//   74  160:ifeq            173
	//   75  163:aload_0         
	//   76  164:getfield        #134 <Field int parserState>
	//   77  167:iconst_2        
	//   78  168:icmpeq          173
	//   79  171:iconst_1        
	//   80  172:ireturn         
	//   81  173:iconst_0        
	//   82  174:ireturn         
	}

	private int readSample(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		long l2 = extractorinput.getPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #419 <Method long ExtractorInput.getPosition()>
	//    2    6:lstore          10
		if(sampleTrackIndex == -1)
	//*   3    8:aload_0         
	//*   4    9:getfield        #109 <Field int sampleTrackIndex>
	//*   5   12:iconst_m1       
	//*   6   13:icmpne          36
		{
			sampleTrackIndex = getTrackIndexOfNextReadSample(l2);
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:lload           10
	//   10   20:invokespecial   #483 <Method int getTrackIndexOfNextReadSample(long)>
	//   11   23:putfield        #109 <Field int sampleTrackIndex>
			if(sampleTrackIndex == -1)
	//*  12   26:aload_0         
	//*  13   27:getfield        #109 <Field int sampleTrackIndex>
	//*  14   30:iconst_m1       
	//*  15   31:icmpne          36
				return -1;
	//   16   34:iconst_m1       
	//   17   35:ireturn         
		}
		Mp4Track mp4track = tracks[sampleTrackIndex];
	//   18   36:aload_0         
	//   19   37:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//   20   40:aload_0         
	//   21   41:getfield        #109 <Field int sampleTrackIndex>
	//   22   44:aaload          
	//   23   45:astore          12
		TrackOutput trackoutput = mp4track.trackOutput;
	//   24   47:aload           12
	//   25   49:getfield        #353 <Field TrackOutput Mp4Extractor$Mp4Track.trackOutput>
	//   26   52:astore          13
		int k = mp4track.sampleIndex;
	//   27   54:aload           12
	//   28   56:getfield        #151 <Field int Mp4Extractor$Mp4Track.sampleIndex>
	//   29   59:istore          5
		long l1 = mp4track.sampleTable.offsets[k];
	//   30   61:aload           12
	//   31   63:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   32   66:getfield        #154 <Field long[] TrackSampleTable.offsets>
	//   33   69:iload           5
	//   34   71:laload          
	//   35   72:lstore          8
		int j = mp4track.sampleTable.sizes[k];
	//   36   74:aload           12
	//   37   76:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   38   79:getfield        #131 <Field int[] TrackSampleTable.sizes>
	//   39   82:iload           5
	//   40   84:iaload          
	//   41   85:istore          4
		l2 = (l1 - l2) + (long)sampleBytesWritten;
	//   42   87:lload           8
	//   43   89:lload           10
	//   44   91:lsub            
	//   45   92:aload_0         
	//   46   93:getfield        #485 <Field int sampleBytesWritten>
	//   47   96:i2l             
	//   48   97:ladd            
	//   49   98:lstore          10
		if(l2 >= 0L && l2 < 0x40000L)
	//*  50  100:lload           10
	//*  51  102:lconst_0        
	//*  52  103:lcmp            
	//*  53  104:iflt            461
	//*  54  107:lload           10
	//*  55  109:ldc2w           #28  <Long 0x40000L>
	//*  56  112:lcmp            
	//*  57  113:iflt            119
	//*  58  116:goto            461
		{
			int i = j;
	//   59  119:iload           4
	//   60  121:istore_3        
			l1 = l2;
	//   61  122:lload           10
	//   62  124:lstore          8
			if(mp4track.track.sampleTransformation == 1)
	//*  63  126:aload           12
	//*  64  128:getfield        #486 <Field Track Mp4Extractor$Mp4Track.track>
	//*  65  131:getfield        #489 <Field int Track.sampleTransformation>
	//*  66  134:iconst_1        
	//*  67  135:icmpne          152
			{
				i = j - 8;
	//   68  138:iload           4
	//   69  140:bipush          8
	//   70  142:isub            
	//   71  143:istore_3        
				l1 = l2 + 8L;
	//   72  144:lload           10
	//   73  146:ldc2w           #490 <Long 8L>
	//   74  149:ladd            
	//   75  150:lstore          8
			}
			extractorinput.skipFully((int)l1);
	//   76  152:aload_1         
	//   77  153:lload           8
	//   78  155:l2i             
	//   79  156:invokeinterface #474 <Method void ExtractorInput.skipFully(int)>
			if(mp4track.track.nalUnitLengthFieldLength != 0)
	//*  80  161:aload           12
	//*  81  163:getfield        #486 <Field Track Mp4Extractor$Mp4Track.track>
	//*  82  166:getfield        #494 <Field int Track.nalUnitLengthFieldLength>
	//*  83  169:ifeq            346
			{
				positionholder = ((PositionHolder) (nalLength.data));
	//   84  172:aload_0         
	//   85  173:getfield        #107 <Field ParsableByteArray nalLength>
	//   86  176:getfield        #391 <Field byte[] ParsableByteArray.data>
	//   87  179:astore_2        
				positionholder[0] = 0;
	//   88  180:aload_2         
	//   89  181:iconst_0        
	//   90  182:iconst_0        
	//   91  183:bastore         
				positionholder[1] = 0;
	//   92  184:aload_2         
	//   93  185:iconst_1        
	//   94  186:iconst_0        
	//   95  187:bastore         
				positionholder[2] = 0;
	//   96  188:aload_2         
	//   97  189:iconst_2        
	//   98  190:iconst_0        
	//   99  191:bastore         
				int l = mp4track.track.nalUnitLengthFieldLength;
	//  100  192:aload           12
	//  101  194:getfield        #486 <Field Track Mp4Extractor$Mp4Track.track>
	//  102  197:getfield        #494 <Field int Track.nalUnitLengthFieldLength>
	//  103  200:istore          6
				int i1 = 4 - mp4track.track.nalUnitLengthFieldLength;
	//  104  202:iconst_4        
	//  105  203:aload           12
	//  106  205:getfield        #486 <Field Track Mp4Extractor$Mp4Track.track>
	//  107  208:getfield        #494 <Field int Track.nalUnitLengthFieldLength>
	//  108  211:isub            
	//  109  212:istore          7
				do
				{
					j = i;
	//  110  214:iload_3         
	//  111  215:istore          4
					if(sampleBytesWritten >= i)
						break;
	//  112  217:aload_0         
	//  113  218:getfield        #485 <Field int sampleBytesWritten>
	//  114  221:iload_3         
	//  115  222:icmpge          399
					if(sampleCurrentNalBytesRemaining == 0)
	//* 116  225:aload_0         
	//* 117  226:getfield        #496 <Field int sampleCurrentNalBytesRemaining>
	//* 118  229:ifne            306
					{
						extractorinput.readFully(nalLength.data, i1, l);
	//  119  232:aload_1         
	//  120  233:aload_0         
	//  121  234:getfield        #107 <Field ParsableByteArray nalLength>
	//  122  237:getfield        #391 <Field byte[] ParsableByteArray.data>
	//  123  240:iload           7
	//  124  242:iload           6
	//  125  244:invokeinterface #408 <Method void ExtractorInput.readFully(byte[], int, int)>
						nalLength.setPosition(0);
	//  126  249:aload_0         
	//  127  250:getfield        #107 <Field ParsableByteArray nalLength>
	//  128  253:iconst_0        
	//  129  254:invokevirtual   #273 <Method void ParsableByteArray.setPosition(int)>
						sampleCurrentNalBytesRemaining = nalLength.readUnsignedIntToInt();
	//  130  257:aload_0         
	//  131  258:aload_0         
	//  132  259:getfield        #107 <Field ParsableByteArray nalLength>
	//  133  262:invokevirtual   #499 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  134  265:putfield        #496 <Field int sampleCurrentNalBytesRemaining>
						nalStartCode.setPosition(0);
	//  135  268:aload_0         
	//  136  269:getfield        #105 <Field ParsableByteArray nalStartCode>
	//  137  272:iconst_0        
	//  138  273:invokevirtual   #273 <Method void ParsableByteArray.setPosition(int)>
						trackoutput.sampleData(nalStartCode, 4);
	//  139  276:aload           13
	//  140  278:aload_0         
	//  141  279:getfield        #105 <Field ParsableByteArray nalStartCode>
	//  142  282:iconst_4        
	//  143  283:invokeinterface #503 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + 4;
	//  144  288:aload_0         
	//  145  289:aload_0         
	//  146  290:getfield        #485 <Field int sampleBytesWritten>
	//  147  293:iconst_4        
	//  148  294:iadd            
	//  149  295:putfield        #485 <Field int sampleBytesWritten>
						i += i1;
	//  150  298:iload_3         
	//  151  299:iload           7
	//  152  301:iadd            
	//  153  302:istore_3        
					} else
	//* 154  303:goto            214
					{
						j = trackoutput.sampleData(extractorinput, sampleCurrentNalBytesRemaining, false);
	//  155  306:aload           13
	//  156  308:aload_1         
	//  157  309:aload_0         
	//  158  310:getfield        #496 <Field int sampleCurrentNalBytesRemaining>
	//  159  313:iconst_0        
	//  160  314:invokeinterface #506 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//  161  319:istore          4
						sampleBytesWritten = sampleBytesWritten + j;
	//  162  321:aload_0         
	//  163  322:aload_0         
	//  164  323:getfield        #485 <Field int sampleBytesWritten>
	//  165  326:iload           4
	//  166  328:iadd            
	//  167  329:putfield        #485 <Field int sampleBytesWritten>
						sampleCurrentNalBytesRemaining = sampleCurrentNalBytesRemaining - j;
	//  168  332:aload_0         
	//  169  333:aload_0         
	//  170  334:getfield        #496 <Field int sampleCurrentNalBytesRemaining>
	//  171  337:iload           4
	//  172  339:isub            
	//  173  340:putfield        #496 <Field int sampleCurrentNalBytesRemaining>
					}
				} while(true);
	//  174  343:goto            214
			} else
			{
				do
				{
					j = i;
	//  175  346:iload_3         
	//  176  347:istore          4
					if(sampleBytesWritten >= i)
						break;
	//  177  349:aload_0         
	//  178  350:getfield        #485 <Field int sampleBytesWritten>
	//  179  353:iload_3         
	//  180  354:icmpge          399
					j = trackoutput.sampleData(extractorinput, i - sampleBytesWritten, false);
	//  181  357:aload           13
	//  182  359:aload_1         
	//  183  360:iload_3         
	//  184  361:aload_0         
	//  185  362:getfield        #485 <Field int sampleBytesWritten>
	//  186  365:isub            
	//  187  366:iconst_0        
	//  188  367:invokeinterface #506 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//  189  372:istore          4
					sampleBytesWritten = sampleBytesWritten + j;
	//  190  374:aload_0         
	//  191  375:aload_0         
	//  192  376:getfield        #485 <Field int sampleBytesWritten>
	//  193  379:iload           4
	//  194  381:iadd            
	//  195  382:putfield        #485 <Field int sampleBytesWritten>
					sampleCurrentNalBytesRemaining = sampleCurrentNalBytesRemaining - j;
	//  196  385:aload_0         
	//  197  386:aload_0         
	//  198  387:getfield        #496 <Field int sampleCurrentNalBytesRemaining>
	//  199  390:iload           4
	//  200  392:isub            
	//  201  393:putfield        #496 <Field int sampleCurrentNalBytesRemaining>
				} while(true);
	//  202  396:goto            346
			}
			trackoutput.sampleMetadata(mp4track.sampleTable.timestampsUs[k], mp4track.sampleTable.flags[k], j, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//  203  399:aload           13
	//  204  401:aload           12
	//  205  403:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//  206  406:getfield        #125 <Field long[] TrackSampleTable.timestampsUs>
	//  207  409:iload           5
	//  208  411:laload          
	//  209  412:aload           12
	//  210  414:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//  211  417:getfield        #508 <Field int[] TrackSampleTable.flags>
	//  212  420:iload           5
	//  213  422:iaload          
	//  214  423:iload           4
	//  215  425:iconst_0        
	//  216  426:aconst_null     
	//  217  427:invokeinterface #512 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
			mp4track.sampleIndex = mp4track.sampleIndex + 1;
	//  218  432:aload           12
	//  219  434:aload           12
	//  220  436:getfield        #151 <Field int Mp4Extractor$Mp4Track.sampleIndex>
	//  221  439:iconst_1        
	//  222  440:iadd            
	//  223  441:putfield        #151 <Field int Mp4Extractor$Mp4Track.sampleIndex>
			sampleTrackIndex = -1;
	//  224  444:aload_0         
	//  225  445:iconst_m1       
	//  226  446:putfield        #109 <Field int sampleTrackIndex>
			sampleBytesWritten = 0;
	//  227  449:aload_0         
	//  228  450:iconst_0        
	//  229  451:putfield        #485 <Field int sampleBytesWritten>
			sampleCurrentNalBytesRemaining = 0;
	//  230  454:aload_0         
	//  231  455:iconst_0        
	//  232  456:putfield        #496 <Field int sampleCurrentNalBytesRemaining>
			return 0;
	//  233  459:iconst_0        
	//  234  460:ireturn         
		} else
		{
			positionholder.position = l1;
	//  235  461:aload_2         
	//  236  462:lload           8
	//  237  464:putfield        #479 <Field long PositionHolder.position>
			return 1;
	//  238  467:iconst_1        
	//  239  468:ireturn         
		}
	}

	private static boolean shouldParseContainerAtom(int i)
	{
		return i == Atom.TYPE_moov || i == Atom.TYPE_trak || i == Atom.TYPE_mdia || i == Atom.TYPE_minf || i == Atom.TYPE_stbl || i == Atom.TYPE_edts;
	//    0    0:iload_0         
	//    1    1:getstatic       #257 <Field int Atom.TYPE_moov>
	//    2    4:icmpeq          47
	//    3    7:iload_0         
	//    4    8:getstatic       #187 <Field int Atom.TYPE_trak>
	//    5   11:icmpeq          47
	//    6   14:iload_0         
	//    7   15:getstatic       #207 <Field int Atom.TYPE_mdia>
	//    8   18:icmpeq          47
	//    9   21:iload_0         
	//   10   22:getstatic       #214 <Field int Atom.TYPE_minf>
	//   11   25:icmpeq          47
	//   12   28:iload_0         
	//   13   29:getstatic       #217 <Field int Atom.TYPE_stbl>
	//   14   32:icmpeq          47
	//   15   35:iload_0         
	//   16   36:getstatic       #515 <Field int Atom.TYPE_edts>
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
	//    1    1:getstatic       #518 <Field int Atom.TYPE_mdhd>
	//    2    4:icmpeq          117
	//    3    7:iload_0         
	//    4    8:getstatic       #190 <Field int Atom.TYPE_mvhd>
	//    5   11:icmpeq          117
	//    6   14:iload_0         
	//    7   15:getstatic       #521 <Field int Atom.TYPE_hdlr>
	//    8   18:icmpeq          117
	//    9   21:iload_0         
	//   10   22:getstatic       #524 <Field int Atom.TYPE_stsd>
	//   11   25:icmpeq          117
	//   12   28:iload_0         
	//   13   29:getstatic       #527 <Field int Atom.TYPE_stts>
	//   14   32:icmpeq          117
	//   15   35:iload_0         
	//   16   36:getstatic       #530 <Field int Atom.TYPE_stss>
	//   17   39:icmpeq          117
	//   18   42:iload_0         
	//   19   43:getstatic       #533 <Field int Atom.TYPE_ctts>
	//   20   46:icmpeq          117
	//   21   49:iload_0         
	//   22   50:getstatic       #536 <Field int Atom.TYPE_elst>
	//   23   53:icmpeq          117
	//   24   56:iload_0         
	//   25   57:getstatic       #539 <Field int Atom.TYPE_stsc>
	//   26   60:icmpeq          117
	//   27   63:iload_0         
	//   28   64:getstatic       #542 <Field int Atom.TYPE_stsz>
	//   29   67:icmpeq          117
	//   30   70:iload_0         
	//   31   71:getstatic       #545 <Field int Atom.TYPE_stz2>
	//   32   74:icmpeq          117
	//   33   77:iload_0         
	//   34   78:getstatic       #548 <Field int Atom.TYPE_stco>
	//   35   81:icmpeq          117
	//   36   84:iload_0         
	//   37   85:getstatic       #551 <Field int Atom.TYPE_co64>
	//   38   88:icmpeq          117
	//   39   91:iload_0         
	//   40   92:getstatic       #554 <Field int Atom.TYPE_tkhd>
	//   41   95:icmpeq          117
	//   42   98:iload_0         
	//   43   99:getstatic       #461 <Field int Atom.TYPE_ftyp>
	//   44  102:icmpeq          117
	//   45  105:iload_0         
	//   46  106:getstatic       #290 <Field int Atom.TYPE_udta>
	//   47  109:icmpne          115
	//   48  112:goto            117
	//   49  115:iconst_0        
	//   50  116:ireturn         
	//   51  117:iconst_1        
	//   52  118:ireturn         
	}

	private void updateSampleIndices(long l)
	{
		Mp4Track amp4track[] = tracks;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//    2    4:astore          7
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		for(int i1 = amp4track.length; i < i1; i++)
	//*   5    8:aload           7
	//*   6   10:arraylength     
	//*   7   11:istore          6
	//*   8   13:iload_3         
	//*   9   14:iload           6
	//*  10   16:icmpge          72
		{
			Mp4Track mp4track = amp4track[i];
	//   11   19:aload           7
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:astore          8
			TrackSampleTable tracksampletable = mp4track.sampleTable;
	//   15   25:aload           8
	//   16   27:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   17   30:astore          9
			int k = tracksampletable.getIndexOfEarlierOrEqualSynchronizationSample(l);
	//   18   32:aload           9
	//   19   34:lload_1         
	//   20   35:invokevirtual   #142 <Method int TrackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(long)>
	//   21   38:istore          5
			int j = k;
	//   22   40:iload           5
	//   23   42:istore          4
			if(k == -1)
	//*  24   44:iload           5
	//*  25   46:iconst_m1       
	//*  26   47:icmpne          58
				j = tracksampletable.getIndexOfLaterOrEqualSynchronizationSample(l);
	//   27   50:aload           9
	//   28   52:lload_1         
	//   29   53:invokevirtual   #145 <Method int TrackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(long)>
	//   30   56:istore          4
			mp4track.sampleIndex = j;
	//   31   58:aload           8
	//   32   60:iload           4
	//   33   62:putfield        #151 <Field int Mp4Extractor$Mp4Track.sampleIndex>
		}

	//   34   65:iload_3         
	//   35   66:iconst_1        
	//   36   67:iadd            
	//   37   68:istore_3        
	//*  38   69:goto            13
	//   39   72:return          
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #368 <Field long durationUs>
	//    2    4:lreturn         
	}

	public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
	{
		long l1;
		long l2;
		long l3;
label0:
		{
label1:
			{
				long l4;
label2:
				{
					if(tracks.length == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//*   2    4:arraylength     
	//*   3    5:ifne            19
						return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(SeekPoint.START);
	//    4    8:new             #560 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//    5   11:dup             
	//    6   12:getstatic       #566 <Field SeekPoint SeekPoint.START>
	//    7   15:invokespecial   #569 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//    8   18:areturn         
					if(firstVideoTrackIndex == -1)
						break label1;
	//    9   19:aload_0         
	//   10   20:getfield        #367 <Field int firstVideoTrackIndex>
	//   11   23:iconst_m1       
	//   12   24:icmpeq          164
					TrackSampleTable tracksampletable = tracks[firstVideoTrackIndex].sampleTable;
	//   13   27:aload_0         
	//   14   28:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//   15   31:aload_0         
	//   16   32:getfield        #367 <Field int firstVideoTrackIndex>
	//   17   35:aaload          
	//   18   36:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//   19   39:astore          15
					int i = getSynchronizationSampleIndex(tracksampletable, l);
	//   20   41:aload           15
	//   21   43:lload_1         
	//   22   44:invokestatic    #232 <Method int getSynchronizationSampleIndex(TrackSampleTable, long)>
	//   23   47:istore_3        
					if(i == -1)
	//*  24   48:iload_3         
	//*  25   49:iconst_m1       
	//*  26   50:icmpne          64
						return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(SeekPoint.START);
	//   27   53:new             #560 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   28   56:dup             
	//   29   57:getstatic       #566 <Field SeekPoint SeekPoint.START>
	//   30   60:invokespecial   #569 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   31   63:areturn         
					l3 = tracksampletable.timestampsUs[i];
	//   32   64:aload           15
	//   33   66:getfield        #125 <Field long[] TrackSampleTable.timestampsUs>
	//   34   69:iload_3         
	//   35   70:laload          
	//   36   71:lstore          9
					l4 = tracksampletable.offsets[i];
	//   37   73:aload           15
	//   38   75:getfield        #154 <Field long[] TrackSampleTable.offsets>
	//   39   78:iload_3         
	//   40   79:laload          
	//   41   80:lstore          11
					if(l3 < l && i < tracksampletable.sampleCount - 1)
	//*  42   82:lload           9
	//*  43   84:lload_1         
	//*  44   85:lcmp            
	//*  45   86:ifge            142
	//*  46   89:iload_3         
	//*  47   90:aload           15
	//*  48   92:getfield        #122 <Field int TrackSampleTable.sampleCount>
	//*  49   95:iconst_1        
	//*  50   96:isub            
	//*  51   97:icmpge          142
					{
						int k = tracksampletable.getIndexOfLaterOrEqualSynchronizationSample(l);
	//   52  100:aload           15
	//   53  102:lload_1         
	//   54  103:invokevirtual   #145 <Method int TrackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(long)>
	//   55  106:istore          4
						if(k != -1 && k != i)
	//*  56  108:iload           4
	//*  57  110:iconst_m1       
	//*  58  111:icmpeq          142
	//*  59  114:iload           4
	//*  60  116:iload_3         
	//*  61  117:icmpeq          142
						{
							l = tracksampletable.timestampsUs[k];
	//   62  120:aload           15
	//   63  122:getfield        #125 <Field long[] TrackSampleTable.timestampsUs>
	//   64  125:iload           4
	//   65  127:laload          
	//   66  128:lstore_1        
							l1 = tracksampletable.offsets[k];
	//   67  129:aload           15
	//   68  131:getfield        #154 <Field long[] TrackSampleTable.offsets>
	//   69  134:iload           4
	//   70  136:laload          
	//   71  137:lstore          5
							break label2;
	//   72  139:goto            151
						}
					}
					l1 = -1L;
	//   73  142:ldc2w           #415 <Long -1L>
	//   74  145:lstore          5
					l = 0x1L;
	//   75  147:ldc2w           #195 <Long 0x1L>
	//   76  150:lstore_1        
				}
				l2 = l;
	//   77  151:lload_1         
	//   78  152:lstore          7
				l = l1;
	//   79  154:lload           5
	//   80  156:lstore_1        
				l1 = l4;
	//   81  157:lload           11
	//   82  159:lstore          5
				break label0;
	//   83  161:goto            185
			}
			l1 = 0xffffffffL;
	//   84  164:ldc2w           #126 <Long 0xffffffffL>
	//   85  167:lstore          5
			long l5 = -1L;
	//   86  169:ldc2w           #415 <Long -1L>
	//   87  172:lstore          11
			l2 = 0x1L;
	//   88  174:ldc2w           #195 <Long 0x1L>
	//   89  177:lstore          7
			l3 = l;
	//   90  179:lload_1         
	//   91  180:lstore          9
			l = l5;
	//   92  182:lload           11
	//   93  184:lstore_1        
		}
		for(int j = 0; j < tracks.length;)
	//*  94  185:iconst_0        
	//*  95  186:istore_3        
	//*  96  187:iload_3         
	//*  97  188:aload_0         
	//*  98  189:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//*  99  192:arraylength     
	//* 100  193:icmpge          273
		{
			long l7 = l;
	//  101  196:lload_1         
	//  102  197:lstore          13
			long l6 = l1;
	//  103  199:lload           5
	//  104  201:lstore          11
			if(j != firstVideoTrackIndex)
	//* 105  203:iload_3         
	//* 106  204:aload_0         
	//* 107  205:getfield        #367 <Field int firstVideoTrackIndex>
	//* 108  208:icmpeq          259
			{
				TrackSampleTable tracksampletable1 = tracks[j].sampleTable;
	//  109  211:aload_0         
	//  110  212:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//  111  215:iload_3         
	//  112  216:aaload          
	//  113  217:getfield        #117 <Field TrackSampleTable Mp4Extractor$Mp4Track.sampleTable>
	//  114  220:astore          15
				l6 = maybeAdjustSeekOffset(tracksampletable1, l3, l1);
	//  115  222:aload           15
	//  116  224:lload           9
	//  117  226:lload           5
	//  118  228:invokestatic    #571 <Method long maybeAdjustSeekOffset(TrackSampleTable, long, long)>
	//  119  231:lstore          11
				l1 = l;
	//  120  233:lload_1         
	//  121  234:lstore          5
				if(l2 != 0x1L)
	//* 122  236:lload           7
	//* 123  238:ldc2w           #195 <Long 0x1L>
	//* 124  241:lcmp            
	//* 125  242:ifeq            255
					l1 = maybeAdjustSeekOffset(tracksampletable1, l2, l);
	//  126  245:aload           15
	//  127  247:lload           7
	//  128  249:lload_1         
	//  129  250:invokestatic    #571 <Method long maybeAdjustSeekOffset(TrackSampleTable, long, long)>
	//  130  253:lstore          5
				l7 = l1;
	//  131  255:lload           5
	//  132  257:lstore          13
			}
			j++;
	//  133  259:iload_3         
	//  134  260:iconst_1        
	//  135  261:iadd            
	//  136  262:istore_3        
			l = l7;
	//  137  263:lload           13
	//  138  265:lstore_1        
			l1 = l6;
	//  139  266:lload           11
	//  140  268:lstore          5
		}

	//* 141  270:goto            187
		SeekPoint seekpoint = new SeekPoint(l3, l1);
	//  142  273:new             #562 <Class SeekPoint>
	//  143  276:dup             
	//  144  277:lload           9
	//  145  279:lload           5
	//  146  281:invokespecial   #574 <Method void SeekPoint(long, long)>
	//  147  284:astore          15
		if(l2 == 0x1L)
	//* 148  286:lload           7
	//* 149  288:ldc2w           #195 <Long 0x1L>
	//* 150  291:lcmp            
	//* 151  292:ifne            305
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint);
	//  152  295:new             #560 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//  153  298:dup             
	//  154  299:aload           15
	//  155  301:invokespecial   #569 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//  156  304:areturn         
		else
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(seekpoint, new SeekPoint(l2, l));
	//  157  305:new             #560 <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//  158  308:dup             
	//  159  309:aload           15
	//  160  311:new             #562 <Class SeekPoint>
	//  161  314:dup             
	//  162  315:lload           7
	//  163  317:lload_1         
	//  164  318:invokespecial   #574 <Method void SeekPoint(long, long)>
	//  165  321:invokespecial   #577 <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint, SeekPoint)>
	//  166  324:areturn         
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #308 <Field ExtractorOutput extractorOutput>
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
_L6:
		parserState;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int parserState>
		JVM INSTR tableswitch 0 2: default 32
	//	               0 58
	//	               1 47
	//	               2 40;
	//    2    4:tableswitch     0 2: default 32
	//	               0 58
	//	               1 47
	//	               2 40
		   goto _L1 _L2 _L3 _L4
_L2:
		continue; /* Loop/switch isn't completed */
_L1:
		throw new IllegalStateException();
	//    3   32:new             #583 <Class IllegalStateException>
	//    4   35:dup             
	//    5   36:invokespecial   #584 <Method void IllegalStateException()>
	//    6   39:athrow          
_L4:
		return readSample(extractorinput, positionholder);
	//    7   40:aload_0         
	//    8   41:aload_1         
	//    9   42:aload_2         
	//   10   43:invokespecial   #586 <Method int readSample(ExtractorInput, PositionHolder)>
	//   11   46:ireturn         
_L3:
		if(!readAtomPayload(extractorinput, positionholder)) goto _L6; else goto _L5
	//   12   47:aload_0         
	//   13   48:aload_1         
	//   14   49:aload_2         
	//   15   50:invokespecial   #588 <Method boolean readAtomPayload(ExtractorInput, PositionHolder)>
	//   16   53:ifeq            0
_L5:
		return 1;
	//   17   56:iconst_1        
	//   18   57:ireturn         
		if(readAtomHeader(extractorinput)) goto _L6; else goto _L7
	//   19   58:aload_0         
	//   20   59:aload_1         
	//   21   60:invokespecial   #590 <Method boolean readAtomHeader(ExtractorInput)>
	//   22   63:ifne            0
_L7:
		return -1;
	//   23   66:iconst_m1       
	//   24   67:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		containerAtoms.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ArrayDeque containerAtoms>
	//    2    4:invokevirtual   #264 <Method void ArrayDeque.clear()>
		atomHeaderBytesRead = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #136 <Field int atomHeaderBytesRead>
		sampleTrackIndex = -1;
	//    6   12:aload_0         
	//    7   13:iconst_m1       
	//    8   14:putfield        #109 <Field int sampleTrackIndex>
		sampleBytesWritten = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #485 <Field int sampleBytesWritten>
		sampleCurrentNalBytesRemaining = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #496 <Field int sampleCurrentNalBytesRemaining>
		if(l == 0L)
	//*  15   27:lload_1         
	//*  16   28:lconst_0        
	//*  17   29:lcmp            
	//*  18   30:ifne            38
		{
			enterReadingAtomHeaderState();
	//   19   33:aload_0         
	//   20   34:invokespecial   #268 <Method void enterReadingAtomHeaderState()>
			return;
	//   21   37:return          
		}
		if(tracks != null)
	//*  22   38:aload_0         
	//*  23   39:getfield        #148 <Field Mp4Extractor$Mp4Track[] tracks>
	//*  24   42:ifnull          50
			updateSampleIndices(l1);
	//   25   45:aload_0         
	//   26   46:lload_3         
	//   27   47:invokespecial   #594 <Method void updateSampleIndices(long)>
	//   28   50:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return Sniffer.sniffUnfragmented(extractorinput);
	//    0    0:aload_1         
	//    1    1:invokestatic    #600 <Method boolean Sniffer.sniffUnfragmented(ExtractorInput)>
	//    2    4:ireturn         
	}

	private static final int BRAND_QUICKTIME = Util.getIntegerCodeForString("qt  ");
	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new Mp4Extractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class Mp4Extractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void Mp4Extractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
	private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 0xa00000L;
	private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 0x40000L;
	private static final int STATE_READING_ATOM_HEADER = 0;
	private static final int STATE_READING_ATOM_PAYLOAD = 1;
	private static final int STATE_READING_SAMPLE = 2;
	private long accumulatedSampleSizes[][];
	private ParsableByteArray atomData;
	private final ParsableByteArray atomHeader;
	private int atomHeaderBytesRead;
	private long atomSize;
	private int atomType;
	private final ArrayDeque containerAtoms;
	private long durationUs;
	private ExtractorOutput extractorOutput;
	private int firstVideoTrackIndex;
	private final int flags;
	private boolean isQuickTime;
	private final ParsableByteArray nalLength;
	private final ParsableByteArray nalStartCode;
	private int parserState;
	private int sampleBytesWritten;
	private int sampleCurrentNalBytesRemaining;
	private int sampleTrackIndex;
	private Mp4Track tracks[];

	static 
	{
	//    0    0:new             #10  <Class Mp4Extractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void Mp4Extractor$1()>
	//    3    7:putstatic       #67  <Field ExtractorsFactory FACTORY>
	//    4   10:ldc1            #69  <String "qt  ">
	//    5   12:invokestatic    #75  <Method int Util.getIntegerCodeForString(String)>
	//    6   15:putstatic       #77  <Field int BRAND_QUICKTIME>
	//*   7   18:return          
	}
}
