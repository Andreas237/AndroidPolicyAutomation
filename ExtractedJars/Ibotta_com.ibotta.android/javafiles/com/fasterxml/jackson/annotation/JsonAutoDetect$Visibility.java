// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonAutoDetect

public static final class JsonAutoDetect$Visibility extends Enum
{

	public static JsonAutoDetect$Visibility valueOf(String s)
	{
		return (JsonAutoDetect$Visibility)Enum.valueOf(com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility, s);
	//    0    0:ldc1            #2   <Class JsonAutoDetect$Visibility>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonAutoDetect$Visibility>
	//    4    9:areturn         
	}

	public static JsonAutoDetect$Visibility[] values()
	{
		return (JsonAutoDetect$Visibility[])((JsonAutoDetect$Visibility []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field JsonAutoDetect$Visibility[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonAutoDetect$Visibility_3B_.clone()>
	//    2    6:checkcast       #54  <Class JsonAutoDetect$Visibility[]>
	//    3    9:areturn         
	}

	public boolean isVisible(Member member)
	{
		switch(JsonAutoDetect._cls1.$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[ordinal()])
	//*   0    0:getstatic       #66  <Field int[] JsonAutoDetect$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #70  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 84
	//	               2 82
	//	               3 70
	//	               4 46
	//	               5 60
		default:
			return false;
	//    5   44:iconst_0        
	//    6   45:ireturn         

		case 4: // '\004'
			if(Modifier.isProtected(member.getModifiers()))
	//*   7   46:aload_1         
	//*   8   47:invokeinterface #75  <Method int Member.getModifiers()>
	//*   9   52:invokestatic    #81  <Method boolean Modifier.isProtected(int)>
	//*  10   55:ifeq            60
				return true;
	//   11   58:iconst_1        
	//   12   59:ireturn         
			// fall through

		case 5: // '\005'
			return Modifier.isPublic(member.getModifiers());
	//   13   60:aload_1         
	//   14   61:invokeinterface #75  <Method int Member.getModifiers()>
	//   15   66:invokestatic    #84  <Method boolean Modifier.isPublic(int)>
	//   16   69:ireturn         

		case 3: // '\003'
			return Modifier.isPrivate(member.getModifiers()) ^ true;
	//   17   70:aload_1         
	//   18   71:invokeinterface #75  <Method int Member.getModifiers()>
	//   19   76:invokestatic    #87  <Method boolean Modifier.isPrivate(int)>
	//   20   79:iconst_1        
	//   21   80:ixor            
	//   22   81:ireturn         

		case 2: // '\002'
			return false;
	//   23   82:iconst_0        
	//   24   83:ireturn         

		case 1: // '\001'
			return true;
	//   25   84:iconst_1        
	//   26   85:ireturn         
		}
	}

	private static final JsonAutoDetect$Visibility $VALUES[];
	public static final JsonAutoDetect$Visibility ANY;
	public static final JsonAutoDetect$Visibility DEFAULT;
	public static final JsonAutoDetect$Visibility NONE;
	public static final JsonAutoDetect$Visibility NON_PRIVATE;
	public static final JsonAutoDetect$Visibility PROTECTED_AND_PUBLIC;
	public static final JsonAutoDetect$Visibility PUBLIC_ONLY;

	static 
	{
		ANY = new JsonAutoDetect$Visibility("ANY", 0);
	//    0    0:new             #2   <Class JsonAutoDetect$Visibility>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "ANY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
	//    5   10:putstatic       #26  <Field JsonAutoDetect$Visibility ANY>
		NON_PRIVATE = new JsonAutoDetect$Visibility("NON_PRIVATE", 1);
	//    6   13:new             #2   <Class JsonAutoDetect$Visibility>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "NON_PRIVATE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
	//   11   23:putstatic       #29  <Field JsonAutoDetect$Visibility NON_PRIVATE>
		PROTECTED_AND_PUBLIC = new JsonAutoDetect$Visibility("PROTECTED_AND_PUBLIC", 2);
	//   12   26:new             #2   <Class JsonAutoDetect$Visibility>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "PROTECTED_AND_PUBLIC">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
	//   17   36:putstatic       #32  <Field JsonAutoDetect$Visibility PROTECTED_AND_PUBLIC>
		PUBLIC_ONLY = new JsonAutoDetect$Visibility("PUBLIC_ONLY", 3);
	//   18   39:new             #2   <Class JsonAutoDetect$Visibility>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "PUBLIC_ONLY">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
	//   23   49:putstatic       #35  <Field JsonAutoDetect$Visibility PUBLIC_ONLY>
		NONE = new JsonAutoDetect$Visibility("NONE", 4);
	//   24   52:new             #2   <Class JsonAutoDetect$Visibility>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "NONE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
	//   29   62:putstatic       #38  <Field JsonAutoDetect$Visibility NONE>
		DEFAULT = new JsonAutoDetect$Visibility("DEFAULT", 5);
	//   30   65:new             #2   <Class JsonAutoDetect$Visibility>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "DEFAULT">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
	//   35   75:putstatic       #41  <Field JsonAutoDetect$Visibility DEFAULT>
		$VALUES = (new JsonAutoDetect$Visibility[] {
			ANY, NON_PRIVATE, PROTECTED_AND_PUBLIC, PUBLIC_ONLY, NONE, DEFAULT
		});
	//   36   78:bipush          6
	//   37   80:anewarray       JsonAutoDetect$Visibility[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field JsonAutoDetect$Visibility ANY>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field JsonAutoDetect$Visibility NON_PRIVATE>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field JsonAutoDetect$Visibility PROTECTED_AND_PUBLIC>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field JsonAutoDetect$Visibility PUBLIC_ONLY>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field JsonAutoDetect$Visibility NONE>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field JsonAutoDetect$Visibility DEFAULT>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field JsonAutoDetect$Visibility[] $VALUES>
	//*  63  122:return          
	}

	private JsonAutoDetect$Visibility(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
