// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.*;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.*;
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

		private void handleMediaPlayPauseKeySingleTapIfPending()
		{
			if(mMediaPlayPauseKeyPending)
		//*   0    0:aload_0         
		//*   1    1:getfield        #80  <Field boolean mMediaPlayPauseKeyPending>
		//*   2    4:ifne            8
		//*   3    7:return          
			{
				mMediaPlayPauseKeyPending = false;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #80  <Field boolean mMediaPlayPauseKeyPending>
				mCallbackHandler.removeMessages(1);
		//    7   13:aload_0         
		//    8   14:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//    9   17:iconst_1        
		//   10   18:invokevirtual   #84  <Method void MediaSessionCompat$Callback$CallbackHandler.removeMessages(int)>
				Object obj = ((Object) ((MediaSessionImpl)mSessionImpl.get()));
		//   11   21:aload_0         
		//   12   22:getfield        #72  <Field WeakReference mSessionImpl>
		//   13   25:invokevirtual   #90  <Method Object WeakReference.get()>
		//   14   28:checkcast       #92  <Class MediaSessionCompat$MediaSessionImpl>
		//   15   31:astore          6
				if(obj != null)
		//*  16   33:aload           6
		//*  17   35:ifnull          7
				{
					obj = ((Object) (((MediaSessionImpl) (obj)).getPlaybackState()));
		//   18   38:aload           6
		//   19   40:invokeinterface #96  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImpl.getPlaybackState()>
		//   20   45:astore          6
					boolean flag;
					boolean flag1;
					boolean flag2;
					long l;
					if(obj == null)
		//*  21   47:aload           6
		//*  22   49:ifnonnull       110
						l = 0L;
		//   23   52:lconst_0        
		//   24   53:lstore          4
					else
		//*  25   55:aload           6
		//*  26   57:ifnull          120
		//*  27   60:aload           6
		//*  28   62:invokevirtual   #102 <Method int PlaybackStateCompat.getState()>
		//*  29   65:iconst_3        
		//*  30   66:icmpne          120
		//*  31   69:iconst_1        
		//*  32   70:istore_1        
		//*  33   71:ldc2w           #103 <Long 516L>
		//*  34   74:lload           4
		//*  35   76:land            
		//*  36   77:lconst_0        
		//*  37   78:lcmp            
		//*  38   79:ifeq            125
		//*  39   82:iconst_1        
		//*  40   83:istore_2        
		//*  41   84:lload           4
		//*  42   86:ldc2w           #105 <Long 514L>
		//*  43   89:land            
		//*  44   90:lconst_0        
		//*  45   91:lcmp            
		//*  46   92:ifeq            130
		//*  47   95:iconst_1        
		//*  48   96:istore_3        
		//*  49   97:iload_1         
		//*  50   98:ifeq            135
		//*  51  101:iload_3         
		//*  52  102:ifeq            135
		//*  53  105:aload_0         
		//*  54  106:invokevirtual   #109 <Method void onPause()>
		//*  55  109:return          
						l = ((PlaybackStateCompat) (obj)).getActions();
		//   56  110:aload           6
		//   57  112:invokevirtual   #113 <Method long PlaybackStateCompat.getActions()>
		//   58  115:lstore          4
					if(obj != null && ((PlaybackStateCompat) (obj)).getState() == 3)
						flag = true;
					else
		//*  59  117:goto            55
						flag = false;
		//   60  120:iconst_0        
		//   61  121:istore_1        
					if((516L & l) != 0L)
						flag1 = true;
					else
		//*  62  122:goto            71
						flag1 = false;
		//   63  125:iconst_0        
		//   64  126:istore_2        
					if((l & 514L) != 0L)
						flag2 = true;
					else
		//*  65  127:goto            84
						flag2 = false;
		//   66  130:iconst_0        
		//   67  131:istore_3        
					if(flag && flag2)
					{
						onPause();
						return;
					}
		//*  68  132:goto            97
					if(!flag && flag1)
		//*  69  135:iload_1         
		//*  70  136:ifne            7
		//*  71  139:iload_2         
		//*  72  140:ifeq            7
					{
						onPlay();
		//   73  143:aload_0         
		//   74  144:invokevirtual   #116 <Method void onPlay()>
						return;
		//   75  147:return          
					}
				}
			}
		}

		private void setSessionImpl(MediaSessionImpl mediasessionimpl, Handler handler)
		{
			mSessionImpl = new WeakReference(((Object) (mediasessionimpl)));
		//    0    0:aload_0         
		//    1    1:new             #86  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #119 <Method void WeakReference(Object)>
		//    5    9:putfield        #72  <Field WeakReference mSessionImpl>
			if(mCallbackHandler != null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//*   8   16:ifnull          27
				mCallbackHandler.removeCallbacksAndMessages(((Object) (null)));
		//    9   19:aload_0         
		//   10   20:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   11   23:aconst_null     
		//   12   24:invokevirtual   #122 <Method void MediaSessionCompat$Callback$CallbackHandler.removeCallbacksAndMessages(Object)>
			mCallbackHandler = new CallbackHandler(handler.getLooper());
		//   13   27:aload_0         
		//   14   28:new             #9   <Class MediaSessionCompat$Callback$CallbackHandler>
		//   15   31:dup             
		//   16   32:aload_0         
		//   17   33:aload_2         
		//   18   34:invokevirtual   #128 <Method Looper Handler.getLooper()>
		//   19   37:invokespecial   #131 <Method void MediaSessionCompat$Callback$CallbackHandler(MediaSessionCompat$Callback, Looper)>
		//   20   40:putfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   21   43:return          
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
			MediaSessionImpl mediasessionimpl;
			mediasessionimpl = (MediaSessionImpl)mSessionImpl.get();
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field WeakReference mSessionImpl>
		//    2    4:invokevirtual   #90  <Method Object WeakReference.get()>
		//    3    7:checkcast       #92  <Class MediaSessionCompat$MediaSessionImpl>
		//    4   10:astore          4
			if(mediasessionimpl == null || mCallbackHandler == null)
		//*   5   12:aload           4
		//*   6   14:ifnull          24
		//*   7   17:aload_0         
		//*   8   18:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//*   9   21:ifnonnull       26
				return false;
		//   10   24:iconst_0        
		//   11   25:ireturn         
			intent = ((Intent) ((KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT")));
		//   12   26:aload_1         
		//   13   27:ldc1            #143 <String "android.intent.extra.KEY_EVENT">
		//   14   29:invokevirtual   #149 <Method Parcelable Intent.getParcelableExtra(String)>
		//   15   32:checkcast       #151 <Class KeyEvent>
		//   16   35:astore_1        
			if(intent == null || ((KeyEvent) (intent)).getAction() != 0)
		//*  17   36:aload_1         
		//*  18   37:ifnull          47
		//*  19   40:aload_1         
		//*  20   41:invokevirtual   #154 <Method int KeyEvent.getAction()>
		//*  21   44:ifeq            49
				return false;
		//   22   47:iconst_0        
		//   23   48:ireturn         
			switch(((KeyEvent) (intent)).getKeyCode())
		//*  24   49:aload_1         
		//*  25   50:invokevirtual   #157 <Method int KeyEvent.getKeyCode()>
			{
		//*  26   53:lookupswitch    2: default 80
		//		               79: 86
		//		               85: 86
			default:
				handleMediaPlayPauseKeySingleTapIfPending();
		//   27   80:aload_0         
		//   28   81:invokespecial   #68  <Method void handleMediaPlayPauseKeySingleTapIfPending()>
				return false;
		//   29   84:iconst_0        
		//   30   85:ireturn         

			case 79: // 'O'
			case 85: // 'U'
				break;
			}
			if(((KeyEvent) (intent)).getRepeatCount() <= 0) goto _L2; else goto _L1
		//   31   86:aload_1         
		//   32   87:invokevirtual   #160 <Method int KeyEvent.getRepeatCount()>
		//   33   90:ifle            99
_L1:
			handleMediaPlayPauseKeySingleTapIfPending();
		//   34   93:aload_0         
		//   35   94:invokespecial   #68  <Method void handleMediaPlayPauseKeySingleTapIfPending()>
_L4:
			return true;
		//   36   97:iconst_1        
		//   37   98:ireturn         
_L2:
			if(mMediaPlayPauseKeyPending)
		//*  38   99:aload_0         
		//*  39  100:getfield        #80  <Field boolean mMediaPlayPauseKeyPending>
		//*  40  103:ifeq            158
			{
				mCallbackHandler.removeMessages(1);
		//   41  106:aload_0         
		//   42  107:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   43  110:iconst_1        
		//   44  111:invokevirtual   #84  <Method void MediaSessionCompat$Callback$CallbackHandler.removeMessages(int)>
				mMediaPlayPauseKeyPending = false;
		//   45  114:aload_0         
		//   46  115:iconst_0        
		//   47  116:putfield        #80  <Field boolean mMediaPlayPauseKeyPending>
				intent = ((Intent) (mediasessionimpl.getPlaybackState()));
		//   48  119:aload           4
		//   49  121:invokeinterface #96  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImpl.getPlaybackState()>
		//   50  126:astore_1        
				long l;
				if(intent == null)
		//*  51  127:aload_1         
		//*  52  128:ifnonnull       150
					l = 0L;
		//   53  131:lconst_0        
		//   54  132:lstore_2        
				else
		//*  55  133:lload_2         
		//*  56  134:ldc2w           #161 <Long 32L>
		//*  57  137:land            
		//*  58  138:lconst_0        
		//*  59  139:lcmp            
		//*  60  140:ifeq            97
		//*  61  143:aload_0         
		//*  62  144:invokevirtual   #165 <Method void onSkipToNext()>
		//*  63  147:goto            97
					l = ((PlaybackStateCompat) (intent)).getActions();
		//   64  150:aload_1         
		//   65  151:invokevirtual   #113 <Method long PlaybackStateCompat.getActions()>
		//   66  154:lstore_2        
				if((l & 32L) != 0L)
					onSkipToNext();
			} else
		//*  67  155:goto            133
			{
				mMediaPlayPauseKeyPending = true;
		//   68  158:aload_0         
		//   69  159:iconst_1        
		//   70  160:putfield        #80  <Field boolean mMediaPlayPauseKeyPending>
				mCallbackHandler.sendEmptyMessageDelayed(1, ViewConfiguration.getDoubleTapTimeout());
		//   71  163:aload_0         
		//   72  164:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   73  167:iconst_1        
		//   74  168:invokestatic    #170 <Method int ViewConfiguration.getDoubleTapTimeout()>
		//   75  171:i2l             
		//   76  172:invokevirtual   #174 <Method boolean MediaSessionCompat$Callback$CallbackHandler.sendEmptyMessageDelayed(int, long)>
		//   77  175:pop             
			}
			if(true) goto _L4; else goto _L3
		//   78  176:goto            97
_L3:
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

		public void onSetShuffleModeEnabled(boolean flag)
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

		private CallbackHandler mCallbackHandler;
		final Object mCallbackObj;
		private boolean mMediaPlayPauseKeyPending;
		private WeakReference mSessionImpl;


/*
		static void access$000(Callback callback)
		{
			callback.handleMediaPlayPauseKeySingleTapIfPending();
		//    0    0:aload_0         
		//    1    1:invokespecial   #68  <Method void handleMediaPlayPauseKeySingleTapIfPending()>
			return;
		//    2    4:return          
		}

*/


/*
		static WeakReference access$100(Callback callback)
		{
			return callback.mSessionImpl;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field WeakReference mSessionImpl>
		//    2    4:areturn         
		}

*/


/*
		static void access$300(Callback callback, MediaSessionImpl mediasessionimpl, Handler handler)
		{
			callback.setSessionImpl(mediasessionimpl, handler);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #78  <Method void setSessionImpl(MediaSessionCompat$MediaSessionImpl, Handler)>
			return;
		//    4    6:return          
		}

*/

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
		//*   3    5:icmpne          15
				handleMediaPlayPauseKeySingleTapIfPending();
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field MediaSessionCompat$Callback this$0>
		//    6   12:invokestatic    #34  <Method void MediaSessionCompat$Callback.access$000(MediaSessionCompat$Callback)>
		//    7   15:return          
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
			Object obj = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			if(!s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) goto _L2; else goto _L1
		//    2    3:aload_1         
		//    3    4:ldc1            #31  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    4    6:invokevirtual   #37  <Method boolean String.equals(Object)>
		//    5    9:ifeq            77
_L1:
			s = ((String) ((MediaSessionImplApi21)mSessionImpl.get()));
		//    6   12:aload_0         
		//    7   13:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    8   16:invokestatic    #41  <Method WeakReference MediaSessionCompat$Callback.access$100(MediaSessionCompat$Callback)>
		//    9   19:invokevirtual   #47  <Method Object WeakReference.get()>
		//   10   22:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
		//   11   25:astore_1        
			if(s == null) goto _L4; else goto _L3
		//   12   26:aload_1         
		//   13   27:ifnull          301
_L3:
			bundle = new Bundle();
		//   14   30:new             #51  <Class Bundle>
		//   15   33:dup             
		//   16   34:invokespecial   #52  <Method void Bundle()>
		//   17   37:astore_2        
			s = ((String) (((MediaSessionImplApi21) (s)).getSessionToken().getExtraBinder()));
		//   18   38:aload_1         
		//   19   39:invokevirtual   #56  <Method MediaSessionCompat$Token MediaSessionCompat$MediaSessionImplApi21.getSessionToken()>
		//   20   42:invokevirtual   #62  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   21   45:astore_1        
			if(s == null)
		//*  22   46:aload_1         
		//*  23   47:ifnonnull       67
			{
				s = ((String) (obj));
		//   24   50:aload           5
		//   25   52:astore_1        
				break MISSING_BLOCK_LABEL_53;
			}
		//*  26   53:aload_2         
		//*  27   54:ldc1            #64  <String "android.support.v4.media.session.EXTRA_BINDER">
		//*  28   56:aload_1         
		//*  29   57:invokestatic    #70  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
		//*  30   60:aload_3         
		//*  31   61:iconst_0        
		//*  32   62:aload_2         
		//*  33   63:invokevirtual   #76  <Method void ResultReceiver.send(int, Bundle)>
		//*  34   66:return          
			s = ((String) (((IMediaSession) (s)).asBinder()));
		//   35   67:aload_1         
		//   36   68:invokeinterface #82  <Method IBinder IMediaSession.asBinder()>
		//   37   73:astore_1        
			  goto _L5
		//*  38   74:goto            53
_L2:
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM"))
		//*  39   77:aload_1         
		//*  40   78:ldc1            #84  <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//*  41   80:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  42   83:ifeq            122
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   43   86:aload_2         
		//   44   87:ldc1            #86  <Class MediaDescriptionCompat>
		//   45   89:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//   46   92:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   47   95:aload_0         
		//   48   96:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   49   99:aload_2         
		//   50  100:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   51  102:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   52  105:checkcast       #86  <Class MediaDescriptionCompat>
		//   53  108:invokevirtual   #106 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//   54  111:return          
			}
			break MISSING_BLOCK_LABEL_122;
_L5:
			try
			{
				BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((IBinder) (s)));
				resultreceiver.send(0, bundle);
				return;
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  55  112:astore_1        
			{
				Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
		//   56  113:ldc1            #108 <String "MediaSessionCompat">
		//   57  115:ldc1            #110 <String "Could not unparcel the extra data.">
		//   58  117:invokestatic    #116 <Method int Log.e(String, String)>
		//   59  120:pop             
			}
			return;
		//   60  121:return          
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"))
		//*  61  122:aload_1         
		//*  62  123:ldc1            #118 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//*  63  125:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  64  128:ifeq            163
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   65  131:aload_2         
		//   66  132:ldc1            #86  <Class MediaDescriptionCompat>
		//   67  134:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//   68  137:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
		//   69  140:aload_0         
		//   70  141:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   71  144:aload_2         
		//   72  145:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   73  147:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   74  150:checkcast       #86  <Class MediaDescriptionCompat>
		//   75  153:aload_2         
		//   76  154:ldc1            #120 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   77  156:invokevirtual   #124 <Method int Bundle.getInt(String)>
		//   78  159:invokevirtual   #127 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//   79  162:return          
			}
			if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"))
		//*  80  163:aload_1         
		//*  81  164:ldc1            #129 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//*  82  166:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  83  169:ifeq            198
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   84  172:aload_2         
		//   85  173:ldc1            #86  <Class MediaDescriptionCompat>
		//   86  175:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//   87  178:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				onRemoveQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   88  181:aload_0         
		//   89  182:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   90  185:aload_2         
		//   91  186:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   92  188:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   93  191:checkcast       #86  <Class MediaDescriptionCompat>
		//   94  194:invokevirtual   #132 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//   95  197:return          
			}
			if(!s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) goto _L7; else goto _L6
		//   96  198:aload_1         
		//   97  199:ldc1            #134 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT">
		//   98  201:invokevirtual   #37  <Method boolean String.equals(Object)>
		//   99  204:ifeq            291
_L6:
			s = ((String) ((MediaSessionImplApi21)mSessionImpl.get()));
		//  100  207:aload_0         
		//  101  208:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  102  211:invokestatic    #41  <Method WeakReference MediaSessionCompat$Callback.access$100(MediaSessionCompat$Callback)>
		//  103  214:invokevirtual   #47  <Method Object WeakReference.get()>
		//  104  217:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
		//  105  220:astore_1        
			if(s == null) goto _L4; else goto _L8
		//  106  221:aload_1         
		//  107  222:ifnull          301
_L8:
			if(((MediaSessionImplApi21) (s)).mQueue == null) goto _L4; else goto _L9
		//  108  225:aload_1         
		//  109  226:invokestatic    #138 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//  110  229:ifnull          301
_L9:
			int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
		//  111  232:aload_2         
		//  112  233:ldc1            #120 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//  113  235:iconst_m1       
		//  114  236:invokevirtual   #141 <Method int Bundle.getInt(String, int)>
		//  115  239:istore          4
			if(i < 0) goto _L11; else goto _L10
		//  116  241:iload           4
		//  117  243:iflt            302
_L10:
			if(i >= ((MediaSessionImplApi21) (s)).mQueue.size()) goto _L11; else goto _L12
		//  118  246:iload           4
		//  119  248:aload_1         
		//  120  249:invokestatic    #138 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//  121  252:invokeinterface #147 <Method int List.size()>
		//  122  257:icmpge          302
_L12:
			s = ((String) ((QueueItem)((MediaSessionImplApi21) (s)).mQueue.get(i)));
		//  123  260:aload_1         
		//  124  261:invokestatic    #138 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//  125  264:iload           4
		//  126  266:invokeinterface #150 <Method Object List.get(int)>
		//  127  271:checkcast       #152 <Class MediaSessionCompat$QueueItem>
		//  128  274:astore_1        
_L15:
			if(s == null) goto _L4; else goto _L13
		//  129  275:aload_1         
		//  130  276:ifnull          301
_L13:
			onRemoveQueueItem(((QueueItem) (s)).getDescription());
		//  131  279:aload_0         
		//  132  280:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  133  283:aload_1         
		//  134  284:invokevirtual   #156 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//  135  287:invokevirtual   #132 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			return;
		//  136  290:return          
_L7:
			Callback.this.onCommand(s, bundle, resultreceiver);
		//  137  291:aload_0         
		//  138  292:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  139  295:aload_1         
		//  140  296:aload_2         
		//  141  297:aload_3         
		//  142  298:invokevirtual   #158 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
_L4:
			return;
		//  143  301:return          
_L11:
			s = null;
		//  144  302:aconst_null     
		//  145  303:astore_1        
			if(true) goto _L15; else goto _L14
		//  146  304:goto            275
_L14:
		}

		public void onCustomAction(String s, Bundle bundle)
		{
			if(s.equals("android.support.v4.media.session.action.PLAY_FROM_URI"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #162 <String "android.support.v4.media.session.action.PLAY_FROM_URI">
		//*   2    3:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*   3    6:ifeq            39
			{
				s = ((String) ((Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI")));
		//    4    9:aload_2         
		//    5   10:ldc1            #164 <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//    6   12:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//    7   15:checkcast       #166 <Class Uri>
		//    8   18:astore_1        
				bundle = (Bundle)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//    9   19:aload_2         
		//   10   20:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   11   22:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   12   25:checkcast       #51  <Class Bundle>
		//   13   28:astore_2        
				onPlayFromUri(((Uri) (s)), bundle);
		//   14   29:aload_0         
		//   15   30:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   16   33:aload_1         
		//   17   34:aload_2         
		//   18   35:invokevirtual   #172 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//   19   38:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE"))
		//*  20   39:aload_1         
		//*  21   40:ldc1            #174 <String "android.support.v4.media.session.action.PREPARE">
		//*  22   42:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  23   45:ifeq            56
			{
				onPrepare();
		//   24   48:aload_0         
		//   25   49:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   26   52:invokevirtual   #177 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//   27   55:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
		//*  28   56:aload_1         
		//*  29   57:ldc1            #179 <String "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID">
		//*  30   59:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  31   62:ifeq            89
			{
				s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
		//   32   65:aload_2         
		//   33   66:ldc1            #181 <String "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID">
		//   34   68:invokevirtual   #185 <Method String Bundle.getString(String)>
		//   35   71:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//   36   72:aload_2         
		//   37   73:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   38   75:invokevirtual   #189 <Method Bundle Bundle.getBundle(String)>
		//   39   78:astore_2        
				onPrepareFromMediaId(s, bundle);
		//   40   79:aload_0         
		//   41   80:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   42   83:aload_1         
		//   43   84:aload_2         
		//   44   85:invokevirtual   #192 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//   45   88:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
		//*  46   89:aload_1         
		//*  47   90:ldc1            #194 <String "android.support.v4.media.session.action.PREPARE_FROM_SEARCH">
		//*  48   92:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  49   95:ifeq            122
			{
				s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
		//   50   98:aload_2         
		//   51   99:ldc1            #196 <String "android.support.v4.media.session.action.ARGUMENT_QUERY">
		//   52  101:invokevirtual   #185 <Method String Bundle.getString(String)>
		//   53  104:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//   54  105:aload_2         
		//   55  106:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   56  108:invokevirtual   #189 <Method Bundle Bundle.getBundle(String)>
		//   57  111:astore_2        
				onPrepareFromSearch(s, bundle);
		//   58  112:aload_0         
		//   59  113:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   60  116:aload_1         
		//   61  117:aload_2         
		//   62  118:invokevirtual   #199 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//   63  121:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
		//*  64  122:aload_1         
		//*  65  123:ldc1            #201 <String "android.support.v4.media.session.action.PREPARE_FROM_URI">
		//*  66  125:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  67  128:ifeq            158
			{
				s = ((String) ((Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI")));
		//   68  131:aload_2         
		//   69  132:ldc1            #164 <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//   70  134:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   71  137:checkcast       #166 <Class Uri>
		//   72  140:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//   73  141:aload_2         
		//   74  142:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   75  144:invokevirtual   #189 <Method Bundle Bundle.getBundle(String)>
		//   76  147:astore_2        
				onPrepareFromUri(((Uri) (s)), bundle);
		//   77  148:aload_0         
		//   78  149:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   79  152:aload_1         
		//   80  153:aload_2         
		//   81  154:invokevirtual   #204 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//   82  157:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
		//*  83  158:aload_1         
		//*  84  159:ldc1            #206 <String "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED">
		//*  85  161:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  86  164:ifeq            185
			{
				boolean flag = bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
		//   87  167:aload_2         
		//   88  168:ldc1            #208 <String "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED">
		//   89  170:invokevirtual   #212 <Method boolean Bundle.getBoolean(String)>
		//   90  173:istore          4
				onSetCaptioningEnabled(flag);
		//   91  175:aload_0         
		//   92  176:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   93  179:iload           4
		//   94  181:invokevirtual   #216 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
				return;
		//   95  184:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
		//*  96  185:aload_1         
		//*  97  186:ldc1            #218 <String "android.support.v4.media.session.action.SET_REPEAT_MODE">
		//*  98  188:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  99  191:ifeq            210
			{
				int i = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
		//  100  194:aload_2         
		//  101  195:ldc1            #220 <String "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE">
		//  102  197:invokevirtual   #124 <Method int Bundle.getInt(String)>
		//  103  200:istore_3        
				onSetRepeatMode(i);
		//  104  201:aload_0         
		//  105  202:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  106  205:iload_3         
		//  107  206:invokevirtual   #224 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
				return;
		//  108  209:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED"))
		//* 109  210:aload_1         
		//* 110  211:ldc1            #226 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED">
		//* 111  213:invokevirtual   #37  <Method boolean String.equals(Object)>
		//* 112  216:ifeq            237
			{
				boolean flag1 = bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED");
		//  113  219:aload_2         
		//  114  220:ldc1            #228 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED">
		//  115  222:invokevirtual   #212 <Method boolean Bundle.getBoolean(String)>
		//  116  225:istore          4
				onSetShuffleModeEnabled(flag1);
		//  117  227:aload_0         
		//  118  228:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  119  231:iload           4
		//  120  233:invokevirtual   #231 <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
				return;
		//  121  236:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
		//* 122  237:aload_1         
		//* 123  238:ldc1            #233 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE">
		//* 124  240:invokevirtual   #37  <Method boolean String.equals(Object)>
		//* 125  243:ifeq            262
			{
				int j = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
		//  126  246:aload_2         
		//  127  247:ldc1            #235 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE">
		//  128  249:invokevirtual   #124 <Method int Bundle.getInt(String)>
		//  129  252:istore_3        
				onSetShuffleMode(j);
		//  130  253:aload_0         
		//  131  254:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  132  257:iload_3         
		//  133  258:invokevirtual   #238 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
				return;
		//  134  261:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_RATING"))
		//* 135  262:aload_1         
		//* 136  263:ldc1            #240 <String "android.support.v4.media.session.action.SET_RATING">
		//* 137  265:invokevirtual   #37  <Method boolean String.equals(Object)>
		//* 138  268:ifeq            307
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/RatingCompat)).getClassLoader());
		//  139  271:aload_2         
		//  140  272:ldc1            #242 <Class RatingCompat>
		//  141  274:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//  142  277:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				s = ((String) ((RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING")));
		//  143  280:aload_2         
		//  144  281:ldc1            #244 <String "android.support.v4.media.session.action.ARGUMENT_RATING">
		//  145  283:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//  146  286:checkcast       #242 <Class RatingCompat>
		//  147  289:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//  148  290:aload_2         
		//  149  291:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//  150  293:invokevirtual   #189 <Method Bundle Bundle.getBundle(String)>
		//  151  296:astore_2        
				Callback.this.onSetRating(((RatingCompat) (s)), bundle);
		//  152  297:aload_0         
		//  153  298:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  154  301:aload_1         
		//  155  302:aload_2         
		//  156  303:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//  157  306:return          
			} else
			{
				Callback.this.onCustomAction(s, bundle);
		//  158  307:aload_0         
		//  159  308:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  160  311:aload_1         
		//  161  312:aload_2         
		//  162  313:invokevirtual   #250 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  163  316:return          
			}
		}

		public void onFastForward()
		{
			Callback.this.onFastForward();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #253 <Method void MediaSessionCompat$Callback.onFastForward()>
		//    3    7:return          
		}

		public boolean onMediaButtonEvent(Intent intent)
		{
			return Callback.this.onMediaButtonEvent(intent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #257 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//    4    8:ireturn         
		}

		public void onPause()
		{
			Callback.this.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onPause()>
		//    3    7:return          
		}

		public void onPlay()
		{
			Callback.this.onPlay();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #263 <Method void MediaSessionCompat$Callback.onPlay()>
		//    3    7:return          
		}

		public void onPlayFromMediaId(String s, Bundle bundle)
		{
			Callback.this.onPlayFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #266 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPlayFromSearch(String s, Bundle bundle)
		{
			Callback.this.onPlayFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #269 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onRewind()
		{
			Callback.this.onRewind();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #272 <Method void MediaSessionCompat$Callback.onRewind()>
		//    3    7:return          
		}

		public void onSeekTo(long l)
		{
			Callback.this.onSeekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #276 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
		//    4    8:return          
		}

		public void onSetRating(Object obj)
		{
			Callback.this.onSetRating(RatingCompat.fromRating(obj));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #281 <Method RatingCompat RatingCompat.fromRating(Object)>
		//    4    8:invokevirtual   #284 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
		//    5   11:return          
		}

		public void onSetRating(Object obj, Bundle bundle)
		{
			Callback.this.onSetRating(RatingCompat.fromRating(obj), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #281 <Method RatingCompat RatingCompat.fromRating(Object)>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
		//    6   12:return          
		}

		public void onSkipToNext()
		{
			Callback.this.onSkipToNext();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #288 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		//    3    7:return          
		}

		public void onSkipToPrevious()
		{
			Callback.this.onSkipToPrevious();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #291 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		//    3    7:return          
		}

		public void onSkipToQueueItem(long l)
		{
			Callback.this.onSkipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #294 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
		//    4    8:return          
		}

		public void onStop()
		{
			Callback.this.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #297 <Method void MediaSessionCompat$Callback.onStop()>
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

		public abstract void setShuffleModeEnabled(boolean flag);
	}

	static class MediaSessionImplApi18 extends MediaSessionImplBase
	{

		int getRccTransportControlFlagsFromActions(long l)
		{
			int j = super.getRccTransportControlFlagsFromActions(l);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokespecial   #27  <Method int MediaSessionCompat$MediaSessionImplBase.getRccTransportControlFlagsFromActions(long)>
		//    3    5:istore          4
			int i = j;
		//    4    7:iload           4
		//    5    9:istore_3        
			if((256L & l) != 0L)
		//*   6   10:ldc2w           #28  <Long 256L>
		//*   7   13:lload_1         
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
			if(sIsMbrPendingIntentSupported)
		//*   0    0:getstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
		//*   1    3:ifeq            14
				try
				{
					mAudioManager.registerMediaButtonEventReceiver(pendingintent);
		//    2    6:aload_0         
		//    3    7:getfield        #37  <Field AudioManager mAudioManager>
		//    4   10:aload_1         
		//    5   11:invokevirtual   #42  <Method void AudioManager.registerMediaButtonEventReceiver(PendingIntent)>
				}
		//*   6   14:getstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
		//*   7   17:ifne            26
		//*   8   20:aload_0         
		//*   9   21:aload_1         
		//*  10   22:aload_2         
		//*  11   23:invokespecial   #44  <Method void MediaSessionCompat$MediaSessionImplBase.registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
		//*  12   26:return          
				catch(NullPointerException nullpointerexception)
		//*  13   27:astore_3        
				{
					Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
		//   14   28:ldc1            #46  <String "MediaSessionCompat">
		//   15   30:ldc1            #48  <String "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.">
		//   16   32:invokestatic    #54  <Method int Log.w(String, String)>
		//   17   35:pop             
					sIsMbrPendingIntentSupported = false;
		//   18   36:iconst_0        
		//   19   37:putstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
				}
			if(!sIsMbrPendingIntentSupported)
				super.registerMediaButtonEventReceiver(pendingintent, componentname);
		//*  20   40:goto            14
		}

		public void setCallback(Callback callback, Handler handler)
		{
			super.setCallback(callback, handler);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #58  <Method void MediaSessionCompat$MediaSessionImplBase.setCallback(MediaSessionCompat$Callback, Handler)>
			if(callback == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       19
			{
				mRcc.setPlaybackPositionUpdateListener(((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener) (null)));
		//    6   10:aload_0         
		//    7   11:getfield        #62  <Field RemoteControlClient mRcc>
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #68  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
				return;
		//   10   18:return          
			} else
			{
				callback = ((Callback) (new android.media.RemoteControlClient.OnPlaybackPositionUpdateListener() {

					public void onPlaybackPositionUpdate(long l)
					{
						postToHandler(18, ((Object) (Long.valueOf(l))));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field MediaSessionCompat$MediaSessionImplApi18 this$0>
					//    2    4:bipush          18
					//    3    6:lload_1         
					//    4    7:invokestatic    #32  <Method Long Long.valueOf(long)>
					//    5   10:invokevirtual   #36  <Method void MediaSessionCompat$MediaSessionImplApi18.postToHandler(int, Object)>
					//    6   13:return          
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
		//   14   24:invokespecial   #71  <Method void MediaSessionCompat$MediaSessionImplApi18$1(MediaSessionCompat$MediaSessionImplApi18)>
		//   15   27:astore_1        
				mRcc.setPlaybackPositionUpdateListener(((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener) (callback)));
		//   16   28:aload_0         
		//   17   29:getfield        #62  <Field RemoteControlClient mRcc>
		//   18   32:aload_1         
		//   19   33:invokevirtual   #68  <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
				return;
		//   20   36:return          
			}
		}

		void setRccState(PlaybackStateCompat playbackstatecompat)
		{
			long l = 0L;
		//    0    0:lconst_0        
		//    1    1:lstore_3        
			long l1 = playbackstatecompat.getPosition();
		//    2    2:aload_1         
		//    3    3:invokevirtual   #79  <Method long PlaybackStateCompat.getPosition()>
		//    4    6:lstore          5
			float f = playbackstatecompat.getPlaybackSpeed();
		//    5    8:aload_1         
		//    6    9:invokevirtual   #83  <Method float PlaybackStateCompat.getPlaybackSpeed()>
		//    7   12:fstore_2        
			long l2 = playbackstatecompat.getLastPositionUpdateTime();
		//    8   13:aload_1         
		//    9   14:invokevirtual   #86  <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
		//   10   17:lstore          7
			long l3 = SystemClock.elapsedRealtime();
		//   11   19:invokestatic    #91  <Method long SystemClock.elapsedRealtime()>
		//   12   22:lstore          9
			if(playbackstatecompat.getState() == 3 && l1 > 0L)
		//*  13   24:aload_1         
		//*  14   25:invokevirtual   #95  <Method int PlaybackStateCompat.getState()>
		//*  15   28:iconst_3        
		//*  16   29:icmpne          101
		//*  17   32:lload           5
		//*  18   34:lconst_0        
		//*  19   35:lcmp            
		//*  20   36:ifle            101
			{
				if(l2 > 0L)
		//*  21   39:lload           7
		//*  22   41:lconst_0        
		//*  23   42:lcmp            
		//*  24   43:ifle            78
				{
					l2 = l3 - l2;
		//   25   46:lload           9
		//   26   48:lload           7
		//   27   50:lsub            
		//   28   51:lstore          7
					l = l2;
		//   29   53:lload           7
		//   30   55:lstore_3        
					if(f > 0.0F)
		//*  31   56:fload_2         
		//*  32   57:fconst_0        
		//*  33   58:fcmpl           
		//*  34   59:ifle            78
					{
						l = l2;
		//   35   62:lload           7
		//   36   64:lstore_3        
						if(f != 1.0F)
		//*  37   65:fload_2         
		//*  38   66:fconst_1        
		//*  39   67:fcmpl           
		//*  40   68:ifeq            78
							l = (long)((float)l2 * f);
		//   41   71:lload           7
		//   42   73:l2f             
		//   43   74:fload_2         
		//   44   75:fmul            
		//   45   76:f2l             
		//   46   77:lstore_3        
					}
				}
				l += l1;
		//   47   78:lload_3         
		//   48   79:lload           5
		//   49   81:ladd            
		//   50   82:lstore_3        
			} else
		//*  51   83:aload_0         
		//*  52   84:getfield        #62  <Field RemoteControlClient mRcc>
		//*  53   87:aload_0         
		//*  54   88:aload_1         
		//*  55   89:invokevirtual   #95  <Method int PlaybackStateCompat.getState()>
		//*  56   92:invokevirtual   #99  <Method int getRccStateFromState(int)>
		//*  57   95:lload_3         
		//*  58   96:fload_2         
		//*  59   97:invokevirtual   #103 <Method void RemoteControlClient.setPlaybackState(int, long, float)>
		//*  60  100:return          
			{
				l = l1;
		//   61  101:lload           5
		//   62  103:lstore_3        
			}
			mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()), l, f);
		//*  63  104:goto            83
		}

		void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			if(sIsMbrPendingIntentSupported)
		//*   0    0:getstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
		//*   1    3:ifeq            15
			{
				mAudioManager.unregisterMediaButtonEventReceiver(pendingintent);
		//    2    6:aload_0         
		//    3    7:getfield        #37  <Field AudioManager mAudioManager>
		//    4   10:aload_1         
		//    5   11:invokevirtual   #106 <Method void AudioManager.unregisterMediaButtonEventReceiver(PendingIntent)>
				return;
		//    6   14:return          
			} else
			{
				super.unregisterMediaButtonEventReceiver(pendingintent, componentname);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:aload_2         
		//   10   18:invokespecial   #108 <Method void MediaSessionCompat$MediaSessionImplBase.unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				return;
		//   11   21:return          
			}
		}

		private static boolean sIsMbrPendingIntentSupported = true;

		static 
		{
		//    0    0:iconst_1        
		//    1    1:putstatic       #18  <Field boolean sIsMbrPendingIntentSupported>
		//*   2    4:return          
		}

		MediaSessionImplApi18(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
		{
			super(context, s, componentname, pendingintent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #23  <Method void MediaSessionCompat$MediaSessionImplBase(Context, String, ComponentName, PendingIntent)>
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
		//*   6   11:ifnonnull       40
				l = 0L;
		//    7   14:lconst_0        
		//    8   15:lstore_2        
			else
		//*   9   16:lload_2         
		//*  10   17:ldc2w           #26  <Long 128L>
		//*  11   20:land            
		//*  12   21:lconst_0        
		//*  13   22:lcmp            
		//*  14   23:ifeq            33
		//*  15   26:aload           4
		//*  16   28:ldc1            #28  <Int 0x10000001>
		//*  17   30:invokevirtual   #34  <Method void android.media.RemoteControlClient$MetadataEditor.addEditableKey(int)>
		//*  18   33:aload_1         
		//*  19   34:ifnonnull       51
		//*  20   37:aload           4
		//*  21   39:areturn         
				l = mState.getActions();
		//   22   40:aload_0         
		//   23   41:getfield        #25  <Field PlaybackStateCompat mState>
		//   24   44:invokevirtual   #40  <Method long PlaybackStateCompat.getActions()>
		//   25   47:lstore_2        
			if((l & 128L) != 0L)
				metadataeditor.addEditableKey(0x10000001);
			if(bundle != null)
		//*  26   48:goto            16
			{
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
		//*  52  103:ifeq            37
				{
					((MediaMetadataEditor) (metadataeditor)).putObject(0x10000001, ((Object) (bundle.getParcelable("android.media.metadata.USER_RATING"))));
		//   53  106:aload           4
		//   54  108:ldc1            #28  <Int 0x10000001>
		//   55  110:aload_1         
		//   56  111:ldc1            #70  <String "android.media.metadata.USER_RATING">
		//   57  113:invokevirtual   #62  <Method Parcelable Bundle.getParcelable(String)>
		//   58  116:invokevirtual   #68  <Method MediaMetadataEditor MediaMetadataEditor.putObject(int, Object)>
		//   59  119:pop             
					return metadataeditor;
		//   60  120:aload           4
		//   61  122:areturn         
				}
			}
			return metadataeditor;
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
			if((128L & l) != 0L)
		//*   6   10:ldc2w           #26  <Long 128L>
		//*   7   13:lload_1         
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
					//*   2    3:icmpne          26
					//*   3    6:aload_2         
					//*   4    7:instanceof      #29  <Class Rating>
					//*   5   10:ifeq            26
							postToHandler(19, ((Object) (RatingCompat.fromRating(obj))));
					//    6   13:aload_0         
					//    7   14:getfield        #20  <Field MediaSessionCompat$MediaSessionImplApi19 this$0>
					//    8   17:bipush          19
					//    9   19:aload_2         
					//   10   20:invokestatic    #35  <Method RatingCompat RatingCompat.fromRating(Object)>
					//   11   23:invokevirtual   #38  <Method void MediaSessionCompat$MediaSessionImplApi19.postToHandler(int, Object)>
					//   12   26:return          
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
		//*   0    0:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmpge          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			else
				return MediaSessionCompatApi24.getCallingPackage(mSessionObj);
		//    5   10:aload_0         
		//    6   11:getfield        #57  <Field Object mSessionObj>
		//    7   14:invokestatic    #105 <Method String MediaSessionCompatApi24.getCallingPackage(Object)>
		//    8   17:areturn         
		}

		public Object getMediaSession()
		{
			return mSessionObj;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			return mPlaybackState;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field PlaybackStateCompat mPlaybackState>
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
		//    1    1:getfield        #71  <Field MediaSessionCompat$Token mToken>
		//    2    4:areturn         
		}

		public boolean isActive()
		{
			return MediaSessionCompatApi21.isActive(mSessionObj);
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:invokestatic    #116 <Method boolean MediaSessionCompatApi21.isActive(Object)>
		//    3    7:ireturn         
		}

		public void release()
		{
			mDestroyed = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #44  <Field boolean mDestroyed>
			MediaSessionCompatApi21.release(mSessionObj);
		//    3    5:aload_0         
		//    4    6:getfield        #57  <Field Object mSessionObj>
		//    5    9:invokestatic    #119 <Method void MediaSessionCompatApi21.release(Object)>
		//    6   12:return          
		}

		public void sendSessionEvent(String s, Bundle bundle)
		{
			if(android.os.Build.VERSION.SDK_INT < 23)
		//*   0    0:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          23
		//*   2    5:icmpge          58
			{
				int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    3    8:aload_0         
		//    4    9:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    5   12:invokevirtual   #127 <Method int RemoteCallbackList.beginBroadcast()>
		//    6   15:iconst_1        
		//    7   16:isub            
		//    8   17:istore_3        
				while(i >= 0) 
		//*   9   18:iload_3         
		//*  10   19:iflt            51
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
		//   11   22:aload_0         
		//   12   23:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   13   26:iload_3         
		//   14   27:invokevirtual   #131 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   15   30:checkcast       #133 <Class IMediaControllerCallback>
		//   16   33:astore          4
					try
					{
						imediacontrollercallback.onEvent(s, bundle);
		//   17   35:aload           4
		//   18   37:aload_1         
		//   19   38:aload_2         
		//   20   39:invokeinterface #136 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
					}
		//*  21   44:iload_3         
		//*  22   45:iconst_1        
		//*  23   46:isub            
		//*  24   47:istore_3        
		//*  25   48:goto            18
		//*  26   51:aload_0         
		//*  27   52:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  28   55:invokevirtual   #139 <Method void RemoteCallbackList.finishBroadcast()>
		//*  29   58:aload_0         
		//*  30   59:getfield        #57  <Field Object mSessionObj>
		//*  31   62:aload_1         
		//*  32   63:aload_2         
		//*  33   64:invokestatic    #142 <Method void MediaSessionCompatApi21.sendSessionEvent(Object, String, Bundle)>
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
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #147 <Method void MediaSessionCompatApi21.setActive(Object, boolean)>
		//    4    8:return          
		}

		public void setCallback(Callback callback, Handler handler)
		{
			Object obj1 = mSessionObj;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:astore          4
			Object obj;
			if(callback == null)
		//*   3    6:aload_1         
		//*   4    7:ifnonnull       30
				obj = null;
		//    5   10:aconst_null     
		//    6   11:astore_3        
			else
		//*   7   12:aload           4
		//*   8   14:aload_3         
		//*   9   15:aload_2         
		//*  10   16:invokestatic    #152 <Method void MediaSessionCompatApi21.setCallback(Object, Object, Handler)>
		//*  11   19:aload_1         
		//*  12   20:ifnull          29
		//*  13   23:aload_1         
		//*  14   24:aload_0         
		//*  15   25:aload_2         
		//*  16   26:invokestatic    #158 <Method void MediaSessionCompat$Callback.access$300(MediaSessionCompat$Callback, MediaSessionCompat$MediaSessionImpl, Handler)>
		//*  17   29:return          
				obj = callback.mCallbackObj;
		//   18   30:aload_1         
		//   19   31:getfield        #161 <Field Object MediaSessionCompat$Callback.mCallbackObj>
		//   20   34:astore_3        
			MediaSessionCompatApi21.setCallback(obj1, obj, handler);
			if(callback != null)
				callback.setSessionImpl(((MediaSessionImpl) (this)), handler);
		//*  21   35:goto            12
		}

		public void setCaptioningEnabled(boolean flag)
		{
			if(mCaptioningEnabled != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #164 <Field boolean mCaptioningEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mCaptioningEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #164 <Field boolean mCaptioningEnabled>
				int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #127 <Method int RemoteCallbackList.beginBroadcast()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
				while(i >= 0) 
		//*  13   23:iload_2         
		//*  14   24:iflt            53
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
		//   15   27:aload_0         
		//   16   28:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #131 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #133 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onCaptioningEnabledChanged(flag);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #167 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #139 <Method void RemoteCallbackList.finishBroadcast()>
		//*  32   60:return          
					catch(RemoteException remoteexception) { }
		//   33   61:astore_3        
					i--;
				}
				mExtraControllerCallbacks.finishBroadcast();
			}
		//*  34   62:goto            46
		}

		public void setExtras(Bundle bundle)
		{
			MediaSessionCompatApi21.setExtras(mSessionObj, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #172 <Method void MediaSessionCompatApi21.setExtras(Object, Bundle)>
		//    4    8:return          
		}

		public void setFlags(int i)
		{
			MediaSessionCompatApi21.setFlags(mSessionObj, i);
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #177 <Method void MediaSessionCompatApi21.setFlags(Object, int)>
		//    4    8:return          
		}

		public void setMediaButtonReceiver(PendingIntent pendingintent)
		{
			MediaSessionCompatApi21.setMediaButtonReceiver(mSessionObj, pendingintent);
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #182 <Method void MediaSessionCompatApi21.setMediaButtonReceiver(Object, PendingIntent)>
		//    4    8:return          
		}

		public void setMetadata(MediaMetadataCompat mediametadatacompat)
		{
			mMetadata = mediametadatacompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #93  <Field MediaMetadataCompat mMetadata>
			Object obj = mSessionObj;
		//    3    5:aload_0         
		//    4    6:getfield        #57  <Field Object mSessionObj>
		//    5    9:astore_2        
			if(mediametadatacompat == null)
		//*   6   10:aload_1         
		//*   7   11:ifnonnull       22
				mediametadatacompat = null;
		//    8   14:aconst_null     
		//    9   15:astore_1        
			else
		//*  10   16:aload_2         
		//*  11   17:aload_1         
		//*  12   18:invokestatic    #187 <Method void MediaSessionCompatApi21.setMetadata(Object, Object)>
		//*  13   21:return          
				mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.getMediaMetadata()));
		//   14   22:aload_1         
		//   15   23:invokevirtual   #192 <Method Object MediaMetadataCompat.getMediaMetadata()>
		//   16   26:astore_1        
			MediaSessionCompatApi21.setMetadata(obj, ((Object) (mediametadatacompat)));
		//*  17   27:goto            16
		}

		public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
		{
			mPlaybackState = playbackstatecompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #89  <Field PlaybackStateCompat mPlaybackState>
			int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    3    5:aload_0         
		//    4    6:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    5    9:invokevirtual   #127 <Method int RemoteCallbackList.beginBroadcast()>
		//    6   12:iconst_1        
		//    7   13:isub            
		//    8   14:istore_2        
			while(i >= 0) 
		//*   9   15:iload_2         
		//*  10   16:iflt            45
			{
				Object obj = ((Object) ((IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i)));
		//   11   19:aload_0         
		//   12   20:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   13   23:iload_2         
		//   14   24:invokevirtual   #131 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   15   27:checkcast       #133 <Class IMediaControllerCallback>
		//   16   30:astore_3        
				try
				{
					((IMediaControllerCallback) (obj)).onPlaybackStateChanged(playbackstatecompat);
		//   17   31:aload_3         
		//   18   32:aload_1         
		//   19   33:invokeinterface #197 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
				}
		//*  20   38:iload_2         
		//*  21   39:iconst_1        
		//*  22   40:isub            
		//*  23   41:istore_2        
		//*  24   42:goto            15
		//*  25   45:aload_0         
		//*  26   46:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  27   49:invokevirtual   #139 <Method void RemoteCallbackList.finishBroadcast()>
		//*  28   52:aload_0         
		//*  29   53:getfield        #57  <Field Object mSessionObj>
		//*  30   56:astore_3        
		//*  31   57:aload_1         
		//*  32   58:ifnonnull       69
		//*  33   61:aconst_null     
		//*  34   62:astore_1        
		//*  35   63:aload_3         
		//*  36   64:aload_1         
		//*  37   65:invokestatic    #199 <Method void MediaSessionCompatApi21.setPlaybackState(Object, Object)>
		//*  38   68:return          
		//*  39   69:aload_1         
		//*  40   70:invokevirtual   #203 <Method Object PlaybackStateCompat.getPlaybackState()>
		//*  41   73:astore_1        
		//*  42   74:goto            63
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
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #206 <Method void MediaSessionCompatApi21.setPlaybackToLocal(Object, int)>
		//    4    8:return          
		}

		public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
		{
			MediaSessionCompatApi21.setPlaybackToRemote(mSessionObj, volumeprovidercompat.getVolumeProvider());
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #213 <Method Object VolumeProviderCompat.getVolumeProvider()>
		//    4    8:invokestatic    #215 <Method void MediaSessionCompatApi21.setPlaybackToRemote(Object, Object)>
		//    5   11:return          
		}

		public void setQueue(List list)
		{
			mQueue = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #81  <Field List mQueue>
			ArrayList arraylist = null;
		//    3    5:aconst_null     
		//    4    6:astore_2        
			if(list != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          57
			{
				arraylist = new ArrayList();
		//    7   11:new             #219 <Class ArrayList>
		//    8   14:dup             
		//    9   15:invokespecial   #220 <Method void ArrayList()>
		//   10   18:astore_2        
				for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((QueueItem)((Iterator) (list)).next()).getQueueItem()));
		//   11   19:aload_1         
		//   12   20:invokeinterface #226 <Method Iterator List.iterator()>
		//   13   25:astore_1        
		//   14   26:aload_1         
		//   15   27:invokeinterface #231 <Method boolean Iterator.hasNext()>
		//   16   32:ifeq            57
		//   17   35:aload_2         
		//   18   36:aload_1         
		//   19   37:invokeinterface #234 <Method Object Iterator.next()>
		//   20   42:checkcast       #236 <Class MediaSessionCompat$QueueItem>
		//   21   45:invokevirtual   #239 <Method Object MediaSessionCompat$QueueItem.getQueueItem()>
		//   22   48:invokeinterface #242 <Method boolean List.add(Object)>
		//   23   53:pop             
			}
		//*  24   54:goto            26
			MediaSessionCompatApi21.setQueue(mSessionObj, ((List) (arraylist)));
		//   25   57:aload_0         
		//   26   58:getfield        #57  <Field Object mSessionObj>
		//   27   61:aload_2         
		//   28   62:invokestatic    #245 <Method void MediaSessionCompatApi21.setQueue(Object, List)>
		//   29   65:return          
		}

		public void setQueueTitle(CharSequence charsequence)
		{
			MediaSessionCompatApi21.setQueueTitle(mSessionObj, charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #252 <Method void MediaSessionCompatApi21.setQueueTitle(Object, CharSequence)>
		//    4    8:return          
		}

		public void setRatingType(int i)
		{
			if(android.os.Build.VERSION.SDK_INT < 22)
		//*   0    0:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          22
		//*   2    5:icmpge          14
			{
				mRatingType = i;
		//    3    8:aload_0         
		//    4    9:iload_1         
		//    5   10:putfield        #255 <Field int mRatingType>
				return;
		//    6   13:return          
			} else
			{
				MediaSessionCompatApi22.setRatingType(mSessionObj, i);
		//    7   14:aload_0         
		//    8   15:getfield        #57  <Field Object mSessionObj>
		//    9   18:iload_1         
		//   10   19:invokestatic    #259 <Method void MediaSessionCompatApi22.setRatingType(Object, int)>
				return;
		//   11   22:return          
			}
		}

		public void setRepeatMode(int i)
		{
			if(mRepeatMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #262 <Field int mRepeatMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mRepeatMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #262 <Field int mRepeatMode>
				int j = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #127 <Method int RemoteCallbackList.beginBroadcast()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
				while(j >= 0) 
		//*  13   23:iload_2         
		//*  14   24:iflt            53
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(j);
		//   15   27:aload_0         
		//   16   28:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #131 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #133 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onRepeatModeChanged(i);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #265 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #139 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #57  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #268 <Method void MediaSessionCompatApi21.setSessionActivity(Object, PendingIntent)>
		//    4    8:return          
		}

		public void setShuffleMode(int i)
		{
			if(mShuffleMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #271 <Field int mShuffleMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mShuffleMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #271 <Field int mShuffleMode>
				int j = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #127 <Method int RemoteCallbackList.beginBroadcast()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
				while(j >= 0) 
		//*  13   23:iload_2         
		//*  14   24:iflt            53
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(j);
		//   15   27:aload_0         
		//   16   28:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #131 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #133 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onShuffleModeChanged(i);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #274 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #139 <Method void RemoteCallbackList.finishBroadcast()>
		//*  32   60:return          
					catch(RemoteException remoteexception) { }
		//   33   61:astore_3        
					j--;
				}
				mExtraControllerCallbacks.finishBroadcast();
			}
		//*  34   62:goto            46
		}

		public void setShuffleModeEnabled(boolean flag)
		{
			if(mShuffleModeEnabled != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #277 <Field boolean mShuffleModeEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mShuffleModeEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #277 <Field boolean mShuffleModeEnabled>
				int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #127 <Method int RemoteCallbackList.beginBroadcast()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:istore_2        
				while(i >= 0) 
		//*  13   23:iload_2         
		//*  14   24:iflt            53
				{
					IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
		//   15   27:aload_0         
		//   16   28:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #131 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #133 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onShuffleModeChangedDeprecated(flag);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #280 <Method void IMediaControllerCallback.onShuffleModeChangedDeprecated(boolean)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #139 <Method void RemoteCallbackList.finishBroadcast()>
		//*  32   60:return          
					catch(RemoteException remoteexception) { }
		//   33   61:astore_3        
					i--;
				}
				mExtraControllerCallbacks.finishBroadcast();
			}
		//*  34   62:goto            46
		}

		boolean mCaptioningEnabled;
		private boolean mDestroyed;
		private final RemoteCallbackList mExtraControllerCallbacks;
		private MediaMetadataCompat mMetadata;
		private PlaybackStateCompat mPlaybackState;
		private List mQueue;
		int mRatingType;
		int mRepeatMode;
		private final Object mSessionObj;
		int mShuffleMode;
		boolean mShuffleModeEnabled;
		private final Token mToken;


/*
		static List access$200(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mQueue;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field List mQueue>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$600(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mDestroyed;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field boolean mDestroyed>
		//    2    4:ireturn         
		}

*/


/*
		static RemoteCallbackList access$700(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mExtraControllerCallbacks;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    2    4:areturn         
		}

*/


/*
		static PlaybackStateCompat access$800(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mPlaybackState;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field PlaybackStateCompat mPlaybackState>
		//    2    4:areturn         
		}

*/


/*
		static MediaMetadataCompat access$900(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mMetadata;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field MediaMetadataCompat mMetadata>
		//    2    4:areturn         
		}

*/

		public MediaSessionImplApi21(Context context, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			mDestroyed = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #44  <Field boolean mDestroyed>
			mExtraControllerCallbacks = new RemoteCallbackList();
		//    5    9:aload_0         
		//    6   10:new             #46  <Class RemoteCallbackList>
		//    7   13:dup             
		//    8   14:invokespecial   #47  <Method void RemoteCallbackList()>
		//    9   17:putfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
			mSessionObj = MediaSessionCompatApi21.createSession(context, s);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:invokestatic    #55  <Method Object MediaSessionCompatApi21.createSession(Context, String)>
		//   14   26:putfield        #57  <Field Object mSessionObj>
			mToken = new Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))), ((IMediaSession) (new ExtraSession())));
		//   15   29:aload_0         
		//   16   30:new             #59  <Class MediaSessionCompat$Token>
		//   17   33:dup             
		//   18   34:aload_0         
		//   19   35:getfield        #57  <Field Object mSessionObj>
		//   20   38:invokestatic    #63  <Method Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
		//   21   41:new             #11  <Class MediaSessionCompat$MediaSessionImplApi21$ExtraSession>
		//   22   44:dup             
		//   23   45:aload_0         
		//   24   46:invokespecial   #66  <Method void MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21)>
		//   25   49:invokespecial   #69  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
		//   26   52:putfield        #71  <Field MediaSessionCompat$Token mToken>
		//   27   55:return          
		}

		public MediaSessionImplApi21(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			mDestroyed = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #44  <Field boolean mDestroyed>
			mExtraControllerCallbacks = new RemoteCallbackList();
		//    5    9:aload_0         
		//    6   10:new             #46  <Class RemoteCallbackList>
		//    7   13:dup             
		//    8   14:invokespecial   #47  <Method void RemoteCallbackList()>
		//    9   17:putfield        #49  <Field RemoteCallbackList mExtraControllerCallbacks>
			mSessionObj = MediaSessionCompatApi21.verifySession(obj);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #77  <Method Object MediaSessionCompatApi21.verifySession(Object)>
		//   13   25:putfield        #57  <Field Object mSessionObj>
			mToken = new Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))), ((IMediaSession) (new ExtraSession())));
		//   14   28:aload_0         
		//   15   29:new             #59  <Class MediaSessionCompat$Token>
		//   16   32:dup             
		//   17   33:aload_0         
		//   18   34:getfield        #57  <Field Object mSessionObj>
		//   19   37:invokestatic    #63  <Method Parcelable MediaSessionCompatApi21.getSessionToken(Object)>
		//   20   40:new             #11  <Class MediaSessionCompat$MediaSessionImplApi21$ExtraSession>
		//   21   43:dup             
		//   22   44:aload_0         
		//   23   45:invokespecial   #66  <Method void MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat$MediaSessionImplApi21)>
		//   24   48:invokespecial   #69  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
		//   25   51:putfield        #71  <Field MediaSessionCompat$Token mToken>
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
		//    2    4:invokestatic    #49  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImplApi21.access$800(MediaSessionCompat$MediaSessionImplApi21)>
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    5   11:invokestatic    #53  <Method MediaMetadataCompat MediaSessionCompat$MediaSessionImplApi21.access$900(MediaSessionCompat$MediaSessionImplApi21)>
		//    6   14:invokestatic    #57  <Method PlaybackStateCompat MediaSessionCompat.access$500(PlaybackStateCompat, MediaMetadataCompat)>
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

		public boolean isShuffleModeEnabledDeprecated()
		{
			return mShuffleModeEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    2    4:getfield        #90  <Field boolean MediaSessionCompat$MediaSessionImplApi21.mShuffleModeEnabled>
		//    3    7:ireturn         
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
		//*   2    4:invokestatic    #114 <Method boolean MediaSessionCompat$MediaSessionImplApi21.access$600(MediaSessionCompat$MediaSessionImplApi21)>
		//*   3    7:ifne            22
				mExtraControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)));
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    6   14:invokestatic    #118 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #124 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
		//    9   21:pop             
		//   10   22:return          
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

		public void setShuffleModeEnabledDeprecated(boolean flag)
			throws RemoteException
		{
			throw new AssertionError();
		//    0    0:new             #24  <Class AssertionError>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void AssertionError()>
		//    3    7:athrow          
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
		//    2    4:invokestatic    #118 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #147 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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

	static class MediaSessionImplBase
		implements MediaSessionImpl
	{

		private void sendCaptioningEnabled(boolean flag)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onCaptioningEnabledChanged(flag);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #177 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_3        
			while(i >= 0) 
		//*   6   10:iload_3         
		//*   7   11:iflt            43
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_3         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore          4
				try
				{
					imediacontrollercallback.onEvent(s, bundle);
		//   14   27:aload           4
		//   15   29:aload_1         
		//   16   30:aload_2         
		//   17   31:invokeinterface #185 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
				}
		//*  18   36:iload_3         
		//*  19   37:iconst_1        
		//*  20   38:isub            
		//*  21   39:istore_3        
		//*  22   40:goto            10
		//*  23   43:aload_0         
		//*  24   44:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  25   47:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onExtrasChanged(bundle);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #190 <Method void IMediaControllerCallback.onExtrasChanged(Bundle)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onMetadataChanged(mediametadatacompat);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #195 <Method void IMediaControllerCallback.onMetadataChanged(MediaMetadataCompat)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onQueueChanged(list);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #200 <Method void IMediaControllerCallback.onQueueChanged(List)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onQueueTitleChanged(charsequence);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #207 <Method void IMediaControllerCallback.onQueueTitleChanged(CharSequence)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(j >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onRepeatModeChanged(i);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #212 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_1        
			while(i >= 0) 
		//*   6   10:iload_1         
		//*   7   11:iflt            39
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_1         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_2        
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//   14   26:aload_2         
		//   15   27:invokeinterface #216 <Method void IMediaControllerCallback.onSessionDestroyed()>
				}
		//*  16   32:iload_1         
		//*  17   33:iconst_1        
		//*  18   34:isub            
		//*  19   35:istore_1        
		//*  20   36:goto            10
		//*  21   39:aload_0         
		//*  22   40:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  23   43:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
		//*  24   46:aload_0         
		//*  25   47:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  26   50:invokevirtual   #219 <Method void RemoteCallbackList.kill()>
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
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(j >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onShuffleModeChanged(i);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #223 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				j--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendShuffleModeEnabled(boolean flag)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onShuffleModeChangedDeprecated(flag);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #227 <Method void IMediaControllerCallback.onShuffleModeChangedDeprecated(boolean)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
		//*  25   47:return          
				catch(RemoteException remoteexception) { }
		//   26   48:astore_3        
				i--;
			}
			mControllerCallbacks.finishBroadcast();
		//*  27   49:goto            33
		}

		private void sendState(PlaybackStateCompat playbackstatecompat)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #232 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
		//*   1    1:getfield        #150 <Field int mVolumeType>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          24
			{
				if(mVolumeProvider != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//*   6   12:ifnull          23
					mVolumeProvider.onAdjustVolume(i);
		//    7   15:aload_0         
		//    8   16:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//    9   19:iload_1         
		//   10   20:invokevirtual   #241 <Method void VolumeProviderCompat.onAdjustVolume(int)>
				return;
		//   11   23:return          
			} else
			{
				mAudioManager.adjustStreamVolume(mLocalStream, i, j);
		//   12   24:aload_0         
		//   13   25:getfield        #130 <Field AudioManager mAudioManager>
		//   14   28:aload_0         
		//   15   29:getfield        #152 <Field int mLocalStream>
		//   16   32:iload_1         
		//   17   33:iload_2         
		//   18   34:invokevirtual   #245 <Method void AudioManager.adjustStreamVolume(int, int, int)>
				return;
		//   19   37:return          
			}
		}

		android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
		{
			android.media.RemoteControlClient.MetadataEditor metadataeditor;
			metadataeditor = mRcc.editMetadata(true);
		//    0    0:aload_0         
		//    1    1:getfield        #159 <Field RemoteControlClient mRcc>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #251 <Method android.media.RemoteControlClient$MetadataEditor RemoteControlClient.editMetadata(boolean)>
		//    4    8:astore          4
			if(bundle == null)
		//*   5   10:aload_1         
		//*   6   11:ifnonnull       17
				return metadataeditor;
		//    7   14:aload           4
		//    8   16:areturn         
			if(!bundle.containsKey("android.media.metadata.ART")) goto _L2; else goto _L1
		//    9   17:aload_1         
		//   10   18:ldc1            #253 <String "android.media.metadata.ART">
		//   11   20:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//   12   23:ifeq            383
_L1:
			Bitmap bitmap2 = (Bitmap)bundle.getParcelable("android.media.metadata.ART");
		//   13   26:aload_1         
		//   14   27:ldc1            #253 <String "android.media.metadata.ART">
		//   15   29:invokevirtual   #263 <Method Parcelable Bundle.getParcelable(String)>
		//   16   32:checkcast       #265 <Class Bitmap>
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
		//   24   44:invokevirtual   #269 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
		//   25   47:iconst_0        
		//   26   48:invokevirtual   #273 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
		//   27   51:astore_2        
			metadataeditor.putBitmap(100, bitmap);
		//   28   52:aload           4
		//   29   54:bipush          100
		//   30   56:aload_2         
		//   31   57:invokevirtual   #279 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
		//   32   60:pop             
_L4:
			if(bundle.containsKey("android.media.metadata.ALBUM"))
		//*  33   61:aload_1         
		//*  34   62:ldc2            #281 <String "android.media.metadata.ALBUM">
		//*  35   65:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//*  36   68:ifeq            85
				metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
		//   37   71:aload           4
		//   38   73:iconst_1        
		//   39   74:aload_1         
		//   40   75:ldc2            #281 <String "android.media.metadata.ALBUM">
		//   41   78:invokevirtual   #285 <Method String Bundle.getString(String)>
		//   42   81:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   43   84:pop             
			if(bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
		//*  44   85:aload_1         
		//*  45   86:ldc2            #291 <String "android.media.metadata.ALBUM_ARTIST">
		//*  46   89:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//*  47   92:ifeq            110
				metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
		//   48   95:aload           4
		//   49   97:bipush          13
		//   50   99:aload_1         
		//   51  100:ldc2            #291 <String "android.media.metadata.ALBUM_ARTIST">
		//   52  103:invokevirtual   #285 <Method String Bundle.getString(String)>
		//   53  106:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   54  109:pop             
			if(bundle.containsKey("android.media.metadata.ARTIST"))
		//*  55  110:aload_1         
		//*  56  111:ldc2            #293 <String "android.media.metadata.ARTIST">
		//*  57  114:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//*  58  117:ifeq            134
				metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
		//   59  120:aload           4
		//   60  122:iconst_2        
		//   61  123:aload_1         
		//   62  124:ldc2            #293 <String "android.media.metadata.ARTIST">
		//   63  127:invokevirtual   #285 <Method String Bundle.getString(String)>
		//   64  130:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   65  133:pop             
			if(bundle.containsKey("android.media.metadata.AUTHOR"))
		//*  66  134:aload_1         
		//*  67  135:ldc2            #295 <String "android.media.metadata.AUTHOR">
		//*  68  138:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//*  69  141:ifeq            158
				metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
		//   70  144:aload           4
		//   71  146:iconst_3        
		//   72  147:aload_1         
		//   73  148:ldc2            #295 <String "android.media.metadata.AUTHOR">
		//   74  151:invokevirtual   #285 <Method String Bundle.getString(String)>
		//   75  154:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   76  157:pop             
			if(bundle.containsKey("android.media.metadata.COMPILATION"))
		//*  77  158:aload_1         
		//*  78  159:ldc2            #297 <String "android.media.metadata.COMPILATION">
		//*  79  162:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//*  80  165:ifeq            183
				metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
		//   81  168:aload           4
		//   82  170:bipush          15
		//   83  172:aload_1         
		//   84  173:ldc2            #297 <String "android.media.metadata.COMPILATION">
		//   85  176:invokevirtual   #285 <Method String Bundle.getString(String)>
		//   86  179:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   87  182:pop             
			if(bundle.containsKey("android.media.metadata.COMPOSER"))
		//*  88  183:aload_1         
		//*  89  184:ldc2            #299 <String "android.media.metadata.COMPOSER">
		//*  90  187:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//*  91  190:ifeq            207
				metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
		//   92  193:aload           4
		//   93  195:iconst_4        
		//   94  196:aload_1         
		//   95  197:ldc2            #299 <String "android.media.metadata.COMPOSER">
		//   96  200:invokevirtual   #285 <Method String Bundle.getString(String)>
		//   97  203:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   98  206:pop             
			if(bundle.containsKey("android.media.metadata.DATE"))
		//*  99  207:aload_1         
		//* 100  208:ldc2            #301 <String "android.media.metadata.DATE">
		//* 101  211:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 102  214:ifeq            231
				metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
		//  103  217:aload           4
		//  104  219:iconst_5        
		//  105  220:aload_1         
		//  106  221:ldc2            #301 <String "android.media.metadata.DATE">
		//  107  224:invokevirtual   #285 <Method String Bundle.getString(String)>
		//  108  227:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  109  230:pop             
			if(bundle.containsKey("android.media.metadata.DISC_NUMBER"))
		//* 110  231:aload_1         
		//* 111  232:ldc2            #303 <String "android.media.metadata.DISC_NUMBER">
		//* 112  235:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 113  238:ifeq            256
				metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
		//  114  241:aload           4
		//  115  243:bipush          14
		//  116  245:aload_1         
		//  117  246:ldc2            #303 <String "android.media.metadata.DISC_NUMBER">
		//  118  249:invokevirtual   #307 <Method long Bundle.getLong(String)>
		//  119  252:invokevirtual   #311 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  120  255:pop             
			if(bundle.containsKey("android.media.metadata.DURATION"))
		//* 121  256:aload_1         
		//* 122  257:ldc2            #313 <String "android.media.metadata.DURATION">
		//* 123  260:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 124  263:ifeq            281
				metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
		//  125  266:aload           4
		//  126  268:bipush          9
		//  127  270:aload_1         
		//  128  271:ldc2            #313 <String "android.media.metadata.DURATION">
		//  129  274:invokevirtual   #307 <Method long Bundle.getLong(String)>
		//  130  277:invokevirtual   #311 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  131  280:pop             
			if(bundle.containsKey("android.media.metadata.GENRE"))
		//* 132  281:aload_1         
		//* 133  282:ldc2            #315 <String "android.media.metadata.GENRE">
		//* 134  285:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 135  288:ifeq            306
				metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
		//  136  291:aload           4
		//  137  293:bipush          6
		//  138  295:aload_1         
		//  139  296:ldc2            #315 <String "android.media.metadata.GENRE">
		//  140  299:invokevirtual   #285 <Method String Bundle.getString(String)>
		//  141  302:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  142  305:pop             
			if(bundle.containsKey("android.media.metadata.TITLE"))
		//* 143  306:aload_1         
		//* 144  307:ldc2            #317 <String "android.media.metadata.TITLE">
		//* 145  310:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 146  313:ifeq            331
				metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
		//  147  316:aload           4
		//  148  318:bipush          7
		//  149  320:aload_1         
		//  150  321:ldc2            #317 <String "android.media.metadata.TITLE">
		//  151  324:invokevirtual   #285 <Method String Bundle.getString(String)>
		//  152  327:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  153  330:pop             
			if(bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
		//* 154  331:aload_1         
		//* 155  332:ldc2            #319 <String "android.media.metadata.TRACK_NUMBER">
		//* 156  335:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 157  338:ifeq            355
				metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
		//  158  341:aload           4
		//  159  343:iconst_0        
		//  160  344:aload_1         
		//  161  345:ldc2            #319 <String "android.media.metadata.TRACK_NUMBER">
		//  162  348:invokevirtual   #307 <Method long Bundle.getLong(String)>
		//  163  351:invokevirtual   #311 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  164  354:pop             
			if(bundle.containsKey("android.media.metadata.WRITER"))
		//* 165  355:aload_1         
		//* 166  356:ldc2            #321 <String "android.media.metadata.WRITER">
		//* 167  359:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 168  362:ifeq            380
				metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
		//  169  365:aload           4
		//  170  367:bipush          11
		//  171  369:aload_1         
		//  172  370:ldc2            #321 <String "android.media.metadata.WRITER">
		//  173  373:invokevirtual   #285 <Method String Bundle.getString(String)>
		//  174  376:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  175  379:pop             
			return metadataeditor;
		//  176  380:aload           4
		//  177  382:areturn         
_L2:
			if(bundle.containsKey("android.media.metadata.ALBUM_ART"))
		//* 178  383:aload_1         
		//* 179  384:ldc2            #323 <String "android.media.metadata.ALBUM_ART">
		//* 180  387:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
		//* 181  390:ifeq            61
			{
				Bitmap bitmap3 = (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART");
		//  182  393:aload_1         
		//  183  394:ldc2            #323 <String "android.media.metadata.ALBUM_ART">
		//  184  397:invokevirtual   #263 <Method Parcelable Bundle.getParcelable(String)>
		//  185  400:checkcast       #265 <Class Bitmap>
		//  186  403:astore_3        
				Bitmap bitmap1 = bitmap3;
		//  187  404:aload_3         
		//  188  405:astore_2        
				if(bitmap3 != null)
		//* 189  406:aload_3         
		//* 190  407:ifnull          420
					bitmap1 = bitmap3.copy(bitmap3.getConfig(), false);
		//  191  410:aload_3         
		//  192  411:aload_3         
		//  193  412:invokevirtual   #269 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
		//  194  415:iconst_0        
		//  195  416:invokevirtual   #273 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
		//  196  419:astore_2        
				metadataeditor.putBitmap(100, bitmap1);
		//  197  420:aload           4
		//  198  422:bipush          100
		//  199  424:aload_2         
		//  200  425:invokevirtual   #279 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
		//  201  428:pop             
			}
			if(true) goto _L4; else goto _L3
		//  202  429:goto            61
_L3:
		}

		public String getCallingPackage()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
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
		//*   1    1:getfield        #85  <Field Object mLock>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				playbackstatecompat = mState;
		//    5    7:aload_0         
		//    6    8:getfield        #330 <Field PlaybackStateCompat mState>
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
		//		               0 74
		//		               1 88
		//		               2 76
		//		               3 78
		//		               4 72
		//		               5 80
		//		               6 66
		//		               7 69
		//		               8 66
		//		               9 82
		//		               10 85
		//		               11 85
			default:
				return -1;
		//    2   64:iconst_m1       
		//    3   65:ireturn         

			case 6: // '\006'
			case 8: // '\b'
				return 8;
		//    4   66:bipush          8
		//    5   68:ireturn         

			case 7: // '\007'
				return 9;
		//    6   69:bipush          9
		//    7   71:ireturn         

			case 4: // '\004'
				return 4;
		//    8   72:iconst_4        
		//    9   73:ireturn         

			case 0: // '\0'
				return 0;
		//   10   74:iconst_0        
		//   11   75:ireturn         

			case 2: // '\002'
				return 2;
		//   12   76:iconst_2        
		//   13   77:ireturn         

			case 3: // '\003'
				return 3;
		//   14   78:iconst_3        
		//   15   79:ireturn         

			case 5: // '\005'
				return 5;
		//   16   80:iconst_5        
		//   17   81:ireturn         

			case 9: // '\t'
				return 7;
		//   18   82:bipush          7
		//   19   84:ireturn         

			case 10: // '\n'
			case 11: // '\013'
				return 6;
		//   20   85:bipush          6
		//   21   87:ireturn         

			case 1: // '\001'
				return 1;
		//   22   88:iconst_1        
		//   23   89:ireturn         
			}
		}

		int getRccTransportControlFlagsFromActions(long l)
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore          4
			if((1L & l) != 0L)
		//*   2    3:lconst_1        
		//*   3    4:lload_1         
		//*   4    5:land            
		//*   5    6:lconst_0        
		//*   6    7:lcmp            
		//*   7    8:ifeq            15
				j = 32;
		//    8   11:bipush          32
		//    9   13:istore          4
			int i = j;
		//   10   15:iload           4
		//   11   17:istore_3        
			if((2L & l) != 0L)
		//*  12   18:ldc2w           #335 <Long 2L>
		//*  13   21:lload_1         
		//*  14   22:land            
		//*  15   23:lconst_0        
		//*  16   24:lcmp            
		//*  17   25:ifeq            34
				i = j | 0x10;
		//   18   28:iload           4
		//   19   30:bipush          16
		//   20   32:ior             
		//   21   33:istore_3        
			j = i;
		//   22   34:iload_3         
		//   23   35:istore          4
			if((4L & l) != 0L)
		//*  24   37:ldc2w           #337 <Long 4L>
		//*  25   40:lload_1         
		//*  26   41:land            
		//*  27   42:lconst_0        
		//*  28   43:lcmp            
		//*  29   44:ifeq            52
				j = i | 4;
		//   30   47:iload_3         
		//   31   48:iconst_4        
		//   32   49:ior             
		//   33   50:istore          4
			i = j;
		//   34   52:iload           4
		//   35   54:istore_3        
			if((8L & l) != 0L)
		//*  36   55:ldc2w           #339 <Long 8L>
		//*  37   58:lload_1         
		//*  38   59:land            
		//*  39   60:lconst_0        
		//*  40   61:lcmp            
		//*  41   62:ifeq            70
				i = j | 2;
		//   42   65:iload           4
		//   43   67:iconst_2        
		//   44   68:ior             
		//   45   69:istore_3        
			j = i;
		//   46   70:iload_3         
		//   47   71:istore          4
			if((16L & l) != 0L)
		//*  48   73:ldc2w           #341 <Long 16L>
		//*  49   76:lload_1         
		//*  50   77:land            
		//*  51   78:lconst_0        
		//*  52   79:lcmp            
		//*  53   80:ifeq            88
				j = i | 1;
		//   54   83:iload_3         
		//   55   84:iconst_1        
		//   56   85:ior             
		//   57   86:istore          4
			i = j;
		//   58   88:iload           4
		//   59   90:istore_3        
			if((32L & l) != 0L)
		//*  60   91:ldc2w           #343 <Long 32L>
		//*  61   94:lload_1         
		//*  62   95:land            
		//*  63   96:lconst_0        
		//*  64   97:lcmp            
		//*  65   98:ifeq            108
				i = j | 0x80;
		//   66  101:iload           4
		//   67  103:sipush          128
		//   68  106:ior             
		//   69  107:istore_3        
			j = i;
		//   70  108:iload_3         
		//   71  109:istore          4
			if((64L & l) != 0L)
		//*  72  111:ldc2w           #345 <Long 64L>
		//*  73  114:lload_1         
		//*  74  115:land            
		//*  75  116:lconst_0        
		//*  76  117:lcmp            
		//*  77  118:ifeq            127
				j = i | 0x40;
		//   78  121:iload_3         
		//   79  122:bipush          64
		//   80  124:ior             
		//   81  125:istore          4
			i = j;
		//   82  127:iload           4
		//   83  129:istore_3        
			if((512L & l) != 0L)
		//*  84  130:ldc2w           #347 <Long 512L>
		//*  85  133:lload_1         
		//*  86  134:land            
		//*  87  135:lconst_0        
		//*  88  136:lcmp            
		//*  89  137:ifeq            146
				i = j | 8;
		//   90  140:iload           4
		//   91  142:bipush          8
		//   92  144:ior             
		//   93  145:istore_3        
			return i;
		//   94  146:iload_3         
		//   95  147:ireturn         
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
		//    1    1:getfield        #146 <Field MediaSessionCompat$Token mToken>
		//    2    4:areturn         
		}

		public boolean isActive()
		{
			return mIsActive;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field boolean mIsActive>
		//    2    4:ireturn         
		}

		void postToHandler(int i)
		{
			postToHandler(i, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #357 <Method void postToHandler(int, Object)>
		//    4    6:return          
		}

		void postToHandler(int i, int j)
		{
			postToHandler(i, ((Object) (null)), j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:iload_2         
		//    4    4:invokevirtual   #360 <Method void postToHandler(int, Object, int)>
		//    5    7:return          
		}

		void postToHandler(int i, Object obj)
		{
			postToHandler(i, obj, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:invokevirtual   #363 <Method void postToHandler(int, Object, Bundle)>
		//    5    7:return          
		}

		void postToHandler(int i, Object obj, int j)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field Object mLock>
		//*   2    4:astore          4
		//*   3    6:aload           4
		//*   4    8:monitorenter    
			{
				if(mHandler != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//*   7   13:ifnull          26
					mHandler.post(i, obj, j);
		//    8   16:aload_0         
		//    9   17:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   10   20:iload_1         
		//   11   21:aload_2         
		//   12   22:iload_3         
		//   13   23:invokevirtual   #368 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, int)>
			}
		//   14   26:aload           4
		//   15   28:monitorexit     
			return;
		//   16   29:return          
			obj;
		//   17   30:astore_2        
			obj1;
		//   18   31:aload           4
			JVM INSTR monitorexit ;
		//   19   33:monitorexit     
			throw obj;
		//   20   34:aload_2         
		//   21   35:athrow          
		}

		void postToHandler(int i, Object obj, Bundle bundle)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field Object mLock>
		//*   2    4:astore          4
		//*   3    6:aload           4
		//*   4    8:monitorenter    
			{
				if(mHandler != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//*   7   13:ifnull          26
					mHandler.post(i, obj, bundle);
		//    8   16:aload_0         
		//    9   17:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   10   20:iload_1         
		//   11   21:aload_2         
		//   12   22:aload_3         
		//   13   23:invokevirtual   #370 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, Bundle)>
			}
		//   14   26:aload           4
		//   15   28:monitorexit     
			return;
		//   16   29:return          
			obj;
		//   17   30:astore_2        
			obj1;
		//   18   31:aload           4
			JVM INSTR monitorexit ;
		//   19   33:monitorexit     
			throw obj;
		//   20   34:aload_2         
		//   21   35:athrow          
		}

		void registerMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			mAudioManager.registerMediaButtonEventReceiver(componentname);
		//    0    0:aload_0         
		//    1    1:getfield        #130 <Field AudioManager mAudioManager>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #375 <Method void AudioManager.registerMediaButtonEventReceiver(ComponentName)>
		//    4    8:return          
		}

		public void release()
		{
			mIsActive = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #94  <Field boolean mIsActive>
			mDestroyed = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #92  <Field boolean mDestroyed>
			update();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #379 <Method boolean update()>
		//    8   14:pop             
			sendSessionDestroyed();
		//    9   15:aload_0         
		//   10   16:invokespecial   #381 <Method void sendSessionDestroyed()>
		//   11   19:return          
		}

		public void sendSessionEvent(String s, Bundle bundle)
		{
			sendEvent(s, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #384 <Method void sendEvent(String, Bundle)>
		//    4    6:return          
		}

		void sendVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #174 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onVolumeInfoChanged(parcelablevolumeinfo);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #389 <Method void IMediaControllerCallback.onVolumeInfoChanged(ParcelableVolumeInfo)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
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
			if(flag != mIsActive)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #94  <Field boolean mIsActive>
		//*   3    5:icmpne          9
		//*   4    8:return          
			{
				mIsActive = flag;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #94  <Field boolean mIsActive>
				if(update())
		//*   8   14:aload_0         
		//*   9   15:invokevirtual   #379 <Method boolean update()>
		//*  10   18:ifeq            8
				{
					setMetadata(mMetadata);
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #392 <Field MediaMetadataCompat mMetadata>
		//   14   26:invokevirtual   #395 <Method void setMetadata(MediaMetadataCompat)>
					setPlaybackState(mState);
		//   15   29:aload_0         
		//   16   30:aload_0         
		//   17   31:getfield        #330 <Field PlaybackStateCompat mState>
		//   18   34:invokevirtual   #398 <Method void setPlaybackState(PlaybackStateCompat)>
					return;
		//   19   37:return          
				}
			}
		}

		public void setCallback(Callback callback, Handler handler)
		{
			mCallback = callback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #402 <Field MediaSessionCompat$Callback mCallback>
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
		//    9   15:new             #404 <Class Handler>
		//   10   18:dup             
		//   11   19:invokespecial   #405 <Method void Handler()>
		//   12   22:astore_1        
				synchronized(mLock)
		//*  13   23:aload_0         
		//*  14   24:getfield        #85  <Field Object mLock>
		//*  15   27:astore_2        
		//*  16   28:aload_2         
		//*  17   29:monitorenter    
				{
					if(mHandler != null)
		//*  18   30:aload_0         
		//*  19   31:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//*  20   34:ifnull          45
						mHandler.removeCallbacksAndMessages(((Object) (null)));
		//   21   37:aload_0         
		//   22   38:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   23   41:aconst_null     
		//   24   42:invokevirtual   #408 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.removeCallbacksAndMessages(Object)>
					mHandler = new MessageHandler(((Handler) (callback)).getLooper());
		//   25   45:aload_0         
		//   26   46:new             #19  <Class MediaSessionCompat$MediaSessionImplBase$MessageHandler>
		//   27   49:dup             
		//   28   50:aload_0         
		//   29   51:aload_1         
		//   30   52:invokevirtual   #412 <Method Looper Handler.getLooper()>
		//   31   55:invokespecial   #415 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase, Looper)>
		//   32   58:putfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
					mCallback.setSessionImpl(((MediaSessionImpl) (this)), ((Handler) (callback)));
		//   33   61:aload_0         
		//   34   62:getfield        #402 <Field MediaSessionCompat$Callback mCallback>
		//   35   65:aload_0         
		//   36   66:aload_1         
		//   37   67:invokestatic    #421 <Method void MediaSessionCompat$Callback.access$300(MediaSessionCompat$Callback, MediaSessionCompat$MediaSessionImpl, Handler)>
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
		//*   1    1:getfield        #424 <Field boolean mCaptioningEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mCaptioningEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #424 <Field boolean mCaptioningEnabled>
				sendCaptioningEnabled(flag);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #426 <Method void sendCaptioningEnabled(boolean)>
			}
		//   10   18:return          
		}

		public void setExtras(Bundle bundle)
		{
			mExtras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #429 <Field Bundle mExtras>
			sendExtras(bundle);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #431 <Method void sendExtras(Bundle)>
		//    6   10:return          
		}

		public void setFlags(int i)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mFlags = i;
		//    5    7:aload_0         
		//    6    8:iload_1         
		//    7    9:putfield        #434 <Field int mFlags>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			update();
		//   10   14:aload_0         
		//   11   15:invokevirtual   #379 <Method boolean update()>
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
			obj = ((Object) (mediametadatacompat));
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(mediametadatacompat != null)
		//*   2    2:aload_1         
		//*   3    3:ifnull          21
				obj = ((Object) ((new android.support.v4.media.MediaMetadataCompat.Builder(mediametadatacompat, MediaSessionCompat.sMaxBitmapSize)).build()));
		//    4    6:new             #437 <Class android.support.v4.media.MediaMetadataCompat$Builder>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:getstatic       #440 <Field int MediaSessionCompat.sMaxBitmapSize>
		//    8   14:invokespecial   #443 <Method void android.support.v4.media.MediaMetadataCompat$Builder(MediaMetadataCompat, int)>
		//    9   17:invokevirtual   #447 <Method MediaMetadataCompat android.support.v4.media.MediaMetadataCompat$Builder.build()>
		//   10   20:astore_2        
			synchronized(mLock)
		//*  11   21:aload_0         
		//*  12   22:getfield        #85  <Field Object mLock>
		//*  13   25:astore_1        
		//*  14   26:aload_1         
		//*  15   27:monitorenter    
			{
				mMetadata = ((MediaMetadataCompat) (obj));
		//   16   28:aload_0         
		//   17   29:aload_2         
		//   18   30:putfield        #392 <Field MediaMetadataCompat mMetadata>
			}
		//   19   33:aload_1         
		//   20   34:monitorexit     
			sendMetadata(((MediaMetadataCompat) (obj)));
		//   21   35:aload_0         
		//   22   36:aload_2         
		//   23   37:invokespecial   #449 <Method void sendMetadata(MediaMetadataCompat)>
			if(!mIsActive)
		//*  24   40:aload_0         
		//*  25   41:getfield        #94  <Field boolean mIsActive>
		//*  26   44:ifne            53
				return;
		//   27   47:return          
			break MISSING_BLOCK_LABEL_53;
			obj;
		//   28   48:astore_2        
			mediametadatacompat;
		//   29   49:aload_1         
			JVM INSTR monitorexit ;
		//   30   50:monitorexit     
			throw obj;
		//   31   51:aload_2         
		//   32   52:athrow          
			if(obj == null)
		//*  33   53:aload_2         
		//*  34   54:ifnonnull       68
				mediametadatacompat = null;
		//   35   57:aconst_null     
		//   36   58:astore_1        
			else
		//*  37   59:aload_0         
		//*  38   60:aload_1         
		//*  39   61:invokevirtual   #451 <Method android.media.RemoteControlClient$MetadataEditor buildRccMetadata(Bundle)>
		//*  40   64:invokevirtual   #454 <Method void android.media.RemoteControlClient$MetadataEditor.apply()>
		//*  41   67:return          
				mediametadatacompat = ((MediaMetadataCompat) (((MediaMetadataCompat) (obj)).getBundle()));
		//   42   68:aload_2         
		//   43   69:invokevirtual   #460 <Method Bundle MediaMetadataCompat.getBundle()>
		//   44   72:astore_1        
			buildRccMetadata(((Bundle) (mediametadatacompat))).apply();
			return;
		//*  45   73:goto            59
		}

		public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mState = playbackstatecompat;
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:putfield        #330 <Field PlaybackStateCompat mState>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			sendState(playbackstatecompat);
		//   10   14:aload_0         
		//   11   15:aload_1         
		//   12   16:invokespecial   #462 <Method void sendState(PlaybackStateCompat)>
			if(!mIsActive)
		//*  13   19:aload_0         
		//*  14   20:getfield        #94  <Field boolean mIsActive>
		//*  15   23:ifne            32
				return;
		//   16   26:return          
			break MISSING_BLOCK_LABEL_32;
			playbackstatecompat;
		//   17   27:astore_1        
			obj;
		//   18   28:aload_2         
			JVM INSTR monitorexit ;
		//   19   29:monitorexit     
			throw playbackstatecompat;
		//   20   30:aload_1         
		//   21   31:athrow          
			if(playbackstatecompat == null)
		//*  22   32:aload_1         
		//*  23   33:ifnonnull       53
			{
				mRcc.setPlaybackState(0);
		//   24   36:aload_0         
		//   25   37:getfield        #159 <Field RemoteControlClient mRcc>
		//   26   40:iconst_0        
		//   27   41:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
				mRcc.setTransportControlFlags(0);
		//   28   44:aload_0         
		//   29   45:getfield        #159 <Field RemoteControlClient mRcc>
		//   30   48:iconst_0        
		//   31   49:invokevirtual   #467 <Method void RemoteControlClient.setTransportControlFlags(int)>
				return;
		//   32   52:return          
			} else
			{
				setRccState(playbackstatecompat);
		//   33   53:aload_0         
		//   34   54:aload_1         
		//   35   55:invokevirtual   #470 <Method void setRccState(PlaybackStateCompat)>
				mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackstatecompat.getActions()));
		//   36   58:aload_0         
		//   37   59:getfield        #159 <Field RemoteControlClient mRcc>
		//   38   62:aload_0         
		//   39   63:aload_1         
		//   40   64:invokevirtual   #476 <Method long PlaybackStateCompat.getActions()>
		//   41   67:invokevirtual   #478 <Method int getRccTransportControlFlagsFromActions(long)>
		//   42   70:invokevirtual   #467 <Method void RemoteControlClient.setTransportControlFlags(int)>
				return;
		//   43   73:return          
			}
		}

		public void setPlaybackToLocal(int i)
		{
			if(mVolumeProvider != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//*   2    4:ifnull          15
				mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
		//    3    7:aload_0         
		//    4    8:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//    5   11:aconst_null     
		//    6   12:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
			mVolumeType = 1;
		//    7   15:aload_0         
		//    8   16:iconst_1        
		//    9   17:putfield        #150 <Field int mVolumeType>
			sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, 2, mAudioManager.getStreamMaxVolume(mLocalStream), mAudioManager.getStreamVolume(mLocalStream)));
		//   10   20:aload_0         
		//   11   21:new             #484 <Class ParcelableVolumeInfo>
		//   12   24:dup             
		//   13   25:aload_0         
		//   14   26:getfield        #150 <Field int mVolumeType>
		//   15   29:aload_0         
		//   16   30:getfield        #152 <Field int mLocalStream>
		//   17   33:iconst_2        
		//   18   34:aload_0         
		//   19   35:getfield        #130 <Field AudioManager mAudioManager>
		//   20   38:aload_0         
		//   21   39:getfield        #152 <Field int mLocalStream>
		//   22   42:invokevirtual   #487 <Method int AudioManager.getStreamMaxVolume(int)>
		//   23   45:aload_0         
		//   24   46:getfield        #130 <Field AudioManager mAudioManager>
		//   25   49:aload_0         
		//   26   50:getfield        #152 <Field int mLocalStream>
		//   27   53:invokevirtual   #490 <Method int AudioManager.getStreamVolume(int)>
		//   28   56:invokespecial   #493 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   29   59:invokevirtual   #495 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
		//   30   62:return          
		}

		public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
		{
			if(volumeprovidercompat == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       15
				throw new IllegalArgumentException("volumeProvider may not be null");
		//    2    4:new             #105 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #499 <String "volumeProvider may not be null">
		//    5   11:invokespecial   #110 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			if(mVolumeProvider != null)
		//*   7   15:aload_0         
		//*   8   16:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//*   9   19:ifnull          30
				mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
		//   10   22:aload_0         
		//   11   23:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//   12   26:aconst_null     
		//   13   27:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
			mVolumeType = 2;
		//   14   30:aload_0         
		//   15   31:iconst_2        
		//   16   32:putfield        #150 <Field int mVolumeType>
			mVolumeProvider = volumeprovidercompat;
		//   17   35:aload_0         
		//   18   36:aload_1         
		//   19   37:putfield        #236 <Field VolumeProviderCompat mVolumeProvider>
			sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
		//   20   40:aload_0         
		//   21   41:new             #484 <Class ParcelableVolumeInfo>
		//   22   44:dup             
		//   23   45:aload_0         
		//   24   46:getfield        #150 <Field int mVolumeType>
		//   25   49:aload_0         
		//   26   50:getfield        #152 <Field int mLocalStream>
		//   27   53:aload_0         
		//   28   54:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//   29   57:invokevirtual   #502 <Method int VolumeProviderCompat.getVolumeControl()>
		//   30   60:aload_0         
		//   31   61:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//   32   64:invokevirtual   #505 <Method int VolumeProviderCompat.getMaxVolume()>
		//   33   67:aload_0         
		//   34   68:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//   35   71:invokevirtual   #508 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   36   74:invokespecial   #493 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   37   77:invokevirtual   #495 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
			volumeprovidercompat.setCallback(mVolumeCallback);
		//   38   80:aload_1         
		//   39   81:aload_0         
		//   40   82:getfield        #103 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
		//   41   85:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		//   42   88:return          
		}

		public void setQueue(List list)
		{
			mQueue = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #511 <Field List mQueue>
			sendQueue(list);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #513 <Method void sendQueue(List)>
		//    6   10:return          
		}

		public void setQueueTitle(CharSequence charsequence)
		{
			mQueueTitle = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #516 <Field CharSequence mQueueTitle>
			sendQueueTitle(charsequence);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #518 <Method void sendQueueTitle(CharSequence)>
		//    6   10:return          
		}

		public void setRatingType(int i)
		{
			mRatingType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #148 <Field int mRatingType>
		//    3    5:return          
		}

		void setRccState(PlaybackStateCompat playbackstatecompat)
		{
			mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()));
		//    0    0:aload_0         
		//    1    1:getfield        #159 <Field RemoteControlClient mRcc>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #522 <Method int PlaybackStateCompat.getState()>
		//    5    9:invokevirtual   #524 <Method int getRccStateFromState(int)>
		//    6   12:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
		//    7   15:return          
		}

		public void setRepeatMode(int i)
		{
			if(mRepeatMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #527 <Field int mRepeatMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mRepeatMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #527 <Field int mRepeatMode>
				sendRepeatMode(i);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #529 <Method void sendRepeatMode(int)>
			}
		//   10   18:return          
		}

		public void setSessionActivity(PendingIntent pendingintent)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #85  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mSessionActivity = pendingintent;
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:putfield        #532 <Field PendingIntent mSessionActivity>
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
		//*   1    1:getfield        #535 <Field int mShuffleMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mShuffleMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #535 <Field int mShuffleMode>
				sendShuffleMode(i);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #537 <Method void sendShuffleMode(int)>
			}
		//   10   18:return          
		}

		public void setShuffleModeEnabled(boolean flag)
		{
			if(mShuffleModeEnabled != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #540 <Field boolean mShuffleModeEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mShuffleModeEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #540 <Field boolean mShuffleModeEnabled>
				sendShuffleModeEnabled(flag);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #542 <Method void sendShuffleModeEnabled(boolean)>
			}
		//   10   18:return          
		}

		void setVolumeTo(int i, int j)
		{
			if(mVolumeType == 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #150 <Field int mVolumeType>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          24
			{
				if(mVolumeProvider != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//*   6   12:ifnull          23
					mVolumeProvider.onSetVolumeTo(i);
		//    7   15:aload_0         
		//    8   16:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		//    9   19:iload_1         
		//   10   20:invokevirtual   #546 <Method void VolumeProviderCompat.onSetVolumeTo(int)>
				return;
		//   11   23:return          
			} else
			{
				mAudioManager.setStreamVolume(mLocalStream, i, j);
		//   12   24:aload_0         
		//   13   25:getfield        #130 <Field AudioManager mAudioManager>
		//   14   28:aload_0         
		//   15   29:getfield        #152 <Field int mLocalStream>
		//   16   32:iload_1         
		//   17   33:iload_2         
		//   18   34:invokevirtual   #549 <Method void AudioManager.setStreamVolume(int, int, int)>
				return;
		//   19   37:return          
			}
		}

		void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			mAudioManager.unregisterMediaButtonEventReceiver(componentname);
		//    0    0:aload_0         
		//    1    1:getfield        #130 <Field AudioManager mAudioManager>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #552 <Method void AudioManager.unregisterMediaButtonEventReceiver(ComponentName)>
		//    4    8:return          
		}

		boolean update()
		{
			if(!mIsActive)
				break MISSING_BLOCK_LABEL_152;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field boolean mIsActive>
		//    2    4:ifeq            152
			if(mIsMbrRegistered || (mFlags & 1) == 0) goto _L2; else goto _L1
		//    3    7:aload_0         
		//    4    8:getfield        #96  <Field boolean mIsMbrRegistered>
		//    5   11:ifne            74
		//    6   14:aload_0         
		//    7   15:getfield        #434 <Field int mFlags>
		//    8   18:iconst_1        
		//    9   19:iand            
		//   10   20:ifeq            74
_L1:
			registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   11   23:aload_0         
		//   12   24:aload_0         
		//   13   25:getfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
		//   14   28:aload_0         
		//   15   29:getfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
		//   16   32:invokevirtual   #554 <Method void registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
			mIsMbrRegistered = true;
		//   17   35:aload_0         
		//   18   36:iconst_1        
		//   19   37:putfield        #96  <Field boolean mIsMbrRegistered>
_L4:
			if(!mIsRccRegistered && (mFlags & 2) != 0)
		//*  20   40:aload_0         
		//*  21   41:getfield        #98  <Field boolean mIsRccRegistered>
		//*  22   44:ifne            110
		//*  23   47:aload_0         
		//*  24   48:getfield        #434 <Field int mFlags>
		//*  25   51:iconst_2        
		//*  26   52:iand            
		//*  27   53:ifeq            110
			{
				mAudioManager.registerRemoteControlClient(mRcc);
		//   28   56:aload_0         
		//   29   57:getfield        #130 <Field AudioManager mAudioManager>
		//   30   60:aload_0         
		//   31   61:getfield        #159 <Field RemoteControlClient mRcc>
		//   32   64:invokevirtual   #558 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = true;
		//   33   67:aload_0         
		//   34   68:iconst_1        
		//   35   69:putfield        #98  <Field boolean mIsRccRegistered>
				return true;
		//   36   72:iconst_1        
		//   37   73:ireturn         
			}
			break; /* Loop/switch isn't completed */
_L2:
			if(mIsMbrRegistered && (mFlags & 1) == 0)
		//*  38   74:aload_0         
		//*  39   75:getfield        #96  <Field boolean mIsMbrRegistered>
		//*  40   78:ifeq            40
		//*  41   81:aload_0         
		//*  42   82:getfield        #434 <Field int mFlags>
		//*  43   85:iconst_1        
		//*  44   86:iand            
		//*  45   87:ifne            40
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   46   90:aload_0         
		//   47   91:aload_0         
		//   48   92:getfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
		//   49   95:aload_0         
		//   50   96:getfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
		//   51   99:invokevirtual   #560 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
		//   52  102:aload_0         
		//   53  103:iconst_0        
		//   54  104:putfield        #96  <Field boolean mIsMbrRegistered>
			}
			if(true) goto _L4; else goto _L3
		//   55  107:goto            40
_L3:
			if(mIsRccRegistered && (mFlags & 2) == 0)
		//*  56  110:aload_0         
		//*  57  111:getfield        #98  <Field boolean mIsRccRegistered>
		//*  58  114:ifeq            207
		//*  59  117:aload_0         
		//*  60  118:getfield        #434 <Field int mFlags>
		//*  61  121:iconst_2        
		//*  62  122:iand            
		//*  63  123:ifne            207
			{
				mRcc.setPlaybackState(0);
		//   64  126:aload_0         
		//   65  127:getfield        #159 <Field RemoteControlClient mRcc>
		//   66  130:iconst_0        
		//   67  131:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
		//   68  134:aload_0         
		//   69  135:getfield        #130 <Field AudioManager mAudioManager>
		//   70  138:aload_0         
		//   71  139:getfield        #159 <Field RemoteControlClient mRcc>
		//   72  142:invokevirtual   #563 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
		//   73  145:aload_0         
		//   74  146:iconst_0        
		//   75  147:putfield        #98  <Field boolean mIsRccRegistered>
				return false;
		//   76  150:iconst_0        
		//   77  151:ireturn         
			}
			break MISSING_BLOCK_LABEL_207;
			if(mIsMbrRegistered)
		//*  78  152:aload_0         
		//*  79  153:getfield        #96  <Field boolean mIsMbrRegistered>
		//*  80  156:ifeq            176
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   81  159:aload_0         
		//   82  160:aload_0         
		//   83  161:getfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
		//   84  164:aload_0         
		//   85  165:getfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
		//   86  168:invokevirtual   #560 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
		//   87  171:aload_0         
		//   88  172:iconst_0        
		//   89  173:putfield        #96  <Field boolean mIsMbrRegistered>
			}
			if(mIsRccRegistered)
		//*  90  176:aload_0         
		//*  91  177:getfield        #98  <Field boolean mIsRccRegistered>
		//*  92  180:ifeq            207
			{
				mRcc.setPlaybackState(0);
		//   93  183:aload_0         
		//   94  184:getfield        #159 <Field RemoteControlClient mRcc>
		//   95  187:iconst_0        
		//   96  188:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
		//   97  191:aload_0         
		//   98  192:getfield        #130 <Field AudioManager mAudioManager>
		//   99  195:aload_0         
		//  100  196:getfield        #159 <Field RemoteControlClient mRcc>
		//  101  199:invokevirtual   #563 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
		//  102  202:aload_0         
		//  103  203:iconst_0        
		//  104  204:putfield        #98  <Field boolean mIsRccRegistered>
			}
			return false;
		//  105  207:iconst_0        
		//  106  208:ireturn         
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
		int mRepeatMode;
		PendingIntent mSessionActivity;
		int mShuffleMode;
		boolean mShuffleModeEnabled;
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
		//    1    1:invokespecial   #83  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #4   <Class Object>
		//    4    8:dup             
		//    5    9:invokespecial   #83  <Method void Object()>
		//    6   12:putfield        #85  <Field Object mLock>
		//    7   15:aload_0         
		//    8   16:new             #87  <Class RemoteCallbackList>
		//    9   19:dup             
		//   10   20:invokespecial   #88  <Method void RemoteCallbackList()>
		//   11   23:putfield        #90  <Field RemoteCallbackList mControllerCallbacks>
			mDestroyed = false;
		//   12   26:aload_0         
		//   13   27:iconst_0        
		//   14   28:putfield        #92  <Field boolean mDestroyed>
			mIsActive = false;
		//   15   31:aload_0         
		//   16   32:iconst_0        
		//   17   33:putfield        #94  <Field boolean mIsActive>
			mIsMbrRegistered = false;
		//   18   36:aload_0         
		//   19   37:iconst_0        
		//   20   38:putfield        #96  <Field boolean mIsMbrRegistered>
			mIsRccRegistered = false;
		//   21   41:aload_0         
		//   22   42:iconst_0        
		//   23   43:putfield        #98  <Field boolean mIsRccRegistered>
			mVolumeCallback = ((android.support.v4.media.VolumeProviderCompat.Callback) (new _cls1()));
		//   24   46:aload_0         
		//   25   47:new             #11  <Class MediaSessionCompat$MediaSessionImplBase$1>
		//   26   50:dup             
		//   27   51:aload_0         
		//   28   52:invokespecial   #101 <Method void MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat$MediaSessionImplBase)>
		//   29   55:putfield        #103 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
			if(componentname == null)
		//*  30   58:aload_3         
		//*  31   59:ifnonnull       72
			{
				throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
		//   32   62:new             #105 <Class IllegalArgumentException>
		//   33   65:dup             
		//   34   66:ldc1            #107 <String "MediaButtonReceiver component may not be null.">
		//   35   68:invokespecial   #110 <Method void IllegalArgumentException(String)>
		//   36   71:athrow          
			} else
			{
				mContext = context;
		//   37   72:aload_0         
		//   38   73:aload_1         
		//   39   74:putfield        #112 <Field Context mContext>
				mPackageName = context.getPackageName();
		//   40   77:aload_0         
		//   41   78:aload_1         
		//   42   79:invokevirtual   #118 <Method String Context.getPackageName()>
		//   43   82:putfield        #120 <Field String mPackageName>
				mAudioManager = (AudioManager)context.getSystemService("audio");
		//   44   85:aload_0         
		//   45   86:aload_1         
		//   46   87:ldc1            #122 <String "audio">
		//   47   89:invokevirtual   #126 <Method Object Context.getSystemService(String)>
		//   48   92:checkcast       #128 <Class AudioManager>
		//   49   95:putfield        #130 <Field AudioManager mAudioManager>
				mTag = s;
		//   50   98:aload_0         
		//   51   99:aload_2         
		//   52  100:putfield        #132 <Field String mTag>
				mMediaButtonReceiverComponentName = componentname;
		//   53  103:aload_0         
		//   54  104:aload_3         
		//   55  105:putfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
				mMediaButtonReceiverIntent = pendingintent;
		//   56  108:aload_0         
		//   57  109:aload           4
		//   58  111:putfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
				mStub = new MediaSessionStub();
		//   59  114:aload_0         
		//   60  115:new             #16  <Class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub>
		//   61  118:dup             
		//   62  119:aload_0         
		//   63  120:invokespecial   #137 <Method void MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase)>
		//   64  123:putfield        #139 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
				mToken = new Token(((Object) (mStub)));
		//   65  126:aload_0         
		//   66  127:new             #141 <Class MediaSessionCompat$Token>
		//   67  130:dup             
		//   68  131:aload_0         
		//   69  132:getfield        #139 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
		//   70  135:invokespecial   #144 <Method void MediaSessionCompat$Token(Object)>
		//   71  138:putfield        #146 <Field MediaSessionCompat$Token mToken>
				mRatingType = 0;
		//   72  141:aload_0         
		//   73  142:iconst_0        
		//   74  143:putfield        #148 <Field int mRatingType>
				mVolumeType = 1;
		//   75  146:aload_0         
		//   76  147:iconst_1        
		//   77  148:putfield        #150 <Field int mVolumeType>
				mLocalStream = 3;
		//   78  151:aload_0         
		//   79  152:iconst_3        
		//   80  153:putfield        #152 <Field int mLocalStream>
				mRcc = new RemoteControlClient(pendingintent);
		//   81  156:aload_0         
		//   82  157:new             #154 <Class RemoteControlClient>
		//   83  160:dup             
		//   84  161:aload           4
		//   85  163:invokespecial   #157 <Method void RemoteControlClient(PendingIntent)>
		//   86  166:putfield        #159 <Field RemoteControlClient mRcc>
				return;
		//   87  169:return          
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
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          25
		//    3    6:aload_1         
		//    4    7:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    5   10:return          
		}

		public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			postToHandler(26, ((Object) (mediadescriptioncompat)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          26
		//    3    6:aload_1         
		//    4    7:iload_2         
		//    5    8:invokevirtual   #31  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, int)>
		//    6   11:return          
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
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          16
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
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
		//   18   30:invokestatic    #87  <Method PlaybackStateCompat MediaSessionCompat.access$500(PlaybackStateCompat, MediaMetadataCompat)>
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
			int i = 2;
		//    0    0:iconst_2        
		//    1    1:istore_1        
			Object obj = mLock;
		//    2    2:aload_0         
		//    3    3:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    4    6:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//    5    9:astore          6
			obj;
		//    6   11:aload           6
			JVM INSTR monitorenter ;
		//    7   13:monitorenter    
			int l;
			int i1;
			VolumeProviderCompat volumeprovidercompat;
			l = mVolumeType;
		//    8   14:aload_0         
		//    9   15:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   10   18:getfield        #123 <Field int MediaSessionCompat$MediaSessionImplBase.mVolumeType>
		//   11   21:istore          4
			i1 = mLocalStream;
		//   12   23:aload_0         
		//   13   24:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   14   27:getfield        #126 <Field int MediaSessionCompat$MediaSessionImplBase.mLocalStream>
		//   15   30:istore          5
			volumeprovidercompat = mVolumeProvider;
		//   16   32:aload_0         
		//   17   33:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   18   36:getfield        #130 <Field VolumeProviderCompat MediaSessionCompat$MediaSessionImplBase.mVolumeProvider>
		//   19   39:astore          7
			if(l != 2)
				break MISSING_BLOCK_LABEL_83;
		//   20   41:iload           4
		//   21   43:iconst_2        
		//   22   44:icmpne          83
			int j;
			int k;
			i = volumeprovidercompat.getVolumeControl();
		//   23   47:aload           7
		//   24   49:invokevirtual   #135 <Method int VolumeProviderCompat.getVolumeControl()>
		//   25   52:istore_1        
			j = volumeprovidercompat.getMaxVolume();
		//   26   53:aload           7
		//   27   55:invokevirtual   #138 <Method int VolumeProviderCompat.getMaxVolume()>
		//   28   58:istore_2        
			k = volumeprovidercompat.getCurrentVolume();
		//   29   59:aload           7
		//   30   61:invokevirtual   #141 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   31   64:istore_3        
_L1:
			obj;
		//   32   65:aload           6
			JVM INSTR monitorexit ;
		//   33   67:monitorexit     
			return new ParcelableVolumeInfo(l, i1, i, j, k);
		//   34   68:new             #143 <Class ParcelableVolumeInfo>
		//   35   71:dup             
		//   36   72:iload           4
		//   37   74:iload           5
		//   38   76:iload_1         
		//   39   77:iload_2         
		//   40   78:iload_3         
		//   41   79:invokespecial   #146 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   42   82:areturn         
			j = mAudioManager.getStreamMaxVolume(i1);
		//   43   83:aload_0         
		//   44   84:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   45   87:getfield        #150 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   46   90:iload           5
		//   47   92:invokevirtual   #156 <Method int AudioManager.getStreamMaxVolume(int)>
		//   48   95:istore_2        
			k = mAudioManager.getStreamVolume(i1);
		//   49   96:aload_0         
		//   50   97:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   51  100:getfield        #150 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   52  103:iload           5
		//   53  105:invokevirtual   #159 <Method int AudioManager.getStreamVolume(int)>
		//   54  108:istore_3        
			  goto _L1
		//*  55  109:goto            65
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

		public boolean isShuffleModeEnabledDeprecated()
		{
			return mShuffleModeEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #169 <Field boolean MediaSessionCompat$MediaSessionImplBase.mShuffleModeEnabled>
		//    3    7:ireturn         
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
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          14
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void pause()
			throws RemoteException
		{
			postToHandler(12);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          12
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void play()
			throws RemoteException
		{
			postToHandler(7);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          7
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void playFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(8, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          8
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void playFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(9, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          9
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void playFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(10, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          10
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void prepare()
			throws RemoteException
		{
			postToHandler(3);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_3        
		//    3    5:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    8:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(4, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_4        
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   10:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(5, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_5        
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   10:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(6, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          6
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void previous()
			throws RemoteException
		{
			postToHandler(15);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          15
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void rate(RatingCompat ratingcompat)
			throws RemoteException
		{
			postToHandler(19, ((Object) (ratingcompat)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          19
		//    3    6:aload_1         
		//    4    7:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    5   10:return          
		}

		public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
			throws RemoteException
		{
			postToHandler(31, ((Object) (ratingcompat)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          31
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
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
		//*   7   17:aload_0         
		//*   8   18:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   9   21:getfield        #206 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//*  10   24:aload_1         
		//*  11   25:invokevirtual   #212 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
		//*  12   28:pop             
		//*  13   29:return          
				// Misplaced declaration of an exception variable
				catch(IMediaControllerCallback imediacontrollercallback)
		//*  14   30:astore_1        
				{
					return;
		//   15   31:return          
				}
			} else
			{
				mControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)));
				return;
			}
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			postToHandler(27, ((Object) (mediadescriptioncompat)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          27
		//    3    6:aload_1         
		//    4    7:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    5   10:return          
		}

		public void removeQueueItemAt(int i)
		{
			postToHandler(28, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          28
		//    3    6:iload_1         
		//    4    7:invokevirtual   #216 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void rewind()
			throws RemoteException
		{
			postToHandler(17);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          17
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void seekTo(long l)
			throws RemoteException
		{
			postToHandler(18, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          18
		//    3    6:lload_1         
		//    4    7:invokestatic    #225 <Method Long Long.valueOf(long)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiverWrapper resultreceiverwrapper)
		{
			postToHandler(1, ((Object) (new MediaSessionImplBase.Command(s, bundle, resultreceiverwrapper.mResultReceiver))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_1        
		//    3    5:new             #229 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokestatic    #235 <Method ResultReceiver MediaSessionCompat$ResultReceiverWrapper.access$400(MediaSessionCompat$ResultReceiverWrapper)>
		//    9   15:invokespecial   #238 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, ResultReceiver)>
		//   10   18:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//   11   21:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(20, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          20
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public boolean sendMediaButton(KeyEvent keyevent)
		{
			boolean flag;
			if((mFlags & 1) != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//*   3    7:iconst_1        
		//*   4    8:iand            
		//*   5    9:ifeq            30
				flag = true;
		//    6   12:iconst_1        
		//    7   13:istore_2        
			else
		//*   8   14:iload_2         
		//*   9   15:ifeq            28
		//*  10   18:aload_0         
		//*  11   19:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  12   22:bipush          21
		//*  13   24:aload_1         
		//*  14   25:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//*  15   28:iload_2         
		//*  16   29:ireturn         
				flag = false;
		//   17   30:iconst_0        
		//   18   31:istore_2        
			if(flag)
				postToHandler(21, ((Object) (keyevent)));
			return flag;
		//*  19   32:goto            14
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			postToHandler(29, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          29
		//    3    6:iload_1         
		//    4    7:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			postToHandler(23, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          23
		//    3    6:iload_1         
		//    4    7:invokevirtual   #216 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void setShuffleMode(int i)
			throws RemoteException
		{
			postToHandler(30, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          30
		//    3    6:iload_1         
		//    4    7:invokevirtual   #216 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void setShuffleModeEnabledDeprecated(boolean flag)
			throws RemoteException
		{
			postToHandler(24, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          24
		//    3    6:iload_1         
		//    4    7:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void setVolumeTo(int i, int j, String s)
		{
			MediaSessionImplBase.this.setVolumeTo(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #254 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		//    5    9:return          
		}

		public void skipToQueueItem(long l)
		{
			postToHandler(11, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          11
		//    3    6:lload_1         
		//    4    7:invokestatic    #225 <Method Long Long.valueOf(long)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void stop()
			throws RemoteException
		{
			postToHandler(13);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          13
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			mControllerCallbacks.unregister(((android.os.IInterface) (imediacontrollercallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #206 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #260 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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
			if(keyevent != null && keyevent.getAction() == 0) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnull          11
		//    2    4:aload_1         
		//    3    5:invokevirtual   #95  <Method int KeyEvent.getAction()>
		//    4    8:ifeq            12
_L1:
			return;
		//    5   11:return          
_L2:
			long l;
			if(mState == null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   8   16:getfield        #99  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//*   9   19:ifnonnull       122
				l = 0L;
		//   10   22:lconst_0        
		//   11   23:lstore_3        
			else
		//*  12   24:aload_1         
		//*  13   25:invokevirtual   #102 <Method int KeyEvent.getKeyCode()>
		//*  14   28:lookupswitch    9: default 112
		//		               79: 113
		//		               85: 113
		//		               86: 196
		//		               87: 166
		//		               88: 181
		//		               89: 224
		//		               90: 209
		//		               126: 136
		//		               127: 151
		//*  15  112:return          
		//*  16  113:ldc1            #104 <String "MediaSessionCompat">
		//*  17  115:ldc1            #106 <String "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already">
		//*  18  117:invokestatic    #112 <Method int Log.w(String, String)>
		//*  19  120:pop             
		//*  20  121:return          
				l = mState.getActions();
		//   21  122:aload_0         
		//   22  123:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   23  126:getfield        #99  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//   24  129:invokevirtual   #118 <Method long PlaybackStateCompat.getActions()>
		//   25  132:lstore_3        
			keyevent.getKeyCode();
			JVM INSTR lookupswitch 9: default 112
		//		               79: 113
		//		               85: 113
		//		               86: 196
		//		               87: 166
		//		               88: 181
		//		               89: 224
		//		               90: 209
		//		               126: 136
		//		               127: 151;
			   goto _L3 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L8:
			continue; /* Loop/switch isn't completed */
_L3:
			return;
_L4:
			Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
			return;
		//*  26  133:goto            24
_L10:
			if((l & 4L) == 0L) goto _L1; else goto _L12
		//   27  136:lload_3         
		//   28  137:ldc2w           #119 <Long 4L>
		//   29  140:land            
		//   30  141:lconst_0        
		//   31  142:lcmp            
		//   32  143:ifeq            11
_L12:
			callback.onPlay();
		//   33  146:aload_2         
		//   34  147:invokevirtual   #126 <Method void MediaSessionCompat$Callback.onPlay()>
			return;
		//   35  150:return          
_L11:
			if((l & 2L) == 0L) goto _L1; else goto _L13
		//   36  151:lload_3         
		//   37  152:ldc2w           #127 <Long 2L>
		//   38  155:land            
		//   39  156:lconst_0        
		//   40  157:lcmp            
		//   41  158:ifeq            11
_L13:
			callback.onPause();
		//   42  161:aload_2         
		//   43  162:invokevirtual   #131 <Method void MediaSessionCompat$Callback.onPause()>
			return;
		//   44  165:return          
_L6:
			if((l & 32L) == 0L) goto _L1; else goto _L14
		//   45  166:lload_3         
		//   46  167:ldc2w           #132 <Long 32L>
		//   47  170:land            
		//   48  171:lconst_0        
		//   49  172:lcmp            
		//   50  173:ifeq            11
_L14:
			callback.onSkipToNext();
		//   51  176:aload_2         
		//   52  177:invokevirtual   #136 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			return;
		//   53  180:return          
_L7:
			if((l & 16L) == 0L) goto _L1; else goto _L15
		//   54  181:lload_3         
		//   55  182:ldc2w           #137 <Long 16L>
		//   56  185:land            
		//   57  186:lconst_0        
		//   58  187:lcmp            
		//   59  188:ifeq            11
_L15:
			callback.onSkipToPrevious();
		//   60  191:aload_2         
		//   61  192:invokevirtual   #141 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			return;
		//   62  195:return          
_L5:
			if((l & 1L) == 0L) goto _L1; else goto _L16
		//   63  196:lload_3         
		//   64  197:lconst_1        
		//   65  198:land            
		//   66  199:lconst_0        
		//   67  200:lcmp            
		//   68  201:ifeq            11
_L16:
			callback.onStop();
		//   69  204:aload_2         
		//   70  205:invokevirtual   #144 <Method void MediaSessionCompat$Callback.onStop()>
			return;
		//   71  208:return          
_L9:
			if((l & 64L) == 0L) goto _L1; else goto _L17
		//   72  209:lload_3         
		//   73  210:ldc2w           #145 <Long 64L>
		//   74  213:land            
		//   75  214:lconst_0        
		//   76  215:lcmp            
		//   77  216:ifeq            11
_L17:
			callback.onFastForward();
		//   78  219:aload_2         
		//   79  220:invokevirtual   #149 <Method void MediaSessionCompat$Callback.onFastForward()>
			return;
		//   80  223:return          
			if((l & 8L) == 0L) goto _L1; else goto _L18
		//   81  224:lload_3         
		//   82  225:ldc2w           #150 <Long 8L>
		//   83  228:land            
		//   84  229:lconst_0        
		//   85  230:lcmp            
		//   86  231:ifeq            11
_L18:
			callback.onRewind();
		//   87  234:aload_2         
		//   88  235:invokevirtual   #154 <Method void MediaSessionCompat$Callback.onRewind()>
			return;
		//   89  238:return          
		}

		public void handleMessage(Message message)
		{
			Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #160 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
		//    3    7:astore_2        
			if(callback != null) goto _L2; else goto _L1
		//    4    8:aload_2         
		//    5    9:ifnonnull       13
_L1:
			return;
		//    6   12:return          
_L2:
			switch(message.what)
		//*   7   13:aload_1         
		//*   8   14:getfield        #165 <Field int Message.what>
			{
		//*   9   17:tableswitch     1 31: default 156
		//		               1 157
		//		               2 547
		//		               3 223
		//		               4 228
		//		               5 244
		//		               6 260
		//		               7 276
		//		               8 281
		//		               9 297
		//		               10 313
		//		               11 329
		//		               12 344
		//		               13 349
		//		               14 354
		//		               15 359
		//		               16 364
		//		               17 369
		//		               18 374
		//		               19 389
		//		               20 417
		//		               21 182
		//		               22 560
		//		               23 588
		//		               24 597
		//		               25 433
		//		               26 445
		//		               27 461
		//		               28 473
		//		               29 573
		//		               30 612
		//		               31 401
			default:
				return;
		//   10  156:return          

			case 2: // '\002'
				break; /* Loop/switch isn't completed */

			case 22: // '\026'
				break MISSING_BLOCK_LABEL_560;

			case 23: // '\027'
				break MISSING_BLOCK_LABEL_588;

			case 24: // '\030'
				break MISSING_BLOCK_LABEL_597;

			case 29: // '\035'
				break MISSING_BLOCK_LABEL_573;

			case 30: // '\036'
				break MISSING_BLOCK_LABEL_612;

			case 1: // '\001'
				message = ((Message) ((MediaSessionImplBase.Command)message.obj));
		//   11  157:aload_1         
		//   12  158:getfield        #169 <Field Object Message.obj>
		//   13  161:checkcast       #171 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//   14  164:astore_1        
				callback.onCommand(((MediaSessionImplBase.Command) (message)).command, ((MediaSessionImplBase.Command) (message)).extras, ((MediaSessionImplBase.Command) (message)).stub);
		//   15  165:aload_2         
		//   16  166:aload_1         
		//   17  167:getfield        #175 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
		//   18  170:aload_1         
		//   19  171:getfield        #179 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
		//   20  174:aload_1         
		//   21  175:getfield        #183 <Field ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
		//   22  178:invokevirtual   #187 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
				return;
		//   23  181:return          

			case 21: // '\025'
				message = ((Message) ((KeyEvent)message.obj));
		//   24  182:aload_1         
		//   25  183:getfield        #169 <Field Object Message.obj>
		//   26  186:checkcast       #91  <Class KeyEvent>
		//   27  189:astore_1        
				Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
		//   28  190:new             #189 <Class Intent>
		//   29  193:dup             
		//   30  194:ldc1            #191 <String "android.intent.action.MEDIA_BUTTON">
		//   31  196:invokespecial   #194 <Method void Intent(String)>
		//   32  199:astore_3        
				intent.putExtra("android.intent.extra.KEY_EVENT", ((Parcelable) (message)));
		//   33  200:aload_3         
		//   34  201:ldc1            #196 <String "android.intent.extra.KEY_EVENT">
		//   35  203:aload_1         
		//   36  204:invokevirtual   #200 <Method Intent Intent.putExtra(String, Parcelable)>
		//   37  207:pop             
				if(!callback.onMediaButtonEvent(intent))
		//*  38  208:aload_2         
		//*  39  209:aload_3         
		//*  40  210:invokevirtual   #203 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//*  41  213:ifne            12
				{
					onMediaButtonEvent(((KeyEvent) (message)), callback);
		//   42  216:aload_0         
		//   43  217:aload_1         
		//   44  218:aload_2         
		//   45  219:invokespecial   #205 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
					return;
		//   46  222:return          
				}
				break;

			case 3: // '\003'
				callback.onPrepare();
		//   47  223:aload_2         
		//   48  224:invokevirtual   #208 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//   49  227:return          

			case 4: // '\004'
				callback.onPrepareFromMediaId((String)message.obj, message.getData());
		//   50  228:aload_2         
		//   51  229:aload_1         
		//   52  230:getfield        #169 <Field Object Message.obj>
		//   53  233:checkcast       #210 <Class String>
		//   54  236:aload_1         
		//   55  237:invokevirtual   #214 <Method Bundle Message.getData()>
		//   56  240:invokevirtual   #218 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//   57  243:return          

			case 5: // '\005'
				callback.onPrepareFromSearch((String)message.obj, message.getData());
		//   58  244:aload_2         
		//   59  245:aload_1         
		//   60  246:getfield        #169 <Field Object Message.obj>
		//   61  249:checkcast       #210 <Class String>
		//   62  252:aload_1         
		//   63  253:invokevirtual   #214 <Method Bundle Message.getData()>
		//   64  256:invokevirtual   #221 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//   65  259:return          

			case 6: // '\006'
				callback.onPrepareFromUri((Uri)message.obj, message.getData());
		//   66  260:aload_2         
		//   67  261:aload_1         
		//   68  262:getfield        #169 <Field Object Message.obj>
		//   69  265:checkcast       #223 <Class Uri>
		//   70  268:aload_1         
		//   71  269:invokevirtual   #214 <Method Bundle Message.getData()>
		//   72  272:invokevirtual   #227 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//   73  275:return          

			case 7: // '\007'
				callback.onPlay();
		//   74  276:aload_2         
		//   75  277:invokevirtual   #126 <Method void MediaSessionCompat$Callback.onPlay()>
				return;
		//   76  280:return          

			case 8: // '\b'
				callback.onPlayFromMediaId((String)message.obj, message.getData());
		//   77  281:aload_2         
		//   78  282:aload_1         
		//   79  283:getfield        #169 <Field Object Message.obj>
		//   80  286:checkcast       #210 <Class String>
		//   81  289:aload_1         
		//   82  290:invokevirtual   #214 <Method Bundle Message.getData()>
		//   83  293:invokevirtual   #230 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
				return;
		//   84  296:return          

			case 9: // '\t'
				callback.onPlayFromSearch((String)message.obj, message.getData());
		//   85  297:aload_2         
		//   86  298:aload_1         
		//   87  299:getfield        #169 <Field Object Message.obj>
		//   88  302:checkcast       #210 <Class String>
		//   89  305:aload_1         
		//   90  306:invokevirtual   #214 <Method Bundle Message.getData()>
		//   91  309:invokevirtual   #233 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
				return;
		//   92  312:return          

			case 10: // '\n'
				callback.onPlayFromUri((Uri)message.obj, message.getData());
		//   93  313:aload_2         
		//   94  314:aload_1         
		//   95  315:getfield        #169 <Field Object Message.obj>
		//   96  318:checkcast       #223 <Class Uri>
		//   97  321:aload_1         
		//   98  322:invokevirtual   #214 <Method Bundle Message.getData()>
		//   99  325:invokevirtual   #236 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//  100  328:return          

			case 11: // '\013'
				callback.onSkipToQueueItem(((Long)message.obj).longValue());
		//  101  329:aload_2         
		//  102  330:aload_1         
		//  103  331:getfield        #169 <Field Object Message.obj>
		//  104  334:checkcast       #238 <Class Long>
		//  105  337:invokevirtual   #241 <Method long Long.longValue()>
		//  106  340:invokevirtual   #245 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
				return;
		//  107  343:return          

			case 12: // '\f'
				callback.onPause();
		//  108  344:aload_2         
		//  109  345:invokevirtual   #131 <Method void MediaSessionCompat$Callback.onPause()>
				return;
		//  110  348:return          

			case 13: // '\r'
				callback.onStop();
		//  111  349:aload_2         
		//  112  350:invokevirtual   #144 <Method void MediaSessionCompat$Callback.onStop()>
				return;
		//  113  353:return          

			case 14: // '\016'
				callback.onSkipToNext();
		//  114  354:aload_2         
		//  115  355:invokevirtual   #136 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
		//  116  358:return          

			case 15: // '\017'
				callback.onSkipToPrevious();
		//  117  359:aload_2         
		//  118  360:invokevirtual   #141 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
		//  119  363:return          

			case 16: // '\020'
				callback.onFastForward();
		//  120  364:aload_2         
		//  121  365:invokevirtual   #149 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
		//  122  368:return          

			case 17: // '\021'
				callback.onRewind();
		//  123  369:aload_2         
		//  124  370:invokevirtual   #154 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
		//  125  373:return          

			case 18: // '\022'
				callback.onSeekTo(((Long)message.obj).longValue());
		//  126  374:aload_2         
		//  127  375:aload_1         
		//  128  376:getfield        #169 <Field Object Message.obj>
		//  129  379:checkcast       #238 <Class Long>
		//  130  382:invokevirtual   #241 <Method long Long.longValue()>
		//  131  385:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
				return;
		//  132  388:return          

			case 19: // '\023'
				callback.onSetRating((RatingCompat)message.obj);
		//  133  389:aload_2         
		//  134  390:aload_1         
		//  135  391:getfield        #169 <Field Object Message.obj>
		//  136  394:checkcast       #250 <Class RatingCompat>
		//  137  397:invokevirtual   #254 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
				return;
		//  138  400:return          

			case 31: // '\037'
				callback.onSetRating((RatingCompat)message.obj, message.getData());
		//  139  401:aload_2         
		//  140  402:aload_1         
		//  141  403:getfield        #169 <Field Object Message.obj>
		//  142  406:checkcast       #250 <Class RatingCompat>
		//  143  409:aload_1         
		//  144  410:invokevirtual   #214 <Method Bundle Message.getData()>
		//  145  413:invokevirtual   #257 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//  146  416:return          

			case 20: // '\024'
				callback.onCustomAction((String)message.obj, message.getData());
		//  147  417:aload_2         
		//  148  418:aload_1         
		//  149  419:getfield        #169 <Field Object Message.obj>
		//  150  422:checkcast       #210 <Class String>
		//  151  425:aload_1         
		//  152  426:invokevirtual   #214 <Method Bundle Message.getData()>
		//  153  429:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  154  432:return          

			case 25: // '\031'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
		//  155  433:aload_2         
		//  156  434:aload_1         
		//  157  435:getfield        #169 <Field Object Message.obj>
		//  158  438:checkcast       #262 <Class MediaDescriptionCompat>
		//  159  441:invokevirtual   #266 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//  160  444:return          

			case 26: // '\032'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
		//  161  445:aload_2         
		//  162  446:aload_1         
		//  163  447:getfield        #169 <Field Object Message.obj>
		//  164  450:checkcast       #262 <Class MediaDescriptionCompat>
		//  165  453:aload_1         
		//  166  454:getfield        #269 <Field int Message.arg1>
		//  167  457:invokevirtual   #272 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//  168  460:return          

			case 27: // '\033'
				callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
		//  169  461:aload_2         
		//  170  462:aload_1         
		//  171  463:getfield        #169 <Field Object Message.obj>
		//  172  466:checkcast       #262 <Class MediaDescriptionCompat>
		//  173  469:invokevirtual   #275 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//  174  472:return          

			case 28: // '\034'
				if(mQueue != null)
					break MISSING_BLOCK_LABEL_483;
		//  175  473:aload_0         
		//  176  474:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  177  477:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//  178  480:ifnull          12
				break;
			}
			if(true) goto _L1; else goto _L3
_L3:
			break; /* Loop/switch isn't completed */
			if(message.arg1 >= 0 && message.arg1 < mQueue.size())
		//* 179  483:aload_1         
		//* 180  484:getfield        #269 <Field int Message.arg1>
		//* 181  487:iflt            542
		//* 182  490:aload_1         
		//* 183  491:getfield        #269 <Field int Message.arg1>
		//* 184  494:aload_0         
		//* 185  495:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//* 186  498:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//* 187  501:invokeinterface #284 <Method int List.size()>
		//* 188  506:icmpge          542
				message = ((Message) ((QueueItem)mQueue.get(message.arg1)));
		//  189  509:aload_0         
		//  190  510:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  191  513:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//  192  516:aload_1         
		//  193  517:getfield        #269 <Field int Message.arg1>
		//  194  520:invokeinterface #288 <Method Object List.get(int)>
		//  195  525:checkcast       #290 <Class MediaSessionCompat$QueueItem>
		//  196  528:astore_1        
			else
		//* 197  529:aload_1         
		//* 198  530:ifnull          12
		//* 199  533:aload_2         
		//* 200  534:aload_1         
		//* 201  535:invokevirtual   #294 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//* 202  538:invokevirtual   #275 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
		//* 203  541:return          
				message = null;
		//  204  542:aconst_null     
		//  205  543:astore_1        
			if(message != null)
			{
				callback.onRemoveQueueItem(((QueueItem) (message)).getDescription());
				return;
			}
			if(true) goto _L1; else goto _L4
		//  206  544:goto            529
_L4:
			adjustVolume(message.arg1, 0);
		//  207  547:aload_0         
		//  208  548:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  209  551:aload_1         
		//  210  552:getfield        #269 <Field int Message.arg1>
		//  211  555:iconst_0        
		//  212  556:invokevirtual   #298 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
			return;
		//  213  559:return          
			setVolumeTo(message.arg1, 0);
		//  214  560:aload_0         
		//  215  561:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  216  564:aload_1         
		//  217  565:getfield        #269 <Field int Message.arg1>
		//  218  568:iconst_0        
		//  219  569:invokevirtual   #301 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
			return;
		//  220  572:return          
			callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
		//  221  573:aload_2         
		//  222  574:aload_1         
		//  223  575:getfield        #169 <Field Object Message.obj>
		//  224  578:checkcast       #303 <Class Boolean>
		//  225  581:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
		//  226  584:invokevirtual   #311 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
			return;
		//  227  587:return          
			callback.onSetRepeatMode(message.arg1);
		//  228  588:aload_2         
		//  229  589:aload_1         
		//  230  590:getfield        #269 <Field int Message.arg1>
		//  231  593:invokevirtual   #315 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
			return;
		//  232  596:return          
			callback.onSetShuffleModeEnabled(((Boolean)message.obj).booleanValue());
		//  233  597:aload_2         
		//  234  598:aload_1         
		//  235  599:getfield        #169 <Field Object Message.obj>
		//  236  602:checkcast       #303 <Class Boolean>
		//  237  605:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
		//  238  608:invokevirtual   #318 <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
			return;
		//  239  611:return          
			callback.onSetShuffleMode(message.arg1);
		//  240  612:aload_2         
		//  241  613:aload_1         
		//  242  614:getfield        #269 <Field int Message.arg1>
		//  243  617:invokevirtual   #321 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
			return;
		//  244  620:return          
		}

		public void post(int i)
		{
			post(i, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #325 <Method void post(int, Object)>
		//    4    6:return          
		}

		public void post(int i, Object obj)
		{
			obtainMessage(i, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #329 <Method Message obtainMessage(int, Object)>
		//    4    6:invokevirtual   #332 <Method void Message.sendToTarget()>
		//    5    9:return          
		}

		public void post(int i, Object obj, int j)
		{
			obtainMessage(i, j, 0, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_3         
		//    3    3:iconst_0        
		//    4    4:aload_2         
		//    5    5:invokevirtual   #336 <Method Message obtainMessage(int, int, int, Object)>
		//    6    8:invokevirtual   #332 <Method void Message.sendToTarget()>
		//    7   11:return          
		}

		public void post(int i, Object obj, Bundle bundle)
		{
			obj = ((Object) (obtainMessage(i, obj)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #329 <Method Message obtainMessage(int, Object)>
		//    4    6:astore_2        
			((Message) (obj)).setData(bundle);
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #341 <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
		//    8   12:aload_2         
		//    9   13:invokevirtual   #332 <Method void Message.sendToTarget()>
		//   10   16:return          
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
		private static final int MSG_SET_SHUFFLE_MODE_ENABLED = 24;
		private static final int MSG_SET_VOLUME = 22;
		private static final int MSG_SKIP_TO_ITEM = 11;
		private static final int MSG_STOP = 13;
		final MediaSessionImplBase this$0;

		public MediaSessionImplBase.MessageHandler(Looper looper)
		{
			this$0 = MediaSessionImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #86  <Method void Handler(Looper)>
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
			if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          12
		//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          14
				return null;
		//    5   12:aconst_null     
		//    6   13:areturn         
			else
				return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(MediaSessionCompatApi21.QueueItem.getDescription(obj)), MediaSessionCompatApi21.QueueItem.getQueueId(obj));
		//    7   14:new             #2   <Class MediaSessionCompat$QueueItem>
		//    8   17:dup             
		//    9   18:aload_0         
		//   10   19:aload_0         
		//   11   20:invokestatic    #82  <Method Object MediaSessionCompatApi21$QueueItem.getDescription(Object)>
		//   12   23:invokestatic    #86  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
		//   13   26:aload_0         
		//   14   27:invokestatic    #90  <Method long MediaSessionCompatApi21$QueueItem.getQueueId(Object)>
		//   15   30:invokespecial   #56  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
		//   16   33:areturn         
		}

		public static List fromQueueItemList(List list)
		{
			if(list != null && android.os.Build.VERSION.SDK_INT >= 21) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:ifnull          12
		//    2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
		//    3    7:bipush          21
		//    4    9:icmpge          16
_L1:
			list = null;
		//    5   12:aconst_null     
		//    6   13:astore_0        
_L4:
			return list;
		//    7   14:aload_0         
		//    8   15:areturn         
_L2:
			ArrayList arraylist = new ArrayList();
		//    9   16:new             #94  <Class ArrayList>
		//   10   19:dup             
		//   11   20:invokespecial   #95  <Method void ArrayList()>
		//   12   23:astore_1        
			Iterator iterator = list.iterator();
		//   13   24:aload_0         
		//   14   25:invokeinterface #101 <Method Iterator List.iterator()>
		//   15   30:astore_2        
			do
			{
				list = ((List) (arraylist));
		//   16   31:aload_1         
		//   17   32:astore_0        
				if(!iterator.hasNext())
					continue;
		//   18   33:aload_2         
		//   19   34:invokeinterface #107 <Method boolean Iterator.hasNext()>
		//   20   39:ifeq            14
				((List) (arraylist)).add(((Object) (fromQueueItem(iterator.next()))));
		//   21   42:aload_1         
		//   22   43:aload_2         
		//   23   44:invokeinterface #111 <Method Object Iterator.next()>
		//   24   49:invokestatic    #113 <Method MediaSessionCompat$QueueItem fromQueueItem(Object)>
		//   25   52:invokeinterface #117 <Method boolean List.add(Object)>
		//   26   57:pop             
			} while(true);
		//   27   58:goto            31
			if(true) goto _L4; else goto _L3
_L3:
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
			if(mItem != null || android.os.Build.VERSION.SDK_INT < 21)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field Object mItem>
		//*   2    4:ifnonnull       15
		//*   3    7:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
		//*   4   10:bipush          21
		//*   5   12:icmpge          20
			{
				return mItem;
		//    6   15:aload_0         
		//    7   16:getfield        #69  <Field Object mItem>
		//    8   19:areturn         
			} else
			{
				mItem = MediaSessionCompatApi21.QueueItem.createItem(mDescription.getMediaDescription(), mId);
		//    9   20:aload_0         
		//   10   21:aload_0         
		//   11   22:getfield        #44  <Field MediaDescriptionCompat mDescription>
		//   12   25:invokevirtual   #126 <Method Object MediaDescriptionCompat.getMediaDescription()>
		//   13   28:aload_0         
		//   14   29:getfield        #52  <Field long mId>
		//   15   32:invokestatic    #130 <Method Object MediaSessionCompatApi21$QueueItem.createItem(Object, long)>
		//   16   35:putfield        #69  <Field Object mItem>
				return mItem;
		//   17   38:aload_0         
		//   18   39:getfield        #69  <Field Object mItem>
		//   19   42:areturn         
			}
		}

		public String toString()
		{
			return (new StringBuilder()).append("MediaSession.QueueItem {Description=").append(((Object) (mDescription))).append(", Id=").append(mId).append(" }").toString();
		//    0    0:new             #134 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #135 <Method void StringBuilder()>
		//    3    7:ldc1            #137 <String "MediaSession.QueueItem {Description=">
		//    4    9:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #44  <Field MediaDescriptionCompat mDescription>
		//    7   16:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
		//    8   19:ldc1            #146 <String ", Id=">
		//    9   21:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #52  <Field long mId>
		//   12   28:invokevirtual   #149 <Method StringBuilder StringBuilder.append(long)>
		//   13   31:ldc1            #151 <String " }">
		//   14   33:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
		//   15   36:invokevirtual   #153 <Method String StringBuilder.toString()>
		//   16   39:areturn         
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
			if(mediadescriptioncompat == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       18
				throw new IllegalArgumentException("Description cannot be null.");
		//    4    8:new             #58  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #60  <String "Description cannot be null.">
		//    7   14:invokespecial   #63  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			if(l == -1L)
		//*   9   18:lload_3         
		//*  10   19:ldc2w           #64  <Long -1L>
		//*  11   22:lcmp            
		//*  12   23:ifne            36
			{
				throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
		//   13   26:new             #58  <Class IllegalArgumentException>
		//   14   29:dup             
		//   15   30:ldc1            #67  <String "Id cannot be QueueItem.UNKNOWN_ID">
		//   16   32:invokespecial   #63  <Method void IllegalArgumentException(String)>
		//   17   35:athrow          
			} else
			{
				mDescription = mediadescriptioncompat;
		//   18   36:aload_0         
		//   19   37:aload_2         
		//   20   38:putfield        #44  <Field MediaDescriptionCompat mDescription>
				mId = l;
		//   21   41:aload_0         
		//   22   42:lload_3         
		//   23   43:putfield        #52  <Field long mId>
				mItem = obj;
		//   24   46:aload_0         
		//   25   47:aload_1         
		//   26   48:putfield        #69  <Field Object mItem>
				return;
		//   27   51:return          
			}
		}
	}

	static final class ResultReceiverWrapper
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
		//    1    1:getfield        #37  <Field ResultReceiver mResultReceiver>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #46  <Method void ResultReceiver.writeToParcel(Parcel, int)>
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
		private ResultReceiver mResultReceiver;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$ResultReceiverWrapper$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void MediaSessionCompat$ResultReceiverWrapper$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}


/*
		static ResultReceiver access$400(ResultReceiverWrapper resultreceiverwrapper)
		{
			return resultreceiverwrapper.mResultReceiver;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field ResultReceiver mResultReceiver>
		//    2    4:areturn         
		}

*/

		ResultReceiverWrapper(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mResultReceiver = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
		//    2    4:aload_0         
		//    3    5:getstatic       #29  <Field android.os.Parcelable$Creator ResultReceiver.CREATOR>
		//    4    8:aload_1         
		//    5    9:invokeinterface #35  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    6   14:checkcast       #28  <Class ResultReceiver>
		//    7   17:putfield        #37  <Field ResultReceiver mResultReceiver>
		//    8   20:return          
		}

		public ResultReceiverWrapper(ResultReceiver resultreceiver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mResultReceiver = resultreceiver;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #37  <Field ResultReceiver mResultReceiver>
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

		public static Token fromToken(Object obj)
		{
			return fromToken(obj, ((IMediaSession) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #40  <Method MediaSessionCompat$Token fromToken(Object, IMediaSession)>
		//    3    5:areturn         
		}

		public static Token fromToken(Object obj, IMediaSession imediasession)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          25
		//*   2    4:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmplt          25
				return new Token(MediaSessionCompatApi21.verifyToken(obj), imediasession);
		//    5   12:new             #2   <Class MediaSessionCompat$Token>
		//    6   15:dup             
		//    7   16:aload_0         
		//    8   17:invokestatic    #56  <Method Object MediaSessionCompatApi21.verifyToken(Object)>
		//    9   20:aload_1         
		//   10   21:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
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
			if(this != obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
				if(!(obj instanceof Token))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class MediaSessionCompat$Token>
		//*   7   11:ifne            16
					return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
				obj = ((Object) ((Token)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
		//   12   20:astore_1        
				if(mInner == null)
		//*  13   21:aload_0         
		//*  14   22:getfield        #33  <Field Object mInner>
		//*  15   25:ifnonnull       37
				{
					if(((Token) (obj)).mInner != null)
		//*  16   28:aload_1         
		//*  17   29:getfield        #33  <Field Object mInner>
		//*  18   32:ifnull          5
						return false;
		//   19   35:iconst_0        
		//   20   36:ireturn         
				} else
				if(((Token) (obj)).mInner == null)
		//*  21   37:aload_1         
		//*  22   38:getfield        #33  <Field Object mInner>
		//*  23   41:ifnonnull       46
					return false;
		//   24   44:iconst_0        
		//   25   45:ireturn         
				else
					return mInner.equals(((Token) (obj)).mInner);
		//   26   46:aload_0         
		//   27   47:getfield        #33  <Field Object mInner>
		//   28   50:aload_1         
		//   29   51:getfield        #33  <Field Object mInner>
		//   30   54:invokevirtual   #63  <Method boolean Object.equals(Object)>
		//   31   57:ireturn         
			}
			return true;
		}

		public IMediaSession getExtraBinder()
		{
			return mExtraBinder;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field IMediaSession mExtraBinder>
		//    2    4:areturn         
		}

		public Object getToken()
		{
			return mInner;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Object mInner>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			if(mInner == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Object mInner>
		//*   2    4:ifnonnull       9
				return 0;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			else
				return mInner.hashCode();
		//    5    9:aload_0         
		//    6   10:getfield        #33  <Field Object mInner>
		//    7   13:invokevirtual   #70  <Method int Object.hashCode()>
		//    8   16:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #50  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          21
			{
				parcel.writeParcelable((Parcelable)mInner, i);
		//    3    8:aload_1         
		//    4    9:aload_0         
		//    5   10:getfield        #33  <Field Object mInner>
		//    6   13:checkcast       #6   <Class Parcelable>
		//    7   16:iload_2         
		//    8   17:invokevirtual   #78  <Method void Parcel.writeParcelable(Parcelable, int)>
				return;
		//    9   20:return          
			} else
			{
				parcel.writeStrongBinder((IBinder)mInner);
		//   10   21:aload_1         
		//   11   22:aload_0         
		//   12   23:getfield        #33  <Field Object mInner>
		//   13   26:checkcast       #80  <Class IBinder>
		//   14   29:invokevirtual   #84  <Method void Parcel.writeStrongBinder(IBinder)>
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
			//*   2    5:icmplt          23
					parcel = ((Parcel) (parcel.readParcelable(((ClassLoader) (null)))));
			//    3    8:aload_1         
			//    4    9:aconst_null     
			//    5   10:invokevirtual   #31  <Method Parcelable Parcel.readParcelable(ClassLoader)>
			//    6   13:astore_1        
				else
			//*   7   14:new             #9   <Class MediaSessionCompat$Token>
			//*   8   17:dup             
			//*   9   18:aload_1         
			//*  10   19:invokespecial   #34  <Method void MediaSessionCompat$Token(Object)>
			//*  11   22:areturn         
					parcel = ((Parcel) (parcel.readStrongBinder()));
			//   12   23:aload_1         
			//   13   24:invokevirtual   #38  <Method IBinder Parcel.readStrongBinder()>
			//   14   27:astore_1        
				return new Token(((Object) (parcel)));
			//*  15   28:goto            14
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
		private final IMediaSession mExtraBinder;
		private final Object mInner;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$Token$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void MediaSessionCompat$Token$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		Token(Object obj)
		{
			this(obj, ((IMediaSession) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
		//    4    6:return          
		}

		Token(Object obj, IMediaSession imediasession)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mInner = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field Object mInner>
			mExtraBinder = imediasession;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #35  <Field IMediaSession mExtraBinder>
		//    8   14:return          
		}
	}


	private MediaSessionCompat(Context context, MediaSessionImpl mediasessionimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void Object()>
		mActiveListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #187 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #188 <Method void ArrayList()>
	//    6   12:putfield        #190 <Field ArrayList mActiveListeners>
		mImpl = mediasessionimpl;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		if(android.os.Build.VERSION.SDK_INT >= 21 && !MediaSessionCompatApi21.hasCallback(mediasessionimpl.getMediaSession()))
	//*  10   20:getstatic       #197 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          21
	//*  12   25:icmplt          52
	//*  13   28:aload_2         
	//*  14   29:invokeinterface #201 <Method Object MediaSessionCompat$MediaSessionImpl.getMediaSession()>
	//*  15   34:invokestatic    #207 <Method boolean MediaSessionCompatApi21.hasCallback(Object)>
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
	//   18   41:new             #8   <Class MediaSessionCompat$2>
	//   19   44:dup             
	//   20   45:aload_0         
	//   21   46:invokespecial   #210 <Method void MediaSessionCompat$2(MediaSessionCompat)>
	//   22   49:invokevirtual   #214 <Method void setCallback(MediaSessionCompat$Callback)>
		mController = new MediaControllerCompat(context, this);
	//   23   52:aload_0         
	//   24   53:new             #216 <Class MediaControllerCompat>
	//   25   56:dup             
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:invokespecial   #219 <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//   29   62:putfield        #221 <Field MediaControllerCompat mController>
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
	//    5    5:invokespecial   #226 <Method void MediaSessionCompat(Context, String, ComponentName, PendingIntent)>
	//    6    8:return          
	}

	public MediaSessionCompat(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void Object()>
		mActiveListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #187 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #188 <Method void ArrayList()>
	//    6   12:putfield        #190 <Field ArrayList mActiveListeners>
		if(context == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       29
			throw new IllegalArgumentException("context must not be null");
	//    9   19:new             #228 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #230 <String "context must not be null">
	//   12   25:invokespecial   #233 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   29:aload_2         
	//*  15   30:invokestatic    #239 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   33:ifeq            46
			throw new IllegalArgumentException("tag must not be null or empty");
	//   17   36:new             #228 <Class IllegalArgumentException>
	//   18   39:dup             
	//   19   40:ldc1            #241 <String "tag must not be null or empty">
	//   20   42:invokespecial   #233 <Method void IllegalArgumentException(String)>
	//   21   45:athrow          
		ComponentName componentname1 = componentname;
	//   22   46:aload_3         
	//   23   47:astore          5
		if(componentname == null)
	//*  24   49:aload_3         
	//*  25   50:ifnonnull       76
		{
			componentname = MediaButtonReceiver.getMediaButtonReceiverComponent(context);
	//   26   53:aload_1         
	//   27   54:invokestatic    #247 <Method ComponentName MediaButtonReceiver.getMediaButtonReceiverComponent(Context)>
	//   28   57:astore_3        
			componentname1 = componentname;
	//   29   58:aload_3         
	//   30   59:astore          5
			if(componentname == null)
	//*  31   61:aload_3         
	//*  32   62:ifnonnull       76
			{
				Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
	//   33   65:ldc1            #172 <String "MediaSessionCompat">
	//   34   67:ldc1            #249 <String "Couldn't find a unique registered media button receiver in the given context.">
	//   35   69:invokestatic    #255 <Method int Log.w(String, String)>
	//   36   72:pop             
				componentname1 = componentname;
	//   37   73:aload_3         
	//   38   74:astore          5
			}
		}
		componentname = ((ComponentName) (pendingintent));
	//   39   76:aload           4
	//   40   78:astore_3        
		if(componentname1 != null)
	//*  41   79:aload           5
	//*  42   81:ifnull          118
		{
			componentname = ((ComponentName) (pendingintent));
	//   43   84:aload           4
	//   44   86:astore_3        
			if(pendingintent == null)
	//*  45   87:aload           4
	//*  46   89:ifnonnull       118
			{
				componentname = ((ComponentName) (new Intent("android.intent.action.MEDIA_BUTTON")));
	//   47   92:new             #257 <Class Intent>
	//   48   95:dup             
	//   49   96:ldc2            #259 <String "android.intent.action.MEDIA_BUTTON">
	//   50   99:invokespecial   #260 <Method void Intent(String)>
	//   51  102:astore_3        
				((Intent) (componentname)).setComponent(componentname1);
	//   52  103:aload_3         
	//   53  104:aload           5
	//   54  106:invokevirtual   #264 <Method Intent Intent.setComponent(ComponentName)>
	//   55  109:pop             
				componentname = ((ComponentName) (PendingIntent.getBroadcast(context, 0, ((Intent) (componentname)), 0)));
	//   56  110:aload_1         
	//   57  111:iconst_0        
	//   58  112:aload_3         
	//   59  113:iconst_0        
	//   60  114:invokestatic    #270 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   61  117:astore_3        
			}
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  62  118:getstatic       #197 <Field int android.os.Build$VERSION.SDK_INT>
	//*  63  121:bipush          21
	//*  64  123:icmplt          199
		{
			mImpl = ((MediaSessionImpl) (new MediaSessionImplApi21(context, s)));
	//   65  126:aload_0         
	//   66  127:new             #38  <Class MediaSessionCompat$MediaSessionImplApi21>
	//   67  130:dup             
	//   68  131:aload_1         
	//   69  132:aload_2         
	//   70  133:invokespecial   #272 <Method void MediaSessionCompat$MediaSessionImplApi21(Context, String)>
	//   71  136:putfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
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
	//   72  139:aload_0         
	//   73  140:new             #6   <Class MediaSessionCompat$1>
	//   74  143:dup             
	//   75  144:aload_0         
	//   76  145:invokespecial   #273 <Method void MediaSessionCompat$1(MediaSessionCompat)>
	//   77  148:invokevirtual   #214 <Method void setCallback(MediaSessionCompat$Callback)>
			mImpl.setMediaButtonReceiver(((PendingIntent) (componentname)));
	//   78  151:aload_0         
	//   79  152:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//   80  155:aload_3         
	//   81  156:invokeinterface #277 <Method void MediaSessionCompat$MediaSessionImpl.setMediaButtonReceiver(PendingIntent)>
		} else
	//*  82  161:aload_0         
	//*  83  162:new             #216 <Class MediaControllerCompat>
	//*  84  165:dup             
	//*  85  166:aload_1         
	//*  86  167:aload_0         
	//*  87  168:invokespecial   #219 <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//*  88  171:putfield        #221 <Field MediaControllerCompat mController>
	//*  89  174:getstatic       #279 <Field int sMaxBitmapSize>
	//*  90  177:ifne            198
	//*  91  180:iconst_1        
	//*  92  181:ldc2            #280 <Float 320F>
	//*  93  184:aload_1         
	//*  94  185:invokevirtual   #286 <Method Resources Context.getResources()>
	//*  95  188:invokevirtual   #292 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//*  96  191:invokestatic    #298 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//*  97  194:f2i             
	//*  98  195:putstatic       #279 <Field int sMaxBitmapSize>
	//*  99  198:return          
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//* 100  199:getstatic       #197 <Field int android.os.Build$VERSION.SDK_INT>
	//* 101  202:bipush          19
	//* 102  204:icmplt          226
			mImpl = ((MediaSessionImpl) (new MediaSessionImplApi19(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  103  207:aload_0         
	//  104  208:new             #33  <Class MediaSessionCompat$MediaSessionImplApi19>
	//  105  211:dup             
	//  106  212:aload_1         
	//  107  213:aload_2         
	//  108  214:aload           5
	//  109  216:aload_3         
	//  110  217:invokespecial   #299 <Method void MediaSessionCompat$MediaSessionImplApi19(Context, String, ComponentName, PendingIntent)>
	//  111  220:putfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		else
	//* 112  223:goto            161
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//* 113  226:getstatic       #197 <Field int android.os.Build$VERSION.SDK_INT>
	//* 114  229:bipush          18
	//* 115  231:icmplt          253
			mImpl = ((MediaSessionImpl) (new MediaSessionImplApi18(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  116  234:aload_0         
	//  117  235:new             #28  <Class MediaSessionCompat$MediaSessionImplApi18>
	//  118  238:dup             
	//  119  239:aload_1         
	//  120  240:aload_2         
	//  121  241:aload           5
	//  122  243:aload_3         
	//  123  244:invokespecial   #300 <Method void MediaSessionCompat$MediaSessionImplApi18(Context, String, ComponentName, PendingIntent)>
	//  124  247:putfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		else
	//* 125  250:goto            161
			mImpl = ((MediaSessionImpl) (new MediaSessionImplBase(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  126  253:aload_0         
	//  127  254:new             #44  <Class MediaSessionCompat$MediaSessionImplBase>
	//  128  257:dup             
	//  129  258:aload_1         
	//  130  259:aload_2         
	//  131  260:aload           5
	//  132  262:aload_3         
	//  133  263:invokespecial   #301 <Method void MediaSessionCompat$MediaSessionImplBase(Context, String, ComponentName, PendingIntent)>
	//  134  266:putfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		mController = new MediaControllerCompat(context, this);
		if(sMaxBitmapSize == 0)
			sMaxBitmapSize = (int)TypedValue.applyDimension(1, 320F, context.getResources().getDisplayMetrics());
	//* 135  269:goto            161
	}

	public static MediaSessionCompat fromMediaSession(Context context, Object obj)
	{
		if(context != null && obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          33
	//*   2    4:aload_1         
	//*   3    5:ifnull          33
	//*   4    8:getstatic       #197 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmplt          33
			return new MediaSessionCompat(context, ((MediaSessionImpl) (new MediaSessionImplApi21(obj))));
	//    7   16:new             #2   <Class MediaSessionCompat>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:new             #38  <Class MediaSessionCompat$MediaSessionImplApi21>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokespecial   #311 <Method void MediaSessionCompat$MediaSessionImplApi21(Object)>
	//   14   29:invokespecial   #313 <Method void MediaSessionCompat(Context, MediaSessionCompat$MediaSessionImpl)>
	//   15   32:areturn         
		else
			return null;
	//   16   33:aconst_null     
	//   17   34:areturn         
	}

	private static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackstatecompat, MediaMetadataCompat mediametadatacompat)
	{
		long l1;
		l1 = -1L;
	//    0    0:ldc2w           #314 <Long -1L>
	//    1    3:lstore          4
		break MISSING_BLOCK_LABEL_5;
		if(playbackstatecompat != null && playbackstatecompat.getPosition() != -1L && (playbackstatecompat.getState() == 3 || playbackstatecompat.getState() == 4 || playbackstatecompat.getState() == 5))
	//*   2    5:aload_0         
	//*   3    6:ifnull          20
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #321 <Method long PlaybackStateCompat.getPosition()>
	//*   6   13:ldc2w           #314 <Long -1L>
	//*   7   16:lcmp            
	//*   8   17:ifne            22
	//*   9   20:aload_0         
	//*  10   21:areturn         
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #325 <Method int PlaybackStateCompat.getState()>
	//*  13   26:iconst_3        
	//*  14   27:icmpeq          46
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #325 <Method int PlaybackStateCompat.getState()>
	//*  17   34:iconst_4        
	//*  18   35:icmpeq          46
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #325 <Method int PlaybackStateCompat.getState()>
	//*  21   42:iconst_5        
	//*  22   43:icmpne          20
		{
			long l = playbackstatecompat.getLastPositionUpdateTime();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #328 <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
	//   25   50:lstore_2        
			if(l > 0L)
	//*  26   51:lload_2         
	//*  27   52:lconst_0        
	//*  28   53:lcmp            
	//*  29   54:ifle            20
			{
				long l3 = SystemClock.elapsedRealtime();
	//   30   57:invokestatic    #333 <Method long SystemClock.elapsedRealtime()>
	//   31   60:lstore          8
				long l2 = (long)(playbackstatecompat.getPlaybackSpeed() * (float)(l3 - l)) + playbackstatecompat.getPosition();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #337 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//   34   66:lload           8
	//   35   68:lload_2         
	//   36   69:lsub            
	//   37   70:l2f             
	//   38   71:fmul            
	//   39   72:f2l             
	//   40   73:aload_0         
	//   41   74:invokevirtual   #321 <Method long PlaybackStateCompat.getPosition()>
	//   42   77:ladd            
	//   43   78:lstore          6
				l = l1;
	//   44   80:lload           4
	//   45   82:lstore_2        
				if(mediametadatacompat != null)
	//*  46   83:aload_1         
	//*  47   84:ifnull          108
				{
					l = l1;
	//   48   87:lload           4
	//   49   89:lstore_2        
					if(mediametadatacompat.containsKey("android.media.metadata.DURATION"))
	//*  50   90:aload_1         
	//*  51   91:ldc2            #339 <String "android.media.metadata.DURATION">
	//*  52   94:invokevirtual   #345 <Method boolean MediaMetadataCompat.containsKey(String)>
	//*  53   97:ifeq            108
						l = mediametadatacompat.getLong("android.media.metadata.DURATION");
	//   54  100:aload_1         
	//   55  101:ldc2            #339 <String "android.media.metadata.DURATION">
	//   56  104:invokevirtual   #349 <Method long MediaMetadataCompat.getLong(String)>
	//   57  107:lstore_2        
				}
				if(l < 0L || l2 <= l)
	//*  58  108:lload_2         
	//*  59  109:lconst_0        
	//*  60  110:lcmp            
	//*  61  111:iflt            147
	//*  62  114:lload           6
	//*  63  116:lload_2         
	//*  64  117:lcmp            
	//*  65  118:ifle            147
	//*  66  121:new             #351 <Class PlaybackStateCompat$Builder>
	//*  67  124:dup             
	//*  68  125:aload_0         
	//*  69  126:invokespecial   #354 <Method void PlaybackStateCompat$Builder(PlaybackStateCompat)>
	//*  70  129:aload_0         
	//*  71  130:invokevirtual   #325 <Method int PlaybackStateCompat.getState()>
	//*  72  133:lload_2         
	//*  73  134:aload_0         
	//*  74  135:invokevirtual   #337 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//*  75  138:lload           8
	//*  76  140:invokevirtual   #358 <Method PlaybackStateCompat$Builder PlaybackStateCompat$Builder.setState(int, long, float, long)>
	//*  77  143:invokevirtual   #362 <Method PlaybackStateCompat PlaybackStateCompat$Builder.build()>
	//*  78  146:areturn         
					if(l2 < 0L)
	//*  79  147:lload           6
	//*  80  149:lconst_0        
	//*  81  150:lcmp            
	//*  82  151:ifge            159
						l = 0L;
	//   83  154:lconst_0        
	//   84  155:lstore_2        
					else
	//*  85  156:goto            121
						l = l2;
	//   86  159:lload           6
	//   87  161:lstore_2        
				return (new PlaybackStateCompat.Builder(playbackstatecompat)).setState(playbackstatecompat.getState(), l, playbackstatecompat.getPlaybackSpeed(), l3).build();
			}
		}
		return playbackstatecompat;
	//*  88  162:goto            121
	}

	public void addOnActiveChangeListener(OnActiveChangeListener onactivechangelistener)
	{
		if(onactivechangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    2    4:new             #228 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #366 <String "Listener may not be null">
	//    5   11:invokespecial   #233 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mActiveListeners.add(((Object) (onactivechangelistener)));
	//    7   15:aload_0         
	//    8   16:getfield        #190 <Field ArrayList mActiveListeners>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #369 <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public String getCallingPackage()
	{
		return mImpl.getCallingPackage();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #377 <Method String MediaSessionCompat$MediaSessionImpl.getCallingPackage()>
	//    3    9:areturn         
	}

	public MediaControllerCompat getController()
	{
		return mController;
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field MediaControllerCompat mController>
	//    2    4:areturn         
	}

	public Object getMediaSession()
	{
		return mImpl.getMediaSession();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #201 <Method Object MediaSessionCompat$MediaSessionImpl.getMediaSession()>
	//    3    9:areturn         
	}

	public Object getRemoteControlClient()
	{
		return mImpl.getRemoteControlClient();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #383 <Method Object MediaSessionCompat$MediaSessionImpl.getRemoteControlClient()>
	//    3    9:areturn         
	}

	public Token getSessionToken()
	{
		return mImpl.getSessionToken();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #387 <Method MediaSessionCompat$Token MediaSessionCompat$MediaSessionImpl.getSessionToken()>
	//    3    9:areturn         
	}

	public boolean isActive()
	{
		return mImpl.isActive();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #391 <Method boolean MediaSessionCompat$MediaSessionImpl.isActive()>
	//    3    9:ireturn         
	}

	public void release()
	{
		mImpl.release();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #394 <Method void MediaSessionCompat$MediaSessionImpl.release()>
	//    3    9:return          
	}

	public void removeOnActiveChangeListener(OnActiveChangeListener onactivechangelistener)
	{
		if(onactivechangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    2    4:new             #228 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #366 <String "Listener may not be null">
	//    5   11:invokespecial   #233 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mActiveListeners.remove(((Object) (onactivechangelistener)));
	//    7   15:aload_0         
	//    8   16:getfield        #190 <Field ArrayList mActiveListeners>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #398 <Method boolean ArrayList.remove(Object)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #239 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
		{
			throw new IllegalArgumentException("event cannot be null or empty");
	//    3    7:new             #228 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #402 <String "event cannot be null or empty">
	//    6   14:invokespecial   #233 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		} else
		{
			mImpl.sendSessionEvent(s, bundle);
	//    8   18:aload_0         
	//    9   19:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokeinterface #404 <Method void MediaSessionCompat$MediaSessionImpl.sendSessionEvent(String, Bundle)>
			return;
	//   13   29:return          
		}
	}

	public void setActive(boolean flag)
	{
		mImpl.setActive(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #408 <Method void MediaSessionCompat$MediaSessionImpl.setActive(boolean)>
		for(Iterator iterator = mActiveListeners.iterator(); iterator.hasNext(); ((OnActiveChangeListener)iterator.next()).onActiveChanged());
	//    4   10:aload_0         
	//    5   11:getfield        #190 <Field ArrayList mActiveListeners>
	//    6   14:invokevirtual   #412 <Method Iterator ArrayList.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #417 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_2         
	//   12   28:invokeinterface #420 <Method Object Iterator.next()>
	//   13   33:checkcast       #58  <Class MediaSessionCompat$OnActiveChangeListener>
	//   14   36:invokeinterface #423 <Method void MediaSessionCompat$OnActiveChangeListener.onActiveChanged()>
	//*  15   41:goto            18
	//   16   44:return          
	}

	public void setCallback(Callback callback)
	{
		setCallback(callback, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #426 <Method void setCallback(MediaSessionCompat$Callback, Handler)>
	//    4    6:return          
	}

	public void setCallback(Callback callback, Handler handler)
	{
		MediaSessionImpl mediasessionimpl = mImpl;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:astore_3        
		if(handler == null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokeinterface #427 <Method void MediaSessionCompat$MediaSessionImpl.setCallback(MediaSessionCompat$Callback, Handler)>
	//*   9   17:return          
			handler = new Handler();
	//   10   18:new             #429 <Class Handler>
	//   11   21:dup             
	//   12   22:invokespecial   #430 <Method void Handler()>
	//   13   25:astore_2        
		mediasessionimpl.setCallback(callback, handler);
	//*  14   26:goto            9
	}

	public void setCaptioningEnabled(boolean flag)
	{
		mImpl.setCaptioningEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #433 <Method void MediaSessionCompat$MediaSessionImpl.setCaptioningEnabled(boolean)>
	//    4   10:return          
	}

	public void setExtras(Bundle bundle)
	{
		mImpl.setExtras(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #437 <Method void MediaSessionCompat$MediaSessionImpl.setExtras(Bundle)>
	//    4   10:return          
	}

	public void setFlags(int i)
	{
		mImpl.setFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #441 <Method void MediaSessionCompat$MediaSessionImpl.setFlags(int)>
	//    4   10:return          
	}

	public void setMediaButtonReceiver(PendingIntent pendingintent)
	{
		mImpl.setMediaButtonReceiver(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #277 <Method void MediaSessionCompat$MediaSessionImpl.setMediaButtonReceiver(PendingIntent)>
	//    4   10:return          
	}

	public void setMetadata(MediaMetadataCompat mediametadatacompat)
	{
		mImpl.setMetadata(mediametadatacompat);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #445 <Method void MediaSessionCompat$MediaSessionImpl.setMetadata(MediaMetadataCompat)>
	//    4   10:return          
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		mImpl.setPlaybackState(playbackstatecompat);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #448 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackState(PlaybackStateCompat)>
	//    4   10:return          
	}

	public void setPlaybackToLocal(int i)
	{
		mImpl.setPlaybackToLocal(i);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #451 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackToLocal(int)>
	//    4   10:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		if(volumeprovidercompat == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("volumeProvider may not be null!");
	//    2    4:new             #228 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #455 <String "volumeProvider may not be null!">
	//    5   11:invokespecial   #233 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mImpl.setPlaybackToRemote(volumeprovidercompat);
	//    7   15:aload_0         
	//    8   16:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    9   19:aload_1         
	//   10   20:invokeinterface #457 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackToRemote(VolumeProviderCompat)>
			return;
	//   11   25:return          
		}
	}

	public void setQueue(List list)
	{
		mImpl.setQueue(list);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #461 <Method void MediaSessionCompat$MediaSessionImpl.setQueue(List)>
	//    4   10:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		mImpl.setQueueTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #467 <Method void MediaSessionCompat$MediaSessionImpl.setQueueTitle(CharSequence)>
	//    4   10:return          
	}

	public void setRatingType(int i)
	{
		mImpl.setRatingType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #470 <Method void MediaSessionCompat$MediaSessionImpl.setRatingType(int)>
	//    4   10:return          
	}

	public void setRepeatMode(int i)
	{
		mImpl.setRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #473 <Method void MediaSessionCompat$MediaSessionImpl.setRepeatMode(int)>
	//    4   10:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		mImpl.setSessionActivity(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #476 <Method void MediaSessionCompat$MediaSessionImpl.setSessionActivity(PendingIntent)>
	//    4   10:return          
	}

	public void setShuffleMode(int i)
	{
		mImpl.setShuffleMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #479 <Method void MediaSessionCompat$MediaSessionImpl.setShuffleMode(int)>
	//    4   10:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		mImpl.setShuffleModeEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #483 <Method void MediaSessionCompat$MediaSessionImpl.setShuffleModeEnabled(boolean)>
	//    4   10:return          
	}

	static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
	static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
	static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
	static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
	static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
	static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
	static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
	static final String ACTION_ARGUMENT_SHUFFLE_MODE_ENABLED = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED";
	static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
	public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
	public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
	static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
	static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
	static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
	static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
	static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
	static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
	static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
	static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
	static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
	static final String ACTION_SET_SHUFFLE_MODE_ENABLED = "android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED";
	public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
	public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
	public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
	public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
	static final String EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
	public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
	public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
	public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
	private static final int MAX_BITMAP_SIZE_IN_DP = 320;
	public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
	public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
	public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
	static final String TAG = "MediaSessionCompat";
	static int sMaxBitmapSize;
	private final ArrayList mActiveListeners;
	private final MediaControllerCompat mController;
	private final MediaSessionImpl mImpl;


/*
	static PlaybackStateCompat access$500(PlaybackStateCompat playbackstatecompat, MediaMetadataCompat mediametadatacompat)
	{
		return getStateWithUpdatedPosition(playbackstatecompat, mediametadatacompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #306 <Method PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat, MediaMetadataCompat)>
	//    3    5:areturn         
	}

*/

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
