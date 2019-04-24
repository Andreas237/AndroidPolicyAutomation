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
		//*   3    5:icmpne          15
				handleMediaPlayPauseKeySingleTapIfPending();
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field MediaSessionCompat$Callback this$0>
		//    6   12:invokestatic    #34  <Method void MediaSessionCompat$Callback.access$000(MediaSessionCompat$Callback)>
		//    7   15:return          
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
			Object obj = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			if(!s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) goto _L2; else goto _L1
		//    2    3:aload_1         
		//    3    4:ldc1            #31  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//    4    6:invokevirtual   #37  <Method boolean String.equals(Object)>
		//    5    9:ifeq            77
_L1:
			s = ((String) ((MediaSessionCompat.MediaSessionImplApi21)mSessionImpl.get()));
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
			s = ((String) (((MediaSessionCompat.MediaSessionImplApi21) (s)).getSessionToken().getExtraBinder()));
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
		//*  29   57:invokestatic    #70  <Method void BundleCompat.putBinder(Bundle, String, android.os.IBinder)>
		//*  30   60:aload_3         
		//*  31   61:iconst_0        
		//*  32   62:aload_2         
		//*  33   63:invokevirtual   #76  <Method void ResultReceiver.send(int, Bundle)>
		//*  34   66:return          
			s = ((String) (((IMediaSession) (s)).asBinder()));
		//   35   67:aload_1         
		//   36   68:invokeinterface #82  <Method android.os.IBinder IMediaSession.asBinder()>
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
		//   51  102:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   52  105:checkcast       #86  <Class MediaDescriptionCompat>
		//   53  108:invokevirtual   #106 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//   54  111:return          
			}
			break MISSING_BLOCK_LABEL_122;
_L5:
			try
			{
				BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((android.os.IBinder) (s)));
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
		//   73  147:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		//   92  188:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
			s = ((String) ((MediaSessionCompat.MediaSessionImplApi21)mSessionImpl.get()));
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
			if(MediaSessionCompat.MediaSessionImplApi21.access$200(((MediaSessionCompat.MediaSessionImplApi21) (s))) == null) goto _L4; else goto _L9
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
			if(i >= MediaSessionCompat.MediaSessionImplApi21.access$200(((MediaSessionCompat.MediaSessionImplApi21) (s))).size()) goto _L11; else goto _L12
		//  118  246:iload           4
		//  119  248:aload_1         
		//  120  249:invokestatic    #138 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
		//  121  252:invokeinterface #147 <Method int List.size()>
		//  122  257:icmpge          302
_L12:
			s = ((String) ((MediaSessionCompat.QueueItem)MediaSessionCompat.MediaSessionImplApi21.access$200(((MediaSessionCompat.MediaSessionImplApi21) (s))).get(i)));
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
			onRemoveQueueItem(((MediaSessionCompat.QueueItem) (s)).getDescription());
		//  131  279:aload_0         
		//  132  280:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  133  283:aload_1         
		//  134  284:invokevirtual   #156 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//  135  287:invokevirtual   #132 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			return;
		//  136  290:return          
_L7:
			MediaSessionCompat.Callback.this.onCommand(s, bundle, resultreceiver);
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
		//    6   12:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//    7   15:checkcast       #166 <Class Uri>
		//    8   18:astore_1        
				bundle = (Bundle)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//    9   19:aload_2         
		//   10   20:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   11   22:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		//   70  134:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		//  145  283:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  146  286:checkcast       #242 <Class RatingCompat>
		//  147  289:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//  148  290:aload_2         
		//  149  291:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//  150  293:invokevirtual   #189 <Method Bundle Bundle.getBundle(String)>
		//  151  296:astore_2        
				MediaSessionCompat.Callback.this.onSetRating(((RatingCompat) (s)), bundle);
		//  152  297:aload_0         
		//  153  298:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//  154  301:aload_1         
		//  155  302:aload_2         
		//  156  303:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//  157  306:return          
			} else
			{
				MediaSessionCompat.Callback.this.onCustomAction(s, bundle);
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
			MediaSessionCompat.Callback.this.onFastForward();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #253 <Method void MediaSessionCompat$Callback.onFastForward()>
		//    3    7:return          
		}

		public boolean onMediaButtonEvent(Intent intent)
		{
			return MediaSessionCompat.Callback.this.onMediaButtonEvent(intent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #257 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//    4    8:ireturn         
		}

		public void onPause()
		{
			MediaSessionCompat.Callback.this.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onPause()>
		//    3    7:return          
		}

		public void onPlay()
		{
			MediaSessionCompat.Callback.this.onPlay();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #263 <Method void MediaSessionCompat$Callback.onPlay()>
		//    3    7:return          
		}

		public void onPlayFromMediaId(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #266 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPlayFromSearch(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #269 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onRewind()
		{
			MediaSessionCompat.Callback.this.onRewind();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #272 <Method void MediaSessionCompat$Callback.onRewind()>
		//    3    7:return          
		}

		public void onSeekTo(long l)
		{
			MediaSessionCompat.Callback.this.onSeekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #276 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
		//    4    8:return          
		}

		public void onSetRating(Object obj)
		{
			MediaSessionCompat.Callback.this.onSetRating(RatingCompat.fromRating(obj));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #281 <Method RatingCompat RatingCompat.fromRating(Object)>
		//    4    8:invokevirtual   #284 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
		//    5   11:return          
		}

		public void onSetRating(Object obj, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onSetRating(RatingCompat.fromRating(obj), bundle);
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
			MediaSessionCompat.Callback.this.onSkipToNext();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #288 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		//    3    7:return          
		}

		public void onSkipToPrevious()
		{
			MediaSessionCompat.Callback.this.onSkipToPrevious();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #291 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		//    3    7:return          
		}

		public void onSkipToQueueItem(long l)
		{
			MediaSessionCompat.Callback.this.onSkipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #294 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
		//    4    8:return          
		}

		public void onStop()
		{
			MediaSessionCompat.Callback.this.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #297 <Method void MediaSessionCompat$Callback.onStop()>
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
			Object obj = ((Object) ((ionImpl)mSessionImpl.get()));
	//   11   21:aload_0         
	//   12   22:getfield        #72  <Field WeakReference mSessionImpl>
	//   13   25:invokevirtual   #90  <Method Object WeakReference.get()>
	//   14   28:checkcast       #92  <Class MediaSessionCompat$MediaSessionImpl>
	//   15   31:astore          6
			if(obj != null)
	//*  16   33:aload           6
	//*  17   35:ifnull          7
			{
				obj = ((Object) (((ionImpl) (obj)).getPlaybackState()));
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

	private void setSessionImpl(ionImpl ionimpl, Handler handler)
	{
		mSessionImpl = new WeakReference(((Object) (ionimpl)));
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
		ionImpl ionimpl;
		ionimpl = (ionImpl)mSessionImpl.get();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field WeakReference mSessionImpl>
	//    2    4:invokevirtual   #90  <Method Object WeakReference.get()>
	//    3    7:checkcast       #92  <Class MediaSessionCompat$MediaSessionImpl>
	//    4   10:astore          4
		if(ionimpl == null || mCallbackHandler == null)
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
	//   14   29:invokevirtual   #149 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
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
	//	               79: 86
	//	               85: 86
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
			intent = ((Intent) (ionimpl.getPlaybackState()));
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
	static void access$000(MediaSessionCompat$Callback mediasessioncompat$callback)
	{
		mediasessioncompat$callback.handleMediaPlayPauseKeySingleTapIfPending();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void handleMediaPlayPauseKeySingleTapIfPending()>
		return;
	//    2    4:return          
	}

*/


/*
	static WeakReference access$100(MediaSessionCompat$Callback mediasessioncompat$callback)
	{
		return mediasessioncompat$callback.mSessionImpl;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field WeakReference mSessionImpl>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(MediaSessionCompat$Callback mediasessioncompat$callback, ionImpl ionimpl, Handler handler)
	{
		mediasessioncompat$callback.setSessionImpl(ionimpl, handler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #78  <Method void setSessionImpl(MediaSessionCompat$MediaSessionImpl, Handler)>
		return;
	//    4    6:return          
	}

*/

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
