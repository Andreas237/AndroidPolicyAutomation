// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.chunk.*;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.MimeTypes;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsExtractorWrapper, HlsChunkSource, Variant, TsChunk

public final class HlsSampleSource
	implements SampleSource, com.google.android.exoplayer.SampleSource.SampleSourceReader, com.google.android.exoplayer.upstream.Loader.Callback
{
	public static interface EventListener
		extends BaseChunkSampleSourceEventListener
	{
	}


	public HlsSampleSource(HlsChunkSource hlschunksource, LoadControl loadcontrol, int i)
	{
		this(hlschunksource, loadcontrol, i, ((Handler) (null)), ((EventListener) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:iconst_0        
	//    7    7:invokespecial   #92  <Method void HlsSampleSource(HlsChunkSource, LoadControl, int, Handler, HlsSampleSource$EventListener, int)>
	//    8   10:return          
	}

	public HlsSampleSource(HlsChunkSource hlschunksource, LoadControl loadcontrol, int i, Handler handler, EventListener eventlistener, int j)
	{
		this(hlschunksource, loadcontrol, i, handler, eventlistener, j, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:iconst_3        
	//    8   11:invokespecial   #96  <Method void HlsSampleSource(HlsChunkSource, LoadControl, int, Handler, HlsSampleSource$EventListener, int, int)>
	//    9   14:return          
	}

	public HlsSampleSource(HlsChunkSource hlschunksource, LoadControl loadcontrol, int i, Handler handler, EventListener eventlistener, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Object()>
		chunkSource = hlschunksource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #101 <Field HlsChunkSource chunkSource>
		loadControl = loadcontrol;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #103 <Field LoadControl loadControl>
		bufferSizeContribution = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #105 <Field int bufferSizeContribution>
		minLoadableRetryCount = k;
	//   11   19:aload_0         
	//   12   20:iload           7
	//   13   22:putfield        #107 <Field int minLoadableRetryCount>
		eventHandler = handler;
	//   14   25:aload_0         
	//   15   26:aload           4
	//   16   28:putfield        #109 <Field Handler eventHandler>
		eventListener = eventlistener;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #111 <Field HlsSampleSource$EventListener eventListener>
		eventSourceId = j;
	//   20   37:aload_0         
	//   21   38:iload           6
	//   22   40:putfield        #113 <Field int eventSourceId>
		pendingResetPositionUs = 0x0L;
	//   23   43:aload_0         
	//   24   44:ldc2w           #29  <Long 0x0L>
	//   25   47:putfield        #115 <Field long pendingResetPositionUs>
		extractors = new LinkedList();
	//   26   50:aload_0         
	//   27   51:new             #117 <Class LinkedList>
	//   28   54:dup             
	//   29   55:invokespecial   #118 <Method void LinkedList()>
	//   30   58:putfield        #120 <Field LinkedList extractors>
		chunkOperationHolder = new ChunkOperationHolder();
	//   31   61:aload_0         
	//   32   62:new             #122 <Class ChunkOperationHolder>
	//   33   65:dup             
	//   34   66:invokespecial   #123 <Method void ChunkOperationHolder()>
	//   35   69:putfield        #125 <Field ChunkOperationHolder chunkOperationHolder>
	//   36   72:return          
	}

	private void buildTracks(HlsExtractorWrapper hlsextractorwrapper)
	{
		int l1 = hlsextractorwrapper.getTrackCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #137 <Method int HlsExtractorWrapper.getTrackCount()>
	//    2    4:istore          8
		int i1 = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          5
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		int j1 = 0;
	//    7   11:iconst_0        
	//    8   12:istore          6
		int i;
		do
		{
			i = 1;
	//    9   14:iconst_1        
	//   10   15:istore_2        
			int k = 1;
	//   11   16:iconst_1        
	//   12   17:istore          4
			if(j >= l1)
				break;
	//   13   19:iload_3         
	//   14   20:iload           8
	//   15   22:icmpge          142
			String s = hlsextractorwrapper.getMediaFormat(j).mimeType;
	//   16   25:aload_1         
	//   17   26:iload_3         
	//   18   27:invokevirtual   #141 <Method MediaFormat HlsExtractorWrapper.getMediaFormat(int)>
	//   19   30:getfield        #147 <Field String MediaFormat.mimeType>
	//   20   33:astore          11
			if(MimeTypes.isVideo(s))
	//*  21   35:aload           11
	//*  22   37:invokestatic    #153 <Method boolean MimeTypes.isVideo(String)>
	//*  23   40:ifeq            48
				i = 3;
	//   24   43:iconst_3        
	//   25   44:istore_2        
			else
	//*  26   45:goto            77
			if(MimeTypes.isAudio(s))
	//*  27   48:aload           11
	//*  28   50:invokestatic    #156 <Method boolean MimeTypes.isAudio(String)>
	//*  29   53:ifeq            61
				i = 2;
	//   30   56:iconst_2        
	//   31   57:istore_2        
			else
	//*  32   58:goto            77
			if(MimeTypes.isText(s))
	//*  33   61:aload           11
	//*  34   63:invokestatic    #159 <Method boolean MimeTypes.isText(String)>
	//*  35   66:ifeq            75
				i = k;
	//   36   69:iload           4
	//   37   71:istore_2        
			else
	//*  38   72:goto            77
				i = 0;
	//   39   75:iconst_0        
	//   40   76:istore_2        
			int k1;
			if(i > j1)
	//*  41   77:iload_2         
	//*  42   78:iload           6
	//*  43   80:icmple          92
			{
				k = j;
	//   44   83:iload_3         
	//   45   84:istore          4
				k1 = i;
	//   46   86:iload_2         
	//   47   87:istore          7
			} else
	//*  48   89:goto            127
			{
				k = i1;
	//   49   92:iload           5
	//   50   94:istore          4
				k1 = j1;
	//   51   96:iload           6
	//   52   98:istore          7
				if(i == j1)
	//*  53  100:iload_2         
	//*  54  101:iload           6
	//*  55  103:icmpne          127
				{
					k = i1;
	//   56  106:iload           5
	//   57  108:istore          4
					k1 = j1;
	//   58  110:iload           6
	//   59  112:istore          7
					if(i1 != -1)
	//*  60  114:iload           5
	//*  61  116:iconst_m1       
	//*  62  117:icmpeq          127
					{
						k = -1;
	//   63  120:iconst_m1       
	//   64  121:istore          4
						k1 = j1;
	//   65  123:iload           6
	//   66  125:istore          7
					}
				}
			}
			j++;
	//   67  127:iload_3         
	//   68  128:iconst_1        
	//   69  129:iadd            
	//   70  130:istore_3        
			i1 = k;
	//   71  131:iload           4
	//   72  133:istore          5
			j1 = k1;
	//   73  135:iload           7
	//   74  137:istore          6
		} while(true);
	//   75  139:goto            14
		j1 = chunkSource.getTrackCount();
	//   76  142:aload_0         
	//   77  143:getfield        #101 <Field HlsChunkSource chunkSource>
	//   78  146:invokevirtual   #162 <Method int HlsChunkSource.getTrackCount()>
	//   79  149:istore          6
		if(i1 == -1)
	//*  80  151:iload           5
	//*  81  153:iconst_m1       
	//*  82  154:icmpeq          160
	//*  83  157:goto            162
			i = 0;
	//   84  160:iconst_0        
	//   85  161:istore_2        
		trackCount = l1;
	//   86  162:aload_0         
	//   87  163:iload           8
	//   88  165:putfield        #164 <Field int trackCount>
		if(i != 0)
	//*  89  168:iload_2         
	//*  90  169:ifeq            185
			trackCount = trackCount + (j1 - 1);
	//   91  172:aload_0         
	//   92  173:aload_0         
	//   93  174:getfield        #164 <Field int trackCount>
	//   94  177:iload           6
	//   95  179:iconst_1        
	//   96  180:isub            
	//   97  181:iadd            
	//   98  182:putfield        #164 <Field int trackCount>
		i = trackCount;
	//   99  185:aload_0         
	//  100  186:getfield        #164 <Field int trackCount>
	//  101  189:istore_2        
		trackFormats = new MediaFormat[i];
	//  102  190:aload_0         
	//  103  191:iload_2         
	//  104  192:anewarray       MediaFormat[]
	//  105  195:putfield        #166 <Field MediaFormat[] trackFormats>
		trackEnabledStates = new boolean[i];
	//  106  198:aload_0         
	//  107  199:iload_2         
	//  108  200:newarray        boolean[]
	//  109  202:putfield        #168 <Field boolean[] trackEnabledStates>
		pendingDiscontinuities = new boolean[i];
	//  110  205:aload_0         
	//  111  206:iload_2         
	//  112  207:newarray        boolean[]
	//  113  209:putfield        #170 <Field boolean[] pendingDiscontinuities>
		downstreamMediaFormats = new MediaFormat[i];
	//  114  212:aload_0         
	//  115  213:iload_2         
	//  116  214:anewarray       MediaFormat[]
	//  117  217:putfield        #172 <Field MediaFormat[] downstreamMediaFormats>
		chunkSourceTrackIndices = new int[i];
	//  118  220:aload_0         
	//  119  221:iload_2         
	//  120  222:newarray        int[]
	//  121  224:putfield        #174 <Field int[] chunkSourceTrackIndices>
		extractorTrackIndices = new int[i];
	//  122  227:aload_0         
	//  123  228:iload_2         
	//  124  229:newarray        int[]
	//  125  231:putfield        #176 <Field int[] extractorTrackIndices>
		extractorTrackEnabledStates = new boolean[l1];
	//  126  234:aload_0         
	//  127  235:iload           8
	//  128  237:newarray        boolean[]
	//  129  239:putfield        #178 <Field boolean[] extractorTrackEnabledStates>
		long l2 = chunkSource.getDurationUs();
	//  130  242:aload_0         
	//  131  243:getfield        #101 <Field HlsChunkSource chunkSource>
	//  132  246:invokevirtual   #182 <Method long HlsChunkSource.getDurationUs()>
	//  133  249:lstore          9
		j = 0;
	//  134  251:iconst_0        
	//  135  252:istore_3        
		i = 0;
	//  136  253:iconst_0        
	//  137  254:istore_2        
label0:
		for(; j < l1; j++)
	//* 138  255:iload_3         
	//* 139  256:iload           8
	//* 140  258:icmpge          462
		{
			MediaFormat mediaformat = hlsextractorwrapper.getMediaFormat(j).copyWithDurationUs(l2);
	//  141  261:aload_1         
	//  142  262:iload_3         
	//  143  263:invokevirtual   #141 <Method MediaFormat HlsExtractorWrapper.getMediaFormat(int)>
	//  144  266:lload           9
	//  145  268:invokevirtual   #186 <Method MediaFormat MediaFormat.copyWithDurationUs(long)>
	//  146  271:astore          13
			String s1;
			if(MimeTypes.isAudio(mediaformat.mimeType))
	//* 147  273:aload           13
	//* 148  275:getfield        #147 <Field String MediaFormat.mimeType>
	//* 149  278:invokestatic    #156 <Method boolean MimeTypes.isAudio(String)>
	//* 150  281:ifeq            296
				s1 = chunkSource.getMuxedAudioLanguage();
	//  151  284:aload_0         
	//  152  285:getfield        #101 <Field HlsChunkSource chunkSource>
	//  153  288:invokevirtual   #190 <Method String HlsChunkSource.getMuxedAudioLanguage()>
	//  154  291:astore          11
			else
	//* 155  293:goto            324
			if("application/eia-608".equals(((Object) (mediaformat.mimeType))))
	//* 156  296:ldc1            #192 <String "application/eia-608">
	//* 157  298:aload           13
	//* 158  300:getfield        #147 <Field String MediaFormat.mimeType>
	//* 159  303:invokevirtual   #198 <Method boolean String.equals(Object)>
	//* 160  306:ifeq            321
				s1 = chunkSource.getMuxedCaptionLanguage();
	//  161  309:aload_0         
	//  162  310:getfield        #101 <Field HlsChunkSource chunkSource>
	//  163  313:invokevirtual   #201 <Method String HlsChunkSource.getMuxedCaptionLanguage()>
	//  164  316:astore          11
			else
	//* 165  318:goto            324
				s1 = null;
	//  166  321:aconst_null     
	//  167  322:astore          11
			if(j == i1)
	//* 168  324:iload_3         
	//* 169  325:iload           5
	//* 170  327:icmpne          424
			{
				int l = 0;
	//  171  330:iconst_0        
	//  172  331:istore          4
				do
				{
					if(l >= j1)
						continue label0;
	//  173  333:iload           4
	//  174  335:iload           6
	//  175  337:icmpge          421
					extractorTrackIndices[i] = j;
	//  176  340:aload_0         
	//  177  341:getfield        #176 <Field int[] extractorTrackIndices>
	//  178  344:iload_2         
	//  179  345:iload_3         
	//  180  346:iastore         
					chunkSourceTrackIndices[i] = l;
	//  181  347:aload_0         
	//  182  348:getfield        #174 <Field int[] chunkSourceTrackIndices>
	//  183  351:iload_2         
	//  184  352:iload           4
	//  185  354:iastore         
					Object obj = ((Object) (chunkSource.getFixedTrackVariant(l)));
	//  186  355:aload_0         
	//  187  356:getfield        #101 <Field HlsChunkSource chunkSource>
	//  188  359:iload           4
	//  189  361:invokevirtual   #205 <Method Variant HlsChunkSource.getFixedTrackVariant(int)>
	//  190  364:astore          12
					MediaFormat amediaformat[] = trackFormats;
	//  191  366:aload_0         
	//  192  367:getfield        #166 <Field MediaFormat[] trackFormats>
	//  193  370:astore          14
					if(obj == null)
	//* 194  372:aload           12
	//* 195  374:ifnonnull       388
						obj = ((Object) (mediaformat.copyAsAdaptive(((String) (null)))));
	//  196  377:aload           13
	//  197  379:aconst_null     
	//  198  380:invokevirtual   #209 <Method MediaFormat MediaFormat.copyAsAdaptive(String)>
	//  199  383:astore          12
					else
	//* 200  385:goto            402
						obj = ((Object) (copyWithFixedTrackInfo(mediaformat, ((Variant) (obj)).format, s1)));
	//  201  388:aload           13
	//  202  390:aload           12
	//  203  392:getfield        #214 <Field Format Variant.format>
	//  204  395:aload           11
	//  205  397:invokestatic    #218 <Method MediaFormat copyWithFixedTrackInfo(MediaFormat, Format, String)>
	//  206  400:astore          12
					amediaformat[i] = ((MediaFormat) (obj));
	//  207  402:aload           14
	//  208  404:iload_2         
	//  209  405:aload           12
	//  210  407:aastore         
					l++;
	//  211  408:iload           4
	//  212  410:iconst_1        
	//  213  411:iadd            
	//  214  412:istore          4
					i++;
	//  215  414:iload_2         
	//  216  415:iconst_1        
	//  217  416:iadd            
	//  218  417:istore_2        
				} while(true);
	//  219  418:goto            333
			}
	//* 220  421:goto            455
			extractorTrackIndices[i] = j;
	//  221  424:aload_0         
	//  222  425:getfield        #176 <Field int[] extractorTrackIndices>
	//  223  428:iload_2         
	//  224  429:iload_3         
	//  225  430:iastore         
			chunkSourceTrackIndices[i] = -1;
	//  226  431:aload_0         
	//  227  432:getfield        #174 <Field int[] chunkSourceTrackIndices>
	//  228  435:iload_2         
	//  229  436:iconst_m1       
	//  230  437:iastore         
			trackFormats[i] = mediaformat.copyWithLanguage(s1);
	//  231  438:aload_0         
	//  232  439:getfield        #166 <Field MediaFormat[] trackFormats>
	//  233  442:iload_2         
	//  234  443:aload           13
	//  235  445:aload           11
	//  236  447:invokevirtual   #221 <Method MediaFormat MediaFormat.copyWithLanguage(String)>
	//  237  450:aastore         
			i++;
	//  238  451:iload_2         
	//  239  452:iconst_1        
	//  240  453:iadd            
	//  241  454:istore_2        
		}

	//  242  455:iload_3         
	//  243  456:iconst_1        
	//  244  457:iadd            
	//  245  458:istore_3        
	//* 246  459:goto            255
	//  247  462:return          
	}

	private void clearCurrentLoadable()
	{
		currentTsLoadable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #224 <Field TsChunk currentTsLoadable>
		currentLoadable = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #226 <Field Chunk currentLoadable>
		currentLoadableException = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #228 <Field IOException currentLoadableException>
		currentLoadableExceptionCount = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #230 <Field int currentLoadableExceptionCount>
	//   12   20:return          
	}

	private void clearState()
	{
		for(int i = 0; i < extractors.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #120 <Field LinkedList extractors>
	//*   5    7:invokevirtual   #234 <Method int LinkedList.size()>
	//*   6   10:icmpge          34
			((HlsExtractorWrapper)extractors.get(i)).clear();
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field LinkedList extractors>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #238 <Method Object LinkedList.get(int)>
	//   11   21:checkcast       #133 <Class HlsExtractorWrapper>
	//   12   24:invokevirtual   #241 <Method void HlsExtractorWrapper.clear()>

	//   13   27:iload_1         
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:istore_1        
	//*  17   31:goto            2
		extractors.clear();
	//   18   34:aload_0         
	//   19   35:getfield        #120 <Field LinkedList extractors>
	//   20   38:invokevirtual   #242 <Method void LinkedList.clear()>
		clearCurrentLoadable();
	//   21   41:aload_0         
	//   22   42:invokespecial   #244 <Method void clearCurrentLoadable()>
		previousTsLoadable = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #246 <Field TsChunk previousTsLoadable>
	//   26   50:return          
	}

	private static MediaFormat copyWithFixedTrackInfo(MediaFormat mediaformat, Format format, String s)
	{
		int i = format.width;
	//    0    0:aload_1         
	//    1    1:getfield        #251 <Field int Format.width>
	//    2    4:istore_3        
		int j = -1;
	//    3    5:iconst_m1       
	//    4    6:istore          4
		if(i == -1)
	//*   5    8:iload_3         
	//*   6    9:iconst_m1       
	//*   7   10:icmpne          18
			i = -1;
	//    8   13:iconst_m1       
	//    9   14:istore_3        
		else
	//*  10   15:goto            23
			i = format.width;
	//   11   18:aload_1         
	//   12   19:getfield        #251 <Field int Format.width>
	//   13   22:istore_3        
		if(format.height != -1)
	//*  14   23:aload_1         
	//*  15   24:getfield        #254 <Field int Format.height>
	//*  16   27:iconst_m1       
	//*  17   28:icmpne          34
	//*  18   31:goto            40
			j = format.height;
	//   19   34:aload_1         
	//   20   35:getfield        #254 <Field int Format.height>
	//   21   38:istore          4
		if(format.language != null)
	//*  22   40:aload_1         
	//*  23   41:getfield        #257 <Field String Format.language>
	//*  24   44:ifnonnull       50
	//*  25   47:goto            55
			s = format.language;
	//   26   50:aload_1         
	//   27   51:getfield        #257 <Field String Format.language>
	//   28   54:astore_2        
		return mediaformat.copyWithFixedTrackInfo(format.id, format.bitrate, i, j, s);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:getfield        #260 <Field String Format.id>
	//   32   60:aload_1         
	//   33   61:getfield        #263 <Field int Format.bitrate>
	//   34   64:iload_3         
	//   35   65:iload           4
	//   36   67:aload_2         
	//   37   68:invokevirtual   #266 <Method MediaFormat MediaFormat.copyWithFixedTrackInfo(String, int, int, int, String)>
	//   38   71:areturn         
	}

	private void discardSamplesForDisabledTracks(HlsExtractorWrapper hlsextractorwrapper, long l)
	{
		if(!hlsextractorwrapper.isPrepared())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #272 <Method boolean HlsExtractorWrapper.isPrepared()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore          4
		do
		{
			boolean aflag[] = extractorTrackEnabledStates;
	//    6   11:aload_0         
	//    7   12:getfield        #178 <Field boolean[] extractorTrackEnabledStates>
	//    8   15:astore          5
			if(i < aflag.length)
	//*   9   17:iload           4
	//*  10   19:aload           5
	//*  11   21:arraylength     
	//*  12   22:icmpge          49
			{
				if(!aflag[i])
	//*  13   25:aload           5
	//*  14   27:iload           4
	//*  15   29:baload          
	//*  16   30:ifne            40
					hlsextractorwrapper.discardUntil(i, l);
	//   17   33:aload_1         
	//   18   34:iload           4
	//   19   36:lload_2         
	//   20   37:invokevirtual   #276 <Method void HlsExtractorWrapper.discardUntil(int, long)>
				i++;
	//   21   40:iload           4
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          4
			} else
	//*  25   46:goto            11
			{
				return;
	//   26   49:return          
			}
		} while(true);
	}

	private HlsExtractorWrapper getCurrentExtractor()
	{
		HlsExtractorWrapper hlsextractorwrapper;
		for(hlsextractorwrapper = (HlsExtractorWrapper)extractors.getFirst(); extractors.size() > 1 && !haveSamplesForEnabledTracks(hlsextractorwrapper); hlsextractorwrapper = (HlsExtractorWrapper)extractors.getFirst())
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field LinkedList extractors>
	//*   2    4:invokevirtual   #282 <Method Object LinkedList.getFirst()>
	//*   3    7:checkcast       #133 <Class HlsExtractorWrapper>
	//*   4   10:astore_1        
	//*   5   11:aload_0         
	//*   6   12:getfield        #120 <Field LinkedList extractors>
	//*   7   15:invokevirtual   #234 <Method int LinkedList.size()>
	//*   8   18:iconst_1        
	//*   9   19:icmple          57
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:invokespecial   #286 <Method boolean haveSamplesForEnabledTracks(HlsExtractorWrapper)>
	//*  13   27:ifne            57
			((HlsExtractorWrapper)extractors.removeFirst()).clear();
	//   14   30:aload_0         
	//   15   31:getfield        #120 <Field LinkedList extractors>
	//   16   34:invokevirtual   #289 <Method Object LinkedList.removeFirst()>
	//   17   37:checkcast       #133 <Class HlsExtractorWrapper>
	//   18   40:invokevirtual   #241 <Method void HlsExtractorWrapper.clear()>

	//   19   43:aload_0         
	//   20   44:getfield        #120 <Field LinkedList extractors>
	//   21   47:invokevirtual   #282 <Method Object LinkedList.getFirst()>
	//   22   50:checkcast       #133 <Class HlsExtractorWrapper>
	//   23   53:astore_1        
	//*  24   54:goto            11
		return hlsextractorwrapper;
	//   25   57:aload_1         
	//   26   58:areturn         
	}

	private long getNextLoadPositionUs()
	{
		if(isPendingReset())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #293 <Method boolean isPendingReset()>
	//*   2    4:ifeq            12
			return pendingResetPositionUs;
	//    3    7:aload_0         
	//    4    8:getfield        #115 <Field long pendingResetPositionUs>
	//    5   11:lreturn         
		if(!loadingFinished && (!prepared || enabledTrackCount != 0))
	//*   6   12:aload_0         
	//*   7   13:getfield        #295 <Field boolean loadingFinished>
	//*   8   16:ifne            58
	//*   9   19:aload_0         
	//*  10   20:getfield        #297 <Field boolean prepared>
	//*  11   23:ifeq            36
	//*  12   26:aload_0         
	//*  13   27:getfield        #299 <Field int enabledTrackCount>
	//*  14   30:ifne            36
	//*  15   33:goto            58
		{
			TsChunk tschunk = currentTsLoadable;
	//   16   36:aload_0         
	//   17   37:getfield        #224 <Field TsChunk currentTsLoadable>
	//   18   40:astore_1        
			if(tschunk == null)
	//*  19   41:aload_1         
	//*  20   42:ifnull          48
	//*  21   45:goto            53
				tschunk = previousTsLoadable;
	//   22   48:aload_0         
	//   23   49:getfield        #246 <Field TsChunk previousTsLoadable>
	//   24   52:astore_1        
			return tschunk.endTimeUs;
	//   25   53:aload_1         
	//   26   54:getfield        #304 <Field long TsChunk.endTimeUs>
	//   27   57:lreturn         
		} else
		{
			return -1L;
	//   28   58:ldc2w           #305 <Long -1L>
	//   29   61:lreturn         
		}
	}

	private long getRetryDelayMillis(long l)
	{
		return Math.min((l - 1L) * 1000L, 5000L);
	//    0    0:lload_1         
	//    1    1:lconst_1        
	//    2    2:lsub            
	//    3    3:ldc2w           #309 <Long 1000L>
	//    4    6:lmul            
	//    5    7:ldc2w           #311 <Long 5000L>
	//    6   10:invokestatic    #318 <Method long Math.min(long, long)>
	//    7   13:lreturn         
	}

	private boolean haveSamplesForEnabledTracks(HlsExtractorWrapper hlsextractorwrapper)
	{
		if(!hlsextractorwrapper.isPrepared())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #272 <Method boolean HlsExtractorWrapper.isPrepared()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		do
		{
			boolean aflag[] = extractorTrackEnabledStates;
	//    7   11:aload_0         
	//    8   12:getfield        #178 <Field boolean[] extractorTrackEnabledStates>
	//    9   15:astore_3        
			if(i < aflag.length)
	//*  10   16:iload_2         
	//*  11   17:aload_3         
	//*  12   18:arraylength     
	//*  13   19:icmpge          45
			{
				if(aflag[i] && hlsextractorwrapper.hasSamples(i))
	//*  14   22:aload_3         
	//*  15   23:iload_2         
	//*  16   24:baload          
	//*  17   25:ifeq            38
	//*  18   28:aload_1         
	//*  19   29:iload_2         
	//*  20   30:invokevirtual   #322 <Method boolean HlsExtractorWrapper.hasSamples(int)>
	//*  21   33:ifeq            38
					return true;
	//   22   36:iconst_1        
	//   23   37:ireturn         
				i++;
	//   24   38:iload_2         
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore_2        
			} else
	//*  28   42:goto            11
			{
				return false;
	//   29   45:iconst_0        
	//   30   46:ireturn         
			}
		} while(true);
	}

	private boolean isPendingReset()
	{
		return pendingResetPositionUs != 0x0L;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field long pendingResetPositionUs>
	//    2    4:ldc2w           #29  <Long 0x0L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private boolean isTsChunk(Chunk chunk)
	{
		return chunk instanceof TsChunk;
	//    0    0:aload_1         
	//    1    1:instanceof      #301 <Class TsChunk>
	//    2    4:ireturn         
	}

	private void maybeStartLoading()
	{
		long l2 = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #330 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore          4
		long l = getNextLoadPositionUs();
	//    2    5:aload_0         
	//    3    6:invokespecial   #332 <Method long getNextLoadPositionUs()>
	//    4    9:lstore_2        
		boolean flag;
		if(currentLoadableException != null)
	//*   5   10:aload_0         
	//*   6   11:getfield        #228 <Field IOException currentLoadableException>
	//*   7   14:ifnull          22
			flag = true;
	//    8   17:iconst_1        
	//    9   18:istore_1        
		else
	//*  10   19:goto            24
			flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		boolean flag1;
		if(!loader.isLoading() && !flag)
	//*  13   24:aload_0         
	//*  14   25:getfield        #334 <Field Loader loader>
	//*  15   28:invokevirtual   #339 <Method boolean Loader.isLoading()>
	//*  16   31:ifne            47
	//*  17   34:iload_1         
	//*  18   35:ifeq            41
	//*  19   38:goto            47
			flag1 = false;
	//   20   41:iconst_0        
	//   21   42:istore          6
		else
	//*  22   44:goto            50
			flag1 = true;
	//   23   47:iconst_1        
	//   24   48:istore          6
		flag1 = loadControl.update(((Object) (this)), downstreamPositionUs, l, flag1);
	//   25   50:aload_0         
	//   26   51:getfield        #103 <Field LoadControl loadControl>
	//   27   54:aload_0         
	//   28   55:aload_0         
	//   29   56:getfield        #341 <Field long downstreamPositionUs>
	//   30   59:lload_2         
	//   31   60:iload           6
	//   32   62:invokeinterface #347 <Method boolean LoadControl.update(Object, long, long, boolean)>
	//   33   67:istore          6
		if(flag)
	//*  34   69:iload_1         
	//*  35   70:ifeq            111
		{
			if(l2 - currentLoadableExceptionTimestamp >= getRetryDelayMillis(currentLoadableExceptionCount))
	//*  36   73:lload           4
	//*  37   75:aload_0         
	//*  38   76:getfield        #349 <Field long currentLoadableExceptionTimestamp>
	//*  39   79:lsub            
	//*  40   80:aload_0         
	//*  41   81:aload_0         
	//*  42   82:getfield        #230 <Field int currentLoadableExceptionCount>
	//*  43   85:i2l             
	//*  44   86:invokespecial   #351 <Method long getRetryDelayMillis(long)>
	//*  45   89:lcmp            
	//*  46   90:iflt            110
			{
				currentLoadableException = null;
	//   47   93:aload_0         
	//   48   94:aconst_null     
	//   49   95:putfield        #228 <Field IOException currentLoadableException>
				loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (currentLoadable)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   50   98:aload_0         
	//   51   99:getfield        #334 <Field Loader loader>
	//   52  102:aload_0         
	//   53  103:getfield        #226 <Field Chunk currentLoadable>
	//   54  106:aload_0         
	//   55  107:invokevirtual   #355 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
			}
			return;
	//   56  110:return          
		}
		if(!loader.isLoading() && flag1)
	//*  57  111:aload_0         
	//*  58  112:getfield        #334 <Field Loader loader>
	//*  59  115:invokevirtual   #339 <Method boolean Loader.isLoading()>
	//*  60  118:ifne            445
	//*  61  121:iload           6
	//*  62  123:ifeq            445
		{
			if(prepared && enabledTrackCount == 0)
	//*  63  126:aload_0         
	//*  64  127:getfield        #297 <Field boolean prepared>
	//*  65  130:ifeq            141
	//*  66  133:aload_0         
	//*  67  134:getfield        #299 <Field int enabledTrackCount>
	//*  68  137:ifne            141
				return;
	//   69  140:return          
			Object obj = ((Object) (chunkSource));
	//   70  141:aload_0         
	//   71  142:getfield        #101 <Field HlsChunkSource chunkSource>
	//   72  145:astore          7
			TsChunk tschunk1 = previousTsLoadable;
	//   73  147:aload_0         
	//   74  148:getfield        #246 <Field TsChunk previousTsLoadable>
	//   75  151:astore          8
			long l1 = pendingResetPositionUs;
	//   76  153:aload_0         
	//   77  154:getfield        #115 <Field long pendingResetPositionUs>
	//   78  157:lstore_2        
			if(l1 == 0x0L)
	//*  79  158:lload_2         
	//*  80  159:ldc2w           #29  <Long 0x0L>
	//*  81  162:lcmp            
	//*  82  163:ifeq            169
	//*  83  166:goto            174
				l1 = downstreamPositionUs;
	//   84  169:aload_0         
	//   85  170:getfield        #341 <Field long downstreamPositionUs>
	//   86  173:lstore_2        
			((HlsChunkSource) (obj)).getChunkOperation(tschunk1, l1, chunkOperationHolder);
	//   87  174:aload           7
	//   88  176:aload           8
	//   89  178:lload_2         
	//   90  179:aload_0         
	//   91  180:getfield        #125 <Field ChunkOperationHolder chunkOperationHolder>
	//   92  183:invokevirtual   #359 <Method void HlsChunkSource.getChunkOperation(TsChunk, long, ChunkOperationHolder)>
			boolean flag2 = chunkOperationHolder.endOfStream;
	//   93  186:aload_0         
	//   94  187:getfield        #125 <Field ChunkOperationHolder chunkOperationHolder>
	//   95  190:getfield        #362 <Field boolean ChunkOperationHolder.endOfStream>
	//   96  193:istore          6
			obj = ((Object) (chunkOperationHolder.chunk));
	//   97  195:aload_0         
	//   98  196:getfield        #125 <Field ChunkOperationHolder chunkOperationHolder>
	//   99  199:getfield        #365 <Field Chunk ChunkOperationHolder.chunk>
	//  100  202:astore          7
			chunkOperationHolder.clear();
	//  101  204:aload_0         
	//  102  205:getfield        #125 <Field ChunkOperationHolder chunkOperationHolder>
	//  103  208:invokevirtual   #366 <Method void ChunkOperationHolder.clear()>
			if(flag2)
	//* 104  211:iload           6
	//* 105  213:ifeq            241
			{
				loadingFinished = true;
	//  106  216:aload_0         
	//  107  217:iconst_1        
	//  108  218:putfield        #295 <Field boolean loadingFinished>
				loadControl.update(((Object) (this)), downstreamPositionUs, -1L, false);
	//  109  221:aload_0         
	//  110  222:getfield        #103 <Field LoadControl loadControl>
	//  111  225:aload_0         
	//  112  226:aload_0         
	//  113  227:getfield        #341 <Field long downstreamPositionUs>
	//  114  230:ldc2w           #305 <Long -1L>
	//  115  233:iconst_0        
	//  116  234:invokeinterface #347 <Method boolean LoadControl.update(Object, long, long, boolean)>
	//  117  239:pop             
				return;
	//  118  240:return          
			}
			if(obj == null)
	//* 119  241:aload           7
	//* 120  243:ifnonnull       247
				return;
	//  121  246:return          
			currentLoadStartTimeMs = l2;
	//  122  247:aload_0         
	//  123  248:lload           4
	//  124  250:putfield        #368 <Field long currentLoadStartTimeMs>
			currentLoadable = ((Chunk) (obj));
	//  125  253:aload_0         
	//  126  254:aload           7
	//  127  256:putfield        #226 <Field Chunk currentLoadable>
			if(isTsChunk(currentLoadable))
	//* 128  259:aload_0         
	//* 129  260:aload_0         
	//* 130  261:getfield        #226 <Field Chunk currentLoadable>
	//* 131  264:invokespecial   #370 <Method boolean isTsChunk(Chunk)>
	//* 132  267:ifeq            391
			{
				TsChunk tschunk = (TsChunk)currentLoadable;
	//  133  270:aload_0         
	//  134  271:getfield        #226 <Field Chunk currentLoadable>
	//  135  274:checkcast       #301 <Class TsChunk>
	//  136  277:astore          7
				if(isPendingReset())
	//* 137  279:aload_0         
	//* 138  280:invokespecial   #293 <Method boolean isPendingReset()>
	//* 139  283:ifeq            293
					pendingResetPositionUs = 0x0L;
	//  140  286:aload_0         
	//  141  287:ldc2w           #29  <Long 0x0L>
	//  142  290:putfield        #115 <Field long pendingResetPositionUs>
				HlsExtractorWrapper hlsextractorwrapper = tschunk.extractorWrapper;
	//  143  293:aload           7
	//  144  295:getfield        #374 <Field HlsExtractorWrapper TsChunk.extractorWrapper>
	//  145  298:astore          8
				if(extractors.isEmpty() || extractors.getLast() != hlsextractorwrapper)
	//* 146  300:aload_0         
	//* 147  301:getfield        #120 <Field LinkedList extractors>
	//* 148  304:invokevirtual   #377 <Method boolean LinkedList.isEmpty()>
	//* 149  307:ifne            322
	//* 150  310:aload_0         
	//* 151  311:getfield        #120 <Field LinkedList extractors>
	//* 152  314:invokevirtual   #380 <Method Object LinkedList.getLast()>
	//* 153  317:aload           8
	//* 154  319:if_acmpeq       345
				{
					hlsextractorwrapper.init(loadControl.getAllocator());
	//  155  322:aload           8
	//  156  324:aload_0         
	//  157  325:getfield        #103 <Field LoadControl loadControl>
	//  158  328:invokeinterface #384 <Method com.google.android.exoplayer.upstream.Allocator LoadControl.getAllocator()>
	//  159  333:invokevirtual   #388 <Method void HlsExtractorWrapper.init(com.google.android.exoplayer.upstream.Allocator)>
					extractors.addLast(((Object) (hlsextractorwrapper)));
	//  160  336:aload_0         
	//  161  337:getfield        #120 <Field LinkedList extractors>
	//  162  340:aload           8
	//  163  342:invokevirtual   #392 <Method void LinkedList.addLast(Object)>
				}
				notifyLoadStarted(tschunk.dataSpec.length, tschunk.type, tschunk.trigger, tschunk.format, tschunk.startTimeUs, tschunk.endTimeUs);
	//  164  345:aload_0         
	//  165  346:aload           7
	//  166  348:getfield        #396 <Field DataSpec TsChunk.dataSpec>
	//  167  351:getfield        #401 <Field long DataSpec.length>
	//  168  354:aload           7
	//  169  356:getfield        #404 <Field int TsChunk.type>
	//  170  359:aload           7
	//  171  361:getfield        #407 <Field int TsChunk.trigger>
	//  172  364:aload           7
	//  173  366:getfield        #408 <Field Format TsChunk.format>
	//  174  369:aload           7
	//  175  371:getfield        #411 <Field long TsChunk.startTimeUs>
	//  176  374:aload           7
	//  177  376:getfield        #304 <Field long TsChunk.endTimeUs>
	//  178  379:invokespecial   #415 <Method void notifyLoadStarted(long, int, int, Format, long, long)>
				currentTsLoadable = tschunk;
	//  179  382:aload_0         
	//  180  383:aload           7
	//  181  385:putfield        #224 <Field TsChunk currentTsLoadable>
			} else
	//* 182  388:goto            432
			{
				notifyLoadStarted(currentLoadable.dataSpec.length, currentLoadable.type, currentLoadable.trigger, currentLoadable.format, -1L, -1L);
	//  183  391:aload_0         
	//  184  392:aload_0         
	//  185  393:getfield        #226 <Field Chunk currentLoadable>
	//  186  396:getfield        #418 <Field DataSpec Chunk.dataSpec>
	//  187  399:getfield        #401 <Field long DataSpec.length>
	//  188  402:aload_0         
	//  189  403:getfield        #226 <Field Chunk currentLoadable>
	//  190  406:getfield        #419 <Field int Chunk.type>
	//  191  409:aload_0         
	//  192  410:getfield        #226 <Field Chunk currentLoadable>
	//  193  413:getfield        #420 <Field int Chunk.trigger>
	//  194  416:aload_0         
	//  195  417:getfield        #226 <Field Chunk currentLoadable>
	//  196  420:getfield        #421 <Field Format Chunk.format>
	//  197  423:ldc2w           #305 <Long -1L>
	//  198  426:ldc2w           #305 <Long -1L>
	//  199  429:invokespecial   #415 <Method void notifyLoadStarted(long, int, int, Format, long, long)>
			}
			loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (currentLoadable)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//  200  432:aload_0         
	//  201  433:getfield        #334 <Field Loader loader>
	//  202  436:aload_0         
	//  203  437:getfield        #226 <Field Chunk currentLoadable>
	//  204  440:aload_0         
	//  205  441:invokevirtual   #355 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
			return;
	//  206  444:return          
		} else
		{
			return;
	//  207  445:return          
		}
	}

	private void notifyDownstreamFormatChanged(final Format format, final int trigger, final long positionUs)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Handler eventHandler>
	//    2    4:astore          5
		if(handler != null && eventListener != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          35
	//*   5   11:aload_0         
	//*   6   12:getfield        #111 <Field HlsSampleSource$EventListener eventListener>
	//*   7   15:ifnull          35
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onDownstreamFormatChanged(eventSourceId, format, trigger, usToMs(positionUs));
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field HlsSampleSource this$0>
				//    2    4:invokestatic    #38  <Method HlsSampleSource$EventListener HlsSampleSource.access$100(HlsSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field HlsSampleSource this$0>
				//    5   11:invokestatic    #42  <Method int HlsSampleSource.access$000(HlsSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #25  <Field Format val$format>
				//    8   18:aload_0         
				//    9   19:getfield        #27  <Field int val$trigger>
				//   10   22:aload_0         
				//   11   23:getfield        #23  <Field HlsSampleSource this$0>
				//   12   26:aload_0         
				//   13   27:getfield        #29  <Field long val$positionUs>
				//   14   30:invokevirtual   #46  <Method long HlsSampleSource.usToMs(long)>
				//   15   33:invokeinterface #52  <Method void HlsSampleSource$EventListener.onDownstreamFormatChanged(int, Format, int, long)>
				//   16   38:return          
				}

				final HlsSampleSource this$0;
				final Format val$format;
				final long val$positionUs;
				final int val$trigger;

			
			{
				this$0 = HlsSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field HlsSampleSource this$0>
				format = format1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Format val$format>
				trigger = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$trigger>
				positionUs = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #29  <Field long val$positionUs>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    8   18:aload           5
	//    9   20:new             #20  <Class HlsSampleSource$5>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:iload_2         
	//   14   27:lload_3         
	//   15   28:invokespecial   #426 <Method void HlsSampleSource$5(HlsSampleSource, Format, int, long)>
	//   16   31:invokevirtual   #432 <Method boolean Handler.post(Runnable)>
	//   17   34:pop             
	//   18   35:return          
	}

	private void notifyLoadCanceled(final long bytesLoaded)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Handler eventHandler>
	//    2    4:astore_3        
		if(handler != null && eventListener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #111 <Field HlsSampleSource$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadCanceled(eventSourceId, bytesLoaded);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field HlsSampleSource this$0>
				//    2    4:invokestatic    #30  <Method HlsSampleSource$EventListener HlsSampleSource.access$100(HlsSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field HlsSampleSource this$0>
				//    5   11:invokestatic    #34  <Method int HlsSampleSource.access$000(HlsSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field long val$bytesLoaded>
				//    8   18:invokeinterface #40  <Method void HlsSampleSource$EventListener.onLoadCanceled(int, long)>
				//    9   23:return          
				}

				final HlsSampleSource this$0;
				final long val$bytesLoaded;

			
			{
				this$0 = HlsSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field HlsSampleSource this$0>
				bytesLoaded = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #21  <Field long val$bytesLoaded>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_3         
	//    9   17:new             #16  <Class HlsSampleSource$3>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:lload_1         
	//   13   23:invokespecial   #437 <Method void HlsSampleSource$3(HlsSampleSource, long)>
	//   14   26:invokevirtual   #432 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void notifyLoadCompleted(final long bytesLoaded, final int type, final int trigger, final Format format, final long mediaStartTimeUs, 
			final long mediaEndTimeUs, final long elapsedRealtimeMs, final long loadDurationMs)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Handler eventHandler>
	//    2    4:astore          14
		if(handler != null && eventListener != null)
	//*   3    6:aload           14
	//*   4    8:ifnull          46
	//*   5   11:aload_0         
	//*   6   12:getfield        #111 <Field HlsSampleSource$EventListener eventListener>
	//*   7   15:ifnull          46
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadCompleted(eventSourceId, bytesLoaded, type, trigger, format, usToMs(mediaStartTimeUs), usToMs(mediaEndTimeUs), elapsedRealtimeMs, loadDurationMs);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field HlsSampleSource this$0>
				//    2    4:invokestatic    #53  <Method HlsSampleSource$EventListener HlsSampleSource.access$100(HlsSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #28  <Field HlsSampleSource this$0>
				//    5   11:invokestatic    #57  <Method int HlsSampleSource.access$000(HlsSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #30  <Field long val$bytesLoaded>
				//    8   18:aload_0         
				//    9   19:getfield        #32  <Field int val$type>
				//   10   22:aload_0         
				//   11   23:getfield        #34  <Field int val$trigger>
				//   12   26:aload_0         
				//   13   27:getfield        #36  <Field Format val$format>
				//   14   30:aload_0         
				//   15   31:getfield        #28  <Field HlsSampleSource this$0>
				//   16   34:aload_0         
				//   17   35:getfield        #38  <Field long val$mediaStartTimeUs>
				//   18   38:invokevirtual   #61  <Method long HlsSampleSource.usToMs(long)>
				//   19   41:aload_0         
				//   20   42:getfield        #28  <Field HlsSampleSource this$0>
				//   21   45:aload_0         
				//   22   46:getfield        #40  <Field long val$mediaEndTimeUs>
				//   23   49:invokevirtual   #61  <Method long HlsSampleSource.usToMs(long)>
				//   24   52:aload_0         
				//   25   53:getfield        #42  <Field long val$elapsedRealtimeMs>
				//   26   56:aload_0         
				//   27   57:getfield        #44  <Field long val$loadDurationMs>
				//   28   60:invokeinterface #67  <Method void HlsSampleSource$EventListener.onLoadCompleted(int, long, int, int, Format, long, long, long, long)>
				//   29   65:return          
				}

				final HlsSampleSource this$0;
				final long val$bytesLoaded;
				final long val$elapsedRealtimeMs;
				final Format val$format;
				final long val$loadDurationMs;
				final long val$mediaEndTimeUs;
				final long val$mediaStartTimeUs;
				final int val$trigger;
				final int val$type;

			
			{
				this$0 = HlsSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field HlsSampleSource this$0>
				bytesLoaded = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #30  <Field long val$bytesLoaded>
				type = i;
			//    6   10:aload_0         
			//    7   11:iload           4
			//    8   13:putfield        #32  <Field int val$type>
				trigger = j;
			//    9   16:aload_0         
			//   10   17:iload           5
			//   11   19:putfield        #34  <Field int val$trigger>
				format = format1;
			//   12   22:aload_0         
			//   13   23:aload           6
			//   14   25:putfield        #36  <Field Format val$format>
				mediaStartTimeUs = l1;
			//   15   28:aload_0         
			//   16   29:lload           7
			//   17   31:putfield        #38  <Field long val$mediaStartTimeUs>
				mediaEndTimeUs = l2;
			//   18   34:aload_0         
			//   19   35:lload           9
			//   20   37:putfield        #40  <Field long val$mediaEndTimeUs>
				elapsedRealtimeMs = l3;
			//   21   40:aload_0         
			//   22   41:lload           11
			//   23   43:putfield        #42  <Field long val$elapsedRealtimeMs>
				loadDurationMs = l4;
			//   24   46:aload_0         
			//   25   47:lload           13
			//   26   49:putfield        #44  <Field long val$loadDurationMs>
				super();
			//   27   52:aload_0         
			//   28   53:invokespecial   #47  <Method void Object()>
			//   29   56:return          
			}
			}
);
	//    8   18:aload           14
	//    9   20:new             #14  <Class HlsSampleSource$2>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:lload_1         
	//   13   26:iload_3         
	//   14   27:iload           4
	//   15   29:aload           5
	//   16   31:lload           6
	//   17   33:lload           8
	//   18   35:lload           10
	//   19   37:lload           12
	//   20   39:invokespecial   #442 <Method void HlsSampleSource$2(HlsSampleSource, long, int, int, Format, long, long, long, long)>
	//   21   42:invokevirtual   #432 <Method boolean Handler.post(Runnable)>
	//   22   45:pop             
	//   23   46:return          
	}

	private void notifyLoadError(final IOException e)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #111 <Field HlsSampleSource$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadError(eventSourceId, e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field HlsSampleSource this$0>
				//    2    4:invokestatic    #30  <Method HlsSampleSource$EventListener HlsSampleSource.access$100(HlsSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field HlsSampleSource this$0>
				//    5   11:invokestatic    #34  <Method int HlsSampleSource.access$000(HlsSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field IOException val$e>
				//    8   18:invokeinterface #40  <Method void HlsSampleSource$EventListener.onLoadError(int, IOException)>
				//    9   23:return          
				}

				final HlsSampleSource this$0;
				final IOException val$e;

			
			{
				this$0 = HlsSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field HlsSampleSource this$0>
				e = ioexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #18  <Class HlsSampleSource$4>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #447 <Method void HlsSampleSource$4(HlsSampleSource, IOException)>
	//   14   26:invokevirtual   #432 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void notifyLoadStarted(final long length, final int type, final int trigger, final Format format, final long mediaStartTimeUs, 
			final long mediaEndTimeUs)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Handler eventHandler>
	//    2    4:astore          10
		if(handler != null && eventListener != null)
	//*   3    6:aload           10
	//*   4    8:ifnull          42
	//*   5   11:aload_0         
	//*   6   12:getfield        #111 <Field HlsSampleSource$EventListener eventListener>
	//*   7   15:ifnull          42
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadStarted(eventSourceId, length, type, trigger, format, usToMs(mediaStartTimeUs), usToMs(mediaEndTimeUs));
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field HlsSampleSource this$0>
				//    2    4:invokestatic    #47  <Method HlsSampleSource$EventListener HlsSampleSource.access$100(HlsSampleSource)>
				//    3    7:aload_0         
				//    4    8:getfield        #26  <Field HlsSampleSource this$0>
				//    5   11:invokestatic    #51  <Method int HlsSampleSource.access$000(HlsSampleSource)>
				//    6   14:aload_0         
				//    7   15:getfield        #28  <Field long val$length>
				//    8   18:aload_0         
				//    9   19:getfield        #30  <Field int val$type>
				//   10   22:aload_0         
				//   11   23:getfield        #32  <Field int val$trigger>
				//   12   26:aload_0         
				//   13   27:getfield        #34  <Field Format val$format>
				//   14   30:aload_0         
				//   15   31:getfield        #26  <Field HlsSampleSource this$0>
				//   16   34:aload_0         
				//   17   35:getfield        #36  <Field long val$mediaStartTimeUs>
				//   18   38:invokevirtual   #55  <Method long HlsSampleSource.usToMs(long)>
				//   19   41:aload_0         
				//   20   42:getfield        #26  <Field HlsSampleSource this$0>
				//   21   45:aload_0         
				//   22   46:getfield        #38  <Field long val$mediaEndTimeUs>
				//   23   49:invokevirtual   #55  <Method long HlsSampleSource.usToMs(long)>
				//   24   52:invokeinterface #61  <Method void HlsSampleSource$EventListener.onLoadStarted(int, long, int, int, Format, long, long)>
				//   25   57:return          
				}

				final HlsSampleSource this$0;
				final Format val$format;
				final long val$length;
				final long val$mediaEndTimeUs;
				final long val$mediaStartTimeUs;
				final int val$trigger;
				final int val$type;

			
			{
				this$0 = HlsSampleSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field HlsSampleSource this$0>
				length = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #28  <Field long val$length>
				type = i;
			//    6   10:aload_0         
			//    7   11:iload           4
			//    8   13:putfield        #30  <Field int val$type>
				trigger = j;
			//    9   16:aload_0         
			//   10   17:iload           5
			//   11   19:putfield        #32  <Field int val$trigger>
				format = format1;
			//   12   22:aload_0         
			//   13   23:aload           6
			//   14   25:putfield        #34  <Field Format val$format>
				mediaStartTimeUs = l1;
			//   15   28:aload_0         
			//   16   29:lload           7
			//   17   31:putfield        #36  <Field long val$mediaStartTimeUs>
				mediaEndTimeUs = l2;
			//   18   34:aload_0         
			//   19   35:lload           9
			//   20   37:putfield        #38  <Field long val$mediaEndTimeUs>
				super();
			//   21   40:aload_0         
			//   22   41:invokespecial   #41  <Method void Object()>
			//   23   44:return          
			}
			}
);
	//    8   18:aload           10
	//    9   20:new             #12  <Class HlsSampleSource$1>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:lload_1         
	//   13   26:iload_3         
	//   14   27:iload           4
	//   15   29:aload           5
	//   16   31:lload           6
	//   17   33:lload           8
	//   18   35:invokespecial   #450 <Method void HlsSampleSource$1(HlsSampleSource, long, int, int, Format, long, long)>
	//   19   38:invokevirtual   #432 <Method boolean Handler.post(Runnable)>
	//   20   41:pop             
	//   21   42:return          
	}

	private void restartFrom(long l)
	{
		pendingResetPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #115 <Field long pendingResetPositionUs>
		loadingFinished = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #295 <Field boolean loadingFinished>
		if(loader.isLoading())
	//*   6   10:aload_0         
	//*   7   11:getfield        #334 <Field Loader loader>
	//*   8   14:invokevirtual   #339 <Method boolean Loader.isLoading()>
	//*   9   17:ifeq            28
		{
			loader.cancelLoading();
	//   10   20:aload_0         
	//   11   21:getfield        #334 <Field Loader loader>
	//   12   24:invokevirtual   #454 <Method void Loader.cancelLoading()>
			return;
	//   13   27:return          
		} else
		{
			clearState();
	//   14   28:aload_0         
	//   15   29:invokespecial   #456 <Method void clearState()>
			maybeStartLoading();
	//   16   32:aload_0         
	//   17   33:invokespecial   #458 <Method void maybeStartLoading()>
			return;
	//   18   36:return          
		}
	}

	private void seekToInternal(long l)
	{
		lastSeekPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #461 <Field long lastSeekPositionUs>
		downstreamPositionUs = l;
	//    3    5:aload_0         
	//    4    6:lload_1         
	//    5    7:putfield        #341 <Field long downstreamPositionUs>
		Arrays.fill(pendingDiscontinuities, true);
	//    6   10:aload_0         
	//    7   11:getfield        #170 <Field boolean[] pendingDiscontinuities>
	//    8   14:iconst_1        
	//    9   15:invokestatic    #467 <Method void Arrays.fill(boolean[], boolean)>
		chunkSource.seek();
	//   10   18:aload_0         
	//   11   19:getfield        #101 <Field HlsChunkSource chunkSource>
	//   12   22:invokevirtual   #470 <Method void HlsChunkSource.seek()>
		restartFrom(l);
	//   13   25:aload_0         
	//   14   26:lload_1         
	//   15   27:invokespecial   #472 <Method void restartFrom(long)>
	//   16   30:return          
	}

	private void setTrackEnabledState(int i, boolean flag)
	{
		boolean flag2 = trackEnabledStates[i];
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field boolean[] trackEnabledStates>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:istore          5
		boolean flag3 = false;
	//    5    8:iconst_0        
	//    6    9:istore          6
		boolean flag1 = true;
	//    7   11:iconst_1        
	//    8   12:istore_3        
		if(flag2 != flag)
	//*   9   13:iload           5
	//*  10   15:iload_2         
	//*  11   16:icmpeq          25
			flag2 = true;
	//   12   19:iconst_1        
	//   13   20:istore          5
		else
	//*  14   22:goto            28
			flag2 = false;
	//   15   25:iconst_0        
	//   16   26:istore          5
		Assertions.checkState(flag2);
	//   17   28:iload           5
	//   18   30:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		int j = extractorTrackIndices[i];
	//   19   33:aload_0         
	//   20   34:getfield        #176 <Field int[] extractorTrackIndices>
	//   21   37:iload_1         
	//   22   38:iaload          
	//   23   39:istore          4
		flag2 = flag3;
	//   24   41:iload           6
	//   25   43:istore          5
		if(extractorTrackEnabledStates[j] != flag)
	//*  26   45:aload_0         
	//*  27   46:getfield        #178 <Field boolean[] extractorTrackEnabledStates>
	//*  28   49:iload           4
	//*  29   51:baload          
	//*  30   52:iload_2         
	//*  31   53:icmpeq          59
			flag2 = true;
	//   32   56:iconst_1        
	//   33   57:istore          5
		Assertions.checkState(flag2);
	//   34   59:iload           5
	//   35   61:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		trackEnabledStates[i] = flag;
	//   36   64:aload_0         
	//   37   65:getfield        #168 <Field boolean[] trackEnabledStates>
	//   38   68:iload_1         
	//   39   69:iload_2         
	//   40   70:bastore         
		extractorTrackEnabledStates[j] = flag;
	//   41   71:aload_0         
	//   42   72:getfield        #178 <Field boolean[] extractorTrackEnabledStates>
	//   43   75:iload           4
	//   44   77:iload_2         
	//   45   78:bastore         
		j = enabledTrackCount;
	//   46   79:aload_0         
	//   47   80:getfield        #299 <Field int enabledTrackCount>
	//   48   83:istore          4
		if(flag)
	//*  49   85:iload_2         
	//*  50   86:ifeq            94
			i = ((int) (flag1));
	//   51   89:iload_3         
	//   52   90:istore_1        
		else
	//*  53   91:goto            96
			i = -1;
	//   54   94:iconst_m1       
	//   55   95:istore_1        
		enabledTrackCount = j + i;
	//   56   96:aload_0         
	//   57   97:iload           4
	//   58   99:iload_1         
	//   59  100:iadd            
	//   60  101:putfield        #299 <Field int enabledTrackCount>
	//   61  104:return          
	}

	public boolean continueBuffering(int i, long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		Assertions.checkState(trackEnabledStates[i]);
	//    3    7:aload_0         
	//    4    8:getfield        #168 <Field boolean[] trackEnabledStates>
	//    5   11:iload_1         
	//    6   12:baload          
	//    7   13:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		downstreamPositionUs = l;
	//    8   16:aload_0         
	//    9   17:lload_2         
	//   10   18:putfield        #341 <Field long downstreamPositionUs>
		if(!extractors.isEmpty())
	//*  11   21:aload_0         
	//*  12   22:getfield        #120 <Field LinkedList extractors>
	//*  13   25:invokevirtual   #377 <Method boolean LinkedList.isEmpty()>
	//*  14   28:ifne            43
			discardSamplesForDisabledTracks(getCurrentExtractor(), downstreamPositionUs);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:invokespecial   #484 <Method HlsExtractorWrapper getCurrentExtractor()>
	//   18   36:aload_0         
	//   19   37:getfield        #341 <Field long downstreamPositionUs>
	//   20   40:invokespecial   #486 <Method void discardSamplesForDisabledTracks(HlsExtractorWrapper, long)>
		maybeStartLoading();
	//   21   43:aload_0         
	//   22   44:invokespecial   #458 <Method void maybeStartLoading()>
		if(loadingFinished)
	//*  23   47:aload_0         
	//*  24   48:getfield        #295 <Field boolean loadingFinished>
	//*  25   51:ifeq            56
			return true;
	//   26   54:iconst_1        
	//   27   55:ireturn         
		if(!isPendingReset())
	//*  28   56:aload_0         
	//*  29   57:invokespecial   #293 <Method boolean isPendingReset()>
	//*  30   60:ifne            141
		{
			if(extractors.isEmpty())
	//*  31   63:aload_0         
	//*  32   64:getfield        #120 <Field LinkedList extractors>
	//*  33   67:invokevirtual   #377 <Method boolean LinkedList.isEmpty()>
	//*  34   70:ifeq            75
				return false;
	//   35   73:iconst_0        
	//   36   74:ireturn         
			for(int j = 0; j < extractors.size(); j++)
	//*  37   75:iconst_0        
	//*  38   76:istore          4
	//*  39   78:iload           4
	//*  40   80:aload_0         
	//*  41   81:getfield        #120 <Field LinkedList extractors>
	//*  42   84:invokevirtual   #234 <Method int LinkedList.size()>
	//*  43   87:icmpge          139
			{
				HlsExtractorWrapper hlsextractorwrapper = (HlsExtractorWrapper)extractors.get(j);
	//   44   90:aload_0         
	//   45   91:getfield        #120 <Field LinkedList extractors>
	//   46   94:iload           4
	//   47   96:invokevirtual   #238 <Method Object LinkedList.get(int)>
	//   48   99:checkcast       #133 <Class HlsExtractorWrapper>
	//   49  102:astore          5
				if(!hlsextractorwrapper.isPrepared())
	//*  50  104:aload           5
	//*  51  106:invokevirtual   #272 <Method boolean HlsExtractorWrapper.isPrepared()>
	//*  52  109:ifne            114
					return false;
	//   53  112:iconst_0        
	//   54  113:ireturn         
				if(hlsextractorwrapper.hasSamples(extractorTrackIndices[i]))
	//*  55  114:aload           5
	//*  56  116:aload_0         
	//*  57  117:getfield        #176 <Field int[] extractorTrackIndices>
	//*  58  120:iload_1         
	//*  59  121:iaload          
	//*  60  122:invokevirtual   #322 <Method boolean HlsExtractorWrapper.hasSamples(int)>
	//*  61  125:ifeq            130
					return true;
	//   62  128:iconst_1        
	//   63  129:ireturn         
			}

	//   64  130:iload           4
	//   65  132:iconst_1        
	//   66  133:iadd            
	//   67  134:istore          4
	//*  68  136:goto            78
			return false;
	//   69  139:iconst_0        
	//   70  140:ireturn         
		} else
		{
			return false;
	//   71  141:iconst_0        
	//   72  142:ireturn         
		}
	}

	public void disable(int i)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		setTrackEnabledState(i, false);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #490 <Method void setTrackEnabledState(int, boolean)>
		if(enabledTrackCount == 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #299 <Field int enabledTrackCount>
	//*   9   17:ifne            87
		{
			chunkSource.reset();
	//   10   20:aload_0         
	//   11   21:getfield        #101 <Field HlsChunkSource chunkSource>
	//   12   24:invokevirtual   #493 <Method void HlsChunkSource.reset()>
			downstreamPositionUs = 0x0L;
	//   13   27:aload_0         
	//   14   28:ldc2w           #29  <Long 0x0L>
	//   15   31:putfield        #341 <Field long downstreamPositionUs>
			if(loadControlRegistered)
	//*  16   34:aload_0         
	//*  17   35:getfield        #495 <Field boolean loadControlRegistered>
	//*  18   38:ifeq            56
			{
				loadControl.unregister(((Object) (this)));
	//   19   41:aload_0         
	//   20   42:getfield        #103 <Field LoadControl loadControl>
	//   21   45:aload_0         
	//   22   46:invokeinterface #498 <Method void LoadControl.unregister(Object)>
				loadControlRegistered = false;
	//   23   51:aload_0         
	//   24   52:iconst_0        
	//   25   53:putfield        #495 <Field boolean loadControlRegistered>
			}
			if(loader.isLoading())
	//*  26   56:aload_0         
	//*  27   57:getfield        #334 <Field Loader loader>
	//*  28   60:invokevirtual   #339 <Method boolean Loader.isLoading()>
	//*  29   63:ifeq            74
			{
				loader.cancelLoading();
	//   30   66:aload_0         
	//   31   67:getfield        #334 <Field Loader loader>
	//   32   70:invokevirtual   #454 <Method void Loader.cancelLoading()>
				return;
	//   33   73:return          
			}
			clearState();
	//   34   74:aload_0         
	//   35   75:invokespecial   #456 <Method void clearState()>
			loadControl.trimAllocator();
	//   36   78:aload_0         
	//   37   79:getfield        #103 <Field LoadControl loadControl>
	//   38   82:invokeinterface #501 <Method void LoadControl.trimAllocator()>
		}
	//   39   87:return          
	}

	public void enable(int i, long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		setTrackEnabledState(i, true);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iconst_1        
	//    6   10:invokespecial   #490 <Method void setTrackEnabledState(int, boolean)>
		downstreamMediaFormats[i] = null;
	//    7   13:aload_0         
	//    8   14:getfield        #172 <Field MediaFormat[] downstreamMediaFormats>
	//    9   17:iload_1         
	//   10   18:aconst_null     
	//   11   19:aastore         
		pendingDiscontinuities[i] = false;
	//   12   20:aload_0         
	//   13   21:getfield        #170 <Field boolean[] pendingDiscontinuities>
	//   14   24:iload_1         
	//   15   25:iconst_0        
	//   16   26:bastore         
		downstreamFormat = null;
	//   17   27:aload_0         
	//   18   28:aconst_null     
	//   19   29:putfield        #504 <Field Format downstreamFormat>
		boolean flag = loadControlRegistered;
	//   20   32:aload_0         
	//   21   33:getfield        #495 <Field boolean loadControlRegistered>
	//   22   36:istore          4
		if(!flag)
	//*  23   38:iload           4
	//*  24   40:ifne            62
		{
			loadControl.register(((Object) (this)), bufferSizeContribution);
	//   25   43:aload_0         
	//   26   44:getfield        #103 <Field LoadControl loadControl>
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #105 <Field int bufferSizeContribution>
	//   30   52:invokeinterface #508 <Method void LoadControl.register(Object, int)>
			loadControlRegistered = true;
	//   31   57:aload_0         
	//   32   58:iconst_1        
	//   33   59:putfield        #495 <Field boolean loadControlRegistered>
		}
		if(chunkSource.isLive())
	//*  34   62:aload_0         
	//*  35   63:getfield        #101 <Field HlsChunkSource chunkSource>
	//*  36   66:invokevirtual   #511 <Method boolean HlsChunkSource.isLive()>
	//*  37   69:ifeq            74
			l = 0L;
	//   38   72:lconst_0        
	//   39   73:lstore_2        
		i = chunkSourceTrackIndices[i];
	//   40   74:aload_0         
	//   41   75:getfield        #174 <Field int[] chunkSourceTrackIndices>
	//   42   78:iload_1         
	//   43   79:iaload          
	//   44   80:istore_1        
		if(i != -1 && i != chunkSource.getSelectedTrackIndex())
	//*  45   81:iload_1         
	//*  46   82:iconst_m1       
	//*  47   83:icmpeq          111
	//*  48   86:iload_1         
	//*  49   87:aload_0         
	//*  50   88:getfield        #101 <Field HlsChunkSource chunkSource>
	//*  51   91:invokevirtual   #514 <Method int HlsChunkSource.getSelectedTrackIndex()>
	//*  52   94:icmpeq          111
		{
			chunkSource.selectTrack(i);
	//   53   97:aload_0         
	//   54   98:getfield        #101 <Field HlsChunkSource chunkSource>
	//   55  101:iload_1         
	//   56  102:invokevirtual   #517 <Method void HlsChunkSource.selectTrack(int)>
			seekToInternal(l);
	//   57  105:aload_0         
	//   58  106:lload_2         
	//   59  107:invokespecial   #519 <Method void seekToInternal(long)>
			return;
	//   60  110:return          
		}
		if(enabledTrackCount == 1)
	//*  61  111:aload_0         
	//*  62  112:getfield        #299 <Field int enabledTrackCount>
	//*  63  115:iconst_1        
	//*  64  116:icmpne          153
		{
			lastSeekPositionUs = l;
	//   65  119:aload_0         
	//   66  120:lload_2         
	//   67  121:putfield        #461 <Field long lastSeekPositionUs>
			if(flag && downstreamPositionUs == l)
	//*  68  124:iload           4
	//*  69  126:ifeq            143
	//*  70  129:aload_0         
	//*  71  130:getfield        #341 <Field long downstreamPositionUs>
	//*  72  133:lload_2         
	//*  73  134:lcmp            
	//*  74  135:ifne            143
			{
				maybeStartLoading();
	//   75  138:aload_0         
	//   76  139:invokespecial   #458 <Method void maybeStartLoading()>
				return;
	//   77  142:return          
			}
			downstreamPositionUs = l;
	//   78  143:aload_0         
	//   79  144:lload_2         
	//   80  145:putfield        #341 <Field long downstreamPositionUs>
			restartFrom(l);
	//   81  148:aload_0         
	//   82  149:lload_2         
	//   83  150:invokespecial   #472 <Method void restartFrom(long)>
		}
	//   84  153:return          
	}

	public long getBufferedPositionUs()
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		boolean flag;
		if(enabledTrackCount > 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #299 <Field int enabledTrackCount>
	//*   5   11:ifle            19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_1        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		Assertions.checkState(flag);
	//   11   21:iload_1         
	//   12   22:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		if(isPendingReset())
	//*  13   25:aload_0         
	//*  14   26:invokespecial   #293 <Method boolean isPendingReset()>
	//*  15   29:ifeq            37
			return pendingResetPositionUs;
	//   16   32:aload_0         
	//   17   33:getfield        #115 <Field long pendingResetPositionUs>
	//   18   36:lreturn         
		if(loadingFinished)
	//*  19   37:aload_0         
	//*  20   38:getfield        #295 <Field boolean loadingFinished>
	//*  21   41:ifeq            48
			return -3L;
	//   22   44:ldc2w           #521 <Long -3L>
	//   23   47:lreturn         
		long l1 = ((HlsExtractorWrapper)extractors.getLast()).getLargestParsedTimestampUs();
	//   24   48:aload_0         
	//   25   49:getfield        #120 <Field LinkedList extractors>
	//   26   52:invokevirtual   #380 <Method Object LinkedList.getLast()>
	//   27   55:checkcast       #133 <Class HlsExtractorWrapper>
	//   28   58:invokevirtual   #525 <Method long HlsExtractorWrapper.getLargestParsedTimestampUs()>
	//   29   61:lstore          4
		long l = l1;
	//   30   63:lload           4
	//   31   65:lstore_2        
		if(extractors.size() > 1)
	//*  32   66:aload_0         
	//*  33   67:getfield        #120 <Field LinkedList extractors>
	//*  34   70:invokevirtual   #234 <Method int LinkedList.size()>
	//*  35   73:iconst_1        
	//*  36   74:icmple          107
		{
			LinkedList linkedlist = extractors;
	//   37   77:aload_0         
	//   38   78:getfield        #120 <Field LinkedList extractors>
	//   39   81:astore          6
			l = Math.max(l1, ((HlsExtractorWrapper)linkedlist.get(linkedlist.size() - 2)).getLargestParsedTimestampUs());
	//   40   83:lload           4
	//   41   85:aload           6
	//   42   87:aload           6
	//   43   89:invokevirtual   #234 <Method int LinkedList.size()>
	//   44   92:iconst_2        
	//   45   93:isub            
	//   46   94:invokevirtual   #238 <Method Object LinkedList.get(int)>
	//   47   97:checkcast       #133 <Class HlsExtractorWrapper>
	//   48  100:invokevirtual   #525 <Method long HlsExtractorWrapper.getLargestParsedTimestampUs()>
	//   49  103:invokestatic    #528 <Method long Math.max(long, long)>
	//   50  106:lstore_2        
		}
		l1 = l;
	//   51  107:lload_2         
	//   52  108:lstore          4
		if(l == 0x0L)
	//*  53  110:lload_2         
	//*  54  111:ldc2w           #29  <Long 0x0L>
	//*  55  114:lcmp            
	//*  56  115:ifne            124
			l1 = downstreamPositionUs;
	//   57  118:aload_0         
	//   58  119:getfield        #341 <Field long downstreamPositionUs>
	//   59  122:lstore          4
		return l1;
	//   60  124:lload           4
	//   61  126:lreturn         
	}

	public MediaFormat getFormat(int i)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		return trackFormats[i];
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field MediaFormat[] trackFormats>
	//    5   11:iload_1         
	//    6   12:aaload          
	//    7   13:areturn         
	}

	public int getTrackCount()
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		return trackCount;
	//    3    7:aload_0         
	//    4    8:getfield        #164 <Field int trackCount>
	//    5   11:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		IOException ioexception = currentLoadableException;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field IOException currentLoadableException>
	//    2    4:astore_1        
		if(ioexception != null && currentLoadableExceptionCount > minLoadableRetryCount)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
	//*   5    9:aload_0         
	//*   6   10:getfield        #230 <Field int currentLoadableExceptionCount>
	//*   7   13:aload_0         
	//*   8   14:getfield        #107 <Field int minLoadableRetryCount>
	//*   9   17:icmpgt          23
	//*  10   20:goto            25
			throw ioexception;
	//   11   23:aload_1         
	//   12   24:athrow          
		if(currentLoadable == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #226 <Field Chunk currentLoadable>
	//*  15   29:ifnonnull       39
			chunkSource.maybeThrowError();
	//   16   32:aload_0         
	//   17   33:getfield        #101 <Field HlsChunkSource chunkSource>
	//   18   36:invokevirtual   #534 <Method void HlsChunkSource.maybeThrowError()>
	//   19   39:return          
	}

	public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		notifyLoadCanceled(currentLoadable.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #226 <Field Chunk currentLoadable>
	//    3    5:invokevirtual   #540 <Method long Chunk.bytesLoaded()>
	//    4    8:invokespecial   #542 <Method void notifyLoadCanceled(long)>
		if(enabledTrackCount > 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #299 <Field int enabledTrackCount>
	//*   7   15:ifle            27
		{
			restartFrom(pendingResetPositionUs);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #115 <Field long pendingResetPositionUs>
	//   11   23:invokespecial   #472 <Method void restartFrom(long)>
			return;
	//   12   26:return          
		} else
		{
			clearState();
	//   13   27:aload_0         
	//   14   28:invokespecial   #456 <Method void clearState()>
			loadControl.trimAllocator();
	//   15   31:aload_0         
	//   16   32:getfield        #103 <Field LoadControl loadControl>
	//   17   35:invokeinterface #501 <Method void LoadControl.trimAllocator()>
			return;
	//   18   40:return          
		}
	}

	public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		Chunk chunk = currentLoadable;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field Chunk currentLoadable>
	//    2    4:astore          8
		boolean flag2 = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		boolean flag;
		if(loadable == chunk)
	//*   5    8:aload_1         
	//*   6    9:aload           8
	//*   7   11:if_acmpne       19
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_2        
		else
	//*  10   16:goto            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		Assertions.checkState(flag);
	//   13   21:iload_2         
	//   14   22:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		long l = SystemClock.elapsedRealtime();
	//   15   25:invokestatic    #330 <Method long SystemClock.elapsedRealtime()>
	//   16   28:lstore          4
		long l1 = l - currentLoadStartTimeMs;
	//   17   30:lload           4
	//   18   32:aload_0         
	//   19   33:getfield        #368 <Field long currentLoadStartTimeMs>
	//   20   36:lsub            
	//   21   37:lstore          6
		chunkSource.onChunkLoadCompleted(currentLoadable);
	//   22   39:aload_0         
	//   23   40:getfield        #101 <Field HlsChunkSource chunkSource>
	//   24   43:aload_0         
	//   25   44:getfield        #226 <Field Chunk currentLoadable>
	//   26   47:invokevirtual   #547 <Method void HlsChunkSource.onChunkLoadCompleted(Chunk)>
		if(isTsChunk(currentLoadable))
	//*  27   50:aload_0         
	//*  28   51:aload_0         
	//*  29   52:getfield        #226 <Field Chunk currentLoadable>
	//*  30   55:invokespecial   #370 <Method boolean isTsChunk(Chunk)>
	//*  31   58:ifeq            144
		{
			boolean flag1;
			if(currentLoadable == currentTsLoadable)
	//*  32   61:aload_0         
	//*  33   62:getfield        #226 <Field Chunk currentLoadable>
	//*  34   65:aload_0         
	//*  35   66:getfield        #224 <Field TsChunk currentTsLoadable>
	//*  36   69:if_acmpne       77
				flag1 = flag2;
	//   37   72:iload_3         
	//   38   73:istore_2        
			else
	//*  39   74:goto            79
				flag1 = false;
	//   40   77:iconst_0        
	//   41   78:istore_2        
			Assertions.checkState(flag1);
	//   42   79:iload_2         
	//   43   80:invokestatic    #480 <Method void Assertions.checkState(boolean)>
			previousTsLoadable = currentTsLoadable;
	//   44   83:aload_0         
	//   45   84:aload_0         
	//   46   85:getfield        #224 <Field TsChunk currentTsLoadable>
	//   47   88:putfield        #246 <Field TsChunk previousTsLoadable>
			notifyLoadCompleted(currentLoadable.bytesLoaded(), currentTsLoadable.type, currentTsLoadable.trigger, currentTsLoadable.format, currentTsLoadable.startTimeUs, currentTsLoadable.endTimeUs, l, l1);
	//   48   91:aload_0         
	//   49   92:aload_0         
	//   50   93:getfield        #226 <Field Chunk currentLoadable>
	//   51   96:invokevirtual   #540 <Method long Chunk.bytesLoaded()>
	//   52   99:aload_0         
	//   53  100:getfield        #224 <Field TsChunk currentTsLoadable>
	//   54  103:getfield        #404 <Field int TsChunk.type>
	//   55  106:aload_0         
	//   56  107:getfield        #224 <Field TsChunk currentTsLoadable>
	//   57  110:getfield        #407 <Field int TsChunk.trigger>
	//   58  113:aload_0         
	//   59  114:getfield        #224 <Field TsChunk currentTsLoadable>
	//   60  117:getfield        #408 <Field Format TsChunk.format>
	//   61  120:aload_0         
	//   62  121:getfield        #224 <Field TsChunk currentTsLoadable>
	//   63  124:getfield        #411 <Field long TsChunk.startTimeUs>
	//   64  127:aload_0         
	//   65  128:getfield        #224 <Field TsChunk currentTsLoadable>
	//   66  131:getfield        #304 <Field long TsChunk.endTimeUs>
	//   67  134:lload           4
	//   68  136:lload           6
	//   69  138:invokespecial   #549 <Method void notifyLoadCompleted(long, int, int, Format, long, long, long, long)>
		} else
	//*  70  141:goto            186
		{
			notifyLoadCompleted(currentLoadable.bytesLoaded(), currentLoadable.type, currentLoadable.trigger, currentLoadable.format, -1L, -1L, l, l1);
	//   71  144:aload_0         
	//   72  145:aload_0         
	//   73  146:getfield        #226 <Field Chunk currentLoadable>
	//   74  149:invokevirtual   #540 <Method long Chunk.bytesLoaded()>
	//   75  152:aload_0         
	//   76  153:getfield        #226 <Field Chunk currentLoadable>
	//   77  156:getfield        #419 <Field int Chunk.type>
	//   78  159:aload_0         
	//   79  160:getfield        #226 <Field Chunk currentLoadable>
	//   80  163:getfield        #420 <Field int Chunk.trigger>
	//   81  166:aload_0         
	//   82  167:getfield        #226 <Field Chunk currentLoadable>
	//   83  170:getfield        #421 <Field Format Chunk.format>
	//   84  173:ldc2w           #305 <Long -1L>
	//   85  176:ldc2w           #305 <Long -1L>
	//   86  179:lload           4
	//   87  181:lload           6
	//   88  183:invokespecial   #549 <Method void notifyLoadCompleted(long, int, int, Format, long, long, long, long)>
		}
		clearCurrentLoadable();
	//   89  186:aload_0         
	//   90  187:invokespecial   #244 <Method void clearCurrentLoadable()>
		maybeStartLoading();
	//   91  190:aload_0         
	//   92  191:invokespecial   #458 <Method void maybeStartLoading()>
	//   93  194:return          
	}

	public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
	{
		if(chunkSource.onChunkLoadError(currentLoadable, ioexception))
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field HlsChunkSource chunkSource>
	//*   2    4:aload_0         
	//*   3    5:getfield        #226 <Field Chunk currentLoadable>
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #555 <Method boolean HlsChunkSource.onChunkLoadError(Chunk, IOException)>
	//*   6   12:ifeq            44
		{
			if(previousTsLoadable == null && !isPendingReset())
	//*   7   15:aload_0         
	//*   8   16:getfield        #246 <Field TsChunk previousTsLoadable>
	//*   9   19:ifnonnull       37
	//*  10   22:aload_0         
	//*  11   23:invokespecial   #293 <Method boolean isPendingReset()>
	//*  12   26:ifne            37
				pendingResetPositionUs = lastSeekPositionUs;
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #461 <Field long lastSeekPositionUs>
	//   16   34:putfield        #115 <Field long pendingResetPositionUs>
			clearCurrentLoadable();
	//   17   37:aload_0         
	//   18   38:invokespecial   #244 <Method void clearCurrentLoadable()>
		} else
	//*  19   41:goto            66
		{
			currentLoadableException = ioexception;
	//   20   44:aload_0         
	//   21   45:aload_2         
	//   22   46:putfield        #228 <Field IOException currentLoadableException>
			currentLoadableExceptionCount = currentLoadableExceptionCount + 1;
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #230 <Field int currentLoadableExceptionCount>
	//   26   54:iconst_1        
	//   27   55:iadd            
	//   28   56:putfield        #230 <Field int currentLoadableExceptionCount>
			currentLoadableExceptionTimestamp = SystemClock.elapsedRealtime();
	//   29   59:aload_0         
	//   30   60:invokestatic    #330 <Method long SystemClock.elapsedRealtime()>
	//   31   63:putfield        #349 <Field long currentLoadableExceptionTimestamp>
		}
		notifyLoadError(ioexception);
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:invokespecial   #557 <Method void notifyLoadError(IOException)>
		maybeStartLoading();
	//   35   71:aload_0         
	//   36   72:invokespecial   #458 <Method void maybeStartLoading()>
	//   37   75:return          
	}

	public boolean prepare(long l)
	{
		if(prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #297 <Field boolean prepared>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!chunkSource.prepare())
	//*   5    9:aload_0         
	//*   6   10:getfield        #101 <Field HlsChunkSource chunkSource>
	//*   7   13:invokevirtual   #561 <Method boolean HlsChunkSource.prepare()>
	//*   8   16:ifne            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(!extractors.isEmpty())
	//*  11   21:aload_0         
	//*  12   22:getfield        #120 <Field LinkedList extractors>
	//*  13   25:invokevirtual   #377 <Method boolean LinkedList.isEmpty()>
	//*  14   28:ifne            92
			do
			{
				HlsExtractorWrapper hlsextractorwrapper = (HlsExtractorWrapper)extractors.getFirst();
	//   15   31:aload_0         
	//   16   32:getfield        #120 <Field LinkedList extractors>
	//   17   35:invokevirtual   #282 <Method Object LinkedList.getFirst()>
	//   18   38:checkcast       #133 <Class HlsExtractorWrapper>
	//   19   41:astore_3        
				if(hlsextractorwrapper.isPrepared())
	//*  20   42:aload_3         
	//*  21   43:invokevirtual   #272 <Method boolean HlsExtractorWrapper.isPrepared()>
	//*  22   46:ifeq            65
				{
					buildTracks(hlsextractorwrapper);
	//   23   49:aload_0         
	//   24   50:aload_3         
	//   25   51:invokespecial   #563 <Method void buildTracks(HlsExtractorWrapper)>
					prepared = true;
	//   26   54:aload_0         
	//   27   55:iconst_1        
	//   28   56:putfield        #297 <Field boolean prepared>
					maybeStartLoading();
	//   29   59:aload_0         
	//   30   60:invokespecial   #458 <Method void maybeStartLoading()>
					return true;
	//   31   63:iconst_1        
	//   32   64:ireturn         
				}
				if(extractors.size() <= 1)
					break;
	//   33   65:aload_0         
	//   34   66:getfield        #120 <Field LinkedList extractors>
	//   35   69:invokevirtual   #234 <Method int LinkedList.size()>
	//   36   72:iconst_1        
	//   37   73:icmple          92
				((HlsExtractorWrapper)extractors.removeFirst()).clear();
	//   38   76:aload_0         
	//   39   77:getfield        #120 <Field LinkedList extractors>
	//   40   80:invokevirtual   #289 <Method Object LinkedList.removeFirst()>
	//   41   83:checkcast       #133 <Class HlsExtractorWrapper>
	//   42   86:invokevirtual   #241 <Method void HlsExtractorWrapper.clear()>
			} while(true);
	//   43   89:goto            31
		if(loader == null)
	//*  44   92:aload_0         
	//*  45   93:getfield        #334 <Field Loader loader>
	//*  46   96:ifnonnull       132
		{
			loader = new Loader("Loader:HLS");
	//   47   99:aload_0         
	//   48  100:new             #336 <Class Loader>
	//   49  103:dup             
	//   50  104:ldc2            #565 <String "Loader:HLS">
	//   51  107:invokespecial   #568 <Method void Loader(String)>
	//   52  110:putfield        #334 <Field Loader loader>
			loadControl.register(((Object) (this)), bufferSizeContribution);
	//   53  113:aload_0         
	//   54  114:getfield        #103 <Field LoadControl loadControl>
	//   55  117:aload_0         
	//   56  118:aload_0         
	//   57  119:getfield        #105 <Field int bufferSizeContribution>
	//   58  122:invokeinterface #508 <Method void LoadControl.register(Object, int)>
			loadControlRegistered = true;
	//   59  127:aload_0         
	//   60  128:iconst_1        
	//   61  129:putfield        #495 <Field boolean loadControlRegistered>
		}
		if(!loader.isLoading())
	//*  62  132:aload_0         
	//*  63  133:getfield        #334 <Field Loader loader>
	//*  64  136:invokevirtual   #339 <Method boolean Loader.isLoading()>
	//*  65  139:ifne            152
		{
			pendingResetPositionUs = l;
	//   66  142:aload_0         
	//   67  143:lload_1         
	//   68  144:putfield        #115 <Field long pendingResetPositionUs>
			downstreamPositionUs = l;
	//   69  147:aload_0         
	//   70  148:lload_1         
	//   71  149:putfield        #341 <Field long downstreamPositionUs>
		}
		maybeStartLoading();
	//   72  152:aload_0         
	//   73  153:invokespecial   #458 <Method void maybeStartLoading()>
		return false;
	//   74  156:iconst_0        
	//   75  157:ireturn         
	}

	public int readData(int i, long l, MediaFormatHolder mediaformatholder, SampleHolder sampleholder)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		downstreamPositionUs = l;
	//    3    7:aload_0         
	//    4    8:lload_2         
	//    5    9:putfield        #341 <Field long downstreamPositionUs>
		if(!pendingDiscontinuities[i])
	//*   6   12:aload_0         
	//*   7   13:getfield        #170 <Field boolean[] pendingDiscontinuities>
	//*   8   16:iload_1         
	//*   9   17:baload          
	//*  10   18:ifne            330
		{
			if(isPendingReset())
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #293 <Method boolean isPendingReset()>
	//*  13   25:ifeq            31
				return -2;
	//   14   28:bipush          -2
	//   15   30:ireturn         
			HlsExtractorWrapper hlsextractorwrapper = getCurrentExtractor();
	//   16   31:aload_0         
	//   17   32:invokespecial   #484 <Method HlsExtractorWrapper getCurrentExtractor()>
	//   18   35:astore          11
			if(!hlsextractorwrapper.isPrepared())
	//*  19   37:aload           11
	//*  20   39:invokevirtual   #272 <Method boolean HlsExtractorWrapper.isPrepared()>
	//*  21   42:ifne            48
				return -2;
	//   22   45:bipush          -2
	//   23   47:ireturn         
			Format format = hlsextractorwrapper.format;
	//   24   48:aload           11
	//   25   50:getfield        #571 <Field Format HlsExtractorWrapper.format>
	//   26   53:astore          12
			if(!format.equals(((Object) (downstreamFormat))))
	//*  27   55:aload           12
	//*  28   57:aload_0         
	//*  29   58:getfield        #504 <Field Format downstreamFormat>
	//*  30   61:invokevirtual   #572 <Method boolean Format.equals(Object)>
	//*  31   64:ifne            83
				notifyDownstreamFormatChanged(format, hlsextractorwrapper.trigger, hlsextractorwrapper.startTimeUs);
	//   32   67:aload_0         
	//   33   68:aload           12
	//   34   70:aload           11
	//   35   72:getfield        #573 <Field int HlsExtractorWrapper.trigger>
	//   36   75:aload           11
	//   37   77:getfield        #574 <Field long HlsExtractorWrapper.startTimeUs>
	//   38   80:invokespecial   #576 <Method void notifyDownstreamFormatChanged(Format, int, long)>
			downstreamFormat = format;
	//   39   83:aload_0         
	//   40   84:aload           12
	//   41   86:putfield        #504 <Field Format downstreamFormat>
			int j = extractors.size();
	//   42   89:aload_0         
	//   43   90:getfield        #120 <Field LinkedList extractors>
	//   44   93:invokevirtual   #234 <Method int LinkedList.size()>
	//   45   96:istore          6
			int i1 = 1;
	//   46   98:iconst_1        
	//   47   99:istore          8
			if(j > 1)
	//*  48  101:iload           6
	//*  49  103:iconst_1        
	//*  50  104:icmple          123
				hlsextractorwrapper.configureSpliceTo((HlsExtractorWrapper)extractors.get(1));
	//   51  107:aload           11
	//   52  109:aload_0         
	//   53  110:getfield        #120 <Field LinkedList extractors>
	//   54  113:iconst_1        
	//   55  114:invokevirtual   #238 <Method Object LinkedList.get(int)>
	//   56  117:checkcast       #133 <Class HlsExtractorWrapper>
	//   57  120:invokevirtual   #579 <Method void HlsExtractorWrapper.configureSpliceTo(HlsExtractorWrapper)>
			int j1 = extractorTrackIndices[i];
	//   58  123:aload_0         
	//   59  124:getfield        #176 <Field int[] extractorTrackIndices>
	//   60  127:iload_1         
	//   61  128:iaload          
	//   62  129:istore          9
			boolean flag = false;
	//   63  131:iconst_0        
	//   64  132:istore          7
			j = 0;
	//   65  134:iconst_0        
	//   66  135:istore          6
			do
			{
				int k1 = extractors.size();
	//   67  137:aload_0         
	//   68  138:getfield        #120 <Field LinkedList extractors>
	//   69  141:invokevirtual   #234 <Method int LinkedList.size()>
	//   70  144:istore          10
				j++;
	//   71  146:iload           6
	//   72  148:iconst_1        
	//   73  149:iadd            
	//   74  150:istore          6
				if(k1 > j && !hlsextractorwrapper.hasSamples(j1))
	//*  75  152:iload           10
	//*  76  154:iload           6
	//*  77  156:icmple          198
	//*  78  159:aload           11
	//*  79  161:iload           9
	//*  80  163:invokevirtual   #322 <Method boolean HlsExtractorWrapper.hasSamples(int)>
	//*  81  166:ifne            198
				{
					HlsExtractorWrapper hlsextractorwrapper1 = (HlsExtractorWrapper)extractors.get(j);
	//   82  169:aload_0         
	//   83  170:getfield        #120 <Field LinkedList extractors>
	//   84  173:iload           6
	//   85  175:invokevirtual   #238 <Method Object LinkedList.get(int)>
	//   86  178:checkcast       #133 <Class HlsExtractorWrapper>
	//   87  181:astore          12
					hlsextractorwrapper = hlsextractorwrapper1;
	//   88  183:aload           12
	//   89  185:astore          11
					if(!hlsextractorwrapper1.isPrepared())
	//*  90  187:aload           12
	//*  91  189:invokevirtual   #272 <Method boolean HlsExtractorWrapper.isPrepared()>
	//*  92  192:ifne            137
						return -2;
	//   93  195:bipush          -2
	//   94  197:ireturn         
				} else
				{
					MediaFormat mediaformat = hlsextractorwrapper.getMediaFormat(j1);
	//   95  198:aload           11
	//   96  200:iload           9
	//   97  202:invokevirtual   #141 <Method MediaFormat HlsExtractorWrapper.getMediaFormat(int)>
	//   98  205:astore          12
					if(mediaformat != null)
	//*  99  207:aload           12
	//* 100  209:ifnull          252
					{
						if(!mediaformat.equals(((Object) (downstreamMediaFormats[i]))))
	//* 101  212:aload           12
	//* 102  214:aload_0         
	//* 103  215:getfield        #172 <Field MediaFormat[] downstreamMediaFormats>
	//* 104  218:iload_1         
	//* 105  219:aaload          
	//* 106  220:invokevirtual   #580 <Method boolean MediaFormat.equals(Object)>
	//* 107  223:ifne            244
						{
							mediaformatholder.format = mediaformat;
	//  108  226:aload           4
	//  109  228:aload           12
	//  110  230:putfield        #585 <Field MediaFormat MediaFormatHolder.format>
							downstreamMediaFormats[i] = mediaformat;
	//  111  233:aload_0         
	//  112  234:getfield        #172 <Field MediaFormat[] downstreamMediaFormats>
	//  113  237:iload_1         
	//  114  238:aload           12
	//  115  240:aastore         
							return -4;
	//  116  241:bipush          -4
	//  117  243:ireturn         
						}
						downstreamMediaFormats[i] = mediaformat;
	//  118  244:aload_0         
	//  119  245:getfield        #172 <Field MediaFormat[] downstreamMediaFormats>
	//  120  248:iload_1         
	//  121  249:aload           12
	//  122  251:aastore         
					}
					if(hlsextractorwrapper.getSample(j1, sampleholder))
	//* 123  252:aload           11
	//* 124  254:iload           9
	//* 125  256:aload           5
	//* 126  258:invokevirtual   #589 <Method boolean HlsExtractorWrapper.getSample(int, SampleHolder)>
	//* 127  261:ifeq            318
					{
						if(sampleholder.timeUs < lastSeekPositionUs)
	//* 128  264:aload           5
	//* 129  266:getfield        #594 <Field long SampleHolder.timeUs>
	//* 130  269:aload_0         
	//* 131  270:getfield        #461 <Field long lastSeekPositionUs>
	//* 132  273:lcmp            
	//* 133  274:ifge            283
							i = i1;
	//  134  277:iload           8
	//  135  279:istore_1        
						else
	//* 136  280:goto            285
							i = 0;
	//  137  283:iconst_0        
	//  138  284:istore_1        
						i1 = sampleholder.flags;
	//  139  285:aload           5
	//  140  287:getfield        #597 <Field int SampleHolder.flags>
	//  141  290:istore          8
						int k = ((int) (flag));
	//  142  292:iload           7
	//  143  294:istore          6
						if(i != 0)
	//* 144  296:iload_1         
	//* 145  297:ifeq            305
							k = 0x8000000;
	//  146  300:ldc2            #598 <Int 0x8000000>
	//  147  303:istore          6
						sampleholder.flags = i1 | k;
	//  148  305:aload           5
	//  149  307:iload           8
	//  150  309:iload           6
	//  151  311:ior             
	//  152  312:putfield        #597 <Field int SampleHolder.flags>
						return -3;
	//  153  315:bipush          -3
	//  154  317:ireturn         
					}
					return !loadingFinished ? -2 : -1;
	//  155  318:aload_0         
	//  156  319:getfield        #295 <Field boolean loadingFinished>
	//  157  322:ifeq            327
	//  158  325:iconst_m1       
	//  159  326:ireturn         
	//  160  327:bipush          -2
	//  161  329:ireturn         
				}
			} while(true);
		} else
		{
			return -2;
	//  162  330:bipush          -2
	//  163  332:ireturn         
		}
	}

	public long readDiscontinuity(int i)
	{
		boolean aflag[] = pendingDiscontinuities;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field boolean[] pendingDiscontinuities>
	//    2    4:astore_2        
		if(aflag[i])
	//*   3    5:aload_2         
	//*   4    6:iload_1         
	//*   5    7:baload          
	//*   6    8:ifeq            20
		{
			aflag[i] = false;
	//    7   11:aload_2         
	//    8   12:iload_1         
	//    9   13:iconst_0        
	//   10   14:bastore         
			return lastSeekPositionUs;
	//   11   15:aload_0         
	//   12   16:getfield        #461 <Field long lastSeekPositionUs>
	//   13   19:lreturn         
		} else
		{
			return 0x0L;
	//   14   20:ldc2w           #29  <Long 0x0L>
	//   15   23:lreturn         
		}
	}

	public com.google.android.exoplayer.SampleSource.SampleSourceReader register()
	{
		remainingReleaseCount = remainingReleaseCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #603 <Field int remainingReleaseCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #603 <Field int remainingReleaseCount>
		return ((com.google.android.exoplayer.SampleSource.SampleSourceReader) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public void release()
	{
		boolean flag;
		if(remainingReleaseCount > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #603 <Field int remainingReleaseCount>
	//*   2    4:ifle            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		int i = remainingReleaseCount - 1;
	//   10   18:aload_0         
	//   11   19:getfield        #603 <Field int remainingReleaseCount>
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:istore_1        
		remainingReleaseCount = i;
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:putfield        #603 <Field int remainingReleaseCount>
		if(i == 0 && loader != null)
	//*  18   30:iload_1         
	//*  19   31:ifne            75
	//*  20   34:aload_0         
	//*  21   35:getfield        #334 <Field Loader loader>
	//*  22   38:ifnull          75
		{
			if(loadControlRegistered)
	//*  23   41:aload_0         
	//*  24   42:getfield        #495 <Field boolean loadControlRegistered>
	//*  25   45:ifeq            63
			{
				loadControl.unregister(((Object) (this)));
	//   26   48:aload_0         
	//   27   49:getfield        #103 <Field LoadControl loadControl>
	//   28   52:aload_0         
	//   29   53:invokeinterface #498 <Method void LoadControl.unregister(Object)>
				loadControlRegistered = false;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #495 <Field boolean loadControlRegistered>
			}
			loader.release();
	//   33   63:aload_0         
	//   34   64:getfield        #334 <Field Loader loader>
	//   35   67:invokevirtual   #606 <Method void Loader.release()>
			loader = null;
	//   36   70:aload_0         
	//   37   71:aconst_null     
	//   38   72:putfield        #334 <Field Loader loader>
		}
	//   39   75:return          
	}

	public void seekToUs(long l)
	{
		Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #297 <Field boolean prepared>
	//    2    4:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		boolean flag;
		if(enabledTrackCount > 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #299 <Field int enabledTrackCount>
	//*   5   11:ifle            20
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore          5
		else
	//*   8   17:goto            23
			flag = false;
	//    9   20:iconst_0        
	//   10   21:istore          5
		Assertions.checkState(flag);
	//   11   23:iload           5
	//   12   25:invokestatic    #480 <Method void Assertions.checkState(boolean)>
		if(chunkSource.isLive())
	//*  13   28:aload_0         
	//*  14   29:getfield        #101 <Field HlsChunkSource chunkSource>
	//*  15   32:invokevirtual   #511 <Method boolean HlsChunkSource.isLive()>
	//*  16   35:ifeq            40
			l = 0L;
	//   17   38:lconst_0        
	//   18   39:lstore_1        
		long l1;
		if(isPendingReset())
	//*  19   40:aload_0         
	//*  20   41:invokespecial   #293 <Method boolean isPendingReset()>
	//*  21   44:ifeq            55
			l1 = pendingResetPositionUs;
	//   22   47:aload_0         
	//   23   48:getfield        #115 <Field long pendingResetPositionUs>
	//   24   51:lstore_3        
		else
	//*  25   52:goto            60
			l1 = downstreamPositionUs;
	//   26   55:aload_0         
	//   27   56:getfield        #341 <Field long downstreamPositionUs>
	//   28   59:lstore_3        
		downstreamPositionUs = l;
	//   29   60:aload_0         
	//   30   61:lload_1         
	//   31   62:putfield        #341 <Field long downstreamPositionUs>
		lastSeekPositionUs = l;
	//   32   65:aload_0         
	//   33   66:lload_1         
	//   34   67:putfield        #461 <Field long lastSeekPositionUs>
		if(l1 == l)
	//*  35   70:lload_3         
	//*  36   71:lload_1         
	//*  37   72:lcmp            
	//*  38   73:ifne            77
		{
			return;
	//   39   76:return          
		} else
		{
			seekToInternal(l);
	//   40   77:aload_0         
	//   41   78:lload_1         
	//   42   79:invokespecial   #519 <Method void seekToInternal(long)>
			return;
	//   43   82:return          
		}
	}

	long usToMs(long l)
	{
		return l / 1000L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #309 <Long 1000L>
	//    2    4:ldiv            
	//    3    5:lreturn         
	}

	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
	private static final long NO_RESET_PENDING = 0x0L;
	private static final int PRIMARY_TYPE_AUDIO = 2;
	private static final int PRIMARY_TYPE_NONE = 0;
	private static final int PRIMARY_TYPE_TEXT = 1;
	private static final int PRIMARY_TYPE_VIDEO = 3;
	private final int bufferSizeContribution;
	private final ChunkOperationHolder chunkOperationHolder;
	private final HlsChunkSource chunkSource;
	private int chunkSourceTrackIndices[];
	private long currentLoadStartTimeMs;
	private Chunk currentLoadable;
	private IOException currentLoadableException;
	private int currentLoadableExceptionCount;
	private long currentLoadableExceptionTimestamp;
	private TsChunk currentTsLoadable;
	private Format downstreamFormat;
	private MediaFormat downstreamMediaFormats[];
	private long downstreamPositionUs;
	private int enabledTrackCount;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private final int eventSourceId;
	private boolean extractorTrackEnabledStates[];
	private int extractorTrackIndices[];
	private final LinkedList extractors;
	private long lastSeekPositionUs;
	private final LoadControl loadControl;
	private boolean loadControlRegistered;
	private Loader loader;
	private boolean loadingFinished;
	private final int minLoadableRetryCount;
	private boolean pendingDiscontinuities[];
	private long pendingResetPositionUs;
	private boolean prepared;
	private TsChunk previousTsLoadable;
	private int remainingReleaseCount;
	private int trackCount;
	private boolean trackEnabledStates[];
	private MediaFormat trackFormats[];


/*
	static int access$000(HlsSampleSource hlssamplesource)
	{
		return hlssamplesource.eventSourceId;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int eventSourceId>
	//    2    4:ireturn         
	}

*/


/*
	static EventListener access$100(HlsSampleSource hlssamplesource)
	{
		return hlssamplesource.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field HlsSampleSource$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
