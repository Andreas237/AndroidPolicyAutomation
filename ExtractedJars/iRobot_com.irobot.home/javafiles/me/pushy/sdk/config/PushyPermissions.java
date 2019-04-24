// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package me.pushy.sdk.config;


public class PushyPermissions
{

	public PushyPermissions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static final String REQUIRED_MANIFEST_PERMISSIONS[] = {
		"android.permission.INTERNET", "android.permission.WAKE_LOCK", "android.permission.ACCESS_NETWORK_STATE", "android.permission.RECEIVE_BOOT_COMPLETED"
	};

	static 
	{
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #12  <String "android.permission.INTERNET">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #14  <String "android.permission.WAKE_LOCK">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #16  <String "android.permission.ACCESS_NETWORK_STATE">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #18  <String "android.permission.RECEIVE_BOOT_COMPLETED">
	//   17   23:aastore         
	//   18   24:putstatic       #20  <Field String[] REQUIRED_MANIFEST_PERMISSIONS>
	//*  19   27:return          
	}
}
