// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.raizlabs.android.dbflow.sql:
//			Query, SQLiteType

public class QueryBuilder
	implements Query
{

	public QueryBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		query = new StringBuilder();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void StringBuilder()>
	//    6   12:putfield        #35  <Field StringBuilder query>
	//    7   15:return          
	}

	public QueryBuilder(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		query = new StringBuilder();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void StringBuilder()>
	//    6   12:putfield        #35  <Field StringBuilder query>
		append(obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	public static boolean isQuoted(String s)
	{
		return QUOTE_PATTERN.matcher(((CharSequence) (s))).find();
	//    0    0:getstatic       #26  <Field Pattern QUOTE_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #46  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:invokevirtual   #52  <Method boolean Matcher.find()>
	//    4   10:ireturn         
	}

	public static String join(CharSequence charsequence, Iterable iterable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_3        
		boolean flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		iterable = ((Iterable) (iterable.iterator()));
	//    6   10:aload_1         
	//    7   11:invokeinterface #60  <Method Iterator Iterable.iterator()>
	//    8   16:astore_1        
		while(((Iterator) (iterable)).hasNext()) 
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*  11   23:ifeq            59
		{
			Object obj = ((Iterator) (iterable)).next();
	//   12   26:aload_1         
	//   13   27:invokeinterface #69  <Method Object Iterator.next()>
	//   14   32:astore          4
			if(flag)
	//*  15   34:iload_2         
	//*  16   35:ifeq            50
				flag = false;
	//   17   38:iconst_0        
	//   18   39:istore_2        
			else
	//*  19   40:aload_3         
	//*  20   41:aload           4
	//*  21   43:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//*  22   46:pop             
	//*  23   47:goto            17
				stringbuilder.append(charsequence);
	//   24   50:aload_3         
	//   25   51:aload_0         
	//   26   52:invokevirtual   #75  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   27   55:pop             
			stringbuilder.append(obj);
		}
	//*  28   56:goto            40
		return stringbuilder.toString();
	//   29   59:aload_3         
	//   30   60:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   31   63:areturn         
	}

	public static String join(CharSequence charsequence, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore          5
		boolean flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_3        
		int j = aobj.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          4
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		while(i < j) 
	//*  11   17:iload_2         
	//*  12   18:iload           4
	//*  13   20:icmpge          59
		{
			Object obj = aobj[i];
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:astore          6
			if(flag)
	//*  18   28:iload_3         
	//*  19   29:ifeq            49
				flag = false;
	//   20   32:iconst_0        
	//   21   33:istore_3        
			else
	//*  22   34:aload           5
	//*  23   36:aload           6
	//*  24   38:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//*  25   41:pop             
	//*  26   42:iload_2         
	//*  27   43:iconst_1        
	//*  28   44:iadd            
	//*  29   45:istore_2        
	//*  30   46:goto            17
				stringbuilder.append(charsequence);
	//   31   49:aload           5
	//   32   51:aload_0         
	//   33   52:invokevirtual   #75  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   34   55:pop             
			stringbuilder.append(obj);
			i++;
		}
	//*  35   56:goto            34
		return stringbuilder.toString();
	//   36   59:aload           5
	//   37   61:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   38   64:areturn         
	}

	public static String quote(String s)
	{
		return (new StringBuilder()).append('`').append(s.replace(".", "`.`")).append('`').toString();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:bipush          96
	//    4    9:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//    5   12:aload_0         
	//    6   13:ldc1            #87  <String ".">
	//    7   15:ldc1            #89  <String "`.`">
	//    8   17:invokevirtual   #95  <Method String String.replace(CharSequence, CharSequence)>
	//    9   20:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:bipush          96
	//   11   25:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   12   28:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   13   31:areturn         
	}

	public static String quoteIfNeeded(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          20
		{
			s1 = s;
	//    4    6:aload_0         
	//    5    7:astore_1        
			if(!isQuoted(s))
	//*   6    8:aload_0         
	//*   7    9:invokestatic    #101 <Method boolean isQuoted(String)>
	//*   8   12:ifne            20
				s1 = quote(s);
	//    9   15:aload_0         
	//   10   16:invokestatic    #103 <Method String quote(String)>
	//   11   19:astore_1        
		}
		return s1;
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	public static String stripQuotes(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          24
		{
			s1 = s;
	//    4    6:aload_0         
	//    5    7:astore_1        
			if(isQuoted(s))
	//*   6    8:aload_0         
	//*   7    9:invokestatic    #101 <Method boolean isQuoted(String)>
	//*   8   12:ifeq            24
				s1 = s.replace("`", "");
	//    9   15:aload_0         
	//   10   16:ldc1            #106 <String "`">
	//   11   18:ldc1            #108 <String "">
	//   12   20:invokevirtual   #95  <Method String String.replace(CharSequence, CharSequence)>
	//   13   23:astore_1        
		}
		return s1;
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public QueryBuilder append(Object obj)
	{
		query.append(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field StringBuilder query>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//    4    8:pop             
		return castThis();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #112 <Method QueryBuilder castThis()>
	//    7   13:areturn         
	}

	public transient QueryBuilder appendArray(Object aobj[])
	{
		return append(((Object) (join(", ", aobj))));
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String ", ">
	//    2    3:aload_1         
	//    3    4:invokestatic    #120 <Method String join(CharSequence, Object[])>
	//    4    7:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    5   10:areturn         
	}

	public QueryBuilder appendList(List list)
	{
		return append(((Object) (join(", ", ((Iterable) (list))))));
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String ", ">
	//    2    3:aload_1         
	//    3    4:invokestatic    #125 <Method String join(CharSequence, Iterable)>
	//    4    7:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    5   10:areturn         
	}

	public QueryBuilder appendNotEmpty(String s)
	{
		if(s != null && !s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #131 <Method boolean String.isEmpty()>
	//*   4    8:ifne            17
			append(((Object) (s)));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    8   16:pop             
		return castThis();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #112 <Method QueryBuilder castThis()>
	//   11   21:areturn         
	}

	public QueryBuilder appendOptional(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			append(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    5    9:pop             
		return castThis();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #112 <Method QueryBuilder castThis()>
	//    8   14:areturn         
	}

	public QueryBuilder appendParenthesisEnclosed(Object obj)
	{
		return append("(").append(obj).append(")");
	//    0    0:aload_0         
	//    1    1:ldc1            #136 <String "(">
	//    2    3:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    3    6:aload_1         
	//    4    7:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    5   10:ldc1            #138 <String ")">
	//    6   12:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    7   15:areturn         
	}

	public QueryBuilder appendQualifier(String s, String s1)
	{
		if(s1 != null && s1.length() > 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          27
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #144 <Method int String.length()>
	//*   4    8:ifle            27
		{
			if(s != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          21
				append(((Object) (s)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//   10   20:pop             
			appendSpaceSeparated(((Object) (s1)));
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #147 <Method QueryBuilder appendSpaceSeparated(Object)>
	//   14   26:pop             
		}
		return castThis();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #112 <Method QueryBuilder castThis()>
	//   17   31:areturn         
	}

	public QueryBuilder appendQuoted(String s)
	{
		if(s.equals("*"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #151 <String "*">
	//*   2    3:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            15
		{
			return append(((Object) (s)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    7   14:areturn         
		} else
		{
			append(((Object) (quote(s))));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokestatic    #103 <Method String quote(String)>
	//   11   20:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//   12   23:pop             
			return castThis();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #112 <Method QueryBuilder castThis()>
	//   15   28:areturn         
		}
	}

	public transient QueryBuilder appendQuotedArray(Object aobj[])
	{
		return appendQuoted(join("`, `", aobj));
	//    0    0:aload_0         
	//    1    1:ldc1            #158 <String "`, `">
	//    2    3:aload_1         
	//    3    4:invokestatic    #120 <Method String join(CharSequence, Object[])>
	//    4    7:invokevirtual   #160 <Method QueryBuilder appendQuoted(String)>
	//    5   10:areturn         
	}

	public QueryBuilder appendQuotedIfNeeded(String s)
	{
		if(s.equals("*"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #151 <String "*">
	//*   2    3:invokevirtual   #155 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            15
		{
			return append(((Object) (s)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    7   14:areturn         
		} else
		{
			append(((Object) (quoteIfNeeded(s))));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokestatic    #163 <Method String quoteIfNeeded(String)>
	//   11   20:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//   12   23:pop             
			return castThis();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #112 <Method QueryBuilder castThis()>
	//   15   28:areturn         
		}
	}

	public QueryBuilder appendQuotedList(List list)
	{
		return appendQuoted(join("`, `", ((Iterable) (list))));
	//    0    0:aload_0         
	//    1    1:ldc1            #158 <String "`, `">
	//    2    3:aload_1         
	//    3    4:invokestatic    #125 <Method String join(CharSequence, Iterable)>
	//    4    7:invokevirtual   #160 <Method QueryBuilder appendQuoted(String)>
	//    5   10:areturn         
	}

	public QueryBuilder appendSQLiteType(SQLiteType sqlitetype)
	{
		return append(((Object) (sqlitetype.name())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method String SQLiteType.name()>
	//    3    5:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    4    8:areturn         
	}

	public QueryBuilder appendSpace()
	{
		return append(" ");
	//    0    0:aload_0         
	//    1    1:ldc1            #175 <String " ">
	//    2    3:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    3    6:areturn         
	}

	public QueryBuilder appendSpaceSeparated(Object obj)
	{
		return appendSpace().append(obj).appendSpace();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #178 <Method QueryBuilder appendSpace()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method QueryBuilder append(Object)>
	//    4    8:invokevirtual   #178 <Method QueryBuilder appendSpace()>
	//    5   11:areturn         
	}

	public QueryBuilder appendType(String s)
	{
		return appendSQLiteType(SQLiteType.get(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #183 <Method SQLiteType SQLiteType.get(String)>
	//    3    5:invokevirtual   #185 <Method QueryBuilder appendSQLiteType(SQLiteType)>
	//    4    8:areturn         
	}

	protected QueryBuilder castThis()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public String getQuery()
	{
		return query.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field StringBuilder query>
	//    2    4:invokevirtual   #79  <Method String StringBuilder.toString()>
	//    3    7:areturn         
	}

	public String toString()
	{
		return getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method String getQuery()>
	//    2    4:areturn         
	}

	private static final char QUOTE = 96;
	private static final Pattern QUOTE_PATTERN = Pattern.compile("`.*`");
	protected StringBuilder query;

	static 
	{
	//    0    0:ldc1            #18  <String "`.*`">
	//    1    2:invokestatic    #24  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #26  <Field Pattern QUOTE_PATTERN>
	//*   3    8:return          
	}
}
