// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;

import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.field:
//			FieldConverter, FieldType

public interface DataPersister
	extends FieldConverter
{

	public abstract String[] getAssociatedClassNames();

	public abstract Class[] getAssociatedClasses();

	public abstract boolean isComparable();

	public abstract boolean isEscapedDefaultValue();

	public abstract boolean isEscapedValue();

	public abstract boolean isPrimitive();

	public abstract Object makeConfigObject(FieldType fieldtype)
		throws SQLException;
}
