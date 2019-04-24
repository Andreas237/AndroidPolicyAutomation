// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import android.database.Cursor;
import co.touchlab.squeaky.table.GeneratedTableMapper;
import co.touchlab.squeaky.table.TransientCache;
import java.io.IOException;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.dao:
//			CloseableIterator, ModelDao

public class SelectIterator
	implements CloseableIterator
{

	public SelectIterator(Cursor cursor1, ModelDao modeldao, Dao.ForeignRefresh aforeignrefresh[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class TransientCache>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void TransientCache()>
	//    6   12:putfield        #29  <Field TransientCache objectCache>
		cursor = cursor1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #31  <Field Cursor cursor>
		modelDao = modeldao;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #33  <Field ModelDao modelDao>
		foreignRefreshMap = aforeignrefresh;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #35  <Field Dao$ForeignRefresh[] foreignRefreshMap>
		generatedTableMapper = modeldao.getGeneratedTableMapper();
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #41  <Method GeneratedTableMapper ModelDao.getGeneratedTableMapper()>
	//   19   35:putfield        #43  <Field GeneratedTableMapper generatedTableMapper>
	//   20   38:return          
	}

	private Object makeData()
		throws SQLException
	{
		Object obj = generatedTableMapper.createObject(cursor);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field GeneratedTableMapper generatedTableMapper>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Cursor cursor>
	//    4    8:invokeinterface #56  <Method Object GeneratedTableMapper.createObject(Cursor)>
	//    5   13:astore_1        
		generatedTableMapper.fillRow(obj, cursor, modelDao, foreignRefreshMap, objectCache);
	//    6   14:aload_0         
	//    7   15:getfield        #43  <Field GeneratedTableMapper generatedTableMapper>
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #31  <Field Cursor cursor>
	//   11   23:aload_0         
	//   12   24:getfield        #33  <Field ModelDao modelDao>
	//   13   27:aload_0         
	//   14   28:getfield        #35  <Field Dao$ForeignRefresh[] foreignRefreshMap>
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field TransientCache objectCache>
	//   17   35:invokeinterface #60  <Method void GeneratedTableMapper.fillRow(Object, Cursor, ModelDao, Dao$ForeignRefresh[], TransientCache)>
		return obj;
	//   18   40:aload_1         
	//   19   41:areturn         
	}

	public void close()
		throws IOException
	{
		cursor.close();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Cursor cursor>
	//    2    4:invokeinterface #69  <Method void Cursor.close()>
	//    3    9:return          
	}

	public void closeQuietly()
	{
		try
		{
			close();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method void close()>
			return;
	//    2    4:return          
		}
		catch(Exception exception)
	//*   3    5:astore_1        
		{
			return;
	//    4    6:return          
		}
	}

	public Object current()
		throws SQLException
	{
		return makeData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method Object makeData()>
	//    2    4:areturn         
	}

	public Object first()
		throws SQLException
	{
		if(cursor.moveToFirst())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Cursor cursor>
	//*   2    4:invokeinterface #81  <Method boolean Cursor.moveToFirst()>
	//*   3    9:ifeq            17
			return makeData();
	//    4   12:aload_0         
	//    5   13:invokespecial   #76  <Method Object makeData()>
	//    6   16:areturn         
		else
			return ((Object) (null));
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public boolean hasNext()
	{
		boolean flag = cursor.moveToNext();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Cursor cursor>
	//    2    4:invokeinterface #85  <Method boolean Cursor.moveToNext()>
	//    3    9:istore_1        
		cursor.moveToPrevious();
	//    4   10:aload_0         
	//    5   11:getfield        #31  <Field Cursor cursor>
	//    6   14:invokeinterface #88  <Method boolean Cursor.moveToPrevious()>
	//    7   19:pop             
		return flag;
	//    8   20:iload_1         
	//    9   21:ireturn         
	}

	public Object moveRelative(int i)
		throws SQLException
	{
		if(cursor.move(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Cursor cursor>
	//*   2    4:iload_1         
	//*   3    5:invokeinterface #94  <Method boolean Cursor.move(int)>
	//*   4   10:ifeq            18
			return makeData();
	//    5   13:aload_0         
	//    6   14:invokespecial   #76  <Method Object makeData()>
	//    7   17:areturn         
		else
			return ((Object) (null));
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public void moveToNext()
	{
		cursor.moveToNext();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Cursor cursor>
	//    2    4:invokeinterface #85  <Method boolean Cursor.moveToNext()>
	//    3    9:pop             
	//    4   10:return          
	}

	public Object next()
	{
		Object obj;
		try
		{
			obj = nextThrow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method Object nextThrow()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(SQLException sqlexception)
	//*   5    7:astore_1        
		{
			throw new RuntimeException(((Throwable) (sqlexception)));
	//    6    8:new             #101 <Class RuntimeException>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:invokespecial   #104 <Method void RuntimeException(Throwable)>
	//   10   16:athrow          
		}
		return obj;
	}

	public Object nextThrow()
		throws SQLException
	{
		if(cursor.moveToNext())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Cursor cursor>
	//*   2    4:invokeinterface #85  <Method boolean Cursor.moveToNext()>
	//*   3    9:ifeq            17
			return makeData();
	//    4   12:aload_0         
	//    5   13:invokespecial   #76  <Method Object makeData()>
	//    6   16:areturn         
		else
			return ((Object) (null));
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public Object previous()
		throws SQLException
	{
		if(cursor.moveToPrevious())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Cursor cursor>
	//*   2    4:invokeinterface #88  <Method boolean Cursor.moveToPrevious()>
	//*   3    9:ifeq            17
			return makeData();
	//    4   12:aload_0         
	//    5   13:invokespecial   #76  <Method Object makeData()>
	//    6   16:areturn         
		else
			return ((Object) (null));
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException("Can't remove from cursor");
	//    0    0:new             #108 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #110 <String "Can't remove from cursor">
	//    3    6:invokespecial   #113 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	private final Cursor cursor;
	private final Dao.ForeignRefresh foreignRefreshMap[];
	private final GeneratedTableMapper generatedTableMapper;
	private final ModelDao modelDao;
	private final TransientCache objectCache = new TransientCache();
}
