// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayer, RendererConfiguration, PlaybackParameters, PlaybackInfo, 
//			Timeline, ExoPlayerImplInternal, C, PlayerMessage, 
//			Renderer, ExoPlaybackException, ExoPlayerLibraryInfo, IllegalSeekPositionException, 
//			SeekParameters, LoadControl

final class ExoPlayerImpl
	implements ExoPlayer
{
	private static final class PlaybackInfoUpdate
	{

		public void notifyListeners()
		{
			if(timelineOrManifestChanged || timelineChangeReason == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field boolean timelineOrManifestChanged>
		//*   2    4:ifne            14
		//*   3    7:aload_0         
		//*   4    8:getfield        #42  <Field int timelineChangeReason>
		//*   5   11:ifne            68
			{
				for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Player.EventListener)iterator.next()).onTimelineChanged(playbackInfo.timeline, playbackInfo.manifest, timelineChangeReason));
		//    6   14:aload_0         
		//    7   15:getfield        #34  <Field Set listeners>
		//    8   18:invokeinterface #84  <Method Iterator Set.iterator()>
		//    9   23:astore_1        
		//   10   24:aload_1         
		//   11   25:invokeinterface #90  <Method boolean Iterator.hasNext()>
		//   12   30:ifeq            68
		//   13   33:aload_1         
		//   14   34:invokeinterface #94  <Method Object Iterator.next()>
		//   15   39:checkcast       #96  <Class Player$EventListener>
		//   16   42:aload_0         
		//   17   43:getfield        #32  <Field PlaybackInfo playbackInfo>
		//   18   46:getfield        #57  <Field Timeline PlaybackInfo.timeline>
		//   19   49:aload_0         
		//   20   50:getfield        #32  <Field PlaybackInfo playbackInfo>
		//   21   53:getfield        #61  <Field Object PlaybackInfo.manifest>
		//   22   56:aload_0         
		//   23   57:getfield        #42  <Field int timelineChangeReason>
		//   24   60:invokeinterface #100 <Method void Player$EventListener.onTimelineChanged(Timeline, Object, int)>
			}
		//*  25   65:goto            24
			if(positionDiscontinuity)
		//*  26   68:aload_0         
		//*  27   69:getfield        #38  <Field boolean positionDiscontinuity>
		//*  28   72:ifeq            115
			{
				for(Iterator iterator1 = listeners.iterator(); iterator1.hasNext(); ((Player.EventListener)iterator1.next()).onPositionDiscontinuity(positionDiscontinuityReason));
		//   29   75:aload_0         
		//   30   76:getfield        #34  <Field Set listeners>
		//   31   79:invokeinterface #84  <Method Iterator Set.iterator()>
		//   32   84:astore_1        
		//   33   85:aload_1         
		//   34   86:invokeinterface #90  <Method boolean Iterator.hasNext()>
		//   35   91:ifeq            115
		//   36   94:aload_1         
		//   37   95:invokeinterface #94  <Method Object Iterator.next()>
		//   38  100:checkcast       #96  <Class Player$EventListener>
		//   39  103:aload_0         
		//   40  104:getfield        #40  <Field int positionDiscontinuityReason>
		//   41  107:invokeinterface #104 <Method void Player$EventListener.onPositionDiscontinuity(int)>
			}
		//*  42  112:goto            85
			if(trackSelectorResultChanged)
		//*  43  115:aload_0         
		//*  44  116:getfield        #74  <Field boolean trackSelectorResultChanged>
		//*  45  119:ifeq            192
			{
				trackSelector.onSelectionActivated(playbackInfo.trackSelectorResult.info);
		//   46  122:aload_0         
		//   47  123:getfield        #36  <Field TrackSelector trackSelector>
		//   48  126:aload_0         
		//   49  127:getfield        #32  <Field PlaybackInfo playbackInfo>
		//   50  130:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
		//   51  133:getfield        #109 <Field Object TrackSelectorResult.info>
		//   52  136:invokevirtual   #115 <Method void TrackSelector.onSelectionActivated(Object)>
				for(Iterator iterator2 = listeners.iterator(); iterator2.hasNext(); ((Player.EventListener)iterator2.next()).onTracksChanged(playbackInfo.trackGroups, playbackInfo.trackSelectorResult.selections));
		//   53  139:aload_0         
		//   54  140:getfield        #34  <Field Set listeners>
		//   55  143:invokeinterface #84  <Method Iterator Set.iterator()>
		//   56  148:astore_1        
		//   57  149:aload_1         
		//   58  150:invokeinterface #90  <Method boolean Iterator.hasNext()>
		//   59  155:ifeq            192
		//   60  158:aload_1         
		//   61  159:invokeinterface #94  <Method Object Iterator.next()>
		//   62  164:checkcast       #96  <Class Player$EventListener>
		//   63  167:aload_0         
		//   64  168:getfield        #32  <Field PlaybackInfo playbackInfo>
		//   65  171:getfield        #119 <Field TrackGroupArray PlaybackInfo.trackGroups>
		//   66  174:aload_0         
		//   67  175:getfield        #32  <Field PlaybackInfo playbackInfo>
		//   68  178:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
		//   69  181:getfield        #123 <Field TrackSelectionArray TrackSelectorResult.selections>
		//   70  184:invokeinterface #127 <Method void Player$EventListener.onTracksChanged(TrackGroupArray, TrackSelectionArray)>
			}
		//*  71  189:goto            149
			if(isLoadingChanged)
		//*  72  192:aload_0         
		//*  73  193:getfield        #68  <Field boolean isLoadingChanged>
		//*  74  196:ifeq            242
			{
				for(Iterator iterator3 = listeners.iterator(); iterator3.hasNext(); ((Player.EventListener)iterator3.next()).onLoadingChanged(playbackInfo.isLoading));
		//   75  199:aload_0         
		//   76  200:getfield        #34  <Field Set listeners>
		//   77  203:invokeinterface #84  <Method Iterator Set.iterator()>
		//   78  208:astore_1        
		//   79  209:aload_1         
		//   80  210:invokeinterface #90  <Method boolean Iterator.hasNext()>
		//   81  215:ifeq            242
		//   82  218:aload_1         
		//   83  219:invokeinterface #94  <Method Object Iterator.next()>
		//   84  224:checkcast       #96  <Class Player$EventListener>
		//   85  227:aload_0         
		//   86  228:getfield        #32  <Field PlaybackInfo playbackInfo>
		//   87  231:getfield        #66  <Field boolean PlaybackInfo.isLoading>
		//   88  234:invokeinterface #131 <Method void Player$EventListener.onLoadingChanged(boolean)>
			}
		//*  89  239:goto            209
			if(playbackStateOrPlayWhenReadyChanged)
		//*  90  242:aload_0         
		//*  91  243:getfield        #53  <Field boolean playbackStateOrPlayWhenReadyChanged>
		//*  92  246:ifeq            296
			{
				for(Iterator iterator4 = listeners.iterator(); iterator4.hasNext(); ((Player.EventListener)iterator4.next()).onPlayerStateChanged(playWhenReady, playbackInfo.playbackState));
		//   93  249:aload_0         
		//   94  250:getfield        #34  <Field Set listeners>
		//   95  253:invokeinterface #84  <Method Iterator Set.iterator()>
		//   96  258:astore_1        
		//   97  259:aload_1         
		//   98  260:invokeinterface #90  <Method boolean Iterator.hasNext()>
		//   99  265:ifeq            296
		//  100  268:aload_1         
		//  101  269:invokeinterface #94  <Method Object Iterator.next()>
		//  102  274:checkcast       #96  <Class Player$EventListener>
		//  103  277:aload_0         
		//  104  278:getfield        #46  <Field boolean playWhenReady>
		//  105  281:aload_0         
		//  106  282:getfield        #32  <Field PlaybackInfo playbackInfo>
		//  107  285:getfield        #51  <Field int PlaybackInfo.playbackState>
		//  108  288:invokeinterface #135 <Method void Player$EventListener.onPlayerStateChanged(boolean, int)>
			}
		//* 109  293:goto            259
			if(seekProcessed)
		//* 110  296:aload_0         
		//* 111  297:getfield        #44  <Field boolean seekProcessed>
		//* 112  300:ifeq            339
			{
				for(Iterator iterator5 = listeners.iterator(); iterator5.hasNext(); ((Player.EventListener)iterator5.next()).onSeekProcessed());
		//  113  303:aload_0         
		//  114  304:getfield        #34  <Field Set listeners>
		//  115  307:invokeinterface #84  <Method Iterator Set.iterator()>
		//  116  312:astore_1        
		//  117  313:aload_1         
		//  118  314:invokeinterface #90  <Method boolean Iterator.hasNext()>
		//  119  319:ifeq            339
		//  120  322:aload_1         
		//  121  323:invokeinterface #94  <Method Object Iterator.next()>
		//  122  328:checkcast       #96  <Class Player$EventListener>
		//  123  331:invokeinterface #138 <Method void Player$EventListener.onSeekProcessed()>
			}
		//* 124  336:goto            313
		//  125  339:return          
		}

		private final boolean isLoadingChanged;
		private final Set listeners;
		private final boolean playWhenReady;
		private final PlaybackInfo playbackInfo;
		private final boolean playbackStateOrPlayWhenReadyChanged;
		private final boolean positionDiscontinuity;
		private final int positionDiscontinuityReason;
		private final boolean seekProcessed;
		private final int timelineChangeReason;
		private final boolean timelineOrManifestChanged;
		private final TrackSelector trackSelector;
		private final boolean trackSelectorResultChanged;

		public PlaybackInfoUpdate(PlaybackInfo playbackinfo, PlaybackInfo playbackinfo1, Set set, TrackSelector trackselector, boolean flag, int i, int j, 
				boolean flag1, boolean flag2, boolean flag3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			playbackInfo = playbackinfo;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #32  <Field PlaybackInfo playbackInfo>
			listeners = set;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #34  <Field Set listeners>
			trackSelector = trackselector;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #36  <Field TrackSelector trackSelector>
			positionDiscontinuity = flag;
		//   11   20:aload_0         
		//   12   21:iload           5
		//   13   23:putfield        #38  <Field boolean positionDiscontinuity>
			positionDiscontinuityReason = i;
		//   14   26:aload_0         
		//   15   27:iload           6
		//   16   29:putfield        #40  <Field int positionDiscontinuityReason>
			timelineChangeReason = j;
		//   17   32:aload_0         
		//   18   33:iload           7
		//   19   35:putfield        #42  <Field int timelineChangeReason>
			seekProcessed = flag1;
		//   20   38:aload_0         
		//   21   39:iload           8
		//   22   41:putfield        #44  <Field boolean seekProcessed>
			playWhenReady = flag2;
		//   23   44:aload_0         
		//   24   45:iload           9
		//   25   47:putfield        #46  <Field boolean playWhenReady>
			flag1 = true;
		//   26   50:iconst_1        
		//   27   51:istore          8
			if(!flag3 && playbackinfo1.playbackState == playbackinfo.playbackState)
		//*  28   53:iload           10
		//*  29   55:ifne            78
		//*  30   58:aload_2         
		//*  31   59:getfield        #51  <Field int PlaybackInfo.playbackState>
		//*  32   62:aload_1         
		//*  33   63:getfield        #51  <Field int PlaybackInfo.playbackState>
		//*  34   66:icmpeq          72
		//*  35   69:goto            78
				flag = false;
		//   36   72:iconst_0        
		//   37   73:istore          5
			else
		//*  38   75:goto            81
				flag = true;
		//   39   78:iconst_1        
		//   40   79:istore          5
			playbackStateOrPlayWhenReadyChanged = flag;
		//   41   81:aload_0         
		//   42   82:iload           5
		//   43   84:putfield        #53  <Field boolean playbackStateOrPlayWhenReadyChanged>
			if(playbackinfo1.timeline == playbackinfo.timeline && playbackinfo1.manifest == playbackinfo.manifest)
		//*  44   87:aload_2         
		//*  45   88:getfield        #57  <Field Timeline PlaybackInfo.timeline>
		//*  46   91:aload_1         
		//*  47   92:getfield        #57  <Field Timeline PlaybackInfo.timeline>
		//*  48   95:if_acmpne       118
		//*  49   98:aload_2         
		//*  50   99:getfield        #61  <Field Object PlaybackInfo.manifest>
		//*  51  102:aload_1         
		//*  52  103:getfield        #61  <Field Object PlaybackInfo.manifest>
		//*  53  106:if_acmpeq       112
		//*  54  109:goto            118
				flag = false;
		//   55  112:iconst_0        
		//   56  113:istore          5
			else
		//*  57  115:goto            121
				flag = true;
		//   58  118:iconst_1        
		//   59  119:istore          5
			timelineOrManifestChanged = flag;
		//   60  121:aload_0         
		//   61  122:iload           5
		//   62  124:putfield        #63  <Field boolean timelineOrManifestChanged>
			if(playbackinfo1.isLoading != playbackinfo.isLoading)
		//*  63  127:aload_2         
		//*  64  128:getfield        #66  <Field boolean PlaybackInfo.isLoading>
		//*  65  131:aload_1         
		//*  66  132:getfield        #66  <Field boolean PlaybackInfo.isLoading>
		//*  67  135:icmpeq          144
				flag = true;
		//   68  138:iconst_1        
		//   69  139:istore          5
			else
		//*  70  141:goto            147
				flag = false;
		//   71  144:iconst_0        
		//   72  145:istore          5
			isLoadingChanged = flag;
		//   73  147:aload_0         
		//   74  148:iload           5
		//   75  150:putfield        #68  <Field boolean isLoadingChanged>
			if(playbackinfo1.trackSelectorResult != playbackinfo.trackSelectorResult)
		//*  76  153:aload_2         
		//*  77  154:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
		//*  78  157:aload_1         
		//*  79  158:getfield        #72  <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
		//*  80  161:if_acmpeq       171
				flag = flag1;
		//   81  164:iload           8
		//   82  166:istore          5
			else
		//*  83  168:goto            174
				flag = false;
		//   84  171:iconst_0        
		//   85  172:istore          5
			trackSelectorResultChanged = flag;
		//   86  174:aload_0         
		//   87  175:iload           5
		//   88  177:putfield        #74  <Field boolean trackSelectorResultChanged>
		//   89  180:return          
		}
	}


	public ExoPlayerImpl(Renderer arenderer[], TrackSelector trackselector, LoadControl loadcontrol, Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		Object obj = ((Object) (new StringBuilder()));
	//    2    4:new             #65  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #66  <Method void StringBuilder()>
	//    5   11:astore          6
		((StringBuilder) (obj)).append("Init ");
	//    6   13:aload           6
	//    7   15:ldc1            #68  <String "Init ">
	//    8   17:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		((StringBuilder) (obj)).append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//   10   21:aload           6
	//   11   23:aload_0         
	//   12   24:invokestatic    #78  <Method int System.identityHashCode(Object)>
	//   13   27:invokestatic    #84  <Method String Integer.toHexString(int)>
	//   14   30:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		((StringBuilder) (obj)).append(" [");
	//   16   34:aload           6
	//   17   36:ldc1            #86  <String " [">
	//   18   38:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
		((StringBuilder) (obj)).append("ExoPlayerLib/2.8.3");
	//   20   42:aload           6
	//   21   44:ldc1            #88  <String "ExoPlayerLib/2.8.3">
	//   22   46:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
		((StringBuilder) (obj)).append("] [");
	//   24   50:aload           6
	//   25   52:ldc1            #90  <String "] [">
	//   26   54:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		((StringBuilder) (obj)).append(Util.DEVICE_DEBUG_INFO);
	//   28   58:aload           6
	//   29   60:getstatic       #95  <Field String Util.DEVICE_DEBUG_INFO>
	//   30   63:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   31   66:pop             
		((StringBuilder) (obj)).append("]");
	//   32   67:aload           6
	//   33   69:ldc1            #97  <String "]">
	//   34   71:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
		Log.i("ExoPlayerImpl", ((StringBuilder) (obj)).toString());
	//   36   75:ldc1            #15  <String "ExoPlayerImpl">
	//   37   77:aload           6
	//   38   79:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   39   82:invokestatic    #107 <Method int Log.i(String, String)>
	//   40   85:pop             
		boolean flag;
		if(arenderer.length > 0)
	//*  41   86:aload_1         
	//*  42   87:arraylength     
	//*  43   88:ifle            97
			flag = true;
	//   44   91:iconst_1        
	//   45   92:istore          5
		else
	//*  46   94:goto            100
			flag = false;
	//   47   97:iconst_0        
	//   48   98:istore          5
		Assertions.checkState(flag);
	//   49  100:iload           5
	//   50  102:invokestatic    #113 <Method void Assertions.checkState(boolean)>
		renderers = (Renderer[])Assertions.checkNotNull(((Object) (arenderer)));
	//   51  105:aload_0         
	//   52  106:aload_1         
	//   53  107:invokestatic    #117 <Method Object Assertions.checkNotNull(Object)>
	//   54  110:checkcast       #118 <Class Renderer[]>
	//   55  113:putfield        #120 <Field Renderer[] renderers>
		trackSelector = (TrackSelector)Assertions.checkNotNull(((Object) (trackselector)));
	//   56  116:aload_0         
	//   57  117:aload_2         
	//   58  118:invokestatic    #117 <Method Object Assertions.checkNotNull(Object)>
	//   59  121:checkcast       #122 <Class TrackSelector>
	//   60  124:putfield        #124 <Field TrackSelector trackSelector>
		playWhenReady = false;
	//   61  127:aload_0         
	//   62  128:iconst_0        
	//   63  129:putfield        #126 <Field boolean playWhenReady>
		repeatMode = 0;
	//   64  132:aload_0         
	//   65  133:iconst_0        
	//   66  134:putfield        #128 <Field int repeatMode>
		shuffleModeEnabled = false;
	//   67  137:aload_0         
	//   68  138:iconst_0        
	//   69  139:putfield        #130 <Field boolean shuffleModeEnabled>
	//   70  142:aload_0         
	//   71  143:new             #132 <Class CopyOnWriteArraySet>
	//   72  146:dup             
	//   73  147:invokespecial   #133 <Method void CopyOnWriteArraySet()>
	//   74  150:putfield        #135 <Field CopyOnWriteArraySet listeners>
		emptyTrackSelectorResult = new TrackSelectorResult(new RendererConfiguration[arenderer.length], new TrackSelection[arenderer.length], ((Object) (null)));
	//   75  153:aload_0         
	//   76  154:new             #137 <Class TrackSelectorResult>
	//   77  157:dup             
	//   78  158:aload_1         
	//   79  159:arraylength     
	//   80  160:anewarray       RendererConfiguration[]
	//   81  163:aload_1         
	//   82  164:arraylength     
	//   83  165:anewarray       TrackSelection[]
	//   84  168:aconst_null     
	//   85  169:invokespecial   #144 <Method void TrackSelectorResult(RendererConfiguration[], TrackSelection[], Object)>
	//   86  172:putfield        #146 <Field TrackSelectorResult emptyTrackSelectorResult>
	//   87  175:aload_0         
	//   88  176:new             #148 <Class Timeline$Window>
	//   89  179:dup             
	//   90  180:invokespecial   #149 <Method void Timeline$Window()>
	//   91  183:putfield        #151 <Field Timeline$Window window>
	//   92  186:aload_0         
	//   93  187:new             #153 <Class Timeline$Period>
	//   94  190:dup             
	//   95  191:invokespecial   #154 <Method void Timeline$Period()>
	//   96  194:putfield        #156 <Field Timeline$Period period>
		playbackParameters = PlaybackParameters.DEFAULT;
	//   97  197:aload_0         
	//   98  198:getstatic       #161 <Field PlaybackParameters PlaybackParameters.DEFAULT>
	//   99  201:putfield        #163 <Field PlaybackParameters playbackParameters>
		if(Looper.myLooper() != null)
	//* 100  204:invokestatic    #169 <Method Looper Looper.myLooper()>
	//* 101  207:ifnull          218
			obj = ((Object) (Looper.myLooper()));
	//  102  210:invokestatic    #169 <Method Looper Looper.myLooper()>
	//  103  213:astore          6
		else
	//* 104  215:goto            223
			obj = ((Object) (Looper.getMainLooper()));
	//  105  218:invokestatic    #172 <Method Looper Looper.getMainLooper()>
	//  106  221:astore          6
		eventHandler = ((Handler) (new Handler(((Looper) (obj))) {

			public void handleMessage(Message message)
			{
				handleEvent(message);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ExoPlayerImpl this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #23  <Method void ExoPlayerImpl.handleEvent(Message)>
			//    4    8:return          
			}

			final ExoPlayerImpl this$0;

			
			{
				this$0 = ExoPlayerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ExoPlayerImpl this$0>
				super(looper);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void Handler(Looper)>
			//    6   10:return          
			}
		}
));
	//  107  223:aload_0         
	//  108  224:new             #8   <Class ExoPlayerImpl$1>
	//  109  227:dup             
	//  110  228:aload_0         
	//  111  229:aload           6
	//  112  231:invokespecial   #175 <Method void ExoPlayerImpl$1(ExoPlayerImpl, Looper)>
	//  113  234:putfield        #177 <Field Handler eventHandler>
		playbackInfo = new PlaybackInfo(Timeline.EMPTY, 0L, TrackGroupArray.EMPTY, emptyTrackSelectorResult);
	//  114  237:aload_0         
	//  115  238:new             #179 <Class PlaybackInfo>
	//  116  241:dup             
	//  117  242:getstatic       #185 <Field Timeline Timeline.EMPTY>
	//  118  245:lconst_0        
	//  119  246:getstatic       #190 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//  120  249:aload_0         
	//  121  250:getfield        #146 <Field TrackSelectorResult emptyTrackSelectorResult>
	//  122  253:invokespecial   #193 <Method void PlaybackInfo(Timeline, long, TrackGroupArray, TrackSelectorResult)>
	//  123  256:putfield        #195 <Field PlaybackInfo playbackInfo>
	//  124  259:aload_0         
	//  125  260:new             #197 <Class ArrayDeque>
	//  126  263:dup             
	//  127  264:invokespecial   #198 <Method void ArrayDeque()>
	//  128  267:putfield        #200 <Field ArrayDeque pendingPlaybackInfoUpdates>
		internalPlayer = new ExoPlayerImplInternal(arenderer, trackselector, emptyTrackSelectorResult, loadcontrol, playWhenReady, repeatMode, shuffleModeEnabled, eventHandler, ((ExoPlayer) (this)), clock);
	//  129  270:aload_0         
	//  130  271:new             #202 <Class ExoPlayerImplInternal>
	//  131  274:dup             
	//  132  275:aload_1         
	//  133  276:aload_2         
	//  134  277:aload_0         
	//  135  278:getfield        #146 <Field TrackSelectorResult emptyTrackSelectorResult>
	//  136  281:aload_3         
	//  137  282:aload_0         
	//  138  283:getfield        #126 <Field boolean playWhenReady>
	//  139  286:aload_0         
	//  140  287:getfield        #128 <Field int repeatMode>
	//  141  290:aload_0         
	//  142  291:getfield        #130 <Field boolean shuffleModeEnabled>
	//  143  294:aload_0         
	//  144  295:getfield        #177 <Field Handler eventHandler>
	//  145  298:aload_0         
	//  146  299:aload           4
	//  147  301:invokespecial   #205 <Method void ExoPlayerImplInternal(Renderer[], TrackSelector, TrackSelectorResult, LoadControl, boolean, int, boolean, Handler, ExoPlayer, Clock)>
	//  148  304:putfield        #207 <Field ExoPlayerImplInternal internalPlayer>
		internalPlayerHandler = new Handler(internalPlayer.getPlaybackLooper());
	//  149  307:aload_0         
	//  150  308:new             #209 <Class Handler>
	//  151  311:dup             
	//  152  312:aload_0         
	//  153  313:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//  154  316:invokevirtual   #212 <Method Looper ExoPlayerImplInternal.getPlaybackLooper()>
	//  155  319:invokespecial   #215 <Method void Handler(Looper)>
	//  156  322:putfield        #217 <Field Handler internalPlayerHandler>
	//  157  325:return          
	}

	private PlaybackInfo getResetPlaybackInfo(boolean flag, boolean flag1, int i)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            22
		{
			maskingWindowIndex = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #223 <Field int maskingWindowIndex>
			maskingPeriodIndex = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #225 <Field int maskingPeriodIndex>
			maskingWindowPositionMs = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #227 <Field long maskingWindowPositionMs>
		} else
	//*  11   19:goto            46
		{
			maskingWindowIndex = getCurrentWindowIndex();
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//   15   27:putfield        #223 <Field int maskingWindowIndex>
			maskingPeriodIndex = getCurrentPeriodIndex();
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #234 <Method int getCurrentPeriodIndex()>
	//   19   35:putfield        #225 <Field int maskingPeriodIndex>
			maskingWindowPositionMs = getCurrentPosition();
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:invokevirtual   #238 <Method long getCurrentPosition()>
	//   23   43:putfield        #227 <Field long maskingWindowPositionMs>
		}
		Timeline timeline;
		if(flag1)
	//*  24   46:iload_2         
	//*  25   47:ifeq            58
			timeline = Timeline.EMPTY;
	//   26   50:getstatic       #185 <Field Timeline Timeline.EMPTY>
	//   27   53:astore          8
		else
	//*  28   55:goto            70
			timeline = playbackInfo.timeline;
	//   29   58:aload_0         
	//   30   59:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   31   62:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//   32   65:astore          8
	//*  33   67:goto            55
		Object obj;
		if(flag1)
	//*  34   70:iload_2         
	//*  35   71:ifeq            80
			obj = null;
	//   36   74:aconst_null     
	//   37   75:astore          9
		else
	//*  38   77:goto            92
			obj = playbackInfo.manifest;
	//   39   80:aload_0         
	//   40   81:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   41   84:getfield        #245 <Field Object PlaybackInfo.manifest>
	//   42   87:astore          9
	//*  43   89:goto            77
		com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid = playbackInfo.periodId;
	//   44   92:aload_0         
	//   45   93:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   46   96:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   47   99:astore          12
		long l = playbackInfo.startPositionUs;
	//   48  101:aload_0         
	//   49  102:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   50  105:getfield        #252 <Field long PlaybackInfo.startPositionUs>
	//   51  108:lstore          4
		long l1 = playbackInfo.contentPositionUs;
	//   52  110:aload_0         
	//   53  111:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   54  114:getfield        #255 <Field long PlaybackInfo.contentPositionUs>
	//   55  117:lstore          6
		TrackGroupArray trackgrouparray;
		if(flag1)
	//*  56  119:iload_2         
	//*  57  120:ifeq            131
			trackgrouparray = TrackGroupArray.EMPTY;
	//   58  123:getstatic       #190 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//   59  126:astore          10
		else
	//*  60  128:goto            143
			trackgrouparray = playbackInfo.trackGroups;
	//   61  131:aload_0         
	//   62  132:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   63  135:getfield        #258 <Field TrackGroupArray PlaybackInfo.trackGroups>
	//   64  138:astore          10
	//*  65  140:goto            128
		TrackSelectorResult trackselectorresult;
		if(flag1)
	//*  66  143:iload_2         
	//*  67  144:ifeq            156
			trackselectorresult = emptyTrackSelectorResult;
	//   68  147:aload_0         
	//   69  148:getfield        #146 <Field TrackSelectorResult emptyTrackSelectorResult>
	//   70  151:astore          11
		else
	//*  71  153:goto            168
			trackselectorresult = playbackInfo.trackSelectorResult;
	//   72  156:aload_0         
	//   73  157:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   74  160:getfield        #261 <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
	//   75  163:astore          11
	//*  76  165:goto            153
		return new PlaybackInfo(timeline, obj, mediaperiodid, l, l1, i, false, trackgrouparray, trackselectorresult);
	//   77  168:new             #179 <Class PlaybackInfo>
	//   78  171:dup             
	//   79  172:aload           8
	//   80  174:aload           9
	//   81  176:aload           12
	//   82  178:lload           4
	//   83  180:lload           6
	//   84  182:iload_3         
	//   85  183:iconst_0        
	//   86  184:aload           10
	//   87  186:aload           11
	//   88  188:invokespecial   #264 <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   89  191:areturn         
	}

	private void handlePlaybackInfo(PlaybackInfo playbackinfo, int i, boolean flag, int j)
	{
		pendingOperationAcks = pendingOperationAcks - i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #268 <Field int pendingOperationAcks>
	//    3    5:iload_2         
	//    4    6:isub            
	//    5    7:putfield        #268 <Field int pendingOperationAcks>
		if(pendingOperationAcks == 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #268 <Field int pendingOperationAcks>
	//*   8   14:ifne            135
		{
			PlaybackInfo playbackinfo1 = playbackinfo;
	//    9   17:aload_1         
	//   10   18:astore          6
			if(playbackinfo.startPositionUs == 0x1L)
	//*  11   20:aload_1         
	//*  12   21:getfield        #252 <Field long PlaybackInfo.startPositionUs>
	//*  13   24:ldc2w           #269 <Long 0x1L>
	//*  14   27:lcmp            
	//*  15   28:ifne            46
				playbackinfo1 = playbackinfo.fromNewPosition(playbackinfo.periodId, 0L, playbackinfo.contentPositionUs);
	//   16   31:aload_1         
	//   17   32:aload_1         
	//   18   33:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   19   36:lconst_0        
	//   20   37:aload_1         
	//   21   38:getfield        #255 <Field long PlaybackInfo.contentPositionUs>
	//   22   41:invokevirtual   #274 <Method PlaybackInfo PlaybackInfo.fromNewPosition(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long)>
	//   23   44:astore          6
			if((!playbackInfo.timeline.isEmpty() || hasPendingPrepare) && playbackinfo1.timeline.isEmpty())
	//*  24   46:aload_0         
	//*  25   47:getfield        #195 <Field PlaybackInfo playbackInfo>
	//*  26   50:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//*  27   53:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//*  28   56:ifeq            66
	//*  29   59:aload_0         
	//*  30   60:getfield        #280 <Field boolean hasPendingPrepare>
	//*  31   63:ifeq            92
	//*  32   66:aload           6
	//*  33   68:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//*  34   71:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//*  35   74:ifeq            92
			{
				maskingPeriodIndex = 0;
	//   36   77:aload_0         
	//   37   78:iconst_0        
	//   38   79:putfield        #225 <Field int maskingPeriodIndex>
				maskingWindowIndex = 0;
	//   39   82:aload_0         
	//   40   83:iconst_0        
	//   41   84:putfield        #223 <Field int maskingWindowIndex>
				maskingWindowPositionMs = 0L;
	//   42   87:aload_0         
	//   43   88:lconst_0        
	//   44   89:putfield        #227 <Field long maskingWindowPositionMs>
			}
			if(hasPendingPrepare)
	//*  45   92:aload_0         
	//*  46   93:getfield        #280 <Field boolean hasPendingPrepare>
	//*  47   96:ifeq            104
				i = 0;
	//   48   99:iconst_0        
	//   49  100:istore_2        
			else
	//*  50  101:goto            106
				i = 2;
	//   51  104:iconst_2        
	//   52  105:istore_2        
			boolean flag1 = hasPendingSeek;
	//   53  106:aload_0         
	//   54  107:getfield        #282 <Field boolean hasPendingSeek>
	//   55  110:istore          5
			hasPendingPrepare = false;
	//   56  112:aload_0         
	//   57  113:iconst_0        
	//   58  114:putfield        #280 <Field boolean hasPendingPrepare>
			hasPendingSeek = false;
	//   59  117:aload_0         
	//   60  118:iconst_0        
	//   61  119:putfield        #282 <Field boolean hasPendingSeek>
			updatePlaybackInfo(playbackinfo1, flag, j, i, flag1, false);
	//   62  122:aload_0         
	//   63  123:aload           6
	//   64  125:iload_3         
	//   65  126:iload           4
	//   66  128:iload_2         
	//   67  129:iload           5
	//   68  131:iconst_0        
	//   69  132:invokespecial   #286 <Method void updatePlaybackInfo(PlaybackInfo, boolean, int, int, boolean, boolean)>
		}
	//   70  135:return          
	}

	private long playbackInfoPositionUsToWindowPositionMs(long l)
	{
		long l1 = C.usToMs(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #293 <Method long C.usToMs(long)>
	//    2    4:lstore_3        
		l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(!playbackInfo.periodId.isAd())
	//*   5    7:aload_0         
	//*   6    8:getfield        #195 <Field PlaybackInfo playbackInfo>
	//*   7   11:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//*   8   14:invokevirtual   #298 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*   9   17:ifne            55
		{
			playbackInfo.timeline.getPeriod(playbackInfo.periodId.periodIndex, period);
	//   10   20:aload_0         
	//   11   21:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   12   24:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//   13   27:aload_0         
	//   14   28:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   15   31:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   16   34:getfield        #301 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   17   37:aload_0         
	//   18   38:getfield        #156 <Field Timeline$Period period>
	//   19   41:invokevirtual   #305 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   20   44:pop             
			l = l1 + period.getPositionInWindowMs();
	//   21   45:lload_3         
	//   22   46:aload_0         
	//   23   47:getfield        #156 <Field Timeline$Period period>
	//   24   50:invokevirtual   #308 <Method long Timeline$Period.getPositionInWindowMs()>
	//   25   53:ladd            
	//   26   54:lstore_1        
		}
		return l;
	//   27   55:lload_1         
	//   28   56:lreturn         
	}

	private boolean shouldMaskPosition()
	{
		return playbackInfo.timeline.isEmpty() || pendingOperationAcks > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//    4   10:ifne            25
	//    5   13:aload_0         
	//    6   14:getfield        #268 <Field int pendingOperationAcks>
	//    7   17:ifle            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	private void updatePlaybackInfo(PlaybackInfo playbackinfo, boolean flag, int i, int j, boolean flag1, boolean flag2)
	{
		boolean flag3 = pendingPlaybackInfoUpdates.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field ArrayDeque pendingPlaybackInfoUpdates>
	//    2    4:invokevirtual   #310 <Method boolean ArrayDeque.isEmpty()>
	//    3    7:istore          7
		pendingPlaybackInfoUpdates.addLast(((Object) (new PlaybackInfoUpdate(playbackinfo, playbackInfo, ((Set) (listeners)), trackSelector, flag, i, j, flag1, playWhenReady, flag2))));
	//    4    9:aload_0         
	//    5   10:getfield        #200 <Field ArrayDeque pendingPlaybackInfoUpdates>
	//    6   13:new             #10  <Class ExoPlayerImpl$PlaybackInfoUpdate>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:aload_0         
	//   10   19:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   11   22:aload_0         
	//   12   23:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//   13   26:aload_0         
	//   14   27:getfield        #124 <Field TrackSelector trackSelector>
	//   15   30:iload_2         
	//   16   31:iload_3         
	//   17   32:iload           4
	//   18   34:iload           5
	//   19   36:aload_0         
	//   20   37:getfield        #126 <Field boolean playWhenReady>
	//   21   40:iload           6
	//   22   42:invokespecial   #313 <Method void ExoPlayerImpl$PlaybackInfoUpdate(PlaybackInfo, PlaybackInfo, Set, TrackSelector, boolean, int, int, boolean, boolean, boolean)>
	//   23   45:invokevirtual   #317 <Method void ArrayDeque.addLast(Object)>
		playbackInfo = playbackinfo;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:putfield        #195 <Field PlaybackInfo playbackInfo>
		if(flag3 ^ true)
	//*  27   53:iload           7
	//*  28   55:iconst_1        
	//*  29   56:ixor            
	//*  30   57:ifeq            61
			return;
	//   31   60:return          
		for(; !pendingPlaybackInfoUpdates.isEmpty(); pendingPlaybackInfoUpdates.removeFirst())
	//*  32   61:aload_0         
	//*  33   62:getfield        #200 <Field ArrayDeque pendingPlaybackInfoUpdates>
	//*  34   65:invokevirtual   #310 <Method boolean ArrayDeque.isEmpty()>
	//*  35   68:ifne            95
			((PlaybackInfoUpdate)pendingPlaybackInfoUpdates.peekFirst()).notifyListeners();
	//   36   71:aload_0         
	//   37   72:getfield        #200 <Field ArrayDeque pendingPlaybackInfoUpdates>
	//   38   75:invokevirtual   #321 <Method Object ArrayDeque.peekFirst()>
	//   39   78:checkcast       #10  <Class ExoPlayerImpl$PlaybackInfoUpdate>
	//   40   81:invokevirtual   #324 <Method void ExoPlayerImpl$PlaybackInfoUpdate.notifyListeners()>

	//   41   84:aload_0         
	//   42   85:getfield        #200 <Field ArrayDeque pendingPlaybackInfoUpdates>
	//   43   88:invokevirtual   #327 <Method Object ArrayDeque.removeFirst()>
	//   44   91:pop             
	//*  45   92:goto            61
	//   46   95:return          
	}

	public void addListener(Player.EventListener eventlistener)
	{
		listeners.add(((Object) (eventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #333 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public transient void blockingSendMessages(ExoPlayer.ExoPlayerMessage aexoplayermessage[])
	{
		boolean flag;
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #339 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #340 <Method void ArrayList()>
	//    3    7:astore          4
		int j = aexoplayermessage.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_2         
	//*  10   15:iload_3         
	//*  11   16:icmpge          67
		{
			ExoPlayer.ExoPlayerMessage exoplayermessage = aexoplayermessage[i];
	//   12   19:aload_1         
	//   13   20:iload_2         
	//   14   21:aaload          
	//   15   22:astore          5
			((List) (arraylist)).add(((Object) (createMessage(exoplayermessage.target).setType(exoplayermessage.messageType).setPayload(exoplayermessage.message).send())));
	//   16   24:aload           4
	//   17   26:aload_0         
	//   18   27:aload           5
	//   19   29:getfield        #346 <Field PlayerMessage$Target ExoPlayer$ExoPlayerMessage.target>
	//   20   32:invokevirtual   #350 <Method PlayerMessage createMessage(PlayerMessage$Target)>
	//   21   35:aload           5
	//   22   37:getfield        #353 <Field int ExoPlayer$ExoPlayerMessage.messageType>
	//   23   40:invokevirtual   #359 <Method PlayerMessage PlayerMessage.setType(int)>
	//   24   43:aload           5
	//   25   45:getfield        #362 <Field Object ExoPlayer$ExoPlayerMessage.message>
	//   26   48:invokevirtual   #366 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   27   51:invokevirtual   #370 <Method PlayerMessage PlayerMessage.send()>
	//   28   54:invokeinterface #373 <Method boolean List.add(Object)>
	//   29   59:pop             
		}

	//   30   60:iload_2         
	//   31   61:iconst_1        
	//   32   62:iadd            
	//   33   63:istore_2        
	//*  34   64:goto            14
		aexoplayermessage = ((ExoPlayer.ExoPlayerMessage []) (((List) (arraylist)).iterator()));
	//   35   67:aload           4
	//   36   69:invokeinterface #377 <Method Iterator List.iterator()>
	//   37   74:astore_1        
		flag = false;
	//   38   75:iconst_0        
	//   39   76:istore_2        
_L4:
		if(!((Iterator) (aexoplayermessage)).hasNext()) goto _L2; else goto _L1
	//   40   77:aload_1         
	//   41   78:invokeinterface #382 <Method boolean Iterator.hasNext()>
	//   42   83:ifeq            122
_L1:
		boolean flag1;
		PlayerMessage playermessage;
		playermessage = (PlayerMessage)((Iterator) (aexoplayermessage)).next();
	//   43   86:aload_1         
	//   44   87:invokeinterface #385 <Method Object Iterator.next()>
	//   45   92:checkcast       #355 <Class PlayerMessage>
	//   46   95:astore          4
		flag1 = true;
	//   47   97:iconst_1        
	//   48   98:istore_3        
_L5:
		if(!flag1) goto _L4; else goto _L3
	//   49   99:iload_3         
	//   50  100:ifeq            119
_L3:
		playermessage.blockUntilDelivered();
	//   51  103:aload           4
	//   52  105:invokevirtual   #388 <Method boolean PlayerMessage.blockUntilDelivered()>
	//   53  108:pop             
		flag1 = false;
	//   54  109:iconst_0        
	//   55  110:istore_3        
		  goto _L5
	//*  56  111:goto            99
_L6:
		flag = true;
	//   57  114:iconst_1        
	//   58  115:istore_2        
		  goto _L5
		  goto _L4
	//*  59  116:goto            99
	//*  60  119:goto            77
_L2:
		if(flag)
	//*  61  122:iload_2         
	//*  62  123:ifeq            132
			Thread.currentThread().interrupt();
	//   63  126:invokestatic    #394 <Method Thread Thread.currentThread()>
	//   64  129:invokevirtual   #397 <Method void Thread.interrupt()>
		return;
	//   65  132:return          
		InterruptedException interruptedexception;
		interruptedexception;
	//   66  133:astore          5
		  goto _L6
	//*  67  135:goto            114
	}

	public PlayerMessage createMessage(PlayerMessage.Target target)
	{
		return new PlayerMessage(((PlayerMessage.Sender) (internalPlayer)), target, playbackInfo.timeline, getCurrentWindowIndex(), internalPlayerHandler);
	//    0    0:new             #355 <Class PlayerMessage>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    7   13:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//   10   20:aload_0         
	//   11   21:getfield        #217 <Field Handler internalPlayerHandler>
	//   12   24:invokespecial   #400 <Method void PlayerMessage(PlayerMessage$Sender, PlayerMessage$Target, Timeline, int, Handler)>
	//   13   27:areturn         
	}

	public int getBufferedPercentage()
	{
		long l = getBufferedPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #404 <Method long getBufferedPosition()>
	//    2    4:lstore_2        
		long l1 = getDuration();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #407 <Method long getDuration()>
	//    5    9:lstore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		if(l != 0x1L)
	//*   8   13:lload_2         
	//*   9   14:ldc2w           #269 <Long 0x1L>
	//*  10   17:lcmp            
	//*  11   18:ifeq            58
		{
			if(l1 == 0x1L)
	//*  12   21:lload           4
	//*  13   23:ldc2w           #269 <Long 0x1L>
	//*  14   26:lcmp            
	//*  15   27:ifne            32
				return 0;
	//   16   30:iconst_0        
	//   17   31:ireturn         
			if(l1 == 0L)
	//*  18   32:lload           4
	//*  19   34:lconst_0        
	//*  20   35:lcmp            
	//*  21   36:ifne            42
				return 100;
	//   22   39:bipush          100
	//   23   41:ireturn         
			i = Util.constrainValue((int)((l * 100L) / l1), 0, 100);
	//   24   42:lload_2         
	//   25   43:ldc2w           #408 <Long 100L>
	//   26   46:lmul            
	//   27   47:lload           4
	//   28   49:ldiv            
	//   29   50:l2i             
	//   30   51:iconst_0        
	//   31   52:bipush          100
	//   32   54:invokestatic    #413 <Method int Util.constrainValue(int, int, int)>
	//   33   57:istore_1        
		}
		return i;
	//   34   58:iload_1         
	//   35   59:ireturn         
	}

	public long getBufferedPosition()
	{
		if(shouldMaskPosition())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #415 <Method boolean shouldMaskPosition()>
	//*   2    4:ifeq            12
			return maskingWindowPositionMs;
	//    3    7:aload_0         
	//    4    8:getfield        #227 <Field long maskingWindowPositionMs>
	//    5   11:lreturn         
		else
			return playbackInfoPositionUsToWindowPositionMs(playbackInfo.bufferedPositionUs);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    9   17:getfield        #418 <Field long PlaybackInfo.bufferedPositionUs>
	//   10   20:invokespecial   #420 <Method long playbackInfoPositionUsToWindowPositionMs(long)>
	//   11   23:lreturn         
	}

	public long getContentPosition()
	{
		if(isPlayingAd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #424 <Method boolean isPlayingAd()>
	//*   2    4:ifeq            51
		{
			playbackInfo.timeline.getPeriod(playbackInfo.periodId.periodIndex, period);
	//    3    7:aload_0         
	//    4    8:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    5   11:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    6   14:aload_0         
	//    7   15:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    8   18:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//    9   21:getfield        #301 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   10   24:aload_0         
	//   11   25:getfield        #156 <Field Timeline$Period period>
	//   12   28:invokevirtual   #305 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   13   31:pop             
			return period.getPositionInWindowMs() + C.usToMs(playbackInfo.contentPositionUs);
	//   14   32:aload_0         
	//   15   33:getfield        #156 <Field Timeline$Period period>
	//   16   36:invokevirtual   #308 <Method long Timeline$Period.getPositionInWindowMs()>
	//   17   39:aload_0         
	//   18   40:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   19   43:getfield        #255 <Field long PlaybackInfo.contentPositionUs>
	//   20   46:invokestatic    #293 <Method long C.usToMs(long)>
	//   21   49:ladd            
	//   22   50:lreturn         
		} else
		{
			return getCurrentPosition();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #238 <Method long getCurrentPosition()>
	//   25   55:lreturn         
		}
	}

	public int getCurrentAdGroupIndex()
	{
		if(isPlayingAd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #424 <Method boolean isPlayingAd()>
	//*   2    4:ifeq            18
			return playbackInfo.periodId.adGroupIndex;
	//    3    7:aload_0         
	//    4    8:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    5   11:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//    6   14:getfield        #428 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//    7   17:ireturn         
		else
			return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
	}

	public int getCurrentAdIndexInAdGroup()
	{
		if(isPlayingAd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #424 <Method boolean isPlayingAd()>
	//*   2    4:ifeq            18
			return playbackInfo.periodId.adIndexInAdGroup;
	//    3    7:aload_0         
	//    4    8:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    5   11:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//    6   14:getfield        #432 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//    7   17:ireturn         
		else
			return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
	}

	public Object getCurrentManifest()
	{
		return playbackInfo.manifest;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #245 <Field Object PlaybackInfo.manifest>
	//    3    7:areturn         
	}

	public int getCurrentPeriodIndex()
	{
		if(shouldMaskPosition())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #415 <Method boolean shouldMaskPosition()>
	//*   2    4:ifeq            12
			return maskingPeriodIndex;
	//    3    7:aload_0         
	//    4    8:getfield        #225 <Field int maskingPeriodIndex>
	//    5   11:ireturn         
		else
			return playbackInfo.periodId.periodIndex;
	//    6   12:aload_0         
	//    7   13:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    8   16:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//    9   19:getfield        #301 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   10   22:ireturn         
	}

	public long getCurrentPosition()
	{
		if(shouldMaskPosition())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #415 <Method boolean shouldMaskPosition()>
	//*   2    4:ifeq            12
			return maskingWindowPositionMs;
	//    3    7:aload_0         
	//    4    8:getfield        #227 <Field long maskingWindowPositionMs>
	//    5   11:lreturn         
		else
			return playbackInfoPositionUsToWindowPositionMs(playbackInfo.positionUs);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    9   17:getfield        #436 <Field long PlaybackInfo.positionUs>
	//   10   20:invokespecial   #420 <Method long playbackInfoPositionUsToWindowPositionMs(long)>
	//   11   23:lreturn         
	}

	public Object getCurrentTag()
	{
		int i = getCurrentWindowIndex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//    2    4:istore_1        
		if(i > playbackInfo.timeline.getWindowCount())
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #195 <Field PlaybackInfo playbackInfo>
	//*   6   10:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//*   7   13:invokevirtual   #440 <Method int Timeline.getWindowCount()>
	//*   8   16:icmple          21
			return ((Object) (null));
	//    9   19:aconst_null     
	//   10   20:areturn         
		else
			return playbackInfo.timeline.getWindow(i, window, true).tag;
	//   11   21:aload_0         
	//   12   22:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   13   25:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//   14   28:iload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #151 <Field Timeline$Window window>
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #444 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window, boolean)>
	//   19   37:getfield        #447 <Field Object Timeline$Window.tag>
	//   20   40:areturn         
	}

	public Timeline getCurrentTimeline()
	{
		return playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:areturn         
	}

	public TrackGroupArray getCurrentTrackGroups()
	{
		return playbackInfo.trackGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #258 <Field TrackGroupArray PlaybackInfo.trackGroups>
	//    3    7:areturn         
	}

	public TrackSelectionArray getCurrentTrackSelections()
	{
		return playbackInfo.trackSelectorResult.selections;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #261 <Field TrackSelectorResult PlaybackInfo.trackSelectorResult>
	//    3    7:getfield        #457 <Field TrackSelectionArray TrackSelectorResult.selections>
	//    4   10:areturn         
	}

	public int getCurrentWindowIndex()
	{
		if(shouldMaskPosition())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #415 <Method boolean shouldMaskPosition()>
	//*   2    4:ifeq            12
			return maskingWindowIndex;
	//    3    7:aload_0         
	//    4    8:getfield        #223 <Field int maskingWindowIndex>
	//    5   11:ireturn         
		else
			return playbackInfo.timeline.getPeriod(playbackInfo.periodId.periodIndex, period).windowIndex;
	//    6   12:aload_0         
	//    7   13:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    8   16:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    9   19:aload_0         
	//   10   20:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   11   23:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   12   26:getfield        #301 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   13   29:aload_0         
	//   14   30:getfield        #156 <Field Timeline$Period period>
	//   15   33:invokevirtual   #305 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   16   36:getfield        #460 <Field int Timeline$Period.windowIndex>
	//   17   39:ireturn         
	}

	public long getDuration()
	{
		Timeline timeline = playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore_1        
		if(timeline.isEmpty())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//*   6   12:ifeq            19
			return 0x1L;
	//    7   15:ldc2w           #269 <Long 0x1L>
	//    8   18:lreturn         
		if(isPlayingAd())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #424 <Method boolean isPlayingAd()>
	//*  11   23:ifeq            66
		{
			com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid = playbackInfo.periodId;
	//   12   26:aload_0         
	//   13   27:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   14   30:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//   15   33:astore_2        
			timeline.getPeriod(mediaperiodid.periodIndex, period);
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:getfield        #301 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   19   39:aload_0         
	//   20   40:getfield        #156 <Field Timeline$Period period>
	//   21   43:invokevirtual   #305 <Method Timeline$Period Timeline.getPeriod(int, Timeline$Period)>
	//   22   46:pop             
			return C.usToMs(period.getAdDurationUs(mediaperiodid.adGroupIndex, mediaperiodid.adIndexInAdGroup));
	//   23   47:aload_0         
	//   24   48:getfield        #156 <Field Timeline$Period period>
	//   25   51:aload_2         
	//   26   52:getfield        #428 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//   27   55:aload_2         
	//   28   56:getfield        #432 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//   29   59:invokevirtual   #464 <Method long Timeline$Period.getAdDurationUs(int, int)>
	//   30   62:invokestatic    #293 <Method long C.usToMs(long)>
	//   31   65:lreturn         
		} else
		{
			return timeline.getWindow(getCurrentWindowIndex(), window).getDurationMs();
	//   32   66:aload_1         
	//   33   67:aload_0         
	//   34   68:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//   35   71:aload_0         
	//   36   72:getfield        #151 <Field Timeline$Window window>
	//   37   75:invokevirtual   #467 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window)>
	//   38   78:invokevirtual   #470 <Method long Timeline$Window.getDurationMs()>
	//   39   81:lreturn         
		}
	}

	public int getNextWindowIndex()
	{
		Timeline timeline = playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore_1        
		if(timeline.isEmpty())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//*   6   12:ifeq            17
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
		else
			return timeline.getNextWindowIndex(getCurrentWindowIndex(), repeatMode, shuffleModeEnabled);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//   12   22:aload_0         
	//   13   23:getfield        #128 <Field int repeatMode>
	//   14   26:aload_0         
	//   15   27:getfield        #130 <Field boolean shuffleModeEnabled>
	//   16   30:invokevirtual   #474 <Method int Timeline.getNextWindowIndex(int, int, boolean)>
	//   17   33:ireturn         
	}

	public boolean getPlayWhenReady()
	{
		return playWhenReady;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field boolean playWhenReady>
	//    2    4:ireturn         
	}

	public ExoPlaybackException getPlaybackError()
	{
		return playbackError;
	//    0    0:aload_0         
	//    1    1:getfield        #479 <Field ExoPlaybackException playbackError>
	//    2    4:areturn         
	}

	public Looper getPlaybackLooper()
	{
		return internalPlayer.getPlaybackLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:invokevirtual   #212 <Method Looper ExoPlayerImplInternal.getPlaybackLooper()>
	//    3    7:areturn         
	}

	public PlaybackParameters getPlaybackParameters()
	{
		return playbackParameters;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field PlaybackParameters playbackParameters>
	//    2    4:areturn         
	}

	public int getPlaybackState()
	{
		return playbackInfo.playbackState;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #485 <Field int PlaybackInfo.playbackState>
	//    3    7:ireturn         
	}

	public int getPreviousWindowIndex()
	{
		Timeline timeline = playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore_1        
		if(timeline.isEmpty())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//*   6   12:ifeq            17
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
		else
			return timeline.getPreviousWindowIndex(getCurrentWindowIndex(), repeatMode, shuffleModeEnabled);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//   12   22:aload_0         
	//   13   23:getfield        #128 <Field int repeatMode>
	//   14   26:aload_0         
	//   15   27:getfield        #130 <Field boolean shuffleModeEnabled>
	//   16   30:invokevirtual   #488 <Method int Timeline.getPreviousWindowIndex(int, int, boolean)>
	//   17   33:ireturn         
	}

	public int getRendererCount()
	{
		return renderers.length;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Renderer[] renderers>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int getRendererType(int i)
	{
		return renderers[i].getTrackType();
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Renderer[] renderers>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:invokeinterface #496 <Method int Renderer.getTrackType()>
	//    5   11:ireturn         
	}

	public int getRepeatMode()
	{
		return repeatMode;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int repeatMode>
	//    2    4:ireturn         
	}

	public boolean getShuffleModeEnabled()
	{
		return shuffleModeEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field boolean shuffleModeEnabled>
	//    2    4:ireturn         
	}

	public Player.TextComponent getTextComponent()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Player.VideoComponent getVideoComponent()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	void handleEvent(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #509 <Field int Message.what>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 153
	//	               1 91
	//	               2 40
		default:
			throw new IllegalStateException();
	//    3   32:new             #511 <Class IllegalStateException>
	//    4   35:dup             
	//    5   36:invokespecial   #512 <Method void IllegalStateException()>
	//    6   39:athrow          

		case 2: // '\002'
			message = ((Message) ((ExoPlaybackException)message.obj));
	//    7   40:aload_1         
	//    8   41:getfield        #515 <Field Object Message.obj>
	//    9   44:checkcast       #517 <Class ExoPlaybackException>
	//   10   47:astore_1        
			playbackError = ((ExoPlaybackException) (message));
	//   11   48:aload_0         
	//   12   49:aload_1         
	//   13   50:putfield        #479 <Field ExoPlaybackException playbackError>
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Player.EventListener)iterator.next()).onPlayerError(((ExoPlaybackException) (message))));
	//   14   53:aload_0         
	//   15   54:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//   16   57:invokevirtual   #518 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   17   60:astore          4
	//   18   62:aload           4
	//   19   64:invokeinterface #382 <Method boolean Iterator.hasNext()>
	//   20   69:ifeq            194
	//   21   72:aload           4
	//   22   74:invokeinterface #385 <Method Object Iterator.next()>
	//   23   79:checkcast       #520 <Class Player$EventListener>
	//   24   82:aload_1         
	//   25   83:invokeinterface #524 <Method void Player$EventListener.onPlayerError(ExoPlaybackException)>
			break;
	//   26   88:goto            62

		case 1: // '\001'
			message = ((Message) ((PlaybackParameters)message.obj));
	//   27   91:aload_1         
	//   28   92:getfield        #515 <Field Object Message.obj>
	//   29   95:checkcast       #158 <Class PlaybackParameters>
	//   30   98:astore_1        
			if(playbackParameters.equals(((Object) (message))))
				break;
	//   31   99:aload_0         
	//   32  100:getfield        #163 <Field PlaybackParameters playbackParameters>
	//   33  103:aload_1         
	//   34  104:invokevirtual   #527 <Method boolean PlaybackParameters.equals(Object)>
	//   35  107:ifne            194
			playbackParameters = ((PlaybackParameters) (message));
	//   36  110:aload_0         
	//   37  111:aload_1         
	//   38  112:putfield        #163 <Field PlaybackParameters playbackParameters>
			for(Iterator iterator1 = listeners.iterator(); iterator1.hasNext(); ((Player.EventListener)iterator1.next()).onPlaybackParametersChanged(((PlaybackParameters) (message))));
	//   39  115:aload_0         
	//   40  116:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//   41  119:invokevirtual   #518 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   42  122:astore          4
	//   43  124:aload           4
	//   44  126:invokeinterface #382 <Method boolean Iterator.hasNext()>
	//   45  131:ifeq            194
	//   46  134:aload           4
	//   47  136:invokeinterface #385 <Method Object Iterator.next()>
	//   48  141:checkcast       #520 <Class Player$EventListener>
	//   49  144:aload_1         
	//   50  145:invokeinterface #531 <Method void Player$EventListener.onPlaybackParametersChanged(PlaybackParameters)>
			break;
	//   51  150:goto            124

		case 0: // '\0'
			PlaybackInfo playbackinfo = (PlaybackInfo)message.obj;
	//   52  153:aload_1         
	//   53  154:getfield        #515 <Field Object Message.obj>
	//   54  157:checkcast       #179 <Class PlaybackInfo>
	//   55  160:astore          4
			int i = message.arg1;
	//   56  162:aload_1         
	//   57  163:getfield        #534 <Field int Message.arg1>
	//   58  166:istore_2        
			boolean flag;
			if(message.arg2 != -1)
	//*  59  167:aload_1         
	//*  60  168:getfield        #537 <Field int Message.arg2>
	//*  61  171:iconst_m1       
	//*  62  172:icmpeq          180
				flag = true;
	//   63  175:iconst_1        
	//   64  176:istore_3        
			else
	//*  65  177:goto            182
				flag = false;
	//   66  180:iconst_0        
	//   67  181:istore_3        
			handlePlaybackInfo(playbackinfo, i, flag, message.arg2);
	//   68  182:aload_0         
	//   69  183:aload           4
	//   70  185:iload_2         
	//   71  186:iload_3         
	//   72  187:aload_1         
	//   73  188:getfield        #537 <Field int Message.arg2>
	//   74  191:invokespecial   #539 <Method void handlePlaybackInfo(PlaybackInfo, int, boolean, int)>
			break;
		}
	//   75  194:return          
	}

	public boolean isCurrentWindowDynamic()
	{
		Timeline timeline = playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore_1        
		return !timeline.isEmpty() && timeline.getWindow(getCurrentWindowIndex(), window).isDynamic;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//    6   12:ifne            35
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//   10   20:aload_0         
	//   11   21:getfield        #151 <Field Timeline$Window window>
	//   12   24:invokevirtual   #467 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window)>
	//   13   27:getfield        #543 <Field boolean Timeline$Window.isDynamic>
	//   14   30:ifeq            35
	//   15   33:iconst_1        
	//   16   34:ireturn         
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	public boolean isCurrentWindowSeekable()
	{
		Timeline timeline = playbackInfo.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore_1        
		return !timeline.isEmpty() && timeline.getWindow(getCurrentWindowIndex(), window).isSeekable;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//    6   12:ifne            35
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//   10   20:aload_0         
	//   11   21:getfield        #151 <Field Timeline$Window window>
	//   12   24:invokevirtual   #467 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window)>
	//   13   27:getfield        #547 <Field boolean Timeline$Window.isSeekable>
	//   14   30:ifeq            35
	//   15   33:iconst_1        
	//   16   34:ireturn         
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	public boolean isLoading()
	{
		return playbackInfo.isLoading;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #550 <Field boolean PlaybackInfo.isLoading>
	//    3    7:ireturn         
	}

	public boolean isPlayingAd()
	{
		return !shouldMaskPosition() && playbackInfo.periodId.isAd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #415 <Method boolean shouldMaskPosition()>
	//    2    4:ifne            22
	//    3    7:aload_0         
	//    4    8:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    5   11:getfield        #249 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId PlaybackInfo.periodId>
	//    6   14:invokevirtual   #298 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public void prepare(MediaSource mediasource)
	{
		prepare(mediasource, true, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #555 <Method void prepare(MediaSource, boolean, boolean)>
	//    5    7:return          
	}

	public void prepare(MediaSource mediasource, boolean flag, boolean flag1)
	{
		playbackError = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #479 <Field ExoPlaybackException playbackError>
		PlaybackInfo playbackinfo = getResetPlaybackInfo(flag, flag1, 2);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iconst_2        
	//    7    9:invokespecial   #557 <Method PlaybackInfo getResetPlaybackInfo(boolean, boolean, int)>
	//    8   12:astore          4
		hasPendingPrepare = true;
	//    9   14:aload_0         
	//   10   15:iconst_1        
	//   11   16:putfield        #280 <Field boolean hasPendingPrepare>
		pendingOperationAcks = pendingOperationAcks + 1;
	//   12   19:aload_0         
	//   13   20:aload_0         
	//   14   21:getfield        #268 <Field int pendingOperationAcks>
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:putfield        #268 <Field int pendingOperationAcks>
		internalPlayer.prepare(mediasource, flag, flag1);
	//   18   29:aload_0         
	//   19   30:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//   20   33:aload_1         
	//   21   34:iload_2         
	//   22   35:iload_3         
	//   23   36:invokevirtual   #558 <Method void ExoPlayerImplInternal.prepare(MediaSource, boolean, boolean)>
		updatePlaybackInfo(playbackinfo, false, 4, 1, false, false);
	//   24   39:aload_0         
	//   25   40:aload           4
	//   26   42:iconst_0        
	//   27   43:iconst_4        
	//   28   44:iconst_1        
	//   29   45:iconst_0        
	//   30   46:iconst_0        
	//   31   47:invokespecial   #286 <Method void updatePlaybackInfo(PlaybackInfo, boolean, int, int, boolean, boolean)>
	//   32   50:return          
	}

	public void release()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #65  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Release ");
	//    4    8:aload_1         
	//    5    9:ldc2            #561 <String "Release ">
	//    6   12:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokestatic    #78  <Method int System.identityHashCode(Object)>
	//   11   21:invokestatic    #84  <Method String Integer.toHexString(int)>
	//   12   24:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(" [");
	//   14   28:aload_1         
	//   15   29:ldc1            #86  <String " [">
	//   16   31:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		stringbuilder.append("ExoPlayerLib/2.8.3");
	//   18   35:aload_1         
	//   19   36:ldc1            #88  <String "ExoPlayerLib/2.8.3">
	//   20   38:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append("] [");
	//   22   42:aload_1         
	//   23   43:ldc1            #90  <String "] [">
	//   24   45:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
		stringbuilder.append(Util.DEVICE_DEBUG_INFO);
	//   26   49:aload_1         
	//   27   50:getstatic       #95  <Field String Util.DEVICE_DEBUG_INFO>
	//   28   53:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		stringbuilder.append("] [");
	//   30   57:aload_1         
	//   31   58:ldc1            #90  <String "] [">
	//   32   60:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
		stringbuilder.append(ExoPlayerLibraryInfo.registeredModules());
	//   34   64:aload_1         
	//   35   65:invokestatic    #566 <Method String ExoPlayerLibraryInfo.registeredModules()>
	//   36   68:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append("]");
	//   38   72:aload_1         
	//   39   73:ldc1            #97  <String "]">
	//   40   75:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   41   78:pop             
		Log.i("ExoPlayerImpl", stringbuilder.toString());
	//   42   79:ldc1            #15  <String "ExoPlayerImpl">
	//   43   81:aload_1         
	//   44   82:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   45   85:invokestatic    #107 <Method int Log.i(String, String)>
	//   46   88:pop             
		internalPlayer.release();
	//   47   89:aload_0         
	//   48   90:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//   49   93:invokevirtual   #568 <Method void ExoPlayerImplInternal.release()>
		eventHandler.removeCallbacksAndMessages(((Object) (null)));
	//   50   96:aload_0         
	//   51   97:getfield        #177 <Field Handler eventHandler>
	//   52  100:aconst_null     
	//   53  101:invokevirtual   #571 <Method void Handler.removeCallbacksAndMessages(Object)>
	//   54  104:return          
	}

	public void removeListener(Player.EventListener eventlistener)
	{
		listeners.remove(((Object) (eventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #575 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void seekTo(int i, long l)
	{
		Object obj = ((Object) (playbackInfo.timeline));
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field PlaybackInfo playbackInfo>
	//    2    4:getfield        #241 <Field Timeline PlaybackInfo.timeline>
	//    3    7:astore          6
		if(i >= 0 && (((Timeline) (obj)).isEmpty() || i < ((Timeline) (obj)).getWindowCount()))
	//*   4    9:iload_1         
	//*   5   10:iflt            256
	//*   6   13:aload           6
	//*   7   15:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//*   8   18:ifne            33
	//*   9   21:iload_1         
	//*  10   22:aload           6
	//*  11   24:invokevirtual   #440 <Method int Timeline.getWindowCount()>
	//*  12   27:icmplt          33
	//*  13   30:goto            256
		{
			hasPendingSeek = true;
	//   14   33:aload_0         
	//   15   34:iconst_1        
	//   16   35:putfield        #282 <Field boolean hasPendingSeek>
			pendingOperationAcks = pendingOperationAcks + 1;
	//   17   38:aload_0         
	//   18   39:aload_0         
	//   19   40:getfield        #268 <Field int pendingOperationAcks>
	//   20   43:iconst_1        
	//   21   44:iadd            
	//   22   45:putfield        #268 <Field int pendingOperationAcks>
			if(isPlayingAd())
	//*  23   48:aload_0         
	//*  24   49:invokevirtual   #424 <Method boolean isPlayingAd()>
	//*  25   52:ifeq            82
			{
				Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
	//   26   55:ldc1            #15  <String "ExoPlayerImpl">
	//   27   57:ldc2            #579 <String "seekTo ignored because an ad is playing">
	//   28   60:invokestatic    #582 <Method int Log.w(String, String)>
	//   29   63:pop             
				eventHandler.obtainMessage(0, 1, -1, ((Object) (playbackInfo))).sendToTarget();
	//   30   64:aload_0         
	//   31   65:getfield        #177 <Field Handler eventHandler>
	//   32   68:iconst_0        
	//   33   69:iconst_1        
	//   34   70:iconst_m1       
	//   35   71:aload_0         
	//   36   72:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   37   75:invokevirtual   #586 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   38   78:invokevirtual   #589 <Method void Message.sendToTarget()>
				return;
	//   39   81:return          
			}
			maskingWindowIndex = i;
	//   40   82:aload_0         
	//   41   83:iload_1         
	//   42   84:putfield        #223 <Field int maskingWindowIndex>
			if(((Timeline) (obj)).isEmpty())
	//*  43   87:aload           6
	//*  44   89:invokevirtual   #278 <Method boolean Timeline.isEmpty()>
	//*  45   92:ifeq            126
			{
				long l1;
				if(l == 0x1L)
	//*  46   95:lload_2         
	//*  47   96:ldc2w           #269 <Long 0x1L>
	//*  48   99:lcmp            
	//*  49  100:ifne            109
					l1 = 0L;
	//   50  103:lconst_0        
	//   51  104:lstore          4
				else
	//*  52  106:goto            112
					l1 = l;
	//   53  109:lload_2         
	//   54  110:lstore          4
				maskingWindowPositionMs = l1;
	//   55  112:aload_0         
	//   56  113:lload           4
	//   57  115:putfield        #227 <Field long maskingWindowPositionMs>
				maskingPeriodIndex = 0;
	//   58  118:aload_0         
	//   59  119:iconst_0        
	//   60  120:putfield        #225 <Field int maskingPeriodIndex>
			} else
	//*  61  123:goto            203
			{
				long l2;
				if(l == 0x1L)
	//*  62  126:lload_2         
	//*  63  127:ldc2w           #269 <Long 0x1L>
	//*  64  130:lcmp            
	//*  65  131:ifne            152
					l2 = ((Timeline) (obj)).getWindow(i, window).getDefaultPositionUs();
	//   66  134:aload           6
	//   67  136:iload_1         
	//   68  137:aload_0         
	//   69  138:getfield        #151 <Field Timeline$Window window>
	//   70  141:invokevirtual   #467 <Method Timeline$Window Timeline.getWindow(int, Timeline$Window)>
	//   71  144:invokevirtual   #592 <Method long Timeline$Window.getDefaultPositionUs()>
	//   72  147:lstore          4
				else
	//*  73  149:goto            161
					l2 = C.msToUs(l);
	//   74  152:lload_2         
	//   75  153:invokestatic    #595 <Method long C.msToUs(long)>
	//   76  156:lstore          4
	//*  77  158:goto            149
				Pair pair = ((Timeline) (obj)).getPeriodPosition(window, period, i, l2);
	//   78  161:aload           6
	//   79  163:aload_0         
	//   80  164:getfield        #151 <Field Timeline$Window window>
	//   81  167:aload_0         
	//   82  168:getfield        #156 <Field Timeline$Period period>
	//   83  171:iload_1         
	//   84  172:lload           4
	//   85  174:invokevirtual   #599 <Method Pair Timeline.getPeriodPosition(Timeline$Window, Timeline$Period, int, long)>
	//   86  177:astore          7
				maskingWindowPositionMs = C.usToMs(l2);
	//   87  179:aload_0         
	//   88  180:lload           4
	//   89  182:invokestatic    #293 <Method long C.usToMs(long)>
	//   90  185:putfield        #227 <Field long maskingWindowPositionMs>
				maskingPeriodIndex = ((Integer)pair.first).intValue();
	//   91  188:aload_0         
	//   92  189:aload           7
	//   93  191:getfield        #604 <Field Object Pair.first>
	//   94  194:checkcast       #80  <Class Integer>
	//   95  197:invokevirtual   #607 <Method int Integer.intValue()>
	//   96  200:putfield        #225 <Field int maskingPeriodIndex>
			}
			internalPlayer.seekTo(((Timeline) (obj)), i, C.msToUs(l));
	//   97  203:aload_0         
	//   98  204:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//   99  207:aload           6
	//  100  209:iload_1         
	//  101  210:lload_2         
	//  102  211:invokestatic    #595 <Method long C.msToUs(long)>
	//  103  214:invokevirtual   #610 <Method void ExoPlayerImplInternal.seekTo(Timeline, int, long)>
			for(obj = ((Object) (listeners.iterator())); ((Iterator) (obj)).hasNext(); ((Player.EventListener)((Iterator) (obj)).next()).onPositionDiscontinuity(1));
	//  104  217:aload_0         
	//  105  218:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//  106  221:invokevirtual   #518 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  107  224:astore          6
	//  108  226:aload           6
	//  109  228:invokeinterface #382 <Method boolean Iterator.hasNext()>
	//  110  233:ifeq            255
	//  111  236:aload           6
	//  112  238:invokeinterface #385 <Method Object Iterator.next()>
	//  113  243:checkcast       #520 <Class Player$EventListener>
	//  114  246:iconst_1        
	//  115  247:invokeinterface #614 <Method void Player$EventListener.onPositionDiscontinuity(int)>
	//* 116  252:goto            226
			return;
	//  117  255:return          
		} else
		{
			throw new IllegalSeekPositionException(((Timeline) (obj)), i, l);
	//  118  256:new             #616 <Class IllegalSeekPositionException>
	//  119  259:dup             
	//  120  260:aload           6
	//  121  262:iload_1         
	//  122  263:lload_2         
	//  123  264:invokespecial   #618 <Method void IllegalSeekPositionException(Timeline, int, long)>
	//  124  267:athrow          
		}
	}

	public void seekTo(long l)
	{
		seekTo(getCurrentWindowIndex(), l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//    3    5:lload_1         
	//    4    6:invokevirtual   #621 <Method void seekTo(int, long)>
	//    5    9:return          
	}

	public void seekToDefaultPosition()
	{
		seekToDefaultPosition(getCurrentWindowIndex());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #231 <Method int getCurrentWindowIndex()>
	//    3    5:invokevirtual   #624 <Method void seekToDefaultPosition(int)>
	//    4    8:return          
	}

	public void seekToDefaultPosition(int i)
	{
		seekTo(i, 0x1L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2w           #269 <Long 0x1L>
	//    3    5:invokevirtual   #621 <Method void seekTo(int, long)>
	//    4    8:return          
	}

	public transient void sendMessages(ExoPlayer.ExoPlayerMessage aexoplayermessage[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = aexoplayermessage.length; i < j; i++)
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:istore_3        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          51
		{
			ExoPlayer.ExoPlayerMessage exoplayermessage = aexoplayermessage[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			createMessage(exoplayermessage.target).setType(exoplayermessage.messageType).setPayload(exoplayermessage.message).send();
	//   12   15:aload_0         
	//   13   16:aload           4
	//   14   18:getfield        #346 <Field PlayerMessage$Target ExoPlayer$ExoPlayerMessage.target>
	//   15   21:invokevirtual   #350 <Method PlayerMessage createMessage(PlayerMessage$Target)>
	//   16   24:aload           4
	//   17   26:getfield        #353 <Field int ExoPlayer$ExoPlayerMessage.messageType>
	//   18   29:invokevirtual   #359 <Method PlayerMessage PlayerMessage.setType(int)>
	//   19   32:aload           4
	//   20   34:getfield        #362 <Field Object ExoPlayer$ExoPlayerMessage.message>
	//   21   37:invokevirtual   #366 <Method PlayerMessage PlayerMessage.setPayload(Object)>
	//   22   40:invokevirtual   #370 <Method PlayerMessage PlayerMessage.send()>
	//   23   43:pop             
		}

	//   24   44:iload_2         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_2        
	//*  28   48:goto            5
	//   29   51:return          
	}

	public void setPlayWhenReady(boolean flag)
	{
		if(playWhenReady != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field boolean playWhenReady>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          34
		{
			playWhenReady = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #126 <Field boolean playWhenReady>
			internalPlayer.setPlayWhenReady(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #628 <Method void ExoPlayerImplInternal.setPlayWhenReady(boolean)>
			updatePlaybackInfo(playbackInfo, false, 4, 1, false, true);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #195 <Field PlaybackInfo playbackInfo>
	//   14   26:iconst_0        
	//   15   27:iconst_4        
	//   16   28:iconst_1        
	//   17   29:iconst_0        
	//   18   30:iconst_1        
	//   19   31:invokespecial   #286 <Method void updatePlaybackInfo(PlaybackInfo, boolean, int, int, boolean, boolean)>
		}
	//   20   34:return          
	}

	public void setPlaybackParameters(PlaybackParameters playbackparameters)
	{
		PlaybackParameters playbackparameters1 = playbackparameters;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(playbackparameters == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			playbackparameters1 = PlaybackParameters.DEFAULT;
	//    4    6:getstatic       #161 <Field PlaybackParameters PlaybackParameters.DEFAULT>
	//    5    9:astore_2        
		internalPlayer.setPlaybackParameters(playbackparameters1);
	//    6   10:aload_0         
	//    7   11:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #631 <Method void ExoPlayerImplInternal.setPlaybackParameters(PlaybackParameters)>
	//   10   18:return          
	}

	public void setRepeatMode(int i)
	{
		if(repeatMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field int repeatMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          56
		{
			repeatMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #128 <Field int repeatMode>
			internalPlayer.setRepeatMode(i);
	//    7   13:aload_0         
	//    8   14:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #635 <Method void ExoPlayerImplInternal.setRepeatMode(int)>
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Player.EventListener)iterator.next()).onRepeatModeChanged(i));
	//   11   21:aload_0         
	//   12   22:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//   13   25:invokevirtual   #518 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   14   28:astore_2        
	//   15   29:aload_2         
	//   16   30:invokeinterface #382 <Method boolean Iterator.hasNext()>
	//   17   35:ifeq            56
	//   18   38:aload_2         
	//   19   39:invokeinterface #385 <Method Object Iterator.next()>
	//   20   44:checkcast       #520 <Class Player$EventListener>
	//   21   47:iload_1         
	//   22   48:invokeinterface #638 <Method void Player$EventListener.onRepeatModeChanged(int)>
		}
	//*  23   53:goto            29
	//   24   56:return          
	}

	public void setSeekParameters(SeekParameters seekparameters)
	{
		SeekParameters seekparameters1 = seekparameters;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(seekparameters == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			seekparameters1 = SeekParameters.DEFAULT;
	//    4    6:getstatic       #645 <Field SeekParameters SeekParameters.DEFAULT>
	//    5    9:astore_2        
		internalPlayer.setSeekParameters(seekparameters1);
	//    6   10:aload_0         
	//    7   11:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #647 <Method void ExoPlayerImplInternal.setSeekParameters(SeekParameters)>
	//   10   18:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		if(shuffleModeEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field boolean shuffleModeEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          56
		{
			shuffleModeEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #130 <Field boolean shuffleModeEnabled>
			internalPlayer.setShuffleModeEnabled(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #650 <Method void ExoPlayerImplInternal.setShuffleModeEnabled(boolean)>
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Player.EventListener)iterator.next()).onShuffleModeEnabledChanged(flag));
	//   11   21:aload_0         
	//   12   22:getfield        #135 <Field CopyOnWriteArraySet listeners>
	//   13   25:invokevirtual   #518 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   14   28:astore_2        
	//   15   29:aload_2         
	//   16   30:invokeinterface #382 <Method boolean Iterator.hasNext()>
	//   17   35:ifeq            56
	//   18   38:aload_2         
	//   19   39:invokeinterface #385 <Method Object Iterator.next()>
	//   20   44:checkcast       #520 <Class Player$EventListener>
	//   21   47:iload_1         
	//   22   48:invokeinterface #653 <Method void Player$EventListener.onShuffleModeEnabledChanged(boolean)>
		}
	//*  23   53:goto            29
	//   24   56:return          
	}

	public void stop()
	{
		stop(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #656 <Method void stop(boolean)>
	//    3    5:return          
	}

	public void stop(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			playbackError = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #479 <Field ExoPlaybackException playbackError>
		PlaybackInfo playbackinfo = getResetPlaybackInfo(flag, flag, 1);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:invokespecial   #557 <Method PlaybackInfo getResetPlaybackInfo(boolean, boolean, int)>
	//   10   16:astore_2        
		pendingOperationAcks = pendingOperationAcks + 1;
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #268 <Field int pendingOperationAcks>
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:putfield        #268 <Field int pendingOperationAcks>
		internalPlayer.stop(flag);
	//   17   27:aload_0         
	//   18   28:getfield        #207 <Field ExoPlayerImplInternal internalPlayer>
	//   19   31:iload_1         
	//   20   32:invokevirtual   #657 <Method void ExoPlayerImplInternal.stop(boolean)>
		updatePlaybackInfo(playbackinfo, false, 4, 1, false, false);
	//   21   35:aload_0         
	//   22   36:aload_2         
	//   23   37:iconst_0        
	//   24   38:iconst_4        
	//   25   39:iconst_1        
	//   26   40:iconst_0        
	//   27   41:iconst_0        
	//   28   42:invokespecial   #286 <Method void updatePlaybackInfo(PlaybackInfo, boolean, int, int, boolean, boolean)>
	//   29   45:return          
	}

	private static final String TAG = "ExoPlayerImpl";
	private final TrackSelectorResult emptyTrackSelectorResult;
	private final Handler eventHandler;
	private boolean hasPendingPrepare;
	private boolean hasPendingSeek;
	private final ExoPlayerImplInternal internalPlayer;
	private final Handler internalPlayerHandler;
	private final CopyOnWriteArraySet listeners = new CopyOnWriteArraySet();
	private int maskingPeriodIndex;
	private int maskingWindowIndex;
	private long maskingWindowPositionMs;
	private int pendingOperationAcks;
	private final ArrayDeque pendingPlaybackInfoUpdates = new ArrayDeque();
	private final Timeline.Period period = new Timeline.Period();
	private boolean playWhenReady;
	private ExoPlaybackException playbackError;
	private PlaybackInfo playbackInfo;
	private PlaybackParameters playbackParameters;
	private final Renderer renderers[];
	private int repeatMode;
	private boolean shuffleModeEnabled;
	private final TrackSelector trackSelector;
	private final Timeline.Window window = new Timeline.Window();
}
