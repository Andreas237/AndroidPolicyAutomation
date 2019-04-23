// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftARError

public static interface CraftAROnDeviceCollectionManager$DeleteCollectionListener
{

	public abstract void collectionDeleted();

	public abstract void deleteCollectionFailed(CraftARError craftarerror);
}
