// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;


public final class StreamSenseEventType extends Enum
{

	private StreamSenseEventType(String s, int i, String s1, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void Enum(String, int)>
		a = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #92  <Field String a>
		b = j;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #94  <Field int b>
	//   10   17:return          
	}

	public static StreamSenseEventType valueOf(String s)
	{
		return (StreamSenseEventType)Enum.valueOf(com/comscore/streaming/StreamSenseEventType, s);
	//    0    0:ldc1            #2   <Class StreamSenseEventType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #100 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class StreamSenseEventType>
	//    4    9:areturn         
	}

	public static StreamSenseEventType[] values()
	{
		return (StreamSenseEventType[])((StreamSenseEventType []) (c)).clone();
	//    0    0:getstatic       #86  <Field StreamSenseEventType[] c>
	//    1    3:invokevirtual   #107 <Method Object _5B_Lcom.comscore.streaming.StreamSenseEventType_3B_.clone()>
	//    2    6:checkcast       #103 <Class StreamSenseEventType[]>
	//    3    9:areturn         
	}

	public int getCode()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int b>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String a>
	//    2    4:areturn         
	}

	public String toString()
	{
		return getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method String getName()>
	//    2    4:areturn         
	}

	public static final StreamSenseEventType AD_CLICK;
	public static final StreamSenseEventType AD_END;
	public static final StreamSenseEventType AD_PAUSE;
	public static final StreamSenseEventType AD_PLAY;
	public static final StreamSenseEventType BUFFER;
	public static final StreamSenseEventType CUSTOM;
	public static final StreamSenseEventType END;
	public static final StreamSenseEventType HEART_BEAT;
	public static final StreamSenseEventType KEEP_ALIVE;
	public static final StreamSenseEventType PAUSE;
	public static final StreamSenseEventType PLAY;
	private static final StreamSenseEventType c[];
	private String a;
	private int b;

	static 
	{
		PLAY = new StreamSenseEventType("PLAY", 0, "play", 0);
	//    0    0:new             #2   <Class StreamSenseEventType>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "PLAY">
	//    3    6:iconst_0        
	//    4    7:ldc1            #28  <String "play">
	//    5    9:iconst_0        
	//    6   10:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//    7   13:putstatic       #34  <Field StreamSenseEventType PLAY>
		PAUSE = new StreamSenseEventType("PAUSE", 1, "pause", 1);
	//    8   16:new             #2   <Class StreamSenseEventType>
	//    9   19:dup             
	//   10   20:ldc1            #35  <String "PAUSE">
	//   11   22:iconst_1        
	//   12   23:ldc1            #37  <String "pause">
	//   13   25:iconst_1        
	//   14   26:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   15   29:putstatic       #39  <Field StreamSenseEventType PAUSE>
		END = new StreamSenseEventType("END", 2, "end", 2);
	//   16   32:new             #2   <Class StreamSenseEventType>
	//   17   35:dup             
	//   18   36:ldc1            #40  <String "END">
	//   19   38:iconst_2        
	//   20   39:ldc1            #42  <String "end">
	//   21   41:iconst_2        
	//   22   42:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   23   45:putstatic       #44  <Field StreamSenseEventType END>
		BUFFER = new StreamSenseEventType("BUFFER", 3, "buffer", 3);
	//   24   48:new             #2   <Class StreamSenseEventType>
	//   25   51:dup             
	//   26   52:ldc1            #45  <String "BUFFER">
	//   27   54:iconst_3        
	//   28   55:ldc1            #47  <String "buffer">
	//   29   57:iconst_3        
	//   30   58:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   31   61:putstatic       #49  <Field StreamSenseEventType BUFFER>
		KEEP_ALIVE = new StreamSenseEventType("KEEP_ALIVE", 4, "keep-alive", 4);
	//   32   64:new             #2   <Class StreamSenseEventType>
	//   33   67:dup             
	//   34   68:ldc1            #50  <String "KEEP_ALIVE">
	//   35   70:iconst_4        
	//   36   71:ldc1            #52  <String "keep-alive">
	//   37   73:iconst_4        
	//   38   74:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   39   77:putstatic       #54  <Field StreamSenseEventType KEEP_ALIVE>
		HEART_BEAT = new StreamSenseEventType("HEART_BEAT", 5, "hb", 5);
	//   40   80:new             #2   <Class StreamSenseEventType>
	//   41   83:dup             
	//   42   84:ldc1            #55  <String "HEART_BEAT">
	//   43   86:iconst_5        
	//   44   87:ldc1            #57  <String "hb">
	//   45   89:iconst_5        
	//   46   90:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   47   93:putstatic       #59  <Field StreamSenseEventType HEART_BEAT>
		CUSTOM = new StreamSenseEventType("CUSTOM", 6, "custom", 6);
	//   48   96:new             #2   <Class StreamSenseEventType>
	//   49   99:dup             
	//   50  100:ldc1            #60  <String "CUSTOM">
	//   51  102:bipush          6
	//   52  104:ldc1            #62  <String "custom">
	//   53  106:bipush          6
	//   54  108:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   55  111:putstatic       #64  <Field StreamSenseEventType CUSTOM>
		AD_PLAY = new StreamSenseEventType("AD_PLAY", 7, "ad_play", 7);
	//   56  114:new             #2   <Class StreamSenseEventType>
	//   57  117:dup             
	//   58  118:ldc1            #65  <String "AD_PLAY">
	//   59  120:bipush          7
	//   60  122:ldc1            #67  <String "ad_play">
	//   61  124:bipush          7
	//   62  126:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   63  129:putstatic       #69  <Field StreamSenseEventType AD_PLAY>
		AD_PAUSE = new StreamSenseEventType("AD_PAUSE", 8, "ad_pause", 8);
	//   64  132:new             #2   <Class StreamSenseEventType>
	//   65  135:dup             
	//   66  136:ldc1            #70  <String "AD_PAUSE">
	//   67  138:bipush          8
	//   68  140:ldc1            #72  <String "ad_pause">
	//   69  142:bipush          8
	//   70  144:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   71  147:putstatic       #74  <Field StreamSenseEventType AD_PAUSE>
		AD_END = new StreamSenseEventType("AD_END", 9, "ad_end", 9);
	//   72  150:new             #2   <Class StreamSenseEventType>
	//   73  153:dup             
	//   74  154:ldc1            #75  <String "AD_END">
	//   75  156:bipush          9
	//   76  158:ldc1            #77  <String "ad_end">
	//   77  160:bipush          9
	//   78  162:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   79  165:putstatic       #79  <Field StreamSenseEventType AD_END>
		AD_CLICK = new StreamSenseEventType("AD_CLICK", 10, "ad_click", 10);
	//   80  168:new             #2   <Class StreamSenseEventType>
	//   81  171:dup             
	//   82  172:ldc1            #80  <String "AD_CLICK">
	//   83  174:bipush          10
	//   84  176:ldc1            #82  <String "ad_click">
	//   85  178:bipush          10
	//   86  180:invokespecial   #32  <Method void StreamSenseEventType(String, int, String, int)>
	//   87  183:putstatic       #84  <Field StreamSenseEventType AD_CLICK>
		c = (new StreamSenseEventType[] {
			PLAY, PAUSE, END, BUFFER, KEEP_ALIVE, HEART_BEAT, CUSTOM, AD_PLAY, AD_PAUSE, AD_END, 
			AD_CLICK
		});
	//   88  186:bipush          11
	//   89  188:anewarray       StreamSenseEventType[]
	//   90  191:dup             
	//   91  192:iconst_0        
	//   92  193:getstatic       #34  <Field StreamSenseEventType PLAY>
	//   93  196:aastore         
	//   94  197:dup             
	//   95  198:iconst_1        
	//   96  199:getstatic       #39  <Field StreamSenseEventType PAUSE>
	//   97  202:aastore         
	//   98  203:dup             
	//   99  204:iconst_2        
	//  100  205:getstatic       #44  <Field StreamSenseEventType END>
	//  101  208:aastore         
	//  102  209:dup             
	//  103  210:iconst_3        
	//  104  211:getstatic       #49  <Field StreamSenseEventType BUFFER>
	//  105  214:aastore         
	//  106  215:dup             
	//  107  216:iconst_4        
	//  108  217:getstatic       #54  <Field StreamSenseEventType KEEP_ALIVE>
	//  109  220:aastore         
	//  110  221:dup             
	//  111  222:iconst_5        
	//  112  223:getstatic       #59  <Field StreamSenseEventType HEART_BEAT>
	//  113  226:aastore         
	//  114  227:dup             
	//  115  228:bipush          6
	//  116  230:getstatic       #64  <Field StreamSenseEventType CUSTOM>
	//  117  233:aastore         
	//  118  234:dup             
	//  119  235:bipush          7
	//  120  237:getstatic       #69  <Field StreamSenseEventType AD_PLAY>
	//  121  240:aastore         
	//  122  241:dup             
	//  123  242:bipush          8
	//  124  244:getstatic       #74  <Field StreamSenseEventType AD_PAUSE>
	//  125  247:aastore         
	//  126  248:dup             
	//  127  249:bipush          9
	//  128  251:getstatic       #79  <Field StreamSenseEventType AD_END>
	//  129  254:aastore         
	//  130  255:dup             
	//  131  256:bipush          10
	//  132  258:getstatic       #84  <Field StreamSenseEventType AD_CLICK>
	//  133  261:aastore         
	//  134  262:putstatic       #86  <Field StreamSenseEventType[] c>
	//* 135  265:return          
	}
}
