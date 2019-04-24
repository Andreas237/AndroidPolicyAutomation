// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;

class IADataForBasicProperty
{

	IADataForBasicProperty(PropertySetter propertysetter, AggregationType aggregationtype, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		parentBean = propertysetter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field PropertySetter parentBean>
		aggregationType = aggregationtype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field AggregationType aggregationType>
		propertyName = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field String propertyName>
	//   11   19:return          
	}

	final AggregationType aggregationType;
	boolean inError;
	final PropertySetter parentBean;
	final String propertyName;
}
