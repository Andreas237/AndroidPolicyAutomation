// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.securestorage;


public final class SecureStorageJNI
{

	private SecureStorageJNI()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static SecureStorageJNI getInstance()
	{
		return secureStorage;
	//    0    0:getstatic       #13  <Field SecureStorageJNI secureStorage>
	//    1    3:areturn         
	}

	public native byte[] decrypt(byte abyte0[]);

	public native byte[] decrypt(byte abyte0[], String s);

	public native boolean delete(String s);

	public native byte[] encrypt(byte abyte0[]);

	public native byte[] encrypt(byte abyte0[], String s);

	public native byte[] get(String s);

	public native byte[] get(String s, String s1);

	public native int getVersion();

	public native int initialize();

	public native boolean isSupported();

	public native boolean put(String s, byte abyte0[]);

	public native boolean put(String s, byte abyte0[], String s1);

	private static SecureStorageJNI secureStorage = new SecureStorageJNI();

	static 
	{
	//    0    0:new             #2   <Class SecureStorageJNI>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void SecureStorageJNI()>
	//    3    7:putstatic       #13  <Field SecureStorageJNI secureStorage>
		System.loadLibrary("secure_storage_jni");
	//    4   10:ldc1            #15  <String "secure_storage_jni">
	//    5   12:invokestatic    #21  <Method void System.loadLibrary(String)>
	//*   6   15:return          
	}
}
