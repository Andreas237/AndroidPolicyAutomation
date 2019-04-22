// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection, Tag, Path

public static interface PersistentConnection$Delegate
{

	public abstract void onAuthStatus(boolean flag);

	public abstract void onConnect();

	public abstract void onDataUpdate(String s, Object obj, boolean flag, Tag tag);

	public abstract void onDisconnect();

	public abstract void onRangeMergeUpdate(Path path, List list, Tag tag);

	public abstract void onServerInfoUpdate(Map map);
}
