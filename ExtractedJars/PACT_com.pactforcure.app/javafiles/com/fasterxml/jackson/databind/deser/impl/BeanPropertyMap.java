// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class BeanPropertyMap
	implements Iterable, Serializable
{

	public BeanPropertyMap(boolean flag, Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		_caseInsensitive = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field boolean _caseInsensitive>
		_propsInOrder = (SettableBeanProperty[])collection.toArray(((Object []) (new SettableBeanProperty[collection.size()])));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_2         
	//    8   12:invokeinterface #36  <Method int Collection.size()>
	//    9   17:anewarray       SettableBeanProperty[]
	//   10   20:invokeinterface #42  <Method Object[] Collection.toArray(Object[])>
	//   11   25:checkcast       #43  <Class SettableBeanProperty[]>
	//   12   28:putfield        #45  <Field SettableBeanProperty[] _propsInOrder>
		init(collection);
	//   13   31:aload_0         
	//   14   32:aload_2         
	//   15   33:invokevirtual   #49  <Method void init(Collection)>
	//   16   36:return          
	}

	private final SettableBeanProperty _find2(String s, int i, Object obj)
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:ifnonnull       6
_L1:
		return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
_L2:
		int j = _hashMask + 1;
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field int _hashMask>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:istore          4
		i = (i >> 1) + j << 1;
	//    9   14:iload_2         
	//   10   15:iconst_1        
	//   11   16:ishr            
	//   12   17:iload           4
	//   13   19:iadd            
	//   14   20:iconst_1        
	//   15   21:ishl            
	//   16   22:istore_2        
		obj = _hashArea[i];
	//   17   23:aload_0         
	//   18   24:getfield        #58  <Field Object[] _hashArea>
	//   19   27:iload_2         
	//   20   28:aaload          
	//   21   29:astore_3        
		if(s.equals(obj))
	//*  22   30:aload_1         
	//*  23   31:aload_3         
	//*  24   32:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  25   35:ifeq            50
			return (SettableBeanProperty)_hashArea[i + 1];
	//   26   38:aload_0         
	//   27   39:getfield        #58  <Field Object[] _hashArea>
	//   28   42:iload_2         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:aaload          
	//   32   46:checkcast       #38  <Class SettableBeanProperty>
	//   33   49:areturn         
		if(obj != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          4
		{
			j = (j >> 1) + j << 1;
	//   36   54:iload           4
	//   37   56:iconst_1        
	//   38   57:ishr            
	//   39   58:iload           4
	//   40   60:iadd            
	//   41   61:iconst_1        
	//   42   62:ishl            
	//   43   63:istore          4
			int k = _spillCount;
	//   44   65:aload_0         
	//   45   66:getfield        #66  <Field int _spillCount>
	//   46   69:istore          5
			i = j;
	//   47   71:iload           4
	//   48   73:istore_2        
			while(i < j + k) 
	//*  49   74:iload_2         
	//*  50   75:iload           4
	//*  51   77:iload           5
	//*  52   79:iadd            
	//*  53   80:icmpge          4
			{
				obj = _hashArea[i];
	//   54   83:aload_0         
	//   55   84:getfield        #58  <Field Object[] _hashArea>
	//   56   87:iload_2         
	//   57   88:aaload          
	//   58   89:astore_3        
				if(obj == s || s.equals(obj))
	//*  59   90:aload_3         
	//*  60   91:aload_1         
	//*  61   92:if_acmpeq       103
	//*  62   95:aload_1         
	//*  63   96:aload_3         
	//*  64   97:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  65  100:ifeq            115
					return (SettableBeanProperty)_hashArea[i + 1];
	//   66  103:aload_0         
	//   67  104:getfield        #58  <Field Object[] _hashArea>
	//   68  107:iload_2         
	//   69  108:iconst_1        
	//   70  109:iadd            
	//   71  110:aaload          
	//   72  111:checkcast       #38  <Class SettableBeanProperty>
	//   73  114:areturn         
				i += 2;
	//   74  115:iload_2         
	//   75  116:iconst_2        
	//   76  117:iadd            
	//   77  118:istore_2        
			}
		}
		if(true) goto _L1; else goto _L3
	//   78  119:goto            74
_L3:
	}

	private final int _findFromOrdered(SettableBeanProperty settablebeanproperty)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = _propsInOrder.length; i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//*   4    6:arraylength     
	//*   5    7:istore_3        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          32
			if(_propsInOrder[i] == settablebeanproperty)
	//*   9   13:aload_0         
	//*  10   14:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
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
		throw new IllegalStateException((new StringBuilder()).append("Illegal state: property '").append(settablebeanproperty.getName()).append("' missing from _propsInOrder").toString());
	//   22   32:new             #70  <Class IllegalStateException>
	//   23   35:dup             
	//   24   36:new             #72  <Class StringBuilder>
	//   25   39:dup             
	//   26   40:invokespecial   #73  <Method void StringBuilder()>
	//   27   43:ldc1            #75  <String "Illegal state: property '">
	//   28   45:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   29   48:aload_1         
	//   30   49:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//   31   52:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   32   55:ldc1            #85  <String "' missing from _propsInOrder">
	//   33   57:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   34   60:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   35   63:invokespecial   #91  <Method void IllegalStateException(String)>
	//   36   66:athrow          
	}

	private final int _findIndexInHash(String s)
	{
		int i = _hashCode(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method int _hashCode(String)>
	//    3    5:istore_2        
		int k = i << 1;
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:ishl            
	//    7    9:istore_3        
		if(s.equals(_hashArea[k]))
	//*   8   10:aload_1         
	//*   9   11:aload_0         
	//*  10   12:getfield        #58  <Field Object[] _hashArea>
	//*  11   15:iload_3         
	//*  12   16:aaload          
	//*  13   17:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  14   20:ifeq            27
			return k + 1;
	//   15   23:iload_3         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:ireturn         
		k = _hashMask + 1;
	//   19   27:aload_0         
	//   20   28:getfield        #56  <Field int _hashMask>
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_3        
		i = (i >> 1) + k << 1;
	//   24   34:iload_2         
	//   25   35:iconst_1        
	//   26   36:ishr            
	//   27   37:iload_3         
	//   28   38:iadd            
	//   29   39:iconst_1        
	//   30   40:ishl            
	//   31   41:istore_2        
		if(s.equals(_hashArea[i]))
	//*  32   42:aload_1         
	//*  33   43:aload_0         
	//*  34   44:getfield        #58  <Field Object[] _hashArea>
	//*  35   47:iload_2         
	//*  36   48:aaload          
	//*  37   49:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  38   52:ifeq            59
			return i + 1;
	//   39   55:iload_2         
	//   40   56:iconst_1        
	//   41   57:iadd            
	//   42   58:ireturn         
		k = (k >> 1) + k << 1;
	//   43   59:iload_3         
	//   44   60:iconst_1        
	//   45   61:ishr            
	//   46   62:iload_3         
	//   47   63:iadd            
	//   48   64:iconst_1        
	//   49   65:ishl            
	//   50   66:istore_3        
		int l = _spillCount;
	//   51   67:aload_0         
	//   52   68:getfield        #66  <Field int _spillCount>
	//   53   71:istore          4
		for(int j = k; j < k + l; j += 2)
	//*  54   73:iload_3         
	//*  55   74:istore_2        
	//*  56   75:iload_2         
	//*  57   76:iload_3         
	//*  58   77:iload           4
	//*  59   79:iadd            
	//*  60   80:icmpge          107
			if(s.equals(_hashArea[j]))
	//*  61   83:aload_1         
	//*  62   84:aload_0         
	//*  63   85:getfield        #58  <Field Object[] _hashArea>
	//*  64   88:iload_2         
	//*  65   89:aaload          
	//*  66   90:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  67   93:ifeq            100
				return j + 1;
	//   68   96:iload_2         
	//   69   97:iconst_1        
	//   70   98:iadd            
	//   71   99:ireturn         

	//   72  100:iload_2         
	//   73  101:iconst_2        
	//   74  102:iadd            
	//   75  103:istore_2        
	//*  76  104:goto            75
		return -1;
	//   77  107:iconst_m1       
	//   78  108:ireturn         
	}

	private final int _hashCode(String s)
	{
		return s.hashCode() & _hashMask;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #99  <Method int String.hashCode()>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field int _hashMask>
	//    4    8:iand            
	//    5    9:ireturn         
	}

	public static BeanPropertyMap construct(Collection collection, boolean flag)
	{
		return new BeanPropertyMap(flag, collection);
	//    0    0:new             #2   <Class BeanPropertyMap>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #103 <Method void BeanPropertyMap(boolean, Collection)>
	//    5    9:areturn         
	}

	private static final int findSize(int i)
	{
		if(i > 5) goto _L2; else goto _L1
	//    0    0:iload_0         
	//    1    1:iconst_5        
	//    2    2:icmpgt          10
_L1:
		byte byte0 = 8;
	//    3    5:bipush          8
	//    4    7:istore_2        
_L4:
		return ((int) (byte0));
	//    5    8:iload_2         
	//    6    9:ireturn         
_L2:
		if(i <= 12)
	//*   7   10:iload_0         
	//*   8   11:bipush          12
	//*   9   13:icmpgt          19
			return 16;
	//   10   16:bipush          16
	//   11   18:ireturn         
		int j = 32;
	//   12   19:bipush          32
	//   13   21:istore_1        
		do
		{
			byte0 = ((byte) (j));
	//   14   22:iload_1         
	//   15   23:istore_2        
			if(j >= i + (i >> 2))
				continue;
	//   16   24:iload_1         
	//   17   25:iload_0         
	//   18   26:iload_0         
	//   19   27:iconst_2        
	//   20   28:ishr            
	//   21   29:iadd            
	//   22   30:icmpge          8
			j += j;
	//   23   33:iload_1         
	//   24   34:iload_1         
	//   25   35:iadd            
	//   26   36:istore_1        
		} while(true);
	//   27   37:goto            22
		if(true) goto _L4; else goto _L3
_L3:
	}

	private List properties()
	{
		ArrayList arraylist = new ArrayList(_size);
	//    0    0:new             #110 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field int _size>
	//    4    8:invokespecial   #115 <Method void ArrayList(int)>
	//    5   11:astore_3        
		int i = 1;
	//    6   12:iconst_1        
	//    7   13:istore_1        
		for(int j = _hashArea.length; i < j; i += 2)
	//*   8   14:aload_0         
	//*   9   15:getfield        #58  <Field Object[] _hashArea>
	//*  10   18:arraylength     
	//*  11   19:istore_2        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          55
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)_hashArea[i];
	//   15   25:aload_0         
	//   16   26:getfield        #58  <Field Object[] _hashArea>
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:checkcast       #38  <Class SettableBeanProperty>
	//   20   34:astore          4
			if(settablebeanproperty != null)
	//*  21   36:aload           4
	//*  22   38:ifnull          48
				arraylist.add(((Object) (settablebeanproperty)));
	//   23   41:aload_3         
	//   24   42:aload           4
	//   25   44:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
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
	//    7    9:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//    8   12:invokevirtual   #127 <Method String NameTransformer.transform(String)>
	//    9   15:invokevirtual   #131 <Method SettableBeanProperty SettableBeanProperty.withSimpleName(String)>
	//   10   18:astore_3        
		JsonDeserializer jsondeserializer = settablebeanproperty1.getValueDeserializer();
	//   11   19:aload_3         
	//   12   20:invokevirtual   #135 <Method JsonDeserializer SettableBeanProperty.getValueDeserializer()>
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
	//   20   35:invokevirtual   #141 <Method JsonDeserializer JsonDeserializer.unwrappingDeserializer(NameTransformer)>
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
	//   29   49:invokevirtual   #145 <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(JsonDeserializer)>
	//   30   52:astore_1        
		}
		return settablebeanproperty;
	//   31   53:aload_1         
	//   32   54:areturn         
	}

	public BeanPropertyMap assignIndexes()
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		int l = _hashArea.length;
	//    2    2:aload_0         
	//    3    3:getfield        #58  <Field Object[] _hashArea>
	//    4    6:arraylength     
	//    5    7:istore          4
		int i = 0;
	//    6    9:iconst_0        
	//    7   10:istore_1        
		for(; j < l; j += 2)
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          52
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)_hashArea[j];
	//   11   17:aload_0         
	//   12   18:getfield        #58  <Field Object[] _hashArea>
	//   13   21:iload_2         
	//   14   22:aaload          
	//   15   23:checkcast       #38  <Class SettableBeanProperty>
	//   16   26:astore          5
			if(settablebeanproperty != null)
	//*  17   28:aload           5
	//*  18   30:ifnull          54
			{
				int k = i + 1;
	//   19   33:iload_1         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_3        
				settablebeanproperty.assignIndex(i);
	//   23   37:aload           5
	//   24   39:iload_1         
	//   25   40:invokevirtual   #150 <Method void SettableBeanProperty.assignIndex(int)>
				i = k;
	//   26   43:iload_3         
	//   27   44:istore_1        
			}
		}

	//   28   45:iload_2         
	//   29   46:iconst_2        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            11
		return this;
	//   33   52:aload_0         
	//   34   53:areturn         
	//*  35   54:goto            45
	}

	public SettableBeanProperty find(int i)
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		for(int k = _hashArea.length; j < k; j += 2)
	//*   2    2:aload_0         
	//*   3    3:getfield        #58  <Field Object[] _hashArea>
	//*   4    6:arraylength     
	//*   5    7:istore_3        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          48
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)_hashArea[j];
	//    9   13:aload_0         
	//   10   14:getfield        #58  <Field Object[] _hashArea>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:checkcast       #38  <Class SettableBeanProperty>
	//   14   22:astore          4
			if(settablebeanproperty != null && i == settablebeanproperty.getPropertyIndex())
	//*  15   24:aload           4
	//*  16   26:ifnull          41
	//*  17   29:iload_1         
	//*  18   30:aload           4
	//*  19   32:invokevirtual   #155 <Method int SettableBeanProperty.getPropertyIndex()>
	//*  20   35:icmpne          41
				return settablebeanproperty;
	//   21   38:aload           4
	//   22   40:areturn         
		}

	//   23   41:iload_2         
	//   24   42:iconst_2        
	//   25   43:iadd            
	//   26   44:istore_2        
	//*  27   45:goto            8
		return null;
	//   28   48:aconst_null     
	//   29   49:areturn         
	}

	public SettableBeanProperty find(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Can not pass null property name");
	//    2    4:new             #157 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #159 <String "Can not pass null property name">
	//    5   10:invokespecial   #160 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		String s1 = s;
	//    7   14:aload_1         
	//    8   15:astore          4
		if(_caseInsensitive)
	//*   9   17:aload_0         
	//*  10   18:getfield        #30  <Field boolean _caseInsensitive>
	//*  11   21:ifeq            30
			s1 = s.toLowerCase();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #163 <Method String String.toLowerCase()>
	//   14   28:astore          4
		int i = s1.hashCode() & _hashMask;
	//   15   30:aload           4
	//   16   32:invokevirtual   #99  <Method int String.hashCode()>
	//   17   35:aload_0         
	//   18   36:getfield        #56  <Field int _hashMask>
	//   19   39:iand            
	//   20   40:istore_2        
		int j = i << 1;
	//   21   41:iload_2         
	//   22   42:iconst_1        
	//   23   43:ishl            
	//   24   44:istore_3        
		s = ((String) (_hashArea[j]));
	//   25   45:aload_0         
	//   26   46:getfield        #58  <Field Object[] _hashArea>
	//   27   49:iload_3         
	//   28   50:aaload          
	//   29   51:astore_1        
		if(s == s1 || s1.equals(((Object) (s))))
	//*  30   52:aload_1         
	//*  31   53:aload           4
	//*  32   55:if_acmpeq       67
	//*  33   58:aload           4
	//*  34   60:aload_1         
	//*  35   61:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  36   64:ifeq            79
			return (SettableBeanProperty)_hashArea[j + 1];
	//   37   67:aload_0         
	//   38   68:getfield        #58  <Field Object[] _hashArea>
	//   39   71:iload_3         
	//   40   72:iconst_1        
	//   41   73:iadd            
	//   42   74:aaload          
	//   43   75:checkcast       #38  <Class SettableBeanProperty>
	//   44   78:areturn         
		else
			return _find2(s1, i, ((Object) (s)));
	//   45   79:aload_0         
	//   46   80:aload           4
	//   47   82:iload_2         
	//   48   83:aload_1         
	//   49   84:invokespecial   #165 <Method SettableBeanProperty _find2(String, int, Object)>
	//   50   87:areturn         
	}

	public boolean findDeserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
		throws IOException
	{
		SettableBeanProperty settablebeanproperty = find(s);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokevirtual   #173 <Method SettableBeanProperty find(String)>
	//    3    6:astore          5
		if(settablebeanproperty == null)
	//*   4    8:aload           5
	//*   5   10:ifnonnull       15
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		try
		{
			settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
	//    8   15:aload           5
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #177 <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
		}
	//*  13   23:iconst_1        
	//*  14   24:ireturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  15   25:astore_1        
		{
			wrapAndThrow(((Throwable) (jsonparser)), obj, s, deserializationcontext);
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:aload_3         
	//   19   29:aload           4
	//   20   31:aload_2         
	//   21   32:invokevirtual   #181 <Method void wrapAndThrow(Throwable, Object, String, DeserializationContext)>
		}
		return true;
	//*  22   35:goto            23
	}

	public SettableBeanProperty[] getPropertiesInInsertionOrder()
	{
		return _propsInOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//    2    4:areturn         
	}

	protected final String getPropertyName(SettableBeanProperty settablebeanproperty)
	{
		if(_caseInsensitive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean _caseInsensitive>
	//*   2    4:ifeq            15
			return settablebeanproperty.getName().toLowerCase();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//    5   11:invokevirtual   #163 <Method String String.toLowerCase()>
	//    6   14:areturn         
		else
			return settablebeanproperty.getName();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//    9   19:areturn         
	}

	protected void init(Collection collection)
	{
		_size = collection.size();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #36  <Method int Collection.size()>
	//    3    7:putfield        #112 <Field int _size>
		int k1 = findSize(_size);
	//    4   10:aload_0         
	//    5   11:getfield        #112 <Field int _size>
	//    6   14:invokestatic    #188 <Method int findSize(int)>
	//    7   17:istore          6
		_hashMask = k1 - 1;
	//    8   19:aload_0         
	//    9   20:iload           6
	//   10   22:iconst_1        
	//   11   23:isub            
	//   12   24:putfield        #56  <Field int _hashMask>
		Object aobj[] = new Object[((k1 >> 1) + k1) * 2];
	//   13   27:iload           6
	//   14   29:iconst_1        
	//   15   30:ishr            
	//   16   31:iload           6
	//   17   33:iadd            
	//   18   34:iconst_2        
	//   19   35:imul            
	//   20   36:anewarray       Object[]
	//   21   39:astore          8
		int k = 0;
	//   22   41:iconst_0        
	//   23   42:istore          4
		Iterator iterator1 = collection.iterator();
	//   24   44:aload_1         
	//   25   45:invokeinterface #192 <Method Iterator Collection.iterator()>
	//   26   50:astore          9
		collection = ((Collection) (aobj));
	//   27   52:aload           8
	//   28   54:astore_1        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   29   55:aload           9
	//   30   57:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//   31   62:ifeq            222
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator1.next();
	//   32   65:aload           9
	//   33   67:invokeinterface #202 <Method Object Iterator.next()>
	//   34   72:checkcast       #38  <Class SettableBeanProperty>
	//   35   75:astore          10
			if(settablebeanproperty != null)
	//*  36   77:aload           10
	//*  37   79:ifnull          55
			{
				String s = getPropertyName(settablebeanproperty);
	//   38   82:aload_0         
	//   39   83:aload           10
	//   40   85:invokevirtual   #204 <Method String getPropertyName(SettableBeanProperty)>
	//   41   88:astore          11
				int l1 = _hashCode(s);
	//   42   90:aload_0         
	//   43   91:aload           11
	//   44   93:invokespecial   #96  <Method int _hashCode(String)>
	//   45   96:istore          7
				int l = l1 << 1;
	//   46   98:iload           7
	//   47  100:iconst_1        
	//   48  101:ishl            
	//   49  102:istore          5
				Object obj = ((Object) (collection));
	//   50  104:aload_1         
	//   51  105:astore          8
				int i = l;
	//   52  107:iload           5
	//   53  109:istore_2        
				int j = k;
	//   54  110:iload           4
	//   55  112:istore_3        
				if(collection[l] != null)
	//*  56  113:aload_1         
	//*  57  114:iload           5
	//*  58  116:aaload          
	//*  59  117:ifnull          199
				{
					int i1 = (l1 >> 1) + k1 << 1;
	//   60  120:iload           7
	//   61  122:iconst_1        
	//   62  123:ishr            
	//   63  124:iload           6
	//   64  126:iadd            
	//   65  127:iconst_1        
	//   66  128:ishl            
	//   67  129:istore          5
					obj = ((Object) (collection));
	//   68  131:aload_1         
	//   69  132:astore          8
					i = i1;
	//   70  134:iload           5
	//   71  136:istore_2        
					j = k;
	//   72  137:iload           4
	//   73  139:istore_3        
					if(collection[i1] != null)
	//*  74  140:aload_1         
	//*  75  141:iload           5
	//*  76  143:aaload          
	//*  77  144:ifnull          199
					{
						int j1 = ((k1 >> 1) + k1 << 1) + k;
	//   78  147:iload           6
	//   79  149:iconst_1        
	//   80  150:ishr            
	//   81  151:iload           6
	//   82  153:iadd            
	//   83  154:iconst_1        
	//   84  155:ishl            
	//   85  156:iload           4
	//   86  158:iadd            
	//   87  159:istore          5
						k += 2;
	//   88  161:iload           4
	//   89  163:iconst_2        
	//   90  164:iadd            
	//   91  165:istore          4
						obj = ((Object) (collection));
	//   92  167:aload_1         
	//   93  168:astore          8
						i = j1;
	//   94  170:iload           5
	//   95  172:istore_2        
						j = k;
	//   96  173:iload           4
	//   97  175:istore_3        
						if(j1 >= collection.length)
	//*  98  176:iload           5
	//*  99  178:aload_1         
	//* 100  179:arraylength     
	//* 101  180:icmplt          199
						{
							obj = ((Object) (Arrays.copyOf(((Object []) (collection)), collection.length + 4)));
	//  102  183:aload_1         
	//  103  184:aload_1         
	//  104  185:arraylength     
	//  105  186:iconst_4        
	//  106  187:iadd            
	//  107  188:invokestatic    #210 <Method Object[] Arrays.copyOf(Object[], int)>
	//  108  191:astore          8
							j = k;
	//  109  193:iload           4
	//  110  195:istore_3        
							i = j1;
	//  111  196:iload           5
	//  112  198:istore_2        
						}
					}
				}
				obj[i] = ((/*<invalid signature>*/java.lang.Object) (s));
	//  113  199:aload           8
	//  114  201:iload_2         
	//  115  202:aload           11
	//  116  204:aastore         
				obj[i + 1] = ((/*<invalid signature>*/java.lang.Object) (settablebeanproperty));
	//  117  205:aload           8
	//  118  207:iload_2         
	//  119  208:iconst_1        
	//  120  209:iadd            
	//  121  210:aload           10
	//  122  212:aastore         
				collection = ((Collection) (obj));
	//  123  213:aload           8
	//  124  215:astore_1        
				k = j;
	//  125  216:iload_3         
	//  126  217:istore          4
			}
		} while(true);
	//  127  219:goto            55
		_hashArea = ((Object []) (collection));
	//  128  222:aload_0         
	//  129  223:aload_1         
	//  130  224:putfield        #58  <Field Object[] _hashArea>
		_spillCount = k;
	//  131  227:aload_0         
	//  132  228:iload           4
	//  133  230:putfield        #66  <Field int _spillCount>
	//  134  233:return          
	}

	public Iterator iterator()
	{
		return properties().iterator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #213 <Method List properties()>
	//    2    4:invokeinterface #216 <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public void remove(SettableBeanProperty settablebeanproperty)
	{
		int i;
		int j;
		boolean flag1;
		ArrayList arraylist;
		String s;
		arraylist = new ArrayList(_size);
	//    0    0:new             #110 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field int _size>
	//    4    8:invokespecial   #115 <Method void ArrayList(int)>
	//    5   11:astore          6
		s = getPropertyName(settablebeanproperty);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #204 <Method String getPropertyName(SettableBeanProperty)>
	//    9   18:astore          7
		flag1 = false;
	//   10   20:iconst_0        
	//   11   21:istore          5
		i = 1;
	//   12   23:iconst_1        
	//   13   24:istore_2        
		j = _hashArea.length;
	//   14   25:aload_0         
	//   15   26:getfield        #58  <Field Object[] _hashArea>
	//   16   29:arraylength     
	//   17   30:istore_3        
_L2:
		boolean flag;
		SettableBeanProperty settablebeanproperty1;
		if(i >= j)
			break MISSING_BLOCK_LABEL_127;
	//   18   31:iload_2         
	//   19   32:iload_3         
	//   20   33:icmpge          127
		settablebeanproperty1 = (SettableBeanProperty)_hashArea[i];
	//   21   36:aload_0         
	//   22   37:getfield        #58  <Field Object[] _hashArea>
	//   23   40:iload_2         
	//   24   41:aaload          
	//   25   42:checkcast       #38  <Class SettableBeanProperty>
	//   26   45:astore          8
		if(settablebeanproperty1 != null)
			break; /* Loop/switch isn't completed */
	//   27   47:aload           8
	//   28   49:ifnonnull       67
		flag = flag1;
	//   29   52:iload           5
	//   30   54:istore          4
_L3:
		i += 2;
	//   31   56:iload_2         
	//   32   57:iconst_2        
	//   33   58:iadd            
	//   34   59:istore_2        
		flag1 = flag;
	//   35   60:iload           4
	//   36   62:istore          5
		if(true) goto _L2; else goto _L1
	//   37   64:goto            31
_L1:
label0:
		{
			flag = flag1;
	//   38   67:iload           5
	//   39   69:istore          4
			if(flag1)
				break label0;
	//   40   71:iload           5
	//   41   73:ifne            116
			flag1 = s.equals(((Object) (settablebeanproperty1.getName())));
	//   42   76:aload           7
	//   43   78:aload           8
	//   44   80:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//   45   83:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   46   86:istore          5
			flag = flag1;
	//   47   88:iload           5
	//   48   90:istore          4
			if(!flag1)
				break label0;
	//   49   92:iload           5
	//   50   94:ifeq            116
			_propsInOrder[_findFromOrdered(settablebeanproperty1)] = null;
	//   51   97:aload_0         
	//   52   98:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//   53  101:aload_0         
	//   54  102:aload           8
	//   55  104:invokespecial   #221 <Method int _findFromOrdered(SettableBeanProperty)>
	//   56  107:aconst_null     
	//   57  108:aastore         
			flag = flag1;
	//   58  109:iload           5
	//   59  111:istore          4
		}
		  goto _L3
	//*  60  113:goto            56
		arraylist.add(((Object) (settablebeanproperty1)));
	//   61  116:aload           6
	//   62  118:aload           8
	//   63  120:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   64  123:pop             
		  goto _L3
	//*  65  124:goto            56
		if(!flag1)
	//*  66  127:iload           5
	//*  67  129:ifne            167
		{
			throw new NoSuchElementException((new StringBuilder()).append("No entry '").append(settablebeanproperty.getName()).append("' found, can't remove").toString());
	//   68  132:new             #223 <Class NoSuchElementException>
	//   69  135:dup             
	//   70  136:new             #72  <Class StringBuilder>
	//   71  139:dup             
	//   72  140:invokespecial   #73  <Method void StringBuilder()>
	//   73  143:ldc1            #225 <String "No entry '">
	//   74  145:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   75  148:aload_1         
	//   76  149:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//   77  152:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   78  155:ldc1            #227 <String "' found, can't remove">
	//   79  157:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   80  160:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   81  163:invokespecial   #228 <Method void NoSuchElementException(String)>
	//   82  166:athrow          
		} else
		{
			init(((Collection) (arraylist)));
	//   83  167:aload_0         
	//   84  168:aload           6
	//   85  170:invokevirtual   #49  <Method void init(Collection)>
			return;
	//   86  173:return          
		}
	}

	public BeanPropertyMap renameAll(NameTransformer nametransformer)
	{
		if(nametransformer == null || nametransformer == NameTransformer.NOP)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:getstatic       #234 <Field NameTransformer NameTransformer.NOP>
	//*   4    8:if_acmpne       13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		int j = _propsInOrder.length;
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//    9   17:arraylength     
	//   10   18:istore_3        
		ArrayList arraylist = new ArrayList(j);
	//   11   19:new             #110 <Class ArrayList>
	//   12   22:dup             
	//   13   23:iload_3         
	//   14   24:invokespecial   #115 <Method void ArrayList(int)>
	//   15   27:astore          4
		int i = 0;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		while(i < j) 
	//*  18   31:iload_2         
	//*  19   32:iload_3         
	//*  20   33:icmpge          80
		{
			SettableBeanProperty settablebeanproperty = _propsInOrder[i];
	//   21   36:aload_0         
	//   22   37:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//   23   40:iload_2         
	//   24   41:aaload          
	//   25   42:astore          5
			if(settablebeanproperty == null)
	//*  26   44:aload           5
	//*  27   46:ifnonnull       64
				arraylist.add(((Object) (settablebeanproperty)));
	//   28   49:aload           4
	//   29   51:aload           5
	//   30   53:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   31   56:pop             
			else
	//*  32   57:iload_2         
	//*  33   58:iconst_1        
	//*  34   59:iadd            
	//*  35   60:istore_2        
	//*  36   61:goto            31
				arraylist.add(((Object) (_rename(settablebeanproperty, nametransformer))));
	//   37   64:aload           4
	//   38   66:aload_0         
	//   39   67:aload           5
	//   40   69:aload_1         
	//   41   70:invokevirtual   #236 <Method SettableBeanProperty _rename(SettableBeanProperty, NameTransformer)>
	//   42   73:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   43   76:pop             
			i++;
		}
	//*  44   77:goto            57
		return new BeanPropertyMap(_caseInsensitive, ((Collection) (arraylist)));
	//   45   80:new             #2   <Class BeanPropertyMap>
	//   46   83:dup             
	//   47   84:aload_0         
	//   48   85:getfield        #30  <Field boolean _caseInsensitive>
	//   49   88:aload           4
	//   50   90:invokespecial   #103 <Method void BeanPropertyMap(boolean, Collection)>
	//   51   93:areturn         
	}

	public void replace(SettableBeanProperty settablebeanproperty)
	{
		Object obj = ((Object) (getPropertyName(settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method String getPropertyName(SettableBeanProperty)>
	//    3    5:astore_3        
		int i = _findIndexInHash(((String) (obj)));
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokespecial   #239 <Method int _findIndexInHash(String)>
	//    7   11:istore_2        
		if(i >= 0)
	//*   8   12:iload_2         
	//*   9   13:iflt            45
		{
			obj = ((Object) ((SettableBeanProperty)_hashArea[i]));
	//   10   16:aload_0         
	//   11   17:getfield        #58  <Field Object[] _hashArea>
	//   12   20:iload_2         
	//   13   21:aaload          
	//   14   22:checkcast       #38  <Class SettableBeanProperty>
	//   15   25:astore_3        
			_hashArea[i] = ((Object) (settablebeanproperty));
	//   16   26:aload_0         
	//   17   27:getfield        #58  <Field Object[] _hashArea>
	//   18   30:iload_2         
	//   19   31:aload_1         
	//   20   32:aastore         
			_propsInOrder[_findFromOrdered(((SettableBeanProperty) (obj)))] = settablebeanproperty;
	//   21   33:aload_0         
	//   22   34:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//   23   37:aload_0         
	//   24   38:aload_3         
	//   25   39:invokespecial   #221 <Method int _findFromOrdered(SettableBeanProperty)>
	//   26   42:aload_1         
	//   27   43:aastore         
			return;
	//   28   44:return          
		} else
		{
			throw new NoSuchElementException((new StringBuilder()).append("No entry '").append(((String) (obj))).append("' found, can't replace").toString());
	//   29   45:new             #223 <Class NoSuchElementException>
	//   30   48:dup             
	//   31   49:new             #72  <Class StringBuilder>
	//   32   52:dup             
	//   33   53:invokespecial   #73  <Method void StringBuilder()>
	//   34   56:ldc1            #225 <String "No entry '">
	//   35   58:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   36   61:aload_3         
	//   37   62:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   38   65:ldc1            #241 <String "' found, can't replace">
	//   39   67:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   40   70:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   41   73:invokespecial   #228 <Method void NoSuchElementException(String)>
	//   42   76:athrow          
		}
	}

	public int size()
	{
		return _size;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int _size>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #72  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Properties=[");
	//    4    8:aload_2         
	//    5    9:ldc1            #243 <String "Properties=[">
	//    6   11:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		int i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_1        
		for(Iterator iterator1 = iterator(); iterator1.hasNext();)
	//*  10   17:aload_0         
	//*  11   18:invokevirtual   #244 <Method Iterator iterator()>
	//*  12   21:astore_3        
	//*  13   22:aload_3         
	//*  14   23:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//*  15   28:ifeq            94
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator1.next();
	//   16   31:aload_3         
	//   17   32:invokeinterface #202 <Method Object Iterator.next()>
	//   18   37:checkcast       #38  <Class SettableBeanProperty>
	//   19   40:astore          4
			if(i > 0)
	//*  20   42:iload_1         
	//*  21   43:ifle            53
				stringbuilder.append(", ");
	//   22   46:aload_2         
	//   23   47:ldc1            #246 <String ", ">
	//   24   49:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
			stringbuilder.append(settablebeanproperty.getName());
	//   26   53:aload_2         
	//   27   54:aload           4
	//   28   56:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//   29   59:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
			stringbuilder.append('(');
	//   31   63:aload_2         
	//   32   64:bipush          40
	//   33   66:invokevirtual   #249 <Method StringBuilder StringBuilder.append(char)>
	//   34   69:pop             
			stringbuilder.append(((Object) (settablebeanproperty.getType())));
	//   35   70:aload_2         
	//   36   71:aload           4
	//   37   73:invokevirtual   #253 <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//   38   76:invokevirtual   #256 <Method StringBuilder StringBuilder.append(Object)>
	//   39   79:pop             
			stringbuilder.append(')');
	//   40   80:aload_2         
	//   41   81:bipush          41
	//   42   83:invokevirtual   #249 <Method StringBuilder StringBuilder.append(char)>
	//   43   86:pop             
			i++;
	//   44   87:iload_1         
	//   45   88:iconst_1        
	//   46   89:iadd            
	//   47   90:istore_1        
		}

	//*  48   91:goto            22
		stringbuilder.append(']');
	//   49   94:aload_2         
	//   50   95:bipush          93
	//   51   97:invokevirtual   #249 <Method StringBuilder StringBuilder.append(char)>
	//   52  100:pop             
		return stringbuilder.toString();
	//   53  101:aload_2         
	//   54  102:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   55  105:areturn         
	}

	public BeanPropertyMap withProperty(SettableBeanProperty settablebeanproperty)
	{
		String s = getPropertyName(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #204 <Method String getPropertyName(SettableBeanProperty)>
	//    3    5:astore          6
		int i = 1;
	//    4    7:iconst_1        
	//    5    8:istore_2        
		for(int j = _hashArea.length; i < j; i += 2)
	//*   6    9:aload_0         
	//*   7   10:getfield        #58  <Field Object[] _hashArea>
	//*   8   13:arraylength     
	//*   9   14:istore_3        
	//*  10   15:iload_2         
	//*  11   16:iload_3         
	//*  12   17:icmpge          77
		{
			SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)_hashArea[i];
	//   13   20:aload_0         
	//   14   21:getfield        #58  <Field Object[] _hashArea>
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:checkcast       #38  <Class SettableBeanProperty>
	//   18   29:astore          7
			if(settablebeanproperty1 != null && settablebeanproperty1.getName().equals(((Object) (s))))
	//*  19   31:aload           7
	//*  20   33:ifnull          70
	//*  21   36:aload           7
	//*  22   38:invokevirtual   #83  <Method String SettableBeanProperty.getName()>
	//*  23   41:aload           6
	//*  24   43:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  25   46:ifeq            70
			{
				_hashArea[i] = ((Object) (settablebeanproperty));
	//   26   49:aload_0         
	//   27   50:getfield        #58  <Field Object[] _hashArea>
	//   28   53:iload_2         
	//   29   54:aload_1         
	//   30   55:aastore         
				_propsInOrder[_findFromOrdered(settablebeanproperty1)] = settablebeanproperty;
	//   31   56:aload_0         
	//   32   57:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//   33   60:aload_0         
	//   34   61:aload           7
	//   35   63:invokespecial   #221 <Method int _findFromOrdered(SettableBeanProperty)>
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
	//   47   80:invokespecial   #96  <Method int _hashCode(String)>
	//   48   83:istore          5
		int j1 = _hashMask + 1;
	//   49   85:aload_0         
	//   50   86:getfield        #56  <Field int _hashMask>
	//   51   89:iconst_1        
	//   52   90:iadd            
	//   53   91:istore          4
		int k = k1 << 1;
	//   54   93:iload           5
	//   55   95:iconst_1        
	//   56   96:ishl            
	//   57   97:istore_3        
		i = k;
	//   58   98:iload_3         
	//   59   99:istore_2        
		if(_hashArea[k] != null)
	//*  60  100:aload_0         
	//*  61  101:getfield        #58  <Field Object[] _hashArea>
	//*  62  104:iload_3         
	//*  63  105:aaload          
	//*  64  106:ifnull          186
		{
			int l = (k1 >> 1) + j1 << 1;
	//   65  109:iload           5
	//   66  111:iconst_1        
	//   67  112:ishr            
	//   68  113:iload           4
	//   69  115:iadd            
	//   70  116:iconst_1        
	//   71  117:ishl            
	//   72  118:istore_3        
			i = l;
	//   73  119:iload_3         
	//   74  120:istore_2        
			if(_hashArea[l] != null)
	//*  75  121:aload_0         
	//*  76  122:getfield        #58  <Field Object[] _hashArea>
	//*  77  125:iload_3         
	//*  78  126:aaload          
	//*  79  127:ifnull          186
			{
				int i1 = ((j1 >> 1) + j1 << 1) + _spillCount;
	//   80  130:iload           4
	//   81  132:iconst_1        
	//   82  133:ishr            
	//   83  134:iload           4
	//   84  136:iadd            
	//   85  137:iconst_1        
	//   86  138:ishl            
	//   87  139:aload_0         
	//   88  140:getfield        #66  <Field int _spillCount>
	//   89  143:iadd            
	//   90  144:istore_3        
				_spillCount = _spillCount + 2;
	//   91  145:aload_0         
	//   92  146:aload_0         
	//   93  147:getfield        #66  <Field int _spillCount>
	//   94  150:iconst_2        
	//   95  151:iadd            
	//   96  152:putfield        #66  <Field int _spillCount>
				i = i1;
	//   97  155:iload_3         
	//   98  156:istore_2        
				if(i1 >= _hashArea.length)
	//*  99  157:iload_3         
	//* 100  158:aload_0         
	//* 101  159:getfield        #58  <Field Object[] _hashArea>
	//* 102  162:arraylength     
	//* 103  163:icmplt          186
				{
					_hashArea = Arrays.copyOf(_hashArea, _hashArea.length + 4);
	//  104  166:aload_0         
	//  105  167:aload_0         
	//  106  168:getfield        #58  <Field Object[] _hashArea>
	//  107  171:aload_0         
	//  108  172:getfield        #58  <Field Object[] _hashArea>
	//  109  175:arraylength     
	//  110  176:iconst_4        
	//  111  177:iadd            
	//  112  178:invokestatic    #210 <Method Object[] Arrays.copyOf(Object[], int)>
	//  113  181:putfield        #58  <Field Object[] _hashArea>
					i = i1;
	//  114  184:iload_3         
	//  115  185:istore_2        
				}
			}
		}
		_hashArea[i] = ((Object) (s));
	//  116  186:aload_0         
	//  117  187:getfield        #58  <Field Object[] _hashArea>
	//  118  190:iload_2         
	//  119  191:aload           6
	//  120  193:aastore         
		_hashArea[i + 1] = ((Object) (settablebeanproperty));
	//  121  194:aload_0         
	//  122  195:getfield        #58  <Field Object[] _hashArea>
	//  123  198:iload_2         
	//  124  199:iconst_1        
	//  125  200:iadd            
	//  126  201:aload_1         
	//  127  202:aastore         
		i = _propsInOrder.length;
	//  128  203:aload_0         
	//  129  204:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//  130  207:arraylength     
	//  131  208:istore_2        
		_propsInOrder = (SettableBeanProperty[])Arrays.copyOf(((Object []) (_propsInOrder)), i + 1);
	//  132  209:aload_0         
	//  133  210:aload_0         
	//  134  211:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//  135  214:iload_2         
	//  136  215:iconst_1        
	//  137  216:iadd            
	//  138  217:invokestatic    #210 <Method Object[] Arrays.copyOf(Object[], int)>
	//  139  220:checkcast       #43  <Class SettableBeanProperty[]>
	//  140  223:putfield        #45  <Field SettableBeanProperty[] _propsInOrder>
		_propsInOrder[i] = settablebeanproperty;
	//  141  226:aload_0         
	//  142  227:getfield        #45  <Field SettableBeanProperty[] _propsInOrder>
	//  143  230:iload_2         
	//  144  231:aload_1         
	//  145  232:aastore         
		return this;
	//  146  233:aload_0         
	//  147  234:areturn         
	}

	protected void wrapAndThrow(Throwable throwable, Object obj, String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		for(; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_1         
	//    1    1:instanceof      #260 <Class InvocationTargetException>
	//    2    4:ifeq            22
	//    3    7:aload_1         
	//    4    8:invokevirtual   #266 <Method Throwable Throwable.getCause()>
	//    5   11:ifnull          22
	//    6   14:aload_1         
	//    7   15:invokevirtual   #266 <Method Throwable Throwable.getCause()>
	//    8   18:astore_1        
	//*   9   19:goto            0
		if(throwable instanceof Error)
	//*  10   22:aload_1         
	//*  11   23:instanceof      #268 <Class Error>
	//*  12   26:ifeq            34
			throw (Error)throwable;
	//   13   29:aload_1         
	//   14   30:checkcast       #268 <Class Error>
	//   15   33:athrow          
		boolean flag;
		if(deserializationcontext == null || deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
	//*  16   34:aload           4
	//*  17   36:ifnull          50
	//*  18   39:aload           4
	//*  19   41:getstatic       #274 <Field DeserializationFeature DeserializationFeature.WRAP_EXCEPTIONS>
	//*  20   44:invokevirtual   #280 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  21   47:ifeq            77
			flag = true;
	//   22   50:iconst_1        
	//   23   51:istore          5
		else
	//*  24   53:aload_1         
	//*  25   54:instanceof      #169 <Class IOException>
	//*  26   57:ifeq            83
	//*  27   60:iload           5
	//*  28   62:ifeq            72
	//*  29   65:aload_1         
	//*  30   66:instanceof      #282 <Class JsonProcessingException>
	//*  31   69:ifne            100
	//*  32   72:aload_1         
	//*  33   73:checkcast       #169 <Class IOException>
	//*  34   76:athrow          
			flag = false;
	//   35   77:iconst_0        
	//   36   78:istore          5
		if(throwable instanceof IOException)
		{
			if(!flag || !(throwable instanceof JsonProcessingException))
				throw (IOException)throwable;
		} else
	//*  37   80:goto            53
		if(!flag && (throwable instanceof RuntimeException))
	//*  38   83:iload           5
	//*  39   85:ifne            100
	//*  40   88:aload_1         
	//*  41   89:instanceof      #284 <Class RuntimeException>
	//*  42   92:ifeq            100
			throw (RuntimeException)throwable;
	//   43   95:aload_1         
	//   44   96:checkcast       #284 <Class RuntimeException>
	//   45   99:athrow          
		throw JsonMappingException.wrapWithPath(throwable, obj, s);
	//   46  100:aload_1         
	//   47  101:aload_2         
	//   48  102:aload_3         
	//   49  103:invokestatic    #290 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   50  106:athrow          
	}

	private static final long serialVersionUID = 2L;
	protected final boolean _caseInsensitive;
	private Object _hashArea[];
	private int _hashMask;
	private SettableBeanProperty _propsInOrder[];
	private int _size;
	private int _spillCount;
}
