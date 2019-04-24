// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.irobot.home.model.rest.History;
import com.irobot.home.model.rest.MissionHistory;

// Referenced classes of package com.irobot.home.model:
//			t, RobotSystem, RobotPreferences, RobotAvailableLanguages, 
//			Schedule, MissionStatistics, MissionStatus, MissionRunStatistic, 
//			NetworkSettings, MaintenanceInfo, HourMinTime, OtaUpgradeStatus, 
//			ScheduleDay, x

public class RobotV1
	implements Parcelable
{

	public RobotV1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		r = new History();
	//    2    4:aload_0         
	//    3    5:new             #64  <Class History>
	//    4    8:dup             
	//    5    9:invokespecial   #65  <Method void History()>
	//    6   12:putfield        #67  <Field History r>
		s = new MissionHistory();
	//    7   15:aload_0         
	//    8   16:new             #69  <Class MissionHistory>
	//    9   19:dup             
	//   10   20:invokespecial   #70  <Method void MissionHistory()>
	//   11   23:putfield        #72  <Field MissionHistory s>
		e = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #74  <Field int e>
		j = t.UNKNOWN;
	//   15   31:aload_0         
	//   16   32:getstatic       #79  <Field t t.UNKNOWN>
	//   17   35:putfield        #81  <Field t j>
		a = new RobotSystem();
	//   18   38:aload_0         
	//   19   39:new             #83  <Class RobotSystem>
	//   20   42:dup             
	//   21   43:invokespecial   #84  <Method void RobotSystem()>
	//   22   46:putfield        #86  <Field RobotSystem a>
		i = new RobotPreferences();
	//   23   49:aload_0         
	//   24   50:new             #88  <Class RobotPreferences>
	//   25   53:dup             
	//   26   54:invokespecial   #89  <Method void RobotPreferences()>
	//   27   57:putfield        #91  <Field RobotPreferences i>
		p = new RobotAvailableLanguages();
	//   28   60:aload_0         
	//   29   61:new             #93  <Class RobotAvailableLanguages>
	//   30   64:dup             
	//   31   65:invokespecial   #94  <Method void RobotAvailableLanguages()>
	//   32   68:putfield        #96  <Field RobotAvailableLanguages p>
		h = new Schedule();
	//   33   71:aload_0         
	//   34   72:new             #98  <Class Schedule>
	//   35   75:dup             
	//   36   76:invokespecial   #99  <Method void Schedule()>
	//   37   79:putfield        #101 <Field Schedule h>
		b = new MissionStatistics();
	//   38   82:aload_0         
	//   39   83:new             #103 <Class MissionStatistics>
	//   40   86:dup             
	//   41   87:invokespecial   #104 <Method void MissionStatistics()>
	//   42   90:putfield        #106 <Field MissionStatistics b>
		k = new MissionStatus();
	//   43   93:aload_0         
	//   44   94:new             #108 <Class MissionStatus>
	//   45   97:dup             
	//   46   98:invokespecial   #109 <Method void MissionStatus()>
	//   47  101:putfield        #111 <Field MissionStatus k>
		l = new MissionRunStatistic();
	//   48  104:aload_0         
	//   49  105:new             #113 <Class MissionRunStatistic>
	//   50  108:dup             
	//   51  109:invokespecial   #114 <Method void MissionRunStatistic()>
	//   52  112:putfield        #116 <Field MissionRunStatistic l>
		m = new NetworkSettings();
	//   53  115:aload_0         
	//   54  116:new             #118 <Class NetworkSettings>
	//   55  119:dup             
	//   56  120:invokespecial   #119 <Method void NetworkSettings()>
	//   57  123:putfield        #121 <Field NetworkSettings m>
		n = new MaintenanceInfo();
	//   58  126:aload_0         
	//   59  127:new             #123 <Class MaintenanceInfo>
	//   60  130:dup             
	//   61  131:invokespecial   #124 <Method void MaintenanceInfo()>
	//   62  134:putfield        #126 <Field MaintenanceInfo n>
		o = new HourMinTime();
	//   63  137:aload_0         
	//   64  138:new             #128 <Class HourMinTime>
	//   65  141:dup             
	//   66  142:invokespecial   #129 <Method void HourMinTime()>
	//   67  145:putfield        #131 <Field HourMinTime o>
		q = new OtaUpgradeStatus();
	//   68  148:aload_0         
	//   69  149:new             #133 <Class OtaUpgradeStatus>
	//   70  152:dup             
	//   71  153:invokespecial   #134 <Method void OtaUpgradeStatus()>
	//   72  156:putfield        #136 <Field OtaUpgradeStatus q>
		h.a(new ScheduleDay(Schedule.a.Sunday, 9, 0, x.NONE));
	//   73  159:aload_0         
	//   74  160:getfield        #101 <Field Schedule h>
	//   75  163:new             #138 <Class ScheduleDay>
	//   76  166:dup             
	//   77  167:getstatic       #144 <Field Schedule$a Schedule$a.Sunday>
	//   78  170:bipush          9
	//   79  172:iconst_0        
	//   80  173:getstatic       #150 <Field x x.NONE>
	//   81  176:invokespecial   #153 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//   82  179:invokevirtual   #156 <Method void Schedule.a(ScheduleDay)>
		h.a(new ScheduleDay(Schedule.a.Monday, 9, 0, x.NONE));
	//   83  182:aload_0         
	//   84  183:getfield        #101 <Field Schedule h>
	//   85  186:new             #138 <Class ScheduleDay>
	//   86  189:dup             
	//   87  190:getstatic       #159 <Field Schedule$a Schedule$a.Monday>
	//   88  193:bipush          9
	//   89  195:iconst_0        
	//   90  196:getstatic       #150 <Field x x.NONE>
	//   91  199:invokespecial   #153 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//   92  202:invokevirtual   #156 <Method void Schedule.a(ScheduleDay)>
		h.a(new ScheduleDay(Schedule.a.Tuesday, 9, 0, x.NONE));
	//   93  205:aload_0         
	//   94  206:getfield        #101 <Field Schedule h>
	//   95  209:new             #138 <Class ScheduleDay>
	//   96  212:dup             
	//   97  213:getstatic       #162 <Field Schedule$a Schedule$a.Tuesday>
	//   98  216:bipush          9
	//   99  218:iconst_0        
	//  100  219:getstatic       #150 <Field x x.NONE>
	//  101  222:invokespecial   #153 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//  102  225:invokevirtual   #156 <Method void Schedule.a(ScheduleDay)>
		h.a(new ScheduleDay(Schedule.a.Wednesday, 9, 0, x.NONE));
	//  103  228:aload_0         
	//  104  229:getfield        #101 <Field Schedule h>
	//  105  232:new             #138 <Class ScheduleDay>
	//  106  235:dup             
	//  107  236:getstatic       #165 <Field Schedule$a Schedule$a.Wednesday>
	//  108  239:bipush          9
	//  109  241:iconst_0        
	//  110  242:getstatic       #150 <Field x x.NONE>
	//  111  245:invokespecial   #153 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//  112  248:invokevirtual   #156 <Method void Schedule.a(ScheduleDay)>
		h.a(new ScheduleDay(Schedule.a.Thursday, 9, 0, x.NONE));
	//  113  251:aload_0         
	//  114  252:getfield        #101 <Field Schedule h>
	//  115  255:new             #138 <Class ScheduleDay>
	//  116  258:dup             
	//  117  259:getstatic       #168 <Field Schedule$a Schedule$a.Thursday>
	//  118  262:bipush          9
	//  119  264:iconst_0        
	//  120  265:getstatic       #150 <Field x x.NONE>
	//  121  268:invokespecial   #153 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//  122  271:invokevirtual   #156 <Method void Schedule.a(ScheduleDay)>
		h.a(new ScheduleDay(Schedule.a.Friday, 9, 0, x.NONE));
	//  123  274:aload_0         
	//  124  275:getfield        #101 <Field Schedule h>
	//  125  278:new             #138 <Class ScheduleDay>
	//  126  281:dup             
	//  127  282:getstatic       #171 <Field Schedule$a Schedule$a.Friday>
	//  128  285:bipush          9
	//  129  287:iconst_0        
	//  130  288:getstatic       #150 <Field x x.NONE>
	//  131  291:invokespecial   #153 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//  132  294:invokevirtual   #156 <Method void Schedule.a(ScheduleDay)>
		h.a(new ScheduleDay(Schedule.a.Saturday, 9, 0, x.NONE));
	//  133  297:aload_0         
	//  134  298:getfield        #101 <Field Schedule h>
	//  135  301:new             #138 <Class ScheduleDay>
	//  136  304:dup             
	//  137  305:getstatic       #174 <Field Schedule$a Schedule$a.Saturday>
	//  138  308:bipush          9
	//  139  310:iconst_0        
	//  140  311:getstatic       #150 <Field x x.NONE>
	//  141  314:invokespecial   #153 <Method void ScheduleDay(Schedule$a, int, int, x)>
	//  142  317:invokevirtual   #156 <Method void Schedule.a(ScheduleDay)>
	//  143  320:return          
	}

	public RobotV1(Parcel parcel)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #176 <Method void RobotV1()>
		j = t.valueOf(parcel.readString());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #182 <Method String Parcel.readString()>
	//    5    9:invokestatic    #186 <Method t t.valueOf(String)>
	//    6   12:putfield        #81  <Field t j>
		f = parcel.readString();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #182 <Method String Parcel.readString()>
	//   10   20:putfield        #188 <Field String f>
		h = (Schedule)parcel.readParcelable(((Class) (com/irobot/home/model/Schedule)).getClassLoader());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:ldc1            #98  <Class Schedule>
	//   14   27:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   15   30:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   16   33:checkcast       #98  <Class Schedule>
	//   17   36:putfield        #101 <Field Schedule h>
		a = (RobotSystem)parcel.readParcelable(((Class) (com/irobot/home/model/RobotSystem)).getClassLoader());
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:ldc1            #83  <Class RobotSystem>
	//   21   43:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   22   46:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   23   49:checkcast       #83  <Class RobotSystem>
	//   24   52:putfield        #86  <Field RobotSystem a>
		i = (RobotPreferences)parcel.readParcelable(((Class) (com/irobot/home/model/RobotPreferences)).getClassLoader());
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:ldc1            #88  <Class RobotPreferences>
	//   28   59:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   29   62:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   30   65:checkcast       #88  <Class RobotPreferences>
	//   31   68:putfield        #91  <Field RobotPreferences i>
		p = (RobotAvailableLanguages)parcel.readParcelable(((Class) (com/irobot/home/model/RobotAvailableLanguages)).getClassLoader());
	//   32   71:aload_0         
	//   33   72:aload_1         
	//   34   73:ldc1            #93  <Class RobotAvailableLanguages>
	//   35   75:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   36   78:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   37   81:checkcast       #93  <Class RobotAvailableLanguages>
	//   38   84:putfield        #96  <Field RobotAvailableLanguages p>
		b = (MissionStatistics)parcel.readParcelable(((Class) (com/irobot/home/model/MissionStatistics)).getClassLoader());
	//   39   87:aload_0         
	//   40   88:aload_1         
	//   41   89:ldc1            #103 <Class MissionStatistics>
	//   42   91:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   43   94:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   44   97:checkcast       #103 <Class MissionStatistics>
	//   45  100:putfield        #106 <Field MissionStatistics b>
		k = (MissionStatus)parcel.readParcelable(((Class) (com/irobot/home/model/MissionStatus)).getClassLoader());
	//   46  103:aload_0         
	//   47  104:aload_1         
	//   48  105:ldc1            #108 <Class MissionStatus>
	//   49  107:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   50  110:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   51  113:checkcast       #108 <Class MissionStatus>
	//   52  116:putfield        #111 <Field MissionStatus k>
		l = (MissionRunStatistic)parcel.readParcelable(((Class) (com/irobot/home/model/MissionRunStatistic)).getClassLoader());
	//   53  119:aload_0         
	//   54  120:aload_1         
	//   55  121:ldc1            #113 <Class MissionRunStatistic>
	//   56  123:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   57  126:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   58  129:checkcast       #113 <Class MissionRunStatistic>
	//   59  132:putfield        #116 <Field MissionRunStatistic l>
		m = (NetworkSettings)parcel.readParcelable(((Class) (com/irobot/home/model/NetworkSettings)).getClassLoader());
	//   60  135:aload_0         
	//   61  136:aload_1         
	//   62  137:ldc1            #118 <Class NetworkSettings>
	//   63  139:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   64  142:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   65  145:checkcast       #118 <Class NetworkSettings>
	//   66  148:putfield        #121 <Field NetworkSettings m>
		n = (MaintenanceInfo)parcel.readParcelable(((Class) (com/irobot/home/model/MaintenanceInfo)).getClassLoader());
	//   67  151:aload_0         
	//   68  152:aload_1         
	//   69  153:ldc1            #123 <Class MaintenanceInfo>
	//   70  155:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   71  158:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   72  161:checkcast       #123 <Class MaintenanceInfo>
	//   73  164:putfield        #126 <Field MaintenanceInfo n>
		o = (HourMinTime)parcel.readParcelable(((Class) (com/irobot/home/model/HourMinTime)).getClassLoader());
	//   74  167:aload_0         
	//   75  168:aload_1         
	//   76  169:ldc1            #128 <Class HourMinTime>
	//   77  171:invokevirtual   #194 <Method ClassLoader Class.getClassLoader()>
	//   78  174:invokevirtual   #198 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   79  177:checkcast       #128 <Class HourMinTime>
	//   80  180:putfield        #131 <Field HourMinTime o>
		g = parcel.readString();
	//   81  183:aload_0         
	//   82  184:aload_1         
	//   83  185:invokevirtual   #182 <Method String Parcel.readString()>
	//   84  188:putfield        #200 <Field String g>
		e = parcel.readInt();
	//   85  191:aload_0         
	//   86  192:aload_1         
	//   87  193:invokevirtual   #204 <Method int Parcel.readInt()>
	//   88  196:putfield        #74  <Field int e>
	//   89  199:return          
	}

	public RobotPreferences a()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field RobotPreferences i>
	//    2    4:areturn         
	}

	public void a(String s1)
	{
		i.a(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field RobotPreferences i>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #208 <Method void RobotPreferences.a(String)>
	//    4    8:return          
	}

	public NetworkSettings b()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field NetworkSettings m>
	//    2    4:areturn         
	}

	public String c()
	{
		if(TextUtils.isEmpty(((CharSequence) (i.b()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field RobotPreferences i>
	//*   2    4:invokevirtual   #211 <Method String RobotPreferences.b()>
	//*   3    7:invokestatic    #217 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            66
		{
			Object obj;
			if(TextUtils.isEmpty(((CharSequence) (e()))))
	//*   5   13:aload_0         
	//*   6   14:invokevirtual   #219 <Method String e()>
	//*   7   17:invokestatic    #217 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   20:ifeq            34
			{
				obj = "Roomba 890";
	//    9   23:ldc1            #221 <String "Roomba 890">
	//   10   25:astore_1        
			} else
	//*  11   26:aload_0         
	//*  12   27:aload_1         
	//*  13   28:invokevirtual   #222 <Method void a(String)>
	//*  14   31:goto            66
			{
				obj = ((Object) (new StringBuilder()));
	//   15   34:new             #224 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #225 <Method void StringBuilder()>
	//   18   41:astore_1        
				((StringBuilder) (obj)).append("Roomba_");
	//   19   42:aload_1         
	//   20   43:ldc1            #227 <String "Roomba_">
	//   21   45:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				((StringBuilder) (obj)).append(e());
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:invokevirtual   #219 <Method String e()>
	//   26   54:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   58:aload_1         
	//   29   59:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   30   62:astore_1        
			}
			a(((String) (obj)));
		}
	//*  31   63:goto            26
		return i.b();
	//   32   66:aload_0         
	//   33   67:getfield        #91  <Field RobotPreferences i>
	//   34   70:invokevirtual   #211 <Method String RobotPreferences.b()>
	//   35   73:areturn         
	}

	public String d()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field String f>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String e()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field RobotSystem a>
	//    2    4:invokevirtual   #237 <Method String RobotSystem.a()>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null && (obj instanceof RobotV1))
	//*   0    0:aload_1         
	//*   1    1:ifnull          75
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class RobotV1>
	//*   4    8:ifeq            75
		{
			obj = ((Object) ((RobotV1)obj));
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class RobotV1>
	//    7   15:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (((RobotV1) (obj)).a.a()))) && !TextUtils.isEmpty(((CharSequence) (a.a()))))
	//*   8   16:aload_1         
	//*   9   17:getfield        #86  <Field RobotSystem a>
	//*  10   20:invokevirtual   #237 <Method String RobotSystem.a()>
	//*  11   23:invokestatic    #217 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   26:ifne            63
	//*  13   29:aload_0         
	//*  14   30:getfield        #86  <Field RobotSystem a>
	//*  15   33:invokevirtual   #237 <Method String RobotSystem.a()>
	//*  16   36:invokestatic    #217 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   39:ifeq            45
	//*  18   42:goto            63
				return ((RobotV1) (obj)).a.a().equals(((Object) (a.a())));
	//   19   45:aload_1         
	//   20   46:getfield        #86  <Field RobotSystem a>
	//   21   49:invokevirtual   #237 <Method String RobotSystem.a()>
	//   22   52:aload_0         
	//   23   53:getfield        #86  <Field RobotSystem a>
	//   24   56:invokevirtual   #237 <Method String RobotSystem.a()>
	//   25   59:invokevirtual   #243 <Method boolean String.equals(Object)>
	//   26   62:ireturn         
			else
				return c().equals(((Object) (((RobotV1) (obj)).c())));
	//   27   63:aload_0         
	//   28   64:invokevirtual   #245 <Method String c()>
	//   29   67:aload_1         
	//   30   68:invokevirtual   #245 <Method String c()>
	//   31   71:invokevirtual   #243 <Method boolean String.equals(Object)>
	//   32   74:ireturn         
		} else
		{
			return false;
	//   33   75:iconst_0        
	//   34   76:ireturn         
		}
	}

	public String f()
	{
		if(g == null || g.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field String g>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #200 <Field String g>
	//*   5   11:invokevirtual   #248 <Method boolean String.isEmpty()>
	//*   6   14:ifeq            23
			g = "R980020";
	//    7   17:aload_0         
	//    8   18:ldc1            #250 <String "R980020">
	//    9   20:putfield        #200 <Field String g>
		return g;
	//   10   23:aload_0         
	//   11   24:getfield        #200 <Field String g>
	//   12   27:areturn         
	}

	public int hashCode()
	{
		return a.a().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field RobotSystem a>
	//    2    4:invokevirtual   #237 <Method String RobotSystem.a()>
	//    3    7:invokevirtual   #253 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(j.name());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #81  <Field t j>
	//    3    5:invokevirtual   #258 <Method String t.name()>
	//    4    8:invokevirtual   #261 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #188 <Field String f>
	//    8   16:invokevirtual   #261 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (h)), 0);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #101 <Field Schedule h>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (a)), 0);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #86  <Field RobotSystem a>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (i)), 0);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #91  <Field RobotPreferences i>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (p)), 0);
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #96  <Field RobotAvailableLanguages p>
	//   27   51:iconst_0        
	//   28   52:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (b)), 0);
	//   29   55:aload_1         
	//   30   56:aload_0         
	//   31   57:getfield        #106 <Field MissionStatistics b>
	//   32   60:iconst_0        
	//   33   61:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (k)), 0);
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #111 <Field MissionStatus k>
	//   37   69:iconst_0        
	//   38   70:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (l)), 0);
	//   39   73:aload_1         
	//   40   74:aload_0         
	//   41   75:getfield        #116 <Field MissionRunStatistic l>
	//   42   78:iconst_0        
	//   43   79:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (m)), 0);
	//   44   82:aload_1         
	//   45   83:aload_0         
	//   46   84:getfield        #121 <Field NetworkSettings m>
	//   47   87:iconst_0        
	//   48   88:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (n)), 0);
	//   49   91:aload_1         
	//   50   92:aload_0         
	//   51   93:getfield        #126 <Field MaintenanceInfo n>
	//   52   96:iconst_0        
	//   53   97:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (o)), 0);
	//   54  100:aload_1         
	//   55  101:aload_0         
	//   56  102:getfield        #131 <Field HourMinTime o>
	//   57  105:iconst_0        
	//   58  106:invokevirtual   #265 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeString(g);
	//   59  109:aload_1         
	//   60  110:aload_0         
	//   61  111:getfield        #200 <Field String g>
	//   62  114:invokevirtual   #261 <Method void Parcel.writeString(String)>
		parcel.writeInt(e);
	//   63  117:aload_1         
	//   64  118:aload_0         
	//   65  119:getfield        #74  <Field int e>
	//   66  122:invokevirtual   #269 <Method void Parcel.writeInt(int)>
	//   67  125:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotV1 a(Parcel parcel)
		{
			return new RobotV1(parcel);
		//    0    0:new             #9   <Class RobotV1>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotV1(Parcel)>
		//    4    8:areturn         
		}

		public RobotV1[] a(int i1)
		{
			return new RobotV1[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotV1[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotV1 a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotV1[] a(int)>
		//    3    5:areturn         
		}

	}
;
	static final int c[][];
	static final int d[][] = {
		{
			1, 1, 1, 1, 0, 0, 1, 0
		}, {
			1, 1, 1, 1, 0, 0, 1, 0
		}, {
			0, 0, 1, 0, 0, 0, 0, 0
		}
	};
	public RobotSystem a;
	public MissionStatistics b;
	public int e;
	private String f;
	private String g;
	private Schedule h;
	private RobotPreferences i;
	private t j;
	private MissionStatus k;
	private MissionRunStatistic l;
	private NetworkSettings m;
	private MaintenanceInfo n;
	private HourMinTime o;
	private RobotAvailableLanguages p;
	private OtaUpgradeStatus q;
	private History r;
	private MissionHistory s;

	static 
	{
	//    0    0:new             #8   <Class RobotV1$1>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void RobotV1$1()>
	//    3    7:putstatic       #54  <Field android.os.Parcelable$Creator CREATOR>
		int ai[] = {
			0, 0, 1, 0, 0, 0, 1, 0
		};
	//    4   10:bipush          8
	//    5   12:newarray        int[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:iconst_0        
	//    9   17:iastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:iconst_0        
	//   13   21:iastore         
	//   14   22:dup             
	//   15   23:iconst_2        
	//   16   24:iconst_1        
	//   17   25:iastore         
	//   18   26:dup             
	//   19   27:iconst_3        
	//   20   28:iconst_0        
	//   21   29:iastore         
	//   22   30:dup             
	//   23   31:iconst_4        
	//   24   32:iconst_0        
	//   25   33:iastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:iconst_0        
	//   29   37:iastore         
	//   30   38:dup             
	//   31   39:bipush          6
	//   32   41:iconst_1        
	//   33   42:iastore         
	//   34   43:dup             
	//   35   44:bipush          7
	//   36   46:iconst_0        
	//   37   47:iastore         
	//   38   48:astore_0        
		c = (new int[][] {
			new int[] {
				0, 0, 1, 1, 0, 0, 1, 0
			}, ai, new int[] {
				0, 0, 1, 0, 0, 0, 0, 0
			}
		});
	//   39   49:iconst_3        
	//   40   50:anewarray       int[][]
	//   41   53:dup             
	//   42   54:iconst_0        
	//   43   55:bipush          8
	//   44   57:newarray        int[]
	//   45   59:dup             
	//   46   60:iconst_0        
	//   47   61:iconst_0        
	//   48   62:iastore         
	//   49   63:dup             
	//   50   64:iconst_1        
	//   51   65:iconst_0        
	//   52   66:iastore         
	//   53   67:dup             
	//   54   68:iconst_2        
	//   55   69:iconst_1        
	//   56   70:iastore         
	//   57   71:dup             
	//   58   72:iconst_3        
	//   59   73:iconst_1        
	//   60   74:iastore         
	//   61   75:dup             
	//   62   76:iconst_4        
	//   63   77:iconst_0        
	//   64   78:iastore         
	//   65   79:dup             
	//   66   80:iconst_5        
	//   67   81:iconst_0        
	//   68   82:iastore         
	//   69   83:dup             
	//   70   84:bipush          6
	//   71   86:iconst_1        
	//   72   87:iastore         
	//   73   88:dup             
	//   74   89:bipush          7
	//   75   91:iconst_0        
	//   76   92:iastore         
	//   77   93:aastore         
	//   78   94:dup             
	//   79   95:iconst_1        
	//   80   96:aload_0         
	//   81   97:aastore         
	//   82   98:dup             
	//   83   99:iconst_2        
	//   84  100:bipush          8
	//   85  102:newarray        int[]
	//   86  104:dup             
	//   87  105:iconst_0        
	//   88  106:iconst_0        
	//   89  107:iastore         
	//   90  108:dup             
	//   91  109:iconst_1        
	//   92  110:iconst_0        
	//   93  111:iastore         
	//   94  112:dup             
	//   95  113:iconst_2        
	//   96  114:iconst_1        
	//   97  115:iastore         
	//   98  116:dup             
	//   99  117:iconst_3        
	//  100  118:iconst_0        
	//  101  119:iastore         
	//  102  120:dup             
	//  103  121:iconst_4        
	//  104  122:iconst_0        
	//  105  123:iastore         
	//  106  124:dup             
	//  107  125:iconst_5        
	//  108  126:iconst_0        
	//  109  127:iastore         
	//  110  128:dup             
	//  111  129:bipush          6
	//  112  131:iconst_0        
	//  113  132:iastore         
	//  114  133:dup             
	//  115  134:bipush          7
	//  116  136:iconst_0        
	//  117  137:iastore         
	//  118  138:aastore         
	//  119  139:putstatic       #58  <Field int[][] c>
	//  120  142:iconst_3        
	//  121  143:anewarray       int[][]
	//  122  146:dup             
	//  123  147:iconst_0        
	//  124  148:bipush          8
	//  125  150:newarray        int[]
	//  126  152:dup             
	//  127  153:iconst_0        
	//  128  154:iconst_1        
	//  129  155:iastore         
	//  130  156:dup             
	//  131  157:iconst_1        
	//  132  158:iconst_1        
	//  133  159:iastore         
	//  134  160:dup             
	//  135  161:iconst_2        
	//  136  162:iconst_1        
	//  137  163:iastore         
	//  138  164:dup             
	//  139  165:iconst_3        
	//  140  166:iconst_1        
	//  141  167:iastore         
	//  142  168:dup             
	//  143  169:iconst_4        
	//  144  170:iconst_0        
	//  145  171:iastore         
	//  146  172:dup             
	//  147  173:iconst_5        
	//  148  174:iconst_0        
	//  149  175:iastore         
	//  150  176:dup             
	//  151  177:bipush          6
	//  152  179:iconst_1        
	//  153  180:iastore         
	//  154  181:dup             
	//  155  182:bipush          7
	//  156  184:iconst_0        
	//  157  185:iastore         
	//  158  186:aastore         
	//  159  187:dup             
	//  160  188:iconst_1        
	//  161  189:bipush          8
	//  162  191:newarray        int[]
	//  163  193:dup             
	//  164  194:iconst_0        
	//  165  195:iconst_1        
	//  166  196:iastore         
	//  167  197:dup             
	//  168  198:iconst_1        
	//  169  199:iconst_1        
	//  170  200:iastore         
	//  171  201:dup             
	//  172  202:iconst_2        
	//  173  203:iconst_1        
	//  174  204:iastore         
	//  175  205:dup             
	//  176  206:iconst_3        
	//  177  207:iconst_1        
	//  178  208:iastore         
	//  179  209:dup             
	//  180  210:iconst_4        
	//  181  211:iconst_0        
	//  182  212:iastore         
	//  183  213:dup             
	//  184  214:iconst_5        
	//  185  215:iconst_0        
	//  186  216:iastore         
	//  187  217:dup             
	//  188  218:bipush          6
	//  189  220:iconst_1        
	//  190  221:iastore         
	//  191  222:dup             
	//  192  223:bipush          7
	//  193  225:iconst_0        
	//  194  226:iastore         
	//  195  227:aastore         
	//  196  228:dup             
	//  197  229:iconst_2        
	//  198  230:bipush          8
	//  199  232:newarray        int[]
	//  200  234:dup             
	//  201  235:iconst_0        
	//  202  236:iconst_0        
	//  203  237:iastore         
	//  204  238:dup             
	//  205  239:iconst_1        
	//  206  240:iconst_0        
	//  207  241:iastore         
	//  208  242:dup             
	//  209  243:iconst_2        
	//  210  244:iconst_1        
	//  211  245:iastore         
	//  212  246:dup             
	//  213  247:iconst_3        
	//  214  248:iconst_0        
	//  215  249:iastore         
	//  216  250:dup             
	//  217  251:iconst_4        
	//  218  252:iconst_0        
	//  219  253:iastore         
	//  220  254:dup             
	//  221  255:iconst_5        
	//  222  256:iconst_0        
	//  223  257:iastore         
	//  224  258:dup             
	//  225  259:bipush          6
	//  226  261:iconst_0        
	//  227  262:iastore         
	//  228  263:dup             
	//  229  264:bipush          7
	//  230  266:iconst_0        
	//  231  267:iastore         
	//  232  268:aastore         
	//  233  269:putstatic       #60  <Field int[][] d>
	//* 234  272:return          
	}
}
