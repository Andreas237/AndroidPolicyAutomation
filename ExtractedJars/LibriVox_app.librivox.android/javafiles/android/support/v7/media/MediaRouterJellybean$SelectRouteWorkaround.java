// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybean$SelectRouteWorkaround
{

	public void selectRoute(Object obj, int i, Object obj1)
	{
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class MediaRouter>
	//    2    4:astore_1        
		obj1 = ((Object) ((android.media.MediaRouter.RouteInfo)obj1));
	//    3    5:aload_3         
	//    4    6:checkcast       #32  <Class android.media.MediaRouter$RouteInfo>
	//    5    9:astore_3        
		if((((android.media.MediaRouter.RouteInfo) (obj1)).getSupportedTypes() & 0x800000) == 0)
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #52  <Method int android.media.MediaRouter$RouteInfo.getSupportedTypes()>
	//*   8   14:ldc1            #53  <Int 0x800000>
	//*   9   16:iand            
	//*  10   17:ifne            92
		{
			Method method = mSelectRouteIntMethod;
	//   11   20:aload_0         
	//   12   21:getfield        #38  <Field Method mSelectRouteIntMethod>
	//   13   24:astore          4
			if(method != null)
	//*  14   26:aload           4
	//*  15   28:ifnull          84
				try
				{
					method.invoke(obj, new Object[] {
						Integer.valueOf(i), obj1
					});
	//   16   31:aload           4
	//   17   33:aload_1         
	//   18   34:iconst_2        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:iload_2         
	//   23   41:invokestatic    #57  <Method Integer Integer.valueOf(int)>
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_1        
	//   27   47:aload_3         
	//   28   48:aastore         
	//   29   49:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
	//   30   52:pop             
					return;
	//   31   53:return          
				}
	//*  32   54:astore          4
	//*  33   56:ldc1            #65  <String "MediaRouterJellybean">
	//*  34   58:ldc1            #67  <String "Cannot programmatically select non-user route.  Media routing may not work.">
	//*  35   60:aload           4
	//*  36   62:invokestatic    #73  <Method int Log.w(String, String, Throwable)>
	//*  37   65:pop             
	//*  38   66:goto            92
				catch(IllegalAccessException illegalaccessexception)
	//*  39   69:astore          4
				{
					Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", ((Throwable) (illegalaccessexception)));
	//   40   71:ldc1            #65  <String "MediaRouterJellybean">
	//   41   73:ldc1            #67  <String "Cannot programmatically select non-user route.  Media routing may not work.">
	//   42   75:aload           4
	//   43   77:invokestatic    #73  <Method int Log.w(String, String, Throwable)>
	//   44   80:pop             
				}
				catch(InvocationTargetException invocationtargetexception)
				{
					Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", ((Throwable) (invocationtargetexception)));
				}
			else
	//*  45   81:goto            92
				Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
	//   46   84:ldc1            #65  <String "MediaRouterJellybean">
	//   47   86:ldc1            #75  <String "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.">
	//   48   88:invokestatic    #78  <Method int Log.w(String, String)>
	//   49   91:pop             
		}
		((MediaRouter) (obj)).selectRoute(i, ((android.media.MediaRouter.RouteInfo) (obj1)));
	//   50   92:aload_1         
	//   51   93:iload_2         
	//   52   94:aload_3         
	//   53   95:invokevirtual   #81  <Method void MediaRouter.selectRoute(int, android.media.MediaRouter$RouteInfo)>
	//   54   98:return          
	}

	private Method mSelectRouteIntMethod;

	public MediaRouterJellybean$SelectRouteWorkaround()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 17)
	//*   2    4:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          47
	//*   5   12:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   15:bipush          17
	//*   7   17:icmpgt          47
			try
			{
				mSelectRouteIntMethod = ((Class) (android/media/MediaRouter)).getMethod("selectRouteInt", new Class[] {
					Integer.TYPE, android/media/MediaRouter$RouteInfo
				});
	//    8   20:aload_0         
	//    9   21:ldc1            #20  <Class MediaRouter>
	//   10   23:ldc1            #22  <String "selectRouteInt">
	//   11   25:iconst_2        
	//   12   26:anewarray       Class[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:getstatic       #30  <Field Class Integer.TYPE>
	//   16   34:aastore         
	//   17   35:dup             
	//   18   36:iconst_1        
	//   19   37:ldc1            #32  <Class android.media.MediaRouter$RouteInfo>
	//   20   39:aastore         
	//   21   40:invokevirtual   #36  <Method Method Class.getMethod(String, Class[])>
	//   22   43:putfield        #38  <Field Method mSelectRouteIntMethod>
				return;
	//   23   46:return          
			}
	//*  24   47:new             #40  <Class UnsupportedOperationException>
	//*  25   50:dup             
	//*  26   51:invokespecial   #41  <Method void UnsupportedOperationException()>
	//*  27   54:athrow          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  28   55:astore_1        
			{
				return;
	//   29   56:return          
			}
		else
			throw new UnsupportedOperationException();
	}
}
