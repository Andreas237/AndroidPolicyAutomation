// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.language.property.IProperty;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			NameAlias, Where, SQLCondition, OrderBy

public interface Transformable
{

	public transient abstract Where groupBy(NameAlias anamealias[]);

	public transient abstract Where groupBy(IProperty aiproperty[]);

	public transient abstract Where having(SQLCondition asqlcondition[]);

	public abstract Where limit(int i);

	public abstract Where offset(int i);

	public abstract Where orderBy(NameAlias namealias, boolean flag);

	public abstract Where orderBy(OrderBy orderby);

	public abstract Where orderBy(IProperty iproperty, boolean flag);
}
