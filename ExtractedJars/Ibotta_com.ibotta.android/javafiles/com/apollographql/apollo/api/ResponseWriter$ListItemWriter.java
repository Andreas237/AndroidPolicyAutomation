// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;


// Referenced classes of package com.apollographql.apollo.api:
//			ResponseWriter, ScalarType, ResponseFieldMarshaller

public static interface ResponseWriter$ListItemWriter
{

	public abstract void writeBoolean(Object obj);

	public abstract void writeCustom(ScalarType scalartype, Object obj);

	public abstract void writeDouble(Object obj);

	public abstract void writeInt(Object obj);

	public abstract void writeLong(Object obj);

	public abstract void writeObject(ResponseFieldMarshaller responsefieldmarshaller);

	public abstract void writeString(Object obj);
}
