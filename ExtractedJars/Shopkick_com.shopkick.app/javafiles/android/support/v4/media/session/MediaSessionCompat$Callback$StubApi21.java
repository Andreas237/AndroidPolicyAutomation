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
		s = ((String) ((_cls21)mSessionImpl.get()));
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
		token = ((_cls21) (s)).getSessionToken();
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
		resultreceiver = ((ResultReceiver) ((_cls21)mSessionImpl.get()));
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
		if(((_cls21) (resultreceiver)).mQueue == null)
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
		if(i < ((_cls21) (resultreceiver)).mQueue.size())
	//* 115  237:iload           4
	//* 116  239:aload_3         
	//* 117  240:getfield        #128 <Field List MediaSessionCompat$MediaSessionImplApi21.mQueue>
	//* 118  243:invokeinterface #137 <Method int List.size()>
	//* 119  248:icmpge          266
			s = ((String) ((MediaSessionCompat.QueueItem)((_cls21) (resultreceiver)).mQueue.get(i)));
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
