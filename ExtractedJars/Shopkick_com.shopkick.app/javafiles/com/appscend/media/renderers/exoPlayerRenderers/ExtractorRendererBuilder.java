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
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorSampleSource;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextTrackRenderer;
import com.google.android.exoplayer.upstream.*;

// Referenced classes of package com.appscend.media.renderers.exoPlayerRenderers:
//			ExoPlayerInterface

public class ExtractorRendererBuilder
	implements ExoPlayerInterface.RendererBuilder
{

	public ExtractorRendererBuilder(Context context1, String s, Uri uri1, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Context context>
		userAgent = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String userAgent>
		uri = uri1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Uri uri>
		subtitlesUrl = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field String subtitlesUrl>
	//   14   25:return          
	}

	public void buildRenderers(ExoPlayerInterface exoplayerinterface)
	{
		Object obj1 = ((Object) (new DefaultAllocator(0x10000)));
	//    0    0:new             #36  <Class DefaultAllocator>
	//    1    3:dup             
	//    2    4:ldc1            #11  <Int 0x10000>
	//    3    6:invokespecial   #39  <Method void DefaultAllocator(int)>
	//    4    9:astore          4
		Object obj = ((Object) (exoplayerinterface.getMainHandler()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #45  <Method Handler ExoPlayerInterface.getMainHandler()>
	//    7   15:astore_2        
		DefaultBandwidthMeter defaultbandwidthmeter = new DefaultBandwidthMeter(((Handler) (obj)), ((com.google.android.exoplayer.upstream.BandwidthMeter.EventListener) (null)));
	//    8   16:new             #47  <Class DefaultBandwidthMeter>
	//    9   19:dup             
	//   10   20:aload_2         
	//   11   21:aconst_null     
	//   12   22:invokespecial   #50  <Method void DefaultBandwidthMeter(Handler, com.google.android.exoplayer.upstream.BandwidthMeter$EventListener)>
	//   13   25:astore_3        
		Object obj2 = ((Object) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent)));
	//   14   26:new             #52  <Class DefaultUriDataSource>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:getfield        #25  <Field Context context>
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #27  <Field String userAgent>
	//   21   39:invokespecial   #55  <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//   22   42:astore          5
		Object obj3 = ((Object) (new ExtractorSampleSource(uri, ((com.google.android.exoplayer.upstream.DataSource) (obj2)), ((com.google.android.exoplayer.upstream.Allocator) (obj1)), 0x1000000, ((Handler) (obj)), ((com.google.android.exoplayer.extractor.ExtractorSampleSource.EventListener) (exoplayerinterface)), 0, new Extractor[0])));
	//   23   44:new             #57  <Class ExtractorSampleSource>
	//   24   47:dup             
	//   25   48:aload_0         
	//   26   49:getfield        #29  <Field Uri uri>
	//   27   52:aload           5
	//   28   54:aload           4
	//   29   56:ldc1            #58  <Int 0x1000000>
	//   30   58:aload_2         
	//   31   59:aload_1         
	//   32   60:iconst_0        
	//   33   61:iconst_0        
	//   34   62:anewarray       Extractor[]
	//   35   65:invokespecial   #63  <Method void ExtractorSampleSource(Uri, com.google.android.exoplayer.upstream.DataSource, com.google.android.exoplayer.upstream.Allocator, int, Handler, com.google.android.exoplayer.extractor.ExtractorSampleSource$EventListener, int, Extractor[])>
	//   36   68:astore          6
		obj1 = ((Object) (new MediaCodecVideoTrackRenderer(context, ((com.google.android.exoplayer.SampleSource) (obj3)), MediaCodecSelector.DEFAULT, 1, 5000L, ((Handler) (obj)), ((com.google.android.exoplayer.MediaCodecVideoTrackRenderer.EventListener) (exoplayerinterface)), 50)));
	//   37   70:new             #65  <Class MediaCodecVideoTrackRenderer>
	//   38   73:dup             
	//   39   74:aload_0         
	//   40   75:getfield        #25  <Field Context context>
	//   41   78:aload           6
	//   42   80:getstatic       #71  <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//   43   83:iconst_1        
	//   44   84:ldc2w           #72  <Long 5000L>
	//   45   87:aload_2         
	//   46   88:aload_1         
	//   47   89:bipush          50
	//   48   91:invokespecial   #76  <Method void MediaCodecVideoTrackRenderer(Context, com.google.android.exoplayer.SampleSource, MediaCodecSelector, int, long, Handler, com.google.android.exoplayer.MediaCodecVideoTrackRenderer$EventListener, int)>
	//   49   94:astore          4
		obj2 = ((Object) (new MediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj3)), MediaCodecSelector.DEFAULT, ((com.google.android.exoplayer.drm.DrmSessionManager) (null)), true, ((Handler) (obj)), ((com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener) (exoplayerinterface)), AudioCapabilities.getCapabilities(context), 3)));
	//   50   96:new             #78  <Class MediaCodecAudioTrackRenderer>
	//   51   99:dup             
	//   52  100:aload           6
	//   53  102:getstatic       #71  <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//   54  105:aconst_null     
	//   55  106:iconst_1        
	//   56  107:aload_2         
	//   57  108:aload_1         
	//   58  109:aload_0         
	//   59  110:getfield        #25  <Field Context context>
	//   60  113:invokestatic    #84  <Method AudioCapabilities AudioCapabilities.getCapabilities(Context)>
	//   61  116:iconst_3        
	//   62  117:invokespecial   #87  <Method void MediaCodecAudioTrackRenderer(com.google.android.exoplayer.SampleSource, MediaCodecSelector, com.google.android.exoplayer.drm.DrmSessionManager, boolean, Handler, com.google.android.exoplayer.MediaCodecAudioTrackRenderer$EventListener, AudioCapabilities, int)>
	//   63  120:astore          5
		String s = subtitlesUrl;
	//   64  122:aload_0         
	//   65  123:getfield        #31  <Field String subtitlesUrl>
	//   66  126:astore          7
		if(s != null && !s.isEmpty())
	//*  67  128:aload           7
	//*  68  130:ifnull          215
	//*  69  133:aload           7
	//*  70  135:invokevirtual   #93  <Method boolean String.isEmpty()>
	//*  71  138:ifne            215
		{
			obj3 = ((Object) (MediaFormat.createTextFormat("0", "application/x-subrip", -1, -2L, ((String) (null)))));
	//   72  141:ldc1            #95  <String "0">
	//   73  143:ldc1            #97  <String "application/x-subrip">
	//   74  145:iconst_m1       
	//   75  146:ldc2w           #98  <Long -2L>
	//   76  149:aconst_null     
	//   77  150:invokestatic    #105 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
	//   78  153:astore          6
			obj = ((Object) (new TextTrackRenderer(((com.google.android.exoplayer.SampleSource) (new SingleSampleSource(Uri.parse(subtitlesUrl), ((com.google.android.exoplayer.upstream.DataSource) (new DefaultUriDataSource(context, ((com.google.android.exoplayer.upstream.TransferListener) (defaultbandwidthmeter)), userAgent))), ((MediaFormat) (obj3))))), ((com.google.android.exoplayer.text.TextRenderer) (exoplayerinterface)), ((Handler) (obj)).getLooper(), new SubtitleParser[0])));
	//   79  155:new             #107 <Class TextTrackRenderer>
	//   80  158:dup             
	//   81  159:new             #109 <Class SingleSampleSource>
	//   82  162:dup             
	//   83  163:aload_0         
	//   84  164:getfield        #31  <Field String subtitlesUrl>
	//   85  167:invokestatic    #115 <Method Uri Uri.parse(String)>
	//   86  170:new             #52  <Class DefaultUriDataSource>
	//   87  173:dup             
	//   88  174:aload_0         
	//   89  175:getfield        #25  <Field Context context>
	//   90  178:aload_3         
	//   91  179:aload_0         
	//   92  180:getfield        #27  <Field String userAgent>
	//   93  183:invokespecial   #55  <Method void DefaultUriDataSource(Context, com.google.android.exoplayer.upstream.TransferListener, String)>
	//   94  186:aload           6
	//   95  188:invokespecial   #118 <Method void SingleSampleSource(Uri, com.google.android.exoplayer.upstream.DataSource, MediaFormat)>
	//   96  191:aload_1         
	//   97  192:aload_2         
	//   98  193:invokevirtual   #124 <Method android.os.Looper Handler.getLooper()>
	//   99  196:iconst_0        
	//  100  197:anewarray       SubtitleParser[]
	//  101  200:invokespecial   #129 <Method void TextTrackRenderer(com.google.android.exoplayer.SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper, SubtitleParser[])>
	//  102  203:astore_2        
			APSMediaPlayer.getInstance().log("Loading cues from SubRip");
	//  103  204:invokestatic    #135 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  104  207:ldc1            #137 <String "Loading cues from SubRip">
	//  105  209:invokevirtual   #141 <Method void APSMediaPlayer.log(String)>
		} else
	//* 106  212:goto            234
		{
			obj = ((Object) (new TextTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj3)), ((com.google.android.exoplayer.text.TextRenderer) (exoplayerinterface)), ((Handler) (obj)).getLooper(), new SubtitleParser[0])));
	//  107  215:new             #107 <Class TextTrackRenderer>
	//  108  218:dup             
	//  109  219:aload           6
	//  110  221:aload_1         
	//  111  222:aload_2         
	//  112  223:invokevirtual   #124 <Method android.os.Looper Handler.getLooper()>
	//  113  226:iconst_0        
	//  114  227:anewarray       SubtitleParser[]
	//  115  230:invokespecial   #129 <Method void TextTrackRenderer(com.google.android.exoplayer.SampleSource, com.google.android.exoplayer.text.TextRenderer, android.os.Looper, SubtitleParser[])>
	//  116  233:astore_2        
		}
		TrackRenderer atrackrenderer[] = new TrackRenderer[4];
	//  117  234:iconst_4        
	//  118  235:anewarray       TrackRenderer[]
	//  119  238:astore          6
		atrackrenderer[0] = ((TrackRenderer) (obj1));
	//  120  240:aload           6
	//  121  242:iconst_0        
	//  122  243:aload           4
	//  123  245:aastore         
		atrackrenderer[1] = ((TrackRenderer) (obj2));
	//  124  246:aload           6
	//  125  248:iconst_1        
	//  126  249:aload           5
	//  127  251:aastore         
		atrackrenderer[2] = ((TrackRenderer) (obj));
	//  128  252:aload           6
	//  129  254:iconst_2        
	//  130  255:aload_2         
	//  131  256:aastore         
		exoplayerinterface.onRenderers(atrackrenderer, ((com.google.android.exoplayer.upstream.BandwidthMeter) (defaultbandwidthmeter)));
	//  132  257:aload_1         
	//  133  258:aload           6
	//  134  260:aload_3         
	//  135  261:invokevirtual   #147 <Method void ExoPlayerInterface.onRenderers(TrackRenderer[], com.google.android.exoplayer.upstream.BandwidthMeter)>
	//  136  264:return          
	}

	public void cancel()
	{
	//    0    0:return          
	}

	private static final int BUFFER_SEGMENT_COUNT = 256;
	private static final int BUFFER_SEGMENT_SIZE = 0x10000;
	private final Context context;
	private final String subtitlesUrl;
	private final Uri uri;
	private final String userAgent;
}
