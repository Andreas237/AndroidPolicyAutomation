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
			if(!mMediaPlayPauseKeyPending)
		//*   0    0:aload_0         
		//*   1    1:getfield        #80  <Field boolean mMediaPlayPauseKeyPending>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			boolean flag2 = false;
		//    4    8:iconst_0        
		//    5    9:istore_3        
			mMediaPlayPauseKeyPending = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #80  <Field boolean mMediaPlayPauseKeyPending>
			mCallbackHandler.removeMessages(1);
		//    9   15:aload_0         
		//   10   16:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   11   19:iconst_1        
		//   12   20:invokevirtual   #84  <Method void MediaSessionCompat$Callback$CallbackHandler.removeMessages(int)>
			Object obj = ((Object) ((MediaSessionImpl)mSessionImpl.get()));
		//   13   23:aload_0         
		//   14   24:getfield        #72  <Field WeakReference mSessionImpl>
		//   15   27:invokevirtual   #90  <Method Object WeakReference.get()>
		//   16   30:checkcast       #92  <Class MediaSessionCompat$MediaSessionImpl>
		//   17   33:astore          6
			if(obj == null)
		//*  18   35:aload           6
		//*  19   37:ifnonnull       41
				return;
		//   20   40:return          
			obj = ((Object) (((MediaSessionImpl) (obj)).getPlaybackState()));
		//   21   41:aload           6
		//   22   43:invokeinterface #96  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImpl.getPlaybackState()>
		//   23   48:astore          6
			long l;
			if(obj == null)
		//*  24   50:aload           6
		//*  25   52:ifnonnull       61
				l = 0L;
		//   26   55:lconst_0        
		//   27   56:lstore          4
			else
		//*  28   58:goto            68
				l = ((PlaybackStateCompat) (obj)).getActions();
		//   29   61:aload           6
		//   30   63:invokevirtual   #102 <Method long PlaybackStateCompat.getActions()>
		//   31   66:lstore          4
			boolean flag;
			if(obj != null && ((PlaybackStateCompat) (obj)).getState() == 3)
		//*  32   68:aload           6
		//*  33   70:ifnull          87
		//*  34   73:aload           6
		//*  35   75:invokevirtual   #106 <Method int PlaybackStateCompat.getState()>
		//*  36   78:iconst_3        
		//*  37   79:icmpne          87
				flag = true;
		//   38   82:iconst_1        
		//   39   83:istore_1        
			else
		//*  40   84:goto            89
				flag = false;
		//   41   87:iconst_0        
		//   42   88:istore_1        
			boolean flag1;
			if((l & 516L) != 0L)
		//*  43   89:lload           4
		//*  44   91:ldc2w           #107 <Long 516L>
		//*  45   94:land            
		//*  46   95:lconst_0        
		//*  47   96:lcmp            
		//*  48   97:ifeq            105
				flag1 = true;
		//   49  100:iconst_1        
		//   50  101:istore_2        
			else
		//*  51  102:goto            107
				flag1 = false;
		//   52  105:iconst_0        
		//   53  106:istore_2        
			if((l & 514L) != 0L)
		//*  54  107:lload           4
		//*  55  109:ldc2w           #109 <Long 514L>
		//*  56  112:land            
		//*  57  113:lconst_0        
		//*  58  114:lcmp            
		//*  59  115:ifeq            120
				flag2 = true;
		//   60  118:iconst_1        
		//   61  119:istore_3        
			if(flag && flag2)
		//*  62  120:iload_1         
		//*  63  121:ifeq            133
		//*  64  124:iload_3         
		//*  65  125:ifeq            133
			{
				onPause();
		//   66  128:aload_0         
		//   67  129:invokevirtual   #113 <Method void onPause()>
				return;
		//   68  132:return          
			}
			if(!flag && flag1)
		//*  69  133:iload_1         
		//*  70  134:ifne            145
		//*  71  137:iload_2         
		//*  72  138:ifeq            145
				onPlay();
		//   73  141:aload_0         
		//   74  142:invokevirtual   #116 <Method void onPlay()>
		//   75  145:return          
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
			MediaSessionImpl mediasessionimpl = (MediaSessionImpl)mSessionImpl.get();
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field WeakReference mSessionImpl>
		//    2    4:invokevirtual   #90  <Method Object WeakReference.get()>
		//    3    7:checkcast       #92  <Class MediaSessionCompat$MediaSessionImpl>
		//    4   10:astore          5
			if(mediasessionimpl != null)
		//*   5   12:aload           5
		//*   6   14:ifnull          165
			{
				if(mCallbackHandler == null)
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
				if(intent != null)
		//*  17   36:aload_1         
		//*  18   37:ifnull          163
				{
					if(((KeyEvent) (intent)).getAction() != 0)
		//*  19   40:aload_1         
		//*  20   41:invokevirtual   #154 <Method int KeyEvent.getAction()>
		//*  21   44:ifeq            49
						return false;
		//   22   47:iconst_0        
		//   23   48:ireturn         
					int i = ((KeyEvent) (intent)).getKeyCode();
		//   24   49:aload_1         
		//   25   50:invokevirtual   #157 <Method int KeyEvent.getKeyCode()>
		//   26   53:istore_2        
					if(i != 79 && i != 85)
		//*  27   54:iload_2         
		//*  28   55:bipush          79
		//*  29   57:icmpeq          72
		//*  30   60:iload_2         
		//*  31   61:bipush          85
		//*  32   63:icmpeq          72
					{
						handleMediaPlayPauseKeySingleTapIfPending();
		//   33   66:aload_0         
		//   34   67:invokespecial   #68  <Method void handleMediaPlayPauseKeySingleTapIfPending()>
						return false;
		//   35   70:iconst_0        
		//   36   71:ireturn         
					}
					if(((KeyEvent) (intent)).getRepeatCount() > 0)
		//*  37   72:aload_1         
		//*  38   73:invokevirtual   #160 <Method int KeyEvent.getRepeatCount()>
		//*  39   76:ifle            85
					{
						handleMediaPlayPauseKeySingleTapIfPending();
		//   40   79:aload_0         
		//   41   80:invokespecial   #68  <Method void handleMediaPlayPauseKeySingleTapIfPending()>
						return true;
		//   42   83:iconst_1        
		//   43   84:ireturn         
					}
					if(mMediaPlayPauseKeyPending)
		//*  44   85:aload_0         
		//*  45   86:getfield        #80  <Field boolean mMediaPlayPauseKeyPending>
		//*  46   89:ifeq            143
					{
						mCallbackHandler.removeMessages(1);
		//   47   92:aload_0         
		//   48   93:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   49   96:iconst_1        
		//   50   97:invokevirtual   #84  <Method void MediaSessionCompat$Callback$CallbackHandler.removeMessages(int)>
						mMediaPlayPauseKeyPending = false;
		//   51  100:aload_0         
		//   52  101:iconst_0        
		//   53  102:putfield        #80  <Field boolean mMediaPlayPauseKeyPending>
						intent = ((Intent) (mediasessionimpl.getPlaybackState()));
		//   54  105:aload           5
		//   55  107:invokeinterface #96  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImpl.getPlaybackState()>
		//   56  112:astore_1        
						long l;
						if(intent == null)
		//*  57  113:aload_1         
		//*  58  114:ifnonnull       122
							l = 0L;
		//   59  117:lconst_0        
		//   60  118:lstore_3        
						else
		//*  61  119:goto            127
							l = ((PlaybackStateCompat) (intent)).getActions();
		//   62  122:aload_1         
		//   63  123:invokevirtual   #102 <Method long PlaybackStateCompat.getActions()>
		//   64  126:lstore_3        
						if((l & 32L) != 0L)
		//*  65  127:lload_3         
		//*  66  128:ldc2w           #161 <Long 32L>
		//*  67  131:land            
		//*  68  132:lconst_0        
		//*  69  133:lcmp            
		//*  70  134:ifeq            161
						{
							onSkipToNext();
		//   71  137:aload_0         
		//   72  138:invokevirtual   #165 <Method void onSkipToNext()>
							return true;
		//   73  141:iconst_1        
		//   74  142:ireturn         
						}
					} else
					{
						mMediaPlayPauseKeyPending = true;
		//   75  143:aload_0         
		//   76  144:iconst_1        
		//   77  145:putfield        #80  <Field boolean mMediaPlayPauseKeyPending>
						mCallbackHandler.sendEmptyMessageDelayed(1, ViewConfiguration.getDoubleTapTimeout());
		//   78  148:aload_0         
		//   79  149:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
		//   80  152:iconst_1        
		//   81  153:invokestatic    #170 <Method int ViewConfiguration.getDoubleTapTimeout()>
		//   82  156:i2l             
		//   83  157:invokevirtual   #174 <Method boolean MediaSessionCompat$Callback$CallbackHandler.sendEmptyMessageDelayed(int, long)>
		//   84  160:pop             
					}
					return true;
		//   85  161:iconst_1        
		//   86  162:ireturn         
				} else
				{
					return false;
		//   87  163:iconst_0        
		//   88  164:ireturn         
				}
			} else
			{
				return false;
		//   89  165:iconst_0        
		//   90  166:ireturn         
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
			boolean flag = s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
		//    0    0:aload_1         
		//    1    1:ldc1            #31  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    2    3:invokevirtual   #37  <Method boolean String.equals(Object)>
		//    3    6:istore          5
			Object obj;
			Object obj1;
			obj1 = null;
		//    4    8:aconst_null     
		//    5    9:astore          7
			obj = null;
		//    6   11:aconst_null     
		//    7   12:astore          6
			if(!flag)
				break MISSING_BLOCK_LABEL_84;
		//    8   14:iload           5
		//    9   16:ifeq            84
			s = ((String) ((MediaSessionImplApi21)mSessionImpl.get()));
		//   10   19:aload_0         
		//   11   20:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   12   23:invokestatic    #41  <Method WeakReference MediaSessionCompat$Callback.access$100(MediaSessionCompat$Callback)>
		//   13   26:invokevirtual   #47  <Method Object WeakReference.get()>
		//   14   29:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
		//   15   32:astore_1        
			if(s == null)
				break MISSING_BLOCK_LABEL_313;
		//   16   33:aload_1         
		//   17   34:ifnull          313
			bundle = new Bundle();
		//   18   37:new             #51  <Class Bundle>
		//   19   40:dup             
		//   20   41:invokespecial   #52  <Method void Bundle()>
		//   21   44:astore_2        
			s = ((String) (((MediaSessionImplApi21) (s)).getSessionToken().getExtraBinder()));
		//   22   45:aload_1         
		//   23   46:invokevirtual   #56  <Method MediaSessionCompat$Token MediaSessionCompat$MediaSessionImplApi21.getSessionToken()>
		//   24   49:invokevirtual   #62  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
		//   25   52:astore_1        
			if(s == null)
		//*  26   53:aload_1         
		//*  27   54:ifnonnull       63
			{
				s = ((String) (obj));
		//   28   57:aload           6
		//   29   59:astore_1        
				break MISSING_BLOCK_LABEL_70;
		//   30   60:goto            70
			}
			s = ((String) (((IMediaSession) (s)).asBinder()));
		//   31   63:aload_1         
		//   32   64:invokeinterface #68  <Method IBinder IMediaSession.asBinder()>
		//   33   69:astore_1        
			BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((IBinder) (s)));
		//   34   70:aload_2         
		//   35   71:ldc1            #70  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   36   73:aload_1         
		//   37   74:invokestatic    #76  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
			resultreceiver.send(0, bundle);
		//   38   77:aload_3         
		//   39   78:iconst_0        
		//   40   79:aload_2         
		//   41   80:invokevirtual   #82  <Method void ResultReceiver.send(int, Bundle)>
			return;
		//   42   83:return          
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM"))
		//*  43   84:aload_1         
		//*  44   85:ldc1            #84  <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//*  45   87:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  46   90:ifeq            119
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   47   93:aload_2         
		//   48   94:ldc1            #86  <Class MediaDescriptionCompat>
		//   49   96:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//   50   99:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   51  102:aload_0         
		//   52  103:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   53  106:aload_2         
		//   54  107:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   55  109:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   56  112:checkcast       #86  <Class MediaDescriptionCompat>
		//   57  115:invokevirtual   #106 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//   58  118:return          
			}
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"))
		//*  59  119:aload_1         
		//*  60  120:ldc1            #108 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//*  61  122:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  62  125:ifeq            160
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   63  128:aload_2         
		//   64  129:ldc1            #86  <Class MediaDescriptionCompat>
		//   65  131:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//   66  134:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
		//   67  137:aload_0         
		//   68  138:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   69  141:aload_2         
		//   70  142:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   71  144:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   72  147:checkcast       #86  <Class MediaDescriptionCompat>
		//   73  150:aload_2         
		//   74  151:ldc1            #110 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   75  153:invokevirtual   #114 <Method int Bundle.getInt(String)>
		//   76  156:invokevirtual   #117 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//   77  159:return          
			}
			if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"))
		//*  78  160:aload_1         
		//*  79  161:ldc1            #119 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//*  80  163:invokevirtual   #37  <Method boolean String.equals(Object)>
		//*  81  166:ifeq            195
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   82  169:aload_2         
		//   83  170:ldc1            #86  <Class MediaDescriptionCompat>
		//   84  172:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//   85  175:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				onRemoveQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   86  178:aload_0         
		//   87  179:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//   88  182:aload_2         
		//   89  183:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   90  185:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//   91  188:checkcast       #86  <Class MediaDescriptionCompat>
		//   92  191:invokevirtual   #122 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//   93  194:return          
			}
			if(!s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"))
				break MISSING_BLOCK_LABEL_294;
		//   94  195:aload_1         
		//   95  196:ldc1            #124 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT">
		//   96  198:invokevirtual   #37  <Method boolean String.equals(Object)>
		//   97  201:ifeq            294
			resultreceiver = ((ResultReceiver) ((MediaSessionImplApi21)mSessionImpl.get()));
		//   98  204:aload_0         
		//   99  205:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  100  208:invokestatic    #41  <Method WeakReference MediaSessionCompat$Callback.access$100(MediaSessionCompat$Callback)>
		//  101  211:invokevirtual   #47  <Method Object WeakReference.get()>
		//  102  214:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
		//  103  217:astore_3        
			if(resultreceiver == null)
				break MISSING_BLOCK_LABEL_313;
		//  104  218:aload_3         
		//  105  219:ifnull          313
			int i;
			if(((MediaSessionImplApi21) (resultreceiver)).mQueue == null)
				break MISSING_BLOCK_LABEL_313;
		//  106  222:aload_3         
		//  107  223:invokestatic    #128 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//  108  226:ifnull          313
			i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
		//  109  229:aload_2         
		//  110  230:ldc1            #110 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//  111  232:iconst_m1       
		//  112  233:invokevirtual   #131 <Method int Bundle.getInt(String, int)>
		//  113  236:istore          4
			s = ((String) (obj1));
		//  114  238:aload           7
		//  115  240:astore_1        
			if(i < 0)
				break MISSING_BLOCK_LABEL_278;
		//  116  241:iload           4
		//  117  243:iflt            278
			s = ((String) (obj1));
		//  118  246:aload           7
		//  119  248:astore_1        
			if(i < ((MediaSessionImplApi21) (resultreceiver)).mQueue.size())
		//* 120  249:iload           4
		//* 121  251:aload_3         
		//* 122  252:invokestatic    #128 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//* 123  255:invokeinterface #137 <Method int List.size()>
		//* 124  260:icmpge          278
				s = ((String) ((QueueItem)((MediaSessionImplApi21) (resultreceiver)).mQueue.get(i)));
		//  125  263:aload_3         
		//  126  264:invokestatic    #128 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//  127  267:iload           4
		//  128  269:invokeinterface #140 <Method Object List.get(int)>
		//  129  274:checkcast       #142 <Class MediaSessionCompat$QueueItem>
		//  130  277:astore_1        
			if(s != null)
		//* 131  278:aload_1         
		//* 132  279:ifnull          313
				try
				{
					onRemoveQueueItem(((QueueItem) (s)).getDescription());
		//  133  282:aload_0         
		//  134  283:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  135  286:aload_1         
		//  136  287:invokevirtual   #146 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//  137  290:invokevirtual   #122 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
					return;
		//  138  293:return          
				}
		//* 139  294:aload_0         
		//* 140  295:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//* 141  298:aload_1         
		//* 142  299:aload_2         
		//* 143  300:aload_3         
		//* 144  301:invokevirtual   #148 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
		//* 145  304:return          
		//* 146  305:ldc1            #150 <String "MediaSessionCompat">
		//* 147  307:ldc1            #152 <String "Could not unparcel the extra data.">
		//* 148  309:invokestatic    #158 <Method int Log.e(String, String)>
		//* 149  312:pop             
		//* 150  313:return          
				// Misplaced declaration of an exception variable
				catch(String s)
				{
					Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
				}
			break MISSING_BLOCK_LABEL_313;
			Callback.this.onCommand(s, bundle, resultreceiver);
			return;
		//* 151  314:astore_1        
		//* 152  315:goto            305
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
		//  102  197:invokevirtual   #114 <Method int Bundle.getInt(String)>
		//  103  200:istore_3        
				onSetRepeatMode(i);
		//  104  201:aload_0         
		//  105  202:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  106  205:iload_3         
		//  107  206:invokevirtual   #224 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
				return;
		//  108  209:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
		//* 109  210:aload_1         
		//* 110  211:ldc1            #226 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE">
		//* 111  213:invokevirtual   #37  <Method boolean String.equals(Object)>
		//* 112  216:ifeq            235
			{
				int j = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
		//  113  219:aload_2         
		//  114  220:ldc1            #228 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE">
		//  115  222:invokevirtual   #114 <Method int Bundle.getInt(String)>
		//  116  225:istore_3        
				onSetShuffleMode(j);
		//  117  226:aload_0         
		//  118  227:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  119  230:iload_3         
		//  120  231:invokevirtual   #231 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
				return;
		//  121  234:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_RATING"))
		//* 122  235:aload_1         
		//* 123  236:ldc1            #233 <String "android.support.v4.media.session.action.SET_RATING">
		//* 124  238:invokevirtual   #37  <Method boolean String.equals(Object)>
		//* 125  241:ifeq            280
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/RatingCompat)).getClassLoader());
		//  126  244:aload_2         
		//  127  245:ldc1            #235 <Class RatingCompat>
		//  128  247:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
		//  129  250:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
				s = ((String) ((RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING")));
		//  130  253:aload_2         
		//  131  254:ldc1            #237 <String "android.support.v4.media.session.action.ARGUMENT_RATING">
		//  132  256:invokevirtual   #102 <Method Parcelable Bundle.getParcelable(String)>
		//  133  259:checkcast       #235 <Class RatingCompat>
		//  134  262:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//  135  263:aload_2         
		//  136  264:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//  137  266:invokevirtual   #189 <Method Bundle Bundle.getBundle(String)>
		//  138  269:astore_2        
				Callback.this.onSetRating(((RatingCompat) (s)), bundle);
		//  139  270:aload_0         
		//  140  271:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  141  274:aload_1         
		//  142  275:aload_2         
		//  143  276:invokevirtual   #241 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//  144  279:return          
			} else
			{
				Callback.this.onCustomAction(s, bundle);
		//  145  280:aload_0         
		//  146  281:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  147  284:aload_1         
		//  148  285:aload_2         
		//  149  286:invokevirtual   #243 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  150  289:return          
			}
		}

		public void onFastForward()
		{
			Callback.this.onFastForward();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #246 <Method void MediaSessionCompat$Callback.onFastForward()>
		//    3    7:return          
		}

		public boolean onMediaButtonEvent(Intent intent)
		{
			return Callback.this.onMediaButtonEvent(intent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #250 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//    4    8:ireturn         
		}

		public void onPause()
		{
			Callback.this.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #253 <Method void MediaSessionCompat$Callback.onPause()>
		//    3    7:return          
		}

		public void onPlay()
		{
			Callback.this.onPlay();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #256 <Method void MediaSessionCompat$Callback.onPlay()>
		//    3    7:return          
		}

		public void onPlayFromMediaId(String s, Bundle bundle)
		{
			Callback.this.onPlayFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #259 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPlayFromSearch(String s, Bundle bundle)
		{
			Callback.this.onPlayFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #262 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onRewind()
		{
			Callback.this.onRewind();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #265 <Method void MediaSessionCompat$Callback.onRewind()>
		//    3    7:return          
		}

		public void onSeekTo(long l)
		{
			Callback.this.onSeekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #269 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
		//    4    8:return          
		}

		public void onSetRating(Object obj)
		{
			Callback.this.onSetRating(RatingCompat.fromRating(obj));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #274 <Method RatingCompat RatingCompat.fromRating(Object)>
		//    4    8:invokevirtual   #277 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
		//    5   11:return          
		}

		public void onSetRating(Object obj, Bundle bundle)
		{
			Callback.this.onSetRating(RatingCompat.fromRating(obj), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #274 <Method RatingCompat RatingCompat.fromRating(Object)>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #241 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
		//    6   12:return          
		}

		public void onSkipToNext()
		{
			Callback.this.onSkipToNext();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #281 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		//    3    7:return          
		}

		public void onSkipToPrevious()
		{
			Callback.this.onSkipToPrevious();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #284 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		//    3    7:return          
		}

		public void onSkipToQueueItem(long l)
		{
			Callback.this.onSkipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #287 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
		//    4    8:return          
		}

		public void onStop()
		{
			Callback.this.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #290 <Method void MediaSessionCompat$Callback.onStop()>
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
		//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmpge          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			else
				return MediaSessionCompatApi24.getCallingPackage(mSessionObj);
		//    5   10:aload_0         
		//    6   11:getfield        #56  <Field Object mSessionObj>
		//    7   14:invokestatic    #104 <Method String MediaSessionCompatApi24.getCallingPackage(Object)>
		//    8   17:areturn         
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
		//    1    1:getfield        #88  <Field PlaybackStateCompat mPlaybackState>
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
		//    2    4:invokestatic    #115 <Method boolean MediaSessionCompatApi21.isActive(Object)>
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
		//    5    9:invokestatic    #118 <Method void MediaSessionCompatApi21.release(Object)>
		//    6   12:return          
		}

		public void sendSessionEvent(String s, Bundle bundle)
		{
			if(android.os.Build.VERSION.SDK_INT < 23)
		//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          23
		//*   2    5:icmpge          58
			{
				int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    3    8:aload_0         
		//    4    9:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    5   12:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
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
		//   14   27:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   15   30:checkcast       #132 <Class IMediaControllerCallback>
		//   16   33:astore          4
					try
					{
						imediacontrollercallback.onEvent(s, bundle);
		//   17   35:aload           4
		//   18   37:aload_1         
		//   19   38:aload_2         
		//   20   39:invokeinterface #135 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
					}
		//*  21   44:iload_3         
		//*  22   45:iconst_1        
		//*  23   46:isub            
		//*  24   47:istore_3        
		//*  25   48:goto            18
		//*  26   51:aload_0         
		//*  27   52:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  28   55:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
		//*  29   58:aload_0         
		//*  30   59:getfield        #56  <Field Object mSessionObj>
		//*  31   62:aload_1         
		//*  32   63:aload_2         
		//*  33   64:invokestatic    #141 <Method void MediaSessionCompatApi21.sendSessionEvent(Object, String, Bundle)>
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
		//    3    5:invokestatic    #146 <Method void MediaSessionCompatApi21.setActive(Object, boolean)>
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
		//    9   16:getfield        #153 <Field Object MediaSessionCompat$Callback.mCallbackObj>
		//   10   19:astore_3        
			MediaSessionCompatApi21.setCallback(obj1, obj, handler);
		//   11   20:aload           4
		//   12   22:aload_3         
		//   13   23:aload_2         
		//   14   24:invokestatic    #156 <Method void MediaSessionCompatApi21.setCallback(Object, Object, Handler)>
			if(callback != null)
		//*  15   27:aload_1         
		//*  16   28:ifnull          37
				callback.setSessionImpl(((MediaSessionImpl) (this)), handler);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:aload_2         
		//   20   34:invokestatic    #160 <Method void MediaSessionCompat$Callback.access$300(MediaSessionCompat$Callback, MediaSessionCompat$MediaSessionImpl, Handler)>
		//   21   37:return          
		}

		public void setCaptioningEnabled(boolean flag)
		{
			if(mCaptioningEnabled != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #163 <Field boolean mCaptioningEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mCaptioningEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #163 <Field boolean mCaptioningEnabled>
				int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
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
		//   18   32:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #132 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onCaptioningEnabledChanged(flag);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #166 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #171 <Method void MediaSessionCompatApi21.setExtras(Object, Bundle)>
		//    4    8:return          
		}

		public void setFlags(int i)
		{
			MediaSessionCompatApi21.setFlags(mSessionObj, i);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #176 <Method void MediaSessionCompatApi21.setFlags(Object, int)>
		//    4    8:return          
		}

		public void setMediaButtonReceiver(PendingIntent pendingintent)
		{
			MediaSessionCompatApi21.setMediaButtonReceiver(mSessionObj, pendingintent);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #181 <Method void MediaSessionCompatApi21.setMediaButtonReceiver(Object, PendingIntent)>
		//    4    8:return          
		}

		public void setMetadata(MediaMetadataCompat mediametadatacompat)
		{
			mMetadata = mediametadatacompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #92  <Field MediaMetadataCompat mMetadata>
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
		//   12   20:invokevirtual   #188 <Method Object MediaMetadataCompat.getMediaMetadata()>
		//   13   23:astore_1        
			MediaSessionCompatApi21.setMetadata(obj, ((Object) (mediametadatacompat)));
		//   14   24:aload_2         
		//   15   25:aload_1         
		//   16   26:invokestatic    #191 <Method void MediaSessionCompatApi21.setMetadata(Object, Object)>
		//   17   29:return          
		}

		public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
		{
			mPlaybackState = playbackstatecompat;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #88  <Field PlaybackStateCompat mPlaybackState>
			int i = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    3    5:aload_0         
		//    4    6:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    5    9:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
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
		//   14   24:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   15   27:checkcast       #132 <Class IMediaControllerCallback>
		//   16   30:astore_3        
				try
				{
					((IMediaControllerCallback) (obj)).onPlaybackStateChanged(playbackstatecompat);
		//   17   31:aload_3         
		//   18   32:aload_1         
		//   19   33:invokeinterface #196 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
				}
		//*  20   38:iload_2         
		//*  21   39:iconst_1        
		//*  22   40:isub            
		//*  23   41:istore_2        
		//*  24   42:goto            15
		//*  25   45:aload_0         
		//*  26   46:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  27   49:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
		//*  28   52:aload_0         
		//*  29   53:getfield        #56  <Field Object mSessionObj>
		//*  30   56:astore_3        
		//*  31   57:aload_1         
		//*  32   58:ifnonnull       66
		//*  33   61:aconst_null     
		//*  34   62:astore_1        
		//*  35   63:goto            71
		//*  36   66:aload_1         
		//*  37   67:invokevirtual   #200 <Method Object PlaybackStateCompat.getPlaybackState()>
		//*  38   70:astore_1        
		//*  39   71:aload_3         
		//*  40   72:aload_1         
		//*  41   73:invokestatic    #202 <Method void MediaSessionCompatApi21.setPlaybackState(Object, Object)>
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
		//    3    5:invokestatic    #205 <Method void MediaSessionCompatApi21.setPlaybackToLocal(Object, int)>
		//    4    8:return          
		}

		public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
		{
			MediaSessionCompatApi21.setPlaybackToRemote(mSessionObj, volumeprovidercompat.getVolumeProvider());
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #212 <Method Object VolumeProviderCompat.getVolumeProvider()>
		//    4    8:invokestatic    #214 <Method void MediaSessionCompatApi21.setPlaybackToRemote(Object, Object)>
		//    5   11:return          
		}

		public void setQueue(List list)
		{
			mQueue = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #80  <Field List mQueue>
			if(list != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          57
			{
				ArrayList arraylist = new ArrayList();
		//    5    9:new             #218 <Class ArrayList>
		//    6   12:dup             
		//    7   13:invokespecial   #219 <Method void ArrayList()>
		//    8   16:astore_2        
				Iterator iterator = list.iterator();
		//    9   17:aload_1         
		//   10   18:invokeinterface #225 <Method Iterator List.iterator()>
		//   11   23:astore_3        
				do
				{
					list = ((List) (arraylist));
		//   12   24:aload_2         
		//   13   25:astore_1        
					if(!iterator.hasNext())
						break;
		//   14   26:aload_3         
		//   15   27:invokeinterface #230 <Method boolean Iterator.hasNext()>
		//   16   32:ifeq            59
					((List) (arraylist)).add(((QueueItem)iterator.next()).getQueueItem());
		//   17   35:aload_2         
		//   18   36:aload_3         
		//   19   37:invokeinterface #233 <Method Object Iterator.next()>
		//   20   42:checkcast       #235 <Class MediaSessionCompat$QueueItem>
		//   21   45:invokevirtual   #238 <Method Object MediaSessionCompat$QueueItem.getQueueItem()>
		//   22   48:invokeinterface #241 <Method boolean List.add(Object)>
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
		//   30   64:invokestatic    #244 <Method void MediaSessionCompatApi21.setQueue(Object, List)>
		//   31   67:return          
		}

		public void setQueueTitle(CharSequence charsequence)
		{
			MediaSessionCompatApi21.setQueueTitle(mSessionObj, charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object mSessionObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #251 <Method void MediaSessionCompatApi21.setQueueTitle(Object, CharSequence)>
		//    4    8:return          
		}

		public void setRatingType(int i)
		{
			if(android.os.Build.VERSION.SDK_INT < 22)
		//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          22
		//*   2    5:icmpge          14
			{
				mRatingType = i;
		//    3    8:aload_0         
		//    4    9:iload_1         
		//    5   10:putfield        #254 <Field int mRatingType>
				return;
		//    6   13:return          
			} else
			{
				MediaSessionCompatApi22.setRatingType(mSessionObj, i);
		//    7   14:aload_0         
		//    8   15:getfield        #56  <Field Object mSessionObj>
		//    9   18:iload_1         
		//   10   19:invokestatic    #258 <Method void MediaSessionCompatApi22.setRatingType(Object, int)>
				return;
		//   11   22:return          
			}
		}

		public void setRepeatMode(int i)
		{
			if(mRepeatMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #261 <Field int mRepeatMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mRepeatMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #261 <Field int mRepeatMode>
				int j = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
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
		//   18   32:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #132 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onRepeatModeChanged(i);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #264 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    3    5:invokestatic    #267 <Method void MediaSessionCompatApi21.setSessionActivity(Object, PendingIntent)>
		//    4    8:return          
		}

		public void setShuffleMode(int i)
		{
			if(mShuffleMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #270 <Field int mShuffleMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          60
			{
				mShuffleMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #270 <Field int mShuffleMode>
				int j = mExtraControllerCallbacks.beginBroadcast() - 1;
		//    7   13:aload_0         
		//    8   14:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    9   17:invokevirtual   #126 <Method int RemoteCallbackList.beginBroadcast()>
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
		//   18   32:invokevirtual   #130 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   19   35:checkcast       #132 <Class IMediaControllerCallback>
		//   20   38:astore_3        
					try
					{
						imediacontrollercallback.onShuffleModeChanged(i);
		//   21   39:aload_3         
		//   22   40:iload_1         
		//   23   41:invokeinterface #273 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
					}
		//*  24   46:iload_2         
		//*  25   47:iconst_1        
		//*  26   48:isub            
		//*  27   49:istore_2        
		//*  28   50:goto            23
		//*  29   53:aload_0         
		//*  30   54:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//*  31   57:invokevirtual   #138 <Method void RemoteCallbackList.finishBroadcast()>
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
		private boolean mDestroyed;
		private final RemoteCallbackList mExtraControllerCallbacks;
		private MediaMetadataCompat mMetadata;
		private PlaybackStateCompat mPlaybackState;
		private List mQueue;
		int mRatingType;
		int mRepeatMode;
		private final Object mSessionObj;
		int mShuffleMode;
		private final Token mToken;


/*
		static List access$200(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mQueue;
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field List mQueue>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$600(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mDestroyed;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field boolean mDestroyed>
		//    2    4:ireturn         
		}

*/


/*
		static RemoteCallbackList access$700(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mExtraControllerCallbacks;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field RemoteCallbackList mExtraControllerCallbacks>
		//    2    4:areturn         
		}

*/


/*
		static PlaybackStateCompat access$800(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mPlaybackState;
		//    0    0:aload_0         
		//    1    1:getfield        #88  <Field PlaybackStateCompat mPlaybackState>
		//    2    4:areturn         
		}

*/


/*
		static MediaMetadataCompat access$900(MediaSessionImplApi21 mediasessionimplapi21)
		{
			return mediasessionimplapi21.mMetadata;
		//    0    0:aload_0         
		//    1    1:getfield        #92  <Field MediaMetadataCompat mMetadata>
		//    2    4:areturn         
		}

*/

		public MediaSessionImplApi21(Context context, String s)
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
			mToken = new Token(((Object) (MediaSessionCompatApi21.getSessionToken(mSessionObj))), ((IMediaSession) (new ExtraSession())));
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
		//   25   49:invokespecial   #68  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
		//   26   52:putfield        #70  <Field MediaSessionCompat$Token mToken>
		//   27   55:return          
		}

		public MediaSessionImplApi21(Object obj)
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
		//   24   48:invokespecial   #68  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
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
		//*   2    4:invokestatic    #111 <Method boolean MediaSessionCompat$MediaSessionImplApi21.access$600(MediaSessionCompat$MediaSessionImplApi21)>
		//*   3    7:ifne            22
				mExtraControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)));
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplApi21 this$0>
		//    6   14:invokestatic    #115 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #121 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
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
		//    2    4:invokestatic    #115 <Method RemoteCallbackList MediaSessionCompat$MediaSessionImplApi21.access$700(MediaSessionCompat$MediaSessionImplApi21)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #144 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onCaptioningEnabledChanged(flag);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #176 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_3        
			while(i >= 0) 
		//*   6   10:iload_3         
		//*   7   11:iflt            43
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_3         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore          4
				try
				{
					imediacontrollercallback.onEvent(s, bundle);
		//   14   27:aload           4
		//   15   29:aload_1         
		//   16   30:aload_2         
		//   17   31:invokeinterface #184 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
				}
		//*  18   36:iload_3         
		//*  19   37:iconst_1        
		//*  20   38:isub            
		//*  21   39:istore_3        
		//*  22   40:goto            10
		//*  23   43:aload_0         
		//*  24   44:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  25   47:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onExtrasChanged(bundle);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #189 <Method void IMediaControllerCallback.onExtrasChanged(Bundle)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onMetadataChanged(mediametadatacompat);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #194 <Method void IMediaControllerCallback.onMetadataChanged(MediaMetadataCompat)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onQueueChanged(list);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #199 <Method void IMediaControllerCallback.onQueueChanged(List)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onQueueTitleChanged(charsequence);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #206 <Method void IMediaControllerCallback.onQueueTitleChanged(CharSequence)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(j >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onRepeatModeChanged(i);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #211 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_1        
			while(i >= 0) 
		//*   6   10:iload_1         
		//*   7   11:iflt            39
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_1         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_2        
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//   14   26:aload_2         
		//   15   27:invokeinterface #215 <Method void IMediaControllerCallback.onSessionDestroyed()>
				}
		//*  16   32:iload_1         
		//*  17   33:iconst_1        
		//*  18   34:isub            
		//*  19   35:istore_1        
		//*  20   36:goto            10
		//*  21   39:aload_0         
		//*  22   40:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  23   43:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
		//*  24   46:aload_0         
		//*  25   47:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  26   50:invokevirtual   #218 <Method void RemoteCallbackList.kill()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(j >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onShuffleModeChanged(i);
		//   14   26:aload_3         
		//   15   27:iload_1         
		//   16   28:invokeinterface #222 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #227 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//*   1    1:getfield        #149 <Field int mVolumeType>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          24
			{
				if(mVolumeProvider != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//*   6   12:ifnull          37
				{
					mVolumeProvider.onAdjustVolume(i);
		//    7   15:aload_0         
		//    8   16:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//    9   19:iload_1         
		//   10   20:invokevirtual   #236 <Method void VolumeProviderCompat.onAdjustVolume(int)>
					return;
		//   11   23:return          
				}
			} else
			{
				mAudioManager.adjustStreamVolume(mLocalStream, i, j);
		//   12   24:aload_0         
		//   13   25:getfield        #129 <Field AudioManager mAudioManager>
		//   14   28:aload_0         
		//   15   29:getfield        #151 <Field int mLocalStream>
		//   16   32:iload_1         
		//   17   33:iload_2         
		//   18   34:invokevirtual   #240 <Method void AudioManager.adjustStreamVolume(int, int, int)>
			}
		//   19   37:return          
		}

		android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
		{
			android.media.RemoteControlClient.MetadataEditor metadataeditor = mRcc.editMetadata(true);
		//    0    0:aload_0         
		//    1    1:getfield        #158 <Field RemoteControlClient mRcc>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #246 <Method android.media.RemoteControlClient$MetadataEditor RemoteControlClient.editMetadata(boolean)>
		//    4    8:astore          4
			if(bundle == null)
		//*   5   10:aload_1         
		//*   6   11:ifnonnull       17
				return metadataeditor;
		//    7   14:aload           4
		//    8   16:areturn         
			if(bundle.containsKey("android.media.metadata.ART"))
		//*   9   17:aload_1         
		//*  10   18:ldc1            #248 <String "android.media.metadata.ART">
		//*  11   20:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//*  12   23:ifeq            64
			{
				Bitmap bitmap2 = (Bitmap)bundle.getParcelable("android.media.metadata.ART");
		//   13   26:aload_1         
		//   14   27:ldc1            #248 <String "android.media.metadata.ART">
		//   15   29:invokevirtual   #258 <Method Parcelable Bundle.getParcelable(String)>
		//   16   32:checkcast       #260 <Class Bitmap>
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
		//   24   44:invokevirtual   #264 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
		//   25   47:iconst_0        
		//   26   48:invokevirtual   #268 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
		//   27   51:astore_2        
				metadataeditor.putBitmap(100, bitmap);
		//   28   52:aload           4
		//   29   54:bipush          100
		//   30   56:aload_2         
		//   31   57:invokevirtual   #274 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
		//   32   60:pop             
			} else
		//*  33   61:goto            110
			if(bundle.containsKey("android.media.metadata.ALBUM_ART"))
		//*  34   64:aload_1         
		//*  35   65:ldc2            #276 <String "android.media.metadata.ALBUM_ART">
		//*  36   68:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//*  37   71:ifeq            110
			{
				Bitmap bitmap3 = (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART");
		//   38   74:aload_1         
		//   39   75:ldc2            #276 <String "android.media.metadata.ALBUM_ART">
		//   40   78:invokevirtual   #258 <Method Parcelable Bundle.getParcelable(String)>
		//   41   81:checkcast       #260 <Class Bitmap>
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
		//   49   93:invokevirtual   #264 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
		//   50   96:iconst_0        
		//   51   97:invokevirtual   #268 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
		//   52  100:astore_2        
				metadataeditor.putBitmap(100, bitmap1);
		//   53  101:aload           4
		//   54  103:bipush          100
		//   55  105:aload_2         
		//   56  106:invokevirtual   #274 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
		//   57  109:pop             
			}
			if(bundle.containsKey("android.media.metadata.ALBUM"))
		//*  58  110:aload_1         
		//*  59  111:ldc2            #278 <String "android.media.metadata.ALBUM">
		//*  60  114:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//*  61  117:ifeq            134
				metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
		//   62  120:aload           4
		//   63  122:iconst_1        
		//   64  123:aload_1         
		//   65  124:ldc2            #278 <String "android.media.metadata.ALBUM">
		//   66  127:invokevirtual   #282 <Method String Bundle.getString(String)>
		//   67  130:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   68  133:pop             
			if(bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
		//*  69  134:aload_1         
		//*  70  135:ldc2            #288 <String "android.media.metadata.ALBUM_ARTIST">
		//*  71  138:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//*  72  141:ifeq            159
				metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
		//   73  144:aload           4
		//   74  146:bipush          13
		//   75  148:aload_1         
		//   76  149:ldc2            #288 <String "android.media.metadata.ALBUM_ARTIST">
		//   77  152:invokevirtual   #282 <Method String Bundle.getString(String)>
		//   78  155:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   79  158:pop             
			if(bundle.containsKey("android.media.metadata.ARTIST"))
		//*  80  159:aload_1         
		//*  81  160:ldc2            #290 <String "android.media.metadata.ARTIST">
		//*  82  163:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//*  83  166:ifeq            183
				metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
		//   84  169:aload           4
		//   85  171:iconst_2        
		//   86  172:aload_1         
		//   87  173:ldc2            #290 <String "android.media.metadata.ARTIST">
		//   88  176:invokevirtual   #282 <Method String Bundle.getString(String)>
		//   89  179:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//   90  182:pop             
			if(bundle.containsKey("android.media.metadata.AUTHOR"))
		//*  91  183:aload_1         
		//*  92  184:ldc2            #292 <String "android.media.metadata.AUTHOR">
		//*  93  187:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//*  94  190:ifeq            207
				metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
		//   95  193:aload           4
		//   96  195:iconst_3        
		//   97  196:aload_1         
		//   98  197:ldc2            #292 <String "android.media.metadata.AUTHOR">
		//   99  200:invokevirtual   #282 <Method String Bundle.getString(String)>
		//  100  203:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  101  206:pop             
			if(bundle.containsKey("android.media.metadata.COMPILATION"))
		//* 102  207:aload_1         
		//* 103  208:ldc2            #294 <String "android.media.metadata.COMPILATION">
		//* 104  211:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 105  214:ifeq            232
				metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
		//  106  217:aload           4
		//  107  219:bipush          15
		//  108  221:aload_1         
		//  109  222:ldc2            #294 <String "android.media.metadata.COMPILATION">
		//  110  225:invokevirtual   #282 <Method String Bundle.getString(String)>
		//  111  228:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  112  231:pop             
			if(bundle.containsKey("android.media.metadata.COMPOSER"))
		//* 113  232:aload_1         
		//* 114  233:ldc2            #296 <String "android.media.metadata.COMPOSER">
		//* 115  236:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 116  239:ifeq            256
				metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
		//  117  242:aload           4
		//  118  244:iconst_4        
		//  119  245:aload_1         
		//  120  246:ldc2            #296 <String "android.media.metadata.COMPOSER">
		//  121  249:invokevirtual   #282 <Method String Bundle.getString(String)>
		//  122  252:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  123  255:pop             
			if(bundle.containsKey("android.media.metadata.DATE"))
		//* 124  256:aload_1         
		//* 125  257:ldc2            #298 <String "android.media.metadata.DATE">
		//* 126  260:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 127  263:ifeq            280
				metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
		//  128  266:aload           4
		//  129  268:iconst_5        
		//  130  269:aload_1         
		//  131  270:ldc2            #298 <String "android.media.metadata.DATE">
		//  132  273:invokevirtual   #282 <Method String Bundle.getString(String)>
		//  133  276:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  134  279:pop             
			if(bundle.containsKey("android.media.metadata.DISC_NUMBER"))
		//* 135  280:aload_1         
		//* 136  281:ldc2            #300 <String "android.media.metadata.DISC_NUMBER">
		//* 137  284:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 138  287:ifeq            305
				metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
		//  139  290:aload           4
		//  140  292:bipush          14
		//  141  294:aload_1         
		//  142  295:ldc2            #300 <String "android.media.metadata.DISC_NUMBER">
		//  143  298:invokevirtual   #304 <Method long Bundle.getLong(String)>
		//  144  301:invokevirtual   #308 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  145  304:pop             
			if(bundle.containsKey("android.media.metadata.DURATION"))
		//* 146  305:aload_1         
		//* 147  306:ldc2            #310 <String "android.media.metadata.DURATION">
		//* 148  309:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 149  312:ifeq            330
				metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
		//  150  315:aload           4
		//  151  317:bipush          9
		//  152  319:aload_1         
		//  153  320:ldc2            #310 <String "android.media.metadata.DURATION">
		//  154  323:invokevirtual   #304 <Method long Bundle.getLong(String)>
		//  155  326:invokevirtual   #308 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  156  329:pop             
			if(bundle.containsKey("android.media.metadata.GENRE"))
		//* 157  330:aload_1         
		//* 158  331:ldc2            #312 <String "android.media.metadata.GENRE">
		//* 159  334:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 160  337:ifeq            355
				metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
		//  161  340:aload           4
		//  162  342:bipush          6
		//  163  344:aload_1         
		//  164  345:ldc2            #312 <String "android.media.metadata.GENRE">
		//  165  348:invokevirtual   #282 <Method String Bundle.getString(String)>
		//  166  351:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  167  354:pop             
			if(bundle.containsKey("android.media.metadata.TITLE"))
		//* 168  355:aload_1         
		//* 169  356:ldc2            #314 <String "android.media.metadata.TITLE">
		//* 170  359:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 171  362:ifeq            380
				metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
		//  172  365:aload           4
		//  173  367:bipush          7
		//  174  369:aload_1         
		//  175  370:ldc2            #314 <String "android.media.metadata.TITLE">
		//  176  373:invokevirtual   #282 <Method String Bundle.getString(String)>
		//  177  376:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
		//  178  379:pop             
			if(bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
		//* 179  380:aload_1         
		//* 180  381:ldc2            #316 <String "android.media.metadata.TRACK_NUMBER">
		//* 181  384:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 182  387:ifeq            404
				metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
		//  183  390:aload           4
		//  184  392:iconst_0        
		//  185  393:aload_1         
		//  186  394:ldc2            #316 <String "android.media.metadata.TRACK_NUMBER">
		//  187  397:invokevirtual   #304 <Method long Bundle.getLong(String)>
		//  188  400:invokevirtual   #308 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
		//  189  403:pop             
			if(bundle.containsKey("android.media.metadata.WRITER"))
		//* 190  404:aload_1         
		//* 191  405:ldc2            #318 <String "android.media.metadata.WRITER">
		//* 192  408:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
		//* 193  411:ifeq            429
				metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
		//  194  414:aload           4
		//  195  416:bipush          11
		//  196  418:aload_1         
		//  197  419:ldc2            #318 <String "android.media.metadata.WRITER">
		//  198  422:invokevirtual   #282 <Method String Bundle.getString(String)>
		//  199  425:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
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
		//*   1    1:getfield        #84  <Field Object mLock>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				playbackstatecompat = mState;
		//    5    7:aload_0         
		//    6    8:getfield        #325 <Field PlaybackStateCompat mState>
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
			if((l & 1L) != 0L)
		//*   0    0:lload_1         
		//*   1    1:lconst_1        
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
			if((l & 2L) != 0L)
		//*  13   21:lload_1         
		//*  14   22:ldc2w           #330 <Long 2L>
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
			if((l & 4L) != 0L)
		//*  25   40:lload_1         
		//*  26   41:ldc2w           #332 <Long 4L>
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
			if((l & 8L) != 0L)
		//*  37   58:lload_1         
		//*  38   59:ldc2w           #334 <Long 8L>
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
			if((l & 16L) != 0L)
		//*  49   76:lload_1         
		//*  50   77:ldc2w           #336 <Long 16L>
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
			if((l & 32L) != 0L)
		//*  61   94:lload_1         
		//*  62   95:ldc2w           #338 <Long 32L>
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
			if((l & 64L) != 0L)
		//*  73  114:lload_1         
		//*  74  115:ldc2w           #340 <Long 64L>
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
		//*  86  134:ldc2w           #342 <Long 512L>
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
		//    1    1:getfield        #145 <Field MediaSessionCompat$Token mToken>
		//    2    4:areturn         
		}

		public boolean isActive()
		{
			return mIsActive;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field boolean mIsActive>
		//    2    4:ireturn         
		}

		void postToHandler(int i)
		{
			postToHandler(i, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #352 <Method void postToHandler(int, Object)>
		//    4    6:return          
		}

		void postToHandler(int i, int j)
		{
			postToHandler(i, ((Object) (null)), j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:iload_2         
		//    4    4:invokevirtual   #355 <Method void postToHandler(int, Object, int)>
		//    5    7:return          
		}

		void postToHandler(int i, Object obj)
		{
			postToHandler(i, obj, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:invokevirtual   #358 <Method void postToHandler(int, Object, Bundle)>
		//    5    7:return          
		}

		void postToHandler(int i, Object obj, int j)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field Object mLock>
		//*   2    4:astore          4
		//*   3    6:aload           4
		//*   4    8:monitorenter    
			{
				if(mHandler != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//*   7   13:ifnull          26
					mHandler.post(i, obj, j);
		//    8   16:aload_0         
		//    9   17:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   10   20:iload_1         
		//   11   21:aload_2         
		//   12   22:iload_3         
		//   13   23:invokevirtual   #363 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, int)>
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
		//*   1    1:getfield        #84  <Field Object mLock>
		//*   2    4:astore          4
		//*   3    6:aload           4
		//*   4    8:monitorenter    
			{
				if(mHandler != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//*   7   13:ifnull          26
					mHandler.post(i, obj, bundle);
		//    8   16:aload_0         
		//    9   17:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   10   20:iload_1         
		//   11   21:aload_2         
		//   12   22:aload_3         
		//   13   23:invokevirtual   #365 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, Bundle)>
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
		//    1    1:getfield        #129 <Field AudioManager mAudioManager>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #370 <Method void AudioManager.registerMediaButtonEventReceiver(ComponentName)>
		//    4    8:return          
		}

		public void release()
		{
			mIsActive = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #93  <Field boolean mIsActive>
			mDestroyed = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #91  <Field boolean mDestroyed>
			update();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #374 <Method boolean update()>
		//    8   14:pop             
			sendSessionDestroyed();
		//    9   15:aload_0         
		//   10   16:invokespecial   #376 <Method void sendSessionDestroyed()>
		//   11   19:return          
		}

		public void sendSessionEvent(String s, Bundle bundle)
		{
			sendEvent(s, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #379 <Method void sendEvent(String, Bundle)>
		//    4    6:return          
		}

		void sendVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		{
			int i = mControllerCallbacks.beginBroadcast() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_2        
			while(i >= 0) 
		//*   6   10:iload_2         
		//*   7   11:iflt            40
			{
				IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
		//    8   14:aload_0         
		//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   12   22:checkcast       #173 <Class IMediaControllerCallback>
		//   13   25:astore_3        
				try
				{
					imediacontrollercallback.onVolumeInfoChanged(parcelablevolumeinfo);
		//   14   26:aload_3         
		//   15   27:aload_1         
		//   16   28:invokeinterface #384 <Method void IMediaControllerCallback.onVolumeInfoChanged(ParcelableVolumeInfo)>
				}
		//*  17   33:iload_2         
		//*  18   34:iconst_1        
		//*  19   35:isub            
		//*  20   36:istore_2        
		//*  21   37:goto            10
		//*  22   40:aload_0         
		//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		//*   2    2:getfield        #93  <Field boolean mIsActive>
		//*   3    5:icmpne          9
				return;
		//    4    8:return          
			mIsActive = flag;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #93  <Field boolean mIsActive>
			if(update())
		//*   8   14:aload_0         
		//*   9   15:invokevirtual   #374 <Method boolean update()>
		//*  10   18:ifeq            37
			{
				setMetadata(mMetadata);
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #387 <Field MediaMetadataCompat mMetadata>
		//   14   26:invokevirtual   #390 <Method void setMetadata(MediaMetadataCompat)>
				setPlaybackState(mState);
		//   15   29:aload_0         
		//   16   30:aload_0         
		//   17   31:getfield        #325 <Field PlaybackStateCompat mState>
		//   18   34:invokevirtual   #393 <Method void setPlaybackState(PlaybackStateCompat)>
			}
		//   19   37:return          
		}

		public void setCallback(Callback callback, Handler handler)
		{
			mCallback = callback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #397 <Field MediaSessionCompat$Callback mCallback>
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
		//    9   15:new             #399 <Class Handler>
		//   10   18:dup             
		//   11   19:invokespecial   #400 <Method void Handler()>
		//   12   22:astore_1        
				synchronized(mLock)
		//*  13   23:aload_0         
		//*  14   24:getfield        #84  <Field Object mLock>
		//*  15   27:astore_2        
		//*  16   28:aload_2         
		//*  17   29:monitorenter    
				{
					if(mHandler != null)
		//*  18   30:aload_0         
		//*  19   31:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//*  20   34:ifnull          45
						mHandler.removeCallbacksAndMessages(((Object) (null)));
		//   21   37:aload_0         
		//   22   38:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		//   23   41:aconst_null     
		//   24   42:invokevirtual   #403 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.removeCallbacksAndMessages(Object)>
					mHandler = new MessageHandler(((Handler) (callback)).getLooper());
		//   25   45:aload_0         
		//   26   46:new             #19  <Class MediaSessionCompat$MediaSessionImplBase$MessageHandler>
		//   27   49:dup             
		//   28   50:aload_0         
		//   29   51:aload_1         
		//   30   52:invokevirtual   #407 <Method Looper Handler.getLooper()>
		//   31   55:invokespecial   #410 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase, Looper)>
		//   32   58:putfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
					mCallback.setSessionImpl(((MediaSessionImpl) (this)), ((Handler) (callback)));
		//   33   61:aload_0         
		//   34   62:getfield        #397 <Field MediaSessionCompat$Callback mCallback>
		//   35   65:aload_0         
		//   36   66:aload_1         
		//   37   67:invokestatic    #416 <Method void MediaSessionCompat$Callback.access$300(MediaSessionCompat$Callback, MediaSessionCompat$MediaSessionImpl, Handler)>
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
		//*   1    1:getfield        #419 <Field boolean mCaptioningEnabled>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mCaptioningEnabled = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #419 <Field boolean mCaptioningEnabled>
				sendCaptioningEnabled(flag);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #421 <Method void sendCaptioningEnabled(boolean)>
			}
		//   10   18:return          
		}

		public void setExtras(Bundle bundle)
		{
			mExtras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #424 <Field Bundle mExtras>
			sendExtras(bundle);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #426 <Method void sendExtras(Bundle)>
		//    6   10:return          
		}

		public void setFlags(int i)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mFlags = i;
		//    5    7:aload_0         
		//    6    8:iload_1         
		//    7    9:putfield        #429 <Field int mFlags>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			update();
		//   10   14:aload_0         
		//   11   15:invokevirtual   #374 <Method boolean update()>
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
		//    4    6:new             #432 <Class android.support.v4.media.MediaMetadataCompat$Builder>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:getstatic       #435 <Field int MediaSessionCompat.sMaxBitmapSize>
		//    8   14:invokespecial   #438 <Method void android.support.v4.media.MediaMetadataCompat$Builder(MediaMetadataCompat, int)>
		//    9   17:invokevirtual   #442 <Method MediaMetadataCompat android.support.v4.media.MediaMetadataCompat$Builder.build()>
		//   10   20:astore_2        
			synchronized(mLock)
		//*  11   21:aload_0         
		//*  12   22:getfield        #84  <Field Object mLock>
		//*  13   25:astore_1        
		//*  14   26:aload_1         
		//*  15   27:monitorenter    
			{
				mMetadata = mediametadatacompat1;
		//   16   28:aload_0         
		//   17   29:aload_2         
		//   18   30:putfield        #387 <Field MediaMetadataCompat mMetadata>
			}
		//   19   33:aload_1         
		//   20   34:monitorexit     
			sendMetadata(mediametadatacompat1);
		//   21   35:aload_0         
		//   22   36:aload_2         
		//   23   37:invokespecial   #444 <Method void sendMetadata(MediaMetadataCompat)>
			if(!mIsActive)
		//*  24   40:aload_0         
		//*  25   41:getfield        #93  <Field boolean mIsActive>
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
		//   34   58:invokevirtual   #450 <Method Bundle MediaMetadataCompat.getBundle()>
		//   35   61:astore_1        
			buildRccMetadata(((Bundle) (mediametadatacompat))).apply();
		//   36   62:aload_0         
		//   37   63:aload_1         
		//   38   64:invokevirtual   #452 <Method android.media.RemoteControlClient$MetadataEditor buildRccMetadata(Bundle)>
		//   39   67:invokevirtual   #455 <Method void android.media.RemoteControlClient$MetadataEditor.apply()>
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
		//*   1    1:getfield        #84  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mState = playbackstatecompat;
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:putfield        #325 <Field PlaybackStateCompat mState>
			}
		//    8   12:aload_2         
		//    9   13:monitorexit     
			sendState(playbackstatecompat);
		//   10   14:aload_0         
		//   11   15:aload_1         
		//   12   16:invokespecial   #457 <Method void sendState(PlaybackStateCompat)>
			if(!mIsActive)
		//*  13   19:aload_0         
		//*  14   20:getfield        #93  <Field boolean mIsActive>
		//*  15   23:ifne            27
				return;
		//   16   26:return          
			if(playbackstatecompat == null)
		//*  17   27:aload_1         
		//*  18   28:ifnonnull       48
			{
				mRcc.setPlaybackState(0);
		//   19   31:aload_0         
		//   20   32:getfield        #158 <Field RemoteControlClient mRcc>
		//   21   35:iconst_0        
		//   22   36:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
				mRcc.setTransportControlFlags(0);
		//   23   39:aload_0         
		//   24   40:getfield        #158 <Field RemoteControlClient mRcc>
		//   25   43:iconst_0        
		//   26   44:invokevirtual   #462 <Method void RemoteControlClient.setTransportControlFlags(int)>
				return;
		//   27   47:return          
			} else
			{
				setRccState(playbackstatecompat);
		//   28   48:aload_0         
		//   29   49:aload_1         
		//   30   50:invokevirtual   #465 <Method void setRccState(PlaybackStateCompat)>
				mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackstatecompat.getActions()));
		//   31   53:aload_0         
		//   32   54:getfield        #158 <Field RemoteControlClient mRcc>
		//   33   57:aload_0         
		//   34   58:aload_1         
		//   35   59:invokevirtual   #471 <Method long PlaybackStateCompat.getActions()>
		//   36   62:invokevirtual   #473 <Method int getRccTransportControlFlagsFromActions(long)>
		//   37   65:invokevirtual   #462 <Method void RemoteControlClient.setTransportControlFlags(int)>
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
			if(mVolumeProvider != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//*   2    4:ifnull          15
				mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
		//    3    7:aload_0         
		//    4    8:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//    5   11:aconst_null     
		//    6   12:invokevirtual   #477 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
			mVolumeType = 1;
		//    7   15:aload_0         
		//    8   16:iconst_1        
		//    9   17:putfield        #149 <Field int mVolumeType>
			sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, 2, mAudioManager.getStreamMaxVolume(mLocalStream), mAudioManager.getStreamVolume(mLocalStream)));
		//   10   20:aload_0         
		//   11   21:new             #479 <Class ParcelableVolumeInfo>
		//   12   24:dup             
		//   13   25:aload_0         
		//   14   26:getfield        #149 <Field int mVolumeType>
		//   15   29:aload_0         
		//   16   30:getfield        #151 <Field int mLocalStream>
		//   17   33:iconst_2        
		//   18   34:aload_0         
		//   19   35:getfield        #129 <Field AudioManager mAudioManager>
		//   20   38:aload_0         
		//   21   39:getfield        #151 <Field int mLocalStream>
		//   22   42:invokevirtual   #482 <Method int AudioManager.getStreamMaxVolume(int)>
		//   23   45:aload_0         
		//   24   46:getfield        #129 <Field AudioManager mAudioManager>
		//   25   49:aload_0         
		//   26   50:getfield        #151 <Field int mLocalStream>
		//   27   53:invokevirtual   #485 <Method int AudioManager.getStreamVolume(int)>
		//   28   56:invokespecial   #488 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   29   59:invokevirtual   #490 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
		//   30   62:return          
		}

		public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
		{
			if(volumeprovidercompat == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       15
				throw new IllegalArgumentException("volumeProvider may not be null");
		//    2    4:new             #104 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #494 <String "volumeProvider may not be null">
		//    5   11:invokespecial   #109 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			if(mVolumeProvider != null)
		//*   7   15:aload_0         
		//*   8   16:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//*   9   19:ifnull          30
				mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
		//   10   22:aload_0         
		//   11   23:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//   12   26:aconst_null     
		//   13   27:invokevirtual   #477 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
			mVolumeType = 2;
		//   14   30:aload_0         
		//   15   31:iconst_2        
		//   16   32:putfield        #149 <Field int mVolumeType>
			mVolumeProvider = volumeprovidercompat;
		//   17   35:aload_0         
		//   18   36:aload_1         
		//   19   37:putfield        #231 <Field VolumeProviderCompat mVolumeProvider>
			sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
		//   20   40:aload_0         
		//   21   41:new             #479 <Class ParcelableVolumeInfo>
		//   22   44:dup             
		//   23   45:aload_0         
		//   24   46:getfield        #149 <Field int mVolumeType>
		//   25   49:aload_0         
		//   26   50:getfield        #151 <Field int mLocalStream>
		//   27   53:aload_0         
		//   28   54:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//   29   57:invokevirtual   #497 <Method int VolumeProviderCompat.getVolumeControl()>
		//   30   60:aload_0         
		//   31   61:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//   32   64:invokevirtual   #500 <Method int VolumeProviderCompat.getMaxVolume()>
		//   33   67:aload_0         
		//   34   68:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//   35   71:invokevirtual   #503 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   36   74:invokespecial   #488 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   37   77:invokevirtual   #490 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
			volumeprovidercompat.setCallback(mVolumeCallback);
		//   38   80:aload_1         
		//   39   81:aload_0         
		//   40   82:getfield        #102 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
		//   41   85:invokevirtual   #477 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		//   42   88:return          
		}

		public void setQueue(List list)
		{
			mQueue = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #506 <Field List mQueue>
			sendQueue(list);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #508 <Method void sendQueue(List)>
		//    6   10:return          
		}

		public void setQueueTitle(CharSequence charsequence)
		{
			mQueueTitle = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #511 <Field CharSequence mQueueTitle>
			sendQueueTitle(charsequence);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #513 <Method void sendQueueTitle(CharSequence)>
		//    6   10:return          
		}

		public void setRatingType(int i)
		{
			mRatingType = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #147 <Field int mRatingType>
		//    3    5:return          
		}

		void setRccState(PlaybackStateCompat playbackstatecompat)
		{
			mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()));
		//    0    0:aload_0         
		//    1    1:getfield        #158 <Field RemoteControlClient mRcc>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #517 <Method int PlaybackStateCompat.getState()>
		//    5    9:invokevirtual   #519 <Method int getRccStateFromState(int)>
		//    6   12:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
		//    7   15:return          
		}

		public void setRepeatMode(int i)
		{
			if(mRepeatMode != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #522 <Field int mRepeatMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mRepeatMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #522 <Field int mRepeatMode>
				sendRepeatMode(i);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #524 <Method void sendRepeatMode(int)>
			}
		//   10   18:return          
		}

		public void setSessionActivity(PendingIntent pendingintent)
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #84  <Field Object mLock>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mSessionActivity = pendingintent;
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:putfield        #527 <Field PendingIntent mSessionActivity>
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
		//*   1    1:getfield        #530 <Field int mShuffleMode>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          18
			{
				mShuffleMode = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #530 <Field int mShuffleMode>
				sendShuffleMode(i);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #532 <Method void sendShuffleMode(int)>
			}
		//   10   18:return          
		}

		void setVolumeTo(int i, int j)
		{
			if(mVolumeType == 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #149 <Field int mVolumeType>
		//*   2    4:iconst_2        
		//*   3    5:icmpne          24
			{
				if(mVolumeProvider != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//*   6   12:ifnull          37
				{
					mVolumeProvider.onSetVolumeTo(i);
		//    7   15:aload_0         
		//    8   16:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		//    9   19:iload_1         
		//   10   20:invokevirtual   #536 <Method void VolumeProviderCompat.onSetVolumeTo(int)>
					return;
		//   11   23:return          
				}
			} else
			{
				mAudioManager.setStreamVolume(mLocalStream, i, j);
		//   12   24:aload_0         
		//   13   25:getfield        #129 <Field AudioManager mAudioManager>
		//   14   28:aload_0         
		//   15   29:getfield        #151 <Field int mLocalStream>
		//   16   32:iload_1         
		//   17   33:iload_2         
		//   18   34:invokevirtual   #539 <Method void AudioManager.setStreamVolume(int, int, int)>
			}
		//   19   37:return          
		}

		void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
		{
			mAudioManager.unregisterMediaButtonEventReceiver(componentname);
		//    0    0:aload_0         
		//    1    1:getfield        #129 <Field AudioManager mAudioManager>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #542 <Method void AudioManager.unregisterMediaButtonEventReceiver(ComponentName)>
		//    4    8:return          
		}

		boolean update()
		{
			if(mIsActive)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field boolean mIsActive>
		//*   2    4:ifeq            153
			{
				if(!mIsMbrRegistered && (mFlags & 1) != 0)
		//*   3    7:aload_0         
		//*   4    8:getfield        #95  <Field boolean mIsMbrRegistered>
		//*   5   11:ifne            43
		//*   6   14:aload_0         
		//*   7   15:getfield        #429 <Field int mFlags>
		//*   8   18:iconst_1        
		//*   9   19:iand            
		//*  10   20:ifeq            43
				{
					registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   11   23:aload_0         
		//   12   24:aload_0         
		//   13   25:getfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
		//   14   28:aload_0         
		//   15   29:getfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
		//   16   32:invokevirtual   #544 <Method void registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
					mIsMbrRegistered = true;
		//   17   35:aload_0         
		//   18   36:iconst_1        
		//   19   37:putfield        #95  <Field boolean mIsMbrRegistered>
				} else
		//*  20   40:goto            76
				if(mIsMbrRegistered && (mFlags & 1) == 0)
		//*  21   43:aload_0         
		//*  22   44:getfield        #95  <Field boolean mIsMbrRegistered>
		//*  23   47:ifeq            76
		//*  24   50:aload_0         
		//*  25   51:getfield        #429 <Field int mFlags>
		//*  26   54:iconst_1        
		//*  27   55:iand            
		//*  28   56:ifne            76
				{
					unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   29   59:aload_0         
		//   30   60:aload_0         
		//   31   61:getfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
		//   32   64:aload_0         
		//   33   65:getfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
		//   34   68:invokevirtual   #546 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
					mIsMbrRegistered = false;
		//   35   71:aload_0         
		//   36   72:iconst_0        
		//   37   73:putfield        #95  <Field boolean mIsMbrRegistered>
				}
				if(!mIsRccRegistered && (mFlags & 2) != 0)
		//*  38   76:aload_0         
		//*  39   77:getfield        #97  <Field boolean mIsRccRegistered>
		//*  40   80:ifne            110
		//*  41   83:aload_0         
		//*  42   84:getfield        #429 <Field int mFlags>
		//*  43   87:iconst_2        
		//*  44   88:iand            
		//*  45   89:ifeq            110
				{
					mAudioManager.registerRemoteControlClient(mRcc);
		//   46   92:aload_0         
		//   47   93:getfield        #129 <Field AudioManager mAudioManager>
		//   48   96:aload_0         
		//   49   97:getfield        #158 <Field RemoteControlClient mRcc>
		//   50  100:invokevirtual   #550 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
					mIsRccRegistered = true;
		//   51  103:aload_0         
		//   52  104:iconst_1        
		//   53  105:putfield        #97  <Field boolean mIsRccRegistered>
					return true;
		//   54  108:iconst_1        
		//   55  109:ireturn         
				}
				if(mIsRccRegistered && (mFlags & 2) == 0)
		//*  56  110:aload_0         
		//*  57  111:getfield        #97  <Field boolean mIsRccRegistered>
		//*  58  114:ifeq            208
		//*  59  117:aload_0         
		//*  60  118:getfield        #429 <Field int mFlags>
		//*  61  121:iconst_2        
		//*  62  122:iand            
		//*  63  123:ifne            208
				{
					mRcc.setPlaybackState(0);
		//   64  126:aload_0         
		//   65  127:getfield        #158 <Field RemoteControlClient mRcc>
		//   66  130:iconst_0        
		//   67  131:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
					mAudioManager.unregisterRemoteControlClient(mRcc);
		//   68  134:aload_0         
		//   69  135:getfield        #129 <Field AudioManager mAudioManager>
		//   70  138:aload_0         
		//   71  139:getfield        #158 <Field RemoteControlClient mRcc>
		//   72  142:invokevirtual   #553 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
					mIsRccRegistered = false;
		//   73  145:aload_0         
		//   74  146:iconst_0        
		//   75  147:putfield        #97  <Field boolean mIsRccRegistered>
				}
			} else
		//*  76  150:goto            208
			{
				if(mIsMbrRegistered)
		//*  77  153:aload_0         
		//*  78  154:getfield        #95  <Field boolean mIsMbrRegistered>
		//*  79  157:ifeq            177
				{
					unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
		//   80  160:aload_0         
		//   81  161:aload_0         
		//   82  162:getfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
		//   83  165:aload_0         
		//   84  166:getfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
		//   85  169:invokevirtual   #546 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
					mIsMbrRegistered = false;
		//   86  172:aload_0         
		//   87  173:iconst_0        
		//   88  174:putfield        #95  <Field boolean mIsMbrRegistered>
				}
				if(mIsRccRegistered)
		//*  89  177:aload_0         
		//*  90  178:getfield        #97  <Field boolean mIsRccRegistered>
		//*  91  181:ifeq            208
				{
					mRcc.setPlaybackState(0);
		//   92  184:aload_0         
		//   93  185:getfield        #158 <Field RemoteControlClient mRcc>
		//   94  188:iconst_0        
		//   95  189:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
					mAudioManager.unregisterRemoteControlClient(mRcc);
		//   96  192:aload_0         
		//   97  193:getfield        #129 <Field AudioManager mAudioManager>
		//   98  196:aload_0         
		//   99  197:getfield        #158 <Field RemoteControlClient mRcc>
		//  100  200:invokevirtual   #553 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
					mIsRccRegistered = false;
		//  101  203:aload_0         
		//  102  204:iconst_0        
		//  103  205:putfield        #97  <Field boolean mIsRccRegistered>
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
		//    1    1:invokespecial   #82  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #4   <Class Object>
		//    4    8:dup             
		//    5    9:invokespecial   #82  <Method void Object()>
		//    6   12:putfield        #84  <Field Object mLock>
		//    7   15:aload_0         
		//    8   16:new             #86  <Class RemoteCallbackList>
		//    9   19:dup             
		//   10   20:invokespecial   #87  <Method void RemoteCallbackList()>
		//   11   23:putfield        #89  <Field RemoteCallbackList mControllerCallbacks>
			mDestroyed = false;
		//   12   26:aload_0         
		//   13   27:iconst_0        
		//   14   28:putfield        #91  <Field boolean mDestroyed>
			mIsActive = false;
		//   15   31:aload_0         
		//   16   32:iconst_0        
		//   17   33:putfield        #93  <Field boolean mIsActive>
			mIsMbrRegistered = false;
		//   18   36:aload_0         
		//   19   37:iconst_0        
		//   20   38:putfield        #95  <Field boolean mIsMbrRegistered>
			mIsRccRegistered = false;
		//   21   41:aload_0         
		//   22   42:iconst_0        
		//   23   43:putfield        #97  <Field boolean mIsRccRegistered>
			mVolumeCallback = ((android.support.v4.media.VolumeProviderCompat.Callback) (new _cls1()));
		//   24   46:aload_0         
		//   25   47:new             #11  <Class MediaSessionCompat$MediaSessionImplBase$1>
		//   26   50:dup             
		//   27   51:aload_0         
		//   28   52:invokespecial   #100 <Method void MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat$MediaSessionImplBase)>
		//   29   55:putfield        #102 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
			if(componentname == null)
		//*  30   58:aload_3         
		//*  31   59:ifnonnull       72
			{
				throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
		//   32   62:new             #104 <Class IllegalArgumentException>
		//   33   65:dup             
		//   34   66:ldc1            #106 <String "MediaButtonReceiver component may not be null.">
		//   35   68:invokespecial   #109 <Method void IllegalArgumentException(String)>
		//   36   71:athrow          
			} else
			{
				mContext = context;
		//   37   72:aload_0         
		//   38   73:aload_1         
		//   39   74:putfield        #111 <Field Context mContext>
				mPackageName = context.getPackageName();
		//   40   77:aload_0         
		//   41   78:aload_1         
		//   42   79:invokevirtual   #117 <Method String Context.getPackageName()>
		//   43   82:putfield        #119 <Field String mPackageName>
				mAudioManager = (AudioManager)context.getSystemService("audio");
		//   44   85:aload_0         
		//   45   86:aload_1         
		//   46   87:ldc1            #121 <String "audio">
		//   47   89:invokevirtual   #125 <Method Object Context.getSystemService(String)>
		//   48   92:checkcast       #127 <Class AudioManager>
		//   49   95:putfield        #129 <Field AudioManager mAudioManager>
				mTag = s;
		//   50   98:aload_0         
		//   51   99:aload_2         
		//   52  100:putfield        #131 <Field String mTag>
				mMediaButtonReceiverComponentName = componentname;
		//   53  103:aload_0         
		//   54  104:aload_3         
		//   55  105:putfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
				mMediaButtonReceiverIntent = pendingintent;
		//   56  108:aload_0         
		//   57  109:aload           4
		//   58  111:putfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
				mStub = new MediaSessionStub();
		//   59  114:aload_0         
		//   60  115:new             #16  <Class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub>
		//   61  118:dup             
		//   62  119:aload_0         
		//   63  120:invokespecial   #136 <Method void MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase)>
		//   64  123:putfield        #138 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
				mToken = new Token(((Object) (mStub)));
		//   65  126:aload_0         
		//   66  127:new             #140 <Class MediaSessionCompat$Token>
		//   67  130:dup             
		//   68  131:aload_0         
		//   69  132:getfield        #138 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
		//   70  135:invokespecial   #143 <Method void MediaSessionCompat$Token(Object)>
		//   71  138:putfield        #145 <Field MediaSessionCompat$Token mToken>
				mRatingType = 0;
		//   72  141:aload_0         
		//   73  142:iconst_0        
		//   74  143:putfield        #147 <Field int mRatingType>
				mVolumeType = 1;
		//   75  146:aload_0         
		//   76  147:iconst_1        
		//   77  148:putfield        #149 <Field int mVolumeType>
				mLocalStream = 3;
		//   78  151:aload_0         
		//   79  152:iconst_3        
		//   80  153:putfield        #151 <Field int mLocalStream>
				mRcc = new RemoteControlClient(pendingintent);
		//   81  156:aload_0         
		//   82  157:new             #153 <Class RemoteControlClient>
		//   83  160:dup             
		//   84  161:aload           4
		//   85  163:invokespecial   #156 <Method void RemoteControlClient(PendingIntent)>
		//   86  166:putfield        #158 <Field RemoteControlClient mRcc>
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
			int i;
			i = 2;
		//   18   39:iconst_2        
		//   19   40:istore_1        
			if(l != 2)
				break MISSING_BLOCK_LABEL_68;
		//   20   41:iload           4
		//   21   43:iconst_2        
		//   22   44:icmpne          68
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
			break MISSING_BLOCK_LABEL_97;
		//   32   65:goto            123
			j = mAudioManager.getStreamMaxVolume(i1);
		//   33   68:aload_0         
		//   34   69:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   35   72:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   36   75:iload           5
		//   37   77:invokevirtual   #151 <Method int AudioManager.getStreamMaxVolume(int)>
		//   38   80:istore_2        
			k = mAudioManager.getStreamVolume(i1);
		//   39   81:aload_0         
		//   40   82:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   41   85:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   42   88:iload           5
		//   43   90:invokevirtual   #154 <Method int AudioManager.getStreamVolume(int)>
		//   44   93:istore_3        
		//*  45   94:goto            123
			obj;
		//   46   97:aload           6
			JVM INSTR monitorexit ;
		//   47   99:monitorexit     
			return new ParcelableVolumeInfo(l, i1, i, j, k);
		//   48  100:new             #156 <Class ParcelableVolumeInfo>
		//   49  103:dup             
		//   50  104:iload           4
		//   51  106:iload           5
		//   52  108:iload_1         
		//   53  109:iload_2         
		//   54  110:iload_3         
		//   55  111:invokespecial   #159 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   56  114:areturn         
			Exception exception;
			exception;
		//   57  115:astore          7
			obj;
		//   58  117:aload           6
			JVM INSTR monitorexit ;
		//   59  119:monitorexit     
			throw exception;
		//   60  120:aload           7
		//   61  122:athrow          
		//*  62  123:goto            97
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    7:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    7:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #194 <Field boolean MediaSessionCompat$MediaSessionImplBase.mDestroyed>
		//*   3    7:ifeq            17
			{
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//    4   10:aload_1         
		//    5   11:invokeinterface #199 <Method void IMediaControllerCallback.onSessionDestroyed()>
					return;
		//    6   16:return          
				}
		//*   7   17:aload_0         
		//*   8   18:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   9   21:getfield        #203 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//*  10   24:aload_1         
		//*  11   25:invokevirtual   #209 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
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
		//    4    7:invokevirtual   #213 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
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
		//    4    7:invokestatic    #222 <Method Long Long.valueOf(long)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void sendCommand(String s, Bundle bundle, ResultReceiverWrapper resultreceiverwrapper)
		{
			postToHandler(1, ((Object) (new MediaSessionImplBase.Command(s, bundle, resultreceiverwrapper.mResultReceiver))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_1        
		//    3    5:new             #226 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokestatic    #232 <Method ResultReceiver MediaSessionCompat$ResultReceiverWrapper.access$400(MediaSessionCompat$ResultReceiverWrapper)>
		//    9   15:invokespecial   #235 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, ResultReceiver)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
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
		//*  14   22:ifeq            35
				postToHandler(21, ((Object) (keyevent)));
		//   15   25:aload_0         
		//   16   26:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   17   29:bipush          21
		//   18   31:aload_1         
		//   19   32:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
			return flag;
		//   20   35:iload_3         
		//   21   36:ireturn         
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			postToHandler(29, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          29
		//    3    6:iload_1         
		//    4    7:invokestatic    #245 <Method Boolean Boolean.valueOf(boolean)>
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
		//    4    7:invokevirtual   #213 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
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
		//    4    7:invokevirtual   #213 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
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
		//    4    6:invokevirtual   #251 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		//    5    9:return          
		}

		public void skipToQueueItem(long l)
		{
			postToHandler(11, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          11
		//    3    6:lload_1         
		//    4    7:invokestatic    #222 <Method Long Long.valueOf(long)>
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
		//    2    4:getfield        #203 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #257 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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
			Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #158 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
		//    3    7:astore_2        
			if(callback == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			switch(message.what)
		//*   7   13:aload_1         
		//*   8   14:getfield        #163 <Field int Message.what>
			{
		//*   9   17:tableswitch     1 31: default 156
		//		               1 581
		//		               2 568
		//		               3 563
		//		               4 547
		//		               5 531
		//		               6 515
		//		               7 510
		//		               8 494
		//		               9 478
		//		               10 462
		//		               11 447
		//		               12 442
		//		               13 437
		//		               14 432
		//		               15 427
		//		               16 422
		//		               17 417
		//		               18 402
		//		               19 390
		//		               20 374
		//		               21 333
		//		               22 320
		//		               23 311
		//		               24 156
		//		               25 299
		//		               26 283
		//		               27 271
		//		               28 197
		//		               29 182
		//		               30 173
		//		               31 157
			case 24: // '\030'
			default:
				return;
		//   10  156:return          

			case 31: // '\037'
				callback.onSetRating((RatingCompat)message.obj, message.getData());
		//   11  157:aload_2         
		//   12  158:aload_1         
		//   13  159:getfield        #167 <Field Object Message.obj>
		//   14  162:checkcast       #169 <Class RatingCompat>
		//   15  165:aload_1         
		//   16  166:invokevirtual   #173 <Method Bundle Message.getData()>
		//   17  169:invokevirtual   #177 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//   18  172:return          

			case 30: // '\036'
				callback.onSetShuffleMode(message.arg1);
		//   19  173:aload_2         
		//   20  174:aload_1         
		//   21  175:getfield        #180 <Field int Message.arg1>
		//   22  178:invokevirtual   #184 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
				return;
		//   23  181:return          

			case 29: // '\035'
				callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
		//   24  182:aload_2         
		//   25  183:aload_1         
		//   26  184:getfield        #167 <Field Object Message.obj>
		//   27  187:checkcast       #186 <Class Boolean>
		//   28  190:invokevirtual   #190 <Method boolean Boolean.booleanValue()>
		//   29  193:invokevirtual   #194 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
				return;
		//   30  196:return          

			case 28: // '\034'
				if(mQueue != null)
		//*  31  197:aload_0         
		//*  32  198:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  33  201:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//*  34  204:ifnull          605
				{
					if(message.arg1 >= 0 && message.arg1 < mQueue.size())
		//*  35  207:aload_1         
		//*  36  208:getfield        #180 <Field int Message.arg1>
		//*  37  211:iflt            256
		//*  38  214:aload_1         
		//*  39  215:getfield        #180 <Field int Message.arg1>
		//*  40  218:aload_0         
		//*  41  219:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  42  222:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//*  43  225:invokeinterface #203 <Method int List.size()>
		//*  44  230:icmpge          256
						message = ((Message) ((QueueItem)mQueue.get(message.arg1)));
		//   45  233:aload_0         
		//   46  234:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   47  237:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   48  240:aload_1         
		//   49  241:getfield        #180 <Field int Message.arg1>
		//   50  244:invokeinterface #207 <Method Object List.get(int)>
		//   51  249:checkcast       #209 <Class MediaSessionCompat$QueueItem>
		//   52  252:astore_1        
					else
		//*  53  253:goto            258
						message = null;
		//   54  256:aconst_null     
		//   55  257:astore_1        
					if(message != null)
		//*  56  258:aload_1         
		//*  57  259:ifnull          605
					{
						callback.onRemoveQueueItem(((QueueItem) (message)).getDescription());
		//   58  262:aload_2         
		//   59  263:aload_1         
		//   60  264:invokevirtual   #213 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//   61  267:invokevirtual   #217 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
						return;
		//   62  270:return          
					}
				}
				break;

			case 27: // '\033'
				callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
		//   63  271:aload_2         
		//   64  272:aload_1         
		//   65  273:getfield        #167 <Field Object Message.obj>
		//   66  276:checkcast       #219 <Class MediaDescriptionCompat>
		//   67  279:invokevirtual   #217 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//   68  282:return          

			case 26: // '\032'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
		//   69  283:aload_2         
		//   70  284:aload_1         
		//   71  285:getfield        #167 <Field Object Message.obj>
		//   72  288:checkcast       #219 <Class MediaDescriptionCompat>
		//   73  291:aload_1         
		//   74  292:getfield        #180 <Field int Message.arg1>
		//   75  295:invokevirtual   #223 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//   76  298:return          

			case 25: // '\031'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
		//   77  299:aload_2         
		//   78  300:aload_1         
		//   79  301:getfield        #167 <Field Object Message.obj>
		//   80  304:checkcast       #219 <Class MediaDescriptionCompat>
		//   81  307:invokevirtual   #225 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//   82  310:return          

			case 23: // '\027'
				callback.onSetRepeatMode(message.arg1);
		//   83  311:aload_2         
		//   84  312:aload_1         
		//   85  313:getfield        #180 <Field int Message.arg1>
		//   86  316:invokevirtual   #228 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
				return;
		//   87  319:return          

			case 22: // '\026'
				setVolumeTo(message.arg1, 0);
		//   88  320:aload_0         
		//   89  321:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   90  324:aload_1         
		//   91  325:getfield        #180 <Field int Message.arg1>
		//   92  328:iconst_0        
		//   93  329:invokevirtual   #232 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
				return;
		//   94  332:return          

			case 21: // '\025'
				message = ((Message) ((KeyEvent)message.obj));
		//   95  333:aload_1         
		//   96  334:getfield        #167 <Field Object Message.obj>
		//   97  337:checkcast       #89  <Class KeyEvent>
		//   98  340:astore_1        
				Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
		//   99  341:new             #234 <Class Intent>
		//  100  344:dup             
		//  101  345:ldc1            #236 <String "android.intent.action.MEDIA_BUTTON">
		//  102  347:invokespecial   #239 <Method void Intent(String)>
		//  103  350:astore_3        
				intent.putExtra("android.intent.extra.KEY_EVENT", ((Parcelable) (message)));
		//  104  351:aload_3         
		//  105  352:ldc1            #241 <String "android.intent.extra.KEY_EVENT">
		//  106  354:aload_1         
		//  107  355:invokevirtual   #245 <Method Intent Intent.putExtra(String, Parcelable)>
		//  108  358:pop             
				if(!callback.onMediaButtonEvent(intent))
		//* 109  359:aload_2         
		//* 110  360:aload_3         
		//* 111  361:invokevirtual   #248 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//* 112  364:ifne            605
				{
					onMediaButtonEvent(((KeyEvent) (message)), callback);
		//  113  367:aload_0         
		//  114  368:aload_1         
		//  115  369:aload_2         
		//  116  370:invokespecial   #250 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
					return;
		//  117  373:return          
				}
				break;

			case 20: // '\024'
				callback.onCustomAction((String)message.obj, message.getData());
		//  118  374:aload_2         
		//  119  375:aload_1         
		//  120  376:getfield        #167 <Field Object Message.obj>
		//  121  379:checkcast       #252 <Class String>
		//  122  382:aload_1         
		//  123  383:invokevirtual   #173 <Method Bundle Message.getData()>
		//  124  386:invokevirtual   #256 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  125  389:return          

			case 19: // '\023'
				callback.onSetRating((RatingCompat)message.obj);
		//  126  390:aload_2         
		//  127  391:aload_1         
		//  128  392:getfield        #167 <Field Object Message.obj>
		//  129  395:checkcast       #169 <Class RatingCompat>
		//  130  398:invokevirtual   #259 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
				return;
		//  131  401:return          

			case 18: // '\022'
				callback.onSeekTo(((Long)message.obj).longValue());
		//  132  402:aload_2         
		//  133  403:aload_1         
		//  134  404:getfield        #167 <Field Object Message.obj>
		//  135  407:checkcast       #261 <Class Long>
		//  136  410:invokevirtual   #264 <Method long Long.longValue()>
		//  137  413:invokevirtual   #268 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
				return;
		//  138  416:return          

			case 17: // '\021'
				callback.onRewind();
		//  139  417:aload_2         
		//  140  418:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
		//  141  421:return          

			case 16: // '\020'
				callback.onFastForward();
		//  142  422:aload_2         
		//  143  423:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
		//  144  426:return          

			case 15: // '\017'
				callback.onSkipToPrevious();
		//  145  427:aload_2         
		//  146  428:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
		//  147  431:return          

			case 14: // '\016'
				callback.onSkipToNext();
		//  148  432:aload_2         
		//  149  433:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
		//  150  436:return          

			case 13: // '\r'
				callback.onStop();
		//  151  437:aload_2         
		//  152  438:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
				return;
		//  153  441:return          

			case 12: // '\f'
				callback.onPause();
		//  154  442:aload_2         
		//  155  443:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
				return;
		//  156  446:return          

			case 11: // '\013'
				callback.onSkipToQueueItem(((Long)message.obj).longValue());
		//  157  447:aload_2         
		//  158  448:aload_1         
		//  159  449:getfield        #167 <Field Object Message.obj>
		//  160  452:checkcast       #261 <Class Long>
		//  161  455:invokevirtual   #264 <Method long Long.longValue()>
		//  162  458:invokevirtual   #271 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
				return;
		//  163  461:return          

			case 10: // '\n'
				callback.onPlayFromUri((Uri)message.obj, message.getData());
		//  164  462:aload_2         
		//  165  463:aload_1         
		//  166  464:getfield        #167 <Field Object Message.obj>
		//  167  467:checkcast       #273 <Class Uri>
		//  168  470:aload_1         
		//  169  471:invokevirtual   #173 <Method Bundle Message.getData()>
		//  170  474:invokevirtual   #277 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//  171  477:return          

			case 9: // '\t'
				callback.onPlayFromSearch((String)message.obj, message.getData());
		//  172  478:aload_2         
		//  173  479:aload_1         
		//  174  480:getfield        #167 <Field Object Message.obj>
		//  175  483:checkcast       #252 <Class String>
		//  176  486:aload_1         
		//  177  487:invokevirtual   #173 <Method Bundle Message.getData()>
		//  178  490:invokevirtual   #280 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
				return;
		//  179  493:return          

			case 8: // '\b'
				callback.onPlayFromMediaId((String)message.obj, message.getData());
		//  180  494:aload_2         
		//  181  495:aload_1         
		//  182  496:getfield        #167 <Field Object Message.obj>
		//  183  499:checkcast       #252 <Class String>
		//  184  502:aload_1         
		//  185  503:invokevirtual   #173 <Method Bundle Message.getData()>
		//  186  506:invokevirtual   #283 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
				return;
		//  187  509:return          

			case 7: // '\007'
				callback.onPlay();
		//  188  510:aload_2         
		//  189  511:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
				return;
		//  190  514:return          

			case 6: // '\006'
				callback.onPrepareFromUri((Uri)message.obj, message.getData());
		//  191  515:aload_2         
		//  192  516:aload_1         
		//  193  517:getfield        #167 <Field Object Message.obj>
		//  194  520:checkcast       #273 <Class Uri>
		//  195  523:aload_1         
		//  196  524:invokevirtual   #173 <Method Bundle Message.getData()>
		//  197  527:invokevirtual   #286 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//  198  530:return          

			case 5: // '\005'
				callback.onPrepareFromSearch((String)message.obj, message.getData());
		//  199  531:aload_2         
		//  200  532:aload_1         
		//  201  533:getfield        #167 <Field Object Message.obj>
		//  202  536:checkcast       #252 <Class String>
		//  203  539:aload_1         
		//  204  540:invokevirtual   #173 <Method Bundle Message.getData()>
		//  205  543:invokevirtual   #289 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//  206  546:return          

			case 4: // '\004'
				callback.onPrepareFromMediaId((String)message.obj, message.getData());
		//  207  547:aload_2         
		//  208  548:aload_1         
		//  209  549:getfield        #167 <Field Object Message.obj>
		//  210  552:checkcast       #252 <Class String>
		//  211  555:aload_1         
		//  212  556:invokevirtual   #173 <Method Bundle Message.getData()>
		//  213  559:invokevirtual   #292 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//  214  562:return          

			case 3: // '\003'
				callback.onPrepare();
		//  215  563:aload_2         
		//  216  564:invokevirtual   #295 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//  217  567:return          

			case 2: // '\002'
				adjustVolume(message.arg1, 0);
		//  218  568:aload_0         
		//  219  569:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  220  572:aload_1         
		//  221  573:getfield        #180 <Field int Message.arg1>
		//  222  576:iconst_0        
		//  223  577:invokevirtual   #298 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
				return;
		//  224  580:return          

			case 1: // '\001'
				message = ((Message) ((MediaSessionImplBase.Command)message.obj));
		//  225  581:aload_1         
		//  226  582:getfield        #167 <Field Object Message.obj>
		//  227  585:checkcast       #300 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//  228  588:astore_1        
				callback.onCommand(((MediaSessionImplBase.Command) (message)).command, ((MediaSessionImplBase.Command) (message)).extras, ((MediaSessionImplBase.Command) (message)).stub);
		//  229  589:aload_2         
		//  230  590:aload_1         
		//  231  591:getfield        #304 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
		//  232  594:aload_1         
		//  233  595:getfield        #308 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
		//  234  598:aload_1         
		//  235  599:getfield        #312 <Field ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
		//  236  602:invokevirtual   #316 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
				break;
			}
		//  237  605:return          
		}

		public void post(int i)
		{
			post(i, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #320 <Method void post(int, Object)>
		//    4    6:return          
		}

		public void post(int i, Object obj)
		{
			obtainMessage(i, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #324 <Method Message obtainMessage(int, Object)>
		//    4    6:invokevirtual   #327 <Method void Message.sendToTarget()>
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
		//    5    5:invokevirtual   #331 <Method Message obtainMessage(int, int, int, Object)>
		//    6    8:invokevirtual   #327 <Method void Message.sendToTarget()>
		//    7   11:return          
		}

		public void post(int i, Object obj, Bundle bundle)
		{
			obj = ((Object) (obtainMessage(i, obj)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #324 <Method Message obtainMessage(int, Object)>
		//    4    6:astore_2        
			((Message) (obj)).setData(bundle);
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #336 <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
		//    8   12:aload_2         
		//    9   13:invokevirtual   #327 <Method void Message.sendToTarget()>
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
		//*   1    1:getfield        #69  <Field Object mItem>
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
		//   14   33:putfield        #69  <Field Object mItem>
				return mItem;
		//   15   36:aload_0         
		//   16   37:getfield        #69  <Field Object mItem>
		//   17   40:areturn         
			} else
			{
				return mItem;
		//   18   41:aload_0         
		//   19   42:getfield        #69  <Field Object mItem>
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
			obj = ((Object) ((Token)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
		//   12   20:astore_1        
			if(mInner == null)
		//*  13   21:aload_0         
		//*  14   22:getfield        #33  <Field Object mInner>
		//*  15   25:ifnonnull       39
				return ((Token) (obj)).mInner == null;
		//   16   28:aload_1         
		//   17   29:getfield        #33  <Field Object mInner>
		//   18   32:ifnonnull       37
		//   19   35:iconst_1        
		//   20   36:ireturn         
		//   21   37:iconst_0        
		//   22   38:ireturn         
			if(((Token) (obj)).mInner == null)
		//*  23   39:aload_1         
		//*  24   40:getfield        #33  <Field Object mInner>
		//*  25   43:ifnonnull       48
				return false;
		//   26   46:iconst_0        
		//   27   47:ireturn         
			else
				return mInner.equals(((Token) (obj)).mInner);
		//   28   48:aload_0         
		//   29   49:getfield        #33  <Field Object mInner>
		//   30   52:aload_1         
		//   31   53:getfield        #33  <Field Object mInner>
		//   32   56:invokevirtual   #63  <Method boolean Object.equals(Object)>
		//   33   59:ireturn         
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
	//    1    1:invokespecial   #179 <Method void Object()>
		mActiveListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #181 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #182 <Method void ArrayList()>
	//    6   12:putfield        #184 <Field ArrayList mActiveListeners>
		mImpl = mediasessionimpl;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		if(android.os.Build.VERSION.SDK_INT >= 21 && !MediaSessionCompatApi21.hasCallback(mediasessionimpl.getMediaSession()))
	//*  10   20:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   23:bipush          21
	//*  12   25:icmplt          52
	//*  13   28:aload_2         
	//*  14   29:invokeinterface #195 <Method Object MediaSessionCompat$MediaSessionImpl.getMediaSession()>
	//*  15   34:invokestatic    #201 <Method boolean MediaSessionCompatApi21.hasCallback(Object)>
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
	//   21   46:invokespecial   #204 <Method void MediaSessionCompat$2(MediaSessionCompat)>
	//   22   49:invokevirtual   #208 <Method void setCallback(MediaSessionCompat$Callback)>
		mController = new MediaControllerCompat(context, this);
	//   23   52:aload_0         
	//   24   53:new             #210 <Class MediaControllerCompat>
	//   25   56:dup             
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:invokespecial   #213 <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//   29   62:putfield        #215 <Field MediaControllerCompat mController>
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
	//    5    5:invokespecial   #220 <Method void MediaSessionCompat(Context, String, ComponentName, PendingIntent)>
	//    6    8:return          
	}

	public MediaSessionCompat(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #179 <Method void Object()>
		mActiveListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #181 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #182 <Method void ArrayList()>
	//    6   12:putfield        #184 <Field ArrayList mActiveListeners>
		if(context == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       29
			throw new IllegalArgumentException("context must not be null");
	//    9   19:new             #222 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #224 <String "context must not be null">
	//   12   25:invokespecial   #227 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   29:aload_2         
	//*  15   30:invokestatic    #233 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   33:ifeq            46
			throw new IllegalArgumentException("tag must not be null or empty");
	//   17   36:new             #222 <Class IllegalArgumentException>
	//   18   39:dup             
	//   19   40:ldc1            #235 <String "tag must not be null or empty">
	//   20   42:invokespecial   #227 <Method void IllegalArgumentException(String)>
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
	//   27   54:invokestatic    #241 <Method ComponentName MediaButtonReceiver.getMediaButtonReceiverComponent(Context)>
	//   28   57:astore_3        
			componentname1 = componentname;
	//   29   58:aload_3         
	//   30   59:astore          5
			if(componentname == null)
	//*  31   61:aload_3         
	//*  32   62:ifnonnull       76
			{
				Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
	//   33   65:ldc1            #166 <String "MediaSessionCompat">
	//   34   67:ldc1            #243 <String "Couldn't find a unique registered media button receiver in the given context.">
	//   35   69:invokestatic    #249 <Method int Log.w(String, String)>
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
	//*  42   81:ifnull          117
		{
			componentname = ((ComponentName) (pendingintent));
	//   43   84:aload           4
	//   44   86:astore_3        
			if(pendingintent == null)
	//*  45   87:aload           4
	//*  46   89:ifnonnull       117
			{
				componentname = ((ComponentName) (new Intent("android.intent.action.MEDIA_BUTTON")));
	//   47   92:new             #251 <Class Intent>
	//   48   95:dup             
	//   49   96:ldc1            #253 <String "android.intent.action.MEDIA_BUTTON">
	//   50   98:invokespecial   #254 <Method void Intent(String)>
	//   51  101:astore_3        
				((Intent) (componentname)).setComponent(componentname1);
	//   52  102:aload_3         
	//   53  103:aload           5
	//   54  105:invokevirtual   #258 <Method Intent Intent.setComponent(ComponentName)>
	//   55  108:pop             
				componentname = ((ComponentName) (PendingIntent.getBroadcast(context, 0, ((Intent) (componentname)), 0)));
	//   56  109:aload_1         
	//   57  110:iconst_0        
	//   58  111:aload_3         
	//   59  112:iconst_0        
	//   60  113:invokestatic    #264 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   61  116:astore_3        
			}
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  62  117:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*  63  120:bipush          21
	//*  64  122:icmplt          163
		{
			mImpl = ((MediaSessionImpl) (new MediaSessionImplApi21(context, s)));
	//   65  125:aload_0         
	//   66  126:new             #38  <Class MediaSessionCompat$MediaSessionImplApi21>
	//   67  129:dup             
	//   68  130:aload_1         
	//   69  131:aload_2         
	//   70  132:invokespecial   #266 <Method void MediaSessionCompat$MediaSessionImplApi21(Context, String)>
	//   71  135:putfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
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
	//   72  138:aload_0         
	//   73  139:new             #6   <Class MediaSessionCompat$1>
	//   74  142:dup             
	//   75  143:aload_0         
	//   76  144:invokespecial   #267 <Method void MediaSessionCompat$1(MediaSessionCompat)>
	//   77  147:invokevirtual   #208 <Method void setCallback(MediaSessionCompat$Callback)>
			mImpl.setMediaButtonReceiver(((PendingIntent) (componentname)));
	//   78  150:aload_0         
	//   79  151:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//   80  154:aload_3         
	//   81  155:invokeinterface #271 <Method void MediaSessionCompat$MediaSessionImpl.setMediaButtonReceiver(PendingIntent)>
		} else
	//*  82  160:goto            233
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  83  163:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*  84  166:bipush          19
	//*  85  168:icmplt          190
			mImpl = ((MediaSessionImpl) (new MediaSessionImplApi19(context, s, componentname1, ((PendingIntent) (componentname)))));
	//   86  171:aload_0         
	//   87  172:new             #33  <Class MediaSessionCompat$MediaSessionImplApi19>
	//   88  175:dup             
	//   89  176:aload_1         
	//   90  177:aload_2         
	//   91  178:aload           5
	//   92  180:aload_3         
	//   93  181:invokespecial   #272 <Method void MediaSessionCompat$MediaSessionImplApi19(Context, String, ComponentName, PendingIntent)>
	//   94  184:putfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		else
	//*  95  187:goto            233
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  96  190:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*  97  193:bipush          18
	//*  98  195:icmplt          217
			mImpl = ((MediaSessionImpl) (new MediaSessionImplApi18(context, s, componentname1, ((PendingIntent) (componentname)))));
	//   99  198:aload_0         
	//  100  199:new             #28  <Class MediaSessionCompat$MediaSessionImplApi18>
	//  101  202:dup             
	//  102  203:aload_1         
	//  103  204:aload_2         
	//  104  205:aload           5
	//  105  207:aload_3         
	//  106  208:invokespecial   #273 <Method void MediaSessionCompat$MediaSessionImplApi18(Context, String, ComponentName, PendingIntent)>
	//  107  211:putfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		else
	//* 108  214:goto            233
			mImpl = ((MediaSessionImpl) (new MediaSessionImplBase(context, s, componentname1, ((PendingIntent) (componentname)))));
	//  109  217:aload_0         
	//  110  218:new             #44  <Class MediaSessionCompat$MediaSessionImplBase>
	//  111  221:dup             
	//  112  222:aload_1         
	//  113  223:aload_2         
	//  114  224:aload           5
	//  115  226:aload_3         
	//  116  227:invokespecial   #274 <Method void MediaSessionCompat$MediaSessionImplBase(Context, String, ComponentName, PendingIntent)>
	//  117  230:putfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
		mController = new MediaControllerCompat(context, this);
	//  118  233:aload_0         
	//  119  234:new             #210 <Class MediaControllerCompat>
	//  120  237:dup             
	//  121  238:aload_1         
	//  122  239:aload_0         
	//  123  240:invokespecial   #213 <Method void MediaControllerCompat(Context, MediaSessionCompat)>
	//  124  243:putfield        #215 <Field MediaControllerCompat mController>
		if(sMaxBitmapSize == 0)
	//* 125  246:getstatic       #276 <Field int sMaxBitmapSize>
	//* 126  249:ifne            270
			sMaxBitmapSize = (int)TypedValue.applyDimension(1, 320F, context.getResources().getDisplayMetrics());
	//  127  252:iconst_1        
	//  128  253:ldc2            #277 <Float 320F>
	//  129  256:aload_1         
	//  130  257:invokevirtual   #283 <Method Resources Context.getResources()>
	//  131  260:invokevirtual   #289 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//  132  263:invokestatic    #295 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//  133  266:f2i             
	//  134  267:putstatic       #276 <Field int sMaxBitmapSize>
	//  135  270:return          
	}

	public static MediaSessionCompat fromMediaSession(Context context, Object obj)
	{
		if(context != null && obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          33
	//*   2    4:aload_1         
	//*   3    5:ifnull          33
	//*   4    8:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmplt          33
			return new MediaSessionCompat(context, ((MediaSessionImpl) (new MediaSessionImplApi21(obj))));
	//    7   16:new             #2   <Class MediaSessionCompat>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:new             #38  <Class MediaSessionCompat$MediaSessionImplApi21>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokespecial   #305 <Method void MediaSessionCompat$MediaSessionImplApi21(Object)>
	//   14   29:invokespecial   #307 <Method void MediaSessionCompat(Context, MediaSessionCompat$MediaSessionImpl)>
	//   15   32:areturn         
		else
			return null;
	//   16   33:aconst_null     
	//   17   34:areturn         
	}

	private static PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat playbackstatecompat, MediaMetadataCompat mediametadatacompat)
	{
		if(playbackstatecompat != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          169
		{
			long l = playbackstatecompat.getPosition();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #313 <Method long PlaybackStateCompat.getPosition()>
	//    4    8:lstore_2        
			long l2 = -1L;
	//    5    9:ldc2w           #314 <Long -1L>
	//    6   12:lstore          4
			if(l == -1L)
	//*   7   14:lload_2         
	//*   8   15:ldc2w           #314 <Long -1L>
	//*   9   18:lcmp            
	//*  10   19:ifne            24
				return playbackstatecompat;
	//   11   22:aload_0         
	//   12   23:areturn         
			if(playbackstatecompat.getState() == 3 || playbackstatecompat.getState() == 4 || playbackstatecompat.getState() == 5)
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #319 <Method int PlaybackStateCompat.getState()>
	//*  15   28:iconst_3        
	//*  16   29:icmpeq          48
	//*  17   32:aload_0         
	//*  18   33:invokevirtual   #319 <Method int PlaybackStateCompat.getState()>
	//*  19   36:iconst_4        
	//*  20   37:icmpeq          48
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #319 <Method int PlaybackStateCompat.getState()>
	//*  23   44:iconst_5        
	//*  24   45:icmpne          167
			{
				long l1 = playbackstatecompat.getLastPositionUpdateTime();
	//   25   48:aload_0         
	//   26   49:invokevirtual   #322 <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
	//   27   52:lstore_2        
				if(l1 > 0L)
	//*  28   53:lload_2         
	//*  29   54:lconst_0        
	//*  30   55:lcmp            
	//*  31   56:ifle            167
				{
					long l4 = SystemClock.elapsedRealtime();
	//   32   59:invokestatic    #327 <Method long SystemClock.elapsedRealtime()>
	//   33   62:lstore          8
					long l3 = (long)(playbackstatecompat.getPlaybackSpeed() * (float)(l4 - l1)) + playbackstatecompat.getPosition();
	//   34   64:aload_0         
	//   35   65:invokevirtual   #331 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//   36   68:lload           8
	//   37   70:lload_2         
	//   38   71:lsub            
	//   39   72:l2f             
	//   40   73:fmul            
	//   41   74:f2l             
	//   42   75:aload_0         
	//   43   76:invokevirtual   #313 <Method long PlaybackStateCompat.getPosition()>
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
	//*  53   93:ldc2            #333 <String "android.media.metadata.DURATION">
	//*  54   96:invokevirtual   #339 <Method boolean MediaMetadataCompat.containsKey(String)>
	//*  55   99:ifeq            110
							l1 = mediametadatacompat.getLong("android.media.metadata.DURATION");
	//   56  102:aload_1         
	//   57  103:ldc2            #333 <String "android.media.metadata.DURATION">
	//   58  106:invokevirtual   #343 <Method long MediaMetadataCompat.getLong(String)>
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
	//   78  141:new             #345 <Class PlaybackStateCompat$Builder>
	//   79  144:dup             
	//   80  145:aload_0         
	//   81  146:invokespecial   #348 <Method void PlaybackStateCompat$Builder(PlaybackStateCompat)>
	//   82  149:aload_0         
	//   83  150:invokevirtual   #319 <Method int PlaybackStateCompat.getState()>
	//   84  153:lload_2         
	//   85  154:aload_0         
	//   86  155:invokevirtual   #331 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//   87  158:lload           8
	//   88  160:invokevirtual   #352 <Method PlaybackStateCompat$Builder PlaybackStateCompat$Builder.setState(int, long, float, long)>
	//   89  163:invokevirtual   #356 <Method PlaybackStateCompat PlaybackStateCompat$Builder.build()>
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
		if(onactivechangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    2    4:new             #222 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #360 <String "Listener may not be null">
	//    5   11:invokespecial   #227 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mActiveListeners.add(((Object) (onactivechangelistener)));
	//    7   15:aload_0         
	//    8   16:getfield        #184 <Field ArrayList mActiveListeners>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #363 <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public String getCallingPackage()
	{
		return mImpl.getCallingPackage();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #371 <Method String MediaSessionCompat$MediaSessionImpl.getCallingPackage()>
	//    3    9:areturn         
	}

	public MediaControllerCompat getController()
	{
		return mController;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field MediaControllerCompat mController>
	//    2    4:areturn         
	}

	public Object getMediaSession()
	{
		return mImpl.getMediaSession();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #195 <Method Object MediaSessionCompat$MediaSessionImpl.getMediaSession()>
	//    3    9:areturn         
	}

	public Object getRemoteControlClient()
	{
		return mImpl.getRemoteControlClient();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #377 <Method Object MediaSessionCompat$MediaSessionImpl.getRemoteControlClient()>
	//    3    9:areturn         
	}

	public Token getSessionToken()
	{
		return mImpl.getSessionToken();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #381 <Method MediaSessionCompat$Token MediaSessionCompat$MediaSessionImpl.getSessionToken()>
	//    3    9:areturn         
	}

	public boolean isActive()
	{
		return mImpl.isActive();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #385 <Method boolean MediaSessionCompat$MediaSessionImpl.isActive()>
	//    3    9:ireturn         
	}

	public void release()
	{
		mImpl.release();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:invokeinterface #388 <Method void MediaSessionCompat$MediaSessionImpl.release()>
	//    3    9:return          
	}

	public void removeOnActiveChangeListener(OnActiveChangeListener onactivechangelistener)
	{
		if(onactivechangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Listener may not be null");
	//    2    4:new             #222 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #360 <String "Listener may not be null">
	//    5   11:invokespecial   #227 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mActiveListeners.remove(((Object) (onactivechangelistener)));
	//    7   15:aload_0         
	//    8   16:getfield        #184 <Field ArrayList mActiveListeners>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #392 <Method boolean ArrayList.remove(Object)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #233 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
		{
			throw new IllegalArgumentException("event cannot be null or empty");
	//    3    7:new             #222 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #396 <String "event cannot be null or empty">
	//    6   14:invokespecial   #227 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		} else
		{
			mImpl.sendSessionEvent(s, bundle);
	//    8   18:aload_0         
	//    9   19:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokeinterface #398 <Method void MediaSessionCompat$MediaSessionImpl.sendSessionEvent(String, Bundle)>
			return;
	//   13   29:return          
		}
	}

	public void setActive(boolean flag)
	{
		mImpl.setActive(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #402 <Method void MediaSessionCompat$MediaSessionImpl.setActive(boolean)>
		for(Iterator iterator = mActiveListeners.iterator(); iterator.hasNext(); ((OnActiveChangeListener)iterator.next()).onActiveChanged());
	//    4   10:aload_0         
	//    5   11:getfield        #184 <Field ArrayList mActiveListeners>
	//    6   14:invokevirtual   #406 <Method Iterator ArrayList.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #411 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            44
	//   11   27:aload_2         
	//   12   28:invokeinterface #414 <Method Object Iterator.next()>
	//   13   33:checkcast       #58  <Class MediaSessionCompat$OnActiveChangeListener>
	//   14   36:invokeinterface #417 <Method void MediaSessionCompat$OnActiveChangeListener.onActiveChanged()>
	//*  15   41:goto            18
	//   16   44:return          
	}

	public void setCallback(Callback callback)
	{
		setCallback(callback, ((Handler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #420 <Method void setCallback(MediaSessionCompat$Callback, Handler)>
	//    4    6:return          
	}

	public void setCallback(Callback callback, Handler handler)
	{
		MediaSessionImpl mediasessionimpl = mImpl;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:astore_3        
		if(handler == null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          12
	//*   5    9:goto            20
			handler = new Handler();
	//    6   12:new             #422 <Class Handler>
	//    7   15:dup             
	//    8   16:invokespecial   #423 <Method void Handler()>
	//    9   19:astore_2        
		mediasessionimpl.setCallback(callback, handler);
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokeinterface #424 <Method void MediaSessionCompat$MediaSessionImpl.setCallback(MediaSessionCompat$Callback, Handler)>
	//   14   28:return          
	}

	public void setCaptioningEnabled(boolean flag)
	{
		mImpl.setCaptioningEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #427 <Method void MediaSessionCompat$MediaSessionImpl.setCaptioningEnabled(boolean)>
	//    4   10:return          
	}

	public void setExtras(Bundle bundle)
	{
		mImpl.setExtras(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #431 <Method void MediaSessionCompat$MediaSessionImpl.setExtras(Bundle)>
	//    4   10:return          
	}

	public void setFlags(int i)
	{
		mImpl.setFlags(i);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #435 <Method void MediaSessionCompat$MediaSessionImpl.setFlags(int)>
	//    4   10:return          
	}

	public void setMediaButtonReceiver(PendingIntent pendingintent)
	{
		mImpl.setMediaButtonReceiver(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #271 <Method void MediaSessionCompat$MediaSessionImpl.setMediaButtonReceiver(PendingIntent)>
	//    4   10:return          
	}

	public void setMetadata(MediaMetadataCompat mediametadatacompat)
	{
		mImpl.setMetadata(mediametadatacompat);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #439 <Method void MediaSessionCompat$MediaSessionImpl.setMetadata(MediaMetadataCompat)>
	//    4   10:return          
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		mImpl.setPlaybackState(playbackstatecompat);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #442 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackState(PlaybackStateCompat)>
	//    4   10:return          
	}

	public void setPlaybackToLocal(int i)
	{
		mImpl.setPlaybackToLocal(i);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #445 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackToLocal(int)>
	//    4   10:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		if(volumeprovidercompat == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("volumeProvider may not be null!");
	//    2    4:new             #222 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #449 <String "volumeProvider may not be null!">
	//    5   11:invokespecial   #227 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mImpl.setPlaybackToRemote(volumeprovidercompat);
	//    7   15:aload_0         
	//    8   16:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    9   19:aload_1         
	//   10   20:invokeinterface #451 <Method void MediaSessionCompat$MediaSessionImpl.setPlaybackToRemote(VolumeProviderCompat)>
			return;
	//   11   25:return          
		}
	}

	public void setQueue(List list)
	{
		mImpl.setQueue(list);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #455 <Method void MediaSessionCompat$MediaSessionImpl.setQueue(List)>
	//    4   10:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		mImpl.setQueueTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #461 <Method void MediaSessionCompat$MediaSessionImpl.setQueueTitle(CharSequence)>
	//    4   10:return          
	}

	public void setRatingType(int i)
	{
		mImpl.setRatingType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #464 <Method void MediaSessionCompat$MediaSessionImpl.setRatingType(int)>
	//    4   10:return          
	}

	public void setRepeatMode(int i)
	{
		mImpl.setRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #467 <Method void MediaSessionCompat$MediaSessionImpl.setRepeatMode(int)>
	//    4   10:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		mImpl.setSessionActivity(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #470 <Method void MediaSessionCompat$MediaSessionImpl.setSessionActivity(PendingIntent)>
	//    4   10:return          
	}

	public void setShuffleMode(int i)
	{
		mImpl.setShuffleMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field MediaSessionCompat$MediaSessionImpl mImpl>
	//    2    4:iload_1         
	//    3    5:invokeinterface #473 <Method void MediaSessionCompat$MediaSessionImpl.setShuffleMode(int)>
	//    4   10:return          
	}

	static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
	static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
	static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
	static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
	static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
	static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
	static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
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
	//    2    2:invokestatic    #300 <Method PlaybackStateCompat getStateWithUpdatedPosition(PlaybackStateCompat, MediaMetadataCompat)>
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
