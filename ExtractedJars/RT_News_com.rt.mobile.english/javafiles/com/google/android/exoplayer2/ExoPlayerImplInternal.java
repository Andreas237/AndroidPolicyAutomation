// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2:
//			MediaPeriodQueue, LoadControl, SeekParameters, PlaybackInfo, 
//			Timeline, RendererCapabilities, Renderer, DefaultMediaClock, 
//			ExoPlaybackException, PlayerMessage, MediaPeriodHolder, MediaPeriodInfo, 
//			Format, PlaybackParameters, C, IllegalSeekPositionException, 
//			RendererConfiguration, ExoPlayer

final class ExoPlayerImplInternal
	implements android.os.Handler.Callback, com.google.android.exoplayer2.source.MediaPeriod.Callback, com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener, com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener, DefaultMediaClock.PlaybackParameterListener, PlayerMessage.Sender
{
	private static final class MediaSourceRefreshInfo
	{

		public final Object manifest;
		public final MediaSource source;
		public final Timeline timeline;

		public MediaSourceRefreshInfo(MediaSource mediasource, Timeline timeline1, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			source = mediasource;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field MediaSource source>
			timeline = timeline1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Timeline timeline>
			manifest = obj;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field Object manifest>
		//   11   19:return          
		}
	}

	private static final class PendingMessageInfo
		implements Comparable
	{

		public int compareTo(PendingMessageInfo pendingmessageinfo)
		{
			Object obj = resolvedPeriodUid;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field Object resolvedPeriodUid>
		//    2    4:astore          5
			boolean flag1 = true;
		//    3    6:iconst_1        
		//    4    7:istore          4
			int i;
			if(obj == null)
		//*   5    9:aload           5
		//*   6   11:ifnonnull       19
				i = 1;
		//    7   14:iconst_1        
		//    8   15:istore_2        
			else
		//*   9   16:goto            21
				i = 0;
		//   10   19:iconst_0        
		//   11   20:istore_2        
			boolean flag;
			if(pendingmessageinfo.resolvedPeriodUid == null)
		//*  12   21:aload_1         
		//*  13   22:getfield        #32  <Field Object resolvedPeriodUid>
		//*  14   25:ifnonnull       33
				flag = true;
		//   15   28:iconst_1        
		//   16   29:istore_3        
			else
		//*  17   30:goto            35
				flag = false;
		//   18   33:iconst_0        
		//   19   34:istore_3        
			if(i != flag)
		//*  20   35:iload_2         
		//*  21   36:iload_3         
		//*  22   37:icmpeq          54
			{
				i = ((int) (flag1));
		//   23   40:iload           4
		//   24   42:istore_2        
				if(resolvedPeriodUid != null)
		//*  25   43:aload_0         
		//*  26   44:getfield        #32  <Field Object resolvedPeriodUid>
		//*  27   47:ifnull          52
					i = -1;
		//   28   50:iconst_m1       
		//   29   51:istore_2        
				return i;
		//   30   52:iload_2         
		//   31   53:ireturn         
			}
			if(resolvedPeriodUid == null)
		//*  32   54:aload_0         
		//*  33   55:getfield        #32  <Field Object resolvedPeriodUid>
		//*  34   58:ifnonnull       63
				return 0;
		//   35   61:iconst_0        
		//   36   62:ireturn         
			i = resolvedPeriodIndex - pendingmessageinfo.resolvedPeriodIndex;
		//   37   63:aload_0         
		//   38   64:getfield        #34  <Field int resolvedPeriodIndex>
		//   39   67:aload_1         
		//   40   68:getfield        #34  <Field int resolvedPeriodIndex>
		//   41   71:isub            
		//   42   72:istore_2        
			if(i != 0)
		//*  43   73:iload_2         
		//*  44   74:ifeq            79
				return i;
		//   45   77:iload_2         
		//   46   78:ireturn         
			else
				return Util.compareLong(resolvedPeriodTimeUs, pendingmessageinfo.resolvedPeriodTimeUs);
		//   47   79:aload_0         
		//   48   80:getfield        #36  <Field long resolvedPeriodTimeUs>
		//   49   83:aload_1         
		//   50   84:getfield        #36  <Field long resolvedPeriodTimeUs>
		//   51   87:invokestatic    #42  <Method int Util.compareLong(long, long)>
		//   52   90:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((PendingMessageInfo)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class ExoPlayerImplInternal$PendingMessageInfo>
		//    3    5:invokevirtual   #46  <Method int compareTo(ExoPlayerImplInternal$PendingMessageInfo)>
		//    4    8:ireturn         
		}

		public void setResolvedPosition(int i, long l, Object obj)
		{
			resolvedPeriodIndex = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #34  <Field int resolvedPeriodIndex>
			resolvedPeriodTimeUs = l;
		//    3    5:aload_0         
		//    4    6:lload_2         
		//    5    7:putfield        #36  <Field long resolvedPeriodTimeUs>
			resolvedPeriodUid = obj;
		//    6   10:aload_0         
		//    7   11:aload           4
		//    8   13:putfield        #32  <Field Object resolvedPeriodUid>
		//    9   16:return          
		}

		public final PlayerMessage message;
		public int resolvedPeriodIndex;
		public long resolvedPeriodTimeUs;
		public Object resolvedPeriodUid;

		public PendingMessageInfo(PlayerMessage playermessage)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			message = playermessage;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field PlayerMessage message>
		//    5    9:return          
		}
	}

	private static final class PlaybackInfoUpdate
	{

		public boolean hasPendingUpdate(PlaybackInfo playbackinfo)
		{
			return playbackinfo != lastPlaybackInfo || operationAcks > 0 || positionDiscontinuity;
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #36  <Field PlaybackInfo lastPlaybackInfo>
		//    3    5:if_acmpne       27
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field int operationAcks>
		//    6   12:ifgt            27
		//    7   15:aload_0         
		//    8   16:getfield        #29  <Field boolean positionDiscontinuity>
		//    9   19:ifeq            25
		//   10   22:goto            27
		//   11   25:iconst_0        
		//   12   26:ireturn         
		//   13   27:iconst_1        
		//   14   28:ireturn         
		}

		public void incrementPendingOperationAcks(int i)
		{
			operationAcks = operationAcks + i;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #25  <Field int operationAcks>
		//    3    5:iload_1         
		//    4    6:iadd            
		//    5    7:putfield        #25  <Field int operationAcks>
		//    6   10:return          
		}

		public void reset(PlaybackInfo playbackinfo)
		{
			lastPlaybackInfo = playbackinfo;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field PlaybackInfo lastPlaybackInfo>
			operationAcks = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int operationAcks>
			positionDiscontinuity = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #29  <Field boolean positionDiscontinuity>
		//    9   15:return          
		}

		public void setPositionDiscontinuity(int i)
		{
			boolean flag1 = positionDiscontinuity;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field boolean positionDiscontinuity>
		//    2    4:istore_3        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore_2        
			if(flag1 && discontinuityReason != 4)
		//*   5    7:iload_3         
		//*   6    8:ifeq            34
		//*   7   11:aload_0         
		//*   8   12:getfield        #32  <Field int discontinuityReason>
		//*   9   15:iconst_4        
		//*  10   16:icmpeq          34
			{
				if(i != 4)
		//*  11   19:iload_1         
		//*  12   20:iconst_4        
		//*  13   21:icmpne          27
		//*  14   24:goto            29
					flag = false;
		//   15   27:iconst_0        
		//   16   28:istore_2        
				Assertions.checkArgument(flag);
		//   17   29:iload_2         
		//   18   30:invokestatic    #47  <Method void Assertions.checkArgument(boolean)>
				return;
		//   19   33:return          
			} else
			{
				positionDiscontinuity = true;
		//   20   34:aload_0         
		//   21   35:iconst_1        
		//   22   36:putfield        #29  <Field boolean positionDiscontinuity>
				discontinuityReason = i;
		//   23   39:aload_0         
		//   24   40:iload_1         
		//   25   41:putfield        #32  <Field int discontinuityReason>
				return;
		//   26   44:return          
			}
		}

		private int discontinuityReason;
		private PlaybackInfo lastPlaybackInfo;
		private int operationAcks;
		private boolean positionDiscontinuity;


/*
		static int access$100(PlaybackInfoUpdate playbackinfoupdate)
		{
			return playbackinfoupdate.operationAcks;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int operationAcks>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$200(PlaybackInfoUpdate playbackinfoupdate)
		{
			return playbackinfoupdate.positionDiscontinuity;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field boolean positionDiscontinuity>
		//    2    4:ireturn         
		}

*/


/*
		static int access$300(PlaybackInfoUpdate playbackinfoupdate)
		{
			return playbackinfoupdate.discontinuityReason;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int discontinuityReason>
		//    2    4:ireturn         
		}

*/

		private PlaybackInfoUpdate()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}

	}

	private static final class SeekPosition
	{

		public final Timeline timeline;
		public final int windowIndex;
		public final long windowPositionUs;

		public SeekPosition(Timeline timeline1, int i, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			timeline = timeline1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Timeline timeline>
			windowIndex = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int windowIndex>
			windowPositionUs = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #24  <Field long windowPositionUs>
		//   11   19:return          
		}
	}


	public ExoPlayerImplInternal(Renderer arenderer[], TrackSelector trackselector, TrackSelectorResult trackselectorresult, LoadControl loadcontrol, boolean flag, int i, boolean flag1, 
			Handler handler1, ExoPlayer exoplayer, Clock clock1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void Object()>
		renderers = arenderer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #135 <Field Renderer[] renderers>
		trackSelector = trackselector;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #137 <Field TrackSelector trackSelector>
		emptyTrackSelectorResult = trackselectorresult;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #139 <Field TrackSelectorResult emptyTrackSelectorResult>
		loadControl = loadcontrol;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #141 <Field LoadControl loadControl>
		playWhenReady = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #143 <Field boolean playWhenReady>
		repeatMode = i;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #145 <Field int repeatMode>
		shuffleModeEnabled = flag1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #147 <Field boolean shuffleModeEnabled>
		eventHandler = handler1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #149 <Field Handler eventHandler>
		player = exoplayer;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #151 <Field ExoPlayer player>
		clock = clock1;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #153 <Field Clock clock>
	//   32   61:aload_0         
	//   33   62:new             #155 <Class MediaPeriodQueue>
	//   34   65:dup             
	//   35   66:invokespecial   #156 <Method void MediaPeriodQueue()>
	//   36   69:putfield        #158 <Field MediaPeriodQueue queue>
		backBufferDurationUs = loadcontrol.getBackBufferDurationUs();
	//   37   72:aload_0         
	//   38   73:aload           4
	//   39   75:invokeinterface #164 <Method long LoadControl.getBackBufferDurationUs()>
	//   40   80:putfield        #166 <Field long backBufferDurationUs>
		retainBackBufferFromKeyframe = loadcontrol.retainBackBufferFromKeyframe();
	//   41   83:aload_0         
	//   42   84:aload           4
	//   43   86:invokeinterface #169 <Method boolean LoadControl.retainBackBufferFromKeyframe()>
	//   44   91:putfield        #171 <Field boolean retainBackBufferFromKeyframe>
		seekParameters = SeekParameters.DEFAULT;
	//   45   94:aload_0         
	//   46   95:getstatic       #176 <Field SeekParameters SeekParameters.DEFAULT>
	//   47   98:putfield        #178 <Field SeekParameters seekParameters>
		playbackInfo = new PlaybackInfo(Timeline.EMPTY, 0x1L, TrackGroupArray.EMPTY, trackselectorresult);
	//   48  101:aload_0         
	//   49  102:new             #180 <Class PlaybackInfo>
	//   50  105:dup             
	//   51  106:getstatic       #186 <Field Timeline Timeline.EMPTY>
	//   52  109:ldc2w           #187 <Long 0x1L>
	//   53  112:getstatic       #193 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//   54  115:aload_3         
	//   55  116:invokespecial   #196 <Method void PlaybackInfo(Timeline, long, TrackGroupArray, TrackSelectorResult)>
	//   56  119:putfield        #198 <Field PlaybackInfo playbackInfo>
	//   57  122:aload_0         
	//   58  123:new             #26  <Class ExoPlayerImplInternal$PlaybackInfoUpdate>
	//   59  126:dup             
	//   60  127:aconst_null     
	//   61  128:invokespecial   #201 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate(ExoPlayerImplInternal$1)>
	//   62  131:putfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
		rendererCapabilities = new RendererCapabilities[arenderer.length];
	//   63  134:aload_0         
	//   64  135:aload_1         
	//   65  136:arraylength     
	//   66  137:anewarray       RendererCapabilities[]
	//   67  140:putfield        #207 <Field RendererCapabilities[] rendererCapabilities>
		for(i = 0; i < arenderer.length; i++)
	//*  68  143:iconst_0        
	//*  69  144:istore          6
	//*  70  146:iload           6
	//*  71  148:aload_1         
	//*  72  149:arraylength     
	//*  73  150:icmpge          189
		{
			arenderer[i].setIndex(i);
	//   74  153:aload_1         
	//   75  154:iload           6
	//   76  156:aaload          
	//   77  157:iload           6
	//   78  159:invokeinterface #213 <Method void Renderer.setIndex(int)>
			rendererCapabilities[i] = arenderer[i].getCapabilities();
	//   79  164:aload_0         
	//   80  165:getfield        #207 <Field RendererCapabilities[] rendererCapabilities>
	//   81  168:iload           6
	//   82  170:aload_1         
	//   83  171:iload           6
	//   84  173:aaload          
	//   85  174:invokeinterface #217 <Method RendererCapabilities Renderer.getCapabilities()>
	//   86  179:aastore         
		}

	//   87  180:iload           6
	//   88  182:iconst_1        
	//   89  183:iadd            
	//   90  184:istore          6
	//*  91  186:goto            146
		mediaClock = new DefaultMediaClock(((DefaultMediaClock.PlaybackParameterListener) (this)), clock1);
	//   92  189:aload_0         
	//   93  190:new             #219 <Class DefaultMediaClock>
	//   94  193:dup             
	//   95  194:aload_0         
	//   96  195:aload           10
	//   97  197:invokespecial   #222 <Method void DefaultMediaClock(DefaultMediaClock$PlaybackParameterListener, Clock)>
	//   98  200:putfield        #224 <Field DefaultMediaClock mediaClock>
	//   99  203:aload_0         
	//  100  204:new             #226 <Class ArrayList>
	//  101  207:dup             
	//  102  208:invokespecial   #227 <Method void ArrayList()>
	//  103  211:putfield        #229 <Field ArrayList pendingMessages>
		enabledRenderers = new Renderer[0];
	//  104  214:aload_0         
	//  105  215:iconst_0        
	//  106  216:anewarray       Renderer[]
	//  107  219:putfield        #231 <Field Renderer[] enabledRenderers>
	//  108  222:aload_0         
	//  109  223:new             #233 <Class Timeline$Window>
	//  110  226:dup             
	//  111  227:invokespecial   #234 <Method void Timeline$Window()>
	//  112  230:putfield        #236 <Field Timeline$Window window>
	//  113  233:aload_0         
	//  114  234:new             #238 <Class Timeline$Period>
	//  115  237:dup             
	//  116  238:invokespecial   #239 <Method void Timeline$Period()>
	//  117  241:putfield        #241 <Field Timeline$Period period>
		trackselector.init(((com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener) (this)));
	//  118  244:aload_2         
	//  119  245:aload_0         
	//  120  246:invokevirtual   #247 <Method void TrackSelector.init(com.google.android.exoplayer2.trackselection.TrackSelector$InvalidationListener)>
	//  121  249:aload_0         
	//  122  250:new             #249 <Class HandlerThread>
	//  123  253:dup             
	//  124  254:ldc1            #251 <String "ExoPlayerImplInternal:Handler">
	//  125  256:bipush          -16
	//  126  258:invokespecial   #254 <Method void HandlerThread(String, int)>
	//  127  261:putfield        #256 <Field HandlerThread internalPlaybackThread>
		internalPlaybackThread.start();
	//  128  264:aload_0         
	//  129  265:getfield        #256 <Field HandlerThread internalPlaybackThread>
	//  130  268:invokevirtual   #259 <Method void HandlerThread.start()>
		handler = clock1.createHandler(internalPlaybackThread.getLooper(), ((android.os.Handler.Callback) (this)));
	//  131  271:aload_0         
	//  132  272:aload           10
	//  133  274:aload_0         
	//  134  275:getfield        #256 <Field HandlerThread internalPlaybackThread>
	//  135  278:invokevirtual   #263 <Method Looper HandlerThread.getLooper()>
	//  136  281:aload_0         
	//  137  282:invokeinterface #269 <Method HandlerWrapper Clock.createHandler(Looper, android.os.Handler$Callback)>
	//  138  287:putfield        #271 <Field HandlerWrapper handler>
	//  139  290:return          
	}

	private void deliverMessage(PlayerMessage playermessage)
		throws ExoPlaybackException
	{
		if(playermessage.isCanceled())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #286 <Method boolean PlayerMessage.isCanceled()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		playermessage.getTarget().handleMessage(playermessage.getType(), playermessage.getPayload());
	//    4    8:aload_1         
	//    5    9:invokevirtual   #290 <Method PlayerMessage$Target PlayerMessage.getTarget()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #294 <Method int PlayerMessage.getType()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #298 <Method Object PlayerMessage.getPayload()>
	//   10   20:invokeinterface #304 <Method void PlayerMessage$Target.handleMessage(int, Object)>
		playermessage.markAsProcessed(true);
	//   11   25:aload_1         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #308 <Method void PlayerMessage.markAsProcessed(boolean)>
		return;
	//   14   30:return          
		Exception exception;
		exception;
	//   15   31:astore_2        
		playermessage.markAsProcessed(true);
	//   16   32:aload_1         
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #308 <Method void PlayerMessage.markAsProcessed(boolean)>
		throw exception;
	//   19   37:aload_2         
	//   20   38:athrow          
	}

	private void disableRenderer(Renderer renderer)
		throws ExoPlaybackException
	{
		mediaClock.onRendererDisabled(renderer);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DefaultMediaClock mediaClock>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #313 <Method void DefaultMediaClock.onRendererDisabled(Renderer)>
		ensureStopped(renderer);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #316 <Method void ensureStopped(Renderer)>
		renderer.disable();
	//    7   13:aload_1         
	//    8   14:invokeinterface #319 <Method void Renderer.disable()>
	//    9   19:return          
	}

	private void doSomeWork()
		throws ExoPlaybackException, IOException
	{
		long l1 = clock.uptimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field Clock clock>
	//    2    4:invokeinterface #325 <Method long Clock.uptimeMillis()>
	//    3    9:lstore          5
		updatePeriods();
	//    4   11:aload_0         
	//    5   12:invokespecial   #328 <Method void updatePeriods()>
		if(!queue.hasPlayingPeriod())
	//*   6   15:aload_0         
	//*   7   16:getfield        #158 <Field MediaPeriodQueue queue>
	//*   8   19:invokevirtual   #331 <Method boolean MediaPeriodQueue.hasPlayingPeriod()>
	//*   9   22:ifne            39
		{
			maybeThrowPeriodPrepareError();
	//   10   25:aload_0         
	//   11   26:invokespecial   #334 <Method void maybeThrowPeriodPrepareError()>
			scheduleNextWork(l1, 10L);
	//   12   29:aload_0         
	//   13   30:lload           5
	//   14   32:ldc2w           #335 <Long 10L>
	//   15   35:invokespecial   #340 <Method void scheduleNextWork(long, long)>
			return;
	//   16   38:return          
		}
		MediaPeriodHolder mediaperiodholder = queue.getPlayingPeriod();
	//   17   39:aload_0         
	//   18   40:getfield        #158 <Field MediaPeriodQueue queue>
	//   19   43:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//   20   46:astore          10
		TraceUtil.beginSection("doSomeWork");
	//   21   48:ldc2            #345 <String "doSomeWork">
	//   22   51:invokestatic    #351 <Method void TraceUtil.beginSection(String)>
		updatePlaybackPositions();
	//   23   54:aload_0         
	//   24   55:invokespecial   #354 <Method void updatePlaybackPositions()>
		long l2 = SystemClock.elapsedRealtime();
	//   25   58:invokestatic    #359 <Method long SystemClock.elapsedRealtime()>
	//   26   61:lstore          7
		mediaperiodholder.mediaPeriod.discardBuffer(playbackInfo.positionUs - backBufferDurationUs, retainBackBufferFromKeyframe);
	//   27   63:aload           10
	//   28   65:getfield        #365 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//   29   68:aload_0         
	//   30   69:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   31   72:getfield        #368 <Field long PlaybackInfo.positionUs>
	//   32   75:aload_0         
	//   33   76:getfield        #166 <Field long backBufferDurationUs>
	//   34   79:lsub            
	//   35   80:aload_0         
	//   36   81:getfield        #171 <Field boolean retainBackBufferFromKeyframe>
	//   37   84:invokeinterface #374 <Method void MediaPeriod.discardBuffer(long, boolean)>
		Renderer arenderer1[] = enabledRenderers;
	//   38   89:aload_0         
	//   39   90:getfield        #231 <Field Renderer[] enabledRenderers>
	//   40   93:astore          11
		int j = arenderer1.length;
	//   41   95:aload           11
	//   42   97:arraylength     
	//   43   98:istore_2        
		int l = 0;
	//   44   99:iconst_0        
	//   45  100:istore_3        
		boolean flag = true;
	//   46  101:iconst_1        
	//   47  102:istore_1        
		boolean flag2 = true;
	//   48  103:iconst_1        
	//   49  104:istore          9
		for(; l < j; l++)
	//*  50  106:iload_3         
	//*  51  107:iload_2         
	//*  52  108:icmpge          234
		{
			Renderer renderer = arenderer1[l];
	//   53  111:aload           11
	//   54  113:iload_3         
	//   55  114:aaload          
	//   56  115:astore          12
			renderer.render(rendererPositionUs, l2 * 1000L);
	//   57  117:aload           12
	//   58  119:aload_0         
	//   59  120:getfield        #376 <Field long rendererPositionUs>
	//   60  123:lload           7
	//   61  125:ldc2w           #377 <Long 1000L>
	//   62  128:lmul            
	//   63  129:invokeinterface #381 <Method void Renderer.render(long, long)>
			if(flag && renderer.isEnded())
	//*  64  134:iload_1         
	//*  65  135:ifeq            153
	//*  66  138:aload           12
	//*  67  140:invokeinterface #384 <Method boolean Renderer.isEnded()>
	//*  68  145:ifeq            153
				flag = true;
	//   69  148:iconst_1        
	//   70  149:istore_1        
			else
	//*  71  150:goto            155
				flag = false;
	//   72  153:iconst_0        
	//   73  154:istore_1        
			boolean flag1;
			if(!renderer.isReady() && !renderer.isEnded() && !rendererWaitingForNextStream(renderer))
	//*  74  155:aload           12
	//*  75  157:invokeinterface #387 <Method boolean Renderer.isReady()>
	//*  76  162:ifne            193
	//*  77  165:aload           12
	//*  78  167:invokeinterface #384 <Method boolean Renderer.isEnded()>
	//*  79  172:ifne            193
	//*  80  175:aload_0         
	//*  81  176:aload           12
	//*  82  178:invokespecial   #391 <Method boolean rendererWaitingForNextStream(Renderer)>
	//*  83  181:ifeq            187
	//*  84  184:goto            193
				flag1 = false;
	//   85  187:iconst_0        
	//   86  188:istore          4
			else
	//*  87  190:goto            196
				flag1 = true;
	//   88  193:iconst_1        
	//   89  194:istore          4
			if(!flag1)
	//*  90  196:iload           4
	//*  91  198:ifne            208
				renderer.maybeThrowStreamError();
	//   92  201:aload           12
	//   93  203:invokeinterface #394 <Method void Renderer.maybeThrowStreamError()>
			if(flag2 && flag1)
	//*  94  208:iload           9
	//*  95  210:ifeq            224
	//*  96  213:iload           4
	//*  97  215:ifeq            224
				flag2 = true;
	//   98  218:iconst_1        
	//   99  219:istore          9
			else
	//* 100  221:goto            227
				flag2 = false;
	//  101  224:iconst_0        
	//  102  225:istore          9
		}

	//  103  227:iload_3         
	//  104  228:iconst_1        
	//  105  229:iadd            
	//  106  230:istore_3        
	//* 107  231:goto            106
		if(!flag2)
	//* 108  234:iload           9
	//* 109  236:ifne            243
			maybeThrowPeriodPrepareError();
	//  110  239:aload_0         
	//  111  240:invokespecial   #334 <Method void maybeThrowPeriodPrepareError()>
		l2 = mediaperiodholder.info.durationUs;
	//  112  243:aload           10
	//  113  245:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//  114  248:getfield        #403 <Field long MediaPeriodInfo.durationUs>
	//  115  251:lstore          7
		if(flag && (l2 == 0x1L || l2 <= playbackInfo.positionUs) && mediaperiodholder.info.isFinal)
	//* 116  253:iload_1         
	//* 117  254:ifeq            302
	//* 118  257:lload           7
	//* 119  259:ldc2w           #187 <Long 0x1L>
	//* 120  262:lcmp            
	//* 121  263:ifeq            279
	//* 122  266:lload           7
	//* 123  268:aload_0         
	//* 124  269:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 125  272:getfield        #368 <Field long PlaybackInfo.positionUs>
	//* 126  275:lcmp            
	//* 127  276:ifgt            302
	//* 128  279:aload           10
	//* 129  281:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//* 130  284:getfield        #406 <Field boolean MediaPeriodInfo.isFinal>
	//* 131  287:ifeq            302
		{
			setState(4);
	//  132  290:aload_0         
	//  133  291:iconst_4        
	//  134  292:invokespecial   #409 <Method void setState(int)>
			stopRenderers();
	//  135  295:aload_0         
	//  136  296:invokespecial   #412 <Method void stopRenderers()>
		} else
	//* 137  299:goto            392
		if(playbackInfo.playbackState == 2 && shouldTransitionToReadyState(flag2))
	//* 138  302:aload_0         
	//* 139  303:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 140  306:getfield        #415 <Field int PlaybackInfo.playbackState>
	//* 141  309:iconst_2        
	//* 142  310:icmpne          341
	//* 143  313:aload_0         
	//* 144  314:iload           9
	//* 145  316:invokespecial   #419 <Method boolean shouldTransitionToReadyState(boolean)>
	//* 146  319:ifeq            341
		{
			setState(3);
	//  147  322:aload_0         
	//  148  323:iconst_3        
	//  149  324:invokespecial   #409 <Method void setState(int)>
			if(playWhenReady)
	//* 150  327:aload_0         
	//* 151  328:getfield        #143 <Field boolean playWhenReady>
	//* 152  331:ifeq            392
				startRenderers();
	//  153  334:aload_0         
	//  154  335:invokespecial   #422 <Method void startRenderers()>
		} else
	//* 155  338:goto            392
		if(playbackInfo.playbackState == 3 && (enabledRenderers.length != 0 ? !flag2 : !isTimelineReady()))
	//* 156  341:aload_0         
	//* 157  342:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 158  345:getfield        #415 <Field int PlaybackInfo.playbackState>
	//* 159  348:iconst_3        
	//* 160  349:icmpne          392
	//* 161  352:aload_0         
	//* 162  353:getfield        #231 <Field Renderer[] enabledRenderers>
	//* 163  356:arraylength     
	//* 164  357:ifne            370
	//* 165  360:aload_0         
	//* 166  361:invokespecial   #425 <Method boolean isTimelineReady()>
	//* 167  364:ifeq            375
	//* 168  367:goto            392
	//* 169  370:iload           9
	//* 170  372:ifne            392
		{
			rebuffering = playWhenReady;
	//  171  375:aload_0         
	//  172  376:aload_0         
	//  173  377:getfield        #143 <Field boolean playWhenReady>
	//  174  380:putfield        #427 <Field boolean rebuffering>
			setState(2);
	//  175  383:aload_0         
	//  176  384:iconst_2        
	//  177  385:invokespecial   #409 <Method void setState(int)>
			stopRenderers();
	//  178  388:aload_0         
	//  179  389:invokespecial   #412 <Method void stopRenderers()>
		}
		if(playbackInfo.playbackState == 2)
	//* 180  392:aload_0         
	//* 181  393:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 182  396:getfield        #415 <Field int PlaybackInfo.playbackState>
	//* 183  399:iconst_2        
	//* 184  400:icmpne          436
		{
			Renderer arenderer[] = enabledRenderers;
	//  185  403:aload_0         
	//  186  404:getfield        #231 <Field Renderer[] enabledRenderers>
	//  187  407:astore          10
			int k = arenderer.length;
	//  188  409:aload           10
	//  189  411:arraylength     
	//  190  412:istore_2        
			for(int i = 0; i < k; i++)
	//* 191  413:iconst_0        
	//* 192  414:istore_1        
	//* 193  415:iload_1         
	//* 194  416:iload_2         
	//* 195  417:icmpge          436
				arenderer[i].maybeThrowStreamError();
	//  196  420:aload           10
	//  197  422:iload_1         
	//  198  423:aaload          
	//  199  424:invokeinterface #394 <Method void Renderer.maybeThrowStreamError()>

	//  200  429:iload_1         
	//  201  430:iconst_1        
	//  202  431:iadd            
	//  203  432:istore_1        
		}
	//* 204  433:goto            415
		if(playWhenReady && playbackInfo.playbackState == 3 || playbackInfo.playbackState == 2)
	//* 205  436:aload_0         
	//* 206  437:getfield        #143 <Field boolean playWhenReady>
	//* 207  440:ifeq            454
	//* 208  443:aload_0         
	//* 209  444:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 210  447:getfield        #415 <Field int PlaybackInfo.playbackState>
	//* 211  450:iconst_3        
	//* 212  451:icmpeq          465
	//* 213  454:aload_0         
	//* 214  455:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 215  458:getfield        #415 <Field int PlaybackInfo.playbackState>
	//* 216  461:iconst_2        
	//* 217  462:icmpne          477
			scheduleNextWork(l1, 10L);
	//  218  465:aload_0         
	//  219  466:lload           5
	//  220  468:ldc2w           #335 <Long 10L>
	//  221  471:invokespecial   #340 <Method void scheduleNextWork(long, long)>
		else
	//* 222  474:goto            518
		if(enabledRenderers.length != 0 && playbackInfo.playbackState != 4)
	//* 223  477:aload_0         
	//* 224  478:getfield        #231 <Field Renderer[] enabledRenderers>
	//* 225  481:arraylength     
	//* 226  482:ifeq            508
	//* 227  485:aload_0         
	//* 228  486:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 229  489:getfield        #415 <Field int PlaybackInfo.playbackState>
	//* 230  492:iconst_4        
	//* 231  493:icmpeq          508
			scheduleNextWork(l1, 1000L);
	//  232  496:aload_0         
	//  233  497:lload           5
	//  234  499:ldc2w           #377 <Long 1000L>
	//  235  502:invokespecial   #340 <Method void scheduleNextWork(long, long)>
		else
	//* 236  505:goto            518
			handler.removeMessages(2);
	//  237  508:aload_0         
	//  238  509:getfield        #271 <Field HandlerWrapper handler>
	//  239  512:iconst_2        
	//  240  513:invokeinterface #432 <Method void HandlerWrapper.removeMessages(int)>
		TraceUtil.endSection();
	//  241  518:invokestatic    #435 <Method void TraceUtil.endSection()>
	//  242  521:return          
	}

	private void enableRenderer(int i, boolean flag, int j)
		throws ExoPlaybackException
	{
		MediaPeriodHolder mediaperiodholder = queue.getPlayingPeriod();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//    3    7:astore          4
		Renderer renderer = renderers[i];
	//    4    9:aload_0         
	//    5   10:getfield        #135 <Field Renderer[] renderers>
	//    6   13:iload_1         
	//    7   14:aaload          
	//    8   15:astore          5
		enabledRenderers[j] = renderer;
	//    9   17:aload_0         
	//   10   18:getfield        #231 <Field Renderer[] enabledRenderers>
	//   11   21:iload_3         
	//   12   22:aload           5
	//   13   24:aastore         
		if(renderer.getState() == 0)
	//*  14   25:aload           5
	//*  15   27:invokeinterface #440 <Method int Renderer.getState()>
	//*  16   32:ifne            152
		{
			RendererConfiguration rendererconfiguration = mediaperiodholder.trackSelectorResult.rendererConfigurations[i];
	//   17   35:aload           4
	//   18   37:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//   19   40:getfield        #449 <Field RendererConfiguration[] TrackSelectorResult.rendererConfigurations>
	//   20   43:iload_1         
	//   21   44:aaload          
	//   22   45:astore          6
			Format aformat[] = getFormats(mediaperiodholder.trackSelectorResult.selections.get(i));
	//   23   47:aload           4
	//   24   49:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//   25   52:getfield        #453 <Field TrackSelectionArray TrackSelectorResult.selections>
	//   26   55:iload_1         
	//   27   56:invokevirtual   #459 <Method TrackSelection TrackSelectionArray.get(int)>
	//   28   59:invokestatic    #463 <Method Format[] getFormats(TrackSelection)>
	//   29   62:astore          7
			if(playWhenReady && playbackInfo.playbackState == 3)
	//*  30   64:aload_0         
	//*  31   65:getfield        #143 <Field boolean playWhenReady>
	//*  32   68:ifeq            87
	//*  33   71:aload_0         
	//*  34   72:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  35   75:getfield        #415 <Field int PlaybackInfo.playbackState>
	//*  36   78:iconst_3        
	//*  37   79:icmpne          87
				j = 1;
	//   38   82:iconst_1        
	//   39   83:istore_3        
			else
	//*  40   84:goto            89
				j = 0;
	//   41   87:iconst_0        
	//   42   88:istore_3        
			if(!flag && j != 0)
	//*  43   89:iload_2         
	//*  44   90:ifne            102
	//*  45   93:iload_3         
	//*  46   94:ifeq            102
				flag = true;
	//   47   97:iconst_1        
	//   48   98:istore_2        
			else
	//*  49   99:goto            104
				flag = false;
	//   50  102:iconst_0        
	//   51  103:istore_2        
			renderer.enable(rendererconfiguration, aformat, mediaperiodholder.sampleStreams[i], rendererPositionUs, flag, mediaperiodholder.getRendererOffset());
	//   52  104:aload           5
	//   53  106:aload           6
	//   54  108:aload           7
	//   55  110:aload           4
	//   56  112:getfield        #467 <Field com.google.android.exoplayer2.source.SampleStream[] MediaPeriodHolder.sampleStreams>
	//   57  115:iload_1         
	//   58  116:aaload          
	//   59  117:aload_0         
	//   60  118:getfield        #376 <Field long rendererPositionUs>
	//   61  121:iload_2         
	//   62  122:aload           4
	//   63  124:invokevirtual   #470 <Method long MediaPeriodHolder.getRendererOffset()>
	//   64  127:invokeinterface #474 <Method void Renderer.enable(RendererConfiguration, Format[], com.google.android.exoplayer2.source.SampleStream, long, boolean, long)>
			mediaClock.onRendererEnabled(renderer);
	//   65  132:aload_0         
	//   66  133:getfield        #224 <Field DefaultMediaClock mediaClock>
	//   67  136:aload           5
	//   68  138:invokevirtual   #477 <Method void DefaultMediaClock.onRendererEnabled(Renderer)>
			if(j != 0)
	//*  69  141:iload_3         
	//*  70  142:ifeq            152
				renderer.start();
	//   71  145:aload           5
	//   72  147:invokeinterface #478 <Method void Renderer.start()>
		}
	//   73  152:return          
	}

	private void enableRenderers(boolean aflag[], int i)
		throws ExoPlaybackException
	{
		enabledRenderers = new Renderer[i];
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:anewarray       Renderer[]
	//    3    5:putfield        #231 <Field Renderer[] enabledRenderers>
		MediaPeriodHolder mediaperiodholder = queue.getPlayingPeriod();
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field MediaPeriodQueue queue>
	//    6   12:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//    7   15:astore          5
		i = 0;
	//    8   17:iconst_0        
	//    9   18:istore_2        
		int k;
		for(int j = 0; i < renderers.length; j = k)
	//*  10   19:iconst_0        
	//*  11   20:istore_3        
	//*  12   21:iload_2         
	//*  13   22:aload_0         
	//*  14   23:getfield        #135 <Field Renderer[] renderers>
	//*  15   26:arraylength     
	//*  16   27:icmpge          69
		{
			k = j;
	//   17   30:iload_3         
	//   18   31:istore          4
			if(mediaperiodholder.trackSelectorResult.isRendererEnabled(i))
	//*  19   33:aload           5
	//*  20   35:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//*  21   38:iload_2         
	//*  22   39:invokevirtual   #484 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//*  23   42:ifeq            59
			{
				enableRenderer(i, aflag[i], j);
	//   24   45:aload_0         
	//   25   46:iload_2         
	//   26   47:aload_1         
	//   27   48:iload_2         
	//   28   49:baload          
	//   29   50:iload_3         
	//   30   51:invokespecial   #486 <Method void enableRenderer(int, boolean, int)>
				k = j + 1;
	//   31   54:iload_3         
	//   32   55:iconst_1        
	//   33   56:iadd            
	//   34   57:istore          4
			}
			i++;
	//   35   59:iload_2         
	//   36   60:iconst_1        
	//   37   61:iadd            
	//   38   62:istore_2        
		}

	//   39   63:iload           4
	//   40   65:istore_3        
	//*  41   66:goto            21
	//   42   69:return          
	}

	private void ensureStopped(Renderer renderer)
		throws ExoPlaybackException
	{
		if(renderer.getState() == 2)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #440 <Method int Renderer.getState()>
	//*   2    6:iconst_2        
	//*   3    7:icmpne          16
			renderer.stop();
	//    4   10:aload_1         
	//    5   11:invokeinterface #489 <Method void Renderer.stop()>
	//    6   16:return          
	}

	private int getFirstPeriodIndex()
	{
		Timeline timeline = playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore_1        
		if(timeline.isEmpty())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #496 <Method boolean Timeline.isEmpty()>
	//*   6   12:ifeq            17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		else
			return timeline.getWindow(timeline.getFirstWindowIndex(shuffleModeEnabled), window).firstPeriodIndex;
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #147 <Field boolean shuffleModeEnabled>
	//   13   23:invokevirtual   #500 <Method int Timeline.getFirstWindowIndex(boolean)>
	//   14   26:aload_0         
	//   15   27:getfield        #236 <Field Timeline$Window window>
	//   16   30:invokevirtual   #504 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window)>
	//   17   33:getfield        #507 <Field int Timeline$Window.firstPeriodIndex>
	//   18   36:ireturn         
	}

	private static Format[] getFormats(TrackSelection trackselection)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		if(trackselection != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          16
			i = trackselection.length();
	//    4    6:aload_0         
	//    5    7:invokeinterface #513 <Method int TrackSelection.length()>
	//    6   12:istore_1        
		else
	//*   7   13:goto            18
			i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
		Format aformat[] = new Format[i];
	//   10   18:iload_1         
	//   11   19:anewarray       Format[]
	//   12   22:astore_3        
		for(; j < i; j++)
	//*  13   23:iload_2         
	//*  14   24:iload_1         
	//*  15   25:icmpge          45
			aformat[j] = trackselection.getFormat(j);
	//   16   28:aload_3         
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:iload_2         
	//   20   32:invokeinterface #519 <Method Format TrackSelection.getFormat(int)>
	//   21   37:aastore         

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            23
		return aformat;
	//   27   45:aload_3         
	//   28   46:areturn         
	}

	private Pair getPeriodPosition(Timeline timeline, int i, long l)
	{
		return timeline.getPeriodPosition(window, period, i, l);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #236 <Field Timeline$Window window>
	//    3    5:aload_0         
	//    4    6:getfield        #241 <Field Timeline$Period period>
	//    5    9:iload_2         
	//    6   10:lload_3         
	//    7   11:invokevirtual   #525 <Method Pair Timeline.getPeriodPosition(Timeline$Window, Timeline$Period, int, long)>
	//    8   14:areturn         
	}

	private void handleContinueLoadingRequested(MediaPeriod mediaperiod)
	{
		if(!queue.isLoading(mediaperiod))
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #533 <Method boolean MediaPeriodQueue.isLoading(MediaPeriod)>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			queue.reevaluateBuffer(rendererPositionUs);
	//    6   12:aload_0         
	//    7   13:getfield        #158 <Field MediaPeriodQueue queue>
	//    8   16:aload_0         
	//    9   17:getfield        #376 <Field long rendererPositionUs>
	//   10   20:invokevirtual   #537 <Method void MediaPeriodQueue.reevaluateBuffer(long)>
			maybeContinueLoading();
	//   11   23:aload_0         
	//   12   24:invokespecial   #540 <Method void maybeContinueLoading()>
			return;
	//   13   27:return          
		}
	}

	private void handlePeriodPrepared(MediaPeriod mediaperiod)
		throws ExoPlaybackException
	{
		if(!queue.isLoading(mediaperiod))
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #533 <Method boolean MediaPeriodQueue.isLoading(MediaPeriod)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		mediaperiod = ((MediaPeriod) (queue.getLoadingPeriod()));
	//    6   12:aload_0         
	//    7   13:getfield        #158 <Field MediaPeriodQueue queue>
	//    8   16:invokevirtual   #544 <Method MediaPeriodHolder MediaPeriodQueue.getLoadingPeriod()>
	//    9   19:astore_1        
		((MediaPeriodHolder) (mediaperiod)).handlePrepared(mediaClock.getPlaybackParameters().speed);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #224 <Field DefaultMediaClock mediaClock>
	//   13   25:invokevirtual   #548 <Method PlaybackParameters DefaultMediaClock.getPlaybackParameters()>
	//   14   28:getfield        #554 <Field float PlaybackParameters.speed>
	//   15   31:invokevirtual   #558 <Method void MediaPeriodHolder.handlePrepared(float)>
		updateLoadControlTrackSelection(((MediaPeriodHolder) (mediaperiod)).trackGroups, ((MediaPeriodHolder) (mediaperiod)).trackSelectorResult);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:getfield        #561 <Field TrackGroupArray MediaPeriodHolder.trackGroups>
	//   19   39:aload_1         
	//   20   40:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//   21   43:invokespecial   #565 <Method void updateLoadControlTrackSelection(TrackGroupArray, TrackSelectorResult)>
		if(!queue.hasPlayingPeriod())
	//*  22   46:aload_0         
	//*  23   47:getfield        #158 <Field MediaPeriodQueue queue>
	//*  24   50:invokevirtual   #331 <Method boolean MediaPeriodQueue.hasPlayingPeriod()>
	//*  25   53:ifne            78
		{
			resetRendererPosition(queue.advancePlayingPeriod().info.startPositionUs);
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #158 <Field MediaPeriodQueue queue>
	//   29   61:invokevirtual   #568 <Method MediaPeriodHolder MediaPeriodQueue.advancePlayingPeriod()>
	//   30   64:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   31   67:getfield        #571 <Field long MediaPeriodInfo.startPositionUs>
	//   32   70:invokespecial   #574 <Method void resetRendererPosition(long)>
			updatePlayingPeriodRenderers(((MediaPeriodHolder) (null)));
	//   33   73:aload_0         
	//   34   74:aconst_null     
	//   35   75:invokespecial   #578 <Method void updatePlayingPeriodRenderers(MediaPeriodHolder)>
		}
		maybeContinueLoading();
	//   36   78:aload_0         
	//   37   79:invokespecial   #540 <Method void maybeContinueLoading()>
	//   38   82:return          
	}

	private void handleSourceInfoRefreshEndedPlayback()
	{
		setState(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #409 <Method void setState(int)>
		resetInternal(false, true, false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #583 <Method void resetInternal(boolean, boolean, boolean)>
	//    8   12:return          
	}

	private void handleSourceInfoRefreshed(MediaSourceRefreshInfo mediasourcerefreshinfo)
		throws ExoPlaybackException
	{
		if(mediasourcerefreshinfo.source != mediaSource)
	//*   0    0:aload_1         
	//*   1    1:getfield        #588 <Field MediaSource ExoPlayerImplInternal$MediaSourceRefreshInfo.source>
	//*   2    4:aload_0         
	//*   3    5:getfield        #590 <Field MediaSource mediaSource>
	//*   4    8:if_acmpeq       12
			return;
	//    5   11:return          
		Object obj1 = ((Object) (playbackInfo.timeline));
	//    6   12:aload_0         
	//    7   13:getfield        #198 <Field PlaybackInfo playbackInfo>
	//    8   16:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//    9   19:astore          10
		Timeline timeline = mediasourcerefreshinfo.timeline;
	//   10   21:aload_1         
	//   11   22:getfield        #591 <Field Timeline ExoPlayerImplInternal$MediaSourceRefreshInfo.timeline>
	//   12   25:astore          9
		mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (mediasourcerefreshinfo.manifest));
	//   13   27:aload_1         
	//   14   28:getfield        #595 <Field Object ExoPlayerImplInternal$MediaSourceRefreshInfo.manifest>
	//   15   31:astore_1        
		queue.setTimeline(timeline);
	//   16   32:aload_0         
	//   17   33:getfield        #158 <Field MediaPeriodQueue queue>
	//   18   36:aload           9
	//   19   38:invokevirtual   #599 <Method void MediaPeriodQueue.setTimeline(Timeline)>
		playbackInfo = playbackInfo.copyWithTimeline(timeline, ((Object) (mediasourcerefreshinfo)));
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   23   46:aload           9
	//   24   48:aload_1         
	//   25   49:invokevirtual   #603 <Method PlaybackInfo PlaybackInfo.copyWithTimeline(Timeline, Object)>
	//   26   52:putfield        #198 <Field PlaybackInfo playbackInfo>
		resolvePendingMessagePositions();
	//   27   55:aload_0         
	//   28   56:invokespecial   #606 <Method void resolvePendingMessagePositions()>
		int i = pendingPrepareCount;
	//   29   59:aload_0         
	//   30   60:getfield        #608 <Field int pendingPrepareCount>
	//   31   63:istore_2        
		long l = 0L;
	//   32   64:lconst_0        
	//   33   65:lstore          4
		if(i > 0)
	//*  34   67:iload_2         
	//*  35   68:ifle            308
		{
			playbackInfoUpdate.incrementPendingOperationAcks(pendingPrepareCount);
	//   36   71:aload_0         
	//   37   72:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   38   75:aload_0         
	//   39   76:getfield        #608 <Field int pendingPrepareCount>
	//   40   79:invokevirtual   #611 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.incrementPendingOperationAcks(int)>
			pendingPrepareCount = 0;
	//   41   82:aload_0         
	//   42   83:iconst_0        
	//   43   84:putfield        #608 <Field int pendingPrepareCount>
			if(pendingInitialSeekPosition != null)
	//*  44   87:aload_0         
	//*  45   88:getfield        #613 <Field ExoPlayerImplInternal$SeekPosition pendingInitialSeekPosition>
	//*  46   91:ifnull          190
			{
				mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (resolveSeekPosition(pendingInitialSeekPosition, true)));
	//   47   94:aload_0         
	//   48   95:aload_0         
	//   49   96:getfield        #613 <Field ExoPlayerImplInternal$SeekPosition pendingInitialSeekPosition>
	//   50   99:iconst_1        
	//   51  100:invokespecial   #617 <Method Pair resolveSeekPosition(ExoPlayerImplInternal$SeekPosition, boolean)>
	//   52  103:astore_1        
				pendingInitialSeekPosition = null;
	//   53  104:aload_0         
	//   54  105:aconst_null     
	//   55  106:putfield        #613 <Field ExoPlayerImplInternal$SeekPosition pendingInitialSeekPosition>
				if(mediasourcerefreshinfo == null)
	//*  56  109:aload_1         
	//*  57  110:ifnonnull       118
				{
					handleSourceInfoRefreshEndedPlayback();
	//   58  113:aload_0         
	//   59  114:invokespecial   #619 <Method void handleSourceInfoRefreshEndedPlayback()>
					return;
	//   60  117:return          
				}
				i = ((Integer)((Pair) (mediasourcerefreshinfo)).first).intValue();
	//   61  118:aload_1         
	//   62  119:getfield        #624 <Field Object Pair.first>
	//   63  122:checkcast       #626 <Class Integer>
	//   64  125:invokevirtual   #629 <Method int Integer.intValue()>
	//   65  128:istore_2        
				long l1 = ((Long)((Pair) (mediasourcerefreshinfo)).second).longValue();
	//   66  129:aload_1         
	//   67  130:getfield        #632 <Field Object Pair.second>
	//   68  133:checkcast       #634 <Class Long>
	//   69  136:invokevirtual   #637 <Method long Long.longValue()>
	//   70  139:lstore          6
				mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (queue.resolveMediaPeriodIdForAds(i, l1)));
	//   71  141:aload_0         
	//   72  142:getfield        #158 <Field MediaPeriodQueue queue>
	//   73  145:iload_2         
	//   74  146:lload           6
	//   75  148:invokevirtual   #641 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodQueue.resolveMediaPeriodIdForAds(int, long)>
	//   76  151:astore_1        
				PlaybackInfo playbackinfo = playbackInfo;
	//   77  152:aload_0         
	//   78  153:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   79  156:astore          8
				if(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)).isAd())
	//*  80  158:aload_1         
	//*  81  159:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*  82  162:ifeq            171
					l = 0L;
	//   83  165:lconst_0        
	//   84  166:lstore          4
				else
	//*  85  168:goto            175
					l = l1;
	//   86  171:lload           6
	//   87  173:lstore          4
				playbackInfo = playbackinfo.fromNewPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)), l, l1);
	//   88  175:aload_0         
	//   89  176:aload           8
	//   90  178:aload_1         
	//   91  179:lload           4
	//   92  181:lload           6
	//   93  183:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//   94  186:putfield        #198 <Field PlaybackInfo playbackInfo>
				return;
	//   95  189:return          
			}
			if(playbackInfo.startPositionUs == 0x1L)
	//*  96  190:aload_0         
	//*  97  191:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  98  194:getfield        #651 <Field long PlaybackInfo.startPositionUs>
	//*  99  197:ldc2w           #187 <Long 0x1L>
	//* 100  200:lcmp            
	//* 101  201:ifne            307
			{
				if(timeline.isEmpty())
	//* 102  204:aload           9
	//* 103  206:invokevirtual   #496 <Method boolean Timeline.isEmpty()>
	//* 104  209:ifeq            217
				{
					handleSourceInfoRefreshEndedPlayback();
	//  105  212:aload_0         
	//  106  213:invokespecial   #619 <Method void handleSourceInfoRefreshEndedPlayback()>
					return;
	//  107  216:return          
				}
				mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (getPeriodPosition(timeline, timeline.getFirstWindowIndex(shuffleModeEnabled), 0x1L)));
	//  108  217:aload_0         
	//  109  218:aload           9
	//  110  220:aload           9
	//  111  222:aload_0         
	//  112  223:getfield        #147 <Field boolean shuffleModeEnabled>
	//  113  226:invokevirtual   #500 <Method int Timeline.getFirstWindowIndex(boolean)>
	//  114  229:ldc2w           #187 <Long 0x1L>
	//  115  232:invokespecial   #653 <Method Pair getPeriodPosition(Timeline, int, long)>
	//  116  235:astore_1        
				i = ((Integer)((Pair) (mediasourcerefreshinfo)).first).intValue();
	//  117  236:aload_1         
	//  118  237:getfield        #624 <Field Object Pair.first>
	//  119  240:checkcast       #626 <Class Integer>
	//  120  243:invokevirtual   #629 <Method int Integer.intValue()>
	//  121  246:istore_2        
				long l2 = ((Long)((Pair) (mediasourcerefreshinfo)).second).longValue();
	//  122  247:aload_1         
	//  123  248:getfield        #632 <Field Object Pair.second>
	//  124  251:checkcast       #634 <Class Long>
	//  125  254:invokevirtual   #637 <Method long Long.longValue()>
	//  126  257:lstore          6
				mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (queue.resolveMediaPeriodIdForAds(i, l2)));
	//  127  259:aload_0         
	//  128  260:getfield        #158 <Field MediaPeriodQueue queue>
	//  129  263:iload_2         
	//  130  264:lload           6
	//  131  266:invokevirtual   #641 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodQueue.resolveMediaPeriodIdForAds(int, long)>
	//  132  269:astore_1        
				PlaybackInfo playbackinfo1 = playbackInfo;
	//  133  270:aload_0         
	//  134  271:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  135  274:astore          8
				if(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)).isAd())
	//* 136  276:aload_1         
	//* 137  277:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//* 138  280:ifeq            289
					l = 0L;
	//  139  283:lconst_0        
	//  140  284:lstore          4
				else
	//* 141  286:goto            293
					l = l2;
	//  142  289:lload           6
	//  143  291:lstore          4
				playbackInfo = playbackinfo1.fromNewPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)), l, l2);
	//  144  293:aload_0         
	//  145  294:aload           8
	//  146  296:aload_1         
	//  147  297:lload           4
	//  148  299:lload           6
	//  149  301:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//  150  304:putfield        #198 <Field PlaybackInfo playbackInfo>
			}
			return;
	//  151  307:return          
		}
		i = playbackInfo.periodId.periodIndex;
	//  152  308:aload_0         
	//  153  309:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  154  312:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//  155  315:getfield        #660 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//  156  318:istore_2        
		long l3 = playbackInfo.contentPositionUs;
	//  157  319:aload_0         
	//  158  320:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  159  323:getfield        #663 <Field long PlaybackInfo.contentPositionUs>
	//  160  326:lstore          6
		if(((Timeline) (obj1)).isEmpty())
	//* 161  328:aload           10
	//* 162  330:invokevirtual   #496 <Method boolean Timeline.isEmpty()>
	//* 163  333:ifeq            390
		{
			if(!timeline.isEmpty())
	//* 164  336:aload           9
	//* 165  338:invokevirtual   #496 <Method boolean Timeline.isEmpty()>
	//* 166  341:ifne            389
			{
				mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (queue.resolveMediaPeriodIdForAds(i, l3)));
	//  167  344:aload_0         
	//  168  345:getfield        #158 <Field MediaPeriodQueue queue>
	//  169  348:iload_2         
	//  170  349:lload           6
	//  171  351:invokevirtual   #641 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodQueue.resolveMediaPeriodIdForAds(int, long)>
	//  172  354:astore_1        
				PlaybackInfo playbackinfo2 = playbackInfo;
	//  173  355:aload_0         
	//  174  356:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  175  359:astore          8
				if(!((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)).isAd())
	//* 176  361:aload_1         
	//* 177  362:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//* 178  365:ifeq            371
	//* 179  368:goto            375
					l = l3;
	//  180  371:lload           6
	//  181  373:lstore          4
				playbackInfo = playbackinfo2.fromNewPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)), l, l3);
	//  182  375:aload_0         
	//  183  376:aload           8
	//  184  378:aload_1         
	//  185  379:lload           4
	//  186  381:lload           6
	//  187  383:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//  188  386:putfield        #198 <Field PlaybackInfo playbackInfo>
			}
			return;
	//  189  389:return          
		}
		MediaPeriodHolder mediaperiodholder = queue.getFrontPeriod();
	//  190  390:aload_0         
	//  191  391:getfield        #158 <Field MediaPeriodQueue queue>
	//  192  394:invokevirtual   #666 <Method MediaPeriodHolder MediaPeriodQueue.getFrontPeriod()>
	//  193  397:astore          8
		if(mediaperiodholder == null)
	//* 194  399:aload           8
	//* 195  401:ifnonnull       422
			mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (((Timeline) (obj1)).getPeriod(i, period, true).uid));
	//  196  404:aload           10
	//  197  406:iload_2         
	//  198  407:aload_0         
	//  199  408:getfield        #241 <Field Timeline$Period period>
	//  200  411:iconst_1        
	//  201  412:invokevirtual   #670 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//  202  415:getfield        #673 <Field Object Timeline$Period.uid>
	//  203  418:astore_1        
		else
	//* 204  419:goto            428
			mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (mediaperiodholder.uid));
	//  205  422:aload           8
	//  206  424:getfield        #674 <Field Object MediaPeriodHolder.uid>
	//  207  427:astore_1        
		int j = timeline.getIndexOfPeriod(((Object) (mediasourcerefreshinfo)));
	//  208  428:aload           9
	//  209  430:aload_1         
	//  210  431:invokevirtual   #678 <Method int Timeline.getIndexOfPeriod(Object)>
	//  211  434:istore_3        
		if(j == -1)
	//* 212  435:iload_3         
	//* 213  436:iconst_m1       
	//* 214  437:icmpne          662
		{
			i = resolveSubsequentPeriod(i, ((Timeline) (obj1)), timeline);
	//  215  440:aload_0         
	//  216  441:iload_2         
	//  217  442:aload           10
	//  218  444:aload           9
	//  219  446:invokespecial   #682 <Method int resolveSubsequentPeriod(int, Timeline, Timeline)>
	//  220  449:istore_2        
			if(i == -1)
	//* 221  450:iload_2         
	//* 222  451:iconst_m1       
	//* 223  452:icmpne          460
			{
				handleSourceInfoRefreshEndedPlayback();
	//  224  455:aload_0         
	//  225  456:invokespecial   #619 <Method void handleSourceInfoRefreshEndedPlayback()>
				return;
	//  226  459:return          
			}
			mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (getPeriodPosition(timeline, timeline.getPeriod(i, period).windowIndex, 0x1L)));
	//  227  460:aload_0         
	//  228  461:aload           9
	//  229  463:aload           9
	//  230  465:iload_2         
	//  231  466:aload_0         
	//  232  467:getfield        #241 <Field Timeline$Period period>
	//  233  470:invokevirtual   #685 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//  234  473:getfield        #688 <Field int Timeline$Period.windowIndex>
	//  235  476:ldc2w           #187 <Long 0x1L>
	//  236  479:invokespecial   #653 <Method Pair getPeriodPosition(Timeline, int, long)>
	//  237  482:astore_1        
			i = ((Integer)((Pair) (mediasourcerefreshinfo)).first).intValue();
	//  238  483:aload_1         
	//  239  484:getfield        #624 <Field Object Pair.first>
	//  240  487:checkcast       #626 <Class Integer>
	//  241  490:invokevirtual   #629 <Method int Integer.intValue()>
	//  242  493:istore_2        
			l3 = ((Long)((Pair) (mediasourcerefreshinfo)).second).longValue();
	//  243  494:aload_1         
	//  244  495:getfield        #632 <Field Object Pair.second>
	//  245  498:checkcast       #634 <Class Long>
	//  246  501:invokevirtual   #637 <Method long Long.longValue()>
	//  247  504:lstore          6
			obj1 = ((Object) (queue.resolveMediaPeriodIdForAds(i, l3)));
	//  248  506:aload_0         
	//  249  507:getfield        #158 <Field MediaPeriodQueue queue>
	//  250  510:iload_2         
	//  251  511:lload           6
	//  252  513:invokevirtual   #641 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodQueue.resolveMediaPeriodIdForAds(int, long)>
	//  253  516:astore          10
			timeline.getPeriod(i, period, true);
	//  254  518:aload           9
	//  255  520:iload_2         
	//  256  521:aload_0         
	//  257  522:getfield        #241 <Field Timeline$Period period>
	//  258  525:iconst_1        
	//  259  526:invokevirtual   #670 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//  260  529:pop             
			if(mediaperiodholder != null)
	//* 261  530:aload           8
	//* 262  532:ifnull          619
			{
				Object obj = period.uid;
	//  263  535:aload_0         
	//  264  536:getfield        #241 <Field Timeline$Period period>
	//  265  539:getfield        #673 <Field Object Timeline$Period.uid>
	//  266  542:astore          9
				mediaperiodholder.info = mediaperiodholder.info.copyWithPeriodIndex(-1);
	//  267  544:aload           8
	//  268  546:aload           8
	//  269  548:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//  270  551:iconst_m1       
	//  271  552:invokevirtual   #692 <Method MediaPeriodInfo MediaPeriodInfo.copyWithPeriodIndex(int)>
	//  272  555:putfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
				for(mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (mediaperiodholder)); ((MediaPeriodHolder) (mediasourcerefreshinfo)).next != null;)
	//* 273  558:aload           8
	//* 274  560:astore_1        
	//* 275  561:aload_1         
	//* 276  562:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//* 277  565:ifnull          619
				{
					mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (((MediaPeriodHolder) (mediasourcerefreshinfo)).next));
	//  278  568:aload_1         
	//  279  569:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//  280  572:astore_1        
					if(((MediaPeriodHolder) (mediasourcerefreshinfo)).uid.equals(obj))
	//* 281  573:aload_1         
	//* 282  574:getfield        #674 <Field Object MediaPeriodHolder.uid>
	//* 283  577:aload           9
	//* 284  579:invokevirtual   #700 <Method boolean Object.equals(Object)>
	//* 285  582:ifeq            604
						mediasourcerefreshinfo.info = queue.getUpdatedMediaPeriodInfo(((MediaPeriodHolder) (mediasourcerefreshinfo)).info, i);
	//  286  585:aload_1         
	//  287  586:aload_0         
	//  288  587:getfield        #158 <Field MediaPeriodQueue queue>
	//  289  590:aload_1         
	//  290  591:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//  291  594:iload_2         
	//  292  595:invokevirtual   #704 <Method MediaPeriodInfo MediaPeriodQueue.getUpdatedMediaPeriodInfo(MediaPeriodInfo, int)>
	//  293  598:putfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
					else
	//* 294  601:goto            561
						mediasourcerefreshinfo.info = ((MediaPeriodHolder) (mediasourcerefreshinfo)).info.copyWithPeriodIndex(-1);
	//  295  604:aload_1         
	//  296  605:aload_1         
	//  297  606:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//  298  609:iconst_m1       
	//  299  610:invokevirtual   #692 <Method MediaPeriodInfo MediaPeriodInfo.copyWithPeriodIndex(int)>
	//  300  613:putfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
				}

			}
	//* 301  616:goto            561
			if(!((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj1)).isAd())
	//* 302  619:aload           10
	//* 303  621:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//* 304  624:ifeq            630
	//* 305  627:goto            634
				l = l3;
	//  306  630:lload           6
	//  307  632:lstore          4
			l = seekToPeriodPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj1)), l);
	//  308  634:aload_0         
	//  309  635:aload           10
	//  310  637:lload           4
	//  311  639:invokespecial   #708 <Method long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//  312  642:lstore          4
			playbackInfo = playbackInfo.fromNewPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj1)), l, l3);
	//  313  644:aload_0         
	//  314  645:aload_0         
	//  315  646:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  316  649:aload           10
	//  317  651:lload           4
	//  318  653:lload           6
	//  319  655:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//  320  658:putfield        #198 <Field PlaybackInfo playbackInfo>
			return;
	//  321  661:return          
		}
		if(j != i)
	//* 322  662:iload_3         
	//* 323  663:iload_2         
	//* 324  664:icmpeq          679
			playbackInfo = playbackInfo.copyWithPeriodIndex(j);
	//  325  667:aload_0         
	//  326  668:aload_0         
	//  327  669:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  328  672:iload_3         
	//  329  673:invokevirtual   #711 <Method PlaybackInfo PlaybackInfo.copyWithPeriodIndex(int)>
	//  330  676:putfield        #198 <Field PlaybackInfo playbackInfo>
		mediasourcerefreshinfo = ((MediaSourceRefreshInfo) (playbackInfo.periodId));
	//  331  679:aload_0         
	//  332  680:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  333  683:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//  334  686:astore_1        
		if(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)).isAd())
	//* 335  687:aload_1         
	//* 336  688:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//* 337  691:ifeq            758
		{
			com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid = queue.resolveMediaPeriodIdForAds(j, l3);
	//  338  694:aload_0         
	//  339  695:getfield        #158 <Field MediaPeriodQueue queue>
	//  340  698:iload_3         
	//  341  699:lload           6
	//  342  701:invokevirtual   #641 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodQueue.resolveMediaPeriodIdForAds(int, long)>
	//  343  704:astore          8
			if(!mediaperiodid.equals(((Object) (mediasourcerefreshinfo))))
	//* 344  706:aload           8
	//* 345  708:aload_1         
	//* 346  709:invokevirtual   #712 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.equals(Object)>
	//* 347  712:ifne            758
			{
				if(!mediaperiodid.isAd())
	//* 348  715:aload           8
	//* 349  717:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//* 350  720:ifeq            726
	//* 351  723:goto            730
					l = l3;
	//  352  726:lload           6
	//  353  728:lstore          4
				l = seekToPeriodPosition(mediaperiodid, l);
	//  354  730:aload_0         
	//  355  731:aload           8
	//  356  733:lload           4
	//  357  735:invokespecial   #708 <Method long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//  358  738:lstore          4
				playbackInfo = playbackInfo.fromNewPosition(mediaperiodid, l, l3);
	//  359  740:aload_0         
	//  360  741:aload_0         
	//  361  742:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  362  745:aload           8
	//  363  747:lload           4
	//  364  749:lload           6
	//  365  751:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//  366  754:putfield        #198 <Field PlaybackInfo playbackInfo>
				return;
	//  367  757:return          
			}
		}
		if(!queue.updateQueuedPeriods(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (mediasourcerefreshinfo)), rendererPositionUs))
	//* 368  758:aload_0         
	//* 369  759:getfield        #158 <Field MediaPeriodQueue queue>
	//* 370  762:aload_1         
	//* 371  763:aload_0         
	//* 372  764:getfield        #376 <Field long rendererPositionUs>
	//* 373  767:invokevirtual   #716 <Method boolean MediaPeriodQueue.updateQueuedPeriods(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//* 374  770:ifne            778
			seekToCurrentPosition(false);
	//  375  773:aload_0         
	//  376  774:iconst_0        
	//  377  775:invokespecial   #719 <Method void seekToCurrentPosition(boolean)>
	//  378  778:return          
	}

	private boolean isTimelineReady()
	{
		MediaPeriodHolder mediaperiodholder = queue.getPlayingPeriod();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//    3    7:astore_3        
		long l = mediaperiodholder.info.durationUs;
	//    4    8:aload_3         
	//    5    9:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//    6   12:getfield        #403 <Field long MediaPeriodInfo.durationUs>
	//    7   15:lstore_1        
		return l == 0x1L || playbackInfo.positionUs < l || mediaperiodholder.next != null && (mediaperiodholder.next.prepared || mediaperiodholder.next.info.id.isAd());
	//    8   16:lload_1         
	//    9   17:ldc2w           #187 <Long 0x1L>
	//   10   20:lcmp            
	//   11   21:ifeq            74
	//   12   24:aload_0         
	//   13   25:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   14   28:getfield        #368 <Field long PlaybackInfo.positionUs>
	//   15   31:lload_1         
	//   16   32:lcmp            
	//   17   33:iflt            74
	//   18   36:aload_3         
	//   19   37:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   20   40:ifnull          72
	//   21   43:aload_3         
	//   22   44:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   23   47:getfield        #722 <Field boolean MediaPeriodHolder.prepared>
	//   24   50:ifne            74
	//   25   53:aload_3         
	//   26   54:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   27   57:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   28   60:getfield        #725 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   29   63:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//   30   66:ifeq            72
	//   31   69:goto            74
	//   32   72:iconst_0        
	//   33   73:ireturn         
	//   34   74:iconst_1        
	//   35   75:ireturn         
	}

	private void maybeContinueLoading()
	{
		MediaPeriodHolder mediaperiodholder = queue.getLoadingPeriod();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:invokevirtual   #544 <Method MediaPeriodHolder MediaPeriodQueue.getLoadingPeriod()>
	//    3    7:astore          6
		long l = mediaperiodholder.getNextLoadPositionUs();
	//    4    9:aload           6
	//    5   11:invokevirtual   #728 <Method long MediaPeriodHolder.getNextLoadPositionUs()>
	//    6   14:lstore_1        
		if(l == 0x0L)
	//*   7   15:lload_1         
	//*   8   16:ldc2w           #729 <Long 0x0L>
	//*   9   19:lcmp            
	//*  10   20:ifne            29
		{
			setIsLoading(false);
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:invokespecial   #733 <Method void setIsLoading(boolean)>
			return;
	//   14   28:return          
		}
		long l1 = mediaperiodholder.toPeriodTime(rendererPositionUs);
	//   15   29:aload           6
	//   16   31:aload_0         
	//   17   32:getfield        #376 <Field long rendererPositionUs>
	//   18   35:invokevirtual   #737 <Method long MediaPeriodHolder.toPeriodTime(long)>
	//   19   38:lstore_3        
		boolean flag = loadControl.shouldContinueLoading(l - l1, mediaClock.getPlaybackParameters().speed);
	//   20   39:aload_0         
	//   21   40:getfield        #141 <Field LoadControl loadControl>
	//   22   43:lload_1         
	//   23   44:lload_3         
	//   24   45:lsub            
	//   25   46:aload_0         
	//   26   47:getfield        #224 <Field DefaultMediaClock mediaClock>
	//   27   50:invokevirtual   #548 <Method PlaybackParameters DefaultMediaClock.getPlaybackParameters()>
	//   28   53:getfield        #554 <Field float PlaybackParameters.speed>
	//   29   56:invokeinterface #741 <Method boolean LoadControl.shouldContinueLoading(long, float)>
	//   30   61:istore          5
		setIsLoading(flag);
	//   31   63:aload_0         
	//   32   64:iload           5
	//   33   66:invokespecial   #733 <Method void setIsLoading(boolean)>
		if(flag)
	//*  34   69:iload           5
	//*  35   71:ifeq            83
			mediaperiodholder.continueLoading(rendererPositionUs);
	//   36   74:aload           6
	//   37   76:aload_0         
	//   38   77:getfield        #376 <Field long rendererPositionUs>
	//   39   80:invokevirtual   #744 <Method void MediaPeriodHolder.continueLoading(long)>
	//   40   83:return          
	}

	private void maybeNotifyPlaybackInfoChanged()
	{
		if(playbackInfoUpdate.hasPendingUpdate(playbackInfo))
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//*   2    4:aload_0         
	//*   3    5:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*   4    8:invokevirtual   #749 <Method boolean ExoPlayerImplInternal$PlaybackInfoUpdate.hasPendingUpdate(PlaybackInfo)>
	//*   5   11:ifeq            75
		{
			Handler handler1 = eventHandler;
	//    6   14:aload_0         
	//    7   15:getfield        #149 <Field Handler eventHandler>
	//    8   18:astore_3        
			int j = playbackInfoUpdate.operationAcks;
	//    9   19:aload_0         
	//   10   20:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   11   23:invokestatic    #753 <Method int ExoPlayerImplInternal$PlaybackInfoUpdate.access$100(ExoPlayerImplInternal$PlaybackInfoUpdate)>
	//   12   26:istore_2        
			int i;
			if(playbackInfoUpdate.positionDiscontinuity)
	//*  13   27:aload_0         
	//*  14   28:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//*  15   31:invokestatic    #757 <Method boolean ExoPlayerImplInternal$PlaybackInfoUpdate.access$200(ExoPlayerImplInternal$PlaybackInfoUpdate)>
	//*  16   34:ifeq            48
				i = playbackInfoUpdate.discontinuityReason;
	//   17   37:aload_0         
	//   18   38:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   19   41:invokestatic    #760 <Method int ExoPlayerImplInternal$PlaybackInfoUpdate.access$300(ExoPlayerImplInternal$PlaybackInfoUpdate)>
	//   20   44:istore_1        
			else
	//*  21   45:goto            50
				i = -1;
	//   22   48:iconst_m1       
	//   23   49:istore_1        
			handler1.obtainMessage(0, j, i, ((Object) (playbackInfo))).sendToTarget();
	//   24   50:aload_3         
	//   25   51:iconst_0        
	//   26   52:iload_2         
	//   27   53:iload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   30   58:invokevirtual   #766 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   31   61:invokevirtual   #771 <Method void Message.sendToTarget()>
			playbackInfoUpdate.reset(playbackInfo);
	//   32   64:aload_0         
	//   33   65:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   34   68:aload_0         
	//   35   69:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   36   72:invokevirtual   #775 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.reset(PlaybackInfo)>
		}
	//   37   75:return          
	}

	private void maybeThrowPeriodPrepareError()
		throws IOException
	{
		MediaPeriodHolder mediaperiodholder = queue.getLoadingPeriod();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:invokevirtual   #544 <Method MediaPeriodHolder MediaPeriodQueue.getLoadingPeriod()>
	//    3    7:astore_3        
		MediaPeriodHolder mediaperiodholder1 = queue.getReadingPeriod();
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field MediaPeriodQueue queue>
	//    6   12:invokevirtual   #778 <Method MediaPeriodHolder MediaPeriodQueue.getReadingPeriod()>
	//    7   15:astore          4
		if(mediaperiodholder != null && !mediaperiodholder.prepared && (mediaperiodholder1 == null || mediaperiodholder1.next == mediaperiodholder))
	//*   8   17:aload_3         
	//*   9   18:ifnull          88
	//*  10   21:aload_3         
	//*  11   22:getfield        #722 <Field boolean MediaPeriodHolder.prepared>
	//*  12   25:ifne            88
	//*  13   28:aload           4
	//*  14   30:ifnull          42
	//*  15   33:aload           4
	//*  16   35:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*  17   38:aload_3         
	//*  18   39:if_acmpne       88
		{
			Renderer arenderer[] = enabledRenderers;
	//   19   42:aload_0         
	//   20   43:getfield        #231 <Field Renderer[] enabledRenderers>
	//   21   46:astore          4
			int j = arenderer.length;
	//   22   48:aload           4
	//   23   50:arraylength     
	//   24   51:istore_2        
			for(int i = 0; i < j; i++)
	//*  25   52:iconst_0        
	//*  26   53:istore_1        
	//*  27   54:iload_1         
	//*  28   55:iload_2         
	//*  29   56:icmpge          79
				if(!arenderer[i].hasReadStreamToEnd())
	//*  30   59:aload           4
	//*  31   61:iload_1         
	//*  32   62:aaload          
	//*  33   63:invokeinterface #781 <Method boolean Renderer.hasReadStreamToEnd()>
	//*  34   68:ifne            72
					return;
	//   35   71:return          

	//   36   72:iload_1         
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore_1        
	//*  40   76:goto            54
			mediaperiodholder.mediaPeriod.maybeThrowPrepareError();
	//   41   79:aload_3         
	//   42   80:getfield        #365 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//   43   83:invokeinterface #784 <Method void MediaPeriod.maybeThrowPrepareError()>
		}
	//   44   88:return          
	}

	private void maybeTriggerPendingMessages(long l, long l1)
		throws ExoPlaybackException
	{
		int i;
		long l2;
		if(pendingMessages.isEmpty())
			break MISSING_BLOCK_LABEL_461;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field ArrayList pendingMessages>
	//    2    4:invokevirtual   #786 <Method boolean ArrayList.isEmpty()>
	//    3    7:ifne            461
		if(playbackInfo.periodId.isAd())
	//*   4   10:aload_0         
	//*   5   11:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*   6   14:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//*   7   17:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*   8   20:ifeq            24
			return;
	//    9   23:return          
		l2 = l;
	//   10   24:lload_1         
	//   11   25:lstore          6
		if(playbackInfo.startPositionUs == l)
	//*  12   27:aload_0         
	//*  13   28:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  14   31:getfield        #651 <Field long PlaybackInfo.startPositionUs>
	//*  15   34:lload_1         
	//*  16   35:lcmp            
	//*  17   36:ifne            44
			l2 = l - 1L;
	//   18   39:lload_1         
	//   19   40:lconst_1        
	//   20   41:lsub            
	//   21   42:lstore          6
		i = playbackInfo.periodId.periodIndex;
	//   22   44:aload_0         
	//   23   45:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   24   48:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   25   51:getfield        #660 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   26   54:istore          5
		l = l2;
	//   27   56:lload           6
	//   28   58:lstore_1        
		if(nextPendingMessageIndex <= 0) goto _L2; else goto _L1
	//   29   59:aload_0         
	//   30   60:getfield        #788 <Field int nextPendingMessageIndex>
	//   31   63:ifle            87
_L1:
		PendingMessageInfo pendingmessageinfo = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex - 1);
	//   32   66:aload_0         
	//   33   67:getfield        #229 <Field ArrayList pendingMessages>
	//   34   70:aload_0         
	//   35   71:getfield        #788 <Field int nextPendingMessageIndex>
	//   36   74:iconst_1        
	//   37   75:isub            
	//   38   76:invokevirtual   #791 <Method Object ArrayList.get(int)>
	//   39   79:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//   40   82:astore          8
		  goto _L3
	//*  41   84:goto            93
_L2:
		pendingmessageinfo = null;
	//   42   87:aconst_null     
	//   43   88:astore          8
		l2 = l;
	//   44   90:lload_1         
	//   45   91:lstore          6
_L3:
		do
		{
			if(pendingmessageinfo == null || pendingmessageinfo.resolvedPeriodIndex <= i && (pendingmessageinfo.resolvedPeriodIndex != i || pendingmessageinfo.resolvedPeriodTimeUs <= l2))
				break; /* Loop/switch isn't completed */
	//   46   93:aload           8
	//   47   95:ifnull          170
	//   48   98:aload           8
	//   49  100:getfield        #794 <Field int ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodIndex>
	//   50  103:iload           5
	//   51  105:icmpgt          129
	//   52  108:aload           8
	//   53  110:getfield        #794 <Field int ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodIndex>
	//   54  113:iload           5
	//   55  115:icmpne          170
	//   56  118:aload           8
	//   57  120:getfield        #797 <Field long ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodTimeUs>
	//   58  123:lload           6
	//   59  125:lcmp            
	//   60  126:ifle            170
			nextPendingMessageIndex = nextPendingMessageIndex - 1;
	//   61  129:aload_0         
	//   62  130:aload_0         
	//   63  131:getfield        #788 <Field int nextPendingMessageIndex>
	//   64  134:iconst_1        
	//   65  135:isub            
	//   66  136:putfield        #788 <Field int nextPendingMessageIndex>
			l = l2;
	//   67  139:lload           6
	//   68  141:lstore_1        
			if(nextPendingMessageIndex <= 0)
				continue; /* Loop/switch isn't completed */
	//   69  142:aload_0         
	//   70  143:getfield        #788 <Field int nextPendingMessageIndex>
	//   71  146:ifle            87
			pendingmessageinfo = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex - 1);
	//   72  149:aload_0         
	//   73  150:getfield        #229 <Field ArrayList pendingMessages>
	//   74  153:aload_0         
	//   75  154:getfield        #788 <Field int nextPendingMessageIndex>
	//   76  157:iconst_1        
	//   77  158:isub            
	//   78  159:invokevirtual   #791 <Method Object ArrayList.get(int)>
	//   79  162:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//   80  165:astore          8
		} while(true);
	//   81  167:goto            93
		if(true) goto _L2; else goto _L4
_L4:
		l = l2;
	//   82  170:lload           6
	//   83  172:lstore_1        
		if(nextPendingMessageIndex >= pendingMessages.size()) goto _L6; else goto _L5
	//   84  173:aload_0         
	//   85  174:getfield        #788 <Field int nextPendingMessageIndex>
	//   86  177:aload_0         
	//   87  178:getfield        #229 <Field ArrayList pendingMessages>
	//   88  181:invokevirtual   #800 <Method int ArrayList.size()>
	//   89  184:icmpge          206
_L5:
		pendingmessageinfo = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex);
	//   90  187:aload_0         
	//   91  188:getfield        #229 <Field ArrayList pendingMessages>
	//   92  191:aload_0         
	//   93  192:getfield        #788 <Field int nextPendingMessageIndex>
	//   94  195:invokevirtual   #791 <Method Object ArrayList.get(int)>
	//   95  198:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//   96  201:astore          8
		  goto _L7
	//*  97  203:goto            212
_L6:
		pendingmessageinfo = null;
	//   98  206:aconst_null     
	//   99  207:astore          8
		l2 = l;
	//  100  209:lload_1         
	//  101  210:lstore          6
_L7:
		PendingMessageInfo pendingmessageinfo1;
		do
		{
			pendingmessageinfo1 = pendingmessageinfo;
	//  102  212:aload           8
	//  103  214:astore          9
			if(pendingmessageinfo == null)
				break; /* Loop/switch isn't completed */
	//  104  216:aload           8
	//  105  218:ifnull          318
			pendingmessageinfo1 = pendingmessageinfo;
	//  106  221:aload           8
	//  107  223:astore          9
			if(pendingmessageinfo.resolvedPeriodUid == null)
				break; /* Loop/switch isn't completed */
	//  108  225:aload           8
	//  109  227:getfield        #803 <Field Object ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodUid>
	//  110  230:ifnull          318
			if(pendingmessageinfo.resolvedPeriodIndex >= i)
	//* 111  233:aload           8
	//* 112  235:getfield        #794 <Field int ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodIndex>
	//* 113  238:iload           5
	//* 114  240:icmplt          272
			{
				pendingmessageinfo1 = pendingmessageinfo;
	//  115  243:aload           8
	//  116  245:astore          9
				if(pendingmessageinfo.resolvedPeriodIndex != i)
					break; /* Loop/switch isn't completed */
	//  117  247:aload           8
	//  118  249:getfield        #794 <Field int ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodIndex>
	//  119  252:iload           5
	//  120  254:icmpne          318
				pendingmessageinfo1 = pendingmessageinfo;
	//  121  257:aload           8
	//  122  259:astore          9
				if(pendingmessageinfo.resolvedPeriodTimeUs > l2)
					break; /* Loop/switch isn't completed */
	//  123  261:aload           8
	//  124  263:getfield        #797 <Field long ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodTimeUs>
	//  125  266:lload           6
	//  126  268:lcmp            
	//  127  269:ifgt            318
			}
			nextPendingMessageIndex = nextPendingMessageIndex + 1;
	//  128  272:aload_0         
	//  129  273:aload_0         
	//  130  274:getfield        #788 <Field int nextPendingMessageIndex>
	//  131  277:iconst_1        
	//  132  278:iadd            
	//  133  279:putfield        #788 <Field int nextPendingMessageIndex>
			l = l2;
	//  134  282:lload           6
	//  135  284:lstore_1        
			if(nextPendingMessageIndex >= pendingMessages.size())
				continue; /* Loop/switch isn't completed */
	//  136  285:aload_0         
	//  137  286:getfield        #788 <Field int nextPendingMessageIndex>
	//  138  289:aload_0         
	//  139  290:getfield        #229 <Field ArrayList pendingMessages>
	//  140  293:invokevirtual   #800 <Method int ArrayList.size()>
	//  141  296:icmpge          206
			pendingmessageinfo = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex);
	//  142  299:aload_0         
	//  143  300:getfield        #229 <Field ArrayList pendingMessages>
	//  144  303:aload_0         
	//  145  304:getfield        #788 <Field int nextPendingMessageIndex>
	//  146  307:invokevirtual   #791 <Method Object ArrayList.get(int)>
	//  147  310:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//  148  313:astore          8
		} while(true);
	//  149  315:goto            212
		if(true) goto _L6; else goto _L8
_L8:
		while(pendingmessageinfo1 != null && pendingmessageinfo1.resolvedPeriodUid != null && pendingmessageinfo1.resolvedPeriodIndex == i && pendingmessageinfo1.resolvedPeriodTimeUs > l2 && pendingmessageinfo1.resolvedPeriodTimeUs <= l1) 
	//* 150  318:aload           9
	//* 151  320:ifnull          460
	//* 152  323:aload           9
	//* 153  325:getfield        #803 <Field Object ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodUid>
	//* 154  328:ifnull          460
	//* 155  331:aload           9
	//* 156  333:getfield        #794 <Field int ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodIndex>
	//* 157  336:iload           5
	//* 158  338:icmpne          460
	//* 159  341:aload           9
	//* 160  343:getfield        #797 <Field long ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodTimeUs>
	//* 161  346:lload           6
	//* 162  348:lcmp            
	//* 163  349:ifle            460
	//* 164  352:aload           9
	//* 165  354:getfield        #797 <Field long ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodTimeUs>
	//* 166  357:lload_3         
	//* 167  358:lcmp            
	//* 168  359:ifgt            460
		{
			sendMessageToTarget(pendingmessageinfo1.message);
	//  169  362:aload_0         
	//  170  363:aload           9
	//  171  365:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//  172  368:invokespecial   #810 <Method void sendMessageToTarget(PlayerMessage)>
			if(!pendingmessageinfo1.message.getDeleteAfterDelivery() && !pendingmessageinfo1.message.isCanceled())
	//* 173  371:aload           9
	//* 174  373:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//* 175  376:invokevirtual   #813 <Method boolean PlayerMessage.getDeleteAfterDelivery()>
	//* 176  379:ifne            409
	//* 177  382:aload           9
	//* 178  384:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//* 179  387:invokevirtual   #286 <Method boolean PlayerMessage.isCanceled()>
	//* 180  390:ifeq            396
	//* 181  393:goto            409
				nextPendingMessageIndex = nextPendingMessageIndex + 1;
	//  182  396:aload_0         
	//  183  397:aload_0         
	//  184  398:getfield        #788 <Field int nextPendingMessageIndex>
	//  185  401:iconst_1        
	//  186  402:iadd            
	//  187  403:putfield        #788 <Field int nextPendingMessageIndex>
			else
	//* 188  406:goto            421
				pendingMessages.remove(nextPendingMessageIndex);
	//  189  409:aload_0         
	//  190  410:getfield        #229 <Field ArrayList pendingMessages>
	//  191  413:aload_0         
	//  192  414:getfield        #788 <Field int nextPendingMessageIndex>
	//  193  417:invokevirtual   #816 <Method Object ArrayList.remove(int)>
	//  194  420:pop             
			if(nextPendingMessageIndex < pendingMessages.size())
	//* 195  421:aload_0         
	//* 196  422:getfield        #788 <Field int nextPendingMessageIndex>
	//* 197  425:aload_0         
	//* 198  426:getfield        #229 <Field ArrayList pendingMessages>
	//* 199  429:invokevirtual   #800 <Method int ArrayList.size()>
	//* 200  432:icmpge          454
				pendingmessageinfo1 = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex);
	//  201  435:aload_0         
	//  202  436:getfield        #229 <Field ArrayList pendingMessages>
	//  203  439:aload_0         
	//  204  440:getfield        #788 <Field int nextPendingMessageIndex>
	//  205  443:invokevirtual   #791 <Method Object ArrayList.get(int)>
	//  206  446:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//  207  449:astore          9
			else
	//* 208  451:goto            318
				pendingmessageinfo1 = null;
	//  209  454:aconst_null     
	//  210  455:astore          9
		}
	//* 211  457:goto            318
		return;
	//  212  460:return          
	//  213  461:return          
	}

	private void maybeUpdateLoadingPeriod()
		throws IOException
	{
		queue.reevaluateBuffer(rendererPositionUs);
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:aload_0         
	//    3    5:getfield        #376 <Field long rendererPositionUs>
	//    4    8:invokevirtual   #537 <Method void MediaPeriodQueue.reevaluateBuffer(long)>
		if(queue.shouldLoadNextMediaPeriod())
	//*   5   11:aload_0         
	//*   6   12:getfield        #158 <Field MediaPeriodQueue queue>
	//*   7   15:invokevirtual   #820 <Method boolean MediaPeriodQueue.shouldLoadNextMediaPeriod()>
	//*   8   18:ifeq            122
		{
			MediaPeriodInfo mediaperiodinfo = queue.getNextMediaPeriodInfo(rendererPositionUs, playbackInfo);
	//    9   21:aload_0         
	//   10   22:getfield        #158 <Field MediaPeriodQueue queue>
	//   11   25:aload_0         
	//   12   26:getfield        #376 <Field long rendererPositionUs>
	//   13   29:aload_0         
	//   14   30:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   15   33:invokevirtual   #824 <Method MediaPeriodInfo MediaPeriodQueue.getNextMediaPeriodInfo(long, PlaybackInfo)>
	//   16   36:astore_1        
			if(mediaperiodinfo == null)
	//*  17   37:aload_1         
	//*  18   38:ifnonnull       51
			{
				mediaSource.maybeThrowSourceInfoRefreshError();
	//   19   41:aload_0         
	//   20   42:getfield        #590 <Field MediaSource mediaSource>
	//   21   45:invokeinterface #829 <Method void MediaSource.maybeThrowSourceInfoRefreshError()>
				return;
	//   22   50:return          
			}
			Object obj = playbackInfo.timeline.getPeriod(mediaperiodinfo.id.periodIndex, period, true).uid;
	//   23   51:aload_0         
	//   24   52:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   25   55:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//   26   58:aload_1         
	//   27   59:getfield        #725 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   28   62:getfield        #660 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   29   65:aload_0         
	//   30   66:getfield        #241 <Field Timeline$Period period>
	//   31   69:iconst_1        
	//   32   70:invokevirtual   #670 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//   33   73:getfield        #673 <Field Object Timeline$Period.uid>
	//   34   76:astore_2        
			queue.enqueueNextMediaPeriod(rendererCapabilities, trackSelector, loadControl.getAllocator(), mediaSource, obj, mediaperiodinfo).prepare(((com.google.android.exoplayer2.source.MediaPeriod.Callback) (this)), mediaperiodinfo.startPositionUs);
	//   35   77:aload_0         
	//   36   78:getfield        #158 <Field MediaPeriodQueue queue>
	//   37   81:aload_0         
	//   38   82:getfield        #207 <Field RendererCapabilities[] rendererCapabilities>
	//   39   85:aload_0         
	//   40   86:getfield        #137 <Field TrackSelector trackSelector>
	//   41   89:aload_0         
	//   42   90:getfield        #141 <Field LoadControl loadControl>
	//   43   93:invokeinterface #833 <Method com.google.android.exoplayer2.upstream.Allocator LoadControl.getAllocator()>
	//   44   98:aload_0         
	//   45   99:getfield        #590 <Field MediaSource mediaSource>
	//   46  102:aload_2         
	//   47  103:aload_1         
	//   48  104:invokevirtual   #837 <Method MediaPeriod MediaPeriodQueue.enqueueNextMediaPeriod(RendererCapabilities[], TrackSelector, com.google.android.exoplayer2.upstream.Allocator, MediaSource, Object, MediaPeriodInfo)>
	//   49  107:aload_0         
	//   50  108:aload_1         
	//   51  109:getfield        #571 <Field long MediaPeriodInfo.startPositionUs>
	//   52  112:invokeinterface #841 <Method void MediaPeriod.prepare(com.google.android.exoplayer2.source.MediaPeriod$Callback, long)>
			setIsLoading(true);
	//   53  117:aload_0         
	//   54  118:iconst_1        
	//   55  119:invokespecial   #733 <Method void setIsLoading(boolean)>
		}
	//   56  122:return          
	}

	private void prepareInternal(MediaSource mediasource, boolean flag, boolean flag1)
	{
		pendingPrepareCount = pendingPrepareCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #608 <Field int pendingPrepareCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #608 <Field int pendingPrepareCount>
		resetInternal(true, flag, flag1);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:iload_2         
	//    9   13:iload_3         
	//   10   14:invokespecial   #583 <Method void resetInternal(boolean, boolean, boolean)>
		loadControl.onPrepared();
	//   11   17:aload_0         
	//   12   18:getfield        #141 <Field LoadControl loadControl>
	//   13   21:invokeinterface #846 <Method void LoadControl.onPrepared()>
		mediaSource = mediasource;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #590 <Field MediaSource mediaSource>
		setState(2);
	//   17   31:aload_0         
	//   18   32:iconst_2        
	//   19   33:invokespecial   #409 <Method void setState(int)>
		mediasource.prepareSource(player, true, ((com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener) (this)));
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:getfield        #151 <Field ExoPlayer player>
	//   23   41:iconst_1        
	//   24   42:aload_0         
	//   25   43:invokeinterface #850 <Method void MediaSource.prepareSource(ExoPlayer, boolean, com.google.android.exoplayer2.source.MediaSource$SourceInfoRefreshListener)>
		handler.sendEmptyMessage(2);
	//   26   48:aload_0         
	//   27   49:getfield        #271 <Field HandlerWrapper handler>
	//   28   52:iconst_2        
	//   29   53:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//   30   58:pop             
	//   31   59:return          
	}

	private void releaseInternal()
	{
		resetInternal(true, true, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:iconst_1        
	//    4    4:invokespecial   #583 <Method void resetInternal(boolean, boolean, boolean)>
		loadControl.onReleased();
	//    5    7:aload_0         
	//    6    8:getfield        #141 <Field LoadControl loadControl>
	//    7   11:invokeinterface #857 <Method void LoadControl.onReleased()>
		setState(1);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokespecial   #409 <Method void setState(int)>
		internalPlaybackThread.quit();
	//   11   21:aload_0         
	//   12   22:getfield        #256 <Field HandlerThread internalPlaybackThread>
	//   13   25:invokevirtual   #860 <Method boolean HandlerThread.quit()>
	//   14   28:pop             
		this;
	//   15   29:aload_0         
		JVM INSTR monitorenter ;
	//   16   30:monitorenter    
		released = true;
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:putfield        #862 <Field boolean released>
		((Object)this).notifyAll();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #865 <Method void Object.notifyAll()>
		this;
	//   22   40:aload_0         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		return;
	//   24   42:return          
		Exception exception;
		exception;
	//   25   43:astore_1        
		this;
	//   26   44:aload_0         
		JVM INSTR monitorexit ;
	//   27   45:monitorexit     
		throw exception;
	//   28   46:aload_1         
	//   29   47:athrow          
	}

	private boolean rendererWaitingForNextStream(Renderer renderer)
	{
		MediaPeriodHolder mediaperiodholder = queue.getReadingPeriod();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:invokevirtual   #778 <Method MediaPeriodHolder MediaPeriodQueue.getReadingPeriod()>
	//    3    7:astore_2        
		return mediaperiodholder.next != null && mediaperiodholder.next.prepared && renderer.hasReadStreamToEnd();
	//    4    8:aload_2         
	//    5    9:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//    6   12:ifnull          36
	//    7   15:aload_2         
	//    8   16:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//    9   19:getfield        #722 <Field boolean MediaPeriodHolder.prepared>
	//   10   22:ifeq            36
	//   11   25:aload_1         
	//   12   26:invokeinterface #781 <Method boolean Renderer.hasReadStreamToEnd()>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	private void reselectTracksInternal()
		throws ExoPlaybackException
	{
		if(!queue.hasPlayingPeriod())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//*   2    4:invokevirtual   #331 <Method boolean MediaPeriodQueue.hasPlayingPeriod()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		float f = mediaClock.getPlaybackParameters().speed;
	//    5   11:aload_0         
	//    6   12:getfield        #224 <Field DefaultMediaClock mediaClock>
	//    7   15:invokevirtual   #548 <Method PlaybackParameters DefaultMediaClock.getPlaybackParameters()>
	//    8   18:getfield        #554 <Field float PlaybackParameters.speed>
	//    9   21:fstore_1        
		MediaPeriodHolder mediaperiodholder = queue.getPlayingPeriod();
	//   10   22:aload_0         
	//   11   23:getfield        #158 <Field MediaPeriodQueue queue>
	//   12   26:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//   13   29:astore          8
		boolean aflag[] = ((boolean []) (queue.getReadingPeriod()));
	//   14   31:aload_0         
	//   15   32:getfield        #158 <Field MediaPeriodQueue queue>
	//   16   35:invokevirtual   #778 <Method MediaPeriodHolder MediaPeriodQueue.getReadingPeriod()>
	//   17   38:astore          9
		int i = 1;
	//   18   40:iconst_1        
	//   19   41:istore_2        
		for(; mediaperiodholder != null; mediaperiodholder = mediaperiodholder.next)
	//*  20   42:aload           8
	//*  21   44:ifnull          468
		{
			if(!mediaperiodholder.prepared)
	//*  22   47:aload           8
	//*  23   49:getfield        #722 <Field boolean MediaPeriodHolder.prepared>
	//*  24   52:ifne            56
				return;
	//   25   55:return          
			if(mediaperiodholder.selectTracks(f))
	//*  26   56:aload           8
	//*  27   58:fload_1         
	//*  28   59:invokevirtual   #870 <Method boolean MediaPeriodHolder.selectTracks(float)>
	//*  29   62:ifeq            449
			{
				if(i != 0)
	//*  30   65:iload_2         
	//*  31   66:ifeq            359
				{
					mediaperiodholder = queue.getPlayingPeriod();
	//   32   69:aload_0         
	//   33   70:getfield        #158 <Field MediaPeriodQueue queue>
	//   34   73:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//   35   76:astore          8
					boolean flag = queue.removeAfter(mediaperiodholder);
	//   36   78:aload_0         
	//   37   79:getfield        #158 <Field MediaPeriodQueue queue>
	//   38   82:aload           8
	//   39   84:invokevirtual   #874 <Method boolean MediaPeriodQueue.removeAfter(MediaPeriodHolder)>
	//   40   87:istore          5
					aflag = new boolean[renderers.length];
	//   41   89:aload_0         
	//   42   90:getfield        #135 <Field Renderer[] renderers>
	//   43   93:arraylength     
	//   44   94:newarray        boolean[]
	//   45   96:astore          9
					long l = mediaperiodholder.applyTrackSelection(playbackInfo.positionUs, flag, aflag);
	//   46   98:aload           8
	//   47  100:aload_0         
	//   48  101:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   49  104:getfield        #368 <Field long PlaybackInfo.positionUs>
	//   50  107:iload           5
	//   51  109:aload           9
	//   52  111:invokevirtual   #878 <Method long MediaPeriodHolder.applyTrackSelection(long, boolean, boolean[])>
	//   53  114:lstore          6
					updateLoadControlTrackSelection(mediaperiodholder.trackGroups, mediaperiodholder.trackSelectorResult);
	//   54  116:aload_0         
	//   55  117:aload           8
	//   56  119:getfield        #561 <Field TrackGroupArray MediaPeriodHolder.trackGroups>
	//   57  122:aload           8
	//   58  124:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//   59  127:invokespecial   #565 <Method void updateLoadControlTrackSelection(TrackGroupArray, TrackSelectorResult)>
					if(playbackInfo.playbackState != 4 && l != playbackInfo.positionUs)
	//*  60  130:aload_0         
	//*  61  131:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  62  134:getfield        #415 <Field int PlaybackInfo.playbackState>
	//*  63  137:iconst_4        
	//*  64  138:icmpeq          195
	//*  65  141:lload           6
	//*  66  143:aload_0         
	//*  67  144:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  68  147:getfield        #368 <Field long PlaybackInfo.positionUs>
	//*  69  150:lcmp            
	//*  70  151:ifeq            195
					{
						playbackInfo = playbackInfo.fromNewPosition(playbackInfo.periodId, l, playbackInfo.contentPositionUs);
	//   71  154:aload_0         
	//   72  155:aload_0         
	//   73  156:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   74  159:aload_0         
	//   75  160:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   76  163:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   77  166:lload           6
	//   78  168:aload_0         
	//   79  169:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   80  172:getfield        #663 <Field long PlaybackInfo.contentPositionUs>
	//   81  175:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//   82  178:putfield        #198 <Field PlaybackInfo playbackInfo>
						playbackInfoUpdate.setPositionDiscontinuity(4);
	//   83  181:aload_0         
	//   84  182:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   85  185:iconst_4        
	//   86  186:invokevirtual   #881 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.setPositionDiscontinuity(int)>
						resetRendererPosition(l);
	//   87  189:aload_0         
	//   88  190:lload           6
	//   89  192:invokespecial   #574 <Method void resetRendererPosition(long)>
					}
					boolean aflag1[] = new boolean[renderers.length];
	//   90  195:aload_0         
	//   91  196:getfield        #135 <Field Renderer[] renderers>
	//   92  199:arraylength     
	//   93  200:newarray        boolean[]
	//   94  202:astore          10
					i = 0;
	//   95  204:iconst_0        
	//   96  205:istore_2        
					int j;
					int k;
					for(j = i; i < renderers.length; j = k)
	//*  97  206:iload_2         
	//*  98  207:istore_3        
	//*  99  208:iload_2         
	//* 100  209:aload_0         
	//* 101  210:getfield        #135 <Field Renderer[] renderers>
	//* 102  213:arraylength     
	//* 103  214:icmpge          328
					{
						Renderer renderer = renderers[i];
	//  104  217:aload_0         
	//  105  218:getfield        #135 <Field Renderer[] renderers>
	//  106  221:iload_2         
	//  107  222:aaload          
	//  108  223:astore          11
						boolean flag1;
						if(renderer.getState() != 0)
	//* 109  225:aload           11
	//* 110  227:invokeinterface #440 <Method int Renderer.getState()>
	//* 111  232:ifeq            241
							flag1 = true;
	//  112  235:iconst_1        
	//  113  236:istore          5
						else
	//* 114  238:goto            244
							flag1 = false;
	//  115  241:iconst_0        
	//  116  242:istore          5
						aflag1[i] = flag1;
	//  117  244:aload           10
	//  118  246:iload_2         
	//  119  247:iload           5
	//  120  249:bastore         
						com.google.android.exoplayer2.source.SampleStream samplestream = mediaperiodholder.sampleStreams[i];
	//  121  250:aload           8
	//  122  252:getfield        #467 <Field com.google.android.exoplayer2.source.SampleStream[] MediaPeriodHolder.sampleStreams>
	//  123  255:iload_2         
	//  124  256:aaload          
	//  125  257:astore          12
						k = j;
	//  126  259:iload_3         
	//  127  260:istore          4
						if(samplestream != null)
	//* 128  262:aload           12
	//* 129  264:ifnull          272
							k = j + 1;
	//  130  267:iload_3         
	//  131  268:iconst_1        
	//  132  269:iadd            
	//  133  270:istore          4
						if(aflag1[i])
	//* 134  272:aload           10
	//* 135  274:iload_2         
	//* 136  275:baload          
	//* 137  276:ifeq            318
							if(samplestream != renderer.getStream())
	//* 138  279:aload           12
	//* 139  281:aload           11
	//* 140  283:invokeinterface #885 <Method com.google.android.exoplayer2.source.SampleStream Renderer.getStream()>
	//* 141  288:if_acmpeq       300
								disableRenderer(renderer);
	//  142  291:aload_0         
	//  143  292:aload           11
	//  144  294:invokespecial   #887 <Method void disableRenderer(Renderer)>
							else
	//* 145  297:goto            318
							if(aflag[i])
	//* 146  300:aload           9
	//* 147  302:iload_2         
	//* 148  303:baload          
	//* 149  304:ifeq            318
								renderer.resetPosition(rendererPositionUs);
	//  150  307:aload           11
	//  151  309:aload_0         
	//  152  310:getfield        #376 <Field long rendererPositionUs>
	//  153  313:invokeinterface #890 <Method void Renderer.resetPosition(long)>
						i++;
	//  154  318:iload_2         
	//  155  319:iconst_1        
	//  156  320:iadd            
	//  157  321:istore_2        
					}

	//  158  322:iload           4
	//  159  324:istore_3        
	//* 160  325:goto            208
					playbackInfo = playbackInfo.copyWithTrackInfo(mediaperiodholder.trackGroups, mediaperiodholder.trackSelectorResult);
	//  161  328:aload_0         
	//  162  329:aload_0         
	//  163  330:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  164  333:aload           8
	//  165  335:getfield        #561 <Field TrackGroupArray MediaPeriodHolder.trackGroups>
	//  166  338:aload           8
	//  167  340:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//  168  343:invokevirtual   #894 <Method PlaybackInfo PlaybackInfo.copyWithTrackInfo(TrackGroupArray, TrackSelectorResult)>
	//  169  346:putfield        #198 <Field PlaybackInfo playbackInfo>
					enableRenderers(aflag1, j);
	//  170  349:aload_0         
	//  171  350:aload           10
	//  172  352:iload_3         
	//  173  353:invokespecial   #896 <Method void enableRenderers(boolean[], int)>
				} else
	//* 174  356:goto            418
				{
					queue.removeAfter(mediaperiodholder);
	//  175  359:aload_0         
	//  176  360:getfield        #158 <Field MediaPeriodQueue queue>
	//  177  363:aload           8
	//  178  365:invokevirtual   #874 <Method boolean MediaPeriodQueue.removeAfter(MediaPeriodHolder)>
	//  179  368:pop             
					if(mediaperiodholder.prepared)
	//* 180  369:aload           8
	//* 181  371:getfield        #722 <Field boolean MediaPeriodHolder.prepared>
	//* 182  374:ifeq            418
					{
						mediaperiodholder.applyTrackSelection(Math.max(mediaperiodholder.info.startPositionUs, mediaperiodholder.toPeriodTime(rendererPositionUs)), false);
	//  183  377:aload           8
	//  184  379:aload           8
	//  185  381:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//  186  384:getfield        #571 <Field long MediaPeriodInfo.startPositionUs>
	//  187  387:aload           8
	//  188  389:aload_0         
	//  189  390:getfield        #376 <Field long rendererPositionUs>
	//  190  393:invokevirtual   #737 <Method long MediaPeriodHolder.toPeriodTime(long)>
	//  191  396:invokestatic    #902 <Method long Math.max(long, long)>
	//  192  399:iconst_0        
	//  193  400:invokevirtual   #905 <Method long MediaPeriodHolder.applyTrackSelection(long, boolean)>
	//  194  403:pop2            
						updateLoadControlTrackSelection(mediaperiodholder.trackGroups, mediaperiodholder.trackSelectorResult);
	//  195  404:aload_0         
	//  196  405:aload           8
	//  197  407:getfield        #561 <Field TrackGroupArray MediaPeriodHolder.trackGroups>
	//  198  410:aload           8
	//  199  412:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//  200  415:invokespecial   #565 <Method void updateLoadControlTrackSelection(TrackGroupArray, TrackSelectorResult)>
					}
				}
				if(playbackInfo.playbackState != 4)
	//* 201  418:aload_0         
	//* 202  419:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 203  422:getfield        #415 <Field int PlaybackInfo.playbackState>
	//* 204  425:iconst_4        
	//* 205  426:icmpeq          448
				{
					maybeContinueLoading();
	//  206  429:aload_0         
	//  207  430:invokespecial   #540 <Method void maybeContinueLoading()>
					updatePlaybackPositions();
	//  208  433:aload_0         
	//  209  434:invokespecial   #354 <Method void updatePlaybackPositions()>
					handler.sendEmptyMessage(2);
	//  210  437:aload_0         
	//  211  438:getfield        #271 <Field HandlerWrapper handler>
	//  212  441:iconst_2        
	//  213  442:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//  214  447:pop             
				}
				return;
	//  215  448:return          
			}
			if(mediaperiodholder == aflag)
	//* 216  449:aload           8
	//* 217  451:aload           9
	//* 218  453:if_acmpne       458
				i = 0;
	//  219  456:iconst_0        
	//  220  457:istore_2        
		}

	//  221  458:aload           8
	//  222  460:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//  223  463:astore          8
	//* 224  465:goto            42
	//  225  468:return          
	}

	private void resetInternal(boolean flag, boolean flag1, boolean flag2)
	{
		int i;
		int k;
		Renderer arenderer[];
		handler.removeMessages(2);
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:iconst_2        
	//    3    5:invokeinterface #432 <Method void HandlerWrapper.removeMessages(int)>
		rebuffering = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #427 <Field boolean rebuffering>
		mediaClock.stop();
	//    7   15:aload_0         
	//    8   16:getfield        #224 <Field DefaultMediaClock mediaClock>
	//    9   19:invokevirtual   #908 <Method void DefaultMediaClock.stop()>
		rendererPositionUs = 0L;
	//   10   22:aload_0         
	//   11   23:lconst_0        
	//   12   24:putfield        #376 <Field long rendererPositionUs>
		arenderer = enabledRenderers;
	//   13   27:aload_0         
	//   14   28:getfield        #231 <Field Renderer[] enabledRenderers>
	//   15   31:astore          10
		k = arenderer.length;
	//   16   33:aload           10
	//   17   35:arraylength     
	//   18   36:istore          5
		i = 0;
	//   19   38:iconst_0        
	//   20   39:istore          4
_L3:
		if(i >= k) goto _L2; else goto _L1
	//   21   41:iload           4
	//   22   43:iload           5
	//   23   45:icmpge          86
_L1:
		Renderer renderer = arenderer[i];
	//   24   48:aload           10
	//   25   50:iload           4
	//   26   52:aaload          
	//   27   53:astore          11
		try
		{
			disableRenderer(renderer);
	//   28   55:aload_0         
	//   29   56:aload           11
	//   30   58:invokespecial   #887 <Method void disableRenderer(Renderer)>
		}
	//*  31   61:goto            77
		catch(Object obj)
	//*  32   64:astore          11
		{
			Log.e("ExoPlayerImplInternal", "Stop failed.", ((Throwable) (obj)));
	//   33   66:ldc1            #74  <String "ExoPlayerImplInternal">
	//   34   68:ldc2            #910 <String "Stop failed.">
	//   35   71:aload           11
	//   36   73:invokestatic    #916 <Method int Log.e(String, String, Throwable)>
	//   37   76:pop             
		}
		i++;
	//   38   77:iload           4
	//   39   79:iconst_1        
	//   40   80:iadd            
	//   41   81:istore          4
		  goto _L3
	//*  42   83:goto            41
_L2:
		enabledRenderers = new Renderer[0];
	//   43   86:aload_0         
	//   44   87:iconst_0        
	//   45   88:anewarray       Renderer[]
	//   46   91:putfield        #231 <Field Renderer[] enabledRenderers>
		queue.clear(flag1 ^ true);
	//   47   94:aload_0         
	//   48   95:getfield        #158 <Field MediaPeriodQueue queue>
	//   49   98:iload_2         
	//   50   99:iconst_1        
	//   51  100:ixor            
	//   52  101:invokevirtual   #919 <Method void MediaPeriodQueue.clear(boolean)>
		setIsLoading(false);
	//   53  104:aload_0         
	//   54  105:iconst_0        
	//   55  106:invokespecial   #733 <Method void setIsLoading(boolean)>
		if(flag1)
	//*  56  109:iload_2         
	//*  57  110:ifeq            118
			pendingInitialSeekPosition = null;
	//   58  113:aload_0         
	//   59  114:aconst_null     
	//   60  115:putfield        #613 <Field ExoPlayerImplInternal$SeekPosition pendingInitialSeekPosition>
		if(flag2)
	//*  61  118:iload_3         
	//*  62  119:ifeq            183
		{
			queue.setTimeline(Timeline.EMPTY);
	//   63  122:aload_0         
	//   64  123:getfield        #158 <Field MediaPeriodQueue queue>
	//   65  126:getstatic       #186 <Field Timeline Timeline.EMPTY>
	//   66  129:invokevirtual   #599 <Method void MediaPeriodQueue.setTimeline(Timeline)>
			for(Iterator iterator = pendingMessages.iterator(); iterator.hasNext(); ((PendingMessageInfo)iterator.next()).message.markAsProcessed(false));
	//   67  132:aload_0         
	//   68  133:getfield        #229 <Field ArrayList pendingMessages>
	//   69  136:invokevirtual   #923 <Method Iterator ArrayList.iterator()>
	//   70  139:astore          10
	//   71  141:aload           10
	//   72  143:invokeinterface #928 <Method boolean Iterator.hasNext()>
	//   73  148:ifeq            171
	//   74  151:aload           10
	//   75  153:invokeinterface #930 <Method Object Iterator.next()>
	//   76  158:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//   77  161:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//   78  164:iconst_0        
	//   79  165:invokevirtual   #308 <Method void PlayerMessage.markAsProcessed(boolean)>
	//*  80  168:goto            141
			pendingMessages.clear();
	//   81  171:aload_0         
	//   82  172:getfield        #229 <Field ArrayList pendingMessages>
	//   83  175:invokevirtual   #932 <Method void ArrayList.clear()>
			nextPendingMessageIndex = 0;
	//   84  178:aload_0         
	//   85  179:iconst_0        
	//   86  180:putfield        #788 <Field int nextPendingMessageIndex>
		}
		Timeline timeline;
		if(flag2)
	//*  87  183:iload_3         
	//*  88  184:ifeq            195
			timeline = Timeline.EMPTY;
	//   89  187:getstatic       #186 <Field Timeline Timeline.EMPTY>
	//   90  190:astore          10
		else
	//*  91  192:goto            207
			timeline = playbackInfo.timeline;
	//   92  195:aload_0         
	//   93  196:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   94  199:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//   95  202:astore          10
	//*  96  204:goto            192
		Object obj1;
		if(flag2)
	//*  97  207:iload_3         
	//*  98  208:ifeq            217
			obj1 = null;
	//   99  211:aconst_null     
	//  100  212:astore          11
		else
	//* 101  214:goto            226
			obj1 = playbackInfo.manifest;
	//  102  217:aload_0         
	//  103  218:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  104  221:getfield        #933 <Field Object PlaybackInfo.manifest>
	//  105  224:astore          11
		com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid;
		if(flag1)
	//* 106  226:iload_2         
	//* 107  227:ifeq            246
			mediaperiodid = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(getFirstPeriodIndex());
	//  108  230:new             #643 <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//  109  233:dup             
	//  110  234:aload_0         
	//  111  235:invokespecial   #935 <Method int getFirstPeriodIndex()>
	//  112  238:invokespecial   #937 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int)>
	//  113  241:astore          12
		else
	//* 114  243:goto            258
			mediaperiodid = playbackInfo.periodId;
	//  115  246:aload_0         
	//  116  247:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  117  250:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//  118  253:astore          12
	//* 119  255:goto            243
		long l1 = 0x1L;
	//  120  258:ldc2w           #187 <Long 0x1L>
	//  121  261:lstore          8
		long l;
		if(flag1)
	//* 122  263:iload_2         
	//* 123  264:ifeq            275
			l = 0x1L;
	//  124  267:ldc2w           #187 <Long 0x1L>
	//  125  270:lstore          6
		else
	//* 126  272:goto            284
			l = playbackInfo.positionUs;
	//  127  275:aload_0         
	//  128  276:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  129  279:getfield        #368 <Field long PlaybackInfo.positionUs>
	//  130  282:lstore          6
		if(!flag1)
	//* 131  284:iload_2         
	//* 132  285:ifeq            291
	//* 133  288:goto            303
			l1 = playbackInfo.contentPositionUs;
	//  134  291:aload_0         
	//  135  292:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  136  295:getfield        #663 <Field long PlaybackInfo.contentPositionUs>
	//  137  298:lstore          8
	//* 138  300:goto            288
		int j = playbackInfo.playbackState;
	//  139  303:aload_0         
	//  140  304:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  141  307:getfield        #415 <Field int PlaybackInfo.playbackState>
	//  142  310:istore          4
		TrackGroupArray trackgrouparray;
		if(flag2)
	//* 143  312:iload_3         
	//* 144  313:ifeq            324
			trackgrouparray = TrackGroupArray.EMPTY;
	//  145  316:getstatic       #193 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//  146  319:astore          13
		else
	//* 147  321:goto            336
			trackgrouparray = playbackInfo.trackGroups;
	//  148  324:aload_0         
	//  149  325:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  150  328:getfield        #938 <Field TrackGroupArray PlaybackInfo.trackGroups>
	//  151  331:astore          13
	//* 152  333:goto            321
		TrackSelectorResult trackselectorresult;
		if(flag2)
	//* 153  336:iload_3         
	//* 154  337:ifeq            349
			trackselectorresult = emptyTrackSelectorResult;
	//  155  340:aload_0         
	//  156  341:getfield        #139 <Field TrackSelectorResult emptyTrackSelectorResult>
	//  157  344:astore          14
		else
	//* 158  346:goto            361
			trackselectorresult = playbackInfo.trackSelectorResult;
	//  159  349:aload_0         
	//  160  350:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  161  353:getfield        #939 <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
	//  162  356:astore          14
	//* 163  358:goto            346
		playbackInfo = new PlaybackInfo(timeline, obj1, mediaperiodid, l, l1, j, false, trackgrouparray, trackselectorresult);
	//  164  361:aload_0         
	//  165  362:new             #180 <Class PlaybackInfo>
	//  166  365:dup             
	//  167  366:aload           10
	//  168  368:aload           11
	//  169  370:aload           12
	//  170  372:lload           6
	//  171  374:lload           8
	//  172  376:iload           4
	//  173  378:iconst_0        
	//  174  379:aload           13
	//  175  381:aload           14
	//  176  383:invokespecial   #942 <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//  177  386:putfield        #198 <Field PlaybackInfo playbackInfo>
		if(flag && mediaSource != null)
	//* 178  389:iload_1         
	//* 179  390:ifeq            415
	//* 180  393:aload_0         
	//* 181  394:getfield        #590 <Field MediaSource mediaSource>
	//* 182  397:ifnull          415
		{
			mediaSource.releaseSource(((com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener) (this)));
	//  183  400:aload_0         
	//  184  401:getfield        #590 <Field MediaSource mediaSource>
	//  185  404:aload_0         
	//  186  405:invokeinterface #946 <Method void MediaSource.releaseSource(com.google.android.exoplayer2.source.MediaSource$SourceInfoRefreshListener)>
			mediaSource = null;
	//  187  410:aload_0         
	//  188  411:aconst_null     
	//  189  412:putfield        #590 <Field MediaSource mediaSource>
		}
		return;
	//  190  415:return          
	}

	private void resetRendererPosition(long l)
		throws ExoPlaybackException
	{
		if(queue.hasPlayingPeriod())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//*   2    4:invokevirtual   #331 <Method boolean MediaPeriodQueue.hasPlayingPeriod()>
	//*   3    7:ifne            13
	//*   4   10:goto            25
			l = queue.getPlayingPeriod().toRendererTime(l);
	//    5   13:aload_0         
	//    6   14:getfield        #158 <Field MediaPeriodQueue queue>
	//    7   17:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//    8   20:lload_1         
	//    9   21:invokevirtual   #949 <Method long MediaPeriodHolder.toRendererTime(long)>
	//   10   24:lstore_1        
		rendererPositionUs = l;
	//   11   25:aload_0         
	//   12   26:lload_1         
	//   13   27:putfield        #376 <Field long rendererPositionUs>
		mediaClock.resetPosition(rendererPositionUs);
	//   14   30:aload_0         
	//   15   31:getfield        #224 <Field DefaultMediaClock mediaClock>
	//   16   34:aload_0         
	//   17   35:getfield        #376 <Field long rendererPositionUs>
	//   18   38:invokevirtual   #950 <Method void DefaultMediaClock.resetPosition(long)>
		Renderer arenderer[] = enabledRenderers;
	//   19   41:aload_0         
	//   20   42:getfield        #231 <Field Renderer[] enabledRenderers>
	//   21   45:astore          5
		int j = arenderer.length;
	//   22   47:aload           5
	//   23   49:arraylength     
	//   24   50:istore          4
		for(int i = 0; i < j; i++)
	//*  25   52:iconst_0        
	//*  26   53:istore_3        
	//*  27   54:iload_3         
	//*  28   55:iload           4
	//*  29   57:icmpge          80
			arenderer[i].resetPosition(rendererPositionUs);
	//   30   60:aload           5
	//   31   62:iload_3         
	//   32   63:aaload          
	//   33   64:aload_0         
	//   34   65:getfield        #376 <Field long rendererPositionUs>
	//   35   68:invokeinterface #890 <Method void Renderer.resetPosition(long)>

	//   36   73:iload_3         
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:istore_3        
	//*  40   77:goto            54
	//   41   80:return          
	}

	private boolean resolvePendingMessagePosition(PendingMessageInfo pendingmessageinfo)
	{
		if(pendingmessageinfo.resolvedPeriodUid == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #803 <Field Object ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodUid>
	//*   2    4:ifnonnull       104
		{
			Pair pair = resolveSeekPosition(new SeekPosition(pendingmessageinfo.message.getTimeline(), pendingmessageinfo.message.getWindowIndex(), C.msToUs(pendingmessageinfo.message.getPositionMs())), false);
	//    3    7:aload_0         
	//    4    8:new             #29  <Class ExoPlayerImplInternal$SeekPosition>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//    8   16:invokevirtual   #956 <Method Timeline PlayerMessage.getTimeline()>
	//    9   19:aload_1         
	//   10   20:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//   11   23:invokevirtual   #959 <Method int PlayerMessage.getWindowIndex()>
	//   12   26:aload_1         
	//   13   27:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//   14   30:invokevirtual   #962 <Method long PlayerMessage.getPositionMs()>
	//   15   33:invokestatic    #967 <Method long C.msToUs(long)>
	//   16   36:invokespecial   #970 <Method void ExoPlayerImplInternal$SeekPosition(Timeline, int, long)>
	//   17   39:iconst_0        
	//   18   40:invokespecial   #617 <Method Pair resolveSeekPosition(ExoPlayerImplInternal$SeekPosition, boolean)>
	//   19   43:astore_3        
			if(pair == null)
	//*  20   44:aload_3         
	//*  21   45:ifnonnull       50
			{
				return false;
	//   22   48:iconst_0        
	//   23   49:ireturn         
			} else
			{
				pendingmessageinfo.setResolvedPosition(((Integer)pair.first).intValue(), ((Long)pair.second).longValue(), playbackInfo.timeline.getPeriod(((Integer)pair.first).intValue(), period, true).uid);
	//   24   50:aload_1         
	//   25   51:aload_3         
	//   26   52:getfield        #624 <Field Object Pair.first>
	//   27   55:checkcast       #626 <Class Integer>
	//   28   58:invokevirtual   #629 <Method int Integer.intValue()>
	//   29   61:aload_3         
	//   30   62:getfield        #632 <Field Object Pair.second>
	//   31   65:checkcast       #634 <Class Long>
	//   32   68:invokevirtual   #637 <Method long Long.longValue()>
	//   33   71:aload_0         
	//   34   72:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   35   75:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//   36   78:aload_3         
	//   37   79:getfield        #624 <Field Object Pair.first>
	//   38   82:checkcast       #626 <Class Integer>
	//   39   85:invokevirtual   #629 <Method int Integer.intValue()>
	//   40   88:aload_0         
	//   41   89:getfield        #241 <Field Timeline$Period period>
	//   42   92:iconst_1        
	//   43   93:invokevirtual   #670 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//   44   96:getfield        #673 <Field Object Timeline$Period.uid>
	//   45   99:invokevirtual   #974 <Method void ExoPlayerImplInternal$PendingMessageInfo.setResolvedPosition(int, long, Object)>
				return true;
	//   46  102:iconst_1        
	//   47  103:ireturn         
			}
		}
		int i = playbackInfo.timeline.getIndexOfPeriod(pendingmessageinfo.resolvedPeriodUid);
	//   48  104:aload_0         
	//   49  105:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   50  108:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//   51  111:aload_1         
	//   52  112:getfield        #803 <Field Object ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodUid>
	//   53  115:invokevirtual   #678 <Method int Timeline.getIndexOfPeriod(Object)>
	//   54  118:istore_2        
		if(i == -1)
	//*  55  119:iload_2         
	//*  56  120:iconst_m1       
	//*  57  121:icmpne          126
		{
			return false;
	//   58  124:iconst_0        
	//   59  125:ireturn         
		} else
		{
			pendingmessageinfo.resolvedPeriodIndex = i;
	//   60  126:aload_1         
	//   61  127:iload_2         
	//   62  128:putfield        #794 <Field int ExoPlayerImplInternal$PendingMessageInfo.resolvedPeriodIndex>
			return true;
	//   63  131:iconst_1        
	//   64  132:ireturn         
		}
	}

	private void resolvePendingMessagePositions()
	{
		for(int i = pendingMessages.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field ArrayList pendingMessages>
	//*   2    4:invokevirtual   #800 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            66
			if(!resolvePendingMessagePosition((PendingMessageInfo)pendingMessages.get(i)))
	//*   8   14:aload_0         
	//*   9   15:aload_0         
	//*  10   16:getfield        #229 <Field ArrayList pendingMessages>
	//*  11   19:iload_1         
	//*  12   20:invokevirtual   #791 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//*  14   26:invokespecial   #976 <Method boolean resolvePendingMessagePosition(ExoPlayerImplInternal$PendingMessageInfo)>
	//*  15   29:ifne            59
			{
				((PendingMessageInfo)pendingMessages.get(i)).message.markAsProcessed(false);
	//   16   32:aload_0         
	//   17   33:getfield        #229 <Field ArrayList pendingMessages>
	//   18   36:iload_1         
	//   19   37:invokevirtual   #791 <Method Object ArrayList.get(int)>
	//   20   40:checkcast       #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//   21   43:getfield        #807 <Field PlayerMessage ExoPlayerImplInternal$PendingMessageInfo.message>
	//   22   46:iconst_0        
	//   23   47:invokevirtual   #308 <Method void PlayerMessage.markAsProcessed(boolean)>
				pendingMessages.remove(i);
	//   24   50:aload_0         
	//   25   51:getfield        #229 <Field ArrayList pendingMessages>
	//   26   54:iload_1         
	//   27   55:invokevirtual   #816 <Method Object ArrayList.remove(int)>
	//   28   58:pop             
			}

	//   29   59:iload_1         
	//   30   60:iconst_1        
	//   31   61:isub            
	//   32   62:istore_1        
	//*  33   63:goto            10
		Collections.sort(((java.util.List) (pendingMessages)));
	//   34   66:aload_0         
	//   35   67:getfield        #229 <Field ArrayList pendingMessages>
	//   36   70:invokestatic    #982 <Method void Collections.sort(java.util.List)>
	//   37   73:return          
	}

	private Pair resolveSeekPosition(SeekPosition seekposition, boolean flag)
	{
		IndexOutOfBoundsException indexoutofboundsexception;
		Timeline timeline1 = playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore          5
		Object obj = ((Object) (seekposition.timeline));
	//    4    9:aload_1         
	//    5   10:getfield        #985 <Field Timeline ExoPlayerImplInternal$SeekPosition.timeline>
	//    6   13:astore          6
		if(timeline1.isEmpty())
	//*   7   15:aload           5
	//*   8   17:invokevirtual   #496 <Method boolean Timeline.isEmpty()>
	//*   9   20:ifeq            25
			return null;
	//   10   23:aconst_null     
	//   11   24:areturn         
		Timeline timeline = ((Timeline) (obj));
	//   12   25:aload           6
	//   13   27:astore          4
		if(((Timeline) (obj)).isEmpty())
	//*  14   29:aload           6
	//*  15   31:invokevirtual   #496 <Method boolean Timeline.isEmpty()>
	//*  16   34:ifeq            41
			timeline = timeline1;
	//   17   37:aload           5
	//   18   39:astore          4
		int i;
		try
		{
			obj = ((Object) (timeline.getPeriodPosition(window, period, seekposition.windowIndex, seekposition.windowPositionUs)));
	//   19   41:aload           4
	//   20   43:aload_0         
	//   21   44:getfield        #236 <Field Timeline$Window window>
	//   22   47:aload_0         
	//   23   48:getfield        #241 <Field Timeline$Period period>
	//   24   51:aload_1         
	//   25   52:getfield        #986 <Field int ExoPlayerImplInternal$SeekPosition.windowIndex>
	//   26   55:aload_1         
	//   27   56:getfield        #989 <Field long ExoPlayerImplInternal$SeekPosition.windowPositionUs>
	//   28   59:invokevirtual   #525 <Method Pair Timeline.getPeriodPosition(Timeline$Window, Timeline$Period, int, long)>
	//   29   62:astore          6
		}
	//*  30   64:aload           5
	//*  31   66:aload           4
	//*  32   68:if_acmpne       74
	//*  33   71:aload           6
	//*  34   73:areturn         
	//*  35   74:aload           5
	//*  36   76:aload           4
	//*  37   78:aload           6
	//*  38   80:getfield        #624 <Field Object Pair.first>
	//*  39   83:checkcast       #626 <Class Integer>
	//*  40   86:invokevirtual   #629 <Method int Integer.intValue()>
	//*  41   89:aload_0         
	//*  42   90:getfield        #241 <Field Timeline$Period period>
	//*  43   93:iconst_1        
	//*  44   94:invokevirtual   #670 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//*  45   97:getfield        #673 <Field Object Timeline$Period.uid>
	//*  46  100:invokevirtual   #678 <Method int Timeline.getIndexOfPeriod(Object)>
	//*  47  103:istore_3        
	//*  48  104:iload_3         
	//*  49  105:iconst_m1       
	//*  50  106:icmpeq          122
	//*  51  109:iload_3         
	//*  52  110:invokestatic    #993 <Method Integer Integer.valueOf(int)>
	//*  53  113:aload           6
	//*  54  115:getfield        #632 <Field Object Pair.second>
	//*  55  118:invokestatic    #997 <Method Pair Pair.create(Object, Object)>
	//*  56  121:areturn         
	//*  57  122:iload_2         
	//*  58  123:ifeq            174
	//*  59  126:aload_0         
	//*  60  127:aload           6
	//*  61  129:getfield        #624 <Field Object Pair.first>
	//*  62  132:checkcast       #626 <Class Integer>
	//*  63  135:invokevirtual   #629 <Method int Integer.intValue()>
	//*  64  138:aload           4
	//*  65  140:aload           5
	//*  66  142:invokespecial   #682 <Method int resolveSubsequentPeriod(int, Timeline, Timeline)>
	//*  67  145:istore_3        
	//*  68  146:iload_3         
	//*  69  147:iconst_m1       
	//*  70  148:icmpeq          174
	//*  71  151:aload_0         
	//*  72  152:aload           5
	//*  73  154:aload           5
	//*  74  156:iload_3         
	//*  75  157:aload_0         
	//*  76  158:getfield        #241 <Field Timeline$Period period>
	//*  77  161:invokevirtual   #685 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//*  78  164:getfield        #688 <Field int Timeline$Period.windowIndex>
	//*  79  167:ldc2w           #187 <Long 0x1L>
	//*  80  170:invokespecial   #653 <Method Pair getPeriodPosition(Timeline, int, long)>
	//*  81  173:areturn         
	//*  82  174:aconst_null     
	//*  83  175:areturn         
	//*  84  176:new             #999 <Class IllegalSeekPositionException>
	//*  85  179:dup             
	//*  86  180:aload           5
	//*  87  182:aload_1         
	//*  88  183:getfield        #986 <Field int ExoPlayerImplInternal$SeekPosition.windowIndex>
	//*  89  186:aload_1         
	//*  90  187:getfield        #989 <Field long ExoPlayerImplInternal$SeekPosition.windowPositionUs>
	//*  91  190:invokespecial   #1000 <Method void IllegalSeekPositionException(Timeline, int, long)>
	//*  92  193:athrow          
		// Misplaced declaration of an exception variable
		catch(IndexOutOfBoundsException indexoutofboundsexception)
		{
			throw new IllegalSeekPositionException(timeline1, seekposition.windowIndex, seekposition.windowPositionUs);
		}
		if(timeline1 == timeline)
			return ((Pair) (obj));
		i = timeline1.getIndexOfPeriod(timeline.getPeriod(((Integer)((Pair) (obj)).first).intValue(), period, true).uid);
		if(i != -1)
			return Pair.create(((Object) (Integer.valueOf(i))), ((Pair) (obj)).second);
		if(flag)
		{
			int j = resolveSubsequentPeriod(((Integer)((Pair) (obj)).first).intValue(), timeline, timeline1);
			if(j != -1)
				return getPeriodPosition(timeline1, timeline1.getPeriod(j, period).windowIndex, 0x1L);
		}
		return null;
	//*  93  194:astore          4
	//*  94  196:goto            176
	}

	private int resolveSubsequentPeriod(int i, Timeline timeline, Timeline timeline1)
	{
		int l = timeline.getPeriodCount();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #1004 <Method int Timeline.getPeriodCount()>
	//    2    4:istore          6
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int k = i;
	//    5    9:iload_1         
	//    6   10:istore          5
		for(i = -1; j < l && i == -1; j++)
	//*   7   12:iconst_m1       
	//*   8   13:istore_1        
	//*   9   14:iload           4
	//*  10   16:iload           6
	//*  11   18:icmpge          86
	//*  12   21:iload_1         
	//*  13   22:iconst_m1       
	//*  14   23:icmpne          86
		{
			k = timeline.getNextPeriodIndex(k, period, window, repeatMode, shuffleModeEnabled);
	//   15   26:aload_2         
	//   16   27:iload           5
	//   17   29:aload_0         
	//   18   30:getfield        #241 <Field Timeline$Period period>
	//   19   33:aload_0         
	//   20   34:getfield        #236 <Field Timeline$Window window>
	//   21   37:aload_0         
	//   22   38:getfield        #145 <Field int repeatMode>
	//   23   41:aload_0         
	//   24   42:getfield        #147 <Field boolean shuffleModeEnabled>
	//   25   45:invokevirtual   #1008 <Method int Timeline.getNextPeriodIndex(int, Timeline$Period, Timeline$Window, int, boolean)>
	//   26   48:istore          5
			if(k == -1)
	//*  27   50:iload           5
	//*  28   52:iconst_m1       
	//*  29   53:icmpne          58
				return i;
	//   30   56:iload_1         
	//   31   57:ireturn         
			i = timeline1.getIndexOfPeriod(timeline.getPeriod(k, period, true).uid);
	//   32   58:aload_3         
	//   33   59:aload_2         
	//   34   60:iload           5
	//   35   62:aload_0         
	//   36   63:getfield        #241 <Field Timeline$Period period>
	//   37   66:iconst_1        
	//   38   67:invokevirtual   #670 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period, boolean)>
	//   39   70:getfield        #673 <Field Object Timeline$Period.uid>
	//   40   73:invokevirtual   #678 <Method int Timeline.getIndexOfPeriod(Object)>
	//   41   76:istore_1        
		}

	//   42   77:iload           4
	//   43   79:iconst_1        
	//   44   80:iadd            
	//   45   81:istore          4
	//*  46   83:goto            14
		return i;
	//   47   86:iload_1         
	//   48   87:ireturn         
	}

	private void scheduleNextWork(long l, long l1)
	{
		handler.removeMessages(2);
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:iconst_2        
	//    3    5:invokeinterface #432 <Method void HandlerWrapper.removeMessages(int)>
		handler.sendEmptyMessageAtTime(2, l + l1);
	//    4   10:aload_0         
	//    5   11:getfield        #271 <Field HandlerWrapper handler>
	//    6   14:iconst_2        
	//    7   15:lload_1         
	//    8   16:lload_3         
	//    9   17:ladd            
	//   10   18:invokeinterface #1012 <Method boolean HandlerWrapper.sendEmptyMessageAtTime(int, long)>
	//   11   23:pop             
	//   12   24:return          
	}

	private void seekToCurrentPosition(boolean flag)
		throws ExoPlaybackException
	{
		com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid = queue.getPlayingPeriod().info.id;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//    3    7:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//    4   10:getfield        #725 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//    5   13:astore          4
		long l = seekToPeriodPosition(mediaperiodid, playbackInfo.positionUs, true);
	//    6   15:aload_0         
	//    7   16:aload           4
	//    8   18:aload_0         
	//    9   19:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   10   22:getfield        #368 <Field long PlaybackInfo.positionUs>
	//   11   25:iconst_1        
	//   12   26:invokespecial   #1015 <Method long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, boolean)>
	//   13   29:lstore_2        
		if(l != playbackInfo.positionUs)
	//*  14   30:lload_2         
	//*  15   31:aload_0         
	//*  16   32:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  17   35:getfield        #368 <Field long PlaybackInfo.positionUs>
	//*  18   38:lcmp            
	//*  19   39:ifeq            75
		{
			playbackInfo = playbackInfo.fromNewPosition(mediaperiodid, l, playbackInfo.contentPositionUs);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   23   47:aload           4
	//   24   49:lload_2         
	//   25   50:aload_0         
	//   26   51:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   27   54:getfield        #663 <Field long PlaybackInfo.contentPositionUs>
	//   28   57:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//   29   60:putfield        #198 <Field PlaybackInfo playbackInfo>
			if(flag)
	//*  30   63:iload_1         
	//*  31   64:ifeq            75
				playbackInfoUpdate.setPositionDiscontinuity(4);
	//   32   67:aload_0         
	//   33   68:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   34   71:iconst_4        
	//   35   72:invokevirtual   #881 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.setPositionDiscontinuity(int)>
		}
	//   36   75:return          
	}

	private void seekToInternal(SeekPosition seekposition)
		throws ExoPlaybackException
	{
		int i;
		boolean flag;
		long l;
		long l1;
		Object obj;
		obj = ((Object) (playbackInfoUpdate));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//    2    4:astore          10
		flag = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		((PlaybackInfoUpdate) (obj)).incrementPendingOperationAcks(1);
	//    5    8:aload           10
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #611 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.incrementPendingOperationAcks(int)>
		Pair pair = resolveSeekPosition(seekposition, true);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:invokespecial   #617 <Method Pair resolveSeekPosition(ExoPlayerImplInternal$SeekPosition, boolean)>
	//   12   20:astore          11
		if(pair == null)
	//*  13   22:aload           11
	//*  14   24:ifnonnull       54
		{
			obj = ((Object) (new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(getFirstPeriodIndex())));
	//   15   27:new             #643 <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokespecial   #935 <Method int getFirstPeriodIndex()>
	//   19   35:invokespecial   #937 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int)>
	//   20   38:astore          10
			i = 1;
	//   21   40:iconst_1        
	//   22   41:istore_2        
			l = 0x1L;
	//   23   42:ldc2w           #187 <Long 0x1L>
	//   24   45:lstore          4
			l1 = l;
	//   25   47:lload           4
	//   26   49:lstore          6
		} else
	//*  27   51:goto            138
		{
			i = ((Integer)pair.first).intValue();
	//   28   54:aload           11
	//   29   56:getfield        #624 <Field Object Pair.first>
	//   30   59:checkcast       #626 <Class Integer>
	//   31   62:invokevirtual   #629 <Method int Integer.intValue()>
	//   32   65:istore_2        
			l1 = ((Long)pair.second).longValue();
	//   33   66:aload           11
	//   34   68:getfield        #632 <Field Object Pair.second>
	//   35   71:checkcast       #634 <Class Long>
	//   36   74:invokevirtual   #637 <Method long Long.longValue()>
	//   37   77:lstore          6
			obj = ((Object) (queue.resolveMediaPeriodIdForAds(i, l1)));
	//   38   79:aload_0         
	//   39   80:getfield        #158 <Field MediaPeriodQueue queue>
	//   40   83:iload_2         
	//   41   84:lload           6
	//   42   86:invokevirtual   #641 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodQueue.resolveMediaPeriodIdForAds(int, long)>
	//   43   89:astore          10
			if(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj)).isAd())
	//*  44   91:aload           10
	//*  45   93:invokevirtual   #646 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*  46   96:ifeq            107
			{
				i = 1;
	//   47   99:iconst_1        
	//   48  100:istore_2        
				l = 0L;
	//   49  101:lconst_0        
	//   50  102:lstore          4
			} else
	//*  51  104:goto            138
			{
				l = ((Long)pair.second).longValue();
	//   52  107:aload           11
	//   53  109:getfield        #632 <Field Object Pair.second>
	//   54  112:checkcast       #634 <Class Long>
	//   55  115:invokevirtual   #637 <Method long Long.longValue()>
	//   56  118:lstore          4
				if(seekposition.windowPositionUs == 0x1L)
	//*  57  120:aload_1         
	//*  58  121:getfield        #989 <Field long ExoPlayerImplInternal$SeekPosition.windowPositionUs>
	//*  59  124:ldc2w           #187 <Long 0x1L>
	//*  60  127:lcmp            
	//*  61  128:ifne            136
					i = 1;
	//   62  131:iconst_1        
	//   63  132:istore_2        
				else
	//*  64  133:goto            138
					i = 0;
	//   65  136:iconst_0        
	//   66  137:istore_2        
			}
		}
		if(mediaSource != null && pendingPrepareCount <= 0) goto _L2; else goto _L1
	//   67  138:aload_0         
	//   68  139:getfield        #590 <Field MediaSource mediaSource>
	//   69  142:ifnull          319
	//   70  145:aload_0         
	//   71  146:getfield        #608 <Field int pendingPrepareCount>
	//   72  149:ifle            155
	//*  73  152:goto            319
_L2:
		if(l != 0x1L) goto _L4; else goto _L3
	//   74  155:lload           4
	//   75  157:ldc2w           #187 <Long 0x1L>
	//   76  160:lcmp            
	//   77  161:ifne            179
_L3:
		setState(4);
	//   78  164:aload_0         
	//   79  165:iconst_4        
	//   80  166:invokespecial   #409 <Method void setState(int)>
		resetInternal(false, true, false);
	//   81  169:aload_0         
	//   82  170:iconst_0        
	//   83  171:iconst_1        
	//   84  172:iconst_0        
	//   85  173:invokespecial   #583 <Method void resetInternal(boolean, boolean, boolean)>
		  goto _L5
	//*  86  176:goto            324
_L4:
		if(!((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj)).equals(((Object) (playbackInfo.periodId)))) goto _L7; else goto _L6
	//   87  179:aload           10
	//   88  181:aload_0         
	//   89  182:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   90  185:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   91  188:invokevirtual   #712 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.equals(Object)>
	//   92  191:ifeq            294
_L6:
		seekposition = ((SeekPosition) (queue.getPlayingPeriod()));
	//   93  194:aload_0         
	//   94  195:getfield        #158 <Field MediaPeriodQueue queue>
	//   95  198:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//   96  201:astore_1        
		if(seekposition == null || l == 0L) goto _L9; else goto _L8
	//   97  202:aload_1         
	//   98  203:ifnull          386
	//   99  206:lload           4
	//  100  208:lconst_0        
	//  101  209:lcmp            
	//  102  210:ifeq            386
_L8:
		long l2 = ((MediaPeriodHolder) (seekposition)).mediaPeriod.getAdjustedSeekPositionUs(l, seekParameters);
	//  103  213:aload_1         
	//  104  214:getfield        #365 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//  105  217:lload           4
	//  106  219:aload_0         
	//  107  220:getfield        #178 <Field SeekParameters seekParameters>
	//  108  223:invokeinterface #1021 <Method long MediaPeriod.getAdjustedSeekPositionUs(long, SeekParameters)>
	//  109  228:lstore          8
	//* 110  230:goto            233
_L12:
		if(C.usToMs(l2) != C.usToMs(playbackInfo.positionUs)) goto _L11; else goto _L10
	//  111  233:lload           8
	//  112  235:invokestatic    #1024 <Method long C.usToMs(long)>
	//  113  238:aload_0         
	//  114  239:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  115  242:getfield        #368 <Field long PlaybackInfo.positionUs>
	//  116  245:invokestatic    #1024 <Method long C.usToMs(long)>
	//  117  248:lcmp            
	//  118  249:ifne            291
_L10:
		l2 = playbackInfo.positionUs;
	//  119  252:aload_0         
	//  120  253:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  121  256:getfield        #368 <Field long PlaybackInfo.positionUs>
	//  122  259:lstore          8
		playbackInfo = playbackInfo.fromNewPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj)), l2, l1);
	//  123  261:aload_0         
	//  124  262:aload_0         
	//  125  263:getfield        #198 <Field PlaybackInfo playbackInfo>
	//  126  266:aload           10
	//  127  268:lload           8
	//  128  270:lload           6
	//  129  272:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//  130  275:putfield        #198 <Field PlaybackInfo playbackInfo>
		if(i != 0)
	//* 131  278:iload_2         
	//* 132  279:ifeq            290
			playbackInfoUpdate.setPositionDiscontinuity(2);
	//  133  282:aload_0         
	//  134  283:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//  135  286:iconst_2        
	//  136  287:invokevirtual   #881 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.setPositionDiscontinuity(int)>
		return;
	//  137  290:return          
	//* 138  291:goto            298
_L7:
		l2 = l;
	//  139  294:lload           4
	//  140  296:lstore          8
_L11:
		l2 = seekToPeriodPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj)), l2);
	//  141  298:aload_0         
	//  142  299:aload           10
	//  143  301:lload           8
	//  144  303:invokespecial   #708 <Method long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//  145  306:lstore          8
		if(l == l2)
	//* 146  308:lload           4
	//* 147  310:lload           8
	//* 148  312:lcmp            
	//* 149  313:ifeq            393
	//* 150  316:goto            395
	//* 151  319:aload_0         
	//* 152  320:aload_1         
	//* 153  321:putfield        #613 <Field ExoPlayerImplInternal$SeekPosition pendingInitialSeekPosition>
	//* 154  324:aload_0         
	//* 155  325:aload_0         
	//* 156  326:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 157  329:aload           10
	//* 158  331:lload           4
	//* 159  333:lload           6
	//* 160  335:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//* 161  338:putfield        #198 <Field PlaybackInfo playbackInfo>
	//* 162  341:iload_2         
	//* 163  342:ifeq            353
	//* 164  345:aload_0         
	//* 165  346:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//* 166  349:iconst_2        
	//* 167  350:invokevirtual   #881 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.setPositionDiscontinuity(int)>
	//* 168  353:return          
	//* 169  354:astore_1        
	//* 170  355:aload_0         
	//* 171  356:aload_0         
	//* 172  357:getfield        #198 <Field PlaybackInfo playbackInfo>
	//* 173  360:aload           10
	//* 174  362:lload           4
	//* 175  364:lload           6
	//* 176  366:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//* 177  369:putfield        #198 <Field PlaybackInfo playbackInfo>
	//* 178  372:iload_2         
	//* 179  373:ifeq            384
	//* 180  376:aload_0         
	//* 181  377:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//* 182  380:iconst_2        
	//* 183  381:invokevirtual   #881 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.setPositionDiscontinuity(int)>
	//* 184  384:aload_1         
	//* 185  385:athrow          
	//* 186  386:lload           4
	//* 187  388:lstore          8
	//* 188  390:goto            233
			flag = false;
	//  189  393:iconst_0        
	//  190  394:istore_3        
		break MISSING_BLOCK_LABEL_395;
_L1:
		pendingInitialSeekPosition = seekposition;
_L5:
		playbackInfo = playbackInfo.fromNewPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj)), l, l1);
		if(i != 0)
			playbackInfoUpdate.setPositionDiscontinuity(2);
		return;
		seekposition;
		playbackInfo = playbackInfo.fromNewPosition(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (obj)), l, l1);
		if(i != 0)
			playbackInfoUpdate.setPositionDiscontinuity(2);
		throw seekposition;
_L9:
		l2 = l;
		  goto _L12
		i |= ((int) (flag));
	//  191  395:iload_2         
	//  192  396:iload_3         
	//  193  397:ior             
	//  194  398:istore_2        
		l = l2;
	//  195  399:lload           8
	//  196  401:lstore          4
		  goto _L5
	//* 197  403:goto            324
	}

	private long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l)
		throws ExoPlaybackException
	{
		boolean flag;
		if(queue.getPlayingPeriod() != queue.getReadingPeriod())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//*   2    4:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #158 <Field MediaPeriodQueue queue>
	//*   5   11:invokevirtual   #778 <Method MediaPeriodHolder MediaPeriodQueue.getReadingPeriod()>
	//*   6   14:if_acmpeq       23
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          4
		else
	//*   9   20:goto            26
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore          4
		return seekToPeriodPosition(mediaperiodid, l, flag);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:lload_2         
	//   15   29:iload           4
	//   16   31:invokespecial   #1015 <Method long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, boolean)>
	//   17   34:lreturn         
	}

	private long seekToPeriodPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l, boolean flag)
		throws ExoPlaybackException
	{
		stopRenderers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #412 <Method void stopRenderers()>
		rebuffering = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #427 <Field boolean rebuffering>
		setState(2);
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:invokespecial   #409 <Method void setState(int)>
		MediaPeriodHolder mediaperiodholder1 = queue.getPlayingPeriod();
	//    8   14:aload_0         
	//    9   15:getfield        #158 <Field MediaPeriodQueue queue>
	//   10   18:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//   11   21:astore          10
		MediaPeriodHolder mediaperiodholder = mediaperiodholder1;
	//   12   23:aload           10
	//   13   25:astore          9
		do
		{
			if(mediaperiodholder == null)
				break;
	//   14   27:aload           9
	//   15   29:ifnull          68
			if(shouldKeepPeriodHolder(mediaperiodid, l, mediaperiodholder))
	//*  16   32:aload_0         
	//*  17   33:aload_1         
	//*  18   34:lload_2         
	//*  19   35:aload           9
	//*  20   37:invokespecial   #1028 <Method boolean shouldKeepPeriodHolder(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, MediaPeriodHolder)>
	//*  21   40:ifeq            56
			{
				queue.removeAfter(mediaperiodholder);
	//   22   43:aload_0         
	//   23   44:getfield        #158 <Field MediaPeriodQueue queue>
	//   24   47:aload           9
	//   25   49:invokevirtual   #874 <Method boolean MediaPeriodQueue.removeAfter(MediaPeriodHolder)>
	//   26   52:pop             
				break;
	//   27   53:goto            68
			}
			mediaperiodholder = queue.advancePlayingPeriod();
	//   28   56:aload_0         
	//   29   57:getfield        #158 <Field MediaPeriodQueue queue>
	//   30   60:invokevirtual   #568 <Method MediaPeriodHolder MediaPeriodQueue.advancePlayingPeriod()>
	//   31   63:astore          9
		} while(true);
	//   32   65:goto            27
		if(mediaperiodholder1 != mediaperiodholder || flag)
	//*  33   68:aload           10
	//*  34   70:aload           9
	//*  35   72:if_acmpne       80
	//*  36   75:iload           4
	//*  37   77:ifeq            127
		{
			mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (enabledRenderers));
	//   38   80:aload_0         
	//   39   81:getfield        #231 <Field Renderer[] enabledRenderers>
	//   40   84:astore_1        
			int j = mediaperiodid.length;
	//   41   85:aload_1         
	//   42   86:arraylength     
	//   43   87:istore          6
			for(int i = 0; i < j; i++)
	//*  44   89:iconst_0        
	//*  45   90:istore          5
	//*  46   92:iload           5
	//*  47   94:iload           6
	//*  48   96:icmpge          116
				disableRenderer(((Renderer) (mediaperiodid[i])));
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:iload           5
	//   52  103:aaload          
	//   53  104:invokespecial   #887 <Method void disableRenderer(Renderer)>

	//   54  107:iload           5
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore          5
	//*  58  113:goto            92
			enabledRenderers = new Renderer[0];
	//   59  116:aload_0         
	//   60  117:iconst_0        
	//   61  118:anewarray       Renderer[]
	//   62  121:putfield        #231 <Field Renderer[] enabledRenderers>
			mediaperiodholder1 = null;
	//   63  124:aconst_null     
	//   64  125:astore          10
		}
		if(mediaperiodholder != null)
	//*  65  127:aload           9
	//*  66  129:ifnull          199
		{
			updatePlayingPeriodRenderers(mediaperiodholder1);
	//   67  132:aload_0         
	//   68  133:aload           10
	//   69  135:invokespecial   #578 <Method void updatePlayingPeriodRenderers(MediaPeriodHolder)>
			long l1 = l;
	//   70  138:lload_2         
	//   71  139:lstore          7
			if(mediaperiodholder.hasEnabledTracks)
	//*  72  141:aload           9
	//*  73  143:getfield        #1031 <Field boolean MediaPeriodHolder.hasEnabledTracks>
	//*  74  146:ifeq            183
			{
				l1 = mediaperiodholder.mediaPeriod.seekToUs(l);
	//   75  149:aload           9
	//   76  151:getfield        #365 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//   77  154:lload_2         
	//   78  155:invokeinterface #1034 <Method long MediaPeriod.seekToUs(long)>
	//   79  160:lstore          7
				mediaperiodholder.mediaPeriod.discardBuffer(l1 - backBufferDurationUs, retainBackBufferFromKeyframe);
	//   80  162:aload           9
	//   81  164:getfield        #365 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//   82  167:lload           7
	//   83  169:aload_0         
	//   84  170:getfield        #166 <Field long backBufferDurationUs>
	//   85  173:lsub            
	//   86  174:aload_0         
	//   87  175:getfield        #171 <Field boolean retainBackBufferFromKeyframe>
	//   88  178:invokeinterface #374 <Method void MediaPeriod.discardBuffer(long, boolean)>
			}
			resetRendererPosition(l1);
	//   89  183:aload_0         
	//   90  184:lload           7
	//   91  186:invokespecial   #574 <Method void resetRendererPosition(long)>
			maybeContinueLoading();
	//   92  189:aload_0         
	//   93  190:invokespecial   #540 <Method void maybeContinueLoading()>
			l = l1;
	//   94  193:lload           7
	//   95  195:lstore_2        
		} else
	//*  96  196:goto            212
		{
			queue.clear(true);
	//   97  199:aload_0         
	//   98  200:getfield        #158 <Field MediaPeriodQueue queue>
	//   99  203:iconst_1        
	//  100  204:invokevirtual   #919 <Method void MediaPeriodQueue.clear(boolean)>
			resetRendererPosition(l);
	//  101  207:aload_0         
	//  102  208:lload_2         
	//  103  209:invokespecial   #574 <Method void resetRendererPosition(long)>
		}
		handler.sendEmptyMessage(2);
	//  104  212:aload_0         
	//  105  213:getfield        #271 <Field HandlerWrapper handler>
	//  106  216:iconst_2        
	//  107  217:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//  108  222:pop             
		return l;
	//  109  223:lload_2         
	//  110  224:lreturn         
	}

	private void sendMessageInternal(PlayerMessage playermessage)
		throws ExoPlaybackException
	{
		if(playermessage.getPositionMs() == 0x1L)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #962 <Method long PlayerMessage.getPositionMs()>
	//*   2    4:ldc2w           #187 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            17
		{
			sendMessageToTarget(playermessage);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #810 <Method void sendMessageToTarget(PlayerMessage)>
			return;
	//    8   16:return          
		}
		if(mediaSource != null && pendingPrepareCount <= 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #590 <Field MediaSource mediaSource>
	//*  11   21:ifnull          74
	//*  12   24:aload_0         
	//*  13   25:getfield        #608 <Field int pendingPrepareCount>
	//*  14   28:ifle            34
	//*  15   31:goto            74
		{
			PendingMessageInfo pendingmessageinfo = new PendingMessageInfo(playermessage);
	//   16   34:new             #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:invokespecial   #1037 <Method void ExoPlayerImplInternal$PendingMessageInfo(PlayerMessage)>
	//   20   42:astore_2        
			if(resolvePendingMessagePosition(pendingmessageinfo))
	//*  21   43:aload_0         
	//*  22   44:aload_2         
	//*  23   45:invokespecial   #976 <Method boolean resolvePendingMessagePosition(ExoPlayerImplInternal$PendingMessageInfo)>
	//*  24   48:ifeq            68
			{
				pendingMessages.add(((Object) (pendingmessageinfo)));
	//   25   51:aload_0         
	//   26   52:getfield        #229 <Field ArrayList pendingMessages>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #1040 <Method boolean ArrayList.add(Object)>
	//   29   59:pop             
				Collections.sort(((java.util.List) (pendingMessages)));
	//   30   60:aload_0         
	//   31   61:getfield        #229 <Field ArrayList pendingMessages>
	//   32   64:invokestatic    #982 <Method void Collections.sort(java.util.List)>
				return;
	//   33   67:return          
			} else
			{
				playermessage.markAsProcessed(false);
	//   34   68:aload_1         
	//   35   69:iconst_0        
	//   36   70:invokevirtual   #308 <Method void PlayerMessage.markAsProcessed(boolean)>
				return;
	//   37   73:return          
			}
		} else
		{
			pendingMessages.add(((Object) (new PendingMessageInfo(playermessage))));
	//   38   74:aload_0         
	//   39   75:getfield        #229 <Field ArrayList pendingMessages>
	//   40   78:new             #23  <Class ExoPlayerImplInternal$PendingMessageInfo>
	//   41   81:dup             
	//   42   82:aload_1         
	//   43   83:invokespecial   #1037 <Method void ExoPlayerImplInternal$PendingMessageInfo(PlayerMessage)>
	//   44   86:invokevirtual   #1040 <Method boolean ArrayList.add(Object)>
	//   45   89:pop             
			return;
	//   46   90:return          
		}
	}

	private void sendMessageToTarget(PlayerMessage playermessage)
		throws ExoPlaybackException
	{
		if(playermessage.getHandler().getLooper() == handler.getLooper())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1044 <Method Handler PlayerMessage.getHandler()>
	//*   2    4:invokevirtual   #1045 <Method Looper Handler.getLooper()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #271 <Field HandlerWrapper handler>
	//*   5   11:invokeinterface #1046 <Method Looper HandlerWrapper.getLooper()>
	//*   6   16:if_acmpne       58
		{
			deliverMessage(playermessage);
	//    7   19:aload_0         
	//    8   20:aload_1         
	//    9   21:invokespecial   #280 <Method void deliverMessage(PlayerMessage)>
			if(playbackInfo.playbackState == 3 || playbackInfo.playbackState == 2)
	//*  10   24:aload_0         
	//*  11   25:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  12   28:getfield        #415 <Field int PlaybackInfo.playbackState>
	//*  13   31:iconst_3        
	//*  14   32:icmpeq          46
	//*  15   35:aload_0         
	//*  16   36:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  17   39:getfield        #415 <Field int PlaybackInfo.playbackState>
	//*  18   42:iconst_2        
	//*  19   43:icmpne          73
			{
				handler.sendEmptyMessage(2);
	//   20   46:aload_0         
	//   21   47:getfield        #271 <Field HandlerWrapper handler>
	//   22   50:iconst_2        
	//   23   51:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//   24   56:pop             
				return;
	//   25   57:return          
			}
		} else
		{
			handler.obtainMessage(15, ((Object) (playermessage))).sendToTarget();
	//   26   58:aload_0         
	//   27   59:getfield        #271 <Field HandlerWrapper handler>
	//   28   62:bipush          15
	//   29   64:aload_1         
	//   30   65:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//   31   70:invokevirtual   #771 <Method void Message.sendToTarget()>
		}
	//   32   73:return          
	}

	private void sendMessageToTargetThread(final PlayerMessage message)
	{
		message.getHandler().post(new Runnable() {

			public void run()
			{
				try
				{
					deliverMessage(message);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ExoPlayerImplInternal this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field PlayerMessage val$message>
			//    4    8:invokestatic    #31  <Method void ExoPlayerImplInternal.access$400(ExoPlayerImplInternal, PlayerMessage)>
					return;
			//    5   11:return          
				}
				catch(ExoPlaybackException exoplaybackexception)
			//*   6   12:astore_1        
				{
					Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", ((Throwable) (exoplaybackexception)));
			//    7   13:ldc1            #33  <String "ExoPlayerImplInternal">
			//    8   15:ldc1            #35  <String "Unexpected error delivering message on external thread.">
			//    9   17:aload_1         
			//   10   18:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
			//   11   21:pop             
					throw new RuntimeException(((Throwable) (exoplaybackexception)));
			//   12   22:new             #43  <Class RuntimeException>
			//   13   25:dup             
			//   14   26:aload_1         
			//   15   27:invokespecial   #46  <Method void RuntimeException(Throwable)>
			//   16   30:athrow          
				}
			}

			final ExoPlayerImplInternal this$0;
			final PlayerMessage val$message;

			
			{
				this$0 = ExoPlayerImplInternal.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ExoPlayerImplInternal this$0>
				message = playermessage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field PlayerMessage val$message>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1044 <Method Handler PlayerMessage.getHandler()>
	//    2    4:new             #18  <Class ExoPlayerImplInternal$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1052 <Method void ExoPlayerImplInternal$1(ExoPlayerImplInternal, PlayerMessage)>
	//    7   13:invokevirtual   #1056 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void setIsLoading(boolean flag)
	{
		if(playbackInfo.isLoading != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*   2    4:getfield        #1058 <Field boolean PlaybackInfo.isLoading>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          23
			playbackInfo = playbackInfo.copyWithIsLoading(flag);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #198 <Field PlaybackInfo playbackInfo>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #1062 <Method PlaybackInfo PlaybackInfo.copyWithIsLoading(boolean)>
	//   10   20:putfield        #198 <Field PlaybackInfo playbackInfo>
	//   11   23:return          
	}

	private void setPlayWhenReadyInternal(boolean flag)
		throws ExoPlaybackException
	{
		rebuffering = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #427 <Field boolean rebuffering>
		playWhenReady = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #143 <Field boolean playWhenReady>
		if(!flag)
	//*   6   10:iload_1         
	//*   7   11:ifne            23
		{
			stopRenderers();
	//    8   14:aload_0         
	//    9   15:invokespecial   #412 <Method void stopRenderers()>
			updatePlaybackPositions();
	//   10   18:aload_0         
	//   11   19:invokespecial   #354 <Method void updatePlaybackPositions()>
			return;
	//   12   22:return          
		}
		if(playbackInfo.playbackState == 3)
	//*  13   23:aload_0         
	//*  14   24:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  15   27:getfield        #415 <Field int PlaybackInfo.playbackState>
	//*  16   30:iconst_3        
	//*  17   31:icmpne          50
		{
			startRenderers();
	//   18   34:aload_0         
	//   19   35:invokespecial   #422 <Method void startRenderers()>
			handler.sendEmptyMessage(2);
	//   20   38:aload_0         
	//   21   39:getfield        #271 <Field HandlerWrapper handler>
	//   22   42:iconst_2        
	//   23   43:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//   24   48:pop             
			return;
	//   25   49:return          
		}
		if(playbackInfo.playbackState == 2)
	//*  26   50:aload_0         
	//*  27   51:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  28   54:getfield        #415 <Field int PlaybackInfo.playbackState>
	//*  29   57:iconst_2        
	//*  30   58:icmpne          72
			handler.sendEmptyMessage(2);
	//   31   61:aload_0         
	//   32   62:getfield        #271 <Field HandlerWrapper handler>
	//   33   65:iconst_2        
	//   34   66:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//   35   71:pop             
	//   36   72:return          
	}

	private void setPlaybackParametersInternal(PlaybackParameters playbackparameters)
	{
		mediaClock.setPlaybackParameters(playbackparameters);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DefaultMediaClock mediaClock>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1069 <Method PlaybackParameters DefaultMediaClock.setPlaybackParameters(PlaybackParameters)>
	//    4    8:pop             
	//    5    9:return          
	}

	private void setRepeatModeInternal(int i)
		throws ExoPlaybackException
	{
		repeatMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #145 <Field int repeatMode>
		if(!queue.updateRepeatMode(i))
	//*   3    5:aload_0         
	//*   4    6:getfield        #158 <Field MediaPeriodQueue queue>
	//*   5    9:iload_1         
	//*   6   10:invokevirtual   #1073 <Method boolean MediaPeriodQueue.updateRepeatMode(int)>
	//*   7   13:ifne            21
			seekToCurrentPosition(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokespecial   #719 <Method void seekToCurrentPosition(boolean)>
	//   11   21:return          
	}

	private void setSeekParametersInternal(SeekParameters seekparameters)
	{
		seekParameters = seekparameters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field SeekParameters seekParameters>
	//    3    5:return          
	}

	private void setShuffleModeEnabledInternal(boolean flag)
		throws ExoPlaybackException
	{
		shuffleModeEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #147 <Field boolean shuffleModeEnabled>
		if(!queue.updateShuffleModeEnabled(flag))
	//*   3    5:aload_0         
	//*   4    6:getfield        #158 <Field MediaPeriodQueue queue>
	//*   5    9:iload_1         
	//*   6   10:invokevirtual   #1079 <Method boolean MediaPeriodQueue.updateShuffleModeEnabled(boolean)>
	//*   7   13:ifne            21
			seekToCurrentPosition(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokespecial   #719 <Method void seekToCurrentPosition(boolean)>
	//   11   21:return          
	}

	private void setState(int i)
	{
		if(playbackInfo.playbackState != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*   2    4:getfield        #415 <Field int PlaybackInfo.playbackState>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          23
			playbackInfo = playbackInfo.copyWithPlaybackState(i);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #198 <Field PlaybackInfo playbackInfo>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #1082 <Method PlaybackInfo PlaybackInfo.copyWithPlaybackState(int)>
	//   10   20:putfield        #198 <Field PlaybackInfo playbackInfo>
	//   11   23:return          
	}

	private boolean shouldKeepPeriodHolder(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l, MediaPeriodHolder mediaperiodholder)
	{
		if(mediaperiodid.equals(((Object) (mediaperiodholder.info.id))) && mediaperiodholder.prepared)
	//*   0    0:aload_1         
	//*   1    1:aload           4
	//*   2    3:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//*   3    6:getfield        #725 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//*   4    9:invokevirtual   #712 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.equals(Object)>
	//*   5   12:ifeq            88
	//*   6   15:aload           4
	//*   7   17:getfield        #722 <Field boolean MediaPeriodHolder.prepared>
	//*   8   20:ifeq            88
		{
			playbackInfo.timeline.getPeriod(mediaperiodholder.info.id.periodIndex, period);
	//    9   23:aload_0         
	//   10   24:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   11   27:getfield        #493 <Field Timeline PlaybackInfo.timeline>
	//   12   30:aload           4
	//   13   32:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   14   35:getfield        #725 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   15   38:getfield        #660 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   16   41:aload_0         
	//   17   42:getfield        #241 <Field Timeline$Period period>
	//   18   45:invokevirtual   #685 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   19   48:pop             
			int i = period.getAdGroupIndexAfterPositionUs(l);
	//   20   49:aload_0         
	//   21   50:getfield        #241 <Field Timeline$Period period>
	//   22   53:lload_2         
	//   23   54:invokevirtual   #1086 <Method int Timeline$Period.getAdGroupIndexAfterPositionUs(long)>
	//   24   57:istore          5
			if(i == -1 || period.getAdGroupTimeUs(i) == mediaperiodholder.info.endPositionUs)
	//*  25   59:iload           5
	//*  26   61:iconst_m1       
	//*  27   62:icmpeq          86
	//*  28   65:aload_0         
	//*  29   66:getfield        #241 <Field Timeline$Period period>
	//*  30   69:iload           5
	//*  31   71:invokevirtual   #1090 <Method long Timeline$Period.getAdGroupTimeUs(int)>
	//*  32   74:aload           4
	//*  33   76:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//*  34   79:getfield        #1093 <Field long MediaPeriodInfo.endPositionUs>
	//*  35   82:lcmp            
	//*  36   83:ifne            88
				return true;
	//   37   86:iconst_1        
	//   38   87:ireturn         
		}
		return false;
	//   39   88:iconst_0        
	//   40   89:ireturn         
	}

	private boolean shouldTransitionToReadyState(boolean flag)
	{
label0:
		{
			if(enabledRenderers.length == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field Renderer[] enabledRenderers>
	//*   2    4:arraylength     
	//*   3    5:ifne            13
				return isTimelineReady();
	//    4    8:aload_0         
	//    5    9:invokespecial   #425 <Method boolean isTimelineReady()>
	//    6   12:ireturn         
			boolean flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			if(!flag)
	//*   9   15:iload_1         
	//*  10   16:ifne            21
				return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
			if(!playbackInfo.isLoading)
	//*  13   21:aload_0         
	//*  14   22:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  15   25:getfield        #1058 <Field boolean PlaybackInfo.isLoading>
	//*  16   28:ifne            33
				return true;
	//   17   31:iconst_1        
	//   18   32:ireturn         
			MediaPeriodHolder mediaperiodholder = queue.getLoadingPeriod();
	//   19   33:aload_0         
	//   20   34:getfield        #158 <Field MediaPeriodQueue queue>
	//   21   37:invokevirtual   #544 <Method MediaPeriodHolder MediaPeriodQueue.getLoadingPeriod()>
	//   22   40:astore          5
			long l = mediaperiodholder.getBufferedPositionUs(mediaperiodholder.info.isFinal ^ true);
	//   23   42:aload           5
	//   24   44:aload           5
	//   25   46:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   26   49:getfield        #406 <Field boolean MediaPeriodInfo.isFinal>
	//   27   52:iconst_1        
	//   28   53:ixor            
	//   29   54:invokevirtual   #1097 <Method long MediaPeriodHolder.getBufferedPositionUs(boolean)>
	//   30   57:lstore_3        
			if(l != 0x0L)
	//*  31   58:lload_3         
	//*  32   59:ldc2w           #729 <Long 0x0L>
	//*  33   62:lcmp            
	//*  34   63:ifeq            105
			{
				flag = flag1;
	//   35   66:iload_2         
	//   36   67:istore_1        
				if(!loadControl.shouldStartPlayback(l - mediaperiodholder.toPeriodTime(rendererPositionUs), mediaClock.getPlaybackParameters().speed, rebuffering))
					break label0;
	//   37   68:aload_0         
	//   38   69:getfield        #141 <Field LoadControl loadControl>
	//   39   72:lload_3         
	//   40   73:aload           5
	//   41   75:aload_0         
	//   42   76:getfield        #376 <Field long rendererPositionUs>
	//   43   79:invokevirtual   #737 <Method long MediaPeriodHolder.toPeriodTime(long)>
	//   44   82:lsub            
	//   45   83:aload_0         
	//   46   84:getfield        #224 <Field DefaultMediaClock mediaClock>
	//   47   87:invokevirtual   #548 <Method PlaybackParameters DefaultMediaClock.getPlaybackParameters()>
	//   48   90:getfield        #554 <Field float PlaybackParameters.speed>
	//   49   93:aload_0         
	//   50   94:getfield        #427 <Field boolean rebuffering>
	//   51   97:invokeinterface #1101 <Method boolean LoadControl.shouldStartPlayback(long, float, boolean)>
	//   52  102:ifeq            107
			}
			flag = true;
	//   53  105:iconst_1        
	//   54  106:istore_1        
		}
		return flag;
	//   55  107:iload_1         
	//   56  108:ireturn         
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
	//    4    4:putfield        #427 <Field boolean rebuffering>
		mediaClock.start();
	//    5    7:aload_0         
	//    6    8:getfield        #224 <Field DefaultMediaClock mediaClock>
	//    7   11:invokevirtual   #1102 <Method void DefaultMediaClock.start()>
		Renderer arenderer[] = enabledRenderers;
	//    8   14:aload_0         
	//    9   15:getfield        #231 <Field Renderer[] enabledRenderers>
	//   10   18:astore_3        
		for(int j = arenderer.length; i < j; i++)
	//*  11   19:aload_3         
	//*  12   20:arraylength     
	//*  13   21:istore_2        
	//*  14   22:iload_1         
	//*  15   23:iload_2         
	//*  16   24:icmpge          42
			arenderer[i].start();
	//   17   27:aload_3         
	//   18   28:iload_1         
	//   19   29:aaload          
	//   20   30:invokeinterface #478 <Method void Renderer.start()>

	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
	//*  25   39:goto            22
	//   26   42:return          
	}

	private void stopInternal(boolean flag, boolean flag1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #907 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1106 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1110 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void stopRenderers()
		throws ExoPlaybackException
	{
		mediaClock.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DefaultMediaClock mediaClock>
	//    2    4:invokevirtual   #908 <Method void DefaultMediaClock.stop()>
		Renderer arenderer[] = enabledRenderers;
	//    3    7:aload_0         
	//    4    8:getfield        #231 <Field Renderer[] enabledRenderers>
	//    5   11:astore_3        
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		for(int j = arenderer.length; i < j; i++)
	//*   8   14:aload_3         
	//*   9   15:arraylength     
	//*  10   16:istore_2        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          36
			ensureStopped(arenderer[i]);
	//   14   22:aload_0         
	//   15   23:aload_3         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:invokespecial   #316 <Method void ensureStopped(Renderer)>

	//   19   29:iload_1         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_1        
	//*  23   33:goto            17
	//   24   36:return          
	}

	private void updateLoadControlTrackSelection(TrackGroupArray trackgrouparray, TrackSelectorResult trackselectorresult)
	{
		loadControl.onTracksSelected(renderers, trackgrouparray, trackselectorresult.selections);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field LoadControl loadControl>
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field Renderer[] renderers>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:getfield        #453 <Field TrackSelectionArray TrackSelectorResult.selections>
	//    7   13:invokeinterface #1114 <Method void LoadControl.onTracksSelected(Renderer[], TrackGroupArray, TrackSelectionArray)>
	//    8   18:return          
	}

	private void updatePeriods()
		throws ExoPlaybackException, IOException
	{
		if(mediaSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #590 <Field MediaSource mediaSource>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(pendingPrepareCount > 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #608 <Field int pendingPrepareCount>
	//*   6   12:ifle            25
		{
			mediaSource.maybeThrowSourceInfoRefreshError();
	//    7   15:aload_0         
	//    8   16:getfield        #590 <Field MediaSource mediaSource>
	//    9   19:invokeinterface #829 <Method void MediaSource.maybeThrowSourceInfoRefreshError()>
			return;
	//   10   24:return          
		}
		maybeUpdateLoadingPeriod();
	//   11   25:aload_0         
	//   12   26:invokespecial   #1116 <Method void maybeUpdateLoadingPeriod()>
		MediaPeriodHolder mediaperiodholder = queue.getLoadingPeriod();
	//   13   29:aload_0         
	//   14   30:getfield        #158 <Field MediaPeriodQueue queue>
	//   15   33:invokevirtual   #544 <Method MediaPeriodHolder MediaPeriodQueue.getLoadingPeriod()>
	//   16   36:astore          5
		boolean flag1 = false;
	//   17   38:iconst_0        
	//   18   39:istore_2        
		if(mediaperiodholder != null && !mediaperiodholder.isFullyBuffered())
	//*  19   40:aload           5
	//*  20   42:ifnull          73
	//*  21   45:aload           5
	//*  22   47:invokevirtual   #1119 <Method boolean MediaPeriodHolder.isFullyBuffered()>
	//*  23   50:ifeq            56
	//*  24   53:goto            73
		{
			if(!playbackInfo.isLoading)
	//*  25   56:aload_0         
	//*  26   57:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  27   60:getfield        #1058 <Field boolean PlaybackInfo.isLoading>
	//*  28   63:ifne            78
				maybeContinueLoading();
	//   29   66:aload_0         
	//   30   67:invokespecial   #540 <Method void maybeContinueLoading()>
		} else
	//*  31   70:goto            78
		{
			setIsLoading(false);
	//   32   73:aload_0         
	//   33   74:iconst_0        
	//   34   75:invokespecial   #733 <Method void setIsLoading(boolean)>
		}
		if(!queue.hasPlayingPeriod())
	//*  35   78:aload_0         
	//*  36   79:getfield        #158 <Field MediaPeriodQueue queue>
	//*  37   82:invokevirtual   #331 <Method boolean MediaPeriodQueue.hasPlayingPeriod()>
	//*  38   85:ifne            89
			return;
	//   39   88:return          
		mediaperiodholder = queue.getPlayingPeriod();
	//   40   89:aload_0         
	//   41   90:getfield        #158 <Field MediaPeriodQueue queue>
	//   42   93:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//   43   96:astore          5
		Object obj = ((Object) (queue.getReadingPeriod()));
	//   44   98:aload_0         
	//   45   99:getfield        #158 <Field MediaPeriodQueue queue>
	//   46  102:invokevirtual   #778 <Method MediaPeriodHolder MediaPeriodQueue.getReadingPeriod()>
	//   47  105:astore          7
		byte byte0 = 0;
	//   48  107:iconst_0        
	//   49  108:istore_1        
		MediaPeriodHolder mediaperiodholder1;
		for(; playWhenReady && mediaperiodholder != obj && rendererPositionUs >= mediaperiodholder.next.rendererPositionOffsetUs; mediaperiodholder = mediaperiodholder1)
	//*  50  109:aload_0         
	//*  51  110:getfield        #143 <Field boolean playWhenReady>
	//*  52  113:ifeq            236
	//*  53  116:aload           5
	//*  54  118:aload           7
	//*  55  120:if_acmpeq       236
	//*  56  123:aload_0         
	//*  57  124:getfield        #376 <Field long rendererPositionUs>
	//*  58  127:aload           5
	//*  59  129:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//*  60  132:getfield        #1122 <Field long MediaPeriodHolder.rendererPositionOffsetUs>
	//*  61  135:lcmp            
	//*  62  136:iflt            236
		{
			if(byte0 != 0)
	//*  63  139:iload_1         
	//*  64  140:ifeq            147
				maybeNotifyPlaybackInfoChanged();
	//   65  143:aload_0         
	//   66  144:invokespecial   #1124 <Method void maybeNotifyPlaybackInfoChanged()>
			if(mediaperiodholder.info.isLastInTimelinePeriod)
	//*  67  147:aload           5
	//*  68  149:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//*  69  152:getfield        #1127 <Field boolean MediaPeriodInfo.isLastInTimelinePeriod>
	//*  70  155:ifeq            163
				byte0 = 0;
	//   71  158:iconst_0        
	//   72  159:istore_1        
			else
	//*  73  160:goto            165
				byte0 = 3;
	//   74  163:iconst_3        
	//   75  164:istore_1        
			mediaperiodholder1 = queue.advancePlayingPeriod();
	//   76  165:aload_0         
	//   77  166:getfield        #158 <Field MediaPeriodQueue queue>
	//   78  169:invokevirtual   #568 <Method MediaPeriodHolder MediaPeriodQueue.advancePlayingPeriod()>
	//   79  172:astore          6
			updatePlayingPeriodRenderers(mediaperiodholder);
	//   80  174:aload_0         
	//   81  175:aload           5
	//   82  177:invokespecial   #578 <Method void updatePlayingPeriodRenderers(MediaPeriodHolder)>
			playbackInfo = playbackInfo.fromNewPosition(mediaperiodholder1.info.id, mediaperiodholder1.info.startPositionUs, mediaperiodholder1.info.contentPositionUs);
	//   83  180:aload_0         
	//   84  181:aload_0         
	//   85  182:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   86  185:aload           6
	//   87  187:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   88  190:getfield        #725 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId MediaPeriodInfo.id>
	//   89  193:aload           6
	//   90  195:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   91  198:getfield        #571 <Field long MediaPeriodInfo.startPositionUs>
	//   92  201:aload           6
	//   93  203:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   94  206:getfield        #1128 <Field long MediaPeriodInfo.contentPositionUs>
	//   95  209:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//   96  212:putfield        #198 <Field PlaybackInfo playbackInfo>
			playbackInfoUpdate.setPositionDiscontinuity(((int) (byte0)));
	//   97  215:aload_0         
	//   98  216:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   99  219:iload_1         
	//  100  220:invokevirtual   #881 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.setPositionDiscontinuity(int)>
			updatePlaybackPositions();
	//  101  223:aload_0         
	//  102  224:invokespecial   #354 <Method void updatePlaybackPositions()>
			byte0 = 1;
	//  103  227:iconst_1        
	//  104  228:istore_1        
		}

	//  105  229:aload           6
	//  106  231:astore          5
	//* 107  233:goto            109
		if(((MediaPeriodHolder) (obj)).info.isFinal)
	//* 108  236:aload           7
	//* 109  238:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//* 110  241:getfield        #406 <Field boolean MediaPeriodInfo.isFinal>
	//* 111  244:ifeq            317
		{
			for(int i = ((int) (flag1)); i < renderers.length; i++)
	//* 112  247:iload_2         
	//* 113  248:istore_1        
	//* 114  249:iload_1         
	//* 115  250:aload_0         
	//* 116  251:getfield        #135 <Field Renderer[] renderers>
	//* 117  254:arraylength     
	//* 118  255:icmpge          316
			{
				Renderer renderer = renderers[i];
	//  119  258:aload_0         
	//  120  259:getfield        #135 <Field Renderer[] renderers>
	//  121  262:iload_1         
	//  122  263:aaload          
	//  123  264:astore          5
				com.google.android.exoplayer2.source.SampleStream samplestream = ((MediaPeriodHolder) (obj)).sampleStreams[i];
	//  124  266:aload           7
	//  125  268:getfield        #467 <Field com.google.android.exoplayer2.source.SampleStream[] MediaPeriodHolder.sampleStreams>
	//  126  271:iload_1         
	//  127  272:aaload          
	//  128  273:astore          6
				if(samplestream != null && renderer.getStream() == samplestream && renderer.hasReadStreamToEnd())
	//* 129  275:aload           6
	//* 130  277:ifnull          309
	//* 131  280:aload           5
	//* 132  282:invokeinterface #885 <Method com.google.android.exoplayer2.source.SampleStream Renderer.getStream()>
	//* 133  287:aload           6
	//* 134  289:if_acmpne       309
	//* 135  292:aload           5
	//* 136  294:invokeinterface #781 <Method boolean Renderer.hasReadStreamToEnd()>
	//* 137  299:ifeq            309
					renderer.setCurrentStreamFinal();
	//  138  302:aload           5
	//  139  304:invokeinterface #1131 <Method void Renderer.setCurrentStreamFinal()>
			}

	//  140  309:iload_1         
	//  141  310:iconst_1        
	//  142  311:iadd            
	//  143  312:istore_1        
	//* 144  313:goto            249
			return;
	//  145  316:return          
		}
		if(((MediaPeriodHolder) (obj)).next != null)
	//* 146  317:aload           7
	//* 147  319:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//* 148  322:ifnull          623
		{
			if(!((MediaPeriodHolder) (obj)).next.prepared)
	//* 149  325:aload           7
	//* 150  327:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//* 151  330:getfield        #722 <Field boolean MediaPeriodHolder.prepared>
	//* 152  333:ifne            337
				return;
	//  153  336:return          
			for(int j = 0; j < renderers.length;)
	//* 154  337:iconst_0        
	//* 155  338:istore_1        
	//* 156  339:iload_1         
	//* 157  340:aload_0         
	//* 158  341:getfield        #135 <Field Renderer[] renderers>
	//* 159  344:arraylength     
	//* 160  345:icmpge          401
			{
				Renderer renderer1 = renderers[j];
	//  161  348:aload_0         
	//  162  349:getfield        #135 <Field Renderer[] renderers>
	//  163  352:iload_1         
	//  164  353:aaload          
	//  165  354:astore          5
				com.google.android.exoplayer2.source.SampleStream samplestream1 = ((MediaPeriodHolder) (obj)).sampleStreams[j];
	//  166  356:aload           7
	//  167  358:getfield        #467 <Field com.google.android.exoplayer2.source.SampleStream[] MediaPeriodHolder.sampleStreams>
	//  168  361:iload_1         
	//  169  362:aaload          
	//  170  363:astore          6
				if(renderer1.getStream() == samplestream1)
	//* 171  365:aload           5
	//* 172  367:invokeinterface #885 <Method com.google.android.exoplayer2.source.SampleStream Renderer.getStream()>
	//* 173  372:aload           6
	//* 174  374:if_acmpne       400
				{
					if(samplestream1 != null && !renderer1.hasReadStreamToEnd())
	//* 175  377:aload           6
	//* 176  379:ifnull          393
	//* 177  382:aload           5
	//* 178  384:invokeinterface #781 <Method boolean Renderer.hasReadStreamToEnd()>
	//* 179  389:ifne            393
						return;
	//  180  392:return          
					j++;
	//  181  393:iload_1         
	//  182  394:iconst_1        
	//  183  395:iadd            
	//  184  396:istore_1        
				} else
	//* 185  397:goto            339
				{
					return;
	//  186  400:return          
				}
			}

			TrackSelectorResult trackselectorresult = ((MediaPeriodHolder) (obj)).trackSelectorResult;
	//  187  401:aload           7
	//  188  403:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//  189  406:astore          5
			MediaPeriodHolder mediaperiodholder2 = queue.advanceReadingPeriod();
	//  190  408:aload_0         
	//  191  409:getfield        #158 <Field MediaPeriodQueue queue>
	//  192  412:invokevirtual   #1134 <Method MediaPeriodHolder MediaPeriodQueue.advanceReadingPeriod()>
	//  193  415:astore          6
			obj = ((Object) (mediaperiodholder2.trackSelectorResult));
	//  194  417:aload           6
	//  195  419:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//  196  422:astore          7
			boolean flag;
			if(mediaperiodholder2.mediaPeriod.readDiscontinuity() != 0x1L)
	//* 197  424:aload           6
	//* 198  426:getfield        #365 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//* 199  429:invokeinterface #1137 <Method long MediaPeriod.readDiscontinuity()>
	//* 200  434:ldc2w           #187 <Long 0x1L>
	//* 201  437:lcmp            
	//* 202  438:ifeq            446
				flag = true;
	//  203  441:iconst_1        
	//  204  442:istore_1        
			else
	//* 205  443:goto            448
				flag = false;
	//  206  446:iconst_0        
	//  207  447:istore_1        
			for(int k = 0; k < renderers.length; k++)
	//* 208  448:iconst_0        
	//* 209  449:istore_2        
	//* 210  450:iload_2         
	//* 211  451:aload_0         
	//* 212  452:getfield        #135 <Field Renderer[] renderers>
	//* 213  455:arraylength     
	//* 214  456:icmpge          622
			{
				Renderer renderer2 = renderers[k];
	//  215  459:aload_0         
	//  216  460:getfield        #135 <Field Renderer[] renderers>
	//  217  463:iload_2         
	//  218  464:aaload          
	//  219  465:astore          8
				if(!trackselectorresult.isRendererEnabled(k))
	//* 220  467:aload           5
	//* 221  469:iload_2         
	//* 222  470:invokevirtual   #484 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//* 223  473:ifne            479
					continue;
	//  224  476:goto            615
				if(flag)
	//* 225  479:iload_1         
	//* 226  480:ifeq            493
				{
					renderer2.setCurrentStreamFinal();
	//  227  483:aload           8
	//  228  485:invokeinterface #1131 <Method void Renderer.setCurrentStreamFinal()>
					continue;
	//  229  490:goto            615
				}
				if(renderer2.isCurrentStreamFinal())
					continue;
	//  230  493:aload           8
	//  231  495:invokeinterface #1140 <Method boolean Renderer.isCurrentStreamFinal()>
	//  232  500:ifne            615
				TrackSelection trackselection = ((TrackSelectorResult) (obj)).selections.get(k);
	//  233  503:aload           7
	//  234  505:getfield        #453 <Field TrackSelectionArray TrackSelectorResult.selections>
	//  235  508:iload_2         
	//  236  509:invokevirtual   #459 <Method TrackSelection TrackSelectionArray.get(int)>
	//  237  512:astore          9
				boolean flag3 = ((TrackSelectorResult) (obj)).isRendererEnabled(k);
	//  238  514:aload           7
	//  239  516:iload_2         
	//  240  517:invokevirtual   #484 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//  241  520:istore          4
				boolean flag2;
				if(rendererCapabilities[k].getTrackType() == 5)
	//* 242  522:aload_0         
	//* 243  523:getfield        #207 <Field RendererCapabilities[] rendererCapabilities>
	//* 244  526:iload_2         
	//* 245  527:aaload          
	//* 246  528:invokeinterface #1143 <Method int RendererCapabilities.getTrackType()>
	//* 247  533:iconst_5        
	//* 248  534:icmpne          542
					flag2 = true;
	//  249  537:iconst_1        
	//  250  538:istore_3        
				else
	//* 251  539:goto            544
					flag2 = false;
	//  252  542:iconst_0        
	//  253  543:istore_3        
				RendererConfiguration rendererconfiguration = trackselectorresult.rendererConfigurations[k];
	//  254  544:aload           5
	//  255  546:getfield        #449 <Field RendererConfiguration[] TrackSelectorResult.rendererConfigurations>
	//  256  549:iload_2         
	//  257  550:aaload          
	//  258  551:astore          10
				RendererConfiguration rendererconfiguration1 = ((TrackSelectorResult) (obj)).rendererConfigurations[k];
	//  259  553:aload           7
	//  260  555:getfield        #449 <Field RendererConfiguration[] TrackSelectorResult.rendererConfigurations>
	//  261  558:iload_2         
	//  262  559:aaload          
	//  263  560:astore          11
				if(flag3 && rendererconfiguration1.equals(((Object) (rendererconfiguration))) && !flag2)
	//* 264  562:iload           4
	//* 265  564:ifeq            608
	//* 266  567:aload           11
	//* 267  569:aload           10
	//* 268  571:invokevirtual   #1146 <Method boolean RendererConfiguration.equals(Object)>
	//* 269  574:ifeq            608
	//* 270  577:iload_3         
	//* 271  578:ifne            608
					renderer2.replaceStream(getFormats(trackselection), mediaperiodholder2.sampleStreams[k], mediaperiodholder2.getRendererOffset());
	//  272  581:aload           8
	//  273  583:aload           9
	//  274  585:invokestatic    #463 <Method Format[] getFormats(TrackSelection)>
	//  275  588:aload           6
	//  276  590:getfield        #467 <Field com.google.android.exoplayer2.source.SampleStream[] MediaPeriodHolder.sampleStreams>
	//  277  593:iload_2         
	//  278  594:aaload          
	//  279  595:aload           6
	//  280  597:invokevirtual   #470 <Method long MediaPeriodHolder.getRendererOffset()>
	//  281  600:invokeinterface #1150 <Method void Renderer.replaceStream(Format[], com.google.android.exoplayer2.source.SampleStream, long)>
				else
	//* 282  605:goto            615
					renderer2.setCurrentStreamFinal();
	//  283  608:aload           8
	//  284  610:invokeinterface #1131 <Method void Renderer.setCurrentStreamFinal()>
			}

	//  285  615:iload_2         
	//  286  616:iconst_1        
	//  287  617:iadd            
	//  288  618:istore_2        
	//* 289  619:goto            450
			return;
	//  290  622:return          
		} else
		{
			return;
	//  291  623:return          
		}
	}

	private void updatePlaybackPositions()
		throws ExoPlaybackException
	{
		if(!queue.hasPlayingPeriod())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//*   2    4:invokevirtual   #331 <Method boolean MediaPeriodQueue.hasPlayingPeriod()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		MediaPeriodHolder mediaperiodholder = queue.getPlayingPeriod();
	//    5   11:aload_0         
	//    6   12:getfield        #158 <Field MediaPeriodQueue queue>
	//    7   15:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//    8   18:astore_3        
		long l = mediaperiodholder.mediaPeriod.readDiscontinuity();
	//    9   19:aload_3         
	//   10   20:getfield        #365 <Field MediaPeriod MediaPeriodHolder.mediaPeriod>
	//   11   23:invokeinterface #1137 <Method long MediaPeriod.readDiscontinuity()>
	//   12   28:lstore_1        
		if(l != 0x1L)
	//*  13   29:lload_1         
	//*  14   30:ldc2w           #187 <Long 0x1L>
	//*  15   33:lcmp            
	//*  16   34:ifeq            91
		{
			resetRendererPosition(l);
	//   17   37:aload_0         
	//   18   38:lload_1         
	//   19   39:invokespecial   #574 <Method void resetRendererPosition(long)>
			if(l != playbackInfo.positionUs)
	//*  20   42:lload_1         
	//*  21   43:aload_0         
	//*  22   44:getfield        #198 <Field PlaybackInfo playbackInfo>
	//*  23   47:getfield        #368 <Field long PlaybackInfo.positionUs>
	//*  24   50:lcmp            
	//*  25   51:ifeq            131
			{
				playbackInfo = playbackInfo.fromNewPosition(playbackInfo.periodId, l, playbackInfo.contentPositionUs);
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   29   59:aload_0         
	//   30   60:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   31   63:getfield        #657 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   32   66:lload_1         
	//   33   67:aload_0         
	//   34   68:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   35   71:getfield        #663 <Field long PlaybackInfo.contentPositionUs>
	//   36   74:invokevirtual   #650 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//   37   77:putfield        #198 <Field PlaybackInfo playbackInfo>
				playbackInfoUpdate.setPositionDiscontinuity(4);
	//   38   80:aload_0         
	//   39   81:getfield        #203 <Field ExoPlayerImplInternal$PlaybackInfoUpdate playbackInfoUpdate>
	//   40   84:iconst_4        
	//   41   85:invokevirtual   #881 <Method void ExoPlayerImplInternal$PlaybackInfoUpdate.setPositionDiscontinuity(int)>
			}
		} else
	//*  42   88:goto            131
		{
			rendererPositionUs = mediaClock.syncAndGetPositionUs();
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:getfield        #224 <Field DefaultMediaClock mediaClock>
	//   46   96:invokevirtual   #1153 <Method long DefaultMediaClock.syncAndGetPositionUs()>
	//   47   99:putfield        #376 <Field long rendererPositionUs>
			l = mediaperiodholder.toPeriodTime(rendererPositionUs);
	//   48  102:aload_3         
	//   49  103:aload_0         
	//   50  104:getfield        #376 <Field long rendererPositionUs>
	//   51  107:invokevirtual   #737 <Method long MediaPeriodHolder.toPeriodTime(long)>
	//   52  110:lstore_1        
			maybeTriggerPendingMessages(playbackInfo.positionUs, l);
	//   53  111:aload_0         
	//   54  112:aload_0         
	//   55  113:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   56  116:getfield        #368 <Field long PlaybackInfo.positionUs>
	//   57  119:lload_1         
	//   58  120:invokespecial   #1155 <Method void maybeTriggerPendingMessages(long, long)>
			playbackInfo.positionUs = l;
	//   59  123:aload_0         
	//   60  124:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   61  127:lload_1         
	//   62  128:putfield        #368 <Field long PlaybackInfo.positionUs>
		}
		PlaybackInfo playbackinfo = playbackInfo;
	//   63  131:aload_0         
	//   64  132:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   65  135:astore          4
		if(enabledRenderers.length == 0)
	//*  66  137:aload_0         
	//*  67  138:getfield        #231 <Field Renderer[] enabledRenderers>
	//*  68  141:arraylength     
	//*  69  142:ifne            156
			l = mediaperiodholder.info.durationUs;
	//   70  145:aload_3         
	//   71  146:getfield        #398 <Field MediaPeriodInfo MediaPeriodHolder.info>
	//   72  149:getfield        #403 <Field long MediaPeriodInfo.durationUs>
	//   73  152:lstore_1        
		else
	//*  74  153:goto            162
			l = mediaperiodholder.getBufferedPositionUs(true);
	//   75  156:aload_3         
	//   76  157:iconst_1        
	//   77  158:invokevirtual   #1097 <Method long MediaPeriodHolder.getBufferedPositionUs(boolean)>
	//   78  161:lstore_1        
		playbackinfo.bufferedPositionUs = l;
	//   79  162:aload           4
	//   80  164:lload_1         
	//   81  165:putfield        #1158 <Field long PlaybackInfo.bufferedPositionUs>
	//   82  168:return          
	}

	private void updatePlayingPeriodRenderers(MediaPeriodHolder mediaperiodholder)
		throws ExoPlaybackException
	{
		MediaPeriodHolder mediaperiodholder1 = queue.getPlayingPeriod();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//    2    4:invokevirtual   #344 <Method MediaPeriodHolder MediaPeriodQueue.getPlayingPeriod()>
	//    3    7:astore          6
		if(mediaperiodholder1 != null)
	//*   4    9:aload           6
	//*   5   11:ifnull          186
		{
			if(mediaperiodholder == mediaperiodholder1)
	//*   6   14:aload_1         
	//*   7   15:aload           6
	//*   8   17:if_acmpne       21
				return;
	//    9   20:return          
			boolean aflag[] = new boolean[renderers.length];
	//   10   21:aload_0         
	//   11   22:getfield        #135 <Field Renderer[] renderers>
	//   12   25:arraylength     
	//   13   26:newarray        boolean[]
	//   14   28:astore          7
			int i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_2        
			int j;
			int k;
			for(j = i; i < renderers.length; j = k)
	//*  17   32:iload_2         
	//*  18   33:istore_3        
	//*  19   34:iload_2         
	//*  20   35:aload_0         
	//*  21   36:getfield        #135 <Field Renderer[] renderers>
	//*  22   39:arraylength     
	//*  23   40:icmpge          157
			{
				Renderer renderer = renderers[i];
	//   24   43:aload_0         
	//   25   44:getfield        #135 <Field Renderer[] renderers>
	//   26   47:iload_2         
	//   27   48:aaload          
	//   28   49:astore          8
				boolean flag;
				if(renderer.getState() != 0)
	//*  29   51:aload           8
	//*  30   53:invokeinterface #440 <Method int Renderer.getState()>
	//*  31   58:ifeq            67
					flag = true;
	//   32   61:iconst_1        
	//   33   62:istore          5
				else
	//*  34   64:goto            70
					flag = false;
	//   35   67:iconst_0        
	//   36   68:istore          5
				aflag[i] = flag;
	//   37   70:aload           7
	//   38   72:iload_2         
	//   39   73:iload           5
	//   40   75:bastore         
				k = j;
	//   41   76:iload_3         
	//   42   77:istore          4
				if(mediaperiodholder1.trackSelectorResult.isRendererEnabled(i))
	//*  43   79:aload           6
	//*  44   81:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//*  45   84:iload_2         
	//*  46   85:invokevirtual   #484 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//*  47   88:ifeq            96
					k = j + 1;
	//   48   91:iload_3         
	//   49   92:iconst_1        
	//   50   93:iadd            
	//   51   94:istore          4
				if(aflag[i] && (!mediaperiodholder1.trackSelectorResult.isRendererEnabled(i) || renderer.isCurrentStreamFinal() && renderer.getStream() == mediaperiodholder.sampleStreams[i]))
	//*  52   96:aload           7
	//*  53   98:iload_2         
	//*  54   99:baload          
	//*  55  100:ifeq            147
	//*  56  103:aload           6
	//*  57  105:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//*  58  108:iload_2         
	//*  59  109:invokevirtual   #484 <Method boolean TrackSelectorResult.isRendererEnabled(int)>
	//*  60  112:ifeq            141
	//*  61  115:aload           8
	//*  62  117:invokeinterface #1140 <Method boolean Renderer.isCurrentStreamFinal()>
	//*  63  122:ifeq            147
	//*  64  125:aload           8
	//*  65  127:invokeinterface #885 <Method com.google.android.exoplayer2.source.SampleStream Renderer.getStream()>
	//*  66  132:aload_1         
	//*  67  133:getfield        #467 <Field com.google.android.exoplayer2.source.SampleStream[] MediaPeriodHolder.sampleStreams>
	//*  68  136:iload_2         
	//*  69  137:aaload          
	//*  70  138:if_acmpne       147
					disableRenderer(renderer);
	//   71  141:aload_0         
	//   72  142:aload           8
	//   73  144:invokespecial   #887 <Method void disableRenderer(Renderer)>
				i++;
	//   74  147:iload_2         
	//   75  148:iconst_1        
	//   76  149:iadd            
	//   77  150:istore_2        
			}

	//   78  151:iload           4
	//   79  153:istore_3        
	//*  80  154:goto            34
			playbackInfo = playbackInfo.copyWithTrackInfo(mediaperiodholder1.trackGroups, mediaperiodholder1.trackSelectorResult);
	//   81  157:aload_0         
	//   82  158:aload_0         
	//   83  159:getfield        #198 <Field PlaybackInfo playbackInfo>
	//   84  162:aload           6
	//   85  164:getfield        #561 <Field TrackGroupArray MediaPeriodHolder.trackGroups>
	//   86  167:aload           6
	//   87  169:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//   88  172:invokevirtual   #894 <Method PlaybackInfo PlaybackInfo.copyWithTrackInfo(TrackGroupArray, TrackSelectorResult)>
	//   89  175:putfield        #198 <Field PlaybackInfo playbackInfo>
			enableRenderers(aflag, j);
	//   90  178:aload_0         
	//   91  179:aload           7
	//   92  181:iload_3         
	//   93  182:invokespecial   #896 <Method void enableRenderers(boolean[], int)>
			return;
	//   94  185:return          
		} else
		{
			return;
	//   95  186:return          
		}
	}

	private void updateTrackSelectionPlaybackSpeed(float f)
	{
		for(MediaPeriodHolder mediaperiodholder = queue.getFrontPeriod(); mediaperiodholder != null; mediaperiodholder = mediaperiodholder.next)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field MediaPeriodQueue queue>
	//*   2    4:invokevirtual   #666 <Method MediaPeriodHolder MediaPeriodQueue.getFrontPeriod()>
	//*   3    7:astore          4
	//*   4    9:aload           4
	//*   5   11:ifnull          82
		{
			if(mediaperiodholder.trackSelectorResult == null)
				continue;
	//    6   14:aload           4
	//    7   16:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//    8   19:ifnull          72
			TrackSelection atrackselection[] = mediaperiodholder.trackSelectorResult.selections.getAll();
	//    9   22:aload           4
	//   10   24:getfield        #443 <Field TrackSelectorResult MediaPeriodHolder.trackSelectorResult>
	//   11   27:getfield        #453 <Field TrackSelectionArray TrackSelectorResult.selections>
	//   12   30:invokevirtual   #1165 <Method TrackSelection[] TrackSelectionArray.getAll()>
	//   13   33:astore          5
			int j = atrackselection.length;
	//   14   35:aload           5
	//   15   37:arraylength     
	//   16   38:istore_3        
			for(int i = 0; i < j; i++)
	//*  17   39:iconst_0        
	//*  18   40:istore_2        
	//*  19   41:iload_2         
	//*  20   42:iload_3         
	//*  21   43:icmpge          72
			{
				TrackSelection trackselection = atrackselection[i];
	//   22   46:aload           5
	//   23   48:iload_2         
	//   24   49:aaload          
	//   25   50:astore          6
				if(trackselection != null)
	//*  26   52:aload           6
	//*  27   54:ifnull          65
					trackselection.onPlaybackSpeed(f);
	//   28   57:aload           6
	//   29   59:fload_1         
	//   30   60:invokeinterface #1168 <Method void TrackSelection.onPlaybackSpeed(float)>
			}

	//   31   65:iload_2         
	//   32   66:iconst_1        
	//   33   67:iadd            
	//   34   68:istore_2        
		}

	//   35   69:goto            41
	//   36   72:aload           4
	//   37   74:getfield        #696 <Field MediaPeriodHolder MediaPeriodHolder.next>
	//   38   77:astore          4
	//*  39   79:goto            9
	//   40   82:return          
	}

	public Looper getPlaybackLooper()
	{
		return internalPlaybackThread.getLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field HandlerThread internalPlaybackThread>
	//    2    4:invokevirtual   #263 <Method Looper HandlerThread.getLooper()>
	//    3    7:areturn         
	}

	public boolean handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #1173 <Field int Message.what>
		JVM INSTR tableswitch 0 15: default 446
	//	               0 288
	//	               1 268
	//	               2 261
	//	               3 247
	//	               4 233
	//	               5 219
	//	               6 198
	//	               7 192
	//	               8 178
	//	               9 164
	//	               10 150
	//	               11 143
	//	               12 132
	//	               13 112
	//	               14 98
	//	               15 84;
	//    2    4:tableswitch     0 15: default 446
	//	               0 288
	//	               1 268
	//	               2 261
	//	               3 247
	//	               4 233
	//	               5 219
	//	               6 198
	//	               7 192
	//	               8 178
	//	               9 164
	//	               10 150
	//	               11 143
	//	               12 132
	//	               13 112
	//	               14 98
	//	               15 84
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
		break MISSING_BLOCK_LABEL_446;
_L17:
		sendMessageToTargetThread((PlayerMessage)message.obj);
	//    3   84:aload_0         
	//    4   85:aload_1         
	//    5   86:getfield        #1176 <Field Object Message.obj>
	//    6   89:checkcast       #283 <Class PlayerMessage>
	//    7   92:invokespecial   #1178 <Method void sendMessageToTargetThread(PlayerMessage)>
		break; /* Loop/switch isn't completed */
	//    8   95:goto            329
_L16:
		boolean flag;
		boolean flag1;
		MediaSource mediasource;
		try
		{
			sendMessageInternal((PlayerMessage)message.obj);
	//    9   98:aload_0         
	//   10   99:aload_1         
	//   11  100:getfield        #1176 <Field Object Message.obj>
	//   12  103:checkcast       #283 <Class PlayerMessage>
	//   13  106:invokespecial   #1180 <Method void sendMessageInternal(PlayerMessage)>
			break; /* Loop/switch isn't completed */
	//   14  109:goto            329
		}
	//*  15  112:aload_1         
	//*  16  113:getfield        #1183 <Field int Message.arg1>
	//*  17  116:ifeq            448
	//*  18  119:iconst_1        
	//*  19  120:istore_2        
	//*  20  121:goto            124
	//*  21  124:aload_0         
	//*  22  125:iload_2         
	//*  23  126:invokespecial   #1185 <Method void setShuffleModeEnabledInternal(boolean)>
	//*  24  129:goto            329
	//*  25  132:aload_0         
	//*  26  133:aload_1         
	//*  27  134:getfield        #1183 <Field int Message.arg1>
	//*  28  137:invokespecial   #1187 <Method void setRepeatModeInternal(int)>
	//*  29  140:goto            329
	//*  30  143:aload_0         
	//*  31  144:invokespecial   #1189 <Method void reselectTracksInternal()>
	//*  32  147:goto            329
	//*  33  150:aload_0         
	//*  34  151:aload_1         
	//*  35  152:getfield        #1176 <Field Object Message.obj>
	//*  36  155:checkcast       #370 <Class MediaPeriod>
	//*  37  158:invokespecial   #1191 <Method void handleContinueLoadingRequested(MediaPeriod)>
	//*  38  161:goto            329
	//*  39  164:aload_0         
	//*  40  165:aload_1         
	//*  41  166:getfield        #1176 <Field Object Message.obj>
	//*  42  169:checkcast       #370 <Class MediaPeriod>
	//*  43  172:invokespecial   #1193 <Method void handlePeriodPrepared(MediaPeriod)>
	//*  44  175:goto            329
	//*  45  178:aload_0         
	//*  46  179:aload_1         
	//*  47  180:getfield        #1176 <Field Object Message.obj>
	//*  48  183:checkcast       #20  <Class ExoPlayerImplInternal$MediaSourceRefreshInfo>
	//*  49  186:invokespecial   #1195 <Method void handleSourceInfoRefreshed(ExoPlayerImplInternal$MediaSourceRefreshInfo)>
	//*  50  189:goto            329
	//*  51  192:aload_0         
	//*  52  193:invokespecial   #1197 <Method void releaseInternal()>
	//*  53  196:iconst_1        
	//*  54  197:ireturn         
	//*  55  198:aload_1         
	//*  56  199:getfield        #1183 <Field int Message.arg1>
	//*  57  202:ifeq            453
	//*  58  205:iconst_1        
	//*  59  206:istore_2        
	//*  60  207:goto            210
	//*  61  210:aload_0         
	//*  62  211:iload_2         
	//*  63  212:iconst_1        
	//*  64  213:invokespecial   #1199 <Method void stopInternal(boolean, boolean)>
	//*  65  216:goto            329
	//*  66  219:aload_0         
	//*  67  220:aload_1         
	//*  68  221:getfield        #1176 <Field Object Message.obj>
	//*  69  224:checkcast       #173 <Class SeekParameters>
	//*  70  227:invokespecial   #1201 <Method void setSeekParametersInternal(SeekParameters)>
	//*  71  230:goto            329
	//*  72  233:aload_0         
	//*  73  234:aload_1         
	//*  74  235:getfield        #1176 <Field Object Message.obj>
	//*  75  238:checkcast       #550 <Class PlaybackParameters>
	//*  76  241:invokespecial   #1203 <Method void setPlaybackParametersInternal(PlaybackParameters)>
	//*  77  244:goto            329
	//*  78  247:aload_0         
	//*  79  248:aload_1         
	//*  80  249:getfield        #1176 <Field Object Message.obj>
	//*  81  252:checkcast       #29  <Class ExoPlayerImplInternal$SeekPosition>
	//*  82  255:invokespecial   #1205 <Method void seekToInternal(ExoPlayerImplInternal$SeekPosition)>
	//*  83  258:goto            329
	//*  84  261:aload_0         
	//*  85  262:invokespecial   #1207 <Method void doSomeWork()>
	//*  86  265:goto            329
	//*  87  268:aload_1         
	//*  88  269:getfield        #1183 <Field int Message.arg1>
	//*  89  272:ifeq            458
	//*  90  275:iconst_1        
	//*  91  276:istore_2        
	//*  92  277:goto            280
	//*  93  280:aload_0         
	//*  94  281:iload_2         
	//*  95  282:invokespecial   #1209 <Method void setPlayWhenReadyInternal(boolean)>
	//*  96  285:goto            329
	//*  97  288:aload_1         
	//*  98  289:getfield        #1176 <Field Object Message.obj>
	//*  99  292:checkcast       #826 <Class MediaSource>
	//* 100  295:astore          4
	//* 101  297:aload_1         
	//* 102  298:getfield        #1183 <Field int Message.arg1>
	//* 103  301:ifeq            463
	//* 104  304:iconst_1        
	//* 105  305:istore_2        
	//* 106  306:goto            309
	//* 107  309:aload_1         
	//* 108  310:getfield        #1212 <Field int Message.arg2>
	//* 109  313:ifeq            468
	//* 110  316:iconst_1        
	//* 111  317:istore_3        
	//* 112  318:goto            321
	//* 113  321:aload_0         
	//* 114  322:aload           4
	//* 115  324:iload_2         
	//* 116  325:iload_3         
	//* 117  326:invokespecial   #1214 <Method void prepareInternal(MediaSource, boolean, boolean)>
	//* 118  329:aload_0         
	//* 119  330:invokespecial   #1124 <Method void maybeNotifyPlaybackInfoChanged()>
	//* 120  333:iconst_1        
	//* 121  334:ireturn         
	//* 122  335:astore_1        
	//* 123  336:ldc1            #74  <String "ExoPlayerImplInternal">
	//* 124  338:ldc2            #1216 <String "Internal runtime error.">
	//* 125  341:aload_1         
	//* 126  342:invokestatic    #916 <Method int Log.e(String, String, Throwable)>
	//* 127  345:pop             
	//* 128  346:aload_0         
	//* 129  347:iconst_0        
	//* 130  348:iconst_0        
	//* 131  349:invokespecial   #1199 <Method void stopInternal(boolean, boolean)>
	//* 132  352:aload_0         
	//* 133  353:getfield        #149 <Field Handler eventHandler>
	//* 134  356:iconst_2        
	//* 135  357:aload_1         
	//* 136  358:invokestatic    #1220 <Method ExoPlaybackException ExoPlaybackException.createForUnexpected(RuntimeException)>
	//* 137  361:invokevirtual   #1221 <Method Message Handler.obtainMessage(int, Object)>
	//* 138  364:invokevirtual   #771 <Method void Message.sendToTarget()>
	//* 139  367:aload_0         
	//* 140  368:invokespecial   #1124 <Method void maybeNotifyPlaybackInfoChanged()>
	//* 141  371:iconst_1        
	//* 142  372:ireturn         
	//* 143  373:astore_1        
	//* 144  374:ldc1            #74  <String "ExoPlayerImplInternal">
	//* 145  376:ldc2            #1223 <String "Source error.">
	//* 146  379:aload_1         
	//* 147  380:invokestatic    #916 <Method int Log.e(String, String, Throwable)>
	//* 148  383:pop             
	//* 149  384:aload_0         
	//* 150  385:iconst_0        
	//* 151  386:iconst_0        
	//* 152  387:invokespecial   #1199 <Method void stopInternal(boolean, boolean)>
	//* 153  390:aload_0         
	//* 154  391:getfield        #149 <Field Handler eventHandler>
	//* 155  394:iconst_2        
	//* 156  395:aload_1         
	//* 157  396:invokestatic    #1227 <Method ExoPlaybackException ExoPlaybackException.createForSource(IOException)>
	//* 158  399:invokevirtual   #1221 <Method Message Handler.obtainMessage(int, Object)>
	//* 159  402:invokevirtual   #771 <Method void Message.sendToTarget()>
	//* 160  405:aload_0         
	//* 161  406:invokespecial   #1124 <Method void maybeNotifyPlaybackInfoChanged()>
	//* 162  409:iconst_1        
	//* 163  410:ireturn         
		// Misplaced declaration of an exception variable
		catch(Message message)
	//* 164  411:astore_1        
		{
			Log.e("ExoPlayerImplInternal", "Playback error.", ((Throwable) (message)));
	//  165  412:ldc1            #74  <String "ExoPlayerImplInternal">
	//  166  414:ldc2            #1229 <String "Playback error.">
	//  167  417:aload_1         
	//  168  418:invokestatic    #916 <Method int Log.e(String, String, Throwable)>
	//  169  421:pop             
		}
		// Misplaced declaration of an exception variable
		catch(Message message)
		{
			Log.e("ExoPlayerImplInternal", "Source error.", ((Throwable) (message)));
			stopInternal(false, false);
			eventHandler.obtainMessage(2, ((Object) (ExoPlaybackException.createForSource(((IOException) (message)))))).sendToTarget();
			maybeNotifyPlaybackInfoChanged();
			return true;
		}
		// Misplaced declaration of an exception variable
		catch(Message message)
		{
			Log.e("ExoPlayerImplInternal", "Internal runtime error.", ((Throwable) (message)));
			stopInternal(false, false);
			eventHandler.obtainMessage(2, ((Object) (ExoPlaybackException.createForUnexpected(((RuntimeException) (message)))))).sendToTarget();
			maybeNotifyPlaybackInfoChanged();
			return true;
		}
		break MISSING_BLOCK_LABEL_422;
_L15:
		if(message.arg1 != 0)
			flag = true;
		else
	//* 170  422:aload_0         
	//* 171  423:iconst_0        
	//* 172  424:iconst_0        
	//* 173  425:invokespecial   #1199 <Method void stopInternal(boolean, boolean)>
	//* 174  428:aload_0         
	//* 175  429:getfield        #149 <Field Handler eventHandler>
	//* 176  432:iconst_2        
	//* 177  433:aload_1         
	//* 178  434:invokevirtual   #1221 <Method Message Handler.obtainMessage(int, Object)>
	//* 179  437:invokevirtual   #771 <Method void Message.sendToTarget()>
	//* 180  440:aload_0         
	//* 181  441:invokespecial   #1124 <Method void maybeNotifyPlaybackInfoChanged()>
	//* 182  444:iconst_1        
	//* 183  445:ireturn         
	//* 184  446:iconst_0        
	//* 185  447:ireturn         
			flag = false;
	//  186  448:iconst_0        
	//  187  449:istore_2        
		setShuffleModeEnabledInternal(flag);
		break; /* Loop/switch isn't completed */
_L14:
		setRepeatModeInternal(message.arg1);
		break; /* Loop/switch isn't completed */
_L13:
		reselectTracksInternal();
		break; /* Loop/switch isn't completed */
_L12:
		handleContinueLoadingRequested((MediaPeriod)message.obj);
		break; /* Loop/switch isn't completed */
_L11:
		handlePeriodPrepared((MediaPeriod)message.obj);
		break; /* Loop/switch isn't completed */
_L10:
		handleSourceInfoRefreshed((MediaSourceRefreshInfo)message.obj);
		break; /* Loop/switch isn't completed */
_L9:
		releaseInternal();
		return true;
_L8:
		if(message.arg1 != 0)
			flag = true;
		else
	//* 188  450:goto            124
			flag = false;
	//  189  453:iconst_0        
	//  190  454:istore_2        
		stopInternal(flag, true);
		break; /* Loop/switch isn't completed */
_L7:
		setSeekParametersInternal((SeekParameters)message.obj);
		break; /* Loop/switch isn't completed */
_L6:
		setPlaybackParametersInternal((PlaybackParameters)message.obj);
		break; /* Loop/switch isn't completed */
_L5:
		seekToInternal((SeekPosition)message.obj);
		break; /* Loop/switch isn't completed */
_L4:
		doSomeWork();
		break; /* Loop/switch isn't completed */
_L3:
		if(message.arg1 != 0)
			flag = true;
		else
	//* 191  455:goto            210
			flag = false;
	//  192  458:iconst_0        
	//  193  459:istore_2        
		setPlayWhenReadyInternal(flag);
		break; /* Loop/switch isn't completed */
_L2:
		mediasource = (MediaSource)message.obj;
		if(message.arg1 != 0)
			flag = true;
		else
	//* 194  460:goto            280
			flag = false;
	//  195  463:iconst_0        
	//  196  464:istore_2        
		if(message.arg2 != 0)
			flag1 = true;
		else
	//* 197  465:goto            309
			flag1 = false;
	//  198  468:iconst_0        
	//  199  469:istore_3        
		prepareInternal(mediasource, flag, flag1);
		maybeNotifyPlaybackInfoChanged();
		return true;
		stopInternal(false, false);
		eventHandler.obtainMessage(2, ((Object) (message))).sendToTarget();
		maybeNotifyPlaybackInfoChanged();
		return true;
		return false;
	//* 200  470:goto            321
	}

	public void onContinueLoadingRequested(MediaPeriod mediaperiod)
	{
		handler.obtainMessage(10, ((Object) (mediaperiod))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:bipush          10
	//    3    6:aload_1         
	//    4    7:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//    5   12:invokevirtual   #771 <Method void Message.sendToTarget()>
	//    6   15:return          
	}

	public volatile void onContinueLoadingRequested(SequenceableLoader sequenceableloader)
	{
		onContinueLoadingRequested((MediaPeriod)sequenceableloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #370 <Class MediaPeriod>
	//    3    5:invokevirtual   #1233 <Method void onContinueLoadingRequested(MediaPeriod)>
	//    4    8:return          
	}

	public void onPlaybackParametersChanged(PlaybackParameters playbackparameters)
	{
		eventHandler.obtainMessage(1, ((Object) (playbackparameters))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field Handler eventHandler>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1221 <Method Message Handler.obtainMessage(int, Object)>
	//    5    9:invokevirtual   #771 <Method void Message.sendToTarget()>
		updateTrackSelectionPlaybackSpeed(playbackparameters.speed);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #554 <Field float PlaybackParameters.speed>
	//    9   17:invokespecial   #1236 <Method void updateTrackSelectionPlaybackSpeed(float)>
	//   10   20:return          
	}

	public void onPrepared(MediaPeriod mediaperiod)
	{
		handler.obtainMessage(9, ((Object) (mediaperiod))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:bipush          9
	//    3    6:aload_1         
	//    4    7:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//    5   12:invokevirtual   #771 <Method void Message.sendToTarget()>
	//    6   15:return          
	}

	public void onSourceInfoRefreshed(MediaSource mediasource, Timeline timeline, Object obj)
	{
		handler.obtainMessage(8, ((Object) (new MediaSourceRefreshInfo(mediasource, timeline, obj)))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:bipush          8
	//    3    6:new             #20  <Class ExoPlayerImplInternal$MediaSourceRefreshInfo>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokespecial   #1240 <Method void ExoPlayerImplInternal$MediaSourceRefreshInfo(MediaSource, Timeline, Object)>
	//    9   16:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//   10   21:invokevirtual   #771 <Method void Message.sendToTarget()>
	//   11   24:return          
	}

	public void onTrackSelectionsInvalidated()
	{
		handler.sendEmptyMessage(11);
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:bipush          11
	//    3    6:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//    4   11:pop             
	//    5   12:return          
	}

	public void prepare(MediaSource mediasource, boolean flag, boolean flag1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #907 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1106 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1110 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1 = released;
	//    2    2:aload_0         
	//    3    3:getfield        #862 <Field boolean released>
	//    4    6:istore_2        
		if(!flag1)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		handler.sendEmptyMessage(7);
	//   10   14:aload_0         
	//   11   15:getfield        #271 <Field HandlerWrapper handler>
	//   12   18:bipush          7
	//   13   20:invokeinterface #853 <Method boolean HandlerWrapper.sendEmptyMessage(int)>
	//   14   25:pop             
		boolean flag = false;
	//   15   26:iconst_0        
	//   16   27:istore_1        
_L2:
		flag1 = released;
	//   17   28:aload_0         
	//   18   29:getfield        #862 <Field boolean released>
	//   19   32:istore_2        
		if(flag1)
			break; /* Loop/switch isn't completed */
	//   20   33:iload_2         
	//   21   34:ifne            49
		try
		{
			((Object)this).wait();
	//   22   37:aload_0         
	//   23   38:invokevirtual   #1247 <Method void Object.wait()>
		}
	//*  24   41:goto            28
	//*  25   44:iconst_1        
	//*  26   45:istore_1        
	//*  27   46:goto            28
	//*  28   49:iload_1         
	//*  29   50:ifeq            59
	//*  30   53:invokestatic    #1253 <Method Thread Thread.currentThread()>
	//*  31   56:invokevirtual   #1256 <Method void Thread.interrupt()>
	//*  32   59:aload_0         
	//*  33   60:monitorexit     
	//*  34   61:return          
	//*  35   62:astore_3        
	//*  36   63:aload_0         
	//*  37   64:monitorexit     
	//*  38   65:aload_3         
	//*  39   66:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			flag = true;
		}
		if(true) goto _L2; else goto _L1
_L1:
		if(!flag)
			break MISSING_BLOCK_LABEL_59;
		Thread.currentThread().interrupt();
		this;
		JVM INSTR monitorexit ;
		return;
		Object obj;
		obj;
		throw obj;
	//*  40   67:astore_3        
	//*  41   68:goto            44
	}

	public void seekTo(Timeline timeline, int i, long l)
	{
		handler.obtainMessage(3, ((Object) (new SeekPosition(timeline, i, l)))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:iconst_3        
	//    3    5:new             #29  <Class ExoPlayerImplInternal$SeekPosition>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:lload_3         
	//    8   12:invokespecial   #970 <Method void ExoPlayerImplInternal$SeekPosition(Timeline, int, long)>
	//    9   15:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//   10   20:invokevirtual   #771 <Method void Message.sendToTarget()>
	//   11   23:return          
	}

	public void sendMessage(PlayerMessage playermessage)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!released)
			break MISSING_BLOCK_LABEL_26;
	//    2    2:aload_0         
	//    3    3:getfield        #862 <Field boolean released>
	//    4    6:ifeq            26
		Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
	//    5    9:ldc1            #74  <String "ExoPlayerImplInternal">
	//    6   11:ldc2            #1260 <String "Ignoring messages sent after release.">
	//    7   14:invokestatic    #1264 <Method int Log.w(String, String)>
	//    8   17:pop             
		playermessage.markAsProcessed(false);
	//    9   18:aload_1         
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #308 <Method void PlayerMessage.markAsProcessed(boolean)>
		this;
	//   12   23:aload_0         
		JVM INSTR monitorexit ;
	//   13   24:monitorexit     
		return;
	//   14   25:return          
		handler.obtainMessage(14, ((Object) (playermessage))).sendToTarget();
	//   15   26:aload_0         
	//   16   27:getfield        #271 <Field HandlerWrapper handler>
	//   17   30:bipush          14
	//   18   32:aload_1         
	//   19   33:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//   20   38:invokevirtual   #771 <Method void Message.sendToTarget()>
		this;
	//   21   41:aload_0         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		return;
	//   23   43:return          
		playermessage;
	//   24   44:astore_1        
	//*  25   45:aload_0         
		throw playermessage;
	//   26   46:monitorexit     
	//   27   47:aload_1         
	//   28   48:athrow          
	}

	public void setPlayWhenReady(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #907 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1106 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1110 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		handler.obtainMessage(4, ((Object) (playbackparameters))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:iconst_4        
	//    3    5:aload_1         
	//    4    6:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//    5   11:invokevirtual   #771 <Method void Message.sendToTarget()>
	//    6   14:return          
	}

	public void setRepeatMode(int i)
	{
		handler.obtainMessage(12, i, 0).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:bipush          12
	//    3    6:iload_1         
	//    4    7:iconst_0        
	//    5    8:invokeinterface #1269 <Method Message HandlerWrapper.obtainMessage(int, int, int)>
	//    6   13:invokevirtual   #771 <Method void Message.sendToTarget()>
	//    7   16:return          
	}

	public void setSeekParameters(SeekParameters seekparameters)
	{
		handler.obtainMessage(5, ((Object) (seekparameters))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field HandlerWrapper handler>
	//    2    4:iconst_5        
	//    3    5:aload_1         
	//    4    6:invokeinterface #1049 <Method Message HandlerWrapper.obtainMessage(int, Object)>
	//    5   11:invokevirtual   #771 <Method void Message.sendToTarget()>
	//    6   14:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #907 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1106 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1110 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void stop(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #907 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1106 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1110 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private static final int IDLE_INTERVAL_MS = 1000;
	private static final int MSG_DO_SOME_WORK = 2;
	public static final int MSG_ERROR = 2;
	private static final int MSG_PERIOD_PREPARED = 9;
	public static final int MSG_PLAYBACK_INFO_CHANGED = 0;
	public static final int MSG_PLAYBACK_PARAMETERS_CHANGED = 1;
	private static final int MSG_PREPARE = 0;
	private static final int MSG_REFRESH_SOURCE_INFO = 8;
	private static final int MSG_RELEASE = 7;
	private static final int MSG_SEEK_TO = 3;
	private static final int MSG_SEND_MESSAGE = 14;
	private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
	private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
	private static final int MSG_SET_PLAY_WHEN_READY = 1;
	private static final int MSG_SET_REPEAT_MODE = 12;
	private static final int MSG_SET_SEEK_PARAMETERS = 5;
	private static final int MSG_SET_SHUFFLE_ENABLED = 13;
	private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 10;
	private static final int MSG_STOP = 6;
	private static final int MSG_TRACK_SELECTION_INVALIDATED = 11;
	private static final int PREPARING_SOURCE_INTERVAL_MS = 10;
	private static final int RENDERING_INTERVAL_MS = 10;
	private static final String TAG = "ExoPlayerImplInternal";
	private final long backBufferDurationUs;
	private final Clock clock;
	private final TrackSelectorResult emptyTrackSelectorResult;
	private Renderer enabledRenderers[];
	private final Handler eventHandler;
	private final HandlerWrapper handler;
	private final HandlerThread internalPlaybackThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
	private final LoadControl loadControl;
	private final DefaultMediaClock mediaClock;
	private MediaSource mediaSource;
	private int nextPendingMessageIndex;
	private SeekPosition pendingInitialSeekPosition;
	private final ArrayList pendingMessages = new ArrayList();
	private int pendingPrepareCount;
	private final Timeline.Period period = new Timeline.Period();
	private boolean playWhenReady;
	private PlaybackInfo playbackInfo;
	private final PlaybackInfoUpdate playbackInfoUpdate = new PlaybackInfoUpdate();
	private final ExoPlayer player;
	private final MediaPeriodQueue queue = new MediaPeriodQueue();
	private boolean rebuffering;
	private boolean released;
	private final RendererCapabilities rendererCapabilities[];
	private long rendererPositionUs;
	private final Renderer renderers[];
	private int repeatMode;
	private final boolean retainBackBufferFromKeyframe;
	private SeekParameters seekParameters;
	private boolean shuffleModeEnabled;
	private final TrackSelector trackSelector;
	private final Timeline.Window window = new Timeline.Window();


/*
	static void access$400(ExoPlayerImplInternal exoplayerimplinternal, PlayerMessage playermessage)
		throws ExoPlaybackException
	{
		exoplayerimplinternal.deliverMessage(playermessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #280 <Method void deliverMessage(PlayerMessage)>
		return;
	//    3    5:return          
	}

*/
}
