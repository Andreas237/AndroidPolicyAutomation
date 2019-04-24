// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness;


public class FitnessActivities
{

	FitnessActivities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #381 <Method void Object()>
	//    2    4:return          
	}

	public static String getMimeType(String s)
	{
		String s1 = String.valueOf("vnd.google.fitness.activity/");
	//    0    0:ldc1            #161 <String "vnd.google.fitness.activity/">
	//    1    2:invokestatic    #390 <Method String String.valueOf(Object)>
	//    2    5:astore_1        
		s = String.valueOf(((Object) (s)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #390 <Method String String.valueOf(Object)>
	//    5   10:astore_0        
		if(s.length() != 0)
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #394 <Method int String.length()>
	//*   8   15:ifeq            24
			return s1.concat(s);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #397 <Method String String.concat(String)>
	//   12   23:areturn         
		else
			return new String(s1);
	//   13   24:new             #386 <Class String>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokespecial   #400 <Method void String(String)>
	//   17   32:areturn         
	}

	public static final String AEROBICS = "aerobics";
	public static final String ARCHERY = "archery";
	public static final String BADMINTON = "badminton";
	public static final String BASEBALL = "baseball";
	public static final String BASKETBALL = "basketball";
	public static final String BIATHLON = "biathlon";
	public static final String BIKING = "biking";
	public static final String BIKING_HAND = "biking.hand";
	public static final String BIKING_MOUNTAIN = "biking.mountain";
	public static final String BIKING_ROAD = "biking.road";
	public static final String BIKING_SPINNING = "biking.spinning";
	public static final String BIKING_STATIONARY = "biking.stationary";
	public static final String BIKING_UTILITY = "biking.utility";
	public static final String BOXING = "boxing";
	public static final String CALISTHENICS = "calisthenics";
	public static final String CIRCUIT_TRAINING = "circuit_training";
	public static final String CRICKET = "cricket";
	public static final String CROSSFIT = "crossfit";
	public static final String CURLING = "curling";
	public static final String DANCING = "dancing";
	public static final String DIVING = "diving";
	public static final String ELEVATOR = "elevator";
	public static final String ELLIPTICAL = "elliptical";
	public static final String ERGOMETER = "ergometer";
	public static final String ESCALATOR = "escalator";
	public static final String EXTRA_STATUS = "actionStatus";
	public static final String FENCING = "fencing";
	public static final String FOOTBALL_AMERICAN = "football.american";
	public static final String FOOTBALL_AUSTRALIAN = "football.australian";
	public static final String FOOTBALL_SOCCER = "football.soccer";
	public static final String FRISBEE_DISC = "frisbee_disc";
	public static final String GARDENING = "gardening";
	public static final String GOLF = "golf";
	public static final String GYMNASTICS = "gymnastics";
	public static final String HANDBALL = "handball";
	public static final String HIGH_INTENSITY_INTERVAL_TRAINING = "interval_training.high_intensity";
	public static final String HIKING = "hiking";
	public static final String HOCKEY = "hockey";
	public static final String HORSEBACK_RIDING = "horseback_riding";
	public static final String HOUSEWORK = "housework";
	public static final String ICE_SKATING = "ice_skating";
	public static final String INTERVAL_TRAINING = "interval_training";
	public static final String IN_VEHICLE = "in_vehicle";
	public static final String JUMP_ROPE = "jump_rope";
	public static final String KAYAKING = "kayaking";
	public static final String KETTLEBELL_TRAINING = "kettlebell_training";
	public static final String KICKBOXING = "kickboxing";
	public static final String KICK_SCOOTER = "kick_scooter";
	public static final String KITESURFING = "kitesurfing";
	public static final String MARTIAL_ARTS = "martial_arts";
	public static final String MEDITATION = "meditation";
	public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.activity/";
	public static final String MIXED_MARTIAL_ARTS = "martial_arts.mixed";
	public static final String ON_FOOT = "on_foot";
	public static final String OTHER = "other";
	public static final String P90X = "p90x";
	public static final String PARAGLIDING = "paragliding";
	public static final String PILATES = "pilates";
	public static final String POLO = "polo";
	public static final String RACQUETBALL = "racquetball";
	public static final String ROCK_CLIMBING = "rock_climbing";
	public static final String ROWING = "rowing";
	public static final String ROWING_MACHINE = "rowing.machine";
	public static final String RUGBY = "rugby";
	public static final String RUNNING = "running";
	public static final String RUNNING_JOGGING = "running.jogging";
	public static final String RUNNING_SAND = "running.sand";
	public static final String RUNNING_TREADMILL = "running.treadmill";
	public static final String SAILING = "sailing";
	public static final String SCUBA_DIVING = "scuba_diving";
	public static final String SKATEBOARDING = "skateboarding";
	public static final String SKATING = "skating";
	public static final String SKATING_CROSS = "skating.cross";
	public static final String SKATING_INDOOR = "skating.indoor";
	public static final String SKATING_INLINE = "skating.inline";
	public static final String SKIING = "skiing";
	public static final String SKIING_BACK_COUNTRY = "skiing.back_country";
	public static final String SKIING_CROSS_COUNTRY = "skiing.cross_country";
	public static final String SKIING_DOWNHILL = "skiing.downhill";
	public static final String SKIING_KITE = "skiing.kite";
	public static final String SKIING_ROLLER = "skiing.roller";
	public static final String SLEDDING = "sledding";
	public static final String SLEEP = "sleep";
	public static final String SLEEP_AWAKE = "sleep.awake";
	public static final String SLEEP_DEEP = "sleep.deep";
	public static final String SLEEP_LIGHT = "sleep.light";
	public static final String SLEEP_REM = "sleep.rem";
	public static final String SNOWBOARDING = "snowboarding";
	public static final String SNOWMOBILE = "snowmobile";
	public static final String SNOWSHOEING = "snowshoeing";
	public static final String SOFTBALL = "softball";
	public static final String SQUASH = "squash";
	public static final String STAIR_CLIMBING = "stair_climbing";
	public static final String STAIR_CLIMBING_MACHINE = "stair_climbing.machine";
	public static final String STANDUP_PADDLEBOARDING = "standup_paddleboarding";
	public static final String STATUS_ACTIVE = "ActiveActionStatus";
	public static final String STATUS_COMPLETED = "CompletedActionStatus";
	public static final String STILL = "still";
	public static final String STRENGTH_TRAINING = "strength_training";
	public static final String SURFING = "surfing";
	public static final String SWIMMING = "swimming";
	public static final String SWIMMING_OPEN_WATER = "swimming.open_water";
	public static final String SWIMMING_POOL = "swimming.pool";
	public static final String TABLE_TENNIS = "table_tennis";
	public static final String TEAM_SPORTS = "team_sports";
	public static final String TENNIS = "tennis";
	public static final String TILTING = "tilting";
	public static final String TREADMILL = "treadmill";
	public static final String UNKNOWN = "unknown";
	public static final String VOLLEYBALL = "volleyball";
	public static final String VOLLEYBALL_BEACH = "volleyball.beach";
	public static final String VOLLEYBALL_INDOOR = "volleyball.indoor";
	public static final String WAKEBOARDING = "wakeboarding";
	public static final String WALKING = "walking";
	public static final String WALKING_FITNESS = "walking.fitness";
	public static final String WALKING_NORDIC = "walking.nordic";
	public static final String WALKING_STROLLER = "walking.stroller";
	public static final String WALKING_TREADMILL = "walking.treadmill";
	public static final String WATER_POLO = "water_polo";
	public static final String WEIGHTLIFTING = "weightlifting";
	public static final String WHEELCHAIR = "wheelchair";
	public static final String WINDSURFING = "windsurfing";
	public static final String YOGA = "yoga";
	public static final String ZUMBA = "zumba";
}
