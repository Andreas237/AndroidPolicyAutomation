// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.helpers;

import java.util.LinkedList;
import java.util.List;

public class ThrowableToStringArray
{

	public ThrowableToStringArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String[] convert(Throwable throwable)
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #13  <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void LinkedList()>
	//    3    7:astore_1        
		extract(((List) (linkedlist)), throwable, ((StackTraceElement []) (null)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokestatic    #18  <Method void extract(List, Throwable, StackTraceElement[])>
		return (String[])((List) (linkedlist)).toArray(((Object []) (new String[0])));
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:anewarray       String[]
	//   11   19:invokeinterface #26  <Method Object[] List.toArray(Object[])>
	//   12   24:checkcast       #28  <Class String[]>
	//   13   27:areturn         
	}

	private static void extract(List list, Throwable throwable, StackTraceElement astacktraceelement[])
	{
		StackTraceElement astacktraceelement1[] = throwable.getStackTrace();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method StackTraceElement[] Throwable.getStackTrace()>
	//    2    4:astore          5
		int j = findNumberOfCommonFrames(astacktraceelement1, astacktraceelement);
	//    3    6:aload           5
	//    4    8:aload_2         
	//    5    9:invokestatic    #38  <Method int findNumberOfCommonFrames(StackTraceElement[], StackTraceElement[])>
	//    6   12:istore          4
		list.add(((Object) (formatFirstLine(throwable, astacktraceelement))));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokestatic    #42  <Method String formatFirstLine(Throwable, StackTraceElement[])>
	//   11   20:invokeinterface #46  <Method boolean List.add(Object)>
	//   12   25:pop             
		for(int i = 0; i < astacktraceelement1.length - j; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore_3        
	//*  15   28:iload_3         
	//*  16   29:aload           5
	//*  17   31:arraylength     
	//*  18   32:iload           4
	//*  19   34:isub            
	//*  20   35:icmpge          83
		{
			astacktraceelement = ((StackTraceElement []) (new StringBuilder()));
	//   21   38:new             #48  <Class StringBuilder>
	//   22   41:dup             
	//   23   42:invokespecial   #49  <Method void StringBuilder()>
	//   24   45:astore_2        
			((StringBuilder) (astacktraceelement)).append("\tat ");
	//   25   46:aload_2         
	//   26   47:ldc1            #51  <String "\tat ">
	//   27   49:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			((StringBuilder) (astacktraceelement)).append(astacktraceelement1[i].toString());
	//   29   53:aload_2         
	//   30   54:aload           5
	//   31   56:iload_3         
	//   32   57:aaload          
	//   33   58:invokevirtual   #61  <Method String StackTraceElement.toString()>
	//   34   61:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
			list.add(((Object) (((StringBuilder) (astacktraceelement)).toString())));
	//   36   65:aload_0         
	//   37   66:aload_2         
	//   38   67:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   39   70:invokeinterface #46  <Method boolean List.add(Object)>
	//   40   75:pop             
		}

	//   41   76:iload_3         
	//   42   77:iconst_1        
	//   43   78:iadd            
	//   44   79:istore_3        
	//*  45   80:goto            28
		if(j != 0)
	//*  46   83:iload           4
	//*  47   85:ifeq            128
		{
			astacktraceelement = ((StackTraceElement []) (new StringBuilder()));
	//   48   88:new             #48  <Class StringBuilder>
	//   49   91:dup             
	//   50   92:invokespecial   #49  <Method void StringBuilder()>
	//   51   95:astore_2        
			((StringBuilder) (astacktraceelement)).append("\t... ");
	//   52   96:aload_2         
	//   53   97:ldc1            #64  <String "\t... ">
	//   54   99:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   55  102:pop             
			((StringBuilder) (astacktraceelement)).append(j);
	//   56  103:aload_2         
	//   57  104:iload           4
	//   58  106:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   59  109:pop             
			((StringBuilder) (astacktraceelement)).append(" common frames omitted");
	//   60  110:aload_2         
	//   61  111:ldc1            #69  <String " common frames omitted">
	//   62  113:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   63  116:pop             
			list.add(((Object) (((StringBuilder) (astacktraceelement)).toString())));
	//   64  117:aload_0         
	//   65  118:aload_2         
	//   66  119:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   67  122:invokeinterface #46  <Method boolean List.add(Object)>
	//   68  127:pop             
		}
		throwable = throwable.getCause();
	//   69  128:aload_1         
	//   70  129:invokevirtual   #73  <Method Throwable Throwable.getCause()>
	//   71  132:astore_1        
		if(throwable != null)
	//*  72  133:aload_1         
	//*  73  134:ifnull          144
			extract(list, throwable, astacktraceelement1);
	//   74  137:aload_0         
	//   75  138:aload_1         
	//   76  139:aload           5
	//   77  141:invokestatic    #18  <Method void extract(List, Throwable, StackTraceElement[])>
	//   78  144:return          
	}

	private static int findNumberOfCommonFrames(StackTraceElement astacktraceelement[], StackTraceElement astacktraceelement1[])
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(astacktraceelement1 == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return 0;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		int j = astacktraceelement.length - 1;
	//    6    9:aload_0         
	//    7   10:arraylength     
	//    8   11:iconst_1        
	//    9   12:isub            
	//   10   13:istore_3        
		for(int i = astacktraceelement1.length - 1; j >= 0 && i >= 0 && astacktraceelement[j].equals(((Object) (astacktraceelement1[i]))); i--)
	//*  11   14:aload_1         
	//*  12   15:arraylength     
	//*  13   16:iconst_1        
	//*  14   17:isub            
	//*  15   18:istore_2        
	//*  16   19:iload_3         
	//*  17   20:iflt            56
	//*  18   23:iload_2         
	//*  19   24:iflt            56
	//*  20   27:aload_0         
	//*  21   28:iload_3         
	//*  22   29:aaload          
	//*  23   30:aload_1         
	//*  24   31:iload_2         
	//*  25   32:aaload          
	//*  26   33:invokevirtual   #78  <Method boolean StackTraceElement.equals(Object)>
	//*  27   36:ifeq            56
		{
			k++;
	//   28   39:iload           4
	//   29   41:iconst_1        
	//   30   42:iadd            
	//   31   43:istore          4
			j--;
	//   32   45:iload_3         
	//   33   46:iconst_1        
	//   34   47:isub            
	//   35   48:istore_3        
		}

	//   36   49:iload_2         
	//   37   50:iconst_1        
	//   38   51:isub            
	//   39   52:istore_2        
	//*  40   53:goto            19
		return k;
	//   41   56:iload           4
	//   42   58:ireturn         
	}

	private static String formatFirstLine(Throwable throwable, StackTraceElement astacktraceelement[])
	{
		String s = "";
	//    0    0:ldc1            #80  <String "">
	//    1    2:astore_2        
		if(astacktraceelement != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          10
			s = "Caused by: ";
	//    4    7:ldc1            #82  <String "Caused by: ">
	//    5    9:astore_2        
		astacktraceelement = ((StackTraceElement []) (new StringBuilder()));
	//    6   10:new             #48  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #49  <Method void StringBuilder()>
	//    9   17:astore_1        
		((StringBuilder) (astacktraceelement)).append(s);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
		((StringBuilder) (astacktraceelement)).append(((Object) (throwable)).getClass().getName());
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:invokevirtual   #86  <Method Class Object.getClass()>
	//   17   29:invokevirtual   #91  <Method String Class.getName()>
	//   18   32:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		s = ((StringBuilder) (astacktraceelement)).toString();
	//   20   36:aload_1         
	//   21   37:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   22   40:astore_2        
		astacktraceelement = ((StackTraceElement []) (s));
	//   23   41:aload_2         
	//   24   42:astore_1        
		if(throwable.getMessage() != null)
	//*  25   43:aload_0         
	//*  26   44:invokevirtual   #94  <Method String Throwable.getMessage()>
	//*  27   47:ifnull          85
		{
			astacktraceelement = ((StackTraceElement []) (new StringBuilder()));
	//   28   50:new             #48  <Class StringBuilder>
	//   29   53:dup             
	//   30   54:invokespecial   #49  <Method void StringBuilder()>
	//   31   57:astore_1        
			((StringBuilder) (astacktraceelement)).append(s);
	//   32   58:aload_1         
	//   33   59:aload_2         
	//   34   60:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
			((StringBuilder) (astacktraceelement)).append(": ");
	//   36   64:aload_1         
	//   37   65:ldc1            #96  <String ": ">
	//   38   67:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   39   70:pop             
			((StringBuilder) (astacktraceelement)).append(throwable.getMessage());
	//   40   71:aload_1         
	//   41   72:aload_0         
	//   42   73:invokevirtual   #94  <Method String Throwable.getMessage()>
	//   43   76:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   44   79:pop             
			astacktraceelement = ((StackTraceElement []) (((StringBuilder) (astacktraceelement)).toString()));
	//   45   80:aload_1         
	//   46   81:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   47   84:astore_1        
		}
		return ((String) (astacktraceelement));
	//   48   85:aload_1         
	//   49   86:areturn         
	}
}
