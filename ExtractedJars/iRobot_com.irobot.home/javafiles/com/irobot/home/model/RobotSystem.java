// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.*;
import com.irobot.home.util.DataConverterHelper;
import com.irobot.home.util.j;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.model:
//			RobotSoftwareVersion

public class RobotSystem
	implements Parcelable
{

	public RobotSystem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void Object()>
		c = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #102 <String "">
	//    4    7:putfield        #104 <Field String c>
		i = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #102 <String "">
	//    7   13:putfield        #106 <Field String i>
		l = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #102 <String "">
	//   10   19:putfield        #108 <Field String l>
	//   11   22:return          
	}

	public RobotSystem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void Object()>
		c = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #102 <String "">
	//    4    7:putfield        #104 <Field String c>
		i = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #102 <String "">
	//    7   13:putfield        #106 <Field String i>
		l = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #102 <String "">
	//   10   19:putfield        #108 <Field String l>
		a = parcel.readInt();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #115 <Method int Parcel.readInt()>
	//   14   27:putfield        #117 <Field int a>
		b = parcel.readInt();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #115 <Method int Parcel.readInt()>
	//   18   35:putfield        #119 <Field int b>
		c = parcel.readString();
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #123 <Method String Parcel.readString()>
	//   22   43:putfield        #104 <Field String c>
		d = new RobotSoftwareVersion(parcel.readString());
	//   23   46:aload_0         
	//   24   47:new             #125 <Class RobotSoftwareVersion>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:invokevirtual   #123 <Method String Parcel.readString()>
	//   28   55:invokespecial   #128 <Method void RobotSoftwareVersion(String)>
	//   29   58:putfield        #130 <Field RobotSoftwareVersion d>
		e = parcel.readInt();
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:invokevirtual   #115 <Method int Parcel.readInt()>
	//   33   66:putfield        #132 <Field int e>
		f = parcel.readInt();
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:invokevirtual   #115 <Method int Parcel.readInt()>
	//   37   74:putfield        #134 <Field int f>
		g = parcel.readInt();
	//   38   77:aload_0         
	//   39   78:aload_1         
	//   40   79:invokevirtual   #115 <Method int Parcel.readInt()>
	//   41   82:putfield        #136 <Field int g>
		h = parcel.readInt();
	//   42   85:aload_0         
	//   43   86:aload_1         
	//   44   87:invokevirtual   #115 <Method int Parcel.readInt()>
	//   45   90:putfield        #138 <Field int h>
		i = parcel.readString();
	//   46   93:aload_0         
	//   47   94:aload_1         
	//   48   95:invokevirtual   #123 <Method String Parcel.readString()>
	//   49   98:putfield        #106 <Field String i>
		j = parcel.readInt();
	//   50  101:aload_0         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #115 <Method int Parcel.readInt()>
	//   53  106:putfield        #140 <Field int j>
		k = parcel.readInt();
	//   54  109:aload_0         
	//   55  110:aload_1         
	//   56  111:invokevirtual   #115 <Method int Parcel.readInt()>
	//   57  114:putfield        #142 <Field int k>
		l = parcel.readString();
	//   58  117:aload_0         
	//   59  118:aload_1         
	//   60  119:invokevirtual   #123 <Method String Parcel.readString()>
	//   61  122:putfield        #108 <Field String l>
	//   62  125:return          
	}

	public RobotSystem(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void Object()>
		c = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #102 <String "">
	//    4    7:putfield        #104 <Field String c>
		i = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #102 <String "">
	//    7   13:putfield        #106 <Field String i>
		l = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #102 <String "">
	//   10   19:putfield        #108 <Field String l>
		a = com.irobot.home.util.j.a(jsonobject, "umi", 0);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:ldc1            #145 <String "umi">
	//   14   26:iconst_0        
	//   15   27:invokestatic    #150 <Method int j.a(JSONObject, String, int)>
	//   16   30:putfield        #117 <Field int a>
		b = jsonobject.getInt("pid");
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:ldc1            #152 <String "pid">
	//   20   37:invokevirtual   #158 <Method int JSONObject.getInt(String)>
	//   21   40:putfield        #119 <Field int b>
		c = DataConverterHelper.a(jsonobject.getJSONArray("blid").toString());
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:ldc1            #160 <String "blid">
	//   25   47:invokevirtual   #164 <Method JSONArray JSONObject.getJSONArray(String)>
	//   26   50:invokevirtual   #169 <Method String JSONArray.toString()>
	//   27   53:invokestatic    #174 <Method String DataConverterHelper.a(String)>
	//   28   56:putfield        #104 <Field String c>
		d = new RobotSoftwareVersion(jsonobject.getString("sw"));
	//   29   59:aload_0         
	//   30   60:new             #125 <Class RobotSoftwareVersion>
	//   31   63:dup             
	//   32   64:aload_1         
	//   33   65:ldc1            #176 <String "sw">
	//   34   67:invokevirtual   #179 <Method String JSONObject.getString(String)>
	//   35   70:invokespecial   #128 <Method void RobotSoftwareVersion(String)>
	//   36   73:putfield        #130 <Field RobotSoftwareVersion d>
		e = jsonobject.getInt("cfg");
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:ldc1            #181 <String "cfg">
	//   40   80:invokevirtual   #158 <Method int JSONObject.getInt(String)>
	//   41   83:putfield        #132 <Field int e>
		f = jsonobject.getInt("boot");
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:ldc1            #183 <String "boot">
	//   45   90:invokevirtual   #158 <Method int JSONObject.getInt(String)>
	//   46   93:putfield        #134 <Field int f>
		g = jsonobject.getInt("main");
	//   47   96:aload_0         
	//   48   97:aload_1         
	//   49   98:ldc1            #185 <String "main">
	//   50  100:invokevirtual   #158 <Method int JSONObject.getInt(String)>
	//   51  103:putfield        #136 <Field int g>
		h = jsonobject.getInt("wifi");
	//   52  106:aload_0         
	//   53  107:aload_1         
	//   54  108:ldc1            #187 <String "wifi">
	//   55  110:invokevirtual   #158 <Method int JSONObject.getInt(String)>
	//   56  113:putfield        #138 <Field int h>
		i = jsonobject.getString("nav");
	//   57  116:aload_0         
	//   58  117:aload_1         
	//   59  118:ldc1            #189 <String "nav">
	//   60  120:invokevirtual   #179 <Method String JSONObject.getString(String)>
	//   61  123:putfield        #106 <Field String i>
		j = jsonobject.getInt("ui");
	//   62  126:aload_0         
	//   63  127:aload_1         
	//   64  128:ldc1            #191 <String "ui">
	//   65  130:invokevirtual   #158 <Method int JSONObject.getInt(String)>
	//   66  133:putfield        #140 <Field int j>
		k = jsonobject.getInt("audio");
	//   67  136:aload_0         
	//   68  137:aload_1         
	//   69  138:ldc1            #193 <String "audio">
	//   70  140:invokevirtual   #158 <Method int JSONObject.getInt(String)>
	//   71  143:putfield        #142 <Field int k>
		l = jsonobject.getString("bat");
	//   72  146:aload_0         
	//   73  147:aload_1         
	//   74  148:ldc1            #195 <String "bat">
	//   75  150:invokevirtual   #179 <Method String JSONObject.getString(String)>
	//   76  153:putfield        #108 <Field String l>
	//   77  156:return          
	}

	public String a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String c>
	//    2    4:areturn         
	}

	public void a(AssetAudioVersionEvent assetaudioversionevent)
	{
		k = ((int) (assetaudioversionevent.audioVersion()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #202 <Method short AssetAudioVersionEvent.audioVersion()>
	//    3    5:putfield        #142 <Field int k>
	//    4    8:return          
	}

	public void a(AssetBatteryTypeEvent assetbatterytypeevent)
	{
		l = (String)m.get(((Object) (assetbatterytypeevent.batteryType())));
	//    0    0:aload_0         
	//    1    1:getstatic       #98  <Field Map m>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #209 <Method BatteryType AssetBatteryTypeEvent.batteryType()>
	//    4    8:invokeinterface #213 <Method Object Map.get(Object)>
	//    5   13:checkcast       #215 <Class String>
	//    6   16:putfield        #108 <Field String l>
	//    7   19:return          
	}

	public void a(AssetUmiVersionEvent assetumiversionevent)
	{
		a = ((int) (assetumiversionevent.umiVersion()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #221 <Method short AssetUmiVersionEvent.umiVersion()>
	//    3    5:putfield        #117 <Field int a>
	//    4    8:return          
	}

	public void a(SoftwareVersion softwareversion)
	{
		if(softwareversion != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			d = new RobotSoftwareVersion(softwareversion.toString());
	//    2    4:aload_0         
	//    3    5:new             #125 <Class RobotSoftwareVersion>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #225 <Method String SoftwareVersion.toString()>
	//    7   13:invokespecial   #128 <Method void RobotSoftwareVersion(String)>
	//    8   16:putfield        #130 <Field RobotSoftwareVersion d>
			return;
	//    9   19:return          
		} else
		{
			d = new RobotSoftwareVersion("");
	//   10   20:aload_0         
	//   11   21:new             #125 <Class RobotSoftwareVersion>
	//   12   24:dup             
	//   13   25:ldc1            #102 <String "">
	//   14   27:invokespecial   #128 <Method void RobotSoftwareVersion(String)>
	//   15   30:putfield        #130 <Field RobotSoftwareVersion d>
			return;
	//   16   33:return          
		}
	}

	public void a(RobotSystem robotsystem)
	{
		a = robotsystem.a;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #117 <Field int a>
	//    3    5:putfield        #117 <Field int a>
		b = robotsystem.b;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #119 <Field int b>
	//    7   13:putfield        #119 <Field int b>
		c = robotsystem.c;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #104 <Field String c>
	//   11   21:putfield        #104 <Field String c>
		d = robotsystem.d;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #130 <Field RobotSoftwareVersion d>
	//   15   29:putfield        #130 <Field RobotSoftwareVersion d>
		e = robotsystem.e;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #132 <Field int e>
	//   19   37:putfield        #132 <Field int e>
		f = robotsystem.f;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #134 <Field int f>
	//   23   45:putfield        #134 <Field int f>
		g = robotsystem.g;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #136 <Field int g>
	//   27   53:putfield        #136 <Field int g>
		h = robotsystem.h;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #138 <Field int h>
	//   31   61:putfield        #138 <Field int h>
		i = robotsystem.i;
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #106 <Field String i>
	//   35   69:putfield        #106 <Field String i>
		j = robotsystem.j;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:getfield        #140 <Field int j>
	//   39   77:putfield        #140 <Field int j>
		k = robotsystem.k;
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:getfield        #142 <Field int k>
	//   43   85:putfield        #142 <Field int k>
		l = robotsystem.l;
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:getfield        #108 <Field String l>
	//   47   93:putfield        #108 <Field String l>
	//   48   96:return          
	}

	public void a(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #104 <Field String c>
	//    3    5:return          
	}

	public AssetId b()
	{
		if(n == null || !n.getId().equals(((Object) (c))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field AssetId n>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #229 <Field AssetId n>
	//*   5   11:invokevirtual   #234 <Method String AssetId.getId()>
	//*   6   14:aload_0         
	//*   7   15:getfield        #104 <Field String c>
	//*   8   18:invokevirtual   #238 <Method boolean String.equals(Object)>
	//*   9   21:ifne            35
			n = AssetId.assetIdForString(c);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #104 <Field String c>
	//   13   29:invokestatic    #242 <Method AssetId AssetId.assetIdForString(String)>
	//   14   32:putfield        #229 <Field AssetId n>
		return n;
	//   15   35:aload_0         
	//   16   36:getfield        #229 <Field AssetId n>
	//   17   39:areturn         
	}

	public SoftwareVersion c()
	{
		String s;
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field RobotSoftwareVersion d>
	//*   2    4:ifnull          18
			s = d.toString();
	//    3    7:aload_0         
	//    4    8:getfield        #130 <Field RobotSoftwareVersion d>
	//    5   11:invokevirtual   #244 <Method String RobotSoftwareVersion.toString()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            21
			s = "";
	//    8   18:ldc1            #102 <String "">
	//    9   20:astore_1        
		return SoftwareVersion.create(s);
	//   10   21:aload_1         
	//   11   22:invokestatic    #248 <Method SoftwareVersion SoftwareVersion.create(String)>
	//   12   25:areturn         
	}

	public int d()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int k>
	//    2    4:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #117 <Field int a>
	//    3    5:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #119 <Field int b>
	//    7   13:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeString(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #104 <Field String c>
	//   11   21:invokevirtual   #258 <Method void Parcel.writeString(String)>
		String s;
		if(d != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #130 <Field RobotSoftwareVersion d>
	//*  14   28:ifnull          42
			s = d.toString();
	//   15   31:aload_0         
	//   16   32:getfield        #130 <Field RobotSoftwareVersion d>
	//   17   35:invokevirtual   #244 <Method String RobotSoftwareVersion.toString()>
	//   18   38:astore_3        
		else
	//*  19   39:goto            45
			s = "";
	//   20   42:ldc1            #102 <String "">
	//   21   44:astore_3        
		parcel.writeString(s);
	//   22   45:aload_1         
	//   23   46:aload_3         
	//   24   47:invokevirtual   #258 <Method void Parcel.writeString(String)>
		parcel.writeInt(e);
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:getfield        #132 <Field int e>
	//   28   55:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeInt(f);
	//   29   58:aload_1         
	//   30   59:aload_0         
	//   31   60:getfield        #134 <Field int f>
	//   32   63:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeInt(g);
	//   33   66:aload_1         
	//   34   67:aload_0         
	//   35   68:getfield        #136 <Field int g>
	//   36   71:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeInt(h);
	//   37   74:aload_1         
	//   38   75:aload_0         
	//   39   76:getfield        #138 <Field int h>
	//   40   79:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeString(i);
	//   41   82:aload_1         
	//   42   83:aload_0         
	//   43   84:getfield        #106 <Field String i>
	//   44   87:invokevirtual   #258 <Method void Parcel.writeString(String)>
		parcel.writeInt(j);
	//   45   90:aload_1         
	//   46   91:aload_0         
	//   47   92:getfield        #140 <Field int j>
	//   48   95:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeInt(k);
	//   49   98:aload_1         
	//   50   99:aload_0         
	//   51  100:getfield        #142 <Field int k>
	//   52  103:invokevirtual   #255 <Method void Parcel.writeInt(int)>
		parcel.writeString(l);
	//   53  106:aload_1         
	//   54  107:aload_0         
	//   55  108:getfield        #108 <Field String l>
	//   56  111:invokevirtual   #258 <Method void Parcel.writeString(String)>
	//   57  114:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotSystem a(Parcel parcel)
		{
			return new RobotSystem(parcel);
		//    0    0:new             #9   <Class RobotSystem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotSystem(Parcel)>
		//    4    8:areturn         
		}

		public RobotSystem[] a(int i1)
		{
			return new RobotSystem[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotSystem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotSystem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotSystem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private static transient Map m;
	private int a;
	private int b;
	private String c;
	private RobotSoftwareVersion d;
	private int e;
	private int f;
	private int g;
	private int h;
	private String i;
	private int j;
	private int k;
	private String l;
	private transient AssetId n;

	static 
	{
	//    0    0:new             #8   <Class RobotSystem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void RobotSystem$1()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #40  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void HashMap()>
	//    7   17:astore_0        
		((Map) (hashmap)).put(((Object) (BatteryType.None)), "none");
	//    8   18:aload_0         
	//    9   19:getstatic       #47  <Field BatteryType BatteryType.None>
	//   10   22:ldc1            #49  <String "none">
	//   11   24:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   12   29:pop             
		((Map) (hashmap)).put(((Object) (BatteryType.Nimh)), "nimh");
	//   13   30:aload_0         
	//   14   31:getstatic       #58  <Field BatteryType BatteryType.Nimh>
	//   15   34:ldc1            #60  <String "nimh">
	//   16   36:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   17   41:pop             
		((Map) (hashmap)).put(((Object) (BatteryType.Lith)), "lith");
	//   18   42:aload_0         
	//   19   43:getstatic       #63  <Field BatteryType BatteryType.Lith>
	//   20   46:ldc1            #65  <String "lith">
	//   21   48:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   22   53:pop             
		((Map) (hashmap)).put(((Object) (BatteryType.Lith2600)), "li26");
	//   23   54:aload_0         
	//   24   55:getstatic       #68  <Field BatteryType BatteryType.Lith2600>
	//   25   58:ldc1            #70  <String "li26">
	//   26   60:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   27   65:pop             
		((Map) (hashmap)).put(((Object) (BatteryType.F12432832P)), "f12432832p");
	//   28   66:aload_0         
	//   29   67:getstatic       #73  <Field BatteryType BatteryType.F12432832P>
	//   30   70:ldc1            #75  <String "f12432832p">
	//   31   72:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   32   77:pop             
		((Map) (hashmap)).put(((Object) (BatteryType.F12432832R)), "f12432832r");
	//   33   78:aload_0         
	//   34   79:getstatic       #78  <Field BatteryType BatteryType.F12432832R>
	//   35   82:ldc1            #80  <String "f12432832r">
	//   36   84:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   37   89:pop             
		((Map) (hashmap)).put(((Object) (BatteryType.F12432712)), "f12432712");
	//   38   90:aload_0         
	//   39   91:getstatic       #83  <Field BatteryType BatteryType.F12432712>
	//   40   94:ldc1            #85  <String "f12432712">
	//   41   96:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   42  101:pop             
		((Map) (hashmap)).put(((Object) (BatteryType.F12432784)), "f12432784");
	//   43  102:aload_0         
	//   44  103:getstatic       #88  <Field BatteryType BatteryType.F12432784>
	//   45  106:ldc1            #90  <String "f12432784">
	//   46  108:invokeinterface #55  <Method Object Map.put(Object, Object)>
	//   47  113:pop             
		m = Collections.unmodifiableMap(((Map) (hashmap)));
	//   48  114:aload_0         
	//   49  115:invokestatic    #96  <Method Map Collections.unmodifiableMap(Map)>
	//   50  118:putstatic       #98  <Field Map m>
	//*  51  121:return          
	}
}
