// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;


// Referenced classes of package com.google.gson:
//			FieldAttributes

public interface ExclusionStrategy
{

	public abstract boolean shouldSkipClass(Class class1);

	public abstract boolean shouldSkipField(FieldAttributes fieldattributes);
}
