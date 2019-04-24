// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;


// Referenced classes of package com.google.android.gms.fitness.data:
//			Field

public final class HealthFields
{

	private HealthFields()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #259 <Method void Object()>
	//    2    4:return          
	}

	public static final int BLOOD_GLUCOSE_SPECIMEN_SOURCE_CAPILLARY_BLOOD = 2;
	public static final int BLOOD_GLUCOSE_SPECIMEN_SOURCE_INTERSTITIAL_FLUID = 1;
	public static final int BLOOD_GLUCOSE_SPECIMEN_SOURCE_PLASMA = 3;
	public static final int BLOOD_GLUCOSE_SPECIMEN_SOURCE_SERUM = 4;
	public static final int BLOOD_GLUCOSE_SPECIMEN_SOURCE_TEARS = 5;
	public static final int BLOOD_GLUCOSE_SPECIMEN_SOURCE_WHOLE_BLOOD = 6;
	public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_UPPER_ARM = 3;
	public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_LEFT_WRIST = 1;
	public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_UPPER_ARM = 4;
	public static final int BLOOD_PRESSURE_MEASUREMENT_LOCATION_RIGHT_WRIST = 2;
	public static final int BODY_POSITION_LYING_DOWN = 3;
	public static final int BODY_POSITION_SEMI_RECUMBENT = 4;
	public static final int BODY_POSITION_SITTING = 2;
	public static final int BODY_POSITION_STANDING = 1;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_AXILLARY = 1;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_FINGER = 2;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_FOREHEAD = 3;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_ORAL = 4;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_RECTAL = 5;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_TEMPORAL_ARTERY = 6;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_TOE = 7;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_TYMPANIC = 8;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_VAGINAL = 10;
	public static final int BODY_TEMPERATURE_MEASUREMENT_LOCATION_WRIST = 9;
	public static final int CERVICAL_DILATION_CLOSED = 1;
	public static final int CERVICAL_DILATION_MEDIUM = 2;
	public static final int CERVICAL_DILATION_OPEN = 3;
	public static final int CERVICAL_FIRMNESS_FIRM = 3;
	public static final int CERVICAL_FIRMNESS_MEDIUM = 2;
	public static final int CERVICAL_FIRMNESS_SOFT = 1;
	public static final int CERVICAL_MUCUS_AMOUNT_HEAVY = 3;
	public static final int CERVICAL_MUCUS_AMOUNT_LIGHT = 1;
	public static final int CERVICAL_MUCUS_AMOUNT_MEDIUM = 2;
	public static final int CERVICAL_MUCUS_TEXTURE_CREAMY = 3;
	public static final int CERVICAL_MUCUS_TEXTURE_DRY = 1;
	public static final int CERVICAL_MUCUS_TEXTURE_EGG_WHITE = 5;
	public static final int CERVICAL_MUCUS_TEXTURE_STICKY = 2;
	public static final int CERVICAL_MUCUS_TEXTURE_WATERY = 4;
	public static final int CERVICAL_POSITION_HIGH = 3;
	public static final int CERVICAL_POSITION_LOW = 1;
	public static final int CERVICAL_POSITION_MEDIUM = 2;
	public static final Field FIELD_BLOOD_GLUCOSE_LEVEL = Field.zzeb("blood_glucose_level");
	public static final Field FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE = Field.zzea("blood_glucose_specimen_source");
	public static final Field FIELD_BLOOD_PRESSURE_DIASTOLIC = Field.zzeb("blood_pressure_diastolic");
	public static final Field FIELD_BLOOD_PRESSURE_DIASTOLIC_AVERAGE = Field.zzeb("blood_pressure_diastolic_average");
	public static final Field FIELD_BLOOD_PRESSURE_DIASTOLIC_MAX = Field.zzeb("blood_pressure_diastolic_max");
	public static final Field FIELD_BLOOD_PRESSURE_DIASTOLIC_MIN = Field.zzeb("blood_pressure_diastolic_min");
	public static final Field FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION = Field.zzea("blood_pressure_measurement_location");
	public static final Field FIELD_BLOOD_PRESSURE_SYSTOLIC = Field.zzeb("blood_pressure_systolic");
	public static final Field FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE = Field.zzeb("blood_pressure_systolic_average");
	public static final Field FIELD_BLOOD_PRESSURE_SYSTOLIC_MAX = Field.zzeb("blood_pressure_systolic_max");
	public static final Field FIELD_BLOOD_PRESSURE_SYSTOLIC_MIN = Field.zzeb("blood_pressure_systolic_min");
	public static final Field FIELD_BODY_POSITION = Field.zzea("body_position");
	public static final Field FIELD_BODY_TEMPERATURE = Field.zzeb("body_temperature");
	public static final Field FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION = Field.zzea("body_temperature_measurement_location");
	public static final Field FIELD_CERVICAL_DILATION = Field.zzea("cervical_dilation");
	public static final Field FIELD_CERVICAL_FIRMNESS = Field.zzea("cervical_firmness");
	public static final Field FIELD_CERVICAL_MUCUS_AMOUNT = Field.zzea("cervical_mucus_amount");
	public static final Field FIELD_CERVICAL_MUCUS_TEXTURE = Field.zzea("cervical_mucus_texture");
	public static final Field FIELD_CERVICAL_POSITION = Field.zzea("cervical_position");
	public static final Field FIELD_MENSTRUAL_FLOW = Field.zzea("menstrual_flow");
	public static final Field FIELD_OVULATION_TEST_RESULT = Field.zzea("ovulation_test_result");
	public static final Field FIELD_OXYGEN_SATURATION = Field.zzeb("oxygen_saturation");
	public static final Field FIELD_OXYGEN_SATURATION_AVERAGE = Field.zzeb("oxygen_saturation_average");
	public static final Field FIELD_OXYGEN_SATURATION_MAX = Field.zzeb("oxygen_saturation_max");
	public static final Field FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD = Field.zzea("oxygen_saturation_measurement_method");
	public static final Field FIELD_OXYGEN_SATURATION_MIN = Field.zzeb("oxygen_saturation_min");
	public static final Field FIELD_OXYGEN_SATURATION_SYSTEM = Field.zzea("oxygen_saturation_system");
	public static final Field FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE = Field.zzea("oxygen_therapy_administration_mode");
	public static final Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE = Field.zzeb("supplemental_oxygen_flow_rate");
	public static final Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE = Field.zzeb("supplemental_oxygen_flow_rate_average");
	public static final Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX = Field.zzeb("supplemental_oxygen_flow_rate_max");
	public static final Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN = Field.zzeb("supplemental_oxygen_flow_rate_min");
	public static final Field FIELD_TEMPORAL_RELATION_TO_MEAL = Field.zzea("temporal_relation_to_meal");
	public static final int FIELD_TEMPORAL_RELATION_TO_MEAL_AFTER_MEAL = 4;
	public static final int FIELD_TEMPORAL_RELATION_TO_MEAL_BEFORE_MEAL = 3;
	public static final int FIELD_TEMPORAL_RELATION_TO_MEAL_FASTING = 2;
	public static final int FIELD_TEMPORAL_RELATION_TO_MEAL_GENERAL = 1;
	public static final Field FIELD_TEMPORAL_RELATION_TO_SLEEP = Field.zzea("temporal_relation_to_sleep");
	public static final int MENSTRUAL_FLOW_HEAVY = 4;
	public static final int MENSTRUAL_FLOW_LIGHT = 2;
	public static final int MENSTRUAL_FLOW_MEDIUM = 3;
	public static final int MENSTRUAL_FLOW_SPOTTING = 1;
	public static final int OVULATION_TEST_RESULT_NEGATIVE = 1;
	public static final int OVULATION_TEST_RESULT_POSITIVE = 2;
	public static final int OXYGEN_SATURATION_MEASUREMENT_METHOD_PULSE_OXIMETRY = 1;
	public static final int OXYGEN_SATURATION_SYSTEM_PERIPHERAL_CAPILLARY = 1;
	public static final int OXYGEN_THERAPY_ADMINISTRATION_MODE_NASAL_CANULA = 1;
	public static final int TEMPORAL_RELATION_TO_SLEEP_BEFORE_SLEEP = 2;
	public static final int TEMPORAL_RELATION_TO_SLEEP_DURING_SLEEP = 4;
	public static final int TEMPORAL_RELATION_TO_SLEEP_FULLY_AWAKE = 1;
	public static final int TEMPORAL_RELATION_TO_SLEEP_ON_WAKING = 3;

	static 
	{
	//    0    0:ldc1            #112 <String "blood_pressure_systolic">
	//    1    2:invokestatic    #118 <Method Field Field.zzeb(String)>
	//    2    5:putstatic       #120 <Field Field FIELD_BLOOD_PRESSURE_SYSTOLIC>
	//    3    8:ldc1            #122 <String "blood_pressure_systolic_average">
	//    4   10:invokestatic    #118 <Method Field Field.zzeb(String)>
	//    5   13:putstatic       #124 <Field Field FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE>
	//    6   16:ldc1            #126 <String "blood_pressure_systolic_min">
	//    7   18:invokestatic    #118 <Method Field Field.zzeb(String)>
	//    8   21:putstatic       #128 <Field Field FIELD_BLOOD_PRESSURE_SYSTOLIC_MIN>
	//    9   24:ldc1            #130 <String "blood_pressure_systolic_max">
	//   10   26:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   11   29:putstatic       #132 <Field Field FIELD_BLOOD_PRESSURE_SYSTOLIC_MAX>
	//   12   32:ldc1            #134 <String "blood_pressure_diastolic">
	//   13   34:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   14   37:putstatic       #136 <Field Field FIELD_BLOOD_PRESSURE_DIASTOLIC>
	//   15   40:ldc1            #138 <String "blood_pressure_diastolic_average">
	//   16   42:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   17   45:putstatic       #140 <Field Field FIELD_BLOOD_PRESSURE_DIASTOLIC_AVERAGE>
	//   18   48:ldc1            #142 <String "blood_pressure_diastolic_min">
	//   19   50:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   20   53:putstatic       #144 <Field Field FIELD_BLOOD_PRESSURE_DIASTOLIC_MIN>
	//   21   56:ldc1            #146 <String "blood_pressure_diastolic_max">
	//   22   58:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   23   61:putstatic       #148 <Field Field FIELD_BLOOD_PRESSURE_DIASTOLIC_MAX>
	//   24   64:ldc1            #150 <String "body_position">
	//   25   66:invokestatic    #153 <Method Field Field.zzea(String)>
	//   26   69:putstatic       #155 <Field Field FIELD_BODY_POSITION>
	//   27   72:ldc1            #157 <String "blood_pressure_measurement_location">
	//   28   74:invokestatic    #153 <Method Field Field.zzea(String)>
	//   29   77:putstatic       #159 <Field Field FIELD_BLOOD_PRESSURE_MEASUREMENT_LOCATION>
	//   30   80:ldc1            #161 <String "blood_glucose_level">
	//   31   82:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   32   85:putstatic       #163 <Field Field FIELD_BLOOD_GLUCOSE_LEVEL>
	//   33   88:ldc1            #165 <String "temporal_relation_to_meal">
	//   34   90:invokestatic    #153 <Method Field Field.zzea(String)>
	//   35   93:putstatic       #167 <Field Field FIELD_TEMPORAL_RELATION_TO_MEAL>
	//   36   96:ldc1            #169 <String "temporal_relation_to_sleep">
	//   37   98:invokestatic    #153 <Method Field Field.zzea(String)>
	//   38  101:putstatic       #171 <Field Field FIELD_TEMPORAL_RELATION_TO_SLEEP>
	//   39  104:ldc1            #173 <String "blood_glucose_specimen_source">
	//   40  106:invokestatic    #153 <Method Field Field.zzea(String)>
	//   41  109:putstatic       #175 <Field Field FIELD_BLOOD_GLUCOSE_SPECIMEN_SOURCE>
	//   42  112:ldc1            #177 <String "oxygen_saturation">
	//   43  114:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   44  117:putstatic       #179 <Field Field FIELD_OXYGEN_SATURATION>
	//   45  120:ldc1            #181 <String "oxygen_saturation_average">
	//   46  122:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   47  125:putstatic       #183 <Field Field FIELD_OXYGEN_SATURATION_AVERAGE>
	//   48  128:ldc1            #185 <String "oxygen_saturation_min">
	//   49  130:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   50  133:putstatic       #187 <Field Field FIELD_OXYGEN_SATURATION_MIN>
	//   51  136:ldc1            #189 <String "oxygen_saturation_max">
	//   52  138:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   53  141:putstatic       #191 <Field Field FIELD_OXYGEN_SATURATION_MAX>
	//   54  144:ldc1            #193 <String "supplemental_oxygen_flow_rate">
	//   55  146:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   56  149:putstatic       #195 <Field Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE>
	//   57  152:ldc1            #197 <String "supplemental_oxygen_flow_rate_average">
	//   58  154:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   59  157:putstatic       #199 <Field Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_AVERAGE>
	//   60  160:ldc1            #201 <String "supplemental_oxygen_flow_rate_min">
	//   61  162:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   62  165:putstatic       #203 <Field Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MIN>
	//   63  168:ldc1            #205 <String "supplemental_oxygen_flow_rate_max">
	//   64  170:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   65  173:putstatic       #207 <Field Field FIELD_SUPPLEMENTAL_OXYGEN_FLOW_RATE_MAX>
	//   66  176:ldc1            #209 <String "oxygen_therapy_administration_mode">
	//   67  178:invokestatic    #153 <Method Field Field.zzea(String)>
	//   68  181:putstatic       #211 <Field Field FIELD_OXYGEN_THERAPY_ADMINISTRATION_MODE>
	//   69  184:ldc1            #213 <String "oxygen_saturation_system">
	//   70  186:invokestatic    #153 <Method Field Field.zzea(String)>
	//   71  189:putstatic       #215 <Field Field FIELD_OXYGEN_SATURATION_SYSTEM>
	//   72  192:ldc1            #217 <String "oxygen_saturation_measurement_method">
	//   73  194:invokestatic    #153 <Method Field Field.zzea(String)>
	//   74  197:putstatic       #219 <Field Field FIELD_OXYGEN_SATURATION_MEASUREMENT_METHOD>
	//   75  200:ldc1            #221 <String "body_temperature">
	//   76  202:invokestatic    #118 <Method Field Field.zzeb(String)>
	//   77  205:putstatic       #223 <Field Field FIELD_BODY_TEMPERATURE>
	//   78  208:ldc1            #225 <String "body_temperature_measurement_location">
	//   79  210:invokestatic    #153 <Method Field Field.zzea(String)>
	//   80  213:putstatic       #227 <Field Field FIELD_BODY_TEMPERATURE_MEASUREMENT_LOCATION>
	//   81  216:ldc1            #229 <String "cervical_mucus_texture">
	//   82  218:invokestatic    #153 <Method Field Field.zzea(String)>
	//   83  221:putstatic       #231 <Field Field FIELD_CERVICAL_MUCUS_TEXTURE>
	//   84  224:ldc1            #233 <String "cervical_mucus_amount">
	//   85  226:invokestatic    #153 <Method Field Field.zzea(String)>
	//   86  229:putstatic       #235 <Field Field FIELD_CERVICAL_MUCUS_AMOUNT>
	//   87  232:ldc1            #237 <String "cervical_position">
	//   88  234:invokestatic    #153 <Method Field Field.zzea(String)>
	//   89  237:putstatic       #239 <Field Field FIELD_CERVICAL_POSITION>
	//   90  240:ldc1            #241 <String "cervical_dilation">
	//   91  242:invokestatic    #153 <Method Field Field.zzea(String)>
	//   92  245:putstatic       #243 <Field Field FIELD_CERVICAL_DILATION>
	//   93  248:ldc1            #245 <String "cervical_firmness">
	//   94  250:invokestatic    #153 <Method Field Field.zzea(String)>
	//   95  253:putstatic       #247 <Field Field FIELD_CERVICAL_FIRMNESS>
	//   96  256:ldc1            #249 <String "menstrual_flow">
	//   97  258:invokestatic    #153 <Method Field Field.zzea(String)>
	//   98  261:putstatic       #251 <Field Field FIELD_MENSTRUAL_FLOW>
	//   99  264:ldc1            #253 <String "ovulation_test_result">
	//  100  266:invokestatic    #153 <Method Field Field.zzea(String)>
	//  101  269:putstatic       #255 <Field Field FIELD_OVULATION_TEST_RESULT>
	//* 102  272:return          
	}
}
