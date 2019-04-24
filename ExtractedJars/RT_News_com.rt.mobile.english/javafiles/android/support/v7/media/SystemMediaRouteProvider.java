// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.Display;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProvider, MediaRouterJellybeanMr2, MediaRouterJellybean, MediaRouterJellybeanMr1, 
//			MediaRouteDescriptor, MediaRouteDiscoveryRequest, MediaRouteSelector

abstract class SystemMediaRouteProvider extends MediaRouteProvider
{
	private static class Api24Impl extends JellybeanMr2Impl
	{

		protected void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
		{
			super.onBuildSystemRouteDescriptor(systemrouterecord, builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void SystemMediaRouteProvider$JellybeanMr2Impl.onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
			builder.setDeviceType(MediaRouterApi24.RouteInfo.getDeviceType(systemrouterecord.mRouteObj));
		//    4    6:aload_2         
		//    5    7:aload_1         
		//    6    8:getfield        #25  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//    7   11:invokestatic    #31  <Method int MediaRouterApi24$RouteInfo.getDeviceType(Object)>
		//    8   14:invokevirtual   #37  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setDeviceType(int)>
		//    9   17:pop             
		//   10   18:return          
		}

		public Api24Impl(Context context, SyncCallback synccallback)
		{
			super(context, synccallback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #14  <Method void SystemMediaRouteProvider$JellybeanMr2Impl(Context, SystemMediaRouteProvider$SyncCallback)>
		//    4    6:return          
		}
	}

	static class JellybeanImpl extends SystemMediaRouteProvider
		implements MediaRouterJellybean.Callback, MediaRouterJellybean.VolumeCallback
	{

		private boolean addSystemRouteNoPublish(Object obj)
		{
			if(getUserRouteRecord(obj) == null && findSystemRouteRecord(obj) < 0)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #132 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
		//*   3    5:ifnonnull       46
		//*   4    8:aload_0         
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #136 <Method int findSystemRouteRecord(Object)>
		//*   7   13:ifge            46
			{
				obj = ((Object) (new SystemRouteRecord(obj, assignRouteId(obj))));
		//    8   16:new             #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//    9   19:dup             
		//   10   20:aload_1         
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokespecial   #140 <Method String assignRouteId(Object)>
		//   14   26:invokespecial   #143 <Method void SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord(Object, String)>
		//   15   29:astore_1        
				updateSystemRouteDescriptor(((SystemRouteRecord) (obj)));
		//   16   30:aload_0         
		//   17   31:aload_1         
		//   18   32:invokevirtual   #147 <Method void updateSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord)>
				mSystemRouteRecords.add(obj);
		//   19   35:aload_0         
		//   20   36:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   21   39:aload_1         
		//   22   40:invokevirtual   #67  <Method boolean ArrayList.add(Object)>
		//   23   43:pop             
				return true;
		//   24   44:iconst_1        
		//   25   45:ireturn         
			} else
			{
				return false;
		//   26   46:iconst_0        
		//   27   47:ireturn         
			}
		}

		private String assignRouteId(Object obj)
		{
			boolean flag;
			if(getDefaultRoute() == obj)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #150 <Method Object getDefaultRoute()>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       13
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:goto            15
				flag = false;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			if(flag)
		//*   9   15:iload_2         
		//*  10   16:ifeq            25
				obj = "DEFAULT_ROUTE";
		//   11   19:ldc1            #152 <String "DEFAULT_ROUTE">
		//   12   21:astore_1        
			else
		//*  13   22:goto            52
				obj = ((Object) (String.format(Locale.US, "ROUTE_%08x", new Object[] {
					Integer.valueOf(getRouteName(obj).hashCode())
				})));
		//   14   25:getstatic       #158 <Field Locale Locale.US>
		//   15   28:ldc1            #160 <String "ROUTE_%08x">
		//   16   30:iconst_1        
		//   17   31:anewarray       Object[]
		//   18   34:dup             
		//   19   35:iconst_0        
		//   20   36:aload_0         
		//   21   37:aload_1         
		//   22   38:invokevirtual   #165 <Method String getRouteName(Object)>
		//   23   41:invokevirtual   #171 <Method int String.hashCode()>
		//   24   44:invokestatic    #177 <Method Integer Integer.valueOf(int)>
		//   25   47:aastore         
		//   26   48:invokestatic    #181 <Method String String.format(Locale, String, Object[])>
		//   27   51:astore_1        
			if(findSystemRouteRecordByDescriptorId(((String) (obj))) < 0)
		//*  28   52:aload_0         
		//*  29   53:aload_1         
		//*  30   54:invokevirtual   #185 <Method int findSystemRouteRecordByDescriptorId(String)>
		//*  31   57:ifge            62
				return ((String) (obj));
		//   32   60:aload_1         
		//   33   61:areturn         
			int i = 2;
		//   34   62:iconst_2        
		//   35   63:istore_2        
			do
			{
				String s = String.format(Locale.US, "%s_%d", new Object[] {
					obj, Integer.valueOf(i)
				});
		//   36   64:getstatic       #158 <Field Locale Locale.US>
		//   37   67:ldc1            #187 <String "%s_%d">
		//   38   69:iconst_2        
		//   39   70:anewarray       Object[]
		//   40   73:dup             
		//   41   74:iconst_0        
		//   42   75:aload_1         
		//   43   76:aastore         
		//   44   77:dup             
		//   45   78:iconst_1        
		//   46   79:iload_2         
		//   47   80:invokestatic    #177 <Method Integer Integer.valueOf(int)>
		//   48   83:aastore         
		//   49   84:invokestatic    #181 <Method String String.format(Locale, String, Object[])>
		//   50   87:astore_3        
				if(findSystemRouteRecordByDescriptorId(s) < 0)
		//*  51   88:aload_0         
		//*  52   89:aload_3         
		//*  53   90:invokevirtual   #185 <Method int findSystemRouteRecordByDescriptorId(String)>
		//*  54   93:ifge            98
					return s;
		//   55   96:aload_3         
		//   56   97:areturn         
				i++;
		//   57   98:iload_2         
		//   58   99:iconst_1        
		//   59  100:iadd            
		//   60  101:istore_2        
			} while(true);
		//   61  102:goto            64
		}

		private void updateSystemRoutes()
		{
			updateCallback();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #190 <Method void updateCallback()>
			Iterator iterator = MediaRouterJellybean.getRoutes(mRouterObj).iterator();
		//    2    4:aload_0         
		//    3    5:getfield        #90  <Field Object mRouterObj>
		//    4    8:invokestatic    #194 <Method List MediaRouterJellybean.getRoutes(Object)>
		//    5   11:invokeinterface #200 <Method Iterator List.iterator()>
		//    6   16:astore_2        
			boolean flag;
			for(flag = false; iterator.hasNext(); flag |= addSystemRouteNoPublish(iterator.next()));
		//    7   17:iconst_0        
		//    8   18:istore_1        
		//    9   19:aload_2         
		//   10   20:invokeinterface #206 <Method boolean Iterator.hasNext()>
		//   11   25:ifeq            44
		//   12   28:iload_1         
		//   13   29:aload_0         
		//   14   30:aload_2         
		//   15   31:invokeinterface #209 <Method Object Iterator.next()>
		//   16   36:invokespecial   #211 <Method boolean addSystemRouteNoPublish(Object)>
		//   17   39:ior             
		//   18   40:istore_1        
		//*  19   41:goto            19
			if(flag)
		//*  20   44:iload_1         
		//*  21   45:ifeq            52
				publishRoutes();
		//   22   48:aload_0         
		//   23   49:invokevirtual   #214 <Method void publishRoutes()>
		//   24   52:return          
		}

		protected Object createCallbackObj()
		{
			return MediaRouterJellybean.createCallback(((MediaRouterJellybean.Callback) (this)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #218 <Method Object MediaRouterJellybean.createCallback(MediaRouterJellybean$Callback)>
		//    2    4:areturn         
		}

		protected Object createVolumeCallbackObj()
		{
			return MediaRouterJellybean.createVolumeCallback(((MediaRouterJellybean.VolumeCallback) (this)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #222 <Method Object MediaRouterJellybean.createVolumeCallback(MediaRouterJellybean$VolumeCallback)>
		//    2    4:areturn         
		}

		protected int findSystemRouteRecord(Object obj)
		{
			int j = mSystemRouteRecords.size();
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//    2    4:invokevirtual   #225 <Method int ArrayList.size()>
		//    3    7:istore_3        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_2        
		//*   6   10:iload_2         
		//*   7   11:iload_3         
		//*   8   12:icmpge          42
				if(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj == obj)
		//*   9   15:aload_0         
		//*  10   16:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//*  11   19:iload_2         
		//*  12   20:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//*  13   23:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//*  14   26:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
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

		protected int findSystemRouteRecordByDescriptorId(String s)
		{
			int j = mSystemRouteRecords.size();
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//    2    4:invokevirtual   #225 <Method int ArrayList.size()>
		//    3    7:istore_3        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_2        
		//*   6   10:iload_2         
		//*   7   11:iload_3         
		//*   8   12:icmpge          45
				if(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptorId.equals(((Object) (s))))
		//*   9   15:aload_0         
		//*  10   16:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//*  11   19:iload_2         
		//*  12   20:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//*  13   23:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//*  14   26:getfield        #236 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
		//*  15   29:aload_1         
		//*  16   30:invokevirtual   #239 <Method boolean String.equals(Object)>
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

		protected int findUserRouteRecord(MediaRouter.RouteInfo routeinfo)
		{
			int j = mUserRouteRecords.size();
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field ArrayList mUserRouteRecords>
		//    2    4:invokevirtual   #225 <Method int ArrayList.size()>
		//    3    7:istore_3        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_2        
		//*   6   10:iload_2         
		//*   7   11:iload_3         
		//*   8   12:icmpge          42
				if(((UserRouteRecord)mUserRouteRecords.get(i)).mRoute == routeinfo)
		//*   9   15:aload_0         
		//*  10   16:getfield        #80  <Field ArrayList mUserRouteRecords>
		//*  11   19:iload_2         
		//*  12   20:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//*  13   23:checkcast       #17  <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
		//*  14   26:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
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

		protected Object getDefaultRoute()
		{
			if(mGetDefaultRouteWorkaround == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #247 <Field MediaRouterJellybean$GetDefaultRouteWorkaround mGetDefaultRouteWorkaround>
		//*   2    4:ifnonnull       18
				mGetDefaultRouteWorkaround = new MediaRouterJellybean.GetDefaultRouteWorkaround();
		//    3    7:aload_0         
		//    4    8:new             #249 <Class MediaRouterJellybean$GetDefaultRouteWorkaround>
		//    5   11:dup             
		//    6   12:invokespecial   #250 <Method void MediaRouterJellybean$GetDefaultRouteWorkaround()>
		//    7   15:putfield        #247 <Field MediaRouterJellybean$GetDefaultRouteWorkaround mGetDefaultRouteWorkaround>
			return mGetDefaultRouteWorkaround.getDefaultRoute(mRouterObj);
		//    8   18:aload_0         
		//    9   19:getfield        #247 <Field MediaRouterJellybean$GetDefaultRouteWorkaround mGetDefaultRouteWorkaround>
		//   10   22:aload_0         
		//   11   23:getfield        #90  <Field Object mRouterObj>
		//   12   26:invokevirtual   #253 <Method Object MediaRouterJellybean$GetDefaultRouteWorkaround.getDefaultRoute(Object)>
		//   13   29:areturn         
		}

		protected String getRouteName(Object obj)
		{
			obj = ((Object) (MediaRouterJellybean.RouteInfo.getName(obj, getContext())));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #257 <Method Context getContext()>
		//    3    5:invokestatic    #263 <Method CharSequence MediaRouterJellybean$RouteInfo.getName(Object, Context)>
		//    4    8:astore_1        
			if(obj != null)
		//*   5    9:aload_1         
		//*   6   10:ifnull          20
				return ((CharSequence) (obj)).toString();
		//    7   13:aload_1         
		//    8   14:invokeinterface #269 <Method String CharSequence.toString()>
		//    9   19:areturn         
			else
				return "";
		//   10   20:ldc2            #271 <String "">
		//   11   23:areturn         
		}

		protected Object getSystemRoute(MediaRouter.RouteInfo routeinfo)
		{
			if(routeinfo == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return ((Object) (null));
		//    2    4:aconst_null     
		//    3    5:areturn         
			int i = findSystemRouteRecordByDescriptorId(routeinfo.getDescriptorId());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #278 <Method String MediaRouter$RouteInfo.getDescriptorId()>
		//    7   11:invokevirtual   #185 <Method int findSystemRouteRecordByDescriptorId(String)>
		//    8   14:istore_2        
			if(i >= 0)
		//*   9   15:iload_2         
		//*  10   16:iflt            34
				return ((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj;
		//   11   19:aload_0         
		//   12   20:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   13   23:iload_2         
		//   14   24:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   15   27:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   16   30:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   17   33:areturn         
			else
				return ((Object) (null));
		//   18   34:aconst_null     
		//   19   35:areturn         
		}

		protected UserRouteRecord getUserRouteRecord(Object obj)
		{
			obj = MediaRouterJellybean.RouteInfo.getTag(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #281 <Method Object MediaRouterJellybean$RouteInfo.getTag(Object)>
		//    2    4:astore_1        
			if(obj instanceof UserRouteRecord)
		//*   3    5:aload_1         
		//*   4    6:instanceof      #17  <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
		//*   5    9:ifeq            17
				return (UserRouteRecord)obj;
		//    6   12:aload_1         
		//    7   13:checkcast       #17  <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
		//    8   16:areturn         
			else
				return null;
		//    9   17:aconst_null     
		//   10   18:areturn         
		}

		protected void onBuildSystemRouteDescriptor(SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
		{
			int i = MediaRouterJellybean.RouteInfo.getSupportedTypes(systemrouterecord.mRouteObj);
		//    0    0:aload_1         
		//    1    1:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//    2    4:invokestatic    #286 <Method int MediaRouterJellybean$RouteInfo.getSupportedTypes(Object)>
		//    3    7:istore_3        
			if((i & 1) != 0)
		//*   4    8:iload_3         
		//*   5    9:iconst_1        
		//*   6   10:iand            
		//*   7   11:ifeq            22
				builder.addControlFilters(((java.util.Collection) (LIVE_AUDIO_CONTROL_FILTERS)));
		//    8   14:aload_2         
		//    9   15:getstatic       #63  <Field ArrayList LIVE_AUDIO_CONTROL_FILTERS>
		//   10   18:invokevirtual   #292 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.addControlFilters(java.util.Collection)>
		//   11   21:pop             
			if((i & 2) != 0)
		//*  12   22:iload_3         
		//*  13   23:iconst_2        
		//*  14   24:iand            
		//*  15   25:ifeq            36
				builder.addControlFilters(((java.util.Collection) (LIVE_VIDEO_CONTROL_FILTERS)));
		//   16   28:aload_2         
		//   17   29:getstatic       #71  <Field ArrayList LIVE_VIDEO_CONTROL_FILTERS>
		//   18   32:invokevirtual   #292 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.addControlFilters(java.util.Collection)>
		//   19   35:pop             
			builder.setPlaybackType(MediaRouterJellybean.RouteInfo.getPlaybackType(systemrouterecord.mRouteObj));
		//   20   36:aload_2         
		//   21   37:aload_1         
		//   22   38:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   23   41:invokestatic    #295 <Method int MediaRouterJellybean$RouteInfo.getPlaybackType(Object)>
		//   24   44:invokevirtual   #299 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackType(int)>
		//   25   47:pop             
			builder.setPlaybackStream(MediaRouterJellybean.RouteInfo.getPlaybackStream(systemrouterecord.mRouteObj));
		//   26   48:aload_2         
		//   27   49:aload_1         
		//   28   50:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   29   53:invokestatic    #302 <Method int MediaRouterJellybean$RouteInfo.getPlaybackStream(Object)>
		//   30   56:invokevirtual   #305 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackStream(int)>
		//   31   59:pop             
			builder.setVolume(MediaRouterJellybean.RouteInfo.getVolume(systemrouterecord.mRouteObj));
		//   32   60:aload_2         
		//   33   61:aload_1         
		//   34   62:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   35   65:invokestatic    #308 <Method int MediaRouterJellybean$RouteInfo.getVolume(Object)>
		//   36   68:invokevirtual   #311 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolume(int)>
		//   37   71:pop             
			builder.setVolumeMax(MediaRouterJellybean.RouteInfo.getVolumeMax(systemrouterecord.mRouteObj));
		//   38   72:aload_2         
		//   39   73:aload_1         
		//   40   74:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   41   77:invokestatic    #314 <Method int MediaRouterJellybean$RouteInfo.getVolumeMax(Object)>
		//   42   80:invokevirtual   #317 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeMax(int)>
		//   43   83:pop             
			builder.setVolumeHandling(MediaRouterJellybean.RouteInfo.getVolumeHandling(systemrouterecord.mRouteObj));
		//   44   84:aload_2         
		//   45   85:aload_1         
		//   46   86:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   47   89:invokestatic    #320 <Method int MediaRouterJellybean$RouteInfo.getVolumeHandling(Object)>
		//   48   92:invokevirtual   #323 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeHandling(int)>
		//   49   95:pop             
		//   50   96:return          
		}

		public MediaRouteProvider.RouteController onCreateRouteController(String s)
		{
			int i = findSystemRouteRecordByDescriptorId(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #185 <Method int findSystemRouteRecordByDescriptorId(String)>
		//    3    5:istore_2        
			if(i >= 0)
		//*   4    6:iload_2         
		//*   5    7:iflt            32
				return ((MediaRouteProvider.RouteController) (new SystemRouteController(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj)));
		//    6   10:new             #11  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteController>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   10   18:iload_2         
		//   11   19:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   12   22:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   13   25:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   14   28:invokespecial   #328 <Method void SystemMediaRouteProvider$JellybeanImpl$SystemRouteController(Object)>
		//   15   31:areturn         
			else
				return null;
		//   16   32:aconst_null     
		//   17   33:areturn         
		}

		public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			int j = 0;
		//    2    2:iconst_0        
		//    3    3:istore_3        
			boolean flag;
			if(mediaroutediscoveryrequest != null)
		//*   4    4:aload_1         
		//*   5    5:ifnull          103
			{
				List list = mediaroutediscoveryrequest.getSelector().getControlCategories();
		//    6    8:aload_1         
		//    7    9:invokevirtual   #336 <Method MediaRouteSelector MediaRouteDiscoveryRequest.getSelector()>
		//    8   12:invokevirtual   #342 <Method List MediaRouteSelector.getControlCategories()>
		//    9   15:astore          6
				int k = list.size();
		//   10   17:aload           6
		//   11   19:invokeinterface #343 <Method int List.size()>
		//   12   24:istore          4
				i = 0;
		//   13   26:iconst_0        
		//   14   27:istore_2        
				for(; j < k; j++)
		//*  15   28:iload_3         
		//*  16   29:iload           4
		//*  17   31:icmpge          94
				{
					String s = (String)list.get(j);
		//   18   34:aload           6
		//   19   36:iload_3         
		//   20   37:invokeinterface #344 <Method Object List.get(int)>
		//   21   42:checkcast       #167 <Class String>
		//   22   45:astore          7
					if(s.equals("android.media.intent.category.LIVE_AUDIO"))
		//*  23   47:aload           7
		//*  24   49:ldc1            #54  <String "android.media.intent.category.LIVE_AUDIO">
		//*  25   51:invokevirtual   #239 <Method boolean String.equals(Object)>
		//*  26   54:ifeq            64
					{
						i |= 1;
		//   27   57:iload_2         
		//   28   58:iconst_1        
		//   29   59:ior             
		//   30   60:istore_2        
						continue;
		//   31   61:goto            87
					}
					if(s.equals("android.media.intent.category.LIVE_VIDEO"))
		//*  32   64:aload           7
		//*  33   66:ldc1            #69  <String "android.media.intent.category.LIVE_VIDEO">
		//*  34   68:invokevirtual   #239 <Method boolean String.equals(Object)>
		//*  35   71:ifeq            81
						i |= 2;
		//   36   74:iload_2         
		//   37   75:iconst_2        
		//   38   76:ior             
		//   39   77:istore_2        
					else
		//*  40   78:goto            87
						i |= 0x800000;
		//   41   81:iload_2         
		//   42   82:ldc2            #345 <Int 0x800000>
		//   43   85:ior             
		//   44   86:istore_2        
				}

		//   45   87:iload_3         
		//   46   88:iconst_1        
		//   47   89:iadd            
		//   48   90:istore_3        
		//*  49   91:goto            28
				flag = mediaroutediscoveryrequest.isActiveScan();
		//   50   94:aload_1         
		//   51   95:invokevirtual   #348 <Method boolean MediaRouteDiscoveryRequest.isActiveScan()>
		//   52   98:istore          5
			} else
		//*  53  100:goto            106
			{
				flag = false;
		//   54  103:iconst_0        
		//   55  104:istore          5
			}
			if(mRouteTypes != i || mActiveScan != flag)
		//*  56  106:aload_0         
		//*  57  107:getfield        #350 <Field int mRouteTypes>
		//*  58  110:iload_2         
		//*  59  111:icmpne          123
		//*  60  114:aload_0         
		//*  61  115:getfield        #352 <Field boolean mActiveScan>
		//*  62  118:iload           5
		//*  63  120:icmpeq          138
			{
				mRouteTypes = i;
		//   64  123:aload_0         
		//   65  124:iload_2         
		//   66  125:putfield        #350 <Field int mRouteTypes>
				mActiveScan = flag;
		//   67  128:aload_0         
		//   68  129:iload           5
		//   69  131:putfield        #352 <Field boolean mActiveScan>
				updateSystemRoutes();
		//   70  134:aload_0         
		//   71  135:invokespecial   #127 <Method void updateSystemRoutes()>
			}
		//   72  138:return          
		}

		public void onRouteAdded(Object obj)
		{
			if(addSystemRouteNoPublish(obj))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokespecial   #211 <Method boolean addSystemRouteNoPublish(Object)>
		//*   3    5:ifeq            12
				publishRoutes();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #214 <Method void publishRoutes()>
		//    6   12:return          
		}

		public void onRouteChanged(Object obj)
		{
			if(getUserRouteRecord(obj) == null)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #132 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
		//*   3    5:ifnonnull       37
			{
				int i = findSystemRouteRecord(obj);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #136 <Method int findSystemRouteRecord(Object)>
		//    7   13:istore_2        
				if(i >= 0)
		//*   8   14:iload_2         
		//*   9   15:iflt            37
				{
					updateSystemRouteDescriptor((SystemRouteRecord)mSystemRouteRecords.get(i));
		//   10   18:aload_0         
		//   11   19:aload_0         
		//   12   20:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   13   23:iload_2         
		//   14   24:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   15   27:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   16   30:invokevirtual   #147 <Method void updateSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord)>
					publishRoutes();
		//   17   33:aload_0         
		//   18   34:invokevirtual   #214 <Method void publishRoutes()>
				}
			}
		//   19   37:return          
		}

		public void onRouteGrouped(Object obj, Object obj1, int i)
		{
		//    0    0:return          
		}

		public void onRouteRemoved(Object obj)
		{
			if(getUserRouteRecord(obj) == null)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #132 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
		//*   3    5:ifnonnull       31
			{
				int i = findSystemRouteRecord(obj);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #136 <Method int findSystemRouteRecord(Object)>
		//    7   13:istore_2        
				if(i >= 0)
		//*   8   14:iload_2         
		//*   9   15:iflt            31
				{
					mSystemRouteRecords.remove(i);
		//   10   18:aload_0         
		//   11   19:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   12   22:iload_2         
		//   13   23:invokevirtual   #360 <Method Object ArrayList.remove(int)>
		//   14   26:pop             
					publishRoutes();
		//   15   27:aload_0         
		//   16   28:invokevirtual   #214 <Method void publishRoutes()>
				}
			}
		//   17   31:return          
		}

		public void onRouteSelected(int i, Object obj)
		{
			if(obj != MediaRouterJellybean.getSelectedRoute(mRouterObj, 0x800003))
		//*   0    0:aload_2         
		//*   1    1:aload_0         
		//*   2    2:getfield        #90  <Field Object mRouterObj>
		//*   3    5:ldc2            #363 <Int 0x800003>
		//*   4    8:invokestatic    #367 <Method Object MediaRouterJellybean.getSelectedRoute(Object, int)>
		//*   5   11:if_acmpeq       15
				return;
		//    6   14:return          
			UserRouteRecord userrouterecord = getUserRouteRecord(obj);
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #132 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
		//   10   20:astore_3        
			if(userrouterecord != null)
		//*  11   21:aload_3         
		//*  12   22:ifnull          33
			{
				userrouterecord.mRoute.select();
		//   13   25:aload_3         
		//   14   26:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//   15   29:invokevirtual   #370 <Method void MediaRouter$RouteInfo.select()>
				return;
		//   16   32:return          
			}
			i = findSystemRouteRecord(obj);
		//   17   33:aload_0         
		//   18   34:aload_2         
		//   19   35:invokevirtual   #136 <Method int findSystemRouteRecord(Object)>
		//   20   38:istore_1        
			if(i >= 0)
		//*  21   39:iload_1         
		//*  22   40:iflt            68
			{
				obj = ((Object) ((SystemRouteRecord)mSystemRouteRecords.get(i)));
		//   23   43:aload_0         
		//   24   44:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   25   47:iload_1         
		//   26   48:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   27   51:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   28   54:astore_2        
				mSyncCallback.onSystemRouteSelectedByDescriptorId(((SystemRouteRecord) (obj)).mRouteDescriptorId);
		//   29   55:aload_0         
		//   30   56:getfield        #82  <Field SystemMediaRouteProvider$SyncCallback mSyncCallback>
		//   31   59:aload_2         
		//   32   60:getfield        #236 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
		//   33   63:invokeinterface #375 <Method void SystemMediaRouteProvider$SyncCallback.onSystemRouteSelectedByDescriptorId(String)>
			}
		//   34   68:return          
		}

		public void onRouteUngrouped(Object obj, Object obj1)
		{
		//    0    0:return          
		}

		public void onRouteUnselected(int i, Object obj)
		{
		//    0    0:return          
		}

		public void onRouteVolumeChanged(Object obj)
		{
			if(getUserRouteRecord(obj) == null)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #132 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
		//*   3    5:ifnonnull       72
			{
				int i = findSystemRouteRecord(obj);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #136 <Method int findSystemRouteRecord(Object)>
		//    7   13:istore_2        
				if(i >= 0)
		//*   8   14:iload_2         
		//*   9   15:iflt            72
				{
					SystemRouteRecord systemrouterecord = (SystemRouteRecord)mSystemRouteRecords.get(i);
		//   10   18:aload_0         
		//   11   19:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   12   22:iload_2         
		//   13   23:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   14   26:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   15   29:astore_3        
					i = MediaRouterJellybean.RouteInfo.getVolume(obj);
		//   16   30:aload_1         
		//   17   31:invokestatic    #308 <Method int MediaRouterJellybean$RouteInfo.getVolume(Object)>
		//   18   34:istore_2        
					if(i != systemrouterecord.mRouteDescriptor.getVolume())
		//*  19   35:iload_2         
		//*  20   36:aload_3         
		//*  21   37:getfield        #383 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
		//*  22   40:invokevirtual   #387 <Method int MediaRouteDescriptor.getVolume()>
		//*  23   43:icmpeq          72
					{
						systemrouterecord.mRouteDescriptor = (new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptor)).setVolume(i).build();
		//   24   46:aload_3         
		//   25   47:new             #288 <Class MediaRouteDescriptor$Builder>
		//   26   50:dup             
		//   27   51:aload_3         
		//   28   52:getfield        #383 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
		//   29   55:invokespecial   #390 <Method void MediaRouteDescriptor$Builder(MediaRouteDescriptor)>
		//   30   58:iload_2         
		//   31   59:invokevirtual   #311 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolume(int)>
		//   32   62:invokevirtual   #394 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
		//   33   65:putfield        #383 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
						publishRoutes();
		//   34   68:aload_0         
		//   35   69:invokevirtual   #214 <Method void publishRoutes()>
					}
				}
			}
		//   36   72:return          
		}

		public void onSyncRouteAdded(MediaRouter.RouteInfo routeinfo)
		{
			if(routeinfo.getProviderInstance() != this)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #400 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
		//*   2    4:aload_0         
		//*   3    5:if_acmpeq       66
			{
				Object obj = MediaRouterJellybean.createUserRoute(mRouterObj, mUserRouteCategoryObj);
		//    4    8:aload_0         
		//    5    9:getfield        #90  <Field Object mRouterObj>
		//    6   12:aload_0         
		//    7   13:getfield        #124 <Field Object mUserRouteCategoryObj>
		//    8   16:invokestatic    #404 <Method Object MediaRouterJellybean.createUserRoute(Object, Object)>
		//    9   19:astore_3        
				routeinfo = ((MediaRouter.RouteInfo) (new UserRouteRecord(routeinfo, obj)));
		//   10   20:new             #17  <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
		//   11   23:dup             
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:invokespecial   #407 <Method void SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord(MediaRouter$RouteInfo, Object)>
		//   15   29:astore_1        
				MediaRouterJellybean.RouteInfo.setTag(obj, ((Object) (routeinfo)));
		//   16   30:aload_3         
		//   17   31:aload_1         
		//   18   32:invokestatic    #410 <Method void MediaRouterJellybean$RouteInfo.setTag(Object, Object)>
				MediaRouterJellybean.UserRouteInfo.setVolumeCallback(obj, mVolumeCallbackObj);
		//   19   35:aload_3         
		//   20   36:aload_0         
		//   21   37:getfield        #101 <Field Object mVolumeCallbackObj>
		//   22   40:invokestatic    #415 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeCallback(Object, Object)>
				updateUserRouteProperties(((UserRouteRecord) (routeinfo)));
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #419 <Method void updateUserRouteProperties(SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord)>
				mUserRouteRecords.add(((Object) (routeinfo)));
		//   26   48:aload_0         
		//   27   49:getfield        #80  <Field ArrayList mUserRouteRecords>
		//   28   52:aload_1         
		//   29   53:invokevirtual   #67  <Method boolean ArrayList.add(Object)>
		//   30   56:pop             
				MediaRouterJellybean.addUserRoute(mRouterObj, obj);
		//   31   57:aload_0         
		//   32   58:getfield        #90  <Field Object mRouterObj>
		//   33   61:aload_3         
		//   34   62:invokestatic    #422 <Method void MediaRouterJellybean.addUserRoute(Object, Object)>
				return;
		//   35   65:return          
			}
			int i = findSystemRouteRecord(MediaRouterJellybean.getSelectedRoute(mRouterObj, 0x800003));
		//   36   66:aload_0         
		//   37   67:aload_0         
		//   38   68:getfield        #90  <Field Object mRouterObj>
		//   39   71:ldc2            #363 <Int 0x800003>
		//   40   74:invokestatic    #367 <Method Object MediaRouterJellybean.getSelectedRoute(Object, int)>
		//   41   77:invokevirtual   #136 <Method int findSystemRouteRecord(Object)>
		//   42   80:istore_2        
			if(i >= 0 && ((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptorId.equals(((Object) (routeinfo.getDescriptorId()))))
		//*  43   81:iload_2         
		//*  44   82:iflt            113
		//*  45   85:aload_0         
		//*  46   86:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//*  47   89:iload_2         
		//*  48   90:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//*  49   93:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//*  50   96:getfield        #236 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
		//*  51   99:aload_1         
		//*  52  100:invokevirtual   #278 <Method String MediaRouter$RouteInfo.getDescriptorId()>
		//*  53  103:invokevirtual   #239 <Method boolean String.equals(Object)>
		//*  54  106:ifeq            113
				routeinfo.select();
		//   55  109:aload_1         
		//   56  110:invokevirtual   #370 <Method void MediaRouter$RouteInfo.select()>
		//   57  113:return          
		}

		public void onSyncRouteChanged(MediaRouter.RouteInfo routeinfo)
		{
			if(routeinfo.getProviderInstance() != this)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #400 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
		//*   2    4:aload_0         
		//*   3    5:if_acmpeq       33
			{
				int i = findUserRouteRecord(routeinfo);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #425 <Method int findUserRouteRecord(MediaRouter$RouteInfo)>
		//    7   13:istore_2        
				if(i >= 0)
		//*   8   14:iload_2         
		//*   9   15:iflt            33
					updateUserRouteProperties((UserRouteRecord)mUserRouteRecords.get(i));
		//   10   18:aload_0         
		//   11   19:aload_0         
		//   12   20:getfield        #80  <Field ArrayList mUserRouteRecords>
		//   13   23:iload_2         
		//   14   24:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   15   27:checkcast       #17  <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
		//   16   30:invokevirtual   #419 <Method void updateUserRouteProperties(SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord)>
			}
		//   17   33:return          
		}

		public void onSyncRouteRemoved(MediaRouter.RouteInfo routeinfo)
		{
			if(routeinfo.getProviderInstance() != this)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #400 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
		//*   2    4:aload_0         
		//*   3    5:if_acmpeq       57
			{
				int i = findUserRouteRecord(routeinfo);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #425 <Method int findUserRouteRecord(MediaRouter$RouteInfo)>
		//    7   13:istore_2        
				if(i >= 0)
		//*   8   14:iload_2         
		//*   9   15:iflt            57
				{
					routeinfo = ((MediaRouter.RouteInfo) ((UserRouteRecord)mUserRouteRecords.remove(i)));
		//   10   18:aload_0         
		//   11   19:getfield        #80  <Field ArrayList mUserRouteRecords>
		//   12   22:iload_2         
		//   13   23:invokevirtual   #360 <Method Object ArrayList.remove(int)>
		//   14   26:checkcast       #17  <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
		//   15   29:astore_1        
					MediaRouterJellybean.RouteInfo.setTag(((UserRouteRecord) (routeinfo)).mRouteObj, ((Object) (null)));
		//   16   30:aload_1         
		//   17   31:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   18   34:aconst_null     
		//   19   35:invokestatic    #410 <Method void MediaRouterJellybean$RouteInfo.setTag(Object, Object)>
					MediaRouterJellybean.UserRouteInfo.setVolumeCallback(((UserRouteRecord) (routeinfo)).mRouteObj, ((Object) (null)));
		//   20   38:aload_1         
		//   21   39:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   22   42:aconst_null     
		//   23   43:invokestatic    #415 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeCallback(Object, Object)>
					MediaRouterJellybean.removeUserRoute(mRouterObj, ((UserRouteRecord) (routeinfo)).mRouteObj);
		//   24   46:aload_0         
		//   25   47:getfield        #90  <Field Object mRouterObj>
		//   26   50:aload_1         
		//   27   51:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   28   54:invokestatic    #430 <Method void MediaRouterJellybean.removeUserRoute(Object, Object)>
				}
			}
		//   29   57:return          
		}

		public void onSyncRouteSelected(MediaRouter.RouteInfo routeinfo)
		{
			if(!routeinfo.isSelected())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #434 <Method boolean MediaRouter$RouteInfo.isSelected()>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			if(routeinfo.getProviderInstance() != this)
		//*   4    8:aload_1         
		//*   5    9:invokevirtual   #400 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
		//*   6   12:aload_0         
		//*   7   13:if_acmpeq       45
			{
				int i = findUserRouteRecord(routeinfo);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #425 <Method int findUserRouteRecord(MediaRouter$RouteInfo)>
		//   11   21:istore_2        
				if(i >= 0)
		//*  12   22:iload_2         
		//*  13   23:iflt            76
				{
					selectRoute(((UserRouteRecord)mUserRouteRecords.get(i)).mRouteObj);
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #80  <Field ArrayList mUserRouteRecords>
		//   17   31:iload_2         
		//   18   32:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   19   35:checkcast       #17  <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
		//   20   38:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   21   41:invokevirtual   #437 <Method void selectRoute(Object)>
					return;
		//   22   44:return          
				}
			} else
			{
				int j = findSystemRouteRecordByDescriptorId(routeinfo.getDescriptorId());
		//   23   45:aload_0         
		//   24   46:aload_1         
		//   25   47:invokevirtual   #278 <Method String MediaRouter$RouteInfo.getDescriptorId()>
		//   26   50:invokevirtual   #185 <Method int findSystemRouteRecordByDescriptorId(String)>
		//   27   53:istore_2        
				if(j >= 0)
		//*  28   54:iload_2         
		//*  29   55:iflt            76
					selectRoute(((SystemRouteRecord)mSystemRouteRecords.get(j)).mRouteObj);
		//   30   58:aload_0         
		//   31   59:aload_0         
		//   32   60:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   33   63:iload_2         
		//   34   64:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   35   67:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   36   70:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   37   73:invokevirtual   #437 <Method void selectRoute(Object)>
			}
		//   38   76:return          
		}

		public void onVolumeSetRequest(Object obj, int i)
		{
			obj = ((Object) (getUserRouteRecord(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #132 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
		//    3    5:astore_1        
			if(obj != null)
		//*   4    6:aload_1         
		//*   5    7:ifnull          18
				((UserRouteRecord) (obj)).mRoute.requestSetVolume(i);
		//    6   10:aload_1         
		//    7   11:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//    8   14:iload_2         
		//    9   15:invokevirtual   #443 <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
		//   10   18:return          
		}

		public void onVolumeUpdateRequest(Object obj, int i)
		{
			obj = ((Object) (getUserRouteRecord(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #132 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
		//    3    5:astore_1        
			if(obj != null)
		//*   4    6:aload_1         
		//*   5    7:ifnull          18
				((UserRouteRecord) (obj)).mRoute.requestUpdateVolume(i);
		//    6   10:aload_1         
		//    7   11:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//    8   14:iload_2         
		//    9   15:invokevirtual   #447 <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
		//   10   18:return          
		}

		protected void publishRoutes()
		{
			MediaRouteProviderDescriptor.Builder builder = new MediaRouteProviderDescriptor.Builder();
		//    0    0:new             #449 <Class MediaRouteProviderDescriptor$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #450 <Method void MediaRouteProviderDescriptor$Builder()>
		//    3    7:astore_3        
			int j = mSystemRouteRecords.size();
		//    4    8:aload_0         
		//    5    9:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//    6   12:invokevirtual   #225 <Method int ArrayList.size()>
		//    7   15:istore_2        
			for(int i = 0; i < j; i++)
		//*   8   16:iconst_0        
		//*   9   17:istore_1        
		//*  10   18:iload_1         
		//*  11   19:iload_2         
		//*  12   20:icmpge          49
				builder.addRoute(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptor);
		//   13   23:aload_3         
		//   14   24:aload_0         
		//   15   25:getfield        #78  <Field ArrayList mSystemRouteRecords>
		//   16   28:iload_1         
		//   17   29:invokevirtual   #229 <Method Object ArrayList.get(int)>
		//   18   32:checkcast       #14  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   19   35:getfield        #383 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
		//   20   38:invokevirtual   #454 <Method MediaRouteProviderDescriptor$Builder MediaRouteProviderDescriptor$Builder.addRoute(MediaRouteDescriptor)>
		//   21   41:pop             

		//   22   42:iload_1         
		//   23   43:iconst_1        
		//   24   44:iadd            
		//   25   45:istore_1        
		//*  26   46:goto            18
			setDescriptor(builder.build());
		//   27   49:aload_0         
		//   28   50:aload_3         
		//   29   51:invokevirtual   #457 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor$Builder.build()>
		//   30   54:invokevirtual   #461 <Method void setDescriptor(MediaRouteProviderDescriptor)>
		//   31   57:return          
		}

		protected void selectRoute(Object obj)
		{
			if(mSelectRouteWorkaround == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #463 <Field MediaRouterJellybean$SelectRouteWorkaround mSelectRouteWorkaround>
		//*   2    4:ifnonnull       18
				mSelectRouteWorkaround = new MediaRouterJellybean.SelectRouteWorkaround();
		//    3    7:aload_0         
		//    4    8:new             #465 <Class MediaRouterJellybean$SelectRouteWorkaround>
		//    5   11:dup             
		//    6   12:invokespecial   #466 <Method void MediaRouterJellybean$SelectRouteWorkaround()>
		//    7   15:putfield        #463 <Field MediaRouterJellybean$SelectRouteWorkaround mSelectRouteWorkaround>
			mSelectRouteWorkaround.selectRoute(mRouterObj, 0x800003, obj);
		//    8   18:aload_0         
		//    9   19:getfield        #463 <Field MediaRouterJellybean$SelectRouteWorkaround mSelectRouteWorkaround>
		//   10   22:aload_0         
		//   11   23:getfield        #90  <Field Object mRouterObj>
		//   12   26:ldc2            #363 <Int 0x800003>
		//   13   29:aload_1         
		//   14   30:invokevirtual   #469 <Method void MediaRouterJellybean$SelectRouteWorkaround.selectRoute(Object, int, Object)>
		//   15   33:return          
		}

		protected void updateCallback()
		{
			if(mCallbackRegistered)
		//*   0    0:aload_0         
		//*   1    1:getfield        #471 <Field boolean mCallbackRegistered>
		//*   2    4:ifeq            23
			{
				mCallbackRegistered = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #471 <Field boolean mCallbackRegistered>
				MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
		//    6   12:aload_0         
		//    7   13:getfield        #90  <Field Object mRouterObj>
		//    8   16:aload_0         
		//    9   17:getfield        #96  <Field Object mCallbackObj>
		//   10   20:invokestatic    #474 <Method void MediaRouterJellybean.removeCallback(Object, Object)>
			}
			if(mRouteTypes != 0)
		//*  11   23:aload_0         
		//*  12   24:getfield        #350 <Field int mRouteTypes>
		//*  13   27:ifeq            50
			{
				mCallbackRegistered = true;
		//   14   30:aload_0         
		//   15   31:iconst_1        
		//   16   32:putfield        #471 <Field boolean mCallbackRegistered>
				MediaRouterJellybean.addCallback(mRouterObj, mRouteTypes, mCallbackObj);
		//   17   35:aload_0         
		//   18   36:getfield        #90  <Field Object mRouterObj>
		//   19   39:aload_0         
		//   20   40:getfield        #350 <Field int mRouteTypes>
		//   21   43:aload_0         
		//   22   44:getfield        #96  <Field Object mCallbackObj>
		//   23   47:invokestatic    #477 <Method void MediaRouterJellybean.addCallback(Object, int, Object)>
			}
		//   24   50:return          
		}

		protected void updateSystemRouteDescriptor(SystemRouteRecord systemrouterecord)
		{
			MediaRouteDescriptor.Builder builder = new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptorId, getRouteName(systemrouterecord.mRouteObj));
		//    0    0:new             #288 <Class MediaRouteDescriptor$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #236 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #232 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//    7   13:invokevirtual   #165 <Method String getRouteName(Object)>
		//    8   16:invokespecial   #480 <Method void MediaRouteDescriptor$Builder(String, String)>
		//    9   19:astore_2        
			onBuildSystemRouteDescriptor(systemrouterecord, builder);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aload_2         
		//   13   23:invokevirtual   #482 <Method void onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
			systemrouterecord.mRouteDescriptor = builder.build();
		//   14   26:aload_1         
		//   15   27:aload_2         
		//   16   28:invokevirtual   #394 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
		//   17   31:putfield        #383 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
		//   18   34:return          
		}

		protected void updateUserRouteProperties(UserRouteRecord userrouterecord)
		{
			MediaRouterJellybean.UserRouteInfo.setName(userrouterecord.mRouteObj, ((CharSequence) (userrouterecord.mRoute.getName())));
		//    0    0:aload_1         
		//    1    1:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//    2    4:aload_1         
		//    3    5:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//    4    8:invokevirtual   #484 <Method String MediaRouter$RouteInfo.getName()>
		//    5   11:invokestatic    #488 <Method void MediaRouterJellybean$UserRouteInfo.setName(Object, CharSequence)>
			MediaRouterJellybean.UserRouteInfo.setPlaybackType(userrouterecord.mRouteObj, userrouterecord.mRoute.getPlaybackType());
		//    6   14:aload_1         
		//    7   15:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//    8   18:aload_1         
		//    9   19:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//   10   22:invokevirtual   #490 <Method int MediaRouter$RouteInfo.getPlaybackType()>
		//   11   25:invokestatic    #492 <Method void MediaRouterJellybean$UserRouteInfo.setPlaybackType(Object, int)>
			MediaRouterJellybean.UserRouteInfo.setPlaybackStream(userrouterecord.mRouteObj, userrouterecord.mRoute.getPlaybackStream());
		//   12   28:aload_1         
		//   13   29:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   14   32:aload_1         
		//   15   33:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//   16   36:invokevirtual   #494 <Method int MediaRouter$RouteInfo.getPlaybackStream()>
		//   17   39:invokestatic    #496 <Method void MediaRouterJellybean$UserRouteInfo.setPlaybackStream(Object, int)>
			MediaRouterJellybean.UserRouteInfo.setVolume(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolume());
		//   18   42:aload_1         
		//   19   43:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   20   46:aload_1         
		//   21   47:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//   22   50:invokevirtual   #497 <Method int MediaRouter$RouteInfo.getVolume()>
		//   23   53:invokestatic    #499 <Method void MediaRouterJellybean$UserRouteInfo.setVolume(Object, int)>
			MediaRouterJellybean.UserRouteInfo.setVolumeMax(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolumeMax());
		//   24   56:aload_1         
		//   25   57:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   26   60:aload_1         
		//   27   61:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//   28   64:invokevirtual   #501 <Method int MediaRouter$RouteInfo.getVolumeMax()>
		//   29   67:invokestatic    #503 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeMax(Object, int)>
			MediaRouterJellybean.UserRouteInfo.setVolumeHandling(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolumeHandling());
		//   30   70:aload_1         
		//   31   71:getfield        #427 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//   32   74:aload_1         
		//   33   75:getfield        #245 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//   34   78:invokevirtual   #505 <Method int MediaRouter$RouteInfo.getVolumeHandling()>
		//   35   81:invokestatic    #507 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeHandling(Object, int)>
		//   36   84:return          
		}

		private static final ArrayList LIVE_AUDIO_CONTROL_FILTERS;
		private static final ArrayList LIVE_VIDEO_CONTROL_FILTERS;
		protected boolean mActiveScan;
		protected final Object mCallbackObj = createCallbackObj();
		protected boolean mCallbackRegistered;
		private MediaRouterJellybean.GetDefaultRouteWorkaround mGetDefaultRouteWorkaround;
		protected int mRouteTypes;
		protected final Object mRouterObj;
		private MediaRouterJellybean.SelectRouteWorkaround mSelectRouteWorkaround;
		private final SyncCallback mSyncCallback;
		protected final ArrayList mSystemRouteRecords = new ArrayList();
		protected final Object mUserRouteCategoryObj;
		protected final ArrayList mUserRouteRecords = new ArrayList();
		protected final Object mVolumeCallbackObj = createVolumeCallbackObj();

		static 
		{
			IntentFilter intentfilter = new IntentFilter();
		//    0    0:new             #49  <Class IntentFilter>
		//    1    3:dup             
		//    2    4:invokespecial   #52  <Method void IntentFilter()>
		//    3    7:astore_0        
			intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
		//    4    8:aload_0         
		//    5    9:ldc1            #54  <String "android.media.intent.category.LIVE_AUDIO">
		//    6   11:invokevirtual   #58  <Method void IntentFilter.addCategory(String)>
			LIVE_AUDIO_CONTROL_FILTERS = new ArrayList();
		//    7   14:new             #60  <Class ArrayList>
		//    8   17:dup             
		//    9   18:invokespecial   #61  <Method void ArrayList()>
		//   10   21:putstatic       #63  <Field ArrayList LIVE_AUDIO_CONTROL_FILTERS>
			LIVE_AUDIO_CONTROL_FILTERS.add(((Object) (intentfilter)));
		//   11   24:getstatic       #63  <Field ArrayList LIVE_AUDIO_CONTROL_FILTERS>
		//   12   27:aload_0         
		//   13   28:invokevirtual   #67  <Method boolean ArrayList.add(Object)>
		//   14   31:pop             
			intentfilter = new IntentFilter();
		//   15   32:new             #49  <Class IntentFilter>
		//   16   35:dup             
		//   17   36:invokespecial   #52  <Method void IntentFilter()>
		//   18   39:astore_0        
			intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
		//   19   40:aload_0         
		//   20   41:ldc1            #69  <String "android.media.intent.category.LIVE_VIDEO">
		//   21   43:invokevirtual   #58  <Method void IntentFilter.addCategory(String)>
			LIVE_VIDEO_CONTROL_FILTERS = new ArrayList();
		//   22   46:new             #60  <Class ArrayList>
		//   23   49:dup             
		//   24   50:invokespecial   #61  <Method void ArrayList()>
		//   25   53:putstatic       #71  <Field ArrayList LIVE_VIDEO_CONTROL_FILTERS>
			LIVE_VIDEO_CONTROL_FILTERS.add(((Object) (intentfilter)));
		//   26   56:getstatic       #71  <Field ArrayList LIVE_VIDEO_CONTROL_FILTERS>
		//   27   59:aload_0         
		//   28   60:invokevirtual   #67  <Method boolean ArrayList.add(Object)>
		//   29   63:pop             
		//*  30   64:return          
		}

		public JellybeanImpl(Context context, SyncCallback synccallback)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #76  <Method void SystemMediaRouteProvider(Context)>
		//    3    5:aload_0         
		//    4    6:new             #60  <Class ArrayList>
		//    5    9:dup             
		//    6   10:invokespecial   #61  <Method void ArrayList()>
		//    7   13:putfield        #78  <Field ArrayList mSystemRouteRecords>
		//    8   16:aload_0         
		//    9   17:new             #60  <Class ArrayList>
		//   10   20:dup             
		//   11   21:invokespecial   #61  <Method void ArrayList()>
		//   12   24:putfield        #80  <Field ArrayList mUserRouteRecords>
			mSyncCallback = synccallback;
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:putfield        #82  <Field SystemMediaRouteProvider$SyncCallback mSyncCallback>
			mRouterObj = MediaRouterJellybean.getMediaRouter(context);
		//   16   32:aload_0         
		//   17   33:aload_1         
		//   18   34:invokestatic    #88  <Method Object MediaRouterJellybean.getMediaRouter(Context)>
		//   19   37:putfield        #90  <Field Object mRouterObj>
		//   20   40:aload_0         
		//   21   41:aload_0         
		//   22   42:invokevirtual   #94  <Method Object createCallbackObj()>
		//   23   45:putfield        #96  <Field Object mCallbackObj>
		//   24   48:aload_0         
		//   25   49:aload_0         
		//   26   50:invokevirtual   #99  <Method Object createVolumeCallbackObj()>
		//   27   53:putfield        #101 <Field Object mVolumeCallbackObj>
			context = ((Context) (context.getResources()));
		//   28   56:aload_1         
		//   29   57:invokevirtual   #107 <Method Resources Context.getResources()>
		//   30   60:astore_1        
			mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(mRouterObj, ((Resources) (context)).getString(android.support.v7.mediarouter.R.string.mr_user_route_category_name), false);
		//   31   61:aload_0         
		//   32   62:aload_0         
		//   33   63:getfield        #90  <Field Object mRouterObj>
		//   34   66:aload_1         
		//   35   67:getstatic       #112 <Field int android.support.v7.mediarouter.R$string.mr_user_route_category_name>
		//   36   70:invokevirtual   #118 <Method String Resources.getString(int)>
		//   37   73:iconst_0        
		//   38   74:invokestatic    #122 <Method Object MediaRouterJellybean.createRouteCategory(Object, String, boolean)>
		//   39   77:putfield        #124 <Field Object mUserRouteCategoryObj>
			updateSystemRoutes();
		//   40   80:aload_0         
		//   41   81:invokespecial   #127 <Method void updateSystemRoutes()>
		//   42   84:return          
		}
	}

	protected static final class JellybeanImpl.SystemRouteController extends MediaRouteProvider.RouteController
	{

		public void onSetVolume(int i)
		{
			MediaRouterJellybean.RouteInfo.requestSetVolume(mRouteObj, i);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Object mRouteObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #28  <Method void MediaRouterJellybean$RouteInfo.requestSetVolume(Object, int)>
		//    4    8:return          
		}

		public void onUpdateVolume(int i)
		{
			MediaRouterJellybean.RouteInfo.requestUpdateVolume(mRouteObj, i);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Object mRouteObj>
		//    2    4:iload_1         
		//    3    5:invokestatic    #32  <Method void MediaRouterJellybean$RouteInfo.requestUpdateVolume(Object, int)>
		//    4    8:return          
		}

		private final Object mRouteObj;

		public JellybeanImpl.SystemRouteController(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void MediaRouteProvider$RouteController()>
			mRouteObj = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Object mRouteObj>
		//    5    9:return          
		}
	}

	protected static final class JellybeanImpl.SystemRouteRecord
	{

		public MediaRouteDescriptor mRouteDescriptor;
		public final String mRouteDescriptorId;
		public final Object mRouteObj;

		public JellybeanImpl.SystemRouteRecord(Object obj, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mRouteObj = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Object mRouteObj>
			mRouteDescriptorId = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field String mRouteDescriptorId>
		//    8   14:return          
		}
	}

	protected static final class JellybeanImpl.UserRouteRecord
	{

		public final MediaRouter.RouteInfo mRoute;
		public final Object mRouteObj;

		public JellybeanImpl.UserRouteRecord(MediaRouter.RouteInfo routeinfo, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mRoute = routeinfo;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field MediaRouter$RouteInfo mRoute>
			mRouteObj = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Object mRouteObj>
		//    8   14:return          
		}
	}

	private static class JellybeanMr1Impl extends JellybeanImpl
		implements MediaRouterJellybeanMr1.Callback
	{

		protected Object createCallbackObj()
		{
			return MediaRouterJellybeanMr1.createCallback(((MediaRouterJellybeanMr1.Callback) (this)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #29  <Method Object MediaRouterJellybeanMr1.createCallback(MediaRouterJellybeanMr1$Callback)>
		//    2    4:areturn         
		}

		protected boolean isConnecting(JellybeanImpl.SystemRouteRecord systemrouterecord)
		{
			if(mIsConnectingWorkaround == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field MediaRouterJellybeanMr1$IsConnectingWorkaround mIsConnectingWorkaround>
		//*   2    4:ifnonnull       18
				mIsConnectingWorkaround = new MediaRouterJellybeanMr1.IsConnectingWorkaround();
		//    3    7:aload_0         
		//    4    8:new             #35  <Class MediaRouterJellybeanMr1$IsConnectingWorkaround>
		//    5   11:dup             
		//    6   12:invokespecial   #38  <Method void MediaRouterJellybeanMr1$IsConnectingWorkaround()>
		//    7   15:putfield        #33  <Field MediaRouterJellybeanMr1$IsConnectingWorkaround mIsConnectingWorkaround>
			return mIsConnectingWorkaround.isConnecting(systemrouterecord.mRouteObj);
		//    8   18:aload_0         
		//    9   19:getfield        #33  <Field MediaRouterJellybeanMr1$IsConnectingWorkaround mIsConnectingWorkaround>
		//   10   22:aload_1         
		//   11   23:getfield        #44  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   12   26:invokevirtual   #47  <Method boolean MediaRouterJellybeanMr1$IsConnectingWorkaround.isConnecting(Object)>
		//   13   29:ireturn         
		}

		protected void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
		{
			super.onBuildSystemRouteDescriptor(systemrouterecord, builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #51  <Method void SystemMediaRouteProvider$JellybeanImpl.onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
			if(!MediaRouterJellybeanMr1.RouteInfo.isEnabled(systemrouterecord.mRouteObj))
		//*   4    6:aload_1         
		//*   5    7:getfield        #44  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//*   6   10:invokestatic    #56  <Method boolean MediaRouterJellybeanMr1$RouteInfo.isEnabled(Object)>
		//*   7   13:ifne            22
				builder.setEnabled(false);
		//    8   16:aload_2         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #62  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setEnabled(boolean)>
		//   11   21:pop             
			if(isConnecting(systemrouterecord))
		//*  12   22:aload_0         
		//*  13   23:aload_1         
		//*  14   24:invokevirtual   #64  <Method boolean isConnecting(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord)>
		//*  15   27:ifeq            36
				builder.setConnecting(true);
		//   16   30:aload_2         
		//   17   31:iconst_1        
		//   18   32:invokevirtual   #67  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setConnecting(boolean)>
		//   19   35:pop             
			systemrouterecord = ((JellybeanImpl.SystemRouteRecord) (MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(systemrouterecord.mRouteObj)));
		//   20   36:aload_1         
		//   21   37:getfield        #44  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//   22   40:invokestatic    #71  <Method Display MediaRouterJellybeanMr1$RouteInfo.getPresentationDisplay(Object)>
		//   23   43:astore_1        
			if(systemrouterecord != null)
		//*  24   44:aload_1         
		//*  25   45:ifnull          57
				builder.setPresentationDisplayId(((Display) (systemrouterecord)).getDisplayId());
		//   26   48:aload_2         
		//   27   49:aload_1         
		//   28   50:invokevirtual   #77  <Method int Display.getDisplayId()>
		//   29   53:invokevirtual   #81  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPresentationDisplayId(int)>
		//   30   56:pop             
		//   31   57:return          
		}

		public void onRoutePresentationDisplayChanged(Object obj)
		{
			int i = findSystemRouteRecord(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #87  <Method int findSystemRouteRecord(Object)>
		//    3    5:istore_2        
			if(i >= 0)
		//*   4    6:iload_2         
		//*   5    7:iflt            78
			{
				JellybeanImpl.SystemRouteRecord systemrouterecord = (JellybeanImpl.SystemRouteRecord)mSystemRouteRecords.get(i);
		//    6   10:aload_0         
		//    7   11:getfield        #91  <Field ArrayList mSystemRouteRecords>
		//    8   14:iload_2         
		//    9   15:invokevirtual   #97  <Method Object ArrayList.get(int)>
		//   10   18:checkcast       #40  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
		//   11   21:astore_3        
				obj = ((Object) (MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(obj)));
		//   12   22:aload_1         
		//   13   23:invokestatic    #71  <Method Display MediaRouterJellybeanMr1$RouteInfo.getPresentationDisplay(Object)>
		//   14   26:astore_1        
				if(obj != null)
		//*  15   27:aload_1         
		//*  16   28:ifnull          39
					i = ((Display) (obj)).getDisplayId();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #77  <Method int Display.getDisplayId()>
		//   19   35:istore_2        
				else
		//*  20   36:goto            41
					i = -1;
		//   21   39:iconst_m1       
		//   22   40:istore_2        
				if(i != systemrouterecord.mRouteDescriptor.getPresentationDisplayId())
		//*  23   41:iload_2         
		//*  24   42:aload_3         
		//*  25   43:getfield        #101 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
		//*  26   46:invokevirtual   #106 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
		//*  27   49:icmpeq          78
				{
					systemrouterecord.mRouteDescriptor = (new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptor)).setPresentationDisplayId(i).build();
		//   28   52:aload_3         
		//   29   53:new             #58  <Class MediaRouteDescriptor$Builder>
		//   30   56:dup             
		//   31   57:aload_3         
		//   32   58:getfield        #101 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
		//   33   61:invokespecial   #109 <Method void MediaRouteDescriptor$Builder(MediaRouteDescriptor)>
		//   34   64:iload_2         
		//   35   65:invokevirtual   #81  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPresentationDisplayId(int)>
		//   36   68:invokevirtual   #113 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
		//   37   71:putfield        #101 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
					publishRoutes();
		//   38   74:aload_0         
		//   39   75:invokevirtual   #116 <Method void publishRoutes()>
				}
			}
		//   40   78:return          
		}

		protected void updateCallback()
		{
			super.updateCallback();
		//    0    0:aload_0         
		//    1    1:invokespecial   #119 <Method void SystemMediaRouteProvider$JellybeanImpl.updateCallback()>
			if(mActiveScanWorkaround == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #121 <Field MediaRouterJellybeanMr1$ActiveScanWorkaround mActiveScanWorkaround>
		//*   4    8:ifnonnull       30
				mActiveScanWorkaround = new MediaRouterJellybeanMr1.ActiveScanWorkaround(getContext(), getHandler());
		//    5   11:aload_0         
		//    6   12:new             #123 <Class MediaRouterJellybeanMr1$ActiveScanWorkaround>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:invokevirtual   #127 <Method Context getContext()>
		//   10   20:aload_0         
		//   11   21:invokevirtual   #131 <Method android.os.Handler getHandler()>
		//   12   24:invokespecial   #134 <Method void MediaRouterJellybeanMr1$ActiveScanWorkaround(Context, android.os.Handler)>
		//   13   27:putfield        #121 <Field MediaRouterJellybeanMr1$ActiveScanWorkaround mActiveScanWorkaround>
			MediaRouterJellybeanMr1.ActiveScanWorkaround activescanworkaround = mActiveScanWorkaround;
		//   14   30:aload_0         
		//   15   31:getfield        #121 <Field MediaRouterJellybeanMr1$ActiveScanWorkaround mActiveScanWorkaround>
		//   16   34:astore_2        
			int i;
			if(mActiveScan)
		//*  17   35:aload_0         
		//*  18   36:getfield        #138 <Field boolean mActiveScan>
		//*  19   39:ifeq            50
				i = mRouteTypes;
		//   20   42:aload_0         
		//   21   43:getfield        #142 <Field int mRouteTypes>
		//   22   46:istore_1        
			else
		//*  23   47:goto            52
				i = 0;
		//   24   50:iconst_0        
		//   25   51:istore_1        
			activescanworkaround.setActiveScanRouteTypes(i);
		//   26   52:aload_2         
		//   27   53:iload_1         
		//   28   54:invokevirtual   #146 <Method void MediaRouterJellybeanMr1$ActiveScanWorkaround.setActiveScanRouteTypes(int)>
		//   29   57:return          
		}

		private MediaRouterJellybeanMr1.ActiveScanWorkaround mActiveScanWorkaround;
		private MediaRouterJellybeanMr1.IsConnectingWorkaround mIsConnectingWorkaround;

		public JellybeanMr1Impl(Context context, SyncCallback synccallback)
		{
			super(context, synccallback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #20  <Method void SystemMediaRouteProvider$JellybeanImpl(Context, SystemMediaRouteProvider$SyncCallback)>
		//    4    6:return          
		}
	}

	private static class JellybeanMr2Impl extends JellybeanMr1Impl
	{

		protected Object getDefaultRoute()
		{
			return MediaRouterJellybeanMr2.getDefaultRoute(mRouterObj);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object mRouterObj>
		//    2    4:invokestatic    #26  <Method Object MediaRouterJellybeanMr2.getDefaultRoute(Object)>
		//    3    7:areturn         
		}

		protected boolean isConnecting(JellybeanImpl.SystemRouteRecord systemrouterecord)
		{
			return MediaRouterJellybeanMr2.RouteInfo.isConnecting(systemrouterecord.mRouteObj);
		//    0    0:aload_1         
		//    1    1:getfield        #33  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//    2    4:invokestatic    #38  <Method boolean MediaRouterJellybeanMr2$RouteInfo.isConnecting(Object)>
		//    3    7:ireturn         
		}

		protected void onBuildSystemRouteDescriptor(JellybeanImpl.SystemRouteRecord systemrouterecord, MediaRouteDescriptor.Builder builder)
		{
			super.onBuildSystemRouteDescriptor(systemrouterecord, builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #42  <Method void SystemMediaRouteProvider$JellybeanMr1Impl.onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
			systemrouterecord = ((JellybeanImpl.SystemRouteRecord) (MediaRouterJellybeanMr2.RouteInfo.getDescription(systemrouterecord.mRouteObj)));
		//    4    6:aload_1         
		//    5    7:getfield        #33  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
		//    6   10:invokestatic    #46  <Method CharSequence MediaRouterJellybeanMr2$RouteInfo.getDescription(Object)>
		//    7   13:astore_1        
			if(systemrouterecord != null)
		//*   8   14:aload_1         
		//*   9   15:ifnull          29
				builder.setDescription(((CharSequence) (systemrouterecord)).toString());
		//   10   18:aload_2         
		//   11   19:aload_1         
		//   12   20:invokeinterface #52  <Method String CharSequence.toString()>
		//   13   25:invokevirtual   #58  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setDescription(String)>
		//   14   28:pop             
		//   15   29:return          
		}

		protected void selectRoute(Object obj)
		{
			MediaRouterJellybean.selectRoute(mRouterObj, 0x800003, obj);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Object mRouterObj>
		//    2    4:ldc1            #61  <Int 0x800003>
		//    3    6:aload_1         
		//    4    7:invokestatic    #66  <Method void MediaRouterJellybean.selectRoute(Object, int, Object)>
		//    5   10:return          
		}

		protected void updateCallback()
		{
			if(mCallbackRegistered)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field boolean mCallbackRegistered>
		//*   2    4:ifeq            18
				MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Object mRouterObj>
		//    5   11:aload_0         
		//    6   12:getfield        #75  <Field Object mCallbackObj>
		//    7   15:invokestatic    #79  <Method void MediaRouterJellybean.removeCallback(Object, Object)>
			mCallbackRegistered = true;
		//    8   18:aload_0         
		//    9   19:iconst_1        
		//   10   20:putfield        #72  <Field boolean mCallbackRegistered>
			MediaRouterJellybeanMr2.addCallback(mRouterObj, mRouteTypes, mCallbackObj, 2 | mActiveScan);
		//   11   23:aload_0         
		//   12   24:getfield        #21  <Field Object mRouterObj>
		//   13   27:aload_0         
		//   14   28:getfield        #83  <Field int mRouteTypes>
		//   15   31:aload_0         
		//   16   32:getfield        #75  <Field Object mCallbackObj>
		//   17   35:iconst_2        
		//   18   36:aload_0         
		//   19   37:getfield        #86  <Field boolean mActiveScan>
		//   20   40:ior             
		//   21   41:invokestatic    #90  <Method void MediaRouterJellybeanMr2.addCallback(Object, int, Object, int)>
		//   22   44:return          
		}

		protected void updateUserRouteProperties(JellybeanImpl.UserRouteRecord userrouterecord)
		{
			super.updateUserRouteProperties(userrouterecord);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #94  <Method void SystemMediaRouteProvider$JellybeanMr1Impl.updateUserRouteProperties(SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord)>
			MediaRouterJellybeanMr2.UserRouteInfo.setDescription(userrouterecord.mRouteObj, ((CharSequence) (userrouterecord.mRoute.getDescription())));
		//    3    5:aload_1         
		//    4    6:getfield        #97  <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
		//    5    9:aload_1         
		//    6   10:getfield        #101 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
		//    7   13:invokevirtual   #105 <Method String MediaRouter$RouteInfo.getDescription()>
		//    8   16:invokestatic    #110 <Method void MediaRouterJellybeanMr2$UserRouteInfo.setDescription(Object, CharSequence)>
		//    9   19:return          
		}

		public JellybeanMr2Impl(Context context, SyncCallback synccallback)
		{
			super(context, synccallback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #14  <Method void SystemMediaRouteProvider$JellybeanMr1Impl(Context, SystemMediaRouteProvider$SyncCallback)>
		//    4    6:return          
		}
	}

	static class LegacyImpl extends SystemMediaRouteProvider
	{

		public MediaRouteProvider.RouteController onCreateRouteController(String s)
		{
			if(s.equals("DEFAULT_ROUTE"))
		//*   0    0:aload_1         
		//*   1    1:ldc1            #84  <String "DEFAULT_ROUTE">
		//*   2    3:invokevirtual   #89  <Method boolean String.equals(Object)>
		//*   3    6:ifeq            18
				return ((MediaRouteProvider.RouteController) (new DefaultRouteController()));
		//    4    9:new             #7   <Class SystemMediaRouteProvider$LegacyImpl$DefaultRouteController>
		//    5   12:dup             
		//    6   13:aload_0         
		//    7   14:invokespecial   #90  <Method void SystemMediaRouteProvider$LegacyImpl$DefaultRouteController(SystemMediaRouteProvider$LegacyImpl)>
		//    8   17:areturn         
			else
				return null;
		//    9   18:aconst_null     
		//   10   19:areturn         
		}

		void publishRoutes()
		{
			Object obj = ((Object) (getContext().getResources()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #94  <Method Context getContext()>
		//    2    4:invokevirtual   #98  <Method Resources Context.getResources()>
		//    3    7:astore_2        
			int i = mAudioManager.getStreamMaxVolume(3);
		//    4    8:aload_0         
		//    5    9:getfield        #64  <Field AudioManager mAudioManager>
		//    6   12:iconst_3        
		//    7   13:invokevirtual   #102 <Method int AudioManager.getStreamMaxVolume(int)>
		//    8   16:istore_1        
			mLastReportedVolume = mAudioManager.getStreamVolume(3);
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #64  <Field AudioManager mAudioManager>
		//   12   22:iconst_3        
		//   13   23:invokevirtual   #105 <Method int AudioManager.getStreamVolume(int)>
		//   14   26:putfield        #52  <Field int mLastReportedVolume>
			obj = ((Object) ((new MediaRouteDescriptor.Builder("DEFAULT_ROUTE", ((Resources) (obj)).getString(android.support.v7.mediarouter.R.string.mr_system_route_name))).addControlFilters(((java.util.Collection) (CONTROL_FILTERS))).setPlaybackStream(3).setPlaybackType(0).setVolumeHandling(1).setVolumeMax(i).setVolume(mLastReportedVolume).build()));
		//   15   29:new             #107 <Class MediaRouteDescriptor$Builder>
		//   16   32:dup             
		//   17   33:ldc1            #84  <String "DEFAULT_ROUTE">
		//   18   35:aload_2         
		//   19   36:getstatic       #112 <Field int android.support.v7.mediarouter.R$string.mr_system_route_name>
		//   20   39:invokevirtual   #118 <Method String Resources.getString(int)>
		//   21   42:invokespecial   #121 <Method void MediaRouteDescriptor$Builder(String, String)>
		//   22   45:getstatic       #42  <Field ArrayList CONTROL_FILTERS>
		//   23   48:invokevirtual   #125 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.addControlFilters(java.util.Collection)>
		//   24   51:iconst_3        
		//   25   52:invokevirtual   #129 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackStream(int)>
		//   26   55:iconst_0        
		//   27   56:invokevirtual   #132 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackType(int)>
		//   28   59:iconst_1        
		//   29   60:invokevirtual   #135 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeHandling(int)>
		//   30   63:iload_1         
		//   31   64:invokevirtual   #138 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeMax(int)>
		//   32   67:aload_0         
		//   33   68:getfield        #52  <Field int mLastReportedVolume>
		//   34   71:invokevirtual   #141 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolume(int)>
		//   35   74:invokevirtual   #145 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
		//   36   77:astore_2        
			setDescriptor((new MediaRouteProviderDescriptor.Builder()).addRoute(((MediaRouteDescriptor) (obj))).build());
		//   37   78:aload_0         
		//   38   79:new             #147 <Class MediaRouteProviderDescriptor$Builder>
		//   39   82:dup             
		//   40   83:invokespecial   #148 <Method void MediaRouteProviderDescriptor$Builder()>
		//   41   86:aload_2         
		//   42   87:invokevirtual   #152 <Method MediaRouteProviderDescriptor$Builder MediaRouteProviderDescriptor$Builder.addRoute(MediaRouteDescriptor)>
		//   43   90:invokevirtual   #155 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor$Builder.build()>
		//   44   93:invokevirtual   #159 <Method void setDescriptor(MediaRouteProviderDescriptor)>
		//   45   96:return          
		}

		private static final ArrayList CONTROL_FILTERS;
		static final int PLAYBACK_STREAM = 3;
		final AudioManager mAudioManager;
		int mLastReportedVolume;
		private final VolumeChangeReceiver mVolumeChangeReceiver = new VolumeChangeReceiver();

		static 
		{
			IntentFilter intentfilter = new IntentFilter();
		//    0    0:new             #26  <Class IntentFilter>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void IntentFilter()>
		//    3    7:astore_0        
			intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
		//    4    8:aload_0         
		//    5    9:ldc1            #31  <String "android.media.intent.category.LIVE_AUDIO">
		//    6   11:invokevirtual   #35  <Method void IntentFilter.addCategory(String)>
			intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
		//    7   14:aload_0         
		//    8   15:ldc1            #37  <String "android.media.intent.category.LIVE_VIDEO">
		//    9   17:invokevirtual   #35  <Method void IntentFilter.addCategory(String)>
			CONTROL_FILTERS = new ArrayList();
		//   10   20:new             #39  <Class ArrayList>
		//   11   23:dup             
		//   12   24:invokespecial   #40  <Method void ArrayList()>
		//   13   27:putstatic       #42  <Field ArrayList CONTROL_FILTERS>
			CONTROL_FILTERS.add(((Object) (intentfilter)));
		//   14   30:getstatic       #42  <Field ArrayList CONTROL_FILTERS>
		//   15   33:aload_0         
		//   16   34:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
		//   17   37:pop             
		//*  18   38:return          
		}

		public LegacyImpl(Context context)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #50  <Method void SystemMediaRouteProvider(Context)>
			mLastReportedVolume = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #52  <Field int mLastReportedVolume>
			mAudioManager = (AudioManager)context.getSystemService("audio");
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:ldc1            #54  <String "audio">
		//    9   14:invokevirtual   #60  <Method Object Context.getSystemService(String)>
		//   10   17:checkcast       #62  <Class AudioManager>
		//   11   20:putfield        #64  <Field AudioManager mAudioManager>
		//   12   23:aload_0         
		//   13   24:new             #10  <Class SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver>
		//   14   27:dup             
		//   15   28:aload_0         
		//   16   29:invokespecial   #67  <Method void SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver(SystemMediaRouteProvider$LegacyImpl)>
		//   17   32:putfield        #69  <Field SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver mVolumeChangeReceiver>
			context.registerReceiver(((BroadcastReceiver) (mVolumeChangeReceiver)), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
		//   18   35:aload_1         
		//   19   36:aload_0         
		//   20   37:getfield        #69  <Field SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver mVolumeChangeReceiver>
		//   21   40:new             #26  <Class IntentFilter>
		//   22   43:dup             
		//   23   44:ldc1            #71  <String "android.media.VOLUME_CHANGED_ACTION">
		//   24   46:invokespecial   #73  <Method void IntentFilter(String)>
		//   25   49:invokevirtual   #77  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
		//   26   52:pop             
			publishRoutes();
		//   27   53:aload_0         
		//   28   54:invokevirtual   #80  <Method void publishRoutes()>
		//   29   57:return          
		}
	}

	final class LegacyImpl.DefaultRouteController extends MediaRouteProvider.RouteController
	{

		public void onSetVolume(int i)
		{
			mAudioManager.setStreamVolume(3, i, 0);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//    2    4:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//    3    7:iconst_3        
		//    4    8:iload_1         
		//    5    9:iconst_0        
		//    6   10:invokevirtual   #32  <Method void AudioManager.setStreamVolume(int, int, int)>
			publishRoutes();
		//    7   13:aload_0         
		//    8   14:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//    9   17:invokevirtual   #35  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
		//   10   20:return          
		}

		public void onUpdateVolume(int i)
		{
			int j = mAudioManager.getStreamVolume(3);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//    2    4:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//    3    7:iconst_3        
		//    4    8:invokevirtual   #40  <Method int AudioManager.getStreamVolume(int)>
		//    5   11:istore_2        
			if(Math.min(mAudioManager.getStreamMaxVolume(3), Math.max(0, i + j)) != j)
		//*   6   12:aload_0         
		//*   7   13:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//*   8   16:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//*   9   19:iconst_3        
		//*  10   20:invokevirtual   #43  <Method int AudioManager.getStreamMaxVolume(int)>
		//*  11   23:iconst_0        
		//*  12   24:iload_1         
		//*  13   25:iload_2         
		//*  14   26:iadd            
		//*  15   27:invokestatic    #49  <Method int Math.max(int, int)>
		//*  16   30:invokestatic    #52  <Method int Math.min(int, int)>
		//*  17   33:iload_2         
		//*  18   34:icmpeq          50
				mAudioManager.setStreamVolume(3, j, 0);
		//   19   37:aload_0         
		//   20   38:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//   21   41:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//   22   44:iconst_3        
		//   23   45:iload_2         
		//   24   46:iconst_0        
		//   25   47:invokevirtual   #32  <Method void AudioManager.setStreamVolume(int, int, int)>
			publishRoutes();
		//   26   50:aload_0         
		//   27   51:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//   28   54:invokevirtual   #35  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
		//   29   57:return          
		}

		final LegacyImpl this$0;

		LegacyImpl.DefaultRouteController()
		{
			this$0 = LegacyImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void MediaRouteProvider$RouteController()>
		//    5    9:return          
		}
	}

	final class LegacyImpl.VolumeChangeReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #38  <Method String Intent.getAction()>
		//*   2    4:ldc1            #20  <String "android.media.VOLUME_CHANGED_ACTION">
		//*   3    6:invokevirtual   #44  <Method boolean String.equals(Object)>
		//*   4    9:ifeq            53
		//*   5   12:aload_2         
		//*   6   13:ldc1            #14  <String "android.media.EXTRA_VOLUME_STREAM_TYPE">
		//*   7   15:iconst_m1       
		//*   8   16:invokevirtual   #48  <Method int Intent.getIntExtra(String, int)>
		//*   9   19:iconst_3        
		//*  10   20:icmpne          53
			{
				int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
		//   11   23:aload_2         
		//   12   24:ldc1            #17  <String "android.media.EXTRA_VOLUME_STREAM_VALUE">
		//   13   26:iconst_m1       
		//   14   27:invokevirtual   #48  <Method int Intent.getIntExtra(String, int)>
		//   15   30:istore_3        
				if(i >= 0 && i != mLastReportedVolume)
		//*  16   31:iload_3         
		//*  17   32:iflt            53
		//*  18   35:iload_3         
		//*  19   36:aload_0         
		//*  20   37:getfield        #26  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//*  21   40:getfield        #52  <Field int SystemMediaRouteProvider$LegacyImpl.mLastReportedVolume>
		//*  22   43:icmpeq          53
					publishRoutes();
		//   23   46:aload_0         
		//   24   47:getfield        #26  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//   25   50:invokevirtual   #55  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
			}
		//   26   53:return          
		}

		public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
		public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
		public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
		final LegacyImpl this$0;

		LegacyImpl.VolumeChangeReceiver()
		{
			this$0 = LegacyImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field SystemMediaRouteProvider$LegacyImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #29  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}

	public static interface SyncCallback
	{

		public abstract void onSystemRouteSelectedByDescriptorId(String s);
	}


	protected SystemMediaRouteProvider(Context context)
	{
		super(context, new MediaRouteProvider.ProviderMetadata(new ComponentName("android", ((Class) (android/support/v7/media/SystemMediaRouteProvider)).getName())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #51  <Class MediaRouteProvider$ProviderMetadata>
	//    3    5:dup             
	//    4    6:new             #53  <Class ComponentName>
	//    5    9:dup             
	//    6   10:ldc1            #44  <String "android">
	//    7   12:ldc1            #2   <Class SystemMediaRouteProvider>
	//    8   14:invokevirtual   #59  <Method String Class.getName()>
	//    9   17:invokespecial   #62  <Method void ComponentName(String, String)>
	//   10   20:invokespecial   #65  <Method void MediaRouteProvider$ProviderMetadata(ComponentName)>
	//   11   23:invokespecial   #68  <Method void MediaRouteProvider(Context, MediaRouteProvider$ProviderMetadata)>
	//   12   26:return          
	}

	public static SystemMediaRouteProvider obtain(Context context, SyncCallback synccallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          18
			return ((SystemMediaRouteProvider) (new Api24Impl(context, synccallback)));
	//    3    8:new             #6   <Class SystemMediaRouteProvider$Api24Impl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #80  <Method void SystemMediaRouteProvider$Api24Impl(Context, SystemMediaRouteProvider$SyncCallback)>
	//    8   17:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   9   18:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   21:bipush          18
	//*  11   23:icmplt          36
			return ((SystemMediaRouteProvider) (new JellybeanMr2Impl(context, synccallback)));
	//   12   26:new             #24  <Class SystemMediaRouteProvider$JellybeanMr2Impl>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #81  <Method void SystemMediaRouteProvider$JellybeanMr2Impl(Context, SystemMediaRouteProvider$SyncCallback)>
	//   17   35:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  18   36:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   39:bipush          17
	//*  20   41:icmplt          54
			return ((SystemMediaRouteProvider) (new JellybeanMr1Impl(context, synccallback)));
	//   21   44:new             #21  <Class SystemMediaRouteProvider$JellybeanMr1Impl>
	//   22   47:dup             
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokespecial   #82  <Method void SystemMediaRouteProvider$JellybeanMr1Impl(Context, SystemMediaRouteProvider$SyncCallback)>
	//   26   53:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  27   54:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   57:bipush          16
	//*  29   59:icmplt          72
			return ((SystemMediaRouteProvider) (new JellybeanImpl(context, synccallback)));
	//   30   62:new             #9   <Class SystemMediaRouteProvider$JellybeanImpl>
	//   31   65:dup             
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokespecial   #83  <Method void SystemMediaRouteProvider$JellybeanImpl(Context, SystemMediaRouteProvider$SyncCallback)>
	//   35   71:areturn         
		else
			return ((SystemMediaRouteProvider) (new LegacyImpl(context)));
	//   36   72:new             #27  <Class SystemMediaRouteProvider$LegacyImpl>
	//   37   75:dup             
	//   38   76:aload_0         
	//   39   77:invokespecial   #85  <Method void SystemMediaRouteProvider$LegacyImpl(Context)>
	//   40   80:areturn         
	}

	protected Object getDefaultRoute()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected Object getSystemRoute(MediaRouter.RouteInfo routeinfo)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onSyncRouteAdded(MediaRouter.RouteInfo routeinfo)
	{
	//    0    0:return          
	}

	public void onSyncRouteChanged(MediaRouter.RouteInfo routeinfo)
	{
	//    0    0:return          
	}

	public void onSyncRouteRemoved(MediaRouter.RouteInfo routeinfo)
	{
	//    0    0:return          
	}

	public void onSyncRouteSelected(MediaRouter.RouteInfo routeinfo)
	{
	//    0    0:return          
	}

	public static final String DEFAULT_ROUTE_ID = "DEFAULT_ROUTE";
	public static final String PACKAGE_NAME = "android";
	private static final String TAG = "SystemMediaRouteProvider";
}
