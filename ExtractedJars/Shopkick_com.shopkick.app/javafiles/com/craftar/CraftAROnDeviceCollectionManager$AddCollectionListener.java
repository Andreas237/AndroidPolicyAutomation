// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollectionManager, CraftARError, CraftAROnDeviceCollection

public static interface CraftAROnDeviceCollectionManager$AddCollectionListener
{

	public abstract void addCollectionFailed(CraftARError craftarerror);

	public abstract void addCollectionProgress(float f);

	public abstract void collectionAdded(CraftAROnDeviceCollection craftarondevicecollection);
}
