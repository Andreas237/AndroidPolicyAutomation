// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.app.Activity;
import android.app.Dialog;
import android.content.*;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.*;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.view.*;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appscend.hub.KRHub;
import com.appscend.licensing.*;
import com.appscend.media.events.APSMediaEvent;
import com.appscend.media.events.APSMediaEventStateListener;
import com.appscend.media.events.APSMediaEventTimeoutListener;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.media.events.APSMediaUnit;
import com.appscend.media.renderers.ExoPlayerRenderer;
import com.appscend.media.renderers.IVeeplayRenderer;
import com.appscend.media.renderers.MediaPlayerRenderer;
import com.appscend.overlaycontrollers.*;
import com.appscend.utilities.*;
import com.appscend.vast.APSVASTXMLNode;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class APSMediaPlayer extends KRHub
	implements VolumeChangedInterface, APSMediaEventStateListener, APSMediaEventTimeoutListener
{
	public static final class FullscreenOrientationBehaviour extends Enum
	{

		public static FullscreenOrientationBehaviour valueOf(String s)
		{
			return (FullscreenOrientationBehaviour)Enum.valueOf(com/appscend/media/APSMediaPlayer$FullscreenOrientationBehaviour, s);
		//    0    0:ldc1            #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
		//    4    9:areturn         
		}

		public static FullscreenOrientationBehaviour[] values()
		{
			return (FullscreenOrientationBehaviour[])((FullscreenOrientationBehaviour []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field APSMediaPlayer$FullscreenOrientationBehaviour[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.APSMediaPlayer$FullscreenOrientationBehaviour_3B_.clone()>
		//    2    6:checkcast       #42  <Class APSMediaPlayer$FullscreenOrientationBehaviour[]>
		//    3    9:areturn         
		}

		private static final FullscreenOrientationBehaviour $VALUES[];
		public static final FullscreenOrientationBehaviour defaultBehaviour;
		public static final FullscreenOrientationBehaviour sensorLandscapeOrientation;
		public static final FullscreenOrientationBehaviour sensorPortraitOrientation;

		static 
		{
			defaultBehaviour = new FullscreenOrientationBehaviour("defaultBehaviour", 0);
		//    0    0:new             #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "defaultBehaviour">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void APSMediaPlayer$FullscreenOrientationBehaviour(String, int)>
		//    5   10:putstatic       #23  <Field APSMediaPlayer$FullscreenOrientationBehaviour defaultBehaviour>
			sensorLandscapeOrientation = new FullscreenOrientationBehaviour("sensorLandscapeOrientation", 1);
		//    6   13:new             #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "sensorLandscapeOrientation">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void APSMediaPlayer$FullscreenOrientationBehaviour(String, int)>
		//   11   23:putstatic       #26  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorLandscapeOrientation>
			sensorPortraitOrientation = new FullscreenOrientationBehaviour("sensorPortraitOrientation", 2);
		//   12   26:new             #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "sensorPortraitOrientation">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void APSMediaPlayer$FullscreenOrientationBehaviour(String, int)>
		//   17   36:putstatic       #29  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorPortraitOrientation>
			$VALUES = (new FullscreenOrientationBehaviour[] {
				defaultBehaviour, sensorLandscapeOrientation, sensorPortraitOrientation
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       FullscreenOrientationBehaviour[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field APSMediaPlayer$FullscreenOrientationBehaviour defaultBehaviour>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorLandscapeOrientation>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorPortraitOrientation>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field APSMediaPlayer$FullscreenOrientationBehaviour[] $VALUES>
		//*  33   64:return          
		}

		private FullscreenOrientationBehaviour(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class MPMovieFinishReason extends Enum
	{

		public static MPMovieFinishReason valueOf(String s)
		{
			return (MPMovieFinishReason)Enum.valueOf(com/appscend/media/APSMediaPlayer$MPMovieFinishReason, s);
		//    0    0:ldc1            #2   <Class APSMediaPlayer$MPMovieFinishReason>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaPlayer$MPMovieFinishReason>
		//    4    9:areturn         
		}

		public static MPMovieFinishReason[] values()
		{
			return (MPMovieFinishReason[])((MPMovieFinishReason []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field APSMediaPlayer$MPMovieFinishReason[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.appscend.media.APSMediaPlayer$MPMovieFinishReason_3B_.clone()>
		//    2    6:checkcast       #46  <Class APSMediaPlayer$MPMovieFinishReason[]>
		//    3    9:areturn         
		}

		private static final MPMovieFinishReason $VALUES[];
		public static final MPMovieFinishReason MPMovieFinishReasonNone;
		public static final MPMovieFinishReason MPMovieFinishReasonPlaybackEnded;
		public static final MPMovieFinishReason MPMovieFinishReasonPlaybackError;
		public static final MPMovieFinishReason MPMovieFinishReasonUserExited;

		static 
		{
			MPMovieFinishReasonNone = new MPMovieFinishReason("MPMovieFinishReasonNone", 0);
		//    0    0:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "MPMovieFinishReasonNone">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
		//    5   10:putstatic       #24  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonNone>
			MPMovieFinishReasonPlaybackEnded = new MPMovieFinishReason("MPMovieFinishReasonPlaybackEnded", 1);
		//    6   13:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "MPMovieFinishReasonPlaybackEnded">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
		//   11   23:putstatic       #27  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackEnded>
			MPMovieFinishReasonUserExited = new MPMovieFinishReason("MPMovieFinishReasonUserExited", 2);
		//   12   26:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "MPMovieFinishReasonUserExited">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
		//   17   36:putstatic       #30  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonUserExited>
			MPMovieFinishReasonPlaybackError = new MPMovieFinishReason("MPMovieFinishReasonPlaybackError", 3);
		//   18   39:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "MPMovieFinishReasonPlaybackError">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
		//   23   49:putstatic       #33  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackError>
			$VALUES = (new MPMovieFinishReason[] {
				MPMovieFinishReasonNone, MPMovieFinishReasonPlaybackEnded, MPMovieFinishReasonUserExited, MPMovieFinishReasonPlaybackError
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       MPMovieFinishReason[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonNone>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackEnded>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonUserExited>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackError>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field APSMediaPlayer$MPMovieFinishReason[] $VALUES>
		//*  43   83:return          
		}

		private MPMovieFinishReason(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class MPMoviePlaybackState extends Enum
	{

		public static MPMoviePlaybackState valueOf(String s)
		{
			return (MPMoviePlaybackState)Enum.valueOf(com/appscend/media/APSMediaPlayer$MPMoviePlaybackState, s);
		//    0    0:ldc1            #2   <Class APSMediaPlayer$MPMoviePlaybackState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaPlayer$MPMoviePlaybackState>
		//    4    9:areturn         
		}

		public static MPMoviePlaybackState[] values()
		{
			return (MPMoviePlaybackState[])((MPMoviePlaybackState []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field APSMediaPlayer$MPMoviePlaybackState[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.appscend.media.APSMediaPlayer$MPMoviePlaybackState_3B_.clone()>
		//    2    6:checkcast       #50  <Class APSMediaPlayer$MPMoviePlaybackState[]>
		//    3    9:areturn         
		}

		private static final MPMoviePlaybackState $VALUES[];
		public static final MPMoviePlaybackState MPMoviePlaybackPaused;
		public static final MPMoviePlaybackState MPMoviePlaybackPlaying;
		public static final MPMoviePlaybackState MPMoviePlaybackSeekingBackward;
		public static final MPMoviePlaybackState MPMoviePlaybackSeekingForward;
		public static final MPMoviePlaybackState MPMoviePlaybackStopped;

		static 
		{
			MPMoviePlaybackPaused = new MPMoviePlaybackState("MPMoviePlaybackPaused", 0);
		//    0    0:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "MPMoviePlaybackPaused">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
		//    5   10:putstatic       #25  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPaused>
			MPMoviePlaybackPlaying = new MPMoviePlaybackState("MPMoviePlaybackPlaying", 1);
		//    6   13:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "MPMoviePlaybackPlaying">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
		//   11   23:putstatic       #28  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPlaying>
			MPMoviePlaybackStopped = new MPMoviePlaybackState("MPMoviePlaybackStopped", 2);
		//   12   26:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "MPMoviePlaybackStopped">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
		//   17   36:putstatic       #31  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackStopped>
			MPMoviePlaybackSeekingBackward = new MPMoviePlaybackState("MPMoviePlaybackSeekingBackward", 3);
		//   18   39:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "MPMoviePlaybackSeekingBackward">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
		//   23   49:putstatic       #34  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingBackward>
			MPMoviePlaybackSeekingForward = new MPMoviePlaybackState("MPMoviePlaybackSeekingForward", 4);
		//   24   52:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "MPMoviePlaybackSeekingForward">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
		//   29   62:putstatic       #37  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingForward>
			$VALUES = (new MPMoviePlaybackState[] {
				MPMoviePlaybackPaused, MPMoviePlaybackPlaying, MPMoviePlaybackStopped, MPMoviePlaybackSeekingBackward, MPMoviePlaybackSeekingForward
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       MPMoviePlaybackState[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPaused>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPlaying>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackStopped>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingBackward>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingForward>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field APSMediaPlayer$MPMoviePlaybackState[] $VALUES>
		//*  53  102:return          
		}

		private MPMoviePlaybackState(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private class trackURL extends AsyncTask
	{

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((String[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #25  <Class String[]>
		//    3    5:invokevirtual   #28  <Method Void doInBackground(String[])>
		//    4    8:areturn         
		}

		protected transient Void doInBackground(String as[])
		{
			String s = as[0].replace("\n", "").replace("\t", "");
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:aaload          
		//    3    3:ldc1            #32  <String "\n">
		//    4    5:ldc1            #34  <String "">
		//    5    7:invokevirtual   #40  <Method String String.replace(CharSequence, CharSequence)>
		//    6   10:ldc1            #42  <String "\t">
		//    7   12:ldc1            #34  <String "">
		//    8   14:invokevirtual   #40  <Method String String.replace(CharSequence, CharSequence)>
		//    9   17:astore_2        
			as = ((String []) (s));
		//   10   18:aload_2         
		//   11   19:astore_1        
			if(s.startsWith("//"))
		//*  12   20:aload_2         
		//*  13   21:ldc1            #44  <String "//">
		//*  14   23:invokevirtual   #48  <Method boolean String.startsWith(String)>
		//*  15   26:ifeq            55
			{
				as = ((String []) (new StringBuilder()));
		//   16   29:new             #50  <Class StringBuilder>
		//   17   32:dup             
		//   18   33:invokespecial   #51  <Method void StringBuilder()>
		//   19   36:astore_1        
				((StringBuilder) (as)).append("http:");
		//   20   37:aload_1         
		//   21   38:ldc1            #53  <String "http:">
		//   22   40:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   23   43:pop             
				((StringBuilder) (as)).append(s);
		//   24   44:aload_1         
		//   25   45:aload_2         
		//   26   46:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   27   49:pop             
				as = ((String []) (((StringBuilder) (as)).toString()));
		//   28   50:aload_1         
		//   29   51:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   30   54:astore_1        
			}
			try
			{
				as = ((String []) ((new com.squareup.okhttp.Request.Builder()).url(((String) (as))).header("User-Agent", userAgent).build()));
		//   31   55:new             #63  <Class com.squareup.okhttp.Request$Builder>
		//   32   58:dup             
		//   33   59:invokespecial   #64  <Method void com.squareup.okhttp.Request$Builder()>
		//   34   62:aload_1         
		//   35   63:invokevirtual   #68  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.url(String)>
		//   36   66:ldc1            #70  <String "User-Agent">
		//   37   68:aload_0         
		//   38   69:getfield        #14  <Field APSMediaPlayer this$0>
		//   39   72:invokestatic    #74  <Method String APSMediaPlayer.access$300(APSMediaPlayer)>
		//   40   75:invokevirtual   #78  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.header(String, String)>
		//   41   78:invokevirtual   #82  <Method com.squareup.okhttp.Request com.squareup.okhttp.Request$Builder.build()>
		//   42   81:astore_1        
				APSMediaPlayer.getInstance().getHttpClient().newCall(((com.squareup.okhttp.Request) (as))).execute();
		//   43   82:invokestatic    #86  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
		//   44   85:invokevirtual   #90  <Method OkHttpClient APSMediaPlayer.getHttpClient()>
		//   45   88:aload_1         
		//   46   89:invokevirtual   #96  <Method Call OkHttpClient.newCall(com.squareup.okhttp.Request)>
		//   47   92:invokevirtual   #102 <Method com.squareup.okhttp.Response Call.execute()>
		//   48   95:pop             
			}
		//*  49   96:goto            104
			// Misplaced declaration of an exception variable
			catch(String as[])
		//*  50   99:astore_1        
			{
				((Exception) (as)).printStackTrace();
		//   51  100:aload_1         
		//   52  101:invokevirtual   #105 <Method void Exception.printStackTrace()>
			}
			return null;
		//   53  104:aconst_null     
		//   54  105:areturn         
		}

		final APSMediaPlayer this$0;

		private trackURL()
		{
			this$0 = APSMediaPlayer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field APSMediaPlayer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void AsyncTask()>
		//    5    9:return          
		}

	}


	private APSMediaPlayer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #183 <Method void KRHub()>
		_paused = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #185 <Field boolean _paused>
		_skipped = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #187 <Field boolean _skipped>
		isSeeking = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #189 <Field boolean isSeeking>
		isGoogleCastEnabled = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #191 <Field boolean isGoogleCastEnabled>
		_cachedPlaybackTime = 0L;
	//   14   24:aload_0         
	//   15   25:lconst_0        
	//   16   26:putfield        #193 <Field long _cachedPlaybackTime>
		restrictRootedAccess = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #195 <Field boolean restrictRootedAccess>
		backgroundServiceStarted = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #197 <Field boolean backgroundServiceStarted>
		_muted = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #199 <Field boolean _muted>
		_playableDuration = 0;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #201 <Field int _playableDuration>
		_playbackState = MPMoviePlaybackState.MPMoviePlaybackStopped;
	//   29   49:aload_0         
	//   30   50:getstatic       #204 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//   31   53:putfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
		_durationAvailable = false;
	//   32   56:aload_0         
	//   33   57:iconst_0        
	//   34   58:putfield        #208 <Field boolean _durationAvailable>
		_goBack = false;
	//   35   61:aload_0         
	//   36   62:iconst_0        
	//   37   63:putfield        #210 <Field boolean _goBack>
		youtubeApiKey = null;
	//   38   66:aload_0         
	//   39   67:aconst_null     
	//   40   68:putfield        #212 <Field String youtubeApiKey>
		eventListeners = new CopyOnWriteArrayList();
	//   41   71:aload_0         
	//   42   72:new             #214 <Class CopyOnWriteArrayList>
	//   43   75:dup             
	//   44   76:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   45   79:putfield        #217 <Field CopyOnWriteArrayList eventListeners>
		secureSurfaceView = true;
	//   46   82:aload_0         
	//   47   83:iconst_1        
	//   48   84:putfield        #219 <Field boolean secureSurfaceView>
		fullscreenOrientationBehaviour = FullscreenOrientationBehaviour.defaultBehaviour;
	//   49   87:aload_0         
	//   50   88:getstatic       #222 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.defaultBehaviour>
	//   51   91:putfield        #224 <Field APSMediaPlayer$FullscreenOrientationBehaviour fullscreenOrientationBehaviour>
		savedOrientation = 7;
	//   52   94:aload_0         
	//   53   95:bipush          7
	//   54   97:putfield        #226 <Field int savedOrientation>
		userAgent = null;
	//   55  100:aload_0         
	//   56  101:aconst_null     
	//   57  102:putfield        #228 <Field String userAgent>
		currentlyInFullscreenOverlayActivity = false;
	//   58  105:aload_0         
	//   59  106:iconst_0        
	//   60  107:putfield        #230 <Field boolean currentlyInFullscreenOverlayActivity>
		_mediaUnits = new ArrayList();
	//   61  110:aload_0         
	//   62  111:new             #232 <Class ArrayList>
	//   63  114:dup             
	//   64  115:invokespecial   #233 <Method void ArrayList()>
	//   65  118:putfield        #235 <Field ArrayList _mediaUnits>
		_overlaysDisplayed = new CopyOnWriteArrayList();
	//   66  121:aload_0         
	//   67  122:new             #214 <Class CopyOnWriteArrayList>
	//   68  125:dup             
	//   69  126:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   70  129:putfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
		_eventsToTrigger = new CopyOnWriteArrayList();
	//   71  132:aload_0         
	//   72  133:new             #214 <Class CopyOnWriteArrayList>
	//   73  136:dup             
	//   74  137:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   75  140:putfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
		_eventsToInsert = new CopyOnWriteArrayList();
	//   76  143:aload_0         
	//   77  144:new             #214 <Class CopyOnWriteArrayList>
	//   78  147:dup             
	//   79  148:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   80  151:putfield        #241 <Field CopyOnWriteArrayList _eventsToInsert>
		_preloadedEvents = new CopyOnWriteArrayList();
	//   81  154:aload_0         
	//   82  155:new             #214 <Class CopyOnWriteArrayList>
	//   83  158:dup             
	//   84  159:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   85  162:putfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
		_triggeredEvents = new CopyOnWriteArrayList();
	//   86  165:aload_0         
	//   87  166:new             #214 <Class CopyOnWriteArrayList>
	//   88  169:dup             
	//   89  170:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   90  173:putfield        #245 <Field CopyOnWriteArrayList _triggeredEvents>
		_ignoredEvents = new CopyOnWriteArrayList();
	//   91  176:aload_0         
	//   92  177:new             #214 <Class CopyOnWriteArrayList>
	//   93  180:dup             
	//   94  181:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   95  184:putfield        #247 <Field CopyOnWriteArrayList _ignoredEvents>
		_dynamicTracking = new HashMap();
	//   96  187:aload_0         
	//   97  188:new             #249 <Class HashMap>
	//   98  191:dup             
	//   99  192:invokespecial   #250 <Method void HashMap()>
	//  100  195:putfield        #252 <Field HashMap _dynamicTracking>
		_nextPlaylistIndex = 0;
	//  101  198:aload_0         
	//  102  199:iconst_0        
	//  103  200:putfield        #254 <Field int _nextPlaylistIndex>
		isProcessing = false;
	//  104  203:aload_0         
	//  105  204:iconst_0        
	//  106  205:putfield        #256 <Field boolean isProcessing>
		handlerThread = new HandlerThread("veesoAsyncHandler");
	//  107  208:aload_0         
	//  108  209:new             #258 <Class HandlerThread>
	//  109  212:dup             
	//  110  213:ldc2            #260 <String "veesoAsyncHandler">
	//  111  216:invokespecial   #263 <Method void HandlerThread(String)>
	//  112  219:putfield        #265 <Field HandlerThread handlerThread>
		handlerThread.start();
	//  113  222:aload_0         
	//  114  223:getfield        #265 <Field HandlerThread handlerThread>
	//  115  226:invokevirtual   #268 <Method void HandlerThread.start()>
		AsyncWorker.getInstance().init();
	//  116  229:invokestatic    #274 <Method AsyncWorker AsyncWorker.getInstance()>
	//  117  232:invokevirtual   #277 <Method void AsyncWorker.init()>
	//  118  235:return          
	}

	private void addDynamicTrackingEvents(APSMediaUnit apsmediaunit)
	{
		Iterator iterator = apsmediaunit.trackingURLs.keySet().iterator();
	//    0    0:aload_1         
	//    1    1:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//    2    4:invokevirtual   #349 <Method Set HashMap.keySet()>
	//    3    7:invokeinterface #355 <Method Iterator Set.iterator()>
	//    4   12:astore_3        
label0:
		do
		{
			int i;
			String s;
label1:
			{
				if(!iterator.hasNext())
					break label0;
	//    5   13:aload_3         
	//    6   14:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            256
				s = (String)iterator.next();
	//    8   22:aload_3         
	//    9   23:invokeinterface #365 <Method Object Iterator.next()>
	//   10   28:checkcast       #367 <Class String>
	//   11   31:astore          4
				i = s.hashCode();
	//   12   33:aload           4
	//   13   35:invokevirtual   #371 <Method int String.hashCode()>
	//   14   38:istore_2        
				if(i != 0x9e515c48)
	//*  15   39:iload_2         
	//*  16   40:ldc2            #372 <Int 0x9e515c48>
	//*  17   43:icmpeq          95
				{
					if(i != 0xb042540a)
	//*  18   46:iload_2         
	//*  19   47:ldc2            #373 <Int 0xb042540a>
	//*  20   50:icmpeq          79
					{
						if(i == 0x21644853 && s.equals("firstQuartile"))
	//*  21   53:iload_2         
	//*  22   54:ldc2            #374 <Int 0x21644853>
	//*  23   57:icmpeq          63
	//*  24   60:goto            111
	//*  25   63:aload           4
	//*  26   65:ldc2            #376 <String "firstQuartile">
	//*  27   68:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  28   71:ifeq            111
						{
							i = 0;
	//   29   74:iconst_0        
	//   30   75:istore_2        
							break label1;
	//   31   76:goto            113
						}
					} else
					if(s.equals("thirdQuartile"))
	//*  32   79:aload           4
	//*  33   81:ldc2            #382 <String "thirdQuartile">
	//*  34   84:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  35   87:ifeq            111
					{
						i = 2;
	//   36   90:iconst_2        
	//   37   91:istore_2        
						break label1;
	//   38   92:goto            113
					}
				} else
				if(s.equals("midpoint"))
	//*  39   95:aload           4
	//*  40   97:ldc2            #384 <String "midpoint">
	//*  41  100:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  42  103:ifeq            111
				{
					i = 1;
	//   43  106:iconst_1        
	//   44  107:istore_2        
					break label1;
	//   45  108:goto            113
				}
				i = -1;
	//   46  111:iconst_m1       
	//   47  112:istore_2        
			}
			switch(i)
	//*  48  113:iload_2         
			{
	//*  49  114:tableswitch     0 2: default 140
	//	               0 230
	//	               1 204
	//	               2 178
			default:
				int j = APSVASTXMLNode.durationFromString(s);
	//   50  140:aload           4
	//   51  142:invokestatic    #390 <Method int APSVASTXMLNode.durationFromString(String)>
	//   52  145:istore_2        
				if(j != -1)
	//*  53  146:iload_2         
	//*  54  147:iconst_m1       
	//*  55  148:icmpeq          13
					appendEventToArray(_dynamicTracking, String.valueOf(j), (ArrayList)apsmediaunit.trackingURLs.get(((Object) (s))));
	//   56  151:aload_0         
	//   57  152:aload_0         
	//   58  153:getfield        #252 <Field HashMap _dynamicTracking>
	//   59  156:iload_2         
	//   60  157:invokestatic    #394 <Method String String.valueOf(int)>
	//   61  160:aload_1         
	//   62  161:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   63  164:aload           4
	//   64  166:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   65  169:checkcast       #232 <Class ArrayList>
	//   66  172:invokespecial   #402 <Method void appendEventToArray(HashMap, String, ArrayList)>
				break;

	//*  67  175:goto            13
			case 2: // '\002'
				appendEventToArray(_dynamicTracking, "75%", (ArrayList)apsmediaunit.trackingURLs.get(((Object) (s))));
	//   68  178:aload_0         
	//   69  179:aload_0         
	//   70  180:getfield        #252 <Field HashMap _dynamicTracking>
	//   71  183:ldc2            #404 <String "75%">
	//   72  186:aload_1         
	//   73  187:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   74  190:aload           4
	//   75  192:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   76  195:checkcast       #232 <Class ArrayList>
	//   77  198:invokespecial   #402 <Method void appendEventToArray(HashMap, String, ArrayList)>
				break;

	//*  78  201:goto            13
			case 1: // '\001'
				appendEventToArray(_dynamicTracking, "50%", (ArrayList)apsmediaunit.trackingURLs.get(((Object) (s))));
	//   79  204:aload_0         
	//   80  205:aload_0         
	//   81  206:getfield        #252 <Field HashMap _dynamicTracking>
	//   82  209:ldc2            #406 <String "50%">
	//   83  212:aload_1         
	//   84  213:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   85  216:aload           4
	//   86  218:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   87  221:checkcast       #232 <Class ArrayList>
	//   88  224:invokespecial   #402 <Method void appendEventToArray(HashMap, String, ArrayList)>
				break;

	//*  89  227:goto            13
			case 0: // '\0'
				appendEventToArray(_dynamicTracking, "25%", (ArrayList)apsmediaunit.trackingURLs.get(((Object) (s))));
	//   90  230:aload_0         
	//   91  231:aload_0         
	//   92  232:getfield        #252 <Field HashMap _dynamicTracking>
	//   93  235:ldc2            #408 <String "25%">
	//   94  238:aload_1         
	//   95  239:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   96  242:aload           4
	//   97  244:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   98  247:checkcast       #232 <Class ArrayList>
	//   99  250:invokespecial   #402 <Method void appendEventToArray(HashMap, String, ArrayList)>
				break;
			}
		} while(true);
	//  100  253:goto            13
	//  101  256:return          
	}

	private void appendEventToArray(HashMap hashmap, String s, ArrayList arraylist)
	{
		ArrayList arraylist2 = (ArrayList)hashmap.get(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//    3    5:checkcast       #232 <Class ArrayList>
	//    4    8:astore          5
		ArrayList arraylist1 = arraylist2;
	//    5   10:aload           5
	//    6   12:astore          4
		if(arraylist2 == null)
	//*   7   14:aload           5
	//*   8   16:ifnonnull       28
			arraylist1 = new ArrayList();
	//    9   19:new             #232 <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #233 <Method void ArrayList()>
	//   12   26:astore          4
		arraylist1.addAll(((java.util.Collection) (arraylist)));
	//   13   28:aload           4
	//   14   30:aload_3         
	//   15   31:invokevirtual   #412 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   16   34:pop             
		hashmap.put(((Object) (s)), ((Object) (arraylist1)));
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:aload           4
	//   20   39:invokevirtual   #416 <Method Object HashMap.put(Object, Object)>
	//   21   42:pop             
	//   22   43:return          
	}

	private void durationAvailable(int i)
	{
		Iterator iterator = _eventsToTrigger.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//    2    4:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_3         
	//    5    9:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            49
			Object obj = iterator.next();
	//    7   17:aload_3         
	//    8   18:invokeinterface #365 <Method Object Iterator.next()>
	//    9   23:astore          4
			if(obj instanceof APSMediaEvent)
	//*  10   25:aload           4
	//*  11   27:instanceof      #421 <Class APSMediaEvent>
	//*  12   30:ifeq            8
				((APSMediaEvent)obj).adjustRelativeToDuration(i / 1000);
	//   13   33:aload           4
	//   14   35:checkcast       #421 <Class APSMediaEvent>
	//   15   38:iload_1         
	//   16   39:sipush          1000
	//   17   42:idiv            
	//   18   43:invokevirtual   #424 <Method void APSMediaEvent.adjustRelativeToDuration(int)>
		} while(true);
	//   19   46:goto            8
		for(iterator = _overlaysDisplayed.iterator(); iterator.hasNext(); ((APSMediaOverlay)iterator.next()).adjustRelativeToDuration(i / 1000));
	//   20   49:aload_0         
	//   21   50:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   22   53:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   23   56:astore_3        
	//   24   57:aload_3         
	//   25   58:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   26   63:ifeq            86
	//   27   66:aload_3         
	//   28   67:invokeinterface #365 <Method Object Iterator.next()>
	//   29   72:checkcast       #426 <Class APSMediaOverlay>
	//   30   75:iload_1         
	//   31   76:sipush          1000
	//   32   79:idiv            
	//   33   80:invokevirtual   #427 <Method void APSMediaOverlay.adjustRelativeToDuration(int)>
	//*  34   83:goto            57
		iterator = (new HashMap(((java.util.Map) (_dynamicTracking)))).keySet().iterator();
	//   35   86:new             #249 <Class HashMap>
	//   36   89:dup             
	//   37   90:aload_0         
	//   38   91:getfield        #252 <Field HashMap _dynamicTracking>
	//   39   94:invokespecial   #430 <Method void HashMap(java.util.Map)>
	//   40   97:invokevirtual   #349 <Method Set HashMap.keySet()>
	//   41  100:invokeinterface #355 <Method Iterator Set.iterator()>
	//   42  105:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   43  106:aload_3         
	//   44  107:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   45  112:ifeq            205
			String s = (String)iterator.next();
	//   46  115:aload_3         
	//   47  116:invokeinterface #365 <Method Object Iterator.next()>
	//   48  121:checkcast       #367 <Class String>
	//   49  124:astore          4
			if(s.contains("%"))
	//*  50  126:aload           4
	//*  51  128:ldc2            #432 <String "%">
	//*  52  131:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//*  53  134:ifeq            106
			{
				int j = (int)Math.floor(((double)Integer.parseInt(s.replace("%", "")) * (double)i) / 1000D / 100D);
	//   54  137:aload           4
	//   55  139:ldc2            #432 <String "%">
	//   56  142:ldc2            #438 <String "">
	//   57  145:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//   58  148:invokestatic    #447 <Method int Integer.parseInt(String)>
	//   59  151:i2d             
	//   60  152:iload_1         
	//   61  153:i2d             
	//   62  154:dmul            
	//   63  155:ldc2w           #448 <Double 1000D>
	//   64  158:ddiv            
	//   65  159:ldc2w           #450 <Double 100D>
	//   66  162:ddiv            
	//   67  163:invokestatic    #457 <Method double Math.floor(double)>
	//   68  166:d2i             
	//   69  167:istore_2        
				appendEventToArray(_dynamicTracking, String.valueOf(j), (ArrayList)_dynamicTracking.get(((Object) (s))));
	//   70  168:aload_0         
	//   71  169:aload_0         
	//   72  170:getfield        #252 <Field HashMap _dynamicTracking>
	//   73  173:iload_2         
	//   74  174:invokestatic    #394 <Method String String.valueOf(int)>
	//   75  177:aload_0         
	//   76  178:getfield        #252 <Field HashMap _dynamicTracking>
	//   77  181:aload           4
	//   78  183:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   79  186:checkcast       #232 <Class ArrayList>
	//   80  189:invokespecial   #402 <Method void appendEventToArray(HashMap, String, ArrayList)>
				_dynamicTracking.remove(((Object) (s)));
	//   81  192:aload_0         
	//   82  193:getfield        #252 <Field HashMap _dynamicTracking>
	//   83  196:aload           4
	//   84  198:invokevirtual   #460 <Method Object HashMap.remove(Object)>
	//   85  201:pop             
			}
		} while(true);
	//   86  202:goto            106
		_durationAvailable = true;
	//   87  205:aload_0         
	//   88  206:iconst_1        
	//   89  207:putfield        #208 <Field boolean _durationAvailable>
	//   90  210:return          
	}

	public static APSMediaPlayer getInstance()
	{
		if(instance == null)
	//*   0    0:getstatic       #463 <Field APSMediaPlayer instance>
	//*   1    3:ifnonnull       170
		{
			instance = new APSMediaPlayer();
	//    2    6:new             #2   <Class APSMediaPlayer>
	//    3    9:dup             
	//    4   10:invokespecial   #464 <Method void APSMediaPlayer()>
	//    5   13:putstatic       #463 <Field APSMediaPlayer instance>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerButtonOverlayController, "com.appscend.mp.controllers.overlay", "button");
	//    6   16:getstatic       #463 <Field APSMediaPlayer instance>
	//    7   19:ldc2            #466 <Class APSMediaPlayerButtonOverlayController>
	//    8   22:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//    9   24:ldc2            #468 <String "button">
	//   10   27:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerTextOverlayController, "com.appscend.mp.controllers.overlay", "com.appscend.mp.overlays.text");
	//   11   30:getstatic       #463 <Field APSMediaPlayer instance>
	//   12   33:ldc2            #474 <Class APSMediaPlayerTextOverlayController>
	//   13   36:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   14   38:ldc2            #476 <String "com.appscend.mp.overlays.text">
	//   15   41:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerImageOverlayController, "com.appscend.mp.controllers.overlay", "com.appscend.mp.overlays.image");
	//   16   44:getstatic       #463 <Field APSMediaPlayer instance>
	//   17   47:ldc2            #478 <Class APSMediaPlayerImageOverlayController>
	//   18   50:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   19   52:ldc2            #480 <String "com.appscend.mp.overlays.image">
	//   20   55:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerSkipOverlayController, "com.appscend.mp.controllers.overlay", "com.appscend.mp.overlays.skip");
	//   21   58:getstatic       #463 <Field APSMediaPlayer instance>
	//   22   61:ldc2            #482 <Class APSMediaPlayerSkipOverlayController>
	//   23   64:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   24   66:ldc2            #484 <String "com.appscend.mp.overlays.skip">
	//   25   69:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerHTMLOverlayController, "com.appscend.mp.controllers.overlay", "com.appscend.mp.overlays.html");
	//   26   72:getstatic       #463 <Field APSMediaPlayer instance>
	//   27   75:ldc2            #486 <Class APSMediaPlayerHTMLOverlayController>
	//   28   78:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   29   80:ldc2            #488 <String "com.appscend.mp.overlays.html">
	//   30   83:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerControlsOverlayController, "com.appscend.mp.controllers.overlay", "controls");
	//   31   86:getstatic       #463 <Field APSMediaPlayer instance>
	//   32   89:ldc2            #490 <Class APSMediaPlayerControlsOverlayController>
	//   33   92:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   34   94:ldc2            #492 <String "controls">
	//   35   97:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerMidrollOverlayController, "com.appscend.mp.controllers.overlay", "com.appscend.mp.overlays.midroll");
	//   36  100:getstatic       #463 <Field APSMediaPlayer instance>
	//   37  103:ldc2            #494 <Class APSMediaPlayerMidrollOverlayController>
	//   38  106:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   39  108:ldc2            #496 <String "com.appscend.mp.overlays.midroll">
	//   40  111:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerYoutubeOverlayController, "com.appscend.mp.controllers.overlay", "com.appscend.mp.overlays.youtube");
	//   41  114:getstatic       #463 <Field APSMediaPlayer instance>
	//   42  117:ldc2            #498 <Class APSMediaPlayerYoutubeOverlayController>
	//   43  120:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   44  122:ldc2            #500 <String "com.appscend.mp.overlays.youtube">
	//   45  125:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/overlaycontrollers/APSMediaPlayerVimeoOverlayController, "com.appscend.mp.controllers.overlay", "com.appscend.mp.overlays.vimeo");
	//   46  128:getstatic       #463 <Field APSMediaPlayer instance>
	//   47  131:ldc2            #502 <Class APSMediaPlayerVimeoOverlayController>
	//   48  134:ldc1            #99  <String "com.appscend.mp.controllers.overlay">
	//   49  136:ldc2            #504 <String "com.appscend.mp.overlays.vimeo">
	//   50  139:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/media/renderers/MediaPlayerRenderer, "com.appscend.mp.renderers", MediaPlayerRenderer.rendererIdentifier);
	//   51  142:getstatic       #463 <Field APSMediaPlayer instance>
	//   52  145:ldc2            #506 <Class MediaPlayerRenderer>
	//   53  148:ldc1            #102 <String "com.appscend.mp.renderers">
	//   54  150:getstatic       #509 <Field String MediaPlayerRenderer.rendererIdentifier>
	//   55  153:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
			instance.registerClassInGroup(com/appscend/media/renderers/ExoPlayerRenderer, "com.appscend.mp.renderers", ExoPlayerRenderer.rendererIdentifier);
	//   56  156:getstatic       #463 <Field APSMediaPlayer instance>
	//   57  159:ldc2            #511 <Class ExoPlayerRenderer>
	//   58  162:ldc1            #102 <String "com.appscend.mp.renderers">
	//   59  164:getstatic       #512 <Field String ExoPlayerRenderer.rendererIdentifier>
	//   60  167:invokevirtual   #472 <Method void registerClassInGroup(Class, String, String)>
		}
		return instance;
	//   61  170:getstatic       #463 <Field APSMediaPlayer instance>
	//   62  173:areturn         
	}

	private Object getNextUnit()
	{
		if(_goBack)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field boolean _goBack>
	//*   2    4:ifeq            64
		{
			_goBack = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #210 <Field boolean _goBack>
			int i = _nextPlaylistIndex;
	//    6   12:aload_0         
	//    7   13:getfield        #254 <Field int _nextPlaylistIndex>
	//    8   16:istore_1        
			int j = i - 1;
	//    9   17:iload_1         
	//   10   18:iconst_1        
	//   11   19:isub            
	//   12   20:istore_2        
			if(j > 0)
	//*  13   21:iload_2         
	//*  14   22:ifle            43
			{
				_nextPlaylistIndex = i - 1;
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:iconst_1        
	//   18   28:isub            
	//   19   29:putfield        #254 <Field int _nextPlaylistIndex>
				return _mediaUnits.get(j - 1);
	//   20   32:aload_0         
	//   21   33:getfield        #235 <Field ArrayList _mediaUnits>
	//   22   36:iload_2         
	//   23   37:iconst_1        
	//   24   38:isub            
	//   25   39:invokevirtual   #516 <Method Object ArrayList.get(int)>
	//   26   42:areturn         
			}
			if(_mediaUnits.size() > 0)
	//*  27   43:aload_0         
	//*  28   44:getfield        #235 <Field ArrayList _mediaUnits>
	//*  29   47:invokevirtual   #519 <Method int ArrayList.size()>
	//*  30   50:ifle            62
				return _mediaUnits.get(0);
	//   31   53:aload_0         
	//   32   54:getfield        #235 <Field ArrayList _mediaUnits>
	//   33   57:iconst_0        
	//   34   58:invokevirtual   #516 <Method Object ArrayList.get(int)>
	//   35   61:areturn         
			else
				return ((Object) (null));
	//   36   62:aconst_null     
	//   37   63:areturn         
		}
		if(_nextPlaylistIndex < _mediaUnits.size())
	//*  38   64:aload_0         
	//*  39   65:getfield        #254 <Field int _nextPlaylistIndex>
	//*  40   68:aload_0         
	//*  41   69:getfield        #235 <Field ArrayList _mediaUnits>
	//*  42   72:invokevirtual   #519 <Method int ArrayList.size()>
	//*  43   75:icmpge          145
		{
			APSMediaEvent apsmediaevent = (APSMediaEvent)_mediaUnits.get(_nextPlaylistIndex);
	//   44   78:aload_0         
	//   45   79:getfield        #235 <Field ArrayList _mediaUnits>
	//   46   82:aload_0         
	//   47   83:getfield        #254 <Field int _nextPlaylistIndex>
	//   48   86:invokevirtual   #516 <Method Object ArrayList.get(int)>
	//   49   89:checkcast       #421 <Class APSMediaEvent>
	//   50   92:astore_3        
			if(!isMediaUnit(((Object) (apsmediaevent))))
	//*  51   93:aload_0         
	//*  52   94:aload_3         
	//*  53   95:invokevirtual   #522 <Method boolean isMediaUnit(Object)>
	//*  54   98:ifne            112
			{
				_mediaUnits.remove(((Object) (apsmediaevent)));
	//   55  101:aload_0         
	//   56  102:getfield        #235 <Field ArrayList _mediaUnits>
	//   57  105:aload_3         
	//   58  106:invokevirtual   #524 <Method boolean ArrayList.remove(Object)>
	//   59  109:pop             
				return ((Object) (apsmediaevent));
	//   60  110:aload_3         
	//   61  111:areturn         
			}
			if(!((APSMediaUnit)apsmediaevent).canReplay)
	//*  62  112:aload_3         
	//*  63  113:checkcast       #342 <Class APSMediaUnit>
	//*  64  116:getfield        #527 <Field boolean APSMediaUnit.canReplay>
	//*  65  119:ifne            133
			{
				_mediaUnits.remove(((Object) (apsmediaevent)));
	//   66  122:aload_0         
	//   67  123:getfield        #235 <Field ArrayList _mediaUnits>
	//   68  126:aload_3         
	//   69  127:invokevirtual   #524 <Method boolean ArrayList.remove(Object)>
	//   70  130:pop             
				return ((Object) (apsmediaevent));
	//   71  131:aload_3         
	//   72  132:areturn         
			} else
			{
				_nextPlaylistIndex = _nextPlaylistIndex + 1;
	//   73  133:aload_0         
	//   74  134:aload_0         
	//   75  135:getfield        #254 <Field int _nextPlaylistIndex>
	//   76  138:iconst_1        
	//   77  139:iadd            
	//   78  140:putfield        #254 <Field int _nextPlaylistIndex>
				return ((Object) (apsmediaevent));
	//   79  143:aload_3         
	//   80  144:areturn         
			}
		} else
		{
			return ((Object) (null));
	//   81  145:aconst_null     
	//   82  146:areturn         
		}
	}

	private String getRendererByPriority()
	{
		int j;
		String s;
		Iterator iterator;
		HashMap hashmap = adaptersForGroup("com.appscend.mp.renderers");
	//    0    0:aload_0         
	//    1    1:ldc1            #102 <String "com.appscend.mp.renderers">
	//    2    3:invokevirtual   #539 <Method HashMap adaptersForGroup(String)>
	//    3    6:astore          5
		s = "";
	//    4    8:ldc2            #438 <String "">
	//    5   11:astore          4
		iterator = hashmap.entrySet().iterator();
	//    6   13:aload           5
	//    7   15:invokevirtual   #542 <Method Set HashMap.entrySet()>
	//    8   18:invokeinterface #355 <Method Iterator Set.iterator()>
	//    9   23:astore          6
		j = -1;
	//   10   25:iconst_m1       
	//   11   26:istore_2        
_L2:
		int i;
		Object obj;
		Class class1;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   12   27:aload           6
	//   13   29:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            163
		obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   15   37:aload           6
	//   16   39:invokeinterface #365 <Method Object Iterator.next()>
	//   17   44:checkcast       #544 <Class java.util.Map$Entry>
	//   18   47:astore          5
		class1 = (Class)((java.util.Map.Entry) (obj)).getValue();
	//   19   49:aload           5
	//   20   51:invokeinterface #547 <Method Object java.util.Map$Entry.getValue()>
	//   21   56:checkcast       #549 <Class Class>
	//   22   59:astore          7
		obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   23   61:aload           5
	//   24   63:invokeinterface #552 <Method Object java.util.Map$Entry.getKey()>
	//   25   68:checkcast       #367 <Class String>
	//   26   71:astore          5
		i = 0;
	//   27   73:iconst_0        
	//   28   74:istore_1        
		int k = ((Integer)class1.getDeclaredMethod("getPriorityIndex", ((Class []) (null))).invoke(((Object) (null)), ((Object []) (null)))).intValue();
	//   29   75:aload           7
	//   30   77:ldc2            #554 <String "getPriorityIndex">
	//   31   80:aconst_null     
	//   32   81:invokevirtual   #558 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   33   84:aconst_null     
	//   34   85:aconst_null     
	//   35   86:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   36   89:checkcast       #444 <Class Integer>
	//   37   92:invokevirtual   #567 <Method int Integer.intValue()>
	//   38   95:istore_3        
		i = k;
	//   39   96:iload_3         
	//   40   97:istore_1        
_L3:
		StringBuilder stringbuilder = new StringBuilder();
	//   41   98:new             #569 <Class StringBuilder>
	//   42  101:dup             
	//   43  102:invokespecial   #570 <Method void StringBuilder()>
	//   44  105:astore          7
		stringbuilder.append("priority for ");
	//   45  107:aload           7
	//   46  109:ldc2            #572 <String "priority for ">
	//   47  112:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   48  115:pop             
		stringbuilder.append(((String) (obj)));
	//   49  116:aload           7
	//   50  118:aload           5
	//   51  120:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   52  123:pop             
		stringbuilder.append(": ");
	//   53  124:aload           7
	//   54  126:ldc2            #578 <String ": ">
	//   55  129:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   56  132:pop             
		stringbuilder.append(i);
	//   57  133:aload           7
	//   58  135:iload_1         
	//   59  136:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   60  139:pop             
		log(stringbuilder.toString());
	//   61  140:aload_0         
	//   62  141:aload           7
	//   63  143:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   64  146:invokevirtual   #587 <Method void log(String)>
		if(j < i)
	//*  65  149:iload_2         
	//*  66  150:iload_1         
	//*  67  151:icmpge          27
		{
			s = ((String) (obj));
	//   68  154:aload           5
	//   69  156:astore          4
			j = i;
	//   70  158:iload_1         
	//   71  159:istore_2        
		}
		if(true) goto _L2; else goto _L1
	//   72  160:goto            27
_L1:
		return s;
	//   73  163:aload           4
	//   74  165:areturn         
		Object obj1;
		obj1;
	//   75  166:astore          7
		  goto _L3
	//*  76  168:goto            98
	}

	private void handleSeekBackwardBehavior(int i)
	{
		i /= 1000;
	//    0    0:iload_1         
	//    1    1:sipush          1000
	//    2    4:idiv            
	//    3    5:istore_1        
		CopyOnWriteArrayList copyonwritearraylist = new CopyOnWriteArrayList();
	//    4    6:new             #214 <Class CopyOnWriteArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//    7   13:astore_2        
		if(_ignoredEvents.size() > 0)
	//*   8   14:aload_0         
	//*   9   15:getfield        #247 <Field CopyOnWriteArrayList _ignoredEvents>
	//*  10   18:invokevirtual   #589 <Method int CopyOnWriteArrayList.size()>
	//*  11   21:ifle            71
		{
			Iterator iterator = _ignoredEvents.iterator();
	//   12   24:aload_0         
	//   13   25:getfield        #247 <Field CopyOnWriteArrayList _ignoredEvents>
	//   14   28:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   15   31:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   16   32:aload_3         
	//   17   33:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   18   38:ifeq            71
				APSMediaEvent apsmediaevent = (APSMediaEvent)iterator.next();
	//   19   41:aload_3         
	//   20   42:invokeinterface #365 <Method Object Iterator.next()>
	//   21   47:checkcast       #421 <Class APSMediaEvent>
	//   22   50:astore          4
				if(apsmediaevent.startPoint() >= i)
	//*  23   52:aload           4
	//*  24   54:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  25   57:iload_1         
	//*  26   58:icmplt          32
					copyonwritearraylist.add(((Object) (apsmediaevent)));
	//   27   61:aload_2         
	//   28   62:aload           4
	//   29   64:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//   30   67:pop             
			} while(true);
	//   31   68:goto            32
		}
		if(copyonwritearraylist.size() > 0)
	//*  32   71:aload_2         
	//*  33   72:invokevirtual   #589 <Method int CopyOnWriteArrayList.size()>
	//*  34   75:ifle            96
		{
			_eventsToTrigger.addAll(((java.util.Collection) (copyonwritearraylist)));
	//   35   78:aload_0         
	//   36   79:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//   37   82:aload_2         
	//   38   83:invokevirtual   #596 <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
	//   39   86:pop             
			_ignoredEvents.removeAll(((java.util.Collection) (copyonwritearraylist)));
	//   40   87:aload_0         
	//   41   88:getfield        #247 <Field CopyOnWriteArrayList _ignoredEvents>
	//   42   91:aload_2         
	//   43   92:invokevirtual   #599 <Method boolean CopyOnWriteArrayList.removeAll(java.util.Collection)>
	//   44   95:pop             
		}
	//   45   96:return          
	}

	private void handleSeekBehavior(int i, MPMoviePlaybackState mpmovieplaybackstate)
	{
		static class _cls20
		{

			static final int $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[];
			static final int $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[];
			static final int $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[];
			static final int $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[];
			static final int $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[];

			static 
			{
				$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition = new int[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.values().length];
			//    0    0:invokestatic    #22  <Method com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition[] com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft.ordinal()] = 1;
			//    4    9:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
			//    5   12:getstatic       #28  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft>
			//    6   15:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
			//*  10   23:getstatic       #35  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight>
			//*  11   26:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
			//*  15   34:getstatic       #38  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft>
			//*  16   37:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
			//*  20   45:getstatic       #41  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight>
			//*  21   48:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
			//*  25   56:getstatic       #44  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTop>
			//*  26   59:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
			//*  30   67:getstatic       #47  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom>
			//*  31   70:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #24  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
			//*  35   79:getstatic       #50  <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen>
			//*  36   82:invokevirtual   #32  <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:invokestatic    #55  <Method com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent[] com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.values()>
			//*  40   91:arraylength     
			//*  41   92:newarray        int[]
			//*  42   94:putstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
			//*  43   97:getstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
			//*  44  100:getstatic       #61  <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks>
			//*  45  103:invokevirtual   #62  <Method int com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.ordinal()>
			//*  46  106:iconst_1        
			//*  47  107:iastore         
			//*  48  108:getstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
			//*  49  111:getstatic       #65  <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayFirstBreak>
			//*  50  114:invokevirtual   #62  <Method int com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.ordinal()>
			//*  51  117:iconst_2        
			//*  52  118:iastore         
			//*  53  119:getstatic       #57  <Field int[] $SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
			//*  54  122:getstatic       #68  <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak>
			//*  55  125:invokevirtual   #62  <Method int com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.ordinal()>
			//*  56  128:iconst_3        
			//*  57  129:iastore         
			//*  58  130:invokestatic    #73  <Method APSMediaPlayer$MPMoviePlaybackState[] APSMediaPlayer$MPMoviePlaybackState.values()>
			//*  59  133:arraylength     
			//*  60  134:newarray        int[]
			//*  61  136:putstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
			//*  62  139:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
			//*  63  142:getstatic       #79  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
			//*  64  145:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
			//*  65  148:iconst_1        
			//*  66  149:iastore         
			//*  67  150:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
			//*  68  153:getstatic       #83  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
			//*  69  156:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
			//*  70  159:iconst_2        
			//*  71  160:iastore         
			//*  72  161:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
			//*  73  164:getstatic       #86  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
			//*  74  167:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
			//*  75  170:iconst_3        
			//*  76  171:iastore         
			//*  77  172:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
			//*  78  175:getstatic       #89  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackSeekingBackward>
			//*  79  178:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
			//*  80  181:iconst_4        
			//*  81  182:iastore         
			//*  82  183:getstatic       #75  <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
			//*  83  186:getstatic       #92  <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackSeekingForward>
			//*  84  189:invokevirtual   #80  <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
			//*  85  192:iconst_5        
			//*  86  193:iastore         
			//*  87  194:invokestatic    #97  <Method APSMediaBuilder$APSWebviewDismissedAction[] APSMediaBuilder$APSWebviewDismissedAction.values()>
			//*  88  197:arraylength     
			//*  89  198:newarray        int[]
			//*  90  200:putstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
			//*  91  203:getstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
			//*  92  206:getstatic       #103 <Field APSMediaBuilder$APSWebviewDismissedAction APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
			//*  93  209:invokevirtual   #104 <Method int APSMediaBuilder$APSWebviewDismissedAction.ordinal()>
			//*  94  212:iconst_1        
			//*  95  213:iastore         
			//*  96  214:getstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
			//*  97  217:getstatic       #107 <Field APSMediaBuilder$APSWebviewDismissedAction APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
			//*  98  220:invokevirtual   #104 <Method int APSMediaBuilder$APSWebviewDismissedAction.ordinal()>
			//*  99  223:iconst_2        
			//* 100  224:iastore         
			//* 101  225:getstatic       #99  <Field int[] $SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
			//* 102  228:getstatic       #110 <Field APSMediaBuilder$APSWebviewDismissedAction APSMediaBuilder$APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss>
			//* 103  231:invokevirtual   #104 <Method int APSMediaBuilder$APSWebviewDismissedAction.ordinal()>
			//* 104  234:iconst_3        
			//* 105  235:iastore         
			//* 106  236:invokestatic    #115 <Method APSMediaPlayer$FullscreenOrientationBehaviour[] APSMediaPlayer$FullscreenOrientationBehaviour.values()>
			//* 107  239:arraylength     
			//* 108  240:newarray        int[]
			//* 109  242:putstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
			//* 110  245:getstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
			//* 111  248:getstatic       #121 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.defaultBehaviour>
			//* 112  251:invokevirtual   #122 <Method int APSMediaPlayer$FullscreenOrientationBehaviour.ordinal()>
			//* 113  254:iconst_1        
			//* 114  255:iastore         
			//* 115  256:getstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
			//* 116  259:getstatic       #125 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.sensorLandscapeOrientation>
			//* 117  262:invokevirtual   #122 <Method int APSMediaPlayer$FullscreenOrientationBehaviour.ordinal()>
			//* 118  265:iconst_2        
			//* 119  266:iastore         
			//* 120  267:getstatic       #117 <Field int[] $SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
			//* 121  270:getstatic       #128 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.sensorPortraitOrientation>
			//* 122  273:invokevirtual   #122 <Method int APSMediaPlayer$FullscreenOrientationBehaviour.ordinal()>
			//* 123  276:iconst_3        
			//* 124  277:iastore         
			//* 125  278:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//  126  279:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight.ordinal()] = 2;
				}
			//* 127  280:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//  128  283:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft.ordinal()] = 3;
				}
			//* 129  284:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//  130  287:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight.ordinal()] = 4;
				}
			//* 131  288:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//  132  291:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTop.ordinal()] = 5;
				}
			//* 133  292:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//  134  295:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom.ordinal()] = 6;
				}
			//* 135  296:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//  136  299:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition[com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen.ordinal()] = 7;
				}
			//* 137  300:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//  138  303:astore_0        
				$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent = new int[com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.values().length];
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks.ordinal()] = 1;
				}
			//* 139  304:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//  140  307:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayFirstBreak.ordinal()] = 2;
				}
			//* 141  308:goto            108
				catch(NoSuchFieldError nosuchfielderror8) { }
			//  142  311:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent[com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak.ordinal()] = 3;
				}
			//* 143  312:goto            119
				catch(NoSuchFieldError nosuchfielderror9) { }
			//  144  315:astore_0        
				$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState = new int[MPMoviePlaybackState.values().length];
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[MPMoviePlaybackState.MPMoviePlaybackStopped.ordinal()] = 1;
				}
			//* 145  316:goto            130
				catch(NoSuchFieldError nosuchfielderror10) { }
			//  146  319:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[MPMoviePlaybackState.MPMoviePlaybackPlaying.ordinal()] = 2;
				}
			//* 147  320:goto            150
				catch(NoSuchFieldError nosuchfielderror11) { }
			//  148  323:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[MPMoviePlaybackState.MPMoviePlaybackPaused.ordinal()] = 3;
				}
			//* 149  324:goto            161
				catch(NoSuchFieldError nosuchfielderror12) { }
			//  150  327:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[MPMoviePlaybackState.MPMoviePlaybackSeekingBackward.ordinal()] = 4;
				}
			//* 151  328:goto            172
				catch(NoSuchFieldError nosuchfielderror13) { }
			//  152  331:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState[MPMoviePlaybackState.MPMoviePlaybackSeekingForward.ordinal()] = 5;
				}
			//* 153  332:goto            183
				catch(NoSuchFieldError nosuchfielderror14) { }
			//  154  335:astore_0        
				$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction = new int[APSMediaBuilder.APSWebviewDismissedAction.values().length];
				try
				{
					$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss.ordinal()] = 1;
				}
			//* 155  336:goto            194
				catch(NoSuchFieldError nosuchfielderror15) { }
			//  156  339:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss.ordinal()] = 2;
				}
			//* 157  340:goto            214
				catch(NoSuchFieldError nosuchfielderror16) { }
			//  158  343:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction[APSMediaBuilder.APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss.ordinal()] = 3;
				}
			//* 159  344:goto            225
				catch(NoSuchFieldError nosuchfielderror17) { }
			//  160  347:astore_0        
				$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour = new int[FullscreenOrientationBehaviour.values().length];
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[FullscreenOrientationBehaviour.defaultBehaviour.ordinal()] = 1;
				}
			//* 161  348:goto            236
				catch(NoSuchFieldError nosuchfielderror18) { }
			//  162  351:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[FullscreenOrientationBehaviour.sensorLandscapeOrientation.ordinal()] = 2;
				}
			//* 163  352:goto            256
				catch(NoSuchFieldError nosuchfielderror19) { }
			//  164  355:astore_0        
				try
				{
					$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour[FullscreenOrientationBehaviour.sensorPortraitOrientation.ordinal()] = 3;
				}
			//* 165  356:goto            267
				catch(NoSuchFieldError nosuchfielderror20) { }
			//  166  359:astore_0        
			//* 167  360:return          
			}
		}

		switch(_cls20..SwitchMap.com.appscend.media.APSMediaPlayer.MPMoviePlaybackState[mpmovieplaybackstate.ordinal()])
	//*   0    0:getstatic       #605 <Field int[] APSMediaPlayer$20.$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #608 <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     4 5: default 32
	//	               4 39
	//	               5 33
		default:
			return;
	//    5   32:return          

		case 5: // '\005'
			handleSeekForwardBehavior(i);
	//    6   33:aload_0         
	//    7   34:iload_1         
	//    8   35:invokespecial   #611 <Method void handleSeekForwardBehavior(int)>
			return;
	//    9   38:return          

		case 4: // '\004'
			handleSeekBackwardBehavior(i);
	//   10   39:aload_0         
	//   11   40:iload_1         
	//   12   41:invokespecial   #613 <Method void handleSeekBackwardBehavior(int)>
			return;
	//   13   44:return          
		}
	}

	private void handleSeekForwardBehavior(int i)
	{
		if(_currentUnit.seekHandling != com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks)
	//*   0    0:aload_0         
	//*   1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*   2    4:getfield        #619 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent APSMediaUnit.seekHandling>
	//*   3    7:getstatic       #624 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks>
	//*   4   10:if_acmpeq       561
		{
			int l = i / 1000;
	//    5   13:iload_1         
	//    6   14:sipush          1000
	//    7   17:idiv            
	//    8   18:istore          6
			boolean flag2 = false;
	//    9   20:iconst_0        
	//   10   21:istore          5
			boolean flag1 = false;
	//   11   23:iconst_0        
	//   12   24:istore          4
			Object obj = ((Object) (_eventsToTrigger.iterator()));
	//   13   26:aload_0         
	//   14   27:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//   15   30:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   16   33:astore          7
			int k = -1;
	//   17   35:iconst_m1       
	//   18   36:istore_3        
			i = k;
	//   19   37:iload_3         
	//   20   38:istore_1        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   21   39:aload           7
	//   22   41:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   23   46:ifeq            140
				APSMediaEvent apsmediaevent = (APSMediaEvent)((Iterator) (obj)).next();
	//   24   49:aload           7
	//   25   51:invokeinterface #365 <Method Object Iterator.next()>
	//   26   56:checkcast       #421 <Class APSMediaEvent>
	//   27   59:astore          8
				if(apsmediaevent.startPoint() < l)
	//*  28   61:aload           8
	//*  29   63:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  30   66:iload           6
	//*  31   68:icmpge          39
				{
					int j;
					if(k == -1)
	//*  32   71:iload_3         
	//*  33   72:iconst_m1       
	//*  34   73:icmpne          85
					{
						j = apsmediaevent.startPoint();
	//   35   76:aload           8
	//   36   78:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//   37   81:istore_2        
					} else
	//*  38   82:goto            102
					{
						j = k;
	//   39   85:iload_3         
	//   40   86:istore_2        
						if(apsmediaevent.startPoint() < k)
	//*  41   87:aload           8
	//*  42   89:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  43   92:iload_3         
	//*  44   93:icmpge          102
							j = apsmediaevent.startPoint();
	//   45   96:aload           8
	//   46   98:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//   47  101:istore_2        
					}
					if(i == -1)
	//*  48  102:iload_1         
	//*  49  103:iconst_m1       
	//*  50  104:icmpne          118
					{
						i = apsmediaevent.startPoint();
	//   51  107:aload           8
	//   52  109:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//   53  112:istore_1        
						k = j;
	//   54  113:iload_2         
	//   55  114:istore_3        
					} else
	//*  56  115:goto            39
					{
						k = j;
	//   57  118:iload_2         
	//   58  119:istore_3        
						if(apsmediaevent.startPoint() > i)
	//*  59  120:aload           8
	//*  60  122:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  61  125:iload_1         
	//*  62  126:icmple          39
						{
							i = apsmediaevent.startPoint();
	//   63  129:aload           8
	//   64  131:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//   65  134:istore_1        
							k = j;
	//   66  135:iload_2         
	//   67  136:istore_3        
						}
					}
				}
			} while(true);
	//   68  137:goto            39
			obj = ((Object) (new CopyOnWriteArrayList()));
	//   69  140:new             #214 <Class CopyOnWriteArrayList>
	//   70  143:dup             
	//   71  144:invokespecial   #215 <Method void CopyOnWriteArrayList()>
	//   72  147:astore          7
			switch(_cls20..SwitchMap.com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent[_currentUnit.seekHandling.ordinal()])
	//*  73  149:getstatic       #627 <Field int[] APSMediaPlayer$20.$SwitchMap$com$appscend$media$events$APSMediaUnit$APSHandleSeekEvent>
	//*  74  152:aload_0         
	//*  75  153:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*  76  156:getfield        #619 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent APSMediaUnit.seekHandling>
	//*  77  159:invokevirtual   #628 <Method int com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.ordinal()>
	//*  78  162:iaload          
			{
	//*  79  163:tableswitch     1 3: default 188
	//	               1 561
	//	               2 388
	//	               3 189
			default:
				return;
	//   80  188:return          

			case 3: // '\003'
				log("seek handling: last");
	//   81  189:aload_0         
	//   82  190:ldc2            #630 <String "seek handling: last">
	//   83  193:invokevirtual   #587 <Method void log(String)>
				if(_preloadedEvents.size() > 0 && _eventsToTrigger.size() == 0)
	//*  84  196:aload_0         
	//*  85  197:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//*  86  200:invokevirtual   #589 <Method int CopyOnWriteArrayList.size()>
	//*  87  203:ifle            217
	//*  88  206:aload_0         
	//*  89  207:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//*  90  210:invokevirtual   #589 <Method int CopyOnWriteArrayList.size()>
	//*  91  213:ifne            217
					return;
	//   92  216:return          
				if(_preloadedEvents.size() > 0)
	//*  93  217:aload_0         
	//*  94  218:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//*  95  221:invokevirtual   #589 <Method int CopyOnWriteArrayList.size()>
	//*  96  224:ifle            283
				{
					APSMediaEvent apsmediaevent1;
					for(Iterator iterator = _preloadedEvents.iterator(); iterator.hasNext(); _ignoredEvents.add(((Object) (apsmediaevent1))))
	//*  97  227:aload_0         
	//*  98  228:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//*  99  231:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//* 100  234:astore          8
	//* 101  236:aload           8
	//* 102  238:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//* 103  243:ifeq            276
					{
						apsmediaevent1 = (APSMediaEvent)iterator.next();
	//  104  246:aload           8
	//  105  248:invokeinterface #365 <Method Object Iterator.next()>
	//  106  253:checkcast       #421 <Class APSMediaEvent>
	//  107  256:astore          9
						apsmediaevent1.unload();
	//  108  258:aload           9
	//  109  260:invokevirtual   #633 <Method void APSMediaEvent.unload()>
					}

	//  110  263:aload_0         
	//  111  264:getfield        #247 <Field CopyOnWriteArrayList _ignoredEvents>
	//  112  267:aload           9
	//  113  269:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  114  272:pop             
	//* 115  273:goto            236
					_preloadedEvents.clear();
	//  116  276:aload_0         
	//  117  277:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//  118  280:invokevirtual   #636 <Method void CopyOnWriteArrayList.clear()>
				}
				Iterator iterator1 = _eventsToTrigger.iterator();
	//  119  283:aload_0         
	//  120  284:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  121  287:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//  122  290:astore          8
				boolean flag = flag1;
	//  123  292:iload           4
	//  124  294:istore_2        
				do
				{
					if(!iterator1.hasNext())
						break;
	//  125  295:aload           8
	//  126  297:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//  127  302:ifeq            367
					APSMediaEvent apsmediaevent2 = (APSMediaEvent)iterator1.next();
	//  128  305:aload           8
	//  129  307:invokeinterface #365 <Method Object Iterator.next()>
	//  130  312:checkcast       #421 <Class APSMediaEvent>
	//  131  315:astore          9
					if(apsmediaevent2.startPoint() < l)
	//* 132  317:aload           9
	//* 133  319:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//* 134  322:iload           6
	//* 135  324:icmpge          295
						if(apsmediaevent2.startPoint() != i)
	//* 136  327:aload           9
	//* 137  329:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//* 138  332:iload_1         
	//* 139  333:icmpeq          347
							((CopyOnWriteArrayList) (obj)).add(((Object) (apsmediaevent2)));
	//  140  336:aload           7
	//  141  338:aload           9
	//  142  340:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  143  343:pop             
						else
	//* 144  344:goto            295
						if(!flag)
	//* 145  347:iload_2         
	//* 146  348:ifne            356
							flag = true;
	//  147  351:iconst_1        
	//  148  352:istore_2        
						else
	//* 149  353:goto            295
							((CopyOnWriteArrayList) (obj)).add(((Object) (apsmediaevent2)));
	//  150  356:aload           7
	//  151  358:aload           9
	//  152  360:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  153  363:pop             
				} while(true);
	//  154  364:goto            295
				_ignoredEvents.addAll(((java.util.Collection) (obj)));
	//  155  367:aload_0         
	//  156  368:getfield        #247 <Field CopyOnWriteArrayList _ignoredEvents>
	//  157  371:aload           7
	//  158  373:invokevirtual   #596 <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
	//  159  376:pop             
				_eventsToTrigger.removeAll(((java.util.Collection) (obj)));
	//  160  377:aload_0         
	//  161  378:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  162  381:aload           7
	//  163  383:invokevirtual   #599 <Method boolean CopyOnWriteArrayList.removeAll(java.util.Collection)>
	//  164  386:pop             
				return;
	//  165  387:return          

			case 2: // '\002'
				log("seek handling: first");
	//  166  388:aload_0         
	//  167  389:ldc2            #638 <String "seek handling: first">
	//  168  392:invokevirtual   #587 <Method void log(String)>
				if(_preloadedEvents.size() > 0)
	//* 169  395:aload_0         
	//* 170  396:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//* 171  399:invokevirtual   #589 <Method int CopyOnWriteArrayList.size()>
	//* 172  402:ifle            457
				{
					Iterator iterator2 = _eventsToTrigger.iterator();
	//  173  405:aload_0         
	//  174  406:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  175  409:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//  176  412:astore          8
					do
					{
						if(!iterator2.hasNext())
							break;
	//  177  414:aload           8
	//  178  416:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//  179  421:ifeq            541
						APSMediaEvent apsmediaevent3 = (APSMediaEvent)iterator2.next();
	//  180  424:aload           8
	//  181  426:invokeinterface #365 <Method Object Iterator.next()>
	//  182  431:checkcast       #421 <Class APSMediaEvent>
	//  183  434:astore          9
						if(apsmediaevent3.startPoint() < l)
	//* 184  436:aload           9
	//* 185  438:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//* 186  441:iload           6
	//* 187  443:icmpge          414
							((CopyOnWriteArrayList) (obj)).add(((Object) (apsmediaevent3)));
	//  188  446:aload           7
	//  189  448:aload           9
	//  190  450:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  191  453:pop             
					} while(true);
	//  192  454:goto            414
				} else
				{
					Iterator iterator3 = _eventsToTrigger.iterator();
	//  193  457:aload_0         
	//  194  458:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  195  461:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//  196  464:astore          8
					i = ((int) (flag2));
	//  197  466:iload           5
	//  198  468:istore_1        
					do
					{
						if(!iterator3.hasNext())
							break;
	//  199  469:aload           8
	//  200  471:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//  201  476:ifeq            541
						APSMediaEvent apsmediaevent4 = (APSMediaEvent)iterator3.next();
	//  202  479:aload           8
	//  203  481:invokeinterface #365 <Method Object Iterator.next()>
	//  204  486:checkcast       #421 <Class APSMediaEvent>
	//  205  489:astore          9
						if(apsmediaevent4.startPoint() < l)
	//* 206  491:aload           9
	//* 207  493:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//* 208  496:iload           6
	//* 209  498:icmpge          469
							if(apsmediaevent4.startPoint() != k)
	//* 210  501:aload           9
	//* 211  503:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//* 212  506:iload_3         
	//* 213  507:icmpeq          521
								((CopyOnWriteArrayList) (obj)).add(((Object) (apsmediaevent4)));
	//  214  510:aload           7
	//  215  512:aload           9
	//  216  514:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  217  517:pop             
							else
	//* 218  518:goto            469
							if(i == 0)
	//* 219  521:iload_1         
	//* 220  522:ifne            530
								i = 1;
	//  221  525:iconst_1        
	//  222  526:istore_1        
							else
	//* 223  527:goto            469
								((CopyOnWriteArrayList) (obj)).add(((Object) (apsmediaevent4)));
	//  224  530:aload           7
	//  225  532:aload           9
	//  226  534:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  227  537:pop             
					} while(true);
	//  228  538:goto            469
				}
				_ignoredEvents.addAll(((java.util.Collection) (obj)));
	//  229  541:aload_0         
	//  230  542:getfield        #247 <Field CopyOnWriteArrayList _ignoredEvents>
	//  231  545:aload           7
	//  232  547:invokevirtual   #596 <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
	//  233  550:pop             
				_eventsToTrigger.removeAll(((java.util.Collection) (obj)));
	//  234  551:aload_0         
	//  235  552:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  236  555:aload           7
	//  237  557:invokevirtual   #599 <Method boolean CopyOnWriteArrayList.removeAll(java.util.Collection)>
	//  238  560:pop             
				break;

			case 1: // '\001'
				break;
			}
		}
	//  239  561:return          
	}

	public static boolean isInitialized()
	{
		return instance != null;
	//    0    0:getstatic       #463 <Field APSMediaPlayer instance>
	//    1    3:ifnull          8
	//    2    6:iconst_1        
	//    3    7:ireturn         
	//    4    8:iconst_0        
	//    5    9:ireturn         
	}

	private void positionDynamicEvents()
	{
		APSMediaUnit apsmediaunit = _currentUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore          4
		if(apsmediaunit == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		if(!apsmediaunit._positionedDynamicEvents)
	//*   6   12:aload           4
	//*   7   14:getfield        #642 <Field boolean APSMediaUnit._positionedDynamicEvents>
	//*   8   17:ifne            467
		{
			if(_currentUnit.dynamicEvents().size() == 0)
	//*   9   20:aload_0         
	//*  10   21:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*  11   24:invokevirtual   #646 <Method ArrayList APSMediaUnit.dynamicEvents()>
	//*  12   27:invokevirtual   #519 <Method int ArrayList.size()>
	//*  13   30:ifne            34
				return;
	//   14   33:return          
			int k = duration() - _currentUnit.midcontentAdMinimumInitialOffset * 1000 - _currentUnit.midcontentAdMinimumFinalOffset * 1000;
	//   15   34:aload_0         
	//   16   35:invokevirtual   #649 <Method int duration()>
	//   17   38:aload_0         
	//   18   39:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   19   42:getfield        #652 <Field int APSMediaUnit.midcontentAdMinimumInitialOffset>
	//   20   45:sipush          1000
	//   21   48:imul            
	//   22   49:isub            
	//   23   50:aload_0         
	//   24   51:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   25   54:getfield        #655 <Field int APSMediaUnit.midcontentAdMinimumFinalOffset>
	//   26   57:sipush          1000
	//   27   60:imul            
	//   28   61:isub            
	//   29   62:istore_3        
			if(k <= 0)
	//*  30   63:iload_3         
	//*  31   64:ifgt            83
			{
				log("impossible to position any midcontent events");
	//   32   67:aload_0         
	//   33   68:ldc2            #657 <String "impossible to position any midcontent events">
	//   34   71:invokevirtual   #587 <Method void log(String)>
				_currentUnit._positionedDynamicEvents = true;
	//   35   74:aload_0         
	//   36   75:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   37   78:iconst_1        
	//   38   79:putfield        #642 <Field boolean APSMediaUnit._positionedDynamicEvents>
				return;
	//   39   82:return          
			}
			int i = _currentUnit.dynamicEvents().size();
	//   40   83:aload_0         
	//   41   84:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   42   87:invokevirtual   #646 <Method ArrayList APSMediaUnit.dynamicEvents()>
	//   43   90:invokevirtual   #519 <Method int ArrayList.size()>
	//   44   93:istore_1        
			Object obj = ((Object) (new StringBuilder()));
	//   45   94:new             #569 <Class StringBuilder>
	//   46   97:dup             
	//   47   98:invokespecial   #570 <Method void StringBuilder()>
	//   48  101:astore          4
			((StringBuilder) (obj)).append("MIDROLLS -- we have ");
	//   49  103:aload           4
	//   50  105:ldc2            #659 <String "MIDROLLS -- we have ">
	//   51  108:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
			((StringBuilder) (obj)).append(i);
	//   53  112:aload           4
	//   54  114:iload_1         
	//   55  115:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   56  118:pop             
			((StringBuilder) (obj)).append(" events to position in total ad time: ");
	//   57  119:aload           4
	//   58  121:ldc2            #661 <String " events to position in total ad time: ">
	//   59  124:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   60  127:pop             
			((StringBuilder) (obj)).append(k);
	//   61  128:aload           4
	//   62  130:iload_3         
	//   63  131:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   64  134:pop             
			((StringBuilder) (obj)).append(" for duration: ");
	//   65  135:aload           4
	//   66  137:ldc2            #663 <String " for duration: ">
	//   67  140:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   68  143:pop             
			((StringBuilder) (obj)).append(duration());
	//   69  144:aload           4
	//   70  146:aload_0         
	//   71  147:invokevirtual   #649 <Method int duration()>
	//   72  150:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   73  153:pop             
			((StringBuilder) (obj)).append(" initial offset");
	//   74  154:aload           4
	//   75  156:ldc2            #665 <String " initial offset">
	//   76  159:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   77  162:pop             
			((StringBuilder) (obj)).append(_currentUnit.midcontentAdMinimumInitialOffset);
	//   78  163:aload           4
	//   79  165:aload_0         
	//   80  166:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   81  169:getfield        #652 <Field int APSMediaUnit.midcontentAdMinimumInitialOffset>
	//   82  172:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   83  175:pop             
			((StringBuilder) (obj)).append(" final offset ");
	//   84  176:aload           4
	//   85  178:ldc2            #667 <String " final offset ">
	//   86  181:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   87  184:pop             
			((StringBuilder) (obj)).append(_currentUnit.midcontentAdMinimumFinalOffset);
	//   88  185:aload           4
	//   89  187:aload_0         
	//   90  188:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   91  191:getfield        #655 <Field int APSMediaUnit.midcontentAdMinimumFinalOffset>
	//   92  194:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   93  197:pop             
			log(((StringBuilder) (obj)).toString());
	//   94  198:aload_0         
	//   95  199:aload           4
	//   96  201:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   97  204:invokevirtual   #587 <Method void log(String)>
			int j;
			for(j = k / i; j < _currentUnit.midcontentAdMinimumSpacing * 1000 && i > 1; j = k / i)
	//*  98  207:iload_3         
	//*  99  208:iload_1         
	//* 100  209:idiv            
	//* 101  210:istore_2        
	//* 102  211:iload_2         
	//* 103  212:aload_0         
	//* 104  213:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 105  216:getfield        #670 <Field int APSMediaUnit.midcontentAdMinimumSpacing>
	//* 106  219:sipush          1000
	//* 107  222:imul            
	//* 108  223:icmpge          242
	//* 109  226:iload_1         
	//* 110  227:iconst_1        
	//* 111  228:icmple          242
				i--;
	//  112  231:iload_1         
	//  113  232:iconst_1        
	//  114  233:isub            
	//  115  234:istore_1        

	//  116  235:iload_3         
	//  117  236:iload_1         
	//  118  237:idiv            
	//  119  238:istore_2        
	//* 120  239:goto            211
			if(i == 0)
	//* 121  242:iload_1         
	//* 122  243:ifne            262
			{
				log("impossible to position any midcontent events");
	//  123  246:aload_0         
	//  124  247:ldc2            #657 <String "impossible to position any midcontent events">
	//  125  250:invokevirtual   #587 <Method void log(String)>
				_currentUnit._positionedDynamicEvents = true;
	//  126  253:aload_0         
	//  127  254:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  128  257:iconst_1        
	//  129  258:putfield        #642 <Field boolean APSMediaUnit._positionedDynamicEvents>
				return;
	//  130  261:return          
			}
			k = j / 1000;
	//  131  262:iload_2         
	//  132  263:sipush          1000
	//  133  266:idiv            
	//  134  267:istore_3        
			i++;
	//  135  268:iload_1         
	//  136  269:iconst_1        
	//  137  270:iadd            
	//  138  271:istore_1        
			obj = ((Object) (new StringBuilder()));
	//  139  272:new             #569 <Class StringBuilder>
	//  140  275:dup             
	//  141  276:invokespecial   #570 <Method void StringBuilder()>
	//  142  279:astore          4
			((StringBuilder) (obj)).append("MIDROLLS -- final optimal spacing: ");
	//  143  281:aload           4
	//  144  283:ldc2            #672 <String "MIDROLLS -- final optimal spacing: ">
	//  145  286:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  146  289:pop             
			((StringBuilder) (obj)).append(k);
	//  147  290:aload           4
	//  148  292:iload_3         
	//  149  293:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//  150  296:pop             
			((StringBuilder) (obj)).append(". positioning ");
	//  151  297:aload           4
	//  152  299:ldc2            #674 <String ". positioning ">
	//  153  302:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  154  305:pop             
			((StringBuilder) (obj)).append(i);
	//  155  306:aload           4
	//  156  308:iload_1         
	//  157  309:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//  158  312:pop             
			((StringBuilder) (obj)).append(" events");
	//  159  313:aload           4
	//  160  315:ldc2            #676 <String " events">
	//  161  318:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  162  321:pop             
			log(((StringBuilder) (obj)).toString());
	//  163  322:aload_0         
	//  164  323:aload           4
	//  165  325:invokevirtual   #584 <Method String StringBuilder.toString()>
	//  166  328:invokevirtual   #587 <Method void log(String)>
			j = _currentUnit.midcontentAdMinimumInitialOffset;
	//  167  331:aload_0         
	//  168  332:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  169  335:getfield        #652 <Field int APSMediaUnit.midcontentAdMinimumInitialOffset>
	//  170  338:istore_2        
			obj = ((Object) (_currentUnit.dynamicEvents().iterator()));
	//  171  339:aload_0         
	//  172  340:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  173  343:invokevirtual   #646 <Method ArrayList APSMediaUnit.dynamicEvents()>
	//  174  346:invokevirtual   #677 <Method Iterator ArrayList.iterator()>
	//  175  349:astore          4
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//  176  351:aload           4
	//  177  353:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//  178  358:ifeq            458
				APSMediaEvent apsmediaevent = (APSMediaEvent)((Iterator) (obj)).next();
	//  179  361:aload           4
	//  180  363:invokeinterface #365 <Method Object Iterator.next()>
	//  181  368:checkcast       #421 <Class APSMediaEvent>
	//  182  371:astore          5
				if(i <= 0)
	//* 183  373:iload_1         
	//* 184  374:ifgt            380
					break;
	//  185  377:goto            458
				StringBuilder stringbuilder = new StringBuilder();
	//  186  380:new             #569 <Class StringBuilder>
	//  187  383:dup             
	//  188  384:invokespecial   #570 <Method void StringBuilder()>
	//  189  387:astore          6
				stringbuilder.append("MIDROLLS -- positioning event at: ");
	//  190  389:aload           6
	//  191  391:ldc2            #679 <String "MIDROLLS -- positioning event at: ">
	//  192  394:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  193  397:pop             
				stringbuilder.append(j);
	//  194  398:aload           6
	//  195  400:iload_2         
	//  196  401:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//  197  404:pop             
				log(stringbuilder.toString());
	//  198  405:aload_0         
	//  199  406:aload           6
	//  200  408:invokevirtual   #584 <Method String StringBuilder.toString()>
	//  201  411:invokevirtual   #587 <Method void log(String)>
				apsmediaevent.setStartPoint(String.valueOf(j));
	//  202  414:aload           5
	//  203  416:iload_2         
	//  204  417:invokestatic    #394 <Method String String.valueOf(int)>
	//  205  420:invokevirtual   #682 <Method void APSMediaEvent.setStartPoint(String)>
				apsmediaevent.setEndPoint("-1");
	//  206  423:aload           5
	//  207  425:ldc2            #684 <String "-1">
	//  208  428:invokevirtual   #687 <Method void APSMediaEvent.setEndPoint(String)>
				apsmediaevent.dynamicPosition = false;
	//  209  431:aload           5
	//  210  433:iconst_0        
	//  211  434:putfield        #690 <Field boolean APSMediaEvent.dynamicPosition>
				_eventsToTrigger.add(((Object) (apsmediaevent)));
	//  212  437:aload_0         
	//  213  438:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  214  441:aload           5
	//  215  443:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  216  446:pop             
				j += k;
	//  217  447:iload_2         
	//  218  448:iload_3         
	//  219  449:iadd            
	//  220  450:istore_2        
				i--;
	//  221  451:iload_1         
	//  222  452:iconst_1        
	//  223  453:isub            
	//  224  454:istore_1        
			} while(true);
	//  225  455:goto            351
			_currentUnit._positionedDynamicEvents = true;
	//  226  458:aload_0         
	//  227  459:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  228  462:iconst_1        
	//  229  463:putfield        #642 <Field boolean APSMediaUnit._positionedDynamicEvents>
			return;
	//  230  466:return          
		} else
		{
			return;
	//  231  467:return          
		}
	}

	private void processPreloadedEvents(int i)
	{
		Iterator iterator = _preloadedEvents.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//    2    4:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    9:aload           6
	//    5   11:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            252
			final APSMediaEvent event = (APSMediaEvent)iterator.next();
	//    7   19:aload           6
	//    8   21:invokeinterface #365 <Method Object Iterator.next()>
	//    9   26:checkcast       #421 <Class APSMediaEvent>
	//   10   29:astore          7
			if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStateFailed)
	//*  11   31:aload           7
	//*  12   33:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//*  13   36:getstatic       #700 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStateFailed>
	//*  14   39:if_acmpne       55
				_preloadedEvents.remove(((Object) (event)));
	//   15   42:aload_0         
	//   16   43:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//   17   46:aload           7
	//   18   48:invokevirtual   #701 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   19   51:pop             
			else
	//*  20   52:goto            9
			if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloading)
	//*  21   55:aload           7
	//*  22   57:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//*  23   60:getstatic       #704 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
	//*  24   63:if_acmpne       193
			{
				long l1 = event.preloadPoint + event.timeout;
	//   25   66:aload           7
	//   26   68:getfield        #707 <Field long APSMediaEvent.preloadPoint>
	//   27   71:aload           7
	//   28   73:getfield        #710 <Field long APSMediaEvent.timeout>
	//   29   76:ladd            
	//   30   77:lstore          4
				long l = l1;
	//   31   79:lload           4
	//   32   81:lstore_2        
				if(l1 < event.timeout)
	//*  33   82:lload           4
	//*  34   84:aload           7
	//*  35   86:getfield        #710 <Field long APSMediaEvent.timeout>
	//*  36   89:lcmp            
	//*  37   90:ifge            99
					l = event.timeout;
	//   38   93:aload           7
	//   39   95:getfield        #710 <Field long APSMediaEvent.timeout>
	//   40   98:lstore_2        
				if((long)i >= l)
	//*  41   99:iload_1         
	//*  42  100:i2l             
	//*  43  101:lload_2         
	//*  44  102:lcmp            
	//*  45  103:iflt            9
				{
					_preloadedEvents.remove(((Object) (event)));
	//   46  106:aload_0         
	//   47  107:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//   48  110:aload           7
	//   49  112:invokevirtual   #701 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   50  115:pop             
					StringBuilder stringbuilder = new StringBuilder();
	//   51  116:new             #569 <Class StringBuilder>
	//   52  119:dup             
	//   53  120:invokespecial   #570 <Method void StringBuilder()>
	//   54  123:astore          8
					stringbuilder.append("Removed timed out event. Preload interval: ");
	//   55  125:aload           8
	//   56  127:ldc2            #712 <String "Removed timed out event. Preload interval: ">
	//   57  130:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   58  133:pop             
					stringbuilder.append(event.preloadInterval);
	//   59  134:aload           8
	//   60  136:aload           7
	//   61  138:getfield        #715 <Field long APSMediaEvent.preloadInterval>
	//   62  141:invokevirtual   #718 <Method StringBuilder StringBuilder.append(long)>
	//   63  144:pop             
					stringbuilder.append(" timeout: ");
	//   64  145:aload           8
	//   65  147:ldc2            #720 <String " timeout: ">
	//   66  150:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   67  153:pop             
					stringbuilder.append(event.timeout);
	//   68  154:aload           8
	//   69  156:aload           7
	//   70  158:getfield        #710 <Field long APSMediaEvent.timeout>
	//   71  161:invokevirtual   #718 <Method StringBuilder StringBuilder.append(long)>
	//   72  164:pop             
					stringbuilder.append(" timeoutPint: ");
	//   73  165:aload           8
	//   74  167:ldc2            #722 <String " timeoutPint: ">
	//   75  170:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   76  173:pop             
					stringbuilder.append(l);
	//   77  174:aload           8
	//   78  176:lload_2         
	//   79  177:invokevirtual   #718 <Method StringBuilder StringBuilder.append(long)>
	//   80  180:pop             
					log(stringbuilder.toString());
	//   81  181:aload_0         
	//   82  182:aload           8
	//   83  184:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   84  187:invokevirtual   #587 <Method void log(String)>
				}
			} else
	//*  85  190:goto            9
			if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded && i >= event.startPoint())
	//*  86  193:aload           7
	//*  87  195:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//*  88  198:getstatic       #725 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
	//*  89  201:if_acmpne       9
	//*  90  204:iload_1         
	//*  91  205:aload           7
	//*  92  207:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  93  210:icmplt          9
			{
				handler.post(new Runnable() {

					public void run()
					{
						event.trigger();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field APSMediaEvent val$event>
					//    2    4:invokevirtual   #31  <Method void APSMediaEvent.trigger()>
						APSMediaEvent apsmediaevent = event;
					//    3    7:aload_0         
					//    4    8:getfield        #21  <Field APSMediaEvent val$event>
					//    5   11:astore_1        
						if(apsmediaevent instanceof APSMediaOverlay)
					//*   6   12:aload_1         
					//*   7   13:instanceof      #33  <Class APSMediaOverlay>
					//*   8   16:ifeq            92
						{
							if(((APSMediaOverlay)apsmediaevent).metadata.get("skip_tracking") == null)
					//*   9   19:aload_1         
					//*  10   20:checkcast       #33  <Class APSMediaOverlay>
					//*  11   23:getfield        #37  <Field HashMap APSMediaOverlay.metadata>
					//*  12   26:ldc1            #39  <String "skip_tracking">
					//*  13   28:invokevirtual   #45  <Method Object HashMap.get(Object)>
					//*  14   31:ifnonnull       67
								(new APSUsageTracker()).execute(((Object []) (new String[] {
									"overlays.", activity.getPackageName()
								})));
					//   15   34:new             #47  <Class APSUsageTracker>
					//   16   37:dup             
					//   17   38:invokespecial   #48  <Method void APSUsageTracker()>
					//   18   41:iconst_2        
					//   19   42:anewarray       String[]
					//   20   45:dup             
					//   21   46:iconst_0        
					//   22   47:ldc1            #52  <String "overlays.">
					//   23   49:aastore         
					//   24   50:dup             
					//   25   51:iconst_1        
					//   26   52:aload_0         
					//   27   53:getfield        #19  <Field APSMediaPlayer this$0>
					//   28   56:invokestatic    #56  <Method Activity APSMediaPlayer.access$1600(APSMediaPlayer)>
					//   29   59:invokevirtual   #62  <Method String Activity.getPackageName()>
					//   30   62:aastore         
					//   31   63:invokevirtual   #66  <Method AsyncTask APSUsageTracker.execute(Object[])>
					//   32   66:pop             
							_overlaysDisplayed.add(((Object) ((APSMediaOverlay)event)));
					//   33   67:aload_0         
					//   34   68:getfield        #19  <Field APSMediaPlayer this$0>
					//   35   71:getfield        #70  <Field CopyOnWriteArrayList APSMediaPlayer._overlaysDisplayed>
					//   36   74:aload_0         
					//   37   75:getfield        #21  <Field APSMediaEvent val$event>
					//   38   78:checkcast       #33  <Class APSMediaOverlay>
					//   39   81:invokevirtual   #76  <Method boolean CopyOnWriteArrayList.add(Object)>
					//   40   84:pop             
							updateDisplayedOverlays();
					//   41   85:aload_0         
					//   42   86:getfield        #19  <Field APSMediaPlayer this$0>
					//   43   89:invokevirtual   #79  <Method void APSMediaPlayer.updateDisplayedOverlays()>
						}
					//   44   92:return          
					}

					final APSMediaPlayer this$0;
					final APSMediaEvent val$event;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field APSMediaPlayer this$0>
				event = apsmediaevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field APSMediaEvent val$event>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   94  213:getstatic       #316 <Field Handler handler>
	//   95  216:new             #22  <Class APSMediaPlayer$13>
	//   96  219:dup             
	//   97  220:aload_0         
	//   98  221:aload           7
	//   99  223:invokespecial   #728 <Method void APSMediaPlayer$13(APSMediaPlayer, APSMediaEvent)>
	//  100  226:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//  101  229:pop             
				if(event.endPoint() != -1)
	//* 102  230:aload           7
	//* 103  232:invokevirtual   #737 <Method int APSMediaEvent.endPoint()>
	//* 104  235:iconst_m1       
	//* 105  236:icmpeq          9
					_triggeredEvents.add(((Object) (event)));
	//  106  239:aload_0         
	//  107  240:getfield        #245 <Field CopyOnWriteArrayList _triggeredEvents>
	//  108  243:aload           7
	//  109  245:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//  110  248:pop             
			}
		} while(true);
	//  111  249:goto            9
	//  112  252:return          
	}

	private void processQueue()
	{
		emitEvent(new ArrayList(), "START_PROCESSING_NEW_UNIT", APSMediaTrackingEvents.MediaEventType.START_PROCESSING_NEW_UNIT, new Bundle(), ((APSMediaEvent) (null)));
	//    0    0:aload_0         
	//    1    1:new             #232 <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #233 <Method void ArrayList()>
	//    4    8:ldc2            #741 <String "START_PROCESSING_NEW_UNIT">
	//    5   11:getstatic       #746 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.START_PROCESSING_NEW_UNIT>
	//    6   14:new             #748 <Class Bundle>
	//    7   17:dup             
	//    8   18:invokespecial   #749 <Method void Bundle()>
	//    9   21:aconst_null     
	//   10   22:invokevirtual   #753 <Method void emitEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, Bundle, APSMediaEvent)>
		_cachedPlaybackTime = 0L;
	//   11   25:aload_0         
	//   12   26:lconst_0        
	//   13   27:putfield        #193 <Field long _cachedPlaybackTime>
		final APSMediaEvent event = ((APSMediaEvent) (getNextUnit()));
	//   14   30:aload_0         
	//   15   31:invokespecial   #755 <Method Object getNextUnit()>
	//   16   34:astore_1        
		if(event != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          492
		{
			if(event instanceof APSMediaUnit)
	//*  19   39:aload_1         
	//*  20   40:instanceof      #342 <Class APSMediaUnit>
	//*  21   43:ifeq            423
			{
				event = ((APSMediaEvent) ((APSMediaUnit)event));
	//   22   46:aload_1         
	//   23   47:checkcast       #342 <Class APSMediaUnit>
	//   24   50:astore_1        
				setCurrentRenderer(getRendererByPriority());
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:invokespecial   #757 <Method String getRendererByPriority()>
	//   28   56:invokespecial   #760 <Method void setCurrentRenderer(String)>
				log("playing new unit");
	//   29   59:aload_0         
	//   30   60:ldc2            #762 <String "playing new unit">
	//   31   63:invokevirtual   #587 <Method void log(String)>
				trackUnitUsage(((APSMediaUnit) (event)));
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokespecial   #765 <Method void trackUnitUsage(APSMediaUnit)>
				if(((APSMediaUnit) (event)).url == null && ((APSMediaUnit) (event)).overlays().size() <= 0)
	//*  35   71:aload_1         
	//*  36   72:getfield        #768 <Field String APSMediaUnit.url>
	//*  37   75:ifnonnull       151
	//*  38   78:aload_1         
	//*  39   79:invokevirtual   #771 <Method ArrayList APSMediaUnit.overlays()>
	//*  40   82:invokevirtual   #519 <Method int ArrayList.size()>
	//*  41   85:ifle            91
	//*  42   88:goto            151
				{
					log("no url");
	//   43   91:aload_0         
	//   44   92:ldc2            #773 <String "no url">
	//   45   95:invokevirtual   #587 <Method void log(String)>
					trackforEvent((ArrayList)((APSMediaUnit) (event)).trackingURLs.get("launch"), "empty break start", APSMediaTrackingEvents.MediaEventType.LAUNCH, event);
	//   46   98:aload_0         
	//   47   99:aload_1         
	//   48  100:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   49  103:ldc2            #775 <String "launch">
	//   50  106:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   51  109:checkcast       #232 <Class ArrayList>
	//   52  112:ldc2            #777 <String "empty break start">
	//   53  115:getstatic       #780 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.LAUNCH>
	//   54  118:aload_1         
	//   55  119:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
					trackforEvent((ArrayList)((APSMediaUnit) (event)).trackingURLs.get("finish"), "empty break end", APSMediaTrackingEvents.MediaEventType.FINISH, event);
	//   56  122:aload_0         
	//   57  123:aload_1         
	//   58  124:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   59  127:ldc2            #786 <String "finish">
	//   60  130:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   61  133:checkcast       #232 <Class ArrayList>
	//   62  136:ldc2            #788 <String "empty break end">
	//   63  139:getstatic       #791 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.FINISH>
	//   64  142:aload_1         
	//   65  143:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
					processQueue();
	//   66  146:aload_0         
	//   67  147:invokespecial   #320 <Method void processQueue()>
					return;
	//   68  150:return          
				}
				StringBuilder stringbuilder = new StringBuilder();
	//   69  151:new             #569 <Class StringBuilder>
	//   70  154:dup             
	//   71  155:invokespecial   #570 <Method void StringBuilder()>
	//   72  158:astore_2        
				stringbuilder.append("unit url: ");
	//   73  159:aload_2         
	//   74  160:ldc2            #793 <String "unit url: ">
	//   75  163:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   76  166:pop             
				stringbuilder.append(((APSMediaUnit) (event)).url);
	//   77  167:aload_2         
	//   78  168:aload_1         
	//   79  169:getfield        #768 <Field String APSMediaUnit.url>
	//   80  172:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   81  175:pop             
				log(stringbuilder.toString());
	//   82  176:aload_0         
	//   83  177:aload_2         
	//   84  178:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   85  181:invokevirtual   #587 <Method void log(String)>
				isProcessing = true;
	//   86  184:aload_0         
	//   87  185:iconst_1        
	//   88  186:putfield        #256 <Field boolean isProcessing>
				_currentUnit = ((APSMediaUnit) (event));
	//   89  189:aload_0         
	//   90  190:aload_1         
	//   91  191:putfield        #615 <Field APSMediaUnit _currentUnit>
				processUnit(((APSMediaUnit) (event)));
	//   92  194:aload_0         
	//   93  195:aload_1         
	//   94  196:invokevirtual   #796 <Method void processUnit(APSMediaUnit)>
				_eventsToTrigger.addAll(((java.util.Collection) (((APSMediaUnit) (event)).overlays())));
	//   95  199:aload_0         
	//   96  200:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//   97  203:aload_1         
	//   98  204:invokevirtual   #771 <Method ArrayList APSMediaUnit.overlays()>
	//   99  207:invokevirtual   #596 <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
	//  100  210:pop             
				_eventsToTrigger.addAll(((java.util.Collection) (((APSMediaUnit) (event)).events())));
	//  101  211:aload_0         
	//  102  212:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  103  215:aload_1         
	//  104  216:invokevirtual   #799 <Method ArrayList APSMediaUnit.events()>
	//  105  219:invokevirtual   #596 <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
	//  106  222:pop             
				stringbuilder = new StringBuilder();
	//  107  223:new             #569 <Class StringBuilder>
	//  108  226:dup             
	//  109  227:invokespecial   #570 <Method void StringBuilder()>
	//  110  230:astore_2        
				stringbuilder.append("VeePlay_EVENTS: We have ");
	//  111  231:aload_2         
	//  112  232:ldc2            #801 <String "VeePlay_EVENTS: We have ">
	//  113  235:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  114  238:pop             
				stringbuilder.append(_eventsToTrigger.size());
	//  115  239:aload_2         
	//  116  240:aload_0         
	//  117  241:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  118  244:invokevirtual   #589 <Method int CopyOnWriteArrayList.size()>
	//  119  247:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//  120  250:pop             
				stringbuilder.append(" events scheduled");
	//  121  251:aload_2         
	//  122  252:ldc2            #803 <String " events scheduled">
	//  123  255:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  124  258:pop             
				log(stringbuilder.toString());
	//  125  259:aload_0         
	//  126  260:aload_2         
	//  127  261:invokevirtual   #584 <Method String StringBuilder.toString()>
	//  128  264:invokevirtual   #587 <Method void log(String)>
				for(Iterator iterator = _eventsToTrigger.iterator(); iterator.hasNext();)
	//* 129  267:aload_0         
	//* 130  268:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//* 131  271:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//* 132  274:astore_2        
	//* 133  275:aload_2         
	//* 134  276:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//* 135  281:ifeq            390
				{
					Object obj = iterator.next();
	//  136  284:aload_2         
	//  137  285:invokeinterface #365 <Method Object Iterator.next()>
	//  138  290:astore_3        
					if(obj instanceof APSMediaEvent)
	//* 139  291:aload_3         
	//* 140  292:instanceof      #421 <Class APSMediaEvent>
	//* 141  295:ifeq            347
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//  142  298:new             #569 <Class StringBuilder>
	//  143  301:dup             
	//  144  302:invokespecial   #570 <Method void StringBuilder()>
	//  145  305:astore          4
						stringbuilder1.append("VeePlay_EVENTS: event scheduled at: ");
	//  146  307:aload           4
	//  147  309:ldc2            #805 <String "VeePlay_EVENTS: event scheduled at: ">
	//  148  312:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  149  315:pop             
						obj = ((Object) ((APSMediaEvent)obj));
	//  150  316:aload_3         
	//  151  317:checkcast       #421 <Class APSMediaEvent>
	//  152  320:astore_3        
						stringbuilder1.append(((APSMediaEvent) (obj)).startPoint());
	//  153  321:aload           4
	//  154  323:aload_3         
	//  155  324:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//  156  327:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//  157  330:pop             
						log(stringbuilder1.toString());
	//  158  331:aload_0         
	//  159  332:aload           4
	//  160  334:invokevirtual   #584 <Method String StringBuilder.toString()>
	//  161  337:invokevirtual   #587 <Method void log(String)>
						((APSMediaEvent) (obj)).adjustForAbsoluteDuration();
	//  162  340:aload_3         
	//  163  341:invokevirtual   #808 <Method void APSMediaEvent.adjustForAbsoluteDuration()>
					} else
	//* 164  344:goto            275
					{
						StringBuilder stringbuilder2 = new StringBuilder();
	//  165  347:new             #569 <Class StringBuilder>
	//  166  350:dup             
	//  167  351:invokespecial   #570 <Method void StringBuilder()>
	//  168  354:astore          4
						stringbuilder2.append("VeePlay_EVENTS: overlay/adbreak scheduled at: ");
	//  169  356:aload           4
	//  170  358:ldc2            #810 <String "VeePlay_EVENTS: overlay/adbreak scheduled at: ">
	//  171  361:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  172  364:pop             
						stringbuilder2.append(((APSMediaEvent)obj).startPoint());
	//  173  365:aload           4
	//  174  367:aload_3         
	//  175  368:checkcast       #421 <Class APSMediaEvent>
	//  176  371:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//  177  374:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//  178  377:pop             
						log(stringbuilder2.toString());
	//  179  378:aload_0         
	//  180  379:aload           4
	//  181  381:invokevirtual   #584 <Method String StringBuilder.toString()>
	//  182  384:invokevirtual   #587 <Method void log(String)>
					}
				}

	//* 183  387:goto            275
				if(((APSMediaUnit) (event)).controlsDisplay != com.appscend.media.events.APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayNone)
	//* 184  390:aload_1         
	//* 185  391:getfield        #814 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
	//* 186  394:getstatic       #819 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayNone>
	//* 187  397:if_acmpeq       412
					_eventsToTrigger.add(0, ((Object) (controlsOverlay())));
	//  188  400:aload_0         
	//  189  401:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//  190  404:iconst_0        
	//  191  405:aload_0         
	//  192  406:invokevirtual   #823 <Method APSMediaOverlay controlsOverlay()>
	//  193  409:invokevirtual   #826 <Method void CopyOnWriteArrayList.add(int, Object)>
				addDynamicTrackingEvents(((APSMediaUnit) (event)));
	//  194  412:aload_0         
	//  195  413:aload_1         
	//  196  414:invokespecial   #828 <Method void addDynamicTrackingEvents(APSMediaUnit)>
				processToTriggerEvents(0);
	//  197  417:aload_0         
	//  198  418:iconst_0        
	//  199  419:invokespecial   #291 <Method void processToTriggerEvents(int)>
				return;
	//  200  422:return          
			}
			if(event instanceof APSMediaEvent)
	//* 201  423:aload_1         
	//* 202  424:instanceof      #421 <Class APSMediaEvent>
	//* 203  427:ifeq            487
			{
				event = (APSMediaEvent)event;
	//  204  430:aload_1         
	//  205  431:checkcast       #421 <Class APSMediaEvent>
	//  206  434:astore_1        
				if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStateUnloaded)
	//* 207  435:aload_1         
	//* 208  436:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//* 209  439:getstatic       #831 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
	//* 210  442:if_acmpne       461
				{
					AsyncWorker.getInstance().post(new Runnable() {

						public void run()
						{
							event.preloadPoint = currentPlaybackTime();
						//    0    0:aload_0         
						//    1    1:getfield        #21  <Field APSMediaEvent val$event>
						//    2    4:aload_0         
						//    3    5:getfield        #19  <Field APSMediaPlayer this$0>
						//    4    8:invokevirtual   #29  <Method int APSMediaPlayer.currentPlaybackTime()>
						//    5   11:i2l             
						//    6   12:putfield        #35  <Field long APSMediaEvent.preloadPoint>
							event.registerEventStateListener(((APSMediaEventStateListener) (APSMediaPlayer.this)));
						//    7   15:aload_0         
						//    8   16:getfield        #21  <Field APSMediaEvent val$event>
						//    9   19:aload_0         
						//   10   20:getfield        #19  <Field APSMediaPlayer this$0>
						//   11   23:invokevirtual   #39  <Method void APSMediaEvent.registerEventStateListener(APSMediaEventStateListener)>
							event.registerTimeoutListener(((APSMediaEventTimeoutListener) (APSMediaPlayer.this)));
						//   12   26:aload_0         
						//   13   27:getfield        #21  <Field APSMediaEvent val$event>
						//   14   30:aload_0         
						//   15   31:getfield        #19  <Field APSMediaPlayer this$0>
						//   16   34:invokevirtual   #43  <Method void APSMediaEvent.registerTimeoutListener(APSMediaEventTimeoutListener)>
							event.preload();
						//   17   37:aload_0         
						//   18   38:getfield        #21  <Field APSMediaEvent val$event>
						//   19   41:invokevirtual   #46  <Method void APSMediaEvent.preload()>
						//   20   44:return          
						}

						final APSMediaPlayer this$0;
						final APSMediaEvent val$event;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field APSMediaPlayer this$0>
				event = apsmediaevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field APSMediaEvent val$event>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
	//  211  445:invokestatic    #274 <Method AsyncWorker AsyncWorker.getInstance()>
	//  212  448:new             #46  <Class APSMediaPlayer$6>
	//  213  451:dup             
	//  214  452:aload_0         
	//  215  453:aload_1         
	//  216  454:invokespecial   #832 <Method void APSMediaPlayer$6(APSMediaPlayer, APSMediaEvent)>
	//  217  457:invokevirtual   #835 <Method void AsyncWorker.post(Runnable)>
					return;
	//  218  460:return          
				}
				if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloading)
	//* 219  461:aload_1         
	//* 220  462:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//* 221  465:getstatic       #704 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
	//* 222  468:if_acmpne       482
				{
					event.registerEventStateListener(((APSMediaEventStateListener) (this)));
	//  223  471:aload_1         
	//  224  472:aload_0         
	//  225  473:invokevirtual   #839 <Method void APSMediaEvent.registerEventStateListener(APSMediaEventStateListener)>
					event.registerTimeoutListener(((APSMediaEventTimeoutListener) (this)));
	//  226  476:aload_1         
	//  227  477:aload_0         
	//  228  478:invokevirtual   #843 <Method void APSMediaEvent.registerTimeoutListener(APSMediaEventTimeoutListener)>
					return;
	//  229  481:return          
				} else
				{
					processQueue();
	//  230  482:aload_0         
	//  231  483:invokespecial   #320 <Method void processQueue()>
					return;
	//  232  486:return          
				}
			} else
			{
				processQueue();
	//  233  487:aload_0         
	//  234  488:invokespecial   #320 <Method void processQueue()>
				return;
	//  235  491:return          
			}
		}
		isProcessing = false;
	//  236  492:aload_0         
	//  237  493:iconst_0        
	//  238  494:putfield        #256 <Field boolean isProcessing>
		exitFullscreen();
	//  239  497:aload_0         
	//  240  498:invokevirtual   #846 <Method void exitFullscreen()>
		trackforEvent(new ArrayList(), "playlist_finished", APSMediaTrackingEvents.MediaEventType.PLAYLIST_FINISHED, ((APSMediaEvent) (null)));
	//  241  501:aload_0         
	//  242  502:new             #232 <Class ArrayList>
	//  243  505:dup             
	//  244  506:invokespecial   #233 <Method void ArrayList()>
	//  245  509:ldc2            #848 <String "playlist_finished">
	//  246  512:getstatic       #851 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.PLAYLIST_FINISHED>
	//  247  515:aconst_null     
	//  248  516:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		try
		{
			LocalBroadcastManager.getInstance(((android.content.Context) (activity))).sendBroadcast(new Intent("com.appscend.mp.notifications.finished"));
	//  249  519:aload_0         
	//  250  520:getfield        #312 <Field Activity activity>
	//  251  523:invokestatic    #856 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//  252  526:new             #858 <Class Intent>
	//  253  529:dup             
	//  254  530:ldc1            #77  <String "com.appscend.mp.notifications.finished">
	//  255  532:invokespecial   #859 <Method void Intent(String)>
	//  256  535:invokevirtual   #863 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//  257  538:pop             
			return;
	//  258  539:return          
		}
		catch(Exception exception)
	//* 259  540:astore_1        
		{
			return;
	//  260  541:return          
		}
	}

	private void processToTriggerEvents(final int currentPlaybackTime)
	{
		Iterator iterator = _eventsToTrigger.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//    2    4:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            124
			final APSMediaEvent event = (APSMediaEvent)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #365 <Method Object Iterator.next()>
	//    9   23:checkcast       #421 <Class APSMediaEvent>
	//   10   26:astore_3        
			if((long)currentPlaybackTime >= (long)event.startPoint() - event.preloadInterval && currentPlaybackTime < event.startPoint())
	//*  11   27:iload_1         
	//*  12   28:i2l             
	//*  13   29:aload_3         
	//*  14   30:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  15   33:i2l             
	//*  16   34:aload_3         
	//*  17   35:getfield        #715 <Field long APSMediaEvent.preloadInterval>
	//*  18   38:lsub            
	//*  19   39:lcmp            
	//*  20   40:iflt            88
	//*  21   43:iload_1         
	//*  22   44:aload_3         
	//*  23   45:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  24   48:icmpge          88
			{
				AsyncWorker.getInstance().post(new Runnable() {

					public void run()
					{
						APSMediaEvent apsmediaevent = event;
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field APSMediaEvent val$event>
					//    2    4:astore_1        
						apsmediaevent.preloadPoint = currentPlaybackTime;
					//    3    5:aload_1         
					//    4    6:aload_0         
					//    5    7:getfield        #25  <Field int val$currentPlaybackTime>
					//    6   10:i2l             
					//    7   11:putfield        #36  <Field long APSMediaEvent.preloadPoint>
						apsmediaevent.preload();
					//    8   14:aload_1         
					//    9   15:invokevirtual   #39  <Method void APSMediaEvent.preload()>
					//   10   18:return          
					}

					final APSMediaPlayer this$0;
					final int val$currentPlaybackTime;
					final APSMediaEvent val$event;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field APSMediaPlayer this$0>
				event = apsmediaevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field APSMediaEvent val$event>
				currentPlaybackTime = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$currentPlaybackTime>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   25   51:invokestatic    #274 <Method AsyncWorker AsyncWorker.getInstance()>
	//   26   54:new             #16  <Class APSMediaPlayer$11>
	//   27   57:dup             
	//   28   58:aload_0         
	//   29   59:aload_3         
	//   30   60:iload_1         
	//   31   61:invokespecial   #866 <Method void APSMediaPlayer$11(APSMediaPlayer, APSMediaEvent, int)>
	//   32   64:invokevirtual   #835 <Method void AsyncWorker.post(Runnable)>
				_preloadedEvents.add(((Object) (event)));
	//   33   67:aload_0         
	//   34   68:getfield        #243 <Field CopyOnWriteArrayList _preloadedEvents>
	//   35   71:aload_3         
	//   36   72:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//   37   75:pop             
				_eventsToTrigger.remove(((Object) (event)));
	//   38   76:aload_0         
	//   39   77:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//   40   80:aload_3         
	//   41   81:invokevirtual   #701 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   42   84:pop             
			} else
	//*  43   85:goto            8
			if(currentPlaybackTime >= event.startPoint())
	//*  44   88:iload_1         
	//*  45   89:aload_3         
	//*  46   90:invokevirtual   #592 <Method int APSMediaEvent.startPoint()>
	//*  47   93:icmplt          8
			{
				AsyncWorker.getInstance().post(new Runnable() {

					public void run()
					{
						APSMediaEvent apsmediaevent = event;
					//    0    0:aload_0         
					//    1    1:getfield        #25  <Field APSMediaEvent val$event>
					//    2    4:astore_1        
						apsmediaevent.preloadPoint = currentPlaybackTime;
					//    3    5:aload_1         
					//    4    6:aload_0         
					//    5    7:getfield        #27  <Field int val$currentPlaybackTime>
					//    6   10:i2l             
					//    7   11:putfield        #38  <Field long APSMediaEvent.preloadPoint>
						apsmediaevent.preload();
					//    8   14:aload_1         
					//    9   15:invokevirtual   #41  <Method void APSMediaEvent.preload()>
						if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded)
					//*  10   18:aload_0         
					//*  11   19:getfield        #25  <Field APSMediaEvent val$event>
					//*  12   22:invokevirtual   #45  <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
					//*  13   25:getstatic       #51  <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
					//*  14   28:if_acmpne       73
						{
							APSMediaPlayer.handler.post(new Runnable() {

								public void run()
								{
									event.trigger();
								//    0    0:aload_0         
								//    1    1:getfield        #17  <Field APSMediaPlayer$12 this$1>
								//    2    4:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
								//    3    7:invokevirtual   #29  <Method void APSMediaEvent.trigger()>
									if(event instanceof APSMediaOverlay)
								//*   4   10:aload_0         
								//*   5   11:getfield        #17  <Field APSMediaPlayer$12 this$1>
								//*   6   14:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
								//*   7   17:instanceof      #31  <Class APSMediaOverlay>
								//*   8   20:ifeq            114
									{
										if(((APSMediaOverlay)event).metadata.get("skip_tracking") == null)
								//*   9   23:aload_0         
								//*  10   24:getfield        #17  <Field APSMediaPlayer$12 this$1>
								//*  11   27:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
								//*  12   30:checkcast       #31  <Class APSMediaOverlay>
								//*  13   33:getfield        #35  <Field HashMap APSMediaOverlay.metadata>
								//*  14   36:ldc1            #37  <String "skip_tracking">
								//*  15   38:invokevirtual   #43  <Method Object HashMap.get(Object)>
								//*  16   41:ifnonnull       80
											(new APSUsageTracker()).execute(((Object []) (new String[] {
												"overlays.", activity.getPackageName()
											})));
								//   17   44:new             #45  <Class APSUsageTracker>
								//   18   47:dup             
								//   19   48:invokespecial   #46  <Method void APSUsageTracker()>
								//   20   51:iconst_2        
								//   21   52:anewarray       String[]
								//   22   55:dup             
								//   23   56:iconst_0        
								//   24   57:ldc1            #50  <String "overlays.">
								//   25   59:aastore         
								//   26   60:dup             
								//   27   61:iconst_1        
								//   28   62:aload_0         
								//   29   63:getfield        #17  <Field APSMediaPlayer$12 this$1>
								//   30   66:getfield        #54  <Field APSMediaPlayer APSMediaPlayer$12.this$0>
								//   31   69:invokestatic    #60  <Method Activity APSMediaPlayer.access$1600(APSMediaPlayer)>
								//   32   72:invokevirtual   #66  <Method String Activity.getPackageName()>
								//   33   75:aastore         
								//   34   76:invokevirtual   #70  <Method AsyncTask APSUsageTracker.execute(Object[])>
								//   35   79:pop             
										_overlaysDisplayed.add(((Object) ((APSMediaOverlay)event)));
								//   36   80:aload_0         
								//   37   81:getfield        #17  <Field APSMediaPlayer$12 this$1>
								//   38   84:getfield        #54  <Field APSMediaPlayer APSMediaPlayer$12.this$0>
								//   39   87:getfield        #74  <Field CopyOnWriteArrayList APSMediaPlayer._overlaysDisplayed>
								//   40   90:aload_0         
								//   41   91:getfield        #17  <Field APSMediaPlayer$12 this$1>
								//   42   94:getfield        #24  <Field APSMediaEvent APSMediaPlayer$12.val$event>
								//   43   97:checkcast       #31  <Class APSMediaOverlay>
								//   44  100:invokevirtual   #80  <Method boolean CopyOnWriteArrayList.add(Object)>
								//   45  103:pop             
										updateDisplayedOverlays();
								//   46  104:aload_0         
								//   47  105:getfield        #17  <Field APSMediaPlayer$12 this$1>
								//   48  108:getfield        #54  <Field APSMediaPlayer APSMediaPlayer$12.this$0>
								//   49  111:invokevirtual   #83  <Method void APSMediaPlayer.updateDisplayedOverlays()>
									}
								//   50  114:return          
								}

								final _cls12 this$1;

			
			{
				this$1 = _cls12.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer$12 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
							}
);
					//   15   31:invokestatic    #55  <Method Handler APSMediaPlayer.access$1700()>
					//   16   34:new             #13  <Class APSMediaPlayer$12$1>
					//   17   37:dup             
					//   18   38:aload_0         
					//   19   39:invokespecial   #58  <Method void APSMediaPlayer$12$1(APSMediaPlayer$12)>
					//   20   42:invokevirtual   #64  <Method boolean Handler.post(Runnable)>
					//   21   45:pop             
							if(event.endPoint() != -1)
					//*  22   46:aload_0         
					//*  23   47:getfield        #25  <Field APSMediaEvent val$event>
					//*  24   50:invokevirtual   #68  <Method int APSMediaEvent.endPoint()>
					//*  25   53:iconst_m1       
					//*  26   54:icmpeq          88
							{
								_triggeredEvents.add(((Object) (event)));
					//   27   57:aload_0         
					//   28   58:getfield        #23  <Field APSMediaPlayer this$0>
					//   29   61:getfield        #72  <Field CopyOnWriteArrayList APSMediaPlayer._triggeredEvents>
					//   30   64:aload_0         
					//   31   65:getfield        #25  <Field APSMediaEvent val$event>
					//   32   68:invokevirtual   #78  <Method boolean CopyOnWriteArrayList.add(Object)>
					//   33   71:pop             
								return;
					//   34   72:return          
							}
						} else
						{
							_preloadedEvents.add(((Object) (event)));
					//   35   73:aload_0         
					//   36   74:getfield        #23  <Field APSMediaPlayer this$0>
					//   37   77:getfield        #81  <Field CopyOnWriteArrayList APSMediaPlayer._preloadedEvents>
					//   38   80:aload_0         
					//   39   81:getfield        #25  <Field APSMediaEvent val$event>
					//   40   84:invokevirtual   #78  <Method boolean CopyOnWriteArrayList.add(Object)>
					//   41   87:pop             
						}
					//   42   88:return          
					}

					final APSMediaPlayer this$0;
					final int val$currentPlaybackTime;
					final APSMediaEvent val$event;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field APSMediaPlayer this$0>
				event = apsmediaevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field APSMediaEvent val$event>
				currentPlaybackTime = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field int val$currentPlaybackTime>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   48   96:invokestatic    #274 <Method AsyncWorker AsyncWorker.getInstance()>
	//   49   99:new             #18  <Class APSMediaPlayer$12>
	//   50  102:dup             
	//   51  103:aload_0         
	//   52  104:aload_3         
	//   53  105:iload_1         
	//   54  106:invokespecial   #867 <Method void APSMediaPlayer$12(APSMediaPlayer, APSMediaEvent, int)>
	//   55  109:invokevirtual   #835 <Method void AsyncWorker.post(Runnable)>
				_eventsToTrigger.remove(((Object) (event)));
	//   56  112:aload_0         
	//   57  113:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//   58  116:aload_3         
	//   59  117:invokevirtual   #701 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   60  120:pop             
			}
		} while(true);
	//   61  121:goto            8
	//   62  124:return          
	}

	private void processTriggeredEvents(final int currentPlaybackTime)
	{
		Iterator iterator = _triggeredEvents.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field CopyOnWriteArrayList _triggeredEvents>
	//    2    4:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            151
			final APSMediaOverlay event = (APSMediaOverlay)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #365 <Method Object Iterator.next()>
	//    9   23:checkcast       #426 <Class APSMediaOverlay>
	//   10   26:astore_3        
			if(event.endPoint() >= currentPlaybackTime && event.getState() != com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStateFinished)
	//*  11   27:aload_3         
	//*  12   28:invokevirtual   #868 <Method int APSMediaOverlay.endPoint()>
	//*  13   31:iload_1         
	//*  14   32:icmplt          75
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #869 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaOverlay.getState()>
	//*  17   39:getstatic       #872 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStateFinished>
	//*  18   42:if_acmpne       48
	//*  19   45:goto            75
			{
				if(!isSeeking)
	//*  20   48:aload_0         
	//*  21   49:getfield        #189 <Field boolean isSeeking>
	//*  22   52:ifne            8
					handler.post(new Runnable() {

						public void run()
						{
							try
							{
								((Object) (event.controller)).getClass().getMethod("update", new Class[] {
									Integer.TYPE, Integer.TYPE
								}).invoke(((Object) (event.controller)), new Object[] {
									Integer.valueOf(duration()), Integer.valueOf(currentPlaybackTime * 1000)
								});
						//    0    0:aload_0         
						//    1    1:getfield        #23  <Field APSMediaOverlay val$event>
						//    2    4:getfield        #38  <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
						//    3    7:invokevirtual   #42  <Method Class Object.getClass()>
						//    4   10:ldc1            #44  <String "update">
						//    5   12:iconst_2        
						//    6   13:anewarray       Class[]
						//    7   16:dup             
						//    8   17:iconst_0        
						//    9   18:getstatic       #52  <Field Class Integer.TYPE>
						//   10   21:aastore         
						//   11   22:dup             
						//   12   23:iconst_1        
						//   13   24:getstatic       #52  <Field Class Integer.TYPE>
						//   14   27:aastore         
						//   15   28:invokevirtual   #56  <Method Method Class.getMethod(String, Class[])>
						//   16   31:aload_0         
						//   17   32:getfield        #23  <Field APSMediaOverlay val$event>
						//   18   35:getfield        #38  <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
						//   19   38:iconst_2        
						//   20   39:anewarray       Object[]
						//   21   42:dup             
						//   22   43:iconst_0        
						//   23   44:aload_0         
						//   24   45:getfield        #21  <Field APSMediaPlayer this$0>
						//   25   48:invokevirtual   #60  <Method int APSMediaPlayer.duration()>
						//   26   51:invokestatic    #64  <Method Integer Integer.valueOf(int)>
						//   27   54:aastore         
						//   28   55:dup             
						//   29   56:iconst_1        
						//   30   57:aload_0         
						//   31   58:getfield        #25  <Field int val$currentPlaybackTime>
						//   32   61:sipush          1000
						//   33   64:imul            
						//   34   65:invokestatic    #64  <Method Integer Integer.valueOf(int)>
						//   35   68:aastore         
						//   36   69:invokevirtual   #70  <Method Object Method.invoke(Object, Object[])>
						//   37   72:pop             
								return;
						//   38   73:return          
							}
							catch(Exception exception)
						//*  39   74:astore_1        
							{
								return;
						//   40   75:return          
							}
						}

						final APSMediaPlayer this$0;
						final int val$currentPlaybackTime;
						final APSMediaOverlay val$event;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field APSMediaPlayer this$0>
				event = apsmediaoverlay;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field APSMediaOverlay val$event>
				currentPlaybackTime = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$currentPlaybackTime>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   23   55:getstatic       #316 <Field Handler handler>
	//   24   58:new             #24  <Class APSMediaPlayer$14>
	//   25   61:dup             
	//   26   62:aload_0         
	//   27   63:aload_3         
	//   28   64:iload_1         
	//   29   65:invokespecial   #875 <Method void APSMediaPlayer$14(APSMediaPlayer, APSMediaOverlay, int)>
	//   30   68:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//   31   71:pop             
			} else
	//*  32   72:goto            8
			{
				event.onUnload();
	//   33   75:aload_3         
	//   34   76:invokevirtual   #878 <Method void APSMediaOverlay.onUnload()>
				_triggeredEvents.remove(((Object) (event)));
	//   35   79:aload_0         
	//   36   80:getfield        #245 <Field CopyOnWriteArrayList _triggeredEvents>
	//   37   83:aload_3         
	//   38   84:invokevirtual   #701 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   39   87:pop             
				if(event.repeatAfter != -1F)
	//*  40   88:aload_3         
	//*  41   89:getfield        #882 <Field float APSMediaOverlay.repeatAfter>
	//*  42   92:ldc2            #883 <Float -1F>
	//*  43   95:fcmpl           
	//*  44   96:ifeq            124
				{
					APSMediaOverlay apsmediaoverlay = event.cloneOverlay();
	//   45   99:aload_3         
	//   46  100:invokevirtual   #886 <Method APSMediaOverlay APSMediaOverlay.cloneOverlay()>
	//   47  103:astore          4
					apsmediaoverlay.incrementStartAndEndPointsWithInterval(event.repeatAfter);
	//   48  105:aload           4
	//   49  107:aload_3         
	//   50  108:getfield        #882 <Field float APSMediaOverlay.repeatAfter>
	//   51  111:invokevirtual   #890 <Method void APSMediaOverlay.incrementStartAndEndPointsWithInterval(float)>
					_eventsToTrigger.add(((Object) (apsmediaoverlay)));
	//   52  114:aload_0         
	//   53  115:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//   54  118:aload           4
	//   55  120:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//   56  123:pop             
				}
				if(_overlaysDisplayed.contains(((Object) (event))))
	//*  57  124:aload_0         
	//*  58  125:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//*  59  128:aload_3         
	//*  60  129:invokevirtual   #892 <Method boolean CopyOnWriteArrayList.contains(Object)>
	//*  61  132:ifeq            8
				{
					_overlaysDisplayed.remove(((Object) (event)));
	//   62  135:aload_0         
	//   63  136:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   64  139:aload_3         
	//   65  140:invokevirtual   #701 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   66  143:pop             
					updateDisplayedOverlays();
	//   67  144:aload_0         
	//   68  145:invokevirtual   #895 <Method void updateDisplayedOverlays()>
				}
			}
		} while(true);
	//   69  148:goto            8
	//   70  151:return          
	}

	private void reactivateOverlays()
	{
		Iterator iterator = _overlaysDisplayed.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//    2    4:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_1         
	//    5    9:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            58
			APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #365 <Method Object Iterator.next()>
	//    9   23:checkcast       #426 <Class APSMediaOverlay>
	//   10   26:astore_2        
			if(apsmediaoverlay.type.equals("media-route-button"))
	//*  11   27:aload_2         
	//*  12   28:getfield        #899 <Field String APSMediaOverlay.type>
	//*  13   31:ldc2            #901 <String "media-route-button">
	//*  14   34:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  15   37:ifeq            8
				apsmediaoverlay.controller.refresh(((android.content.Context) (activity)), ((ViewGroup) (_overlayContainer)));
	//   16   40:aload_2         
	//   17   41:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   18   44:aload_0         
	//   19   45:getfield        #312 <Field Activity activity>
	//   20   48:aload_0         
	//   21   49:getfield        #329 <Field RelativeLayout _overlayContainer>
	//   22   52:invokevirtual   #911 <Method void APSMediaPlayerOverlayController.refresh(android.content.Context, ViewGroup)>
		} while(true);
	//   23   55:goto            8
		resetDisplayedOverlays();
	//   24   58:aload_0         
	//   25   59:invokevirtual   #914 <Method void resetDisplayedOverlays()>
		updateDisplayedOverlays();
	//   26   62:aload_0         
	//   27   63:invokevirtual   #895 <Method void updateDisplayedOverlays()>
	//   28   66:return          
	}

	private void setCurrentRenderer(String s)
	{
		Object obj = ((Object) (_renderer));
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          48
		{
			if(((IVeeplayRenderer) (obj)).type().equals(((Object) (s))))
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #920 <Method String IVeeplayRenderer.type()>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*   9   19:ifeq            23
				return;
	//   10   22:return          
			_rendererContainer.removeView(_renderer.getView());
	//   11   23:aload_0         
	//   12   24:getfield        #922 <Field RelativeLayout _rendererContainer>
	//   13   27:aload_0         
	//   14   28:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   15   31:invokeinterface #926 <Method View IVeeplayRenderer.getView()>
	//   16   36:invokevirtual   #932 <Method void RelativeLayout.removeView(View)>
			_renderer.release();
	//   17   39:aload_0         
	//   18   40:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   19   43:invokeinterface #935 <Method void IVeeplayRenderer.release()>
		}
		obj = ((Object) (new StringBuilder()));
	//   20   48:new             #569 <Class StringBuilder>
	//   21   51:dup             
	//   22   52:invokespecial   #570 <Method void StringBuilder()>
	//   23   55:astore_2        
		((StringBuilder) (obj)).append("Initializing new renderer of type - ");
	//   24   56:aload_2         
	//   25   57:ldc2            #937 <String "Initializing new renderer of type - ">
	//   26   60:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   27   63:pop             
		((StringBuilder) (obj)).append(s);
	//   28   64:aload_2         
	//   29   65:aload_1         
	//   30   66:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   31   69:pop             
		log(((StringBuilder) (obj)).toString());
	//   32   70:aload_0         
	//   33   71:aload_2         
	//   34   72:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   35   75:invokevirtual   #587 <Method void log(String)>
		_renderer = (IVeeplayRenderer)adapterForTypeInGroup(s, "com.appscend.mp.renderers");
	//   36   78:aload_0         
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:ldc1            #102 <String "com.appscend.mp.renderers">
	//   40   83:invokevirtual   #941 <Method Object adapterForTypeInGroup(String, String)>
	//   41   86:checkcast       #918 <Class IVeeplayRenderer>
	//   42   89:putfield        #916 <Field IVeeplayRenderer _renderer>
		_renderer.init(activity);
	//   43   92:aload_0         
	//   44   93:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   45   96:aload_0         
	//   46   97:getfield        #312 <Field Activity activity>
	//   47  100:invokeinterface #944 <Method void IVeeplayRenderer.init(Activity)>
		if(_renderer.getView() != null)
	//*  48  105:aload_0         
	//*  49  106:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*  50  109:invokeinterface #926 <Method View IVeeplayRenderer.getView()>
	//*  51  114:ifnull          133
			_rendererContainer.addView(_renderer.getView());
	//   52  117:aload_0         
	//   53  118:getfield        #922 <Field RelativeLayout _rendererContainer>
	//   54  121:aload_0         
	//   55  122:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   56  125:invokeinterface #926 <Method View IVeeplayRenderer.getView()>
	//   57  130:invokevirtual   #947 <Method void RelativeLayout.addView(View)>
	//   58  133:return          
	}

	private void trackUnitUsage(APSMediaUnit apsmediaunit)
	{
		String s1 = (String)apsmediaunit.metadata.get("aps_meta_type");
	//    0    0:aload_1         
	//    1    1:getfield        #950 <Field HashMap APSMediaUnit.metadata>
	//    2    4:ldc2            #952 <String "aps_meta_type">
	//    3    7:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #367 <Class String>
	//    5   13:astore_3        
		String s = s1;
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(s1 == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       24
			s = "content_units.";
	//   10   20:ldc2            #954 <String "content_units.">
	//   11   23:astore_2        
		if(apsmediaunit.metadata.get("skip_tracking") == null && activity != null)
	//*  12   24:aload_1         
	//*  13   25:getfield        #950 <Field HashMap APSMediaUnit.metadata>
	//*  14   28:ldc2            #956 <String "skip_tracking">
	//*  15   31:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//*  16   34:ifnonnull       73
	//*  17   37:aload_0         
	//*  18   38:getfield        #312 <Field Activity activity>
	//*  19   41:ifnull          73
			(new APSUsageTracker()).execute(((Object []) (new String[] {
				s, activity.getPackageName()
			})));
	//   20   44:new             #958 <Class APSUsageTracker>
	//   21   47:dup             
	//   22   48:invokespecial   #959 <Method void APSUsageTracker()>
	//   23   51:iconst_2        
	//   24   52:anewarray       String[]
	//   25   55:dup             
	//   26   56:iconst_0        
	//   27   57:aload_2         
	//   28   58:aastore         
	//   29   59:dup             
	//   30   60:iconst_1        
	//   31   61:aload_0         
	//   32   62:getfield        #312 <Field Activity activity>
	//   33   65:invokevirtual   #964 <Method String Activity.getPackageName()>
	//   34   68:aastore         
	//   35   69:invokevirtual   #968 <Method AsyncTask APSUsageTracker.execute(Object[])>
	//   36   72:pop             
	//   37   73:return          
	}

	public void addOverlays(ArrayList arraylist)
	{
		if(_durationAvailable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field boolean _durationAvailable>
	//*   2    4:ifeq            40
		{
			for(Iterator iterator = arraylist.iterator(); iterator.hasNext(); ((APSMediaOverlay)iterator.next()).adjustRelativeToDuration(duration()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #677 <Method Iterator ArrayList.iterator()>
	//    5   11:astore_2        
	//    6   12:aload_2         
	//    7   13:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            40
	//    9   21:aload_2         
	//   10   22:invokeinterface #365 <Method Object Iterator.next()>
	//   11   27:checkcast       #426 <Class APSMediaOverlay>
	//   12   30:aload_0         
	//   13   31:invokevirtual   #649 <Method int duration()>
	//   14   34:invokevirtual   #427 <Method void APSMediaOverlay.adjustRelativeToDuration(int)>
		}
	//*  15   37:goto            12
		_eventsToInsert.addAll(((java.util.Collection) (arraylist)));
	//   16   40:aload_0         
	//   17   41:getfield        #241 <Field CopyOnWriteArrayList _eventsToInsert>
	//   18   44:aload_1         
	//   19   45:invokevirtual   #596 <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
	//   20   48:pop             
	//   21   49:return          
	}

	public void addTrackingEventListener(APSMediaPlayerTrackingEventListener apsmediaplayertrackingeventlistener)
	{
		if(apsmediaplayertrackingeventlistener != null && !eventListeners.contains(((Object) (apsmediaplayertrackingeventlistener))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
	//*   2    4:aload_0         
	//*   3    5:getfield        #217 <Field CopyOnWriteArrayList eventListeners>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #892 <Method boolean CopyOnWriteArrayList.contains(Object)>
	//*   6   12:ifne            24
			eventListeners.add(((Object) (apsmediaplayertrackingeventlistener)));
	//    7   15:aload_0         
	//    8   16:getfield        #217 <Field CopyOnWriteArrayList eventListeners>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #595 <Method boolean CopyOnWriteArrayList.add(Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void back()
	{
		_goBack = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #210 <Field boolean _goBack>
		unitFinished(MPMovieFinishReason.MPMovieFinishReasonNone);
	//    3    5:aload_0         
	//    4    6:getstatic       #978 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonNone>
	//    5    9:invokevirtual   #982 <Method void unitFinished(APSMediaPlayer$MPMovieFinishReason)>
	//    6   12:return          
	}

	public void computeSurfaceSize()
	{
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:astore_1        
		if(iveeplayrenderer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			iveeplayrenderer.playingSurfaceSizeChanged();
	//    5    9:aload_1         
	//    6   10:invokeinterface #986 <Method void IVeeplayRenderer.playingSurfaceSizeChanged()>
	//    7   15:return          
	}

	public APSMediaOverlay controlsOverlay()
	{
		APSMediaOverlay apsmediaoverlay = new APSMediaOverlay();
	//    0    0:new             #426 <Class APSMediaOverlay>
	//    1    3:dup             
	//    2    4:invokespecial   #987 <Method void APSMediaOverlay()>
	//    3    7:astore_2        
		apsmediaoverlay.type = "controls";
	//    4    8:aload_2         
	//    5    9:ldc2            #492 <String "controls">
	//    6   12:putfield        #899 <Field String APSMediaOverlay.type>
		apsmediaoverlay.parameters = _currentUnit.controlsParameters;
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   10   20:getfield        #990 <Field HashMap APSMediaUnit.controlsParameters>
	//   11   23:putfield        #993 <Field HashMap APSMediaOverlay.parameters>
		apsmediaoverlay.setStartPoint("0");
	//   12   26:aload_2         
	//   13   27:ldc2            #995 <String "0">
	//   14   30:invokevirtual   #996 <Method void APSMediaOverlay.setStartPoint(String)>
		apsmediaoverlay.setEndPoint(String.valueOf(0x7fffffff));
	//   15   33:aload_2         
	//   16   34:ldc2            #997 <Int 0x7fffffff>
	//   17   37:invokestatic    #394 <Method String String.valueOf(int)>
	//   18   40:invokevirtual   #998 <Method void APSMediaOverlay.setEndPoint(String)>
		apsmediaoverlay.width = "100%";
	//   19   43:aload_2         
	//   20   44:ldc2            #1000 <String "100%">
	//   21   47:putfield        #1003 <Field String APSMediaOverlay.width>
		apsmediaoverlay.height = "30";
	//   22   50:aload_2         
	//   23   51:ldc2            #1005 <String "30">
	//   24   54:putfield        #1008 <Field String APSMediaOverlay.height>
		com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition apsmediaoverlayposition;
		if(_currentUnit.controlsDisplay == com.appscend.media.events.APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayBottom)
	//*  25   57:aload_0         
	//*  26   58:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*  27   61:getfield        #814 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
	//*  28   64:getstatic       #1011 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayBottom>
	//*  29   67:if_acmpne       77
			apsmediaoverlayposition = com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom;
	//   30   70:getstatic       #1017 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom>
	//   31   73:astore_1        
		else
	//*  32   74:goto            81
			apsmediaoverlayposition = com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTop;
	//   33   77:getstatic       #1020 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTop>
	//   34   80:astore_1        
		apsmediaoverlay.position = apsmediaoverlayposition;
	//   35   81:aload_2         
	//   36   82:aload_1         
	//   37   83:putfield        #1023 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
		apsmediaoverlay.zIndex = 0;
	//   38   86:aload_2         
	//   39   87:iconst_0        
	//   40   88:putfield        #1026 <Field int APSMediaOverlay.zIndex>
		apsmediaoverlay.metadata.put("skip_tracking", "true");
	//   41   91:aload_2         
	//   42   92:getfield        #1027 <Field HashMap APSMediaOverlay.metadata>
	//   43   95:ldc2            #956 <String "skip_tracking">
	//   44   98:ldc2            #1029 <String "true">
	//   45  101:invokevirtual   #416 <Method Object HashMap.put(Object, Object)>
	//   46  104:pop             
		return apsmediaoverlay;
	//   47  105:aload_2         
	//   48  106:areturn         
	}

	public void createTimer()
	{
		Object obj = ((Object) (timerTask));
	//    0    0:aload_0         
	//    1    1:getfield        #1032 <Field TimerTask timerTask>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			((TimerTask) (obj)).cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1037 <Method boolean TimerTask.cancel()>
	//    7   13:pop             
		obj = ((Object) (new Timer()));
	//    8   14:new             #1039 <Class Timer>
	//    9   17:dup             
	//   10   18:invokespecial   #1040 <Method void Timer()>
	//   11   21:astore_1        
		timerTask = ((TimerTask) (new TimerTask() {

			public void run()
			{
				if(isSeeking)
			//*   0    0:aload_0         
			//*   1    1:getfield        #15  <Field APSMediaPlayer this$0>
			//*   2    4:invokestatic    #25  <Method boolean APSMediaPlayer.access$600(APSMediaPlayer)>
			//*   3    7:ifeq            11
					return;
			//    4   10:return          
				int j = duration();
			//    5   11:aload_0         
			//    6   12:getfield        #15  <Field APSMediaPlayer this$0>
			//    7   15:invokevirtual   #29  <Method int APSMediaPlayer.duration()>
			//    8   18:istore_2        
				if(j > 0 && !_durationAvailable)
			//*   9   19:iload_2         
			//*  10   20:ifle            41
			//*  11   23:aload_0         
			//*  12   24:getfield        #15  <Field APSMediaPlayer this$0>
			//*  13   27:invokestatic    #32  <Method boolean APSMediaPlayer.access$700(APSMediaPlayer)>
			//*  14   30:ifne            41
					durationAvailable(j);
			//   15   33:aload_0         
			//   16   34:getfield        #15  <Field APSMediaPlayer this$0>
			//   17   37:iload_2         
			//   18   38:invokestatic    #36  <Method void APSMediaPlayer.access$800(APSMediaPlayer, int)>
				if(_eventsToInsert.size() > 0)
			//*  19   41:aload_0         
			//*  20   42:getfield        #15  <Field APSMediaPlayer this$0>
			//*  21   45:getfield        #40  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToInsert>
			//*  22   48:invokevirtual   #45  <Method int CopyOnWriteArrayList.size()>
			//*  23   51:ifle            82
				{
					_eventsToTrigger.addAll(((java.util.Collection) (_eventsToInsert)));
			//   24   54:aload_0         
			//   25   55:getfield        #15  <Field APSMediaPlayer this$0>
			//   26   58:getfield        #48  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToTrigger>
			//   27   61:aload_0         
			//   28   62:getfield        #15  <Field APSMediaPlayer this$0>
			//   29   65:getfield        #40  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToInsert>
			//   30   68:invokevirtual   #52  <Method boolean CopyOnWriteArrayList.addAll(java.util.Collection)>
			//   31   71:pop             
					_eventsToInsert.clear();
			//   32   72:aload_0         
			//   33   73:getfield        #15  <Field APSMediaPlayer this$0>
			//   34   76:getfield        #40  <Field CopyOnWriteArrayList APSMediaPlayer._eventsToInsert>
			//   35   79:invokevirtual   #55  <Method void CopyOnWriteArrayList.clear()>
				}
				int i = currentPlaybackTime();
			//   36   82:aload_0         
			//   37   83:getfield        #15  <Field APSMediaPlayer this$0>
			//   38   86:invokevirtual   #58  <Method int APSMediaPlayer.currentPlaybackTime()>
			//   39   89:istore_1        
				_cachedPlaybackTime = (long)i;
			//   40   90:aload_0         
			//   41   91:getfield        #15  <Field APSMediaPlayer this$0>
			//   42   94:iload_1         
			//   43   95:i2l             
			//   44   96:invokestatic    #62  <Method long APSMediaPlayer.access$902(APSMediaPlayer, long)>
			//   45   99:pop2            
				if(i > 0)
			//*  46  100:iload_1         
			//*  47  101:ifle            113
					i /= 1000;
			//   48  104:iload_1         
			//   49  105:sipush          1000
			//   50  108:idiv            
			//   51  109:istore_1        
				else
			//*  52  110:goto            115
					i = 0;
			//   53  113:iconst_0        
			//   54  114:istore_1        
				processToTriggerEvents(i);
			//   55  115:aload_0         
			//   56  116:getfield        #15  <Field APSMediaPlayer this$0>
			//   57  119:iload_1         
			//   58  120:invokestatic    #65  <Method void APSMediaPlayer.access$1000(APSMediaPlayer, int)>
				processPreloadedEvents(i);
			//   59  123:aload_0         
			//   60  124:getfield        #15  <Field APSMediaPlayer this$0>
			//   61  127:iload_1         
			//   62  128:invokestatic    #68  <Method void APSMediaPlayer.access$1100(APSMediaPlayer, int)>
				processTriggeredEvents(i);
			//   63  131:aload_0         
			//   64  132:getfield        #15  <Field APSMediaPlayer this$0>
			//   65  135:iload_1         
			//   66  136:invokestatic    #71  <Method void APSMediaPlayer.access$1200(APSMediaPlayer, int)>
				if(_durationAvailable)
			//*  67  139:aload_0         
			//*  68  140:getfield        #15  <Field APSMediaPlayer this$0>
			//*  69  143:invokestatic    #32  <Method boolean APSMediaPlayer.access$700(APSMediaPlayer)>
			//*  70  146:ifeq            393
				{
					positionDynamicEvents();
			//   71  149:aload_0         
			//   72  150:getfield        #15  <Field APSMediaPlayer this$0>
			//   73  153:invokestatic    #74  <Method void APSMediaPlayer.access$1300(APSMediaPlayer)>
					Object obj1 = ((Object) (new HashMap(((java.util.Map) (_dynamicTracking)))));
			//   74  156:new             #76  <Class HashMap>
			//   75  159:dup             
			//   76  160:aload_0         
			//   77  161:getfield        #15  <Field APSMediaPlayer this$0>
			//   78  164:getfield        #80  <Field HashMap APSMediaPlayer._dynamicTracking>
			//   79  167:invokespecial   #83  <Method void HashMap(java.util.Map)>
			//   80  170:astore_3        
					try
					{
						obj1 = ((Object) (((HashMap) (obj1)).keySet().iterator()));
			//   81  171:aload_3         
			//   82  172:invokevirtual   #87  <Method Set HashMap.keySet()>
			//   83  175:invokeinterface #93  <Method Iterator Set.iterator()>
			//   84  180:astore_3        
						do
						{
							if(!((Iterator) (obj1)).hasNext())
								break;
			//   85  181:aload_3         
			//   86  182:invokeinterface #99  <Method boolean Iterator.hasNext()>
			//   87  187:ifeq            301
							String s = (String)((Iterator) (obj1)).next();
			//   88  190:aload_3         
			//   89  191:invokeinterface #103 <Method Object Iterator.next()>
			//   90  196:checkcast       #105 <Class String>
			//   91  199:astore          4
							if(Integer.parseInt(s) <= i)
			//*  92  201:aload           4
			//*  93  203:invokestatic    #111 <Method int Integer.parseInt(String)>
			//*  94  206:iload_1         
			//*  95  207:icmpgt          181
							{
								APSMediaPlayer apsmediaplayer = APSMediaPlayer.this;
			//   96  210:aload_0         
			//   97  211:getfield        #15  <Field APSMediaPlayer this$0>
			//   98  214:astore          5
								ArrayList arraylist = (ArrayList)_dynamicTracking.get(((Object) (s)));
			//   99  216:aload_0         
			//  100  217:getfield        #15  <Field APSMediaPlayer this$0>
			//  101  220:getfield        #80  <Field HashMap APSMediaPlayer._dynamicTracking>
			//  102  223:aload           4
			//  103  225:invokevirtual   #115 <Method Object HashMap.get(Object)>
			//  104  228:checkcast       #117 <Class ArrayList>
			//  105  231:astore          6
								StringBuilder stringbuilder = new StringBuilder();
			//  106  233:new             #119 <Class StringBuilder>
			//  107  236:dup             
			//  108  237:invokespecial   #120 <Method void StringBuilder()>
			//  109  240:astore          7
								stringbuilder.append("progress to ");
			//  110  242:aload           7
			//  111  244:ldc1            #122 <String "progress to ">
			//  112  246:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
			//  113  249:pop             
								stringbuilder.append(s);
			//  114  250:aload           7
			//  115  252:aload           4
			//  116  254:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
			//  117  257:pop             
								apsmediaplayer.trackforEvent(arraylist, stringbuilder.toString(), APSMediaTrackingEvents.MediaEventType.POSITION, ((APSMediaEvent) (_currentUnit)));
			//  118  258:aload           5
			//  119  260:aload           6
			//  120  262:aload           7
			//  121  264:invokevirtual   #130 <Method String StringBuilder.toString()>
			//  122  267:getstatic       #136 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.POSITION>
			//  123  270:aload_0         
			//  124  271:getfield        #15  <Field APSMediaPlayer this$0>
			//  125  274:getfield        #140 <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//  126  277:invokevirtual   #144 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
								_dynamicTracking.remove(((Object) (s)));
			//  127  280:aload_0         
			//  128  281:getfield        #15  <Field APSMediaPlayer this$0>
			//  129  284:getfield        #80  <Field HashMap APSMediaPlayer._dynamicTracking>
			//  130  287:aload           4
			//  131  289:invokevirtual   #147 <Method Object HashMap.remove(Object)>
			//  132  292:pop             
							}
						} while(true);
			//  133  293:goto            181
					}
					catch(Exception exception)
			//* 134  296:astore_3        
					{
						exception.printStackTrace();
			//  135  297:aload_3         
			//  136  298:invokevirtual   #150 <Method void Exception.printStackTrace()>
					}
					if(_nextPlaylistIndex < _mediaUnits.size())
			//* 137  301:aload_0         
			//* 138  302:getfield        #15  <Field APSMediaPlayer this$0>
			//* 139  305:invokestatic    #154 <Method int APSMediaPlayer.access$1400(APSMediaPlayer)>
			//* 140  308:aload_0         
			//* 141  309:getfield        #15  <Field APSMediaPlayer this$0>
			//* 142  312:invokestatic    #158 <Method ArrayList APSMediaPlayer.access$1500(APSMediaPlayer)>
			//* 143  315:invokevirtual   #159 <Method int ArrayList.size()>
			//* 144  318:icmpge          393
					{
						Object obj2 = _mediaUnits.get(_nextPlaylistIndex);
			//  145  321:aload_0         
			//  146  322:getfield        #15  <Field APSMediaPlayer this$0>
			//  147  325:invokestatic    #158 <Method ArrayList APSMediaPlayer.access$1500(APSMediaPlayer)>
			//  148  328:aload_0         
			//  149  329:getfield        #15  <Field APSMediaPlayer this$0>
			//  150  332:invokestatic    #154 <Method int APSMediaPlayer.access$1400(APSMediaPlayer)>
			//  151  335:invokevirtual   #162 <Method Object ArrayList.get(int)>
			//  152  338:astore_3        
						if(!isMediaUnit(obj2))
			//* 153  339:aload_0         
			//* 154  340:getfield        #15  <Field APSMediaPlayer this$0>
			//* 155  343:aload_3         
			//* 156  344:invokevirtual   #166 <Method boolean APSMediaPlayer.isMediaUnit(Object)>
			//* 157  347:ifne            393
						{
							obj2 = ((Object) ((APSMediaEvent)obj2));
			//  158  350:aload_3         
			//  159  351:checkcast       #168 <Class APSMediaEvent>
			//  160  354:astore_3        
							if(((APSMediaEvent) (obj2)).getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStateUnloaded && (long)(duration() - currentPlaybackTime()) < ((APSMediaEvent) (obj2)).preloadInterval)
			//* 161  355:aload_3         
			//* 162  356:invokevirtual   #172 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
			//* 163  359:getstatic       #178 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
			//* 164  362:if_acmpne       393
			//* 165  365:aload_0         
			//* 166  366:getfield        #15  <Field APSMediaPlayer this$0>
			//* 167  369:invokevirtual   #29  <Method int APSMediaPlayer.duration()>
			//* 168  372:aload_0         
			//* 169  373:getfield        #15  <Field APSMediaPlayer this$0>
			//* 170  376:invokevirtual   #58  <Method int APSMediaPlayer.currentPlaybackTime()>
			//* 171  379:isub            
			//* 172  380:i2l             
			//* 173  381:aload_3         
			//* 174  382:getfield        #182 <Field long APSMediaEvent.preloadInterval>
			//* 175  385:lcmp            
			//* 176  386:ifge            393
								((APSMediaEvent) (obj2)).preload();
			//  177  389:aload_3         
			//  178  390:invokevirtual   #185 <Method void APSMediaEvent.preload()>
						}
					}
				}
				Bundle bundle;
				try
				{
					LocalBroadcastManager.getInstance(((android.content.Context) (activity))).sendBroadcast(new Intent("com.appscend.mp.notifications.update"));
			//  179  393:aload_0         
			//  180  394:getfield        #15  <Field APSMediaPlayer this$0>
			//  181  397:invokestatic    #189 <Method Activity APSMediaPlayer.access$1600(APSMediaPlayer)>
			//  182  400:invokestatic    #195 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
			//  183  403:new             #197 <Class Intent>
			//  184  406:dup             
			//  185  407:ldc1            #199 <String "com.appscend.mp.notifications.update">
			//  186  409:invokespecial   #202 <Method void Intent(String)>
			//  187  412:invokevirtual   #206 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
			//  188  415:pop             
				}
			//* 189  416:new             #208 <Class Bundle>
			//* 190  419:dup             
			//* 191  420:invokespecial   #209 <Method void Bundle()>
			//* 192  423:astore_3        
			//* 193  424:aload_3         
			//* 194  425:ldc1            #211 <String "position">
			//* 195  427:iload_1         
			//* 196  428:invokevirtual   #215 <Method void Bundle.putInt(String, int)>
			//* 197  431:aload_3         
			//* 198  432:ldc1            #216 <String "duration">
			//* 199  434:iload_2         
			//* 200  435:invokevirtual   #215 <Method void Bundle.putInt(String, int)>
			//* 201  438:aload_0         
			//* 202  439:getfield        #15  <Field APSMediaPlayer this$0>
			//* 203  442:new             #117 <Class ArrayList>
			//* 204  445:dup             
			//* 205  446:invokespecial   #217 <Method void ArrayList()>
			//* 206  449:ldc1            #219 <String "clock_tick">
			//* 207  451:getstatic       #222 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.CLOCK_TICK>
			//* 208  454:aload_3         
			//* 209  455:aload_0         
			//* 210  456:getfield        #15  <Field APSMediaPlayer this$0>
			//* 211  459:getfield        #140 <Field APSMediaUnit APSMediaPlayer._currentUnit>
			//* 212  462:invokevirtual   #226 <Method void APSMediaPlayer.emitEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, Bundle, APSMediaEvent)>
			//* 213  465:return          
				catch(Exception exception1) { }
			//  214  466:astore_3        
				bundle = new Bundle();
				bundle.putInt("position", i);
				bundle.putInt("duration", j);
				emitEvent(new ArrayList(), "clock_tick", APSMediaTrackingEvents.MediaEventType.CLOCK_TICK, bundle, ((APSMediaEvent) (_currentUnit)));
			//* 215  467:goto            416
			}

			final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void TimerTask()>
			//    5    9:return          
			}
		}
));
	//   12   22:aload_0         
	//   13   23:new             #14  <Class APSMediaPlayer$10>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:invokespecial   #1042 <Method void APSMediaPlayer$10(APSMediaPlayer)>
	//   17   31:putfield        #1032 <Field TimerTask timerTask>
		((Timer) (obj)).schedule(timerTask, 0L, 1000L);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #1032 <Field TimerTask timerTask>
	//   21   39:lconst_0        
	//   22   40:ldc2w           #1043 <Long 1000L>
	//   23   43:invokevirtual   #1048 <Method void Timer.schedule(TimerTask, long, long)>
	//   24   46:return          
	}

	public int currentPlaybackTime()
	{
		Object obj;
		obj = ((Object) (_currentUnit));
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_2        
		if(obj != null && ((APSMediaUnit) (obj)).url != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          40
	//*   5    9:aload_2         
	//*   6   10:getfield        #768 <Field String APSMediaUnit.url>
	//*   7   13:ifnull          40
			if(movieSourceTypeIsLiveStream())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #1052 <Method boolean movieSourceTypeIsLiveStream()>
	//*  10   20:ifeq            30
				return LivestreamInternalTimer.INSTANCE.getCurrentTime();
	//   11   23:getstatic       #1058 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//   12   26:invokevirtual   #1061 <Method int LivestreamInternalTimer.getCurrentTime()>
	//   13   29:ireturn         
			else
				return _renderer.getCurrentPosition();
	//   14   30:aload_0         
	//   15   31:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   16   34:invokeinterface #1064 <Method int IVeeplayRenderer.getCurrentPosition()>
	//   17   39:ireturn         
		obj = ((Object) (_overlaysDisplayed.iterator()));
	//   18   40:aload_0         
	//   19   41:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   20   44:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   21   47:astore_2        
_L2:
		APSMediaOverlay apsmediaoverlay;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_104;
	//   22   48:aload_2         
	//   23   49:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   24   54:ifeq            104
		apsmediaoverlay = (APSMediaOverlay)((Iterator) (obj)).next();
	//   25   57:aload_2         
	//   26   58:invokeinterface #365 <Method Object Iterator.next()>
	//   27   63:checkcast       #426 <Class APSMediaOverlay>
	//   28   66:astore_3        
		int i = ((Integer)((Object) (apsmediaoverlay.controller)).getClass().getMethod("currentPlaybackTime", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0])).intValue();
	//   29   67:aload_3         
	//   30   68:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   31   71:invokevirtual   #1070 <Method Class Object.getClass()>
	//   32   74:ldc2            #1071 <String "currentPlaybackTime">
	//   33   77:iconst_0        
	//   34   78:anewarray       Class[]
	//   35   81:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   36   84:aload_3         
	//   37   85:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   38   88:iconst_0        
	//   39   89:anewarray       Object[]
	//   40   92:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   41   95:checkcast       #444 <Class Integer>
	//   42   98:invokevirtual   #567 <Method int Integer.intValue()>
	//   43  101:istore_1        
		return i;
	//   44  102:iload_1         
	//   45  103:ireturn         
		return 0;
	//   46  104:iconst_0        
	//   47  105:ireturn         
		Exception exception;
		exception;
	//   48  106:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  49  107:goto            48
	}

	public APSMediaUnit currentUnit()
	{
		APSMediaUnit apsmediaunit;
		Object obj;
		apsmediaunit = _currentUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_1        
		if(apsmediaunit == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		apsmediaunit = apsmediaunit.copyWithZone();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #1079 <Method APSMediaUnit APSMediaUnit.copyWithZone()>
	//    9   15:astore_1        
		apsmediaunit.initialPlaybackTime = currentPlaybackTime();
	//   10   16:aload_1         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #1081 <Method int currentPlaybackTime()>
	//   13   21:putfield        #1084 <Field int APSMediaUnit.initialPlaybackTime>
		apsmediaunit.clearOverlays();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #1087 <Method void APSMediaUnit.clearOverlays()>
		obj = ((Object) (_overlaysDisplayed));
	//   16   28:aload_0         
	//   17   29:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   18   32:astore_2        
		if(obj == null) goto _L2; else goto _L1
	//   19   33:aload_2         
	//   20   34:ifnull          152
_L1:
		obj = ((Object) (((CopyOnWriteArrayList) (obj)).iterator()));
	//   21   37:aload_2         
	//   22   38:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   23   41:astore_2        
_L4:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
	//   24   42:aload_2         
	//   25   43:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   26   48:ifeq            152
_L3:
		APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)((Iterator) (obj)).next();
	//   27   51:aload_2         
	//   28   52:invokeinterface #365 <Method Object Iterator.next()>
	//   29   57:checkcast       #426 <Class APSMediaOverlay>
	//   30   60:astore_3        
		if(!apsmediaoverlay.type.equals("controls") && !apsmediaoverlay.type.equals("com.appscend.mp.overlays.midroll"))
	//*  31   61:aload_3         
	//*  32   62:getfield        #899 <Field String APSMediaOverlay.type>
	//*  33   65:ldc2            #492 <String "controls">
	//*  34   68:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  35   71:ifne            42
	//*  36   74:aload_3         
	//*  37   75:getfield        #899 <Field String APSMediaOverlay.type>
	//*  38   78:ldc2            #496 <String "com.appscend.mp.overlays.midroll">
	//*  39   81:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  40   84:ifne            42
		{
			APSMediaOverlay apsmediaoverlay1 = apsmediaoverlay.cloneOverlay();
	//   41   87:aload_3         
	//   42   88:invokevirtual   #886 <Method APSMediaOverlay APSMediaOverlay.cloneOverlay()>
	//   43   91:astore          4
			apsmediaoverlay1.parentUnit = apsmediaunit;
	//   44   93:aload           4
	//   45   95:aload_1         
	//   46   96:putfield        #1090 <Field APSMediaUnit APSMediaOverlay.parentUnit>
			CopyOnWriteArrayList copyonwritearraylist;
			try
			{
				((Object) (apsmediaoverlay1.controller)).getClass().getMethod("setParentOverlay", new Class[] {
					com/appscend/media/events/APSMediaOverlay
				}).invoke(((Object) (apsmediaoverlay1.controller)), new Object[] {
					apsmediaoverlay1
				});
	//   47   99:aload           4
	//   48  101:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   49  104:invokevirtual   #1070 <Method Class Object.getClass()>
	//   50  107:ldc2            #1092 <String "setParentOverlay">
	//   51  110:iconst_1        
	//   52  111:anewarray       Class[]
	//   53  114:dup             
	//   54  115:iconst_0        
	//   55  116:ldc2            #426 <Class APSMediaOverlay>
	//   56  119:aastore         
	//   57  120:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   58  123:aload           4
	//   59  125:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   60  128:iconst_1        
	//   61  129:anewarray       Object[]
	//   62  132:dup             
	//   63  133:iconst_0        
	//   64  134:aload           4
	//   65  136:aastore         
	//   66  137:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   67  140:pop             
			}
	//*  68  141:aload_1         
	//*  69  142:aload_3         
	//*  70  143:invokevirtual   #886 <Method APSMediaOverlay APSMediaOverlay.cloneOverlay()>
	//*  71  146:invokevirtual   #1096 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
	//*  72  149:goto            42
	//*  73  152:aload_0         
	//*  74  153:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//*  75  156:astore_2        
	//*  76  157:aload_2         
	//*  77  158:ifnull          188
	//*  78  161:aload_1         
	//*  79  162:new             #232 <Class ArrayList>
	//*  80  165:dup             
	//*  81  166:aload_2         
	//*  82  167:invokespecial   #1099 <Method void ArrayList(java.util.Collection)>
	//*  83  170:invokevirtual   #1102 <Method void APSMediaUnit.setOverlays(ArrayList)>
	//*  84  173:aload_1         
	//*  85  174:new             #232 <Class ArrayList>
	//*  86  177:dup             
	//*  87  178:aload_0         
	//*  88  179:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//*  89  182:invokespecial   #1099 <Method void ArrayList(java.util.Collection)>
	//*  90  185:invokevirtual   #1105 <Method void APSMediaUnit.setEvents(ArrayList)>
	//*  91  188:aload_1         
	//*  92  189:areturn         
			catch(Exception exception) { }
	//   93  190:astore          4
			apsmediaunit.addOverlay(apsmediaoverlay.cloneOverlay());
		}
		if(true) goto _L4; else goto _L2
	//   94  192:goto            141
_L2:
		copyonwritearraylist = _eventsToTrigger;
		if(copyonwritearraylist != null)
		{
			apsmediaunit.setOverlays(new ArrayList(((java.util.Collection) (copyonwritearraylist))));
			apsmediaunit.setEvents(new ArrayList(((java.util.Collection) (_eventsToTrigger))));
		}
		return apsmediaunit;
	}

	public int duration()
	{
		Object obj;
		obj = ((Object) (_currentUnit));
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_2        
		if(obj != null && ((APSMediaUnit) (obj)).url != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          34
	//*   5    9:aload_2         
	//*   6   10:getfield        #768 <Field String APSMediaUnit.url>
	//*   7   13:ifnull          34
		{
			obj = ((Object) (_renderer));
	//    8   16:aload_0         
	//    9   17:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   10   20:astore_2        
			if(obj != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          32
				return ((IVeeplayRenderer) (obj)).duration();
	//   13   25:aload_2         
	//   14   26:invokeinterface #1106 <Method int IVeeplayRenderer.duration()>
	//   15   31:ireturn         
			else
				return 0;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		}
		obj = ((Object) (_overlaysDisplayed.iterator()));
	//   18   34:aload_0         
	//   19   35:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   20   38:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   21   41:astore_2        
_L2:
		APSMediaOverlay apsmediaoverlay;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_98;
	//   22   42:aload_2         
	//   23   43:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   24   48:ifeq            98
		apsmediaoverlay = (APSMediaOverlay)((Iterator) (obj)).next();
	//   25   51:aload_2         
	//   26   52:invokeinterface #365 <Method Object Iterator.next()>
	//   27   57:checkcast       #426 <Class APSMediaOverlay>
	//   28   60:astore_3        
		int i = ((Integer)((Object) (apsmediaoverlay.controller)).getClass().getMethod("duration", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0])).intValue();
	//   29   61:aload_3         
	//   30   62:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   31   65:invokevirtual   #1070 <Method Class Object.getClass()>
	//   32   68:ldc2            #1107 <String "duration">
	//   33   71:iconst_0        
	//   34   72:anewarray       Class[]
	//   35   75:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   36   78:aload_3         
	//   37   79:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   38   82:iconst_0        
	//   39   83:anewarray       Object[]
	//   40   86:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   41   89:checkcast       #444 <Class Integer>
	//   42   92:invokevirtual   #567 <Method int Integer.intValue()>
	//   43   95:istore_1        
		return i;
	//   44   96:iload_1         
	//   45   97:ireturn         
		return 0;
	//   46   98:iconst_0        
	//   47   99:ireturn         
		Exception exception;
		exception;
	//   48  100:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  49  101:goto            42
	}

	public void emitEvent(ArrayList arraylist, String s, APSMediaTrackingEvents.MediaEventType mediaeventtype, Bundle bundle, APSMediaEvent apsmediaevent)
	{
		Bundle bundle1 = bundle;
	//    0    0:aload           4
	//    1    2:astore          6
		if(bundle == null)
	//*   2    4:aload           4
	//*   3    6:ifnonnull       18
			bundle1 = new Bundle();
	//    4    9:new             #748 <Class Bundle>
	//    5   12:dup             
	//    6   13:invokespecial   #749 <Method void Bundle()>
	//    7   16:astore          6
		if(arraylist != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          31
			bundle1.putSerializable("urls", ((java.io.Serializable) (arraylist)));
	//   10   22:aload           6
	//   11   24:ldc2            #1109 <String "urls">
	//   12   27:aload_1         
	//   13   28:invokevirtual   #1113 <Method void Bundle.putSerializable(String, java.io.Serializable)>
		if(s != null)
	//*  14   31:aload_2         
	//*  15   32:ifnull          44
			bundle1.putString("description", s);
	//   16   35:aload           6
	//   17   37:ldc2            #1115 <String "description">
	//   18   40:aload_2         
	//   19   41:invokevirtual   #1119 <Method void Bundle.putString(String, String)>
		if(apsmediaevent != null)
	//*  20   44:aload           5
	//*  21   46:ifnull          59
			bundle1.putParcelable("sourceEvent", ((android.os.Parcelable) (apsmediaevent)));
	//   22   49:aload           6
	//   23   51:ldc2            #1121 <String "sourceEvent">
	//   24   54:aload           5
	//   25   56:invokevirtual   #1125 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		for(arraylist = ((ArrayList) (eventListeners.iterator())); ((Iterator) (arraylist)).hasNext(); ((APSMediaPlayerTrackingEventListener)((Iterator) (arraylist)).next()).onTrackingEventReceived(mediaeventtype, bundle1));
	//   26   59:aload_0         
	//   27   60:getfield        #217 <Field CopyOnWriteArrayList eventListeners>
	//   28   63:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   29   66:astore_1        
	//   30   67:aload_1         
	//   31   68:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   32   73:ifeq            96
	//   33   76:aload_1         
	//   34   77:invokeinterface #365 <Method Object Iterator.next()>
	//   35   82:checkcast       #1127 <Class APSMediaPlayerTrackingEventListener>
	//   36   85:aload_3         
	//   37   86:aload           6
	//   38   88:invokeinterface #1131 <Method void APSMediaPlayerTrackingEventListener.onTrackingEventReceived(APSMediaTrackingEvents$MediaEventType, Bundle)>
	//*  39   93:goto            67
	//   40   96:return          
	}

	public void enterFullscreen()
	{
		log("Entering fullscreen");
	//    0    0:aload_0         
	//    1    1:ldc2            #1135 <String "Entering fullscreen">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		if(!_isFullscreen)
	//*   3    7:aload_0         
	//*   4    8:getfield        #1137 <Field boolean _isFullscreen>
	//*   5   11:ifne            358
		{
			Object obj = ((Object) (_mainView));
	//    6   14:aload_0         
	//    7   15:getfield        #326 <Field RelativeLayout _mainView>
	//    8   18:astore_1        
			if(obj == null)
	//*   9   19:aload_1         
	//*  10   20:ifnonnull       24
				return;
	//   11   23:return          
			mainViewParent = (ViewGroup)((RelativeLayout) (obj)).getParent();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #1141 <Method android.view.ViewParent RelativeLayout.getParent()>
	//   15   29:checkcast       #1143 <Class ViewGroup>
	//   16   32:putfield        #1145 <Field ViewGroup mainViewParent>
			obj = ((Object) (new RelativeLayout(((android.content.Context) (activity)))));
	//   17   35:new             #928 <Class RelativeLayout>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:getfield        #312 <Field Activity activity>
	//   21   43:invokespecial   #1148 <Method void RelativeLayout(android.content.Context)>
	//   22   46:astore_1        
			videoViewPosition = mainViewParent.indexOfChild(((View) (_mainView)));
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #1145 <Field ViewGroup mainViewParent>
	//   26   52:aload_0         
	//   27   53:getfield        #326 <Field RelativeLayout _mainView>
	//   28   56:invokevirtual   #1152 <Method int ViewGroup.indexOfChild(View)>
	//   29   59:putfield        #1154 <Field int videoViewPosition>
			((RelativeLayout) (obj)).setBackgroundColor(0xff000000);
	//   30   62:aload_1         
	//   31   63:ldc2            #1155 <Int 0xff000000>
	//   32   66:invokevirtual   #1158 <Method void RelativeLayout.setBackgroundColor(int)>
			videoDialog = new Dialog(((android.content.Context) (activity)), 0x103000a);
	//   33   69:aload_0         
	//   34   70:new             #1160 <Class Dialog>
	//   35   73:dup             
	//   36   74:aload_0         
	//   37   75:getfield        #312 <Field Activity activity>
	//   38   78:ldc2            #1161 <Int 0x103000a>
	//   39   81:invokespecial   #1164 <Method void Dialog(android.content.Context, int)>
	//   40   84:putfield        #1166 <Field Dialog videoDialog>
			videoDialog.setCanceledOnTouchOutside(false);
	//   41   87:aload_0         
	//   42   88:getfield        #1166 <Field Dialog videoDialog>
	//   43   91:iconst_0        
	//   44   92:invokevirtual   #1170 <Method void Dialog.setCanceledOnTouchOutside(boolean)>
			videoDialog.setContentView(((View) (obj)));
	//   45   95:aload_0         
	//   46   96:getfield        #1166 <Field Dialog videoDialog>
	//   47   99:aload_1         
	//   48  100:invokevirtual   #1173 <Method void Dialog.setContentView(View)>
			videoDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

				public void onCancel(DialogInterface dialoginterface)
				{
					exitFullscreen();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayer this$0>
				//    2    4:invokevirtual   #25  <Method void APSMediaPlayer.exitFullscreen()>
				//    3    7:return          
				}

				final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   49  103:aload_0         
	//   50  104:getfield        #1166 <Field Dialog videoDialog>
	//   51  107:new             #12  <Class APSMediaPlayer$1>
	//   52  110:dup             
	//   53  111:aload_0         
	//   54  112:invokespecial   #1174 <Method void APSMediaPlayer$1(APSMediaPlayer)>
	//   55  115:invokevirtual   #1178 <Method void Dialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
			videoDialog.show();
	//   56  118:aload_0         
	//   57  119:getfield        #1166 <Field Dialog videoDialog>
	//   58  122:invokevirtual   #1181 <Method void Dialog.show()>
			mainViewParent.removeView(((View) (_mainView)));
	//   59  125:aload_0         
	//   60  126:getfield        #1145 <Field ViewGroup mainViewParent>
	//   61  129:aload_0         
	//   62  130:getfield        #326 <Field RelativeLayout _mainView>
	//   63  133:invokevirtual   #1182 <Method void ViewGroup.removeView(View)>
			((RelativeLayout) (obj)).addView(((View) (_mainView)));
	//   64  136:aload_1         
	//   65  137:aload_0         
	//   66  138:getfield        #326 <Field RelativeLayout _mainView>
	//   67  141:invokevirtual   #947 <Method void RelativeLayout.addView(View)>
			_renderer.recylePlayerView();
	//   68  144:aload_0         
	//   69  145:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   70  148:invokeinterface #1185 <Method void IVeeplayRenderer.recylePlayerView()>
			videoDialog.getWindow().addFlags(128);
	//   71  153:aload_0         
	//   72  154:getfield        #1166 <Field Dialog videoDialog>
	//   73  157:invokevirtual   #1189 <Method Window Dialog.getWindow()>
	//   74  160:sipush          128
	//   75  163:invokevirtual   #1194 <Method void Window.addFlags(int)>
			savedOrientation = activity.getRequestedOrientation();
	//   76  166:aload_0         
	//   77  167:aload_0         
	//   78  168:getfield        #312 <Field Activity activity>
	//   79  171:invokevirtual   #1197 <Method int Activity.getRequestedOrientation()>
	//   80  174:putfield        #226 <Field int savedOrientation>
			switch(_cls20..SwitchMap.com.appscend.media.APSMediaPlayer.FullscreenOrientationBehaviour[fullscreenOrientationBehaviour.ordinal()])
	//*  81  177:getstatic       #1200 <Field int[] APSMediaPlayer$20.$SwitchMap$com$appscend$media$APSMediaPlayer$FullscreenOrientationBehaviour>
	//*  82  180:aload_0         
	//*  83  181:getfield        #224 <Field APSMediaPlayer$FullscreenOrientationBehaviour fullscreenOrientationBehaviour>
	//*  84  184:invokevirtual   #1201 <Method int APSMediaPlayer$FullscreenOrientationBehaviour.ordinal()>
	//*  85  187:iaload          
			{
	//*  86  188:tableswitch     2 3: default 212
	//	               2 227
	//	               3 215
	//*  87  212:goto            236
			case 3: // '\003'
				activity.setRequestedOrientation(7);
	//   88  215:aload_0         
	//   89  216:getfield        #312 <Field Activity activity>
	//   90  219:bipush          7
	//   91  221:invokevirtual   #1204 <Method void Activity.setRequestedOrientation(int)>
				break;

	//*  92  224:goto            236
			case 2: // '\002'
				activity.setRequestedOrientation(6);
	//   93  227:aload_0         
	//   94  228:getfield        #312 <Field Activity activity>
	//   95  231:bipush          6
	//   96  233:invokevirtual   #1204 <Method void Activity.setRequestedOrientation(int)>
				break;
			}
			obj = ((Object) (_currentUnit));
	//   97  236:aload_0         
	//   98  237:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   99  240:astore_1        
			if(obj != null)
	//* 100  241:aload_1         
	//* 101  242:ifnull          275
				trackforEvent((ArrayList)((APSMediaUnit) (obj)).trackingURLs.get("fullscreen"), "fullscreen", APSMediaTrackingEvents.MediaEventType.FULLSCREEN, ((APSMediaEvent) (_currentUnit)));
	//  102  245:aload_0         
	//  103  246:aload_1         
	//  104  247:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//  105  250:ldc2            #1206 <String "fullscreen">
	//  106  253:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//  107  256:checkcast       #232 <Class ArrayList>
	//  108  259:ldc2            #1206 <String "fullscreen">
	//  109  262:getstatic       #1209 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.FULLSCREEN>
	//  110  265:aload_0         
	//  111  266:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  112  269:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			else
	//* 113  272:goto            293
				trackforEvent(new ArrayList(), "fullscreen", APSMediaTrackingEvents.MediaEventType.FULLSCREEN, ((APSMediaEvent) (null)));
	//  114  275:aload_0         
	//  115  276:new             #232 <Class ArrayList>
	//  116  279:dup             
	//  117  280:invokespecial   #233 <Method void ArrayList()>
	//  118  283:ldc2            #1206 <String "fullscreen">
	//  119  286:getstatic       #1209 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.FULLSCREEN>
	//  120  289:aconst_null     
	//  121  290:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			_isFullscreen = true;
	//  122  293:aload_0         
	//  123  294:iconst_1        
	//  124  295:putfield        #1137 <Field boolean _isFullscreen>
			for(Iterator iterator = _overlaysDisplayed.iterator(); iterator.hasNext();)
	//* 125  298:aload_0         
	//* 126  299:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//* 127  302:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//* 128  305:astore_1        
	//* 129  306:aload_1         
	//* 130  307:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//* 131  312:ifeq            357
			{
				APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//  132  315:aload_1         
	//  133  316:invokeinterface #365 <Method Object Iterator.next()>
	//  134  321:checkcast       #426 <Class APSMediaOverlay>
	//  135  324:astore_2        
				try
				{
					((Object) (apsmediaoverlay.controller)).getClass().getMethod("fullscreenEntered", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//  136  325:aload_2         
	//  137  326:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//  138  329:invokevirtual   #1070 <Method Class Object.getClass()>
	//  139  332:ldc2            #1211 <String "fullscreenEntered">
	//  140  335:iconst_0        
	//  141  336:anewarray       Class[]
	//  142  339:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//  143  342:aload_2         
	//  144  343:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//  145  346:iconst_0        
	//  146  347:anewarray       Object[]
	//  147  350:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//  148  353:pop             
				}
	//* 149  354:goto            306
	//* 150  357:return          
	//* 151  358:return          
				catch(Exception exception) { }
	//  152  359:astore_2        
			}

			return;
		} else
		{
			return;
		}
	//* 153  360:goto            306
	}

	public void exitFullscreen()
	{
		log("Exiting fullscreen");
	//    0    0:aload_0         
	//    1    1:ldc2            #1213 <String "Exiting fullscreen">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		if(_isFullscreen)
	//*   3    7:aload_0         
	//*   4    8:getfield        #1137 <Field boolean _isFullscreen>
	//*   5   11:ifeq            237
		{
			Object obj = ((Object) (_mainView));
	//    6   14:aload_0         
	//    7   15:getfield        #326 <Field RelativeLayout _mainView>
	//    8   18:astore_1        
			if(obj == null)
	//*   9   19:aload_1         
	//*  10   20:ifnonnull       24
				return;
	//   11   23:return          
			((ViewGroup)((RelativeLayout) (obj)).getParent()).removeView(((View) (_mainView)));
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1141 <Method android.view.ViewParent RelativeLayout.getParent()>
	//   14   28:checkcast       #1143 <Class ViewGroup>
	//   15   31:aload_0         
	//   16   32:getfield        #326 <Field RelativeLayout _mainView>
	//   17   35:invokevirtual   #1182 <Method void ViewGroup.removeView(View)>
			mainViewParent.addView(((View) (_mainView)), videoViewPosition);
	//   18   38:aload_0         
	//   19   39:getfield        #1145 <Field ViewGroup mainViewParent>
	//   20   42:aload_0         
	//   21   43:getfield        #326 <Field RelativeLayout _mainView>
	//   22   46:aload_0         
	//   23   47:getfield        #1154 <Field int videoViewPosition>
	//   24   50:invokevirtual   #1216 <Method void ViewGroup.addView(View, int)>
			videoDialog.dismiss();
	//   25   53:aload_0         
	//   26   54:getfield        #1166 <Field Dialog videoDialog>
	//   27   57:invokevirtual   #1219 <Method void Dialog.dismiss()>
			obj = ((Object) (_renderer));
	//   28   60:aload_0         
	//   29   61:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   30   64:astore_1        
			if(obj != null)
	//*  31   65:aload_1         
	//*  32   66:ifnull          75
				((IVeeplayRenderer) (obj)).recylePlayerView();
	//   33   69:aload_1         
	//   34   70:invokeinterface #1185 <Method void IVeeplayRenderer.recylePlayerView()>
			mainViewParent = null;
	//   35   75:aload_0         
	//   36   76:aconst_null     
	//   37   77:putfield        #1145 <Field ViewGroup mainViewParent>
			videoDialog = null;
	//   38   80:aload_0         
	//   39   81:aconst_null     
	//   40   82:putfield        #1166 <Field Dialog videoDialog>
			obj = ((Object) (activity));
	//   41   85:aload_0         
	//   42   86:getfield        #312 <Field Activity activity>
	//   43   89:astore_1        
			if(obj != null)
	//*  44   90:aload_1         
	//*  45   91:ifnull          115
			{
				((Activity) (obj)).setRequestedOrientation(savedOrientation);
	//   46   94:aload_1         
	//   47   95:aload_0         
	//   48   96:getfield        #226 <Field int savedOrientation>
	//   49   99:invokevirtual   #1204 <Method void Activity.setRequestedOrientation(int)>
				activity.getWindow().addFlags(128);
	//   50  102:aload_0         
	//   51  103:getfield        #312 <Field Activity activity>
	//   52  106:invokevirtual   #1220 <Method Window Activity.getWindow()>
	//   53  109:sipush          128
	//   54  112:invokevirtual   #1194 <Method void Window.addFlags(int)>
			}
			obj = ((Object) (_currentUnit));
	//   55  115:aload_0         
	//   56  116:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   57  119:astore_1        
			if(obj != null)
	//*  58  120:aload_1         
	//*  59  121:ifnull          154
				trackforEvent((ArrayList)((APSMediaUnit) (obj)).trackingURLs.get("exitFullscreen"), "exitFullscreen", APSMediaTrackingEvents.MediaEventType.EXIT_FULLSCREEN, ((APSMediaEvent) (_currentUnit)));
	//   60  124:aload_0         
	//   61  125:aload_1         
	//   62  126:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   63  129:ldc2            #1221 <String "exitFullscreen">
	//   64  132:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   65  135:checkcast       #232 <Class ArrayList>
	//   66  138:ldc2            #1221 <String "exitFullscreen">
	//   67  141:getstatic       #1224 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.EXIT_FULLSCREEN>
	//   68  144:aload_0         
	//   69  145:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   70  148:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			else
	//*  71  151:goto            172
				trackforEvent(new ArrayList(), "exitFullscreen", APSMediaTrackingEvents.MediaEventType.EXIT_FULLSCREEN, ((APSMediaEvent) (null)));
	//   72  154:aload_0         
	//   73  155:new             #232 <Class ArrayList>
	//   74  158:dup             
	//   75  159:invokespecial   #233 <Method void ArrayList()>
	//   76  162:ldc2            #1221 <String "exitFullscreen">
	//   77  165:getstatic       #1224 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.EXIT_FULLSCREEN>
	//   78  168:aconst_null     
	//   79  169:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			_isFullscreen = false;
	//   80  172:aload_0         
	//   81  173:iconst_0        
	//   82  174:putfield        #1137 <Field boolean _isFullscreen>
			for(Iterator iterator = _overlaysDisplayed.iterator(); iterator.hasNext();)
	//*  83  177:aload_0         
	//*  84  178:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//*  85  181:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  86  184:astore_1        
	//*  87  185:aload_1         
	//*  88  186:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  89  191:ifeq            236
			{
				APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//   90  194:aload_1         
	//   91  195:invokeinterface #365 <Method Object Iterator.next()>
	//   92  200:checkcast       #426 <Class APSMediaOverlay>
	//   93  203:astore_2        
				try
				{
					((Object) (apsmediaoverlay.controller)).getClass().getMethod("fullscreenExited", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//   94  204:aload_2         
	//   95  205:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   96  208:invokevirtual   #1070 <Method Class Object.getClass()>
	//   97  211:ldc2            #1226 <String "fullscreenExited">
	//   98  214:iconst_0        
	//   99  215:anewarray       Class[]
	//  100  218:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//  101  221:aload_2         
	//  102  222:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//  103  225:iconst_0        
	//  104  226:anewarray       Object[]
	//  105  229:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//  106  232:pop             
				}
	//* 107  233:goto            185
	//* 108  236:return          
	//* 109  237:return          
				catch(Exception exception) { }
	//  110  238:astore_2        
			}

			return;
		} else
		{
			return;
		}
	//* 111  239:goto            185
	}

	public void finish()
	{
		log("Finish called - tearing down Veeplay resources.");
	//    0    0:aload_0         
	//    1    1:ldc2            #1228 <String "Finish called - tearing down Veeplay resources.">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		if(isFullscreen())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #1231 <Method boolean isFullscreen()>
	//*   5   11:ifeq            18
			exitFullscreen();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #846 <Method void exitFullscreen()>
		Object obj = ((Object) (_overlaysDisplayed));
	//    8   18:aload_0         
	//    9   19:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   10   22:astore_1        
		if(obj != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          83
			for(obj = ((Object) (((CopyOnWriteArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  15   31:astore_1        
	//*  16   32:aload_1         
	//*  17   33:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  18   38:ifeq            83
			{
				APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)((Iterator) (obj)).next();
	//   19   41:aload_1         
	//   20   42:invokeinterface #365 <Method Object Iterator.next()>
	//   21   47:checkcast       #426 <Class APSMediaOverlay>
	//   22   50:astore_2        
				try
				{
					((Object) (apsmediaoverlay.controller)).getClass().getMethod("stop", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//   23   51:aload_2         
	//   24   52:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   25   55:invokevirtual   #1070 <Method Class Object.getClass()>
	//   26   58:ldc2            #1233 <String "stop">
	//   27   61:iconst_0        
	//   28   62:anewarray       Class[]
	//   29   65:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   30   68:aload_2         
	//   31   69:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   32   72:iconst_0        
	//   33   73:anewarray       Object[]
	//   34   76:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   35   79:pop             
				}
	//*  36   80:goto            32
	//*  37   83:aload_0         
	//*  38   84:getfield        #1032 <Field TimerTask timerTask>
	//*  39   87:astore_1        
	//*  40   88:aload_1         
	//*  41   89:ifnull          97
	//*  42   92:aload_1         
	//*  43   93:invokevirtual   #1037 <Method boolean TimerTask.cancel()>
	//*  44   96:pop             
	//*  45   97:aload_0         
	//*  46   98:getstatic       #1236 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonUserExited>
	//*  47  101:invokevirtual   #982 <Method void unitFinished(APSMediaPlayer$MPMovieFinishReason)>
	//*  48  104:aload_0         
	//*  49  105:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*  50  108:astore_1        
	//*  51  109:aload_1         
	//*  52  110:ifnull          119
	//*  53  113:aload_1         
	//*  54  114:invokeinterface #935 <Method void IVeeplayRenderer.release()>
	//*  55  119:aload_0         
	//*  56  120:aconst_null     
	//*  57  121:putfield        #916 <Field IVeeplayRenderer _renderer>
	//*  58  124:aload_0         
	//*  59  125:getfield        #312 <Field Activity activity>
	//*  60  128:astore_1        
	//*  61  129:aload_1         
	//*  62  130:ifnull          151
	//*  63  133:aload_0         
	//*  64  134:getfield        #1238 <Field VolumeChangeObserver volumeChangeObserver>
	//*  65  137:ifnull          151
	//*  66  140:aload_1         
	//*  67  141:invokevirtual   #1242 <Method ContentResolver Activity.getContentResolver()>
	//*  68  144:aload_0         
	//*  69  145:getfield        #1238 <Field VolumeChangeObserver volumeChangeObserver>
	//*  70  148:invokevirtual   #1248 <Method void ContentResolver.unregisterContentObserver(android.database.ContentObserver)>
	//*  71  151:aload_0         
	//*  72  152:getfield        #326 <Field RelativeLayout _mainView>
	//*  73  155:astore_1        
	//*  74  156:aload_1         
	//*  75  157:ifnull          164
	//*  76  160:aload_1         
	//*  77  161:invokevirtual   #1251 <Method void RelativeLayout.removeAllViews()>
	//*  78  164:invokestatic    #274 <Method AsyncWorker AsyncWorker.getInstance()>
	//*  79  167:invokevirtual   #1253 <Method void AsyncWorker.stop()>
	//*  80  170:aload_0         
	//*  81  171:getfield        #197 <Field boolean backgroundServiceStarted>
	//*  82  174:ifeq            181
	//*  83  177:aload_0         
	//*  84  178:invokevirtual   #1256 <Method void stopBackgroundService()>
	//*  85  181:aconst_null     
	//*  86  182:putstatic       #463 <Field APSMediaPlayer instance>
	//*  87  185:return          
				catch(Exception exception) { }
	//   88  186:astore_2        
			}

		obj = ((Object) (timerTask));
		if(obj != null)
			((TimerTask) (obj)).cancel();
		unitFinished(MPMovieFinishReason.MPMovieFinishReasonUserExited);
		obj = ((Object) (_renderer));
		if(obj != null)
			((IVeeplayRenderer) (obj)).release();
		_renderer = null;
		obj = ((Object) (activity));
		if(obj != null && volumeChangeObserver != null)
			((Activity) (obj)).getContentResolver().unregisterContentObserver(((android.database.ContentObserver) (volumeChangeObserver)));
		obj = ((Object) (_mainView));
		if(obj != null)
			((RelativeLayout) (obj)).removeAllViews();
		AsyncWorker.getInstance().stop();
		if(backgroundServiceStarted)
			stopBackgroundService();
		instance = null;
	//*  89  187:goto            32
	}

	public Activity getActivity()
	{
		return activity;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field Activity activity>
	//    2    4:areturn         
	}

	public long getCachedPlaybackTime()
	{
		return _cachedPlaybackTime;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field long _cachedPlaybackTime>
	//    2    4:lreturn         
	}

	public String getCurrentPlayingUrl()
	{
		return _currentUnit.url;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:getfield        #768 <Field String APSMediaUnit.url>
	//    3    7:areturn         
	}

	public Handler getHandler()
	{
		return handler;
	//    0    0:getstatic       #316 <Field Handler handler>
	//    1    3:areturn         
	}

	public OkHttpClient getHttpClient()
	{
		if(httpClient == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1266 <Field OkHttpClient httpClient>
	//*   2    4:ifnonnull       56
		{
			httpClient = new OkHttpClient();
	//    3    7:aload_0         
	//    4    8:new             #1268 <Class OkHttpClient>
	//    5   11:dup             
	//    6   12:invokespecial   #1269 <Method void OkHttpClient()>
	//    7   15:putfield        #1266 <Field OkHttpClient httpClient>
			Activity activity1 = activity;
	//    8   18:aload_0         
	//    9   19:getfield        #312 <Field Activity activity>
	//   10   22:astore_1        
			if(activity1 != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          56
				httpClient.setCookieHandler(((java.net.CookieHandler) (new CookieManager(((java.net.CookieStore) (new PersistentCookieStore(activity1.getApplicationContext()))), CookiePolicy.ACCEPT_ALL))));
	//   13   27:aload_0         
	//   14   28:getfield        #1266 <Field OkHttpClient httpClient>
	//   15   31:new             #1271 <Class CookieManager>
	//   16   34:dup             
	//   17   35:new             #1273 <Class PersistentCookieStore>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokevirtual   #1277 <Method android.content.Context Activity.getApplicationContext()>
	//   21   43:invokespecial   #1278 <Method void PersistentCookieStore(android.content.Context)>
	//   22   46:getstatic       #1284 <Field CookiePolicy CookiePolicy.ACCEPT_ALL>
	//   23   49:invokespecial   #1287 <Method void CookieManager(java.net.CookieStore, CookiePolicy)>
	//   24   52:invokevirtual   #1291 <Method OkHttpClient OkHttpClient.setCookieHandler(java.net.CookieHandler)>
	//   25   55:pop             
		}
		return httpClient;
	//   26   56:aload_0         
	//   27   57:getfield        #1266 <Field OkHttpClient httpClient>
	//   28   60:areturn         
	}

	public int getMainViewHeight()
	{
		return _mainView.getLayoutParams().height;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field RelativeLayout _mainView>
	//    2    4:invokevirtual   #1296 <Method android.view.ViewGroup$LayoutParams RelativeLayout.getLayoutParams()>
	//    3    7:getfield        #1300 <Field int android.view.ViewGroup$LayoutParams.height>
	//    4   10:ireturn         
	}

	public int getMainViewWidth()
	{
		return _mainView.getLayoutParams().width;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field RelativeLayout _mainView>
	//    2    4:invokevirtual   #1296 <Method android.view.ViewGroup$LayoutParams RelativeLayout.getLayoutParams()>
	//    3    7:getfield        #1303 <Field int android.view.ViewGroup$LayoutParams.width>
	//    4   10:ireturn         
	}

	public RelativeLayout getOverlayContainer()
	{
		return _overlayContainer;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field RelativeLayout _overlayContainer>
	//    2    4:areturn         
	}

	public List getPlaylist()
	{
		return ((List) (_mediaUnits));
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ArrayList _mediaUnits>
	//    2    4:areturn         
	}

	public String getUserAgent()
	{
		String s = userAgent;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field String userAgent>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return s;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return System.getProperty("http.agent");
	//    7   11:ldc2            #1311 <String "http.agent">
	//    8   14:invokestatic    #1317 <Method String System.getProperty(String)>
	//    9   17:areturn         
	}

	public String getYoutubeApiKey()
	{
		return youtubeApiKey;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field String youtubeApiKey>
	//    2    4:areturn         
	}

	public void hideHud()
	{
		handler.post(new Runnable() {

			public void run()
			{
				if(hudlessLoadImageView != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field APSMediaPlayer this$0>
			//*   2    4:getfield        #25  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
			//*   3    7:ifnull          21
					hudlessLoadImageView.setVisibility(4);
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field APSMediaPlayer this$0>
			//    6   14:getfield        #25  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
			//    7   17:iconst_4        
			//    8   18:invokevirtual   #31  <Method void ImageView.setVisibility(int)>
			//    9   21:return          
			}

			final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:getstatic       #316 <Field Handler handler>
	//    1    3:new             #28  <Class APSMediaPlayer$16>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #1320 <Method void APSMediaPlayer$16(APSMediaPlayer)>
	//    5   11:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void init(Activity activity1, boolean flag)
	{
		log("Veeplay 2.1.42 initializing");
	//    0    0:aload_0         
	//    1    1:ldc2            #1323 <String "Veeplay 2.1.42 initializing">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		handler = new Handler();
	//    3    7:new             #730 <Class Handler>
	//    4   10:dup             
	//    5   11:invokespecial   #1324 <Method void Handler()>
	//    6   14:putstatic       #316 <Field Handler handler>
		httpClient = new OkHttpClient();
	//    7   17:aload_0         
	//    8   18:new             #1268 <Class OkHttpClient>
	//    9   21:dup             
	//   10   22:invokespecial   #1269 <Method void OkHttpClient()>
	//   11   25:putfield        #1266 <Field OkHttpClient httpClient>
		httpClient.setCookieHandler(((java.net.CookieHandler) (new CookieManager(((java.net.CookieStore) (new PersistentCookieStore(activity1.getApplicationContext()))), CookiePolicy.ACCEPT_ALL))));
	//   12   28:aload_0         
	//   13   29:getfield        #1266 <Field OkHttpClient httpClient>
	//   14   32:new             #1271 <Class CookieManager>
	//   15   35:dup             
	//   16   36:new             #1273 <Class PersistentCookieStore>
	//   17   39:dup             
	//   18   40:aload_1         
	//   19   41:invokevirtual   #1277 <Method android.content.Context Activity.getApplicationContext()>
	//   20   44:invokespecial   #1278 <Method void PersistentCookieStore(android.content.Context)>
	//   21   47:getstatic       #1284 <Field CookiePolicy CookiePolicy.ACCEPT_ALL>
	//   22   50:invokespecial   #1287 <Method void CookieManager(java.net.CookieStore, CookiePolicy)>
	//   23   53:invokevirtual   #1291 <Method OkHttpClient OkHttpClient.setCookieHandler(java.net.CookieHandler)>
	//   24   56:pop             
		boolean flag1;
		if(activity != null)
	//*  25   57:aload_0         
	//*  26   58:getfield        #312 <Field Activity activity>
	//*  27   61:ifnull          69
			flag1 = false;
	//   28   64:iconst_0        
	//   29   65:istore_3        
		else
	//*  30   66:goto            71
			flag1 = true;
	//   31   69:iconst_1        
	//   32   70:istore_3        
		activity = activity1;
	//   33   71:aload_0         
	//   34   72:aload_1         
	//   35   73:putfield        #312 <Field Activity activity>
		Constants.statusBarDefaultState = flag;
	//   36   76:iload_2         
	//   37   77:putstatic       #1329 <Field boolean Constants.statusBarDefaultState>
		if(!flag1)
	//*  38   80:iload_3         
	//*  39   81:ifne            85
			return;
	//   40   84:return          
		LicenseValidator.getInstance().setPackageName(activity1.getPackageName());
	//   41   85:invokestatic    #1334 <Method LicenseValidator LicenseValidator.getInstance()>
	//   42   88:aload_1         
	//   43   89:invokevirtual   #964 <Method String Activity.getPackageName()>
	//   44   92:invokevirtual   #1337 <Method void LicenseValidator.setPackageName(String)>
		LicenseValidator.getInstance().startLicenseRetrieval();
	//   45   95:invokestatic    #1334 <Method LicenseValidator LicenseValidator.getInstance()>
	//   46   98:invokevirtual   #1340 <Method void LicenseValidator.startLicenseRetrieval()>
		Constants.deviceIsTablet = activity1.getResources().getBoolean(com.appscend.vastplayer.R.bool.isTablet);
	//   47  101:aload_1         
	//   48  102:invokevirtual   #1344 <Method Resources Activity.getResources()>
	//   49  105:getstatic       #1349 <Field int com.appscend.vastplayer.R$bool.isTablet>
	//   50  108:invokevirtual   #1355 <Method boolean Resources.getBoolean(int)>
	//   51  111:putstatic       #1358 <Field boolean Constants.deviceIsTablet>
		Constants.display = activity1.getWindowManager().getDefaultDisplay();
	//   52  114:aload_1         
	//   53  115:invokevirtual   #1362 <Method WindowManager Activity.getWindowManager()>
	//   54  118:invokeinterface #1368 <Method android.view.Display WindowManager.getDefaultDisplay()>
	//   55  123:putstatic       #1372 <Field android.view.Display Constants.display>
		int i = activity1.getResources().getIdentifier("status_bar_height", "dimen", "android");
	//   56  126:aload_1         
	//   57  127:invokevirtual   #1344 <Method Resources Activity.getResources()>
	//   58  130:ldc2            #1374 <String "status_bar_height">
	//   59  133:ldc2            #1376 <String "dimen">
	//   60  136:ldc2            #1378 <String "android">
	//   61  139:invokevirtual   #1382 <Method int Resources.getIdentifier(String, String, String)>
	//   62  142:istore_3        
		if(i > 0)
	//*  63  143:iload_3         
	//*  64  144:ifle            158
			Constants.statusBarHeight = activity1.getResources().getDimensionPixelSize(i);
	//   65  147:aload_1         
	//   66  148:invokevirtual   #1344 <Method Resources Activity.getResources()>
	//   67  151:iload_3         
	//   68  152:invokevirtual   #1386 <Method int Resources.getDimensionPixelSize(int)>
	//   69  155:putstatic       #1389 <Field int Constants.statusBarHeight>
		i = activity1.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
	//   70  158:aload_1         
	//   71  159:invokevirtual   #1344 <Method Resources Activity.getResources()>
	//   72  162:ldc2            #1391 <String "navigation_bar_height">
	//   73  165:ldc2            #1376 <String "dimen">
	//   74  168:ldc2            #1378 <String "android">
	//   75  171:invokevirtual   #1382 <Method int Resources.getIdentifier(String, String, String)>
	//   76  174:istore_3        
		if(i > 0)
	//*  77  175:iload_3         
	//*  78  176:ifle            190
			Constants.navigationBarHeight = activity1.getResources().getDimensionPixelSize(i);
	//   79  179:aload_1         
	//   80  180:invokevirtual   #1344 <Method Resources Activity.getResources()>
	//   81  183:iload_3         
	//   82  184:invokevirtual   #1386 <Method int Resources.getDimensionPixelSize(int)>
	//   83  187:putstatic       #1394 <Field int Constants.navigationBarHeight>
		_mainView = new RelativeLayout(((android.content.Context) (activity1)));
	//   84  190:aload_0         
	//   85  191:new             #928 <Class RelativeLayout>
	//   86  194:dup             
	//   87  195:aload_1         
	//   88  196:invokespecial   #1148 <Method void RelativeLayout(android.content.Context)>
	//   89  199:putfield        #326 <Field RelativeLayout _mainView>
		_rendererContainer = new RelativeLayout(((android.content.Context) (activity1)));
	//   90  202:aload_0         
	//   91  203:new             #928 <Class RelativeLayout>
	//   92  206:dup             
	//   93  207:aload_1         
	//   94  208:invokespecial   #1148 <Method void RelativeLayout(android.content.Context)>
	//   95  211:putfield        #922 <Field RelativeLayout _rendererContainer>
		setCurrentRenderer((new APSMediaUnit()).renderer);
	//   96  214:aload_0         
	//   97  215:new             #342 <Class APSMediaUnit>
	//   98  218:dup             
	//   99  219:invokespecial   #1395 <Method void APSMediaUnit()>
	//  100  222:getfield        #1398 <Field String APSMediaUnit.renderer>
	//  101  225:invokespecial   #760 <Method void setCurrentRenderer(String)>
		_overlayContainer = new RelativeLayout(((android.content.Context) (activity1)));
	//  102  228:aload_0         
	//  103  229:new             #928 <Class RelativeLayout>
	//  104  232:dup             
	//  105  233:aload_1         
	//  106  234:invokespecial   #1148 <Method void RelativeLayout(android.content.Context)>
	//  107  237:putfield        #329 <Field RelativeLayout _overlayContainer>
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
	//  108  240:new             #1400 <Class android.widget.RelativeLayout$LayoutParams>
	//  109  243:dup             
	//  110  244:iconst_m1       
	//  111  245:iconst_m1       
	//  112  246:invokespecial   #1403 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  113  249:astore          4
		layoutparams.addRule(13);
	//  114  251:aload           4
	//  115  253:bipush          13
	//  116  255:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		_overlayContainer.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  117  258:aload_0         
	//  118  259:getfield        #329 <Field RelativeLayout _overlayContainer>
	//  119  262:aload           4
	//  120  264:invokevirtual   #1410 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		pinchFullscreen = new ScaleGestureDetector(((android.content.Context) (activity1)), ((android.view.ScaleGestureDetector.OnScaleGestureListener) (new android.view.ScaleGestureDetector.SimpleOnScaleGestureListener() {

			public boolean onScale(ScaleGestureDetector scalegesturedetector)
			{
				userPinched(scalegesturedetector.getScaleFactor());
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field APSMediaPlayer this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #27  <Method float ScaleGestureDetector.getScaleFactor()>
			//    4    8:invokevirtual   #31  <Method void APSMediaPlayer.userPinched(float)>
				return true;
			//    5   11:iconst_1        
			//    6   12:ireturn         
			}

			public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
			{
				return true;
			//    0    0:iconst_1        
			//    1    1:ireturn         
			}

			public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
			{
			//    0    0:return          
			}

			final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.view.ScaleGestureDetector$SimpleOnScaleGestureListener()>
			//    5    9:return          
			}
		}
)));
	//  121  267:aload_0         
	//  122  268:new             #1412 <Class ScaleGestureDetector>
	//  123  271:dup             
	//  124  272:aload_1         
	//  125  273:new             #36  <Class APSMediaPlayer$2>
	//  126  276:dup             
	//  127  277:aload_0         
	//  128  278:invokespecial   #1413 <Method void APSMediaPlayer$2(APSMediaPlayer)>
	//  129  281:invokespecial   #1416 <Method void ScaleGestureDetector(android.content.Context, android.view.ScaleGestureDetector$OnScaleGestureListener)>
	//  130  284:putfield        #281 <Field ScaleGestureDetector pinchFullscreen>
		gestureDetector = new GestureDetectorCompat(((android.content.Context) (activity1)), new android.view.GestureDetector.OnGestureListener() {

			public boolean onDown(MotionEvent motionevent)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public void onLongPress(MotionEvent motionevent)
			{
			//    0    0:return          
			}

			public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public void onShowPress(MotionEvent motionevent)
			{
			//    0    0:return          
			}

			public boolean onSingleTapUp(MotionEvent motionevent)
			{
				playerTapped();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field APSMediaPlayer this$0>
			//    2    4:invokevirtual   #33  <Method void APSMediaPlayer.playerTapped()>
				return true;
			//    3    7:iconst_1        
			//    4    8:ireturn         
			}

			final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  131  287:aload_0         
	//  132  288:new             #1418 <Class GestureDetectorCompat>
	//  133  291:dup             
	//  134  292:aload_1         
	//  135  293:new             #40  <Class APSMediaPlayer$3>
	//  136  296:dup             
	//  137  297:aload_0         
	//  138  298:invokespecial   #1419 <Method void APSMediaPlayer$3(APSMediaPlayer)>
	//  139  301:invokespecial   #1422 <Method void GestureDetectorCompat(android.content.Context, android.view.GestureDetector$OnGestureListener)>
	//  140  304:putfield        #285 <Field GestureDetectorCompat gestureDetector>
		_overlayContainer.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				view.performClick();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method boolean View.performClick()>
			//    2    4:pop             
				if(motionevent.getPointerCount() > 1)
			//*   3    5:aload_2         
			//*   4    6:invokevirtual   #35  <Method int MotionEvent.getPointerCount()>
			//*   5    9:iconst_1        
			//*   6   10:icmple          27
				{
					pinchFullscreen.onTouchEvent(motionevent);
			//    7   13:aload_0         
			//    8   14:getfield        #17  <Field APSMediaPlayer this$0>
			//    9   17:invokestatic    #39  <Method ScaleGestureDetector APSMediaPlayer.access$000(APSMediaPlayer)>
			//   10   20:aload_2         
			//   11   21:invokevirtual   #45  <Method boolean ScaleGestureDetector.onTouchEvent(MotionEvent)>
			//   12   24:pop             
					return true;
			//   13   25:iconst_1        
			//   14   26:ireturn         
				} else
				{
					gestureDetector.onTouchEvent(motionevent);
			//   15   27:aload_0         
			//   16   28:getfield        #17  <Field APSMediaPlayer this$0>
			//   17   31:invokestatic    #49  <Method GestureDetectorCompat APSMediaPlayer.access$100(APSMediaPlayer)>
			//   18   34:aload_2         
			//   19   35:invokevirtual   #52  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
			//   20   38:pop             
					return true;
			//   21   39:iconst_1        
			//   22   40:ireturn         
				}
			}

			final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  141  307:aload_0         
	//  142  308:getfield        #329 <Field RelativeLayout _overlayContainer>
	//  143  311:new             #42  <Class APSMediaPlayer$4>
	//  144  314:dup             
	//  145  315:aload_0         
	//  146  316:invokespecial   #1423 <Method void APSMediaPlayer$4(APSMediaPlayer)>
	//  147  319:invokevirtual   #1427 <Method void RelativeLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		volumeChangeObserver = new VolumeChangeObserver(((android.content.Context) (activity1)), new Handler(), ((VolumeChangedInterface) (this)));
	//  148  322:aload_0         
	//  149  323:new             #1429 <Class VolumeChangeObserver>
	//  150  326:dup             
	//  151  327:aload_1         
	//  152  328:new             #730 <Class Handler>
	//  153  331:dup             
	//  154  332:invokespecial   #1324 <Method void Handler()>
	//  155  335:aload_0         
	//  156  336:invokespecial   #1432 <Method void VolumeChangeObserver(android.content.Context, Handler, VolumeChangedInterface)>
	//  157  339:putfield        #1238 <Field VolumeChangeObserver volumeChangeObserver>
		activity1.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, ((android.database.ContentObserver) (volumeChangeObserver)));
	//  158  342:aload_1         
	//  159  343:invokevirtual   #1242 <Method ContentResolver Activity.getContentResolver()>
	//  160  346:getstatic       #1438 <Field Uri android.provider.Settings$System.CONTENT_URI>
	//  161  349:iconst_1        
	//  162  350:aload_0         
	//  163  351:getfield        #1238 <Field VolumeChangeObserver volumeChangeObserver>
	//  164  354:invokevirtual   #1442 <Method void ContentResolver.registerContentObserver(Uri, boolean, android.database.ContentObserver)>
		hudlessLoadImageView = new ImageView(((android.content.Context) (activity1)));
	//  165  357:aload_0         
	//  166  358:new             #1444 <Class ImageView>
	//  167  361:dup             
	//  168  362:aload_1         
	//  169  363:invokespecial   #1445 <Method void ImageView(android.content.Context)>
	//  170  366:putfield        #1447 <Field ImageView hudlessLoadImageView>
		hudlessLoadImageView.setVisibility(4);
	//  171  369:aload_0         
	//  172  370:getfield        #1447 <Field ImageView hudlessLoadImageView>
	//  173  373:iconst_4        
	//  174  374:invokevirtual   #1450 <Method void ImageView.setVisibility(int)>
		activity1 = ((Activity) (new android.widget.RelativeLayout.LayoutParams(-2, -2)));
	//  175  377:new             #1400 <Class android.widget.RelativeLayout$LayoutParams>
	//  176  380:dup             
	//  177  381:bipush          -2
	//  178  383:bipush          -2
	//  179  385:invokespecial   #1403 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  180  388:astore_1        
		((android.widget.RelativeLayout.LayoutParams) (activity1)).addRule(13);
	//  181  389:aload_1         
	//  182  390:bipush          13
	//  183  392:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		hudlessLoadImageView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (activity1)));
	//  184  395:aload_0         
	//  185  396:getfield        #1447 <Field ImageView hudlessLoadImageView>
	//  186  399:aload_1         
	//  187  400:invokevirtual   #1451 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		hudlessLoadImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
	//  188  403:aload_0         
	//  189  404:getfield        #1447 <Field ImageView hudlessLoadImageView>
	//  190  407:getstatic       #1457 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
	//  191  410:invokevirtual   #1461 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		hudlessLoadImageView.setImageResource(com.appscend.vastplayer.R.drawable.loading);
	//  192  413:aload_0         
	//  193  414:getfield        #1447 <Field ImageView hudlessLoadImageView>
	//  194  417:getstatic       #1466 <Field int com.appscend.vastplayer.R$drawable.loading>
	//  195  420:invokevirtual   #1469 <Method void ImageView.setImageResource(int)>
		handler.post(new Runnable() {

			public void run()
			{
				if(hudlessLoadImageView != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field APSMediaPlayer this$0>
			//*   2    4:getfield        #26  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
			//*   3    7:ifnull          26
					((AnimationDrawable)hudlessLoadImageView.getDrawable()).start();
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field APSMediaPlayer this$0>
			//    6   14:getfield        #26  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
			//    7   17:invokevirtual   #32  <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
			//    8   20:checkcast       #34  <Class AnimationDrawable>
			//    9   23:invokevirtual   #37  <Method void AnimationDrawable.start()>
			//   10   26:return          
			}

			final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  196  423:getstatic       #316 <Field Handler handler>
	//  197  426:new             #44  <Class APSMediaPlayer$5>
	//  198  429:dup             
	//  199  430:aload_0         
	//  200  431:invokespecial   #1470 <Method void APSMediaPlayer$5(APSMediaPlayer)>
	//  201  434:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//  202  437:pop             
		_rendererContainer.setGravity(17);
	//  203  438:aload_0         
	//  204  439:getfield        #922 <Field RelativeLayout _rendererContainer>
	//  205  442:bipush          17
	//  206  444:invokevirtual   #1473 <Method void RelativeLayout.setGravity(int)>
		_rendererContainer.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  207  447:aload_0         
	//  208  448:getfield        #922 <Field RelativeLayout _rendererContainer>
	//  209  451:aload           4
	//  210  453:invokevirtual   #1410 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		_mainView.addView(((View) (_rendererContainer)));
	//  211  456:aload_0         
	//  212  457:getfield        #326 <Field RelativeLayout _mainView>
	//  213  460:aload_0         
	//  214  461:getfield        #922 <Field RelativeLayout _rendererContainer>
	//  215  464:invokevirtual   #947 <Method void RelativeLayout.addView(View)>
		_mainView.addView(((View) (_overlayContainer)));
	//  216  467:aload_0         
	//  217  468:getfield        #326 <Field RelativeLayout _mainView>
	//  218  471:aload_0         
	//  219  472:getfield        #329 <Field RelativeLayout _overlayContainer>
	//  220  475:invokevirtual   #947 <Method void RelativeLayout.addView(View)>
		_mainView.addView(((View) (hudlessLoadImageView)));
	//  221  478:aload_0         
	//  222  479:getfield        #326 <Field RelativeLayout _mainView>
	//  223  482:aload_0         
	//  224  483:getfield        #1447 <Field ImageView hudlessLoadImageView>
	//  225  486:invokevirtual   #947 <Method void RelativeLayout.addView(View)>
	//  226  489:return          
	}

	public void insertMediaUnits(ArrayList arraylist)
	{
		int i = _nextPlaylistIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field int _nextPlaylistIndex>
	//    2    4:istore_2        
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #677 <Method Iterator ArrayList.iterator()>
	//    5    9:astore_1        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//    6   10:aload_1         
	//    7   11:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    8   16:ifeq            87
			APSMediaUnit apsmediaunit = (APSMediaUnit)((Iterator) (arraylist)).next();
	//    9   19:aload_1         
	//   10   20:invokeinterface #365 <Method Object Iterator.next()>
	//   11   25:checkcast       #342 <Class APSMediaUnit>
	//   12   28:astore_3        
			if(apsmediaunit.url != null && !apsmediaunit.url.equals("") || apsmediaunit.trackingURLs != null && apsmediaunit.trackingURLs.keySet().size() > 0)
	//*  13   29:aload_3         
	//*  14   30:getfield        #768 <Field String APSMediaUnit.url>
	//*  15   33:ifnull          49
	//*  16   36:aload_3         
	//*  17   37:getfield        #768 <Field String APSMediaUnit.url>
	//*  18   40:ldc2            #438 <String "">
	//*  19   43:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  20   46:ifeq            71
	//*  21   49:aload_3         
	//*  22   50:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//*  23   53:ifnull          10
	//*  24   56:aload_3         
	//*  25   57:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//*  26   60:invokevirtual   #349 <Method Set HashMap.keySet()>
	//*  27   63:invokeinterface #1475 <Method int Set.size()>
	//*  28   68:ifle            10
			{
				_mediaUnits.add(i, ((Object) (apsmediaunit)));
	//   29   71:aload_0         
	//   30   72:getfield        #235 <Field ArrayList _mediaUnits>
	//   31   75:iload_2         
	//   32   76:aload_3         
	//   33   77:invokevirtual   #1476 <Method void ArrayList.add(int, Object)>
				i++;
	//   34   80:iload_2         
	//   35   81:iconst_1        
	//   36   82:iadd            
	//   37   83:istore_2        
			}
		} while(true);
	//   38   84:goto            10
	//   39   87:return          
	}

	public boolean isBackgroundServiceStarted()
	{
		return backgroundServiceStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field boolean backgroundServiceStarted>
	//    2    4:ireturn         
	}

	public boolean isCurrentlyInFullscreenOverlayActivity()
	{
		return currentlyInFullscreenOverlayActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field boolean currentlyInFullscreenOverlayActivity>
	//    2    4:ireturn         
	}

	public boolean isFullscreen()
	{
		return _isFullscreen;
	//    0    0:aload_0         
	//    1    1:getfield        #1137 <Field boolean _isFullscreen>
	//    2    4:ireturn         
	}

	public boolean isGoogleCastEnabled()
	{
		return isGoogleCastEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field boolean isGoogleCastEnabled>
	//    2    4:ireturn         
	}

	public boolean isMediaUnit(Object obj)
	{
		return obj instanceof APSMediaUnit;
	//    0    0:aload_1         
	//    1    1:instanceof      #342 <Class APSMediaUnit>
	//    2    4:ireturn         
	}

	public boolean isPaused()
	{
		return _paused;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field boolean _paused>
	//    2    4:ireturn         
	}

	public boolean isPlaying()
	{
		return playbackState() == MPMoviePlaybackState.MPMoviePlaybackPlaying;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1485 <Method APSMediaPlayer$MPMoviePlaybackState playbackState()>
	//    2    4:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isProcessing()
	{
		return isProcessing;
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field boolean isProcessing>
	//    2    4:ireturn         
	}

	public boolean isRenderingToGoogleCast()
	{
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:astore_1        
		return iveeplayrenderer != null && iveeplayrenderer.type().equals("google-cast-renderer") && isPlaying();
	//    3    5:aload_1         
	//    4    6:ifnull          33
	//    5    9:aload_1         
	//    6   10:invokeinterface #920 <Method String IVeeplayRenderer.type()>
	//    7   15:ldc2            #1491 <String "google-cast-renderer">
	//    8   18:invokevirtual   #380 <Method boolean String.equals(Object)>
	//    9   21:ifeq            33
	//   10   24:aload_0         
	//   11   25:invokevirtual   #1493 <Method boolean isPlaying()>
	//   12   28:ifeq            33
	//   13   31:iconst_1        
	//   14   32:ireturn         
	//   15   33:iconst_0        
	//   16   34:ireturn         
	}

	public boolean isSecureSurfaceView()
	{
		return secureSurfaceView;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field boolean secureSurfaceView>
	//    2    4:ireturn         
	}

	public boolean isSeeking()
	{
		return isSeeking;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field boolean isSeeking>
	//    2    4:ireturn         
	}

	public boolean isStreamingUrl(String s)
	{
		return s.contains("m3u8");
	//    0    0:aload_1         
	//    1    1:ldc2            #1500 <String "m3u8">
	//    2    4:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//    3    7:ireturn         
	}

	public void loadStatePlayable()
	{
		log("state playable entered");
	//    0    0:aload_0         
	//    1    1:ldc2            #1503 <String "state playable entered">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		createTimer();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #1505 <Method void createTimer()>
		if(_currentUnit != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*   7   15:ifnull          264
		{
			LivestreamInternalTimer.INSTANCE.start(_currentUnit.initialPlaybackTime);
	//    8   18:getstatic       #1058 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//    9   21:aload_0         
	//   10   22:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   11   25:getfield        #1084 <Field int APSMediaUnit.initialPlaybackTime>
	//   12   28:invokevirtual   #1507 <Method void LivestreamInternalTimer.start(int)>
			if(!_currentUnit.shouldAutoplay)
	//*  13   31:aload_0         
	//*  14   32:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*  15   35:getfield        #1510 <Field boolean APSMediaUnit.shouldAutoplay>
	//*  16   38:ifne            47
				LivestreamInternalTimer.INSTANCE.stop();
	//   17   41:getstatic       #1058 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//   18   44:invokevirtual   #1511 <Method void LivestreamInternalTimer.stop()>
			APSMediaUnit apsmediaunit = _currentUnit;
	//   19   47:aload_0         
	//   20   48:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   21   51:astore_1        
			if(apsmediaunit != null && _renderer != null)
	//*  22   52:aload_1         
	//*  23   53:ifnull          144
	//*  24   56:aload_0         
	//*  25   57:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*  26   60:ifnull          144
				if(apsmediaunit.initialPlaybackTime > 0 && !_renderer.handlesInitialPlaybackTime())
	//*  27   63:aload_1         
	//*  28   64:getfield        #1084 <Field int APSMediaUnit.initialPlaybackTime>
	//*  29   67:ifle            137
	//*  30   70:aload_0         
	//*  31   71:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*  32   74:invokeinterface #1514 <Method boolean IVeeplayRenderer.handlesInitialPlaybackTime()>
	//*  33   79:ifne            137
				{
					_renderer.seekTo(_currentUnit.initialPlaybackTime);
	//   34   82:aload_0         
	//   35   83:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   36   86:aload_0         
	//   37   87:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   38   90:getfield        #1084 <Field int APSMediaUnit.initialPlaybackTime>
	//   39   93:invokeinterface #1517 <Method void IVeeplayRenderer.seekTo(int)>
					StringBuilder stringbuilder = new StringBuilder();
	//   40   98:new             #569 <Class StringBuilder>
	//   41  101:dup             
	//   42  102:invokespecial   #570 <Method void StringBuilder()>
	//   43  105:astore_1        
					stringbuilder.append("initial playback set. seeking to ");
	//   44  106:aload_1         
	//   45  107:ldc2            #1519 <String "initial playback set. seeking to ">
	//   46  110:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   47  113:pop             
					stringbuilder.append(_currentUnit.initialPlaybackTime);
	//   48  114:aload_1         
	//   49  115:aload_0         
	//   50  116:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   51  119:getfield        #1084 <Field int APSMediaUnit.initialPlaybackTime>
	//   52  122:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   53  125:pop             
					log(stringbuilder.toString());
	//   54  126:aload_0         
	//   55  127:aload_1         
	//   56  128:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   57  131:invokevirtual   #587 <Method void log(String)>
				} else
	//*  58  134:goto            144
				{
					log("no initial playback time set");
	//   59  137:aload_0         
	//   60  138:ldc2            #1521 <String "no initial playback time set">
	//   61  141:invokevirtual   #587 <Method void log(String)>
				}
			trackforEvent((ArrayList)_currentUnit.trackingURLs.get("launch"), "launch for non-linear", APSMediaTrackingEvents.MediaEventType.LAUNCH, ((APSMediaEvent) (_currentUnit)));
	//   62  144:aload_0         
	//   63  145:aload_0         
	//   64  146:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   65  149:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   66  152:ldc2            #775 <String "launch">
	//   67  155:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   68  158:checkcast       #232 <Class ArrayList>
	//   69  161:ldc2            #1523 <String "launch for non-linear">
	//   70  164:getstatic       #780 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.LAUNCH>
	//   71  167:aload_0         
	//   72  168:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   73  171:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			trackforEvent((ArrayList)_currentUnit.trackingURLs.get("impression"), "impression", APSMediaTrackingEvents.MediaEventType.IMPRESSION, ((APSMediaEvent) (_currentUnit)));
	//   74  174:aload_0         
	//   75  175:aload_0         
	//   76  176:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   77  179:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   78  182:ldc2            #1525 <String "impression">
	//   79  185:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   80  188:checkcast       #232 <Class ArrayList>
	//   81  191:ldc2            #1525 <String "impression">
	//   82  194:getstatic       #1528 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.IMPRESSION>
	//   83  197:aload_0         
	//   84  198:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   85  201:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			trackforEvent((ArrayList)_currentUnit.trackingURLs.get("creativeView"), "creativeView", APSMediaTrackingEvents.MediaEventType.CREATIVE_VIEW, ((APSMediaEvent) (_currentUnit)));
	//   86  204:aload_0         
	//   87  205:aload_0         
	//   88  206:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   89  209:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   90  212:ldc2            #1530 <String "creativeView">
	//   91  215:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   92  218:checkcast       #232 <Class ArrayList>
	//   93  221:ldc2            #1530 <String "creativeView">
	//   94  224:getstatic       #1533 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.CREATIVE_VIEW>
	//   95  227:aload_0         
	//   96  228:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   97  231:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
			trackforEvent((ArrayList)_currentUnit.trackingURLs.get("start"), "start", APSMediaTrackingEvents.MediaEventType.START, ((APSMediaEvent) (_currentUnit)));
	//   98  234:aload_0         
	//   99  235:aload_0         
	//  100  236:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  101  239:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//  102  242:ldc2            #1534 <String "start">
	//  103  245:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//  104  248:checkcast       #232 <Class ArrayList>
	//  105  251:ldc2            #1534 <String "start">
	//  106  254:getstatic       #1537 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.START>
	//  107  257:aload_0         
	//  108  258:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  109  261:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		}
	//  110  264:return          
	}

	public void log(String s)
	{
		Log.d("VeeplayPlayer", s);
	//    0    0:ldc2            #1539 <String "VeeplayPlayer">
	//    1    3:aload_1         
	//    2    4:invokestatic    #1545 <Method int Log.d(String, String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public boolean movieSourceTypeIsLiveStream()
	{
		return duration() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #649 <Method int duration()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void next()
	{
		unitFinished(MPMovieFinishReason.MPMovieFinishReasonPlaybackEnded);
	//    0    0:aload_0         
	//    1    1:getstatic       #1548 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonPlaybackEnded>
	//    2    4:invokevirtual   #982 <Method void unitFinished(APSMediaPlayer$MPMovieFinishReason)>
	//    3    7:return          
	}

	public void notifySeekFinished()
	{
		isSeeking = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #189 <Field boolean isSeeking>
	//    3    5:return          
	}

	public void onActivityPaused()
	{
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:astore_1        
		if(iveeplayrenderer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			iveeplayrenderer.onActivityPaused();
	//    5    9:aload_1         
	//    6   10:invokeinterface #1552 <Method void IVeeplayRenderer.onActivityPaused()>
	//    7   15:return          
	}

	public void onActivityResumed()
	{
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:astore_1        
		if(iveeplayrenderer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			iveeplayrenderer.onActivityResumed();
	//    5    9:aload_1         
	//    6   10:invokeinterface #1555 <Method void IVeeplayRenderer.onActivityResumed()>
		reactivateOverlays();
	//    7   15:aload_0         
	//    8   16:invokespecial   #1557 <Method void reactivateOverlays()>
	//    9   19:return          
	}

	public void onEventStateChanged(final APSMediaEvent event, com.appscend.media.events.APSMediaEvent.APSMediaEventState apsmediaeventstate)
	{
		if(event.getState() != com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStateUnloaded)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//*   2    4:getstatic       #831 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStateUnloaded>
	//*   3    7:if_acmpeq       82
		{
			if(event.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloaded)
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//*   6   14:getstatic       #725 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloaded>
	//*   7   17:if_acmpne       47
			{
				event.unregisterEventStateListener(((APSMediaEventStateListener) (this)));
	//    8   20:aload_1         
	//    9   21:aload_0         
	//   10   22:invokevirtual   #1562 <Method void APSMediaEvent.unregisterEventStateListener(APSMediaEventStateListener)>
				event.unregisterEventTimeoutListener(((APSMediaEventTimeoutListener) (this)));
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:invokevirtual   #1565 <Method void APSMediaEvent.unregisterEventTimeoutListener(APSMediaEventTimeoutListener)>
				handler.post(new Runnable() {

					public void run()
					{
						event.trigger();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field APSMediaEvent val$event>
					//    2    4:invokevirtual   #31  <Method void APSMediaEvent.trigger()>
					//    3    7:return          
					}

					final APSMediaPlayer this$0;
					final APSMediaEvent val$event;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field APSMediaPlayer this$0>
				event = apsmediaevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field APSMediaEvent val$event>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   14   30:getstatic       #316 <Field Handler handler>
	//   15   33:new             #30  <Class APSMediaPlayer$17>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokespecial   #1566 <Method void APSMediaPlayer$17(APSMediaPlayer, APSMediaEvent)>
	//   20   42:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//   21   45:pop             
				return;
	//   22   46:return          
			}
			if(event.getState() != com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloading)
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//*  25   51:getstatic       #704 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
	//*  26   54:if_acmpeq       82
			{
				event.unregisterEventStateListener(((APSMediaEventStateListener) (this)));
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #1562 <Method void APSMediaEvent.unregisterEventStateListener(APSMediaEventStateListener)>
				event.unregisterEventTimeoutListener(((APSMediaEventTimeoutListener) (this)));
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:invokevirtual   #1565 <Method void APSMediaEvent.unregisterEventTimeoutListener(APSMediaEventTimeoutListener)>
				handler.post(new Runnable() {

					public void run()
					{
						processQueue();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field APSMediaPlayer this$0>
					//    2    4:invokestatic    #25  <Method void APSMediaPlayer.access$1800(APSMediaPlayer)>
					//    3    7:return          
					}

					final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   33   67:getstatic       #316 <Field Handler handler>
	//   34   70:new             #32  <Class APSMediaPlayer$18>
	//   35   73:dup             
	//   36   74:aload_0         
	//   37   75:invokespecial   #1567 <Method void APSMediaPlayer$18(APSMediaPlayer)>
	//   38   78:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//   39   81:pop             
			}
		}
	//   40   82:return          
	}

	public void onEventTimeout(APSMediaEvent apsmediaevent)
	{
		if(apsmediaevent.getState() == com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStatePreloading)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #694 <Method com.appscend.media.events.APSMediaEvent$APSMediaEventState APSMediaEvent.getState()>
	//*   2    4:getstatic       #704 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
	//*   3    7:if_acmpne       42
		{
			apsmediaevent.unregisterEventStateListener(((APSMediaEventStateListener) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokevirtual   #1562 <Method void APSMediaEvent.unregisterEventStateListener(APSMediaEventStateListener)>
			apsmediaevent.unregisterEventTimeoutListener(((APSMediaEventTimeoutListener) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #1565 <Method void APSMediaEvent.unregisterEventTimeoutListener(APSMediaEventTimeoutListener)>
			apsmediaevent.updateState(com.appscend.media.events.APSMediaEvent.APSMediaEventState.APSMediaEventStateFailed);
	//   10   20:aload_1         
	//   11   21:getstatic       #700 <Field com.appscend.media.events.APSMediaEvent$APSMediaEventState com.appscend.media.events.APSMediaEvent$APSMediaEventState.APSMediaEventStateFailed>
	//   12   24:invokevirtual   #1573 <Method void APSMediaEvent.updateState(com.appscend.media.events.APSMediaEvent$APSMediaEventState)>
			handler.post(new Runnable() {

				public void run()
				{
					processQueue();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayer this$0>
				//    2    4:invokestatic    #25  <Method void APSMediaPlayer.access$1800(APSMediaPlayer)>
				//    3    7:return          
				}

				final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   13   27:getstatic       #316 <Field Handler handler>
	//   14   30:new             #34  <Class APSMediaPlayer$19>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #1574 <Method void APSMediaPlayer$19(APSMediaPlayer)>
	//   18   38:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//   19   41:pop             
		}
	//   20   42:return          
	}

	public boolean openURL(String s)
	{
		Object obj;
		obj = ((Object) (s.trim()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1582 <Method String String.trim()>
	//    2    4:astore_2        
		if(!((String) (obj)).startsWith("apsplayer"))
			break MISSING_BLOCK_LABEL_90;
	//    3    5:aload_2         
	//    4    6:ldc2            #1584 <String "apsplayer">
	//    5    9:invokevirtual   #1587 <Method boolean String.startsWith(String)>
	//    6   12:ifeq            90
		if(!((String) (obj)).endsWith("play"))
			break MISSING_BLOCK_LABEL_42;
	//    7   15:aload_2         
	//    8   16:ldc2            #1589 <String "play">
	//    9   19:invokevirtual   #1592 <Method boolean String.endsWith(String)>
	//   10   22:ifeq            42
		play();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #1594 <Method void play()>
		return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		s;
	//   15   31:astore_1        
		break MISSING_BLOCK_LABEL_36;
	//   16   32:goto            36
		s;
	//   17   35:astore_1        
		((Exception) (s)).printStackTrace();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #1597 <Method void Exception.printStackTrace()>
		return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		if(((String) (obj)).endsWith("pause"))
	//*  22   42:aload_2         
	//*  23   43:ldc2            #1599 <String "pause">
	//*  24   46:invokevirtual   #1592 <Method boolean String.endsWith(String)>
	//*  25   49:ifeq            58
		{
			pause();
	//   26   52:aload_0         
	//   27   53:invokevirtual   #1601 <Method void pause()>
			return true;
	//   28   56:iconst_1        
	//   29   57:ireturn         
		}
		if(((String) (obj)).endsWith("skip"))
	//*  30   58:aload_2         
	//*  31   59:ldc2            #1603 <String "skip">
	//*  32   62:invokevirtual   #1592 <Method boolean String.endsWith(String)>
	//*  33   65:ifeq            74
		{
			skip();
	//   34   68:aload_0         
	//   35   69:invokevirtual   #1605 <Method void skip()>
			return true;
	//   36   72:iconst_1        
	//   37   73:ireturn         
		}
		if(((String) (obj)).endsWith("fullscreen"))
	//*  38   74:aload_2         
	//*  39   75:ldc2            #1206 <String "fullscreen">
	//*  40   78:invokevirtual   #1592 <Method boolean String.endsWith(String)>
	//*  41   81:ifeq            88
			toggleFullscreen();
	//   42   84:aload_0         
	//   43   85:invokevirtual   #1608 <Method void toggleFullscreen()>
		return true;
	//   44   88:iconst_1        
	//   45   89:ireturn         
		s = ((String) (actionDelegate));
	//   46   90:aload_0         
	//   47   91:getfield        #1610 <Field APSMediaPlayerActionDelegate actionDelegate>
	//   48   94:astore_1        
		if(s != null && ((APSMediaPlayerActionDelegate) (s)).canRespondTo(((String) (obj))))
	//*  49   95:aload_1         
	//*  50   96:ifnull          120
	//*  51   99:aload_1         
	//*  52  100:aload_2         
	//*  53  101:invokeinterface #1615 <Method boolean APSMediaPlayerActionDelegate.canRespondTo(String)>
	//*  54  106:ifeq            120
			return actionDelegate.respondTo(((String) (obj)));
	//   55  109:aload_0         
	//   56  110:getfield        #1610 <Field APSMediaPlayerActionDelegate actionDelegate>
	//   57  113:aload_2         
	//   58  114:invokeinterface #1618 <Method boolean APSMediaPlayerActionDelegate.respondTo(String)>
	//   59  119:ireturn         
		if(!((String) (obj)).startsWith("http") && !((String) (obj)).startsWith("https") && !((String) (obj)).startsWith("//"))
	//*  60  120:aload_2         
	//*  61  121:ldc2            #1620 <String "http">
	//*  62  124:invokevirtual   #1587 <Method boolean String.startsWith(String)>
	//*  63  127:ifne            214
	//*  64  130:aload_2         
	//*  65  131:ldc2            #1622 <String "https">
	//*  66  134:invokevirtual   #1587 <Method boolean String.startsWith(String)>
	//*  67  137:ifne            214
	//*  68  140:aload_2         
	//*  69  141:ldc2            #1624 <String "//">
	//*  70  144:invokevirtual   #1587 <Method boolean String.startsWith(String)>
	//*  71  147:ifeq            153
	//*  72  150:goto            214
		{
			s = ((String) (new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))))));
	//   73  153:new             #858 <Class Intent>
	//   74  156:dup             
	//   75  157:ldc2            #1626 <String "android.intent.action.VIEW">
	//   76  160:aload_2         
	//   77  161:invokestatic    #1632 <Method Uri Uri.parse(String)>
	//   78  164:invokespecial   #1635 <Method void Intent(String, Uri)>
	//   79  167:astore_1        
			if(android.os.Build.VERSION.SDK_INT < 21)
	//*  80  168:getstatic       #1640 <Field int android.os.Build$VERSION.SDK_INT>
	//*  81  171:bipush          21
	//*  82  173:icmpge          187
				((Intent) (s)).addFlags(0x80000);
	//   83  176:aload_1         
	//   84  177:ldc2            #1641 <Int 0x80000>
	//   85  180:invokevirtual   #1644 <Method Intent Intent.addFlags(int)>
	//   86  183:pop             
			else
	//*  87  184:goto            195
				((Intent) (s)).addFlags(0x80000);
	//   88  187:aload_1         
	//   89  188:ldc2            #1641 <Int 0x80000>
	//   90  191:invokevirtual   #1644 <Method Intent Intent.addFlags(int)>
	//   91  194:pop             
			obj = ((Object) (activity));
	//   92  195:aload_0         
	//   93  196:getfield        #312 <Field Activity activity>
	//   94  199:astore_2        
			if(obj != null)
	//*  95  200:aload_2         
	//*  96  201:ifnull          212
				((Activity) (obj)).startActivityForResult(((Intent) (s)), 999);
	//   97  204:aload_2         
	//   98  205:aload_1         
	//   99  206:sipush          999
	//  100  209:invokevirtual   #1648 <Method void Activity.startActivityForResult(Intent, int)>
			return true;
	//  101  212:iconst_1        
	//  102  213:ireturn         
		}
		s = ((String) (obj));
	//  103  214:aload_2         
	//  104  215:astore_1        
		if(((String) (obj)).startsWith("//"))
	//* 105  216:aload_2         
	//* 106  217:ldc2            #1624 <String "//">
	//* 107  220:invokevirtual   #1587 <Method boolean String.startsWith(String)>
	//* 108  223:ifeq            253
		{
			s = ((String) (new StringBuilder()));
	//  109  226:new             #569 <Class StringBuilder>
	//  110  229:dup             
	//  111  230:invokespecial   #570 <Method void StringBuilder()>
	//  112  233:astore_1        
			((StringBuilder) (s)).append("http:");
	//  113  234:aload_1         
	//  114  235:ldc2            #1650 <String "http:">
	//  115  238:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  116  241:pop             
			((StringBuilder) (s)).append(((String) (obj)));
	//  117  242:aload_1         
	//  118  243:aload_2         
	//  119  244:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//  120  247:pop             
			s = ((StringBuilder) (s)).toString();
	//  121  248:aload_1         
	//  122  249:invokevirtual   #584 <Method String StringBuilder.toString()>
	//  123  252:astore_1        
		}
		obj = ((Object) (_mainView));
	//  124  253:aload_0         
	//  125  254:getfield        #326 <Field RelativeLayout _mainView>
	//  126  257:astore_2        
		if(obj != null)
	//* 127  258:aload_2         
	//* 128  259:ifnull          303
		{
			obj = ((Object) (new Intent(((RelativeLayout) (obj)).getContext(), com/appscend/utilities/WebBrowser)));
	//  129  262:new             #858 <Class Intent>
	//  130  265:dup             
	//  131  266:aload_2         
	//  132  267:invokevirtual   #1653 <Method android.content.Context RelativeLayout.getContext()>
	//  133  270:ldc2            #1655 <Class WebBrowser>
	//  134  273:invokespecial   #1658 <Method void Intent(android.content.Context, Class)>
	//  135  276:astore_2        
			((Intent) (obj)).putExtra("url", s);
	//  136  277:aload_2         
	//  137  278:ldc2            #1659 <String "url">
	//  138  281:aload_1         
	//  139  282:invokevirtual   #1663 <Method Intent Intent.putExtra(String, String)>
	//  140  285:pop             
			s = ((String) (activity));
	//  141  286:aload_0         
	//  142  287:getfield        #312 <Field Activity activity>
	//  143  290:astore_1        
			if(s != null)
	//* 144  291:aload_1         
	//* 145  292:ifnull          303
				((Activity) (s)).startActivityForResult(((Intent) (obj)), 999);
	//  146  295:aload_1         
	//  147  296:aload_2         
	//  148  297:sipush          999
	//  149  300:invokevirtual   #1648 <Method void Activity.startActivityForResult(Intent, int)>
		}
		return true;
	//  150  303:iconst_1        
	//  151  304:ireturn         
	}

	public void orientationWillChange()
	{
		resetDisplayedOverlays();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #914 <Method void resetDisplayedOverlays()>
	//    2    4:return          
	}

	public void pause()
	{
		log("video paused");
	//    0    0:aload_0         
	//    1    1:ldc2            #1666 <String "video paused">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		APSMediaUnit apsmediaunit = _currentUnit;
	//    3    7:aload_0         
	//    4    8:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    5   11:astore_1        
		if(apsmediaunit != null && apsmediaunit.url != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          58
	//*   8   16:aload_1         
	//*   9   17:getfield        #768 <Field String APSMediaUnit.url>
	//*  10   20:ifnull          58
		{
			IVeeplayRenderer iveeplayrenderer = _renderer;
	//   11   23:aload_0         
	//   12   24:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   13   27:astore_1        
			if(iveeplayrenderer != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          58
			{
				iveeplayrenderer.pause();
	//   16   32:aload_1         
	//   17   33:invokeinterface #1667 <Method void IVeeplayRenderer.pause()>
				LivestreamInternalTimer.INSTANCE.stop();
	//   18   38:getstatic       #1058 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//   19   41:invokevirtual   #1511 <Method void LivestreamInternalTimer.stop()>
				playbackStateChanged(MPMoviePlaybackState.MPMoviePlaybackPaused, true);
	//   20   44:aload_0         
	//   21   45:getstatic       #1670 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
	//   22   48:iconst_1        
	//   23   49:invokevirtual   #1674 <Method void playbackStateChanged(APSMediaPlayer$MPMoviePlaybackState, boolean)>
				_paused = true;
	//   24   52:aload_0         
	//   25   53:iconst_1        
	//   26   54:putfield        #185 <Field boolean _paused>
				return;
	//   27   57:return          
			}
		}
		for(Iterator iterator = _overlaysDisplayed.iterator(); iterator.hasNext();)
	//*  28   58:aload_0         
	//*  29   59:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//*  30   62:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  31   65:astore_1        
	//*  32   66:aload_1         
	//*  33   67:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  34   72:ifeq            117
		{
			APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//   35   75:aload_1         
	//   36   76:invokeinterface #365 <Method Object Iterator.next()>
	//   37   81:checkcast       #426 <Class APSMediaOverlay>
	//   38   84:astore_2        
			try
			{
				((Object) (apsmediaoverlay.controller)).getClass().getMethod("pause", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//   39   85:aload_2         
	//   40   86:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   41   89:invokevirtual   #1070 <Method Class Object.getClass()>
	//   42   92:ldc2            #1599 <String "pause">
	//   43   95:iconst_0        
	//   44   96:anewarray       Class[]
	//   45   99:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   46  102:aload_2         
	//   47  103:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   48  106:iconst_0        
	//   49  107:anewarray       Object[]
	//   50  110:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   51  113:pop             
			}
	//*  52  114:goto            66
	//*  53  117:return          
			catch(Exception exception) { }
	//   54  118:astore_2        
		}

	//*  55  119:goto            66
	}

	public void performPostTapAction()
	{
		log("performing post click action");
	//    0    0:aload_0         
	//    1    1:ldc2            #1677 <String "performing post click action">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		switch(_cls20..SwitchMap.com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction[DismissActionContainer.INSTANCE.getDismissAction().ordinal()])
	//*   3    7:getstatic       #1680 <Field int[] APSMediaPlayer$20.$SwitchMap$com$appscend$media$APSMediaBuilder$APSWebviewDismissedAction>
	//*   4   10:getstatic       #1685 <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//*   5   13:invokevirtual   #1689 <Method APSMediaBuilder$APSWebviewDismissedAction DismissActionContainer.getDismissAction()>
	//*   6   16:invokevirtual   #1692 <Method int APSMediaBuilder$APSWebviewDismissedAction.ordinal()>
	//*   7   19:iaload          
		{
	//*   8   20:tableswitch     1 3: default 48
	//	               1 93
	//	               2 72
	//	               3 49
		default:
			return;
	//    9   48:return          

		case 3: // '\003'
			(new Handler()).postDelayed(new Runnable() {

				public void run()
				{
					skip();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayer this$0>
				//    2    4:invokevirtual   #24  <Method void APSMediaPlayer.skip()>
				//    3    7:return          
				}

				final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
, 500L);
	//   10   49:new             #730 <Class Handler>
	//   11   52:dup             
	//   12   53:invokespecial   #1324 <Method void Handler()>
	//   13   56:new             #48  <Class APSMediaPlayer$7>
	//   14   59:dup             
	//   15   60:aload_0         
	//   16   61:invokespecial   #1693 <Method void APSMediaPlayer$7(APSMediaPlayer)>
	//   17   64:ldc2w           #1694 <Long 500L>
	//   18   67:invokevirtual   #1699 <Method boolean Handler.postDelayed(Runnable, long)>
	//   19   70:pop             
			return;
	//   20   71:return          

		case 2: // '\002'
			APSMediaPlayerOverlayController apsmediaplayeroverlaycontroller = DismissActionContainer.INSTANCE.getDismissOverlay();
	//   21   72:getstatic       #1685 <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   22   75:invokevirtual   #1703 <Method APSMediaPlayerOverlayController DismissActionContainer.getDismissOverlay()>
	//   23   78:astore_1        
			if(apsmediaplayeroverlaycontroller != null)
	//*  24   79:aload_1         
	//*  25   80:ifnull          93
			{
				apsmediaplayeroverlaycontroller.hideOverlay();
	//   26   83:aload_1         
	//   27   84:invokevirtual   #1706 <Method void APSMediaPlayerOverlayController.hideOverlay()>
				DismissActionContainer.INSTANCE.unsetDismissAction();
	//   28   87:getstatic       #1685 <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   29   90:invokevirtual   #1709 <Method void DismissActionContainer.unsetDismissAction()>
			}
			// fall through

		case 1: // '\001'
			return;
	//   30   93:return          
		}
	}

	public void play()
		throws LicenseInvalidException, RootedPhoneException
	{
		Object obj;
		log("play called");
	//    0    0:aload_0         
	//    1    1:ldc2            #1711 <String "play called">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		if(LicenseValidator.getInstance().isLicenseRetrieved() && !LicenseValidator.getInstance().isLicenseValid())
	//*   3    7:invokestatic    #1334 <Method LicenseValidator LicenseValidator.getInstance()>
	//*   4   10:invokevirtual   #1714 <Method boolean LicenseValidator.isLicenseRetrieved()>
	//*   5   13:ifeq            36
	//*   6   16:invokestatic    #1334 <Method LicenseValidator LicenseValidator.getInstance()>
	//*   7   19:invokevirtual   #1717 <Method boolean LicenseValidator.isLicenseValid()>
	//*   8   22:ifeq            28
	//*   9   25:goto            36
			throw new LicenseInvalidException();
	//   10   28:new             #1577 <Class LicenseInvalidException>
	//   11   31:dup             
	//   12   32:invokespecial   #1718 <Method void LicenseInvalidException()>
	//   13   35:athrow          
		if(restrictRootedAccess && VPUtilities.isRooted())
	//*  14   36:aload_0         
	//*  15   37:getfield        #195 <Field boolean restrictRootedAccess>
	//*  16   40:ifeq            60
	//*  17   43:invokestatic    #1723 <Method boolean VPUtilities.isRooted()>
	//*  18   46:ifne            52
	//*  19   49:goto            60
			throw new RootedPhoneException();
	//   20   52:new             #1579 <Class RootedPhoneException>
	//   21   55:dup             
	//   22   56:invokespecial   #1724 <Method void RootedPhoneException()>
	//   23   59:athrow          
		obj = ((Object) (_currentUnit));
	//   24   60:aload_0         
	//   25   61:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   26   64:astore_2        
		if(obj == null || ((APSMediaUnit) (obj)).url != null) goto _L2; else goto _L1
	//   27   65:aload_2         
	//   28   66:ifnull          151
	//   29   69:aload_2         
	//   30   70:getfield        #768 <Field String APSMediaUnit.url>
	//   31   73:ifnonnull       151
_L1:
		boolean flag;
		obj = ((Object) (_overlaysDisplayed.iterator()));
	//   32   76:aload_0         
	//   33   77:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   34   80:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   35   83:astore_2        
		flag = false;
	//   36   84:iconst_0        
	//   37   85:istore_1        
_L5:
		APSMediaOverlay apsmediaoverlay;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_139;
	//   38   86:aload_2         
	//   39   87:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   40   92:ifeq            139
		apsmediaoverlay = (APSMediaOverlay)((Iterator) (obj)).next();
	//   41   95:aload_2         
	//   42   96:invokeinterface #365 <Method Object Iterator.next()>
	//   43  101:checkcast       #426 <Class APSMediaOverlay>
	//   44  104:astore_3        
		((Object) (apsmediaoverlay.controller)).getClass().getMethod("play", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//   45  105:aload_3         
	//   46  106:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   47  109:invokevirtual   #1070 <Method Class Object.getClass()>
	//   48  112:ldc2            #1589 <String "play">
	//   49  115:iconst_0        
	//   50  116:anewarray       Class[]
	//   51  119:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   52  122:aload_3         
	//   53  123:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   54  126:iconst_0        
	//   55  127:anewarray       Object[]
	//   56  130:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   57  133:pop             
		flag = true;
	//   58  134:iconst_1        
	//   59  135:istore_1        
		continue; /* Loop/switch isn't completed */
	//   60  136:goto            86
		if(!flag)
	//*  61  139:iload_1         
	//*  62  140:ifne            192
		{
			unitFinished(MPMovieFinishReason.MPMovieFinishReasonNone);
	//   63  143:aload_0         
	//   64  144:getstatic       #978 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonNone>
	//   65  147:invokevirtual   #982 <Method void unitFinished(APSMediaPlayer$MPMovieFinishReason)>
			return;
	//   66  150:return          
		}
		  goto _L3
_L2:
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//   67  151:aload_0         
	//   68  152:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   69  155:astore_2        
		if(iveeplayrenderer != null)
	//*  70  156:aload_2         
	//*  71  157:ifnull          192
		{
			if(iveeplayrenderer.resumePlay())
	//*  72  160:aload_2         
	//*  73  161:invokeinterface #1727 <Method boolean IVeeplayRenderer.resumePlay()>
	//*  74  166:ifeq            187
			{
				_playbackState = MPMoviePlaybackState.MPMoviePlaybackPlaying;
	//   75  169:aload_0         
	//   76  170:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   77  173:putfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
				playbackStateChanged(MPMoviePlaybackState.MPMoviePlaybackPlaying, _paused);
	//   78  176:aload_0         
	//   79  177:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   80  180:aload_0         
	//   81  181:getfield        #185 <Field boolean _paused>
	//   82  184:invokevirtual   #1674 <Method void playbackStateChanged(APSMediaPlayer$MPMoviePlaybackState, boolean)>
			}
			_paused = false;
	//   83  187:aload_0         
	//   84  188:iconst_0        
	//   85  189:putfield        #185 <Field boolean _paused>
		}
_L3:
		return;
	//   86  192:return          
		Exception exception;
		exception;
	//   87  193:astore_3        
		if(true) goto _L5; else goto _L4
_L4:
	//*  88  194:goto            86
	}

	public void playAlreadySetMediaUnits()
	{
		if(!isProcessing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field boolean isProcessing>
	//*   2    4:ifne            11
			processQueue();
	//    3    7:aload_0         
	//    4    8:invokespecial   #320 <Method void processQueue()>
	//    5   11:return          
	}

	public void playMediaUnits(ArrayList arraylist)
	{
		boolean flag;
		if(arraylist == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		_mediaUnits.addAll(((java.util.Collection) (arraylist)));
	//    3    5:aload_0         
	//    4    6:getfield        #235 <Field ArrayList _mediaUnits>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #412 <Method boolean ArrayList.addAll(java.util.Collection)>
	//    7   13:pop             
		flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		arraylist = ((ArrayList) (arraylist.iterator()));
	//   10   16:aload_1         
	//   11   17:invokevirtual   #677 <Method Iterator ArrayList.iterator()>
	//   12   20:astore_1        
		do
		{
label0:
			{
				Object obj;
				do
				{
					if(!((Iterator) (arraylist)).hasNext())
						break label0;
	//   13   21:aload_1         
	//   14   22:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   15   27:ifeq            121
					obj = ((Object) ((APSMediaEvent)((Iterator) (arraylist)).next()));
	//   16   30:aload_1         
	//   17   31:invokeinterface #365 <Method Object Iterator.next()>
	//   18   36:checkcast       #421 <Class APSMediaEvent>
	//   19   39:astore          4
				} while(!(obj instanceof APSMediaUnit));
	//   20   41:aload           4
	//   21   43:instanceof      #342 <Class APSMediaUnit>
	//   22   46:ifeq            21
				obj = ((Object) (((APSMediaUnit)obj).overlays().iterator()));
	//   23   49:aload           4
	//   24   51:checkcast       #342 <Class APSMediaUnit>
	//   25   54:invokevirtual   #771 <Method ArrayList APSMediaUnit.overlays()>
	//   26   57:invokevirtual   #677 <Method Iterator ArrayList.iterator()>
	//   27   60:astore          4
				boolean flag1 = flag;
	//   28   62:iload_2         
	//   29   63:istore_3        
				do
				{
					flag = flag1;
	//   30   64:iload_3         
	//   31   65:istore_2        
					if(!((Iterator) (obj)).hasNext())
						break;
	//   32   66:aload           4
	//   33   68:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   34   73:ifeq            21
					APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)((Iterator) (obj)).next();
	//   35   76:aload           4
	//   36   78:invokeinterface #365 <Method Object Iterator.next()>
	//   37   83:checkcast       #426 <Class APSMediaOverlay>
	//   38   86:astore          5
					if(apsmediaoverlay.type.equals("com.appscend.mp.overlays.youtube") || apsmediaoverlay.type.equals("com.appscend.mp.overlays.vimeo"))
	//*  39   88:aload           5
	//*  40   90:getfield        #899 <Field String APSMediaOverlay.type>
	//*  41   93:ldc2            #500 <String "com.appscend.mp.overlays.youtube">
	//*  42   96:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  43   99:ifne            116
	//*  44  102:aload           5
	//*  45  104:getfield        #899 <Field String APSMediaOverlay.type>
	//*  46  107:ldc2            #504 <String "com.appscend.mp.overlays.vimeo">
	//*  47  110:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  48  113:ifeq            64
						flag1 = true;
	//   49  116:iconst_1        
	//   50  117:istore_3        
				} while(true);
	//   51  118:goto            64
			}
		} while(true);
		if(flag)
	//*  52  121:iload_2         
	//*  53  122:ifeq            149
		{
			arraylist = ((ArrayList) (new Intent(((android.content.Context) (activity)), com/appscend/utilities/VeeplayFullscreenActivity)));
	//   54  125:new             #858 <Class Intent>
	//   55  128:dup             
	//   56  129:aload_0         
	//   57  130:getfield        #312 <Field Activity activity>
	//   58  133:ldc2            #1732 <Class VeeplayFullscreenActivity>
	//   59  136:invokespecial   #1658 <Method void Intent(android.content.Context, Class)>
	//   60  139:astore_1        
			activity.startActivity(((Intent) (arraylist)));
	//   61  140:aload_0         
	//   62  141:getfield        #312 <Field Activity activity>
	//   63  144:aload_1         
	//   64  145:invokevirtual   #1736 <Method void Activity.startActivity(Intent)>
			return;
	//   65  148:return          
		}
		if(!isProcessing)
	//*  66  149:aload_0         
	//*  67  150:getfield        #256 <Field boolean isProcessing>
	//*  68  153:ifne            160
			processQueue();
	//   69  156:aload_0         
	//   70  157:invokespecial   #320 <Method void processQueue()>
		return;
	//   71  160:return          
	}

	public void playVideo(String s)
	{
		if(_renderer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*   2    4:ifnull          28
		{
			playbackStateChanged(MPMoviePlaybackState.MPMoviePlaybackPlaying, _paused);
	//    3    7:aload_0         
	//    4    8:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//    5   11:aload_0         
	//    6   12:getfield        #185 <Field boolean _paused>
	//    7   15:invokevirtual   #1674 <Method void playbackStateChanged(APSMediaPlayer$MPMoviePlaybackState, boolean)>
			_renderer.playVideo(s);
	//    8   18:aload_0         
	//    9   19:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   10   22:aload_1         
	//   11   23:invokeinterface #1740 <Method void IVeeplayRenderer.playVideo(String)>
		}
	//   12   28:return          
	}

	public int playableDuration(int i)
	{
		Object obj;
		obj = ((Object) (_currentUnit));
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_3        
		if(obj != null && ((APSMediaUnit) (obj)).url != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          21
	//*   5    9:aload_3         
	//*   6   10:getfield        #768 <Field String APSMediaUnit.url>
	//*   7   13:ifnull          21
			return _playableDuration;
	//    8   16:aload_0         
	//    9   17:getfield        #201 <Field int _playableDuration>
	//   10   20:ireturn         
		obj = ((Object) (_overlaysDisplayed.iterator()));
	//   11   21:aload_0         
	//   12   22:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   13   25:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   14   28:astore_3        
_L2:
		APSMediaOverlay apsmediaoverlay;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_90;
	//   15   29:aload_3         
	//   16   30:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   17   35:ifeq            90
		apsmediaoverlay = (APSMediaOverlay)((Iterator) (obj)).next();
	//   18   38:aload_3         
	//   19   39:invokeinterface #365 <Method Object Iterator.next()>
	//   20   44:checkcast       #426 <Class APSMediaOverlay>
	//   21   47:astore          4
		int j = ((Integer)((Object) (apsmediaoverlay.controller)).getClass().getMethod("playableDuration", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0])).intValue();
	//   22   49:aload           4
	//   23   51:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   24   54:invokevirtual   #1070 <Method Class Object.getClass()>
	//   25   57:ldc2            #1742 <String "playableDuration">
	//   26   60:iconst_0        
	//   27   61:anewarray       Class[]
	//   28   64:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   29   67:aload           4
	//   30   69:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   31   72:iconst_0        
	//   32   73:anewarray       Object[]
	//   33   76:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   34   79:checkcast       #444 <Class Integer>
	//   35   82:invokevirtual   #567 <Method int Integer.intValue()>
	//   36   85:istore_2        
		return i * j;
	//   37   86:iload_1         
	//   38   87:iload_2         
	//   39   88:imul            
	//   40   89:ireturn         
		return 0;
	//   41   90:iconst_0        
	//   42   91:ireturn         
		Exception exception;
		exception;
	//   43   92:astore          4
		if(true) goto _L2; else goto _L1
	//   44   94:goto            29
_L1:
	}

	public MPMoviePlaybackState playbackState()
	{
		Object obj;
		obj = ((Object) (_currentUnit));
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_1        
		if(obj != null && ((APSMediaUnit) (obj)).url != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:getfield        #768 <Field String APSMediaUnit.url>
	//*   7   13:ifnull          21
			return _playbackState;
	//    8   16:aload_0         
	//    9   17:getfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
	//   10   20:areturn         
		obj = ((Object) (_overlaysDisplayed.iterator()));
	//   11   21:aload_0         
	//   12   22:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//   13   25:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   14   28:astore_1        
_L2:
		Object obj1;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_82;
	//   15   29:aload_1         
	//   16   30:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   17   35:ifeq            82
		obj1 = ((Object) ((APSMediaOverlay)((Iterator) (obj)).next()));
	//   18   38:aload_1         
	//   19   39:invokeinterface #365 <Method Object Iterator.next()>
	//   20   44:checkcast       #426 <Class APSMediaOverlay>
	//   21   47:astore_2        
		obj1 = ((Object) ((MPMoviePlaybackState)((Object) (((APSMediaOverlay) (obj1)).controller)).getClass().getMethod("playbackState", new Class[0]).invoke(((Object) (((APSMediaOverlay) (obj1)).controller)), new Object[0])));
	//   22   48:aload_2         
	//   23   49:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   24   52:invokevirtual   #1070 <Method Class Object.getClass()>
	//   25   55:ldc2            #1743 <String "playbackState">
	//   26   58:iconst_0        
	//   27   59:anewarray       Class[]
	//   28   62:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   29   65:aload_2         
	//   30   66:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   31   69:iconst_0        
	//   32   70:anewarray       Object[]
	//   33   73:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   34   76:checkcast       #60  <Class APSMediaPlayer$MPMoviePlaybackState>
	//   35   79:astore_2        
		return ((MPMoviePlaybackState) (obj1));
	//   36   80:aload_2         
	//   37   81:areturn         
		return MPMoviePlaybackState.MPMoviePlaybackStopped;
	//   38   82:getstatic       #204 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//   39   85:areturn         
		Exception exception;
		exception;
	//   40   86:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  41   87:goto            29
	}

	public void playbackStateChanged(MPMoviePlaybackState mpmovieplaybackstate, boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #569 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #570 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("playback state changed");
	//    4    8:aload_3         
	//    5    9:ldc2            #1745 <String "playback state changed">
	//    6   12:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mpmovieplaybackstate.toString());
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1746 <Method String APSMediaPlayer$MPMoviePlaybackState.toString()>
	//   11   21:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		log(stringbuilder.toString());
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   16   30:invokevirtual   #587 <Method void log(String)>
		emitEvent(new ArrayList(), "com.appscend.mp.notifications.statuschanged", APSMediaTrackingEvents.MediaEventType.PLAYBACK_STATE_CHANGED, new Bundle(), ((APSMediaEvent) (_currentUnit)));
	//   17   33:aload_0         
	//   18   34:new             #232 <Class ArrayList>
	//   19   37:dup             
	//   20   38:invokespecial   #233 <Method void ArrayList()>
	//   21   41:ldc1            #80  <String "com.appscend.mp.notifications.statuschanged">
	//   22   43:getstatic       #1749 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.PLAYBACK_STATE_CHANGED>
	//   23   46:new             #748 <Class Bundle>
	//   24   49:dup             
	//   25   50:invokespecial   #749 <Method void Bundle()>
	//   26   53:aload_0         
	//   27   54:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   28   57:invokevirtual   #753 <Method void emitEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, Bundle, APSMediaEvent)>
		_playbackState = mpmovieplaybackstate;
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:putfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
		if(flag && _currentUnit != null)
	//*  32   65:iload_2         
	//*  33   66:ifeq            327
	//*  34   69:aload_0         
	//*  35   70:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*  36   73:ifnull          327
			switch(_cls20..SwitchMap.com.appscend.media.APSMediaPlayer.MPMoviePlaybackState[mpmovieplaybackstate.ordinal()])
	//*  37   76:getstatic       #605 <Field int[] APSMediaPlayer$20.$SwitchMap$com$appscend$media$APSMediaPlayer$MPMoviePlaybackState>
	//*  38   79:aload_1         
	//*  39   80:invokevirtual   #608 <Method int APSMediaPlayer$MPMoviePlaybackState.ordinal()>
	//*  40   83:iaload          
			{
			default:
				break;

	//*  41   84:tableswitch     1 5: default 120
	//	               1 313
	//	               2 270
	//	               3 237
	//	               4 180
	//	               5 123
	//*  42  120:goto            327
			case 5: // '\005'
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("forward"), "forward", APSMediaTrackingEvents.MediaEventType.FORWARD, ((APSMediaEvent) (_currentUnit)));
	//   43  123:aload_0         
	//   44  124:aload_0         
	//   45  125:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   46  128:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   47  131:ldc2            #1751 <String "forward">
	//   48  134:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   49  137:checkcast       #232 <Class ArrayList>
	//   50  140:ldc2            #1751 <String "forward">
	//   51  143:getstatic       #1754 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.FORWARD>
	//   52  146:aload_0         
	//   53  147:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   54  150:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
				if(_paused)
	//*  55  153:aload_0         
	//*  56  154:getfield        #185 <Field boolean _paused>
	//*  57  157:ifeq            170
					_playbackState = MPMoviePlaybackState.MPMoviePlaybackPaused;
	//   58  160:aload_0         
	//   59  161:getstatic       #1670 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
	//   60  164:putfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
				else
	//*  61  167:goto            327
					_playbackState = MPMoviePlaybackState.MPMoviePlaybackPlaying;
	//   62  170:aload_0         
	//   63  171:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   64  174:putfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
				break;
	//   65  177:goto            327

			case 4: // '\004'
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("rewind"), "rewind", APSMediaTrackingEvents.MediaEventType.REWIND, ((APSMediaEvent) (_currentUnit)));
	//   66  180:aload_0         
	//   67  181:aload_0         
	//   68  182:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   69  185:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   70  188:ldc2            #1756 <String "rewind">
	//   71  191:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   72  194:checkcast       #232 <Class ArrayList>
	//   73  197:ldc2            #1756 <String "rewind">
	//   74  200:getstatic       #1759 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.REWIND>
	//   75  203:aload_0         
	//   76  204:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   77  207:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
				if(_paused)
	//*  78  210:aload_0         
	//*  79  211:getfield        #185 <Field boolean _paused>
	//*  80  214:ifeq            227
					_playbackState = MPMoviePlaybackState.MPMoviePlaybackPaused;
	//   81  217:aload_0         
	//   82  218:getstatic       #1670 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
	//   83  221:putfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
				else
	//*  84  224:goto            327
					_playbackState = MPMoviePlaybackState.MPMoviePlaybackPlaying;
	//   85  227:aload_0         
	//   86  228:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   87  231:putfield        #206 <Field APSMediaPlayer$MPMoviePlaybackState _playbackState>
				break;

	//*  88  234:goto            327
			case 3: // '\003'
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("pause"), "pause", APSMediaTrackingEvents.MediaEventType.PAUSE, ((APSMediaEvent) (_currentUnit)));
	//   89  237:aload_0         
	//   90  238:aload_0         
	//   91  239:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   92  242:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   93  245:ldc2            #1599 <String "pause">
	//   94  248:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   95  251:checkcast       #232 <Class ArrayList>
	//   96  254:ldc2            #1599 <String "pause">
	//   97  257:getstatic       #1762 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.PAUSE>
	//   98  260:aload_0         
	//   99  261:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  100  264:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
				break;

	//* 101  267:goto            327
			case 2: // '\002'
				_durationAvailable = false;
	//  102  270:aload_0         
	//  103  271:iconst_0        
	//  104  272:putfield        #208 <Field boolean _durationAvailable>
				isSeeking = false;
	//  105  275:aload_0         
	//  106  276:iconst_0        
	//  107  277:putfield        #189 <Field boolean isSeeking>
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("resume"), "resume", APSMediaTrackingEvents.MediaEventType.RESUME, ((APSMediaEvent) (_currentUnit)));
	//  108  280:aload_0         
	//  109  281:aload_0         
	//  110  282:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  111  285:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//  112  288:ldc2            #1764 <String "resume">
	//  113  291:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//  114  294:checkcast       #232 <Class ArrayList>
	//  115  297:ldc2            #1764 <String "resume">
	//  116  300:getstatic       #1767 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.RESUME>
	//  117  303:aload_0         
	//  118  304:getfield        #615 <Field APSMediaUnit _currentUnit>
	//  119  307:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
				break;

	//* 120  310:goto            327
			case 1: // '\001'
				_durationAvailable = false;
	//  121  313:aload_0         
	//  122  314:iconst_0        
	//  123  315:putfield        #208 <Field boolean _durationAvailable>
				isSeeking = false;
	//  124  318:aload_0         
	//  125  319:iconst_0        
	//  126  320:putfield        #189 <Field boolean isSeeking>
				hideHud();
	//  127  323:aload_0         
	//  128  324:invokevirtual   #1769 <Method void hideHud()>
				break;
			}
		if(isBackgroundServiceStarted())
	//* 129  327:aload_0         
	//* 130  328:invokevirtual   #1771 <Method boolean isBackgroundServiceStarted()>
	//* 131  331:ifeq            338
			startBackgroundService();
	//  132  334:aload_0         
	//  133  335:invokevirtual   #1774 <Method void startBackgroundService()>
	//  134  338:return          
	}

	public IVeeplayRenderer player()
	{
		return _renderer;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:areturn         
	}

	public void playerTapped()
	{
		try
		{
			LocalBroadcastManager.getInstance(((android.content.Context) (activity))).sendBroadcast(new Intent("com.appscend.mp.notifications.playertapped"));
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field Activity activity>
	//    2    4:invokestatic    #856 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//    3    7:new             #858 <Class Intent>
	//    4   10:dup             
	//    5   11:ldc1            #86  <String "com.appscend.mp.notifications.playertapped">
	//    6   13:invokespecial   #859 <Method void Intent(String)>
	//    7   16:invokevirtual   #863 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//    8   19:pop             
			return;
	//    9   20:return          
		}
		catch(Exception exception)
	//*  10   21:astore_1        
		{
			return;
	//   11   22:return          
		}
	}

	public void positionOverlay(APSMediaOverlay apsmediaoverlay)
	{
		float f1;
		float f;
		float f2;
		int i;
		int j;
		Object obj;
		View view;
		try
		{
			obj = ((Object) (((Object) (apsmediaoverlay.controller)).getClass()));
	//    0    0:aload_1         
	//    1    1:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//    2    4:invokevirtual   #1070 <Method Class Object.getClass()>
	//    3    7:astore          7
		}
	//*   4    9:iconst_0        
	//*   5   10:istore          5
	//*   6   12:aload           7
	//*   7   14:ldc2            #1779 <String "getView">
	//*   8   17:iconst_0        
	//*   9   18:anewarray       Class[]
	//*  10   21:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//*  11   24:aload_1         
	//*  12   25:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//*  13   28:iconst_0        
	//*  14   29:anewarray       Object[]
	//*  15   32:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//*  16   35:checkcast       #1781 <Class View>
	//*  17   38:astore          8
	//*  18   40:ldc2            #883 <Float -1F>
	//*  19   43:fstore_2        
	//*  20   44:aload_1         
	//*  21   45:getfield        #1003 <Field String APSMediaOverlay.width>
	//*  22   48:ldc2            #432 <String "%">
	//*  23   51:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//*  24   54:ifeq            86
	//*  25   57:aload_1         
	//*  26   58:getfield        #1003 <Field String APSMediaOverlay.width>
	//*  27   61:ldc2            #432 <String "%">
	//*  28   64:ldc2            #438 <String "">
	//*  29   67:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//*  30   70:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//*  31   73:f2i             
	//*  32   74:invokestatic    #1790 <Method int VPUtilities.getWidth()>
	//*  33   77:imul            
	//*  34   78:bipush          100
	//*  35   80:idiv            
	//*  36   81:istore          5
	//*  37   83:goto            128
	//*  38   86:aload_1         
	//*  39   87:getfield        #1003 <Field String APSMediaOverlay.width>
	//*  40   90:ldc2            #1792 <String "h">
	//*  41   93:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//*  42   96:ifeq            119
	//*  43   99:aload_1         
	//*  44  100:getfield        #1003 <Field String APSMediaOverlay.width>
	//*  45  103:ldc2            #1792 <String "h">
	//*  46  106:ldc2            #438 <String "">
	//*  47  109:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//*  48  112:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//*  49  115:fstore_2        
	//*  50  116:goto            128
	//*  51  119:aload_1         
	//*  52  120:getfield        #1003 <Field String APSMediaOverlay.width>
	//*  53  123:invokestatic    #447 <Method int Integer.parseInt(String)>
	//*  54  126:istore          5
	//*  55  128:aload_1         
	//*  56  129:getfield        #1008 <Field String APSMediaOverlay.height>
	//*  57  132:ldc2            #432 <String "%">
	//*  58  135:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//*  59  138:ifeq            170
	//*  60  141:aload_1         
	//*  61  142:getfield        #1008 <Field String APSMediaOverlay.height>
	//*  62  145:ldc2            #432 <String "%">
	//*  63  148:ldc2            #438 <String "">
	//*  64  151:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//*  65  154:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//*  66  157:f2i             
	//*  67  158:invokestatic    #1795 <Method int VPUtilities.getHeight()>
	//*  68  161:imul            
	//*  69  162:bipush          100
	//*  70  164:idiv            
	//*  71  165:istore          6
	//*  72  167:goto            222
	//*  73  170:aload_1         
	//*  74  171:getfield        #1008 <Field String APSMediaOverlay.height>
	//*  75  174:ldc2            #1797 <String "w">
	//*  76  177:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//*  77  180:ifeq            213
	//*  78  183:iload           5
	//*  79  185:i2f             
	//*  80  186:aload_1         
	//*  81  187:getfield        #1008 <Field String APSMediaOverlay.height>
	//*  82  190:ldc2            #1797 <String "w">
	//*  83  193:ldc2            #438 <String "">
	//*  84  196:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//*  85  199:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//*  86  202:fmul            
	//*  87  203:f2d             
	//*  88  204:invokestatic    #457 <Method double Math.floor(double)>
	//*  89  207:d2i             
	//*  90  208:istore          6
	//*  91  210:goto            222
	//*  92  213:aload_1         
	//*  93  214:getfield        #1008 <Field String APSMediaOverlay.height>
	//*  94  217:invokestatic    #447 <Method int Integer.parseInt(String)>
	//*  95  220:istore          6
	//*  96  222:fconst_0        
	//*  97  223:fstore          4
	//*  98  225:fload_2         
	//*  99  226:fconst_0        
	//* 100  227:fcmpl           
	//* 101  228:ifle            243
	//* 102  231:fload_2         
	//* 103  232:iload           6
	//* 104  234:i2f             
	//* 105  235:fmul            
	//* 106  236:f2d             
	//* 107  237:invokestatic    #457 <Method double Math.floor(double)>
	//* 108  240:d2i             
	//* 109  241:istore          5
	//* 110  243:aload_1         
	//* 111  244:getfield        #1800 <Field String APSMediaOverlay.absoluteOffsetY>
	//* 112  247:ifnull          711
	//* 113  250:aload_1         
	//* 114  251:getfield        #1800 <Field String APSMediaOverlay.absoluteOffsetY>
	//* 115  254:ldc2            #432 <String "%">
	//* 116  257:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//* 117  260:ifeq            292
	//* 118  263:invokestatic    #1795 <Method int VPUtilities.getHeight()>
	//* 119  266:i2f             
	//* 120  267:aload_1         
	//* 121  268:getfield        #1800 <Field String APSMediaOverlay.absoluteOffsetY>
	//* 122  271:ldc2            #432 <String "%">
	//* 123  274:ldc2            #438 <String "">
	//* 124  277:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//* 125  280:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//* 126  283:fmul            
	//* 127  284:ldc2            #1801 <Float 100F>
	//* 128  287:fdiv            
	//* 129  288:fstore_3        
	//* 130  289:goto            303
	//* 131  292:aload_1         
	//* 132  293:getfield        #1800 <Field String APSMediaOverlay.absoluteOffsetY>
	//* 133  296:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//* 134  299:fstore_3        
	//* 135  300:goto            303
	//* 136  303:fload           4
	//* 137  305:fstore_2        
	//* 138  306:aload_1         
	//* 139  307:getfield        #1804 <Field String APSMediaOverlay.absoluteOffsetX>
	//* 140  310:ifnull          406
	//* 141  313:aload_1         
	//* 142  314:getfield        #1804 <Field String APSMediaOverlay.absoluteOffsetX>
	//* 143  317:ldc2            #432 <String "%">
	//* 144  320:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//* 145  323:ifeq            355
	//* 146  326:invokestatic    #1790 <Method int VPUtilities.getWidth()>
	//* 147  329:i2f             
	//* 148  330:aload_1         
	//* 149  331:getfield        #1804 <Field String APSMediaOverlay.absoluteOffsetX>
	//* 150  334:ldc2            #432 <String "%">
	//* 151  337:ldc2            #438 <String "">
	//* 152  340:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//* 153  343:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//* 154  346:fmul            
	//* 155  347:ldc2            #1801 <Float 100F>
	//* 156  350:fdiv            
	//* 157  351:fstore_2        
	//* 158  352:goto            406
	//* 159  355:aload_1         
	//* 160  356:getfield        #1804 <Field String APSMediaOverlay.absoluteOffsetX>
	//* 161  359:ldc2            #1792 <String "h">
	//* 162  362:invokevirtual   #436 <Method boolean String.contains(CharSequence)>
	//* 163  365:ifeq            398
	//* 164  368:iload           6
	//* 165  370:i2f             
	//* 166  371:aload_1         
	//* 167  372:getfield        #1804 <Field String APSMediaOverlay.absoluteOffsetX>
	//* 168  375:ldc2            #1792 <String "h">
	//* 169  378:ldc2            #438 <String "">
	//* 170  381:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//* 171  384:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//* 172  387:fmul            
	//* 173  388:f2d             
	//* 174  389:invokestatic    #457 <Method double Math.floor(double)>
	//* 175  392:d2i             
	//* 176  393:i2f             
	//* 177  394:fstore_2        
	//* 178  395:goto            406
	//* 179  398:aload_1         
	//* 180  399:getfield        #1804 <Field String APSMediaOverlay.absoluteOffsetX>
	//* 181  402:invokestatic    #1787 <Method float Float.parseFloat(String)>
	//* 182  405:fstore_2        
	//* 183  406:new             #1400 <Class android.widget.RelativeLayout$LayoutParams>
	//* 184  409:dup             
	//* 185  410:iload           5
	//* 186  412:i2d             
	//* 187  413:ldc2w           #1805 <Double 1.3D>
	//* 188  416:dmul            
	//* 189  417:d2i             
	//* 190  418:aload_0         
	//* 191  419:getfield        #312 <Field Activity activity>
	//* 192  422:invokestatic    #1810 <Method int VPUtilities.pixelsToDip(int, android.content.Context)>
	//* 193  425:iload           6
	//* 194  427:i2d             
	//* 195  428:ldc2w           #1805 <Double 1.3D>
	//* 196  431:dmul            
	//* 197  432:d2i             
	//* 198  433:aload_0         
	//* 199  434:getfield        #312 <Field Activity activity>
	//* 200  437:invokestatic    #1810 <Method int VPUtilities.pixelsToDip(int, android.content.Context)>
	//* 201  440:invokespecial   #1403 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 202  443:astore          7
	//* 203  445:getstatic       #1813 <Field int[] APSMediaPlayer$20.$SwitchMap$com$appscend$media$events$APSMediaOverlay$APSMediaOverlayPosition>
	//* 204  448:aload_1         
	//* 205  449:getfield        #1023 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
	//* 206  452:invokevirtual   #1814 <Method int com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.ordinal()>
	//* 207  455:iaload          
	//* 208  456:tableswitch     1 6: default 716
	//	               1 580
	//	               2 563
	//	               3 553
	//	               4 543
	//	               5 526
	//	               6 499
	//* 209  496:goto            597
	//* 210  499:aload           7
	//* 211  501:bipush          12
	//* 212  503:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 213  506:aload           7
	//* 214  508:bipush          14
	//* 215  510:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 216  513:aload           7
	//* 217  515:fload_3         
	//* 218  516:f2i             
	//* 219  517:invokestatic    #1817 <Method int VPUtilities.iPhoneYToAndroid(int)>
	//* 220  520:putfield        #1820 <Field int android.widget.RelativeLayout$LayoutParams.bottomMargin>
	//* 221  523:goto            608
	//* 222  526:aload           7
	//* 223  528:bipush          10
	//* 224  530:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 225  533:aload           7
	//* 226  535:bipush          14
	//* 227  537:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 228  540:goto            608
	//* 229  543:aload           7
	//* 230  545:bipush          11
	//* 231  547:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 232  550:goto            608
	//* 233  553:aload           7
	//* 234  555:bipush          9
	//* 235  557:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 236  560:goto            608
	//* 237  563:aload           7
	//* 238  565:bipush          12
	//* 239  567:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 240  570:aload           7
	//* 241  572:bipush          11
	//* 242  574:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 243  577:goto            608
	//* 244  580:aload           7
	//* 245  582:bipush          12
	//* 246  584:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 247  587:aload           7
	//* 248  589:bipush          9
	//* 249  591:invokevirtual   #1406 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 250  594:goto            608
	//* 251  597:new             #1400 <Class android.widget.RelativeLayout$LayoutParams>
	//* 252  600:dup             
	//* 253  601:iconst_m1       
	//* 254  602:iconst_m1       
	//* 255  603:invokespecial   #1403 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 256  606:astore          7
	//* 257  608:aload           7
	//* 258  610:fload_3         
	//* 259  611:f2i             
	//* 260  612:invokestatic    #1817 <Method int VPUtilities.iPhoneYToAndroid(int)>
	//* 261  615:putfield        #1823 <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
	//* 262  618:aload           7
	//* 263  620:fload_2         
	//* 264  621:f2i             
	//* 265  622:invokestatic    #1826 <Method int VPUtilities.iPhoneXToAndroid(int)>
	//* 266  625:putfield        #1829 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
	//* 267  628:aload_1         
	//* 268  629:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//* 269  632:instanceof      #490 <Class APSMediaPlayerControlsOverlayController>
	//* 270  635:ifeq            701
	//* 271  638:new             #1400 <Class android.widget.RelativeLayout$LayoutParams>
	//* 272  641:dup             
	//* 273  642:iconst_m1       
	//* 274  643:iconst_m1       
	//* 275  644:invokespecial   #1403 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 276  647:astore_1        
	//* 277  648:aload_0         
	//* 278  649:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 279  652:getfield        #814 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
	//* 280  655:getstatic       #1832 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayTop>
	//* 281  658:if_acmpne       672
	//* 282  661:aload_1         
	//* 283  662:iconst_3        
	//* 284  663:getstatic       #1837 <Field int com.appscend.vastplayer.R$id.controlsoverlay>
	//* 285  666:invokevirtual   #1839 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
	//* 286  669:goto            693
	//* 287  672:aload_0         
	//* 288  673:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 289  676:getfield        #814 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
	//* 290  679:getstatic       #1011 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayBottom>
	//* 291  682:if_acmpne       693
	//* 292  685:aload_1         
	//* 293  686:iconst_2        
	//* 294  687:getstatic       #1837 <Field int com.appscend.vastplayer.R$id.controlsoverlay>
	//* 295  690:invokevirtual   #1839 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
	//* 296  693:aload_0         
	//* 297  694:getfield        #329 <Field RelativeLayout _overlayContainer>
	//* 298  697:aload_1         
	//* 299  698:invokevirtual   #1410 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 300  701:aload           8
	//* 301  703:aload           7
	//* 302  705:invokevirtual   #1840 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 303  708:return          
		// Misplaced declaration of an exception variable
		catch(APSMediaOverlay apsmediaoverlay)
	//* 304  709:astore_1        
		{
			return;
	//  305  710:return          
		}
		i = 0;
		view = (View)((Class) (obj)).getMethod("getView", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
		f = -1F;
		if(apsmediaoverlay.width.contains("%"))
		{
			i = ((int)Float.parseFloat(apsmediaoverlay.width.replace("%", "")) * VPUtilities.getWidth()) / 100;
			break MISSING_BLOCK_LABEL_128;
		}
		if(apsmediaoverlay.width.contains("h"))
		{
			f = Float.parseFloat(apsmediaoverlay.width.replace("h", ""));
			break MISSING_BLOCK_LABEL_128;
		}
		i = Integer.parseInt(apsmediaoverlay.width);
		if(apsmediaoverlay.height.contains("%"))
		{
			j = ((int)Float.parseFloat(apsmediaoverlay.height.replace("%", "")) * VPUtilities.getHeight()) / 100;
			break MISSING_BLOCK_LABEL_222;
		}
		if(apsmediaoverlay.height.contains("w"))
		{
			j = (int)Math.floor((float)i * Float.parseFloat(apsmediaoverlay.height.replace("w", "")));
			break MISSING_BLOCK_LABEL_222;
		}
		j = Integer.parseInt(apsmediaoverlay.height);
		f2 = 0.0F;
		if(f <= 0.0F)
			break MISSING_BLOCK_LABEL_243;
		i = (int)Math.floor(f * (float)j);
		if(apsmediaoverlay.absoluteOffsetY == null) goto _L2; else goto _L1
_L1:
		if(!apsmediaoverlay.absoluteOffsetY.contains("%")) goto _L4; else goto _L3
_L3:
		f1 = ((float)VPUtilities.getHeight() * Float.parseFloat(apsmediaoverlay.absoluteOffsetY.replace("%", ""))) / 100F;
		  goto _L5
_L4:
		f1 = Float.parseFloat(apsmediaoverlay.absoluteOffsetY);
_L5:
		f = f2;
		if(apsmediaoverlay.absoluteOffsetX == null)
			break MISSING_BLOCK_LABEL_406;
		if(apsmediaoverlay.absoluteOffsetX.contains("%"))
		{
			f = ((float)VPUtilities.getWidth() * Float.parseFloat(apsmediaoverlay.absoluteOffsetX.replace("%", ""))) / 100F;
			break MISSING_BLOCK_LABEL_406;
		}
		if(apsmediaoverlay.absoluteOffsetX.contains("h"))
		{
			f = (int)Math.floor((float)j * Float.parseFloat(apsmediaoverlay.absoluteOffsetX.replace("h", "")));
			break MISSING_BLOCK_LABEL_406;
		}
		f = Float.parseFloat(apsmediaoverlay.absoluteOffsetX);
		obj = ((Object) (new android.widget.RelativeLayout.LayoutParams(VPUtilities.pixelsToDip((int)((double)i * 1.3D), ((android.content.Context) (activity))), VPUtilities.pixelsToDip((int)((double)j * 1.3D), ((android.content.Context) (activity))))));
		_cls20..SwitchMap.com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition[apsmediaoverlay.position.ordinal()];
		JVM INSTR tableswitch 1 6: default 716
	//	               1 580
	//	               2 563
	//	               3 553
	//	               4 543
	//	               5 526
	//	               6 499;
		   goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L12:
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(14);
		obj.bottomMargin = VPUtilities.iPhoneYToAndroid((int)f1);
		break; /* Loop/switch isn't completed */
_L11:
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(14);
		break; /* Loop/switch isn't completed */
_L10:
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
		break; /* Loop/switch isn't completed */
_L9:
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9);
		break; /* Loop/switch isn't completed */
_L8:
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
		break; /* Loop/switch isn't completed */
_L7:
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
		((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9);
		break; /* Loop/switch isn't completed */
_L6:
		obj = ((Object) (new android.widget.RelativeLayout.LayoutParams(-1, -1)));
		obj.topMargin = VPUtilities.iPhoneYToAndroid((int)f1);
		obj.leftMargin = VPUtilities.iPhoneXToAndroid((int)f);
		if(!(apsmediaoverlay.controller instanceof APSMediaPlayerControlsOverlayController))
			break MISSING_BLOCK_LABEL_701;
		apsmediaoverlay = ((APSMediaOverlay) (new android.widget.RelativeLayout.LayoutParams(-1, -1)));
		if(_currentUnit.controlsDisplay == com.appscend.media.events.APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayTop)
		{
			((android.widget.RelativeLayout.LayoutParams) (apsmediaoverlay)).addRule(3, com.appscend.vastplayer.R.id.controlsoverlay);
			break MISSING_BLOCK_LABEL_693;
		}
		if(_currentUnit.controlsDisplay == com.appscend.media.events.APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayBottom)
			((android.widget.RelativeLayout.LayoutParams) (apsmediaoverlay)).addRule(2, com.appscend.vastplayer.R.id.controlsoverlay);
		_overlayContainer.setLayoutParams(((android.view.ViewGroup.LayoutParams) (apsmediaoverlay)));
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
		return;
_L2:
		f1 = 0.0F;
	//  306  711:fconst_0        
	//  307  712:fstore_3        
		if(true) goto _L5; else goto _L13
	//  308  713:goto            303
_L13:
	//* 309  716:goto            496
	}

	public void processUnit(APSMediaUnit apsmediaunit)
	{
		if(apsmediaunit.url != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #768 <Field String APSMediaUnit.url>
	//*   2    4:ifnull          171
		{
			IVeeplayRenderer iveeplayrenderer = _renderer;
	//    3    7:aload_0         
	//    4    8:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    5   11:astore_2        
			if(iveeplayrenderer != null && iveeplayrenderer.getView() != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          171
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #926 <Method View IVeeplayRenderer.getView()>
	//*  10   22:ifnull          171
			{
				_renderer.getView().setVisibility(0);
	//   11   25:aload_0         
	//   12   26:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   13   29:invokeinterface #926 <Method View IVeeplayRenderer.getView()>
	//   14   34:iconst_0        
	//   15   35:invokevirtual   #1841 <Method void View.setVisibility(int)>
				if(_currentUnit.manager == null)
	//*  16   38:aload_0         
	//*  17   39:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*  18   42:getfield        #1844 <Field String APSMediaUnit.manager>
	//*  19   45:ifnonnull       88
				{
					_renderer.playVideo(apsmediaunit.url.replace(" ", "%20"), apsmediaunit.subtitlesUrl);
	//   20   48:aload_0         
	//   21   49:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   22   52:aload_1         
	//   23   53:getfield        #768 <Field String APSMediaUnit.url>
	//   24   56:ldc2            #1846 <String " ">
	//   25   59:ldc2            #1848 <String "%20">
	//   26   62:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//   27   65:aload_1         
	//   28   66:getfield        #1851 <Field String APSMediaUnit.subtitlesUrl>
	//   29   69:invokeinterface #1853 <Method void IVeeplayRenderer.playVideo(String, String)>
					playbackStateChanged(MPMoviePlaybackState.MPMoviePlaybackPlaying, _paused);
	//   30   74:aload_0         
	//   31   75:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   32   78:aload_0         
	//   33   79:getfield        #185 <Field boolean _paused>
	//   34   82:invokevirtual   #1674 <Method void playbackStateChanged(APSMediaPlayer$MPMoviePlaybackState, boolean)>
				} else
	//*  35   85:goto            171
				{
					Object obj = ((Object) (new StringBuilder()));
	//   36   88:new             #569 <Class StringBuilder>
	//   37   91:dup             
	//   38   92:invokespecial   #570 <Method void StringBuilder()>
	//   39   95:astore_2        
					((StringBuilder) (obj)).append("Unit Manager detected - ");
	//   40   96:aload_2         
	//   41   97:ldc2            #1855 <String "Unit Manager detected - ">
	//   42  100:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   43  103:pop             
					((StringBuilder) (obj)).append(apsmediaunit.manager);
	//   44  104:aload_2         
	//   45  105:aload_1         
	//   46  106:getfield        #1844 <Field String APSMediaUnit.manager>
	//   47  109:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   48  112:pop             
					log(((StringBuilder) (obj)).toString());
	//   49  113:aload_0         
	//   50  114:aload_2         
	//   51  115:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   52  118:invokevirtual   #587 <Method void log(String)>
					obj = ((Object) ((UnitManager)adapterForTypeInGroup(apsmediaunit.manager, "com.appscend.mp.drm")));
	//   53  121:aload_0         
	//   54  122:aload_1         
	//   55  123:getfield        #1844 <Field String APSMediaUnit.manager>
	//   56  126:ldc1            #93  <String "com.appscend.mp.drm">
	//   57  128:invokevirtual   #941 <Method Object adapterForTypeInGroup(String, String)>
	//   58  131:checkcast       #1857 <Class UnitManager>
	//   59  134:astore_2        
					if(obj != null)
	//*  60  135:aload_2         
	//*  61  136:ifnull          167
					{
						((UnitManager) (obj)).start(_currentUnit);
	//   62  139:aload_2         
	//   63  140:aload_0         
	//   64  141:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   65  144:invokeinterface #1859 <Method void UnitManager.start(APSMediaUnit)>
						showHud();
	//   66  149:aload_0         
	//   67  150:invokevirtual   #1862 <Method void showHud()>
						playbackStateChanged(MPMoviePlaybackState.MPMoviePlaybackPlaying, _paused);
	//   68  153:aload_0         
	//   69  154:getstatic       #1488 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   70  157:aload_0         
	//   71  158:getfield        #185 <Field boolean _paused>
	//   72  161:invokevirtual   #1674 <Method void playbackStateChanged(APSMediaPlayer$MPMoviePlaybackState, boolean)>
					} else
	//*  73  164:goto            171
					{
						processQueue();
	//   74  167:aload_0         
	//   75  168:invokespecial   #320 <Method void processQueue()>
					}
				}
			}
		}
		if(apsmediaunit.url == null)
	//*  76  171:aload_1         
	//*  77  172:getfield        #768 <Field String APSMediaUnit.url>
	//*  78  175:ifnonnull       279
		{
			IVeeplayRenderer iveeplayrenderer1 = _renderer;
	//   79  178:aload_0         
	//   80  179:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   81  182:astore_2        
			if(iveeplayrenderer1 != null && iveeplayrenderer1.getView() != null)
	//*  82  183:aload_2         
	//*  83  184:ifnull          279
	//*  84  187:aload_2         
	//*  85  188:invokeinterface #926 <Method View IVeeplayRenderer.getView()>
	//*  86  193:ifnull          279
			{
				if(apsmediaunit.events().size() == 0 && apsmediaunit.overlays().size() == 1)
	//*  87  196:aload_1         
	//*  88  197:invokevirtual   #799 <Method ArrayList APSMediaUnit.events()>
	//*  89  200:invokevirtual   #519 <Method int ArrayList.size()>
	//*  90  203:ifne            254
	//*  91  206:aload_1         
	//*  92  207:invokevirtual   #771 <Method ArrayList APSMediaUnit.overlays()>
	//*  93  210:invokevirtual   #519 <Method int ArrayList.size()>
	//*  94  213:iconst_1        
	//*  95  214:icmpne          254
				{
					if(((APSMediaOverlay)apsmediaunit.overlays().get(0)).type.equals("media-route-button"))
	//*  96  217:aload_1         
	//*  97  218:invokevirtual   #771 <Method ArrayList APSMediaUnit.overlays()>
	//*  98  221:iconst_0        
	//*  99  222:invokevirtual   #516 <Method Object ArrayList.get(int)>
	//* 100  225:checkcast       #426 <Class APSMediaOverlay>
	//* 101  228:getfield        #899 <Field String APSMediaOverlay.type>
	//* 102  231:ldc2            #901 <String "media-route-button">
	//* 103  234:invokevirtual   #380 <Method boolean String.equals(Object)>
	//* 104  237:ifeq            275
					{
						log("Rendering empty unit -- should skip");
	//  105  240:aload_0         
	//  106  241:ldc2            #1864 <String "Rendering empty unit -- should skip">
	//  107  244:invokevirtual   #587 <Method void log(String)>
						processQueue();
	//  108  247:aload_0         
	//  109  248:invokespecial   #320 <Method void processQueue()>
					}
				} else
	//* 110  251:goto            275
				{
					log("Rendering bumper");
	//  111  254:aload_0         
	//  112  255:ldc2            #1866 <String "Rendering bumper">
	//  113  258:invokevirtual   #587 <Method void log(String)>
					_renderer.getView().setVisibility(8);
	//  114  261:aload_0         
	//  115  262:getfield        #916 <Field IVeeplayRenderer _renderer>
	//  116  265:invokeinterface #926 <Method View IVeeplayRenderer.getView()>
	//  117  270:bipush          8
	//  118  272:invokevirtual   #1841 <Method void View.setVisibility(int)>
				}
				hideHud();
	//  119  275:aload_0         
	//  120  276:invokevirtual   #1769 <Method void hideHud()>
			}
		}
	//  121  279:return          
	}

	public void removeAllTrackingEventListeners()
	{
		eventListeners.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field CopyOnWriteArrayList eventListeners>
	//    2    4:invokevirtual   #636 <Method void CopyOnWriteArrayList.clear()>
	//    3    7:return          
	}

	public void removeMediaUnits(List list)
	{
		_mediaUnits.removeAll(((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ArrayList _mediaUnits>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1870 <Method boolean ArrayList.removeAll(java.util.Collection)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTrackingEventListener(APSMediaPlayerTrackingEventListener apsmediaplayertrackingeventlistener)
	{
		eventListeners.remove(((Object) (apsmediaplayertrackingeventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field CopyOnWriteArrayList eventListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #701 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void replaceCurrentUnitWithUnits(ArrayList arraylist)
	{
		int i = _nextPlaylistIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field int _nextPlaylistIndex>
	//    2    4:istore_2        
		if(i > 0)
	//*   3    5:iload_2         
	//*   4    6:ifle            33
		{
			_nextPlaylistIndex = i - 1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:putfield        #254 <Field int _nextPlaylistIndex>
			_mediaUnits.remove(_nextPlaylistIndex);
	//   10   16:aload_0         
	//   11   17:getfield        #235 <Field ArrayList _mediaUnits>
	//   12   20:aload_0         
	//   13   21:getfield        #254 <Field int _nextPlaylistIndex>
	//   14   24:invokevirtual   #1875 <Method Object ArrayList.remove(int)>
	//   15   27:pop             
			insertMediaUnits(arraylist);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #1877 <Method void insertMediaUnits(ArrayList)>
		}
	//   19   33:return          
	}

	public void resetDisplayedOverlays()
	{
		Iterator iterator = _overlaysDisplayed.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//    2    4:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_1        
_L6:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//    4    8:aload_1         
	//    5    9:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            106
_L1:
		APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #365 <Method Object Iterator.next()>
	//    9   23:checkcast       #426 <Class APSMediaOverlay>
	//   10   26:astore_2        
		if(((Float)((Object) (apsmediaoverlay.controller)).getClass().getMethod("getAlpha", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0])).floatValue() == 0.0F) goto _L4; else goto _L3
	//   11   27:aload_2         
	//   12   28:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   13   31:invokevirtual   #1070 <Method Class Object.getClass()>
	//   14   34:ldc2            #1879 <String "getAlpha">
	//   15   37:iconst_0        
	//   16   38:anewarray       Class[]
	//   17   41:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   18   44:aload_2         
	//   19   45:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   20   48:iconst_0        
	//   21   49:anewarray       Object[]
	//   22   52:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   23   55:checkcast       #1783 <Class Float>
	//   24   58:invokevirtual   #1883 <Method float Float.floatValue()>
	//   25   61:fconst_0        
	//   26   62:fcmpl           
	//   27   63:ifeq            74
_L3:
		positionOverlay(apsmediaoverlay);
	//   28   66:aload_0         
	//   29   67:aload_2         
	//   30   68:invokevirtual   #1885 <Method void positionOverlay(APSMediaOverlay)>
		  goto _L5
	//*  31   71:goto            8
_L4:
		try
		{
			((Object) (apsmediaoverlay.controller)).getClass().getMethod("stop", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//   32   74:aload_2         
	//   33   75:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   34   78:invokevirtual   #1070 <Method Class Object.getClass()>
	//   35   81:ldc2            #1233 <String "stop">
	//   36   84:iconst_0        
	//   37   85:anewarray       Class[]
	//   38   88:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   39   91:aload_2         
	//   40   92:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   41   95:iconst_0        
	//   42   96:anewarray       Object[]
	//   43   99:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   44  102:pop             
		}
	//*  45  103:goto            8
	//*  46  106:return          
		catch(Exception exception) { }
	//   47  107:astore_2        
_L5:
		if(true) goto _L6; else goto _L2
	//   48  108:goto            8
_L2:
	}

	public void resumePlay()
	{
		log("resume called");
	//    0    0:aload_0         
	//    1    1:ldc2            #1887 <String "resume called">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		if(!_paused)
			break MISSING_BLOCK_LABEL_34;
	//    3    7:aload_0         
	//    4    8:getfield        #185 <Field boolean _paused>
	//    5   11:ifeq            34
		play();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #1594 <Method void play()>
		LivestreamInternalTimer.INSTANCE.start();
	//    8   18:getstatic       #1058 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//    9   21:invokevirtual   #1888 <Method void LivestreamInternalTimer.start()>
		return;
	//   10   24:return          
		Object obj;
		obj;
	//   11   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   12   26:goto            30
		obj;
	//   13   29:astore_1        
		((Exception) (obj)).printStackTrace();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #1597 <Method void Exception.printStackTrace()>
	//   16   34:return          
	}

	public void seekTo(int i)
	{
label0:
		{
label1:
			{
				Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #569 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #570 <Method void StringBuilder()>
	//    3    7:astore_2        
				((StringBuilder) (obj)).append("VeePlay_EVENTS: seekTo called for: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1890 <String "VeePlay_EVENTS: seekTo called for: ">
	//    6   12:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
				((StringBuilder) (obj)).append(i);
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #581 <Method StringBuilder StringBuilder.append(int)>
	//   11   21:pop             
				log(((StringBuilder) (obj)).toString());
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   15   27:invokevirtual   #587 <Method void log(String)>
				if(!_durationAvailable)
					break label0;
	//   16   30:aload_0         
	//   17   31:getfield        #208 <Field boolean _durationAvailable>
	//   18   34:ifeq            149
				obj = ((Object) (_currentUnit));
	//   19   37:aload_0         
	//   20   38:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   21   41:astore_2        
				if(obj == null || ((APSMediaUnit) (obj)).url == null)
					break label0;
	//   22   42:aload_2         
	//   23   43:ifnull          149
	//   24   46:aload_2         
	//   25   47:getfield        #768 <Field String APSMediaUnit.url>
	//   26   50:ifnull          149
				if(currentPlaybackTime() > i)
	//*  27   53:aload_0         
	//*  28   54:invokevirtual   #1081 <Method int currentPlaybackTime()>
	//*  29   57:iload_1         
	//*  30   58:icmple          68
				{
					obj = ((Object) (MPMoviePlaybackState.MPMoviePlaybackSeekingBackward));
	//   31   61:getstatic       #1893 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackSeekingBackward>
	//   32   64:astore_2        
				} else
	//*  33   65:goto            80
				{
					if(currentPlaybackTime() >= i)
						break label1;
	//   34   68:aload_0         
	//   35   69:invokevirtual   #1081 <Method int currentPlaybackTime()>
	//   36   72:iload_1         
	//   37   73:icmpge          148
					obj = ((Object) (MPMoviePlaybackState.MPMoviePlaybackSeekingForward));
	//   38   76:getstatic       #1896 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackSeekingForward>
	//   39   79:astore_2        
				}
				isSeeking = false;
	//   40   80:aload_0         
	//   41   81:iconst_0        
	//   42   82:putfield        #189 <Field boolean isSeeking>
				processTriggeredEvents(i / 1000);
	//   43   85:aload_0         
	//   44   86:iload_1         
	//   45   87:sipush          1000
	//   46   90:idiv            
	//   47   91:invokespecial   #299 <Method void processTriggeredEvents(int)>
				playbackStateChanged(((MPMoviePlaybackState) (obj)), true);
	//   48   94:aload_0         
	//   49   95:aload_2         
	//   50   96:iconst_1        
	//   51   97:invokevirtual   #1674 <Method void playbackStateChanged(APSMediaPlayer$MPMoviePlaybackState, boolean)>
				isSeeking = true;
	//   52  100:aload_0         
	//   53  101:iconst_1        
	//   54  102:putfield        #189 <Field boolean isSeeking>
				handleSeekBehavior(i, ((MPMoviePlaybackState) (obj)));
	//   55  105:aload_0         
	//   56  106:iload_1         
	//   57  107:aload_2         
	//   58  108:invokespecial   #1898 <Method void handleSeekBehavior(int, APSMediaPlayer$MPMoviePlaybackState)>
				if(i < duration())
	//*  59  111:iload_1         
	//*  60  112:aload_0         
	//*  61  113:invokevirtual   #649 <Method int duration()>
	//*  62  116:icmpge          130
				{
					_renderer.seekTo(i);
	//   63  119:aload_0         
	//   64  120:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   65  123:iload_1         
	//   66  124:invokeinterface #1517 <Method void IVeeplayRenderer.seekTo(int)>
					return;
	//   67  129:return          
				} else
				{
					_renderer.seekTo(duration() - 1000);
	//   68  130:aload_0         
	//   69  131:getfield        #916 <Field IVeeplayRenderer _renderer>
	//   70  134:aload_0         
	//   71  135:invokevirtual   #649 <Method int duration()>
	//   72  138:sipush          1000
	//   73  141:isub            
	//   74  142:invokeinterface #1517 <Method void IVeeplayRenderer.seekTo(int)>
					return;
	//   75  147:return          
				}
			}
			return;
	//   76  148:return          
		}
		for(Iterator iterator = _overlaysDisplayed.iterator(); iterator.hasNext();)
	//*  77  149:aload_0         
	//*  78  150:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//*  79  153:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  80  156:astore_2        
	//*  81  157:aload_2         
	//*  82  158:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  83  163:ifeq            221
		{
			APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//   84  166:aload_2         
	//   85  167:invokeinterface #365 <Method Object Iterator.next()>
	//   86  172:checkcast       #426 <Class APSMediaOverlay>
	//   87  175:astore_3        
			try
			{
				((Object) (apsmediaoverlay.controller)).getClass().getMethod("setCurrentPlaybackTime", new Class[] {
					Integer.TYPE
				}).invoke(((Object) (apsmediaoverlay.controller)), new Object[] {
					Integer.valueOf(i)
				});
	//   88  176:aload_3         
	//   89  177:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   90  180:invokevirtual   #1070 <Method Class Object.getClass()>
	//   91  183:ldc2            #1900 <String "setCurrentPlaybackTime">
	//   92  186:iconst_1        
	//   93  187:anewarray       Class[]
	//   94  190:dup             
	//   95  191:iconst_0        
	//   96  192:getstatic       #1904 <Field Class Integer.TYPE>
	//   97  195:aastore         
	//   98  196:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   99  199:aload_3         
	//  100  200:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//  101  203:iconst_1        
	//  102  204:anewarray       Object[]
	//  103  207:dup             
	//  104  208:iconst_0        
	//  105  209:iload_1         
	//  106  210:invokestatic    #1907 <Method Integer Integer.valueOf(int)>
	//  107  213:aastore         
	//  108  214:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//  109  217:pop             
			}
	//* 110  218:goto            157
	//* 111  221:return          
			catch(Exception exception) { }
	//  112  222:astore_3        
		}

	//* 113  223:goto            157
	}

	public void setCurrentlyInFullscreenOverlayActivity(boolean flag)
	{
		currentlyInFullscreenOverlayActivity = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #230 <Field boolean currentlyInFullscreenOverlayActivity>
	//    3    5:return          
	}

	public void setFullscreenOrientationBehaviour(FullscreenOrientationBehaviour fullscreenorientationbehaviour)
	{
		fullscreenOrientationBehaviour = fullscreenorientationbehaviour;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #224 <Field APSMediaPlayer$FullscreenOrientationBehaviour fullscreenOrientationBehaviour>
	//    3    5:return          
	}

	public void setGoogleCastEnabled()
	{
		isGoogleCastEnabled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #191 <Field boolean isGoogleCastEnabled>
	//    3    5:return          
	}

	public void setMediaUnits(ArrayList arraylist)
	{
		_mediaUnits.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ArrayList _mediaUnits>
	//    2    4:invokevirtual   #1913 <Method void ArrayList.clear()>
		_nextPlaylistIndex = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #254 <Field int _nextPlaylistIndex>
		if(arraylist != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          25
			_mediaUnits.addAll(((java.util.Collection) (arraylist)));
	//    8   16:aload_0         
	//    9   17:getfield        #235 <Field ArrayList _mediaUnits>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #412 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   12   24:pop             
	//   13   25:return          
	}

	public void setMute(boolean flag)
	{
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:astore_2        
		if(iveeplayrenderer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			iveeplayrenderer.setMute(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #1916 <Method void IVeeplayRenderer.setMute(boolean)>
	//    8   16:return          
	}

	public void setPlayableDuration(int i)
	{
		_playableDuration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #201 <Field int _playableDuration>
	//    3    5:return          
	}

	public void setSecureSurfaceView(boolean flag)
	{
		secureSurfaceView = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #219 <Field boolean secureSurfaceView>
	//    3    5:return          
	}

	public void setSize(int i, int j)
	{
		RelativeLayout relativelayout = _mainView;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field RelativeLayout _mainView>
	//    2    4:astore_3        
		if(relativelayout == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(i, j))));
	//    6   10:aload_3         
	//    7   11:new             #1400 <Class android.widget.RelativeLayout$LayoutParams>
	//    8   14:dup             
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #1403 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   12   20:invokevirtual   #1410 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			return;
	//   13   23:return          
		}
	}

	public void setUserAgent(String s)
	{
		userAgent = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #228 <Field String userAgent>
	//    3    5:return          
	}

	public void setVolume(float f)
	{
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//    0    0:aload_0         
	//    1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    2    4:astore_2        
		if(iveeplayrenderer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			iveeplayrenderer.setVolume(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokeinterface #1923 <Method void IVeeplayRenderer.setVolume(float)>
	//    8   16:return          
	}

	public void setYouTubeApiKey(String s)
	{
		youtubeApiKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #212 <Field String youtubeApiKey>
	//    3    5:return          
	}

	public boolean shouldAutoplay()
	{
		APSMediaUnit apsmediaunit = _currentUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_1        
		return apsmediaunit == null || apsmediaunit.shouldAutoplay;
	//    3    5:aload_1         
	//    4    6:ifnull          21
	//    5    9:aload_1         
	//    6   10:getfield        #1510 <Field boolean APSMediaUnit.shouldAutoplay>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public void showHud()
	{
		handler.post(new Runnable() {

			public void run()
			{
				if(hudlessLoadImageView != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field APSMediaPlayer this$0>
			//*   2    4:getfield        #25  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
			//*   3    7:ifnull          21
					hudlessLoadImageView.setVisibility(0);
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field APSMediaPlayer this$0>
			//    6   14:getfield        #25  <Field ImageView APSMediaPlayer.hudlessLoadImageView>
			//    7   17:iconst_0        
			//    8   18:invokevirtual   #31  <Method void ImageView.setVisibility(int)>
			//    9   21:return          
			}

			final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:getstatic       #316 <Field Handler handler>
	//    1    3:new             #26  <Class APSMediaPlayer$15>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #1925 <Method void APSMediaPlayer$15(APSMediaPlayer)>
	//    5   11:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void skip()
	{
		APSMediaUnit apsmediaunit = _currentUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_1        
		if(apsmediaunit != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          36
			trackforEvent((ArrayList)apsmediaunit.trackingURLs.get("skip"), "skip", APSMediaTrackingEvents.MediaEventType.SKIP, ((APSMediaEvent) (_currentUnit)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//    8   14:ldc2            #1603 <String "skip">
	//    9   17:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   10   20:checkcast       #232 <Class ArrayList>
	//   11   23:ldc2            #1603 <String "skip">
	//   12   26:getstatic       #1928 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.SKIP>
	//   13   29:aload_0         
	//   14   30:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   15   33:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		_skipped = true;
	//   16   36:aload_0         
	//   17   37:iconst_1        
	//   18   38:putfield        #187 <Field boolean _skipped>
		unitFinished(MPMovieFinishReason.MPMovieFinishReasonNone);
	//   19   41:aload_0         
	//   20   42:getstatic       #978 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonNone>
	//   21   45:invokevirtual   #982 <Method void unitFinished(APSMediaPlayer$MPMovieFinishReason)>
	//   22   48:return          
	}

	public void startBackgroundService()
	{
		ClassNotFoundException classnotfoundexception;
		Object obj = ((Object) (activity));
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field Activity activity>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       17
		{
			log("No activity bound to the player yet. Please bind the current activity using init(). ");
	//    5    9:aload_0         
	//    6   10:ldc2            #1932 <String "No activity bound to the player yet. Please bind the current activity using init(). ">
	//    7   13:invokevirtual   #587 <Method void log(String)>
			return;
	//    8   16:return          
		}
		try
		{
			obj = ((Object) (new Intent(((android.content.Context) (obj)), Class.forName("com.veeplay.cast.VeeplayCastingService"))));
	//    9   17:new             #858 <Class Intent>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:ldc2            #1934 <String "com.veeplay.cast.VeeplayCastingService">
	//   13   25:invokestatic    #1938 <Method Class Class.forName(String)>
	//   14   28:invokespecial   #1658 <Method void Intent(android.content.Context, Class)>
	//   15   31:astore_1        
		}
	//*  16   32:aload_0         
	//*  17   33:getfield        #312 <Field Activity activity>
	//*  18   36:aload_1         
	//*  19   37:invokevirtual   #1942 <Method android.content.ComponentName Activity.startService(Intent)>
	//*  20   40:pop             
	//*  21   41:aload_0         
	//*  22   42:iconst_1        
	//*  23   43:putfield        #197 <Field boolean backgroundServiceStarted>
	//*  24   46:return          
	//*  25   47:aload_0         
	//*  26   48:ldc2            #1944 <String "Unable to find the Veeplay Cast Plugin">
	//*  27   51:invokevirtual   #587 <Method void log(String)>
	//*  28   54:return          
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			log("Unable to find the Veeplay Cast Plugin");
			return;
		}
		activity.startService(((Intent) (obj)));
		backgroundServiceStarted = true;
	//*  29   55:astore_1        
	//*  30   56:goto            47
	}

	public void step()
	{
		unitFinished(MPMovieFinishReason.MPMovieFinishReasonNone);
	//    0    0:aload_0         
	//    1    1:getstatic       #978 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonNone>
	//    2    4:invokevirtual   #982 <Method void unitFinished(APSMediaPlayer$MPMovieFinishReason)>
	//    3    7:return          
	}

	public void stop()
	{
		log("stop called");
	//    0    0:aload_0         
	//    1    1:ldc2            #1947 <String "stop called">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		if(_currentUnit != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*   5   11:ifnull          22
		{
			unitFinished(MPMovieFinishReason.MPMovieFinishReasonNone);
	//    6   14:aload_0         
	//    7   15:getstatic       #978 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonNone>
	//    8   18:invokevirtual   #982 <Method void unitFinished(APSMediaPlayer$MPMovieFinishReason)>
			return;
	//    9   21:return          
		}
		for(Iterator iterator = _overlaysDisplayed.iterator(); iterator.hasNext();)
	//*  10   22:aload_0         
	//*  11   23:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//*  12   26:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  13   29:astore_1        
	//*  14   30:aload_1         
	//*  15   31:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            81
		{
			APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//   17   39:aload_1         
	//   18   40:invokeinterface #365 <Method Object Iterator.next()>
	//   19   45:checkcast       #426 <Class APSMediaOverlay>
	//   20   48:astore_2        
			try
			{
				((Object) (apsmediaoverlay.controller)).getClass().getMethod("stop", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//   21   49:aload_2         
	//   22   50:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   23   53:invokevirtual   #1070 <Method Class Object.getClass()>
	//   24   56:ldc2            #1233 <String "stop">
	//   25   59:iconst_0        
	//   26   60:anewarray       Class[]
	//   27   63:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   28   66:aload_2         
	//   29   67:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   30   70:iconst_0        
	//   31   71:anewarray       Object[]
	//   32   74:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   33   77:pop             
			}
	//*  34   78:goto            30
	//*  35   81:return          
			catch(Exception exception) { }
	//   36   82:astore_2        
		}

	//*  37   83:goto            30
	}

	public void stopBackgroundService()
	{
		ClassNotFoundException classnotfoundexception;
		Object obj = ((Object) (activity));
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field Activity activity>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       17
		{
			log("No activity bound to the player yet. Please bind the current activity using init(). ");
	//    5    9:aload_0         
	//    6   10:ldc2            #1932 <String "No activity bound to the player yet. Please bind the current activity using init(). ">
	//    7   13:invokevirtual   #587 <Method void log(String)>
			return;
	//    8   16:return          
		}
		try
		{
			obj = ((Object) (new Intent(((android.content.Context) (obj)), Class.forName("com.veeplay.cast.VeeplayCastingService"))));
	//    9   17:new             #858 <Class Intent>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:ldc2            #1934 <String "com.veeplay.cast.VeeplayCastingService">
	//   13   25:invokestatic    #1938 <Method Class Class.forName(String)>
	//   14   28:invokespecial   #1658 <Method void Intent(android.content.Context, Class)>
	//   15   31:astore_1        
			((Intent) (obj)).setAction("veeplay-cast-intent-action-stop-service");
	//   16   32:aload_1         
	//   17   33:ldc2            #1949 <String "veeplay-cast-intent-action-stop-service">
	//   18   36:invokevirtual   #1953 <Method Intent Intent.setAction(String)>
	//   19   39:pop             
		}
	//*  20   40:aload_0         
	//*  21   41:getfield        #312 <Field Activity activity>
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #1942 <Method android.content.ComponentName Activity.startService(Intent)>
	//*  24   48:pop             
	//*  25   49:return          
	//*  26   50:aload_0         
	//*  27   51:ldc2            #1944 <String "Unable to find the Veeplay Cast Plugin">
	//*  28   54:invokevirtual   #587 <Method void log(String)>
	//*  29   57:return          
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			log("Unable to find the Veeplay Cast Plugin");
			return;
		}
		activity.startService(((Intent) (obj)));
	//*  30   58:astore_1        
	//*  31   59:goto            50
	}

	public void switchRenderer()
	{
		log("should switch renderer");
	//    0    0:aload_0         
	//    1    1:ldc2            #1956 <String "should switch renderer">
	//    2    4:invokevirtual   #587 <Method void log(String)>
		String s = getRendererByPriority();
	//    3    7:aload_0         
	//    4    8:invokespecial   #757 <Method String getRendererByPriority()>
	//    5   11:astore_1        
		IVeeplayRenderer iveeplayrenderer = _renderer;
	//    6   12:aload_0         
	//    7   13:getfield        #916 <Field IVeeplayRenderer _renderer>
	//    8   16:astore_2        
		if(iveeplayrenderer != null && _currentUnit != null && !s.equals(((Object) (iveeplayrenderer.type()))))
	//*   9   17:aload_2         
	//*  10   18:ifnull          104
	//*  11   21:aload_0         
	//*  12   22:getfield        #615 <Field APSMediaUnit _currentUnit>
	//*  13   25:ifnull          104
	//*  14   28:aload_1         
	//*  15   29:aload_2         
	//*  16   30:invokeinterface #920 <Method String IVeeplayRenderer.type()>
	//*  17   35:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  18   38:ifne            104
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   41:new             #569 <Class StringBuilder>
	//   20   44:dup             
	//   21   45:invokespecial   #570 <Method void StringBuilder()>
	//   22   48:astore_2        
			stringbuilder.append("switching renderer to ");
	//   23   49:aload_2         
	//   24   50:ldc2            #1958 <String "switching renderer to ">
	//   25   53:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
			stringbuilder.append(s);
	//   27   57:aload_2         
	//   28   58:aload_1         
	//   29   59:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
			log(stringbuilder.toString());
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   34   68:invokevirtual   #587 <Method void log(String)>
			_currentUnit.initialPlaybackTime = (int)getCachedPlaybackTime();
	//   35   71:aload_0         
	//   36   72:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   37   75:aload_0         
	//   38   76:invokevirtual   #1960 <Method long getCachedPlaybackTime()>
	//   39   79:l2i             
	//   40   80:putfield        #1084 <Field int APSMediaUnit.initialPlaybackTime>
			pause();
	//   41   83:aload_0         
	//   42   84:invokevirtual   #1601 <Method void pause()>
			setCurrentRenderer(s);
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:invokespecial   #760 <Method void setCurrentRenderer(String)>
			processUnit(_currentUnit);
	//   46   92:aload_0         
	//   47   93:aload_0         
	//   48   94:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   49   97:invokevirtual   #796 <Method void processUnit(APSMediaUnit)>
			resumePlay();
	//   50  100:aload_0         
	//   51  101:invokevirtual   #1962 <Method void resumePlay()>
		}
	//   52  104:return          
	}

	public void toggleFullscreen()
	{
		if(_renderer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*   2    4:ifnull          106
		{
			if(_mainView == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #326 <Field RelativeLayout _mainView>
	//*   5   11:ifnonnull       15
				return;
	//    6   14:return          
			if(_isFullscreen)
	//*   7   15:aload_0         
	//*   8   16:getfield        #1137 <Field boolean _isFullscreen>
	//*   9   19:ifeq            29
				exitFullscreen();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #846 <Method void exitFullscreen()>
			else
	//*  12   26:goto            33
				enterFullscreen();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #1964 <Method void enterFullscreen()>
			for(Iterator iterator = _overlaysDisplayed.iterator(); iterator.hasNext();)
	//*  15   33:aload_0         
	//*  16   34:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//*  17   37:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  18   40:astore_1        
	//*  19   41:aload_1         
	//*  20   42:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  21   47:ifeq            92
			{
				APSMediaOverlay apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//   22   50:aload_1         
	//   23   51:invokeinterface #365 <Method Object Iterator.next()>
	//   24   56:checkcast       #426 <Class APSMediaOverlay>
	//   25   59:astore_2        
				try
				{
					((Object) (apsmediaoverlay.controller)).getClass().getMethod("fullscreenToggled", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0]);
	//   26   60:aload_2         
	//   27   61:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   28   64:invokevirtual   #1070 <Method Class Object.getClass()>
	//   29   67:ldc2            #1966 <String "fullscreenToggled">
	//   30   70:iconst_0        
	//   31   71:anewarray       Class[]
	//   32   74:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   33   77:aload_2         
	//   34   78:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   35   81:iconst_0        
	//   36   82:anewarray       Object[]
	//   37   85:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   38   88:pop             
				}
	//*  39   89:goto            41
	//*  40   92:aload_0         
	//*  41   93:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*  42   96:invokeinterface #986 <Method void IVeeplayRenderer.playingSurfaceSizeChanged()>
	//*  43  101:aload_0         
	//*  44  102:invokevirtual   #914 <Method void resetDisplayedOverlays()>
	//*  45  105:return          
	//*  46  106:return          
				catch(Exception exception) { }
	//   47  107:astore_2        
			}

			_renderer.playingSurfaceSizeChanged();
			resetDisplayedOverlays();
			return;
		} else
		{
			return;
		}
	//*  48  108:goto            41
	}

	public void trackforEvent(ArrayList arraylist, String s, APSMediaTrackingEvents.MediaEventType mediaeventtype, APSMediaEvent apsmediaevent)
	{
		emitEvent(arraylist, s, mediaeventtype, new Bundle(), apsmediaevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #748 <Class Bundle>
	//    5    7:dup             
	//    6    8:invokespecial   #749 <Method void Bundle()>
	//    7   11:aload           4
	//    8   13:invokevirtual   #753 <Method void emitEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, Bundle, APSMediaEvent)>
		if(arraylist == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       21
			return;
	//   11   20:return          
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext();)
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #677 <Method Iterator ArrayList.iterator()>
	//*  14   25:astore_1        
	//*  15   26:aload_1         
	//*  16   27:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  17   32:ifeq            165
		{
			mediaeventtype = ((APSMediaTrackingEvents.MediaEventType) ((String)((Iterator) (arraylist)).next()));
	//   18   35:aload_1         
	//   19   36:invokeinterface #365 <Method Object Iterator.next()>
	//   20   41:checkcast       #367 <Class String>
	//   21   44:astore_3        
			apsmediaevent = ((APSMediaEvent) (new StringBuilder()));
	//   22   45:new             #569 <Class StringBuilder>
	//   23   48:dup             
	//   24   49:invokespecial   #570 <Method void StringBuilder()>
	//   25   52:astore          4
			((StringBuilder) (apsmediaevent)).append("## Tracking for ");
	//   26   54:aload           4
	//   27   56:ldc2            #1971 <String "## Tracking for ">
	//   28   59:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
			((StringBuilder) (apsmediaevent)).append(s);
	//   30   63:aload           4
	//   31   65:aload_2         
	//   32   66:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
			((StringBuilder) (apsmediaevent)).append(" ## ");
	//   34   70:aload           4
	//   35   72:ldc2            #1973 <String " ## ">
	//   36   75:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
			((StringBuilder) (apsmediaevent)).append(((String) (mediaeventtype)));
	//   38   79:aload           4
	//   39   81:aload_3         
	//   40   82:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
			log(((StringBuilder) (apsmediaevent)).toString());
	//   42   86:aload_0         
	//   43   87:aload           4
	//   44   89:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   45   92:invokevirtual   #587 <Method void log(String)>
			mediaeventtype = ((APSMediaTrackingEvents.MediaEventType) (((String) (mediaeventtype)).replace("^", "%5E")));
	//   46   95:aload_3         
	//   47   96:ldc2            #1975 <String "^">
	//   48   99:ldc2            #1977 <String "%5E">
	//   49  102:invokevirtual   #442 <Method String String.replace(CharSequence, CharSequence)>
	//   50  105:astore_3        
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  51  106:getstatic       #1640 <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  109:bipush          11
	//*  53  111:icmplt          141
				(new trackURL()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (new String[] {
					mediaeventtype
				})));
	//   54  114:new             #63  <Class APSMediaPlayer$trackURL>
	//   55  117:dup             
	//   56  118:aload_0         
	//   57  119:aconst_null     
	//   58  120:invokespecial   #1980 <Method void APSMediaPlayer$trackURL(APSMediaPlayer, APSMediaPlayer$1)>
	//   59  123:getstatic       #1986 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   60  126:iconst_1        
	//   61  127:anewarray       String[]
	//   62  130:dup             
	//   63  131:iconst_0        
	//   64  132:aload_3         
	//   65  133:aastore         
	//   66  134:invokevirtual   #1990 <Method AsyncTask APSMediaPlayer$trackURL.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   67  137:pop             
			else
	//*  68  138:goto            26
				(new trackURL()).execute(((Object []) (new String[] {
					mediaeventtype
				})));
	//   69  141:new             #63  <Class APSMediaPlayer$trackURL>
	//   70  144:dup             
	//   71  145:aload_0         
	//   72  146:aconst_null     
	//   73  147:invokespecial   #1980 <Method void APSMediaPlayer$trackURL(APSMediaPlayer, APSMediaPlayer$1)>
	//   74  150:iconst_1        
	//   75  151:anewarray       String[]
	//   76  154:dup             
	//   77  155:iconst_0        
	//   78  156:aload_3         
	//   79  157:aastore         
	//   80  158:invokevirtual   #1991 <Method AsyncTask APSMediaPlayer$trackURL.execute(Object[])>
	//   81  161:pop             
		}

	//*  82  162:goto            26
	//   83  165:return          
	}

	public void unitFinished(MPMovieFinishReason mpmoviefinishreason)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #569 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #570 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unit finished called: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1995 <String "Unit finished called: ">
	//    6   12:invokevirtual   #576 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (mpmoviefinishreason)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1998 <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		log(stringbuilder.toString());
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #584 <Method String StringBuilder.toString()>
	//   15   27:invokevirtual   #587 <Method void log(String)>
		if(mpmoviefinishreason == MPMovieFinishReason.MPMovieFinishReasonPlaybackError)
	//*  16   30:aload_1         
	//*  17   31:getstatic       #2001 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonPlaybackError>
	//*  18   34:if_acmpne       63
		{
			Object obj = ((Object) (activity));
	//   19   37:aload_0         
	//   20   38:getfield        #312 <Field Activity activity>
	//   21   41:astore_2        
			final View viewToRemove;
			Exception exception2;
			if(obj != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          63
				try
				{
					LocalBroadcastManager.getInstance(((android.content.Context) (obj))).sendBroadcast(new Intent("com.appscend.mp.notifications.error"));
	//   24   46:aload_2         
	//   25   47:invokestatic    #856 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//   26   50:new             #858 <Class Intent>
	//   27   53:dup             
	//   28   54:ldc1            #74  <String "com.appscend.mp.notifications.error">
	//   29   56:invokespecial   #859 <Method void Intent(String)>
	//   30   59:invokevirtual   #863 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   31   62:pop             
				}
	//*  32   63:aload_0         
	//*  33   64:getfield        #916 <Field IVeeplayRenderer _renderer>
	//*  34   67:astore_2        
	//*  35   68:aload_2         
	//*  36   69:ifnull          79
	//*  37   72:aload_2         
	//*  38   73:aload_1         
	//*  39   74:invokeinterface #2002 <Method void IVeeplayRenderer.unitFinished(APSMediaPlayer$MPMovieFinishReason)>
	//*  40   79:aload_0         
	//*  41   80:getstatic       #204 <Field APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackStopped>
	//*  42   83:iconst_1        
	//*  43   84:invokevirtual   #1674 <Method void playbackStateChanged(APSMediaPlayer$MPMoviePlaybackState, boolean)>
	//*  44   87:aload_0         
	//*  45   88:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//*  46   91:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  47   94:astore_2        
	//*  48   95:aload_2         
	//*  49   96:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  50  101:ifeq            223
	//*  51  104:aload_2         
	//*  52  105:invokeinterface #365 <Method Object Iterator.next()>
	//*  53  110:checkcast       #426 <Class APSMediaOverlay>
	//*  54  113:astore_3        
	//*  55  114:aload_3         
	//*  56  115:getfield        #899 <Field String APSMediaOverlay.type>
	//*  57  118:ldc2            #496 <String "com.appscend.mp.overlays.midroll">
	//*  58  121:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  59  124:ifne            151
	//*  60  127:aload_0         
	//*  61  128:aload_3         
	//*  62  129:getfield        #2003 <Field HashMap APSMediaOverlay.trackingURLs>
	//*  63  132:ldc2            #786 <String "finish">
	//*  64  135:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//*  65  138:checkcast       #232 <Class ArrayList>
	//*  66  141:ldc2            #2005 <String "finish for non-linear">
	//*  67  144:getstatic       #791 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.FINISH>
	//*  68  147:aload_3         
	//*  69  148:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
	//*  70  151:aload_3         
	//*  71  152:getfield        #899 <Field String APSMediaOverlay.type>
	//*  72  155:ldc2            #492 <String "controls">
	//*  73  158:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  74  161:ifeq            95
	//*  75  164:aload_3         
	//*  76  165:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//*  77  168:invokevirtual   #1070 <Method Class Object.getClass()>
	//*  78  171:ldc2            #1779 <String "getView">
	//*  79  174:iconst_0        
	//*  80  175:anewarray       Class[]
	//*  81  178:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//*  82  181:aload_3         
	//*  83  182:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//*  84  185:iconst_0        
	//*  85  186:anewarray       Object[]
	//*  86  189:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//*  87  192:checkcast       #1781 <Class View>
	//*  88  195:astore_3        
	//*  89  196:getstatic       #316 <Field Handler handler>
	//*  90  199:new             #50  <Class APSMediaPlayer$8>
	//*  91  202:dup             
	//*  92  203:aload_0         
	//*  93  204:aload_3         
	//*  94  205:invokespecial   #2008 <Method void APSMediaPlayer$8(APSMediaPlayer, View)>
	//*  95  208:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//*  96  211:pop             
	//*  97  212:goto            95
	//*  98  215:astore_3        
	//*  99  216:aload_3         
	//* 100  217:invokevirtual   #1597 <Method void Exception.printStackTrace()>
	//* 101  220:goto            95
	//* 102  223:aload_0         
	//* 103  224:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 104  227:ifnull          426
	//* 105  230:aload_0         
	//* 106  231:getfield        #187 <Field boolean _skipped>
	//* 107  234:ifne            426
	//* 108  237:aload_1         
	//* 109  238:getstatic       #1548 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonPlaybackEnded>
	//* 110  241:if_acmpne       277
	//* 111  244:aload_0         
	//* 112  245:aload_0         
	//* 113  246:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 114  249:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//* 115  252:ldc2            #2010 <String "complete">
	//* 116  255:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//* 117  258:checkcast       #232 <Class ArrayList>
	//* 118  261:ldc2            #2010 <String "complete">
	//* 119  264:getstatic       #2013 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.COMPLETE>
	//* 120  267:aload_0         
	//* 121  268:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 122  271:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
	//* 123  274:goto            426
	//* 124  277:aload_1         
	//* 125  278:getstatic       #1236 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonUserExited>
	//* 126  281:if_acmpne       347
	//* 127  284:aload_0         
	//* 128  285:aload_0         
	//* 129  286:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 130  289:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//* 131  292:ldc2            #2015 <String "close">
	//* 132  295:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//* 133  298:checkcast       #232 <Class ArrayList>
	//* 134  301:ldc2            #2015 <String "close">
	//* 135  304:getstatic       #2018 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.CLOSE>
	//* 136  307:aload_0         
	//* 137  308:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 138  311:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
	//* 139  314:aload_0         
	//* 140  315:aload_0         
	//* 141  316:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 142  319:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//* 143  322:ldc2            #2020 <String "closeLinear">
	//* 144  325:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//* 145  328:checkcast       #232 <Class ArrayList>
	//* 146  331:ldc2            #2020 <String "closeLinear">
	//* 147  334:getstatic       #2023 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.CLOSE_LINEAR>
	//* 148  337:aload_0         
	//* 149  338:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 150  341:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
	//* 151  344:goto            426
	//* 152  347:aload_1         
	//* 153  348:getstatic       #2001 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonPlaybackError>
	//* 154  351:if_acmpne       426
	//* 155  354:aload_0         
	//* 156  355:aload_0         
	//* 157  356:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 158  359:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//* 159  362:ldc2            #2025 <String "error">
	//* 160  365:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//* 161  368:checkcast       #232 <Class ArrayList>
	//* 162  371:ldc2            #2027 <String "linear playback error">
	//* 163  374:getstatic       #2030 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.ERROR>
	//* 164  377:aload_0         
	//* 165  378:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 166  381:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
	//* 167  384:aload_0         
	//* 168  385:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 169  388:getfield        #2033 <Field ArrayList APSMediaUnit.buffet>
	//* 170  391:ifnull          426
	//* 171  394:aload_0         
	//* 172  395:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 173  398:getfield        #2033 <Field ArrayList APSMediaUnit.buffet>
	//* 174  401:invokevirtual   #519 <Method int ArrayList.size()>
	//* 175  404:ifle            426
	//* 176  407:aload_0         
	//* 177  408:getfield        #235 <Field ArrayList _mediaUnits>
	//* 178  411:iconst_0        
	//* 179  412:aload_0         
	//* 180  413:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 181  416:getfield        #2033 <Field ArrayList APSMediaUnit.buffet>
	//* 182  419:iconst_0        
	//* 183  420:invokevirtual   #1875 <Method Object ArrayList.remove(int)>
	//* 184  423:invokevirtual   #1476 <Method void ArrayList.add(int, Object)>
	//* 185  426:aload_0         
	//* 186  427:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 187  430:astore_2        
	//* 188  431:aload_2         
	//* 189  432:ifnull          462
	//* 190  435:aload_0         
	//* 191  436:aload_2         
	//* 192  437:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//* 193  440:ldc2            #786 <String "finish">
	//* 194  443:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//* 195  446:checkcast       #232 <Class ArrayList>
	//* 196  449:ldc2            #786 <String "finish">
	//* 197  452:getstatic       #791 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.FINISH>
	//* 198  455:aload_0         
	//* 199  456:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 200  459:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
	//* 201  462:getstatic       #316 <Field Handler handler>
	//* 202  465:astore_2        
	//* 203  466:aload_2         
	//* 204  467:ifnull          483
	//* 205  470:aload_2         
	//* 206  471:new             #52  <Class APSMediaPlayer$9>
	//* 207  474:dup             
	//* 208  475:aload_0         
	//* 209  476:invokespecial   #2034 <Method void APSMediaPlayer$9(APSMediaPlayer)>
	//* 210  479:invokevirtual   #734 <Method boolean Handler.post(Runnable)>
	//* 211  482:pop             
	//* 212  483:aload_0         
	//* 213  484:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 214  487:astore_2        
	//* 215  488:aload_2         
	//* 216  489:ifnull          526
	//* 217  492:aload_2         
	//* 218  493:getfield        #1844 <Field String APSMediaUnit.manager>
	//* 219  496:ifnull          526
	//* 220  499:aload_0         
	//* 221  500:aload_0         
	//* 222  501:getfield        #615 <Field APSMediaUnit _currentUnit>
	//* 223  504:getfield        #1844 <Field String APSMediaUnit.manager>
	//* 224  507:ldc1            #93  <String "com.appscend.mp.drm">
	//* 225  509:invokevirtual   #941 <Method Object adapterForTypeInGroup(String, String)>
	//* 226  512:checkcast       #1857 <Class UnitManager>
	//* 227  515:astore_2        
	//* 228  516:aload_2         
	//* 229  517:ifnull          526
	//* 230  520:aload_2         
	//* 231  521:invokeinterface #2037 <Method void UnitManager.end()>
	//* 232  526:aload_0         
	//* 233  527:aconst_null     
	//* 234  528:putfield        #615 <Field APSMediaUnit _currentUnit>
	//* 235  531:aload_0         
	//* 236  532:iconst_0        
	//* 237  533:putfield        #185 <Field boolean _paused>
	//* 238  536:aload_0         
	//* 239  537:iconst_0        
	//* 240  538:putfield        #187 <Field boolean _skipped>
	//* 241  541:aload_0         
	//* 242  542:iconst_0        
	//* 243  543:putfield        #208 <Field boolean _durationAvailable>
	//* 244  546:aload_0         
	//* 245  547:iconst_0        
	//* 246  548:putfield        #189 <Field boolean isSeeking>
	//* 247  551:aload_0         
	//* 248  552:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//* 249  555:invokevirtual   #636 <Method void CopyOnWriteArrayList.clear()>
	//* 250  558:aload_0         
	//* 251  559:getfield        #239 <Field CopyOnWriteArrayList _eventsToTrigger>
	//* 252  562:invokevirtual   #636 <Method void CopyOnWriteArrayList.clear()>
	//* 253  565:aload_0         
	//* 254  566:getfield        #252 <Field HashMap _dynamicTracking>
	//* 255  569:invokevirtual   #2038 <Method void HashMap.clear()>
	//* 256  572:aload_0         
	//* 257  573:getfield        #1032 <Field TimerTask timerTask>
	//* 258  576:astore_2        
	//* 259  577:aload_2         
	//* 260  578:ifnull          586
	//* 261  581:aload_2         
	//* 262  582:invokevirtual   #1037 <Method boolean TimerTask.cancel()>
	//* 263  585:pop             
	//* 264  586:getstatic       #1058 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//* 265  589:invokevirtual   #1511 <Method void LivestreamInternalTimer.stop()>
	//* 266  592:getstatic       #1058 <Field LivestreamInternalTimer LivestreamInternalTimer.INSTANCE>
	//* 267  595:invokevirtual   #2041 <Method void LivestreamInternalTimer.reset()>
	//* 268  598:aload_0         
	//* 269  599:getfield        #312 <Field Activity activity>
	//* 270  602:astore_2        
	//* 271  603:aload_2         
	//* 272  604:ifnull          624
	//* 273  607:aload_2         
	//* 274  608:invokestatic    #856 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(android.content.Context)>
	//* 275  611:new             #858 <Class Intent>
	//* 276  614:dup             
	//* 277  615:ldc1            #71  <String "com.appscend.mp.notifications.controlshidden">
	//* 278  617:invokespecial   #859 <Method void Intent(String)>
	//* 279  620:invokevirtual   #863 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//* 280  623:pop             
	//* 281  624:aload_1         
	//* 282  625:getstatic       #1236 <Field APSMediaPlayer$MPMovieFinishReason APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonUserExited>
	//* 283  628:if_acmpeq       635
	//* 284  631:aload_0         
	//* 285  632:invokespecial   #320 <Method void processQueue()>
	//* 286  635:return          
				catch(Exception exception) { }
	//  287  636:astore_2        
		}
		obj = ((Object) (_renderer));
		if(obj != null)
			((IVeeplayRenderer) (obj)).unitFinished(mpmoviefinishreason);
		playbackStateChanged(MPMoviePlaybackState.MPMoviePlaybackStopped, true);
		obj = ((Object) (_overlaysDisplayed.iterator()));
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
			viewToRemove = ((View) ((APSMediaOverlay)((Iterator) (obj)).next()));
			if(!((APSMediaOverlay) (viewToRemove)).type.equals("com.appscend.mp.overlays.midroll"))
				trackforEvent((ArrayList)((APSMediaOverlay) (viewToRemove)).trackingURLs.get("finish"), "finish for non-linear", APSMediaTrackingEvents.MediaEventType.FINISH, ((APSMediaEvent) (viewToRemove)));
			if(((APSMediaOverlay) (viewToRemove)).type.equals("controls"))
				try
				{
					viewToRemove = (View)((Object) (((APSMediaOverlay) (viewToRemove)).controller)).getClass().getMethod("getView", new Class[0]).invoke(((Object) (((APSMediaOverlay) (viewToRemove)).controller)), new Object[0]);
					handler.post(new Runnable() {

						public void run()
						{
							_mainView.removeView(viewToRemove);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field APSMediaPlayer this$0>
						//    2    4:invokestatic    #30  <Method RelativeLayout APSMediaPlayer.access$400(APSMediaPlayer)>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field View val$viewToRemove>
						//    5   11:invokevirtual   #36  <Method void RelativeLayout.removeView(View)>
						//    6   14:return          
						}

						final APSMediaPlayer this$0;
						final View val$viewToRemove;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field APSMediaPlayer this$0>
				viewToRemove = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View val$viewToRemove>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
				}
				// Misplaced declaration of an exception variable
				catch(Exception exception2)
				{
					exception2.printStackTrace();
				}
		} while(true);
		if(_currentUnit != null && !_skipped)
			if(mpmoviefinishreason == MPMovieFinishReason.MPMovieFinishReasonPlaybackEnded)
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("complete"), "complete", APSMediaTrackingEvents.MediaEventType.COMPLETE, ((APSMediaEvent) (_currentUnit)));
			else
			if(mpmoviefinishreason == MPMovieFinishReason.MPMovieFinishReasonUserExited)
			{
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("close"), "close", APSMediaTrackingEvents.MediaEventType.CLOSE, ((APSMediaEvent) (_currentUnit)));
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("closeLinear"), "closeLinear", APSMediaTrackingEvents.MediaEventType.CLOSE_LINEAR, ((APSMediaEvent) (_currentUnit)));
			} else
			if(mpmoviefinishreason == MPMovieFinishReason.MPMovieFinishReasonPlaybackError)
			{
				trackforEvent((ArrayList)_currentUnit.trackingURLs.get("error"), "linear playback error", APSMediaTrackingEvents.MediaEventType.ERROR, ((APSMediaEvent) (_currentUnit)));
				if(_currentUnit.buffet != null && _currentUnit.buffet.size() > 0)
					_mediaUnits.add(0, _currentUnit.buffet.remove(0));
			}
		obj = ((Object) (_currentUnit));
		if(obj != null)
			trackforEvent((ArrayList)((APSMediaUnit) (obj)).trackingURLs.get("finish"), "finish", APSMediaTrackingEvents.MediaEventType.FINISH, ((APSMediaEvent) (_currentUnit)));
		obj = ((Object) (handler));
		if(obj != null)
			((Handler) (obj)).post(new Runnable() {

				public void run()
				{
					if(_overlayContainer != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field APSMediaPlayer this$0>
				//*   2    4:invokestatic    #26  <Method RelativeLayout APSMediaPlayer.access$500(APSMediaPlayer)>
				//*   3    7:ifnull          20
						_overlayContainer.removeAllViews();
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field APSMediaPlayer this$0>
				//    6   14:invokestatic    #26  <Method RelativeLayout APSMediaPlayer.access$500(APSMediaPlayer)>
				//    7   17:invokevirtual   #31  <Method void RelativeLayout.removeAllViews()>
				//    8   20:return          
				}

				final APSMediaPlayer this$0;

			
			{
				this$0 = APSMediaPlayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
		obj = ((Object) (_currentUnit));
		if(obj != null && ((APSMediaUnit) (obj)).manager != null)
		{
			obj = ((Object) ((UnitManager)adapterForTypeInGroup(_currentUnit.manager, "com.appscend.mp.drm")));
			if(obj != null)
				((UnitManager) (obj)).end();
		}
		_currentUnit = null;
		_paused = false;
		_skipped = false;
		_durationAvailable = false;
		isSeeking = false;
		_overlaysDisplayed.clear();
		_eventsToTrigger.clear();
		_dynamicTracking.clear();
		obj = ((Object) (timerTask));
		if(obj != null)
			((TimerTask) (obj)).cancel();
		LivestreamInternalTimer.INSTANCE.stop();
		LivestreamInternalTimer.INSTANCE.reset();
		obj = ((Object) (activity));
		if(obj != null)
			try
			{
				LocalBroadcastManager.getInstance(((android.content.Context) (obj))).sendBroadcast(new Intent("com.appscend.mp.notifications.controlshidden"));
			}
	//* 288  637:goto            63
			catch(Exception exception1) { }
	//  289  640:astore_2        
		if(mpmoviefinishreason != MPMovieFinishReason.MPMovieFinishReasonUserExited)
			processQueue();
	//* 290  641:goto            624
	}

	public void updateDisplayedOverlays()
	{
		Iterator iterator = _overlaysDisplayed.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field CopyOnWriteArrayList _overlaysDisplayed>
	//    2    4:invokevirtual   #419 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
_L3:
		APSMediaOverlay apsmediaoverlay;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_415;
	//    4    8:aload_2         
	//    5    9:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            415
		apsmediaoverlay = (APSMediaOverlay)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #365 <Method Object Iterator.next()>
	//    9   23:checkcast       #426 <Class APSMediaOverlay>
	//   10   26:astore_3        
		Object obj = ((Object) (((Object) (apsmediaoverlay.controller)).getClass()));
	//   11   27:aload_3         
	//   12   28:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   13   31:invokevirtual   #1070 <Method Class Object.getClass()>
	//   14   34:astore          4
		int i = 0;
	//   15   36:iconst_0        
	//   16   37:istore_1        
		obj = ((Object) ((View)((Class) (obj)).getMethod("getView", new Class[0]).invoke(((Object) (apsmediaoverlay.controller)), new Object[0])));
	//   17   38:aload           4
	//   18   40:ldc2            #1779 <String "getView">
	//   19   43:iconst_0        
	//   20   44:anewarray       Class[]
	//   21   47:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   22   50:aload_3         
	//   23   51:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   24   54:iconst_0        
	//   25   55:anewarray       Object[]
	//   26   58:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   27   61:checkcast       #1781 <Class View>
	//   28   64:astore          4
		if(_overlayContainer.indexOfChild(((View) (obj))) != -1 || _mainView.indexOfChild(((View) (obj))) != -1)
			continue; /* Loop/switch isn't completed */
	//   29   66:aload_0         
	//   30   67:getfield        #329 <Field RelativeLayout _overlayContainer>
	//   31   70:aload           4
	//   32   72:invokevirtual   #2042 <Method int RelativeLayout.indexOfChild(View)>
	//   33   75:iconst_m1       
	//   34   76:icmpne          8
	//   35   79:aload_0         
	//   36   80:getfield        #326 <Field RelativeLayout _mainView>
	//   37   83:aload           4
	//   38   85:invokevirtual   #2042 <Method int RelativeLayout.indexOfChild(View)>
	//   39   88:iconst_m1       
	//   40   89:icmpne          8
		if(obj == null)
			break MISSING_BLOCK_LABEL_340;
	//   41   92:aload           4
	//   42   94:ifnull          340
		Object obj1;
		positionOverlay(apsmediaoverlay);
	//   43   97:aload_0         
	//   44   98:aload_3         
	//   45   99:invokevirtual   #1885 <Method void positionOverlay(APSMediaOverlay)>
		obj1 = ((Object) (new AlphaAnimation(0.0F, 0.0F)));
	//   46  102:new             #2044 <Class AlphaAnimation>
	//   47  105:dup             
	//   48  106:fconst_0        
	//   49  107:fconst_0        
	//   50  108:invokespecial   #2047 <Method void AlphaAnimation(float, float)>
	//   51  111:astore          5
		((AlphaAnimation) (obj1)).setDuration(100L);
	//   52  113:aload           5
	//   53  115:ldc2w           #2048 <Long 100L>
	//   54  118:invokevirtual   #2053 <Method void AlphaAnimation.setDuration(long)>
		((AlphaAnimation) (obj1)).setFillAfter(true);
	//   55  121:aload           5
	//   56  123:iconst_1        
	//   57  124:invokevirtual   #2056 <Method void AlphaAnimation.setFillAfter(boolean)>
		((View) (obj)).startAnimation(((android.view.animation.Animation) (obj1)));
	//   58  127:aload           4
	//   59  129:aload           5
	//   60  131:invokevirtual   #2060 <Method void View.startAnimation(android.view.animation.Animation)>
		obj1 = ((Object) (((Object) (apsmediaoverlay.controller)).getClass().getMethod("addViewToContainer", new Class[] {
			android/view/ViewGroup
		})));
	//   61  134:aload_3         
	//   62  135:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   63  138:invokevirtual   #1070 <Method Class Object.getClass()>
	//   64  141:ldc2            #2062 <String "addViewToContainer">
	//   65  144:iconst_1        
	//   66  145:anewarray       Class[]
	//   67  148:dup             
	//   68  149:iconst_0        
	//   69  150:ldc2            #1143 <Class ViewGroup>
	//   70  153:aastore         
	//   71  154:invokevirtual   #1074 <Method Method Class.getMethod(String, Class[])>
	//   72  157:astore          5
		if(apsmediaoverlay.type.equals("controls"))
	//*  73  159:aload_3         
	//*  74  160:getfield        #899 <Field String APSMediaOverlay.type>
	//*  75  163:ldc2            #492 <String "controls">
	//*  76  166:invokevirtual   #380 <Method boolean String.equals(Object)>
	//*  77  169:ifeq            196
		{
			((Method) (obj1)).invoke(((Object) (apsmediaoverlay.controller)), new Object[] {
				_mainView
			});
	//   78  172:aload           5
	//   79  174:aload_3         
	//   80  175:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   81  178:iconst_1        
	//   82  179:anewarray       Object[]
	//   83  182:dup             
	//   84  183:iconst_0        
	//   85  184:aload_0         
	//   86  185:getfield        #326 <Field RelativeLayout _mainView>
	//   87  188:aastore         
	//   88  189:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//   89  192:pop             
			break MISSING_BLOCK_LABEL_217;
	//   90  193:goto            217
		}
		((Method) (obj1)).invoke(((Object) (apsmediaoverlay.controller)), new Object[] {
			_overlayContainer
		});
	//   91  196:aload           5
	//   92  198:aload_3         
	//   93  199:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//   94  202:iconst_1        
	//   95  203:anewarray       Object[]
	//   96  206:dup             
	//   97  207:iconst_0        
	//   98  208:aload_0         
	//   99  209:getfield        #329 <Field RelativeLayout _overlayContainer>
	//  100  212:aastore         
	//  101  213:invokevirtual   #564 <Method Object Method.invoke(Object, Object[])>
	//  102  216:pop             
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 103  217:getstatic       #1640 <Field int android.os.Build$VERSION.SDK_INT>
	//* 104  220:bipush          21
	//* 105  222:icmplt          243
		{
			apsmediaoverlay.controller.getView().setZ(apsmediaoverlay.zIndex);
	//  106  225:aload_3         
	//  107  226:getfield        #905 <Field APSMediaPlayerOverlayController APSMediaOverlay.controller>
	//  108  229:invokevirtual   #2063 <Method View APSMediaPlayerOverlayController.getView()>
	//  109  232:aload_3         
	//  110  233:getfield        #1026 <Field int APSMediaOverlay.zIndex>
	//  111  236:i2f             
	//  112  237:invokevirtual   #2066 <Method void View.setZ(float)>
			break MISSING_BLOCK_LABEL_301;
	//  113  240:goto            301
		}
		if(!isGoogleCastEnabled())
			break MISSING_BLOCK_LABEL_301;
	//  114  243:aload_0         
	//  115  244:invokevirtual   #2068 <Method boolean isGoogleCastEnabled()>
	//  116  247:ifeq            301
		obj1 = ((Object) (_overlayContainer.findViewWithTag("media-route-button")));
	//  117  250:aload_0         
	//  118  251:getfield        #329 <Field RelativeLayout _overlayContainer>
	//  119  254:ldc2            #901 <String "media-route-button">
	//  120  257:invokevirtual   #2072 <Method View RelativeLayout.findViewWithTag(Object)>
	//  121  260:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_301;
	//  122  262:aload           5
	//  123  264:ifnull          301
		((View) (obj1)).bringToFront();
	//  124  267:aload           5
	//  125  269:invokevirtual   #2075 <Method void View.bringToFront()>
_L1:
		if(i >= _overlayContainer.getChildCount())
			break MISSING_BLOCK_LABEL_301;
	//  126  272:iload_1         
	//  127  273:aload_0         
	//  128  274:getfield        #329 <Field RelativeLayout _overlayContainer>
	//  129  277:invokevirtual   #2078 <Method int RelativeLayout.getChildCount()>
	//  130  280:icmpge          301
		_overlayContainer.getChildAt(i).invalidate();
	//  131  283:aload_0         
	//  132  284:getfield        #329 <Field RelativeLayout _overlayContainer>
	//  133  287:iload_1         
	//  134  288:invokevirtual   #2082 <Method View RelativeLayout.getChildAt(int)>
	//  135  291:invokevirtual   #2085 <Method void View.invalidate()>
		i++;
	//  136  294:iload_1         
	//  137  295:iconst_1        
	//  138  296:iadd            
	//  139  297:istore_1        
		  goto _L1
	//* 140  298:goto            272
		AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
	//  141  301:new             #2044 <Class AlphaAnimation>
	//  142  304:dup             
	//  143  305:fconst_0        
	//  144  306:fconst_1        
	//  145  307:invokespecial   #2047 <Method void AlphaAnimation(float, float)>
	//  146  310:astore          5
		alphaanimation.setDuration((int)apsmediaoverlay.fadeInDuration * 1000);
	//  147  312:aload           5
	//  148  314:aload_3         
	//  149  315:getfield        #2088 <Field float APSMediaOverlay.fadeInDuration>
	//  150  318:f2i             
	//  151  319:sipush          1000
	//  152  322:imul            
	//  153  323:i2l             
	//  154  324:invokevirtual   #2053 <Method void AlphaAnimation.setDuration(long)>
		alphaanimation.setFillAfter(true);
	//  155  327:aload           5
	//  156  329:iconst_1        
	//  157  330:invokevirtual   #2056 <Method void AlphaAnimation.setFillAfter(boolean)>
		((View) (obj)).startAnimation(((android.view.animation.Animation) (alphaanimation)));
	//  158  333:aload           4
	//  159  335:aload           5
	//  160  337:invokevirtual   #2060 <Method void View.startAnimation(android.view.animation.Animation)>
		trackforEvent((ArrayList)apsmediaoverlay.trackingURLs.get("launch"), "launch for non-linear", APSMediaTrackingEvents.MediaEventType.LAUNCH, ((APSMediaEvent) (apsmediaoverlay)));
	//  161  340:aload_0         
	//  162  341:aload_3         
	//  163  342:getfield        #2003 <Field HashMap APSMediaOverlay.trackingURLs>
	//  164  345:ldc2            #775 <String "launch">
	//  165  348:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//  166  351:checkcast       #232 <Class ArrayList>
	//  167  354:ldc2            #1523 <String "launch for non-linear">
	//  168  357:getstatic       #780 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.LAUNCH>
	//  169  360:aload_3         
	//  170  361:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		trackforEvent((ArrayList)apsmediaoverlay.trackingURLs.get("impression"), "impression for ad", APSMediaTrackingEvents.MediaEventType.IMPRESSION, ((APSMediaEvent) (apsmediaoverlay)));
	//  171  364:aload_0         
	//  172  365:aload_3         
	//  173  366:getfield        #2003 <Field HashMap APSMediaOverlay.trackingURLs>
	//  174  369:ldc2            #1525 <String "impression">
	//  175  372:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//  176  375:checkcast       #232 <Class ArrayList>
	//  177  378:ldc2            #2090 <String "impression for ad">
	//  178  381:getstatic       #1528 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.IMPRESSION>
	//  179  384:aload_3         
	//  180  385:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		trackforEvent((ArrayList)apsmediaoverlay.trackingURLs.get("creativeView"), "creativeView for non-linear", APSMediaTrackingEvents.MediaEventType.CREATIVE_VIEW, ((APSMediaEvent) (apsmediaoverlay)));
	//  181  388:aload_0         
	//  182  389:aload_3         
	//  183  390:getfield        #2003 <Field HashMap APSMediaOverlay.trackingURLs>
	//  184  393:ldc2            #1530 <String "creativeView">
	//  185  396:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//  186  399:checkcast       #232 <Class ArrayList>
	//  187  402:ldc2            #2092 <String "creativeView for non-linear">
	//  188  405:getstatic       #1533 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.CREATIVE_VIEW>
	//  189  408:aload_3         
	//  190  409:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		continue; /* Loop/switch isn't completed */
	//  191  412:goto            8
		return;
	//  192  415:return          
		Exception exception;
		exception;
	//  193  416:astore_3        
		if(true) goto _L3; else goto _L2
_L2:
	//* 194  417:goto            8
	}

	public void userPinched(float f)
	{
		APSMediaUnit apsmediaunit = _currentUnit;
	//    0    0:aload_0         
	//    1    1:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    2    4:astore_2        
		if(apsmediaunit != null && apsmediaunit.pinchToFullscreen && (f > 1.0F && !_isFullscreen || f < 1.0F && _isFullscreen))
	//*   3    5:aload_2         
	//*   4    6:ifnull          46
	//*   5    9:aload_2         
	//*   6   10:getfield        #2096 <Field boolean APSMediaUnit.pinchToFullscreen>
	//*   7   13:ifeq            46
	//*   8   16:fload_1         
	//*   9   17:fconst_1        
	//*  10   18:fcmpl           
	//*  11   19:ifle            29
	//*  12   22:aload_0         
	//*  13   23:getfield        #1137 <Field boolean _isFullscreen>
	//*  14   26:ifeq            42
	//*  15   29:fload_1         
	//*  16   30:fconst_1        
	//*  17   31:fcmpg           
	//*  18   32:ifge            46
	//*  19   35:aload_0         
	//*  20   36:getfield        #1137 <Field boolean _isFullscreen>
	//*  21   39:ifeq            46
			toggleFullscreen();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #1608 <Method void toggleFullscreen()>
	//   24   46:return          
	}

	public ViewGroup viewController()
	{
		return ((ViewGroup) (_mainView));
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field RelativeLayout _mainView>
	//    2    4:areturn         
	}

	public void volumeChanged(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            46
		{
			_muted = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #199 <Field boolean _muted>
			APSMediaUnit apsmediaunit = _currentUnit;
	//    5    9:aload_0         
	//    6   10:getfield        #615 <Field APSMediaUnit _currentUnit>
	//    7   13:astore_2        
			if(apsmediaunit != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          94
			{
				trackforEvent((ArrayList)apsmediaunit.trackingURLs.get("mute"), "mute", APSMediaTrackingEvents.MediaEventType.MUTE, ((APSMediaEvent) (_currentUnit)));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   13   23:ldc2            #2101 <String "mute">
	//   14   26:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   15   29:checkcast       #232 <Class ArrayList>
	//   16   32:ldc2            #2101 <String "mute">
	//   17   35:getstatic       #2104 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.MUTE>
	//   18   38:aload_0         
	//   19   39:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   20   42:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
				return;
	//   21   45:return          
			}
		} else
		if(_muted)
	//*  22   46:aload_0         
	//*  23   47:getfield        #199 <Field boolean _muted>
	//*  24   50:ifeq            94
		{
			_muted = false;
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:putfield        #199 <Field boolean _muted>
			APSMediaUnit apsmediaunit1 = _currentUnit;
	//   28   58:aload_0         
	//   29   59:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   30   62:astore_2        
			if(apsmediaunit1 != null)
	//*  31   63:aload_2         
	//*  32   64:ifnull          94
				trackforEvent((ArrayList)apsmediaunit1.trackingURLs.get("unmute"), "unmute", APSMediaTrackingEvents.MediaEventType.UNMUTE, ((APSMediaEvent) (_currentUnit)));
	//   33   67:aload_0         
	//   34   68:aload_2         
	//   35   69:getfield        #345 <Field HashMap APSMediaUnit.trackingURLs>
	//   36   72:ldc2            #2106 <String "unmute">
	//   37   75:invokevirtual   #398 <Method Object HashMap.get(Object)>
	//   38   78:checkcast       #232 <Class ArrayList>
	//   39   81:ldc2            #2106 <String "unmute">
	//   40   84:getstatic       #2109 <Field APSMediaTrackingEvents$MediaEventType APSMediaTrackingEvents$MediaEventType.UNMUTE>
	//   41   87:aload_0         
	//   42   88:getfield        #615 <Field APSMediaUnit _currentUnit>
	//   43   91:invokevirtual   #784 <Method void trackforEvent(ArrayList, String, APSMediaTrackingEvents$MediaEventType, APSMediaEvent)>
		}
	//   44   94:return          
	}

	public static final String APSMoviePlayerControlsDisplayedNotification = "com.appscend.mp.notifications.controlsdisplayed";
	public static final String APSMoviePlayerControlsHiddenNotification = "com.appscend.mp.notifications.controlshidden";
	public static final String APSMoviePlayerErrorNotification = "com.appscend.mp.notifications.error";
	public static final String APSMoviePlayerFinishedNotification = "com.appscend.mp.notifications.finished";
	public static final String APSMoviePlayerStatusChangedNotification = "com.appscend.mp.notifications.statuschanged";
	public static final String APSMoviePlayerUpdateNotification = "com.appscend.mp.notifications.update";
	public static final String APSMoviePlayerWasTappedNotification = "com.appscend.mp.notifications.playertapped";
	private static Handler handler;
	private static APSMediaPlayer instance;
	public static final String kAPSMediaPlayerDRMPluginsGroup = "com.appscend.mp.drm";
	public static final String kAPSMediaPlayerFrameworkExtensionsGroup = "com.appscend.mp.frameworkextensions";
	public static final String kAPSMediaPlayerOverlayControllersGroup = "com.appscend.mp.controllers.overlay";
	public static final String kAPSMediaPlayerRenderersGroup = "com.appscend.mp.renderers";
	private long _cachedPlaybackTime;
	public APSMediaUnit _currentUnit;
	private boolean _durationAvailable;
	HashMap _dynamicTracking;
	CopyOnWriteArrayList _eventsToInsert;
	CopyOnWriteArrayList _eventsToTrigger;
	private boolean _goBack;
	CopyOnWriteArrayList _ignoredEvents;
	private boolean _isFullscreen;
	private RelativeLayout _mainView;
	private ArrayList _mediaUnits;
	boolean _muted;
	private int _nextPlaylistIndex;
	private RelativeLayout _overlayContainer;
	public CopyOnWriteArrayList _overlaysDisplayed;
	private boolean _paused;
	private int _playableDuration;
	private MPMoviePlaybackState _playbackState;
	CopyOnWriteArrayList _preloadedEvents;
	private IVeeplayRenderer _renderer;
	private RelativeLayout _rendererContainer;
	private boolean _skipped;
	CopyOnWriteArrayList _triggeredEvents;
	public APSMediaPlayerActionDelegate actionDelegate;
	private Activity activity;
	public String advertisingIdentifier;
	public boolean backgroundServiceStarted;
	private boolean currentlyInFullscreenOverlayActivity;
	private CopyOnWriteArrayList eventListeners;
	private FullscreenOrientationBehaviour fullscreenOrientationBehaviour;
	private GestureDetectorCompat gestureDetector;
	public HandlerThread handlerThread;
	private OkHttpClient httpClient;
	ImageView hudlessLoadImageView;
	private boolean isGoogleCastEnabled;
	private boolean isProcessing;
	private boolean isSeeking;
	private ViewGroup mainViewParent;
	private ScaleGestureDetector pinchFullscreen;
	public boolean restrictRootedAccess;
	private int savedOrientation;
	private boolean secureSurfaceView;
	TimerTask timerTask;
	private String userAgent;
	private Dialog videoDialog;
	private int videoViewPosition;
	VolumeChangeObserver volumeChangeObserver;
	private String youtubeApiKey;

	static 
	{
	//    0    0:return          
	}


/*
	static ScaleGestureDetector access$000(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer.pinchFullscreen;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field ScaleGestureDetector pinchFullscreen>
	//    2    4:areturn         
	}

*/


/*
	static GestureDetectorCompat access$100(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer.gestureDetector;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field GestureDetectorCompat gestureDetector>
	//    2    4:areturn         
	}

*/


/*
	static void access$1000(APSMediaPlayer apsmediaplayer, int i)
	{
		apsmediaplayer.processToTriggerEvents(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #291 <Method void processToTriggerEvents(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1100(APSMediaPlayer apsmediaplayer, int i)
	{
		apsmediaplayer.processPreloadedEvents(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #295 <Method void processPreloadedEvents(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1200(APSMediaPlayer apsmediaplayer, int i)
	{
		apsmediaplayer.processTriggeredEvents(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #299 <Method void processTriggeredEvents(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$1300(APSMediaPlayer apsmediaplayer)
	{
		apsmediaplayer.positionDynamicEvents();
	//    0    0:aload_0         
	//    1    1:invokespecial   #304 <Method void positionDynamicEvents()>
		return;
	//    2    4:return          
	}

*/


/*
	static int access$1400(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer._nextPlaylistIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field int _nextPlaylistIndex>
	//    2    4:ireturn         
	}

*/


/*
	static ArrayList access$1500(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer._mediaUnits;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ArrayList _mediaUnits>
	//    2    4:areturn         
	}

*/


/*
	static Activity access$1600(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer.activity;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field Activity activity>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$1700()
	{
		return handler;
	//    0    0:getstatic       #316 <Field Handler handler>
	//    1    3:areturn         
	}

*/


/*
	static void access$1800(APSMediaPlayer apsmediaplayer)
	{
		apsmediaplayer.processQueue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #320 <Method void processQueue()>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$300(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer.userAgent;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field String userAgent>
	//    2    4:areturn         
	}

*/


/*
	static RelativeLayout access$400(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer._mainView;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field RelativeLayout _mainView>
	//    2    4:areturn         
	}

*/


/*
	static RelativeLayout access$500(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer._overlayContainer;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field RelativeLayout _overlayContainer>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$600(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer.isSeeking;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field boolean isSeeking>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$700(APSMediaPlayer apsmediaplayer)
	{
		return apsmediaplayer._durationAvailable;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field boolean _durationAvailable>
	//    2    4:ireturn         
	}

*/


/*
	static void access$800(APSMediaPlayer apsmediaplayer, int i)
	{
		apsmediaplayer.durationAvailable(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #336 <Method void durationAvailable(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static long access$902(APSMediaPlayer apsmediaplayer, long l)
	{
		apsmediaplayer._cachedPlaybackTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #193 <Field long _cachedPlaybackTime>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/
}
