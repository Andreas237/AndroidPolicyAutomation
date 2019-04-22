// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;


// Referenced classes of package com.firebase.client:
//			FirebaseError, DataSnapshot

public interface ChildEventListener
{

	public abstract void onCancelled(FirebaseError firebaseerror);

	public abstract void onChildAdded(DataSnapshot datasnapshot, String s);

	public abstract void onChildChanged(DataSnapshot datasnapshot, String s);

	public abstract void onChildMoved(DataSnapshot datasnapshot, String s);

	public abstract void onChildRemoved(DataSnapshot datasnapshot);
}
