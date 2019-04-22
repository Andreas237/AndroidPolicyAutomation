// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

public class MergePaths
{
	static class Factory
	{

		static MergePaths newInstance(JSONObject jsonobject)
		{
			return new MergePaths(jsonobject.optString("nm"), MergePathsMode.forId(jsonobject.optInt("mm", 1)));
		//    0    0:new             #6   <Class MergePaths>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:ldc1            #11  <String "nm">
		//    4    7:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//    5   10:aload_0         
		//    6   11:ldc1            #19  <String "mm">
		//    7   13:iconst_1        
		//    8   14:invokevirtual   #23  <Method int JSONObject.optInt(String, int)>
		//    9   17:invokestatic    #29  <Method MergePaths$MergePathsMode MergePaths$MergePathsMode.access$000(int)>
		//   10   20:aconst_null     
		//   11   21:invokespecial   #33  <Method void MergePaths(String, MergePaths$MergePathsMode, MergePaths$1)>
		//   12   24:areturn         
		}
	}

	static final class MergePathsMode extends Enum
	{

		private static MergePathsMode forId(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 5: default 36
		//		               1 56
		//		               2 52
		//		               3 48
		//		               4 44
		//		               5 40
			default:
				return Merge;
		//    2   36:getstatic       #25  <Field MergePaths$MergePathsMode Merge>
		//    3   39:areturn         

			case 5: // '\005'
				return ExcludeIntersections;
		//    4   40:getstatic       #37  <Field MergePaths$MergePathsMode ExcludeIntersections>
		//    5   43:areturn         

			case 4: // '\004'
				return Intersect;
		//    6   44:getstatic       #34  <Field MergePaths$MergePathsMode Intersect>
		//    7   47:areturn         

			case 3: // '\003'
				return Subtract;
		//    8   48:getstatic       #31  <Field MergePaths$MergePathsMode Subtract>
		//    9   51:areturn         

			case 2: // '\002'
				return Add;
		//   10   52:getstatic       #28  <Field MergePaths$MergePathsMode Add>
		//   11   55:areturn         

			case 1: // '\001'
				return Merge;
		//   12   56:getstatic       #25  <Field MergePaths$MergePathsMode Merge>
		//   13   59:areturn         
			}
		}

		public static MergePathsMode valueOf(String s)
		{
			return (MergePathsMode)Enum.valueOf(com/airbnb/lottie/MergePaths$MergePathsMode, s);
		//    0    0:ldc1            #2   <Class MergePaths$MergePathsMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MergePaths$MergePathsMode>
		//    4    9:areturn         
		}

		public static MergePathsMode[] values()
		{
			return (MergePathsMode[])((MergePathsMode []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field MergePaths$MergePathsMode[] $VALUES>
		//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.airbnb.lottie.MergePaths$MergePathsMode_3B_.clone()>
		//    2    6:checkcast       #55  <Class MergePaths$MergePathsMode[]>
		//    3    9:areturn         
		}

		private static final MergePathsMode $VALUES[];
		public static final MergePathsMode Add;
		public static final MergePathsMode ExcludeIntersections;
		public static final MergePathsMode Intersect;
		public static final MergePathsMode Merge;
		public static final MergePathsMode Subtract;

		static 
		{
			Merge = new MergePathsMode("Merge", 0);
		//    0    0:new             #2   <Class MergePaths$MergePathsMode>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "Merge">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void MergePaths$MergePathsMode(String, int)>
		//    5   10:putstatic       #25  <Field MergePaths$MergePathsMode Merge>
			Add = new MergePathsMode("Add", 1);
		//    6   13:new             #2   <Class MergePaths$MergePathsMode>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "Add">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void MergePaths$MergePathsMode(String, int)>
		//   11   23:putstatic       #28  <Field MergePaths$MergePathsMode Add>
			Subtract = new MergePathsMode("Subtract", 2);
		//   12   26:new             #2   <Class MergePaths$MergePathsMode>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "Subtract">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void MergePaths$MergePathsMode(String, int)>
		//   17   36:putstatic       #31  <Field MergePaths$MergePathsMode Subtract>
			Intersect = new MergePathsMode("Intersect", 3);
		//   18   39:new             #2   <Class MergePaths$MergePathsMode>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "Intersect">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void MergePaths$MergePathsMode(String, int)>
		//   23   49:putstatic       #34  <Field MergePaths$MergePathsMode Intersect>
			ExcludeIntersections = new MergePathsMode("ExcludeIntersections", 4);
		//   24   52:new             #2   <Class MergePaths$MergePathsMode>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "ExcludeIntersections">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void MergePaths$MergePathsMode(String, int)>
		//   29   62:putstatic       #37  <Field MergePaths$MergePathsMode ExcludeIntersections>
			$VALUES = (new MergePathsMode[] {
				Merge, Add, Subtract, Intersect, ExcludeIntersections
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       MergePathsMode[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field MergePaths$MergePathsMode Merge>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field MergePaths$MergePathsMode Add>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field MergePaths$MergePathsMode Subtract>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field MergePaths$MergePathsMode Intersect>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field MergePaths$MergePathsMode ExcludeIntersections>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field MergePaths$MergePathsMode[] $VALUES>
		//*  53  102:return          
		}


/*
		static MergePathsMode access$000(int i)
		{
			return forId(i);
		//    0    0:iload_0         
		//    1    1:invokestatic    #47  <Method MergePaths$MergePathsMode forId(int)>
		//    2    4:areturn         
		}

*/

		private MergePathsMode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private MergePaths(String s, MergePathsMode mergepathsmode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String name>
		mode = mergepathsmode;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field MergePaths$MergePathsMode mode>
	//    8   14:return          
	}


	MergePathsMode getMode()
	{
		return mode;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MergePaths$MergePathsMode mode>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String name>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MergePaths{mode=");
	//    4    8:aload_1         
	//    5    9:ldc1            #39  <String "MergePaths{mode=">
	//    6   11:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mode)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field MergePaths$MergePathsMode mode>
	//   11   20:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append('}');
	//   13   24:aload_1         
	//   14   25:bipush          125
	//   15   27:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private final MergePathsMode mode;
	private final String name;
}
