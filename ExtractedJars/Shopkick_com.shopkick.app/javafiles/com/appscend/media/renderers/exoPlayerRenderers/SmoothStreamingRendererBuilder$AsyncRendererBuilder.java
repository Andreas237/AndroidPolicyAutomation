// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.chunk.ChunkSampleSource;
import com.google.android.exoplayer.drm.*;
import com.google.android.exoplayer.smoothstreaming.*;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextTrackRenderer;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.ManifestFetcher;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			SmoothStreamingRendererBuilder, ExoPlayerInterface

private static final class SmoothStreamingRendererBuilder$AsyncRendererBuilder
	implements com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback
{

	public void cancel()
	{
		canceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #55  <Field boolean canceled>
	//    3    5:return          
	}

	public void init()
	{
		manifestFetcher.singleLoad(player.getMainHandler().getLooper(), ((com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ManifestFetcher manifestFetcher>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field ExoPlayerInterface player>
	//    4    8:invokevirtual   #62  <Method Handler ExoPlayerInterface.getMainHandler()>
	//    5   11:invokevirtual   #68  <Method android.os.Looper Handler.getLooper()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #72  <Method void ManifestFetcher.singleLoad(android.os.Looper, com.google.android.exoplayer.util.ManifestFetcher$ManifestCallback)>
	//    8   18:return          
	}

	public void onSingleManifest(SmoothStreamingManifest smoothstreamingmanifest)
	{
		if(canceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field boolean canceled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		Object obj = ((Object) (player.getMainHandler()));
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field ExoPlayerInterface player>
	//    6   12:invokevirtual   #62  <Method Handler ExoPlayerInterface.getMainHandler()>
	//    7   15:astore_3        
		DefaultLoadControl defaultloadcontrol = new DefaultLoadControl(((com.google.android.exoplayer.upstream.Allocator) (new DefaultAllocator(0x10000))));
	//    8   16:new             #78  <Class DefaultLoadControl>
	//    9   19:dup             
	//   10   20:new             #80  <Class DefaultAllocator>
	//   11   23:dup             
	//   12   24:ldc1            #81  <Int 0x10000>
	//   13   26:invokespecial   #84  <Method void DefaultAllocator(int)>
	//   14   29:invokespecial   #87  <Method void DefaultLoadControl(com.google.android.exoplayer.upstream.Allocator)>
	//   15   32:astore          4
		DefaultBandwidthMeter defaultbandwidthmeter = new DefaultBandwidthMeter(((Handler) (obj)), ((com.google.android.exoplayer.upstream.BandwidthMeter.EventListener) (player)));
	//   16   34:new             #89  <Class DefaultBandwidthMeter>
	//   17   37:dup             
	//   18   38:aload_3         
	//   19   39:aload_0         
	//   20   40:getfield        #36  <Field ExoPlayerInterface player>
	//   21   43:invokespecial   #92  <Method void DefaultBandwidthMeter(Handler, com.google.android.exoplayer.upstream.BandwidthMeter$EventListener)>
	//   22   46:astore_2        
		if(smoothstreamingmanifest.protectionElement != null)
	//*  23   47:aload_1         
	//*  24   48:getfield        #98  <Field com.google.android.exoplayer.smoothstreaming.SmoothStreamingManifest$ProtectionElement SmoothStreamingManifest.protectionElement>
	//*  25   51:ifnull          125
		{
			if(Util.SDK_INT < 18)
	//*  26   54:getstatic       #104 <Field int Util.SDK_INT>
	//*  27   57:bipush          18
	//*  28   59:icmpge          78
			{
				player.onRenderersError(((Exception) (new UnsupportedDrmException(1))));
	//   29   62:aload_0         
	//   30   63:getfield        #36  <Field ExoPlayerInterface player>
	//   31   66:new             #76  <Class UnsupportedDrmException>
	//   32   69:dup             
	//   33   70:iconst_1        
	//   34   71:invokespecial   #105 <Method void UnsupportedDrmException(int)>
	//   35   74:invokevirtual   #109 <Method void ExoPlayerInterface.onRenderersError(Exception)>
				return;
	//   36   77:return          
			}
			try
			{
				smoothstreamingmanifest = ((SmoothStreamingManifest) (StreamingDrmSessionManager.newFrameworkInstance(smoothstreamingmanifest.protectionElement.uuid, player.getPlaybackLooper(), drmCallback, ((java.util.HashMap) (null)), player.getMainHandler(), ((com.google.android.exoplayer.drm.StreamingDrmSessionManager.EventListener) (player)))));
	//   37   78:aload_1         
	//   38   79:getfield        #98  <Field com.google.android.exoplayer.smoothstreaming.SmoothStreamingManifest$ProtectionElement SmoothStreamingManifest.protectionElement>
	//   39   82:getfield        #115 <Field java.util.UUID com.google.android.exoplayer.smoothstreaming.SmoothStreamingManifest$ProtectionElement.uuid>
	//   40   85:aload_0         
	//   41   86:getfield        #36  <Field ExoPlayerInterface player>
	//   42   89:invokevirtual   #118 <Method android.os.Looper ExoPlayerInterface.getPlaybackLooper()>
	//   43   92:aload_0         
	//   44   93:getfield        #34  <Field MediaDrmCallback drmCallback>
	//   45   96:aconst_null     
	//   46   97:aload_0         
	//   47   98:getfield        #36  <Field ExoPlayerInterface player>
	//   48  101:invokevirtual   #62  <Method Handler ExoPlayerInterface.getMainHandler()>
	//   49  104:aload_0         
	//   50  105:getfield        #36  <Field ExoPlayerInterface player>
	//   51  108:invokestatic    #124 <Method StreamingDrmSessionManager StreamingDrmSessionManager.newFrameworkInstance(java.util.UUID, android.os.Looper, MediaDrmCallback, java.util.HashMap, Handler, com.google.android.exoplayer.drm.StreamingDrmSessionManager$EventListener)>
	//   52  111:astore_1        
			}
	//*  53  112:goto            127
			// Misplaced declaration of an exception variable
			catch(SmoothStreamingManifest smoothstreamingmanifest)
	//*  54  115:astore_1        
			{
				player.onRenderersError(((Exception) (smoothstreamingmanifest)));
	//   55  116:aload_0         
	//   56  117:getfield        #36  <Field ExoPlayerInterface player>
	//   57  120:aload_1         
	//   58  121:invokevirtual   #109 <Method void ExoPlayerInterface.onRenderersError(Exception)>
				return;
	//   59  124:return          
			}
		} else
		{
			smoothstreamingmanifest = null;
	//   60  125:aconst_null     
	//   61  126:astore_1        
		}
		Object obj1 = ((Object) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent)));
	//   62  127:new             #126 <Class DefaultUriDataSource>
	//   63  130:dup             
	//   64  131:aload_0         
	//   65  132:getfield        #30  <Field Context context>
	//   66  135:aload_2         
	//   67  136:aload_0         
	//   68  137:getfield        #32  <Field String userAgent>
	//   69  140:invokespecial   #129 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//   70  143:astore          5
		obj1 = ((Object) (new ChunkSampleSource(((com.google.android.exoplayer.chunk.ChunkSource) (new SmoothStreamingChunkSource(manifestFetcher, ((com.google.android.exoplayer.smoothstreaming.SmoothStreamingTrackSelector) (DefaultSmoothStreamingTrackSelector.newVideoInstance(context, true, false))), ((com.google.android.exoplayer.upstream.DataSource) (obj1)), ((com.google.android.exoplayer.chunk.FormatEvaluator) (new com.google.android.exoplayer.chunk.FormatEvaluator.AdaptiveEvaluator(((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter))))), 30000L))), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0xc80000, ((Handler) (obj)), ((com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener) (player)), 0)));
	//   71  145:new             #131 <Class ChunkSampleSource>
	//   72  148:dup             
	//   73  149:new             #133 <Class SmoothStreamingChunkSource>
	//   74  152:dup             
	//   75  153:aload_0         
	//   76  154:getfield        #51  <Field ManifestFetcher manifestFetcher>
	//   77  157:aload_0         
	//   78  158:getfield        #30  <Field Context context>
	//   79  161:iconst_1        
	//   80  162:iconst_0        
	//   81  163:invokestatic    #139 <Method DefaultSmoothStreamingTrackSelector DefaultSmoothStreamingTrackSelector.newVideoInstance(Context, boolean, boolean)>
	//   82  166:aload           5
	//   83  168:new             #141 <Class com.google.android.exoplayer.chunk.FormatEvaluator$AdaptiveEvaluator>
	//   84  171:dup             
	//   85  172:aload_2         
	//   86  173:invokespecial   #144 <Method void com.google.android.exoplayer.chunk.FormatEvaluator$AdaptiveEvaluator(com.google.android.exoplayer.upstream.BandwidthMeter)>
	//   87  176:ldc2w           #145 <Long 30000L>
	//   88  179:invokespecial   #149 <Method void SmoothStreamingChunkSource(ManifestFetcher, com.google.android.exoplayer.smoothstreaming.SmoothStreamingTrackSelector, com.google.android.exoplayer.upstream.DataSource, com.google.android.exoplayer.chunk.FormatEvaluator, long)>
	//   89  182:aload           4
	//   90  184:ldc1            #150 <Int 0xc80000>
	//   91  186:aload_3         
	//   92  187:aload_0         
	//   93  188:getfield        #36  <Field ExoPlayerInterface player>
	//   94  191:iconst_0        
	//   95  192:invokespecial   #153 <Method void ChunkSampleSource(com.google.android.exoplayer.chunk.ChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.chunk.ChunkSampleSource$EventListener, int)>
	//   96  195:astore          5
		obj1 = ((Object) (new MediaCodecVideoTrackRenderer(context, ((com.google.android.exoplayer.SampleSource) (obj1)), MediaCodecSelector.DEFAULT, 1, 5000L, ((com.google.android.exoplayer.drm.DrmSessionManager) (smoothstreamingmanifest)), true, ((Handler) (obj)), ((com.google.android.exoplayer.MediaCodecVideoTrackRenderer.EventListener) (player)), 50)));
	//   97  197:new             #155 <Class MediaCodecVideoTrackRenderer>
	//   98  200:dup             
	//   99  201:aload_0         
	//  100  202:getfield        #30  <Field Context context>
	//  101  205:aload           5
	//  102  207:getstatic       #161 <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//  103  210:iconst_1        
	//  104  211:ldc2w           #162 <Long 5000L>
	//  105  214:aload_1         
	//  106  215:iconst_1        
	//  107  216:aload_3         
	//  108  217:aload_0         
	//  109  218:getfield        #36  <Field ExoPlayerInterface player>
	//  110  221:bipush          50
	//  111  223:invokespecial   #166 <Method void MediaCodecVideoTrackRenderer(Context, com.google.android.exoplayer.SampleSource, MediaCodecSelector, int, long, com.google.android.exoplayer.drm.DrmSessionManager, boolean, Handler, com.google.android.exoplayer.MediaCodecVideoTrackRenderer$EventListener, int)>
	//  112  226:astore          5
		DefaultUriDataSource defaulturidatasource = new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent);
	//  113  228:new             #126 <Class DefaultUriDataSource>
	//  114  231:dup             
	//  115  232:aload_0         
	//  116  233:getfield        #30  <Field Context context>
	//  117  236:aload_2         
	//  118  237:aload_0         
	//  119  238:getfield        #32  <Field String userAgent>
	//  120  241:invokespecial   #129 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//  121  244:astore          6
		smoothstreamingmanifest = ((SmoothStreamingManifest) (new MediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (new ChunkSampleSource(((com.google.android.exoplayer.chunk.ChunkSource) (new SmoothStreamingChunkSource(manifestFetcher, ((com.google.android.exoplayer.smoothstreaming.SmoothStreamingTrackSelector) (DefaultSmoothStreamingTrackSelector.newAudioInstance())), ((com.google.android.exoplayer.upstream.DataSource) (defaulturidatasource)), ((com.google.android.exoplayer.chunk.FormatEvaluator) (null)), 30000L))), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0x360000, ((Handler) (obj)), ((com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener) (player)), 1))), MediaCodecSelector.DEFAULT, ((com.google.android.exoplayer.drm.DrmSessionManager) (smoothstreamingmanifest)), true, ((Handler) (obj)), ((com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener) (player)), AudioCapabilities.getCapabilities(context), 3)));
	//  122  246:new             #168 <Class MediaCodecAudioTrackRenderer>
	//  123  249:dup             
	//  124  250:new             #131 <Class ChunkSampleSource>
	//  125  253:dup             
	//  126  254:new             #133 <Class SmoothStreamingChunkSource>
	//  127  257:dup             
	//  128  258:aload_0         
	//  129  259:getfield        #51  <Field ManifestFetcher manifestFetcher>
	//  130  262:invokestatic    #172 <Method DefaultSmoothStreamingTrackSelector DefaultSmoothStreamingTrackSelector.newAudioInstance()>
	//  131  265:aload           6
	//  132  267:aconst_null     
	//  133  268:ldc2w           #145 <Long 30000L>
	//  134  271:invokespecial   #149 <Method void SmoothStreamingChunkSource(ManifestFetcher, com.google.android.exoplayer.smoothstreaming.SmoothStreamingTrackSelector, com.google.android.exoplayer.upstream.DataSource, com.google.android.exoplayer.chunk.FormatEvaluator, long)>
	//  135  274:aload           4
	//  136  276:ldc1            #173 <Int 0x360000>
	//  137  278:aload_3         
	//  138  279:aload_0         
	//  139  280:getfield        #36  <Field ExoPlayerInterface player>
	//  140  283:iconst_1        
	//  141  284:invokespecial   #153 <Method void ChunkSampleSource(com.google.android.exoplayer.chunk.ChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.chunk.ChunkSampleSource$EventListener, int)>
	//  142  287:getstatic       #161 <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//  143  290:aload_1         
	//  144  291:iconst_1        
	//  145  292:aload_3         
	//  146  293:aload_0         
	//  147  294:getfield        #36  <Field ExoPlayerInterface player>
	//  148  297:aload_0         
	//  149  298:getfield        #30  <Field Context context>
	//  150  301:invokestatic    #179 <Method AudioCapabilities AudioCapabilities.getCapabilities(Context)>
	//  151  304:iconst_3        
	//  152  305:invokespecial   #182 <Method void MediaCodecAudioTrackRenderer(com.google.android.exoplayer.SampleSource, MediaCodecSelector, com.google.android.exoplayer.drm.DrmSessionManager, boolean, Handler, com.google.android.exoplayer.MediaCodecAudioTrackRenderer$EventListener, AudioCapabilities, int)>
	//  153  308:astore_1        
		defaulturidatasource = new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent);
	//  154  309:new             #126 <Class DefaultUriDataSource>
	//  155  312:dup             
	//  156  313:aload_0         
	//  157  314:getfield        #30  <Field Context context>
	//  158  317:aload_2         
	//  159  318:aload_0         
	//  160  319:getfield        #32  <Field String userAgent>
	//  161  322:invokespecial   #129 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//  162  325:astore          6
		obj = ((Object) (new TextTrackRenderer(((com.google.android.exoplayer.SampleSource) (new ChunkSampleSource(((com.google.android.exoplayer.chunk.ChunkSource) (new SmoothStreamingChunkSource(manifestFetcher, ((com.google.android.exoplayer.smoothstreaming.SmoothStreamingTrackSelector) (DefaultSmoothStreamingTrackSelector.newTextInstance())), ((com.google.android.exoplayer.upstream.DataSource) (defaulturidatasource)), ((com.google.android.exoplayer.chunk.FormatEvaluator) (null)), 30000L))), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0x20000, ((Handler) (obj)), ((com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener) (player)), 2))), ((com.google.android.exoplayer.text.TextRenderer) (player)), ((Handler) (obj)).getLooper(), new SubtitleParser[0])));
	//  163  327:new             #184 <Class TextTrackRenderer>
	//  164  330:dup             
	//  165  331:new             #131 <Class ChunkSampleSource>
	//  166  334:dup             
	//  167  335:new             #133 <Class SmoothStreamingChunkSource>
	//  168  338:dup             
	//  169  339:aload_0         
	//  170  340:getfield        #51  <Field ManifestFetcher manifestFetcher>
	//  171  343:invokestatic    #187 <Method DefaultSmoothStreamingTrackSelector DefaultSmoothStreamingTrackSelector.newTextInstance()>
	//  172  346:aload           6
	//  173  348:aconst_null     
	//  174  349:ldc2w           #145 <Long 30000L>
	//  175  352:invokespecial   #149 <Method void SmoothStreamingChunkSource(ManifestFetcher, com.google.android.exoplayer.smoothstreaming.SmoothStreamingTrackSelector, com.google.android.exoplayer.upstream.DataSource, com.google.android.exoplayer.chunk.FormatEvaluator, long)>
	//  176  355:aload           4
	//  177  357:ldc1            #188 <Int 0x20000>
	//  178  359:aload_3         
	//  179  360:aload_0         
	//  180  361:getfield        #36  <Field ExoPlayerInterface player>
	//  181  364:iconst_2        
	//  182  365:invokespecial   #153 <Method void ChunkSampleSource(com.google.android.exoplayer.chunk.ChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.chunk.ChunkSampleSource$EventListener, int)>
	//  183  368:aload_0         
	//  184  369:getfield        #36  <Field ExoPlayerInterface player>
	//  185  372:aload_3         
	//  186  373:invokevirtual   #68  <Method android.os.Looper Handler.getLooper()>
	//  187  376:iconst_0        
	//  188  377:anewarray       SubtitleParser[]
	//  189  380:invokespecial   #193 <Method void TextTrackRenderer(com.google.android.exoplayer.SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper, SubtitleParser[])>
	//  190  383:astore_3        
		TrackRenderer atrackrenderer[] = new TrackRenderer[4];
	//  191  384:iconst_4        
	//  192  385:anewarray       TrackRenderer[]
	//  193  388:astore          4
		atrackrenderer[0] = ((TrackRenderer) (obj1));
	//  194  390:aload           4
	//  195  392:iconst_0        
	//  196  393:aload           5
	//  197  395:aastore         
		atrackrenderer[1] = ((TrackRenderer) (smoothstreamingmanifest));
	//  198  396:aload           4
	//  199  398:iconst_1        
	//  200  399:aload_1         
	//  201  400:aastore         
		atrackrenderer[2] = ((TrackRenderer) (obj));
	//  202  401:aload           4
	//  203  403:iconst_2        
	//  204  404:aload_3         
	//  205  405:aastore         
		player.onRenderers(atrackrenderer, ((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter)));
	//  206  406:aload_0         
	//  207  407:getfield        #36  <Field ExoPlayerInterface player>
	//  208  410:aload           4
	//  209  412:aload_2         
	//  210  413:invokevirtual   #199 <Method void ExoPlayerInterface.onRenderers(TrackRenderer[], com.google.android.exoplayer.upstream.BandwidthMeter)>
	//  211  416:return          
	}

	public volatile void onSingleManifest(Object obj)
	{
		onSingleManifest((SmoothStreamingManifest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #94  <Class SmoothStreamingManifest>
	//    3    5:invokevirtual   #202 <Method void onSingleManifest(SmoothStreamingManifest)>
	//    4    8:return          
	}

	public void onSingleManifestError(IOException ioexception)
	{
		if(canceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field boolean canceled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			player.onRenderersError(((Exception) (ioexception)));
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field ExoPlayerInterface player>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #109 <Method void ExoPlayerInterface.onRenderersError(Exception)>
			return;
	//    8   16:return          
		}
	}

	private boolean canceled;
	private final Context context;
	private final MediaDrmCallback drmCallback;
	private final ManifestFetcher manifestFetcher;
	private final ExoPlayerInterface player;
	private final String userAgent;

	public SmoothStreamingRendererBuilder$AsyncRendererBuilder(Context context1, String s, String s1, MediaDrmCallback mediadrmcallback, ExoPlayerInterface exoplayerinterface)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Context context>
		userAgent = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field String userAgent>
		drmCallback = mediadrmcallback;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #34  <Field MediaDrmCallback drmCallback>
		player = exoplayerinterface;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #36  <Field ExoPlayerInterface player>
		context1 = ((Context) (new SmoothStreamingManifestParser()));
	//   14   26:new             #38  <Class SmoothStreamingManifestParser>
	//   15   29:dup             
	//   16   30:invokespecial   #39  <Method void SmoothStreamingManifestParser()>
	//   17   33:astore_1        
		manifestFetcher = new ManifestFetcher(s1, ((com.google.android.exoplayer.upstream.UriDataSource) (new DefaultHttpDataSource(s, ((com.google.android.exoplayer.util.Predicate) (null))))), ((com.google.android.exoplayer.upstream.UriLoadable.Parser) (context1)));
	//   18   34:aload_0         
	//   19   35:new             #41  <Class ManifestFetcher>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:new             #43  <Class DefaultHttpDataSource>
	//   23   43:dup             
	//   24   44:aload_2         
	//   25   45:aconst_null     
	//   26   46:invokespecial   #46  <Method void DefaultHttpDataSource(String, com.google.android.exoplayer.util.Predicate)>
	//   27   49:aload_1         
	//   28   50:invokespecial   #49  <Method void ManifestFetcher(String, com.google.android.exoplayer.upstream.UriDataSource, com.google.android.exoplayer.upstream.UriLoadable$Parser)>
	//   29   53:putfield        #51  <Field ManifestFetcher manifestFetcher>
	//   30   56:return          
	}
}
