// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.DayOfTheWeek;
import com.irobot.core.ScheduleCycleType;
import java.util.*;

// Referenced classes of package com.irobot.home.model:
//			x, ScheduleDay

public class Schedule
	implements Parcelable
{
	public static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/irobot/home/model/Schedule$a, s);
		//    0    0:ldc1            #2   <Class Schedule$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #69  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Schedule$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
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

		private static final a $VALUES[];
		public static final a Friday;
		public static final a Monday;
		public static final a Saturday;
		public static final a Sunday;
		public static final a Thursday;
		public static final a Tuesday;
		public static final a Wednesday;
		private final int mDayStringId;

		static 
		{
			Sunday = new a("Sunday", 0, 0x7f0f08a6);
		//    0    0:new             #2   <Class Schedule$a>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "Sunday">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <Int 0x7f0f08a6>
		//    5    9:invokespecial   #28  <Method void Schedule$a(String, int, int)>
		//    6   12:putstatic       #30  <Field Schedule$a Sunday>
			Monday = new a("Monday", 1, 0x7f0f0498);
		//    7   15:new             #2   <Class Schedule$a>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "Monday">
		//   10   21:iconst_1        
		//   11   22:ldc1            #32  <Int 0x7f0f0498>
		//   12   24:invokespecial   #28  <Method void Schedule$a(String, int, int)>
		//   13   27:putstatic       #34  <Field Schedule$a Monday>
			Tuesday = new a("Tuesday", 2, 0x7f0f090f);
		//   14   30:new             #2   <Class Schedule$a>
		//   15   33:dup             
		//   16   34:ldc1            #35  <String "Tuesday">
		//   17   36:iconst_2        
		//   18   37:ldc1            #36  <Int 0x7f0f090f>
		//   19   39:invokespecial   #28  <Method void Schedule$a(String, int, int)>
		//   20   42:putstatic       #38  <Field Schedule$a Tuesday>
			Wednesday = new a("Wednesday", 3, 0x7f0f0961);
		//   21   45:new             #2   <Class Schedule$a>
		//   22   48:dup             
		//   23   49:ldc1            #39  <String "Wednesday">
		//   24   51:iconst_3        
		//   25   52:ldc1            #40  <Int 0x7f0f0961>
		//   26   54:invokespecial   #28  <Method void Schedule$a(String, int, int)>
		//   27   57:putstatic       #42  <Field Schedule$a Wednesday>
			Thursday = new a("Thursday", 4, 0x7f0f08bd);
		//   28   60:new             #2   <Class Schedule$a>
		//   29   63:dup             
		//   30   64:ldc1            #43  <String "Thursday">
		//   31   66:iconst_4        
		//   32   67:ldc1            #44  <Int 0x7f0f08bd>
		//   33   69:invokespecial   #28  <Method void Schedule$a(String, int, int)>
		//   34   72:putstatic       #46  <Field Schedule$a Thursday>
			Friday = new a("Friday", 5, 0x7f0f033b);
		//   35   75:new             #2   <Class Schedule$a>
		//   36   78:dup             
		//   37   79:ldc1            #47  <String "Friday">
		//   38   81:iconst_5        
		//   39   82:ldc1            #48  <Int 0x7f0f033b>
		//   40   84:invokespecial   #28  <Method void Schedule$a(String, int, int)>
		//   41   87:putstatic       #50  <Field Schedule$a Friday>
			Saturday = new a("Saturday", 6, 0x7f0f07b9);
		//   42   90:new             #2   <Class Schedule$a>
		//   43   93:dup             
		//   44   94:ldc1            #51  <String "Saturday">
		//   45   96:bipush          6
		//   46   98:ldc1            #52  <Int 0x7f0f07b9>
		//   47  100:invokespecial   #28  <Method void Schedule$a(String, int, int)>
		//   48  103:putstatic       #54  <Field Schedule$a Saturday>
			$VALUES = (new a[] {
				Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
			});
		//   49  106:bipush          7
		//   50  108:anewarray       a[]
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

		private a(String s, int i, int j)
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


	public Schedule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method void Object()>
		d = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #153 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #154 <Method void ArrayList()>
	//    6   12:putfield        #156 <Field ArrayList d>
		a();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #158 <Method void a()>
	//    9   19:return          
	}

	public Schedule(Parcel parcel)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void Schedule()>
		parcel.readTypedList(((java.util.List) (d)), ScheduleDay.CREATOR);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #156 <Field ArrayList d>
	//    5    9:getstatic       #163 <Field android.os.Parcelable$Creator ScheduleDay.CREATOR>
	//    6   12:invokevirtual   #169 <Method void Parcel.readTypedList(java.util.List, android.os.Parcelable$Creator)>
	//    7   15:return          
	}

	public void a()
	{
		a aa[] = a.values();
	//    0    0:invokestatic    #173 <Method Schedule$a[] Schedule$a.values()>
	//    1    3:astore_3        
		int j = aa.length;
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_2         
	//*   9   11:icmpge          41
			a(new ScheduleDay(aa[i], 9, 0, x.NONE));
	//   10   14:aload_0         
	//   11   15:new             #162 <Class ScheduleDay>
	//   12   18:dup             
	//   13   19:aload_3         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:bipush          9
	//   17   24:iconst_0        
	//   18   25:getstatic       #129 <Field x x.NONE>
	//   19   28:invokespecial   #176 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//   20   31:invokevirtual   #179 <Method void a(ScheduleDay)>

	//   21   34:iload_1         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_1        
	//*  25   38:goto            9
	//   26   41:return          
	}

	public void a(ScheduleDay scheduleday)
	{
		d.add(((Object) (scheduleday)));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field ArrayList d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedList(((java.util.List) (d)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #156 <Field ArrayList d>
	//    3    5:invokevirtual   #191 <Method void Parcel.writeTypedList(java.util.List)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Schedule a(Parcel parcel)
		{
			return new Schedule(parcel);
		//    0    0:new             #9   <Class Schedule>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Schedule(Parcel)>
		//    4    8:areturn         
		}

		public Schedule[] a(int i)
		{
			return new Schedule[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Schedule[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method Schedule a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method Schedule[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private static transient Map a;
	private static transient Map b;
	private static transient Map c;
	private ArrayList d;

	static 
	{
	//    0    0:new             #8   <Class Schedule$1>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void Schedule$1()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #33  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #34  <Method void HashMap()>
	//    7   17:astore_0        
		((Map) (hashmap)).put(((Object) (DayOfTheWeek.Sunday)), ((Object) (a.Sunday)));
	//    8   18:aload_0         
	//    9   19:getstatic       #40  <Field DayOfTheWeek DayOfTheWeek.Sunday>
	//   10   22:getstatic       #43  <Field Schedule$a Schedule$a.Sunday>
	//   11   25:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   12   30:pop             
		((Map) (hashmap)).put(((Object) (DayOfTheWeek.Monday)), ((Object) (a.Monday)));
	//   13   31:aload_0         
	//   14   32:getstatic       #52  <Field DayOfTheWeek DayOfTheWeek.Monday>
	//   15   35:getstatic       #54  <Field Schedule$a Schedule$a.Monday>
	//   16   38:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   17   43:pop             
		((Map) (hashmap)).put(((Object) (DayOfTheWeek.Tuesday)), ((Object) (a.Tuesday)));
	//   18   44:aload_0         
	//   19   45:getstatic       #57  <Field DayOfTheWeek DayOfTheWeek.Tuesday>
	//   20   48:getstatic       #59  <Field Schedule$a Schedule$a.Tuesday>
	//   21   51:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   22   56:pop             
		((Map) (hashmap)).put(((Object) (DayOfTheWeek.Wednesday)), ((Object) (a.Wednesday)));
	//   23   57:aload_0         
	//   24   58:getstatic       #62  <Field DayOfTheWeek DayOfTheWeek.Wednesday>
	//   25   61:getstatic       #64  <Field Schedule$a Schedule$a.Wednesday>
	//   26   64:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   27   69:pop             
		((Map) (hashmap)).put(((Object) (DayOfTheWeek.Thursday)), ((Object) (a.Thursday)));
	//   28   70:aload_0         
	//   29   71:getstatic       #67  <Field DayOfTheWeek DayOfTheWeek.Thursday>
	//   30   74:getstatic       #69  <Field Schedule$a Schedule$a.Thursday>
	//   31   77:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   32   82:pop             
		((Map) (hashmap)).put(((Object) (DayOfTheWeek.Friday)), ((Object) (a.Friday)));
	//   33   83:aload_0         
	//   34   84:getstatic       #72  <Field DayOfTheWeek DayOfTheWeek.Friday>
	//   35   87:getstatic       #74  <Field Schedule$a Schedule$a.Friday>
	//   36   90:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   37   95:pop             
		((Map) (hashmap)).put(((Object) (DayOfTheWeek.Saturday)), ((Object) (a.Saturday)));
	//   38   96:aload_0         
	//   39   97:getstatic       #77  <Field DayOfTheWeek DayOfTheWeek.Saturday>
	//   40  100:getstatic       #79  <Field Schedule$a Schedule$a.Saturday>
	//   41  103:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   42  108:pop             
		a = Collections.unmodifiableMap(((Map) (hashmap)));
	//   43  109:aload_0         
	//   44  110:invokestatic    #85  <Method Map Collections.unmodifiableMap(Map)>
	//   45  113:putstatic       #87  <Field Map a>
		hashmap = new HashMap();
	//   46  116:new             #33  <Class HashMap>
	//   47  119:dup             
	//   48  120:invokespecial   #34  <Method void HashMap()>
	//   49  123:astore_0        
		java.util.Map.Entry entry;
		for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(entry.getValue(), entry.getKey()))
	//*  50  124:getstatic       #87  <Field Map a>
	//*  51  127:invokeinterface #91  <Method Set Map.entrySet()>
	//*  52  132:invokeinterface #97  <Method Iterator Set.iterator()>
	//*  53  137:astore_1        
	//*  54  138:aload_1         
	//*  55  139:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//*  56  144:ifeq            179
			entry = (java.util.Map.Entry)iterator.next();
	//   57  147:aload_1         
	//   58  148:invokeinterface #107 <Method Object Iterator.next()>
	//   59  153:checkcast       #109 <Class java.util.Map$Entry>
	//   60  156:astore_2        

	//   61  157:aload_0         
	//   62  158:aload_2         
	//   63  159:invokeinterface #112 <Method Object java.util.Map$Entry.getValue()>
	//   64  164:aload_2         
	//   65  165:invokeinterface #115 <Method Object java.util.Map$Entry.getKey()>
	//   66  170:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   67  175:pop             
	//*  68  176:goto            138
		b = Collections.unmodifiableMap(((Map) (hashmap)));
	//   69  179:aload_0         
	//   70  180:invokestatic    #85  <Method Map Collections.unmodifiableMap(Map)>
	//   71  183:putstatic       #117 <Field Map b>
		hashmap = new HashMap();
	//   72  186:new             #33  <Class HashMap>
	//   73  189:dup             
	//   74  190:invokespecial   #34  <Method void HashMap()>
	//   75  193:astore_0        
		((Map) (hashmap)).put(((Object) (ScheduleCycleType.None)), ((Object) (x.NONE)));
	//   76  194:aload_0         
	//   77  195:getstatic       #123 <Field ScheduleCycleType ScheduleCycleType.None>
	//   78  198:getstatic       #129 <Field x x.NONE>
	//   79  201:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   80  206:pop             
		((Map) (hashmap)).put(((Object) (ScheduleCycleType.Clean)), ((Object) (x.CLEAN)));
	//   81  207:aload_0         
	//   82  208:getstatic       #132 <Field ScheduleCycleType ScheduleCycleType.Clean>
	//   83  211:getstatic       #135 <Field x x.CLEAN>
	//   84  214:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   85  219:pop             
		((Map) (hashmap)).put(((Object) (ScheduleCycleType.Quick)), ((Object) (x.QUICK)));
	//   86  220:aload_0         
	//   87  221:getstatic       #138 <Field ScheduleCycleType ScheduleCycleType.Quick>
	//   88  224:getstatic       #141 <Field x x.QUICK>
	//   89  227:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   90  232:pop             
		((Map) (hashmap)).put(((Object) (ScheduleCycleType.Start)), ((Object) (x.START)));
	//   91  233:aload_0         
	//   92  234:getstatic       #144 <Field ScheduleCycleType ScheduleCycleType.Start>
	//   93  237:getstatic       #147 <Field x x.START>
	//   94  240:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   95  245:pop             
		c = Collections.unmodifiableMap(((Map) (hashmap)));
	//   96  246:aload_0         
	//   97  247:invokestatic    #85  <Method Map Collections.unmodifiableMap(Map)>
	//   98  250:putstatic       #149 <Field Map c>
	//*  99  253:return          
	}
}
