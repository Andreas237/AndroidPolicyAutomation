// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonFormatVisitors;


public final class JsonValueFormat extends Enum
{

	private JsonValueFormat(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #100 <Method void Enum(String, int)>
		_desc = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #102 <Field String _desc>
	//    7   11:return          
	}

	public static JsonValueFormat valueOf(String s)
	{
		return (JsonValueFormat)Enum.valueOf(com/fasterxml/jackson/databind/jsonFormatVisitors/JsonValueFormat, s);
	//    0    0:ldc1            #2   <Class JsonValueFormat>
	//    1    2:aload_0         
	//    2    3:invokestatic    #109 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonValueFormat>
	//    4    9:areturn         
	}

	public static JsonValueFormat[] values()
	{
		return (JsonValueFormat[])((JsonValueFormat []) ($VALUES)).clone();
	//    0    0:getstatic       #96  <Field JsonValueFormat[] $VALUES>
	//    1    3:invokevirtual   #116 <Method Object _5B_Lcom.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat_3B_.clone()>
	//    2    6:checkcast       #112 <Class JsonValueFormat[]>
	//    3    9:areturn         
	}

	public String toString()
	{
		return _desc;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String _desc>
	//    2    4:areturn         
	}

	private static final JsonValueFormat $VALUES[];
	public static final JsonValueFormat COLOR;
	public static final JsonValueFormat DATE;
	public static final JsonValueFormat DATE_TIME;
	public static final JsonValueFormat EMAIL;
	public static final JsonValueFormat HOST_NAME;
	public static final JsonValueFormat IPV6;
	public static final JsonValueFormat IP_ADDRESS;
	public static final JsonValueFormat PHONE;
	public static final JsonValueFormat REGEX;
	public static final JsonValueFormat STYLE;
	public static final JsonValueFormat TIME;
	public static final JsonValueFormat URI;
	public static final JsonValueFormat UTC_MILLISEC;
	private final String _desc;

	static 
	{
		COLOR = new JsonValueFormat("COLOR", 0, "color");
	//    0    0:new             #2   <Class JsonValueFormat>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "COLOR">
	//    3    6:iconst_0        
	//    4    7:ldc1            #28  <String "color">
	//    5    9:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//    6   12:putstatic       #34  <Field JsonValueFormat COLOR>
		DATE = new JsonValueFormat("DATE", 1, "date");
	//    7   15:new             #2   <Class JsonValueFormat>
	//    8   18:dup             
	//    9   19:ldc1            #35  <String "DATE">
	//   10   21:iconst_1        
	//   11   22:ldc1            #37  <String "date">
	//   12   24:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   13   27:putstatic       #39  <Field JsonValueFormat DATE>
		DATE_TIME = new JsonValueFormat("DATE_TIME", 2, "date-time");
	//   14   30:new             #2   <Class JsonValueFormat>
	//   15   33:dup             
	//   16   34:ldc1            #40  <String "DATE_TIME">
	//   17   36:iconst_2        
	//   18   37:ldc1            #42  <String "date-time">
	//   19   39:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   20   42:putstatic       #44  <Field JsonValueFormat DATE_TIME>
		EMAIL = new JsonValueFormat("EMAIL", 3, "email");
	//   21   45:new             #2   <Class JsonValueFormat>
	//   22   48:dup             
	//   23   49:ldc1            #45  <String "EMAIL">
	//   24   51:iconst_3        
	//   25   52:ldc1            #47  <String "email">
	//   26   54:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   27   57:putstatic       #49  <Field JsonValueFormat EMAIL>
		HOST_NAME = new JsonValueFormat("HOST_NAME", 4, "host-name");
	//   28   60:new             #2   <Class JsonValueFormat>
	//   29   63:dup             
	//   30   64:ldc1            #50  <String "HOST_NAME">
	//   31   66:iconst_4        
	//   32   67:ldc1            #52  <String "host-name">
	//   33   69:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   34   72:putstatic       #54  <Field JsonValueFormat HOST_NAME>
		IP_ADDRESS = new JsonValueFormat("IP_ADDRESS", 5, "ip-address");
	//   35   75:new             #2   <Class JsonValueFormat>
	//   36   78:dup             
	//   37   79:ldc1            #55  <String "IP_ADDRESS">
	//   38   81:iconst_5        
	//   39   82:ldc1            #57  <String "ip-address">
	//   40   84:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   41   87:putstatic       #59  <Field JsonValueFormat IP_ADDRESS>
		IPV6 = new JsonValueFormat("IPV6", 6, "ipv6");
	//   42   90:new             #2   <Class JsonValueFormat>
	//   43   93:dup             
	//   44   94:ldc1            #60  <String "IPV6">
	//   45   96:bipush          6
	//   46   98:ldc1            #62  <String "ipv6">
	//   47  100:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   48  103:putstatic       #64  <Field JsonValueFormat IPV6>
		PHONE = new JsonValueFormat("PHONE", 7, "phone");
	//   49  106:new             #2   <Class JsonValueFormat>
	//   50  109:dup             
	//   51  110:ldc1            #65  <String "PHONE">
	//   52  112:bipush          7
	//   53  114:ldc1            #67  <String "phone">
	//   54  116:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   55  119:putstatic       #69  <Field JsonValueFormat PHONE>
		REGEX = new JsonValueFormat("REGEX", 8, "regex");
	//   56  122:new             #2   <Class JsonValueFormat>
	//   57  125:dup             
	//   58  126:ldc1            #70  <String "REGEX">
	//   59  128:bipush          8
	//   60  130:ldc1            #72  <String "regex">
	//   61  132:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   62  135:putstatic       #74  <Field JsonValueFormat REGEX>
		STYLE = new JsonValueFormat("STYLE", 9, "style");
	//   63  138:new             #2   <Class JsonValueFormat>
	//   64  141:dup             
	//   65  142:ldc1            #75  <String "STYLE">
	//   66  144:bipush          9
	//   67  146:ldc1            #77  <String "style">
	//   68  148:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   69  151:putstatic       #79  <Field JsonValueFormat STYLE>
		TIME = new JsonValueFormat("TIME", 10, "time");
	//   70  154:new             #2   <Class JsonValueFormat>
	//   71  157:dup             
	//   72  158:ldc1            #80  <String "TIME">
	//   73  160:bipush          10
	//   74  162:ldc1            #82  <String "time">
	//   75  164:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   76  167:putstatic       #84  <Field JsonValueFormat TIME>
		URI = new JsonValueFormat("URI", 11, "uri");
	//   77  170:new             #2   <Class JsonValueFormat>
	//   78  173:dup             
	//   79  174:ldc1            #85  <String "URI">
	//   80  176:bipush          11
	//   81  178:ldc1            #87  <String "uri">
	//   82  180:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   83  183:putstatic       #89  <Field JsonValueFormat URI>
		UTC_MILLISEC = new JsonValueFormat("UTC_MILLISEC", 12, "utc-millisec");
	//   84  186:new             #2   <Class JsonValueFormat>
	//   85  189:dup             
	//   86  190:ldc1            #90  <String "UTC_MILLISEC">
	//   87  192:bipush          12
	//   88  194:ldc1            #92  <String "utc-millisec">
	//   89  196:invokespecial   #32  <Method void JsonValueFormat(String, int, String)>
	//   90  199:putstatic       #94  <Field JsonValueFormat UTC_MILLISEC>
		$VALUES = (new JsonValueFormat[] {
			COLOR, DATE, DATE_TIME, EMAIL, HOST_NAME, IP_ADDRESS, IPV6, PHONE, REGEX, STYLE, 
			TIME, URI, UTC_MILLISEC
		});
	//   91  202:bipush          13
	//   92  204:anewarray       JsonValueFormat[]
	//   93  207:dup             
	//   94  208:iconst_0        
	//   95  209:getstatic       #34  <Field JsonValueFormat COLOR>
	//   96  212:aastore         
	//   97  213:dup             
	//   98  214:iconst_1        
	//   99  215:getstatic       #39  <Field JsonValueFormat DATE>
	//  100  218:aastore         
	//  101  219:dup             
	//  102  220:iconst_2        
	//  103  221:getstatic       #44  <Field JsonValueFormat DATE_TIME>
	//  104  224:aastore         
	//  105  225:dup             
	//  106  226:iconst_3        
	//  107  227:getstatic       #49  <Field JsonValueFormat EMAIL>
	//  108  230:aastore         
	//  109  231:dup             
	//  110  232:iconst_4        
	//  111  233:getstatic       #54  <Field JsonValueFormat HOST_NAME>
	//  112  236:aastore         
	//  113  237:dup             
	//  114  238:iconst_5        
	//  115  239:getstatic       #59  <Field JsonValueFormat IP_ADDRESS>
	//  116  242:aastore         
	//  117  243:dup             
	//  118  244:bipush          6
	//  119  246:getstatic       #64  <Field JsonValueFormat IPV6>
	//  120  249:aastore         
	//  121  250:dup             
	//  122  251:bipush          7
	//  123  253:getstatic       #69  <Field JsonValueFormat PHONE>
	//  124  256:aastore         
	//  125  257:dup             
	//  126  258:bipush          8
	//  127  260:getstatic       #74  <Field JsonValueFormat REGEX>
	//  128  263:aastore         
	//  129  264:dup             
	//  130  265:bipush          9
	//  131  267:getstatic       #79  <Field JsonValueFormat STYLE>
	//  132  270:aastore         
	//  133  271:dup             
	//  134  272:bipush          10
	//  135  274:getstatic       #84  <Field JsonValueFormat TIME>
	//  136  277:aastore         
	//  137  278:dup             
	//  138  279:bipush          11
	//  139  281:getstatic       #89  <Field JsonValueFormat URI>
	//  140  284:aastore         
	//  141  285:dup             
	//  142  286:bipush          12
	//  143  288:getstatic       #94  <Field JsonValueFormat UTC_MILLISEC>
	//  144  291:aastore         
	//  145  292:putstatic       #96  <Field JsonValueFormat[] $VALUES>
	//* 146  295:return          
	}
}
