// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.e;

import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package b.a.a.a.a.e:
//			d

protected static abstract class d$d
	implements Callable
{

	protected abstract Object b();

	protected abstract void c();

	public Object call()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		Object obj = b();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #25  <Method Object b()>
	//    4    6:astore_2        
		try
		{
			c();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #27  <Method void c()>
		}
	//*   7   11:aload_2         
	//*   8   12:areturn         
		catch(IOException ioexception)
	//*   9   13:astore_2        
		{
			throw new d$c(ioexception);
	//   10   14:new             #21  <Class d$c>
	//   11   17:dup             
	//   12   18:aload_2         
	//   13   19:invokespecial   #30  <Method void d$c(IOException)>
	//   14   22:athrow          
		}
		return obj;
		Object obj1;
		obj1;
	//   15   23:astore_2        
		flag = false;
	//   16   24:iconst_0        
	//   17   25:istore_1        
		break MISSING_BLOCK_LABEL_43;
	//   18   26:goto            43
		obj1;
	//   19   29:astore_2        
		throw new d$c(((IOException) (obj1)));
	//   20   30:new             #21  <Class d$c>
	//   21   33:dup             
	//   22   34:aload_2         
	//   23   35:invokespecial   #30  <Method void d$c(IOException)>
	//   24   38:athrow          
		obj1;
	//   25   39:astore_2        
		throw obj1;
	//   26   40:aload_2         
	//   27   41:athrow          
		obj1;
	//   28   42:astore_2        
		try
		{
			c();
	//   29   43:aload_0         
	//   30   44:invokevirtual   #27  <Method void c()>
		}
	//*  31   47:goto            64
		catch(IOException ioexception1)
	//*  32   50:astore_3        
		{
			if(!flag)
	//*  33   51:iload_1         
	//*  34   52:ifne            64
				throw new d$c(ioexception1);
	//   35   55:new             #21  <Class d$c>
	//   36   58:dup             
	//   37   59:aload_3         
	//   38   60:invokespecial   #30  <Method void d$c(IOException)>
	//   39   63:athrow          
		}
		throw obj1;
	//   40   64:aload_2         
	//   41   65:athrow          
	}

	protected d$d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
