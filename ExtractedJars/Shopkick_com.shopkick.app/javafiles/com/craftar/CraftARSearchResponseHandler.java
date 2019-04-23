// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.ArrayList;

// Referenced classes of package com.craftar:
//			CraftARError

public interface CraftARSearchResponseHandler
{

	public abstract void searchFailed(CraftARError craftarerror, int i);

	public abstract void searchResults(ArrayList arraylist, long l, int i);
}
