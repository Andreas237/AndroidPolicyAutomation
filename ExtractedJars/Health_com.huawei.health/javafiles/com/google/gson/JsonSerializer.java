// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.lang.reflect.Type;

// Referenced classes of package com.google.gson:
//			JsonSerializationContext, JsonElement

public interface JsonSerializer
{

	public abstract JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext);
}
