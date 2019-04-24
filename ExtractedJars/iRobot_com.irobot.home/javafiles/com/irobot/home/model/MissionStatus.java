// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.core.*;
import com.irobot.home.util.j;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.model:
//			n, ab, Position, r

public class MissionStatus
	implements Parcelable
{

	public MissionStatus()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void Object()>
		b = n.NONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #58  <Field n n.NONE>
	//    4    8:putfield        #179 <Field n b>
		c = ab.STOP;
	//    5   11:aload_0         
	//    6   12:getstatic       #125 <Field ab ab.STOP>
	//    7   15:putfield        #181 <Field ab c>
		d = new Position();
	//    8   18:aload_0         
	//    9   19:new             #183 <Class Position>
	//   10   22:dup             
	//   11   23:invokespecial   #184 <Method void Position()>
	//   12   26:putfield        #186 <Field Position d>
		h = r.NO_ERROR;
	//   13   29:aload_0         
	//   14   30:getstatic       #191 <Field r r.NO_ERROR>
	//   15   33:putfield        #193 <Field r h>
		i = RobotReadinessState.None;
	//   16   36:aload_0         
	//   17   37:getstatic       #197 <Field RobotReadinessState RobotReadinessState.None>
	//   18   40:putfield        #199 <Field RobotReadinessState i>
	//   19   43:return          
	}

	public MissionStatus(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #206 <Method int Parcel.readInt()>
	//    5    9:putfield        #208 <Field int a>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #210 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #211 <Method void StringBuilder()>
	//    9   19:astore_2        
		stringbuilder.append("");
	//   10   20:aload_2         
	//   11   21:ldc1            #213 <String "">
	//   12   23:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(parcel.readInt());
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #206 <Method int Parcel.readInt()>
	//   17   32:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//   18   35:pop             
		b = n.fromString(stringbuilder.toString());
	//   19   36:aload_0         
	//   20   37:aload_2         
	//   21   38:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   22   41:invokestatic    #228 <Method n n.fromString(String)>
	//   23   44:putfield        #179 <Field n b>
		stringbuilder = new StringBuilder();
	//   24   47:new             #210 <Class StringBuilder>
	//   25   50:dup             
	//   26   51:invokespecial   #211 <Method void StringBuilder()>
	//   27   54:astore_2        
		stringbuilder.append("");
	//   28   55:aload_2         
	//   29   56:ldc1            #213 <String "">
	//   30   58:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
		stringbuilder.append(parcel.readInt());
	//   32   62:aload_2         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #206 <Method int Parcel.readInt()>
	//   35   67:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//   36   70:pop             
		c = ab.fromString(stringbuilder.toString());
	//   37   71:aload_0         
	//   38   72:aload_2         
	//   39   73:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   40   76:invokestatic    #231 <Method ab ab.fromString(String)>
	//   41   79:putfield        #181 <Field ab c>
		d = (Position)parcel.readParcelable(((Class) (com/irobot/home/model/Position)).getClassLoader());
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:ldc1            #183 <Class Position>
	//   45   86:invokevirtual   #237 <Method ClassLoader Class.getClassLoader()>
	//   46   89:invokevirtual   #241 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   47   92:checkcast       #183 <Class Position>
	//   48   95:putfield        #186 <Field Position d>
		e = parcel.readInt();
	//   49   98:aload_0         
	//   50   99:aload_1         
	//   51  100:invokevirtual   #206 <Method int Parcel.readInt()>
	//   52  103:putfield        #243 <Field int e>
		f = parcel.readInt();
	//   53  106:aload_0         
	//   54  107:aload_1         
	//   55  108:invokevirtual   #206 <Method int Parcel.readInt()>
	//   56  111:putfield        #245 <Field int f>
		g = parcel.readInt();
	//   57  114:aload_0         
	//   58  115:aload_1         
	//   59  116:invokevirtual   #206 <Method int Parcel.readInt()>
	//   60  119:putfield        #247 <Field int g>
		h = (r)parcel.readSerializable();
	//   61  122:aload_0         
	//   62  123:aload_1         
	//   63  124:invokevirtual   #251 <Method java.io.Serializable Parcel.readSerializable()>
	//   64  127:checkcast       #188 <Class r>
	//   65  130:putfield        #193 <Field r h>
		i = RobotReadinessState.values()[Math.min(RobotReadinessState.InCloudUpgrade.ordinal(), ((Integer)parcel.readSerializable()).intValue())];
	//   66  133:aload_0         
	//   67  134:invokestatic    #255 <Method RobotReadinessState[] RobotReadinessState.values()>
	//   68  137:getstatic       #258 <Field RobotReadinessState RobotReadinessState.InCloudUpgrade>
	//   69  140:invokevirtual   #261 <Method int RobotReadinessState.ordinal()>
	//   70  143:aload_1         
	//   71  144:invokevirtual   #251 <Method java.io.Serializable Parcel.readSerializable()>
	//   72  147:checkcast       #263 <Class Integer>
	//   73  150:invokevirtual   #266 <Method int Integer.intValue()>
	//   74  153:invokestatic    #272 <Method int Math.min(int, int)>
	//   75  156:aaload          
	//   76  157:putfield        #199 <Field RobotReadinessState i>
		j = parcel.readInt();
	//   77  160:aload_0         
	//   78  161:aload_1         
	//   79  162:invokevirtual   #206 <Method int Parcel.readInt()>
	//   80  165:putfield        #274 <Field int j>
		k = parcel.readInt();
	//   81  168:aload_0         
	//   82  169:aload_1         
	//   83  170:invokevirtual   #206 <Method int Parcel.readInt()>
	//   84  173:putfield        #276 <Field int k>
	//   85  176:return          
	}

	public MissionStatus(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void Object()>
		a = jsonobject.getInt("flags");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc2            #279 <String "flags">
	//    5    9:invokevirtual   #285 <Method int JSONObject.getInt(String)>
	//    6   12:putfield        #208 <Field int a>
		b = n.fromString(jsonobject.getString("cycle"));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:ldc2            #287 <String "cycle">
	//   10   20:invokevirtual   #291 <Method String JSONObject.getString(String)>
	//   11   23:invokestatic    #228 <Method n n.fromString(String)>
	//   12   26:putfield        #179 <Field n b>
		c = ab.fromString(jsonobject.getString("phase"));
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:ldc2            #293 <String "phase">
	//   16   34:invokevirtual   #291 <Method String JSONObject.getString(String)>
	//   17   37:invokestatic    #231 <Method ab ab.fromString(String)>
	//   18   40:putfield        #181 <Field ab c>
		d = new Position(jsonobject.getJSONObject("pos"));
	//   19   43:aload_0         
	//   20   44:new             #183 <Class Position>
	//   21   47:dup             
	//   22   48:aload_1         
	//   23   49:ldc2            #295 <String "pos">
	//   24   52:invokevirtual   #299 <Method JSONObject JSONObject.getJSONObject(String)>
	//   25   55:invokespecial   #301 <Method void Position(JSONObject)>
	//   26   58:putfield        #186 <Field Position d>
		e = com.irobot.home.util.j.a(jsonobject, "batPct", 0);
	//   27   61:aload_0         
	//   28   62:aload_1         
	//   29   63:ldc2            #303 <String "batPct">
	//   30   66:iconst_0        
	//   31   67:invokestatic    #308 <Method int j.a(JSONObject, String, int)>
	//   32   70:putfield        #243 <Field int e>
		f = com.irobot.home.util.j.a(jsonobject, "expireM", 0);
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:ldc2            #310 <String "expireM">
	//   36   78:iconst_0        
	//   37   79:invokestatic    #308 <Method int j.a(JSONObject, String, int)>
	//   38   82:putfield        #245 <Field int f>
		g = com.irobot.home.util.j.a(jsonobject, "rechrgM", 0);
	//   39   85:aload_0         
	//   40   86:aload_1         
	//   41   87:ldc2            #312 <String "rechrgM">
	//   42   90:iconst_0        
	//   43   91:invokestatic    #308 <Method int j.a(JSONObject, String, int)>
	//   44   94:putfield        #247 <Field int g>
		h = r.get(com.irobot.home.util.j.a(jsonobject, "error", 0));
	//   45   97:aload_0         
	//   46   98:aload_1         
	//   47   99:ldc2            #314 <String "error">
	//   48  102:iconst_0        
	//   49  103:invokestatic    #308 <Method int j.a(JSONObject, String, int)>
	//   50  106:invokestatic    #318 <Method r r.get(int)>
	//   51  109:putfield        #193 <Field r h>
		j = com.irobot.home.util.j.a(jsonobject, "mssnM", 0);
	//   52  112:aload_0         
	//   53  113:aload_1         
	//   54  114:ldc2            #320 <String "mssnM">
	//   55  117:iconst_0        
	//   56  118:invokestatic    #308 <Method int j.a(JSONObject, String, int)>
	//   57  121:putfield        #274 <Field int j>
		k = com.irobot.home.util.j.a(jsonobject, "sqft", 0);
	//   58  124:aload_0         
	//   59  125:aload_1         
	//   60  126:ldc2            #322 <String "sqft">
	//   61  129:iconst_0        
	//   62  130:invokestatic    #308 <Method int j.a(JSONObject, String, int)>
	//   63  133:putfield        #276 <Field int k>
		int i1 = com.irobot.home.util.j.a(jsonobject, "notReady", 0);
	//   64  136:aload_1         
	//   65  137:ldc2            #324 <String "notReady">
	//   66  140:iconst_0        
	//   67  141:invokestatic    #308 <Method int j.a(JSONObject, String, int)>
	//   68  144:istore_2        
		if(i1 <= 10)
	//*  69  145:iload_2         
	//*  70  146:bipush          10
	//*  71  148:icmpgt          160
			jsonobject = ((JSONObject) (RobotReadinessState.values()[i1]));
	//   72  151:invokestatic    #255 <Method RobotReadinessState[] RobotReadinessState.values()>
	//   73  154:iload_2         
	//   74  155:aaload          
	//   75  156:astore_1        
		else
	//*  76  157:goto            168
			jsonobject = ((JSONObject) (RobotReadinessState.values()[i1 - 3]));
	//   77  160:invokestatic    #255 <Method RobotReadinessState[] RobotReadinessState.values()>
	//   78  163:iload_2         
	//   79  164:iconst_3        
	//   80  165:isub            
	//   81  166:aaload          
	//   82  167:astore_1        
		i = ((RobotReadinessState) (jsonobject));
	//   83  168:aload_0         
	//   84  169:aload_1         
	//   85  170:putfield        #199 <Field RobotReadinessState i>
	//   86  173:return          
	}

	public void a(AssetGenericEvent assetgenericevent)
	{
		if(assetgenericevent.id().equalsIgnoreCase("batPct"))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #330 <Method String AssetGenericEvent.id()>
	//*   2    4:ldc2            #303 <String "batPct">
	//*   3    7:invokevirtual   #336 <Method boolean String.equalsIgnoreCase(String)>
	//*   4   10:ifeq            25
			e = ((int) (assetgenericevent.int16Value("batPct", (short)0)));
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:ldc2            #303 <String "batPct">
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #340 <Method short AssetGenericEvent.int16Value(String, short)>
	//   10   22:putfield        #243 <Field int e>
	//   11   25:return          
	}

	public void a(RobotAudioPlayingEvent robotaudioplayingevent)
	{
		int i1;
		if(robotaudioplayingevent.isAudioActive())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #347 <Method boolean RobotAudioPlayingEvent.isAudioActive()>
	//*   2    4:ifeq            21
			i1 = a | 8;
	//    3    7:aload_0         
	//    4    8:getfield        #208 <Field int a>
	//    5   11:bipush          8
	//    6   13:ior             
	//    7   14:istore_2        
		else
	//*   8   15:aload_0         
	//*   9   16:iload_2         
	//*  10   17:putfield        #208 <Field int a>
	//*  11   20:return          
			i1 = a & -9;
	//   12   21:aload_0         
	//   13   22:getfield        #208 <Field int a>
	//   14   25:bipush          -9
	//   15   27:iand            
	//   16   28:istore_2        
		a = i1;
	//*  17   29:goto            15
	}

	public void a(RobotBatteryLevelEvent robotbatterylevelevent)
	{
		e = ((int) (robotbatterylevelevent.currentBatteryLevel()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #354 <Method short RobotBatteryLevelEvent.currentBatteryLevel()>
	//    3    5:putfield        #243 <Field int e>
	//    4    8:return          
	}

	public void a(RobotBinFullEvent robotbinfullevent)
	{
		int i1;
		if(robotbinfullevent.isBinFull())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #360 <Method boolean RobotBinFullEvent.isBinFull()>
	//*   2    4:ifeq            20
			i1 = a | 1;
	//    3    7:aload_0         
	//    4    8:getfield        #208 <Field int a>
	//    5   11:iconst_1        
	//    6   12:ior             
	//    7   13:istore_2        
		else
	//*   8   14:aload_0         
	//*   9   15:iload_2         
	//*  10   16:putfield        #208 <Field int a>
	//*  11   19:return          
			i1 = a & -2;
	//   12   20:aload_0         
	//   13   21:getfield        #208 <Field int a>
	//   14   24:bipush          -2
	//   15   26:iand            
	//   16   27:istore_2        
		a = i1;
	//*  17   28:goto            14
	}

	public void a(RobotBinRemovalEvent robotbinremovalevent)
	{
		int i1;
		if(robotbinremovalevent.isBinRemoved())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #366 <Method boolean RobotBinRemovalEvent.isBinRemoved()>
	//*   2    4:ifeq            20
			i1 = a | 2;
	//    3    7:aload_0         
	//    4    8:getfield        #208 <Field int a>
	//    5   11:iconst_2        
	//    6   12:ior             
	//    7   13:istore_2        
		else
	//*   8   14:aload_0         
	//*   9   15:iload_2         
	//*  10   16:putfield        #208 <Field int a>
	//*  11   19:return          
			i1 = a & -3;
	//   12   20:aload_0         
	//   13   21:getfield        #208 <Field int a>
	//   14   24:bipush          -3
	//   15   26:iand            
	//   16   27:istore_2        
		a = i1;
	//*  17   28:goto            14
	}

	public void a(RobotErrorEvent roboterrorevent)
	{
		h = r.get(((int) (roboterrorevent.robotErrorCode())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #372 <Method short RobotErrorEvent.robotErrorCode()>
	//    3    5:invokestatic    #318 <Method r r.get(int)>
	//    4    8:putfield        #193 <Field r h>
	//    5   11:return          
	}

	public void a(RobotMissionStatusEvent robotmissionstatusevent)
	{
		b = (n)l.get(((Object) (robotmissionstatusevent.missionType())));
	//    0    0:aload_0         
	//    1    1:getstatic       #114 <Field Map l>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #379 <Method RobotMissionType RobotMissionStatusEvent.missionType()>
	//    4    8:invokeinterface #382 <Method Object Map.get(Object)>
	//    5   13:checkcast       #55  <Class n>
	//    6   16:putfield        #179 <Field n b>
		c = (ab)m.get(((Object) (robotmissionstatusevent.missionPhase())));
	//    7   19:aload_0         
	//    8   20:getstatic       #175 <Field Map m>
	//    9   23:aload_1         
	//   10   24:invokevirtual   #386 <Method RobotMissionPhase RobotMissionStatusEvent.missionPhase()>
	//   11   27:invokeinterface #382 <Method Object Map.get(Object)>
	//   12   32:checkcast       #122 <Class ab>
	//   13   35:putfield        #181 <Field ab c>
	//   14   38:return          
	}

	public void a(RobotReadinessEvent robotreadinessevent)
	{
		i = robotreadinessevent.readinessState();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #393 <Method RobotReadinessState RobotReadinessEvent.readinessState()>
	//    3    5:putfield        #199 <Field RobotReadinessState i>
	//    4    8:return          
	}

	public boolean a()
	{
		return (a & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field int a>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean b()
	{
		return h != r.NO_ERROR || i != RobotReadinessState.None;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field r h>
	//    2    4:getstatic       #191 <Field r r.NO_ERROR>
	//    3    7:if_acmpne       25
	//    4   10:aload_0         
	//    5   11:getfield        #199 <Field RobotReadinessState i>
	//    6   14:getstatic       #197 <Field RobotReadinessState RobotReadinessState.None>
	//    7   17:if_acmpeq       23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public boolean c()
	{
		return (c == ab.STOP || c == ab.CHARGE || d()) && f();
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ab c>
	//    2    4:getstatic       #125 <Field ab ab.STOP>
	//    3    7:if_acmpeq       27
	//    4   10:aload_0         
	//    5   11:getfield        #181 <Field ab c>
	//    6   14:getstatic       #131 <Field ab ab.CHARGE>
	//    7   17:if_acmpeq       27
	//    8   20:aload_0         
	//    9   21:invokevirtual   #395 <Method boolean d()>
	//   10   24:ifeq            36
	//   11   27:aload_0         
	//   12   28:invokevirtual   #397 <Method boolean f()>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	public boolean d()
	{
		return c == ab.STUCK;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ab c>
	//    2    4:getstatic       #143 <Field ab ab.STUCK>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean e()
	{
		return c == ab.CHARGE;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ab c>
	//    2    4:getstatic       #131 <Field ab ab.CHARGE>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean f()
	{
		return b == n.CLEAN || b == n.QUICK || b == n.MANUAL || b == n.SPOT || b == n.TRAIN;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field n b>
	//    2    4:getstatic       #70  <Field n n.CLEAN>
	//    3    7:if_acmpeq       55
	//    4   10:aload_0         
	//    5   11:getfield        #179 <Field n b>
	//    6   14:getstatic       #82  <Field n n.QUICK>
	//    7   17:if_acmpeq       55
	//    8   20:aload_0         
	//    9   21:getfield        #179 <Field n b>
	//   10   24:getstatic       #94  <Field n n.MANUAL>
	//   11   27:if_acmpeq       55
	//   12   30:aload_0         
	//   13   31:getfield        #179 <Field n b>
	//   14   34:getstatic       #76  <Field n n.SPOT>
	//   15   37:if_acmpeq       55
	//   16   40:aload_0         
	//   17   41:getfield        #179 <Field n b>
	//   18   44:getstatic       #106 <Field n n.TRAIN>
	//   19   47:if_acmpne       53
	//   20   50:goto            55
	//   21   53:iconst_0        
	//   22   54:ireturn         
	//   23   55:iconst_1        
	//   24   56:ireturn         
	}

	public boolean g()
	{
		return c == ab.CHARGE || c == ab.HOME_MID_MISSION;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ab c>
	//    2    4:getstatic       #131 <Field ab ab.CHARGE>
	//    3    7:if_acmpeq       25
	//    4   10:aload_0         
	//    5   11:getfield        #181 <Field ab c>
	//    6   14:getstatic       #155 <Field ab ab.HOME_MID_MISSION>
	//    7   17:if_acmpne       23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #208 <Field int a>
	//    3    5:invokevirtual   #404 <Method void Parcel.writeInt(int)>
		parcel.writeInt(b.ordinal());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #179 <Field n b>
	//    7   13:invokevirtual   #405 <Method int n.ordinal()>
	//    8   16:invokevirtual   #404 <Method void Parcel.writeInt(int)>
		parcel.writeInt(c.ordinal());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #181 <Field ab c>
	//   12   24:invokevirtual   #406 <Method int ab.ordinal()>
	//   13   27:invokevirtual   #404 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((Parcelable) (d)), 0);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #186 <Field Position d>
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #410 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeInt(e);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:getfield        #243 <Field int e>
	//   22   44:invokevirtual   #404 <Method void Parcel.writeInt(int)>
		parcel.writeInt(f);
	//   23   47:aload_1         
	//   24   48:aload_0         
	//   25   49:getfield        #245 <Field int f>
	//   26   52:invokevirtual   #404 <Method void Parcel.writeInt(int)>
		parcel.writeInt(g);
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #247 <Field int g>
	//   30   60:invokevirtual   #404 <Method void Parcel.writeInt(int)>
		parcel.writeSerializable(((java.io.Serializable) (h)));
	//   31   63:aload_1         
	//   32   64:aload_0         
	//   33   65:getfield        #193 <Field r h>
	//   34   68:invokevirtual   #414 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeSerializable(((java.io.Serializable) (Integer.valueOf(i.ordinal()))));
	//   35   71:aload_1         
	//   36   72:aload_0         
	//   37   73:getfield        #199 <Field RobotReadinessState i>
	//   38   76:invokevirtual   #261 <Method int RobotReadinessState.ordinal()>
	//   39   79:invokestatic    #418 <Method Integer Integer.valueOf(int)>
	//   40   82:invokevirtual   #414 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeInt(j);
	//   41   85:aload_1         
	//   42   86:aload_0         
	//   43   87:getfield        #274 <Field int j>
	//   44   90:invokevirtual   #404 <Method void Parcel.writeInt(int)>
		parcel.writeInt(k);
	//   45   93:aload_1         
	//   46   94:aload_0         
	//   47   95:getfield        #276 <Field int k>
	//   48   98:invokevirtual   #404 <Method void Parcel.writeInt(int)>
	//   49  101:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MissionStatus a(Parcel parcel)
		{
			return new MissionStatus(parcel);
		//    0    0:new             #9   <Class MissionStatus>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MissionStatus(Parcel)>
		//    4    8:areturn         
		}

		public MissionStatus[] a(int i1)
		{
			return new MissionStatus[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       MissionStatus[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method MissionStatus a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method MissionStatus[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private static transient Map l;
	private static transient Map m;
	private int a;
	private n b;
	private ab c;
	private Position d;
	private int e;
	private int f;
	private int g;
	private r h;
	private RobotReadinessState i;
	private int j;
	private int k;

	static 
	{
	//    0    0:new             #8   <Class MissionStatus$1>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void MissionStatus$1()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
		HashMap hashmap = new HashMap();
	//    4   10:new             #46  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #47  <Method void HashMap()>
	//    7   17:astore_0        
		((Map) (hashmap)).put(((Object) (RobotMissionType.None)), ((Object) (n.NONE)));
	//    8   18:aload_0         
	//    9   19:getstatic       #53  <Field RobotMissionType RobotMissionType.None>
	//   10   22:getstatic       #58  <Field n n.NONE>
	//   11   25:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   12   30:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionType.Clean)), ((Object) (n.CLEAN)));
	//   13   31:aload_0         
	//   14   32:getstatic       #67  <Field RobotMissionType RobotMissionType.Clean>
	//   15   35:getstatic       #70  <Field n n.CLEAN>
	//   16   38:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   17   43:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionType.Spot)), ((Object) (n.SPOT)));
	//   18   44:aload_0         
	//   19   45:getstatic       #73  <Field RobotMissionType RobotMissionType.Spot>
	//   20   48:getstatic       #76  <Field n n.SPOT>
	//   21   51:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   22   56:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionType.Quick)), ((Object) (n.QUICK)));
	//   23   57:aload_0         
	//   24   58:getstatic       #79  <Field RobotMissionType RobotMissionType.Quick>
	//   25   61:getstatic       #82  <Field n n.QUICK>
	//   26   64:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   27   69:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionType.Dock)), ((Object) (n.DOCK)));
	//   28   70:aload_0         
	//   29   71:getstatic       #85  <Field RobotMissionType RobotMissionType.Dock>
	//   30   74:getstatic       #88  <Field n n.DOCK>
	//   31   77:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   32   82:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionType.Manual)), ((Object) (n.MANUAL)));
	//   33   83:aload_0         
	//   34   84:getstatic       #91  <Field RobotMissionType RobotMissionType.Manual>
	//   35   87:getstatic       #94  <Field n n.MANUAL>
	//   36   90:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   37   95:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionType.Evac)), ((Object) (n.EVAC)));
	//   38   96:aload_0         
	//   39   97:getstatic       #97  <Field RobotMissionType RobotMissionType.Evac>
	//   40  100:getstatic       #100 <Field n n.EVAC>
	//   41  103:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   42  108:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionType.Train)), ((Object) (n.TRAIN)));
	//   43  109:aload_0         
	//   44  110:getstatic       #103 <Field RobotMissionType RobotMissionType.Train>
	//   45  113:getstatic       #106 <Field n n.TRAIN>
	//   46  116:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   47  121:pop             
		l = Collections.unmodifiableMap(((Map) (hashmap)));
	//   48  122:aload_0         
	//   49  123:invokestatic    #112 <Method Map Collections.unmodifiableMap(Map)>
	//   50  126:putstatic       #114 <Field Map l>
		hashmap = new HashMap();
	//   51  129:new             #46  <Class HashMap>
	//   52  132:dup             
	//   53  133:invokespecial   #47  <Method void HashMap()>
	//   54  136:astore_0        
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.Stopped)), ((Object) (ab.STOP)));
	//   55  137:aload_0         
	//   56  138:getstatic       #120 <Field RobotMissionPhase RobotMissionPhase.Stopped>
	//   57  141:getstatic       #125 <Field ab ab.STOP>
	//   58  144:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   59  149:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.Charging)), ((Object) (ab.CHARGE)));
	//   60  150:aload_0         
	//   61  151:getstatic       #128 <Field RobotMissionPhase RobotMissionPhase.Charging>
	//   62  154:getstatic       #131 <Field ab ab.CHARGE>
	//   63  157:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   64  162:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.Running)), ((Object) (ab.RUN)));
	//   65  163:aload_0         
	//   66  164:getstatic       #134 <Field RobotMissionPhase RobotMissionPhase.Running>
	//   67  167:getstatic       #137 <Field ab ab.RUN>
	//   68  170:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   69  175:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.Stuck)), ((Object) (ab.STUCK)));
	//   70  176:aload_0         
	//   71  177:getstatic       #140 <Field RobotMissionPhase RobotMissionPhase.Stuck>
	//   72  180:getstatic       #143 <Field ab ab.STUCK>
	//   73  183:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   74  188:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.PostMissionDockReturn)), ((Object) (ab.HOME_POST_MISSION)));
	//   75  189:aload_0         
	//   76  190:getstatic       #146 <Field RobotMissionPhase RobotMissionPhase.PostMissionDockReturn>
	//   77  193:getstatic       #149 <Field ab ab.HOME_POST_MISSION>
	//   78  196:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   79  201:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.MidMissionCharging)), ((Object) (ab.HOME_MID_MISSION)));
	//   80  202:aload_0         
	//   81  203:getstatic       #152 <Field RobotMissionPhase RobotMissionPhase.MidMissionCharging>
	//   82  206:getstatic       #155 <Field ab ab.HOME_MID_MISSION>
	//   83  209:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   84  214:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.UserDockCommand)), ((Object) (ab.HOME_USER_DOCK_COMMANDED)));
	//   85  215:aload_0         
	//   86  216:getstatic       #158 <Field RobotMissionPhase RobotMissionPhase.UserDockCommand>
	//   87  219:getstatic       #161 <Field ab ab.HOME_USER_DOCK_COMMANDED>
	//   88  222:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   89  227:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.UserChargeCommand)), ((Object) (ab.HOME_USER_CHARGE_COMMANDED)));
	//   90  228:aload_0         
	//   91  229:getstatic       #164 <Field RobotMissionPhase RobotMissionPhase.UserChargeCommand>
	//   92  232:getstatic       #167 <Field ab ab.HOME_USER_CHARGE_COMMANDED>
	//   93  235:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   94  240:pop             
		((Map) (hashmap)).put(((Object) (RobotMissionPhase.ChargingError)), ((Object) (ab.CHARGE_ERROR)));
	//   95  241:aload_0         
	//   96  242:getstatic       #170 <Field RobotMissionPhase RobotMissionPhase.ChargingError>
	//   97  245:getstatic       #173 <Field ab ab.CHARGE_ERROR>
	//   98  248:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   99  253:pop             
		m = Collections.unmodifiableMap(((Map) (hashmap)));
	//  100  254:aload_0         
	//  101  255:invokestatic    #112 <Method Map Collections.unmodifiableMap(Map)>
	//  102  258:putstatic       #175 <Field Map m>
	//* 103  261:return          
	}
}
