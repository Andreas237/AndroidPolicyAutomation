// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;

public class CallerData
{

	public CallerData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
	//    2    4:return          
	}

	public static StackTraceElement[] extract(Throwable throwable, String s, int i, List list)
	{
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		throwable = ((Throwable) (throwable.getStackTrace()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #58  <Method StackTraceElement[] Throwable.getStackTrace()>
	//    6   10:astore_0        
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore          7
		int k = 0;
	//    9   14:iconst_0        
	//   10   15:istore          5
		int j;
		int l;
		for(j = -1; k < throwable.length; j = l)
	//*  11   17:iconst_m1       
	//*  12   18:istore          4
	//*  13   20:iload           5
	//*  14   22:aload_0         
	//*  15   23:arraylength     
	//*  16   24:icmpge          77
		{
			if(isInFrameworkSpace(((StackTraceElement) (throwable[k])).getClassName(), s, list))
	//*  17   27:aload_0         
	//*  18   28:iload           5
	//*  19   30:aaload          
	//*  20   31:invokevirtual   #61  <Method String StackTraceElement.getClassName()>
	//*  21   34:aload_1         
	//*  22   35:aload_3         
	//*  23   36:invokestatic    #65  <Method boolean isInFrameworkSpace(String, String, List)>
	//*  24   39:ifeq            51
			{
				l = k + 1;
	//   25   42:iload           5
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:istore          6
			} else
	//*  29   48:goto            64
			{
				l = j;
	//   30   51:iload           4
	//   31   53:istore          6
				if(j != -1)
	//*  32   55:iload           4
	//*  33   57:iconst_m1       
	//*  34   58:icmpeq          64
					break;
	//   35   61:goto            77
			}
			k++;
	//   36   64:iload           5
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore          5
		}

	//   40   70:iload           6
	//   41   72:istore          4
	//*  42   74:goto            20
		if(j == -1)
	//*  43   77:iload           4
	//*  44   79:iconst_m1       
	//*  45   80:icmpne          87
			return EMPTY_CALLER_DATA_ARRAY;
	//   46   83:getstatic       #48  <Field StackTraceElement[] EMPTY_CALLER_DATA_ARRAY>
	//   47   86:areturn         
		int i1 = throwable.length - j;
	//   48   87:aload_0         
	//   49   88:arraylength     
	//   50   89:iload           4
	//   51   91:isub            
	//   52   92:istore          6
		k = i1;
	//   53   94:iload           6
	//   54   96:istore          5
		if(i < i1)
	//*  55   98:iload_2         
	//*  56   99:iload           6
	//*  57  101:icmpge          107
			k = i;
	//   58  104:iload_2         
	//   59  105:istore          5
		s = ((String) (new StackTraceElement[k]));
	//   60  107:iload           5
	//   61  109:anewarray       StackTraceElement[]
	//   62  112:astore_1        
		for(i = ((int) (flag)); i < k; i++)
	//*  63  113:iload           7
	//*  64  115:istore_2        
	//*  65  116:iload_2         
	//*  66  117:iload           5
	//*  67  119:icmpge          138
			s[i] = throwable[j + i];
	//   68  122:aload_1         
	//   69  123:iload_2         
	//   70  124:aload_0         
	//   71  125:iload           4
	//   72  127:iload_2         
	//   73  128:iadd            
	//   74  129:aaload          
	//   75  130:aastore         

	//   76  131:iload_2         
	//   77  132:iconst_1        
	//   78  133:iadd            
	//   79  134:istore_2        
	//*  80  135:goto            116
		return ((StackTraceElement []) (s));
	//   81  138:aload_1         
	//   82  139:areturn         
	}

	static boolean isInFrameworkSpace(String s, String s1, List list)
	{
		return s.equals(((Object) (s1))) || s.equals("org.apache.log4j.Category") || s.startsWith("org.slf4j.Logger") || isInFrameworkSpaceList(s, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #73  <Method boolean String.equals(Object)>
	//    3    5:ifne            39
	//    4    8:aload_0         
	//    5    9:ldc1            #14  <String "org.apache.log4j.Category">
	//    6   11:invokevirtual   #73  <Method boolean String.equals(Object)>
	//    7   14:ifne            39
	//    8   17:aload_0         
	//    9   18:ldc1            #20  <String "org.slf4j.Logger">
	//   10   20:invokevirtual   #77  <Method boolean String.startsWith(String)>
	//   11   23:ifne            39
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:invokestatic    #81  <Method boolean isInFrameworkSpaceList(String, List)>
	//   15   31:ifeq            37
	//   16   34:goto            39
	//   17   37:iconst_0        
	//   18   38:ireturn         
	//   19   39:iconst_1        
	//   20   40:ireturn         
	}

	private static boolean isInFrameworkSpaceList(String s, List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #88  <Method Iterator List.iterator()>
	//*   6   12:astore_1        
	//*   7   13:aload_1         
	//*   8   14:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            40
			if(s.startsWith((String)((Iterator) (list)).next()))
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #98  <Method Object Iterator.next()>
	//*  13   29:checkcast       #69  <Class String>
	//*  14   32:invokevirtual   #77  <Method boolean String.startsWith(String)>
	//*  15   35:ifeq            13
				return true;
	//   16   38:iconst_1        
	//   17   39:ireturn         

		return false;
	//   18   40:iconst_0        
	//   19   41:ireturn         
	}

	public static StackTraceElement naInstance()
	{
		return new StackTraceElement("?", "?", "?", -1);
	//    0    0:new             #46  <Class StackTraceElement>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "?">
	//    3    6:ldc1            #17  <String "?">
	//    4    8:ldc1            #17  <String "?">
	//    5   10:iconst_m1       
	//    6   11:invokespecial   #104 <Method void StackTraceElement(String, String, String, int)>
	//    7   14:areturn         
	}

	public static final String CALLER_DATA_NA;
	public static final StackTraceElement EMPTY_CALLER_DATA_ARRAY[] = new StackTraceElement[0];
	public static final int LINE_NA = -1;
	private static final String LOG4J_CATEGORY = "org.apache.log4j.Category";
	public static final String NA = "?";
	private static final String SLF4J_BOUNDARY = "org.slf4j.Logger";

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append("?#?:?");
	//    4    8:aload_0         
	//    5    9:ldc1            #29  <String "?#?:?">
	//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    8   15:aload_0         
	//    9   16:getstatic       #38  <Field String CoreConstants.LINE_SEPARATOR>
	//   10   19:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		CALLER_DATA_NA = stringbuilder.toString();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   14   27:putstatic       #44  <Field String CALLER_DATA_NA>
	//   15   30:iconst_0        
	//   16   31:anewarray       StackTraceElement[]
	//   17   34:putstatic       #48  <Field StackTraceElement[] EMPTY_CALLER_DATA_ARRAY>
	//*  18   37:return          
	}
}
