// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


// Referenced classes of package com.digits.sdk.android:
//			ContactsClient, ContactsCallback, Vcards, UploadResponse

static interface ContactsClient$ContactsService
{

	public abstract void deleteAll(ContactsCallback contactscallback);

	public abstract UploadResponse upload(Vcards vcards);

	public abstract void usersAndUploadedBy(String s, Integer integer, ContactsCallback contactscallback);
}
