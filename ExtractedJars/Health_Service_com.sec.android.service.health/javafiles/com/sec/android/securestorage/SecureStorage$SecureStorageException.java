// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.securestorage;


// Referenced classes of package com.sec.android.securestorage:
//			SecureStorage

public static class SecureStorage$SecureStorageException extends Exception
{

	public static final String ERROR_INPUT_DATA_NAME = "Error input data name";
	public static final String ERROR_NULL_DATA_BLOCK = "Error: data block is null";
	public static final String ERROR_NULL_PASSWORD = "Error: password is null!";
	public static final String ERROR_PUT_DATA = "Error saving data";
	public static final String SECURE_STORAGE_ERROR_ENCRYPTION = "Encryption error";
	public static final String SECURE_STORAGE_ERROR_INPUT_DATA = "Error: input data are incorrect";
	private static final long serialVersionUID = 1L;

	public SecureStorage$SecureStorageException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Exception()>
	//    2    4:return          
	}

	public SecureStorage$SecureStorageException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void Exception(String)>
	//    3    5:return          
	}
}
