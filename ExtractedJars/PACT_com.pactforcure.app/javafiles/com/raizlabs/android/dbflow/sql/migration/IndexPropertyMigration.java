// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.migration;

import com.raizlabs.android.dbflow.sql.language.property.IndexProperty;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;

// Referenced classes of package com.raizlabs.android.dbflow.sql.migration:
//			BaseMigration

public abstract class IndexPropertyMigration extends BaseMigration
{

	public IndexPropertyMigration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseMigration()>
	//    2    4:return          
	}

	public abstract IndexProperty getIndexProperty();

	public void migrate(DatabaseWrapper databasewrapper)
	{
		if(shouldCreate())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #18  <Method boolean shouldCreate()>
	//*   2    4:ifeq            16
		{
			getIndexProperty().createIfNotExists(databasewrapper);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #20  <Method IndexProperty getIndexProperty()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #25  <Method void IndexProperty.createIfNotExists(DatabaseWrapper)>
			return;
	//    7   15:return          
		} else
		{
			getIndexProperty().drop(databasewrapper);
	//    8   16:aload_0         
	//    9   17:invokevirtual   #20  <Method IndexProperty getIndexProperty()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #28  <Method void IndexProperty.drop(DatabaseWrapper)>
			return;
	//   12   24:return          
		}
	}

	public boolean shouldCreate()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
