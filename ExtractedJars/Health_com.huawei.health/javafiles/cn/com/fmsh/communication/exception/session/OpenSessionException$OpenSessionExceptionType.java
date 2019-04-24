// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.exception.session;


// Referenced classes of package cn.com.fmsh.communication.exception.session:
//			OpenSessionException

public static final class OpenSessionException$OpenSessionExceptionType extends Enum
{

	public static OpenSessionException$OpenSessionExceptionType instance(int i)
	{
		OpenSessionException$OpenSessionExceptionType aopensessionexception$opensessionexceptiontype[] = values();
	//    0    0:invokestatic    #91  <Method OpenSessionException$OpenSessionExceptionType[] values()>
	//    1    3:astore_3        
		int k = aopensessionexception$opensessionexceptiontype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			OpenSessionException$OpenSessionExceptionType opensessionexception$opensessionexceptiontype = aopensessionexception$opensessionexceptiontype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(opensessionexception$opensessionexceptiontype.getValue() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #95  <Method int getValue()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return opensessionexception$opensessionexceptiontype;
	//   16   26:aload           4
	//   17   28:areturn         
		}

	//   18   29:iload_1         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_1        
	//   22   33:iload_1         
	//   23   34:iload_2         
	//   24   35:icmplt          12
		return UNKNOW;
	//   25   38:getstatic       #75  <Field OpenSessionException$OpenSessionExceptionType UNKNOW>
	//   26   41:areturn         
	}

	public static OpenSessionException$OpenSessionExceptionType valueOf(String s)
	{
		return (OpenSessionException$OpenSessionExceptionType)Enum.valueOf(cn/com/fmsh/communication/exception/session/OpenSessionException$OpenSessionExceptionType, s);
	//    0    0:ldc1            #2   <Class OpenSessionException$OpenSessionExceptionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #100 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OpenSessionException$OpenSessionExceptionType>
	//    4    9:areturn         
	}

	public static OpenSessionException$OpenSessionExceptionType[] values()
	{
		OpenSessionException$OpenSessionExceptionType aopensessionexception$opensessionexceptiontype[] = ENUM$VALUES;
	//    0    0:getstatic       #77  <Field OpenSessionException$OpenSessionExceptionType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aopensessionexception$opensessionexceptiontype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		OpenSessionException$OpenSessionExceptionType aopensessionexception$opensessionexceptiontype1[] = new OpenSessionException$OpenSessionExceptionType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       OpenSessionException$OpenSessionExceptionType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aopensessionexception$opensessionexceptiontype)), 0, ((Object) (aopensessionexception$opensessionexceptiontype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #106 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aopensessionexception$opensessionexceptiontype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String description>
	//    2    4:areturn         
	}

	public int getValue()
	{
		return ((int) (value));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field byte value>
	//    2    4:ireturn         
	}

	public static final OpenSessionException$OpenSessionExceptionType DATA_FORMAT_ERROR;
	public static final OpenSessionException$OpenSessionExceptionType DECRYPT_FAIL;
	private static final OpenSessionException$OpenSessionExceptionType ENUM$VALUES[];
	public static final OpenSessionException$OpenSessionExceptionType INVALID_KEY_INDEX;
	public static final OpenSessionException$OpenSessionExceptionType INVALID_TERMINAL;
	public static final OpenSessionException$OpenSessionExceptionType INVALID_TERMINAL_ID;
	public static final OpenSessionException$OpenSessionExceptionType INVALID_TIME;
	public static final OpenSessionException$OpenSessionExceptionType SECURITY_CODE;
	public static final OpenSessionException$OpenSessionExceptionType SYSTEM_BUSY;
	public static final OpenSessionException$OpenSessionExceptionType UNKNOW;
	private String description;
	private byte value;

	static 
	{
		SYSTEM_BUSY = new OpenSessionException$OpenSessionExceptionType("SYSTEM_BUSY", 0, (byte)-128, "\u7CFB\u7EDF\u5FD9\uFF0C\u6682\u505C\u63A5\u5165\u670D\u52A1");
	//    0    0:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "SYSTEM_BUSY">
	//    3    6:iconst_0        
	//    4    7:bipush          -128
	//    5    9:ldc1            #29  <String "\u7CFB\u7EDF\u5FD9\uFF0C\u6682\u505C\u63A5\u5165\u670D\u52A1">
	//    6   11:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//    7   14:putstatic       #35  <Field OpenSessionException$OpenSessionExceptionType SYSTEM_BUSY>
		INVALID_TERMINAL = new OpenSessionException$OpenSessionExceptionType("INVALID_TERMINAL", 1, (byte)-127, "\u65E0\u6548\u7EC8\u7AEF\u7C7B\u578B");
	//    8   17:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//    9   20:dup             
	//   10   21:ldc1            #36  <String "INVALID_TERMINAL">
	//   11   23:iconst_1        
	//   12   24:bipush          -127
	//   13   26:ldc1            #38  <String "\u65E0\u6548\u7EC8\u7AEF\u7C7B\u578B">
	//   14   28:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   15   31:putstatic       #40  <Field OpenSessionException$OpenSessionExceptionType INVALID_TERMINAL>
		INVALID_KEY_INDEX = new OpenSessionException$OpenSessionExceptionType("INVALID_KEY_INDEX", 2, (byte)-126, "\u7B7E\u5230\u4F7F\u7528\u5BC6\u94A5\u7D22\u5F15\u65E0\u6548");
	//   16   34:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//   17   37:dup             
	//   18   38:ldc1            #41  <String "INVALID_KEY_INDEX">
	//   19   40:iconst_2        
	//   20   41:bipush          -126
	//   21   43:ldc1            #43  <String "\u7B7E\u5230\u4F7F\u7528\u5BC6\u94A5\u7D22\u5F15\u65E0\u6548">
	//   22   45:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   23   48:putstatic       #45  <Field OpenSessionException$OpenSessionExceptionType INVALID_KEY_INDEX>
		DECRYPT_FAIL = new OpenSessionException$OpenSessionExceptionType("DECRYPT_FAIL", 3, (byte)-125, "\u7B7E\u5230\u8BF7\u6C42\u6570\u636E\u89E3\u5BC6\u5931\u8D25");
	//   24   51:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//   25   54:dup             
	//   26   55:ldc1            #46  <String "DECRYPT_FAIL">
	//   27   57:iconst_3        
	//   28   58:bipush          -125
	//   29   60:ldc1            #48  <String "\u7B7E\u5230\u8BF7\u6C42\u6570\u636E\u89E3\u5BC6\u5931\u8D25">
	//   30   62:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   31   65:putstatic       #50  <Field OpenSessionException$OpenSessionExceptionType DECRYPT_FAIL>
		DATA_FORMAT_ERROR = new OpenSessionException$OpenSessionExceptionType("DATA_FORMAT_ERROR", 4, (byte)-124, "\u7B7E\u5230\u8BF7\u6C42\u6570\u636E\u683C\u5F0F\u9519\u8BEF");
	//   32   68:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//   33   71:dup             
	//   34   72:ldc1            #51  <String "DATA_FORMAT_ERROR">
	//   35   74:iconst_4        
	//   36   75:bipush          -124
	//   37   77:ldc1            #53  <String "\u7B7E\u5230\u8BF7\u6C42\u6570\u636E\u683C\u5F0F\u9519\u8BEF">
	//   38   79:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   39   82:putstatic       #55  <Field OpenSessionException$OpenSessionExceptionType DATA_FORMAT_ERROR>
		INVALID_TERMINAL_ID = new OpenSessionException$OpenSessionExceptionType("INVALID_TERMINAL_ID", 5, (byte)-123, "\u65E0\u6548\u7EC8\u7AEF\u7F16\u53F7");
	//   40   85:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//   41   88:dup             
	//   42   89:ldc1            #56  <String "INVALID_TERMINAL_ID">
	//   43   91:iconst_5        
	//   44   92:bipush          -123
	//   45   94:ldc1            #58  <String "\u65E0\u6548\u7EC8\u7AEF\u7F16\u53F7">
	//   46   96:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   47   99:putstatic       #60  <Field OpenSessionException$OpenSessionExceptionType INVALID_TERMINAL_ID>
		SECURITY_CODE = new OpenSessionException$OpenSessionExceptionType("SECURITY_CODE", 6, (byte)-122, "\u9632\u4F2A\u7801\u9A8C\u8BC1\u5931\u8D25");
	//   48  102:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//   49  105:dup             
	//   50  106:ldc1            #61  <String "SECURITY_CODE">
	//   51  108:bipush          6
	//   52  110:bipush          -122
	//   53  112:ldc1            #63  <String "\u9632\u4F2A\u7801\u9A8C\u8BC1\u5931\u8D25">
	//   54  114:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   55  117:putstatic       #65  <Field OpenSessionException$OpenSessionExceptionType SECURITY_CODE>
		INVALID_TIME = new OpenSessionException$OpenSessionExceptionType("INVALID_TIME", 7, (byte)-121, "\u7EC8\u7AEF\u65F6\u95F4\u5F02\u5E38");
	//   56  120:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//   57  123:dup             
	//   58  124:ldc1            #66  <String "INVALID_TIME">
	//   59  126:bipush          7
	//   60  128:bipush          -121
	//   61  130:ldc1            #68  <String "\u7EC8\u7AEF\u65F6\u95F4\u5F02\u5E38">
	//   62  132:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   63  135:putstatic       #70  <Field OpenSessionException$OpenSessionExceptionType INVALID_TIME>
		UNKNOW = new OpenSessionException$OpenSessionExceptionType("UNKNOW", 8, (byte)-1, "\u672A\u77E5\u9519\u8BEF");
	//   64  138:new             #2   <Class OpenSessionException$OpenSessionExceptionType>
	//   65  141:dup             
	//   66  142:ldc1            #71  <String "UNKNOW">
	//   67  144:bipush          8
	//   68  146:iconst_m1       
	//   69  147:ldc1            #73  <String "\u672A\u77E5\u9519\u8BEF">
	//   70  149:invokespecial   #33  <Method void OpenSessionException$OpenSessionExceptionType(String, int, byte, String)>
	//   71  152:putstatic       #75  <Field OpenSessionException$OpenSessionExceptionType UNKNOW>
		ENUM$VALUES = (new OpenSessionException$OpenSessionExceptionType[] {
			SYSTEM_BUSY, INVALID_TERMINAL, INVALID_KEY_INDEX, DECRYPT_FAIL, DATA_FORMAT_ERROR, INVALID_TERMINAL_ID, SECURITY_CODE, INVALID_TIME, UNKNOW
		});
	//   72  155:bipush          9
	//   73  157:anewarray       OpenSessionException$OpenSessionExceptionType[]
	//   74  160:dup             
	//   75  161:iconst_0        
	//   76  162:getstatic       #35  <Field OpenSessionException$OpenSessionExceptionType SYSTEM_BUSY>
	//   77  165:aastore         
	//   78  166:dup             
	//   79  167:iconst_1        
	//   80  168:getstatic       #40  <Field OpenSessionException$OpenSessionExceptionType INVALID_TERMINAL>
	//   81  171:aastore         
	//   82  172:dup             
	//   83  173:iconst_2        
	//   84  174:getstatic       #45  <Field OpenSessionException$OpenSessionExceptionType INVALID_KEY_INDEX>
	//   85  177:aastore         
	//   86  178:dup             
	//   87  179:iconst_3        
	//   88  180:getstatic       #50  <Field OpenSessionException$OpenSessionExceptionType DECRYPT_FAIL>
	//   89  183:aastore         
	//   90  184:dup             
	//   91  185:iconst_4        
	//   92  186:getstatic       #55  <Field OpenSessionException$OpenSessionExceptionType DATA_FORMAT_ERROR>
	//   93  189:aastore         
	//   94  190:dup             
	//   95  191:iconst_5        
	//   96  192:getstatic       #60  <Field OpenSessionException$OpenSessionExceptionType INVALID_TERMINAL_ID>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          6
	//  100  199:getstatic       #65  <Field OpenSessionException$OpenSessionExceptionType SECURITY_CODE>
	//  101  202:aastore         
	//  102  203:dup             
	//  103  204:bipush          7
	//  104  206:getstatic       #70  <Field OpenSessionException$OpenSessionExceptionType INVALID_TIME>
	//  105  209:aastore         
	//  106  210:dup             
	//  107  211:bipush          8
	//  108  213:getstatic       #75  <Field OpenSessionException$OpenSessionExceptionType UNKNOW>
	//  109  216:aastore         
	//  110  217:putstatic       #77  <Field OpenSessionException$OpenSessionExceptionType[] ENUM$VALUES>
	//* 111  220:return          
	}

	private OpenSessionException$OpenSessionExceptionType(String s, int i, byte byte0, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #81  <Method void Enum(String, int)>
		value = byte0;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #83  <Field byte value>
		description = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #85  <Field String description>
	//   10   17:return          
	}
}
