// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import java.io.Serializable;

public class SDKAdPreferences
	implements Serializable
{
	public static final class Gender extends Enum
	{

		public static Gender parseString(String s)
		{
			Gender agender[] = values();
		//    0    0:invokestatic    #47  <Method SDKAdPreferences$Gender[] values()>
		//    1    3:astore_3        
			int j = agender.length;
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
				Gender gender1 = agender[i];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(gender1.getGender().equals(((Object) (s))))
		//*  14   19:aload           4
		//*  15   21:invokevirtual   #51  <Method String getGender()>
		//*  16   24:aload_0         
		//*  17   25:invokevirtual   #57  <Method boolean String.equals(Object)>
		//*  18   28:ifeq            34
					return gender1;
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

		public static Gender valueOf(String s)
		{
			return (Gender)Enum.valueOf(com/startapp/android/publish/adsCommon/SDKAdPreferences$Gender, s);
		//    0    0:ldc1            #2   <Class SDKAdPreferences$Gender>
		//    1    2:aload_0         
		//    2    3:invokestatic    #61  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SDKAdPreferences$Gender>
		//    4    9:areturn         
		}

		public static Gender[] values()
		{
			return (Gender[])((Gender []) ($VALUES)).clone();
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

		private static final Gender $VALUES[];
		public static final Gender FEMALE;
		public static final Gender MALE;
		private String gender;

		static 
		{
			MALE = new Gender("MALE", 0, "m");
		//    0    0:new             #2   <Class SDKAdPreferences$Gender>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "MALE">
		//    3    6:iconst_0        
		//    4    7:ldc1            #20  <String "m">
		//    5    9:invokespecial   #24  <Method void SDKAdPreferences$Gender(String, int, String)>
		//    6   12:putstatic       #26  <Field SDKAdPreferences$Gender MALE>
			FEMALE = new Gender("FEMALE", 1, "f");
		//    7   15:new             #2   <Class SDKAdPreferences$Gender>
		//    8   18:dup             
		//    9   19:ldc1            #27  <String "FEMALE">
		//   10   21:iconst_1        
		//   11   22:ldc1            #29  <String "f">
		//   12   24:invokespecial   #24  <Method void SDKAdPreferences$Gender(String, int, String)>
		//   13   27:putstatic       #31  <Field SDKAdPreferences$Gender FEMALE>
			$VALUES = (new Gender[] {
				MALE, FEMALE
			});
		//   14   30:iconst_2        
		//   15   31:anewarray       Gender[]
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

		private Gender(String s, int i, String s1)
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


	public SDKAdPreferences()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		gender = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field SDKAdPreferences$Gender gender>
		age = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field String age>
	//    8   14:return          
	}

	public String getAge()
	{
		return age;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String age>
	//    2    4:areturn         
	}

	public Gender getGender()
	{
		return gender;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SDKAdPreferences$Gender gender>
	//    2    4:areturn         
	}

	public SDKAdPreferences setAge(int i)
	{
		age = Integer.toString(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #38  <Method String Integer.toString(int)>
	//    3    5:putfield        #25  <Field String age>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SDKAdPreferences setAge(String s)
	{
		age = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String age>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SDKAdPreferences setGender(Gender gender1)
	{
		gender = gender1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field SDKAdPreferences$Gender gender>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("SDKAdPreferences [gender=").append(((Object) (gender))).append(", age=").append(age).append("]").toString();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:ldc1            #46  <String "SDKAdPreferences [gender=">
	//    4    9:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field SDKAdPreferences$Gender gender>
	//    7   16:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #55  <String ", age=">
	//    9   21:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #25  <Field String age>
	//   12   28:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #57  <String "]">
	//   14   33:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	private static final long serialVersionUID = 1L;
	private String age;
	private Gender gender;
}
