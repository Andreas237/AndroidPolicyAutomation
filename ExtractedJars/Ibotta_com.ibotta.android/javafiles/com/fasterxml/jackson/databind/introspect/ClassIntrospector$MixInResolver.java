// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;


// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			ClassIntrospector

public static interface ClassIntrospector$MixInResolver
{

	public abstract ClassIntrospector$MixInResolver copy();

	public abstract Class findMixInClassFor(Class class1);
}
