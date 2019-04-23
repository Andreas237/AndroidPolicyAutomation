// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftAROnDeviceCollection

class CraftARInternalInterfaces
{
	static interface CollectionEventsHandler
	{

		public abstract void onCollectionAdded(CraftAROnDeviceCollection craftarondevicecollection);

		public abstract void onCollectionDeleted(String s);

		public abstract void onCollectionModified(CraftAROnDeviceCollection craftarondevicecollection);
	}


	CraftARInternalInterfaces()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
