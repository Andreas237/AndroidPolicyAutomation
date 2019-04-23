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
		mTaskInvoked.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ModernAsyncTask this$0>
	//    2    4:getfield        #27  <Field AtomicBoolean ModernAsyncTask.mTaskInvoked>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		obj3 = null;
	//    5   11:aconst_null     
	//    6   12:astore          4
		obj2 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
		obj = obj2;
	//    9   16:aload_3         
	//   10   17:astore_1        
		obj1 = ((Object) (obj3));
	//   11   18:aload           4
	//   12   20:astore_2        
		Process.setThreadPriority(10);
	//   13   21:bipush          10
	//   14   23:invokestatic    #39  <Method void Process.setThreadPriority(int)>
		obj = obj2;
	//   15   26:aload_3         
	//   16   27:astore_1        
		obj1 = ((Object) (obj3));
	//   17   28:aload           4
	//   18   30:astore_2        
		obj2 = doInBackground(mParams);
	//   19   31:aload_0         
	//   20   32:getfield        #15  <Field ModernAsyncTask this$0>
	//   21   35:aload_0         
	//   22   36:getfield        #43  <Field Object[] mParams>
	//   23   39:invokevirtual   #47  <Method Object ModernAsyncTask.doInBackground(Object[])>
	//   24   42:astore_3        
		obj = obj2;
	//   25   43:aload_3         
	//   26   44:astore_1        
		obj1 = obj2;
	//   27   45:aload_3         
	//   28   46:astore_2        
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
		obj1;
	//   37   61:astore_2        
		break MISSING_BLOCK_LABEL_83;
	//   38   62:goto            83
		Throwable throwable;
		throwable;
	//   39   65:astore_3        
		obj = obj1;
	//   40   66:aload_2         
	//   41   67:astore_1        
		mCancelled.set(true);
	//   42   68:aload_0         
	//   43   69:getfield        #15  <Field ModernAsyncTask this$0>
	//   44   72:getfield        #59  <Field AtomicBoolean ModernAsyncTask.mCancelled>
	//   45   75:iconst_1        
	//   46   76:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		obj = obj1;
	//   47   79:aload_2         
	//   48   80:astore_1        
		throw throwable;
	//   49   81:aload_3         
	//   50   82:athrow          
		postResult(obj);
	//   51   83:aload_0         
	//   52   84:getfield        #15  <Field ModernAsyncTask this$0>
	//   53   87:aload_1         
	//   54   88:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
	//   55   91:pop             
		throw obj1;
	//   56   92:aload_2         
	//   57   93:athrow          
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
