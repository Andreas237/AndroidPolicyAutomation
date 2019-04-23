// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import java.lang.reflect.*;

public final class MediaRouterJellybeanMr1$IsConnectingWorkaround
{

	public boolean isConnecting(Object obj)
	{
		boolean flag;
		Method method;
		obj = ((Object) ((android.media.MediaRouter.RouteInfo)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #25  <Class android.media.MediaRouter$RouteInfo>
	//    2    4:astore_1        
		method = mGetStatusCodeMethod;
	//    3    5:aload_0         
	//    4    6:getfield        #49  <Field Method mGetStatusCodeMethod>
	//    5    9:astore          5
		flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
		if(method == null)
			break MISSING_BLOCK_LABEL_52;
	//    8   14:aload           5
	//    9   16:ifnull          52
		int i;
		int j;
		try
		{
			i = ((Integer)method.invoke(obj, new Object[0])).intValue();
	//   10   19:aload           5
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:anewarray       Object[]
	//   14   26:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
	//   15   29:checkcast       #65  <Class Integer>
	//   16   32:invokevirtual   #69  <Method int Integer.intValue()>
	//   17   35:istore_2        
			j = mStatusConnecting;
	//   18   36:aload_0         
	//   19   37:getfield        #41  <Field int mStatusConnecting>
	//   20   40:istore_3        
		}
	//*  21   41:iload_2         
	//*  22   42:iload_3         
	//*  23   43:icmpne          49
	//*  24   46:iconst_1        
	//*  25   47:istore          4
	//*  26   49:iload           4
	//*  27   51:ireturn         
	//*  28   52:iconst_0        
	//*  29   53:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  30   54:astore_1        
		{
			return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
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
	//    1    1:invokespecial   #18  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT != 17)
			break MISSING_BLOCK_LABEL_43;
	//    2    4:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    7:bipush          17
	//    4    9:icmpne          43
		try
		{
			mStatusConnecting = ((Class) (android/media/MediaRouter$RouteInfo)).getField("STATUS_CONNECTING").getInt(((Object) (null)));
	//    5   12:aload_0         
	//    6   13:ldc1            #25  <Class android.media.MediaRouter$RouteInfo>
	//    7   15:ldc1            #27  <String "STATUS_CONNECTING">
	//    8   17:invokevirtual   #33  <Method Field Class.getField(String)>
	//    9   20:aconst_null     
	//   10   21:invokevirtual   #39  <Method int Field.getInt(Object)>
	//   11   24:putfield        #41  <Field int mStatusConnecting>
			mGetStatusCodeMethod = ((Class) (android/media/MediaRouter$RouteInfo)).getMethod("getStatusCode", new Class[0]);
	//   12   27:aload_0         
	//   13   28:ldc1            #25  <Class android.media.MediaRouter$RouteInfo>
	//   14   30:ldc1            #43  <String "getStatusCode">
	//   15   32:iconst_0        
	//   16   33:anewarray       Class[]
	//   17   36:invokevirtual   #47  <Method Method Class.getMethod(String, Class[])>
	//   18   39:putfield        #49  <Field Method mGetStatusCodeMethod>
			return;
	//   19   42:return          
		}
	//*  20   43:new             #51  <Class UnsupportedOperationException>
	//*  21   46:dup             
	//*  22   47:invokespecial   #52  <Method void UnsupportedOperationException()>
	//*  23   50:athrow          
		catch(Object obj)
	//*  24   51:astore_1        
		{
			return;
	//   25   52:return          
		}
		throw new UnsupportedOperationException();
	}
}
