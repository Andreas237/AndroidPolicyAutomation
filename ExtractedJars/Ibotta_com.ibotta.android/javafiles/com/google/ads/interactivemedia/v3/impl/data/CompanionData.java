// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl.data;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl.data:
//			f

public abstract class CompanionData
{
	public static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/google/ads/interactivemedia/v3/impl/data/CompanionData$a, s);
		//    0    0:ldc1            #2   <Class CompanionData$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CompanionData$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field CompanionData$a[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.google.ads.interactivemedia.v3.impl.data.CompanionData$a_3B_.clone()>
		//    2    6:checkcast       #42  <Class CompanionData$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a Html;
		public static final a IFrame;
		public static final a Static;

		static 
		{
			Html = new a("Html", 0);
		//    0    0:new             #2   <Class CompanionData$a>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "Html">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void CompanionData$a(String, int)>
		//    5   10:putstatic       #23  <Field CompanionData$a Html>
			Static = new a("Static", 1);
		//    6   13:new             #2   <Class CompanionData$a>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "Static">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void CompanionData$a(String, int)>
		//   11   23:putstatic       #26  <Field CompanionData$a Static>
			IFrame = new a("IFrame", 2);
		//   12   26:new             #2   <Class CompanionData$a>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "IFrame">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void CompanionData$a(String, int)>
		//   17   36:putstatic       #29  <Field CompanionData$a IFrame>
			$VALUES = (new a[] {
				Html, Static, IFrame
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       a[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field CompanionData$a Html>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field CompanionData$a Static>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field CompanionData$a IFrame>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field CompanionData$a[] $VALUES>
		//*  33   64:return          
		}

		private a(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public CompanionData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static CompanionData create(String s, String s1, String s2, a a1)
	{
		return ((CompanionData) (new f(s, s1, s2, a1)));
	//    0    0:new             #20  <Class f>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #23  <Method void f(String, String, String, CompanionData$a)>
	//    7   11:areturn         
	}

	public static CompanionData create(String s, String s1, String s2, String s3, a a1)
	{
		s1 = ((String) (create(s1, s2, s3, a1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokestatic    #26  <Method CompanionData create(String, String, String, CompanionData$a)>
	//    5    8:astore_1        
		s1.companionId = s;
	//    6    9:aload_1         
	//    7   10:aload_0         
	//    8   11:putfield        #28  <Field String companionId>
		return ((CompanionData) (s1));
	//    9   14:aload_1         
	//   10   15:areturn         
	}

	public abstract String clickThroughUrl();

	public String companionId()
	{
		return companionId;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String companionId>
	//    2    4:areturn         
	}

	public abstract String size();

	public abstract String src();

	public String toString()
	{
		String s = String.valueOf(((Object) (companionId())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method String companionId()>
	//    2    4:invokestatic    #41  <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		String s1 = String.valueOf(((Object) (size())));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #43  <Method String size()>
	//    6   12:invokestatic    #41  <Method String String.valueOf(Object)>
	//    7   15:astore_2        
		String s2 = String.valueOf(((Object) (src())));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #45  <Method String src()>
	//   10   20:invokestatic    #41  <Method String String.valueOf(Object)>
	//   11   23:astore_3        
		String s3 = String.valueOf(((Object) (clickThroughUrl())));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #47  <Method String clickThroughUrl()>
	//   14   28:invokestatic    #41  <Method String String.valueOf(Object)>
	//   15   31:astore          4
		String s4 = String.valueOf(((Object) (type())));
	//   16   33:aload_0         
	//   17   34:invokevirtual   #51  <Method CompanionData$a type()>
	//   18   37:invokestatic    #41  <Method String String.valueOf(Object)>
	//   19   40:astore          5
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 66 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length() + String.valueOf(((Object) (s4))).length());
	//   20   42:new             #53  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:invokestatic    #41  <Method String String.valueOf(Object)>
	//   24   50:invokevirtual   #57  <Method int String.length()>
	//   25   53:bipush          66
	//   26   55:iadd            
	//   27   56:aload_2         
	//   28   57:invokestatic    #41  <Method String String.valueOf(Object)>
	//   29   60:invokevirtual   #57  <Method int String.length()>
	//   30   63:iadd            
	//   31   64:aload_3         
	//   32   65:invokestatic    #41  <Method String String.valueOf(Object)>
	//   33   68:invokevirtual   #57  <Method int String.length()>
	//   34   71:iadd            
	//   35   72:aload           4
	//   36   74:invokestatic    #41  <Method String String.valueOf(Object)>
	//   37   77:invokevirtual   #57  <Method int String.length()>
	//   38   80:iadd            
	//   39   81:aload           5
	//   40   83:invokestatic    #41  <Method String String.valueOf(Object)>
	//   41   86:invokevirtual   #57  <Method int String.length()>
	//   42   89:iadd            
	//   43   90:invokespecial   #60  <Method void StringBuilder(int)>
	//   44   93:astore          6
		stringbuilder.append("CompanionData [companionId=");
	//   45   95:aload           6
	//   46   97:ldc1            #62  <String "CompanionData [companionId=">
	//   47   99:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
		stringbuilder.append(s);
	//   49  103:aload           6
	//   50  105:aload_1         
	//   51  106:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   52  109:pop             
		stringbuilder.append(", size=");
	//   53  110:aload           6
	//   54  112:ldc1            #68  <String ", size=">
	//   55  114:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   56  117:pop             
		stringbuilder.append(s1);
	//   57  118:aload           6
	//   58  120:aload_2         
	//   59  121:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   60  124:pop             
		stringbuilder.append(", src=");
	//   61  125:aload           6
	//   62  127:ldc1            #70  <String ", src=">
	//   63  129:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   64  132:pop             
		stringbuilder.append(s2);
	//   65  133:aload           6
	//   66  135:aload_3         
	//   67  136:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   68  139:pop             
		stringbuilder.append(", clickThroughUrl=");
	//   69  140:aload           6
	//   70  142:ldc1            #72  <String ", clickThroughUrl=">
	//   71  144:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   72  147:pop             
		stringbuilder.append(s3);
	//   73  148:aload           6
	//   74  150:aload           4
	//   75  152:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   76  155:pop             
		stringbuilder.append(", type=");
	//   77  156:aload           6
	//   78  158:ldc1            #74  <String ", type=">
	//   79  160:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
		stringbuilder.append(s4);
	//   81  164:aload           6
	//   82  166:aload           5
	//   83  168:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   84  171:pop             
		stringbuilder.append("]");
	//   85  172:aload           6
	//   86  174:ldc1            #76  <String "]">
	//   87  176:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   88  179:pop             
		return stringbuilder.toString();
	//   89  180:aload           6
	//   90  182:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   91  185:areturn         
	}

	public abstract a type();

	private String companionId;
}
