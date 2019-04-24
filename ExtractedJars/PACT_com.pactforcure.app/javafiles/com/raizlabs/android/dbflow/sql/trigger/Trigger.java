// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.trigger;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;

// Referenced classes of package com.raizlabs.android.dbflow.sql.trigger:
//			TriggerMethod

public class Trigger
	implements Query
{

	private Trigger(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		triggerName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String triggerName>
	//    5    9:return          
	}

	public static Trigger create(String s)
	{
		return new Trigger(s);
	//    0    0:new             #2   <Class Trigger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #30  <Method void Trigger(String)>
	//    4    8:areturn         
	}

	public Trigger after()
	{
		beforeOrAfter = "AFTER";
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "AFTER">
	//    2    3:putfield        #34  <Field String beforeOrAfter>
		return this;
	//    3    6:aload_0         
	//    4    7:areturn         
	}

	public Trigger before()
	{
		beforeOrAfter = "BEFORE";
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "BEFORE">
	//    2    3:putfield        #34  <Field String beforeOrAfter>
		return this;
	//    3    6:aload_0         
	//    4    7:areturn         
	}

	public TriggerMethod delete(Class class1)
	{
		return new TriggerMethod(this, "DELETE", class1, new IProperty[0]);
	//    0    0:new             #39  <Class TriggerMethod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #41  <String "DELETE">
	//    4    7:aload_1         
	//    5    8:iconst_0        
	//    6    9:anewarray       IProperty[]
	//    7   12:invokespecial   #46  <Method void TriggerMethod(Trigger, String, Class, IProperty[])>
	//    8   15:areturn         
	}

	public String getName()
	{
		return triggerName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String triggerName>
	//    2    4:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder("CREATE ");
	//    0    0:new             #53  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #55  <String "CREATE ">
	//    3    6:invokespecial   #58  <Method void QueryBuilder(Object)>
	//    4    9:astore_1        
		if(temporary)
	//*   5   10:aload_0         
	//*   6   11:getfield        #60  <Field boolean temporary>
	//*   7   14:ifeq            24
			querybuilder.append("TEMP ");
	//    8   17:aload_1         
	//    9   18:ldc1            #62  <String "TEMP ">
	//   10   20:invokevirtual   #66  <Method QueryBuilder QueryBuilder.append(Object)>
	//   11   23:pop             
		querybuilder.append("TRIGGER IF NOT EXISTS ").appendQuotedIfNeeded(triggerName).appendSpace().appendOptional(((Object) ((new StringBuilder()).append(" ").append(beforeOrAfter).append(" ").toString())));
	//   12   24:aload_1         
	//   13   25:ldc1            #68  <String "TRIGGER IF NOT EXISTS ">
	//   14   27:invokevirtual   #66  <Method QueryBuilder QueryBuilder.append(Object)>
	//   15   30:aload_0         
	//   16   31:getfield        #25  <Field String triggerName>
	//   17   34:invokevirtual   #72  <Method QueryBuilder QueryBuilder.appendQuotedIfNeeded(String)>
	//   18   37:invokevirtual   #76  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   19   40:new             #78  <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #79  <Method void StringBuilder()>
	//   22   47:ldc1            #81  <String " ">
	//   23   49:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:getfield        #34  <Field String beforeOrAfter>
	//   26   56:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:ldc1            #81  <String " ">
	//   28   61:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   29   64:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   30   67:invokevirtual   #90  <Method QueryBuilder QueryBuilder.appendOptional(Object)>
	//   31   70:pop             
		return querybuilder.getQuery();
	//   32   71:aload_1         
	//   33   72:invokevirtual   #92  <Method String QueryBuilder.getQuery()>
	//   34   75:areturn         
	}

	public TriggerMethod insert(Class class1)
	{
		return new TriggerMethod(this, "INSERT", class1, new IProperty[0]);
	//    0    0:new             #39  <Class TriggerMethod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #95  <String "INSERT">
	//    4    7:aload_1         
	//    5    8:iconst_0        
	//    6    9:anewarray       IProperty[]
	//    7   12:invokespecial   #46  <Method void TriggerMethod(Trigger, String, Class, IProperty[])>
	//    8   15:areturn         
	}

	public Trigger insteadOf()
	{
		beforeOrAfter = "INSTEAD OF";
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "INSTEAD OF">
	//    2    3:putfield        #34  <Field String beforeOrAfter>
		return this;
	//    3    6:aload_0         
	//    4    7:areturn         
	}

	public Trigger temporary()
	{
		temporary = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #60  <Field boolean temporary>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient TriggerMethod update(Class class1, IProperty aiproperty[])
	{
		return new TriggerMethod(this, "UPDATE", class1, aiproperty);
	//    0    0:new             #39  <Class TriggerMethod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #100 <String "UPDATE">
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #46  <Method void TriggerMethod(Trigger, String, Class, IProperty[])>
	//    7   12:areturn         
	}

	public static final String AFTER = "AFTER";
	public static final String BEFORE = "BEFORE";
	public static final String INSTEAD_OF = "INSTEAD OF";
	String beforeOrAfter;
	boolean temporary;
	final String triggerName;
}
