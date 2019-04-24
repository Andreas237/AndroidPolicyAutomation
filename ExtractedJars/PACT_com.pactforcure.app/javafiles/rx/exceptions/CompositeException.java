// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

public final class CompositeException extends RuntimeException
{

	public CompositeException(String s, Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void RuntimeException()>
		cause = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #33  <Field Throwable cause>
		s = ((String) (new LinkedHashSet()));
	//    5    9:new             #35  <Class LinkedHashSet>
	//    6   12:dup             
	//    7   13:invokespecial   #36  <Method void LinkedHashSet()>
	//    8   16:astore_1        
		ArrayList arraylist = new ArrayList();
	//    9   17:new             #38  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #39  <Method void ArrayList()>
	//   12   24:astore_3        
		if(collection != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          116
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*  15   29:aload_2         
	//*  16   30:invokeinterface #45  <Method Iterator Collection.iterator()>
	//*  17   35:astore_2        
	//*  18   36:aload_2         
	//*  19   37:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*  20   42:ifeq            130
			{
				Throwable throwable = (Throwable)((Iterator) (collection)).next();
	//   21   45:aload_2         
	//   22   46:invokeinterface #55  <Method Object Iterator.next()>
	//   23   51:checkcast       #57  <Class Throwable>
	//   24   54:astore          4
				if(throwable instanceof CompositeException)
	//*  25   56:aload           4
	//*  26   58:instanceof      #2   <Class CompositeException>
	//*  27   61:ifeq            82
					((Set) (s)).addAll(((Collection) (((CompositeException)throwable).getExceptions())));
	//   28   64:aload_1         
	//   29   65:aload           4
	//   30   67:checkcast       #2   <Class CompositeException>
	//   31   70:invokevirtual   #61  <Method List getExceptions()>
	//   32   73:invokeinterface #67  <Method boolean Set.addAll(Collection)>
	//   33   78:pop             
				else
	//*  34   79:goto            36
				if(throwable != null)
	//*  35   82:aload           4
	//*  36   84:ifnull          99
					((Set) (s)).add(((Object) (throwable)));
	//   37   87:aload_1         
	//   38   88:aload           4
	//   39   90:invokeinterface #71  <Method boolean Set.add(Object)>
	//   40   95:pop             
				else
	//*  41   96:goto            36
					((Set) (s)).add(((Object) (new NullPointerException())));
	//   42   99:aload_1         
	//   43  100:new             #73  <Class NullPointerException>
	//   44  103:dup             
	//   45  104:invokespecial   #74  <Method void NullPointerException()>
	//   46  107:invokeinterface #71  <Method boolean Set.add(Object)>
	//   47  112:pop             
			}

		else
	//*  48  113:goto            36
			((Set) (s)).add(((Object) (new NullPointerException())));
	//   49  116:aload_1         
	//   50  117:new             #73  <Class NullPointerException>
	//   51  120:dup             
	//   52  121:invokespecial   #74  <Method void NullPointerException()>
	//   53  124:invokeinterface #71  <Method boolean Set.add(Object)>
	//   54  129:pop             
		((List) (arraylist)).addAll(((Collection) (s)));
	//   55  130:aload_3         
	//   56  131:aload_1         
	//   57  132:invokeinterface #77  <Method boolean List.addAll(Collection)>
	//   58  137:pop             
		exceptions = Collections.unmodifiableList(((List) (arraylist)));
	//   59  138:aload_0         
	//   60  139:aload_3         
	//   61  140:invokestatic    #83  <Method List Collections.unmodifiableList(List)>
	//   62  143:putfield        #85  <Field List exceptions>
		message = (new StringBuilder()).append(exceptions.size()).append(" exceptions occurred. ").toString();
	//   63  146:aload_0         
	//   64  147:new             #87  <Class StringBuilder>
	//   65  150:dup             
	//   66  151:invokespecial   #88  <Method void StringBuilder()>
	//   67  154:aload_0         
	//   68  155:getfield        #85  <Field List exceptions>
	//   69  158:invokeinterface #92  <Method int List.size()>
	//   70  163:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   71  166:ldc1            #98  <String " exceptions occurred. ">
	//   72  168:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   73  171:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   74  174:putfield        #107 <Field String message>
	//   75  177:return          
	}

	public CompositeException(Collection collection)
	{
		this(((String) (null)), collection);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #114 <Method void CompositeException(String, Collection)>
	//    4    6:return          
	}

	public transient CompositeException(Throwable athrowable[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void RuntimeException()>
		cause = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #33  <Field Throwable cause>
		LinkedHashSet linkedhashset = new LinkedHashSet();
	//    5    9:new             #35  <Class LinkedHashSet>
	//    6   12:dup             
	//    7   13:invokespecial   #36  <Method void LinkedHashSet()>
	//    8   16:astore          4
		ArrayList arraylist = new ArrayList();
	//    9   18:new             #38  <Class ArrayList>
	//   10   21:dup             
	//   11   22:invokespecial   #39  <Method void ArrayList()>
	//   12   25:astore          5
		if(athrowable != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          113
		{
			int j = athrowable.length;
	//   15   31:aload_1         
	//   16   32:arraylength     
	//   17   33:istore_3        
			int i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_2        
			while(i < j) 
	//*  20   36:iload_2         
	//*  21   37:iload_3         
	//*  22   38:icmpge          128
			{
				Throwable throwable = athrowable[i];
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:aaload          
	//   26   44:astore          6
				if(throwable instanceof CompositeException)
	//*  27   46:aload           6
	//*  28   48:instanceof      #2   <Class CompositeException>
	//*  29   51:ifeq            77
					((Set) (linkedhashset)).addAll(((Collection) (((CompositeException)throwable).getExceptions())));
	//   30   54:aload           4
	//   31   56:aload           6
	//   32   58:checkcast       #2   <Class CompositeException>
	//   33   61:invokevirtual   #61  <Method List getExceptions()>
	//   34   64:invokeinterface #67  <Method boolean Set.addAll(Collection)>
	//   35   69:pop             
				else
	//*  36   70:iload_2         
	//*  37   71:iconst_1        
	//*  38   72:iadd            
	//*  39   73:istore_2        
	//*  40   74:goto            36
				if(throwable != null)
	//*  41   77:aload           6
	//*  42   79:ifnull          95
					((Set) (linkedhashset)).add(((Object) (throwable)));
	//   43   82:aload           4
	//   44   84:aload           6
	//   45   86:invokeinterface #71  <Method boolean Set.add(Object)>
	//   46   91:pop             
				else
	//*  47   92:goto            70
					((Set) (linkedhashset)).add(((Object) (new NullPointerException())));
	//   48   95:aload           4
	//   49   97:new             #73  <Class NullPointerException>
	//   50  100:dup             
	//   51  101:invokespecial   #74  <Method void NullPointerException()>
	//   52  104:invokeinterface #71  <Method boolean Set.add(Object)>
	//   53  109:pop             
				i++;
			}
		} else
	//*  54  110:goto            70
		{
			((Set) (linkedhashset)).add(((Object) (new NullPointerException())));
	//   55  113:aload           4
	//   56  115:new             #73  <Class NullPointerException>
	//   57  118:dup             
	//   58  119:invokespecial   #74  <Method void NullPointerException()>
	//   59  122:invokeinterface #71  <Method boolean Set.add(Object)>
	//   60  127:pop             
		}
		((List) (arraylist)).addAll(((Collection) (linkedhashset)));
	//   61  128:aload           5
	//   62  130:aload           4
	//   63  132:invokeinterface #77  <Method boolean List.addAll(Collection)>
	//   64  137:pop             
		exceptions = Collections.unmodifiableList(((List) (arraylist)));
	//   65  138:aload_0         
	//   66  139:aload           5
	//   67  141:invokestatic    #83  <Method List Collections.unmodifiableList(List)>
	//   68  144:putfield        #85  <Field List exceptions>
		message = (new StringBuilder()).append(exceptions.size()).append(" exceptions occurred. ").toString();
	//   69  147:aload_0         
	//   70  148:new             #87  <Class StringBuilder>
	//   71  151:dup             
	//   72  152:invokespecial   #88  <Method void StringBuilder()>
	//   73  155:aload_0         
	//   74  156:getfield        #85  <Field List exceptions>
	//   75  159:invokeinterface #92  <Method int List.size()>
	//   76  164:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   77  167:ldc1            #98  <String " exceptions occurred. ">
	//   78  169:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   79  172:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   80  175:putfield        #107 <Field String message>
	//   81  178:return          
	}

	private void appendStackTrace(StringBuilder stringbuilder, Throwable throwable, String s)
	{
		stringbuilder.append(s).append(((Object) (throwable))).append("\n");
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//    5    9:ldc1            #125 <String "\n">
	//    6   11:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		s = ((String) (throwable.getStackTrace()));
	//    8   15:aload_2         
	//    9   16:invokevirtual   #129 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   10   19:astore_3        
		int j = s.length;
	//   11   20:aload_3         
	//   12   21:arraylength     
	//   13   22:istore          5
		for(int i = 0; i < j; i++)
	//*  14   24:iconst_0        
	//*  15   25:istore          4
	//*  16   27:iload           4
	//*  17   29:iload           5
	//*  18   31:icmpge          66
		{
			Object obj = s[i];
	//   19   34:aload_3         
	//   20   35:iload           4
	//   21   37:aaload          
	//   22   38:astore          6
			stringbuilder.append("\t\tat ").append(((Object) (obj))).append("\n");
	//   23   40:aload_1         
	//   24   41:ldc1            #131 <String "\t\tat ">
	//   25   43:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   26   46:aload           6
	//   27   48:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   28   51:ldc1            #125 <String "\n">
	//   29   53:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
		}

	//   31   57:iload           4
	//   32   59:iconst_1        
	//   33   60:iadd            
	//   34   61:istore          4
	//*  35   63:goto            27
		if(throwable.getCause() != null)
	//*  36   66:aload_2         
	//*  37   67:invokevirtual   #135 <Method Throwable Throwable.getCause()>
	//*  38   70:ifnull          91
		{
			stringbuilder.append("\tCaused by: ");
	//   39   73:aload_1         
	//   40   74:ldc1            #137 <String "\tCaused by: ">
	//   41   76:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
			appendStackTrace(stringbuilder, throwable.getCause(), "");
	//   43   80:aload_0         
	//   44   81:aload_1         
	//   45   82:aload_2         
	//   46   83:invokevirtual   #135 <Method Throwable Throwable.getCause()>
	//   47   86:ldc1            #139 <String "">
	//   48   88:invokespecial   #141 <Method void appendStackTrace(StringBuilder, Throwable, String)>
		}
	//   49   91:return          
	}

	private List getListOfCauses(Throwable throwable)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #38  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void ArrayList()>
	//    3    7:astore_3        
		Throwable throwable1 = throwable.getCause();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #135 <Method Throwable Throwable.getCause()>
	//    6   12:astore_2        
		throwable = throwable1;
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(throwable1 == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       26
			return ((List) (arraylist));
	//   11   19:aload_3         
	//   12   20:areturn         
		do
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #135 <Method Throwable Throwable.getCause()>
	//*  15   25:astore_1        
		{
			((List) (arraylist)).add(((Object) (throwable)));
	//   16   26:aload_3         
	//   17   27:aload_1         
	//   18   28:invokeinterface #144 <Method boolean List.add(Object)>
	//   19   33:pop             
			if(throwable.getCause() != null)
				throwable = throwable.getCause();
			else
	//*  20   34:aload_1         
	//*  21   35:invokevirtual   #135 <Method Throwable Throwable.getCause()>
	//*  22   38:ifnonnull       21
				return ((List) (arraylist));
	//   23   41:aload_3         
	//   24   42:areturn         
		} while(true);
	}

	private void printStackTrace(PrintStreamOrWriter printstreamorwriter)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(((Object) (this))).append("\n");
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//    7   15:ldc1            #125 <String "\n">
	//    8   17:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		StackTraceElement astacktraceelement[] = getStackTrace();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #148 <Method StackTraceElement[] getStackTrace()>
	//   12   25:astore          5
		int k = astacktraceelement.length;
	//   13   27:aload           5
	//   14   29:arraylength     
	//   15   30:istore_3        
		for(int i = 0; i < k; i++)
	//*  16   31:iconst_0        
	//*  17   32:istore_2        
	//*  18   33:iload_2         
	//*  19   34:iload_3         
	//*  20   35:icmpge          69
		{
			StackTraceElement stacktraceelement = astacktraceelement[i];
	//   21   38:aload           5
	//   22   40:iload_2         
	//   23   41:aaload          
	//   24   42:astore          6
			stringbuilder.append("\tat ").append(((Object) (stacktraceelement))).append("\n");
	//   25   44:aload           4
	//   26   46:ldc1            #150 <String "\tat ">
	//   27   48:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   28   51:aload           6
	//   29   53:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   30   56:ldc1            #125 <String "\n">
	//   31   58:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
		}

	//   33   62:iload_2         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore_2        
	//*  37   66:goto            33
		int j = 1;
	//   38   69:iconst_1        
	//   39   70:istore_2        
		for(Iterator iterator = exceptions.iterator(); iterator.hasNext();)
	//*  40   71:aload_0         
	//*  41   72:getfield        #85  <Field List exceptions>
	//*  42   75:invokeinterface #151 <Method Iterator List.iterator()>
	//*  43   80:astore          5
	//*  44   82:aload           5
	//*  45   84:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*  46   89:ifeq            143
		{
			Throwable throwable = (Throwable)iterator.next();
	//   47   92:aload           5
	//   48   94:invokeinterface #55  <Method Object Iterator.next()>
	//   49   99:checkcast       #57  <Class Throwable>
	//   50  102:astore          6
			stringbuilder.append("  ComposedException ").append(j).append(" :").append("\n");
	//   51  104:aload           4
	//   52  106:ldc1            #153 <String "  ComposedException ">
	//   53  108:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:iload_2         
	//   55  112:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   56  115:ldc1            #155 <String " :">
	//   57  117:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:ldc1            #125 <String "\n">
	//   59  122:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   60  125:pop             
			appendStackTrace(stringbuilder, throwable, "\t");
	//   61  126:aload_0         
	//   62  127:aload           4
	//   63  129:aload           6
	//   64  131:ldc1            #157 <String "\t">
	//   65  133:invokespecial   #141 <Method void appendStackTrace(StringBuilder, Throwable, String)>
			j++;
	//   66  136:iload_2         
	//   67  137:iconst_1        
	//   68  138:iadd            
	//   69  139:istore_2        
		}

	//*  70  140:goto            82
	/* block-local class not found */
	class PrintStreamOrWriter {}

		synchronized(printstreamorwriter.lock())
	//*  71  143:aload_1         
	//*  72  144:invokevirtual   #160 <Method Object CompositeException$PrintStreamOrWriter.lock()>
	//*  73  147:astore          5
	//*  74  149:aload           5
	//*  75  151:monitorenter    
		{
			printstreamorwriter.println(((Object) (stringbuilder.toString())));
	//   76  152:aload_1         
	//   77  153:aload           4
	//   78  155:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   79  158:invokevirtual   #164 <Method void CompositeException$PrintStreamOrWriter.println(Object)>
		}
	//   80  161:aload           5
	//   81  163:monitorexit     
		return;
	//   82  164:return          
		printstreamorwriter;
	//   83  165:astore_1        
		obj;
	//   84  166:aload           5
		JVM INSTR monitorexit ;
	//   85  168:monitorexit     
		throw printstreamorwriter;
	//   86  169:aload_1         
	//   87  170:athrow          
	}

	public Throwable getCause()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CompositeExceptionCausalChain compositeexceptioncausalchain;
		HashSet hashset;
		if(cause != null)
			break MISSING_BLOCK_LABEL_182;
	//    2    2:aload_0         
	//    3    3:getfield        #33  <Field Throwable cause>
	//    4    6:ifnonnull       182
	/* block-local class not found */
	class CompositeExceptionCausalChain {}

		compositeexceptioncausalchain = new CompositeExceptionCausalChain();
	//    5    9:new             #8   <Class CompositeException$CompositeExceptionCausalChain>
	//    6   12:dup             
	//    7   13:invokespecial   #165 <Method void CompositeException$CompositeExceptionCausalChain()>
	//    8   16:astore_3        
		hashset = new HashSet();
	//    9   17:new             #167 <Class HashSet>
	//   10   20:dup             
	//   11   21:invokespecial   #168 <Method void HashSet()>
	//   12   24:astore          4
		Object obj = ((Object) (compositeexceptioncausalchain));
	//   13   26:aload_3         
	//   14   27:astore_1        
		Iterator iterator = exceptions.iterator();
	//   15   28:aload_0         
	//   16   29:getfield        #85  <Field List exceptions>
	//   17   32:invokeinterface #151 <Method Iterator List.iterator()>
	//   18   37:astore          5
_L4:
		Object obj1;
		Iterator iterator1;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_177;
	//   19   39:aload           5
	//   20   41:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   21   46:ifeq            177
			obj1 = ((Object) ((Throwable)iterator.next()));
	//   22   49:aload           5
	//   23   51:invokeinterface #55  <Method Object Iterator.next()>
	//   24   56:checkcast       #57  <Class Throwable>
	//   25   59:astore_2        
		} while(((Set) (hashset)).contains(obj1));
	//   26   60:aload           4
	//   27   62:aload_2         
	//   28   63:invokeinterface #171 <Method boolean Set.contains(Object)>
	//   29   68:ifne            39
		((Set) (hashset)).add(obj1);
	//   30   71:aload           4
	//   31   73:aload_2         
	//   32   74:invokeinterface #71  <Method boolean Set.add(Object)>
	//   33   79:pop             
		iterator1 = getListOfCauses(((Throwable) (obj1))).iterator();
	//   34   80:aload_0         
	//   35   81:aload_2         
	//   36   82:invokespecial   #173 <Method List getListOfCauses(Throwable)>
	//   37   85:invokeinterface #151 <Method Iterator List.iterator()>
	//   38   90:astore          6
_L3:
		Throwable throwable1;
		if(!iterator1.hasNext())
			break MISSING_BLOCK_LABEL_157;
	//   39   92:aload           6
	//   40   94:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   41   99:ifeq            157
		throwable1 = (Throwable)iterator1.next();
	//   42  102:aload           6
	//   43  104:invokeinterface #55  <Method Object Iterator.next()>
	//   44  109:checkcast       #57  <Class Throwable>
	//   45  112:astore          7
		if(!((Set) (hashset)).contains(((Object) (throwable1)))) goto _L2; else goto _L1
	//   46  114:aload           4
	//   47  116:aload           7
	//   48  118:invokeinterface #171 <Method boolean Set.contains(Object)>
	//   49  123:ifeq            139
_L1:
		obj1 = ((Object) (new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...")));
	//   50  126:new             #4   <Class RuntimeException>
	//   51  129:dup             
	//   52  130:ldc1            #175 <String "Duplicate found in causal chain so cropping to prevent loop ...">
	//   53  132:invokespecial   #178 <Method void RuntimeException(String)>
	//   54  135:astore_2        
		  goto _L3
	//*  55  136:goto            92
_L2:
		((Set) (hashset)).add(((Object) (throwable1)));
	//   56  139:aload           4
	//   57  141:aload           7
	//   58  143:invokeinterface #71  <Method boolean Set.add(Object)>
	//   59  148:pop             
		  goto _L3
	//*  60  149:goto            92
		obj;
	//   61  152:astore_1        
	//*  62  153:aload_0         
		throw obj;
	//   63  154:monitorexit     
	//   64  155:aload_1         
	//   65  156:athrow          
		try
		{
			((Throwable) (obj)).initCause(((Throwable) (obj1)));
	//   66  157:aload_1         
	//   67  158:aload_2         
	//   68  159:invokevirtual   #182 <Method Throwable Throwable.initCause(Throwable)>
	//   69  162:pop             
			obj = ((Object) (((Throwable) (obj)).getCause()));
	//   70  163:aload_1         
	//   71  164:invokevirtual   #135 <Method Throwable Throwable.getCause()>
	//   72  167:astore_1        
		}
	//*  73  168:goto            39
		catch(Throwable throwable)
	//*  74  171:astore_1        
		{
			throwable = ((Throwable) (obj1));
	//   75  172:aload_2         
	//   76  173:astore_1        
		}
		  goto _L4
	//*  77  174:goto            39
		cause = ((Throwable) (compositeexceptioncausalchain));
	//   78  177:aload_0         
	//   79  178:aload_3         
	//   80  179:putfield        #33  <Field Throwable cause>
		throwable = cause;
	//   81  182:aload_0         
	//   82  183:getfield        #33  <Field Throwable cause>
	//   83  186:astore_1        
		this;
	//   84  187:aload_0         
		JVM INSTR monitorexit ;
	//   85  188:monitorexit     
		return throwable;
	//   86  189:aload_1         
	//   87  190:areturn         
	}

	public List getExceptions()
	{
		return exceptions;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field List exceptions>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String message>
	//    2    4:areturn         
	}

	public void printStackTrace()
	{
		printStackTrace(System.err);
	//    0    0:aload_0         
	//    1    1:getstatic       #190 <Field PrintStream System.err>
	//    2    4:invokevirtual   #193 <Method void printStackTrace(PrintStream)>
	//    3    7:return          
	}

	public void printStackTrace(PrintStream printstream)
	{
	/* block-local class not found */
	class WrappedPrintStream {}

		printStackTrace(((PrintStreamOrWriter) (new WrappedPrintStream(printstream))));
	//    0    0:aload_0         
	//    1    1:new             #12  <Class CompositeException$WrappedPrintStream>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #195 <Method void CompositeException$WrappedPrintStream(PrintStream)>
	//    5    9:invokespecial   #197 <Method void printStackTrace(CompositeException$PrintStreamOrWriter)>
	//    6   12:return          
	}

	public void printStackTrace(PrintWriter printwriter)
	{
	/* block-local class not found */
	class WrappedPrintWriter {}

		printStackTrace(((PrintStreamOrWriter) (new WrappedPrintWriter(printwriter))));
	//    0    0:aload_0         
	//    1    1:new             #14  <Class CompositeException$WrappedPrintWriter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #200 <Method void CompositeException$WrappedPrintWriter(PrintWriter)>
	//    5    9:invokespecial   #197 <Method void printStackTrace(CompositeException$PrintStreamOrWriter)>
	//    6   12:return          
	}

	private static final long serialVersionUID = 0x47b49592L;
	private Throwable cause;
	private final List exceptions;
	private final String message;
}
