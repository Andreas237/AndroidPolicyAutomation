// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.*;

public class BeanPropertyMap
	implements Serializable, Iterable
{

	protected BeanPropertyMap(BeanPropertyMap beanpropertymap, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_caseInsensitive = flag;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #35  <Field boolean _caseInsensitive>
		_aliasDefs = beanpropertymap._aliasDefs;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #37  <Field Map _aliasDefs>
	//    8   14:putfield        #37  <Field Map _aliasDefs>
		_aliasMapping = beanpropertymap._aliasMapping;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #39  <Field Map _aliasMapping>
	//   12   22:putfield        #39  <Field Map _aliasMapping>
		beanpropertymap = ((BeanPropertyMap) (beanpropertymap._propsInOrder));
	//   13   25:aload_1         
	//   14   26:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//   15   29:astore_1        
		_propsInOrder = (SettableBeanProperty[])Arrays.copyOf(((Object []) (beanpropertymap)), beanpropertymap.length);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_1         
	//   19   33:arraylength     
	//   20   34:invokestatic    #47  <Method Object[] Arrays.copyOf(Object[], int)>
	//   21   37:checkcast       #48  <Class SettableBeanProperty[]>
	//   22   40:putfield        #41  <Field SettableBeanProperty[] _propsInOrder>
		init(((Collection) (Arrays.asList(((Object []) (_propsInOrder))))));
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//   26   48:invokestatic    #52  <Method List Arrays.asList(Object[])>
	//   27   51:invokevirtual   #56  <Method void init(Collection)>
	//   28   54:return          
	}

	public BeanPropertyMap(boolean flag, Collection collection, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_caseInsensitive = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field boolean _caseInsensitive>
		_propsInOrder = (SettableBeanProperty[])collection.toArray(((Object []) (new SettableBeanProperty[collection.size()])));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_2         
	//    8   12:invokeinterface #64  <Method int Collection.size()>
	//    9   17:anewarray       SettableBeanProperty[]
	//   10   20:invokeinterface #70  <Method Object[] Collection.toArray(Object[])>
	//   11   25:checkcast       #48  <Class SettableBeanProperty[]>
	//   12   28:putfield        #41  <Field SettableBeanProperty[] _propsInOrder>
		_aliasDefs = map;
	//   13   31:aload_0         
	//   14   32:aload_3         
	//   15   33:putfield        #37  <Field Map _aliasDefs>
		_aliasMapping = _buildAliasMapping(map);
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:aload_3         
	//   19   39:invokespecial   #74  <Method Map _buildAliasMapping(Map)>
	//   20   42:putfield        #39  <Field Map _aliasMapping>
		init(collection);
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #56  <Method void init(Collection)>
	//   24   50:return          
	}

	private Map _buildAliasMapping(Map map)
	{
		if(map != null && !map.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          153
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #82  <Method boolean Map.isEmpty()>
	//*   4   10:ifeq            16
	//*   5   13:goto            153
		{
			HashMap hashmap = new HashMap();
	//    6   16:new             #84  <Class HashMap>
	//    7   19:dup             
	//    8   20:invokespecial   #85  <Method void HashMap()>
	//    9   23:astore          4
			for(Iterator iterator1 = map.entrySet().iterator(); iterator1.hasNext();)
	//*  10   25:aload_1         
	//*  11   26:invokeinterface #89  <Method Set Map.entrySet()>
	//*  12   31:invokeinterface #95  <Method Iterator Set.iterator()>
	//*  13   36:astore          5
	//*  14   38:aload           5
	//*  15   40:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  16   45:ifeq            150
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//   17   48:aload           5
	//   18   50:invokeinterface #104 <Method Object Iterator.next()>
	//   19   55:checkcast       #106 <Class java.util.Map$Entry>
	//   20   58:astore_3        
				String s = (String)entry.getKey();
	//   21   59:aload_3         
	//   22   60:invokeinterface #109 <Method Object java.util.Map$Entry.getKey()>
	//   23   65:checkcast       #111 <Class String>
	//   24   68:astore_2        
				map = ((Map) (s));
	//   25   69:aload_2         
	//   26   70:astore_1        
				if(_caseInsensitive)
	//*  27   71:aload_0         
	//*  28   72:getfield        #35  <Field boolean _caseInsensitive>
	//*  29   75:ifeq            83
					map = ((Map) (s.toLowerCase()));
	//   30   78:aload_2         
	//   31   79:invokevirtual   #115 <Method String String.toLowerCase()>
	//   32   82:astore_1        
				Iterator iterator2 = ((List)entry.getValue()).iterator();
	//   33   83:aload_3         
	//   34   84:invokeinterface #118 <Method Object java.util.Map$Entry.getValue()>
	//   35   89:checkcast       #120 <Class List>
	//   36   92:invokeinterface #121 <Method Iterator List.iterator()>
	//   37   97:astore          6
				while(iterator2.hasNext()) 
	//*  38   99:aload           6
	//*  39  101:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  40  106:ifeq            38
				{
					String s2 = ((PropertyName)iterator2.next()).getSimpleName();
	//   41  109:aload           6
	//   42  111:invokeinterface #104 <Method Object Iterator.next()>
	//   43  116:checkcast       #123 <Class PropertyName>
	//   44  119:invokevirtual   #126 <Method String PropertyName.getSimpleName()>
	//   45  122:astore_3        
					String s1 = s2;
	//   46  123:aload_3         
	//   47  124:astore_2        
					if(_caseInsensitive)
	//*  48  125:aload_0         
	//*  49  126:getfield        #35  <Field boolean _caseInsensitive>
	//*  50  129:ifeq            137
						s1 = s2.toLowerCase();
	//   51  132:aload_3         
	//   52  133:invokevirtual   #115 <Method String String.toLowerCase()>
	//   53  136:astore_2        
					((Map) (hashmap)).put(((Object) (s1)), ((Object) (map)));
	//   54  137:aload           4
	//   55  139:aload_2         
	//   56  140:aload_1         
	//   57  141:invokeinterface #130 <Method Object Map.put(Object, Object)>
	//   58  146:pop             
				}
			}

	//*  59  147:goto            99
			return ((Map) (hashmap));
	//   60  150:aload           4
	//   61  152:areturn         
		} else
		{
			return Collections.emptyMap();
	//   62  153:invokestatic    #136 <Method Map Collections.emptyMap()>
	//   63  156:areturn         
		}
	}

	private final SettableBeanProperty _find2(String s, int i, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       22
			return _findWithAlias((String)_aliasMapping.get(((Object) (s))));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field Map _aliasMapping>
	//    5    9:aload_1         
	//    6   10:invokeinterface #143 <Method Object Map.get(Object)>
	//    7   15:checkcast       #111 <Class String>
	//    8   18:invokespecial   #147 <Method SettableBeanProperty _findWithAlias(String)>
	//    9   21:areturn         
		int j = _hashMask + 1;
	//   10   22:aload_0         
	//   11   23:getfield        #149 <Field int _hashMask>
	//   12   26:iconst_1        
	//   13   27:iadd            
	//   14   28:istore          4
		i = (i >> 1) + j << 1;
	//   15   30:iload_2         
	//   16   31:iconst_1        
	//   17   32:ishr            
	//   18   33:iload           4
	//   19   35:iadd            
	//   20   36:iconst_1        
	//   21   37:ishl            
	//   22   38:istore_2        
		obj = _hashArea[i];
	//   23   39:aload_0         
	//   24   40:getfield        #151 <Field Object[] _hashArea>
	//   25   43:iload_2         
	//   26   44:aaload          
	//   27   45:astore_3        
		if(s.equals(obj))
	//*  28   46:aload_1         
	//*  29   47:aload_3         
	//*  30   48:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  31   51:ifeq            66
			return (SettableBeanProperty)_hashArea[i + 1];
	//   32   54:aload_0         
	//   33   55:getfield        #151 <Field Object[] _hashArea>
	//   34   58:iload_2         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:aaload          
	//   38   62:checkcast       #66  <Class SettableBeanProperty>
	//   39   65:areturn         
		if(obj != null)
	//*  40   66:aload_3         
	//*  41   67:ifnull          141
		{
			j = j + (j >> 1) << 1;
	//   42   70:iload           4
	//   43   72:iload           4
	//   44   74:iconst_1        
	//   45   75:ishr            
	//   46   76:iadd            
	//   47   77:iconst_1        
	//   48   78:ishl            
	//   49   79:istore          4
			int k = _spillCount;
	//   50   81:aload_0         
	//   51   82:getfield        #157 <Field int _spillCount>
	//   52   85:istore          5
			for(i = j; i < k + j;)
	//*  53   87:iload           4
	//*  54   89:istore_2        
	//*  55   90:iload_2         
	//*  56   91:iload           5
	//*  57   93:iload           4
	//*  58   95:iadd            
	//*  59   96:icmpge          141
			{
				obj = _hashArea[i];
	//   60   99:aload_0         
	//   61  100:getfield        #151 <Field Object[] _hashArea>
	//   62  103:iload_2         
	//   63  104:aaload          
	//   64  105:astore_3        
				if(obj != s && !s.equals(obj))
	//*  65  106:aload_3         
	//*  66  107:aload_1         
	//*  67  108:if_acmpeq       129
	//*  68  111:aload_1         
	//*  69  112:aload_3         
	//*  70  113:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  71  116:ifeq            122
	//*  72  119:goto            129
					i += 2;
	//   73  122:iload_2         
	//   74  123:iconst_2        
	//   75  124:iadd            
	//   76  125:istore_2        
				else
	//*  77  126:goto            90
					return (SettableBeanProperty)_hashArea[i + 1];
	//   78  129:aload_0         
	//   79  130:getfield        #151 <Field Object[] _hashArea>
	//   80  133:iload_2         
	//   81  134:iconst_1        
	//   82  135:iadd            
	//   83  136:aaload          
	//   84  137:checkcast       #66  <Class SettableBeanProperty>
	//   85  140:areturn         
			}

		}
		return _findWithAlias((String)_aliasMapping.get(((Object) (s))));
	//   86  141:aload_0         
	//   87  142:aload_0         
	//   88  143:getfield        #39  <Field Map _aliasMapping>
	//   89  146:aload_1         
	//   90  147:invokeinterface #143 <Method Object Map.get(Object)>
	//   91  152:checkcast       #111 <Class String>
	//   92  155:invokespecial   #147 <Method SettableBeanProperty _findWithAlias(String)>
	//   93  158:areturn         
	}

	private SettableBeanProperty _find2ViaAlias(String s, int i, Object obj)
	{
		int j = _hashMask + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field int _hashMask>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore          4
		i = (i >> 1) + j << 1;
	//    5    8:iload_2         
	//    6    9:iconst_1        
	//    7   10:ishr            
	//    8   11:iload           4
	//    9   13:iadd            
	//   10   14:iconst_1        
	//   11   15:ishl            
	//   12   16:istore_2        
		obj = _hashArea[i];
	//   13   17:aload_0         
	//   14   18:getfield        #151 <Field Object[] _hashArea>
	//   15   21:iload_2         
	//   16   22:aaload          
	//   17   23:astore_3        
		if(s.equals(obj))
	//*  18   24:aload_1         
	//*  19   25:aload_3         
	//*  20   26:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  21   29:ifeq            44
			return (SettableBeanProperty)_hashArea[i + 1];
	//   22   32:aload_0         
	//   23   33:getfield        #151 <Field Object[] _hashArea>
	//   24   36:iload_2         
	//   25   37:iconst_1        
	//   26   38:iadd            
	//   27   39:aaload          
	//   28   40:checkcast       #66  <Class SettableBeanProperty>
	//   29   43:areturn         
		if(obj != null)
	//*  30   44:aload_3         
	//*  31   45:ifnull          119
		{
			j = j + (j >> 1) << 1;
	//   32   48:iload           4
	//   33   50:iload           4
	//   34   52:iconst_1        
	//   35   53:ishr            
	//   36   54:iadd            
	//   37   55:iconst_1        
	//   38   56:ishl            
	//   39   57:istore          4
			int k = _spillCount;
	//   40   59:aload_0         
	//   41   60:getfield        #157 <Field int _spillCount>
	//   42   63:istore          5
			for(i = j; i < k + j;)
	//*  43   65:iload           4
	//*  44   67:istore_2        
	//*  45   68:iload_2         
	//*  46   69:iload           5
	//*  47   71:iload           4
	//*  48   73:iadd            
	//*  49   74:icmpge          119
			{
				obj = _hashArea[i];
	//   50   77:aload_0         
	//   51   78:getfield        #151 <Field Object[] _hashArea>
	//   52   81:iload_2         
	//   53   82:aaload          
	//   54   83:astore_3        
				if(obj != s && !s.equals(obj))
	//*  55   84:aload_3         
	//*  56   85:aload_1         
	//*  57   86:if_acmpeq       107
	//*  58   89:aload_1         
	//*  59   90:aload_3         
	//*  60   91:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  61   94:ifeq            100
	//*  62   97:goto            107
					i += 2;
	//   63  100:iload_2         
	//   64  101:iconst_2        
	//   65  102:iadd            
	//   66  103:istore_2        
				else
	//*  67  104:goto            68
					return (SettableBeanProperty)_hashArea[i + 1];
	//   68  107:aload_0         
	//   69  108:getfield        #151 <Field Object[] _hashArea>
	//   70  111:iload_2         
	//   71  112:iconst_1        
	//   72  113:iadd            
	//   73  114:aaload          
	//   74  115:checkcast       #66  <Class SettableBeanProperty>
	//   75  118:areturn         
			}

		}
		return null;
	//   76  119:aconst_null     
	//   77  120:areturn         
	}

	private final int _findFromOrdered(SettableBeanProperty settablebeanproperty)
	{
		int j = _propsInOrder.length;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//    2    4:arraylength     
	//    3    5:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          32
			if(_propsInOrder[i] == settablebeanproperty)
	//*   9   13:aload_0         
	//*  10   14:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//*  11   17:iload_2         
	//*  12   18:aaload          
	//*  13   19:aload_1         
	//*  14   20:if_acmpne       25
				return i;
	//   15   23:iload_2         
	//   16   24:ireturn         

	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_2        
	//*  21   29:goto            8
		StringBuilder stringbuilder = new StringBuilder();
	//   22   32:new             #162 <Class StringBuilder>
	//   23   35:dup             
	//   24   36:invokespecial   #163 <Method void StringBuilder()>
	//   25   39:astore          4
		stringbuilder.append("Illegal state: property '");
	//   26   41:aload           4
	//   27   43:ldc1            #165 <String "Illegal state: property '">
	//   28   45:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   29   48:pop             
		stringbuilder.append(settablebeanproperty.getName());
	//   30   49:aload           4
	//   31   51:aload_1         
	//   32   52:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//   33   55:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   34   58:pop             
		stringbuilder.append("' missing from _propsInOrder");
	//   35   59:aload           4
	//   36   61:ldc1            #174 <String "' missing from _propsInOrder">
	//   37   63:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   39   67:new             #176 <Class IllegalStateException>
	//   40   70:dup             
	//   41   71:aload           4
	//   42   73:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   43   76:invokespecial   #182 <Method void IllegalStateException(String)>
	//   44   79:athrow          
	}

	private SettableBeanProperty _findWithAlias(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = _hashCode(s);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #186 <Method int _hashCode(String)>
	//    7   11:istore_2        
		int j = i << 1;
	//    8   12:iload_2         
	//    9   13:iconst_1        
	//   10   14:ishl            
	//   11   15:istore_3        
		Object obj = _hashArea[j];
	//   12   16:aload_0         
	//   13   17:getfield        #151 <Field Object[] _hashArea>
	//   14   20:iload_3         
	//   15   21:aaload          
	//   16   22:astore          4
		if(s.equals(obj))
	//*  17   24:aload_1         
	//*  18   25:aload           4
	//*  19   27:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  20   30:ifeq            45
			return (SettableBeanProperty)_hashArea[j + 1];
	//   21   33:aload_0         
	//   22   34:getfield        #151 <Field Object[] _hashArea>
	//   23   37:iload_3         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:aaload          
	//   27   41:checkcast       #66  <Class SettableBeanProperty>
	//   28   44:areturn         
		if(obj == null)
	//*  29   45:aload           4
	//*  30   47:ifnonnull       52
			return null;
	//   31   50:aconst_null     
	//   32   51:areturn         
		else
			return _find2ViaAlias(s, i, obj);
	//   33   52:aload_0         
	//   34   53:aload_1         
	//   35   54:iload_2         
	//   36   55:aload           4
	//   37   57:invokespecial   #188 <Method SettableBeanProperty _find2ViaAlias(String, int, Object)>
	//   38   60:areturn         
	}

	private final int _hashCode(String s)
	{
		return s.hashCode() & _hashMask;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #191 <Method int String.hashCode()>
	//    2    4:aload_0         
	//    3    5:getfield        #149 <Field int _hashMask>
	//    4    8:iand            
	//    5    9:ireturn         
	}

	private List _properties()
	{
		ArrayList arraylist = new ArrayList(_size);
	//    0    0:new             #195 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #197 <Field int _size>
	//    4    8:invokespecial   #200 <Method void ArrayList(int)>
	//    5   11:astore_3        
		int j = _hashArea.length;
	//    6   12:aload_0         
	//    7   13:getfield        #151 <Field Object[] _hashArea>
	//    8   16:arraylength     
	//    9   17:istore_2        
		for(int i = 1; i < j; i += 2)
	//*  10   18:iconst_1        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          55
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)_hashArea[i];
	//   15   25:aload_0         
	//   16   26:getfield        #151 <Field Object[] _hashArea>
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:checkcast       #66  <Class SettableBeanProperty>
	//   20   34:astore          4
			if(settablebeanproperty != null)
	//*  21   36:aload           4
	//*  22   38:ifnull          48
				arraylist.add(((Object) (settablebeanproperty)));
	//   23   41:aload_3         
	//   24   42:aload           4
	//   25   44:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
	//   26   47:pop             
		}

	//   27   48:iload_1         
	//   28   49:iconst_2        
	//   29   50:iadd            
	//   30   51:istore_1        
	//*  31   52:goto            20
		return ((List) (arraylist));
	//   32   55:aload_3         
	//   33   56:areturn         
	}

	public static BeanPropertyMap construct(Collection collection, boolean flag, Map map)
	{
		return new BeanPropertyMap(flag, collection, map);
	//    0    0:new             #2   <Class BeanPropertyMap>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #208 <Method void BeanPropertyMap(boolean, Collection, Map)>
	//    6   10:areturn         
	}

	private static final int findSize(int i)
	{
		if(i <= 5)
	//*   0    0:iload_0         
	//*   1    1:iconst_5        
	//*   2    2:icmpgt          8
			return 8;
	//    3    5:bipush          8
	//    4    7:ireturn         
		if(i <= 12)
	//*   5    8:iload_0         
	//*   6    9:bipush          12
	//*   7   11:icmpgt          17
			return 16;
	//    8   14:bipush          16
	//    9   16:ireturn         
		int j;
		for(j = 32; j < i + (i >> 2); j += j);
	//   10   17:bipush          32
	//   11   19:istore_1        
	//   12   20:iload_1         
	//   13   21:iload_0         
	//   14   22:iload_0         
	//   15   23:iconst_2        
	//   16   24:ishr            
	//   17   25:iadd            
	//   18   26:icmpge          36
	//   19   29:iload_1         
	//   20   30:iload_1         
	//   21   31:iadd            
	//   22   32:istore_1        
	//*  23   33:goto            20
		return j;
	//   24   36:iload_1         
	//   25   37:ireturn         
	}

	protected SettableBeanProperty _rename(SettableBeanProperty settablebeanproperty, NameTransformer nametransformer)
	{
		if(settablebeanproperty == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return settablebeanproperty;
	//    2    4:aload_1         
	//    3    5:areturn         
		SettableBeanProperty settablebeanproperty1 = settablebeanproperty.withSimpleName(nametransformer.transform(settablebeanproperty.getName()));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//    8   12:invokevirtual   #219 <Method String NameTransformer.transform(String)>
	//    9   15:invokevirtual   #222 <Method SettableBeanProperty SettableBeanProperty.withSimpleName(String)>
	//   10   18:astore_3        
		JsonDeserializer jsondeserializer = settablebeanproperty1.getValueDeserializer();
	//   11   19:aload_3         
	//   12   20:invokevirtual   #226 <Method JsonDeserializer SettableBeanProperty.getValueDeserializer()>
	//   13   23:astore          4
		settablebeanproperty = settablebeanproperty1;
	//   14   25:aload_3         
	//   15   26:astore_1        
		if(jsondeserializer != null)
	//*  16   27:aload           4
	//*  17   29:ifnull          53
		{
			nametransformer = ((NameTransformer) (jsondeserializer.unwrappingDeserializer(nametransformer)));
	//   18   32:aload           4
	//   19   34:aload_2         
	//   20   35:invokevirtual   #232 <Method JsonDeserializer JsonDeserializer.unwrappingDeserializer(NameTransformer)>
	//   21   38:astore_2        
			settablebeanproperty = settablebeanproperty1;
	//   22   39:aload_3         
	//   23   40:astore_1        
			if(nametransformer != jsondeserializer)
	//*  24   41:aload_2         
	//*  25   42:aload           4
	//*  26   44:if_acmpeq       53
				settablebeanproperty = settablebeanproperty1.withValueDeserializer(((JsonDeserializer) (nametransformer)));
	//   27   47:aload_3         
	//   28   48:aload_2         
	//   29   49:invokevirtual   #236 <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(JsonDeserializer)>
	//   30   52:astore_1        
		}
		return settablebeanproperty;
	//   31   53:aload_1         
	//   32   54:areturn         
	}

	public BeanPropertyMap assignIndexes()
	{
		int l = _hashArea.length;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Object[] _hashArea>
	//    2    4:arraylength     
	//    3    5:istore          4
		int i = 1;
	//    4    7:iconst_1        
	//    5    8:istore_1        
		int k;
		for(int j = 0; i < l; j = k)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_1         
	//*   9   12:iload           4
	//*  10   14:icmpge          54
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)_hashArea[i];
	//   11   17:aload_0         
	//   12   18:getfield        #151 <Field Object[] _hashArea>
	//   13   21:iload_1         
	//   14   22:aaload          
	//   15   23:checkcast       #66  <Class SettableBeanProperty>
	//   16   26:astore          5
			k = j;
	//   17   28:iload_2         
	//   18   29:istore_3        
			if(settablebeanproperty != null)
	//*  19   30:aload           5
	//*  20   32:ifnull          45
			{
				settablebeanproperty.assignIndex(j);
	//   21   35:aload           5
	//   22   37:iload_2         
	//   23   38:invokevirtual   #241 <Method void SettableBeanProperty.assignIndex(int)>
				k = j + 1;
	//   24   41:iload_2         
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:istore_3        
			}
			i += 2;
	//   28   45:iload_1         
	//   29   46:iconst_2        
	//   30   47:iadd            
	//   31   48:istore_1        
		}

	//   32   49:iload_3         
	//   33   50:istore_2        
	//*  34   51:goto            11
		return this;
	//   35   54:aload_0         
	//   36   55:areturn         
	}

	public SettableBeanProperty find(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          81
		{
			String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          4
			if(_caseInsensitive)
	//*   4    7:aload_0         
	//*   5    8:getfield        #35  <Field boolean _caseInsensitive>
	//*   6   11:ifeq            20
				s1 = s.toLowerCase();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #115 <Method String String.toLowerCase()>
	//    9   18:astore          4
			int i = s1.hashCode() & _hashMask;
	//   10   20:aload           4
	//   11   22:invokevirtual   #191 <Method int String.hashCode()>
	//   12   25:aload_0         
	//   13   26:getfield        #149 <Field int _hashMask>
	//   14   29:iand            
	//   15   30:istore_2        
			int j = i << 1;
	//   16   31:iload_2         
	//   17   32:iconst_1        
	//   18   33:ishl            
	//   19   34:istore_3        
			s = ((String) (_hashArea[j]));
	//   20   35:aload_0         
	//   21   36:getfield        #151 <Field Object[] _hashArea>
	//   22   39:iload_3         
	//   23   40:aaload          
	//   24   41:astore_1        
			if(s != s1 && !s1.equals(((Object) (s))))
	//*  25   42:aload_1         
	//*  26   43:aload           4
	//*  27   45:if_acmpeq       69
	//*  28   48:aload           4
	//*  29   50:aload_1         
	//*  30   51:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  31   54:ifeq            60
	//*  32   57:goto            69
				return _find2(s1, i, ((Object) (s)));
	//   33   60:aload_0         
	//   34   61:aload           4
	//   35   63:iload_2         
	//   36   64:aload_1         
	//   37   65:invokespecial   #244 <Method SettableBeanProperty _find2(String, int, Object)>
	//   38   68:areturn         
			else
				return (SettableBeanProperty)_hashArea[j + 1];
	//   39   69:aload_0         
	//   40   70:getfield        #151 <Field Object[] _hashArea>
	//   41   73:iload_3         
	//   42   74:iconst_1        
	//   43   75:iadd            
	//   44   76:aaload          
	//   45   77:checkcast       #66  <Class SettableBeanProperty>
	//   46   80:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot pass null property name");
	//   47   81:new             #246 <Class IllegalArgumentException>
	//   48   84:dup             
	//   49   85:ldc1            #248 <String "Cannot pass null property name">
	//   50   87:invokespecial   #249 <Method void IllegalArgumentException(String)>
	//   51   90:athrow          
		}
	}

	public SettableBeanProperty[] getPropertiesInInsertionOrder()
	{
		return _propsInOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//    2    4:areturn         
	}

	protected final String getPropertyName(SettableBeanProperty settablebeanproperty)
	{
		if(_caseInsensitive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean _caseInsensitive>
	//*   2    4:ifeq            15
			return settablebeanproperty.getName().toLowerCase();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//    5   11:invokevirtual   #115 <Method String String.toLowerCase()>
	//    6   14:areturn         
		else
			return settablebeanproperty.getName();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//    9   19:areturn         
	}

	public boolean hasAliases()
	{
		return _aliasDefs.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Map _aliasDefs>
	//    2    4:invokeinterface #82  <Method boolean Map.isEmpty()>
	//    3    9:iconst_1        
	//    4   10:ixor            
	//    5   11:ireturn         
	}

	protected void init(Collection collection)
	{
		_size = collection.size();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #64  <Method int Collection.size()>
	//    3    7:putfield        #197 <Field int _size>
		int k1 = findSize(_size);
	//    4   10:aload_0         
	//    5   11:getfield        #197 <Field int _size>
	//    6   14:invokestatic    #256 <Method int findSize(int)>
	//    7   17:istore          6
		_hashMask = k1 - 1;
	//    8   19:aload_0         
	//    9   20:iload           6
	//   10   22:iconst_1        
	//   11   23:isub            
	//   12   24:putfield        #149 <Field int _hashMask>
		int l1 = (k1 >> 1) + k1;
	//   13   27:iload           6
	//   14   29:iconst_1        
	//   15   30:ishr            
	//   16   31:iload           6
	//   17   33:iadd            
	//   18   34:istore          7
		Object aobj[] = new Object[l1 * 2];
	//   19   36:iload           7
	//   20   38:iconst_2        
	//   21   39:imul            
	//   22   40:anewarray       Object[]
	//   23   43:astore          9
		Iterator iterator1 = collection.iterator();
	//   24   45:aload_1         
	//   25   46:invokeinterface #257 <Method Iterator Collection.iterator()>
	//   26   51:astore          10
		int k = 0;
	//   27   53:iconst_0        
	//   28   54:istore          4
		collection = ((Collection) (aobj));
	//   29   56:aload           9
	//   30   58:astore_1        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   31   59:aload           10
	//   32   61:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//   33   66:ifeq            224
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator1.next();
	//   34   69:aload           10
	//   35   71:invokeinterface #104 <Method Object Iterator.next()>
	//   36   76:checkcast       #66  <Class SettableBeanProperty>
	//   37   79:astore          11
			if(settablebeanproperty != null)
	//*  38   81:aload           11
	//*  39   83:ifnonnull       89
	//*  40   86:goto            59
			{
				String s = getPropertyName(settablebeanproperty);
	//   41   89:aload_0         
	//   42   90:aload           11
	//   43   92:invokevirtual   #259 <Method String getPropertyName(SettableBeanProperty)>
	//   44   95:astore          12
				int i2 = _hashCode(s);
	//   45   97:aload_0         
	//   46   98:aload           12
	//   47  100:invokespecial   #186 <Method int _hashCode(String)>
	//   48  103:istore          8
				int l = i2 << 1;
	//   49  105:iload           8
	//   50  107:iconst_1        
	//   51  108:ishl            
	//   52  109:istore          5
				Object obj = ((Object) (collection));
	//   53  111:aload_1         
	//   54  112:astore          9
				int j = k;
	//   55  114:iload           4
	//   56  116:istore_3        
				int i = l;
	//   57  117:iload           5
	//   58  119:istore_2        
				if(collection[l] != null)
	//*  59  120:aload_1         
	//*  60  121:iload           5
	//*  61  123:aaload          
	//*  62  124:ifnull          201
				{
					int i1 = (i2 >> 1) + k1 << 1;
	//   63  127:iload           8
	//   64  129:iconst_1        
	//   65  130:ishr            
	//   66  131:iload           6
	//   67  133:iadd            
	//   68  134:iconst_1        
	//   69  135:ishl            
	//   70  136:istore          5
					obj = ((Object) (collection));
	//   71  138:aload_1         
	//   72  139:astore          9
					j = k;
	//   73  141:iload           4
	//   74  143:istore_3        
					i = i1;
	//   75  144:iload           5
	//   76  146:istore_2        
					if(collection[i1] != null)
	//*  77  147:aload_1         
	//*  78  148:iload           5
	//*  79  150:aaload          
	//*  80  151:ifnull          201
					{
						int j1 = (l1 << 1) + k;
	//   81  154:iload           7
	//   82  156:iconst_1        
	//   83  157:ishl            
	//   84  158:iload           4
	//   85  160:iadd            
	//   86  161:istore          5
						k += 2;
	//   87  163:iload           4
	//   88  165:iconst_2        
	//   89  166:iadd            
	//   90  167:istore          4
						obj = ((Object) (collection));
	//   91  169:aload_1         
	//   92  170:astore          9
						j = k;
	//   93  172:iload           4
	//   94  174:istore_3        
						i = j1;
	//   95  175:iload           5
	//   96  177:istore_2        
						if(j1 >= collection.length)
	//*  97  178:iload           5
	//*  98  180:aload_1         
	//*  99  181:arraylength     
	//* 100  182:icmplt          201
						{
							obj = ((Object) (Arrays.copyOf(((Object []) (collection)), collection.length + 4)));
	//  101  185:aload_1         
	//  102  186:aload_1         
	//  103  187:arraylength     
	//  104  188:iconst_4        
	//  105  189:iadd            
	//  106  190:invokestatic    #47  <Method Object[] Arrays.copyOf(Object[], int)>
	//  107  193:astore          9
							i = j1;
	//  108  195:iload           5
	//  109  197:istore_2        
							j = k;
	//  110  198:iload           4
	//  111  200:istore_3        
						}
					}
				}
				obj[i] = ((/*<invalid signature>*/java.lang.Object) (s));
	//  112  201:aload           9
	//  113  203:iload_2         
	//  114  204:aload           12
	//  115  206:aastore         
				obj[i + 1] = ((/*<invalid signature>*/java.lang.Object) (settablebeanproperty));
	//  116  207:aload           9
	//  117  209:iload_2         
	//  118  210:iconst_1        
	//  119  211:iadd            
	//  120  212:aload           11
	//  121  214:aastore         
				collection = ((Collection) (obj));
	//  122  215:aload           9
	//  123  217:astore_1        
				k = j;
	//  124  218:iload_3         
	//  125  219:istore          4
			}
		} while(true);
	//  126  221:goto            59
		_hashArea = ((Object []) (collection));
	//  127  224:aload_0         
	//  128  225:aload_1         
	//  129  226:putfield        #151 <Field Object[] _hashArea>
		_spillCount = k;
	//  130  229:aload_0         
	//  131  230:iload           4
	//  132  232:putfield        #157 <Field int _spillCount>
	//  133  235:return          
	}

	public boolean isCaseInsensitive()
	{
		return _caseInsensitive;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean _caseInsensitive>
	//    2    4:ireturn         
	}

	public Iterator iterator()
	{
		return _properties().iterator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method List _properties()>
	//    2    4:invokeinterface #121 <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public void remove(SettableBeanProperty settablebeanproperty)
	{
		ArrayList arraylist = new ArrayList(_size);
	//    0    0:new             #195 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #197 <Field int _size>
	//    4    8:invokespecial   #200 <Method void ArrayList(int)>
	//    5   11:astore          6
		String s = getPropertyName(settablebeanproperty);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #259 <Method String getPropertyName(SettableBeanProperty)>
	//    9   18:astore          7
		int j = _hashArea.length;
	//   10   20:aload_0         
	//   11   21:getfield        #151 <Field Object[] _hashArea>
	//   12   24:arraylength     
	//   13   25:istore_3        
		int i = 1;
	//   14   26:iconst_1        
	//   15   27:istore_2        
		boolean flag;
		boolean flag1;
		for(flag1 = false; i < j; flag1 = flag)
	//*  16   28:iconst_0        
	//*  17   29:istore          5
	//*  18   31:iload_2         
	//*  19   32:iload_3         
	//*  20   33:icmpge          132
		{
label0:
			{
				Object aobj[] = _hashArea;
	//   21   36:aload_0         
	//   22   37:getfield        #151 <Field Object[] _hashArea>
	//   23   40:astore          8
				SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)aobj[i];
	//   24   42:aload           8
	//   25   44:iload_2         
	//   26   45:aaload          
	//   27   46:checkcast       #66  <Class SettableBeanProperty>
	//   28   49:astore          9
				if(settablebeanproperty1 == null)
	//*  29   51:aload           9
	//*  30   53:ifnonnull       63
				{
					flag = flag1;
	//   31   56:iload           5
	//   32   58:istore          4
					break label0;
	//   33   60:goto            121
				}
				flag = flag1;
	//   34   63:iload           5
	//   35   65:istore          4
				if(!flag1)
	//*  36   67:iload           5
	//*  37   69:ifne            113
				{
					flag1 = s.equals(aobj[i - 1]);
	//   38   72:aload           7
	//   39   74:aload           8
	//   40   76:iload_2         
	//   41   77:iconst_1        
	//   42   78:isub            
	//   43   79:aaload          
	//   44   80:invokevirtual   #155 <Method boolean String.equals(Object)>
	//   45   83:istore          5
					flag = flag1;
	//   46   85:iload           5
	//   47   87:istore          4
					if(flag1)
	//*  48   89:iload           5
	//*  49   91:ifeq            113
					{
						_propsInOrder[_findFromOrdered(settablebeanproperty1)] = null;
	//   50   94:aload_0         
	//   51   95:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//   52   98:aload_0         
	//   53   99:aload           9
	//   54  101:invokespecial   #268 <Method int _findFromOrdered(SettableBeanProperty)>
	//   55  104:aconst_null     
	//   56  105:aastore         
						flag = flag1;
	//   57  106:iload           5
	//   58  108:istore          4
						break label0;
	//   59  110:goto            121
					}
				}
				arraylist.add(((Object) (settablebeanproperty1)));
	//   60  113:aload           6
	//   61  115:aload           9
	//   62  117:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
	//   63  120:pop             
			}
			i += 2;
	//   64  121:iload_2         
	//   65  122:iconst_2        
	//   66  123:iadd            
	//   67  124:istore_2        
		}

	//   68  125:iload           4
	//   69  127:istore          5
	//*  70  129:goto            31
		if(flag1)
	//*  71  132:iload           5
	//*  72  134:ifeq            144
		{
			init(((Collection) (arraylist)));
	//   73  137:aload_0         
	//   74  138:aload           6
	//   75  140:invokevirtual   #56  <Method void init(Collection)>
			return;
	//   76  143:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   77  144:new             #162 <Class StringBuilder>
	//   78  147:dup             
	//   79  148:invokespecial   #163 <Method void StringBuilder()>
	//   80  151:astore          6
			stringbuilder.append("No entry '");
	//   81  153:aload           6
	//   82  155:ldc2            #270 <String "No entry '">
	//   83  158:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   84  161:pop             
			stringbuilder.append(settablebeanproperty.getName());
	//   85  162:aload           6
	//   86  164:aload_1         
	//   87  165:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//   88  168:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   89  171:pop             
			stringbuilder.append("' found, can't remove");
	//   90  172:aload           6
	//   91  174:ldc2            #272 <String "' found, can't remove">
	//   92  177:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   93  180:pop             
			throw new NoSuchElementException(stringbuilder.toString());
	//   94  181:new             #274 <Class NoSuchElementException>
	//   95  184:dup             
	//   96  185:aload           6
	//   97  187:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   98  190:invokespecial   #275 <Method void NoSuchElementException(String)>
	//   99  193:athrow          
		}
	}

	public BeanPropertyMap renameAll(NameTransformer nametransformer)
	{
		if(nametransformer != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          98
		{
			if(nametransformer == NameTransformer.NOP)
	//*   2    4:aload_1         
	//*   3    5:getstatic       #281 <Field NameTransformer NameTransformer.NOP>
	//*   4    8:if_acmpne       13
				return this;
	//    5   11:aload_0         
	//    6   12:areturn         
			int j = _propsInOrder.length;
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//    9   17:arraylength     
	//   10   18:istore_3        
			ArrayList arraylist = new ArrayList(j);
	//   11   19:new             #195 <Class ArrayList>
	//   12   22:dup             
	//   13   23:iload_3         
	//   14   24:invokespecial   #200 <Method void ArrayList(int)>
	//   15   27:astore          4
			for(int i = 0; i < j; i++)
	//*  16   29:iconst_0        
	//*  17   30:istore_2        
	//*  18   31:iload_2         
	//*  19   32:iload_3         
	//*  20   33:icmpge          80
			{
				SettableBeanProperty settablebeanproperty = _propsInOrder[i];
	//   21   36:aload_0         
	//   22   37:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//   23   40:iload_2         
	//   24   41:aaload          
	//   25   42:astore          5
				if(settablebeanproperty == null)
	//*  26   44:aload           5
	//*  27   46:ifnonnull       60
					arraylist.add(((Object) (settablebeanproperty)));
	//   28   49:aload           4
	//   29   51:aload           5
	//   30   53:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
	//   31   56:pop             
				else
	//*  32   57:goto            73
					arraylist.add(((Object) (_rename(settablebeanproperty, nametransformer))));
	//   33   60:aload           4
	//   34   62:aload_0         
	//   35   63:aload           5
	//   36   65:aload_1         
	//   37   66:invokevirtual   #283 <Method SettableBeanProperty _rename(SettableBeanProperty, NameTransformer)>
	//   38   69:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
	//   39   72:pop             
			}

	//   40   73:iload_2         
	//   41   74:iconst_1        
	//   42   75:iadd            
	//   43   76:istore_2        
	//*  44   77:goto            31
			return new BeanPropertyMap(_caseInsensitive, ((Collection) (arraylist)), _aliasDefs);
	//   45   80:new             #2   <Class BeanPropertyMap>
	//   46   83:dup             
	//   47   84:aload_0         
	//   48   85:getfield        #35  <Field boolean _caseInsensitive>
	//   49   88:aload           4
	//   50   90:aload_0         
	//   51   91:getfield        #37  <Field Map _aliasDefs>
	//   52   94:invokespecial   #208 <Method void BeanPropertyMap(boolean, Collection, Map)>
	//   53   97:areturn         
		} else
		{
			return this;
	//   54   98:aload_0         
	//   55   99:areturn         
		}
	}

	public void replace(SettableBeanProperty settablebeanproperty, SettableBeanProperty settablebeanproperty1)
	{
		int j = _hashArea.length;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Object[] _hashArea>
	//    2    4:arraylength     
	//    3    5:istore          4
		for(int i = 1; i <= j; i += 2)
	//*   4    7:iconst_1        
	//*   5    8:istore_3        
	//*   6    9:iload_3         
	//*   7   10:iload           4
	//*   8   12:icmpgt          53
		{
			Object aobj[] = _hashArea;
	//    9   15:aload_0         
	//   10   16:getfield        #151 <Field Object[] _hashArea>
	//   11   19:astore          5
			if(aobj[i] == settablebeanproperty)
	//*  12   21:aload           5
	//*  13   23:iload_3         
	//*  14   24:aaload          
	//*  15   25:aload_1         
	//*  16   26:if_acmpne       46
			{
				aobj[i] = ((Object) (settablebeanproperty1));
	//   17   29:aload           5
	//   18   31:iload_3         
	//   19   32:aload_2         
	//   20   33:aastore         
				_propsInOrder[_findFromOrdered(settablebeanproperty)] = settablebeanproperty1;
	//   21   34:aload_0         
	//   22   35:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//   23   38:aload_0         
	//   24   39:aload_1         
	//   25   40:invokespecial   #268 <Method int _findFromOrdered(SettableBeanProperty)>
	//   26   43:aload_2         
	//   27   44:aastore         
				return;
	//   28   45:return          
			}
		}

	//   29   46:iload_3         
	//   30   47:iconst_2        
	//   31   48:iadd            
	//   32   49:istore_3        
	//*  33   50:goto            9
		settablebeanproperty1 = ((SettableBeanProperty) (new StringBuilder()));
	//   34   53:new             #162 <Class StringBuilder>
	//   35   56:dup             
	//   36   57:invokespecial   #163 <Method void StringBuilder()>
	//   37   60:astore_2        
		((StringBuilder) (settablebeanproperty1)).append("No entry '");
	//   38   61:aload_2         
	//   39   62:ldc2            #270 <String "No entry '">
	//   40   65:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   41   68:pop             
		((StringBuilder) (settablebeanproperty1)).append(settablebeanproperty.getName());
	//   42   69:aload_2         
	//   43   70:aload_1         
	//   44   71:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//   45   74:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   46   77:pop             
		((StringBuilder) (settablebeanproperty1)).append("' found, can't replace");
	//   47   78:aload_2         
	//   48   79:ldc2            #287 <String "' found, can't replace">
	//   49   82:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   50   85:pop             
		throw new NoSuchElementException(((StringBuilder) (settablebeanproperty1)).toString());
	//   51   86:new             #274 <Class NoSuchElementException>
	//   52   89:dup             
	//   53   90:aload_2         
	//   54   91:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   55   94:invokespecial   #275 <Method void NoSuchElementException(String)>
	//   56   97:athrow          
	}

	public int size()
	{
		return _size;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field int _size>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #162 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Properties=[");
	//    4    8:aload_2         
	//    5    9:ldc2            #289 <String "Properties=[">
	//    6   12:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		Iterator iterator1 = iterator();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #290 <Method Iterator iterator()>
	//   10   20:astore_3        
		for(int i = 0; iterator1.hasNext(); i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:aload_3         
	//*  14   24:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  15   29:ifeq            96
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator1.next();
	//   16   32:aload_3         
	//   17   33:invokeinterface #104 <Method Object Iterator.next()>
	//   18   38:checkcast       #66  <Class SettableBeanProperty>
	//   19   41:astore          4
			if(i > 0)
	//*  20   43:iload_1         
	//*  21   44:ifle            55
				stringbuilder.append(", ");
	//   22   47:aload_2         
	//   23   48:ldc2            #292 <String ", ">
	//   24   51:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   25   54:pop             
			stringbuilder.append(settablebeanproperty.getName());
	//   26   55:aload_2         
	//   27   56:aload           4
	//   28   58:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//   29   61:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   30   64:pop             
			stringbuilder.append('(');
	//   31   65:aload_2         
	//   32   66:bipush          40
	//   33   68:invokevirtual   #295 <Method StringBuilder StringBuilder.append(char)>
	//   34   71:pop             
			stringbuilder.append(((Object) (settablebeanproperty.getType())));
	//   35   72:aload_2         
	//   36   73:aload           4
	//   37   75:invokevirtual   #299 <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//   38   78:invokevirtual   #302 <Method StringBuilder StringBuilder.append(Object)>
	//   39   81:pop             
			stringbuilder.append(')');
	//   40   82:aload_2         
	//   41   83:bipush          41
	//   42   85:invokevirtual   #295 <Method StringBuilder StringBuilder.append(char)>
	//   43   88:pop             
		}

	//   44   89:iload_1         
	//   45   90:iconst_1        
	//   46   91:iadd            
	//   47   92:istore_1        
	//*  48   93:goto            23
		stringbuilder.append(']');
	//   49   96:aload_2         
	//   50   97:bipush          93
	//   51   99:invokevirtual   #295 <Method StringBuilder StringBuilder.append(char)>
	//   52  102:pop             
		if(!_aliasDefs.isEmpty())
	//*  53  103:aload_0         
	//*  54  104:getfield        #37  <Field Map _aliasDefs>
	//*  55  107:invokeinterface #82  <Method boolean Map.isEmpty()>
	//*  56  112:ifne            140
		{
			stringbuilder.append("(aliases: ");
	//   57  115:aload_2         
	//   58  116:ldc2            #304 <String "(aliases: ">
	//   59  119:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   60  122:pop             
			stringbuilder.append(((Object) (_aliasDefs)));
	//   61  123:aload_2         
	//   62  124:aload_0         
	//   63  125:getfield        #37  <Field Map _aliasDefs>
	//   64  128:invokevirtual   #302 <Method StringBuilder StringBuilder.append(Object)>
	//   65  131:pop             
			stringbuilder.append(")");
	//   66  132:aload_2         
	//   67  133:ldc2            #306 <String ")">
	//   68  136:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   69  139:pop             
		}
		return stringbuilder.toString();
	//   70  140:aload_2         
	//   71  141:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   72  144:areturn         
	}

	public BeanPropertyMap withCaseInsensitivity(boolean flag)
	{
		if(_caseInsensitive == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean _caseInsensitive>
	//*   2    4:iload_1         
	//*   3    5:icmpne          10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new BeanPropertyMap(this, flag);
	//    6   10:new             #2   <Class BeanPropertyMap>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #310 <Method void BeanPropertyMap(BeanPropertyMap, boolean)>
	//   11   19:areturn         
	}

	public BeanPropertyMap withProperty(SettableBeanProperty settablebeanproperty)
	{
		String s = getPropertyName(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #259 <Method String getPropertyName(SettableBeanProperty)>
	//    3    5:astore          6
		int k = _hashArea.length;
	//    4    7:aload_0         
	//    5    8:getfield        #151 <Field Object[] _hashArea>
	//    6   11:arraylength     
	//    7   12:istore_3        
		for(int i = 1; i < k; i += 2)
	//*   8   13:iconst_1        
	//*   9   14:istore_2        
	//*  10   15:iload_2         
	//*  11   16:iload_3         
	//*  12   17:icmpge          77
		{
			SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)_hashArea[i];
	//   13   20:aload_0         
	//   14   21:getfield        #151 <Field Object[] _hashArea>
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:checkcast       #66  <Class SettableBeanProperty>
	//   18   29:astore          7
			if(settablebeanproperty1 != null && settablebeanproperty1.getName().equals(((Object) (s))))
	//*  19   31:aload           7
	//*  20   33:ifnull          70
	//*  21   36:aload           7
	//*  22   38:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//*  23   41:aload           6
	//*  24   43:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*  25   46:ifeq            70
			{
				_hashArea[i] = ((Object) (settablebeanproperty));
	//   26   49:aload_0         
	//   27   50:getfield        #151 <Field Object[] _hashArea>
	//   28   53:iload_2         
	//   29   54:aload_1         
	//   30   55:aastore         
				_propsInOrder[_findFromOrdered(settablebeanproperty1)] = settablebeanproperty;
	//   31   56:aload_0         
	//   32   57:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//   33   60:aload_0         
	//   34   61:aload           7
	//   35   63:invokespecial   #268 <Method int _findFromOrdered(SettableBeanProperty)>
	//   36   66:aload_1         
	//   37   67:aastore         
				return this;
	//   38   68:aload_0         
	//   39   69:areturn         
			}
		}

	//   40   70:iload_2         
	//   41   71:iconst_2        
	//   42   72:iadd            
	//   43   73:istore_2        
	//*  44   74:goto            15
		int k1 = _hashCode(s);
	//   45   77:aload_0         
	//   46   78:aload           6
	//   47   80:invokespecial   #186 <Method int _hashCode(String)>
	//   48   83:istore          5
		int j1 = _hashMask + 1;
	//   49   85:aload_0         
	//   50   86:getfield        #149 <Field int _hashMask>
	//   51   89:iconst_1        
	//   52   90:iadd            
	//   53   91:istore          4
		k = k1 << 1;
	//   54   93:iload           5
	//   55   95:iconst_1        
	//   56   96:ishl            
	//   57   97:istore_3        
		Object aobj[] = _hashArea;
	//   58   98:aload_0         
	//   59   99:getfield        #151 <Field Object[] _hashArea>
	//   60  102:astore          7
		int j = k;
	//   61  104:iload_3         
	//   62  105:istore_2        
		if(aobj[k] != null)
	//*  63  106:aload           7
	//*  64  108:iload_3         
	//*  65  109:aaload          
	//*  66  110:ifnull          181
		{
			int l = (k1 >> 1) + j1 << 1;
	//   67  113:iload           5
	//   68  115:iconst_1        
	//   69  116:ishr            
	//   70  117:iload           4
	//   71  119:iadd            
	//   72  120:iconst_1        
	//   73  121:ishl            
	//   74  122:istore_3        
			j = l;
	//   75  123:iload_3         
	//   76  124:istore_2        
			if(aobj[l] != null)
	//*  77  125:aload           7
	//*  78  127:iload_3         
	//*  79  128:aaload          
	//*  80  129:ifnull          181
			{
				j = _spillCount;
	//   81  132:aload_0         
	//   82  133:getfield        #157 <Field int _spillCount>
	//   83  136:istore_2        
				int i1 = (j1 + (j1 >> 1) << 1) + j;
	//   84  137:iload           4
	//   85  139:iload           4
	//   86  141:iconst_1        
	//   87  142:ishr            
	//   88  143:iadd            
	//   89  144:iconst_1        
	//   90  145:ishl            
	//   91  146:iload_2         
	//   92  147:iadd            
	//   93  148:istore_3        
				_spillCount = j + 2;
	//   94  149:aload_0         
	//   95  150:iload_2         
	//   96  151:iconst_2        
	//   97  152:iadd            
	//   98  153:putfield        #157 <Field int _spillCount>
				j = i1;
	//   99  156:iload_3         
	//  100  157:istore_2        
				if(i1 >= aobj.length)
	//* 101  158:iload_3         
	//* 102  159:aload           7
	//* 103  161:arraylength     
	//* 104  162:icmplt          181
				{
					_hashArea = Arrays.copyOf(aobj, aobj.length + 4);
	//  105  165:aload_0         
	//  106  166:aload           7
	//  107  168:aload           7
	//  108  170:arraylength     
	//  109  171:iconst_4        
	//  110  172:iadd            
	//  111  173:invokestatic    #47  <Method Object[] Arrays.copyOf(Object[], int)>
	//  112  176:putfield        #151 <Field Object[] _hashArea>
					j = i1;
	//  113  179:iload_3         
	//  114  180:istore_2        
				}
			}
		}
		aobj = _hashArea;
	//  115  181:aload_0         
	//  116  182:getfield        #151 <Field Object[] _hashArea>
	//  117  185:astore          7
		aobj[j] = ((Object) (s));
	//  118  187:aload           7
	//  119  189:iload_2         
	//  120  190:aload           6
	//  121  192:aastore         
		aobj[j + 1] = ((Object) (settablebeanproperty));
	//  122  193:aload           7
	//  123  195:iload_2         
	//  124  196:iconst_1        
	//  125  197:iadd            
	//  126  198:aload_1         
	//  127  199:aastore         
		SettableBeanProperty asettablebeanproperty[] = _propsInOrder;
	//  128  200:aload_0         
	//  129  201:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//  130  204:astore          6
		j = asettablebeanproperty.length;
	//  131  206:aload           6
	//  132  208:arraylength     
	//  133  209:istore_2        
		_propsInOrder = (SettableBeanProperty[])Arrays.copyOf(((Object []) (asettablebeanproperty)), j + 1);
	//  134  210:aload_0         
	//  135  211:aload           6
	//  136  213:iload_2         
	//  137  214:iconst_1        
	//  138  215:iadd            
	//  139  216:invokestatic    #47  <Method Object[] Arrays.copyOf(Object[], int)>
	//  140  219:checkcast       #48  <Class SettableBeanProperty[]>
	//  141  222:putfield        #41  <Field SettableBeanProperty[] _propsInOrder>
		_propsInOrder[j] = settablebeanproperty;
	//  142  225:aload_0         
	//  143  226:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//  144  229:iload_2         
	//  145  230:aload_1         
	//  146  231:aastore         
		return this;
	//  147  232:aload_0         
	//  148  233:areturn         
	}

	public BeanPropertyMap withoutProperties(Collection collection)
	{
		if(collection.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #315 <Method boolean Collection.isEmpty()>
	//*   2    6:ifeq            11
			return this;
	//    3    9:aload_0         
	//    4   10:areturn         
		int j = _propsInOrder.length;
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//    7   15:arraylength     
	//    8   16:istore_3        
		ArrayList arraylist = new ArrayList(j);
	//    9   17:new             #195 <Class ArrayList>
	//   10   20:dup             
	//   11   21:iload_3         
	//   12   22:invokespecial   #200 <Method void ArrayList(int)>
	//   13   25:astore          4
		for(int i = 0; i < j; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:iload_3         
	//*  18   31:icmpge          76
		{
			SettableBeanProperty settablebeanproperty = _propsInOrder[i];
	//   19   34:aload_0         
	//   20   35:getfield        #41  <Field SettableBeanProperty[] _propsInOrder>
	//   21   38:iload_2         
	//   22   39:aaload          
	//   23   40:astore          5
			if(settablebeanproperty != null && !collection.contains(((Object) (settablebeanproperty.getName()))))
	//*  24   42:aload           5
	//*  25   44:ifnull          69
	//*  26   47:aload_1         
	//*  27   48:aload           5
	//*  28   50:invokevirtual   #172 <Method String SettableBeanProperty.getName()>
	//*  29   53:invokeinterface #318 <Method boolean Collection.contains(Object)>
	//*  30   58:ifne            69
				arraylist.add(((Object) (settablebeanproperty)));
	//   31   61:aload           4
	//   32   63:aload           5
	//   33   65:invokevirtual   #203 <Method boolean ArrayList.add(Object)>
	//   34   68:pop             
		}

	//   35   69:iload_2         
	//   36   70:iconst_1        
	//   37   71:iadd            
	//   38   72:istore_2        
	//*  39   73:goto            29
		return new BeanPropertyMap(_caseInsensitive, ((Collection) (arraylist)), _aliasDefs);
	//   40   76:new             #2   <Class BeanPropertyMap>
	//   41   79:dup             
	//   42   80:aload_0         
	//   43   81:getfield        #35  <Field boolean _caseInsensitive>
	//   44   84:aload           4
	//   45   86:aload_0         
	//   46   87:getfield        #37  <Field Map _aliasDefs>
	//   47   90:invokespecial   #208 <Method void BeanPropertyMap(boolean, Collection, Map)>
	//   48   93:areturn         
	}

	private static final long serialVersionUID = 2L;
	private final Map _aliasDefs;
	private final Map _aliasMapping;
	protected final boolean _caseInsensitive;
	private Object _hashArea[];
	private int _hashMask;
	private SettableBeanProperty _propsInOrder[];
	private int _size;
	private int _spillCount;
}
