// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.lang.reflect.Type;

// Referenced classes of package com.google.gson:
//			JsonElement

public interface JsonSerializationContext
{

	public abstract JsonElement serialize(Object obj);

	public abstract JsonElement serialize(Object obj, Type type);
}
