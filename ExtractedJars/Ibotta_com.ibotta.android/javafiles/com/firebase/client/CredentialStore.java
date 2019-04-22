// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;


public interface CredentialStore
{

	public abstract boolean clearCredential(String s, String s1);

	public abstract String loadCredential(String s, String s1);

	public abstract boolean storeCredential(String s, String s1, String s2);
}
