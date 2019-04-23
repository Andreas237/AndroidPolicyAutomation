// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.appscend.media.APSMediaPlayer;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.hls.*;
import com.google.android.exoplayer.metadata.MetadataTrackRenderer;
import com.google.android.exoplayer.metadata.id3.Id3Parser;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextTrackRenderer;
import com.google.android.exoplayer.text.eia608.Eia608TrackRenderer;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.ManifestFetcher;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			ExoPlayerInterface

public class HlsRendererBuilder
	implements ExoPlayerInterface.RendererBuilder
{
	private static final class AsyncRendererBuilder
		implements com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback
	{

		public void cancel()
		{
			canceled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #57  <Field boolean canceled>
		//    3    5:return          
		}

		public void init()
		{
			playlistFetcher.singleLoad(player.getMainHandler().getLooper(), ((com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field ManifestFetcher playlistFetcher>
		//    2    4:aload_0         
		//    3    5:getfield        #38  <Field ExoPlayerInterface player>
		//    4    8:invokevirtual   #64  <Method Handler ExoPlayerInterface.getMainHandler()>
		//    5   11:invokevirtual   #70  <Method android.os.Looper Handler.getLooper()>
		//    6   14:aload_0         
		//    7   15:invokevirtual   #74  <Method void ManifestFetcher.singleLoad(android.os.Looper, com.google.android.exoplayer.util.ManifestFetcher$ManifestCallback)>
		//    8   18:return          
		}

		public void onSingleManifest(HlsPlaylist hlsplaylist)
		{
			if(canceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #57  <Field boolean canceled>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			Handler handler = player.getMainHandler();
		//    4    8:aload_0         
		//    5    9:getfield        #38  <Field ExoPlayerInterface player>
		//    6   12:invokevirtual   #64  <Method Handler ExoPlayerInterface.getMainHandler()>
		//    7   15:astore          9
			DefaultLoadControl defaultloadcontrol = new DefaultLoadControl(((com.google.android.exoplayer.upstream.Allocator) (new DefaultAllocator(0x10000))));
		//    8   17:new             #78  <Class DefaultLoadControl>
		//    9   20:dup             
		//   10   21:new             #80  <Class DefaultAllocator>
		//   11   24:dup             
		//   12   25:ldc1            #81  <Int 0x10000>
		//   13   27:invokespecial   #84  <Method void DefaultAllocator(int)>
		//   14   30:invokespecial   #87  <Method void DefaultLoadControl(com.google.android.exoplayer.upstream.Allocator)>
		//   15   33:astore          10
			DefaultBandwidthMeter defaultbandwidthmeter = new DefaultBandwidthMeter();
		//   16   35:new             #89  <Class DefaultBandwidthMeter>
		//   17   38:dup             
		//   18   39:invokespecial   #90  <Method void DefaultBandwidthMeter()>
		//   19   42:astore          6
			PtsTimestampAdjusterProvider ptstimestampadjusterprovider = new PtsTimestampAdjusterProvider();
		//   20   44:new             #92  <Class PtsTimestampAdjusterProvider>
		//   21   47:dup             
		//   22   48:invokespecial   #93  <Method void PtsTimestampAdjusterProvider()>
		//   23   51:astore          11
			boolean flag;
			boolean flag1;
			if(hlsplaylist instanceof HlsMasterPlaylist)
		//*  24   53:aload_1         
		//*  25   54:instanceof      #95  <Class HlsMasterPlaylist>
		//*  26   57:ifeq            99
			{
				HlsMasterPlaylist hlsmasterplaylist = (HlsMasterPlaylist)hlsplaylist;
		//   27   60:aload_1         
		//   28   61:checkcast       #95  <Class HlsMasterPlaylist>
		//   29   64:astore          5
				boolean flag2 = hlsmasterplaylist.subtitles.isEmpty();
		//   30   66:aload           5
		//   31   68:getfield        #99  <Field List HlsMasterPlaylist.subtitles>
		//   32   71:invokeinterface #105 <Method boolean List.isEmpty()>
		//   33   76:istore          4
				flag = hlsmasterplaylist.audios.isEmpty() ^ true;
		//   34   78:aload           5
		//   35   80:getfield        #108 <Field List HlsMasterPlaylist.audios>
		//   36   83:invokeinterface #105 <Method boolean List.isEmpty()>
		//   37   88:iconst_1        
		//   38   89:ixor            
		//   39   90:istore_2        
				flag1 = flag2 ^ true;
		//   40   91:iload           4
		//   41   93:iconst_1        
		//   42   94:ixor            
		//   43   95:istore_3        
			} else
		//*  44   96:goto            103
			{
				flag = false;
		//   45   99:iconst_0        
		//   46  100:istore_2        
				flag1 = flag;
		//   47  101:iload_2         
		//   48  102:istore_3        
			}
			HlsSampleSource hlssamplesource = new HlsSampleSource(new HlsChunkSource(true, ((com.google.android.exoplayer.upstream.DataSource) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent))), hlsplaylist, ((com.google.android.exoplayer.hls.HlsTrackSelector) (DefaultHlsTrackSelector.newDefaultInstance(context))), ((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter)), ptstimestampadjusterprovider), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0xfe0000, handler, ((com.google.android.exoplayer.hls.HlsSampleSource.EventListener) (player)), 0);
		//   49  103:new             #110 <Class HlsSampleSource>
		//   50  106:dup             
		//   51  107:new             #112 <Class HlsChunkSource>
		//   52  110:dup             
		//   53  111:iconst_1        
		//   54  112:new             #45  <Class DefaultUriDataSource>
		//   55  115:dup             
		//   56  116:aload_0         
		//   57  117:getfield        #30  <Field Context context>
		//   58  120:aload           6
		//   59  122:aload_0         
		//   60  123:getfield        #32  <Field String userAgent>
		//   61  126:invokespecial   #115 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
		//   62  129:aload_1         
		//   63  130:aload_0         
		//   64  131:getfield        #30  <Field Context context>
		//   65  134:invokestatic    #121 <Method DefaultHlsTrackSelector DefaultHlsTrackSelector.newDefaultInstance(Context)>
		//   66  137:aload           6
		//   67  139:aload           11
		//   68  141:invokespecial   #124 <Method void HlsChunkSource(boolean, com.google.android.exoplayer.upstream.DataSource, HlsPlaylist, com.google.android.exoplayer.hls.HlsTrackSelector, com.google.android.exoplayer.upstream.BandwidthMeter, PtsTimestampAdjusterProvider)>
		//   69  144:aload           10
		//   70  146:ldc1            #125 <Int 0xfe0000>
		//   71  148:aload           9
		//   72  150:aload_0         
		//   73  151:getfield        #38  <Field ExoPlayerInterface player>
		//   74  154:iconst_0        
		//   75  155:invokespecial   #128 <Method void HlsSampleSource(HlsChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.hls.HlsSampleSource$EventListener, int)>
		//   76  158:astore          12
			MediaCodecVideoTrackRenderer mediacodecvideotrackrenderer = new MediaCodecVideoTrackRenderer(context, ((SampleSource) (hlssamplesource)), MediaCodecSelector.DEFAULT, 1, 5000L, handler, ((com.google.android.exoplayer.MediaCodecVideoTrackRenderer.EventListener) (player)), 50);
		//   77  160:new             #130 <Class MediaCodecVideoTrackRenderer>
		//   78  163:dup             
		//   79  164:aload_0         
		//   80  165:getfield        #30  <Field Context context>
		//   81  168:aload           12
		//   82  170:getstatic       #136 <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
		//   83  173:iconst_1        
		//   84  174:ldc2w           #137 <Long 5000L>
		//   85  177:aload           9
		//   86  179:aload_0         
		//   87  180:getfield        #38  <Field ExoPlayerInterface player>
		//   88  183:bipush          50
		//   89  185:invokespecial   #141 <Method void MediaCodecVideoTrackRenderer(Context, SampleSource, MediaCodecSelector, int, long, Handler, com.google.android.exoplayer.MediaCodecVideoTrackRenderer$EventListener, int)>
		//   90  188:astore          7
			MetadataTrackRenderer metadatatrackrenderer = new MetadataTrackRenderer(((SampleSource) (hlssamplesource)), ((com.google.android.exoplayer.metadata.MetadataParser) (new Id3Parser())), ((com.google.android.exoplayer.metadata.MetadataTrackRenderer.MetadataRenderer) (player)), handler.getLooper());
		//   91  190:new             #143 <Class MetadataTrackRenderer>
		//   92  193:dup             
		//   93  194:aload           12
		//   94  196:new             #145 <Class Id3Parser>
		//   95  199:dup             
		//   96  200:invokespecial   #146 <Method void Id3Parser()>
		//   97  203:aload_0         
		//   98  204:getfield        #38  <Field ExoPlayerInterface player>
		//   99  207:aload           9
		//  100  209:invokevirtual   #70  <Method android.os.Looper Handler.getLooper()>
		//  101  212:invokespecial   #149 <Method void MetadataTrackRenderer(SampleSource, com.google.android.exoplayer.metadata.MetadataParser, com.google.android.exoplayer.metadata.MetadataTrackRenderer$MetadataRenderer, android.os.Looper)>
		//  102  215:astore          8
			Object obj;
			if(flag)
		//* 103  217:iload_2         
		//* 104  218:ifeq            330
			{
				obj = ((Object) (new HlsSampleSource(new HlsChunkSource(false, ((com.google.android.exoplayer.upstream.DataSource) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent))), hlsplaylist, ((com.google.android.exoplayer.hls.HlsTrackSelector) (DefaultHlsTrackSelector.newAudioInstance())), ((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter)), ptstimestampadjusterprovider), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0x360000, handler, ((com.google.android.exoplayer.hls.HlsSampleSource.EventListener) (player)), 1)));
		//  105  221:new             #110 <Class HlsSampleSource>
		//  106  224:dup             
		//  107  225:new             #112 <Class HlsChunkSource>
		//  108  228:dup             
		//  109  229:iconst_0        
		//  110  230:new             #45  <Class DefaultUriDataSource>
		//  111  233:dup             
		//  112  234:aload_0         
		//  113  235:getfield        #30  <Field Context context>
		//  114  238:aload           6
		//  115  240:aload_0         
		//  116  241:getfield        #32  <Field String userAgent>
		//  117  244:invokespecial   #115 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
		//  118  247:aload_1         
		//  119  248:invokestatic    #153 <Method DefaultHlsTrackSelector DefaultHlsTrackSelector.newAudioInstance()>
		//  120  251:aload           6
		//  121  253:aload           11
		//  122  255:invokespecial   #124 <Method void HlsChunkSource(boolean, com.google.android.exoplayer.upstream.DataSource, HlsPlaylist, com.google.android.exoplayer.hls.HlsTrackSelector, com.google.android.exoplayer.upstream.BandwidthMeter, PtsTimestampAdjusterProvider)>
		//  123  258:aload           10
		//  124  260:ldc1            #154 <Int 0x360000>
		//  125  262:aload           9
		//  126  264:aload_0         
		//  127  265:getfield        #38  <Field ExoPlayerInterface player>
		//  128  268:iconst_1        
		//  129  269:invokespecial   #128 <Method void HlsSampleSource(HlsChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.hls.HlsSampleSource$EventListener, int)>
		//  130  272:astore          5
				SampleSource asamplesource[] = new SampleSource[2];
		//  131  274:iconst_2        
		//  132  275:anewarray       SampleSource[]
		//  133  278:astore          13
				asamplesource[0] = ((SampleSource) (hlssamplesource));
		//  134  280:aload           13
		//  135  282:iconst_0        
		//  136  283:aload           12
		//  137  285:aastore         
				asamplesource[1] = ((SampleSource) (obj));
		//  138  286:aload           13
		//  139  288:iconst_1        
		//  140  289:aload           5
		//  141  291:aastore         
				obj = ((Object) (new MediaCodecAudioTrackRenderer(asamplesource, MediaCodecSelector.DEFAULT, ((com.google.android.exoplayer.drm.DrmSessionManager) (null)), true, player.getMainHandler(), ((com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener) (player)), AudioCapabilities.getCapabilities(context), 3)));
		//  142  292:new             #158 <Class MediaCodecAudioTrackRenderer>
		//  143  295:dup             
		//  144  296:aload           13
		//  145  298:getstatic       #136 <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
		//  146  301:aconst_null     
		//  147  302:iconst_1        
		//  148  303:aload_0         
		//  149  304:getfield        #38  <Field ExoPlayerInterface player>
		//  150  307:invokevirtual   #64  <Method Handler ExoPlayerInterface.getMainHandler()>
		//  151  310:aload_0         
		//  152  311:getfield        #38  <Field ExoPlayerInterface player>
		//  153  314:aload_0         
		//  154  315:getfield        #30  <Field Context context>
		//  155  318:invokestatic    #164 <Method AudioCapabilities AudioCapabilities.getCapabilities(Context)>
		//  156  321:iconst_3        
		//  157  322:invokespecial   #167 <Method void MediaCodecAudioTrackRenderer(SampleSource[], MediaCodecSelector, com.google.android.exoplayer.drm.DrmSessionManager, boolean, Handler, com.google.android.exoplayer.MediaCodecAudioTrackRenderer$EventListener, AudioCapabilities, int)>
		//  158  325:astore          5
			} else
		//* 159  327:goto            365
			{
				obj = ((Object) (new MediaCodecAudioTrackRenderer(((SampleSource) (hlssamplesource)), MediaCodecSelector.DEFAULT, ((com.google.android.exoplayer.drm.DrmSessionManager) (null)), true, player.getMainHandler(), ((com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener) (player)), AudioCapabilities.getCapabilities(context), 3)));
		//  160  330:new             #158 <Class MediaCodecAudioTrackRenderer>
		//  161  333:dup             
		//  162  334:aload           12
		//  163  336:getstatic       #136 <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
		//  164  339:aconst_null     
		//  165  340:iconst_1        
		//  166  341:aload_0         
		//  167  342:getfield        #38  <Field ExoPlayerInterface player>
		//  168  345:invokevirtual   #64  <Method Handler ExoPlayerInterface.getMainHandler()>
		//  169  348:aload_0         
		//  170  349:getfield        #38  <Field ExoPlayerInterface player>
		//  171  352:aload_0         
		//  172  353:getfield        #30  <Field Context context>
		//  173  356:invokestatic    #164 <Method AudioCapabilities AudioCapabilities.getCapabilities(Context)>
		//  174  359:iconst_3        
		//  175  360:invokespecial   #170 <Method void MediaCodecAudioTrackRenderer(SampleSource, MediaCodecSelector, com.google.android.exoplayer.drm.DrmSessionManager, boolean, Handler, com.google.android.exoplayer.MediaCodecAudioTrackRenderer$EventListener, AudioCapabilities, int)>
		//  176  363:astore          5
			}
			String s = subtitlesUrl;
		//  177  365:aload_0         
		//  178  366:getfield        #36  <Field String subtitlesUrl>
		//  179  369:astore          13
			if(s != null && !s.isEmpty())
		//* 180  371:aload           13
		//* 181  373:ifnull          461
		//* 182  376:aload           13
		//* 183  378:invokevirtual   #173 <Method boolean String.isEmpty()>
		//* 184  381:ifne            461
			{
				hlsplaylist = ((HlsPlaylist) (MediaFormat.createTextFormat("0", "application/x-subrip", -1, -2L, ((String) (null)))));
		//  185  384:ldc1            #175 <String "0">
		//  186  386:ldc1            #177 <String "application/x-subrip">
		//  187  388:iconst_m1       
		//  188  389:ldc2w           #178 <Long -2L>
		//  189  392:aconst_null     
		//  190  393:invokestatic    #185 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
		//  191  396:astore_1        
				hlsplaylist = ((HlsPlaylist) (new TextTrackRenderer(((SampleSource) (new SingleSampleSource(Uri.parse(subtitlesUrl), ((com.google.android.exoplayer.upstream.DataSource) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent))), ((MediaFormat) (hlsplaylist))))), ((com.google.android.exoplayer.text.TextRenderer) (player)), handler.getLooper(), new SubtitleParser[0])));
		//  192  397:new             #187 <Class TextTrackRenderer>
		//  193  400:dup             
		//  194  401:new             #189 <Class SingleSampleSource>
		//  195  404:dup             
		//  196  405:aload_0         
		//  197  406:getfield        #36  <Field String subtitlesUrl>
		//  198  409:invokestatic    #195 <Method Uri Uri.parse(String)>
		//  199  412:new             #45  <Class DefaultUriDataSource>
		//  200  415:dup             
		//  201  416:aload_0         
		//  202  417:getfield        #30  <Field Context context>
		//  203  420:aload           6
		//  204  422:aload_0         
		//  205  423:getfield        #32  <Field String userAgent>
		//  206  426:invokespecial   #115 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
		//  207  429:aload_1         
		//  208  430:invokespecial   #198 <Method void SingleSampleSource(Uri, com.google.android.exoplayer.upstream.DataSource, MediaFormat)>
		//  209  433:aload_0         
		//  210  434:getfield        #38  <Field ExoPlayerInterface player>
		//  211  437:aload           9
		//  212  439:invokevirtual   #70  <Method android.os.Looper Handler.getLooper()>
		//  213  442:iconst_0        
		//  214  443:anewarray       SubtitleParser[]
		//  215  446:invokespecial   #203 <Method void TextTrackRenderer(SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper, SubtitleParser[])>
		//  216  449:astore_1        
				APSMediaPlayer.getInstance().log("Loading cues from SubRip");
		//  217  450:invokestatic    #209 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
		//  218  453:ldc1            #211 <String "Loading cues from SubRip">
		//  219  455:invokevirtual   #215 <Method void APSMediaPlayer.log(String)>
			} else
		//* 220  458:goto            559
			if(flag1)
		//* 221  461:iload_3         
		//* 222  462:ifeq            540
				hlsplaylist = ((HlsPlaylist) (new TextTrackRenderer(((SampleSource) (new HlsSampleSource(new HlsChunkSource(false, ((com.google.android.exoplayer.upstream.DataSource) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent))), hlsplaylist, ((com.google.android.exoplayer.hls.HlsTrackSelector) (DefaultHlsTrackSelector.newSubtitleInstance())), ((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter)), ptstimestampadjusterprovider), ((com.google.android.exoplayer.LoadControl) (defaultloadcontrol)), 0x20000, handler, ((com.google.android.exoplayer.hls.HlsSampleSource.EventListener) (player)), 2))), ((com.google.android.exoplayer.text.TextRenderer) (player)), handler.getLooper(), new SubtitleParser[0])));
		//  223  465:new             #187 <Class TextTrackRenderer>
		//  224  468:dup             
		//  225  469:new             #110 <Class HlsSampleSource>
		//  226  472:dup             
		//  227  473:new             #112 <Class HlsChunkSource>
		//  228  476:dup             
		//  229  477:iconst_0        
		//  230  478:new             #45  <Class DefaultUriDataSource>
		//  231  481:dup             
		//  232  482:aload_0         
		//  233  483:getfield        #30  <Field Context context>
		//  234  486:aload           6
		//  235  488:aload_0         
		//  236  489:getfield        #32  <Field String userAgent>
		//  237  492:invokespecial   #115 <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
		//  238  495:aload_1         
		//  239  496:invokestatic    #218 <Method DefaultHlsTrackSelector DefaultHlsTrackSelector.newSubtitleInstance()>
		//  240  499:aload           6
		//  241  501:aload           11
		//  242  503:invokespecial   #124 <Method void HlsChunkSource(boolean, com.google.android.exoplayer.upstream.DataSource, HlsPlaylist, com.google.android.exoplayer.hls.HlsTrackSelector, com.google.android.exoplayer.upstream.BandwidthMeter, PtsTimestampAdjusterProvider)>
		//  243  506:aload           10
		//  244  508:ldc1            #219 <Int 0x20000>
		//  245  510:aload           9
		//  246  512:aload_0         
		//  247  513:getfield        #38  <Field ExoPlayerInterface player>
		//  248  516:iconst_2        
		//  249  517:invokespecial   #128 <Method void HlsSampleSource(HlsChunkSource, com.google.android.exoplayer.LoadControl, int, Handler, com.google.android.exoplayer.hls.HlsSampleSource$EventListener, int)>
		//  250  520:aload_0         
		//  251  521:getfield        #38  <Field ExoPlayerInterface player>
		//  252  524:aload           9
		//  253  526:invokevirtual   #70  <Method android.os.Looper Handler.getLooper()>
		//  254  529:iconst_0        
		//  255  530:anewarray       SubtitleParser[]
		//  256  533:invokespecial   #203 <Method void TextTrackRenderer(SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper, SubtitleParser[])>
		//  257  536:astore_1        
			else
		//* 258  537:goto            559
				hlsplaylist = ((HlsPlaylist) (new Eia608TrackRenderer(((SampleSource) (hlssamplesource)), ((com.google.android.exoplayer.text.TextRenderer) (player)), handler.getLooper())));
		//  259  540:new             #221 <Class Eia608TrackRenderer>
		//  260  543:dup             
		//  261  544:aload           12
		//  262  546:aload_0         
		//  263  547:getfield        #38  <Field ExoPlayerInterface player>
		//  264  550:aload           9
		//  265  552:invokevirtual   #70  <Method android.os.Looper Handler.getLooper()>
		//  266  555:invokespecial   #224 <Method void Eia608TrackRenderer(SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper)>
		//  267  558:astore_1        
			TrackRenderer atrackrenderer[] = new TrackRenderer[4];
		//  268  559:iconst_4        
		//  269  560:anewarray       TrackRenderer[]
		//  270  563:astore          9
			atrackrenderer[0] = ((TrackRenderer) (mediacodecvideotrackrenderer));
		//  271  565:aload           9
		//  272  567:iconst_0        
		//  273  568:aload           7
		//  274  570:aastore         
			atrackrenderer[1] = ((TrackRenderer) (obj));
		//  275  571:aload           9
		//  276  573:iconst_1        
		//  277  574:aload           5
		//  278  576:aastore         
			atrackrenderer[3] = ((TrackRenderer) (metadatatrackrenderer));
		//  279  577:aload           9
		//  280  579:iconst_3        
		//  281  580:aload           8
		//  282  582:aastore         
			atrackrenderer[2] = ((TrackRenderer) (hlsplaylist));
		//  283  583:aload           9
		//  284  585:iconst_2        
		//  285  586:aload_1         
		//  286  587:aastore         
			player.onRenderers(atrackrenderer, ((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter)));
		//  287  588:aload_0         
		//  288  589:getfield        #38  <Field ExoPlayerInterface player>
		//  289  592:aload           9
		//  290  594:aload           6
		//  291  596:invokevirtual   #230 <Method void ExoPlayerInterface.onRenderers(TrackRenderer[], com.google.android.exoplayer.upstream.BandwidthMeter)>
		//  292  599:return          
		}

		public volatile void onSingleManifest(Object obj)
		{
			onSingleManifest((HlsPlaylist)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #233 <Class HlsPlaylist>
		//    3    5:invokevirtual   #235 <Method void onSingleManifest(HlsPlaylist)>
		//    4    8:return          
		}

		public void onSingleManifestError(IOException ioexception)
		{
			if(canceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #57  <Field boolean canceled>
		//*   2    4:ifeq            8
			{
				return;
		//    3    7:return          
			} else
			{
				player.onRenderersError(((Exception) (ioexception)));
		//    4    8:aload_0         
		//    5    9:getfield        #38  <Field ExoPlayerInterface player>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #241 <Method void ExoPlayerInterface.onRenderersError(Exception)>
				return;
		//    8   16:return          
			}
		}

		private boolean canceled;
		private final Context context;
		private final ExoPlayerInterface player;
		private final ManifestFetcher playlistFetcher;
		private final String subtitlesUrl;
		private final String url;
		private final String userAgent;

		public AsyncRendererBuilder(Context context1, String s, String s1, String s2, ExoPlayerInterface exoplayerinterface)
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
			url = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #34  <Field String url>
			subtitlesUrl = s2;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #36  <Field String subtitlesUrl>
			player = exoplayerinterface;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #38  <Field ExoPlayerInterface player>
			s2 = ((String) (new HlsPlaylistParser()));
		//   17   31:new             #40  <Class HlsPlaylistParser>
		//   18   34:dup             
		//   19   35:invokespecial   #41  <Method void HlsPlaylistParser()>
		//   20   38:astore          4
			playlistFetcher = new ManifestFetcher(s1, ((com.google.android.exoplayer.upstream.UriDataSource) (new DefaultUriDataSource(context1, s))), ((com.google.android.exoplayer.upstream.UriLoadable.Parser) (s2)));
		//   21   40:aload_0         
		//   22   41:new             #43  <Class ManifestFetcher>
		//   23   44:dup             
		//   24   45:aload_3         
		//   25   46:new             #45  <Class DefaultUriDataSource>
		//   26   49:dup             
		//   27   50:aload_1         
		//   28   51:aload_2         
		//   29   52:invokespecial   #48  <Method void DefaultUriDataSource(Context, String)>
		//   30   55:aload           4
		//   31   57:invokespecial   #51  <Method void ManifestFetcher(String, com.google.android.exoplayer.upstream.UriDataSource, com.google.android.exoplayer.upstream.UriLoadable$Parser)>
		//   32   60:putfield        #53  <Field ManifestFetcher playlistFetcher>
		//   33   63:return          
		}
	}


	public HlsRendererBuilder(Context context1, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Context context>
		userAgent = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field String userAgent>
		url = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field String url>
		subtitlesUrl = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #39  <Field String subtitlesUrl>
	//   14   25:return          
	}

	public void buildRenderers(ExoPlayerInterface exoplayerinterface)
	{
		currentAsyncBuilder = new AsyncRendererBuilder(context, userAgent, url, subtitlesUrl, exoplayerinterface);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class HlsRendererBuilder$AsyncRendererBuilder>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field Context context>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field String userAgent>
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field String url>
	//    9   17:aload_0         
	//   10   18:getfield        #39  <Field String subtitlesUrl>
	//   11   21:aload_1         
	//   12   22:invokespecial   #45  <Method void HlsRendererBuilder$AsyncRendererBuilder(Context, String, String, String, ExoPlayerInterface)>
	//   13   25:putfield        #47  <Field HlsRendererBuilder$AsyncRendererBuilder currentAsyncBuilder>
		currentAsyncBuilder.init();
	//   14   28:aload_0         
	//   15   29:getfield        #47  <Field HlsRendererBuilder$AsyncRendererBuilder currentAsyncBuilder>
	//   16   32:invokevirtual   #50  <Method void HlsRendererBuilder$AsyncRendererBuilder.init()>
	//   17   35:return          
	}

	public void cancel()
	{
		AsyncRendererBuilder asyncrendererbuilder = currentAsyncBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field HlsRendererBuilder$AsyncRendererBuilder currentAsyncBuilder>
	//    2    4:astore_1        
		if(asyncrendererbuilder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			asyncrendererbuilder.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #53  <Method void HlsRendererBuilder$AsyncRendererBuilder.cancel()>
			currentAsyncBuilder = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #47  <Field HlsRendererBuilder$AsyncRendererBuilder currentAsyncBuilder>
		}
	//   10   18:return          
	}

	private static final int AUDIO_BUFFER_SEGMENTS = 54;
	private static final int BUFFER_SEGMENT_SIZE = 0x10000;
	private static final int MAIN_BUFFER_SEGMENTS = 254;
	private static final int TEXT_BUFFER_SEGMENTS = 2;
	private final Context context;
	private AsyncRendererBuilder currentAsyncBuilder;
	private final String subtitlesUrl;
	private final String url;
	private final String userAgent;
}
