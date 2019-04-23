// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.core.util.Function;

// Referenced classes of package android.arch.lifecycle:
//			Observer, Transformations, MediatorLiveData

static final class Transformations$1
	implements Observer
{

	public void onChanged(Object obj)
	{
		val$result.setValue(val$func.apply(obj));
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

	Transformations$1(MediatorLiveData mediatorlivedata, Function function)
	{
		val$result = mediatorlivedata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediatorLiveData val$result>
		val$func = function;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Function val$func>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
