// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.Serializable;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			SimpleBeanPropertyFilter

public static class SimpleBeanPropertyFilter$FilterExceptFilter extends SimpleBeanPropertyFilter
	implements Serializable
{

	protected boolean include(BeanPropertyWriter beanpropertywriter)
	{
		return _propertiesToInclude.contains(((Object) (beanpropertywriter.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Set _propertiesToInclude>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method String BeanPropertyWriter.getName()>
	//    4    8:invokeinterface #38  <Method boolean Set.contains(Object)>
	//    5   13:ireturn         
	}

	protected boolean include(PropertyWriter propertywriter)
	{
		return _propertiesToInclude.contains(((Object) (propertywriter.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Set _propertiesToInclude>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method String PropertyWriter.getName()>
	//    4    8:invokeinterface #38  <Method boolean Set.contains(Object)>
	//    5   13:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Set _propertiesToInclude;

	public SimpleBeanPropertyFilter$FilterExceptFilter(Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void SimpleBeanPropertyFilter()>
		_propertiesToInclude = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Set _propertiesToInclude>
	//    5    9:return          
	}
}
