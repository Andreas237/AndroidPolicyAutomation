// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

// Referenced classes of package com.fasterxml.jackson.databind:
//			PropertyNamingStrategy

public static abstract class PropertyNamingStrategy$PropertyNamingStrategyBase extends PropertyNamingStrategy
{

	public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
	{
		return translate(s);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #16  <Method String translate(String)>
	//    3    5:areturn         
	}

	public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
	{
		return translate(s);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #16  <Method String translate(String)>
	//    3    5:areturn         
	}

	public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
	{
		return translate(s);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #16  <Method String translate(String)>
	//    3    5:areturn         
	}

	public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
	{
		return translate(s);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #16  <Method String translate(String)>
	//    3    5:areturn         
	}

	public abstract String translate(String s);

	public PropertyNamingStrategy$PropertyNamingStrategyBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void PropertyNamingStrategy()>
	//    2    4:return          
	}
}
