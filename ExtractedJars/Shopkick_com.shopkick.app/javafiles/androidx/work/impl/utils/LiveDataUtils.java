// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.arch.core.util.Function;
import android.arch.lifecycle.*;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class LiveDataUtils
{

	private LiveDataUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static LiveData dedupedMappedLiveDataFor(LiveData livedata, Function function, TaskExecutor taskexecutor)
	{
		Object obj = new Object();
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Object()>
	//    3    7:astore_3        
		MediatorLiveData mediatorlivedata = new MediatorLiveData();
	//    4    8:new             #22  <Class MediatorLiveData>
	//    5   11:dup             
	//    6   12:invokespecial   #23  <Method void MediatorLiveData()>
	//    7   15:astore          4
		mediatorlivedata.addSource(livedata, new Observer(taskexecutor, obj, function, mediatorlivedata) {

			public void onChanged(Object obj1)
			{
				workTaskExecutor.executeOnBackgroundThread(((_cls1) (obj1)). new Runnable() {

					public void run()
					{
						Object obj = lock;
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field LiveDataUtils$1 this$0>
					//    2    4:getfield        #29  <Field Object LiveDataUtils$1.val$lock>
					//    3    7:astore_1        
						obj;
					//    4    8:aload_1         
						JVM INSTR monitorenter ;
					//    5    9:monitorenter    
						Object obj1 = mappingMethod.apply(input);
					//    6   10:aload_0         
					//    7   11:getfield        #19  <Field LiveDataUtils$1 this$0>
					//    8   14:getfield        #33  <Field Function LiveDataUtils$1.val$mappingMethod>
					//    9   17:aload_0         
					//   10   18:getfield        #21  <Field Object val$input>
					//   11   21:invokeinterface #39  <Method Object Function.apply(Object)>
					//   12   26:astore_2        
						if(mCurrentOutput != null || obj1 == null)
							break MISSING_BLOCK_LABEL_63;
					//   13   27:aload_0         
					//   14   28:getfield        #19  <Field LiveDataUtils$1 this$0>
					//   15   31:getfield        #42  <Field Object LiveDataUtils$1.mCurrentOutput>
					//   16   34:ifnonnull       63
					//   17   37:aload_2         
					//   18   38:ifnull          63
						mCurrentOutput = obj1;
					//   19   41:aload_0         
					//   20   42:getfield        #19  <Field LiveDataUtils$1 this$0>
					//   21   45:aload_2         
					//   22   46:putfield        #42  <Field Object LiveDataUtils$1.mCurrentOutput>
						outputLiveData.postValue(obj1);
					//   23   49:aload_0         
					//   24   50:getfield        #19  <Field LiveDataUtils$1 this$0>
					//   25   53:getfield        #46  <Field MediatorLiveData LiveDataUtils$1.val$outputLiveData>
					//   26   56:aload_2         
					//   27   57:invokevirtual   #51  <Method void MediatorLiveData.postValue(Object)>
						break MISSING_BLOCK_LABEL_106;
					//   28   60:goto            106
						if(mCurrentOutput != null && !mCurrentOutput.equals(obj1))
					//*  29   63:aload_0         
					//*  30   64:getfield        #19  <Field LiveDataUtils$1 this$0>
					//*  31   67:getfield        #42  <Field Object LiveDataUtils$1.mCurrentOutput>
					//*  32   70:ifnull          106
					//*  33   73:aload_0         
					//*  34   74:getfield        #19  <Field LiveDataUtils$1 this$0>
					//*  35   77:getfield        #42  <Field Object LiveDataUtils$1.mCurrentOutput>
					//*  36   80:aload_2         
					//*  37   81:invokevirtual   #55  <Method boolean Object.equals(Object)>
					//*  38   84:ifne            106
						{
							mCurrentOutput = obj1;
					//   39   87:aload_0         
					//   40   88:getfield        #19  <Field LiveDataUtils$1 this$0>
					//   41   91:aload_2         
					//   42   92:putfield        #42  <Field Object LiveDataUtils$1.mCurrentOutput>
							outputLiveData.postValue(obj1);
					//   43   95:aload_0         
					//   44   96:getfield        #19  <Field LiveDataUtils$1 this$0>
					//   45   99:getfield        #46  <Field MediatorLiveData LiveDataUtils$1.val$outputLiveData>
					//   46  102:aload_2         
					//   47  103:invokevirtual   #51  <Method void MediatorLiveData.postValue(Object)>
						}
						obj;
					//   48  106:aload_1         
						JVM INSTR monitorexit ;
					//   49  107:monitorexit     
						return;
					//   50  108:return          
						Exception exception;
						exception;
					//   51  109:astore_2        
						obj;
					//   52  110:aload_1         
						JVM INSTR monitorexit ;
					//   53  111:monitorexit     
						throw exception;
					//   54  112:aload_2         
					//   55  113:athrow          
					}

					final _cls1 this$0;
					final Object val$input;

			
			{
				this$0 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LiveDataUtils$1 this$0>
				input = Object.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$input>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field TaskExecutor val$workTaskExecutor>
			//    2    4:new             #14  <Class LiveDataUtils$1$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:aload_1         
			//    6   10:invokespecial   #46  <Method void LiveDataUtils$1$1(LiveDataUtils$1, Object)>
			//    7   13:invokeinterface #52  <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
			//    8   18:return          
			}

			Object mCurrentOutput;
			final Object val$lock;
			final Function val$mappingMethod;
			final MediatorLiveData val$outputLiveData;
			final TaskExecutor val$workTaskExecutor;

			
			{
				workTaskExecutor = taskexecutor;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field TaskExecutor val$workTaskExecutor>
				lock = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field Object val$lock>
				mappingMethod = function;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field Function val$mappingMethod>
				outputLiveData = mediatorlivedata;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field MediatorLiveData val$outputLiveData>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #37  <Method void Object()>
				mCurrentOutput = null;
			//   14   25:aload_0         
			//   15   26:aconst_null     
			//   16   27:putfield        #39  <Field Object mCurrentOutput>
			//   17   30:return          
			}
		}
);
	//    8   17:aload           4
	//    9   19:aload_0         
	//   10   20:new             #6   <Class LiveDataUtils$1>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:aload           4
	//   16   29:invokespecial   #26  <Method void LiveDataUtils$1(TaskExecutor, Object, Function, MediatorLiveData)>
	//   17   32:invokevirtual   #30  <Method void MediatorLiveData.addSource(LiveData, Observer)>
		return ((LiveData) (mediatorlivedata));
	//   18   35:aload           4
	//   19   37:areturn         
	}
}
