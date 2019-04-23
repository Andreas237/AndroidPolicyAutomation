// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.arch.lifecycle:
//			LiveData

public abstract class ComputableLiveData
{

	public ComputableLiveData()
	{
		this(ArchTaskExecutor.getIOThreadExecutor());
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method Executor ArchTaskExecutor.getIOThreadExecutor()>
	//    2    4:invokespecial   #38  <Method void ComputableLiveData(Executor)>
	//    3    7:return          
	}

	public ComputableLiveData(Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mInvalid = new AtomicBoolean(true);
	//    2    4:aload_0         
	//    3    5:new             #44  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #47  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #49  <Field AtomicBoolean mInvalid>
		mComputing = new AtomicBoolean(false);
	//    8   16:aload_0         
	//    9   17:new             #44  <Class AtomicBoolean>
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:invokespecial   #47  <Method void AtomicBoolean(boolean)>
	//   13   25:putfield        #51  <Field AtomicBoolean mComputing>
		mRefreshRunnable = new Runnable() {

			public void run()
			{
_L4:
				boolean flag;
				Object obj;
				if(!mComputing.compareAndSet(false, true))
					break MISSING_BLOCK_LABEL_90;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ComputableLiveData this$0>
			//    2    4:invokestatic    #24  <Method AtomicBoolean ComputableLiveData.access$100(ComputableLiveData)>
			//    3    7:iconst_0        
			//    4    8:iconst_1        
			//    5    9:invokevirtual   #30  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
			//    6   12:ifeq            90
				obj = null;
			//    7   15:aconst_null     
			//    8   16:astore_2        
				flag = false;
			//    9   17:iconst_0        
			//   10   18:istore_1        
_L2:
				if(!mInvalid.compareAndSet(true, false))
					break; /* Loop/switch isn't completed */
			//   11   19:aload_0         
			//   12   20:getfield        #14  <Field ComputableLiveData this$0>
			//   13   23:invokestatic    #33  <Method AtomicBoolean ComputableLiveData.access$200(ComputableLiveData)>
			//   14   26:iconst_1        
			//   15   27:iconst_0        
			//   16   28:invokevirtual   #30  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
			//   17   31:ifeq            47
				obj = compute();
			//   18   34:aload_0         
			//   19   35:getfield        #14  <Field ComputableLiveData this$0>
			//   20   38:invokevirtual   #37  <Method Object ComputableLiveData.compute()>
			//   21   41:astore_2        
				flag = true;
			//   22   42:iconst_1        
			//   23   43:istore_1        
				if(true) goto _L2; else goto _L1
			//   24   44:goto            19
_L1:
				if(!flag)
					break MISSING_BLOCK_LABEL_62;
			//   25   47:iload_1         
			//   26   48:ifeq            62
				mLiveData.postValue(obj);
			//   27   51:aload_0         
			//   28   52:getfield        #14  <Field ComputableLiveData this$0>
			//   29   55:invokestatic    #41  <Method LiveData ComputableLiveData.access$300(ComputableLiveData)>
			//   30   58:aload_2         
			//   31   59:invokevirtual   #47  <Method void LiveData.postValue(Object)>
				mComputing.set(false);
			//   32   62:aload_0         
			//   33   63:getfield        #14  <Field ComputableLiveData this$0>
			//   34   66:invokestatic    #24  <Method AtomicBoolean ComputableLiveData.access$100(ComputableLiveData)>
			//   35   69:iconst_0        
			//   36   70:invokevirtual   #51  <Method void AtomicBoolean.set(boolean)>
				continue; /* Loop/switch isn't completed */
			//   37   73:goto            92
				Exception exception;
				exception;
			//   38   76:astore_2        
				mComputing.set(false);
			//   39   77:aload_0         
			//   40   78:getfield        #14  <Field ComputableLiveData this$0>
			//   41   81:invokestatic    #24  <Method AtomicBoolean ComputableLiveData.access$100(ComputableLiveData)>
			//   42   84:iconst_0        
			//   43   85:invokevirtual   #51  <Method void AtomicBoolean.set(boolean)>
				throw exception;
			//   44   88:aload_2         
			//   45   89:athrow          
				flag = false;
			//   46   90:iconst_0        
			//   47   91:istore_1        
				if(flag && mInvalid.get()) goto _L4; else goto _L3
			//   48   92:iload_1         
			//   49   93:ifeq            109
			//   50   96:aload_0         
			//   51   97:getfield        #14  <Field ComputableLiveData this$0>
			//   52  100:invokestatic    #33  <Method AtomicBoolean ComputableLiveData.access$200(ComputableLiveData)>
			//   53  103:invokevirtual   #55  <Method boolean AtomicBoolean.get()>
			//   54  106:ifne            0
_L3:
			//   55  109:return          
			}

			final ComputableLiveData this$0;

			
			{
				this$0 = ComputableLiveData.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ComputableLiveData this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   14   28:aload_0         
	//   15   29:new             #9   <Class ComputableLiveData$2>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #54  <Method void ComputableLiveData$2(ComputableLiveData)>
	//   19   37:putfield        #56  <Field Runnable mRefreshRunnable>
		mInvalidationRunnable = new Runnable() {

			public void run()
			{
				boolean flag = mLiveData.hasActiveObservers();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ComputableLiveData this$0>
			//    2    4:invokestatic    #24  <Method LiveData ComputableLiveData.access$300(ComputableLiveData)>
			//    3    7:invokevirtual   #30  <Method boolean LiveData.hasActiveObservers()>
			//    4   10:istore_1        
				if(mInvalid.compareAndSet(false, true) && flag)
			//*   5   11:aload_0         
			//*   6   12:getfield        #14  <Field ComputableLiveData this$0>
			//*   7   15:invokestatic    #34  <Method AtomicBoolean ComputableLiveData.access$200(ComputableLiveData)>
			//*   8   18:iconst_0        
			//*   9   19:iconst_1        
			//*  10   20:invokevirtual   #40  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
			//*  11   23:ifeq            49
			//*  12   26:iload_1         
			//*  13   27:ifeq            49
					mExecutor.execute(mRefreshRunnable);
			//   14   30:aload_0         
			//   15   31:getfield        #14  <Field ComputableLiveData this$0>
			//   16   34:invokestatic    #44  <Method Executor ComputableLiveData.access$000(ComputableLiveData)>
			//   17   37:aload_0         
			//   18   38:getfield        #14  <Field ComputableLiveData this$0>
			//   19   41:getfield        #48  <Field Runnable ComputableLiveData.mRefreshRunnable>
			//   20   44:invokeinterface #54  <Method void Executor.execute(Runnable)>
			//   21   49:return          
			}

			final ComputableLiveData this$0;

			
			{
				this$0 = ComputableLiveData.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ComputableLiveData this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   20   40:aload_0         
	//   21   41:new             #11  <Class ComputableLiveData$3>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #57  <Method void ComputableLiveData$3(ComputableLiveData)>
	//   25   49:putfield        #59  <Field Runnable mInvalidationRunnable>
		mExecutor = executor;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #61  <Field Executor mExecutor>
		mLiveData = ((LiveData) (new LiveData() {

			protected void onActive()
			{
				mExecutor.execute(mRefreshRunnable);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ComputableLiveData this$0>
			//    2    4:invokestatic    #24  <Method Executor ComputableLiveData.access$000(ComputableLiveData)>
			//    3    7:aload_0         
			//    4    8:getfield        #15  <Field ComputableLiveData this$0>
			//    5   11:getfield        #28  <Field Runnable ComputableLiveData.mRefreshRunnable>
			//    6   14:invokeinterface #34  <Method void Executor.execute(Runnable)>
			//    7   19:return          
			}

			final ComputableLiveData this$0;

			
			{
				this$0 = ComputableLiveData.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ComputableLiveData this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void LiveData()>
			//    5    9:return          
			}
		}
));
	//   29   57:aload_0         
	//   30   58:new             #7   <Class ComputableLiveData$1>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:invokespecial   #62  <Method void ComputableLiveData$1(ComputableLiveData)>
	//   34   66:putfield        #64  <Field LiveData mLiveData>
	//   35   69:return          
	}

	protected abstract Object compute();

	public LiveData getLiveData()
	{
		return mLiveData;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field LiveData mLiveData>
	//    2    4:areturn         
	}

	public void invalidate()
	{
		ArchTaskExecutor.getInstance().executeOnMainThread(mInvalidationRunnable);
	//    0    0:invokestatic    #85  <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
	//    1    3:aload_0         
	//    2    4:getfield        #59  <Field Runnable mInvalidationRunnable>
	//    3    7:invokevirtual   #89  <Method void ArchTaskExecutor.executeOnMainThread(Runnable)>
	//    4   10:return          
	}

	private AtomicBoolean mComputing;
	private final Executor mExecutor;
	private AtomicBoolean mInvalid;
	final Runnable mInvalidationRunnable;
	private final LiveData mLiveData;
	final Runnable mRefreshRunnable;


/*
	static Executor access$000(ComputableLiveData computablelivedata)
	{
		return computablelivedata.mExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Executor mExecutor>
	//    2    4:areturn         
	}

*/


/*
	static AtomicBoolean access$100(ComputableLiveData computablelivedata)
	{
		return computablelivedata.mComputing;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field AtomicBoolean mComputing>
	//    2    4:areturn         
	}

*/


/*
	static AtomicBoolean access$200(ComputableLiveData computablelivedata)
	{
		return computablelivedata.mInvalid;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field AtomicBoolean mInvalid>
	//    2    4:areturn         
	}

*/


/*
	static LiveData access$300(ComputableLiveData computablelivedata)
	{
		return computablelivedata.mLiveData;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field LiveData mLiveData>
	//    2    4:areturn         
	}

*/
}
