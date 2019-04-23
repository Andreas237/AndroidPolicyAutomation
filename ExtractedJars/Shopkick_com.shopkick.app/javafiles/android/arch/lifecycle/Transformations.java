// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.core.util.Function;

// Referenced classes of package android.arch.lifecycle:
//			MediatorLiveData, LiveData, Observer

public class Transformations
{

	private Transformations()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static LiveData map(LiveData livedata, Function function)
	{
		MediatorLiveData mediatorlivedata = new MediatorLiveData();
	//    0    0:new             #21  <Class MediatorLiveData>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void MediatorLiveData()>
	//    3    7:astore_2        
		mediatorlivedata.addSource(livedata, new Observer(mediatorlivedata, function) {

			public void onChanged(Object obj)
			{
				result.setValue(func.apply(obj));
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field MediatorLiveData val$result>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field Function val$func>
			//    4    8:aload_1         
			//    5    9:invokeinterface #35  <Method Object Function.apply(Object)>
			//    6   14:invokevirtual   #40  <Method void MediatorLiveData.setValue(Object)>
			//    7   17:return          
			}

			final Function val$func;
			final MediatorLiveData val$result;

			
			{
				result = mediatorlivedata;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediatorLiveData val$result>
				func = function;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Function val$func>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:new             #6   <Class Transformations$1>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokespecial   #25  <Method void Transformations$1(MediatorLiveData, Function)>
	//   11   19:invokevirtual   #29  <Method void MediatorLiveData.addSource(LiveData, Observer)>
		return ((LiveData) (mediatorlivedata));
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public static LiveData switchMap(LiveData livedata, Function function)
	{
		MediatorLiveData mediatorlivedata = new MediatorLiveData();
	//    0    0:new             #21  <Class MediatorLiveData>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void MediatorLiveData()>
	//    3    7:astore_2        
		mediatorlivedata.addSource(livedata, new Observer(function, mediatorlivedata) {

			public void onChanged(Object obj)
			{
				obj = ((Object) ((LiveData)func.apply(obj)));
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field Function val$func>
			//    2    4:aload_1         
			//    3    5:invokeinterface #40  <Method Object Function.apply(Object)>
			//    4   10:checkcast       #42  <Class LiveData>
			//    5   13:astore_1        
				LiveData livedata1 = mSource;
			//    6   14:aload_0         
			//    7   15:getfield        #44  <Field LiveData mSource>
			//    8   18:astore_2        
				if(livedata1 == obj)
			//*   9   19:aload_2         
			//*  10   20:aload_1         
			//*  11   21:if_acmpne       25
					return;
			//   12   24:return          
				if(livedata1 != null)
			//*  13   25:aload_2         
			//*  14   26:ifnull          37
					result.removeSource(livedata1);
			//   15   29:aload_0         
			//   16   30:getfield        #27  <Field MediatorLiveData val$result>
			//   17   33:aload_2         
			//   18   34:invokevirtual   #50  <Method void MediatorLiveData.removeSource(LiveData)>
				mSource = ((LiveData) (obj));
			//   19   37:aload_0         
			//   20   38:aload_1         
			//   21   39:putfield        #44  <Field LiveData mSource>
				obj = ((Object) (mSource));
			//   22   42:aload_0         
			//   23   43:getfield        #44  <Field LiveData mSource>
			//   24   46:astore_1        
				if(obj != null)
			//*  25   47:aload_1         
			//*  26   48:ifnull          67
					result.addSource(((LiveData) (obj)), new Observer() {

						public void onChanged(Object obj)
						{
							result.setValue(obj);
						//    0    0:aload_0         
						//    1    1:getfield        #18  <Field Transformations$2 this$0>
						//    2    4:getfield        #27  <Field MediatorLiveData Transformations$2.val$result>
						//    3    7:aload_1         
						//    4    8:invokevirtual   #32  <Method void MediatorLiveData.setValue(Object)>
						//    5   11:return          
						}

						final _cls2 this$0;

			
			{
				this$0 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Transformations$2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//   27   51:aload_0         
			//   28   52:getfield        #27  <Field MediatorLiveData val$result>
			//   29   55:aload_1         
			//   30   56:new             #14  <Class Transformations$2$1>
			//   31   59:dup             
			//   32   60:aload_0         
			//   33   61:invokespecial   #53  <Method void Transformations$2$1(Transformations$2)>
			//   34   64:invokevirtual   #57  <Method void MediatorLiveData.addSource(LiveData, Observer)>
			//   35   67:return          
			}

			LiveData mSource;
			final Function val$func;
			final MediatorLiveData val$result;

			
			{
				func = function;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field Function val$func>
				result = mediatorlivedata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field MediatorLiveData val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:new             #8   <Class Transformations$2>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #37  <Method void Transformations$2(Function, MediatorLiveData)>
	//   11   19:invokevirtual   #29  <Method void MediatorLiveData.addSource(LiveData, Observer)>
		return ((LiveData) (mediatorlivedata));
	//   12   22:aload_2         
	//   13   23:areturn         
	}
}
