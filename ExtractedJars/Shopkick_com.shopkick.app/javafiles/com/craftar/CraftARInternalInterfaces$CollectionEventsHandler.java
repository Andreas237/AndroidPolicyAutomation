// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARInternalInterfaces, CraftAROnDeviceCollection

static interface CraftARInternalInterfaces$CollectionEventsHandler
{

	public abstract void onCollectionAdded(CraftAROnDeviceCollection craftarondevicecollection);

	public abstract void onCollectionDeleted(String s);

	public abstract void onCollectionModified(CraftAROnDeviceCollection craftarondevicecollection);
}
