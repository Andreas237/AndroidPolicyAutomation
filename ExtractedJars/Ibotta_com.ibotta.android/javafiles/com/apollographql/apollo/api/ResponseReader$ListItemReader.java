// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.util.List;

// Referenced classes of package com.apollographql.apollo.api:
//			ResponseReader, ScalarType

public static interface ResponseReader$ListItemReader
{

	public abstract Boolean readBoolean();

	public abstract Object readCustomType(ScalarType scalartype);

	public abstract Double readDouble();

	public abstract Integer readInt();

	public abstract List readList(ResponseReader.ListReader listreader);

	public abstract Long readLong();

	public abstract Object readObject(ResponseReader.ObjectReader objectreader);

	public abstract String readString();
}
