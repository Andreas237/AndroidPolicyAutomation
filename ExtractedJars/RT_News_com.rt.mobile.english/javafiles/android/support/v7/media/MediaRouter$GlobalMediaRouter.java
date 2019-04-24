// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.app.ActivityManager;
import android.content.*;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.hardware.display.DisplayManagerCompat;
import android.support.v4.media.VolumeProviderCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.util.Pair;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouter, SystemMediaRouteProvider, MediaRouteProvider, MediaRouteProviderDescriptor, 
//			MediaRouteDescriptor, MediaRouteSelector, RegisteredMediaRouteProviderWatcher, MediaRouteDiscoveryRequest, 
//			RemoteControlClientCompat

private static final class MediaRouter$GlobalMediaRouter
	implements allback, tcher.Callback
{
	private final class CallbackHandler extends Handler
	{

		private void invokeCallback(MediaRouter.CallbackRecord callbackrecord, int i, Object obj, int j)
		{
			MediaRouter mediarouter = callbackrecord.mRouter;
		//    0    0:aload_1         
		//    1    1:getfield        #63  <Field MediaRouter MediaRouter$CallbackRecord.mRouter>
		//    2    4:astore          6
			MediaRouter.Callback callback = callbackrecord.mCallback;
		//    3    6:aload_1         
		//    4    7:getfield        #67  <Field MediaRouter$Callback MediaRouter$CallbackRecord.mCallback>
		//    5   10:astore          7
			int k = 0xff00 & i;
		//    6   12:ldc1            #33  <Int 65280>
		//    7   14:iload_2         
		//    8   15:iand            
		//    9   16:istore          5
			if(k != 256)
		//*  10   18:iload           5
		//*  11   20:sipush          256
		//*  12   23:icmpeq          96
			{
				if(k != 512)
		//*  13   26:iload           5
		//*  14   28:sipush          512
		//*  15   31:icmpeq          35
					return;
		//   16   34:return          
				callbackrecord = ((MediaRouter.CallbackRecord) ((MediaRouter.ProviderInfo)obj));
		//   17   35:aload_3         
		//   18   36:checkcast       #69  <Class MediaRouter$ProviderInfo>
		//   19   39:astore_1        
				switch(i)
		//*  20   40:iload_2         
				{
		//*  21   41:tableswitch     513 515: default 68
		//		               513 87
		//		               514 78
		//		               515 69
				default:
					return;
		//   22   68:return          

				case 515: 
					callback.onProviderChanged(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
		//   23   69:aload           7
		//   24   71:aload           6
		//   25   73:aload_1         
		//   26   74:invokevirtual   #75  <Method void MediaRouter$Callback.onProviderChanged(MediaRouter, MediaRouter$ProviderInfo)>
					return;
		//   27   77:return          

				case 514: 
					callback.onProviderRemoved(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
		//   28   78:aload           7
		//   29   80:aload           6
		//   30   82:aload_1         
		//   31   83:invokevirtual   #78  <Method void MediaRouter$Callback.onProviderRemoved(MediaRouter, MediaRouter$ProviderInfo)>
					return;
		//   32   86:return          

				case 513: 
					callback.onProviderAdded(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
		//   33   87:aload           7
		//   34   89:aload           6
		//   35   91:aload_1         
		//   36   92:invokevirtual   #81  <Method void MediaRouter$Callback.onProviderAdded(MediaRouter, MediaRouter$ProviderInfo)>
					return;
		//   37   95:return          
				}
			}
			obj = ((Object) ((MediaRouter.RouteInfo)obj));
		//   38   96:aload_3         
		//   39   97:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   40  100:astore_3        
			if(!callbackrecord.filterRouteEvent(((MediaRouter.RouteInfo) (obj))))
		//*  41  101:aload_1         
		//*  42  102:aload_3         
		//*  43  103:invokevirtual   #87  <Method boolean MediaRouter$CallbackRecord.filterRouteEvent(MediaRouter$RouteInfo)>
		//*  44  106:ifne            110
				return;
		//   45  109:return          
			switch(i)
		//*  46  110:iload_2         
			{
		//*  47  111:tableswitch     257 263: default 152
		//		               257 209
		//		               258 200
		//		               259 191
		//		               260 182
		//		               261 173
		//		               262 164
		//		               263 153
			default:
				return;
		//   48  152:return          

			case 263: 
				callback.onRouteUnselected(mediarouter, ((MediaRouter.RouteInfo) (obj)), j);
		//   49  153:aload           7
		//   50  155:aload           6
		//   51  157:aload_3         
		//   52  158:iload           4
		//   53  160:invokevirtual   #91  <Method void MediaRouter$Callback.onRouteUnselected(MediaRouter, MediaRouter$RouteInfo, int)>
				return;
		//   54  163:return          

			case 262: 
				callback.onRouteSelected(mediarouter, ((MediaRouter.RouteInfo) (obj)));
		//   55  164:aload           7
		//   56  166:aload           6
		//   57  168:aload_3         
		//   58  169:invokevirtual   #95  <Method void MediaRouter$Callback.onRouteSelected(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   59  172:return          

			case 261: 
				callback.onRoutePresentationDisplayChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
		//   60  173:aload           7
		//   61  175:aload           6
		//   62  177:aload_3         
		//   63  178:invokevirtual   #98  <Method void MediaRouter$Callback.onRoutePresentationDisplayChanged(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   64  181:return          

			case 260: 
				callback.onRouteVolumeChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
		//   65  182:aload           7
		//   66  184:aload           6
		//   67  186:aload_3         
		//   68  187:invokevirtual   #101 <Method void MediaRouter$Callback.onRouteVolumeChanged(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   69  190:return          

			case 259: 
				callback.onRouteChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
		//   70  191:aload           7
		//   71  193:aload           6
		//   72  195:aload_3         
		//   73  196:invokevirtual   #104 <Method void MediaRouter$Callback.onRouteChanged(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   74  199:return          

			case 258: 
				callback.onRouteRemoved(mediarouter, ((MediaRouter.RouteInfo) (obj)));
		//   75  200:aload           7
		//   76  202:aload           6
		//   77  204:aload_3         
		//   78  205:invokevirtual   #107 <Method void MediaRouter$Callback.onRouteRemoved(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   79  208:return          

			case 257: 
				callback.onRouteAdded(mediarouter, ((MediaRouter.RouteInfo) (obj)));
		//   80  209:aload           7
		//   81  211:aload           6
		//   82  213:aload_3         
		//   83  214:invokevirtual   #110 <Method void MediaRouter$Callback.onRouteAdded(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   84  217:return          
			}
		}

		private void syncWithSystemProvider(int i, Object obj)
		{
			if(i != 262)
		//*   0    0:iload_1         
		//*   1    1:sipush          262
		//*   2    4:icmpeq          82
			{
				switch(i)
		//*   3    7:iload_1         
				{
		//*   4    8:tableswitch     257 259: default 36
		//		               257 67
		//		               258 52
		//		               259 37
				default:
					return;
		//    5   36:return          

				case 259: 
					mSystemProvider.onSyncRouteChanged((MediaRouter.RouteInfo)obj);
		//    6   37:aload_0         
		//    7   38:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//    8   41:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
		//    9   44:aload_2         
		//   10   45:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   11   48:invokevirtual   #122 <Method void SystemMediaRouteProvider.onSyncRouteChanged(MediaRouter$RouteInfo)>
					return;
		//   12   51:return          

				case 258: 
					mSystemProvider.onSyncRouteRemoved((MediaRouter.RouteInfo)obj);
		//   13   52:aload_0         
		//   14   53:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   15   56:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
		//   16   59:aload_2         
		//   17   60:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   18   63:invokevirtual   #125 <Method void SystemMediaRouteProvider.onSyncRouteRemoved(MediaRouter$RouteInfo)>
					return;
		//   19   66:return          

				case 257: 
					mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)obj);
		//   20   67:aload_0         
		//   21   68:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   22   71:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
		//   23   74:aload_2         
		//   24   75:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   25   78:invokevirtual   #128 <Method void SystemMediaRouteProvider.onSyncRouteAdded(MediaRouter$RouteInfo)>
					return;
		//   26   81:return          
				}
			} else
			{
				mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)obj);
		//   27   82:aload_0         
		//   28   83:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   29   86:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
		//   30   89:aload_2         
		//   31   90:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   32   93:invokevirtual   #131 <Method void SystemMediaRouteProvider.onSyncRouteSelected(MediaRouter$RouteInfo)>
				return;
		//   33   96:return          
			}
		}

		public void handleMessage(Message message)
		{
			int j;
			int k;
			Object obj;
			j = message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #138 <Field int Message.what>
		//    2    4:istore_3        
			obj = message.obj;
		//    3    5:aload_1         
		//    4    6:getfield        #142 <Field Object Message.obj>
		//    5    9:astore          6
			k = message.arg1;
		//    6   11:aload_1         
		//    7   12:getfield        #145 <Field int Message.arg1>
		//    8   15:istore          4
			if(j == 259 && getSelectedRoute().getId().equals(((Object) (((MediaRouter.RouteInfo)obj).getId()))))
		//*   9   17:iload_3         
		//*  10   18:sipush          259
		//*  11   21:icmpne          56
		//*  12   24:aload_0         
		//*  13   25:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//*  14   28:invokevirtual   #149 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
		//*  15   31:invokevirtual   #153 <Method String MediaRouter$RouteInfo.getId()>
		//*  16   34:aload           6
		//*  17   36:checkcast       #83  <Class MediaRouter$RouteInfo>
		//*  18   39:invokevirtual   #153 <Method String MediaRouter$RouteInfo.getId()>
		//*  19   42:invokevirtual   #159 <Method boolean String.equals(Object)>
		//*  20   45:ifeq            56
				updateSelectedRouteIfNeeded(true);
		//   21   48:aload_0         
		//   22   49:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   23   52:iconst_1        
		//   24   53:invokestatic    #163 <Method void MediaRouter$GlobalMediaRouter.access$700(MediaRouter$GlobalMediaRouter, boolean)>
			syncWithSystemProvider(j, obj);
		//   25   56:aload_0         
		//   26   57:iload_3         
		//   27   58:aload           6
		//   28   60:invokespecial   #165 <Method void syncWithSystemProvider(int, Object)>
			int i = mRouters.size();
		//   29   63:aload_0         
		//   30   64:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   31   67:getfield        #168 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
		//   32   70:invokevirtual   #172 <Method int ArrayList.size()>
		//   33   73:istore_2        
_L1:
			i--;
		//   34   74:iload_2         
		//   35   75:iconst_1        
		//   36   76:isub            
		//   37   77:istore_2        
			if(i < 0)
				break MISSING_BLOCK_LABEL_137;
		//   38   78:iload_2         
		//   39   79:iflt            137
			message = ((Message) ((MediaRouter)((WeakReference)mRouters.get(i)).get()));
		//   40   82:aload_0         
		//   41   83:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   42   86:getfield        #168 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
		//   43   89:iload_2         
		//   44   90:invokevirtual   #176 <Method Object ArrayList.get(int)>
		//   45   93:checkcast       #178 <Class WeakReference>
		//   46   96:invokevirtual   #181 <Method Object WeakReference.get()>
		//   47   99:checkcast       #8   <Class MediaRouter>
		//   48  102:astore_1        
			if(message != null)
				break MISSING_BLOCK_LABEL_122;
		//   49  103:aload_1         
		//   50  104:ifnonnull       122
			mRouters.remove(i);
		//   51  107:aload_0         
		//   52  108:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   53  111:getfield        #168 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
		//   54  114:iload_2         
		//   55  115:invokevirtual   #184 <Method Object ArrayList.remove(int)>
		//   56  118:pop             
			  goto _L1
		//*  57  119:goto            74
			mTempCallbackRecords.addAll(((Collection) (((MediaRouter) (message)).mCallbackRecords)));
		//   58  122:aload_0         
		//   59  123:getfield        #54  <Field ArrayList mTempCallbackRecords>
		//   60  126:aload_1         
		//   61  127:getfield        #187 <Field ArrayList MediaRouter.mCallbackRecords>
		//   62  130:invokevirtual   #191 <Method boolean ArrayList.addAll(Collection)>
		//   63  133:pop             
			  goto _L1
		//*  64  134:goto            74
			int l = mTempCallbackRecords.size();
		//   65  137:aload_0         
		//   66  138:getfield        #54  <Field ArrayList mTempCallbackRecords>
		//   67  141:invokevirtual   #172 <Method int ArrayList.size()>
		//   68  144:istore          5
			i = 0;
		//   69  146:iconst_0        
		//   70  147:istore_2        
_L3:
			if(i >= l)
				break; /* Loop/switch isn't completed */
		//   71  148:iload_2         
		//   72  149:iload           5
		//   73  151:icmpge          181
			invokeCallback((MediaRouter.CallbackRecord)mTempCallbackRecords.get(i), j, obj, k);
		//   74  154:aload_0         
		//   75  155:aload_0         
		//   76  156:getfield        #54  <Field ArrayList mTempCallbackRecords>
		//   77  159:iload_2         
		//   78  160:invokevirtual   #176 <Method Object ArrayList.get(int)>
		//   79  163:checkcast       #59  <Class MediaRouter$CallbackRecord>
		//   80  166:iload_3         
		//   81  167:aload           6
		//   82  169:iload           4
		//   83  171:invokespecial   #193 <Method void invokeCallback(MediaRouter$CallbackRecord, int, Object, int)>
			i++;
		//   84  174:iload_2         
		//   85  175:iconst_1        
		//   86  176:iadd            
		//   87  177:istore_2        
			if(true) goto _L3; else goto _L2
		//   88  178:goto            148
_L2:
			mTempCallbackRecords.clear();
		//   89  181:aload_0         
		//   90  182:getfield        #54  <Field ArrayList mTempCallbackRecords>
		//   91  185:invokevirtual   #196 <Method void ArrayList.clear()>
			return;
		//   92  188:return          
			message;
		//   93  189:astore_1        
			mTempCallbackRecords.clear();
		//   94  190:aload_0         
		//   95  191:getfield        #54  <Field ArrayList mTempCallbackRecords>
		//   96  194:invokevirtual   #196 <Method void ArrayList.clear()>
			throw message;
		//   97  197:aload_1         
		//   98  198:athrow          
		}

		public void post(int i, Object obj)
		{
			obtainMessage(i, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #201 <Method Message obtainMessage(int, Object)>
		//    4    6:invokevirtual   #204 <Method void Message.sendToTarget()>
		//    5    9:return          
		}

		public void post(int i, Object obj, int j)
		{
			obj = ((Object) (obtainMessage(i, obj)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #201 <Method Message obtainMessage(int, Object)>
		//    4    6:astore_2        
			obj.arg1 = j;
		//    5    7:aload_2         
		//    6    8:iload_3         
		//    7    9:putfield        #145 <Field int Message.arg1>
			((Message) (obj)).sendToTarget();
		//    8   12:aload_2         
		//    9   13:invokevirtual   #204 <Method void Message.sendToTarget()>
		//   10   16:return          
		}

		public static final int MSG_PROVIDER_ADDED = 513;
		public static final int MSG_PROVIDER_CHANGED = 515;
		public static final int MSG_PROVIDER_REMOVED = 514;
		public static final int MSG_ROUTE_ADDED = 257;
		public static final int MSG_ROUTE_CHANGED = 259;
		public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
		public static final int MSG_ROUTE_REMOVED = 258;
		public static final int MSG_ROUTE_SELECTED = 262;
		public static final int MSG_ROUTE_UNSELECTED = 263;
		public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
		private static final int MSG_TYPE_MASK = 65280;
		private static final int MSG_TYPE_PROVIDER = 512;
		private static final int MSG_TYPE_ROUTE = 256;
		private final ArrayList mTempCallbackRecords = new ArrayList();
		final MediaRouter.GlobalMediaRouter this$0;

		CallbackHandler()
		{
			this$0 = MediaRouter.GlobalMediaRouter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #49  <Method void Handler()>
		//    5    9:aload_0         
		//    6   10:new             #51  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #52  <Method void ArrayList()>
		//    9   17:putfield        #54  <Field ArrayList mTempCallbackRecords>
		//   10   20:return          
		}
	}

	private final class MediaSessionRecord
	{

		public void clearVolumeHandling()
		{
			mMsCompat.setPlaybackToLocal(mPlaybackInfo.playbackStream);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field MediaSessionCompat mMsCompat>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field MediaRouter$GlobalMediaRouter this$0>
		//    4    8:getfield        #51  <Field RemoteControlClientCompat$PlaybackInfo MediaRouter$GlobalMediaRouter.mPlaybackInfo>
		//    5   11:getfield        #56  <Field int RemoteControlClientCompat$PlaybackInfo.playbackStream>
		//    6   14:invokevirtual   #60  <Method void MediaSessionCompat.setPlaybackToLocal(int)>
			mVpCompat = null;
		//    7   17:aload_0         
		//    8   18:aconst_null     
		//    9   19:putfield        #62  <Field VolumeProviderCompat mVpCompat>
		//   10   22:return          
		}

		public void configureVolume(int i, int j, int k)
		{
			if(mVpCompat != null && i == mControlType && j == mMaxVolume)
		//*   0    0:aload_0         
		//*   1    1:getfield        #62  <Field VolumeProviderCompat mVpCompat>
		//*   2    4:ifnull          32
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #66  <Field int mControlType>
		//*   6   12:icmpne          32
		//*   7   15:iload_2         
		//*   8   16:aload_0         
		//*   9   17:getfield        #68  <Field int mMaxVolume>
		//*  10   20:icmpne          32
			{
				mVpCompat.setCurrentVolume(k);
		//   11   23:aload_0         
		//   12   24:getfield        #62  <Field VolumeProviderCompat mVpCompat>
		//   13   27:iload_3         
		//   14   28:invokevirtual   #73  <Method void VolumeProviderCompat.setCurrentVolume(int)>
				return;
		//   15   31:return          
			} else
			{
				mVpCompat = ((VolumeProviderCompat) (new VolumeProviderCompat(i, j, k) {

					public void onAdjustVolume(int i)
					{
						mCallbackHandler.post(((_cls2) (i)). new Runnable() {

							public void run()
							{
								if(mSelectedRoute != null)
							//*   0    0:aload_0         
							//*   1    1:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
							//*   2    4:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
							//*   3    7:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
							//*   4   10:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
							//*   5   13:ifnull          36
									mSelectedRoute.requestUpdateVolume(direction);
							//    6   16:aload_0         
							//    7   17:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
							//    8   20:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
							//    9   23:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
							//   10   26:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
							//   11   29:aload_0         
							//   12   30:getfield        #29  <Field int val$direction>
							//   13   33:invokevirtual   #51  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
							//   14   36:return          
							}

							final MediaSessionRecord._cls1 this$2;
							final int val$direction;

			
			{
				this$2 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				direction = I.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #29  <Field int val$direction>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #32  <Method void Object()>
			//    8   14:return          
			}
						}
);
					//    0    0:aload_0         
					//    1    1:getfield        #25  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
					//    2    4:getfield        #34  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
					//    3    7:getfield        #38  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
					//    4   10:new             #19  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2>
					//    5   13:dup             
					//    6   14:aload_0         
					//    7   15:iload_1         
					//    8   16:invokespecial   #41  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
					//    9   19:invokevirtual   #47  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
					//   10   22:pop             
					//   11   23:return          
					}

					public void onSetVolumeTo(int i)
					{
						mCallbackHandler.post(((_cls1) (i)). new Runnable() {

							public void run()
							{
								if(mSelectedRoute != null)
							//*   0    0:aload_0         
							//*   1    1:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
							//*   2    4:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
							//*   3    7:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
							//*   4   10:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
							//*   5   13:ifnull          36
									mSelectedRoute.requestSetVolume(volume);
							//    6   16:aload_0         
							//    7   17:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
							//    8   20:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
							//    9   23:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
							//   10   26:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
							//   11   29:aload_0         
							//   12   30:getfield        #29  <Field int val$volume>
							//   13   33:invokevirtual   #51  <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
							//   14   36:return          
							}

							final MediaSessionRecord._cls1 this$2;
							final int val$volume;

			
			{
				this$2 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				volume = I.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #29  <Field int val$volume>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #32  <Method void Object()>
			//    8   14:return          
			}
						}
);
					//    0    0:aload_0         
					//    1    1:getfield        #25  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
					//    2    4:getfield        #34  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
					//    3    7:getfield        #38  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
					//    4   10:new             #17  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1>
					//    5   13:dup             
					//    6   14:aload_0         
					//    7   15:iload_1         
					//    8   16:invokespecial   #49  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
					//    9   19:invokevirtual   #47  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
					//   10   22:pop             
					//   11   23:return          
					}

					final MediaSessionRecord this$1;

			
			{
				this$1 = MediaSessionRecord.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
				super(i, j, k);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:iload_3         
			//    6    8:iload           4
			//    7   10:invokespecial   #27  <Method void VolumeProviderCompat(int, int, int)>
			//    8   13:return          
			}
				}
));
		//   16   32:aload_0         
		//   17   33:new             #12  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1>
		//   18   36:dup             
		//   19   37:aload_0         
		//   20   38:iload_1         
		//   21   39:iload_2         
		//   22   40:iload_3         
		//   23   41:invokespecial   #76  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord, int, int, int)>
		//   24   44:putfield        #62  <Field VolumeProviderCompat mVpCompat>
				mMsCompat.setPlaybackToRemote(mVpCompat);
		//   25   47:aload_0         
		//   26   48:getfield        #34  <Field MediaSessionCompat mMsCompat>
		//   27   51:aload_0         
		//   28   52:getfield        #62  <Field VolumeProviderCompat mVpCompat>
		//   29   55:invokevirtual   #80  <Method void MediaSessionCompat.setPlaybackToRemote(VolumeProviderCompat)>
				return;
		//   30   58:return          
			}
		}

		public android.support.v4.media.session.MediaSessionCompat.Token getToken()
		{
			return mMsCompat.getSessionToken();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field MediaSessionCompat mMsCompat>
		//    2    4:invokevirtual   #85  <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
		//    3    7:areturn         
		}

		private int mControlType;
		private int mMaxVolume;
		private final MediaSessionCompat mMsCompat;
		private VolumeProviderCompat mVpCompat;
		final MediaRouter.GlobalMediaRouter this$0;

		public MediaSessionRecord(MediaSessionCompat mediasessioncompat)
		{
			this$0 = MediaRouter.GlobalMediaRouter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field MediaRouter$GlobalMediaRouter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void Object()>
			mMsCompat = mediasessioncompat;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #34  <Field MediaSessionCompat mMsCompat>
		//    8   14:return          
		}

		public MediaSessionRecord(Object obj)
		{
			this$0 = MediaRouter.GlobalMediaRouter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field MediaRouter$GlobalMediaRouter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void Object()>
			mMsCompat = MediaSessionCompat.fromMediaSession(mApplicationContext, obj);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #40  <Field Context MediaRouter$GlobalMediaRouter.mApplicationContext>
		//    8   14:aload_2         
		//    9   15:invokestatic    #46  <Method MediaSessionCompat MediaSessionCompat.fromMediaSession(Context, Object)>
		//   10   18:putfield        #34  <Field MediaSessionCompat mMsCompat>
		//   11   21:return          
		}
	}

	private final class ProviderCallback extends MediaRouteProvider.Callback
	{

		public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
		{
			updateProviderDescriptor(mediarouteprovider, mediarouteproviderdescriptor);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #25  <Method void MediaRouter$GlobalMediaRouter.updateProviderDescriptor(MediaRouteProvider, MediaRouteProviderDescriptor)>
		//    5    9:return          
		}

		final MediaRouter.GlobalMediaRouter this$0;

		ProviderCallback()
		{
			this$0 = MediaRouter.GlobalMediaRouter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void MediaRouteProvider$Callback()>
		//    5    9:return          
		}
	}

	private final class RemoteControlClientRecord
		implements RemoteControlClientCompat.VolumeCallback
	{

		public void disconnect()
		{
			mDisconnected = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #48  <Field boolean mDisconnected>
			mRccCompat.setVolumeCallback(((RemoteControlClientCompat.VolumeCallback) (null)));
		//    3    5:aload_0         
		//    4    6:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
		//    5    9:aconst_null     
		//    6   10:invokevirtual   #41  <Method void RemoteControlClientCompat.setVolumeCallback(RemoteControlClientCompat$VolumeCallback)>
		//    7   13:return          
		}

		public Object getRemoteControlClient()
		{
			return mRccCompat.getRemoteControlClient();
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
		//    2    4:invokevirtual   #52  <Method Object RemoteControlClientCompat.getRemoteControlClient()>
		//    3    7:areturn         
		}

		public void onVolumeSetRequest(int i)
		{
			if(!mDisconnected && mSelectedRoute != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field boolean mDisconnected>
		//*   2    4:ifne            28
		//*   3    7:aload_0         
		//*   4    8:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
		//*   5   11:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
		//*   6   14:ifnull          28
				mSelectedRoute.requestSetVolume(i);
		//    7   17:aload_0         
		//    8   18:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
		//    9   21:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
		//   10   24:iload_1         
		//   11   25:invokevirtual   #63  <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
		//   12   28:return          
		}

		public void onVolumeUpdateRequest(int i)
		{
			if(!mDisconnected && mSelectedRoute != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field boolean mDisconnected>
		//*   2    4:ifne            28
		//*   3    7:aload_0         
		//*   4    8:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
		//*   5   11:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
		//*   6   14:ifnull          28
				mSelectedRoute.requestUpdateVolume(i);
		//    7   17:aload_0         
		//    8   18:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
		//    9   21:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
		//   10   24:iload_1         
		//   11   25:invokevirtual   #67  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
		//   12   28:return          
		}

		public void updatePlaybackInfo()
		{
			mRccCompat.setPlaybackInfo(mPlaybackInfo);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
		//    4    8:getfield        #71  <Field RemoteControlClientCompat$PlaybackInfo MediaRouter$GlobalMediaRouter.mPlaybackInfo>
		//    5   11:invokevirtual   #75  <Method void RemoteControlClientCompat.setPlaybackInfo(RemoteControlClientCompat$PlaybackInfo)>
		//    6   14:return          
		}

		private boolean mDisconnected;
		private final RemoteControlClientCompat mRccCompat;
		final MediaRouter.GlobalMediaRouter this$0;

		public RemoteControlClientRecord(Object obj)
		{
			this$0 = MediaRouter.GlobalMediaRouter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			mRccCompat = RemoteControlClientCompat.obtain(mApplicationContext, obj);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #29  <Field Context MediaRouter$GlobalMediaRouter.mApplicationContext>
		//    8   14:aload_2         
		//    9   15:invokestatic    #35  <Method RemoteControlClientCompat RemoteControlClientCompat.obtain(Context, Object)>
		//   10   18:putfield        #37  <Field RemoteControlClientCompat mRccCompat>
			mRccCompat.setVolumeCallback(((RemoteControlClientCompat.VolumeCallback) (this)));
		//   11   21:aload_0         
		//   12   22:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
		//   13   25:aload_0         
		//   14   26:invokevirtual   #41  <Method void RemoteControlClientCompat.setVolumeCallback(RemoteControlClientCompat$VolumeCallback)>
			updatePlaybackInfo();
		//   15   29:aload_0         
		//   16   30:invokevirtual   #44  <Method void updatePlaybackInfo()>
		//   17   33:return          
		}
	}


	private String assignRouteUniqueId(MediaRouter.ProviderInfo providerinfo, String s)
	{
		providerinfo = ((MediaRouter.ProviderInfo) (providerinfo.getComponentName().flattenToShortString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #171 <Method ComponentName MediaRouter$ProviderInfo.getComponentName()>
	//    2    4:invokevirtual   #177 <Method String ComponentName.flattenToShortString()>
	//    3    7:astore_1        
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #179 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #180 <Method void StringBuilder()>
	//    7   15:astore          4
		((StringBuilder) (obj)).append(((String) (providerinfo)));
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		((StringBuilder) (obj)).append(":");
	//   12   24:aload           4
	//   13   26:ldc1            #186 <String ":">
	//   14   28:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		((StringBuilder) (obj)).append(s);
	//   16   32:aload           4
	//   17   34:aload_2         
	//   18   35:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   20   39:aload           4
	//   21   41:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   22   44:astore          4
		if(findRouteByUniqueId(((String) (obj))) < 0)
	//*  23   46:aload_0         
	//*  24   47:aload           4
	//*  25   49:invokespecial   #193 <Method int findRouteByUniqueId(String)>
	//*  26   52:ifge            79
		{
			mUniqueIdMap.put(((Object) (new Pair(((Object) (providerinfo)), ((Object) (s))))), obj);
	//   27   55:aload_0         
	//   28   56:getfield        #93  <Field Map mUniqueIdMap>
	//   29   59:new             #195 <Class Pair>
	//   30   62:dup             
	//   31   63:aload_1         
	//   32   64:aload_2         
	//   33   65:invokespecial   #198 <Method void Pair(Object, Object)>
	//   34   68:aload           4
	//   35   70:invokeinterface #204 <Method Object Map.put(Object, Object)>
	//   36   75:pop             
			return ((String) (obj));
	//   37   76:aload           4
	//   38   78:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   39   79:new             #179 <Class StringBuilder>
	//   40   82:dup             
	//   41   83:invokespecial   #180 <Method void StringBuilder()>
	//   42   86:astore          5
		stringbuilder.append("Either ");
	//   43   88:aload           5
	//   44   90:ldc1            #206 <String "Either ">
	//   45   92:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   46   95:pop             
		stringbuilder.append(s);
	//   47   96:aload           5
	//   48   98:aload_2         
	//   49   99:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
		stringbuilder.append(" isn't unique in ");
	//   51  103:aload           5
	//   52  105:ldc1            #208 <String " isn't unique in ">
	//   53  107:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
		stringbuilder.append(((String) (providerinfo)));
	//   55  111:aload           5
	//   56  113:aload_1         
	//   57  114:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   58  117:pop             
		stringbuilder.append(" or we're trying to assign a unique ID for an already added route");
	//   59  118:aload           5
	//   60  120:ldc1            #210 <String " or we're trying to assign a unique ID for an already added route">
	//   61  122:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   62  125:pop             
		Log.w("MediaRouter", stringbuilder.toString());
	//   63  126:ldc1            #212 <String "MediaRouter">
	//   64  128:aload           5
	//   65  130:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   66  133:invokestatic    #218 <Method int Log.w(String, String)>
	//   67  136:pop             
		int i = 2;
	//   68  137:iconst_2        
	//   69  138:istore_3        
		do
		{
			String s1 = String.format(Locale.US, "%s_%d", new Object[] {
				obj, Integer.valueOf(i)
			});
	//   70  139:getstatic       #224 <Field Locale Locale.US>
	//   71  142:ldc1            #226 <String "%s_%d">
	//   72  144:iconst_2        
	//   73  145:anewarray       Object[]
	//   74  148:dup             
	//   75  149:iconst_0        
	//   76  150:aload           4
	//   77  152:aastore         
	//   78  153:dup             
	//   79  154:iconst_1        
	//   80  155:iload_3         
	//   81  156:invokestatic    #232 <Method Integer Integer.valueOf(int)>
	//   82  159:aastore         
	//   83  160:invokestatic    #238 <Method String String.format(Locale, String, Object[])>
	//   84  163:astore          5
			if(findRouteByUniqueId(s1) < 0)
	//*  85  165:aload_0         
	//*  86  166:aload           5
	//*  87  168:invokespecial   #193 <Method int findRouteByUniqueId(String)>
	//*  88  171:ifge            198
			{
				mUniqueIdMap.put(((Object) (new Pair(((Object) (providerinfo)), ((Object) (s))))), ((Object) (s1)));
	//   89  174:aload_0         
	//   90  175:getfield        #93  <Field Map mUniqueIdMap>
	//   91  178:new             #195 <Class Pair>
	//   92  181:dup             
	//   93  182:aload_1         
	//   94  183:aload_2         
	//   95  184:invokespecial   #198 <Method void Pair(Object, Object)>
	//   96  187:aload           5
	//   97  189:invokeinterface #204 <Method Object Map.put(Object, Object)>
	//   98  194:pop             
				return s1;
	//   99  195:aload           5
	//  100  197:areturn         
			}
			i++;
	//  101  198:iload_3         
	//  102  199:iconst_1        
	//  103  200:iadd            
	//  104  201:istore_3        
		} while(true);
	//  105  202:goto            139
	}

	private int findProviderInfo(MediaRouteProvider mediarouteprovider)
	{
		int j = mProviders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ArrayList mProviders>
	//    2    4:invokevirtual   #244 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
			if(MediaRouter.ProviderInfo.access$500((MediaRouter.ProviderInfo)mProviders.get(i)) == mediarouteprovider)
	//*   9   15:aload_0         
	//*  10   16:getfield        #95  <Field ArrayList mProviders>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #167 <Class MediaRouter$ProviderInfo>
	//*  14   26:invokestatic    #252 <Method MediaRouteProvider MediaRouter$ProviderInfo.access$500(MediaRouter$ProviderInfo)>
	//*  15   29:aload_1         
	//*  16   30:if_acmpne       35
				return i;
	//   17   33:iload_2         
	//   18   34:ireturn         

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            10
		return -1;
	//   24   42:iconst_m1       
	//   25   43:ireturn         
	}

	private int findRemoteControlClientRecord(Object obj)
	{
		int j = mRemoteControlClients.size();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ArrayList mRemoteControlClients>
	//    2    4:invokevirtual   #244 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
			if(((RemoteControlClientRecord)mRemoteControlClients.get(i)).getRemoteControlClient() == obj)
	//*   9   15:aload_0         
	//*  10   16:getfield        #97  <Field ArrayList mRemoteControlClients>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #30  <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//*  14   26:invokevirtual   #258 <Method Object MediaRouter$GlobalMediaRouter$RemoteControlClientRecord.getRemoteControlClient()>
	//*  15   29:aload_1         
	//*  16   30:if_acmpne       35
				return i;
	//   17   33:iload_2         
	//   18   34:ireturn         

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            10
		return -1;
	//   24   42:iconst_m1       
	//   25   43:ireturn         
	}

	private int findRouteByUniqueId(String s)
	{
		int j = mRoutes.size();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ArrayList mRoutes>
	//    2    4:invokevirtual   #244 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          45
			if(MediaRouter.RouteInfo.access$300((MediaRouter.RouteInfo)mRoutes.get(i)).equals(((Object) (s))))
	//*   9   15:aload_0         
	//*  10   16:getfield        #88  <Field ArrayList mRoutes>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #260 <Class MediaRouter$RouteInfo>
	//*  14   26:invokestatic    #264 <Method String MediaRouter$RouteInfo.access$300(MediaRouter$RouteInfo)>
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #268 <Method boolean String.equals(Object)>
	//*  17   33:ifeq            38
				return i;
	//   18   36:iload_2         
	//   19   37:ireturn         

	//   20   38:iload_2         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_2        
	//*  24   42:goto            10
		return -1;
	//   25   45:iconst_m1       
	//   26   46:ireturn         
	}

	private String getUniqueId(MediaRouter.ProviderInfo providerinfo, String s)
	{
		providerinfo = ((MediaRouter.ProviderInfo) (providerinfo.getComponentName().flattenToShortString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #171 <Method ComponentName MediaRouter$ProviderInfo.getComponentName()>
	//    2    4:invokevirtual   #177 <Method String ComponentName.flattenToShortString()>
	//    3    7:astore_1        
		return (String)mUniqueIdMap.get(((Object) (new Pair(((Object) (providerinfo)), ((Object) (s))))));
	//    4    8:aload_0         
	//    5    9:getfield        #93  <Field Map mUniqueIdMap>
	//    6   12:new             #195 <Class Pair>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #198 <Method void Pair(Object, Object)>
	//   11   21:invokeinterface #271 <Method Object Map.get(Object)>
	//   12   26:checkcast       #234 <Class String>
	//   13   29:areturn         
	}

	private boolean isSystemDefaultRoute(MediaRouter.RouteInfo routeinfo)
	{
		return routeinfo.getProviderInstance() == mSystemProvider && MediaRouter.RouteInfo.access$100(routeinfo).equals("DEFAULT_ROUTE");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #277 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//    2    4:aload_0         
	//    3    5:getfield        #151 <Field SystemMediaRouteProvider mSystemProvider>
	//    4    8:if_acmpne       26
	//    5   11:aload_1         
	//    6   12:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//    7   15:ldc2            #282 <String "DEFAULT_ROUTE">
	//    8   18:invokevirtual   #268 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	private boolean isSystemLiveAudioOnlyRoute(MediaRouter.RouteInfo routeinfo)
	{
		return routeinfo.getProviderInstance() == mSystemProvider && routeinfo.supportsControlCategory("android.media.intent.category.LIVE_AUDIO") && !routeinfo.supportsControlCategory("android.media.intent.category.LIVE_VIDEO");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #277 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//    2    4:aload_0         
	//    3    5:getfield        #151 <Field SystemMediaRouteProvider mSystemProvider>
	//    4    8:if_acmpne       33
	//    5   11:aload_1         
	//    6   12:ldc2            #285 <String "android.media.intent.category.LIVE_AUDIO">
	//    7   15:invokevirtual   #289 <Method boolean MediaRouter$RouteInfo.supportsControlCategory(String)>
	//    8   18:ifeq            33
	//    9   21:aload_1         
	//   10   22:ldc2            #291 <String "android.media.intent.category.LIVE_VIDEO">
	//   11   25:invokevirtual   #289 <Method boolean MediaRouter$RouteInfo.supportsControlCategory(String)>
	//   12   28:ifne            33
	//   13   31:iconst_1        
	//   14   32:ireturn         
	//   15   33:iconst_0        
	//   16   34:ireturn         
	}

	private void setMediaSessionRecord(MediaSessionRecord mediasessionrecord)
	{
		if(mMediaSession != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//*   2    4:ifnull          14
			mMediaSession.clearVolumeHandling();
	//    3    7:aload_0         
	//    4    8:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//    5   11:invokevirtual   #298 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.clearVolumeHandling()>
		mMediaSession = mediasessionrecord;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
		if(mediasessionrecord != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          27
			updatePlaybackInfoFromSelectedRoute();
	//   11   23:aload_0         
	//   12   24:invokespecial   #301 <Method void updatePlaybackInfoFromSelectedRoute()>
	//   13   27:return          
	}

	private void setSelectedRouteInternal(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(MediaRouter.sGlobal == null || mBluetoothRoute != null && routeinfo.isDefault())
	//*   0    0:getstatic       #308 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//*   1    3:ifnull          20
	//*   2    6:aload_0         
	//*   3    7:getfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//*   4   10:ifnull          251
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #314 <Method boolean MediaRouter$RouteInfo.isDefault()>
	//*   7   17:ifeq            251
		{
			StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
	//    8   20:invokestatic    #320 <Method Thread Thread.currentThread()>
	//    9   23:invokevirtual   #324 <Method StackTraceElement[] Thread.getStackTrace()>
	//   10   26:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   11   28:new             #179 <Class StringBuilder>
	//   12   31:dup             
	//   13   32:invokespecial   #180 <Method void StringBuilder()>
	//   14   35:astore          4
			for(int j = 3; j < astacktraceelement.length; j++)
	//*  15   37:iconst_3        
	//*  16   38:istore_3        
	//*  17   39:iload_3         
	//*  18   40:aload           5
	//*  19   42:arraylength     
	//*  20   43:icmpge          118
			{
				StackTraceElement stacktraceelement = astacktraceelement[j];
	//   21   46:aload           5
	//   22   48:iload_3         
	//   23   49:aaload          
	//   24   50:astore          6
				stringbuilder.append(stacktraceelement.getClassName());
	//   25   52:aload           4
	//   26   54:aload           6
	//   27   56:invokevirtual   #329 <Method String StackTraceElement.getClassName()>
	//   28   59:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
				stringbuilder.append(".");
	//   30   63:aload           4
	//   31   65:ldc2            #331 <String ".">
	//   32   68:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
				stringbuilder.append(stacktraceelement.getMethodName());
	//   34   72:aload           4
	//   35   74:aload           6
	//   36   76:invokevirtual   #334 <Method String StackTraceElement.getMethodName()>
	//   37   79:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:pop             
				stringbuilder.append(":");
	//   39   83:aload           4
	//   40   85:ldc1            #186 <String ":">
	//   41   87:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   42   90:pop             
				stringbuilder.append(stacktraceelement.getLineNumber());
	//   43   91:aload           4
	//   44   93:aload           6
	//   45   95:invokevirtual   #337 <Method int StackTraceElement.getLineNumber()>
	//   46   98:invokevirtual   #340 <Method StringBuilder StringBuilder.append(int)>
	//   47  101:pop             
				stringbuilder.append("  ");
	//   48  102:aload           4
	//   49  104:ldc2            #342 <String "  ">
	//   50  107:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   51  110:pop             
			}

	//   52  111:iload_3         
	//   53  112:iconst_1        
	//   54  113:iadd            
	//   55  114:istore_3        
	//*  56  115:goto            39
			if(MediaRouter.sGlobal == null)
	//*  57  118:getstatic       #308 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//*  58  121:ifnonnull       189
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   59  124:new             #179 <Class StringBuilder>
	//   60  127:dup             
	//   61  128:invokespecial   #180 <Method void StringBuilder()>
	//   62  131:astore          5
				stringbuilder2.append("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
	//   63  133:aload           5
	//   64  135:ldc2            #344 <String "setSelectedRouteInternal is called while sGlobal is null: pkgName=">
	//   65  138:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   66  141:pop             
				stringbuilder2.append(mApplicationContext.getPackageName());
	//   67  142:aload           5
	//   68  144:aload_0         
	//   69  145:getfield        #117 <Field Context mApplicationContext>
	//   70  148:invokevirtual   #347 <Method String Context.getPackageName()>
	//   71  151:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   72  154:pop             
				stringbuilder2.append(", callers=");
	//   73  155:aload           5
	//   74  157:ldc2            #349 <String ", callers=">
	//   75  160:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   76  163:pop             
				stringbuilder2.append(stringbuilder.toString());
	//   77  164:aload           5
	//   78  166:aload           4
	//   79  168:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   80  171:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   81  174:pop             
				Log.w("MediaRouter", stringbuilder2.toString());
	//   82  175:ldc1            #212 <String "MediaRouter">
	//   83  177:aload           5
	//   84  179:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   85  182:invokestatic    #218 <Method int Log.w(String, String)>
	//   86  185:pop             
			} else
	//*  87  186:goto            251
			{
				StringBuilder stringbuilder3 = new StringBuilder();
	//   88  189:new             #179 <Class StringBuilder>
	//   89  192:dup             
	//   90  193:invokespecial   #180 <Method void StringBuilder()>
	//   91  196:astore          5
				stringbuilder3.append("Default route is selected while a BT route is available: pkgName=");
	//   92  198:aload           5
	//   93  200:ldc2            #351 <String "Default route is selected while a BT route is available: pkgName=">
	//   94  203:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   95  206:pop             
				stringbuilder3.append(mApplicationContext.getPackageName());
	//   96  207:aload           5
	//   97  209:aload_0         
	//   98  210:getfield        #117 <Field Context mApplicationContext>
	//   99  213:invokevirtual   #347 <Method String Context.getPackageName()>
	//  100  216:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  101  219:pop             
				stringbuilder3.append(", callers=");
	//  102  220:aload           5
	//  103  222:ldc2            #349 <String ", callers=">
	//  104  225:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  105  228:pop             
				stringbuilder3.append(stringbuilder.toString());
	//  106  229:aload           5
	//  107  231:aload           4
	//  108  233:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  109  236:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  110  239:pop             
				Log.w("MediaRouter", stringbuilder3.toString());
	//  111  240:ldc1            #212 <String "MediaRouter">
	//  112  242:aload           5
	//  113  244:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  114  247:invokestatic    #218 <Method int Log.w(String, String)>
	//  115  250:pop             
			}
		}
		if(mSelectedRoute != routeinfo)
	//* 116  251:aload_0         
	//* 117  252:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 118  255:aload_1         
	//* 119  256:if_acmpeq       639
		{
			if(mSelectedRoute != null)
	//* 120  259:aload_0         
	//* 121  260:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 122  263:ifnull          442
			{
				if(MediaRouter.DEBUG)
	//* 123  266:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//* 124  269:ifeq            327
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//  125  272:new             #179 <Class StringBuilder>
	//  126  275:dup             
	//  127  276:invokespecial   #180 <Method void StringBuilder()>
	//  128  279:astore          4
					stringbuilder1.append("Route unselected: ");
	//  129  281:aload           4
	//  130  283:ldc2            #358 <String "Route unselected: ">
	//  131  286:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  132  289:pop             
					stringbuilder1.append(((Object) (mSelectedRoute)));
	//  133  290:aload           4
	//  134  292:aload_0         
	//  135  293:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  136  296:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  137  299:pop             
					stringbuilder1.append(" reason: ");
	//  138  300:aload           4
	//  139  302:ldc2            #363 <String " reason: ">
	//  140  305:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  141  308:pop             
					stringbuilder1.append(i);
	//  142  309:aload           4
	//  143  311:iload_2         
	//  144  312:invokevirtual   #340 <Method StringBuilder StringBuilder.append(int)>
	//  145  315:pop             
					Log.d("MediaRouter", stringbuilder1.toString());
	//  146  316:ldc1            #212 <String "MediaRouter">
	//  147  318:aload           4
	//  148  320:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  149  323:invokestatic    #366 <Method int Log.d(String, String)>
	//  150  326:pop             
				}
				mCallbackHandler.post(263, ((Object) (mSelectedRoute)), i);
	//  151  327:aload_0         
	//  152  328:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  153  331:sipush          263
	//  154  334:aload_0         
	//  155  335:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  156  338:iload_2         
	//  157  339:invokevirtual   #370 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object, int)>
				if(mSelectedRouteController != null)
	//* 158  342:aload_0         
	//* 159  343:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//* 160  346:ifnull          369
				{
					mSelectedRouteController.onUnselect(i);
	//  161  349:aload_0         
	//  162  350:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//  163  353:iload_2         
	//  164  354:invokevirtual   #378 <Method void MediaRouteProvider$RouteController.onUnselect(int)>
					mSelectedRouteController.onRelease();
	//  165  357:aload_0         
	//  166  358:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//  167  361:invokevirtual   #381 <Method void MediaRouteProvider$RouteController.onRelease()>
					mSelectedRouteController = null;
	//  168  364:aload_0         
	//  169  365:aconst_null     
	//  170  366:putfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
				}
				if(!mRouteControllerMap.isEmpty())
	//* 171  369:aload_0         
	//* 172  370:getfield        #112 <Field Map mRouteControllerMap>
	//* 173  373:invokeinterface #384 <Method boolean Map.isEmpty()>
	//* 174  378:ifne            442
				{
					ller ller;
					for(Iterator iterator = mRouteControllerMap.values().iterator(); iterator.hasNext(); ller.onRelease())
	//* 175  381:aload_0         
	//* 176  382:getfield        #112 <Field Map mRouteControllerMap>
	//* 177  385:invokeinterface #388 <Method Collection Map.values()>
	//* 178  390:invokeinterface #394 <Method Iterator Collection.iterator()>
	//* 179  395:astore          4
	//* 180  397:aload           4
	//* 181  399:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//* 182  404:ifeq            433
					{
						ller = (ller)iterator.next();
	//  183  407:aload           4
	//  184  409:invokeinterface #402 <Method Object Iterator.next()>
	//  185  414:checkcast       #374 <Class MediaRouteProvider$RouteController>
	//  186  417:astore          5
						ller.onUnselect(i);
	//  187  419:aload           5
	//  188  421:iload_2         
	//  189  422:invokevirtual   #378 <Method void MediaRouteProvider$RouteController.onUnselect(int)>
					}

	//  190  425:aload           5
	//  191  427:invokevirtual   #381 <Method void MediaRouteProvider$RouteController.onRelease()>
	//* 192  430:goto            397
					mRouteControllerMap.clear();
	//  193  433:aload_0         
	//  194  434:getfield        #112 <Field Map mRouteControllerMap>
	//  195  437:invokeinterface #405 <Method void Map.clear()>
				}
			}
			mSelectedRoute = routeinfo;
	//  196  442:aload_0         
	//  197  443:aload_1         
	//  198  444:putfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
			mSelectedRouteController = routeinfo.getProviderInstance().onCreateRouteController(MediaRouter.RouteInfo.access$100(routeinfo));
	//  199  447:aload_0         
	//  200  448:aload_1         
	//  201  449:invokevirtual   #277 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//  202  452:aload_1         
	//  203  453:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  204  456:invokevirtual   #411 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String)>
	//  205  459:putfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
			if(mSelectedRouteController != null)
	//* 206  462:aload_0         
	//* 207  463:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//* 208  466:ifnull          476
				mSelectedRouteController.onSelect();
	//  209  469:aload_0         
	//  210  470:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//  211  473:invokevirtual   #414 <Method void MediaRouteProvider$RouteController.onSelect()>
			if(MediaRouter.DEBUG)
	//* 212  476:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//* 213  479:ifeq            517
			{
				routeinfo = ((MediaRouter.RouteInfo) (new StringBuilder()));
	//  214  482:new             #179 <Class StringBuilder>
	//  215  485:dup             
	//  216  486:invokespecial   #180 <Method void StringBuilder()>
	//  217  489:astore_1        
				((StringBuilder) (routeinfo)).append("Route selected: ");
	//  218  490:aload_1         
	//  219  491:ldc2            #416 <String "Route selected: ">
	//  220  494:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  221  497:pop             
				((StringBuilder) (routeinfo)).append(((Object) (mSelectedRoute)));
	//  222  498:aload_1         
	//  223  499:aload_0         
	//  224  500:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  225  503:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  226  506:pop             
				Log.d("MediaRouter", ((StringBuilder) (routeinfo)).toString());
	//  227  507:ldc1            #212 <String "MediaRouter">
	//  228  509:aload_1         
	//  229  510:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  230  513:invokestatic    #366 <Method int Log.d(String, String)>
	//  231  516:pop             
			}
			mCallbackHandler.post(262, ((Object) (mSelectedRoute)));
	//  232  517:aload_0         
	//  233  518:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  234  521:sipush          262
	//  235  524:aload_0         
	//  236  525:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  237  528:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			if(mSelectedRoute instanceof MediaRouter.RouteGroup)
	//* 238  531:aload_0         
	//* 239  532:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 240  535:instanceof      #421 <Class MediaRouter$RouteGroup>
	//* 241  538:ifeq            635
			{
				routeinfo = ((MediaRouter.RouteInfo) (((MediaRouter.RouteGroup)mSelectedRoute).getRoutes()));
	//  242  541:aload_0         
	//  243  542:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  244  545:checkcast       #421 <Class MediaRouter$RouteGroup>
	//  245  548:invokevirtual   #425 <Method List MediaRouter$RouteGroup.getRoutes()>
	//  246  551:astore_1        
				mRouteControllerMap.clear();
	//  247  552:aload_0         
	//  248  553:getfield        #112 <Field Map mRouteControllerMap>
	//  249  556:invokeinterface #405 <Method void Map.clear()>
				MediaRouter.RouteInfo routeinfo1;
				ller ller1;
				for(routeinfo = ((MediaRouter.RouteInfo) (((List) (routeinfo)).iterator())); ((Iterator) (routeinfo)).hasNext(); mRouteControllerMap.put(((Object) (MediaRouter.RouteInfo.access$100(routeinfo1))), ((Object) (ller1))))
	//* 250  561:aload_1         
	//* 251  562:invokeinterface #428 <Method Iterator List.iterator()>
	//* 252  567:astore_1        
	//* 253  568:aload_1         
	//* 254  569:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//* 255  574:ifeq            635
				{
					routeinfo1 = (MediaRouter.RouteInfo)((Iterator) (routeinfo)).next();
	//  256  577:aload_1         
	//  257  578:invokeinterface #402 <Method Object Iterator.next()>
	//  258  583:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  259  586:astore          4
					ller1 = routeinfo1.getProviderInstance().onCreateRouteController(MediaRouter.RouteInfo.access$100(routeinfo1), MediaRouter.RouteInfo.access$100(mSelectedRoute));
	//  260  588:aload           4
	//  261  590:invokevirtual   #277 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//  262  593:aload           4
	//  263  595:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  264  598:aload_0         
	//  265  599:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  266  602:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  267  605:invokevirtual   #431 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
	//  268  608:astore          5
					ller1.onSelect();
	//  269  610:aload           5
	//  270  612:invokevirtual   #414 <Method void MediaRouteProvider$RouteController.onSelect()>
				}

	//  271  615:aload_0         
	//  272  616:getfield        #112 <Field Map mRouteControllerMap>
	//  273  619:aload           4
	//  274  621:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  275  624:aload           5
	//  276  626:invokeinterface #204 <Method Object Map.put(Object, Object)>
	//  277  631:pop             
			}
	//* 278  632:goto            568
			updatePlaybackInfoFromSelectedRoute();
	//  279  635:aload_0         
	//  280  636:invokespecial   #301 <Method void updatePlaybackInfoFromSelectedRoute()>
		}
	//  281  639:return          
	}

	private void updatePlaybackInfoFromSelectedRoute()
	{
		if(mSelectedRoute != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   2    4:ifnull          193
		{
			mPlaybackInfo.volume = mSelectedRoute.getVolume();
	//    3    7:aload_0         
	//    4    8:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//    5   11:aload_0         
	//    6   12:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//    7   15:invokevirtual   #435 <Method int MediaRouter$RouteInfo.getVolume()>
	//    8   18:putfield        #439 <Field int RemoteControlClientCompat$PlaybackInfo.volume>
			mPlaybackInfo.volumeMax = mSelectedRoute.getVolumeMax();
	//    9   21:aload_0         
	//   10   22:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   11   25:aload_0         
	//   12   26:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   13   29:invokevirtual   #442 <Method int MediaRouter$RouteInfo.getVolumeMax()>
	//   14   32:putfield        #445 <Field int RemoteControlClientCompat$PlaybackInfo.volumeMax>
			mPlaybackInfo.volumeHandling = mSelectedRoute.getVolumeHandling();
	//   15   35:aload_0         
	//   16   36:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   17   39:aload_0         
	//   18   40:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   19   43:invokevirtual   #448 <Method int MediaRouter$RouteInfo.getVolumeHandling()>
	//   20   46:putfield        #451 <Field int RemoteControlClientCompat$PlaybackInfo.volumeHandling>
			mPlaybackInfo.playbackStream = mSelectedRoute.getPlaybackStream();
	//   21   49:aload_0         
	//   22   50:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   23   53:aload_0         
	//   24   54:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   25   57:invokevirtual   #454 <Method int MediaRouter$RouteInfo.getPlaybackStream()>
	//   26   60:putfield        #457 <Field int RemoteControlClientCompat$PlaybackInfo.playbackStream>
			mPlaybackInfo.playbackType = mSelectedRoute.getPlaybackType();
	//   27   63:aload_0         
	//   28   64:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   29   67:aload_0         
	//   30   68:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   31   71:invokevirtual   #460 <Method int MediaRouter$RouteInfo.getPlaybackType()>
	//   32   74:putfield        #463 <Field int RemoteControlClientCompat$PlaybackInfo.playbackType>
			int j = mRemoteControlClients.size();
	//   33   77:aload_0         
	//   34   78:getfield        #97  <Field ArrayList mRemoteControlClients>
	//   35   81:invokevirtual   #244 <Method int ArrayList.size()>
	//   36   84:istore_3        
			boolean flag = false;
	//   37   85:iconst_0        
	//   38   86:istore_2        
			for(int i = 0; i < j; i++)
	//*  39   87:iconst_0        
	//*  40   88:istore_1        
	//*  41   89:iload_1         
	//*  42   90:iload_3         
	//*  43   91:icmpge          115
				((RemoteControlClientRecord)mRemoteControlClients.get(i)).updatePlaybackInfo();
	//   44   94:aload_0         
	//   45   95:getfield        #97  <Field ArrayList mRemoteControlClients>
	//   46   98:iload_1         
	//   47   99:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   48  102:checkcast       #30  <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//   49  105:invokevirtual   #466 <Method void MediaRouter$GlobalMediaRouter$RemoteControlClientRecord.updatePlaybackInfo()>

	//   50  108:iload_1         
	//   51  109:iconst_1        
	//   52  110:iadd            
	//   53  111:istore_1        
	//*  54  112:goto            89
			if(mMediaSession != null)
	//*  55  115:aload_0         
	//*  56  116:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//*  57  119:ifnull          207
				if(mSelectedRoute != getDefaultRoute() && mSelectedRoute != getBluetoothRoute())
	//*  58  122:aload_0         
	//*  59  123:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*  60  126:aload_0         
	//*  61  127:invokevirtual   #470 <Method MediaRouter$RouteInfo getDefaultRoute()>
	//*  62  130:if_acmpeq       185
	//*  63  133:aload_0         
	//*  64  134:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*  65  137:aload_0         
	//*  66  138:invokevirtual   #473 <Method MediaRouter$RouteInfo getBluetoothRoute()>
	//*  67  141:if_acmpne       147
	//*  68  144:goto            185
				{
					byte byte0 = ((byte) (flag));
	//   69  147:iload_2         
	//   70  148:istore_1        
					if(mPlaybackInfo.volumeHandling == 1)
	//*  71  149:aload_0         
	//*  72  150:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//*  73  153:getfield        #451 <Field int RemoteControlClientCompat$PlaybackInfo.volumeHandling>
	//*  74  156:iconst_1        
	//*  75  157:icmpne          162
						byte0 = 2;
	//   76  160:iconst_2        
	//   77  161:istore_1        
					mMediaSession.configureVolume(((int) (byte0)), mPlaybackInfo.volumeMax, mPlaybackInfo.volume);
	//   78  162:aload_0         
	//   79  163:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//   80  166:iload_1         
	//   81  167:aload_0         
	//   82  168:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   83  171:getfield        #445 <Field int RemoteControlClientCompat$PlaybackInfo.volumeMax>
	//   84  174:aload_0         
	//   85  175:getfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   86  178:getfield        #439 <Field int RemoteControlClientCompat$PlaybackInfo.volume>
	//   87  181:invokevirtual   #477 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.configureVolume(int, int, int)>
					return;
	//   88  184:return          
				} else
				{
					mMediaSession.clearVolumeHandling();
	//   89  185:aload_0         
	//   90  186:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//   91  189:invokevirtual   #298 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.clearVolumeHandling()>
					return;
	//   92  192:return          
				}
		} else
		if(mMediaSession != null)
	//*  93  193:aload_0         
	//*  94  194:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//*  95  197:ifnull          207
			mMediaSession.clearVolumeHandling();
	//   96  200:aload_0         
	//   97  201:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//   98  204:invokevirtual   #298 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.clearVolumeHandling()>
	//   99  207:return          
	}

	private void updateProviderContents(MediaRouter.ProviderInfo providerinfo, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
label0:
		{
			int l;
			boolean flag2;
label1:
			{
				if(!providerinfo.updateDescriptor(mediarouteproviderdescriptor))
					break label0;
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #483 <Method boolean MediaRouter$ProviderInfo.updateDescriptor(MediaRouteProviderDescriptor)>
	//    3    5:ifeq            844
				if(mediarouteproviderdescriptor != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          637
				{
					if(mediarouteproviderdescriptor.isValid())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #488 <Method boolean MediaRouteProviderDescriptor.isValid()>
	//*   8   16:ifeq            601
					{
						List list = mediarouteproviderdescriptor.getRoutes();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #489 <Method List MediaRouteProviderDescriptor.getRoutes()>
	//   11   23:astore          10
						int j1 = list.size();
	//   12   25:aload           10
	//   13   27:invokeinterface #490 <Method int List.size()>
	//   14   32:istore          6
						ArrayList arraylist1 = new ArrayList();
	//   15   34:new             #83  <Class ArrayList>
	//   16   37:dup             
	//   17   38:invokespecial   #84  <Method void ArrayList()>
	//   18   41:astore          11
						ArrayList arraylist = new ArrayList();
	//   19   43:new             #83  <Class ArrayList>
	//   20   46:dup             
	//   21   47:invokespecial   #84  <Method void ArrayList()>
	//   22   50:astore          9
						l = 0;
	//   23   52:iconst_0        
	//   24   53:istore          4
						int i = 0;
	//   25   55:iconst_0        
	//   26   56:istore_3        
						boolean flag = false;
	//   27   57:iconst_0        
	//   28   58:istore          7
						for(; l < j1; l++)
	//*  29   60:iload           4
	//*  30   62:iload           6
	//*  31   64:icmpge          414
						{
							Object obj = ((Object) ((MediaRouteDescriptor)list.get(l)));
	//   32   67:aload           10
	//   33   69:iload           4
	//   34   71:invokeinterface #491 <Method Object List.get(int)>
	//   35   76:checkcast       #493 <Class MediaRouteDescriptor>
	//   36   79:astore          12
							mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (((MediaRouteDescriptor) (obj)).getId()));
	//   37   81:aload           12
	//   38   83:invokevirtual   #496 <Method String MediaRouteDescriptor.getId()>
	//   39   86:astore_2        
							int i1 = providerinfo.findRouteByDescriptorId(((String) (mediarouteproviderdescriptor)));
	//   40   87:aload_1         
	//   41   88:aload_2         
	//   42   89:invokevirtual   #499 <Method int MediaRouter$ProviderInfo.findRouteByDescriptorId(String)>
	//   43   92:istore          5
							if(i1 < 0)
	//*  44   94:iload           5
	//*  45   96:ifge            269
							{
								String s = assignRouteUniqueId(providerinfo, ((String) (mediarouteproviderdescriptor)));
	//   46   99:aload_0         
	//   47  100:aload_1         
	//   48  101:aload_2         
	//   49  102:invokespecial   #501 <Method String assignRouteUniqueId(MediaRouter$ProviderInfo, String)>
	//   50  105:astore          13
								if(((MediaRouteDescriptor) (obj)).getGroupMemberIds() != null)
	//*  51  107:aload           12
	//*  52  109:invokevirtual   #504 <Method List MediaRouteDescriptor.getGroupMemberIds()>
	//*  53  112:ifnull          121
									i1 = 1;
	//   54  115:iconst_1        
	//   55  116:istore          5
								else
	//*  56  118:goto            124
									i1 = 0;
	//   57  121:iconst_0        
	//   58  122:istore          5
								if(i1 != 0)
	//*  59  124:iload           5
	//*  60  126:ifeq            144
									mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new MediaRouter.RouteGroup(providerinfo, ((String) (mediarouteproviderdescriptor)), s)));
	//   61  129:new             #421 <Class MediaRouter$RouteGroup>
	//   62  132:dup             
	//   63  133:aload_1         
	//   64  134:aload_2         
	//   65  135:aload           13
	//   66  137:invokespecial   #507 <Method void MediaRouter$RouteGroup(MediaRouter$ProviderInfo, String, String)>
	//   67  140:astore_2        
								else
	//*  68  141:goto            156
									mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new MediaRouter.RouteInfo(providerinfo, ((String) (mediarouteproviderdescriptor)), s)));
	//   69  144:new             #260 <Class MediaRouter$RouteInfo>
	//   70  147:dup             
	//   71  148:aload_1         
	//   72  149:aload_2         
	//   73  150:aload           13
	//   74  152:invokespecial   #508 <Method void MediaRouter$RouteInfo(MediaRouter$ProviderInfo, String, String)>
	//   75  155:astore_2        
								MediaRouter.ProviderInfo.access$600(providerinfo).add(i, ((Object) (mediarouteproviderdescriptor)));
	//   76  156:aload_1         
	//   77  157:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//   78  160:iload_3         
	//   79  161:aload_2         
	//   80  162:invokeinterface #515 <Method void List.add(int, Object)>
								mRoutes.add(((Object) (mediarouteproviderdescriptor)));
	//   81  167:aload_0         
	//   82  168:getfield        #88  <Field ArrayList mRoutes>
	//   83  171:aload_2         
	//   84  172:invokevirtual   #517 <Method boolean ArrayList.add(Object)>
	//   85  175:pop             
								if(i1 != 0)
	//*  86  176:iload           5
	//*  87  178:ifeq            202
								{
									((List) (arraylist1)).add(((Object) (new Pair(((Object) (mediarouteproviderdescriptor)), obj))));
	//   88  181:aload           11
	//   89  183:new             #195 <Class Pair>
	//   90  186:dup             
	//   91  187:aload_2         
	//   92  188:aload           12
	//   93  190:invokespecial   #198 <Method void Pair(Object, Object)>
	//   94  193:invokeinterface #518 <Method boolean List.add(Object)>
	//   95  198:pop             
								} else
	//*  96  199:goto            262
								{
									((MediaRouter.RouteInfo) (mediarouteproviderdescriptor)).maybeUpdateDescriptor(((MediaRouteDescriptor) (obj)));
	//   97  202:aload_2         
	//   98  203:aload           12
	//   99  205:invokevirtual   #522 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
	//  100  208:pop             
									if(MediaRouter.DEBUG)
	//* 101  209:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//* 102  212:ifeq            251
									{
										obj = ((Object) (new StringBuilder()));
	//  103  215:new             #179 <Class StringBuilder>
	//  104  218:dup             
	//  105  219:invokespecial   #180 <Method void StringBuilder()>
	//  106  222:astore          12
										((StringBuilder) (obj)).append("Route added: ");
	//  107  224:aload           12
	//  108  226:ldc2            #524 <String "Route added: ">
	//  109  229:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  110  232:pop             
										((StringBuilder) (obj)).append(((Object) (mediarouteproviderdescriptor)));
	//  111  233:aload           12
	//  112  235:aload_2         
	//  113  236:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  114  239:pop             
										Log.d("MediaRouter", ((StringBuilder) (obj)).toString());
	//  115  240:ldc1            #212 <String "MediaRouter">
	//  116  242:aload           12
	//  117  244:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  118  247:invokestatic    #366 <Method int Log.d(String, String)>
	//  119  250:pop             
									}
									mCallbackHandler.post(257, ((Object) (mediarouteproviderdescriptor)));
	//  120  251:aload_0         
	//  121  252:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  122  255:sipush          257
	//  123  258:aload_2         
	//  124  259:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
								}
								i++;
	//  125  262:iload_3         
	//  126  263:iconst_1        
	//  127  264:iadd            
	//  128  265:istore_3        
								continue;
	//  129  266:goto            405
							}
							if(i1 < i)
	//* 130  269:iload           5
	//* 131  271:iload_3         
	//* 132  272:icmpge          311
							{
								mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new StringBuilder()));
	//  133  275:new             #179 <Class StringBuilder>
	//  134  278:dup             
	//  135  279:invokespecial   #180 <Method void StringBuilder()>
	//  136  282:astore_2        
								((StringBuilder) (mediarouteproviderdescriptor)).append("Ignoring route descriptor with duplicate id: ");
	//  137  283:aload_2         
	//  138  284:ldc2            #526 <String "Ignoring route descriptor with duplicate id: ">
	//  139  287:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  140  290:pop             
								((StringBuilder) (mediarouteproviderdescriptor)).append(obj);
	//  141  291:aload_2         
	//  142  292:aload           12
	//  143  294:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  144  297:pop             
								Log.w("MediaRouter", ((StringBuilder) (mediarouteproviderdescriptor)).toString());
	//  145  298:ldc1            #212 <String "MediaRouter">
	//  146  300:aload_2         
	//  147  301:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  148  304:invokestatic    #218 <Method int Log.w(String, String)>
	//  149  307:pop             
								continue;
	//  150  308:goto            405
							}
							mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$600(providerinfo).get(i1)));
	//  151  311:aload_1         
	//  152  312:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//  153  315:iload           5
	//  154  317:invokeinterface #491 <Method Object List.get(int)>
	//  155  322:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  156  325:astore_2        
							Collections.swap(MediaRouter.ProviderInfo.access$600(providerinfo), i1, i);
	//  157  326:aload_1         
	//  158  327:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//  159  330:iload           5
	//  160  332:iload_3         
	//  161  333:invokestatic    #532 <Method void Collections.swap(List, int, int)>
							boolean flag1;
							if(mediarouteproviderdescriptor instanceof MediaRouter.RouteGroup)
	//* 162  336:aload_2         
	//* 163  337:instanceof      #421 <Class MediaRouter$RouteGroup>
	//* 164  340:ifeq            368
							{
								((List) (arraylist)).add(((Object) (new Pair(((Object) (mediarouteproviderdescriptor)), obj))));
	//  165  343:aload           9
	//  166  345:new             #195 <Class Pair>
	//  167  348:dup             
	//  168  349:aload_2         
	//  169  350:aload           12
	//  170  352:invokespecial   #198 <Method void Pair(Object, Object)>
	//  171  355:invokeinterface #518 <Method boolean List.add(Object)>
	//  172  360:pop             
								flag1 = flag;
	//  173  361:iload           7
	//  174  363:istore          8
							} else
	//* 175  365:goto            397
							{
								flag1 = flag;
	//  176  368:iload           7
	//  177  370:istore          8
								if(updateRouteDescriptorAndNotify(((MediaRouter.RouteInfo) (mediarouteproviderdescriptor)), ((MediaRouteDescriptor) (obj))) != 0)
	//* 178  372:aload_0         
	//* 179  373:aload_2         
	//* 180  374:aload           12
	//* 181  376:invokespecial   #536 <Method int updateRouteDescriptorAndNotify(MediaRouter$RouteInfo, MediaRouteDescriptor)>
	//* 182  379:ifeq            397
								{
									flag1 = flag;
	//  183  382:iload           7
	//  184  384:istore          8
									if(mediarouteproviderdescriptor == mSelectedRoute)
	//* 185  386:aload_2         
	//* 186  387:aload_0         
	//* 187  388:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 188  391:if_acmpne       397
										flag1 = true;
	//  189  394:iconst_1        
	//  190  395:istore          8
								}
							}
							i++;
	//  191  397:iload_3         
	//  192  398:iconst_1        
	//  193  399:iadd            
	//  194  400:istore_3        
							flag = flag1;
	//  195  401:iload           8
	//  196  403:istore          7
						}

	//  197  405:iload           4
	//  198  407:iconst_1        
	//  199  408:iadd            
	//  200  409:istore          4
	//* 201  411:goto            60
						MediaRouter.RouteInfo routeinfo;
						for(mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (((List) (arraylist1)).iterator())); ((Iterator) (mediarouteproviderdescriptor)).hasNext(); mCallbackHandler.post(257, ((Object) (routeinfo))))
	//* 202  414:aload           11
	//* 203  416:invokeinterface #428 <Method Iterator List.iterator()>
	//* 204  421:astore_2        
	//* 205  422:aload_2         
	//* 206  423:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//* 207  428:ifeq            524
						{
							Pair pair1 = (Pair)((Iterator) (mediarouteproviderdescriptor)).next();
	//  208  431:aload_2         
	//  209  432:invokeinterface #402 <Method Object Iterator.next()>
	//  210  437:checkcast       #195 <Class Pair>
	//  211  440:astore          11
							routeinfo = (MediaRouter.RouteInfo)pair1.first;
	//  212  442:aload           11
	//  213  444:getfield        #540 <Field Object Pair.first>
	//  214  447:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  215  450:astore          10
							routeinfo.maybeUpdateDescriptor((MediaRouteDescriptor)pair1.second);
	//  216  452:aload           10
	//  217  454:aload           11
	//  218  456:getfield        #543 <Field Object Pair.second>
	//  219  459:checkcast       #493 <Class MediaRouteDescriptor>
	//  220  462:invokevirtual   #522 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
	//  221  465:pop             
							if(MediaRouter.DEBUG)
	//* 222  466:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//* 223  469:ifeq            509
							{
								StringBuilder stringbuilder2 = new StringBuilder();
	//  224  472:new             #179 <Class StringBuilder>
	//  225  475:dup             
	//  226  476:invokespecial   #180 <Method void StringBuilder()>
	//  227  479:astore          11
								stringbuilder2.append("Route added: ");
	//  228  481:aload           11
	//  229  483:ldc2            #524 <String "Route added: ">
	//  230  486:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  231  489:pop             
								stringbuilder2.append(((Object) (routeinfo)));
	//  232  490:aload           11
	//  233  492:aload           10
	//  234  494:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  235  497:pop             
								Log.d("MediaRouter", stringbuilder2.toString());
	//  236  498:ldc1            #212 <String "MediaRouter">
	//  237  500:aload           11
	//  238  502:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  239  505:invokestatic    #366 <Method int Log.d(String, String)>
	//  240  508:pop             
							}
						}

	//  241  509:aload_0         
	//  242  510:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  243  513:sipush          257
	//  244  516:aload           10
	//  245  518:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
	//* 246  521:goto            422
						mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (((List) (arraylist)).iterator()));
	//  247  524:aload           9
	//  248  526:invokeinterface #428 <Method Iterator List.iterator()>
	//  249  531:astore_2        
						do
						{
							flag2 = flag;
	//  250  532:iload           7
	//  251  534:istore          8
							l = i;
	//  252  536:iload_3         
	//  253  537:istore          4
							if(!((Iterator) (mediarouteproviderdescriptor)).hasNext())
								break;
	//  254  539:aload_2         
	//  255  540:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//  256  545:ifeq            643
							Pair pair = (Pair)((Iterator) (mediarouteproviderdescriptor)).next();
	//  257  548:aload_2         
	//  258  549:invokeinterface #402 <Method Object Iterator.next()>
	//  259  554:checkcast       #195 <Class Pair>
	//  260  557:astore          9
							MediaRouter.RouteInfo routeinfo1 = (MediaRouter.RouteInfo)pair.first;
	//  261  559:aload           9
	//  262  561:getfield        #540 <Field Object Pair.first>
	//  263  564:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  264  567:astore          10
							if(updateRouteDescriptorAndNotify(routeinfo1, (MediaRouteDescriptor)pair.second) != 0 && routeinfo1 == mSelectedRoute)
	//* 265  569:aload_0         
	//* 266  570:aload           10
	//* 267  572:aload           9
	//* 268  574:getfield        #543 <Field Object Pair.second>
	//* 269  577:checkcast       #493 <Class MediaRouteDescriptor>
	//* 270  580:invokespecial   #536 <Method int updateRouteDescriptorAndNotify(MediaRouter$RouteInfo, MediaRouteDescriptor)>
	//* 271  583:ifeq            532
	//* 272  586:aload           10
	//* 273  588:aload_0         
	//* 274  589:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 275  592:if_acmpne       532
								flag = true;
	//  276  595:iconst_1        
	//  277  596:istore          7
						} while(true);
	//  278  598:goto            532
						break label1;
					}
					StringBuilder stringbuilder = new StringBuilder();
	//  279  601:new             #179 <Class StringBuilder>
	//  280  604:dup             
	//  281  605:invokespecial   #180 <Method void StringBuilder()>
	//  282  608:astore          9
					stringbuilder.append("Ignoring invalid provider descriptor: ");
	//  283  610:aload           9
	//  284  612:ldc2            #545 <String "Ignoring invalid provider descriptor: ">
	//  285  615:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  286  618:pop             
					stringbuilder.append(((Object) (mediarouteproviderdescriptor)));
	//  287  619:aload           9
	//  288  621:aload_2         
	//  289  622:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  290  625:pop             
					Log.w("MediaRouter", stringbuilder.toString());
	//  291  626:ldc1            #212 <String "MediaRouter">
	//  292  628:aload           9
	//  293  630:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  294  633:invokestatic    #218 <Method int Log.w(String, String)>
	//  295  636:pop             
				}
				flag2 = false;
	//  296  637:iconst_0        
	//  297  638:istore          8
				l = 0;
	//  298  640:iconst_0        
	//  299  641:istore          4
			}
			for(int j = MediaRouter.ProviderInfo.access$600(providerinfo).size() - 1; j >= l; j--)
	//* 300  643:aload_1         
	//* 301  644:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//* 302  647:invokeinterface #490 <Method int List.size()>
	//* 303  652:iconst_1        
	//* 304  653:isub            
	//* 305  654:istore_3        
	//* 306  655:iload_3         
	//* 307  656:iload           4
	//* 308  658:icmplt          697
			{
				mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$600(providerinfo).get(j)));
	//  309  661:aload_1         
	//  310  662:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//  311  665:iload_3         
	//  312  666:invokeinterface #491 <Method Object List.get(int)>
	//  313  671:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  314  674:astore_2        
				((MediaRouter.RouteInfo) (mediarouteproviderdescriptor)).maybeUpdateDescriptor(((MediaRouteDescriptor) (null)));
	//  315  675:aload_2         
	//  316  676:aconst_null     
	//  317  677:invokevirtual   #522 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
	//  318  680:pop             
				mRoutes.remove(((Object) (mediarouteproviderdescriptor)));
	//  319  681:aload_0         
	//  320  682:getfield        #88  <Field ArrayList mRoutes>
	//  321  685:aload_2         
	//  322  686:invokevirtual   #548 <Method boolean ArrayList.remove(Object)>
	//  323  689:pop             
			}

	//  324  690:iload_3         
	//  325  691:iconst_1        
	//  326  692:isub            
	//  327  693:istore_3        
	//* 328  694:goto            655
			updateSelectedRouteIfNeeded(flag2);
	//  329  697:aload_0         
	//  330  698:iload           8
	//  331  700:invokespecial   #164 <Method void updateSelectedRouteIfNeeded(boolean)>
			for(int k = MediaRouter.ProviderInfo.access$600(providerinfo).size() - 1; k >= l; k--)
	//* 332  703:aload_1         
	//* 333  704:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//* 334  707:invokeinterface #490 <Method int List.size()>
	//* 335  712:iconst_1        
	//* 336  713:isub            
	//* 337  714:istore_3        
	//* 338  715:iload_3         
	//* 339  716:iload           4
	//* 340  718:icmplt          795
			{
				mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$600(providerinfo).remove(k)));
	//  341  721:aload_1         
	//  342  722:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//  343  725:iload_3         
	//  344  726:invokeinterface #550 <Method Object List.remove(int)>
	//  345  731:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  346  734:astore_2        
				if(MediaRouter.DEBUG)
	//* 347  735:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//* 348  738:ifeq            777
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//  349  741:new             #179 <Class StringBuilder>
	//  350  744:dup             
	//  351  745:invokespecial   #180 <Method void StringBuilder()>
	//  352  748:astore          9
					stringbuilder1.append("Route removed: ");
	//  353  750:aload           9
	//  354  752:ldc2            #552 <String "Route removed: ">
	//  355  755:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  356  758:pop             
					stringbuilder1.append(((Object) (mediarouteproviderdescriptor)));
	//  357  759:aload           9
	//  358  761:aload_2         
	//  359  762:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  360  765:pop             
					Log.d("MediaRouter", stringbuilder1.toString());
	//  361  766:ldc1            #212 <String "MediaRouter">
	//  362  768:aload           9
	//  363  770:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  364  773:invokestatic    #366 <Method int Log.d(String, String)>
	//  365  776:pop             
				}
				mCallbackHandler.post(258, ((Object) (mediarouteproviderdescriptor)));
	//  366  777:aload_0         
	//  367  778:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  368  781:sipush          258
	//  369  784:aload_2         
	//  370  785:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}

	//  371  788:iload_3         
	//  372  789:iconst_1        
	//  373  790:isub            
	//  374  791:istore_3        
	//* 375  792:goto            715
			if(MediaRouter.DEBUG)
	//* 376  795:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//* 377  798:ifeq            833
			{
				mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new StringBuilder()));
	//  378  801:new             #179 <Class StringBuilder>
	//  379  804:dup             
	//  380  805:invokespecial   #180 <Method void StringBuilder()>
	//  381  808:astore_2        
				((StringBuilder) (mediarouteproviderdescriptor)).append("Provider changed: ");
	//  382  809:aload_2         
	//  383  810:ldc2            #554 <String "Provider changed: ">
	//  384  813:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  385  816:pop             
				((StringBuilder) (mediarouteproviderdescriptor)).append(((Object) (providerinfo)));
	//  386  817:aload_2         
	//  387  818:aload_1         
	//  388  819:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  389  822:pop             
				Log.d("MediaRouter", ((StringBuilder) (mediarouteproviderdescriptor)).toString());
	//  390  823:ldc1            #212 <String "MediaRouter">
	//  391  825:aload_2         
	//  392  826:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  393  829:invokestatic    #366 <Method int Log.d(String, String)>
	//  394  832:pop             
			}
			mCallbackHandler.post(515, ((Object) (providerinfo)));
	//  395  833:aload_0         
	//  396  834:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  397  837:sipush          515
	//  398  840:aload_1         
	//  399  841:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
		}
	//  400  844:return          
	}

	private int updateRouteDescriptorAndNotify(MediaRouter.RouteInfo routeinfo, MediaRouteDescriptor mediaroutedescriptor)
	{
		int i = routeinfo.maybeUpdateDescriptor(mediaroutedescriptor);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #522 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
	//    3    5:istore_3        
		if(i != 0)
	//*   4    6:iload_3         
	//*   5    7:ifeq            175
		{
			if((i & 1) != 0)
	//*   6   10:iload_3         
	//*   7   11:iconst_1        
	//*   8   12:iand            
	//*   9   13:ifeq            65
			{
				if(MediaRouter.DEBUG)
	//*  10   16:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//*  11   19:ifeq            54
				{
					mediaroutedescriptor = ((MediaRouteDescriptor) (new StringBuilder()));
	//   12   22:new             #179 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #180 <Method void StringBuilder()>
	//   15   29:astore_2        
					((StringBuilder) (mediaroutedescriptor)).append("Route changed: ");
	//   16   30:aload_2         
	//   17   31:ldc2            #556 <String "Route changed: ">
	//   18   34:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
					((StringBuilder) (mediaroutedescriptor)).append(((Object) (routeinfo)));
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   23   43:pop             
					Log.d("MediaRouter", ((StringBuilder) (mediaroutedescriptor)).toString());
	//   24   44:ldc1            #212 <String "MediaRouter">
	//   25   46:aload_2         
	//   26   47:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   27   50:invokestatic    #366 <Method int Log.d(String, String)>
	//   28   53:pop             
				}
				mCallbackHandler.post(259, ((Object) (routeinfo)));
	//   29   54:aload_0         
	//   30   55:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   31   58:sipush          259
	//   32   61:aload_1         
	//   33   62:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}
			if((i & 2) != 0)
	//*  34   65:iload_3         
	//*  35   66:iconst_2        
	//*  36   67:iand            
	//*  37   68:ifeq            120
			{
				if(MediaRouter.DEBUG)
	//*  38   71:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//*  39   74:ifeq            109
				{
					mediaroutedescriptor = ((MediaRouteDescriptor) (new StringBuilder()));
	//   40   77:new             #179 <Class StringBuilder>
	//   41   80:dup             
	//   42   81:invokespecial   #180 <Method void StringBuilder()>
	//   43   84:astore_2        
					((StringBuilder) (mediaroutedescriptor)).append("Route volume changed: ");
	//   44   85:aload_2         
	//   45   86:ldc2            #558 <String "Route volume changed: ">
	//   46   89:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
					((StringBuilder) (mediaroutedescriptor)).append(((Object) (routeinfo)));
	//   48   93:aload_2         
	//   49   94:aload_1         
	//   50   95:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   51   98:pop             
					Log.d("MediaRouter", ((StringBuilder) (mediaroutedescriptor)).toString());
	//   52   99:ldc1            #212 <String "MediaRouter">
	//   53  101:aload_2         
	//   54  102:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   55  105:invokestatic    #366 <Method int Log.d(String, String)>
	//   56  108:pop             
				}
				mCallbackHandler.post(260, ((Object) (routeinfo)));
	//   57  109:aload_0         
	//   58  110:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   59  113:sipush          260
	//   60  116:aload_1         
	//   61  117:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}
			if((i & 4) != 0)
	//*  62  120:iload_3         
	//*  63  121:iconst_4        
	//*  64  122:iand            
	//*  65  123:ifeq            175
			{
				if(MediaRouter.DEBUG)
	//*  66  126:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//*  67  129:ifeq            164
				{
					mediaroutedescriptor = ((MediaRouteDescriptor) (new StringBuilder()));
	//   68  132:new             #179 <Class StringBuilder>
	//   69  135:dup             
	//   70  136:invokespecial   #180 <Method void StringBuilder()>
	//   71  139:astore_2        
					((StringBuilder) (mediaroutedescriptor)).append("Route presentation display changed: ");
	//   72  140:aload_2         
	//   73  141:ldc2            #560 <String "Route presentation display changed: ">
	//   74  144:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   75  147:pop             
					((StringBuilder) (mediaroutedescriptor)).append(((Object) (routeinfo)));
	//   76  148:aload_2         
	//   77  149:aload_1         
	//   78  150:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   79  153:pop             
					Log.d("MediaRouter", ((StringBuilder) (mediaroutedescriptor)).toString());
	//   80  154:ldc1            #212 <String "MediaRouter">
	//   81  156:aload_2         
	//   82  157:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   83  160:invokestatic    #366 <Method int Log.d(String, String)>
	//   84  163:pop             
				}
				mCallbackHandler.post(261, ((Object) (routeinfo)));
	//   85  164:aload_0         
	//   86  165:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   87  168:sipush          261
	//   88  171:aload_1         
	//   89  172:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}
		}
		return i;
	//   90  175:iload_3         
	//   91  176:ireturn         
	}

	private void updateSelectedRouteIfNeeded(boolean flag)
	{
label0:
		{
			if(mDefaultRoute != null && !mDefaultRoute.isSelectable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//*   2    4:ifnull          57
	//*   3    7:aload_0         
	//*   4    8:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//*   5   11:invokevirtual   #565 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//*   6   14:ifne            57
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    7   17:new             #179 <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #180 <Method void StringBuilder()>
	//   10   24:astore_2        
				stringbuilder.append("Clearing the default route because it is no longer selectable: ");
	//   11   25:aload_2         
	//   12   26:ldc2            #567 <String "Clearing the default route because it is no longer selectable: ">
	//   13   29:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
				stringbuilder.append(((Object) (mDefaultRoute)));
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   18   38:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   19   41:pop             
				Log.i("MediaRouter", stringbuilder.toString());
	//   20   42:ldc1            #212 <String "MediaRouter">
	//   21   44:aload_2         
	//   22   45:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   23   48:invokestatic    #570 <Method int Log.i(String, String)>
	//   24   51:pop             
				mDefaultRoute = null;
	//   25   52:aload_0         
	//   26   53:aconst_null     
	//   27   54:putfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
			}
			if(mDefaultRoute != null || mRoutes.isEmpty())
				break label0;
	//   28   57:aload_0         
	//   29   58:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   30   61:ifnonnull       156
	//   31   64:aload_0         
	//   32   65:getfield        #88  <Field ArrayList mRoutes>
	//   33   68:invokevirtual   #571 <Method boolean ArrayList.isEmpty()>
	//   34   71:ifne            156
			Object obj = ((Object) (mRoutes.iterator()));
	//   35   74:aload_0         
	//   36   75:getfield        #88  <Field ArrayList mRoutes>
	//   37   78:invokevirtual   #572 <Method Iterator ArrayList.iterator()>
	//   38   81:astore_2        
			MediaRouter.RouteInfo routeinfo;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   39   82:aload_2         
	//   40   83:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//   41   88:ifeq            156
				routeinfo = (MediaRouter.RouteInfo)((Iterator) (obj)).next();
	//   42   91:aload_2         
	//   43   92:invokeinterface #402 <Method Object Iterator.next()>
	//   44   97:checkcast       #260 <Class MediaRouter$RouteInfo>
	//   45  100:astore_3        
			} while(!isSystemDefaultRoute(routeinfo) || !routeinfo.isSelectable());
	//   46  101:aload_0         
	//   47  102:aload_3         
	//   48  103:invokespecial   #574 <Method boolean isSystemDefaultRoute(MediaRouter$RouteInfo)>
	//   49  106:ifeq            82
	//   50  109:aload_3         
	//   51  110:invokevirtual   #565 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//   52  113:ifeq            82
			mDefaultRoute = routeinfo;
	//   53  116:aload_0         
	//   54  117:aload_3         
	//   55  118:putfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
			obj = ((Object) (new StringBuilder()));
	//   56  121:new             #179 <Class StringBuilder>
	//   57  124:dup             
	//   58  125:invokespecial   #180 <Method void StringBuilder()>
	//   59  128:astore_2        
			((StringBuilder) (obj)).append("Found default route: ");
	//   60  129:aload_2         
	//   61  130:ldc2            #576 <String "Found default route: ">
	//   62  133:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   63  136:pop             
			((StringBuilder) (obj)).append(((Object) (mDefaultRoute)));
	//   64  137:aload_2         
	//   65  138:aload_0         
	//   66  139:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   67  142:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   68  145:pop             
			Log.i("MediaRouter", ((StringBuilder) (obj)).toString());
	//   69  146:ldc1            #212 <String "MediaRouter">
	//   70  148:aload_2         
	//   71  149:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   72  152:invokestatic    #570 <Method int Log.i(String, String)>
	//   73  155:pop             
		}
label1:
		{
			if(mBluetoothRoute != null && !mBluetoothRoute.isSelectable())
	//*  74  156:aload_0         
	//*  75  157:getfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//*  76  160:ifnull          213
	//*  77  163:aload_0         
	//*  78  164:getfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//*  79  167:invokevirtual   #565 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//*  80  170:ifne            213
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   81  173:new             #179 <Class StringBuilder>
	//   82  176:dup             
	//   83  177:invokespecial   #180 <Method void StringBuilder()>
	//   84  180:astore_2        
				stringbuilder1.append("Clearing the bluetooth route because it is no longer selectable: ");
	//   85  181:aload_2         
	//   86  182:ldc2            #578 <String "Clearing the bluetooth route because it is no longer selectable: ">
	//   87  185:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   88  188:pop             
				stringbuilder1.append(((Object) (mBluetoothRoute)));
	//   89  189:aload_2         
	//   90  190:aload_0         
	//   91  191:getfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//   92  194:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   93  197:pop             
				Log.i("MediaRouter", stringbuilder1.toString());
	//   94  198:ldc1            #212 <String "MediaRouter">
	//   95  200:aload_2         
	//   96  201:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   97  204:invokestatic    #570 <Method int Log.i(String, String)>
	//   98  207:pop             
				mBluetoothRoute = null;
	//   99  208:aload_0         
	//  100  209:aconst_null     
	//  101  210:putfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
			}
			if(mBluetoothRoute != null || mRoutes.isEmpty())
				break label1;
	//  102  213:aload_0         
	//  103  214:getfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//  104  217:ifnonnull       312
	//  105  220:aload_0         
	//  106  221:getfield        #88  <Field ArrayList mRoutes>
	//  107  224:invokevirtual   #571 <Method boolean ArrayList.isEmpty()>
	//  108  227:ifne            312
			Object obj1 = ((Object) (mRoutes.iterator()));
	//  109  230:aload_0         
	//  110  231:getfield        #88  <Field ArrayList mRoutes>
	//  111  234:invokevirtual   #572 <Method Iterator ArrayList.iterator()>
	//  112  237:astore_2        
			MediaRouter.RouteInfo routeinfo1;
			do
			{
				if(!((Iterator) (obj1)).hasNext())
					break label1;
	//  113  238:aload_2         
	//  114  239:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//  115  244:ifeq            312
				routeinfo1 = (MediaRouter.RouteInfo)((Iterator) (obj1)).next();
	//  116  247:aload_2         
	//  117  248:invokeinterface #402 <Method Object Iterator.next()>
	//  118  253:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  119  256:astore_3        
			} while(!isSystemLiveAudioOnlyRoute(routeinfo1) || !routeinfo1.isSelectable());
	//  120  257:aload_0         
	//  121  258:aload_3         
	//  122  259:invokespecial   #580 <Method boolean isSystemLiveAudioOnlyRoute(MediaRouter$RouteInfo)>
	//  123  262:ifeq            238
	//  124  265:aload_3         
	//  125  266:invokevirtual   #565 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//  126  269:ifeq            238
			mBluetoothRoute = routeinfo1;
	//  127  272:aload_0         
	//  128  273:aload_3         
	//  129  274:putfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
			obj1 = ((Object) (new StringBuilder()));
	//  130  277:new             #179 <Class StringBuilder>
	//  131  280:dup             
	//  132  281:invokespecial   #180 <Method void StringBuilder()>
	//  133  284:astore_2        
			((StringBuilder) (obj1)).append("Found bluetooth route: ");
	//  134  285:aload_2         
	//  135  286:ldc2            #582 <String "Found bluetooth route: ">
	//  136  289:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  137  292:pop             
			((StringBuilder) (obj1)).append(((Object) (mBluetoothRoute)));
	//  138  293:aload_2         
	//  139  294:aload_0         
	//  140  295:getfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//  141  298:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  142  301:pop             
			Log.i("MediaRouter", ((StringBuilder) (obj1)).toString());
	//  143  302:ldc1            #212 <String "MediaRouter">
	//  144  304:aload_2         
	//  145  305:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  146  308:invokestatic    #570 <Method int Log.i(String, String)>
	//  147  311:pop             
		}
		if(mSelectedRoute != null && mSelectedRoute.isSelectable())
	//* 148  312:aload_0         
	//* 149  313:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 150  316:ifnull          583
	//* 151  319:aload_0         
	//* 152  320:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 153  323:invokevirtual   #565 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//* 154  326:ifne            332
	//* 155  329:goto            583
		{
			if(flag)
	//* 156  332:iload_1         
	//* 157  333:ifeq            627
			{
				if(mSelectedRoute instanceof MediaRouter.RouteGroup)
	//* 158  336:aload_0         
	//* 159  337:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 160  340:instanceof      #421 <Class MediaRouter$RouteGroup>
	//* 161  343:ifeq            578
				{
					Object obj2 = ((Object) (((MediaRouter.RouteGroup)mSelectedRoute).getRoutes()));
	//  162  346:aload_0         
	//  163  347:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  164  350:checkcast       #421 <Class MediaRouter$RouteGroup>
	//  165  353:invokevirtual   #425 <Method List MediaRouter$RouteGroup.getRoutes()>
	//  166  356:astore_2        
					HashSet hashset = new HashSet();
	//  167  357:new             #584 <Class HashSet>
	//  168  360:dup             
	//  169  361:invokespecial   #585 <Method void HashSet()>
	//  170  364:astore_3        
					for(Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((Set) (hashset)).add(((Object) (MediaRouter.RouteInfo.access$100((MediaRouter.RouteInfo)iterator.next())))));
	//  171  365:aload_2         
	//  172  366:invokeinterface #428 <Method Iterator List.iterator()>
	//  173  371:astore          4
	//  174  373:aload           4
	//  175  375:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//  176  380:ifeq            406
	//  177  383:aload_3         
	//  178  384:aload           4
	//  179  386:invokeinterface #402 <Method Object Iterator.next()>
	//  180  391:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  181  394:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  182  397:invokeinterface #588 <Method boolean Set.add(Object)>
	//  183  402:pop             
	//* 184  403:goto            373
					Iterator iterator1 = mRouteControllerMap.entrySet().iterator();
	//  185  406:aload_0         
	//  186  407:getfield        #112 <Field Map mRouteControllerMap>
	//  187  410:invokeinterface #592 <Method Set Map.entrySet()>
	//  188  415:invokeinterface #593 <Method Iterator Set.iterator()>
	//  189  420:astore          4
					do
					{
						if(!iterator1.hasNext())
							break;
	//  190  422:aload           4
	//  191  424:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//  192  429:ifeq            492
						Object obj3 = ((Object) ((java.util.Map.Entry)iterator1.next()));
	//  193  432:aload           4
	//  194  434:invokeinterface #402 <Method Object Iterator.next()>
	//  195  439:checkcast       #595 <Class java.util.Map$Entry>
	//  196  442:astore          5
						if(!((Set) (hashset)).contains(((java.util.Map.Entry) (obj3)).getKey()))
	//* 197  444:aload_3         
	//* 198  445:aload           5
	//* 199  447:invokeinterface #598 <Method Object java.util.Map$Entry.getKey()>
	//* 200  452:invokeinterface #601 <Method boolean Set.contains(Object)>
	//* 201  457:ifne            422
						{
							obj3 = ((Object) ((ller)((java.util.Map.Entry) (obj3)).getValue()));
	//  202  460:aload           5
	//  203  462:invokeinterface #604 <Method Object java.util.Map$Entry.getValue()>
	//  204  467:checkcast       #374 <Class MediaRouteProvider$RouteController>
	//  205  470:astore          5
							((ller) (obj3)).onUnselect();
	//  206  472:aload           5
	//  207  474:invokevirtual   #606 <Method void MediaRouteProvider$RouteController.onUnselect()>
							((ller) (obj3)).onRelease();
	//  208  477:aload           5
	//  209  479:invokevirtual   #381 <Method void MediaRouteProvider$RouteController.onRelease()>
							iterator1.remove();
	//  210  482:aload           4
	//  211  484:invokeinterface #608 <Method void Iterator.remove()>
						}
					} while(true);
	//  212  489:goto            422
					obj2 = ((Object) (((List) (obj2)).iterator()));
	//  213  492:aload_2         
	//  214  493:invokeinterface #428 <Method Iterator List.iterator()>
	//  215  498:astore_2        
					do
					{
						if(!((Iterator) (obj2)).hasNext())
							break;
	//  216  499:aload_2         
	//  217  500:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//  218  505:ifeq            578
						MediaRouter.RouteInfo routeinfo2 = (MediaRouter.RouteInfo)((Iterator) (obj2)).next();
	//  219  508:aload_2         
	//  220  509:invokeinterface #402 <Method Object Iterator.next()>
	//  221  514:checkcast       #260 <Class MediaRouter$RouteInfo>
	//  222  517:astore_3        
						if(!mRouteControllerMap.containsKey(((Object) (MediaRouter.RouteInfo.access$100(routeinfo2)))))
	//* 223  518:aload_0         
	//* 224  519:getfield        #112 <Field Map mRouteControllerMap>
	//* 225  522:aload_3         
	//* 226  523:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//* 227  526:invokeinterface #611 <Method boolean Map.containsKey(Object)>
	//* 228  531:ifne            499
						{
							ller ller = routeinfo2.getProviderInstance().onCreateRouteController(MediaRouter.RouteInfo.access$100(routeinfo2), MediaRouter.RouteInfo.access$100(mSelectedRoute));
	//  229  534:aload_3         
	//  230  535:invokevirtual   #277 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//  231  538:aload_3         
	//  232  539:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  233  542:aload_0         
	//  234  543:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  235  546:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  236  549:invokevirtual   #431 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
	//  237  552:astore          4
							ller.onSelect();
	//  238  554:aload           4
	//  239  556:invokevirtual   #414 <Method void MediaRouteProvider$RouteController.onSelect()>
							mRouteControllerMap.put(((Object) (MediaRouter.RouteInfo.access$100(routeinfo2))), ((Object) (ller)));
	//  240  559:aload_0         
	//  241  560:getfield        #112 <Field Map mRouteControllerMap>
	//  242  563:aload_3         
	//  243  564:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//  244  567:aload           4
	//  245  569:invokeinterface #204 <Method Object Map.put(Object, Object)>
	//  246  574:pop             
						}
					} while(true);
	//  247  575:goto            499
				}
				updatePlaybackInfoFromSelectedRoute();
	//  248  578:aload_0         
	//  249  579:invokespecial   #301 <Method void updatePlaybackInfoFromSelectedRoute()>
				return;
	//  250  582:return          
			}
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  251  583:new             #179 <Class StringBuilder>
	//  252  586:dup             
	//  253  587:invokespecial   #180 <Method void StringBuilder()>
	//  254  590:astore_2        
			stringbuilder2.append("Unselecting the current route because it is no longer selectable: ");
	//  255  591:aload_2         
	//  256  592:ldc2            #613 <String "Unselecting the current route because it is no longer selectable: ">
	//  257  595:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  258  598:pop             
			stringbuilder2.append(((Object) (mSelectedRoute)));
	//  259  599:aload_2         
	//  260  600:aload_0         
	//  261  601:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  262  604:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  263  607:pop             
			Log.i("MediaRouter", stringbuilder2.toString());
	//  264  608:ldc1            #212 <String "MediaRouter">
	//  265  610:aload_2         
	//  266  611:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  267  614:invokestatic    #570 <Method int Log.i(String, String)>
	//  268  617:pop             
			setSelectedRouteInternal(chooseFallbackRoute(), 0);
	//  269  618:aload_0         
	//  270  619:aload_0         
	//  271  620:invokevirtual   #616 <Method MediaRouter$RouteInfo chooseFallbackRoute()>
	//  272  623:iconst_0        
	//  273  624:invokespecial   #618 <Method void setSelectedRouteInternal(MediaRouter$RouteInfo, int)>
		}
	//  274  627:return          
	}

	public void addProvider(MediaRouteProvider mediarouteprovider)
	{
		if(findProviderInfo(mediarouteprovider) < 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #622 <Method int findProviderInfo(MediaRouteProvider)>
	//*   3    5:ifge            100
		{
			MediaRouter.ProviderInfo providerinfo = new MediaRouter.ProviderInfo(mediarouteprovider);
	//    4    8:new             #167 <Class MediaRouter$ProviderInfo>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #624 <Method void MediaRouter$ProviderInfo(MediaRouteProvider)>
	//    8   16:astore_2        
			mProviders.add(((Object) (providerinfo)));
	//    9   17:aload_0         
	//   10   18:getfield        #95  <Field ArrayList mProviders>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #517 <Method boolean ArrayList.add(Object)>
	//   13   25:pop             
			if(MediaRouter.DEBUG)
	//*  14   26:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//*  15   29:ifeq            64
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #179 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #180 <Method void StringBuilder()>
	//   19   39:astore_3        
				stringbuilder.append("Provider added: ");
	//   20   40:aload_3         
	//   21   41:ldc2            #626 <String "Provider added: ">
	//   22   44:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				stringbuilder.append(((Object) (providerinfo)));
	//   24   48:aload_3         
	//   25   49:aload_2         
	//   26   50:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
				Log.d("MediaRouter", stringbuilder.toString());
	//   28   54:ldc1            #212 <String "MediaRouter">
	//   29   56:aload_3         
	//   30   57:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #366 <Method int Log.d(String, String)>
	//   32   63:pop             
			}
			mCallbackHandler.post(513, ((Object) (providerinfo)));
	//   33   64:aload_0         
	//   34   65:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   35   68:sipush          513
	//   36   71:aload_2         
	//   37   72:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			updateProviderContents(providerinfo, mediarouteprovider.getDescriptor());
	//   38   75:aload_0         
	//   39   76:aload_2         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #630 <Method MediaRouteProviderDescriptor MediaRouteProvider.getDescriptor()>
	//   42   81:invokespecial   #632 <Method void updateProviderContents(MediaRouter$ProviderInfo, MediaRouteProviderDescriptor)>
			mediarouteprovider.setCallback(((MediaRouteProvider.Callback) (mProviderCallback)));
	//   43   84:aload_1         
	//   44   85:aload_0         
	//   45   86:getfield        #107 <Field MediaRouter$GlobalMediaRouter$ProviderCallback mProviderCallback>
	//   46   89:invokevirtual   #636 <Method void MediaRouteProvider.setCallback(MediaRouteProvider$Callback)>
			mediarouteprovider.setDiscoveryRequest(mDiscoveryRequest);
	//   47   92:aload_1         
	//   48   93:aload_0         
	//   49   94:getfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//   50   97:invokevirtual   #642 <Method void MediaRouteProvider.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
		}
	//   51  100:return          
	}

	public void addRemoteControlClient(Object obj)
	{
		if(findRemoteControlClientRecord(obj) < 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #646 <Method int findRemoteControlClientRecord(Object)>
	//*   3    5:ifge            27
		{
			obj = ((Object) (new RemoteControlClientRecord(obj)));
	//    4    8:new             #30  <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #649 <Method void MediaRouter$GlobalMediaRouter$RemoteControlClientRecord(MediaRouter$GlobalMediaRouter, Object)>
	//    9   17:astore_1        
			mRemoteControlClients.add(obj);
	//   10   18:aload_0         
	//   11   19:getfield        #97  <Field ArrayList mRemoteControlClients>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #517 <Method boolean ArrayList.add(Object)>
	//   14   26:pop             
		}
	//   15   27:return          
	}

	MediaRouter.RouteInfo chooseFallbackRoute()
	{
		for(Iterator iterator = mRoutes.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field ArrayList mRoutes>
	//*   2    4:invokevirtual   #572 <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            52
		{
			MediaRouter.RouteInfo routeinfo = (MediaRouter.RouteInfo)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #402 <Method Object Iterator.next()>
	//    9   23:checkcast       #260 <Class MediaRouter$RouteInfo>
	//   10   26:astore_2        
			if(routeinfo != mDefaultRoute && isSystemLiveAudioOnlyRoute(routeinfo) && routeinfo.isSelectable())
	//*  11   27:aload_2         
	//*  12   28:aload_0         
	//*  13   29:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//*  14   32:if_acmpeq       8
	//*  15   35:aload_0         
	//*  16   36:aload_2         
	//*  17   37:invokespecial   #580 <Method boolean isSystemLiveAudioOnlyRoute(MediaRouter$RouteInfo)>
	//*  18   40:ifeq            8
	//*  19   43:aload_2         
	//*  20   44:invokevirtual   #565 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//*  21   47:ifeq            8
				return routeinfo;
	//   22   50:aload_2         
	//   23   51:areturn         
		}

		return mDefaultRoute;
	//   24   52:aload_0         
	//   25   53:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   26   56:areturn         
	}

	MediaRouter.RouteInfo getBluetoothRoute()
	{
		return mBluetoothRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//    2    4:areturn         
	}

	public ContentResolver getContentResolver()
	{
		return mApplicationContext.getContentResolver();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Context mApplicationContext>
	//    2    4:invokevirtual   #653 <Method ContentResolver Context.getContentResolver()>
	//    3    7:areturn         
	}

	MediaRouter.RouteInfo getDefaultRoute()
	{
		if(mDefaultRoute == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//*   2    4:ifnonnull       18
			throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
	//    3    7:new             #655 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #657 <String "There is no default route.  The media router has not yet been fully initialized.">
	//    6   14:invokespecial   #660 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return mDefaultRoute;
	//    8   18:aload_0         
	//    9   19:getfield        #562 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   10   22:areturn         
	}

	public Display getDisplay(int i)
	{
		return mDisplayManager.getDisplay(i);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field DisplayManagerCompat mDisplayManager>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #665 <Method Display DisplayManagerCompat.getDisplay(int)>
	//    4    8:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getMediaSessionToken()
	{
		if(mMediaSession != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//*   2    4:ifnull          15
			return mMediaSession.getToken();
	//    3    7:aload_0         
	//    4    8:getfield        #295 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//    5   11:invokevirtual   #670 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter$GlobalMediaRouter$MediaSessionRecord.getToken()>
	//    6   14:areturn         
		if(mCompatSession != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #672 <Field MediaSessionCompat mCompatSession>
	//*   9   19:ifnull          30
			return mCompatSession.getSessionToken();
	//   10   22:aload_0         
	//   11   23:getfield        #672 <Field MediaSessionCompat mCompatSession>
	//   12   26:invokevirtual   #677 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	public Context getProviderContext(String s)
	{
		if(s.equals("android"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #683 <String "android">
	//*   2    4:invokevirtual   #268 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            15
			return mApplicationContext;
	//    4   10:aload_0         
	//    5   11:getfield        #117 <Field Context mApplicationContext>
	//    6   14:areturn         
		try
		{
			s = ((String) (mApplicationContext.createPackageContext(s, 4)));
	//    7   15:aload_0         
	//    8   16:getfield        #117 <Field Context mApplicationContext>
	//    9   19:aload_1         
	//   10   20:iconst_4        
	//   11   21:invokevirtual   #687 <Method Context Context.createPackageContext(String, int)>
	//   12   24:astore_1        
		}
	//*  13   25:aload_1         
	//*  14   26:areturn         
	//*  15   27:aconst_null     
	//*  16   28:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Context) (s));
	//*  17   29:astore_1        
	//*  18   30:goto            27
	}

	List getProviders()
	{
		return ((List) (mProviders));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ArrayList mProviders>
	//    2    4:areturn         
	}

	public MediaRouter.RouteInfo getRoute(String s)
	{
		for(Iterator iterator = mRoutes.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field ArrayList mRoutes>
	//*   2    4:invokevirtual   #572 <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #399 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            40
		{
			MediaRouter.RouteInfo routeinfo = (MediaRouter.RouteInfo)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #402 <Method Object Iterator.next()>
	//    9   23:checkcast       #260 <Class MediaRouter$RouteInfo>
	//   10   26:astore_3        
			if(MediaRouter.RouteInfo.access$300(routeinfo).equals(((Object) (s))))
	//*  11   27:aload_3         
	//*  12   28:invokestatic    #264 <Method String MediaRouter$RouteInfo.access$300(MediaRouter$RouteInfo)>
	//*  13   31:aload_1         
	//*  14   32:invokevirtual   #268 <Method boolean String.equals(Object)>
	//*  15   35:ifeq            8
				return routeinfo;
	//   16   38:aload_3         
	//   17   39:areturn         
		}

		return null;
	//   18   40:aconst_null     
	//   19   41:areturn         
	}

	public MediaRouter getRouter(Context context)
	{
		int i = mRouters.size();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ArrayList mRouters>
	//    2    4:invokevirtual   #244 <Method int ArrayList.size()>
	//    3    7:istore_2        
label0:
		do
			do
			{
				i--;
	//    4    8:iload_2         
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:istore_2        
				MediaRouter mediarouter;
				if(i >= 0)
	//*   8   12:iload_2         
	//*   9   13:iflt            60
				{
					mediarouter = (MediaRouter)((WeakReference)mRouters.get(i)).get();
	//   10   16:aload_0         
	//   11   17:getfield        #86  <Field ArrayList mRouters>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   14   24:checkcast       #696 <Class WeakReference>
	//   15   27:invokevirtual   #698 <Method Object WeakReference.get()>
	//   16   30:checkcast       #10  <Class MediaRouter>
	//   17   33:astore_3        
					if(mediarouter != null)
						continue label0;
	//   18   34:aload_3         
	//   19   35:ifnonnull       50
					mRouters.remove(i);
	//   20   38:aload_0         
	//   21   39:getfield        #86  <Field ArrayList mRouters>
	//   22   42:iload_2         
	//   23   43:invokevirtual   #699 <Method Object ArrayList.remove(int)>
	//   24   46:pop             
				} else
	//*  25   47:goto            8
	//*  26   50:aload_3         
	//*  27   51:getfield        #702 <Field Context MediaRouter.mContext>
	//*  28   54:aload_1         
	//*  29   55:if_acmpne       8
	//*  30   58:aload_3         
	//*  31   59:areturn         
				{
					context = ((Context) (new MediaRouter(context, ((MediaRouter._cls1) (null)))));
	//   32   60:new             #10  <Class MediaRouter>
	//   33   63:dup             
	//   34   64:aload_1         
	//   35   65:aconst_null     
	//   36   66:invokespecial   #705 <Method void MediaRouter(Context, MediaRouter$1)>
	//   37   69:astore_1        
					mRouters.add(((Object) (new WeakReference(((Object) (context))))));
	//   38   70:aload_0         
	//   39   71:getfield        #86  <Field ArrayList mRouters>
	//   40   74:new             #696 <Class WeakReference>
	//   41   77:dup             
	//   42   78:aload_1         
	//   43   79:invokespecial   #707 <Method void WeakReference(Object)>
	//   44   82:invokevirtual   #517 <Method boolean ArrayList.add(Object)>
	//   45   85:pop             
					return ((MediaRouter) (context));
	//   46   86:aload_1         
	//   47   87:areturn         
				}
			} while(true);
		while(mediarouter.mContext != context);
		return mediarouter;
	}

	public List getRoutes()
	{
		return ((List) (mRoutes));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ArrayList mRoutes>
	//    2    4:areturn         
	}

	MediaRouter.RouteInfo getSelectedRoute()
	{
		if(mSelectedRoute == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   2    4:ifnonnull       18
			throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
	//    3    7:new             #655 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #711 <String "There is no currently selected route.  The media router has not yet been fully initialized.">
	//    6   14:invokespecial   #660 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return mSelectedRoute;
	//    8   18:aload_0         
	//    9   19:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   10   22:areturn         
	}

	public boolean isRouteAvailable(MediaRouteSelector mediarouteselector, int i)
	{
		if(mediarouteselector.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #716 <Method boolean MediaRouteSelector.isEmpty()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if((i & 2) == 0 && mLowRam)
	//*   5    9:iload_2         
	//*   6   10:iconst_2        
	//*   7   11:iand            
	//*   8   12:ifne            24
	//*   9   15:aload_0         
	//*  10   16:getfield        #143 <Field boolean mLowRam>
	//*  11   19:ifeq            24
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		int k = mRoutes.size();
	//   14   24:aload_0         
	//   15   25:getfield        #88  <Field ArrayList mRoutes>
	//   16   28:invokevirtual   #244 <Method int ArrayList.size()>
	//   17   31:istore          4
		for(int j = 0; j < k; j++)
	//*  18   33:iconst_0        
	//*  19   34:istore_3        
	//*  20   35:iload_3         
	//*  21   36:iload           4
	//*  22   38:icmpge          89
		{
			MediaRouter.RouteInfo routeinfo = (MediaRouter.RouteInfo)mRoutes.get(j);
	//   23   41:aload_0         
	//   24   42:getfield        #88  <Field ArrayList mRoutes>
	//   25   45:iload_3         
	//   26   46:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   27   49:checkcast       #260 <Class MediaRouter$RouteInfo>
	//   28   52:astore          5
			if(((i & 1) == 0 || !routeinfo.isDefaultOrBluetooth()) && routeinfo.matchesSelector(mediarouteselector))
	//*  29   54:iload_2         
	//*  30   55:iconst_1        
	//*  31   56:iand            
	//*  32   57:ifeq            71
	//*  33   60:aload           5
	//*  34   62:invokevirtual   #719 <Method boolean MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*  35   65:ifeq            71
	//*  36   68:goto            82
	//*  37   71:aload           5
	//*  38   73:aload_1         
	//*  39   74:invokevirtual   #723 <Method boolean MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//*  40   77:ifeq            82
				return true;
	//   41   80:iconst_1        
	//   42   81:ireturn         
		}

	//   43   82:iload_3         
	//   44   83:iconst_1        
	//   45   84:iadd            
	//   46   85:istore_3        
	//*  47   86:goto            35
		return false;
	//   48   89:iconst_0        
	//   49   90:ireturn         
	}

	public void onSystemRouteSelectedByDescriptorId(String s)
	{
		mCallbackHandler.removeMessages(262);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//    2    4:sipush          262
	//    3    7:invokevirtual   #727 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.removeMessages(int)>
		int i = findProviderInfo(((MediaRouteProvider) (mSystemProvider)));
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #151 <Field SystemMediaRouteProvider mSystemProvider>
	//    7   15:invokespecial   #622 <Method int findProviderInfo(MediaRouteProvider)>
	//    8   18:istore_2        
		if(i >= 0)
	//*   9   19:iload_2         
	//*  10   20:iflt            61
		{
			MediaRouter.ProviderInfo providerinfo = (MediaRouter.ProviderInfo)mProviders.get(i);
	//   11   23:aload_0         
	//   12   24:getfield        #95  <Field ArrayList mProviders>
	//   13   27:iload_2         
	//   14   28:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #167 <Class MediaRouter$ProviderInfo>
	//   16   34:astore_3        
			i = providerinfo.findRouteByDescriptorId(s);
	//   17   35:aload_3         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #499 <Method int MediaRouter$ProviderInfo.findRouteByDescriptorId(String)>
	//   20   40:istore_2        
			if(i >= 0)
	//*  21   41:iload_2         
	//*  22   42:iflt            61
				((MediaRouter.RouteInfo)MediaRouter.ProviderInfo.access$600(providerinfo).get(i)).select();
	//   23   45:aload_3         
	//   24   46:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
	//   25   49:iload_2         
	//   26   50:invokeinterface #491 <Method Object List.get(int)>
	//   27   55:checkcast       #260 <Class MediaRouter$RouteInfo>
	//   28   58:invokevirtual   #730 <Method void MediaRouter$RouteInfo.select()>
		}
	//   29   61:return          
	}

	public void removeProvider(MediaRouteProvider mediarouteprovider)
	{
		int i = findProviderInfo(mediarouteprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #622 <Method int findProviderInfo(MediaRouteProvider)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            96
		{
			mediarouteprovider.setCallback(((MediaRouteProvider.Callback) (null)));
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #636 <Method void MediaRouteProvider.setCallback(MediaRouteProvider$Callback)>
			mediarouteprovider.setDiscoveryRequest(((MediaRouteDiscoveryRequest) (null)));
	//    9   15:aload_1         
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #642 <Method void MediaRouteProvider.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
			mediarouteprovider = ((MediaRouteProvider) ((MediaRouter.ProviderInfo)mProviders.get(i)));
	//   12   20:aload_0         
	//   13   21:getfield        #95  <Field ArrayList mProviders>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #167 <Class MediaRouter$ProviderInfo>
	//   17   31:astore_1        
			updateProviderContents(((MediaRouter.ProviderInfo) (mediarouteprovider)), ((MediaRouteProviderDescriptor) (null)));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:aconst_null     
	//   21   35:invokespecial   #632 <Method void updateProviderContents(MediaRouter$ProviderInfo, MediaRouteProviderDescriptor)>
			if(MediaRouter.DEBUG)
	//*  22   38:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//*  23   41:ifeq            76
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   24   44:new             #179 <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #180 <Method void StringBuilder()>
	//   27   51:astore_3        
				stringbuilder.append("Provider removed: ");
	//   28   52:aload_3         
	//   29   53:ldc2            #733 <String "Provider removed: ">
	//   30   56:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
				stringbuilder.append(((Object) (mediarouteprovider)));
	//   32   60:aload_3         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   35   65:pop             
				Log.d("MediaRouter", stringbuilder.toString());
	//   36   66:ldc1            #212 <String "MediaRouter">
	//   37   68:aload_3         
	//   38   69:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   39   72:invokestatic    #366 <Method int Log.d(String, String)>
	//   40   75:pop             
			}
			mCallbackHandler.post(514, ((Object) (mediarouteprovider)));
	//   41   76:aload_0         
	//   42   77:getfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   43   80:sipush          514
	//   44   83:aload_1         
	//   45   84:invokevirtual   #419 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			mProviders.remove(i);
	//   46   87:aload_0         
	//   47   88:getfield        #95  <Field ArrayList mProviders>
	//   48   91:iload_2         
	//   49   92:invokevirtual   #699 <Method Object ArrayList.remove(int)>
	//   50   95:pop             
		}
	//   51   96:return          
	}

	public void removeRemoteControlClient(Object obj)
	{
		int i = findRemoteControlClientRecord(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #646 <Method int findRemoteControlClientRecord(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            24
			((RemoteControlClientRecord)mRemoteControlClients.remove(i)).disconnect();
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field ArrayList mRemoteControlClients>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #699 <Method Object ArrayList.remove(int)>
	//   10   18:checkcast       #30  <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//   11   21:invokevirtual   #737 <Method void MediaRouter$GlobalMediaRouter$RemoteControlClientRecord.disconnect()>
	//   12   24:return          
	}

	public void requestSetVolume(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(routeinfo == mSelectedRoute && mSelectedRouteController != null)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   3    5:if_acmpne       24
	//*   4    8:aload_0         
	//*   5    9:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//*   6   12:ifnull          24
		{
			mSelectedRouteController.onSetVolume(i);
	//    7   15:aload_0         
	//    8   16:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//    9   19:iload_2         
	//   10   20:invokevirtual   #741 <Method void MediaRouteProvider$RouteController.onSetVolume(int)>
			return;
	//   11   23:return          
		}
		if(!mRouteControllerMap.isEmpty())
	//*  12   24:aload_0         
	//*  13   25:getfield        #112 <Field Map mRouteControllerMap>
	//*  14   28:invokeinterface #384 <Method boolean Map.isEmpty()>
	//*  15   33:ifne            62
		{
			routeinfo = ((MediaRouter.RouteInfo) ((ller)mRouteControllerMap.get(((Object) (MediaRouter.RouteInfo.access$100(routeinfo))))));
	//   16   36:aload_0         
	//   17   37:getfield        #112 <Field Map mRouteControllerMap>
	//   18   40:aload_1         
	//   19   41:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
	//   20   44:invokeinterface #271 <Method Object Map.get(Object)>
	//   21   49:checkcast       #374 <Class MediaRouteProvider$RouteController>
	//   22   52:astore_1        
			if(routeinfo != null)
	//*  23   53:aload_1         
	//*  24   54:ifnull          62
				((ller) (routeinfo)).onSetVolume(i);
	//   25   57:aload_1         
	//   26   58:iload_2         
	//   27   59:invokevirtual   #741 <Method void MediaRouteProvider$RouteController.onSetVolume(int)>
		}
	//   28   62:return          
	}

	public void requestUpdateVolume(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(routeinfo == mSelectedRoute && mSelectedRouteController != null)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   3    5:if_acmpne       23
	//*   4    8:aload_0         
	//*   5    9:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//*   6   12:ifnull          23
			mSelectedRouteController.onUpdateVolume(i);
	//    7   15:aload_0         
	//    8   16:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//    9   19:iload_2         
	//   10   20:invokevirtual   #745 <Method void MediaRouteProvider$RouteController.onUpdateVolume(int)>
	//   11   23:return          
	}

	void selectRoute(MediaRouter.RouteInfo routeinfo)
	{
		selectRoute(routeinfo, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #749 <Method void selectRoute(MediaRouter$RouteInfo, int)>
	//    4    6:return          
	}

	void selectRoute(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(!mRoutes.contains(((Object) (routeinfo))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field ArrayList mRoutes>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #750 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #179 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #180 <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Ignoring attempt to select removed route: ");
	//    9   19:aload_3         
	//   10   20:ldc2            #752 <String "Ignoring attempt to select removed route: ">
	//   11   23:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append(((Object) (routeinfo)));
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   16   32:pop             
			Log.w("MediaRouter", stringbuilder.toString());
	//   17   33:ldc1            #212 <String "MediaRouter">
	//   18   35:aload_3         
	//   19   36:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   20   39:invokestatic    #218 <Method int Log.w(String, String)>
	//   21   42:pop             
			return;
	//   22   43:return          
		}
		if(!MediaRouter.RouteInfo.access$400(routeinfo))
	//*  23   44:aload_1         
	//*  24   45:invokestatic    #755 <Method boolean MediaRouter$RouteInfo.access$400(MediaRouter$RouteInfo)>
	//*  25   48:ifne            84
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   26   51:new             #179 <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #180 <Method void StringBuilder()>
	//   29   58:astore_3        
			stringbuilder1.append("Ignoring attempt to select disabled route: ");
	//   30   59:aload_3         
	//   31   60:ldc2            #757 <String "Ignoring attempt to select disabled route: ">
	//   32   63:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			stringbuilder1.append(((Object) (routeinfo)));
	//   34   67:aload_3         
	//   35   68:aload_1         
	//   36   69:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//   37   72:pop             
			Log.w("MediaRouter", stringbuilder1.toString());
	//   38   73:ldc1            #212 <String "MediaRouter">
	//   39   75:aload_3         
	//   40   76:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   41   79:invokestatic    #218 <Method int Log.w(String, String)>
	//   42   82:pop             
			return;
	//   43   83:return          
		} else
		{
			setSelectedRouteInternal(routeinfo, i);
	//   44   84:aload_0         
	//   45   85:aload_1         
	//   46   86:iload_2         
	//   47   87:invokespecial   #618 <Method void setSelectedRouteInternal(MediaRouter$RouteInfo, int)>
			return;
	//   48   90:return          
		}
	}

	public void sendControlRequest(MediaRouter.RouteInfo routeinfo, Intent intent, back back)
	{
		if(routeinfo == mSelectedRoute && mSelectedRouteController != null && mSelectedRouteController.onControlRequest(intent, back))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   3    5:if_acmpne       28
	//*   4    8:aload_0         
	//*   5    9:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//*   6   12:ifnull          28
	//*   7   15:aload_0         
	//*   8   16:getfield        #372 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//*   9   19:aload_2         
	//*  10   20:aload_3         
	//*  11   21:invokevirtual   #763 <Method boolean MediaRouteProvider$RouteController.onControlRequest(Intent, MediaRouter$ControlRequestCallback)>
	//*  12   24:ifeq            28
			return;
	//   13   27:return          
		if(back != null)
	//*  14   28:aload_3         
	//*  15   29:ifnull          38
			back.onError(((String) (null)), ((android.os.Bundle) (null)));
	//   16   32:aload_3         
	//   17   33:aconst_null     
	//   18   34:aconst_null     
	//   19   35:invokevirtual   #769 <Method void MediaRouter$ControlRequestCallback.onError(String, android.os.Bundle)>
	//   20   38:return          
	}

	public void setMediaSession(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
			obj = ((Object) (new MediaSessionRecord(obj)));
	//    2    4:new             #18  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #771 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter$GlobalMediaRouter, Object)>
	//    7   13:astore_1        
		else
	//*   8   14:goto            19
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		setMediaSessionRecord(((MediaSessionRecord) (obj)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #773 <Method void setMediaSessionRecord(MediaRouter$GlobalMediaRouter$MediaSessionRecord)>
	//   14   24:return          
	}

	public void setMediaSessionCompat(MediaSessionCompat mediasessioncompat)
	{
		mCompatSession = mediasessioncompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #672 <Field MediaSessionCompat mCompatSession>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #780 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          38
		{
			if(mediasessioncompat != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          30
				mediasessioncompat = ((MediaSessionCompat) (new MediaSessionRecord(mediasessioncompat)));
	//    8   17:new             #18  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #783 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter$GlobalMediaRouter, MediaSessionCompat)>
	//   13   26:astore_1        
			else
	//*  14   27:goto            32
				mediasessioncompat = null;
	//   15   30:aconst_null     
	//   16   31:astore_1        
			setMediaSessionRecord(((MediaSessionRecord) (mediasessioncompat)));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokespecial   #773 <Method void setMediaSessionRecord(MediaRouter$GlobalMediaRouter$MediaSessionRecord)>
			return;
	//   20   37:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  21   38:getstatic       #780 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   41:bipush          14
	//*  23   43:icmplt          107
		{
			if(mRccMediaSession != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #785 <Field MediaSessionCompat mRccMediaSession>
	//*  26   50:ifnull          75
			{
				removeRemoteControlClient(mRccMediaSession.getRemoteControlClient());
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:getfield        #785 <Field MediaSessionCompat mRccMediaSession>
	//   30   58:invokevirtual   #786 <Method Object MediaSessionCompat.getRemoteControlClient()>
	//   31   61:invokevirtual   #788 <Method void removeRemoteControlClient(Object)>
				mRccMediaSession.removeOnActiveChangeListener(mSessionActiveListener);
	//   32   64:aload_0         
	//   33   65:getfield        #785 <Field MediaSessionCompat mRccMediaSession>
	//   34   68:aload_0         
	//   35   69:getfield        #115 <Field android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener mSessionActiveListener>
	//   36   72:invokevirtual   #792 <Method void MediaSessionCompat.removeOnActiveChangeListener(android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener)>
			}
			mRccMediaSession = mediasessioncompat;
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:putfield        #785 <Field MediaSessionCompat mRccMediaSession>
			if(mediasessioncompat != null)
	//*  40   80:aload_1         
	//*  41   81:ifnull          107
			{
				mediasessioncompat.addOnActiveChangeListener(mSessionActiveListener);
	//   42   84:aload_1         
	//   43   85:aload_0         
	//   44   86:getfield        #115 <Field android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener mSessionActiveListener>
	//   45   89:invokevirtual   #795 <Method void MediaSessionCompat.addOnActiveChangeListener(android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener)>
				if(mediasessioncompat.isActive())
	//*  46   92:aload_1         
	//*  47   93:invokevirtual   #798 <Method boolean MediaSessionCompat.isActive()>
	//*  48   96:ifeq            107
					addRemoteControlClient(mediasessioncompat.getRemoteControlClient());
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:invokevirtual   #786 <Method Object MediaSessionCompat.getRemoteControlClient()>
	//   52  104:invokevirtual   #800 <Method void addRemoteControlClient(Object)>
			}
		}
	//   53  107:return          
	}

	public void start()
	{
		addProvider(((MediaRouteProvider) (mSystemProvider)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #151 <Field SystemMediaRouteProvider mSystemProvider>
	//    3    5:invokevirtual   #803 <Method void addProvider(MediaRouteProvider)>
		mRegisteredProviderWatcher = new RegisteredMediaRouteProviderWatcher(mApplicationContext, ((tcher.Callback) (this)));
	//    4    8:aload_0         
	//    5    9:new             #805 <Class RegisteredMediaRouteProviderWatcher>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #117 <Field Context mApplicationContext>
	//    9   17:aload_0         
	//   10   18:invokespecial   #808 <Method void RegisteredMediaRouteProviderWatcher(Context, RegisteredMediaRouteProviderWatcher$Callback)>
	//   11   21:putfield        #810 <Field RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher>
		mRegisteredProviderWatcher.start();
	//   12   24:aload_0         
	//   13   25:getfield        #810 <Field RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher>
	//   14   28:invokevirtual   #812 <Method void RegisteredMediaRouteProviderWatcher.start()>
	//   15   31:return          
	}

	public void updateDiscoveryRequest()
	{
		Object obj = ((Object) (new MediaRouteSelector.Builder()));
	//    0    0:new             #815 <Class MediaRouteSelector$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #816 <Method void MediaRouteSelector$Builder()>
	//    3    7:astore          8
		int i = mRouters.size();
	//    4    9:aload_0         
	//    5   10:getfield        #86  <Field ArrayList mRouters>
	//    6   13:invokevirtual   #244 <Method int ArrayList.size()>
	//    7   16:istore_1        
		boolean flag = false;
	//    8   17:iconst_0        
	//    9   18:istore_2        
		boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          5
		boolean flag2 = flag1;
	//   12   22:iload           5
	//   13   24:istore          6
		do
		{
			int k = i - 1;
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:isub            
	//   17   29:istore_3        
			if(k < 0)
				break;
	//   18   30:iload_3         
	//   19   31:iflt            198
			MediaRouter mediarouter = (MediaRouter)((WeakReference)mRouters.get(k)).get();
	//   20   34:aload_0         
	//   21   35:getfield        #86  <Field ArrayList mRouters>
	//   22   38:iload_3         
	//   23   39:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   24   42:checkcast       #696 <Class WeakReference>
	//   25   45:invokevirtual   #698 <Method Object WeakReference.get()>
	//   26   48:checkcast       #10  <Class MediaRouter>
	//   27   51:astore          9
			if(mediarouter == null)
	//*  28   53:aload           9
	//*  29   55:ifnonnull       72
			{
				mRouters.remove(k);
	//   30   58:aload_0         
	//   31   59:getfield        #86  <Field ArrayList mRouters>
	//   32   62:iload_3         
	//   33   63:invokevirtual   #699 <Method Object ArrayList.remove(int)>
	//   34   66:pop             
				i = k;
	//   35   67:iload_3         
	//   36   68:istore_1        
			} else
	//*  37   69:goto            26
			{
				int i1 = mediarouter.mCallbackRecords.size();
	//   38   72:aload           9
	//   39   74:getfield        #819 <Field ArrayList MediaRouter.mCallbackRecords>
	//   40   77:invokevirtual   #244 <Method int ArrayList.size()>
	//   41   80:istore          4
				for(i = 0; i < i1;)
	//*  42   82:iconst_0        
	//*  43   83:istore_1        
	//*  44   84:iload_1         
	//*  45   85:iload           4
	//*  46   87:icmpge          193
				{
					MediaRouter.CallbackRecord callbackrecord = (MediaRouter.CallbackRecord)mediarouter.mCallbackRecords.get(i);
	//   47   90:aload           9
	//   48   92:getfield        #819 <Field ArrayList MediaRouter.mCallbackRecords>
	//   49   95:iload_1         
	//   50   96:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   51   99:checkcast       #821 <Class MediaRouter$CallbackRecord>
	//   52  102:astore          10
					((MediaRouteSelector.Builder) (obj)).addSelector(callbackrecord.mSelector);
	//   53  104:aload           8
	//   54  106:aload           10
	//   55  108:getfield        #825 <Field MediaRouteSelector MediaRouter$CallbackRecord.mSelector>
	//   56  111:invokevirtual   #829 <Method MediaRouteSelector$Builder MediaRouteSelector$Builder.addSelector(MediaRouteSelector)>
	//   57  114:pop             
					boolean flag3 = flag2;
	//   58  115:iload           6
	//   59  117:istore          7
					if((callbackrecord.mFlags & 1) != 0)
	//*  60  119:aload           10
	//*  61  121:getfield        #832 <Field int MediaRouter$CallbackRecord.mFlags>
	//*  62  124:iconst_1        
	//*  63  125:iand            
	//*  64  126:ifeq            136
					{
						flag1 = true;
	//   65  129:iconst_1        
	//   66  130:istore          5
						flag3 = flag1;
	//   67  132:iload           5
	//   68  134:istore          7
					}
					flag2 = flag1;
	//   69  136:iload           5
	//   70  138:istore          6
					if((callbackrecord.mFlags & 4) != 0)
	//*  71  140:aload           10
	//*  72  142:getfield        #832 <Field int MediaRouter$CallbackRecord.mFlags>
	//*  73  145:iconst_4        
	//*  74  146:iand            
	//*  75  147:ifeq            164
					{
						flag2 = flag1;
	//   76  150:iload           5
	//   77  152:istore          6
						if(!mLowRam)
	//*  78  154:aload_0         
	//*  79  155:getfield        #143 <Field boolean mLowRam>
	//*  80  158:ifne            164
							flag2 = true;
	//   81  161:iconst_1        
	//   82  162:istore          6
					}
					flag1 = flag2;
	//   83  164:iload           6
	//   84  166:istore          5
					if((callbackrecord.mFlags & 8) != 0)
	//*  85  168:aload           10
	//*  86  170:getfield        #832 <Field int MediaRouter$CallbackRecord.mFlags>
	//*  87  173:bipush          8
	//*  88  175:iand            
	//*  89  176:ifeq            182
						flag1 = true;
	//   90  179:iconst_1        
	//   91  180:istore          5
					i++;
	//   92  182:iload_1         
	//   93  183:iconst_1        
	//   94  184:iadd            
	//   95  185:istore_1        
					flag2 = flag3;
	//   96  186:iload           7
	//   97  188:istore          6
				}

	//*  98  190:goto            84
				i = k;
	//   99  193:iload_3         
	//  100  194:istore_1        
			}
		} while(true);
	//  101  195:goto            26
		if(flag1)
	//* 102  198:iload           5
	//* 103  200:ifeq            213
			obj = ((Object) (((MediaRouteSelector.Builder) (obj)).build()));
	//  104  203:aload           8
	//  105  205:invokevirtual   #836 <Method MediaRouteSelector MediaRouteSelector$Builder.build()>
	//  106  208:astore          8
		else
	//* 107  210:goto            218
			obj = ((Object) (MediaRouteSelector.EMPTY));
	//  108  213:getstatic       #839 <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//  109  216:astore          8
		if(mDiscoveryRequest != null && mDiscoveryRequest.getSelector().equals(obj) && mDiscoveryRequest.isActiveScan() == flag2)
	//* 110  218:aload_0         
	//* 111  219:getfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//* 112  222:ifnull          253
	//* 113  225:aload_0         
	//* 114  226:getfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//* 115  229:invokevirtual   #844 <Method MediaRouteSelector MediaRouteDiscoveryRequest.getSelector()>
	//* 116  232:aload           8
	//* 117  234:invokevirtual   #845 <Method boolean MediaRouteSelector.equals(Object)>
	//* 118  237:ifeq            253
	//* 119  240:aload_0         
	//* 120  241:getfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//* 121  244:invokevirtual   #848 <Method boolean MediaRouteDiscoveryRequest.isActiveScan()>
	//* 122  247:iload           6
	//* 123  249:icmpne          253
			return;
	//  124  252:return          
		if(((MediaRouteSelector) (obj)).isEmpty() && !flag2)
	//* 125  253:aload           8
	//* 126  255:invokevirtual   #716 <Method boolean MediaRouteSelector.isEmpty()>
	//* 127  258:ifeq            282
	//* 128  261:iload           6
	//* 129  263:ifne            282
		{
			if(mDiscoveryRequest == null)
	//* 130  266:aload_0         
	//* 131  267:getfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//* 132  270:ifnonnull       274
				return;
	//  133  273:return          
			mDiscoveryRequest = null;
	//  134  274:aload_0         
	//  135  275:aconst_null     
	//  136  276:putfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
		} else
	//* 137  279:goto            297
		{
			mDiscoveryRequest = new MediaRouteDiscoveryRequest(((MediaRouteSelector) (obj)), flag2);
	//  138  282:aload_0         
	//  139  283:new             #841 <Class MediaRouteDiscoveryRequest>
	//  140  286:dup             
	//  141  287:aload           8
	//  142  289:iload           6
	//  143  291:invokespecial   #851 <Method void MediaRouteDiscoveryRequest(MediaRouteSelector, boolean)>
	//  144  294:putfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
		}
		if(MediaRouter.DEBUG)
	//* 145  297:getstatic       #356 <Field boolean MediaRouter.DEBUG>
	//* 146  300:ifeq            342
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  147  303:new             #179 <Class StringBuilder>
	//  148  306:dup             
	//  149  307:invokespecial   #180 <Method void StringBuilder()>
	//  150  310:astore          8
			stringbuilder.append("Updated discovery request: ");
	//  151  312:aload           8
	//  152  314:ldc2            #853 <String "Updated discovery request: ">
	//  153  317:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  154  320:pop             
			stringbuilder.append(((Object) (mDiscoveryRequest)));
	//  155  321:aload           8
	//  156  323:aload_0         
	//  157  324:getfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//  158  327:invokevirtual   #361 <Method StringBuilder StringBuilder.append(Object)>
	//  159  330:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//  160  331:ldc1            #212 <String "MediaRouter">
	//  161  333:aload           8
	//  162  335:invokevirtual   #189 <Method String StringBuilder.toString()>
	//  163  338:invokestatic    #366 <Method int Log.d(String, String)>
	//  164  341:pop             
		}
		if(flag1 && !flag2 && mLowRam)
	//* 165  342:iload           5
	//* 166  344:ifeq            368
	//* 167  347:iload           6
	//* 168  349:ifne            368
	//* 169  352:aload_0         
	//* 170  353:getfield        #143 <Field boolean mLowRam>
	//* 171  356:ifeq            368
			Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
	//  172  359:ldc1            #212 <String "MediaRouter">
	//  173  361:ldc2            #855 <String "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.">
	//  174  364:invokestatic    #570 <Method int Log.i(String, String)>
	//  175  367:pop             
		int l = mProviders.size();
	//  176  368:aload_0         
	//  177  369:getfield        #95  <Field ArrayList mProviders>
	//  178  372:invokevirtual   #244 <Method int ArrayList.size()>
	//  179  375:istore_3        
		for(int j = ((int) (flag)); j < l; j++)
	//* 180  376:iload_2         
	//* 181  377:istore_1        
	//* 182  378:iload_1         
	//* 183  379:iload_3         
	//* 184  380:icmpge          411
			MediaRouter.ProviderInfo.access$500((MediaRouter.ProviderInfo)mProviders.get(j)).setDiscoveryRequest(mDiscoveryRequest);
	//  185  383:aload_0         
	//  186  384:getfield        #95  <Field ArrayList mProviders>
	//  187  387:iload_1         
	//  188  388:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//  189  391:checkcast       #167 <Class MediaRouter$ProviderInfo>
	//  190  394:invokestatic    #252 <Method MediaRouteProvider MediaRouter$ProviderInfo.access$500(MediaRouter$ProviderInfo)>
	//  191  397:aload_0         
	//  192  398:getfield        #638 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//  193  401:invokevirtual   #642 <Method void MediaRouteProvider.setDiscoveryRequest(MediaRouteDiscoveryRequest)>

	//  194  404:iload_1         
	//  195  405:iconst_1        
	//  196  406:iadd            
	//  197  407:istore_1        
	//* 198  408:goto            378
	//  199  411:return          
	}

	void updateProviderDescriptor(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		int i = findProviderInfo(mediarouteprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #622 <Method int findProviderInfo(MediaRouteProvider)>
	//    3    5:istore_3        
		if(i >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            26
			updateProviderContents((MediaRouter.ProviderInfo)mProviders.get(i), mediarouteproviderdescriptor);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #95  <Field ArrayList mProviders>
	//    9   15:iload_3         
	//   10   16:invokevirtual   #248 <Method Object ArrayList.get(int)>
	//   11   19:checkcast       #167 <Class MediaRouter$ProviderInfo>
	//   12   22:aload_2         
	//   13   23:invokespecial   #632 <Method void updateProviderContents(MediaRouter$ProviderInfo, MediaRouteProviderDescriptor)>
	//   14   26:return          
	}

	final Context mApplicationContext;
	private MediaRouter.RouteInfo mBluetoothRoute;
	final CallbackHandler mCallbackHandler = new CallbackHandler();
	private MediaSessionCompat mCompatSession;
	private MediaRouter.RouteInfo mDefaultRoute;
	private MediaRouteDiscoveryRequest mDiscoveryRequest;
	private final DisplayManagerCompat mDisplayManager;
	private final boolean mLowRam;
	private MediaSessionRecord mMediaSession;
	final backInfo mPlaybackInfo = new backInfo();
	private final ProviderCallback mProviderCallback = new ProviderCallback();
	private final ArrayList mProviders = new ArrayList();
	MediaSessionCompat mRccMediaSession;
	private RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
	private final ArrayList mRemoteControlClients = new ArrayList();
	private final Map mRouteControllerMap = new HashMap();
	final ArrayList mRouters = new ArrayList();
	private final ArrayList mRoutes = new ArrayList();
	MediaRouter.RouteInfo mSelectedRoute;
	private ller mSelectedRouteController;
	private android.support.v4.media.session.ngeListener mSessionActiveListener;
	final SystemMediaRouteProvider mSystemProvider;
	private final Map mUniqueIdMap = new HashMap();


/*
	static String access$000(MediaRouter$GlobalMediaRouter mediarouter$globalmediarouter, MediaRouter.ProviderInfo providerinfo, String s)
	{
		return mediarouter$globalmediarouter.getUniqueId(providerinfo, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #158 <Method String getUniqueId(MediaRouter$ProviderInfo, String)>
	//    4    6:areturn         
	}

*/


/*
	static void access$700(MediaRouter$GlobalMediaRouter mediarouter$globalmediarouter, boolean flag)
	{
		mediarouter$globalmediarouter.updateSelectedRouteIfNeeded(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #164 <Method void updateSelectedRouteIfNeeded(boolean)>
		return;
	//    3    5:return          
	}

*/

	MediaRouter$GlobalMediaRouter(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #83  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #84  <Method void ArrayList()>
	//    6   12:putfield        #86  <Field ArrayList mRouters>
	//    7   15:aload_0         
	//    8   16:new             #83  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #84  <Method void ArrayList()>
	//   11   23:putfield        #88  <Field ArrayList mRoutes>
	//   12   26:aload_0         
	//   13   27:new             #90  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #91  <Method void HashMap()>
	//   16   34:putfield        #93  <Field Map mUniqueIdMap>
	//   17   37:aload_0         
	//   18   38:new             #83  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #84  <Method void ArrayList()>
	//   21   45:putfield        #95  <Field ArrayList mProviders>
	//   22   48:aload_0         
	//   23   49:new             #83  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #84  <Method void ArrayList()>
	//   26   56:putfield        #97  <Field ArrayList mRemoteControlClients>
	//   27   59:aload_0         
	//   28   60:new             #99  <Class RemoteControlClientCompat$PlaybackInfo>
	//   29   63:dup             
	//   30   64:invokespecial   #100 <Method void RemoteControlClientCompat$PlaybackInfo()>
	//   31   67:putfield        #102 <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   32   70:aload_0         
	//   33   71:new             #27  <Class MediaRouter$GlobalMediaRouter$ProviderCallback>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:invokespecial   #105 <Method void MediaRouter$GlobalMediaRouter$ProviderCallback(MediaRouter$GlobalMediaRouter)>
	//   37   79:putfield        #107 <Field MediaRouter$GlobalMediaRouter$ProviderCallback mProviderCallback>
	//   38   82:aload_0         
	//   39   83:new             #15  <Class MediaRouter$GlobalMediaRouter$CallbackHandler>
	//   40   86:dup             
	//   41   87:aload_0         
	//   42   88:invokespecial   #108 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler(MediaRouter$GlobalMediaRouter)>
	//   43   91:putfield        #110 <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   44   94:aload_0         
	//   45   95:new             #90  <Class HashMap>
	//   46   98:dup             
	//   47   99:invokespecial   #91  <Method void HashMap()>
	//   48  102:putfield        #112 <Field Map mRouteControllerMap>
		mSessionActiveListener = new android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener() {

			public void onActiveChanged()
			{
				if(mRccMediaSession != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
			//*   2    4:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//*   3    7:ifnull          58
				{
					if(mRccMediaSession.isActive())
			//*   4   10:aload_0         
			//*   5   11:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
			//*   6   14:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//*   7   17:invokevirtual   #32  <Method boolean MediaSessionCompat.isActive()>
			//*   8   20:ifeq            41
					{
						addRemoteControlClient(mRccMediaSession.getRemoteControlClient());
			//    9   23:aload_0         
			//   10   24:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
			//   11   27:aload_0         
			//   12   28:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
			//   13   31:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//   14   34:invokevirtual   #36  <Method Object MediaSessionCompat.getRemoteControlClient()>
			//   15   37:invokevirtual   #40  <Method void MediaRouter$GlobalMediaRouter.addRemoteControlClient(Object)>
						return;
			//   16   40:return          
					}
					removeRemoteControlClient(mRccMediaSession.getRemoteControlClient());
			//   17   41:aload_0         
			//   18   42:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
			//   19   45:aload_0         
			//   20   46:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
			//   21   49:getfield        #26  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//   22   52:invokevirtual   #36  <Method Object MediaSessionCompat.getRemoteControlClient()>
			//   23   55:invokevirtual   #43  <Method void MediaRouter$GlobalMediaRouter.removeRemoteControlClient(Object)>
				}
			//   24   58:return          
			}

			final MediaRouter.GlobalMediaRouter this$0;

			
			{
				this$0 = MediaRouter.GlobalMediaRouter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   49  105:aload_0         
	//   50  106:new             #13  <Class MediaRouter$GlobalMediaRouter$1>
	//   51  109:dup             
	//   52  110:aload_0         
	//   53  111:invokespecial   #113 <Method void MediaRouter$GlobalMediaRouter$1(MediaRouter$GlobalMediaRouter)>
	//   54  114:putfield        #115 <Field android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener mSessionActiveListener>
		mApplicationContext = context;
	//   55  117:aload_0         
	//   56  118:aload_1         
	//   57  119:putfield        #117 <Field Context mApplicationContext>
		mDisplayManager = DisplayManagerCompat.getInstance(context);
	//   58  122:aload_0         
	//   59  123:aload_1         
	//   60  124:invokestatic    #123 <Method DisplayManagerCompat DisplayManagerCompat.getInstance(Context)>
	//   61  127:putfield        #125 <Field DisplayManagerCompat mDisplayManager>
		mLowRam = ActivityManagerCompat.isLowRamDevice((ActivityManager)context.getSystemService("activity"));
	//   62  130:aload_0         
	//   63  131:aload_1         
	//   64  132:ldc1            #127 <String "activity">
	//   65  134:invokevirtual   #133 <Method Object Context.getSystemService(String)>
	//   66  137:checkcast       #135 <Class ActivityManager>
	//   67  140:invokestatic    #141 <Method boolean ActivityManagerCompat.isLowRamDevice(ActivityManager)>
	//   68  143:putfield        #143 <Field boolean mLowRam>
		mSystemProvider = SystemMediaRouteProvider.obtain(context, ((allback) (this)));
	//   69  146:aload_0         
	//   70  147:aload_1         
	//   71  148:aload_0         
	//   72  149:invokestatic    #149 <Method SystemMediaRouteProvider SystemMediaRouteProvider.obtain(Context, SystemMediaRouteProvider$SyncCallback)>
	//   73  152:putfield        #151 <Field SystemMediaRouteProvider mSystemProvider>
	//   74  155:return          
	}
}
