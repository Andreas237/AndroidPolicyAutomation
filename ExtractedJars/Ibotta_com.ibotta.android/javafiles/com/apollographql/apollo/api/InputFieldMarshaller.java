// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.api:
//			InputFieldWriter

public interface InputFieldMarshaller
{

	public abstract void marshal(InputFieldWriter inputfieldwriter)
		throws IOException;
}
