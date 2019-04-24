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
		Object obj3;
		ModernAsyncTask.access$000(ModernAsyncTask.this).set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ModernAsyncTask this$0>
	//    2    4:invokestatic    #27  <Method AtomicBoolean ModernAsyncTask.access$000(ModernAsyncTask)>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		obj3 = null;
	//    5   11:aconst_null     
	//    6   12:astore          4
		obj2 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
		obj1 = obj2;
	//    9   16:aload_3         
	//   10   17:astore_2        
		obj = ((Object) (obj3));
	//   11   18:aload           4
	//   12   20:astore_1        
		Process.setThreadPriority(10);
	//   13   21:bipush          10
	//   14   23:invokestatic    #39  <Method void Process.setThreadPriority(int)>
		obj1 = obj2;
	//   15   26:aload_3         
	//   16   27:astore_2        
		obj = ((Object) (obj3));
	//   17   28:aload           4
	//   18   30:astore_1        
		obj2 = doInBackground(mParams);
	//   19   31:aload_0         
	//   20   32:getfield        #15  <Field ModernAsyncTask this$0>
	//   21   35:aload_0         
	//   22   36:getfield        #43  <Field Object[] mParams>
	//   23   39:invokevirtual   #47  <Method Object ModernAsyncTask.doInBackground(Object[])>
	//   24   42:astore_3        
		obj1 = obj2;
	//   25   43:aload_3         
	//   26   44:astore_2        
		obj = obj2;
	//   27   45:aload_3         
	//   28   46:astore_1        
		Binder.flushPendingCommands();
	//   29   47:invokestatic    #52  <Method void Binder.flushPendingCommands()>
		postResult(obj2);
	//   30   50:aload_0         
	//   31   51:getfield        #15  <Field ModernAsyncTask this$0>
	//   32   54:aload_3         
	//   33   55:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
	//   34   58:pop             
		return obj2;
	//   35   59:aload_3         
	//   36   60:areturn         
		Throwable throwable;
		throwable;
	//   37   61:astore_3        
		obj = obj1;
	//   38   62:aload_2         
	//   39   63:astore_1        
		ModernAsyncTask.access$100(ModernAsyncTask.this).set(true);
	//   40   64:aload_0         
	//   41   65:getfield        #15  <Field ModernAsyncTask this$0>
	//   42   68:invokestatic    #59  <Method AtomicBoolean ModernAsyncTask.access$100(ModernAsyncTask)>
	//   43   71:iconst_1        
	//   44   72:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		obj = obj1;
	//   45   75:aload_2         
	//   46   76:astore_1        
		throw throwable;
	//   47   77:aload_3         
	//   48   78:athrow          
		Exception exception;
		exception;
	//   49   79:astore_2        
		postResult(obj);
	//   50   80:aload_0         
	//   51   81:getfield        #15  <Field ModernAsyncTask this$0>
	//   52   84:aload_1         
	//   53   85:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
	//   54   88:pop             
		throw exception;
	//   55   89:aload_2         
	//   56   90:athrow          
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
