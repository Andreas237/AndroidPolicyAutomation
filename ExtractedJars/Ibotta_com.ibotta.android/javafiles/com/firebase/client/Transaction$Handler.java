// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;


// Referenced classes of package com.firebase.client:
//			Transaction, MutableData, FirebaseError, DataSnapshot

public static interface Transaction$Handler
{

	public abstract Transaction.Result doTransaction(MutableData mutabledata);

	public abstract void onComplete(FirebaseError firebaseerror, boolean flag, DataSnapshot datasnapshot);
}
