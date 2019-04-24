// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.*;
import java.util.TimeZone;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.model:
//			RobotAxedaPreferences

public class RobotPreferences
	implements Parcelable
{

	public RobotPreferences()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		b = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field int b>
		c = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #33  <Field int c>
		d = "Default";
	//    8   14:aload_0         
	//    9   15:ldc1            #35  <String "Default">
	//   10   17:putfield        #37  <Field String d>
		e = TimeZone.getDefault().getID();
	//   11   20:aload_0         
	//   12   21:invokestatic    #43  <Method TimeZone TimeZone.getDefault()>
	//   13   24:invokevirtual   #47  <Method String TimeZone.getID()>
	//   14   27:putfield        #49  <Field String e>
		a = new RobotAxedaPreferences();
	//   15   30:aload_0         
	//   16   31:new             #51  <Class RobotAxedaPreferences>
	//   17   34:dup             
	//   18   35:invokespecial   #52  <Method void RobotAxedaPreferences()>
	//   19   38:putfield        #54  <Field RobotAxedaPreferences a>
	//   20   41:return          
	}

	public RobotPreferences(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		b = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #61  <Method int Parcel.readInt()>
	//    5    9:putfield        #31  <Field int b>
		c = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #61  <Method int Parcel.readInt()>
	//    9   17:putfield        #33  <Field int c>
		d = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #64  <Method String Parcel.readString()>
	//   13   25:putfield        #37  <Field String d>
		e = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #64  <Method String Parcel.readString()>
	//   17   33:putfield        #49  <Field String e>
		a = (RobotAxedaPreferences)parcel.readParcelable(((Class) (com/irobot/home/model/RobotAxedaPreferences)).getClassLoader());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:ldc1            #51  <Class RobotAxedaPreferences>
	//   21   40:invokevirtual   #70  <Method ClassLoader Class.getClassLoader()>
	//   22   43:invokevirtual   #74  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   23   46:checkcast       #51  <Class RobotAxedaPreferences>
	//   24   49:putfield        #54  <Field RobotAxedaPreferences a>
	//   25   52:return          
	}

	public RobotPreferences(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		b = jsonobject.getInt("flags");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #77  <String "flags">
	//    5    8:invokevirtual   #83  <Method int JSONObject.getInt(String)>
	//    6   11:putfield        #31  <Field int b>
		d = jsonobject.getString("name");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #85  <String "name">
	//   10   18:invokevirtual   #89  <Method String JSONObject.getString(String)>
	//   11   21:putfield        #37  <Field String d>
		c = jsonobject.getInt("lang");
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #91  <String "lang">
	//   15   28:invokevirtual   #83  <Method int JSONObject.getInt(String)>
	//   16   31:putfield        #33  <Field int c>
		e = jsonobject.getString("timezone");
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc1            #93  <String "timezone">
	//   20   38:invokevirtual   #89  <Method String JSONObject.getString(String)>
	//   21   41:putfield        #49  <Field String e>
	//   22   44:return          
	}

	private void a(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			i |= b;
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field int b>
	//    5    9:ior             
	//    6   10:istore_1        
		else
	//*   7   11:aload_0         
	//*   8   12:iload_1         
	//*   9   13:putfield        #31  <Field int b>
	//*  10   16:return          
			i &= b;
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #31  <Field int b>
	//   14   22:iand            
	//   15   23:istore_1        
		b = i;
	//*  16   24:goto            11
	}

	public int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int b>
	//    2    4:ireturn         
	}

	public void a(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int c>
	//    3    5:return          
	}

	public void a(RobotLanguageEvent robotlanguageevent)
	{
		c = robotlanguageevent.robotLanguage();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method int RobotLanguageEvent.robotLanguage()>
	//    3    5:putfield        #33  <Field int c>
	//    4    8:return          
	}

	public void a(RobotNameEvent robotnameevent)
	{
		d = robotnameevent.robotName();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #107 <Method String RobotNameEvent.robotName()>
	//    3    5:putfield        #37  <Field String d>
	//    4    8:return          
	}

	public void a(RobotPreferencesEvent robotpreferencesevent)
	{
		a(robotpreferencesevent.isCleanButton());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method boolean RobotPreferencesEvent.isCleanButton()>
	//    3    5:invokevirtual   #117 <Method void a(boolean)>
		b(robotpreferencesevent.isOpenOnly() ^ true);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #120 <Method boolean RobotPreferencesEvent.isOpenOnly()>
	//    7   13:iconst_1        
	//    8   14:ixor            
	//    9   15:invokevirtual   #122 <Method void b(boolean)>
		a(4, robotpreferencesevent.isSchedHold());
	//   10   18:aload_0         
	//   11   19:iconst_4        
	//   12   20:aload_1         
	//   13   21:invokevirtual   #125 <Method boolean RobotPreferencesEvent.isSchedHold()>
	//   14   24:invokespecial   #127 <Method void a(int, boolean)>
		d(robotpreferencesevent.isManUpd());
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #130 <Method boolean RobotPreferencesEvent.isManUpd()>
	//   18   32:invokevirtual   #132 <Method void d(boolean)>
		e(robotpreferencesevent.isNoBoost() ^ true);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #135 <Method boolean RobotPreferencesEvent.isNoBoost()>
	//   22   40:iconst_1        
	//   23   41:ixor            
	//   24   42:invokevirtual   #137 <Method void e(boolean)>
		c(robotpreferencesevent.isBinPause());
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:invokevirtual   #140 <Method boolean RobotPreferencesEvent.isBinPause()>
	//   28   50:invokevirtual   #142 <Method void c(boolean)>
		f(robotpreferencesevent.isVacuumHigh());
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #145 <Method boolean RobotPreferencesEvent.isVacuumHigh()>
	//   32   58:invokevirtual   #148 <Method void f(boolean)>
		g(robotpreferencesevent.isNoPersistentPass());
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:invokevirtual   #151 <Method boolean RobotPreferencesEvent.isNoPersistentPass()>
	//   36   66:invokevirtual   #154 <Method void g(boolean)>
		a(1024, robotpreferencesevent.isNoAutomaticNumberOfPasses());
	//   37   69:aload_0         
	//   38   70:sipush          1024
	//   39   73:aload_1         
	//   40   74:invokevirtual   #157 <Method boolean RobotPreferencesEvent.isNoAutomaticNumberOfPasses()>
	//   41   77:invokespecial   #127 <Method void a(int, boolean)>
	//   42   80:return          
	}

	public void a(RobotTimeZoneEvent robottimezoneevent)
	{
		e = robottimezoneevent.robotTimeZone();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method String RobotTimeZoneEvent.robotTimeZone()>
	//    3    5:putfield        #49  <Field String e>
	//    4    8:return          
	}

	public void a(RobotPreferences robotpreferences)
	{
		b = robotpreferences.b;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #31  <Field int b>
	//    3    5:putfield        #31  <Field int b>
		d = robotpreferences.d;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #37  <Field String d>
	//    7   13:putfield        #37  <Field String d>
		c = robotpreferences.c;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #33  <Field int c>
	//   11   21:putfield        #33  <Field int c>
		e = robotpreferences.e;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #49  <Field String e>
	//   15   29:putfield        #49  <Field String e>
	//   16   32:return          
	}

	public void a(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String d>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		a(1, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokespecial   #127 <Method void a(int, boolean)>
	//    4    6:return          
	}

	public String b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String d>
	//    2    4:areturn         
	}

	public void b(boolean flag)
	{
		a(2, flag ^ true);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:iconst_1        
	//    4    4:ixor            
	//    5    5:invokespecial   #127 <Method void a(int, boolean)>
	//    6    8:return          
	}

	public int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int c>
	//    2    4:ireturn         
	}

	public void c(boolean flag)
	{
		a(32, flag);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:iload_1         
	//    3    4:invokespecial   #127 <Method void a(int, boolean)>
	//    4    7:return          
	}

	public String d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String e>
	//    2    4:areturn         
	}

	public void d(boolean flag)
	{
		a(8, flag);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:invokespecial   #127 <Method void a(int, boolean)>
	//    4    7:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public RobotAxedaPreferences e()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field RobotAxedaPreferences a>
	//    2    4:areturn         
	}

	public void e(boolean flag)
	{
		a(16, flag ^ true);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:iconst_1        
	//    4    5:ixor            
	//    5    6:invokespecial   #127 <Method void a(int, boolean)>
	//    6    9:return          
	}

	public void f(boolean flag)
	{
		a(64, flag);
	//    0    0:aload_0         
	//    1    1:bipush          64
	//    2    3:iload_1         
	//    3    4:invokespecial   #127 <Method void a(int, boolean)>
	//    4    7:return          
	}

	public boolean f()
	{
		return (b & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int b>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void g(boolean flag)
	{
		a(128, flag);
	//    0    0:aload_0         
	//    1    1:sipush          128
	//    2    4:iload_1         
	//    3    5:invokespecial   #127 <Method void a(int, boolean)>
	//    4    8:return          
	}

	public boolean g()
	{
		return (b & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int b>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field int b>
	//    3    5:invokevirtual   #172 <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field int c>
	//    7   13:invokevirtual   #172 <Method void Parcel.writeInt(int)>
		parcel.writeString(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #37  <Field String d>
	//   11   21:invokevirtual   #175 <Method void Parcel.writeString(String)>
		parcel.writeString(e);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field String e>
	//   15   29:invokevirtual   #175 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (a)), 0);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #54  <Field RobotAxedaPreferences a>
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #179 <Method void Parcel.writeParcelable(Parcelable, int)>
	//   21   41:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotPreferences a(Parcel parcel)
		{
			return new RobotPreferences(parcel);
		//    0    0:new             #9   <Class RobotPreferences>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotPreferences(Parcel)>
		//    4    8:areturn         
		}

		public RobotPreferences[] a(int i)
		{
			return new RobotPreferences[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotPreferences[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotPreferences a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotPreferences[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private RobotAxedaPreferences a;
	private int b;
	private int c;
	private String d;
	private String e;

	static 
	{
	//    0    0:new             #8   <Class RobotPreferences$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void RobotPreferences$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
