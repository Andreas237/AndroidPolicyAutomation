// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.os.*;
import android.util.Log;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class Loader
{
	public static interface Callback
	{

		public abstract void onLoadCanceled(Loadable loadable);

		public abstract void onLoadCompleted(Loadable loadable);

		public abstract void onLoadError(Loadable loadable, IOException ioexception);
	}

	private final class LoadTask extends Handler
		implements Runnable
	{

		private void onFinished()
		{
			loading = false;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Loader this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #41  <Method boolean Loader.access$002(Loader, boolean)>
		//    4    8:pop             
			currentTask = null;
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field Loader this$0>
		//    7   13:aconst_null     
		//    8   14:invokestatic    #45  <Method Loader$LoadTask Loader.access$102(Loader, Loader$LoadTask)>
		//    9   17:pop             
		//   10   18:return          
		}

		public void handleMessage(Message message)
		{
			if(message.what != 2)
		//*   0    0:aload_1         
		//*   1    1:getfield        #53  <Field int Message.what>
		//*   2    4:iconst_2        
		//*   3    5:icmpeq          100
			{
				onFinished();
		//    4    8:aload_0         
		//    5    9:invokespecial   #55  <Method void onFinished()>
				if(loadable.isLoadCanceled())
		//*   6   12:aload_0         
		//*   7   13:getfield        #32  <Field Loader$Loadable loadable>
		//*   8   16:invokeinterface #61  <Method boolean Loader$Loadable.isLoadCanceled()>
		//*   9   21:ifeq            38
				{
					callback.onLoadCanceled(loadable);
		//   10   24:aload_0         
		//   11   25:getfield        #34  <Field Loader$Callback callback>
		//   12   28:aload_0         
		//   13   29:getfield        #32  <Field Loader$Loadable loadable>
		//   14   32:invokeinterface #67  <Method void Loader$Callback.onLoadCanceled(Loader$Loadable)>
					return;
		//   15   37:return          
				}
				switch(message.what)
		//*  16   38:aload_1         
		//*  17   39:getfield        #53  <Field int Message.what>
				{
		//*  18   42:tableswitch     0 1: default 64
		//		               0 86
		//		               1 65
				default:
					return;
		//   19   64:return          

				case 1: // '\001'
					callback.onLoadError(loadable, (IOException)message.obj);
		//   20   65:aload_0         
		//   21   66:getfield        #34  <Field Loader$Callback callback>
		//   22   69:aload_0         
		//   23   70:getfield        #32  <Field Loader$Loadable loadable>
		//   24   73:aload_1         
		//   25   74:getfield        #71  <Field Object Message.obj>
		//   26   77:checkcast       #73  <Class IOException>
		//   27   80:invokeinterface #77  <Method void Loader$Callback.onLoadError(Loader$Loadable, IOException)>
					return;
		//   28   85:return          

				case 0: // '\0'
					callback.onLoadCompleted(loadable);
		//   29   86:aload_0         
		//   30   87:getfield        #34  <Field Loader$Callback callback>
		//   31   90:aload_0         
		//   32   91:getfield        #32  <Field Loader$Loadable loadable>
		//   33   94:invokeinterface #80  <Method void Loader$Callback.onLoadCompleted(Loader$Loadable)>
					return;
		//   34   99:return          
				}
			} else
			{
				throw (Error)message.obj;
		//   35  100:aload_1         
		//   36  101:getfield        #71  <Field Object Message.obj>
		//   37  104:checkcast       #82  <Class Error>
		//   38  107:athrow          
			}
		}

		public void quit()
		{
			loadable.cancelLoad();
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field Loader$Loadable loadable>
		//    2    4:invokeinterface #86  <Method void Loader$Loadable.cancelLoad()>
			if(executorThread != null)
		//*   3    9:aload_0         
		//*   4   10:getfield        #88  <Field Thread executorThread>
		//*   5   13:ifnull          23
				executorThread.interrupt();
		//    6   16:aload_0         
		//    7   17:getfield        #88  <Field Thread executorThread>
		//    8   20:invokevirtual   #93  <Method void Thread.interrupt()>
		//    9   23:return          
		}

		public void run()
		{
			InterruptedException interruptedexception;
			try
			{
				executorThread = Thread.currentThread();
		//    0    0:aload_0         
		//    1    1:invokestatic    #102 <Method Thread Thread.currentThread()>
		//    2    4:putfield        #88  <Field Thread executorThread>
				if(!loadable.isLoadCanceled())
		//*   3    7:aload_0         
		//*   4    8:getfield        #32  <Field Loader$Loadable loadable>
		//*   5   11:invokeinterface #61  <Method boolean Loader$Loadable.isLoadCanceled()>
		//*   6   16:ifne            68
				{
					StringBuilder stringbuilder = new StringBuilder();
		//    7   19:new             #104 <Class StringBuilder>
		//    8   22:dup             
		//    9   23:invokespecial   #106 <Method void StringBuilder()>
		//   10   26:astore_1        
					stringbuilder.append(((Object) (loadable)).getClass().getSimpleName());
		//   11   27:aload_1         
		//   12   28:aload_0         
		//   13   29:getfield        #32  <Field Loader$Loadable loadable>
		//   14   32:invokevirtual   #112 <Method Class Object.getClass()>
		//   15   35:invokevirtual   #118 <Method String Class.getSimpleName()>
		//   16   38:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   17   41:pop             
					stringbuilder.append(".load()");
		//   18   42:aload_1         
		//   19   43:ldc1            #124 <String ".load()">
		//   20   45:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
		//   21   48:pop             
					TraceUtil.beginSection(stringbuilder.toString());
		//   22   49:aload_1         
		//   23   50:invokevirtual   #127 <Method String StringBuilder.toString()>
		//   24   53:invokestatic    #133 <Method void TraceUtil.beginSection(String)>
					loadable.load();
		//   25   56:aload_0         
		//   26   57:getfield        #32  <Field Loader$Loadable loadable>
		//   27   60:invokeinterface #136 <Method void Loader$Loadable.load()>
					TraceUtil.endSection();
		//   28   65:invokestatic    #139 <Method void TraceUtil.endSection()>
				}
				sendEmptyMessage(0);
		//   29   68:aload_0         
		//   30   69:iconst_0        
		//   31   70:invokevirtual   #143 <Method boolean sendEmptyMessage(int)>
		//   32   73:pop             
				return;
		//   33   74:return          
			}
		//*  34   75:astore_1        
		//*  35   76:ldc1            #15  <String "LoadTask">
		//*  36   78:ldc1            #145 <String "Unexpected error loading stream">
		//*  37   80:aload_1         
		//*  38   81:invokestatic    #151 <Method int Log.e(String, String, Throwable)>
		//*  39   84:pop             
		//*  40   85:aload_0         
		//*  41   86:iconst_2        
		//*  42   87:aload_1         
		//*  43   88:invokevirtual   #155 <Method Message obtainMessage(int, Object)>
		//*  44   91:invokevirtual   #158 <Method void Message.sendToTarget()>
		//*  45   94:aload_1         
		//*  46   95:athrow          
		//*  47   96:astore_1        
		//*  48   97:ldc1            #15  <String "LoadTask">
		//*  49   99:ldc1            #160 <String "Unexpected exception loading stream">
		//*  50  101:aload_1         
		//*  51  102:invokestatic    #151 <Method int Log.e(String, String, Throwable)>
		//*  52  105:pop             
		//*  53  106:aload_0         
		//*  54  107:iconst_1        
		//*  55  108:new             #162 <Class Loader$UnexpectedLoaderException>
		//*  56  111:dup             
		//*  57  112:aload_1         
		//*  58  113:invokespecial   #165 <Method void Loader$UnexpectedLoaderException(Exception)>
		//*  59  116:invokevirtual   #155 <Method Message obtainMessage(int, Object)>
		//*  60  119:invokevirtual   #158 <Method void Message.sendToTarget()>
		//*  61  122:return          
		//*  62  123:aload_0         
		//*  63  124:getfield        #32  <Field Loader$Loadable loadable>
		//*  64  127:invokeinterface #61  <Method boolean Loader$Loadable.isLoadCanceled()>
		//*  65  132:invokestatic    #171 <Method void Assertions.checkState(boolean)>
		//*  66  135:aload_0         
		//*  67  136:iconst_0        
		//*  68  137:invokevirtual   #143 <Method boolean sendEmptyMessage(int)>
		//*  69  140:pop             
		//*  70  141:return          
			catch(IOException ioexception)
		//*  71  142:astore_1        
			{
				obtainMessage(1, ((Object) (ioexception))).sendToTarget();
		//   72  143:aload_0         
		//   73  144:iconst_1        
		//   74  145:aload_1         
		//   75  146:invokevirtual   #155 <Method Message obtainMessage(int, Object)>
		//   76  149:invokevirtual   #158 <Method void Message.sendToTarget()>
			}
		//*  77  152:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Assertions.checkState(loadable.isLoadCanceled());
				sendEmptyMessage(0);
				return;
			}
			catch(Exception exception)
			{
				Log.e("LoadTask", "Unexpected exception loading stream", ((Throwable) (exception)));
				obtainMessage(1, ((Object) (new UnexpectedLoaderException(exception)))).sendToTarget();
				return;
			}
			catch(Error error)
			{
				Log.e("LoadTask", "Unexpected error loading stream", ((Throwable) (error)));
				obtainMessage(2, ((Object) (error))).sendToTarget();
				throw error;
			}
		//*  78  153:astore_1        
		//*  79  154:goto            123
		}

		private static final String TAG = "LoadTask";
		private final Callback callback;
		private volatile Thread executorThread;
		private final Loadable loadable;
		final Loader this$0;

		public LoadTask(Looper looper, Loadable loadable1, Callback callback1)
		{
			this$0 = Loader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field Loader this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #30  <Method void Handler(Looper)>
			loadable = loadable1;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #32  <Field Loader$Loadable loadable>
			callback = callback1;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #34  <Field Loader$Callback callback>
		//   12   21:return          
		}
	}

	public static interface Loadable
	{

		public abstract void cancelLoad();

		public abstract boolean isLoadCanceled();

		public abstract void load()
			throws IOException, InterruptedException;
	}

	public static final class UnexpectedLoaderException extends IOException
	{

		public UnexpectedLoaderException(Exception exception)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #11  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Unexpected ");
		//    4    8:aload_2         
		//    5    9:ldc1            #16  <String "Unexpected ">
		//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (exception)).getClass().getSimpleName());
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #26  <Method Class Object.getClass()>
		//   11   20:invokevirtual   #32  <Method String Class.getSimpleName()>
		//   12   23:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(": ");
		//   14   27:aload_2         
		//   15   28:ldc1            #34  <String ": ">
		//   16   30:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(exception.getMessage());
		//   18   34:aload_2         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #39  <Method String Exception.getMessage()>
		//   21   39:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   22   42:pop             
			super(stringbuilder.toString(), ((Throwable) (exception)));
		//   23   43:aload_0         
		//   24   44:aload_2         
		//   25   45:invokevirtual   #42  <Method String StringBuilder.toString()>
		//   26   48:aload_1         
		//   27   49:invokespecial   #45  <Method void IOException(String, Throwable)>
		//   28   52:return          
		}
	}


	public Loader(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		downloadExecutorService = Util.newSingleThreadExecutor(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #40  <Method ExecutorService Util.newSingleThreadExecutor(String)>
	//    5    9:putfield        #42  <Field ExecutorService downloadExecutorService>
	//    6   12:return          
	}

	public void cancelLoading()
	{
		Assertions.checkState(loading);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean loading>
	//    2    4:invokestatic    #58  <Method void Assertions.checkState(boolean)>
		currentTask.quit();
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field Loader$LoadTask currentTask>
	//    5   11:invokevirtual   #61  <Method void Loader$LoadTask.quit()>
	//    6   14:return          
	}

	public boolean isLoading()
	{
		return loading;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean loading>
	//    2    4:ireturn         
	}

	public void release()
	{
		release(((Runnable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #67  <Method void release(Runnable)>
	//    3    5:return          
	}

	public void release(Runnable runnable)
	{
		if(loading)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean loading>
	//*   2    4:ifeq            11
			cancelLoading();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #69  <Method void cancelLoading()>
		if(runnable != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
			downloadExecutorService.submit(runnable);
	//    7   15:aload_0         
	//    8   16:getfield        #42  <Field ExecutorService downloadExecutorService>
	//    9   19:aload_1         
	//   10   20:invokeinterface #75  <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   11   25:pop             
		downloadExecutorService.shutdown();
	//   12   26:aload_0         
	//   13   27:getfield        #42  <Field ExecutorService downloadExecutorService>
	//   14   30:invokeinterface #78  <Method void ExecutorService.shutdown()>
	//   15   35:return          
	}

	public void startLoading(Looper looper, Loadable loadable, Callback callback)
	{
		Assertions.checkState(loading ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean loading>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #58  <Method void Assertions.checkState(boolean)>
		loading = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #47  <Field boolean loading>
		currentTask = new LoadTask(looper, loadable, callback);
	//    8   14:aload_0         
	//    9   15:new             #9   <Class Loader$LoadTask>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:aload_3         
	//   15   23:invokespecial   #83  <Method void Loader$LoadTask(Loader, Looper, Loader$Loadable, Loader$Callback)>
	//   16   26:putfield        #51  <Field Loader$LoadTask currentTask>
		downloadExecutorService.submit(((Runnable) (currentTask)));
	//   17   29:aload_0         
	//   18   30:getfield        #42  <Field ExecutorService downloadExecutorService>
	//   19   33:aload_0         
	//   20   34:getfield        #51  <Field Loader$LoadTask currentTask>
	//   21   37:invokeinterface #75  <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   22   42:pop             
	//   23   43:return          
	}

	public void startLoading(Loadable loadable, Callback callback)
	{
		Looper looper = Looper.myLooper();
	//    0    0:invokestatic    #90  <Method Looper Looper.myLooper()>
	//    1    3:astore          4
		boolean flag;
		if(looper != null)
	//*   2    5:aload           4
	//*   3    7:ifnull          15
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_3        
		else
	//*   6   12:goto            17
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		Assertions.checkState(flag);
	//    9   17:iload_3         
	//   10   18:invokestatic    #58  <Method void Assertions.checkState(boolean)>
		startLoading(looper, loadable, callback);
	//   11   21:aload_0         
	//   12   22:aload           4
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #92  <Method void startLoading(Looper, Loader$Loadable, Loader$Callback)>
	//   16   29:return          
	}

	private static final int MSG_END_OF_SOURCE = 0;
	private static final int MSG_FATAL_ERROR = 2;
	private static final int MSG_IO_EXCEPTION = 1;
	private LoadTask currentTask;
	private final ExecutorService downloadExecutorService;
	private boolean loading;


/*
	static boolean access$002(Loader loader, boolean flag)
	{
		loader.loading = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field boolean loading>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static LoadTask access$102(Loader loader, LoadTask loadtask)
	{
		loader.currentTask = loadtask;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Loader$LoadTask currentTask>
		return loadtask;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
