// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.api:
//			InputFieldWriter, ScalarType, InputFieldMarshaller

public static interface InputFieldWriter$ListItemWriter
{

	public abstract void writeBoolean(Boolean boolean1)
		throws IOException;

	public abstract void writeCustom(ScalarType scalartype, Object obj)
		throws IOException;

	public abstract void writeDouble(Double double1)
		throws IOException;

	public abstract void writeInt(Integer integer)
		throws IOException;

	public abstract void writeList(InputFieldWriter.ListWriter listwriter)
		throws IOException;

	public abstract void writeLong(Long long1)
		throws IOException;

	public abstract void writeObject(InputFieldMarshaller inputfieldmarshaller)
		throws IOException;

	public abstract void writeString(String s)
		throws IOException;
}
