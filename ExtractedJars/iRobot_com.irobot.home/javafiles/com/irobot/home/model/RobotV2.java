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
//			MissionStatus, NetworkSettings, HourMinTime, OtaUpgradeStatus, 
//			CloudConfig, MissionStatistics

public class RobotV2
	implements Parcelable
{

	public RobotV2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		q = new History();
	//    2    4:aload_0         
	//    3    5:new             #65  <Class History>
	//    4    8:dup             
	//    5    9:invokespecial   #66  <Method void History()>
	//    6   12:putfield        #68  <Field History q>
		r = new MissionHistory();
	//    7   15:aload_0         
	//    8   16:new             #70  <Class MissionHistory>
	//    9   19:dup             
	//   10   20:invokespecial   #71  <Method void MissionHistory()>
	//   11   23:putfield        #73  <Field MissionHistory r>
		e = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #75  <Field int e>
		j = t.UNKNOWN;
	//   15   31:aload_0         
	//   16   32:getstatic       #80  <Field t t.UNKNOWN>
	//   17   35:putfield        #82  <Field t j>
		a = new RobotSystem();
	//   18   38:aload_0         
	//   19   39:new             #84  <Class RobotSystem>
	//   20   42:dup             
	//   21   43:invokespecial   #85  <Method void RobotSystem()>
	//   22   46:putfield        #87  <Field RobotSystem a>
		i = new RobotPreferences();
	//   23   49:aload_0         
	//   24   50:new             #89  <Class RobotPreferences>
	//   25   53:dup             
	//   26   54:invokespecial   #90  <Method void RobotPreferences()>
	//   27   57:putfield        #92  <Field RobotPreferences i>
		n = new RobotAvailableLanguages();
	//   28   60:aload_0         
	//   29   61:new             #94  <Class RobotAvailableLanguages>
	//   30   64:dup             
	//   31   65:invokespecial   #95  <Method void RobotAvailableLanguages()>
	//   32   68:putfield        #97  <Field RobotAvailableLanguages n>
		k = new MissionStatus();
	//   33   71:aload_0         
	//   34   72:new             #99  <Class MissionStatus>
	//   35   75:dup             
	//   36   76:invokespecial   #100 <Method void MissionStatus()>
	//   37   79:putfield        #102 <Field MissionStatus k>
		l = new NetworkSettings();
	//   38   82:aload_0         
	//   39   83:new             #104 <Class NetworkSettings>
	//   40   86:dup             
	//   41   87:invokespecial   #105 <Method void NetworkSettings()>
	//   42   90:putfield        #107 <Field NetworkSettings l>
		m = new HourMinTime();
	//   43   93:aload_0         
	//   44   94:new             #109 <Class HourMinTime>
	//   45   97:dup             
	//   46   98:invokespecial   #110 <Method void HourMinTime()>
	//   47  101:putfield        #112 <Field HourMinTime m>
		o = new OtaUpgradeStatus();
	//   48  104:aload_0         
	//   49  105:new             #114 <Class OtaUpgradeStatus>
	//   50  108:dup             
	//   51  109:invokespecial   #115 <Method void OtaUpgradeStatus()>
	//   52  112:putfield        #117 <Field OtaUpgradeStatus o>
		p = new CloudConfig();
	//   53  115:aload_0         
	//   54  116:new             #119 <Class CloudConfig>
	//   55  119:dup             
	//   56  120:invokespecial   #120 <Method void CloudConfig()>
	//   57  123:putfield        #122 <Field CloudConfig p>
	//   58  126:return          
	}

	public RobotV2(Parcel parcel)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void RobotV2()>
		j = t.valueOf(parcel.readString());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #130 <Method String Parcel.readString()>
	//    5    9:invokestatic    #134 <Method t t.valueOf(String)>
	//    6   12:putfield        #82  <Field t j>
		f = parcel.readString();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #130 <Method String Parcel.readString()>
	//   10   20:putfield        #136 <Field String f>
		a = (RobotSystem)parcel.readParcelable(((Class) (com/irobot/home/model/RobotSystem)).getClassLoader());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:ldc1            #84  <Class RobotSystem>
	//   14   27:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   15   30:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   16   33:checkcast       #84  <Class RobotSystem>
	//   17   36:putfield        #87  <Field RobotSystem a>
		i = (RobotPreferences)parcel.readParcelable(((Class) (com/irobot/home/model/RobotPreferences)).getClassLoader());
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:ldc1            #89  <Class RobotPreferences>
	//   21   43:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   22   46:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   23   49:checkcast       #89  <Class RobotPreferences>
	//   24   52:putfield        #92  <Field RobotPreferences i>
		n = (RobotAvailableLanguages)parcel.readParcelable(((Class) (com/irobot/home/model/RobotAvailableLanguages)).getClassLoader());
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:ldc1            #94  <Class RobotAvailableLanguages>
	//   28   59:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   29   62:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   30   65:checkcast       #94  <Class RobotAvailableLanguages>
	//   31   68:putfield        #97  <Field RobotAvailableLanguages n>
		b = (MissionStatistics)parcel.readParcelable(((Class) (com/irobot/home/model/MissionStatistics)).getClassLoader());
	//   32   71:aload_0         
	//   33   72:aload_1         
	//   34   73:ldc1            #148 <Class MissionStatistics>
	//   35   75:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   36   78:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   37   81:checkcast       #148 <Class MissionStatistics>
	//   38   84:putfield        #150 <Field MissionStatistics b>
		k = (MissionStatus)parcel.readParcelable(((Class) (com/irobot/home/model/MissionStatus)).getClassLoader());
	//   39   87:aload_0         
	//   40   88:aload_1         
	//   41   89:ldc1            #99  <Class MissionStatus>
	//   42   91:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   43   94:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   44   97:checkcast       #99  <Class MissionStatus>
	//   45  100:putfield        #102 <Field MissionStatus k>
		l = (NetworkSettings)parcel.readParcelable(((Class) (com/irobot/home/model/NetworkSettings)).getClassLoader());
	//   46  103:aload_0         
	//   47  104:aload_1         
	//   48  105:ldc1            #104 <Class NetworkSettings>
	//   49  107:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   50  110:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   51  113:checkcast       #104 <Class NetworkSettings>
	//   52  116:putfield        #107 <Field NetworkSettings l>
		m = (HourMinTime)parcel.readParcelable(((Class) (com/irobot/home/model/HourMinTime)).getClassLoader());
	//   53  119:aload_0         
	//   54  120:aload_1         
	//   55  121:ldc1            #109 <Class HourMinTime>
	//   56  123:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   57  126:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   58  129:checkcast       #109 <Class HourMinTime>
	//   59  132:putfield        #112 <Field HourMinTime m>
		p = (CloudConfig)parcel.readParcelable(((Class) (com/irobot/home/model/CloudConfig)).getClassLoader());
	//   60  135:aload_0         
	//   61  136:aload_1         
	//   62  137:ldc1            #119 <Class CloudConfig>
	//   63  139:invokevirtual   #142 <Method ClassLoader Class.getClassLoader()>
	//   64  142:invokevirtual   #146 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   65  145:checkcast       #119 <Class CloudConfig>
	//   66  148:putfield        #122 <Field CloudConfig p>
		g = parcel.readString();
	//   67  151:aload_0         
	//   68  152:aload_1         
	//   69  153:invokevirtual   #130 <Method String Parcel.readString()>
	//   70  156:putfield        #152 <Field String g>
		h = parcel.readString();
	//   71  159:aload_0         
	//   72  160:aload_1         
	//   73  161:invokevirtual   #130 <Method String Parcel.readString()>
	//   74  164:putfield        #154 <Field String h>
		e = parcel.readInt();
	//   75  167:aload_0         
	//   76  168:aload_1         
	//   77  169:invokevirtual   #158 <Method int Parcel.readInt()>
	//   78  172:putfield        #75  <Field int e>
	//   79  175:return          
	}

	public RobotPreferences a()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field RobotPreferences i>
	//    2    4:areturn         
	}

	public void a(String s)
	{
		i.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field RobotPreferences i>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #162 <Method void RobotPreferences.a(String)>
	//    4    8:return          
	}

	public NetworkSettings b()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field NetworkSettings l>
	//    2    4:areturn         
	}

	public String c()
	{
		if(TextUtils.isEmpty(((CharSequence) (i.b()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field RobotPreferences i>
	//*   2    4:invokevirtual   #165 <Method String RobotPreferences.b()>
	//*   3    7:invokestatic    #171 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            66
		{
			Object obj;
			if(TextUtils.isEmpty(((CharSequence) (e()))))
	//*   5   13:aload_0         
	//*   6   14:invokevirtual   #173 <Method String e()>
	//*   7   17:invokestatic    #171 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   20:ifeq            34
			{
				obj = "Roomba 890";
	//    9   23:ldc1            #175 <String "Roomba 890">
	//   10   25:astore_1        
			} else
	//*  11   26:aload_0         
	//*  12   27:aload_1         
	//*  13   28:invokevirtual   #176 <Method void a(String)>
	//*  14   31:goto            66
			{
				obj = ((Object) (new StringBuilder()));
	//   15   34:new             #178 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #179 <Method void StringBuilder()>
	//   18   41:astore_1        
				((StringBuilder) (obj)).append("Roomba_");
	//   19   42:aload_1         
	//   20   43:ldc1            #181 <String "Roomba_">
	//   21   45:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
				((StringBuilder) (obj)).append(e());
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:invokevirtual   #173 <Method String e()>
	//   26   54:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   58:aload_1         
	//   29   59:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   30   62:astore_1        
			}
			a(((String) (obj)));
		}
	//*  31   63:goto            26
		return i.b();
	//   32   66:aload_0         
	//   33   67:getfield        #92  <Field RobotPreferences i>
	//   34   70:invokevirtual   #165 <Method String RobotPreferences.b()>
	//   35   73:areturn         
	}

	public String d()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field String f>
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
	//    1    1:getfield        #87  <Field RobotSystem a>
	//    2    4:invokevirtual   #191 <Method String RobotSystem.a()>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null && (obj instanceof RobotV2))
	//*   0    0:aload_1         
	//*   1    1:ifnull          75
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class RobotV2>
	//*   4    8:ifeq            75
		{
			obj = ((Object) ((RobotV2)obj));
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class RobotV2>
	//    7   15:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (((RobotV2) (obj)).a.a()))) && !TextUtils.isEmpty(((CharSequence) (a.a()))))
	//*   8   16:aload_1         
	//*   9   17:getfield        #87  <Field RobotSystem a>
	//*  10   20:invokevirtual   #191 <Method String RobotSystem.a()>
	//*  11   23:invokestatic    #171 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   26:ifne            63
	//*  13   29:aload_0         
	//*  14   30:getfield        #87  <Field RobotSystem a>
	//*  15   33:invokevirtual   #191 <Method String RobotSystem.a()>
	//*  16   36:invokestatic    #171 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   39:ifeq            45
	//*  18   42:goto            63
				return ((RobotV2) (obj)).a.a().equals(((Object) (a.a())));
	//   19   45:aload_1         
	//   20   46:getfield        #87  <Field RobotSystem a>
	//   21   49:invokevirtual   #191 <Method String RobotSystem.a()>
	//   22   52:aload_0         
	//   23   53:getfield        #87  <Field RobotSystem a>
	//   24   56:invokevirtual   #191 <Method String RobotSystem.a()>
	//   25   59:invokevirtual   #197 <Method boolean String.equals(Object)>
	//   26   62:ireturn         
			else
				return c().equals(((Object) (((RobotV2) (obj)).c())));
	//   27   63:aload_0         
	//   28   64:invokevirtual   #199 <Method String c()>
	//   29   67:aload_1         
	//   30   68:invokevirtual   #199 <Method String c()>
	//   31   71:invokevirtual   #197 <Method boolean String.equals(Object)>
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
	//*   1    1:getfield        #152 <Field String g>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #152 <Field String g>
	//*   5   11:invokevirtual   #202 <Method boolean String.isEmpty()>
	//*   6   14:ifeq            23
			g = "R980020";
	//    7   17:aload_0         
	//    8   18:ldc1            #204 <String "R980020">
	//    9   20:putfield        #152 <Field String g>
		return g;
	//   10   23:aload_0         
	//   11   24:getfield        #152 <Field String g>
	//   12   27:areturn         
	}

	public int hashCode()
	{
		return a.a().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field RobotSystem a>
	//    2    4:invokevirtual   #191 <Method String RobotSystem.a()>
	//    3    7:invokevirtual   #207 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(j.name());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field t j>
	//    3    5:invokevirtual   #212 <Method String t.name()>
	//    4    8:invokevirtual   #215 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #136 <Field String f>
	//    8   16:invokevirtual   #215 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (a)), 0);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #87  <Field RobotSystem a>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (i)), 0);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #92  <Field RobotPreferences i>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (n)), 0);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #97  <Field RobotAvailableLanguages n>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (b)), 0);
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #150 <Field MissionStatistics b>
	//   27   51:iconst_0        
	//   28   52:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (k)), 0);
	//   29   55:aload_1         
	//   30   56:aload_0         
	//   31   57:getfield        #102 <Field MissionStatus k>
	//   32   60:iconst_0        
	//   33   61:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (l)), 0);
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #107 <Field NetworkSettings l>
	//   37   69:iconst_0        
	//   38   70:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (m)), 0);
	//   39   73:aload_1         
	//   40   74:aload_0         
	//   41   75:getfield        #112 <Field HourMinTime m>
	//   42   78:iconst_0        
	//   43   79:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (p)), 0);
	//   44   82:aload_1         
	//   45   83:aload_0         
	//   46   84:getfield        #122 <Field CloudConfig p>
	//   47   87:iconst_0        
	//   48   88:invokevirtual   #219 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeString(g);
	//   49   91:aload_1         
	//   50   92:aload_0         
	//   51   93:getfield        #152 <Field String g>
	//   52   96:invokevirtual   #215 <Method void Parcel.writeString(String)>
		parcel.writeString(h);
	//   53   99:aload_1         
	//   54  100:aload_0         
	//   55  101:getfield        #154 <Field String h>
	//   56  104:invokevirtual   #215 <Method void Parcel.writeString(String)>
		parcel.writeInt(e);
	//   57  107:aload_1         
	//   58  108:aload_0         
	//   59  109:getfield        #75  <Field int e>
	//   60  112:invokevirtual   #223 <Method void Parcel.writeInt(int)>
	//   61  115:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotV2 a(Parcel parcel)
		{
			return new RobotV2(parcel);
		//    0    0:new             #9   <Class RobotV2>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotV2(Parcel)>
		//    4    8:areturn         
		}

		public RobotV2[] a(int i1)
		{
			return new RobotV2[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotV2[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotV2 a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotV2[] a(int)>
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
	public transient MissionStatistics b;
	public transient int e;
	private String f;
	private String g;
	private String h;
	private RobotPreferences i;
	private transient t j;
	private transient MissionStatus k;
	private NetworkSettings l;
	private transient HourMinTime m;
	private transient RobotAvailableLanguages n;
	private transient OtaUpgradeStatus o;
	private CloudConfig p;
	private transient History q;
	private transient MissionHistory r;

	static 
	{
	//    0    0:new             #8   <Class RobotV2$1>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void RobotV2$1()>
	//    3    7:putstatic       #55  <Field android.os.Parcelable$Creator CREATOR>
		int ai[] = {
			0, 0, 1, 0, 0, 0, 0, 0
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
	//   32   41:iconst_0        
	//   33   42:iastore         
	//   34   43:dup             
	//   35   44:bipush          7
	//   36   46:iconst_0        
	//   37   47:iastore         
	//   38   48:astore_0        
		c = (new int[][] {
			new int[] {
				0, 0, 1, 1, 0, 0, 1, 0
			}, new int[] {
				0, 0, 1, 0, 0, 0, 1, 0
			}, ai
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
	//   80   96:bipush          8
	//   81   98:newarray        int[]
	//   82  100:dup             
	//   83  101:iconst_0        
	//   84  102:iconst_0        
	//   85  103:iastore         
	//   86  104:dup             
	//   87  105:iconst_1        
	//   88  106:iconst_0        
	//   89  107:iastore         
	//   90  108:dup             
	//   91  109:iconst_2        
	//   92  110:iconst_1        
	//   93  111:iastore         
	//   94  112:dup             
	//   95  113:iconst_3        
	//   96  114:iconst_0        
	//   97  115:iastore         
	//   98  116:dup             
	//   99  117:iconst_4        
	//  100  118:iconst_0        
	//  101  119:iastore         
	//  102  120:dup             
	//  103  121:iconst_5        
	//  104  122:iconst_0        
	//  105  123:iastore         
	//  106  124:dup             
	//  107  125:bipush          6
	//  108  127:iconst_1        
	//  109  128:iastore         
	//  110  129:dup             
	//  111  130:bipush          7
	//  112  132:iconst_0        
	//  113  133:iastore         
	//  114  134:aastore         
	//  115  135:dup             
	//  116  136:iconst_2        
	//  117  137:aload_0         
	//  118  138:aastore         
	//  119  139:putstatic       #59  <Field int[][] c>
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
	//  233  269:putstatic       #61  <Field int[][] d>
	//* 234  272:return          
	}
}
