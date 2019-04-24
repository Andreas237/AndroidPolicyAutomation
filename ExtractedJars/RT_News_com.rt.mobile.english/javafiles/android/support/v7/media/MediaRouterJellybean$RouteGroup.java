// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybean

public static final class MediaRouterJellybean$RouteGroup
{

	public static List getGroupedRoutes(Object obj)
	{
		obj = ((Object) ((android.media.MediaRouter.RouteGroup)obj));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.MediaRouter$RouteGroup>
	//    2    4:astore_0        
		int j = ((android.media.MediaRouter.RouteGroup) (obj)).getRouteCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method int android.media.MediaRouter$RouteGroup.getRouteCount()>
	//    5    9:istore_2        
		ArrayList arraylist = new ArrayList(j);
	//    6   10:new             #22  <Class ArrayList>
	//    7   13:dup             
	//    8   14:iload_2         
	//    9   15:invokespecial   #25  <Method void ArrayList(int)>
	//   10   18:astore_3        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          45
			((List) (arraylist)).add(((Object) (((android.media.MediaRouter.RouteGroup) (obj)).getRouteAt(i))));
	//   16   26:aload_3         
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:invokevirtual   #29  <Method android.media.MediaRouter$RouteInfo android.media.MediaRouter$RouteGroup.getRouteAt(int)>
	//   20   32:invokeinterface #35  <Method boolean List.add(Object)>
	//   21   37:pop             

	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            21
		return ((List) (arraylist));
	//   27   45:aload_3         
	//   28   46:areturn         
	}

	public MediaRouterJellybean$RouteGroup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
