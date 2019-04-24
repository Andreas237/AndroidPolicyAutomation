// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			NameAlias, Condition, BaseCondition, CaseCondition, 
//			SQLCondition

public class Case
	implements Query
{

	Case()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		caseConditions = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List caseConditions>
		elseSpecified = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #32  <Field boolean elseSpecified>
		efficientCase = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #34  <Field boolean efficientCase>
		endSpecified = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #36  <Field boolean endSpecified>
	//   16   30:return          
	}

	Case(IProperty iproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		caseConditions = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List caseConditions>
		elseSpecified = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #32  <Field boolean elseSpecified>
		efficientCase = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #34  <Field boolean efficientCase>
		endSpecified = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #36  <Field boolean endSpecified>
		caseColumn = iproperty;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #40  <Field IProperty caseColumn>
		efficientCase = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #34  <Field boolean efficientCase>
	//   22   40:return          
	}

	public Case _else(Object obj)
	{
		elseValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Object elseValue>
		elseSpecified = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #32  <Field boolean elseSpecified>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public Property end()
	{
		return end(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #51  <Method Property end(String)>
	//    3    5:areturn         
	}

	public Property end(String s)
	{
		endSpecified = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #36  <Field boolean endSpecified>
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			columnName = QueryBuilder.quoteIfNeeded(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #59  <Method String QueryBuilder.quoteIfNeeded(String)>
	//    8   14:putfield        #61  <Field String columnName>
		return new Property(((Class) (null)), NameAlias.rawBuilder(getQuery()).build());
	//    9   17:new             #63  <Class Property>
	//   10   20:dup             
	//   11   21:aconst_null     
	//   12   22:aload_0         
	//   13   23:invokevirtual   #67  <Method String getQuery()>
	//   14   26:invokestatic    #73  <Method NameAlias$Builder NameAlias.rawBuilder(String)>
	//   15   29:invokevirtual   #79  <Method NameAlias NameAlias$Builder.build()>
	//   16   32:invokespecial   #82  <Method void Property(Class, NameAlias)>
	//   17   35:areturn         
	}

	public Condition endAsCondition()
	{
		return Condition.column(end().getNameAlias());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method Property end()>
	//    2    4:invokevirtual   #91  <Method NameAlias Property.getNameAlias()>
	//    3    7:invokestatic    #97  <Method Condition Condition.column(NameAlias)>
	//    4   10:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder(" CASE");
	//    0    0:new             #55  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #99  <String " CASE">
	//    3    6:invokespecial   #102 <Method void QueryBuilder(Object)>
	//    4    9:astore_2        
		if(isEfficientCase())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #106 <Method boolean isEfficientCase()>
	//*   7   14:ifeq            48
			querybuilder.append(((Object) ((new StringBuilder()).append(" ").append(BaseCondition.convertValueToString(((Object) (caseColumn)), false)).toString())));
	//    8   17:aload_2         
	//    9   18:new             #108 <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #109 <Method void StringBuilder()>
	//   12   25:ldc1            #111 <String " ">
	//   13   27:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:aload_0         
	//   15   31:getfield        #40  <Field IProperty caseColumn>
	//   16   34:iconst_0        
	//   17   35:invokestatic    #121 <Method String BaseCondition.convertValueToString(Object, boolean)>
	//   18   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   20   44:invokevirtual   #127 <Method QueryBuilder QueryBuilder.append(Object)>
	//   21   47:pop             
		querybuilder.append(((Object) (QueryBuilder.join(" ", ((Iterable) (caseConditions))))));
	//   22   48:aload_2         
	//   23   49:ldc1            #111 <String " ">
	//   24   51:aload_0         
	//   25   52:getfield        #30  <Field List caseConditions>
	//   26   55:invokestatic    #131 <Method String QueryBuilder.join(CharSequence, Iterable)>
	//   27   58:invokevirtual   #127 <Method QueryBuilder QueryBuilder.append(Object)>
	//   28   61:pop             
		if(elseSpecified)
	//*  29   62:aload_0         
	//*  30   63:getfield        #32  <Field boolean elseSpecified>
	//*  31   66:ifeq            87
			querybuilder.append(" ELSE ").append(((Object) (BaseCondition.convertValueToString(elseValue, false))));
	//   32   69:aload_2         
	//   33   70:ldc1            #133 <String " ELSE ">
	//   34   72:invokevirtual   #127 <Method QueryBuilder QueryBuilder.append(Object)>
	//   35   75:aload_0         
	//   36   76:getfield        #44  <Field Object elseValue>
	//   37   79:iconst_0        
	//   38   80:invokestatic    #121 <Method String BaseCondition.convertValueToString(Object, boolean)>
	//   39   83:invokevirtual   #127 <Method QueryBuilder QueryBuilder.append(Object)>
	//   40   86:pop             
		if(endSpecified)
	//*  41   87:aload_0         
	//*  42   88:getfield        #36  <Field boolean endSpecified>
	//*  43   91:ifeq            132
		{
			StringBuilder stringbuilder = (new StringBuilder()).append(" END ");
	//   44   94:new             #108 <Class StringBuilder>
	//   45   97:dup             
	//   46   98:invokespecial   #109 <Method void StringBuilder()>
	//   47  101:ldc1            #135 <String " END ">
	//   48  103:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   49  106:astore_3        
			String s;
			if(columnName != null)
	//*  50  107:aload_0         
	//*  51  108:getfield        #61  <Field String columnName>
	//*  52  111:ifnull          137
				s = columnName;
	//   53  114:aload_0         
	//   54  115:getfield        #61  <Field String columnName>
	//   55  118:astore_1        
			else
	//*  56  119:aload_2         
	//*  57  120:aload_3         
	//*  58  121:aload_1         
	//*  59  122:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//*  60  125:invokevirtual   #124 <Method String StringBuilder.toString()>
	//*  61  128:invokevirtual   #127 <Method QueryBuilder QueryBuilder.append(Object)>
	//*  62  131:pop             
	//*  63  132:aload_2         
	//*  64  133:invokevirtual   #136 <Method String QueryBuilder.getQuery()>
	//*  65  136:areturn         
				s = "";
	//   66  137:ldc1            #138 <String "">
	//   67  139:astore_1        
			querybuilder.append(((Object) (stringbuilder.append(s).toString())));
		}
		return querybuilder.getQuery();
	//*  68  140:goto            119
	}

	boolean isEfficientCase()
	{
		return efficientCase;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean efficientCase>
	//    2    4:ireturn         
	}

	public CaseCondition when(SQLCondition sqlcondition)
	{
		if(efficientCase)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean efficientCase>
	//*   2    4:ifeq            17
		{
			throw new IllegalStateException("When using the efficient CASE method,you must pass in value only, not condition.");
	//    3    7:new             #142 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #144 <String "When using the efficient CASE method,you must pass in value only, not condition.">
	//    6   13:invokespecial   #147 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			sqlcondition = ((SQLCondition) (new CaseCondition(this, sqlcondition)));
	//    8   17:new             #149 <Class CaseCondition>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #152 <Method void CaseCondition(Case, SQLCondition)>
	//   13   26:astore_1        
			caseConditions.add(((Object) (sqlcondition)));
	//   14   27:aload_0         
	//   15   28:getfield        #30  <Field List caseConditions>
	//   16   31:aload_1         
	//   17   32:invokeinterface #158 <Method boolean List.add(Object)>
	//   18   37:pop             
			return ((CaseCondition) (sqlcondition));
	//   19   38:aload_1         
	//   20   39:areturn         
		}
	}

	public CaseCondition when(IProperty iproperty)
	{
		if(!efficientCase)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean efficientCase>
	//*   2    4:ifne            17
		{
			throw new IllegalStateException("When not using the efficient CASE method, you must pass in the SQLCondition as a parameter");
	//    3    7:new             #142 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #162 <String "When not using the efficient CASE method, you must pass in the SQLCondition as a parameter">
	//    6   13:invokespecial   #147 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			iproperty = ((IProperty) (new CaseCondition(this, iproperty)));
	//    8   17:new             #149 <Class CaseCondition>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #165 <Method void CaseCondition(Case, IProperty)>
	//   13   26:astore_1        
			caseConditions.add(((Object) (iproperty)));
	//   14   27:aload_0         
	//   15   28:getfield        #30  <Field List caseConditions>
	//   16   31:aload_1         
	//   17   32:invokeinterface #158 <Method boolean List.add(Object)>
	//   18   37:pop             
			return ((CaseCondition) (iproperty));
	//   19   38:aload_1         
	//   20   39:areturn         
		}
	}

	public CaseCondition when(Object obj)
	{
		if(!efficientCase)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean efficientCase>
	//*   2    4:ifne            17
		{
			throw new IllegalStateException("When not using the efficient CASE method, you must pass in the SQLConditions as a parameter");
	//    3    7:new             #142 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #169 <String "When not using the efficient CASE method, you must pass in the SQLConditions as a parameter">
	//    6   13:invokespecial   #147 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			obj = ((Object) (new CaseCondition(this, obj)));
	//    8   17:new             #149 <Class CaseCondition>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #172 <Method void CaseCondition(Case, Object)>
	//   13   26:astore_1        
			caseConditions.add(obj);
	//   14   27:aload_0         
	//   15   28:getfield        #30  <Field List caseConditions>
	//   16   31:aload_1         
	//   17   32:invokeinterface #158 <Method boolean List.add(Object)>
	//   18   37:pop             
			return ((CaseCondition) (obj));
	//   19   38:aload_1         
	//   20   39:areturn         
		}
	}

	private IProperty caseColumn;
	private List caseConditions;
	private String columnName;
	private boolean efficientCase;
	private boolean elseSpecified;
	private Object elseValue;
	private boolean endSpecified;
}
