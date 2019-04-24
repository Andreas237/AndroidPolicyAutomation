// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.irobot.core.*;
import com.irobot.home.model.rest.History;
import com.irobot.home.model.rest.MissionHistory;
import com.irobot.home.util.j;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.irobot.home.model:
//			t, RobotSystem, RobotPreferences, RobotAvailableLanguages, 
//			MissionStatus, NetworkSettings, HourMinTime, OtaUpgradeStatus, 
//			CloudConfig, RobotV1, RobotV2, RobotV3

public class Robot
	implements Parcelable
{

	public Robot()
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
		g = false;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #71  <Field boolean g>
		p = new History();
	//   14   27:aload_0         
	//   15   28:new             #73  <Class History>
	//   16   31:dup             
	//   17   32:invokespecial   #74  <Method void History()>
	//   18   35:putfield        #76  <Field History p>
		q = new MissionHistory();
	//   19   38:aload_0         
	//   20   39:new             #78  <Class MissionHistory>
	//   21   42:dup             
	//   22   43:invokespecial   #79  <Method void MissionHistory()>
	//   23   46:putfield        #81  <Field MissionHistory q>
		i = t.UNKNOWN;
	//   24   49:aload_0         
	//   25   50:getstatic       #86  <Field t t.UNKNOWN>
	//   26   53:putfield        #88  <Field t i>
		a = new RobotSystem();
	//   27   56:aload_0         
	//   28   57:new             #90  <Class RobotSystem>
	//   29   60:dup             
	//   30   61:invokespecial   #91  <Method void RobotSystem()>
	//   31   64:putfield        #93  <Field RobotSystem a>
		h = new RobotPreferences();
	//   32   67:aload_0         
	//   33   68:new             #95  <Class RobotPreferences>
	//   34   71:dup             
	//   35   72:invokespecial   #96  <Method void RobotPreferences()>
	//   36   75:putfield        #98  <Field RobotPreferences h>
		m = new RobotAvailableLanguages();
	//   37   78:aload_0         
	//   38   79:new             #100 <Class RobotAvailableLanguages>
	//   39   82:dup             
	//   40   83:invokespecial   #101 <Method void RobotAvailableLanguages()>
	//   41   86:putfield        #103 <Field RobotAvailableLanguages m>
		j = new MissionStatus();
	//   42   89:aload_0         
	//   43   90:new             #105 <Class MissionStatus>
	//   44   93:dup             
	//   45   94:invokespecial   #106 <Method void MissionStatus()>
	//   46   97:putfield        #108 <Field MissionStatus j>
		k = new NetworkSettings();
	//   47  100:aload_0         
	//   48  101:new             #110 <Class NetworkSettings>
	//   49  104:dup             
	//   50  105:invokespecial   #111 <Method void NetworkSettings()>
	//   51  108:putfield        #113 <Field NetworkSettings k>
		l = new HourMinTime();
	//   52  111:aload_0         
	//   53  112:new             #115 <Class HourMinTime>
	//   54  115:dup             
	//   55  116:invokespecial   #116 <Method void HourMinTime()>
	//   56  119:putfield        #118 <Field HourMinTime l>
		n = new OtaUpgradeStatus();
	//   57  122:aload_0         
	//   58  123:new             #120 <Class OtaUpgradeStatus>
	//   59  126:dup             
	//   60  127:invokespecial   #121 <Method void OtaUpgradeStatus()>
	//   61  130:putfield        #123 <Field OtaUpgradeStatus n>
		o = new CloudConfig();
	//   62  133:aload_0         
	//   63  134:new             #125 <Class CloudConfig>
	//   64  137:dup             
	//   65  138:invokespecial   #126 <Method void CloudConfig()>
	//   66  141:putfield        #128 <Field CloudConfig o>
	//   67  144:return          
	}

	public Robot(Parcel parcel)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void Robot()>
		i = com.irobot.home.model.t.valueOf(parcel.readString());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #136 <Method String Parcel.readString()>
	//    5    9:invokestatic    #140 <Method t t.valueOf(String)>
	//    6   12:putfield        #88  <Field t i>
		d = parcel.readString();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #136 <Method String Parcel.readString()>
	//   10   20:putfield        #65  <Field String d>
		a = (RobotSystem)parcel.readParcelable(((Class) (com/irobot/home/model/RobotSystem)).getClassLoader());
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:ldc1            #90  <Class RobotSystem>
	//   14   27:invokevirtual   #146 <Method ClassLoader Class.getClassLoader()>
	//   15   30:invokevirtual   #150 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   16   33:checkcast       #90  <Class RobotSystem>
	//   17   36:putfield        #93  <Field RobotSystem a>
		h = (RobotPreferences)parcel.readParcelable(((Class) (com/irobot/home/model/RobotPreferences)).getClassLoader());
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:ldc1            #95  <Class RobotPreferences>
	//   21   43:invokevirtual   #146 <Method ClassLoader Class.getClassLoader()>
	//   22   46:invokevirtual   #150 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   23   49:checkcast       #95  <Class RobotPreferences>
	//   24   52:putfield        #98  <Field RobotPreferences h>
		m = (RobotAvailableLanguages)parcel.readParcelable(((Class) (com/irobot/home/model/RobotAvailableLanguages)).getClassLoader());
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:ldc1            #100 <Class RobotAvailableLanguages>
	//   28   59:invokevirtual   #146 <Method ClassLoader Class.getClassLoader()>
	//   29   62:invokevirtual   #150 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   30   65:checkcast       #100 <Class RobotAvailableLanguages>
	//   31   68:putfield        #103 <Field RobotAvailableLanguages m>
		j = (MissionStatus)parcel.readParcelable(((Class) (com/irobot/home/model/MissionStatus)).getClassLoader());
	//   32   71:aload_0         
	//   33   72:aload_1         
	//   34   73:ldc1            #105 <Class MissionStatus>
	//   35   75:invokevirtual   #146 <Method ClassLoader Class.getClassLoader()>
	//   36   78:invokevirtual   #150 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   37   81:checkcast       #105 <Class MissionStatus>
	//   38   84:putfield        #108 <Field MissionStatus j>
		k = (NetworkSettings)parcel.readParcelable(((Class) (com/irobot/home/model/NetworkSettings)).getClassLoader());
	//   39   87:aload_0         
	//   40   88:aload_1         
	//   41   89:ldc1            #110 <Class NetworkSettings>
	//   42   91:invokevirtual   #146 <Method ClassLoader Class.getClassLoader()>
	//   43   94:invokevirtual   #150 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   44   97:checkcast       #110 <Class NetworkSettings>
	//   45  100:putfield        #113 <Field NetworkSettings k>
		l = (HourMinTime)parcel.readParcelable(((Class) (com/irobot/home/model/HourMinTime)).getClassLoader());
	//   46  103:aload_0         
	//   47  104:aload_1         
	//   48  105:ldc1            #115 <Class HourMinTime>
	//   49  107:invokevirtual   #146 <Method ClassLoader Class.getClassLoader()>
	//   50  110:invokevirtual   #150 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   51  113:checkcast       #115 <Class HourMinTime>
	//   52  116:putfield        #118 <Field HourMinTime l>
		o = (CloudConfig)parcel.readParcelable(((Class) (com/irobot/home/model/CloudConfig)).getClassLoader());
	//   53  119:aload_0         
	//   54  120:aload_1         
	//   55  121:ldc1            #125 <Class CloudConfig>
	//   56  123:invokevirtual   #146 <Method ClassLoader Class.getClassLoader()>
	//   57  126:invokevirtual   #150 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   58  129:checkcast       #125 <Class CloudConfig>
	//   59  132:putfield        #128 <Field CloudConfig o>
		e = parcel.readString();
	//   60  135:aload_0         
	//   61  136:aload_1         
	//   62  137:invokevirtual   #136 <Method String Parcel.readString()>
	//   63  140:putfield        #67  <Field String e>
		f = parcel.readString();
	//   64  143:aload_0         
	//   65  144:aload_1         
	//   66  145:invokevirtual   #136 <Method String Parcel.readString()>
	//   67  148:putfield        #69  <Field String f>
	//   68  151:return          
	}

	public static Robot a(RobotV1 robotv1)
	{
		Robot robot = new Robot();
	//    0    0:new             #2   <Class Robot>
	//    1    3:dup             
	//    2    4:invokespecial   #130 <Method void Robot()>
	//    3    7:astore_1        
		robot.a(robotv1.d());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #155 <Method String RobotV1.d()>
	//    7   13:invokevirtual   #158 <Method void a(String)>
		robot.c(robotv1.f());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #160 <Method String RobotV1.f()>
	//   11   21:invokevirtual   #162 <Method void c(String)>
		robot.a().a(robotv1.a());
	//   12   24:aload_1         
	//   13   25:invokevirtual   #165 <Method RobotPreferences a()>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #166 <Method RobotPreferences RobotV1.a()>
	//   16   32:invokevirtual   #169 <Method void RobotPreferences.a(RobotPreferences)>
		robot.a = robotv1.a;
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #170 <Field RobotSystem RobotV1.a>
	//   20   40:putfield        #93  <Field RobotSystem a>
		robot.d().a(robotv1.b());
	//   21   43:aload_1         
	//   22   44:invokevirtual   #173 <Method NetworkSettings d()>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #175 <Method NetworkSettings RobotV1.b()>
	//   25   51:invokevirtual   #178 <Method void NetworkSettings.a(NetworkSettings)>
		return robot;
	//   26   54:aload_1         
	//   27   55:areturn         
	}

	public static Robot a(RobotV2 robotv2)
	{
		Robot robot = new Robot();
	//    0    0:new             #2   <Class Robot>
	//    1    3:dup             
	//    2    4:invokespecial   #130 <Method void Robot()>
	//    3    7:astore_1        
		robot.a(robotv2.d());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #182 <Method String RobotV2.d()>
	//    7   13:invokevirtual   #158 <Method void a(String)>
		robot.c(robotv2.f());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #183 <Method String RobotV2.f()>
	//   11   21:invokevirtual   #162 <Method void c(String)>
		robot.a().a(robotv2.a());
	//   12   24:aload_1         
	//   13   25:invokevirtual   #165 <Method RobotPreferences a()>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #184 <Method RobotPreferences RobotV2.a()>
	//   16   32:invokevirtual   #169 <Method void RobotPreferences.a(RobotPreferences)>
		robot.a = robotv2.a;
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #185 <Field RobotSystem RobotV2.a>
	//   20   40:putfield        #93  <Field RobotSystem a>
		robot.d().a(robotv2.b());
	//   21   43:aload_1         
	//   22   44:invokevirtual   #173 <Method NetworkSettings d()>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #186 <Method NetworkSettings RobotV2.b()>
	//   25   51:invokevirtual   #178 <Method void NetworkSettings.a(NetworkSettings)>
		return robot;
	//   26   54:aload_1         
	//   27   55:areturn         
	}

	public static Robot a(RobotV3 robotv3)
	{
		Robot robot = new Robot();
	//    0    0:new             #2   <Class Robot>
	//    1    3:dup             
	//    2    4:invokespecial   #130 <Method void Robot()>
	//    3    7:astore_1        
		robot.a(robotv3.d());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #190 <Method String RobotV3.d()>
	//    7   13:invokevirtual   #158 <Method void a(String)>
		robot.c(robotv3.f());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #191 <Method String RobotV3.f()>
	//   11   21:invokevirtual   #162 <Method void c(String)>
		robot.a().a(robotv3.a());
	//   12   24:aload_1         
	//   13   25:invokevirtual   #165 <Method RobotPreferences a()>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #192 <Method RobotPreferences RobotV3.a()>
	//   16   32:invokevirtual   #169 <Method void RobotPreferences.a(RobotPreferences)>
		robot.a = robotv3.a;
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #193 <Field RobotSystem RobotV3.a>
	//   20   40:putfield        #93  <Field RobotSystem a>
		robot.d().a(robotv3.b());
	//   21   43:aload_1         
	//   22   44:invokevirtual   #173 <Method NetworkSettings d()>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #194 <Method NetworkSettings RobotV3.b()>
	//   25   51:invokevirtual   #178 <Method void NetworkSettings.a(NetworkSettings)>
		return robot;
	//   26   54:aload_1         
	//   27   55:areturn         
	}

	public static final boolean f(String s1)
	{
		if(s1.trim().length() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #200 <Method String String.trim()>
	//*   2    4:invokevirtual   #204 <Method int String.length()>
	//*   3    7:ifeq            41
		{
			if(s1.getBytes().length > 16)
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #208 <Method byte[] String.getBytes()>
	//*   6   14:arraylength     
	//*   7   15:bipush          16
	//*   8   17:icmple          22
				return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
			return !Pattern.compile(".*[\\/\\\\\"\\x00-\\x1F\\x7F].*").matcher(((CharSequence) (s1))).matches();
	//   11   22:ldc1            #210 <String ".*[\\/\\\\\"\\x00-\\x1F\\x7F].*">
	//   12   24:invokestatic    #216 <Method Pattern Pattern.compile(String)>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #220 <Method Matcher Pattern.matcher(CharSequence)>
	//   15   31:invokevirtual   #226 <Method boolean Matcher.matches()>
	//   16   34:ifeq            39
	//   17   37:iconst_0        
	//   18   38:ireturn         
	//   19   39:iconst_1        
	//   20   40:ireturn         
		} else
		{
			return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		}
	}

	public RobotPreferences a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RobotPreferences h>
	//    2    4:areturn         
	}

	public void a(AssetSkuEvent assetskuevent)
	{
		c(assetskuevent.sku());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #232 <Method String AssetSkuEvent.sku()>
	//    3    5:invokevirtual   #162 <Method void c(String)>
	//    4    8:return          
	}

	public void a(RobotPasswordEvent robotpasswordevent)
	{
		a(robotpasswordevent.password());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #238 <Method String RobotPasswordEvent.password()>
	//    3    5:invokevirtual   #158 <Method void a(String)>
	//    4    8:return          
	}

	public void a(MissionStatus missionstatus)
	{
		j = missionstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field MissionStatus j>
	//    3    5:return          
	}

	public void a(String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		d = s1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #65  <Field String d>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		s1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw s1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public MissionStatus b()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MissionStatus j>
	//    2    4:areturn         
	}

	public void b(String s1)
	{
		h.a(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RobotPreferences h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #241 <Method void RobotPreferences.a(String)>
	//    4    8:return          
	}

	public HourMinTime c()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field HourMinTime l>
	//    2    4:areturn         
	}

	public void c(String s1)
	{
		String s2;
label0:
		{
			if(!com.irobot.home.util.j.k(e) && !TextUtils.isEmpty(((CharSequence) (e))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field String e>
	//*   2    4:invokestatic    #246 <Method boolean j.k(String)>
	//*   3    7:ifne            21
	//*   4   10:aload_0         
	//*   5   11:getfield        #67  <Field String e>
	//*   6   14:invokestatic    #252 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   17:ifne            21
				return;
	//    8   20:return          
			boolean flag = com.irobot.home.util.j.k(s1);
	//    9   21:aload_1         
	//   10   22:invokestatic    #246 <Method boolean j.k(String)>
	//   11   25:istore_2        
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  12   26:aload_1         
	//*  13   27:invokestatic    #252 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   30:ifne            39
			{
				s2 = s1;
	//   15   33:aload_1         
	//   16   34:astore_3        
				if(!flag)
					break label0;
	//   17   35:iload_2         
	//   18   36:ifeq            111
			}
			if(flag)
	//*  19   39:iload_2         
	//*  20   40:ifeq            51
				s1 = com.irobot.home.util.j.m(s1);
	//   21   43:aload_1         
	//   22   44:invokestatic    #255 <Method String j.m(String)>
	//   23   47:astore_1        
			else
	//*  24   48:goto            55
				s1 = "R980020";
	//   25   51:ldc2            #257 <String "R980020">
	//   26   54:astore_1        
			s2 = s1;
	//   27   55:aload_1         
	//   28   56:astore_3        
			if(!g)
	//*  29   57:aload_0         
	//*  30   58:getfield        #71  <Field boolean g>
	//*  31   61:ifne            111
			{
				String s3 = com.irobot.home.util.j.f(s().getId());
	//   32   64:aload_0         
	//   33   65:invokevirtual   #261 <Method AssetId s()>
	//   34   68:invokevirtual   #266 <Method String AssetId.getId()>
	//   35   71:invokestatic    #268 <Method String j.f(String)>
	//   36   74:astore          4
				s2 = s1;
	//   37   76:aload_1         
	//   38   77:astore_3        
				if(s3 != null)
	//*  39   78:aload           4
	//*  40   80:ifnull          111
				{
					g = true;
	//   41   83:aload_0         
	//   42   84:iconst_1        
	//   43   85:putfield        #71  <Field boolean g>
					s2 = s1;
	//   44   88:aload_1         
	//   45   89:astore_3        
					if(!TextUtils.isEmpty(((CharSequence) (s3))))
	//*  46   90:aload           4
	//*  47   92:invokestatic    #252 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  48   95:ifne            111
					{
						s2 = s1;
	//   49   98:aload_1         
	//   50   99:astore_3        
						if(!com.irobot.home.util.j.k(s3))
	//*  51  100:aload           4
	//*  52  102:invokestatic    #246 <Method boolean j.k(String)>
	//*  53  105:ifne            111
							s2 = s3;
	//   54  108:aload           4
	//   55  110:astore_3        
					}
				}
			}
		}
		e = s2;
	//   56  111:aload_0         
	//   57  112:aload_3         
	//   58  113:putfield        #67  <Field String e>
	//   59  116:return          
	}

	public NetworkSettings d()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field NetworkSettings k>
	//    2    4:areturn         
	}

	public void d(String s1)
	{
		f = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field String f>
	//    3    5:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void e(String s1)
	{
		a.a(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RobotSystem a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #272 <Method void RobotSystem.a(String)>
	//    4    8:return          
	}

	public boolean e()
	{
		return j.e();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MissionStatus j>
	//    2    4:invokevirtual   #274 <Method boolean MissionStatus.e()>
	//    3    7:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null && (obj instanceof Robot))
	//*   0    0:aload_1         
	//*   1    1:ifnull          75
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class Robot>
	//*   4    8:ifeq            75
		{
			obj = ((Object) ((Robot)obj));
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class Robot>
	//    7   15:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (((Robot) (obj)).a.a()))) && !TextUtils.isEmpty(((CharSequence) (a.a()))))
	//*   8   16:aload_1         
	//*   9   17:getfield        #93  <Field RobotSystem a>
	//*  10   20:invokevirtual   #278 <Method String RobotSystem.a()>
	//*  11   23:invokestatic    #252 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   26:ifne            63
	//*  13   29:aload_0         
	//*  14   30:getfield        #93  <Field RobotSystem a>
	//*  15   33:invokevirtual   #278 <Method String RobotSystem.a()>
	//*  16   36:invokestatic    #252 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   39:ifeq            45
	//*  18   42:goto            63
				return ((Robot) (obj)).a.a().equals(((Object) (a.a())));
	//   19   45:aload_1         
	//   20   46:getfield        #93  <Field RobotSystem a>
	//   21   49:invokevirtual   #278 <Method String RobotSystem.a()>
	//   22   52:aload_0         
	//   23   53:getfield        #93  <Field RobotSystem a>
	//   24   56:invokevirtual   #278 <Method String RobotSystem.a()>
	//   25   59:invokevirtual   #280 <Method boolean String.equals(Object)>
	//   26   62:ireturn         
			else
				return i().equals(((Object) (((Robot) (obj)).i())));
	//   27   63:aload_0         
	//   28   64:invokevirtual   #282 <Method String i()>
	//   29   67:aload_1         
	//   30   68:invokevirtual   #282 <Method String i()>
	//   31   71:invokevirtual   #280 <Method boolean String.equals(Object)>
	//   32   74:ireturn         
		} else
		{
			return false;
	//   33   75:iconst_0        
	//   34   76:ireturn         
		}
	}

	public boolean f()
	{
		return j.g();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MissionStatus j>
	//    2    4:invokevirtual   #284 <Method boolean MissionStatus.g()>
	//    3    7:ireturn         
	}

	public boolean g()
	{
		return j.f() && !j.c();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MissionStatus j>
	//    2    4:invokevirtual   #286 <Method boolean MissionStatus.f()>
	//    3    7:ifeq            22
	//    4   10:aload_0         
	//    5   11:getfield        #108 <Field MissionStatus j>
	//    6   14:invokevirtual   #288 <Method boolean MissionStatus.c()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean h()
	{
		return j.c();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MissionStatus j>
	//    2    4:invokevirtual   #288 <Method boolean MissionStatus.c()>
	//    3    7:ireturn         
	}

	public int hashCode()
	{
		return a.a().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RobotSystem a>
	//    2    4:invokevirtual   #278 <Method String RobotSystem.a()>
	//    3    7:invokevirtual   #291 <Method int String.hashCode()>
	//    4   10:ireturn         
	}

	public String i()
	{
		if(TextUtils.isEmpty(((CharSequence) (h.b()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field RobotPreferences h>
	//*   2    4:invokevirtual   #293 <Method String RobotPreferences.b()>
	//*   3    7:invokestatic    #252 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4   10:ifeq            68
		{
			Object obj;
			if(TextUtils.isEmpty(((CharSequence) (r()))))
	//*   5   13:aload_0         
	//*   6   14:invokevirtual   #296 <Method String r()>
	//*   7   17:invokestatic    #252 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   20:ifeq            35
			{
				obj = "Roomba 890";
	//    9   23:ldc2            #298 <String "Roomba 890">
	//   10   26:astore_1        
			} else
	//*  11   27:aload_0         
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #300 <Method void b(String)>
	//*  14   32:goto            68
			{
				obj = ((Object) (new StringBuilder()));
	//   15   35:new             #302 <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #303 <Method void StringBuilder()>
	//   18   42:astore_1        
				((StringBuilder) (obj)).append("Roomba_");
	//   19   43:aload_1         
	//   20   44:ldc2            #305 <String "Roomba_">
	//   21   47:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:pop             
				((StringBuilder) (obj)).append(r());
	//   23   51:aload_1         
	//   24   52:aload_0         
	//   25   53:invokevirtual   #296 <Method String r()>
	//   26   56:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   60:aload_1         
	//   29   61:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   30   64:astore_1        
			}
			b(((String) (obj)));
		}
	//*  31   65:goto            27
		return h.b();
	//   32   68:aload_0         
	//   33   69:getfield        #98  <Field RobotPreferences h>
	//   34   72:invokevirtual   #293 <Method String RobotPreferences.b()>
	//   35   75:areturn         
	}

	public int j()
	{
		return h.c();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RobotPreferences h>
	//    2    4:invokevirtual   #314 <Method int RobotPreferences.c()>
	//    3    7:ireturn         
	}

	public RobotAvailableLanguages k()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field RobotAvailableLanguages m>
	//    2    4:areturn         
	}

	public void l()
	{
		m.a().clear();
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field RobotAvailableLanguages m>
	//    2    4:invokevirtual   #318 <Method List RobotAvailableLanguages.a()>
	//    3    7:invokeinterface #323 <Method void List.clear()>
	//    4   12:return          
	}

	public History m()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field History p>
	//    2    4:areturn         
	}

	public MissionHistory n()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field MissionHistory q>
	//    2    4:areturn         
	}

	public OtaUpgradeStatus o()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field OtaUpgradeStatus n>
	//    2    4:areturn         
	}

	public CloudConfig p()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field CloudConfig o>
	//    2    4:areturn         
	}

	public String q()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1 = d;
	//    2    2:aload_0         
	//    3    3:getfield        #65  <Field String d>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public String r()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RobotSystem a>
	//    2    4:invokevirtual   #278 <Method String RobotSystem.a()>
	//    3    7:areturn         
	}

	public AssetId s()
	{
		return a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RobotSystem a>
	//    2    4:invokevirtual   #329 <Method AssetId RobotSystem.b()>
	//    3    7:areturn         
	}

	public int t()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RobotSystem a>
	//    2    4:invokevirtual   #332 <Method int RobotSystem.d()>
	//    3    7:ireturn         
	}

	public boolean u()
	{
		return j.b();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MissionStatus j>
	//    2    4:invokevirtual   #335 <Method boolean MissionStatus.b()>
	//    3    7:ireturn         
	}

	public String v()
	{
label0:
		{
			String s1;
			if(e != null && !e.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field String e>
	//*   2    4:ifnull          41
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field String e>
	//*   5   11:invokevirtual   #338 <Method boolean String.isEmpty()>
	//*   6   14:ifeq            20
	//*   7   17:goto            41
			{
				if(!com.irobot.home.util.j.k(e))
					break label0;
	//    8   20:aload_0         
	//    9   21:getfield        #67  <Field String e>
	//   10   24:invokestatic    #246 <Method boolean j.k(String)>
	//   11   27:ifeq            50
				s1 = com.irobot.home.util.j.m(e);
	//   12   30:aload_0         
	//   13   31:getfield        #67  <Field String e>
	//   14   34:invokestatic    #255 <Method String j.m(String)>
	//   15   37:astore_1        
			} else
	//*  16   38:goto            45
			{
				s1 = "R980020";
	//   17   41:ldc2            #257 <String "R980020">
	//   18   44:astore_1        
			}
			e = s1;
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:putfield        #67  <Field String e>
		}
		return e;
	//   22   50:aload_0         
	//   23   51:getfield        #67  <Field String e>
	//   24   54:areturn         
	}

	public String w()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String f>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(i.name());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #88  <Field t i>
	//    3    5:invokevirtual   #344 <Method String t.name()>
	//    4    8:invokevirtual   #347 <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field String d>
	//    8   16:invokevirtual   #347 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (a)), 0);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #93  <Field RobotSystem a>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #351 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (h)), 0);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #98  <Field RobotPreferences h>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #351 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (m)), 0);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #103 <Field RobotAvailableLanguages m>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #351 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (j)), 0);
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #108 <Field MissionStatus j>
	//   27   51:iconst_0        
	//   28   52:invokevirtual   #351 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (k)), 0);
	//   29   55:aload_1         
	//   30   56:aload_0         
	//   31   57:getfield        #113 <Field NetworkSettings k>
	//   32   60:iconst_0        
	//   33   61:invokevirtual   #351 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (l)), 0);
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #118 <Field HourMinTime l>
	//   37   69:iconst_0        
	//   38   70:invokevirtual   #351 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (o)), 0);
	//   39   73:aload_1         
	//   40   74:aload_0         
	//   41   75:getfield        #128 <Field CloudConfig o>
	//   42   78:iconst_0        
	//   43   79:invokevirtual   #351 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeString(e);
	//   44   82:aload_1         
	//   45   83:aload_0         
	//   46   84:getfield        #67  <Field String e>
	//   47   87:invokevirtual   #347 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//   48   90:aload_1         
	//   49   91:aload_0         
	//   50   92:getfield        #69  <Field String f>
	//   51   95:invokevirtual   #347 <Method void Parcel.writeString(String)>
	//   52   98:return          
	}

	public boolean x()
	{
		return SkuUtils.isSkuOfType(SkuType.China, v());
	//    0    0:getstatic       #358 <Field SkuType SkuType.China>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #360 <Method String v()>
	//    3    7:invokestatic    #366 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//    4   10:ireturn         
	}

	public void y()
	{
		if((e == null || e.isEmpty()) && !a.c().isNewerThanOrEqual(SoftwareVersion.create("1.6.2")))
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field String e>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #67  <Field String e>
	//*   5   11:invokevirtual   #338 <Method boolean String.isEmpty()>
	//*   6   14:ifeq            43
	//*   7   17:aload_0         
	//*   8   18:getfield        #93  <Field RobotSystem a>
	//*   9   21:invokevirtual   #370 <Method SoftwareVersion RobotSystem.c()>
	//*  10   24:ldc2            #372 <String "1.6.2">
	//*  11   27:invokestatic    #378 <Method SoftwareVersion SoftwareVersion.create(String)>
	//*  12   30:invokevirtual   #382 <Method boolean SoftwareVersion.isNewerThanOrEqual(SoftwareVersion)>
	//*  13   33:ifne            43
			e = "R980020";
	//   14   36:aload_0         
	//   15   37:ldc2            #257 <String "R980020">
	//   16   40:putfield        #67  <Field String e>
	//   17   43:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Robot a(Parcel parcel)
		{
			return new Robot(parcel);
		//    0    0:new             #9   <Class Robot>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Robot(Parcel)>
		//    4    8:areturn         
		}

		public Robot[] a(int i1)
		{
			return new Robot[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       Robot[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method Robot a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method Robot[] a(int)>
		//    3    5:areturn         
		}

	}
;
	static final int b[][];
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
	private boolean g;
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
	//    0    0:new             #8   <Class Robot$1>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void Robot$1()>
	//    3    7:putstatic       #53  <Field android.os.Parcelable$Creator CREATOR>
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
		b = (new int[][] {
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
	//  119  139:putstatic       #57  <Field int[][] b>
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
	//  233  269:putstatic       #59  <Field int[][] c>
	//* 234  272:return          
	}
}
