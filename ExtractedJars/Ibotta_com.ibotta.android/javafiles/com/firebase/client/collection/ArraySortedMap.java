// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.*;

// Referenced classes of package com.firebase.client.collection:
//			ImmutableSortedMap, RBTreeSortedMap

public class ArraySortedMap extends ImmutableSortedMap
{

	public ArraySortedMap(Comparator comparator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ImmutableSortedMap()>
		keys = (Object[])new Object[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:checkcast       #23  <Class Object[]>
	//    6   12:putfield        #25  <Field Object[] keys>
		values = (Object[])new Object[0];
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:anewarray       Object[]
	//   10   20:checkcast       #23  <Class Object[]>
	//   11   23:putfield        #27  <Field Object[] values>
		comparator = comparator1;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #29  <Field Comparator comparator>
	//   15   31:return          
	}

	private ArraySortedMap(Comparator comparator1, Object aobj[], Object aobj1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ImmutableSortedMap()>
		keys = aobj;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #25  <Field Object[] keys>
		values = aobj1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #27  <Field Object[] values>
		comparator = comparator1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #29  <Field Comparator comparator>
	//   11   19:return          
	}

	private static Object[] addToArray(Object aobj[], int i, Object obj)
	{
		int j = aobj.length + 1;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:istore_3        
		Object aobj1[] = (Object[])new Object[j];
	//    5    5:iload_3         
	//    6    6:anewarray       Object[]
	//    7    9:checkcast       #23  <Class Object[]>
	//    8   12:astore          4
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
	//    9   14:aload_0         
	//   10   15:iconst_0        
	//   11   16:aload           4
	//   12   18:iconst_0        
	//   13   19:iload_1         
	//   14   20:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		aobj1[i] = obj;
	//   15   23:aload           4
	//   16   25:iload_1         
	//   17   26:aload_2         
	//   18   27:aastore         
		System.arraycopy(((Object) (aobj)), i, ((Object) (aobj1)), i + 1, j - i - 1);
	//   19   28:aload_0         
	//   20   29:iload_1         
	//   21   30:aload           4
	//   22   32:iload_1         
	//   23   33:iconst_1        
	//   24   34:iadd            
	//   25   35:iload_3         
	//   26   36:iload_1         
	//   27   37:isub            
	//   28   38:iconst_1        
	//   29   39:isub            
	//   30   40:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj1;
	//   31   43:aload           4
	//   32   45:areturn         
	}

	public static ArraySortedMap buildFrom(List list, Map map, ImmutableSortedMap.Builder.KeyTranslator keytranslator, Comparator comparator1)
	{
		Collections.sort(list, comparator1);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokestatic    #54  <Method void Collections.sort(List, Comparator)>
		int i = list.size();
	//    3    5:aload_0         
	//    4    6:invokeinterface #60  <Method int List.size()>
	//    5   11:istore          4
		Object aobj[] = (Object[])new Object[i];
	//    6   13:iload           4
	//    7   15:anewarray       Object[]
	//    8   18:checkcast       #23  <Class Object[]>
	//    9   21:astore          5
		Object aobj1[] = (Object[])new Object[i];
	//   10   23:iload           4
	//   11   25:anewarray       Object[]
	//   12   28:checkcast       #23  <Class Object[]>
	//   13   31:astore          6
		list = ((List) (list.iterator()));
	//   14   33:aload_0         
	//   15   34:invokeinterface #64  <Method Iterator List.iterator()>
	//   16   39:astore_0        
		for(int j = 0; ((Iterator) (list)).hasNext(); j++)
	//*  17   40:iconst_0        
	//*  18   41:istore          4
	//*  19   43:aload_0         
	//*  20   44:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  21   49:ifeq            95
		{
			Object obj = ((Iterator) (list)).next();
	//   22   52:aload_0         
	//   23   53:invokeinterface #74  <Method Object Iterator.next()>
	//   24   58:astore          7
			aobj[j] = obj;
	//   25   60:aload           5
	//   26   62:iload           4
	//   27   64:aload           7
	//   28   66:aastore         
			aobj1[j] = map.get(keytranslator.translate(obj));
	//   29   67:aload           6
	//   30   69:iload           4
	//   31   71:aload_1         
	//   32   72:aload_2         
	//   33   73:aload           7
	//   34   75:invokeinterface #80  <Method Object ImmutableSortedMap$Builder$KeyTranslator.translate(Object)>
	//   35   80:invokeinterface #85  <Method Object Map.get(Object)>
	//   36   85:aastore         
		}

	//   37   86:iload           4
	//   38   88:iconst_1        
	//   39   89:iadd            
	//   40   90:istore          4
	//*  41   92:goto            43
		return new ArraySortedMap(comparator1, aobj, aobj1);
	//   42   95:new             #2   <Class ArraySortedMap>
	//   43   98:dup             
	//   44   99:aload_3         
	//   45  100:aload           5
	//   46  102:aload           6
	//   47  104:invokespecial   #87  <Method void ArraySortedMap(Comparator, Object[], Object[])>
	//   48  107:areturn         
	}

	private int findKey(Object obj)
	{
		Object aobj[] = keys;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] keys>
	//    2    4:astore          5
		int k = aobj.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		int j = 0;
	//    8   13:iconst_0        
	//    9   14:istore_3        
		for(; i < k; i++)
	//*  10   15:iload_2         
	//*  11   16:iload           4
	//*  12   18:icmpge          55
		{
			Object obj1 = aobj[i];
	//   13   21:aload           5
	//   14   23:iload_2         
	//   15   24:aaload          
	//   16   25:astore          6
			if(comparator.compare(obj, obj1) == 0)
	//*  17   27:aload_0         
	//*  18   28:getfield        #29  <Field Comparator comparator>
	//*  19   31:aload_1         
	//*  20   32:aload           6
	//*  21   34:invokeinterface #96  <Method int Comparator.compare(Object, Object)>
	//*  22   39:ifne            44
				return j;
	//   23   42:iload_3         
	//   24   43:ireturn         
			j++;
	//   25   44:iload_3         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore_3        
		}

	//   29   48:iload_2         
	//   30   49:iconst_1        
	//   31   50:iadd            
	//   32   51:istore_2        
	//*  33   52:goto            15
		return -1;
	//   34   55:iconst_m1       
	//   35   56:ireturn         
	}

	private int findKeyOrInsertPosition(Object obj)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			Object aobj[] = keys;
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field Object[] keys>
	//    4    6:astore_3        
			if(i < aobj.length && comparator.compare(aobj[i], obj) < 0)
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          36
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field Comparator comparator>
	//*  11   17:aload_3         
	//*  12   18:iload_2         
	//*  13   19:aaload          
	//*  14   20:aload_1         
	//*  15   21:invokeinterface #96  <Method int Comparator.compare(Object, Object)>
	//*  16   26:ifge            36
				i++;
	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
			else
	//*  21   33:goto            2
				return i;
	//   22   36:iload_2         
	//   23   37:ireturn         
		} while(true);
	}

	public static ArraySortedMap fromMap(Map map, Comparator comparator1)
	{
		return buildFrom(((List) (new ArrayList(((java.util.Collection) (map.keySet()))))), map, ImmutableSortedMap.Builder.identityTranslator(), comparator1);
	//    0    0:new             #102 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #106 <Method java.util.Set Map.keySet()>
	//    4   10:invokespecial   #109 <Method void ArrayList(java.util.Collection)>
	//    5   13:aload_0         
	//    6   14:invokestatic    #115 <Method ImmutableSortedMap$Builder$KeyTranslator ImmutableSortedMap$Builder.identityTranslator()>
	//    7   17:aload_1         
	//    8   18:invokestatic    #117 <Method ArraySortedMap buildFrom(List, Map, ImmutableSortedMap$Builder$KeyTranslator, Comparator)>
	//    9   21:areturn         
	}

	private Iterator iterator(final int pos, final boolean reverse)
	{
		return new Iterator() {

			public boolean hasNext()
			{
				if(reverse)
			//*   0    0:aload_0         
			//*   1    1:getfield        #27  <Field boolean val$reverse>
			//*   2    4:ifeq            16
				{
					if(currentPos >= 0)
			//*   3    7:aload_0         
			//*   4    8:getfield        #32  <Field int currentPos>
			//*   5   11:iflt            33
						return true;
			//    6   14:iconst_1        
			//    7   15:ireturn         
				} else
				if(currentPos < keys.length)
			//*   8   16:aload_0         
			//*   9   17:getfield        #32  <Field int currentPos>
			//*  10   20:aload_0         
			//*  11   21:getfield        #23  <Field ArraySortedMap this$0>
			//*  12   24:invokestatic    #39  <Method Object[] ArraySortedMap.access$000(ArraySortedMap)>
			//*  13   27:arraylength     
			//*  14   28:icmpge          33
					return true;
			//   15   31:iconst_1        
			//   16   32:ireturn         
				return false;
			//   17   33:iconst_0        
			//   18   34:ireturn         
			}

			public volatile Object next()
			{
				return ((Object) (next()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #44  <Method java.util.Map$Entry next()>
			//    2    4:areturn         
			}

			public java.util.Map.Entry next()
			{
				Object obj = keys[currentPos];
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field ArraySortedMap this$0>
			//    2    4:invokestatic    #39  <Method Object[] ArraySortedMap.access$000(ArraySortedMap)>
			//    3    7:aload_0         
			//    4    8:getfield        #32  <Field int currentPos>
			//    5   11:aaload          
			//    6   12:astore_2        
				Object aobj[] = values;
			//    7   13:aload_0         
			//    8   14:getfield        #23  <Field ArraySortedMap this$0>
			//    9   17:invokestatic    #47  <Method Object[] ArraySortedMap.access$100(ArraySortedMap)>
			//   10   20:astore_3        
				int i = currentPos;
			//   11   21:aload_0         
			//   12   22:getfield        #32  <Field int currentPos>
			//   13   25:istore_1        
				Object obj1 = aobj[i];
			//   14   26:aload_3         
			//   15   27:iload_1         
			//   16   28:aaload          
			//   17   29:astore_3        
				if(reverse)
			//*  18   30:aload_0         
			//*  19   31:getfield        #27  <Field boolean val$reverse>
			//*  20   34:ifeq            44
					i--;
			//   21   37:iload_1         
			//   22   38:iconst_1        
			//   23   39:isub            
			//   24   40:istore_1        
				else
			//*  25   41:goto            48
					i++;
			//   26   44:iload_1         
			//   27   45:iconst_1        
			//   28   46:iadd            
			//   29   47:istore_1        
				currentPos = i;
			//   30   48:aload_0         
			//   31   49:iload_1         
			//   32   50:putfield        #32  <Field int currentPos>
				return ((java.util.Map.Entry) (new java.util.AbstractMap.SimpleImmutableEntry(obj, obj1)));
			//   33   53:new             #49  <Class java.util.AbstractMap$SimpleImmutableEntry>
			//   34   56:dup             
			//   35   57:aload_2         
			//   36   58:aload_3         
			//   37   59:invokespecial   #52  <Method void java.util.AbstractMap$SimpleImmutableEntry(Object, Object)>
			//   38   62:areturn         
			}

			public void remove()
			{
				throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
			//    0    0:new             #57  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:ldc1            #59  <String "Can't remove elements from ImmutableSortedMap">
			//    3    6:invokespecial   #62  <Method void UnsupportedOperationException(String)>
			//    4    9:athrow          
			}

			int currentPos;
			final ArraySortedMap this$0;
			final int val$pos;
			final boolean val$reverse;

			
			{
				this$0 = ArraySortedMap.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field ArraySortedMap this$0>
				pos = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #25  <Field int val$pos>
				reverse = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field boolean val$reverse>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
				currentPos = pos;
			//   11   19:aload_0         
			//   12   20:aload_0         
			//   13   21:getfield        #25  <Field int val$pos>
			//   14   24:putfield        #32  <Field int currentPos>
			//   15   27:return          
			}
		}
;
	//    0    0:new             #7   <Class ArraySortedMap$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #122 <Method void ArraySortedMap$1(ArraySortedMap, int, boolean)>
	//    6   10:areturn         
	}

	private static Object[] removeFromArray(Object aobj[], int i)
	{
		int j = aobj.length - 1;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:istore_2        
		Object aobj1[] = (Object[])new Object[j];
	//    5    5:iload_2         
	//    6    6:anewarray       Object[]
	//    7    9:checkcast       #23  <Class Object[]>
	//    8   12:astore_3        
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
	//    9   13:aload_0         
	//   10   14:iconst_0        
	//   11   15:aload_3         
	//   12   16:iconst_0        
	//   13   17:iload_1         
	//   14   18:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj1)), i, j - i);
	//   15   21:aload_0         
	//   16   22:iload_1         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:aload_3         
	//   20   26:iload_1         
	//   21   27:iload_2         
	//   22   28:iload_1         
	//   23   29:isub            
	//   24   30:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj1;
	//   25   33:aload_3         
	//   26   34:areturn         
	}

	private static Object[] replaceInArray(Object aobj[], int i, Object obj)
	{
		int j = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		Object aobj1[] = (Object[])new Object[j];
	//    3    3:iload_3         
	//    4    4:anewarray       Object[]
	//    5    7:checkcast       #23  <Class Object[]>
	//    6   10:astore          4
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, j);
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:aload           4
	//   10   16:iconst_0        
	//   11   17:iload_3         
	//   12   18:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		aobj1[i] = obj;
	//   13   21:aload           4
	//   14   23:iload_1         
	//   15   24:aload_2         
	//   16   25:aastore         
		return aobj1;
	//   17   26:aload           4
	//   18   28:areturn         
	}

	public boolean containsKey(Object obj)
	{
		return findKey(obj) != -1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method int findKey(Object)>
	//    3    5:iconst_m1       
	//    4    6:icmpeq          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public Object get(Object obj)
	{
		int i = findKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method int findKey(Object)>
	//    3    5:istore_2        
		if(i != -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          18
			return values[i];
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field Object[] values>
	//    9   15:iload_2         
	//   10   16:aaload          
	//   11   17:areturn         
		else
			return ((Object) (null));
	//   12   18:aconst_null     
	//   13   19:areturn         
	}

	public Comparator getComparator()
	{
		return comparator;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Comparator comparator>
	//    2    4:areturn         
	}

	public Object getMaxKey()
	{
		Object aobj[] = keys;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] keys>
	//    2    4:astore_1        
		if(aobj.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            17
			return aobj[aobj.length - 1];
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:iconst_1        
	//   10   14:isub            
	//   11   15:aaload          
	//   12   16:areturn         
		else
			return ((Object) (null));
	//   13   17:aconst_null     
	//   14   18:areturn         
	}

	public Object getMinKey()
	{
		Object aobj[] = keys;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] keys>
	//    2    4:astore_1        
		if(aobj.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            14
			return aobj[0];
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:areturn         
		else
			return ((Object) (null));
	//   10   14:aconst_null     
	//   11   15:areturn         
	}

	public Object getPredecessorKey(Object obj)
	{
		int i = findKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method int findKey(Object)>
	//    3    5:istore_2        
		if(i != -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          26
		{
			if(i > 0)
	//*   7   11:iload_2         
	//*   8   12:ifle            24
				return keys[i - 1];
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field Object[] keys>
	//   11   19:iload_2         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:aaload          
	//   15   23:areturn         
			else
				return ((Object) (null));
	//   16   24:aconst_null     
	//   17   25:areturn         
		} else
		{
			throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
	//   18   26:new             #142 <Class IllegalArgumentException>
	//   19   29:dup             
	//   20   30:ldc1            #144 <String "Can't find predecessor of nonexistent key">
	//   21   32:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   22   35:athrow          
		}
	}

	public Object getSuccessorKey(Object obj)
	{
		int i = findKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method int findKey(Object)>
	//    3    5:istore_2        
		if(i != -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          32
		{
			obj = ((Object) (keys));
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field Object[] keys>
	//    9   15:astore_1        
			if(i < obj.length - 1)
	//*  10   16:iload_2         
	//*  11   17:aload_1         
	//*  12   18:arraylength     
	//*  13   19:iconst_1        
	//*  14   20:isub            
	//*  15   21:icmpge          30
				return ((Object) (obj[i + 1]));
	//   16   24:aload_1         
	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:aaload          
	//   21   29:areturn         
			else
				return ((Object) (null));
	//   22   30:aconst_null     
	//   23   31:areturn         
		} else
		{
			throw new IllegalArgumentException("Can't find successor of nonexistent key");
	//   24   32:new             #142 <Class IllegalArgumentException>
	//   25   35:dup             
	//   26   36:ldc1            #151 <String "Can't find successor of nonexistent key">
	//   27   38:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   28   41:athrow          
		}
	}

	public void inOrderTraversal(LLRBNode.NodeVisitor nodevisitor)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			Object aobj[] = keys;
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field Object[] keys>
	//    4    6:astore_3        
			if(i < aobj.length)
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          33
			{
				nodevisitor.visitEntry(aobj[i], values[i]);
	//    9   13:aload_1         
	//   10   14:aload_3         
	//   11   15:iload_2         
	//   12   16:aaload          
	//   13   17:aload_0         
	//   14   18:getfield        #27  <Field Object[] values>
	//   15   21:iload_2         
	//   16   22:aaload          
	//   17   23:invokevirtual   #159 <Method void LLRBNode$NodeVisitor.visitEntry(Object, Object)>
				i++;
	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
			} else
	//*  22   30:goto            2
			{
				return;
	//   23   33:return          
			}
		} while(true);
	}

	public ImmutableSortedMap insert(Object obj, Object obj1)
	{
		int i = findKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method int findKey(Object)>
	//    3    5:istore_3        
		if(i != -1)
	//*   4    6:iload_3         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          67
			if(keys[i] == obj && values[i] == obj1)
	//*   7   11:aload_0         
	//*   8   12:getfield        #25  <Field Object[] keys>
	//*   9   15:iload_3         
	//*  10   16:aaload          
	//*  11   17:aload_1         
	//*  12   18:if_acmpne       33
	//*  13   21:aload_0         
	//*  14   22:getfield        #27  <Field Object[] values>
	//*  15   25:iload_3         
	//*  16   26:aaload          
	//*  17   27:aload_2         
	//*  18   28:if_acmpne       33
			{
				return ((ImmutableSortedMap) (this));
	//   19   31:aload_0         
	//   20   32:areturn         
			} else
			{
				obj = ((Object) (replaceInArray(keys, i, obj)));
	//   21   33:aload_0         
	//   22   34:getfield        #25  <Field Object[] keys>
	//   23   37:iload_3         
	//   24   38:aload_1         
	//   25   39:invokestatic    #164 <Method Object[] replaceInArray(Object[], int, Object)>
	//   26   42:astore_1        
				obj1 = ((Object) (replaceInArray(values, i, obj1)));
	//   27   43:aload_0         
	//   28   44:getfield        #27  <Field Object[] values>
	//   29   47:iload_3         
	//   30   48:aload_2         
	//   31   49:invokestatic    #164 <Method Object[] replaceInArray(Object[], int, Object)>
	//   32   52:astore_2        
				return ((ImmutableSortedMap) (new ArraySortedMap(comparator, ((Object []) (obj)), ((Object []) (obj1)))));
	//   33   53:new             #2   <Class ArraySortedMap>
	//   34   56:dup             
	//   35   57:aload_0         
	//   36   58:getfield        #29  <Field Comparator comparator>
	//   37   61:aload_1         
	//   38   62:aload_2         
	//   39   63:invokespecial   #87  <Method void ArraySortedMap(Comparator, Object[], Object[])>
	//   40   66:areturn         
			}
		Object aobj[] = keys;
	//   41   67:aload_0         
	//   42   68:getfield        #25  <Field Object[] keys>
	//   43   71:astore          4
		if(aobj.length > 25)
	//*  44   73:aload           4
	//*  45   75:arraylength     
	//*  46   76:bipush          25
	//*  47   78:icmple          155
		{
			HashMap hashmap = new HashMap(aobj.length + 1);
	//   48   81:new             #166 <Class HashMap>
	//   49   84:dup             
	//   50   85:aload           4
	//   51   87:arraylength     
	//   52   88:iconst_1        
	//   53   89:iadd            
	//   54   90:invokespecial   #169 <Method void HashMap(int)>
	//   55   93:astore          4
			int j = 0;
	//   56   95:iconst_0        
	//   57   96:istore_3        
			do
			{
				Object aobj1[] = keys;
	//   58   97:aload_0         
	//   59   98:getfield        #25  <Field Object[] keys>
	//   60  101:astore          5
				if(j < aobj1.length)
	//*  61  103:iload_3         
	//*  62  104:aload           5
	//*  63  106:arraylength     
	//*  64  107:icmpge          135
				{
					((Map) (hashmap)).put(aobj1[j], values[j]);
	//   65  110:aload           4
	//   66  112:aload           5
	//   67  114:iload_3         
	//   68  115:aaload          
	//   69  116:aload_0         
	//   70  117:getfield        #27  <Field Object[] values>
	//   71  120:iload_3         
	//   72  121:aaload          
	//   73  122:invokeinterface #173 <Method Object Map.put(Object, Object)>
	//   74  127:pop             
					j++;
	//   75  128:iload_3         
	//   76  129:iconst_1        
	//   77  130:iadd            
	//   78  131:istore_3        
				} else
	//*  79  132:goto            97
				{
					((Map) (hashmap)).put(obj, obj1);
	//   80  135:aload           4
	//   81  137:aload_1         
	//   82  138:aload_2         
	//   83  139:invokeinterface #173 <Method Object Map.put(Object, Object)>
	//   84  144:pop             
					return ((ImmutableSortedMap) (RBTreeSortedMap.fromMap(((Map) (hashmap)), comparator)));
	//   85  145:aload           4
	//   86  147:aload_0         
	//   87  148:getfield        #29  <Field Comparator comparator>
	//   88  151:invokestatic    #178 <Method RBTreeSortedMap RBTreeSortedMap.fromMap(Map, Comparator)>
	//   89  154:areturn         
				}
			} while(true);
		} else
		{
			int k = findKeyOrInsertPosition(obj);
	//   90  155:aload_0         
	//   91  156:aload_1         
	//   92  157:invokespecial   #180 <Method int findKeyOrInsertPosition(Object)>
	//   93  160:istore_3        
			obj = ((Object) (addToArray(keys, k, obj)));
	//   94  161:aload_0         
	//   95  162:getfield        #25  <Field Object[] keys>
	//   96  165:iload_3         
	//   97  166:aload_1         
	//   98  167:invokestatic    #182 <Method Object[] addToArray(Object[], int, Object)>
	//   99  170:astore_1        
			obj1 = ((Object) (addToArray(values, k, obj1)));
	//  100  171:aload_0         
	//  101  172:getfield        #27  <Field Object[] values>
	//  102  175:iload_3         
	//  103  176:aload_2         
	//  104  177:invokestatic    #182 <Method Object[] addToArray(Object[], int, Object)>
	//  105  180:astore_2        
			return ((ImmutableSortedMap) (new ArraySortedMap(comparator, ((Object []) (obj)), ((Object []) (obj1)))));
	//  106  181:new             #2   <Class ArraySortedMap>
	//  107  184:dup             
	//  108  185:aload_0         
	//  109  186:getfield        #29  <Field Comparator comparator>
	//  110  189:aload_1         
	//  111  190:aload_2         
	//  112  191:invokespecial   #87  <Method void ArraySortedMap(Comparator, Object[], Object[])>
	//  113  194:areturn         
		}
	}

	public boolean isEmpty()
	{
		return keys.length == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] keys>
	//    2    4:arraylength     
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Iterator iterator()
	{
		return iterator(0, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokespecial   #186 <Method Iterator iterator(int, boolean)>
	//    4    6:areturn         
	}

	public Iterator iteratorFrom(Object obj)
	{
		return iterator(findKeyOrInsertPosition(obj), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #180 <Method int findKeyOrInsertPosition(Object)>
	//    4    6:iconst_0        
	//    5    7:invokespecial   #186 <Method Iterator iterator(int, boolean)>
	//    6   10:areturn         
	}

	public ImmutableSortedMap remove(Object obj)
	{
		int i = findKey(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method int findKey(Object)>
	//    3    5:istore_2        
		if(i == -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          13
		{
			return ((ImmutableSortedMap) (this));
	//    7   11:aload_0         
	//    8   12:areturn         
		} else
		{
			obj = ((Object) (removeFromArray(keys, i)));
	//    9   13:aload_0         
	//   10   14:getfield        #25  <Field Object[] keys>
	//   11   17:iload_2         
	//   12   18:invokestatic    #194 <Method Object[] removeFromArray(Object[], int)>
	//   13   21:astore_1        
			Object aobj[] = removeFromArray(values, i);
	//   14   22:aload_0         
	//   15   23:getfield        #27  <Field Object[] values>
	//   16   26:iload_2         
	//   17   27:invokestatic    #194 <Method Object[] removeFromArray(Object[], int)>
	//   18   30:astore_3        
			return ((ImmutableSortedMap) (new ArraySortedMap(comparator, ((Object []) (obj)), aobj)));
	//   19   31:new             #2   <Class ArraySortedMap>
	//   20   34:dup             
	//   21   35:aload_0         
	//   22   36:getfield        #29  <Field Comparator comparator>
	//   23   39:aload_1         
	//   24   40:aload_3         
	//   25   41:invokespecial   #87  <Method void ArraySortedMap(Comparator, Object[], Object[])>
	//   26   44:areturn         
		}
	}

	public Iterator reverseIterator()
	{
		return iterator(keys.length - 1, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field Object[] keys>
	//    3    5:arraylength     
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:iconst_1        
	//    7    9:invokespecial   #186 <Method Iterator iterator(int, boolean)>
	//    8   12:areturn         
	}

	public Iterator reverseIteratorFrom(Object obj)
	{
		int i = findKeyOrInsertPosition(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method int findKeyOrInsertPosition(Object)>
	//    3    5:istore_2        
		Object aobj[] = keys;
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field Object[] keys>
	//    6   10:astore_3        
		if(i < aobj.length && comparator.compare(aobj[i], obj) == 0)
	//*   7   11:iload_2         
	//*   8   12:aload_3         
	//*   9   13:arraylength     
	//*  10   14:icmpge          40
	//*  11   17:aload_0         
	//*  12   18:getfield        #29  <Field Comparator comparator>
	//*  13   21:aload_3         
	//*  14   22:iload_2         
	//*  15   23:aaload          
	//*  16   24:aload_1         
	//*  17   25:invokeinterface #96  <Method int Comparator.compare(Object, Object)>
	//*  18   30:ifne            40
			return iterator(i, true);
	//   19   33:aload_0         
	//   20   34:iload_2         
	//   21   35:iconst_1        
	//   22   36:invokespecial   #186 <Method Iterator iterator(int, boolean)>
	//   23   39:areturn         
		else
			return iterator(i - 1, true);
	//   24   40:aload_0         
	//   25   41:iload_2         
	//   26   42:iconst_1        
	//   27   43:isub            
	//   28   44:iconst_1        
	//   29   45:invokespecial   #186 <Method Iterator iterator(int, boolean)>
	//   30   48:areturn         
	}

	public int size()
	{
		return keys.length;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] keys>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	private final Comparator comparator;
	private final Object keys[];
	private final Object values[];


/*
	static Object[] access$000(ArraySortedMap arraysortedmap)
	{
		return arraysortedmap.keys;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object[] keys>
	//    2    4:areturn         
	}

*/


/*
	static Object[] access$100(ArraySortedMap arraysortedmap)
	{
		return arraysortedmap.values;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object[] values>
	//    2    4:areturn         
	}

*/
}
