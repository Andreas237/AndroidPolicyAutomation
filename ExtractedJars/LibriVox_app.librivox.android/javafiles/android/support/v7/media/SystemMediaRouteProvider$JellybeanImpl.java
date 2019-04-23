// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			SystemMediaRouteProvider, MediaRouterJellybean, MediaRouteDiscoveryRequest, MediaRouteSelector, 
//			MediaRouteDescriptor

class SystemMediaRouteProvider$JellybeanImpl extends SystemMediaRouteProvider
	implements MediaRouterJellybean.Callback, MediaRouterJellybean.VolumeCallback
{

	private boolean addSystemRouteNoPublish(Object obj)
	{
		if(getUserRouteRecord(obj) == null && findSystemRouteRecord(obj) < 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #116 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
	//*   3    5:ifnonnull       46
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #120 <Method int findSystemRouteRecord(Object)>
	//*   7   13:ifge            46
		{
			class SystemRouteRecord
			{

				public MediaRouteDescriptor mRouteDescriptor;
				public final String mRouteDescriptorId;
				public final Object mRouteObj;

			public SystemRouteRecord(Object obj, String s)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #15  <Method void Object()>
				mRouteObj = obj;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #17  <Field Object mRouteObj>
				mRouteDescriptorId = s;
			//    5    9:aload_0         
			//    6   10:aload_2         
			//    7   11:putfield        #19  <Field String mRouteDescriptorId>
			//    8   14:return          
			}
			}

			obj = ((Object) (new SystemRouteRecord(obj, assignRouteId(obj))));
	//    8   16:new             #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #126 <Method String assignRouteId(Object)>
	//   14   26:invokespecial   #129 <Method void SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord(Object, String)>
	//   15   29:astore_1        
			updateSystemRouteDescriptor(((SystemRouteRecord) (obj)));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #133 <Method void updateSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord)>
			mSystemRouteRecords.add(obj);
	//   19   35:aload_0         
	//   20   36:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #51  <Method boolean ArrayList.add(Object)>
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
	//*   1    1:invokevirtual   #136 <Method Object getDefaultRoute()>
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
	//   11   19:ldc1            #138 <String "DEFAULT_ROUTE">
	//   12   21:astore_1        
		else
	//*  13   22:goto            52
			obj = ((Object) (String.format(Locale.US, "ROUTE_%08x", new Object[] {
				Integer.valueOf(getRouteName(obj).hashCode())
			})));
	//   14   25:getstatic       #144 <Field Locale Locale.US>
	//   15   28:ldc1            #146 <String "ROUTE_%08x">
	//   16   30:iconst_1        
	//   17   31:anewarray       Object[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #151 <Method String getRouteName(Object)>
	//   23   41:invokevirtual   #157 <Method int String.hashCode()>
	//   24   44:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//   25   47:aastore         
	//   26   48:invokestatic    #167 <Method String String.format(Locale, String, Object[])>
	//   27   51:astore_1        
		if(findSystemRouteRecordByDescriptorId(((String) (obj))) < 0)
	//*  28   52:aload_0         
	//*  29   53:aload_1         
	//*  30   54:invokevirtual   #171 <Method int findSystemRouteRecordByDescriptorId(String)>
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
	//   36   64:getstatic       #144 <Field Locale Locale.US>
	//   37   67:ldc1            #173 <String "%s_%d">
	//   38   69:iconst_2        
	//   39   70:anewarray       Object[]
	//   40   73:dup             
	//   41   74:iconst_0        
	//   42   75:aload_1         
	//   43   76:aastore         
	//   44   77:dup             
	//   45   78:iconst_1        
	//   46   79:iload_2         
	//   47   80:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//   48   83:aastore         
	//   49   84:invokestatic    #167 <Method String String.format(Locale, String, Object[])>
	//   50   87:astore_3        
			if(findSystemRouteRecordByDescriptorId(s) < 0)
	//*  51   88:aload_0         
	//*  52   89:aload_3         
	//*  53   90:invokevirtual   #171 <Method int findSystemRouteRecordByDescriptorId(String)>
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
	//    1    1:invokevirtual   #176 <Method void updateCallback()>
		Iterator iterator = MediaRouterJellybean.getRoutes(mRouterObj).iterator();
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field Object mRouterObj>
	//    4    8:invokestatic    #180 <Method List MediaRouterJellybean.getRoutes(Object)>
	//    5   11:invokeinterface #186 <Method Iterator List.iterator()>
	//    6   16:astore_2        
		boolean flag;
		for(flag = false; iterator.hasNext(); flag |= addSystemRouteNoPublish(iterator.next()));
	//    7   17:iconst_0        
	//    8   18:istore_1        
	//    9   19:aload_2         
	//   10   20:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            44
	//   12   28:iload_1         
	//   13   29:aload_0         
	//   14   30:aload_2         
	//   15   31:invokeinterface #195 <Method Object Iterator.next()>
	//   16   36:invokespecial   #197 <Method boolean addSystemRouteNoPublish(Object)>
	//   17   39:ior             
	//   18   40:istore_1        
	//*  19   41:goto            19
		if(flag)
	//*  20   44:iload_1         
	//*  21   45:ifeq            52
			publishRoutes();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #200 <Method void publishRoutes()>
	//   24   52:return          
	}

	protected Object createCallbackObj()
	{
		return MediaRouterJellybean.createCallback(((MediaRouterJellybean.Callback) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #204 <Method Object MediaRouterJellybean.createCallback(MediaRouterJellybean$Callback)>
	//    2    4:areturn         
	}

	protected Object createVolumeCallbackObj()
	{
		return MediaRouterJellybean.createVolumeCallback(((MediaRouterJellybean.VolumeCallback) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #208 <Method Object MediaRouterJellybean.createVolumeCallback(MediaRouterJellybean$VolumeCallback)>
	//    2    4:areturn         
	}

	protected int findSystemRouteRecord(Object obj)
	{
		int j = mSystemRouteRecords.size();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//    2    4:invokevirtual   #211 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
			if(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj == obj)
	//*   9   15:aload_0         
	//*  10   16:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//*  14   26:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
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
	//    1    1:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//    2    4:invokevirtual   #211 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          45
			if(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptorId.equals(((Object) (s))))
	//*   9   15:aload_0         
	//*  10   16:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//*  14   26:getfield        #222 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #225 <Method boolean String.equals(Object)>
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
	//    1    1:getfield        #64  <Field ArrayList mUserRouteRecords>
	//    2    4:invokevirtual   #211 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
		{
			class UserRouteRecord
			{

				public final MediaRouter.RouteInfo mRoute;
				public final Object mRouteObj;

			public UserRouteRecord(MediaRouter.RouteInfo routeinfo, Object obj)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				mRoute = routeinfo;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field MediaRouter$RouteInfo mRoute>
				mRouteObj = obj;
			//    5    9:aload_0         
			//    6   10:aload_2         
			//    7   11:putfield        #17  <Field Object mRouteObj>
			//    8   14:return          
			}
			}

			if(((UserRouteRecord)mUserRouteRecords.get(i)).mRoute == routeinfo)
	//*   9   15:aload_0         
	//*  10   16:getfield        #64  <Field ArrayList mUserRouteRecords>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #229 <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
	//*  14   26:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
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

	protected Object getDefaultRoute()
	{
		if(mGetDefaultRouteWorkaround == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field MediaRouterJellybean$GetDefaultRouteWorkaround mGetDefaultRouteWorkaround>
	//*   2    4:ifnonnull       18
			mGetDefaultRouteWorkaround = new karound();
	//    3    7:aload_0         
	//    4    8:new             #237 <Class MediaRouterJellybean$GetDefaultRouteWorkaround>
	//    5   11:dup             
	//    6   12:invokespecial   #238 <Method void MediaRouterJellybean$GetDefaultRouteWorkaround()>
	//    7   15:putfield        #235 <Field MediaRouterJellybean$GetDefaultRouteWorkaround mGetDefaultRouteWorkaround>
		return mGetDefaultRouteWorkaround.getDefaultRoute(mRouterObj);
	//    8   18:aload_0         
	//    9   19:getfield        #235 <Field MediaRouterJellybean$GetDefaultRouteWorkaround mGetDefaultRouteWorkaround>
	//   10   22:aload_0         
	//   11   23:getfield        #74  <Field Object mRouterObj>
	//   12   26:invokevirtual   #241 <Method Object MediaRouterJellybean$GetDefaultRouteWorkaround.getDefaultRoute(Object)>
	//   13   29:areturn         
	}

	protected String getRouteName(Object obj)
	{
		obj = ((Object) (MediaRouterJellybean.RouteInfo.getName(obj, getContext())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #245 <Method Context getContext()>
	//    3    5:invokestatic    #251 <Method CharSequence MediaRouterJellybean$RouteInfo.getName(Object, Context)>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			return ((CharSequence) (obj)).toString();
	//    7   13:aload_1         
	//    8   14:invokeinterface #257 <Method String CharSequence.toString()>
	//    9   19:areturn         
		else
			return "";
	//   10   20:ldc2            #259 <String "">
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
	//    6    8:invokevirtual   #266 <Method String MediaRouter$RouteInfo.getDescriptorId()>
	//    7   11:invokevirtual   #171 <Method int findSystemRouteRecordByDescriptorId(String)>
	//    8   14:istore_2        
		if(i >= 0)
	//*   9   15:iload_2         
	//*  10   16:iflt            34
			return ((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj;
	//   11   19:aload_0         
	//   12   20:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   16   30:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
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
	//    1    1:invokestatic    #269 <Method Object MediaRouterJellybean$RouteInfo.getTag(Object)>
	//    2    4:astore_1        
		if(obj instanceof UserRouteRecord)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #229 <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
	//*   5    9:ifeq            17
			return (UserRouteRecord)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #229 <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
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
	//    1    1:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//    2    4:invokestatic    #274 <Method int MediaRouterJellybean$RouteInfo.getSupportedTypes(Object)>
	//    3    7:istore_3        
		if((i & 1) != 0)
	//*   4    8:iload_3         
	//*   5    9:iconst_1        
	//*   6   10:iand            
	//*   7   11:ifeq            22
			builder.addControlFilters(((java.util.Collection) (LIVE_AUDIO_CONTROL_FILTERS)));
	//    8   14:aload_2         
	//    9   15:getstatic       #47  <Field ArrayList LIVE_AUDIO_CONTROL_FILTERS>
	//   10   18:invokevirtual   #280 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.addControlFilters(java.util.Collection)>
	//   11   21:pop             
		if((i & 2) != 0)
	//*  12   22:iload_3         
	//*  13   23:iconst_2        
	//*  14   24:iand            
	//*  15   25:ifeq            36
			builder.addControlFilters(((java.util.Collection) (LIVE_VIDEO_CONTROL_FILTERS)));
	//   16   28:aload_2         
	//   17   29:getstatic       #55  <Field ArrayList LIVE_VIDEO_CONTROL_FILTERS>
	//   18   32:invokevirtual   #280 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.addControlFilters(java.util.Collection)>
	//   19   35:pop             
		builder.setPlaybackType(MediaRouterJellybean.RouteInfo.getPlaybackType(systemrouterecord.mRouteObj));
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   23   41:invokestatic    #283 <Method int MediaRouterJellybean$RouteInfo.getPlaybackType(Object)>
	//   24   44:invokevirtual   #287 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackType(int)>
	//   25   47:pop             
		builder.setPlaybackStream(MediaRouterJellybean.RouteInfo.getPlaybackStream(systemrouterecord.mRouteObj));
	//   26   48:aload_2         
	//   27   49:aload_1         
	//   28   50:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   29   53:invokestatic    #290 <Method int MediaRouterJellybean$RouteInfo.getPlaybackStream(Object)>
	//   30   56:invokevirtual   #293 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackStream(int)>
	//   31   59:pop             
		builder.setVolume(MediaRouterJellybean.RouteInfo.getVolume(systemrouterecord.mRouteObj));
	//   32   60:aload_2         
	//   33   61:aload_1         
	//   34   62:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   35   65:invokestatic    #296 <Method int MediaRouterJellybean$RouteInfo.getVolume(Object)>
	//   36   68:invokevirtual   #299 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolume(int)>
	//   37   71:pop             
		builder.setVolumeMax(MediaRouterJellybean.RouteInfo.getVolumeMax(systemrouterecord.mRouteObj));
	//   38   72:aload_2         
	//   39   73:aload_1         
	//   40   74:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   41   77:invokestatic    #302 <Method int MediaRouterJellybean$RouteInfo.getVolumeMax(Object)>
	//   42   80:invokevirtual   #305 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeMax(int)>
	//   43   83:pop             
		builder.setVolumeHandling(MediaRouterJellybean.RouteInfo.getVolumeHandling(systemrouterecord.mRouteObj));
	//   44   84:aload_2         
	//   45   85:aload_1         
	//   46   86:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   47   89:invokestatic    #308 <Method int MediaRouterJellybean$RouteInfo.getVolumeHandling(Object)>
	//   48   92:invokevirtual   #311 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeHandling(int)>
	//   49   95:pop             
	//   50   96:return          
	}

	public MediaRouteProvider.RouteController onCreateRouteController(String s)
	{
		int i = findSystemRouteRecordByDescriptorId(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method int findSystemRouteRecordByDescriptorId(String)>
	//    3    5:istore_2        
		class SystemRouteController extends MediaRouteProvider.RouteController
		{

			public void onSetVolume(int j)
			{
				MediaRouterJellybean.RouteInfo.requestSetVolume(mRouteObj, j);
			//    0    0:aload_0         
			//    1    1:getfield        #13  <Field Object mRouteObj>
			//    2    4:iload_1         
			//    3    5:invokestatic    #22  <Method void MediaRouterJellybean$RouteInfo.requestSetVolume(Object, int)>
			//    4    8:return          
			}

			public void onUpdateVolume(int j)
			{
				MediaRouterJellybean.RouteInfo.requestUpdateVolume(mRouteObj, j);
			//    0    0:aload_0         
			//    1    1:getfield        #13  <Field Object mRouteObj>
			//    2    4:iload_1         
			//    3    5:invokestatic    #26  <Method void MediaRouterJellybean$RouteInfo.requestUpdateVolume(Object, int)>
			//    4    8:return          
			}

			private final Object mRouteObj;

			public SystemRouteController(Object obj)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #11  <Method void MediaRouteProvider$RouteController()>
				mRouteObj = obj;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #13  <Field Object mRouteObj>
			//    5    9:return          
			}
		}

		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            32
			return ((MediaRouteProvider.RouteController) (new SystemRouteController(((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteObj)));
	//    6   10:new             #315 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteController>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   13   25:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   14   28:invokespecial   #318 <Method void SystemMediaRouteProvider$JellybeanImpl$SystemRouteController(Object)>
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
	//    7    9:invokevirtual   #326 <Method MediaRouteSelector MediaRouteDiscoveryRequest.getSelector()>
	//    8   12:invokevirtual   #332 <Method List MediaRouteSelector.getControlCategories()>
	//    9   15:astore          6
			int k = list.size();
	//   10   17:aload           6
	//   11   19:invokeinterface #333 <Method int List.size()>
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
	//   20   37:invokeinterface #334 <Method Object List.get(int)>
	//   21   42:checkcast       #153 <Class String>
	//   22   45:astore          7
				if(s.equals("android.media.intent.category.LIVE_AUDIO"))
	//*  23   47:aload           7
	//*  24   49:ldc1            #38  <String "android.media.intent.category.LIVE_AUDIO">
	//*  25   51:invokevirtual   #225 <Method boolean String.equals(Object)>
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
	//*  33   66:ldc1            #53  <String "android.media.intent.category.LIVE_VIDEO">
	//*  34   68:invokevirtual   #225 <Method boolean String.equals(Object)>
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
	//   42   82:ldc2            #335 <Int 0x800000>
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
	//   51   95:invokevirtual   #338 <Method boolean MediaRouteDiscoveryRequest.isActiveScan()>
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
	//*  57  107:getfield        #340 <Field int mRouteTypes>
	//*  58  110:iload_2         
	//*  59  111:icmpne          123
	//*  60  114:aload_0         
	//*  61  115:getfield        #342 <Field boolean mActiveScan>
	//*  62  118:iload           5
	//*  63  120:icmpeq          138
		{
			mRouteTypes = i;
	//   64  123:aload_0         
	//   65  124:iload_2         
	//   66  125:putfield        #340 <Field int mRouteTypes>
			mActiveScan = flag;
	//   67  128:aload_0         
	//   68  129:iload           5
	//   69  131:putfield        #342 <Field boolean mActiveScan>
			updateSystemRoutes();
	//   70  134:aload_0         
	//   71  135:invokespecial   #111 <Method void updateSystemRoutes()>
		}
	//   72  138:return          
	}

	public void onRouteAdded(Object obj)
	{
		if(addSystemRouteNoPublish(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #197 <Method boolean addSystemRouteNoPublish(Object)>
	//*   3    5:ifeq            12
			publishRoutes();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #200 <Method void publishRoutes()>
	//    6   12:return          
	}

	public void onRouteChanged(Object obj)
	{
		if(getUserRouteRecord(obj) == null)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #116 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
	//*   3    5:ifnonnull       37
		{
			int i = findSystemRouteRecord(obj);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #120 <Method int findSystemRouteRecord(Object)>
	//    7   13:istore_2        
			if(i >= 0)
	//*   8   14:iload_2         
	//*   9   15:iflt            37
			{
				updateSystemRouteDescriptor((SystemRouteRecord)mSystemRouteRecords.get(i));
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   16   30:invokevirtual   #133 <Method void updateSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord)>
				publishRoutes();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #200 <Method void publishRoutes()>
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
	//*   2    2:invokevirtual   #116 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
	//*   3    5:ifnonnull       31
		{
			int i = findSystemRouteRecord(obj);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #120 <Method int findSystemRouteRecord(Object)>
	//    7   13:istore_2        
			if(i >= 0)
	//*   8   14:iload_2         
	//*   9   15:iflt            31
			{
				mSystemRouteRecords.remove(i);
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #350 <Method Object ArrayList.remove(int)>
	//   14   26:pop             
				publishRoutes();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #200 <Method void publishRoutes()>
			}
		}
	//   17   31:return          
	}

	public void onRouteSelected(int i, Object obj)
	{
		if(obj != MediaRouterJellybean.getSelectedRoute(mRouterObj, 0x800003))
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #74  <Field Object mRouterObj>
	//*   3    5:ldc2            #353 <Int 0x800003>
	//*   4    8:invokestatic    #357 <Method Object MediaRouterJellybean.getSelectedRoute(Object, int)>
	//*   5   11:if_acmpeq       15
			return;
	//    6   14:return          
		UserRouteRecord userrouterecord = getUserRouteRecord(obj);
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #116 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
	//   10   20:astore_3        
		if(userrouterecord != null)
	//*  11   21:aload_3         
	//*  12   22:ifnull          33
		{
			userrouterecord.mRoute.select();
	//   13   25:aload_3         
	//   14   26:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//   15   29:invokevirtual   #360 <Method void MediaRouter$RouteInfo.select()>
			return;
	//   16   32:return          
		}
		i = findSystemRouteRecord(obj);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #120 <Method int findSystemRouteRecord(Object)>
	//   20   38:istore_1        
		if(i >= 0)
	//*  21   39:iload_1         
	//*  22   40:iflt            68
		{
			obj = ((Object) ((SystemRouteRecord)mSystemRouteRecords.get(i)));
	//   23   43:aload_0         
	//   24   44:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   25   47:iload_1         
	//   26   48:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   27   51:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   28   54:astore_2        
			mSyncCallback.onSystemRouteSelectedByDescriptorId(((SystemRouteRecord) (obj)).mRouteDescriptorId);
	//   29   55:aload_0         
	//   30   56:getfield        #66  <Field SystemMediaRouteProvider$SyncCallback mSyncCallback>
	//   31   59:aload_2         
	//   32   60:getfield        #222 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
	//   33   63:invokeinterface #365 <Method void SystemMediaRouteProvider$SyncCallback.onSystemRouteSelectedByDescriptorId(String)>
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
	//*   2    2:invokevirtual   #116 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
	//*   3    5:ifnonnull       72
		{
			int i = findSystemRouteRecord(obj);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #120 <Method int findSystemRouteRecord(Object)>
	//    7   13:istore_2        
			if(i >= 0)
	//*   8   14:iload_2         
	//*   9   15:iflt            72
			{
				SystemRouteRecord systemrouterecord = (SystemRouteRecord)mSystemRouteRecords.get(i);
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   14   26:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   15   29:astore_3        
				i = MediaRouterJellybean.RouteInfo.getVolume(obj);
	//   16   30:aload_1         
	//   17   31:invokestatic    #296 <Method int MediaRouterJellybean$RouteInfo.getVolume(Object)>
	//   18   34:istore_2        
				if(i != systemrouterecord.mRouteDescriptor.getVolume())
	//*  19   35:iload_2         
	//*  20   36:aload_3         
	//*  21   37:getfield        #373 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
	//*  22   40:invokevirtual   #377 <Method int MediaRouteDescriptor.getVolume()>
	//*  23   43:icmpeq          72
				{
					systemrouterecord.mRouteDescriptor = (new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptor)).setVolume(i).build();
	//   24   46:aload_3         
	//   25   47:new             #276 <Class MediaRouteDescriptor$Builder>
	//   26   50:dup             
	//   27   51:aload_3         
	//   28   52:getfield        #373 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
	//   29   55:invokespecial   #380 <Method void MediaRouteDescriptor$Builder(MediaRouteDescriptor)>
	//   30   58:iload_2         
	//   31   59:invokevirtual   #299 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolume(int)>
	//   32   62:invokevirtual   #384 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
	//   33   65:putfield        #373 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
					publishRoutes();
	//   34   68:aload_0         
	//   35   69:invokevirtual   #200 <Method void publishRoutes()>
				}
			}
		}
	//   36   72:return          
	}

	public void onSyncRouteAdded(MediaRouter.RouteInfo routeinfo)
	{
		if(routeinfo.getProviderInstance() != this)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #390 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       66
		{
			Object obj = MediaRouterJellybean.createUserRoute(mRouterObj, mUserRouteCategoryObj);
	//    4    8:aload_0         
	//    5    9:getfield        #74  <Field Object mRouterObj>
	//    6   12:aload_0         
	//    7   13:getfield        #108 <Field Object mUserRouteCategoryObj>
	//    8   16:invokestatic    #394 <Method Object MediaRouterJellybean.createUserRoute(Object, Object)>
	//    9   19:astore_3        
			routeinfo = ((MediaRouter.RouteInfo) (new UserRouteRecord(routeinfo, obj)));
	//   10   20:new             #229 <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:invokespecial   #397 <Method void SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord(MediaRouter$RouteInfo, Object)>
	//   15   29:astore_1        
			MediaRouterJellybean.RouteInfo.setTag(obj, ((Object) (routeinfo)));
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokestatic    #400 <Method void MediaRouterJellybean$RouteInfo.setTag(Object, Object)>
			MediaRouterJellybean.UserRouteInfo.setVolumeCallback(obj, mVolumeCallbackObj);
	//   19   35:aload_3         
	//   20   36:aload_0         
	//   21   37:getfield        #85  <Field Object mVolumeCallbackObj>
	//   22   40:invokestatic    #405 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeCallback(Object, Object)>
			updateUserRouteProperties(((UserRouteRecord) (routeinfo)));
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #409 <Method void updateUserRouteProperties(SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord)>
			mUserRouteRecords.add(((Object) (routeinfo)));
	//   26   48:aload_0         
	//   27   49:getfield        #64  <Field ArrayList mUserRouteRecords>
	//   28   52:aload_1         
	//   29   53:invokevirtual   #51  <Method boolean ArrayList.add(Object)>
	//   30   56:pop             
			MediaRouterJellybean.addUserRoute(mRouterObj, obj);
	//   31   57:aload_0         
	//   32   58:getfield        #74  <Field Object mRouterObj>
	//   33   61:aload_3         
	//   34   62:invokestatic    #412 <Method void MediaRouterJellybean.addUserRoute(Object, Object)>
			return;
	//   35   65:return          
		}
		int i = findSystemRouteRecord(MediaRouterJellybean.getSelectedRoute(mRouterObj, 0x800003));
	//   36   66:aload_0         
	//   37   67:aload_0         
	//   38   68:getfield        #74  <Field Object mRouterObj>
	//   39   71:ldc2            #353 <Int 0x800003>
	//   40   74:invokestatic    #357 <Method Object MediaRouterJellybean.getSelectedRoute(Object, int)>
	//   41   77:invokevirtual   #120 <Method int findSystemRouteRecord(Object)>
	//   42   80:istore_2        
		if(i >= 0 && ((SystemRouteRecord)mSystemRouteRecords.get(i)).mRouteDescriptorId.equals(((Object) (routeinfo.getDescriptorId()))))
	//*  43   81:iload_2         
	//*  44   82:iflt            113
	//*  45   85:aload_0         
	//*  46   86:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//*  47   89:iload_2         
	//*  48   90:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//*  49   93:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//*  50   96:getfield        #222 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
	//*  51   99:aload_1         
	//*  52  100:invokevirtual   #266 <Method String MediaRouter$RouteInfo.getDescriptorId()>
	//*  53  103:invokevirtual   #225 <Method boolean String.equals(Object)>
	//*  54  106:ifeq            113
			routeinfo.select();
	//   55  109:aload_1         
	//   56  110:invokevirtual   #360 <Method void MediaRouter$RouteInfo.select()>
	//   57  113:return          
	}

	public void onSyncRouteChanged(MediaRouter.RouteInfo routeinfo)
	{
		if(routeinfo.getProviderInstance() != this)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #390 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       33
		{
			int i = findUserRouteRecord(routeinfo);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #415 <Method int findUserRouteRecord(MediaRouter$RouteInfo)>
	//    7   13:istore_2        
			if(i >= 0)
	//*   8   14:iload_2         
	//*   9   15:iflt            33
				updateUserRouteProperties((UserRouteRecord)mUserRouteRecords.get(i));
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #64  <Field ArrayList mUserRouteRecords>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #229 <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
	//   16   30:invokevirtual   #409 <Method void updateUserRouteProperties(SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord)>
		}
	//   17   33:return          
	}

	public void onSyncRouteRemoved(MediaRouter.RouteInfo routeinfo)
	{
		if(routeinfo.getProviderInstance() != this)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #390 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       57
		{
			int i = findUserRouteRecord(routeinfo);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #415 <Method int findUserRouteRecord(MediaRouter$RouteInfo)>
	//    7   13:istore_2        
			if(i >= 0)
	//*   8   14:iload_2         
	//*   9   15:iflt            57
			{
				routeinfo = ((MediaRouter.RouteInfo) ((UserRouteRecord)mUserRouteRecords.remove(i)));
	//   10   18:aload_0         
	//   11   19:getfield        #64  <Field ArrayList mUserRouteRecords>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #350 <Method Object ArrayList.remove(int)>
	//   14   26:checkcast       #229 <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
	//   15   29:astore_1        
				MediaRouterJellybean.RouteInfo.setTag(((UserRouteRecord) (routeinfo)).mRouteObj, ((Object) (null)));
	//   16   30:aload_1         
	//   17   31:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   18   34:aconst_null     
	//   19   35:invokestatic    #400 <Method void MediaRouterJellybean$RouteInfo.setTag(Object, Object)>
				MediaRouterJellybean.UserRouteInfo.setVolumeCallback(((UserRouteRecord) (routeinfo)).mRouteObj, ((Object) (null)));
	//   20   38:aload_1         
	//   21   39:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   22   42:aconst_null     
	//   23   43:invokestatic    #405 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeCallback(Object, Object)>
				MediaRouterJellybean.removeUserRoute(mRouterObj, ((UserRouteRecord) (routeinfo)).mRouteObj);
	//   24   46:aload_0         
	//   25   47:getfield        #74  <Field Object mRouterObj>
	//   26   50:aload_1         
	//   27   51:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   28   54:invokestatic    #420 <Method void MediaRouterJellybean.removeUserRoute(Object, Object)>
			}
		}
	//   29   57:return          
	}

	public void onSyncRouteSelected(MediaRouter.RouteInfo routeinfo)
	{
		if(!routeinfo.isSelected())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #424 <Method boolean MediaRouter$RouteInfo.isSelected()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(routeinfo.getProviderInstance() != this)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #390 <Method MediaRouteProvider MediaRouter$RouteInfo.getProviderInstance()>
	//*   6   12:aload_0         
	//*   7   13:if_acmpeq       45
		{
			int i = findUserRouteRecord(routeinfo);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #415 <Method int findUserRouteRecord(MediaRouter$RouteInfo)>
	//   11   21:istore_2        
			if(i >= 0)
	//*  12   22:iload_2         
	//*  13   23:iflt            76
			{
				selectRoute(((UserRouteRecord)mUserRouteRecords.get(i)).mRouteObj);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #64  <Field ArrayList mUserRouteRecords>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #229 <Class SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord>
	//   20   38:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   21   41:invokevirtual   #427 <Method void selectRoute(Object)>
				return;
	//   22   44:return          
			}
		} else
		{
			int j = findSystemRouteRecordByDescriptorId(routeinfo.getDescriptorId());
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #266 <Method String MediaRouter$RouteInfo.getDescriptorId()>
	//   26   50:invokevirtual   #171 <Method int findSystemRouteRecordByDescriptorId(String)>
	//   27   53:istore_2        
			if(j >= 0)
	//*  28   54:iload_2         
	//*  29   55:iflt            76
				selectRoute(((SystemRouteRecord)mSystemRouteRecords.get(j)).mRouteObj);
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   33   63:iload_2         
	//   34   64:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   35   67:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   36   70:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   37   73:invokevirtual   #427 <Method void selectRoute(Object)>
		}
	//   38   76:return          
	}

	public void onVolumeSetRequest(Object obj, int i)
	{
		obj = ((Object) (getUserRouteRecord(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          18
			((UserRouteRecord) (obj)).mRoute.requestSetVolume(i);
	//    6   10:aload_1         
	//    7   11:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #433 <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
	//   10   18:return          
	}

	public void onVolumeUpdateRequest(Object obj, int i)
	{
		obj = ((Object) (getUserRouteRecord(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord getUserRouteRecord(Object)>
	//    3    5:astore_1        
		if(obj != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          18
			((UserRouteRecord) (obj)).mRoute.requestUpdateVolume(i);
	//    6   10:aload_1         
	//    7   11:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #437 <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
	//   10   18:return          
	}

	protected void publishRoutes()
	{
		MediaRouteProviderDescriptor.Builder builder = new MediaRouteProviderDescriptor.Builder();
	//    0    0:new             #439 <Class MediaRouteProviderDescriptor$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #440 <Method void MediaRouteProviderDescriptor$Builder()>
	//    3    7:astore_3        
		int j = mSystemRouteRecords.size();
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//    6   12:invokevirtual   #211 <Method int ArrayList.size()>
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
	//   15   25:getfield        #62  <Field ArrayList mSystemRouteRecords>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #215 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #122 <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   19   35:getfield        #373 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
	//   20   38:invokevirtual   #444 <Method MediaRouteProviderDescriptor$Builder MediaRouteProviderDescriptor$Builder.addRoute(MediaRouteDescriptor)>
	//   21   41:pop             

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            18
		setDescriptor(builder.build());
	//   27   49:aload_0         
	//   28   50:aload_3         
	//   29   51:invokevirtual   #447 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor$Builder.build()>
	//   30   54:invokevirtual   #451 <Method void setDescriptor(MediaRouteProviderDescriptor)>
	//   31   57:return          
	}

	protected void selectRoute(Object obj)
	{
		if(mSelectRouteWorkaround == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #453 <Field MediaRouterJellybean$SelectRouteWorkaround mSelectRouteWorkaround>
	//*   2    4:ifnonnull       18
			mSelectRouteWorkaround = new und();
	//    3    7:aload_0         
	//    4    8:new             #455 <Class MediaRouterJellybean$SelectRouteWorkaround>
	//    5   11:dup             
	//    6   12:invokespecial   #456 <Method void MediaRouterJellybean$SelectRouteWorkaround()>
	//    7   15:putfield        #453 <Field MediaRouterJellybean$SelectRouteWorkaround mSelectRouteWorkaround>
		mSelectRouteWorkaround.selectRoute(mRouterObj, 0x800003, obj);
	//    8   18:aload_0         
	//    9   19:getfield        #453 <Field MediaRouterJellybean$SelectRouteWorkaround mSelectRouteWorkaround>
	//   10   22:aload_0         
	//   11   23:getfield        #74  <Field Object mRouterObj>
	//   12   26:ldc2            #353 <Int 0x800003>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #459 <Method void MediaRouterJellybean$SelectRouteWorkaround.selectRoute(Object, int, Object)>
	//   15   33:return          
	}

	protected void updateCallback()
	{
		if(mCallbackRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #461 <Field boolean mCallbackRegistered>
	//*   2    4:ifeq            23
		{
			mCallbackRegistered = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #461 <Field boolean mCallbackRegistered>
			MediaRouterJellybean.removeCallback(mRouterObj, mCallbackObj);
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field Object mRouterObj>
	//    8   16:aload_0         
	//    9   17:getfield        #80  <Field Object mCallbackObj>
	//   10   20:invokestatic    #464 <Method void MediaRouterJellybean.removeCallback(Object, Object)>
		}
		int i = mRouteTypes;
	//   11   23:aload_0         
	//   12   24:getfield        #340 <Field int mRouteTypes>
	//   13   27:istore_1        
		if(i != 0)
	//*  14   28:iload_1         
	//*  15   29:ifeq            49
		{
			mCallbackRegistered = true;
	//   16   32:aload_0         
	//   17   33:iconst_1        
	//   18   34:putfield        #461 <Field boolean mCallbackRegistered>
			MediaRouterJellybean.addCallback(mRouterObj, i, mCallbackObj);
	//   19   37:aload_0         
	//   20   38:getfield        #74  <Field Object mRouterObj>
	//   21   41:iload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #80  <Field Object mCallbackObj>
	//   24   46:invokestatic    #467 <Method void MediaRouterJellybean.addCallback(Object, int, Object)>
		}
	//   25   49:return          
	}

	protected void updateSystemRouteDescriptor(SystemRouteRecord systemrouterecord)
	{
		MediaRouteDescriptor.Builder builder = new MediaRouteDescriptor.Builder(systemrouterecord.mRouteDescriptorId, getRouteName(systemrouterecord.mRouteObj));
	//    0    0:new             #276 <Class MediaRouteDescriptor$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #222 <Field String SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptorId>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #218 <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//    7   13:invokevirtual   #151 <Method String getRouteName(Object)>
	//    8   16:invokespecial   #470 <Method void MediaRouteDescriptor$Builder(String, String)>
	//    9   19:astore_2        
		onBuildSystemRouteDescriptor(systemrouterecord, builder);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #472 <Method void onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
		systemrouterecord.mRouteDescriptor = builder.build();
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #384 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
	//   17   31:putfield        #373 <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
	//   18   34:return          
	}

	protected void updateUserRouteProperties(UserRouteRecord userrouterecord)
	{
		MediaRouterJellybean.UserRouteInfo.setName(userrouterecord.mRouteObj, ((CharSequence) (userrouterecord.mRoute.getName())));
	//    0    0:aload_1         
	//    1    1:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//    2    4:aload_1         
	//    3    5:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//    4    8:invokevirtual   #474 <Method String MediaRouter$RouteInfo.getName()>
	//    5   11:invokestatic    #478 <Method void MediaRouterJellybean$UserRouteInfo.setName(Object, CharSequence)>
		MediaRouterJellybean.UserRouteInfo.setPlaybackType(userrouterecord.mRouteObj, userrouterecord.mRoute.getPlaybackType());
	//    6   14:aload_1         
	//    7   15:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//    8   18:aload_1         
	//    9   19:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//   10   22:invokevirtual   #480 <Method int MediaRouter$RouteInfo.getPlaybackType()>
	//   11   25:invokestatic    #482 <Method void MediaRouterJellybean$UserRouteInfo.setPlaybackType(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setPlaybackStream(userrouterecord.mRouteObj, userrouterecord.mRoute.getPlaybackStream());
	//   12   28:aload_1         
	//   13   29:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   14   32:aload_1         
	//   15   33:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//   16   36:invokevirtual   #484 <Method int MediaRouter$RouteInfo.getPlaybackStream()>
	//   17   39:invokestatic    #486 <Method void MediaRouterJellybean$UserRouteInfo.setPlaybackStream(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setVolume(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolume());
	//   18   42:aload_1         
	//   19   43:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   20   46:aload_1         
	//   21   47:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//   22   50:invokevirtual   #487 <Method int MediaRouter$RouteInfo.getVolume()>
	//   23   53:invokestatic    #489 <Method void MediaRouterJellybean$UserRouteInfo.setVolume(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setVolumeMax(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolumeMax());
	//   24   56:aload_1         
	//   25   57:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   26   60:aload_1         
	//   27   61:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//   28   64:invokevirtual   #491 <Method int MediaRouter$RouteInfo.getVolumeMax()>
	//   29   67:invokestatic    #493 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeMax(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setVolumeHandling(userrouterecord.mRouteObj, userrouterecord.mRoute.getVolumeHandling());
	//   30   70:aload_1         
	//   31   71:getfield        #417 <Field Object SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRouteObj>
	//   32   74:aload_1         
	//   33   75:getfield        #233 <Field MediaRouter$RouteInfo SystemMediaRouteProvider$JellybeanImpl$UserRouteRecord.mRoute>
	//   34   78:invokevirtual   #495 <Method int MediaRouter$RouteInfo.getVolumeHandling()>
	//   35   81:invokestatic    #497 <Method void MediaRouterJellybean$UserRouteInfo.setVolumeHandling(Object, int)>
	//   36   84:return          
	}

	private static final ArrayList LIVE_AUDIO_CONTROL_FILTERS;
	private static final ArrayList LIVE_VIDEO_CONTROL_FILTERS;
	protected boolean mActiveScan;
	protected final Object mCallbackObj = createCallbackObj();
	protected boolean mCallbackRegistered;
	private karound mGetDefaultRouteWorkaround;
	protected int mRouteTypes;
	protected final Object mRouterObj;
	private und mSelectRouteWorkaround;
	private final SystemMediaRouteProvider.SyncCallback mSyncCallback;
	protected final ArrayList mSystemRouteRecords = new ArrayList();
	protected final Object mUserRouteCategoryObj;
	protected final ArrayList mUserRouteRecords = new ArrayList();
	protected final Object mVolumeCallbackObj = createVolumeCallbackObj();

	static 
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #33  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void IntentFilter()>
	//    3    7:astore_0        
		intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
	//    4    8:aload_0         
	//    5    9:ldc1            #38  <String "android.media.intent.category.LIVE_AUDIO">
	//    6   11:invokevirtual   #42  <Method void IntentFilter.addCategory(String)>
		LIVE_AUDIO_CONTROL_FILTERS = new ArrayList();
	//    7   14:new             #44  <Class ArrayList>
	//    8   17:dup             
	//    9   18:invokespecial   #45  <Method void ArrayList()>
	//   10   21:putstatic       #47  <Field ArrayList LIVE_AUDIO_CONTROL_FILTERS>
		LIVE_AUDIO_CONTROL_FILTERS.add(((Object) (intentfilter)));
	//   11   24:getstatic       #47  <Field ArrayList LIVE_AUDIO_CONTROL_FILTERS>
	//   12   27:aload_0         
	//   13   28:invokevirtual   #51  <Method boolean ArrayList.add(Object)>
	//   14   31:pop             
		intentfilter = new IntentFilter();
	//   15   32:new             #33  <Class IntentFilter>
	//   16   35:dup             
	//   17   36:invokespecial   #36  <Method void IntentFilter()>
	//   18   39:astore_0        
		intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
	//   19   40:aload_0         
	//   20   41:ldc1            #53  <String "android.media.intent.category.LIVE_VIDEO">
	//   21   43:invokevirtual   #42  <Method void IntentFilter.addCategory(String)>
		LIVE_VIDEO_CONTROL_FILTERS = new ArrayList();
	//   22   46:new             #44  <Class ArrayList>
	//   23   49:dup             
	//   24   50:invokespecial   #45  <Method void ArrayList()>
	//   25   53:putstatic       #55  <Field ArrayList LIVE_VIDEO_CONTROL_FILTERS>
		LIVE_VIDEO_CONTROL_FILTERS.add(((Object) (intentfilter)));
	//   26   56:getstatic       #55  <Field ArrayList LIVE_VIDEO_CONTROL_FILTERS>
	//   27   59:aload_0         
	//   28   60:invokevirtual   #51  <Method boolean ArrayList.add(Object)>
	//   29   63:pop             
	//*  30   64:return          
	}

	public SystemMediaRouteProvider$JellybeanImpl(Context context, SystemMediaRouteProvider.SyncCallback synccallback)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void SystemMediaRouteProvider(Context)>
	//    3    5:aload_0         
	//    4    6:new             #44  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #45  <Method void ArrayList()>
	//    7   13:putfield        #62  <Field ArrayList mSystemRouteRecords>
	//    8   16:aload_0         
	//    9   17:new             #44  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #45  <Method void ArrayList()>
	//   12   24:putfield        #64  <Field ArrayList mUserRouteRecords>
		mSyncCallback = synccallback;
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:putfield        #66  <Field SystemMediaRouteProvider$SyncCallback mSyncCallback>
		mRouterObj = MediaRouterJellybean.getMediaRouter(context);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokestatic    #72  <Method Object MediaRouterJellybean.getMediaRouter(Context)>
	//   19   37:putfield        #74  <Field Object mRouterObj>
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:invokevirtual   #78  <Method Object createCallbackObj()>
	//   23   45:putfield        #80  <Field Object mCallbackObj>
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:invokevirtual   #83  <Method Object createVolumeCallbackObj()>
	//   27   53:putfield        #85  <Field Object mVolumeCallbackObj>
		context = ((Context) (context.getResources()));
	//   28   56:aload_1         
	//   29   57:invokevirtual   #91  <Method Resources Context.getResources()>
	//   30   60:astore_1        
		mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(mRouterObj, ((Resources) (context)).getString(android.support.v7.mediarouter.R.string.mr_user_route_category_name), false);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #74  <Field Object mRouterObj>
	//   34   66:aload_1         
	//   35   67:getstatic       #96  <Field int android.support.v7.mediarouter.R$string.mr_user_route_category_name>
	//   36   70:invokevirtual   #102 <Method String Resources.getString(int)>
	//   37   73:iconst_0        
	//   38   74:invokestatic    #106 <Method Object MediaRouterJellybean.createRouteCategory(Object, String, boolean)>
	//   39   77:putfield        #108 <Field Object mUserRouteCategoryObj>
		updateSystemRoutes();
	//   40   80:aload_0         
	//   41   81:invokespecial   #111 <Method void updateSystemRoutes()>
	//   42   84:return          
	}
}
