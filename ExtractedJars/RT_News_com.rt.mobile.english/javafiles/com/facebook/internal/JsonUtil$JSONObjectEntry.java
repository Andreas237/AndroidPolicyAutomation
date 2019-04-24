// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			JsonUtil

private static final class JsonUtil$JSONObjectEntry
	implements java.util.Map.Entry
{

	public volatile Object getKey()
	{
		return ((Object) (getKey()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method String getKey()>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String key>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object value>
	//    2    4:areturn         
	}

	public Object setValue(Object obj)
	{
		throw new UnsupportedOperationException("JSONObjectEntry is immutable");
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #39  <String "JSONObjectEntry is immutable">
	//    3    6:invokespecial   #42  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	private final String key;
	private final Object value;

	JsonUtil$JSONObjectEntry(String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		key = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String key>
		value = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Object value>
	//    8   14:return          
	}
}
