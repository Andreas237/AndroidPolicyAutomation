// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.fitness.data:
//			Field, zzk, zza

public final class DataType extends com.google.android.gms.common.internal.safeparcel.zza
	implements ReflectedParcelable
{
	public static final class zza
	{

		public static final DataType zzaTb;
		public static final DataType zzaTc;

		static 
		{
			zzaTb = new DataType("com.google.internal.session.debug", new Field[] {
				Field.zza.zzaTK
			});
		//    0    0:new             #6   <Class DataType>
		//    1    3:dup             
		//    2    4:ldc1            #14  <String "com.google.internal.session.debug">
		//    3    6:iconst_1        
		//    4    7:anewarray       Field[]
		//    5   10:dup             
		//    6   11:iconst_0        
		//    7   12:getstatic       #22  <Field Field Field$zza.zzaTK>
		//    8   15:aastore         
		//    9   16:invokespecial   #26  <Method void DataType(String, Field[])>
		//   10   19:putstatic       #28  <Field DataType zzaTb>
			zzaTc = new DataType("com.google.internal.session.v2", new Field[] {
				Field.zza.zzaTL
			});
		//   11   22:new             #6   <Class DataType>
		//   12   25:dup             
		//   13   26:ldc1            #30  <String "com.google.internal.session.v2">
		//   14   28:iconst_1        
		//   15   29:anewarray       Field[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #33  <Field Field Field$zza.zzaTL>
		//   19   37:aastore         
		//   20   38:invokespecial   #26  <Method void DataType(String, Field[])>
		//   21   41:putstatic       #35  <Field DataType zzaTc>
		//*  22   44:return          
		}
	}


	DataType(int i, String s, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #483 <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #485 <Field int versionCode>
		name = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #487 <Field String name>
		zzaTa = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #493 <Method List Collections.unmodifiableList(List)>
	//   11   19:putfield        #495 <Field List zzaTa>
	//   12   22:return          
	}

	public transient DataType(String s, Field afield[])
	{
		this(1, s, Arrays.asList(((Object []) (afield))));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokestatic    #503 <Method List Arrays.asList(Object[])>
	//    5    7:invokespecial   #505 <Method void DataType(int, String, List)>
	//    6   10:return          
	}

	public static List getAggregatesForInput(DataType datatype)
	{
		datatype = ((DataType) ((List)com.google.android.gms.fitness.data.zza.zzaSn.get(((Object) (datatype)))));
	//    0    0:getstatic       #513 <Field Map zza.zzaSn>
	//    1    3:aload_0         
	//    2    4:invokeinterface #519 <Method Object Map.get(Object)>
	//    3    9:checkcast       #521 <Class List>
	//    4   12:astore_0        
		if(datatype == null)
	//*   5   13:aload_0         
	//*   6   14:ifnonnull       21
			return Collections.emptyList();
	//    7   17:invokestatic    #525 <Method List Collections.emptyList()>
	//    8   20:areturn         
		else
			return Collections.unmodifiableList(((List) (datatype)));
	//    9   21:aload_0         
	//   10   22:invokestatic    #493 <Method List Collections.unmodifiableList(List)>
	//   11   25:areturn         
	}

	public static String getMimeType(DataType datatype)
	{
		String s = String.valueOf("vnd.google.fitness.data_type/");
	//    0    0:ldc1            #42  <String "vnd.google.fitness.data_type/">
	//    1    2:invokestatic    #534 <Method String String.valueOf(Object)>
	//    2    5:astore_1        
		datatype = ((DataType) (String.valueOf(((Object) (datatype.getName())))));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #538 <Method String getName()>
	//    5   10:invokestatic    #534 <Method String String.valueOf(Object)>
	//    6   13:astore_0        
		if(((String) (datatype)).length() != 0)
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #542 <Method int String.length()>
	//*   9   18:ifeq            27
			return s.concat(((String) (datatype)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #546 <Method String String.concat(String)>
	//   13   26:areturn         
		else
			return new String(s);
	//   14   27:new             #530 <Class String>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #549 <Method void String(String)>
	//   18   35:areturn         
	}

	private boolean zzc(DataType datatype)
	{
		return name.equals(((Object) (datatype.name))) && zzaTa.equals(((Object) (datatype.zzaTa)));
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field String name>
	//    2    4:aload_1         
	//    3    5:getfield        #487 <Field String name>
	//    4    8:invokevirtual   #554 <Method boolean String.equals(Object)>
	//    5   11:ifeq            32
	//    6   14:aload_0         
	//    7   15:getfield        #495 <Field List zzaTa>
	//    8   18:aload_1         
	//    9   19:getfield        #495 <Field List zzaTa>
	//   10   22:invokeinterface #555 <Method boolean List.equals(Object)>
	//   11   27:ifeq            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DataType) && zzc((DataType)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataType>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataType>
	//    9   17:invokespecial   #557 <Method boolean zzc(DataType)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getFields()
	{
		return zzaTa;
	//    0    0:aload_0         
	//    1    1:getfield        #495 <Field List zzaTa>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field String name>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return name.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #487 <Field String name>
	//    2    4:invokevirtual   #563 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public int indexOf(Field field)
	{
		int i = zzaTa.indexOf(((Object) (field)));
	//    0    0:aload_0         
	//    1    1:getfield        #495 <Field List zzaTa>
	//    2    4:aload_1         
	//    3    5:invokeinterface #568 <Method int List.indexOf(Object)>
	//    4   10:istore_2        
		if(i < 0)
	//*   5   11:iload_2         
	//*   6   12:ifge            41
			throw new IllegalArgumentException(String.format("%s not a field of %s", new Object[] {
				field, this
			}));
	//    7   15:new             #570 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc2            #572 <String "%s not a field of %s">
	//   10   22:iconst_2        
	//   11   23:anewarray       Object[]
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:aload_1         
	//   15   29:aastore         
	//   16   30:dup             
	//   17   31:iconst_1        
	//   18   32:aload_0         
	//   19   33:aastore         
	//   20   34:invokestatic    #578 <Method String String.format(String, Object[])>
	//   21   37:invokespecial   #579 <Method void IllegalArgumentException(String)>
	//   22   40:athrow          
		else
			return i;
	//   23   41:iload_2         
	//   24   42:ireturn         
	}

	public String toString()
	{
		return String.format("DataType{%s%s}", new Object[] {
			name, zzaTa
		});
	//    0    0:ldc2            #582 <String "DataType{%s%s}">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #487 <Field String name>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #495 <Field List zzaTa>
	//   12   20:aastore         
	//   13   21:invokestatic    #578 <Method String String.format(String, Object[])>
	//   14   24:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzk.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #587 <Method void com.google.android.gms.fitness.data.zzk.zza(DataType, Parcel, int)>
	//    4    6:return          
	}

	public String zzCk()
	{
		if(name.startsWith("com.google."))
	//*   0    0:aload_0         
	//*   1    1:getfield        #487 <Field String name>
	//*   2    4:ldc2            #590 <String "com.google.">
	//*   3    7:invokevirtual   #594 <Method boolean String.startsWith(String)>
	//*   4   10:ifeq            23
			return name.substring(11);
	//    5   13:aload_0         
	//    6   14:getfield        #487 <Field String name>
	//    7   17:bipush          11
	//    8   19:invokevirtual   #598 <Method String String.substring(int)>
	//    9   22:areturn         
		else
			return name;
	//   10   23:aload_0         
	//   11   24:getfield        #487 <Field String name>
	//   12   27:areturn         
	}

	public static final DataType AGGREGATE_ACTIVITY_SUMMARY;
	public static final DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
	public static final DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
	public static final DataType AGGREGATE_CALORIES_CONSUMED;
	public static final DataType AGGREGATE_CALORIES_EXPENDED;
	public static final DataType AGGREGATE_DISTANCE_DELTA;
	public static final DataType AGGREGATE_HEART_RATE_SUMMARY;
	public static final DataType AGGREGATE_HEIGHT_SUMMARY;
	public static final DataType AGGREGATE_HYDRATION;
	public static final Set AGGREGATE_INPUT_TYPES;
	public static final DataType AGGREGATE_LOCATION_BOUNDING_BOX;
	public static final DataType AGGREGATE_NUTRITION_SUMMARY;
	public static final DataType AGGREGATE_POWER_SUMMARY;
	public static final DataType AGGREGATE_SPEED_SUMMARY;
	public static final DataType AGGREGATE_STEP_COUNT_DELTA;
	public static final DataType AGGREGATE_WEIGHT_SUMMARY;
	public static final android.os.Parcelable.Creator CREATOR = new zzk();
	public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
	public static final DataType TYPE_ACTIVITY_SAMPLE;
	public static final DataType TYPE_ACTIVITY_SAMPLES;
	public static final DataType TYPE_ACTIVITY_SEGMENT;
	public static final DataType TYPE_BASAL_METABOLIC_RATE;
	public static final DataType TYPE_BODY_FAT_PERCENTAGE;
	public static final DataType TYPE_CALORIES_CONSUMED;
	public static final DataType TYPE_CALORIES_EXPENDED;
	public static final DataType TYPE_CYCLING_PEDALING_CADENCE;
	public static final DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
	public static final DataType TYPE_CYCLING_WHEEL_REVOLUTION;
	public static final DataType TYPE_CYCLING_WHEEL_RPM;
	public static final DataType TYPE_DISTANCE_CUMULATIVE;
	public static final DataType TYPE_DISTANCE_DELTA;
	public static final DataType TYPE_HEART_RATE_BPM;
	public static final DataType TYPE_HEIGHT;
	public static final DataType TYPE_HYDRATION;
	public static final DataType TYPE_LOCATION_SAMPLE;
	public static final DataType TYPE_LOCATION_TRACK;
	public static final DataType TYPE_NUTRITION;
	public static final DataType TYPE_POWER_SAMPLE;
	public static final DataType TYPE_SPEED;
	public static final DataType TYPE_STEP_COUNT_CADENCE;
	public static final DataType TYPE_STEP_COUNT_CUMULATIVE;
	public static final DataType TYPE_STEP_COUNT_DELTA;
	public static final DataType TYPE_WEIGHT;
	public static final DataType TYPE_WORKOUT_EXERCISE;
	public static final DataType zzaSP;
	public static final DataType zzaSQ;
	public static final DataType zzaSR;
	public static final DataType zzaSS;
	public static final DataType zzaST;
	public static final DataType zzaSU;
	public static final DataType zzaSV;
	public static final DataType zzaSW;
	public static final DataType zzaSX;
	public static final DataType zzaSY;
	public static final DataType zzaSZ;
	private final String name;
	private final int versionCode;
	private final List zzaTa;

	static 
	{
		TYPE_STEP_COUNT_DELTA = new DataType("com.google.step_count.delta", new Field[] {
			Field.FIELD_STEPS
		});
	//    0    0:new             #2   <Class DataType>
	//    1    3:dup             
	//    2    4:ldc1            #90  <String "com.google.step_count.delta">
	//    3    6:iconst_1        
	//    4    7:anewarray       Field[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:getstatic       #96  <Field Field Field.FIELD_STEPS>
	//    8   15:aastore         
	//    9   16:invokespecial   #100 <Method void DataType(String, Field[])>
	//   10   19:putstatic       #102 <Field DataType TYPE_STEP_COUNT_DELTA>
		TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", new Field[] {
			Field.FIELD_STEPS
		});
	//   11   22:new             #2   <Class DataType>
	//   12   25:dup             
	//   13   26:ldc1            #104 <String "com.google.step_count.cumulative">
	//   14   28:iconst_1        
	//   15   29:anewarray       Field[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #96  <Field Field Field.FIELD_STEPS>
	//   19   37:aastore         
	//   20   38:invokespecial   #100 <Method void DataType(String, Field[])>
	//   21   41:putstatic       #106 <Field DataType TYPE_STEP_COUNT_CUMULATIVE>
		zzaSP = new DataType("com.google.step_length", new Field[] {
			Field.FIELD_STEP_LENGTH
		});
	//   22   44:new             #2   <Class DataType>
	//   23   47:dup             
	//   24   48:ldc1            #108 <String "com.google.step_length">
	//   25   50:iconst_1        
	//   26   51:anewarray       Field[]
	//   27   54:dup             
	//   28   55:iconst_0        
	//   29   56:getstatic       #111 <Field Field Field.FIELD_STEP_LENGTH>
	//   30   59:aastore         
	//   31   60:invokespecial   #100 <Method void DataType(String, Field[])>
	//   32   63:putstatic       #113 <Field DataType zzaSP>
		TYPE_STEP_COUNT_CADENCE = new DataType("com.google.step_count.cadence", new Field[] {
			Field.FIELD_RPM
		});
	//   33   66:new             #2   <Class DataType>
	//   34   69:dup             
	//   35   70:ldc1            #115 <String "com.google.step_count.cadence">
	//   36   72:iconst_1        
	//   37   73:anewarray       Field[]
	//   38   76:dup             
	//   39   77:iconst_0        
	//   40   78:getstatic       #118 <Field Field Field.FIELD_RPM>
	//   41   81:aastore         
	//   42   82:invokespecial   #100 <Method void DataType(String, Field[])>
	//   43   85:putstatic       #120 <Field DataType TYPE_STEP_COUNT_CADENCE>
		zzaSQ = new DataType("com.google.stride_model", new Field[] {
			Field.zzaTs
		});
	//   44   88:new             #2   <Class DataType>
	//   45   91:dup             
	//   46   92:ldc1            #122 <String "com.google.stride_model">
	//   47   94:iconst_1        
	//   48   95:anewarray       Field[]
	//   49   98:dup             
	//   50   99:iconst_0        
	//   51  100:getstatic       #125 <Field Field Field.zzaTs>
	//   52  103:aastore         
	//   53  104:invokespecial   #100 <Method void DataType(String, Field[])>
	//   54  107:putstatic       #127 <Field DataType zzaSQ>
		TYPE_ACTIVITY_SEGMENT = new DataType("com.google.activity.segment", new Field[] {
			Field.FIELD_ACTIVITY
		});
	//   55  110:new             #2   <Class DataType>
	//   56  113:dup             
	//   57  114:ldc1            #129 <String "com.google.activity.segment">
	//   58  116:iconst_1        
	//   59  117:anewarray       Field[]
	//   60  120:dup             
	//   61  121:iconst_0        
	//   62  122:getstatic       #132 <Field Field Field.FIELD_ACTIVITY>
	//   63  125:aastore         
	//   64  126:invokespecial   #100 <Method void DataType(String, Field[])>
	//   65  129:putstatic       #134 <Field DataType TYPE_ACTIVITY_SEGMENT>
		zzaSR = new DataType("com.google.floor_change", new Field[] {
			Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE, Field.zzaTt, Field.zzaTw
		});
	//   66  132:new             #2   <Class DataType>
	//   67  135:dup             
	//   68  136:ldc1            #136 <String "com.google.floor_change">
	//   69  138:iconst_4        
	//   70  139:anewarray       Field[]
	//   71  142:dup             
	//   72  143:iconst_0        
	//   73  144:getstatic       #132 <Field Field Field.FIELD_ACTIVITY>
	//   74  147:aastore         
	//   75  148:dup             
	//   76  149:iconst_1        
	//   77  150:getstatic       #139 <Field Field Field.FIELD_CONFIDENCE>
	//   78  153:aastore         
	//   79  154:dup             
	//   80  155:iconst_2        
	//   81  156:getstatic       #142 <Field Field Field.zzaTt>
	//   82  159:aastore         
	//   83  160:dup             
	//   84  161:iconst_3        
	//   85  162:getstatic       #145 <Field Field Field.zzaTw>
	//   86  165:aastore         
	//   87  166:invokespecial   #100 <Method void DataType(String, Field[])>
	//   88  169:putstatic       #147 <Field DataType zzaSR>
		TYPE_CALORIES_CONSUMED = new DataType("com.google.calories.consumed", new Field[] {
			Field.FIELD_CALORIES
		});
	//   89  172:new             #2   <Class DataType>
	//   90  175:dup             
	//   91  176:ldc1            #149 <String "com.google.calories.consumed">
	//   92  178:iconst_1        
	//   93  179:anewarray       Field[]
	//   94  182:dup             
	//   95  183:iconst_0        
	//   96  184:getstatic       #152 <Field Field Field.FIELD_CALORIES>
	//   97  187:aastore         
	//   98  188:invokespecial   #100 <Method void DataType(String, Field[])>
	//   99  191:putstatic       #154 <Field DataType TYPE_CALORIES_CONSUMED>
		TYPE_CALORIES_EXPENDED = new DataType("com.google.calories.expended", new Field[] {
			Field.FIELD_CALORIES
		});
	//  100  194:new             #2   <Class DataType>
	//  101  197:dup             
	//  102  198:ldc1            #156 <String "com.google.calories.expended">
	//  103  200:iconst_1        
	//  104  201:anewarray       Field[]
	//  105  204:dup             
	//  106  205:iconst_0        
	//  107  206:getstatic       #152 <Field Field Field.FIELD_CALORIES>
	//  108  209:aastore         
	//  109  210:invokespecial   #100 <Method void DataType(String, Field[])>
	//  110  213:putstatic       #158 <Field DataType TYPE_CALORIES_EXPENDED>
		TYPE_BASAL_METABOLIC_RATE = new DataType("com.google.calories.bmr", new Field[] {
			Field.FIELD_CALORIES
		});
	//  111  216:new             #2   <Class DataType>
	//  112  219:dup             
	//  113  220:ldc1            #160 <String "com.google.calories.bmr">
	//  114  222:iconst_1        
	//  115  223:anewarray       Field[]
	//  116  226:dup             
	//  117  227:iconst_0        
	//  118  228:getstatic       #152 <Field Field Field.FIELD_CALORIES>
	//  119  231:aastore         
	//  120  232:invokespecial   #100 <Method void DataType(String, Field[])>
	//  121  235:putstatic       #162 <Field DataType TYPE_BASAL_METABOLIC_RATE>
		TYPE_POWER_SAMPLE = new DataType("com.google.power.sample", new Field[] {
			Field.FIELD_WATTS
		});
	//  122  238:new             #2   <Class DataType>
	//  123  241:dup             
	//  124  242:ldc1            #164 <String "com.google.power.sample">
	//  125  244:iconst_1        
	//  126  245:anewarray       Field[]
	//  127  248:dup             
	//  128  249:iconst_0        
	//  129  250:getstatic       #167 <Field Field Field.FIELD_WATTS>
	//  130  253:aastore         
	//  131  254:invokespecial   #100 <Method void DataType(String, Field[])>
	//  132  257:putstatic       #169 <Field DataType TYPE_POWER_SAMPLE>
		TYPE_ACTIVITY_SAMPLE = new DataType("com.google.activity.sample", new Field[] {
			Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE
		});
	//  133  260:new             #2   <Class DataType>
	//  134  263:dup             
	//  135  264:ldc1            #171 <String "com.google.activity.sample">
	//  136  266:iconst_2        
	//  137  267:anewarray       Field[]
	//  138  270:dup             
	//  139  271:iconst_0        
	//  140  272:getstatic       #132 <Field Field Field.FIELD_ACTIVITY>
	//  141  275:aastore         
	//  142  276:dup             
	//  143  277:iconst_1        
	//  144  278:getstatic       #139 <Field Field Field.FIELD_CONFIDENCE>
	//  145  281:aastore         
	//  146  282:invokespecial   #100 <Method void DataType(String, Field[])>
	//  147  285:putstatic       #173 <Field DataType TYPE_ACTIVITY_SAMPLE>
		TYPE_ACTIVITY_SAMPLES = new DataType("com.google.activity.samples", new Field[] {
			Field.FIELD_ACTIVITY_CONFIDENCE
		});
	//  148  288:new             #2   <Class DataType>
	//  149  291:dup             
	//  150  292:ldc1            #175 <String "com.google.activity.samples">
	//  151  294:iconst_1        
	//  152  295:anewarray       Field[]
	//  153  298:dup             
	//  154  299:iconst_0        
	//  155  300:getstatic       #178 <Field Field Field.FIELD_ACTIVITY_CONFIDENCE>
	//  156  303:aastore         
	//  157  304:invokespecial   #100 <Method void DataType(String, Field[])>
	//  158  307:putstatic       #180 <Field DataType TYPE_ACTIVITY_SAMPLES>
		zzaSS = new DataType("com.google.accelerometer", new Field[] {
			Field.zza.zzaTH, Field.zza.zzaTI, Field.zza.zzaTJ
		});
	//  159  310:new             #2   <Class DataType>
	//  160  313:dup             
	//  161  314:ldc1            #182 <String "com.google.accelerometer">
	//  162  316:iconst_3        
	//  163  317:anewarray       Field[]
	//  164  320:dup             
	//  165  321:iconst_0        
	//  166  322:getstatic       #187 <Field Field Field$zza.zzaTH>
	//  167  325:aastore         
	//  168  326:dup             
	//  169  327:iconst_1        
	//  170  328:getstatic       #190 <Field Field Field$zza.zzaTI>
	//  171  331:aastore         
	//  172  332:dup             
	//  173  333:iconst_2        
	//  174  334:getstatic       #193 <Field Field Field$zza.zzaTJ>
	//  175  337:aastore         
	//  176  338:invokespecial   #100 <Method void DataType(String, Field[])>
	//  177  341:putstatic       #195 <Field DataType zzaSS>
		zzaST = new DataType("com.google.sensor.events", new Field[] {
			Field.zzaTz, Field.zzaTB, Field.zzaTF
		});
	//  178  344:new             #2   <Class DataType>
	//  179  347:dup             
	//  180  348:ldc1            #197 <String "com.google.sensor.events">
	//  181  350:iconst_3        
	//  182  351:anewarray       Field[]
	//  183  354:dup             
	//  184  355:iconst_0        
	//  185  356:getstatic       #200 <Field Field Field.zzaTz>
	//  186  359:aastore         
	//  187  360:dup             
	//  188  361:iconst_1        
	//  189  362:getstatic       #203 <Field Field Field.zzaTB>
	//  190  365:aastore         
	//  191  366:dup             
	//  192  367:iconst_2        
	//  193  368:getstatic       #206 <Field Field Field.zzaTF>
	//  194  371:aastore         
	//  195  372:invokespecial   #100 <Method void DataType(String, Field[])>
	//  196  375:putstatic       #208 <Field DataType zzaST>
		zzaSU = new DataType("com.google.sensor.const_rate_events", new Field[] {
			Field.zzaTA, Field.zzaTC, Field.zzaTD, Field.zzaTE, Field.zzaTF
		});
	//  197  378:new             #2   <Class DataType>
	//  198  381:dup             
	//  199  382:ldc1            #210 <String "com.google.sensor.const_rate_events">
	//  200  384:iconst_5        
	//  201  385:anewarray       Field[]
	//  202  388:dup             
	//  203  389:iconst_0        
	//  204  390:getstatic       #213 <Field Field Field.zzaTA>
	//  205  393:aastore         
	//  206  394:dup             
	//  207  395:iconst_1        
	//  208  396:getstatic       #216 <Field Field Field.zzaTC>
	//  209  399:aastore         
	//  210  400:dup             
	//  211  401:iconst_2        
	//  212  402:getstatic       #219 <Field Field Field.zzaTD>
	//  213  405:aastore         
	//  214  406:dup             
	//  215  407:iconst_3        
	//  216  408:getstatic       #222 <Field Field Field.zzaTE>
	//  217  411:aastore         
	//  218  412:dup             
	//  219  413:iconst_4        
	//  220  414:getstatic       #206 <Field Field Field.zzaTF>
	//  221  417:aastore         
	//  222  418:invokespecial   #100 <Method void DataType(String, Field[])>
	//  223  421:putstatic       #224 <Field DataType zzaSU>
		TYPE_HEART_RATE_BPM = new DataType("com.google.heart_rate.bpm", new Field[] {
			Field.FIELD_BPM
		});
	//  224  424:new             #2   <Class DataType>
	//  225  427:dup             
	//  226  428:ldc1            #226 <String "com.google.heart_rate.bpm">
	//  227  430:iconst_1        
	//  228  431:anewarray       Field[]
	//  229  434:dup             
	//  230  435:iconst_0        
	//  231  436:getstatic       #229 <Field Field Field.FIELD_BPM>
	//  232  439:aastore         
	//  233  440:invokespecial   #100 <Method void DataType(String, Field[])>
	//  234  443:putstatic       #231 <Field DataType TYPE_HEART_RATE_BPM>
		TYPE_LOCATION_SAMPLE = new DataType("com.google.location.sample", new Field[] {
			Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE
		});
	//  235  446:new             #2   <Class DataType>
	//  236  449:dup             
	//  237  450:ldc1            #233 <String "com.google.location.sample">
	//  238  452:iconst_4        
	//  239  453:anewarray       Field[]
	//  240  456:dup             
	//  241  457:iconst_0        
	//  242  458:getstatic       #236 <Field Field Field.FIELD_LATITUDE>
	//  243  461:aastore         
	//  244  462:dup             
	//  245  463:iconst_1        
	//  246  464:getstatic       #239 <Field Field Field.FIELD_LONGITUDE>
	//  247  467:aastore         
	//  248  468:dup             
	//  249  469:iconst_2        
	//  250  470:getstatic       #242 <Field Field Field.FIELD_ACCURACY>
	//  251  473:aastore         
	//  252  474:dup             
	//  253  475:iconst_3        
	//  254  476:getstatic       #245 <Field Field Field.FIELD_ALTITUDE>
	//  255  479:aastore         
	//  256  480:invokespecial   #100 <Method void DataType(String, Field[])>
	//  257  483:putstatic       #247 <Field DataType TYPE_LOCATION_SAMPLE>
		TYPE_LOCATION_TRACK = new DataType("com.google.location.track", new Field[] {
			Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE
		});
	//  258  486:new             #2   <Class DataType>
	//  259  489:dup             
	//  260  490:ldc1            #249 <String "com.google.location.track">
	//  261  492:iconst_4        
	//  262  493:anewarray       Field[]
	//  263  496:dup             
	//  264  497:iconst_0        
	//  265  498:getstatic       #236 <Field Field Field.FIELD_LATITUDE>
	//  266  501:aastore         
	//  267  502:dup             
	//  268  503:iconst_1        
	//  269  504:getstatic       #239 <Field Field Field.FIELD_LONGITUDE>
	//  270  507:aastore         
	//  271  508:dup             
	//  272  509:iconst_2        
	//  273  510:getstatic       #242 <Field Field Field.FIELD_ACCURACY>
	//  274  513:aastore         
	//  275  514:dup             
	//  276  515:iconst_3        
	//  277  516:getstatic       #245 <Field Field Field.FIELD_ALTITUDE>
	//  278  519:aastore         
	//  279  520:invokespecial   #100 <Method void DataType(String, Field[])>
	//  280  523:putstatic       #251 <Field DataType TYPE_LOCATION_TRACK>
		TYPE_DISTANCE_DELTA = new DataType("com.google.distance.delta", new Field[] {
			Field.FIELD_DISTANCE
		});
	//  281  526:new             #2   <Class DataType>
	//  282  529:dup             
	//  283  530:ldc1            #253 <String "com.google.distance.delta">
	//  284  532:iconst_1        
	//  285  533:anewarray       Field[]
	//  286  536:dup             
	//  287  537:iconst_0        
	//  288  538:getstatic       #256 <Field Field Field.FIELD_DISTANCE>
	//  289  541:aastore         
	//  290  542:invokespecial   #100 <Method void DataType(String, Field[])>
	//  291  545:putstatic       #258 <Field DataType TYPE_DISTANCE_DELTA>
		TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", new Field[] {
			Field.FIELD_DISTANCE
		});
	//  292  548:new             #2   <Class DataType>
	//  293  551:dup             
	//  294  552:ldc2            #260 <String "com.google.distance.cumulative">
	//  295  555:iconst_1        
	//  296  556:anewarray       Field[]
	//  297  559:dup             
	//  298  560:iconst_0        
	//  299  561:getstatic       #256 <Field Field Field.FIELD_DISTANCE>
	//  300  564:aastore         
	//  301  565:invokespecial   #100 <Method void DataType(String, Field[])>
	//  302  568:putstatic       #262 <Field DataType TYPE_DISTANCE_CUMULATIVE>
		TYPE_SPEED = new DataType("com.google.speed", new Field[] {
			Field.FIELD_SPEED
		});
	//  303  571:new             #2   <Class DataType>
	//  304  574:dup             
	//  305  575:ldc2            #264 <String "com.google.speed">
	//  306  578:iconst_1        
	//  307  579:anewarray       Field[]
	//  308  582:dup             
	//  309  583:iconst_0        
	//  310  584:getstatic       #267 <Field Field Field.FIELD_SPEED>
	//  311  587:aastore         
	//  312  588:invokespecial   #100 <Method void DataType(String, Field[])>
	//  313  591:putstatic       #269 <Field DataType TYPE_SPEED>
		TYPE_CYCLING_WHEEL_REVOLUTION = new DataType("com.google.cycling.wheel_revolution.cumulative", new Field[] {
			Field.FIELD_REVOLUTIONS
		});
	//  314  594:new             #2   <Class DataType>
	//  315  597:dup             
	//  316  598:ldc2            #271 <String "com.google.cycling.wheel_revolution.cumulative">
	//  317  601:iconst_1        
	//  318  602:anewarray       Field[]
	//  319  605:dup             
	//  320  606:iconst_0        
	//  321  607:getstatic       #274 <Field Field Field.FIELD_REVOLUTIONS>
	//  322  610:aastore         
	//  323  611:invokespecial   #100 <Method void DataType(String, Field[])>
	//  324  614:putstatic       #276 <Field DataType TYPE_CYCLING_WHEEL_REVOLUTION>
		TYPE_CYCLING_WHEEL_RPM = new DataType("com.google.cycling.wheel_revolution.rpm", new Field[] {
			Field.FIELD_RPM
		});
	//  325  617:new             #2   <Class DataType>
	//  326  620:dup             
	//  327  621:ldc2            #278 <String "com.google.cycling.wheel_revolution.rpm">
	//  328  624:iconst_1        
	//  329  625:anewarray       Field[]
	//  330  628:dup             
	//  331  629:iconst_0        
	//  332  630:getstatic       #118 <Field Field Field.FIELD_RPM>
	//  333  633:aastore         
	//  334  634:invokespecial   #100 <Method void DataType(String, Field[])>
	//  335  637:putstatic       #280 <Field DataType TYPE_CYCLING_WHEEL_RPM>
		TYPE_CYCLING_PEDALING_CUMULATIVE = new DataType("com.google.cycling.pedaling.cumulative", new Field[] {
			Field.FIELD_REVOLUTIONS
		});
	//  336  640:new             #2   <Class DataType>
	//  337  643:dup             
	//  338  644:ldc2            #282 <String "com.google.cycling.pedaling.cumulative">
	//  339  647:iconst_1        
	//  340  648:anewarray       Field[]
	//  341  651:dup             
	//  342  652:iconst_0        
	//  343  653:getstatic       #274 <Field Field Field.FIELD_REVOLUTIONS>
	//  344  656:aastore         
	//  345  657:invokespecial   #100 <Method void DataType(String, Field[])>
	//  346  660:putstatic       #284 <Field DataType TYPE_CYCLING_PEDALING_CUMULATIVE>
		TYPE_CYCLING_PEDALING_CADENCE = new DataType("com.google.cycling.pedaling.cadence", new Field[] {
			Field.FIELD_RPM
		});
	//  347  663:new             #2   <Class DataType>
	//  348  666:dup             
	//  349  667:ldc2            #286 <String "com.google.cycling.pedaling.cadence">
	//  350  670:iconst_1        
	//  351  671:anewarray       Field[]
	//  352  674:dup             
	//  353  675:iconst_0        
	//  354  676:getstatic       #118 <Field Field Field.FIELD_RPM>
	//  355  679:aastore         
	//  356  680:invokespecial   #100 <Method void DataType(String, Field[])>
	//  357  683:putstatic       #288 <Field DataType TYPE_CYCLING_PEDALING_CADENCE>
		TYPE_HEIGHT = new DataType("com.google.height", new Field[] {
			Field.FIELD_HEIGHT
		});
	//  358  686:new             #2   <Class DataType>
	//  359  689:dup             
	//  360  690:ldc2            #290 <String "com.google.height">
	//  361  693:iconst_1        
	//  362  694:anewarray       Field[]
	//  363  697:dup             
	//  364  698:iconst_0        
	//  365  699:getstatic       #293 <Field Field Field.FIELD_HEIGHT>
	//  366  702:aastore         
	//  367  703:invokespecial   #100 <Method void DataType(String, Field[])>
	//  368  706:putstatic       #295 <Field DataType TYPE_HEIGHT>
		TYPE_WEIGHT = new DataType("com.google.weight", new Field[] {
			Field.FIELD_WEIGHT
		});
	//  369  709:new             #2   <Class DataType>
	//  370  712:dup             
	//  371  713:ldc2            #297 <String "com.google.weight">
	//  372  716:iconst_1        
	//  373  717:anewarray       Field[]
	//  374  720:dup             
	//  375  721:iconst_0        
	//  376  722:getstatic       #300 <Field Field Field.FIELD_WEIGHT>
	//  377  725:aastore         
	//  378  726:invokespecial   #100 <Method void DataType(String, Field[])>
	//  379  729:putstatic       #302 <Field DataType TYPE_WEIGHT>
		TYPE_BODY_FAT_PERCENTAGE = new DataType("com.google.body.fat.percentage", new Field[] {
			Field.FIELD_PERCENTAGE
		});
	//  380  732:new             #2   <Class DataType>
	//  381  735:dup             
	//  382  736:ldc2            #304 <String "com.google.body.fat.percentage">
	//  383  739:iconst_1        
	//  384  740:anewarray       Field[]
	//  385  743:dup             
	//  386  744:iconst_0        
	//  387  745:getstatic       #307 <Field Field Field.FIELD_PERCENTAGE>
	//  388  748:aastore         
	//  389  749:invokespecial   #100 <Method void DataType(String, Field[])>
	//  390  752:putstatic       #309 <Field DataType TYPE_BODY_FAT_PERCENTAGE>
		zzaSV = new DataType("com.google.body.waist.circumference", new Field[] {
			Field.FIELD_CIRCUMFERENCE
		});
	//  391  755:new             #2   <Class DataType>
	//  392  758:dup             
	//  393  759:ldc2            #311 <String "com.google.body.waist.circumference">
	//  394  762:iconst_1        
	//  395  763:anewarray       Field[]
	//  396  766:dup             
	//  397  767:iconst_0        
	//  398  768:getstatic       #314 <Field Field Field.FIELD_CIRCUMFERENCE>
	//  399  771:aastore         
	//  400  772:invokespecial   #100 <Method void DataType(String, Field[])>
	//  401  775:putstatic       #316 <Field DataType zzaSV>
		zzaSW = new DataType("com.google.body.hip.circumference", new Field[] {
			Field.FIELD_CIRCUMFERENCE
		});
	//  402  778:new             #2   <Class DataType>
	//  403  781:dup             
	//  404  782:ldc2            #318 <String "com.google.body.hip.circumference">
	//  405  785:iconst_1        
	//  406  786:anewarray       Field[]
	//  407  789:dup             
	//  408  790:iconst_0        
	//  409  791:getstatic       #314 <Field Field Field.FIELD_CIRCUMFERENCE>
	//  410  794:aastore         
	//  411  795:invokespecial   #100 <Method void DataType(String, Field[])>
	//  412  798:putstatic       #320 <Field DataType zzaSW>
		TYPE_NUTRITION = new DataType("com.google.nutrition", new Field[] {
			Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE, Field.FIELD_FOOD_ITEM
		});
	//  413  801:new             #2   <Class DataType>
	//  414  804:dup             
	//  415  805:ldc2            #322 <String "com.google.nutrition">
	//  416  808:iconst_3        
	//  417  809:anewarray       Field[]
	//  418  812:dup             
	//  419  813:iconst_0        
	//  420  814:getstatic       #325 <Field Field Field.FIELD_NUTRIENTS>
	//  421  817:aastore         
	//  422  818:dup             
	//  423  819:iconst_1        
	//  424  820:getstatic       #328 <Field Field Field.FIELD_MEAL_TYPE>
	//  425  823:aastore         
	//  426  824:dup             
	//  427  825:iconst_2        
	//  428  826:getstatic       #331 <Field Field Field.FIELD_FOOD_ITEM>
	//  429  829:aastore         
	//  430  830:invokespecial   #100 <Method void DataType(String, Field[])>
	//  431  833:putstatic       #333 <Field DataType TYPE_NUTRITION>
		TYPE_HYDRATION = new DataType("com.google.hydration", new Field[] {
			Field.FIELD_VOLUME
		});
	//  432  836:new             #2   <Class DataType>
	//  433  839:dup             
	//  434  840:ldc2            #335 <String "com.google.hydration">
	//  435  843:iconst_1        
	//  436  844:anewarray       Field[]
	//  437  847:dup             
	//  438  848:iconst_0        
	//  439  849:getstatic       #338 <Field Field Field.FIELD_VOLUME>
	//  440  852:aastore         
	//  441  853:invokespecial   #100 <Method void DataType(String, Field[])>
	//  442  856:putstatic       #340 <Field DataType TYPE_HYDRATION>
		TYPE_WORKOUT_EXERCISE = new DataType("com.google.activity.exercise", new Field[] {
			Field.FIELD_EXERCISE, Field.FIELD_REPETITIONS, Field.FIELD_DURATION, Field.FIELD_RESISTANCE_TYPE, Field.FIELD_RESISTANCE
		});
	//  443  859:new             #2   <Class DataType>
	//  444  862:dup             
	//  445  863:ldc2            #342 <String "com.google.activity.exercise">
	//  446  866:iconst_5        
	//  447  867:anewarray       Field[]
	//  448  870:dup             
	//  449  871:iconst_0        
	//  450  872:getstatic       #345 <Field Field Field.FIELD_EXERCISE>
	//  451  875:aastore         
	//  452  876:dup             
	//  453  877:iconst_1        
	//  454  878:getstatic       #348 <Field Field Field.FIELD_REPETITIONS>
	//  455  881:aastore         
	//  456  882:dup             
	//  457  883:iconst_2        
	//  458  884:getstatic       #351 <Field Field Field.FIELD_DURATION>
	//  459  887:aastore         
	//  460  888:dup             
	//  461  889:iconst_3        
	//  462  890:getstatic       #354 <Field Field Field.FIELD_RESISTANCE_TYPE>
	//  463  893:aastore         
	//  464  894:dup             
	//  465  895:iconst_4        
	//  466  896:getstatic       #357 <Field Field Field.FIELD_RESISTANCE>
	//  467  899:aastore         
	//  468  900:invokespecial   #100 <Method void DataType(String, Field[])>
	//  469  903:putstatic       #359 <Field DataType TYPE_WORKOUT_EXERCISE>
		AGGREGATE_ACTIVITY_SUMMARY = new DataType("com.google.activity.summary", new Field[] {
			Field.FIELD_ACTIVITY, Field.FIELD_DURATION, Field.FIELD_NUM_SEGMENTS
		});
	//  470  906:new             #2   <Class DataType>
	//  471  909:dup             
	//  472  910:ldc2            #361 <String "com.google.activity.summary">
	//  473  913:iconst_3        
	//  474  914:anewarray       Field[]
	//  475  917:dup             
	//  476  918:iconst_0        
	//  477  919:getstatic       #132 <Field Field Field.FIELD_ACTIVITY>
	//  478  922:aastore         
	//  479  923:dup             
	//  480  924:iconst_1        
	//  481  925:getstatic       #351 <Field Field Field.FIELD_DURATION>
	//  482  928:aastore         
	//  483  929:dup             
	//  484  930:iconst_2        
	//  485  931:getstatic       #364 <Field Field Field.FIELD_NUM_SEGMENTS>
	//  486  934:aastore         
	//  487  935:invokespecial   #100 <Method void DataType(String, Field[])>
	//  488  938:putstatic       #366 <Field DataType AGGREGATE_ACTIVITY_SUMMARY>
		zzaSX = new DataType("com.google.floor_change.summary", new Field[] {
			Field.zzaTq, Field.zzaTr, Field.zzaTu, Field.zzaTv, Field.zzaTx, Field.zzaTy
		});
	//  489  941:new             #2   <Class DataType>
	//  490  944:dup             
	//  491  945:ldc2            #368 <String "com.google.floor_change.summary">
	//  492  948:bipush          6
	//  493  950:anewarray       Field[]
	//  494  953:dup             
	//  495  954:iconst_0        
	//  496  955:getstatic       #371 <Field Field Field.zzaTq>
	//  497  958:aastore         
	//  498  959:dup             
	//  499  960:iconst_1        
	//  500  961:getstatic       #374 <Field Field Field.zzaTr>
	//  501  964:aastore         
	//  502  965:dup             
	//  503  966:iconst_2        
	//  504  967:getstatic       #377 <Field Field Field.zzaTu>
	//  505  970:aastore         
	//  506  971:dup             
	//  507  972:iconst_3        
	//  508  973:getstatic       #380 <Field Field Field.zzaTv>
	//  509  976:aastore         
	//  510  977:dup             
	//  511  978:iconst_4        
	//  512  979:getstatic       #383 <Field Field Field.zzaTx>
	//  513  982:aastore         
	//  514  983:dup             
	//  515  984:iconst_5        
	//  516  985:getstatic       #386 <Field Field Field.zzaTy>
	//  517  988:aastore         
	//  518  989:invokespecial   #100 <Method void DataType(String, Field[])>
	//  519  992:putstatic       #388 <Field DataType zzaSX>
		AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = new DataType("com.google.calories.bmr.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  520  995:new             #2   <Class DataType>
	//  521  998:dup             
	//  522  999:ldc2            #390 <String "com.google.calories.bmr.summary">
	//  523 1002:iconst_3        
	//  524 1003:anewarray       Field[]
	//  525 1006:dup             
	//  526 1007:iconst_0        
	//  527 1008:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  528 1011:aastore         
	//  529 1012:dup             
	//  530 1013:iconst_1        
	//  531 1014:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  532 1017:aastore         
	//  533 1018:dup             
	//  534 1019:iconst_2        
	//  535 1020:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  536 1023:aastore         
	//  537 1024:invokespecial   #100 <Method void DataType(String, Field[])>
	//  538 1027:putstatic       #401 <Field DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY>
		AGGREGATE_STEP_COUNT_DELTA = TYPE_STEP_COUNT_DELTA;
	//  539 1030:getstatic       #102 <Field DataType TYPE_STEP_COUNT_DELTA>
	//  540 1033:putstatic       #403 <Field DataType AGGREGATE_STEP_COUNT_DELTA>
		AGGREGATE_DISTANCE_DELTA = TYPE_DISTANCE_DELTA;
	//  541 1036:getstatic       #258 <Field DataType TYPE_DISTANCE_DELTA>
	//  542 1039:putstatic       #405 <Field DataType AGGREGATE_DISTANCE_DELTA>
		AGGREGATE_CALORIES_CONSUMED = TYPE_CALORIES_CONSUMED;
	//  543 1042:getstatic       #154 <Field DataType TYPE_CALORIES_CONSUMED>
	//  544 1045:putstatic       #407 <Field DataType AGGREGATE_CALORIES_CONSUMED>
		AGGREGATE_CALORIES_EXPENDED = TYPE_CALORIES_EXPENDED;
	//  545 1048:getstatic       #158 <Field DataType TYPE_CALORIES_EXPENDED>
	//  546 1051:putstatic       #409 <Field DataType AGGREGATE_CALORIES_EXPENDED>
		AGGREGATE_HEART_RATE_SUMMARY = new DataType("com.google.heart_rate.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  547 1054:new             #2   <Class DataType>
	//  548 1057:dup             
	//  549 1058:ldc2            #411 <String "com.google.heart_rate.summary">
	//  550 1061:iconst_3        
	//  551 1062:anewarray       Field[]
	//  552 1065:dup             
	//  553 1066:iconst_0        
	//  554 1067:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  555 1070:aastore         
	//  556 1071:dup             
	//  557 1072:iconst_1        
	//  558 1073:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  559 1076:aastore         
	//  560 1077:dup             
	//  561 1078:iconst_2        
	//  562 1079:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  563 1082:aastore         
	//  564 1083:invokespecial   #100 <Method void DataType(String, Field[])>
	//  565 1086:putstatic       #413 <Field DataType AGGREGATE_HEART_RATE_SUMMARY>
		AGGREGATE_LOCATION_BOUNDING_BOX = new DataType("com.google.location.bounding_box", new Field[] {
			Field.FIELD_LOW_LATITUDE, Field.FIELD_LOW_LONGITUDE, Field.FIELD_HIGH_LATITUDE, Field.FIELD_HIGH_LONGITUDE
		});
	//  566 1089:new             #2   <Class DataType>
	//  567 1092:dup             
	//  568 1093:ldc2            #415 <String "com.google.location.bounding_box">
	//  569 1096:iconst_4        
	//  570 1097:anewarray       Field[]
	//  571 1100:dup             
	//  572 1101:iconst_0        
	//  573 1102:getstatic       #418 <Field Field Field.FIELD_LOW_LATITUDE>
	//  574 1105:aastore         
	//  575 1106:dup             
	//  576 1107:iconst_1        
	//  577 1108:getstatic       #421 <Field Field Field.FIELD_LOW_LONGITUDE>
	//  578 1111:aastore         
	//  579 1112:dup             
	//  580 1113:iconst_2        
	//  581 1114:getstatic       #424 <Field Field Field.FIELD_HIGH_LATITUDE>
	//  582 1117:aastore         
	//  583 1118:dup             
	//  584 1119:iconst_3        
	//  585 1120:getstatic       #427 <Field Field Field.FIELD_HIGH_LONGITUDE>
	//  586 1123:aastore         
	//  587 1124:invokespecial   #100 <Method void DataType(String, Field[])>
	//  588 1127:putstatic       #429 <Field DataType AGGREGATE_LOCATION_BOUNDING_BOX>
		AGGREGATE_POWER_SUMMARY = new DataType("com.google.power.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  589 1130:new             #2   <Class DataType>
	//  590 1133:dup             
	//  591 1134:ldc2            #431 <String "com.google.power.summary">
	//  592 1137:iconst_3        
	//  593 1138:anewarray       Field[]
	//  594 1141:dup             
	//  595 1142:iconst_0        
	//  596 1143:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  597 1146:aastore         
	//  598 1147:dup             
	//  599 1148:iconst_1        
	//  600 1149:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  601 1152:aastore         
	//  602 1153:dup             
	//  603 1154:iconst_2        
	//  604 1155:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  605 1158:aastore         
	//  606 1159:invokespecial   #100 <Method void DataType(String, Field[])>
	//  607 1162:putstatic       #433 <Field DataType AGGREGATE_POWER_SUMMARY>
		AGGREGATE_SPEED_SUMMARY = new DataType("com.google.speed.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  608 1165:new             #2   <Class DataType>
	//  609 1168:dup             
	//  610 1169:ldc2            #435 <String "com.google.speed.summary">
	//  611 1172:iconst_3        
	//  612 1173:anewarray       Field[]
	//  613 1176:dup             
	//  614 1177:iconst_0        
	//  615 1178:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  616 1181:aastore         
	//  617 1182:dup             
	//  618 1183:iconst_1        
	//  619 1184:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  620 1187:aastore         
	//  621 1188:dup             
	//  622 1189:iconst_2        
	//  623 1190:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  624 1193:aastore         
	//  625 1194:invokespecial   #100 <Method void DataType(String, Field[])>
	//  626 1197:putstatic       #437 <Field DataType AGGREGATE_SPEED_SUMMARY>
		AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = new DataType("com.google.body.fat.percentage.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  627 1200:new             #2   <Class DataType>
	//  628 1203:dup             
	//  629 1204:ldc2            #439 <String "com.google.body.fat.percentage.summary">
	//  630 1207:iconst_3        
	//  631 1208:anewarray       Field[]
	//  632 1211:dup             
	//  633 1212:iconst_0        
	//  634 1213:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  635 1216:aastore         
	//  636 1217:dup             
	//  637 1218:iconst_1        
	//  638 1219:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  639 1222:aastore         
	//  640 1223:dup             
	//  641 1224:iconst_2        
	//  642 1225:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  643 1228:aastore         
	//  644 1229:invokespecial   #100 <Method void DataType(String, Field[])>
	//  645 1232:putstatic       #441 <Field DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY>
		zzaSY = new DataType("com.google.body.hip.circumference.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  646 1235:new             #2   <Class DataType>
	//  647 1238:dup             
	//  648 1239:ldc2            #443 <String "com.google.body.hip.circumference.summary">
	//  649 1242:iconst_3        
	//  650 1243:anewarray       Field[]
	//  651 1246:dup             
	//  652 1247:iconst_0        
	//  653 1248:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  654 1251:aastore         
	//  655 1252:dup             
	//  656 1253:iconst_1        
	//  657 1254:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  658 1257:aastore         
	//  659 1258:dup             
	//  660 1259:iconst_2        
	//  661 1260:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  662 1263:aastore         
	//  663 1264:invokespecial   #100 <Method void DataType(String, Field[])>
	//  664 1267:putstatic       #445 <Field DataType zzaSY>
		zzaSZ = new DataType("com.google.body.waist.circumference.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  665 1270:new             #2   <Class DataType>
	//  666 1273:dup             
	//  667 1274:ldc2            #447 <String "com.google.body.waist.circumference.summary">
	//  668 1277:iconst_3        
	//  669 1278:anewarray       Field[]
	//  670 1281:dup             
	//  671 1282:iconst_0        
	//  672 1283:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  673 1286:aastore         
	//  674 1287:dup             
	//  675 1288:iconst_1        
	//  676 1289:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  677 1292:aastore         
	//  678 1293:dup             
	//  679 1294:iconst_2        
	//  680 1295:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  681 1298:aastore         
	//  682 1299:invokespecial   #100 <Method void DataType(String, Field[])>
	//  683 1302:putstatic       #449 <Field DataType zzaSZ>
		AGGREGATE_WEIGHT_SUMMARY = new DataType("com.google.weight.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  684 1305:new             #2   <Class DataType>
	//  685 1308:dup             
	//  686 1309:ldc2            #451 <String "com.google.weight.summary">
	//  687 1312:iconst_3        
	//  688 1313:anewarray       Field[]
	//  689 1316:dup             
	//  690 1317:iconst_0        
	//  691 1318:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  692 1321:aastore         
	//  693 1322:dup             
	//  694 1323:iconst_1        
	//  695 1324:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  696 1327:aastore         
	//  697 1328:dup             
	//  698 1329:iconst_2        
	//  699 1330:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  700 1333:aastore         
	//  701 1334:invokespecial   #100 <Method void DataType(String, Field[])>
	//  702 1337:putstatic       #453 <Field DataType AGGREGATE_WEIGHT_SUMMARY>
		AGGREGATE_HEIGHT_SUMMARY = new DataType("com.google.height.summary", new Field[] {
			Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
		});
	//  703 1340:new             #2   <Class DataType>
	//  704 1343:dup             
	//  705 1344:ldc2            #455 <String "com.google.height.summary">
	//  706 1347:iconst_3        
	//  707 1348:anewarray       Field[]
	//  708 1351:dup             
	//  709 1352:iconst_0        
	//  710 1353:getstatic       #393 <Field Field Field.FIELD_AVERAGE>
	//  711 1356:aastore         
	//  712 1357:dup             
	//  713 1358:iconst_1        
	//  714 1359:getstatic       #396 <Field Field Field.FIELD_MAX>
	//  715 1362:aastore         
	//  716 1363:dup             
	//  717 1364:iconst_2        
	//  718 1365:getstatic       #399 <Field Field Field.FIELD_MIN>
	//  719 1368:aastore         
	//  720 1369:invokespecial   #100 <Method void DataType(String, Field[])>
	//  721 1372:putstatic       #457 <Field DataType AGGREGATE_HEIGHT_SUMMARY>
		AGGREGATE_NUTRITION_SUMMARY = new DataType("com.google.nutrition.summary", new Field[] {
			Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE
		});
	//  722 1375:new             #2   <Class DataType>
	//  723 1378:dup             
	//  724 1379:ldc2            #459 <String "com.google.nutrition.summary">
	//  725 1382:iconst_2        
	//  726 1383:anewarray       Field[]
	//  727 1386:dup             
	//  728 1387:iconst_0        
	//  729 1388:getstatic       #325 <Field Field Field.FIELD_NUTRIENTS>
	//  730 1391:aastore         
	//  731 1392:dup             
	//  732 1393:iconst_1        
	//  733 1394:getstatic       #328 <Field Field Field.FIELD_MEAL_TYPE>
	//  734 1397:aastore         
	//  735 1398:invokespecial   #100 <Method void DataType(String, Field[])>
	//  736 1401:putstatic       #461 <Field DataType AGGREGATE_NUTRITION_SUMMARY>
		AGGREGATE_HYDRATION = TYPE_HYDRATION;
	//  737 1404:getstatic       #340 <Field DataType TYPE_HYDRATION>
	//  738 1407:putstatic       #463 <Field DataType AGGREGATE_HYDRATION>
		AGGREGATE_INPUT_TYPES = ((Set) (new com.google.android.gms.common.util.zza()));
	//  739 1410:new             #465 <Class com.google.android.gms.common.util.zza>
	//  740 1413:dup             
	//  741 1414:invokespecial   #467 <Method void com.google.android.gms.common.util.zza()>
	//  742 1417:putstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_ACTIVITY_SEGMENT)));
	//  743 1420:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  744 1423:getstatic       #134 <Field DataType TYPE_ACTIVITY_SEGMENT>
	//  745 1426:invokeinterface #475 <Method boolean Set.add(Object)>
	//  746 1431:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_BASAL_METABOLIC_RATE)));
	//  747 1432:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  748 1435:getstatic       #162 <Field DataType TYPE_BASAL_METABOLIC_RATE>
	//  749 1438:invokeinterface #475 <Method boolean Set.add(Object)>
	//  750 1443:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_BODY_FAT_PERCENTAGE)));
	//  751 1444:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  752 1447:getstatic       #309 <Field DataType TYPE_BODY_FAT_PERCENTAGE>
	//  753 1450:invokeinterface #475 <Method boolean Set.add(Object)>
	//  754 1455:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (zzaSW)));
	//  755 1456:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  756 1459:getstatic       #320 <Field DataType zzaSW>
	//  757 1462:invokeinterface #475 <Method boolean Set.add(Object)>
	//  758 1467:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (zzaSV)));
	//  759 1468:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  760 1471:getstatic       #316 <Field DataType zzaSV>
	//  761 1474:invokeinterface #475 <Method boolean Set.add(Object)>
	//  762 1479:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_CALORIES_CONSUMED)));
	//  763 1480:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  764 1483:getstatic       #154 <Field DataType TYPE_CALORIES_CONSUMED>
	//  765 1486:invokeinterface #475 <Method boolean Set.add(Object)>
	//  766 1491:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_CALORIES_EXPENDED)));
	//  767 1492:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  768 1495:getstatic       #158 <Field DataType TYPE_CALORIES_EXPENDED>
	//  769 1498:invokeinterface #475 <Method boolean Set.add(Object)>
	//  770 1503:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_DISTANCE_DELTA)));
	//  771 1504:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  772 1507:getstatic       #258 <Field DataType TYPE_DISTANCE_DELTA>
	//  773 1510:invokeinterface #475 <Method boolean Set.add(Object)>
	//  774 1515:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (zzaSR)));
	//  775 1516:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  776 1519:getstatic       #147 <Field DataType zzaSR>
	//  777 1522:invokeinterface #475 <Method boolean Set.add(Object)>
	//  778 1527:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_LOCATION_SAMPLE)));
	//  779 1528:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  780 1531:getstatic       #247 <Field DataType TYPE_LOCATION_SAMPLE>
	//  781 1534:invokeinterface #475 <Method boolean Set.add(Object)>
	//  782 1539:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_NUTRITION)));
	//  783 1540:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  784 1543:getstatic       #333 <Field DataType TYPE_NUTRITION>
	//  785 1546:invokeinterface #475 <Method boolean Set.add(Object)>
	//  786 1551:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_HYDRATION)));
	//  787 1552:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  788 1555:getstatic       #340 <Field DataType TYPE_HYDRATION>
	//  789 1558:invokeinterface #475 <Method boolean Set.add(Object)>
	//  790 1563:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_HEART_RATE_BPM)));
	//  791 1564:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  792 1567:getstatic       #231 <Field DataType TYPE_HEART_RATE_BPM>
	//  793 1570:invokeinterface #475 <Method boolean Set.add(Object)>
	//  794 1575:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_POWER_SAMPLE)));
	//  795 1576:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  796 1579:getstatic       #169 <Field DataType TYPE_POWER_SAMPLE>
	//  797 1582:invokeinterface #475 <Method boolean Set.add(Object)>
	//  798 1587:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_SPEED)));
	//  799 1588:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  800 1591:getstatic       #269 <Field DataType TYPE_SPEED>
	//  801 1594:invokeinterface #475 <Method boolean Set.add(Object)>
	//  802 1599:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_STEP_COUNT_DELTA)));
	//  803 1600:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  804 1603:getstatic       #102 <Field DataType TYPE_STEP_COUNT_DELTA>
	//  805 1606:invokeinterface #475 <Method boolean Set.add(Object)>
	//  806 1611:pop             
		AGGREGATE_INPUT_TYPES.add(((Object) (TYPE_WEIGHT)));
	//  807 1612:getstatic       #469 <Field Set AGGREGATE_INPUT_TYPES>
	//  808 1615:getstatic       #302 <Field DataType TYPE_WEIGHT>
	//  809 1618:invokeinterface #475 <Method boolean Set.add(Object)>
	//  810 1623:pop             
	//  811 1624:new             #477 <Class zzk>
	//  812 1627:dup             
	//  813 1628:invokespecial   #478 <Method void zzk()>
	//  814 1631:putstatic       #480 <Field android.os.Parcelable$Creator CREATOR>
	//* 815 1634:return          
	}
}
