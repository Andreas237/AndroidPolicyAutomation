// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.queriable;

import com.raizlabs.android.dbflow.list.FlowCursorList;
import com.raizlabs.android.dbflow.list.FlowQueryList;
import com.raizlabs.android.dbflow.sql.language.CursorResult;
import com.raizlabs.android.dbflow.structure.BaseQueryModel;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql.queriable:
//			Queriable, AsyncQuery

public interface ModelQueriable
	extends Queriable
{

	public abstract AsyncQuery async();

	public abstract FlowCursorList cursorList();

	public abstract FlowQueryList flowQueryList();

	public abstract Class getTable();

	public abstract List queryCustomList(Class class1);

	public abstract BaseQueryModel queryCustomSingle(Class class1);

	public abstract List queryList();

	public abstract List queryList(DatabaseWrapper databasewrapper);

	public abstract CursorResult queryResults();

	public abstract Object querySingle();

	public abstract Object querySingle(DatabaseWrapper databasewrapper);
}
