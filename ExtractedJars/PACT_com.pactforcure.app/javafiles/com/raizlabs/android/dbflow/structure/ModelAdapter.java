// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure;

import android.database.Cursor;
import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.saveable.ListModelSaver;
import com.raizlabs.android.dbflow.sql.saveable.ModelSaver;
import com.raizlabs.android.dbflow.structure.cache.IMultiKeyCacheConverter;
import com.raizlabs.android.dbflow.structure.cache.ModelCache;
import com.raizlabs.android.dbflow.structure.cache.SimpleMapCache;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.raizlabs.android.dbflow.structure:
//			InstanceAdapter, InternalAdapter, InvalidDBConfiguration

public abstract class ModelAdapter extends InstanceAdapter
	implements InternalAdapter
{

	public ModelAdapter(DatabaseDefinition databasedefinition)
	{
		super(databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void InstanceAdapter(DatabaseDefinition)>
		if(getTableConfig() != null && getTableConfig().modelSaver() != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #29  <Method TableConfig getTableConfig()>
	//*   5    9:ifnull          41
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #29  <Method TableConfig getTableConfig()>
	//*   8   16:invokevirtual   #34  <Method ModelSaver TableConfig.modelSaver()>
	//*   9   19:ifnull          41
		{
			modelSaver = getTableConfig().modelSaver();
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #29  <Method TableConfig getTableConfig()>
	//   13   27:invokevirtual   #34  <Method ModelSaver TableConfig.modelSaver()>
	//   14   30:putfield        #36  <Field ModelSaver modelSaver>
			modelSaver.setModelAdapter(this);
	//   15   33:aload_0         
	//   16   34:getfield        #36  <Field ModelSaver modelSaver>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #42  <Method void ModelSaver.setModelAdapter(ModelAdapter)>
		}
	//   19   41:return          
	}

	private void throwCachingError()
	{
		throw new InvalidDBConfiguration(String.format("This method may have been called in error. The model class %1s must containan auto-incrementing or at least one primary key (if used in a ModelCache, this method may be called)", new Object[] {
			getModelClass()
		}));
	//    0    0:new             #47  <Class InvalidDBConfiguration>
	//    1    3:dup             
	//    2    4:ldc1            #49  <String "This method may have been called in error. The model class %1s must containan auto-incrementing or at least one primary key (if used in a ModelCache, this method may be called)">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:invokevirtual   #55  <Method Class getModelClass()>
	//    9   16:aastore         
	//   10   17:invokestatic    #61  <Method String String.format(String, Object[])>
	//   11   20:invokespecial   #64  <Method void InvalidDBConfiguration(String)>
	//   12   23:athrow          
	}

	private void throwSingleCachingError()
	{
		throw new InvalidDBConfiguration(String.format("This method may have been called in error. The model class %1s must containan auto-incrementing or one primary key (if used in a ModelCache, this method may be called)", new Object[] {
			getModelClass()
		}));
	//    0    0:new             #47  <Class InvalidDBConfiguration>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "This method may have been called in error. The model class %1s must containan auto-incrementing or one primary key (if used in a ModelCache, this method may be called)">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:invokevirtual   #55  <Method Class getModelClass()>
	//    9   16:aastore         
	//   10   17:invokestatic    #61  <Method String String.format(String, Object[])>
	//   11   20:invokespecial   #64  <Method void InvalidDBConfiguration(String)>
	//   12   23:athrow          
	}

	public void bindToInsertStatement(DatabaseStatement databasestatement, Object obj)
	{
		bindToInsertStatement(databasestatement, obj, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #72  <Method void bindToInsertStatement(DatabaseStatement, Object, int)>
	//    5    7:return          
	}

	public boolean cachingEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String[] createCachingColumns()
	{
		return (new String[] {
			getAutoIncrementingColumnName()
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:invokevirtual   #82  <Method String getAutoIncrementingColumnName()>
	//    6   10:aastore         
	//    7   11:areturn         
	}

	protected ListModelSaver createListModelSaver()
	{
		return new ListModelSaver(getModelSaver());
	//    0    0:new             #86  <Class ListModelSaver>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    4    8:invokespecial   #92  <Method void ListModelSaver(ModelSaver)>
	//    5   11:areturn         
	}

	public ModelCache createModelCache()
	{
		return ((ModelCache) (new SimpleMapCache(getCacheSize())));
	//    0    0:new             #97  <Class SimpleMapCache>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #101 <Method int getCacheSize()>
	//    4    8:invokespecial   #104 <Method void SimpleMapCache(int)>
	//    5   11:areturn         
	}

	public void delete(Object obj)
	{
		getModelSaver().delete(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method boolean ModelSaver.delete(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void delete(Object obj, DatabaseWrapper databasewrapper)
	{
		getModelSaver().delete(obj, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #115 <Method boolean ModelSaver.delete(Object, DatabaseWrapper)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void deleteAll(Collection collection)
	{
		getListModelSaver().deleteAll(collection);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method void ListModelSaver.deleteAll(Collection)>
	//    4    8:return          
	}

	public void deleteAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		getListModelSaver().deleteAll(collection, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #127 <Method void ListModelSaver.deleteAll(Collection, DatabaseWrapper)>
	//    5    9:return          
	}

	public void deleteForeignKeys(Object obj, DatabaseWrapper databasewrapper)
	{
	//    0    0:return          
	}

	public abstract IProperty[] getAllColumnProperties();

	public String getAutoIncrementingColumnName()
	{
		throw new InvalidDBConfiguration(String.format("This method may have been called in error. The model class %1s must contain an autoincrementing or single int/long primary key (if used in a ModelCache, this method may be called)", new Object[] {
			getModelClass()
		}));
	//    0    0:new             #47  <Class InvalidDBConfiguration>
	//    1    3:dup             
	//    2    4:ldc1            #133 <String "This method may have been called in error. The model class %1s must contain an autoincrementing or single int/long primary key (if used in a ModelCache, this method may be called)">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:invokevirtual   #55  <Method Class getModelClass()>
	//    9   16:aastore         
	//   10   17:invokestatic    #61  <Method String String.format(String, Object[])>
	//   11   20:invokespecial   #64  <Method void InvalidDBConfiguration(String)>
	//   12   23:athrow          
	}

	public Number getAutoIncrementingId(Object obj)
	{
		throw new InvalidDBConfiguration(String.format("This method may have been called in error. The model class %1s must containa single primary key (if used in a ModelCache, this method may be called)", new Object[] {
			getModelClass()
		}));
	//    0    0:new             #47  <Class InvalidDBConfiguration>
	//    1    3:dup             
	//    2    4:ldc1            #137 <String "This method may have been called in error. The model class %1s must containa single primary key (if used in a ModelCache, this method may be called)">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:invokevirtual   #55  <Method Class getModelClass()>
	//    9   16:aastore         
	//   10   17:invokestatic    #61  <Method String String.format(String, Object[])>
	//   11   20:invokespecial   #64  <Method void InvalidDBConfiguration(String)>
	//   12   23:athrow          
	}

	public IMultiKeyCacheConverter getCacheConverter()
	{
		throw new InvalidDBConfiguration("For multiple primary keys, a public static IMultiKeyCacheConverter field mustbe  marked with @MultiCacheField in the corresponding model class. The resulting keymust be a unique combination of the multiple keys, otherwise inconsistencies may occur.");
	//    0    0:new             #47  <Class InvalidDBConfiguration>
	//    1    3:dup             
	//    2    4:ldc1            #142 <String "For multiple primary keys, a public static IMultiKeyCacheConverter field mustbe  marked with @MultiCacheField in the corresponding model class. The resulting keymust be a unique combination of the multiple keys, otherwise inconsistencies may occur.">
	//    3    6:invokespecial   #64  <Method void InvalidDBConfiguration(String)>
	//    4    9:athrow          
	}

	public int getCacheSize()
	{
		return 25;
	//    0    0:bipush          25
	//    1    2:ireturn         
	}

	public Object getCachingColumnValueFromCursor(Cursor cursor)
	{
		throwSingleCachingError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void throwSingleCachingError()>
		return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
	}

	public Object getCachingColumnValueFromModel(Object obj)
	{
		throwSingleCachingError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void throwSingleCachingError()>
		return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
	}

	public Object[] getCachingColumnValuesFromCursor(Object aobj[], Cursor cursor)
	{
		throwCachingError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void throwCachingError()>
		return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
	}

	public Object[] getCachingColumnValuesFromModel(Object aobj[], Object obj)
	{
		throwCachingError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void throwCachingError()>
		return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
	}

	public String[] getCachingColumns()
	{
		if(cachingColumns == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field String[] cachingColumns>
	//*   2    4:ifnonnull       15
			cachingColumns = createCachingColumns();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #162 <Method String[] createCachingColumns()>
	//    6   12:putfield        #160 <Field String[] cachingColumns>
		return cachingColumns;
	//    7   15:aload_0         
	//    8   16:getfield        #160 <Field String[] cachingColumns>
	//    9   19:areturn         
	}

	public Object getCachingId(Object obj)
	{
		return getCachingId(getCachingColumnValuesFromModel(new Object[getCachingColumns().length], obj));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #166 <Method String[] getCachingColumns()>
	//    4    6:arraylength     
	//    5    7:anewarray       Object[]
	//    6   10:aload_1         
	//    7   11:invokevirtual   #168 <Method Object[] getCachingColumnValuesFromModel(Object[], Object)>
	//    8   14:invokevirtual   #171 <Method Object getCachingId(Object[])>
	//    9   17:areturn         
	}

	public Object getCachingId(Object aobj[])
	{
		if(aobj.length == 1)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmpne          10
			return aobj[0];
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:aaload          
	//    7    9:areturn         
		else
			return getCacheConverter().getCachingKey(aobj);
	//    8   10:aload_0         
	//    9   11:invokevirtual   #174 <Method IMultiKeyCacheConverter getCacheConverter()>
	//   10   14:aload_1         
	//   11   15:invokeinterface #179 <Method Object IMultiKeyCacheConverter.getCachingKey(Object[])>
	//   12   20:areturn         
	}

	public DatabaseStatement getCompiledStatement()
	{
		if(compiledStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field DatabaseStatement compiledStatement>
	//*   2    4:ifnonnull       25
			compiledStatement = getCompiledStatement(FlowManager.getDatabaseForTable(getModelClass()).getWritableDatabase());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #55  <Method Class getModelClass()>
	//    7   13:invokestatic    #189 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    8   16:invokevirtual   #195 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    9   19:invokevirtual   #198 <Method DatabaseStatement getCompiledStatement(DatabaseWrapper)>
	//   10   22:putfield        #183 <Field DatabaseStatement compiledStatement>
		return compiledStatement;
	//   11   25:aload_0         
	//   12   26:getfield        #183 <Field DatabaseStatement compiledStatement>
	//   13   29:areturn         
	}

	public DatabaseStatement getCompiledStatement(DatabaseWrapper databasewrapper)
	{
		return databasewrapper.compileStatement(getCompiledStatementQuery());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #201 <Method String getCompiledStatementQuery()>
	//    3    5:invokeinterface #207 <Method DatabaseStatement DatabaseWrapper.compileStatement(String)>
	//    4   10:areturn         
	}

	protected abstract String getCompiledStatementQuery();

	public abstract String getCreationQuery();

	public ConflictAction getInsertOnConflictAction()
	{
		return ConflictAction.ABORT;
	//    0    0:getstatic       #216 <Field ConflictAction ConflictAction.ABORT>
	//    1    3:areturn         
	}

	public DatabaseStatement getInsertStatement()
	{
		if(insertStatement == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field DatabaseStatement insertStatement>
	//*   2    4:ifnonnull       25
			insertStatement = getInsertStatement(FlowManager.getDatabaseForTable(getModelClass()).getWritableDatabase());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #55  <Method Class getModelClass()>
	//    7   13:invokestatic    #189 <Method DatabaseDefinition FlowManager.getDatabaseForTable(Class)>
	//    8   16:invokevirtual   #195 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    9   19:invokevirtual   #221 <Method DatabaseStatement getInsertStatement(DatabaseWrapper)>
	//   10   22:putfield        #219 <Field DatabaseStatement insertStatement>
		return insertStatement;
	//   11   25:aload_0         
	//   12   26:getfield        #219 <Field DatabaseStatement insertStatement>
	//   13   29:areturn         
	}

	public DatabaseStatement getInsertStatement(DatabaseWrapper databasewrapper)
	{
		return databasewrapper.compileStatement(getInsertStatementQuery());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #224 <Method String getInsertStatementQuery()>
	//    3    5:invokeinterface #207 <Method DatabaseStatement DatabaseWrapper.compileStatement(String)>
	//    4   10:areturn         
	}

	protected abstract String getInsertStatementQuery();

	public ListModelSaver getListModelSaver()
	{
		if(listModelSaver == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field ListModelSaver listModelSaver>
	//*   2    4:ifnonnull       15
			listModelSaver = createListModelSaver();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #228 <Method ListModelSaver createListModelSaver()>
	//    6   12:putfield        #226 <Field ListModelSaver listModelSaver>
		return listModelSaver;
	//    7   15:aload_0         
	//    8   16:getfield        #226 <Field ListModelSaver listModelSaver>
	//    9   19:areturn         
	}

	public ModelCache getModelCache()
	{
		if(modelCache == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field ModelCache modelCache>
	//*   2    4:ifnonnull       15
			modelCache = createModelCache();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #233 <Method ModelCache createModelCache()>
	//    6   12:putfield        #231 <Field ModelCache modelCache>
		return modelCache;
	//    7   15:aload_0         
	//    8   16:getfield        #231 <Field ModelCache modelCache>
	//    9   19:areturn         
	}

	public ModelSaver getModelSaver()
	{
		if(modelSaver == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field ModelSaver modelSaver>
	//*   2    4:ifnonnull       26
		{
			modelSaver = new ModelSaver();
	//    3    7:aload_0         
	//    4    8:new             #38  <Class ModelSaver>
	//    5   11:dup             
	//    6   12:invokespecial   #235 <Method void ModelSaver()>
	//    7   15:putfield        #36  <Field ModelSaver modelSaver>
			modelSaver.setModelAdapter(this);
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field ModelSaver modelSaver>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #42  <Method void ModelSaver.setModelAdapter(ModelAdapter)>
		}
		return modelSaver;
	//   12   26:aload_0         
	//   13   27:getfield        #36  <Field ModelSaver modelSaver>
	//   14   30:areturn         
	}

	public abstract BaseProperty getProperty(String s);

	public ConflictAction getUpdateOnConflictAction()
	{
		return ConflictAction.ABORT;
	//    0    0:getstatic       #216 <Field ConflictAction ConflictAction.ABORT>
	//    1    3:areturn         
	}

	public long insert(Object obj)
	{
		return getModelSaver().insert(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #243 <Method long ModelSaver.insert(Object)>
	//    4    8:lreturn         
	}

	public long insert(Object obj, DatabaseWrapper databasewrapper)
	{
		return getModelSaver().insert(obj, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #247 <Method long ModelSaver.insert(Object, DatabaseWrapper)>
	//    5    9:lreturn         
	}

	public void insertAll(Collection collection)
	{
		getListModelSaver().insertAll(collection);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #251 <Method void ListModelSaver.insertAll(Collection)>
	//    4    8:return          
	}

	public void insertAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		getListModelSaver().insertAll(collection, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #253 <Method void ListModelSaver.insertAll(Collection, DatabaseWrapper)>
	//    5    9:return          
	}

	public Object loadFromCursor(Cursor cursor)
	{
		Object obj = newInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method Object newInstance()>
	//    2    4:astore_2        
		loadFromCursor(cursor, obj);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #261 <Method void loadFromCursor(Cursor, Object)>
		return obj;
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	public void reloadRelationships(Object obj, Cursor cursor)
	{
		throwCachingError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void throwCachingError()>
	//    2    4:return          
	}

	public void save(Object obj)
	{
		getModelSaver().save(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #268 <Method boolean ModelSaver.save(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void save(Object obj, DatabaseWrapper databasewrapper)
	{
		getModelSaver().save(obj, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #270 <Method boolean ModelSaver.save(Object, DatabaseWrapper)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void saveAll(Collection collection)
	{
		getListModelSaver().saveAll(collection);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #273 <Method void ListModelSaver.saveAll(Collection)>
		if(cachingEnabled())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #275 <Method boolean cachingEnabled()>
	//*   6   12:ifeq            54
		{
			Object obj;
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); getModelCache().addModel(getCachingId(obj), obj))
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #281 <Method Iterator Collection.iterator()>
	//*   9   21:astore_1        
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #286 <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            54
				obj = ((Iterator) (collection)).next();
	//   13   31:aload_1         
	//   14   32:invokeinterface #289 <Method Object Iterator.next()>
	//   15   37:astore_2        

	//   16   38:aload_0         
	//   17   39:invokevirtual   #291 <Method ModelCache getModelCache()>
	//   18   42:aload_0         
	//   19   43:aload_2         
	//   20   44:invokevirtual   #293 <Method Object getCachingId(Object)>
	//   21   47:aload_2         
	//   22   48:invokevirtual   #299 <Method void ModelCache.addModel(Object, Object)>
		}
	//*  23   51:goto            22
	//   24   54:return          
	}

	public void saveAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		getListModelSaver().saveAll(collection, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #301 <Method void ListModelSaver.saveAll(Collection, DatabaseWrapper)>
	//    5    9:return          
	}

	public void saveForeignKeys(Object obj, DatabaseWrapper databasewrapper)
	{
	//    0    0:return          
	}

	public void setModelSaver(ModelSaver modelsaver)
	{
		modelSaver = modelsaver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field ModelSaver modelSaver>
	//    3    5:return          
	}

	public void storeModelInCache(Object obj)
	{
		getModelCache().addModel(getCachingId(obj), obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method ModelCache getModelCache()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #293 <Method Object getCachingId(Object)>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #299 <Method void ModelCache.addModel(Object, Object)>
	//    7   13:return          
	}

	public void update(Object obj)
	{
		getModelSaver().update(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #308 <Method boolean ModelSaver.update(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void update(Object obj, DatabaseWrapper databasewrapper)
	{
		getModelSaver().update(obj, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method ModelSaver getModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #310 <Method boolean ModelSaver.update(Object, DatabaseWrapper)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void updateAll(Collection collection)
	{
		getListModelSaver().updateAll(collection);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #313 <Method void ListModelSaver.updateAll(Collection)>
	//    4    8:return          
	}

	public void updateAll(Collection collection, DatabaseWrapper databasewrapper)
	{
		getListModelSaver().updateAll(collection, databasewrapper);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method ListModelSaver getListModelSaver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #315 <Method void ListModelSaver.updateAll(Collection, DatabaseWrapper)>
	//    5    9:return          
	}

	public void updateAutoIncrement(Object obj, Number number)
	{
	//    0    0:return          
	}

	private String cachingColumns[];
	private DatabaseStatement compiledStatement;
	private DatabaseStatement insertStatement;
	private ListModelSaver listModelSaver;
	private ModelCache modelCache;
	private ModelSaver modelSaver;
}
