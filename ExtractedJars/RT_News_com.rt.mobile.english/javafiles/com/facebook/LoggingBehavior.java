// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


public final class LoggingBehavior extends Enum
{

	private LoggingBehavior(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static LoggingBehavior valueOf(String s)
	{
		return (LoggingBehavior)Enum.valueOf(com/facebook/LoggingBehavior, s);
	//    0    0:ldc1            #2   <Class LoggingBehavior>
	//    1    2:aload_0         
	//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LoggingBehavior>
	//    4    9:areturn         
	}

	public static LoggingBehavior[] values()
	{
		return (LoggingBehavior[])((LoggingBehavior []) ($VALUES)).clone();
	//    0    0:getstatic       #48  <Field LoggingBehavior[] $VALUES>
	//    1    3:invokevirtual   #63  <Method Object _5B_Lcom.facebook.LoggingBehavior_3B_.clone()>
	//    2    6:checkcast       #59  <Class LoggingBehavior[]>
	//    3    9:areturn         
	}

	private static final LoggingBehavior $VALUES[];
	public static final LoggingBehavior APP_EVENTS;
	public static final LoggingBehavior CACHE;
	public static final LoggingBehavior DEVELOPER_ERRORS;
	public static final LoggingBehavior GRAPH_API_DEBUG_INFO;
	public static final LoggingBehavior GRAPH_API_DEBUG_WARNING;
	public static final LoggingBehavior INCLUDE_ACCESS_TOKENS;
	public static final LoggingBehavior INCLUDE_RAW_RESPONSES;
	public static final LoggingBehavior REQUESTS;

	static 
	{
		REQUESTS = new LoggingBehavior("REQUESTS", 0);
	//    0    0:new             #2   <Class LoggingBehavior>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "REQUESTS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//    5   10:putstatic       #25  <Field LoggingBehavior REQUESTS>
		INCLUDE_ACCESS_TOKENS = new LoggingBehavior("INCLUDE_ACCESS_TOKENS", 1);
	//    6   13:new             #2   <Class LoggingBehavior>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "INCLUDE_ACCESS_TOKENS">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//   11   23:putstatic       #28  <Field LoggingBehavior INCLUDE_ACCESS_TOKENS>
		INCLUDE_RAW_RESPONSES = new LoggingBehavior("INCLUDE_RAW_RESPONSES", 2);
	//   12   26:new             #2   <Class LoggingBehavior>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "INCLUDE_RAW_RESPONSES">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//   17   36:putstatic       #31  <Field LoggingBehavior INCLUDE_RAW_RESPONSES>
		CACHE = new LoggingBehavior("CACHE", 3);
	//   18   39:new             #2   <Class LoggingBehavior>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "CACHE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//   23   49:putstatic       #34  <Field LoggingBehavior CACHE>
		APP_EVENTS = new LoggingBehavior("APP_EVENTS", 4);
	//   24   52:new             #2   <Class LoggingBehavior>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "APP_EVENTS">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//   29   62:putstatic       #37  <Field LoggingBehavior APP_EVENTS>
		DEVELOPER_ERRORS = new LoggingBehavior("DEVELOPER_ERRORS", 5);
	//   30   65:new             #2   <Class LoggingBehavior>
	//   31   68:dup             
	//   32   69:ldc1            #38  <String "DEVELOPER_ERRORS">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//   35   75:putstatic       #40  <Field LoggingBehavior DEVELOPER_ERRORS>
		GRAPH_API_DEBUG_WARNING = new LoggingBehavior("GRAPH_API_DEBUG_WARNING", 6);
	//   36   78:new             #2   <Class LoggingBehavior>
	//   37   81:dup             
	//   38   82:ldc1            #41  <String "GRAPH_API_DEBUG_WARNING">
	//   39   84:bipush          6
	//   40   86:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//   41   89:putstatic       #43  <Field LoggingBehavior GRAPH_API_DEBUG_WARNING>
		GRAPH_API_DEBUG_INFO = new LoggingBehavior("GRAPH_API_DEBUG_INFO", 7);
	//   42   92:new             #2   <Class LoggingBehavior>
	//   43   95:dup             
	//   44   96:ldc1            #44  <String "GRAPH_API_DEBUG_INFO">
	//   45   98:bipush          7
	//   46  100:invokespecial   #23  <Method void LoggingBehavior(String, int)>
	//   47  103:putstatic       #46  <Field LoggingBehavior GRAPH_API_DEBUG_INFO>
		$VALUES = (new LoggingBehavior[] {
			REQUESTS, INCLUDE_ACCESS_TOKENS, INCLUDE_RAW_RESPONSES, CACHE, APP_EVENTS, DEVELOPER_ERRORS, GRAPH_API_DEBUG_WARNING, GRAPH_API_DEBUG_INFO
		});
	//   48  106:bipush          8
	//   49  108:anewarray       LoggingBehavior[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #25  <Field LoggingBehavior REQUESTS>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #28  <Field LoggingBehavior INCLUDE_ACCESS_TOKENS>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #31  <Field LoggingBehavior INCLUDE_RAW_RESPONSES>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #34  <Field LoggingBehavior CACHE>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #37  <Field LoggingBehavior APP_EVENTS>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #40  <Field LoggingBehavior DEVELOPER_ERRORS>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #43  <Field LoggingBehavior GRAPH_API_DEBUG_WARNING>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #46  <Field LoggingBehavior GRAPH_API_DEBUG_INFO>
	//   81  160:aastore         
	//   82  161:putstatic       #48  <Field LoggingBehavior[] $VALUES>
	//*  83  164:return          
	}
}
