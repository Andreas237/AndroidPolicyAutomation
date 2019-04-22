// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

static interface PersistentConnection$RequestResultListener
{

	public abstract void onRequestResult(FirebaseError firebaseerror);
}
