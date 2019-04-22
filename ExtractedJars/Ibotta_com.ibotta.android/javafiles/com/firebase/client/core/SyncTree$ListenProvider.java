// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.view.QuerySpec;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, Tag

public static interface SyncTree$ListenProvider
{

	public abstract void startListening(QuerySpec queryspec, Tag tag, SyncTree.SyncTreeHash synctreehash, ner ner);

	public abstract void stopListening(QuerySpec queryspec, Tag tag);
}
