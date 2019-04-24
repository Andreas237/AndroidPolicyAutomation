// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.exception;


// Referenced classes of package cn.com.fmsh.script.exception:
//			FMScriptHandleException

public static final class FMScriptHandleException$ScriptHandleExceptionType extends Enum
{

	public static FMScriptHandleException$ScriptHandleExceptionType valueOf(String s)
	{
		return (FMScriptHandleException$ScriptHandleExceptionType)Enum.valueOf(cn/com/fmsh/script/exception/FMScriptHandleException$ScriptHandleExceptionType, s);
	//    0    0:ldc1            #2   <Class FMScriptHandleException$ScriptHandleExceptionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class FMScriptHandleException$ScriptHandleExceptionType>
	//    4    9:areturn         
	}

	public static FMScriptHandleException$ScriptHandleExceptionType[] values()
	{
		FMScriptHandleException$ScriptHandleExceptionType afmscripthandleexception$scripthandleexceptiontype[] = ENUM$VALUES;
	//    0    0:getstatic       #53  <Field FMScriptHandleException$ScriptHandleExceptionType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = afmscripthandleexception$scripthandleexceptiontype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		FMScriptHandleException$ScriptHandleExceptionType afmscripthandleexception$scripthandleexceptiontype1[] = new FMScriptHandleException$ScriptHandleExceptionType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       FMScriptHandleException$ScriptHandleExceptionType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (afmscripthandleexception$scripthandleexceptiontype)), 0, ((Object) (afmscripthandleexception$scripthandleexceptiontype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #74  <Method void System.arraycopy(Object, int, Object, int, int)>
		return afmscripthandleexception$scripthandleexceptiontype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String description>
	//    2    4:areturn         
	}

	public int getValue()
	{
		return ((int) (value));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field byte value>
	//    2    4:ireturn         
	}

	private static final FMScriptHandleException$ScriptHandleExceptionType ENUM$VALUES[];
	public static final FMScriptHandleException$ScriptHandleExceptionType INVALID_FIRST_ID;
	public static final FMScriptHandleException$ScriptHandleExceptionType INVALID_NEXT;
	public static final FMScriptHandleException$ScriptHandleExceptionType OPENMOBILE_TRANSMIT_EXCEPTION;
	public static final FMScriptHandleException$ScriptHandleExceptionType STOPED;
	public static final FMScriptHandleException$ScriptHandleExceptionType UNKNOW;
	private String description;
	private byte value;

	static 
	{
		STOPED = new FMScriptHandleException$ScriptHandleExceptionType("STOPED", 0, (byte)1, "\u5F53\u524D\u64CD\u4F5C\u88AB\u505C\u6B62");
	//    0    0:new             #2   <Class FMScriptHandleException$ScriptHandleExceptionType>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "STOPED">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #25  <String "\u5F53\u524D\u64CD\u4F5C\u88AB\u505C\u6B62">
	//    6   10:invokespecial   #29  <Method void FMScriptHandleException$ScriptHandleExceptionType(String, int, byte, String)>
	//    7   13:putstatic       #31  <Field FMScriptHandleException$ScriptHandleExceptionType STOPED>
		INVALID_FIRST_ID = new FMScriptHandleException$ScriptHandleExceptionType("INVALID_FIRST_ID", 1, (byte)2, "\u7B2C\u4E00\u6761\u6307\u4EE4\u65E0\u6548");
	//    8   16:new             #2   <Class FMScriptHandleException$ScriptHandleExceptionType>
	//    9   19:dup             
	//   10   20:ldc1            #32  <String "INVALID_FIRST_ID">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #34  <String "\u7B2C\u4E00\u6761\u6307\u4EE4\u65E0\u6548">
	//   14   26:invokespecial   #29  <Method void FMScriptHandleException$ScriptHandleExceptionType(String, int, byte, String)>
	//   15   29:putstatic       #36  <Field FMScriptHandleException$ScriptHandleExceptionType INVALID_FIRST_ID>
		INVALID_NEXT = new FMScriptHandleException$ScriptHandleExceptionType("INVALID_NEXT", 2, (byte)3, "\u4E0B\u6761\u6307\u4EE4\u5E8F\u53F7\u5927\u4E8E\u5F53\u524D\u5E8F\u53F7");
	//   16   32:new             #2   <Class FMScriptHandleException$ScriptHandleExceptionType>
	//   17   35:dup             
	//   18   36:ldc1            #37  <String "INVALID_NEXT">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #39  <String "\u4E0B\u6761\u6307\u4EE4\u5E8F\u53F7\u5927\u4E8E\u5F53\u524D\u5E8F\u53F7">
	//   22   42:invokespecial   #29  <Method void FMScriptHandleException$ScriptHandleExceptionType(String, int, byte, String)>
	//   23   45:putstatic       #41  <Field FMScriptHandleException$ScriptHandleExceptionType INVALID_NEXT>
		OPENMOBILE_TRANSMIT_EXCEPTION = new FMScriptHandleException$ScriptHandleExceptionType("OPENMOBILE_TRANSMIT_EXCEPTION", 3, (byte)4, "open mobile \u4EA4\u4E92\u5F02\u5E38");
	//   24   48:new             #2   <Class FMScriptHandleException$ScriptHandleExceptionType>
	//   25   51:dup             
	//   26   52:ldc1            #42  <String "OPENMOBILE_TRANSMIT_EXCEPTION">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #44  <String "open mobile \u4EA4\u4E92\u5F02\u5E38">
	//   30   58:invokespecial   #29  <Method void FMScriptHandleException$ScriptHandleExceptionType(String, int, byte, String)>
	//   31   61:putstatic       #46  <Field FMScriptHandleException$ScriptHandleExceptionType OPENMOBILE_TRANSMIT_EXCEPTION>
		UNKNOW = new FMScriptHandleException$ScriptHandleExceptionType("UNKNOW", 4, (byte)-1, "\u672A\u77E5\u9519\u8BEF");
	//   32   64:new             #2   <Class FMScriptHandleException$ScriptHandleExceptionType>
	//   33   67:dup             
	//   34   68:ldc1            #47  <String "UNKNOW">
	//   35   70:iconst_4        
	//   36   71:iconst_m1       
	//   37   72:ldc1            #49  <String "\u672A\u77E5\u9519\u8BEF">
	//   38   74:invokespecial   #29  <Method void FMScriptHandleException$ScriptHandleExceptionType(String, int, byte, String)>
	//   39   77:putstatic       #51  <Field FMScriptHandleException$ScriptHandleExceptionType UNKNOW>
		ENUM$VALUES = (new FMScriptHandleException$ScriptHandleExceptionType[] {
			STOPED, INVALID_FIRST_ID, INVALID_NEXT, OPENMOBILE_TRANSMIT_EXCEPTION, UNKNOW
		});
	//   40   80:iconst_5        
	//   41   81:anewarray       FMScriptHandleException$ScriptHandleExceptionType[]
	//   42   84:dup             
	//   43   85:iconst_0        
	//   44   86:getstatic       #31  <Field FMScriptHandleException$ScriptHandleExceptionType STOPED>
	//   45   89:aastore         
	//   46   90:dup             
	//   47   91:iconst_1        
	//   48   92:getstatic       #36  <Field FMScriptHandleException$ScriptHandleExceptionType INVALID_FIRST_ID>
	//   49   95:aastore         
	//   50   96:dup             
	//   51   97:iconst_2        
	//   52   98:getstatic       #41  <Field FMScriptHandleException$ScriptHandleExceptionType INVALID_NEXT>
	//   53  101:aastore         
	//   54  102:dup             
	//   55  103:iconst_3        
	//   56  104:getstatic       #46  <Field FMScriptHandleException$ScriptHandleExceptionType OPENMOBILE_TRANSMIT_EXCEPTION>
	//   57  107:aastore         
	//   58  108:dup             
	//   59  109:iconst_4        
	//   60  110:getstatic       #51  <Field FMScriptHandleException$ScriptHandleExceptionType UNKNOW>
	//   61  113:aastore         
	//   62  114:putstatic       #53  <Field FMScriptHandleException$ScriptHandleExceptionType[] ENUM$VALUES>
	//*  63  117:return          
	}

	private FMScriptHandleException$ScriptHandleExceptionType(String s, int i, byte byte0, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void Enum(String, int)>
		value = byte0;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #59  <Field byte value>
		description = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #61  <Field String description>
	//   10   17:return          
	}
}
