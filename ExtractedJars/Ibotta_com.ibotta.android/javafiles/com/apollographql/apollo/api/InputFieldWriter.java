// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.api:
//			ScalarType, InputFieldMarshaller

public interface InputFieldWriter
{
	public static interface ListItemWriter
	{

		public abstract void writeBoolean(Boolean boolean1)
			throws IOException;

		public abstract void writeCustom(ScalarType scalartype, Object obj)
			throws IOException;

		public abstract void writeDouble(Double double1)
			throws IOException;

		public abstract void writeInt(Integer integer)
			throws IOException;

		public abstract void writeList(ListWriter listwriter)
			throws IOException;

		public abstract void writeLong(Long long1)
			throws IOException;

		public abstract void writeObject(InputFieldMarshaller inputfieldmarshaller)
			throws IOException;

		public abstract void writeString(String s)
			throws IOException;
	}

	public static interface ListWriter
	{

		public abstract void write(ListItemWriter listitemwriter)
			throws IOException;
	}


	public abstract void writeBoolean(String s, Boolean boolean1)
		throws IOException;

	public abstract void writeCustom(String s, ScalarType scalartype, Object obj)
		throws IOException;

	public abstract void writeDouble(String s, Double double1)
		throws IOException;

	public abstract void writeInt(String s, Integer integer)
		throws IOException;

	public abstract void writeList(String s, ListWriter listwriter)
		throws IOException;

	public abstract void writeLong(String s, Long long1)
		throws IOException;

	public abstract void writeObject(String s, InputFieldMarshaller inputfieldmarshaller)
		throws IOException;

	public abstract void writeString(String s, String s1)
		throws IOException;
}
