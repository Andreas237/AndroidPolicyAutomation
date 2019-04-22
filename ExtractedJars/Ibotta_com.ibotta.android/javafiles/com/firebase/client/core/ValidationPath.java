// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseException;
import com.firebase.client.snapshot.ChildKey;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Path

public class ValidationPath
{

	private ValidationPath(Path path)
		throws FirebaseException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field List parts>
		int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		byteLength = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #27  <Field int byteLength>
		ChildKey childkey;
		for(path = ((Path) (path.iterator())); ((Iterator) (path)).hasNext(); parts.add(((Object) (childkey.asString()))))
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #33  <Method Iterator Path.iterator()>
	//*  14   26:astore_1        
	//*  15   27:aload_1         
	//*  16   28:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*  17   33:ifeq            63
			childkey = (ChildKey)((Iterator) (path)).next();
	//   18   36:aload_1         
	//   19   37:invokeinterface #43  <Method Object Iterator.next()>
	//   20   42:checkcast       #45  <Class ChildKey>
	//   21   45:astore_3        

	//   22   46:aload_0         
	//   23   47:getfield        #25  <Field List parts>
	//   24   50:aload_3         
	//   25   51:invokevirtual   #49  <Method String ChildKey.asString()>
	//   26   54:invokeinterface #55  <Method boolean List.add(Object)>
	//   27   59:pop             
	//*  28   60:goto            27
		byteLength = Math.max(1, parts.size());
	//   29   63:aload_0         
	//   30   64:iconst_1        
	//   31   65:aload_0         
	//   32   66:getfield        #25  <Field List parts>
	//   33   69:invokeinterface #59  <Method int List.size()>
	//   34   74:invokestatic    #65  <Method int Math.max(int, int)>
	//   35   77:putfield        #27  <Field int byteLength>
		for(; i < parts.size(); i++)
	//*  36   80:iload_2         
	//*  37   81:aload_0         
	//*  38   82:getfield        #25  <Field List parts>
	//*  39   85:invokeinterface #59  <Method int List.size()>
	//*  40   90:icmpge          125
			byteLength = byteLength + utf8Bytes((CharSequence)parts.get(i));
	//   41   93:aload_0         
	//   42   94:aload_0         
	//   43   95:getfield        #27  <Field int byteLength>
	//   44   98:aload_0         
	//   45   99:getfield        #25  <Field List parts>
	//   46  102:iload_2         
	//   47  103:invokeinterface #69  <Method Object List.get(int)>
	//   48  108:checkcast       #71  <Class CharSequence>
	//   49  111:invokestatic    #75  <Method int utf8Bytes(CharSequence)>
	//   50  114:iadd            
	//   51  115:putfield        #27  <Field int byteLength>

	//   52  118:iload_2         
	//   53  119:iconst_1        
	//   54  120:iadd            
	//   55  121:istore_2        
	//*  56  122:goto            80
		checkValid();
	//   57  125:aload_0         
	//   58  126:invokespecial   #78  <Method void checkValid()>
	//   59  129:return          
	}

	private void checkValid()
		throws FirebaseException
	{
		if(byteLength <= 768)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int byteLength>
	//*   2    4:sipush          768
	//*   3    7:icmpgt          61
		{
			if(parts.size() <= 32)
	//*   4   10:aload_0         
	//*   5   11:getfield        #25  <Field List parts>
	//*   6   14:invokeinterface #59  <Method int List.size()>
	//*   7   19:bipush          32
	//*   8   21:icmpgt          25
			{
				return;
	//    9   24:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   10   25:new             #82  <Class StringBuilder>
	//   11   28:dup             
	//   12   29:invokespecial   #83  <Method void StringBuilder()>
	//   13   32:astore_1        
				stringbuilder.append("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
	//   14   33:aload_1         
	//   15   34:ldc1            #85  <String "Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ">
	//   16   36:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
				stringbuilder.append(toErrorString());
	//   18   40:aload_1         
	//   19   41:aload_0         
	//   20   42:invokespecial   #92  <Method String toErrorString()>
	//   21   45:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				throw new FirebaseException(stringbuilder.toString());
	//   23   49:new             #17  <Class FirebaseException>
	//   24   52:dup             
	//   25   53:aload_1         
	//   26   54:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   27   57:invokespecial   #98  <Method void FirebaseException(String)>
	//   28   60:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   29   61:new             #82  <Class StringBuilder>
	//   30   64:dup             
	//   31   65:invokespecial   #83  <Method void StringBuilder()>
	//   32   68:astore_1        
			stringbuilder1.append("Data has a key path longer than 768 bytes (");
	//   33   69:aload_1         
	//   34   70:ldc1            #100 <String "Data has a key path longer than 768 bytes (">
	//   35   72:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
			stringbuilder1.append(byteLength);
	//   37   76:aload_1         
	//   38   77:aload_0         
	//   39   78:getfield        #27  <Field int byteLength>
	//   40   81:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   41   84:pop             
			stringbuilder1.append(").");
	//   42   85:aload_1         
	//   43   86:ldc1            #105 <String ").">
	//   44   88:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			throw new FirebaseException(stringbuilder1.toString());
	//   46   92:new             #17  <Class FirebaseException>
	//   47   95:dup             
	//   48   96:aload_1         
	//   49   97:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   50  100:invokespecial   #98  <Method void FirebaseException(String)>
	//   51  103:athrow          
		}
	}

	private static String joinStringList(String s, List list)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_3        
		for(int i = 0; i < list.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #59  <Method int List.size()>
	//*   9   17:icmpge          52
		{
			if(i > 0)
	//*  10   20:iload_2         
	//*  11   21:ifle            30
				stringbuilder.append(s);
	//   12   24:aload_3         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append((String)list.get(i));
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:iload_2         
	//   19   33:invokeinterface #69  <Method Object List.get(int)>
	//   20   38:checkcast       #109 <Class String>
	//   21   41:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		}

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
	//*  27   49:goto            10
		return stringbuilder.toString();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   30   56:areturn         
	}

	private String pop()
	{
		Object obj = ((Object) (parts));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List parts>
	//    2    4:astore_1        
		obj = ((Object) ((String)((List) (obj)).remove(((List) (obj)).size() - 1)));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokeinterface #59  <Method int List.size()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:invokeinterface #115 <Method Object List.remove(int)>
	//    9   19:checkcast       #109 <Class String>
	//   10   22:astore_1        
		byteLength = byteLength - utf8Bytes(((CharSequence) (obj)));
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field int byteLength>
	//   14   28:aload_1         
	//   15   29:invokestatic    #75  <Method int utf8Bytes(CharSequence)>
	//   16   32:isub            
	//   17   33:putfield        #27  <Field int byteLength>
		if(parts.size() > 0)
	//*  18   36:aload_0         
	//*  19   37:getfield        #25  <Field List parts>
	//*  20   40:invokeinterface #59  <Method int List.size()>
	//*  21   45:ifle            58
			byteLength = byteLength - 1;
	//   22   48:aload_0         
	//   23   49:aload_0         
	//   24   50:getfield        #27  <Field int byteLength>
	//   25   53:iconst_1        
	//   26   54:isub            
	//   27   55:putfield        #27  <Field int byteLength>
		return ((String) (obj));
	//   28   58:aload_1         
	//   29   59:areturn         
	}

	private void push(String s)
		throws FirebaseException
	{
		if(parts.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field List parts>
	//*   2    4:invokeinterface #59  <Method int List.size()>
	//*   3    9:ifle            22
			byteLength = byteLength + 1;
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #27  <Field int byteLength>
	//    7   17:iconst_1        
	//    8   18:iadd            
	//    9   19:putfield        #27  <Field int byteLength>
		parts.add(((Object) (s)));
	//   10   22:aload_0         
	//   11   23:getfield        #25  <Field List parts>
	//   12   26:aload_1         
	//   13   27:invokeinterface #55  <Method boolean List.add(Object)>
	//   14   32:pop             
		byteLength = byteLength + utf8Bytes(((CharSequence) (s)));
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #27  <Field int byteLength>
	//   18   38:aload_1         
	//   19   39:invokestatic    #75  <Method int utf8Bytes(CharSequence)>
	//   20   42:iadd            
	//   21   43:putfield        #27  <Field int byteLength>
		checkValid();
	//   22   46:aload_0         
	//   23   47:invokespecial   #78  <Method void checkValid()>
	//   24   50:return          
	}

	private String toErrorString()
	{
		if(parts.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field List parts>
	//*   2    4:invokeinterface #59  <Method int List.size()>
	//*   3    9:ifne            15
		{
			return "";
	//    4   12:ldc1            #118 <String "">
	//    5   14:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   15:new             #82  <Class StringBuilder>
	//    7   18:dup             
	//    8   19:invokespecial   #83  <Method void StringBuilder()>
	//    9   22:astore_1        
			stringbuilder.append("in path '");
	//   10   23:aload_1         
	//   11   24:ldc1            #120 <String "in path '">
	//   12   26:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(joinStringList("/", parts));
	//   14   30:aload_1         
	//   15   31:ldc1            #122 <String "/">
	//   16   33:aload_0         
	//   17   34:getfield        #25  <Field List parts>
	//   18   37:invokestatic    #124 <Method String joinStringList(String, List)>
	//   19   40:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
			stringbuilder.append("'");
	//   21   44:aload_1         
	//   22   45:ldc1            #126 <String "'">
	//   23   47:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			return stringbuilder.toString();
	//   25   51:aload_1         
	//   26   52:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   27   55:areturn         
		}
	}

	private static int utf8Bytes(CharSequence charsequence)
	{
		int k = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #129 <Method int CharSequence.length()>
	//    2    6:istore          4
		int j = 0;
	//    3    8:iconst_0        
	//    4    9:istore_3        
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		for(; j < k; j++)
	//*   7   12:iload_3         
	//*   8   13:iload           4
	//*   9   15:icmpge          82
		{
			char c = charsequence.charAt(j);
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:invokeinterface #133 <Method char CharSequence.charAt(int)>
	//   13   25:istore_1        
			if(c <= '\177')
	//*  14   26:iload_1         
	//*  15   27:bipush          127
	//*  16   29:icmpgt          39
			{
				i++;
	//   17   32:iload_2         
	//   18   33:iconst_1        
	//   19   34:iadd            
	//   20   35:istore_2        
				continue;
	//   21   36:goto            75
			}
			if(c <= '\u07FF')
	//*  22   39:iload_1         
	//*  23   40:sipush          2047
	//*  24   43:icmpgt          53
			{
				i += 2;
	//   25   46:iload_2         
	//   26   47:iconst_2        
	//   27   48:iadd            
	//   28   49:istore_2        
				continue;
	//   29   50:goto            75
			}
			if(Character.isHighSurrogate(c))
	//*  30   53:iload_1         
	//*  31   54:invokestatic    #139 <Method boolean Character.isHighSurrogate(char)>
	//*  32   57:ifeq            71
			{
				i += 4;
	//   33   60:iload_2         
	//   34   61:iconst_4        
	//   35   62:iadd            
	//   36   63:istore_2        
				j++;
	//   37   64:iload_3         
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_3        
			} else
	//*  41   68:goto            75
			{
				i += 3;
	//   42   71:iload_2         
	//   43   72:iconst_3        
	//   44   73:iadd            
	//   45   74:istore_2        
			}
		}

	//   46   75:iload_3         
	//   47   76:iconst_1        
	//   48   77:iadd            
	//   49   78:istore_3        
	//*  50   79:goto            12
		return i;
	//   51   82:iload_2         
	//   52   83:ireturn         
	}

	public static void validateWithObject(Path path, Object obj)
		throws FirebaseException
	{
		(new ValidationPath(path)).withObject(obj);
	//    0    0:new             #2   <Class ValidationPath>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #143 <Method void ValidationPath(Path)>
	//    4    8:aload_1         
	//    5    9:invokespecial   #147 <Method void withObject(Object)>
	//    6   12:return          
	}

	private void withObject(Object obj)
		throws FirebaseException
	{
		if(obj instanceof Map)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #149 <Class Map>
	//*   2    4:ifeq            84
		{
			obj = ((Object) ((Map)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #149 <Class Map>
	//    5   11:astore_1        
			Iterator iterator = ((Map) (obj)).keySet().iterator();
	//    6   12:aload_1         
	//    7   13:invokeinterface #153 <Method Set Map.keySet()>
	//    8   18:invokeinterface #156 <Method Iterator Set.iterator()>
	//    9   23:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   10   24:aload_3         
	//   11   25:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            83
				String s = (String)iterator.next();
	//   13   33:aload_3         
	//   14   34:invokeinterface #43  <Method Object Iterator.next()>
	//   15   39:checkcast       #109 <Class String>
	//   16   42:astore          4
				if(!s.startsWith("."))
	//*  17   44:aload           4
	//*  18   46:ldc1            #158 <String ".">
	//*  19   48:invokevirtual   #162 <Method boolean String.startsWith(String)>
	//*  20   51:ifeq            57
	//*  21   54:goto            24
				{
					push(s);
	//   22   57:aload_0         
	//   23   58:aload           4
	//   24   60:invokespecial   #164 <Method void push(String)>
					withObject(((Map) (obj)).get(((Object) (s))));
	//   25   63:aload_0         
	//   26   64:aload_1         
	//   27   65:aload           4
	//   28   67:invokeinterface #167 <Method Object Map.get(Object)>
	//   29   72:invokespecial   #147 <Method void withObject(Object)>
					pop();
	//   30   75:aload_0         
	//   31   76:invokespecial   #169 <Method String pop()>
	//   32   79:pop             
				}
			} while(true);
	//   33   80:goto            24
			return;
	//   34   83:return          
		}
		if(obj instanceof List)
	//*  35   84:aload_1         
	//*  36   85:instanceof      #51  <Class List>
	//*  37   88:ifeq            139
		{
			obj = ((Object) ((List)obj));
	//   38   91:aload_1         
	//   39   92:checkcast       #51  <Class List>
	//   40   95:astore_1        
			for(int i = 0; i < ((List) (obj)).size(); i++)
	//*  41   96:iconst_0        
	//*  42   97:istore_2        
	//*  43   98:iload_2         
	//*  44   99:aload_1         
	//*  45  100:invokeinterface #59  <Method int List.size()>
	//*  46  105:icmpge          139
			{
				push(Integer.toString(i));
	//   47  108:aload_0         
	//   48  109:iload_2         
	//   49  110:invokestatic    #174 <Method String Integer.toString(int)>
	//   50  113:invokespecial   #164 <Method void push(String)>
				withObject(((List) (obj)).get(i));
	//   51  116:aload_0         
	//   52  117:aload_1         
	//   53  118:iload_2         
	//   54  119:invokeinterface #69  <Method Object List.get(int)>
	//   55  124:invokespecial   #147 <Method void withObject(Object)>
				pop();
	//   56  127:aload_0         
	//   57  128:invokespecial   #169 <Method String pop()>
	//   58  131:pop             
			}

	//   59  132:iload_2         
	//   60  133:iconst_1        
	//   61  134:iadd            
	//   62  135:istore_2        
		}
	//*  63  136:goto            98
	//   64  139:return          
	}

	public static final int MAX_PATH_DEPTH = 32;
	public static final int MAX_PATH_LENGTH_BYTES = 768;
	private int byteLength;
	private final List parts = new ArrayList();
}
