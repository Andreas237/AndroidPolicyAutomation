// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.exception;


// Referenced classes of package cn.com.fmsh.communication.exception:
//			CommunicationException

public static final class CommunicationException$CommunicationExceptionType extends Enum
{

	public static CommunicationException$CommunicationExceptionType instance(int i)
	{
		CommunicationException$CommunicationExceptionType acommunicationexception$communicationexceptiontype[] = values();
	//    0    0:invokestatic    #97  <Method CommunicationException$CommunicationExceptionType[] values()>
	//    1    3:astore_3        
		int k = acommunicationexception$communicationexceptiontype.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:goto            33
		{
			CommunicationException$CommunicationExceptionType communicationexception$communicationexceptiontype = acommunicationexception$communicationexceptiontype[j];
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:aaload          
	//   11   15:astore          4
			if(communicationexception$communicationexceptiontype.getValue() == i)
	//*  12   17:aload           4
	//*  13   19:invokevirtual   #101 <Method int getValue()>
	//*  14   22:iload_0         
	//*  15   23:icmpne          29
				return communicationexception$communicationexceptiontype;
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
	//   25   38:getstatic       #81  <Field CommunicationException$CommunicationExceptionType UNKNOW>
	//   26   41:areturn         
	}

	public static CommunicationException$CommunicationExceptionType valueOf(String s)
	{
		return (CommunicationException$CommunicationExceptionType)Enum.valueOf(cn/com/fmsh/communication/exception/CommunicationException$CommunicationExceptionType, s);
	//    0    0:ldc1            #2   <Class CommunicationException$CommunicationExceptionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #106 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CommunicationException$CommunicationExceptionType>
	//    4    9:areturn         
	}

	public static CommunicationException$CommunicationExceptionType[] values()
	{
		CommunicationException$CommunicationExceptionType acommunicationexception$communicationexceptiontype[] = ENUM$VALUES;
	//    0    0:getstatic       #83  <Field CommunicationException$CommunicationExceptionType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = acommunicationexception$communicationexceptiontype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		CommunicationException$CommunicationExceptionType acommunicationexception$communicationexceptiontype1[] = new CommunicationException$CommunicationExceptionType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       CommunicationException$CommunicationExceptionType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (acommunicationexception$communicationexceptiontype)), 0, ((Object) (acommunicationexception$communicationexceptiontype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #112 <Method void System.arraycopy(Object, int, Object, int, int)>
		return acommunicationexception$communicationexceptiontype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String description>
	//    2    4:areturn         
	}

	public int getValue()
	{
		return ((int) (value));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field byte value>
	//    2    4:ireturn         
	}

	public static final CommunicationException$CommunicationExceptionType CHECK_FAILED;
	private static final CommunicationException$CommunicationExceptionType ENUM$VALUES[];
	public static final CommunicationException$CommunicationExceptionType INVALID_CONTROL;
	public static final CommunicationException$CommunicationExceptionType INVALID_DIRECTION;
	public static final CommunicationException$CommunicationExceptionType INVALID_FORMAT;
	public static final CommunicationException$CommunicationExceptionType INVALID_REPONSE;
	public static final CommunicationException$CommunicationExceptionType INVALID_SESSION;
	public static final CommunicationException$CommunicationExceptionType INVALID_SESSION_NUMBER;
	public static final CommunicationException$CommunicationExceptionType INVALID_VERSION;
	public static final CommunicationException$CommunicationExceptionType NO_REPONSE;
	public static final CommunicationException$CommunicationExceptionType UNKNOW;
	private String description;
	private byte value;

	static 
	{
		INVALID_VERSION = new CommunicationException$CommunicationExceptionType("INVALID_VERSION", 0, (byte)1, "\u65E0\u6548\u534F\u8BAE\u7248\u672C");
	//    0    0:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//    1    3:dup             
	//    2    4:ldc1            #28  <String "INVALID_VERSION">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:ldc1            #30  <String "\u65E0\u6548\u534F\u8BAE\u7248\u672C">
	//    6   10:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//    7   13:putstatic       #36  <Field CommunicationException$CommunicationExceptionType INVALID_VERSION>
		INVALID_FORMAT = new CommunicationException$CommunicationExceptionType("INVALID_FORMAT", 1, (byte)2, "\u62A5\u6587\u683C\u5F0F\u65E0\u6548");
	//    8   16:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//    9   19:dup             
	//   10   20:ldc1            #37  <String "INVALID_FORMAT">
	//   11   22:iconst_1        
	//   12   23:iconst_2        
	//   13   24:ldc1            #39  <String "\u62A5\u6587\u683C\u5F0F\u65E0\u6548">
	//   14   26:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   15   29:putstatic       #41  <Field CommunicationException$CommunicationExceptionType INVALID_FORMAT>
		CHECK_FAILED = new CommunicationException$CommunicationExceptionType("CHECK_FAILED", 2, (byte)3, "\u62A5\u6587\u68C0\u9A8C\u5931\u8D25");
	//   16   32:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   17   35:dup             
	//   18   36:ldc1            #42  <String "CHECK_FAILED">
	//   19   38:iconst_2        
	//   20   39:iconst_3        
	//   21   40:ldc1            #44  <String "\u62A5\u6587\u68C0\u9A8C\u5931\u8D25">
	//   22   42:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   23   45:putstatic       #46  <Field CommunicationException$CommunicationExceptionType CHECK_FAILED>
		INVALID_CONTROL = new CommunicationException$CommunicationExceptionType("INVALID_CONTROL", 3, (byte)4, "\u62A5\u6587\u63A7\u5236\u5B57\u65E0\u6548");
	//   24   48:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   25   51:dup             
	//   26   52:ldc1            #47  <String "INVALID_CONTROL">
	//   27   54:iconst_3        
	//   28   55:iconst_4        
	//   29   56:ldc1            #49  <String "\u62A5\u6587\u63A7\u5236\u5B57\u65E0\u6548">
	//   30   58:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   31   61:putstatic       #51  <Field CommunicationException$CommunicationExceptionType INVALID_CONTROL>
		INVALID_SESSION = new CommunicationException$CommunicationExceptionType("INVALID_SESSION", 4, (byte)5, "\u4F1A\u8BDD\u65E0\u6548");
	//   32   64:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   33   67:dup             
	//   34   68:ldc1            #52  <String "INVALID_SESSION">
	//   35   70:iconst_4        
	//   36   71:iconst_5        
	//   37   72:ldc1            #54  <String "\u4F1A\u8BDD\u65E0\u6548">
	//   38   74:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   39   77:putstatic       #56  <Field CommunicationException$CommunicationExceptionType INVALID_SESSION>
		INVALID_SESSION_NUMBER = new CommunicationException$CommunicationExceptionType("INVALID_SESSION_NUMBER", 5, (byte)6, "\u4F1A\u8BDD\u6D41\u6C34\u65E0\u6548");
	//   40   80:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   41   83:dup             
	//   42   84:ldc1            #57  <String "INVALID_SESSION_NUMBER">
	//   43   86:iconst_5        
	//   44   87:bipush          6
	//   45   89:ldc1            #59  <String "\u4F1A\u8BDD\u6D41\u6C34\u65E0\u6548">
	//   46   91:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   47   94:putstatic       #61  <Field CommunicationException$CommunicationExceptionType INVALID_SESSION_NUMBER>
		INVALID_DIRECTION = new CommunicationException$CommunicationExceptionType("INVALID_DIRECTION", 6, (byte)7, "\u6570\u636E\u65B9\u5411\u5F02\u5E38");
	//   48   97:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   49  100:dup             
	//   50  101:ldc1            #62  <String "INVALID_DIRECTION">
	//   51  103:bipush          6
	//   52  105:bipush          7
	//   53  107:ldc1            #64  <String "\u6570\u636E\u65B9\u5411\u5F02\u5E38">
	//   54  109:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   55  112:putstatic       #66  <Field CommunicationException$CommunicationExceptionType INVALID_DIRECTION>
		NO_REPONSE = new CommunicationException$CommunicationExceptionType("NO_REPONSE", 7, (byte)8, "\u672A\u6536\u5230\u54CD\u5E94\u6570\u636E");
	//   56  115:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   57  118:dup             
	//   58  119:ldc1            #67  <String "NO_REPONSE">
	//   59  121:bipush          7
	//   60  123:bipush          8
	//   61  125:ldc1            #69  <String "\u672A\u6536\u5230\u54CD\u5E94\u6570\u636E">
	//   62  127:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   63  130:putstatic       #71  <Field CommunicationException$CommunicationExceptionType NO_REPONSE>
		INVALID_REPONSE = new CommunicationException$CommunicationExceptionType("INVALID_REPONSE", 8, (byte)9, "\u54CD\u5E94\u6570\u636E\u4E0D\u5408\u6CD5");
	//   64  133:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   65  136:dup             
	//   66  137:ldc1            #72  <String "INVALID_REPONSE">
	//   67  139:bipush          8
	//   68  141:bipush          9
	//   69  143:ldc1            #74  <String "\u54CD\u5E94\u6570\u636E\u4E0D\u5408\u6CD5">
	//   70  145:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   71  148:putstatic       #76  <Field CommunicationException$CommunicationExceptionType INVALID_REPONSE>
		UNKNOW = new CommunicationException$CommunicationExceptionType("UNKNOW", 9, (byte)-1, "\u672A\u77E5\u9519\u8BEF");
	//   72  151:new             #2   <Class CommunicationException$CommunicationExceptionType>
	//   73  154:dup             
	//   74  155:ldc1            #77  <String "UNKNOW">
	//   75  157:bipush          9
	//   76  159:iconst_m1       
	//   77  160:ldc1            #79  <String "\u672A\u77E5\u9519\u8BEF">
	//   78  162:invokespecial   #34  <Method void CommunicationException$CommunicationExceptionType(String, int, byte, String)>
	//   79  165:putstatic       #81  <Field CommunicationException$CommunicationExceptionType UNKNOW>
		ENUM$VALUES = (new CommunicationException$CommunicationExceptionType[] {
			INVALID_VERSION, INVALID_FORMAT, CHECK_FAILED, INVALID_CONTROL, INVALID_SESSION, INVALID_SESSION_NUMBER, INVALID_DIRECTION, NO_REPONSE, INVALID_REPONSE, UNKNOW
		});
	//   80  168:bipush          10
	//   81  170:anewarray       CommunicationException$CommunicationExceptionType[]
	//   82  173:dup             
	//   83  174:iconst_0        
	//   84  175:getstatic       #36  <Field CommunicationException$CommunicationExceptionType INVALID_VERSION>
	//   85  178:aastore         
	//   86  179:dup             
	//   87  180:iconst_1        
	//   88  181:getstatic       #41  <Field CommunicationException$CommunicationExceptionType INVALID_FORMAT>
	//   89  184:aastore         
	//   90  185:dup             
	//   91  186:iconst_2        
	//   92  187:getstatic       #46  <Field CommunicationException$CommunicationExceptionType CHECK_FAILED>
	//   93  190:aastore         
	//   94  191:dup             
	//   95  192:iconst_3        
	//   96  193:getstatic       #51  <Field CommunicationException$CommunicationExceptionType INVALID_CONTROL>
	//   97  196:aastore         
	//   98  197:dup             
	//   99  198:iconst_4        
	//  100  199:getstatic       #56  <Field CommunicationException$CommunicationExceptionType INVALID_SESSION>
	//  101  202:aastore         
	//  102  203:dup             
	//  103  204:iconst_5        
	//  104  205:getstatic       #61  <Field CommunicationException$CommunicationExceptionType INVALID_SESSION_NUMBER>
	//  105  208:aastore         
	//  106  209:dup             
	//  107  210:bipush          6
	//  108  212:getstatic       #66  <Field CommunicationException$CommunicationExceptionType INVALID_DIRECTION>
	//  109  215:aastore         
	//  110  216:dup             
	//  111  217:bipush          7
	//  112  219:getstatic       #71  <Field CommunicationException$CommunicationExceptionType NO_REPONSE>
	//  113  222:aastore         
	//  114  223:dup             
	//  115  224:bipush          8
	//  116  226:getstatic       #76  <Field CommunicationException$CommunicationExceptionType INVALID_REPONSE>
	//  117  229:aastore         
	//  118  230:dup             
	//  119  231:bipush          9
	//  120  233:getstatic       #81  <Field CommunicationException$CommunicationExceptionType UNKNOW>
	//  121  236:aastore         
	//  122  237:putstatic       #83  <Field CommunicationException$CommunicationExceptionType[] ENUM$VALUES>
	//* 123  240:return          
	}

	private CommunicationException$CommunicationExceptionType(String s, int i, byte byte0, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #87  <Method void Enum(String, int)>
		value = byte0;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #89  <Field byte value>
		description = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #91  <Field String description>
	//   10   17:return          
	}
}
