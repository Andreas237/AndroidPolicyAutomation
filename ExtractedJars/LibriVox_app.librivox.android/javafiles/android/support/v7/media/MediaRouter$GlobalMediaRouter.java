// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.app.ActivityManager;
import android.content.*;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.h;
import android.support.v4.b.a.a;
import android.support.v4.g.q;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ax;
import android.util.Log;
import android.view.Display;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			SystemMediaRouteProvider, MediaRouter, MediaRouteProvider, MediaRouteProviderDescriptor, 
//			MediaRouteDescriptor, MediaRouteSelector, RegisteredMediaRouteProviderWatcher, MediaRouteDiscoveryRequest

final class MediaRouter$GlobalMediaRouter
	implements tcher.Callback, allback
{

	private String assignRouteUniqueId(MediaRouter.ProviderInfo providerinfo, String s)
	{
		providerinfo = ((MediaRouter.ProviderInfo) (providerinfo.getComponentName().flattenToShortString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #136 <Method ComponentName MediaRouter$ProviderInfo.getComponentName()>
	//    2    4:invokevirtual   #142 <Method String ComponentName.flattenToShortString()>
	//    3    7:astore_1        
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #144 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #145 <Method void StringBuilder()>
	//    7   15:astore          4
		((StringBuilder) (obj)).append(((String) (providerinfo)));
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		((StringBuilder) (obj)).append(":");
	//   12   24:aload           4
	//   13   26:ldc1            #151 <String ":">
	//   14   28:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		((StringBuilder) (obj)).append(s);
	//   16   32:aload           4
	//   17   34:aload_2         
	//   18   35:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   20   39:aload           4
	//   21   41:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   22   44:astore          4
		if(findRouteByUniqueId(((String) (obj))) < 0)
	//*  23   46:aload_0         
	//*  24   47:aload           4
	//*  25   49:invokespecial   #158 <Method int findRouteByUniqueId(String)>
	//*  26   52:ifge            79
		{
			mUniqueIdMap.put(((Object) (new q(((Object) (providerinfo)), ((Object) (s))))), obj);
	//   27   55:aload_0         
	//   28   56:getfield        #64  <Field Map mUniqueIdMap>
	//   29   59:new             #160 <Class q>
	//   30   62:dup             
	//   31   63:aload_1         
	//   32   64:aload_2         
	//   33   65:invokespecial   #163 <Method void q(Object, Object)>
	//   34   68:aload           4
	//   35   70:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//   36   75:pop             
			return ((String) (obj));
	//   37   76:aload           4
	//   38   78:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   39   79:new             #144 <Class StringBuilder>
	//   40   82:dup             
	//   41   83:invokespecial   #145 <Method void StringBuilder()>
	//   42   86:astore          5
		stringbuilder.append("Either ");
	//   43   88:aload           5
	//   44   90:ldc1            #171 <String "Either ">
	//   45   92:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   46   95:pop             
		stringbuilder.append(s);
	//   47   96:aload           5
	//   48   98:aload_2         
	//   49   99:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
		stringbuilder.append(" isn't unique in ");
	//   51  103:aload           5
	//   52  105:ldc1            #173 <String " isn't unique in ">
	//   53  107:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   54  110:pop             
		stringbuilder.append(((String) (providerinfo)));
	//   55  111:aload           5
	//   56  113:aload_1         
	//   57  114:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   58  117:pop             
		stringbuilder.append(" or we're trying to assign a unique ID for an already added route");
	//   59  118:aload           5
	//   60  120:ldc1            #175 <String " or we're trying to assign a unique ID for an already added route">
	//   61  122:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   62  125:pop             
		Log.w("MediaRouter", stringbuilder.toString());
	//   63  126:ldc1            #177 <String "MediaRouter">
	//   64  128:aload           5
	//   65  130:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   66  133:invokestatic    #183 <Method int Log.w(String, String)>
	//   67  136:pop             
		int i = 2;
	//   68  137:iconst_2        
	//   69  138:istore_3        
		do
		{
			String s1 = String.format(Locale.US, "%s_%d", new Object[] {
				obj, Integer.valueOf(i)
			});
	//   70  139:getstatic       #189 <Field Locale Locale.US>
	//   71  142:ldc1            #191 <String "%s_%d">
	//   72  144:iconst_2        
	//   73  145:anewarray       Object[]
	//   74  148:dup             
	//   75  149:iconst_0        
	//   76  150:aload           4
	//   77  152:aastore         
	//   78  153:dup             
	//   79  154:iconst_1        
	//   80  155:iload_3         
	//   81  156:invokestatic    #197 <Method Integer Integer.valueOf(int)>
	//   82  159:aastore         
	//   83  160:invokestatic    #203 <Method String String.format(Locale, String, Object[])>
	//   84  163:astore          5
			if(findRouteByUniqueId(s1) < 0)
	//*  85  165:aload_0         
	//*  86  166:aload           5
	//*  87  168:invokespecial   #158 <Method int findRouteByUniqueId(String)>
	//*  88  171:ifge            198
			{
				mUniqueIdMap.put(((Object) (new q(((Object) (providerinfo)), ((Object) (s))))), ((Object) (s1)));
	//   89  174:aload_0         
	//   90  175:getfield        #64  <Field Map mUniqueIdMap>
	//   91  178:new             #160 <Class q>
	//   92  181:dup             
	//   93  182:aload_1         
	//   94  183:aload_2         
	//   95  184:invokespecial   #163 <Method void q(Object, Object)>
	//   96  187:aload           5
	//   97  189:invokeinterface #169 <Method Object Map.put(Object, Object)>
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
	//    1    1:getfield        #66  <Field ArrayList mProviders>
	//    2    4:invokevirtual   #209 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
			if(((MediaRouter.ProviderInfo)mProviders.get(i)).mProviderInstance == mediarouteprovider)
	//*   9   15:aload_0         
	//*  10   16:getfield        #66  <Field ArrayList mProviders>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #132 <Class MediaRouter$ProviderInfo>
	//*  14   26:getfield        #217 <Field MediaRouteProvider MediaRouter$ProviderInfo.mProviderInstance>
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
	//    1    1:getfield        #68  <Field ArrayList mRemoteControlClients>
	//    2    4:invokevirtual   #209 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
		{
			class RemoteControlClientRecord
				implements RemoteControlClientCompat.VolumeCallback
			{

				public void disconnect()
				{
					mDisconnected = true;
				//    0    0:aload_0         
				//    1    1:iconst_1        
				//    2    2:putfield        #44  <Field boolean mDisconnected>
					mRccCompat.setVolumeCallback(((RemoteControlClientCompat.VolumeCallback) (null)));
				//    3    5:aload_0         
				//    4    6:getfield        #33  <Field RemoteControlClientCompat mRccCompat>
				//    5    9:aconst_null     
				//    6   10:invokevirtual   #37  <Method void RemoteControlClientCompat.setVolumeCallback(RemoteControlClientCompat$VolumeCallback)>
				//    7   13:return          
				}

				public Object getRemoteControlClient()
				{
					return mRccCompat.getRemoteControlClient();
				//    0    0:aload_0         
				//    1    1:getfield        #33  <Field RemoteControlClientCompat mRccCompat>
				//    2    4:invokevirtual   #48  <Method Object RemoteControlClientCompat.getRemoteControlClient()>
				//    3    7:areturn         
				}

				public void onVolumeSetRequest(int k)
				{
					if(!mDisconnected && mSelectedRoute != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #44  <Field boolean mDisconnected>
				//*   2    4:ifne            28
				//*   3    7:aload_0         
				//*   4    8:getfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
				//*   5   11:getfield        #54  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
				//*   6   14:ifnull          28
						mSelectedRoute.requestSetVolume(k);
				//    7   17:aload_0         
				//    8   18:getfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
				//    9   21:getfield        #54  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
				//   10   24:iload_1         
				//   11   25:invokevirtual   #59  <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
				//   12   28:return          
				}

				public void onVolumeUpdateRequest(int k)
				{
					if(!mDisconnected && mSelectedRoute != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #44  <Field boolean mDisconnected>
				//*   2    4:ifne            28
				//*   3    7:aload_0         
				//*   4    8:getfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
				//*   5   11:getfield        #54  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
				//*   6   14:ifnull          28
						mSelectedRoute.requestUpdateVolume(k);
				//    7   17:aload_0         
				//    8   18:getfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
				//    9   21:getfield        #54  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
				//   10   24:iload_1         
				//   11   25:invokevirtual   #63  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
				//   12   28:return          
				}

				public void updatePlaybackInfo()
				{
					mRccCompat.setPlaybackInfo(mPlaybackInfo);
				//    0    0:aload_0         
				//    1    1:getfield        #33  <Field RemoteControlClientCompat mRccCompat>
				//    2    4:aload_0         
				//    3    5:getfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
				//    4    8:getfield        #67  <Field RemoteControlClientCompat$PlaybackInfo MediaRouter$GlobalMediaRouter.mPlaybackInfo>
				//    5   11:invokevirtual   #71  <Method void RemoteControlClientCompat.setPlaybackInfo(RemoteControlClientCompat$PlaybackInfo)>
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
			//    2    2:putfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
				mRccCompat = RemoteControlClientCompat.obtain(mApplicationContext, obj);
			//    5    9:aload_0         
			//    6   10:aload_1         
			//    7   11:getfield        #25  <Field Context MediaRouter$GlobalMediaRouter.mApplicationContext>
			//    8   14:aload_2         
			//    9   15:invokestatic    #31  <Method RemoteControlClientCompat RemoteControlClientCompat.obtain(Context, Object)>
			//   10   18:putfield        #33  <Field RemoteControlClientCompat mRccCompat>
				mRccCompat.setVolumeCallback(((RemoteControlClientCompat.VolumeCallback) (this)));
			//   11   21:aload_0         
			//   12   22:getfield        #33  <Field RemoteControlClientCompat mRccCompat>
			//   13   25:aload_0         
			//   14   26:invokevirtual   #37  <Method void RemoteControlClientCompat.setVolumeCallback(RemoteControlClientCompat$VolumeCallback)>
				updatePlaybackInfo();
			//   15   29:aload_0         
			//   16   30:invokevirtual   #40  <Method void updatePlaybackInfo()>
			//   17   33:return          
			}
			}

			if(((RemoteControlClientRecord)mRemoteControlClients.get(i)).getRemoteControlClient() == obj)
	//*   9   15:aload_0         
	//*  10   16:getfield        #68  <Field ArrayList mRemoteControlClients>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #221 <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//*  14   26:invokevirtual   #225 <Method Object MediaRouter$GlobalMediaRouter$RemoteControlClientRecord.getRemoteControlClient()>
	//*  15   29:aload_1         
	//*  16   30:if_acmpne       35
				return i;
	//   17   33:iload_2         
	//   18   34:ireturn         
		}

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
	//    1    1:getfield        #59  <Field ArrayList mRoutes>
	//    2    4:invokevirtual   #209 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          45
			if(((MediaRouter.RouteInfo)mRoutes.get(i)).mUniqueId.equals(((Object) (s))))
	//*   9   15:aload_0         
	//*  10   16:getfield        #59  <Field ArrayList mRoutes>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #227 <Class MediaRouter$RouteInfo>
	//*  14   26:getfield        #231 <Field String MediaRouter$RouteInfo.mUniqueId>
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #235 <Method boolean String.equals(Object)>
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

	private boolean isSystemDefaultRoute(MediaRouter.RouteInfo routeinfo)
	{
		return routeinfo.getProviderInstance() == mSystemProvider && routeinfo.mDescriptorId.equals("DEFAULT_ROUTE");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//    2    4:aload_0         
	//    3    5:getfield        #127 <Field SystemMediaRouteProvider mSystemProvider>
	//    4    8:if_acmpne       25
	//    5   11:aload_1         
	//    6   12:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//    7   15:ldc1            #246 <String "DEFAULT_ROUTE">
	//    8   17:invokevirtual   #235 <Method boolean String.equals(Object)>
	//    9   20:ifeq            25
	//   10   23:iconst_1        
	//   11   24:ireturn         
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	private boolean isSystemLiveAudioOnlyRoute(MediaRouter.RouteInfo routeinfo)
	{
		return routeinfo.getProviderInstance() == mSystemProvider && routeinfo.supportsControlCategory("android.media.intent.category.LIVE_AUDIO") && !routeinfo.supportsControlCategory("android.media.intent.category.LIVE_VIDEO");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//    2    4:aload_0         
	//    3    5:getfield        #127 <Field SystemMediaRouteProvider mSystemProvider>
	//    4    8:if_acmpne       31
	//    5   11:aload_1         
	//    6   12:ldc1            #249 <String "android.media.intent.category.LIVE_AUDIO">
	//    7   14:invokevirtual   #253 <Method boolean MediaRouter$RouteInfo.supportsControlCategory(String)>
	//    8   17:ifeq            31
	//    9   20:aload_1         
	//   10   21:ldc1            #255 <String "android.media.intent.category.LIVE_VIDEO">
	//   11   23:invokevirtual   #253 <Method boolean MediaRouter$RouteInfo.supportsControlCategory(String)>
	//   12   26:ifne            31
	//   13   29:iconst_1        
	//   14   30:ireturn         
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	private void setMediaSessionRecord(MediaSessionRecord mediasessionrecord)
	{
		MediaSessionRecord mediasessionrecord1 = mMediaSession;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//    2    4:astore_2        
		class MediaSessionRecord
		{

			public void clearVolumeHandling()
			{
				MediaSessionCompat mediasessioncompat = mMsCompat;
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field MediaSessionCompat mMsCompat>
			//    2    4:astore_1        
				if(mediasessioncompat != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          28
				{
					mediasessioncompat.b(mPlaybackInfo.playbackStream);
			//    5    9:aload_1         
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
			//    8   14:getfield        #43  <Field RemoteControlClientCompat$PlaybackInfo MediaRouter$GlobalMediaRouter.mPlaybackInfo>
			//    9   17:getfield        #48  <Field int RemoteControlClientCompat$PlaybackInfo.playbackStream>
			//   10   20:invokevirtual   #52  <Method void MediaSessionCompat.b(int)>
					mVpCompat = null;
			//   11   23:aload_0         
			//   12   24:aconst_null     
			//   13   25:putfield        #54  <Field cw mVpCompat>
				}
			//   14   28:return          
			}

			public void configureVolume(int i, int j, int k)
			{
				if(mMsCompat != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field MediaSessionCompat mMsCompat>
			//*   2    4:ifnull          67
				{
					cw cw1 = mVpCompat;
			//    3    7:aload_0         
			//    4    8:getfield        #54  <Field cw mVpCompat>
			//    5   11:astore          4
					if(cw1 != null && i == mControlType && j == mMaxVolume)
			//*   6   13:aload           4
			//*   7   15:ifnull          41
			//*   8   18:iload_1         
			//*   9   19:aload_0         
			//*  10   20:getfield        #58  <Field int mControlType>
			//*  11   23:icmpne          41
			//*  12   26:iload_2         
			//*  13   27:aload_0         
			//*  14   28:getfield        #60  <Field int mMaxVolume>
			//*  15   31:icmpne          41
					{
						cw1.setCurrentVolume(k);
			//   16   34:aload           4
			//   17   36:iload_3         
			//   18   37:invokevirtual   #65  <Method void cw.setCurrentVolume(int)>
						return;
			//   19   40:return          
					}
					class _cls1 extends cw
					{

						public void onAdjustVolume(final int direction)
						{
							class _cls2
								implements Runnable
							{

								public void run()
								{
									if(mSelectedRoute != null)
								//*   0    0:aload_0         
								//*   1    1:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
								//*   2    4:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
								//*   3    7:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
								//*   4   10:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
								//*   5   13:ifnull          36
										mSelectedRoute.requestUpdateVolume(direction);
								//    6   16:aload_0         
								//    7   17:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
								//    8   20:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
								//    9   23:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
								//   10   26:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
								//   11   29:aload_0         
								//   12   30:getfield        #16  <Field int val$direction>
								//   13   33:invokevirtual   #45  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
								//   14   36:return          
								}

								final _cls1 this$2;
								final int val$direction;

									_cls2()
									{
										this$2 = _cls1.this;
									//    0    0:aload_0         
									//    1    1:aload_1         
									//    2    2:putfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
										direction = i;
									//    3    5:aload_0         
									//    4    6:iload_2         
									//    5    7:putfield        #16  <Field int val$direction>
										super();
									//    6   10:aload_0         
									//    7   11:invokespecial   #19  <Method void Object()>
									//    8   14:return          
									}
							}

							mCallbackHandler.post(((Runnable) (new _cls2())));
						//    0    0:aload_0         
						//    1    1:getfield        #10  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
						//    2    4:getfield        #22  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
						//    3    7:getfield        #28  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
						//    4   10:new             #30  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2>
						//    5   13:dup             
						//    6   14:aload_0         
						//    7   15:iload_1         
						//    8   16:invokespecial   #33  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
						//    9   19:invokevirtual   #39  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
						//   10   22:pop             
						//   11   23:return          
						}

						public void onSetVolumeTo(final int volume)
						{
							class _cls1
								implements Runnable
							{

								public void run()
								{
									if(mSelectedRoute != null)
								//*   0    0:aload_0         
								//*   1    1:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
								//*   2    4:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
								//*   3    7:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
								//*   4   10:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
								//*   5   13:ifnull          36
										mSelectedRoute.requestSetVolume(volume);
								//    6   16:aload_0         
								//    7   17:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
								//    8   20:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
								//    9   23:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
								//   10   26:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
								//   11   29:aload_0         
								//   12   30:getfield        #16  <Field int val$volume>
								//   13   33:invokevirtual   #45  <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
								//   14   36:return          
								}

								final _cls1 this$2;
								final int val$volume;

									_cls1()
									{
										this$2 = _cls1.this;
									//    0    0:aload_0         
									//    1    1:aload_1         
									//    2    2:putfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
										volume = i;
									//    3    5:aload_0         
									//    4    6:iload_2         
									//    5    7:putfield        #16  <Field int val$volume>
										super();
									//    6   10:aload_0         
									//    7   11:invokespecial   #19  <Method void Object()>
									//    8   14:return          
									}
							}

							mCallbackHandler.post(((Runnable) (new _cls1())));
						//    0    0:aload_0         
						//    1    1:getfield        #10  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
						//    2    4:getfield        #22  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
						//    3    7:getfield        #28  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
						//    4   10:new             #42  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1>
						//    5   13:dup             
						//    6   14:aload_0         
						//    7   15:iload_1         
						//    8   16:invokespecial   #43  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
						//    9   19:invokevirtual   #39  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
						//   10   22:pop             
						//   11   23:return          
						}

						final MediaSessionRecord this$1;

						_cls1(int i, int j, int k)
						{
							this$1 = MediaSessionRecord.this;
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:putfield        #10  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
							super(i, j, k);
						//    3    5:aload_0         
						//    4    6:iload_2         
						//    5    7:iload_3         
						//    6    8:iload           4
						//    7   10:invokespecial   #13  <Method void cw(int, int, int)>
						//    8   13:return          
						}
					}

					mVpCompat = ((cw) (new _cls1(i, j, k)));
			//   20   41:aload_0         
			//   21   42:new             #67  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1>
			//   22   45:dup             
			//   23   46:aload_0         
			//   24   47:iload_1         
			//   25   48:iload_2         
			//   26   49:iload_3         
			//   27   50:invokespecial   #70  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord, int, int, int)>
			//   28   53:putfield        #54  <Field cw mVpCompat>
					mMsCompat.a(mVpCompat);
			//   29   56:aload_0         
			//   30   57:getfield        #22  <Field MediaSessionCompat mMsCompat>
			//   31   60:aload_0         
			//   32   61:getfield        #54  <Field cw mVpCompat>
			//   33   64:invokevirtual   #73  <Method void MediaSessionCompat.a(cw)>
				}
			//   34   67:return          
			}

			public android.support.v4.media.session.MediaSessionCompat.Token getToken()
			{
				MediaSessionCompat mediasessioncompat = mMsCompat;
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field MediaSessionCompat mMsCompat>
			//    2    4:astore_1        
				if(mediasessioncompat != null)
			//*   3    5:aload_1         
			//*   4    6:ifnull          14
					return mediasessioncompat.c();
			//    5    9:aload_1         
			//    6   10:invokevirtual   #78  <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.c()>
			//    7   13:areturn         
				else
					return null;
			//    8   14:aconst_null     
			//    9   15:areturn         
			}

			private int mControlType;
			private int mMaxVolume;
			private final MediaSessionCompat mMsCompat;
			private cw mVpCompat;
			final MediaRouter.GlobalMediaRouter this$0;

			MediaSessionRecord(MediaSessionCompat mediasessioncompat)
			{
				this$0 = MediaRouter.GlobalMediaRouter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
				mMsCompat = mediasessioncompat;
			//    5    9:aload_0         
			//    6   10:aload_2         
			//    7   11:putfield        #22  <Field MediaSessionCompat mMsCompat>
			//    8   14:return          
			}

			MediaSessionRecord(Object obj)
			{
				this(MediaSessionCompat.a(mApplicationContext, obj));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_1         
			//    3    3:getfield        #30  <Field Context MediaRouter$GlobalMediaRouter.mApplicationContext>
			//    4    6:aload_2         
			//    5    7:invokestatic    #36  <Method MediaSessionCompat MediaSessionCompat.a(Context, Object)>
			//    6   10:invokespecial   #38  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter$GlobalMediaRouter, MediaSessionCompat)>
			//    7   13:return          
			}
		}

		if(mediasessionrecord1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			mediasessionrecord1.clearVolumeHandling();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #264 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.clearVolumeHandling()>
		mMediaSession = mediasessionrecord;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #259 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
		if(mediasessionrecord != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          26
			updatePlaybackInfoFromSelectedRoute();
	//   12   22:aload_0         
	//   13   23:invokespecial   #267 <Method void updatePlaybackInfoFromSelectedRoute()>
	//   14   26:return          
	}

	private void setSelectedRouteInternal(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(MediaRouter.sGlobal == null || mBluetoothRoute != null && routeinfo.isDefault())
	//*   0    0:getstatic       #275 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//*   1    3:ifnull          20
	//*   2    6:aload_0         
	//*   3    7:getfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//*   4   10:ifnull          251
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #281 <Method boolean MediaRouter$RouteInfo.isDefault()>
	//*   7   17:ifeq            251
		{
			StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
	//    8   20:invokestatic    #287 <Method Thread Thread.currentThread()>
	//    9   23:invokevirtual   #291 <Method StackTraceElement[] Thread.getStackTrace()>
	//   10   26:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   11   28:new             #144 <Class StringBuilder>
	//   12   31:dup             
	//   13   32:invokespecial   #145 <Method void StringBuilder()>
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
	//   27   56:invokevirtual   #296 <Method String StackTraceElement.getClassName()>
	//   28   59:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
				stringbuilder.append(".");
	//   30   63:aload           4
	//   31   65:ldc2            #298 <String ".">
	//   32   68:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
				stringbuilder.append(stacktraceelement.getMethodName());
	//   34   72:aload           4
	//   35   74:aload           6
	//   36   76:invokevirtual   #301 <Method String StackTraceElement.getMethodName()>
	//   37   79:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:pop             
				stringbuilder.append(":");
	//   39   83:aload           4
	//   40   85:ldc1            #151 <String ":">
	//   41   87:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   42   90:pop             
				stringbuilder.append(stacktraceelement.getLineNumber());
	//   43   91:aload           4
	//   44   93:aload           6
	//   45   95:invokevirtual   #304 <Method int StackTraceElement.getLineNumber()>
	//   46   98:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//   47  101:pop             
				stringbuilder.append("  ");
	//   48  102:aload           4
	//   49  104:ldc2            #309 <String "  ">
	//   50  107:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   51  110:pop             
			}

	//   52  111:iload_3         
	//   53  112:iconst_1        
	//   54  113:iadd            
	//   55  114:istore_3        
	//*  56  115:goto            39
			if(MediaRouter.sGlobal == null)
	//*  57  118:getstatic       #275 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//*  58  121:ifnonnull       189
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   59  124:new             #144 <Class StringBuilder>
	//   60  127:dup             
	//   61  128:invokespecial   #145 <Method void StringBuilder()>
	//   62  131:astore          5
				stringbuilder2.append("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
	//   63  133:aload           5
	//   64  135:ldc2            #311 <String "setSelectedRouteInternal is called while sGlobal is null: pkgName=">
	//   65  138:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   66  141:pop             
				stringbuilder2.append(mApplicationContext.getPackageName());
	//   67  142:aload           5
	//   68  144:aload_0         
	//   69  145:getfield        #94  <Field Context mApplicationContext>
	//   70  148:invokevirtual   #314 <Method String Context.getPackageName()>
	//   71  151:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   72  154:pop             
				stringbuilder2.append(", callers=");
	//   73  155:aload           5
	//   74  157:ldc2            #316 <String ", callers=">
	//   75  160:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   76  163:pop             
				stringbuilder2.append(stringbuilder.toString());
	//   77  164:aload           5
	//   78  166:aload           4
	//   79  168:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   80  171:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   81  174:pop             
				Log.w("MediaRouter", stringbuilder2.toString());
	//   82  175:ldc1            #177 <String "MediaRouter">
	//   83  177:aload           5
	//   84  179:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   85  182:invokestatic    #183 <Method int Log.w(String, String)>
	//   86  185:pop             
			} else
	//*  87  186:goto            251
			{
				StringBuilder stringbuilder3 = new StringBuilder();
	//   88  189:new             #144 <Class StringBuilder>
	//   89  192:dup             
	//   90  193:invokespecial   #145 <Method void StringBuilder()>
	//   91  196:astore          5
				stringbuilder3.append("Default route is selected while a BT route is available: pkgName=");
	//   92  198:aload           5
	//   93  200:ldc2            #318 <String "Default route is selected while a BT route is available: pkgName=">
	//   94  203:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   95  206:pop             
				stringbuilder3.append(mApplicationContext.getPackageName());
	//   96  207:aload           5
	//   97  209:aload_0         
	//   98  210:getfield        #94  <Field Context mApplicationContext>
	//   99  213:invokevirtual   #314 <Method String Context.getPackageName()>
	//  100  216:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  101  219:pop             
				stringbuilder3.append(", callers=");
	//  102  220:aload           5
	//  103  222:ldc2            #316 <String ", callers=">
	//  104  225:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  105  228:pop             
				stringbuilder3.append(stringbuilder.toString());
	//  106  229:aload           5
	//  107  231:aload           4
	//  108  233:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  109  236:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  110  239:pop             
				Log.w("MediaRouter", stringbuilder3.toString());
	//  111  240:ldc1            #177 <String "MediaRouter">
	//  112  242:aload           5
	//  113  244:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  114  247:invokestatic    #183 <Method int Log.w(String, String)>
	//  115  250:pop             
			}
		}
		MediaRouter.RouteInfo routeinfo1 = mSelectedRoute;
	//  116  251:aload_0         
	//  117  252:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  118  255:astore          4
		if(routeinfo1 != routeinfo)
	//* 119  257:aload           4
	//* 120  259:aload_1         
	//* 121  260:if_acmpeq       641
		{
			if(routeinfo1 != null)
	//* 122  263:aload           4
	//* 123  265:ifnull          446
			{
				if(MediaRouter.DEBUG)
	//* 124  268:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//* 125  271:ifeq            329
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//  126  274:new             #144 <Class StringBuilder>
	//  127  277:dup             
	//  128  278:invokespecial   #145 <Method void StringBuilder()>
	//  129  281:astore          4
					stringbuilder1.append("Route unselected: ");
	//  130  283:aload           4
	//  131  285:ldc2            #325 <String "Route unselected: ">
	//  132  288:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  133  291:pop             
					stringbuilder1.append(((Object) (mSelectedRoute)));
	//  134  292:aload           4
	//  135  294:aload_0         
	//  136  295:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  137  298:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  138  301:pop             
					stringbuilder1.append(" reason: ");
	//  139  302:aload           4
	//  140  304:ldc2            #330 <String " reason: ">
	//  141  307:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  142  310:pop             
					stringbuilder1.append(i);
	//  143  311:aload           4
	//  144  313:iload_2         
	//  145  314:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
	//  146  317:pop             
					Log.d("MediaRouter", stringbuilder1.toString());
	//  147  318:ldc1            #177 <String "MediaRouter">
	//  148  320:aload           4
	//  149  322:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  150  325:invokestatic    #333 <Method int Log.d(String, String)>
	//  151  328:pop             
				}
				mCallbackHandler.post(263, ((Object) (mSelectedRoute)), i);
	//  152  329:aload_0         
	//  153  330:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  154  333:sipush          263
	//  155  336:aload_0         
	//  156  337:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  157  340:iload_2         
	//  158  341:invokevirtual   #337 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object, int)>
				ller ller = mSelectedRouteController;
	//  159  344:aload_0         
	//  160  345:getfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//  161  348:astore          4
				if(ller != null)
	//* 162  350:aload           4
	//* 163  352:ifnull          373
				{
					ller.onUnselect(i);
	//  164  355:aload           4
	//  165  357:iload_2         
	//  166  358:invokevirtual   #345 <Method void MediaRouteProvider$RouteController.onUnselect(int)>
					mSelectedRouteController.onRelease();
	//  167  361:aload_0         
	//  168  362:getfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//  169  365:invokevirtual   #348 <Method void MediaRouteProvider$RouteController.onRelease()>
					mSelectedRouteController = null;
	//  170  368:aload_0         
	//  171  369:aconst_null     
	//  172  370:putfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
				}
				if(!mRouteControllerMap.isEmpty())
	//* 173  373:aload_0         
	//* 174  374:getfield        #87  <Field Map mRouteControllerMap>
	//* 175  377:invokeinterface #351 <Method boolean Map.isEmpty()>
	//* 176  382:ifne            446
				{
					ller ller1;
					for(Iterator iterator = mRouteControllerMap.values().iterator(); iterator.hasNext(); ller1.onRelease())
	//* 177  385:aload_0         
	//* 178  386:getfield        #87  <Field Map mRouteControllerMap>
	//* 179  389:invokeinterface #355 <Method Collection Map.values()>
	//* 180  394:invokeinterface #361 <Method Iterator Collection.iterator()>
	//* 181  399:astore          4
	//* 182  401:aload           4
	//* 183  403:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//* 184  408:ifeq            437
					{
						ller1 = (ller)iterator.next();
	//  185  411:aload           4
	//  186  413:invokeinterface #369 <Method Object Iterator.next()>
	//  187  418:checkcast       #341 <Class MediaRouteProvider$RouteController>
	//  188  421:astore          5
						ller1.onUnselect(i);
	//  189  423:aload           5
	//  190  425:iload_2         
	//  191  426:invokevirtual   #345 <Method void MediaRouteProvider$RouteController.onUnselect(int)>
					}

	//  192  429:aload           5
	//  193  431:invokevirtual   #348 <Method void MediaRouteProvider$RouteController.onRelease()>
	//* 194  434:goto            401
					mRouteControllerMap.clear();
	//  195  437:aload_0         
	//  196  438:getfield        #87  <Field Map mRouteControllerMap>
	//  197  441:invokeinterface #372 <Method void Map.clear()>
				}
			}
			mSelectedRoute = routeinfo;
	//  198  446:aload_0         
	//  199  447:aload_1         
	//  200  448:putfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
			mSelectedRouteController = routeinfo.getProviderInstance().onCreateRouteController(routeinfo.mDescriptorId);
	//  201  451:aload_0         
	//  202  452:aload_1         
	//  203  453:invokevirtual   #241 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//  204  456:aload_1         
	//  205  457:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  206  460:invokevirtual   #378 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String)>
	//  207  463:putfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
			routeinfo = ((MediaRouter.RouteInfo) (mSelectedRouteController));
	//  208  466:aload_0         
	//  209  467:getfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//  210  470:astore_1        
			if(routeinfo != null)
	//* 211  471:aload_1         
	//* 212  472:ifnull          479
				((ller) (routeinfo)).onSelect();
	//  213  475:aload_1         
	//  214  476:invokevirtual   #381 <Method void MediaRouteProvider$RouteController.onSelect()>
			if(MediaRouter.DEBUG)
	//* 215  479:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//* 216  482:ifeq            520
			{
				routeinfo = ((MediaRouter.RouteInfo) (new StringBuilder()));
	//  217  485:new             #144 <Class StringBuilder>
	//  218  488:dup             
	//  219  489:invokespecial   #145 <Method void StringBuilder()>
	//  220  492:astore_1        
				((StringBuilder) (routeinfo)).append("Route selected: ");
	//  221  493:aload_1         
	//  222  494:ldc2            #383 <String "Route selected: ">
	//  223  497:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  224  500:pop             
				((StringBuilder) (routeinfo)).append(((Object) (mSelectedRoute)));
	//  225  501:aload_1         
	//  226  502:aload_0         
	//  227  503:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  228  506:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  229  509:pop             
				Log.d("MediaRouter", ((StringBuilder) (routeinfo)).toString());
	//  230  510:ldc1            #177 <String "MediaRouter">
	//  231  512:aload_1         
	//  232  513:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  233  516:invokestatic    #333 <Method int Log.d(String, String)>
	//  234  519:pop             
			}
			mCallbackHandler.post(262, ((Object) (mSelectedRoute)));
	//  235  520:aload_0         
	//  236  521:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  237  524:sipush          262
	//  238  527:aload_0         
	//  239  528:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  240  531:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			routeinfo = mSelectedRoute;
	//  241  534:aload_0         
	//  242  535:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  243  538:astore_1        
			if(routeinfo instanceof MediaRouter.RouteGroup)
	//* 244  539:aload_1         
	//* 245  540:instanceof      #388 <Class MediaRouter$RouteGroup>
	//* 246  543:ifeq            637
			{
				routeinfo = ((MediaRouter.RouteInfo) (((MediaRouter.RouteGroup)routeinfo).getRoutes()));
	//  247  546:aload_1         
	//  248  547:checkcast       #388 <Class MediaRouter$RouteGroup>
	//  249  550:invokevirtual   #392 <Method List MediaRouter$RouteGroup.getRoutes()>
	//  250  553:astore_1        
				mRouteControllerMap.clear();
	//  251  554:aload_0         
	//  252  555:getfield        #87  <Field Map mRouteControllerMap>
	//  253  558:invokeinterface #372 <Method void Map.clear()>
				MediaRouter.RouteInfo routeinfo2;
				ller ller2;
				for(routeinfo = ((MediaRouter.RouteInfo) (((List) (routeinfo)).iterator())); ((Iterator) (routeinfo)).hasNext(); mRouteControllerMap.put(((Object) (routeinfo2.mDescriptorId)), ((Object) (ller2))))
	//* 254  563:aload_1         
	//* 255  564:invokeinterface #395 <Method Iterator List.iterator()>
	//* 256  569:astore_1        
	//* 257  570:aload_1         
	//* 258  571:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//* 259  576:ifeq            637
				{
					routeinfo2 = (MediaRouter.RouteInfo)((Iterator) (routeinfo)).next();
	//  260  579:aload_1         
	//  261  580:invokeinterface #369 <Method Object Iterator.next()>
	//  262  585:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  263  588:astore          4
					ller2 = routeinfo2.getProviderInstance().onCreateRouteController(routeinfo2.mDescriptorId, mSelectedRoute.mDescriptorId);
	//  264  590:aload           4
	//  265  592:invokevirtual   #241 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//  266  595:aload           4
	//  267  597:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  268  600:aload_0         
	//  269  601:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  270  604:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  271  607:invokevirtual   #398 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
	//  272  610:astore          5
					ller2.onSelect();
	//  273  612:aload           5
	//  274  614:invokevirtual   #381 <Method void MediaRouteProvider$RouteController.onSelect()>
				}

	//  275  617:aload_0         
	//  276  618:getfield        #87  <Field Map mRouteControllerMap>
	//  277  621:aload           4
	//  278  623:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  279  626:aload           5
	//  280  628:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//  281  633:pop             
			}
	//* 282  634:goto            570
			updatePlaybackInfoFromSelectedRoute();
	//  283  637:aload_0         
	//  284  638:invokespecial   #267 <Method void updatePlaybackInfoFromSelectedRoute()>
		}
	//  285  641:return          
	}

	private void updatePlaybackInfoFromSelectedRoute()
	{
		MediaRouter.RouteInfo routeinfo = mSelectedRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//    2    4:astore          4
		if(routeinfo != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          195
		{
			mPlaybackInfo.volume = routeinfo.getVolume();
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//    7   15:aload           4
	//    8   17:invokevirtual   #401 <Method int MediaRouter$RouteInfo.getVolume()>
	//    9   20:putfield        #405 <Field int RemoteControlClientCompat$PlaybackInfo.volume>
			mPlaybackInfo.volumeMax = mSelectedRoute.getVolumeMax();
	//   10   23:aload_0         
	//   11   24:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   12   27:aload_0         
	//   13   28:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   14   31:invokevirtual   #408 <Method int MediaRouter$RouteInfo.getVolumeMax()>
	//   15   34:putfield        #411 <Field int RemoteControlClientCompat$PlaybackInfo.volumeMax>
			mPlaybackInfo.volumeHandling = mSelectedRoute.getVolumeHandling();
	//   16   37:aload_0         
	//   17   38:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   18   41:aload_0         
	//   19   42:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   20   45:invokevirtual   #414 <Method int MediaRouter$RouteInfo.getVolumeHandling()>
	//   21   48:putfield        #417 <Field int RemoteControlClientCompat$PlaybackInfo.volumeHandling>
			mPlaybackInfo.playbackStream = mSelectedRoute.getPlaybackStream();
	//   22   51:aload_0         
	//   23   52:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   24   55:aload_0         
	//   25   56:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   26   59:invokevirtual   #420 <Method int MediaRouter$RouteInfo.getPlaybackStream()>
	//   27   62:putfield        #423 <Field int RemoteControlClientCompat$PlaybackInfo.playbackStream>
			mPlaybackInfo.playbackType = mSelectedRoute.getPlaybackType();
	//   28   65:aload_0         
	//   29   66:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   30   69:aload_0         
	//   31   70:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//   32   73:invokevirtual   #426 <Method int MediaRouter$RouteInfo.getPlaybackType()>
	//   33   76:putfield        #429 <Field int RemoteControlClientCompat$PlaybackInfo.playbackType>
			int j = mRemoteControlClients.size();
	//   34   79:aload_0         
	//   35   80:getfield        #68  <Field ArrayList mRemoteControlClients>
	//   36   83:invokevirtual   #209 <Method int ArrayList.size()>
	//   37   86:istore_3        
			boolean flag = false;
	//   38   87:iconst_0        
	//   39   88:istore_2        
			for(int i = 0; i < j; i++)
	//*  40   89:iconst_0        
	//*  41   90:istore_1        
	//*  42   91:iload_1         
	//*  43   92:iload_3         
	//*  44   93:icmpge          117
				((RemoteControlClientRecord)mRemoteControlClients.get(i)).updatePlaybackInfo();
	//   45   96:aload_0         
	//   46   97:getfield        #68  <Field ArrayList mRemoteControlClients>
	//   47  100:iload_1         
	//   48  101:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   49  104:checkcast       #221 <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//   50  107:invokevirtual   #432 <Method void MediaRouter$GlobalMediaRouter$RemoteControlClientRecord.updatePlaybackInfo()>

	//   51  110:iload_1         
	//   52  111:iconst_1        
	//   53  112:iadd            
	//   54  113:istore_1        
	//*  55  114:goto            91
			if(mMediaSession != null)
	//*  56  117:aload_0         
	//*  57  118:getfield        #259 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//*  58  121:ifnull          211
				if(mSelectedRoute != getDefaultRoute() && mSelectedRoute != getBluetoothRoute())
	//*  59  124:aload_0         
	//*  60  125:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*  61  128:aload_0         
	//*  62  129:invokevirtual   #436 <Method MediaRouter$RouteInfo getDefaultRoute()>
	//*  63  132:if_acmpeq       187
	//*  64  135:aload_0         
	//*  65  136:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*  66  139:aload_0         
	//*  67  140:invokevirtual   #439 <Method MediaRouter$RouteInfo getBluetoothRoute()>
	//*  68  143:if_acmpne       149
	//*  69  146:goto            187
				{
					byte byte0 = ((byte) (flag));
	//   70  149:iload_2         
	//   71  150:istore_1        
					if(mPlaybackInfo.volumeHandling == 1)
	//*  72  151:aload_0         
	//*  73  152:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//*  74  155:getfield        #417 <Field int RemoteControlClientCompat$PlaybackInfo.volumeHandling>
	//*  75  158:iconst_1        
	//*  76  159:icmpne          164
						byte0 = 2;
	//   77  162:iconst_2        
	//   78  163:istore_1        
					mMediaSession.configureVolume(((int) (byte0)), mPlaybackInfo.volumeMax, mPlaybackInfo.volume);
	//   79  164:aload_0         
	//   80  165:getfield        #259 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//   81  168:iload_1         
	//   82  169:aload_0         
	//   83  170:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   84  173:getfield        #411 <Field int RemoteControlClientCompat$PlaybackInfo.volumeMax>
	//   85  176:aload_0         
	//   86  177:getfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
	//   87  180:getfield        #405 <Field int RemoteControlClientCompat$PlaybackInfo.volume>
	//   88  183:invokevirtual   #443 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.configureVolume(int, int, int)>
					return;
	//   89  186:return          
				} else
				{
					mMediaSession.clearVolumeHandling();
	//   90  187:aload_0         
	//   91  188:getfield        #259 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//   92  191:invokevirtual   #264 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.clearVolumeHandling()>
					return;
	//   93  194:return          
				}
		} else
		{
			MediaSessionRecord mediasessionrecord = mMediaSession;
	//   94  195:aload_0         
	//   95  196:getfield        #259 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//   96  199:astore          4
			if(mediasessionrecord != null)
	//*  97  201:aload           4
	//*  98  203:ifnull          211
				mediasessionrecord.clearVolumeHandling();
	//   99  206:aload           4
	//  100  208:invokevirtual   #264 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord.clearVolumeHandling()>
		}
	//  101  211:return          
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
	//    2    2:invokevirtual   #449 <Method boolean MediaRouter$ProviderInfo.updateDescriptor(MediaRouteProviderDescriptor)>
	//    3    5:ifeq            911
				if(mediarouteproviderdescriptor != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          704
				{
					if(mediarouteproviderdescriptor.isValid())
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #454 <Method boolean MediaRouteProviderDescriptor.isValid()>
	//*   8   16:ifeq            668
					{
						List list = mediarouteproviderdescriptor.getRoutes();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #455 <Method List MediaRouteProviderDescriptor.getRoutes()>
	//   11   23:astore          12
						int j1 = list.size();
	//   12   25:aload           12
	//   13   27:invokeinterface #456 <Method int List.size()>
	//   14   32:istore          6
						ArrayList arraylist1 = new ArrayList();
	//   15   34:new             #54  <Class ArrayList>
	//   16   37:dup             
	//   17   38:invokespecial   #55  <Method void ArrayList()>
	//   18   41:astore          13
						ArrayList arraylist = new ArrayList();
	//   19   43:new             #54  <Class ArrayList>
	//   20   46:dup             
	//   21   47:invokespecial   #55  <Method void ArrayList()>
	//   22   50:astore          11
						l = 0;
	//   23   52:iconst_0        
	//   24   53:istore          4
						int i = 0;
	//   25   55:iconst_0        
	//   26   56:istore_3        
						boolean flag = false;
	//   27   57:iconst_0        
	//   28   58:istore          8
						for(; l < j1; l++)
	//*  29   60:iload           4
	//*  30   62:iload           6
	//*  31   64:icmpge          481
						{
							MediaRouteDescriptor mediaroutedescriptor = (MediaRouteDescriptor)list.get(l);
	//   32   67:aload           12
	//   33   69:iload           4
	//   34   71:invokeinterface #457 <Method Object List.get(int)>
	//   35   76:checkcast       #459 <Class MediaRouteDescriptor>
	//   36   79:astore          14
							String s = mediaroutedescriptor.getId();
	//   37   81:aload           14
	//   38   83:invokevirtual   #462 <Method String MediaRouteDescriptor.getId()>
	//   39   86:astore          15
							int k1 = providerinfo.findRouteByDescriptorId(s);
	//   40   88:aload_1         
	//   41   89:aload           15
	//   42   91:invokevirtual   #465 <Method int MediaRouter$ProviderInfo.findRouteByDescriptorId(String)>
	//   43   94:istore          7
							boolean flag1;
							if(mediaroutedescriptor.getGroupMemberIds() != null)
	//*  44   96:aload           14
	//*  45   98:invokevirtual   #468 <Method List MediaRouteDescriptor.getGroupMemberIds()>
	//*  46  101:ifnull          110
								flag1 = true;
	//   47  104:iconst_1        
	//   48  105:istore          9
							else
	//*  49  107:goto            113
								flag1 = false;
	//   50  110:iconst_0        
	//   51  111:istore          9
							if(k1 < 0)
	//*  52  113:iload           7
	//*  53  115:ifge            271
							{
								mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (assignRouteUniqueId(providerinfo, s)));
	//   54  118:aload_0         
	//   55  119:aload_1         
	//   56  120:aload           15
	//   57  122:invokespecial   #470 <Method String assignRouteUniqueId(MediaRouter$ProviderInfo, String)>
	//   58  125:astore_2        
								if(flag1)
	//*  59  126:iload           9
	//*  60  128:ifeq            146
									mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new MediaRouter.RouteGroup(providerinfo, s, ((String) (mediarouteproviderdescriptor)))));
	//   61  131:new             #388 <Class MediaRouter$RouteGroup>
	//   62  134:dup             
	//   63  135:aload_1         
	//   64  136:aload           15
	//   65  138:aload_2         
	//   66  139:invokespecial   #473 <Method void MediaRouter$RouteGroup(MediaRouter$ProviderInfo, String, String)>
	//   67  142:astore_2        
								else
	//*  68  143:goto            158
									mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new MediaRouter.RouteInfo(providerinfo, s, ((String) (mediarouteproviderdescriptor)))));
	//   69  146:new             #227 <Class MediaRouter$RouteInfo>
	//   70  149:dup             
	//   71  150:aload_1         
	//   72  151:aload           15
	//   73  153:aload_2         
	//   74  154:invokespecial   #474 <Method void MediaRouter$RouteInfo(MediaRouter$ProviderInfo, String, String)>
	//   75  157:astore_2        
								providerinfo.mRoutes.add(i, ((Object) (mediarouteproviderdescriptor)));
	//   76  158:aload_1         
	//   77  159:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//   78  162:iload_3         
	//   79  163:aload_2         
	//   80  164:invokeinterface #480 <Method void List.add(int, Object)>
								mRoutes.add(((Object) (mediarouteproviderdescriptor)));
	//   81  169:aload_0         
	//   82  170:getfield        #59  <Field ArrayList mRoutes>
	//   83  173:aload_2         
	//   84  174:invokevirtual   #482 <Method boolean ArrayList.add(Object)>
	//   85  177:pop             
								if(flag1)
	//*  86  178:iload           9
	//*  87  180:ifeq            204
								{
									((List) (arraylist1)).add(((Object) (new q(((Object) (mediarouteproviderdescriptor)), ((Object) (mediaroutedescriptor))))));
	//   88  183:aload           13
	//   89  185:new             #160 <Class q>
	//   90  188:dup             
	//   91  189:aload_2         
	//   92  190:aload           14
	//   93  192:invokespecial   #163 <Method void q(Object, Object)>
	//   94  195:invokeinterface #483 <Method boolean List.add(Object)>
	//   95  200:pop             
								} else
	//*  96  201:goto            264
								{
									((MediaRouter.RouteInfo) (mediarouteproviderdescriptor)).maybeUpdateDescriptor(mediaroutedescriptor);
	//   97  204:aload_2         
	//   98  205:aload           14
	//   99  207:invokevirtual   #487 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
	//  100  210:pop             
									if(MediaRouter.DEBUG)
	//* 101  211:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//* 102  214:ifeq            253
									{
										StringBuilder stringbuilder = new StringBuilder();
	//  103  217:new             #144 <Class StringBuilder>
	//  104  220:dup             
	//  105  221:invokespecial   #145 <Method void StringBuilder()>
	//  106  224:astore          10
										stringbuilder.append("Route added: ");
	//  107  226:aload           10
	//  108  228:ldc2            #489 <String "Route added: ">
	//  109  231:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  110  234:pop             
										stringbuilder.append(((Object) (mediarouteproviderdescriptor)));
	//  111  235:aload           10
	//  112  237:aload_2         
	//  113  238:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  114  241:pop             
										Log.d("MediaRouter", stringbuilder.toString());
	//  115  242:ldc1            #177 <String "MediaRouter">
	//  116  244:aload           10
	//  117  246:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  118  249:invokestatic    #333 <Method int Log.d(String, String)>
	//  119  252:pop             
									}
									mCallbackHandler.post(257, ((Object) (mediarouteproviderdescriptor)));
	//  120  253:aload_0         
	//  121  254:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  122  257:sipush          257
	//  123  260:aload_2         
	//  124  261:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
								}
								i++;
	//  125  264:iload_3         
	//  126  265:iconst_1        
	//  127  266:iadd            
	//  128  267:istore_3        
								continue;
	//  129  268:goto            472
							}
							if(k1 < i)
	//* 130  271:iload           7
	//* 131  273:iload_3         
	//* 132  274:icmpge          313
							{
								mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new StringBuilder()));
	//  133  277:new             #144 <Class StringBuilder>
	//  134  280:dup             
	//  135  281:invokespecial   #145 <Method void StringBuilder()>
	//  136  284:astore_2        
								((StringBuilder) (mediarouteproviderdescriptor)).append("Ignoring route descriptor with duplicate id: ");
	//  137  285:aload_2         
	//  138  286:ldc2            #491 <String "Ignoring route descriptor with duplicate id: ">
	//  139  289:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  140  292:pop             
								((StringBuilder) (mediarouteproviderdescriptor)).append(((Object) (mediaroutedescriptor)));
	//  141  293:aload_2         
	//  142  294:aload           14
	//  143  296:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  144  299:pop             
								Log.w("MediaRouter", ((StringBuilder) (mediarouteproviderdescriptor)).toString());
	//  145  300:ldc1            #177 <String "MediaRouter">
	//  146  302:aload_2         
	//  147  303:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  148  306:invokestatic    #183 <Method int Log.w(String, String)>
	//  149  309:pop             
								continue;
	//  150  310:goto            472
							}
							Object obj = ((Object) ((MediaRouter.RouteInfo)providerinfo.mRoutes.get(k1)));
	//  151  313:aload_1         
	//  152  314:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//  153  317:iload           7
	//  154  319:invokeinterface #457 <Method Object List.get(int)>
	//  155  324:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  156  327:astore          10
							mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (obj));
	//  157  329:aload           10
	//  158  331:astore_2        
							if((obj instanceof MediaRouter.RouteGroup) != flag1)
	//* 159  332:aload           10
	//* 160  334:instanceof      #388 <Class MediaRouter$RouteGroup>
	//* 161  337:iload           9
	//* 162  339:icmpeq          395
							{
								if(flag1)
	//* 163  342:iload           9
	//* 164  344:ifeq            366
									mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new MediaRouter.RouteGroup(providerinfo, s, ((MediaRouter.RouteInfo) (obj)).getId())));
	//  165  347:new             #388 <Class MediaRouter$RouteGroup>
	//  166  350:dup             
	//  167  351:aload_1         
	//  168  352:aload           15
	//  169  354:aload           10
	//  170  356:invokevirtual   #492 <Method String MediaRouter$RouteInfo.getId()>
	//  171  359:invokespecial   #473 <Method void MediaRouter$RouteGroup(MediaRouter$ProviderInfo, String, String)>
	//  172  362:astore_2        
								else
	//* 173  363:goto            382
									mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new MediaRouter.RouteInfo(providerinfo, s, ((MediaRouter.RouteInfo) (obj)).getId())));
	//  174  366:new             #227 <Class MediaRouter$RouteInfo>
	//  175  369:dup             
	//  176  370:aload_1         
	//  177  371:aload           15
	//  178  373:aload           10
	//  179  375:invokevirtual   #492 <Method String MediaRouter$RouteInfo.getId()>
	//  180  378:invokespecial   #474 <Method void MediaRouter$RouteInfo(MediaRouter$ProviderInfo, String, String)>
	//  181  381:astore_2        
								providerinfo.mRoutes.set(k1, ((Object) (mediarouteproviderdescriptor)));
	//  182  382:aload_1         
	//  183  383:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//  184  386:iload           7
	//  185  388:aload_2         
	//  186  389:invokeinterface #496 <Method Object List.set(int, Object)>
	//  187  394:pop             
							}
							obj = ((Object) (providerinfo.mRoutes));
	//  188  395:aload_1         
	//  189  396:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//  190  399:astore          10
							int i1 = i + 1;
	//  191  401:iload_3         
	//  192  402:iconst_1        
	//  193  403:iadd            
	//  194  404:istore          5
							Collections.swap(((List) (obj)), k1, i);
	//  195  406:aload           10
	//  196  408:iload           7
	//  197  410:iload_3         
	//  198  411:invokestatic    #502 <Method void Collections.swap(List, int, int)>
							if(mediarouteproviderdescriptor instanceof MediaRouter.RouteGroup)
	//* 199  414:aload_2         
	//* 200  415:instanceof      #388 <Class MediaRouter$RouteGroup>
	//* 201  418:ifeq            442
								((List) (arraylist)).add(((Object) (new q(((Object) (mediarouteproviderdescriptor)), ((Object) (mediaroutedescriptor))))));
	//  202  421:aload           11
	//  203  423:new             #160 <Class q>
	//  204  426:dup             
	//  205  427:aload_2         
	//  206  428:aload           14
	//  207  430:invokespecial   #163 <Method void q(Object, Object)>
	//  208  433:invokeinterface #483 <Method boolean List.add(Object)>
	//  209  438:pop             
							else
	//* 210  439:goto            469
							if(updateRouteDescriptorAndNotify(((MediaRouter.RouteInfo) (mediarouteproviderdescriptor)), mediaroutedescriptor) != 0 && mediarouteproviderdescriptor == mSelectedRoute)
	//* 211  442:aload_0         
	//* 212  443:aload_2         
	//* 213  444:aload           14
	//* 214  446:invokespecial   #506 <Method int updateRouteDescriptorAndNotify(MediaRouter$RouteInfo, MediaRouteDescriptor)>
	//* 215  449:ifeq            469
	//* 216  452:aload_2         
	//* 217  453:aload_0         
	//* 218  454:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 219  457:if_acmpne       469
							{
								i = i1;
	//  220  460:iload           5
	//  221  462:istore_3        
								flag = true;
	//  222  463:iconst_1        
	//  223  464:istore          8
								continue;
	//  224  466:goto            472
							}
							i = i1;
	//  225  469:iload           5
	//  226  471:istore_3        
						}

	//  227  472:iload           4
	//  228  474:iconst_1        
	//  229  475:iadd            
	//  230  476:istore          4
	//* 231  478:goto            60
						MediaRouter.RouteInfo routeinfo;
						for(mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (((List) (arraylist1)).iterator())); ((Iterator) (mediarouteproviderdescriptor)).hasNext(); mCallbackHandler.post(257, ((Object) (routeinfo))))
	//* 232  481:aload           13
	//* 233  483:invokeinterface #395 <Method Iterator List.iterator()>
	//* 234  488:astore_2        
	//* 235  489:aload_2         
	//* 236  490:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//* 237  495:ifeq            591
						{
							q q2 = (q)((Iterator) (mediarouteproviderdescriptor)).next();
	//  238  498:aload_2         
	//  239  499:invokeinterface #369 <Method Object Iterator.next()>
	//  240  504:checkcast       #160 <Class q>
	//  241  507:astore          12
							routeinfo = (MediaRouter.RouteInfo)q2.a;
	//  242  509:aload           12
	//  243  511:getfield        #509 <Field Object q.a>
	//  244  514:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  245  517:astore          10
							routeinfo.maybeUpdateDescriptor((MediaRouteDescriptor)q2.b);
	//  246  519:aload           10
	//  247  521:aload           12
	//  248  523:getfield        #512 <Field Object q.b>
	//  249  526:checkcast       #459 <Class MediaRouteDescriptor>
	//  250  529:invokevirtual   #487 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
	//  251  532:pop             
							if(MediaRouter.DEBUG)
	//* 252  533:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//* 253  536:ifeq            576
							{
								StringBuilder stringbuilder3 = new StringBuilder();
	//  254  539:new             #144 <Class StringBuilder>
	//  255  542:dup             
	//  256  543:invokespecial   #145 <Method void StringBuilder()>
	//  257  546:astore          12
								stringbuilder3.append("Route added: ");
	//  258  548:aload           12
	//  259  550:ldc2            #489 <String "Route added: ">
	//  260  553:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  261  556:pop             
								stringbuilder3.append(((Object) (routeinfo)));
	//  262  557:aload           12
	//  263  559:aload           10
	//  264  561:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  265  564:pop             
								Log.d("MediaRouter", stringbuilder3.toString());
	//  266  565:ldc1            #177 <String "MediaRouter">
	//  267  567:aload           12
	//  268  569:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  269  572:invokestatic    #333 <Method int Log.d(String, String)>
	//  270  575:pop             
							}
						}

	//  271  576:aload_0         
	//  272  577:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  273  580:sipush          257
	//  274  583:aload           10
	//  275  585:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
	//* 276  588:goto            489
						mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (((List) (arraylist)).iterator()));
	//  277  591:aload           11
	//  278  593:invokeinterface #395 <Method Iterator List.iterator()>
	//  279  598:astore_2        
						do
						{
							flag2 = flag;
	//  280  599:iload           8
	//  281  601:istore          9
							l = i;
	//  282  603:iload_3         
	//  283  604:istore          4
							if(!((Iterator) (mediarouteproviderdescriptor)).hasNext())
								break;
	//  284  606:aload_2         
	//  285  607:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//  286  612:ifeq            710
							q q1 = (q)((Iterator) (mediarouteproviderdescriptor)).next();
	//  287  615:aload_2         
	//  288  616:invokeinterface #369 <Method Object Iterator.next()>
	//  289  621:checkcast       #160 <Class q>
	//  290  624:astore          10
							MediaRouter.RouteInfo routeinfo1 = (MediaRouter.RouteInfo)q1.a;
	//  291  626:aload           10
	//  292  628:getfield        #509 <Field Object q.a>
	//  293  631:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  294  634:astore          11
							if(updateRouteDescriptorAndNotify(routeinfo1, (MediaRouteDescriptor)q1.b) != 0 && routeinfo1 == mSelectedRoute)
	//* 295  636:aload_0         
	//* 296  637:aload           11
	//* 297  639:aload           10
	//* 298  641:getfield        #512 <Field Object q.b>
	//* 299  644:checkcast       #459 <Class MediaRouteDescriptor>
	//* 300  647:invokespecial   #506 <Method int updateRouteDescriptorAndNotify(MediaRouter$RouteInfo, MediaRouteDescriptor)>
	//* 301  650:ifeq            599
	//* 302  653:aload           11
	//* 303  655:aload_0         
	//* 304  656:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//* 305  659:if_acmpne       599
								flag = true;
	//  306  662:iconst_1        
	//  307  663:istore          8
						} while(true);
	//  308  665:goto            599
						break label1;
					}
					StringBuilder stringbuilder1 = new StringBuilder();
	//  309  668:new             #144 <Class StringBuilder>
	//  310  671:dup             
	//  311  672:invokespecial   #145 <Method void StringBuilder()>
	//  312  675:astore          10
					stringbuilder1.append("Ignoring invalid provider descriptor: ");
	//  313  677:aload           10
	//  314  679:ldc2            #514 <String "Ignoring invalid provider descriptor: ">
	//  315  682:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  316  685:pop             
					stringbuilder1.append(((Object) (mediarouteproviderdescriptor)));
	//  317  686:aload           10
	//  318  688:aload_2         
	//  319  689:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  320  692:pop             
					Log.w("MediaRouter", stringbuilder1.toString());
	//  321  693:ldc1            #177 <String "MediaRouter">
	//  322  695:aload           10
	//  323  697:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  324  700:invokestatic    #183 <Method int Log.w(String, String)>
	//  325  703:pop             
				}
				flag2 = false;
	//  326  704:iconst_0        
	//  327  705:istore          9
				l = 0;
	//  328  707:iconst_0        
	//  329  708:istore          4
			}
			for(int j = providerinfo.mRoutes.size() - 1; j >= l; j--)
	//* 330  710:aload_1         
	//* 331  711:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//* 332  714:invokeinterface #456 <Method int List.size()>
	//* 333  719:iconst_1        
	//* 334  720:isub            
	//* 335  721:istore_3        
	//* 336  722:iload_3         
	//* 337  723:iload           4
	//* 338  725:icmplt          764
			{
				mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((MediaRouter.RouteInfo)providerinfo.mRoutes.get(j)));
	//  339  728:aload_1         
	//  340  729:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//  341  732:iload_3         
	//  342  733:invokeinterface #457 <Method Object List.get(int)>
	//  343  738:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  344  741:astore_2        
				((MediaRouter.RouteInfo) (mediarouteproviderdescriptor)).maybeUpdateDescriptor(((MediaRouteDescriptor) (null)));
	//  345  742:aload_2         
	//  346  743:aconst_null     
	//  347  744:invokevirtual   #487 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
	//  348  747:pop             
				mRoutes.remove(((Object) (mediarouteproviderdescriptor)));
	//  349  748:aload_0         
	//  350  749:getfield        #59  <Field ArrayList mRoutes>
	//  351  752:aload_2         
	//  352  753:invokevirtual   #517 <Method boolean ArrayList.remove(Object)>
	//  353  756:pop             
			}

	//  354  757:iload_3         
	//  355  758:iconst_1        
	//  356  759:isub            
	//  357  760:istore_3        
	//* 358  761:goto            722
			updateSelectedRouteIfNeeded(flag2);
	//  359  764:aload_0         
	//  360  765:iload           9
	//  361  767:invokevirtual   #521 <Method void updateSelectedRouteIfNeeded(boolean)>
			for(int k = providerinfo.mRoutes.size() - 1; k >= l; k--)
	//* 362  770:aload_1         
	//* 363  771:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//* 364  774:invokeinterface #456 <Method int List.size()>
	//* 365  779:iconst_1        
	//* 366  780:isub            
	//* 367  781:istore_3        
	//* 368  782:iload_3         
	//* 369  783:iload           4
	//* 370  785:icmplt          862
			{
				mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((MediaRouter.RouteInfo)providerinfo.mRoutes.remove(k)));
	//  371  788:aload_1         
	//  372  789:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//  373  792:iload_3         
	//  374  793:invokeinterface #523 <Method Object List.remove(int)>
	//  375  798:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  376  801:astore_2        
				if(MediaRouter.DEBUG)
	//* 377  802:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//* 378  805:ifeq            844
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//  379  808:new             #144 <Class StringBuilder>
	//  380  811:dup             
	//  381  812:invokespecial   #145 <Method void StringBuilder()>
	//  382  815:astore          10
					stringbuilder2.append("Route removed: ");
	//  383  817:aload           10
	//  384  819:ldc2            #525 <String "Route removed: ">
	//  385  822:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  386  825:pop             
					stringbuilder2.append(((Object) (mediarouteproviderdescriptor)));
	//  387  826:aload           10
	//  388  828:aload_2         
	//  389  829:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  390  832:pop             
					Log.d("MediaRouter", stringbuilder2.toString());
	//  391  833:ldc1            #177 <String "MediaRouter">
	//  392  835:aload           10
	//  393  837:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  394  840:invokestatic    #333 <Method int Log.d(String, String)>
	//  395  843:pop             
				}
				mCallbackHandler.post(258, ((Object) (mediarouteproviderdescriptor)));
	//  396  844:aload_0         
	//  397  845:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  398  848:sipush          258
	//  399  851:aload_2         
	//  400  852:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}

	//  401  855:iload_3         
	//  402  856:iconst_1        
	//  403  857:isub            
	//  404  858:istore_3        
	//* 405  859:goto            782
			if(MediaRouter.DEBUG)
	//* 406  862:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//* 407  865:ifeq            900
			{
				mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new StringBuilder()));
	//  408  868:new             #144 <Class StringBuilder>
	//  409  871:dup             
	//  410  872:invokespecial   #145 <Method void StringBuilder()>
	//  411  875:astore_2        
				((StringBuilder) (mediarouteproviderdescriptor)).append("Provider changed: ");
	//  412  876:aload_2         
	//  413  877:ldc2            #527 <String "Provider changed: ">
	//  414  880:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  415  883:pop             
				((StringBuilder) (mediarouteproviderdescriptor)).append(((Object) (providerinfo)));
	//  416  884:aload_2         
	//  417  885:aload_1         
	//  418  886:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  419  889:pop             
				Log.d("MediaRouter", ((StringBuilder) (mediarouteproviderdescriptor)).toString());
	//  420  890:ldc1            #177 <String "MediaRouter">
	//  421  892:aload_2         
	//  422  893:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  423  896:invokestatic    #333 <Method int Log.d(String, String)>
	//  424  899:pop             
			}
			mCallbackHandler.post(515, ((Object) (providerinfo)));
	//  425  900:aload_0         
	//  426  901:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//  427  904:sipush          515
	//  428  907:aload_1         
	//  429  908:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
		}
	//  430  911:return          
	}

	private int updateRouteDescriptorAndNotify(MediaRouter.RouteInfo routeinfo, MediaRouteDescriptor mediaroutedescriptor)
	{
		int i = routeinfo.maybeUpdateDescriptor(mediaroutedescriptor);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #487 <Method int MediaRouter$RouteInfo.maybeUpdateDescriptor(MediaRouteDescriptor)>
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
	//*  10   16:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//*  11   19:ifeq            54
				{
					mediaroutedescriptor = ((MediaRouteDescriptor) (new StringBuilder()));
	//   12   22:new             #144 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #145 <Method void StringBuilder()>
	//   15   29:astore_2        
					((StringBuilder) (mediaroutedescriptor)).append("Route changed: ");
	//   16   30:aload_2         
	//   17   31:ldc2            #529 <String "Route changed: ">
	//   18   34:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
					((StringBuilder) (mediaroutedescriptor)).append(((Object) (routeinfo)));
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   23   43:pop             
					Log.d("MediaRouter", ((StringBuilder) (mediaroutedescriptor)).toString());
	//   24   44:ldc1            #177 <String "MediaRouter">
	//   25   46:aload_2         
	//   26   47:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   27   50:invokestatic    #333 <Method int Log.d(String, String)>
	//   28   53:pop             
				}
				mCallbackHandler.post(259, ((Object) (routeinfo)));
	//   29   54:aload_0         
	//   30   55:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   31   58:sipush          259
	//   32   61:aload_1         
	//   33   62:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}
			if((i & 2) != 0)
	//*  34   65:iload_3         
	//*  35   66:iconst_2        
	//*  36   67:iand            
	//*  37   68:ifeq            120
			{
				if(MediaRouter.DEBUG)
	//*  38   71:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//*  39   74:ifeq            109
				{
					mediaroutedescriptor = ((MediaRouteDescriptor) (new StringBuilder()));
	//   40   77:new             #144 <Class StringBuilder>
	//   41   80:dup             
	//   42   81:invokespecial   #145 <Method void StringBuilder()>
	//   43   84:astore_2        
					((StringBuilder) (mediaroutedescriptor)).append("Route volume changed: ");
	//   44   85:aload_2         
	//   45   86:ldc2            #531 <String "Route volume changed: ">
	//   46   89:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
					((StringBuilder) (mediaroutedescriptor)).append(((Object) (routeinfo)));
	//   48   93:aload_2         
	//   49   94:aload_1         
	//   50   95:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   51   98:pop             
					Log.d("MediaRouter", ((StringBuilder) (mediaroutedescriptor)).toString());
	//   52   99:ldc1            #177 <String "MediaRouter">
	//   53  101:aload_2         
	//   54  102:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   55  105:invokestatic    #333 <Method int Log.d(String, String)>
	//   56  108:pop             
				}
				mCallbackHandler.post(260, ((Object) (routeinfo)));
	//   57  109:aload_0         
	//   58  110:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   59  113:sipush          260
	//   60  116:aload_1         
	//   61  117:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}
			if((i & 4) != 0)
	//*  62  120:iload_3         
	//*  63  121:iconst_4        
	//*  64  122:iand            
	//*  65  123:ifeq            175
			{
				if(MediaRouter.DEBUG)
	//*  66  126:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//*  67  129:ifeq            164
				{
					mediaroutedescriptor = ((MediaRouteDescriptor) (new StringBuilder()));
	//   68  132:new             #144 <Class StringBuilder>
	//   69  135:dup             
	//   70  136:invokespecial   #145 <Method void StringBuilder()>
	//   71  139:astore_2        
					((StringBuilder) (mediaroutedescriptor)).append("Route presentation display changed: ");
	//   72  140:aload_2         
	//   73  141:ldc2            #533 <String "Route presentation display changed: ">
	//   74  144:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   75  147:pop             
					((StringBuilder) (mediaroutedescriptor)).append(((Object) (routeinfo)));
	//   76  148:aload_2         
	//   77  149:aload_1         
	//   78  150:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   79  153:pop             
					Log.d("MediaRouter", ((StringBuilder) (mediaroutedescriptor)).toString());
	//   80  154:ldc1            #177 <String "MediaRouter">
	//   81  156:aload_2         
	//   82  157:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   83  160:invokestatic    #333 <Method int Log.d(String, String)>
	//   84  163:pop             
				}
				mCallbackHandler.post(261, ((Object) (routeinfo)));
	//   85  164:aload_0         
	//   86  165:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   87  168:sipush          261
	//   88  171:aload_1         
	//   89  172:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			}
		}
		return i;
	//   90  175:iload_3         
	//   91  176:ireturn         
	}

	public void addProvider(MediaRouteProvider mediarouteprovider)
	{
		if(findProviderInfo(mediarouteprovider) < 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #537 <Method int findProviderInfo(MediaRouteProvider)>
	//*   3    5:ifge            100
		{
			MediaRouter.ProviderInfo providerinfo = new MediaRouter.ProviderInfo(mediarouteprovider);
	//    4    8:new             #132 <Class MediaRouter$ProviderInfo>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #539 <Method void MediaRouter$ProviderInfo(MediaRouteProvider)>
	//    8   16:astore_2        
			mProviders.add(((Object) (providerinfo)));
	//    9   17:aload_0         
	//   10   18:getfield        #66  <Field ArrayList mProviders>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #482 <Method boolean ArrayList.add(Object)>
	//   13   25:pop             
			if(MediaRouter.DEBUG)
	//*  14   26:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//*  15   29:ifeq            64
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #144 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #145 <Method void StringBuilder()>
	//   19   39:astore_3        
				stringbuilder.append("Provider added: ");
	//   20   40:aload_3         
	//   21   41:ldc2            #541 <String "Provider added: ">
	//   22   44:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
				stringbuilder.append(((Object) (providerinfo)));
	//   24   48:aload_3         
	//   25   49:aload_2         
	//   26   50:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
				Log.d("MediaRouter", stringbuilder.toString());
	//   28   54:ldc1            #177 <String "MediaRouter">
	//   29   56:aload_3         
	//   30   57:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #333 <Method int Log.d(String, String)>
	//   32   63:pop             
			}
			mCallbackHandler.post(513, ((Object) (providerinfo)));
	//   33   64:aload_0         
	//   34   65:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   35   68:sipush          513
	//   36   71:aload_2         
	//   37   72:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			updateProviderContents(providerinfo, mediarouteprovider.getDescriptor());
	//   38   75:aload_0         
	//   39   76:aload_2         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #545 <Method MediaRouteProviderDescriptor MediaRouteProvider.getDescriptor()>
	//   42   81:invokespecial   #547 <Method void updateProviderContents(MediaRouter$ProviderInfo, MediaRouteProviderDescriptor)>
			mediarouteprovider.setCallback(((MediaRouteProvider.Callback) (mProviderCallback)));
	//   43   84:aload_1         
	//   44   85:aload_0         
	//   45   86:getfield        #80  <Field MediaRouter$GlobalMediaRouter$ProviderCallback mProviderCallback>
	//   46   89:invokevirtual   #551 <Method void MediaRouteProvider.setCallback(MediaRouteProvider$Callback)>
			mediarouteprovider.setDiscoveryRequest(mDiscoveryRequest);
	//   47   92:aload_1         
	//   48   93:aload_0         
	//   49   94:getfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//   50   97:invokevirtual   #557 <Method void MediaRouteProvider.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
		}
	//   51  100:return          
	}

	public void addRemoteControlClient(Object obj)
	{
		if(findRemoteControlClientRecord(obj) < 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #561 <Method int findRemoteControlClientRecord(Object)>
	//*   3    5:ifge            27
		{
			obj = ((Object) (new RemoteControlClientRecord(obj)));
	//    4    8:new             #221 <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #564 <Method void MediaRouter$GlobalMediaRouter$RemoteControlClientRecord(MediaRouter$GlobalMediaRouter, Object)>
	//    9   17:astore_1        
			mRemoteControlClients.add(obj);
	//   10   18:aload_0         
	//   11   19:getfield        #68  <Field ArrayList mRemoteControlClients>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #482 <Method boolean ArrayList.add(Object)>
	//   14   26:pop             
		}
	//   15   27:return          
	}

	MediaRouter.RouteInfo chooseFallbackRoute()
	{
		for(Iterator iterator = mRoutes.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field ArrayList mRoutes>
	//*   2    4:invokevirtual   #566 <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            52
		{
			MediaRouter.RouteInfo routeinfo = (MediaRouter.RouteInfo)iterator.next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #369 <Method Object Iterator.next()>
	//    9   23:checkcast       #227 <Class MediaRouter$RouteInfo>
	//   10   26:astore_2        
			if(routeinfo != mDefaultRoute && isSystemLiveAudioOnlyRoute(routeinfo) && routeinfo.isSelectable())
	//*  11   27:aload_2         
	//*  12   28:aload_0         
	//*  13   29:getfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
	//*  14   32:if_acmpeq       8
	//*  15   35:aload_0         
	//*  16   36:aload_2         
	//*  17   37:invokespecial   #570 <Method boolean isSystemLiveAudioOnlyRoute(MediaRouter$RouteInfo)>
	//*  18   40:ifeq            8
	//*  19   43:aload_2         
	//*  20   44:invokevirtual   #573 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//*  21   47:ifeq            8
				return routeinfo;
	//   22   50:aload_2         
	//   23   51:areturn         
		}

		return mDefaultRoute;
	//   24   52:aload_0         
	//   25   53:getfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   26   56:areturn         
	}

	MediaRouter.RouteInfo getBluetoothRoute()
	{
		return mBluetoothRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//    2    4:areturn         
	}

	public ContentResolver getContentResolver()
	{
		return mApplicationContext.getContentResolver();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Context mApplicationContext>
	//    2    4:invokevirtual   #577 <Method ContentResolver Context.getContentResolver()>
	//    3    7:areturn         
	}

	MediaRouter.RouteInfo getDefaultRoute()
	{
		MediaRouter.RouteInfo routeinfo = mDefaultRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
	//    2    4:astore_1        
		if(routeinfo != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return routeinfo;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
	//    7   11:new             #579 <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc2            #581 <String "There is no default route.  The media router has not yet been fully initialized.">
	//   10   18:invokespecial   #584 <Method void IllegalStateException(String)>
	//   11   21:athrow          
	}

	public Display getDisplay(int i)
	{
		return mDisplayManager.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field a mDisplayManager>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #588 <Method Display a.a(int)>
	//    4    8:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getMediaSessionToken()
	{
		Object obj = ((Object) (mMediaSession));
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord mMediaSession>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return ((MediaSessionRecord) (obj)).getToken();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #593 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter$GlobalMediaRouter$MediaSessionRecord.getToken()>
	//    7   13:areturn         
		obj = ((Object) (mCompatSession));
	//    8   14:aload_0         
	//    9   15:getfield        #595 <Field MediaSessionCompat mCompatSession>
	//   10   18:astore_1        
		if(obj != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          28
			return ((MediaSessionCompat) (obj)).c();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #600 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.c()>
	//   15   27:areturn         
		else
			return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
	}

	public Context getProviderContext(String s)
	{
		if(s.equals("android"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #606 <String "android">
	//*   2    4:invokevirtual   #235 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            15
			return mApplicationContext;
	//    4   10:aload_0         
	//    5   11:getfield        #94  <Field Context mApplicationContext>
	//    6   14:areturn         
		try
		{
			s = ((String) (mApplicationContext.createPackageContext(s, 4)));
	//    7   15:aload_0         
	//    8   16:getfield        #94  <Field Context mApplicationContext>
	//    9   19:aload_1         
	//   10   20:iconst_4        
	//   11   21:invokevirtual   #610 <Method Context Context.createPackageContext(String, int)>
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
	//    1    1:getfield        #66  <Field ArrayList mProviders>
	//    2    4:areturn         
	}

	public MediaRouter.RouteInfo getRoute(String s)
	{
		for(Iterator iterator = mRoutes.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field ArrayList mRoutes>
	//*   2    4:invokevirtual   #566 <Method Iterator ArrayList.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            40
		{
			MediaRouter.RouteInfo routeinfo = (MediaRouter.RouteInfo)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #369 <Method Object Iterator.next()>
	//    9   23:checkcast       #227 <Class MediaRouter$RouteInfo>
	//   10   26:astore_3        
			if(routeinfo.mUniqueId.equals(((Object) (s))))
	//*  11   27:aload_3         
	//*  12   28:getfield        #231 <Field String MediaRouter$RouteInfo.mUniqueId>
	//*  13   31:aload_1         
	//*  14   32:invokevirtual   #235 <Method boolean String.equals(Object)>
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
	//    1    1:getfield        #57  <Field ArrayList mRouters>
	//    2    4:invokevirtual   #209 <Method int ArrayList.size()>
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
	//   11   17:getfield        #57  <Field ArrayList mRouters>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   14   24:checkcast       #617 <Class WeakReference>
	//   15   27:invokevirtual   #619 <Method Object WeakReference.get()>
	//   16   30:checkcast       #271 <Class MediaRouter>
	//   17   33:astore_3        
					if(mediarouter != null)
						continue label0;
	//   18   34:aload_3         
	//   19   35:ifnonnull       50
					mRouters.remove(i);
	//   20   38:aload_0         
	//   21   39:getfield        #57  <Field ArrayList mRouters>
	//   22   42:iload_2         
	//   23   43:invokevirtual   #620 <Method Object ArrayList.remove(int)>
	//   24   46:pop             
				} else
	//*  25   47:goto            8
	//*  26   50:aload_3         
	//*  27   51:getfield        #623 <Field Context MediaRouter.mContext>
	//*  28   54:aload_1         
	//*  29   55:if_acmpne       8
	//*  30   58:aload_3         
	//*  31   59:areturn         
				{
					context = ((Context) (new MediaRouter(context)));
	//   32   60:new             #271 <Class MediaRouter>
	//   33   63:dup             
	//   34   64:aload_1         
	//   35   65:invokespecial   #625 <Method void MediaRouter(Context)>
	//   36   68:astore_1        
					mRouters.add(((Object) (new WeakReference(((Object) (context))))));
	//   37   69:aload_0         
	//   38   70:getfield        #57  <Field ArrayList mRouters>
	//   39   73:new             #617 <Class WeakReference>
	//   40   76:dup             
	//   41   77:aload_1         
	//   42   78:invokespecial   #627 <Method void WeakReference(Object)>
	//   43   81:invokevirtual   #482 <Method boolean ArrayList.add(Object)>
	//   44   84:pop             
					return ((MediaRouter) (context));
	//   45   85:aload_1         
	//   46   86:areturn         
				}
			} while(true);
		while(mediarouter.mContext != context);
		return mediarouter;
	}

	public List getRoutes()
	{
		return ((List) (mRoutes));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ArrayList mRoutes>
	//    2    4:areturn         
	}

	MediaRouter.RouteInfo getSelectedRoute()
	{
		MediaRouter.RouteInfo routeinfo = mSelectedRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//    2    4:astore_1        
		if(routeinfo != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return routeinfo;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
	//    7   11:new             #579 <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc2            #630 <String "There is no currently selected route.  The media router has not yet been fully initialized.">
	//   10   18:invokespecial   #584 <Method void IllegalStateException(String)>
	//   11   21:athrow          
	}

	String getUniqueId(MediaRouter.ProviderInfo providerinfo, String s)
	{
		providerinfo = ((MediaRouter.ProviderInfo) (providerinfo.getComponentName().flattenToShortString()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #136 <Method ComponentName MediaRouter$ProviderInfo.getComponentName()>
	//    2    4:invokevirtual   #142 <Method String ComponentName.flattenToShortString()>
	//    3    7:astore_1        
		return (String)mUniqueIdMap.get(((Object) (new q(((Object) (providerinfo)), ((Object) (s))))));
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field Map mUniqueIdMap>
	//    6   12:new             #160 <Class q>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #163 <Method void q(Object, Object)>
	//   11   21:invokeinterface #634 <Method Object Map.get(Object)>
	//   12   26:checkcast       #199 <Class String>
	//   13   29:areturn         
	}

	public boolean isRouteAvailable(MediaRouteSelector mediarouteselector, int i)
	{
		if(mediarouteselector.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #639 <Method boolean MediaRouteSelector.isEmpty()>
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
	//*  10   16:getfield        #119 <Field boolean mLowRam>
	//*  11   19:ifeq            24
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		int k = mRoutes.size();
	//   14   24:aload_0         
	//   15   25:getfield        #59  <Field ArrayList mRoutes>
	//   16   28:invokevirtual   #209 <Method int ArrayList.size()>
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
	//   24   42:getfield        #59  <Field ArrayList mRoutes>
	//   25   45:iload_3         
	//   26   46:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   27   49:checkcast       #227 <Class MediaRouter$RouteInfo>
	//   28   52:astore          5
			if(((i & 1) == 0 || !routeinfo.isDefaultOrBluetooth()) && routeinfo.matchesSelector(mediarouteselector))
	//*  29   54:iload_2         
	//*  30   55:iconst_1        
	//*  31   56:iand            
	//*  32   57:ifeq            71
	//*  33   60:aload           5
	//*  34   62:invokevirtual   #642 <Method boolean MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*  35   65:ifeq            71
	//*  36   68:goto            82
	//*  37   71:aload           5
	//*  38   73:aload_1         
	//*  39   74:invokevirtual   #646 <Method boolean MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
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
	//    1    1:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//    2    4:sipush          262
	//    3    7:invokevirtual   #650 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.removeMessages(int)>
		int i = findProviderInfo(((MediaRouteProvider) (mSystemProvider)));
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #127 <Field SystemMediaRouteProvider mSystemProvider>
	//    7   15:invokespecial   #537 <Method int findProviderInfo(MediaRouteProvider)>
	//    8   18:istore_2        
		if(i >= 0)
	//*   9   19:iload_2         
	//*  10   20:iflt            61
		{
			MediaRouter.ProviderInfo providerinfo = (MediaRouter.ProviderInfo)mProviders.get(i);
	//   11   23:aload_0         
	//   12   24:getfield        #66  <Field ArrayList mProviders>
	//   13   27:iload_2         
	//   14   28:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #132 <Class MediaRouter$ProviderInfo>
	//   16   34:astore_3        
			i = providerinfo.findRouteByDescriptorId(s);
	//   17   35:aload_3         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #465 <Method int MediaRouter$ProviderInfo.findRouteByDescriptorId(String)>
	//   20   40:istore_2        
			if(i >= 0)
	//*  21   41:iload_2         
	//*  22   42:iflt            61
				((MediaRouter.RouteInfo)providerinfo.mRoutes.get(i)).select();
	//   23   45:aload_3         
	//   24   46:getfield        #477 <Field List MediaRouter$ProviderInfo.mRoutes>
	//   25   49:iload_2         
	//   26   50:invokeinterface #457 <Method Object List.get(int)>
	//   27   55:checkcast       #227 <Class MediaRouter$RouteInfo>
	//   28   58:invokevirtual   #653 <Method void MediaRouter$RouteInfo.select()>
		}
	//   29   61:return          
	}

	public void removeProvider(MediaRouteProvider mediarouteprovider)
	{
		int i = findProviderInfo(mediarouteprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #537 <Method int findProviderInfo(MediaRouteProvider)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            96
		{
			mediarouteprovider.setCallback(((MediaRouteProvider.Callback) (null)));
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #551 <Method void MediaRouteProvider.setCallback(MediaRouteProvider$Callback)>
			mediarouteprovider.setDiscoveryRequest(((MediaRouteDiscoveryRequest) (null)));
	//    9   15:aload_1         
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #557 <Method void MediaRouteProvider.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
			mediarouteprovider = ((MediaRouteProvider) ((MediaRouter.ProviderInfo)mProviders.get(i)));
	//   12   20:aload_0         
	//   13   21:getfield        #66  <Field ArrayList mProviders>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #132 <Class MediaRouter$ProviderInfo>
	//   17   31:astore_1        
			updateProviderContents(((MediaRouter.ProviderInfo) (mediarouteprovider)), ((MediaRouteProviderDescriptor) (null)));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:aconst_null     
	//   21   35:invokespecial   #547 <Method void updateProviderContents(MediaRouter$ProviderInfo, MediaRouteProviderDescriptor)>
			if(MediaRouter.DEBUG)
	//*  22   38:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//*  23   41:ifeq            76
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   24   44:new             #144 <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #145 <Method void StringBuilder()>
	//   27   51:astore_3        
				stringbuilder.append("Provider removed: ");
	//   28   52:aload_3         
	//   29   53:ldc2            #656 <String "Provider removed: ">
	//   30   56:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
				stringbuilder.append(((Object) (mediarouteprovider)));
	//   32   60:aload_3         
	//   33   61:aload_1         
	//   34   62:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   35   65:pop             
				Log.d("MediaRouter", stringbuilder.toString());
	//   36   66:ldc1            #177 <String "MediaRouter">
	//   37   68:aload_3         
	//   38   69:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   39   72:invokestatic    #333 <Method int Log.d(String, String)>
	//   40   75:pop             
			}
			mCallbackHandler.post(514, ((Object) (mediarouteprovider)));
	//   41   76:aload_0         
	//   42   77:getfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   43   80:sipush          514
	//   44   83:aload_1         
	//   45   84:invokevirtual   #386 <Method void MediaRouter$GlobalMediaRouter$CallbackHandler.post(int, Object)>
			mProviders.remove(i);
	//   46   87:aload_0         
	//   47   88:getfield        #66  <Field ArrayList mProviders>
	//   48   91:iload_2         
	//   49   92:invokevirtual   #620 <Method Object ArrayList.remove(int)>
	//   50   95:pop             
		}
	//   51   96:return          
	}

	public void removeRemoteControlClient(Object obj)
	{
		int i = findRemoteControlClientRecord(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #561 <Method int findRemoteControlClientRecord(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            24
			((RemoteControlClientRecord)mRemoteControlClients.remove(i)).disconnect();
	//    6   10:aload_0         
	//    7   11:getfield        #68  <Field ArrayList mRemoteControlClients>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #620 <Method Object ArrayList.remove(int)>
	//   10   18:checkcast       #221 <Class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord>
	//   11   21:invokevirtual   #660 <Method void MediaRouter$GlobalMediaRouter$RemoteControlClientRecord.disconnect()>
	//   12   24:return          
	}

	public void requestSetVolume(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(routeinfo == mSelectedRoute)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   3    5:if_acmpne       23
		{
			ller ller = mSelectedRouteController;
	//    4    8:aload_0         
	//    5    9:getfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//    6   12:astore_3        
			if(ller != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          23
			{
				ller.onSetVolume(i);
	//    9   17:aload_3         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #664 <Method void MediaRouteProvider$RouteController.onSetVolume(int)>
				return;
	//   12   22:return          
			}
		}
		if(!mRouteControllerMap.isEmpty())
	//*  13   23:aload_0         
	//*  14   24:getfield        #87  <Field Map mRouteControllerMap>
	//*  15   27:invokeinterface #351 <Method boolean Map.isEmpty()>
	//*  16   32:ifne            61
		{
			routeinfo = ((MediaRouter.RouteInfo) ((ller)mRouteControllerMap.get(((Object) (routeinfo.mDescriptorId)))));
	//   17   35:aload_0         
	//   18   36:getfield        #87  <Field Map mRouteControllerMap>
	//   19   39:aload_1         
	//   20   40:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//   21   43:invokeinterface #634 <Method Object Map.get(Object)>
	//   22   48:checkcast       #341 <Class MediaRouteProvider$RouteController>
	//   23   51:astore_1        
			if(routeinfo != null)
	//*  24   52:aload_1         
	//*  25   53:ifnull          61
				((ller) (routeinfo)).onSetVolume(i);
	//   26   56:aload_1         
	//   27   57:iload_2         
	//   28   58:invokevirtual   #664 <Method void MediaRouteProvider$RouteController.onSetVolume(int)>
		}
	//   29   61:return          
	}

	public void requestUpdateVolume(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(routeinfo == mSelectedRoute)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   3    5:if_acmpne       22
		{
			routeinfo = ((MediaRouter.RouteInfo) (mSelectedRouteController));
	//    4    8:aload_0         
	//    5    9:getfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//    6   12:astore_1        
			if(routeinfo != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				((ller) (routeinfo)).onUpdateVolume(i);
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #668 <Method void MediaRouteProvider$RouteController.onUpdateVolume(int)>
		}
	//   12   22:return          
	}

	void selectRoute(MediaRouter.RouteInfo routeinfo)
	{
		selectRoute(routeinfo, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #672 <Method void selectRoute(MediaRouter$RouteInfo, int)>
	//    4    6:return          
	}

	void selectRoute(MediaRouter.RouteInfo routeinfo, int i)
	{
		if(!mRoutes.contains(((Object) (routeinfo))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field ArrayList mRoutes>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #675 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            44
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #144 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #145 <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Ignoring attempt to select removed route: ");
	//    9   19:aload_3         
	//   10   20:ldc2            #677 <String "Ignoring attempt to select removed route: ">
	//   11   23:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append(((Object) (routeinfo)));
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   16   32:pop             
			Log.w("MediaRouter", stringbuilder.toString());
	//   17   33:ldc1            #177 <String "MediaRouter">
	//   18   35:aload_3         
	//   19   36:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   20   39:invokestatic    #183 <Method int Log.w(String, String)>
	//   21   42:pop             
			return;
	//   22   43:return          
		}
		if(!routeinfo.mEnabled)
	//*  23   44:aload_1         
	//*  24   45:getfield        #680 <Field boolean MediaRouter$RouteInfo.mEnabled>
	//*  25   48:ifne            84
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   26   51:new             #144 <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #145 <Method void StringBuilder()>
	//   29   58:astore_3        
			stringbuilder1.append("Ignoring attempt to select disabled route: ");
	//   30   59:aload_3         
	//   31   60:ldc2            #682 <String "Ignoring attempt to select disabled route: ">
	//   32   63:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			stringbuilder1.append(((Object) (routeinfo)));
	//   34   67:aload_3         
	//   35   68:aload_1         
	//   36   69:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   37   72:pop             
			Log.w("MediaRouter", stringbuilder1.toString());
	//   38   73:ldc1            #177 <String "MediaRouter">
	//   39   75:aload_3         
	//   40   76:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   41   79:invokestatic    #183 <Method int Log.w(String, String)>
	//   42   82:pop             
			return;
	//   43   83:return          
		} else
		{
			setSelectedRouteInternal(routeinfo, i);
	//   44   84:aload_0         
	//   45   85:aload_1         
	//   46   86:iload_2         
	//   47   87:invokespecial   #684 <Method void setSelectedRouteInternal(MediaRouter$RouteInfo, int)>
			return;
	//   48   90:return          
		}
	}

	public void sendControlRequest(MediaRouter.RouteInfo routeinfo, Intent intent, back back)
	{
		if(routeinfo == mSelectedRoute)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//*   3    5:if_acmpne       27
		{
			routeinfo = ((MediaRouter.RouteInfo) (mSelectedRouteController));
	//    4    8:aload_0         
	//    5    9:getfield        #339 <Field MediaRouteProvider$RouteController mSelectedRouteController>
	//    6   12:astore_1        
			if(routeinfo != null && ((ller) (routeinfo)).onControlRequest(intent, back))
	//*   7   13:aload_1         
	//*   8   14:ifnull          27
	//*   9   17:aload_1         
	//*  10   18:aload_2         
	//*  11   19:aload_3         
	//*  12   20:invokevirtual   #690 <Method boolean MediaRouteProvider$RouteController.onControlRequest(Intent, MediaRouter$ControlRequestCallback)>
	//*  13   23:ifeq            27
				return;
	//   14   26:return          
		}
		if(back != null)
	//*  15   27:aload_3         
	//*  16   28:ifnull          37
			back.onError(((String) (null)), ((android.os.Bundle) (null)));
	//   17   31:aload_3         
	//   18   32:aconst_null     
	//   19   33:aconst_null     
	//   20   34:invokevirtual   #696 <Method void MediaRouter$ControlRequestCallback.onError(String, android.os.Bundle)>
	//   21   37:return          
	}

	public void setMediaSession(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
			obj = ((Object) (new MediaSessionRecord(obj)));
	//    2    4:new             #261 <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #698 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter$GlobalMediaRouter, Object)>
	//    7   13:astore_1        
		else
	//*   8   14:goto            19
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		setMediaSessionRecord(((MediaSessionRecord) (obj)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #700 <Method void setMediaSessionRecord(MediaRouter$GlobalMediaRouter$MediaSessionRecord)>
	//   14   24:return          
	}

	public void setMediaSessionCompat(MediaSessionCompat mediasessioncompat)
	{
		mCompatSession = mediasessioncompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #595 <Field MediaSessionCompat mCompatSession>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #707 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          38
		{
			if(mediasessioncompat != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          30
				mediasessioncompat = ((MediaSessionCompat) (new MediaSessionRecord(mediasessioncompat)));
	//    8   17:new             #261 <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #710 <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter$GlobalMediaRouter, MediaSessionCompat)>
	//   13   26:astore_1        
			else
	//*  14   27:goto            32
				mediasessioncompat = null;
	//   15   30:aconst_null     
	//   16   31:astore_1        
			setMediaSessionRecord(((MediaSessionRecord) (mediasessioncompat)));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokespecial   #700 <Method void setMediaSessionRecord(MediaRouter$GlobalMediaRouter$MediaSessionRecord)>
			return;
	//   20   37:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  21   38:getstatic       #707 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   41:bipush          14
	//*  23   43:icmplt          106
		{
			MediaSessionCompat mediasessioncompat1 = mRccMediaSession;
	//   24   46:aload_0         
	//   25   47:getfield        #712 <Field MediaSessionCompat mRccMediaSession>
	//   26   50:astore_2        
			if(mediasessioncompat1 != null)
	//*  27   51:aload_2         
	//*  28   52:ifnull          74
			{
				removeRemoteControlClient(mediasessioncompat1.e());
	//   29   55:aload_0         
	//   30   56:aload_2         
	//   31   57:invokevirtual   #715 <Method Object MediaSessionCompat.e()>
	//   32   60:invokevirtual   #717 <Method void removeRemoteControlClient(Object)>
				mRccMediaSession.b(mSessionActiveListener);
	//   33   63:aload_0         
	//   34   64:getfield        #712 <Field MediaSessionCompat mRccMediaSession>
	//   35   67:aload_0         
	//   36   68:getfield        #92  <Field ax mSessionActiveListener>
	//   37   71:invokevirtual   #720 <Method void MediaSessionCompat.b(ax)>
			}
			mRccMediaSession = mediasessioncompat;
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:putfield        #712 <Field MediaSessionCompat mRccMediaSession>
			if(mediasessioncompat != null)
	//*  41   79:aload_1         
	//*  42   80:ifnull          106
			{
				mediasessioncompat.a(mSessionActiveListener);
	//   43   83:aload_1         
	//   44   84:aload_0         
	//   45   85:getfield        #92  <Field ax mSessionActiveListener>
	//   46   88:invokevirtual   #722 <Method void MediaSessionCompat.a(ax)>
				if(mediasessioncompat.a())
	//*  47   91:aload_1         
	//*  48   92:invokevirtual   #724 <Method boolean MediaSessionCompat.a()>
	//*  49   95:ifeq            106
					addRemoteControlClient(mediasessioncompat.e());
	//   50   98:aload_0         
	//   51   99:aload_1         
	//   52  100:invokevirtual   #715 <Method Object MediaSessionCompat.e()>
	//   53  103:invokevirtual   #726 <Method void addRemoteControlClient(Object)>
			}
		}
	//   54  106:return          
	}

	public void start()
	{
		addProvider(((MediaRouteProvider) (mSystemProvider)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #127 <Field SystemMediaRouteProvider mSystemProvider>
	//    3    5:invokevirtual   #729 <Method void addProvider(MediaRouteProvider)>
		mRegisteredProviderWatcher = new RegisteredMediaRouteProviderWatcher(mApplicationContext, ((tcher.Callback) (this)));
	//    4    8:aload_0         
	//    5    9:new             #731 <Class RegisteredMediaRouteProviderWatcher>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #94  <Field Context mApplicationContext>
	//    9   17:aload_0         
	//   10   18:invokespecial   #734 <Method void RegisteredMediaRouteProviderWatcher(Context, RegisteredMediaRouteProviderWatcher$Callback)>
	//   11   21:putfield        #736 <Field RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher>
		mRegisteredProviderWatcher.start();
	//   12   24:aload_0         
	//   13   25:getfield        #736 <Field RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher>
	//   14   28:invokevirtual   #738 <Method void RegisteredMediaRouteProviderWatcher.start()>
	//   15   31:return          
	}

	public void updateDiscoveryRequest()
	{
		Object obj = ((Object) (new MediaRouteSelector.Builder()));
	//    0    0:new             #741 <Class MediaRouteSelector$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #742 <Method void MediaRouteSelector$Builder()>
	//    3    7:astore          8
		int j = mRouters.size();
	//    4    9:aload_0         
	//    5   10:getfield        #57  <Field ArrayList mRouters>
	//    6   13:invokevirtual   #209 <Method int ArrayList.size()>
	//    7   16:istore_2        
		boolean flag1 = false;
	//    8   17:iconst_0        
	//    9   18:istore          4
		boolean flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_1        
		boolean flag2 = false;
	//   12   22:iconst_0        
	//   13   23:istore          7
		do
		{
			int l = j - 1;
	//   14   25:iload_2         
	//   15   26:iconst_1        
	//   16   27:isub            
	//   17   28:istore          5
			if(l < 0)
				break;
	//   18   30:iload           5
	//   19   32:iflt            185
			MediaRouter mediarouter = (MediaRouter)((WeakReference)mRouters.get(l)).get();
	//   20   35:aload_0         
	//   21   36:getfield        #57  <Field ArrayList mRouters>
	//   22   39:iload           5
	//   23   41:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   24   44:checkcast       #617 <Class WeakReference>
	//   25   47:invokevirtual   #619 <Method Object WeakReference.get()>
	//   26   50:checkcast       #271 <Class MediaRouter>
	//   27   53:astore          9
			if(mediarouter == null)
	//*  28   55:aload           9
	//*  29   57:ifnonnull       76
			{
				mRouters.remove(l);
	//   30   60:aload_0         
	//   31   61:getfield        #57  <Field ArrayList mRouters>
	//   32   64:iload           5
	//   33   66:invokevirtual   #620 <Method Object ArrayList.remove(int)>
	//   34   69:pop             
				j = l;
	//   35   70:iload           5
	//   36   72:istore_2        
			} else
	//*  37   73:goto            25
			{
				int i1 = mediarouter.mCallbackRecords.size();
	//   38   76:aload           9
	//   39   78:getfield        #745 <Field ArrayList MediaRouter.mCallbackRecords>
	//   40   81:invokevirtual   #209 <Method int ArrayList.size()>
	//   41   84:istore          6
				for(int k = 0; k < i1; k++)
	//*  42   86:iconst_0        
	//*  43   87:istore_3        
	//*  44   88:iload_3         
	//*  45   89:iload           6
	//*  46   91:icmpge          179
				{
					MediaRouter.CallbackRecord callbackrecord = (MediaRouter.CallbackRecord)mediarouter.mCallbackRecords.get(k);
	//   47   94:aload           9
	//   48   96:getfield        #745 <Field ArrayList MediaRouter.mCallbackRecords>
	//   49   99:iload_3         
	//   50  100:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   51  103:checkcast       #747 <Class MediaRouter$CallbackRecord>
	//   52  106:astore          10
					((MediaRouteSelector.Builder) (obj)).addSelector(callbackrecord.mSelector);
	//   53  108:aload           8
	//   54  110:aload           10
	//   55  112:getfield        #751 <Field MediaRouteSelector MediaRouter$CallbackRecord.mSelector>
	//   56  115:invokevirtual   #755 <Method MediaRouteSelector$Builder MediaRouteSelector$Builder.addSelector(MediaRouteSelector)>
	//   57  118:pop             
					if((callbackrecord.mFlags & 1) != 0)
	//*  58  119:aload           10
	//*  59  121:getfield        #758 <Field int MediaRouter$CallbackRecord.mFlags>
	//*  60  124:iconst_1        
	//*  61  125:iand            
	//*  62  126:ifeq            134
					{
						flag = true;
	//   63  129:iconst_1        
	//   64  130:istore_1        
						flag2 = true;
	//   65  131:iconst_1        
	//   66  132:istore          7
					}
					j = ((int) (flag));
	//   67  134:iload_1         
	//   68  135:istore_2        
					if((callbackrecord.mFlags & 4) != 0)
	//*  69  136:aload           10
	//*  70  138:getfield        #758 <Field int MediaRouter$CallbackRecord.mFlags>
	//*  71  141:iconst_4        
	//*  72  142:iand            
	//*  73  143:ifeq            157
					{
						j = ((int) (flag));
	//   74  146:iload_1         
	//   75  147:istore_2        
						if(!mLowRam)
	//*  76  148:aload_0         
	//*  77  149:getfield        #119 <Field boolean mLowRam>
	//*  78  152:ifne            157
							j = 1;
	//   79  155:iconst_1        
	//   80  156:istore_2        
					}
					flag = ((boolean) (j));
	//   81  157:iload_2         
	//   82  158:istore_1        
					if((callbackrecord.mFlags & 8) != 0)
	//*  83  159:aload           10
	//*  84  161:getfield        #758 <Field int MediaRouter$CallbackRecord.mFlags>
	//*  85  164:bipush          8
	//*  86  166:iand            
	//*  87  167:ifeq            172
						flag = true;
	//   88  170:iconst_1        
	//   89  171:istore_1        
				}

	//   90  172:iload_3         
	//   91  173:iconst_1        
	//   92  174:iadd            
	//   93  175:istore_3        
	//*  94  176:goto            88
				j = l;
	//   95  179:iload           5
	//   96  181:istore_2        
			}
		} while(true);
	//   97  182:goto            25
		if(flag)
	//*  98  185:iload_1         
	//*  99  186:ifeq            199
			obj = ((Object) (((MediaRouteSelector.Builder) (obj)).build()));
	//  100  189:aload           8
	//  101  191:invokevirtual   #762 <Method MediaRouteSelector MediaRouteSelector$Builder.build()>
	//  102  194:astore          8
		else
	//* 103  196:goto            204
			obj = ((Object) (MediaRouteSelector.EMPTY));
	//  104  199:getstatic       #765 <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//  105  202:astore          8
		MediaRouteDiscoveryRequest mediaroutediscoveryrequest = mDiscoveryRequest;
	//  106  204:aload_0         
	//  107  205:getfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//  108  208:astore          9
		if(mediaroutediscoveryrequest != null && mediaroutediscoveryrequest.getSelector().equals(obj) && mDiscoveryRequest.isActiveScan() == flag2)
	//* 109  210:aload           9
	//* 110  212:ifnull          241
	//* 111  215:aload           9
	//* 112  217:invokevirtual   #770 <Method MediaRouteSelector MediaRouteDiscoveryRequest.getSelector()>
	//* 113  220:aload           8
	//* 114  222:invokevirtual   #771 <Method boolean MediaRouteSelector.equals(Object)>
	//* 115  225:ifeq            241
	//* 116  228:aload_0         
	//* 117  229:getfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//* 118  232:invokevirtual   #774 <Method boolean MediaRouteDiscoveryRequest.isActiveScan()>
	//* 119  235:iload           7
	//* 120  237:icmpne          241
			return;
	//  121  240:return          
		if(((MediaRouteSelector) (obj)).isEmpty() && !flag2)
	//* 122  241:aload           8
	//* 123  243:invokevirtual   #639 <Method boolean MediaRouteSelector.isEmpty()>
	//* 124  246:ifeq            270
	//* 125  249:iload           7
	//* 126  251:ifne            270
		{
			if(mDiscoveryRequest == null)
	//* 127  254:aload_0         
	//* 128  255:getfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//* 129  258:ifnonnull       262
				return;
	//  130  261:return          
			mDiscoveryRequest = null;
	//  131  262:aload_0         
	//  132  263:aconst_null     
	//  133  264:putfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
		} else
	//* 134  267:goto            285
		{
			mDiscoveryRequest = new MediaRouteDiscoveryRequest(((MediaRouteSelector) (obj)), flag2);
	//  135  270:aload_0         
	//  136  271:new             #767 <Class MediaRouteDiscoveryRequest>
	//  137  274:dup             
	//  138  275:aload           8
	//  139  277:iload           7
	//  140  279:invokespecial   #777 <Method void MediaRouteDiscoveryRequest(MediaRouteSelector, boolean)>
	//  141  282:putfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
		}
		if(MediaRouter.DEBUG)
	//* 142  285:getstatic       #323 <Field boolean MediaRouter.DEBUG>
	//* 143  288:ifeq            330
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  144  291:new             #144 <Class StringBuilder>
	//  145  294:dup             
	//  146  295:invokespecial   #145 <Method void StringBuilder()>
	//  147  298:astore          8
			stringbuilder.append("Updated discovery request: ");
	//  148  300:aload           8
	//  149  302:ldc2            #779 <String "Updated discovery request: ">
	//  150  305:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  151  308:pop             
			stringbuilder.append(((Object) (mDiscoveryRequest)));
	//  152  309:aload           8
	//  153  311:aload_0         
	//  154  312:getfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//  155  315:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  156  318:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//  157  319:ldc1            #177 <String "MediaRouter">
	//  158  321:aload           8
	//  159  323:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  160  326:invokestatic    #333 <Method int Log.d(String, String)>
	//  161  329:pop             
		}
		if(flag && !flag2 && mLowRam)
	//* 162  330:iload_1         
	//* 163  331:ifeq            355
	//* 164  334:iload           7
	//* 165  336:ifne            355
	//* 166  339:aload_0         
	//* 167  340:getfield        #119 <Field boolean mLowRam>
	//* 168  343:ifeq            355
			Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
	//  169  346:ldc1            #177 <String "MediaRouter">
	//  170  348:ldc2            #781 <String "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.">
	//  171  351:invokestatic    #784 <Method int Log.i(String, String)>
	//  172  354:pop             
		j = mProviders.size();
	//  173  355:aload_0         
	//  174  356:getfield        #66  <Field ArrayList mProviders>
	//  175  359:invokevirtual   #209 <Method int ArrayList.size()>
	//  176  362:istore_2        
		for(int i = ((int) (flag1)); i < j; i++)
	//* 177  363:iload           4
	//* 178  365:istore_1        
	//* 179  366:iload_1         
	//* 180  367:iload_2         
	//* 181  368:icmpge          399
			((MediaRouter.ProviderInfo)mProviders.get(i)).mProviderInstance.setDiscoveryRequest(mDiscoveryRequest);
	//  182  371:aload_0         
	//  183  372:getfield        #66  <Field ArrayList mProviders>
	//  184  375:iload_1         
	//  185  376:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//  186  379:checkcast       #132 <Class MediaRouter$ProviderInfo>
	//  187  382:getfield        #217 <Field MediaRouteProvider MediaRouter$ProviderInfo.mProviderInstance>
	//  188  385:aload_0         
	//  189  386:getfield        #553 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//  190  389:invokevirtual   #557 <Method void MediaRouteProvider.setDiscoveryRequest(MediaRouteDiscoveryRequest)>

	//  191  392:iload_1         
	//  192  393:iconst_1        
	//  193  394:iadd            
	//  194  395:istore_1        
	//* 195  396:goto            366
	//  196  399:return          
	}

	void updateProviderDescriptor(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		int i = findProviderInfo(mediarouteprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #537 <Method int findProviderInfo(MediaRouteProvider)>
	//    3    5:istore_3        
		if(i >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            26
			updateProviderContents((MediaRouter.ProviderInfo)mProviders.get(i), mediarouteproviderdescriptor);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #66  <Field ArrayList mProviders>
	//    9   15:iload_3         
	//   10   16:invokevirtual   #213 <Method Object ArrayList.get(int)>
	//   11   19:checkcast       #132 <Class MediaRouter$ProviderInfo>
	//   12   22:aload_2         
	//   13   23:invokespecial   #547 <Method void updateProviderContents(MediaRouter$ProviderInfo, MediaRouteProviderDescriptor)>
	//   14   26:return          
	}

	void updateSelectedRouteIfNeeded(boolean flag)
	{
label0:
		{
			Object obj = ((Object) (mDefaultRoute));
	//    0    0:aload_0         
	//    1    1:getfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
	//    2    4:astore_2        
			if(obj != null && !((MediaRouter.RouteInfo) (obj)).isSelectable())
	//*   3    5:aload_2         
	//*   4    6:ifnull          56
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #573 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//*   7   13:ifne            56
			{
				obj = ((Object) (new StringBuilder()));
	//    8   16:new             #144 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #145 <Method void StringBuilder()>
	//   11   23:astore_2        
				((StringBuilder) (obj)).append("Clearing the default route because it is no longer selectable: ");
	//   12   24:aload_2         
	//   13   25:ldc2            #788 <String "Clearing the default route because it is no longer selectable: ">
	//   14   28:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
				((StringBuilder) (obj)).append(((Object) (mDefaultRoute)));
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   19   37:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:pop             
				Log.i("MediaRouter", ((StringBuilder) (obj)).toString());
	//   21   41:ldc1            #177 <String "MediaRouter">
	//   22   43:aload_2         
	//   23   44:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #784 <Method int Log.i(String, String)>
	//   25   50:pop             
				mDefaultRoute = null;
	//   26   51:aload_0         
	//   27   52:aconst_null     
	//   28   53:putfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
			}
			if(mDefaultRoute != null || mRoutes.isEmpty())
				break label0;
	//   29   56:aload_0         
	//   30   57:getfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   31   60:ifnonnull       155
	//   32   63:aload_0         
	//   33   64:getfield        #59  <Field ArrayList mRoutes>
	//   34   67:invokevirtual   #789 <Method boolean ArrayList.isEmpty()>
	//   35   70:ifne            155
			obj = ((Object) (mRoutes.iterator()));
	//   36   73:aload_0         
	//   37   74:getfield        #59  <Field ArrayList mRoutes>
	//   38   77:invokevirtual   #566 <Method Iterator ArrayList.iterator()>
	//   39   80:astore_2        
			MediaRouter.RouteInfo routeinfo1;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   40   81:aload_2         
	//   41   82:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//   42   87:ifeq            155
				routeinfo1 = (MediaRouter.RouteInfo)((Iterator) (obj)).next();
	//   43   90:aload_2         
	//   44   91:invokeinterface #369 <Method Object Iterator.next()>
	//   45   96:checkcast       #227 <Class MediaRouter$RouteInfo>
	//   46   99:astore_3        
			} while(!isSystemDefaultRoute(routeinfo1) || !routeinfo1.isSelectable());
	//   47  100:aload_0         
	//   48  101:aload_3         
	//   49  102:invokespecial   #791 <Method boolean isSystemDefaultRoute(MediaRouter$RouteInfo)>
	//   50  105:ifeq            81
	//   51  108:aload_3         
	//   52  109:invokevirtual   #573 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//   53  112:ifeq            81
			mDefaultRoute = routeinfo1;
	//   54  115:aload_0         
	//   55  116:aload_3         
	//   56  117:putfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
			obj = ((Object) (new StringBuilder()));
	//   57  120:new             #144 <Class StringBuilder>
	//   58  123:dup             
	//   59  124:invokespecial   #145 <Method void StringBuilder()>
	//   60  127:astore_2        
			((StringBuilder) (obj)).append("Found default route: ");
	//   61  128:aload_2         
	//   62  129:ldc2            #793 <String "Found default route: ">
	//   63  132:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   64  135:pop             
			((StringBuilder) (obj)).append(((Object) (mDefaultRoute)));
	//   65  136:aload_2         
	//   66  137:aload_0         
	//   67  138:getfield        #568 <Field MediaRouter$RouteInfo mDefaultRoute>
	//   68  141:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   69  144:pop             
			Log.i("MediaRouter", ((StringBuilder) (obj)).toString());
	//   70  145:ldc1            #177 <String "MediaRouter">
	//   71  147:aload_2         
	//   72  148:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   73  151:invokestatic    #784 <Method int Log.i(String, String)>
	//   74  154:pop             
		}
label1:
		{
			Object obj1 = ((Object) (mBluetoothRoute));
	//   75  155:aload_0         
	//   76  156:getfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//   77  159:astore_2        
			if(obj1 != null && !((MediaRouter.RouteInfo) (obj1)).isSelectable())
	//*  78  160:aload_2         
	//*  79  161:ifnull          211
	//*  80  164:aload_2         
	//*  81  165:invokevirtual   #573 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//*  82  168:ifne            211
			{
				obj1 = ((Object) (new StringBuilder()));
	//   83  171:new             #144 <Class StringBuilder>
	//   84  174:dup             
	//   85  175:invokespecial   #145 <Method void StringBuilder()>
	//   86  178:astore_2        
				((StringBuilder) (obj1)).append("Clearing the bluetooth route because it is no longer selectable: ");
	//   87  179:aload_2         
	//   88  180:ldc2            #795 <String "Clearing the bluetooth route because it is no longer selectable: ">
	//   89  183:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   90  186:pop             
				((StringBuilder) (obj1)).append(((Object) (mBluetoothRoute)));
	//   91  187:aload_2         
	//   92  188:aload_0         
	//   93  189:getfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//   94  192:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//   95  195:pop             
				Log.i("MediaRouter", ((StringBuilder) (obj1)).toString());
	//   96  196:ldc1            #177 <String "MediaRouter">
	//   97  198:aload_2         
	//   98  199:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   99  202:invokestatic    #784 <Method int Log.i(String, String)>
	//  100  205:pop             
				mBluetoothRoute = null;
	//  101  206:aload_0         
	//  102  207:aconst_null     
	//  103  208:putfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
			}
			if(mBluetoothRoute != null || mRoutes.isEmpty())
				break label1;
	//  104  211:aload_0         
	//  105  212:getfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//  106  215:ifnonnull       310
	//  107  218:aload_0         
	//  108  219:getfield        #59  <Field ArrayList mRoutes>
	//  109  222:invokevirtual   #789 <Method boolean ArrayList.isEmpty()>
	//  110  225:ifne            310
			obj1 = ((Object) (mRoutes.iterator()));
	//  111  228:aload_0         
	//  112  229:getfield        #59  <Field ArrayList mRoutes>
	//  113  232:invokevirtual   #566 <Method Iterator ArrayList.iterator()>
	//  114  235:astore_2        
			MediaRouter.RouteInfo routeinfo2;
			do
			{
				if(!((Iterator) (obj1)).hasNext())
					break label1;
	//  115  236:aload_2         
	//  116  237:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//  117  242:ifeq            310
				routeinfo2 = (MediaRouter.RouteInfo)((Iterator) (obj1)).next();
	//  118  245:aload_2         
	//  119  246:invokeinterface #369 <Method Object Iterator.next()>
	//  120  251:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  121  254:astore_3        
			} while(!isSystemLiveAudioOnlyRoute(routeinfo2) || !routeinfo2.isSelectable());
	//  122  255:aload_0         
	//  123  256:aload_3         
	//  124  257:invokespecial   #570 <Method boolean isSystemLiveAudioOnlyRoute(MediaRouter$RouteInfo)>
	//  125  260:ifeq            236
	//  126  263:aload_3         
	//  127  264:invokevirtual   #573 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//  128  267:ifeq            236
			mBluetoothRoute = routeinfo2;
	//  129  270:aload_0         
	//  130  271:aload_3         
	//  131  272:putfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
			obj1 = ((Object) (new StringBuilder()));
	//  132  275:new             #144 <Class StringBuilder>
	//  133  278:dup             
	//  134  279:invokespecial   #145 <Method void StringBuilder()>
	//  135  282:astore_2        
			((StringBuilder) (obj1)).append("Found bluetooth route: ");
	//  136  283:aload_2         
	//  137  284:ldc2            #797 <String "Found bluetooth route: ">
	//  138  287:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  139  290:pop             
			((StringBuilder) (obj1)).append(((Object) (mBluetoothRoute)));
	//  140  291:aload_2         
	//  141  292:aload_0         
	//  142  293:getfield        #277 <Field MediaRouter$RouteInfo mBluetoothRoute>
	//  143  296:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  144  299:pop             
			Log.i("MediaRouter", ((StringBuilder) (obj1)).toString());
	//  145  300:ldc1            #177 <String "MediaRouter">
	//  146  302:aload_2         
	//  147  303:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  148  306:invokestatic    #784 <Method int Log.i(String, String)>
	//  149  309:pop             
		}
		MediaRouter.RouteInfo routeinfo = mSelectedRoute;
	//  150  310:aload_0         
	//  151  311:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  152  314:astore_2        
		if(routeinfo != null && routeinfo.isSelectable())
	//* 153  315:aload_2         
	//* 154  316:ifnull          579
	//* 155  319:aload_2         
	//* 156  320:invokevirtual   #573 <Method boolean MediaRouter$RouteInfo.isSelectable()>
	//* 157  323:ifne            329
	//* 158  326:goto            579
		{
			if(flag)
	//* 159  329:iload_1         
	//* 160  330:ifeq            623
			{
				Object obj2 = ((Object) (mSelectedRoute));
	//  161  333:aload_0         
	//  162  334:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  163  337:astore_2        
				if(obj2 instanceof MediaRouter.RouteGroup)
	//* 164  338:aload_2         
	//* 165  339:instanceof      #388 <Class MediaRouter$RouteGroup>
	//* 166  342:ifeq            574
				{
					obj2 = ((Object) (((MediaRouter.RouteGroup)obj2).getRoutes()));
	//  167  345:aload_2         
	//  168  346:checkcast       #388 <Class MediaRouter$RouteGroup>
	//  169  349:invokevirtual   #392 <Method List MediaRouter$RouteGroup.getRoutes()>
	//  170  352:astore_2        
					HashSet hashset = new HashSet();
	//  171  353:new             #799 <Class HashSet>
	//  172  356:dup             
	//  173  357:invokespecial   #800 <Method void HashSet()>
	//  174  360:astore_3        
					for(Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((Set) (hashset)).add(((Object) (((MediaRouter.RouteInfo)iterator.next()).mDescriptorId))));
	//  175  361:aload_2         
	//  176  362:invokeinterface #395 <Method Iterator List.iterator()>
	//  177  367:astore          4
	//  178  369:aload           4
	//  179  371:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//  180  376:ifeq            402
	//  181  379:aload_3         
	//  182  380:aload           4
	//  183  382:invokeinterface #369 <Method Object Iterator.next()>
	//  184  387:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  185  390:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  186  393:invokeinterface #803 <Method boolean Set.add(Object)>
	//  187  398:pop             
	//* 188  399:goto            369
					Iterator iterator1 = mRouteControllerMap.entrySet().iterator();
	//  189  402:aload_0         
	//  190  403:getfield        #87  <Field Map mRouteControllerMap>
	//  191  406:invokeinterface #807 <Method Set Map.entrySet()>
	//  192  411:invokeinterface #808 <Method Iterator Set.iterator()>
	//  193  416:astore          4
					do
					{
						if(!iterator1.hasNext())
							break;
	//  194  418:aload           4
	//  195  420:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//  196  425:ifeq            488
						Object obj3 = ((Object) ((java.util.Map.Entry)iterator1.next()));
	//  197  428:aload           4
	//  198  430:invokeinterface #369 <Method Object Iterator.next()>
	//  199  435:checkcast       #810 <Class java.util.Map$Entry>
	//  200  438:astore          5
						if(!((Set) (hashset)).contains(((java.util.Map.Entry) (obj3)).getKey()))
	//* 201  440:aload_3         
	//* 202  441:aload           5
	//* 203  443:invokeinterface #813 <Method Object java.util.Map$Entry.getKey()>
	//* 204  448:invokeinterface #814 <Method boolean Set.contains(Object)>
	//* 205  453:ifne            418
						{
							obj3 = ((Object) ((ller)((java.util.Map.Entry) (obj3)).getValue()));
	//  206  456:aload           5
	//  207  458:invokeinterface #817 <Method Object java.util.Map$Entry.getValue()>
	//  208  463:checkcast       #341 <Class MediaRouteProvider$RouteController>
	//  209  466:astore          5
							((ller) (obj3)).onUnselect();
	//  210  468:aload           5
	//  211  470:invokevirtual   #819 <Method void MediaRouteProvider$RouteController.onUnselect()>
							((ller) (obj3)).onRelease();
	//  212  473:aload           5
	//  213  475:invokevirtual   #348 <Method void MediaRouteProvider$RouteController.onRelease()>
							iterator1.remove();
	//  214  478:aload           4
	//  215  480:invokeinterface #821 <Method void Iterator.remove()>
						}
					} while(true);
	//  216  485:goto            418
					obj2 = ((Object) (((List) (obj2)).iterator()));
	//  217  488:aload_2         
	//  218  489:invokeinterface #395 <Method Iterator List.iterator()>
	//  219  494:astore_2        
					do
					{
						if(!((Iterator) (obj2)).hasNext())
							break;
	//  220  495:aload_2         
	//  221  496:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//  222  501:ifeq            574
						MediaRouter.RouteInfo routeinfo3 = (MediaRouter.RouteInfo)((Iterator) (obj2)).next();
	//  223  504:aload_2         
	//  224  505:invokeinterface #369 <Method Object Iterator.next()>
	//  225  510:checkcast       #227 <Class MediaRouter$RouteInfo>
	//  226  513:astore_3        
						if(!mRouteControllerMap.containsKey(((Object) (routeinfo3.mDescriptorId))))
	//* 227  514:aload_0         
	//* 228  515:getfield        #87  <Field Map mRouteControllerMap>
	//* 229  518:aload_3         
	//* 230  519:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//* 231  522:invokeinterface #824 <Method boolean Map.containsKey(Object)>
	//* 232  527:ifne            495
						{
							ller ller = routeinfo3.getProviderInstance().onCreateRouteController(routeinfo3.mDescriptorId, mSelectedRoute.mDescriptorId);
	//  233  530:aload_3         
	//  234  531:invokevirtual   #241 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//  235  534:aload_3         
	//  236  535:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  237  538:aload_0         
	//  238  539:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  239  542:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  240  545:invokevirtual   #398 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
	//  241  548:astore          4
							ller.onSelect();
	//  242  550:aload           4
	//  243  552:invokevirtual   #381 <Method void MediaRouteProvider$RouteController.onSelect()>
							mRouteControllerMap.put(((Object) (routeinfo3.mDescriptorId)), ((Object) (ller)));
	//  244  555:aload_0         
	//  245  556:getfield        #87  <Field Map mRouteControllerMap>
	//  246  559:aload_3         
	//  247  560:getfield        #244 <Field String MediaRouter$RouteInfo.mDescriptorId>
	//  248  563:aload           4
	//  249  565:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//  250  570:pop             
						}
					} while(true);
	//  251  571:goto            495
				}
				updatePlaybackInfoFromSelectedRoute();
	//  252  574:aload_0         
	//  253  575:invokespecial   #267 <Method void updatePlaybackInfoFromSelectedRoute()>
				return;
	//  254  578:return          
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  255  579:new             #144 <Class StringBuilder>
	//  256  582:dup             
	//  257  583:invokespecial   #145 <Method void StringBuilder()>
	//  258  586:astore_2        
			stringbuilder.append("Unselecting the current route because it is no longer selectable: ");
	//  259  587:aload_2         
	//  260  588:ldc2            #826 <String "Unselecting the current route because it is no longer selectable: ">
	//  261  591:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//  262  594:pop             
			stringbuilder.append(((Object) (mSelectedRoute)));
	//  263  595:aload_2         
	//  264  596:aload_0         
	//  265  597:getfield        #320 <Field MediaRouter$RouteInfo mSelectedRoute>
	//  266  600:invokevirtual   #328 <Method StringBuilder StringBuilder.append(Object)>
	//  267  603:pop             
			Log.i("MediaRouter", stringbuilder.toString());
	//  268  604:ldc1            #177 <String "MediaRouter">
	//  269  606:aload_2         
	//  270  607:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  271  610:invokestatic    #784 <Method int Log.i(String, String)>
	//  272  613:pop             
			setSelectedRouteInternal(chooseFallbackRoute(), 0);
	//  273  614:aload_0         
	//  274  615:aload_0         
	//  275  616:invokevirtual   #828 <Method MediaRouter$RouteInfo chooseFallbackRoute()>
	//  276  619:iconst_0        
	//  277  620:invokespecial   #684 <Method void setSelectedRouteInternal(MediaRouter$RouteInfo, int)>
		}
	//  278  623:return          
	}

	final Context mApplicationContext;
	private MediaRouter.RouteInfo mBluetoothRoute;
	final CallbackHandler mCallbackHandler = new CallbackHandler();
	private MediaSessionCompat mCompatSession;
	private MediaRouter.RouteInfo mDefaultRoute;
	private MediaRouteDiscoveryRequest mDiscoveryRequest;
	private final a mDisplayManager;
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
	private ax mSessionActiveListener;
	final SystemMediaRouteProvider mSystemProvider;
	private final Map mUniqueIdMap = new HashMap();

	MediaRouter$GlobalMediaRouter(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #54  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #55  <Method void ArrayList()>
	//    6   12:putfield        #57  <Field ArrayList mRouters>
	//    7   15:aload_0         
	//    8   16:new             #54  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #55  <Method void ArrayList()>
	//   11   23:putfield        #59  <Field ArrayList mRoutes>
	//   12   26:aload_0         
	//   13   27:new             #61  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #62  <Method void HashMap()>
	//   16   34:putfield        #64  <Field Map mUniqueIdMap>
	//   17   37:aload_0         
	//   18   38:new             #54  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #55  <Method void ArrayList()>
	//   21   45:putfield        #66  <Field ArrayList mProviders>
	//   22   48:aload_0         
	//   23   49:new             #54  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #55  <Method void ArrayList()>
	//   26   56:putfield        #68  <Field ArrayList mRemoteControlClients>
	//   27   59:aload_0         
	//   28   60:new             #70  <Class RemoteControlClientCompat$PlaybackInfo>
	//   29   63:dup             
	//   30   64:invokespecial   #71  <Method void RemoteControlClientCompat$PlaybackInfo()>
	//   31   67:putfield        #73  <Field RemoteControlClientCompat$PlaybackInfo mPlaybackInfo>
		class ProviderCallback extends MediaRouteProvider.Callback
		{

			public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
			{
				updateProviderDescriptor(mediarouteprovider, mediarouteproviderdescriptor);
			//    0    0:aload_0         
			//    1    1:getfield        #10  <Field MediaRouter$GlobalMediaRouter this$0>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #21  <Method void MediaRouter$GlobalMediaRouter.updateProviderDescriptor(MediaRouteProvider, MediaRouteProviderDescriptor)>
			//    5    9:return          
			}

			final MediaRouter.GlobalMediaRouter this$0;

			ProviderCallback()
			{
				this$0 = MediaRouter.GlobalMediaRouter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #10  <Field MediaRouter$GlobalMediaRouter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #13  <Method void MediaRouteProvider$Callback()>
			//    5    9:return          
			}
		}

	//   32   70:aload_0         
	//   33   71:new             #75  <Class MediaRouter$GlobalMediaRouter$ProviderCallback>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:invokespecial   #78  <Method void MediaRouter$GlobalMediaRouter$ProviderCallback(MediaRouter$GlobalMediaRouter)>
	//   37   79:putfield        #80  <Field MediaRouter$GlobalMediaRouter$ProviderCallback mProviderCallback>
		class CallbackHandler extends Handler
		{

			private void invokeCallback(MediaRouter.CallbackRecord callbackrecord, int i, Object obj, int j)
			{
				MediaRouter mediarouter = callbackrecord.mRouter;
			//    0    0:aload_1         
			//    1    1:getfield        #56  <Field MediaRouter MediaRouter$CallbackRecord.mRouter>
			//    2    4:astore          6
				MediaRouter.Callback callback = callbackrecord.mCallback;
			//    3    6:aload_1         
			//    4    7:getfield        #60  <Field MediaRouter$Callback MediaRouter$CallbackRecord.mCallback>
			//    5   10:astore          7
				int k = 0xff00 & i;
			//    6   12:ldc1            #27  <Int 65280>
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
			//   18   36:checkcast       #62  <Class MediaRouter$ProviderInfo>
			//   19   39:astore_1        
					switch(i)
			//*  20   40:iload_2         
					{
			//*  21   41:tableswitch     513 515: default 68
			//			               513 87
			//			               514 78
			//			               515 69
					default:
						return;
			//   22   68:return          

					case 515: 
						callback.onProviderChanged(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
			//   23   69:aload           7
			//   24   71:aload           6
			//   25   73:aload_1         
			//   26   74:invokevirtual   #68  <Method void MediaRouter$Callback.onProviderChanged(MediaRouter, MediaRouter$ProviderInfo)>
						return;
			//   27   77:return          

					case 514: 
						callback.onProviderRemoved(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
			//   28   78:aload           7
			//   29   80:aload           6
			//   30   82:aload_1         
			//   31   83:invokevirtual   #71  <Method void MediaRouter$Callback.onProviderRemoved(MediaRouter, MediaRouter$ProviderInfo)>
						return;
			//   32   86:return          

					case 513: 
						callback.onProviderAdded(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
			//   33   87:aload           7
			//   34   89:aload           6
			//   35   91:aload_1         
			//   36   92:invokevirtual   #74  <Method void MediaRouter$Callback.onProviderAdded(MediaRouter, MediaRouter$ProviderInfo)>
						return;
			//   37   95:return          
					}
				}
				obj = ((Object) ((MediaRouter.RouteInfo)obj));
			//   38   96:aload_3         
			//   39   97:checkcast       #76  <Class MediaRouter$RouteInfo>
			//   40  100:astore_3        
				if(!callbackrecord.filterRouteEvent(((MediaRouter.RouteInfo) (obj))))
			//*  41  101:aload_1         
			//*  42  102:aload_3         
			//*  43  103:invokevirtual   #80  <Method boolean MediaRouter$CallbackRecord.filterRouteEvent(MediaRouter$RouteInfo)>
			//*  44  106:ifne            110
					return;
			//   45  109:return          
				switch(i)
			//*  46  110:iload_2         
				{
			//*  47  111:tableswitch     257 263: default 152
			//			               257 209
			//			               258 200
			//			               259 191
			//			               260 182
			//			               261 173
			//			               262 164
			//			               263 153
				default:
					return;
			//   48  152:return          

				case 263: 
					callback.onRouteUnselected(mediarouter, ((MediaRouter.RouteInfo) (obj)), j);
			//   49  153:aload           7
			//   50  155:aload           6
			//   51  157:aload_3         
			//   52  158:iload           4
			//   53  160:invokevirtual   #84  <Method void MediaRouter$Callback.onRouteUnselected(MediaRouter, MediaRouter$RouteInfo, int)>
					return;
			//   54  163:return          

				case 262: 
					callback.onRouteSelected(mediarouter, ((MediaRouter.RouteInfo) (obj)));
			//   55  164:aload           7
			//   56  166:aload           6
			//   57  168:aload_3         
			//   58  169:invokevirtual   #88  <Method void MediaRouter$Callback.onRouteSelected(MediaRouter, MediaRouter$RouteInfo)>
					return;
			//   59  172:return          

				case 261: 
					callback.onRoutePresentationDisplayChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
			//   60  173:aload           7
			//   61  175:aload           6
			//   62  177:aload_3         
			//   63  178:invokevirtual   #91  <Method void MediaRouter$Callback.onRoutePresentationDisplayChanged(MediaRouter, MediaRouter$RouteInfo)>
					return;
			//   64  181:return          

				case 260: 
					callback.onRouteVolumeChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
			//   65  182:aload           7
			//   66  184:aload           6
			//   67  186:aload_3         
			//   68  187:invokevirtual   #94  <Method void MediaRouter$Callback.onRouteVolumeChanged(MediaRouter, MediaRouter$RouteInfo)>
					return;
			//   69  190:return          

				case 259: 
					callback.onRouteChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
			//   70  191:aload           7
			//   71  193:aload           6
			//   72  195:aload_3         
			//   73  196:invokevirtual   #97  <Method void MediaRouter$Callback.onRouteChanged(MediaRouter, MediaRouter$RouteInfo)>
					return;
			//   74  199:return          

				case 258: 
					callback.onRouteRemoved(mediarouter, ((MediaRouter.RouteInfo) (obj)));
			//   75  200:aload           7
			//   76  202:aload           6
			//   77  204:aload_3         
			//   78  205:invokevirtual   #100 <Method void MediaRouter$Callback.onRouteRemoved(MediaRouter, MediaRouter$RouteInfo)>
					return;
			//   79  208:return          

				case 257: 
					callback.onRouteAdded(mediarouter, ((MediaRouter.RouteInfo) (obj)));
			//   80  209:aload           7
			//   81  211:aload           6
			//   82  213:aload_3         
			//   83  214:invokevirtual   #103 <Method void MediaRouter$Callback.onRouteAdded(MediaRouter, MediaRouter$RouteInfo)>
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
			//			               257 67
			//			               258 52
			//			               259 37
					default:
						return;
			//    5   36:return          

					case 259: 
						mSystemProvider.onSyncRouteChanged((MediaRouter.RouteInfo)obj);
			//    6   37:aload_0         
			//    7   38:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//    8   41:getfield        #111 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
			//    9   44:aload_2         
			//   10   45:checkcast       #76  <Class MediaRouter$RouteInfo>
			//   11   48:invokevirtual   #117 <Method void SystemMediaRouteProvider.onSyncRouteChanged(MediaRouter$RouteInfo)>
						return;
			//   12   51:return          

					case 258: 
						mSystemProvider.onSyncRouteRemoved((MediaRouter.RouteInfo)obj);
			//   13   52:aload_0         
			//   14   53:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//   15   56:getfield        #111 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
			//   16   59:aload_2         
			//   17   60:checkcast       #76  <Class MediaRouter$RouteInfo>
			//   18   63:invokevirtual   #120 <Method void SystemMediaRouteProvider.onSyncRouteRemoved(MediaRouter$RouteInfo)>
						return;
			//   19   66:return          

					case 257: 
						mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)obj);
			//   20   67:aload_0         
			//   21   68:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//   22   71:getfield        #111 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
			//   23   74:aload_2         
			//   24   75:checkcast       #76  <Class MediaRouter$RouteInfo>
			//   25   78:invokevirtual   #123 <Method void SystemMediaRouteProvider.onSyncRouteAdded(MediaRouter$RouteInfo)>
						return;
			//   26   81:return          
					}
				} else
				{
					mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)obj);
			//   27   82:aload_0         
			//   28   83:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//   29   86:getfield        #111 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
			//   30   89:aload_2         
			//   31   90:checkcast       #76  <Class MediaRouter$RouteInfo>
			//   32   93:invokevirtual   #126 <Method void SystemMediaRouteProvider.onSyncRouteSelected(MediaRouter$RouteInfo)>
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
			//    1    1:getfield        #133 <Field int Message.what>
			//    2    4:istore_3        
				obj = message.obj;
			//    3    5:aload_1         
			//    4    6:getfield        #137 <Field Object Message.obj>
			//    5    9:astore          6
				k = message.arg1;
			//    6   11:aload_1         
			//    7   12:getfield        #140 <Field int Message.arg1>
			//    8   15:istore          4
				if(j == 259 && getSelectedRoute().getId().equals(((Object) (((MediaRouter.RouteInfo)obj).getId()))))
			//*   9   17:iload_3         
			//*  10   18:sipush          259
			//*  11   21:icmpne          56
			//*  12   24:aload_0         
			//*  13   25:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//*  14   28:invokevirtual   #144 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
			//*  15   31:invokevirtual   #148 <Method String MediaRouter$RouteInfo.getId()>
			//*  16   34:aload           6
			//*  17   36:checkcast       #76  <Class MediaRouter$RouteInfo>
			//*  18   39:invokevirtual   #148 <Method String MediaRouter$RouteInfo.getId()>
			//*  19   42:invokevirtual   #154 <Method boolean String.equals(Object)>
			//*  20   45:ifeq            56
					updateSelectedRouteIfNeeded(true);
			//   21   48:aload_0         
			//   22   49:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//   23   52:iconst_1        
			//   24   53:invokevirtual   #158 <Method void MediaRouter$GlobalMediaRouter.updateSelectedRouteIfNeeded(boolean)>
				syncWithSystemProvider(j, obj);
			//   25   56:aload_0         
			//   26   57:iload_3         
			//   27   58:aload           6
			//   28   60:invokespecial   #160 <Method void syncWithSystemProvider(int, Object)>
				int i = mRouters.size();
			//   29   63:aload_0         
			//   30   64:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//   31   67:getfield        #163 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
			//   32   70:invokevirtual   #167 <Method int ArrayList.size()>
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
			//   41   83:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//   42   86:getfield        #163 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
			//   43   89:iload_2         
			//   44   90:invokevirtual   #171 <Method Object ArrayList.get(int)>
			//   45   93:checkcast       #173 <Class WeakReference>
			//   46   96:invokevirtual   #176 <Method Object WeakReference.get()>
			//   47   99:checkcast       #178 <Class MediaRouter>
			//   48  102:astore_1        
				if(message != null)
					break MISSING_BLOCK_LABEL_122;
			//   49  103:aload_1         
			//   50  104:ifnonnull       122
				mRouters.remove(i);
			//   51  107:aload_0         
			//   52  108:getfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
			//   53  111:getfield        #163 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
			//   54  114:iload_2         
			//   55  115:invokevirtual   #181 <Method Object ArrayList.remove(int)>
			//   56  118:pop             
				  goto _L1
			//*  57  119:goto            74
				mTempCallbackRecords.addAll(((Collection) (((MediaRouter) (message)).mCallbackRecords)));
			//   58  122:aload_0         
			//   59  123:getfield        #47  <Field ArrayList mTempCallbackRecords>
			//   60  126:aload_1         
			//   61  127:getfield        #184 <Field ArrayList MediaRouter.mCallbackRecords>
			//   62  130:invokevirtual   #188 <Method boolean ArrayList.addAll(Collection)>
			//   63  133:pop             
				  goto _L1
			//*  64  134:goto            74
				int l = mTempCallbackRecords.size();
			//   65  137:aload_0         
			//   66  138:getfield        #47  <Field ArrayList mTempCallbackRecords>
			//   67  141:invokevirtual   #167 <Method int ArrayList.size()>
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
			//   76  156:getfield        #47  <Field ArrayList mTempCallbackRecords>
			//   77  159:iload_2         
			//   78  160:invokevirtual   #171 <Method Object ArrayList.get(int)>
			//   79  163:checkcast       #52  <Class MediaRouter$CallbackRecord>
			//   80  166:iload_3         
			//   81  167:aload           6
			//   82  169:iload           4
			//   83  171:invokespecial   #190 <Method void invokeCallback(MediaRouter$CallbackRecord, int, Object, int)>
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
			//   90  182:getfield        #47  <Field ArrayList mTempCallbackRecords>
			//   91  185:invokevirtual   #193 <Method void ArrayList.clear()>
				return;
			//   92  188:return          
				message;
			//   93  189:astore_1        
				mTempCallbackRecords.clear();
			//   94  190:aload_0         
			//   95  191:getfield        #47  <Field ArrayList mTempCallbackRecords>
			//   96  194:invokevirtual   #193 <Method void ArrayList.clear()>
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
			//    3    3:invokevirtual   #198 <Method Message obtainMessage(int, Object)>
			//    4    6:invokevirtual   #201 <Method void Message.sendToTarget()>
			//    5    9:return          
			}

			public void post(int i, Object obj, int j)
			{
				obj = ((Object) (obtainMessage(i, obj)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #198 <Method Message obtainMessage(int, Object)>
			//    4    6:astore_2        
				obj.arg1 = j;
			//    5    7:aload_2         
			//    6    8:iload_3         
			//    7    9:putfield        #140 <Field int Message.arg1>
				((Message) (obj)).sendToTarget();
			//    8   12:aload_2         
			//    9   13:invokevirtual   #201 <Method void Message.sendToTarget()>
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
			//    2    2:putfield        #39  <Field MediaRouter$GlobalMediaRouter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #42  <Method void Handler()>
			//    5    9:aload_0         
			//    6   10:new             #44  <Class ArrayList>
			//    7   13:dup             
			//    8   14:invokespecial   #45  <Method void ArrayList()>
			//    9   17:putfield        #47  <Field ArrayList mTempCallbackRecords>
			//   10   20:return          
			}
		}

	//   38   82:aload_0         
	//   39   83:new             #82  <Class MediaRouter$GlobalMediaRouter$CallbackHandler>
	//   40   86:dup             
	//   41   87:aload_0         
	//   42   88:invokespecial   #83  <Method void MediaRouter$GlobalMediaRouter$CallbackHandler(MediaRouter$GlobalMediaRouter)>
	//   43   91:putfield        #85  <Field MediaRouter$GlobalMediaRouter$CallbackHandler mCallbackHandler>
	//   44   94:aload_0         
	//   45   95:new             #61  <Class HashMap>
	//   46   98:dup             
	//   47   99:invokespecial   #62  <Method void HashMap()>
	//   48  102:putfield        #87  <Field Map mRouteControllerMap>
		class _cls1
			implements ax
		{

			public void onActiveChanged()
			{
				if(mRccMediaSession != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
			//*   2    4:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//*   3    7:ifnull          56
				{
					if(mRccMediaSession.a())
			//*   4   10:aload_0         
			//*   5   11:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
			//*   6   14:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//*   7   17:invokevirtual   #29  <Method boolean MediaSessionCompat.a()>
			//*   8   20:ifeq            40
					{
						MediaRouter.GlobalMediaRouter globalmediarouter = MediaRouter.GlobalMediaRouter.this;
			//    9   23:aload_0         
			//   10   24:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
			//   11   27:astore_1        
						globalmediarouter.addRemoteControlClient(globalmediarouter.mRccMediaSession.e());
			//   12   28:aload_1         
			//   13   29:aload_1         
			//   14   30:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//   15   33:invokevirtual   #33  <Method Object MediaSessionCompat.e()>
			//   16   36:invokevirtual   #37  <Method void MediaRouter$GlobalMediaRouter.addRemoteControlClient(Object)>
						return;
			//   17   39:return          
					}
					MediaRouter.GlobalMediaRouter globalmediarouter1 = MediaRouter.GlobalMediaRouter.this;
			//   18   40:aload_0         
			//   19   41:getfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
			//   20   44:astore_1        
					globalmediarouter1.removeRemoteControlClient(globalmediarouter1.mRccMediaSession.e());
			//   21   45:aload_1         
			//   22   46:aload_1         
			//   23   47:getfield        #23  <Field MediaSessionCompat MediaRouter$GlobalMediaRouter.mRccMediaSession>
			//   24   50:invokevirtual   #33  <Method Object MediaSessionCompat.e()>
			//   25   53:invokevirtual   #40  <Method void MediaRouter$GlobalMediaRouter.removeRemoteControlClient(Object)>
				}
			//   26   56:return          
			}

			final MediaRouter.GlobalMediaRouter this$0;

			_cls1()
			{
				this$0 = MediaRouter.GlobalMediaRouter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MediaRouter$GlobalMediaRouter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Object()>
			//    5    9:return          
			}
		}

		mSessionActiveListener = ((ax) (new _cls1()));
	//   49  105:aload_0         
	//   50  106:new             #89  <Class MediaRouter$GlobalMediaRouter$1>
	//   51  109:dup             
	//   52  110:aload_0         
	//   53  111:invokespecial   #90  <Method void MediaRouter$GlobalMediaRouter$1(MediaRouter$GlobalMediaRouter)>
	//   54  114:putfield        #92  <Field ax mSessionActiveListener>
		mApplicationContext = context;
	//   55  117:aload_0         
	//   56  118:aload_1         
	//   57  119:putfield        #94  <Field Context mApplicationContext>
		mDisplayManager = a.a(context);
	//   58  122:aload_0         
	//   59  123:aload_1         
	//   60  124:invokestatic    #100 <Method a a.a(Context)>
	//   61  127:putfield        #102 <Field a mDisplayManager>
		mLowRam = h.a((ActivityManager)context.getSystemService("activity"));
	//   62  130:aload_0         
	//   63  131:aload_1         
	//   64  132:ldc1            #104 <String "activity">
	//   65  134:invokevirtual   #110 <Method Object Context.getSystemService(String)>
	//   66  137:checkcast       #112 <Class ActivityManager>
	//   67  140:invokestatic    #117 <Method boolean h.a(ActivityManager)>
	//   68  143:putfield        #119 <Field boolean mLowRam>
		mSystemProvider = SystemMediaRouteProvider.obtain(context, ((allback) (this)));
	//   69  146:aload_0         
	//   70  147:aload_1         
	//   71  148:aload_0         
	//   72  149:invokestatic    #125 <Method SystemMediaRouteProvider SystemMediaRouteProvider.obtain(Context, SystemMediaRouteProvider$SyncCallback)>
	//   73  152:putfield        #127 <Field SystemMediaRouteProvider mSystemProvider>
	//   74  155:return          
	}
}
