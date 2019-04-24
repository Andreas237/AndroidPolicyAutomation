// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.regions;


public final class Regions extends Enum
{

	private Regions(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #97  <Method void Enum(String, int)>
		name = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #99  <Field String name>
	//    7   11:return          
	}

	public static Regions fromName(String s)
	{
		Regions aregions[] = values();
	//    0    0:invokestatic    #107 <Method Regions[] values()>
	//    1    3:astore_3        
		int j = aregions.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          41
		{
			Regions regions = aregions[i];
	//   10   14:aload_3         
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:astore          4
			if(s.equals(((Object) (regions.getName()))))
	//*  14   19:aload_0         
	//*  15   20:aload           4
	//*  16   22:invokevirtual   #111 <Method String getName()>
	//*  17   25:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  18   28:ifeq            34
				return regions;
	//   19   31:aload           4
	//   20   33:areturn         
		}

	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_1        
	//*  25   38:goto            9
		StringBuilder stringbuilder = new StringBuilder();
	//   26   41:new             #119 <Class StringBuilder>
	//   27   44:dup             
	//   28   45:invokespecial   #121 <Method void StringBuilder()>
	//   29   48:astore_3        
		stringbuilder.append("Cannot create enum from ");
	//   30   49:aload_3         
	//   31   50:ldc1            #123 <String "Cannot create enum from ">
	//   32   52:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   33   55:pop             
		stringbuilder.append(s);
	//   34   56:aload_3         
	//   35   57:aload_0         
	//   36   58:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   37   61:pop             
		stringbuilder.append(" value!");
	//   38   62:aload_3         
	//   39   63:ldc1            #129 <String " value!">
	//   40   65:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   41   68:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   42   69:new             #131 <Class IllegalArgumentException>
	//   43   72:dup             
	//   44   73:aload_3         
	//   45   74:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   46   77:invokespecial   #136 <Method void IllegalArgumentException(String)>
	//   47   80:athrow          
	}

	public static Regions valueOf(String s)
	{
		return (Regions)Enum.valueOf(com/amazonaws/regions/Regions, s);
	//    0    0:ldc1            #2   <Class Regions>
	//    1    2:aload_0         
	//    2    3:invokestatic    #140 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Regions>
	//    4    9:areturn         
	}

	public static Regions[] values()
	{
		return (Regions[])((Regions []) ($VALUES)).clone();
	//    0    0:getstatic       #91  <Field Regions[] $VALUES>
	//    1    3:invokevirtual   #145 <Method Object _5B_Lcom.amazonaws.regions.Regions_3B_.clone()>
	//    2    6:checkcast       #141 <Class Regions[]>
	//    3    9:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String name>
	//    2    4:areturn         
	}

	private static final Regions $VALUES[];
	public static final Regions AP_NORTHEAST_1;
	public static final Regions AP_NORTHEAST_2;
	public static final Regions AP_SOUTHEAST_1;
	public static final Regions AP_SOUTHEAST_2;
	public static final Regions CN_NORTH_1;
	public static final Regions DEFAULT_REGION;
	public static final Regions EU_CENTRAL_1;
	public static final Regions EU_WEST_1;
	public static final Regions GovCloud;
	public static final Regions SA_EAST_1;
	public static final Regions US_EAST_1;
	public static final Regions US_WEST_1;
	public static final Regions US_WEST_2;
	private final String name;

	static 
	{
		GovCloud = new Regions("GovCloud", 0, "us-gov-west-1");
	//    0    0:new             #2   <Class Regions>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "GovCloud">
	//    3    6:iconst_0        
	//    4    7:ldc1            #28  <String "us-gov-west-1">
	//    5    9:invokespecial   #32  <Method void Regions(String, int, String)>
	//    6   12:putstatic       #34  <Field Regions GovCloud>
		US_EAST_1 = new Regions("US_EAST_1", 1, "us-east-1");
	//    7   15:new             #2   <Class Regions>
	//    8   18:dup             
	//    9   19:ldc1            #35  <String "US_EAST_1">
	//   10   21:iconst_1        
	//   11   22:ldc1            #37  <String "us-east-1">
	//   12   24:invokespecial   #32  <Method void Regions(String, int, String)>
	//   13   27:putstatic       #39  <Field Regions US_EAST_1>
		US_WEST_1 = new Regions("US_WEST_1", 2, "us-west-1");
	//   14   30:new             #2   <Class Regions>
	//   15   33:dup             
	//   16   34:ldc1            #40  <String "US_WEST_1">
	//   17   36:iconst_2        
	//   18   37:ldc1            #42  <String "us-west-1">
	//   19   39:invokespecial   #32  <Method void Regions(String, int, String)>
	//   20   42:putstatic       #44  <Field Regions US_WEST_1>
		US_WEST_2 = new Regions("US_WEST_2", 3, "us-west-2");
	//   21   45:new             #2   <Class Regions>
	//   22   48:dup             
	//   23   49:ldc1            #45  <String "US_WEST_2">
	//   24   51:iconst_3        
	//   25   52:ldc1            #47  <String "us-west-2">
	//   26   54:invokespecial   #32  <Method void Regions(String, int, String)>
	//   27   57:putstatic       #49  <Field Regions US_WEST_2>
		EU_WEST_1 = new Regions("EU_WEST_1", 4, "eu-west-1");
	//   28   60:new             #2   <Class Regions>
	//   29   63:dup             
	//   30   64:ldc1            #50  <String "EU_WEST_1">
	//   31   66:iconst_4        
	//   32   67:ldc1            #52  <String "eu-west-1">
	//   33   69:invokespecial   #32  <Method void Regions(String, int, String)>
	//   34   72:putstatic       #54  <Field Regions EU_WEST_1>
		EU_CENTRAL_1 = new Regions("EU_CENTRAL_1", 5, "eu-central-1");
	//   35   75:new             #2   <Class Regions>
	//   36   78:dup             
	//   37   79:ldc1            #55  <String "EU_CENTRAL_1">
	//   38   81:iconst_5        
	//   39   82:ldc1            #57  <String "eu-central-1">
	//   40   84:invokespecial   #32  <Method void Regions(String, int, String)>
	//   41   87:putstatic       #59  <Field Regions EU_CENTRAL_1>
		AP_SOUTHEAST_1 = new Regions("AP_SOUTHEAST_1", 6, "ap-southeast-1");
	//   42   90:new             #2   <Class Regions>
	//   43   93:dup             
	//   44   94:ldc1            #60  <String "AP_SOUTHEAST_1">
	//   45   96:bipush          6
	//   46   98:ldc1            #62  <String "ap-southeast-1">
	//   47  100:invokespecial   #32  <Method void Regions(String, int, String)>
	//   48  103:putstatic       #64  <Field Regions AP_SOUTHEAST_1>
		AP_SOUTHEAST_2 = new Regions("AP_SOUTHEAST_2", 7, "ap-southeast-2");
	//   49  106:new             #2   <Class Regions>
	//   50  109:dup             
	//   51  110:ldc1            #65  <String "AP_SOUTHEAST_2">
	//   52  112:bipush          7
	//   53  114:ldc1            #67  <String "ap-southeast-2">
	//   54  116:invokespecial   #32  <Method void Regions(String, int, String)>
	//   55  119:putstatic       #69  <Field Regions AP_SOUTHEAST_2>
		AP_NORTHEAST_1 = new Regions("AP_NORTHEAST_1", 8, "ap-northeast-1");
	//   56  122:new             #2   <Class Regions>
	//   57  125:dup             
	//   58  126:ldc1            #70  <String "AP_NORTHEAST_1">
	//   59  128:bipush          8
	//   60  130:ldc1            #72  <String "ap-northeast-1">
	//   61  132:invokespecial   #32  <Method void Regions(String, int, String)>
	//   62  135:putstatic       #74  <Field Regions AP_NORTHEAST_1>
		AP_NORTHEAST_2 = new Regions("AP_NORTHEAST_2", 9, "ap-northeast-2");
	//   63  138:new             #2   <Class Regions>
	//   64  141:dup             
	//   65  142:ldc1            #75  <String "AP_NORTHEAST_2">
	//   66  144:bipush          9
	//   67  146:ldc1            #77  <String "ap-northeast-2">
	//   68  148:invokespecial   #32  <Method void Regions(String, int, String)>
	//   69  151:putstatic       #79  <Field Regions AP_NORTHEAST_2>
		SA_EAST_1 = new Regions("SA_EAST_1", 10, "sa-east-1");
	//   70  154:new             #2   <Class Regions>
	//   71  157:dup             
	//   72  158:ldc1            #80  <String "SA_EAST_1">
	//   73  160:bipush          10
	//   74  162:ldc1            #82  <String "sa-east-1">
	//   75  164:invokespecial   #32  <Method void Regions(String, int, String)>
	//   76  167:putstatic       #84  <Field Regions SA_EAST_1>
		CN_NORTH_1 = new Regions("CN_NORTH_1", 11, "cn-north-1");
	//   77  170:new             #2   <Class Regions>
	//   78  173:dup             
	//   79  174:ldc1            #85  <String "CN_NORTH_1">
	//   80  176:bipush          11
	//   81  178:ldc1            #87  <String "cn-north-1">
	//   82  180:invokespecial   #32  <Method void Regions(String, int, String)>
	//   83  183:putstatic       #89  <Field Regions CN_NORTH_1>
		$VALUES = (new Regions[] {
			GovCloud, US_EAST_1, US_WEST_1, US_WEST_2, EU_WEST_1, EU_CENTRAL_1, AP_SOUTHEAST_1, AP_SOUTHEAST_2, AP_NORTHEAST_1, AP_NORTHEAST_2, 
			SA_EAST_1, CN_NORTH_1
		});
	//   84  186:bipush          12
	//   85  188:anewarray       Regions[]
	//   86  191:dup             
	//   87  192:iconst_0        
	//   88  193:getstatic       #34  <Field Regions GovCloud>
	//   89  196:aastore         
	//   90  197:dup             
	//   91  198:iconst_1        
	//   92  199:getstatic       #39  <Field Regions US_EAST_1>
	//   93  202:aastore         
	//   94  203:dup             
	//   95  204:iconst_2        
	//   96  205:getstatic       #44  <Field Regions US_WEST_1>
	//   97  208:aastore         
	//   98  209:dup             
	//   99  210:iconst_3        
	//  100  211:getstatic       #49  <Field Regions US_WEST_2>
	//  101  214:aastore         
	//  102  215:dup             
	//  103  216:iconst_4        
	//  104  217:getstatic       #54  <Field Regions EU_WEST_1>
	//  105  220:aastore         
	//  106  221:dup             
	//  107  222:iconst_5        
	//  108  223:getstatic       #59  <Field Regions EU_CENTRAL_1>
	//  109  226:aastore         
	//  110  227:dup             
	//  111  228:bipush          6
	//  112  230:getstatic       #64  <Field Regions AP_SOUTHEAST_1>
	//  113  233:aastore         
	//  114  234:dup             
	//  115  235:bipush          7
	//  116  237:getstatic       #69  <Field Regions AP_SOUTHEAST_2>
	//  117  240:aastore         
	//  118  241:dup             
	//  119  242:bipush          8
	//  120  244:getstatic       #74  <Field Regions AP_NORTHEAST_1>
	//  121  247:aastore         
	//  122  248:dup             
	//  123  249:bipush          9
	//  124  251:getstatic       #79  <Field Regions AP_NORTHEAST_2>
	//  125  254:aastore         
	//  126  255:dup             
	//  127  256:bipush          10
	//  128  258:getstatic       #84  <Field Regions SA_EAST_1>
	//  129  261:aastore         
	//  130  262:dup             
	//  131  263:bipush          11
	//  132  265:getstatic       #89  <Field Regions CN_NORTH_1>
	//  133  268:aastore         
	//  134  269:putstatic       #91  <Field Regions[] $VALUES>
		DEFAULT_REGION = US_WEST_2;
	//  135  272:getstatic       #49  <Field Regions US_WEST_2>
	//  136  275:putstatic       #93  <Field Regions DEFAULT_REGION>
	//* 137  278:return          
	}
}
