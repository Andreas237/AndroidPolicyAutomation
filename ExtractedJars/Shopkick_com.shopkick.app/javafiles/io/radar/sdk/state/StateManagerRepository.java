// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.state;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import io.radar.sdk.internal.*;
import io.radar.sdk.internal.repository.BaseRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class StateManagerRepository extends BaseRepository
{
	public static final class Companion
	{

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void StateManagerRepository$Companion()>
		//    2    4:return          
		}
	}


	public StateManagerRepository(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #85  <String "context">
	//    2    3:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #93  <Method void BaseRepository(Context)>
	//    6   11:return          
	}

	public final RadarState getCurrentState$sdk_release()
	{
		String s = getSharedPreferences().getString("state_type", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #68  <String "state_type">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #106 <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore          8
		if(s != null)
	//*   6   14:aload           8
	//*   7   16:ifnull          209
		{
			boolean flag = getSharedPreferences().getBoolean("state_just_stopped", false);
	//    8   19:aload_0         
	//    9   20:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//   10   23:ldc1            #56  <String "state_just_stopped">
	//   11   25:iconst_0        
	//   12   26:invokeinterface #110 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   13   31:istore          5
			float f = getSharedPreferences().getFloat("state_location_long", 0.0F);
	//   14   33:aload_0         
	//   15   34:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//   16   37:ldc1            #62  <String "state_location_long">
	//   17   39:fconst_0        
	//   18   40:invokeinterface #114 <Method float SharedPreferences.getFloat(String, float)>
	//   19   45:fstore_1        
			float f1 = getSharedPreferences().getFloat("state_location_lat", 0.0F);
	//   20   46:aload_0         
	//   21   47:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//   22   50:ldc1            #59  <String "state_location_lat">
	//   23   52:fconst_0        
	//   24   53:invokeinterface #114 <Method float SharedPreferences.getFloat(String, float)>
	//   25   58:fstore_2        
			long l = getSharedPreferences().getLong("state_location_time", 0L);
	//   26   59:aload_0         
	//   27   60:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//   28   63:ldc1            #65  <String "state_location_time">
	//   29   65:lconst_0        
	//   30   66:invokeinterface #118 <Method long SharedPreferences.getLong(String, long)>
	//   31   71:lstore          6
			float f2 = getSharedPreferences().getFloat("state_location_acc", 0.0F);
	//   32   73:aload_0         
	//   33   74:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//   34   77:ldc1            #53  <String "state_location_acc">
	//   35   79:fconst_0        
	//   36   80:invokeinterface #114 <Method float SharedPreferences.getFloat(String, float)>
	//   37   85:fstore_3        
			Location location = new Location("radar");
	//   38   86:new             #120 <Class Location>
	//   39   89:dup             
	//   40   90:ldc1            #122 <String "radar">
	//   41   92:invokespecial   #125 <Method void Location(String)>
	//   42   95:astore          9
			location.setLatitude(f1);
	//   43   97:aload           9
	//   44   99:fload_2         
	//   45  100:f2d             
	//   46  101:invokevirtual   #129 <Method void Location.setLatitude(double)>
			location.setLongitude(f);
	//   47  104:aload           9
	//   48  106:fload_1         
	//   49  107:f2d             
	//   50  108:invokevirtual   #132 <Method void Location.setLongitude(double)>
			location.setTime(l);
	//   51  111:aload           9
	//   52  113:lload           6
	//   53  115:invokevirtual   #136 <Method void Location.setTime(long)>
			location.setAccuracy(f2);
	//   54  118:aload           9
	//   55  120:fload_3         
	//   56  121:invokevirtual   #140 <Method void Location.setAccuracy(float)>
			int i = s.hashCode();
	//   57  124:aload           8
	//   58  126:invokevirtual   #146 <Method int String.hashCode()>
	//   59  129:istore          4
			if(i != 0x333bd1)
	//*  60  131:iload           4
	//*  61  133:ldc1            #147 <Int 0x333bd1>
	//*  62  135:icmpeq          173
			{
				if(i == 0x360802 && s.equals("stop"))
	//*  63  138:iload           4
	//*  64  140:ldc1            #148 <Int 0x360802>
	//*  65  142:icmpeq          148
	//*  66  145:goto            196
	//*  67  148:aload           8
	//*  68  150:ldc1            #74  <String "stop">
	//*  69  152:invokevirtual   #152 <Method boolean String.equals(Object)>
	//*  70  155:ifeq            196
					return (RadarState)new Stopped(location, flag);
	//   71  158:new             #154 <Class Stopped>
	//   72  161:dup             
	//   73  162:aload           9
	//   74  164:iload           5
	//   75  166:invokespecial   #157 <Method void Stopped(Location, boolean)>
	//   76  169:checkcast       #159 <Class RadarState>
	//   77  172:areturn         
			} else
			if(s.equals("move"))
	//*  78  173:aload           8
	//*  79  175:ldc1            #71  <String "move">
	//*  80  177:invokevirtual   #152 <Method boolean String.equals(Object)>
	//*  81  180:ifeq            196
				return (RadarState)new Moving(location);
	//   82  183:new             #161 <Class Moving>
	//   83  186:dup             
	//   84  187:aload           9
	//   85  189:invokespecial   #163 <Method void Moving(Location)>
	//   86  192:checkcast       #159 <Class RadarState>
	//   87  195:areturn         
			return (RadarState)new Moving(location);
	//   88  196:new             #161 <Class Moving>
	//   89  199:dup             
	//   90  200:aload           9
	//   91  202:invokespecial   #163 <Method void Moving(Location)>
	//   92  205:checkcast       #159 <Class RadarState>
	//   93  208:areturn         
		} else
		{
			return null;
	//   94  209:aconst_null     
	//   95  210:areturn         
		}
	}

	public final Location getLastMovingLocation$sdk_release()
	{
		float f = getSharedPreferences().getFloat("last_moving_lat", 0.0F);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//    2    4:ldc1            #43  <String "last_moving_lat">
	//    3    6:fconst_0        
	//    4    7:invokeinterface #114 <Method float SharedPreferences.getFloat(String, float)>
	//    5   12:fstore_1        
		float f1 = getSharedPreferences().getFloat("last_moving_long", 0.0F);
	//    6   13:aload_0         
	//    7   14:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//    8   17:ldc1            #47  <String "last_moving_long">
	//    9   19:fconst_0        
	//   10   20:invokeinterface #114 <Method float SharedPreferences.getFloat(String, float)>
	//   11   25:fstore_2        
		long l = getSharedPreferences().getLong("last_moving_time", 0L);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//   14   30:ldc1            #50  <String "last_moving_time">
	//   15   32:lconst_0        
	//   16   33:invokeinterface #118 <Method long SharedPreferences.getLong(String, long)>
	//   17   38:lstore_3        
		if(f != 0.0F && f1 != 0.0F && l > 0L)
	//*  18   39:fload_1         
	//*  19   40:fconst_0        
	//*  20   41:fcmpg           
	//*  21   42:ifeq            91
	//*  22   45:fload_2         
	//*  23   46:fconst_0        
	//*  24   47:fcmpg           
	//*  25   48:ifeq            91
	//*  26   51:lload_3         
	//*  27   52:lconst_0        
	//*  28   53:lcmp            
	//*  29   54:ifle            91
		{
			Location location = new Location("radar");
	//   30   57:new             #120 <Class Location>
	//   31   60:dup             
	//   32   61:ldc1            #122 <String "radar">
	//   33   63:invokespecial   #125 <Method void Location(String)>
	//   34   66:astore          5
			location.setLatitude(f);
	//   35   68:aload           5
	//   36   70:fload_1         
	//   37   71:f2d             
	//   38   72:invokevirtual   #129 <Method void Location.setLatitude(double)>
			location.setLongitude(f1);
	//   39   75:aload           5
	//   40   77:fload_2         
	//   41   78:f2d             
	//   42   79:invokevirtual   #132 <Method void Location.setLongitude(double)>
			location.setTime(l);
	//   43   82:aload           5
	//   44   84:lload_3         
	//   45   85:invokevirtual   #136 <Method void Location.setTime(long)>
			return location;
	//   46   88:aload           5
	//   47   90:areturn         
		} else
		{
			return null;
	//   48   91:aconst_null     
	//   49   92:areturn         
		}
	}

	public final void setCurrentState$sdk_release(RadarState radarstate)
	{
		if(radarstate != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          167
		{
			android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//    4    8:invokeinterface #168 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore          4
			Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    6   15:aload           4
	//    7   17:ldc1            #170 <String "editor">
	//    8   19:invokestatic    #173 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			editor.putFloat("state_location_lat", (float)radarstate.getLocation().getLatitude());
	//    9   22:aload           4
	//   10   24:ldc1            #59  <String "state_location_lat">
	//   11   26:aload_1         
	//   12   27:invokevirtual   #176 <Method Location RadarState.getLocation()>
	//   13   30:invokevirtual   #180 <Method double Location.getLatitude()>
	//   14   33:d2f             
	//   15   34:invokeinterface #186 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   16   39:pop             
			editor.putFloat("state_location_long", (float)radarstate.getLocation().getLongitude());
	//   17   40:aload           4
	//   18   42:ldc1            #62  <String "state_location_long">
	//   19   44:aload_1         
	//   20   45:invokevirtual   #176 <Method Location RadarState.getLocation()>
	//   21   48:invokevirtual   #189 <Method double Location.getLongitude()>
	//   22   51:d2f             
	//   23   52:invokeinterface #186 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   24   57:pop             
			editor.putLong("state_location_time", radarstate.getLocation().getTime());
	//   25   58:aload           4
	//   26   60:ldc1            #65  <String "state_location_time">
	//   27   62:aload_1         
	//   28   63:invokevirtual   #176 <Method Location RadarState.getLocation()>
	//   29   66:invokevirtual   #193 <Method long Location.getTime()>
	//   30   69:invokeinterface #197 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   31   74:pop             
			editor.putFloat("state_location_acc", radarstate.getLocation().getAccuracy());
	//   32   75:aload           4
	//   33   77:ldc1            #53  <String "state_location_acc">
	//   34   79:aload_1         
	//   35   80:invokevirtual   #176 <Method Location RadarState.getLocation()>
	//   36   83:invokevirtual   #201 <Method float Location.getAccuracy()>
	//   37   86:invokeinterface #186 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   38   91:pop             
			Object obj;
			if(radarstate instanceof Moving)
	//*  39   92:aload_1         
	//*  40   93:instanceof      #161 <Class Moving>
	//*  41   96:ifeq            105
				obj = "move";
	//   42   99:ldc1            #71  <String "move">
	//   43  101:astore_3        
			else
	//*  44  102:goto            108
				obj = "stop";
	//   45  105:ldc1            #74  <String "stop">
	//   46  107:astore_3        
			editor.putString("state_type", ((String) (obj)));
	//   47  108:aload           4
	//   48  110:ldc1            #68  <String "state_type">
	//   49  112:aload_3         
	//   50  113:invokeinterface #205 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   51  118:pop             
			obj = ((Object) (radarstate));
	//   52  119:aload_1         
	//   53  120:astore_3        
			if(!(radarstate instanceof Stopped))
	//*  54  121:aload_1         
	//*  55  122:instanceof      #154 <Class Stopped>
	//*  56  125:ifne            130
				obj = null;
	//   57  128:aconst_null     
	//   58  129:astore_3        
			radarstate = ((RadarState) ((Stopped)obj));
	//   59  130:aload_3         
	//   60  131:checkcast       #154 <Class Stopped>
	//   61  134:astore_1        
			boolean flag;
			if(radarstate != null)
	//*  62  135:aload_1         
	//*  63  136:ifnull          147
				flag = ((Stopped) (radarstate)).getJustStopped();
	//   64  139:aload_1         
	//   65  140:invokevirtual   #209 <Method boolean Stopped.getJustStopped()>
	//   66  143:istore_2        
			else
	//*  67  144:goto            149
				flag = false;
	//   68  147:iconst_0        
	//   69  148:istore_2        
			editor.putBoolean("state_just_stopped", flag);
	//   70  149:aload           4
	//   71  151:ldc1            #56  <String "state_just_stopped">
	//   72  153:iload_2         
	//   73  154:invokeinterface #213 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   74  159:pop             
			editor.apply();
	//   75  160:aload           4
	//   76  162:invokeinterface #216 <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//   77  167:return          
	}

	public final void setLastMovingLocation$sdk_release(Location location)
	{
		if(location != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          67
		{
			android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #100 <Method SharedPreferences getSharedPreferences()>
	//    4    8:invokeinterface #168 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_2        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//    6   14:aload_2         
	//    7   15:ldc1            #170 <String "editor">
	//    8   17:invokestatic    #173 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			editor.putFloat("last_moving_lat", (float)location.getLatitude());
	//    9   20:aload_2         
	//   10   21:ldc1            #43  <String "last_moving_lat">
	//   11   23:aload_1         
	//   12   24:invokevirtual   #180 <Method double Location.getLatitude()>
	//   13   27:d2f             
	//   14   28:invokeinterface #186 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   15   33:pop             
			editor.putFloat("last_moving_long", (float)location.getLongitude());
	//   16   34:aload_2         
	//   17   35:ldc1            #47  <String "last_moving_long">
	//   18   37:aload_1         
	//   19   38:invokevirtual   #189 <Method double Location.getLongitude()>
	//   20   41:d2f             
	//   21   42:invokeinterface #186 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   22   47:pop             
			editor.putLong("last_moving_time", location.getTime());
	//   23   48:aload_2         
	//   24   49:ldc1            #50  <String "last_moving_time">
	//   25   51:aload_1         
	//   26   52:invokevirtual   #193 <Method long Location.getTime()>
	//   27   55:invokeinterface #197 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   28   60:pop             
			editor.apply();
	//   29   61:aload_2         
	//   30   62:invokeinterface #216 <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//   31   67:return          
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String KEY_LAST_LOCATION_LAT = "last_moving_lat";
	public static final String KEY_LAST_LOCATION_LONG = "last_moving_long";
	public static final String KEY_LAST_LOCATION_TIME = "last_moving_time";
	public static final String KEY_STATE_ACC = "state_location_acc";
	public static final String KEY_STATE_JUST_STOPPED = "state_just_stopped";
	public static final String KEY_STATE_LAT = "state_location_lat";
	public static final String KEY_STATE_LONG = "state_location_long";
	public static final String KEY_STATE_TIME = "state_location_time";
	public static final String KEY_STATE_TYPE = "state_type";
	public static final String STATE_TYPE_MOVE = "move";
	public static final String STATE_TYPE_STOP = "stop";

	static 
	{
	//    0    0:new             #6   <Class StateManagerRepository$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #80  <Method void StateManagerRepository$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #82  <Field StateManagerRepository$Companion Companion>
	//*   5   11:return          
	}
}
