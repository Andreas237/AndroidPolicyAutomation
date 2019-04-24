// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf:
//			XfaForm

public static class XfaForm$Xml2Som
{

	public static String escapeSom(String s)
	{
		String s1;
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
		{
			s1 = "";
	//    2    4:ldc1            #29  <String "">
	//    3    6:astore_3        
		} else
	//*   4    7:aload_3         
	//*   5    8:areturn         
		{
			int i = s.indexOf('.');
	//    6    9:aload_0         
	//    7   10:bipush          46
	//    8   12:invokevirtual   #35  <Method int String.indexOf(int)>
	//    9   15:istore_1        
			s1 = s;
	//   10   16:aload_0         
	//   11   17:astore_3        
			if(i >= 0)
	//*  12   18:iload_1         
	//*  13   19:iflt            7
			{
				StringBuffer stringbuffer = new StringBuffer();
	//   14   22:new             #37  <Class StringBuffer>
	//   15   25:dup             
	//   16   26:invokespecial   #38  <Method void StringBuffer()>
	//   17   29:astore_3        
				int j = 0;
	//   18   30:iconst_0        
	//   19   31:istore_2        
				for(; i >= 0; i = s.indexOf('.', i + 1))
	//*  20   32:iload_1         
	//*  21   33:iflt            69
				{
					stringbuffer.append(s.substring(j, i));
	//   22   36:aload_3         
	//   23   37:aload_0         
	//   24   38:iload_2         
	//   25   39:iload_1         
	//   26   40:invokevirtual   #42  <Method String String.substring(int, int)>
	//   27   43:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   28   46:pop             
					stringbuffer.append('\\');
	//   29   47:aload_3         
	//   30   48:bipush          92
	//   31   50:invokevirtual   #49  <Method StringBuffer StringBuffer.append(char)>
	//   32   53:pop             
					j = i;
	//   33   54:iload_1         
	//   34   55:istore_2        
				}

	//   35   56:aload_0         
	//   36   57:bipush          46
	//   37   59:iload_1         
	//   38   60:iconst_1        
	//   39   61:iadd            
	//   40   62:invokevirtual   #52  <Method int String.indexOf(int, int)>
	//   41   65:istore_1        
	//*  42   66:goto            32
				stringbuffer.append(s.substring(j));
	//   43   69:aload_3         
	//   44   70:aload_0         
	//   45   71:iload_2         
	//   46   72:invokevirtual   #55  <Method String String.substring(int)>
	//   47   75:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   48   78:pop             
				return stringbuffer.toString();
	//   49   79:aload_3         
	//   50   80:invokevirtual   #59  <Method String StringBuffer.toString()>
	//   51   83:areturn         
			}
		}
		return s1;
	}

	public static String getShortName(String s)
	{
		int i = s.indexOf(".#subform[");
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <String ".#subform[">
	//    2    3:invokevirtual   #65  <Method int String.indexOf(String)>
	//    3    6:istore_1        
		if(i < 0)
	//*   4    7:iload_1         
	//*   5    8:ifge            13
			return s;
	//    6   11:aload_0         
	//    7   12:areturn         
		int j = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
		StringBuffer stringbuffer = new StringBuffer();
	//   10   15:new             #37  <Class StringBuffer>
	//   11   18:dup             
	//   12   19:invokespecial   #38  <Method void StringBuffer()>
	//   13   22:astore_3        
		for(; i >= 0; i = s.indexOf(".#subform[", j))
	//*  14   23:iload_1         
	//*  15   24:iflt            73
		{
			stringbuffer.append(s.substring(j, i));
	//   16   27:aload_3         
	//   17   28:aload_0         
	//   18   29:iload_2         
	//   19   30:iload_1         
	//   20   31:invokevirtual   #42  <Method String String.substring(int, int)>
	//   21   34:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   22   37:pop             
			i = s.indexOf("]", i + 10);
	//   23   38:aload_0         
	//   24   39:ldc1            #67  <String "]">
	//   25   41:iload_1         
	//   26   42:bipush          10
	//   27   44:iadd            
	//   28   45:invokevirtual   #70  <Method int String.indexOf(String, int)>
	//   29   48:istore_1        
			if(i < 0)
	//*  30   49:iload_1         
	//*  31   50:ifge            58
				return stringbuffer.toString();
	//   32   53:aload_3         
	//   33   54:invokevirtual   #59  <Method String StringBuffer.toString()>
	//   34   57:areturn         
			j = i + 1;
	//   35   58:iload_1         
	//   36   59:iconst_1        
	//   37   60:iadd            
	//   38   61:istore_2        
		}

	//   39   62:aload_0         
	//   40   63:ldc1            #62  <String ".#subform[">
	//   41   65:iload_2         
	//   42   66:invokevirtual   #70  <Method int String.indexOf(String, int)>
	//   43   69:istore_1        
	//*  44   70:goto            23
		stringbuffer.append(s.substring(j));
	//   45   73:aload_3         
	//   46   74:aload_0         
	//   47   75:iload_2         
	//   48   76:invokevirtual   #55  <Method String String.substring(int)>
	//   49   79:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   50   82:pop             
		return stringbuffer.toString();
	//   51   83:aload_3         
	//   52   84:invokevirtual   #59  <Method String StringBuffer.toString()>
	//   53   87:areturn         
	}

	public static void inverseSearchAdd(HashMap hashmap, XfaForm.Stack2 stack2, String s)
	{
		String s1 = (String)stack2.peek();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #78  <Method Object XfaForm$Stack2.peek()>
	//    2    4:checkcast       #31  <Class String>
	//    3    7:astore          7
		tore tore = (tore)hashmap.get(((Object) (s1)));
	//    4    9:aload_0         
	//    5   10:aload           7
	//    6   12:invokevirtual   #84  <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #86  <Class XfaForm$InverseStore>
	//    8   18:astore          6
		Object obj = ((Object) (tore));
	//    9   20:aload           6
	//   10   22:astore          5
		if(tore == null)
	//*  11   24:aload           6
	//*  12   26:ifnonnull       47
		{
			obj = ((Object) (new tore()));
	//   13   29:new             #86  <Class XfaForm$InverseStore>
	//   14   32:dup             
	//   15   33:invokespecial   #87  <Method void XfaForm$InverseStore()>
	//   16   36:astore          5
			hashmap.put(((Object) (s1)), obj);
	//   17   38:aload_0         
	//   18   39:aload           7
	//   19   41:aload           5
	//   20   43:invokevirtual   #91  <Method Object HashMap.put(Object, Object)>
	//   21   46:pop             
		}
		int i = stack2.size() - 2;
	//   22   47:aload_1         
	//   23   48:invokevirtual   #95  <Method int XfaForm$Stack2.size()>
	//   24   51:iconst_2        
	//   25   52:isub            
	//   26   53:istore_3        
		while(i >= 0) 
	//*  27   54:iload_3         
	//*  28   55:iflt            138
		{
			hashmap = ((HashMap) ((String)stack2.get(i)));
	//   29   58:aload_1         
	//   30   59:iload_3         
	//   31   60:invokevirtual   #98  <Method Object XfaForm$Stack2.get(int)>
	//   32   63:checkcast       #31  <Class String>
	//   33   66:astore_0        
			int j = ((tore) (obj)).part.indexOf(((Object) (hashmap)));
	//   34   67:aload           5
	//   35   69:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
	//   36   72:aload_0         
	//   37   73:invokevirtual   #106 <Method int ArrayList.indexOf(Object)>
	//   38   76:istore          4
			if(j < 0)
	//*  39   78:iload           4
	//*  40   80:ifge            121
			{
				((tore) (obj)).part.add(((Object) (hashmap)));
	//   41   83:aload           5
	//   42   85:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
	//   43   88:aload_0         
	//   44   89:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
	//   45   92:pop             
				hashmap = ((HashMap) (new tore()));
	//   46   93:new             #86  <Class XfaForm$InverseStore>
	//   47   96:dup             
	//   48   97:invokespecial   #87  <Method void XfaForm$InverseStore()>
	//   49  100:astore_0        
				((tore) (obj)).follow.add(((Object) (hashmap)));
	//   50  101:aload           5
	//   51  103:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
	//   52  106:aload_0         
	//   53  107:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
	//   54  110:pop             
			} else
	//*  55  111:iload_3         
	//*  56  112:iconst_1        
	//*  57  113:isub            
	//*  58  114:istore_3        
	//*  59  115:aload_0         
	//*  60  116:astore          5
	//*  61  118:goto            54
			{
				hashmap = ((HashMap) ((tore)((tore) (obj)).follow.get(j)));
	//   62  121:aload           5
	//   63  123:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
	//   64  126:iload           4
	//   65  128:invokevirtual   #114 <Method Object ArrayList.get(int)>
	//   66  131:checkcast       #86  <Class XfaForm$InverseStore>
	//   67  134:astore_0        
			}
			i--;
			obj = ((Object) (hashmap));
		}
	//*  68  135:goto            111
		((tore) (obj)).part.add("");
	//   69  138:aload           5
	//   70  140:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
	//   71  143:ldc1            #29  <String "">
	//   72  145:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
	//   73  148:pop             
		((tore) (obj)).follow.add(((Object) (s)));
	//   74  149:aload           5
	//   75  151:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
	//   76  154:aload_2         
	//   77  155:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
	//   78  158:pop             
	//   79  159:return          
	}

	public static XfaForm.Stack2 splitParts(String s)
	{
		for(; s.startsWith("."); s = s.substring(1));
	//    0    0:aload_0         
	//    1    1:ldc1            #120 <String ".">
	//    2    3:invokevirtual   #124 <Method boolean String.startsWith(String)>
	//    3    6:ifeq            18
	//    4    9:aload_0         
	//    5   10:iconst_1        
	//    6   11:invokevirtual   #55  <Method String String.substring(int)>
	//    7   14:astore_0        
	//*   8   15:goto            0
		XfaForm.Stack2 stack2 = new XfaForm.Stack2();
	//    9   18:new             #74  <Class XfaForm$Stack2>
	//   10   21:dup             
	//   11   22:invokespecial   #125 <Method void XfaForm$Stack2()>
	//   12   25:astore          5
		int i = 0;
	//   13   27:iconst_0        
	//   14   28:istore_1        
		do
		{
			int j = i;
	//   15   29:iload_1         
	//   16   30:istore_2        
label0:
			do
			{
				j = s.indexOf('.', j);
	//   17   31:aload_0         
	//   18   32:bipush          46
	//   19   34:iload_2         
	//   20   35:invokevirtual   #52  <Method int String.indexOf(int, int)>
	//   21   38:istore_2        
				while(j < 0 || s.charAt(j - 1) != '\\') 
	//*  22   39:iload_2         
	//*  23   40:ifge            94
				{
					if(j < 0)
	//*  24   43:iload_2         
	//*  25   44:ifge            113
					{
						String s1 = s.substring(i);
	//   26   47:aload_0         
	//   27   48:iload_1         
	//   28   49:invokevirtual   #55  <Method String String.substring(int)>
	//   29   52:astore_3        
						s = s1;
	//   30   53:aload_3         
	//   31   54:astore_0        
						if(!s1.endsWith("]"))
	//*  32   55:aload_3         
	//*  33   56:ldc1            #67  <String "]">
	//*  34   58:invokevirtual   #128 <Method boolean String.endsWith(String)>
	//*  35   61:ifne            84
							s = (new StringBuilder()).append(s1).append("[0]").toString();
	//   36   64:new             #130 <Class StringBuilder>
	//   37   67:dup             
	//   38   68:invokespecial   #131 <Method void StringBuilder()>
	//   39   71:aload_3         
	//   40   72:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:ldc1            #136 <String "[0]">
	//   42   77:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   43   80:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   44   83:astore_0        
						stack2.add(((Object) (s)));
	//   45   84:aload           5
	//   46   86:aload_0         
	//   47   87:invokevirtual   #138 <Method boolean XfaForm$Stack2.add(Object)>
	//   48   90:pop             
						return stack2;
	//   49   91:aload           5
	//   50   93:areturn         
					}
					break label0;
				}
	//   51   94:aload_0         
	//   52   95:iload_2         
	//   53   96:iconst_1        
	//   54   97:isub            
	//   55   98:invokevirtual   #142 <Method char String.charAt(int)>
	//   56  101:bipush          92
	//   57  103:icmpne          43
				j++;
	//   58  106:iload_2         
	//   59  107:iconst_1        
	//   60  108:iadd            
	//   61  109:istore_2        
			} while(true);
	//   62  110:goto            31
			String s3 = s.substring(i, j);
	//   63  113:aload_0         
	//   64  114:iload_1         
	//   65  115:iload_2         
	//   66  116:invokevirtual   #42  <Method String String.substring(int, int)>
	//   67  119:astore          4
			String s2 = s3;
	//   68  121:aload           4
	//   69  123:astore_3        
			if(!s3.endsWith("]"))
	//*  70  124:aload           4
	//*  71  126:ldc1            #67  <String "]">
	//*  72  128:invokevirtual   #128 <Method boolean String.endsWith(String)>
	//*  73  131:ifne            155
				s2 = (new StringBuilder()).append(s3).append("[0]").toString();
	//   74  134:new             #130 <Class StringBuilder>
	//   75  137:dup             
	//   76  138:invokespecial   #131 <Method void StringBuilder()>
	//   77  141:aload           4
	//   78  143:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   79  146:ldc1            #136 <String "[0]">
	//   80  148:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   81  151:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   82  154:astore_3        
			stack2.add(((Object) (s2)));
	//   83  155:aload           5
	//   84  157:aload_3         
	//   85  158:invokevirtual   #138 <Method boolean XfaForm$Stack2.add(Object)>
	//   86  161:pop             
			i = j + 1;
	//   87  162:iload_2         
	//   88  163:iconst_1        
	//   89  164:iadd            
	//   90  165:istore_1        
		} while(true);
	//   91  166:goto            29
	}

	public static String unescapeSom(String s)
	{
		int i = s.indexOf('\\');
	//    0    0:aload_0         
	//    1    1:bipush          92
	//    2    3:invokevirtual   #35  <Method int String.indexOf(int)>
	//    3    6:istore_1        
		if(i < 0)
	//*   4    7:iload_1         
	//*   5    8:ifge            13
			return s;
	//    6   11:aload_0         
	//    7   12:areturn         
		StringBuffer stringbuffer = new StringBuffer();
	//    8   13:new             #37  <Class StringBuffer>
	//    9   16:dup             
	//   10   17:invokespecial   #38  <Method void StringBuffer()>
	//   11   20:astore_3        
		int j = 0;
	//   12   21:iconst_0        
	//   13   22:istore_2        
		for(; i >= 0; i = s.indexOf('\\', i + 1))
	//*  14   23:iload_1         
	//*  15   24:iflt            55
		{
			stringbuffer.append(s.substring(j, i));
	//   16   27:aload_3         
	//   17   28:aload_0         
	//   18   29:iload_2         
	//   19   30:iload_1         
	//   20   31:invokevirtual   #42  <Method String String.substring(int, int)>
	//   21   34:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   22   37:pop             
			j = i + 1;
	//   23   38:iload_1         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
		}

	//   27   42:aload_0         
	//   28   43:bipush          92
	//   29   45:iload_1         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:invokevirtual   #52  <Method int String.indexOf(int, int)>
	//   33   51:istore_1        
	//*  34   52:goto            23
		stringbuffer.append(s.substring(j));
	//   35   55:aload_3         
	//   36   56:aload_0         
	//   37   57:iload_2         
	//   38   58:invokevirtual   #55  <Method String String.substring(int)>
	//   39   61:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   40   64:pop             
		return stringbuffer.toString();
	//   41   65:aload_3         
	//   42   66:invokevirtual   #59  <Method String StringBuffer.toString()>
	//   43   69:areturn         
	}

	public HashMap getInverseSearch()
	{
		return inverseSearch;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field HashMap inverseSearch>
	//    2    4:areturn         
	}

	public HashMap getName2Node()
	{
		return name2Node;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field HashMap name2Node>
	//    2    4:areturn         
	}

	public ArrayList getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field ArrayList order>
	//    2    4:areturn         
	}

	public void inverseSearchAdd(String s)
	{
		inverseSearchAdd(inverseSearch, stack, s);
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field HashMap inverseSearch>
	//    2    4:aload_0         
	//    3    5:getfield        #161 <Field XfaForm$Stack2 stack>
	//    4    8:aload_1         
	//    5    9:invokestatic    #163 <Method void inverseSearchAdd(HashMap, XfaForm$Stack2, String)>
	//    6   12:return          
	}

	public String inverseSearchGlobal(ArrayList arraylist)
	{
		if(!arraylist.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
	//    2    4:ifeq            9
_L1:
		tore tore;
		return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
	//*   5    9:aload_0         
	//*   6   10:getfield        #148 <Field HashMap inverseSearch>
	//*   7   13:aload_1         
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #170 <Method int ArrayList.size()>
	//*  10   18:iconst_1        
	//*  11   19:isub            
	//*  12   20:invokevirtual   #114 <Method Object ArrayList.get(int)>
	//*  13   23:invokevirtual   #84  <Method Object HashMap.get(Object)>
	//*  14   26:checkcast       #86  <Class XfaForm$InverseStore>
	//*  15   29:astore          4
_L2:
		if((tore = (tore)inverseSearch.get(arraylist.get(arraylist.size() - 1))) == null)
			continue; /* Loop/switch isn't completed */
	//   16   31:aload           4
	//   17   33:ifnull          7
		int i = arraylist.size() - 2;
	//   18   36:aload_1         
	//   19   37:invokevirtual   #170 <Method int ArrayList.size()>
	//   20   40:iconst_2        
	//   21   41:isub            
	//   22   42:istore_2        
		do
		{
			if(i < 0)
				break;
	//   23   43:iload_2         
	//   24   44:iflt            109
			String s = (String)arraylist.get(i);
	//   25   47:aload_1         
	//   26   48:iload_2         
	//   27   49:invokevirtual   #114 <Method Object ArrayList.get(int)>
	//   28   52:checkcast       #31  <Class String>
	//   29   55:astore          5
			int j = tore.part.indexOf(((Object) (s)));
	//   30   57:aload           4
	//   31   59:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
	//   32   62:aload           5
	//   33   64:invokevirtual   #106 <Method int ArrayList.indexOf(Object)>
	//   34   67:istore_3        
			if(j < 0)
	//*  35   68:iload_3         
	//*  36   69:ifge            88
			{
				if(!tore.isSimilar(s))
	//*  37   72:aload           4
	//*  38   74:aload           5
	//*  39   76:invokevirtual   #173 <Method boolean XfaForm$InverseStore.isSimilar(String)>
	//*  40   79:ifne            7
					return tore.getDefaultName();
	//   41   82:aload           4
	//   42   84:invokevirtual   #176 <Method String XfaForm$InverseStore.getDefaultName()>
	//   43   87:areturn         
				continue; /* Loop/switch isn't completed */
			}
			tore = (tore)tore.follow.get(j);
	//   44   88:aload           4
	//   45   90:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
	//   46   93:iload_3         
	//   47   94:invokevirtual   #114 <Method Object ArrayList.get(int)>
	//   48   97:checkcast       #86  <Class XfaForm$InverseStore>
	//   49  100:astore          4
			i--;
	//   50  102:iload_2         
	//   51  103:iconst_1        
	//   52  104:isub            
	//   53  105:istore_2        
		} while(true);
	//   54  106:goto            43
		return tore.getDefaultName();
	//   55  109:aload           4
	//   56  111:invokevirtual   #176 <Method String XfaForm$InverseStore.getDefaultName()>
	//   57  114:areturn         
		if(true) goto _L1; else goto _L3
_L3:
	}

	protected String printStack()
	{
		if(stack.empty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field XfaForm$Stack2 stack>
	//*   2    4:invokevirtual   #181 <Method boolean XfaForm$Stack2.empty()>
	//*   3    7:ifeq            13
			return "";
	//    4   10:ldc1            #29  <String "">
	//    5   12:areturn         
		StringBuffer stringbuffer = new StringBuffer();
	//    6   13:new             #37  <Class StringBuffer>
	//    7   16:dup             
	//    8   17:invokespecial   #38  <Method void StringBuffer()>
	//    9   20:astore_2        
		for(int i = 0; i < stack.size(); i++)
	//*  10   21:iconst_0        
	//*  11   22:istore_1        
	//*  12   23:iload_1         
	//*  13   24:aload_0         
	//*  14   25:getfield        #161 <Field XfaForm$Stack2 stack>
	//*  15   28:invokevirtual   #95  <Method int XfaForm$Stack2.size()>
	//*  16   31:icmpge          62
			stringbuffer.append('.').append((String)stack.get(i));
	//   17   34:aload_2         
	//   18   35:bipush          46
	//   19   37:invokevirtual   #49  <Method StringBuffer StringBuffer.append(char)>
	//   20   40:aload_0         
	//   21   41:getfield        #161 <Field XfaForm$Stack2 stack>
	//   22   44:iload_1         
	//   23   45:invokevirtual   #98  <Method Object XfaForm$Stack2.get(int)>
	//   24   48:checkcast       #31  <Class String>
	//   25   51:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
	//   26   54:pop             

	//   27   55:iload_1         
	//   28   56:iconst_1        
	//   29   57:iadd            
	//   30   58:istore_1        
	//*  31   59:goto            23
		return stringbuffer.substring(1);
	//   32   62:aload_2         
	//   33   63:iconst_1        
	//   34   64:invokevirtual   #182 <Method String StringBuffer.substring(int)>
	//   35   67:areturn         
	}

	public void setInverseSearch(HashMap hashmap)
	{
		inverseSearch = hashmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field HashMap inverseSearch>
	//    3    5:return          
	}

	public void setName2Node(HashMap hashmap)
	{
		name2Node = hashmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field HashMap name2Node>
	//    3    5:return          
	}

	public void setOrder(ArrayList arraylist)
	{
		order = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #157 <Field ArrayList order>
	//    3    5:return          
	}

	protected int anform;
	protected HashMap inverseSearch;
	protected HashMap name2Node;
	protected ArrayList order;
	protected XfaForm.Stack2 stack;

	public XfaForm$Xml2Som()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}
}
