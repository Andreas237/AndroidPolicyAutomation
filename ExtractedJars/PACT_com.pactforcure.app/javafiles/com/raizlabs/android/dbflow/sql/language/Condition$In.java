// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.QueryBuilder;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseCondition, Condition, ConditionGroup

public static class Condition$In extends BaseCondition
{

	public Condition$In and(Object obj)
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

	private transient Condition$In(Condition condition, Object obj, boolean flag, Object aobj[])
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

	Condition$In(Condition condition, Object obj, boolean flag, Object aobj[], Condition._cls1 _pcls1)
	{
		this(condition, obj, flag, aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #60  <Method void Condition$In(Condition, Object, boolean, Object[])>
	//    6    9:return          
	}

	private Condition$In(Condition condition, Collection collection, boolean flag)
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

	Condition$In(Condition condition, Collection collection, boolean flag, Condition._cls1 _pcls1)
	{
		this(condition, collection, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #69  <Method void Condition$In(Condition, Collection, boolean)>
	//    5    7:return          
	}
}
