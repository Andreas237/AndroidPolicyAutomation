// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.StringUtils;
import com.raizlabs.android.dbflow.sql.QueryBuilder;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			SQLCondition

public class UnSafeStringCondition
	implements SQLCondition
{

	public UnSafeStringCondition(String s, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		separator = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "">
	//    4    7:putfield        #18  <Field String separator>
		String s1 = s;
	//    5   10:aload_1         
	//    6   11:astore          5
		if(s != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          49
		{
			int j = as.length;
	//    9   17:aload_2         
	//   10   18:arraylength     
	//   11   19:istore          4
			int i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_3        
			do
			{
				s1 = s;
	//   14   23:aload_1         
	//   15   24:astore          5
				if(i >= j)
					break;
	//   16   26:iload_3         
	//   17   27:iload           4
	//   18   29:icmpge          49
				s = s.replaceFirst("\\?", as[i]);
	//   19   32:aload_1         
	//   20   33:ldc1            #20  <String "\\?">
	//   21   35:aload_2         
	//   22   36:iload_3         
	//   23   37:aaload          
	//   24   38:invokevirtual   #26  <Method String String.replaceFirst(String, String)>
	//   25   41:astore_1        
				i++;
	//   26   42:iload_3         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_3        
			} while(true);
	//   30   46:goto            23
		}
		conditionString = s1;
	//   31   49:aload_0         
	//   32   50:aload           5
	//   33   52:putfield        #28  <Field String conditionString>
	//   34   55:return          
	}

	public void appendConditionToQuery(QueryBuilder querybuilder)
	{
		querybuilder.append(((Object) (conditionString)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field String conditionString>
	//    3    5:invokevirtual   #37  <Method QueryBuilder QueryBuilder.append(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public String columnName()
	{
		return "";
	//    0    0:ldc1            #16  <String "">
	//    1    2:areturn         
	}

	public boolean hasSeparator()
	{
		return StringUtils.isNotNullOrEmpty(separator);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String separator>
	//    2    4:invokestatic    #47  <Method boolean StringUtils.isNotNullOrEmpty(String)>
	//    3    7:ireturn         
	}

	public String operation()
	{
		return "";
	//    0    0:ldc1            #16  <String "">
	//    1    2:areturn         
	}

	public SQLCondition separator(String s)
	{
		separator = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String separator>
		return ((SQLCondition) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String separator()
	{
		return separator;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String separator>
	//    2    4:areturn         
	}

	public Object value()
	{
		return ((Object) (""));
	//    0    0:ldc1            #16  <String "">
	//    1    2:areturn         
	}

	private final String conditionString;
	private String separator;
}
