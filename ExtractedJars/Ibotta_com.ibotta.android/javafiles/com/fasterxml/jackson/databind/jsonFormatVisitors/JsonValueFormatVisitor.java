// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.jsonFormatVisitors:
//			JsonValueFormat

public interface JsonValueFormatVisitor
{

	public abstract void enumTypes(Set set);

	public abstract void format(JsonValueFormat jsonvalueformat);
}
