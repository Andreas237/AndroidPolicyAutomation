// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.utilities;

import com.firebase.client.core.Path;

// Referenced classes of package com.firebase.client.core.utilities:
//			ImmutableTree

public static interface ImmutableTree$TreeVisitor
{

	public abstract Object onNodeValue(Path path, Object obj, Object obj1);
}
