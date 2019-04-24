// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import java.lang.annotation.Annotation;

// Referenced classes of package co.touchlab.squeaky.field:
//			DataType

public interface DatabaseField
	extends Annotation
{

	public abstract boolean canBeNull();

	public abstract String columnName();

	public abstract DataType dataType();

	public abstract String defaultValue();

	public abstract boolean foreign();

	public abstract boolean foreignAutoRefresh();

	public abstract String format();

	public abstract boolean generatedId();

	public abstract boolean id();

	public abstract boolean index();

	public abstract String indexName();

	public abstract Class persisterClass();

	public abstract boolean unique();

	public abstract boolean uniqueCombo();

	public abstract boolean uniqueIndex();

	public abstract String uniqueIndexName();

	public abstract boolean useGetSet();

	public static final String DEFAULT_STRING = "__ormlite__ no default value string was specified";
}
