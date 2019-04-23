// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.*;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.*;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.*;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi21, MediaControllerCompat, MediaButtonReceiver, PlaybackStateCompat, 
//			MediaSessionCompatApi24, MediaSessionCompatApi23, IMediaSession, IMediaControllerCallback, 
//			ParcelableVolumeInfo, MediaSessionCompatApi22

public class MediaSessionCompat
{
	public static abstract class Callback
	{

		void handleMediaPlayPauseKeySingleTapIfPending(android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo)
		{
			if(!mMediaPlayPauseKeyPending)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field boolean mMediaPlayPauseKeyPending>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			boolean flag2 = false;
		//    4    8:iconst_0        
		//    5    9:istore          4
			mMediaPlayPauseKeyPending = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #68  <Field boolean mMediaPlayPauseKeyPending>
			mCallbackHandler.removeMessages(1);
		//    9   16:aload_0         
		//   10   17:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   11   20:iconst_1        
		//   12   21:invokevirtual   #72  <Method void MediaSessionCompat$Callback$CallbackHandler.removeMessages(int)>
			MediaSessionImpl mediasessionimpl = (MediaSessionImpl)mSessionImpl.get();
		//   13   24:aload_0         
		//   14   25:getfield        #74  <Field WeakReference mSessionImpl>
		//   15   28:invokevirtual   #80  <Method Object WeakReference.get()>
		//   16   31:checkcast       #82  <Class MediaSessionCompat$MediaSessionImpl>
		//   17   34:astore          7
			if(mediasessionimpl == null)
		//*  18   36:aload           7
		//*  19   38:ifnonnull       42
				return;
		//   20   41:return          
			PlaybackStateCompat playbackstatecompat = mediasessionimpl.getPlaybackState();
		//   21   42:aload           7
		//   22   44:invokeinterface #86  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImpl.getPlaybackState()>
		//   23   49:astore          8
			long l;
			if(playbackstatecompat == null)
		//*  24   51:aload           8
		//*  25   53:ifnonnull       62
				l = 0L;
		//   26   56:lconst_0        
		//   27   57:lstore          5
			else
		//*  28   59:goto            69
				l = playbackstatecompat.getActions();
		//   29   62:aload           8
		//   30   64:invokevirtual   #92  <Method long PlaybackStateCompat.getActions()>
		//   31   67:lstore          5
			boolean flag;
			if(playbackstatecompat != null && playbackstatecompat.getState() == 3)
		//*  32   69:aload           8
		//*  33   71:ifnull          88
		//*  34   74:aload           8
		//*  35   76:invokevirtual   #96  <Method int PlaybackStateCompat.getState()>
		//*  36   79:iconst_3        
		//*  37   80:icmpne          88
				flag = true;
		//   38   83:iconst_1        
		//   39   84:istore_2        
			else
		//*  40   85:goto            90
				flag = false;
		//   41   88:iconst_0        
		//   42   89:istore_2        
			boolean flag1;
			if((516L & l) != 0L)
		//*  43   90:ldc2w           #97  <Long 516L>
		//*  44   93:lload           5
		//*  45   95:land            
		//*  46   96:lconst_0        
		//*  47   97:lcmp            
		//*  48   98:ifeq            106
				flag1 = true;
		//   49  101:iconst_1        
		//   50  102:istore_3        
			else
		//*  51  103:goto            108
				flag1 = false;
		//   52  106:iconst_0        
		//   53  107:istore_3        
			if((l & 514L) != 0L)
		//*  54  108:lload           5
		//*  55  110:ldc2w           #99  <Long 514L>
		//*  56  113:land            
		//*  57  114:lconst_0        
		//*  58  115:lcmp            
		//*  59  116:ifeq            122
				flag2 = true;
		//   60  119:iconst_1        
		//   61  120:istore          4
			mediasessionimpl.setCurrentControllerInfo(remoteuserinfo);
		//   62  122:aload           7
		//   63  124:aload_1         
		//   64  125:invokeinterface #103 <Method void MediaSessionCompat$MediaSessionImpl.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
			if(flag && flag2)
		//*  65  130:iload_2         
		//*  66  131:ifeq            146
		//*  67  134:iload           4
		//*  68  136:ifeq            146
				onPause();
		//   69  139:aload_0         
		//   70  140:invokevirtual   #106 <Method void onPause()>
			else
		//*  71  143:goto            158
			if(!flag && flag1)
		//*  72  146:iload_2         
		//*  73  147:ifne            158
		//*  74  150:iload_3         
		//*  75  151:ifeq            158
				onPlay();
		//   76  154:aload_0         
		//   77  155:invokevirtual   #109 <Method void onPlay()>
			mediasessionimpl.setCurrentControllerInfo(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (null)));
		//   78  158:aload           7
		//   79  160:aconst_null     
		//   80  161:invokeinterface #103 <Method void MediaSessionCompat$MediaSessionImpl.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
		//   81  166:return          
		}

		public void onAddQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
		//    0    0:return          
		}

		public void onAddQueueItem(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
		//    0    0:return          
		}

		public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
		//    0    0:return          
		}

		public void onCustomAction(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onFastForward()
		{
		//    0    0:return          
		}

		public boolean onMediaButtonEvent(Intent intent)
		{
			if(android.os.Build.VERSION.SDK_INT >= 27)
		//*   0    0:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          27
		//*   2    5:icmplt          10
				return false;
		//    3    8:iconst_0        
		//    4    9:ireturn         
			MediaSessionImpl mediasessionimpl = (MediaSessionImpl)mSessionImpl.get();
		//    5   10:aload_0         
		//    6   11:getfield        #74  <Field WeakReference mSessionImpl>
		//    7   14:invokevirtual   #80  <Method Object WeakReference.get()>
		//    8   17:checkcast       #82  <Class MediaSessionCompat$MediaSessionImpl>
		//    9   20:astore          5
			if(mediasessionimpl != null)
		//*  10   22:aload           5
		//*  11   24:ifnull          200
			{
				if(mCallbackHandler == null)
		//*  12   27:aload_0         
		//*  13   28:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//*  14   31:ifnonnull       36
					return false;
		//   15   34:iconst_0        
		//   16   35:ireturn         
				KeyEvent keyevent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
		//   17   36:aload_1         
		//   18   37:ldc1            #121 <String "android.intent.extra.KEY_EVENT">
		//   19   39:invokevirtual   #127 <Method Parcelable Intent.getParcelableExtra(String)>
		//   20   42:checkcast       #129 <Class KeyEvent>
		//   21   45:astore          6
				if(keyevent != null)
		//*  22   47:aload           6
		//*  23   49:ifnull          198
				{
					if(keyevent.getAction() != 0)
		//*  24   52:aload           6
		//*  25   54:invokevirtual   #132 <Method int KeyEvent.getAction()>
		//*  26   57:ifeq            62
						return false;
		//   27   60:iconst_0        
		//   28   61:ireturn         
					intent = ((Intent) (mediasessionimpl.getCurrentControllerInfo()));
		//   29   62:aload           5
		//   30   64:invokeinterface #136 <Method android.support.v4.media.MediaSessionManager$RemoteUserInfo MediaSessionCompat$MediaSessionImpl.getCurrentControllerInfo()>
		//   31   69:astore_1        
					int i = keyevent.getKeyCode();
		//   32   70:aload           6
		//   33   72:invokevirtual   #139 <Method int KeyEvent.getKeyCode()>
		//   34   75:istore_2        
					if(i != 79 && i != 85)
		//*  35   76:iload_2         
		//*  36   77:bipush          79
		//*  37   79:icmpeq          95
		//*  38   82:iload_2         
		//*  39   83:bipush          85
		//*  40   85:icmpeq          95
					{
						handleMediaPlayPauseKeySingleTapIfPending(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (intent)));
		//   41   88:aload_0         
		//   42   89:aload_1         
		//   43   90:invokevirtual   #141 <Method void handleMediaPlayPauseKeySingleTapIfPending(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
						return false;
		//   44   93:iconst_0        
		//   45   94:ireturn         
					}
					if(keyevent.getRepeatCount() > 0)
		//*  46   95:aload           6
		//*  47   97:invokevirtual   #144 <Method int KeyEvent.getRepeatCount()>
		//*  48  100:ifle            110
					{
						handleMediaPlayPauseKeySingleTapIfPending(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (intent)));
		//   49  103:aload_0         
		//   50  104:aload_1         
		//   51  105:invokevirtual   #141 <Method void handleMediaPlayPauseKeySingleTapIfPending(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
						return true;
		//   52  108:iconst_1        
		//   53  109:ireturn         
					}
					if(mMediaPlayPauseKeyPending)
		//*  54  110:aload_0         
		//*  55  111:getfield        #68  <Field boolean mMediaPlayPauseKeyPending>
		//*  56  114:ifeq            168
					{
						mCallbackHandler.removeMessages(1);
		//   57  117:aload_0         
		//   58  118:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   59  121:iconst_1        
		//   60  122:invokevirtual   #72  <Method void MediaSessionCompat$Callback$CallbackHandler.removeMessages(int)>
						mMediaPlayPauseKeyPending = false;
		//   61  125:aload_0         
		//   62  126:iconst_0        
		//   63  127:putfield        #68  <Field boolean mMediaPlayPauseKeyPending>
						intent = ((Intent) (mediasessionimpl.getPlaybackState()));
		//   64  130:aload           5
		//   65  132:invokeinterface #86  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImpl.getPlaybackState()>
		//   66  137:astore_1        
						long l;
						if(intent == null)
		//*  67  138:aload_1         
		//*  68  139:ifnonnull       147
							l = 0L;
		//   69  142:lconst_0        
		//   70  143:lstore_3        
						else
		//*  71  144:goto            152
							l = ((PlaybackStateCompat) (intent)).getActions();
		//   72  147:aload_1         
		//   73  148:invokevirtual   #92  <Method long PlaybackStateCompat.getActions()>
		//   74  151:lstore_3        
						if((l & 32L) != 0L)
		//*  75  152:lload_3         
		//*  76  153:ldc2w           #145 <Long 32L>
		//*  77  156:land            
		//*  78  157:lconst_0        
		//*  79  158:lcmp            
		//*  80  159:ifeq            196
						{
							onSkipToNext();
		//   81  162:aload_0         
		//   82  163:invokevirtual   #149 <Method void onSkipToNext()>
							return true;
		//   83  166:iconst_1        
		//   84  167:ireturn         
						}
					} else
					{
						mMediaPlayPauseKeyPending = true;
		//   85  168:aload_0         
		//   86  169:iconst_1        
		//   87  170:putfield        #68  <Field boolean mMediaPlayPauseKeyPending>
						CallbackHandler callbackhandler = mCallbackHandler;
		//   88  173:aload_0         
		//   89  174:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   90  177:astore          5
						callbackhandler.sendMessageDelayed(callbackhandler.obtainMessage(1, ((Object) (intent))), ViewConfiguration.getDoubleTapTimeout());
		//   91  179:aload           5
		//   92  181:aload           5
		//   93  183:iconst_1        
		//   94  184:aload_1         
		//   95  185:invokevirtual   #153 <Method Message MediaSessionCompat$Callback$CallbackHandler.obtainMessage(int, Object)>
		//   96  188:invokestatic    #158 <Method int ViewConfiguration.getDoubleTapTimeout()>
		//   97  191:i2l             
		//   98  192:invokevirtual   #162 <Method boolean MediaSessionCompat$Callback$CallbackHandler.sendMessageDelayed(Message, long)>
		//   99  195:pop             
					}
					return true;
		//  100  196:iconst_1        
		//  101  197:ireturn         
				} else
				{
					return false;
		//  102  198:iconst_0        
		//  103  199:ireturn         
				}
			} else
			{
				return false;
		//  104  200:iconst_0        
		//  105  201:ireturn         
			}
		}

		public void onPause()
		{
		//    0    0:return          
		}

		public void onPlay()
		{
		//    0    0:return          
		}

		public void onPlayFromMediaId(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onPlayFromSearch(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onPlayFromUri(Uri uri, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onPrepare()
		{
		//    0    0:return          
		}

		public void onPrepareFromMediaId(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onPrepareFromSearch(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onPrepareFromUri(Uri uri, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onRemoveQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
		//    0    0:return          
		}

		public void onRemoveQueueItemAt(int i)
		{
		//    0    0:return          
		}

		public void onRewind()
		{
		//    0    0:return          
		}

		public void onSeekTo(long l)
		{
		//    0    0:return          
		}

		public void onSetCaptioningEnabled(boolean flag)
		{
		//    0    0:return          
		}

		public void onSetRating(RatingCompat ratingcompat)
		{
		//    0    0:return          
		}

		public void onSetRating(RatingCompat ratingcompat, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onSetRepeatMode(int i)
		{
		//    0    0:return          
		}

		public void onSetShuffleMode(int i)
		{
		//    0    0:return          
		}

		public void onSkipToNext()
		{
		//    0    0:return          
		}

		public void onSkipToPrevious()
		{
		//    0    0:return          
		}

		public void onSkipToQueueItem(long l)
		{
		//    0    0:return          
		}

		public void onStop()
		{
		//    0    0:return          
		}

		void setSessionImpl(MediaSessionImpl mediasessionimpl, Handler handler)
		{
			mSessionImpl = new WeakReference(((Object) (mediasessionimpl)));
		//    0    0:aload_0         
		//    1    1:new             #76  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #192 <Method void WeakReference(Object)>
		//    5    9:putfield        #74  <Field WeakReference mSessionImpl>
			mediasessionimpl = ((MediaSessionImpl) (mCallbackHandler));
		//    6   12:aload_0         
		//    7   13:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//    8   16:astore_1        
			if(mediasessionimpl != null)
		//*   9   17:aload_1         
		//*  10   18:ifnull          26
				((CallbackHandler) (mediasessionimpl)).removeCallbacksAndMessages(((Object) (null)));
		//   11   21:aload_1         
		//   12   22:aconst_null     
		//   13   23:invokevirtual   #195 <Method void MediaSessionCompat$Callback$CallbackHandler.removeCallbacksAndMessages(Object)>
			mCallbackHandler = new CallbackHandler(handler.getLooper());
		//   14   26:aload_0         
		//   15   27:new             #9   <Class MediaSessionCompat$Callback$CallbackHandler>
		//   16   30:dup             
		//   17   31:aload_0         
		//   18   32:aload_2         
		//   19   33:invokevirtual   #201 <Method Looper Handler.getLooper()>
		//   20   36:invokespecial   #204 <Method void MediaSessionCompat$Callback$CallbackHandler(MediaSessionCompat$Callback, Looper)>
		//   21   39:putfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   22   42:return          
		}

		private CallbackHandler mCallbackHandler;
		final Object mCallbackObj;
		private boolean mMediaPlayPauseKeyPending;
		WeakReference mSessionImpl;

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			mCallbackHandler = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   5    9:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   12:bipush          24
		//*   7   14:icmplt          33
			{
				mCallbackObj = MediaSessionCompatApi24.createCallback(((MediaSessionCompatApi24.Callback) (new StubApi24())));
		//    8   17:aload_0         
		//    9   18:new             #18  <Class MediaSessionCompat$Callback$StubApi24>
		//   10   21:dup             
		//   11   22:aload_0         
		//   12   23:invokespecial   #43  <Method void MediaSessionCompat$Callback$StubApi24(MediaSessionCompat$Callback)>
		//   13   26:invokestatic    #49  <Method Object MediaSessionCompatApi24.createCallback(MediaSessionCompatApi24$Callback)>
		//   14   29:putfield        #51  <Field Object mCallbackObj>
				return;
		//   15   32:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//*  16   33:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   36:bipush          23
		//*  18   38:icmplt          57
			{
				mCallbackObj = MediaSessionCompatApi23.createCallback(((MediaSessionCompatApi23.Callback) (new StubApi23())));
		//   19   41:aload_0         
		//   20   42:new             #15  <Class MediaSessionCompat$Callback$StubApi23>
		//   21   45:dup             
		//   22   46:aload_0         
		//   23   47:invokespecial   #52  <Method void MediaSessionCompat$Callback$StubApi23(MediaSessionCompat$Callback)>
		//   24   50:invokestatic    #57  <Method Object MediaSessionCompatApi23.createCallback(MediaSessionCompatApi23$Callback)>
		//   25   53:putfield        #51  <Field Object mCallbackObj>
				return;
		//   26   56:return          
			}
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  27   57:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
		//*  28   60:bipush          21
		//*  29   62:icmplt          81
			{
				mCallbackObj = MediaSessionCompatApi21.createCallback(((MediaSessionCompatApi21.Callback) (new StubApi21())));
		//   30   65:aload_0         
		//   31   66:new             #12  <Class MediaSessionCompat$Callback$StubApi21>
		//   32   69:dup             
		//   33   70:aload_0         
		//   34   71:invokespecial   #58  <Method void MediaSessionCompat$Callback$StubApi21(MediaSessionCompat$Callback)>
		//   35   74:invokestatic    #63  <Method Object MediaSessionCompatApi21.createCallback(MediaSessionCompatApi21$Callback)>
		//   36   77:putfield        #51  <Field Object mCallbackObj>
				return;
		//   37   80:return          
			} else
			{
				mCallbackObj = null;
		//   38   81:aload_0         
		//   39   82:aconst_null     
		//   40   83:putfield        #51  <Field Object mCallbackObj>
				return;
		//   41   86:return          
			}
		}
	}

	private class Callback.CallbackHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			if(message.what == 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #30  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          22
				handleMediaPlayPauseKeySingleTapIfPending((android.support.v4.media.MediaSessionManager.RemoteUserInfo)message.obj);
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field MediaSessionCompat$Callback this$0>
		//    6   12:aload_1         
		//    7   13:getfield        #34  <Field Object Message.obj>
		//    8   16:checkcast       #36  <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
		//    9   19:invokevirtual   #40  <Method void MediaSessionCompat$Callback.handleMediaPlayPauseKeySingleTapIfPending(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
		//   10   22:return          
		}

		private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
		final Callback this$0;

		Callback.CallbackHandler(Looper looper)
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field MediaSessionCompat$Callback this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #22  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	private class Callback.StubApi21
		implements MediaSessionCompatApi21.Callback
	{

		public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			boolean flag = s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
		//    0    0:aload_1         
		//    1    1:ldc1            #31  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    2    3:invokevirtual   #37  <Method boolean String.equals(Object)>
		//    3    6:istore          5
			Object obj;
			Token token;
			token = null;
		//    4    8:aconst_null     
		//    5    9:astore          7
			obj = null;
		//    6   11:aconst_null     
		//    7   12:astore          6
			if(!flag)
				break MISSING_BLOCK_LABEL_99;
		//    8   14:iload           5
		//    9   16:ifeq            99
			s = ((String) ((MediaSessionImplApi21)mSessionImpl.get()));
		//   10   19:aload_0         
		//   11   20:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   12   23:getfield        #41  <Field WeakReference MediaSessionCompat$Callback.mSessionImpl>
		//   13   26:invokevirtual   #47  <Method Object WeakReference.get()>
		//   14   29:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
		//   15   32:astore_1        
			if(s == null)
				break MISSING_BLOCK_LABEL_301;
		//   16   33:aload_1         
		//   17   34:ifnull          301
			bundle = new Bundle();
		//   18   37:new             #51  <Class Bundle>
		//   19   40:dup             
		//   20   41:invokespecial   #52  <Method void Bundle()>
		//   21   44:astore_2        
			token = ((MediaSessionImplApi21) (s)).getSessionToken();
		//   22   45:aload_1         
		//   23   46:invokevirtual   #56  <Method MediaSessionCompat$Token MediaSessionCompat$MediaSessionImplApi21.getSessionToken()>
		//   24   49:astore          7
			s = ((String) (token.getExtraBinder()));
		//   25   51:aload           7
		//   26   53:invokevirtual   #62  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   27   56:astore_1        
			if(s == null)
		//*  28   57:aload_1         
		//*  29   58:ifnonnull       67
			{
				s = ((String) (obj));
		//   30   61:aload           6
		//   31   63:astore_1        
				break MISSING_BLOCK_LABEL_74;
		//   32   64:goto            74
			}
			s = ((String) (((IMediaSession) (s)).asBinder()));
		//   33   67:aload_1         
		//   34   68:invokeinterface #68  <Method IBinder IMediaSession.asBinder()>
		//   35   73:astore_1        
			BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((IBinder) (s)));
		//   36   74:aload_2         
		//   37   75:ldc1            #70  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   38   77:aload_1         
		//   39   78:invokestatic    #76  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
			bundle.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", token.getSessionToken2Bundle());
		//   40   81:aload_2         
		//   41   82:ldc1            #78  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
		//   42   84:aload           7
		//   43   86:invokevirtual   #82  <Method Bundle MediaSessionCompat$Token.getSessionToken2Bundle()>
		//   44   89:invokevirtual   #86  <Method void Bundle.putBundle(String, Bundle)>
			resultreceiver.send(0, bundle);
		//   45   92:aload_3         
		//   46   93:iconst_0        
		//   47   94:aload_2         
		//   48   95:invokevirtual   #92  <Method void ResultReceiver.send(int, Bundle)>
			return;
		//   49   98:return          
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM"))
		//*  50   99:aload_1         
		//*  51  100:ldc1            #94  <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//*  52  102:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  53  105:ifeq            125
			{
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   54  108:aload_0         
		//   55  109:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   56  112:aload_2         
		//   57  113:ldc1            #96  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   58  115:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   59  118:checkcast       #102 <Class MediaDescriptionCompat>
		//   60  121:invokevirtual   #106 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//   61  124:return          
			}
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"))
		//*  62  125:aload_1         
		//*  63  126:ldc1            #108 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//*  64  128:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  65  131:ifeq            157
			{
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
		//   66  134:aload_0         
		//   67  135:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   68  138:aload_2         
		//   69  139:ldc1            #96  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   70  141:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   71  144:checkcast       #102 <Class MediaDescriptionCompat>
		//   72  147:aload_2         
		//   73  148:ldc1            #110 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   74  150:invokevirtual   #114 <Method int Bundle.getInt(String)>
		//   75  153:invokevirtual   #117 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//   76  156:return          
			}
			if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"))
		//*  77  157:aload_1         
		//*  78  158:ldc1            #119 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//*  79  160:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  80  163:ifeq            183
			{
				onRemoveQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   81  166:aload_0         
		//   82  167:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   83  170:aload_2         
		//   84  171:ldc1            #96  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   85  173:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   86  176:checkcast       #102 <Class MediaDescriptionCompat>
		//   87  179:invokevirtual   #122 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//   88  182:return          
			}
			if(!s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"))
				break MISSING_BLOCK_LABEL_282;
		//   89  183:aload_1         
		//   90  184:ldc1            #124 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT">
		//   91  186:invokevirtual   #37  <Method boolean String.equals(Object)>
		//   92  189:ifeq            282
			resultreceiver = ((ResultReceiver) ((MediaSessionImplApi21)mSessionImpl.get()));
		//   93  192:aload_0         
		//   94  193:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   95  196:getfield        #41  <Field WeakReference MediaSessionCompat$Callback.mSessionImpl>
		//   96  199:invokevirtual   #47  <Method Object WeakReference.get()>
		//   97  202:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
		//   98  205:astore_3        
			if(resultreceiver == null)
				break MISSING_BLOCK_LABEL_301;
		//   99  206:aload_3         
		//  100  207:ifnull          301
			int i;
			if(((MediaSessionImplApi21) (resultreceiver)).mQueue == null)
				break MISSING_BLOCK_LABEL_301;
		//  101  210:aload_3         
		//  102  211:getfield        #128 <Field List MediaSessionCompat$MediaSessionImplApi21.mQueue>
		//  103  214:ifnull          301
			i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
		//  104  217:aload_2         
		//  105  218:ldc1            #110 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//  106  220:iconst_m1       
		//  107  221:invokevirtual   #131 <Method int Bundle.getInt(String, int)>
		//  108  224:istore          4
			s = ((String) (token));
		//  109  226:aload           7
		//  110  228:astore_1        
			if(i < 0)
				break MISSING_BLOCK_LABEL_266;
		//  111  229:iload           4
		//  112  231:iflt            266
			s = ((String) (token));
		//  113  234:aload           7
		//  114  236:astore_1        
			if(i < ((MediaSessionImplApi21) (resultreceiver)).mQueue.size())
		//* 115  237:iload           4
		//* 116  239:aload_3         
		//* 117  240:getfield        #128 <Field List MediaSessionCompat$MediaSessionImplApi21.mQueue>
		//* 118  243:invokeinterface #137 <Method int List.size()>
		//* 119  248:icmpge          266
				s = ((String) ((QueueItem)((MediaSessionImplApi21) (resultreceiver)).mQueue.get(i)));
		//  120  251:aload_3         
		//  121  252:getfield        #128 <Field List MediaSessionCompat$MediaSessionImplApi21.mQueue>
		//  122  255:iload           4
		//  123  257:invokeinterface #140 <Method Object List.get(int)>
		//  124  262:checkcast       #142 <Class MediaSessionCompat$QueueItem>
		//  125  265:astore_1        
			if(s != null)
		//* 126  266:aload_1         
		//* 127  267:ifnull          301
				try
				{
					onRemoveQueueItem(((QueueItem) (s)).getDescription());
		//  128  270:aload_0         
		//  129  271:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  130  274:aload_1         
		//  131  275:invokevirtual   #146 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//  132  278:invokevirtual   #122 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
					return;
		//  133  281:return          
				}
		//* 134  282:aload_0         
		//* 135  283:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//* 136  286:aload_1         
		//* 137  287:aload_2         
		//* 138  288:aload_3         
		//* 139  289:invokevirtual   #148 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
		//* 140  292:return          
		//* 141  293:ldc1            #150 <String "MediaSessionCompat">
		//* 142  295:ldc1            #152 <String "Could not unparcel the extra data.">
		//* 143  297:invokestatic    #158 <Method int Log.e(String, String)>
		//* 144  300:pop             
		//* 145  301:return          
				// Misplaced declaration of an exception variable
				catch(String s)
				{
					Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
				}
			break MISSING_BLOCK_LABEL_301;
			Callback.this.onCommand(s, bundle, resultreceiver);
			return;
		//* 146  302:astore_1        
		//* 147  303:goto            293
		}

		public void onCustomAction(String s, Bundle bundle)
		{
			Bundle bundle1 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//    0    0:aload_2         
		//    1    1:ldc1            #161 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//    2    3:invokevirtual   #165 <Method Bundle Bundle.getBundle(String)>
		//    3    6:astore          5
			MediaSessionCompat.ensureClassLoader(bundle1);
		//    4    8:aload           5
		//    5   10:invokestatic    #169 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			if(s.equals("android.support.v4.media.session.action.PLAY_FROM_URI"))
		//*   6   13:aload_1         
		//*   7   14:ldc1            #171 <String "android.support.v4.media.session.action.PLAY_FROM_URI">
		//*   8   16:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*   9   19:ifeq            43
			{
				s = ((String) ((Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI")));
		//   10   22:aload_2         
		//   11   23:ldc1            #173 <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//   12   25:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   13   28:checkcast       #175 <Class Uri>
		//   14   31:astore_1        
				onPlayFromUri(((Uri) (s)), bundle1);
		//   15   32:aload_0         
		//   16   33:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   17   36:aload_1         
		//   18   37:aload           5
		//   19   39:invokevirtual   #179 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//   20   42:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE"))
		//*  21   43:aload_1         
		//*  22   44:ldc1            #181 <String "android.support.v4.media.session.action.PREPARE">
		//*  23   46:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  24   49:ifeq            60
			{
				onPrepare();
		//   25   52:aload_0         
		//   26   53:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   27   56:invokevirtual   #184 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//   28   59:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
		//*  29   60:aload_1         
		//*  30   61:ldc1            #186 <String "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID">
		//*  31   63:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  32   66:ifeq            87
			{
				s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
		//   33   69:aload_2         
		//   34   70:ldc1            #188 <String "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID">
		//   35   72:invokevirtual   #192 <Method String Bundle.getString(String)>
		//   36   75:astore_1        
				onPrepareFromMediaId(s, bundle1);
		//   37   76:aload_0         
		//   38   77:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   39   80:aload_1         
		//   40   81:aload           5
		//   41   83:invokevirtual   #195 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//   42   86:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
		//*  43   87:aload_1         
		//*  44   88:ldc1            #197 <String "android.support.v4.media.session.action.PREPARE_FROM_SEARCH">
		//*  45   90:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  46   93:ifeq            114
			{
				s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
		//   47   96:aload_2         
		//   48   97:ldc1            #199 <String "android.support.v4.media.session.action.ARGUMENT_QUERY">
		//   49   99:invokevirtual   #192 <Method String Bundle.getString(String)>
		//   50  102:astore_1        
				onPrepareFromSearch(s, bundle1);
		//   51  103:aload_0         
		//   52  104:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   53  107:aload_1         
		//   54  108:aload           5
		//   55  110:invokevirtual   #202 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//   56  113:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
		//*  57  114:aload_1         
		//*  58  115:ldc1            #204 <String "android.support.v4.media.session.action.PREPARE_FROM_URI">
		//*  59  117:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  60  120:ifeq            144
			{
				s = ((String) ((Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI")));
		//   61  123:aload_2         
		//   62  124:ldc1            #173 <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//   63  126:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   64  129:checkcast       #175 <Class Uri>
		//   65  132:astore_1        
				onPrepareFromUri(((Uri) (s)), bundle1);
		//   66  133:aload_0         
		//   67  134:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   68  137:aload_1         
		//   69  138:aload           5
		//   70  140:invokevirtual   #207 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//   71  143:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
		//*  72  144:aload_1         
		//*  73  145:ldc1            #209 <String "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED">
		//*  74  147:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  75  150:ifeq            171
			{
				boolean flag = bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
		//   76  153:aload_2         
		//   77  154:ldc1            #211 <String "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED">
		//   78  156:invokevirtual   #215 <Method boolean Bundle.getBoolean(String)>
		//   79  159:istore          4
				onSetCaptioningEnabled(flag);
		//   80  161:aload_0         
		//   81  162:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   82  165:iload           4
		//   83  167:invokevirtual   #219 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
				return;
		//   84  170:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
		//*  85  171:aload_1         
		//*  86  172:ldc1            #221 <String "android.support.v4.media.session.action.SET_REPEAT_MODE">
		//*  87  174:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  88  177:ifeq            196
			{
				int i = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
		//   89  180:aload_2         
		//   90  181:ldc1            #223 <String "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE">
		//   91  183:invokevirtual   #114 <Method int Bundle.getInt(String)>
		//   92  186:istore_3        
				onSetRepeatMode(i);
		//   93  187:aload_0         
		//   94  188:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   95  191:iload_3         
		//   96  192:invokevirtual   #227 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
				return;
		//   97  195:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
		//*  98  196:aload_1         
		//*  99  197:ldc1            #229 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE">
		//* 100  199:invokevirtual   #37  <Method boolean String.equals(Object)>
		//* 101  202:ifeq            221
			{
				int j = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
		//  102  205:aload_2         
		//  103  206:ldc1            #231 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE">
		//  104  208:invokevirtual   #114 <Method int Bundle.getInt(String)>
		//  105  211:istore_3        
				onSetShuffleMode(j);
		//  106  212:aload_0         
		//  107  213:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  108  216:iload_3         
		//  109  217:invokevirtual   #234 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
				return;
		//  110  220:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_RATING"))
		//* 111  221:aload_1         
		//* 112  222:ldc1            #236 <String "android.support.v4.media.session.action.SET_RATING">
		//* 113  224:invokevirtual   #37  <Method boolean String.equals(Object)>
		//* 114  227:ifeq            251
			{
				s = ((String) ((RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING")));
		//  115  230:aload_2         
		//  116  231:ldc1            #238 <String "android.support.v4.media.session.action.ARGUMENT_RATING">
		//  117  233:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//  118  236:checkcast       #240 <Class RatingCompat>
		//  119  239:astore_1        
				Callback.this.onSetRating(((RatingCompat) (s)), bundle1);
		//  120  240:aload_0         
		//  121  241:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  122  244:aload_1         
		//  123  245:aload           5
		//  124  247:invokevirtual   #244 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//  125  250:return          
			} else
			{
				Callback.this.onCustomAction(s, bundle);
		//  126  251:aload_0         
		//  127  252:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  128  255:aload_1         
		//  129  256:aload_2         
		//  130  257:invokevirtual   #246 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  131  260:return          
			}
		}

		public void onFastForward()
		{
			Callback.this.onFastForward();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #249 <Method void MediaSessionCompat$Callback.onFastForward()>
		//    3    7:return          
		}

		public boolean onMediaButtonEvent(Intent intent)
		{
			return Callback.this.onMediaButtonEvent(intent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #253 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//    4    8:ireturn         
		}

		public void onPause()
		{
			Callback.this.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #256 <Method void MediaSessionCompat$Callback.onPause()>
		//    3    7:return          
		}

		public void onPlay()
		{
			Callback.this.onPlay();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #259 <Method void MediaSessionCompat$Callback.onPlay()>
		//    3    7:return          
		}

		public void onPlayFromMediaId(String s, Bundle bundle)
		{
			Callback.this.onPlayFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #262 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPlayFromSearch(String s, Bundle bundle)
		{
			Callback.this.onPlayFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #265 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onRewind()
		{
			Callback.this.onRewind();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #268 <Method void MediaSessionCompat$Callback.onRewind()>
		//    3    7:return          
		}

		public void onSeekTo(long l)
		{
			Callback.this.onSeekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #272 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
		//    4    8:return          
		}

		public void onSetRating(Object obj)
		{
			Callback.this.onSetRating(RatingCompat.fromRating(obj));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #277 <Method RatingCompat RatingCompat.fromRating(Object)>
		//    4    8:invokevirtual   #280 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
		//    5   11:return          
		}

		public void onSetRating(Object obj, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onSkipToNext()
		{
			Callback.this.onSkipToNext();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #284 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		//    3    7:return          
		}

		public void onSkipToPrevious()
		{
			Callback.this.onSkipToPrevious();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #287 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		//    3    7:return          
		}

		public void onSkipToQueueItem(long l)
		{
			Callback.this.onSkipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #290 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
		//    4    8:return          
		}

		public void onStop()
		{
			Callback.this.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #293 <Method void MediaSessionCompat$Callback.onStop()>
		//    3    7:return          
		}

		final Callback this$0;

		Callback.StubApi21()
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
		//    5    9:return          
		}
	}

	private class Callback.StubApi23 extends Callback.StubApi21
		implements MediaSessionCompatApi23.Callback
	{

		public void onPlayFromUri(Uri uri, Bundle bundle)
		{
			Callback.this.onPlayFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #28  <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		final Callback this$0;

		Callback.StubApi23()
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #23  <Method void MediaSessionCompat$Callback$StubApi21(MediaSessionCompat$Callback)>
		//    6   10:return          
		}
	}

	private class Callback.StubApi24 extends Callback.StubApi23
		implements MediaSessionCompatApi24.Callback
	{

		public void onPrepare()
		{
			Callback.this.onPrepare();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #28  <Method void MediaSessionCompat$Callback.onPrepare()>
		//    3    7:return          
		}

		public void onPrepareFromMediaId(String s, Bundle bundle)
		{
			Callback.this.onPrepareFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPrepareFromSearch(String s, Bundle bundle)
		{
			Callback.this.onPrepareFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #35  <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onPrepareFromUri(Uri uri, Bundle bundle)
		{
			Callback.this.onPrepareFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #39  <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		final Callback this$0;

		Callback.StubApi24()
		{
			this$0 = Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #23  <Method void MediaSessionCompat$Callback$StubApi23(MediaSessionCompat$Callback)>
		//    6   10:return          
		}
	}

	static interface MediaSessionImpl
	{

		public abstract String getCallingPackage();

		public abstract android.support.v4.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo();

		public abstract Object getMediaSession();

		public abstract PlaybackStateCompat getPlaybackState();

		public abstract Object getRemoteControlClient();

		public abstract Token getSessionToken();

		public abstract boolean isActive();

		public abstract void release();

		public abstract void sendSessionEvent(String s, Bundle bundle);

		public abstract void setActive(boolean flag);

		public abstract void setCallback(Callback callback, Handler handler);

		public abstract void setCaptioningEnabled(boolean flag);

		public abstract void setCurrentControllerInfo(android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo);

		public abstract void setExtras(Bundle bundle);

		public abstract void setFlags(int i);

		public abstract void setMediaButtonReceiver(PendingIntent pendingintent);

		public abstract void setMetadata(MediaMetadataCompat mediametadatacompat);

		public abstract void setPlaybackState(PlaybackStateCompat playbackstatecompat);

		public abstract void setPlaybackToLocal(int i);

		public abstract void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat);

		public abstract void setQueue(List list);

		public abstract void setQueueTitle(CharSequence charsequence);

		public abstract void setRatingType(int i);

		public abstract void setRepeatMode(int i);

		public abstract void setSessionActivity(PendingIntent pendingintent);

		public abstract void setShuffleMode(int i);
	}

	static class MediaSessionImplApi18 extends MediaSessionImplBase
	{

		int getRccTransportControlFlagsFromActions(long l)
		{
			int j = super.getRccTransportControlFlagsFromActions(l);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokespecial   #26  <Method int MediaSessionCompat$MediaSessionImplBase.getRccTransportControlFlagsFromActions(long)>
		//    3    5:istore          4
			int i = j;
		//    4    7:iload           4
		//    5    9:istore_3        
			if((l & 256L) != 0L)
		//*   6   10:lload_1         
		//*   7   11:ldc2w           #27  <Long 256L>
		//*   8   14:land            
		//*   9   15:lconst_0        
		//*  10   16:lcmp            
		//*  11   17:ifeq            27
				i = j | 0x100;
		//   12   20:iload           4
		//   13   22:sipush          256
		//   14   25:ior             
		//   15   26:istore_3        
			return i;
		//   16   27:iload_3         
		//   17   28:ireturn         
		}

		void registerMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			NullPointerException nullpointerexception;
			if(sIsMbrPendingIntentSupported)
		//*   0    0:getstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
		//*   1    3:ifeq            29
				try
				{
					mAudioManager.registerMediaButtonEventReceiver(pendingintent);
		//    2    6:aload_0         
		//    3    7:getfield        #38  <Field AudioManager mAudioManager>
		//    4   10:aload_1         
		//    5   11:invokevirtual   #43  <Method void AudioManager.registerMediaButtonEventReceiver(PendingIntent)>
				}
		//*   6   14:goto            29
		//*   7   17:ldc1            #45  <String "MediaSessionCompat">
		//*   8   19:ldc1            #47  <String "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.">
		//*   9   21:invokestatic    #53  <Method int Log.w(String, String)>
		//*  10   24:pop             
		//*  11   25:iconst_0        
		//*  12   26:putstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
		//*  13   29:getstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
		//*  14   32:ifne            41
		//*  15   35:aload_0         
		//*  16   36:aload_1         
		//*  17   37:aload_2         
		//*  18   38:invokespecial   #55  <Method void MediaSessionCompat$MediaSessionImplBase.registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
		//*  19   41:return          
				// Misplaced declaration of an exception variable
				catch(NullPointerException nullpointerexception)
				{
					Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
					sIsMbrPendingIntentSupported = false;
				}
			if(!sIsMbrPendingIntentSupported)
				super.registerMediaButtonEventReceiver(pendingintent, componentname);
		//*  20   42:astore_3        
		//*  21   43:goto            17
		}

		public void setCallback(Callback callback, Handler handler)
		{
			super.setCallback(callback, handler);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #59  <Method void MediaSessionCompat$MediaSessionImplBase.setCallback(MediaSessionCompat$Callback, Handler)>
			if(callback == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       19
			{
				mRcc.setPlaybackPositionUpdateListener(((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener) (null)));
		//    6   10:aload_0         
		//    7   11:getfield        #63  <Field RemoteControlClient mRcc>
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #69  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
				return;
		//   10   18:return          
			} else
			{
				callback = ((Callback) (new android.media.RemoteControlClient.OnPlaybackPositionUpdateListener() {

					public void onPlaybackPositionUpdate(long l)
					{
						postToHandler(18, -1, -1, ((Object) (Long.valueOf(l))), ((Bundle) (null)));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field MediaSessionCompat$MediaSessionImplApi18 this$0>
					//    2    4:bipush          18
					//    3    6:iconst_m1       
					//    4    7:iconst_m1       
					//    5    8:lload_1         
					//    6    9:invokestatic    #32  <Method Long Long.valueOf(long)>
					//    7   12:aconst_null     
					//    8   13:invokevirtual   #36  <Method void MediaSessionCompat$MediaSessionImplApi18.postToHandler(int, int, int, Object, Bundle)>
					//    9   16:return          
					}

					final MediaSessionImplApi18 this$0;

			
			{
				this$0 = MediaSessionImplApi18.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaSessionCompat$MediaSessionImplApi18 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
));
		//   11   19:new             #9   <Class MediaSessionCompat$MediaSessionImplApi18$1>
		//   12   22:dup             
		//   13   23:aload_0         
		//   14   24:invokespecial   #72  <Method void MediaSessionCompat$MediaSessionImplApi18$1(MediaSessionCompat$MediaSessionImplApi18)>
		//   15   27:astore_1        
				mRcc.setPlaybackPositionUpdateListener(((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener) (callback)));
		//   16   28:aload_0         
		//   17   29:getfield        #63  <Field RemoteControlClient mRcc>
		//   18   32:aload_1         
		//   19   33:invokevirtual   #69  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
				return;
		//   20   36:return          
			}
		}

		void setRccState(PlaybackStateCompat playbackstatecompat)
		{
			long l1 = playbackstatecompat.getPosition();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #80  <Method long PlaybackStateCompat.getPosition()>
		//    2    4:lstore          5
			float f = playbackstatecompat.getPlaybackSpeed();
		//    3    6:aload_1         
		//    4    7:invokevirtual   #84  <Method float PlaybackStateCompat.getPlaybackSpeed()>
		//    5   10:fstore_2        
			long l4 = playbackstatecompat.getLastPositionUpdateTime();
		//    6   11:aload_1         
		//    7   12:invokevirtual   #87  <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
		//    8   15:lstore          9
			long l5 = SystemClock.elapsedRealtime();
		//    9   17:invokestatic    #92  <Method long SystemClock.elapsedRealtime()>
		//   10   20:lstore          11
			long l = l1;
		//   11   22:lload           5
		//   12   24:lstore_3        
			if(playbackstatecompat.getState() == 3)
		//*  13   25:aload_1         
		//*  14   26:invokevirtual   #96  <Method int PlaybackStateCompat.getState()>
		//*  15   29:iconst_3        
		//*  16   30:icmpne          93
			{
				long l2 = 0L;
		//   17   33:lconst_0        
		//   18   34:lstore          7
				l = l1;
		//   19   36:lload           5
		//   20   38:lstore_3        
				if(l1 > 0L)
		//*  21   39:lload           5
		//*  22   41:lconst_0        
		//*  23   42:lcmp            
		//*  24   43:ifle            93
				{
					l = l2;
		//   25   46:lload           7
		//   26   48:lstore_3        
					if(l4 > 0L)
		//*  27   49:lload           9
		//*  28   51:lconst_0        
		//*  29   52:lcmp            
		//*  30   53:ifle            88
					{
						long l3 = l5 - l4;
		//   31   56:lload           11
		//   32   58:lload           9
		//   33   60:lsub            
		//   34   61:lstore          7
						l = l3;
		//   35   63:lload           7
		//   36   65:lstore_3        
						if(f > 0.0F)
		//*  37   66:fload_2         
		//*  38   67:fconst_0        
		//*  39   68:fcmpl           
		//*  40   69:ifle            88
						{
							l = l3;
		//   41   72:lload           7
		//   42   74:lstore_3        
							if(f != 1.0F)
		//*  43   75:fload_2         
		//*  44   76:fconst_1        
		//*  45   77:fcmpl           
		//*  46   78:ifeq            88
								l = (long)((float)l3 * f);
		//   47   81:lload           7
		//   48   83:l2f             
		//   49   84:fload_2         
		//   50   85:fmul            
		//   51   86:f2l             
		//   52   87:lstore_3        
						}
					}
					l = l1 + l;
		//   53   88:lload           5
		//   54   90:lload_3         
		//   55   91:ladd            
		//   56   92:lstore_3        
				}
			}
			mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()), l, f);
		//   57   93:aload_0         
		//   58   94:getfield        #63  <Field RemoteControlClient mRcc>
		//   59   97:aload_0         
		//   60   98:aload_1         
		//   61   99:invokevirtual   #96  <Method int PlaybackStateCompat.getState()>
		//   62  102:invokevirtual   #100 <Method int getRccStateFromState(int)>
		//   63  105:lload_3         
		//   64  106:fload_2         
		//   65  107:invokevirtual   #104 <Method void RemoteControlClient.setPlaybackState(int, long, float)>
		//   66  110:return          
		}

		void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			if(sIsMbrPendingIntentSupported)
		//*   0    0:getstatic       #34  <Field boolean sIsMbrPendingIntentSupported>
		//*   1    3:ifeq            15
			{
				mAudioManager.unregisterMediaButtonEventReceiver(pendingintent);
		//    2    6:aload_0         
		//    3    7:getfield        #38  <Field AudioManager mAudioManager>
		//    4   10:aload_1         
		//    5   11:invokevirtual   #107 <Method void AudioManager.unregisterMediaButtonEventReceiver(PendingIntent)>
				return;
		//    6   14:return          
			} else
			{
				super.unregisterMediaButtonEventReceiver(pendingintent, componentname);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:aload_2         
		//   10   18:invokespecial   #109 <Method void MediaSessionCompat$MediaSessionImplBase.unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				return;
		//   11   21:return          
			}
		}

		private static boolean sIsMbrPendingIntentSupported = true;

		static 
		{
		//    0    0:return          
		}

		MediaSessionImplApi18(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
		{
			super(context, s, componentname, pendingintent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #22  <Method void MediaSessionCompat$MediaSessionImplBase(Context, String, ComponentName, PendingIntent)>
		//    6    9:return          
		}
	}

	static class MediaSessionImplApi19 extends MediaSessionImplApi18
	{

		android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
		{
			android.media.RemoteControlClient.MetadataEditor metadataeditor = super.buildRccMetadata(bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method android.media.RemoteControlClient$MetadataEditor MediaSessionCompat$MediaSessionImplApi18.buildRccMetadata(Bundle)>
		//    3    5:astore          4
			long l;
			if(mState == null)
		//*   4    7:aload_0         
		//*   5    8:getfield        #25  <Field PlaybackStateCompat mState>
		//*   6   11:ifnonnull       19
				l = 0L;
		//    7   14:lconst_0        
		//    8   15:lstore_2        
			else
		//*   9   16:goto            27
				l = mState.getActions();
		//   10   19:aload_0         
		//   11   20:getfield        #25  <Field PlaybackStateCompat mState>
		//   12   23:invokevirtual   #31  <Method long PlaybackStateCompat.getActions()>
		//   13   26:lstore_2        
			if((l & 128L) != 0L)
		//*  14   27:lload_2         
		//*  15   28:ldc2w           #32  <Long 128L>
		//*  16   31:land            
		//*  17   32:lconst_0        
		//*  18   33:lcmp            
		//*  19   34:ifeq            44
				metadataeditor.addEditableKey(0x10000001);
		//   20   37:aload           4
		//   21   39:ldc1            #34  <Int 0x10000001>
		//   22   41:invokevirtual   #40  <Method void android.media.RemoteControlClient$MetadataEditor.addEditableKey(int)>
			if(bundle == null)
		//*  23   44:aload_1         
		//*  24   45:ifnonnull       51
				return metadataeditor;
		//   25   48:aload           4
		//   26   50:areturn         
			if(bundle.containsKey("android.media.metadata.YEAR"))
		//*  27   51:aload_1         
		//*  28   52:ldc1            #42  <String "android.media.metadata.YEAR">
		//*  29   54:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
		//*  30   57:ifeq            74
				metadataeditor.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
		//   31   60:aload           4
		//   32   62:bipush          8
		//   33   64:aload_1         
		//   34   65:ldc1            #42  <String "android.media.metadata.YEAR">
		//   35   67:invokevirtual   #52  <Method long Bundle.getLong(String)>
		//   36   70:invokevirtual   #56  <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//   37   73:pop             
			if(bundle.containsKey("android.media.metadata.RATING"))
		//*  38   74:aload_1         
		//*  39   75:ldc1            #58  <String "android.media.metadata.RATING">
		//*  40   77:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
		//*  41   80:ifeq            97
				((MediaMetadataEditor) (metadataeditor)).putObject(101, ((Object) (bundle.getParcelable("android.media.metadata.RATING"))));
		//   42   83:aload           4
		//   43   85:bipush          101
		//   44   87:aload_1         
		//   45   88:ldc1            #58  <String "android.media.metadata.RATING">
		//   46   90:invokevirtual   #62  <Method Parcelable Bundle.getParcelable(String)>
		//   47   93:invokevirtual   #68  <Method MediaMetadataEditor MediaMetadataEditor.putObject(int, Object)>
		//   48   96:pop             
			if(bundle.containsKey("android.media.metadata.USER_RATING"))
		//*  49   97:aload_1         
		//*  50   98:ldc1            #70  <String "android.media.metadata.USER_RATING">
		//*  51  100:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
		//*  52  103:ifeq            120
				((MediaMetadataEditor) (metadataeditor)).putObject(0x10000001, ((Object) (bundle.getParcelable("android.media.metadata.USER_RATING"))));
		//   53  106:aload           4
		//   54  108:ldc1            #34  <Int 0x10000001>
		//   55  110:aload_1         
		//   56  111:ldc1            #70  <String "android.media.metadata.USER_RATING">
		//   57  113:invokevirtual   #62  <Method Parcelable Bundle.getParcelable(String)>
		//   58  116:invokevirtual   #68  <Method MediaMetadataEditor MediaMetadataEditor.putObject(int, Object)>
		//   59  119:pop             
			return metadataeditor;
		//   60  120:aload           4
		//   61  122:areturn         
		}

		int getRccTransportControlFlagsFromActions(long l)
		{
			int j = super.getRccTransportControlFlagsFromActions(l);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokespecial   #74  <Method int MediaSessionCompat$MediaSessionImplApi18.getRccTransportControlFlagsFromActions(long)>
		//    3    5:istore          4
			int i = j;
		//    4    7:iload           4
		//    5    9:istore_3        
			if((l & 128L) != 0L)
		//*   6   10:lload_1         
		//*   7   11:ldc2w           #32  <Long 128L>
		//*   8   14:land            
		//*   9   15:lconst_0        
		//*  10   16:lcmp            
		//*  11   17:ifeq            27
				i = j | 0x200;
		//   12   20:iload           4
		//   13   22:sipush          512
		//   14   25:ior             
		//   15   26:istore_3        
			return i;
		//   16   27:iload_3         
		//   17   28:ireturn         
		}

		public void setCallback(Callback callback, Handler handler)
		{
			super.setCallback(callback, handler);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #78  <Method void MediaSessionCompat$MediaSessionImplApi18.setCallback(MediaSessionCompat$Callback, Handler)>
			if(callback == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       19
			{
				mRcc.setMetadataUpdateListener(((android.media.RemoteControlClient.OnMetadataUpdateListener) (null)));
		//    6   10:aload_0         
		//    7   11:getfield        #82  <Field RemoteControlClient mRcc>
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #88  <Method void RemoteControlClient.setMetadataUpdateListener(android.media.RemoteControlClient$OnMetadataUpdateListener)>
				return;
		//   10   18:return          
			} else
			{
				callback = ((Callback) (new android.media.RemoteControlClient.OnMetadataUpdateListener() {

					public void onMetadataUpdate(int i, Object obj)
					{
						if(i == 0x10000001 && (obj instanceof Rating))
					//*   0    0:iload_1         
					//*   1    1:ldc1            #27  <Int 0x10000001>
					//*   2    3:icmpne          29
					//*   3    6:aload_2         
					//*   4    7:instanceof      #29  <Class Rating>
					//*   5   10:ifeq            29
							postToHandler(19, -1, -1, ((Object) (RatingCompat.fromRating(obj))), ((Bundle) (null)));
					//    6   13:aload_0         
					//    7   14:getfield        #20  <Field MediaSessionCompat$MediaSessionImplApi19 this$0>
					//    8   17:bipush          19
					//    9   19:iconst_m1       
					//   10   20:iconst_m1       
					//   11   21:aload_2         
					//   12   22:invokestatic    #35  <Method RatingCompat RatingCompat.fromRating(Object)>
					//   13   25:aconst_null     
					//   14   26:invokevirtual   #39  <Method void MediaSessionCompat$MediaSessionImplApi19.postToHandler(int, int, int, Object, Bundle)>
					//   15   29:return          
					}

					final MediaSessionImplApi19 this$0;

			
			{
				this$0 = MediaSessionImplApi19.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaSessionCompat$MediaSessionImplApi19 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
));
		//   11   19:new             #9   <Class MediaSessionCompat$MediaSessionImplApi19$1>
		//   12   22:dup             
		//   13   23:aload_0         
		//   14   24:invokespecial   #91  <Method void MediaSessionCompat$MediaSessionImplApi19$1(MediaSessionCompat$MediaSessionImplApi19)>
		//   15   27:astore_1        
				mRcc.setMetadataUpdateListener(((android.media.RemoteControlClient.OnMetadataUpdateListener) (callback)));
		//   16   28:aload_0         
		//   17   29:getfield        #82  <Field RemoteControlClient mRcc>
		//   18   32:aload_1         
		//   19   33:invokevirtual   #88  <Method void RemoteControlClient.setMetadataUpdateListener(android.media.RemoteControlClient$OnMetadataUpdateListener)>
				return;
		//   20   36:return          
			}
		}

		MediaSessionImplApi19(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
		{
			super(context, s, componentname, pendingintent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #16  <Method void MediaSessionCompat$MediaSessionImplApi18(Context, String, ComponentName, PendingIntent)>
		//    6    9:return          
		}
	}

	static class MediaSessionImplApi21
		implements MediaSessionImpl
	{

		public String getCallingPackage()
		{
			if(android.os.Build.VERSION.SDK_INT < 24)
		//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmpge          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			else
				return MediaSessionCompatApi24.getCallingPackage(mSessionObj);
		//    5   10:aload_0         
		//    6   11:getfield        #56  <Field Object mSessionObj>
		//    7   14:invokestatic    #91  <Method String MediaSessionCompatApi24.getCallingPackage(Object)>
		//    8   17:areturn         
		}

		public android.support.v4.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object getMediaSession()
		{
			return mSessionObj;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			return mPlaybackState;
		//    0    0:aload_0         
		//    1    1:getfield        #99  <Field PlaybackStateCompat mPlaybackState>
		//    2    4:areturn         
		}

		public Object getRemoteControlClient()
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Token getSessionToken()
		{
			return mToken;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field MediaSessionCompat$Token mToken>
		//    2    4:areturn         
		}

		public boolean isActive()
		{
			return MediaSessionCompatApi21.isActive(mSessionObj);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:invokestatic    #106 <Method boolean MediaSessionCompatApi21.isActive(Object)>
		//    3    7:ireturn         
		}

		public void release()
		{
			mDestroyed = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #43  <Field boolean mDestroyed>
			MediaSessionCompatApi21.release(mSessionObj);
		//    3    5:aload_0         
		//    4    6:getfield        #56  <Field Object mSessionObj>
		//    5    9:invokestatic    #109 <Method void MediaSessionCompatApi21.release(Object)>
		//    6   12:return          
		}

		public void sendSessionEvent(String s, Bundle bundle)
		{
			if(android.os.Build.VERSION.SDK_INT < 23)
		//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          23
		//*   2    5:icmpge          58
			{
				int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    3    8:aload_0         
		//    4    9:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    5   12:invokevirtual   #117 <Method int RemoteCallbackList.beginBroadcast()>
		//    6   15:iconst_1        
		//    7   16:isub            
		//    8   17:istore_3        
				while(i >= 0) 
		//*   9   18:iload_3         
		//*  10   19:iflt            51
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
		//   11   22:aload_0         
		//   12   23:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   13   26:iload_3         
		//   14   27:invokevirtual   #121 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   15   30:checkcast       #123 <Class IMediaControllerCallback>
		//   16   33:astore          4
					try
					{
						imediacontrollercallback.onEvent(s, bundle);
		//   17   35:aload           4
		//   18   37:aload_1         
		//   19   38:aload_2         
		//   20   39:invokeinterface #126 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
					}
		//*  21   44:iload_3         
		//*  22   45:iconst_1        
		//*  23   46:isub            
		//*  24   47:istore_3        
		//*  25   48:goto            18
		//*  26   51:aload_0         
		//*  27   52:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  28   55:invokevirtual   #129 <Method void RemoteCallbackList.finishBroadcast()>
		//*  29   58:aload_0         
		//*  30   59:getfield        #56  <Field Object mSessionObj>
		//*  31   62:aload_1         
		//*  32   63:aload_2         
		//*  33   64:invokestatic    #132 <Method void MediaSessionCompatApi21.sendSessionEvent(Object, String, Bundle)>
		//*  34   67:return          
					catch(RemoteException remoteexception) { }
		//   35   68:astore          4
					i--;
				}
				mExtraControllerCallbacks.finishBroadcast();
			}
			MediaSessionCompatApi21.sendSessionEvent(mSessionObj, s, bundle);
		//*  36   70:goto            44
		}

		public void setActive(boolean flag)
		{
			MediaSessionCompatApi21.setActive(mSessionObj, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #137 <Method void MediaSessionCompatApi21.setActive(Object, boolean)>
		//    4    8:return          
		}

		public void setCallback(Callback callback, Handler handler)
		{
			Object obj1 = mSessionObj;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:astore          4
			Object obj;
			if(callback == null)
		//*   3    6:aload_1         
		//*   4    7:ifnonnull       15
				obj = null;
		//    5   10:aconst_null     
		//    6   11:astore_3        
			else
		//*   7   12:goto            20
				obj = callback.mCallbackObj;
		//    8   15:aload_1         
		//    9   16:getfield        #144 <Field Object MediaSessionCompat$Callback.mCallbackObj>
		//   10   19:astore_3        
			MediaSessionCompatApi21.setCallback(obj1, obj, handler);
		//   11   20:aload           4
		//   12   22:aload_3         
		//   13   23:aload_2         
		//   14   24:invokestatic    #147 <Method void MediaSessionCompatApi21.setCallback(Object, Object, Handler)>
			if(callback != null)
		//*  15   27:aload_1         
		//*  16   28:ifnull          37
				callback.setSessionImpl(((MediaSessionImpl) (this)), handler);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:aload_2         
		//   20   34:invokevirtual   #151 <Method void MediaSessionCompat$Callback.setSessionImpl(MediaSessionCompat$MediaSessionImpl, Handler)>
		//   21   37:return          
		}

		public void setCaptioningEnabled(boolean flag)
		{
			if(mCaptioningEnabled != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #154 <Field boolean mCaptioningEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mCaptioningEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #154 <Field boolean mCaptioningEnabled>
				int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #117 <Method int RemoteCallbackList.beginBroadcast()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
				while(i >= 0) 
		//*  13   23:iload_2         
		//*  14   24:iflt            53
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
		//   15   27:aload_0         
		//   16   28:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #121 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #123 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onCaptioningEnabledChanged(flag);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #157 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #129 <Method void RemoteCallbackList.finishBroadcast()>
		//*  32   60:return          
					catch(RemoteException remoteexception) { }
		//   33   61:astore_3        
					i--;
				}
				mExtraControllerCallbacks.finishBroadcast();
			}
		//*  34   62:goto            46
		}

		public void setCurrentControllerInfo(android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo)
		{
		//    0    0:return          
		}

		public void setExtras(Bundle bundle)
		{
			MediaSessionCompatApi21.setExtras(mSessionObj, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #164 <Method void MediaSessionCompatApi21.setExtras(Object, Bundle)>
		//    4    8:return          
		}

		public void setFlags(int i)
		{
			MediaSessionCompatApi21.setFlags(mSessionObj, i);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #169 <Method void MediaSessionCompatApi21.setFlags(Object, int)>
		//    4    8:return          
		}

		public void setMediaButtonReceiver(PendingIntent pendingintent)
		{
			MediaSessionCompatApi21.setMediaButtonReceiver(mSessionObj, pendingintent);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #174 <Method void MediaSessionCompatApi21.setMediaButtonReceiver(Object, PendingIntent)>
		//    4    8:return          
		}

		public void setMetadata(MediaMetadataCompat mediametadatacompat)
		{
			mMetadata = mediametadatacompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #178 <Field MediaMetadataCompat mMetadata>
			Object obj = mSessionObj;
		//    3    5:aload_0         
		//    4    6:getfield        #56  <Field Object mSessionObj>
		//    5    9:astore_2        
			if(mediametadatacompat == null)
		//*   6   10:aload_1         
		//*   7   11:ifnonnull       19
				mediametadatacompat = null;
		//    8   14:aconst_null     
		//    9   15:astore_1        
			else
		//*  10   16:goto            24
				mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.getMediaMetadata()));
		//   11   19:aload_1         
		//   12   20:invokevirtual   #183 <Method Object MediaMetadataCompat.getMediaMetadata()>
		//   13   23:astore_1        
			MediaSessionCompatApi21.setMetadata(obj, ((Object) (mediametadatacompat)));
		//   14   24:aload_2         
		//   15   25:aload_1         
		//   16   26:invokestatic    #186 <Method void MediaSessionCompatApi21.setMetadata(Object, Object)>
		//   17   29:return          
		}

		public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
		{
			mPlaybackState = playbackstatecompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #99  <Field PlaybackStateCompat mPlaybackState>
			int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    3    5:aload_0         
		//    4    6:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    5    9:invokevirtual   #117 <Method int RemoteCallbackList.beginBroadcast()>
		//    6   12:iconst_1        
		//    7   13:isub            
		//    8   14:istore_2        
			while(i >= 0) 
		//*   9   15:iload_2         
		//*  10   16:iflt            45
			{
				Object obj = ((Object) ((IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i)));
		//   11   19:aload_0         
		//   12   20:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   13   23:iload_2         
		//   14   24:invokevirtual   #121 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   15   27:checkcast       #123 <Class IMediaControllerCallback>
		//   16   30:astore_3        
				try
				{
					((IMediaControllerCallback) (obj)).onPlaybackStateChanged(playbackstatecompat);
		//   17   31:aload_3         
		//   18   32:aload_1         
		//   19   33:invokeinterface #191 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
				}
		//*  20   38:iload_2         
		//*  21   39:iconst_1        
		//*  22   40:isub            
		//*  23   41:istore_2        
		//*  24   42:goto            15
		//*  25   45:aload_0         
		//*  26   46:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  27   49:invokevirtual   #129 <Method void RemoteCallbackList.finishBroadcast()>
		//*  28   52:aload_0         
		//*  29   53:getfield        #56  <Field Object mSessionObj>
		//*  30   56:astore_3        
		//*  31   57:aload_1         
		//*  32   58:ifnonnull       66
		//*  33   61:aconst_null     
		//*  34   62:astore_1        
		//*  35   63:goto            71
		//*  36   66:aload_1         
		//*  37   67:invokevirtual   #195 <Method Object PlaybackStateCompat.getPlaybackState()>
		//*  38   70:astore_1        
		//*  39   71:aload_3         
		//*  40   72:aload_1         
		//*  41   73:invokestatic    #197 <Method void MediaSessionCompatApi21.setPlaybackState(Object, Object)>
		//*  42   76:return          
				catch(RemoteException remoteexception) { }
		//   43   77:astore_3        
				i--;
			}
			mExtraControllerCallbacks.finishBroadcast();
			obj = mSessionObj;
			if(playbackstatecompat == null)
				playbackstatecompat = null;
			else
				playbackstatecompat = ((PlaybackStateCompat) (playbackstatecompat.getPlaybackState()));
			MediaSessionCompatApi21.setPlaybackState(obj, ((Object) (playbackstatecompat)));
		//*  44   78:goto            38
		}

		public void setPlaybackToLocal(int i)
		{
			MediaSessionCompatApi21.setPlaybackToLocal(mSessionObj, i);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #200 <Method void MediaSessionCompatApi21.setPlaybackToLocal(Object, int)>
		//    4    8:return          
		}

		public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
		{
			MediaSessionCompatApi21.setPlaybackToRemote(mSessionObj, volumeprovidercompat.getVolumeProvider());
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #207 <Method Object VolumeProviderCompat.getVolumeProvider()>
		//    4    8:invokestatic    #209 <Method void MediaSessionCompatApi21.setPlaybackToRemote(Object, Object)>
		//    5   11:return          
		}

		public void setQueue(List list)
		{
			mQueue = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #213 <Field List mQueue>
			if(list != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          57
			{
				ArrayList arraylist = new ArrayList();
		//    5    9:new             #215 <Class ArrayList>
		//    6   12:dup             
		//    7   13:invokespecial   #216 <Method void ArrayList()>
		//    8   16:astore_2        
				Iterator iterator = list.iterator();
		//    9   17:aload_1         
		//   10   18:invokeinterface #222 <Method Iterator List.iterator()>
		//   11   23:astore_3        
				do
				{
					list = ((List) (arraylist));
		//   12   24:aload_2         
		//   13   25:astore_1        
					if(!iterator.hasNext())
						break;
		//   14   26:aload_3         
		//   15   27:invokeinterface #227 <Method boolean Iterator.hasNext()>
		//   16   32:ifeq            59
					((List) (arraylist)).add(((QueueItem)iterator.next()).getQueueItem());
		//   17   35:aload_2         
		//   18   36:aload_3         
		//   19   37:invokeinterface #230 <Method Object Iterator.next()>
		//   20   42:checkcast       #232 <Class MediaSessionCompat$QueueItem>
		//   21   45:invokevirtual   #235 <Method Object MediaSessionCompat$QueueItem.getQueueItem()>
		//   22   48:invokeinterface #238 <Method boolean List.add(Object)>
		//   23   53:pop             
				} while(true);
		//   24   54:goto            24
			} else
			{
				list = null;
		//   25   57:aconst_null     
		//   26   58:astore_1        
			}
			MediaSessionCompatApi21.setQueue(mSessionObj, list);
		//   27   59:aload_0         
		//   28   60:getfield        #56  <Field Object mSessionObj>
		//   29   63:aload_1         
		//   30   64:invokestatic    #241 <Method void MediaSessionCompatApi21.setQueue(Object, List)>
		//   31   67:return          
		}

		public void setQueueTitle(CharSequence charsequence)
		{
			MediaSessionCompatApi21.setQueueTitle(mSessionObj, charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #248 <Method void MediaSessionCompatApi21.setQueueTitle(Object, CharSequence)>
		//    4    8:return          
		}

		public void setRatingType(int i)
		{
			if(android.os.Build.VERSION.SDK_INT < 22)
		//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          22
		//*   2    5:icmpge          14
			{
				mRatingType = i;
		//    3    8:aload_0         
		//    4    9:iload_1         
		//    5   10:putfield        #251 <Field int mRatingType>
				return;
		//    6   13:return          
			} else
			{
				MediaSessionCompatApi22.setRatingType(mSessionObj, i);
		//    7   14:aload_0         
		//    8   15:getfield        #56  <Field Object mSessionObj>
		//    9   18:iload_1         
		//   10   19:invokestatic    #255 <Method void MediaSessionCompatApi22.setRatingType(Object, int)>
				return;
		//   11   22:return          
			}
		}

		public void setRepeatMode(int i)
		{
			if(mRepeatMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #258 <Field int mRepeatMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mRepeatMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #258 <Field int mRepeatMode>
				int j = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #117 <Method int RemoteCallbackList.beginBroadcast()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
				while(j >= 0) 
		//*  13   23:iload_2         
		//*  14   24:iflt            53
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(j);
		//   15   27:aload_0         
		//   16   28:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #121 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #123 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onRepeatModeChanged(i);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #261 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #129 <Method void RemoteCallbackList.finishBroadcast()>
		//*  32   60:return          
					catch(RemoteException remoteexception) { }
		//   33   61:astore_3        
					j--;
				}
				mExtraControllerCallbacks.finishBroadcast();
			}
		//*  34   62:goto            46
		}

		public void setSessionActivity(PendingIntent pendingintent)
		{
			MediaSessionCompatApi21.setSessionActivity(mSessionObj, pendingintent);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #264 <Method void MediaSessionCompatApi21.setSessionActivity(Object, PendingIntent)>
		//    4    8:return          
		}

		public void setShuffleMode(int i)
		{
			if(mShuffleMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #267 <Field int mShuffleMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mShuffleMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #267 <Field int mShuffleMode>
				int j = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #117 <Method int RemoteCallbackList.beginBroadcast()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
				while(j >= 0) 
		//*  13   23:iload_2         
		//*  14   24:iflt            53
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(j);
		//   15   27:aload_0         
		//   16   28:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #121 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #123 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onShuffleModeChanged(i);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #270 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #129 <Method void RemoteCallbackList.finishBroadcast()>
		//*  32   60:return          
					catch(RemoteException remoteexception) { }
		//   33   61:astore_3        
					j--;
				}
				mExtraControllerCallbacks.finishBroadcast();
			}
		//*  34   62:goto            46
		}

		boolean mCaptioningEnabled;
		boolean mDestroyed;
		final RemoteCallbackList mExtraControllerCallbacks;
		MediaMetadataCompat mMetadata;
		PlaybackStateCompat mPlaybackState;
		List mQueue;
		int mRatingType;
		int mRepeatMode;
		final Object mSessionObj;
		int mShuffleMode;
		final Token mToken;

		MediaSessionImplApi21(Context context, String s, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void Object()>
			mDestroyed = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #43  <Field boolean mDestroyed>
			mExtraControllerCallbacks = new RemoteCallbackList();
		//    5    9:aload_0         
		//    6   10:new             #45  <Class RemoteCallbackList>
		//    7   13:dup             
		//    8   14:invokespecial   #46  <Method void RemoteCallbackList()>
		//    9   17:putfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
			mSessionObj = MediaSessionCompatApi21.createSession(context, s);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:invokestatic    #54  <Method Object MediaSessionCompatApi21.createSession(Context, String)>
		//   14   26:putfield        #56  <Field Object mSessionObj>
			mToken = new Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))), ((IMediaSession) (new ExtraSession())), bundle);
		//   15   29:aload_0         
		//   16   30:new             #58  <Class MediaSessionCompat$Token>
		//   17   33:dup             
		//   18   34:aload_0         
		//   19   35:getfield        #56  <Field Object mSessionObj>
		//   20   38:invokestatic    #62  <Method Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
		//   21   41:new             #11  <Class MediaSessionCompat$MediaSessionImplApi21$ExtraSession>
		//   22   44:dup             
		//   23   45:aload_0         
		//   24   46:invokespecial   #65  <Method void MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21)>
		//   25   49:aload_3         
		//   26   50:invokespecial   #68  <Method void MediaSessionCompat$Token(Object, IMediaSession, Bundle)>
		//   27   53:putfield        #70  <Field MediaSessionCompat$Token mToken>
		//   28   56:return          
		}

		MediaSessionImplApi21(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void Object()>
			mDestroyed = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #43  <Field boolean mDestroyed>
			mExtraControllerCallbacks = new RemoteCallbackList();
		//    5    9:aload_0         
		//    6   10:new             #45  <Class RemoteCallbackList>
		//    7   13:dup             
		//    8   14:invokespecial   #46  <Method void RemoteCallbackList()>
		//    9   17:putfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
			mSessionObj = MediaSessionCompatApi21.verifySession(obj);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #76  <Method Object MediaSessionCompatApi21.verifySession(Object)>
		//   13   25:putfield        #56  <Field Object mSessionObj>
			mToken = new Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))), ((IMediaSession) (new ExtraSession())));
		//   14   28:aload_0         
		//   15   29:new             #58  <Class MediaSessionCompat$Token>
		//   16   32:dup             
		//   17   33:aload_0         
		//   18   34:getfield        #56  <Field Object mSessionObj>
		//   19   37:invokestatic    #62  <Method Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
		//   20   40:new             #11  <Class MediaSessionCompat$MediaSessionImplApi21$ExtraSession>
		//   21   43:dup             
		//   22   44:aload_0         
		//   23   45:invokespecial   #65  <Method void MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21)>
		//   24   48:invokespecial   #79  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
		//   25   51:putfield        #70  <Field MediaSessionCompat$Token mToken>
		//   26   54:return          
		}
	}

	class MediaSessionImplApi21.ExtraSession extends IMediaSession.Stub
	{

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void adjustVolume(int i, int j, String s)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void fastForward()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public Bundle getExtras()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public long getFlags()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public PendingIntent getLaunchPendingIntent()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public MediaMetadataCompat getMetadata()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public String getPackageName()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public PlaybackStateCompat getPlaybackState()
		{
			return MediaSessionCompat.getStateWithUpdatedPosition(mPlaybackState, mMetadata);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #49  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplApi21.mPlaybackState>
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    5   11:getfield        #53  <Field MediaMetadataCompat MediaSessionCompat$MediaSessionImplApi21.mMetadata>
		//    6   14:invokestatic    #57  <Method PlaybackStateCompat MediaSessionCompat.getStateWithUpdatedPosition(PlaybackStateCompat, MediaMetadataCompat)>
		//    7   17:areturn         
		}

		public List getQueue()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public CharSequence getQueueTitle()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public int getRatingType()
		{
			return mRatingType;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #69  <Field int MediaSessionCompat$MediaSessionImplApi21.mRatingType>
		//    3    7:ireturn         
		}

		public int getRepeatMode()
		{
			return mRepeatMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #73  <Field int MediaSessionCompat$MediaSessionImplApi21.mRepeatMode>
		//    3    7:ireturn         
		}

		public int getShuffleMode()
		{
			return mShuffleMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #77  <Field int MediaSessionCompat$MediaSessionImplApi21.mShuffleMode>
		//    3    7:ireturn         
		}

		public String getTag()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public ParcelableVolumeInfo getVolumeAttributes()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public boolean isCaptioningEnabled()
		{
			return mCaptioningEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #86  <Field boolean MediaSessionCompat$MediaSessionImplApi21.mCaptioningEnabled>
		//    3    7:ireturn         
		}

		public boolean isShuffleModeEnabledRemoved()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isTransportControlEnabled()
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void next()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void pause()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void play()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void playFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void playFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void playFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepare()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepareFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void previous()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void rate(RatingCompat ratingcompat)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(!mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//*   2    4:getfield        #110 <Field boolean MediaSessionCompat$MediaSessionImplApi21.mDestroyed>
		//*   3    7:ifne            55
			{
				String s = getCallingPackage();
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    6   14:invokevirtual   #113 <Method String MediaSessionCompat$MediaSessionImplApi21.getCallingPackage()>
		//    7   17:astore_3        
				Object obj = ((Object) (s));
		//    8   18:aload_3         
		//    9   19:astore_2        
				if(s == null)
		//*  10   20:aload_3         
		//*  11   21:ifnonnull       27
					obj = "android.media.session.MediaController";
		//   12   24:ldc1            #115 <String "android.media.session.MediaController">
		//   13   26:astore_2        
				obj = ((Object) (new android.support.v4.media.MediaSessionManager.RemoteUserInfo(((String) (obj)), getCallingPid(), getCallingUid())));
		//   14   27:new             #117 <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
		//   15   30:dup             
		//   16   31:aload_2         
		//   17   32:invokestatic    #120 <Method int getCallingPid()>
		//   18   35:invokestatic    #123 <Method int getCallingUid()>
		//   19   38:invokespecial   #126 <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(String, int, int)>
		//   20   41:astore_2        
				mExtraControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)), obj);
		//   21   42:aload_0         
		//   22   43:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//   23   46:getfield        #130 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.mExtraControllerCallbacks>
		//   24   49:aload_1         
		//   25   50:aload_2         
		//   26   51:invokevirtual   #136 <Method boolean RemoteCallbackList.register(android.os.IInterface, Object)>
		//   27   54:pop             
			}
		//   28   55:return          
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void removeQueueItemAt(int i)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void rewind()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void seekTo(long l)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiverWrapper resultreceiverwrapper)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void sendCustomAction(String s, Bundle bundle)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public boolean sendMediaButton(KeyEvent keyevent)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setShuffleMode(int i)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void setShuffleModeEnabledRemoved(boolean flag)
			throws RemoteException
		{
		//    0    0:return          
		}

		public void setVolumeTo(int i, int j, String s)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void skipToQueueItem(long l)
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void stop()
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
		}

		public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			mExtraControllerCallbacks.unregister(((android.os.IInterface) (imediacontrollercallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #130 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.mExtraControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #160 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//    5   11:pop             
		//    6   12:return          
		}

		final MediaSessionImplApi21 this$0;

		MediaSessionImplApi21.ExtraSession()
		{
			this$0 = MediaSessionImplApi21.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void IMediaSession$Stub()>
		//    5    9:return          
		}
	}

	static class MediaSessionImplApi28 extends MediaSessionImplApi21
	{

		public final android.support.v4.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
		{
			return new android.support.v4.media.MediaSessionManager.RemoteUserInfo(((MediaSession)mSessionObj).getCurrentControllerInfo());
		//    0    0:new             #23  <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #27  <Field Object mSessionObj>
		//    4    8:checkcast       #29  <Class MediaSession>
		//    5   11:invokevirtual   #32  <Method android.media.session.MediaSessionManager$RemoteUserInfo MediaSession.getCurrentControllerInfo()>
		//    6   14:invokespecial   #35  <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(android.media.session.MediaSessionManager$RemoteUserInfo)>
		//    7   17:areturn         
		}

		public void setCurrentControllerInfo(android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo)
		{
		//    0    0:return          
		}

		MediaSessionImplApi28(Context context, String s, Bundle bundle)
		{
			super(context, s, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #14  <Method void MediaSessionCompat$MediaSessionImplApi21(Context, String, Bundle)>
		//    5    7:return          
		}

		MediaSessionImplApi28(Object obj)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #18  <Method void MediaSessionCompat$MediaSessionImplApi21(Object)>
		//    3    5:return          
		}
	}

	static class MediaSessionImplBase
		implements MediaSessionImpl
	{

		private void sendCaptioningEnabled(boolean flag)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onCaptioningEnabledChanged(flag);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #178 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendEvent(String s, Bundle bundle)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_3        
			while(i >= 0) 
		//*   6   10:iload_3         
		//*   7   11:iflt            43
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_3         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore          4
				try
				{
					imediacontrollercallback.onEvent(s, bundle);
		//   14   27:aload           4
		//   15   29:aload_1         
		//   16   30:aload_2         
		//   17   31:invokeinterface #186 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
				}
		//*  18   36:iload_3         
		//*  19   37:iconst_1        
		//*  20   38:isub            
		//*  21   39:istore_3        
		//*  22   40:goto            10
		//*  23   43:aload_0         
		//*  24   44:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  25   47:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  26   50:return          
				catch(RemoteException remoteexception) { }
		//   27   51:astore          4
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  28   53:goto            36
		}

		private void sendExtras(Bundle bundle)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onExtrasChanged(bundle);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #191 <Method void IMediaControllerCallback.onExtrasChanged(Bundle)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendMetadata(MediaMetadataCompat mediametadatacompat)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onMetadataChanged(mediametadatacompat);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #196 <Method void IMediaControllerCallback.onMetadataChanged(MediaMetadataCompat)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendQueue(List list)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onQueueChanged(list);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #201 <Method void IMediaControllerCallback.onQueueChanged(List)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendQueueTitle(CharSequence charsequence)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onQueueTitleChanged(charsequence);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #208 <Method void IMediaControllerCallback.onQueueTitleChanged(CharSequence)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendRepeatMode(int i)
		{
			int j = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(j >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onRepeatModeChanged(i);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #213 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				j--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendSessionDestroyed()
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_1        
			while(i >= 0) 
		//*   6   10:iload_1         
		//*   7   11:iflt            39
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_1         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_2        
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//   14   26:aload_2         
		//   15   27:invokeinterface #217 <Method void IMediaControllerCallback.onSessionDestroyed()>
				}
		//*  16   32:iload_1         
		//*  17   33:iconst_1        
		//*  18   34:isub            
		//*  19   35:istore_1        
		//*  20   36:goto            10
		//*  21   39:aload_0         
		//*  22   40:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  23   43:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  24   46:aload_0         
		//*  25   47:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  26   50:invokevirtual   #220 <Method void RemoteCallbackList.kill()>
		//*  27   53:return          
				catch(RemoteException remoteexception) { }
		//   28   54:astore_2        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
			mControllerCallbacks.kill();
		//*  29   55:goto            32
		}

		private void sendShuffleMode(int i)
		{
			int j = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(j >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onShuffleModeChanged(i);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #224 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				j--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendState(PlaybackStateCompat playbackstatecompat)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #229 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		void adjustVolume(int i, int j)
		{
			if(mVolumeType == 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #144 <Field int mVolumeType>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          23
			{
				VolumeProviderCompat volumeprovidercompat = mVolumeProvider;
		//    4    8:aload_0         
		//    5    9:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
		//    6   12:astore_3        
				if(volumeprovidercompat != null)
		//*   7   13:aload_3         
		//*   8   14:ifnull          36
				{
					volumeprovidercompat.onAdjustVolume(i);
		//    9   17:aload_3         
		//   10   18:iload_1         
		//   11   19:invokevirtual   #238 <Method void VolumeProviderCompat.onAdjustVolume(int)>
					return;
		//   12   22:return          
				}
			} else
			{
				mAudioManager.adjustStreamVolume(mLocalStream, i, j);
		//   13   23:aload_0         
		//   14   24:getfield        #124 <Field AudioManager mAudioManager>
		//   15   27:aload_0         
		//   16   28:getfield        #146 <Field int mLocalStream>
		//   17   31:iload_1         
		//   18   32:iload_2         
		//   19   33:invokevirtual   #242 <Method void AudioManager.adjustStreamVolume(int, int, int)>
			}
		//   20   36:return          
		}

		android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
		{
			android.media.RemoteControlClient.MetadataEditor metadataeditor = mRcc.editMetadata(true);
		//    0    0:aload_0         
		//    1    1:getfield        #153 <Field RemoteControlClient mRcc>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #248 <Method android.media.RemoteControlClient$MetadataEditor RemoteControlClient.editMetadata(boolean)>
		//    4    8:astore          4
			if(bundle == null)
		//*   5   10:aload_1         
		//*   6   11:ifnonnull       17
				return metadataeditor;
		//    7   14:aload           4
		//    8   16:areturn         
			if(bundle.containsKey("android.media.metadata.ART"))
		//*   9   17:aload_1         
		//*  10   18:ldc1            #250 <String "android.media.metadata.ART">
		//*  11   20:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//*  12   23:ifeq            64
			{
				Bitmap bitmap2 = (Bitmap)bundle.getParcelable("android.media.metadata.ART");
		//   13   26:aload_1         
		//   14   27:ldc1            #250 <String "android.media.metadata.ART">
		//   15   29:invokevirtual   #260 <Method Parcelable Bundle.getParcelable(String)>
		//   16   32:checkcast       #262 <Class Bitmap>
		//   17   35:astore_3        
				Bitmap bitmap = bitmap2;
		//   18   36:aload_3         
		//   19   37:astore_2        
				if(bitmap2 != null)
		//*  20   38:aload_3         
		//*  21   39:ifnull          52
					bitmap = bitmap2.copy(bitmap2.getConfig(), false);
		//   22   42:aload_3         
		//   23   43:aload_3         
		//   24   44:invokevirtual   #266 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
		//   25   47:iconst_0        
		//   26   48:invokevirtual   #270 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
		//   27   51:astore_2        
				metadataeditor.putBitmap(100, bitmap);
		//   28   52:aload           4
		//   29   54:bipush          100
		//   30   56:aload_2         
		//   31   57:invokevirtual   #276 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
		//   32   60:pop             
			} else
		//*  33   61:goto            110
			if(bundle.containsKey("android.media.metadata.ALBUM_ART"))
		//*  34   64:aload_1         
		//*  35   65:ldc2            #278 <String "android.media.metadata.ALBUM_ART">
		//*  36   68:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//*  37   71:ifeq            110
			{
				Bitmap bitmap3 = (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART");
		//   38   74:aload_1         
		//   39   75:ldc2            #278 <String "android.media.metadata.ALBUM_ART">
		//   40   78:invokevirtual   #260 <Method Parcelable Bundle.getParcelable(String)>
		//   41   81:checkcast       #262 <Class Bitmap>
		//   42   84:astore_3        
				Bitmap bitmap1 = bitmap3;
		//   43   85:aload_3         
		//   44   86:astore_2        
				if(bitmap3 != null)
		//*  45   87:aload_3         
		//*  46   88:ifnull          101
					bitmap1 = bitmap3.copy(bitmap3.getConfig(), false);
		//   47   91:aload_3         
		//   48   92:aload_3         
		//   49   93:invokevirtual   #266 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
		//   50   96:iconst_0        
		//   51   97:invokevirtual   #270 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
		//   52  100:astore_2        
				metadataeditor.putBitmap(100, bitmap1);
		//   53  101:aload           4
		//   54  103:bipush          100
		//   55  105:aload_2         
		//   56  106:invokevirtual   #276 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
		//   57  109:pop             
			}
			if(bundle.containsKey("android.media.metadata.ALBUM"))
		//*  58  110:aload_1         
		//*  59  111:ldc2            #280 <String "android.media.metadata.ALBUM">
		//*  60  114:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//*  61  117:ifeq            134
				metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
		//   62  120:aload           4
		//   63  122:iconst_1        
		//   64  123:aload_1         
		//   65  124:ldc2            #280 <String "android.media.metadata.ALBUM">
		//   66  127:invokevirtual   #284 <Method String Bundle.getString(String)>
		//   67  130:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   68  133:pop             
			if(bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
		//*  69  134:aload_1         
		//*  70  135:ldc2            #290 <String "android.media.metadata.ALBUM_ARTIST">
		//*  71  138:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//*  72  141:ifeq            159
				metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
		//   73  144:aload           4
		//   74  146:bipush          13
		//   75  148:aload_1         
		//   76  149:ldc2            #290 <String "android.media.metadata.ALBUM_ARTIST">
		//   77  152:invokevirtual   #284 <Method String Bundle.getString(String)>
		//   78  155:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   79  158:pop             
			if(bundle.containsKey("android.media.metadata.ARTIST"))
		//*  80  159:aload_1         
		//*  81  160:ldc2            #292 <String "android.media.metadata.ARTIST">
		//*  82  163:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//*  83  166:ifeq            183
				metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
		//   84  169:aload           4
		//   85  171:iconst_2        
		//   86  172:aload_1         
		//   87  173:ldc2            #292 <String "android.media.metadata.ARTIST">
		//   88  176:invokevirtual   #284 <Method String Bundle.getString(String)>
		//   89  179:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   90  182:pop             
			if(bundle.containsKey("android.media.metadata.AUTHOR"))
		//*  91  183:aload_1         
		//*  92  184:ldc2            #294 <String "android.media.metadata.AUTHOR">
		//*  93  187:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//*  94  190:ifeq            207
				metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
		//   95  193:aload           4
		//   96  195:iconst_3        
		//   97  196:aload_1         
		//   98  197:ldc2            #294 <String "android.media.metadata.AUTHOR">
		//   99  200:invokevirtual   #284 <Method String Bundle.getString(String)>
		//  100  203:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  101  206:pop             
			if(bundle.containsKey("android.media.metadata.COMPILATION"))
		//* 102  207:aload_1         
		//* 103  208:ldc2            #296 <String "android.media.metadata.COMPILATION">
		//* 104  211:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 105  214:ifeq            232
				metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
		//  106  217:aload           4
		//  107  219:bipush          15
		//  108  221:aload_1         
		//  109  222:ldc2            #296 <String "android.media.metadata.COMPILATION">
		//  110  225:invokevirtual   #284 <Method String Bundle.getString(String)>
		//  111  228:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  112  231:pop             
			if(bundle.containsKey("android.media.metadata.COMPOSER"))
		//* 113  232:aload_1         
		//* 114  233:ldc2            #298 <String "android.media.metadata.COMPOSER">
		//* 115  236:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 116  239:ifeq            256
				metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
		//  117  242:aload           4
		//  118  244:iconst_4        
		//  119  245:aload_1         
		//  120  246:ldc2            #298 <String "android.media.metadata.COMPOSER">
		//  121  249:invokevirtual   #284 <Method String Bundle.getString(String)>
		//  122  252:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  123  255:pop             
			if(bundle.containsKey("android.media.metadata.DATE"))
		//* 124  256:aload_1         
		//* 125  257:ldc2            #300 <String "android.media.metadata.DATE">
		//* 126  260:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 127  263:ifeq            280
				metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
		//  128  266:aload           4
		//  129  268:iconst_5        
		//  130  269:aload_1         
		//  131  270:ldc2            #300 <String "android.media.metadata.DATE">
		//  132  273:invokevirtual   #284 <Method String Bundle.getString(String)>
		//  133  276:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  134  279:pop             
			if(bundle.containsKey("android.media.metadata.DISC_NUMBER"))
		//* 135  280:aload_1         
		//* 136  281:ldc2            #302 <String "android.media.metadata.DISC_NUMBER">
		//* 137  284:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 138  287:ifeq            305
				metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
		//  139  290:aload           4
		//  140  292:bipush          14
		//  141  294:aload_1         
		//  142  295:ldc2            #302 <String "android.media.metadata.DISC_NUMBER">
		//  143  298:invokevirtual   #306 <Method long Bundle.getLong(String)>
		//  144  301:invokevirtual   #310 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  145  304:pop             
			if(bundle.containsKey("android.media.metadata.DURATION"))
		//* 146  305:aload_1         
		//* 147  306:ldc2            #312 <String "android.media.metadata.DURATION">
		//* 148  309:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 149  312:ifeq            330
				metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
		//  150  315:aload           4
		//  151  317:bipush          9
		//  152  319:aload_1         
		//  153  320:ldc2            #312 <String "android.media.metadata.DURATION">
		//  154  323:invokevirtual   #306 <Method long Bundle.getLong(String)>
		//  155  326:invokevirtual   #310 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  156  329:pop             
			if(bundle.containsKey("android.media.metadata.GENRE"))
		//* 157  330:aload_1         
		//* 158  331:ldc2            #314 <String "android.media.metadata.GENRE">
		//* 159  334:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 160  337:ifeq            355
				metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
		//  161  340:aload           4
		//  162  342:bipush          6
		//  163  344:aload_1         
		//  164  345:ldc2            #314 <String "android.media.metadata.GENRE">
		//  165  348:invokevirtual   #284 <Method String Bundle.getString(String)>
		//  166  351:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  167  354:pop             
			if(bundle.containsKey("android.media.metadata.TITLE"))
		//* 168  355:aload_1         
		//* 169  356:ldc2            #316 <String "android.media.metadata.TITLE">
		//* 170  359:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 171  362:ifeq            380
				metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
		//  172  365:aload           4
		//  173  367:bipush          7
		//  174  369:aload_1         
		//  175  370:ldc2            #316 <String "android.media.metadata.TITLE">
		//  176  373:invokevirtual   #284 <Method String Bundle.getString(String)>
		//  177  376:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  178  379:pop             
			if(bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
		//* 179  380:aload_1         
		//* 180  381:ldc2            #318 <String "android.media.metadata.TRACK_NUMBER">
		//* 181  384:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 182  387:ifeq            404
				metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
		//  183  390:aload           4
		//  184  392:iconst_0        
		//  185  393:aload_1         
		//  186  394:ldc2            #318 <String "android.media.metadata.TRACK_NUMBER">
		//  187  397:invokevirtual   #306 <Method long Bundle.getLong(String)>
		//  188  400:invokevirtual   #310 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  189  403:pop             
			if(bundle.containsKey("android.media.metadata.WRITER"))
		//* 190  404:aload_1         
		//* 191  405:ldc2            #320 <String "android.media.metadata.WRITER">
		//* 192  408:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
		//* 193  411:ifeq            429
				metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
		//  194  414:aload           4
		//  195  416:bipush          11
		//  196  418:aload_1         
		//  197  419:ldc2            #320 <String "android.media.metadata.WRITER">
		//  198  422:invokevirtual   #284 <Method String Bundle.getString(String)>
		//  199  425:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  200  428:pop             
			return metadataeditor;
		//  201  429:aload           4
		//  202  431:areturn         
		}

		public String getCallingPackage()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public android.support.v4.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
		{
			android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #86  <Field Object mLock>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				remoteuserinfo = mRemoteUserInfo;
		//    5    7:aload_0         
		//    6    8:getfield        #325 <Field android.support.v4.media.MediaSessionManager$RemoteUserInfo mRemoteUserInfo>
		//    7   11:astore_2        
			}
		//    8   12:aload_1         
		//    9   13:monitorexit     
			return remoteuserinfo;
		//   10   14:aload_2         
		//   11   15:areturn         
			exception;
		//   12   16:astore_2        
			obj;
		//   13   17:aload_1         
			JVM INSTR monitorexit ;
		//   14   18:monitorexit     
			throw exception;
		//   15   19:aload_2         
		//   16   20:athrow          
		}

		public Object getMediaSession()
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			PlaybackStateCompat playbackstatecompat;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #86  <Field Object mLock>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				playbackstatecompat = mState;
		//    5    7:aload_0         
		//    6    8:getfield        #331 <Field PlaybackStateCompat mState>
		//    7   11:astore_2        
			}
		//    8   12:aload_1         
		//    9   13:monitorexit     
			return playbackstatecompat;
		//   10   14:aload_2         
		//   11   15:areturn         
			exception;
		//   12   16:astore_2        
			obj;
		//   13   17:aload_1         
			JVM INSTR monitorexit ;
		//   14   18:monitorexit     
			throw exception;
		//   15   19:aload_2         
		//   16   20:athrow          
		}

		int getRccStateFromState(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 11: default 64
		//		               0 88
		//		               1 86
		//		               2 84
		//		               3 82
		//		               4 80
		//		               5 78
		//		               6 75
		//		               7 72
		//		               8 75
		//		               9 69
		//		               10 66
		//		               11 66
			default:
				return -1;
		//    2   64:iconst_m1       
		//    3   65:ireturn         

			case 10: // '\n'
			case 11: // '\013'
				return 6;
		//    4   66:bipush          6
		//    5   68:ireturn         

			case 9: // '\t'
				return 7;
		//    6   69:bipush          7
		//    7   71:ireturn         

			case 7: // '\007'
				return 9;
		//    8   72:bipush          9
		//    9   74:ireturn         

			case 6: // '\006'
			case 8: // '\b'
				return 8;
		//   10   75:bipush          8
		//   11   77:ireturn         

			case 5: // '\005'
				return 5;
		//   12   78:iconst_5        
		//   13   79:ireturn         

			case 4: // '\004'
				return 4;
		//   14   80:iconst_4        
		//   15   81:ireturn         

			case 3: // '\003'
				return 3;
		//   16   82:iconst_3        
		//   17   83:ireturn         

			case 2: // '\002'
				return 2;
		//   18   84:iconst_2        
		//   19   85:ireturn         

			case 1: // '\001'
				return 1;
		//   20   86:iconst_1        
		//   21   87:ireturn         

			case 0: // '\0'
				return 0;
		//   22   88:iconst_0        
		//   23   89:ireturn         
			}
		}

		int getRccTransportControlFlagsFromActions(long l)
		{
			int j;
			if((1L & l) != 0L)
		//*   0    0:lconst_1        
		//*   1    1:lload_1         
		//*   2    2:land            
		//*   3    3:lconst_0        
		//*   4    4:lcmp            
		//*   5    5:ifeq            15
				j = 32;
		//    6    8:bipush          32
		//    7   10:istore          4
			else
		//*   8   12:goto            18
				j = 0;
		//    9   15:iconst_0        
		//   10   16:istore          4
			int i = j;
		//   11   18:iload           4
		//   12   20:istore_3        
			if((2L & l) != 0L)
		//*  13   21:ldc2w           #336 <Long 2L>
		//*  14   24:lload_1         
		//*  15   25:land            
		//*  16   26:lconst_0        
		//*  17   27:lcmp            
		//*  18   28:ifeq            37
				i = j | 0x10;
		//   19   31:iload           4
		//   20   33:bipush          16
		//   21   35:ior             
		//   22   36:istore_3        
			j = i;
		//   23   37:iload_3         
		//   24   38:istore          4
			if((4L & l) != 0L)
		//*  25   40:ldc2w           #338 <Long 4L>
		//*  26   43:lload_1         
		//*  27   44:land            
		//*  28   45:lconst_0        
		//*  29   46:lcmp            
		//*  30   47:ifeq            55
				j = i | 4;
		//   31   50:iload_3         
		//   32   51:iconst_4        
		//   33   52:ior             
		//   34   53:istore          4
			i = j;
		//   35   55:iload           4
		//   36   57:istore_3        
			if((8L & l) != 0L)
		//*  37   58:ldc2w           #340 <Long 8L>
		//*  38   61:lload_1         
		//*  39   62:land            
		//*  40   63:lconst_0        
		//*  41   64:lcmp            
		//*  42   65:ifeq            73
				i = j | 2;
		//   43   68:iload           4
		//   44   70:iconst_2        
		//   45   71:ior             
		//   46   72:istore_3        
			j = i;
		//   47   73:iload_3         
		//   48   74:istore          4
			if((16L & l) != 0L)
		//*  49   76:ldc2w           #342 <Long 16L>
		//*  50   79:lload_1         
		//*  51   80:land            
		//*  52   81:lconst_0        
		//*  53   82:lcmp            
		//*  54   83:ifeq            91
				j = i | 1;
		//   55   86:iload_3         
		//   56   87:iconst_1        
		//   57   88:ior             
		//   58   89:istore          4
			i = j;
		//   59   91:iload           4
		//   60   93:istore_3        
			if((32L & l) != 0L)
		//*  61   94:ldc2w           #344 <Long 32L>
		//*  62   97:lload_1         
		//*  63   98:land            
		//*  64   99:lconst_0        
		//*  65  100:lcmp            
		//*  66  101:ifeq            111
				i = j | 0x80;
		//   67  104:iload           4
		//   68  106:sipush          128
		//   69  109:ior             
		//   70  110:istore_3        
			j = i;
		//   71  111:iload_3         
		//   72  112:istore          4
			if((64L & l) != 0L)
		//*  73  114:ldc2w           #346 <Long 64L>
		//*  74  117:lload_1         
		//*  75  118:land            
		//*  76  119:lconst_0        
		//*  77  120:lcmp            
		//*  78  121:ifeq            130
				j = i | 0x40;
		//   79  124:iload_3         
		//   80  125:bipush          64
		//   81  127:ior             
		//   82  128:istore          4
			i = j;
		//   83  130:iload           4
		//   84  132:istore_3        
			if((l & 512L) != 0L)
		//*  85  133:lload_1         
		//*  86  134:ldc2w           #348 <Long 512L>
		//*  87  137:land            
		//*  88  138:lconst_0        
		//*  89  139:lcmp            
		//*  90  140:ifeq            149
				i = j | 8;
		//   91  143:iload           4
		//   92  145:bipush          8
		//   93  147:ior             
		//   94  148:istore_3        
			return i;
		//   95  149:iload_3         
		//   96  150:ireturn         
		}

		public Object getRemoteControlClient()
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Token getSessionToken()
		{
			return mToken;
		//    0    0:aload_0         
		//    1    1:getfield        #140 <Field MediaSessionCompat$Token mToken>
		//    2    4:areturn         
		}

		public boolean isActive()
		{
			return mIsActive;
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field boolean mIsActive>
		//    2    4:ireturn         
		}

		void postToHandler(int i, int j, int k, Object obj, Bundle bundle)
		{
			Object obj1 = mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field Object mLock>
		//    2    4:astore          6
			obj1;
		//    3    6:aload           6
			JVM INSTR monitorenter ;
		//    4    8:monitorenter    
			Bundle bundle1;
			if(mHandler == null)
				break MISSING_BLOCK_LABEL_99;
		//    5    9:aload_0         
		//    6   10:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//    7   13:ifnull          99
			obj = ((Object) (mHandler.obtainMessage(i, j, k, obj)));
		//    8   16:aload_0         
		//    9   17:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   10   20:iload_1         
		//   11   21:iload_2         
		//   12   22:iload_3         
		//   13   23:aload           4
		//   14   25:invokevirtual   #362 <Method Message MediaSessionCompat$MediaSessionImplBase$MessageHandler.obtainMessage(int, int, int, Object)>
		//   15   28:astore          4
			bundle1 = new Bundle();
		//   16   30:new             #252 <Class Bundle>
		//   17   33:dup             
		//   18   34:invokespecial   #363 <Method void Bundle()>
		//   19   37:astore          7
			bundle1.putString("data_calling_pkg", "android.media.session.MediaController");
		//   20   39:aload           7
		//   21   41:ldc2            #365 <String "data_calling_pkg">
		//   22   44:ldc2            #367 <String "android.media.session.MediaController">
		//   23   47:invokevirtual   #370 <Method void Bundle.putString(String, String)>
			bundle1.putInt("data_calling_pid", Binder.getCallingPid());
		//   24   50:aload           7
		//   25   52:ldc2            #372 <String "data_calling_pid">
		//   26   55:invokestatic    #377 <Method int Binder.getCallingPid()>
		//   27   58:invokevirtual   #381 <Method void Bundle.putInt(String, int)>
			bundle1.putInt("data_calling_uid", Binder.getCallingUid());
		//   28   61:aload           7
		//   29   63:ldc2            #383 <String "data_calling_uid">
		//   30   66:invokestatic    #386 <Method int Binder.getCallingUid()>
		//   31   69:invokevirtual   #381 <Method void Bundle.putInt(String, int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_87;
		//   32   72:aload           5
		//   33   74:ifnull          87
			bundle1.putBundle("data_extras", bundle);
		//   34   77:aload           7
		//   35   79:ldc2            #388 <String "data_extras">
		//   36   82:aload           5
		//   37   84:invokevirtual   #391 <Method void Bundle.putBundle(String, Bundle)>
			((Message) (obj)).setData(bundle1);
		//   38   87:aload           4
		//   39   89:aload           7
		//   40   91:invokevirtual   #396 <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
		//   41   94:aload           4
		//   42   96:invokevirtual   #399 <Method void Message.sendToTarget()>
			obj1;
		//   43   99:aload           6
			JVM INSTR monitorexit ;
		//   44  101:monitorexit     
			return;
		//   45  102:return          
			obj;
		//   46  103:astore          4
			obj1;
		//   47  105:aload           6
			JVM INSTR monitorexit ;
		//   48  107:monitorexit     
			throw obj;
		//   49  108:aload           4
		//   50  110:athrow          
		}

		void registerMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			mAudioManager.registerMediaButtonEventReceiver(componentname);
		//    0    0:aload_0         
		//    1    1:getfield        #124 <Field AudioManager mAudioManager>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #404 <Method void AudioManager.registerMediaButtonEventReceiver(ComponentName)>
		//    4    8:return          
		}

		public void release()
		{
			mIsActive = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #95  <Field boolean mIsActive>
			mDestroyed = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #93  <Field boolean mDestroyed>
			update();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #408 <Method boolean update()>
		//    8   14:pop             
			sendSessionDestroyed();
		//    9   15:aload_0         
		//   10   16:invokespecial   #410 <Method void sendSessionDestroyed()>
		//   11   19:return          
		}

		public void sendSessionEvent(String s, Bundle bundle)
		{
			sendEvent(s, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #413 <Method void sendEvent(String, Bundle)>
		//    4    6:return          
		}

		void sendVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #175 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onVolumeInfoChanged(parcelablevolumeinfo);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #418 <Method void IMediaControllerCallback.onVolumeInfoChanged(ParcelableVolumeInfo)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		public void setActive(boolean flag)
		{
			if(flag == mIsActive)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #95  <Field boolean mIsActive>
		//*   3    5:icmpne          9
				return;
		//    4    8:return          
			mIsActive = flag;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #95  <Field boolean mIsActive>
			if(update())
		//*   8   14:aload_0         
		//*   9   15:invokevirtual   #408 <Method boolean update()>
		//*  10   18:ifeq            37
			{
				setMetadata(mMetadata);
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #421 <Field MediaMetadataCompat mMetadata>
		//   14   26:invokevirtual   #424 <Method void setMetadata(MediaMetadataCompat)>
				setPlaybackState(mState);
		//   15   29:aload_0         
		//   16   30:aload_0         
		//   17   31:getfield        #331 <Field PlaybackStateCompat mState>
		//   18   34:invokevirtual   #427 <Method void setPlaybackState(PlaybackStateCompat)>
			}
		//   19   37:return          
		}

		public void setCallback(Callback callback, Handler handler)
		{
			mCallback = callback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #431 <Field MediaSessionCompat$Callback mCallback>
			if(callback != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          78
			{
				callback = ((Callback) (handler));
		//    5    9:aload_2         
		//    6   10:astore_1        
				if(handler == null)
		//*   7   11:aload_2         
		//*   8   12:ifnonnull       23
					callback = ((Callback) (new Handler()));
		//    9   15:new             #433 <Class Handler>
		//   10   18:dup             
		//   11   19:invokespecial   #434 <Method void Handler()>
		//   12   22:astore_1        
				synchronized(mLock)
		//*  13   23:aload_0         
		//*  14   24:getfield        #86  <Field Object mLock>
		//*  15   27:astore_2        
		//*  16   28:aload_2         
		//*  17   29:monitorenter    
				{
					if(mHandler != null)
		//*  18   30:aload_0         
		//*  19   31:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//*  20   34:ifnull          45
						mHandler.removeCallbacksAndMessages(((Object) (null)));
		//   21   37:aload_0         
		//   22   38:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   23   41:aconst_null     
		//   24   42:invokevirtual   #437 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.removeCallbacksAndMessages(Object)>
					mHandler = new MessageHandler(((Handler) (callback)).getLooper());
		//   25   45:aload_0         
		//   26   46:new             #19  <Class MediaSessionCompat$MediaSessionImplBase$MessageHandler>
		//   27   49:dup             
		//   28   50:aload_0         
		//   29   51:aload_1         
		//   30   52:invokevirtual   #441 <Method Looper Handler.getLooper()>
		//   31   55:invokespecial   #444 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase, Looper)>
		//   32   58:putfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
					mCallback.setSessionImpl(((MediaSessionImpl) (this)), ((Handler) (callback)));
		//   33   61:aload_0         
		//   34   62:getfield        #431 <Field MediaSessionCompat$Callback mCallback>
		//   35   65:aload_0         
		//   36   66:aload_1         
		//   37   67:invokevirtual   #450 <Method void MediaSessionCompat$Callback.setSessionImpl(MediaSessionCompat$MediaSessionImpl, Handler)>
				}
		//   38   70:aload_2         
		//   39   71:monitorexit     
				return;
		//   40   72:return          
			} else
		//*  41   73:astore_1        
		//*  42   74:aload_2         
		//*  43   75:monitorexit     
		//*  44   76:aload_1         
		//*  45   77:athrow          
			{
				return;
		//   46   78:return          
			}
			callback;
			handler;
			JVM INSTR monitorexit ;
			throw callback;
		}

		public void setCaptioningEnabled(boolean flag)
		{
			if(mCaptioningEnabled != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #453 <Field boolean mCaptioningEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mCaptioningEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #453 <Field boolean mCaptioningEnabled>
				sendCaptioningEnabled(flag);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #455 <Method void sendCaptioningEnabled(boolean)>
			}
		//   10   18:return          
		}

		public void setCurrentControllerInfo(android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #86  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mRemoteUserInfo = remoteuserinfo;
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:putfield        #325 <Field android.support.v4.media.MediaSessionManager$RemoteUserInfo mRemoteUserInfo>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			return;
		//   10   14:return          
			remoteuserinfo;
		//   11   15:astore_1        
			obj;
		//   12   16:aload_2         
			JVM INSTR monitorexit ;
		//   13   17:monitorexit     
			throw remoteuserinfo;
		//   14   18:aload_1         
		//   15   19:athrow          
		}

		public void setExtras(Bundle bundle)
		{
			mExtras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #460 <Field Bundle mExtras>
			sendExtras(bundle);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #462 <Method void sendExtras(Bundle)>
		//    6   10:return          
		}

		public void setFlags(int i)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #86  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mFlags = i;
		//    5    7:aload_0         
		//    6    8:iload_1         
		//    7    9:putfield        #465 <Field int mFlags>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			update();
		//   10   14:aload_0         
		//   11   15:invokevirtual   #408 <Method boolean update()>
		//   12   18:pop             
			return;
		//   13   19:return          
			exception;
		//   14   20:astore_3        
			obj;
		//   15   21:aload_2         
			JVM INSTR monitorexit ;
		//   16   22:monitorexit     
			throw exception;
		//   17   23:aload_3         
		//   18   24:athrow          
		}

		public void setMediaButtonReceiver(PendingIntent pendingintent)
		{
		//    0    0:return          
		}

		public void setMetadata(MediaMetadataCompat mediametadatacompat)
		{
			MediaMetadataCompat mediametadatacompat1 = mediametadatacompat;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(mediametadatacompat != null)
		//*   2    2:aload_1         
		//*   3    3:ifnull          21
				mediametadatacompat1 = (new android.support.v4.media.MediaMetadataCompat.Builder(mediametadatacompat, MediaSessionCompat.sMaxBitmapSize)).build();
		//    4    6:new             #468 <Class android.support.v4.media.MediaMetadataCompat$Builder>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:getstatic       #471 <Field int MediaSessionCompat.sMaxBitmapSize>
		//    8   14:invokespecial   #474 <Method void android.support.v4.media.MediaMetadataCompat$Builder(MediaMetadataCompat, int)>
		//    9   17:invokevirtual   #478 <Method MediaMetadataCompat android.support.v4.media.MediaMetadataCompat$Builder.build()>
		//   10   20:astore_2        
			synchronized(mLock)
		//*  11   21:aload_0         
		//*  12   22:getfield        #86  <Field Object mLock>
		//*  13   25:astore_1        
		//*  14   26:aload_1         
		//*  15   27:monitorenter    
			{
				mMetadata = mediametadatacompat1;
		//   16   28:aload_0         
		//   17   29:aload_2         
		//   18   30:putfield        #421 <Field MediaMetadataCompat mMetadata>
			}
		//   19   33:aload_1         
		//   20   34:monitorexit     
			sendMetadata(mediametadatacompat1);
		//   21   35:aload_0         
		//   22   36:aload_2         
		//   23   37:invokespecial   #480 <Method void sendMetadata(MediaMetadataCompat)>
			if(!mIsActive)
		//*  24   40:aload_0         
		//*  25   41:getfield        #95  <Field boolean mIsActive>
		//*  26   44:ifne            48
				return;
		//   27   47:return          
			if(mediametadatacompat1 == null)
		//*  28   48:aload_2         
		//*  29   49:ifnonnull       57
				mediametadatacompat = null;
		//   30   52:aconst_null     
		//   31   53:astore_1        
			else
		//*  32   54:goto            62
				mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat1.getBundle()));
		//   33   57:aload_2         
		//   34   58:invokevirtual   #486 <Method Bundle MediaMetadataCompat.getBundle()>
		//   35   61:astore_1        
			buildRccMetadata(((Bundle) (mediametadatacompat))).apply();
		//   36   62:aload_0         
		//   37   63:aload_1         
		//   38   64:invokevirtual   #488 <Method android.media.RemoteControlClient$MetadataEditor buildRccMetadata(Bundle)>
		//   39   67:invokevirtual   #491 <Method void android.media.RemoteControlClient$MetadataEditor.apply()>
			return;
		//   40   70:return          
			exception;
		//   41   71:astore_2        
			mediametadatacompat;
		//   42   72:aload_1         
			JVM INSTR monitorexit ;
		//   43   73:monitorexit     
			throw exception;
		//   44   74:aload_2         
		//   45   75:athrow          
		}

		public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #86  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mState = playbackstatecompat;
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:putfield        #331 <Field PlaybackStateCompat mState>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			sendState(playbackstatecompat);
		//   10   14:aload_0         
		//   11   15:aload_1         
		//   12   16:invokespecial   #493 <Method void sendState(PlaybackStateCompat)>
			if(!mIsActive)
		//*  13   19:aload_0         
		//*  14   20:getfield        #95  <Field boolean mIsActive>
		//*  15   23:ifne            27
				return;
		//   16   26:return          
			if(playbackstatecompat == null)
		//*  17   27:aload_1         
		//*  18   28:ifnonnull       48
			{
				mRcc.setPlaybackState(0);
		//   19   31:aload_0         
		//   20   32:getfield        #153 <Field RemoteControlClient mRcc>
		//   21   35:iconst_0        
		//   22   36:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
				mRcc.setTransportControlFlags(0);
		//   23   39:aload_0         
		//   24   40:getfield        #153 <Field RemoteControlClient mRcc>
		//   25   43:iconst_0        
		//   26   44:invokevirtual   #498 <Method void RemoteControlClient.setTransportControlFlags(int)>
				return;
		//   27   47:return          
			} else
			{
				setRccState(playbackstatecompat);
		//   28   48:aload_0         
		//   29   49:aload_1         
		//   30   50:invokevirtual   #501 <Method void setRccState(PlaybackStateCompat)>
				mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackstatecompat.getActions()));
		//   31   53:aload_0         
		//   32   54:getfield        #153 <Field RemoteControlClient mRcc>
		//   33   57:aload_0         
		//   34   58:aload_1         
		//   35   59:invokevirtual   #507 <Method long PlaybackStateCompat.getActions()>
		//   36   62:invokevirtual   #509 <Method int getRccTransportControlFlagsFromActions(long)>
		//   37   65:invokevirtual   #498 <Method void RemoteControlClient.setTransportControlFlags(int)>
				return;
		//   38   68:return          
			}
			playbackstatecompat;
		//   39   69:astore_1        
			obj;
		//   40   70:aload_2         
			JVM INSTR monitorexit ;
		//   41   71:monitorexit     
			throw playbackstatecompat;
		//   42   72:aload_1         
		//   43   73:athrow          
		}

		public void setPlaybackToLocal(int i)
		{
			VolumeProviderCompat volumeprovidercompat = mVolumeProvider;
		//    0    0:aload_0         
		//    1    1:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
		//    2    4:astore_3        
			if(volumeprovidercompat != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          14
				volumeprovidercompat.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
		//    5    9:aload_3         
		//    6   10:aconst_null     
		//    7   11:invokevirtual   #513 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
			mLocalStream = i;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:putfield        #146 <Field int mLocalStream>
			mVolumeType = 1;
		//   11   19:aload_0         
		//   12   20:iconst_1        
		//   13   21:putfield        #144 <Field int mVolumeType>
			i = mVolumeType;
		//   14   24:aload_0         
		//   15   25:getfield        #144 <Field int mVolumeType>
		//   16   28:istore_1        
			int j = mLocalStream;
		//   17   29:aload_0         
		//   18   30:getfield        #146 <Field int mLocalStream>
		//   19   33:istore_2        
			sendVolumeInfoChanged(new ParcelableVolumeInfo(i, j, 2, mAudioManager.getStreamMaxVolume(j), mAudioManager.getStreamVolume(mLocalStream)));
		//   20   34:aload_0         
		//   21   35:new             #515 <Class ParcelableVolumeInfo>
		//   22   38:dup             
		//   23   39:iload_1         
		//   24   40:iload_2         
		//   25   41:iconst_2        
		//   26   42:aload_0         
		//   27   43:getfield        #124 <Field AudioManager mAudioManager>
		//   28   46:iload_2         
		//   29   47:invokevirtual   #518 <Method int AudioManager.getStreamMaxVolume(int)>
		//   30   50:aload_0         
		//   31   51:getfield        #124 <Field AudioManager mAudioManager>
		//   32   54:aload_0         
		//   33   55:getfield        #146 <Field int mLocalStream>
		//   34   58:invokevirtual   #521 <Method int AudioManager.getStreamVolume(int)>
		//   35   61:invokespecial   #524 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   36   64:invokevirtual   #526 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
		//   37   67:return          
		}

		public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
		{
			if(volumeprovidercompat != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          77
			{
				VolumeProviderCompat volumeprovidercompat1 = mVolumeProvider;
		//    2    4:aload_0         
		//    3    5:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
		//    4    8:astore_2        
				if(volumeprovidercompat1 != null)
		//*   5    9:aload_2         
		//*   6   10:ifnull          18
					volumeprovidercompat1.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
		//    7   13:aload_2         
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #513 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
				mVolumeType = 2;
		//   10   18:aload_0         
		//   11   19:iconst_2        
		//   12   20:putfield        #144 <Field int mVolumeType>
				mVolumeProvider = volumeprovidercompat;
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:putfield        #233 <Field VolumeProviderCompat mVolumeProvider>
				sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
		//   16   28:aload_0         
		//   17   29:new             #515 <Class ParcelableVolumeInfo>
		//   18   32:dup             
		//   19   33:aload_0         
		//   20   34:getfield        #144 <Field int mVolumeType>
		//   21   37:aload_0         
		//   22   38:getfield        #146 <Field int mLocalStream>
		//   23   41:aload_0         
		//   24   42:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
		//   25   45:invokevirtual   #531 <Method int VolumeProviderCompat.getVolumeControl()>
		//   26   48:aload_0         
		//   27   49:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
		//   28   52:invokevirtual   #534 <Method int VolumeProviderCompat.getMaxVolume()>
		//   29   55:aload_0         
		//   30   56:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
		//   31   59:invokevirtual   #537 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   32   62:invokespecial   #524 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   33   65:invokevirtual   #526 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
				volumeprovidercompat.setCallback(mVolumeCallback);
		//   34   68:aload_1         
		//   35   69:aload_0         
		//   36   70:getfield        #104 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
		//   37   73:invokevirtual   #513 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
				return;
		//   38   76:return          
			} else
			{
				throw new IllegalArgumentException("volumeProvider may not be null");
		//   39   77:new             #155 <Class IllegalArgumentException>
		//   40   80:dup             
		//   41   81:ldc2            #539 <String "volumeProvider may not be null">
		//   42   84:invokespecial   #160 <Method void IllegalArgumentException(String)>
		//   43   87:athrow          
			}
		}

		public void setQueue(List list)
		{
			mQueue = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #542 <Field List mQueue>
			sendQueue(list);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #544 <Method void sendQueue(List)>
		//    6   10:return          
		}

		public void setQueueTitle(CharSequence charsequence)
		{
			mQueueTitle = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #547 <Field CharSequence mQueueTitle>
			sendQueueTitle(charsequence);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #549 <Method void sendQueueTitle(CharSequence)>
		//    6   10:return          
		}

		public void setRatingType(int i)
		{
			mRatingType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #142 <Field int mRatingType>
		//    3    5:return          
		}

		void setRccState(PlaybackStateCompat playbackstatecompat)
		{
			mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()));
		//    0    0:aload_0         
		//    1    1:getfield        #153 <Field RemoteControlClient mRcc>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #553 <Method int PlaybackStateCompat.getState()>
		//    5    9:invokevirtual   #555 <Method int getRccStateFromState(int)>
		//    6   12:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
		//    7   15:return          
		}

		public void setRepeatMode(int i)
		{
			if(mRepeatMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #558 <Field int mRepeatMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mRepeatMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #558 <Field int mRepeatMode>
				sendRepeatMode(i);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #560 <Method void sendRepeatMode(int)>
			}
		//   10   18:return          
		}

		public void setSessionActivity(PendingIntent pendingintent)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #86  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mSessionActivity = pendingintent;
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:putfield        #563 <Field PendingIntent mSessionActivity>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			return;
		//   10   14:return          
			pendingintent;
		//   11   15:astore_1        
			obj;
		//   12   16:aload_2         
			JVM INSTR monitorexit ;
		//   13   17:monitorexit     
			throw pendingintent;
		//   14   18:aload_1         
		//   15   19:athrow          
		}

		public void setShuffleMode(int i)
		{
			if(mShuffleMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #566 <Field int mShuffleMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mShuffleMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #566 <Field int mShuffleMode>
				sendShuffleMode(i);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #568 <Method void sendShuffleMode(int)>
			}
		//   10   18:return          
		}

		void setVolumeTo(int i, int j)
		{
			if(mVolumeType == 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #144 <Field int mVolumeType>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          23
			{
				VolumeProviderCompat volumeprovidercompat = mVolumeProvider;
		//    4    8:aload_0         
		//    5    9:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
		//    6   12:astore_3        
				if(volumeprovidercompat != null)
		//*   7   13:aload_3         
		//*   8   14:ifnull          36
				{
					volumeprovidercompat.onSetVolumeTo(i);
		//    9   17:aload_3         
		//   10   18:iload_1         
		//   11   19:invokevirtual   #572 <Method void VolumeProviderCompat.onSetVolumeTo(int)>
					return;
		//   12   22:return          
				}
			} else
			{
				mAudioManager.setStreamVolume(mLocalStream, i, j);
		//   13   23:aload_0         
		//   14   24:getfield        #124 <Field AudioManager mAudioManager>
		//   15   27:aload_0         
		//   16   28:getfield        #146 <Field int mLocalStream>
		//   17   31:iload_1         
		//   18   32:iload_2         
		//   19   33:invokevirtual   #575 <Method void AudioManager.setStreamVolume(int, int, int)>
			}
		//   20   36:return          
		}

		void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			mAudioManager.unregisterMediaButtonEventReceiver(componentname);
		//    0    0:aload_0         
		//    1    1:getfield        #124 <Field AudioManager mAudioManager>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #578 <Method void AudioManager.unregisterMediaButtonEventReceiver(ComponentName)>
		//    4    8:return          
		}

		boolean update()
		{
			if(mIsActive)
		//*   0    0:aload_0         
		//*   1    1:getfield        #95  <Field boolean mIsActive>
		//*   2    4:ifeq            153
			{
				if(!mIsMbrRegistered && (mFlags & 1) != 0)
		//*   3    7:aload_0         
		//*   4    8:getfield        #97  <Field boolean mIsMbrRegistered>
		//*   5   11:ifne            43
		//*   6   14:aload_0         
		//*   7   15:getfield        #465 <Field int mFlags>
		//*   8   18:iconst_1        
		//*   9   19:iand            
		//*  10   20:ifeq            43
				{
					registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   11   23:aload_0         
		//   12   24:aload_0         
		//   13   25:getfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
		//   14   28:aload_0         
		//   15   29:getfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
		//   16   32:invokevirtual   #580 <Method void registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
					mIsMbrRegistered = true;
		//   17   35:aload_0         
		//   18   36:iconst_1        
		//   19   37:putfield        #97  <Field boolean mIsMbrRegistered>
				} else
		//*  20   40:goto            76
				if(mIsMbrRegistered && (mFlags & 1) == 0)
		//*  21   43:aload_0         
		//*  22   44:getfield        #97  <Field boolean mIsMbrRegistered>
		//*  23   47:ifeq            76
		//*  24   50:aload_0         
		//*  25   51:getfield        #465 <Field int mFlags>
		//*  26   54:iconst_1        
		//*  27   55:iand            
		//*  28   56:ifne            76
				{
					unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   29   59:aload_0         
		//   30   60:aload_0         
		//   31   61:getfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
		//   32   64:aload_0         
		//   33   65:getfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
		//   34   68:invokevirtual   #582 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
					mIsMbrRegistered = false;
		//   35   71:aload_0         
		//   36   72:iconst_0        
		//   37   73:putfield        #97  <Field boolean mIsMbrRegistered>
				}
				if(!mIsRccRegistered && (mFlags & 2) != 0)
		//*  38   76:aload_0         
		//*  39   77:getfield        #99  <Field boolean mIsRccRegistered>
		//*  40   80:ifne            110
		//*  41   83:aload_0         
		//*  42   84:getfield        #465 <Field int mFlags>
		//*  43   87:iconst_2        
		//*  44   88:iand            
		//*  45   89:ifeq            110
				{
					mAudioManager.registerRemoteControlClient(mRcc);
		//   46   92:aload_0         
		//   47   93:getfield        #124 <Field AudioManager mAudioManager>
		//   48   96:aload_0         
		//   49   97:getfield        #153 <Field RemoteControlClient mRcc>
		//   50  100:invokevirtual   #586 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
					mIsRccRegistered = true;
		//   51  103:aload_0         
		//   52  104:iconst_1        
		//   53  105:putfield        #99  <Field boolean mIsRccRegistered>
					return true;
		//   54  108:iconst_1        
		//   55  109:ireturn         
				}
				if(mIsRccRegistered && (mFlags & 2) == 0)
		//*  56  110:aload_0         
		//*  57  111:getfield        #99  <Field boolean mIsRccRegistered>
		//*  58  114:ifeq            208
		//*  59  117:aload_0         
		//*  60  118:getfield        #465 <Field int mFlags>
		//*  61  121:iconst_2        
		//*  62  122:iand            
		//*  63  123:ifne            208
				{
					mRcc.setPlaybackState(0);
		//   64  126:aload_0         
		//   65  127:getfield        #153 <Field RemoteControlClient mRcc>
		//   66  130:iconst_0        
		//   67  131:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
					mAudioManager.unregisterRemoteControlClient(mRcc);
		//   68  134:aload_0         
		//   69  135:getfield        #124 <Field AudioManager mAudioManager>
		//   70  138:aload_0         
		//   71  139:getfield        #153 <Field RemoteControlClient mRcc>
		//   72  142:invokevirtual   #589 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
					mIsRccRegistered = false;
		//   73  145:aload_0         
		//   74  146:iconst_0        
		//   75  147:putfield        #99  <Field boolean mIsRccRegistered>
				}
			} else
		//*  76  150:goto            208
			{
				if(mIsMbrRegistered)
		//*  77  153:aload_0         
		//*  78  154:getfield        #97  <Field boolean mIsMbrRegistered>
		//*  79  157:ifeq            177
				{
					unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   80  160:aload_0         
		//   81  161:aload_0         
		//   82  162:getfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
		//   83  165:aload_0         
		//   84  166:getfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
		//   85  169:invokevirtual   #582 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
					mIsMbrRegistered = false;
		//   86  172:aload_0         
		//   87  173:iconst_0        
		//   88  174:putfield        #97  <Field boolean mIsMbrRegistered>
				}
				if(mIsRccRegistered)
		//*  89  177:aload_0         
		//*  90  178:getfield        #99  <Field boolean mIsRccRegistered>
		//*  91  181:ifeq            208
				{
					mRcc.setPlaybackState(0);
		//   92  184:aload_0         
		//   93  185:getfield        #153 <Field RemoteControlClient mRcc>
		//   94  188:iconst_0        
		//   95  189:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
					mAudioManager.unregisterRemoteControlClient(mRcc);
		//   96  192:aload_0         
		//   97  193:getfield        #124 <Field AudioManager mAudioManager>
		//   98  196:aload_0         
		//   99  197:getfield        #153 <Field RemoteControlClient mRcc>
		//  100  200:invokevirtual   #589 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
					mIsRccRegistered = false;
		//  101  203:aload_0         
		//  102  204:iconst_0        
		//  103  205:putfield        #99  <Field boolean mIsRccRegistered>
				}
			}
			return false;
		//  104  208:iconst_0        
		//  105  209:ireturn         
		}

		static final int RCC_PLAYSTATE_NONE = 0;
		final AudioManager mAudioManager;
		volatile Callback mCallback;
		boolean mCaptioningEnabled;
		private final Context mContext;
		final RemoteCallbackList mControllerCallbacks = new RemoteCallbackList();
		boolean mDestroyed;
		Bundle mExtras;
		int mFlags;
		private MessageHandler mHandler;
		boolean mIsActive;
		private boolean mIsMbrRegistered;
		private boolean mIsRccRegistered;
		int mLocalStream;
		final Object mLock = new Object();
		private final ComponentName mMediaButtonReceiverComponentName;
		private final PendingIntent mMediaButtonReceiverIntent;
		MediaMetadataCompat mMetadata;
		final String mPackageName;
		List mQueue;
		CharSequence mQueueTitle;
		int mRatingType;
		final RemoteControlClient mRcc;
		private android.support.v4.media.MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
		int mRepeatMode;
		PendingIntent mSessionActivity;
		int mShuffleMode;
		PlaybackStateCompat mState;
		private final MediaSessionStub mStub;
		final String mTag;
		private final Token mToken;
		private android.support.v4.media.VolumeProviderCompat.Callback mVolumeCallback;
		VolumeProviderCompat mVolumeProvider;
		int mVolumeType;

		public MediaSessionImplBase(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #84  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #4   <Class Object>
		//    4    8:dup             
		//    5    9:invokespecial   #84  <Method void Object()>
		//    6   12:putfield        #86  <Field Object mLock>
		//    7   15:aload_0         
		//    8   16:new             #88  <Class RemoteCallbackList>
		//    9   19:dup             
		//   10   20:invokespecial   #89  <Method void RemoteCallbackList()>
		//   11   23:putfield        #91  <Field RemoteCallbackList mControllerCallbacks>
			mDestroyed = false;
		//   12   26:aload_0         
		//   13   27:iconst_0        
		//   14   28:putfield        #93  <Field boolean mDestroyed>
			mIsActive = false;
		//   15   31:aload_0         
		//   16   32:iconst_0        
		//   17   33:putfield        #95  <Field boolean mIsActive>
			mIsMbrRegistered = false;
		//   18   36:aload_0         
		//   19   37:iconst_0        
		//   20   38:putfield        #97  <Field boolean mIsMbrRegistered>
			mIsRccRegistered = false;
		//   21   41:aload_0         
		//   22   42:iconst_0        
		//   23   43:putfield        #99  <Field boolean mIsRccRegistered>
			mVolumeCallback = ((android.support.v4.media.VolumeProviderCompat.Callback) (new _cls1()));
		//   24   46:aload_0         
		//   25   47:new             #11  <Class MediaSessionCompat$MediaSessionImplBase$1>
		//   26   50:dup             
		//   27   51:aload_0         
		//   28   52:invokespecial   #102 <Method void MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat$MediaSessionImplBase)>
		//   29   55:putfield        #104 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
			if(componentname != null)
		//*  30   58:aload_3         
		//*  31   59:ifnull          160
			{
				mContext = context;
		//   32   62:aload_0         
		//   33   63:aload_1         
		//   34   64:putfield        #106 <Field Context mContext>
				mPackageName = context.getPackageName();
		//   35   67:aload_0         
		//   36   68:aload_1         
		//   37   69:invokevirtual   #112 <Method String Context.getPackageName()>
		//   38   72:putfield        #114 <Field String mPackageName>
				mAudioManager = (AudioManager)context.getSystemService("audio");
		//   39   75:aload_0         
		//   40   76:aload_1         
		//   41   77:ldc1            #116 <String "audio">
		//   42   79:invokevirtual   #120 <Method Object Context.getSystemService(String)>
		//   43   82:checkcast       #122 <Class AudioManager>
		//   44   85:putfield        #124 <Field AudioManager mAudioManager>
				mTag = s;
		//   45   88:aload_0         
		//   46   89:aload_2         
		//   47   90:putfield        #126 <Field String mTag>
				mMediaButtonReceiverComponentName = componentname;
		//   48   93:aload_0         
		//   49   94:aload_3         
		//   50   95:putfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
				mMediaButtonReceiverIntent = pendingintent;
		//   51   98:aload_0         
		//   52   99:aload           4
		//   53  101:putfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
				mStub = new MediaSessionStub();
		//   54  104:aload_0         
		//   55  105:new             #16  <Class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub>
		//   56  108:dup             
		//   57  109:aload_0         
		//   58  110:invokespecial   #131 <Method void MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase)>
		//   59  113:putfield        #133 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
				mToken = new Token(((Object) (mStub)));
		//   60  116:aload_0         
		//   61  117:new             #135 <Class MediaSessionCompat$Token>
		//   62  120:dup             
		//   63  121:aload_0         
		//   64  122:getfield        #133 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
		//   65  125:invokespecial   #138 <Method void MediaSessionCompat$Token(Object)>
		//   66  128:putfield        #140 <Field MediaSessionCompat$Token mToken>
				mRatingType = 0;
		//   67  131:aload_0         
		//   68  132:iconst_0        
		//   69  133:putfield        #142 <Field int mRatingType>
				mVolumeType = 1;
		//   70  136:aload_0         
		//   71  137:iconst_1        
		//   72  138:putfield        #144 <Field int mVolumeType>
				mLocalStream = 3;
		//   73  141:aload_0         
		//   74  142:iconst_3        
		//   75  143:putfield        #146 <Field int mLocalStream>
				mRcc = new RemoteControlClient(pendingintent);
		//   76  146:aload_0         
		//   77  147:new             #148 <Class RemoteControlClient>
		//   78  150:dup             
		//   79  151:aload           4
		//   80  153:invokespecial   #151 <Method void RemoteControlClient(PendingIntent)>
		//   81  156:putfield        #153 <Field RemoteControlClient mRcc>
				return;
		//   82  159:return          
			} else
			{
				throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
		//   83  160:new             #155 <Class IllegalArgumentException>
		//   84  163:dup             
		//   85  164:ldc1            #157 <String "MediaButtonReceiver component may not be null.">
		//   86  166:invokespecial   #160 <Method void IllegalArgumentException(String)>
		//   87  169:athrow          
			}
		}
	}

	private static final class MediaSessionImplBase.Command
	{

		public final String command;
		public final Bundle extras;
		public final ResultReceiver stub;

		public MediaSessionImplBase.Command(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			command = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field String command>
			extras = bundle;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Bundle extras>
			stub = resultreceiver;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field ResultReceiver stub>
		//   11   19:return          
		}
	}

	class MediaSessionImplBase.MediaSessionStub extends IMediaSession.Stub
	{

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			postToHandler(25, ((Object) (mediadescriptioncompat)));
		//    0    0:aload_0         
		//    1    1:bipush          25
		//    2    3:aload_1         
		//    3    4:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    4    7:return          
		}

		public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			postToHandler(26, ((Object) (mediadescriptioncompat)), i);
		//    0    0:aload_0         
		//    1    1:bipush          26
		//    2    3:aload_1         
		//    3    4:iload_2         
		//    4    5:invokevirtual   #31  <Method void postToHandler(int, Object, int)>
		//    5    8:return          
		}

		public void adjustVolume(int i, int j, String s)
		{
			MediaSessionImplBase.this.adjustVolume(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #36  <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
		//    5    9:return          
		}

		public void fastForward()
			throws RemoteException
		{
			postToHandler(16);
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public Bundle getExtras()
		{
			Bundle bundle;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				bundle = mExtras;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #53  <Field Bundle MediaSessionCompat$MediaSessionImplBase.mExtras>
		//    9   17:astore_2        
			}
		//   10   18:aload_1         
		//   11   19:monitorexit     
			return bundle;
		//   12   20:aload_2         
		//   13   21:areturn         
			exception;
		//   14   22:astore_2        
			obj;
		//   15   23:aload_1         
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw exception;
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public long getFlags()
		{
			long l;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_3        
		//*   4    8:aload_3         
		//*   5    9:monitorenter    
			{
				l = mFlags;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//    9   17:i2l             
		//   10   18:lstore_1        
			}
		//   11   19:aload_3         
		//   12   20:monitorexit     
			return l;
		//   13   21:lload_1         
		//   14   22:lreturn         
			exception;
		//   15   23:astore          4
			obj;
		//   16   25:aload_3         
			JVM INSTR monitorexit ;
		//   17   26:monitorexit     
			throw exception;
		//   18   27:aload           4
		//   19   29:athrow          
		}

		public PendingIntent getLaunchPendingIntent()
		{
			PendingIntent pendingintent;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				pendingintent = mSessionActivity;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #65  <Field PendingIntent MediaSessionCompat$MediaSessionImplBase.mSessionActivity>
		//    9   17:astore_2        
			}
		//   10   18:aload_1         
		//   11   19:monitorexit     
			return pendingintent;
		//   12   20:aload_2         
		//   13   21:areturn         
			exception;
		//   14   22:astore_2        
			obj;
		//   15   23:aload_1         
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw exception;
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public MediaMetadataCompat getMetadata()
		{
			return mMetadata;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #71  <Field MediaMetadataCompat MediaSessionCompat$MediaSessionImplBase.mMetadata>
		//    3    7:areturn         
		}

		public String getPackageName()
		{
			return mPackageName;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #77  <Field String MediaSessionCompat$MediaSessionImplBase.mPackageName>
		//    3    7:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			PlaybackStateCompat playbackstatecompat;
			MediaMetadataCompat mediametadatacompat;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				playbackstatecompat = mState;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #83  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//    9   17:astore_2        
				mediametadatacompat = mMetadata;
		//   10   18:aload_0         
		//   11   19:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   12   22:getfield        #71  <Field MediaMetadataCompat MediaSessionCompat$MediaSessionImplBase.mMetadata>
		//   13   25:astore_3        
			}
		//   14   26:aload_1         
		//   15   27:monitorexit     
			return MediaSessionCompat.getStateWithUpdatedPosition(playbackstatecompat, mediametadatacompat);
		//   16   28:aload_2         
		//   17   29:aload_3         
		//   18   30:invokestatic    #87  <Method PlaybackStateCompat MediaSessionCompat.getStateWithUpdatedPosition(PlaybackStateCompat, MediaMetadataCompat)>
		//   19   33:areturn         
			exception;
		//   20   34:astore_2        
			obj;
		//   21   35:aload_1         
			JVM INSTR monitorexit ;
		//   22   36:monitorexit     
			throw exception;
		//   23   37:aload_2         
		//   24   38:athrow          
		}

		public List getQueue()
		{
			List list;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				list = mQueue;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #93  <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//    9   17:astore_2        
			}
		//   10   18:aload_1         
		//   11   19:monitorexit     
			return list;
		//   12   20:aload_2         
		//   13   21:areturn         
			exception;
		//   14   22:astore_2        
			obj;
		//   15   23:aload_1         
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw exception;
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public CharSequence getQueueTitle()
		{
			return mQueueTitle;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #101 <Field CharSequence MediaSessionCompat$MediaSessionImplBase.mQueueTitle>
		//    3    7:areturn         
		}

		public int getRatingType()
		{
			return mRatingType;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #106 <Field int MediaSessionCompat$MediaSessionImplBase.mRatingType>
		//    3    7:ireturn         
		}

		public int getRepeatMode()
		{
			return mRepeatMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #110 <Field int MediaSessionCompat$MediaSessionImplBase.mRepeatMode>
		//    3    7:ireturn         
		}

		public int getShuffleMode()
		{
			return mShuffleMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #114 <Field int MediaSessionCompat$MediaSessionImplBase.mShuffleMode>
		//    3    7:ireturn         
		}

		public String getTag()
		{
			return mTag;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #118 <Field String MediaSessionCompat$MediaSessionImplBase.mTag>
		//    3    7:areturn         
		}

		public ParcelableVolumeInfo getVolumeAttributes()
		{
			Object obj = mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//    3    7:astore          6
			obj;
		//    4    9:aload           6
			JVM INSTR monitorenter ;
		//    5   11:monitorenter    
			int l;
			int i1;
			VolumeProviderCompat volumeprovidercompat;
			l = mVolumeType;
		//    6   12:aload_0         
		//    7   13:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   16:getfield        #123 <Field int MediaSessionCompat$MediaSessionImplBase.mVolumeType>
		//    9   19:istore          4
			i1 = mLocalStream;
		//   10   21:aload_0         
		//   11   22:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   12   25:getfield        #126 <Field int MediaSessionCompat$MediaSessionImplBase.mLocalStream>
		//   13   28:istore          5
			volumeprovidercompat = mVolumeProvider;
		//   14   30:aload_0         
		//   15   31:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   16   34:getfield        #130 <Field VolumeProviderCompat MediaSessionCompat$MediaSessionImplBase.mVolumeProvider>
		//   17   37:astore          7
			if(l != 2)
				break MISSING_BLOCK_LABEL_66;
		//   18   39:iload           4
		//   19   41:iconst_2        
		//   20   42:icmpne          66
			int i;
			int j;
			int k;
			j = volumeprovidercompat.getVolumeControl();
		//   21   45:aload           7
		//   22   47:invokevirtual   #135 <Method int VolumeProviderCompat.getVolumeControl()>
		//   23   50:istore_2        
			i = volumeprovidercompat.getMaxVolume();
		//   24   51:aload           7
		//   25   53:invokevirtual   #138 <Method int VolumeProviderCompat.getMaxVolume()>
		//   26   56:istore_1        
			k = volumeprovidercompat.getCurrentVolume();
		//   27   57:aload           7
		//   28   59:invokevirtual   #141 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   29   62:istore_3        
			break MISSING_BLOCK_LABEL_94;
		//   30   63:goto            94
			i = mAudioManager.getStreamMaxVolume(i1);
		//   31   66:aload_0         
		//   32   67:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   33   70:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   34   73:iload           5
		//   35   75:invokevirtual   #151 <Method int AudioManager.getStreamMaxVolume(int)>
		//   36   78:istore_1        
			k = mAudioManager.getStreamVolume(i1);
		//   37   79:aload_0         
		//   38   80:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   39   83:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   40   86:iload           5
		//   41   88:invokevirtual   #154 <Method int AudioManager.getStreamVolume(int)>
		//   42   91:istore_3        
			j = 2;
		//   43   92:iconst_2        
		//   44   93:istore_2        
			obj;
		//   45   94:aload           6
			JVM INSTR monitorexit ;
		//   46   96:monitorexit     
			return new ParcelableVolumeInfo(l, i1, j, i, k);
		//   47   97:new             #156 <Class ParcelableVolumeInfo>
		//   48  100:dup             
		//   49  101:iload           4
		//   50  103:iload           5
		//   51  105:iload_2         
		//   52  106:iload_1         
		//   53  107:iload_3         
		//   54  108:invokespecial   #159 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   55  111:areturn         
			Exception exception;
			exception;
		//   56  112:astore          7
			obj;
		//   57  114:aload           6
			JVM INSTR monitorexit ;
		//   58  116:monitorexit     
			throw exception;
		//   59  117:aload           7
		//   60  119:athrow          
		}

		public boolean isCaptioningEnabled()
		{
			return mCaptioningEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #165 <Field boolean MediaSessionCompat$MediaSessionImplBase.mCaptioningEnabled>
		//    3    7:ireturn         
		}

		public boolean isShuffleModeEnabledRemoved()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isTransportControlEnabled()
		{
			return (mFlags & 2) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//    3    7:iconst_2        
		//    4    8:iand            
		//    5    9:ifeq            14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public void next()
			throws RemoteException
		{
			postToHandler(14);
		//    0    0:aload_0         
		//    1    1:bipush          14
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void pause()
			throws RemoteException
		{
			postToHandler(12);
		//    0    0:aload_0         
		//    1    1:bipush          12
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void play()
			throws RemoteException
		{
			postToHandler(7);
		//    0    0:aload_0         
		//    1    1:bipush          7
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void playFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(8, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public void playFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(9, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          9
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public void playFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(10, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		void postToHandler(int i)
		{
			MediaSessionImplBase.this.postToHandler(i, 0, 0, ((Object) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:aconst_null     
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, int j)
		{
			MediaSessionImplBase.this.postToHandler(i, j, 0, ((Object) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:iconst_0        
		//    5    7:aconst_null     
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, Object obj)
		{
			MediaSessionImplBase.this.postToHandler(i, 0, 0, obj, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:aload_2         
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, Object obj, int j)
		{
			MediaSessionImplBase.this.postToHandler(i, j, 0, obj, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_3         
		//    4    6:iconst_0        
		//    5    7:aload_2         
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, Object obj, Bundle bundle)
		{
			MediaSessionImplBase.this.postToHandler(i, 0, 0, obj, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		public void prepare()
			throws RemoteException
		{
			postToHandler(3);
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    5:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(4, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:aload_1         
		//    3    3:aload_2         
		//    4    4:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    7:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(5, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:iconst_5        
		//    2    2:aload_1         
		//    3    3:aload_2         
		//    4    4:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    7:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(6, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          6
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public void previous()
			throws RemoteException
		{
			postToHandler(15);
		//    0    0:aload_0         
		//    1    1:bipush          15
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void rate(RatingCompat ratingcompat)
			throws RemoteException
		{
			postToHandler(19, ((Object) (ratingcompat)));
		//    0    0:aload_0         
		//    1    1:bipush          19
		//    2    3:aload_1         
		//    3    4:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    4    7:return          
		}

		public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
			throws RemoteException
		{
			postToHandler(31, ((Object) (ratingcompat)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          31
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #197 <Field boolean MediaSessionCompat$MediaSessionImplBase.mDestroyed>
		//*   3    7:ifeq            17
			{
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//    4   10:aload_1         
		//    5   11:invokeinterface #202 <Method void IMediaControllerCallback.onSessionDestroyed()>
					return;
		//    6   16:return          
				}
		//*   7   17:new             #204 <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
		//*   8   20:dup             
		//*   9   21:ldc1            #206 <String "android.media.session.MediaController">
		//*  10   23:invokestatic    #209 <Method int getCallingPid()>
		//*  11   26:invokestatic    #212 <Method int getCallingUid()>
		//*  12   29:invokespecial   #215 <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(String, int, int)>
		//*  13   32:astore_2        
		//*  14   33:aload_0         
		//*  15   34:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  16   37:getfield        #219 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//*  17   40:aload_1         
		//*  18   41:aload_2         
		//*  19   42:invokevirtual   #225 <Method boolean RemoteCallbackList.register(android.os.IInterface, Object)>
		//*  20   45:pop             
		//*  21   46:return          
				// Misplaced declaration of an exception variable
				catch(IMediaControllerCallback imediacontrollercallback)
		//*  22   47:astore_1        
				{
					return;
		//   23   48:return          
				}
			} else
			{
				android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo = new android.support.v4.media.MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", getCallingPid(), getCallingUid());
				mControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)), ((Object) (remoteuserinfo)));
				return;
			}
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			postToHandler(27, ((Object) (mediadescriptioncompat)));
		//    0    0:aload_0         
		//    1    1:bipush          27
		//    2    3:aload_1         
		//    3    4:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    4    7:return          
		}

		public void removeQueueItemAt(int i)
		{
			postToHandler(28, i);
		//    0    0:aload_0         
		//    1    1:bipush          28
		//    2    3:iload_1         
		//    3    4:invokevirtual   #229 <Method void postToHandler(int, int)>
		//    4    7:return          
		}

		public void rewind()
			throws RemoteException
		{
			postToHandler(17);
		//    0    0:aload_0         
		//    1    1:bipush          17
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void seekTo(long l)
			throws RemoteException
		{
			postToHandler(18, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:bipush          18
		//    2    3:lload_1         
		//    3    4:invokestatic    #238 <Method Long Long.valueOf(long)>
		//    4    7:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    5   10:return          
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiverWrapper resultreceiverwrapper)
		{
			postToHandler(1, ((Object) (new MediaSessionImplBase.Command(s, bundle, resultreceiverwrapper.mResultReceiver))));
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:new             #242 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//    3    5:dup             
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:getfield        #248 <Field ResultReceiver MediaSessionCompat$ResultReceiverWrapper.mResultReceiver>
		//    8   12:invokespecial   #251 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, ResultReceiver)>
		//    9   15:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//   10   18:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(20, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public boolean sendMediaButton(KeyEvent keyevent)
		{
			int i = mFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//    3    7:istore_2        
			boolean flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_3        
			if((i & 1) == 0)
		//*   6   10:iload_2         
		//*   7   11:iconst_1        
		//*   8   12:iand            
		//*   9   13:ifeq            19
		//*  10   16:goto            21
				flag = false;
		//   11   19:iconst_0        
		//   12   20:istore_3        
			if(flag)
		//*  13   21:iload_3         
		//*  14   22:ifeq            32
				postToHandler(21, ((Object) (keyevent)));
		//   15   25:aload_0         
		//   16   26:bipush          21
		//   17   28:aload_1         
		//   18   29:invokevirtual   #26  <Method void postToHandler(int, Object)>
			return flag;
		//   19   32:iload_3         
		//   20   33:ireturn         
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			postToHandler(29, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:bipush          29
		//    2    3:iload_1         
		//    3    4:invokestatic    #261 <Method Boolean Boolean.valueOf(boolean)>
		//    4    7:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    5   10:return          
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			postToHandler(23, i);
		//    0    0:aload_0         
		//    1    1:bipush          23
		//    2    3:iload_1         
		//    3    4:invokevirtual   #229 <Method void postToHandler(int, int)>
		//    4    7:return          
		}

		public void setShuffleMode(int i)
			throws RemoteException
		{
			postToHandler(30, i);
		//    0    0:aload_0         
		//    1    1:bipush          30
		//    2    3:iload_1         
		//    3    4:invokevirtual   #229 <Method void postToHandler(int, int)>
		//    4    7:return          
		}

		public void setShuffleModeEnabledRemoved(boolean flag)
			throws RemoteException
		{
		//    0    0:return          
		}

		public void setVolumeTo(int i, int j, String s)
		{
			MediaSessionImplBase.this.setVolumeTo(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #267 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		//    5    9:return          
		}

		public void skipToQueueItem(long l)
		{
			postToHandler(11, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:bipush          11
		//    2    3:lload_1         
		//    3    4:invokestatic    #238 <Method Long Long.valueOf(long)>
		//    4    7:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    5   10:return          
		}

		public void stop()
			throws RemoteException
		{
			postToHandler(13);
		//    0    0:aload_0         
		//    1    1:bipush          13
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			mControllerCallbacks.unregister(((android.os.IInterface) (imediacontrollercallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #219 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #274 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//    5   11:pop             
		//    6   12:return          
		}

		final MediaSessionImplBase this$0;

		MediaSessionImplBase.MediaSessionStub()
		{
			this$0 = MediaSessionImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void IMediaSession$Stub()>
		//    5    9:return          
		}
	}

	class MediaSessionImplBase.MessageHandler extends Handler
	{

		private void onMediaButtonEvent(KeyEvent keyevent, Callback callback)
		{
			int i;
			long l;
			if(keyevent == null)
				break MISSING_BLOCK_LABEL_236;
		//    0    0:aload_1         
		//    1    1:ifnull          236
			if(keyevent.getAction() != 0)
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #93  <Method int KeyEvent.getAction()>
		//*   4    8:ifeq            12
				return;
		//    5   11:return          
			if(mState == null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   8   16:getfield        #97  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//*   9   19:ifnonnull       28
				l = 0L;
		//   10   22:lconst_0        
		//   11   23:lstore          4
			else
		//*  12   25:goto            40
				l = mState.getActions();
		//   13   28:aload_0         
		//   14   29:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   15   32:getfield        #97  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//   16   35:invokevirtual   #103 <Method long PlaybackStateCompat.getActions()>
		//   17   38:lstore          4
			i = keyevent.getKeyCode();
		//   18   40:aload_1         
		//   19   41:invokevirtual   #106 <Method int KeyEvent.getKeyCode()>
		//   20   44:istore_3        
			if(i == 79) goto _L2; else goto _L1
		//   21   45:iload_3         
		//   22   46:bipush          79
		//   23   48:icmpeq          227
_L1:
			i;
		//   24   51:iload_3         
			JVM INSTR tableswitch 85 90: default 92
		//		               85 227
		//		               86 213
		//		               87 197
		//		               88 181
		//		               89 165
		//		               90 149;
		//   25   52:tableswitch     85 90: default 92
		//		               85 227
		//		               86 213
		//		               87 197
		//		               88 181
		//		               89 165
		//		               90 149
			   goto _L3 _L2 _L4 _L5 _L6 _L7 _L8
_L3:
			switch(i)
		//*  26   92:iload_3         
			{
		//*  27   93:tableswitch     126 127: default 116
		//		               126 133
		//		               127 117
			default:
				return;
		//   28  116:return          

			case 127: // '\177'
				if((l & 2L) != 0L)
		//*  29  117:lload           4
		//*  30  119:ldc2w           #107 <Long 2L>
		//*  31  122:land            
		//*  32  123:lconst_0        
		//*  33  124:lcmp            
		//*  34  125:ifeq            235
				{
					callback.onPause();
		//   35  128:aload_2         
		//   36  129:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
					return;
		//   37  132:return          
				}
				break;

			case 126: // '~'
				if((l & 4L) != 0L)
		//*  38  133:lload           4
		//*  39  135:ldc2w           #115 <Long 4L>
		//*  40  138:land            
		//*  41  139:lconst_0        
		//*  42  140:lcmp            
		//*  43  141:ifeq            235
				{
					callback.onPlay();
		//   44  144:aload_2         
		//   45  145:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
					return;
		//   46  148:return          
				}
				break;
			}
			break; /* Loop/switch isn't completed */
_L8:
			if((l & 64L) != 0L)
		//*  47  149:lload           4
		//*  48  151:ldc2w           #120 <Long 64L>
		//*  49  154:land            
		//*  50  155:lconst_0        
		//*  51  156:lcmp            
		//*  52  157:ifeq            235
			{
				callback.onFastForward();
		//   53  160:aload_2         
		//   54  161:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
		//   55  164:return          
			}
			break; /* Loop/switch isn't completed */
_L7:
			if((l & 8L) != 0L)
		//*  56  165:lload           4
		//*  57  167:ldc2w           #125 <Long 8L>
		//*  58  170:land            
		//*  59  171:lconst_0        
		//*  60  172:lcmp            
		//*  61  173:ifeq            235
			{
				callback.onRewind();
		//   62  176:aload_2         
		//   63  177:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
		//   64  180:return          
			}
			break; /* Loop/switch isn't completed */
_L6:
			if((l & 16L) != 0L)
		//*  65  181:lload           4
		//*  66  183:ldc2w           #130 <Long 16L>
		//*  67  186:land            
		//*  68  187:lconst_0        
		//*  69  188:lcmp            
		//*  70  189:ifeq            235
			{
				callback.onSkipToPrevious();
		//   71  192:aload_2         
		//   72  193:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
		//   73  196:return          
			}
			break; /* Loop/switch isn't completed */
_L5:
			if((l & 32L) != 0L)
		//*  74  197:lload           4
		//*  75  199:ldc2w           #135 <Long 32L>
		//*  76  202:land            
		//*  77  203:lconst_0        
		//*  78  204:lcmp            
		//*  79  205:ifeq            235
			{
				callback.onSkipToNext();
		//   80  208:aload_2         
		//   81  209:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
		//   82  212:return          
			}
			break; /* Loop/switch isn't completed */
_L4:
			if((l & 1L) != 0L)
		//*  83  213:lload           4
		//*  84  215:lconst_1        
		//*  85  216:land            
		//*  86  217:lconst_0        
		//*  87  218:lcmp            
		//*  88  219:ifeq            235
			{
				callback.onStop();
		//   89  222:aload_2         
		//   90  223:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
				return;
		//   91  226:return          
			}
			break; /* Loop/switch isn't completed */
_L2:
			Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
		//   92  227:ldc1            #144 <String "MediaSessionCompat">
		//   93  229:ldc1            #146 <String "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already">
		//   94  231:invokestatic    #152 <Method int Log.w(String, String)>
		//   95  234:pop             
			return;
		//   96  235:return          
		//   97  236:return          
		}

		public void handleMessage(Message message)
		{
			Callback callback;
			Object obj;
			callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #158 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
		//    3    7:astore_2        
			if(callback == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			obj = ((Object) (message.getData()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #164 <Method Bundle Message.getData()>
		//    9   17:astore_3        
			MediaSessionCompat.ensureClassLoader(((Bundle) (obj)));
		//   10   18:aload_3         
		//   11   19:invokestatic    #168 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			setCurrentControllerInfo(new android.support.v4.media.MediaSessionManager.RemoteUserInfo(((Bundle) (obj)).getString("data_calling_pkg"), ((Bundle) (obj)).getInt("data_calling_pid"), ((Bundle) (obj)).getInt("data_calling_uid")));
		//   12   22:aload_0         
		//   13   23:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   14   26:new             #170 <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
		//   15   29:dup             
		//   16   30:aload_3         
		//   17   31:ldc1            #172 <String "data_calling_pkg">
		//   18   33:invokevirtual   #178 <Method String Bundle.getString(String)>
		//   19   36:aload_3         
		//   20   37:ldc1            #180 <String "data_calling_pid">
		//   21   39:invokevirtual   #184 <Method int Bundle.getInt(String)>
		//   22   42:aload_3         
		//   23   43:ldc1            #186 <String "data_calling_uid">
		//   24   45:invokevirtual   #184 <Method int Bundle.getInt(String)>
		//   25   48:invokespecial   #189 <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(String, int, int)>
		//   26   51:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
			obj = ((Object) (((Bundle) (obj)).getBundle("data_extras")));
		//   27   54:aload_3         
		//   28   55:ldc1            #195 <String "data_extras">
		//   29   57:invokevirtual   #199 <Method Bundle Bundle.getBundle(String)>
		//   30   60:astore_3        
			MediaSessionCompat.ensureClassLoader(((Bundle) (obj)));
		//   31   61:aload_3         
		//   32   62:invokestatic    #168 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			message.what;
		//   33   65:aload_1         
		//   34   66:getfield        #202 <Field int Message.what>
			JVM INSTR tableswitch 1 31: default 710
		//		               1 666
		//		               2 651
		//		               3 644
		//		               4 629
		//		               5 614
		//		               6 599
		//		               7 592
		//		               8 577
		//		               9 562
		//		               10 547
		//		               11 530
		//		               12 523
		//		               13 516
		//		               14 509
		//		               15 502
		//		               16 495
		//		               17 488
		//		               18 471
		//		               19 457
		//		               20 442
		//		               21 397
		//		               22 382
		//		               23 371
		//		               24 710
		//		               25 357
		//		               26 339
		//		               27 325
		//		               28 251
		//		               29 234
		//		               30 223
		//		               31 208;
		//   35   69:tableswitch     1 31: default 710
		//		               1 666
		//		               2 651
		//		               3 644
		//		               4 629
		//		               5 614
		//		               6 599
		//		               7 592
		//		               8 577
		//		               9 562
		//		               10 547
		//		               11 530
		//		               12 523
		//		               13 516
		//		               14 509
		//		               15 502
		//		               16 495
		//		               17 488
		//		               18 471
		//		               19 457
		//		               20 442
		//		               21 397
		//		               22 382
		//		               23 371
		//		               24 710
		//		               25 357
		//		               26 339
		//		               27 325
		//		               28 251
		//		               29 234
		//		               30 223
		//		               31 208
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L1 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L1:
			break; /* Loop/switch isn't completed */
_L31:
			callback.onSetRating((RatingCompat)message.obj, ((Bundle) (obj)));
		//   36  208:aload_2         
		//   37  209:aload_1         
		//   38  210:getfield        #206 <Field Object Message.obj>
		//   39  213:checkcast       #208 <Class RatingCompat>
		//   40  216:aload_3         
		//   41  217:invokevirtual   #212 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
			break; /* Loop/switch isn't completed */
		//   42  220:goto            690
_L30:
			callback.onSetShuffleMode(message.arg1);
		//   43  223:aload_2         
		//   44  224:aload_1         
		//   45  225:getfield        #215 <Field int Message.arg1>
		//   46  228:invokevirtual   #219 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
			break; /* Loop/switch isn't completed */
		//   47  231:goto            690
_L29:
			callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
		//   48  234:aload_2         
		//   49  235:aload_1         
		//   50  236:getfield        #206 <Field Object Message.obj>
		//   51  239:checkcast       #221 <Class Boolean>
		//   52  242:invokevirtual   #225 <Method boolean Boolean.booleanValue()>
		//   53  245:invokevirtual   #229 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
			break; /* Loop/switch isn't completed */
		//   54  248:goto            690
_L28:
			if(mQueue == null)
				break; /* Loop/switch isn't completed */
		//   55  251:aload_0         
		//   56  252:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   57  255:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   58  258:ifnull          690
			if(message.arg1 < 0 || message.arg1 >= mQueue.size()) goto _L33; else goto _L32
		//   59  261:aload_1         
		//   60  262:getfield        #215 <Field int Message.arg1>
		//   61  265:iflt            713
		//   62  268:aload_1         
		//   63  269:getfield        #215 <Field int Message.arg1>
		//   64  272:aload_0         
		//   65  273:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   66  276:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   67  279:invokeinterface #238 <Method int List.size()>
		//   68  284:icmpge          713
_L32:
			message = ((Message) ((QueueItem)mQueue.get(message.arg1)));
		//   69  287:aload_0         
		//   70  288:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   71  291:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   72  294:aload_1         
		//   73  295:getfield        #215 <Field int Message.arg1>
		//   74  298:invokeinterface #242 <Method Object List.get(int)>
		//   75  303:checkcast       #244 <Class MediaSessionCompat$QueueItem>
		//   76  306:astore_1        
		//*  77  307:goto            310
_L35:
			if(message == null)
				break; /* Loop/switch isn't completed */
		//   78  310:aload_1         
		//   79  311:ifnull          690
			callback.onRemoveQueueItem(((QueueItem) (message)).getDescription());
		//   80  314:aload_2         
		//   81  315:aload_1         
		//   82  316:invokevirtual   #248 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//   83  319:invokevirtual   #252 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			break; /* Loop/switch isn't completed */
		//   84  322:goto            690
_L27:
			callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
		//   85  325:aload_2         
		//   86  326:aload_1         
		//   87  327:getfield        #206 <Field Object Message.obj>
		//   88  330:checkcast       #254 <Class MediaDescriptionCompat>
		//   89  333:invokevirtual   #252 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			break; /* Loop/switch isn't completed */
		//   90  336:goto            690
_L26:
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
		//   91  339:aload_2         
		//   92  340:aload_1         
		//   93  341:getfield        #206 <Field Object Message.obj>
		//   94  344:checkcast       #254 <Class MediaDescriptionCompat>
		//   95  347:aload_1         
		//   96  348:getfield        #215 <Field int Message.arg1>
		//   97  351:invokevirtual   #258 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
			break; /* Loop/switch isn't completed */
		//   98  354:goto            690
_L25:
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
		//   99  357:aload_2         
		//  100  358:aload_1         
		//  101  359:getfield        #206 <Field Object Message.obj>
		//  102  362:checkcast       #254 <Class MediaDescriptionCompat>
		//  103  365:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
			break; /* Loop/switch isn't completed */
		//  104  368:goto            690
_L24:
			callback.onSetRepeatMode(message.arg1);
		//  105  371:aload_2         
		//  106  372:aload_1         
		//  107  373:getfield        #215 <Field int Message.arg1>
		//  108  376:invokevirtual   #263 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
			break; /* Loop/switch isn't completed */
		//  109  379:goto            690
_L23:
			setVolumeTo(message.arg1, 0);
		//  110  382:aload_0         
		//  111  383:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  112  386:aload_1         
		//  113  387:getfield        #215 <Field int Message.arg1>
		//  114  390:iconst_0        
		//  115  391:invokevirtual   #267 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
			break; /* Loop/switch isn't completed */
		//  116  394:goto            690
_L22:
			message = ((Message) ((KeyEvent)message.obj));
		//  117  397:aload_1         
		//  118  398:getfield        #206 <Field Object Message.obj>
		//  119  401:checkcast       #89  <Class KeyEvent>
		//  120  404:astore_1        
			obj = ((Object) (new Intent("android.intent.action.MEDIA_BUTTON")));
		//  121  405:new             #269 <Class Intent>
		//  122  408:dup             
		//  123  409:ldc2            #271 <String "android.intent.action.MEDIA_BUTTON">
		//  124  412:invokespecial   #274 <Method void Intent(String)>
		//  125  415:astore_3        
			((Intent) (obj)).putExtra("android.intent.extra.KEY_EVENT", ((Parcelable) (message)));
		//  126  416:aload_3         
		//  127  417:ldc2            #276 <String "android.intent.extra.KEY_EVENT">
		//  128  420:aload_1         
		//  129  421:invokevirtual   #280 <Method Intent Intent.putExtra(String, Parcelable)>
		//  130  424:pop             
			if(!callback.onMediaButtonEvent(((Intent) (obj))))
		//* 131  425:aload_2         
		//* 132  426:aload_3         
		//* 133  427:invokevirtual   #283 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//* 134  430:ifne            690
				onMediaButtonEvent(((KeyEvent) (message)), callback);
		//  135  433:aload_0         
		//  136  434:aload_1         
		//  137  435:aload_2         
		//  138  436:invokespecial   #285 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
			break; /* Loop/switch isn't completed */
		//  139  439:goto            690
_L21:
			callback.onCustomAction((String)message.obj, ((Bundle) (obj)));
		//  140  442:aload_2         
		//  141  443:aload_1         
		//  142  444:getfield        #206 <Field Object Message.obj>
		//  143  447:checkcast       #287 <Class String>
		//  144  450:aload_3         
		//  145  451:invokevirtual   #291 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  146  454:goto            690
_L20:
			callback.onSetRating((RatingCompat)message.obj);
		//  147  457:aload_2         
		//  148  458:aload_1         
		//  149  459:getfield        #206 <Field Object Message.obj>
		//  150  462:checkcast       #208 <Class RatingCompat>
		//  151  465:invokevirtual   #294 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
			break; /* Loop/switch isn't completed */
		//  152  468:goto            690
_L19:
			callback.onSeekTo(((Long)message.obj).longValue());
		//  153  471:aload_2         
		//  154  472:aload_1         
		//  155  473:getfield        #206 <Field Object Message.obj>
		//  156  476:checkcast       #296 <Class Long>
		//  157  479:invokevirtual   #299 <Method long Long.longValue()>
		//  158  482:invokevirtual   #303 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
			break; /* Loop/switch isn't completed */
		//  159  485:goto            690
_L18:
			callback.onRewind();
		//  160  488:aload_2         
		//  161  489:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
			break; /* Loop/switch isn't completed */
		//  162  492:goto            690
_L17:
			callback.onFastForward();
		//  163  495:aload_2         
		//  164  496:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
			break; /* Loop/switch isn't completed */
		//  165  499:goto            690
_L16:
			callback.onSkipToPrevious();
		//  166  502:aload_2         
		//  167  503:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			break; /* Loop/switch isn't completed */
		//  168  506:goto            690
_L15:
			callback.onSkipToNext();
		//  169  509:aload_2         
		//  170  510:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			break; /* Loop/switch isn't completed */
		//  171  513:goto            690
_L14:
			callback.onStop();
		//  172  516:aload_2         
		//  173  517:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
			break; /* Loop/switch isn't completed */
		//  174  520:goto            690
_L13:
			callback.onPause();
		//  175  523:aload_2         
		//  176  524:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
			break; /* Loop/switch isn't completed */
		//  177  527:goto            690
_L12:
			callback.onSkipToQueueItem(((Long)message.obj).longValue());
		//  178  530:aload_2         
		//  179  531:aload_1         
		//  180  532:getfield        #206 <Field Object Message.obj>
		//  181  535:checkcast       #296 <Class Long>
		//  182  538:invokevirtual   #299 <Method long Long.longValue()>
		//  183  541:invokevirtual   #306 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
			break; /* Loop/switch isn't completed */
		//  184  544:goto            690
_L11:
			callback.onPlayFromUri((Uri)message.obj, ((Bundle) (obj)));
		//  185  547:aload_2         
		//  186  548:aload_1         
		//  187  549:getfield        #206 <Field Object Message.obj>
		//  188  552:checkcast       #308 <Class Uri>
		//  189  555:aload_3         
		//  190  556:invokevirtual   #312 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
			break; /* Loop/switch isn't completed */
		//  191  559:goto            690
_L10:
			callback.onPlayFromSearch((String)message.obj, ((Bundle) (obj)));
		//  192  562:aload_2         
		//  193  563:aload_1         
		//  194  564:getfield        #206 <Field Object Message.obj>
		//  195  567:checkcast       #287 <Class String>
		//  196  570:aload_3         
		//  197  571:invokevirtual   #315 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  198  574:goto            690
_L9:
			callback.onPlayFromMediaId((String)message.obj, ((Bundle) (obj)));
		//  199  577:aload_2         
		//  200  578:aload_1         
		//  201  579:getfield        #206 <Field Object Message.obj>
		//  202  582:checkcast       #287 <Class String>
		//  203  585:aload_3         
		//  204  586:invokevirtual   #318 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  205  589:goto            690
_L8:
			callback.onPlay();
		//  206  592:aload_2         
		//  207  593:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
			break; /* Loop/switch isn't completed */
		//  208  596:goto            690
_L7:
			callback.onPrepareFromUri((Uri)message.obj, ((Bundle) (obj)));
		//  209  599:aload_2         
		//  210  600:aload_1         
		//  211  601:getfield        #206 <Field Object Message.obj>
		//  212  604:checkcast       #308 <Class Uri>
		//  213  607:aload_3         
		//  214  608:invokevirtual   #321 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
			break; /* Loop/switch isn't completed */
		//  215  611:goto            690
_L6:
			callback.onPrepareFromSearch((String)message.obj, ((Bundle) (obj)));
		//  216  614:aload_2         
		//  217  615:aload_1         
		//  218  616:getfield        #206 <Field Object Message.obj>
		//  219  619:checkcast       #287 <Class String>
		//  220  622:aload_3         
		//  221  623:invokevirtual   #324 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  222  626:goto            690
_L5:
			callback.onPrepareFromMediaId((String)message.obj, ((Bundle) (obj)));
		//  223  629:aload_2         
		//  224  630:aload_1         
		//  225  631:getfield        #206 <Field Object Message.obj>
		//  226  634:checkcast       #287 <Class String>
		//  227  637:aload_3         
		//  228  638:invokevirtual   #327 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  229  641:goto            690
_L4:
			callback.onPrepare();
		//  230  644:aload_2         
		//  231  645:invokevirtual   #330 <Method void MediaSessionCompat$Callback.onPrepare()>
			break; /* Loop/switch isn't completed */
		//  232  648:goto            690
_L3:
			adjustVolume(message.arg1, 0);
		//  233  651:aload_0         
		//  234  652:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  235  655:aload_1         
		//  236  656:getfield        #215 <Field int Message.arg1>
		//  237  659:iconst_0        
		//  238  660:invokevirtual   #333 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
			break; /* Loop/switch isn't completed */
		//  239  663:goto            690
_L2:
			message = ((Message) ((MediaSessionImplBase.Command)message.obj));
		//  240  666:aload_1         
		//  241  667:getfield        #206 <Field Object Message.obj>
		//  242  670:checkcast       #335 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//  243  673:astore_1        
			callback.onCommand(((MediaSessionImplBase.Command) (message)).command, ((MediaSessionImplBase.Command) (message)).extras, ((MediaSessionImplBase.Command) (message)).stub);
		//  244  674:aload_2         
		//  245  675:aload_1         
		//  246  676:getfield        #339 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
		//  247  679:aload_1         
		//  248  680:getfield        #343 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
		//  249  683:aload_1         
		//  250  684:getfield        #347 <Field ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
		//  251  687:invokevirtual   #351 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
			setCurrentControllerInfo(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (null)));
		//  252  690:aload_0         
		//  253  691:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  254  694:aconst_null     
		//  255  695:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
			return;
		//  256  698:return          
			message;
		//  257  699:astore_1        
			setCurrentControllerInfo(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (null)));
		//  258  700:aload_0         
		//  259  701:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  260  704:aconst_null     
		//  261  705:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
			throw message;
		//  262  708:aload_1         
		//  263  709:athrow          
		//* 264  710:goto            690
_L33:
			message = null;
		//  265  713:aconst_null     
		//  266  714:astore_1        
			if(true) goto _L35; else goto _L34
		//  267  715:goto            310
_L34:
		}

		private static final int KEYCODE_MEDIA_PAUSE = 127;
		private static final int KEYCODE_MEDIA_PLAY = 126;
		private static final int MSG_ADD_QUEUE_ITEM = 25;
		private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
		private static final int MSG_ADJUST_VOLUME = 2;
		private static final int MSG_COMMAND = 1;
		private static final int MSG_CUSTOM_ACTION = 20;
		private static final int MSG_FAST_FORWARD = 16;
		private static final int MSG_MEDIA_BUTTON = 21;
		private static final int MSG_NEXT = 14;
		private static final int MSG_PAUSE = 12;
		private static final int MSG_PLAY = 7;
		private static final int MSG_PLAY_MEDIA_ID = 8;
		private static final int MSG_PLAY_SEARCH = 9;
		private static final int MSG_PLAY_URI = 10;
		private static final int MSG_PREPARE = 3;
		private static final int MSG_PREPARE_MEDIA_ID = 4;
		private static final int MSG_PREPARE_SEARCH = 5;
		private static final int MSG_PREPARE_URI = 6;
		private static final int MSG_PREVIOUS = 15;
		private static final int MSG_RATE = 19;
		private static final int MSG_RATE_EXTRA = 31;
		private static final int MSG_REMOVE_QUEUE_ITEM = 27;
		private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
		private static final int MSG_REWIND = 17;
		private static final int MSG_SEEK_TO = 18;
		private static final int MSG_SET_CAPTIONING_ENABLED = 29;
		private static final int MSG_SET_REPEAT_MODE = 23;
		private static final int MSG_SET_SHUFFLE_MODE = 30;
		private static final int MSG_SET_VOLUME = 22;
		private static final int MSG_SKIP_TO_ITEM = 11;
		private static final int MSG_STOP = 13;
		final MediaSessionImplBase this$0;

		public MediaSessionImplBase.MessageHandler(Looper looper)
		{
			this$0 = MediaSessionImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #84  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}

	public static interface OnActiveChangeListener
	{

		public abstract void onActiveChanged();
	}

	public static final class QueueItem
		implements Parcelable
	{

		public static QueueItem fromQueueItem(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          35
		//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            35
				return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(MediaSessionCompatApi21.QueueItem.getDescription(obj)), MediaSessionCompatApi21.QueueItem.getQueueId(obj));
		//    6   15:new             #2   <Class MediaSessionCompat$QueueItem>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:aload_0         
		//   10   21:invokestatic    #82  <Method Object MediaSessionCompatApi21$QueueItem.getDescription(Object)>
		//   11   24:invokestatic    #86  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
		//   12   27:aload_0         
		//   13   28:invokestatic    #90  <Method long MediaSessionCompatApi21$QueueItem.getQueueId(Object)>
		//   14   31:invokespecial   #56  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
		//   15   34:areturn         
			else
				return null;
		//   16   35:aconst_null     
		//   17   36:areturn         
		}

		public static List fromQueueItemList(List list)
		{
			if(list != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          60
		//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            60
			{
				ArrayList arraylist = new ArrayList();
		//    6   15:new             #94  <Class ArrayList>
		//    7   18:dup             
		//    8   19:invokespecial   #95  <Method void ArrayList()>
		//    9   22:astore_1        
				for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (fromQueueItem(((Iterator) (list)).next())))));
		//   10   23:aload_0         
		//   11   24:invokeinterface #101 <Method Iterator List.iterator()>
		//   12   29:astore_0        
		//   13   30:aload_0         
		//   14   31:invokeinterface #107 <Method boolean Iterator.hasNext()>
		//   15   36:ifeq            58
		//   16   39:aload_1         
		//   17   40:aload_0         
		//   18   41:invokeinterface #111 <Method Object Iterator.next()>
		//   19   46:invokestatic    #113 <Method MediaSessionCompat$QueueItem fromQueueItem(Object)>
		//   20   49:invokeinterface #117 <Method boolean List.add(Object)>
		//   21   54:pop             
		//*  22   55:goto            30
				return ((List) (arraylist));
		//   23   58:aload_1         
		//   24   59:areturn         
			} else
			{
				return null;
		//   25   60:aconst_null     
		//   26   61:areturn         
			}
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public MediaDescriptionCompat getDescription()
		{
			return mDescription;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field MediaDescriptionCompat mDescription>
		//    2    4:areturn         
		}

		public long getQueueId()
		{
			return mId;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field long mId>
		//    2    4:lreturn         
		}

		public Object getQueueItem()
		{
			if(mItem == null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field Object mItem>
		//*   2    4:ifnonnull       41
		//*   3    7:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
		//*   4   10:bipush          21
		//*   5   12:icmpge          18
		//*   6   15:goto            41
			{
				mItem = MediaSessionCompatApi21.QueueItem.createItem(mDescription.getMediaDescription(), mId);
		//    7   18:aload_0         
		//    8   19:aload_0         
		//    9   20:getfield        #44  <Field MediaDescriptionCompat mDescription>
		//   10   23:invokevirtual   #126 <Method Object MediaDescriptionCompat.getMediaDescription()>
		//   11   26:aload_0         
		//   12   27:getfield        #52  <Field long mId>
		//   13   30:invokestatic    #130 <Method Object MediaSessionCompatApi21$QueueItem.createItem(Object, long)>
		//   14   33:putfield        #60  <Field Object mItem>
				return mItem;
		//   15   36:aload_0         
		//   16   37:getfield        #60  <Field Object mItem>
		//   17   40:areturn         
			} else
			{
				return mItem;
		//   18   41:aload_0         
		//   19   42:getfield        #60  <Field Object mItem>
		//   20   45:areturn         
			}
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #134 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #135 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("MediaSession.QueueItem {Description=");
		//    4    8:aload_1         
		//    5    9:ldc1            #137 <String "MediaSession.QueueItem {Description=">
		//    6   11:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (mDescription)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #44  <Field MediaDescriptionCompat mDescription>
		//   11   20:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			stringbuilder.append(", Id=");
		//   13   24:aload_1         
		//   14   25:ldc1            #146 <String ", Id=">
		//   15   27:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mId);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #52  <Field long mId>
		//   20   36:invokevirtual   #149 <Method StringBuilder StringBuilder.append(long)>
		//   21   39:pop             
			stringbuilder.append(" }");
		//   22   40:aload_1         
		//   23   41:ldc1            #151 <String " }">
		//   24   43:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			return stringbuilder.toString();
		//   26   47:aload_1         
		//   27   48:invokevirtual   #153 <Method String StringBuilder.toString()>
		//   28   51:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			mDescription.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field MediaDescriptionCompat mDescription>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #157 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
			parcel.writeLong(mId);
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #52  <Field long mId>
		//    8   14:invokevirtual   #161 <Method void Parcel.writeLong(long)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public QueueItem createFromParcel(Parcel parcel)
			{
				return new QueueItem(parcel);
			//    0    0:new             #9   <Class MediaSessionCompat$QueueItem>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MediaSessionCompat$QueueItem(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method MediaSessionCompat$QueueItem createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public QueueItem[] newArray(int i)
			{
				return new QueueItem[i];
			//    0    0:iload_1         
			//    1    1:anewarray       QueueItem[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method MediaSessionCompat$QueueItem[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public static final int UNKNOWN_ID = -1;
		private final MediaDescriptionCompat mDescription;
		private final long mId;
		private Object mItem;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$QueueItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void MediaSessionCompat$QueueItem$1()>
		//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		QueueItem(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
		//    2    4:aload_0         
		//    3    5:getstatic       #36  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//    4    8:aload_1         
		//    5    9:invokeinterface #42  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    6   14:checkcast       #35  <Class MediaDescriptionCompat>
		//    7   17:putfield        #44  <Field MediaDescriptionCompat mDescription>
			mId = parcel.readLong();
		//    8   20:aload_0         
		//    9   21:aload_1         
		//   10   22:invokevirtual   #50  <Method long Parcel.readLong()>
		//   11   25:putfield        #52  <Field long mId>
		//   12   28:return          
		}

		public QueueItem(MediaDescriptionCompat mediadescriptioncompat, long l)
		{
			this(((Object) (null)), mediadescriptioncompat, l);
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:aload_1         
		//    3    3:lload_2         
		//    4    4:invokespecial   #56  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
		//    5    7:return          
		}

		private QueueItem(Object obj, MediaDescriptionCompat mediadescriptioncompat, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			if(mediadescriptioncompat != null)
		//*   2    4:aload_2         
		//*   3    5:ifnull          42
			{
				if(l != -1L)
		//*   4    8:lload_3         
		//*   5    9:ldc2w           #57  <Long -1L>
		//*   6   12:lcmp            
		//*   7   13:ifeq            32
				{
					mDescription = mediadescriptioncompat;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #44  <Field MediaDescriptionCompat mDescription>
					mId = l;
		//   11   21:aload_0         
		//   12   22:lload_3         
		//   13   23:putfield        #52  <Field long mId>
					mItem = obj;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:putfield        #60  <Field Object mItem>
					return;
		//   17   31:return          
				} else
				{
					throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
		//   18   32:new             #62  <Class IllegalArgumentException>
		//   19   35:dup             
		//   20   36:ldc1            #64  <String "Id cannot be QueueItem.UNKNOWN_ID">
		//   21   38:invokespecial   #67  <Method void IllegalArgumentException(String)>
		//   22   41:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("Description cannot be null.");
		//   23   42:new             #62  <Class IllegalArgumentException>
		//   24   45:dup             
		//   25   46:ldc1            #69  <String "Description cannot be null.">
		//   26   48:invokespecial   #67  <Method void IllegalArgumentException(String)>
		//   27   51:athrow          
			}
		}
	}

	public static final class ResultReceiverWrapper
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			mResultReceiver.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ResultReceiver mResultReceiver>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #48  <Method void ResultReceiver.writeToParcel(Parcel, int)>
		//    5    9:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public ResultReceiverWrapper createFromParcel(Parcel parcel)
			{
				return new ResultReceiverWrapper(parcel);
			//    0    0:new             #9   <Class MediaSessionCompat$ResultReceiverWrapper>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MediaSessionCompat$ResultReceiverWrapper(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method MediaSessionCompat$ResultReceiverWrapper createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public ResultReceiverWrapper[] newArray(int i)
			{
				return new ResultReceiverWrapper[i];
			//    0    0:iload_1         
			//    1    1:anewarray       ResultReceiverWrapper[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method MediaSessionCompat$ResultReceiverWrapper[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		ResultReceiver mResultReceiver;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$ResultReceiverWrapper$1>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void MediaSessionCompat$ResultReceiverWrapper$1()>
		//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		ResultReceiverWrapper(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			mResultReceiver = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
		//    2    4:aload_0         
		//    3    5:getstatic       #33  <Field android.os.Parcelable$Creator ResultReceiver.CREATOR>
		//    4    8:aload_1         
		//    5    9:invokeinterface #39  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    6   14:checkcast       #32  <Class ResultReceiver>
		//    7   17:putfield        #41  <Field ResultReceiver mResultReceiver>
		//    8   20:return          
		}

		public ResultReceiverWrapper(ResultReceiver resultreceiver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			mResultReceiver = resultreceiver;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #41  <Field ResultReceiver mResultReceiver>
		//    5    9:return          
		}
	}

	public static interface SessionFlags
		extends Annotation
	{
	}

	public static final class Token
		implements Parcelable
	{

		public static Token fromBundle(Bundle bundle)
		{
			if(bundle == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IMediaSession imediasession = IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
		//    4    6:aload_0         
		//    5    7:ldc1            #48  <String "android.support.v4.media.session.EXTRA_BINDER">
		//    6    9:invokestatic    #54  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//    7   12:invokestatic    #60  <Method IMediaSession IMediaSession$Stub.asInterface(IBinder)>
		//    8   15:astore_1        
			Bundle bundle1 = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
		//    9   16:aload_0         
		//   10   17:ldc1            #62  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
		//   11   19:invokevirtual   #68  <Method Bundle Bundle.getBundle(String)>
		//   12   22:astore_2        
			bundle = ((Bundle) ((Token)bundle.getParcelable("android.support.v4.media.session.TOKEN")));
		//   13   23:aload_0         
		//   14   24:ldc1            #70  <String "android.support.v4.media.session.TOKEN">
		//   15   26:invokevirtual   #74  <Method Parcelable Bundle.getParcelable(String)>
		//   16   29:checkcast       #2   <Class MediaSessionCompat$Token>
		//   17   32:astore_0        
			if(bundle == null)
		//*  18   33:aload_0         
		//*  19   34:ifnonnull       39
				return null;
		//   20   37:aconst_null     
		//   21   38:areturn         
			else
				return new Token(((Token) (bundle)).mInner, imediasession, bundle1);
		//   22   39:new             #2   <Class MediaSessionCompat$Token>
		//   23   42:dup             
		//   24   43:aload_0         
		//   25   44:getfield        #36  <Field Object mInner>
		//   26   47:aload_1         
		//   27   48:aload_2         
		//   28   49:invokespecial   #32  <Method void MediaSessionCompat$Token(Object, IMediaSession, Bundle)>
		//   29   52:areturn         
		}

		public static Token fromToken(Object obj)
		{
			return fromToken(obj, ((IMediaSession) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #80  <Method MediaSessionCompat$Token fromToken(Object, IMediaSession)>
		//    3    5:areturn         
		}

		public static Token fromToken(Object obj, IMediaSession imediasession)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          25
		//*   2    4:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmplt          25
				return new Token(MediaSessionCompatApi21.verifyToken(obj), imediasession);
		//    5   12:new             #2   <Class MediaSessionCompat$Token>
		//    6   15:dup             
		//    7   16:aload_0         
		//    8   17:invokestatic    #92  <Method Object MediaSessionCompatApi21.verifyToken(Object)>
		//    9   20:aload_1         
		//   10   21:invokespecial   #94  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
		//   11   24:areturn         
			else
				return null;
		//   12   25:aconst_null     
		//   13   26:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof Token))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class MediaSessionCompat$Token>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			Object obj1 = ((Object) ((Token)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
		//   12   20:astore_2        
			obj = mInner;
		//   13   21:aload_0         
		//   14   22:getfield        #36  <Field Object mInner>
		//   15   25:astore_1        
			if(obj == null)
		//*  16   26:aload_1         
		//*  17   27:ifnonnull       41
				return ((Token) (obj1)).mInner == null;
		//   18   30:aload_2         
		//   19   31:getfield        #36  <Field Object mInner>
		//   20   34:ifnonnull       39
		//   21   37:iconst_1        
		//   22   38:ireturn         
		//   23   39:iconst_0        
		//   24   40:ireturn         
			obj1 = ((Token) (obj1)).mInner;
		//   25   41:aload_2         
		//   26   42:getfield        #36  <Field Object mInner>
		//   27   45:astore_2        
			if(obj1 == null)
		//*  28   46:aload_2         
		//*  29   47:ifnonnull       52
				return false;
		//   30   50:iconst_0        
		//   31   51:ireturn         
			else
				return obj.equals(obj1);
		//   32   52:aload_1         
		//   33   53:aload_2         
		//   34   54:invokevirtual   #100 <Method boolean Object.equals(Object)>
		//   35   57:ireturn         
		}

		public IMediaSession getExtraBinder()
		{
			return mExtraBinder;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field IMediaSession mExtraBinder>
		//    2    4:areturn         
		}

		public Bundle getSessionToken2Bundle()
		{
			return mSessionToken2Bundle;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field Bundle mSessionToken2Bundle>
		//    2    4:areturn         
		}

		public Object getToken()
		{
			return mInner;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Object mInner>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			Object obj = mInner;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Object mInner>
		//    2    4:astore_1        
			if(obj == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return 0;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			else
				return obj.hashCode();
		//    7   11:aload_1         
		//    8   12:invokevirtual   #109 <Method int Object.hashCode()>
		//    9   15:ireturn         
		}

		public void setExtraBinder(IMediaSession imediasession)
		{
			mExtraBinder = imediasession;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field IMediaSession mExtraBinder>
		//    3    5:return          
		}

		public void setSessionToken2Bundle(Bundle bundle)
		{
			mSessionToken2Bundle = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field Bundle mSessionToken2Bundle>
		//    3    5:return          
		}

		public Bundle toBundle()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #64  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #115 <Method void Bundle()>
		//    3    7:astore_1        
			bundle.putParcelable("android.support.v4.media.session.TOKEN", ((Parcelable) (this)));
		//    4    8:aload_1         
		//    5    9:ldc1            #70  <String "android.support.v4.media.session.TOKEN">
		//    6   11:aload_0         
		//    7   12:invokevirtual   #119 <Method void Bundle.putParcelable(String, Parcelable)>
			Object obj = ((Object) (mExtraBinder));
		//    8   15:aload_0         
		//    9   16:getfield        #38  <Field IMediaSession mExtraBinder>
		//   10   19:astore_2        
			if(obj != null)
		//*  11   20:aload_2         
		//*  12   21:ifnull          36
				BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((IMediaSession) (obj)).asBinder());
		//   13   24:aload_1         
		//   14   25:ldc1            #48  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   15   27:aload_2         
		//   16   28:invokeinterface #125 <Method IBinder IMediaSession.asBinder()>
		//   17   33:invokestatic    #129 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
			obj = ((Object) (mSessionToken2Bundle));
		//   18   36:aload_0         
		//   19   37:getfield        #40  <Field Bundle mSessionToken2Bundle>
		//   20   40:astore_2        
			if(obj != null)
		//*  21   41:aload_2         
		//*  22   42:ifnull          52
				bundle.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", ((Bundle) (obj)));
		//   23   45:aload_1         
		//   24   46:ldc1            #62  <String "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE">
		//   25   48:aload_2         
		//   26   49:invokevirtual   #133 <Method void Bundle.putBundle(String, Bundle)>
			return bundle;
		//   27   52:aload_1         
		//   28   53:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          21
			{
				parcel.writeParcelable((Parcelable)mInner, i);
		//    3    8:aload_1         
		//    4    9:aload_0         
		//    5   10:getfield        #36  <Field Object mInner>
		//    6   13:checkcast       #6   <Class Parcelable>
		//    7   16:iload_2         
		//    8   17:invokevirtual   #141 <Method void Parcel.writeParcelable(Parcelable, int)>
				return;
		//    9   20:return          
			} else
			{
				parcel.writeStrongBinder((IBinder)mInner);
		//   10   21:aload_1         
		//   11   22:aload_0         
		//   12   23:getfield        #36  <Field Object mInner>
		//   13   26:checkcast       #143 <Class IBinder>
		//   14   29:invokevirtual   #147 <Method void Parcel.writeStrongBinder(IBinder)>
				return;
		//   15   32:return          
			}
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Token createFromParcel(Parcel parcel)
			{
				if(android.os.Build.VERSION.SDK_INT >= 21)
			//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
			//*   1    3:bipush          21
			//*   2    5:icmplt          17
					parcel = ((Parcel) (parcel.readParcelable(((ClassLoader) (null)))));
			//    3    8:aload_1         
			//    4    9:aconst_null     
			//    5   10:invokevirtual   #31  <Method Parcelable Parcel.readParcelable(ClassLoader)>
			//    6   13:astore_1        
				else
			//*   7   14:goto            22
					parcel = ((Parcel) (parcel.readStrongBinder()));
			//    8   17:aload_1         
			//    9   18:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
			//   10   21:astore_1        
				return new Token(((Object) (parcel)));
			//   11   22:new             #9   <Class MediaSessionCompat$Token>
			//   12   25:dup             
			//   13   26:aload_1         
			//   14   27:invokespecial   #38  <Method void MediaSessionCompat$Token(Object)>
			//   15   30:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #41  <Method MediaSessionCompat$Token createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public Token[] newArray(int i)
			{
				return new Token[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Token[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #46  <Method MediaSessionCompat$Token[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private IMediaSession mExtraBinder;
		private final Object mInner;
		private Bundle mSessionToken2Bundle;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$Token$1>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void MediaSessionCompat$Token$1()>
		//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		Token(Object obj)
		{
			this(obj, ((IMediaSession) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:aconst_null     
		//    4    4:invokespecial   #32  <Method void MediaSessionCompat$Token(Object, IMediaSession, Bundle)>
		//    5    7:return          
		}

		Token(Object obj, IMediaSession imediasession)
		{
			this(obj, imediasession, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:invokespecial   #32  <Method void MediaSessionCompat$Token(Object, IMediaSession, Bundle)>
		//    5    7:return          
		}

		Token(Object obj, IMediaSession imediasession, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			mInner = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #36  <Field Object mInner>
			mExtraBinder = imediasession;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #38  <Field IMediaSession mExtraBinder>
			mSessionToken2Bundle = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #40  <Field Bundle mSessionToken2Bundle>
		//   11   19:return          
		}
	}


	private MediaSessionCompat(Context context, MediaSessionImpl mediasessionimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void Object()>
		mActiveListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #209 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #210 <Method void ArrayList()>
	//    6   12:putfield        #212 <Field ArrayList mActiveListeners>
		mImpl = mediasessionimpl;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		if(android.os.Build.VERSION.SDK_INT >= 21 && !MediaSessionCompatApi21.hasCallback(mediasessionimpl.getMediaSession()))
	//*  10   20:getstatic       #219 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          21
	//*  12   25:icmplt          52
	//*  13   28:aload_2         
	//*  14   29:invokeinterface #223 <Method Object MediaSessionCompat$MediaSessionImpl.getMediaSession()>
	//*  15   34:invokestatic    #229 <Method boolean MediaSessionCompatApi21.hasCallback(Object)>
	//*  16   37:ifne            52
			setCallback(((Callback) (new Callback() {

				final MediaSessionCompat this$0;

			
			{
				this$0 = MediaSessionCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaSessionCompat this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void MediaSessionCompat$Callback()>
			//    5    9:return          
			}
			}
)));
	//   17   40:aload_0         
	//   18   41:new             #10  <Class MediaSessionCompat$3>
	//   19   44:dup             
	//   20   45:aload_0         
	//   21   46:invokespecial   #232 <Method void MediaSessionCompat$3(MediaSessionCompat)>
	//   22   49:invokevirtual   #236 <Method void setCallback(MediaSessionCompat$Callback)>
		mController = new MediaControllerCompat(context, this);
	//   23   52:aload_0         
	//   24   53:new             #238 <Class MediaControllerCompat>
	//   25   56:dup             
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:invokespecial   #241 <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//   29   62:putfield        #243 <Field MediaControllerCompat mController>
	//   30   65:return          
	}

	public MediaSessionCompat(Context context, String s)
	{
		this(context, s, ((ComponentName) (null)), ((PendingIntent) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #248 <Method void MediaSessionCompat(Context, String, ComponentName, PendingIntent)>
	//    6    8:return          
	}

	public MediaSessionCompat(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
		this(context, s, componentname, pendingintent, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #251 <Method void MediaSessionCompat(Context, String, ComponentName, PendingIntent, Bundle)>
	//    7   10:return          
	}

	private MediaSessionCompat(Context context, String s, ComponentName componentname, PendingIntent pendingintent, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void Object()>
		mActiveListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #209 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #210 <Method void ArrayList()>
	//    6   12:putfield        #212 <Field ArrayList mActiveListeners>
		if(context != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          318
		{
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   9   19:aload_2         
	//*  10   20:invokestatic    #257 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   23:ifne            307
			{
				ComponentName componentname1 = componentname;
	//   12   26:aload_3         
	//   13   27:astore          6
				if(componentname == null)
	//*  14   29:aload_3         
	//*  15   30:ifnonnull       57
				{
					componentname = MediaButtonReceiver.getMediaButtonReceiverComponent(context);
	//   16   33:aload_1         
	//   17   34:invokestatic    #263 <Method ComponentName MediaButtonReceiver.getMediaButtonReceiverComponent(Context)>
	//   18   37:astore_3        
					componentname1 = componentname;
	//   19   38:aload_3         
	//   20   39:astore          6
					if(componentname == null)
	//*  21   41:aload_3         
	//*  22   42:ifnonnull       57
					{
						Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
	//   23   45:ldc1            #194 <String "MediaSessionCompat">
	//   24   47:ldc2            #265 <String "Couldn't find a unique registered media button receiver in the given context.">
	//   25   50:invokestatic    #271 <Method int Log.w(String, String)>
	//   26   53:pop             
						componentname1 = componentname;
	//   27   54:aload_3         
	//   28   55:astore          6
					}
				}
				componentname = ((ComponentName) (pendingintent));
	//   29   57:aload           4
	//   30   59:astore_3        
				if(componentname1 != null)
	//*  31   60:aload           6
	//*  32   62:ifnull          99
				{
					componentname = ((ComponentName) (pendingintent));
	//   33   65:aload           4
	//   34   67:astore_3        
					if(pendingintent == null)
	//*  35   68:aload           4
	//*  36   70:ifnonnull       99
					{
						componentname = ((ComponentName) (new Intent("android.intent.action.MEDIA_BUTTON")));
	//   37   73:new             #273 <Class Intent>
	//   38   76:dup             
	//   39   77:ldc2            #275 <String "android.intent.action.MEDIA_BUTTON">
	//   40   80:invokespecial   #278 <Method void Intent(String)>
	//   41   83:astore_3        
						((Intent) (componentname)).setComponent(componentname1);
	//   42   84:aload_3         
	//   43   85:aload           6
	//   44   87:invokevirtual   #282 <Method Intent Intent.setComponent(ComponentName)>
	//   45   90:pop             
						componentname = ((ComponentName) (PendingIntent.getBroadcast(context, 0, ((Intent) (componentname)), 0)));
	//   46   91:aload_1         
	//   47   92:iconst_0        
	//   48   93:aload_3         
	//   49   94:iconst_0        
	//   50   95:invokestatic    #288 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   51   98:astore_3        
					}
				}
				if(android.os.Build.VERSION.SDK_INT >= 28)
	//*  52   99:getstatic       #219 <Field int android.os.Build$VERSION.SDK_INT>
	//*  53  102:bipush          28
	//*  54  104:icmplt          147
				{
					mImpl = ((MediaSessionImpl) (new MediaSessionImplApi28(context, s, bundle)));
	//   55  107:aload_0         
	//   56  108:new             #46  <Class MediaSessionCompat$MediaSessionImplApi28>
	//   57  111:dup             
	//   58  112:aload_1         
	//   59  113:aload_2         
	//   60  114:aload           5
	//   61  116:invokespecial   #291 <Method void MediaSessionCompat$MediaSessionImplApi28(Context, String, Bundle)>
	//   62  119:putfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
					setCallback(((Callback) (new Callback() {

						final MediaSessionCompat this$0;

			
			{
				this$0 = MediaSessionCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaSessionCompat this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void MediaSessionCompat$Callback()>
			//    5    9:return          
			}
					}
)));
	//   63  122:aload_0         
	//   64  123:new             #6   <Class MediaSessionCompat$1>
	//   65  126:dup             
	//   66  127:aload_0         
	//   67  128:invokespecial   #292 <Method void MediaSessionCompat$1(MediaSessionCompat)>
	//   68  131:invokevirtual   #236 <Method void setCallback(MediaSessionCompat$Callback)>
					mImpl.setMediaButtonReceiver(((PendingIntent) (componentname)));
	//   69  134:aload_0         
	//   70  135:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//   71  138:aload_3         
	//   72  139:invokeinterface #296 <Method void MediaSessionCompat$MediaSessionImpl.setMediaButtonReceiver(PendingIntent)>
				} else
	//*  73  144:goto            265
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  74  147:getstatic       #219 <Field int android.os.Build$VERSION.SDK_INT>
	//*  75  150:bipush          21
	//*  76  152:icmplt          195
				{
					mImpl = ((MediaSessionImpl) (new MediaSessionImplApi21(context, s, bundle)));
	//   77  155:aload_0         
	//   78  156:new             #40  <Class MediaSessionCompat$MediaSessionImplApi21>
	//   79  159:dup             
	//   80  160:aload_1         
	//   81  161:aload_2         
	//   82  162:aload           5
	//   83  164:invokespecial   #297 <Method void MediaSessionCompat$MediaSessionImplApi21(Context, String, Bundle)>
	//   84  167:putfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
					setCallback(((Callback) (new Callback() {

						final MediaSessionCompat this$0;

			
			{
				this$0 = MediaSessionCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaSessionCompat this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void MediaSessionCompat$Callback()>
			//    5    9:return          
			}
					}
)));
	//   85  170:aload_0         
	//   86  171:new             #8   <Class MediaSessionCompat$2>
	//   87  174:dup             
	//   88  175:aload_0         
	//   89  176:invokespecial   #298 <Method void MediaSessionCompat$2(MediaSessionCompat)>
	//   90  179:invokevirtual   #236 <Method void setCallback(MediaSessionCompat$Callback)>
					mImpl.setMediaButtonReceiver(((PendingIntent) (componentname)));
	//   91  182:aload_0         
	//   92  183:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//   93  186:aload_3         
	//   94  187:invokeinterface #296 <Method void MediaSessionCompat$MediaSessionImpl.setMediaButtonReceiver(PendingIntent)>
				} else
	//*  95  192:goto            265
				if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  96  195:getstatic       #219 <Field int android.os.Build$VERSION.SDK_INT>
	//*  97  198:bipush          19
	//*  98  200:icmplt          222
					mImpl = ((MediaSessionImpl) (new MediaSessionImplApi19(context, s, componentname1, ((PendingIntent) (componentname)))));
	//   99  203:aload_0         
	//  100  204:new             #35  <Class MediaSessionCompat$MediaSessionImplApi19>
	//  101  207:dup             
	//  102  208:aload_1         
	//  103  209:aload_2         
	//  104  210:aload           6
	//  105  212:aload_3         
	//  106  213:invokespecial   #299 <Method void MediaSessionCompat$MediaSessionImplApi19(Context, String, ComponentName, PendingIntent)>
	//  107  216:putfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
				else
	//* 108  219:goto            265
				if(android.os.Build.VERSION.SDK_INT >= 18)
	//* 109  222:getstatic       #219 <Field int android.os.Build$VERSION.SDK_INT>
	//* 110  225:bipush          18
	//* 111  227:icmplt          249
					mImpl = ((MediaSessionImpl) (new MediaSessionImplApi18(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  112  230:aload_0         
	//  113  231:new             #30  <Class MediaSessionCompat$MediaSessionImplApi18>
	//  114  234:dup             
	//  115  235:aload_1         
	//  116  236:aload_2         
	//  117  237:aload           6
	//  118  239:aload_3         
	//  119  240:invokespecial   #300 <Method void MediaSessionCompat$MediaSessionImplApi18(Context, String, ComponentName, PendingIntent)>
	//  120  243:putfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
				else
	//* 121  246:goto            265
					mImpl = ((MediaSessionImpl) (new MediaSessionImplBase(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  122  249:aload_0         
	//  123  250:new             #49  <Class MediaSessionCompat$MediaSessionImplBase>
	//  124  253:dup             
	//  125  254:aload_1         
	//  126  255:aload_2         
	//  127  256:aload           6
	//  128  258:aload_3         
	//  129  259:invokespecial   #301 <Method void MediaSessionCompat$MediaSessionImplBase(Context, String, ComponentName, PendingIntent)>
	//  130  262:putfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
				mController = new MediaControllerCompat(context, this);
	//  131  265:aload_0         
	//  132  266:new             #238 <Class MediaControllerCompat>
	//  133  269:dup             
	//  134  270:aload_1         
	//  135  271:aload_0         
	//  136  272:invokespecial   #241 <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//  137  275:putfield        #243 <Field MediaControllerCompat mController>
				if(sMaxBitmapSize == 0)
	//* 138  278:getstatic       #303 <Field int sMaxBitmapSize>
	//* 139  281:ifne            306
					sMaxBitmapSize = (int)(TypedValue.applyDimension(1, 320F, context.getResources().getDisplayMetrics()) + 0.5F);
	//  140  284:iconst_1        
	//  141  285:ldc2            #304 <Float 320F>
	//  142  288:aload_1         
	//  143  289:invokevirtual   #310 <Method Resources Context.getResources()>
	//  144  292:invokevirtual   #316 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//  145  295:invokestatic    #322 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//  146  298:ldc2            #323 <Float 0.5F>
	//  147  301:fadd            
	//  148  302:f2i             
	//  149  303:putstatic       #303 <Field int sMaxBitmapSize>
				return;
	//  150  306:return          
			} else
			{
				throw new IllegalArgumentException("tag must not be null or empty");
	//  151  307:new             #325 <Class IllegalArgumentException>
	//  152  310:dup             
	//  153  311:ldc2            #327 <String "tag must not be null or empty">
	//  154  314:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//  155  317:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("context must not be null");
	//  156  318:new             #325 <Class IllegalArgumentException>
	//  157  321:dup             
	//  158  322:ldc2            #330 <String "context must not be null">
	//  159  325:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//  160  328:athrow          
		}
	}

	public MediaSessionCompat(Context context, String s, Bundle bundle)
	{
		this(context, s, ((ComponentName) (null)), ((PendingIntent) (null)), bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aload_3         
	//    6    6:invokespecial   #251 <Method void MediaSessionCompat(Context, String, ComponentName, PendingIntent, Bundle)>
	//    7    9:return          
	}

	public static void ensureClassLoader(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class MediaSessionCompat>
	//    4    7:invokevirtual   #340 <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #346 <Method void Bundle.setClassLoader(ClassLoader)>
	//    6   13:return          
	}

	public static MediaSessionCompat fromMediaSession(Context context, Object obj)
	{
		if(context != null && obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          33
	//*   2    4:aload_1         
	//*   3    5:ifnull          33
	//*   4    8:getstatic       #219 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmplt          33
			return new MediaSessionCompat(context, ((MediaSessionImpl) (new MediaSessionImplApi21(obj))));
	//    7   16:new             #2   <Class MediaSessionCompat>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:new             #40  <Class MediaSessionCompat$MediaSessionImplApi21>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokespecial   #352 <Method void MediaSessionCompat$MediaSessionImplApi21(Object)>
	//   14   29:invokespecial   #354 <Method void MediaSessionCompat(Context, MediaSessionCompat$MediaSessionImpl)>
	//   15   32:areturn         
		else
			return null;
	//   16   33:aconst_null     
	//   17   34:areturn         
	}

	static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackstatecompat, MediaMetadataCompat mediametadatacompat)
	{
		if(playbackstatecompat != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          169
		{
			long l = playbackstatecompat.getPosition();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #362 <Method long PlaybackStateCompat.getPosition()>
	//    4    8:lstore_2        
			long l2 = -1L;
	//    5    9:ldc2w           #363 <Long -1L>
	//    6   12:lstore          4
			if(l == -1L)
	//*   7   14:lload_2         
	//*   8   15:ldc2w           #363 <Long -1L>
	//*   9   18:lcmp            
	//*  10   19:ifne            24
				return playbackstatecompat;
	//   11   22:aload_0         
	//   12   23:areturn         
			if(playbackstatecompat.getState() == 3 || playbackstatecompat.getState() == 4 || playbackstatecompat.getState() == 5)
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #368 <Method int PlaybackStateCompat.getState()>
	//*  15   28:iconst_3        
	//*  16   29:icmpeq          48
	//*  17   32:aload_0         
	//*  18   33:invokevirtual   #368 <Method int PlaybackStateCompat.getState()>
	//*  19   36:iconst_4        
	//*  20   37:icmpeq          48
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #368 <Method int PlaybackStateCompat.getState()>
	//*  23   44:iconst_5        
	//*  24   45:icmpne          167
			{
				long l1 = playbackstatecompat.getLastPositionUpdateTime();
	//   25   48:aload_0         
	//   26   49:invokevirtual   #371 <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
	//   27   52:lstore_2        
				if(l1 > 0L)
	//*  28   53:lload_2         
	//*  29   54:lconst_0        
	//*  30   55:lcmp            
	//*  31   56:ifle            167
				{
					long l4 = SystemClock.elapsedRealtime();
	//   32   59:invokestatic    #376 <Method long SystemClock.elapsedRealtime()>
	//   33   62:lstore          8
					long l3 = (long)(playbackstatecompat.getPlaybackSpeed() * (float)(l4 - l1)) + playbackstatecompat.getPosition();
	//   34   64:aload_0         
	//   35   65:invokevirtual   #380 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//   36   68:lload           8
	//   37   70:lload_2         
	//   38   71:lsub            
	//   39   72:l2f             
	//   40   73:fmul            
	//   41   74:f2l             
	//   42   75:aload_0         
	//   43   76:invokevirtual   #362 <Method long PlaybackStateCompat.getPosition()>
	//   44   79:ladd            
	//   45   80:lstore          6
					l1 = l2;
	//   46   82:lload           4
	//   47   84:lstore_2        
					if(mediametadatacompat != null)
	//*  48   85:aload_1         
	//*  49   86:ifnull          110
					{
						l1 = l2;
	//   50   89:lload           4
	//   51   91:lstore_2        
						if(mediametadatacompat.containsKey("android.media.metadata.DURATION"))
	//*  52   92:aload_1         
	//*  53   93:ldc2            #382 <String "android.media.metadata.DURATION">
	//*  54   96:invokevirtual   #388 <Method boolean MediaMetadataCompat.containsKey(String)>
	//*  55   99:ifeq            110
							l1 = mediametadatacompat.getLong("android.media.metadata.DURATION");
	//   56  102:aload_1         
	//   57  103:ldc2            #382 <String "android.media.metadata.DURATION">
	//   58  106:invokevirtual   #392 <Method long MediaMetadataCompat.getLong(String)>
	//   59  109:lstore_2        
					}
					if(l1 < 0L || l3 <= l1)
	//*  60  110:lload_2         
	//*  61  111:lconst_0        
	//*  62  112:lcmp            
	//*  63  113:iflt            126
	//*  64  116:lload           6
	//*  65  118:lload_2         
	//*  66  119:lcmp            
	//*  67  120:ifle            126
	//*  68  123:goto            141
						if(l3 < 0L)
	//*  69  126:lload           6
	//*  70  128:lconst_0        
	//*  71  129:lcmp            
	//*  72  130:ifge            138
							l1 = 0L;
	//   73  133:lconst_0        
	//   74  134:lstore_2        
						else
	//*  75  135:goto            141
							l1 = l3;
	//   76  138:lload           6
	//   77  140:lstore_2        
					return (new PlaybackStateCompat.Builder(playbackstatecompat)).setState(playbackstatecompat.getState(), l1, playbackstatecompat.getPlaybackSpeed(), l4).build();
	//   78  141:new             #394 <Class PlaybackStateCompat$Builder>
	//   79  144:dup             
	//   80  145:aload_0         
	//   81  146:invokespecial   #397 <Method void PlaybackStateCompat$Builder(PlaybackStateCompat)>
	//   82  149:aload_0         
	//   83  150:invokevirtual   #368 <Method int PlaybackStateCompat.getState()>
	//   84  153:lload_2         
	//   85  154:aload_0         
	//   86  155:invokevirtual   #380 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//   87  158:lload           8
	//   88  160:invokevirtual   #401 <Method PlaybackStateCompat$Builder PlaybackStateCompat$Builder.setState(int, long, float, long)>
	//   89  163:invokevirtual   #405 <Method PlaybackStateCompat PlaybackStateCompat$Builder.build()>
	//   90  166:areturn         
				}
			}
			return playbackstatecompat;
	//   91  167:aload_0         
	//   92  168:areturn         
		} else
		{
			return playbackstatecompat;
	//   93  169:aload_0         
	//   94  170:areturn         
		}
	}

	public void addOnActiveChangeListener(OnActiveChangeListener onactivechangelistener)
	{
		if(onactivechangelistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
		{
			mActiveListeners.add(((Object) (onactivechangelistener)));
	//    2    4:aload_0         
	//    3    5:getfield        #212 <Field ArrayList mActiveListeners>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #410 <Method boolean ArrayList.add(Object)>
	//    6   12:pop             
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    8   14:new             #325 <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc2            #412 <String "Listener may not be null">
	//   11   21:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//   12   24:athrow          
		}
	}

	public String getCallingPackage()
	{
		return mImpl.getCallingPackage();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #416 <Method String MediaSessionCompat$MediaSessionImpl.getCallingPackage()>
	//    3    9:areturn         
	}

	public MediaControllerCompat getController()
	{
		return mController;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field MediaControllerCompat mController>
	//    2    4:areturn         
	}

	public final android.support.v4.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
	{
		return mImpl.getCurrentControllerInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #423 <Method android.support.v4.media.MediaSessionManager$RemoteUserInfo MediaSessionCompat$MediaSessionImpl.getCurrentControllerInfo()>
	//    3    9:areturn         
	}

	public Object getMediaSession()
	{
		return mImpl.getMediaSession();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #223 <Method Object MediaSessionCompat$MediaSessionImpl.getMediaSession()>
	//    3    9:areturn         
	}

	public Object getRemoteControlClient()
	{
		return mImpl.getRemoteControlClient();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #426 <Method Object MediaSessionCompat$MediaSessionImpl.getRemoteControlClient()>
	//    3    9:areturn         
	}

	public Token getSessionToken()
	{
		return mImpl.getSessionToken();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #430 <Method MediaSessionCompat$Token MediaSessionCompat$MediaSessionImpl.getSessionToken()>
	//    3    9:areturn         
	}

	public boolean isActive()
	{
		return mImpl.isActive();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #434 <Method boolean MediaSessionCompat$MediaSessionImpl.isActive()>
	//    3    9:ireturn         
	}

	public void release()
	{
		mImpl.release();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #437 <Method void MediaSessionCompat$MediaSessionImpl.release()>
	//    3    9:return          
	}

	public void removeOnActiveChangeListener(OnActiveChangeListener onactivechangelistener)
	{
		if(onactivechangelistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
		{
			mActiveListeners.remove(((Object) (onactivechangelistener)));
	//    2    4:aload_0         
	//    3    5:getfield        #212 <Field ArrayList mActiveListeners>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #441 <Method boolean ArrayList.remove(Object)>
	//    6   12:pop             
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    8   14:new             #325 <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc2            #412 <String "Listener may not be null">
	//   11   21:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//   12   24:athrow          
		}
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #257 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            19
		{
			mImpl.sendSessionEvent(s, bundle);
	//    3    7:aload_0         
	//    4    8:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #445 <Method void MediaSessionCompat$MediaSessionImpl.sendSessionEvent(String, Bundle)>
			return;
	//    8   18:return          
		} else
		{
			throw new IllegalArgumentException("event cannot be null or empty");
	//    9   19:new             #325 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc2            #447 <String "event cannot be null or empty">
	//   12   26:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//   13   29:athrow          
		}
	}

	public void setActive(boolean flag)
	{
		mImpl.setActive(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #451 <Method void MediaSessionCompat$MediaSessionImpl.setActive(boolean)>
		for(Iterator iterator = mActiveListeners.iterator(); iterator.hasNext(); ((OnActiveChangeListener)iterator.next()).onActiveChanged());
	//    4   10:aload_0         
	//    5   11:getfield        #212 <Field ArrayList mActiveListeners>
	//    6   14:invokevirtual   #455 <Method Iterator ArrayList.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #460 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_2         
	//   12   28:invokeinterface #463 <Method Object Iterator.next()>
	//   13   33:checkcast       #63  <Class MediaSessionCompat$OnActiveChangeListener>
	//   14   36:invokeinterface #466 <Method void MediaSessionCompat$OnActiveChangeListener.onActiveChanged()>
	//*  15   41:goto            18
	//   16   44:return          
	}

	public void setCallback(Callback callback)
	{
		setCallback(callback, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #469 <Method void setCallback(MediaSessionCompat$Callback, Handler)>
	//    4    6:return          
	}

	public void setCallback(Callback callback, Handler handler)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			mImpl.setCallback(((Callback) (null)), ((Handler) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokeinterface #470 <Method void MediaSessionCompat$MediaSessionImpl.setCallback(MediaSessionCompat$Callback, Handler)>
			return;
	//    7   15:return          
		}
		MediaSessionImpl mediasessionimpl = mImpl;
	//    8   16:aload_0         
	//    9   17:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//   10   20:astore_3        
		if(handler == null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          28
	//*  13   25:goto            36
			handler = new Handler();
	//   14   28:new             #472 <Class Handler>
	//   15   31:dup             
	//   16   32:invokespecial   #473 <Method void Handler()>
	//   17   35:astore_2        
		mediasessionimpl.setCallback(callback, handler);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokeinterface #470 <Method void MediaSessionCompat$MediaSessionImpl.setCallback(MediaSessionCompat$Callback, Handler)>
	//   22   44:return          
	}

	public void setCaptioningEnabled(boolean flag)
	{
		mImpl.setCaptioningEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #476 <Method void MediaSessionCompat$MediaSessionImpl.setCaptioningEnabled(boolean)>
	//    4   10:return          
	}

	public void setExtras(Bundle bundle)
	{
		mImpl.setExtras(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #479 <Method void MediaSessionCompat$MediaSessionImpl.setExtras(Bundle)>
	//    4   10:return          
	}

	public void setFlags(int i)
	{
		mImpl.setFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #483 <Method void MediaSessionCompat$MediaSessionImpl.setFlags(int)>
	//    4   10:return          
	}

	public void setMediaButtonReceiver(PendingIntent pendingintent)
	{
		mImpl.setMediaButtonReceiver(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #296 <Method void MediaSessionCompat$MediaSessionImpl.setMediaButtonReceiver(PendingIntent)>
	//    4   10:return          
	}

	public void setMetadata(MediaMetadataCompat mediametadatacompat)
	{
		mImpl.setMetadata(mediametadatacompat);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #487 <Method void MediaSessionCompat$MediaSessionImpl.setMetadata(MediaMetadataCompat)>
	//    4   10:return          
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		mImpl.setPlaybackState(playbackstatecompat);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #490 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackState(PlaybackStateCompat)>
	//    4   10:return          
	}

	public void setPlaybackToLocal(int i)
	{
		mImpl.setPlaybackToLocal(i);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #493 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackToLocal(int)>
	//    4   10:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		if(volumeprovidercompat != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
		{
			mImpl.setPlaybackToRemote(volumeprovidercompat);
	//    2    4:aload_0         
	//    3    5:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    4    8:aload_1         
	//    5    9:invokeinterface #497 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackToRemote(VolumeProviderCompat)>
			return;
	//    6   14:return          
		} else
		{
			throw new IllegalArgumentException("volumeProvider may not be null!");
	//    7   15:new             #325 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc2            #499 <String "volumeProvider may not be null!">
	//   10   22:invokespecial   #328 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
		}
	}

	public void setQueue(List list)
	{
		mImpl.setQueue(list);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #503 <Method void MediaSessionCompat$MediaSessionImpl.setQueue(List)>
	//    4   10:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		mImpl.setQueueTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #509 <Method void MediaSessionCompat$MediaSessionImpl.setQueueTitle(CharSequence)>
	//    4   10:return          
	}

	public void setRatingType(int i)
	{
		mImpl.setRatingType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #512 <Method void MediaSessionCompat$MediaSessionImpl.setRatingType(int)>
	//    4   10:return          
	}

	public void setRepeatMode(int i)
	{
		mImpl.setRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #515 <Method void MediaSessionCompat$MediaSessionImpl.setRepeatMode(int)>
	//    4   10:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		mImpl.setSessionActivity(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #518 <Method void MediaSessionCompat$MediaSessionImpl.setSessionActivity(PendingIntent)>
	//    4   10:return          
	}

	public void setShuffleMode(int i)
	{
		mImpl.setShuffleMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #521 <Method void MediaSessionCompat$MediaSessionImpl.setShuffleMode(int)>
	//    4   10:return          
	}

	public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
	public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
	public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
	public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
	public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
	public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
	public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
	public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
	public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
	public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
	public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
	public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
	public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
	public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
	public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
	public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
	public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
	public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
	public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
	public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
	public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
	public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
	public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
	private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
	private static final String DATA_CALLING_PID = "data_calling_pid";
	private static final String DATA_CALLING_UID = "data_calling_uid";
	private static final String DATA_EXTRAS = "data_extras";
	public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
	public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
	public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
	public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
	public static final String KEY_SESSION_TOKEN2_BUNDLE = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";
	public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
	private static final int MAX_BITMAP_SIZE_IN_DP = 320;
	public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
	public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
	public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
	static final String TAG = "MediaSessionCompat";
	static int sMaxBitmapSize;
	private final ArrayList mActiveListeners;
	private final MediaControllerCompat mController;
	private final MediaSessionImpl mImpl;

	// Unreferenced inner class android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase$1

/* anonymous class */
	class MediaSessionImplBase._cls1 extends android.support.v4.media.VolumeProviderCompat.Callback
	{

		public void onVolumeChanged(VolumeProviderCompat volumeprovidercompat)
		{
			if(mVolumeProvider != volumeprovidercompat)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #25  <Field VolumeProviderCompat MediaSessionCompat$MediaSessionImplBase.mVolumeProvider>
		//*   3    7:aload_1         
		//*   4    8:if_acmpeq       12
			{
				return;
		//    5   11:return          
			} else
			{
				volumeprovidercompat = ((VolumeProviderCompat) (new ParcelableVolumeInfo(mVolumeType, mLocalStream, volumeprovidercompat.getVolumeControl(), volumeprovidercompat.getMaxVolume(), volumeprovidercompat.getCurrentVolume())));
		//    6   12:new             #27  <Class ParcelableVolumeInfo>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   10   20:getfield        #31  <Field int MediaSessionCompat$MediaSessionImplBase.mVolumeType>
		//   11   23:aload_0         
		//   12   24:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   13   27:getfield        #34  <Field int MediaSessionCompat$MediaSessionImplBase.mLocalStream>
		//   14   30:aload_1         
		//   15   31:invokevirtual   #40  <Method int VolumeProviderCompat.getVolumeControl()>
		//   16   34:aload_1         
		//   17   35:invokevirtual   #43  <Method int VolumeProviderCompat.getMaxVolume()>
		//   18   38:aload_1         
		//   19   39:invokevirtual   #46  <Method int VolumeProviderCompat.getCurrentVolume()>
		//   20   42:invokespecial   #49  <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   21   45:astore_1        
				sendVolumeInfoChanged(((ParcelableVolumeInfo) (volumeprovidercompat)));
		//   22   46:aload_0         
		//   23   47:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   24   50:aload_1         
		//   25   51:invokevirtual   #53  <Method void MediaSessionCompat$MediaSessionImplBase.sendVolumeInfoChanged(ParcelableVolumeInfo)>
				return;
		//   26   54:return          
			}
		}

		final MediaSessionImplBase this$0;

			
			{
				this$0 = MediaSessionImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.support.v4.media.VolumeProviderCompat$Callback()>
			//    5    9:return          
			}
	}

}
