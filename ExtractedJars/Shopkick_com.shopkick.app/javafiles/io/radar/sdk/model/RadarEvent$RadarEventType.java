// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;


// Referenced classes of package io.radar.sdk.model:
//			RadarEvent

public static final class RadarEvent$RadarEventType extends Enum
{

	public static RadarEvent$RadarEventType valueOf(String s)
	{
		return (RadarEvent$RadarEventType)Enum.valueOf(io/radar/sdk/model/RadarEvent$RadarEventType, s);
	//    0    0:ldc1            #2   <Class RadarEvent$RadarEventType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #88  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RadarEvent$RadarEventType>
	//    4    9:areturn         
	}

	public static RadarEvent$RadarEventType[] values()
	{
		return (RadarEvent$RadarEventType[])((RadarEvent$RadarEventType []) ($VALUES)).clone();
	//    0    0:getstatic       #80  <Field RadarEvent$RadarEventType[] $VALUES>
	//    1    3:invokevirtual   #95  <Method Object _5B_Lio.radar.sdk.model.RadarEvent$RadarEventType_3B_.clone()>
	//    2    6:checkcast       #91  <Class RadarEvent$RadarEventType[]>
	//    3    9:areturn         
	}

	private static final RadarEvent$RadarEventType $VALUES[];
	public static final RadarEvent$RadarEventType UNKNOWN;
	public static final RadarEvent$RadarEventType USER_ENTERED_GEOFENCE;
	public static final RadarEvent$RadarEventType USER_ENTERED_HOME;
	public static final RadarEvent$RadarEventType USER_ENTERED_OFFICE;
	public static final RadarEvent$RadarEventType USER_ENTERED_PLACE;
	public static final RadarEvent$RadarEventType USER_EXITED_GEOFENCE;
	public static final RadarEvent$RadarEventType USER_EXITED_HOME;
	public static final RadarEvent$RadarEventType USER_EXITED_OFFICE;
	public static final RadarEvent$RadarEventType USER_EXITED_PLACE;
	public static final RadarEvent$RadarEventType USER_NEARBY_PLACE_CHAIN;
	public static final RadarEvent$RadarEventType USER_STARTED_TRAVELING;
	public static final RadarEvent$RadarEventType USER_STOPPED_TRAVELING;

	static 
	{
		RadarEvent$RadarEventType radarevent$radareventtype = new RadarEvent$RadarEventType("UNKNOWN", 0);
	//    0    0:new             #2   <Class RadarEvent$RadarEventType>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//    5   10:astore_0        
		UNKNOWN = radarevent$radareventtype;
	//    6   11:aload_0         
	//    7   12:putstatic       #45  <Field RadarEvent$RadarEventType UNKNOWN>
		RadarEvent$RadarEventType radarevent$radareventtype1 = new RadarEvent$RadarEventType("USER_ENTERED_GEOFENCE", 1);
	//    8   15:new             #2   <Class RadarEvent$RadarEventType>
	//    9   18:dup             
	//   10   19:ldc1            #46  <String "USER_ENTERED_GEOFENCE">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   13   25:astore_1        
		USER_ENTERED_GEOFENCE = radarevent$radareventtype1;
	//   14   26:aload_1         
	//   15   27:putstatic       #48  <Field RadarEvent$RadarEventType USER_ENTERED_GEOFENCE>
		RadarEvent$RadarEventType radarevent$radareventtype2 = new RadarEvent$RadarEventType("USER_EXITED_GEOFENCE", 2);
	//   16   30:new             #2   <Class RadarEvent$RadarEventType>
	//   17   33:dup             
	//   18   34:ldc1            #49  <String "USER_EXITED_GEOFENCE">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   21   40:astore_2        
		USER_EXITED_GEOFENCE = radarevent$radareventtype2;
	//   22   41:aload_2         
	//   23   42:putstatic       #51  <Field RadarEvent$RadarEventType USER_EXITED_GEOFENCE>
		RadarEvent$RadarEventType radarevent$radareventtype3 = new RadarEvent$RadarEventType("USER_ENTERED_HOME", 3);
	//   24   45:new             #2   <Class RadarEvent$RadarEventType>
	//   25   48:dup             
	//   26   49:ldc1            #52  <String "USER_ENTERED_HOME">
	//   27   51:iconst_3        
	//   28   52:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   29   55:astore_3        
		USER_ENTERED_HOME = radarevent$radareventtype3;
	//   30   56:aload_3         
	//   31   57:putstatic       #54  <Field RadarEvent$RadarEventType USER_ENTERED_HOME>
		RadarEvent$RadarEventType radarevent$radareventtype4 = new RadarEvent$RadarEventType("USER_EXITED_HOME", 4);
	//   32   60:new             #2   <Class RadarEvent$RadarEventType>
	//   33   63:dup             
	//   34   64:ldc1            #55  <String "USER_EXITED_HOME">
	//   35   66:iconst_4        
	//   36   67:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   37   70:astore          4
		USER_EXITED_HOME = radarevent$radareventtype4;
	//   38   72:aload           4
	//   39   74:putstatic       #57  <Field RadarEvent$RadarEventType USER_EXITED_HOME>
		RadarEvent$RadarEventType radarevent$radareventtype5 = new RadarEvent$RadarEventType("USER_ENTERED_OFFICE", 5);
	//   40   77:new             #2   <Class RadarEvent$RadarEventType>
	//   41   80:dup             
	//   42   81:ldc1            #58  <String "USER_ENTERED_OFFICE">
	//   43   83:iconst_5        
	//   44   84:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   45   87:astore          5
		USER_ENTERED_OFFICE = radarevent$radareventtype5;
	//   46   89:aload           5
	//   47   91:putstatic       #60  <Field RadarEvent$RadarEventType USER_ENTERED_OFFICE>
		RadarEvent$RadarEventType radarevent$radareventtype6 = new RadarEvent$RadarEventType("USER_EXITED_OFFICE", 6);
	//   48   94:new             #2   <Class RadarEvent$RadarEventType>
	//   49   97:dup             
	//   50   98:ldc1            #61  <String "USER_EXITED_OFFICE">
	//   51  100:bipush          6
	//   52  102:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   53  105:astore          6
		USER_EXITED_OFFICE = radarevent$radareventtype6;
	//   54  107:aload           6
	//   55  109:putstatic       #63  <Field RadarEvent$RadarEventType USER_EXITED_OFFICE>
		RadarEvent$RadarEventType radarevent$radareventtype7 = new RadarEvent$RadarEventType("USER_STARTED_TRAVELING", 7);
	//   56  112:new             #2   <Class RadarEvent$RadarEventType>
	//   57  115:dup             
	//   58  116:ldc1            #64  <String "USER_STARTED_TRAVELING">
	//   59  118:bipush          7
	//   60  120:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   61  123:astore          7
		USER_STARTED_TRAVELING = radarevent$radareventtype7;
	//   62  125:aload           7
	//   63  127:putstatic       #66  <Field RadarEvent$RadarEventType USER_STARTED_TRAVELING>
		RadarEvent$RadarEventType radarevent$radareventtype8 = new RadarEvent$RadarEventType("USER_STOPPED_TRAVELING", 8);
	//   64  130:new             #2   <Class RadarEvent$RadarEventType>
	//   65  133:dup             
	//   66  134:ldc1            #67  <String "USER_STOPPED_TRAVELING">
	//   67  136:bipush          8
	//   68  138:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   69  141:astore          8
		USER_STOPPED_TRAVELING = radarevent$radareventtype8;
	//   70  143:aload           8
	//   71  145:putstatic       #69  <Field RadarEvent$RadarEventType USER_STOPPED_TRAVELING>
		RadarEvent$RadarEventType radarevent$radareventtype9 = new RadarEvent$RadarEventType("USER_ENTERED_PLACE", 9);
	//   72  148:new             #2   <Class RadarEvent$RadarEventType>
	//   73  151:dup             
	//   74  152:ldc1            #70  <String "USER_ENTERED_PLACE">
	//   75  154:bipush          9
	//   76  156:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   77  159:astore          9
		USER_ENTERED_PLACE = radarevent$radareventtype9;
	//   78  161:aload           9
	//   79  163:putstatic       #72  <Field RadarEvent$RadarEventType USER_ENTERED_PLACE>
		RadarEvent$RadarEventType radarevent$radareventtype10 = new RadarEvent$RadarEventType("USER_EXITED_PLACE", 10);
	//   80  166:new             #2   <Class RadarEvent$RadarEventType>
	//   81  169:dup             
	//   82  170:ldc1            #73  <String "USER_EXITED_PLACE">
	//   83  172:bipush          10
	//   84  174:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   85  177:astore          10
		USER_EXITED_PLACE = radarevent$radareventtype10;
	//   86  179:aload           10
	//   87  181:putstatic       #75  <Field RadarEvent$RadarEventType USER_EXITED_PLACE>
		RadarEvent$RadarEventType radarevent$radareventtype11 = new RadarEvent$RadarEventType("USER_NEARBY_PLACE_CHAIN", 11);
	//   88  184:new             #2   <Class RadarEvent$RadarEventType>
	//   89  187:dup             
	//   90  188:ldc1            #76  <String "USER_NEARBY_PLACE_CHAIN">
	//   91  190:bipush          11
	//   92  192:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
	//   93  195:astore          11
		USER_NEARBY_PLACE_CHAIN = radarevent$radareventtype11;
	//   94  197:aload           11
	//   95  199:putstatic       #78  <Field RadarEvent$RadarEventType USER_NEARBY_PLACE_CHAIN>
		$VALUES = (new RadarEvent$RadarEventType[] {
			radarevent$radareventtype, radarevent$radareventtype1, radarevent$radareventtype2, radarevent$radareventtype3, radarevent$radareventtype4, radarevent$radareventtype5, radarevent$radareventtype6, radarevent$radareventtype7, radarevent$radareventtype8, radarevent$radareventtype9, 
			radarevent$radareventtype10, radarevent$radareventtype11
		});
	//   96  202:bipush          12
	//   97  204:anewarray       RadarEvent$RadarEventType[]
	//   98  207:dup             
	//   99  208:iconst_0        
	//  100  209:aload_0         
	//  101  210:aastore         
	//  102  211:dup             
	//  103  212:iconst_1        
	//  104  213:aload_1         
	//  105  214:aastore         
	//  106  215:dup             
	//  107  216:iconst_2        
	//  108  217:aload_2         
	//  109  218:aastore         
	//  110  219:dup             
	//  111  220:iconst_3        
	//  112  221:aload_3         
	//  113  222:aastore         
	//  114  223:dup             
	//  115  224:iconst_4        
	//  116  225:aload           4
	//  117  227:aastore         
	//  118  228:dup             
	//  119  229:iconst_5        
	//  120  230:aload           5
	//  121  232:aastore         
	//  122  233:dup             
	//  123  234:bipush          6
	//  124  236:aload           6
	//  125  238:aastore         
	//  126  239:dup             
	//  127  240:bipush          7
	//  128  242:aload           7
	//  129  244:aastore         
	//  130  245:dup             
	//  131  246:bipush          8
	//  132  248:aload           8
	//  133  250:aastore         
	//  134  251:dup             
	//  135  252:bipush          9
	//  136  254:aload           9
	//  137  256:aastore         
	//  138  257:dup             
	//  139  258:bipush          10
	//  140  260:aload           10
	//  141  262:aastore         
	//  142  263:dup             
	//  143  264:bipush          11
	//  144  266:aload           11
	//  145  268:aastore         
	//  146  269:putstatic       #80  <Field RadarEvent$RadarEventType[] $VALUES>
	//* 147  272:return          
	}

	protected RadarEvent$RadarEventType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #82  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
