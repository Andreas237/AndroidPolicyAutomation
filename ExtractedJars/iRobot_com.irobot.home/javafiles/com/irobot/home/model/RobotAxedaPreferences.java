// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.AssetRegistrationDateEvent;
import com.irobot.core.RobotTimeZoneEvent;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.irobot.home.model:
//			NotificationSettings

public class RobotAxedaPreferences
	implements Parcelable
{

	public RobotAxedaPreferences()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		f = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String f>
		g = new NotificationSettings();
	//    5   10:aload_0         
	//    6   11:new             #37  <Class NotificationSettings>
	//    7   14:dup             
	//    8   15:invokespecial   #38  <Method void NotificationSettings()>
	//    9   18:putfield        #40  <Field NotificationSettings g>
	//   10   21:return          
	}

	public RobotAxedaPreferences(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method String Parcel.readString()>
	//    5    9:putfield        #49  <Field String a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #47  <Method String Parcel.readString()>
	//    9   17:putfield        #51  <Field String b>
		c = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #47  <Method String Parcel.readString()>
	//   13   25:putfield        #53  <Field String c>
		int i = parcel.readInt();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #57  <Method int Parcel.readInt()>
	//   16   32:istore_2        
		boolean flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_3        
		if(i != 1)
	//*  19   35:iload_2         
	//*  20   36:iconst_1        
	//*  21   37:icmpne          43
	//*  22   40:goto            45
			flag = false;
	//   23   43:iconst_0        
	//   24   44:istore_3        
		d = flag;
	//   25   45:aload_0         
	//   26   46:iload_3         
	//   27   47:putfield        #59  <Field boolean d>
		e = parcel.readString();
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #47  <Method String Parcel.readString()>
	//   31   55:putfield        #61  <Field String e>
		f = parcel.readString();
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:invokevirtual   #47  <Method String Parcel.readString()>
	//   35   63:putfield        #35  <Field String f>
		g = (NotificationSettings)parcel.readParcelable(((Class) (com/irobot/home/model/NotificationSettings)).getClassLoader());
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:ldc1            #37  <Class NotificationSettings>
	//   39   70:invokevirtual   #67  <Method ClassLoader Class.getClassLoader()>
	//   40   73:invokevirtual   #71  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   41   76:checkcast       #37  <Class NotificationSettings>
	//   42   79:putfield        #40  <Field NotificationSettings g>
	//   43   82:return          
	}

	public String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String b>
	//    2    4:areturn         
	}

	public void a(AssetRegistrationDateEvent assetregistrationdateevent)
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
	//    0    0:new             #74  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #76  <String "yyyy-MM-dd">
	//    3    6:getstatic       #82  <Field Locale Locale.US>
	//    4    9:invokespecial   #85  <Method void SimpleDateFormat(String, Locale)>
	//    5   12:astore_2        
		simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
	//    6   13:aload_2         
	//    7   14:ldc1            #87  <String "UTC">
	//    8   16:invokestatic    #93  <Method TimeZone TimeZone.getTimeZone(String)>
	//    9   19:invokevirtual   #97  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
		b = simpledateformat.format(assetregistrationdateevent.registrationDate());
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #103 <Method java.util.Date AssetRegistrationDateEvent.registrationDate()>
	//   14   28:invokevirtual   #107 <Method String SimpleDateFormat.format(java.util.Date)>
	//   15   31:putfield        #51  <Field String b>
	//   16   34:return          
	}

	public void a(RobotTimeZoneEvent robottimezoneevent)
	{
		c = robottimezoneevent.robotTimeZone();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #113 <Method String RobotTimeZoneEvent.robotTimeZone()>
	//    3    5:putfield        #53  <Field String c>
	//    4    8:return          
	}

	public String b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String c>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #118 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #120 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #125 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotAxedaPreferences a(Parcel parcel)
		{
			return new RobotAxedaPreferences(parcel);
		//    0    0:new             #9   <Class RobotAxedaPreferences>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotAxedaPreferences(Parcel)>
		//    4    8:areturn         
		}

		public RobotAxedaPreferences[] a(int i)
		{
			return new RobotAxedaPreferences[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotAxedaPreferences[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotAxedaPreferences a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotAxedaPreferences[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private String b;
	private String c;
	private boolean d;
	private String e;
	private String f;
	private NotificationSettings g;

	static 
	{
	//    0    0:new             #8   <Class RobotAxedaPreferences$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void RobotAxedaPreferences$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
