// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import java.lang.reflect.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybeanMr1

public static final class MediaRouterJellybeanMr1$IsConnectingWorkaround
{

	public boolean isConnecting(Object obj)
	{
		boolean flag;
		obj = ((Object) ((android.media.MediaRouter.RouteInfo)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #31  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:astore_1        
		Method method = mGetStatusCodeMethod;
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field Method mGetStatusCodeMethod>
	//    5    9:astore          5
		flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
		if(method == null)
			break MISSING_BLOCK_LABEL_54;
	//    8   14:aload           5
	//    9   16:ifnull          54
		int i;
		int j;
		try
		{
			i = ((Integer)mGetStatusCodeMethod.invoke(obj, new Object[0])).intValue();
	//   10   19:aload_0         
	//   11   20:getfield        #55  <Field Method mGetStatusCodeMethod>
	//   12   23:aload_1         
	//   13   24:iconst_0        
	//   14   25:anewarray       Object[]
	//   15   28:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
	//   16   31:checkcast       #68  <Class Integer>
	//   17   34:invokevirtual   #72  <Method int Integer.intValue()>
	//   18   37:istore_2        
			j = mStatusConnecting;
	//   19   38:aload_0         
	//   20   39:getfield        #47  <Field int mStatusConnecting>
	//   21   42:istore_3        
		}
	//*  22   43:iload_2         
	//*  23   44:iload_3         
	//*  24   45:icmpne          51
	//*  25   48:iconst_1        
	//*  26   49:istore          4
	//*  27   51:iload           4
	//*  28   53:ireturn         
	//*  29   54:iconst_0        
	//*  30   55:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  31   56:astore_1        
		{
			return false;
	//   32   57:iconst_0        
	//   33   58:ireturn         
		}
		if(i == j)
			flag = true;
		return flag;
		return false;
	}

	private Method mGetStatusCodeMethod;
	private int mStatusConnecting;

	public MediaRouterJellybeanMr1$IsConnectingWorkaround()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT != 17)
	//*   2    4:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          17
	//*   4    9:icmpeq          20
			throw new UnsupportedOperationException();
	//    5   12:new             #28  <Class UnsupportedOperationException>
	//    6   15:dup             
	//    7   16:invokespecial   #29  <Method void UnsupportedOperationException()>
	//    8   19:athrow          
		try
		{
			mStatusConnecting = ((Class) (android/media/MediaRouter$RouteInfo)).getField("STATUS_CONNECTING").getInt(((Object) (null)));
	//    9   20:aload_0         
	//   10   21:ldc1            #31  <Class android.media.MediaRouter$RouteInfo>
	//   11   23:ldc1            #33  <String "STATUS_CONNECTING">
	//   12   25:invokevirtual   #39  <Method Field Class.getField(String)>
	//   13   28:aconst_null     
	//   14   29:invokevirtual   #45  <Method int Field.getInt(Object)>
	//   15   32:putfield        #47  <Field int mStatusConnecting>
			mGetStatusCodeMethod = ((Class) (android/media/MediaRouter$RouteInfo)).getMethod("getStatusCode", new Class[0]);
	//   16   35:aload_0         
	//   17   36:ldc1            #31  <Class android.media.MediaRouter$RouteInfo>
	//   18   38:ldc1            #49  <String "getStatusCode">
	//   19   40:iconst_0        
	//   20   41:anewarray       Class[]
	//   21   44:invokevirtual   #53  <Method Method Class.getMethod(String, Class[])>
	//   22   47:putfield        #55  <Field Method mGetStatusCodeMethod>
			return;
	//   23   50:return          
		}
		catch(Object obj)
	//*  24   51:astore_1        
		{
			return;
	//   25   52:return          
		}
	}
}
