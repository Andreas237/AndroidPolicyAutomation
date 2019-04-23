// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybean$GetDefaultRouteWorkaround
{

	public Object getDefaultRoute(Object obj)
	{
		Object obj1;
		obj = ((Object) ((MediaRouter)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class MediaRouter>
	//    2    4:astore_1        
		obj1 = ((Object) (mGetSystemAudioRouteMethod));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field Method mGetSystemAudioRouteMethod>
	//    5    9:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_26;
	//    6   10:aload_2         
	//    7   11:ifnull          26
		obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:anewarray       Object[]
	//   12   20:invokevirtual   #46  <Method Object Method.invoke(Object, Object[])>
	//   13   23:astore_2        
		return obj1;
	//   14   24:aload_2         
	//   15   25:areturn         
_L2:
		return ((Object) (((MediaRouter) (obj)).getRouteAt(0)));
	//   16   26:aload_1         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #50  <Method android.media.MediaRouter$RouteInfo MediaRouter.getRouteAt(int)>
	//   19   31:areturn         
		Object obj2;
		obj2;
	//   20   32:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  21   33:goto            26
	}

	private Method mGetSystemAudioRouteMethod;

	public MediaRouterJellybean$GetDefaultRouteWorkaround()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 17)
	//*   2    4:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          16
	//*   4    9:icmplt          36
	//*   5   12:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   15:bipush          17
	//*   7   17:icmpgt          36
			try
			{
				mGetSystemAudioRouteMethod = ((Class) (android/media/MediaRouter)).getMethod("getSystemAudioRoute", new Class[0]);
	//    8   20:aload_0         
	//    9   21:ldc1            #20  <Class MediaRouter>
	//   10   23:ldc1            #22  <String "getSystemAudioRoute">
	//   11   25:iconst_0        
	//   12   26:anewarray       Class[]
	//   13   29:invokevirtual   #28  <Method Method Class.getMethod(String, Class[])>
	//   14   32:putfield        #30  <Field Method mGetSystemAudioRouteMethod>
				return;
	//   15   35:return          
			}
	//*  16   36:new             #32  <Class UnsupportedOperationException>
	//*  17   39:dup             
	//*  18   40:invokespecial   #33  <Method void UnsupportedOperationException()>
	//*  19   43:athrow          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  20   44:astore_1        
			{
				return;
	//   21   45:return          
			}
		else
			throw new UnsupportedOperationException();
	}
}
