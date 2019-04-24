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
		s = ((String) ((_cls21)MediaSessionCompat.Callback.access$100(MediaSessionCompat.Callback.this).get()));
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
		s = ((String) (((_cls21) (s)).getSessionToken().getExtraBinder()));
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
	//   32   64:invokeinterface #68  <Method android.os.IBinder IMediaSession.asBinder()>
	//   33   69:astore_1        
		BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((android.os.IBinder) (s)));
	//   34   70:aload_2         
	//   35   71:ldc1            #70  <String "android.support.v4.media.session.EXTRA_BINDER">
	//   36   73:aload_1         
	//   37   74:invokestatic    #76  <Method void BundleCompat.putBinder(Bundle, String, android.os.IBinder)>
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
	//   55  109:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
	//   71  144:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
	//   90  185:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
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
		resultreceiver = ((ResultReceiver) ((_cls21)MediaSessionCompat.Callback.access$100(MediaSessionCompat.Callback.this).get()));
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
		if(_cls21.access._mth200(((_cls21) (resultreceiver))) == null)
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
		if(i < _cls21.access._mth200(((_cls21) (resultreceiver))).size())
	//* 120  249:iload           4
	//* 121  251:aload_3         
	//* 122  252:invokestatic    #128 <Method List MediaSessionCompat$MediaSessionImplApi21.access$200(MediaSessionCompat$MediaSessionImplApi21)>
	//* 123  255:invokeinterface #137 <Method int List.size()>
	//* 124  260:icmpge          278
			s = ((String) ((MediaSessionCompat.QueueItem)_cls21.access._mth200(((_cls21) (resultreceiver))).get(i)));
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
				onRemoveQueueItem(((MediaSessionCompat.QueueItem) (s)).getDescription());
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
		MediaSessionCompat.Callback.this.onCommand(s, bundle, resultreceiver);
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
	//  132  256:invokevirtual   #102 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  133  259:checkcast       #235 <Class RatingCompat>
	//  134  262:astore_1        
			bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
	//  135  263:aload_2         
	//  136  264:ldc1            #168 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
	//  137  266:invokevirtual   #189 <Method Bundle Bundle.getBundle(String)>
	//  138  269:astore_2        
			MediaSessionCompat.Callback.this.onSetRating(((RatingCompat) (s)), bundle);
	//  139  270:aload_0         
	//  140  271:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//  141  274:aload_1         
	//  142  275:aload_2         
	//  143  276:invokevirtual   #241 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
			return;
	//  144  279:return          
		} else
		{
			MediaSessionCompat.Callback.this.onCustomAction(s, bundle);
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
		MediaSessionCompat.Callback.this.onFastForward();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #246 <Method void MediaSessionCompat$Callback.onFastForward()>
	//    3    7:return          
	}

	public boolean onMediaButtonEvent(Intent intent)
	{
		return MediaSessionCompat.Callback.this.onMediaButtonEvent(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #250 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
	//    4    8:ireturn         
	}

	public void onPause()
	{
		MediaSessionCompat.Callback.this.onPause();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #253 <Method void MediaSessionCompat$Callback.onPause()>
	//    3    7:return          
	}

	public void onPlay()
	{
		MediaSessionCompat.Callback.this.onPlay();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #256 <Method void MediaSessionCompat$Callback.onPlay()>
	//    3    7:return          
	}

	public void onPlayFromMediaId(String s, Bundle bundle)
	{
		MediaSessionCompat.Callback.this.onPlayFromMediaId(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #259 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
	//    5    9:return          
	}

	public void onPlayFromSearch(String s, Bundle bundle)
	{
		MediaSessionCompat.Callback.this.onPlayFromSearch(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #262 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
	//    5    9:return          
	}

	public void onRewind()
	{
		MediaSessionCompat.Callback.this.onRewind();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #265 <Method void MediaSessionCompat$Callback.onRewind()>
	//    3    7:return          
	}

	public void onSeekTo(long l)
	{
		MediaSessionCompat.Callback.this.onSeekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #269 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
	//    4    8:return          
	}

	public void onSetRating(Object obj)
	{
		MediaSessionCompat.Callback.this.onSetRating(RatingCompat.fromRating(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #274 <Method RatingCompat RatingCompat.fromRating(Object)>
	//    4    8:invokevirtual   #277 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
	//    5   11:return          
	}

	public void onSetRating(Object obj, Bundle bundle)
	{
		MediaSessionCompat.Callback.this.onSetRating(RatingCompat.fromRating(obj), bundle);
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
		MediaSessionCompat.Callback.this.onSkipToNext();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #281 <Method void MediaSessionCompat$Callback.onSkipToNext()>
	//    3    7:return          
	}

	public void onSkipToPrevious()
	{
		MediaSessionCompat.Callback.this.onSkipToPrevious();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #284 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
	//    3    7:return          
	}

	public void onSkipToQueueItem(long l)
	{
		MediaSessionCompat.Callback.this.onSkipToQueueItem(l);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #287 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
	//    4    8:return          
	}

	public void onStop()
	{
		MediaSessionCompat.Callback.this.onStop();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field MediaSessionCompat$Callback this$0>
	//    2    4:invokevirtual   #290 <Method void MediaSessionCompat$Callback.onStop()>
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
