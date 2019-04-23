// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.PriorityHandlerThread;
import com.google.android.exoplayer.util.TraceUtil;
import com.google.android.exoplayer.util.Util;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.exoplayer:
//			StandaloneMediaClock, ExoPlaybackException, TrackRenderer, MediaFormat, 
//			MediaClock

final class ExoPlayerImplInternal
	implements android.os.Handler.Callback
{

	public ExoPlayerImplInternal(Handler handler1, boolean flag, int ai[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		customMessagesSent = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #82  <Field int customMessagesSent>
		customMessagesProcessed = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #84  <Field int customMessagesProcessed>
		eventHandler = handler1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #86  <Field Handler eventHandler>
		playWhenReady = flag;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #88  <Field boolean playWhenReady>
		minBufferUs = (long)i * 1000L;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:i2l             
	//   17   28:ldc2w           #89  <Long 1000L>
	//   18   31:lmul            
	//   19   32:putfield        #92  <Field long minBufferUs>
		minRebufferUs = (long)j * 1000L;
	//   20   35:aload_0         
	//   21   36:iload           5
	//   22   38:i2l             
	//   23   39:ldc2w           #89  <Long 1000L>
	//   24   42:lmul            
	//   25   43:putfield        #94  <Field long minRebufferUs>
		selectedTrackIndices = Arrays.copyOf(ai, ai.length);
	//   26   46:aload_0         
	//   27   47:aload_3         
	//   28   48:aload_3         
	//   29   49:arraylength     
	//   30   50:invokestatic    #100 <Method int[] Arrays.copyOf(int[], int)>
	//   31   53:putfield        #102 <Field int[] selectedTrackIndices>
		state = 1;
	//   32   56:aload_0         
	//   33   57:iconst_1        
	//   34   58:putfield        #104 <Field int state>
		durationUs = -1L;
	//   35   61:aload_0         
	//   36   62:ldc2w           #105 <Long -1L>
	//   37   65:putfield        #108 <Field long durationUs>
		bufferedPositionUs = -1L;
	//   38   68:aload_0         
	//   39   69:ldc2w           #105 <Long -1L>
	//   40   72:putfield        #110 <Field long bufferedPositionUs>
	//   41   75:aload_0         
	//   42   76:new             #112 <Class StandaloneMediaClock>
	//   43   79:dup             
	//   44   80:invokespecial   #113 <Method void StandaloneMediaClock()>
	//   45   83:putfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//   46   86:aload_0         
	//   47   87:new             #117 <Class AtomicInteger>
	//   48   90:dup             
	//   49   91:invokespecial   #118 <Method void AtomicInteger()>
	//   50   94:putfield        #120 <Field AtomicInteger pendingSeekCount>
		enabledRenderers = ((List) (new ArrayList(ai.length)));
	//   51   97:aload_0         
	//   52   98:new             #122 <Class ArrayList>
	//   53  101:dup             
	//   54  102:aload_3         
	//   55  103:arraylength     
	//   56  104:invokespecial   #125 <Method void ArrayList(int)>
	//   57  107:putfield        #127 <Field List enabledRenderers>
		trackFormats = new MediaFormat[ai.length][];
	//   58  110:aload_0         
	//   59  111:aload_3         
	//   60  112:arraylength     
	//   61  113:anewarray       MediaFormat[][]
	//   62  116:putfield        #131 <Field MediaFormat[][] trackFormats>
	//   63  119:aload_0         
	//   64  120:new             #133 <Class PriorityHandlerThread>
	//   65  123:dup             
	//   66  124:ldc1            #135 <String "ExoPlayerImplInternal:Handler">
	//   67  126:bipush          -16
	//   68  128:invokespecial   #138 <Method void PriorityHandlerThread(String, int)>
	//   69  131:putfield        #140 <Field HandlerThread internalPlaybackThread>
		internalPlaybackThread.start();
	//   70  134:aload_0         
	//   71  135:getfield        #140 <Field HandlerThread internalPlaybackThread>
	//   72  138:invokevirtual   #145 <Method void HandlerThread.start()>
		handler = new Handler(internalPlaybackThread.getLooper(), ((android.os.Handler.Callback) (this)));
	//   73  141:aload_0         
	//   74  142:new             #147 <Class Handler>
	//   75  145:dup             
	//   76  146:aload_0         
	//   77  147:getfield        #140 <Field HandlerThread internalPlaybackThread>
	//   78  150:invokevirtual   #151 <Method Looper HandlerThread.getLooper()>
	//   79  153:aload_0         
	//   80  154:invokespecial   #154 <Method void Handler(Looper, android.os.Handler$Callback)>
	//   81  157:putfield        #156 <Field Handler handler>
	//   82  160:return          
	}

	private void doSomeWork()
		throws ExoPlaybackException
	{
		TraceUtil.beginSection("doSomeWork");
	//    0    0:ldc1            #161 <String "doSomeWork">
	//    1    2:invokestatic    #167 <Method void TraceUtil.beginSection(String)>
		long l2 = SystemClock.elapsedRealtime();
	//    2    5:invokestatic    #173 <Method long SystemClock.elapsedRealtime()>
	//    3    8:lstore          8
		long l;
		if(durationUs != -1L)
	//*   4   10:aload_0         
	//*   5   11:getfield        #108 <Field long durationUs>
	//*   6   14:ldc2w           #105 <Long -1L>
	//*   7   17:lcmp            
	//*   8   18:ifeq            30
			l = durationUs;
	//    9   21:aload_0         
	//   10   22:getfield        #108 <Field long durationUs>
	//   11   25:lstore          4
		else
	//*  12   27:goto            35
			l = 0xffffffffL;
	//   13   30:ldc2w           #174 <Long 0xffffffffL>
	//   14   33:lstore          4
		updatePositionUs();
	//   15   35:aload_0         
	//   16   36:invokespecial   #178 <Method void updatePositionUs()>
		int i = 0;
	//   17   39:iconst_0        
	//   18   40:istore_3        
		boolean flag = true;
	//   19   41:iconst_1        
	//   20   42:istore_1        
		boolean flag1 = true;
	//   21   43:iconst_1        
	//   22   44:istore_2        
		long l1;
		for(l1 = l; i < enabledRenderers.size(); l1 = l)
	//*  23   45:lload           4
	//*  24   47:lstore          6
	//*  25   49:iload_3         
	//*  26   50:aload_0         
	//*  27   51:getfield        #127 <Field List enabledRenderers>
	//*  28   54:invokeinterface #184 <Method int List.size()>
	//*  29   59:icmpge          256
		{
			TrackRenderer trackrenderer = (TrackRenderer)enabledRenderers.get(i);
	//   30   62:aload_0         
	//   31   63:getfield        #127 <Field List enabledRenderers>
	//   32   66:iload_3         
	//   33   67:invokeinterface #188 <Method Object List.get(int)>
	//   34   72:checkcast       #190 <Class TrackRenderer>
	//   35   75:astore          15
			trackrenderer.doSomeWork(positionUs, elapsedRealtimeUs);
	//   36   77:aload           15
	//   37   79:aload_0         
	//   38   80:getfield        #192 <Field long positionUs>
	//   39   83:aload_0         
	//   40   84:getfield        #194 <Field long elapsedRealtimeUs>
	//   41   87:invokevirtual   #197 <Method void TrackRenderer.doSomeWork(long, long)>
			if(flag && trackrenderer.isEnded())
	//*  42   90:iload_1         
	//*  43   91:ifeq            107
	//*  44   94:aload           15
	//*  45   96:invokevirtual   #201 <Method boolean TrackRenderer.isEnded()>
	//*  46   99:ifeq            107
				flag = true;
	//   47  102:iconst_1        
	//   48  103:istore_1        
			else
	//*  49  104:goto            109
				flag = false;
	//   50  107:iconst_0        
	//   51  108:istore_1        
			boolean flag2 = rendererReadyOrEnded(trackrenderer);
	//   52  109:aload_0         
	//   53  110:aload           15
	//   54  112:invokespecial   #205 <Method boolean rendererReadyOrEnded(TrackRenderer)>
	//   55  115:istore          14
			if(!flag2)
	//*  56  117:iload           14
	//*  57  119:ifne            127
				trackrenderer.maybeThrowError();
	//   58  122:aload           15
	//   59  124:invokevirtual   #208 <Method void TrackRenderer.maybeThrowError()>
			if(flag1 && flag2)
	//*  60  127:iload_2         
	//*  61  128:ifeq            141
	//*  62  131:iload           14
	//*  63  133:ifeq            141
				flag1 = true;
	//   64  136:iconst_1        
	//   65  137:istore_2        
			else
	//*  66  138:goto            143
				flag1 = false;
	//   67  141:iconst_0        
	//   68  142:istore_2        
			if(l1 == -1L)
	//*  69  143:lload           6
	//*  70  145:ldc2w           #105 <Long -1L>
	//*  71  148:lcmp            
	//*  72  149:ifne            159
			{
				l = l1;
	//   73  152:lload           6
	//   74  154:lstore          4
			} else
	//*  75  156:goto            245
			{
				long l3 = trackrenderer.getDurationUs();
	//   76  159:aload           15
	//   77  161:invokevirtual   #211 <Method long TrackRenderer.getDurationUs()>
	//   78  164:lstore          10
				long l4 = trackrenderer.getBufferedPositionUs();
	//   79  166:aload           15
	//   80  168:invokevirtual   #214 <Method long TrackRenderer.getBufferedPositionUs()>
	//   81  171:lstore          12
				if(l4 == -1L)
	//*  82  173:lload           12
	//*  83  175:ldc2w           #105 <Long -1L>
	//*  84  178:lcmp            
	//*  85  179:ifne            190
				{
					l = -1L;
	//   86  182:ldc2w           #105 <Long -1L>
	//   87  185:lstore          4
				} else
	//*  88  187:goto            245
				{
					l = l1;
	//   89  190:lload           6
	//   90  192:lstore          4
					if(l4 != -3L)
	//*  91  194:lload           12
	//*  92  196:ldc2w           #215 <Long -3L>
	//*  93  199:lcmp            
	//*  94  200:ifeq            245
						if(l3 != -1L && l3 != -2L && l4 >= l3)
	//*  95  203:lload           10
	//*  96  205:ldc2w           #105 <Long -1L>
	//*  97  208:lcmp            
	//*  98  209:ifeq            236
	//*  99  212:lload           10
	//* 100  214:ldc2w           #217 <Long -2L>
	//* 101  217:lcmp            
	//* 102  218:ifeq            236
	//* 103  221:lload           12
	//* 104  223:lload           10
	//* 105  225:lcmp            
	//* 106  226:iflt            236
							l = l1;
	//  107  229:lload           6
	//  108  231:lstore          4
						else
	//* 109  233:goto            245
							l = Math.min(l1, l4);
	//  110  236:lload           6
	//  111  238:lload           12
	//  112  240:invokestatic    #224 <Method long Math.min(long, long)>
	//  113  243:lstore          4
				}
			}
			i++;
	//  114  245:iload_3         
	//  115  246:iconst_1        
	//  116  247:iadd            
	//  117  248:istore_3        
		}

	//  118  249:lload           4
	//  119  251:lstore          6
	//* 120  253:goto            49
		bufferedPositionUs = l1;
	//  121  256:aload_0         
	//  122  257:lload           6
	//  123  259:putfield        #110 <Field long bufferedPositionUs>
		if(flag && (durationUs == -1L || durationUs <= positionUs))
	//* 124  262:iload_1         
	//* 125  263:ifeq            301
	//* 126  266:aload_0         
	//* 127  267:getfield        #108 <Field long durationUs>
	//* 128  270:ldc2w           #105 <Long -1L>
	//* 129  273:lcmp            
	//* 130  274:ifeq            289
	//* 131  277:aload_0         
	//* 132  278:getfield        #108 <Field long durationUs>
	//* 133  281:aload_0         
	//* 134  282:getfield        #192 <Field long positionUs>
	//* 135  285:lcmp            
	//* 136  286:ifgt            301
		{
			setState(5);
	//  137  289:aload_0         
	//  138  290:iconst_5        
	//  139  291:invokespecial   #227 <Method void setState(int)>
			stopRenderers();
	//  140  294:aload_0         
	//  141  295:invokespecial   #230 <Method void stopRenderers()>
		} else
	//* 142  298:goto            361
		if(state == 3 && flag1)
	//* 143  301:aload_0         
	//* 144  302:getfield        #104 <Field int state>
	//* 145  305:iconst_3        
	//* 146  306:icmpne          332
	//* 147  309:iload_2         
	//* 148  310:ifeq            332
		{
			setState(4);
	//  149  313:aload_0         
	//  150  314:iconst_4        
	//  151  315:invokespecial   #227 <Method void setState(int)>
			if(playWhenReady)
	//* 152  318:aload_0         
	//* 153  319:getfield        #88  <Field boolean playWhenReady>
	//* 154  322:ifeq            361
				startRenderers();
	//  155  325:aload_0         
	//  156  326:invokespecial   #233 <Method void startRenderers()>
		} else
	//* 157  329:goto            361
		if(state == 4 && !flag1)
	//* 158  332:aload_0         
	//* 159  333:getfield        #104 <Field int state>
	//* 160  336:iconst_4        
	//* 161  337:icmpne          361
	//* 162  340:iload_2         
	//* 163  341:ifne            361
		{
			rebuffering = playWhenReady;
	//  164  344:aload_0         
	//  165  345:aload_0         
	//  166  346:getfield        #88  <Field boolean playWhenReady>
	//  167  349:putfield        #235 <Field boolean rebuffering>
			setState(3);
	//  168  352:aload_0         
	//  169  353:iconst_3        
	//  170  354:invokespecial   #227 <Method void setState(int)>
			stopRenderers();
	//  171  357:aload_0         
	//  172  358:invokespecial   #230 <Method void stopRenderers()>
		}
		handler.removeMessages(7);
	//  173  361:aload_0         
	//  174  362:getfield        #156 <Field Handler handler>
	//  175  365:bipush          7
	//  176  367:invokevirtual   #238 <Method void Handler.removeMessages(int)>
		if(playWhenReady && state == 4 || state == 3)
	//* 177  370:aload_0         
	//* 178  371:getfield        #88  <Field boolean playWhenReady>
	//* 179  374:ifeq            385
	//* 180  377:aload_0         
	//* 181  378:getfield        #104 <Field int state>
	//* 182  381:iconst_4        
	//* 183  382:icmpeq          393
	//* 184  385:aload_0         
	//* 185  386:getfield        #104 <Field int state>
	//* 186  389:iconst_3        
	//* 187  390:icmpne          407
			scheduleNextOperation(7, l2, 10L);
	//  188  393:aload_0         
	//  189  394:bipush          7
	//  190  396:lload           8
	//  191  398:ldc2w           #239 <Long 10L>
	//  192  401:invokespecial   #244 <Method void scheduleNextOperation(int, long, long)>
		else
	//* 193  404:goto            430
		if(!enabledRenderers.isEmpty())
	//* 194  407:aload_0         
	//* 195  408:getfield        #127 <Field List enabledRenderers>
	//* 196  411:invokeinterface #247 <Method boolean List.isEmpty()>
	//* 197  416:ifne            430
			scheduleNextOperation(7, l2, 1000L);
	//  198  419:aload_0         
	//  199  420:bipush          7
	//  200  422:lload           8
	//  201  424:ldc2w           #89  <Long 1000L>
	//  202  427:invokespecial   #244 <Method void scheduleNextOperation(int, long, long)>
		TraceUtil.endSection();
	//  203  430:invokestatic    #250 <Method void TraceUtil.endSection()>
	//  204  433:return          
	}

	private void enableRenderer(TrackRenderer trackrenderer, int i, boolean flag)
		throws ExoPlaybackException
	{
		trackrenderer.enable(i, positionUs, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #192 <Field long positionUs>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #257 <Method void TrackRenderer.enable(int, long, boolean)>
		enabledRenderers.add(((Object) (trackrenderer)));
	//    6   10:aload_0         
	//    7   11:getfield        #127 <Field List enabledRenderers>
	//    8   14:aload_1         
	//    9   15:invokeinterface #261 <Method boolean List.add(Object)>
	//   10   20:pop             
		MediaClock mediaclock = trackrenderer.getMediaClock();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #265 <Method MediaClock TrackRenderer.getMediaClock()>
	//   13   25:astore          4
		if(mediaclock != null)
	//*  14   27:aload           4
	//*  15   29:ifnull          61
		{
			if(rendererMediaClock == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #267 <Field MediaClock rendererMediaClock>
	//*  18   36:ifnonnull       44
				flag = true;
	//   19   39:iconst_1        
	//   20   40:istore_3        
			else
	//*  21   41:goto            46
				flag = false;
	//   22   44:iconst_0        
	//   23   45:istore_3        
			Assertions.checkState(flag);
	//   24   46:iload_3         
	//   25   47:invokestatic    #273 <Method void Assertions.checkState(boolean)>
			rendererMediaClock = mediaclock;
	//   26   50:aload_0         
	//   27   51:aload           4
	//   28   53:putfield        #267 <Field MediaClock rendererMediaClock>
			rendererMediaClockSource = trackrenderer;
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:putfield        #275 <Field TrackRenderer rendererMediaClockSource>
		}
	//   32   61:return          
	}

	private void ensureDisabled(TrackRenderer trackrenderer)
		throws ExoPlaybackException
	{
		ensureStopped(trackrenderer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #280 <Method void ensureStopped(TrackRenderer)>
		if(trackrenderer.getState() == 2)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #283 <Method int TrackRenderer.getState()>
	//*   5    9:iconst_2        
	//*   6   10:icmpne          35
		{
			trackrenderer.disable();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #286 <Method void TrackRenderer.disable()>
			if(trackrenderer == rendererMediaClockSource)
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #275 <Field TrackRenderer rendererMediaClockSource>
	//*  12   22:if_acmpne       35
			{
				rendererMediaClock = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #267 <Field MediaClock rendererMediaClock>
				rendererMediaClockSource = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #275 <Field TrackRenderer rendererMediaClockSource>
			}
		}
	//   19   35:return          
	}

	private void ensureStopped(TrackRenderer trackrenderer)
		throws ExoPlaybackException
	{
		if(trackrenderer.getState() == 3)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #283 <Method int TrackRenderer.getState()>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          12
			trackrenderer.stop();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #289 <Method void TrackRenderer.stop()>
	//    6   12:return          
	}

	private void incrementalPrepareInternal()
		throws ExoPlaybackException
	{
		long l1 = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #173 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore          7
		int i = 0;
	//    2    5:iconst_0        
	//    3    6:istore_1        
		boolean flag1 = true;
	//    4    7:iconst_1        
	//    5    8:istore_2        
		do
		{
			TrackRenderer atrackrenderer[] = renderers;
	//    6    9:aload_0         
	//    7   10:getfield        #292 <Field TrackRenderer[] renderers>
	//    8   13:astore          11
			if(i >= atrackrenderer.length)
				break;
	//    9   15:iload_1         
	//   10   16:aload           11
	//   11   18:arraylength     
	//   12   19:icmpge          68
			TrackRenderer trackrenderer = atrackrenderer[i];
	//   13   22:aload           11
	//   14   24:iload_1         
	//   15   25:aaload          
	//   16   26:astore          11
			boolean flag2 = flag1;
	//   17   28:iload_2         
	//   18   29:istore_3        
			if(trackrenderer.getState() == 0)
	//*  19   30:aload           11
	//*  20   32:invokevirtual   #283 <Method int TrackRenderer.getState()>
	//*  21   35:ifne            59
			{
				flag2 = flag1;
	//   22   38:iload_2         
	//   23   39:istore_3        
				if(trackrenderer.prepare(positionUs) == 0)
	//*  24   40:aload           11
	//*  25   42:aload_0         
	//*  26   43:getfield        #192 <Field long positionUs>
	//*  27   46:invokevirtual   #296 <Method int TrackRenderer.prepare(long)>
	//*  28   49:ifne            59
				{
					trackrenderer.maybeThrowError();
	//   29   52:aload           11
	//   30   54:invokevirtual   #208 <Method void TrackRenderer.maybeThrowError()>
					flag2 = false;
	//   31   57:iconst_0        
	//   32   58:istore_3        
				}
			}
			i++;
	//   33   59:iload_1         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_1        
			flag1 = flag2;
	//   37   63:iload_3         
	//   38   64:istore_2        
		} while(true);
	//   39   65:goto            9
		if(!flag1)
	//*  40   68:iload_2         
	//*  41   69:ifne            83
		{
			scheduleNextOperation(2, l1, 10L);
	//   42   72:aload_0         
	//   43   73:iconst_2        
	//   44   74:lload           7
	//   45   76:ldc2w           #239 <Long 10L>
	//   46   79:invokespecial   #244 <Method void scheduleNextOperation(int, long, long)>
			return;
	//   47   82:return          
		}
		flag1 = true;
	//   48   83:iconst_1        
	//   49   84:istore_2        
		boolean flag3 = flag1;
	//   50   85:iload_2         
	//   51   86:istore          4
		l1 = 0L;
	//   52   88:lconst_0        
	//   53   89:lstore          7
		int l = 0;
	//   54   91:iconst_0        
	//   55   92:istore_3        
		do
		{
			TrackRenderer atrackrenderer1[] = renderers;
	//   56   93:aload_0         
	//   57   94:getfield        #292 <Field TrackRenderer[] renderers>
	//   58   97:astore          11
			if(l >= atrackrenderer1.length)
				break;
	//   59   99:iload_3         
	//   60  100:aload           11
	//   61  102:arraylength     
	//   62  103:icmpge          352
			TrackRenderer trackrenderer1 = atrackrenderer1[l];
	//   63  106:aload           11
	//   64  108:iload_3         
	//   65  109:aaload          
	//   66  110:astore          11
			int i1 = trackrenderer1.getTrackCount();
	//   67  112:aload           11
	//   68  114:invokevirtual   #299 <Method int TrackRenderer.getTrackCount()>
	//   69  117:istore          6
			MediaFormat amediaformat[] = new MediaFormat[i1];
	//   70  119:iload           6
	//   71  121:anewarray       MediaFormat[]
	//   72  124:astore          12
			for(int j = 0; j < i1; j++)
	//*  73  126:iconst_0        
	//*  74  127:istore_1        
	//*  75  128:iload_1         
	//*  76  129:iload           6
	//*  77  131:icmpge          151
				amediaformat[j] = trackrenderer1.getFormat(j);
	//   78  134:aload           12
	//   79  136:iload_1         
	//   80  137:aload           11
	//   81  139:iload_1         
	//   82  140:invokevirtual   #305 <Method MediaFormat TrackRenderer.getFormat(int)>
	//   83  143:aastore         

	//   84  144:iload_1         
	//   85  145:iconst_1        
	//   86  146:iadd            
	//   87  147:istore_1        
	//*  88  148:goto            128
			trackFormats[l] = amediaformat;
	//   89  151:aload_0         
	//   90  152:getfield        #131 <Field MediaFormat[][] trackFormats>
	//   91  155:iload_3         
	//   92  156:aload           12
	//   93  158:aastore         
			long l2 = l1;
	//   94  159:lload           7
	//   95  161:lstore          9
			boolean flag4 = flag1;
	//   96  163:iload_2         
	//   97  164:istore          5
			boolean flag = flag3;
	//   98  166:iload           4
	//   99  168:istore_1        
			if(i1 > 0)
	//* 100  169:iload           6
	//* 101  171:ifle            335
			{
				if(l1 != -1L)
	//* 102  174:lload           7
	//* 103  176:ldc2w           #105 <Long -1L>
	//* 104  179:lcmp            
	//* 105  180:ifne            186
	//* 106  183:goto            231
				{
					l2 = trackrenderer1.getDurationUs();
	//  107  186:aload           11
	//  108  188:invokevirtual   #211 <Method long TrackRenderer.getDurationUs()>
	//  109  191:lstore          9
					if(l2 == -1L)
	//* 110  193:lload           9
	//* 111  195:ldc2w           #105 <Long -1L>
	//* 112  198:lcmp            
	//* 113  199:ifne            210
						l1 = -1L;
	//  114  202:ldc2w           #105 <Long -1L>
	//  115  205:lstore          7
					else
	//* 116  207:goto            231
					if(l2 != -2L)
	//* 117  210:lload           9
	//* 118  212:ldc2w           #217 <Long -2L>
	//* 119  215:lcmp            
	//* 120  216:ifne            222
	//* 121  219:goto            231
						l1 = Math.max(l1, l2);
	//  122  222:lload           7
	//  123  224:lload           9
	//  124  226:invokestatic    #308 <Method long Math.max(long, long)>
	//  125  229:lstore          7
				}
				int j1 = selectedTrackIndices[l];
	//  126  231:aload_0         
	//  127  232:getfield        #102 <Field int[] selectedTrackIndices>
	//  128  235:iload_3         
	//  129  236:iaload          
	//  130  237:istore          6
				l2 = l1;
	//  131  239:lload           7
	//  132  241:lstore          9
				flag4 = flag1;
	//  133  243:iload_2         
	//  134  244:istore          5
				flag = flag3;
	//  135  246:iload           4
	//  136  248:istore_1        
				if(j1 >= 0)
	//* 137  249:iload           6
	//* 138  251:iflt            335
				{
					l2 = l1;
	//  139  254:lload           7
	//  140  256:lstore          9
					flag4 = flag1;
	//  141  258:iload_2         
	//  142  259:istore          5
					flag = flag3;
	//  143  261:iload           4
	//  144  263:istore_1        
					if(j1 < amediaformat.length)
	//* 145  264:iload           6
	//* 146  266:aload           12
	//* 147  268:arraylength     
	//* 148  269:icmpge          335
					{
						enableRenderer(trackrenderer1, j1, false);
	//  149  272:aload_0         
	//  150  273:aload           11
	//  151  275:iload           6
	//  152  277:iconst_0        
	//  153  278:invokespecial   #310 <Method void enableRenderer(TrackRenderer, int, boolean)>
						if(flag1 && trackrenderer1.isEnded())
	//* 154  281:iload_2         
	//* 155  282:ifeq            298
	//* 156  285:aload           11
	//* 157  287:invokevirtual   #201 <Method boolean TrackRenderer.isEnded()>
	//* 158  290:ifeq            298
							flag1 = true;
	//  159  293:iconst_1        
	//  160  294:istore_2        
						else
	//* 161  295:goto            300
							flag1 = false;
	//  162  298:iconst_0        
	//  163  299:istore_2        
						if(flag3 && rendererReadyOrEnded(trackrenderer1))
	//* 164  300:iload           4
	//* 165  302:ifeq            326
	//* 166  305:aload_0         
	//* 167  306:aload           11
	//* 168  308:invokespecial   #205 <Method boolean rendererReadyOrEnded(TrackRenderer)>
	//* 169  311:ifeq            326
						{
							flag = true;
	//  170  314:iconst_1        
	//  171  315:istore_1        
							l2 = l1;
	//  172  316:lload           7
	//  173  318:lstore          9
							flag4 = flag1;
	//  174  320:iload_2         
	//  175  321:istore          5
						} else
	//* 176  323:goto            335
						{
							flag = false;
	//  177  326:iconst_0        
	//  178  327:istore_1        
							flag4 = flag1;
	//  179  328:iload_2         
	//  180  329:istore          5
							l2 = l1;
	//  181  331:lload           7
	//  182  333:lstore          9
						}
					}
				}
			}
			l++;
	//  183  335:iload_3         
	//  184  336:iconst_1        
	//  185  337:iadd            
	//  186  338:istore_3        
			l1 = l2;
	//  187  339:lload           9
	//  188  341:lstore          7
			flag1 = flag4;
	//  189  343:iload           5
	//  190  345:istore_2        
			flag3 = flag;
	//  191  346:iload_1         
	//  192  347:istore          4
		} while(true);
	//  193  349:goto            93
		durationUs = l1;
	//  194  352:aload_0         
	//  195  353:lload           7
	//  196  355:putfield        #108 <Field long durationUs>
		if(flag1 && (l1 == -1L || l1 <= positionUs))
	//* 197  358:iload_2         
	//* 198  359:ifeq            389
	//* 199  362:lload           7
	//* 200  364:ldc2w           #105 <Long -1L>
	//* 201  367:lcmp            
	//* 202  368:ifeq            381
	//* 203  371:lload           7
	//* 204  373:aload_0         
	//* 205  374:getfield        #192 <Field long positionUs>
	//* 206  377:lcmp            
	//* 207  378:ifgt            389
		{
			state = 5;
	//  208  381:aload_0         
	//  209  382:iconst_5        
	//  210  383:putfield        #104 <Field int state>
		} else
	//* 211  386:goto            406
		{
			int k;
			if(flag3)
	//* 212  389:iload           4
	//* 213  391:ifeq            399
				k = 4;
	//  214  394:iconst_4        
	//  215  395:istore_1        
			else
	//* 216  396:goto            401
				k = 3;
	//  217  399:iconst_3        
	//  218  400:istore_1        
			state = k;
	//  219  401:aload_0         
	//  220  402:iload_1         
	//  221  403:putfield        #104 <Field int state>
		}
		eventHandler.obtainMessage(1, state, 0, ((Object) (trackFormats))).sendToTarget();
	//  222  406:aload_0         
	//  223  407:getfield        #86  <Field Handler eventHandler>
	//  224  410:iconst_1        
	//  225  411:aload_0         
	//  226  412:getfield        #104 <Field int state>
	//  227  415:iconst_0        
	//  228  416:aload_0         
	//  229  417:getfield        #131 <Field MediaFormat[][] trackFormats>
	//  230  420:invokevirtual   #314 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//  231  423:invokevirtual   #319 <Method void Message.sendToTarget()>
		if(playWhenReady && state == 4)
	//* 232  426:aload_0         
	//* 233  427:getfield        #88  <Field boolean playWhenReady>
	//* 234  430:ifeq            445
	//* 235  433:aload_0         
	//* 236  434:getfield        #104 <Field int state>
	//* 237  437:iconst_4        
	//* 238  438:icmpne          445
			startRenderers();
	//  239  441:aload_0         
	//  240  442:invokespecial   #233 <Method void startRenderers()>
		handler.sendEmptyMessage(7);
	//  241  445:aload_0         
	//  242  446:getfield        #156 <Field Handler handler>
	//  243  449:bipush          7
	//  244  451:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//  245  454:pop             
	//  246  455:return          
	}

	private void prepareInternal(TrackRenderer atrackrenderer[])
		throws ExoPlaybackException
	{
		resetInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #328 <Method void resetInternal()>
		renderers = atrackrenderer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #292 <Field TrackRenderer[] renderers>
		Arrays.fill(((Object []) (trackFormats)), ((Object) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field MediaFormat[][] trackFormats>
	//    7   13:aconst_null     
	//    8   14:invokestatic    #332 <Method void Arrays.fill(Object[], Object)>
		setState(2);
	//    9   17:aload_0         
	//   10   18:iconst_2        
	//   11   19:invokespecial   #227 <Method void setState(int)>
		incrementalPrepareInternal();
	//   12   22:aload_0         
	//   13   23:invokespecial   #334 <Method void incrementalPrepareInternal()>
	//   14   26:return          
	}

	private void release(TrackRenderer trackrenderer)
	{
		try
		{
			trackrenderer.release();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #339 <Method void TrackRenderer.release()>
			return;
	//    2    4:return          
		}
	//*   3    5:astore_1        
	//*   4    6:ldc1            #38  <String "ExoPlayerImplInternal">
	//*   5    8:ldc2            #341 <String "Release failed.">
	//*   6   11:aload_1         
	//*   7   12:invokestatic    #347 <Method int Log.e(String, String, Throwable)>
	//*   8   15:pop             
	//*   9   16:return          
		// Misplaced declaration of an exception variable
		catch(TrackRenderer trackrenderer)
	//*  10   17:astore_1        
		{
			Log.e("ExoPlayerImplInternal", "Release failed.", ((Throwable) (trackrenderer)));
	//   11   18:ldc1            #38  <String "ExoPlayerImplInternal">
	//   12   20:ldc2            #341 <String "Release failed.">
	//   13   23:aload_1         
	//   14   24:invokestatic    #347 <Method int Log.e(String, String, Throwable)>
	//   15   27:pop             
		}
		// Misplaced declaration of an exception variable
		catch(TrackRenderer trackrenderer)
		{
			Log.e("ExoPlayerImplInternal", "Release failed.", ((Throwable) (trackrenderer)));
			return;
		}
	//   16   28:return          
	}

	private void releaseInternal()
	{
		resetInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #328 <Method void resetInternal()>
		setState(1);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #227 <Method void setState(int)>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		released = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #350 <Field boolean released>
		((Object)this).notifyAll();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #353 <Method void Object.notifyAll()>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		Exception exception;
		exception;
	//   15   23:astore_1        
		this;
	//   16   24:aload_0         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		throw exception;
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	private boolean rendererReadyOrEnded(TrackRenderer trackrenderer)
	{
		boolean flag = trackrenderer.isEnded();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #201 <Method boolean TrackRenderer.isEnded()>
	//    2    4:istore_2        
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            13
			return true;
	//    7   11:iconst_1        
	//    8   12:ireturn         
		if(!trackrenderer.isReady())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #356 <Method boolean TrackRenderer.isReady()>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		if(state == 4)
	//*  14   22:aload_0         
	//*  15   23:getfield        #104 <Field int state>
	//*  16   26:iconst_4        
	//*  17   27:icmpne          32
			return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         
		long l1 = trackrenderer.getDurationUs();
	//   20   32:aload_1         
	//   21   33:invokevirtual   #211 <Method long TrackRenderer.getDurationUs()>
	//   22   36:lstore          6
		long l2 = trackrenderer.getBufferedPositionUs();
	//   23   38:aload_1         
	//   24   39:invokevirtual   #214 <Method long TrackRenderer.getBufferedPositionUs()>
	//   25   42:lstore          8
		long l;
		if(rebuffering)
	//*  26   44:aload_0         
	//*  27   45:getfield        #235 <Field boolean rebuffering>
	//*  28   48:ifeq            60
			l = minRebufferUs;
	//   29   51:aload_0         
	//   30   52:getfield        #94  <Field long minRebufferUs>
	//   31   55:lstore          4
		else
	//*  32   57:goto            66
			l = minBufferUs;
	//   33   60:aload_0         
	//   34   61:getfield        #92  <Field long minBufferUs>
	//   35   64:lstore          4
		flag = flag1;
	//   36   66:iload_3         
	//   37   67:istore_2        
		if(l > 0L)
	//*  38   68:lload           4
	//*  39   70:lconst_0        
	//*  40   71:lcmp            
	//*  41   72:ifle            142
		{
			flag = flag1;
	//   42   75:iload_3         
	//   43   76:istore_2        
			if(l2 != -1L)
	//*  44   77:lload           8
	//*  45   79:ldc2w           #105 <Long -1L>
	//*  46   82:lcmp            
	//*  47   83:ifeq            142
			{
				flag = flag1;
	//   48   86:iload_3         
	//   49   87:istore_2        
				if(l2 != -3L)
	//*  50   88:lload           8
	//*  51   90:ldc2w           #215 <Long -3L>
	//*  52   93:lcmp            
	//*  53   94:ifeq            142
				{
					flag = flag1;
	//   54   97:iload_3         
	//   55   98:istore_2        
					if(l2 < positionUs + l)
	//*  56   99:lload           8
	//*  57  101:aload_0         
	//*  58  102:getfield        #192 <Field long positionUs>
	//*  59  105:lload           4
	//*  60  107:ladd            
	//*  61  108:lcmp            
	//*  62  109:ifge            142
					{
						if(l1 != -1L && l1 != -2L && l2 >= l1)
	//*  63  112:lload           6
	//*  64  114:ldc2w           #105 <Long -1L>
	//*  65  117:lcmp            
	//*  66  118:ifeq            140
	//*  67  121:lload           6
	//*  68  123:ldc2w           #217 <Long -2L>
	//*  69  126:lcmp            
	//*  70  127:ifeq            140
	//*  71  130:lload           8
	//*  72  132:lload           6
	//*  73  134:lcmp            
	//*  74  135:iflt            140
							return true;
	//   75  138:iconst_1        
	//   76  139:ireturn         
						flag = false;
	//   77  140:iconst_0        
	//   78  141:istore_2        
					}
				}
			}
		}
		return flag;
	//   79  142:iload_2         
	//   80  143:ireturn         
	}

	private void resetInternal()
	{
		handler.removeMessages(7);
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Handler handler>
	//    2    4:bipush          7
	//    3    6:invokevirtual   #238 <Method void Handler.removeMessages(int)>
		handler.removeMessages(2);
	//    4    9:aload_0         
	//    5   10:getfield        #156 <Field Handler handler>
	//    6   13:iconst_2        
	//    7   14:invokevirtual   #238 <Method void Handler.removeMessages(int)>
		int i = 0;
	//    8   17:iconst_0        
	//    9   18:istore_1        
		rebuffering = false;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #235 <Field boolean rebuffering>
		standaloneMediaClock.stop();
	//   13   24:aload_0         
	//   14   25:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//   15   28:invokevirtual   #357 <Method void StandaloneMediaClock.stop()>
		if(renderers == null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #292 <Field TrackRenderer[] renderers>
	//*  18   35:ifnonnull       39
			return;
	//   19   38:return          
		do
		{
			TrackRenderer atrackrenderer[] = renderers;
	//   20   39:aload_0         
	//   21   40:getfield        #292 <Field TrackRenderer[] renderers>
	//   22   43:astore_2        
			if(i < atrackrenderer.length)
	//*  23   44:iload_1         
	//*  24   45:aload_2         
	//*  25   46:arraylength     
	//*  26   47:icmpge          71
			{
				TrackRenderer trackrenderer = atrackrenderer[i];
	//   27   50:aload_2         
	//   28   51:iload_1         
	//   29   52:aaload          
	//   30   53:astore_2        
				stopAndDisable(trackrenderer);
	//   31   54:aload_0         
	//   32   55:aload_2         
	//   33   56:invokespecial   #360 <Method void stopAndDisable(TrackRenderer)>
				release(trackrenderer);
	//   34   59:aload_0         
	//   35   60:aload_2         
	//   36   61:invokespecial   #362 <Method void release(TrackRenderer)>
				i++;
	//   37   64:iload_1         
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_1        
			} else
	//*  41   68:goto            39
			{
				renderers = null;
	//   42   71:aload_0         
	//   43   72:aconst_null     
	//   44   73:putfield        #292 <Field TrackRenderer[] renderers>
				rendererMediaClock = null;
	//   45   76:aload_0         
	//   46   77:aconst_null     
	//   47   78:putfield        #267 <Field MediaClock rendererMediaClock>
				rendererMediaClockSource = null;
	//   48   81:aload_0         
	//   49   82:aconst_null     
	//   50   83:putfield        #275 <Field TrackRenderer rendererMediaClockSource>
				enabledRenderers.clear();
	//   51   86:aload_0         
	//   52   87:getfield        #127 <Field List enabledRenderers>
	//   53   90:invokeinterface #365 <Method void List.clear()>
				return;
	//   54   95:return          
			}
		} while(true);
	}

	private void scheduleNextOperation(int i, long l, long l1)
	{
		l = (l + l1) - SystemClock.elapsedRealtime();
	//    0    0:lload_2         
	//    1    1:lload           4
	//    2    3:ladd            
	//    3    4:invokestatic    #173 <Method long SystemClock.elapsedRealtime()>
	//    4    7:lsub            
	//    5    8:lstore_2        
		if(l <= 0L)
	//*   6    9:lload_2         
	//*   7   10:lconst_0        
	//*   8   11:lcmp            
	//*   9   12:ifgt            25
		{
			handler.sendEmptyMessage(i);
	//   10   15:aload_0         
	//   11   16:getfield        #156 <Field Handler handler>
	//   12   19:iload_1         
	//   13   20:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//   14   23:pop             
			return;
	//   15   24:return          
		} else
		{
			handler.sendEmptyMessageDelayed(i, l);
	//   16   25:aload_0         
	//   17   26:getfield        #156 <Field Handler handler>
	//   18   29:iload_1         
	//   19   30:lload_2         
	//   20   31:invokevirtual   #369 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//   21   34:pop             
			return;
	//   22   35:return          
		}
	}

	private void seekToInternal(long l)
		throws ExoPlaybackException
	{
		long l1 = positionUs / 1000L;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field long positionUs>
	//    2    4:ldc2w           #89  <Long 1000L>
	//    3    7:ldiv            
	//    4    8:lstore          4
		int i;
		if(l == l1)
	//*   5   10:lload_1         
	//*   6   11:lload           4
	//*   7   13:lcmp            
	//*   8   14:ifne            26
		{
			pendingSeekCount.decrementAndGet();
	//    9   17:aload_0         
	//   10   18:getfield        #120 <Field AtomicInteger pendingSeekCount>
	//   11   21:invokevirtual   #374 <Method int AtomicInteger.decrementAndGet()>
	//   12   24:pop             
			return;
	//   13   25:return          
		}
		i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		rebuffering = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #235 <Field boolean rebuffering>
		positionUs = l * 1000L;
	//   19   33:aload_0         
	//   20   34:lload_1         
	//   21   35:ldc2w           #89  <Long 1000L>
	//   22   38:lmul            
	//   23   39:putfield        #192 <Field long positionUs>
		standaloneMediaClock.stop();
	//   24   42:aload_0         
	//   25   43:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//   26   46:invokevirtual   #357 <Method void StandaloneMediaClock.stop()>
		standaloneMediaClock.setPositionUs(positionUs);
	//   27   49:aload_0         
	//   28   50:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//   29   53:aload_0         
	//   30   54:getfield        #192 <Field long positionUs>
	//   31   57:invokevirtual   #377 <Method void StandaloneMediaClock.setPositionUs(long)>
		if(state == 1 || state == 2)
	//*  32   60:aload_0         
	//*  33   61:getfield        #104 <Field int state>
	//*  34   64:iconst_1        
	//*  35   65:icmpeq          153
	//*  36   68:aload_0         
	//*  37   69:getfield        #104 <Field int state>
	//*  38   72:iconst_2        
	//*  39   73:icmpne          79
			break MISSING_BLOCK_LABEL_153;
	//   40   76:goto            153
_L2:
		if(i >= enabledRenderers.size())
			break; /* Loop/switch isn't completed */
	//   41   79:iload_3         
	//   42   80:aload_0         
	//   43   81:getfield        #127 <Field List enabledRenderers>
	//   44   84:invokeinterface #184 <Method int List.size()>
	//   45   89:icmpge          129
		TrackRenderer trackrenderer = (TrackRenderer)enabledRenderers.get(i);
	//   46   92:aload_0         
	//   47   93:getfield        #127 <Field List enabledRenderers>
	//   48   96:iload_3         
	//   49   97:invokeinterface #188 <Method Object List.get(int)>
	//   50  102:checkcast       #190 <Class TrackRenderer>
	//   51  105:astore          6
		ensureStopped(trackrenderer);
	//   52  107:aload_0         
	//   53  108:aload           6
	//   54  110:invokespecial   #280 <Method void ensureStopped(TrackRenderer)>
		trackrenderer.seekTo(positionUs);
	//   55  113:aload           6
	//   56  115:aload_0         
	//   57  116:getfield        #192 <Field long positionUs>
	//   58  119:invokevirtual   #380 <Method void TrackRenderer.seekTo(long)>
		i++;
	//   59  122:iload_3         
	//   60  123:iconst_1        
	//   61  124:iadd            
	//   62  125:istore_3        
		if(true) goto _L2; else goto _L1
	//   63  126:goto            79
_L1:
		setState(3);
	//   64  129:aload_0         
	//   65  130:iconst_3        
	//   66  131:invokespecial   #227 <Method void setState(int)>
		handler.sendEmptyMessage(7);
	//   67  134:aload_0         
	//   68  135:getfield        #156 <Field Handler handler>
	//   69  138:bipush          7
	//   70  140:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//   71  143:pop             
		pendingSeekCount.decrementAndGet();
	//   72  144:aload_0         
	//   73  145:getfield        #120 <Field AtomicInteger pendingSeekCount>
	//   74  148:invokevirtual   #374 <Method int AtomicInteger.decrementAndGet()>
	//   75  151:pop             
		return;
	//   76  152:return          
		pendingSeekCount.decrementAndGet();
	//   77  153:aload_0         
	//   78  154:getfield        #120 <Field AtomicInteger pendingSeekCount>
	//   79  157:invokevirtual   #374 <Method int AtomicInteger.decrementAndGet()>
	//   80  160:pop             
		return;
	//   81  161:return          
		Exception exception;
		exception;
	//   82  162:astore          6
		pendingSeekCount.decrementAndGet();
	//   83  164:aload_0         
	//   84  165:getfield        #120 <Field AtomicInteger pendingSeekCount>
	//   85  168:invokevirtual   #374 <Method int AtomicInteger.decrementAndGet()>
	//   86  171:pop             
		throw exception;
	//   87  172:aload           6
	//   88  174:athrow          
	}

	private void sendMessageInternal(int i, Object obj)
		throws ExoPlaybackException
	{
		obj = ((Object) ((Pair)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #384 <Class Pair>
	//    2    4:astore_2        
		((ExoPlayer.ExoPlayerComponent)((Pair) (obj)).first).handleMessage(i, ((Pair) (obj)).second);
	//    3    5:aload_2         
	//    4    6:getfield        #388 <Field Object Pair.first>
	//    5    9:checkcast       #390 <Class ExoPlayer$ExoPlayerComponent>
	//    6   12:iload_1         
	//    7   13:aload_2         
	//    8   14:getfield        #393 <Field Object Pair.second>
	//    9   17:invokeinterface #396 <Method void ExoPlayer$ExoPlayerComponent.handleMessage(int, Object)>
		if(state != 1 && state != 2)
	//*  10   22:aload_0         
	//*  11   23:getfield        #104 <Field int state>
	//*  12   26:iconst_1        
	//*  13   27:icmpeq          48
	//*  14   30:aload_0         
	//*  15   31:getfield        #104 <Field int state>
	//*  16   34:iconst_2        
	//*  17   35:icmpeq          48
			handler.sendEmptyMessage(7);
	//   18   38:aload_0         
	//   19   39:getfield        #156 <Field Handler handler>
	//   20   42:bipush          7
	//   21   44:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//   22   47:pop             
		this;
	//   23   48:aload_0         
		JVM INSTR monitorenter ;
	//   24   49:monitorenter    
		customMessagesProcessed = customMessagesProcessed + 1;
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:getfield        #84  <Field int customMessagesProcessed>
	//   28   55:iconst_1        
	//   29   56:iadd            
	//   30   57:putfield        #84  <Field int customMessagesProcessed>
		((Object)this).notifyAll();
	//   31   60:aload_0         
	//   32   61:invokevirtual   #353 <Method void Object.notifyAll()>
		this;
	//   33   64:aload_0         
		JVM INSTR monitorexit ;
	//   34   65:monitorexit     
		return;
	//   35   66:return          
		obj;
	//   36   67:astore_2        
		this;
	//   37   68:aload_0         
		JVM INSTR monitorexit ;
	//   38   69:monitorexit     
		throw obj;
	//   39   70:aload_2         
	//   40   71:athrow          
		obj;
	//   41   72:astore_2        
		this;
	//   42   73:aload_0         
		JVM INSTR monitorenter ;
	//   43   74:monitorenter    
		customMessagesProcessed = customMessagesProcessed + 1;
	//   44   75:aload_0         
	//   45   76:aload_0         
	//   46   77:getfield        #84  <Field int customMessagesProcessed>
	//   47   80:iconst_1        
	//   48   81:iadd            
	//   49   82:putfield        #84  <Field int customMessagesProcessed>
		((Object)this).notifyAll();
	//   50   85:aload_0         
	//   51   86:invokevirtual   #353 <Method void Object.notifyAll()>
		this;
	//   52   89:aload_0         
		JVM INSTR monitorexit ;
	//   53   90:monitorexit     
		throw obj;
	//   54   91:aload_2         
	//   55   92:athrow          
		obj;
	//   56   93:astore_2        
		this;
	//   57   94:aload_0         
		JVM INSTR monitorexit ;
	//   58   95:monitorexit     
		throw obj;
	//   59   96:aload_2         
	//   60   97:athrow          
	}

	private void setPlayWhenReadyInternal(boolean flag)
		throws ExoPlaybackException
	{
		rebuffering = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #235 <Field boolean rebuffering>
		playWhenReady = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #88  <Field boolean playWhenReady>
		if(flag)
			break MISSING_BLOCK_LABEL_25;
	//    6   10:iload_1         
	//    7   11:ifne            25
		stopRenderers();
	//    8   14:aload_0         
	//    9   15:invokespecial   #230 <Method void stopRenderers()>
		updatePositionUs();
	//   10   18:aload_0         
	//   11   19:invokespecial   #178 <Method void updatePositionUs()>
		break MISSING_BLOCK_LABEL_68;
	//   12   22:goto            68
		if(state == 4)
	//*  13   25:aload_0         
	//*  14   26:getfield        #104 <Field int state>
	//*  15   29:iconst_4        
	//*  16   30:icmpne          50
		{
			startRenderers();
	//   17   33:aload_0         
	//   18   34:invokespecial   #233 <Method void startRenderers()>
			handler.sendEmptyMessage(7);
	//   19   37:aload_0         
	//   20   38:getfield        #156 <Field Handler handler>
	//   21   41:bipush          7
	//   22   43:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//   23   46:pop             
			break MISSING_BLOCK_LABEL_68;
	//   24   47:goto            68
		}
		if(state == 3)
	//*  25   50:aload_0         
	//*  26   51:getfield        #104 <Field int state>
	//*  27   54:iconst_3        
	//*  28   55:icmpne          68
			handler.sendEmptyMessage(7);
	//   29   58:aload_0         
	//   30   59:getfield        #156 <Field Handler handler>
	//   31   62:bipush          7
	//   32   64:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//   33   67:pop             
		eventHandler.obtainMessage(3).sendToTarget();
	//   34   68:aload_0         
	//   35   69:getfield        #86  <Field Handler eventHandler>
	//   36   72:iconst_3        
	//   37   73:invokevirtual   #402 <Method Message Handler.obtainMessage(int)>
	//   38   76:invokevirtual   #319 <Method void Message.sendToTarget()>
		return;
	//   39   79:return          
		Exception exception;
		exception;
	//   40   80:astore_2        
		eventHandler.obtainMessage(3).sendToTarget();
	//   41   81:aload_0         
	//   42   82:getfield        #86  <Field Handler eventHandler>
	//   43   85:iconst_3        
	//   44   86:invokevirtual   #402 <Method Message Handler.obtainMessage(int)>
	//   45   89:invokevirtual   #319 <Method void Message.sendToTarget()>
		throw exception;
	//   46   92:aload_2         
	//   47   93:athrow          
	}

	private void setRendererSelectedTrackInternal(int i, int j)
		throws ExoPlaybackException
	{
		int ai[] = selectedTrackIndices;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int[] selectedTrackIndices>
	//    2    4:astore          5
		if(ai[i] == j)
	//*   3    6:aload           5
	//*   4    8:iload_1         
	//*   5    9:iaload          
	//*   6   10:iload_2         
	//*   7   11:icmpne          15
			return;
	//    8   14:return          
		ai[i] = j;
	//    9   15:aload           5
	//   10   17:iload_1         
	//   11   18:iload_2         
	//   12   19:iastore         
		int k = state;
	//   13   20:aload_0         
	//   14   21:getfield        #104 <Field int state>
	//   15   24:istore_3        
		boolean flag1 = true;
	//   16   25:iconst_1        
	//   17   26:istore          4
		if(k != 1)
	//*  18   28:iload_3         
	//*  19   29:iconst_1        
	//*  20   30:icmpeq          234
		{
			if(k == 2)
	//*  21   33:iload_3         
	//*  22   34:iconst_2        
	//*  23   35:icmpne          39
				return;
	//   24   38:return          
			TrackRenderer trackrenderer = renderers[i];
	//   25   39:aload_0         
	//   26   40:getfield        #292 <Field TrackRenderer[] renderers>
	//   27   43:iload_1         
	//   28   44:aaload          
	//   29   45:astore          5
			k = trackrenderer.getState();
	//   30   47:aload           5
	//   31   49:invokevirtual   #283 <Method int TrackRenderer.getState()>
	//   32   52:istore_3        
			if(k != 0 && k != -1)
	//*  33   53:iload_3         
	//*  34   54:ifeq            233
	//*  35   57:iload_3         
	//*  36   58:iconst_m1       
	//*  37   59:icmpeq          233
			{
				if(trackrenderer.getTrackCount() == 0)
	//*  38   62:aload           5
	//*  39   64:invokevirtual   #299 <Method int TrackRenderer.getTrackCount()>
	//*  40   67:ifne            71
					return;
	//   41   70:return          
				boolean flag;
				if(k != 2 && k != 3)
	//*  42   71:iload_3         
	//*  43   72:iconst_2        
	//*  44   73:icmpeq          89
	//*  45   76:iload_3         
	//*  46   77:iconst_3        
	//*  47   78:icmpne          84
	//*  48   81:goto            89
					flag = false;
	//   49   84:iconst_0        
	//   50   85:istore_3        
				else
	//*  51   86:goto            91
					flag = true;
	//   52   89:iconst_1        
	//   53   90:istore_3        
				if(j >= 0 && j < trackFormats[i].length)
	//*  54   91:iload_2         
	//*  55   92:iflt            111
	//*  56   95:iload_2         
	//*  57   96:aload_0         
	//*  58   97:getfield        #131 <Field MediaFormat[][] trackFormats>
	//*  59  100:iload_1         
	//*  60  101:aaload          
	//*  61  102:arraylength     
	//*  62  103:icmpge          111
					i = 1;
	//   63  106:iconst_1        
	//   64  107:istore_1        
				else
	//*  65  108:goto            113
					i = 0;
	//   66  111:iconst_0        
	//   67  112:istore_1        
				if(flag)
	//*  68  113:iload_3         
	//*  69  114:ifeq            164
				{
					if(i == 0 && trackrenderer == rendererMediaClockSource)
	//*  70  117:iload_1         
	//*  71  118:ifne            146
	//*  72  121:aload           5
	//*  73  123:aload_0         
	//*  74  124:getfield        #275 <Field TrackRenderer rendererMediaClockSource>
	//*  75  127:if_acmpne       146
						standaloneMediaClock.setPositionUs(rendererMediaClock.getPositionUs());
	//   76  130:aload_0         
	//   77  131:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//   78  134:aload_0         
	//   79  135:getfield        #267 <Field MediaClock rendererMediaClock>
	//   80  138:invokeinterface #409 <Method long MediaClock.getPositionUs()>
	//   81  143:invokevirtual   #377 <Method void StandaloneMediaClock.setPositionUs(long)>
					ensureDisabled(trackrenderer);
	//   82  146:aload_0         
	//   83  147:aload           5
	//   84  149:invokespecial   #411 <Method void ensureDisabled(TrackRenderer)>
					enabledRenderers.remove(((Object) (trackrenderer)));
	//   85  152:aload_0         
	//   86  153:getfield        #127 <Field List enabledRenderers>
	//   87  156:aload           5
	//   88  158:invokeinterface #414 <Method boolean List.remove(Object)>
	//   89  163:pop             
				}
				if(i != 0)
	//*  90  164:iload_1         
	//*  91  165:ifeq            232
				{
					if(playWhenReady && state == 4)
	//*  92  168:aload_0         
	//*  93  169:getfield        #88  <Field boolean playWhenReady>
	//*  94  172:ifeq            188
	//*  95  175:aload_0         
	//*  96  176:getfield        #104 <Field int state>
	//*  97  179:iconst_4        
	//*  98  180:icmpne          188
						i = 1;
	//   99  183:iconst_1        
	//  100  184:istore_1        
					else
	//* 101  185:goto            190
						i = 0;
	//  102  188:iconst_0        
	//  103  189:istore_1        
					if(flag || i == 0)
	//* 104  190:iload_3         
	//* 105  191:ifne            201
	//* 106  194:iload_1         
	//* 107  195:ifeq            201
	//* 108  198:goto            204
						flag1 = false;
	//  109  201:iconst_0        
	//  110  202:istore          4
					enableRenderer(trackrenderer, j, flag1);
	//  111  204:aload_0         
	//  112  205:aload           5
	//  113  207:iload_2         
	//  114  208:iload           4
	//  115  210:invokespecial   #310 <Method void enableRenderer(TrackRenderer, int, boolean)>
					if(i != 0)
	//* 116  213:iload_1         
	//* 117  214:ifeq            222
						trackrenderer.start();
	//  118  217:aload           5
	//  119  219:invokevirtual   #415 <Method void TrackRenderer.start()>
					handler.sendEmptyMessage(7);
	//  120  222:aload_0         
	//  121  223:getfield        #156 <Field Handler handler>
	//  122  226:bipush          7
	//  123  228:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//  124  231:pop             
				}
				return;
	//  125  232:return          
			} else
			{
				return;
	//  126  233:return          
			}
		} else
		{
			return;
	//  127  234:return          
		}
	}

	private void setState(int i)
	{
		if(state != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field int state>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          26
		{
			state = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #104 <Field int state>
			eventHandler.obtainMessage(2, i, 0).sendToTarget();
	//    7   13:aload_0         
	//    8   14:getfield        #86  <Field Handler eventHandler>
	//    9   17:iconst_2        
	//   10   18:iload_1         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #418 <Method Message Handler.obtainMessage(int, int, int)>
	//   13   23:invokevirtual   #319 <Method void Message.sendToTarget()>
		}
	//   14   26:return          
	}

	private void startRenderers()
		throws ExoPlaybackException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		rebuffering = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #235 <Field boolean rebuffering>
		standaloneMediaClock.start();
	//    5    7:aload_0         
	//    6    8:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//    7   11:invokevirtual   #419 <Method void StandaloneMediaClock.start()>
		for(; i < enabledRenderers.size(); i++)
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #127 <Field List enabledRenderers>
	//*  11   19:invokeinterface #184 <Method int List.size()>
	//*  12   24:icmpge          50
			((TrackRenderer)enabledRenderers.get(i)).start();
	//   13   27:aload_0         
	//   14   28:getfield        #127 <Field List enabledRenderers>
	//   15   31:iload_1         
	//   16   32:invokeinterface #188 <Method Object List.get(int)>
	//   17   37:checkcast       #190 <Class TrackRenderer>
	//   18   40:invokevirtual   #415 <Method void TrackRenderer.start()>

	//   19   43:iload_1         
	//   20   44:iconst_1        
	//   21   45:iadd            
	//   22   46:istore_1        
	//*  23   47:goto            14
	//   24   50:return          
	}

	private void stopAndDisable(TrackRenderer trackrenderer)
	{
		try
		{
			ensureDisabled(trackrenderer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #411 <Method void ensureDisabled(TrackRenderer)>
			return;
	//    3    5:return          
		}
	//*   4    6:astore_1        
	//*   5    7:ldc1            #38  <String "ExoPlayerImplInternal">
	//*   6    9:ldc2            #421 <String "Stop failed.">
	//*   7   12:aload_1         
	//*   8   13:invokestatic    #347 <Method int Log.e(String, String, Throwable)>
	//*   9   16:pop             
	//*  10   17:return          
		// Misplaced declaration of an exception variable
		catch(TrackRenderer trackrenderer)
	//*  11   18:astore_1        
		{
			Log.e("ExoPlayerImplInternal", "Stop failed.", ((Throwable) (trackrenderer)));
	//   12   19:ldc1            #38  <String "ExoPlayerImplInternal">
	//   13   21:ldc2            #421 <String "Stop failed.">
	//   14   24:aload_1         
	//   15   25:invokestatic    #347 <Method int Log.e(String, String, Throwable)>
	//   16   28:pop             
		}
		// Misplaced declaration of an exception variable
		catch(TrackRenderer trackrenderer)
		{
			Log.e("ExoPlayerImplInternal", "Stop failed.", ((Throwable) (trackrenderer)));
			return;
		}
	//   17   29:return          
	}

	private void stopInternal()
	{
		resetInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #328 <Method void resetInternal()>
		setState(1);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #227 <Method void setState(int)>
	//    5    9:return          
	}

	private void stopRenderers()
		throws ExoPlaybackException
	{
		standaloneMediaClock.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//    2    4:invokevirtual   #357 <Method void StandaloneMediaClock.stop()>
		for(int i = 0; i < enabledRenderers.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #127 <Field List enabledRenderers>
	//*   8   14:invokeinterface #184 <Method int List.size()>
	//*   9   19:icmpge          46
			ensureStopped((TrackRenderer)enabledRenderers.get(i));
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #127 <Field List enabledRenderers>
	//   13   27:iload_1         
	//   14   28:invokeinterface #188 <Method Object List.get(int)>
	//   15   33:checkcast       #190 <Class TrackRenderer>
	//   16   36:invokespecial   #280 <Method void ensureStopped(TrackRenderer)>

	//   17   39:iload_1         
	//   18   40:iconst_1        
	//   19   41:iadd            
	//   20   42:istore_1        
	//*  21   43:goto            9
	//   22   46:return          
	}

	private void updatePositionUs()
	{
		if(rendererMediaClock != null && enabledRenderers.contains(((Object) (rendererMediaClockSource))) && !rendererMediaClockSource.isEnded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #267 <Field MediaClock rendererMediaClock>
	//*   2    4:ifnull          60
	//*   3    7:aload_0         
	//*   4    8:getfield        #127 <Field List enabledRenderers>
	//*   5   11:aload_0         
	//*   6   12:getfield        #275 <Field TrackRenderer rendererMediaClockSource>
	//*   7   15:invokeinterface #425 <Method boolean List.contains(Object)>
	//*   8   20:ifeq            60
	//*   9   23:aload_0         
	//*  10   24:getfield        #275 <Field TrackRenderer rendererMediaClockSource>
	//*  11   27:invokevirtual   #201 <Method boolean TrackRenderer.isEnded()>
	//*  12   30:ifne            60
		{
			positionUs = rendererMediaClock.getPositionUs();
	//   13   33:aload_0         
	//   14   34:aload_0         
	//   15   35:getfield        #267 <Field MediaClock rendererMediaClock>
	//   16   38:invokeinterface #409 <Method long MediaClock.getPositionUs()>
	//   17   43:putfield        #192 <Field long positionUs>
			standaloneMediaClock.setPositionUs(positionUs);
	//   18   46:aload_0         
	//   19   47:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//   20   50:aload_0         
	//   21   51:getfield        #192 <Field long positionUs>
	//   22   54:invokevirtual   #377 <Method void StandaloneMediaClock.setPositionUs(long)>
		} else
	//*  23   57:goto            71
		{
			positionUs = standaloneMediaClock.getPositionUs();
	//   24   60:aload_0         
	//   25   61:aload_0         
	//   26   62:getfield        #115 <Field StandaloneMediaClock standaloneMediaClock>
	//   27   65:invokevirtual   #426 <Method long StandaloneMediaClock.getPositionUs()>
	//   28   68:putfield        #192 <Field long positionUs>
		}
		elapsedRealtimeUs = SystemClock.elapsedRealtime() * 1000L;
	//   29   71:aload_0         
	//   30   72:invokestatic    #173 <Method long SystemClock.elapsedRealtime()>
	//   31   75:ldc2w           #89  <Long 1000L>
	//   32   78:lmul            
	//   33   79:putfield        #194 <Field long elapsedRealtimeUs>
	//   34   82:return          
	}

	public void blockingSendMessage(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i, Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!released)
			break MISSING_BLOCK_LABEL_52;
	//    2    2:aload_0         
	//    3    3:getfield        #350 <Field boolean released>
	//    4    6:ifeq            52
		exoplayercomponent = ((ExoPlayer.ExoPlayerComponent) (new StringBuilder()));
	//    5    9:new             #432 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #433 <Method void StringBuilder()>
	//    8   16:astore_1        
		((StringBuilder) (exoplayercomponent)).append("Sent message(");
	//    9   17:aload_1         
	//   10   18:ldc2            #435 <String "Sent message(">
	//   11   21:invokevirtual   #439 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (exoplayercomponent)).append(i);
	//   13   25:aload_1         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #442 <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
		((StringBuilder) (exoplayercomponent)).append(") after release. Message ignored.");
	//   17   31:aload_1         
	//   18   32:ldc2            #444 <String ") after release. Message ignored.">
	//   19   35:invokevirtual   #439 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		Log.w("ExoPlayerImplInternal", ((StringBuilder) (exoplayercomponent)).toString());
	//   21   39:ldc1            #38  <String "ExoPlayerImplInternal">
	//   22   41:aload_1         
	//   23   42:invokevirtual   #448 <Method String StringBuilder.toString()>
	//   24   45:invokestatic    #452 <Method int Log.w(String, String)>
	//   25   48:pop             
		this;
	//   26   49:aload_0         
		JVM INSTR monitorexit ;
	//   27   50:monitorexit     
		return;
	//   28   51:return          
		int j;
		j = customMessagesSent;
	//   29   52:aload_0         
	//   30   53:getfield        #82  <Field int customMessagesSent>
	//   31   56:istore          4
		customMessagesSent = j + 1;
	//   32   58:aload_0         
	//   33   59:iload           4
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:putfield        #82  <Field int customMessagesSent>
		handler.obtainMessage(9, i, 0, ((Object) (Pair.create(((Object) (exoplayercomponent)), obj)))).sendToTarget();
	//   37   66:aload_0         
	//   38   67:getfield        #156 <Field Handler handler>
	//   39   70:bipush          9
	//   40   72:iload_2         
	//   41   73:iconst_0        
	//   42   74:aload_1         
	//   43   75:aload_3         
	//   44   76:invokestatic    #456 <Method Pair Pair.create(Object, Object)>
	//   45   79:invokevirtual   #314 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   46   82:invokevirtual   #319 <Method void Message.sendToTarget()>
_L3:
		i = customMessagesProcessed;
	//   47   85:aload_0         
	//   48   86:getfield        #84  <Field int customMessagesProcessed>
	//   49   89:istore_2        
		if(i > j) goto _L2; else goto _L1
	//   50   90:iload_2         
	//   51   91:iload           4
	//   52   93:icmpgt          112
_L1:
		((Object)this).wait();
	//   53   96:aload_0         
	//   54   97:invokevirtual   #459 <Method void Object.wait()>
		  goto _L3
	//*  55  100:goto            85
_L4:
		Thread.currentThread().interrupt();
	//   56  103:invokestatic    #465 <Method Thread Thread.currentThread()>
	//   57  106:invokevirtual   #468 <Method void Thread.interrupt()>
		  goto _L3
	//*  58  109:goto            85
_L2:
		this;
	//   59  112:aload_0         
		JVM INSTR monitorexit ;
	//   60  113:monitorexit     
		return;
	//   61  114:return          
		exoplayercomponent;
	//   62  115:astore_1        
	//*  63  116:aload_0         
		throw exoplayercomponent;
	//   64  117:monitorexit     
	//   65  118:aload_1         
	//   66  119:athrow          
		exoplayercomponent;
	//   67  120:astore_1        
		  goto _L4
	//*  68  121:goto            103
	}

	public long getBufferedPosition()
	{
		if(bufferedPositionUs == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field long bufferedPositionUs>
	//*   2    4:ldc2w           #105 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            15
			return -1L;
	//    5   11:ldc2w           #105 <Long -1L>
	//    6   14:lreturn         
		else
			return bufferedPositionUs / 1000L;
	//    7   15:aload_0         
	//    8   16:getfield        #110 <Field long bufferedPositionUs>
	//    9   19:ldc2w           #89  <Long 1000L>
	//   10   22:ldiv            
	//   11   23:lreturn         
	}

	public long getCurrentPosition()
	{
		if(pendingSeekCount.get() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field AtomicInteger pendingSeekCount>
	//*   2    4:invokevirtual   #472 <Method int AtomicInteger.get()>
	//*   3    7:ifle            15
			return lastSeekPositionMs;
	//    4   10:aload_0         
	//    5   11:getfield        #474 <Field long lastSeekPositionMs>
	//    6   14:lreturn         
		else
			return positionUs / 1000L;
	//    7   15:aload_0         
	//    8   16:getfield        #192 <Field long positionUs>
	//    9   19:ldc2w           #89  <Long 1000L>
	//   10   22:ldiv            
	//   11   23:lreturn         
	}

	public long getDuration()
	{
		if(durationUs == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field long durationUs>
	//*   2    4:ldc2w           #105 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            15
			return -1L;
	//    5   11:ldc2w           #105 <Long -1L>
	//    6   14:lreturn         
		else
			return durationUs / 1000L;
	//    7   15:aload_0         
	//    8   16:getfield        #108 <Field long durationUs>
	//    9   19:ldc2w           #89  <Long 1000L>
	//   10   22:ldiv            
	//   11   23:lreturn         
	}

	public Looper getPlaybackLooper()
	{
		return internalPlaybackThread.getLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field HandlerThread internalPlaybackThread>
	//    2    4:invokevirtual   #151 <Method Looper HandlerThread.getLooper()>
	//    3    7:areturn         
	}

	public boolean handleMessage(Message message)
	{
		int i;
		boolean flag;
		try
		{
			i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #480 <Field int Message.what>
	//    2    4:istore_2        
		}
	//*   3    5:iconst_0        
	//*   4    6:istore_3        
	//*   5    7:iload_2         
	//*   6    8:tableswitch     1 9: default 227
	//	               1 145
	//	               2 139
	//	               3 123
	//	               4 117
	//	               5 111
	//	               6 94
	//	               7 88
	//	               8 74
	//	               9 60
	//*   7   60:aload_0         
	//*   8   61:aload_1         
	//*   9   62:getfield        #483 <Field int Message.arg1>
	//*  10   65:aload_1         
	//*  11   66:getfield        #486 <Field Object Message.obj>
	//*  12   69:invokespecial   #488 <Method void sendMessageInternal(int, Object)>
	//*  13   72:iconst_1        
	//*  14   73:ireturn         
	//*  15   74:aload_0         
	//*  16   75:aload_1         
	//*  17   76:getfield        #483 <Field int Message.arg1>
	//*  18   79:aload_1         
	//*  19   80:getfield        #491 <Field int Message.arg2>
	//*  20   83:invokespecial   #493 <Method void setRendererSelectedTrackInternal(int, int)>
	//*  21   86:iconst_1        
	//*  22   87:ireturn         
	//*  23   88:aload_0         
	//*  24   89:invokespecial   #495 <Method void doSomeWork()>
	//*  25   92:iconst_1        
	//*  26   93:ireturn         
	//*  27   94:aload_0         
	//*  28   95:aload_1         
	//*  29   96:getfield        #483 <Field int Message.arg1>
	//*  30   99:aload_1         
	//*  31  100:getfield        #491 <Field int Message.arg2>
	//*  32  103:invokestatic    #501 <Method long Util.getLong(int, int)>
	//*  33  106:invokespecial   #503 <Method void seekToInternal(long)>
	//*  34  109:iconst_1        
	//*  35  110:ireturn         
	//*  36  111:aload_0         
	//*  37  112:invokespecial   #505 <Method void releaseInternal()>
	//*  38  115:iconst_1        
	//*  39  116:ireturn         
	//*  40  117:aload_0         
	//*  41  118:invokespecial   #507 <Method void stopInternal()>
	//*  42  121:iconst_1        
	//*  43  122:ireturn         
	//*  44  123:aload_1         
	//*  45  124:getfield        #483 <Field int Message.arg1>
	//*  46  127:ifeq            132
	//*  47  130:iconst_1        
	//*  48  131:istore_3        
	//*  49  132:aload_0         
	//*  50  133:iload_3         
	//*  51  134:invokespecial   #509 <Method void setPlayWhenReadyInternal(boolean)>
	//*  52  137:iconst_1        
	//*  53  138:ireturn         
	//*  54  139:aload_0         
	//*  55  140:invokespecial   #334 <Method void incrementalPrepareInternal()>
	//*  56  143:iconst_1        
	//*  57  144:ireturn         
	//*  58  145:aload_0         
	//*  59  146:aload_1         
	//*  60  147:getfield        #486 <Field Object Message.obj>
	//*  61  150:checkcast       #510 <Class TrackRenderer[]>
	//*  62  153:checkcast       #510 <Class TrackRenderer[]>
	//*  63  156:invokespecial   #512 <Method void prepareInternal(TrackRenderer[])>
	//*  64  159:iconst_1        
	//*  65  160:ireturn         
	//*  66  161:astore_1        
	//*  67  162:ldc1            #38  <String "ExoPlayerImplInternal">
	//*  68  164:ldc2            #514 <String "Internal runtime error.">
	//*  69  167:aload_1         
	//*  70  168:invokestatic    #347 <Method int Log.e(String, String, Throwable)>
	//*  71  171:pop             
	//*  72  172:aload_0         
	//*  73  173:getfield        #86  <Field Handler eventHandler>
	//*  74  176:iconst_4        
	//*  75  177:new             #160 <Class ExoPlaybackException>
	//*  76  180:dup             
	//*  77  181:aload_1         
	//*  78  182:iconst_1        
	//*  79  183:invokespecial   #517 <Method void ExoPlaybackException(Throwable, boolean)>
	//*  80  186:invokevirtual   #520 <Method Message Handler.obtainMessage(int, Object)>
	//*  81  189:invokevirtual   #319 <Method void Message.sendToTarget()>
	//*  82  192:aload_0         
	//*  83  193:invokespecial   #507 <Method void stopInternal()>
	//*  84  196:iconst_1        
	//*  85  197:ireturn         
		// Misplaced declaration of an exception variable
		catch(Message message)
	//*  86  198:astore_1        
		{
			Log.e("ExoPlayerImplInternal", "Internal track renderer error.", ((Throwable) (message)));
	//   87  199:ldc1            #38  <String "ExoPlayerImplInternal">
	//   88  201:ldc2            #522 <String "Internal track renderer error.">
	//   89  204:aload_1         
	//   90  205:invokestatic    #347 <Method int Log.e(String, String, Throwable)>
	//   91  208:pop             
			eventHandler.obtainMessage(4, ((Object) (message))).sendToTarget();
	//   92  209:aload_0         
	//   93  210:getfield        #86  <Field Handler eventHandler>
	//   94  213:iconst_4        
	//   95  214:aload_1         
	//   96  215:invokevirtual   #520 <Method Message Handler.obtainMessage(int, Object)>
	//   97  218:invokevirtual   #319 <Method void Message.sendToTarget()>
			stopInternal();
	//   98  221:aload_0         
	//   99  222:invokespecial   #507 <Method void stopInternal()>
			return true;
	//  100  225:iconst_1        
	//  101  226:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Message message)
		{
			Log.e("ExoPlayerImplInternal", "Internal runtime error.", ((Throwable) (message)));
			eventHandler.obtainMessage(4, ((Object) (new ExoPlaybackException(((Throwable) (message)), true)))).sendToTarget();
			stopInternal();
			return true;
		}
		flag = false;
		i;
		JVM INSTR tableswitch 1 9: default 227
	//	               1 145
	//	               2 139
	//	               3 123
	//	               4 117
	//	               5 111
	//	               6 94
	//	               7 88
	//	               8 74
	//	               9 60;
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L10:
		sendMessageInternal(message.arg1, message.obj);
		return true;
_L9:
		setRendererSelectedTrackInternal(message.arg1, message.arg2);
		return true;
_L8:
		doSomeWork();
		return true;
_L7:
		seekToInternal(Util.getLong(message.arg1, message.arg2));
		return true;
_L6:
		releaseInternal();
		return true;
_L5:
		stopInternal();
		return true;
_L4:
		if(message.arg1 != 0)
			flag = true;
		setPlayWhenReadyInternal(flag);
		return true;
_L3:
		incrementalPrepareInternal();
		return true;
_L2:
		prepareInternal((TrackRenderer[])(TrackRenderer[])message.obj);
		return true;
_L1:
		return false;
	//  102  227:iconst_0        
	//  103  228:ireturn         
	}

	public transient void prepare(TrackRenderer atrackrenderer[])
	{
		handler.obtainMessage(1, ((Object) (atrackrenderer))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Handler handler>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #520 <Method Message Handler.obtainMessage(int, Object)>
	//    5    9:invokevirtual   #319 <Method void Message.sendToTarget()>
	//    6   12:return          
	}

	public void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = released;
	//    2    2:aload_0         
	//    3    3:getfield        #350 <Field boolean released>
	//    4    6:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_1         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		handler.sendEmptyMessage(5);
	//   10   14:aload_0         
	//   11   15:getfield        #156 <Field Handler handler>
	//   12   18:iconst_5        
	//   13   19:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//   14   22:pop             
_L3:
		flag = released;
	//   15   23:aload_0         
	//   16   24:getfield        #350 <Field boolean released>
	//   17   27:istore_1        
		if(flag) goto _L2; else goto _L1
	//   18   28:iload_1         
	//   19   29:ifne            48
_L1:
		((Object)this).wait();
	//   20   32:aload_0         
	//   21   33:invokevirtual   #459 <Method void Object.wait()>
		  goto _L3
	//*  22   36:goto            23
_L4:
		Thread.currentThread().interrupt();
	//   23   39:invokestatic    #465 <Method Thread Thread.currentThread()>
	//   24   42:invokevirtual   #468 <Method void Thread.interrupt()>
		  goto _L3
	//*  25   45:goto            23
_L2:
		internalPlaybackThread.quit();
	//   26   48:aload_0         
	//   27   49:getfield        #140 <Field HandlerThread internalPlaybackThread>
	//   28   52:invokevirtual   #525 <Method boolean HandlerThread.quit()>
	//   29   55:pop             
		this;
	//   30   56:aload_0         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		return;
	//   32   58:return          
		Object obj;
		obj;
	//   33   59:astore_2        
	//*  34   60:aload_0         
		throw obj;
	//   35   61:monitorexit     
	//   36   62:aload_2         
	//   37   63:athrow          
		obj;
	//   38   64:astore_2        
		  goto _L4
	//*  39   65:goto            39
	}

	public void seekTo(long l)
	{
		lastSeekPositionMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #474 <Field long lastSeekPositionMs>
		pendingSeekCount.incrementAndGet();
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field AtomicInteger pendingSeekCount>
	//    5    9:invokevirtual   #528 <Method int AtomicInteger.incrementAndGet()>
	//    6   12:pop             
		handler.obtainMessage(6, Util.getTopInt(l), Util.getBottomInt(l)).sendToTarget();
	//    7   13:aload_0         
	//    8   14:getfield        #156 <Field Handler handler>
	//    9   17:bipush          6
	//   10   19:lload_1         
	//   11   20:invokestatic    #531 <Method int Util.getTopInt(long)>
	//   12   23:lload_1         
	//   13   24:invokestatic    #534 <Method int Util.getBottomInt(long)>
	//   14   27:invokevirtual   #418 <Method Message Handler.obtainMessage(int, int, int)>
	//   15   30:invokevirtual   #319 <Method void Message.sendToTarget()>
	//   16   33:return          
	}

	public void sendMessage(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i, Object obj)
	{
		customMessagesSent = customMessagesSent + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field int customMessagesSent>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #82  <Field int customMessagesSent>
		handler.obtainMessage(9, i, 0, ((Object) (Pair.create(((Object) (exoplayercomponent)), obj)))).sendToTarget();
	//    6   10:aload_0         
	//    7   11:getfield        #156 <Field Handler handler>
	//    8   14:bipush          9
	//    9   16:iload_2         
	//   10   17:iconst_0        
	//   11   18:aload_1         
	//   12   19:aload_3         
	//   13   20:invokestatic    #456 <Method Pair Pair.create(Object, Object)>
	//   14   23:invokevirtual   #314 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   15   26:invokevirtual   #319 <Method void Message.sendToTarget()>
	//   16   29:return          
	}

	public void setPlayWhenReady(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #337 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #538 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #542 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void setRendererSelectedTrack(int i, int j)
	{
		handler.obtainMessage(8, i, j).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Handler handler>
	//    2    4:bipush          8
	//    3    6:iload_1         
	//    4    7:iload_2         
	//    5    8:invokevirtual   #418 <Method Message Handler.obtainMessage(int, int, int)>
	//    6   11:invokevirtual   #319 <Method void Message.sendToTarget()>
	//    7   14:return          
	}

	public void stop()
	{
		handler.sendEmptyMessage(4);
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Handler handler>
	//    2    4:iconst_4        
	//    3    5:invokevirtual   #323 <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	private static final int IDLE_INTERVAL_MS = 1000;
	private static final int MSG_CUSTOM = 9;
	private static final int MSG_DO_SOME_WORK = 7;
	public static final int MSG_ERROR = 4;
	private static final int MSG_INCREMENTAL_PREPARE = 2;
	private static final int MSG_PREPARE = 1;
	public static final int MSG_PREPARED = 1;
	private static final int MSG_RELEASE = 5;
	private static final int MSG_SEEK_TO = 6;
	private static final int MSG_SET_PLAY_WHEN_READY = 3;
	public static final int MSG_SET_PLAY_WHEN_READY_ACK = 3;
	private static final int MSG_SET_RENDERER_SELECTED_TRACK = 8;
	public static final int MSG_STATE_CHANGED = 2;
	private static final int MSG_STOP = 4;
	private static final int PREPARE_INTERVAL_MS = 10;
	private static final int RENDERING_INTERVAL_MS = 10;
	private static final String TAG = "ExoPlayerImplInternal";
	private volatile long bufferedPositionUs;
	private int customMessagesProcessed;
	private int customMessagesSent;
	private volatile long durationUs;
	private long elapsedRealtimeUs;
	private final List enabledRenderers;
	private final Handler eventHandler;
	private final Handler handler;
	private final HandlerThread internalPlaybackThread = new PriorityHandlerThread("ExoPlayerImplInternal:Handler", -16);
	private long lastSeekPositionMs;
	private final long minBufferUs;
	private final long minRebufferUs;
	private final AtomicInteger pendingSeekCount = new AtomicInteger();
	private boolean playWhenReady;
	private volatile long positionUs;
	private boolean rebuffering;
	private boolean released;
	private MediaClock rendererMediaClock;
	private TrackRenderer rendererMediaClockSource;
	private TrackRenderer renderers[];
	private final int selectedTrackIndices[];
	private final StandaloneMediaClock standaloneMediaClock = new StandaloneMediaClock();
	private int state;
	private final MediaFormat trackFormats[][];
}
