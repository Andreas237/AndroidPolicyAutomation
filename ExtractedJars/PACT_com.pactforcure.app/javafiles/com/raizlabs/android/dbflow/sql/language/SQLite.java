// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.sql.trigger.Trigger;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			Case, Delete, Index, Insert, 
//			Select, Method, Update, SQLCondition, 
//			CaseCondition, From

public class SQLite
{

	public SQLite()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Case _case(IProperty iproperty)
	{
		return new Case(iproperty);
	//    0    0:new             #13  <Class Case>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #16  <Method void Case(IProperty)>
	//    4    8:areturn         
	}

	public static Case _case(Property property)
	{
		return new Case(((IProperty) (property)));
	//    0    0:new             #13  <Class Case>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #16  <Method void Case(IProperty)>
	//    4    8:areturn         
	}

	public static CaseCondition caseWhen(SQLCondition sqlcondition)
	{
		return (new Case()).when(sqlcondition);
	//    0    0:new             #13  <Class Case>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Case()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #27  <Method CaseCondition Case.when(SQLCondition)>
	//    5   11:areturn         
	}

	public static Trigger createTrigger(String s)
	{
		return Trigger.create(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #36  <Method Trigger Trigger.create(String)>
	//    2    4:areturn         
	}

	public static Delete delete()
	{
		return new Delete();
	//    0    0:new             #40  <Class Delete>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void Delete()>
	//    3    7:areturn         
	}

	public static From delete(Class class1)
	{
		return delete().from(class1);
	//    0    0:invokestatic    #44  <Method Delete delete()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #47  <Method From Delete.from(Class)>
	//    3    7:areturn         
	}

	public static Index index(String s)
	{
		return new Index(s);
	//    0    0:new             #52  <Class Index>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #55  <Method void Index(String)>
	//    4    8:areturn         
	}

	public static Insert insert(Class class1)
	{
		return new Insert(class1);
	//    0    0:new             #60  <Class Insert>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #63  <Method void Insert(Class)>
	//    4    8:areturn         
	}

	public static transient Select select(IProperty aiproperty[])
	{
		return new Select(aiproperty);
	//    0    0:new             #68  <Class Select>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #71  <Method void Select(IProperty[])>
	//    4    8:areturn         
	}

	public static transient Select selectCountOf(IProperty aiproperty[])
	{
		return new Select(new IProperty[] {
			Method.count(aiproperty)
		});
	//    0    0:new             #68  <Class Select>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:anewarray       IProperty[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokestatic    #80  <Method Method Method.count(IProperty[])>
	//    8   14:aastore         
	//    9   15:invokespecial   #71  <Method void Select(IProperty[])>
	//   10   18:areturn         
	}

	public static Update update(Class class1)
	{
		return new Update(class1);
	//    0    0:new             #84  <Class Update>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #85  <Method void Update(Class)>
	//    4    8:areturn         
	}
}
