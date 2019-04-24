// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//			MediaRouter, MediaRouteProvider, MediaRouteProviderDescriptor

public static final class MediaRouter$ProviderInfo
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
			if(MediaRouter.RouteInfo.access$100((MediaRouter.RouteInfo)mRoutes.get(i)).equals(((Object) (s))))
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
	private final erMetadata mMetadata;
	private final MediaRouteProvider mProviderInstance;
	private Resources mResources;
	private boolean mResourcesNotAvailable;
	private final List mRoutes = new ArrayList();


/*
	static MediaRouteProvider access$500(MediaRouter$ProviderInfo mediarouter$providerinfo)
	{
		return mediarouter$providerinfo.mProviderInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field MediaRouteProvider mProviderInstance>
	//    2    4:areturn         
	}

*/


/*
	static List access$600(MediaRouter$ProviderInfo mediarouter$providerinfo)
	{
		return mediarouter$providerinfo.mRoutes;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List mRoutes>
	//    2    4:areturn         
	}

*/

	MediaRouter$ProviderInfo(MediaRouteProvider mediarouteprovider)
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
