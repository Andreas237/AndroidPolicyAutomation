// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.helpers;

import java.util.ArrayList;
import java.util.List;

public class CyclicBuffer
{

	public CyclicBuffer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		if(i < 1)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpge          49
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #20  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #21  <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append("The maxSize argument (");
	//    9   17:aload_2         
	//   10   18:ldc1            #23  <String "The maxSize argument (">
	//   11   20:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(i);
	//   13   24:aload_2         
	//   14   25:iload_1         
	//   15   26:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//   16   29:pop             
			stringbuilder.append(") is not a positive integer.");
	//   17   30:aload_2         
	//   18   31:ldc1            #32  <String ") is not a positive integer.">
	//   19   33:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   37:new             #34  <Class IllegalArgumentException>
	//   22   40:dup             
	//   23   41:aload_2         
	//   24   42:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   25   45:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   26   48:athrow          
		} else
		{
			init(i);
	//   27   49:aload_0         
	//   28   50:iload_1         
	//   29   51:invokespecial   #44  <Method void init(int)>
			return;
	//   30   54:return          
		}
	}

	public CyclicBuffer(CyclicBuffer cyclicbuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		maxSize = cyclicbuffer.maxSize;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #48  <Field int maxSize>
	//    5    9:putfield        #48  <Field int maxSize>
		ea = (Object[])new Object[maxSize];
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field int maxSize>
	//    9   17:anewarray       Object[]
	//   10   20:checkcast       #49  <Class Object[]>
	//   11   23:putfield        #51  <Field Object[] ea>
		System.arraycopy(((Object) (cyclicbuffer.ea)), 0, ((Object) (ea)), 0, maxSize);
	//   12   26:aload_1         
	//   13   27:getfield        #51  <Field Object[] ea>
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:getfield        #51  <Field Object[] ea>
	//   17   35:iconst_0        
	//   18   36:aload_0         
	//   19   37:getfield        #48  <Field int maxSize>
	//   20   40:invokestatic    #57  <Method void System.arraycopy(Object, int, Object, int, int)>
		last = cyclicbuffer.last;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:getfield        #59  <Field int last>
	//   24   48:putfield        #59  <Field int last>
		first = cyclicbuffer.first;
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:getfield        #61  <Field int first>
	//   28   56:putfield        #61  <Field int first>
		numElems = cyclicbuffer.numElems;
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:getfield        #63  <Field int numElems>
	//   32   64:putfield        #63  <Field int numElems>
	//   33   67:return          
	}

	private void init(int i)
	{
		maxSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int maxSize>
		ea = (Object[])new Object[i];
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:anewarray       Object[]
	//    6   10:checkcast       #49  <Class Object[]>
	//    7   13:putfield        #51  <Field Object[] ea>
		first = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #61  <Field int first>
		last = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #59  <Field int last>
		numElems = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #63  <Field int numElems>
	//   17   31:return          
	}

	public void add(Object obj)
	{
		ea[last] = obj;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object[] ea>
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field int last>
	//    4    8:aload_1         
	//    5    9:aastore         
		int i = last + 1;
	//    6   10:aload_0         
	//    7   11:getfield        #59  <Field int last>
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:istore_2        
		last = i;
	//   11   17:aload_0         
	//   12   18:iload_2         
	//   13   19:putfield        #59  <Field int last>
		if(i == maxSize)
	//*  14   22:iload_2         
	//*  15   23:aload_0         
	//*  16   24:getfield        #48  <Field int maxSize>
	//*  17   27:icmpne          35
			last = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #59  <Field int last>
		if(numElems < maxSize)
	//*  21   35:aload_0         
	//*  22   36:getfield        #63  <Field int numElems>
	//*  23   39:aload_0         
	//*  24   40:getfield        #48  <Field int maxSize>
	//*  25   43:icmpge          57
		{
			numElems = numElems + 1;
	//   26   46:aload_0         
	//   27   47:aload_0         
	//   28   48:getfield        #63  <Field int numElems>
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:putfield        #63  <Field int numElems>
			return;
	//   32   56:return          
		}
		i = first + 1;
	//   33   57:aload_0         
	//   34   58:getfield        #61  <Field int first>
	//   35   61:iconst_1        
	//   36   62:iadd            
	//   37   63:istore_2        
		first = i;
	//   38   64:aload_0         
	//   39   65:iload_2         
	//   40   66:putfield        #61  <Field int first>
		if(i == maxSize)
	//*  41   69:iload_2         
	//*  42   70:aload_0         
	//*  43   71:getfield        #48  <Field int maxSize>
	//*  44   74:icmpne          82
			first = 0;
	//   45   77:aload_0         
	//   46   78:iconst_0        
	//   47   79:putfield        #61  <Field int first>
	//   48   82:return          
	}

	public List asList()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #72  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #77  <Method int length()>
	//*   9   15:icmpge          37
			((List) (arraylist)).add(get(i));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #81  <Method Object get(int)>
	//   14   24:invokeinterface #86  <Method boolean List.add(Object)>
	//   15   29:pop             

	//   16   30:iload_1         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_1        
	//*  20   34:goto            10
		return ((List) (arraylist));
	//   21   37:aload_2         
	//   22   38:areturn         
	}

	public void clear()
	{
		init(maxSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int maxSize>
	//    3    5:invokespecial   #44  <Method void init(int)>
	//    4    8:return          
	}

	public Object get()
	{
		Object obj;
		if(numElems > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int numElems>
	//*   2    4:ifle            66
		{
			numElems = numElems - 1;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field int numElems>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:putfield        #63  <Field int numElems>
			Object obj1 = ea[first];
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field Object[] ea>
	//   11   21:aload_0         
	//   12   22:getfield        #61  <Field int first>
	//   13   25:aaload          
	//   14   26:astore_3        
			ea[first] = null;
	//   15   27:aload_0         
	//   16   28:getfield        #51  <Field Object[] ea>
	//   17   31:aload_0         
	//   18   32:getfield        #61  <Field int first>
	//   19   35:aconst_null     
	//   20   36:aastore         
			int i = first + 1;
	//   21   37:aload_0         
	//   22   38:getfield        #61  <Field int first>
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
			first = i;
	//   26   44:aload_0         
	//   27   45:iload_1         
	//   28   46:putfield        #61  <Field int first>
			obj = obj1;
	//   29   49:aload_3         
	//   30   50:astore_2        
			if(i == maxSize)
	//*  31   51:iload_1         
	//*  32   52:aload_0         
	//*  33   53:getfield        #48  <Field int maxSize>
	//*  34   56:icmpne          68
			{
				first = 0;
	//   35   59:aload_0         
	//   36   60:iconst_0        
	//   37   61:putfield        #61  <Field int first>
				return obj1;
	//   38   64:aload_3         
	//   39   65:areturn         
			}
		} else
		{
			obj = null;
	//   40   66:aconst_null     
	//   41   67:astore_2        
		}
		return obj;
	//   42   68:aload_2         
	//   43   69:areturn         
	}

	public Object get(int i)
	{
		if(i >= 0 && i < numElems)
	//*   0    0:iload_1         
	//*   1    1:iflt            32
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #63  <Field int numElems>
	//*   5    9:icmplt          15
	//*   6   12:goto            32
			return ea[(first + i) % maxSize];
	//    7   15:aload_0         
	//    8   16:getfield        #51  <Field Object[] ea>
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field int first>
	//   11   23:iload_1         
	//   12   24:iadd            
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field int maxSize>
	//   15   29:irem            
	//   16   30:aaload          
	//   17   31:areturn         
		else
			return ((Object) (null));
	//   18   32:aconst_null     
	//   19   33:areturn         
	}

	public int getMaxSize()
	{
		return maxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int maxSize>
	//    2    4:ireturn         
	}

	public int length()
	{
		return numElems;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int numElems>
	//    2    4:ireturn         
	}

	public void resize(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            49
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #20  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #21  <Method void StringBuilder()>
	//    5   11:astore          5
			stringbuilder.append("Negative array size [");
	//    6   13:aload           5
	//    7   15:ldc1            #95  <String "Negative array size [">
	//    8   17:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(i);
	//   10   21:aload           5
	//   11   23:iload_1         
	//   12   24:invokevirtual   #30  <Method StringBuilder StringBuilder.append(int)>
	//   13   27:pop             
			stringbuilder.append("] not allowed.");
	//   14   28:aload           5
	//   15   30:ldc1            #97  <String "] not allowed.">
	//   16   32:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   36:new             #34  <Class IllegalArgumentException>
	//   19   39:dup             
	//   20   40:aload           5
	//   21   42:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   22   45:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   23   48:athrow          
		}
		if(i == numElems)
	//*  24   49:iload_1         
	//*  25   50:aload_0         
	//*  26   51:getfield        #63  <Field int numElems>
	//*  27   54:icmpne          58
			return;
	//   28   57:return          
		Object aobj[] = (Object[])new Object[i];
	//   29   58:iload_1         
	//   30   59:anewarray       Object[]
	//   31   62:checkcast       #49  <Class Object[]>
	//   32   65:astore          5
		int j;
		if(i < numElems)
	//*  33   67:iload_1         
	//*  34   68:aload_0         
	//*  35   69:getfield        #63  <Field int numElems>
	//*  36   72:icmpge          80
			j = i;
	//   37   75:iload_1         
	//   38   76:istore_2        
		else
	//*  39   77:goto            85
			j = numElems;
	//   40   80:aload_0         
	//   41   81:getfield        #63  <Field int numElems>
	//   42   84:istore_2        
		for(int k = 0; k < j; k++)
	//*  43   85:iconst_0        
	//*  44   86:istore_3        
	//*  45   87:iload_3         
	//*  46   88:iload_2         
	//*  47   89:icmpge          150
		{
			aobj[k] = ea[first];
	//   48   92:aload           5
	//   49   94:iload_3         
	//   50   95:aload_0         
	//   51   96:getfield        #51  <Field Object[] ea>
	//   52   99:aload_0         
	//   53  100:getfield        #61  <Field int first>
	//   54  103:aaload          
	//   55  104:aastore         
			ea[first] = null;
	//   56  105:aload_0         
	//   57  106:getfield        #51  <Field Object[] ea>
	//   58  109:aload_0         
	//   59  110:getfield        #61  <Field int first>
	//   60  113:aconst_null     
	//   61  114:aastore         
			int l = first + 1;
	//   62  115:aload_0         
	//   63  116:getfield        #61  <Field int first>
	//   64  119:iconst_1        
	//   65  120:iadd            
	//   66  121:istore          4
			first = l;
	//   67  123:aload_0         
	//   68  124:iload           4
	//   69  126:putfield        #61  <Field int first>
			if(l == numElems)
	//*  70  129:iload           4
	//*  71  131:aload_0         
	//*  72  132:getfield        #63  <Field int numElems>
	//*  73  135:icmpne          143
				first = 0;
	//   74  138:aload_0         
	//   75  139:iconst_0        
	//   76  140:putfield        #61  <Field int first>
		}

	//   77  143:iload_3         
	//   78  144:iconst_1        
	//   79  145:iadd            
	//   80  146:istore_3        
	//*  81  147:goto            87
		ea = aobj;
	//   82  150:aload_0         
	//   83  151:aload           5
	//   84  153:putfield        #51  <Field Object[] ea>
		first = 0;
	//   85  156:aload_0         
	//   86  157:iconst_0        
	//   87  158:putfield        #61  <Field int first>
		numElems = j;
	//   88  161:aload_0         
	//   89  162:iload_2         
	//   90  163:putfield        #63  <Field int numElems>
		maxSize = i;
	//   91  166:aload_0         
	//   92  167:iload_1         
	//   93  168:putfield        #48  <Field int maxSize>
		if(j == i)
	//*  94  171:iload_2         
	//*  95  172:iload_1         
	//*  96  173:icmpne          182
		{
			last = 0;
	//   97  176:aload_0         
	//   98  177:iconst_0        
	//   99  178:putfield        #59  <Field int last>
			return;
	//  100  181:return          
		} else
		{
			last = j;
	//  101  182:aload_0         
	//  102  183:iload_2         
	//  103  184:putfield        #59  <Field int last>
			return;
	//  104  187:return          
		}
	}

	Object ea[];
	int first;
	int last;
	int maxSize;
	int numElems;
}
