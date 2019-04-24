// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			ArrayPool, GroupedLinkedMap, ArrayAdapterInterface, IntegerArrayAdapter, 
//			ByteArrayAdapter, Poolable, BaseKeyPool

public final class LruArrayPool
	implements ArrayPool
{
	static final class Key
		implements Poolable
	{

		public boolean equals(Object obj)
		{
			if(obj instanceof Key)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class LruArrayPool$Key>
		//*   2    4:ifeq            38
			{
				obj = ((Object) ((Key)obj));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class LruArrayPool$Key>
		//    5   11:astore_1        
				return size == ((Key) (obj)).size && arrayClass == ((Key) (obj)).arrayClass;
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field int size>
		//    8   16:aload_1         
		//    9   17:getfield        #28  <Field int size>
		//   10   20:icmpne          36
		//   11   23:aload_0         
		//   12   24:getfield        #30  <Field Class arrayClass>
		//   13   27:aload_1         
		//   14   28:getfield        #30  <Field Class arrayClass>
		//   15   31:if_acmpne       36
		//   16   34:iconst_1        
		//   17   35:ireturn         
		//   18   36:iconst_0        
		//   19   37:ireturn         
			} else
			{
				return false;
		//   20   38:iconst_0        
		//   21   39:ireturn         
			}
		}

		public int hashCode()
		{
			int j = size;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int size>
		//    2    4:istore_2        
			int i;
			if(arrayClass != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #30  <Field Class arrayClass>
		//*   5    9:ifnull          23
				i = ((Object) (arrayClass)).hashCode();
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field Class arrayClass>
		//    8   16:invokevirtual   #34  <Method int Object.hashCode()>
		//    9   19:istore_1        
			else
		//*  10   20:goto            25
				i = 0;
		//   11   23:iconst_0        
		//   12   24:istore_1        
			return j * 31 + i;
		//   13   25:iload_2         
		//   14   26:bipush          31
		//   15   28:imul            
		//   16   29:iload_1         
		//   17   30:iadd            
		//   18   31:ireturn         
		}

		void init(int i, Class class1)
		{
			size = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field int size>
			arrayClass = class1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #30  <Field Class arrayClass>
		//    6   10:return          
		}

		public void offer()
		{
			pool.offer(((Poolable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LruArrayPool$KeyPool pool>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #44  <Method void LruArrayPool$KeyPool.offer(Poolable)>
		//    4    8:return          
		}

		public String toString()
		{
			return (new StringBuilder()).append("Key{size=").append(size).append("array=").append(((Object) (arrayClass))).append('}').toString();
		//    0    0:new             #48  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #49  <Method void StringBuilder()>
		//    3    7:ldc1            #51  <String "Key{size=">
		//    4    9:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #28  <Field int size>
		//    7   16:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
		//    8   19:ldc1            #60  <String "array=">
		//    9   21:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #30  <Field Class arrayClass>
		//   12   28:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   13   31:bipush          125
		//   14   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
		//   15   36:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   16   39:areturn         
		}

		private Class arrayClass;
		private final KeyPool pool;
		int size;

		Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field LruArrayPool$KeyPool pool>
		//    5    9:return          
		}
	}

	static final class KeyPool extends BaseKeyPool
	{

		protected Key create()
		{
			return new Key(this);
		//    0    0:new             #17  <Class LruArrayPool$Key>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #20  <Method void LruArrayPool$Key(LruArrayPool$KeyPool)>
		//    4    8:areturn         
		}

		protected volatile Poolable create()
		{
			return ((Poolable) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method LruArrayPool$Key create()>
		//    2    4:areturn         
		}

		Key get(int i, Class class1)
		{
			Key key = (Key)get();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #27  <Method Poolable get()>
		//    2    4:checkcast       #17  <Class LruArrayPool$Key>
		//    3    7:astore_3        
			key.init(i, class1);
		//    4    8:aload_3         
		//    5    9:iload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #31  <Method void LruArrayPool$Key.init(int, Class)>
			return key;
		//    8   14:aload_3         
		//    9   15:areturn         
		}

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void BaseKeyPool()>
		//    2    4:return          
		}
	}


	public LruArrayPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		groupedMap = new GroupedLinkedMap();
	//    2    4:aload_0         
	//    3    5:new             #38  <Class GroupedLinkedMap>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void GroupedLinkedMap()>
	//    6   12:putfield        #41  <Field GroupedLinkedMap groupedMap>
		keyPool = new KeyPool();
	//    7   15:aload_0         
	//    8   16:new             #11  <Class LruArrayPool$KeyPool>
	//    9   19:dup             
	//   10   20:invokespecial   #42  <Method void LruArrayPool$KeyPool()>
	//   11   23:putfield        #44  <Field LruArrayPool$KeyPool keyPool>
		sortedSizes = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #46  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #47  <Method void HashMap()>
	//   16   34:putfield        #49  <Field Map sortedSizes>
		adapters = ((Map) (new HashMap()));
	//   17   37:aload_0         
	//   18   38:new             #46  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #47  <Method void HashMap()>
	//   21   45:putfield        #51  <Field Map adapters>
		maxSize = 0x400000;
	//   22   48:aload_0         
	//   23   49:ldc1            #15  <Int 0x400000>
	//   24   51:putfield        #53  <Field int maxSize>
	//   25   54:return          
	}

	public LruArrayPool(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		groupedMap = new GroupedLinkedMap();
	//    2    4:aload_0         
	//    3    5:new             #38  <Class GroupedLinkedMap>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void GroupedLinkedMap()>
	//    6   12:putfield        #41  <Field GroupedLinkedMap groupedMap>
		keyPool = new KeyPool();
	//    7   15:aload_0         
	//    8   16:new             #11  <Class LruArrayPool$KeyPool>
	//    9   19:dup             
	//   10   20:invokespecial   #42  <Method void LruArrayPool$KeyPool()>
	//   11   23:putfield        #44  <Field LruArrayPool$KeyPool keyPool>
		sortedSizes = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #46  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #47  <Method void HashMap()>
	//   16   34:putfield        #49  <Field Map sortedSizes>
		adapters = ((Map) (new HashMap()));
	//   17   37:aload_0         
	//   18   38:new             #46  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #47  <Method void HashMap()>
	//   21   45:putfield        #51  <Field Map adapters>
		maxSize = i;
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:putfield        #53  <Field int maxSize>
	//   25   53:return          
	}

	private void decrementArrayOfSize(int i, Class class1)
	{
		class1 = ((Class) (getSizesForAdapter(class1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #62  <Method NavigableMap getSizesForAdapter(Class)>
	//    3    5:astore_2        
		Integer integer = (Integer)((NavigableMap) (class1)).get(((Object) (Integer.valueOf(i))));
	//    4    6:aload_2         
	//    5    7:iload_1         
	//    6    8:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//    7   11:invokeinterface #74  <Method Object NavigableMap.get(Object)>
	//    8   16:checkcast       #64  <Class Integer>
	//    9   19:astore_3        
		if(integer == null)
	//*  10   20:aload_3         
	//*  11   21:ifnonnull       60
			throw new NullPointerException((new StringBuilder()).append("Tried to decrement empty size, size: ").append(i).append(", this: ").append(((Object) (this))).toString());
	//   12   24:new             #76  <Class NullPointerException>
	//   13   27:dup             
	//   14   28:new             #78  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #79  <Method void StringBuilder()>
	//   17   35:ldc1            #81  <String "Tried to decrement empty size, size: ">
	//   18   37:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:iload_1         
	//   20   41:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   21   44:ldc1            #90  <String ", this: ">
	//   22   46:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:aload_0         
	//   24   50:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
	//   25   53:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   26   56:invokespecial   #100 <Method void NullPointerException(String)>
	//   27   59:athrow          
		if(integer.intValue() == 1)
	//*  28   60:aload_3         
	//*  29   61:invokevirtual   #104 <Method int Integer.intValue()>
	//*  30   64:iconst_1        
	//*  31   65:icmpne          80
		{
			((NavigableMap) (class1)).remove(((Object) (Integer.valueOf(i))));
	//   32   68:aload_2         
	//   33   69:iload_1         
	//   34   70:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   35   73:invokeinterface #107 <Method Object NavigableMap.remove(Object)>
	//   36   78:pop             
			return;
	//   37   79:return          
		} else
		{
			((NavigableMap) (class1)).put(((Object) (Integer.valueOf(i))), ((Object) (Integer.valueOf(integer.intValue() - 1))));
	//   38   80:aload_2         
	//   39   81:iload_1         
	//   40   82:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   41   85:aload_3         
	//   42   86:invokevirtual   #104 <Method int Integer.intValue()>
	//   43   89:iconst_1        
	//   44   90:isub            
	//   45   91:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   46   94:invokeinterface #111 <Method Object NavigableMap.put(Object, Object)>
	//   47   99:pop             
			return;
	//   48  100:return          
		}
	}

	private void evict()
	{
		evictToSize(maxSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field int maxSize>
	//    3    5:invokespecial   #117 <Method void evictToSize(int)>
	//    4    8:return          
	}

	private void evictToSize(int i)
	{
		do
		{
			if(currentSize <= i)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int currentSize>
	//    2    4:iload_1         
	//    3    5:icmple          116
			Object obj = groupedMap.removeLast();
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field GroupedLinkedMap groupedMap>
	//    6   12:invokevirtual   #123 <Method Object GroupedLinkedMap.removeLast()>
	//    7   15:astore_2        
			Preconditions.checkNotNull(obj);
	//    8   16:aload_2         
	//    9   17:invokestatic    #128 <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:pop             
			ArrayAdapterInterface arrayadapterinterface = getAdapterFromObject(obj);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokespecial   #132 <Method ArrayAdapterInterface getAdapterFromObject(Object)>
	//   14   26:astore_3        
			currentSize = currentSize - arrayadapterinterface.getArrayLength(obj) * arrayadapterinterface.getElementSizeInBytes();
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #119 <Field int currentSize>
	//   18   32:aload_3         
	//   19   33:aload_2         
	//   20   34:invokeinterface #138 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   21   39:aload_3         
	//   22   40:invokeinterface #141 <Method int ArrayAdapterInterface.getElementSizeInBytes()>
	//   23   45:imul            
	//   24   46:isub            
	//   25   47:putfield        #119 <Field int currentSize>
			decrementArrayOfSize(arrayadapterinterface.getArrayLength(obj), obj.getClass());
	//   26   50:aload_0         
	//   27   51:aload_3         
	//   28   52:aload_2         
	//   29   53:invokeinterface #138 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   30   58:aload_2         
	//   31   59:invokevirtual   #145 <Method Class Object.getClass()>
	//   32   62:invokespecial   #147 <Method void decrementArrayOfSize(int, Class)>
			if(Log.isLoggable(arrayadapterinterface.getTag(), 2))
	//*  33   65:aload_3         
	//*  34   66:invokeinterface #150 <Method String ArrayAdapterInterface.getTag()>
	//*  35   71:iconst_2        
	//*  36   72:invokestatic    #156 <Method boolean Log.isLoggable(String, int)>
	//*  37   75:ifeq            113
				Log.v(arrayadapterinterface.getTag(), (new StringBuilder()).append("evicted: ").append(arrayadapterinterface.getArrayLength(obj)).toString());
	//   38   78:aload_3         
	//   39   79:invokeinterface #150 <Method String ArrayAdapterInterface.getTag()>
	//   40   84:new             #78  <Class StringBuilder>
	//   41   87:dup             
	//   42   88:invokespecial   #79  <Method void StringBuilder()>
	//   43   91:ldc1            #158 <String "evicted: ">
	//   44   93:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   45   96:aload_3         
	//   46   97:aload_2         
	//   47   98:invokeinterface #138 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   48  103:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   49  106:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   50  109:invokestatic    #162 <Method int Log.v(String, String)>
	//   51  112:pop             
		} while(true);
	//   52  113:goto            0
	//   53  116:return          
	}

	private ArrayAdapterInterface getAdapterFromObject(Object obj)
	{
		return getAdapterFromType(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method Class Object.getClass()>
	//    3    5:invokespecial   #166 <Method ArrayAdapterInterface getAdapterFromType(Class)>
	//    4    8:areturn         
	}

	private ArrayAdapterInterface getAdapterFromType(Class class1)
	{
		ArrayAdapterInterface arrayadapterinterface = (ArrayAdapterInterface)adapters.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Map adapters>
	//    2    4:aload_1         
	//    3    5:invokeinterface #170 <Method Object Map.get(Object)>
	//    4   10:checkcast       #134 <Class ArrayAdapterInterface>
	//    5   13:astore_3        
		Object obj = ((Object) (arrayadapterinterface));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(arrayadapterinterface == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       102
		{
			if(((Object) (class1)).equals([I))
	//*  10   20:aload_1         
	//*  11   21:ldc1            #172 <Class int[]>
	//*  12   23:invokevirtual   #176 <Method boolean Object.equals(Object)>
	//*  13   26:ifeq            40
				obj = ((Object) (new IntegerArrayAdapter()));
	//   14   29:new             #178 <Class IntegerArrayAdapter>
	//   15   32:dup             
	//   16   33:invokespecial   #179 <Method void IntegerArrayAdapter()>
	//   17   36:astore_2        
			else
	//*  18   37:goto            90
			if(((Object) (class1)).equals([B))
	//*  19   40:aload_1         
	//*  20   41:ldc1            #181 <Class byte[]>
	//*  21   43:invokevirtual   #176 <Method boolean Object.equals(Object)>
	//*  22   46:ifeq            60
				obj = ((Object) (new ByteArrayAdapter()));
	//   23   49:new             #183 <Class ByteArrayAdapter>
	//   24   52:dup             
	//   25   53:invokespecial   #184 <Method void ByteArrayAdapter()>
	//   26   56:astore_2        
			else
	//*  27   57:goto            90
				throw new IllegalArgumentException((new StringBuilder()).append("No array pool found for: ").append(class1.getSimpleName()).toString());
	//   28   60:new             #186 <Class IllegalArgumentException>
	//   29   63:dup             
	//   30   64:new             #78  <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #79  <Method void StringBuilder()>
	//   33   71:ldc1            #188 <String "No array pool found for: ">
	//   34   73:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   35   76:aload_1         
	//   36   77:invokevirtual   #193 <Method String Class.getSimpleName()>
	//   37   80:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   39   86:invokespecial   #194 <Method void IllegalArgumentException(String)>
	//   40   89:athrow          
			adapters.put(((Object) (class1)), obj);
	//   41   90:aload_0         
	//   42   91:getfield        #51  <Field Map adapters>
	//   43   94:aload_1         
	//   44   95:aload_2         
	//   45   96:invokeinterface #195 <Method Object Map.put(Object, Object)>
	//   46  101:pop             
		}
		return ((ArrayAdapterInterface) (obj));
	//   47  102:aload_2         
	//   48  103:areturn         
	}

	private Object getArrayForKey(Key key)
	{
		return groupedMap.get(((Poolable) (key)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field GroupedLinkedMap groupedMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #202 <Method Object GroupedLinkedMap.get(Poolable)>
	//    4    8:areturn         
	}

	private NavigableMap getSizesForAdapter(Class class1)
	{
		NavigableMap navigablemap = (NavigableMap)sortedSizes.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Map sortedSizes>
	//    2    4:aload_1         
	//    3    5:invokeinterface #170 <Method Object Map.get(Object)>
	//    4   10:checkcast       #70  <Class NavigableMap>
	//    5   13:astore_3        
		Object obj = ((Object) (navigablemap));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(navigablemap == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       40
		{
			obj = ((Object) (new TreeMap()));
	//   10   20:new             #205 <Class TreeMap>
	//   11   23:dup             
	//   12   24:invokespecial   #206 <Method void TreeMap()>
	//   13   27:astore_2        
			sortedSizes.put(((Object) (class1)), obj);
	//   14   28:aload_0         
	//   15   29:getfield        #49  <Field Map sortedSizes>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #195 <Method Object Map.put(Object, Object)>
	//   19   39:pop             
		}
		return ((NavigableMap) (obj));
	//   20   40:aload_2         
	//   21   41:areturn         
	}

	private boolean isNoMoreThanHalfFull()
	{
		return currentSize == 0 || maxSize / currentSize >= 2;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int currentSize>
	//    2    4:ifeq            20
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field int maxSize>
	//    5   11:aload_0         
	//    6   12:getfield        #119 <Field int currentSize>
	//    7   15:idiv            
	//    8   16:iconst_2        
	//    9   17:icmplt          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	private boolean isSmallEnoughForReuse(int i)
	{
		return i <= maxSize / 2;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field int maxSize>
	//    3    5:iconst_2        
	//    4    6:idiv            
	//    5    7:icmpgt          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	private boolean mayFillRequest(int i, Integer integer)
	{
		return integer != null && (isNoMoreThanHalfFull() || integer.intValue() <= i * 8);
	//    0    0:aload_2         
	//    1    1:ifnull          24
	//    2    4:aload_0         
	//    3    5:invokespecial   #215 <Method boolean isNoMoreThanHalfFull()>
	//    4    8:ifne            22
	//    5   11:aload_2         
	//    6   12:invokevirtual   #104 <Method int Integer.intValue()>
	//    7   15:iload_1         
	//    8   16:bipush          8
	//    9   18:imul            
	//   10   19:icmpgt          24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	public void clearMemory()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		evictToSize(0);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #117 <Method void evictToSize(int)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public Object get(int i, Class class1)
	{
		ArrayAdapterInterface arrayadapterinterface = getAdapterFromType(class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #166 <Method ArrayAdapterInterface getAdapterFromType(Class)>
	//    3    5:astore          4
		this;
	//    4    7:aload_0         
		JVM INSTR monitorenter ;
	//    5    8:monitorenter    
		Object obj;
		obj = ((Object) ((Integer)getSizesForAdapter(class1).ceilingKey(((Object) (Integer.valueOf(i))))));
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:invokespecial   #62  <Method NavigableMap getSizesForAdapter(Class)>
	//    9   14:iload_1         
	//   10   15:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   11   18:invokeinterface #220 <Method Object NavigableMap.ceilingKey(Object)>
	//   12   23:checkcast       #64  <Class Integer>
	//   13   26:astore_3        
		if(mayFillRequest(i, ((Integer) (obj))))
	//*  14   27:aload_0         
	//*  15   28:iload_1         
	//*  16   29:aload_3         
	//*  17   30:invokespecial   #222 <Method boolean mayFillRequest(int, Integer)>
	//*  18   33:ifeq            52
		{
			obj = ((Object) (keyPool.get(((Integer) (obj)).intValue(), class1)));
	//   19   36:aload_0         
	//   20   37:getfield        #44  <Field LruArrayPool$KeyPool keyPool>
	//   21   40:aload_3         
	//   22   41:invokevirtual   #104 <Method int Integer.intValue()>
	//   23   44:aload_2         
	//   24   45:invokevirtual   #225 <Method LruArrayPool$Key LruArrayPool$KeyPool.get(int, Class)>
	//   25   48:astore_3        
			break MISSING_BLOCK_LABEL_62;
	//   26   49:goto            62
		}
		obj = ((Object) (keyPool.get(i, class1)));
	//   27   52:aload_0         
	//   28   53:getfield        #44  <Field LruArrayPool$KeyPool keyPool>
	//   29   56:iload_1         
	//   30   57:aload_2         
	//   31   58:invokevirtual   #225 <Method LruArrayPool$Key LruArrayPool$KeyPool.get(int, Class)>
	//   32   61:astore_3        
		obj = getArrayForKey(((Key) (obj)));
	//   33   62:aload_0         
	//   34   63:aload_3         
	//   35   64:invokespecial   #227 <Method Object getArrayForKey(LruArrayPool$Key)>
	//   36   67:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_110;
	//   37   68:aload_3         
	//   38   69:ifnull          110
		currentSize = currentSize - arrayadapterinterface.getArrayLength(obj) * arrayadapterinterface.getElementSizeInBytes();
	//   39   72:aload_0         
	//   40   73:aload_0         
	//   41   74:getfield        #119 <Field int currentSize>
	//   42   77:aload           4
	//   43   79:aload_3         
	//   44   80:invokeinterface #138 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   45   85:aload           4
	//   46   87:invokeinterface #141 <Method int ArrayAdapterInterface.getElementSizeInBytes()>
	//   47   92:imul            
	//   48   93:isub            
	//   49   94:putfield        #119 <Field int currentSize>
		decrementArrayOfSize(arrayadapterinterface.getArrayLength(obj), class1);
	//   50   97:aload_0         
	//   51   98:aload           4
	//   52  100:aload_3         
	//   53  101:invokeinterface #138 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   54  106:aload_2         
	//   55  107:invokespecial   #147 <Method void decrementArrayOfSize(int, Class)>
		this;
	//   56  110:aload_0         
		JVM INSTR monitorexit ;
	//   57  111:monitorexit     
		  goto _L1
	//*  58  112:goto            120
		class1;
	//   59  115:astore_2        
	//*  60  116:aload_0         
		throw class1;
	//   61  117:monitorexit     
	//   62  118:aload_2         
	//   63  119:athrow          
_L1:
		class1 = ((Class) (obj));
	//   64  120:aload_3         
	//   65  121:astore_2        
		if(obj == null)
	//*  66  122:aload_3         
	//*  67  123:ifnonnull       184
		{
			if(Log.isLoggable(arrayadapterinterface.getTag(), 2))
	//*  68  126:aload           4
	//*  69  128:invokeinterface #150 <Method String ArrayAdapterInterface.getTag()>
	//*  70  133:iconst_2        
	//*  71  134:invokestatic    #156 <Method boolean Log.isLoggable(String, int)>
	//*  72  137:ifeq            175
				Log.v(arrayadapterinterface.getTag(), (new StringBuilder()).append("Allocated ").append(i).append(" bytes").toString());
	//   73  140:aload           4
	//   74  142:invokeinterface #150 <Method String ArrayAdapterInterface.getTag()>
	//   75  147:new             #78  <Class StringBuilder>
	//   76  150:dup             
	//   77  151:invokespecial   #79  <Method void StringBuilder()>
	//   78  154:ldc1            #229 <String "Allocated ">
	//   79  156:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   80  159:iload_1         
	//   81  160:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   82  163:ldc1            #231 <String " bytes">
	//   83  165:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   84  168:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   85  171:invokestatic    #162 <Method int Log.v(String, String)>
	//   86  174:pop             
			class1 = ((Class) (arrayadapterinterface.newArray(i)));
	//   87  175:aload           4
	//   88  177:iload_1         
	//   89  178:invokeinterface #235 <Method Object ArrayAdapterInterface.newArray(int)>
	//   90  183:astore_2        
		}
		return ((Object) (class1));
	//   91  184:aload_2         
	//   92  185:areturn         
	}

	int getCurrentSize()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(Iterator iterator = sortedSizes.keySet().iterator(); iterator.hasNext();)
	//*   2    2:aload_0         
	//*   3    3:getfield        #49  <Field Map sortedSizes>
	//*   4    6:invokeinterface #241 <Method Set Map.keySet()>
	//*   5   11:invokeinterface #247 <Method Iterator Set.iterator()>
	//*   6   16:astore_2        
	//*   7   17:aload_2         
	//*   8   18:invokeinterface #252 <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            139
		{
			Class class1 = (Class)iterator.next();
	//   10   26:aload_2         
	//   11   27:invokeinterface #255 <Method Object Iterator.next()>
	//   12   32:checkcast       #190 <Class Class>
	//   13   35:astore_3        
			Iterator iterator1 = ((NavigableMap)sortedSizes.get(((Object) (class1)))).keySet().iterator();
	//   14   36:aload_0         
	//   15   37:getfield        #49  <Field Map sortedSizes>
	//   16   40:aload_3         
	//   17   41:invokeinterface #170 <Method Object Map.get(Object)>
	//   18   46:checkcast       #70  <Class NavigableMap>
	//   19   49:invokeinterface #256 <Method Set NavigableMap.keySet()>
	//   20   54:invokeinterface #247 <Method Iterator Set.iterator()>
	//   21   59:astore          4
			while(iterator1.hasNext()) 
	//*  22   61:aload           4
	//*  23   63:invokeinterface #252 <Method boolean Iterator.hasNext()>
	//*  24   68:ifeq            136
			{
				Integer integer = (Integer)iterator1.next();
	//   25   71:aload           4
	//   26   73:invokeinterface #255 <Method Object Iterator.next()>
	//   27   78:checkcast       #64  <Class Integer>
	//   28   81:astore          5
				ArrayAdapterInterface arrayadapterinterface = getAdapterFromType(class1);
	//   29   83:aload_0         
	//   30   84:aload_3         
	//   31   85:invokespecial   #166 <Method ArrayAdapterInterface getAdapterFromType(Class)>
	//   32   88:astore          6
				i += integer.intValue() * ((Integer)((NavigableMap)sortedSizes.get(((Object) (class1)))).get(((Object) (integer)))).intValue() * arrayadapterinterface.getElementSizeInBytes();
	//   33   90:iload_1         
	//   34   91:aload           5
	//   35   93:invokevirtual   #104 <Method int Integer.intValue()>
	//   36   96:aload_0         
	//   37   97:getfield        #49  <Field Map sortedSizes>
	//   38  100:aload_3         
	//   39  101:invokeinterface #170 <Method Object Map.get(Object)>
	//   40  106:checkcast       #70  <Class NavigableMap>
	//   41  109:aload           5
	//   42  111:invokeinterface #74  <Method Object NavigableMap.get(Object)>
	//   43  116:checkcast       #64  <Class Integer>
	//   44  119:invokevirtual   #104 <Method int Integer.intValue()>
	//   45  122:imul            
	//   46  123:aload           6
	//   47  125:invokeinterface #141 <Method int ArrayAdapterInterface.getElementSizeInBytes()>
	//   48  130:imul            
	//   49  131:iadd            
	//   50  132:istore_1        
			}
		}

	//*  51  133:goto            61
	//*  52  136:goto            17
		return i;
	//   53  139:iload_1         
	//   54  140:ireturn         
	}

	public void put(Object obj, Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		ArrayAdapterInterface arrayadapterinterface = getAdapterFromType(class1);
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #166 <Method ArrayAdapterInterface getAdapterFromType(Class)>
	//    5    7:astore          6
		i = arrayadapterinterface.getArrayLength(obj);
	//    6    9:aload           6
	//    7   11:aload_1         
	//    8   12:invokeinterface #138 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//    9   17:istore_3        
		j = i * arrayadapterinterface.getElementSizeInBytes();
	//   10   18:iload_3         
	//   11   19:aload           6
	//   12   21:invokeinterface #141 <Method int ArrayAdapterInterface.getElementSizeInBytes()>
	//   13   26:imul            
	//   14   27:istore          4
		if(isSmallEnoughForReuse(j))
			break MISSING_BLOCK_LABEL_41;
	//   15   29:aload_0         
	//   16   30:iload           4
	//   17   32:invokespecial   #259 <Method boolean isSmallEnoughForReuse(int)>
	//   18   35:ifne            41
		this;
	//   19   38:aload_0         
		JVM INSTR monitorexit ;
	//   20   39:monitorexit     
		return;
	//   21   40:return          
		int k;
		Key key = keyPool.get(i, class1);
	//   22   41:aload_0         
	//   23   42:getfield        #44  <Field LruArrayPool$KeyPool keyPool>
	//   24   45:iload_3         
	//   25   46:aload_2         
	//   26   47:invokevirtual   #225 <Method LruArrayPool$Key LruArrayPool$KeyPool.get(int, Class)>
	//   27   50:astore          6
		groupedMap.put(((Poolable) (key)), obj);
	//   28   52:aload_0         
	//   29   53:getfield        #41  <Field GroupedLinkedMap groupedMap>
	//   30   56:aload           6
	//   31   58:aload_1         
	//   32   59:invokevirtual   #262 <Method void GroupedLinkedMap.put(Poolable, Object)>
		obj = ((Object) (getSizesForAdapter(class1)));
	//   33   62:aload_0         
	//   34   63:aload_2         
	//   35   64:invokespecial   #62  <Method NavigableMap getSizesForAdapter(Class)>
	//   36   67:astore_1        
		class1 = ((Class) ((Integer)((NavigableMap) (obj)).get(((Object) (Integer.valueOf(key.size))))));
	//   37   68:aload_1         
	//   38   69:aload           6
	//   39   71:getfield        #265 <Field int LruArrayPool$Key.size>
	//   40   74:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   41   77:invokeinterface #74  <Method Object NavigableMap.get(Object)>
	//   42   82:checkcast       #64  <Class Integer>
	//   43   85:astore_2        
		k = key.size;
	//   44   86:aload           6
	//   45   88:getfield        #265 <Field int LruArrayPool$Key.size>
	//   46   91:istore          5
		if(class1 == null)
	//*  47   93:aload_2         
	//*  48   94:ifnonnull       102
		{
			i = 1;
	//   49   97:iconst_1        
	//   50   98:istore_3        
			break MISSING_BLOCK_LABEL_109;
	//   51   99:goto            109
		}
		i = ((Integer) (class1)).intValue() + 1;
	//   52  102:aload_2         
	//   53  103:invokevirtual   #104 <Method int Integer.intValue()>
	//   54  106:iconst_1        
	//   55  107:iadd            
	//   56  108:istore_3        
		((NavigableMap) (obj)).put(((Object) (Integer.valueOf(k))), ((Object) (Integer.valueOf(i))));
	//   57  109:aload_1         
	//   58  110:iload           5
	//   59  112:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   60  115:iload_3         
	//   61  116:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   62  119:invokeinterface #111 <Method Object NavigableMap.put(Object, Object)>
	//   63  124:pop             
		currentSize = currentSize + j;
	//   64  125:aload_0         
	//   65  126:aload_0         
	//   66  127:getfield        #119 <Field int currentSize>
	//   67  130:iload           4
	//   68  132:iadd            
	//   69  133:putfield        #119 <Field int currentSize>
		evict();
	//   70  136:aload_0         
	//   71  137:invokespecial   #267 <Method void evict()>
		this;
	//   72  140:aload_0         
		JVM INSTR monitorexit ;
	//   73  141:monitorexit     
		return;
	//   74  142:return          
		obj;
	//   75  143:astore_1        
	//*  76  144:aload_0         
		throw obj;
	//   77  145:monitorexit     
	//   78  146:aload_1         
	//   79  147:athrow          
	}

	public void trimMemory(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i < 40)
			break MISSING_BLOCK_LABEL_15;
	//    2    2:iload_1         
	//    3    3:bipush          40
	//    4    5:icmplt          15
		clearMemory();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #271 <Method void clearMemory()>
		break MISSING_BLOCK_LABEL_31;
	//    7   12:goto            31
		if(i < 20)
			break MISSING_BLOCK_LABEL_31;
	//    8   15:iload_1         
	//    9   16:bipush          20
	//   10   18:icmplt          31
		evictToSize(maxSize / 2);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #53  <Field int maxSize>
	//   14   26:iconst_2        
	//   15   27:idiv            
	//   16   28:invokespecial   #117 <Method void evictToSize(int)>
		this;
	//   17   31:aload_0         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		Exception exception;
		exception;
	//   20   34:astore_2        
	//*  21   35:aload_0         
		throw exception;
	//   22   36:monitorexit     
	//   23   37:aload_2         
	//   24   38:athrow          
	}

	static final int DEFAULT_SIZE = 0x400000;
	private static final int MAX_OVER_SIZE_MULTIPLE = 8;
	private static final int SINGLE_ARRAY_MAX_SIZE_DIVISOR = 2;
	private final Map adapters;
	private int currentSize;
	private final GroupedLinkedMap groupedMap;
	private final KeyPool keyPool;
	private final int maxSize;
	private final Map sortedSizes;
}
