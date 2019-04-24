// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.converter.TypeConverter;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			TypeConvertedProperty

public static interface TypeConvertedProperty$TypeConverterGetter
{

	public abstract TypeConverter getTypeConverter(Class class1);
}
