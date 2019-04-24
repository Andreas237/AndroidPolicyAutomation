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
		boolean flag;
		boolean flag1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		JsonAutoDetect._cls1.$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[ordinal()];
	//    4    4:getstatic       #66  <Field int[] JsonAutoDetect$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//    5    7:aload_0         
	//    6    8:invokevirtual   #70  <Method int ordinal()>
	//    7   11:iaload          
		JVM INSTR tableswitch 1 5: default 48
	//	               1 50
	//	               2 52
	//	               3 54
	//	               4 70
	//	               5 84;
	//    8   12:tableswitch     1 5: default 48
	//	               1 50
	//	               2 52
	//	               3 54
	//	               4 70
	//	               5 84
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
		break MISSING_BLOCK_LABEL_50;
_L1:
		flag = false;
	//    9   48:iconst_0        
	//   10   49:istore_2        
_L8:
		return flag;
	//   11   50:iload_2         
	//   12   51:ireturn         
_L3:
		return false;
	//   13   52:iconst_0        
	//   14   53:ireturn         
_L4:
		flag = flag1;
	//   15   54:iload_3         
	//   16   55:istore_2        
		if(!Modifier.isPrivate(member.getModifiers())) goto _L8; else goto _L7
	//   17   56:aload_1         
	//   18   57:invokeinterface #75  <Method int Member.getModifiers()>
	//   19   62:invokestatic    #81  <Method boolean Modifier.isPrivate(int)>
	//   20   65:ifeq            50
_L7:
		return false;
	//   21   68:iconst_0        
	//   22   69:ireturn         
_L5:
		flag = flag1;
	//   23   70:iload_3         
	//   24   71:istore_2        
		if(Modifier.isProtected(member.getModifiers())) goto _L8; else goto _L6
	//   25   72:aload_1         
	//   26   73:invokeinterface #75  <Method int Member.getModifiers()>
	//   27   78:invokestatic    #84  <Method boolean Modifier.isProtected(int)>
	//   28   81:ifne            50
_L6:
		return Modifier.isPublic(member.getModifiers());
	//   29   84:aload_1         
	//   30   85:invokeinterface #75  <Method int Member.getModifiers()>
	//   31   90:invokestatic    #87  <Method boolean Modifier.isPublic(int)>
	//   32   93:ireturn         
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
