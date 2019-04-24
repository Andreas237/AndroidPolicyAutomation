// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.Assertions;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			OggSeeker, OggPageHeader, StreamReader

final class DefaultOggSeeker
	implements OggSeeker
{
	private class OggSeekMap
		implements SeekMap
	{

		public long getDurationUs()
		{
			return streamReader.convertGranuleToTime(totalGranules);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DefaultOggSeeker this$0>
		//    2    4:invokestatic    #28  <Method StreamReader DefaultOggSeeker.access$200(DefaultOggSeeker)>
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field DefaultOggSeeker this$0>
		//    5   11:invokestatic    #32  <Method long DefaultOggSeeker.access$400(DefaultOggSeeker)>
		//    6   14:invokevirtual   #38  <Method long StreamReader.convertGranuleToTime(long)>
		//    7   17:lreturn         
		}

		public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
		{
			if(l == 0L)
		//*   0    0:lload_1         
		//*   1    1:lconst_0        
		//*   2    2:lcmp            
		//*   3    3:ifne            29
			{
				return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new SeekPoint(0L, startPosition));
		//    4    6:new             #42  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
		//    5    9:dup             
		//    6   10:new             #44  <Class SeekPoint>
		//    7   13:dup             
		//    8   14:lconst_0        
		//    9   15:aload_0         
		//   10   16:getfield        #15  <Field DefaultOggSeeker this$0>
		//   11   19:invokestatic    #47  <Method long DefaultOggSeeker.access$100(DefaultOggSeeker)>
		//   12   22:invokespecial   #50  <Method void SeekPoint(long, long)>
		//   13   25:invokespecial   #53  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
		//   14   28:areturn         
			} else
			{
				long l1 = streamReader.convertTimeToGranule(l);
		//   15   29:aload_0         
		//   16   30:getfield        #15  <Field DefaultOggSeeker this$0>
		//   17   33:invokestatic    #28  <Method StreamReader DefaultOggSeeker.access$200(DefaultOggSeeker)>
		//   18   36:lload_1         
		//   19   37:invokevirtual   #56  <Method long StreamReader.convertTimeToGranule(long)>
		//   20   40:lstore_3        
				return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new SeekPoint(l, getEstimatedPosition(startPosition, l1, 30000L)));
		//   21   41:new             #42  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
		//   22   44:dup             
		//   23   45:new             #44  <Class SeekPoint>
		//   24   48:dup             
		//   25   49:lload_1         
		//   26   50:aload_0         
		//   27   51:getfield        #15  <Field DefaultOggSeeker this$0>
		//   28   54:aload_0         
		//   29   55:getfield        #15  <Field DefaultOggSeeker this$0>
		//   30   58:invokestatic    #47  <Method long DefaultOggSeeker.access$100(DefaultOggSeeker)>
		//   31   61:lload_3         
		//   32   62:ldc2w           #57  <Long 30000L>
		//   33   65:invokestatic    #62  <Method long DefaultOggSeeker.access$300(DefaultOggSeeker, long, long, long)>
		//   34   68:invokespecial   #50  <Method void SeekPoint(long, long)>
		//   35   71:invokespecial   #53  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
		//   36   74:areturn         
			}
		}

		public boolean isSeekable()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		final DefaultOggSeeker this$0;

		private OggSeekMap()
		{
			this$0 = DefaultOggSeeker.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field DefaultOggSeeker this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public DefaultOggSeeker(long l, long l1, StreamReader streamreader, int i, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #48  <Class OggPageHeader>
	//    4    8:dup             
	//    5    9:invokespecial   #49  <Method void OggPageHeader()>
	//    6   12:putfield        #51  <Field OggPageHeader pageHeader>
		boolean flag;
		if(l >= 0L && l1 > l)
	//*   7   15:lload_1         
	//*   8   16:lconst_0        
	//*   9   17:lcmp            
	//*  10   18:iflt            33
	//*  11   21:lload_3         
	//*  12   22:lload_1         
	//*  13   23:lcmp            
	//*  14   24:ifle            33
			flag = true;
	//   15   27:iconst_1        
	//   16   28:istore          9
		else
	//*  17   30:goto            36
			flag = false;
	//   18   33:iconst_0        
	//   19   34:istore          9
		Assertions.checkArgument(flag);
	//   20   36:iload           9
	//   21   38:invokestatic    #57  <Method void Assertions.checkArgument(boolean)>
		streamReader = streamreader;
	//   22   41:aload_0         
	//   23   42:aload           5
	//   24   44:putfield        #59  <Field StreamReader streamReader>
		startPosition = l;
	//   25   47:aload_0         
	//   26   48:lload_1         
	//   27   49:putfield        #61  <Field long startPosition>
		endPosition = l1;
	//   28   52:aload_0         
	//   29   53:lload_3         
	//   30   54:putfield        #63  <Field long endPosition>
		if((long)i == l1 - l)
	//*  31   57:iload           6
	//*  32   59:i2l             
	//*  33   60:lload_3         
	//*  34   61:lload_1         
	//*  35   62:lsub            
	//*  36   63:lcmp            
	//*  37   64:ifne            79
		{
			totalGranules = l2;
	//   38   67:aload_0         
	//   39   68:lload           7
	//   40   70:putfield        #65  <Field long totalGranules>
			state = 3;
	//   41   73:aload_0         
	//   42   74:iconst_3        
	//   43   75:putfield        #67  <Field int state>
			return;
	//   44   78:return          
		} else
		{
			state = 0;
	//   45   79:aload_0         
	//   46   80:iconst_0        
	//   47   81:putfield        #67  <Field int state>
			return;
	//   48   84:return          
		}
	}

	private long getEstimatedPosition(long l, long l1, long l2)
	{
		l1 = l + ((l1 * (endPosition - startPosition)) / totalGranules - l2);
	//    0    0:lload_1         
	//    1    1:lload_3         
	//    2    2:aload_0         
	//    3    3:getfield        #63  <Field long endPosition>
	//    4    6:aload_0         
	//    5    7:getfield        #61  <Field long startPosition>
	//    6   10:lsub            
	//    7   11:lmul            
	//    8   12:aload_0         
	//    9   13:getfield        #65  <Field long totalGranules>
	//   10   16:ldiv            
	//   11   17:lload           5
	//   12   19:lsub            
	//   13   20:ladd            
	//   14   21:lstore_3        
		l = l1;
	//   15   22:lload_3         
	//   16   23:lstore_1        
		if(l1 < startPosition)
	//*  17   24:lload_3         
	//*  18   25:aload_0         
	//*  19   26:getfield        #61  <Field long startPosition>
	//*  20   29:lcmp            
	//*  21   30:ifge            38
			l = startPosition;
	//   22   33:aload_0         
	//   23   34:getfield        #61  <Field long startPosition>
	//   24   37:lstore_1        
		l1 = l;
	//   25   38:lload_1         
	//   26   39:lstore_3        
		if(l >= endPosition)
	//*  27   40:lload_1         
	//*  28   41:aload_0         
	//*  29   42:getfield        #63  <Field long endPosition>
	//*  30   45:lcmp            
	//*  31   46:iflt            56
			l1 = endPosition - 1L;
	//   32   49:aload_0         
	//   33   50:getfield        #63  <Field long endPosition>
	//   34   53:lconst_1        
	//   35   54:lsub            
	//   36   55:lstore_3        
		return l1;
	//   37   56:lload_3         
	//   38   57:lreturn         
	}

	public volatile SeekMap createSeekMap()
	{
		return ((SeekMap) (createSeekMap()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method DefaultOggSeeker$OggSeekMap createSeekMap()>
	//    2    4:areturn         
	}

	public OggSeekMap createSeekMap()
	{
		long l = totalGranules;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field long totalGranules>
	//    2    4:lstore_1        
		OggSeekMap oggseekmap = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		if(l != 0L)
	//*   5    7:lload_1         
	//*   6    8:lconst_0        
	//*   7    9:lcmp            
	//*   8   10:ifeq            23
			oggseekmap = new OggSeekMap();
	//    9   13:new             #10  <Class DefaultOggSeeker$OggSeekMap>
	//   10   16:dup             
	//   11   17:aload_0         
	//   12   18:aconst_null     
	//   13   19:invokespecial   #87  <Method void DefaultOggSeeker$OggSeekMap(DefaultOggSeeker, DefaultOggSeeker$1)>
	//   14   22:astore_3        
		return oggseekmap;
	//   15   23:aload_3         
	//   16   24:areturn         
	}

	public long getNextSeekPosition(long l, ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		long l2 = start;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field long start>
	//    2    4:lstore          7
		long l3 = end;
	//    3    6:aload_0         
	//    4    7:getfield        #97  <Field long end>
	//    5   10:lstore          9
		long l1 = 2L;
	//    6   12:ldc2w           #98  <Long 2L>
	//    7   15:lstore          5
		if(l2 == l3)
	//*   8   17:lload           7
	//*   9   19:lload           9
	//*  10   21:lcmp            
	//*  11   22:ifne            35
			return -(startGranule + 2L);
	//   12   25:aload_0         
	//   13   26:getfield        #101 <Field long startGranule>
	//   14   29:ldc2w           #98  <Long 2L>
	//   15   32:ladd            
	//   16   33:lneg            
	//   17   34:lreturn         
		l3 = extractorinput.getPosition();
	//   18   35:aload_3         
	//   19   36:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//   20   41:lstore          9
		if(!skipToNextPage(extractorinput, end))
	//*  21   43:aload_0         
	//*  22   44:aload_3         
	//*  23   45:aload_0         
	//*  24   46:getfield        #97  <Field long end>
	//*  25   49:invokevirtual   #111 <Method boolean skipToNextPage(ExtractorInput, long)>
	//*  26   52:ifne            80
			if(start == l3)
	//*  27   55:aload_0         
	//*  28   56:getfield        #95  <Field long start>
	//*  29   59:lload           9
	//*  30   61:lcmp            
	//*  31   62:ifne            75
				throw new IOException("No ogg page can be found.");
	//   32   65:new             #91  <Class IOException>
	//   33   68:dup             
	//   34   69:ldc1            #113 <String "No ogg page can be found.">
	//   35   71:invokespecial   #116 <Method void IOException(String)>
	//   36   74:athrow          
			else
				return start;
	//   37   75:aload_0         
	//   38   76:getfield        #95  <Field long start>
	//   39   79:lreturn         
		pageHeader.populate(extractorinput, false);
	//   40   80:aload_0         
	//   41   81:getfield        #51  <Field OggPageHeader pageHeader>
	//   42   84:aload_3         
	//   43   85:iconst_0        
	//   44   86:invokevirtual   #120 <Method boolean OggPageHeader.populate(ExtractorInput, boolean)>
	//   45   89:pop             
		extractorinput.resetPeekPosition();
	//   46   90:aload_3         
	//   47   91:invokeinterface #123 <Method void ExtractorInput.resetPeekPosition()>
		l2 = l - pageHeader.granulePosition;
	//   48   96:lload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #51  <Field OggPageHeader pageHeader>
	//   51  101:getfield        #126 <Field long OggPageHeader.granulePosition>
	//   52  104:lsub            
	//   53  105:lstore          7
		int i = pageHeader.headerSize + pageHeader.bodySize;
	//   54  107:aload_0         
	//   55  108:getfield        #51  <Field OggPageHeader pageHeader>
	//   56  111:getfield        #129 <Field int OggPageHeader.headerSize>
	//   57  114:aload_0         
	//   58  115:getfield        #51  <Field OggPageHeader pageHeader>
	//   59  118:getfield        #132 <Field int OggPageHeader.bodySize>
	//   60  121:iadd            
	//   61  122:istore          4
		if(l2 >= 0L && l2 <= 0x11940L)
	//*  62  124:lload           7
	//*  63  126:lconst_0        
	//*  64  127:lcmp            
	//*  65  128:iflt            164
	//*  66  131:lload           7
	//*  67  133:ldc2w           #133 <Long 0x11940L>
	//*  68  136:lcmp            
	//*  69  137:ifle            143
	//*  70  140:goto            164
		{
			extractorinput.skipFully(i);
	//   71  143:aload_3         
	//   72  144:iload           4
	//   73  146:invokeinterface #138 <Method void ExtractorInput.skipFully(int)>
			return -(pageHeader.granulePosition + 2L);
	//   74  151:aload_0         
	//   75  152:getfield        #51  <Field OggPageHeader pageHeader>
	//   76  155:getfield        #126 <Field long OggPageHeader.granulePosition>
	//   77  158:ldc2w           #98  <Long 2L>
	//   78  161:ladd            
	//   79  162:lneg            
	//   80  163:lreturn         
		}
		if(l2 < 0L)
	//*  81  164:lload           7
	//*  82  166:lconst_0        
	//*  83  167:lcmp            
	//*  84  168:ifge            191
		{
			end = l3;
	//   85  171:aload_0         
	//   86  172:lload           9
	//   87  174:putfield        #97  <Field long end>
			endGranule = pageHeader.granulePosition;
	//   88  177:aload_0         
	//   89  178:aload_0         
	//   90  179:getfield        #51  <Field OggPageHeader pageHeader>
	//   91  182:getfield        #126 <Field long OggPageHeader.granulePosition>
	//   92  185:putfield        #140 <Field long endGranule>
		} else
	//*  93  188:goto            259
		{
			l = extractorinput.getPosition();
	//   94  191:aload_3         
	//   95  192:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//   96  197:lstore_1        
			l3 = i;
	//   97  198:iload           4
	//   98  200:i2l             
	//   99  201:lstore          9
			start = l + l3;
	//  100  203:aload_0         
	//  101  204:lload_1         
	//  102  205:lload           9
	//  103  207:ladd            
	//  104  208:putfield        #95  <Field long start>
			startGranule = pageHeader.granulePosition;
	//  105  211:aload_0         
	//  106  212:aload_0         
	//  107  213:getfield        #51  <Field OggPageHeader pageHeader>
	//  108  216:getfield        #126 <Field long OggPageHeader.granulePosition>
	//  109  219:putfield        #101 <Field long startGranule>
			if((end - start) + l3 < 0x186a0L)
	//* 110  222:aload_0         
	//* 111  223:getfield        #97  <Field long end>
	//* 112  226:aload_0         
	//* 113  227:getfield        #95  <Field long start>
	//* 114  230:lsub            
	//* 115  231:lload           9
	//* 116  233:ladd            
	//* 117  234:ldc2w           #141 <Long 0x186a0L>
	//* 118  237:lcmp            
	//* 119  238:ifge            259
			{
				extractorinput.skipFully(i);
	//  120  241:aload_3         
	//  121  242:iload           4
	//  122  244:invokeinterface #138 <Method void ExtractorInput.skipFully(int)>
				return -(startGranule + 2L);
	//  123  249:aload_0         
	//  124  250:getfield        #101 <Field long startGranule>
	//  125  253:ldc2w           #98  <Long 2L>
	//  126  256:ladd            
	//  127  257:lneg            
	//  128  258:lreturn         
			}
		}
		if(end - start < 0x186a0L)
	//* 129  259:aload_0         
	//* 130  260:getfield        #97  <Field long end>
	//* 131  263:aload_0         
	//* 132  264:getfield        #95  <Field long start>
	//* 133  267:lsub            
	//* 134  268:ldc2w           #141 <Long 0x186a0L>
	//* 135  271:lcmp            
	//* 136  272:ifge            288
		{
			end = start;
	//  137  275:aload_0         
	//  138  276:aload_0         
	//  139  277:getfield        #95  <Field long start>
	//  140  280:putfield        #97  <Field long end>
			return start;
	//  141  283:aload_0         
	//  142  284:getfield        #95  <Field long start>
	//  143  287:lreturn         
		}
		l3 = i;
	//  144  288:iload           4
	//  145  290:i2l             
	//  146  291:lstore          9
		if(l2 <= 0L)
	//* 147  293:lload           7
	//* 148  295:lconst_0        
	//* 149  296:lcmp            
	//* 150  297:ifgt            306
			l = l1;
	//  151  300:lload           5
	//  152  302:lstore_1        
		else
	//* 153  303:goto            308
			l = 1L;
	//  154  306:lconst_1        
	//  155  307:lstore_1        
		return Math.min(Math.max((extractorinput.getPosition() - l3 * l) + (l2 * (end - start)) / (endGranule - startGranule), start), end - 1L);
	//  156  308:aload_3         
	//  157  309:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//  158  314:lload           9
	//  159  316:lload_1         
	//  160  317:lmul            
	//  161  318:lsub            
	//  162  319:lload           7
	//  163  321:aload_0         
	//  164  322:getfield        #97  <Field long end>
	//  165  325:aload_0         
	//  166  326:getfield        #95  <Field long start>
	//  167  329:lsub            
	//  168  330:lmul            
	//  169  331:aload_0         
	//  170  332:getfield        #140 <Field long endGranule>
	//  171  335:aload_0         
	//  172  336:getfield        #101 <Field long startGranule>
	//  173  339:lsub            
	//  174  340:ldiv            
	//  175  341:ladd            
	//  176  342:aload_0         
	//  177  343:getfield        #95  <Field long start>
	//  178  346:invokestatic    #148 <Method long Math.max(long, long)>
	//  179  349:aload_0         
	//  180  350:getfield        #97  <Field long end>
	//  181  353:lconst_1        
	//  182  354:lsub            
	//  183  355:invokestatic    #151 <Method long Math.min(long, long)>
	//  184  358:lreturn         
	}

	public long read(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		switch(state)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field int state>
		{
	//*   2    4:tableswitch     0 3: default 36
	//	               0 112
	//	               1 147
	//	               2 48
	//	               3 44
		default:
			throw new IllegalStateException();
	//    3   36:new             #156 <Class IllegalStateException>
	//    4   39:dup             
	//    5   40:invokespecial   #157 <Method void IllegalStateException()>
	//    6   43:athrow          

		case 3: // '\003'
			return -1L;
	//    7   44:ldc2w           #158 <Long -1L>
	//    8   47:lreturn         

		case 2: // '\002'
			long l2 = targetGranule;
	//    9   48:aload_0         
	//   10   49:getfield        #161 <Field long targetGranule>
	//   11   52:lstore          4
			long l = 0L;
	//   12   54:lconst_0        
	//   13   55:lstore_2        
			if(l2 != 0L)
	//*  14   56:lload           4
	//*  15   58:lconst_0        
	//*  16   59:lcmp            
	//*  17   60:ifne            66
	//*  18   63:goto            100
			{
				l = getNextSeekPosition(targetGranule, extractorinput);
	//   19   66:aload_0         
	//   20   67:aload_0         
	//   21   68:getfield        #161 <Field long targetGranule>
	//   22   71:aload_1         
	//   23   72:invokevirtual   #163 <Method long getNextSeekPosition(long, ExtractorInput)>
	//   24   75:lstore_2        
				if(l >= 0L)
	//*  25   76:lload_2         
	//*  26   77:lconst_0        
	//*  27   78:lcmp            
	//*  28   79:iflt            84
					return l;
	//   29   82:lload_2         
	//   30   83:lreturn         
				l = skipToPageOfGranule(extractorinput, targetGranule, -(l + 2L));
	//   31   84:aload_0         
	//   32   85:aload_1         
	//   33   86:aload_0         
	//   34   87:getfield        #161 <Field long targetGranule>
	//   35   90:lload_2         
	//   36   91:ldc2w           #98  <Long 2L>
	//   37   94:ladd            
	//   38   95:lneg            
	//   39   96:invokevirtual   #167 <Method long skipToPageOfGranule(ExtractorInput, long, long)>
	//   40   99:lstore_2        
			}
			state = 3;
	//   41  100:aload_0         
	//   42  101:iconst_3        
	//   43  102:putfield        #67  <Field int state>
			return -(l + 2L);
	//   44  105:lload_2         
	//   45  106:ldc2w           #98  <Long 2L>
	//   46  109:ladd            
	//   47  110:lneg            
	//   48  111:lreturn         

		case 0: // '\0'
			positionBeforeSeekToEnd = extractorinput.getPosition();
	//   49  112:aload_0         
	//   50  113:aload_1         
	//   51  114:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//   52  119:putfield        #169 <Field long positionBeforeSeekToEnd>
			state = 1;
	//   53  122:aload_0         
	//   54  123:iconst_1        
	//   55  124:putfield        #67  <Field int state>
			long l1 = endPosition - 65307L;
	//   56  127:aload_0         
	//   57  128:getfield        #63  <Field long endPosition>
	//   58  131:ldc2w           #170 <Long 65307L>
	//   59  134:lsub            
	//   60  135:lstore_2        
			if(l1 > positionBeforeSeekToEnd)
	//*  61  136:lload_2         
	//*  62  137:aload_0         
	//*  63  138:getfield        #169 <Field long positionBeforeSeekToEnd>
	//*  64  141:lcmp            
	//*  65  142:ifle            147
				return l1;
	//   66  145:lload_2         
	//   67  146:lreturn         
			// fall through

		case 1: // '\001'
			totalGranules = readGranuleOfLastPage(extractorinput);
	//   68  147:aload_0         
	//   69  148:aload_0         
	//   70  149:aload_1         
	//   71  150:invokevirtual   #174 <Method long readGranuleOfLastPage(ExtractorInput)>
	//   72  153:putfield        #65  <Field long totalGranules>
			state = 3;
	//   73  156:aload_0         
	//   74  157:iconst_3        
	//   75  158:putfield        #67  <Field int state>
			return positionBeforeSeekToEnd;
	//   76  161:aload_0         
	//   77  162:getfield        #169 <Field long positionBeforeSeekToEnd>
	//   78  165:lreturn         
		}
	}

	long readGranuleOfLastPage(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		skipToNextPage(extractorinput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #177 <Method void skipToNextPage(ExtractorInput)>
		pageHeader.reset();
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field OggPageHeader pageHeader>
	//    5    9:invokevirtual   #180 <Method void OggPageHeader.reset()>
		for(; (pageHeader.type & 4) != 4 && extractorinput.getPosition() < endPosition; extractorinput.skipFully(pageHeader.headerSize + pageHeader.bodySize))
	//*   6   12:aload_0         
	//*   7   13:getfield        #51  <Field OggPageHeader pageHeader>
	//*   8   16:getfield        #183 <Field int OggPageHeader.type>
	//*   9   19:iconst_4        
	//*  10   20:iand            
	//*  11   21:iconst_4        
	//*  12   22:icmpeq          73
	//*  13   25:aload_1         
	//*  14   26:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//*  15   31:aload_0         
	//*  16   32:getfield        #63  <Field long endPosition>
	//*  17   35:lcmp            
	//*  18   36:ifge            73
			pageHeader.populate(extractorinput, false);
	//   19   39:aload_0         
	//   20   40:getfield        #51  <Field OggPageHeader pageHeader>
	//   21   43:aload_1         
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #120 <Method boolean OggPageHeader.populate(ExtractorInput, boolean)>
	//   24   48:pop             

	//   25   49:aload_1         
	//   26   50:aload_0         
	//   27   51:getfield        #51  <Field OggPageHeader pageHeader>
	//   28   54:getfield        #129 <Field int OggPageHeader.headerSize>
	//   29   57:aload_0         
	//   30   58:getfield        #51  <Field OggPageHeader pageHeader>
	//   31   61:getfield        #132 <Field int OggPageHeader.bodySize>
	//   32   64:iadd            
	//   33   65:invokeinterface #138 <Method void ExtractorInput.skipFully(int)>
	//*  34   70:goto            12
		return pageHeader.granulePosition;
	//   35   73:aload_0         
	//   36   74:getfield        #51  <Field OggPageHeader pageHeader>
	//   37   77:getfield        #126 <Field long OggPageHeader.granulePosition>
	//   38   80:lreturn         
	}

	public void resetSeeking()
	{
		start = startPosition;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field long startPosition>
	//    3    5:putfield        #95  <Field long start>
		end = endPosition;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field long endPosition>
	//    7   13:putfield        #97  <Field long end>
		startGranule = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #101 <Field long startGranule>
		endGranule = totalGranules;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #65  <Field long totalGranules>
	//   14   26:putfield        #140 <Field long endGranule>
	//   15   29:return          
	}

	void skipToNextPage(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(!skipToNextPage(extractorinput, endPosition))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_0         
	//*   3    3:getfield        #63  <Field long endPosition>
	//*   4    6:invokevirtual   #111 <Method boolean skipToNextPage(ExtractorInput, long)>
	//*   5    9:ifne            20
			throw new EOFException();
	//    6   12:new             #186 <Class EOFException>
	//    7   15:dup             
	//    8   16:invokespecial   #187 <Method void EOFException()>
	//    9   19:athrow          
		else
			return;
	//   10   20:return          
	}

	boolean skipToNextPage(ExtractorInput extractorinput, long l)
		throws IOException, InterruptedException
	{
		l = Math.min(l + 3L, endPosition);
	//    0    0:lload_2         
	//    1    1:ldc2w           #188 <Long 3L>
	//    2    4:ladd            
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field long endPosition>
	//    5    9:invokestatic    #151 <Method long Math.min(long, long)>
	//    6   12:lstore_2        
		byte abyte0[] = new byte[2048];
	//    7   13:sipush          2048
	//    8   16:newarray        byte[]
	//    9   18:astore          11
		int i = abyte0.length;
	//   10   20:aload           11
	//   11   22:arraylength     
	//   12   23:istore          4
		do
		{
			long l1 = extractorinput.getPosition();
	//   13   25:aload_1         
	//   14   26:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//   15   31:lstore          7
			long l2 = i;
	//   16   33:iload           4
	//   17   35:i2l             
	//   18   36:lstore          9
			int j = 0;
	//   19   38:iconst_0        
	//   20   39:istore          5
			if(l1 + l2 > l)
	//*  21   41:lload           7
	//*  22   43:lload           9
	//*  23   45:ladd            
	//*  24   46:lload_2         
	//*  25   47:lcmp            
	//*  26   48:ifle            74
			{
				int k = (int)(l - extractorinput.getPosition());
	//   27   51:lload_2         
	//   28   52:aload_1         
	//   29   53:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//   30   58:lsub            
	//   31   59:l2i             
	//   32   60:istore          6
				i = k;
	//   33   62:iload           6
	//   34   64:istore          4
				if(k < 4)
	//*  35   66:iload           6
	//*  36   68:iconst_4        
	//*  37   69:icmpge          74
					return false;
	//   38   72:iconst_0        
	//   39   73:ireturn         
			}
			extractorinput.peekFully(abyte0, 0, i, false);
	//   40   74:aload_1         
	//   41   75:aload           11
	//   42   77:iconst_0        
	//   43   78:iload           4
	//   44   80:iconst_0        
	//   45   81:invokeinterface #193 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//   46   86:pop             
			int i1;
			do
			{
				i1 = i - 3;
	//   47   87:iload           4
	//   48   89:iconst_3        
	//   49   90:isub            
	//   50   91:istore          6
				if(j >= i1)
					break;
	//   51   93:iload           5
	//   52   95:iload           6
	//   53   97:icmpge          165
				if(abyte0[j] == 79 && abyte0[j + 1] == 103 && abyte0[j + 2] == 103 && abyte0[j + 3] == 83)
	//*  54  100:aload           11
	//*  55  102:iload           5
	//*  56  104:baload          
	//*  57  105:bipush          79
	//*  58  107:icmpne          156
	//*  59  110:aload           11
	//*  60  112:iload           5
	//*  61  114:iconst_1        
	//*  62  115:iadd            
	//*  63  116:baload          
	//*  64  117:bipush          103
	//*  65  119:icmpne          156
	//*  66  122:aload           11
	//*  67  124:iload           5
	//*  68  126:iconst_2        
	//*  69  127:iadd            
	//*  70  128:baload          
	//*  71  129:bipush          103
	//*  72  131:icmpne          156
	//*  73  134:aload           11
	//*  74  136:iload           5
	//*  75  138:iconst_3        
	//*  76  139:iadd            
	//*  77  140:baload          
	//*  78  141:bipush          83
	//*  79  143:icmpne          156
				{
					extractorinput.skipFully(j);
	//   80  146:aload_1         
	//   81  147:iload           5
	//   82  149:invokeinterface #138 <Method void ExtractorInput.skipFully(int)>
					return true;
	//   83  154:iconst_1        
	//   84  155:ireturn         
				}
				j++;
	//   85  156:iload           5
	//   86  158:iconst_1        
	//   87  159:iadd            
	//   88  160:istore          5
			} while(true);
	//   89  162:goto            87
			extractorinput.skipFully(i1);
	//   90  165:aload_1         
	//   91  166:iload           6
	//   92  168:invokeinterface #138 <Method void ExtractorInput.skipFully(int)>
		} while(true);
	//   93  173:goto            25
	}

	long skipToPageOfGranule(ExtractorInput extractorinput, long l, long l1)
		throws IOException, InterruptedException
	{
		pageHeader.populate(extractorinput, false);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field OggPageHeader pageHeader>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #120 <Method boolean OggPageHeader.populate(ExtractorInput, boolean)>
	//    5    9:pop             
		while(pageHeader.granulePosition < l) 
	//*   6   10:aload_0         
	//*   7   11:getfield        #51  <Field OggPageHeader pageHeader>
	//*   8   14:getfield        #126 <Field long OggPageHeader.granulePosition>
	//*   9   17:lload_2         
	//*  10   18:lcmp            
	//*  11   19:ifge            65
		{
			extractorinput.skipFully(pageHeader.headerSize + pageHeader.bodySize);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #51  <Field OggPageHeader pageHeader>
	//   15   27:getfield        #129 <Field int OggPageHeader.headerSize>
	//   16   30:aload_0         
	//   17   31:getfield        #51  <Field OggPageHeader pageHeader>
	//   18   34:getfield        #132 <Field int OggPageHeader.bodySize>
	//   19   37:iadd            
	//   20   38:invokeinterface #138 <Method void ExtractorInput.skipFully(int)>
			l1 = pageHeader.granulePosition;
	//   21   43:aload_0         
	//   22   44:getfield        #51  <Field OggPageHeader pageHeader>
	//   23   47:getfield        #126 <Field long OggPageHeader.granulePosition>
	//   24   50:lstore          4
			pageHeader.populate(extractorinput, false);
	//   25   52:aload_0         
	//   26   53:getfield        #51  <Field OggPageHeader pageHeader>
	//   27   56:aload_1         
	//   28   57:iconst_0        
	//   29   58:invokevirtual   #120 <Method boolean OggPageHeader.populate(ExtractorInput, boolean)>
	//   30   61:pop             
		}
	//*  31   62:goto            10
		extractorinput.resetPeekPosition();
	//   32   65:aload_1         
	//   33   66:invokeinterface #123 <Method void ExtractorInput.resetPeekPosition()>
		return l1;
	//   34   71:lload           4
	//   35   73:lreturn         
	}

	public long startSeek(long l)
	{
		boolean flag;
		if(state != 3 && state != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field int state>
	//*   2    4:iconst_3        
	//*   3    5:icmpeq          25
	//*   4    8:aload_0         
	//*   5    9:getfield        #67  <Field int state>
	//*   6   12:iconst_2        
	//*   7   13:icmpne          19
	//*   8   16:goto            25
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore          5
		else
	//*  11   22:goto            28
			flag = true;
	//   12   25:iconst_1        
	//   13   26:istore          5
		Assertions.checkArgument(flag);
	//   14   28:iload           5
	//   15   30:invokestatic    #57  <Method void Assertions.checkArgument(boolean)>
		long l1 = 0L;
	//   16   33:lconst_0        
	//   17   34:lstore_3        
		if(l == 0L)
	//*  18   35:lload_1         
	//*  19   36:lconst_0        
	//*  20   37:lcmp            
	//*  21   38:ifne            46
			l = l1;
	//   22   41:lload_3         
	//   23   42:lstore_1        
		else
	//*  24   43:goto            55
			l = streamReader.convertTimeToGranule(l);
	//   25   46:aload_0         
	//   26   47:getfield        #59  <Field StreamReader streamReader>
	//   27   50:lload_1         
	//   28   51:invokevirtual   #200 <Method long StreamReader.convertTimeToGranule(long)>
	//   29   54:lstore_1        
		targetGranule = l;
	//   30   55:aload_0         
	//   31   56:lload_1         
	//   32   57:putfield        #161 <Field long targetGranule>
		state = 2;
	//   33   60:aload_0         
	//   34   61:iconst_2        
	//   35   62:putfield        #67  <Field int state>
		resetSeeking();
	//   36   65:aload_0         
	//   37   66:invokevirtual   #202 <Method void resetSeeking()>
		return targetGranule;
	//   38   69:aload_0         
	//   39   70:getfield        #161 <Field long targetGranule>
	//   40   73:lreturn         
	}

	private static final int DEFAULT_OFFSET = 30000;
	public static final int MATCH_BYTE_RANGE = 0x186a0;
	public static final int MATCH_RANGE = 0x11940;
	private static final int STATE_IDLE = 3;
	private static final int STATE_READ_LAST_PAGE = 1;
	private static final int STATE_SEEK = 2;
	private static final int STATE_SEEK_TO_END = 0;
	private long end;
	private long endGranule;
	private final long endPosition;
	private final OggPageHeader pageHeader = new OggPageHeader();
	private long positionBeforeSeekToEnd;
	private long start;
	private long startGranule;
	private final long startPosition;
	private int state;
	private final StreamReader streamReader;
	private long targetGranule;
	private long totalGranules;


/*
	static long access$100(DefaultOggSeeker defaultoggseeker)
	{
		return defaultoggseeker.startPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field long startPosition>
	//    2    4:lreturn         
	}

*/


/*
	static StreamReader access$200(DefaultOggSeeker defaultoggseeker)
	{
		return defaultoggseeker.streamReader;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field StreamReader streamReader>
	//    2    4:areturn         
	}

*/


/*
	static long access$300(DefaultOggSeeker defaultoggseeker, long l, long l1, long l2)
	{
		return defaultoggseeker.getEstimatedPosition(l, l1, l2);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:lload           5
	//    4    5:invokespecial   #78  <Method long getEstimatedPosition(long, long, long)>
	//    5    8:lreturn         
	}

*/


/*
	static long access$400(DefaultOggSeeker defaultoggseeker)
	{
		return defaultoggseeker.totalGranules;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field long totalGranules>
	//    2    4:lreturn         
	}

*/
}
