// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			SyncTree, CompoundHash

public static interface SyncTree$SyncTreeHash
{

	public abstract CompoundHash getCompoundHash();

	public abstract String getSimpleHash();

	public abstract boolean shouldIncludeCompoundHash();
}
