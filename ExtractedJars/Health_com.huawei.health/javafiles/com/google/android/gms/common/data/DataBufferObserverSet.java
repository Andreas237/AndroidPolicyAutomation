// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBufferObserver

public final class DataBufferObserverSet
	implements DataBufferObserver, DataBufferObserver.Observable
{

	public DataBufferObserverSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzaDK = new HashSet();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashSet()>
	//    6   12:putfield        #20  <Field HashSet zzaDK>
	//    7   15:return          
	}

	public void addObserver(DataBufferObserver databufferobserver)
	{
		zzaDK.add(((Object) (databufferobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method boolean HashSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void clear()
	{
		zzaDK.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:invokevirtual   #30  <Method void HashSet.clear()>
	//    3    7:return          
	}

	public boolean hasObservers()
	{
		return !zzaDK.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:invokevirtual   #35  <Method boolean HashSet.isEmpty()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void onDataChanged()
	{
		for(Iterator iterator = zzaDK.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataChanged());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            34
	//    7   17:aload_1         
	//    8   18:invokeinterface #49  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class DataBufferObserver>
	//   10   26:invokeinterface #51  <Method void DataBufferObserver.onDataChanged()>
	//*  11   31:goto            8
	//   12   34:return          
	}

	public void onDataRangeChanged(int i, int j)
	{
		for(Iterator iterator = zzaDK.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataRangeChanged(i, j));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #49  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class DataBufferObserver>
	//   10   26:iload_1         
	//   11   27:iload_2         
	//   12   28:invokeinterface #55  <Method void DataBufferObserver.onDataRangeChanged(int, int)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	public void onDataRangeInserted(int i, int j)
	{
		for(Iterator iterator = zzaDK.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataRangeInserted(i, j));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #49  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class DataBufferObserver>
	//   10   26:iload_1         
	//   11   27:iload_2         
	//   12   28:invokeinterface #58  <Method void DataBufferObserver.onDataRangeInserted(int, int)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	public void onDataRangeMoved(int i, int j, int k)
	{
		for(Iterator iterator = zzaDK.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataRangeMoved(i, j, k));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    3    7:astore          4
	//    4    9:aload           4
	//    5   11:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            40
	//    7   19:aload           4
	//    8   21:invokeinterface #49  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class DataBufferObserver>
	//   10   29:iload_1         
	//   11   30:iload_2         
	//   12   31:iload_3         
	//   13   32:invokeinterface #62  <Method void DataBufferObserver.onDataRangeMoved(int, int, int)>
	//*  14   37:goto            9
	//   15   40:return          
	}

	public void onDataRangeRemoved(int i, int j)
	{
		for(Iterator iterator = zzaDK.iterator(); iterator.hasNext(); ((DataBufferObserver)iterator.next()).onDataRangeRemoved(i, j));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:invokevirtual   #40  <Method Iterator HashSet.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #49  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class DataBufferObserver>
	//   10   26:iload_1         
	//   11   27:iload_2         
	//   12   28:invokeinterface #65  <Method void DataBufferObserver.onDataRangeRemoved(int, int)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	public void removeObserver(DataBufferObserver databufferobserver)
	{
		zzaDK.remove(((Object) (databufferobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashSet zzaDK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #69  <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	private HashSet zzaDK;
}
