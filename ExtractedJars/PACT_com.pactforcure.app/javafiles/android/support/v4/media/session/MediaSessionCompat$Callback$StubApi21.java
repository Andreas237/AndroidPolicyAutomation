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
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, IMediaSession

private class MediaSessionCompat$Callback$StubApi21
	implements MediaSessionCompatApi21.Callback
{

	public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		if(!s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER"))
			break MISSING_BLOCK_LABEL_80;
	//    4    6:aload_1         
	//    5    7:ldc1            #31  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
	//    6    9:invokevirtual   #37  <Method boolean String.equals(Object)>
	//    7   12:ifeq            80
		s = ((String) ((_cls21)MediaSessionCompat.Callback.access$100(MediaSessionCompat.Callback.this).get()));
	//    8   15:aload_0         
	//    9   16:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//   10   19:invokestatic    #41  <Method WeakReference MediaSessionCompat$Callback.access$100(MediaSessionCompat$Callback)>
	//   11   22:invokevirtual   #47  <Method Object WeakReference.get()>
	//   12   25:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
	//   13   28:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_310;
	//   14   29:aload_1         
	//   15   30:ifnull          310
		bundle = new Bundle();
	//   16   33:new             #51  <Class Bundle>
	//   17   36:dup             
	//   18   37:invokespecial   #52  <Method void Bundle()>
	//   19   40:astore_2        
		s = ((String) (((_cls21) (s)).getSessionToken().getExtraBinder()));
	//   20   41:aload_1         
	//   21   42:invokevirtual   #56  <Method MediaSessionCompat$Token MediaSessionCompat$MediaSessionImplApi21.getSessionToken()>
	//   22   45:invokevirtual   #62  <Method IMediaSession MediaSessionCompat$Token.getExtraBinder()>
	//   23   48:astore_1        
		if(s != null)
			break MISSING_BLOCK_LABEL_70;
	//   24   49:aload_1         
	//   25   50:ifnonnull       70
		s = ((String) (obj));
	//   26   53:aload           5
	//   27   55:astore_1        
_L1:
		try
		{
			BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((android.os.IBinder) (s)));
	//   28   56:aload_2         
	//   29   57:ldc1            #64  <String "android.support.v4.media.session.EXTRA_BINDER">
	//   30   59:aload_1         
	//   31   60:invokestatic    #70  <Method void BundleCompat.putBinder(Bundle, String, android.os.IBinder)>
			resultreceiver.send(0, bundle);
	//   32   63:aload_3         
	//   33   64:iconst_0        
	//   34   65:aload_2         
	//   35   66:invokevirtual   #76  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   36   69:return          
		}
	//*  37   70:aload_1         
	//*  38   71:invokeinterface #82  <Method android.os.IBinder IMediaSession.asBinder()>
	//*  39   76:astore_1        
	//*  40   77:goto            56
	//*  41   80:aload_1         
	//*  42   81:ldc1            #84  <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
	//*  43   83:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  44   86:ifeq            125
	//*  45   89:aload_2         
	//*  46   90:ldc1            #86  <Class MediaDescriptionCompat>
	//*  47   92:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
	//*  48   95:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
	//*  49   98:aload_0         
	//*  50   99:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//*  51  102:aload_2         
	//*  52  103:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
	//*  53  105:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//*  54  108:checkcast       #86  <Class MediaDescriptionCompat>
	//*  55  111:invokevirtual   #106 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
	//*  56  114:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  57  115:astore_1        
		{
			Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
	//   58  116:ldc1            #108 <String "MediaSessionCompat">
	//   59  118:ldc1            #110 <String "Could not unparcel the extra data.">
	//   60  120:invokestatic    #116 <Method int Log.e(String, String)>
	//   61  123:pop             
		}
		break MISSING_BLOCK_LABEL_124;
		s = ((String) (((IMediaSession) (s)).asBinder()));
		  goto _L1
		if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM"))
		{
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
			onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
			return;
		}
		break MISSING_BLOCK_LABEL_125;
		return;
	//   62  124:return          
		if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"))
	//*  63  125:aload_1         
	//*  64  126:ldc1            #118 <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
	//*  65  128:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  66  131:ifeq            166
		{
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
	//   67  134:aload_2         
	//   68  135:ldc1            #86  <Class MediaDescriptionCompat>
	//   69  137:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
	//   70  140:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
			onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
	//   71  143:aload_0         
	//   72  144:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//   73  147:aload_2         
	//   74  148:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
	//   75  150:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   76  153:checkcast       #86  <Class MediaDescriptionCompat>
	//   77  156:aload_2         
	//   78  157:ldc1            #120 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
	//   79  159:invokevirtual   #124 <Method int Bundle.getInt(String)>
	//   80  162:invokevirtual   #127 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
			return;
	//   81  165:return          
		}
		if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"))
	//*  82  166:aload_1         
	//*  83  167:ldc1            #129 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
	//*  84  169:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  85  172:ifeq            201
		{
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
	//   86  175:aload_2         
	//   87  176:ldc1            #86  <Class MediaDescriptionCompat>
	//   88  178:invokevirtual   #92  <Method ClassLoader Class.getClassLoader()>
	//   89  181:invokevirtual   #96  <Method void Bundle.setClassLoader(ClassLoader)>
			onRemoveQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
	//   90  184:aload_0         
	//   91  185:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//   92  188:aload_2         
	//   93  189:ldc1            #98  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
	//   94  191:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   95  194:checkcast       #86  <Class MediaDescriptionCompat>
	//   96  197:invokevirtual   #132 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			return;
	//   97  200:return          
		}
		if(!s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"))
			break MISSING_BLOCK_LABEL_300;
	//   98  201:aload_1         
	//   99  202:ldc1            #134 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT">
	//  100  204:invokevirtual   #37  <Method boolean String.equals(Object)>
	//  101  207:ifeq            300
		resultreceiver = ((ResultReceiver) ((_cls21)MediaSessionCompat.Callback.access$100(MediaSessionCompat.Callback.this).get()));
	//  102  210:aload_0         
	//  103  211:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//  104  214:invokestatic    #41  <Method WeakReference MediaSessionCompat$Callback.access$100(MediaSessionCompat$Callback)>
	//  105  217:invokevirtual   #47  <Method Object WeakReference.get()>
	//  106  220:checkcast       #49  <Class MediaSessionCompat$MediaSessionImplApi21>
	//  107  223:astore_3        
		if(resultreceiver == null)
			break MISSING_BLOCK_LABEL_310;
	//  108  224:aload_3         
	//  109  225:ifnull          310
		int i;
		if(_cls21.access._mth200(((_cls21) (resultreceiver))) == null)
			break MISSING_BLOCK_LABEL_310;
	//  110  228:aload_3         
	//  111  229:invokestatic    #138 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
	//  112  232:ifnull          310
		i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
	//  113  235:aload_2         
	//  114  236:ldc1            #120 <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
	//  115  238:iconst_m1       
	//  116  239:invokevirtual   #141 <Method int Bundle.getInt(String, int)>
	//  117  242:istore          4
		s = ((String) (obj1));
	//  118  244:aload           6
	//  119  246:astore_1        
		if(i < 0)
			break MISSING_BLOCK_LABEL_284;
	//  120  247:iload           4
	//  121  249:iflt            284
		s = ((String) (obj1));
	//  122  252:aload           6
	//  123  254:astore_1        
		if(i < _cls21.access._mth200(((_cls21) (resultreceiver))).size())
	//* 124  255:iload           4
	//* 125  257:aload_3         
	//* 126  258:invokestatic    #138 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
	//* 127  261:invokeinterface #147 <Method int List.size()>
	//* 128  266:icmpge          284
			s = ((String) ((MediaSessionCompat.QueueItem)_cls21.access._mth200(((_cls21) (resultreceiver))).get(i)));
	//  129  269:aload_3         
	//  130  270:invokestatic    #138 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
	//  131  273:iload           4
	//  132  275:invokeinterface #150 <Method Object List.get(int)>
	//  133  280:checkcast       #152 <Class MediaSessionCompat$QueueItem>
	//  134  283:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_310;
	//  135  284:aload_1         
	//  136  285:ifnull          310
		onRemoveQueueItem(((MediaSessionCompat.QueueItem) (s)).getDescription());
	//  137  288:aload_0         
	//  138  289:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//  139  292:aload_1         
	//  140  293:invokevirtual   #156 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
	//  141  296:invokevirtual   #132 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
		return;
	//  142  299:return          
		MediaSessionCompat.Callback.this.onCommand(s, bundle, resultreceiver);
	//  143  300:aload_0         
	//  144  301:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//  145  304:aload_1         
	//  146  305:aload_2         
	//  147  306:aload_3         
	//  148  307:invokevirtual   #158 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
	//  149  310:return          
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

	MediaSessionCompat$Callback$StubApi21()
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
