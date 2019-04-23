// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaUnit;
import com.appscend.utilities.UnitManager;

// Referenced classes of package com.appscend.media.renderers:
//			MediaPlayerRenderer

class MediaPlayerRenderer$1
	implements android.view.
{

	public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
	{
		MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).log("Surface changed");
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaPlayerRenderer this$0>
	//    2    4:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
	//    3    7:ldc1            #29  <String "Surface changed">
	//    4    9:invokevirtual   #35  <Method void APSMediaPlayer.log(String)>
	//    5   12:return          
	}

	public void surfaceCreated(SurfaceHolder surfaceholder)
	{
		MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).log("Surface created");
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaPlayerRenderer this$0>
	//    2    4:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
	//    3    7:ldc1            #45  <String "Surface created">
	//    4    9:invokevirtual   #35  <Method void APSMediaPlayer.log(String)>
		MediaPlayerRenderer.access$102(MediaPlayerRenderer.this, surfaceholder);
	//    5   12:aload_0         
	//    6   13:getfield        #17  <Field MediaPlayerRenderer this$0>
	//    7   16:aload_1         
	//    8   17:invokestatic    #49  <Method SurfaceHolder MediaPlayerRenderer.access$102(MediaPlayerRenderer, SurfaceHolder)>
	//    9   20:pop             
		if(MediaPlayerRenderer.access$200(MediaPlayerRenderer.this) != null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #17  <Field MediaPlayerRenderer this$0>
	//*  12   25:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
	//*  13   28:ifnull          56
			try
			{
				MediaPlayerRenderer.access$200(MediaPlayerRenderer.this).setDisplay(MediaPlayerRenderer.access$100(MediaPlayerRenderer.this));
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
		if(MediaPlayerRenderer.access$000(MediaPlayerRenderer.this)._currentUnit != null && MediaPlayerRenderer.access$000(MediaPlayerRenderer.this)._currentUnit.url != null)
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
			MediaPlayerRenderer.access$300(MediaPlayerRenderer.this).setVisibility(0);
	//   36   85:aload_0         
	//   37   86:getfield        #17  <Field MediaPlayerRenderer this$0>
	//   38   89:invokestatic    #79  <Method SurfaceView MediaPlayerRenderer.access$300(MediaPlayerRenderer)>
	//   39   92:iconst_0        
	//   40   93:invokevirtual   #85  <Method void SurfaceView.setVisibility(int)>
		if(MediaPlayerRenderer.access$400(MediaPlayerRenderer.this))
	//*  41   96:aload_0         
	//*  42   97:getfield        #17  <Field MediaPlayerRenderer this$0>
	//*  43  100:invokestatic    #89  <Method boolean MediaPlayerRenderer.access$400(MediaPlayerRenderer)>
	//*  44  103:ifeq            150
		{
			if(!MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).isPaused() && MediaPlayerRenderer.access$200(MediaPlayerRenderer.this) != null)
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
					MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).play();
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
			if(MediaPlayerRenderer.access$000(MediaPlayerRenderer.this)._currentUnit == null)
	//*  65  150:aload_0         
	//*  66  151:getfield        #17  <Field MediaPlayerRenderer this$0>
	//*  67  154:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
	//*  68  157:getfield        #69  <Field APSMediaUnit APSMediaPlayer._currentUnit>
	//*  69  160:ifnonnull       164
				return;
	//   70  163:return          
			if(MediaPlayerRenderer.access$000(MediaPlayerRenderer.this)._currentUnit.manager == null && !MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).isPaused())
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
				((MediaPlayerRenderer) (surfaceholder)).playVideo(MediaPlayerRenderer.access$000(((MediaPlayerRenderer) (surfaceholder)))._currentUnit.url, MediaPlayerRenderer.access$000(MediaPlayerRenderer.this)._currentUnit.subtitlesUrl);
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
			if(!MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).isPaused())
	//*  97  226:aload_0         
	//*  98  227:getfield        #17  <Field MediaPlayerRenderer this$0>
	//*  99  230:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
	//* 100  233:invokevirtual   #93  <Method boolean APSMediaPlayer.isPaused()>
	//* 101  236:ifne            292
			{
				((UnitManager)MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).adapterForTypeInGroup(MediaPlayerRenderer.access$000(MediaPlayerRenderer.this)._currentUnit.manager, "com.appscend.mp.drm")).start(MediaPlayerRenderer.access$000(MediaPlayerRenderer.this)._currentUnit);
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
				MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).showHud();
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
		MediaPlayerRenderer.access$000(MediaPlayerRenderer.this).log("Surface destroyed");
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaPlayerRenderer this$0>
	//    2    4:invokestatic    #27  <Method APSMediaPlayer MediaPlayerRenderer.access$000(MediaPlayerRenderer)>
	//    3    7:ldc1            #127 <String "Surface destroyed">
	//    4    9:invokevirtual   #35  <Method void APSMediaPlayer.log(String)>
		if(MediaPlayerRenderer.access$200(MediaPlayerRenderer.this) != null && MediaPlayerRenderer.access$200(MediaPlayerRenderer.this).isPlaying())
	//*   5   12:aload_0         
	//*   6   13:getfield        #17  <Field MediaPlayerRenderer this$0>
	//*   7   16:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
	//*   8   19:ifnull          45
	//*   9   22:aload_0         
	//*  10   23:getfield        #17  <Field MediaPlayerRenderer this$0>
	//*  11   26:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
	//*  12   29:invokevirtual   #130 <Method boolean MediaPlayer.isPlaying()>
	//*  13   32:ifeq            45
			MediaPlayerRenderer.access$200(MediaPlayerRenderer.this).pause();
	//   14   35:aload_0         
	//   15   36:getfield        #17  <Field MediaPlayerRenderer this$0>
	//   16   39:invokestatic    #53  <Method MediaPlayer MediaPlayerRenderer.access$200(MediaPlayerRenderer)>
	//   17   42:invokevirtual   #133 <Method void MediaPlayer.pause()>
		MediaPlayerRenderer.access$102(MediaPlayerRenderer.this, ((SurfaceHolder) (null)));
	//   18   45:aload_0         
	//   19   46:getfield        #17  <Field MediaPlayerRenderer this$0>
	//   20   49:aconst_null     
	//   21   50:invokestatic    #49  <Method SurfaceHolder MediaPlayerRenderer.access$102(MediaPlayerRenderer, SurfaceHolder)>
	//   22   53:pop             
	//   23   54:return          
	}

	final MediaPlayerRenderer this$0;

	MediaPlayerRenderer$1()
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
