// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybean

public static final class MediaRouterJellybean$GetDefaultRouteWorkaround
{

	public Object getDefaultRoute(Object obj)
	{
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class MediaRouter>
	//    2    4:astore_1        
		if(mGetSystemAudioRouteMethod == null)
			break MISSING_BLOCK_LABEL_27;
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field Method mGetSystemAudioRouteMethod>
	//    5    9:ifnull          27
		Object obj1 = mGetSystemAudioRouteMethod.invoke(obj, new Object[0]);
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field Method mGetSystemAudioRouteMethod>
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:anewarray       Object[]
	//   11   21:invokevirtual   #49  <Method Object Method.invoke(Object, Object[])>
	//   12   24:astore_2        
		return obj1;
	//   13   25:aload_2         
	//   14   26:areturn         
_L2:
		return ((Object) (((MediaRouter) (obj)).getRouteAt(0)));
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #53  <Method android.media.MediaRouter$RouteInfo MediaRouter.getRouteAt(int)>
	//   18   32:areturn         
		Object obj2;
		obj2;
	//   19   33:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   34:goto            27
	}

	private Method mGetSystemAudioRouteMethod;

	public MediaRouterJellybean$GetDefaultRouteWorkaround()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 17)
	//*   2    4:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          39
	//*   5   12:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   15:bipush          17
	//*   7   17:icmple          23
	//*   8   20:goto            39
			try
			{
				mGetSystemAudioRouteMethod = ((Class) (android/media/MediaRouter)).getMethod("getSystemAudioRoute", new Class[0]);
	//    9   23:aload_0         
	//   10   24:ldc1            #23  <Class MediaRouter>
	//   11   26:ldc1            #25  <String "getSystemAudioRoute">
	//   12   28:iconst_0        
	//   13   29:anewarray       Class[]
	//   14   32:invokevirtual   #31  <Method Method Class.getMethod(String, Class[])>
	//   15   35:putfield        #33  <Field Method mGetSystemAudioRouteMethod>
				return;
	//   16   38:return          
			}
	//*  17   39:new             #35  <Class UnsupportedOperationException>
	//*  18   42:dup             
	//*  19   43:invokespecial   #36  <Method void UnsupportedOperationException()>
	//*  20   46:athrow          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  21   47:astore_1        
			{
				return;
	//   22   48:return          
			}
		else
			throw new UnsupportedOperationException();
	}
}
