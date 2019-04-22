// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.util.List;

// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField, ResponseFieldMarshaller, ScalarType

public interface ResponseWriter
{
	public static interface ListItemWriter
	{

		public abstract void writeBoolean(Object obj);

		public abstract void writeCustom(ScalarType scalartype, Object obj);

		public abstract void writeDouble(Object obj);

		public abstract void writeInt(Object obj);

		public abstract void writeLong(Object obj);

		public abstract void writeObject(ResponseFieldMarshaller responsefieldmarshaller);

		public abstract void writeString(Object obj);
	}

	public static interface ListWriter
	{

		public abstract void write(Object obj, ListItemWriter listitemwriter);
	}


	public abstract void writeBoolean(ResponseField responsefield, Boolean boolean1);

	public abstract void writeCustom(ResponseField.CustomTypeField customtypefield, Object obj);

	public abstract void writeDouble(ResponseField responsefield, Double double1);

	public abstract void writeInt(ResponseField responsefield, Integer integer);

	public abstract void writeList(ResponseField responsefield, List list, ListWriter listwriter);

	public abstract void writeLong(ResponseField responsefield, Long long1);

	public abstract void writeObject(ResponseField responsefield, ResponseFieldMarshaller responsefieldmarshaller);

	public abstract void writeString(ResponseField responsefield, String s);
}
