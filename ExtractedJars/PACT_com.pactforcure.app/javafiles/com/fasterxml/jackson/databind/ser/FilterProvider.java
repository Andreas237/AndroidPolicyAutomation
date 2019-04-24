// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BeanPropertyFilter, PropertyFilter

public abstract class FilterProvider
{

	public FilterProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract BeanPropertyFilter findFilter(Object obj);

	public PropertyFilter findPropertyFilter(Object obj, Object obj1)
	{
		obj = ((Object) (findFilter(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #16  <Method BeanPropertyFilter findFilter(Object)>
	//    3    5:astore_1        
		if(obj == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return SimpleBeanPropertyFilter.from(((BeanPropertyFilter) (obj)));
	//    8   12:aload_1         
	//    9   13:invokestatic    #22  <Method PropertyFilter SimpleBeanPropertyFilter.from(BeanPropertyFilter)>
	//   10   16:areturn         
	}
}
