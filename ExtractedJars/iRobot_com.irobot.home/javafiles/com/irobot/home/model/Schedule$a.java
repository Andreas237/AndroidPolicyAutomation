// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;


// Referenced classes of package com.irobot.home.model:
//			Schedule

public static final class Schedule$a extends Enum
{

	public static Schedule$a valueOf(String s)
	{
		return (Schedule$a)Enum.valueOf(com/irobot/home/model/Schedule$a, s);
	//    0    0:ldc1            #2   <Class Schedule$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #69  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Schedule$a>
	//    4    9:areturn         
	}

	public static Schedule$a[] values()
	{
		return (Schedule$a[])((Schedule$a []) ($VALUES)).clone();
	//    0    0:getstatic       #56  <Field Schedule$a[] $VALUES>
	//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.irobot.home.model.Schedule$a_3B_.clone()>
	//    2    6:checkcast       #72  <Class Schedule$a[]>
	//    3    9:areturn         
	}

	public final int getDayStringId()
	{
		return mDayStringId;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int mDayStringId>
	//    2    4:ireturn         
	}

	private static final Schedule$a $VALUES[];
	public static final Schedule$a Friday;
	public static final Schedule$a Monday;
	public static final Schedule$a Saturday;
	public static final Schedule$a Sunday;
	public static final Schedule$a Thursday;
	public static final Schedule$a Tuesday;
	public static final Schedule$a Wednesday;
	private final int mDayStringId;

	static 
	{
		Sunday = new Schedule$a("Sunday", 0, 0x7f0f08a6);
	//    0    0:new             #2   <Class Schedule$a>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "Sunday">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <Int 0x7f0f08a6>
	//    5    9:invokespecial   #28  <Method void Schedule$a(String, int, int)>
	//    6   12:putstatic       #30  <Field Schedule$a Sunday>
		Monday = new Schedule$a("Monday", 1, 0x7f0f0498);
	//    7   15:new             #2   <Class Schedule$a>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "Monday">
	//   10   21:iconst_1        
	//   11   22:ldc1            #32  <Int 0x7f0f0498>
	//   12   24:invokespecial   #28  <Method void Schedule$a(String, int, int)>
	//   13   27:putstatic       #34  <Field Schedule$a Monday>
		Tuesday = new Schedule$a("Tuesday", 2, 0x7f0f090f);
	//   14   30:new             #2   <Class Schedule$a>
	//   15   33:dup             
	//   16   34:ldc1            #35  <String "Tuesday">
	//   17   36:iconst_2        
	//   18   37:ldc1            #36  <Int 0x7f0f090f>
	//   19   39:invokespecial   #28  <Method void Schedule$a(String, int, int)>
	//   20   42:putstatic       #38  <Field Schedule$a Tuesday>
		Wednesday = new Schedule$a("Wednesday", 3, 0x7f0f0961);
	//   21   45:new             #2   <Class Schedule$a>
	//   22   48:dup             
	//   23   49:ldc1            #39  <String "Wednesday">
	//   24   51:iconst_3        
	//   25   52:ldc1            #40  <Int 0x7f0f0961>
	//   26   54:invokespecial   #28  <Method void Schedule$a(String, int, int)>
	//   27   57:putstatic       #42  <Field Schedule$a Wednesday>
		Thursday = new Schedule$a("Thursday", 4, 0x7f0f08bd);
	//   28   60:new             #2   <Class Schedule$a>
	//   29   63:dup             
	//   30   64:ldc1            #43  <String "Thursday">
	//   31   66:iconst_4        
	//   32   67:ldc1            #44  <Int 0x7f0f08bd>
	//   33   69:invokespecial   #28  <Method void Schedule$a(String, int, int)>
	//   34   72:putstatic       #46  <Field Schedule$a Thursday>
		Friday = new Schedule$a("Friday", 5, 0x7f0f033b);
	//   35   75:new             #2   <Class Schedule$a>
	//   36   78:dup             
	//   37   79:ldc1            #47  <String "Friday">
	//   38   81:iconst_5        
	//   39   82:ldc1            #48  <Int 0x7f0f033b>
	//   40   84:invokespecial   #28  <Method void Schedule$a(String, int, int)>
	//   41   87:putstatic       #50  <Field Schedule$a Friday>
		Saturday = new Schedule$a("Saturday", 6, 0x7f0f07b9);
	//   42   90:new             #2   <Class Schedule$a>
	//   43   93:dup             
	//   44   94:ldc1            #51  <String "Saturday">
	//   45   96:bipush          6
	//   46   98:ldc1            #52  <Int 0x7f0f07b9>
	//   47  100:invokespecial   #28  <Method void Schedule$a(String, int, int)>
	//   48  103:putstatic       #54  <Field Schedule$a Saturday>
		$VALUES = (new Schedule$a[] {
			Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
		});
	//   49  106:bipush          7
	//   50  108:anewarray       Schedule$a[]
	//   51  111:dup             
	//   52  112:iconst_0        
	//   53  113:getstatic       #30  <Field Schedule$a Sunday>
	//   54  116:aastore         
	//   55  117:dup             
	//   56  118:iconst_1        
	//   57  119:getstatic       #34  <Field Schedule$a Monday>
	//   58  122:aastore         
	//   59  123:dup             
	//   60  124:iconst_2        
	//   61  125:getstatic       #38  <Field Schedule$a Tuesday>
	//   62  128:aastore         
	//   63  129:dup             
	//   64  130:iconst_3        
	//   65  131:getstatic       #42  <Field Schedule$a Wednesday>
	//   66  134:aastore         
	//   67  135:dup             
	//   68  136:iconst_4        
	//   69  137:getstatic       #46  <Field Schedule$a Thursday>
	//   70  140:aastore         
	//   71  141:dup             
	//   72  142:iconst_5        
	//   73  143:getstatic       #50  <Field Schedule$a Friday>
	//   74  146:aastore         
	//   75  147:dup             
	//   76  148:bipush          6
	//   77  150:getstatic       #54  <Field Schedule$a Saturday>
	//   78  153:aastore         
	//   79  154:putstatic       #56  <Field Schedule$a[] $VALUES>
	//*  80  157:return          
	}

	private Schedule$a(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #60  <Method void Enum(String, int)>
		mDayStringId = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #62  <Field int mDayStringId>
	//    7   11:return          
	}
}
