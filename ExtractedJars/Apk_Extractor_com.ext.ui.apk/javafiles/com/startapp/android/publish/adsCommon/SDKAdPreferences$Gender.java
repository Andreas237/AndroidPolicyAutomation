// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;


// Referenced classes of package com.startapp.android.publish.adsCommon:
//			SDKAdPreferences

public static final class SDKAdPreferences$Gender extends Enum
{

	public static SDKAdPreferences$Gender parseString(String s)
	{
		SDKAdPreferences$Gender asdkadpreferences$gender[] = values();
	//    0    0:invokestatic    #47  <Method SDKAdPreferences$Gender[] values()>
	//    1    3:astore_3        
		int j = asdkadpreferences$gender.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          41
		{
			SDKAdPreferences$Gender sdkadpreferences$gender = asdkadpreferences$gender[i];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(sdkadpreferences$gender.getGender().equals(((Object) (s))))
	//*  14   19:aload           4
	//*  15   21:invokevirtual   #51  <Method String getGender()>
	//*  16   24:aload_0         
	//*  17   25:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  18   28:ifeq            34
				return sdkadpreferences$gender;
	//   19   31:aload           4
	//   20   33:areturn         
		}

	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_1        
	//*  25   38:goto            9
		return null;
	//   26   41:aconst_null     
	//   27   42:areturn         
	}

	public static SDKAdPreferences$Gender valueOf(String s)
	{
		return (SDKAdPreferences$Gender)Enum.valueOf(com/startapp/android/publish/adsCommon/SDKAdPreferences$Gender, s);
	//    0    0:ldc1            #2   <Class SDKAdPreferences$Gender>
	//    1    2:aload_0         
	//    2    3:invokestatic    #61  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SDKAdPreferences$Gender>
	//    4    9:areturn         
	}

	public static SDKAdPreferences$Gender[] values()
	{
		return (SDKAdPreferences$Gender[])((SDKAdPreferences$Gender []) ($VALUES)).clone();
	//    0    0:getstatic       #33  <Field SDKAdPreferences$Gender[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.startapp.android.publish.adsCommon.SDKAdPreferences$Gender_3B_.clone()>
	//    2    6:checkcast       #62  <Class SDKAdPreferences$Gender[]>
	//    3    9:areturn         
	}

	public String getGender()
	{
		return gender;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String gender>
	//    2    4:areturn         
	}

	public String toString()
	{
		return getGender();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method String getGender()>
	//    2    4:areturn         
	}

	private static final SDKAdPreferences$Gender $VALUES[];
	public static final SDKAdPreferences$Gender FEMALE;
	public static final SDKAdPreferences$Gender MALE;
	private String gender;

	static 
	{
		MALE = new SDKAdPreferences$Gender("MALE", 0, "m");
	//    0    0:new             #2   <Class SDKAdPreferences$Gender>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "MALE">
	//    3    6:iconst_0        
	//    4    7:ldc1            #20  <String "m">
	//    5    9:invokespecial   #24  <Method void SDKAdPreferences$Gender(String, int, String)>
	//    6   12:putstatic       #26  <Field SDKAdPreferences$Gender MALE>
		FEMALE = new SDKAdPreferences$Gender("FEMALE", 1, "f");
	//    7   15:new             #2   <Class SDKAdPreferences$Gender>
	//    8   18:dup             
	//    9   19:ldc1            #27  <String "FEMALE">
	//   10   21:iconst_1        
	//   11   22:ldc1            #29  <String "f">
	//   12   24:invokespecial   #24  <Method void SDKAdPreferences$Gender(String, int, String)>
	//   13   27:putstatic       #31  <Field SDKAdPreferences$Gender FEMALE>
		$VALUES = (new SDKAdPreferences$Gender[] {
			MALE, FEMALE
		});
	//   14   30:iconst_2        
	//   15   31:anewarray       SDKAdPreferences$Gender[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:getstatic       #26  <Field SDKAdPreferences$Gender MALE>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:getstatic       #31  <Field SDKAdPreferences$Gender FEMALE>
	//   23   45:aastore         
	//   24   46:putstatic       #33  <Field SDKAdPreferences$Gender[] $VALUES>
	//*  25   49:return          
	}

	private SDKAdPreferences$Gender(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		gender = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #39  <Field String gender>
	//    7   11:return          
	}
}
