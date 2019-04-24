// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

protected static abstract class HttpRequest$Operation
	implements Callable
{

	public Object call()
		throws tException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Object obj = run();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #24  <Method Object run()>
	//    4    6:astore_2        
		done();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #27  <Method void done()>
_L2:
		return obj;
	//    7   11:aload_2         
	//    8   12:areturn         
		IOException ioexception;
		ioexception;
	//    9   13:astore_3        
		if(false) goto _L2; else goto _L1
	//   10   14:iconst_0        
	//   11   15:ifne            11
_L1:
		throw new tException(ioexception);
	//   12   18:new             #19  <Class HttpRequest$HttpRequestException>
	//   13   21:dup             
	//   14   22:aload_3         
	//   15   23:invokespecial   #30  <Method void HttpRequest$HttpRequestException(IOException)>
	//   16   26:athrow          
		Object obj1;
		obj1;
	//   17   27:astore_2        
		flag = true;
	//   18   28:iconst_1        
	//   19   29:istore_1        
		throw obj1;
	//   20   30:aload_2         
	//   21   31:athrow          
		obj1;
	//   22   32:astore_2        
		try
		{
			done();
	//   23   33:aload_0         
	//   24   34:invokevirtual   #27  <Method void done()>
		}
	//*  25   37:aload_2         
	//*  26   38:athrow          
	//*  27   39:astore_2        
	//*  28   40:iconst_1        
	//*  29   41:istore_1        
	//*  30   42:new             #19  <Class HttpRequest$HttpRequestException>
	//*  31   45:dup             
	//*  32   46:aload_2         
	//*  33   47:invokespecial   #30  <Method void HttpRequest$HttpRequestException(IOException)>
	//*  34   50:athrow          
		catch(IOException ioexception1)
	//*  35   51:astore_3        
		{
			if(!flag)
	//*  36   52:iload_1         
	//*  37   53:ifne            37
				throw new tException(ioexception1);
	//   38   56:new             #19  <Class HttpRequest$HttpRequestException>
	//   39   59:dup             
	//   40   60:aload_3         
	//   41   61:invokespecial   #30  <Method void HttpRequest$HttpRequestException(IOException)>
	//   42   64:athrow          
		}
		throw obj1;
		obj1;
		flag = true;
		throw new tException(((IOException) (obj1)));
	}

	protected abstract void done()
		throws IOException;

	protected abstract Object run()
		throws tException, IOException;

	protected HttpRequest$Operation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
