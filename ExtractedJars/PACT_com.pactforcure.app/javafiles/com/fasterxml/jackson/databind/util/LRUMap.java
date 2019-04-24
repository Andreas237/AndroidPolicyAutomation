// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

public class LRUMap
	implements Serializable
{

	public LRUMap(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		_map = new ConcurrentHashMap(i, 0.8F, 4);
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:ldc1            #25  <Float 0.8F>
	//    7   12:iconst_4        
	//    8   13:invokespecial   #28  <Method void ConcurrentHashMap(int, float, int)>
	//    9   16:putfield        #30  <Field ConcurrentHashMap _map>
		_maxEntries = j;
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:putfield        #32  <Field int _maxEntries>
	//   13   24:return          
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException
	{
		_jdkSerializeMaxEntries = objectinputstream.readInt();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method int ObjectInputStream.readInt()>
	//    3    5:putfield        #45  <Field int _jdkSerializeMaxEntries>
	//    4    8:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.writeInt(_jdkSerializeMaxEntries);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field int _jdkSerializeMaxEntries>
	//    3    5:invokevirtual   #54  <Method void ObjectOutputStream.writeInt(int)>
	//    4    8:return          
	}

	public void clear()
	{
		_map.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ConcurrentHashMap _map>
	//    2    4:invokevirtual   #57  <Method void ConcurrentHashMap.clear()>
	//    3    7:return          
	}

	public Object get(Object obj)
	{
		return _map.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ConcurrentHashMap _map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method Object ConcurrentHashMap.get(Object)>
	//    4    8:areturn         
	}

	public Object put(Object obj, Object obj1)
	{
		if(_map.size() < _maxEntries) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ConcurrentHashMap _map>
	//    2    4:invokevirtual   #68  <Method int ConcurrentHashMap.size()>
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field int _maxEntries>
	//    5   11:icmplt          36
_L1:
		this;
	//    6   14:aload_0         
		JVM INSTR monitorenter ;
	//    7   15:monitorenter    
		if(_map.size() >= _maxEntries)
	//*   8   16:aload_0         
	//*   9   17:getfield        #30  <Field ConcurrentHashMap _map>
	//*  10   20:invokevirtual   #68  <Method int ConcurrentHashMap.size()>
	//*  11   23:aload_0         
	//*  12   24:getfield        #32  <Field int _maxEntries>
	//*  13   27:icmplt          34
			clear();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #69  <Method void clear()>
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
_L2:
		return _map.put(obj, obj1);
	//   18   36:aload_0         
	//   19   37:getfield        #30  <Field ConcurrentHashMap _map>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokevirtual   #71  <Method Object ConcurrentHashMap.put(Object, Object)>
	//   23   45:areturn         
		obj;
	//   24   46:astore_1        
		this;
	//   25   47:aload_0         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		throw obj;
	//   27   49:aload_1         
	//   28   50:athrow          
	}

	public Object putIfAbsent(Object obj, Object obj1)
	{
		if(_map.size() < _maxEntries) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ConcurrentHashMap _map>
	//    2    4:invokevirtual   #68  <Method int ConcurrentHashMap.size()>
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field int _maxEntries>
	//    5   11:icmplt          36
_L1:
		this;
	//    6   14:aload_0         
		JVM INSTR monitorenter ;
	//    7   15:monitorenter    
		if(_map.size() >= _maxEntries)
	//*   8   16:aload_0         
	//*   9   17:getfield        #30  <Field ConcurrentHashMap _map>
	//*  10   20:invokevirtual   #68  <Method int ConcurrentHashMap.size()>
	//*  11   23:aload_0         
	//*  12   24:getfield        #32  <Field int _maxEntries>
	//*  13   27:icmplt          34
			clear();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #69  <Method void clear()>
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
_L2:
		return _map.putIfAbsent(obj, obj1);
	//   18   36:aload_0         
	//   19   37:getfield        #30  <Field ConcurrentHashMap _map>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokevirtual   #75  <Method Object ConcurrentHashMap.putIfAbsent(Object, Object)>
	//   23   45:areturn         
		obj;
	//   24   46:astore_1        
		this;
	//   25   47:aload_0         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		throw obj;
	//   27   49:aload_1         
	//   28   50:athrow          
	}

	protected Object readResolve()
	{
		return ((Object) (new LRUMap(_jdkSerializeMaxEntries, _jdkSerializeMaxEntries)));
	//    0    0:new             #2   <Class LRUMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field int _jdkSerializeMaxEntries>
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field int _jdkSerializeMaxEntries>
	//    6   12:invokespecial   #79  <Method void LRUMap(int, int)>
	//    7   15:areturn         
	}

	public int size()
	{
		return _map.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ConcurrentHashMap _map>
	//    2    4:invokevirtual   #68  <Method int ConcurrentHashMap.size()>
	//    3    7:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected transient int _jdkSerializeMaxEntries;
	protected final transient ConcurrentHashMap _map;
	protected final transient int _maxEntries;
}
