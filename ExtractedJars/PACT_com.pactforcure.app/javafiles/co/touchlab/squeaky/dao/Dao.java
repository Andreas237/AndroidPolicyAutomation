// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import java.sql.SQLException;
import java.util.*;

// Referenced classes of package co.touchlab.squeaky.dao:
//			Query, CloseableIterator

public interface Dao
{
	public static interface DaoObserver
	{

		public abstract void onChange();
	}

	public static class ForeignRefresh
	{

		public final String field;
		public final ForeignRefresh refreshFields[];

		public ForeignRefresh(String s)
		{
			this(s, ((ForeignRefresh []) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #16  <Method void Dao$ForeignRefresh(String, Dao$ForeignRefresh[])>
		//    4    6:return          
		}

		public ForeignRefresh(String s, ForeignRefresh aforeignrefresh[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			field = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field String field>
			refreshFields = aforeignrefresh;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Dao$ForeignRefresh[] refreshFields>
		//    8   14:return          
		}
	}

	public static interface QueryModifiers
	{

		public abstract QueryModifiers foreignRefreshMap(ForeignRefresh aforeignrefresh[]);

		public abstract QueryModifiers limit(Integer integer);

		public abstract List list()
			throws SQLException;

		public abstract QueryModifiers offset(Integer integer);

		public abstract QueryModifiers orderBy(String s);
	}


	public abstract Query all();

	public abstract long countOf()
		throws SQLException;

	public abstract long countOf(Query query1)
		throws SQLException;

	public abstract void create(Object obj)
		throws SQLException;

	public abstract Object createIfNotExists(Object obj)
		throws SQLException;

	public abstract void createOrUpdate(Object obj)
		throws SQLException;

	public abstract int delete(Query query1)
		throws SQLException;

	public abstract int delete(Object obj)
		throws SQLException;

	public abstract int delete(Collection collection)
		throws SQLException;

	public abstract int deleteById(Object obj)
		throws SQLException;

	public abstract int deleteIds(Collection collection)
		throws SQLException;

	public abstract Object extractId(Object obj)
		throws SQLException;

	public abstract void fillForeignCollection(Object obj, String s)
		throws SQLException;

	public abstract Class getDataClass();

	public abstract boolean idExists(Object obj)
		throws SQLException;

	public abstract boolean isUpdatable();

	public abstract CloseableIterator iterator()
		throws SQLException;

	public abstract CloseableIterator iterator(Query query1)
		throws SQLException;

	public abstract void notifyChanges();

	public abstract String objectToString(Object obj)
		throws SQLException;

	public abstract boolean objectsEqual(Object obj, Object obj1)
		throws SQLException;

	public abstract QueryModifiers query(Query query1)
		throws SQLException;

	public abstract QueryModifiers query(String s, String as[])
		throws SQLException;

	public abstract QueryModifiers queryForAll()
		throws SQLException;

	public abstract QueryModifiers queryForEq(String s, Object obj)
		throws SQLException;

	public abstract QueryModifiers queryForFieldValues(Map map)
		throws SQLException;

	public abstract Object queryForId(Object obj)
		throws SQLException;

	public transient abstract long queryRawValue(String s, String as[])
		throws SQLException;

	public abstract void refresh(Object obj)
		throws SQLException;

	public abstract void refresh(Object obj, ForeignRefresh aforeignrefresh[])
		throws SQLException;

	public abstract void registerObserver(DaoObserver daoobserver);

	public abstract void unregisterObserver(DaoObserver daoobserver);

	public abstract int update(Query query1, Map map)
		throws SQLException;

	public abstract void update(Object obj)
		throws SQLException;

	public abstract int updateId(Object obj, Object obj1)
		throws SQLException;
}
