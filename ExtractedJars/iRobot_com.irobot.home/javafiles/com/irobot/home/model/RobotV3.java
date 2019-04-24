// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.irobot.home.model.rest.History;
import com.irobot.home.model.rest.MissionHistory;
import java.util.Locale;

// Referenced classes of package com.irobot.home.model:
//			t, RobotSystem, RobotPreferences, RobotAvailableLanguages, 
//			Schedule, MissionStatus, NetworkSettings, HourMinTime, 
//			OtaUpgradeStatus, CloudConfig

public class RobotV3
	implements Parcelable
{

	public RobotV3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
		d = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #63  <String "">
	//    4    7:putfield        #65  <Field String d>
		e = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #63  <String "">
	//    7   13:putfield        #67  <Field String e>
		f = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #63  <String "">
	//   10   19:putfield        #69  <Field String f>
		p = new History();
	//   11   22:aload_0         
	//   12   23:new             #71  <Class History>
	//   13   26:dup             
	//   14   27:invokespecial   #72  <Method void History()>
	//   15   30:putfield        #74  <Field History p>
		q = new MissionHistory();
	//   16   33:aload_0         
	//   17   34:new             #76  <Class MissionHistory>
	//   18   37:dup             
	//   19   38:invokespecial   #77  <Method void MissionHistory()>
	//   20   41:putfield        #79  <Field MissionHistory q>
		i = t.UNKNOWN;
	//   21   44:aload_0         
	//   22   45:getstatic       #84  <Field t t.UNKNOWN>
	//   23   48:putfield        #86  <Field t i>
		a = new RobotSystem();
	//   24   51:aload_0         
	//   25   52:new             #88  <Class RobotSystem>
	//   26   55:dup             
	//   27   56:invokespecial   #89  <Method void RobotSystem()>
	//   28   59:putfield        #91  <Field RobotSystem a>
		h = new RobotPreferences();
	//   29   62:aload_0         
	//   30   63:new             #93  <Class RobotPreferences>
	//   31   66:dup             
	//   32   67:invokespecial   #94  <Method void RobotPreferences()>
	//   33   70:putfield        #96  <Field RobotPreferences h>
		m = new RobotAvailableLanguages();
	//   34   73:aload_0         
	//   35   74:new             #98  <Class RobotAvailableLanguages>
	//   36   77:dup             
	//   37   78:invokespecial   #99  <Method void RobotAvailableLanguages()>
	//   38   81:putfield        #101 <Field RobotAvailableLanguages m>
		g = new Schedule();
	//   39   84:aload_0         
	//   40   85:new             #103 <Class Schedule>
	//   41   88:dup             
	//   42   89:invokespecial   #104 <Method void Schedule()>
	//   43   92:putfield        #106 <Field Schedule g>
		j = new MissionStatus();
	//   44   95:aload_0         
	//   45   96:new             #108 <Class MissionStatus>
	//   46   99:dup             
	//   47  100:invokespecial   #109 <Method void MissionStatus()>
	//   48  103:putfield        #111 <Field MissionStatus j>
		k = new NetworkSettings();
	//   49  106:aload_0         
	//   50  107:new             #113 <Class NetworkSettings>
	//   51  110:dup             
	//   52  111:invokespecial   #114 <Method void NetworkSettings()>
	//   53  114:putfield        #116 <Field NetworkSettings k>
		l = new HourMinTime();
	//   54  117:aload_0         
	//   55  118:new             #118 <Class HourMinTime>
	//   56  121:dup             
	//   57  122:invokespecial   #119 <Method void HourMinTime()>
	//   58  125:putfield        #121 <Field HourMinTime l>
		n = new OtaUpgradeStatus();
	//   59  128:aload_0         
	//   60  129:new             #123 <Class OtaUpgradeStatus>
	//   61  132:dup             
	//   62  133:invokespecial   #124 <Method void OtaUpgradeStatus()>
	//   63  136:putfield        #126 <Field OtaUpgradeStatus n>
		o = new CloudConfig();
	//   64  139:aload_0         
	//   65  140:new             #128 <Class CloudConfig>
	//   66  143:dup             
	//   67  144:invokespecial   #129 <Method void CloudConfig()>
	//   68  147:putfield        #131 <Field CloudConfig o>
	//   69  150:return          
	}

	public RobotV3(Parcel parcel)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void RobotV3()>
		i = t.valueOf(parcel.readString());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #139 <Method String Parcel.readString()>
	//    5    9:invokestatic    #143 <Method t t.valueOf(String)>
	//    6   12:putfield        #86  <Field t i>
		d = parcel.readString();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #139 <Method String Parcel.readString()>
	//   10   20:putfield        #65  <Field String d>
		g = (Schedule)parcel.readParcelable(((Class) (com/irobot/home/model/Schedule)).getClassLoader());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:ldc1            #103 <Class Schedule>
	//   14   27:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   15   30:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   16   33:checkcast       #103 <Class Schedule>
	//   17   36:putfield        #106 <Field Schedule g>
		a = (RobotSystem)parcel.readParcelable(((Class) (com/irobot/home/model/RobotSystem)).getClassLoader());
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:ldc1            #88  <Class RobotSystem>
	//   21   43:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   22   46:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   23   49:checkcast       #88  <Class RobotSystem>
	//   24   52:putfield        #91  <Field RobotSystem a>
		h = (RobotPreferences)parcel.readParcelable(((Class) (com/irobot/home/model/RobotPreferences)).getClassLoader());
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:ldc1            #93  <Class RobotPreferences>
	//   28   59:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   29   62:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   30   65:checkcast       #93  <Class RobotPreferences>
	//   31   68:putfield        #96  <Field RobotPreferences h>
		m = (RobotAvailableLanguages)parcel.readParcelable(((Class) (com/irobot/home/model/RobotAvailableLanguages)).getClassLoader());
	//   32   71:aload_0         
	//   33   72:aload_1         
	//   34   73:ldc1            #98  <Class RobotAvailableLanguages>
	//   35   75:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   36   78:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   37   81:checkcast       #98  <Class RobotAvailableLanguages>
	//   38   84:putfield        #101 <Field RobotAvailableLanguages m>
		j = (MissionStatus)parcel.readParcelable(((Class) (com/irobot/home/model/MissionStatus)).getClassLoader());
	//   39   87:aload_0         
	//   40   88:aload_1         
	//   41   89:ldc1            #108 <Class MissionStatus>
	//   42   91:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   43   94:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   44   97:checkcast       #108 <Class MissionStatus>
	//   45  100:putfield        #111 <Field MissionStatus j>
		k = (NetworkSettings)parcel.readParcelable(((Class) (com/irobot/home/model/NetworkSettings)).getClassLoader());
	//   46  103:aload_0         
	//   47  104:aload_1         
	//   48  105:ldc1            #113 <Class NetworkSettings>
	//   49  107:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   50  110:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   51  113:checkcast       #113 <Class NetworkSettings>
	//   52  116:putfield        #116 <Field NetworkSettings k>
		l = (HourMinTime)parcel.readParcelable(((Class) (com/irobot/home/model/HourMinTime)).getClassLoader());
	//   53  119:aload_0         
	//   54  120:aload_1         
	//   55  121:ldc1            #118 <Class HourMinTime>
	//   56  123:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   57  126:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   58  129:checkcast       #118 <Class HourMinTime>
	//   59  132:putfield        #121 <Field HourMinTime l>
		o = (CloudConfig)parcel.readParcelable(((Class) (com/irobot/home/model/CloudConfig)).getClassLoader());
	//   60  135:aload_0         
	//   61  136:aload_1         
	//   62  137:ldc1            #128 <Class CloudConfig>
	//   63  139:invokevirtual   #149 <Method ClassLoader Class.getClassLoader()>
	//   64  142:invokevirtual   #153 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   65  145:checkcast       #128 <Class CloudConfig>
	//   66  148:putfield        #131 <Field CloudConfig o>
		e = parcel.readString();
	//   67  151:aload_0         
	//   68  152:aload_1         
	//   69  153:invokevirtual   #139 <Method String Parcel.readString()>
	//   70  156:putfield        #67  <Field String e>
		f = parcel.readString();
	//   71  159:aload_0         
	//   72  160:aload_1         
	//   73  161:invokevirtual   #139 <Method String Parcel.readString()>
	//   74  164:putfield        #69  <Field String f>
	//   75  167:return          
	}

	public RobotPreferences a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field RobotPreferences h>
	//    2    4:areturn         
	}

	public void a(String s)
	{
		h.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field RobotPreferences h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #157 <Method void RobotPreferences.a(String)>
	//    4    8:return          
	}

	public NetworkSettings b()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field NetworkSettings k>
	//    2    4:areturn         
	}

	public String c()
	{
		if(TextUtils.isEmpty(((CharSequence) (h.b()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field RobotPreferences h>
	//*   2    4:invokevirtual   #160 <Method String RobotPreferences.b()>
	//*   3    7:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            66
		{
			Object obj;
			if(TextUtils.isEmpty(((CharSequence) (e()))))
	//*   5   13:aload_0         
	//*   6   14:invokevirtual   #168 <Method String e()>
	//*   7   17:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   20:ifeq            34
			{
				obj = "Roomba 890";
	//    9   23:ldc1            #170 <String "Roomba 890">
	//   10   25:astore_1        
			} else
	//*  11   26:aload_0         
	//*  12   27:aload_1         
	//*  13   28:invokevirtual   #171 <Method void a(String)>
	//*  14   31:goto            66
			{
				obj = ((Object) (new StringBuilder()));
	//   15   34:new             #173 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #174 <Method void StringBuilder()>
	//   18   41:astore_1        
				((StringBuilder) (obj)).append("Roomba_");
	//   19   42:aload_1         
	//   20   43:ldc1            #176 <String "Roomba_">
	//   21   45:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				((StringBuilder) (obj)).append(e());
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:invokevirtual   #168 <Method String e()>
	//   26   54:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   58:aload_1         
	//   29   59:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   30   62:astore_1        
			}
			a(((String) (obj)));
		}
	//*  31   63:goto            26
		return h.b();
	//   32   66:aload_0         
	//   33   67:getfield        #96  <Field RobotPreferences h>
	//   34   70:invokevirtual   #160 <Method String RobotPreferences.b()>
	//   35   73:areturn         
	}

	public String d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String d>
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
	//    1    1:getfield        #91  <Field RobotSystem a>
	//    2    4:invokevirtual   #187 <Method String RobotSystem.a()>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null && (obj instanceof RobotV3))
	//*   0    0:aload_1         
	//*   1    1:ifnull          75
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class RobotV3>
	//*   4    8:ifeq            75
		{
			obj = ((Object) ((RobotV3)obj));
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class RobotV3>
	//    7   15:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (((RobotV3) (obj)).a.a()))) && !TextUtils.isEmpty(((CharSequence) (a.a()))))
	//*   8   16:aload_1         
	//*   9   17:getfield        #91  <Field RobotSystem a>
	//*  10   20:invokevirtual   #187 <Method String RobotSystem.a()>
	//*  11   23:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   26:ifne            63
	//*  13   29:aload_0         
	//*  14   30:getfield        #91  <Field RobotSystem a>
	//*  15   33:invokevirtual   #187 <Method String RobotSystem.a()>
	//*  16   36:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   39:ifeq            45
	//*  18   42:goto            63
				return ((RobotV3) (obj)).a.a().equals(((Object) (a.a())));
	//   19   45:aload_1         
	//   20   46:getfield        #91  <Field RobotSystem a>
	//   21   49:invokevirtual   #187 <Method String RobotSystem.a()>
	//   22   52:aload_0         
	//   23   53:getfield        #91  <Field RobotSystem a>
	//   24   56:invokevirtual   #187 <Method String RobotSystem.a()>
	//   25   59:invokevirtual   #193 <Method boolean String.equals(Object)>
	//   26   62:ireturn         
			else
				return c().equals(((Object) (((RobotV3) (obj)).c())));
	//   27   63:aload_0         
	//   28   64:invokevirtual   #195 <Method String c()>
	//   29   67:aload_1         
	//   30   68:invokevirtual   #195 <Method String c()>
	//   31   71:invokevirtual   #193 <Method boolean String.equals(Object)>
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
		if(e == null || e.isEmpty() || e.toLowerCase(Locale.US).equals("r98----"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field String e>
	//*   2    4:ifnull          35
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field String e>
	//*   5   11:invokevirtual   #198 <Method boolean String.isEmpty()>
	//*   6   14:ifne            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #67  <Field String e>
	//*   9   21:getstatic       #204 <Field Locale Locale.US>
	//*  10   24:invokevirtual   #208 <Method String String.toLowerCase(Locale)>
	//*  11   27:ldc1            #210 <String "r98----">
	//*  12   29:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  13   32:ifeq            41
			e = "R980020";
	//   14   35:aload_0         
	//   15   36:ldc1            #212 <String "R980020">
	//   16   38:putfield        #67  <Field String e>
		return e;
	//   17   41:aload_0         
	//   18   42:getfield        #67  <Field String e>
	//   19   45:areturn         
	}

	public int hashCode()
	{
		return a.a().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field RobotSystem a>
	//    2    4:invokevirtual   #187 <Method String RobotSystem.a()>
	//    3    7:invokevirtual   #215 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(i.name());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #86  <Field t i>
	//    3    5:invokevirtual   #220 <Method String t.name()>
	//    4    8:invokevirtual   #223 <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field String d>
	//    8   16:invokevirtual   #223 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (g)), 0);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #106 <Field Schedule g>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (a)), 0);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #91  <Field RobotSystem a>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (h)), 0);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #96  <Field RobotPreferences h>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (m)), 0);
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #101 <Field RobotAvailableLanguages m>
	//   27   51:iconst_0        
	//   28   52:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (j)), 0);
	//   29   55:aload_1         
	//   30   56:aload_0         
	//   31   57:getfield        #111 <Field MissionStatus j>
	//   32   60:iconst_0        
	//   33   61:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (k)), 0);
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #116 <Field NetworkSettings k>
	//   37   69:iconst_0        
	//   38   70:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (l)), 0);
	//   39   73:aload_1         
	//   40   74:aload_0         
	//   41   75:getfield        #121 <Field HourMinTime l>
	//   42   78:iconst_0        
	//   43   79:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (o)), 0);
	//   44   82:aload_1         
	//   45   83:aload_0         
	//   46   84:getfield        #131 <Field CloudConfig o>
	//   47   87:iconst_0        
	//   48   88:invokevirtual   #227 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeString(e);
	//   49   91:aload_1         
	//   50   92:aload_0         
	//   51   93:getfield        #67  <Field String e>
	//   52   96:invokevirtual   #223 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//   53   99:aload_1         
	//   54  100:aload_0         
	//   55  101:getfield        #69  <Field String f>
	//   56  104:invokevirtual   #223 <Method void Parcel.writeString(String)>
	//   57  107:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotV3 a(Parcel parcel)
		{
			return new RobotV3(parcel);
		//    0    0:new             #9   <Class RobotV3>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotV3(Parcel)>
		//    4    8:areturn         
		}

		public RobotV3[] a(int i1)
		{
			return new RobotV3[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotV3[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotV3 a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotV3[] a(int)>
		//    3    5:areturn         
		}

	}
;
	static final int b[][] = {
		{
			0, 0, 1, 1, 0, 0, 1, 0
		}, {
			0, 0, 1, 0, 0, 0, 1, 0
		}, {
			0, 0, 1, 0, 0, 0, 0, 0
		}
	};
	static final int c[][] = {
		{
			1, 1, 1, 1, 0, 0, 1, 0
		}, {
			1, 1, 1, 1, 0, 0, 1, 0
		}, {
			0, 0, 1, 0, 0, 0, 0, 0
		}
	};
	public RobotSystem a;
	private String d;
	private String e;
	private String f;
	private transient Schedule g;
	private RobotPreferences h;
	private transient t i;
	private transient MissionStatus j;
	private NetworkSettings k;
	private transient HourMinTime l;
	private transient RobotAvailableLanguages m;
	private transient OtaUpgradeStatus n;
	private CloudConfig o;
	private transient History p;
	private transient MissionHistory q;

	static 
	{
	//    0    0:new             #8   <Class RobotV3$1>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void RobotV3$1()>
	//    3    7:putstatic       #53  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:iconst_3        
	//    5   11:anewarray       int[][]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:bipush          8
	//    9   18:newarray        int[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:iconst_0        
	//   13   23:iastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:iconst_0        
	//   17   27:iastore         
	//   18   28:dup             
	//   19   29:iconst_2        
	//   20   30:iconst_1        
	//   21   31:iastore         
	//   22   32:dup             
	//   23   33:iconst_3        
	//   24   34:iconst_1        
	//   25   35:iastore         
	//   26   36:dup             
	//   27   37:iconst_4        
	//   28   38:iconst_0        
	//   29   39:iastore         
	//   30   40:dup             
	//   31   41:iconst_5        
	//   32   42:iconst_0        
	//   33   43:iastore         
	//   34   44:dup             
	//   35   45:bipush          6
	//   36   47:iconst_1        
	//   37   48:iastore         
	//   38   49:dup             
	//   39   50:bipush          7
	//   40   52:iconst_0        
	//   41   53:iastore         
	//   42   54:aastore         
	//   43   55:dup             
	//   44   56:iconst_1        
	//   45   57:bipush          8
	//   46   59:newarray        int[]
	//   47   61:dup             
	//   48   62:iconst_0        
	//   49   63:iconst_0        
	//   50   64:iastore         
	//   51   65:dup             
	//   52   66:iconst_1        
	//   53   67:iconst_0        
	//   54   68:iastore         
	//   55   69:dup             
	//   56   70:iconst_2        
	//   57   71:iconst_1        
	//   58   72:iastore         
	//   59   73:dup             
	//   60   74:iconst_3        
	//   61   75:iconst_0        
	//   62   76:iastore         
	//   63   77:dup             
	//   64   78:iconst_4        
	//   65   79:iconst_0        
	//   66   80:iastore         
	//   67   81:dup             
	//   68   82:iconst_5        
	//   69   83:iconst_0        
	//   70   84:iastore         
	//   71   85:dup             
	//   72   86:bipush          6
	//   73   88:iconst_1        
	//   74   89:iastore         
	//   75   90:dup             
	//   76   91:bipush          7
	//   77   93:iconst_0        
	//   78   94:iastore         
	//   79   95:aastore         
	//   80   96:dup             
	//   81   97:iconst_2        
	//   82   98:bipush          8
	//   83  100:newarray        int[]
	//   84  102:dup             
	//   85  103:iconst_0        
	//   86  104:iconst_0        
	//   87  105:iastore         
	//   88  106:dup             
	//   89  107:iconst_1        
	//   90  108:iconst_0        
	//   91  109:iastore         
	//   92  110:dup             
	//   93  111:iconst_2        
	//   94  112:iconst_1        
	//   95  113:iastore         
	//   96  114:dup             
	//   97  115:iconst_3        
	//   98  116:iconst_0        
	//   99  117:iastore         
	//  100  118:dup             
	//  101  119:iconst_4        
	//  102  120:iconst_0        
	//  103  121:iastore         
	//  104  122:dup             
	//  105  123:iconst_5        
	//  106  124:iconst_0        
	//  107  125:iastore         
	//  108  126:dup             
	//  109  127:bipush          6
	//  110  129:iconst_0        
	//  111  130:iastore         
	//  112  131:dup             
	//  113  132:bipush          7
	//  114  134:iconst_0        
	//  115  135:iastore         
	//  116  136:aastore         
	//  117  137:putstatic       #57  <Field int[][] b>
	//  118  140:iconst_3        
	//  119  141:anewarray       int[][]
	//  120  144:dup             
	//  121  145:iconst_0        
	//  122  146:bipush          8
	//  123  148:newarray        int[]
	//  124  150:dup             
	//  125  151:iconst_0        
	//  126  152:iconst_1        
	//  127  153:iastore         
	//  128  154:dup             
	//  129  155:iconst_1        
	//  130  156:iconst_1        
	//  131  157:iastore         
	//  132  158:dup             
	//  133  159:iconst_2        
	//  134  160:iconst_1        
	//  135  161:iastore         
	//  136  162:dup             
	//  137  163:iconst_3        
	//  138  164:iconst_1        
	//  139  165:iastore         
	//  140  166:dup             
	//  141  167:iconst_4        
	//  142  168:iconst_0        
	//  143  169:iastore         
	//  144  170:dup             
	//  145  171:iconst_5        
	//  146  172:iconst_0        
	//  147  173:iastore         
	//  148  174:dup             
	//  149  175:bipush          6
	//  150  177:iconst_1        
	//  151  178:iastore         
	//  152  179:dup             
	//  153  180:bipush          7
	//  154  182:iconst_0        
	//  155  183:iastore         
	//  156  184:aastore         
	//  157  185:dup             
	//  158  186:iconst_1        
	//  159  187:bipush          8
	//  160  189:newarray        int[]
	//  161  191:dup             
	//  162  192:iconst_0        
	//  163  193:iconst_1        
	//  164  194:iastore         
	//  165  195:dup             
	//  166  196:iconst_1        
	//  167  197:iconst_1        
	//  168  198:iastore         
	//  169  199:dup             
	//  170  200:iconst_2        
	//  171  201:iconst_1        
	//  172  202:iastore         
	//  173  203:dup             
	//  174  204:iconst_3        
	//  175  205:iconst_1        
	//  176  206:iastore         
	//  177  207:dup             
	//  178  208:iconst_4        
	//  179  209:iconst_0        
	//  180  210:iastore         
	//  181  211:dup             
	//  182  212:iconst_5        
	//  183  213:iconst_0        
	//  184  214:iastore         
	//  185  215:dup             
	//  186  216:bipush          6
	//  187  218:iconst_1        
	//  188  219:iastore         
	//  189  220:dup             
	//  190  221:bipush          7
	//  191  223:iconst_0        
	//  192  224:iastore         
	//  193  225:aastore         
	//  194  226:dup             
	//  195  227:iconst_2        
	//  196  228:bipush          8
	//  197  230:newarray        int[]
	//  198  232:dup             
	//  199  233:iconst_0        
	//  200  234:iconst_0        
	//  201  235:iastore         
	//  202  236:dup             
	//  203  237:iconst_1        
	//  204  238:iconst_0        
	//  205  239:iastore         
	//  206  240:dup             
	//  207  241:iconst_2        
	//  208  242:iconst_1        
	//  209  243:iastore         
	//  210  244:dup             
	//  211  245:iconst_3        
	//  212  246:iconst_0        
	//  213  247:iastore         
	//  214  248:dup             
	//  215  249:iconst_4        
	//  216  250:iconst_0        
	//  217  251:iastore         
	//  218  252:dup             
	//  219  253:iconst_5        
	//  220  254:iconst_0        
	//  221  255:iastore         
	//  222  256:dup             
	//  223  257:bipush          6
	//  224  259:iconst_0        
	//  225  260:iastore         
	//  226  261:dup             
	//  227  262:bipush          7
	//  228  264:iconst_0        
	//  229  265:iastore         
	//  230  266:aastore         
	//  231  267:putstatic       #59  <Field int[][] c>
	//* 232  270:return          
	}
}
