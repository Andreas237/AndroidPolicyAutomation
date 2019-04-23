// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.core.util.Function;

// Referenced classes of package android.arch.lifecycle:
//			Observer, MediatorLiveData, Transformations, LiveData

class Transformations$2$1
	implements Observer
{

	public void onChanged(Object obj)
	{
		val$result.setValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Transformations$2 this$0>
	//    2    4:getfield        #27  <Field MediatorLiveData Transformations$2.val$result>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method void MediatorLiveData.setValue(Object)>
	//    5   11:return          
	}

	final Transformations._cls2 this$0;

	Transformations$2$1()
	{
		this$0 = Transformations._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Transformations$2 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class android/arch/lifecycle/Transformations$2

/* anonymous class */
	static final class Transformations._cls2
		implements Observer
	{

		public void onChanged(Object obj)
		{
			obj = ((Object) ((LiveData)func.apply(obj)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Function val$func>
		//    2    4:aload_1         
		//    3    5:invokeinterface #40  <Method Object Function.apply(Object)>
		//    4   10:checkcast       #42  <Class LiveData>
		//    5   13:astore_1        
			LiveData livedata = mSource;
		//    6   14:aload_0         
		//    7   15:getfield        #44  <Field LiveData mSource>
		//    8   18:astore_2        
			if(livedata == obj)
		//*   9   19:aload_2         
		//*  10   20:aload_1         
		//*  11   21:if_acmpne       25
				return;
		//   12   24:return          
			if(livedata != null)
		//*  13   25:aload_2         
		//*  14   26:ifnull          37
				result.removeSource(livedata);
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
				result.addSource(((LiveData) (obj)), ((Observer) (new Transformations._cls2._cls1())));
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

}
