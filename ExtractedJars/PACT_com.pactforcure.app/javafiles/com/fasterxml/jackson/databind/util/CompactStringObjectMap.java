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
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:ifnonnull       6
_L1:
		return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
_L2:
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
	//*  34   48:ifnull          4
		{
			j = (j >> 1) + j << 1;
	//   35   51:iload           4
	//   36   53:iconst_1        
	//   37   54:ishr            
	//   38   55:iload           4
	//   39   57:iadd            
	//   40   58:iconst_1        
	//   41   59:ishl            
	//   42   60:istore          4
			int k = _spillCount;
	//   43   62:aload_0         
	//   44   63:getfield        #32  <Field int _spillCount>
	//   45   66:istore          5
			i = j;
	//   46   68:iload           4
	//   47   70:istore_2        
			while(i < j + k) 
	//*  48   71:iload_2         
	//*  49   72:iload           4
	//*  50   74:iload           5
	//*  51   76:iadd            
	//*  52   77:icmpge          4
			{
				obj = _hashArea[i];
	//   53   80:aload_0         
	//   54   81:getfield        #34  <Field Object[] _hashArea>
	//   55   84:iload_2         
	//   56   85:aaload          
	//   57   86:astore_3        
				if(obj == s || s.equals(obj))
	//*  58   87:aload_3         
	//*  59   88:aload_1         
	//*  60   89:if_acmpeq       100
	//*  61   92:aload_1         
	//*  62   93:aload_3         
	//*  63   94:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  64   97:ifeq            109
					return _hashArea[i + 1];
	//   65  100:aload_0         
	//   66  101:getfield        #34  <Field Object[] _hashArea>
	//   67  104:iload_2         
	//   68  105:iconst_1        
	//   69  106:iadd            
	//   70  107:aaload          
	//   71  108:areturn         
				i += 2;
	//   72  109:iload_2         
	//   73  110:iconst_2        
	//   74  111:iadd            
	//   75  112:istore_2        
			}
		}
		if(true) goto _L1; else goto _L3
	//   76  113:goto            71
_L3:
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
		Object aobj[] = new Object[((k1 >> 1) + k1) * 2];
	//   13   30:iload           5
	//   14   32:iconst_1        
	//   15   33:ishr            
	//   16   34:iload           5
	//   17   36:iadd            
	//   18   37:iconst_2        
	//   19   38:imul            
	//   20   39:anewarray       Object[]
	//   21   42:astore          8
		int k = 0;
	//   22   44:iconst_0        
	//   23   45:istore_3        
		Iterator iterator = map.entrySet().iterator();
	//   24   46:aload_0         
	//   25   47:invokeinterface #62  <Method Set Map.entrySet()>
	//   26   52:invokeinterface #68  <Method Iterator Set.iterator()>
	//   27   57:astore          9
		map = ((Map) (aobj));
	//   28   59:aload           8
	//   29   61:astore_0        
		while(iterator.hasNext()) 
	//*  30   62:aload           9
	//*  31   64:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*  32   69:ifeq            228
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   33   72:aload           9
	//   34   74:invokeinterface #77  <Method Object Iterator.next()>
	//   35   79:checkcast       #79  <Class java.util.Map$Entry>
	//   36   82:astore          10
			String s = (String)entry.getKey();
	//   37   84:aload           10
	//   38   86:invokeinterface #82  <Method Object java.util.Map$Entry.getKey()>
	//   39   91:checkcast       #38  <Class String>
	//   40   94:astore          11
			int i2 = s.hashCode() & l1;
	//   41   96:aload           11
	//   42   98:invokevirtual   #85  <Method int String.hashCode()>
	//   43  101:iload           6
	//   44  103:iand            
	//   45  104:istore          7
			int l = i2 + i2;
	//   46  106:iload           7
	//   47  108:iload           7
	//   48  110:iadd            
	//   49  111:istore          4
			Object obj = ((Object) (map));
	//   50  113:aload_0         
	//   51  114:astore          8
			int i = l;
	//   52  116:iload           4
	//   53  118:istore_1        
			int j = k;
	//   54  119:iload_3         
	//   55  120:istore_2        
			if(map[l] != null)
	//*  56  121:aload_0         
	//*  57  122:iload           4
	//*  58  124:aaload          
	//*  59  125:ifnull          201
			{
				int i1 = (i2 >> 1) + k1 << 1;
	//   60  128:iload           7
	//   61  130:iconst_1        
	//   62  131:ishr            
	//   63  132:iload           5
	//   64  134:iadd            
	//   65  135:iconst_1        
	//   66  136:ishl            
	//   67  137:istore          4
				obj = ((Object) (map));
	//   68  139:aload_0         
	//   69  140:astore          8
				i = i1;
	//   70  142:iload           4
	//   71  144:istore_1        
				j = k;
	//   72  145:iload_3         
	//   73  146:istore_2        
				if(map[i1] != null)
	//*  74  147:aload_0         
	//*  75  148:iload           4
	//*  76  150:aaload          
	//*  77  151:ifnull          201
				{
					int j1 = ((k1 >> 1) + k1 << 1) + k;
	//   78  154:iload           5
	//   79  156:iconst_1        
	//   80  157:ishr            
	//   81  158:iload           5
	//   82  160:iadd            
	//   83  161:iconst_1        
	//   84  162:ishl            
	//   85  163:iload_3         
	//   86  164:iadd            
	//   87  165:istore          4
					k += 2;
	//   88  167:iload_3         
	//   89  168:iconst_2        
	//   90  169:iadd            
	//   91  170:istore_3        
					obj = ((Object) (map));
	//   92  171:aload_0         
	//   93  172:astore          8
					i = j1;
	//   94  174:iload           4
	//   95  176:istore_1        
					j = k;
	//   96  177:iload_3         
	//   97  178:istore_2        
					if(j1 >= map.length)
	//*  98  179:iload           4
	//*  99  181:aload_0         
	//* 100  182:arraylength     
	//* 101  183:icmplt          201
					{
						obj = ((Object) (Arrays.copyOf(((Object []) (map)), map.length + 4)));
	//  102  186:aload_0         
	//  103  187:aload_0         
	//  104  188:arraylength     
	//  105  189:iconst_4        
	//  106  190:iadd            
	//  107  191:invokestatic    #91  <Method Object[] Arrays.copyOf(Object[], int)>
	//  108  194:astore          8
						j = k;
	//  109  196:iload_3         
	//  110  197:istore_2        
						i = j1;
	//  111  198:iload           4
	//  112  200:istore_1        
					}
				}
			}
			obj[i] = ((/*<invalid signature>*/java.lang.Object) (s));
	//  113  201:aload           8
	//  114  203:iload_1         
	//  115  204:aload           11
	//  116  206:aastore         
			obj[i + 1] = ((/*<invalid signature>*/java.lang.Object) (entry.getValue()));
	//  117  207:aload           8
	//  118  209:iload_1         
	//  119  210:iconst_1        
	//  120  211:iadd            
	//  121  212:aload           10
	//  122  214:invokeinterface #94  <Method Object java.util.Map$Entry.getValue()>
	//  123  219:aastore         
			map = ((Map) (obj));
	//  124  220:aload           8
	//  125  222:astore_0        
			k = j;
	//  126  223:iload_2         
	//  127  224:istore_3        
		}
	//* 128  225:goto            62
		return new CompactStringObjectMap(l1, k, ((Object []) (map)));
	//  129  228:new             #2   <Class CompactStringObjectMap>
	//  130  231:dup             
	//  131  232:iload           6
	//  132  234:iload_3         
	//  133  235:aload_0         
	//  134  236:invokespecial   #23  <Method void CompactStringObjectMap(int, int, Object[])>
	//  135  239:areturn         
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
		if(obj == s || s.equals(obj))
	//*  15   22:aload           4
	//*  16   24:aload_1         
	//*  17   25:if_acmpeq       37
	//*  18   28:aload_1         
	//*  19   29:aload           4
	//*  20   31:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  21   34:ifeq            46
			return _hashArea[j + 1];
	//   22   37:aload_0         
	//   23   38:getfield        #34  <Field Object[] _hashArea>
	//   24   41:iload_3         
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:aaload          
	//   28   45:areturn         
		else
			return _find2(s, i, obj);
	//   29   46:aload_0         
	//   30   47:aload_1         
	//   31   48:iload_2         
	//   32   49:aload           4
	//   33   51:invokespecial   #100 <Method Object _find2(String, int, Object)>
	//   34   54:areturn         
	}

	public List keys()
	{
		int j = _hashArea.length;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object[] _hashArea>
	//    2    4:arraylength     
	//    3    5:istore_2        
		ArrayList arraylist = new ArrayList(j >> 2);
	//    4    6:new             #104 <Class ArrayList>
	//    5    9:dup             
	//    6   10:iload_2         
	//    7   11:iconst_2        
	//    8   12:ishr            
	//    9   13:invokespecial   #107 <Method void ArrayList(int)>
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
	//   26   43:invokeinterface #112 <Method boolean List.add(Object)>
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
