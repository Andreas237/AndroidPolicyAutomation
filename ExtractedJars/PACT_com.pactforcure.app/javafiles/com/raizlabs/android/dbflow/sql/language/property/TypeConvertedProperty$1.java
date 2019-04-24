// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.converter.TypeConverter;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			TypeConvertedProperty

class TypeConvertedProperty$1
	implements peConverterGetter
{

	public TypeConverter getTypeConverter(Class class1)
	{
		return TypeConvertedProperty.access$000(TypeConvertedProperty.this).getTypeConverter(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TypeConvertedProperty this$0>
	//    2    4:invokestatic    #27  <Method TypeConvertedProperty$TypeConverterGetter TypeConvertedProperty.access$000(TypeConvertedProperty)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #29  <Method TypeConverter TypeConvertedProperty$TypeConverterGetter.getTypeConverter(Class)>
	//    5   13:areturn         
	}

	final TypeConvertedProperty this$0;

	TypeConvertedProperty$1()
	{
		this$0 = TypeConvertedProperty.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TypeConvertedProperty this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
