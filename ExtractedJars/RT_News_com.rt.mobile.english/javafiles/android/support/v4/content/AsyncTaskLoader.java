// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.os.OperationCanceledException;
import android.support.v4.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

// Referenced classes of package android.support.v4.content:
//			Loader, ModernAsyncTask

public abstract class AsyncTaskLoader extends Loader
{
	final class LoadTask extends ModernAsyncTask
		implements Runnable
	{

		protected volatile Object doInBackground(Object aobj[])
		{
			return doInBackground((Void[])aobj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class Void[]>
		//    3    5:invokevirtual   #38  <Method Object doInBackground(Void[])>
		//    4    8:areturn         
		}

		protected transient Object doInBackground(Void avoid[])
		{
			try
			{
				avoid = ((Void []) (onLoadInBackground()));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
		//    2    4:invokevirtual   #44  <Method Object AsyncTaskLoader.onLoadInBackground()>
		//    3    7:astore_1        
			}
		//*   4    8:aload_1         
		//*   5    9:areturn         
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
		//*   6   10:astore_1        
			{
				if(!isCancelled())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #48  <Method boolean isCancelled()>
		//*   9   15:ifne            20
					throw avoid;
		//   10   18:aload_1         
		//   11   19:athrow          
				else
					return ((Object) (null));
		//   12   20:aconst_null     
		//   13   21:areturn         
			}
			return ((Object) (avoid));
		}

		protected void onCancelled(Object obj)
		{
			dispatchOnCancelled(this, obj);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #56  <Method void AsyncTaskLoader.dispatchOnCancelled(AsyncTaskLoader$LoadTask, Object)>
			mDone.countDown();
		//    5    9:aload_0         
		//    6   10:getfield        #30  <Field CountDownLatch mDone>
		//    7   13:invokevirtual   #59  <Method void CountDownLatch.countDown()>
			return;
		//    8   16:return          
			obj;
		//    9   17:astore_1        
			mDone.countDown();
		//   10   18:aload_0         
		//   11   19:getfield        #30  <Field CountDownLatch mDone>
		//   12   22:invokevirtual   #59  <Method void CountDownLatch.countDown()>
			throw obj;
		//   13   25:aload_1         
		//   14   26:athrow          
		}

		protected void onPostExecute(Object obj)
		{
			dispatchOnLoadComplete(this, obj);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field AsyncTaskLoader this$0>
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #64  <Method void AsyncTaskLoader.dispatchOnLoadComplete(AsyncTaskLoader$LoadTask, Object)>
			mDone.countDown();
		//    5    9:aload_0         
		//    6   10:getfield        #30  <Field CountDownLatch mDone>
		//    7   13:invokevirtual   #59  <Method void CountDownLatch.countDown()>
			return;
		//    8   16:return          
			obj;
		//    9   17:astore_1        
			mDone.countDown();
		//   10   18:aload_0         
		//   11   19:getfield        #30  <Field CountDownLatch mDone>
		//   12   22:invokevirtual   #59  <Method void CountDownLatch.countDown()>
			throw obj;
		//   13   25:aload_1         
		//   14   26:athrow          
		}

		public void run()
		{
			waiting = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #67  <Field boolean waiting>
			executePendingTask();
		//    3    5:aload_0         
		//    4    6:getfield        #20  <Field AsyncTaskLoader this$0>
		//    5    9:invokevirtual   #70  <Method void AsyncTaskLoader.executePendingTask()>
		//    6   12:return          
		}

		public void waitForLoader()
		{
			try
			{
				mDone.await();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field CountDownLatch mDone>
		//    2    4:invokevirtual   #76  <Method void CountDownLatch.await()>
				return;
		//    3    7:return          
			}
			catch(InterruptedException interruptedexception)
		//*   4    8:astore_1        
			{
				return;
		//    5    9:return          
			}
		}

		private final CountDownLatch mDone = new CountDownLatch(1);
		final AsyncTaskLoader this$0;
		boolean waiting;

		LoadTask()
		{
			this$0 = AsyncTaskLoader.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field AsyncTaskLoader this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void ModernAsyncTask()>
		//    5    9:aload_0         
		//    6   10:new             #25  <Class CountDownLatch>
		//    7   13:dup             
		//    8   14:iconst_1        
		//    9   15:invokespecial   #28  <Method void CountDownLatch(int)>
		//   10   18:putfield        #30  <Field CountDownLatch mDone>
		//   11   21:return          
		}
	}


	public AsyncTaskLoader(Context context)
	{
		this(context, ModernAsyncTask.THREAD_POOL_EXECUTOR);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #34  <Field Executor ModernAsyncTask.THREAD_POOL_EXECUTOR>
	//    3    5:invokespecial   #37  <Method void AsyncTaskLoader(Context, Executor)>
	//    4    8:return          
	}

	private AsyncTaskLoader(Context context, Executor executor)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void Loader(Context)>
		mLastLoadCompleteTime = -10000L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #42  <Long -10000L>
	//    5    9:putfield        #45  <Field long mLastLoadCompleteTime>
		mExecutor = executor;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #47  <Field Executor mExecutor>
	//    9   17:return          
	}

	public void cancelLoadInBackground()
	{
	//    0    0:return          
	}

	void dispatchOnCancelled(LoadTask loadtask, Object obj)
	{
		onCanceled(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #55  <Method void onCanceled(Object)>
		if(mCancellingTask == loadtask)
	//*   3    5:aload_0         
	//*   4    6:getfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
	//*   5    9:aload_1         
	//*   6   10:if_acmpne       37
		{
			rollbackContentChanged();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #60  <Method void rollbackContentChanged()>
			mLastLoadCompleteTime = SystemClock.uptimeMillis();
	//    9   17:aload_0         
	//   10   18:invokestatic    #66  <Method long SystemClock.uptimeMillis()>
	//   11   21:putfield        #45  <Field long mLastLoadCompleteTime>
			mCancellingTask = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
			deliverCancellation();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #69  <Method void deliverCancellation()>
			executePendingTask();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #72  <Method void executePendingTask()>
		}
	//   19   37:return          
	}

	void dispatchOnLoadComplete(LoadTask loadtask, Object obj)
	{
		if(mTask != loadtask)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       15
		{
			dispatchOnCancelled(loadtask, obj);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #79  <Method void dispatchOnCancelled(AsyncTaskLoader$LoadTask, Object)>
			return;
	//    8   14:return          
		}
		if(isAbandoned())
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #83  <Method boolean isAbandoned()>
	//*  11   19:ifeq            28
		{
			onCanceled(obj);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #55  <Method void onCanceled(Object)>
			return;
	//   15   27:return          
		} else
		{
			commitContentChanged();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #86  <Method void commitContentChanged()>
			mLastLoadCompleteTime = SystemClock.uptimeMillis();
	//   18   32:aload_0         
	//   19   33:invokestatic    #66  <Method long SystemClock.uptimeMillis()>
	//   20   36:putfield        #45  <Field long mLastLoadCompleteTime>
			mTask = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
			deliverResult(obj);
	//   24   44:aload_0         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #89  <Method void deliverResult(Object)>
			return;
	//   27   49:return          
		}
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #93  <Method void Loader.dump(String, FileDescriptor, PrintWriter, String[])>
		if(mTask != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//*   8   13:ifnull          52
		{
			printwriter.print(s);
	//    9   16:aload_3         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #99  <Method void PrintWriter.print(String)>
			printwriter.print("mTask=");
	//   12   21:aload_3         
	//   13   22:ldc1            #101 <String "mTask=">
	//   14   24:invokevirtual   #99  <Method void PrintWriter.print(String)>
			printwriter.print(((Object) (mTask)));
	//   15   27:aload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   18   32:invokevirtual   #103 <Method void PrintWriter.print(Object)>
			printwriter.print(" waiting=");
	//   19   35:aload_3         
	//   20   36:ldc1            #105 <String " waiting=">
	//   21   38:invokevirtual   #99  <Method void PrintWriter.print(String)>
			printwriter.println(mTask.waiting);
	//   22   41:aload_3         
	//   23   42:aload_0         
	//   24   43:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   25   46:getfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
	//   26   49:invokevirtual   #112 <Method void PrintWriter.println(boolean)>
		}
		if(mCancellingTask != null)
	//*  27   52:aload_0         
	//*  28   53:getfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
	//*  29   56:ifnull          95
		{
			printwriter.print(s);
	//   30   59:aload_3         
	//   31   60:aload_1         
	//   32   61:invokevirtual   #99  <Method void PrintWriter.print(String)>
			printwriter.print("mCancellingTask=");
	//   33   64:aload_3         
	//   34   65:ldc1            #114 <String "mCancellingTask=">
	//   35   67:invokevirtual   #99  <Method void PrintWriter.print(String)>
			printwriter.print(((Object) (mCancellingTask)));
	//   36   70:aload_3         
	//   37   71:aload_0         
	//   38   72:getfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
	//   39   75:invokevirtual   #103 <Method void PrintWriter.print(Object)>
			printwriter.print(" waiting=");
	//   40   78:aload_3         
	//   41   79:ldc1            #105 <String " waiting=">
	//   42   81:invokevirtual   #99  <Method void PrintWriter.print(String)>
			printwriter.println(mCancellingTask.waiting);
	//   43   84:aload_3         
	//   44   85:aload_0         
	//   45   86:getfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
	//   46   89:getfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
	//   47   92:invokevirtual   #112 <Method void PrintWriter.println(boolean)>
		}
		if(mUpdateThrottle != 0L)
	//*  48   95:aload_0         
	//*  49   96:getfield        #116 <Field long mUpdateThrottle>
	//*  50   99:lconst_0        
	//*  51  100:lcmp            
	//*  52  101:ifeq            144
		{
			printwriter.print(s);
	//   53  104:aload_3         
	//   54  105:aload_1         
	//   55  106:invokevirtual   #99  <Method void PrintWriter.print(String)>
			printwriter.print("mUpdateThrottle=");
	//   56  109:aload_3         
	//   57  110:ldc1            #118 <String "mUpdateThrottle=">
	//   58  112:invokevirtual   #99  <Method void PrintWriter.print(String)>
			TimeUtils.formatDuration(mUpdateThrottle, printwriter);
	//   59  115:aload_0         
	//   60  116:getfield        #116 <Field long mUpdateThrottle>
	//   61  119:aload_3         
	//   62  120:invokestatic    #124 <Method void TimeUtils.formatDuration(long, PrintWriter)>
			printwriter.print(" mLastLoadCompleteTime=");
	//   63  123:aload_3         
	//   64  124:ldc1            #126 <String " mLastLoadCompleteTime=">
	//   65  126:invokevirtual   #99  <Method void PrintWriter.print(String)>
			TimeUtils.formatDuration(mLastLoadCompleteTime, SystemClock.uptimeMillis(), printwriter);
	//   66  129:aload_0         
	//   67  130:getfield        #45  <Field long mLastLoadCompleteTime>
	//   68  133:invokestatic    #66  <Method long SystemClock.uptimeMillis()>
	//   69  136:aload_3         
	//   70  137:invokestatic    #129 <Method void TimeUtils.formatDuration(long, long, PrintWriter)>
			printwriter.println();
	//   71  140:aload_3         
	//   72  141:invokevirtual   #131 <Method void PrintWriter.println()>
		}
	//   73  144:return          
	}

	void executePendingTask()
	{
		if(mCancellingTask == null && mTask != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
	//*   2    4:ifnonnull       114
	//*   3    7:aload_0         
	//*   4    8:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//*   5   11:ifnull          114
		{
			if(mTask.waiting)
	//*   6   14:aload_0         
	//*   7   15:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//*   8   18:getfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
	//*   9   21:ifeq            43
			{
				mTask.waiting = false;
	//   10   24:aload_0         
	//   11   25:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   12   28:iconst_0        
	//   13   29:putfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
				mHandler.removeCallbacks(((Runnable) (mTask)));
	//   14   32:aload_0         
	//   15   33:getfield        #133 <Field Handler mHandler>
	//   16   36:aload_0         
	//   17   37:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   18   40:invokevirtual   #139 <Method void Handler.removeCallbacks(Runnable)>
			}
			if(mUpdateThrottle > 0L && SystemClock.uptimeMillis() < mLastLoadCompleteTime + mUpdateThrottle)
	//*  19   43:aload_0         
	//*  20   44:getfield        #116 <Field long mUpdateThrottle>
	//*  21   47:lconst_0        
	//*  22   48:lcmp            
	//*  23   49:ifle            98
	//*  24   52:invokestatic    #66  <Method long SystemClock.uptimeMillis()>
	//*  25   55:aload_0         
	//*  26   56:getfield        #45  <Field long mLastLoadCompleteTime>
	//*  27   59:aload_0         
	//*  28   60:getfield        #116 <Field long mUpdateThrottle>
	//*  29   63:ladd            
	//*  30   64:lcmp            
	//*  31   65:ifge            98
			{
				mTask.waiting = true;
	//   32   68:aload_0         
	//   33   69:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   34   72:iconst_1        
	//   35   73:putfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
				mHandler.postAtTime(((Runnable) (mTask)), mLastLoadCompleteTime + mUpdateThrottle);
	//   36   76:aload_0         
	//   37   77:getfield        #133 <Field Handler mHandler>
	//   38   80:aload_0         
	//   39   81:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   40   84:aload_0         
	//   41   85:getfield        #45  <Field long mLastLoadCompleteTime>
	//   42   88:aload_0         
	//   43   89:getfield        #116 <Field long mUpdateThrottle>
	//   44   92:ladd            
	//   45   93:invokevirtual   #143 <Method boolean Handler.postAtTime(Runnable, long)>
	//   46   96:pop             
				return;
	//   47   97:return          
			}
			mTask.executeOnExecutor(mExecutor, ((Object []) ((Void[])null)));
	//   48   98:aload_0         
	//   49   99:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   50  102:aload_0         
	//   51  103:getfield        #47  <Field Executor mExecutor>
	//   52  106:aconst_null     
	//   53  107:checkcast       #145 <Class Void[]>
	//   54  110:invokevirtual   #149 <Method ModernAsyncTask AsyncTaskLoader$LoadTask.executeOnExecutor(Executor, Object[])>
	//   55  113:pop             
		}
	//   56  114:return          
	}

	public boolean isLoadInBackgroundCanceled()
	{
		return mCancellingTask != null;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract Object loadInBackground();

	protected boolean onCancelLoad()
	{
		if(mTask != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//*   2    4:ifnull          130
		{
			if(!mStarted)
	//*   3    7:aload_0         
	//*   4    8:getfield        #157 <Field boolean mStarted>
	//*   5   11:ifne            19
				mContentChanged = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #160 <Field boolean mContentChanged>
			if(mCancellingTask != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
	//*  11   23:ifnull          62
			{
				if(mTask.waiting)
	//*  12   26:aload_0         
	//*  13   27:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//*  14   30:getfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
	//*  15   33:ifeq            55
				{
					mTask.waiting = false;
	//   16   36:aload_0         
	//   17   37:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   18   40:iconst_0        
	//   19   41:putfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
					mHandler.removeCallbacks(((Runnable) (mTask)));
	//   20   44:aload_0         
	//   21   45:getfield        #133 <Field Handler mHandler>
	//   22   48:aload_0         
	//   23   49:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   24   52:invokevirtual   #139 <Method void Handler.removeCallbacks(Runnable)>
				}
				mTask = null;
	//   25   55:aload_0         
	//   26   56:aconst_null     
	//   27   57:putfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
				return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
			}
			if(mTask.waiting)
	//*  30   62:aload_0         
	//*  31   63:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//*  32   66:getfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
	//*  33   69:ifeq            98
			{
				mTask.waiting = false;
	//   34   72:aload_0         
	//   35   73:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   36   76:iconst_0        
	//   37   77:putfield        #108 <Field boolean AsyncTaskLoader$LoadTask.waiting>
				mHandler.removeCallbacks(((Runnable) (mTask)));
	//   38   80:aload_0         
	//   39   81:getfield        #133 <Field Handler mHandler>
	//   40   84:aload_0         
	//   41   85:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   42   88:invokevirtual   #139 <Method void Handler.removeCallbacks(Runnable)>
				mTask = null;
	//   43   91:aload_0         
	//   44   92:aconst_null     
	//   45   93:putfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
				return false;
	//   46   96:iconst_0        
	//   47   97:ireturn         
			}
			boolean flag = mTask.cancel(false);
	//   48   98:aload_0         
	//   49   99:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   50  102:iconst_0        
	//   51  103:invokevirtual   #164 <Method boolean AsyncTaskLoader$LoadTask.cancel(boolean)>
	//   52  106:istore_1        
			if(flag)
	//*  53  107:iload_1         
	//*  54  108:ifeq            123
			{
				mCancellingTask = mTask;
	//   55  111:aload_0         
	//   56  112:aload_0         
	//   57  113:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//   58  116:putfield        #57  <Field AsyncTaskLoader$LoadTask mCancellingTask>
				cancelLoadInBackground();
	//   59  119:aload_0         
	//   60  120:invokevirtual   #166 <Method void cancelLoadInBackground()>
			}
			mTask = null;
	//   61  123:aload_0         
	//   62  124:aconst_null     
	//   63  125:putfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
			return flag;
	//   64  128:iload_1         
	//   65  129:ireturn         
		} else
		{
			return false;
	//   66  130:iconst_0        
	//   67  131:ireturn         
		}
	}

	public void onCanceled(Object obj)
	{
	//    0    0:return          
	}

	protected void onForceLoad()
	{
		super.onForceLoad();
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method void Loader.onForceLoad()>
		cancelLoad();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #173 <Method boolean cancelLoad()>
	//    4    8:pop             
		mTask = new LoadTask();
	//    5    9:aload_0         
	//    6   10:new             #7   <Class AsyncTaskLoader$LoadTask>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #176 <Method void AsyncTaskLoader$LoadTask(AsyncTaskLoader)>
	//   10   18:putfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
		executePendingTask();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #72  <Method void executePendingTask()>
	//   13   25:return          
	}

	protected Object onLoadInBackground()
	{
		return loadInBackground();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #179 <Method Object loadInBackground()>
	//    2    4:areturn         
	}

	public void setUpdateThrottle(long l)
	{
		mUpdateThrottle = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #116 <Field long mUpdateThrottle>
		if(l != 0L)
	//*   3    5:lload_1         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifeq            22
			mHandler = new Handler();
	//    7   11:aload_0         
	//    8   12:new             #135 <Class Handler>
	//    9   15:dup             
	//   10   16:invokespecial   #185 <Method void Handler()>
	//   11   19:putfield        #133 <Field Handler mHandler>
	//   12   22:return          
	}

	public void waitForLoader()
	{
		LoadTask loadtask = mTask;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field AsyncTaskLoader$LoadTask mTask>
	//    2    4:astore_1        
		if(loadtask != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			loadtask.waitForLoader();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #192 <Method void AsyncTaskLoader$LoadTask.waitForLoader()>
	//    7   13:return          
	}

	static final boolean DEBUG = false;
	static final String TAG = "AsyncTaskLoader";
	volatile LoadTask mCancellingTask;
	private final Executor mExecutor;
	Handler mHandler;
	long mLastLoadCompleteTime;
	volatile LoadTask mTask;
	long mUpdateThrottle;
}
