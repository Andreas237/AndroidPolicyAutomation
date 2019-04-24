// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask

class ModernAsyncTask$2 extends rkerRunnable
{

	public Object call()
		throws Exception
	{
		Object obj;
		Object obj1;
		Object obj2;
		ModernAsyncTask.access$000(ModernAsyncTask.this).set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ModernAsyncTask this$0>
	//    2    4:invokestatic    #27  <Method AtomicBoolean ModernAsyncTask.access$000(ModernAsyncTask)>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		obj2 = null;
	//    5   11:aconst_null     
	//    6   12:astore_3        
		obj1 = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
		obj = obj1;
	//    9   15:aload_2         
	//   10   16:astore_1        
		Process.setThreadPriority(10);
	//   11   17:bipush          10
	//   12   19:invokestatic    #39  <Method void Process.setThreadPriority(int)>
		obj = obj1;
	//   13   22:aload_2         
	//   14   23:astore_1        
		obj1 = doInBackground(mParams);
	//   15   24:aload_0         
	//   16   25:getfield        #15  <Field ModernAsyncTask this$0>
	//   17   28:aload_0         
	//   18   29:getfield        #43  <Field Object[] mParams>
	//   19   32:invokevirtual   #47  <Method Object ModernAsyncTask.doInBackground(Object[])>
	//   20   35:astore_2        
		try
		{
			Binder.flushPendingCommands();
	//   21   36:invokestatic    #52  <Method void Binder.flushPendingCommands()>
		}
	//*  22   39:aload_0         
	//*  23   40:getfield        #15  <Field ModernAsyncTask this$0>
	//*  24   43:aload_2         
	//*  25   44:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
	//*  26   47:pop             
	//*  27   48:aload_2         
	//*  28   49:areturn         
	//*  29   50:astore_3        
	//*  30   51:aload_2         
	//*  31   52:astore_1        
	//*  32   53:aload_3         
	//*  33   54:astore_2        
	//*  34   55:goto            88
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//*  35   58:astore_3        
		{
			break MISSING_BLOCK_LABEL_71;
	//   36   59:goto            71
		}
		postResult(obj1);
		return obj1;
		obj2;
		obj = obj1;
		obj1 = obj2;
		break MISSING_BLOCK_LABEL_88;
		obj1;
	//   37   62:astore_2        
		break MISSING_BLOCK_LABEL_88;
	//   38   63:goto            88
		obj;
	//   39   66:astore_1        
		obj1 = obj2;
	//   40   67:aload_3         
	//   41   68:astore_2        
		obj2 = obj;
	//   42   69:aload_1         
	//   43   70:astore_3        
		obj = obj1;
	//   44   71:aload_2         
	//   45   72:astore_1        
		ModernAsyncTask.access$100(ModernAsyncTask.this).set(true);
	//   46   73:aload_0         
	//   47   74:getfield        #15  <Field ModernAsyncTask this$0>
	//   48   77:invokestatic    #59  <Method AtomicBoolean ModernAsyncTask.access$100(ModernAsyncTask)>
	//   49   80:iconst_1        
	//   50   81:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		obj = obj1;
	//   51   84:aload_2         
	//   52   85:astore_1        
		throw obj2;
	//   53   86:aload_3         
	//   54   87:athrow          
		postResult(obj);
	//   55   88:aload_0         
	//   56   89:getfield        #15  <Field ModernAsyncTask this$0>
	//   57   92:aload_1         
	//   58   93:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
	//   59   96:pop             
		throw obj1;
	//   60   97:aload_2         
	//   61   98:athrow          
	}

	final ModernAsyncTask this$0;

	ModernAsyncTask$2()
	{
		this$0 = ModernAsyncTask.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ModernAsyncTask this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void ModernAsyncTask$WorkerRunnable()>
	//    5    9:return          
	}
}
