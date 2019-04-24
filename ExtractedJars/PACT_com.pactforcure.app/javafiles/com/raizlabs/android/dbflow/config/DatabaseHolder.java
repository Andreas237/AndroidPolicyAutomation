// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.converter.TypeConverter;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseDefinition

public abstract class DatabaseHolder
{

	public DatabaseHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void HashMap()>
	//    6   12:putfield        #21  <Field Map databaseDefinitionMap>
	//    7   15:aload_0         
	//    8   16:new             #18  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #19  <Method void HashMap()>
	//   11   23:putfield        #23  <Field Map databaseNameMap>
	//   12   26:aload_0         
	//   13   27:new             #18  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #19  <Method void HashMap()>
	//   16   34:putfield        #25  <Field Map databaseClassLookupMap>
	//   17   37:aload_0         
	//   18   38:new             #18  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #19  <Method void HashMap()>
	//   21   45:putfield        #27  <Field Map typeConverters>
	//   22   48:return          
	}

	public DatabaseDefinition getDatabase(Class class1)
	{
		return (DatabaseDefinition)databaseClassLookupMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Map databaseClassLookupMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method Object Map.get(Object)>
	//    4   10:checkcast       #38  <Class DatabaseDefinition>
	//    5   13:areturn         
	}

	public DatabaseDefinition getDatabase(String s)
	{
		return (DatabaseDefinition)databaseNameMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Map databaseNameMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method Object Map.get(Object)>
	//    4   10:checkcast       #38  <Class DatabaseDefinition>
	//    5   13:areturn         
	}

	public List getDatabaseDefinitions()
	{
		return ((List) (new ArrayList(databaseNameMap.values())));
	//    0    0:new             #45  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Map databaseNameMap>
	//    4    8:invokeinterface #49  <Method java.util.Collection Map.values()>
	//    5   13:invokespecial   #52  <Method void ArrayList(java.util.Collection)>
	//    6   16:areturn         
	}

	public DatabaseDefinition getDatabaseForTable(Class class1)
	{
		return (DatabaseDefinition)databaseDefinitionMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map databaseDefinitionMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method Object Map.get(Object)>
	//    4   10:checkcast       #38  <Class DatabaseDefinition>
	//    5   13:areturn         
	}

	public TypeConverter getTypeConverterForClass(Class class1)
	{
		return (TypeConverter)typeConverters.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map typeConverters>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method Object Map.get(Object)>
	//    4   10:checkcast       #58  <Class TypeConverter>
	//    5   13:areturn         
	}

	public void putDatabaseForTable(Class class1, DatabaseDefinition databasedefinition)
	{
		databaseDefinitionMap.put(((Object) (class1)), ((Object) (databasedefinition)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map databaseDefinitionMap>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		databaseNameMap.put(((Object) (databasedefinition.getDatabaseName())), ((Object) (databasedefinition)));
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field Map databaseNameMap>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #69  <Method String DatabaseDefinition.getDatabaseName()>
	//   10   20:aload_2         
	//   11   21:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   12   26:pop             
		databaseClassLookupMap.put(((Object) (databasedefinition.getAssociatedDatabaseClassFile())), ((Object) (databasedefinition)));
	//   13   27:aload_0         
	//   14   28:getfield        #25  <Field Map databaseClassLookupMap>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #73  <Method Class DatabaseDefinition.getAssociatedDatabaseClassFile()>
	//   17   35:aload_2         
	//   18   36:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   19   41:pop             
	//   20   42:return          
	}

	public void reset()
	{
		databaseDefinitionMap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map databaseDefinitionMap>
	//    2    4:invokeinterface #78  <Method void Map.clear()>
		databaseNameMap.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #23  <Field Map databaseNameMap>
	//    5   13:invokeinterface #78  <Method void Map.clear()>
		databaseClassLookupMap.clear();
	//    6   18:aload_0         
	//    7   19:getfield        #25  <Field Map databaseClassLookupMap>
	//    8   22:invokeinterface #78  <Method void Map.clear()>
		typeConverters.clear();
	//    9   27:aload_0         
	//   10   28:getfield        #27  <Field Map typeConverters>
	//   11   31:invokeinterface #78  <Method void Map.clear()>
	//   12   36:return          
	}

	protected final Map databaseClassLookupMap = new HashMap();
	protected final Map databaseDefinitionMap = new HashMap();
	protected final Map databaseNameMap = new HashMap();
	protected final Map typeConverters = new HashMap();
}
