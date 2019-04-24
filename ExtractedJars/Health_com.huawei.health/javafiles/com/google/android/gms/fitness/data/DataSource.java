// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzj, DataType, zzb, Device

public class DataSource extends zza
{
	public static final class Builder
	{

		static DataType zza(Builder builder)
		{
			return builder.zzaSg;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field DataType zzaSg>
		//    2    4:areturn         
		}

		static int zzb(Builder builder)
		{
			return builder.type;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int type>
		//    2    4:ireturn         
		}

		static String zzc(Builder builder)
		{
			return builder.name;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field String name>
		//    2    4:areturn         
		}

		static Device zzd(Builder builder)
		{
			return builder.zzaSK;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Device zzaSK>
		//    2    4:areturn         
		}

		static zzb zze(Builder builder)
		{
			return builder.zzaSL;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field zzb zzaSL>
		//    2    4:areturn         
		}

		static String zzf(Builder builder)
		{
			return builder.zzaSM;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String zzaSM>
		//    2    4:areturn         
		}

		static int[] zzg(Builder builder)
		{
			return builder.zzaSN;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field int[] zzaSN>
		//    2    4:areturn         
		}

		public DataSource build()
		{
			boolean flag;
			if(zzaSg != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field DataType zzaSg>
		//*   2    4:ifnull          12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_1        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_1        
			zzac.zza(flag, "Must set data type");
		//    8   14:iload_1         
		//    9   15:ldc1            #58  <String "Must set data type">
		//   10   17:invokestatic    #63  <Method void zzac.zza(boolean, Object)>
			if(type >= 0)
		//*  11   20:aload_0         
		//*  12   21:getfield        #26  <Field int type>
		//*  13   24:iflt            32
				flag = true;
		//   14   27:iconst_1        
		//   15   28:istore_1        
			else
		//*  16   29:goto            34
				flag = false;
		//   17   32:iconst_0        
		//   18   33:istore_1        
			zzac.zza(flag, "Must set data source type");
		//   19   34:iload_1         
		//   20   35:ldc1            #65  <String "Must set data source type">
		//   21   37:invokestatic    #63  <Method void zzac.zza(boolean, Object)>
			return new DataSource(this);
		//   22   40:new             #6   <Class DataSource>
		//   23   43:dup             
		//   24   44:aload_0         
		//   25   45:aconst_null     
		//   26   46:invokespecial   #68  <Method void DataSource(DataSource$Builder, DataSource$1)>
		//   27   49:areturn         
		}

		public Builder setAppPackageName(Context context)
		{
			return setAppPackageName(context.getPackageName());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #76  <Method String Context.getPackageName()>
		//    3    5:invokevirtual   #79  <Method DataSource$Builder setAppPackageName(String)>
		//    4    8:areturn         
		}

		public Builder setAppPackageName(String s)
		{
			zzaSL = com.google.android.gms.fitness.data.zzb.zzdV(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #85  <Method zzb zzb.zzdV(String)>
		//    3    5:putfield        #49  <Field zzb zzaSL>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public transient Builder setDataQualityStandards(int ai[])
		{
			zzaSN = ai;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field int[] zzaSN>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDataType(DataType datatype)
		{
			zzaSg = datatype;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field DataType zzaSg>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDevice(Device device)
		{
			zzaSK = device;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Device zzaSK>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setName(String s)
		{
			name = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field String name>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setStreamName(String s)
		{
			boolean flag;
			if(s != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          9
				flag = true;
		//    2    4:iconst_1        
		//    3    5:istore_2        
			else
		//*   4    6:goto            11
				flag = false;
		//    5    9:iconst_0        
		//    6   10:istore_2        
			zzac.zzb(flag, "Must specify a valid stream name");
		//    7   11:iload_2         
		//    8   12:ldc1            #95  <String "Must specify a valid stream name">
		//    9   14:invokestatic    #97  <Method void zzac.zzb(boolean, Object)>
			zzaSM = s;
		//   10   17:aload_0         
		//   11   18:aload_1         
		//   12   19:putfield        #30  <Field String zzaSM>
			return this;
		//   13   22:aload_0         
		//   14   23:areturn         
		}

		public Builder setType(int i)
		{
			type = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #26  <Field int type>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String name;
		private int type;
		private Device zzaSK;
		private zzb zzaSL;
		private String zzaSM;
		private int zzaSN[];
		private DataType zzaSg;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			type = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #26  <Field int type>
			zzaSM = "";
		//    5    9:aload_0         
		//    6   10:ldc1            #28  <String "">
		//    7   12:putfield        #30  <Field String zzaSM>
		//    8   15:return          
		}
	}


	DataSource(int i, DataType datatype, String s, int j, Device device, zzb zzb1, String s1, 
			int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #68  <Field int versionCode>
		zzaSg = datatype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #70  <Field DataType zzaSg>
		type = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #72  <Field int type>
		name = s;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #74  <Field String name>
		zzaSK = device;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #76  <Field Device zzaSK>
		zzaSL = zzb1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #78  <Field zzb zzaSL>
		zzaSM = s1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #80  <Field String zzaSM>
		zzaSO = zzCj();
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:invokespecial   #84  <Method String zzCj()>
	//   26   48:putfield        #86  <Field String zzaSO>
		if(ai == null)
	//*  27   51:aload           8
	//*  28   53:ifnull          59
	//*  29   56:goto            64
			ai = zzaSJ;
	//   30   59:getstatic       #56  <Field int[] zzaSJ>
	//   31   62:astore          8
		zzaSN = ai;
	//   32   64:aload_0         
	//   33   65:aload           8
	//   34   67:putfield        #88  <Field int[] zzaSN>
	//   35   70:return          
	}

	private DataSource(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void zza()>
		versionCode = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #68  <Field int versionCode>
		zzaSg = com.google.android.gms.fitness.data.Builder.zza(builder);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #93  <Method DataType com.google.android.gms.fitness.data.DataSource$Builder.zza(DataSource$Builder)>
	//    8   14:putfield        #70  <Field DataType zzaSg>
		type = Builder.zzb(builder);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #97  <Method int DataSource$Builder.zzb(DataSource$Builder)>
	//   12   22:putfield        #72  <Field int type>
		name = Builder.zzc(builder);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #101 <Method String DataSource$Builder.zzc(DataSource$Builder)>
	//   16   30:putfield        #74  <Field String name>
		zzaSK = com.google.android.gms.fitness.data.Builder.zzd(builder);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokestatic    #105 <Method Device com.google.android.gms.fitness.data.DataSource$Builder.zzd(DataSource$Builder)>
	//   20   38:putfield        #76  <Field Device zzaSK>
		zzaSL = Builder.zze(builder);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokestatic    #109 <Method zzb DataSource$Builder.zze(DataSource$Builder)>
	//   24   46:putfield        #78  <Field zzb zzaSL>
		zzaSM = Builder.zzf(builder);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:invokestatic    #112 <Method String DataSource$Builder.zzf(DataSource$Builder)>
	//   28   54:putfield        #80  <Field String zzaSM>
		zzaSO = zzCj();
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:invokespecial   #84  <Method String zzCj()>
	//   32   62:putfield        #86  <Field String zzaSO>
		zzaSN = Builder.zzg(builder);
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokestatic    #116 <Method int[] DataSource$Builder.zzg(DataSource$Builder)>
	//   36   70:putfield        #88  <Field int[] zzaSN>
	//   37   73:return          
	}


	public static DataSource extract(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return (DataSource)zzd.zza(intent, "vnd.google.fitness.data_source", CREATOR);
	//    4    6:aload_0         
	//    5    7:ldc1            #35  <String "vnd.google.fitness.data_source">
	//    6    9:getstatic       #63  <Field android.os.Parcelable$Creator CREATOR>
	//    7   12:invokestatic    #126 <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable zzd.zza(Intent, String, android.os.Parcelable$Creator)>
	//    8   15:checkcast       #2   <Class DataSource>
	//    9   18:areturn         
	}

	private String getTypeString()
	{
		switch(type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field int type>
		{
	//*   2    4:tableswitch     0 3: default 36
	//	               0 39
	//	               1 42
	//	               2 45
	//	               3 48
	//*   3   36:goto            51
		case 0: // '\0'
			return "raw";
	//    4   39:ldc1            #129 <String "raw">
	//    5   41:areturn         

		case 1: // '\001'
			return "derived";
	//    6   42:ldc1            #131 <String "derived">
	//    7   44:areturn         

		case 2: // '\002'
			return "cleaned";
	//    8   45:ldc1            #133 <String "cleaned">
	//    9   47:areturn         

		case 3: // '\003'
			return "converted";
	//   10   48:ldc1            #135 <String "converted">
	//   11   50:areturn         
		}
		return "derived";
	//   12   51:ldc1            #131 <String "derived">
	//   13   53:areturn         
	}

	private String zzCj()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #137 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(getTypeString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #140 <Method String getTypeString()>
	//    7   13:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(":").append(zzaSg.getName());
	//    9   17:aload_1         
	//   10   18:ldc1            #146 <String ":">
	//   11   20:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:aload_0         
	//   13   24:getfield        #70  <Field DataType zzaSg>
	//   14   27:invokevirtual   #151 <Method String DataType.getName()>
	//   15   30:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		if(zzaSL != null)
	//*  17   34:aload_0         
	//*  18   35:getfield        #78  <Field zzb zzaSL>
	//*  19   38:ifnull          58
			stringbuilder.append(":").append(zzaSL.getPackageName());
	//   20   41:aload_1         
	//   21   42:ldc1            #146 <String ":">
	//   22   44:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:aload_0         
	//   24   48:getfield        #78  <Field zzb zzaSL>
	//   25   51:invokevirtual   #156 <Method String zzb.getPackageName()>
	//   26   54:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		if(zzaSK != null)
	//*  28   58:aload_0         
	//*  29   59:getfield        #76  <Field Device zzaSK>
	//*  30   62:ifnull          82
			stringbuilder.append(":").append(zzaSK.getStreamIdentifier());
	//   31   65:aload_1         
	//   32   66:ldc1            #146 <String ":">
	//   33   68:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   34   71:aload_0         
	//   35   72:getfield        #76  <Field Device zzaSK>
	//   36   75:invokevirtual   #161 <Method String Device.getStreamIdentifier()>
	//   37   78:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:pop             
		if(zzaSM != null)
	//*  39   82:aload_0         
	//*  40   83:getfield        #80  <Field String zzaSM>
	//*  41   86:ifnull          103
			stringbuilder.append(":").append(zzaSM);
	//   42   89:aload_1         
	//   43   90:ldc1            #146 <String ":">
	//   44   92:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:aload_0         
	//   46   96:getfield        #80  <Field String zzaSM>
	//   47   99:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
		return stringbuilder.toString();
	//   49  103:aload_1         
	//   50  104:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   51  107:areturn         
	}

	private boolean zza(DataSource datasource)
	{
		return zzaSO.equals(((Object) (datasource.zzaSO)));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String zzaSO>
	//    2    4:aload_1         
	//    3    5:getfield        #86  <Field String zzaSO>
	//    4    8:invokevirtual   #171 <Method boolean String.equals(Object)>
	//    5   11:ireturn         
	}

	private static String zzgC(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 35
	//	               1 38
	//	               2 41
	//	               3 44
	//*   2   32:goto            47
		case 0: // '\0'
			return "r";
	//    3   35:ldc1            #175 <String "r">
	//    4   37:areturn         

		case 1: // '\001'
			return "d";
	//    5   38:ldc1            #177 <String "d">
	//    6   40:areturn         

		case 2: // '\002'
			return "c";
	//    7   41:ldc1            #179 <String "c">
	//    8   43:areturn         

		case 3: // '\003'
			return "v";
	//    9   44:ldc1            #181 <String "v">
	//   10   46:areturn         
		}
		return "?";
	//   11   47:ldc1            #183 <String "?">
	//   12   49:areturn         
	}

	public static String zzgD(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 9: default 52
	//	               1 55
	//	               2 58
	//	               3 61
	//	               4 64
	//	               5 67
	//	               6 70
	//	               7 73
	//	               8 76
	//	               9 79
	//*   2   52:goto            82
		case 1: // '\001'
			return "blood_pressure_esh2002";
	//    3   55:ldc1            #186 <String "blood_pressure_esh2002">
	//    4   57:areturn         

		case 2: // '\002'
			return "blood_pressure_esh2010";
	//    5   58:ldc1            #188 <String "blood_pressure_esh2010">
	//    6   60:areturn         

		case 3: // '\003'
			return "blood_pressure_aami";
	//    7   61:ldc1            #190 <String "blood_pressure_aami">
	//    8   63:areturn         

		case 4: // '\004'
			return "blood_pressure_bhs_a_a";
	//    9   64:ldc1            #192 <String "blood_pressure_bhs_a_a">
	//   10   66:areturn         

		case 5: // '\005'
			return "blood_pressure_bhs_a_b";
	//   11   67:ldc1            #194 <String "blood_pressure_bhs_a_b">
	//   12   69:areturn         

		case 6: // '\006'
			return "blood_pressure_bhs_b_a";
	//   13   70:ldc1            #196 <String "blood_pressure_bhs_b_a">
	//   14   72:areturn         

		case 7: // '\007'
			return "blood_pressure_bhs_b_b";
	//   15   73:ldc1            #198 <String "blood_pressure_bhs_b_b">
	//   16   75:areturn         

		case 8: // '\b'
			return "blood_glucose_iso151972003";
	//   17   76:ldc1            #200 <String "blood_glucose_iso151972003">
	//   18   78:areturn         

		case 9: // '\t'
			return "blood_glucose_iso151972013";
	//   19   79:ldc1            #202 <String "blood_glucose_iso151972013">
	//   20   81:areturn         
		}
		return "unknown";
	//   21   82:ldc1            #204 <String "unknown">
	//   22   84:areturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DataSource) && zza((DataSource)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataSource>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataSource>
	//    9   17:invokespecial   #206 <Method boolean zza(DataSource)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public String getAppPackageName()
	{
		if(zzaSL == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field zzb zzaSL>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaSL.getPackageName();
	//    5    9:aload_0         
	//    6   10:getfield        #78  <Field zzb zzaSL>
	//    7   13:invokevirtual   #156 <Method String zzb.getPackageName()>
	//    8   16:areturn         
	}

	public int[] getDataQualityStandards()
	{
		return zzaSN;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int[] zzaSN>
	//    2    4:areturn         
	}

	public DataType getDataType()
	{
		return zzaSg;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field DataType zzaSg>
	//    2    4:areturn         
	}

	public Device getDevice()
	{
		return zzaSK;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Device zzaSK>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String name>
	//    2    4:areturn         
	}

	public String getStreamIdentifier()
	{
		return zzaSO;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String zzaSO>
	//    2    4:areturn         
	}

	public String getStreamName()
	{
		return zzaSM;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String zzaSM>
	//    2    4:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int type>
	//    2    4:ireturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaSO.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String zzaSO>
	//    2    4:invokevirtual   #220 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toDebugString()
	{
		String s4 = String.valueOf(((Object) (zzgC(type))));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int type>
	//    2    4:invokestatic    #223 <Method String zzgC(int)>
	//    3    7:invokestatic    #227 <Method String String.valueOf(Object)>
	//    4   10:astore          8
		String s5 = String.valueOf(((Object) (zzaSg.zzCk())));
	//    5   12:aload_0         
	//    6   13:getfield        #70  <Field DataType zzaSg>
	//    7   16:invokevirtual   #230 <Method String DataType.zzCk()>
	//    8   19:invokestatic    #227 <Method String String.valueOf(Object)>
	//    9   22:astore          9
		String s;
		if(zzaSL == null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #78  <Field zzb zzaSL>
	//*  12   28:ifnonnull       38
			s = "";
	//   13   31:ldc1            #232 <String "">
	//   14   33:astore          5
		else
	//*  15   35:goto            101
		if(zzaSL.equals(((Object) (zzb.zzaSo))))
	//*  16   38:aload_0         
	//*  17   39:getfield        #78  <Field zzb zzaSL>
	//*  18   42:getstatic       #235 <Field zzb zzb.zzaSo>
	//*  19   45:invokevirtual   #236 <Method boolean zzb.equals(Object)>
	//*  20   48:ifeq            58
		{
			s = ":gms";
	//   21   51:ldc1            #238 <String ":gms">
	//   22   53:astore          5
		} else
	//*  23   55:goto            101
		{
			s = String.valueOf(((Object) (zzaSL.getPackageName())));
	//   24   58:aload_0         
	//   25   59:getfield        #78  <Field zzb zzaSL>
	//   26   62:invokevirtual   #156 <Method String zzb.getPackageName()>
	//   27   65:invokestatic    #227 <Method String String.valueOf(Object)>
	//   28   68:astore          5
			if(s.length() != 0)
	//*  29   70:aload           5
	//*  30   72:invokevirtual   #241 <Method int String.length()>
	//*  31   75:ifeq            90
				s = ":".concat(s);
	//   32   78:ldc1            #146 <String ":">
	//   33   80:aload           5
	//   34   82:invokevirtual   #245 <Method String String.concat(String)>
	//   35   85:astore          5
			else
	//*  36   87:goto            101
				s = new String(":");
	//   37   90:new             #167 <Class String>
	//   38   93:dup             
	//   39   94:ldc1            #146 <String ":">
	//   40   96:invokespecial   #248 <Method void String(String)>
	//   41   99:astore          5
		}
		String s3;
		if(zzaSK != null)
	//*  42  101:aload_0         
	//*  43  102:getfield        #76  <Field Device zzaSK>
	//*  44  105:ifnull          188
		{
			String s1 = String.valueOf(((Object) (zzaSK.getModel())));
	//   45  108:aload_0         
	//   46  109:getfield        #76  <Field Device zzaSK>
	//   47  112:invokevirtual   #251 <Method String Device.getModel()>
	//   48  115:invokestatic    #227 <Method String String.valueOf(Object)>
	//   49  118:astore          6
			s3 = String.valueOf(((Object) (zzaSK.getUid())));
	//   50  120:aload_0         
	//   51  121:getfield        #76  <Field Device zzaSK>
	//   52  124:invokevirtual   #254 <Method String Device.getUid()>
	//   53  127:invokestatic    #227 <Method String String.valueOf(Object)>
	//   54  130:astore          7
			int i = String.valueOf(((Object) (s1))).length();
	//   55  132:aload           6
	//   56  134:invokestatic    #227 <Method String String.valueOf(Object)>
	//   57  137:invokevirtual   #241 <Method int String.length()>
	//   58  140:istore_1        
			s3 = (new StringBuilder(String.valueOf(((Object) (s3))).length() + (i + 2))).append(":").append(s1).append(":").append(s3).toString();
	//   59  141:new             #137 <Class StringBuilder>
	//   60  144:dup             
	//   61  145:aload           7
	//   62  147:invokestatic    #227 <Method String String.valueOf(Object)>
	//   63  150:invokevirtual   #241 <Method int String.length()>
	//   64  153:iload_1         
	//   65  154:iconst_2        
	//   66  155:iadd            
	//   67  156:iadd            
	//   68  157:invokespecial   #257 <Method void StringBuilder(int)>
	//   69  160:ldc1            #146 <String ":">
	//   70  162:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   71  165:aload           6
	//   72  167:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   73  170:ldc1            #146 <String ":">
	//   74  172:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   75  175:aload           7
	//   76  177:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   77  180:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   78  183:astore          7
		} else
	//*  79  185:goto            192
		{
			s3 = "";
	//   80  188:ldc1            #232 <String "">
	//   81  190:astore          7
		}
		String s2;
		if(zzaSM != null)
	//*  82  192:aload_0         
	//*  83  193:getfield        #80  <Field String zzaSM>
	//*  84  196:ifnull          242
		{
			s2 = String.valueOf(((Object) (zzaSM)));
	//   85  199:aload_0         
	//   86  200:getfield        #80  <Field String zzaSM>
	//   87  203:invokestatic    #227 <Method String String.valueOf(Object)>
	//   88  206:astore          6
			if(s2.length() != 0)
	//*  89  208:aload           6
	//*  90  210:invokevirtual   #241 <Method int String.length()>
	//*  91  213:ifeq            228
				s2 = ":".concat(s2);
	//   92  216:ldc1            #146 <String ":">
	//   93  218:aload           6
	//   94  220:invokevirtual   #245 <Method String String.concat(String)>
	//   95  223:astore          6
			else
	//*  96  225:goto            246
				s2 = new String(":");
	//   97  228:new             #167 <Class String>
	//   98  231:dup             
	//   99  232:ldc1            #146 <String ":">
	//  100  234:invokespecial   #248 <Method void String(String)>
	//  101  237:astore          6
		} else
	//* 102  239:goto            246
		{
			s2 = "";
	//  103  242:ldc1            #232 <String "">
	//  104  244:astore          6
		}
		int j = String.valueOf(((Object) (s4))).length();
	//  105  246:aload           8
	//  106  248:invokestatic    #227 <Method String String.valueOf(Object)>
	//  107  251:invokevirtual   #241 <Method int String.length()>
	//  108  254:istore_1        
		int k = String.valueOf(((Object) (s5))).length();
	//  109  255:aload           9
	//  110  257:invokestatic    #227 <Method String String.valueOf(Object)>
	//  111  260:invokevirtual   #241 <Method int String.length()>
	//  112  263:istore_2        
		int l = String.valueOf(((Object) (s))).length();
	//  113  264:aload           5
	//  114  266:invokestatic    #227 <Method String String.valueOf(Object)>
	//  115  269:invokevirtual   #241 <Method int String.length()>
	//  116  272:istore_3        
		int i1 = String.valueOf(((Object) (s3))).length();
	//  117  273:aload           7
	//  118  275:invokestatic    #227 <Method String String.valueOf(Object)>
	//  119  278:invokevirtual   #241 <Method int String.length()>
	//  120  281:istore          4
		return (new StringBuilder(String.valueOf(((Object) (s2))).length() + (j + 1 + k + l + i1))).append(s4).append(":").append(s5).append(s).append(s3).append(s2).toString();
	//  121  283:new             #137 <Class StringBuilder>
	//  122  286:dup             
	//  123  287:aload           6
	//  124  289:invokestatic    #227 <Method String String.valueOf(Object)>
	//  125  292:invokevirtual   #241 <Method int String.length()>
	//  126  295:iload_1         
	//  127  296:iconst_1        
	//  128  297:iadd            
	//  129  298:iload_2         
	//  130  299:iadd            
	//  131  300:iload_3         
	//  132  301:iadd            
	//  133  302:iload           4
	//  134  304:iadd            
	//  135  305:iadd            
	//  136  306:invokespecial   #257 <Method void StringBuilder(int)>
	//  137  309:aload           8
	//  138  311:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  139  314:ldc1            #146 <String ":">
	//  140  316:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  141  319:aload           9
	//  142  321:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  143  324:aload           5
	//  144  326:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  145  329:aload           7
	//  146  331:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  147  334:aload           6
	//  148  336:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  149  339:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  150  342:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("DataSource{");
	//    0    0:new             #137 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #259 <String "DataSource{">
	//    3    7:invokespecial   #260 <Method void StringBuilder(String)>
	//    4   10:astore_1        
		stringbuilder.append(getTypeString());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokespecial   #140 <Method String getTypeString()>
	//    8   16:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		if(name != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #74  <Field String name>
	//*  12   24:ifnull          41
			stringbuilder.append(":").append(name);
	//   13   27:aload_1         
	//   14   28:ldc1            #146 <String ":">
	//   15   30:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_0         
	//   17   34:getfield        #74  <Field String name>
	//   18   37:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		if(zzaSL != null)
	//*  20   41:aload_0         
	//*  21   42:getfield        #78  <Field zzb zzaSL>
	//*  22   45:ifnull          62
			stringbuilder.append(":").append(((Object) (zzaSL)));
	//   23   48:aload_1         
	//   24   49:ldc1            #146 <String ":">
	//   25   51:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:aload_0         
	//   27   55:getfield        #78  <Field zzb zzaSL>
	//   28   58:invokevirtual   #263 <Method StringBuilder StringBuilder.append(Object)>
	//   29   61:pop             
		if(zzaSK != null)
	//*  30   62:aload_0         
	//*  31   63:getfield        #76  <Field Device zzaSK>
	//*  32   66:ifnull          83
			stringbuilder.append(":").append(((Object) (zzaSK)));
	//   33   69:aload_1         
	//   34   70:ldc1            #146 <String ":">
	//   35   72:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   36   75:aload_0         
	//   37   76:getfield        #76  <Field Device zzaSK>
	//   38   79:invokevirtual   #263 <Method StringBuilder StringBuilder.append(Object)>
	//   39   82:pop             
		if(zzaSM != null)
	//*  40   83:aload_0         
	//*  41   84:getfield        #80  <Field String zzaSM>
	//*  42   87:ifnull          104
			stringbuilder.append(":").append(zzaSM);
	//   43   90:aload_1         
	//   44   91:ldc1            #146 <String ":">
	//   45   93:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   46   96:aload_0         
	//   47   97:getfield        #80  <Field String zzaSM>
	//   48  100:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   49  103:pop             
		stringbuilder.append(":").append(((Object) (zzaSg)));
	//   50  104:aload_1         
	//   51  105:ldc1            #146 <String ":">
	//   52  107:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   53  110:aload_0         
	//   54  111:getfield        #70  <Field DataType zzaSg>
	//   55  114:invokevirtual   #263 <Method StringBuilder StringBuilder.append(Object)>
	//   56  117:pop             
		return stringbuilder.append("}").toString();
	//   57  118:aload_1         
	//   58  119:ldc2            #265 <String "}">
	//   59  122:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   60  125:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   61  128:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzj.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #270 <Method void com.google.android.gms.fitness.data.zzj.zza(DataSource, Parcel, int)>
	//    4    6:return          
	}

	public zzb zzCi()
	{
		return zzaSL;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field zzb zzaSL>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzj();
	public static final int DATA_QUALITY_BLOOD_GLUCOSE_ISO151972003 = 8;
	public static final int DATA_QUALITY_BLOOD_GLUCOSE_ISO151972013 = 9;
	public static final int DATA_QUALITY_BLOOD_PRESSURE_AAMI = 3;
	public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_A_A = 4;
	public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_A_B = 5;
	public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_B_A = 6;
	public static final int DATA_QUALITY_BLOOD_PRESSURE_BHS_B_B = 7;
	public static final int DATA_QUALITY_BLOOD_PRESSURE_ESH2002 = 1;
	public static final int DATA_QUALITY_BLOOD_PRESSURE_ESH2010 = 2;
	public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
	public static final int TYPE_DERIVED = 1;
	public static final int TYPE_RAW = 0;
	private static final int zzaSJ[] = new int[0];
	private final String name;
	private final int type;
	private final int versionCode;
	private final Device zzaSK;
	private final zzb zzaSL;
	private final String zzaSM;
	private final int zzaSN[];
	private final String zzaSO;
	private final DataType zzaSg;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #56  <Field int[] zzaSJ>
	//    3    6:new             #58  <Class zzj>
	//    4    9:dup             
	//    5   10:invokespecial   #61  <Method void zzj()>
	//    6   13:putstatic       #63  <Field android.os.Parcelable$Creator CREATOR>
	//*   7   16:return          
	}
}
