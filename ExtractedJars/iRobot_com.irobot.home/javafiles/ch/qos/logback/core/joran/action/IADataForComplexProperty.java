// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;

public class IADataForComplexProperty
{

	public IADataForComplexProperty(PropertySetter propertysetter, AggregationType aggregationtype, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		parentBean = propertysetter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field PropertySetter parentBean>
		aggregationType = aggregationtype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field AggregationType aggregationType>
		complexPropertyName = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field String complexPropertyName>
	//   11   19:return          
	}

	public AggregationType getAggregationType()
	{
		return aggregationType;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AggregationType aggregationType>
	//    2    4:areturn         
	}

	public String getComplexPropertyName()
	{
		return complexPropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String complexPropertyName>
	//    2    4:areturn         
	}

	public Object getNestedComplexProperty()
	{
		return nestedComplexProperty;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object nestedComplexProperty>
	//    2    4:areturn         
	}

	public void setNestedComplexProperty(Object obj)
	{
		nestedComplexProperty = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field Object nestedComplexProperty>
	//    3    5:return          
	}

	final AggregationType aggregationType;
	final String complexPropertyName;
	boolean inError;
	private Object nestedComplexProperty;
	final PropertySetter parentBean;
}
