// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.chunk.ChunkSampleSource;
import com.google.android.exoplayer.dash.DashChunkSource;
import com.google.android.exoplayer.dash.DefaultDashTrackSelector;
import com.google.android.exoplayer.dash.mpd.*;
import com.google.android.exoplayer.drm.*;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextTrackRenderer;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.ManifestFetcher;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			DashRendererBuilder, ExoPlayerInterface

private static final class DashRendererBuilder$AsyncRendererBuilder
	implements com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback, com.google.android.exoplayer.dash.mpd.k
{

	private void buildRenderers()
	{
		Object obj = ((Object) (manifest.getPeriod(0)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field MediaPresentationDescription manifest>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #73  <Method Period MediaPresentationDescription.getPeriod(int)>
	//    4    8:astore          5
		Object obj1 = ((Object) (player.getMainHandler()));
	//    5   10:aload_0         
	//    6   11:getfield        #44  <Field ExoPlayerInterface player>
	//    7   14:invokevirtual   #79  <Method Handler ExoPlayerInterface.getMainHandler()>
	//    8   17:astore          7
		DefaultLoadControl defaultloadcontrol = new DefaultLoadControl(((com.google.android.exoplayer.upstream.Allocator) (new DefaultAllocator(0x10000))));
	//    9   19:new             #81  <Class DefaultLoadControl>
	//   10   22:dup             
	//   11   23:new             #83  <Class DefaultAllocator>
	//   12   26:dup             
	//   13   27:ldc1            #84  <Int 0x10000>
	//   14   29:invokespecial   #87  <Method void DefaultAllocator(int)>
	//   15   32:invokespecial   #90  <Method void DefaultLoadControl(com.google.android.exoplayer.upstream.Allocator)>
	//   16   35:astore          8
		DefaultBandwidthMeter defaultbandwidthmeter = new DefaultBandwidthMeter(((Handler) (obj1)), ((com.google.android.exoplayer.upstream.BandwidthMeter.EventListener) (player)));
	//   17   37:new             #92  <Class DefaultBandwidthMeter>
	//   18   40:dup             
	//   19   41:aload           7
	//   20   43:aload_0         
	//   21   44:getfield        #44  <Field ExoPlayerInterface player>
	//   22   47:invokespecial   #95  <Method void DefaultBandwidthMeter(Handler, com.google.android.exoplayer.upstream.BandwidthMeter$EventListener)>
	//   23   50:astore          6
		int i = 0;
	//   24   52:iconst_0        
	//   25   53:istore_1        
		int k;
		int l;
		for(k = i; i < ((Period) (obj)).adaptationSets.size(); k = l)
	//*  26   54:iload_1         
	//*  27   55:istore_2        
	//*  28   56:iload_1         
	//*  29   57:aload           5
	//*  30   59:getfield        #101 <Field List Period.adaptationSets>
	//*  31   62:invokeinterface #107 <Method int List.size()>
	//*  32   67:icmpge          114
		{
			AdaptationSet adaptationset = (AdaptationSet)((Period) (obj)).adaptationSets.get(i);
	//   33   70:aload           5
	//   34   72:getfield        #101 <Field List Period.adaptationSets>
	//   35   75:iload_1         
	//   36   76:invokeinterface #111 <Method Object List.get(int)>
	//   37   81:checkcast       #113 <Class AdaptationSet>
	//   38   84:astore          9
			l = k;
	//   39   86:iload_2         
	//   40   87:istore_3        
			if(adaptationset.type != -1)
	//*  41   88:aload           9
	//*  42   90:getfield        #117 <Field int AdaptationSet.type>
	//*  43   93:iconst_m1       
	//*  44   94:icmpeq          105
				l = k | adaptationset.hasContentProtection();
	//   45   97:iload_2         
	//   46   98:aload           9
	//   47  100:invokevirtual   #121 <Method boolean AdaptationSet.hasContentProtection()>
	//   48  103:ior             
	//   49  104:istore_3        
			i++;
	//   50  105:iload_1         
	//   51  106:iconst_1        
	//   52  107:iadd            
	//   53  108:istore_1        
		}

	//   54  109:iload_3         
	//   55  110:istore_2        
	//*  56  111:goto            56
		obj = null;
	//   57  114:aconst_null     
	//   58  115:astore          5
		boolean flag;
		if(k != 0)
	//*  59  117:iload_2         
	//*  60  118:ifeq            208
		{
			if(Util.SDK_INT < 18)
	//*  61  121:getstatic       #126 <Field int Util.SDK_INT>
	//*  62  124:bipush          18
	//*  63  126:icmpge          145
			{
				player.onRenderersError(((Exception) (new UnsupportedDrmException(1))));
	//   64  129:aload_0         
	//   65  130:getfield        #44  <Field ExoPlayerInterface player>
	//   66  133:new             #65  <Class UnsupportedDrmException>
	//   67  136:dup             
	//   68  137:iconst_1        
	//   69  138:invokespecial   #127 <Method void UnsupportedDrmException(int)>
	//   70  141:invokevirtual   #131 <Method void ExoPlayerInterface.onRenderersError(Exception)>
				return;
	//   71  144:return          
			}
			int j;
			try
			{
				obj = ((Object) (StreamingDrmSessionManager.newWidevineInstance(player.getPlaybackLooper(), drmCallback, ((java.util.HashMap) (null)), player.getMainHandler(), ((com.google.android.exoplayer.drm.StreamingDrmSessionManager$EventListener) (player)))));
	//   72  145:aload_0         
	//   73  146:getfield        #44  <Field ExoPlayerInterface player>
	//   74  149:invokevirtual   #135 <Method android.os.Looper ExoPlayerInterface.getPlaybackLooper()>
	//   75  152:aload_0         
	//   76  153:getfield        #42  <Field MediaDrmCallback drmCallback>
	//   77  156:aconst_null     
	//   78  157:aload_0         
	//   79  158:getfield        #44  <Field ExoPlayerInterface player>
	//   80  161:invokevirtual   #79  <Method Handler ExoPlayerInterface.getMainHandler()>
	//   81  164:aload_0         
	//   82  165:getfield        #44  <Field ExoPlayerInterface player>
	//   83  168:invokestatic    #141 <Method StreamingDrmSessionManager StreamingDrmSessionManager.newWidevineInstance(android.os.Looper, MediaDrmCallback, java.util.HashMap, Handler, com.google.android.exoplayer.drm.StreamingDrmSessionManager$EventListener)>
	//   84  171:astore          5
				j = getWidevineSecurityLevel(((StreamingDrmSessionManager) (obj)));
	//   85  173:aload           5
	//   86  175:invokestatic    #145 <Method int getWidevineSecurityLevel(StreamingDrmSessionManager)>
	//   87  178:istore_1        
			}
	//*  88  179:iload_1         
	//*  89  180:iconst_1        
	//*  90  181:icmpeq          190
	//*  91  184:iconst_1        
	//*  92  185:istore          4
	//*  93  187:goto            211
	//*  94  190:iconst_0        
	//*  95  191:istore          4
	//*  96  193:goto            211
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  97  196:astore          5
			{
				player.onRenderersError(((Exception) (obj)));
	//   98  198:aload_0         
	//   99  199:getfield        #44  <Field ExoPlayerInterface player>
	//  100  202:aload           5
	//  101  204:invokevirtual   #131 <Method void ExoPlayerInterface.onRenderersError(Exception)>
				return;
	//  102  207:return          
			}
			if(j != 1)
				flag = true;
			else
				flag = false;
		} else
		{
			flag = false;
	//  103  208:iconst_0        
	//  104  209:istore          4
		}
		Object obj2 = ((Object) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent)));
	//  105  211:new             #49  <Class DefaultUriDataSource>
	//  106  214:dup             
	//  107  215:aload_0         
	//  108  216:getfield        #38  <Field Context context>
	//  109  219:aload           6
	//  110  221:aload_0         
	//  111  222:getfield        #40  <Field String userAgent>
	//  112  225:invokespecial   #148 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//  113  228:astore          9
		obj2 = ((Object) (new ChunkSampleSource(((com.google.android.exoplayer.chunk.ChunkSource) (new DashChunkSource(manifestFetcher, ((com.google.android.exoplayer.dash.DashTrackSelector) (DefaultDashTrackSelector.newVideoInstance(context, true, flag))), ((com.google.android.exoplayer.upstream.DataSource) (obj2)), ((com.google.android.exoplayer.chunk.FormatEvaluator) (new com.google.android.exoplayer.chunk.FormatEvaluator.AdaptiveEvaluator(((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter))))), 30000L, elapsedRealtimeOffset, ((Handler) (obj1)), ((com.google.android.exoplayer.dash.DashChunkSource.EventListener) (player)), 0))), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0xc80000, ((Handler) (obj1)), ((com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener) (player)), 0)));
	//  114  230:new             #150 <Class ChunkSampleSource>
	//  115  233:dup             
	//  116  234:new             #152 <Class DashChunkSource>
	//  117  237:dup             
	//  118  238:aload_0         
	//  119  239:getfield        #61  <Field ManifestFetcher manifestFetcher>
	//  120  242:aload_0         
	//  121  243:getfield        #38  <Field Context context>
	//  122  246:iconst_1        
	//  123  247:iload           4
	//  124  249:invokestatic    #158 <Method DefaultDashTrackSelector DefaultDashTrackSelector.newVideoInstance(Context, boolean, boolean)>
	//  125  252:aload           9
	//  126  254:new             #160 <Class com.google.android.exoplayer.chunk.FormatEvaluator$AdaptiveEvaluator>
	//  127  257:dup             
	//  128  258:aload           6
	//  129  260:invokespecial   #163 <Method void com.google.android.exoplayer.chunk.FormatEvaluator$AdaptiveEvaluator(com.google.android.exoplayer.upstream.BandwidthMeter)>
	//  130  263:ldc2w           #164 <Long 30000L>
	//  131  266:aload_0         
	//  132  267:getfield        #167 <Field long elapsedRealtimeOffset>
	//  133  270:aload           7
	//  134  272:aload_0         
	//  135  273:getfield        #44  <Field ExoPlayerInterface player>
	//  136  276:iconst_0        
	//  137  277:invokespecial   #170 <Method void DashChunkSource(ManifestFetcher, com.google.android.exoplayer.dash.DashTrackSelector, com.google.android.exoplayer.upstream.DataSource, com.google.android.exoplayer.chunk.FormatEvaluator, long, long, Handler, com.google.android.exoplayer.dash.DashChunkSource$EventListener, int)>
	//  138  280:aload           8
	//  139  282:ldc1            #171 <Int 0xc80000>
	//  140  284:aload           7
	//  141  286:aload_0         
	//  142  287:getfield        #44  <Field ExoPlayerInterface player>
	//  143  290:iconst_0        
	//  144  291:invokespecial   #174 <Method void ChunkSampleSource(com.google.android.exoplayer.chunk.ChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.chunk.ChunkSampleSource$EventListener, int)>
	//  145  294:astore          9
		obj2 = ((Object) (new MediaCodecVideoTrackRenderer(context, ((com.google.android.exoplayer.SampleSource) (obj2)), MediaCodecSelector.DEFAULT, 1, 5000L, ((com.google.android.exoplayer.drm.DrmSessionManager) (obj)), true, ((Handler) (obj1)), ((com.google.android.exoplayer.r) (player)), 50)));
	//  146  296:new             #176 <Class MediaCodecVideoTrackRenderer>
	//  147  299:dup             
	//  148  300:aload_0         
	//  149  301:getfield        #38  <Field Context context>
	//  150  304:aload           9
	//  151  306:getstatic       #182 <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//  152  309:iconst_1        
	//  153  310:ldc2w           #183 <Long 5000L>
	//  154  313:aload           5
	//  155  315:iconst_1        
	//  156  316:aload           7
	//  157  318:aload_0         
	//  158  319:getfield        #44  <Field ExoPlayerInterface player>
	//  159  322:bipush          50
	//  160  324:invokespecial   #187 <Method void MediaCodecVideoTrackRenderer(Context, com.google.android.exoplayer.SampleSource, MediaCodecSelector, int, long, com.google.android.exoplayer.drm.DrmSessionManager, boolean, Handler, com.google.android.exoplayer.MediaCodecVideoTrackRenderer$EventListener, int)>
	//  161  327:astore          9
		DefaultUriDataSource defaulturidatasource = new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent);
	//  162  329:new             #49  <Class DefaultUriDataSource>
	//  163  332:dup             
	//  164  333:aload_0         
	//  165  334:getfield        #38  <Field Context context>
	//  166  337:aload           6
	//  167  339:aload_0         
	//  168  340:getfield        #40  <Field String userAgent>
	//  169  343:invokespecial   #148 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//  170  346:astore          10
		obj = ((Object) (new MediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (new ChunkSampleSource(((com.google.android.exoplayer.chunk.ChunkSource) (new DashChunkSource(manifestFetcher, ((com.google.android.exoplayer.dash.DashTrackSelector) (DefaultDashTrackSelector.newAudioInstance())), ((com.google.android.exoplayer.upstream.DataSource) (defaulturidatasource)), ((com.google.android.exoplayer.chunk.FormatEvaluator) (null)), 30000L, elapsedRealtimeOffset, ((Handler) (obj1)), ((com.google.android.exoplayer.dash.DashChunkSource.EventListener) (player)), 1))), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0x360000, ((Handler) (obj1)), ((com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener) (player)), 1))), MediaCodecSelector.DEFAULT, ((com.google.android.exoplayer.drm.DrmSessionManager) (obj)), true, ((Handler) (obj1)), ((com.google.android.exoplayer.r) (player)), AudioCapabilities.getCapabilities(context), 3)));
	//  171  348:new             #189 <Class MediaCodecAudioTrackRenderer>
	//  172  351:dup             
	//  173  352:new             #150 <Class ChunkSampleSource>
	//  174  355:dup             
	//  175  356:new             #152 <Class DashChunkSource>
	//  176  359:dup             
	//  177  360:aload_0         
	//  178  361:getfield        #61  <Field ManifestFetcher manifestFetcher>
	//  179  364:invokestatic    #193 <Method DefaultDashTrackSelector DefaultDashTrackSelector.newAudioInstance()>
	//  180  367:aload           10
	//  181  369:aconst_null     
	//  182  370:ldc2w           #164 <Long 30000L>
	//  183  373:aload_0         
	//  184  374:getfield        #167 <Field long elapsedRealtimeOffset>
	//  185  377:aload           7
	//  186  379:aload_0         
	//  187  380:getfield        #44  <Field ExoPlayerInterface player>
	//  188  383:iconst_1        
	//  189  384:invokespecial   #170 <Method void DashChunkSource(ManifestFetcher, com.google.android.exoplayer.dash.DashTrackSelector, com.google.android.exoplayer.upstream.DataSource, com.google.android.exoplayer.chunk.FormatEvaluator, long, long, Handler, com.google.android.exoplayer.dash.DashChunkSource$EventListener, int)>
	//  190  387:aload           8
	//  191  389:ldc1            #194 <Int 0x360000>
	//  192  391:aload           7
	//  193  393:aload_0         
	//  194  394:getfield        #44  <Field ExoPlayerInterface player>
	//  195  397:iconst_1        
	//  196  398:invokespecial   #174 <Method void ChunkSampleSource(com.google.android.exoplayer.chunk.ChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.chunk.ChunkSampleSource$EventListener, int)>
	//  197  401:getstatic       #182 <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//  198  404:aload           5
	//  199  406:iconst_1        
	//  200  407:aload           7
	//  201  409:aload_0         
	//  202  410:getfield        #44  <Field ExoPlayerInterface player>
	//  203  413:aload_0         
	//  204  414:getfield        #38  <Field Context context>
	//  205  417:invokestatic    #200 <Method AudioCapabilities AudioCapabilities.getCapabilities(Context)>
	//  206  420:iconst_3        
	//  207  421:invokespecial   #203 <Method void MediaCodecAudioTrackRenderer(com.google.android.exoplayer.SampleSource, MediaCodecSelector, com.google.android.exoplayer.drm.DrmSessionManager, boolean, Handler, com.google.android.exoplayer.MediaCodecAudioTrackRenderer$EventListener, AudioCapabilities, int)>
	//  208  424:astore          5
		defaulturidatasource = new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent);
	//  209  426:new             #49  <Class DefaultUriDataSource>
	//  210  429:dup             
	//  211  430:aload_0         
	//  212  431:getfield        #38  <Field Context context>
	//  213  434:aload           6
	//  214  436:aload_0         
	//  215  437:getfield        #40  <Field String userAgent>
	//  216  440:invokespecial   #148 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//  217  443:astore          10
		obj1 = ((Object) (new TextTrackRenderer(((com.google.android.exoplayer.SampleSource) (new ChunkSampleSource(((com.google.android.exoplayer.chunk.ChunkSource) (new DashChunkSource(manifestFetcher, ((com.google.android.exoplayer.dash.DashTrackSelector) (DefaultDashTrackSelector.newTextInstance())), ((com.google.android.exoplayer.upstream.DataSource) (defaulturidatasource)), ((com.google.android.exoplayer.chunk.FormatEvaluator) (null)), 30000L, elapsedRealtimeOffset, ((Handler) (obj1)), ((com.google.android.exoplayer.dash.DashChunkSource.EventListener) (player)), 2))), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0x20000, ((Handler) (obj1)), ((com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener) (player)), 2))), ((com.google.android.exoplayer.text.TextRenderer) (player)), ((Handler) (obj1)).getLooper(), new SubtitleParser[0])));
	//  218  445:new             #205 <Class TextTrackRenderer>
	//  219  448:dup             
	//  220  449:new             #150 <Class ChunkSampleSource>
	//  221  452:dup             
	//  222  453:new             #152 <Class DashChunkSource>
	//  223  456:dup             
	//  224  457:aload_0         
	//  225  458:getfield        #61  <Field ManifestFetcher manifestFetcher>
	//  226  461:invokestatic    #208 <Method DefaultDashTrackSelector DefaultDashTrackSelector.newTextInstance()>
	//  227  464:aload           10
	//  228  466:aconst_null     
	//  229  467:ldc2w           #164 <Long 30000L>
	//  230  470:aload_0         
	//  231  471:getfield        #167 <Field long elapsedRealtimeOffset>
	//  232  474:aload           7
	//  233  476:aload_0         
	//  234  477:getfield        #44  <Field ExoPlayerInterface player>
	//  235  480:iconst_2        
	//  236  481:invokespecial   #170 <Method void DashChunkSource(ManifestFetcher, com.google.android.exoplayer.dash.DashTrackSelector, com.google.android.exoplayer.upstream.DataSource, com.google.android.exoplayer.chunk.FormatEvaluator, long, long, Handler, com.google.android.exoplayer.dash.DashChunkSource$EventListener, int)>
	//  237  484:aload           8
	//  238  486:ldc1            #209 <Int 0x20000>
	//  239  488:aload           7
	//  240  490:aload_0         
	//  241  491:getfield        #44  <Field ExoPlayerInterface player>
	//  242  494:iconst_2        
	//  243  495:invokespecial   #174 <Method void ChunkSampleSource(com.google.android.exoplayer.chunk.ChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.chunk.ChunkSampleSource$EventListener, int)>
	//  244  498:aload_0         
	//  245  499:getfield        #44  <Field ExoPlayerInterface player>
	//  246  502:aload           7
	//  247  504:invokevirtual   #214 <Method android.os.Looper Handler.getLooper()>
	//  248  507:iconst_0        
	//  249  508:anewarray       SubtitleParser[]
	//  250  511:invokespecial   #219 <Method void TextTrackRenderer(com.google.android.exoplayer.SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper, SubtitleParser[])>
	//  251  514:astore          7
		TrackRenderer atrackrenderer[] = new TrackRenderer[4];
	//  252  516:iconst_4        
	//  253  517:anewarray       TrackRenderer[]
	//  254  520:astore          8
		atrackrenderer[0] = ((TrackRenderer) (obj2));
	//  255  522:aload           8
	//  256  524:iconst_0        
	//  257  525:aload           9
	//  258  527:aastore         
		atrackrenderer[1] = ((TrackRenderer) (obj));
	//  259  528:aload           8
	//  260  530:iconst_1        
	//  261  531:aload           5
	//  262  533:aastore         
		atrackrenderer[2] = ((TrackRenderer) (obj1));
	//  263  534:aload           8
	//  264  536:iconst_2        
	//  265  537:aload           7
	//  266  539:aastore         
		player.onRenderers(atrackrenderer, ((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter)));
	//  267  540:aload_0         
	//  268  541:getfield        #44  <Field ExoPlayerInterface player>
	//  269  544:aload           8
	//  270  546:aload           6
	//  271  548:invokevirtual   #225 <Method void ExoPlayerInterface.onRenderers(TrackRenderer[], com.google.android.exoplayer.upstream.BandwidthMeter)>
	//  272  551:return          
	}

	private static int getWidevineSecurityLevel(StreamingDrmSessionManager streamingdrmsessionmanager)
	{
		streamingdrmsessionmanager = ((StreamingDrmSessionManager) (streamingdrmsessionmanager.getPropertyString("securityLevel")));
	//    0    0:aload_0         
	//    1    1:ldc1            #227 <String "securityLevel">
	//    2    3:invokevirtual   #231 <Method String StreamingDrmSessionManager.getPropertyString(String)>
	//    3    6:astore_0        
		if(((String) (streamingdrmsessionmanager)).equals("L1"))
	//*   4    7:aload_0         
	//*   5    8:ldc1            #233 <String "L1">
	//*   6   10:invokevirtual   #239 <Method boolean String.equals(Object)>
	//*   7   13:ifeq            18
			return 1;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		return !((String) (streamingdrmsessionmanager)).equals("L3") ? -1 : 3;
	//   10   18:aload_0         
	//   11   19:ldc1            #241 <String "L3">
	//   12   21:invokevirtual   #239 <Method boolean String.equals(Object)>
	//   13   24:ifeq            29
	//   14   27:iconst_3        
	//   15   28:ireturn         
	//   16   29:iconst_m1       
	//   17   30:ireturn         
	}

	public void cancel()
	{
		canceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #244 <Field boolean canceled>
	//    3    5:return          
	}

	public void init()
	{
		manifestFetcher.singleLoad(player.getMainHandler().getLooper(), ((com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ManifestFetcher manifestFetcher>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field ExoPlayerInterface player>
	//    4    8:invokevirtual   #79  <Method Handler ExoPlayerInterface.getMainHandler()>
	//    5   11:invokevirtual   #214 <Method android.os.Looper Handler.getLooper()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #249 <Method void ManifestFetcher.singleLoad(android.os.Looper, com.google.android.exoplayer.util.ManifestFetcher$ManifestCallback)>
	//    8   18:return          
	}

	public void onSingleManifest(MediaPresentationDescription mediapresentationdescription)
	{
		if(canceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field boolean canceled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		manifest = mediapresentationdescription;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #67  <Field MediaPresentationDescription manifest>
		if(mediapresentationdescription.dynamic && mediapresentationdescription.utcTiming != null)
	//*   7   13:aload_1         
	//*   8   14:getfield        #254 <Field boolean MediaPresentationDescription.dynamic>
	//*   9   17:ifeq            47
	//*  10   20:aload_1         
	//*  11   21:getfield        #258 <Field UtcTimingElement MediaPresentationDescription.utcTiming>
	//*  12   24:ifnull          47
		{
			UtcTimingElementResolver.resolveTimingElement(manifestDataSource, mediapresentationdescription.utcTiming, manifestFetcher.getManifestLoadCompleteTimestamp(), ((com.google.android.exoplayer.dash.mpd.k) (this)));
	//   13   27:aload_0         
	//   14   28:getfield        #54  <Field UriDataSource manifestDataSource>
	//   15   31:aload_1         
	//   16   32:getfield        #258 <Field UtcTimingElement MediaPresentationDescription.utcTiming>
	//   17   35:aload_0         
	//   18   36:getfield        #61  <Field ManifestFetcher manifestFetcher>
	//   19   39:invokevirtual   #262 <Method long ManifestFetcher.getManifestLoadCompleteTimestamp()>
	//   20   42:aload_0         
	//   21   43:invokestatic    #268 <Method void UtcTimingElementResolver.resolveTimingElement(UriDataSource, UtcTimingElement, long, com.google.android.exoplayer.dash.mpd.UtcTimingElementResolver$UtcTimingCallback)>
			return;
	//   22   46:return          
		} else
		{
			buildRenderers();
	//   23   47:aload_0         
	//   24   48:invokespecial   #270 <Method void buildRenderers()>
			return;
	//   25   51:return          
		}
	}

	public volatile void onSingleManifest(Object obj)
	{
		onSingleManifest((MediaPresentationDescription)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #69  <Class MediaPresentationDescription>
	//    3    5:invokevirtual   #273 <Method void onSingleManifest(MediaPresentationDescription)>
	//    4    8:return          
	}

	public void onSingleManifestError(IOException ioexception)
	{
		if(canceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field boolean canceled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			player.onRenderersError(((Exception) (ioexception)));
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field ExoPlayerInterface player>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #131 <Method void ExoPlayerInterface.onRenderersError(Exception)>
			return;
	//    8   16:return          
		}
	}

	public void onTimestampError(UtcTimingElement utctimingelement, IOException ioexception)
	{
		if(canceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field boolean canceled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #279 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #280 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("Failed to resolve UtcTiming element [");
	//    8   16:aload_3         
	//    9   17:ldc2            #282 <String "Failed to resolve UtcTiming element [">
	//   10   20:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (utctimingelement)));
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append("]");
	//   16   30:aload_3         
	//   17   31:ldc2            #291 <String "]">
	//   18   34:invokevirtual   #286 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			Log.e("DashRendererBuilder", stringbuilder.toString(), ((Throwable) (ioexception)));
	//   20   38:ldc2            #293 <String "DashRendererBuilder">
	//   21   41:aload_3         
	//   22   42:invokevirtual   #297 <Method String StringBuilder.toString()>
	//   23   45:aload_2         
	//   24   46:invokestatic    #303 <Method int Log.e(String, String, Throwable)>
	//   25   49:pop             
			buildRenderers();
	//   26   50:aload_0         
	//   27   51:invokespecial   #270 <Method void buildRenderers()>
			return;
	//   28   54:return          
		}
	}

	public void onTimestampResolved(UtcTimingElement utctimingelement, long l)
	{
		if(canceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field boolean canceled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			elapsedRealtimeOffset = l;
	//    4    8:aload_0         
	//    5    9:lload_2         
	//    6   10:putfield        #167 <Field long elapsedRealtimeOffset>
			buildRenderers();
	//    7   13:aload_0         
	//    8   14:invokespecial   #270 <Method void buildRenderers()>
			return;
	//    9   17:return          
		}
	}

	private boolean canceled;
	private final Context context;
	private final MediaDrmCallback drmCallback;
	private long elapsedRealtimeOffset;
	private MediaPresentationDescription manifest;
	private final UriDataSource manifestDataSource;
	private final ManifestFetcher manifestFetcher;
	private final ExoPlayerInterface player;
	private final String userAgent;

	public DashRendererBuilder$AsyncRendererBuilder(Context context1, String s, String s1, MediaDrmCallback mediadrmcallback, ExoPlayerInterface exoplayerinterface)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Context context>
		userAgent = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field String userAgent>
		drmCallback = mediadrmcallback;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #42  <Field MediaDrmCallback drmCallback>
		player = exoplayerinterface;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #44  <Field ExoPlayerInterface player>
		mediadrmcallback = ((MediaDrmCallback) (new MediaPresentationDescriptionParser()));
	//   14   26:new             #46  <Class MediaPresentationDescriptionParser>
	//   15   29:dup             
	//   16   30:invokespecial   #47  <Method void MediaPresentationDescriptionParser()>
	//   17   33:astore          4
		manifestDataSource = ((UriDataSource) (new DefaultUriDataSource(context1, s)));
	//   18   35:aload_0         
	//   19   36:new             #49  <Class DefaultUriDataSource>
	//   20   39:dup             
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:invokespecial   #52  <Method void DefaultUriDataSource(Context, String)>
	//   24   45:putfield        #54  <Field UriDataSource manifestDataSource>
		manifestFetcher = new ManifestFetcher(s1, manifestDataSource, ((com.google.android.exoplayer.upstream.UriLoadable.Parser) (mediadrmcallback)));
	//   25   48:aload_0         
	//   26   49:new             #56  <Class ManifestFetcher>
	//   27   52:dup             
	//   28   53:aload_3         
	//   29   54:aload_0         
	//   30   55:getfield        #54  <Field UriDataSource manifestDataSource>
	//   31   58:aload           4
	//   32   60:invokespecial   #59  <Method void ManifestFetcher(String, UriDataSource, com.google.android.exoplayer.upstream.UriLoadable$Parser)>
	//   33   63:putfield        #61  <Field ManifestFetcher manifestFetcher>
	//   34   66:return          
	}
}
