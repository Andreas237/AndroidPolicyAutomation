// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.*;
import android.view.*;
import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaUnit;
import com.appscend.media.renderers.exoPlayerRenderers.PlayerView;
import com.appscend.utilities.*;
import java.util.ArrayList;

// Referenced classes of package com.appscend.media.renderers:
//			IVeeplayRenderer

public class MediaPlayerRenderer
	implements IVeeplayRenderer, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener
{

	public MediaPlayerRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		_playerPrepared = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #53  <Field boolean _playerPrepared>
		mIsVideoReadyToBePlayed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #55  <Field boolean mIsVideoReadyToBePlayed>
		mIsVideoSizeKnown = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #57  <Field boolean mIsVideoSizeKnown>
		_savedCurrentPlaybackTime = 0L;
	//   11   19:aload_0         
	//   12   20:lconst_0        
	//   13   21:putfield        #59  <Field long _savedCurrentPlaybackTime>
		veeplayInstance = APSMediaPlayer.getInstance();
	//   14   24:aload_0         
	//   15   25:invokestatic    #65  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   16   28:putfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   17   31:return          
	}

	private void doCleanUp()
	{
		_videoWidth = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #88  <Field int _videoWidth>
		_videoHeight = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #90  <Field int _videoHeight>
		mIsVideoReadyToBePlayed = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #55  <Field boolean mIsVideoReadyToBePlayed>
		mIsVideoSizeKnown = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #57  <Field boolean mIsVideoSizeKnown>
	//   12   20:return          
	}

	public static int getPriorityIndex()
	{
		if(Build.MANUFACTURER.equals("Amazon") && Build.MODEL.startsWith("KF"))
	//*   0    0:getstatic       #97  <Field String Build.MANUFACTURER>
	//*   1    3:ldc1            #99  <String "Amazon">
	//*   2    5:invokevirtual   #105 <Method boolean String.equals(Object)>
	//*   3    8:ifeq            24
	//*   4   11:getstatic       #108 <Field String Build.MODEL>
	//*   5   14:ldc1            #110 <String "KF">
	//*   6   16:invokevirtual   #114 <Method boolean String.startsWith(String)>
	//*   7   19:ifeq            24
			return 1;
	//    8   22:iconst_1        
	//    9   23:ireturn         
		return android.os.Build.VERSION.SDK_INT <= 15 ? 1 : 0;
	//   10   24:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//   11   27:bipush          15
	//   12   29:icmple          34
	//   13   32:iconst_0        
	//   14   33:ireturn         
	//   15   34:iconst_1        
	//   16   35:ireturn         
	}

	public void clearSurfaceView(final boolean value)
	{
		veeplayInstance.getHandler().post(new Runnable() {

			public void run()
			{
				if(surfaceView != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field MediaPlayerRenderer this$0>
			//*   2    4:invokestatic    #30  <Method SurfaceView MediaPlayerRenderer.access$300(MediaPlayerRenderer)>
			//*   3    7:ifnull          38
				{
					SurfaceView surfaceview = surfaceView;
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field MediaPlayerRenderer this$0>
			//    6   14:invokestatic    #30  <Method SurfaceView MediaPlayerRenderer.access$300(MediaPlayerRenderer)>
			//    7   17:astore_2        
					int i;
					if(value)
			//*   8   18:aload_0         
			//*   9   19:getfield        #21  <Field boolean val$value>
			//*  10   22:ifeq            30
						i = 0;
			//   11   25:iconst_0        
			//   12   26:istore_1        
					else
			//*  13   27:goto            33
						i = 0xff000000;
			//   14   30:ldc1            #31  <Int 0xff000000>
			//   15   32:istore_1        
					surfaceview.setBackgroundColor(i);
			//   16   33:aload_2         
			//   17   34:iload_1         
			//   18   35:invokevirtual   #37  <Method void SurfaceView.setBackgroundColor(int)>
				}
			//   19   38:return          
			}

			final MediaPlayerRenderer this$0;
			final boolean val$value;

			
			{
				this$0 = MediaPlayerRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MediaPlayerRenderer this$0>
				value = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$value>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:invokevirtual   #125 <Method Handler APSMediaPlayer.getHandler()>
	//    3    7:new             #24  <Class MediaPlayerRenderer$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #128 <Method void MediaPlayerRenderer$2(MediaPlayerRenderer, boolean)>
	//    8   16:invokevirtual   #134 <Method boolean Handler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public int duration()
	{
		if(_playerPrepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean _playerPrepared>
	//*   2    4:ifeq            24
		{
			int i;
			try
			{
				i = _player.getDuration();
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field MediaPlayer _player>
	//    5   11:invokevirtual   #142 <Method int MediaPlayer.getDuration()>
	//    6   14:istore_1        
			}
	//*   7   15:iload_1         
	//*   8   16:ireturn         
			catch(Exception exception)
	//*   9   17:astore_2        
			{
				exception.printStackTrace();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #145 <Method void Exception.printStackTrace()>
				return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			}
			return i;
		} else
		{
			return 0;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		}
	}

	public int getCurrentPosition()
	{
		if(_playerPrepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean _playerPrepared>
	//*   2    4:ifeq            24
		{
			int i;
			try
			{
				i = _player.getCurrentPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field MediaPlayer _player>
	//    5   11:invokevirtual   #148 <Method int MediaPlayer.getCurrentPosition()>
	//    6   14:istore_1        
			}
	//*   7   15:iload_1         
	//*   8   16:ireturn         
			catch(Exception exception)
	//*   9   17:astore_2        
			{
				exception.printStackTrace();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #145 <Method void Exception.printStackTrace()>
				return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			}
			return i;
		} else
		{
			return 0;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		}
	}

	public View getView()
	{
		return ((View) (surfaceView));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field SurfaceView surfaceView>
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
	//*   1    1:ifnonnull       21
		{
			veeplayInstance.log("Renderer init called with null activity. Is the player initialized?");
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    4    8:ldc1            #156 <String "Renderer init called with null activity. Is the player initialized?">
	//    5   10:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
			veeplayInstance.next();
	//    6   13:aload_0         
	//    7   14:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    8   17:invokevirtual   #163 <Method void APSMediaPlayer.next()>
			return;
	//    9   20:return          
		}
		surfaceView = new SurfaceView(((android.content.Context) (activity)));
	//   10   21:aload_0         
	//   11   22:new             #165 <Class SurfaceView>
	//   12   25:dup             
	//   13   26:aload_1         
	//   14   27:invokespecial   #168 <Method void SurfaceView(android.content.Context)>
	//   15   30:putfield        #83  <Field SurfaceView surfaceView>
		activity = ((Activity) (new android.widget.RelativeLayout.LayoutParams(-2, -2)));
	//   16   33:new             #170 <Class android.widget.RelativeLayout$LayoutParams>
	//   17   36:dup             
	//   18   37:bipush          -2
	//   19   39:bipush          -2
	//   20   41:invokespecial   #173 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   21   44:astore_1        
		((android.widget.RelativeLayout.LayoutParams) (activity)).addRule(13);
	//   22   45:aload_1         
	//   23   46:bipush          13
	//   24   48:invokevirtual   #177 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		surfaceView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (activity)));
	//   25   51:aload_0         
	//   26   52:getfield        #83  <Field SurfaceView surfaceView>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #181 <Method void SurfaceView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  29   59:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   62:bipush          17
	//*  31   64:icmplt          81
			surfaceView.setSecure(veeplayInstance.isSecureSurfaceView());
	//   32   67:aload_0         
	//   33   68:getfield        #83  <Field SurfaceView surfaceView>
	//   34   71:aload_0         
	//   35   72:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   36   75:invokevirtual   #184 <Method boolean APSMediaPlayer.isSecureSurfaceView()>
	//   37   78:invokevirtual   #187 <Method void SurfaceView.setSecure(boolean)>
		surfaceHolder = surfaceView.getHolder();
	//   38   81:aload_0         
	//   39   82:aload_0         
	//   40   83:getfield        #83  <Field SurfaceView surfaceView>
	//   41   86:invokevirtual   #191 <Method SurfaceHolder SurfaceView.getHolder()>
	//   42   89:putfield        #73  <Field SurfaceHolder surfaceHolder>
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*  43   92:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*  44   95:bipush          11
	//*  45   97:icmpge          110
			surfaceHolder.setType(3);
	//   46  100:aload_0         
	//   47  101:getfield        #73  <Field SurfaceHolder surfaceHolder>
	//   48  104:iconst_3        
	//   49  105:invokeinterface #196 <Method void SurfaceHolder.setType(int)>
		surfaceHolder.addCallback(new android.view.SurfaceHolder.Callback() {

			public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
			{
				veeplayInstance.log("Surface changed");
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MediaPlayerRenderer this$0>
			//    2    4:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//    3    7:ldc1            #29  <String "Surface changed">
			//    4    9:invokevirtual   #35  <Method void APSMediaPlayer.log(String)>
			//    5   12:return          
			}

			public void surfaceCreated(SurfaceHolder surfaceholder)
			{
				veeplayInstance.log("Surface created");
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MediaPlayerRenderer this$0>
			//    2    4:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//    3    7:ldc1            #45  <String "Surface created">
			//    4    9:invokevirtual   #35  <Method void APSMediaPlayer.log(String)>
				surfaceHolder = surfaceholder;
			//    5   12:aload_0         
			//    6   13:getfield        #17  <Field MediaPlayerRenderer this$0>
			//    7   16:aload_1         
			//    8   17:invokestatic    #49  <Method SurfaceHolder MediaPlayerRenderer.access$102(MediaPlayerRenderer, SurfaceHolder)>
			//    9   20:pop             
				if(_player != null)
			//*  10   21:aload_0         
			//*  11   22:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  12   25:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
			//*  13   28:ifnull          56
					try
					{
						_player.setDisplay(surfaceHolder);
			//   14   31:aload_0         
			//   15   32:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   16   35:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
			//   17   38:aload_0         
			//   18   39:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   19   42:invokestatic    #57  <Method SurfaceHolder MediaPlayerRenderer.access$100(MediaPlayerRenderer)>
			//   20   45:invokevirtual   #62  <Method void MediaPlayer.setDisplay(SurfaceHolder)>
					}
			//*  21   48:goto            56
					// Misplaced declaration of an exception variable
					catch(SurfaceHolder surfaceholder)
			//*  22   51:astore_1        
					{
						((IllegalArgumentException) (surfaceholder)).printStackTrace();
			//   23   52:aload_1         
			//   24   53:invokevirtual   #65  <Method void IllegalArgumentException.printStackTrace()>
					}
				if(veeplayInstance._currentUnit != null && veeplayInstance._currentUnit.url != null)
			//*  25   56:aload_0         
			//*  26   57:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  27   60:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//*  28   63:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//*  29   66:ifnull          96
			//*  30   69:aload_0         
			//*  31   70:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  32   73:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//*  33   76:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//*  34   79:getfield        #75  <Field String APSMediaUnit.url>
			//*  35   82:ifnull          96
					surfaceView.setVisibility(0);
			//   36   85:aload_0         
			//   37   86:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   38   89:invokestatic    #79  <Method SurfaceView MediaPlayerRenderer.access$300(MediaPlayerRenderer)>
			//   39   92:iconst_0        
			//   40   93:invokevirtual   #85  <Method void SurfaceView.setVisibility(int)>
				if(_playerPrepared)
			//*  41   96:aload_0         
			//*  42   97:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  43  100:invokestatic    #89  <Method boolean MediaPlayerRenderer.access$400(MediaPlayerRenderer)>
			//*  44  103:ifeq            150
				{
					if(!veeplayInstance.isPaused() && _player != null)
			//*  45  106:aload_0         
			//*  46  107:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  47  110:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//*  48  113:invokevirtual   #93  <Method boolean APSMediaPlayer.isPaused()>
			//*  49  116:ifne            292
			//*  50  119:aload_0         
			//*  51  120:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  52  123:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
			//*  53  126:ifnull          292
					{
						try
						{
							veeplayInstance.play();
			//   54  129:aload_0         
			//   55  130:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   56  133:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//   57  136:invokevirtual   #96  <Method void APSMediaPlayer.play()>
							return;
			//   58  139:return          
						}
			//*  59  140:astore_1        
			//*  60  141:goto            145
						// Misplaced declaration of an exception variable
						catch(SurfaceHolder surfaceholder) { }
			//   61  144:astore_1        
						// Misplaced declaration of an exception variable
						catch(SurfaceHolder surfaceholder) { }
						((Exception) (surfaceholder)).printStackTrace();
			//   62  145:aload_1         
			//   63  146:invokevirtual   #99  <Method void Exception.printStackTrace()>
						return;
			//   64  149:return          
					}
				} else
				{
					if(veeplayInstance._currentUnit == null)
			//*  65  150:aload_0         
			//*  66  151:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  67  154:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//*  68  157:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//*  69  160:ifnonnull       164
						return;
			//   70  163:return          
					if(veeplayInstance._currentUnit.manager == null && !veeplayInstance.isPaused())
			//*  71  164:aload_0         
			//*  72  165:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  73  168:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//*  74  171:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//*  75  174:getfield        #102 <Field String APSMediaUnit.manager>
			//*  76  177:ifnonnull       226
			//*  77  180:aload_0         
			//*  78  181:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  79  184:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//*  80  187:invokevirtual   #93  <Method boolean APSMediaPlayer.isPaused()>
			//*  81  190:ifne            226
					{
						surfaceholder = ((SurfaceHolder) (MediaPlayerRenderer.this));
			//   82  193:aload_0         
			//   83  194:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   84  197:astore_1        
						((MediaPlayerRenderer) (surfaceholder)).playVideo(((MediaPlayerRenderer) (surfaceholder)).veeplayInstance._currentUnit.url, veeplayInstance._currentUnit.subtitlesUrl);
			//   85  198:aload_1         
			//   86  199:aload_1         
			//   87  200:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//   88  203:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//   89  206:getfield        #75  <Field String APSMediaUnit.url>
			//   90  209:aload_0         
			//   91  210:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   92  213:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//   93  216:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//   94  219:getfield        #105 <Field String APSMediaUnit.subtitlesUrl>
			//   95  222:invokevirtual   #109 <Method void MediaPlayerRenderer.playVideo(String, String)>
						return;
			//   96  225:return          
					}
					if(!veeplayInstance.isPaused())
			//*  97  226:aload_0         
			//*  98  227:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  99  230:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//* 100  233:invokevirtual   #93  <Method boolean APSMediaPlayer.isPaused()>
			//* 101  236:ifne            292
					{
						((UnitManager)veeplayInstance.adapterForTypeInGroup(veeplayInstance._currentUnit.manager, "com.appscend.mp.drm")).start(veeplayInstance._currentUnit);
			//  102  239:aload_0         
			//  103  240:getfield        #17  <Field MediaPlayerRenderer this$0>
			//  104  243:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//  105  246:aload_0         
			//  106  247:getfield        #17  <Field MediaPlayerRenderer this$0>
			//  107  250:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//  108  253:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//  109  256:getfield        #102 <Field String APSMediaUnit.manager>
			//  110  259:ldc1            #111 <String "com.appscend.mp.drm">
			//  111  261:invokevirtual   #115 <Method Object APSMediaPlayer.adapterForTypeInGroup(String, String)>
			//  112  264:checkcast       #117 <Class UnitManager>
			//  113  267:aload_0         
			//  114  268:getfield        #17  <Field MediaPlayerRenderer this$0>
			//  115  271:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//  116  274:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//  117  277:invokeinterface #121 <Method void UnitManager.start(APSMediaUnit)>
						veeplayInstance.showHud();
			//  118  282:aload_0         
			//  119  283:getfield        #17  <Field MediaPlayerRenderer this$0>
			//  120  286:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//  121  289:invokevirtual   #124 <Method void APSMediaPlayer.showHud()>
					}
				}
			//  122  292:return          
			}

			public void surfaceDestroyed(SurfaceHolder surfaceholder)
			{
				veeplayInstance.log("Surface destroyed");
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MediaPlayerRenderer this$0>
			//    2    4:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
			//    3    7:ldc1            #127 <String "Surface destroyed">
			//    4    9:invokevirtual   #35  <Method void APSMediaPlayer.log(String)>
				if(_player != null && _player.isPlaying())
			//*   5   12:aload_0         
			//*   6   13:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*   7   16:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
			//*   8   19:ifnull          45
			//*   9   22:aload_0         
			//*  10   23:getfield        #17  <Field MediaPlayerRenderer this$0>
			//*  11   26:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
			//*  12   29:invokevirtual   #130 <Method boolean MediaPlayer.isPlaying()>
			//*  13   32:ifeq            45
					_player.pause();
			//   14   35:aload_0         
			//   15   36:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   16   39:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
			//   17   42:invokevirtual   #133 <Method void MediaPlayer.pause()>
				surfaceHolder = null;
			//   18   45:aload_0         
			//   19   46:getfield        #17  <Field MediaPlayerRenderer this$0>
			//   20   49:aconst_null     
			//   21   50:invokestatic    #49  <Method SurfaceHolder MediaPlayerRenderer.access$102(MediaPlayerRenderer, SurfaceHolder)>
			//   22   53:pop             
			//   23   54:return          
			}

			final MediaPlayerRenderer this$0;

			
			{
				this$0 = MediaPlayerRenderer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaPlayerRenderer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   50  110:aload_0         
	//   51  111:getfield        #73  <Field SurfaceHolder surfaceHolder>
	//   52  114:new             #22  <Class MediaPlayerRenderer$1>
	//   53  117:dup             
	//   54  118:aload_0         
	//   55  119:invokespecial   #199 <Method void MediaPlayerRenderer$1(MediaPlayerRenderer)>
	//   56  122:invokeinterface #203 <Method void SurfaceHolder.addCallback(android.view.SurfaceHolder$Callback)>
	//   57  127:return          
	}

	public void loadStatePlayable()
	{
		veeplayInstance.log("state playable entered");
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:ldc1            #206 <String "state playable entered">
	//    3    6:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		if(mIsVideoReadyToBePlayed)
	//*   4    9:aload_0         
	//*   5   10:getfield        #55  <Field boolean mIsVideoReadyToBePlayed>
	//*   6   13:ifeq            17
			return;
	//    7   16:return          
		mIsVideoReadyToBePlayed = true;
	//    8   17:aload_0         
	//    9   18:iconst_1        
	//   10   19:putfield        #55  <Field boolean mIsVideoReadyToBePlayed>
		veeplayInstance.log("set video ready to be played");
	//   11   22:aload_0         
	//   12   23:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   13   26:ldc1            #208 <String "set video ready to be played">
	//   14   28:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		veeplayInstance.hideHud();
	//   15   31:aload_0         
	//   16   32:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   17   35:invokevirtual   #211 <Method void APSMediaPlayer.hideHud()>
		APSMediaUnit apsmediaunit = veeplayInstance._currentUnit;
	//   18   38:aload_0         
	//   19   39:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   20   42:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   21   45:astore_1        
		if(mIsVideoReadyToBePlayed && (apsmediaunit != null && apsmediaunit.url == null || mIsVideoSizeKnown || apsmediaunit != null && veeplayInstance.isStreamingUrl(apsmediaunit.url)))
	//*  22   46:aload_0         
	//*  23   47:getfield        #55  <Field boolean mIsVideoReadyToBePlayed>
	//*  24   50:ifeq            96
	//*  25   53:aload_1         
	//*  26   54:ifnull          64
	//*  27   57:aload_1         
	//*  28   58:getfield        #220 <Field String APSMediaUnit.url>
	//*  29   61:ifnull          89
	//*  30   64:aload_0         
	//*  31   65:getfield        #57  <Field boolean mIsVideoSizeKnown>
	//*  32   68:ifne            89
	//*  33   71:aload_1         
	//*  34   72:ifnull          96
	//*  35   75:aload_0         
	//*  36   76:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//*  37   79:aload_1         
	//*  38   80:getfield        #220 <Field String APSMediaUnit.url>
	//*  39   83:invokevirtual   #223 <Method boolean APSMediaPlayer.isStreamingUrl(String)>
	//*  40   86:ifeq            96
		{
			startVideoPlayback();
	//   41   89:aload_0         
	//   42   90:invokevirtual   #226 <Method void startVideoPlayback()>
		} else
	//*  43   93:goto            186
		{
			if(apsmediaunit != null && apsmediaunit.url != null)
	//*  44   96:aload_1         
	//*  45   97:ifnull          160
	//*  46  100:aload_1         
	//*  47  101:getfield        #220 <Field String APSMediaUnit.url>
	//*  48  104:ifnull          160
			{
				APSMediaPlayer apsmediaplayer = veeplayInstance;
	//   49  107:aload_0         
	//   50  108:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   51  111:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   52  112:new             #228 <Class StringBuilder>
	//   53  115:dup             
	//   54  116:invokespecial   #229 <Method void StringBuilder()>
	//   55  119:astore_3        
				stringbuilder.append("unable to start playback. url: ");
	//   56  120:aload_3         
	//   57  121:ldc1            #231 <String "unable to start playback. url: ">
	//   58  123:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   59  126:pop             
				stringbuilder.append(apsmediaunit.url);
	//   60  127:aload_3         
	//   61  128:aload_1         
	//   62  129:getfield        #220 <Field String APSMediaUnit.url>
	//   63  132:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   64  135:pop             
				stringbuilder.append(" size known: ");
	//   65  136:aload_3         
	//   66  137:ldc1            #237 <String " size known: ">
	//   67  139:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   68  142:pop             
				stringbuilder.append(mIsVideoSizeKnown);
	//   69  143:aload_3         
	//   70  144:aload_0         
	//   71  145:getfield        #57  <Field boolean mIsVideoSizeKnown>
	//   72  148:invokevirtual   #240 <Method StringBuilder StringBuilder.append(boolean)>
	//   73  151:pop             
				apsmediaplayer.log(stringbuilder.toString());
	//   74  152:aload_2         
	//   75  153:aload_3         
	//   76  154:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   77  157:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
			}
			if(!mIsVideoSizeKnown)
	//*  78  160:aload_0         
	//*  79  161:getfield        #57  <Field boolean mIsVideoSizeKnown>
	//*  80  164:ifne            186
			{
				veeplayInstance.log("Unsupported file");
	//   81  167:aload_0         
	//   82  168:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   83  171:ldc1            #246 <String "Unsupported file">
	//   84  173:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
				veeplayInstance.unitFinished(com.appscend.media.APSMediaPlayer.MPMovieFinishReason.MPMovieFinishReasonPlaybackError);
	//   85  176:aload_0         
	//   86  177:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   87  180:getstatic       #252 <Field com.appscend.media.APSMediaPlayer$MPMovieFinishReason com.appscend.media.APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonPlaybackError>
	//   88  183:invokevirtual   #256 <Method void APSMediaPlayer.unitFinished(com.appscend.media.APSMediaPlayer$MPMovieFinishReason)>
			}
		}
		veeplayInstance.loadStatePlayable();
	//   89  186:aload_0         
	//   90  187:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   91  190:invokevirtual   #258 <Method void APSMediaPlayer.loadStatePlayable()>
	//   92  193:return          
	}

	public void onActivityPaused()
	{
	//    0    0:return          
	}

	public void onActivityResumed()
	{
	//    0    0:return          
	}

	public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
	{
		veeplayInstance.setPlayableDuration((duration() * i) / 100);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #264 <Method int duration()>
	//    4    8:iload_2         
	//    5    9:imul            
	//    6   10:bipush          100
	//    7   12:idiv            
	//    8   13:invokevirtual   #267 <Method void APSMediaPlayer.setPlayableDuration(int)>
	//    9   16:return          
	}

	public void onCompletion(MediaPlayer mediaplayer)
	{
		veeplayInstance.log("completion received");
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:ldc2            #271 <String "completion received">
	//    3    7:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		veeplayInstance.next();
	//    4   10:aload_0         
	//    5   11:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    6   14:invokevirtual   #163 <Method void APSMediaPlayer.next()>
	//    7   17:return          
	}

	public boolean onError(MediaPlayer mediaplayer, int i, int j)
	{
		mediaplayer = ((MediaPlayer) (veeplayInstance));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:astore_1        
		if(mediaplayer == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #228 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #229 <Method void StringBuilder()>
	//   10   18:astore          4
		stringbuilder.append("error received: ");
	//   11   20:aload           4
	//   12   22:ldc2            #275 <String "error received: ">
	//   13   25:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(i);
	//   15   29:aload           4
	//   16   31:iload_2         
	//   17   32:invokevirtual   #278 <Method StringBuilder StringBuilder.append(int)>
	//   18   35:pop             
		stringbuilder.append(" ");
	//   19   36:aload           4
	//   20   38:ldc2            #280 <String " ">
	//   21   41:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		stringbuilder.append(j);
	//   23   45:aload           4
	//   24   47:iload_3         
	//   25   48:invokevirtual   #278 <Method StringBuilder StringBuilder.append(int)>
	//   26   51:pop             
		((APSMediaPlayer) (mediaplayer)).log(stringbuilder.toString());
	//   27   52:aload_1         
	//   28   53:aload           4
	//   29   55:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   30   58:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		if(i == 1 && j == 0x80000000 && veeplayInstance._currentUnit != null)
	//*  31   61:iload_2         
	//*  32   62:iconst_1        
	//*  33   63:icmpne          177
	//*  34   66:iload_3         
	//*  35   67:ldc2            #281 <Int 0x80000000>
	//*  36   70:icmpne          177
	//*  37   73:aload_0         
	//*  38   74:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//*  39   77:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//*  40   80:ifnull          177
		{
			veeplayInstance._currentUnit.initialPlaybackTime = (int)_savedCurrentPlaybackTime;
	//   41   83:aload_0         
	//   42   84:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   43   87:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   44   90:aload_0         
	//   45   91:getfield        #59  <Field long _savedCurrentPlaybackTime>
	//   46   94:l2i             
	//   47   95:putfield        #284 <Field int APSMediaUnit.initialPlaybackTime>
			mIsVideoReadyToBePlayed = false;
	//   48   98:aload_0         
	//   49   99:iconst_0        
	//   50  100:putfield        #55  <Field boolean mIsVideoReadyToBePlayed>
			mediaplayer = ((MediaPlayer) (veeplayInstance));
	//   51  103:aload_0         
	//   52  104:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   53  107:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   54  108:new             #228 <Class StringBuilder>
	//   55  111:dup             
	//   56  112:invokespecial   #229 <Method void StringBuilder()>
	//   57  115:astore          4
			stringbuilder1.append("setting initial playback time to: ");
	//   58  117:aload           4
	//   59  119:ldc2            #286 <String "setting initial playback time to: ">
	//   60  122:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   61  125:pop             
			stringbuilder1.append(veeplayInstance._currentUnit.initialPlaybackTime);
	//   62  126:aload           4
	//   63  128:aload_0         
	//   64  129:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   65  132:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   66  135:getfield        #284 <Field int APSMediaUnit.initialPlaybackTime>
	//   67  138:invokevirtual   #278 <Method StringBuilder StringBuilder.append(int)>
	//   68  141:pop             
			((APSMediaPlayer) (mediaplayer)).log(stringbuilder1.toString());
	//   69  142:aload_1         
	//   70  143:aload           4
	//   71  145:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   72  148:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
			playVideo(veeplayInstance._currentUnit.url, veeplayInstance._currentUnit.subtitlesUrl);
	//   73  151:aload_0         
	//   74  152:aload_0         
	//   75  153:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   76  156:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   77  159:getfield        #220 <Field String APSMediaUnit.url>
	//   78  162:aload_0         
	//   79  163:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   80  166:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   81  169:getfield        #289 <Field String APSMediaUnit.subtitlesUrl>
	//   82  172:invokevirtual   #293 <Method void playVideo(String, String)>
			return true;
	//   83  175:iconst_1        
	//   84  176:ireturn         
		} else
		{
			veeplayInstance.unitFinished(com.appscend.media.APSMediaPlayer.MPMovieFinishReason.MPMovieFinishReasonPlaybackError);
	//   85  177:aload_0         
	//   86  178:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   87  181:getstatic       #252 <Field com.appscend.media.APSMediaPlayer$MPMovieFinishReason com.appscend.media.APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonPlaybackError>
	//   88  184:invokevirtual   #256 <Method void APSMediaPlayer.unitFinished(com.appscend.media.APSMediaPlayer$MPMovieFinishReason)>
			return true;
	//   89  187:iconst_1        
	//   90  188:ireturn         
		}
	}

	public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
	{
		mediaplayer = ((MediaPlayer) (veeplayInstance));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:astore_1        
		if(mediaplayer == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		switch(i)
	//*   7   11:iload_2         
		{
	//*   8   12:tableswitch     701 702: default 36
	//	               701 94
	//	               702 38
		default:
			return true;
	//    9   36:iconst_1        
	//   10   37:ireturn         

		case 702: 
			((APSMediaPlayer) (mediaplayer)).log("Buffer full. Resuming");
	//   11   38:aload_1         
	//   12   39:ldc2            #296 <String "Buffer full. Resuming">
	//   13   42:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
			LivestreamInternalTimer.INSTANCE.start();
	//   14   45:getstatic       #302 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//   15   48:invokevirtual   #305 <Method void LivestreamInternalTimer.start()>
			veeplayInstance.hideHud();
	//   16   51:aload_0         
	//   17   52:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   18   55:invokevirtual   #211 <Method void APSMediaPlayer.hideHud()>
			veeplayInstance.emitEvent(new ArrayList(), "com.appscend.mp.notifications.statuschanged", com.appscend.media.APSMediaTrackingEvents.MediaEventType.BUFFER_END, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (veeplayInstance._currentUnit)));
	//   19   58:aload_0         
	//   20   59:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   21   62:new             #307 <Class ArrayList>
	//   22   65:dup             
	//   23   66:invokespecial   #308 <Method void ArrayList()>
	//   24   69:ldc2            #310 <String "com.appscend.mp.notifications.statuschanged">
	//   25   72:getstatic       #316 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.BUFFER_END>
	//   26   75:new             #318 <Class Bundle>
	//   27   78:dup             
	//   28   79:invokespecial   #319 <Method void Bundle()>
	//   29   82:aload_0         
	//   30   83:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   31   86:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   32   89:invokevirtual   #323 <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
			return true;
	//   33   92:iconst_1        
	//   34   93:ireturn         

		case 701: 
			((APSMediaPlayer) (mediaplayer)).log("Buffer empty. Pausing.");
	//   35   94:aload_1         
	//   36   95:ldc2            #325 <String "Buffer empty. Pausing.">
	//   37   98:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
			LivestreamInternalTimer.INSTANCE.stop();
	//   38  101:getstatic       #302 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//   39  104:invokevirtual   #328 <Method void LivestreamInternalTimer.stop()>
			veeplayInstance.showHud();
	//   40  107:aload_0         
	//   41  108:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   42  111:invokevirtual   #331 <Method void APSMediaPlayer.showHud()>
			veeplayInstance.emitEvent(new ArrayList(), "com.appscend.mp.notifications.statuschanged", com.appscend.media.APSMediaTrackingEvents.MediaEventType.BUFFER_START, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (veeplayInstance._currentUnit)));
	//   43  114:aload_0         
	//   44  115:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   45  118:new             #307 <Class ArrayList>
	//   46  121:dup             
	//   47  122:invokespecial   #308 <Method void ArrayList()>
	//   48  125:ldc2            #310 <String "com.appscend.mp.notifications.statuschanged">
	//   49  128:getstatic       #334 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.BUFFER_START>
	//   50  131:new             #318 <Class Bundle>
	//   51  134:dup             
	//   52  135:invokespecial   #319 <Method void Bundle()>
	//   53  138:aload_0         
	//   54  139:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   55  142:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   56  145:invokevirtual   #323 <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
			return true;
	//   57  148:iconst_1        
	//   58  149:ireturn         
		}
	}

	public void onPrepared(MediaPlayer mediaplayer)
	{
		veeplayInstance.log("mp prepared");
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:ldc2            #337 <String "mp prepared">
	//    3    7:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		_playerPrepared = true;
	//    4   10:aload_0         
	//    5   11:iconst_1        
	//    6   12:putfield        #53  <Field boolean _playerPrepared>
		LivestreamInternalTimer.INSTANCE.reset();
	//    7   15:getstatic       #302 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//    8   18:invokevirtual   #340 <Method void LivestreamInternalTimer.reset()>
		veeplayInstance.hideHud();
	//    9   21:aload_0         
	//   10   22:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   11   25:invokevirtual   #211 <Method void APSMediaPlayer.hideHud()>
		loadStatePlayable();
	//   12   28:aload_0         
	//   13   29:invokevirtual   #341 <Method void loadStatePlayable()>
	//   14   32:return          
	}

	public void onSeekComplete(MediaPlayer mediaplayer)
	{
		veeplayInstance.notifySeekFinished();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:invokevirtual   #345 <Method void APSMediaPlayer.notifySeekFinished()>
	//    3    7:return          
	}

	public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
	{
		mediaplayer = ((MediaPlayer) (veeplayInstance));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #228 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #229 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append("video size changed. width: ");
	//    7   14:aload           4
	//    8   16:ldc2            #349 <String "video size changed. width: ">
	//    9   19:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append(i);
	//   11   23:aload           4
	//   12   25:iload_2         
	//   13   26:invokevirtual   #278 <Method StringBuilder StringBuilder.append(int)>
	//   14   29:pop             
		stringbuilder.append(" height: ");
	//   15   30:aload           4
	//   16   32:ldc2            #351 <String " height: ">
	//   17   35:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(j);
	//   19   39:aload           4
	//   20   41:iload_3         
	//   21   42:invokevirtual   #278 <Method StringBuilder StringBuilder.append(int)>
	//   22   45:pop             
		((APSMediaPlayer) (mediaplayer)).log(stringbuilder.toString());
	//   23   46:aload_1         
	//   24   47:aload           4
	//   25   49:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   26   52:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		if(i != 0)
	//*  27   55:iload_2         
	//*  28   56:ifeq            105
		{
			if(j == 0)
	//*  29   59:iload_3         
	//*  30   60:ifne            64
				return;
	//   31   63:return          
			_videoWidth = i;
	//   32   64:aload_0         
	//   33   65:iload_2         
	//   34   66:putfield        #88  <Field int _videoWidth>
			_videoHeight = j;
	//   35   69:aload_0         
	//   36   70:iload_3         
	//   37   71:putfield        #90  <Field int _videoHeight>
			playingSurfaceSizeChanged();
	//   38   74:aload_0         
	//   39   75:invokevirtual   #354 <Method void playingSurfaceSizeChanged()>
			mIsVideoSizeKnown = true;
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:putfield        #57  <Field boolean mIsVideoSizeKnown>
			if(mIsVideoReadyToBePlayed && !veeplayInstance.isPaused())
	//*  43   83:aload_0         
	//*  44   84:getfield        #55  <Field boolean mIsVideoReadyToBePlayed>
	//*  45   87:ifeq            104
	//*  46   90:aload_0         
	//*  47   91:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//*  48   94:invokevirtual   #357 <Method boolean APSMediaPlayer.isPaused()>
	//*  49   97:ifne            104
				startVideoPlayback();
	//   50  100:aload_0         
	//   51  101:invokevirtual   #226 <Method void startVideoPlayback()>
			return;
	//   52  104:return          
		} else
		{
			return;
	//   53  105:return          
		}
	}

	public void pause()
	{
		_savedCurrentPlaybackTime = veeplayInstance.currentPlaybackTime();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    3    5:invokevirtual   #361 <Method int APSMediaPlayer.currentPlaybackTime()>
	//    4    8:i2l             
	//    5    9:putfield        #59  <Field long _savedCurrentPlaybackTime>
		Object obj = ((Object) (veeplayInstance));
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    8   16:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #228 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #229 <Method void StringBuilder()>
	//   12   24:astore_2        
		stringbuilder.append("save current playback time: ");
	//   13   25:aload_2         
	//   14   26:ldc2            #363 <String "save current playback time: ">
	//   15   29:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(_savedCurrentPlaybackTime);
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:getfield        #59  <Field long _savedCurrentPlaybackTime>
	//   20   38:invokevirtual   #366 <Method StringBuilder StringBuilder.append(long)>
	//   21   41:pop             
		((APSMediaPlayer) (obj)).log(stringbuilder.toString());
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   25   47:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		obj = ((Object) (_player));
	//   26   50:aload_0         
	//   27   51:getfield        #79  <Field MediaPlayer _player>
	//   28   54:astore_1        
		if(obj != null && ((MediaPlayer) (obj)).isPlaying())
	//*  29   55:aload_1         
	//*  30   56:ifnull          73
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #369 <Method boolean MediaPlayer.isPlaying()>
	//*  33   63:ifeq            73
			_player.pause();
	//   34   66:aload_0         
	//   35   67:getfield        #79  <Field MediaPlayer _player>
	//   36   70:invokevirtual   #371 <Method void MediaPlayer.pause()>
	//   37   73:return          
	}

	public void playVideo(String s)
	{
		try
		{
			_playerPrepared = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #53  <Field boolean _playerPrepared>
			veeplayInstance._currentUnit.url = s;
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    5    9:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//    6   12:aload_1         
	//    7   13:putfield        #220 <Field String APSMediaUnit.url>
			if(_player != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #79  <Field MediaPlayer _player>
	//*  10   20:ifnull          37
			{
				_player.reset();
	//   11   23:aload_0         
	//   12   24:getfield        #79  <Field MediaPlayer _player>
	//   13   27:invokevirtual   #372 <Method void MediaPlayer.reset()>
				_player.release();
	//   14   30:aload_0         
	//   15   31:getfield        #79  <Field MediaPlayer _player>
	//   16   34:invokevirtual   #375 <Method void MediaPlayer.release()>
			}
			if(veeplayInstance._currentUnit.url != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//*  19   41:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//*  20   44:getfield        #220 <Field String APSMediaUnit.url>
	//*  21   47:ifnull          206
			{
				_player = new MediaPlayer();
	//   22   50:aload_0         
	//   23   51:new             #139 <Class MediaPlayer>
	//   24   54:dup             
	//   25   55:invokespecial   #376 <Method void MediaPlayer()>
	//   26   58:putfield        #79  <Field MediaPlayer _player>
				_player.setDataSource(veeplayInstance._currentUnit.url);
	//   27   61:aload_0         
	//   28   62:getfield        #79  <Field MediaPlayer _player>
	//   29   65:aload_0         
	//   30   66:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   31   69:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   32   72:getfield        #220 <Field String APSMediaUnit.url>
	//   33   75:invokevirtual   #379 <Method void MediaPlayer.setDataSource(String)>
				if(surfaceHolder != null)
	//*  34   78:aload_0         
	//*  35   79:getfield        #73  <Field SurfaceHolder surfaceHolder>
	//*  36   82:ifnull          96
					_player.setDisplay(surfaceHolder);
	//   37   85:aload_0         
	//   38   86:getfield        #79  <Field MediaPlayer _player>
	//   39   89:aload_0         
	//   40   90:getfield        #73  <Field SurfaceHolder surfaceHolder>
	//   41   93:invokevirtual   #383 <Method void MediaPlayer.setDisplay(SurfaceHolder)>
				_player.setScreenOnWhilePlaying(true);
	//   42   96:aload_0         
	//   43   97:getfield        #79  <Field MediaPlayer _player>
	//   44  100:iconst_1        
	//   45  101:invokevirtual   #386 <Method void MediaPlayer.setScreenOnWhilePlaying(boolean)>
				_player.setOnPreparedListener(((android.media.MediaPlayer.OnPreparedListener) (this)));
	//   46  104:aload_0         
	//   47  105:getfield        #79  <Field MediaPlayer _player>
	//   48  108:aload_0         
	//   49  109:invokevirtual   #390 <Method void MediaPlayer.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
				_player.setOnBufferingUpdateListener(((android.media.MediaPlayer.OnBufferingUpdateListener) (this)));
	//   50  112:aload_0         
	//   51  113:getfield        #79  <Field MediaPlayer _player>
	//   52  116:aload_0         
	//   53  117:invokevirtual   #394 <Method void MediaPlayer.setOnBufferingUpdateListener(android.media.MediaPlayer$OnBufferingUpdateListener)>
				_player.setOnErrorListener(((android.media.MediaPlayer.OnErrorListener) (this)));
	//   54  120:aload_0         
	//   55  121:getfield        #79  <Field MediaPlayer _player>
	//   56  124:aload_0         
	//   57  125:invokevirtual   #398 <Method void MediaPlayer.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
				_player.setOnInfoListener(((android.media.MediaPlayer.OnInfoListener) (this)));
	//   58  128:aload_0         
	//   59  129:getfield        #79  <Field MediaPlayer _player>
	//   60  132:aload_0         
	//   61  133:invokevirtual   #402 <Method void MediaPlayer.setOnInfoListener(android.media.MediaPlayer$OnInfoListener)>
				_player.setOnCompletionListener(((android.media.MediaPlayer.OnCompletionListener) (this)));
	//   62  136:aload_0         
	//   63  137:getfield        #79  <Field MediaPlayer _player>
	//   64  140:aload_0         
	//   65  141:invokevirtual   #406 <Method void MediaPlayer.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
				_player.setOnVideoSizeChangedListener(((android.media.MediaPlayer.OnVideoSizeChangedListener) (this)));
	//   66  144:aload_0         
	//   67  145:getfield        #79  <Field MediaPlayer _player>
	//   68  148:aload_0         
	//   69  149:invokevirtual   #410 <Method void MediaPlayer.setOnVideoSizeChangedListener(android.media.MediaPlayer$OnVideoSizeChangedListener)>
				_player.prepareAsync();
	//   70  152:aload_0         
	//   71  153:getfield        #79  <Field MediaPlayer _player>
	//   72  156:invokevirtual   #413 <Method void MediaPlayer.prepareAsync()>
				veeplayInstance.emitEvent(new ArrayList(), "PLAYBACK_REQUESTED", com.appscend.media.APSMediaTrackingEvents.MediaEventType.PLAYBACK_REQUESTED, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (veeplayInstance._currentUnit)));
	//   73  159:aload_0         
	//   74  160:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   75  163:new             #307 <Class ArrayList>
	//   76  166:dup             
	//   77  167:invokespecial   #308 <Method void ArrayList()>
	//   78  170:ldc2            #415 <String "PLAYBACK_REQUESTED">
	//   79  173:getstatic       #417 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.PLAYBACK_REQUESTED>
	//   80  176:new             #318 <Class Bundle>
	//   81  179:dup             
	//   82  180:invokespecial   #319 <Method void Bundle()>
	//   83  183:aload_0         
	//   84  184:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   85  187:getfield        #215 <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//   86  190:invokevirtual   #323 <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
				veeplayInstance.showHud();
	//   87  193:aload_0         
	//   88  194:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   89  197:invokevirtual   #331 <Method void APSMediaPlayer.showHud()>
				return;
	//   90  200:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  91  201:astore_1        
		{
			((Exception) (s)).printStackTrace();
	//   92  202:aload_1         
	//   93  203:invokevirtual   #145 <Method void Exception.printStackTrace()>
		}
	//   94  206:return          
	}

	public void playVideo(String s, String s1)
	{
		playVideo(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #419 <Method void playVideo(String)>
	//    3    5:return          
	}

	public void playingSurfaceSizeChanged()
	{
		if(_videoHeight != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field int _videoHeight>
	//*   2    4:ifeq            174
		{
			if(_videoWidth == 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #88  <Field int _videoWidth>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			int k = veeplayInstance.getMainViewWidth();
	//    7   15:aload_0         
	//    8   16:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    9   19:invokevirtual   #422 <Method int APSMediaPlayer.getMainViewWidth()>
	//   10   22:istore          6
			int l = veeplayInstance.getMainViewHeight();
	//   11   24:aload_0         
	//   12   25:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   13   28:invokevirtual   #425 <Method int APSMediaPlayer.getMainViewHeight()>
	//   14   31:istore          7
			int j = k;
	//   15   33:iload           6
	//   16   35:istore          5
			int i = l;
	//   17   37:iload           7
	//   18   39:istore          4
			if(k == -1)
	//*  19   41:iload           6
	//*  20   43:iconst_m1       
	//*  21   44:icmpne          71
			{
				j = k;
	//   22   47:iload           6
	//   23   49:istore          5
				i = l;
	//   24   51:iload           7
	//   25   53:istore          4
				if(l == -1)
	//*  26   55:iload           7
	//*  27   57:iconst_m1       
	//*  28   58:icmpne          71
				{
					j = VPUtilities.getWidth();
	//   29   61:invokestatic    #430 <Method int VPUtilities.getWidth()>
	//   30   64:istore          5
					i = VPUtilities.getHeight();
	//   31   66:invokestatic    #433 <Method int VPUtilities.getHeight()>
	//   32   69:istore          4
				}
			}
			float f = (float)_videoWidth / (float)_videoHeight;
	//   33   71:aload_0         
	//   34   72:getfield        #88  <Field int _videoWidth>
	//   35   75:i2f             
	//   36   76:aload_0         
	//   37   77:getfield        #90  <Field int _videoHeight>
	//   38   80:i2f             
	//   39   81:fdiv            
	//   40   82:fstore_1        
			float f1 = j;
	//   41   83:iload           5
	//   42   85:i2f             
	//   43   86:fstore_2        
			float f2 = i;
	//   44   87:iload           4
	//   45   89:i2f             
	//   46   90:fstore_3        
			if(f > f1 / f2)
	//*  47   91:fload_1         
	//*  48   92:fload_2         
	//*  49   93:fload_3         
	//*  50   94:fdiv            
	//*  51   95:fcmpl           
	//*  52   96:ifle            108
				i = (int)(f1 / f);
	//   53   99:fload_2         
	//   54  100:fload_1         
	//   55  101:fdiv            
	//   56  102:f2i             
	//   57  103:istore          4
			else
	//*  58  105:goto            114
				j = (int)(f * f2);
	//   59  108:fload_1         
	//   60  109:fload_3         
	//   61  110:fmul            
	//   62  111:f2i             
	//   63  112:istore          5
			_videoWidth = j;
	//   64  114:aload_0         
	//   65  115:iload           5
	//   66  117:putfield        #88  <Field int _videoWidth>
			_videoHeight = i;
	//   67  120:aload_0         
	//   68  121:iload           4
	//   69  123:putfield        #90  <Field int _videoHeight>
			Object obj = ((Object) (surfaceHolder));
	//   70  126:aload_0         
	//   71  127:getfield        #73  <Field SurfaceHolder surfaceHolder>
	//   72  130:astore          8
			if(obj != null)
	//*  73  132:aload           8
	//*  74  134:ifnull          144
				((SurfaceHolder) (obj)).setSizeFromLayout();
	//   75  137:aload           8
	//   76  139:invokeinterface #436 <Method void SurfaceHolder.setSizeFromLayout()>
			obj = ((Object) (new android.widget.RelativeLayout.LayoutParams(j, i)));
	//   77  144:new             #170 <Class android.widget.RelativeLayout$LayoutParams>
	//   78  147:dup             
	//   79  148:iload           5
	//   80  150:iload           4
	//   81  152:invokespecial   #173 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   82  155:astore          8
			((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
	//   83  157:aload           8
	//   84  159:bipush          13
	//   85  161:invokevirtual   #177 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			surfaceView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   86  164:aload_0         
	//   87  165:getfield        #83  <Field SurfaceView surfaceView>
	//   88  168:aload           8
	//   89  170:invokevirtual   #181 <Method void SurfaceView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			return;
	//   90  173:return          
		} else
		{
			return;
	//   91  174:return          
		}
	}

	public void recylePlayerView()
	{
	//    0    0:return          
	}

	public void release()
	{
		MediaPlayer mediaplayer = _player;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaPlayer _player>
	//    2    4:astore_1        
		if(mediaplayer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			mediaplayer.release();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #375 <Method void MediaPlayer.release()>
			_player = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #79  <Field MediaPlayer _player>
		}
	//   10   18:return          
	}

	public boolean resumePlay()
	{
		MediaPlayer mediaplayer = _player;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaPlayer _player>
	//    2    4:astore_1        
		if(mediaplayer != null && surfaceHolder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
	//*   5    9:aload_0         
	//*   6   10:getfield        #73  <Field SurfaceHolder surfaceHolder>
	//*   7   13:ifnull          22
		{
			mediaplayer.start();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #439 <Method void MediaPlayer.start()>
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		} else
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
	}

	public void seekTo(int i)
	{
		MediaPlayer mediaplayer = _player;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaPlayer _player>
	//    2    4:astore_2        
		if(mediaplayer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			mediaplayer.seekTo(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #442 <Method void MediaPlayer.seekTo(int)>
	//    8   14:return          
	}

	public void setMute(boolean flag)
	{
		MediaPlayer mediaplayer = _player;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaPlayer _player>
	//    2    4:astore_2        
		if(mediaplayer == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            21
		{
			mediaplayer.setVolume(0.0F, 0.0F);
	//    8   14:aload_2         
	//    9   15:fconst_0        
	//   10   16:fconst_0        
	//   11   17:invokevirtual   #447 <Method void MediaPlayer.setVolume(float, float)>
			return;
	//   12   20:return          
		} else
		{
			mediaplayer.setVolume(1.0F, 1.0F);
	//   13   21:aload_2         
	//   14   22:fconst_1        
	//   15   23:fconst_1        
	//   16   24:invokevirtual   #447 <Method void MediaPlayer.setVolume(float, float)>
			return;
	//   17   27:return          
		}
	}

	public void setVolume(float f)
	{
		_player.setVolume(f, f);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaPlayer _player>
	//    2    4:fload_1         
	//    3    5:fload_1         
	//    4    6:invokevirtual   #447 <Method void MediaPlayer.setVolume(float, float)>
	//    5    9:return          
	}

	public void startVideoPlayback()
	{
		if(!veeplayInstance.shouldAutoplay())
			break MISSING_BLOCK_LABEL_32;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:invokevirtual   #455 <Method boolean APSMediaPlayer.shouldAutoplay()>
	//    3    7:ifeq            32
		veeplayInstance.play();
	//    4   10:aload_0         
	//    5   11:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    6   14:invokevirtual   #458 <Method void APSMediaPlayer.play()>
		break MISSING_BLOCK_LABEL_42;
	//    7   17:goto            42
		Object obj;
		obj;
	//    8   20:astore_1        
		break MISSING_BLOCK_LABEL_25;
	//    9   21:goto            25
		obj;
	//   10   24:astore_1        
		((Exception) (obj)).printStackTrace();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #145 <Method void Exception.printStackTrace()>
		break MISSING_BLOCK_LABEL_42;
	//   13   29:goto            42
		veeplayInstance.log("should have started playback but autoplay is off.");
	//   14   32:aload_0         
	//   15   33:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//   16   36:ldc2            #460 <String "should have started playback but autoplay is off.">
	//   17   39:invokevirtual   #160 <Method void APSMediaPlayer.log(String)>
		clearSurfaceView(true);
	//   18   42:aload_0         
	//   19   43:iconst_1        
	//   20   44:invokevirtual   #462 <Method void clearSurfaceView(boolean)>
		return;
	//   21   47:return          
	}

	public void switchSurface(PlayerView playerview)
	{
	//    0    0:return          
	}

	public String type()
	{
		return rendererIdentifier;
	//    0    0:getstatic       #467 <Field String rendererIdentifier>
	//    1    3:areturn         
	}

	public void unitFinished(com.appscend.media.APSMediaPlayer.MPMovieFinishReason mpmoviefinishreason)
	{
		mpmoviefinishreason = ((com.appscend.media.APSMediaPlayer.MPMovieFinishReason) (_player));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaPlayer _player>
	//    2    4:astore_1        
		if(mpmoviefinishreason != null && ((MediaPlayer) (mpmoviefinishreason)).isPlaying())
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #369 <Method boolean MediaPlayer.isPlaying()>
	//*   7   13:ifeq            23
			_player.stop();
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field MediaPlayer _player>
	//   10   20:invokevirtual   #468 <Method void MediaPlayer.stop()>
		doCleanUp();
	//   11   23:aload_0         
	//   12   24:invokespecial   #470 <Method void doCleanUp()>
		clearSurfaceView(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #462 <Method void clearSurfaceView(boolean)>
		mpmoviefinishreason = ((com.appscend.media.APSMediaPlayer.MPMovieFinishReason) (_player));
	//   16   32:aload_0         
	//   17   33:getfield        #79  <Field MediaPlayer _player>
	//   18   36:astore_1        
		if(mpmoviefinishreason != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          52
		{
			((MediaPlayer) (mpmoviefinishreason)).stop();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #468 <Method void MediaPlayer.stop()>
			_player.reset();
	//   23   45:aload_0         
	//   24   46:getfield        #79  <Field MediaPlayer _player>
	//   25   49:invokevirtual   #372 <Method void MediaPlayer.reset()>
		}
		_playerPrepared = false;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #53  <Field boolean _playerPrepared>
		_savedCurrentPlaybackTime = 0L;
	//   29   57:aload_0         
	//   30   58:lconst_0        
	//   31   59:putfield        #59  <Field long _savedCurrentPlaybackTime>
	//   32   62:return          
	}

	public static String rendererIdentifier = "media-player-renderer";
	private MediaPlayer _player;
	private boolean _playerPrepared;
	private long _savedCurrentPlaybackTime;
	private int _videoHeight;
	private int _videoWidth;
	private boolean mIsVideoReadyToBePlayed;
	private boolean mIsVideoSizeKnown;
	private SurfaceHolder surfaceHolder;
	private SurfaceView surfaceView;
	private APSMediaPlayer veeplayInstance;

	static 
	{
	//    0    0:return          
	}


/*
	static APSMediaPlayer access$000(MediaPlayerRenderer mediaplayerrenderer)
	{
		return mediaplayerrenderer.veeplayInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field APSMediaPlayer veeplayInstance>
	//    2    4:areturn         
	}

*/


/*
	static SurfaceHolder access$100(MediaPlayerRenderer mediaplayerrenderer)
	{
		return mediaplayerrenderer.surfaceHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field SurfaceHolder surfaceHolder>
	//    2    4:areturn         
	}

*/


/*
	static SurfaceHolder access$102(MediaPlayerRenderer mediaplayerrenderer, SurfaceHolder surfaceholder)
	{
		mediaplayerrenderer.surfaceHolder = surfaceholder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field SurfaceHolder surfaceHolder>
		return surfaceholder;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static MediaPlayer access$200(MediaPlayerRenderer mediaplayerrenderer)
	{
		return mediaplayerrenderer._player;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field MediaPlayer _player>
	//    2    4:areturn         
	}

*/


/*
	static SurfaceView access$300(MediaPlayerRenderer mediaplayerrenderer)
	{
		return mediaplayerrenderer.surfaceView;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field SurfaceView surfaceView>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$400(MediaPlayerRenderer mediaplayerrenderer)
	{
		return mediaplayerrenderer._playerPrepared;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean _playerPrepared>
	//    2    4:ireturn         
	}

*/
}
