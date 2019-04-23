// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package okhttp3.internal.a;

import a.aa;
import java.io.IOException;

// Referenced classes of package okhttp3.internal.a:
//			m, i

class j extends m
{

	j(i k, aa aa)
	{
		a = k;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field i a>
		super(aa);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void m(aa)>
	//    6   10:return          
	}

	protected void a(IOException ioexception)
	{
		synchronized(a.c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #10  <Field i a>
	//*   2    4:getfield        #21  <Field f i.c>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			a.a();
	//    6   10:aload_0         
	//    7   11:getfield        #10  <Field i a>
	//    8   14:invokevirtual   #24  <Method void i.a()>
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		exception;
	//   12   20:astore_2        
		ioexception;
	//   13   21:aload_1         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		throw exception;
	//   15   23:aload_2         
	//   16   24:athrow          
	}

	final i a;
}
