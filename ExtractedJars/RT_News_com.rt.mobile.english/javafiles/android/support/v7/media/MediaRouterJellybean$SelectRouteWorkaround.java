// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybean

public static final class MediaRouterJellybean$SelectRouteWorkaround
{

	public void selectRoute(Object obj, int i, Object obj1)
	{
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class MediaRouter>
	//    2    4:astore_1        
		obj1 = ((Object) ((android.media.MediaRouter.RouteInfo)obj1));
	//    3    5:aload_3         
	//    4    6:checkcast       #35  <Class android.media.MediaRouter$RouteInfo>
	//    5    9:astore_3        
		if((((android.media.MediaRouter.RouteInfo) (obj1)).getSupportedTypes() & 0x800000) == 0)
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #55  <Method int android.media.MediaRouter$RouteInfo.getSupportedTypes()>
	//*   8   14:ldc1            #56  <Int 0x800000>
	//*   9   16:iand            
	//*  10   17:ifne            90
			if(mSelectRouteIntMethod != null)
	//*  11   20:aload_0         
	//*  12   21:getfield        #41  <Field Method mSelectRouteIntMethod>
	//*  13   24:ifnull          82
				try
				{
					mSelectRouteIntMethod.invoke(obj, new Object[] {
						Integer.valueOf(i), obj1
					});
	//   14   27:aload_0         
	//   15   28:getfield        #41  <Field Method mSelectRouteIntMethod>
	//   16   31:aload_1         
	//   17   32:iconst_2        
	//   18   33:anewarray       Object[]
	//   19   36:dup             
	//   20   37:iconst_0        
	//   21   38:iload_2         
	//   22   39:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   23   42:aastore         
	//   24   43:dup             
	//   25   44:iconst_1        
	//   26   45:aload_3         
	//   27   46:aastore         
	//   28   47:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
	//   29   50:pop             
					return;
	//   30   51:return          
				}
	//*  31   52:astore          4
	//*  32   54:ldc1            #68  <String "MediaRouterJellybean">
	//*  33   56:ldc1            #70  <String "Cannot programmatically select non-user route.  Media routing may not work.">
	//*  34   58:aload           4
	//*  35   60:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
	//*  36   63:pop             
	//*  37   64:goto            90
				catch(IllegalAccessException illegalaccessexception)
	//*  38   67:astore          4
				{
					Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", ((Throwable) (illegalaccessexception)));
	//   39   69:ldc1            #68  <String "MediaRouterJellybean">
	//   40   71:ldc1            #70  <String "Cannot programmatically select non-user route.  Media routing may not work.">
	//   41   73:aload           4
	//   42   75:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
	//   43   78:pop             
				}
				catch(InvocationTargetException invocationtargetexception)
				{
					Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", ((Throwable) (invocationtargetexception)));
				}
			else
	//*  44   79:goto            90
				Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
	//   45   82:ldc1            #68  <String "MediaRouterJellybean">
	//   46   84:ldc1            #78  <String "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.">
	//   47   86:invokestatic    #81  <Method int Log.w(String, String)>
	//   48   89:pop             
		((MediaRouter) (obj)).selectRoute(i, ((android.media.MediaRouter.RouteInfo) (obj1)));
	//   49   90:aload_1         
	//   50   91:iload_2         
	//   51   92:aload_3         
	//   52   93:invokevirtual   #84  <Method void MediaRouter.selectRoute(int, android.media.MediaRouter$RouteInfo)>
	//   53   96:return          
	}

	private Method mSelectRouteIntMethod;

	public MediaRouterJellybean$SelectRouteWorkaround()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 17)
	//*   2    4:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          50
	//*   5   12:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   15:bipush          17
	//*   7   17:icmple          23
	//*   8   20:goto            50
			try
			{
				mSelectRouteIntMethod = ((Class) (android/media/MediaRouter)).getMethod("selectRouteInt", new Class[] {
					Integer.TYPE, android/media/MediaRouter$RouteInfo
				});
	//    9   23:aload_0         
	//   10   24:ldc1            #23  <Class MediaRouter>
	//   11   26:ldc1            #25  <String "selectRouteInt">
	//   12   28:iconst_2        
	//   13   29:anewarray       Class[]
	//   14   32:dup             
	//   15   33:iconst_0        
	//   16   34:getstatic       #33  <Field Class Integer.TYPE>
	//   17   37:aastore         
	//   18   38:dup             
	//   19   39:iconst_1        
	//   20   40:ldc1            #35  <Class android.media.MediaRouter$RouteInfo>
	//   21   42:aastore         
	//   22   43:invokevirtual   #39  <Method Method Class.getMethod(String, Class[])>
	//   23   46:putfield        #41  <Field Method mSelectRouteIntMethod>
				return;
	//   24   49:return          
			}
	//*  25   50:new             #43  <Class UnsupportedOperationException>
	//*  26   53:dup             
	//*  27   54:invokespecial   #44  <Method void UnsupportedOperationException()>
	//*  28   57:athrow          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  29   58:astore_1        
			{
				return;
	//   30   59:return          
			}
		else
			throw new UnsupportedOperationException();
	}
}
