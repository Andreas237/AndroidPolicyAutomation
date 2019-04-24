// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.migration;

import com.raizlabs.android.dbflow.sql.language.Index;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.migration:
//			BaseMigration

public abstract class IndexMigration extends BaseMigration
{

	public IndexMigration(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BaseMigration()>
		onTable = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Class onTable>
	//    5    9:return          
	}

	public IndexMigration addColumn(IProperty iproperty)
	{
		getIndex().and(iproperty);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Index getIndex()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method Index Index.and(IProperty)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Index getIndex()
	{
		if(index == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Index index>
	//*   2    4:ifnonnull       33
			index = (new Index(name)).on(onTable, new IProperty[0]);
	//    3    7:aload_0         
	//    4    8:new             #33  <Class Index>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field String name>
	//    8   16:invokespecial   #45  <Method void Index(String)>
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field Class onTable>
	//   11   23:iconst_0        
	//   12   24:anewarray       IProperty[]
	//   13   27:invokevirtual   #51  <Method Index Index.on(Class, IProperty[])>
	//   14   30:putfield        #40  <Field Index index>
		return index;
	//   15   33:aload_0         
	//   16   34:getfield        #40  <Field Index index>
	//   17   37:areturn         
	}

	public String getIndexQuery()
	{
		return getIndex().getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Index getIndex()>
	//    2    4:invokevirtual   #57  <Method String Index.getQuery()>
	//    3    7:areturn         
	}

	public abstract String getName();

	public final void migrate(DatabaseWrapper databasewrapper)
	{
		databasewrapper.execSQL(getIndex().getQuery());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #31  <Method Index getIndex()>
	//    3    5:invokevirtual   #57  <Method String Index.getQuery()>
	//    4    8:invokeinterface #65  <Method void DatabaseWrapper.execSQL(String)>
	//    5   13:return          
	}

	public void onPostMigrate()
	{
		onTable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #21  <Field Class onTable>
		name = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #42  <Field String name>
		index = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #40  <Field Index index>
	//    9   15:return          
	}

	public void onPreMigrate()
	{
		index = getIndex();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #31  <Method Index getIndex()>
	//    3    5:putfield        #40  <Field Index index>
	//    4    8:return          
	}

	public IndexMigration unique()
	{
		getIndex().unique(true);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Index getIndex()>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #74  <Method Index Index.unique(boolean)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	private Index index;
	private String name;
	private Class onTable;
}
