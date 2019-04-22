// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.*;

public final class CompactStringObjectMap
	implements Serializable
{

	private CompactStringObjectMap(int i, int j, Object aobj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		_hashMask = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int _hashMask>
		_spillCount = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field int _spillCount>
		_hashArea = aobj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field Object[] _hashArea>
	//   11   19:return          
	}

	private final Object _find2(String s, int i, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		int j = _hashMask + 1;
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field int _hashMask>
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
	//   18   24:getfield        #34  <Field Object[] _hashArea>
	//   19   27:iload_2         
	//   20   28:aaload          
	//   21   29:astore_3        
		if(s.equals(obj))
	//*  22   30:aload_1         
	//*  23   31:aload_3         
	//*  24   32:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  25   35:ifeq            47
			return _hashArea[i + 1];
	//   26   38:aload_0         
	//   27   39:getfield        #34  <Field Object[] _hashArea>
	//   28   42:iload_2         
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:aaload          
	//   32   46:areturn         
		if(obj != null)
	//*  33   47:aload_3         
	//*  34   48:ifnull          119
		{
			j = j + (j >> 1) << 1;
	//   35   51:iload           4
	//   36   53:iload           4
	//   37   55:iconst_1        
	//   38   56:ishr            
	//   39   57:iadd            
	//   40   58:iconst_1        
	//   41   59:ishl            
	//   42   60:istore          4
			int k = _spillCount;
	//   43   62:aload_0         
	//   44   63:getfield        #32  <Field int _spillCount>
	//   45   66:istore          5
			for(i = j; i < k + j;)
	//*  46   68:iload           4
	//*  47   70:istore_2        
	//*  48   71:iload_2         
	//*  49   72:iload           5
	//*  50   74:iload           4
	//*  51   76:iadd            
	//*  52   77:icmpge          119
			{
				obj = _hashArea[i];
	//   53   80:aload_0         
	//   54   81:getfield        #34  <Field Object[] _hashArea>
	//   55   84:iload_2         
	//   56   85:aaload          
	//   57   86:astore_3        
				if(obj != s && !s.equals(obj))
	//*  58   87:aload_3         
	//*  59   88:aload_1         
	//*  60   89:if_acmpeq       110
	//*  61   92:aload_1         
	//*  62   93:aload_3         
	//*  63   94:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  64   97:ifeq            103
	//*  65  100:goto            110
					i += 2;
	//   66  103:iload_2         
	//   67  104:iconst_2        
	//   68  105:iadd            
	//   69  106:istore_2        
				else
	//*  70  107:goto            71
					return _hashArea[i + 1];
	//   71  110:aload_0         
	//   72  111:getfield        #34  <Field Object[] _hashArea>
	//   73  114:iload_2         
	//   74  115:iconst_1        
	//   75  116:iadd            
	//   76  117:aaload          
	//   77  118:areturn         
			}

		}
		return ((Object) (null));
	//   78  119:aconst_null     
	//   79  120:areturn         
	}

	public static CompactStringObjectMap construct(Map map)
	{
		if(map.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #50  <Method boolean Map.isEmpty()>
	//*   2    6:ifeq            13
			return EMPTY;
	//    3    9:getstatic       #25  <Field CompactStringObjectMap EMPTY>
	//    4   12:areturn         
		int k1 = findSize(map.size());
	//    5   13:aload_0         
	//    6   14:invokeinterface #54  <Method int Map.size()>
	//    7   19:invokestatic    #58  <Method int findSize(int)>
	//    8   22:istore          5
		int l1 = k1 - 1;
	//    9   24:iload           5
	//   10   26:iconst_1        
	//   11   27:isub            
	//   12   28:istore          6
		int i2 = (k1 >> 1) + k1;
	//   13   30:iload           5
	//   14   32:iconst_1        
	//   15   33:ishr            
	//   16   34:iload           5
	//   17   36:iadd            
	//   18   37:istore          7
		Object aobj[] = new Object[i2 * 2];
	//   19   39:iload           7
	//   20   41:iconst_2        
	//   21   42:imul            
	//   22   43:anewarray       Object[]
	//   23   46:astore          9
		int k = 0;
	//   24   48:iconst_0        
	//   25   49:istore_3        
		Iterator iterator = map.entrySet().iterator();
	//   26   50:aload_0         
	//   27   51:invokeinterface #62  <Method Set Map.entrySet()>
	//   28   56:invokeinterface #68  <Method Iterator Set.iterator()>
	//   29   61:astore          10
		map = ((Map) (aobj));
	//   30   63:aload           9
	//   31   65:astore_0        
		while(iterator.hasNext()) 
	//*  32   66:aload           10
	//*  33   68:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*  34   73:ifeq            227
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   35   76:aload           10
	//   36   78:invokeinterface #77  <Method Object Iterator.next()>
	//   37   83:checkcast       #79  <Class java.util.Map$Entry>
	//   38   86:astore          11
			String s = (String)entry.getKey();
	//   39   88:aload           11
	//   40   90:invokeinterface #82  <Method Object java.util.Map$Entry.getKey()>
	//   41   95:checkcast       #38  <Class String>
	//   42   98:astore          12
			int j2 = s.hashCode() & l1;
	//   43  100:aload           12
	//   44  102:invokevirtual   #85  <Method int String.hashCode()>
	//   45  105:iload           6
	//   46  107:iand            
	//   47  108:istore          8
			int l = j2 + j2;
	//   48  110:iload           8
	//   49  112:iload           8
	//   50  114:iadd            
	//   51  115:istore          4
			Object obj = ((Object) (map));
	//   52  117:aload_0         
	//   53  118:astore          9
			int j = k;
	//   54  120:iload_3         
	//   55  121:istore_2        
			int i = l;
	//   56  122:iload           4
	//   57  124:istore_1        
			if(map[l] != null)
	//*  58  125:aload_0         
	//*  59  126:iload           4
	//*  60  128:aaload          
	//*  61  129:ifnull          200
			{
				int i1 = (j2 >> 1) + k1 << 1;
	//   62  132:iload           8
	//   63  134:iconst_1        
	//   64  135:ishr            
	//   65  136:iload           5
	//   66  138:iadd            
	//   67  139:iconst_1        
	//   68  140:ishl            
	//   69  141:istore          4
				obj = ((Object) (map));
	//   70  143:aload_0         
	//   71  144:astore          9
				j = k;
	//   72  146:iload_3         
	//   73  147:istore_2        
				i = i1;
	//   74  148:iload           4
	//   75  150:istore_1        
				if(map[i1] != null)
	//*  76  151:aload_0         
	//*  77  152:iload           4
	//*  78  154:aaload          
	//*  79  155:ifnull          200
				{
					int j1 = (i2 << 1) + k;
	//   80  158:iload           7
	//   81  160:iconst_1        
	//   82  161:ishl            
	//   83  162:iload_3         
	//   84  163:iadd            
	//   85  164:istore          4
					k += 2;
	//   86  166:iload_3         
	//   87  167:iconst_2        
	//   88  168:iadd            
	//   89  169:istore_3        
					obj = ((Object) (map));
	//   90  170:aload_0         
	//   91  171:astore          9
					j = k;
	//   92  173:iload_3         
	//   93  174:istore_2        
					i = j1;
	//   94  175:iload           4
	//   95  177:istore_1        
					if(j1 >= map.length)
	//*  96  178:iload           4
	//*  97  180:aload_0         
	//*  98  181:arraylength     
	//*  99  182:icmplt          200
					{
						obj = ((Object) (Arrays.copyOf(((Object []) (map)), map.length + 4)));
	//  100  185:aload_0         
	//  101  186:aload_0         
	//  102  187:arraylength     
	//  103  188:iconst_4        
	//  104  189:iadd            
	//  105  190:invokestatic    #91  <Method Object[] Arrays.copyOf(Object[], int)>
	//  106  193:astore          9
						i = j1;
	//  107  195:iload           4
	//  108  197:istore_1        
						j = k;
	//  109  198:iload_3         
	//  110  199:istore_2        
					}
				}
			}
			obj[i] = ((/*<invalid signature>*/java.lang.Object) (s));
	//  111  200:aload           9
	//  112  202:iload_1         
	//  113  203:aload           12
	//  114  205:aastore         
			obj[i + 1] = ((/*<invalid signature>*/java.lang.Object) (entry.getValue()));
	//  115  206:aload           9
	//  116  208:iload_1         
	//  117  209:iconst_1        
	//  118  210:iadd            
	//  119  211:aload           11
	//  120  213:invokeinterface #94  <Method Object java.util.Map$Entry.getValue()>
	//  121  218:aastore         
			map = ((Map) (obj));
	//  122  219:aload           9
	//  123  221:astore_0        
			k = j;
	//  124  222:iload_2         
	//  125  223:istore_3        
		}
	//* 126  224:goto            66
		return new CompactStringObjectMap(l1, k, ((Object []) (map)));
	//  127  227:new             #2   <Class CompactStringObjectMap>
	//  128  230:dup             
	//  129  231:iload           6
	//  130  233:iload_3         
	//  131  234:aload_0         
	//  132  235:invokespecial   #23  <Method void CompactStringObjectMap(int, int, Object[])>
	//  133  238:areturn         
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

	public Object find(String s)
	{
		int i = s.hashCode() & _hashMask;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #85  <Method int String.hashCode()>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field int _hashMask>
	//    4    8:iand            
	//    5    9:istore_2        
		int j = i << 1;
	//    6   10:iload_2         
	//    7   11:iconst_1        
	//    8   12:ishl            
	//    9   13:istore_3        
		Object obj = _hashArea[j];
	//   10   14:aload_0         
	//   11   15:getfield        #34  <Field Object[] _hashArea>
	//   12   18:iload_3         
	//   13   19:aaload          
	//   14   20:astore          4
		if(obj != s && !s.equals(obj))
	//*  15   22:aload           4
	//*  16   24:aload_1         
	//*  17   25:if_acmpeq       49
	//*  18   28:aload_1         
	//*  19   29:aload           4
	//*  20   31:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  21   34:ifeq            40
	//*  22   37:goto            49
			return _find2(s, i, obj);
	//   23   40:aload_0         
	//   24   41:aload_1         
	//   25   42:iload_2         
	//   26   43:aload           4
	//   27   45:invokespecial   #100 <Method Object _find2(String, int, Object)>
	//   28   48:areturn         
		else
			return _hashArea[j + 1];
	//   29   49:aload_0         
	//   30   50:getfield        #34  <Field Object[] _hashArea>
	//   31   53:iload_3         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:aaload          
	//   35   57:areturn         
	}

	public Object findCaseInsensitive(String s)
	{
		int j = _hashArea.length;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object[] _hashArea>
	//    2    4:arraylength     
	//    3    5:istore_3        
		for(int i = 0; i < j; i += 2)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          54
		{
			Object obj = _hashArea[i];
	//    9   13:aload_0         
	//   10   14:getfield        #34  <Field Object[] _hashArea>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          4
			if(obj != null && ((String)obj).equalsIgnoreCase(s))
	//*  14   21:aload           4
	//*  15   23:ifnull          47
	//*  16   26:aload           4
	//*  17   28:checkcast       #38  <Class String>
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  20   35:ifeq            47
				return _hashArea[i + 1];
	//   21   38:aload_0         
	//   22   39:getfield        #34  <Field Object[] _hashArea>
	//   23   42:iload_2         
	//   24   43:iconst_1        
	//   25   44:iadd            
	//   26   45:aaload          
	//   27   46:areturn         
		}

	//   28   47:iload_2         
	//   29   48:iconst_2        
	//   30   49:iadd            
	//   31   50:istore_2        
	//*  32   51:goto            8
		return ((Object) (null));
	//   33   54:aconst_null     
	//   34   55:areturn         
	}

	public List keys()
	{
		int j = _hashArea.length;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object[] _hashArea>
	//    2    4:arraylength     
	//    3    5:istore_2        
		ArrayList arraylist = new ArrayList(j >> 2);
	//    4    6:new             #109 <Class ArrayList>
	//    5    9:dup             
	//    6   10:iload_2         
	//    7   11:iconst_2        
	//    8   12:ishr            
	//    9   13:invokespecial   #112 <Method void ArrayList(int)>
	//   10   16:astore_3        
		for(int i = 0; i < j; i += 2)
	//*  11   17:iconst_0        
	//*  12   18:istore_1        
	//*  13   19:iload_1         
	//*  14   20:iload_2         
	//*  15   21:icmpge          56
		{
			Object obj = _hashArea[i];
	//   16   24:aload_0         
	//   17   25:getfield        #34  <Field Object[] _hashArea>
	//   18   28:iload_1         
	//   19   29:aaload          
	//   20   30:astore          4
			if(obj != null)
	//*  21   32:aload           4
	//*  22   34:ifnull          49
				((List) (arraylist)).add(((Object) ((String)obj)));
	//   23   37:aload_3         
	//   24   38:aload           4
	//   25   40:checkcast       #38  <Class String>
	//   26   43:invokeinterface #117 <Method boolean List.add(Object)>
	//   27   48:pop             
		}

	//   28   49:iload_1         
	//   29   50:iconst_2        
	//   30   51:iadd            
	//   31   52:istore_1        
	//*  32   53:goto            19
		return ((List) (arraylist));
	//   33   56:aload_3         
	//   34   57:areturn         
	}

	private static final CompactStringObjectMap EMPTY = new CompactStringObjectMap(1, 0, new Object[4]);
	private static final long serialVersionUID = 1L;
	private final Object _hashArea[];
	private final int _hashMask;
	private final int _spillCount;

	static 
	{
	//    0    0:new             #2   <Class CompactStringObjectMap>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:iconst_4        
	//    5    7:anewarray       Object[]
	//    6   10:invokespecial   #23  <Method void CompactStringObjectMap(int, int, Object[])>
	//    7   13:putstatic       #25  <Field CompactStringObjectMap EMPTY>
	//*   8   16:return          
	}
}
