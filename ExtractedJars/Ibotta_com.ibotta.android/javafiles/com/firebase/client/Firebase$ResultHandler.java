// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;


// Referenced classes of package com.firebase.client:
//			Firebase, FirebaseError

public static interface Firebase$ResultHandler
{

	public abstract void onError(FirebaseError firebaseerror);

	public abstract void onSuccess();
}
