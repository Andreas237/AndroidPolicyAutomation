// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.sql.language.property.PropertyFactory;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			NameAlias, ConditionGroup, From, SQLCondition

public class Join
	implements Query
{
	public static final class JoinType extends Enum
	{

		public static JoinType valueOf(String s)
		{
			return (JoinType)Enum.valueOf(com/raizlabs/android/dbflow/sql/language/Join$JoinType, s);
		//    0    0:ldc1            #2   <Class Join$JoinType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Join$JoinType>
		//    4    9:areturn         
		}

		public static JoinType[] values()
		{
			return (JoinType[])((JoinType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Join$JoinType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.raizlabs.android.dbflow.sql.language.Join$JoinType_3B_.clone()>
		//    2    6:checkcast       #42  <Class Join$JoinType[]>
		//    3    9:areturn         
		}

		private static final JoinType $VALUES[];
		public static final JoinType CROSS;
		public static final JoinType INNER;
		public static final JoinType LEFT_OUTER;

		static 
		{
			LEFT_OUTER = new JoinType("LEFT_OUTER", 0);
		//    0    0:new             #2   <Class Join$JoinType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "LEFT_OUTER">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Join$JoinType(String, int)>
		//    5   10:putstatic       #23  <Field Join$JoinType LEFT_OUTER>
			INNER = new JoinType("INNER", 1);
		//    6   13:new             #2   <Class Join$JoinType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "INNER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Join$JoinType(String, int)>
		//   11   23:putstatic       #26  <Field Join$JoinType INNER>
			CROSS = new JoinType("CROSS", 2);
		//   12   26:new             #2   <Class Join$JoinType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "CROSS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Join$JoinType(String, int)>
		//   17   36:putstatic       #29  <Field Join$JoinType CROSS>
			$VALUES = (new JoinType[] {
				LEFT_OUTER, INNER, CROSS
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       JoinType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Join$JoinType LEFT_OUTER>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Join$JoinType INNER>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Join$JoinType CROSS>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Join$JoinType[] $VALUES>
		//*  33   64:return          
		}

		private JoinType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	Join(From from1, JoinType jointype, ModelQueriable modelqueriable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		using = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:putfield        #38  <Field List using>
		isNatural = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #40  <Field boolean isNatural>
		from = from1;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #42  <Field From from>
		type = jointype;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #44  <Field Join$JoinType type>
		table = modelqueriable.getTable();
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokeinterface #50  <Method Class ModelQueriable.getTable()>
	//   19   37:putfield        #52  <Field Class table>
		alias = PropertyFactory.from(modelqueriable).getNameAlias();
	//   20   40:aload_0         
	//   21   41:aload_3         
	//   22   42:invokestatic    #57  <Method Property PropertyFactory.from(ModelQueriable)>
	//   23   45:invokevirtual   #63  <Method NameAlias Property.getNameAlias()>
	//   24   48:putfield        #65  <Field NameAlias alias>
	//   25   51:return          
	}

	Join(From from1, Class class1, JoinType jointype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		using = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:putfield        #38  <Field List using>
		isNatural = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #40  <Field boolean isNatural>
		from = from1;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #42  <Field From from>
		table = class1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #52  <Field Class table>
		type = jointype;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:putfield        #44  <Field Join$JoinType type>
		alias = (new NameAlias.Builder(FlowManager.getTableName(class1))).build();
	//   19   35:aload_0         
	//   20   36:new             #72  <Class NameAlias$Builder>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:invokestatic    #78  <Method String FlowManager.getTableName(Class)>
	//   24   44:invokespecial   #81  <Method void NameAlias$Builder(String)>
	//   25   47:invokevirtual   #84  <Method NameAlias NameAlias$Builder.build()>
	//   26   50:putfield        #65  <Field NameAlias alias>
	//   27   53:return          
	}

	public Join as(String s)
	{
		alias = alias.newBuilder().as(s).build();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field NameAlias alias>
	//    3    5:invokevirtual   #93  <Method NameAlias$Builder NameAlias.newBuilder()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #96  <Method NameAlias$Builder NameAlias$Builder.as(String)>
	//    6   12:invokevirtual   #84  <Method NameAlias NameAlias$Builder.build()>
	//    7   15:putfield        #65  <Field NameAlias alias>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder;
		querybuilder = new QueryBuilder();
	//    0    0:new             #101 <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #102 <Method void QueryBuilder()>
	//    3    7:astore_1        
		if(isNatural)
	//*   4    8:aload_0         
	//*   5    9:getfield        #40  <Field boolean isNatural>
	//*   6   12:ifeq            22
			querybuilder.append("NATURAL ");
	//    7   15:aload_1         
	//    8   16:ldc1            #104 <String "NATURAL ">
	//    9   18:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   10   21:pop             
		querybuilder.append(((Object) (type.name().replace("_", " ")))).appendSpace();
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #44  <Field Join$JoinType type>
	//   14   27:invokevirtual   #111 <Method String Join$JoinType.name()>
	//   15   30:ldc1            #113 <String "_">
	//   16   32:ldc1            #115 <String " ">
	//   17   34:invokevirtual   #121 <Method String String.replace(CharSequence, CharSequence)>
	//   18   37:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   19   40:invokevirtual   #125 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   20   43:pop             
		querybuilder.append("JOIN").appendSpace().append(((Object) (alias.getFullQuery()))).appendSpace();
	//   21   44:aload_1         
	//   22   45:ldc1            #127 <String "JOIN">
	//   23   47:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   24   50:invokevirtual   #125 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   25   53:aload_0         
	//   26   54:getfield        #65  <Field NameAlias alias>
	//   27   57:invokevirtual   #130 <Method String NameAlias.getFullQuery()>
	//   28   60:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   29   63:invokevirtual   #125 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   30   66:pop             
		if(onGroup == null) goto _L2; else goto _L1
	//   31   67:aload_0         
	//   32   68:getfield        #132 <Field ConditionGroup onGroup>
	//   33   71:ifnull          102
_L1:
		querybuilder.append("ON").appendSpace().append(((Object) (onGroup.getQuery()))).appendSpace();
	//   34   74:aload_1         
	//   35   75:ldc1            #134 <String "ON">
	//   36   77:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   37   80:invokevirtual   #125 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   38   83:aload_0         
	//   39   84:getfield        #132 <Field ConditionGroup onGroup>
	//   40   87:invokevirtual   #138 <Method String ConditionGroup.getQuery()>
	//   41   90:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   42   93:invokevirtual   #125 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   43   96:pop             
_L4:
		return querybuilder.getQuery();
	//   44   97:aload_1         
	//   45   98:invokevirtual   #139 <Method String QueryBuilder.getQuery()>
	//   46  101:areturn         
_L2:
		if(!using.isEmpty())
	//*  47  102:aload_0         
	//*  48  103:getfield        #38  <Field List using>
	//*  49  106:invokeinterface #145 <Method boolean List.isEmpty()>
	//*  50  111:ifne            97
			querybuilder.append("USING (").appendArray(new Object[] {
				using
			}).append(")").appendSpace();
	//   51  114:aload_1         
	//   52  115:ldc1            #147 <String "USING (">
	//   53  117:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   54  120:iconst_1        
	//   55  121:anewarray       Object[]
	//   56  124:dup             
	//   57  125:iconst_0        
	//   58  126:aload_0         
	//   59  127:getfield        #38  <Field List using>
	//   60  130:aastore         
	//   61  131:invokevirtual   #151 <Method QueryBuilder QueryBuilder.appendArray(Object[])>
	//   62  134:ldc1            #153 <String ")">
	//   63  136:invokevirtual   #108 <Method QueryBuilder QueryBuilder.append(Object)>
	//   64  139:invokevirtual   #125 <Method QueryBuilder QueryBuilder.appendSpace()>
	//   65  142:pop             
		if(true) goto _L4; else goto _L3
	//   66  143:goto            97
_L3:
	}

	public From natural()
	{
		isNatural = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #40  <Field boolean isNatural>
		return from;
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field From from>
	//    5    9:areturn         
	}

	public transient From on(SQLCondition asqlcondition[])
	{
		onGroup = new ConditionGroup();
	//    0    0:aload_0         
	//    1    1:new             #136 <Class ConditionGroup>
	//    2    4:dup             
	//    3    5:invokespecial   #159 <Method void ConditionGroup()>
	//    4    8:putfield        #132 <Field ConditionGroup onGroup>
		onGroup.andAll(asqlcondition);
	//    5   11:aload_0         
	//    6   12:getfield        #132 <Field ConditionGroup onGroup>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #163 <Method ConditionGroup ConditionGroup.andAll(SQLCondition[])>
	//    9   19:pop             
		return from;
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field From from>
	//   12   24:areturn         
	}

	public transient From using(IProperty aiproperty[])
	{
		Collections.addAll(((java.util.Collection) (using)), ((Object []) (aiproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List using>
	//    2    4:aload_1         
	//    3    5:invokestatic    #171 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//    4    8:pop             
		return from;
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field From from>
	//    7   13:areturn         
	}

	private NameAlias alias;
	private From from;
	private boolean isNatural;
	private ConditionGroup onGroup;
	private Class table;
	private JoinType type;
	private List using;
}
