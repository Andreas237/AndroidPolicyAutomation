// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;

import com.appboy.support.AppboyLogger;

public final class Month extends Enum
{

	private Month(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #80  <Method void Enum(String, int)>
		b = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #82  <Field int b>
	//    7   11:return          
	}

	public static Month getMonth(int i)
	{
		Month amonth[] = values();
	//    0    0:invokestatic    #90  <Method Month[] values()>
	//    1    3:astore_3        
		int k = amonth.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int j = 0; j < k; j++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          38
		{
			Month month = amonth[j];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(month.getValue() == i)
	//*  14   19:aload           4
	//*  15   21:invokevirtual   #94  <Method int getValue()>
	//*  16   24:iload_0         
	//*  17   25:icmpne          31
				return month;
	//   18   28:aload           4
	//   19   30:areturn         
		}

	//   20   31:iload_1         
	//   21   32:iconst_1        
	//   22   33:iadd            
	//   23   34:istore_1        
	//*  24   35:goto            9
		String s = a;
	//   25   38:getstatic       #76  <Field String a>
	//   26   41:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   27   42:new             #96  <Class StringBuilder>
	//   28   45:dup             
	//   29   46:invokespecial   #98  <Method void StringBuilder()>
	//   30   49:astore          4
		stringbuilder.append("No month with value ");
	//   31   51:aload           4
	//   32   53:ldc1            #100 <String "No month with value ">
	//   33   55:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   34   58:pop             
		stringbuilder.append(i);
	//   35   59:aload           4
	//   36   61:iload_0         
	//   37   62:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   38   65:pop             
		stringbuilder.append(", value must be in (0,11)");
	//   39   66:aload           4
	//   40   68:ldc1            #109 <String ", value must be in (0,11)">
	//   41   70:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   42   73:pop             
		AppboyLogger.e(s, stringbuilder.toString());
	//   43   74:aload_3         
	//   44   75:aload           4
	//   45   77:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   46   80:invokestatic    #117 <Method int AppboyLogger.e(String, String)>
	//   47   83:pop             
		return null;
	//   48   84:aconst_null     
	//   49   85:areturn         
	}

	public static Month valueOf(String s)
	{
		return (Month)Enum.valueOf(com/appboy/enums/Month, s);
	//    0    0:ldc1            #2   <Class Month>
	//    1    2:aload_0         
	//    2    3:invokestatic    #122 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Month>
	//    4    9:areturn         
	}

	public static Month[] values()
	{
		return (Month[])((Month []) (c)).clone();
	//    0    0:getstatic       #68  <Field Month[] c>
	//    1    3:invokevirtual   #127 <Method Object _5B_Lcom.appboy.enums.Month_3B_.clone()>
	//    2    6:checkcast       #123 <Class Month[]>
	//    3    9:areturn         
	}

	public int getValue()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int b>
	//    2    4:ireturn         
	}

	public static final Month APRIL;
	public static final Month AUGUST;
	public static final Month DECEMBER;
	public static final Month FEBRUARY;
	public static final Month JANUARY;
	public static final Month JULY;
	public static final Month JUNE;
	public static final Month MARCH;
	public static final Month MAY;
	public static final Month NOVEMBER;
	public static final Month OCTOBER;
	public static final Month SEPTEMBER;
	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/enums/Month);
	private static final Month c[];
	private final int b;

	static 
	{
		JANUARY = new Month("JANUARY", 0, 0);
	//    0    0:new             #2   <Class Month>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "JANUARY">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #31  <Method void Month(String, int, int)>
	//    6   11:putstatic       #33  <Field Month JANUARY>
		FEBRUARY = new Month("FEBRUARY", 1, 1);
	//    7   14:new             #2   <Class Month>
	//    8   17:dup             
	//    9   18:ldc1            #34  <String "FEBRUARY">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #31  <Method void Month(String, int, int)>
	//   13   25:putstatic       #36  <Field Month FEBRUARY>
		MARCH = new Month("MARCH", 2, 2);
	//   14   28:new             #2   <Class Month>
	//   15   31:dup             
	//   16   32:ldc1            #37  <String "MARCH">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #31  <Method void Month(String, int, int)>
	//   20   39:putstatic       #39  <Field Month MARCH>
		APRIL = new Month("APRIL", 3, 3);
	//   21   42:new             #2   <Class Month>
	//   22   45:dup             
	//   23   46:ldc1            #40  <String "APRIL">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #31  <Method void Month(String, int, int)>
	//   27   53:putstatic       #42  <Field Month APRIL>
		MAY = new Month("MAY", 4, 4);
	//   28   56:new             #2   <Class Month>
	//   29   59:dup             
	//   30   60:ldc1            #43  <String "MAY">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #31  <Method void Month(String, int, int)>
	//   34   67:putstatic       #45  <Field Month MAY>
		JUNE = new Month("JUNE", 5, 5);
	//   35   70:new             #2   <Class Month>
	//   36   73:dup             
	//   37   74:ldc1            #46  <String "JUNE">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #31  <Method void Month(String, int, int)>
	//   41   81:putstatic       #48  <Field Month JUNE>
		JULY = new Month("JULY", 6, 6);
	//   42   84:new             #2   <Class Month>
	//   43   87:dup             
	//   44   88:ldc1            #49  <String "JULY">
	//   45   90:bipush          6
	//   46   92:bipush          6
	//   47   94:invokespecial   #31  <Method void Month(String, int, int)>
	//   48   97:putstatic       #51  <Field Month JULY>
		AUGUST = new Month("AUGUST", 7, 7);
	//   49  100:new             #2   <Class Month>
	//   50  103:dup             
	//   51  104:ldc1            #52  <String "AUGUST">
	//   52  106:bipush          7
	//   53  108:bipush          7
	//   54  110:invokespecial   #31  <Method void Month(String, int, int)>
	//   55  113:putstatic       #54  <Field Month AUGUST>
		SEPTEMBER = new Month("SEPTEMBER", 8, 8);
	//   56  116:new             #2   <Class Month>
	//   57  119:dup             
	//   58  120:ldc1            #55  <String "SEPTEMBER">
	//   59  122:bipush          8
	//   60  124:bipush          8
	//   61  126:invokespecial   #31  <Method void Month(String, int, int)>
	//   62  129:putstatic       #57  <Field Month SEPTEMBER>
		OCTOBER = new Month("OCTOBER", 9, 9);
	//   63  132:new             #2   <Class Month>
	//   64  135:dup             
	//   65  136:ldc1            #58  <String "OCTOBER">
	//   66  138:bipush          9
	//   67  140:bipush          9
	//   68  142:invokespecial   #31  <Method void Month(String, int, int)>
	//   69  145:putstatic       #60  <Field Month OCTOBER>
		NOVEMBER = new Month("NOVEMBER", 10, 10);
	//   70  148:new             #2   <Class Month>
	//   71  151:dup             
	//   72  152:ldc1            #61  <String "NOVEMBER">
	//   73  154:bipush          10
	//   74  156:bipush          10
	//   75  158:invokespecial   #31  <Method void Month(String, int, int)>
	//   76  161:putstatic       #63  <Field Month NOVEMBER>
		DECEMBER = new Month("DECEMBER", 11, 11);
	//   77  164:new             #2   <Class Month>
	//   78  167:dup             
	//   79  168:ldc1            #64  <String "DECEMBER">
	//   80  170:bipush          11
	//   81  172:bipush          11
	//   82  174:invokespecial   #31  <Method void Month(String, int, int)>
	//   83  177:putstatic       #66  <Field Month DECEMBER>
		c = (new Month[] {
			JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, 
			NOVEMBER, DECEMBER
		});
	//   84  180:bipush          12
	//   85  182:anewarray       Month[]
	//   86  185:dup             
	//   87  186:iconst_0        
	//   88  187:getstatic       #33  <Field Month JANUARY>
	//   89  190:aastore         
	//   90  191:dup             
	//   91  192:iconst_1        
	//   92  193:getstatic       #36  <Field Month FEBRUARY>
	//   93  196:aastore         
	//   94  197:dup             
	//   95  198:iconst_2        
	//   96  199:getstatic       #39  <Field Month MARCH>
	//   97  202:aastore         
	//   98  203:dup             
	//   99  204:iconst_3        
	//  100  205:getstatic       #42  <Field Month APRIL>
	//  101  208:aastore         
	//  102  209:dup             
	//  103  210:iconst_4        
	//  104  211:getstatic       #45  <Field Month MAY>
	//  105  214:aastore         
	//  106  215:dup             
	//  107  216:iconst_5        
	//  108  217:getstatic       #48  <Field Month JUNE>
	//  109  220:aastore         
	//  110  221:dup             
	//  111  222:bipush          6
	//  112  224:getstatic       #51  <Field Month JULY>
	//  113  227:aastore         
	//  114  228:dup             
	//  115  229:bipush          7
	//  116  231:getstatic       #54  <Field Month AUGUST>
	//  117  234:aastore         
	//  118  235:dup             
	//  119  236:bipush          8
	//  120  238:getstatic       #57  <Field Month SEPTEMBER>
	//  121  241:aastore         
	//  122  242:dup             
	//  123  243:bipush          9
	//  124  245:getstatic       #60  <Field Month OCTOBER>
	//  125  248:aastore         
	//  126  249:dup             
	//  127  250:bipush          10
	//  128  252:getstatic       #63  <Field Month NOVEMBER>
	//  129  255:aastore         
	//  130  256:dup             
	//  131  257:bipush          11
	//  132  259:getstatic       #66  <Field Month DECEMBER>
	//  133  262:aastore         
	//  134  263:putstatic       #68  <Field Month[] c>
	//  135  266:ldc1            #2   <Class Month>
	//  136  268:invokestatic    #74  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//  137  271:putstatic       #76  <Field String a>
	//* 138  274:return          
	}
}
