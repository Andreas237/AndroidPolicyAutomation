// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.Utils;

import java.util.Set;

public class NameValueObject
{

	public NameValueObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String name>
	//    2    4:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String value>
	//    2    4:areturn         
	}

	public Set getValueSet()
	{
		return valueSet;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Set valueSet>
	//    2    4:areturn         
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String name>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String value>
	//    3    5:return          
	}

	public void setValueSet(Set set)
	{
		valueSet = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Set valueSet>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("NameValueObject [name=").append(name).append(", value=").append(value).append(", valueSet=").append(((Object) (valueSet))).append("]").toString();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:ldc1            #40  <String "NameValueObject [name=">
	//    4    9:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field String name>
	//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #46  <String ", value=">
	//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #22  <Field String value>
	//   12   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #48  <String ", valueSet=">
	//   14   33:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #26  <Field Set valueSet>
	//   17   40:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:ldc1            #53  <String "]">
	//   19   45:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private String name;
	private String value;
	private Set valueSet;
}
