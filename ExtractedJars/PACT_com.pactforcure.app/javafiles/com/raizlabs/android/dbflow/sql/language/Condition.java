// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.annotation.Collate;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseCondition, ITypeConditional, BaseModelQueriable, IConditional, 
//			NameAlias, SQLCondition, ConditionGroup

public class Condition extends BaseCondition
	implements ITypeConditional
{
	public static class Between extends BaseCondition
	{

		public Between and(Object obj)
		{
			secondValue = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field Object secondValue>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public void appendConditionToQuery(QueryBuilder querybuilder)
		{
			querybuilder.append(((Object) (columnName()))).append(((Object) (operation()))).append(((Object) (convertObjectToString(value(), true)))).appendSpaceSeparated("AND").append(((Object) (convertObjectToString(secondValue(), true)))).appendSpace().appendOptional(((Object) (postArgument())));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #61  <Method String columnName()>
		//    3    5:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #69  <Method String operation()>
		//    6   12:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:invokevirtual   #72  <Method Object value()>
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #76  <Method String convertObjectToString(Object, boolean)>
		//   12   24:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
		//   13   27:ldc1            #78  <String "AND">
		//   14   29:invokevirtual   #81  <Method QueryBuilder QueryBuilder.appendSpaceSeparated(Object)>
		//   15   32:aload_0         
		//   16   33:aload_0         
		//   17   34:invokevirtual   #83  <Method Object secondValue()>
		//   18   37:iconst_1        
		//   19   38:invokevirtual   #76  <Method String convertObjectToString(Object, boolean)>
		//   20   41:invokevirtual   #67  <Method QueryBuilder QueryBuilder.append(Object)>
		//   21   44:invokevirtual   #87  <Method QueryBuilder QueryBuilder.appendSpace()>
		//   22   47:aload_0         
		//   23   48:invokevirtual   #88  <Method String postArgument()>
		//   24   51:invokevirtual   #91  <Method QueryBuilder QueryBuilder.appendOptional(Object)>
		//   25   54:pop             
		//   26   55:return          
		}

		public Object secondValue()
		{
			return secondValue;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Object secondValue>
		//    2    4:areturn         
		}

		private Object secondValue;

		private Between(Condition condition, Object obj)
		{
			super(condition.nameAlias);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #15  <Field NameAlias Condition.nameAlias>
		//    3    5:invokespecial   #18  <Method void BaseCondition(NameAlias)>
			operation = String.format(" %1s ", new Object[] {
				"BETWEEN"
			});
		//    4    8:aload_0         
		//    5    9:ldc1            #20  <String " %1s ">
		//    6   11:iconst_1        
		//    7   12:anewarray       Object[]
		//    8   15:dup             
		//    9   16:iconst_0        
		//   10   17:ldc1            #24  <String "BETWEEN">
		//   11   19:aastore         
		//   12   20:invokestatic    #30  <Method String String.format(String, Object[])>
		//   13   23:putfield        #34  <Field String operation>
			value = obj;
		//   14   26:aload_0         
		//   15   27:aload_2         
		//   16   28:putfield        #37  <Field Object value>
			isValueSet = true;
		//   17   31:aload_0         
		//   18   32:iconst_1        
		//   19   33:putfield        #41  <Field boolean isValueSet>
			postArg = condition.postArgument();
		//   20   36:aload_0         
		//   21   37:aload_1         
		//   22   38:invokevirtual   #45  <Method String Condition.postArgument()>
		//   23   41:putfield        #48  <Field String postArg>
		//   24   44:return          
		}

	}

	public static class In extends BaseCondition
	{

		public In and(Object obj)
		{
			inArguments.add(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List inArguments>
		//    2    4:aload_1         
		//    3    5:invokeinterface #32  <Method boolean List.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public void appendConditionToQuery(QueryBuilder querybuilder)
		{
			querybuilder.append(((Object) (columnName()))).append(((Object) (operation()))).append("(").append(((Object) (ConditionGroup.joinArguments(",", ((Iterable) (inArguments)), ((BaseCondition) (this)))))).append(")");
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #77  <Method String columnName()>
		//    3    5:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #85  <Method String operation()>
		//    6   12:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
		//    7   15:ldc1            #87  <String "(">
		//    8   17:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
		//    9   20:ldc1            #89  <String ",">
		//   10   22:aload_0         
		//   11   23:getfield        #26  <Field List inArguments>
		//   12   26:aload_0         
		//   13   27:invokestatic    #95  <Method String ConditionGroup.joinArguments(CharSequence, Iterable, BaseCondition)>
		//   14   30:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
		//   15   33:ldc1            #97  <String ")">
		//   16   35:invokevirtual   #83  <Method QueryBuilder QueryBuilder.append(Object)>
		//   17   38:pop             
		//   18   39:return          
		}

		private List inArguments;

		private transient In(Condition condition, Object obj, boolean flag, Object aobj[])
		{
			super(condition.columnAlias());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #16  <Method NameAlias Condition.columnAlias()>
		//    3    5:invokespecial   #19  <Method void BaseCondition(NameAlias)>
			inArguments = ((List) (new ArrayList()));
		//    4    8:aload_0         
		//    5    9:new             #21  <Class ArrayList>
		//    6   12:dup             
		//    7   13:invokespecial   #24  <Method void ArrayList()>
		//    8   16:putfield        #26  <Field List inArguments>
			inArguments.add(obj);
		//    9   19:aload_0         
		//   10   20:getfield        #26  <Field List inArguments>
		//   11   23:aload_2         
		//   12   24:invokeinterface #32  <Method boolean List.add(Object)>
		//   13   29:pop             
			Collections.addAll(((Collection) (inArguments)), aobj);
		//   14   30:aload_0         
		//   15   31:getfield        #26  <Field List inArguments>
		//   16   34:aload           4
		//   17   36:invokestatic    #38  <Method boolean Collections.addAll(Collection, Object[])>
		//   18   39:pop             
			if(flag)
		//*  19   40:iload_3         
		//*  20   41:ifeq            65
				condition = "IN";
		//   21   44:ldc1            #40  <String "IN">
		//   22   46:astore_1        
			else
		//*  23   47:aload_0         
		//*  24   48:ldc1            #42  <String " %1s ">
		//*  25   50:iconst_1        
		//*  26   51:anewarray       Object[]
		//*  27   54:dup             
		//*  28   55:iconst_0        
		//*  29   56:aload_1         
		//*  30   57:aastore         
		//*  31   58:invokestatic    #50  <Method String String.format(String, Object[])>
		//*  32   61:putfield        #54  <Field String operation>
		//*  33   64:return          
				condition = "NOT IN";
		//   34   65:ldc1            #56  <String "NOT IN">
		//   35   67:astore_1        
			operation = String.format(" %1s ", new Object[] {
				condition
			});
		//*  36   68:goto            47
		}


		private In(Condition condition, Collection collection, boolean flag)
		{
			super(condition.columnAlias());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #16  <Method NameAlias Condition.columnAlias()>
		//    3    5:invokespecial   #19  <Method void BaseCondition(NameAlias)>
			inArguments = ((List) (new ArrayList()));
		//    4    8:aload_0         
		//    5    9:new             #21  <Class ArrayList>
		//    6   12:dup             
		//    7   13:invokespecial   #24  <Method void ArrayList()>
		//    8   16:putfield        #26  <Field List inArguments>
			inArguments.addAll(collection);
		//    9   19:aload_0         
		//   10   20:getfield        #26  <Field List inArguments>
		//   11   23:aload_2         
		//   12   24:invokeinterface #64  <Method boolean List.addAll(Collection)>
		//   13   29:pop             
			if(flag)
		//*  14   30:iload_3         
		//*  15   31:ifeq            55
				condition = "IN";
		//   16   34:ldc1            #40  <String "IN">
		//   17   36:astore_1        
			else
		//*  18   37:aload_0         
		//*  19   38:ldc1            #42  <String " %1s ">
		//*  20   40:iconst_1        
		//*  21   41:anewarray       Object[]
		//*  22   44:dup             
		//*  23   45:iconst_0        
		//*  24   46:aload_1         
		//*  25   47:aastore         
		//*  26   48:invokestatic    #50  <Method String String.format(String, Object[])>
		//*  27   51:putfield        #54  <Field String operation>
		//*  28   54:return          
				condition = "NOT IN";
		//   29   55:ldc1            #56  <String "NOT IN">
		//   30   57:astore_1        
			operation = String.format(" %1s ", new Object[] {
				condition
			});
		//*  31   58:goto            37
		}

	}

	public static class Operation
	{

		public static final String AND = "AND";
		public static final String BETWEEN = "BETWEEN";
		public static final String CONCATENATE = "||";
		public static final String DIVISION = "/";
		public static final String EMPTY_PARAM = "?";
		public static final String EQUALS = "=";
		public static final String GLOB = "GLOB";
		public static final String GREATER_THAN = ">";
		public static final String GREATER_THAN_OR_EQUALS = ">=";
		public static final String IN = "IN";
		public static final String IS_NOT_NULL = "IS NOT NULL";
		public static final String IS_NULL = "IS NULL";
		public static final String LESS_THAN = "<";
		public static final String LESS_THAN_OR_EQUALS = "<=";
		public static final String LIKE = "LIKE";
		public static final String MINUS = "-";
		public static final String MOD = "%";
		public static final String MULTIPLY = "*";
		public static final String NOT_EQUALS = "!=";
		public static final String NOT_IN = "NOT IN";
		public static final String NOT_LIKE = "NOT LIKE";
		public static final String OR = "OR";
		public static final String PLUS = "+";

		public Operation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #75  <Method void Object()>
		//    2    4:return          
		}
	}


	Condition(NameAlias namealias)
	{
		super(namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void BaseCondition(NameAlias)>
	//    3    5:return          
	}

	Condition(NameAlias namealias, TypeConverter typeconverter, boolean flag)
	{
		super(namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void BaseCondition(NameAlias)>
		typeConverter = typeconverter;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field TypeConverter typeConverter>
		convertToDB = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #31  <Field boolean convertToDB>
	//    9   15:return          
	}

	public static Condition column(NameAlias namealias)
	{
		return new Condition(namealias);
	//    0    0:new             #2   <Class Condition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void Condition(NameAlias)>
	//    4    8:areturn         
	}

	public static Condition column(NameAlias namealias, TypeConverter typeconverter, boolean flag)
	{
		return new Condition(namealias, typeconverter, flag);
	//    0    0:new             #2   <Class Condition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #37  <Method void Condition(NameAlias, TypeConverter, boolean)>
	//    6   10:areturn         
	}

	public static String convertValueToString(Object obj)
	{
		return BaseCondition.convertValueToString(obj, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #42  <Method String BaseCondition.convertValueToString(Object, boolean)>
	//    3    5:areturn         
	}

	public void appendConditionToQuery(QueryBuilder querybuilder)
	{
		querybuilder.append(((Object) (columnName()))).append(((Object) (operation())));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #48  <Method String columnName()>
	//    3    5:invokevirtual   #54  <Method QueryBuilder QueryBuilder.append(Object)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #57  <Method String operation()>
	//    6   12:invokevirtual   #54  <Method QueryBuilder QueryBuilder.append(Object)>
	//    7   15:pop             
		if(isValueSet)
	//*   8   16:aload_0         
	//*   9   17:getfield        #60  <Field boolean isValueSet>
	//*  10   20:ifeq            37
			querybuilder.append(((Object) (convertObjectToString(value(), true))));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #64  <Method Object value()>
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #67  <Method String convertObjectToString(Object, boolean)>
	//   17   33:invokevirtual   #54  <Method QueryBuilder QueryBuilder.append(Object)>
	//   18   36:pop             
		if(postArgument() != null)
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #70  <Method String postArgument()>
	//*  21   41:ifnull          56
			querybuilder.appendSpace().append(((Object) (postArgument())));
	//   22   44:aload_1         
	//   23   45:invokevirtual   #74  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   24   48:aload_0         
	//   25   49:invokevirtual   #70  <Method String postArgument()>
	//   26   52:invokevirtual   #54  <Method QueryBuilder QueryBuilder.append(Object)>
	//   27   55:pop             
	//   28   56:return          
	}

	public Between between(BaseModelQueriable basemodelqueriable)
	{
		return between(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #79  <Method Condition$Between between(Object)>
	//    3    5:areturn         
	}

	public Between between(IConditional iconditional)
	{
		return between(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #79  <Method Condition$Between between(Object)>
	//    3    5:areturn         
	}

	public Between between(Object obj)
	{
		return new Between(this, obj);
	//    0    0:new             #10  <Class Condition$Between>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #83  <Method void Condition$Between(Condition, Object, Condition$1)>
	//    6   10:areturn         
	}

	public Condition collate(Collate collate1)
	{
		if(collate1.equals(((Object) (Collate.NONE))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #91  <Field Collate Collate.NONE>
	//*   2    4:invokevirtual   #95  <Method boolean Collate.equals(Object)>
	//*   3    7:ifeq            17
		{
			postArg = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #99  <Field String postArg>
			return this;
	//    7   15:aload_0         
	//    8   16:areturn         
		} else
		{
			collate(collate1.name());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #102 <Method String Collate.name()>
	//   12   22:invokevirtual   #105 <Method Condition collate(String)>
	//   13   25:pop             
			return this;
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public Condition collate(String s)
	{
		postArg = (new StringBuilder()).append("COLLATE ").append(s).toString();
	//    0    0:aload_0         
	//    1    1:new             #107 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #110 <Method void StringBuilder()>
	//    4    8:ldc1            #112 <String "COLLATE ">
	//    5   10:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:invokevirtual   #118 <Method String StringBuilder.toString()>
	//    9   20:putfield        #99  <Field String postArg>
		return this;
	//   10   23:aload_0         
	//   11   24:areturn         
	}

	public Condition concatenate(IConditional iconditional)
	{
		return concatenate(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #123 <Method Condition concatenate(Object)>
	//    3    5:areturn         
	}

	public Condition concatenate(Object obj)
	{
		Object obj1;
		operation = (new QueryBuilder("=")).append(((Object) (columnName()))).toString();
	//    0    0:aload_0         
	//    1    1:new             #50  <Class QueryBuilder>
	//    2    4:dup             
	//    3    5:ldc1            #125 <String "=">
	//    4    7:invokespecial   #128 <Method void QueryBuilder(Object)>
	//    5   10:aload_0         
	//    6   11:invokevirtual   #48  <Method String columnName()>
	//    7   14:invokevirtual   #54  <Method QueryBuilder QueryBuilder.append(Object)>
	//    8   17:invokevirtual   #129 <Method String QueryBuilder.toString()>
	//    9   20:putfield        #131 <Field String operation>
		obj1 = obj;
	//   10   23:aload_1         
	//   11   24:astore_2        
		if(obj != null)
	//*  12   25:aload_1         
	//*  13   26:ifnull          49
		{
			TypeConverter typeconverter = FlowManager.getTypeConverterForClass(obj.getClass());
	//   14   29:aload_1         
	//   15   30:invokevirtual   #137 <Method Class Object.getClass()>
	//   16   33:invokestatic    #143 <Method TypeConverter FlowManager.getTypeConverterForClass(Class)>
	//   17   36:astore_3        
			obj1 = obj;
	//   18   37:aload_1         
	//   19   38:astore_2        
			if(typeconverter != null)
	//*  20   39:aload_3         
	//*  21   40:ifnull          49
				obj1 = typeconverter.getDBValue(obj);
	//   22   43:aload_3         
	//   23   44:aload_1         
	//   24   45:invokevirtual   #149 <Method Object TypeConverter.getDBValue(Object)>
	//   25   48:astore_2        
		}
		if(!(obj1 instanceof String) && !(obj1 instanceof ITypeConditional)) goto _L2; else goto _L1
	//   26   49:aload_2         
	//   27   50:instanceof      #151 <Class String>
	//   28   53:ifne            63
	//   29   56:aload_2         
	//   30   57:instanceof      #6   <Class ITypeConditional>
	//   31   60:ifeq            100
_L1:
		operation = String.format("%1s %1s ", new Object[] {
			operation, "||"
		});
	//   32   63:aload_0         
	//   33   64:ldc1            #153 <String "%1s %1s ">
	//   34   66:iconst_2        
	//   35   67:anewarray       Object[]
	//   36   70:dup             
	//   37   71:iconst_0        
	//   38   72:aload_0         
	//   39   73:getfield        #131 <Field String operation>
	//   40   76:aastore         
	//   41   77:dup             
	//   42   78:iconst_1        
	//   43   79:ldc1            #155 <String "||">
	//   44   81:aastore         
	//   45   82:invokestatic    #159 <Method String String.format(String, Object[])>
	//   46   85:putfield        #131 <Field String operation>
_L4:
		value = obj1;
	//   47   88:aload_0         
	//   48   89:aload_2         
	//   49   90:putfield        #162 <Field Object value>
		isValueSet = true;
	//   50   93:aload_0         
	//   51   94:iconst_1        
	//   52   95:putfield        #60  <Field boolean isValueSet>
		return this;
	//   53   98:aload_0         
	//   54   99:areturn         
_L2:
		if(!(obj1 instanceof Number))
			break; /* Loop/switch isn't completed */
	//   55  100:aload_2         
	//   56  101:instanceof      #164 <Class Number>
	//   57  104:ifeq            135
		operation = String.format("%1s %1s ", new Object[] {
			operation, "+"
		});
	//   58  107:aload_0         
	//   59  108:ldc1            #153 <String "%1s %1s ">
	//   60  110:iconst_2        
	//   61  111:anewarray       Object[]
	//   62  114:dup             
	//   63  115:iconst_0        
	//   64  116:aload_0         
	//   65  117:getfield        #131 <Field String operation>
	//   66  120:aastore         
	//   67  121:dup             
	//   68  122:iconst_1        
	//   69  123:ldc1            #166 <String "+">
	//   70  125:aastore         
	//   71  126:invokestatic    #159 <Method String String.format(String, Object[])>
	//   72  129:putfield        #131 <Field String operation>
		if(true) goto _L4; else goto _L3
	//   73  132:goto            88
_L3:
		if(obj1 != null)
	//*  74  135:aload_2         
	//*  75  136:ifnull          165
			obj = ((Object) (obj1.getClass()));
	//   76  139:aload_2         
	//   77  140:invokevirtual   #137 <Method Class Object.getClass()>
	//   78  143:astore_1        
		else
	//*  79  144:new             #168 <Class IllegalArgumentException>
	//*  80  147:dup             
	//*  81  148:ldc1            #170 <String "Cannot concatenate the %1s">
	//*  82  150:iconst_1        
	//*  83  151:anewarray       Object[]
	//*  84  154:dup             
	//*  85  155:iconst_0        
	//*  86  156:aload_1         
	//*  87  157:aastore         
	//*  88  158:invokestatic    #159 <Method String String.format(String, Object[])>
	//*  89  161:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//*  90  164:athrow          
			obj = "null";
	//   91  165:ldc1            #175 <String "null">
	//   92  167:astore_1        
		throw new IllegalArgumentException(String.format("Cannot concatenate the %1s", new Object[] {
			obj
		}));
	//*  93  168:goto            144
	}

	public String convertObjectToString(Object obj, boolean flag)
	{
		if(typeConverter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field TypeConverter typeConverter>
	//*   2    4:ifnull          33
		{
			if(convertToDB)
	//*   3    7:aload_0         
	//*   4    8:getfield        #31  <Field boolean convertToDB>
	//*   5   11:ifeq            30
				obj = typeConverter.getDBValue(obj);
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field TypeConverter typeConverter>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #149 <Method Object TypeConverter.getDBValue(Object)>
	//   10   22:astore_1        
			return BaseCondition.convertValueToString(obj, flag, false);
	//   11   23:aload_1         
	//   12   24:iload_2         
	//   13   25:iconst_0        
	//   14   26:invokestatic    #178 <Method String BaseCondition.convertValueToString(Object, boolean, boolean)>
	//   15   29:areturn         
		} else
	//*  16   30:goto            23
		{
			return super.convertObjectToString(obj, flag);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:iload_2         
	//   20   36:invokespecial   #179 <Method String BaseCondition.convertObjectToString(Object, boolean)>
	//   21   39:areturn         
		}
	}

	public Condition eq(BaseModelQueriable basemodelqueriable)
	{
		return eq(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #183 <Method Condition eq(Object)>
	//    3    5:areturn         
	}

	public Condition eq(IConditional iconditional)
	{
		return eq(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #183 <Method Condition eq(Object)>
	//    3    5:areturn         
	}

	public Condition eq(Object obj)
	{
		return is(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #186 <Method Condition is(Object)>
	//    3    5:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder();
	//    0    0:new             #50  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #188 <Method void QueryBuilder()>
	//    3    7:astore_1        
		appendConditionToQuery(querybuilder);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #190 <Method void appendConditionToQuery(QueryBuilder)>
		return querybuilder.getQuery();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #192 <Method String QueryBuilder.getQuery()>
	//    9   17:areturn         
	}

	public Condition glob(BaseModelQueriable basemodelqueriable)
	{
		return glob(basemodelqueriable.getQuery());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #196 <Method String BaseModelQueriable.getQuery()>
	//    3    5:invokevirtual   #198 <Method Condition glob(String)>
	//    4    8:areturn         
	}

	public Condition glob(IConditional iconditional)
	{
		return glob(iconditional.getQuery());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #201 <Method String IConditional.getQuery()>
	//    3    7:invokevirtual   #198 <Method Condition glob(String)>
	//    4   10:areturn         
	}

	public Condition glob(String s)
	{
		operation = String.format(" %1s ", new Object[] {
			"GLOB"
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #203 <String " %1s ">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #205 <String "GLOB">
	//    7   11:aastore         
	//    8   12:invokestatic    #159 <Method String String.format(String, Object[])>
	//    9   15:putfield        #131 <Field String operation>
		return value(((Object) (s)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #207 <Method Condition value(Object)>
	//   13   23:areturn         
	}

	public Condition greaterThan(BaseModelQueriable basemodelqueriable)
	{
		return greaterThan(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method Condition greaterThan(Object)>
	//    3    5:areturn         
	}

	public Condition greaterThan(IConditional iconditional)
	{
		return greaterThan(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #210 <Method Condition greaterThan(Object)>
	//    3    5:areturn         
	}

	public Condition greaterThan(Object obj)
	{
		operation = ">";
	//    0    0:aload_0         
	//    1    1:ldc1            #212 <String ">">
	//    2    3:putfield        #131 <Field String operation>
		return value(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #207 <Method Condition value(Object)>
	//    6   11:areturn         
	}

	public Condition greaterThanOrEq(BaseModelQueriable basemodelqueriable)
	{
		return greaterThanOrEq(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method Condition greaterThanOrEq(Object)>
	//    3    5:areturn         
	}

	public Condition greaterThanOrEq(IConditional iconditional)
	{
		return greaterThanOrEq(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method Condition greaterThanOrEq(Object)>
	//    3    5:areturn         
	}

	public Condition greaterThanOrEq(Object obj)
	{
		operation = ">=";
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <String ">=">
	//    2    3:putfield        #131 <Field String operation>
		return value(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #207 <Method Condition value(Object)>
	//    6   11:areturn         
	}

	public transient In in(BaseModelQueriable basemodelqueriable, BaseModelQueriable abasemodelqueriable[])
	{
		return in(((Object) (basemodelqueriable)), (Object[])abasemodelqueriable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #221 <Class Object[]>
	//    4    6:invokevirtual   #224 <Method Condition$In in(Object, Object[])>
	//    5    9:areturn         
	}

	public transient In in(IConditional iconditional, IConditional aiconditional[])
	{
		return in(((Object) (iconditional)), (Object[])aiconditional);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #221 <Class Object[]>
	//    4    6:invokevirtual   #224 <Method Condition$In in(Object, Object[])>
	//    5    9:areturn         
	}

	public transient In in(Object obj, Object aobj[])
	{
		return new In(this, obj, true, aobj);
	//    0    0:new             #13  <Class Condition$In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_2         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #228 <Method void Condition$In(Condition, Object, boolean, Object[], Condition$1)>
	//    8   12:areturn         
	}

	public In in(Collection collection)
	{
		return new In(this, collection, true);
	//    0    0:new             #13  <Class Condition$In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aconst_null     
	//    6    8:invokespecial   #232 <Method void Condition$In(Condition, Collection, boolean, Condition$1)>
	//    7   11:areturn         
	}

	public Condition is(BaseModelQueriable basemodelqueriable)
	{
		return is(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #186 <Method Condition is(Object)>
	//    3    5:areturn         
	}

	public Condition is(IConditional iconditional)
	{
		return is(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #186 <Method Condition is(Object)>
	//    3    5:areturn         
	}

	public Condition is(Object obj)
	{
		operation = "=";
	//    0    0:aload_0         
	//    1    1:ldc1            #125 <String "=">
	//    2    3:putfield        #131 <Field String operation>
		return value(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #207 <Method Condition value(Object)>
	//    6   11:areturn         
	}

	public Condition isNot(BaseModelQueriable basemodelqueriable)
	{
		return isNot(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #235 <Method Condition isNot(Object)>
	//    3    5:areturn         
	}

	public Condition isNot(IConditional iconditional)
	{
		return isNot(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #235 <Method Condition isNot(Object)>
	//    3    5:areturn         
	}

	public Condition isNot(Object obj)
	{
		operation = "!=";
	//    0    0:aload_0         
	//    1    1:ldc1            #237 <String "!=">
	//    2    3:putfield        #131 <Field String operation>
		return value(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #207 <Method Condition value(Object)>
	//    6   11:areturn         
	}

	public Condition isNotNull()
	{
		operation = String.format(" %1s ", new Object[] {
			"IS NOT NULL"
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #203 <String " %1s ">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #241 <String "IS NOT NULL">
	//    7   11:aastore         
	//    8   12:invokestatic    #159 <Method String String.format(String, Object[])>
	//    9   15:putfield        #131 <Field String operation>
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public Condition isNull()
	{
		operation = String.format(" %1s ", new Object[] {
			"IS NULL"
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #203 <String " %1s ">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #244 <String "IS NULL">
	//    7   11:aastore         
	//    8   12:invokestatic    #159 <Method String String.format(String, Object[])>
	//    9   15:putfield        #131 <Field String operation>
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public Condition lessThan(BaseModelQueriable basemodelqueriable)
	{
		return lessThan(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #247 <Method Condition lessThan(Object)>
	//    3    5:areturn         
	}

	public Condition lessThan(IConditional iconditional)
	{
		return lessThan(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #247 <Method Condition lessThan(Object)>
	//    3    5:areturn         
	}

	public Condition lessThan(Object obj)
	{
		operation = "<";
	//    0    0:aload_0         
	//    1    1:ldc1            #249 <String "<">
	//    2    3:putfield        #131 <Field String operation>
		return value(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #207 <Method Condition value(Object)>
	//    6   11:areturn         
	}

	public Condition lessThanOrEq(BaseModelQueriable basemodelqueriable)
	{
		return lessThanOrEq(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #252 <Method Condition lessThanOrEq(Object)>
	//    3    5:areturn         
	}

	public Condition lessThanOrEq(IConditional iconditional)
	{
		return lessThanOrEq(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #252 <Method Condition lessThanOrEq(Object)>
	//    3    5:areturn         
	}

	public Condition lessThanOrEq(Object obj)
	{
		operation = "<=";
	//    0    0:aload_0         
	//    1    1:ldc1            #254 <String "<=">
	//    2    3:putfield        #131 <Field String operation>
		return value(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #207 <Method Condition value(Object)>
	//    6   11:areturn         
	}

	public Condition like(BaseModelQueriable basemodelqueriable)
	{
		return like(basemodelqueriable.getQuery());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #196 <Method String BaseModelQueriable.getQuery()>
	//    3    5:invokevirtual   #257 <Method Condition like(String)>
	//    4    8:areturn         
	}

	public Condition like(IConditional iconditional)
	{
		return like(iconditional.getQuery());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #201 <Method String IConditional.getQuery()>
	//    3    7:invokevirtual   #257 <Method Condition like(String)>
	//    4   10:areturn         
	}

	public Condition like(String s)
	{
		operation = String.format(" %1s ", new Object[] {
			"LIKE"
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #203 <String " %1s ">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc2            #259 <String "LIKE">
	//    7   12:aastore         
	//    8   13:invokestatic    #159 <Method String String.format(String, Object[])>
	//    9   16:putfield        #131 <Field String operation>
		return value(((Object) (s)));
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #207 <Method Condition value(Object)>
	//   13   24:areturn         
	}

	public Condition notEq(BaseModelQueriable basemodelqueriable)
	{
		return notEq(((Object) (basemodelqueriable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #262 <Method Condition notEq(Object)>
	//    3    5:areturn         
	}

	public Condition notEq(IConditional iconditional)
	{
		return notEq(((Object) (iconditional)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #262 <Method Condition notEq(Object)>
	//    3    5:areturn         
	}

	public Condition notEq(Object obj)
	{
		return isNot(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #235 <Method Condition isNot(Object)>
	//    3    5:areturn         
	}

	public In notIn(BaseModelQueriable basemodelqueriable, BaseModelQueriable abasemodelqueriable[])
	{
		return notIn(((Object) (basemodelqueriable)), (Object[])abasemodelqueriable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #221 <Class Object[]>
	//    4    6:invokevirtual   #265 <Method Condition$In notIn(Object, Object[])>
	//    5    9:areturn         
	}

	public transient In notIn(IConditional iconditional, IConditional aiconditional[])
	{
		return notIn(((Object) (iconditional)), (Object[])aiconditional);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #221 <Class Object[]>
	//    4    6:invokevirtual   #265 <Method Condition$In notIn(Object, Object[])>
	//    5    9:areturn         
	}

	public transient In notIn(Object obj, Object aobj[])
	{
		return new In(this, obj, false, aobj);
	//    0    0:new             #13  <Class Condition$In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_2         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #228 <Method void Condition$In(Condition, Object, boolean, Object[], Condition$1)>
	//    8   12:areturn         
	}

	public In notIn(Collection collection)
	{
		return new In(this, collection, false);
	//    0    0:new             #13  <Class Condition$In>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aconst_null     
	//    6    8:invokespecial   #232 <Method void Condition$In(Condition, Collection, boolean, Condition$1)>
	//    7   11:areturn         
	}

	public Condition notLike(String s)
	{
		operation = String.format(" %1s ", new Object[] {
			"NOT LIKE"
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #203 <String " %1s ">
	//    2    3:iconst_1        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc2            #268 <String "NOT LIKE">
	//    7   12:aastore         
	//    8   13:invokestatic    #159 <Method String String.format(String, Object[])>
	//    9   16:putfield        #131 <Field String operation>
		return value(((Object) (s)));
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #207 <Method Condition value(Object)>
	//   13   24:areturn         
	}

	public Condition operation(String s)
	{
		operation = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field String operation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Condition postfix(String s)
	{
		postArg = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String postArg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Condition separator(String s)
	{
		separator = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #272 <Field String separator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile SQLCondition separator(String s)
	{
		return ((SQLCondition) (separator(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #275 <Method Condition separator(String)>
	//    3    5:areturn         
	}

	public Condition value(Object obj)
	{
		value = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field Object value>
		isValueSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #60  <Field boolean isValueSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private boolean convertToDB;
	private TypeConverter typeConverter;
}
