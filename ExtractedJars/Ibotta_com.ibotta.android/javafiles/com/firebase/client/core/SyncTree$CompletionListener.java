// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			SyncTree

public static interface SyncTree$CompletionListener
{

	public abstract List onListenComplete(FirebaseError firebaseerror);
}
