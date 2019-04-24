// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


public final class SettingsCacheBehavior extends Enum
{

	private SettingsCacheBehavior(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static SettingsCacheBehavior valueOf(String s)
	{
		return (SettingsCacheBehavior)Enum.valueOf(io/fabric/sdk/android/services/settings/SettingsCacheBehavior, s);
	//    0    0:ldc1            #2   <Class SettingsCacheBehavior>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SettingsCacheBehavior>
	//    4    9:areturn         
	}

	public static SettingsCacheBehavior[] values()
	{
		return (SettingsCacheBehavior[])((SettingsCacheBehavior []) ($VALUES)).clone();
	//    0    0:getstatic       #28  <Field SettingsCacheBehavior[] $VALUES>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lio.fabric.sdk.android.services.settings.SettingsCacheBehavior_3B_.clone()>
	//    2    6:checkcast       #39  <Class SettingsCacheBehavior[]>
	//    3    9:areturn         
	}

	private static final SettingsCacheBehavior $VALUES[];
	public static final SettingsCacheBehavior IGNORE_CACHE_EXPIRATION;
	public static final SettingsCacheBehavior SKIP_CACHE_LOOKUP;
	public static final SettingsCacheBehavior USE_CACHE;

	static 
	{
		USE_CACHE = new SettingsCacheBehavior("USE_CACHE", 0);
	//    0    0:new             #2   <Class SettingsCacheBehavior>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "USE_CACHE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void SettingsCacheBehavior(String, int)>
	//    5   10:putstatic       #20  <Field SettingsCacheBehavior USE_CACHE>
		SKIP_CACHE_LOOKUP = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
	//    6   13:new             #2   <Class SettingsCacheBehavior>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "SKIP_CACHE_LOOKUP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void SettingsCacheBehavior(String, int)>
	//   11   23:putstatic       #23  <Field SettingsCacheBehavior SKIP_CACHE_LOOKUP>
		IGNORE_CACHE_EXPIRATION = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
	//   12   26:new             #2   <Class SettingsCacheBehavior>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "IGNORE_CACHE_EXPIRATION">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void SettingsCacheBehavior(String, int)>
	//   17   36:putstatic       #26  <Field SettingsCacheBehavior IGNORE_CACHE_EXPIRATION>
		$VALUES = (new SettingsCacheBehavior[] {
			USE_CACHE, SKIP_CACHE_LOOKUP, IGNORE_CACHE_EXPIRATION
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       SettingsCacheBehavior[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field SettingsCacheBehavior USE_CACHE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field SettingsCacheBehavior SKIP_CACHE_LOOKUP>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field SettingsCacheBehavior IGNORE_CACHE_EXPIRATION>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field SettingsCacheBehavior[] $VALUES>
	//*  33   64:return          
	}
}
