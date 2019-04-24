// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.util.*;

// Referenced classes of package android.arch.lifecycle:
//			ViewModel

public class ViewModelStore
{

	public ViewModelStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field HashMap mMap>
	//    7   15:return          
	}

	public final void clear()
	{
		for(Iterator iterator = mMap.values().iterator(); iterator.hasNext(); ((ViewModel)iterator.next()).onCleared());
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap mMap>
	//    2    4:invokevirtual   #22  <Method Collection HashMap.values()>
	//    3    7:invokeinterface #28  <Method Iterator Collection.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            37
	//    8   22:aload_1         
	//    9   23:invokeinterface #38  <Method Object Iterator.next()>
	//   10   28:checkcast       #40  <Class ViewModel>
	//   11   31:invokevirtual   #43  <Method void ViewModel.onCleared()>
	//*  12   34:goto            13
		mMap.clear();
	//   13   37:aload_0         
	//   14   38:getfield        #16  <Field HashMap mMap>
	//   15   41:invokevirtual   #45  <Method void HashMap.clear()>
	//   16   44:return          
	}

	final ViewModel get(String s)
	{
		return (ViewModel)mMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap mMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #40  <Class ViewModel>
	//    5   11:areturn         
	}

	final void put(String s, ViewModel viewmodel)
	{
		ViewModel viewmodel1 = (ViewModel)mMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field HashMap mMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #40  <Class ViewModel>
	//    5   11:astore_3        
		if(viewmodel1 != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          20
			viewmodel1.onCleared();
	//    8   16:aload_3         
	//    9   17:invokevirtual   #43  <Method void ViewModel.onCleared()>
		mMap.put(((Object) (s)), ((Object) (viewmodel)));
	//   10   20:aload_0         
	//   11   21:getfield        #16  <Field HashMap mMap>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #55  <Method Object HashMap.put(Object, Object)>
	//   15   29:pop             
	//   16   30:return          
	}

	private final HashMap mMap = new HashMap();
}
