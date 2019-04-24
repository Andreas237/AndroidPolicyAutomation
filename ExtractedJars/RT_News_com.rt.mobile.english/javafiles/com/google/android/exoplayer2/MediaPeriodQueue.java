// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2:
//			MediaPeriodHolder, MediaPeriodInfo, PlaybackInfo, Timeline, 
//			RendererCapabilities

final class MediaPeriodQueue
{

	public MediaPeriodQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class Timeline$Period>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Timeline$Period()>
	//    6   12:putfield        #35  <Field Timeline$Period period>
	//    7   15:aload_0         
	//    8   16:new             #37  <Class Timeline$Window>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void Timeline$Window()>
	//   11   23:putfield        #40  <Field Timeline$Window window>
	//   12   26:return          
	}

	private boolean canKeepMediaPeriodHolder(MediaPeriodHolder mediaperiodholder, MediaPeriodInfo mediaperiodinfo)
	{
		mediaperiodholder = ((MediaPeriodHolder) (mediaperiodholder.info));
	//    0    0:aload_1         
	//    1    1:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//    2    4:astore_1        
		return ((MediaPeriodInfo) (mediaperiodholder)).startPositionUs == mediaperiodinfo.startPositionUs && ((MediaPeriodInfo) (mediaperiodholder)).endPositionUs == mediaperiodinfo.endPositionUs && ((MediaPeriodInfo) (mediaperiodholder)).id.equals(((Object) (mediaperiodinfo.id)));
	//    3    5:aload_1         
	//    4    6:getfield        #54  <Field long MediaPeriodInfo.startPositionUs>
	//    5    9:aload_2         
	//    6   10:getfield        #54  <Field long MediaPeriodInfo.startPositionUs>
	//    7   13:lcmp            
	//    8   14:ifne            45
	//    9   17:aload_1         
	//   10   18:getfield        #57  <Field long MediaPeriodInfo.endPositionUs>
	//   11   21:aload_2         
	//   12   22:getfield        #57  <Field long MediaPeriodInfo.endPositionUs>
	//   13   25:lcmp            
	//   14   26:ifne            45
	//   15   29:aload_1         
	//   16   30:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   17   33:aload_2         
	//   18   34:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   19   37:invokevirtual   #67  <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.equals(Object)>
	//   20   40:ifeq            45
	//   21   43:iconst_1        
	//   22   44:ireturn         
	//   23   45:iconst_0        
	//   24   46:ireturn         
	}

	private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackinfo)
	{
		return getMediaPeriodInfo(playbackinfo.periodId, playbackinfo.contentPositionUs, playbackinfo.startPositionUs);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #74  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//    3    5:aload_1         
	//    4    6:getfield        #77  <Field long PlaybackInfo.contentPositionUs>
	//    5    9:aload_1         
	//    6   10:getfield        #78  <Field long PlaybackInfo.startPositionUs>
	//    7   13:invokespecial   #82  <Method MediaPeriodInfo getMediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//    8   16:areturn         
	}

	private MediaPeriodInfo getFollowingMediaPeriodInfo(MediaPeriodHolder mediaperiodholder, long l)
	{
		Object obj = ((Object) (mediaperiodholder.info));
	//    0    0:aload_1         
	//    1    1:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//    2    4:astore          11
		if(((MediaPeriodInfo) (obj)).isLastInTimelinePeriod)
	//*   3    6:aload           11
	//*   4    8:getfield        #88  <Field boolean MediaPeriodInfo.isLastInTimelinePeriod>
	//*   5   11:ifeq            275
		{
			int i = timeline.getNextPeriodIndex(((MediaPeriodInfo) (obj)).id.periodIndex, period, window, repeatMode, shuffleModeEnabled);
	//    6   14:aload_0         
	//    7   15:getfield        #90  <Field Timeline timeline>
	//    8   18:aload           11
	//    9   20:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   10   23:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   11   26:aload_0         
	//   12   27:getfield        #35  <Field Timeline$Period period>
	//   13   30:aload_0         
	//   14   31:getfield        #40  <Field Timeline$Window window>
	//   15   34:aload_0         
	//   16   35:getfield        #95  <Field int repeatMode>
	//   17   38:aload_0         
	//   18   39:getfield        #97  <Field boolean shuffleModeEnabled>
	//   19   42:invokevirtual   #103 <Method int Timeline.getNextPeriodIndex(int, Timeline$Period, Timeline$Window, int, boolean)>
	//   20   45:istore          4
			if(i == -1)
	//*  21   47:iload           4
	//*  22   49:iconst_m1       
	//*  23   50:icmpne          55
				return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
			int j1 = timeline.getPeriod(i, period, true).windowIndex;
	//   26   55:aload_0         
	//   27   56:getfield        #90  <Field Timeline timeline>
	//   28   59:iload           4
	//   29   61:aload_0         
	//   30   62:getfield        #35  <Field Timeline$Period period>
	//   31   65:iconst_1        
	//   32   66:invokevirtual   #107 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//   33   69:getfield        #110 <Field int Timeline$Period.windowIndex>
	//   34   72:istore          5
			Object obj1 = period.uid;
	//   35   74:aload_0         
	//   36   75:getfield        #35  <Field Timeline$Period period>
	//   37   78:getfield        #113 <Field Object Timeline$Period.uid>
	//   38   81:astore          12
			long l3 = ((MediaPeriodInfo) (obj)).id.windowSequenceNumber;
	//   39   83:aload           11
	//   40   85:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   41   88:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//   42   91:lstore          9
			int j2 = timeline.getWindow(j1, window).firstPeriodIndex;
	//   43   93:aload_0         
	//   44   94:getfield        #90  <Field Timeline timeline>
	//   45   97:iload           5
	//   46   99:aload_0         
	//   47  100:getfield        #40  <Field Timeline$Window window>
	//   48  103:invokevirtual   #120 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window)>
	//   49  106:getfield        #123 <Field int Timeline$Window.firstPeriodIndex>
	//   50  109:istore          6
			long l2 = 0L;
	//   51  111:lconst_0        
	//   52  112:lstore          7
			if(j2 == i)
	//*  53  114:iload           6
	//*  54  116:iload           4
	//*  55  118:icmpne          254
			{
				l2 = mediaperiodholder.getRendererOffset();
	//   56  121:aload_1         
	//   57  122:invokevirtual   #127 <Method long MediaPeriodHolder.getRendererOffset()>
	//   58  125:lstore          7
				l3 = ((MediaPeriodInfo) (obj)).durationUs;
	//   59  127:aload           11
	//   60  129:getfield        #130 <Field long MediaPeriodInfo.durationUs>
	//   61  132:lstore          9
				obj = ((Object) (timeline.getPeriodPosition(window, period, j1, 0x1L, Math.max(0L, (l2 + l3) - l))));
	//   62  134:aload_0         
	//   63  135:getfield        #90  <Field Timeline timeline>
	//   64  138:aload_0         
	//   65  139:getfield        #40  <Field Timeline$Window window>
	//   66  142:aload_0         
	//   67  143:getfield        #35  <Field Timeline$Period period>
	//   68  146:iload           5
	//   69  148:ldc2w           #131 <Long 0x1L>
	//   70  151:lconst_0        
	//   71  152:lload           7
	//   72  154:lload           9
	//   73  156:ladd            
	//   74  157:lload_2         
	//   75  158:lsub            
	//   76  159:invokestatic    #138 <Method long Math.max(long, long)>
	//   77  162:invokevirtual   #142 <Method Pair Timeline.getPeriodPosition(Timeline$Window, Timeline$Period, int, long, long)>
	//   78  165:astore          11
				if(obj == null)
	//*  79  167:aload           11
	//*  80  169:ifnonnull       174
					return null;
	//   81  172:aconst_null     
	//   82  173:areturn         
				i = ((Integer)((Pair) (obj)).first).intValue();
	//   83  174:aload           11
	//   84  176:getfield        #147 <Field Object Pair.first>
	//   85  179:checkcast       #149 <Class Integer>
	//   86  182:invokevirtual   #153 <Method int Integer.intValue()>
	//   87  185:istore          4
				l2 = ((Long)((Pair) (obj)).second).longValue();
	//   88  187:aload           11
	//   89  189:getfield        #156 <Field Object Pair.second>
	//   90  192:checkcast       #158 <Class Long>
	//   91  195:invokevirtual   #161 <Method long Long.longValue()>
	//   92  198:lstore          7
				if(mediaperiodholder.next != null && mediaperiodholder.next.uid.equals(obj1))
	//*  93  200:aload_1         
	//*  94  201:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*  95  204:ifnull          239
	//*  96  207:aload_1         
	//*  97  208:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*  98  211:getfield        #165 <Field Object MediaPeriodHolder.uid>
	//*  99  214:aload           12
	//* 100  216:invokevirtual   #166 <Method boolean Object.equals(Object)>
	//* 101  219:ifeq            239
				{
					l = mediaperiodholder.next.info.id.windowSequenceNumber;
	//  102  222:aload_1         
	//  103  223:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//  104  226:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//  105  229:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//  106  232:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//  107  235:lstore_2        
				} else
	//* 108  236:goto            251
				{
					l = nextWindowSequenceNumber;
	//  109  239:aload_0         
	//  110  240:getfield        #168 <Field long nextWindowSequenceNumber>
	//  111  243:lstore_2        
					nextWindowSequenceNumber = l + 1L;
	//  112  244:aload_0         
	//  113  245:lload_2         
	//  114  246:lconst_1        
	//  115  247:ladd            
	//  116  248:putfield        #168 <Field long nextWindowSequenceNumber>
				}
			} else
	//* 117  251:goto            257
			{
				l = l3;
	//  118  254:lload           9
	//  119  256:lstore_2        
			}
			return getMediaPeriodInfo(resolveMediaPeriodIdForAds(i, l2, l), l2, l2);
	//  120  257:aload_0         
	//  121  258:aload_0         
	//  122  259:iload           4
	//  123  261:lload           7
	//  124  263:lload_2         
	//  125  264:invokespecial   #172 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId resolveMediaPeriodIdForAds(int, long, long)>
	//  126  267:lload           7
	//  127  269:lload           7
	//  128  271:invokespecial   #82  <Method MediaPeriodInfo getMediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//  129  274:areturn         
		}
		mediaperiodholder = ((MediaPeriodHolder) (((MediaPeriodInfo) (obj)).id));
	//  130  275:aload           11
	//  131  277:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//  132  280:astore_1        
		timeline.getPeriod(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).periodIndex, period);
	//  133  281:aload_0         
	//  134  282:getfield        #90  <Field Timeline timeline>
	//  135  285:aload_1         
	//  136  286:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//  137  289:aload_0         
	//  138  290:getfield        #35  <Field Timeline$Period period>
	//  139  293:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//  140  296:pop             
		if(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).isAd())
	//* 141  297:aload_1         
	//* 142  298:invokevirtual   #179 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//* 143  301:ifeq            407
		{
			int j = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).adGroupIndex;
	//  144  304:aload_1         
	//  145  305:getfield        #182 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//  146  308:istore          4
			int k1 = period.getAdCountInAdGroup(j);
	//  147  310:aload_0         
	//  148  311:getfield        #35  <Field Timeline$Period period>
	//  149  314:iload           4
	//  150  316:invokevirtual   #186 <Method int Timeline$Period.getAdCountInAdGroup(int)>
	//  151  319:istore          5
			if(k1 == -1)
	//* 152  321:iload           5
	//* 153  323:iconst_m1       
	//* 154  324:icmpne          329
				return null;
	//  155  327:aconst_null     
	//  156  328:areturn         
			int k2 = period.getNextAdIndexToPlay(j, ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).adIndexInAdGroup);
	//  157  329:aload_0         
	//  158  330:getfield        #35  <Field Timeline$Period period>
	//  159  333:iload           4
	//  160  335:aload_1         
	//  161  336:getfield        #189 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//  162  339:invokevirtual   #193 <Method int Timeline$Period.getNextAdIndexToPlay(int, int)>
	//  163  342:istore          6
			if(k2 < k1)
	//* 164  344:iload           6
	//* 165  346:iload           5
	//* 166  348:icmpge          389
			{
				if(!period.isAdAvailable(j, k2))
	//* 167  351:aload_0         
	//* 168  352:getfield        #35  <Field Timeline$Period period>
	//* 169  355:iload           4
	//* 170  357:iload           6
	//* 171  359:invokevirtual   #197 <Method boolean Timeline$Period.isAdAvailable(int, int)>
	//* 172  362:ifne            367
					return null;
	//  173  365:aconst_null     
	//  174  366:areturn         
				else
					return getMediaPeriodInfoForAd(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).periodIndex, j, k2, ((MediaPeriodInfo) (obj)).contentPositionUs, ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).windowSequenceNumber);
	//  175  367:aload_0         
	//  176  368:aload_1         
	//  177  369:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//  178  372:iload           4
	//  179  374:iload           6
	//  180  376:aload           11
	//  181  378:getfield        #198 <Field long MediaPeriodInfo.contentPositionUs>
	//  182  381:aload_1         
	//  183  382:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//  184  385:invokespecial   #202 <Method MediaPeriodInfo getMediaPeriodInfoForAd(int, int, int, long, long)>
	//  185  388:areturn         
			} else
			{
				return getMediaPeriodInfoForContent(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).periodIndex, ((MediaPeriodInfo) (obj)).contentPositionUs, ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).windowSequenceNumber);
	//  186  389:aload_0         
	//  187  390:aload_1         
	//  188  391:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//  189  394:aload           11
	//  190  396:getfield        #198 <Field long MediaPeriodInfo.contentPositionUs>
	//  191  399:aload_1         
	//  192  400:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//  193  403:invokespecial   #206 <Method MediaPeriodInfo getMediaPeriodInfoForContent(int, long, long)>
	//  194  406:areturn         
			}
		}
		if(((MediaPeriodInfo) (obj)).endPositionUs != 0x0L)
	//* 195  407:aload           11
	//* 196  409:getfield        #57  <Field long MediaPeriodInfo.endPositionUs>
	//* 197  412:ldc2w           #207 <Long 0x0L>
	//* 198  415:lcmp            
	//* 199  416:ifeq            506
		{
			int k = period.getAdGroupIndexForPositionUs(((MediaPeriodInfo) (obj)).endPositionUs);
	//  200  419:aload_0         
	//  201  420:getfield        #35  <Field Timeline$Period period>
	//  202  423:aload           11
	//  203  425:getfield        #57  <Field long MediaPeriodInfo.endPositionUs>
	//  204  428:invokevirtual   #212 <Method int Timeline$Period.getAdGroupIndexForPositionUs(long)>
	//  205  431:istore          4
			if(k == -1)
	//* 206  433:iload           4
	//* 207  435:iconst_m1       
	//* 208  436:icmpne          457
				return getMediaPeriodInfoForContent(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).periodIndex, ((MediaPeriodInfo) (obj)).endPositionUs, ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).windowSequenceNumber);
	//  209  439:aload_0         
	//  210  440:aload_1         
	//  211  441:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//  212  444:aload           11
	//  213  446:getfield        #57  <Field long MediaPeriodInfo.endPositionUs>
	//  214  449:aload_1         
	//  215  450:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//  216  453:invokespecial   #206 <Method MediaPeriodInfo getMediaPeriodInfoForContent(int, long, long)>
	//  217  456:areturn         
			int l1 = period.getFirstAdIndexToPlay(k);
	//  218  457:aload_0         
	//  219  458:getfield        #35  <Field Timeline$Period period>
	//  220  461:iload           4
	//  221  463:invokevirtual   #215 <Method int Timeline$Period.getFirstAdIndexToPlay(int)>
	//  222  466:istore          5
			if(!period.isAdAvailable(k, l1))
	//* 223  468:aload_0         
	//* 224  469:getfield        #35  <Field Timeline$Period period>
	//* 225  472:iload           4
	//* 226  474:iload           5
	//* 227  476:invokevirtual   #197 <Method boolean Timeline$Period.isAdAvailable(int, int)>
	//* 228  479:ifne            484
				return null;
	//  229  482:aconst_null     
	//  230  483:areturn         
			else
				return getMediaPeriodInfoForAd(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).periodIndex, k, l1, ((MediaPeriodInfo) (obj)).endPositionUs, ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).windowSequenceNumber);
	//  231  484:aload_0         
	//  232  485:aload_1         
	//  233  486:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//  234  489:iload           4
	//  235  491:iload           5
	//  236  493:aload           11
	//  237  495:getfield        #57  <Field long MediaPeriodInfo.endPositionUs>
	//  238  498:aload_1         
	//  239  499:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//  240  502:invokespecial   #202 <Method MediaPeriodInfo getMediaPeriodInfoForAd(int, int, int, long, long)>
	//  241  505:areturn         
		}
		int i1 = period.getAdGroupCount();
	//  242  506:aload_0         
	//  243  507:getfield        #35  <Field Timeline$Period period>
	//  244  510:invokevirtual   #218 <Method int Timeline$Period.getAdGroupCount()>
	//  245  513:istore          4
		if(i1 == 0)
	//* 246  515:iload           4
	//* 247  517:ifne            522
			return null;
	//  248  520:aconst_null     
	//  249  521:areturn         
		i1--;
	//  250  522:iload           4
	//  251  524:iconst_1        
	//  252  525:isub            
	//  253  526:istore          4
		if(period.getAdGroupTimeUs(i1) == 0x0L)
	//* 254  528:aload_0         
	//* 255  529:getfield        #35  <Field Timeline$Period period>
	//* 256  532:iload           4
	//* 257  534:invokevirtual   #222 <Method long Timeline$Period.getAdGroupTimeUs(int)>
	//* 258  537:ldc2w           #207 <Long 0x0L>
	//* 259  540:lcmp            
	//* 260  541:ifne            611
		{
			if(period.hasPlayedAdGroup(i1))
	//* 261  544:aload_0         
	//* 262  545:getfield        #35  <Field Timeline$Period period>
	//* 263  548:iload           4
	//* 264  550:invokevirtual   #226 <Method boolean Timeline$Period.hasPlayedAdGroup(int)>
	//* 265  553:ifeq            558
				return null;
	//  266  556:aconst_null     
	//  267  557:areturn         
			int i2 = period.getFirstAdIndexToPlay(i1);
	//  268  558:aload_0         
	//  269  559:getfield        #35  <Field Timeline$Period period>
	//  270  562:iload           4
	//  271  564:invokevirtual   #215 <Method int Timeline$Period.getFirstAdIndexToPlay(int)>
	//  272  567:istore          5
			if(!period.isAdAvailable(i1, i2))
	//* 273  569:aload_0         
	//* 274  570:getfield        #35  <Field Timeline$Period period>
	//* 275  573:iload           4
	//* 276  575:iload           5
	//* 277  577:invokevirtual   #197 <Method boolean Timeline$Period.isAdAvailable(int, int)>
	//* 278  580:ifne            585
			{
				return null;
	//  279  583:aconst_null     
	//  280  584:areturn         
			} else
			{
				l = period.getDurationUs();
	//  281  585:aload_0         
	//  282  586:getfield        #35  <Field Timeline$Period period>
	//  283  589:invokevirtual   #229 <Method long Timeline$Period.getDurationUs()>
	//  284  592:lstore_2        
				return getMediaPeriodInfoForAd(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).periodIndex, i1, i2, l, ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder)).windowSequenceNumber);
	//  285  593:aload_0         
	//  286  594:aload_1         
	//  287  595:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//  288  598:iload           4
	//  289  600:iload           5
	//  290  602:lload_2         
	//  291  603:aload_1         
	//  292  604:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//  293  607:invokespecial   #202 <Method MediaPeriodInfo getMediaPeriodInfoForAd(int, int, int, long, long)>
	//  294  610:areturn         
			}
		} else
		{
			return null;
	//  295  611:aconst_null     
	//  296  612:areturn         
		}
	}

	private MediaPeriodInfo getMediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l, long l1)
	{
		timeline.getPeriod(mediaperiodid.periodIndex, period);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Timeline timeline>
	//    2    4:aload_1         
	//    3    5:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Timeline$Period period>
	//    6   12:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//    7   15:pop             
		if(mediaperiodid.isAd())
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #179 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*  10   20:ifeq            65
		{
			if(!period.isAdAvailable(mediaperiodid.adGroupIndex, mediaperiodid.adIndexInAdGroup))
	//*  11   23:aload_0         
	//*  12   24:getfield        #35  <Field Timeline$Period period>
	//*  13   27:aload_1         
	//*  14   28:getfield        #182 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//*  15   31:aload_1         
	//*  16   32:getfield        #189 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//*  17   35:invokevirtual   #197 <Method boolean Timeline$Period.isAdAvailable(int, int)>
	//*  18   38:ifne            43
				return null;
	//   19   41:aconst_null     
	//   20   42:areturn         
			else
				return getMediaPeriodInfoForAd(mediaperiodid.periodIndex, mediaperiodid.adGroupIndex, mediaperiodid.adIndexInAdGroup, l, mediaperiodid.windowSequenceNumber);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   24   48:aload_1         
	//   25   49:getfield        #182 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//   26   52:aload_1         
	//   27   53:getfield        #189 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//   28   56:lload_2         
	//   29   57:aload_1         
	//   30   58:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//   31   61:invokespecial   #202 <Method MediaPeriodInfo getMediaPeriodInfoForAd(int, int, int, long, long)>
	//   32   64:areturn         
		} else
		{
			return getMediaPeriodInfoForContent(mediaperiodid.periodIndex, l1, mediaperiodid.windowSequenceNumber);
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   36   70:lload           4
	//   37   72:aload_1         
	//   38   73:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//   39   76:invokespecial   #206 <Method MediaPeriodInfo getMediaPeriodInfoForContent(int, long, long)>
	//   40   79:areturn         
		}
	}

	private MediaPeriodInfo getMediaPeriodInfoForAd(int i, int j, int k, long l, long l1)
	{
		com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(i, j, k, l1);
	//    0    0:new             #63  <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:lload           6
	//    6    9:invokespecial   #233 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int, int, int, long)>
	//    7   12:astore          12
		boolean flag = isLastInPeriod(mediaperiodid, 0x0L);
	//    8   14:aload_0         
	//    9   15:aload           12
	//   10   17:ldc2w           #207 <Long 0x0L>
	//   11   20:invokespecial   #237 <Method boolean isLastInPeriod(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//   12   23:istore          10
		boolean flag1 = isLastInTimeline(mediaperiodid, flag);
	//   13   25:aload_0         
	//   14   26:aload           12
	//   15   28:iload           10
	//   16   30:invokespecial   #241 <Method boolean isLastInTimeline(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, boolean)>
	//   17   33:istore          11
		long l2 = timeline.getPeriod(mediaperiodid.periodIndex, period).getAdDurationUs(mediaperiodid.adGroupIndex, mediaperiodid.adIndexInAdGroup);
	//   18   35:aload_0         
	//   19   36:getfield        #90  <Field Timeline timeline>
	//   20   39:aload           12
	//   21   41:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   22   44:aload_0         
	//   23   45:getfield        #35  <Field Timeline$Period period>
	//   24   48:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   25   51:aload           12
	//   26   53:getfield        #182 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//   27   56:aload           12
	//   28   58:getfield        #189 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//   29   61:invokevirtual   #245 <Method long Timeline$Period.getAdDurationUs(int, int)>
	//   30   64:lstore          8
		if(k == period.getFirstAdIndexToPlay(j))
	//*  31   66:iload_3         
	//*  32   67:aload_0         
	//*  33   68:getfield        #35  <Field Timeline$Period period>
	//*  34   71:iload_2         
	//*  35   72:invokevirtual   #215 <Method int Timeline$Period.getFirstAdIndexToPlay(int)>
	//*  36   75:icmpne          90
			l1 = period.getAdResumePositionUs();
	//   37   78:aload_0         
	//   38   79:getfield        #35  <Field Timeline$Period period>
	//   39   82:invokevirtual   #248 <Method long Timeline$Period.getAdResumePositionUs()>
	//   40   85:lstore          6
		else
	//*  41   87:goto            96
			l1 = 0L;
	//   42   90:lconst_0        
	//   43   91:lstore          6
	//*  44   93:goto            87
		return new MediaPeriodInfo(mediaperiodid, l1, 0x0L, l, l2, flag, flag1);
	//   45   96:new             #51  <Class MediaPeriodInfo>
	//   46   99:dup             
	//   47  100:aload           12
	//   48  102:lload           6
	//   49  104:ldc2w           #207 <Long 0x0L>
	//   50  107:lload           4
	//   51  109:lload           8
	//   52  111:iload           10
	//   53  113:iload           11
	//   54  115:invokespecial   #251 <Method void MediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, long, long, boolean, boolean)>
	//   55  118:areturn         
	}

	private MediaPeriodInfo getMediaPeriodInfoForContent(int i, long l, long l1)
	{
		com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(i, l1);
	//    0    0:new             #63  <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:lload           4
	//    4    7:invokespecial   #254 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int, long)>
	//    5   10:astore          10
		timeline.getPeriod(mediaperiodid.periodIndex, period);
	//    6   12:aload_0         
	//    7   13:getfield        #90  <Field Timeline timeline>
	//    8   16:aload           10
	//    9   18:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   10   21:aload_0         
	//   11   22:getfield        #35  <Field Timeline$Period period>
	//   12   25:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   13   28:pop             
		i = period.getAdGroupIndexAfterPositionUs(l);
	//   14   29:aload_0         
	//   15   30:getfield        #35  <Field Timeline$Period period>
	//   16   33:lload_2         
	//   17   34:invokevirtual   #257 <Method int Timeline$Period.getAdGroupIndexAfterPositionUs(long)>
	//   18   37:istore_1        
		if(i == -1)
	//*  19   38:iload_1         
	//*  20   39:iconst_m1       
	//*  21   40:icmpne          51
			l1 = 0x0L;
	//   22   43:ldc2w           #207 <Long 0x0L>
	//   23   46:lstore          4
		else
	//*  24   48:goto            61
			l1 = period.getAdGroupTimeUs(i);
	//   25   51:aload_0         
	//   26   52:getfield        #35  <Field Timeline$Period period>
	//   27   55:iload_1         
	//   28   56:invokevirtual   #222 <Method long Timeline$Period.getAdGroupTimeUs(int)>
	//   29   59:lstore          4
		boolean flag = isLastInPeriod(mediaperiodid, l1);
	//   30   61:aload_0         
	//   31   62:aload           10
	//   32   64:lload           4
	//   33   66:invokespecial   #237 <Method boolean isLastInPeriod(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//   34   69:istore          8
		boolean flag1 = isLastInTimeline(mediaperiodid, flag);
	//   35   71:aload_0         
	//   36   72:aload           10
	//   37   74:iload           8
	//   38   76:invokespecial   #241 <Method boolean isLastInTimeline(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, boolean)>
	//   39   79:istore          9
		long l2;
		if(l1 == 0x0L)
	//*  40   81:lload           4
	//*  41   83:ldc2w           #207 <Long 0x0L>
	//*  42   86:lcmp            
	//*  43   87:ifne            102
			l2 = period.getDurationUs();
	//   44   90:aload_0         
	//   45   91:getfield        #35  <Field Timeline$Period period>
	//   46   94:invokevirtual   #229 <Method long Timeline$Period.getDurationUs()>
	//   47   97:lstore          6
		else
	//*  48   99:goto            106
			l2 = l1;
	//   49  102:lload           4
	//   50  104:lstore          6
		return new MediaPeriodInfo(mediaperiodid, l, l1, 0x1L, l2, flag, flag1);
	//   51  106:new             #51  <Class MediaPeriodInfo>
	//   52  109:dup             
	//   53  110:aload           10
	//   54  112:lload_2         
	//   55  113:lload           4
	//   56  115:ldc2w           #131 <Long 0x1L>
	//   57  118:lload           6
	//   58  120:iload           8
	//   59  122:iload           9
	//   60  124:invokespecial   #251 <Method void MediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, long, long, boolean, boolean)>
	//   61  127:areturn         
	}

	private MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo mediaperiodinfo, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		long l2 = mediaperiodinfo.startPositionUs;
	//    0    0:aload_1         
	//    1    1:getfield        #54  <Field long MediaPeriodInfo.startPositionUs>
	//    2    4:lstore          7
		long l1 = mediaperiodinfo.endPositionUs;
	//    3    6:aload_1         
	//    4    7:getfield        #57  <Field long MediaPeriodInfo.endPositionUs>
	//    5   10:lstore          5
		boolean flag = isLastInPeriod(mediaperiodid, l1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:lload           5
	//    9   16:invokespecial   #237 <Method boolean isLastInPeriod(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//   10   19:istore          9
		boolean flag1 = isLastInTimeline(mediaperiodid, flag);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:iload           9
	//   14   25:invokespecial   #241 <Method boolean isLastInTimeline(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, boolean)>
	//   15   28:istore          10
		timeline.getPeriod(mediaperiodid.periodIndex, period);
	//   16   30:aload_0         
	//   17   31:getfield        #90  <Field Timeline timeline>
	//   18   34:aload_2         
	//   19   35:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   20   38:aload_0         
	//   21   39:getfield        #35  <Field Timeline$Period period>
	//   22   42:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   23   45:pop             
		long l;
		if(mediaperiodid.isAd())
	//*  24   46:aload_2         
	//*  25   47:invokevirtual   #179 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*  26   50:ifeq            72
			l = period.getAdDurationUs(mediaperiodid.adGroupIndex, mediaperiodid.adIndexInAdGroup);
	//   27   53:aload_0         
	//   28   54:getfield        #35  <Field Timeline$Period period>
	//   29   57:aload_2         
	//   30   58:getfield        #182 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//   31   61:aload_2         
	//   32   62:getfield        #189 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//   33   65:invokevirtual   #245 <Method long Timeline$Period.getAdDurationUs(int, int)>
	//   34   68:lstore_3        
		else
	//*  35   69:goto            95
		if(l1 == 0x0L)
	//*  36   72:lload           5
	//*  37   74:ldc2w           #207 <Long 0x0L>
	//*  38   77:lcmp            
	//*  39   78:ifne            92
			l = period.getDurationUs();
	//   40   81:aload_0         
	//   41   82:getfield        #35  <Field Timeline$Period period>
	//   42   85:invokevirtual   #229 <Method long Timeline$Period.getDurationUs()>
	//   43   88:lstore_3        
		else
	//*  44   89:goto            69
			l = l1;
	//   45   92:lload           5
	//   46   94:lstore_3        
		return new MediaPeriodInfo(mediaperiodid, l2, l1, mediaperiodinfo.contentPositionUs, l, flag, flag1);
	//   47   95:new             #51  <Class MediaPeriodInfo>
	//   48   98:dup             
	//   49   99:aload_2         
	//   50  100:lload           7
	//   51  102:lload           5
	//   52  104:aload_1         
	//   53  105:getfield        #198 <Field long MediaPeriodInfo.contentPositionUs>
	//   54  108:lload_3         
	//   55  109:iload           9
	//   56  111:iload           10
	//   57  113:invokespecial   #251 <Method void MediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, long, long, boolean, boolean)>
	//   58  116:areturn         
	}

	private boolean isLastInPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l)
	{
		int i = timeline.getPeriod(mediaperiodid.periodIndex, period).getAdGroupCount();
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Timeline timeline>
	//    2    4:aload_1         
	//    3    5:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Timeline$Period period>
	//    6   12:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//    7   15:invokevirtual   #218 <Method int Timeline$Period.getAdGroupCount()>
	//    8   18:istore          4
		boolean flag1 = true;
	//    9   20:iconst_1        
	//   10   21:istore          7
		if(i == 0)
	//*  11   23:iload           4
	//*  12   25:ifne            30
			return true;
	//   13   28:iconst_1        
	//   14   29:ireturn         
		int j = i - 1;
	//   15   30:iload           4
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore          5
		boolean flag2 = mediaperiodid.isAd();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #179 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//   21   40:istore          8
		if(period.getAdGroupTimeUs(j) != 0x0L)
	//*  22   42:aload_0         
	//*  23   43:getfield        #35  <Field Timeline$Period period>
	//*  24   46:iload           5
	//*  25   48:invokevirtual   #222 <Method long Timeline$Period.getAdGroupTimeUs(int)>
	//*  26   51:ldc2w           #207 <Long 0x0L>
	//*  27   54:lcmp            
	//*  28   55:ifeq            75
			return !flag2 && l == 0x0L;
	//   29   58:iload           8
	//   30   60:ifne            73
	//   31   63:lload_2         
	//   32   64:ldc2w           #207 <Long 0x0L>
	//   33   67:lcmp            
	//   34   68:ifne            73
	//   35   71:iconst_1        
	//   36   72:ireturn         
	//   37   73:iconst_0        
	//   38   74:ireturn         
		int k = period.getAdCountInAdGroup(j);
	//   39   75:aload_0         
	//   40   76:getfield        #35  <Field Timeline$Period period>
	//   41   79:iload           5
	//   42   81:invokevirtual   #186 <Method int Timeline$Period.getAdCountInAdGroup(int)>
	//   43   84:istore          6
		if(k == -1)
	//*  44   86:iload           6
	//*  45   88:iconst_m1       
	//*  46   89:icmpne          94
			return false;
	//   47   92:iconst_0        
	//   48   93:ireturn         
		boolean flag;
		if(flag2 && mediaperiodid.adGroupIndex == j && mediaperiodid.adIndexInAdGroup == k - 1)
	//*  49   94:iload           8
	//*  50   96:ifeq            125
	//*  51   99:aload_1         
	//*  52  100:getfield        #182 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//*  53  103:iload           5
	//*  54  105:icmpne          125
	//*  55  108:aload_1         
	//*  56  109:getfield        #189 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//*  57  112:iload           6
	//*  58  114:iconst_1        
	//*  59  115:isub            
	//*  60  116:icmpne          125
			flag = true;
	//   61  119:iconst_1        
	//   62  120:istore          4
		else
	//*  63  122:goto            128
			flag = false;
	//   64  125:iconst_0        
	//   65  126:istore          4
		if(!flag)
	//*  66  128:iload           4
	//*  67  130:ifne            157
		{
			if(!flag2 && period.getFirstAdIndexToPlay(j) == k)
	//*  68  133:iload           8
	//*  69  135:ifne            154
	//*  70  138:aload_0         
	//*  71  139:getfield        #35  <Field Timeline$Period period>
	//*  72  142:iload           5
	//*  73  144:invokevirtual   #215 <Method int Timeline$Period.getFirstAdIndexToPlay(int)>
	//*  74  147:iload           6
	//*  75  149:icmpne          154
				return true;
	//   76  152:iconst_1        
	//   77  153:ireturn         
			flag1 = false;
	//   78  154:iconst_0        
	//   79  155:istore          7
		}
		return flag1;
	//   80  157:iload           7
	//   81  159:ireturn         
	}

	private boolean isLastInTimeline(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, boolean flag)
	{
		int i = timeline.getPeriod(mediaperiodid.periodIndex, period).windowIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Timeline timeline>
	//    2    4:aload_1         
	//    3    5:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Timeline$Period period>
	//    6   12:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//    7   15:getfield        #110 <Field int Timeline$Period.windowIndex>
	//    8   18:istore_3        
		return !timeline.getWindow(i, window).isDynamic && timeline.isLastPeriod(mediaperiodid.periodIndex, period, window, repeatMode, shuffleModeEnabled) && flag;
	//    9   19:aload_0         
	//   10   20:getfield        #90  <Field Timeline timeline>
	//   11   23:iload_3         
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field Timeline$Window window>
	//   14   28:invokevirtual   #120 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window)>
	//   15   31:getfield        #262 <Field boolean Timeline$Window.isDynamic>
	//   16   34:ifne            73
	//   17   37:aload_0         
	//   18   38:getfield        #90  <Field Timeline timeline>
	//   19   41:aload_1         
	//   20   42:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   21   45:aload_0         
	//   22   46:getfield        #35  <Field Timeline$Period period>
	//   23   49:aload_0         
	//   24   50:getfield        #40  <Field Timeline$Window window>
	//   25   53:aload_0         
	//   26   54:getfield        #95  <Field int repeatMode>
	//   27   57:aload_0         
	//   28   58:getfield        #97  <Field boolean shuffleModeEnabled>
	//   29   61:invokevirtual   #266 <Method boolean Timeline.isLastPeriod(int, Timeline$Period, Timeline$Window, int, boolean)>
	//   30   64:ifeq            73
	//   31   67:iload_2         
	//   32   68:ifeq            73
	//   33   71:iconst_1        
	//   34   72:ireturn         
	//   35   73:iconst_0        
	//   36   74:ireturn         
	}

	private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(int i, long l, long l1)
	{
		timeline.getPeriod(i, period);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field Timeline$Period period>
	//    5    9:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//    6   12:pop             
		int j = period.getAdGroupIndexForPositionUs(l);
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field Timeline$Period period>
	//    9   17:lload_2         
	//   10   18:invokevirtual   #212 <Method int Timeline$Period.getAdGroupIndexForPositionUs(long)>
	//   11   21:istore          6
		if(j == -1)
	//*  12   23:iload           6
	//*  13   25:iconst_m1       
	//*  14   26:icmpne          40
			return new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(i, l1);
	//   15   29:new             #63  <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//   16   32:dup             
	//   17   33:iload_1         
	//   18   34:lload           4
	//   19   36:invokespecial   #254 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int, long)>
	//   20   39:areturn         
		else
			return new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(i, j, period.getFirstAdIndexToPlay(j), l1);
	//   21   40:new             #63  <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//   22   43:dup             
	//   23   44:iload_1         
	//   24   45:iload           6
	//   25   47:aload_0         
	//   26   48:getfield        #35  <Field Timeline$Period period>
	//   27   51:iload           6
	//   28   53:invokevirtual   #215 <Method int Timeline$Period.getFirstAdIndexToPlay(int)>
	//   29   56:lload           4
	//   30   58:invokespecial   #233 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int, int, int, long)>
	//   31   61:areturn         
	}

	private long resolvePeriodIndexToWindowSequenceNumber(int i)
	{
		Object obj = timeline.getPeriod(i, period, true).uid;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field Timeline$Period period>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #107 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//    7   13:getfield        #113 <Field Object Timeline$Period.uid>
	//    8   16:astore          6
		i = period.windowIndex;
	//    9   18:aload_0         
	//   10   19:getfield        #35  <Field Timeline$Period period>
	//   11   22:getfield        #110 <Field int Timeline$Period.windowIndex>
	//   12   25:istore_1        
		if(oldFrontPeriodUid != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #269 <Field Object oldFrontPeriodUid>
	//*  15   30:ifnull          74
		{
			int j = timeline.getIndexOfPeriod(oldFrontPeriodUid);
	//   16   33:aload_0         
	//   17   34:getfield        #90  <Field Timeline timeline>
	//   18   37:aload_0         
	//   19   38:getfield        #269 <Field Object oldFrontPeriodUid>
	//   20   41:invokevirtual   #273 <Method int Timeline.getIndexOfPeriod(Object)>
	//   21   44:istore_2        
			if(j != -1 && timeline.getPeriod(j, period).windowIndex == i)
	//*  22   45:iload_2         
	//*  23   46:iconst_m1       
	//*  24   47:icmpeq          74
	//*  25   50:aload_0         
	//*  26   51:getfield        #90  <Field Timeline timeline>
	//*  27   54:iload_2         
	//*  28   55:aload_0         
	//*  29   56:getfield        #35  <Field Timeline$Period period>
	//*  30   59:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//*  31   62:getfield        #110 <Field int Timeline$Period.windowIndex>
	//*  32   65:iload_1         
	//*  33   66:icmpne          74
				return oldFrontPeriodWindowSequenceNumber;
	//   34   69:aload_0         
	//   35   70:getfield        #275 <Field long oldFrontPeriodWindowSequenceNumber>
	//   36   73:lreturn         
		}
		for(MediaPeriodHolder mediaperiodholder = getFrontPeriod(); mediaperiodholder != null; mediaperiodholder = mediaperiodholder.next)
	//*  37   74:aload_0         
	//*  38   75:invokevirtual   #279 <Method MediaPeriodHolder getFrontPeriod()>
	//*  39   78:astore          5
	//*  40   80:aload           5
	//*  41   82:ifnull          120
			if(mediaperiodholder.uid.equals(obj))
	//*  42   85:aload           5
	//*  43   87:getfield        #165 <Field Object MediaPeriodHolder.uid>
	//*  44   90:aload           6
	//*  45   92:invokevirtual   #166 <Method boolean Object.equals(Object)>
	//*  46   95:ifeq            110
				return mediaperiodholder.info.id.windowSequenceNumber;
	//   47   98:aload           5
	//   48  100:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   49  103:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   50  106:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//   51  109:lreturn         

	//   52  110:aload           5
	//   53  112:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   54  115:astore          5
	//*  55  117:goto            80
		for(MediaPeriodHolder mediaperiodholder1 = getFrontPeriod(); mediaperiodholder1 != null; mediaperiodholder1 = mediaperiodholder1.next)
	//*  56  120:aload_0         
	//*  57  121:invokevirtual   #279 <Method MediaPeriodHolder getFrontPeriod()>
	//*  58  124:astore          5
	//*  59  126:aload           5
	//*  60  128:ifnull          190
		{
			int k = timeline.getIndexOfPeriod(mediaperiodholder1.uid);
	//   61  131:aload_0         
	//   62  132:getfield        #90  <Field Timeline timeline>
	//   63  135:aload           5
	//   64  137:getfield        #165 <Field Object MediaPeriodHolder.uid>
	//   65  140:invokevirtual   #273 <Method int Timeline.getIndexOfPeriod(Object)>
	//   66  143:istore_2        
			if(k != -1 && timeline.getPeriod(k, period).windowIndex == i)
	//*  67  144:iload_2         
	//*  68  145:iconst_m1       
	//*  69  146:icmpeq          180
	//*  70  149:aload_0         
	//*  71  150:getfield        #90  <Field Timeline timeline>
	//*  72  153:iload_2         
	//*  73  154:aload_0         
	//*  74  155:getfield        #35  <Field Timeline$Period period>
	//*  75  158:invokevirtual   #175 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//*  76  161:getfield        #110 <Field int Timeline$Period.windowIndex>
	//*  77  164:iload_1         
	//*  78  165:icmpne          180
				return mediaperiodholder1.info.id.windowSequenceNumber;
	//   79  168:aload           5
	//   80  170:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   81  173:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   82  176:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//   83  179:lreturn         
		}

	//   84  180:aload           5
	//   85  182:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   86  185:astore          5
	//*  87  187:goto            126
		long l = nextWindowSequenceNumber;
	//   88  190:aload_0         
	//   89  191:getfield        #168 <Field long nextWindowSequenceNumber>
	//   90  194:lstore_3        
		nextWindowSequenceNumber = l + 1L;
	//   91  195:aload_0         
	//   92  196:lload_3         
	//   93  197:lconst_1        
	//   94  198:ladd            
	//   95  199:putfield        #168 <Field long nextWindowSequenceNumber>
		return l;
	//   96  202:lload_3         
	//   97  203:lreturn         
	}

	private boolean updateForPlaybackModeChange()
	{
		MediaPeriodHolder mediaperiodholder1 = getFrontPeriod();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #279 <Method MediaPeriodHolder getFrontPeriod()>
	//    2    4:astore          5
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore_2        
		MediaPeriodHolder mediaperiodholder = mediaperiodholder1;
	//    5    8:aload           5
	//    6   10:astore          4
		if(mediaperiodholder1 == null)
	//*   7   12:aload           5
	//*   8   14:ifnonnull       19
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		do
		{
			int i = timeline.getNextPeriodIndex(mediaperiodholder.info.id.periodIndex, period, window, repeatMode, shuffleModeEnabled);
	//   11   19:aload_0         
	//   12   20:getfield        #90  <Field Timeline timeline>
	//   13   23:aload           4
	//   14   25:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   15   28:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   16   31:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   17   34:aload_0         
	//   18   35:getfield        #35  <Field Timeline$Period period>
	//   19   38:aload_0         
	//   20   39:getfield        #40  <Field Timeline$Window window>
	//   21   42:aload_0         
	//   22   43:getfield        #95  <Field int repeatMode>
	//   23   46:aload_0         
	//   24   47:getfield        #97  <Field boolean shuffleModeEnabled>
	//   25   50:invokevirtual   #103 <Method int Timeline.getNextPeriodIndex(int, Timeline$Period, Timeline$Window, int, boolean)>
	//   26   53:istore_1        
			for(; mediaperiodholder.next != null && !mediaperiodholder.info.isLastInTimelinePeriod; mediaperiodholder = mediaperiodholder.next);
	//   27   54:aload           4
	//   28   56:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   29   59:ifnull          83
	//   30   62:aload           4
	//   31   64:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   32   67:getfield        #88  <Field boolean MediaPeriodInfo.isLastInTimelinePeriod>
	//   33   70:ifne            83
	//   34   73:aload           4
	//   35   75:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   36   78:astore          4
	//*  37   80:goto            54
			if(i == -1 || mediaperiodholder.next == null || mediaperiodholder.next.info.id.periodIndex != i)
	//*  38   83:iload_1         
	//*  39   84:iconst_m1       
	//*  40   85:icmpeq          127
	//*  41   88:aload           4
	//*  42   90:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*  43   93:ifnull          127
	//*  44   96:aload           4
	//*  45   98:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*  46  101:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//*  47  104:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//*  48  107:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//*  49  110:iload_1         
	//*  50  111:icmpeq          117
				break;
	//   51  114:goto            127
			mediaperiodholder = mediaperiodholder.next;
	//   52  117:aload           4
	//   53  119:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   54  122:astore          4
		} while(true);
	//   55  124:goto            19
		boolean flag1 = removeAfter(mediaperiodholder);
	//   56  127:aload_0         
	//   57  128:aload           4
	//   58  130:invokevirtual   #284 <Method boolean removeAfter(MediaPeriodHolder)>
	//   59  133:istore_3        
		mediaperiodholder.info = getUpdatedMediaPeriodInfo(mediaperiodholder.info, mediaperiodholder.info.id);
	//   60  134:aload           4
	//   61  136:aload_0         
	//   62  137:aload           4
	//   63  139:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   64  142:aload           4
	//   65  144:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   66  147:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   67  150:invokespecial   #286 <Method MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   68  153:putfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
		if(flag1)
	//*  69  156:iload_3         
	//*  70  157:ifeq            171
		{
			if(!hasPlayingPeriod())
	//*  71  160:aload_0         
	//*  72  161:invokevirtual   #289 <Method boolean hasPlayingPeriod()>
	//*  73  164:ifne            169
				return true;
	//   74  167:iconst_1        
	//   75  168:ireturn         
			flag = false;
	//   76  169:iconst_0        
	//   77  170:istore_2        
		}
		return flag;
	//   78  171:iload_2         
	//   79  172:ireturn         
	}

	public MediaPeriodHolder advancePlayingPeriod()
	{
		if(playing != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #292 <Field MediaPeriodHolder playing>
	//*   2    4:ifnull          100
		{
			if(playing == reading)
	//*   3    7:aload_0         
	//*   4    8:getfield        #292 <Field MediaPeriodHolder playing>
	//*   5   11:aload_0         
	//*   6   12:getfield        #294 <Field MediaPeriodHolder reading>
	//*   7   15:if_acmpne       29
				reading = playing.next;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #292 <Field MediaPeriodHolder playing>
	//   11   23:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   12   26:putfield        #294 <Field MediaPeriodHolder reading>
			playing.release();
	//   13   29:aload_0         
	//   14   30:getfield        #292 <Field MediaPeriodHolder playing>
	//   15   33:invokevirtual   #297 <Method void MediaPeriodHolder.release()>
			length = length - 1;
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #299 <Field int length>
	//   19   41:iconst_1        
	//   20   42:isub            
	//   21   43:putfield        #299 <Field int length>
			if(length == 0)
	//*  22   46:aload_0         
	//*  23   47:getfield        #299 <Field int length>
	//*  24   50:ifne            86
			{
				loading = null;
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:putfield        #301 <Field MediaPeriodHolder loading>
				oldFrontPeriodUid = playing.uid;
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #292 <Field MediaPeriodHolder playing>
	//   31   63:getfield        #165 <Field Object MediaPeriodHolder.uid>
	//   32   66:putfield        #269 <Field Object oldFrontPeriodUid>
				oldFrontPeriodWindowSequenceNumber = playing.info.id.windowSequenceNumber;
	//   33   69:aload_0         
	//   34   70:aload_0         
	//   35   71:getfield        #292 <Field MediaPeriodHolder playing>
	//   36   74:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   37   77:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   38   80:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//   39   83:putfield        #275 <Field long oldFrontPeriodWindowSequenceNumber>
			}
			playing = playing.next;
	//   40   86:aload_0         
	//   41   87:aload_0         
	//   42   88:getfield        #292 <Field MediaPeriodHolder playing>
	//   43   91:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   44   94:putfield        #292 <Field MediaPeriodHolder playing>
		} else
	//*  45   97:goto            116
		{
			playing = loading;
	//   46  100:aload_0         
	//   47  101:aload_0         
	//   48  102:getfield        #301 <Field MediaPeriodHolder loading>
	//   49  105:putfield        #292 <Field MediaPeriodHolder playing>
			reading = loading;
	//   50  108:aload_0         
	//   51  109:aload_0         
	//   52  110:getfield        #301 <Field MediaPeriodHolder loading>
	//   53  113:putfield        #294 <Field MediaPeriodHolder reading>
		}
		return playing;
	//   54  116:aload_0         
	//   55  117:getfield        #292 <Field MediaPeriodHolder playing>
	//   56  120:areturn         
	}

	public MediaPeriodHolder advanceReadingPeriod()
	{
		boolean flag;
		if(reading != null && reading.next != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #294 <Field MediaPeriodHolder reading>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #294 <Field MediaPeriodHolder reading>
	//*   5   11:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*   6   14:ifnull          22
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_1        
		else
	//*   9   19:goto            24
			flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		Assertions.checkState(flag);
	//   12   24:iload_1         
	//   13   25:invokestatic    #308 <Method void Assertions.checkState(boolean)>
		reading = reading.next;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #294 <Field MediaPeriodHolder reading>
	//   17   33:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   18   36:putfield        #294 <Field MediaPeriodHolder reading>
		return reading;
	//   19   39:aload_0         
	//   20   40:getfield        #294 <Field MediaPeriodHolder reading>
	//   21   43:areturn         
	}

	public void clear(boolean flag)
	{
		MediaPeriodHolder mediaperiodholder = getFrontPeriod();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #279 <Method MediaPeriodHolder getFrontPeriod()>
	//    2    4:astore_3        
		if(mediaperiodholder != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          55
		{
			Object obj;
			if(flag)
	//*   5    9:iload_1         
	//*   6   10:ifeq            21
				obj = mediaperiodholder.uid;
	//    7   13:aload_3         
	//    8   14:getfield        #165 <Field Object MediaPeriodHolder.uid>
	//    9   17:astore_2        
			else
	//*  10   18:goto            23
				obj = null;
	//   11   21:aconst_null     
	//   12   22:astore_2        
			oldFrontPeriodUid = obj;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #269 <Field Object oldFrontPeriodUid>
			oldFrontPeriodWindowSequenceNumber = mediaperiodholder.info.id.windowSequenceNumber;
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   19   33:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   20   36:getfield        #116 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//   21   39:putfield        #275 <Field long oldFrontPeriodWindowSequenceNumber>
			mediaperiodholder.release();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #297 <Method void MediaPeriodHolder.release()>
			removeAfter(mediaperiodholder);
	//   24   46:aload_0         
	//   25   47:aload_3         
	//   26   48:invokevirtual   #284 <Method boolean removeAfter(MediaPeriodHolder)>
	//   27   51:pop             
		} else
	//*  28   52:goto            64
		if(!flag)
	//*  29   55:iload_1         
	//*  30   56:ifne            64
			oldFrontPeriodUid = null;
	//   31   59:aload_0         
	//   32   60:aconst_null     
	//   33   61:putfield        #269 <Field Object oldFrontPeriodUid>
		playing = null;
	//   34   64:aload_0         
	//   35   65:aconst_null     
	//   36   66:putfield        #292 <Field MediaPeriodHolder playing>
		loading = null;
	//   37   69:aload_0         
	//   38   70:aconst_null     
	//   39   71:putfield        #301 <Field MediaPeriodHolder loading>
		reading = null;
	//   40   74:aload_0         
	//   41   75:aconst_null     
	//   42   76:putfield        #294 <Field MediaPeriodHolder reading>
		length = 0;
	//   43   79:aload_0         
	//   44   80:iconst_0        
	//   45   81:putfield        #299 <Field int length>
	//   46   84:return          
	}

	public MediaPeriod enqueueNextMediaPeriod(RendererCapabilities arenderercapabilities[], TrackSelector trackselector, Allocator allocator, MediaSource mediasource, Object obj, MediaPeriodInfo mediaperiodinfo)
	{
		long l;
		if(loading == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field MediaPeriodHolder loading>
	//*   2    4:ifnonnull       17
			l = mediaperiodinfo.startPositionUs;
	//    3    7:aload           6
	//    4    9:getfield        #54  <Field long MediaPeriodInfo.startPositionUs>
	//    5   12:lstore          7
		else
	//*   6   14:goto            37
			l = loading.getRendererOffset() + loading.info.durationUs;
	//    7   17:aload_0         
	//    8   18:getfield        #301 <Field MediaPeriodHolder loading>
	//    9   21:invokevirtual   #127 <Method long MediaPeriodHolder.getRendererOffset()>
	//   10   24:aload_0         
	//   11   25:getfield        #301 <Field MediaPeriodHolder loading>
	//   12   28:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   13   31:getfield        #130 <Field long MediaPeriodInfo.durationUs>
	//   14   34:ladd            
	//   15   35:lstore          7
		arenderercapabilities = ((RendererCapabilities []) (new MediaPeriodHolder(arenderercapabilities, l, trackselector, allocator, mediasource, obj, mediaperiodinfo)));
	//   16   37:new             #45  <Class MediaPeriodHolder>
	//   17   40:dup             
	//   18   41:aload_1         
	//   19   42:lload           7
	//   20   44:aload_2         
	//   21   45:aload_3         
	//   22   46:aload           4
	//   23   48:aload           5
	//   24   50:aload           6
	//   25   52:invokespecial   #314 <Method void MediaPeriodHolder(RendererCapabilities[], long, TrackSelector, Allocator, MediaSource, Object, MediaPeriodInfo)>
	//   26   55:astore_1        
		if(loading != null)
	//*  27   56:aload_0         
	//*  28   57:getfield        #301 <Field MediaPeriodHolder loading>
	//*  29   60:ifnull          78
		{
			Assertions.checkState(hasPlayingPeriod());
	//   30   63:aload_0         
	//   31   64:invokevirtual   #289 <Method boolean hasPlayingPeriod()>
	//   32   67:invokestatic    #308 <Method void Assertions.checkState(boolean)>
			loading.next = ((MediaPeriodHolder) (arenderercapabilities));
	//   33   70:aload_0         
	//   34   71:getfield        #301 <Field MediaPeriodHolder loading>
	//   35   74:aload_1         
	//   36   75:putfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
		}
		oldFrontPeriodUid = null;
	//   37   78:aload_0         
	//   38   79:aconst_null     
	//   39   80:putfield        #269 <Field Object oldFrontPeriodUid>
		loading = ((MediaPeriodHolder) (arenderercapabilities));
	//   40   83:aload_0         
	//   41   84:aload_1         
	//   42   85:putfield        #301 <Field MediaPeriodHolder loading>
		length = length + 1;
	//   43   88:aload_0         
	//   44   89:aload_0         
	//   45   90:getfield        #299 <Field int length>
	//   46   93:iconst_1        
	//   47   94:iadd            
	//   48   95:putfield        #299 <Field int length>
		return ((MediaPeriodHolder) (arenderercapabilities)).mediaPeriod;
	//   49   98:aload_1         
	//   50   99:getfield        #318 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//   51  102:areturn         
	}

	public MediaPeriodHolder getFrontPeriod()
	{
		if(hasPlayingPeriod())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #289 <Method boolean hasPlayingPeriod()>
	//*   2    4:ifeq            12
			return playing;
	//    3    7:aload_0         
	//    4    8:getfield        #292 <Field MediaPeriodHolder playing>
	//    5   11:areturn         
		else
			return loading;
	//    6   12:aload_0         
	//    7   13:getfield        #301 <Field MediaPeriodHolder loading>
	//    8   16:areturn         
	}

	public MediaPeriodHolder getLoadingPeriod()
	{
		return loading;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field MediaPeriodHolder loading>
	//    2    4:areturn         
	}

	public MediaPeriodInfo getNextMediaPeriodInfo(long l, PlaybackInfo playbackinfo)
	{
		if(loading == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field MediaPeriodHolder loading>
	//*   2    4:ifnonnull       13
			return getFirstMediaPeriodInfo(playbackinfo);
	//    3    7:aload_0         
	//    4    8:aload_3         
	//    5    9:invokespecial   #323 <Method MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo)>
	//    6   12:areturn         
		else
			return getFollowingMediaPeriodInfo(loading, l);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #301 <Field MediaPeriodHolder loading>
	//   10   18:lload_1         
	//   11   19:invokespecial   #325 <Method MediaPeriodInfo getFollowingMediaPeriodInfo(MediaPeriodHolder, long)>
	//   12   22:areturn         
	}

	public MediaPeriodHolder getPlayingPeriod()
	{
		return playing;
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field MediaPeriodHolder playing>
	//    2    4:areturn         
	}

	public MediaPeriodHolder getReadingPeriod()
	{
		return reading;
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field MediaPeriodHolder reading>
	//    2    4:areturn         
	}

	public MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo mediaperiodinfo, int i)
	{
		return getUpdatedMediaPeriodInfo(mediaperiodinfo, mediaperiodinfo.id.copyWithPeriodIndex(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #61  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #332 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//    6   10:invokespecial   #286 <Method MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    7   13:areturn         
	}

	public boolean hasPlayingPeriod()
	{
		return playing != null;
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field MediaPeriodHolder playing>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isLoading(MediaPeriod mediaperiod)
	{
		return loading != null && loading.mediaPeriod == mediaperiod;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field MediaPeriodHolder loading>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #301 <Field MediaPeriodHolder loading>
	//    5   11:getfield        #318 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//    6   14:aload_1         
	//    7   15:if_acmpne       20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public void reevaluateBuffer(long l)
	{
		if(loading != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field MediaPeriodHolder loading>
	//*   2    4:ifnull          15
			loading.reevaluateBuffer(l);
	//    3    7:aload_0         
	//    4    8:getfield        #301 <Field MediaPeriodHolder loading>
	//    5   11:lload_1         
	//    6   12:invokevirtual   #338 <Method void MediaPeriodHolder.reevaluateBuffer(long)>
	//    7   15:return          
	}

	public boolean removeAfter(MediaPeriodHolder mediaperiodholder)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(mediaperiodholder != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		Assertions.checkState(flag);
	//    9   13:iload_2         
	//   10   14:invokestatic    #308 <Method void Assertions.checkState(boolean)>
		loading = mediaperiodholder;
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:putfield        #301 <Field MediaPeriodHolder loading>
		flag = flag1;
	//   14   22:iload_3         
	//   15   23:istore_2        
		while(mediaperiodholder.next != null) 
	//*  16   24:aload_1         
	//*  17   25:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*  18   28:ifnull          71
		{
			mediaperiodholder = mediaperiodholder.next;
	//   19   31:aload_1         
	//   20   32:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   21   35:astore_1        
			if(mediaperiodholder == reading)
	//*  22   36:aload_1         
	//*  23   37:aload_0         
	//*  24   38:getfield        #294 <Field MediaPeriodHolder reading>
	//*  25   41:if_acmpne       54
			{
				reading = playing;
	//   26   44:aload_0         
	//   27   45:aload_0         
	//   28   46:getfield        #292 <Field MediaPeriodHolder playing>
	//   29   49:putfield        #294 <Field MediaPeriodHolder reading>
				flag = true;
	//   30   52:iconst_1        
	//   31   53:istore_2        
			}
			mediaperiodholder.release();
	//   32   54:aload_1         
	//   33   55:invokevirtual   #297 <Method void MediaPeriodHolder.release()>
			length = length - 1;
	//   34   58:aload_0         
	//   35   59:aload_0         
	//   36   60:getfield        #299 <Field int length>
	//   37   63:iconst_1        
	//   38   64:isub            
	//   39   65:putfield        #299 <Field int length>
		}
	//*  40   68:goto            24
		loading.next = null;
	//   41   71:aload_0         
	//   42   72:getfield        #301 <Field MediaPeriodHolder loading>
	//   43   75:aconst_null     
	//   44   76:putfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
		return flag;
	//   45   79:iload_2         
	//   46   80:ireturn         
	}

	public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(int i, long l)
	{
		return resolveMediaPeriodIdForAds(i, l, resolvePeriodIndexToWindowSequenceNumber(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aload_0         
	//    4    4:iload_1         
	//    5    5:invokespecial   #341 <Method long resolvePeriodIndexToWindowSequenceNumber(int)>
	//    6    8:invokespecial   #172 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId resolveMediaPeriodIdForAds(int, long, long)>
	//    7   11:areturn         
	}

	public void setTimeline(Timeline timeline1)
	{
		timeline = timeline1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field Timeline timeline>
	//    3    5:return          
	}

	public boolean shouldLoadNextMediaPeriod()
	{
		return loading == null || !loading.info.isFinal && loading.isFullyBuffered() && loading.info.durationUs != 0x1L && length < 100;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field MediaPeriodHolder loading>
	//    2    4:ifnull          61
	//    3    7:aload_0         
	//    4    8:getfield        #301 <Field MediaPeriodHolder loading>
	//    5   11:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//    6   14:getfield        #347 <Field boolean MediaPeriodInfo.isFinal>
	//    7   17:ifne            59
	//    8   20:aload_0         
	//    9   21:getfield        #301 <Field MediaPeriodHolder loading>
	//   10   24:invokevirtual   #350 <Method boolean MediaPeriodHolder.isFullyBuffered()>
	//   11   27:ifeq            59
	//   12   30:aload_0         
	//   13   31:getfield        #301 <Field MediaPeriodHolder loading>
	//   14   34:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   15   37:getfield        #130 <Field long MediaPeriodInfo.durationUs>
	//   16   40:ldc2w           #131 <Long 0x1L>
	//   17   43:lcmp            
	//   18   44:ifeq            59
	//   19   47:aload_0         
	//   20   48:getfield        #299 <Field int length>
	//   21   51:bipush          100
	//   22   53:icmpge          59
	//   23   56:goto            61
	//   24   59:iconst_0        
	//   25   60:ireturn         
	//   26   61:iconst_1        
	//   27   62:ireturn         
	}

	public boolean updateQueuedPeriods(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l)
	{
label0:
		{
			int i = mediaperiodid.periodIndex;
	//    0    0:aload_1         
	//    1    1:getfield        #93  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//    2    4:istore          4
			mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (getFrontPeriod()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #279 <Method MediaPeriodHolder getFrontPeriod()>
	//    5   10:astore_1        
			Object obj = null;
	//    6   11:aconst_null     
	//    7   12:astore          6
			do
			{
				if(mediaperiodid == null)
					break label0;
	//    8   14:aload_1         
	//    9   15:ifnull          201
				if(obj == null)
	//*  10   18:aload           6
	//*  11   20:ifnonnull       40
				{
					mediaperiodid.info = getUpdatedMediaPeriodInfo(((MediaPeriodHolder) (mediaperiodid)).info, i);
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   16   29:iload           4
	//   17   31:invokevirtual   #353 <Method MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo, int)>
	//   18   34:putfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
				} else
	//*  19   37:goto            132
				{
					if(i == -1 || !((MediaPeriodHolder) (mediaperiodid)).uid.equals(timeline.getPeriod(i, period, true).uid))
	//*  20   40:iload           4
	//*  21   42:iconst_m1       
	//*  22   43:icmpeq          192
	//*  23   46:aload_1         
	//*  24   47:getfield        #165 <Field Object MediaPeriodHolder.uid>
	//*  25   50:aload_0         
	//*  26   51:getfield        #90  <Field Timeline timeline>
	//*  27   54:iload           4
	//*  28   56:aload_0         
	//*  29   57:getfield        #35  <Field Timeline$Period period>
	//*  30   60:iconst_1        
	//*  31   61:invokevirtual   #107 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//*  32   64:getfield        #113 <Field Object Timeline$Period.uid>
	//*  33   67:invokevirtual   #166 <Method boolean Object.equals(Object)>
	//*  34   70:ifne            76
						break;
	//   35   73:goto            192
					MediaPeriodInfo mediaperiodinfo = getFollowingMediaPeriodInfo(((MediaPeriodHolder) (obj)), l);
	//   36   76:aload_0         
	//   37   77:aload           6
	//   38   79:lload_2         
	//   39   80:invokespecial   #325 <Method MediaPeriodInfo getFollowingMediaPeriodInfo(MediaPeriodHolder, long)>
	//   40   83:astore          7
					if(mediaperiodinfo == null)
	//*  41   85:aload           7
	//*  42   87:ifnonnull       99
						return removeAfter(((MediaPeriodHolder) (obj))) ^ true;
	//   43   90:aload_0         
	//   44   91:aload           6
	//   45   93:invokevirtual   #284 <Method boolean removeAfter(MediaPeriodHolder)>
	//   46   96:iconst_1        
	//   47   97:ixor            
	//   48   98:ireturn         
					mediaperiodid.info = getUpdatedMediaPeriodInfo(((MediaPeriodHolder) (mediaperiodid)).info, i);
	//   49   99:aload_1         
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   53  105:iload           4
	//   54  107:invokevirtual   #353 <Method MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo, int)>
	//   55  110:putfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
					if(!canKeepMediaPeriodHolder(((MediaPeriodHolder) (mediaperiodid)), mediaperiodinfo))
	//*  56  113:aload_0         
	//*  57  114:aload_1         
	//*  58  115:aload           7
	//*  59  117:invokespecial   #355 <Method boolean canKeepMediaPeriodHolder(MediaPeriodHolder, MediaPeriodInfo)>
	//*  60  120:ifne            132
						return removeAfter(((MediaPeriodHolder) (obj))) ^ true;
	//   61  123:aload_0         
	//   62  124:aload           6
	//   63  126:invokevirtual   #284 <Method boolean removeAfter(MediaPeriodHolder)>
	//   64  129:iconst_1        
	//   65  130:ixor            
	//   66  131:ireturn         
				}
				int j = i;
	//   67  132:iload           4
	//   68  134:istore          5
				if(((MediaPeriodHolder) (mediaperiodid)).info.isLastInTimelinePeriod)
	//*  69  136:aload_1         
	//*  70  137:getfield        #49  <Field MediaPeriodInfo MediaPeriodHolder.info>
	//*  71  140:getfield        #88  <Field boolean MediaPeriodInfo.isLastInTimelinePeriod>
	//*  72  143:ifeq            173
					j = timeline.getNextPeriodIndex(i, period, window, repeatMode, shuffleModeEnabled);
	//   73  146:aload_0         
	//   74  147:getfield        #90  <Field Timeline timeline>
	//   75  150:iload           4
	//   76  152:aload_0         
	//   77  153:getfield        #35  <Field Timeline$Period period>
	//   78  156:aload_0         
	//   79  157:getfield        #40  <Field Timeline$Window window>
	//   80  160:aload_0         
	//   81  161:getfield        #95  <Field int repeatMode>
	//   82  164:aload_0         
	//   83  165:getfield        #97  <Field boolean shuffleModeEnabled>
	//   84  168:invokevirtual   #103 <Method int Timeline.getNextPeriodIndex(int, Timeline$Period, Timeline$Window, int, boolean)>
	//   85  171:istore          5
				MediaPeriodHolder mediaperiodholder = ((MediaPeriodHolder) (mediaperiodid)).next;
	//   86  173:aload_1         
	//   87  174:getfield        #164 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   88  177:astore          7
				obj = ((Object) (mediaperiodid));
	//   89  179:aload_1         
	//   90  180:astore          6
				mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediaperiodholder));
	//   91  182:aload           7
	//   92  184:astore_1        
				i = j;
	//   93  185:iload           5
	//   94  187:istore          4
			} while(true);
	//   95  189:goto            14
			return removeAfter(((MediaPeriodHolder) (obj))) ^ true;
	//   96  192:aload_0         
	//   97  193:aload           6
	//   98  195:invokevirtual   #284 <Method boolean removeAfter(MediaPeriodHolder)>
	//   99  198:iconst_1        
	//  100  199:ixor            
	//  101  200:ireturn         
		}
		return true;
	//  102  201:iconst_1        
	//  103  202:ireturn         
	}

	public boolean updateRepeatMode(int i)
	{
		repeatMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #95  <Field int repeatMode>
		return updateForPlaybackModeChange();
	//    3    5:aload_0         
	//    4    6:invokespecial   #358 <Method boolean updateForPlaybackModeChange()>
	//    5    9:ireturn         
	}

	public boolean updateShuffleModeEnabled(boolean flag)
	{
		shuffleModeEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #97  <Field boolean shuffleModeEnabled>
		return updateForPlaybackModeChange();
	//    3    5:aload_0         
	//    4    6:invokespecial   #358 <Method boolean updateForPlaybackModeChange()>
	//    5    9:ireturn         
	}

	private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
	private int length;
	private MediaPeriodHolder loading;
	private long nextWindowSequenceNumber;
	private Object oldFrontPeriodUid;
	private long oldFrontPeriodWindowSequenceNumber;
	private final Timeline.Period period = new Timeline.Period();
	private MediaPeriodHolder playing;
	private MediaPeriodHolder reading;
	private int repeatMode;
	private boolean shuffleModeEnabled;
	private Timeline timeline;
	private final Timeline.Window window = new Timeline.Window();
}
