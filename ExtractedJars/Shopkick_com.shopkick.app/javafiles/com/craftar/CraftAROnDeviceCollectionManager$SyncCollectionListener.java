// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftAROnDeviceCollection, CraftARError

public static interface CraftAROnDeviceCollectionManager$SyncCollectionListener
{

	public abstract void syncFailed(CraftAROnDeviceCollection craftarondevicecollection, CraftARError craftarerror);

	public abstract void syncFinishedWithErrors(CraftAROnDeviceCollection craftarondevicecollection, int i, int j);

	public abstract void syncProgress(CraftAROnDeviceCollection craftarondevicecollection, float f);

	public abstract void syncSuccessful(CraftAROnDeviceCollection craftarondevicecollection);
}
