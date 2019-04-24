// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybean

public static final class MediaRouterJellybean$RouteCategory
{

	public static CharSequence getName(Object obj, Context context)
	{
		return ((android.media.MediaRouter.RouteCategory)obj).getName(context);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #19  <Method CharSequence android.media.MediaRouter$RouteCategory.getName(Context)>
	//    4    8:areturn         
	}

	public static List getRoutes(Object obj)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #23  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ArrayList()>
	//    3    7:astore_1        
		((android.media.MediaRouter.RouteCategory)obj).getRoutes(((List) (arraylist)));
	//    4    8:aload_0         
	//    5    9:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #27  <Method List android.media.MediaRouter$RouteCategory.getRoutes(List)>
	//    8   16:pop             
		return ((List) (arraylist));
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public static int getSupportedTypes(Object obj)
	{
		return ((android.media.MediaRouter.RouteCategory)obj).getSupportedTypes();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
	//    2    4:invokevirtual   #32  <Method int android.media.MediaRouter$RouteCategory.getSupportedTypes()>
	//    3    7:ireturn         
	}

	public static boolean isGroupable(Object obj)
	{
		return ((android.media.MediaRouter.RouteCategory)obj).isGroupable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteCategory>
	//    2    4:invokevirtual   #37  <Method boolean android.media.MediaRouter$RouteCategory.isGroupable()>
	//    3    7:ireturn         
	}

	public MediaRouterJellybean$RouteCategory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
