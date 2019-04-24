// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.*;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.util:
//			CachingDateFormatter

public class StatusPrinter
{

	public StatusPrinter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	private static void appendThrowable(StringBuilder stringbuilder, Throwable throwable)
	{
		String as[] = ThrowableToStringArray.convert(throwable);
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method String[] ThrowableToStringArray.convert(Throwable)>
	//    2    4:astore          4
		int j = as.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          88
		{
			String s = as[i];
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:astore          5
			if(!s.startsWith("Caused by: "))
	//*  15   23:aload           5
	//*  16   25:ldc1            #40  <String "Caused by: ">
	//*  17   27:invokevirtual   #46  <Method boolean String.startsWith(String)>
	//*  18   30:ifeq            36
	//*  19   33:goto            66
			{
				if(Character.isDigit(s.charAt(0)))
	//*  20   36:aload           5
	//*  21   38:iconst_0        
	//*  22   39:invokevirtual   #50  <Method char String.charAt(int)>
	//*  23   42:invokestatic    #56  <Method boolean Character.isDigit(char)>
	//*  24   45:ifeq            60
					throwable = "\t... ";
	//   25   48:ldc1            #58  <String "\t... ">
	//   26   50:astore_1        
				else
	//*  27   51:aload_0         
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  30   56:pop             
	//*  31   57:goto            66
					throwable = "\tat ";
	//   32   60:ldc1            #66  <String "\tat ">
	//   33   62:astore_1        
				stringbuilder.append(((String) (throwable)));
			}
	//*  34   63:goto            51
			stringbuilder.append(s);
	//   35   66:aload_0         
	//   36   67:aload           5
	//   37   69:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:pop             
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   39   73:aload_0         
	//   40   74:getstatic       #72  <Field String CoreConstants.LINE_SEPARATOR>
	//   41   77:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
		}

	//   43   81:iload_2         
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore_2        
	//*  47   85:goto            12
	//   48   88:return          
	}

	public static void buildStr(StringBuilder stringbuilder, String s, Status status)
	{
		Object obj;
		String s1;
		if(status.hasChildren())
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #80  <Method boolean Status.hasChildren()>
	//*   2    6:ifeq            42
		{
			obj = ((Object) (new StringBuilder()));
	//    3    9:new             #60  <Class StringBuilder>
	//    4   12:dup             
	//    5   13:invokespecial   #81  <Method void StringBuilder()>
	//    6   16:astore_3        
			((StringBuilder) (obj)).append(s);
	//    7   17:aload_3         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			s1 = "+ ";
	//   11   23:ldc1            #83  <String "+ ">
	//   12   25:astore          4
		} else
	//*  13   27:aload_3         
	//*  14   28:aload           4
	//*  15   30:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//*  16   33:pop             
	//*  17   34:aload_3         
	//*  18   35:invokevirtual   #87  <Method String StringBuilder.toString()>
	//*  19   38:astore_3        
	//*  20   39:goto            63
		{
			obj = ((Object) (new StringBuilder()));
	//   21   42:new             #60  <Class StringBuilder>
	//   22   45:dup             
	//   23   46:invokespecial   #81  <Method void StringBuilder()>
	//   24   49:astore_3        
			((StringBuilder) (obj)).append(s);
	//   25   50:aload_3         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
			s1 = "|-";
	//   29   56:ldc1            #89  <String "|-">
	//   30   58:astore          4
		}
		((StringBuilder) (obj)).append(s1);
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//*  31   60:goto            27
		if(cachingDateFormat != null)
	//*  32   63:getstatic       #27  <Field CachingDateFormatter cachingDateFormat>
	//*  33   66:ifnull          96
		{
			stringbuilder.append(cachingDateFormat.format(status.getDate().longValue()));
	//   34   69:aload_0         
	//   35   70:getstatic       #27  <Field CachingDateFormatter cachingDateFormat>
	//   36   73:aload_2         
	//   37   74:invokeinterface #93  <Method Long Status.getDate()>
	//   38   79:invokevirtual   #99  <Method long Long.longValue()>
	//   39   82:invokevirtual   #103 <Method String CachingDateFormatter.format(long)>
	//   40   85:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   41   88:pop             
			stringbuilder.append(" ");
	//   42   89:aload_0         
	//   43   90:ldc1            #105 <String " ">
	//   44   92:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
		}
		stringbuilder.append(((String) (obj)));
	//   46   96:aload_0         
	//   47   97:aload_3         
	//   48   98:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
		stringbuilder.append(((Object) (status)));
	//   50  102:aload_0         
	//   51  103:aload_2         
	//   52  104:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   53  107:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   54  108:aload_0         
	//   55  109:getstatic       #72  <Field String CoreConstants.LINE_SEPARATOR>
	//   56  112:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
		if(status.getThrowable() != null)
	//*  58  116:aload_2         
	//*  59  117:invokeinterface #112 <Method Throwable Status.getThrowable()>
	//*  60  122:ifnull          135
			appendThrowable(stringbuilder, status.getThrowable());
	//   61  125:aload_0         
	//   62  126:aload_2         
	//   63  127:invokeinterface #112 <Method Throwable Status.getThrowable()>
	//   64  132:invokestatic    #114 <Method void appendThrowable(StringBuilder, Throwable)>
		if(status.hasChildren())
	//*  65  135:aload_2         
	//*  66  136:invokeinterface #80  <Method boolean Status.hasChildren()>
	//*  67  141:ifeq            207
		{
			Status status1;
			StringBuilder stringbuilder1;
			for(status = ((Status) (status.iterator())); ((Iterator) (status)).hasNext(); buildStr(stringbuilder, stringbuilder1.toString(), status1))
	//*  68  144:aload_2         
	//*  69  145:invokeinterface #118 <Method Iterator Status.iterator()>
	//*  70  150:astore_2        
	//*  71  151:aload_2         
	//*  72  152:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//*  73  157:ifeq            207
			{
				status1 = (Status)((Iterator) (status)).next();
	//   74  160:aload_2         
	//   75  161:invokeinterface #127 <Method Object Iterator.next()>
	//   76  166:checkcast       #76  <Class Status>
	//   77  169:astore_3        
				stringbuilder1 = new StringBuilder();
	//   78  170:new             #60  <Class StringBuilder>
	//   79  173:dup             
	//   80  174:invokespecial   #81  <Method void StringBuilder()>
	//   81  177:astore          4
				stringbuilder1.append(s);
	//   82  179:aload           4
	//   83  181:aload_1         
	//   84  182:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   85  185:pop             
				stringbuilder1.append("  ");
	//   86  186:aload           4
	//   87  188:ldc1            #129 <String "  ">
	//   88  190:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   89  193:pop             
			}

	//   90  194:aload_0         
	//   91  195:aload           4
	//   92  197:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   93  200:aload_3         
	//   94  201:invokestatic    #131 <Method void buildStr(StringBuilder, String, Status)>
		}
	//*  95  204:goto            151
	//   96  207:return          
	}

	private static void buildStrFromStatusList(StringBuilder stringbuilder, List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); buildStr(stringbuilder, "", (Status)((Iterator) (list)).next()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #136 <Method Iterator List.iterator()>
	//    5   11:astore_1        
	//    6   12:aload_1         
	//    7   13:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            39
	//    9   21:aload_0         
	//   10   22:ldc1            #138 <String "">
	//   11   24:aload_1         
	//   12   25:invokeinterface #127 <Method Object Iterator.next()>
	//   13   30:checkcast       #76  <Class Status>
	//   14   33:invokestatic    #131 <Method void buildStr(StringBuilder, String, Status)>
	//*  15   36:goto            12
	//   16   39:return          
	}

	public static void print(Context context)
	{
		print(context, 0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokestatic    #145 <Method void print(Context, long)>
	//    3    5:return          
	}

	public static void print(Context context, long l)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Context argument cannot be null");
	//    2    4:new             #147 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #149 <String "Context argument cannot be null">
	//    5   10:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		Object obj = ((Object) (context.getStatusManager()));
	//    7   14:aload_0         
	//    8   15:invokeinterface #156 <Method StatusManager Context.getStatusManager()>
	//    9   20:astore_3        
		if(obj == null)
	//*  10   21:aload_3         
	//*  11   22:ifnonnull       76
		{
			obj = ((Object) (ps));
	//   12   25:getstatic       #17  <Field PrintStream ps>
	//   13   28:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   29:new             #60  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #81  <Method void StringBuilder()>
	//   17   36:astore          4
			stringbuilder.append("WARN: Context named \"");
	//   18   38:aload           4
	//   19   40:ldc1            #158 <String "WARN: Context named \"">
	//   20   42:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(context.getName());
	//   22   46:aload           4
	//   23   48:aload_0         
	//   24   49:invokeinterface #161 <Method String Context.getName()>
	//   25   54:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   26   57:pop             
			stringbuilder.append("\" has no status manager");
	//   27   58:aload           4
	//   28   60:ldc1            #163 <String "\" has no status manager">
	//   29   62:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
			((PrintStream) (obj)).println(stringbuilder.toString());
	//   31   66:aload_3         
	//   32   67:aload           4
	//   33   69:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   34   72:invokevirtual   #168 <Method void PrintStream.println(String)>
			return;
	//   35   75:return          
		} else
		{
			print(((StatusManager) (obj)), l);
	//   36   76:aload_3         
	//   37   77:lload_1         
	//   38   78:invokestatic    #171 <Method void print(StatusManager, long)>
			return;
	//   39   81:return          
		}
	}

	public static void print(StatusManager statusmanager)
	{
		print(statusmanager, 0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokestatic    #171 <Method void print(StatusManager, long)>
	//    3    5:return          
	}

	public static void print(StatusManager statusmanager, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuilder()>
	//    3    7:astore_3        
		buildStrFromStatusList(stringbuilder, StatusUtil.filterStatusListByTimeThreshold(statusmanager.getCopyOfStatusList(), l));
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:invokeinterface #178 <Method List StatusManager.getCopyOfStatusList()>
	//    7   15:lload_1         
	//    8   16:invokestatic    #184 <Method List StatusUtil.filterStatusListByTimeThreshold(List, long)>
	//    9   19:invokestatic    #186 <Method void buildStrFromStatusList(StringBuilder, List)>
		ps.println(stringbuilder.toString());
	//   10   22:getstatic       #17  <Field PrintStream ps>
	//   11   25:aload_3         
	//   12   26:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   13   29:invokevirtual   #168 <Method void PrintStream.println(String)>
	//   14   32:return          
	}

	public static void print(List list)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuilder()>
	//    3    7:astore_1        
		buildStrFromStatusList(stringbuilder, list);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #186 <Method void buildStrFromStatusList(StringBuilder, List)>
		ps.println(stringbuilder.toString());
	//    7   13:getstatic       #17  <Field PrintStream ps>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   10   20:invokevirtual   #168 <Method void PrintStream.println(String)>
	//   11   23:return          
	}

	public static void printIfErrorsOccured(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Context argument cannot be null");
	//    2    4:new             #147 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #149 <String "Context argument cannot be null">
	//    5   10:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		Object obj = ((Object) (context.getStatusManager()));
	//    7   14:aload_0         
	//    8   15:invokeinterface #156 <Method StatusManager Context.getStatusManager()>
	//    9   20:astore_1        
		if(obj == null)
	//*  10   21:aload_1         
	//*  11   22:ifnonnull       71
		{
			obj = ((Object) (ps));
	//   12   25:getstatic       #17  <Field PrintStream ps>
	//   13   28:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   29:new             #60  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #81  <Method void StringBuilder()>
	//   17   36:astore_2        
			stringbuilder.append("WARN: Context named \"");
	//   18   37:aload_2         
	//   19   38:ldc1            #158 <String "WARN: Context named \"">
	//   20   40:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			stringbuilder.append(context.getName());
	//   22   44:aload_2         
	//   23   45:aload_0         
	//   24   46:invokeinterface #161 <Method String Context.getName()>
	//   25   51:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append("\" has no status manager");
	//   27   55:aload_2         
	//   28   56:ldc1            #163 <String "\" has no status manager">
	//   29   58:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
			((PrintStream) (obj)).println(stringbuilder.toString());
	//   31   62:aload_1         
	//   32   63:aload_2         
	//   33   64:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   34   67:invokevirtual   #168 <Method void PrintStream.println(String)>
			return;
	//   35   70:return          
		}
		if((new StatusUtil(context)).getHighestLevel(0L) == 2)
	//*  36   71:new             #180 <Class StatusUtil>
	//*  37   74:dup             
	//*  38   75:aload_0         
	//*  39   76:invokespecial   #191 <Method void StatusUtil(Context)>
	//*  40   79:lconst_0        
	//*  41   80:invokevirtual   #195 <Method int StatusUtil.getHighestLevel(long)>
	//*  42   83:iconst_2        
	//*  43   84:icmpne          91
			print(((StatusManager) (obj)));
	//   44   87:aload_1         
	//   45   88:invokestatic    #197 <Method void print(StatusManager)>
	//   46   91:return          
	}

	public static void printInCaseOfErrorsOrWarnings(Context context)
	{
		printInCaseOfErrorsOrWarnings(context, 0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokestatic    #200 <Method void printInCaseOfErrorsOrWarnings(Context, long)>
	//    3    5:return          
	}

	public static void printInCaseOfErrorsOrWarnings(Context context, long l)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Context argument cannot be null");
	//    2    4:new             #147 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #149 <String "Context argument cannot be null">
	//    5   10:invokespecial   #150 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		Object obj = ((Object) (context.getStatusManager()));
	//    7   14:aload_0         
	//    8   15:invokeinterface #156 <Method StatusManager Context.getStatusManager()>
	//    9   20:astore_3        
		if(obj == null)
	//*  10   21:aload_3         
	//*  11   22:ifnonnull       76
		{
			obj = ((Object) (ps));
	//   12   25:getstatic       #17  <Field PrintStream ps>
	//   13   28:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   29:new             #60  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #81  <Method void StringBuilder()>
	//   17   36:astore          4
			stringbuilder.append("WARN: Context named \"");
	//   18   38:aload           4
	//   19   40:ldc1            #158 <String "WARN: Context named \"">
	//   20   42:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(context.getName());
	//   22   46:aload           4
	//   23   48:aload_0         
	//   24   49:invokeinterface #161 <Method String Context.getName()>
	//   25   54:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   26   57:pop             
			stringbuilder.append("\" has no status manager");
	//   27   58:aload           4
	//   28   60:ldc1            #163 <String "\" has no status manager">
	//   29   62:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
			((PrintStream) (obj)).println(stringbuilder.toString());
	//   31   66:aload_3         
	//   32   67:aload           4
	//   33   69:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   34   72:invokevirtual   #168 <Method void PrintStream.println(String)>
			return;
	//   35   75:return          
		}
		if((new StatusUtil(context)).getHighestLevel(l) >= 1)
	//*  36   76:new             #180 <Class StatusUtil>
	//*  37   79:dup             
	//*  38   80:aload_0         
	//*  39   81:invokespecial   #191 <Method void StatusUtil(Context)>
	//*  40   84:lload_1         
	//*  41   85:invokevirtual   #195 <Method int StatusUtil.getHighestLevel(long)>
	//*  42   88:iconst_1        
	//*  43   89:icmplt          97
			print(((StatusManager) (obj)), l);
	//   44   92:aload_3         
	//   45   93:lload_1         
	//   46   94:invokestatic    #171 <Method void print(StatusManager, long)>
	//   47   97:return          
	}

	public static void setPrintStream(PrintStream printstream)
	{
		ps = printstream;
	//    0    0:aload_0         
	//    1    1:putstatic       #17  <Field PrintStream ps>
	//    2    4:return          
	}

	static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");
	private static PrintStream ps;

	static 
	{
		ps = System.out;
	//    0    0:getstatic       #15  <Field PrintStream System.out>
	//    1    3:putstatic       #17  <Field PrintStream ps>
	//    2    6:new             #19  <Class CachingDateFormatter>
	//    3    9:dup             
	//    4   10:ldc1            #21  <String "HH:mm:ss,SSS">
	//    5   12:invokespecial   #25  <Method void CachingDateFormatter(String)>
	//    6   15:putstatic       #27  <Field CachingDateFormatter cachingDateFormat>
	//*   7   18:return          
	}
}
