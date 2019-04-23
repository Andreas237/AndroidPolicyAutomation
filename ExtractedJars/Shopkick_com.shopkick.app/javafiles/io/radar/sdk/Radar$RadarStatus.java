// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;


// Referenced classes of package io.radar.sdk:
//			Radar

public static final class Radar$RadarStatus extends Enum
{

	public static Radar$RadarStatus valueOf(String s)
	{
		return (Radar$RadarStatus)Enum.valueOf(io/radar/sdk/Radar$RadarStatus, s);
	//    0    0:ldc1            #2   <Class Radar$RadarStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Radar$RadarStatus>
	//    4    9:areturn         
	}

	public static Radar$RadarStatus[] values()
	{
		return (Radar$RadarStatus[])((Radar$RadarStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #72  <Field Radar$RadarStatus[] $VALUES>
	//    1    3:invokevirtual   #87  <Method Object _5B_Lio.radar.sdk.Radar$RadarStatus_3B_.clone()>
	//    2    6:checkcast       #83  <Class Radar$RadarStatus[]>
	//    3    9:areturn         
	}

	private static final Radar$RadarStatus $VALUES[];
	public static final Radar$RadarStatus ERROR_LOCATION;
	public static final Radar$RadarStatus ERROR_NETWORK;
	public static final Radar$RadarStatus ERROR_PERMISSIONS;
	public static final Radar$RadarStatus ERROR_PUBLISHABLE_KEY;
	public static final Radar$RadarStatus ERROR_RATE_LIMIT;
	public static final Radar$RadarStatus ERROR_SERVER;
	public static final Radar$RadarStatus ERROR_UNAUTHORIZED;
	public static final Radar$RadarStatus ERROR_UNKNOWN;
	public static final Radar$RadarStatus SUCCESS;
	public static final Radar$RadarStatus UNKNOWN;

	static 
	{
		Radar$RadarStatus radar$radarstatus = new Radar$RadarStatus("SUCCESS", 0);
	//    0    0:new             #2   <Class Radar$RadarStatus>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "SUCCESS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//    5   10:astore_0        
		SUCCESS = radar$radarstatus;
	//    6   11:aload_0         
	//    7   12:putstatic       #43  <Field Radar$RadarStatus SUCCESS>
		Radar$RadarStatus radar$radarstatus1 = new Radar$RadarStatus("ERROR_PUBLISHABLE_KEY", 1);
	//    8   15:new             #2   <Class Radar$RadarStatus>
	//    9   18:dup             
	//   10   19:ldc1            #44  <String "ERROR_PUBLISHABLE_KEY">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   13   25:astore_1        
		ERROR_PUBLISHABLE_KEY = radar$radarstatus1;
	//   14   26:aload_1         
	//   15   27:putstatic       #46  <Field Radar$RadarStatus ERROR_PUBLISHABLE_KEY>
		Radar$RadarStatus radar$radarstatus2 = new Radar$RadarStatus("ERROR_PERMISSIONS", 2);
	//   16   30:new             #2   <Class Radar$RadarStatus>
	//   17   33:dup             
	//   18   34:ldc1            #47  <String "ERROR_PERMISSIONS">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   21   40:astore_2        
		ERROR_PERMISSIONS = radar$radarstatus2;
	//   22   41:aload_2         
	//   23   42:putstatic       #49  <Field Radar$RadarStatus ERROR_PERMISSIONS>
		Radar$RadarStatus radar$radarstatus3 = new Radar$RadarStatus("ERROR_LOCATION", 3);
	//   24   45:new             #2   <Class Radar$RadarStatus>
	//   25   48:dup             
	//   26   49:ldc1            #50  <String "ERROR_LOCATION">
	//   27   51:iconst_3        
	//   28   52:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   29   55:astore_3        
		ERROR_LOCATION = radar$radarstatus3;
	//   30   56:aload_3         
	//   31   57:putstatic       #52  <Field Radar$RadarStatus ERROR_LOCATION>
		Radar$RadarStatus radar$radarstatus4 = new Radar$RadarStatus("ERROR_NETWORK", 4);
	//   32   60:new             #2   <Class Radar$RadarStatus>
	//   33   63:dup             
	//   34   64:ldc1            #53  <String "ERROR_NETWORK">
	//   35   66:iconst_4        
	//   36   67:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   37   70:astore          4
		ERROR_NETWORK = radar$radarstatus4;
	//   38   72:aload           4
	//   39   74:putstatic       #55  <Field Radar$RadarStatus ERROR_NETWORK>
		Radar$RadarStatus radar$radarstatus5 = new Radar$RadarStatus("ERROR_UNAUTHORIZED", 5);
	//   40   77:new             #2   <Class Radar$RadarStatus>
	//   41   80:dup             
	//   42   81:ldc1            #56  <String "ERROR_UNAUTHORIZED">
	//   43   83:iconst_5        
	//   44   84:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   45   87:astore          5
		ERROR_UNAUTHORIZED = radar$radarstatus5;
	//   46   89:aload           5
	//   47   91:putstatic       #58  <Field Radar$RadarStatus ERROR_UNAUTHORIZED>
		Radar$RadarStatus radar$radarstatus6 = new Radar$RadarStatus("ERROR_SERVER", 6);
	//   48   94:new             #2   <Class Radar$RadarStatus>
	//   49   97:dup             
	//   50   98:ldc1            #59  <String "ERROR_SERVER">
	//   51  100:bipush          6
	//   52  102:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   53  105:astore          6
		ERROR_SERVER = radar$radarstatus6;
	//   54  107:aload           6
	//   55  109:putstatic       #61  <Field Radar$RadarStatus ERROR_SERVER>
		Radar$RadarStatus radar$radarstatus7 = new Radar$RadarStatus("ERROR_RATE_LIMIT", 7);
	//   56  112:new             #2   <Class Radar$RadarStatus>
	//   57  115:dup             
	//   58  116:ldc1            #62  <String "ERROR_RATE_LIMIT">
	//   59  118:bipush          7
	//   60  120:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   61  123:astore          7
		ERROR_RATE_LIMIT = radar$radarstatus7;
	//   62  125:aload           7
	//   63  127:putstatic       #64  <Field Radar$RadarStatus ERROR_RATE_LIMIT>
		Radar$RadarStatus radar$radarstatus8 = new Radar$RadarStatus("ERROR_UNKNOWN", 8);
	//   64  130:new             #2   <Class Radar$RadarStatus>
	//   65  133:dup             
	//   66  134:ldc1            #65  <String "ERROR_UNKNOWN">
	//   67  136:bipush          8
	//   68  138:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   69  141:astore          8
		ERROR_UNKNOWN = radar$radarstatus8;
	//   70  143:aload           8
	//   71  145:putstatic       #67  <Field Radar$RadarStatus ERROR_UNKNOWN>
		Radar$RadarStatus radar$radarstatus9 = new Radar$RadarStatus("UNKNOWN", 9);
	//   72  148:new             #2   <Class Radar$RadarStatus>
	//   73  151:dup             
	//   74  152:ldc1            #68  <String "UNKNOWN">
	//   75  154:bipush          9
	//   76  156:invokespecial   #41  <Method void Radar$RadarStatus(String, int)>
	//   77  159:astore          9
		UNKNOWN = radar$radarstatus9;
	//   78  161:aload           9
	//   79  163:putstatic       #70  <Field Radar$RadarStatus UNKNOWN>
		$VALUES = (new Radar$RadarStatus[] {
			radar$radarstatus, radar$radarstatus1, radar$radarstatus2, radar$radarstatus3, radar$radarstatus4, radar$radarstatus5, radar$radarstatus6, radar$radarstatus7, radar$radarstatus8, radar$radarstatus9
		});
	//   80  166:bipush          10
	//   81  168:anewarray       Radar$RadarStatus[]
	//   82  171:dup             
	//   83  172:iconst_0        
	//   84  173:aload_0         
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:iconst_1        
	//   88  177:aload_1         
	//   89  178:aastore         
	//   90  179:dup             
	//   91  180:iconst_2        
	//   92  181:aload_2         
	//   93  182:aastore         
	//   94  183:dup             
	//   95  184:iconst_3        
	//   96  185:aload_3         
	//   97  186:aastore         
	//   98  187:dup             
	//   99  188:iconst_4        
	//  100  189:aload           4
	//  101  191:aastore         
	//  102  192:dup             
	//  103  193:iconst_5        
	//  104  194:aload           5
	//  105  196:aastore         
	//  106  197:dup             
	//  107  198:bipush          6
	//  108  200:aload           6
	//  109  202:aastore         
	//  110  203:dup             
	//  111  204:bipush          7
	//  112  206:aload           7
	//  113  208:aastore         
	//  114  209:dup             
	//  115  210:bipush          8
	//  116  212:aload           8
	//  117  214:aastore         
	//  118  215:dup             
	//  119  216:bipush          9
	//  120  218:aload           9
	//  121  220:aastore         
	//  122  221:putstatic       #72  <Field Radar$RadarStatus[] $VALUES>
	//* 123  224:return          
	}

	protected Radar$RadarStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #74  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
