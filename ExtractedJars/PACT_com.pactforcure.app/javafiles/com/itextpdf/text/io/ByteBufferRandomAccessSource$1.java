// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;

// Referenced classes of package com.itextpdf.text.io:
//			ByteBufferRandomAccessSource

static final class ByteBufferRandomAccessSource$1
	implements PrivilegedAction
{

	public Boolean run()
	{
		Boolean boolean1 = Boolean.FALSE;
	//    0    0:getstatic       #32  <Field Boolean Boolean.FALSE>
	//    1    3:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (((Object) (val$buffer)).getClass().getMethod("cleaner", (Class[])null)));
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field ByteBuffer val$buffer>
	//    4    8:invokevirtual   #36  <Method Class Object.getClass()>
	//    5   11:ldc1            #38  <String "cleaner">
	//    6   13:aconst_null     
	//    7   14:checkcast       #40  <Class Class[]>
	//    8   17:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//    9   20:astore_2        
			((Method) (obj)).setAccessible(true);
	//   10   21:aload_2         
	//   11   22:iconst_1        
	//   12   23:invokevirtual   #52  <Method void Method.setAccessible(boolean)>
			obj = ((Method) (obj)).invoke(((Object) (val$buffer)), (Object[])null);
	//   13   26:aload_2         
	//   14   27:aload_0         
	//   15   28:getfield        #18  <Field ByteBuffer val$buffer>
	//   16   31:aconst_null     
	//   17   32:checkcast       #54  <Class Object[]>
	//   18   35:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
	//   19   38:astore_2        
			obj.getClass().getMethod("clean", (Class[])null).invoke(obj, (Object[])null);
	//   20   39:aload_2         
	//   21   40:invokevirtual   #36  <Method Class Object.getClass()>
	//   22   43:ldc1            #59  <String "clean">
	//   23   45:aconst_null     
	//   24   46:checkcast       #40  <Class Class[]>
	//   25   49:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//   26   52:aload_2         
	//   27   53:aconst_null     
	//   28   54:checkcast       #54  <Class Object[]>
	//   29   57:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
	//   30   60:pop             
			obj = ((Object) (Boolean.TRUE));
	//   31   61:getstatic       #62  <Field Boolean Boolean.TRUE>
	//   32   64:astore_2        
		}
	//*  33   65:aload_2         
	//*  34   66:areturn         
		catch(Exception exception)
	//*  35   67:astore_2        
		{
			return boolean1;
	//   36   68:aload_1         
	//   37   69:areturn         
		}
		return ((Boolean) (obj));
	}

	public volatile Object run()
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Boolean run()>
	//    2    4:areturn         
	}

	final ByteBuffer val$buffer;

	ByteBufferRandomAccessSource$1(ByteBuffer bytebuffer)
	{
		val$buffer = bytebuffer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ByteBuffer val$buffer>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
