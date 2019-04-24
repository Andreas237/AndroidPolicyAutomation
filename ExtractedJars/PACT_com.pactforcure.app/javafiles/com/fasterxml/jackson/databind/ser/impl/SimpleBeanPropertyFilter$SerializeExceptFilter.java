// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			SimpleBeanPropertyFilter

public static class SimpleBeanPropertyFilter$SerializeExceptFilter extends SimpleBeanPropertyFilter
	implements Serializable
{

	protected boolean include(BeanPropertyWriter beanpropertywriter)
	{
		return !_propertiesToExclude.contains(((Object) (beanpropertywriter.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Set _propertiesToExclude>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #44  <Method String BeanPropertyWriter.getName()>
	//    4    8:invokeinterface #50  <Method boolean Set.contains(Object)>
	//    5   13:ifne            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	protected boolean include(PropertyWriter propertywriter)
	{
		return !_propertiesToExclude.contains(((Object) (propertywriter.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Set _propertiesToExclude>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method String PropertyWriter.getName()>
	//    4    8:invokeinterface #50  <Method boolean Set.contains(Object)>
	//    5   13:ifne            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	static final SimpleBeanPropertyFilter$SerializeExceptFilter INCLUDE_ALL = new SimpleBeanPropertyFilter$SerializeExceptFilter();
	private static final long serialVersionUID = 1L;
	protected final Set _propertiesToExclude;

	static 
	{
	//    0    0:new             #2   <Class SimpleBeanPropertyFilter$SerializeExceptFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void SimpleBeanPropertyFilter$SerializeExceptFilter()>
	//    3    7:putstatic       #23  <Field SimpleBeanPropertyFilter$SerializeExceptFilter INCLUDE_ALL>
	//*   4   10:return          
	}

	SimpleBeanPropertyFilter$SerializeExceptFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void SimpleBeanPropertyFilter()>
		_propertiesToExclude = Collections.emptySet();
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method Set Collections.emptySet()>
	//    4    8:putfield        #33  <Field Set _propertiesToExclude>
	//    5   11:return          
	}

	public SimpleBeanPropertyFilter$SerializeExceptFilter(Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void SimpleBeanPropertyFilter()>
		_propertiesToExclude = set;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Set _propertiesToExclude>
	//    5    9:return          
	}
}
