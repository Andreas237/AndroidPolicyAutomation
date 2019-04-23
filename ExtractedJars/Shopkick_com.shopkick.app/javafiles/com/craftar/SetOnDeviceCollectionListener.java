// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.List;

// Referenced classes of package com.craftar:
//			SetCollectionListener

public interface SetOnDeviceCollectionListener
	extends SetCollectionListener
{

	public abstract void collectionReady(List list);

	public abstract void setCollectionProgress(double d);
}
