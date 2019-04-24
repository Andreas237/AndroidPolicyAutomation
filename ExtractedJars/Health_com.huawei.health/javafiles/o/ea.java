// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Process;
import java.util.LinkedList;

// Referenced classes of package o:
//			ec

final class ea
	implements Runnable
{

	ea(ec ec1)
	{
		a = ec1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ec a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		Process.setThreadPriority(0);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #25  <Method void Process.setThreadPriority(int)>
_L2:
		Runnable runnable;
		do
		{
			if(ec.b(a).isEmpty())
				break MISSING_BLOCK_LABEL_57;
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field ec a>
	//    4    8:invokestatic    #31  <Method LinkedList ec.b(ec)>
	//    5   11:invokevirtual   #37  <Method boolean LinkedList.isEmpty()>
	//    6   14:ifne            57
			runnable = (Runnable)ec.b(a).get(0);
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field ec a>
	//    9   21:invokestatic    #31  <Method LinkedList ec.b(ec)>
	//   10   24:iconst_0        
	//   11   25:invokevirtual   #41  <Method Object LinkedList.get(int)>
	//   12   28:checkcast       #6   <Class Runnable>
	//   13   31:astore_1        
			ec.b(a).remove(0);
	//   14   32:aload_0         
	//   15   33:getfield        #12  <Field ec a>
	//   16   36:invokestatic    #31  <Method LinkedList ec.b(ec)>
	//   17   39:iconst_0        
	//   18   40:invokevirtual   #44  <Method Object LinkedList.remove(int)>
	//   19   43:pop             
		} while(runnable == null);
	//   20   44:aload_1         
	//   21   45:ifnull          54
		try
		{
			runnable.run();
	//   22   48:aload_1         
	//   23   49:invokeinterface #46  <Method void Runnable.run()>
		}
	//*  24   54:goto            4
	//*  25   57:aload_0         
	//*  26   58:getfield        #12  <Field ec a>
	//*  27   61:invokestatic    #49  <Method Thread ec.a(ec)>
	//*  28   64:pop             
	//*  29   65:return          
	//*  30   66:aload_0         
	//*  31   67:getfield        #12  <Field ec a>
	//*  32   70:invokestatic    #49  <Method Thread ec.a(ec)>
	//*  33   73:pop             
	//*  34   74:return          
	//*  35   75:astore_1        
	//*  36   76:aload_0         
	//*  37   77:getfield        #12  <Field ec a>
	//*  38   80:invokestatic    #49  <Method Thread ec.a(ec)>
	//*  39   83:pop             
	//*  40   84:aload_1         
	//*  41   85:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			ec.a(a);
			return;
		}
		if(true) goto _L2; else goto _L1
_L1:
		ec.a(a);
		return;
		Object obj;
		obj;
		ec.a(a);
		throw obj;
	//*  42   86:astore_1        
	//*  43   87:goto            66
	}

	final ec a;
}
