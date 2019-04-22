// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.content.Context;
import java.util.*;

// Referenced classes of package com.google.android.gms.analytics:
//			ExceptionParser

public class StandardExceptionParser
	implements ExceptionParser
{

	public StandardExceptionParser(Context context, Collection collection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class TreeSet>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void TreeSet()>
	//    6   12:putfield        #20  <Field TreeSet zzsl>
		setIncludedPackages(context, collection);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #23  <Method void setIncludedPackages(Context, Collection)>
	//   11   21:return          
	}

	protected StackTraceElement getBestStackTraceElement(Throwable throwable)
	{
		throwable = ((Throwable) (throwable.getStackTrace()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method StackTraceElement[] Throwable.getStackTrace()>
	//    2    4:astore_1        
		if(throwable != null && throwable.length != 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          90
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifne            17
	//*   8   14:goto            90
		{
			int j = throwable.length;
	//    9   17:aload_1         
	//   10   18:arraylength     
	//   11   19:istore_3        
			int i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_2        
			do
			{
				if(i >= j)
					break;
	//   14   22:iload_2         
	//   15   23:iload_3         
	//   16   24:icmpge          86
				StackTraceElement stacktraceelement = ((StackTraceElement) (throwable[i]));
	//   17   27:aload_1         
	//   18   28:iload_2         
	//   19   29:aaload          
	//   20   30:astore          4
				String s = stacktraceelement.getClassName();
	//   21   32:aload           4
	//   22   34:invokevirtual   #40  <Method String StackTraceElement.getClassName()>
	//   23   37:astore          5
				for(Iterator iterator = zzsl.iterator(); iterator.hasNext();)
	//*  24   39:aload_0         
	//*  25   40:getfield        #20  <Field TreeSet zzsl>
	//*  26   43:invokevirtual   #44  <Method Iterator TreeSet.iterator()>
	//*  27   46:astore          6
	//*  28   48:aload           6
	//*  29   50:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*  30   55:ifeq            79
					if(s.startsWith((String)iterator.next()))
	//*  31   58:aload           5
	//*  32   60:aload           6
	//*  33   62:invokeinterface #54  <Method Object Iterator.next()>
	//*  34   67:checkcast       #56  <Class String>
	//*  35   70:invokevirtual   #60  <Method boolean String.startsWith(String)>
	//*  36   73:ifeq            48
						return stacktraceelement;
	//   37   76:aload           4
	//   38   78:areturn         

				i++;
	//   39   79:iload_2         
	//   40   80:iconst_1        
	//   41   81:iadd            
	//   42   82:istore_2        
			} while(true);
	//   43   83:goto            22
			return ((StackTraceElement) (throwable[0]));
	//   44   86:aload_1         
	//   45   87:iconst_0        
	//   46   88:aaload          
	//   47   89:areturn         
		} else
		{
			return null;
	//   48   90:aconst_null     
	//   49   91:areturn         
		}
	}

	protected Throwable getCause(Throwable throwable)
	{
		for(; throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method Throwable Throwable.getCause()>
	//    2    4:ifnull          15
	//    3    7:aload_1         
	//    4    8:invokevirtual   #65  <Method Throwable Throwable.getCause()>
	//    5   11:astore_1        
	//*   6   12:goto            0
		return throwable;
	//    7   15:aload_1         
	//    8   16:areturn         
	}

	public String getDescription(String s, Throwable throwable)
	{
		return getDescription(getCause(throwable), getBestStackTraceElement(getCause(throwable)), s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #69  <Method Throwable getCause(Throwable)>
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #69  <Method Throwable getCause(Throwable)>
	//    8   12:invokevirtual   #71  <Method StackTraceElement getBestStackTraceElement(Throwable)>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #74  <Method String getDescription(Throwable, StackTraceElement, String)>
	//   11   19:areturn         
	}

	protected String getDescription(Throwable throwable, StackTraceElement stacktraceelement, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append(((Object) (throwable)).getClass().getSimpleName());
	//    4    9:aload           5
	//    5   11:aload_1         
	//    6   12:invokevirtual   #81  <Method Class Object.getClass()>
	//    7   15:invokevirtual   #86  <Method String Class.getSimpleName()>
	//    8   18:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		if(stacktraceelement != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          103
		{
			String as[] = stacktraceelement.getClassName().split("\\.");
	//   12   26:aload_2         
	//   13   27:invokevirtual   #40  <Method String StackTraceElement.getClassName()>
	//   14   30:ldc1            #92  <String "\\.">
	//   15   32:invokevirtual   #96  <Method String[] String.split(String)>
	//   16   35:astore          6
			String s1 = "unknown";
	//   17   37:ldc1            #98  <String "unknown">
	//   18   39:astore          4
			throwable = ((Throwable) (s1));
	//   19   41:aload           4
	//   20   43:astore_1        
			if(as != null)
	//*  21   44:aload           6
	//*  22   46:ifnull          67
			{
				throwable = ((Throwable) (s1));
	//   23   49:aload           4
	//   24   51:astore_1        
				if(as.length > 0)
	//*  25   52:aload           6
	//*  26   54:arraylength     
	//*  27   55:ifle            67
					throwable = ((Throwable) (as[as.length - 1]));
	//   28   58:aload           6
	//   29   60:aload           6
	//   30   62:arraylength     
	//   31   63:iconst_1        
	//   32   64:isub            
	//   33   65:aaload          
	//   34   66:astore_1        
			}
			stringbuilder.append(String.format(" (@%s:%s:%s)", new Object[] {
				throwable, stacktraceelement.getMethodName(), Integer.valueOf(stacktraceelement.getLineNumber())
			}));
	//   35   67:aload           5
	//   36   69:ldc1            #100 <String " (@%s:%s:%s)">
	//   37   71:iconst_3        
	//   38   72:anewarray       Object[]
	//   39   75:dup             
	//   40   76:iconst_0        
	//   41   77:aload_1         
	//   42   78:aastore         
	//   43   79:dup             
	//   44   80:iconst_1        
	//   45   81:aload_2         
	//   46   82:invokevirtual   #103 <Method String StackTraceElement.getMethodName()>
	//   47   85:aastore         
	//   48   86:dup             
	//   49   87:iconst_2        
	//   50   88:aload_2         
	//   51   89:invokevirtual   #107 <Method int StackTraceElement.getLineNumber()>
	//   52   92:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//   53   95:aastore         
	//   54   96:invokestatic    #117 <Method String String.format(String, Object[])>
	//   55   99:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   56  102:pop             
		}
		if(s != null)
	//*  57  103:aload_3         
	//*  58  104:ifnull          126
			stringbuilder.append(String.format(" {%s}", new Object[] {
				s
			}));
	//   59  107:aload           5
	//   60  109:ldc1            #119 <String " {%s}">
	//   61  111:iconst_1        
	//   62  112:anewarray       Object[]
	//   63  115:dup             
	//   64  116:iconst_0        
	//   65  117:aload_3         
	//   66  118:aastore         
	//   67  119:invokestatic    #117 <Method String String.format(String, Object[])>
	//   68  122:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   69  125:pop             
		return stringbuilder.toString();
	//   70  126:aload           5
	//   71  128:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   72  131:areturn         
	}

	public void setIncludedPackages(Context context, Collection collection)
	{
		zzsl.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field TreeSet zzsl>
	//    2    4:invokevirtual   #125 <Method void TreeSet.clear()>
		HashSet hashset = new HashSet();
	//    3    7:new             #127 <Class HashSet>
	//    4   10:dup             
	//    5   11:invokespecial   #128 <Method void HashSet()>
	//    6   14:astore          4
		if(collection != null)
	//*   7   16:aload_2         
	//*   8   17:ifnull          29
			((Set) (hashset)).addAll(collection);
	//    9   20:aload           4
	//   10   22:aload_2         
	//   11   23:invokeinterface #134 <Method boolean Set.addAll(Collection)>
	//   12   28:pop             
		if(context != null)
	//*  13   29:aload_1         
	//*  14   30:ifnull          48
			((Set) (hashset)).add(((Object) (context.getApplicationContext().getPackageName())));
	//   15   33:aload           4
	//   16   35:aload_1         
	//   17   36:invokevirtual   #140 <Method Context Context.getApplicationContext()>
	//   18   39:invokevirtual   #143 <Method String Context.getPackageName()>
	//   19   42:invokeinterface #147 <Method boolean Set.add(Object)>
	//   20   47:pop             
		context = ((Context) (((Set) (hashset)).iterator()));
	//   21   48:aload           4
	//   22   50:invokeinterface #148 <Method Iterator Set.iterator()>
	//   23   55:astore_1        
		do
		{
			if(!((Iterator) (context)).hasNext())
				break;
	//   24   56:aload_1         
	//   25   57:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   26   62:ifeq            160
			collection = ((Collection) ((String)((Iterator) (context)).next()));
	//   27   65:aload_1         
	//   28   66:invokeinterface #54  <Method Object Iterator.next()>
	//   29   71:checkcast       #56  <Class String>
	//   30   74:astore_2        
			boolean flag = true;
	//   31   75:iconst_1        
	//   32   76:istore_3        
			Iterator iterator = zzsl.iterator();
	//   33   77:aload_0         
	//   34   78:getfield        #20  <Field TreeSet zzsl>
	//   35   81:invokevirtual   #44  <Method Iterator TreeSet.iterator()>
	//   36   84:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
	//   37   86:aload           4
	//   38   88:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   39   93:ifeq            144
				String s = (String)iterator.next();
	//   40   96:aload           4
	//   41   98:invokeinterface #54  <Method Object Iterator.next()>
	//   42  103:checkcast       #56  <Class String>
	//   43  106:astore          5
				if(!((String) (collection)).startsWith(s))
	//*  44  108:aload_2         
	//*  45  109:aload           5
	//*  46  111:invokevirtual   #60  <Method boolean String.startsWith(String)>
	//*  47  114:ifne            139
				{
					if(s.startsWith(((String) (collection))))
	//*  48  117:aload           5
	//*  49  119:aload_2         
	//*  50  120:invokevirtual   #60  <Method boolean String.startsWith(String)>
	//*  51  123:ifeq            144
						zzsl.remove(((Object) (s)));
	//   52  126:aload_0         
	//   53  127:getfield        #20  <Field TreeSet zzsl>
	//   54  130:aload           5
	//   55  132:invokevirtual   #151 <Method boolean TreeSet.remove(Object)>
	//   56  135:pop             
					break;
	//   57  136:goto            144
				}
				flag = false;
	//   58  139:iconst_0        
	//   59  140:istore_3        
			} while(true);
	//   60  141:goto            86
			if(flag)
	//*  61  144:iload_3         
	//*  62  145:ifeq            56
				zzsl.add(((Object) (collection)));
	//   63  148:aload_0         
	//   64  149:getfield        #20  <Field TreeSet zzsl>
	//   65  152:aload_2         
	//   66  153:invokevirtual   #152 <Method boolean TreeSet.add(Object)>
	//   67  156:pop             
		} while(true);
	//   68  157:goto            56
	//   69  160:return          
	}

	private final TreeSet zzsl = new TreeSet();
}
