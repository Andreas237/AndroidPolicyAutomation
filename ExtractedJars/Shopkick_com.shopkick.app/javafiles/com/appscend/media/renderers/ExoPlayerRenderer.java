// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.accessibility.CaptioningManager;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.renderers.exoPlayerRenderers.DashRendererBuilder;
import com.appscend.media.renderers.exoPlayerRenderers.DemoUtil;
import com.appscend.media.renderers.exoPlayerRenderers.EventLogger;
import com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface;
import com.appscend.media.renderers.exoPlayerRenderers.ExtractorRendererBuilder;
import com.appscend.media.renderers.exoPlayerRenderers.HlsRendererBuilder;
import com.appscend.media.renderers.exoPlayerRenderers.PlayerView;
import com.appscend.media.renderers.exoPlayerRenderers.SmoothStreamingRendererBuilder;
import com.appscend.media.renderers.exoPlayerRenderers.SmoothStreamingTestMediaDrmCallback;
import com.appscend.media.renderers.exoPlayerRenderers.WidevineTestMediaDrmCallback;
import com.google.android.exoplayer.AspectRatioFrameLayout;
import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.audio.AudioCapabilitiesReceiver;
import com.google.android.exoplayer.metadata.id3.*;
import com.google.android.exoplayer.text.CaptionStyleCompat;
import com.google.android.exoplayer.text.SubtitleLayout;
import java.util.*;

// Referenced classes of package com.appscend.media.renderers:
//			IVeeplayRenderer

public class ExoPlayerRenderer
	implements com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.Listener, com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.CaptionListener, com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.Id3MetadataListener, com.google.android.exoplayer.audio.AudioCapabilitiesReceiver.Listener, IVeeplayRenderer
{

	public ExoPlayerRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		isBuffering = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #58  <Field boolean isBuffering>
		statePlayableFired = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #60  <Field boolean statePlayableFired>
		veeplayInstance = APSMediaPlayer.getInstance();
	//    8   14:aload_0         
	//    9   15:invokestatic    #66  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   10   18:putfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   11   21:return          
	}

	private void configureSubtitleView()
	{
	//    0    0:return          
	}

	public static int getPriorityIndex()
	{
		if(Build.MANUFACTURER.equals("Amazon") && Build.MODEL.startsWith("KF"))
	//*   0    0:getstatic       #76  <Field String Build.MANUFACTURER>
	//*   1    3:ldc1            #78  <String "Amazon">
	//*   2    5:invokevirtual   #84  <Method boolean String.equals(Object)>
	//*   3    8:ifeq            24
	//*   4   11:getstatic       #87  <Field String Build.MODEL>
	//*   5   14:ldc1            #89  <String "KF">
	//*   6   16:invokevirtual   #93  <Method boolean String.startsWith(String)>
	//*   7   19:ifeq            24
			return 0;
	//    8   22:iconst_0        
	//    9   23:ireturn         
		return android.os.Build.VERSION.SDK_INT <= 15 ? 0 : 1;
	//   10   24:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//   11   27:bipush          15
	//   12   29:icmple          34
	//   13   32:iconst_1        
	//   14   33:ireturn         
	//   15   34:iconst_0        
	//   16   35:ireturn         
	}

	private com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.RendererBuilder getRendererBuilder()
	{
		String s = DemoUtil.getUserAgent(((android.content.Context) (parentActivity)));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Activity parentActivity>
	//    2    4:invokestatic    #109 <Method String DemoUtil.getUserAgent(android.content.Context)>
	//    3    7:astore_1        
		if(contentUri.toString().contains("m3u8"))
	//*   4    8:aload_0         
	//*   5    9:getfield        #111 <Field Uri contentUri>
	//*   6   12:invokevirtual   #117 <Method String Uri.toString()>
	//*   7   15:ldc1            #119 <String "m3u8">
	//*   8   17:invokevirtual   #123 <Method boolean String.contains(CharSequence)>
	//*   9   20:ifeq            47
			return ((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.RendererBuilder) (new HlsRendererBuilder(((android.content.Context) (parentActivity)), s, contentUri.toString(), subtitlesUrl)));
	//   10   23:new             #125 <Class HlsRendererBuilder>
	//   11   26:dup             
	//   12   27:aload_0         
	//   13   28:getfield        #103 <Field Activity parentActivity>
	//   14   31:aload_1         
	//   15   32:aload_0         
	//   16   33:getfield        #111 <Field Uri contentUri>
	//   17   36:invokevirtual   #117 <Method String Uri.toString()>
	//   18   39:aload_0         
	//   19   40:getfield        #127 <Field String subtitlesUrl>
	//   20   43:invokespecial   #130 <Method void HlsRendererBuilder(android.content.Context, String, String, String)>
	//   21   46:areturn         
		if(contentUri.toString().endsWith(".mpd"))
	//*  22   47:aload_0         
	//*  23   48:getfield        #111 <Field Uri contentUri>
	//*  24   51:invokevirtual   #117 <Method String Uri.toString()>
	//*  25   54:ldc1            #132 <String ".mpd">
	//*  26   56:invokevirtual   #135 <Method boolean String.endsWith(String)>
	//*  27   59:ifeq            109
			return ((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.RendererBuilder) (new DashRendererBuilder(((android.content.Context) (parentActivity)), s, contentUri.toString(), ((com.google.android.exoplayer.drm.MediaDrmCallback) (new WidevineTestMediaDrmCallback(contentUri.toString().toLowerCase(Locale.US).replaceAll("\\s", "")))))));
	//   28   62:new             #137 <Class DashRendererBuilder>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:getfield        #103 <Field Activity parentActivity>
	//   32   70:aload_1         
	//   33   71:aload_0         
	//   34   72:getfield        #111 <Field Uri contentUri>
	//   35   75:invokevirtual   #117 <Method String Uri.toString()>
	//   36   78:new             #139 <Class WidevineTestMediaDrmCallback>
	//   37   81:dup             
	//   38   82:aload_0         
	//   39   83:getfield        #111 <Field Uri contentUri>
	//   40   86:invokevirtual   #117 <Method String Uri.toString()>
	//   41   89:getstatic       #145 <Field Locale Locale.US>
	//   42   92:invokevirtual   #149 <Method String String.toLowerCase(Locale)>
	//   43   95:ldc1            #151 <String "\\s">
	//   44   97:ldc1            #153 <String "">
	//   45   99:invokevirtual   #157 <Method String String.replaceAll(String, String)>
	//   46  102:invokespecial   #160 <Method void WidevineTestMediaDrmCallback(String)>
	//   47  105:invokespecial   #163 <Method void DashRendererBuilder(android.content.Context, String, String, com.google.android.exoplayer.drm.MediaDrmCallback)>
	//   48  108:areturn         
		if(contentUri.toString().endsWith(".ism"))
	//*  49  109:aload_0         
	//*  50  110:getfield        #111 <Field Uri contentUri>
	//*  51  113:invokevirtual   #117 <Method String Uri.toString()>
	//*  52  116:ldc1            #165 <String ".ism">
	//*  53  118:invokevirtual   #135 <Method boolean String.endsWith(String)>
	//*  54  121:ifeq            151
			return ((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.RendererBuilder) (new SmoothStreamingRendererBuilder(((android.content.Context) (parentActivity)), s, contentUri.toString(), ((com.google.android.exoplayer.drm.MediaDrmCallback) (new SmoothStreamingTestMediaDrmCallback())))));
	//   55  124:new             #167 <Class SmoothStreamingRendererBuilder>
	//   56  127:dup             
	//   57  128:aload_0         
	//   58  129:getfield        #103 <Field Activity parentActivity>
	//   59  132:aload_1         
	//   60  133:aload_0         
	//   61  134:getfield        #111 <Field Uri contentUri>
	//   62  137:invokevirtual   #117 <Method String Uri.toString()>
	//   63  140:new             #169 <Class SmoothStreamingTestMediaDrmCallback>
	//   64  143:dup             
	//   65  144:invokespecial   #170 <Method void SmoothStreamingTestMediaDrmCallback()>
	//   66  147:invokespecial   #171 <Method void SmoothStreamingRendererBuilder(android.content.Context, String, String, com.google.android.exoplayer.drm.MediaDrmCallback)>
	//   67  150:areturn         
		else
			return ((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.RendererBuilder) (new ExtractorRendererBuilder(((android.content.Context) (parentActivity)), s, contentUri, subtitlesUrl)));
	//   68  151:new             #173 <Class ExtractorRendererBuilder>
	//   69  154:dup             
	//   70  155:aload_0         
	//   71  156:getfield        #103 <Field Activity parentActivity>
	//   72  159:aload_1         
	//   73  160:aload_0         
	//   74  161:getfield        #111 <Field Uri contentUri>
	//   75  164:aload_0         
	//   76  165:getfield        #127 <Field String subtitlesUrl>
	//   77  168:invokespecial   #176 <Method void ExtractorRendererBuilder(android.content.Context, String, Uri, String)>
	//   78  171:areturn         
	}

	private float getUserCaptionFontScaleV19()
	{
		return ((CaptioningManager)parentActivity.getSystemService("captioning")).getFontScale();
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Activity parentActivity>
	//    2    4:ldc1            #183 <String "captioning">
	//    3    6:invokevirtual   #189 <Method Object Activity.getSystemService(String)>
	//    4    9:checkcast       #191 <Class CaptioningManager>
	//    5   12:invokevirtual   #194 <Method float CaptioningManager.getFontScale()>
	//    6   15:freturn         
	}

	private CaptionStyleCompat getUserCaptionStyleV19()
	{
		return CaptionStyleCompat.createFromCaptionStyle(((CaptioningManager)parentActivity.getSystemService("captioning")).getUserStyle());
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Activity parentActivity>
	//    2    4:ldc1            #183 <String "captioning">
	//    3    6:invokevirtual   #189 <Method Object Activity.getSystemService(String)>
	//    4    9:checkcast       #191 <Class CaptioningManager>
	//    5   12:invokevirtual   #201 <Method android.view.accessibility.CaptioningManager$CaptionStyle CaptioningManager.getUserStyle()>
	//    6   15:invokestatic    #207 <Method CaptionStyleCompat CaptionStyleCompat.createFromCaptionStyle(android.view.accessibility.CaptioningManager$CaptionStyle)>
	//    7   18:areturn         
	}

	private boolean haveTracks(int i)
	{
		ExoPlayerInterface exoplayerinterface = player;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:astore_2        
		return exoplayerinterface != null && exoplayerinterface.getTrackCount(i) > 0;
	//    3    5:aload_2         
	//    4    6:ifnull          19
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #217 <Method int ExoPlayerInterface.getTrackCount(int)>
	//    8   14:ifle            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	private void preparePlayer()
	{
		if(player == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field ExoPlayerInterface player>
	//*   2    4:ifnonnull       113
		{
			player = new ExoPlayerInterface(getRendererBuilder());
	//    3    7:aload_0         
	//    4    8:new             #213 <Class ExoPlayerInterface>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #220 <Method com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$RendererBuilder getRendererBuilder()>
	//    8   16:invokespecial   #223 <Method void ExoPlayerInterface(com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$RendererBuilder)>
	//    9   19:putfield        #211 <Field ExoPlayerInterface player>
			player.addListener(((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.Listener) (this)));
	//   10   22:aload_0         
	//   11   23:getfield        #211 <Field ExoPlayerInterface player>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #227 <Method void ExoPlayerInterface.addListener(com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$Listener)>
			player.setCaptionListener(((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.CaptionListener) (this)));
	//   14   30:aload_0         
	//   15   31:getfield        #211 <Field ExoPlayerInterface player>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #231 <Method void ExoPlayerInterface.setCaptionListener(com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$CaptionListener)>
			player.setMetadataListener(((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.Id3MetadataListener) (this)));
	//   18   38:aload_0         
	//   19   39:getfield        #211 <Field ExoPlayerInterface player>
	//   20   42:aload_0         
	//   21   43:invokevirtual   #235 <Method void ExoPlayerInterface.setMetadataListener(com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$Id3MetadataListener)>
			player.seekTo(playerPosition);
	//   22   46:aload_0         
	//   23   47:getfield        #211 <Field ExoPlayerInterface player>
	//   24   50:aload_0         
	//   25   51:getfield        #237 <Field long playerPosition>
	//   26   54:invokevirtual   #241 <Method void ExoPlayerInterface.seekTo(long)>
			playerNeedsPrepare = true;
	//   27   57:aload_0         
	//   28   58:iconst_1        
	//   29   59:putfield        #243 <Field boolean playerNeedsPrepare>
			eventLogger = new EventLogger();
	//   30   62:aload_0         
	//   31   63:new             #245 <Class EventLogger>
	//   32   66:dup             
	//   33   67:invokespecial   #246 <Method void EventLogger()>
	//   34   70:putfield        #248 <Field EventLogger eventLogger>
			eventLogger.startSession();
	//   35   73:aload_0         
	//   36   74:getfield        #248 <Field EventLogger eventLogger>
	//   37   77:invokevirtual   #251 <Method void EventLogger.startSession()>
			player.addListener(((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.Listener) (eventLogger)));
	//   38   80:aload_0         
	//   39   81:getfield        #211 <Field ExoPlayerInterface player>
	//   40   84:aload_0         
	//   41   85:getfield        #248 <Field EventLogger eventLogger>
	//   42   88:invokevirtual   #227 <Method void ExoPlayerInterface.addListener(com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$Listener)>
			player.setInfoListener(((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.InfoListener) (eventLogger)));
	//   43   91:aload_0         
	//   44   92:getfield        #211 <Field ExoPlayerInterface player>
	//   45   95:aload_0         
	//   46   96:getfield        #248 <Field EventLogger eventLogger>
	//   47   99:invokevirtual   #255 <Method void ExoPlayerInterface.setInfoListener(com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$InfoListener)>
			player.setInternalErrorListener(((com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface.InternalErrorListener) (eventLogger)));
	//   48  102:aload_0         
	//   49  103:getfield        #211 <Field ExoPlayerInterface player>
	//   50  106:aload_0         
	//   51  107:getfield        #248 <Field EventLogger eventLogger>
	//   52  110:invokevirtual   #259 <Method void ExoPlayerInterface.setInternalErrorListener(com.appscend.media.renderers.exoPlayerRenderers.ExoPlayerInterface$InternalErrorListener)>
		}
		if(playerNeedsPrepare)
	//*  53  113:aload_0         
	//*  54  114:getfield        #243 <Field boolean playerNeedsPrepare>
	//*  55  117:ifeq            132
		{
			player.prepare();
	//   56  120:aload_0         
	//   57  121:getfield        #211 <Field ExoPlayerInterface player>
	//   58  124:invokevirtual   #262 <Method void ExoPlayerInterface.prepare()>
			playerNeedsPrepare = false;
	//   59  127:aload_0         
	//   60  128:iconst_0        
	//   61  129:putfield        #243 <Field boolean playerNeedsPrepare>
		}
		playerView.acquireVideoTexture(((android.content.Context) (parentActivity)), player);
	//   62  132:aload_0         
	//   63  133:getfield        #264 <Field PlayerView playerView>
	//   64  136:aload_0         
	//   65  137:getfield        #103 <Field Activity parentActivity>
	//   66  140:aload_0         
	//   67  141:getfield        #211 <Field ExoPlayerInterface player>
	//   68  144:invokevirtual   #270 <Method void PlayerView.acquireVideoTexture(android.content.Context, ExoPlayerInterface)>
		player.setPlayWhenReady(true);
	//   69  147:aload_0         
	//   70  148:getfield        #211 <Field ExoPlayerInterface player>
	//   71  151:iconst_1        
	//   72  152:invokevirtual   #274 <Method void ExoPlayerInterface.setPlayWhenReady(boolean)>
	//   73  155:return          
	}

	private void releasePlayer()
	{
		Object obj = ((Object) (parentActivity));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Activity parentActivity>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			((Activity) (obj)).getWindow().clearFlags(128);
	//    5    9:aload_1         
	//    6   10:invokevirtual   #279 <Method Window Activity.getWindow()>
	//    7   13:sipush          128
	//    8   16:invokevirtual   #285 <Method void Window.clearFlags(int)>
		obj = ((Object) (player));
	//    9   19:aload_0         
	//   10   20:getfield        #211 <Field ExoPlayerInterface player>
	//   11   23:astore_1        
		if(obj != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          60
		{
			playerPosition = ((ExoPlayerInterface) (obj)).getCurrentPosition();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #289 <Method long ExoPlayerInterface.getCurrentPosition()>
	//   17   33:putfield        #237 <Field long playerPosition>
			player.release();
	//   18   36:aload_0         
	//   19   37:getfield        #211 <Field ExoPlayerInterface player>
	//   20   40:invokevirtual   #292 <Method void ExoPlayerInterface.release()>
			player = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #211 <Field ExoPlayerInterface player>
			eventLogger.endSession();
	//   24   48:aload_0         
	//   25   49:getfield        #248 <Field EventLogger eventLogger>
	//   26   52:invokevirtual   #295 <Method void EventLogger.endSession()>
			eventLogger = null;
	//   27   55:aload_0         
	//   28   56:aconst_null     
	//   29   57:putfield        #248 <Field EventLogger eventLogger>
		}
		statePlayableFired = false;
	//   30   60:aload_0         
	//   31   61:iconst_0        
	//   32   62:putfield        #60  <Field boolean statePlayableFired>
	//   33   65:return          
	}

	public int duration()
	{
		ExoPlayerInterface exoplayerinterface = player;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:astore_1        
		if(exoplayerinterface == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return (int)exoplayerinterface.getDuration();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #299 <Method long ExoPlayerInterface.getDuration()>
	//    9   15:l2i             
	//   10   16:ireturn         
	}

	public int getCurrentPosition()
	{
		ExoPlayerInterface exoplayerinterface = player;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:astore_1        
		if(exoplayerinterface != null && !playerNeedsPrepare)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
	//*   5    9:aload_0         
	//*   6   10:getfield        #243 <Field boolean playerNeedsPrepare>
	//*   7   13:ifeq            19
	//*   8   16:goto            25
			return (int)exoplayerinterface.getCurrentPosition();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #289 <Method long ExoPlayerInterface.getCurrentPosition()>
	//   11   23:l2i             
	//   12   24:ireturn         
		else
			return 0;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public ExoPlayer getExoPlayerInstance()
	{
		return player.getExoPlayer();
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:invokevirtual   #304 <Method ExoPlayer ExoPlayerInterface.getExoPlayer()>
	//    3    7:areturn         
	}

	public View getView()
	{
		return ((View) (videoFrame));
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field AspectRatioFrameLayout videoFrame>
	//    2    4:areturn         
	}

	public boolean handlesInitialPlaybackTime()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void init(Activity activity)
	{
		if(activity == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       27
		{
			veeplayInstance.log("Renderer init called with null activity. Is the player initialized?");
	//    2    4:aload_0         
	//    3    5:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//    4    8:ldc2            #314 <String "Renderer init called with null activity. Is the player initialized?">
	//    5   11:invokevirtual   #317 <Method void APSMediaPlayer.log(String)>
			playerPosition = 0L;
	//    6   14:aload_0         
	//    7   15:lconst_0        
	//    8   16:putfield        #237 <Field long playerPosition>
			veeplayInstance.next();
	//    9   19:aload_0         
	//   10   20:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   11   23:invokevirtual   #320 <Method void APSMediaPlayer.next()>
			return;
	//   12   26:return          
		} else
		{
			playerPosition = 0L;
	//   13   27:aload_0         
	//   14   28:lconst_0        
	//   15   29:putfield        #237 <Field long playerPosition>
			parentActivity = activity;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #103 <Field Activity parentActivity>
			audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(activity.getApplicationContext(), ((com.google.android.exoplayer.audio.AudioCapabilitiesReceiver.Listener) (this)));
	//   19   37:aload_0         
	//   20   38:new             #322 <Class AudioCapabilitiesReceiver>
	//   21   41:dup             
	//   22   42:aload_1         
	//   23   43:invokevirtual   #326 <Method android.content.Context Activity.getApplicationContext()>
	//   24   46:aload_0         
	//   25   47:invokespecial   #329 <Method void AudioCapabilitiesReceiver(android.content.Context, com.google.android.exoplayer.audio.AudioCapabilitiesReceiver$Listener)>
	//   26   50:putfield        #331 <Field AudioCapabilitiesReceiver audioCapabilitiesReceiver>
			audioCapabilitiesReceiver.register();
	//   27   53:aload_0         
	//   28   54:getfield        #331 <Field AudioCapabilitiesReceiver audioCapabilitiesReceiver>
	//   29   57:invokevirtual   #335 <Method AudioCapabilities AudioCapabilitiesReceiver.register()>
	//   30   60:pop             
			shutterView = new View(((android.content.Context) (activity)));
	//   31   61:aload_0         
	//   32   62:new             #337 <Class View>
	//   33   65:dup             
	//   34   66:aload_1         
	//   35   67:invokespecial   #340 <Method void View(android.content.Context)>
	//   36   70:putfield        #342 <Field View shutterView>
			videoFrame = new AspectRatioFrameLayout(((android.content.Context) (activity)));
	//   37   73:aload_0         
	//   38   74:new             #344 <Class AspectRatioFrameLayout>
	//   39   77:dup             
	//   40   78:aload_1         
	//   41   79:invokespecial   #345 <Method void AspectRatioFrameLayout(android.content.Context)>
	//   42   82:putfield        #308 <Field AspectRatioFrameLayout videoFrame>
			playerView = new PlayerView(((android.content.Context) (activity)));
	//   43   85:aload_0         
	//   44   86:new             #266 <Class PlayerView>
	//   45   89:dup             
	//   46   90:aload_1         
	//   47   91:invokespecial   #346 <Method void PlayerView(android.content.Context)>
	//   48   94:putfield        #264 <Field PlayerView playerView>
			videoFrame.addView(((View) (playerView)));
	//   49   97:aload_0         
	//   50   98:getfield        #308 <Field AspectRatioFrameLayout videoFrame>
	//   51  101:aload_0         
	//   52  102:getfield        #264 <Field PlayerView playerView>
	//   53  105:invokevirtual   #350 <Method void AspectRatioFrameLayout.addView(View)>
			subtitleLayout = new SubtitleLayout(((android.content.Context) (activity)));
	//   54  108:aload_0         
	//   55  109:new             #352 <Class SubtitleLayout>
	//   56  112:dup             
	//   57  113:aload_1         
	//   58  114:invokespecial   #353 <Method void SubtitleLayout(android.content.Context)>
	//   59  117:putfield        #355 <Field SubtitleLayout subtitleLayout>
			videoFrame.addView(((View) (subtitleLayout)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   60  120:aload_0         
	//   61  121:getfield        #308 <Field AspectRatioFrameLayout videoFrame>
	//   62  124:aload_0         
	//   63  125:getfield        #355 <Field SubtitleLayout subtitleLayout>
	//   64  128:new             #357 <Class android.widget.FrameLayout$LayoutParams>
	//   65  131:dup             
	//   66  132:iconst_m1       
	//   67  133:iconst_m1       
	//   68  134:invokespecial   #360 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   69  137:invokevirtual   #363 <Method void AspectRatioFrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			configureSubtitleView();
	//   70  140:aload_0         
	//   71  141:invokespecial   #365 <Method void configureSubtitleView()>
			DemoUtil.setDefaultCookieManager();
	//   72  144:invokestatic    #368 <Method void DemoUtil.setDefaultCookieManager()>
			return;
	//   73  147:return          
		}
	}

	public void onActivityPaused()
	{
	//    0    0:return          
	}

	public void onActivityResumed()
	{
		recylePlayerView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #373 <Method void recylePlayerView()>
	//    2    4:return          
	}

	public void onAudioCapabilitiesChanged(AudioCapabilities audiocapabilities)
	{
		boolean flag = audiocapabilities.equals(((Object) (audioCapabilities)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #377 <Field AudioCapabilities audioCapabilities>
	//    3    5:invokevirtual   #380 <Method boolean AudioCapabilities.equals(Object)>
	//    4    8:istore_2        
		ExoPlayerInterface exoplayerinterface = player;
	//    5    9:aload_0         
	//    6   10:getfield        #211 <Field ExoPlayerInterface player>
	//    7   13:astore_3        
		if(exoplayerinterface != null && !(flag ^ true))
	//*   8   14:aload_3         
	//*   9   15:ifnull          33
	//*  10   18:iload_2         
	//*  11   19:iconst_1        
	//*  12   20:ixor            
	//*  13   21:ifeq            27
	//*  14   24:goto            33
		{
			exoplayerinterface.setBackgrounded(false);
	//   15   27:aload_3         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #383 <Method void ExoPlayerInterface.setBackgrounded(boolean)>
			return;
	//   18   32:return          
		} else
		{
			audioCapabilities = audiocapabilities;
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:putfield        #377 <Field AudioCapabilities audioCapabilities>
			return;
	//   22   38:return          
		}
	}

	public void onCues(List list)
	{
		subtitleLayout.setCues(list);
	//    0    0:aload_0         
	//    1    1:getfield        #355 <Field SubtitleLayout subtitleLayout>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #388 <Method void SubtitleLayout.setCues(List)>
	//    4    8:return          
	}

	public void onError(Exception exception)
	{
		playerNeedsPrepare = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #243 <Field boolean playerNeedsPrepare>
		APSMediaPlayer.getInstance().log("ExoPlayer error reported");
	//    3    5:invokestatic    #66  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4    8:ldc2            #394 <String "ExoPlayer error reported">
	//    5   11:invokevirtual   #317 <Method void APSMediaPlayer.log(String)>
	//    6   14:return          
	}

	public void onId3Metadata(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #401 <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #406 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            208
		{
			Object obj = ((Object) ((Id3Frame)((Iterator) (list)).next()));
	//    6   16:aload_1         
	//    7   17:invokeinterface #409 <Method Object Iterator.next()>
	//    8   22:checkcast       #411 <Class Id3Frame>
	//    9   25:astore_2        
			if(obj instanceof TxxxFrame)
	//*  10   26:aload_2         
	//*  11   27:instanceof      #413 <Class TxxxFrame>
	//*  12   30:ifeq            78
			{
				obj = ((Object) ((TxxxFrame)obj));
	//   13   33:aload_2         
	//   14   34:checkcast       #413 <Class TxxxFrame>
	//   15   37:astore_2        
				Log.i("VeeplayPlayer", String.format("ID3 TimedMetadata %s: description=%s, value=%s", new Object[] {
					((TxxxFrame) (obj)).id, ((TxxxFrame) (obj)).description, ((TxxxFrame) (obj)).value
				}));
	//   16   38:ldc1            #18  <String "VeeplayPlayer">
	//   17   40:ldc2            #415 <String "ID3 TimedMetadata %s: description=%s, value=%s">
	//   18   43:iconst_3        
	//   19   44:anewarray       Object[]
	//   20   47:dup             
	//   21   48:iconst_0        
	//   22   49:aload_2         
	//   23   50:getfield        #418 <Field String TxxxFrame.id>
	//   24   53:aastore         
	//   25   54:dup             
	//   26   55:iconst_1        
	//   27   56:aload_2         
	//   28   57:getfield        #421 <Field String TxxxFrame.description>
	//   29   60:aastore         
	//   30   61:dup             
	//   31   62:iconst_2        
	//   32   63:aload_2         
	//   33   64:getfield        #423 <Field String TxxxFrame.value>
	//   34   67:aastore         
	//   35   68:invokestatic    #427 <Method String String.format(String, Object[])>
	//   36   71:invokestatic    #433 <Method int Log.i(String, String)>
	//   37   74:pop             
			} else
	//*  38   75:goto            7
			if(obj instanceof PrivFrame)
	//*  39   78:aload_2         
	//*  40   79:instanceof      #435 <Class PrivFrame>
	//*  41   82:ifeq            123
			{
				obj = ((Object) ((PrivFrame)obj));
	//   42   85:aload_2         
	//   43   86:checkcast       #435 <Class PrivFrame>
	//   44   89:astore_2        
				Log.i("VeeplayPlayer", String.format("ID3 TimedMetadata %s: owner=%s", new Object[] {
					((PrivFrame) (obj)).id, ((PrivFrame) (obj)).owner
				}));
	//   45   90:ldc1            #18  <String "VeeplayPlayer">
	//   46   92:ldc2            #437 <String "ID3 TimedMetadata %s: owner=%s">
	//   47   95:iconst_2        
	//   48   96:anewarray       Object[]
	//   49   99:dup             
	//   50  100:iconst_0        
	//   51  101:aload_2         
	//   52  102:getfield        #438 <Field String PrivFrame.id>
	//   53  105:aastore         
	//   54  106:dup             
	//   55  107:iconst_1        
	//   56  108:aload_2         
	//   57  109:getfield        #441 <Field String PrivFrame.owner>
	//   58  112:aastore         
	//   59  113:invokestatic    #427 <Method String String.format(String, Object[])>
	//   60  116:invokestatic    #433 <Method int Log.i(String, String)>
	//   61  119:pop             
			} else
	//*  62  120:goto            7
			if(obj instanceof GeobFrame)
	//*  63  123:aload_2         
	//*  64  124:instanceof      #443 <Class GeobFrame>
	//*  65  127:ifeq            182
			{
				obj = ((Object) ((GeobFrame)obj));
	//   66  130:aload_2         
	//   67  131:checkcast       #443 <Class GeobFrame>
	//   68  134:astore_2        
				Log.i("VeeplayPlayer", String.format("ID3 TimedMetadata %s: mimeType=%s, filename=%s, description=%s", new Object[] {
					((GeobFrame) (obj)).id, ((GeobFrame) (obj)).mimeType, ((GeobFrame) (obj)).filename, ((GeobFrame) (obj)).description
				}));
	//   69  135:ldc1            #18  <String "VeeplayPlayer">
	//   70  137:ldc2            #445 <String "ID3 TimedMetadata %s: mimeType=%s, filename=%s, description=%s">
	//   71  140:iconst_4        
	//   72  141:anewarray       Object[]
	//   73  144:dup             
	//   74  145:iconst_0        
	//   75  146:aload_2         
	//   76  147:getfield        #446 <Field String GeobFrame.id>
	//   77  150:aastore         
	//   78  151:dup             
	//   79  152:iconst_1        
	//   80  153:aload_2         
	//   81  154:getfield        #449 <Field String GeobFrame.mimeType>
	//   82  157:aastore         
	//   83  158:dup             
	//   84  159:iconst_2        
	//   85  160:aload_2         
	//   86  161:getfield        #452 <Field String GeobFrame.filename>
	//   87  164:aastore         
	//   88  165:dup             
	//   89  166:iconst_3        
	//   90  167:aload_2         
	//   91  168:getfield        #453 <Field String GeobFrame.description>
	//   92  171:aastore         
	//   93  172:invokestatic    #427 <Method String String.format(String, Object[])>
	//   94  175:invokestatic    #433 <Method int Log.i(String, String)>
	//   95  178:pop             
			} else
	//*  96  179:goto            7
			{
				Log.i("VeeplayPlayer", String.format("ID3 TimedMetadata %s", new Object[] {
					((Id3Frame) (obj)).id
				}));
	//   97  182:ldc1            #18  <String "VeeplayPlayer">
	//   98  184:ldc2            #455 <String "ID3 TimedMetadata %s">
	//   99  187:iconst_1        
	//  100  188:anewarray       Object[]
	//  101  191:dup             
	//  102  192:iconst_0        
	//  103  193:aload_2         
	//  104  194:getfield        #456 <Field String Id3Frame.id>
	//  105  197:aastore         
	//  106  198:invokestatic    #427 <Method String String.format(String, Object[])>
	//  107  201:invokestatic    #433 <Method int Log.i(String, String)>
	//  108  204:pop             
			}
		}

	//* 109  205:goto            7
	//  110  208:return          
	}

	public void onStateChanged(boolean flag, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 287
	//	               2 254
	//	               3 207
	//	               4 60
	//	               5 37
		default:
			return;
	//    2   36:return          

		case 1: // '\001'
			break;

		case 5: // '\005'
			veeplayInstance.log("completion received");
	//    3   37:aload_0         
	//    4   38:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//    5   41:ldc2            #461 <String "completion received">
	//    6   44:invokevirtual   #317 <Method void APSMediaPlayer.log(String)>
			playerPosition = 0L;
	//    7   47:aload_0         
	//    8   48:lconst_0        
	//    9   49:putfield        #237 <Field long playerPosition>
			veeplayInstance.next();
	//   10   52:aload_0         
	//   11   53:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   12   56:invokevirtual   #320 <Method void APSMediaPlayer.next()>
			return;
	//   13   59:return          

		case 4: // '\004'
			veeplayInstance.hideHud();
	//   14   60:aload_0         
	//   15   61:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   16   64:invokevirtual   #464 <Method void APSMediaPlayer.hideHud()>
			if(haveTracks(2))
	//*  17   67:aload_0         
	//*  18   68:iconst_2        
	//*  19   69:invokespecial   #466 <Method boolean haveTracks(int)>
	//*  20   72:ifeq            93
			{
				APSMediaPlayer.getInstance().log("Enabling subtitles track 0");
	//   21   75:invokestatic    #66  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   22   78:ldc2            #468 <String "Enabling subtitles track 0">
	//   23   81:invokevirtual   #317 <Method void APSMediaPlayer.log(String)>
				player.setSelectedTrack(2, 0);
	//   24   84:aload_0         
	//   25   85:getfield        #211 <Field ExoPlayerInterface player>
	//   26   88:iconst_2        
	//   27   89:iconst_0        
	//   28   90:invokevirtual   #471 <Method void ExoPlayerInterface.setSelectedTrack(int, int)>
			}
			if(isBuffering)
	//*  29   93:aload_0         
	//*  30   94:getfield        #58  <Field boolean isBuffering>
	//*  31   97:ifeq            139
			{
				isBuffering = false;
	//   32  100:aload_0         
	//   33  101:iconst_0        
	//   34  102:putfield        #58  <Field boolean isBuffering>
				veeplayInstance.emitEvent(new ArrayList(), "com.appscend.mp.notifications.statuschanged", com.appscend.media.APSMediaTrackingEvents.MediaEventType.BUFFER_END, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (veeplayInstance._currentUnit)));
	//   35  105:aload_0         
	//   36  106:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   37  109:new             #473 <Class ArrayList>
	//   38  112:dup             
	//   39  113:invokespecial   #474 <Method void ArrayList()>
	//   40  116:ldc2            #476 <String "com.appscend.mp.notifications.statuschanged">
	//   41  119:getstatic       #482 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.BUFFER_END>
	//   42  122:new             #484 <Class Bundle>
	//   43  125:dup             
	//   44  126:invokespecial   #485 <Method void Bundle()>
	//   45  129:aload_0         
	//   46  130:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   47  133:getfield        #489 <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
	//   48  136:invokevirtual   #493 <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
			}
			if(!statePlayableFired)
	//*  49  139:aload_0         
	//*  50  140:getfield        #60  <Field boolean statePlayableFired>
	//*  51  143:ifne            158
			{
				statePlayableFired = true;
	//   52  146:aload_0         
	//   53  147:iconst_1        
	//   54  148:putfield        #60  <Field boolean statePlayableFired>
				veeplayInstance.loadStatePlayable();
	//   55  151:aload_0         
	//   56  152:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   57  155:invokevirtual   #496 <Method void APSMediaPlayer.loadStatePlayable()>
			}
			APSMediaPlayer.getInstance().notifySeekFinished();
	//   58  158:invokestatic    #66  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   59  161:invokevirtual   #499 <Method void APSMediaPlayer.notifySeekFinished()>
			if(player.getDuration() > 0L && player.getDuration() < 1000L)
	//*  60  164:aload_0         
	//*  61  165:getfield        #211 <Field ExoPlayerInterface player>
	//*  62  168:invokevirtual   #299 <Method long ExoPlayerInterface.getDuration()>
	//*  63  171:lconst_0        
	//*  64  172:lcmp            
	//*  65  173:ifle            287
	//*  66  176:aload_0         
	//*  67  177:getfield        #211 <Field ExoPlayerInterface player>
	//*  68  180:invokevirtual   #299 <Method long ExoPlayerInterface.getDuration()>
	//*  69  183:ldc2w           #500 <Long 1000L>
	//*  70  186:lcmp            
	//*  71  187:ifge            287
			{
				APSMediaPlayer.getInstance().log("Placeholder or invalid video detected, skipping unit...");
	//   72  190:invokestatic    #66  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   73  193:ldc2            #503 <String "Placeholder or invalid video detected, skipping unit...">
	//   74  196:invokevirtual   #317 <Method void APSMediaPlayer.log(String)>
				veeplayInstance.next();
	//   75  199:aload_0         
	//   76  200:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   77  203:invokevirtual   #320 <Method void APSMediaPlayer.next()>
				return;
	//   78  206:return          
			}
			break;

		case 3: // '\003'
			veeplayInstance.showHud();
	//   79  207:aload_0         
	//   80  208:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   81  211:invokevirtual   #506 <Method void APSMediaPlayer.showHud()>
			isBuffering = true;
	//   82  214:aload_0         
	//   83  215:iconst_1        
	//   84  216:putfield        #58  <Field boolean isBuffering>
			veeplayInstance.emitEvent(new ArrayList(), "com.appscend.mp.notifications.statuschanged", com.appscend.media.APSMediaTrackingEvents.MediaEventType.BUFFER_START, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (veeplayInstance._currentUnit)));
	//   85  219:aload_0         
	//   86  220:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   87  223:new             #473 <Class ArrayList>
	//   88  226:dup             
	//   89  227:invokespecial   #474 <Method void ArrayList()>
	//   90  230:ldc2            #476 <String "com.appscend.mp.notifications.statuschanged">
	//   91  233:getstatic       #509 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.BUFFER_START>
	//   92  236:new             #484 <Class Bundle>
	//   93  239:dup             
	//   94  240:invokespecial   #485 <Method void Bundle()>
	//   95  243:aload_0         
	//   96  244:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   97  247:getfield        #489 <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
	//   98  250:invokevirtual   #493 <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
			return;
	//   99  253:return          

		case 2: // '\002'
			if(haveTracks(2))
	//* 100  254:aload_0         
	//* 101  255:iconst_2        
	//* 102  256:invokespecial   #466 <Method boolean haveTracks(int)>
	//* 103  259:ifeq            280
			{
				APSMediaPlayer.getInstance().log("Enabling subtitles track 0");
	//  104  262:invokestatic    #66  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  105  265:ldc2            #468 <String "Enabling subtitles track 0">
	//  106  268:invokevirtual   #317 <Method void APSMediaPlayer.log(String)>
				player.setSelectedTrack(2, 0);
	//  107  271:aload_0         
	//  108  272:getfield        #211 <Field ExoPlayerInterface player>
	//  109  275:iconst_2        
	//  110  276:iconst_0        
	//  111  277:invokevirtual   #471 <Method void ExoPlayerInterface.setSelectedTrack(int, int)>
			}
			veeplayInstance.showHud();
	//  112  280:aload_0         
	//  113  281:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//  114  284:invokevirtual   #506 <Method void APSMediaPlayer.showHud()>
			break;
		}
	//  115  287:return          
	}

	public void onVideoSizeChanged(int i, int j, int k, float f)
	{
		shutterView.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field View shutterView>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #514 <Method void View.setVisibility(int)>
		AspectRatioFrameLayout aspectratioframelayout = videoFrame;
	//    4    9:aload_0         
	//    5   10:getfield        #308 <Field AspectRatioFrameLayout videoFrame>
	//    6   13:astore          5
		if(j == 0)
	//*   7   15:iload_2         
	//*   8   16:ifne            25
			f = 1.0F;
	//    9   19:fconst_1        
	//   10   20:fstore          4
		else
	//*  11   22:goto            35
			f = ((float)i * f) / (float)j;
	//   12   25:iload_1         
	//   13   26:i2f             
	//   14   27:fload           4
	//   15   29:fmul            
	//   16   30:iload_2         
	//   17   31:i2f             
	//   18   32:fdiv            
	//   19   33:fstore          4
		aspectratioframelayout.setAspectRatio(f);
	//   20   35:aload           5
	//   21   37:fload           4
	//   22   39:invokevirtual   #518 <Method void AspectRatioFrameLayout.setAspectRatio(float)>
	//   23   42:return          
	}

	public void pause()
	{
		ExoPlayerInterface exoplayerinterface = player;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:astore_1        
		if(exoplayerinterface != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			exoplayerinterface.setPlayWhenReady(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #274 <Method void ExoPlayerInterface.setPlayWhenReady(boolean)>
	//    8   14:return          
	}

	public void playVideo(String s)
	{
		parentActivity.getWindow().addFlags(128);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Activity parentActivity>
	//    2    4:invokevirtual   #279 <Method Window Activity.getWindow()>
	//    3    7:sipush          128
	//    4   10:invokevirtual   #523 <Method void Window.addFlags(int)>
		contentUri = Uri.parse(s);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokestatic    #527 <Method Uri Uri.parse(String)>
	//    8   18:putfield        #111 <Field Uri contentUri>
		veeplayInstance.showHud();
	//    9   21:aload_0         
	//   10   22:getfield        #68  <Field APSMediaPlayer veeplayInstance>
	//   11   25:invokevirtual   #506 <Method void APSMediaPlayer.showHud()>
		playerPosition = 0L;
	//   12   28:aload_0         
	//   13   29:lconst_0        
	//   14   30:putfield        #237 <Field long playerPosition>
		preparePlayer();
	//   15   33:aload_0         
	//   16   34:invokespecial   #529 <Method void preparePlayer()>
	//   17   37:return          
	}

	public void playVideo(String s, String s1)
	{
		subtitlesUrl = s1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #127 <Field String subtitlesUrl>
		if(s1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          47
		{
			APSMediaPlayer apsmediaplayer = APSMediaPlayer.getInstance();
	//    5    9:invokestatic    #66  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    6   12:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #532 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #533 <Method void StringBuilder()>
	//   10   20:astore          4
			stringbuilder.append("playing new url with subtitles: ");
	//   11   22:aload           4
	//   12   24:ldc2            #535 <String "playing new url with subtitles: ">
	//   13   27:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(s1);
	//   15   31:aload           4
	//   16   33:aload_2         
	//   17   34:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			apsmediaplayer.log(stringbuilder.toString());
	//   19   38:aload_3         
	//   20   39:aload           4
	//   21   41:invokevirtual   #540 <Method String StringBuilder.toString()>
	//   22   44:invokevirtual   #317 <Method void APSMediaPlayer.log(String)>
		}
		playVideo(s);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #542 <Method void playVideo(String)>
	//   26   52:return          
	}

	public void playingSurfaceSizeChanged()
	{
	//    0    0:return          
	}

	public void recylePlayerView()
	{
		if(player == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field ExoPlayerInterface player>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		PlayerView playerview = new PlayerView(((android.content.Context) (parentActivity)));
	//    4    8:new             #266 <Class PlayerView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #103 <Field Activity parentActivity>
	//    8   16:invokespecial   #346 <Method void PlayerView(android.content.Context)>
	//    9   19:astore_1        
		videoFrame.addView(((View) (playerview)));
	//   10   20:aload_0         
	//   11   21:getfield        #308 <Field AspectRatioFrameLayout videoFrame>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #350 <Method void AspectRatioFrameLayout.addView(View)>
		playerview.acquireVideoTexture(((android.content.Context) (parentActivity)), player);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #103 <Field Activity parentActivity>
	//   17   33:aload_0         
	//   18   34:getfield        #211 <Field ExoPlayerInterface player>
	//   19   37:invokevirtual   #270 <Method void PlayerView.acquireVideoTexture(android.content.Context, ExoPlayerInterface)>
		playerView.releaseVideoTexture();
	//   20   40:aload_0         
	//   21   41:getfield        #264 <Field PlayerView playerView>
	//   22   44:invokevirtual   #546 <Method void PlayerView.releaseVideoTexture()>
		playerView = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #264 <Field PlayerView playerView>
		playerView = playerview;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #264 <Field PlayerView playerView>
		if(subtitleLayout.getParent() != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #355 <Field SubtitleLayout subtitleLayout>
	//*  31   61:invokevirtual   #550 <Method android.view.ViewParent SubtitleLayout.getParent()>
	//*  32   64:ifnull          113
		{
			android.view.ViewParent viewparent = subtitleLayout.getParent();
	//   33   67:aload_0         
	//   34   68:getfield        #355 <Field SubtitleLayout subtitleLayout>
	//   35   71:invokevirtual   #550 <Method android.view.ViewParent SubtitleLayout.getParent()>
	//   36   74:astore_1        
			AspectRatioFrameLayout aspectratioframelayout = videoFrame;
	//   37   75:aload_0         
	//   38   76:getfield        #308 <Field AspectRatioFrameLayout videoFrame>
	//   39   79:astore_2        
			if(viewparent == aspectratioframelayout)
	//*  40   80:aload_1         
	//*  41   81:aload_2         
	//*  42   82:if_acmpne       113
			{
				aspectratioframelayout.removeView(((View) (subtitleLayout)));
	//   43   85:aload_2         
	//   44   86:aload_0         
	//   45   87:getfield        #355 <Field SubtitleLayout subtitleLayout>
	//   46   90:invokevirtual   #553 <Method void AspectRatioFrameLayout.removeView(View)>
				videoFrame.addView(((View) (subtitleLayout)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   47   93:aload_0         
	//   48   94:getfield        #308 <Field AspectRatioFrameLayout videoFrame>
	//   49   97:aload_0         
	//   50   98:getfield        #355 <Field SubtitleLayout subtitleLayout>
	//   51  101:new             #357 <Class android.widget.FrameLayout$LayoutParams>
	//   52  104:dup             
	//   53  105:iconst_m1       
	//   54  106:iconst_m1       
	//   55  107:invokespecial   #360 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   56  110:invokevirtual   #363 <Method void AspectRatioFrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			}
		}
	//   57  113:return          
	}

	public void release()
	{
		playerNeedsPrepare = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #243 <Field boolean playerNeedsPrepare>
		try
		{
			audioCapabilitiesReceiver.unregister();
	//    3    5:aload_0         
	//    4    6:getfield        #331 <Field AudioCapabilitiesReceiver audioCapabilitiesReceiver>
	//    5    9:invokevirtual   #558 <Method void AudioCapabilitiesReceiver.unregister()>
		}
	//*   6   12:aload_0         
	//*   7   13:invokespecial   #560 <Method void releasePlayer()>
	//*   8   16:return          
		catch(Exception exception) { }
	//    9   17:astore_1        
		releasePlayer();
	//*  10   18:goto            12
	}

	public boolean resumePlay()
	{
		ExoPlayerInterface exoplayerinterface = player;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:astore_1        
		if(exoplayerinterface != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			exoplayerinterface.setPlayWhenReady(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #274 <Method void ExoPlayerInterface.setPlayWhenReady(boolean)>
			recylePlayerView();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #373 <Method void recylePlayerView()>
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		} else
		{
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	public void seekTo(int i)
	{
		ExoPlayerInterface exoplayerinterface = player;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:astore_2        
		if(exoplayerinterface != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			exoplayerinterface.seekTo(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:invokevirtual   #241 <Method void ExoPlayerInterface.seekTo(long)>
	//    9   15:return          
	}

	public void setMute(boolean flag)
	{
		ExoPlayerInterface exoplayerinterface = player;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:astore_2        
		if(exoplayerinterface != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			exoplayerinterface.setMute(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #564 <Method void ExoPlayerInterface.setMute(boolean)>
	//    8   14:return          
	}

	public void setVolume(float f)
	{
		player.setVolume(f);
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field ExoPlayerInterface player>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #567 <Method void ExoPlayerInterface.setVolume(float)>
	//    4    8:return          
	}

	public void switchSurface(PlayerView playerview)
	{
		playerview.acquireVideoTexture(((android.content.Context) (parentActivity)), player);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #103 <Field Activity parentActivity>
	//    3    5:aload_0         
	//    4    6:getfield        #211 <Field ExoPlayerInterface player>
	//    5    9:invokevirtual   #270 <Method void PlayerView.acquireVideoTexture(android.content.Context, ExoPlayerInterface)>
	//    6   12:return          
	}

	public String type()
	{
		return rendererIdentifier;
	//    0    0:getstatic       #572 <Field String rendererIdentifier>
	//    1    3:areturn         
	}

	public void unitFinished(com.appscend.media.APSMediaPlayer.MPMovieFinishReason mpmoviefinishreason)
	{
		releasePlayer();
	//    0    0:aload_0         
	//    1    1:invokespecial   #560 <Method void releasePlayer()>
	//    2    4:return          
	}

	public static final String TAG = "VeeplayPlayer";
	public static String rendererIdentifier = "exoplayer-renderer";
	private AudioCapabilities audioCapabilities;
	private AudioCapabilitiesReceiver audioCapabilitiesReceiver;
	private Uri contentUri;
	private EventLogger eventLogger;
	private boolean isBuffering;
	private Activity parentActivity;
	private ExoPlayerInterface player;
	private boolean playerNeedsPrepare;
	private long playerPosition;
	private PlayerView playerView;
	private View shutterView;
	private boolean statePlayableFired;
	private SubtitleLayout subtitleLayout;
	private String subtitlesUrl;
	private APSMediaPlayer veeplayInstance;
	private AspectRatioFrameLayout videoFrame;

	static 
	{
	//    0    0:return          
	}
}
