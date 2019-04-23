// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package android.arch.persistence.db:
//			SimpleSQLiteQuery, SupportSQLiteQuery

public final class SupportSQLiteQueryBuilder
{

	private SupportSQLiteQueryBuilder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mDistinct = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #38  <Field boolean mDistinct>
		mColumns = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #40  <Field String[] mColumns>
		mGroupBy = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #42  <Field String mGroupBy>
		mHaving = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #44  <Field String mHaving>
		mOrderBy = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #46  <Field String mOrderBy>
		mLimit = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #48  <Field String mLimit>
		mTable = s;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:putfield        #50  <Field String mTable>
	//   23   39:return          
	}

	private static void appendClause(StringBuilder stringbuilder, String s, String s1)
	{
		if(!isEmpty(s1))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #56  <Method boolean isEmpty(String)>
	//*   2    4:ifne            19
		{
			stringbuilder.append(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    6   12:pop             
			stringbuilder.append(s1);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		}
	//   11   19:return          
	}

	private static void appendColumns(StringBuilder stringbuilder, String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          40
		{
			String s = as[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(i > 0)
	//*  12   15:iload_2         
	//*  13   16:ifle            26
				stringbuilder.append(", ");
	//   14   19:aload_0         
	//   15   20:ldc1            #66  <String ", ">
	//   16   22:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   17   25:pop             
			stringbuilder.append(s);
	//   18   26:aload_0         
	//   19   27:aload           4
	//   20   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   21   32:pop             
		}

	//   22   33:iload_2         
	//   23   34:iconst_1        
	//   24   35:iadd            
	//   25   36:istore_2        
	//*  26   37:goto            5
		stringbuilder.append(' ');
	//   27   40:aload_0         
	//   28   41:bipush          32
	//   29   43:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//   30   46:pop             
	//   31   47:return          
	}

	public static SupportSQLiteQueryBuilder builder(String s)
	{
		return new SupportSQLiteQueryBuilder(s);
	//    0    0:new             #2   <Class SupportSQLiteQueryBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #73  <Method void SupportSQLiteQueryBuilder(String)>
	//    4    8:areturn         
	}

	private static boolean isEmpty(String s)
	{
		return s == null || s.length() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          16
	//    2    4:aload_0         
	//    3    5:invokevirtual   #79  <Method int String.length()>
	//    4    8:ifne            14
	//    5   11:goto            16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	public SupportSQLiteQueryBuilder columns(String as[])
	{
		mColumns = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String[] mColumns>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SupportSQLiteQuery create()
	{
		if(isEmpty(mGroupBy) && !isEmpty(mHaving))
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field String mGroupBy>
	//*   2    4:invokestatic    #56  <Method boolean isEmpty(String)>
	//*   3    7:ifeq            33
	//*   4   10:aload_0         
	//*   5   11:getfield        #44  <Field String mHaving>
	//*   6   14:invokestatic    #56  <Method boolean isEmpty(String)>
	//*   7   17:ifeq            23
	//*   8   20:goto            33
			throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
	//    9   23:new             #85  <Class IllegalArgumentException>
	//   10   26:dup             
	//   11   27:ldc1            #87  <String "HAVING clauses are only permitted when using a groupBy clause">
	//   12   29:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   13   32:athrow          
		StringBuilder stringbuilder = new StringBuilder(120);
	//   14   33:new             #58  <Class StringBuilder>
	//   15   36:dup             
	//   16   37:bipush          120
	//   17   39:invokespecial   #91  <Method void StringBuilder(int)>
	//   18   42:astore_1        
		stringbuilder.append("SELECT ");
	//   19   43:aload_1         
	//   20   44:ldc1            #93  <String "SELECT ">
	//   21   46:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
		if(mDistinct)
	//*  23   50:aload_0         
	//*  24   51:getfield        #38  <Field boolean mDistinct>
	//*  25   54:ifeq            64
			stringbuilder.append("DISTINCT ");
	//   26   57:aload_1         
	//   27   58:ldc1            #95  <String "DISTINCT ">
	//   28   60:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
		String as[] = mColumns;
	//   30   64:aload_0         
	//   31   65:getfield        #40  <Field String[] mColumns>
	//   32   68:astore_2        
		if(as != null && as.length != 0)
	//*  33   69:aload_2         
	//*  34   70:ifnull          86
	//*  35   73:aload_2         
	//*  36   74:arraylength     
	//*  37   75:ifeq            86
			appendColumns(stringbuilder, as);
	//   38   78:aload_1         
	//   39   79:aload_2         
	//   40   80:invokestatic    #97  <Method void appendColumns(StringBuilder, String[])>
		else
	//*  41   83:goto            93
			stringbuilder.append(" * ");
	//   42   86:aload_1         
	//   43   87:ldc1            #99  <String " * ">
	//   44   89:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
		stringbuilder.append(" FROM ");
	//   46   93:aload_1         
	//   47   94:ldc1            #101 <String " FROM ">
	//   48   96:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		stringbuilder.append(mTable);
	//   50  100:aload_1         
	//   51  101:aload_0         
	//   52  102:getfield        #50  <Field String mTable>
	//   53  105:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   54  108:pop             
		appendClause(stringbuilder, " WHERE ", mSelection);
	//   55  109:aload_1         
	//   56  110:ldc1            #103 <String " WHERE ">
	//   57  112:aload_0         
	//   58  113:getfield        #105 <Field String mSelection>
	//   59  116:invokestatic    #107 <Method void appendClause(StringBuilder, String, String)>
		appendClause(stringbuilder, " GROUP BY ", mGroupBy);
	//   60  119:aload_1         
	//   61  120:ldc1            #109 <String " GROUP BY ">
	//   62  122:aload_0         
	//   63  123:getfield        #42  <Field String mGroupBy>
	//   64  126:invokestatic    #107 <Method void appendClause(StringBuilder, String, String)>
		appendClause(stringbuilder, " HAVING ", mHaving);
	//   65  129:aload_1         
	//   66  130:ldc1            #111 <String " HAVING ">
	//   67  132:aload_0         
	//   68  133:getfield        #44  <Field String mHaving>
	//   69  136:invokestatic    #107 <Method void appendClause(StringBuilder, String, String)>
		appendClause(stringbuilder, " ORDER BY ", mOrderBy);
	//   70  139:aload_1         
	//   71  140:ldc1            #113 <String " ORDER BY ">
	//   72  142:aload_0         
	//   73  143:getfield        #46  <Field String mOrderBy>
	//   74  146:invokestatic    #107 <Method void appendClause(StringBuilder, String, String)>
		appendClause(stringbuilder, " LIMIT ", mLimit);
	//   75  149:aload_1         
	//   76  150:ldc1            #115 <String " LIMIT ">
	//   77  152:aload_0         
	//   78  153:getfield        #48  <Field String mLimit>
	//   79  156:invokestatic    #107 <Method void appendClause(StringBuilder, String, String)>
		return ((SupportSQLiteQuery) (new SimpleSQLiteQuery(stringbuilder.toString(), mBindArgs)));
	//   80  159:new             #117 <Class SimpleSQLiteQuery>
	//   81  162:dup             
	//   82  163:aload_1         
	//   83  164:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   84  167:aload_0         
	//   85  168:getfield        #123 <Field Object[] mBindArgs>
	//   86  171:invokespecial   #126 <Method void SimpleSQLiteQuery(String, Object[])>
	//   87  174:areturn         
	}

	public SupportSQLiteQueryBuilder distinct()
	{
		mDistinct = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #38  <Field boolean mDistinct>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SupportSQLiteQueryBuilder groupBy(String s)
	{
		mGroupBy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String mGroupBy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SupportSQLiteQueryBuilder having(String s)
	{
		mHaving = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String mHaving>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SupportSQLiteQueryBuilder limit(String s)
	{
		if(!isEmpty(s) && !sLimitPattern.matcher(((CharSequence) (s))).matches())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #56  <Method boolean isEmpty(String)>
	//*   2    4:ifne            56
	//*   3    7:getstatic       #31  <Field Pattern sLimitPattern>
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #135 <Method Matcher Pattern.matcher(CharSequence)>
	//*   6   14:invokevirtual   #141 <Method boolean Matcher.matches()>
	//*   7   17:ifeq            23
	//*   8   20:goto            56
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   23:new             #58  <Class StringBuilder>
	//   10   26:dup             
	//   11   27:invokespecial   #142 <Method void StringBuilder()>
	//   12   30:astore_2        
			stringbuilder.append("invalid LIMIT clauses:");
	//   13   31:aload_2         
	//   14   32:ldc1            #144 <String "invalid LIMIT clauses:">
	//   15   34:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:pop             
			stringbuilder.append(s);
	//   17   38:aload_2         
	//   18   39:aload_1         
	//   19   40:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   21   44:new             #85  <Class IllegalArgumentException>
	//   22   47:dup             
	//   23   48:aload_2         
	//   24   49:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   25   52:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   26   55:athrow          
		} else
		{
			mLimit = s;
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:putfield        #48  <Field String mLimit>
			return this;
	//   30   61:aload_0         
	//   31   62:areturn         
		}
	}

	public SupportSQLiteQueryBuilder orderBy(String s)
	{
		mOrderBy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field String mOrderBy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SupportSQLiteQueryBuilder selection(String s, Object aobj[])
	{
		mSelection = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field String mSelection>
		mBindArgs = aobj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #123 <Field Object[] mBindArgs>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
	private Object mBindArgs[];
	private String mColumns[];
	private boolean mDistinct;
	private String mGroupBy;
	private String mHaving;
	private String mLimit;
	private String mOrderBy;
	private String mSelection;
	private final String mTable;

	static 
	{
	//    0    0:ldc1            #23  <String "\\s*\\d+\\s*(,\\s*\\d+\\s*)?">
	//    1    2:invokestatic    #29  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #31  <Field Pattern sLimitPattern>
	//*   3    8:return          
	}
}
