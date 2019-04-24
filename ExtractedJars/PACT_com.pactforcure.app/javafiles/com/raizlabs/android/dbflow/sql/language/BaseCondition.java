// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import android.database.DatabaseUtils;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.data.Blob;
import com.raizlabs.android.dbflow.sql.*;
import java.util.Iterator;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			SQLCondition, BaseModelQueriable, NameAlias

public abstract class BaseCondition
	implements SQLCondition
{

	BaseCondition(NameAlias namealias)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		operation = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #23  <String "">
	//    4    7:putfield        #25  <Field String operation>
		nameAlias = namealias;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #27  <Field NameAlias nameAlias>
	//    8   15:return          
	}

	public static String convertValueToString(Object obj, boolean flag)
	{
		return convertValueToString(obj, flag, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #33  <Method String convertValueToString(Object, boolean, boolean)>
	//    4    6:areturn         
	}

	public static String convertValueToString(Object obj, boolean flag, boolean flag1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
		{
			obj = "NULL";
	//    2    4:ldc1            #35  <String "NULL">
	//    3    6:astore_0        
		} else
	//*   4    7:aload_0         
	//*   5    8:areturn         
		{
			Object obj1 = obj;
	//    6    9:aload_0         
	//    7   10:astore_3        
			if(flag1)
	//*   8   11:iload_2         
	//*   9   12:ifeq            38
			{
				TypeConverter typeconverter = FlowManager.getTypeConverterForClass(obj.getClass());
	//   10   15:aload_0         
	//   11   16:invokevirtual   #39  <Method Class Object.getClass()>
	//   12   19:invokestatic    #45  <Method TypeConverter FlowManager.getTypeConverterForClass(Class)>
	//   13   22:astore          4
				obj1 = obj;
	//   14   24:aload_0         
	//   15   25:astore_3        
				if(typeconverter != null)
	//*  16   26:aload           4
	//*  17   28:ifnull          38
					obj1 = typeconverter.getDBValue(obj);
	//   18   31:aload           4
	//   19   33:aload_0         
	//   20   34:invokevirtual   #51  <Method Object TypeConverter.getDBValue(Object)>
	//   21   37:astore_3        
			}
			if(obj1 instanceof Number)
	//*  22   38:aload_3         
	//*  23   39:instanceof      #53  <Class Number>
	//*  24   42:ifeq            50
				return String.valueOf(obj1);
	//   25   45:aload_3         
	//   26   46:invokestatic    #59  <Method String String.valueOf(Object)>
	//   27   49:areturn         
			if(obj1 instanceof Enum)
	//*  28   50:aload_3         
	//*  29   51:instanceof      #61  <Class Enum>
	//*  30   54:ifeq            68
				return DatabaseUtils.sqlEscapeString(((Enum)obj1).name());
	//   31   57:aload_3         
	//   32   58:checkcast       #61  <Class Enum>
	//   33   61:invokevirtual   #65  <Method String Enum.name()>
	//   34   64:invokestatic    #71  <Method String DatabaseUtils.sqlEscapeString(String)>
	//   35   67:areturn         
			if(flag && (obj1 instanceof BaseModelQueriable))
	//*  36   68:iload_1         
	//*  37   69:ifeq            102
	//*  38   72:aload_3         
	//*  39   73:instanceof      #73  <Class BaseModelQueriable>
	//*  40   76:ifeq            102
				return String.format("(%1s)", new Object[] {
					((BaseModelQueriable)obj1).getQuery().trim()
				});
	//   41   79:ldc1            #75  <String "(%1s)">
	//   42   81:iconst_1        
	//   43   82:anewarray       Object[]
	//   44   85:dup             
	//   45   86:iconst_0        
	//   46   87:aload_3         
	//   47   88:checkcast       #73  <Class BaseModelQueriable>
	//   48   91:invokevirtual   #78  <Method String BaseModelQueriable.getQuery()>
	//   49   94:invokevirtual   #81  <Method String String.trim()>
	//   50   97:aastore         
	//   51   98:invokestatic    #85  <Method String String.format(String, Object[])>
	//   52  101:areturn         
			if(obj1 instanceof NameAlias)
	//*  53  102:aload_3         
	//*  54  103:instanceof      #87  <Class NameAlias>
	//*  55  106:ifeq            117
				return ((NameAlias)obj1).getQuery();
	//   56  109:aload_3         
	//   57  110:checkcast       #87  <Class NameAlias>
	//   58  113:invokevirtual   #88  <Method String NameAlias.getQuery()>
	//   59  116:areturn         
			if(obj1 instanceof SQLCondition)
	//*  60  117:aload_3         
	//*  61  118:instanceof      #6   <Class SQLCondition>
	//*  62  121:ifeq            147
			{
				obj = ((Object) (new QueryBuilder()));
	//   63  124:new             #90  <Class QueryBuilder>
	//   64  127:dup             
	//   65  128:invokespecial   #91  <Method void QueryBuilder()>
	//   66  131:astore_0        
				((SQLCondition)obj1).appendConditionToQuery(((QueryBuilder) (obj)));
	//   67  132:aload_3         
	//   68  133:checkcast       #6   <Class SQLCondition>
	//   69  136:aload_0         
	//   70  137:invokeinterface #95  <Method void SQLCondition.appendConditionToQuery(QueryBuilder)>
				return ((QueryBuilder) (obj)).toString();
	//   71  142:aload_0         
	//   72  143:invokevirtual   #98  <Method String QueryBuilder.toString()>
	//   73  146:areturn         
			}
			if(obj1 instanceof Query)
	//*  74  147:aload_3         
	//*  75  148:instanceof      #100 <Class Query>
	//*  76  151:ifeq            164
				return ((Query)obj1).getQuery();
	//   77  154:aload_3         
	//   78  155:checkcast       #100 <Class Query>
	//   79  158:invokeinterface #101 <Method String Query.getQuery()>
	//   80  163:areturn         
			if((obj1 instanceof Blob) || (obj1 instanceof byte[]))
	//*  81  164:aload_3         
	//*  82  165:instanceof      #103 <Class Blob>
	//*  83  168:ifne            178
	//*  84  171:aload_3         
	//*  85  172:instanceof      #105 <Class byte[]>
	//*  86  175:ifeq            230
			{
				if(obj1 instanceof Blob)
	//*  87  178:aload_3         
	//*  88  179:instanceof      #103 <Class Blob>
	//*  89  182:ifeq            219
					obj = ((Object) (((Blob)obj1).getBlob()));
	//   90  185:aload_3         
	//   91  186:checkcast       #103 <Class Blob>
	//   92  189:invokevirtual   #109 <Method byte[] Blob.getBlob()>
	//   93  192:astore_0        
				else
	//*  94  193:new             #111 <Class StringBuilder>
	//*  95  196:dup             
	//*  96  197:invokespecial   #112 <Method void StringBuilder()>
	//*  97  200:ldc1            #114 <String "X">
	//*  98  202:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//*  99  205:aload_0         
	//* 100  206:invokestatic    #124 <Method String SqlUtils.byteArrayToHexString(byte[])>
	//* 101  209:invokestatic    #71  <Method String DatabaseUtils.sqlEscapeString(String)>
	//* 102  212:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//* 103  215:invokevirtual   #125 <Method String StringBuilder.toString()>
	//* 104  218:areturn         
					obj = ((Object) ((byte[])(byte[])obj1));
	//  105  219:aload_3         
	//  106  220:checkcast       #105 <Class byte[]>
	//  107  223:checkcast       #105 <Class byte[]>
	//  108  226:astore_0        
				return (new StringBuilder()).append("X").append(DatabaseUtils.sqlEscapeString(SqlUtils.byteArrayToHexString(((byte []) (obj))))).toString();
			}
	//* 109  227:goto            193
			obj1 = ((Object) (String.valueOf(obj1)));
	//  110  230:aload_3         
	//  111  231:invokestatic    #59  <Method String String.valueOf(Object)>
	//  112  234:astore_3        
			obj = obj1;
	//  113  235:aload_3         
	//  114  236:astore_0        
			if(!((String) (obj1)).equals("?"))
	//* 115  237:aload_3         
	//* 116  238:ldc1            #127 <String "?">
	//* 117  240:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 118  243:ifne            7
				return DatabaseUtils.sqlEscapeString(((String) (obj1)));
	//  119  246:aload_3         
	//  120  247:invokestatic    #71  <Method String DatabaseUtils.sqlEscapeString(String)>
	//  121  250:areturn         
		}
		return ((String) (obj));
	}

	public static String joinArguments(CharSequence charsequence, Iterable iterable, BaseCondition basecondition)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #111 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void StringBuilder()>
	//    3    7:astore          4
		boolean flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_3        
		iterable = ((Iterable) (iterable.iterator()));
	//    6   11:aload_1         
	//    7   12:invokeinterface #139 <Method Iterator Iterable.iterator()>
	//    8   17:astore_1        
		while(((Iterator) (iterable)).hasNext()) 
	//*   9   18:aload_1         
	//*  10   19:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//*  11   24:ifeq            67
		{
			Object obj = ((Iterator) (iterable)).next();
	//   12   27:aload_1         
	//   13   28:invokeinterface #149 <Method Object Iterator.next()>
	//   14   33:astore          5
			if(flag)
	//*  15   35:iload_3         
	//*  16   36:ifeq            57
				flag = false;
	//   17   39:iconst_0        
	//   18   40:istore_3        
			else
	//*  19   41:aload           4
	//*  20   43:aload_2         
	//*  21   44:aload           5
	//*  22   46:iconst_0        
	//*  23   47:invokevirtual   #152 <Method String convertObjectToString(Object, boolean)>
	//*  24   50:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//*  25   53:pop             
	//*  26   54:goto            18
				stringbuilder.append(charsequence);
	//   27   57:aload           4
	//   28   59:aload_0         
	//   29   60:invokevirtual   #155 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   30   63:pop             
			stringbuilder.append(basecondition.convertObjectToString(obj, false));
		}
	//*  31   64:goto            41
		return stringbuilder.toString();
	//   32   67:aload           4
	//   33   69:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   34   72:areturn         
	}

	NameAlias columnAlias()
	{
		return nameAlias;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field NameAlias nameAlias>
	//    2    4:areturn         
	}

	public String columnName()
	{
		return nameAlias.getQuery();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field NameAlias nameAlias>
	//    2    4:invokevirtual   #88  <Method String NameAlias.getQuery()>
	//    3    7:areturn         
	}

	public String convertObjectToString(Object obj, boolean flag)
	{
		return convertValueToString(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #160 <Method String convertValueToString(Object, boolean)>
	//    3    5:areturn         
	}

	public boolean hasSeparator()
	{
		return separator != null && separator.length() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field String separator>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #163 <Field String separator>
	//    5   11:invokevirtual   #167 <Method int String.length()>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public String operation()
	{
		return operation;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String operation>
	//    2    4:areturn         
	}

	public String postArgument()
	{
		return postArg;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field String postArg>
	//    2    4:areturn         
	}

	public SQLCondition separator(String s)
	{
		separator = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field String separator>
		return ((SQLCondition) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String separator()
	{
		return separator;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field String separator>
	//    2    4:areturn         
	}

	public Object value()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field Object value>
	//    2    4:areturn         
	}

	protected boolean isValueSet;
	protected NameAlias nameAlias;
	protected String operation;
	protected String postArg;
	protected String separator;
	protected Object value;
}
