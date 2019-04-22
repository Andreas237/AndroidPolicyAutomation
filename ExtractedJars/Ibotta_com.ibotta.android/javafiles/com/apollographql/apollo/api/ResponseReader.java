// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.util.List;

// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField, ScalarType

public interface ResponseReader
{
	public static interface ConditionalTypeReader
	{

		public abstract Object read(String s, ResponseReader responsereader);
	}

	public static interface ListItemReader
	{

		public abstract Boolean readBoolean();

		public abstract Object readCustomType(ScalarType scalartype);

		public abstract Double readDouble();

		public abstract Integer readInt();

		public abstract List readList(ListReader listreader);

		public abstract Long readLong();

		public abstract Object readObject(ObjectReader objectreader);

		public abstract String readString();
	}

	public static interface ListReader
	{

		public abstract Object read(ListItemReader listitemreader);
	}

	public static interface ObjectReader
	{

		public abstract Object read(ResponseReader responsereader);
	}


	public abstract Boolean readBoolean(ResponseField responsefield);

	public abstract Object readConditional(ResponseField responsefield, ConditionalTypeReader conditionaltypereader);

	public abstract Object readCustomType(ResponseField.CustomTypeField customtypefield);

	public abstract Double readDouble(ResponseField responsefield);

	public abstract Integer readInt(ResponseField responsefield);

	public abstract List readList(ResponseField responsefield, ListReader listreader);

	public abstract Long readLong(ResponseField responsefield);

	public abstract Object readObject(ResponseField responsefield, ObjectReader objectreader);

	public abstract String readString(ResponseField responsefield);
}
