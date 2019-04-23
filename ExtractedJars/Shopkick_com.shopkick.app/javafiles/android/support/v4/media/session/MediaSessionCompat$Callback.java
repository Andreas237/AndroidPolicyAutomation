// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaSessionCompatApi24, MediaSessionCompatApi23, MediaSessionCompatApi21, 
//			PlaybackStateCompat, IMediaSession

public static abstract class MediaSessionCompat$Callback
{
	private class CallbackHandler extends Handler
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
		final MediaSessionCompat.Callback this$0;

		CallbackHandler(Looper looper)
		{
			this$0 = MediaSessionCompat.Callback.this;
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

	private class StubApi21
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
			MediaSessionCompat.Token token;
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
			s = ((String) ((MediaSessionCompat.MediaSessionImplApi21)mSessionImpl.get()));
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
			token = ((MediaSessionCompat.MediaSessionImplApi21) (s)).getSessionToken();
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
		//   34   68:invokeinterface #68  <Method android.os.IBinder IMediaSession.asBinder()>
		//   35   73:astore_1        
			BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((android.os.IBinder) (s)));
		//   36   74:aload_2         
		//   37   75:ldc1            #70  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   38   77:aload_1         
		//   39   78:invokestatic    #76  <Method void BundleCompat.putBinder(Bundle, String, android.os.IBinder)>
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
		//   58  115:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		//   70  141:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		//   85  173:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
			resultreceiver = ((ResultReceiver) ((MediaSessionCompat.MediaSessionImplApi21)mSessionImpl.get()));
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
			if(((MediaSessionCompat.MediaSessionImplApi21) (resultreceiver)).mQueue == null)
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
			if(i < ((MediaSessionCompat.MediaSessionImplApi21) (resultreceiver)).mQueue.size())
		//* 115  237:iload           4
		//* 116  239:aload_3         
		//* 117  240:getfield        #128 <Field List MediaSessionCompat$MediaSessionImplApi21.mQueue>
		//* 118  243:invokeinterface #137 <Method int List.size()>
		//* 119  248:icmpge          266
				s = ((String) ((MediaSessionCompat.QueueItem)((MediaSessionCompat.MediaSessionImplApi21) (resultreceiver)).mQueue.get(i)));
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
					onRemoveQueueItem(((MediaSessionCompat.QueueItem) (s)).getDescription());
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
			MediaSessionCompat.Callback.this.onCommand(s, bundle, resultreceiver);
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
		//   12   25:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		//   63  126:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		//  117  233:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  118  236:checkcast       #240 <Class RatingCompat>
		//  119  239:astore_1        
				MediaSessionCompat.Callback.this.onSetRating(((RatingCompat) (s)), bundle1);
		//  120  240:aload_0         
		//  121  241:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  122  244:aload_1         
		//  123  245:aload           5
		//  124  247:invokevirtual   #244 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//  125  250:return          
			} else
			{
				MediaSessionCompat.Callback.this.onCustomAction(s, bundle);
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
			MediaSessionCompat.Callback.this.onFastForward();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #249 <Method void MediaSessionCompat$Callback.onFastForward()>
		//    3    7:return          
		}

		public boolean onMediaButtonEvent(Intent intent)
		{
			return MediaSessionCompat.Callback.this.onMediaButtonEvent(intent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #253 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//    4    8:ireturn         
		}

		public void onPause()
		{
			MediaSessionCompat.Callback.this.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #256 <Method void MediaSessionCompat$Callback.onPause()>
		//    3    7:return          
		}

		public void onPlay()
		{
			MediaSessionCompat.Callback.this.onPlay();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #259 <Method void MediaSessionCompat$Callback.onPlay()>
		//    3    7:return          
		}

		public void onPlayFromMediaId(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #262 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPlayFromSearch(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #265 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onRewind()
		{
			MediaSessionCompat.Callback.this.onRewind();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #268 <Method void MediaSessionCompat$Callback.onRewind()>
		//    3    7:return          
		}

		public void onSeekTo(long l)
		{
			MediaSessionCompat.Callback.this.onSeekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #272 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
		//    4    8:return          
		}

		public void onSetRating(Object obj)
		{
			MediaSessionCompat.Callback.this.onSetRating(RatingCompat.fromRating(obj));
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
			MediaSessionCompat.Callback.this.onSkipToNext();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #284 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		//    3    7:return          
		}

		public void onSkipToPrevious()
		{
			MediaSessionCompat.Callback.this.onSkipToPrevious();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #287 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		//    3    7:return          
		}

		public void onSkipToQueueItem(long l)
		{
			MediaSessionCompat.Callback.this.onSkipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #290 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
		//    4    8:return          
		}

		public void onStop()
		{
			MediaSessionCompat.Callback.this.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #293 <Method void MediaSessionCompat$Callback.onStop()>
		//    3    7:return          
		}

		final MediaSessionCompat.Callback this$0;

		StubApi21()
		{
			this$0 = MediaSessionCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
		//    5    9:return          
		}
	}

	private class StubApi23 extends StubApi21
		implements MediaSessionCompatApi23.Callback
	{

		public void onPlayFromUri(Uri uri, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #28  <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		final MediaSessionCompat.Callback this$0;

		StubApi23()
		{
			this$0 = MediaSessionCompat.Callback.this;
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

	private class StubApi24 extends StubApi23
		implements MediaSessionCompatApi24.Callback
	{

		public void onPrepare()
		{
			MediaSessionCompat.Callback.this.onPrepare();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #28  <Method void MediaSessionCompat$Callback.onPrepare()>
		//    3    7:return          
		}

		public void onPrepareFromMediaId(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPrepareFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPrepareFromSearch(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPrepareFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #35  <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onPrepareFromUri(Uri uri, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPrepareFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #39  <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		final MediaSessionCompat.Callback this$0;

		StubApi24()
		{
			this$0 = MediaSessionCompat.Callback.this;
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


	void handleMediaPlayPauseKeySingleTapIfPending(android.support.v4.media.erInfo erinfo)
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
		ionImpl ionimpl = (ionImpl)mSessionImpl.get();
	//   13   24:aload_0         
	//   14   25:getfield        #74  <Field WeakReference mSessionImpl>
	//   15   28:invokevirtual   #80  <Method Object WeakReference.get()>
	//   16   31:checkcast       #82  <Class MediaSessionCompat$MediaSessionImpl>
	//   17   34:astore          7
		if(ionimpl == null)
	//*  18   36:aload           7
	//*  19   38:ifnonnull       42
			return;
	//   20   41:return          
		PlaybackStateCompat playbackstatecompat = ionimpl.getPlaybackState();
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
		ionimpl.setCurrentControllerInfo(erinfo);
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
		ionimpl.setCurrentControllerInfo(((android.support.v4.media.erInfo) (null)));
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
		ionImpl ionimpl = (ionImpl)mSessionImpl.get();
	//    5   10:aload_0         
	//    6   11:getfield        #74  <Field WeakReference mSessionImpl>
	//    7   14:invokevirtual   #80  <Method Object WeakReference.get()>
	//    8   17:checkcast       #82  <Class MediaSessionCompat$MediaSessionImpl>
	//    9   20:astore          5
		if(ionimpl != null)
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
	//   19   39:invokevirtual   #127 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
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
				intent = ((Intent) (ionimpl.getCurrentControllerInfo()));
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
					handleMediaPlayPauseKeySingleTapIfPending(((android.support.v4.media.erInfo) (intent)));
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
					handleMediaPlayPauseKeySingleTapIfPending(((android.support.v4.media.erInfo) (intent)));
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
					intent = ((Intent) (ionimpl.getPlaybackState()));
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

	void setSessionImpl(ionImpl ionimpl, Handler handler)
	{
		mSessionImpl = new WeakReference(((Object) (ionimpl)));
	//    0    0:aload_0         
	//    1    1:new             #76  <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #192 <Method void WeakReference(Object)>
	//    5    9:putfield        #74  <Field WeakReference mSessionImpl>
		ionimpl = ((ionImpl) (mCallbackHandler));
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field MediaSessionCompat$Callback$CallbackHandler mCallbackHandler>
	//    8   16:astore_1        
		if(ionimpl != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          26
			((CallbackHandler) (ionimpl)).removeCallbacksAndMessages(((Object) (null)));
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

	public MediaSessionCompat$Callback()
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
			mCallbackObj = MediaSessionCompatApi24.createCallback(((back) (new StubApi24())));
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
			mCallbackObj = MediaSessionCompatApi23.createCallback(((back) (new StubApi23())));
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
			mCallbackObj = MediaSessionCompatApi21.createCallback(((back) (new StubApi21())));
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
