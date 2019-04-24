// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, MediaSessionCompatApi26, MediaSessionCompatApi24, MediaSessionCompatApi23, 
//			MediaSessionCompatApi21

public static abstract class MediaSessionCompat$Callback
{
	class StubApi21
		implements MediaSessionCompatApi21.Callback
	{

		public void onCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
			if(s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #26  <String "android.support.v4.media.session.command.GET_EXTRA_BINDER">
		//*   2    3:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*   3    6:ifeq            52
			{
				s = ((String) ((MediaSessionCompat.MediaSessionImplApi21)mSessionImpl.get()));
		//    4    9:aload_0         
		//    5   10:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    6   13:getfield        #36  <Field WeakReference MediaSessionCompat$Callback.mSessionImpl>
		//    7   16:invokevirtual   #42  <Method Object WeakReference.get()>
		//    8   19:checkcast       #44  <Class MediaSessionCompat$MediaSessionImplApi21>
		//    9   22:astore_1        
				if(s != null)
		//*  10   23:aload_1         
		//*  11   24:ifnull          51
				{
					bundle = new Bundle();
		//   12   27:new             #46  <Class Bundle>
		//   13   30:dup             
		//   14   31:invokespecial   #47  <Method void Bundle()>
		//   15   34:astore_2        
					BundleCompat.putBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((android.os.IBinder) (((MediaSessionCompat.MediaSessionImplApi21) (s)).getExtraSessionBinder())));
		//   16   35:aload_2         
		//   17   36:ldc1            #49  <String "android.support.v4.media.session.EXTRA_BINDER">
		//   18   38:aload_1         
		//   19   39:invokevirtual   #53  <Method MediaSessionCompat$MediaSessionImplApi21$ExtraSession MediaSessionCompat$MediaSessionImplApi21.getExtraSessionBinder()>
		//   20   42:invokestatic    #59  <Method void BundleCompat.putBinder(Bundle, String, android.os.IBinder)>
					resultreceiver.send(0, bundle);
		//   21   45:aload_3         
		//   22   46:iconst_0        
		//   23   47:aload_2         
		//   24   48:invokevirtual   #65  <Method void ResultReceiver.send(int, Bundle)>
				}
				return;
		//   25   51:return          
			}
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM"))
		//*  26   52:aload_1         
		//*  27   53:ldc1            #67  <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM">
		//*  28   55:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  29   58:ifeq            87
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   30   61:aload_2         
		//   31   62:ldc1            #69  <Class MediaDescriptionCompat>
		//   32   64:invokevirtual   #75  <Method ClassLoader Class.getClassLoader()>
		//   33   67:invokevirtual   #79  <Method void Bundle.setClassLoader(ClassLoader)>
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   34   70:aload_0         
		//   35   71:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   36   74:aload_2         
		//   37   75:ldc1            #81  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   38   77:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   39   80:checkcast       #69  <Class MediaDescriptionCompat>
		//   40   83:invokevirtual   #89  <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//   41   86:return          
			}
			if(s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"))
		//*  42   87:aload_1         
		//*  43   88:ldc1            #91  <String "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT">
		//*  44   90:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  45   93:ifeq            128
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   46   96:aload_2         
		//   47   97:ldc1            #69  <Class MediaDescriptionCompat>
		//   48   99:invokevirtual   #75  <Method ClassLoader Class.getClassLoader()>
		//   49  102:invokevirtual   #79  <Method void Bundle.setClassLoader(ClassLoader)>
				onAddQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
		//   50  105:aload_0         
		//   51  106:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   52  109:aload_2         
		//   53  110:ldc1            #81  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   54  112:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   55  115:checkcast       #69  <Class MediaDescriptionCompat>
		//   56  118:aload_2         
		//   57  119:ldc1            #93  <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   58  121:invokevirtual   #97  <Method int Bundle.getInt(String)>
		//   59  124:invokevirtual   #100 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//   60  127:return          
			}
			if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"))
		//*  61  128:aload_1         
		//*  62  129:ldc1            #102 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM">
		//*  63  131:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  64  134:ifeq            163
			{
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaDescriptionCompat)).getClassLoader());
		//   65  137:aload_2         
		//   66  138:ldc1            #69  <Class MediaDescriptionCompat>
		//   67  140:invokevirtual   #75  <Method ClassLoader Class.getClassLoader()>
		//   68  143:invokevirtual   #79  <Method void Bundle.setClassLoader(ClassLoader)>
				onRemoveQueueItem((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
		//   69  146:aload_0         
		//   70  147:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   71  150:aload_2         
		//   72  151:ldc1            #81  <String "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION">
		//   73  153:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   74  156:checkcast       #69  <Class MediaDescriptionCompat>
		//   75  159:invokevirtual   #105 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//   76  162:return          
			}
			if(s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"))
		//*  77  163:aload_1         
		//*  78  164:ldc1            #107 <String "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT">
		//*  79  166:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  80  169:ifeq            186
			{
				onRemoveQueueItemAt(bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
		//   81  172:aload_0         
		//   82  173:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   83  176:aload_2         
		//   84  177:ldc1            #93  <String "android.support.v4.media.session.command.ARGUMENT_INDEX">
		//   85  179:invokevirtual   #97  <Method int Bundle.getInt(String)>
		//   86  182:invokevirtual   #111 <Method void MediaSessionCompat$Callback.onRemoveQueueItemAt(int)>
				return;
		//   87  185:return          
			} else
			{
				MediaSessionCompat.Callback.this.onCommand(s, bundle, resultreceiver);
		//   88  186:aload_0         
		//   89  187:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   90  190:aload_1         
		//   91  191:aload_2         
		//   92  192:aload_3         
		//   93  193:invokevirtual   #113 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
				return;
		//   94  196:return          
			}
		}

		public void onCustomAction(String s, Bundle bundle)
		{
			if(s.equals("android.support.v4.media.session.action.PLAY_FROM_URI"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #117 <String "android.support.v4.media.session.action.PLAY_FROM_URI">
		//*   2    3:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*   3    6:ifeq            39
			{
				s = ((String) ((Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI")));
		//    4    9:aload_2         
		//    5   10:ldc1            #119 <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//    6   12:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//    7   15:checkcast       #121 <Class Uri>
		//    8   18:astore_1        
				bundle = (Bundle)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//    9   19:aload_2         
		//   10   20:ldc1            #123 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   11   22:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   12   25:checkcast       #46  <Class Bundle>
		//   13   28:astore_2        
				onPlayFromUri(((Uri) (s)), bundle);
		//   14   29:aload_0         
		//   15   30:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   16   33:aload_1         
		//   17   34:aload_2         
		//   18   35:invokevirtual   #127 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//   19   38:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE"))
		//*  20   39:aload_1         
		//*  21   40:ldc1            #129 <String "android.support.v4.media.session.action.PREPARE">
		//*  22   42:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  23   45:ifeq            56
			{
				onPrepare();
		//   24   48:aload_0         
		//   25   49:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   26   52:invokevirtual   #132 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//   27   55:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
		//*  28   56:aload_1         
		//*  29   57:ldc1            #134 <String "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID">
		//*  30   59:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  31   62:ifeq            89
			{
				s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
		//   32   65:aload_2         
		//   33   66:ldc1            #136 <String "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID">
		//   34   68:invokevirtual   #140 <Method String Bundle.getString(String)>
		//   35   71:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//   36   72:aload_2         
		//   37   73:ldc1            #123 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   38   75:invokevirtual   #144 <Method Bundle Bundle.getBundle(String)>
		//   39   78:astore_2        
				onPrepareFromMediaId(s, bundle);
		//   40   79:aload_0         
		//   41   80:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   42   83:aload_1         
		//   43   84:aload_2         
		//   44   85:invokevirtual   #147 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//   45   88:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
		//*  46   89:aload_1         
		//*  47   90:ldc1            #149 <String "android.support.v4.media.session.action.PREPARE_FROM_SEARCH">
		//*  48   92:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  49   95:ifeq            122
			{
				s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
		//   50   98:aload_2         
		//   51   99:ldc1            #151 <String "android.support.v4.media.session.action.ARGUMENT_QUERY">
		//   52  101:invokevirtual   #140 <Method String Bundle.getString(String)>
		//   53  104:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//   54  105:aload_2         
		//   55  106:ldc1            #123 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   56  108:invokevirtual   #144 <Method Bundle Bundle.getBundle(String)>
		//   57  111:astore_2        
				onPrepareFromSearch(s, bundle);
		//   58  112:aload_0         
		//   59  113:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   60  116:aload_1         
		//   61  117:aload_2         
		//   62  118:invokevirtual   #154 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//   63  121:return          
			}
			if(s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
		//*  64  122:aload_1         
		//*  65  123:ldc1            #156 <String "android.support.v4.media.session.action.PREPARE_FROM_URI">
		//*  66  125:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  67  128:ifeq            158
			{
				s = ((String) ((Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI")));
		//   68  131:aload_2         
		//   69  132:ldc1            #119 <String "android.support.v4.media.session.action.ARGUMENT_URI">
		//   70  134:invokevirtual   #85  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   71  137:checkcast       #121 <Class Uri>
		//   72  140:astore_1        
				bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
		//   73  141:aload_2         
		//   74  142:ldc1            #123 <String "android.support.v4.media.session.action.ARGUMENT_EXTRAS">
		//   75  144:invokevirtual   #144 <Method Bundle Bundle.getBundle(String)>
		//   76  147:astore_2        
				onPrepareFromUri(((Uri) (s)), bundle);
		//   77  148:aload_0         
		//   78  149:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   79  152:aload_1         
		//   80  153:aload_2         
		//   81  154:invokevirtual   #159 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//   82  157:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
		//*  83  158:aload_1         
		//*  84  159:ldc1            #161 <String "android.support.v4.media.session.action.SET_REPEAT_MODE">
		//*  85  161:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  86  164:ifeq            183
			{
				int i = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
		//   87  167:aload_2         
		//   88  168:ldc1            #163 <String "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE">
		//   89  170:invokevirtual   #97  <Method int Bundle.getInt(String)>
		//   90  173:istore_3        
				onSetRepeatMode(i);
		//   91  174:aload_0         
		//   92  175:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//   93  178:iload_3         
		//   94  179:invokevirtual   #166 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
				return;
		//   95  182:return          
			}
			if(s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED"))
		//*  96  183:aload_1         
		//*  97  184:ldc1            #168 <String "android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED">
		//*  98  186:invokevirtual   #32  <Method boolean String.equals(Object)>
		//*  99  189:ifeq            210
			{
				boolean flag = bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED");
		//  100  192:aload_2         
		//  101  193:ldc1            #170 <String "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED">
		//  102  195:invokevirtual   #174 <Method boolean Bundle.getBoolean(String)>
		//  103  198:istore          4
				onSetShuffleModeEnabled(flag);
		//  104  200:aload_0         
		//  105  201:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//  106  204:iload           4
		//  107  206:invokevirtual   #178 <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
				return;
		//  108  209:return          
			} else
			{
				MediaSessionCompat.Callback.this.onCustomAction(s, bundle);
		//  109  210:aload_0         
		//  110  211:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//  111  214:aload_1         
		//  112  215:aload_2         
		//  113  216:invokevirtual   #180 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  114  219:return          
			}
		}

		public void onFastForward()
		{
			MediaSessionCompat.Callback.this.onFastForward();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #183 <Method void MediaSessionCompat$Callback.onFastForward()>
		//    3    7:return          
		}

		public boolean onMediaButtonEvent(Intent intent)
		{
			return MediaSessionCompat.Callback.this.onMediaButtonEvent(intent);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #187 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//    4    8:ireturn         
		}

		public void onPause()
		{
			MediaSessionCompat.Callback.this.onPause();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #190 <Method void MediaSessionCompat$Callback.onPause()>
		//    3    7:return          
		}

		public void onPlay()
		{
			MediaSessionCompat.Callback.this.onPlay();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #193 <Method void MediaSessionCompat$Callback.onPlay()>
		//    3    7:return          
		}

		public void onPlayFromMediaId(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #196 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPlayFromSearch(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #199 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onRewind()
		{
			MediaSessionCompat.Callback.this.onRewind();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #202 <Method void MediaSessionCompat$Callback.onRewind()>
		//    3    7:return          
		}

		public void onSeekTo(long l)
		{
			MediaSessionCompat.Callback.this.onSeekTo(l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #206 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
		//    4    8:return          
		}

		public void onSetRating(Object obj)
		{
			MediaSessionCompat.Callback.this.onSetRating(RatingCompat.fromRating(obj));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #214 <Method RatingCompat RatingCompat.fromRating(Object)>
		//    4    8:invokevirtual   #217 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
		//    5   11:return          
		}

		public void onSkipToNext()
		{
			MediaSessionCompat.Callback.this.onSkipToNext();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #220 <Method void MediaSessionCompat$Callback.onSkipToNext()>
		//    3    7:return          
		}

		public void onSkipToPrevious()
		{
			MediaSessionCompat.Callback.this.onSkipToPrevious();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #223 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
		//    3    7:return          
		}

		public void onSkipToQueueItem(long l)
		{
			MediaSessionCompat.Callback.this.onSkipToQueueItem(l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #226 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
		//    4    8:return          
		}

		public void onStop()
		{
			MediaSessionCompat.Callback.this.onStop();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #229 <Method void MediaSessionCompat$Callback.onStop()>
		//    3    7:return          
		}

		final MediaSessionCompat.Callback this$0;

		StubApi21()
		{
			this$0 = MediaSessionCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	class StubApi23 extends StubApi21
		implements MediaSessionCompatApi23.Callback
	{

		public void onPlayFromUri(Uri uri, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPlayFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #25  <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		final MediaSessionCompat.Callback this$0;

		StubApi23()
		{
			this$0 = MediaSessionCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #20  <Method void MediaSessionCompat$Callback$StubApi21(MediaSessionCompat$Callback)>
		//    6   10:return          
		}
	}

	class StubApi24 extends StubApi23
		implements MediaSessionCompatApi24.Callback
	{

		public void onPrepare()
		{
			MediaSessionCompat.Callback.this.onPrepare();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:invokevirtual   #25  <Method void MediaSessionCompat$Callback.onPrepare()>
		//    3    7:return          
		}

		public void onPrepareFromMediaId(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPrepareFromMediaId(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #29  <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
		//    5    9:return          
		}

		public void onPrepareFromSearch(String s, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPrepareFromSearch(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
		//    5    9:return          
		}

		public void onPrepareFromUri(Uri uri, Bundle bundle)
		{
			MediaSessionCompat.Callback.this.onPrepareFromUri(uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #36  <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
		//    5    9:return          
		}

		final MediaSessionCompat.Callback this$0;

		StubApi24()
		{
			this$0 = MediaSessionCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #20  <Method void MediaSessionCompat$Callback$StubApi23(MediaSessionCompat$Callback)>
		//    6   10:return          
		}
	}

	class StubApi26 extends StubApi24
		implements MediaSessionCompatApi26.Callback
	{

		public void onSetRepeatMode(int i)
		{
			MediaSessionCompat.Callback.this.onSetRepeatMode(i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #27  <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
		//    4    8:return          
		}

		public void onSetShuffleModeEnabled(boolean flag)
		{
			MediaSessionCompat.Callback.this.onSetShuffleModeEnabled(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaSessionCompat$Callback this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #31  <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
		//    4    8:return          
		}

		final MediaSessionCompat.Callback this$0;

		private StubApi26()
		{
			this$0 = MediaSessionCompat.Callback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaSessionCompat$Callback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #20  <Method void MediaSessionCompat$Callback$StubApi24(MediaSessionCompat$Callback)>
		//    6   10:return          
		}

		StubApi26(MediaSessionCompat._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void MediaSessionCompat$Callback$StubApi26(MediaSessionCompat$Callback)>
		//    3    5:return          
		}
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
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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

	public void onSetRating(RatingCompat ratingcompat)
	{
	//    0    0:return          
	}

	public void onSetRepeatMode(int i)
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

	final Object mCallbackObj;
	WeakReference mSessionImpl;

	public MediaSessionCompat$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          29
		{
			mCallbackObj = MediaSessionCompatApi26.createCallback(((back) (new StubApi26(((MediaSessionCompat._cls1) (null))))));
	//    5   12:aload_0         
	//    6   13:new             #18  <Class MediaSessionCompat$Callback$StubApi26>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:invokespecial   #37  <Method void MediaSessionCompat$Callback$StubApi26(MediaSessionCompat$Callback, MediaSessionCompat$1)>
	//   11   22:invokestatic    #43  <Method Object MediaSessionCompatApi26.createCallback(MediaSessionCompatApi26$Callback)>
	//   12   25:putfield        #45  <Field Object mCallbackObj>
			return;
	//   13   28:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  14   29:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   32:bipush          24
	//*  16   34:icmplt          53
		{
			mCallbackObj = MediaSessionCompatApi24.createCallback(((back) (new StubApi24())));
	//   17   37:aload_0         
	//   18   38:new             #15  <Class MediaSessionCompat$Callback$StubApi24>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:invokespecial   #48  <Method void MediaSessionCompat$Callback$StubApi24(MediaSessionCompat$Callback)>
	//   22   46:invokestatic    #53  <Method Object MediaSessionCompatApi24.createCallback(MediaSessionCompatApi24$Callback)>
	//   23   49:putfield        #45  <Field Object mCallbackObj>
			return;
	//   24   52:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  25   53:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   56:bipush          23
	//*  27   58:icmplt          77
		{
			mCallbackObj = MediaSessionCompatApi23.createCallback(((back) (new StubApi23())));
	//   28   61:aload_0         
	//   29   62:new             #12  <Class MediaSessionCompat$Callback$StubApi23>
	//   30   65:dup             
	//   31   66:aload_0         
	//   32   67:invokespecial   #54  <Method void MediaSessionCompat$Callback$StubApi23(MediaSessionCompat$Callback)>
	//   33   70:invokestatic    #59  <Method Object MediaSessionCompatApi23.createCallback(MediaSessionCompatApi23$Callback)>
	//   34   73:putfield        #45  <Field Object mCallbackObj>
			return;
	//   35   76:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  36   77:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*  37   80:bipush          21
	//*  38   82:icmplt          101
		{
			mCallbackObj = MediaSessionCompatApi21.createCallback(((back) (new StubApi21())));
	//   39   85:aload_0         
	//   40   86:new             #9   <Class MediaSessionCompat$Callback$StubApi21>
	//   41   89:dup             
	//   42   90:aload_0         
	//   43   91:invokespecial   #60  <Method void MediaSessionCompat$Callback$StubApi21(MediaSessionCompat$Callback)>
	//   44   94:invokestatic    #65  <Method Object MediaSessionCompatApi21.createCallback(MediaSessionCompatApi21$Callback)>
	//   45   97:putfield        #45  <Field Object mCallbackObj>
			return;
	//   46  100:return          
		} else
		{
			mCallbackObj = null;
	//   47  101:aload_0         
	//   48  102:aconst_null     
	//   49  103:putfield        #45  <Field Object mCallbackObj>
			return;
	//   50  106:return          
		}
	}
}
