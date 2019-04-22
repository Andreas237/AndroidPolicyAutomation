// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Operation;

// Referenced classes of package com.apollographql.apollo:
//			ApolloPrefetch

public static interface ApolloPrefetch$Factory
{

	public abstract ApolloPrefetch prefetch(Operation operation);
}
