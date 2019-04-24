// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.app.ActivityManager;
import android.content.*;
import android.content.res.Resources;
import android.net.Uri;
import android.os.*;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.hardware.display.DisplayManagerCompat;
import android.support.v4.media.VolumeProviderCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteSelector, MediaRouteProvider, SystemMediaRouteProvider, MediaRouteProviderDescriptor, 
//			MediaRouteDescriptor, RegisteredMediaRouteProviderWatcher, MediaRouteDiscoveryRequest, RemoteControlClientCompat

public final class MediaRouter
{
	public static abstract class Callback
	{

		public void onProviderAdded(MediaRouter mediarouter, ProviderInfo providerinfo)
		{
		//    0    0:return          
		}

		public void onProviderChanged(MediaRouter mediarouter, ProviderInfo providerinfo)
		{
		//    0    0:return          
		}

		public void onProviderRemoved(MediaRouter mediarouter, ProviderInfo providerinfo)
		{
		//    0    0:return          
		}

		public void onRouteAdded(MediaRouter mediarouter, RouteInfo routeinfo)
		{
		//    0    0:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, RouteInfo routeinfo)
		{
		//    0    0:return          
		}

		public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, RouteInfo routeinfo)
		{
		//    0    0:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, RouteInfo routeinfo)
		{
		//    0    0:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, RouteInfo routeinfo)
		{
		//    0    0:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, RouteInfo routeinfo)
		{
		//    0    0:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, RouteInfo routeinfo, int i)
		{
			onRouteUnselected(mediarouter, routeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #26  <Method void onRouteUnselected(MediaRouter, MediaRouter$RouteInfo)>
		//    4    6:return          
		}

		public void onRouteVolumeChanged(MediaRouter mediarouter, RouteInfo routeinfo)
		{
		//    0    0:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private static interface CallbackFlags
		extends Annotation
	{
	}

	private static final class CallbackRecord
	{

		public boolean filterRouteEvent(RouteInfo routeinfo)
		{
			return (mFlags & 2) != 0 || routeinfo.matchesSelector(mSelector);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int mFlags>
		//    2    4:iconst_2        
		//    3    5:iand            
		//    4    6:ifne            25
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #31  <Field MediaRouteSelector mSelector>
		//    8   14:invokevirtual   #42  <Method boolean MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
		//    9   17:ifeq            23
		//   10   20:goto            25
		//   11   23:iconst_0        
		//   12   24:ireturn         
		//   13   25:iconst_1        
		//   14   26:ireturn         
		}

		public final Callback mCallback;
		public int mFlags;
		public final MediaRouter mRouter;
		public MediaRouteSelector mSelector;

		public CallbackRecord(MediaRouter mediarouter, Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mRouter = mediarouter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field MediaRouter mRouter>
			mCallback = callback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field MediaRouter$Callback mCallback>
			mSelector = MediaRouteSelector.EMPTY;
		//    8   14:aload_0         
		//    9   15:getstatic       #29  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
		//   10   18:putfield        #31  <Field MediaRouteSelector mSelector>
		//   11   21:return          
		}
	}

	public static abstract class ControlRequestCallback
	{

		public void onError(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onResult(Bundle bundle)
		{
		//    0    0:return          
		}

		public ControlRequestCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class GlobalMediaRouter
		implements SystemMediaRouteProvider.SyncCallback, RegisteredMediaRouteProviderWatcher.Callback
	{

		private String assignRouteUniqueId(ProviderInfo providerinfo, String s)
		{
			providerinfo = ((ProviderInfo) (providerinfo.getComponentName().flattenToShortString()));
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
				if(((ProviderInfo)mProviders.get(i)).mProviderInstance == mediarouteprovider)
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
				if(((RouteInfo)mRoutes.get(i)).mUniqueId.equals(((Object) (s))))
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

		private String getUniqueId(ProviderInfo providerinfo, String s)
		{
			providerinfo = ((ProviderInfo) (providerinfo.getComponentName().flattenToShortString()));
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

		private boolean isSystemDefaultRoute(RouteInfo routeinfo)
		{
			return routeinfo.getProviderInstance() == mSystemProvider && routeinfo.mDescriptorId.equals("DEFAULT_ROUTE");
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

		private boolean isSystemLiveAudioOnlyRoute(RouteInfo routeinfo)
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

		private void setSelectedRouteInternal(RouteInfo routeinfo, int i)
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
						MediaRouteProvider.RouteController routecontroller;
						for(Iterator iterator = mRouteControllerMap.values().iterator(); iterator.hasNext(); routecontroller.onRelease())
		//* 175  381:aload_0         
		//* 176  382:getfield        #112 <Field Map mRouteControllerMap>
		//* 177  385:invokeinterface #388 <Method Collection Map.values()>
		//* 178  390:invokeinterface #394 <Method Iterator Collection.iterator()>
		//* 179  395:astore          4
		//* 180  397:aload           4
		//* 181  399:invokeinterface #399 <Method boolean Iterator.hasNext()>
		//* 182  404:ifeq            433
						{
							routecontroller = (MediaRouteProvider.RouteController)iterator.next();
		//  183  407:aload           4
		//  184  409:invokeinterface #402 <Method Object Iterator.next()>
		//  185  414:checkcast       #374 <Class MediaRouteProvider$RouteController>
		//  186  417:astore          5
							routecontroller.onUnselect(i);
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
				mSelectedRouteController = routeinfo.getProviderInstance().onCreateRouteController(routeinfo.mDescriptorId);
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
					routeinfo = ((RouteInfo) (new StringBuilder()));
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
				if(mSelectedRoute instanceof RouteGroup)
		//* 238  531:aload_0         
		//* 239  532:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
		//* 240  535:instanceof      #421 <Class MediaRouter$RouteGroup>
		//* 241  538:ifeq            635
				{
					routeinfo = ((RouteInfo) (((RouteGroup)mSelectedRoute).getRoutes()));
		//  242  541:aload_0         
		//  243  542:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
		//  244  545:checkcast       #421 <Class MediaRouter$RouteGroup>
		//  245  548:invokevirtual   #425 <Method List MediaRouter$RouteGroup.getRoutes()>
		//  246  551:astore_1        
					mRouteControllerMap.clear();
		//  247  552:aload_0         
		//  248  553:getfield        #112 <Field Map mRouteControllerMap>
		//  249  556:invokeinterface #405 <Method void Map.clear()>
					RouteInfo routeinfo1;
					MediaRouteProvider.RouteController routecontroller1;
					for(routeinfo = ((RouteInfo) (((List) (routeinfo)).iterator())); ((Iterator) (routeinfo)).hasNext(); mRouteControllerMap.put(((Object) (routeinfo1.mDescriptorId)), ((Object) (routecontroller1))))
		//* 250  561:aload_1         
		//* 251  562:invokeinterface #428 <Method Iterator List.iterator()>
		//* 252  567:astore_1        
		//* 253  568:aload_1         
		//* 254  569:invokeinterface #399 <Method boolean Iterator.hasNext()>
		//* 255  574:ifeq            635
					{
						routeinfo1 = (RouteInfo)((Iterator) (routeinfo)).next();
		//  256  577:aload_1         
		//  257  578:invokeinterface #402 <Method Object Iterator.next()>
		//  258  583:checkcast       #260 <Class MediaRouter$RouteInfo>
		//  259  586:astore          4
						routecontroller1 = routeinfo1.getProviderInstance().onCreateRouteController(routeinfo1.mDescriptorId, mSelectedRoute.mDescriptorId);
		//  260  588:aload           4
		//  261  590:invokevirtual   #277 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
		//  262  593:aload           4
		//  263  595:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
		//  264  598:aload_0         
		//  265  599:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
		//  266  602:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
		//  267  605:invokevirtual   #431 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
		//  268  608:astore          5
						routecontroller1.onSelect();
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

		private void updateProviderContents(ProviderInfo providerinfo, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
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
										mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new RouteGroup(providerinfo, ((String) (mediarouteproviderdescriptor)), s)));
		//   61  129:new             #421 <Class MediaRouter$RouteGroup>
		//   62  132:dup             
		//   63  133:aload_1         
		//   64  134:aload_2         
		//   65  135:aload           13
		//   66  137:invokespecial   #507 <Method void MediaRouter$RouteGroup(MediaRouter$ProviderInfo, String, String)>
		//   67  140:astore_2        
									else
		//*  68  141:goto            156
										mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (new RouteInfo(providerinfo, ((String) (mediarouteproviderdescriptor)), s)));
		//   69  144:new             #260 <Class MediaRouter$RouteInfo>
		//   70  147:dup             
		//   71  148:aload_1         
		//   72  149:aload_2         
		//   73  150:aload           13
		//   74  152:invokespecial   #508 <Method void MediaRouter$RouteInfo(MediaRouter$ProviderInfo, String, String)>
		//   75  155:astore_2        
									providerinfo.mRoutes.add(i, ((Object) (mediarouteproviderdescriptor)));
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
										((RouteInfo) (mediarouteproviderdescriptor)).maybeUpdateDescriptor(((MediaRouteDescriptor) (obj)));
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
								mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((RouteInfo)providerinfo.mRoutes.get(i1)));
		//  151  311:aload_1         
		//  152  312:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
		//  153  315:iload           5
		//  154  317:invokeinterface #491 <Method Object List.get(int)>
		//  155  322:checkcast       #260 <Class MediaRouter$RouteInfo>
		//  156  325:astore_2        
								Collections.swap(providerinfo.mRoutes, i1, i);
		//  157  326:aload_1         
		//  158  327:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
		//  159  330:iload           5
		//  160  332:iload_3         
		//  161  333:invokestatic    #532 <Method void Collections.swap(List, int, int)>
								boolean flag1;
								if(mediarouteproviderdescriptor instanceof RouteGroup)
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
									if(updateRouteDescriptorAndNotify(((RouteInfo) (mediarouteproviderdescriptor)), ((MediaRouteDescriptor) (obj))) != 0)
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
							RouteInfo routeinfo;
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
								routeinfo = (RouteInfo)pair1.first;
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
								RouteInfo routeinfo1 = (RouteInfo)pair.first;
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
				for(int j = providerinfo.mRoutes.size() - 1; j >= l; j--)
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
					mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((RouteInfo)providerinfo.mRoutes.get(j)));
		//  309  661:aload_1         
		//  310  662:invokestatic    #512 <Method List MediaRouter$ProviderInfo.access$600(MediaRouter$ProviderInfo)>
		//  311  665:iload_3         
		//  312  666:invokeinterface #491 <Method Object List.get(int)>
		//  313  671:checkcast       #260 <Class MediaRouter$RouteInfo>
		//  314  674:astore_2        
					((RouteInfo) (mediarouteproviderdescriptor)).maybeUpdateDescriptor(((MediaRouteDescriptor) (null)));
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
				for(int k = providerinfo.mRoutes.size() - 1; k >= l; k--)
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
					mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) ((RouteInfo)providerinfo.mRoutes.remove(k)));
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

		private int updateRouteDescriptorAndNotify(RouteInfo routeinfo, MediaRouteDescriptor mediaroutedescriptor)
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
				RouteInfo routeinfo;
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break label0;
		//   39   82:aload_2         
		//   40   83:invokeinterface #399 <Method boolean Iterator.hasNext()>
		//   41   88:ifeq            156
					routeinfo = (RouteInfo)((Iterator) (obj)).next();
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
				RouteInfo routeinfo1;
				do
				{
					if(!((Iterator) (obj1)).hasNext())
						break label1;
		//  113  238:aload_2         
		//  114  239:invokeinterface #399 <Method boolean Iterator.hasNext()>
		//  115  244:ifeq            312
					routeinfo1 = (RouteInfo)((Iterator) (obj1)).next();
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
					if(mSelectedRoute instanceof RouteGroup)
		//* 158  336:aload_0         
		//* 159  337:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
		//* 160  340:instanceof      #421 <Class MediaRouter$RouteGroup>
		//* 161  343:ifeq            578
					{
						Object obj2 = ((Object) (((RouteGroup)mSelectedRoute).getRoutes()));
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
						for(Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((Set) (hashset)).add(((Object) (((RouteInfo)iterator.next()).mDescriptorId))));
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
								obj3 = ((Object) ((MediaRouteProvider.RouteController)((java.util.Map.Entry) (obj3)).getValue()));
		//  202  460:aload           5
		//  203  462:invokeinterface #604 <Method Object java.util.Map$Entry.getValue()>
		//  204  467:checkcast       #374 <Class MediaRouteProvider$RouteController>
		//  205  470:astore          5
								((MediaRouteProvider.RouteController) (obj3)).onUnselect();
		//  206  472:aload           5
		//  207  474:invokevirtual   #606 <Method void MediaRouteProvider$RouteController.onUnselect()>
								((MediaRouteProvider.RouteController) (obj3)).onRelease();
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
							RouteInfo routeinfo2 = (RouteInfo)((Iterator) (obj2)).next();
		//  219  508:aload_2         
		//  220  509:invokeinterface #402 <Method Object Iterator.next()>
		//  221  514:checkcast       #260 <Class MediaRouter$RouteInfo>
		//  222  517:astore_3        
							if(!mRouteControllerMap.containsKey(((Object) (routeinfo2.mDescriptorId))))
		//* 223  518:aload_0         
		//* 224  519:getfield        #112 <Field Map mRouteControllerMap>
		//* 225  522:aload_3         
		//* 226  523:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
		//* 227  526:invokeinterface #611 <Method boolean Map.containsKey(Object)>
		//* 228  531:ifne            499
							{
								MediaRouteProvider.RouteController routecontroller = routeinfo2.getProviderInstance().onCreateRouteController(routeinfo2.mDescriptorId, mSelectedRoute.mDescriptorId);
		//  229  534:aload_3         
		//  230  535:invokevirtual   #277 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
		//  231  538:aload_3         
		//  232  539:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
		//  233  542:aload_0         
		//  234  543:getfield        #353 <Field MediaRouter$RouteInfo mSelectedRoute>
		//  235  546:invokestatic    #280 <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
		//  236  549:invokevirtual   #431 <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
		//  237  552:astore          4
								routecontroller.onSelect();
		//  238  554:aload           4
		//  239  556:invokevirtual   #414 <Method void MediaRouteProvider$RouteController.onSelect()>
								mRouteControllerMap.put(((Object) (routeinfo2.mDescriptorId)), ((Object) (routecontroller)));
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
				ProviderInfo providerinfo = new ProviderInfo(mediarouteprovider);
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

		RouteInfo chooseFallbackRoute()
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
				RouteInfo routeinfo = (RouteInfo)iterator.next();
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

		RouteInfo getBluetoothRoute()
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

		RouteInfo getDefaultRoute()
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

		public RouteInfo getRoute(String s)
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
				RouteInfo routeinfo = (RouteInfo)iterator.next();
		//    7   17:aload_2         
		//    8   18:invokeinterface #402 <Method Object Iterator.next()>
		//    9   23:checkcast       #260 <Class MediaRouter$RouteInfo>
		//   10   26:astore_3        
				if(routeinfo.mUniqueId.equals(((Object) (s))))
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
						context = ((Context) (new MediaRouter(context)));
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

		RouteInfo getSelectedRoute()
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
				RouteInfo routeinfo = (RouteInfo)mRoutes.get(j);
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
				ProviderInfo providerinfo = (ProviderInfo)mProviders.get(i);
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
					((RouteInfo)providerinfo.mRoutes.get(i)).select();
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
				mediarouteprovider = ((MediaRouteProvider) ((ProviderInfo)mProviders.get(i)));
		//   12   20:aload_0         
		//   13   21:getfield        #95  <Field ArrayList mProviders>
		//   14   24:iload_2         
		//   15   25:invokevirtual   #248 <Method Object ArrayList.get(int)>
		//   16   28:checkcast       #167 <Class MediaRouter$ProviderInfo>
		//   17   31:astore_1        
				updateProviderContents(((ProviderInfo) (mediarouteprovider)), ((MediaRouteProviderDescriptor) (null)));
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

		public void requestSetVolume(RouteInfo routeinfo, int i)
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
				routeinfo = ((RouteInfo) ((MediaRouteProvider.RouteController)mRouteControllerMap.get(((Object) (routeinfo.mDescriptorId)))));
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
					((MediaRouteProvider.RouteController) (routeinfo)).onSetVolume(i);
		//   25   57:aload_1         
		//   26   58:iload_2         
		//   27   59:invokevirtual   #741 <Method void MediaRouteProvider$RouteController.onSetVolume(int)>
			}
		//   28   62:return          
		}

		public void requestUpdateVolume(RouteInfo routeinfo, int i)
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

		void selectRoute(RouteInfo routeinfo)
		{
			selectRoute(routeinfo, 3);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #749 <Method void selectRoute(MediaRouter$RouteInfo, int)>
		//    4    6:return          
		}

		void selectRoute(RouteInfo routeinfo, int i)
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
			if(!routeinfo.mEnabled)
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

		public void sendControlRequest(RouteInfo routeinfo, Intent intent, ControlRequestCallback controlrequestcallback)
		{
			if(routeinfo == mSelectedRoute && mSelectedRouteController != null && mSelectedRouteController.onControlRequest(intent, controlrequestcallback))
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
			if(controlrequestcallback != null)
		//*  14   28:aload_3         
		//*  15   29:ifnull          38
				controlrequestcallback.onError(((String) (null)), ((Bundle) (null)));
		//   16   32:aload_3         
		//   17   33:aconst_null     
		//   18   34:aconst_null     
		//   19   35:invokevirtual   #769 <Method void MediaRouter$ControlRequestCallback.onError(String, Bundle)>
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
			mRegisteredProviderWatcher = new RegisteredMediaRouteProviderWatcher(mApplicationContext, ((RegisteredMediaRouteProviderWatcher.Callback) (this)));
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
						CallbackRecord callbackrecord = (CallbackRecord)mediarouter.mCallbackRecords.get(i);
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
				((ProviderInfo)mProviders.get(j)).mProviderInstance.setDiscoveryRequest(mDiscoveryRequest);
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
				updateProviderContents((ProviderInfo)mProviders.get(i), mediarouteproviderdescriptor);
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
		private RouteInfo mBluetoothRoute;
		final CallbackHandler mCallbackHandler = new CallbackHandler();
		private MediaSessionCompat mCompatSession;
		private RouteInfo mDefaultRoute;
		private MediaRouteDiscoveryRequest mDiscoveryRequest;
		private final DisplayManagerCompat mDisplayManager;
		private final boolean mLowRam;
		private MediaSessionRecord mMediaSession;
		final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
		private final ProviderCallback mProviderCallback = new ProviderCallback();
		private final ArrayList mProviders = new ArrayList();
		MediaSessionCompat mRccMediaSession;
		private RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
		private final ArrayList mRemoteControlClients = new ArrayList();
		private final Map mRouteControllerMap = new HashMap();
		final ArrayList mRouters = new ArrayList();
		private final ArrayList mRoutes = new ArrayList();
		RouteInfo mSelectedRoute;
		private MediaRouteProvider.RouteController mSelectedRouteController;
		private android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener mSessionActiveListener;
		final SystemMediaRouteProvider mSystemProvider;
		private final Map mUniqueIdMap = new HashMap();


/*
		static String access$000(GlobalMediaRouter globalmediarouter, ProviderInfo providerinfo, String s)
		{
			return globalmediarouter.getUniqueId(providerinfo, s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #158 <Method String getUniqueId(MediaRouter$ProviderInfo, String)>
		//    4    6:areturn         
		}

*/


/*
		static void access$700(GlobalMediaRouter globalmediarouter, boolean flag)
		{
			globalmediarouter.updateSelectedRouteIfNeeded(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #164 <Method void updateSelectedRouteIfNeeded(boolean)>
			return;
		//    3    5:return          
		}

*/

		GlobalMediaRouter(Context context)
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
			mSessionActiveListener = new _cls1();
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
			mSystemProvider = SystemMediaRouteProvider.obtain(context, ((SystemMediaRouteProvider.SyncCallback) (this)));
		//   69  146:aload_0         
		//   70  147:aload_1         
		//   71  148:aload_0         
		//   72  149:invokestatic    #149 <Method SystemMediaRouteProvider SystemMediaRouteProvider.obtain(Context, SystemMediaRouteProvider$SyncCallback)>
		//   73  152:putfield        #151 <Field SystemMediaRouteProvider mSystemProvider>
		//   74  155:return          
		}
	}

	private final class GlobalMediaRouter.CallbackHandler extends Handler
	{

		private void invokeCallback(CallbackRecord callbackrecord, int i, Object obj, int j)
		{
			MediaRouter mediarouter = callbackrecord.mRouter;
		//    0    0:aload_1         
		//    1    1:getfield        #63  <Field MediaRouter MediaRouter$CallbackRecord.mRouter>
		//    2    4:astore          6
			Callback callback = callbackrecord.mCallback;
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
				callbackrecord = ((CallbackRecord) ((ProviderInfo)obj));
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
					callback.onProviderChanged(mediarouter, ((ProviderInfo) (callbackrecord)));
		//   23   69:aload           7
		//   24   71:aload           6
		//   25   73:aload_1         
		//   26   74:invokevirtual   #75  <Method void MediaRouter$Callback.onProviderChanged(MediaRouter, MediaRouter$ProviderInfo)>
					return;
		//   27   77:return          

				case 514: 
					callback.onProviderRemoved(mediarouter, ((ProviderInfo) (callbackrecord)));
		//   28   78:aload           7
		//   29   80:aload           6
		//   30   82:aload_1         
		//   31   83:invokevirtual   #78  <Method void MediaRouter$Callback.onProviderRemoved(MediaRouter, MediaRouter$ProviderInfo)>
					return;
		//   32   86:return          

				case 513: 
					callback.onProviderAdded(mediarouter, ((ProviderInfo) (callbackrecord)));
		//   33   87:aload           7
		//   34   89:aload           6
		//   35   91:aload_1         
		//   36   92:invokevirtual   #81  <Method void MediaRouter$Callback.onProviderAdded(MediaRouter, MediaRouter$ProviderInfo)>
					return;
		//   37   95:return          
				}
			}
			obj = ((Object) ((RouteInfo)obj));
		//   38   96:aload_3         
		//   39   97:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   40  100:astore_3        
			if(!callbackrecord.filterRouteEvent(((RouteInfo) (obj))))
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
				callback.onRouteUnselected(mediarouter, ((RouteInfo) (obj)), j);
		//   49  153:aload           7
		//   50  155:aload           6
		//   51  157:aload_3         
		//   52  158:iload           4
		//   53  160:invokevirtual   #91  <Method void MediaRouter$Callback.onRouteUnselected(MediaRouter, MediaRouter$RouteInfo, int)>
				return;
		//   54  163:return          

			case 262: 
				callback.onRouteSelected(mediarouter, ((RouteInfo) (obj)));
		//   55  164:aload           7
		//   56  166:aload           6
		//   57  168:aload_3         
		//   58  169:invokevirtual   #95  <Method void MediaRouter$Callback.onRouteSelected(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   59  172:return          

			case 261: 
				callback.onRoutePresentationDisplayChanged(mediarouter, ((RouteInfo) (obj)));
		//   60  173:aload           7
		//   61  175:aload           6
		//   62  177:aload_3         
		//   63  178:invokevirtual   #98  <Method void MediaRouter$Callback.onRoutePresentationDisplayChanged(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   64  181:return          

			case 260: 
				callback.onRouteVolumeChanged(mediarouter, ((RouteInfo) (obj)));
		//   65  182:aload           7
		//   66  184:aload           6
		//   67  186:aload_3         
		//   68  187:invokevirtual   #101 <Method void MediaRouter$Callback.onRouteVolumeChanged(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   69  190:return          

			case 259: 
				callback.onRouteChanged(mediarouter, ((RouteInfo) (obj)));
		//   70  191:aload           7
		//   71  193:aload           6
		//   72  195:aload_3         
		//   73  196:invokevirtual   #104 <Method void MediaRouter$Callback.onRouteChanged(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   74  199:return          

			case 258: 
				callback.onRouteRemoved(mediarouter, ((RouteInfo) (obj)));
		//   75  200:aload           7
		//   76  202:aload           6
		//   77  204:aload_3         
		//   78  205:invokevirtual   #107 <Method void MediaRouter$Callback.onRouteRemoved(MediaRouter, MediaRouter$RouteInfo)>
				return;
		//   79  208:return          

			case 257: 
				callback.onRouteAdded(mediarouter, ((RouteInfo) (obj)));
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
					mSystemProvider.onSyncRouteChanged((RouteInfo)obj);
		//    6   37:aload_0         
		//    7   38:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//    8   41:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
		//    9   44:aload_2         
		//   10   45:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   11   48:invokevirtual   #122 <Method void SystemMediaRouteProvider.onSyncRouteChanged(MediaRouter$RouteInfo)>
					return;
		//   12   51:return          

				case 258: 
					mSystemProvider.onSyncRouteRemoved((RouteInfo)obj);
		//   13   52:aload_0         
		//   14   53:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		//   15   56:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
		//   16   59:aload_2         
		//   17   60:checkcast       #83  <Class MediaRouter$RouteInfo>
		//   18   63:invokevirtual   #125 <Method void SystemMediaRouteProvider.onSyncRouteRemoved(MediaRouter$RouteInfo)>
					return;
		//   19   66:return          

				case 257: 
					mSystemProvider.onSyncRouteAdded((RouteInfo)obj);
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
				mSystemProvider.onSyncRouteSelected((RouteInfo)obj);
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
			if(j == 259 && getSelectedRoute().getId().equals(((Object) (((RouteInfo)obj).getId()))))
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
			invokeCallback((CallbackRecord)mTempCallbackRecords.get(i), j, obj, k);
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
		final GlobalMediaRouter this$0;

		GlobalMediaRouter.CallbackHandler()
		{
			this$0 = GlobalMediaRouter.this;
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

	private final class GlobalMediaRouter.MediaSessionRecord
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

							final GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
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

							final GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
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

					final GlobalMediaRouter.MediaSessionRecord this$1;

			
			{
				this$1 = GlobalMediaRouter.MediaSessionRecord.this;
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
		final GlobalMediaRouter this$0;

		public GlobalMediaRouter.MediaSessionRecord(MediaSessionCompat mediasessioncompat)
		{
			this$0 = GlobalMediaRouter.this;
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

		public GlobalMediaRouter.MediaSessionRecord(Object obj)
		{
			this$0 = GlobalMediaRouter.this;
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

	private final class GlobalMediaRouter.ProviderCallback extends MediaRouteProvider.Callback
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

		final GlobalMediaRouter this$0;

		GlobalMediaRouter.ProviderCallback()
		{
			this$0 = GlobalMediaRouter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void MediaRouteProvider$Callback()>
		//    5    9:return          
		}
	}

	private final class GlobalMediaRouter.RemoteControlClientRecord
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
		final GlobalMediaRouter this$0;

		public GlobalMediaRouter.RemoteControlClientRecord(Object obj)
		{
			this$0 = GlobalMediaRouter.this;
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

	public static final class ProviderInfo
	{

		int findRouteByDescriptorId(String s)
		{
			int j = mRoutes.size();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field List mRoutes>
		//    2    4:invokeinterface #53  <Method int List.size()>
		//    3    9:istore_3        
			for(int i = 0; i < j; i++)
		//*   4   10:iconst_0        
		//*   5   11:istore_2        
		//*   6   12:iload_2         
		//*   7   13:iload_3         
		//*   8   14:icmpge          49
				if(((RouteInfo)mRoutes.get(i)).mDescriptorId.equals(((Object) (s))))
		//*   9   17:aload_0         
		//*  10   18:getfield        #30  <Field List mRoutes>
		//*  11   21:iload_2         
		//*  12   22:invokeinterface #57  <Method Object List.get(int)>
		//*  13   27:checkcast       #59  <Class MediaRouter$RouteInfo>
		//*  14   30:invokestatic    #63  <Method String MediaRouter$RouteInfo.access$100(MediaRouter$RouteInfo)>
		//*  15   33:aload_1         
		//*  16   34:invokevirtual   #69  <Method boolean String.equals(Object)>
		//*  17   37:ifeq            42
					return i;
		//   18   40:iload_2         
		//   19   41:ireturn         

		//   20   42:iload_2         
		//   21   43:iconst_1        
		//   22   44:iadd            
		//   23   45:istore_2        
		//*  24   46:goto            12
			return -1;
		//   25   49:iconst_m1       
		//   26   50:ireturn         
		}

		public ComponentName getComponentName()
		{
			return mMetadata.getComponentName();
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field MediaRouteProvider$ProviderMetadata mMetadata>
		//    2    4:invokevirtual   #75  <Method ComponentName MediaRouteProvider$ProviderMetadata.getComponentName()>
		//    3    7:areturn         
		}

		public String getPackageName()
		{
			return mMetadata.getPackageName();
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field MediaRouteProvider$ProviderMetadata mMetadata>
		//    2    4:invokevirtual   #79  <Method String MediaRouteProvider$ProviderMetadata.getPackageName()>
		//    3    7:areturn         
		}

		public MediaRouteProvider getProviderInstance()
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #84  <Method void MediaRouter.checkCallingThread()>
			return mProviderInstance;
		//    1    3:aload_0         
		//    2    4:getfield        #32  <Field MediaRouteProvider mProviderInstance>
		//    3    7:areturn         
		}

		Resources getResources()
		{
			if(mResources == null && !mResourcesNotAvailable)
		//*   0    0:aload_0         
		//*   1    1:getfield        #88  <Field Resources mResources>
		//*   2    4:ifnonnull       78
		//*   3    7:aload_0         
		//*   4    8:getfield        #90  <Field boolean mResourcesNotAvailable>
		//*   5   11:ifne            78
			{
				String s = getPackageName();
		//    6   14:aload_0         
		//    7   15:invokevirtual   #91  <Method String getPackageName()>
		//    8   18:astore_1        
				Context context = MediaRouter.sGlobal.getProviderContext(s);
		//    9   19:getstatic       #95  <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #101 <Method Context MediaRouter$GlobalMediaRouter.getProviderContext(String)>
		//   12   26:astore_2        
				if(context != null)
		//*  13   27:aload_2         
		//*  14   28:ifnull          42
				{
					mResources = context.getResources();
		//   15   31:aload_0         
		//   16   32:aload_2         
		//   17   33:invokevirtual   #105 <Method Resources Context.getResources()>
		//   18   36:putfield        #88  <Field Resources mResources>
				} else
		//*  19   39:goto            78
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   20   42:new             #107 <Class StringBuilder>
		//   21   45:dup             
		//   22   46:invokespecial   #108 <Method void StringBuilder()>
		//   23   49:astore_2        
					stringbuilder.append("Unable to obtain resources for route provider package: ");
		//   24   50:aload_2         
		//   25   51:ldc1            #110 <String "Unable to obtain resources for route provider package: ">
		//   26   53:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   27   56:pop             
					stringbuilder.append(s);
		//   28   57:aload_2         
		//   29   58:aload_1         
		//   30   59:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   31   62:pop             
					Log.w("MediaRouter", stringbuilder.toString());
		//   32   63:ldc1            #116 <String "MediaRouter">
		//   33   65:aload_2         
		//   34   66:invokevirtual   #119 <Method String StringBuilder.toString()>
		//   35   69:invokestatic    #125 <Method int Log.w(String, String)>
		//   36   72:pop             
					mResourcesNotAvailable = true;
		//   37   73:aload_0         
		//   38   74:iconst_1        
		//   39   75:putfield        #90  <Field boolean mResourcesNotAvailable>
				}
			}
			return mResources;
		//   40   78:aload_0         
		//   41   79:getfield        #88  <Field Resources mResources>
		//   42   82:areturn         
		}

		public List getRoutes()
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #84  <Method void MediaRouter.checkCallingThread()>
			return mRoutes;
		//    1    3:aload_0         
		//    2    4:getfield        #30  <Field List mRoutes>
		//    3    7:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #107 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #108 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("MediaRouter.RouteProviderInfo{ packageName=");
		//    4    8:aload_1         
		//    5    9:ldc1            #131 <String "MediaRouter.RouteProviderInfo{ packageName=">
		//    6   11:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(getPackageName());
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokevirtual   #91  <Method String getPackageName()>
		//   11   20:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(" }");
		//   13   24:aload_1         
		//   14   25:ldc1            #133 <String " }">
		//   15   27:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			return stringbuilder.toString();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #119 <Method String StringBuilder.toString()>
		//   19   35:areturn         
		}

		boolean updateDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
		{
			if(mDescriptor != mediarouteproviderdescriptor)
		//*   0    0:aload_0         
		//*   1    1:getfield        #137 <Field MediaRouteProviderDescriptor mDescriptor>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       15
			{
				mDescriptor = mediarouteproviderdescriptor;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #137 <Field MediaRouteProviderDescriptor mDescriptor>
				return true;
		//    7   13:iconst_1        
		//    8   14:ireturn         
			} else
			{
				return false;
		//    9   15:iconst_0        
		//   10   16:ireturn         
			}
		}

		private MediaRouteProviderDescriptor mDescriptor;
		private final MediaRouteProvider.ProviderMetadata mMetadata;
		private final MediaRouteProvider mProviderInstance;
		private Resources mResources;
		private boolean mResourcesNotAvailable;
		private final List mRoutes = new ArrayList();


/*
		static MediaRouteProvider access$500(ProviderInfo providerinfo)
		{
			return providerinfo.mProviderInstance;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field MediaRouteProvider mProviderInstance>
		//    2    4:areturn         
		}

*/


/*
		static List access$600(ProviderInfo providerinfo)
		{
			return providerinfo.mRoutes;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field List mRoutes>
		//    2    4:areturn         
		}

*/

		ProviderInfo(MediaRouteProvider mediarouteprovider)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #27  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #28  <Method void ArrayList()>
		//    6   12:putfield        #30  <Field List mRoutes>
			mProviderInstance = mediarouteprovider;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #32  <Field MediaRouteProvider mProviderInstance>
			mMetadata = mediarouteprovider.getMetadata();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #38  <Method MediaRouteProvider$ProviderMetadata MediaRouteProvider.getMetadata()>
		//   13   25:putfield        #40  <Field MediaRouteProvider$ProviderMetadata mMetadata>
		//   14   28:return          
		}
	}

	public static class RouteGroup extends RouteInfo
	{

		public RouteInfo getRouteAt(int i)
		{
			return (RouteInfo)mRoutes.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field List mRoutes>
		//    2    4:iload_1         
		//    3    5:invokeinterface #34  <Method Object List.get(int)>
		//    4   10:checkcast       #4   <Class MediaRouter$RouteInfo>
		//    5   13:areturn         
		}

		public int getRouteCount()
		{
			return mRoutes.size();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field List mRoutes>
		//    2    4:invokeinterface #39  <Method int List.size()>
		//    3    9:ireturn         
		}

		public List getRoutes()
		{
			return mRoutes;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field List mRoutes>
		//    2    4:areturn         
		}

		int maybeUpdateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
		{
			MediaRouteDescriptor mediaroutedescriptor1 = mDescriptor;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field MediaRouteDescriptor mDescriptor>
		//    2    4:astore          5
			boolean flag2 = false;
		//    3    6:iconst_0        
		//    4    7:istore          4
			boolean flag = false;
		//    5    9:iconst_0        
		//    6   10:istore_2        
			boolean flag1 = flag2;
		//    7   11:iload           4
		//    8   13:istore_3        
			if(mediaroutedescriptor1 != mediaroutedescriptor)
		//*   9   14:aload           5
		//*  10   16:aload_1         
		//*  11   17:if_acmpeq       175
			{
				mDescriptor = mediaroutedescriptor;
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:putfield        #49  <Field MediaRouteDescriptor mDescriptor>
				flag1 = flag2;
		//   15   25:iload           4
		//   16   27:istore_3        
				if(mediaroutedescriptor != null)
		//*  17   28:aload_1         
		//*  18   29:ifnull          175
				{
					Object obj = ((Object) (mediaroutedescriptor.getGroupMemberIds()));
		//   19   32:aload_1         
		//   20   33:invokevirtual   #54  <Method List MediaRouteDescriptor.getGroupMemberIds()>
		//   21   36:astore          6
					ArrayList arraylist = new ArrayList();
		//   22   38:new             #20  <Class ArrayList>
		//   23   41:dup             
		//   24   42:invokespecial   #23  <Method void ArrayList()>
		//   25   45:astore          5
					if(((List) (obj)).size() != mRoutes.size())
		//*  26   47:aload           6
		//*  27   49:invokeinterface #39  <Method int List.size()>
		//*  28   54:aload_0         
		//*  29   55:getfield        #25  <Field List mRoutes>
		//*  30   58:invokeinterface #39  <Method int List.size()>
		//*  31   63:icmpeq          68
						flag = true;
		//   32   66:iconst_1        
		//   33   67:istore_2        
					obj = ((Object) (((List) (obj)).iterator()));
		//   34   68:aload           6
		//   35   70:invokeinterface #58  <Method Iterator List.iterator()>
		//   36   75:astore          6
					do
					{
						if(!((Iterator) (obj)).hasNext())
							break;
		//   37   77:aload           6
		//   38   79:invokeinterface #64  <Method boolean Iterator.hasNext()>
		//   39   84:ifeq            161
						Object obj1 = ((Object) ((String)((Iterator) (obj)).next()));
		//   40   87:aload           6
		//   41   89:invokeinterface #68  <Method Object Iterator.next()>
		//   42   94:checkcast       #70  <Class String>
		//   43   97:astore          7
						obj1 = ((Object) (MediaRouter.sGlobal.getUniqueId(getProvider(), ((String) (obj1)))));
		//   44   99:getstatic       #74  <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//   45  102:aload_0         
		//   46  103:invokevirtual   #78  <Method MediaRouter$ProviderInfo getProvider()>
		//   47  106:aload           7
		//   48  108:invokestatic    #84  <Method String MediaRouter$GlobalMediaRouter.access$000(MediaRouter$GlobalMediaRouter, MediaRouter$ProviderInfo, String)>
		//   49  111:astore          7
						obj1 = ((Object) (MediaRouter.sGlobal.getRoute(((String) (obj1)))));
		//   50  113:getstatic       #74  <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//   51  116:aload           7
		//   52  118:invokevirtual   #88  <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getRoute(String)>
		//   53  121:astore          7
						if(obj1 != null)
		//*  54  123:aload           7
		//*  55  125:ifnull          77
						{
							((List) (arraylist)).add(obj1);
		//   56  128:aload           5
		//   57  130:aload           7
		//   58  132:invokeinterface #92  <Method boolean List.add(Object)>
		//   59  137:pop             
							if(!flag && !mRoutes.contains(obj1))
		//*  60  138:iload_2         
		//*  61  139:ifne            77
		//*  62  142:aload_0         
		//*  63  143:getfield        #25  <Field List mRoutes>
		//*  64  146:aload           7
		//*  65  148:invokeinterface #95  <Method boolean List.contains(Object)>
		//*  66  153:ifne            77
								flag = true;
		//   67  156:iconst_1        
		//   68  157:istore_2        
						}
					} while(true);
		//   69  158:goto            77
					flag1 = flag;
		//   70  161:iload_2         
		//   71  162:istore_3        
					if(flag)
		//*  72  163:iload_2         
		//*  73  164:ifeq            175
					{
						mRoutes = ((List) (arraylist));
		//   74  167:aload_0         
		//   75  168:aload           5
		//   76  170:putfield        #25  <Field List mRoutes>
						flag1 = flag;
		//   77  173:iload_2         
		//   78  174:istore_3        
					}
				}
			}
			return super.updateDescriptor(mediaroutedescriptor) | flag1;
		//   79  175:aload_0         
		//   80  176:aload_1         
		//   81  177:invokespecial   #98  <Method int MediaRouter$RouteInfo.updateDescriptor(MediaRouteDescriptor)>
		//   82  180:iload_3         
		//   83  181:ior             
		//   84  182:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(super.toString());
		//    0    0:new             #102 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #104 <Method String MediaRouter$RouteInfo.toString()>
		//    4    8:invokespecial   #107 <Method void StringBuilder(String)>
		//    5   11:astore_3        
			stringbuilder.append('[');
		//    6   12:aload_3         
		//    7   13:bipush          91
		//    8   15:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//    9   18:pop             
			int j = mRoutes.size();
		//   10   19:aload_0         
		//   11   20:getfield        #25  <Field List mRoutes>
		//   12   23:invokeinterface #39  <Method int List.size()>
		//   13   28:istore_2        
			for(int i = 0; i < j; i++)
		//*  14   29:iconst_0        
		//*  15   30:istore_1        
		//*  16   31:iload_1         
		//*  17   32:iload_2         
		//*  18   33:icmpge          69
			{
				if(i > 0)
		//*  19   36:iload_1         
		//*  20   37:ifle            47
					stringbuilder.append(", ");
		//   21   40:aload_3         
		//   22   41:ldc1            #113 <String ", ">
		//   23   43:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
		//   24   46:pop             
				stringbuilder.append(mRoutes.get(i));
		//   25   47:aload_3         
		//   26   48:aload_0         
		//   27   49:getfield        #25  <Field List mRoutes>
		//   28   52:iload_1         
		//   29   53:invokeinterface #34  <Method Object List.get(int)>
		//   30   58:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
		//   31   61:pop             
			}

		//   32   62:iload_1         
		//   33   63:iconst_1        
		//   34   64:iadd            
		//   35   65:istore_1        
		//*  36   66:goto            31
			stringbuilder.append(']');
		//   37   69:aload_3         
		//   38   70:bipush          93
		//   39   72:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
		//   40   75:pop             
			return stringbuilder.toString();
		//   41   76:aload_3         
		//   42   77:invokevirtual   #120 <Method String StringBuilder.toString()>
		//   43   80:areturn         
		}

		private List mRoutes;

		RouteGroup(ProviderInfo providerinfo, String s, String s1)
		{
			super(providerinfo, s, s1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #18  <Method void MediaRouter$RouteInfo(MediaRouter$ProviderInfo, String, String)>
			mRoutes = ((List) (new ArrayList()));
		//    5    7:aload_0         
		//    6    8:new             #20  <Class ArrayList>
		//    7   11:dup             
		//    8   12:invokespecial   #23  <Method void ArrayList()>
		//    9   15:putfield        #25  <Field List mRoutes>
		//   10   18:return          
		}
	}

	public static class RouteInfo
	{

		private static boolean isSystemMediaRouteProvider(RouteInfo routeinfo)
		{
			return TextUtils.equals(((CharSequence) (routeinfo.getProviderInstance().getMetadata().getPackageName())), "android");
		//    0    0:aload_0         
		//    1    1:invokevirtual   #111 <Method MediaRouteProvider getProviderInstance()>
		//    2    4:invokevirtual   #117 <Method MediaRouteProvider$ProviderMetadata MediaRouteProvider.getMetadata()>
		//    3    7:invokevirtual   #123 <Method String MediaRouteProvider$ProviderMetadata.getPackageName()>
		//    4   10:ldc1            #49  <String "android">
		//    5   12:invokestatic    #129 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//    6   15:ireturn         
		}

		public boolean canDisconnect()
		{
			return mCanDisconnect;
		//    0    0:aload_0         
		//    1    1:getfield        #133 <Field boolean mCanDisconnect>
		//    2    4:ireturn         
		}

		public int getConnectionState()
		{
			return mConnectionState;
		//    0    0:aload_0         
		//    1    1:getfield        #137 <Field int mConnectionState>
		//    2    4:ireturn         
		}

		public List getControlFilters()
		{
			return ((List) (mControlFilters));
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field ArrayList mControlFilters>
		//    2    4:areturn         
		}

		public String getDescription()
		{
			return mDescription;
		//    0    0:aload_0         
		//    1    1:getfield        #145 <Field String mDescription>
		//    2    4:areturn         
		}

		String getDescriptorId()
		{
			return mDescriptorId;
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field String mDescriptorId>
		//    2    4:areturn         
		}

		public int getDeviceType()
		{
			return mDeviceType;
		//    0    0:aload_0         
		//    1    1:getfield        #150 <Field int mDeviceType>
		//    2    4:ireturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #154 <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public Uri getIconUri()
		{
			return mIconUri;
		//    0    0:aload_0         
		//    1    1:getfield        #158 <Field Uri mIconUri>
		//    2    4:areturn         
		}

		public String getId()
		{
			return mUniqueId;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field String mUniqueId>
		//    2    4:areturn         
		}

		public String getName()
		{
			return mName;
		//    0    0:aload_0         
		//    1    1:getfield        #163 <Field String mName>
		//    2    4:areturn         
		}

		public int getPlaybackStream()
		{
			return mPlaybackStream;
		//    0    0:aload_0         
		//    1    1:getfield        #166 <Field int mPlaybackStream>
		//    2    4:ireturn         
		}

		public int getPlaybackType()
		{
			return mPlaybackType;
		//    0    0:aload_0         
		//    1    1:getfield        #169 <Field int mPlaybackType>
		//    2    4:ireturn         
		}

		public Display getPresentationDisplay()
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			if(mPresentationDisplayId >= 0 && mPresentationDisplay == null)
		//*   1    3:aload_0         
		//*   2    4:getfield        #92  <Field int mPresentationDisplayId>
		//*   3    7:iflt            31
		//*   4   10:aload_0         
		//*   5   11:getfield        #176 <Field Display mPresentationDisplay>
		//*   6   14:ifnonnull       31
				mPresentationDisplay = MediaRouter.sGlobal.getDisplay(mPresentationDisplayId);
		//    7   17:aload_0         
		//    8   18:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    9   21:aload_0         
		//   10   22:getfield        #92  <Field int mPresentationDisplayId>
		//   11   25:invokevirtual   #186 <Method Display MediaRouter$GlobalMediaRouter.getDisplay(int)>
		//   12   28:putfield        #176 <Field Display mPresentationDisplay>
			return mPresentationDisplay;
		//   13   31:aload_0         
		//   14   32:getfield        #176 <Field Display mPresentationDisplay>
		//   15   35:areturn         
		}

		public int getPresentationDisplayId()
		{
			return mPresentationDisplayId;
		//    0    0:aload_0         
		//    1    1:getfield        #92  <Field int mPresentationDisplayId>
		//    2    4:ireturn         
		}

		public ProviderInfo getProvider()
		{
			return mProvider;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field MediaRouter$ProviderInfo mProvider>
		//    2    4:areturn         
		}

		public MediaRouteProvider getProviderInstance()
		{
			return mProvider.getProviderInstance();
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field MediaRouter$ProviderInfo mProvider>
		//    2    4:invokevirtual   #192 <Method MediaRouteProvider MediaRouter$ProviderInfo.getProviderInstance()>
		//    3    7:areturn         
		}

		public IntentSender getSettingsIntent()
		{
			return mSettingsIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #196 <Field IntentSender mSettingsIntent>
		//    2    4:areturn         
		}

		public int getVolume()
		{
			return mVolume;
		//    0    0:aload_0         
		//    1    1:getfield        #199 <Field int mVolume>
		//    2    4:ireturn         
		}

		public int getVolumeHandling()
		{
			return mVolumeHandling;
		//    0    0:aload_0         
		//    1    1:getfield        #202 <Field int mVolumeHandling>
		//    2    4:ireturn         
		}

		public int getVolumeMax()
		{
			return mVolumeMax;
		//    0    0:aload_0         
		//    1    1:getfield        #205 <Field int mVolumeMax>
		//    2    4:ireturn         
		}

		public boolean isBluetooth()
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			return MediaRouter.sGlobal.getBluetoothRoute() == this;
		//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    2    6:invokevirtual   #210 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getBluetoothRoute()>
		//    3    9:aload_0         
		//    4   10:if_acmpne       15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public boolean isConnecting()
		{
			return mConnecting;
		//    0    0:aload_0         
		//    1    1:getfield        #213 <Field boolean mConnecting>
		//    2    4:ireturn         
		}

		public boolean isDefault()
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			return MediaRouter.sGlobal.getDefaultRoute() == this;
		//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    2    6:invokevirtual   #217 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getDefaultRoute()>
		//    3    9:aload_0         
		//    4   10:if_acmpne       15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public boolean isDefaultOrBluetooth()
		{
			if(!isDefault())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #220 <Method boolean isDefault()>
		//*   2    4:ifne            46
			{
				if(mDeviceType == 3)
		//*   3    7:aload_0         
		//*   4    8:getfield        #150 <Field int mDeviceType>
		//*   5   11:iconst_3        
		//*   6   12:icmpne          17
					return true;
		//    7   15:iconst_1        
		//    8   16:ireturn         
				return isSystemMediaRouteProvider(this) && supportsControlCategory("android.media.intent.category.LIVE_AUDIO") && !supportsControlCategory("android.media.intent.category.LIVE_VIDEO");
		//    9   17:aload_0         
		//   10   18:invokestatic    #222 <Method boolean isSystemMediaRouteProvider(MediaRouter$RouteInfo)>
		//   11   21:ifeq            44
		//   12   24:aload_0         
		//   13   25:ldc1            #224 <String "android.media.intent.category.LIVE_AUDIO">
		//   14   27:invokevirtual   #228 <Method boolean supportsControlCategory(String)>
		//   15   30:ifeq            44
		//   16   33:aload_0         
		//   17   34:ldc1            #230 <String "android.media.intent.category.LIVE_VIDEO">
		//   18   36:invokevirtual   #228 <Method boolean supportsControlCategory(String)>
		//   19   39:ifne            44
		//   20   42:iconst_1        
		//   21   43:ireturn         
		//   22   44:iconst_0        
		//   23   45:ireturn         
			} else
			{
				return true;
		//   24   46:iconst_1        
		//   25   47:ireturn         
			}
		}

		public boolean isDeviceSpeaker()
		{
			int i = Resources.getSystem().getIdentifier("default_audio_route_name", "string", "android");
		//    0    0:invokestatic    #237 <Method Resources Resources.getSystem()>
		//    1    3:ldc1            #239 <String "default_audio_route_name">
		//    2    5:ldc1            #241 <String "string">
		//    3    7:ldc1            #49  <String "android">
		//    4    9:invokevirtual   #245 <Method int Resources.getIdentifier(String, String, String)>
		//    5   12:istore_1        
			return isDefault() && ((Object) (Resources.getSystem().getText(i))).equals(((Object) (mName)));
		//    6   13:aload_0         
		//    7   14:invokevirtual   #220 <Method boolean isDefault()>
		//    8   17:ifeq            39
		//    9   20:invokestatic    #237 <Method Resources Resources.getSystem()>
		//   10   23:iload_1         
		//   11   24:invokevirtual   #249 <Method CharSequence Resources.getText(int)>
		//   12   27:aload_0         
		//   13   28:getfield        #163 <Field String mName>
		//   14   31:invokevirtual   #252 <Method boolean Object.equals(Object)>
		//   15   34:ifeq            39
		//   16   37:iconst_1        
		//   17   38:ireturn         
		//   18   39:iconst_0        
		//   19   40:ireturn         
		}

		public boolean isEnabled()
		{
			return mEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #106 <Field boolean mEnabled>
		//    2    4:ireturn         
		}

		boolean isSelectable()
		{
			return mDescriptor != null && mEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #256 <Field MediaRouteDescriptor mDescriptor>
		//    2    4:ifnull          16
		//    3    7:aload_0         
		//    4    8:getfield        #106 <Field boolean mEnabled>
		//    5   11:ifeq            16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean isSelected()
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			return MediaRouter.sGlobal.getSelectedRoute() == this;
		//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    2    6:invokevirtual   #260 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
		//    3    9:aload_0         
		//    4   10:if_acmpne       15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public boolean matchesSelector(MediaRouteSelector mediarouteselector)
		{
			if(mediarouteselector == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       15
			{
				throw new IllegalArgumentException("selector must not be null");
		//    2    4:new             #264 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #266 <String "selector must not be null">
		//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			} else
			{
				MediaRouter.checkCallingThread();
		//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
				return mediarouteselector.matchesControlFilters(((List) (mControlFilters)));
		//    8   18:aload_1         
		//    9   19:aload_0         
		//   10   20:getfield        #90  <Field ArrayList mControlFilters>
		//   11   23:invokevirtual   #275 <Method boolean MediaRouteSelector.matchesControlFilters(List)>
		//   12   26:ireturn         
			}
		}

		int maybeUpdateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
		{
			if(mDescriptor != mediaroutedescriptor)
		//*   0    0:aload_0         
		//*   1    1:getfield        #256 <Field MediaRouteDescriptor mDescriptor>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       14
				return updateDescriptor(mediaroutedescriptor);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #281 <Method int updateDescriptor(MediaRouteDescriptor)>
		//    7   13:ireturn         
			else
				return 0;
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public void requestSetVolume(int i)
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			MediaRouter.sGlobal.requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, i)));
		//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    2    6:aload_0         
		//    3    7:aload_0         
		//    4    8:getfield        #205 <Field int mVolumeMax>
		//    5   11:iconst_0        
		//    6   12:iload_1         
		//    7   13:invokestatic    #289 <Method int Math.max(int, int)>
		//    8   16:invokestatic    #292 <Method int Math.min(int, int)>
		//    9   19:invokevirtual   #295 <Method void MediaRouter$GlobalMediaRouter.requestSetVolume(MediaRouter$RouteInfo, int)>
		//   10   22:return          
		}

		public void requestUpdateVolume(int i)
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			if(i != 0)
		//*   1    3:iload_1         
		//*   2    4:ifeq            15
				MediaRouter.sGlobal.requestUpdateVolume(this, i);
		//    3    7:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    4   10:aload_0         
		//    5   11:iload_1         
		//    6   12:invokevirtual   #298 <Method void MediaRouter$GlobalMediaRouter.requestUpdateVolume(MediaRouter$RouteInfo, int)>
		//    7   15:return          
		}

		public void select()
		{
			MediaRouter.checkCallingThread();
		//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			MediaRouter.sGlobal.selectRoute(this);
		//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    2    6:aload_0         
		//    3    7:invokevirtual   #303 <Method void MediaRouter$GlobalMediaRouter.selectRoute(MediaRouter$RouteInfo)>
		//    4   10:return          
		}

		public void sendControlRequest(Intent intent, ControlRequestCallback controlrequestcallback)
		{
			if(intent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       15
			{
				throw new IllegalArgumentException("intent must not be null");
		//    2    4:new             #264 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #307 <String "intent must not be null">
		//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			} else
			{
				MediaRouter.checkCallingThread();
		//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
				MediaRouter.sGlobal.sendControlRequest(this, intent, controlrequestcallback);
		//    8   18:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    9   21:aload_0         
		//   10   22:aload_1         
		//   11   23:aload_2         
		//   12   24:invokevirtual   #310 <Method void MediaRouter$GlobalMediaRouter.sendControlRequest(MediaRouter$RouteInfo, Intent, MediaRouter$ControlRequestCallback)>
				return;
		//   13   27:return          
			}
		}

		public boolean supportsControlAction(String s, String s1)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       15
				throw new IllegalArgumentException("category must not be null");
		//    2    4:new             #264 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #314 <String "category must not be null">
		//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			if(s1 == null)
		//*   7   15:aload_2         
		//*   8   16:ifnonnull       30
				throw new IllegalArgumentException("action must not be null");
		//    9   19:new             #264 <Class IllegalArgumentException>
		//   10   22:dup             
		//   11   23:ldc2            #316 <String "action must not be null">
		//   12   26:invokespecial   #269 <Method void IllegalArgumentException(String)>
		//   13   29:athrow          
			MediaRouter.checkCallingThread();
		//   14   30:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			int j = mControlFilters.size();
		//   15   33:aload_0         
		//   16   34:getfield        #90  <Field ArrayList mControlFilters>
		//   17   37:invokevirtual   #319 <Method int ArrayList.size()>
		//   18   40:istore          4
			for(int i = 0; i < j; i++)
		//*  19   42:iconst_0        
		//*  20   43:istore_3        
		//*  21   44:iload_3         
		//*  22   45:iload           4
		//*  23   47:icmpge          90
			{
				IntentFilter intentfilter = (IntentFilter)mControlFilters.get(i);
		//   24   50:aload_0         
		//   25   51:getfield        #90  <Field ArrayList mControlFilters>
		//   26   54:iload_3         
		//   27   55:invokevirtual   #323 <Method Object ArrayList.get(int)>
		//   28   58:checkcast       #325 <Class IntentFilter>
		//   29   61:astore          5
				if(intentfilter.hasCategory(s) && intentfilter.hasAction(s1))
		//*  30   63:aload           5
		//*  31   65:aload_1         
		//*  32   66:invokevirtual   #328 <Method boolean IntentFilter.hasCategory(String)>
		//*  33   69:ifeq            83
		//*  34   72:aload           5
		//*  35   74:aload_2         
		//*  36   75:invokevirtual   #331 <Method boolean IntentFilter.hasAction(String)>
		//*  37   78:ifeq            83
					return true;
		//   38   81:iconst_1        
		//   39   82:ireturn         
			}

		//   40   83:iload_3         
		//   41   84:iconst_1        
		//   42   85:iadd            
		//   43   86:istore_3        
		//*  44   87:goto            44
			return false;
		//   45   90:iconst_0        
		//   46   91:ireturn         
		}

		public boolean supportsControlCategory(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       15
				throw new IllegalArgumentException("category must not be null");
		//    2    4:new             #264 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #314 <String "category must not be null">
		//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			MediaRouter.checkCallingThread();
		//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			int j = mControlFilters.size();
		//    8   18:aload_0         
		//    9   19:getfield        #90  <Field ArrayList mControlFilters>
		//   10   22:invokevirtual   #319 <Method int ArrayList.size()>
		//   11   25:istore_3        
			for(int i = 0; i < j; i++)
		//*  12   26:iconst_0        
		//*  13   27:istore_2        
		//*  14   28:iload_2         
		//*  15   29:iload_3         
		//*  16   30:icmpge          60
				if(((IntentFilter)mControlFilters.get(i)).hasCategory(s))
		//*  17   33:aload_0         
		//*  18   34:getfield        #90  <Field ArrayList mControlFilters>
		//*  19   37:iload_2         
		//*  20   38:invokevirtual   #323 <Method Object ArrayList.get(int)>
		//*  21   41:checkcast       #325 <Class IntentFilter>
		//*  22   44:aload_1         
		//*  23   45:invokevirtual   #328 <Method boolean IntentFilter.hasCategory(String)>
		//*  24   48:ifeq            53
					return true;
		//   25   51:iconst_1        
		//   26   52:ireturn         

		//   27   53:iload_2         
		//   28   54:iconst_1        
		//   29   55:iadd            
		//   30   56:istore_2        
		//*  31   57:goto            28
			return false;
		//   32   60:iconst_0        
		//   33   61:ireturn         
		}

		public boolean supportsControlRequest(Intent intent)
		{
			if(intent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       15
				throw new IllegalArgumentException("intent must not be null");
		//    2    4:new             #264 <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc2            #307 <String "intent must not be null">
		//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
		//    6   14:athrow          
			MediaRouter.checkCallingThread();
		//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			ContentResolver contentresolver = MediaRouter.sGlobal.getContentResolver();
		//    8   18:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
		//    9   21:invokevirtual   #337 <Method ContentResolver MediaRouter$GlobalMediaRouter.getContentResolver()>
		//   10   24:astore          4
			int j = mControlFilters.size();
		//   11   26:aload_0         
		//   12   27:getfield        #90  <Field ArrayList mControlFilters>
		//   13   30:invokevirtual   #319 <Method int ArrayList.size()>
		//   14   33:istore_3        
			for(int i = 0; i < j; i++)
		//*  15   34:iconst_0        
		//*  16   35:istore_2        
		//*  17   36:iload_2         
		//*  18   37:iload_3         
		//*  19   38:icmpge          74
				if(((IntentFilter)mControlFilters.get(i)).match(contentresolver, intent, true, "MediaRouter") >= 0)
		//*  20   41:aload_0         
		//*  21   42:getfield        #90  <Field ArrayList mControlFilters>
		//*  22   45:iload_2         
		//*  23   46:invokevirtual   #323 <Method Object ArrayList.get(int)>
		//*  24   49:checkcast       #325 <Class IntentFilter>
		//*  25   52:aload           4
		//*  26   54:aload_1         
		//*  27   55:iconst_1        
		//*  28   56:ldc2            #339 <String "MediaRouter">
		//*  29   59:invokevirtual   #343 <Method int IntentFilter.match(ContentResolver, Intent, boolean, String)>
		//*  30   62:iflt            67
					return true;
		//   31   65:iconst_1        
		//   32   66:ireturn         

		//   33   67:iload_2         
		//   34   68:iconst_1        
		//   35   69:iadd            
		//   36   70:istore_2        
		//*  37   71:goto            36
			return false;
		//   38   74:iconst_0        
		//   39   75:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #346 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #347 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("MediaRouter.RouteInfo{ uniqueId=");
		//    4    8:aload_1         
		//    5    9:ldc2            #349 <String "MediaRouter.RouteInfo{ uniqueId=">
		//    6   12:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//    7   15:pop             
			stringbuilder.append(mUniqueId);
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #98  <Field String mUniqueId>
		//   11   21:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   12   24:pop             
			stringbuilder.append(", name=");
		//   13   25:aload_1         
		//   14   26:ldc2            #355 <String ", name=">
		//   15   29:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   16   32:pop             
			stringbuilder.append(mName);
		//   17   33:aload_1         
		//   18   34:aload_0         
		//   19   35:getfield        #163 <Field String mName>
		//   20   38:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   21   41:pop             
			stringbuilder.append(", description=");
		//   22   42:aload_1         
		//   23   43:ldc2            #357 <String ", description=">
		//   24   46:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   25   49:pop             
			stringbuilder.append(mDescription);
		//   26   50:aload_1         
		//   27   51:aload_0         
		//   28   52:getfield        #145 <Field String mDescription>
		//   29   55:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   30   58:pop             
			stringbuilder.append(", iconUri=");
		//   31   59:aload_1         
		//   32   60:ldc2            #359 <String ", iconUri=">
		//   33   63:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   34   66:pop             
			stringbuilder.append(((Object) (mIconUri)));
		//   35   67:aload_1         
		//   36   68:aload_0         
		//   37   69:getfield        #158 <Field Uri mIconUri>
		//   38   72:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
		//   39   75:pop             
			stringbuilder.append(", enabled=");
		//   40   76:aload_1         
		//   41   77:ldc2            #364 <String ", enabled=">
		//   42   80:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   43   83:pop             
			stringbuilder.append(mEnabled);
		//   44   84:aload_1         
		//   45   85:aload_0         
		//   46   86:getfield        #106 <Field boolean mEnabled>
		//   47   89:invokevirtual   #367 <Method StringBuilder StringBuilder.append(boolean)>
		//   48   92:pop             
			stringbuilder.append(", connecting=");
		//   49   93:aload_1         
		//   50   94:ldc2            #369 <String ", connecting=">
		//   51   97:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   52  100:pop             
			stringbuilder.append(mConnecting);
		//   53  101:aload_1         
		//   54  102:aload_0         
		//   55  103:getfield        #213 <Field boolean mConnecting>
		//   56  106:invokevirtual   #367 <Method StringBuilder StringBuilder.append(boolean)>
		//   57  109:pop             
			stringbuilder.append(", connectionState=");
		//   58  110:aload_1         
		//   59  111:ldc2            #371 <String ", connectionState=">
		//   60  114:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   61  117:pop             
			stringbuilder.append(mConnectionState);
		//   62  118:aload_1         
		//   63  119:aload_0         
		//   64  120:getfield        #137 <Field int mConnectionState>
		//   65  123:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//   66  126:pop             
			stringbuilder.append(", canDisconnect=");
		//   67  127:aload_1         
		//   68  128:ldc2            #376 <String ", canDisconnect=">
		//   69  131:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   70  134:pop             
			stringbuilder.append(mCanDisconnect);
		//   71  135:aload_1         
		//   72  136:aload_0         
		//   73  137:getfield        #133 <Field boolean mCanDisconnect>
		//   74  140:invokevirtual   #367 <Method StringBuilder StringBuilder.append(boolean)>
		//   75  143:pop             
			stringbuilder.append(", playbackType=");
		//   76  144:aload_1         
		//   77  145:ldc2            #378 <String ", playbackType=">
		//   78  148:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   79  151:pop             
			stringbuilder.append(mPlaybackType);
		//   80  152:aload_1         
		//   81  153:aload_0         
		//   82  154:getfield        #169 <Field int mPlaybackType>
		//   83  157:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//   84  160:pop             
			stringbuilder.append(", playbackStream=");
		//   85  161:aload_1         
		//   86  162:ldc2            #380 <String ", playbackStream=">
		//   87  165:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   88  168:pop             
			stringbuilder.append(mPlaybackStream);
		//   89  169:aload_1         
		//   90  170:aload_0         
		//   91  171:getfield        #166 <Field int mPlaybackStream>
		//   92  174:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//   93  177:pop             
			stringbuilder.append(", deviceType=");
		//   94  178:aload_1         
		//   95  179:ldc2            #382 <String ", deviceType=">
		//   96  182:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//   97  185:pop             
			stringbuilder.append(mDeviceType);
		//   98  186:aload_1         
		//   99  187:aload_0         
		//  100  188:getfield        #150 <Field int mDeviceType>
		//  101  191:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//  102  194:pop             
			stringbuilder.append(", volumeHandling=");
		//  103  195:aload_1         
		//  104  196:ldc2            #384 <String ", volumeHandling=">
		//  105  199:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  106  202:pop             
			stringbuilder.append(mVolumeHandling);
		//  107  203:aload_1         
		//  108  204:aload_0         
		//  109  205:getfield        #202 <Field int mVolumeHandling>
		//  110  208:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//  111  211:pop             
			stringbuilder.append(", volume=");
		//  112  212:aload_1         
		//  113  213:ldc2            #386 <String ", volume=">
		//  114  216:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  115  219:pop             
			stringbuilder.append(mVolume);
		//  116  220:aload_1         
		//  117  221:aload_0         
		//  118  222:getfield        #199 <Field int mVolume>
		//  119  225:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//  120  228:pop             
			stringbuilder.append(", volumeMax=");
		//  121  229:aload_1         
		//  122  230:ldc2            #388 <String ", volumeMax=">
		//  123  233:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  124  236:pop             
			stringbuilder.append(mVolumeMax);
		//  125  237:aload_1         
		//  126  238:aload_0         
		//  127  239:getfield        #205 <Field int mVolumeMax>
		//  128  242:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//  129  245:pop             
			stringbuilder.append(", presentationDisplayId=");
		//  130  246:aload_1         
		//  131  247:ldc2            #390 <String ", presentationDisplayId=">
		//  132  250:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  133  253:pop             
			stringbuilder.append(mPresentationDisplayId);
		//  134  254:aload_1         
		//  135  255:aload_0         
		//  136  256:getfield        #92  <Field int mPresentationDisplayId>
		//  137  259:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
		//  138  262:pop             
			stringbuilder.append(", extras=");
		//  139  263:aload_1         
		//  140  264:ldc2            #392 <String ", extras=">
		//  141  267:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  142  270:pop             
			stringbuilder.append(((Object) (mExtras)));
		//  143  271:aload_1         
		//  144  272:aload_0         
		//  145  273:getfield        #154 <Field Bundle mExtras>
		//  146  276:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
		//  147  279:pop             
			stringbuilder.append(", settingsIntent=");
		//  148  280:aload_1         
		//  149  281:ldc2            #394 <String ", settingsIntent=">
		//  150  284:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  151  287:pop             
			stringbuilder.append(((Object) (mSettingsIntent)));
		//  152  288:aload_1         
		//  153  289:aload_0         
		//  154  290:getfield        #196 <Field IntentSender mSettingsIntent>
		//  155  293:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
		//  156  296:pop             
			stringbuilder.append(", providerPackageName=");
		//  157  297:aload_1         
		//  158  298:ldc2            #396 <String ", providerPackageName=">
		//  159  301:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  160  304:pop             
			stringbuilder.append(mProvider.getPackageName());
		//  161  305:aload_1         
		//  162  306:aload_0         
		//  163  307:getfield        #94  <Field MediaRouter$ProviderInfo mProvider>
		//  164  310:invokevirtual   #397 <Method String MediaRouter$ProviderInfo.getPackageName()>
		//  165  313:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  166  316:pop             
			stringbuilder.append(" }");
		//  167  317:aload_1         
		//  168  318:ldc2            #399 <String " }">
		//  169  321:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
		//  170  324:pop             
			return stringbuilder.toString();
		//  171  325:aload_1         
		//  172  326:invokevirtual   #401 <Method String StringBuilder.toString()>
		//  173  329:areturn         
		}

		int updateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
		{
			mDescriptor = mediaroutedescriptor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #256 <Field MediaRouteDescriptor mDescriptor>
			int j = 0;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			int i = 0;
		//    5    7:iconst_0        
		//    6    8:istore_2        
			if(mediaroutedescriptor != null)
		//*   7    9:aload_1         
		//*   8   10:ifnull          470
			{
				j = i;
		//    9   13:iload_2         
		//   10   14:istore_3        
				if(!MediaRouter.equal(((Object) (mName)), ((Object) (mediaroutedescriptor.getName()))))
		//*  11   15:aload_0         
		//*  12   16:getfield        #163 <Field String mName>
		//*  13   19:aload_1         
		//*  14   20:invokevirtual   #405 <Method String MediaRouteDescriptor.getName()>
		//*  15   23:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
		//*  16   26:ifne            39
				{
					mName = mediaroutedescriptor.getName();
		//   17   29:aload_0         
		//   18   30:aload_1         
		//   19   31:invokevirtual   #405 <Method String MediaRouteDescriptor.getName()>
		//   20   34:putfield        #163 <Field String mName>
					j = 1;
		//   21   37:iconst_1        
		//   22   38:istore_3        
				}
				i = j;
		//   23   39:iload_3         
		//   24   40:istore_2        
				if(!MediaRouter.equal(((Object) (mDescription)), ((Object) (mediaroutedescriptor.getDescription()))))
		//*  25   41:aload_0         
		//*  26   42:getfield        #145 <Field String mDescription>
		//*  27   45:aload_1         
		//*  28   46:invokevirtual   #411 <Method String MediaRouteDescriptor.getDescription()>
		//*  29   49:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
		//*  30   52:ifne            67
				{
					mDescription = mediaroutedescriptor.getDescription();
		//   31   55:aload_0         
		//   32   56:aload_1         
		//   33   57:invokevirtual   #411 <Method String MediaRouteDescriptor.getDescription()>
		//   34   60:putfield        #145 <Field String mDescription>
					i = j | 1;
		//   35   63:iload_3         
		//   36   64:iconst_1        
		//   37   65:ior             
		//   38   66:istore_2        
				}
				j = i;
		//   39   67:iload_2         
		//   40   68:istore_3        
				if(!MediaRouter.equal(((Object) (mIconUri)), ((Object) (mediaroutedescriptor.getIconUri()))))
		//*  41   69:aload_0         
		//*  42   70:getfield        #158 <Field Uri mIconUri>
		//*  43   73:aload_1         
		//*  44   74:invokevirtual   #413 <Method Uri MediaRouteDescriptor.getIconUri()>
		//*  45   77:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
		//*  46   80:ifne            95
				{
					mIconUri = mediaroutedescriptor.getIconUri();
		//   47   83:aload_0         
		//   48   84:aload_1         
		//   49   85:invokevirtual   #413 <Method Uri MediaRouteDescriptor.getIconUri()>
		//   50   88:putfield        #158 <Field Uri mIconUri>
					j = i | 1;
		//   51   91:iload_2         
		//   52   92:iconst_1        
		//   53   93:ior             
		//   54   94:istore_3        
				}
				i = j;
		//   55   95:iload_3         
		//   56   96:istore_2        
				if(mEnabled != mediaroutedescriptor.isEnabled())
		//*  57   97:aload_0         
		//*  58   98:getfield        #106 <Field boolean mEnabled>
		//*  59  101:aload_1         
		//*  60  102:invokevirtual   #415 <Method boolean MediaRouteDescriptor.isEnabled()>
		//*  61  105:icmpeq          120
				{
					mEnabled = mediaroutedescriptor.isEnabled();
		//   62  108:aload_0         
		//   63  109:aload_1         
		//   64  110:invokevirtual   #415 <Method boolean MediaRouteDescriptor.isEnabled()>
		//   65  113:putfield        #106 <Field boolean mEnabled>
					i = j | 1;
		//   66  116:iload_3         
		//   67  117:iconst_1        
		//   68  118:ior             
		//   69  119:istore_2        
				}
				j = i;
		//   70  120:iload_2         
		//   71  121:istore_3        
				if(mConnecting != mediaroutedescriptor.isConnecting())
		//*  72  122:aload_0         
		//*  73  123:getfield        #213 <Field boolean mConnecting>
		//*  74  126:aload_1         
		//*  75  127:invokevirtual   #417 <Method boolean MediaRouteDescriptor.isConnecting()>
		//*  76  130:icmpeq          145
				{
					mConnecting = mediaroutedescriptor.isConnecting();
		//   77  133:aload_0         
		//   78  134:aload_1         
		//   79  135:invokevirtual   #417 <Method boolean MediaRouteDescriptor.isConnecting()>
		//   80  138:putfield        #213 <Field boolean mConnecting>
					j = i | 1;
		//   81  141:iload_2         
		//   82  142:iconst_1        
		//   83  143:ior             
		//   84  144:istore_3        
				}
				i = j;
		//   85  145:iload_3         
		//   86  146:istore_2        
				if(mConnectionState != mediaroutedescriptor.getConnectionState())
		//*  87  147:aload_0         
		//*  88  148:getfield        #137 <Field int mConnectionState>
		//*  89  151:aload_1         
		//*  90  152:invokevirtual   #419 <Method int MediaRouteDescriptor.getConnectionState()>
		//*  91  155:icmpeq          170
				{
					mConnectionState = mediaroutedescriptor.getConnectionState();
		//   92  158:aload_0         
		//   93  159:aload_1         
		//   94  160:invokevirtual   #419 <Method int MediaRouteDescriptor.getConnectionState()>
		//   95  163:putfield        #137 <Field int mConnectionState>
					i = j | 1;
		//   96  166:iload_3         
		//   97  167:iconst_1        
		//   98  168:ior             
		//   99  169:istore_2        
				}
				j = i;
		//  100  170:iload_2         
		//  101  171:istore_3        
				if(!mControlFilters.equals(((Object) (mediaroutedescriptor.getControlFilters()))))
		//* 102  172:aload_0         
		//* 103  173:getfield        #90  <Field ArrayList mControlFilters>
		//* 104  176:aload_1         
		//* 105  177:invokevirtual   #421 <Method List MediaRouteDescriptor.getControlFilters()>
		//* 106  180:invokevirtual   #422 <Method boolean ArrayList.equals(Object)>
		//* 107  183:ifne            209
				{
					mControlFilters.clear();
		//  108  186:aload_0         
		//  109  187:getfield        #90  <Field ArrayList mControlFilters>
		//  110  190:invokevirtual   #425 <Method void ArrayList.clear()>
					mControlFilters.addAll(((Collection) (mediaroutedescriptor.getControlFilters())));
		//  111  193:aload_0         
		//  112  194:getfield        #90  <Field ArrayList mControlFilters>
		//  113  197:aload_1         
		//  114  198:invokevirtual   #421 <Method List MediaRouteDescriptor.getControlFilters()>
		//  115  201:invokevirtual   #429 <Method boolean ArrayList.addAll(Collection)>
		//  116  204:pop             
					j = i | 1;
		//  117  205:iload_2         
		//  118  206:iconst_1        
		//  119  207:ior             
		//  120  208:istore_3        
				}
				i = j;
		//  121  209:iload_3         
		//  122  210:istore_2        
				if(mPlaybackType != mediaroutedescriptor.getPlaybackType())
		//* 123  211:aload_0         
		//* 124  212:getfield        #169 <Field int mPlaybackType>
		//* 125  215:aload_1         
		//* 126  216:invokevirtual   #431 <Method int MediaRouteDescriptor.getPlaybackType()>
		//* 127  219:icmpeq          234
				{
					mPlaybackType = mediaroutedescriptor.getPlaybackType();
		//  128  222:aload_0         
		//  129  223:aload_1         
		//  130  224:invokevirtual   #431 <Method int MediaRouteDescriptor.getPlaybackType()>
		//  131  227:putfield        #169 <Field int mPlaybackType>
					i = j | 1;
		//  132  230:iload_3         
		//  133  231:iconst_1        
		//  134  232:ior             
		//  135  233:istore_2        
				}
				j = i;
		//  136  234:iload_2         
		//  137  235:istore_3        
				if(mPlaybackStream != mediaroutedescriptor.getPlaybackStream())
		//* 138  236:aload_0         
		//* 139  237:getfield        #166 <Field int mPlaybackStream>
		//* 140  240:aload_1         
		//* 141  241:invokevirtual   #433 <Method int MediaRouteDescriptor.getPlaybackStream()>
		//* 142  244:icmpeq          259
				{
					mPlaybackStream = mediaroutedescriptor.getPlaybackStream();
		//  143  247:aload_0         
		//  144  248:aload_1         
		//  145  249:invokevirtual   #433 <Method int MediaRouteDescriptor.getPlaybackStream()>
		//  146  252:putfield        #166 <Field int mPlaybackStream>
					j = i | 1;
		//  147  255:iload_2         
		//  148  256:iconst_1        
		//  149  257:ior             
		//  150  258:istore_3        
				}
				i = j;
		//  151  259:iload_3         
		//  152  260:istore_2        
				if(mDeviceType != mediaroutedescriptor.getDeviceType())
		//* 153  261:aload_0         
		//* 154  262:getfield        #150 <Field int mDeviceType>
		//* 155  265:aload_1         
		//* 156  266:invokevirtual   #435 <Method int MediaRouteDescriptor.getDeviceType()>
		//* 157  269:icmpeq          284
				{
					mDeviceType = mediaroutedescriptor.getDeviceType();
		//  158  272:aload_0         
		//  159  273:aload_1         
		//  160  274:invokevirtual   #435 <Method int MediaRouteDescriptor.getDeviceType()>
		//  161  277:putfield        #150 <Field int mDeviceType>
					i = j | 1;
		//  162  280:iload_3         
		//  163  281:iconst_1        
		//  164  282:ior             
		//  165  283:istore_2        
				}
				j = i;
		//  166  284:iload_2         
		//  167  285:istore_3        
				if(mVolumeHandling != mediaroutedescriptor.getVolumeHandling())
		//* 168  286:aload_0         
		//* 169  287:getfield        #202 <Field int mVolumeHandling>
		//* 170  290:aload_1         
		//* 171  291:invokevirtual   #437 <Method int MediaRouteDescriptor.getVolumeHandling()>
		//* 172  294:icmpeq          309
				{
					mVolumeHandling = mediaroutedescriptor.getVolumeHandling();
		//  173  297:aload_0         
		//  174  298:aload_1         
		//  175  299:invokevirtual   #437 <Method int MediaRouteDescriptor.getVolumeHandling()>
		//  176  302:putfield        #202 <Field int mVolumeHandling>
					j = i | 3;
		//  177  305:iload_2         
		//  178  306:iconst_3        
		//  179  307:ior             
		//  180  308:istore_3        
				}
				i = j;
		//  181  309:iload_3         
		//  182  310:istore_2        
				if(mVolume != mediaroutedescriptor.getVolume())
		//* 183  311:aload_0         
		//* 184  312:getfield        #199 <Field int mVolume>
		//* 185  315:aload_1         
		//* 186  316:invokevirtual   #439 <Method int MediaRouteDescriptor.getVolume()>
		//* 187  319:icmpeq          334
				{
					mVolume = mediaroutedescriptor.getVolume();
		//  188  322:aload_0         
		//  189  323:aload_1         
		//  190  324:invokevirtual   #439 <Method int MediaRouteDescriptor.getVolume()>
		//  191  327:putfield        #199 <Field int mVolume>
					i = j | 3;
		//  192  330:iload_3         
		//  193  331:iconst_3        
		//  194  332:ior             
		//  195  333:istore_2        
				}
				j = i;
		//  196  334:iload_2         
		//  197  335:istore_3        
				if(mVolumeMax != mediaroutedescriptor.getVolumeMax())
		//* 198  336:aload_0         
		//* 199  337:getfield        #205 <Field int mVolumeMax>
		//* 200  340:aload_1         
		//* 201  341:invokevirtual   #441 <Method int MediaRouteDescriptor.getVolumeMax()>
		//* 202  344:icmpeq          359
				{
					mVolumeMax = mediaroutedescriptor.getVolumeMax();
		//  203  347:aload_0         
		//  204  348:aload_1         
		//  205  349:invokevirtual   #441 <Method int MediaRouteDescriptor.getVolumeMax()>
		//  206  352:putfield        #205 <Field int mVolumeMax>
					j = i | 3;
		//  207  355:iload_2         
		//  208  356:iconst_3        
		//  209  357:ior             
		//  210  358:istore_3        
				}
				i = j;
		//  211  359:iload_3         
		//  212  360:istore_2        
				if(mPresentationDisplayId != mediaroutedescriptor.getPresentationDisplayId())
		//* 213  361:aload_0         
		//* 214  362:getfield        #92  <Field int mPresentationDisplayId>
		//* 215  365:aload_1         
		//* 216  366:invokevirtual   #443 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
		//* 217  369:icmpeq          389
				{
					mPresentationDisplayId = mediaroutedescriptor.getPresentationDisplayId();
		//  218  372:aload_0         
		//  219  373:aload_1         
		//  220  374:invokevirtual   #443 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
		//  221  377:putfield        #92  <Field int mPresentationDisplayId>
					mPresentationDisplay = null;
		//  222  380:aload_0         
		//  223  381:aconst_null     
		//  224  382:putfield        #176 <Field Display mPresentationDisplay>
					i = j | 5;
		//  225  385:iload_3         
		//  226  386:iconst_5        
		//  227  387:ior             
		//  228  388:istore_2        
				}
				j = i;
		//  229  389:iload_2         
		//  230  390:istore_3        
				if(!MediaRouter.equal(((Object) (mExtras)), ((Object) (mediaroutedescriptor.getExtras()))))
		//* 231  391:aload_0         
		//* 232  392:getfield        #154 <Field Bundle mExtras>
		//* 233  395:aload_1         
		//* 234  396:invokevirtual   #445 <Method Bundle MediaRouteDescriptor.getExtras()>
		//* 235  399:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
		//* 236  402:ifne            417
				{
					mExtras = mediaroutedescriptor.getExtras();
		//  237  405:aload_0         
		//  238  406:aload_1         
		//  239  407:invokevirtual   #445 <Method Bundle MediaRouteDescriptor.getExtras()>
		//  240  410:putfield        #154 <Field Bundle mExtras>
					j = i | 1;
		//  241  413:iload_2         
		//  242  414:iconst_1        
		//  243  415:ior             
		//  244  416:istore_3        
				}
				i = j;
		//  245  417:iload_3         
		//  246  418:istore_2        
				if(!MediaRouter.equal(((Object) (mSettingsIntent)), ((Object) (mediaroutedescriptor.getSettingsActivity()))))
		//* 247  419:aload_0         
		//* 248  420:getfield        #196 <Field IntentSender mSettingsIntent>
		//* 249  423:aload_1         
		//* 250  424:invokevirtual   #448 <Method IntentSender MediaRouteDescriptor.getSettingsActivity()>
		//* 251  427:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
		//* 252  430:ifne            445
				{
					mSettingsIntent = mediaroutedescriptor.getSettingsActivity();
		//  253  433:aload_0         
		//  254  434:aload_1         
		//  255  435:invokevirtual   #448 <Method IntentSender MediaRouteDescriptor.getSettingsActivity()>
		//  256  438:putfield        #196 <Field IntentSender mSettingsIntent>
					i = j | 1;
		//  257  441:iload_3         
		//  258  442:iconst_1        
		//  259  443:ior             
		//  260  444:istore_2        
				}
				j = i;
		//  261  445:iload_2         
		//  262  446:istore_3        
				if(mCanDisconnect != mediaroutedescriptor.canDisconnectAndKeepPlaying())
		//* 263  447:aload_0         
		//* 264  448:getfield        #133 <Field boolean mCanDisconnect>
		//* 265  451:aload_1         
		//* 266  452:invokevirtual   #451 <Method boolean MediaRouteDescriptor.canDisconnectAndKeepPlaying()>
		//* 267  455:icmpeq          470
				{
					mCanDisconnect = mediaroutedescriptor.canDisconnectAndKeepPlaying();
		//  268  458:aload_0         
		//  269  459:aload_1         
		//  270  460:invokevirtual   #451 <Method boolean MediaRouteDescriptor.canDisconnectAndKeepPlaying()>
		//  271  463:putfield        #133 <Field boolean mCanDisconnect>
					j = i | 5;
		//  272  466:iload_2         
		//  273  467:iconst_5        
		//  274  468:ior             
		//  275  469:istore_3        
				}
			}
			return j;
		//  276  470:iload_3         
		//  277  471:ireturn         
		}

		static final int CHANGE_GENERAL = 1;
		static final int CHANGE_PRESENTATION_DISPLAY = 4;
		static final int CHANGE_VOLUME = 2;
		public static final int CONNECTION_STATE_CONNECTED = 2;
		public static final int CONNECTION_STATE_CONNECTING = 1;
		public static final int CONNECTION_STATE_DISCONNECTED = 0;
		public static final int DEVICE_TYPE_BLUETOOTH = 3;
		public static final int DEVICE_TYPE_SPEAKER = 2;
		public static final int DEVICE_TYPE_TV = 1;
		public static final int DEVICE_TYPE_UNKNOWN = 0;
		public static final int PLAYBACK_TYPE_LOCAL = 0;
		public static final int PLAYBACK_TYPE_REMOTE = 1;
		public static final int PLAYBACK_VOLUME_FIXED = 0;
		public static final int PLAYBACK_VOLUME_VARIABLE = 1;
		public static final int PRESENTATION_DISPLAY_ID_NONE = -1;
		static final String SYSTEM_MEDIA_ROUTE_PROVIDER_PACKAGE_NAME = "android";
		private boolean mCanDisconnect;
		private boolean mConnecting;
		private int mConnectionState;
		private final ArrayList mControlFilters = new ArrayList();
		private String mDescription;
		MediaRouteDescriptor mDescriptor;
		private final String mDescriptorId;
		private int mDeviceType;
		private boolean mEnabled;
		private Bundle mExtras;
		private Uri mIconUri;
		private String mName;
		private int mPlaybackStream;
		private int mPlaybackType;
		private Display mPresentationDisplay;
		private int mPresentationDisplayId;
		private final ProviderInfo mProvider;
		private IntentSender mSettingsIntent;
		private final String mUniqueId;
		private int mVolume;
		private int mVolumeHandling;
		private int mVolumeMax;


/*
		static String access$100(RouteInfo routeinfo)
		{
			return routeinfo.mDescriptorId;
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field String mDescriptorId>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(RouteInfo routeinfo)
		{
			return routeinfo.mUniqueId;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field String mUniqueId>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$400(RouteInfo routeinfo)
		{
			return routeinfo.mEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #106 <Field boolean mEnabled>
		//    2    4:ireturn         
		}

*/

		RouteInfo(ProviderInfo providerinfo, String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #85  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #87  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #88  <Method void ArrayList()>
		//    6   12:putfield        #90  <Field ArrayList mControlFilters>
			mPresentationDisplayId = -1;
		//    7   15:aload_0         
		//    8   16:iconst_m1       
		//    9   17:putfield        #92  <Field int mPresentationDisplayId>
			mProvider = providerinfo;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:putfield        #94  <Field MediaRouter$ProviderInfo mProvider>
			mDescriptorId = s;
		//   13   25:aload_0         
		//   14   26:aload_2         
		//   15   27:putfield        #96  <Field String mDescriptorId>
			mUniqueId = s1;
		//   16   30:aload_0         
		//   17   31:aload_3         
		//   18   32:putfield        #98  <Field String mUniqueId>
		//   19   35:return          
		}
	}

	private static interface RouteInfo.ConnectionState
		extends Annotation
	{
	}

	private static interface RouteInfo.DeviceType
		extends Annotation
	{
	}

	private static interface RouteInfo.PlaybackType
		extends Annotation
	{
	}

	private static interface RouteInfo.PlaybackVolume
		extends Annotation
	{
	}


	private MediaRouter(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void Object()>
		mCallbackRecords = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #109 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #110 <Method void ArrayList()>
	//    6   12:putfield        #112 <Field ArrayList mCallbackRecords>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #114 <Field Context mContext>
	//   10   20:return          
	}


	static void checkCallingThread()
	{
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #124 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #127 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       19
			throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
	//    3    9:new             #129 <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #131 <String "The media router service must only be accessed on the application's main thread.">
	//    6   15:invokespecial   #134 <Method void IllegalStateException(String)>
	//    7   18:athrow          
		else
			return;
	//    8   19:return          
	}

	static boolean equal(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj1 != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       26
	//    3    5:aload_0         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:ifnull          24
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #140 <Method boolean Object.equals(Object)>
	//   10   18:ifeq            24
	//   11   21:goto            26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	private int findCallbackRecord(Callback callback)
	{
		int j = mCallbackRecords.size();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ArrayList mCallbackRecords>
	//    2    4:invokevirtual   #148 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
			if(((CallbackRecord)mCallbackRecords.get(i)).mCallback == callback)
	//*   9   15:aload_0         
	//*  10   16:getfield        #112 <Field ArrayList mCallbackRecords>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #152 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #14  <Class MediaRouter$CallbackRecord>
	//*  14   26:getfield        #156 <Field MediaRouter$Callback MediaRouter$CallbackRecord.mCallback>
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

	public static MediaRouter getInstance(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("context must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #163 <String "context must not be null">
	//    5   10:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		checkCallingThread();
	//    7   14:invokestatic    #166 <Method void checkCallingThread()>
		if(sGlobal == null)
	//*   8   17:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//*   9   20:ifnonnull       43
		{
			sGlobal = new GlobalMediaRouter(context.getApplicationContext());
	//   10   23:new             #20  <Class MediaRouter$GlobalMediaRouter>
	//   11   26:dup             
	//   12   27:aload_0         
	//   13   28:invokevirtual   #174 <Method Context Context.getApplicationContext()>
	//   14   31:invokespecial   #175 <Method void MediaRouter$GlobalMediaRouter(Context)>
	//   15   34:putstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
			sGlobal.start();
	//   16   37:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   17   40:invokevirtual   #178 <Method void MediaRouter$GlobalMediaRouter.start()>
		}
		return sGlobal.getRouter(context);
	//   18   43:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   19   46:aload_0         
	//   20   47:invokevirtual   #181 <Method MediaRouter MediaRouter$GlobalMediaRouter.getRouter(Context)>
	//   21   50:areturn         
	}

	public void addCallback(MediaRouteSelector mediarouteselector, Callback callback)
	{
		addCallback(mediarouteselector, callback, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #187 <Method void addCallback(MediaRouteSelector, MediaRouter$Callback, int)>
	//    5    7:return          
	}

	public void addCallback(MediaRouteSelector mediarouteselector, Callback callback, int i)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #189 <String "selector must not be null">
	//    5   10:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(callback == null)
	//*   7   14:aload_2         
	//*   8   15:ifnonnull       28
			throw new IllegalArgumentException("callback must not be null");
	//    9   18:new             #161 <Class IllegalArgumentException>
	//   10   21:dup             
	//   11   22:ldc1            #191 <String "callback must not be null">
	//   12   24:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		checkCallingThread();
	//   14   28:invokestatic    #166 <Method void checkCallingThread()>
		if(DEBUG)
	//*  15   31:getstatic       #102 <Field boolean DEBUG>
	//*  16   34:ifeq            105
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #193 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #194 <Method void StringBuilder()>
	//   20   44:astore          5
			stringbuilder.append("addCallback: selector=");
	//   21   46:aload           5
	//   22   48:ldc1            #196 <String "addCallback: selector=">
	//   23   50:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:pop             
			stringbuilder.append(((Object) (mediarouteselector)));
	//   25   54:aload           5
	//   26   56:aload_1         
	//   27   57:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   28   60:pop             
			stringbuilder.append(", callback=");
	//   29   61:aload           5
	//   30   63:ldc1            #205 <String ", callback=">
	//   31   65:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   32   68:pop             
			stringbuilder.append(((Object) (callback)));
	//   33   69:aload           5
	//   34   71:aload_2         
	//   35   72:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   36   75:pop             
			stringbuilder.append(", flags=");
	//   37   76:aload           5
	//   38   78:ldc1            #207 <String ", flags=">
	//   39   80:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   41   84:aload           5
	//   42   86:iload_3         
	//   43   87:invokestatic    #213 <Method String Integer.toHexString(int)>
	//   44   90:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   45   93:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   46   94:ldc1            #79  <String "MediaRouter">
	//   47   96:aload           5
	//   48   98:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   49  101:invokestatic    #221 <Method int Log.d(String, String)>
	//   50  104:pop             
		}
		int j = findCallbackRecord(callback);
	//   51  105:aload_0         
	//   52  106:aload_2         
	//   53  107:invokespecial   #223 <Method int findCallbackRecord(MediaRouter$Callback)>
	//   54  110:istore          4
		if(j < 0)
	//*  55  112:iload           4
	//*  56  114:ifge            139
		{
			callback = ((Callback) (new CallbackRecord(this, callback)));
	//   57  117:new             #14  <Class MediaRouter$CallbackRecord>
	//   58  120:dup             
	//   59  121:aload_0         
	//   60  122:aload_2         
	//   61  123:invokespecial   #226 <Method void MediaRouter$CallbackRecord(MediaRouter, MediaRouter$Callback)>
	//   62  126:astore_2        
			mCallbackRecords.add(((Object) (callback)));
	//   63  127:aload_0         
	//   64  128:getfield        #112 <Field ArrayList mCallbackRecords>
	//   65  131:aload_2         
	//   66  132:invokevirtual   #229 <Method boolean ArrayList.add(Object)>
	//   67  135:pop             
		} else
	//*  68  136:goto            152
		{
			callback = ((Callback) ((CallbackRecord)mCallbackRecords.get(j)));
	//   69  139:aload_0         
	//   70  140:getfield        #112 <Field ArrayList mCallbackRecords>
	//   71  143:iload           4
	//   72  145:invokevirtual   #152 <Method Object ArrayList.get(int)>
	//   73  148:checkcast       #14  <Class MediaRouter$CallbackRecord>
	//   74  151:astore_2        
		}
		boolean flag = false;
	//   75  152:iconst_0        
	//   76  153:istore          4
		if((~((CallbackRecord) (callback)).mFlags & i) != 0)
	//*  77  155:aload_2         
	//*  78  156:getfield        #232 <Field int MediaRouter$CallbackRecord.mFlags>
	//*  79  159:iconst_m1       
	//*  80  160:ixor            
	//*  81  161:iload_3         
	//*  82  162:iand            
	//*  83  163:ifeq            179
		{
			callback.mFlags = ((CallbackRecord) (callback)).mFlags | i;
	//   84  166:aload_2         
	//   85  167:aload_2         
	//   86  168:getfield        #232 <Field int MediaRouter$CallbackRecord.mFlags>
	//   87  171:iload_3         
	//   88  172:ior             
	//   89  173:putfield        #232 <Field int MediaRouter$CallbackRecord.mFlags>
			flag = true;
	//   90  176:iconst_1        
	//   91  177:istore          4
		}
		if(!((CallbackRecord) (callback)).mSelector.contains(mediarouteselector))
	//*  92  179:aload_2         
	//*  93  180:getfield        #236 <Field MediaRouteSelector MediaRouter$CallbackRecord.mSelector>
	//*  94  183:aload_1         
	//*  95  184:invokevirtual   #242 <Method boolean MediaRouteSelector.contains(MediaRouteSelector)>
	//*  96  187:ifne            215
		{
			callback.mSelector = (new MediaRouteSelector.Builder(((CallbackRecord) (callback)).mSelector)).addSelector(mediarouteselector).build();
	//   97  190:aload_2         
	//   98  191:new             #244 <Class MediaRouteSelector$Builder>
	//   99  194:dup             
	//  100  195:aload_2         
	//  101  196:getfield        #236 <Field MediaRouteSelector MediaRouter$CallbackRecord.mSelector>
	//  102  199:invokespecial   #247 <Method void MediaRouteSelector$Builder(MediaRouteSelector)>
	//  103  202:aload_1         
	//  104  203:invokevirtual   #251 <Method MediaRouteSelector$Builder MediaRouteSelector$Builder.addSelector(MediaRouteSelector)>
	//  105  206:invokevirtual   #255 <Method MediaRouteSelector MediaRouteSelector$Builder.build()>
	//  106  209:putfield        #236 <Field MediaRouteSelector MediaRouter$CallbackRecord.mSelector>
			flag = true;
	//  107  212:iconst_1        
	//  108  213:istore          4
		}
		if(flag)
	//* 109  215:iload           4
	//* 110  217:ifeq            226
			sGlobal.updateDiscoveryRequest();
	//  111  220:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//  112  223:invokevirtual   #258 <Method void MediaRouter$GlobalMediaRouter.updateDiscoveryRequest()>
	//  113  226:return          
	}

	public void addProvider(MediaRouteProvider mediarouteprovider)
	{
		if(mediarouteprovider == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("providerInstance must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #262 <String "providerInstance must not be null">
	//    5   11:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		checkCallingThread();
	//    7   15:invokestatic    #166 <Method void checkCallingThread()>
		if(DEBUG)
	//*   8   18:getstatic       #102 <Field boolean DEBUG>
	//*   9   21:ifeq            56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   24:new             #193 <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #194 <Method void StringBuilder()>
	//   13   31:astore_2        
			stringbuilder.append("addProvider: ");
	//   14   32:aload_2         
	//   15   33:ldc2            #264 <String "addProvider: ">
	//   16   36:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			stringbuilder.append(((Object) (mediarouteprovider)));
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   21   45:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   22   46:ldc1            #79  <String "MediaRouter">
	//   23   48:aload_2         
	//   24   49:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #221 <Method int Log.d(String, String)>
	//   26   55:pop             
		}
		sGlobal.addProvider(mediarouteprovider);
	//   27   56:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   28   59:aload_1         
	//   29   60:invokevirtual   #266 <Method void MediaRouter$GlobalMediaRouter.addProvider(MediaRouteProvider)>
	//   30   63:return          
	}

	public void addRemoteControlClient(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("remoteControlClient must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #270 <String "remoteControlClient must not be null">
	//    5   11:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		checkCallingThread();
	//    7   15:invokestatic    #166 <Method void checkCallingThread()>
		if(DEBUG)
	//*   8   18:getstatic       #102 <Field boolean DEBUG>
	//*   9   21:ifeq            56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   24:new             #193 <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #194 <Method void StringBuilder()>
	//   13   31:astore_2        
			stringbuilder.append("addRemoteControlClient: ");
	//   14   32:aload_2         
	//   15   33:ldc2            #272 <String "addRemoteControlClient: ">
	//   16   36:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			stringbuilder.append(obj);
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   21   45:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   22   46:ldc1            #79  <String "MediaRouter">
	//   23   48:aload_2         
	//   24   49:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #221 <Method int Log.d(String, String)>
	//   26   55:pop             
		}
		sGlobal.addRemoteControlClient(obj);
	//   27   56:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   28   59:aload_1         
	//   29   60:invokevirtual   #274 <Method void MediaRouter$GlobalMediaRouter.addRemoteControlClient(Object)>
	//   30   63:return          
	}

	public RouteInfo getBluetoothRoute()
	{
		checkCallingThread();
	//    0    0:invokestatic    #166 <Method void checkCallingThread()>
		return sGlobal.getBluetoothRoute();
	//    1    3:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    2    6:invokevirtual   #278 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getBluetoothRoute()>
	//    3    9:areturn         
	}

	public RouteInfo getDefaultRoute()
	{
		checkCallingThread();
	//    0    0:invokestatic    #166 <Method void checkCallingThread()>
		return sGlobal.getDefaultRoute();
	//    1    3:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    2    6:invokevirtual   #281 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getDefaultRoute()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getMediaSessionToken()
	{
		return sGlobal.getMediaSessionToken();
	//    0    0:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    1    3:invokevirtual   #286 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter$GlobalMediaRouter.getMediaSessionToken()>
	//    2    6:areturn         
	}

	public List getProviders()
	{
		checkCallingThread();
	//    0    0:invokestatic    #166 <Method void checkCallingThread()>
		return sGlobal.getProviders();
	//    1    3:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    2    6:invokevirtual   #290 <Method List MediaRouter$GlobalMediaRouter.getProviders()>
	//    3    9:areturn         
	}

	public List getRoutes()
	{
		checkCallingThread();
	//    0    0:invokestatic    #166 <Method void checkCallingThread()>
		return sGlobal.getRoutes();
	//    1    3:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    2    6:invokevirtual   #294 <Method List MediaRouter$GlobalMediaRouter.getRoutes()>
	//    3    9:areturn         
	}

	public RouteInfo getSelectedRoute()
	{
		checkCallingThread();
	//    0    0:invokestatic    #166 <Method void checkCallingThread()>
		return sGlobal.getSelectedRoute();
	//    1    3:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    2    6:invokevirtual   #298 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
	//    3    9:areturn         
	}

	public boolean isRouteAvailable(MediaRouteSelector mediarouteselector, int i)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #189 <String "selector must not be null">
	//    5   10:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			checkCallingThread();
	//    7   14:invokestatic    #166 <Method void checkCallingThread()>
			return sGlobal.isRouteAvailable(mediarouteselector, i);
	//    8   17:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:invokevirtual   #302 <Method boolean MediaRouter$GlobalMediaRouter.isRouteAvailable(MediaRouteSelector, int)>
	//   12   25:ireturn         
		}
	}

	public void removeCallback(Callback callback)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("callback must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #191 <String "callback must not be null">
	//    5   10:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		checkCallingThread();
	//    7   14:invokestatic    #166 <Method void checkCallingThread()>
		if(DEBUG)
	//*   8   17:getstatic       #102 <Field boolean DEBUG>
	//*   9   20:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   23:new             #193 <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #194 <Method void StringBuilder()>
	//   13   30:astore_3        
			stringbuilder.append("removeCallback: callback=");
	//   14   31:aload_3         
	//   15   32:ldc2            #306 <String "removeCallback: callback=">
	//   16   35:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
			stringbuilder.append(((Object) (callback)));
	//   18   39:aload_3         
	//   19   40:aload_1         
	//   20   41:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   21   44:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   22   45:ldc1            #79  <String "MediaRouter">
	//   23   47:aload_3         
	//   24   48:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   25   51:invokestatic    #221 <Method int Log.d(String, String)>
	//   26   54:pop             
		}
		int i = findCallbackRecord(callback);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokespecial   #223 <Method int findCallbackRecord(MediaRouter$Callback)>
	//   30   60:istore_2        
		if(i >= 0)
	//*  31   61:iload_2         
	//*  32   62:iflt            80
		{
			mCallbackRecords.remove(i);
	//   33   65:aload_0         
	//   34   66:getfield        #112 <Field ArrayList mCallbackRecords>
	//   35   69:iload_2         
	//   36   70:invokevirtual   #309 <Method Object ArrayList.remove(int)>
	//   37   73:pop             
			sGlobal.updateDiscoveryRequest();
	//   38   74:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   39   77:invokevirtual   #258 <Method void MediaRouter$GlobalMediaRouter.updateDiscoveryRequest()>
		}
	//   40   80:return          
	}

	public void removeProvider(MediaRouteProvider mediarouteprovider)
	{
		if(mediarouteprovider == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("providerInstance must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #262 <String "providerInstance must not be null">
	//    5   11:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		checkCallingThread();
	//    7   15:invokestatic    #166 <Method void checkCallingThread()>
		if(DEBUG)
	//*   8   18:getstatic       #102 <Field boolean DEBUG>
	//*   9   21:ifeq            56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   24:new             #193 <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #194 <Method void StringBuilder()>
	//   13   31:astore_2        
			stringbuilder.append("removeProvider: ");
	//   14   32:aload_2         
	//   15   33:ldc2            #312 <String "removeProvider: ">
	//   16   36:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			stringbuilder.append(((Object) (mediarouteprovider)));
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   21   45:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   22   46:ldc1            #79  <String "MediaRouter">
	//   23   48:aload_2         
	//   24   49:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #221 <Method int Log.d(String, String)>
	//   26   55:pop             
		}
		sGlobal.removeProvider(mediarouteprovider);
	//   27   56:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   28   59:aload_1         
	//   29   60:invokevirtual   #314 <Method void MediaRouter$GlobalMediaRouter.removeProvider(MediaRouteProvider)>
	//   30   63:return          
	}

	public void removeRemoteControlClient(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("remoteControlClient must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #270 <String "remoteControlClient must not be null">
	//    5   11:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(DEBUG)
	//*   7   15:getstatic       #102 <Field boolean DEBUG>
	//*   8   18:ifeq            53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #193 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #194 <Method void StringBuilder()>
	//   12   28:astore_2        
			stringbuilder.append("removeRemoteControlClient: ");
	//   13   29:aload_2         
	//   14   30:ldc2            #317 <String "removeRemoteControlClient: ">
	//   15   33:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
			stringbuilder.append(obj);
	//   17   37:aload_2         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   20   42:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   21   43:ldc1            #79  <String "MediaRouter">
	//   22   45:aload_2         
	//   23   46:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   24   49:invokestatic    #221 <Method int Log.d(String, String)>
	//   25   52:pop             
		}
		sGlobal.removeRemoteControlClient(obj);
	//   26   53:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   27   56:aload_1         
	//   28   57:invokevirtual   #319 <Method void MediaRouter$GlobalMediaRouter.removeRemoteControlClient(Object)>
	//   29   60:return          
	}

	public void selectRoute(RouteInfo routeinfo)
	{
		if(routeinfo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("route must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #323 <String "route must not be null">
	//    5   11:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		checkCallingThread();
	//    7   15:invokestatic    #166 <Method void checkCallingThread()>
		if(DEBUG)
	//*   8   18:getstatic       #102 <Field boolean DEBUG>
	//*   9   21:ifeq            56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   24:new             #193 <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #194 <Method void StringBuilder()>
	//   13   31:astore_2        
			stringbuilder.append("selectRoute: ");
	//   14   32:aload_2         
	//   15   33:ldc2            #325 <String "selectRoute: ">
	//   16   36:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			stringbuilder.append(((Object) (routeinfo)));
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   21   45:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   22   46:ldc1            #79  <String "MediaRouter">
	//   23   48:aload_2         
	//   24   49:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   25   52:invokestatic    #221 <Method int Log.d(String, String)>
	//   26   55:pop             
		}
		sGlobal.selectRoute(routeinfo);
	//   27   56:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   28   59:aload_1         
	//   29   60:invokevirtual   #327 <Method void MediaRouter$GlobalMediaRouter.selectRoute(MediaRouter$RouteInfo)>
	//   30   63:return          
	}

	public void setMediaSession(Object obj)
	{
		if(DEBUG)
	//*   0    0:getstatic       #102 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #193 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #194 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("addMediaSession: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #330 <String "addMediaSession: ">
	//    8   18:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(obj);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   14   28:ldc1            #79  <String "MediaRouter">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #221 <Method int Log.d(String, String)>
	//   18   37:pop             
		}
		sGlobal.setMediaSession(obj);
	//   19   38:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   20   41:aload_1         
	//   21   42:invokevirtual   #332 <Method void MediaRouter$GlobalMediaRouter.setMediaSession(Object)>
	//   22   45:return          
	}

	public void setMediaSessionCompat(MediaSessionCompat mediasessioncompat)
	{
		if(DEBUG)
	//*   0    0:getstatic       #102 <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #193 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #194 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("addMediaSessionCompat: ");
	//    6   14:aload_2         
	//    7   15:ldc2            #336 <String "addMediaSessionCompat: ">
	//    8   18:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (mediasessioncompat)));
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   14   28:ldc1            #79  <String "MediaRouter">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #221 <Method int Log.d(String, String)>
	//   18   37:pop             
		}
		sGlobal.setMediaSessionCompat(mediasessioncompat);
	//   19   38:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   20   41:aload_1         
	//   21   42:invokevirtual   #338 <Method void MediaRouter$GlobalMediaRouter.setMediaSessionCompat(MediaSessionCompat)>
	//   22   45:return          
	}

	public void unselect(int i)
	{
		if(i >= 0 && i <= 3)
	//*   0    0:iload_1         
	//*   1    1:iflt            55
	//*   2    4:iload_1         
	//*   3    5:iconst_3        
	//*   4    6:icmple          12
	//*   5    9:goto            55
		{
			checkCallingThread();
	//    6   12:invokestatic    #166 <Method void checkCallingThread()>
			RouteInfo routeinfo = sGlobal.chooseFallbackRoute();
	//    7   15:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//    8   18:invokevirtual   #343 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.chooseFallbackRoute()>
	//    9   21:astore_2        
			if(sGlobal.getSelectedRoute() != routeinfo)
	//*  10   22:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//*  11   25:invokevirtual   #298 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
	//*  12   28:aload_2         
	//*  13   29:if_acmpeq       41
			{
				sGlobal.selectRoute(routeinfo, i);
	//   14   32:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   15   35:aload_2         
	//   16   36:iload_1         
	//   17   37:invokevirtual   #346 <Method void MediaRouter$GlobalMediaRouter.selectRoute(MediaRouter$RouteInfo, int)>
				return;
	//   18   40:return          
			} else
			{
				sGlobal.selectRoute(sGlobal.getDefaultRoute(), i);
	//   19   41:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   20   44:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   21   47:invokevirtual   #281 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getDefaultRoute()>
	//   22   50:iload_1         
	//   23   51:invokevirtual   #346 <Method void MediaRouter$GlobalMediaRouter.selectRoute(MediaRouter$RouteInfo, int)>
				return;
	//   24   54:return          
			}
		} else
		{
			throw new IllegalArgumentException("Unsupported reason to unselect route");
	//   25   55:new             #161 <Class IllegalArgumentException>
	//   26   58:dup             
	//   27   59:ldc2            #348 <String "Unsupported reason to unselect route">
	//   28   62:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//   29   65:athrow          
		}
	}

	public RouteInfo updateSelectedRoute(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #161 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #189 <String "selector must not be null">
	//    5   10:invokespecial   #164 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		checkCallingThread();
	//    7   14:invokestatic    #166 <Method void checkCallingThread()>
		if(DEBUG)
	//*   8   17:getstatic       #102 <Field boolean DEBUG>
	//*   9   20:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   23:new             #193 <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #194 <Method void StringBuilder()>
	//   13   30:astore_2        
			stringbuilder.append("updateSelectedRoute: ");
	//   14   31:aload_2         
	//   15   32:ldc2            #352 <String "updateSelectedRoute: ">
	//   16   35:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
			stringbuilder.append(((Object) (mediarouteselector)));
	//   18   39:aload_2         
	//   19   40:aload_1         
	//   20   41:invokevirtual   #203 <Method StringBuilder StringBuilder.append(Object)>
	//   21   44:pop             
			Log.d("MediaRouter", stringbuilder.toString());
	//   22   45:ldc1            #79  <String "MediaRouter">
	//   23   47:aload_2         
	//   24   48:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   25   51:invokestatic    #221 <Method int Log.d(String, String)>
	//   26   54:pop             
		}
		RouteInfo routeinfo1 = sGlobal.getSelectedRoute();
	//   27   55:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   28   58:invokevirtual   #298 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
	//   29   61:astore_3        
		RouteInfo routeinfo = routeinfo1;
	//   30   62:aload_3         
	//   31   63:astore_2        
		if(!routeinfo1.isDefaultOrBluetooth())
	//*  32   64:aload_3         
	//*  33   65:invokevirtual   #356 <Method boolean MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*  34   68:ifne            95
		{
			routeinfo = routeinfo1;
	//   35   71:aload_3         
	//   36   72:astore_2        
			if(!routeinfo1.matchesSelector(mediarouteselector))
	//*  37   73:aload_3         
	//*  38   74:aload_1         
	//*  39   75:invokevirtual   #359 <Method boolean MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//*  40   78:ifne            95
			{
				routeinfo = sGlobal.chooseFallbackRoute();
	//   41   81:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   42   84:invokevirtual   #343 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.chooseFallbackRoute()>
	//   43   87:astore_2        
				sGlobal.selectRoute(routeinfo);
	//   44   88:getstatic       #168 <Field MediaRouter$GlobalMediaRouter sGlobal>
	//   45   91:aload_2         
	//   46   92:invokevirtual   #327 <Method void MediaRouter$GlobalMediaRouter.selectRoute(MediaRouter$RouteInfo)>
			}
		}
		return routeinfo;
	//   47   95:aload_2         
	//   48   96:areturn         
	}

	public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
	public static final int AVAILABILITY_FLAG_REQUIRE_MATCH = 2;
	public static final int CALLBACK_FLAG_FORCE_DISCOVERY = 8;
	public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
	public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
	public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
	static final boolean DEBUG = Log.isLoggable("MediaRouter", 3);
	static final String TAG = "MediaRouter";
	public static final int UNSELECT_REASON_DISCONNECTED = 1;
	public static final int UNSELECT_REASON_ROUTE_CHANGED = 3;
	public static final int UNSELECT_REASON_STOPPED = 2;
	public static final int UNSELECT_REASON_UNKNOWN = 0;
	static GlobalMediaRouter sGlobal;
	final ArrayList mCallbackRecords;
	final Context mContext;

	static 
	{
	//    0    0:ldc1            #79  <String "MediaRouter">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #100 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #102 <Field boolean DEBUG>
	//*   4    9:return          
	}

	// Unreferenced inner class android/support/v7/media/MediaRouter$GlobalMediaRouter$1

/* anonymous class */
	class GlobalMediaRouter._cls1
		implements android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener
	{

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

		final GlobalMediaRouter this$0;

			
			{
				this$0 = GlobalMediaRouter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
