// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.Index;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			IProperty

public class IndexProperty
{

	public transient IndexProperty(String s, boolean flag, Class class1, IProperty aiproperty[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		index = SQLite.index(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method Index SQLite.index(String)>
	//    5    9:putfield        #20  <Field Index index>
		index.on(class1, aiproperty).unique(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Index index>
	//    8   16:aload_3         
	//    9   17:aload           4
	//   10   19:invokevirtual   #26  <Method Index Index.on(Class, IProperty[])>
	//   11   22:iload_2         
	//   12   23:invokevirtual   #30  <Method Index Index.unique(boolean)>
	//   13   26:pop             
	//   14   27:return          
	}

	public void createIfNotExists()
	{
		index.enable();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Index index>
	//    2    4:invokevirtual   #37  <Method void Index.enable()>
	//    3    7:return          
	}

	public void createIfNotExists(DatabaseWrapper databasewrapper)
	{
		index.enable(databasewrapper);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Index index>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method void Index.enable(DatabaseWrapper)>
	//    4    8:return          
	}

	public void drop()
	{
		index.disable();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Index index>
	//    2    4:invokevirtual   #44  <Method void Index.disable()>
	//    3    7:return          
	}

	public void drop(DatabaseWrapper databasewrapper)
	{
		index.disable(databasewrapper);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Index index>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method void Index.disable(DatabaseWrapper)>
	//    4    8:return          
	}

	public Index getIndex()
	{
		return index;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Index index>
	//    2    4:areturn         
	}

	public String getIndexName()
	{
		return QueryBuilder.quoteIfNeeded(index.getIndexName());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Index index>
	//    2    4:invokevirtual   #53  <Method String Index.getIndexName()>
	//    3    7:invokestatic    #59  <Method String QueryBuilder.quoteIfNeeded(String)>
	//    4   10:areturn         
	}

	private final Index index;
}
