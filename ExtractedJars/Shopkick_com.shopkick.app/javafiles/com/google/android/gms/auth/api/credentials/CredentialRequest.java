// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			zzg, CredentialPickerConfig, zzf

public final class CredentialRequest extends AbstractSafeParcelable
{
	public static final class Builder
	{

		static boolean zzc(Builder builder)
		{
			return builder.zzz;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field boolean zzz>
		//    2    4:ireturn         
		}

		static String[] zzd(Builder builder)
		{
			return builder.zzaa;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String[] zzaa>
		//    2    4:areturn         
		}

		static CredentialPickerConfig zze(Builder builder)
		{
			return builder.zzab;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field CredentialPickerConfig zzab>
		//    2    4:areturn         
		}

		static CredentialPickerConfig zzf(Builder builder)
		{
			return builder.zzac;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field CredentialPickerConfig zzac>
		//    2    4:areturn         
		}

		static boolean zzg(Builder builder)
		{
			return builder.zzad;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field boolean zzad>
		//    2    4:ireturn         
		}

		static String zzh(Builder builder)
		{
			return builder.zzae;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String zzae>
		//    2    4:areturn         
		}

		static String zzi(Builder builder)
		{
			return builder.zzaf;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field String zzaf>
		//    2    4:areturn         
		}

		public final CredentialRequest build()
		{
			if(zzaa == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field String[] zzaa>
		//*   2    4:ifnonnull       15
				zzaa = new String[0];
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:anewarray       String[]
		//    6   12:putfield        #39  <Field String[] zzaa>
			if(!zzz && zzaa.length == 0)
		//*   7   15:aload_0         
		//*   8   16:getfield        #35  <Field boolean zzz>
		//*   9   19:ifne            43
		//*  10   22:aload_0         
		//*  11   23:getfield        #39  <Field String[] zzaa>
		//*  12   26:arraylength     
		//*  13   27:ifeq            33
		//*  14   30:goto            43
				throw new IllegalStateException("At least one authentication method must be specified");
		//   15   33:new             #58  <Class IllegalStateException>
		//   16   36:dup             
		//   17   37:ldc1            #60  <String "At least one authentication method must be specified">
		//   18   39:invokespecial   #63  <Method void IllegalStateException(String)>
		//   19   42:athrow          
			else
				return new CredentialRequest(this, ((zzf) (null)));
		//   20   43:new             #6   <Class CredentialRequest>
		//   21   46:dup             
		//   22   47:aload_0         
		//   23   48:aconst_null     
		//   24   49:invokespecial   #66  <Method void CredentialRequest(CredentialRequest$Builder, zzf)>
		//   25   52:areturn         
		}

		public final transient Builder setAccountTypes(String as[])
		{
			String as1[] = as;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(as == null)
		//*   2    2:aload_1         
		//*   3    3:ifnonnull       11
				as1 = new String[0];
		//    4    6:iconst_0        
		//    5    7:anewarray       String[]
		//    6   10:astore_2        
			zzaa = as1;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #39  <Field String[] zzaa>
			return this;
		//   10   16:aload_0         
		//   11   17:areturn         
		}

		public final Builder setCredentialHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
		{
			zzac = credentialpickerconfig;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field CredentialPickerConfig zzac>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setCredentialPickerConfig(CredentialPickerConfig credentialpickerconfig)
		{
			zzab = credentialpickerconfig;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field CredentialPickerConfig zzab>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setIdTokenNonce(String s)
		{
			zzaf = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field String zzaf>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setIdTokenRequested(boolean flag)
		{
			zzad = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #26  <Field boolean zzad>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setPasswordLoginSupported(boolean flag)
		{
			zzz = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #35  <Field boolean zzz>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setServerClientId(String s)
		{
			zzae = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field String zzae>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setSupportsPasswordLogin(boolean flag)
		{
			return setPasswordLoginSupported(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #82  <Method CredentialRequest$Builder setPasswordLoginSupported(boolean)>
		//    3    5:areturn         
		}

		private String zzaa[];
		private CredentialPickerConfig zzab;
		private CredentialPickerConfig zzac;
		private boolean zzad;
		private String zzae;
		private String zzaf;
		private boolean zzag;
		private boolean zzz;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			zzad = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #26  <Field boolean zzad>
			zzag = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #28  <Field boolean zzag>
			zzae = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #30  <Field String zzae>
		//   11   19:return          
		}
	}


	CredentialRequest(int i, boolean flag, String as[], CredentialPickerConfig credentialpickerconfig, CredentialPickerConfig credentialpickerconfig1, boolean flag1, String s, 
			String s1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void AbstractSafeParcelable()>
		zzu = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #63  <Field int zzu>
		zzz = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #65  <Field boolean zzz>
		zzaa = (String[])Preconditions.checkNotNull(((Object) (as)));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #71  <Method Object Preconditions.checkNotNull(Object)>
	//   11   19:checkcast       #72  <Class String[]>
	//   12   22:putfield        #74  <Field String[] zzaa>
		as = ((String []) (credentialpickerconfig));
	//   13   25:aload           4
	//   14   27:astore_3        
		if(credentialpickerconfig == null)
	//*  15   28:aload           4
	//*  16   30:ifnonnull       44
			as = ((String []) ((new CredentialPickerConfig.Builder()).build()));
	//   17   33:new             #76  <Class CredentialPickerConfig$Builder>
	//   18   36:dup             
	//   19   37:invokespecial   #77  <Method void CredentialPickerConfig$Builder()>
	//   20   40:invokevirtual   #81  <Method CredentialPickerConfig CredentialPickerConfig$Builder.build()>
	//   21   43:astore_3        
		zzab = ((CredentialPickerConfig) (as));
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:putfield        #83  <Field CredentialPickerConfig zzab>
		as = ((String []) (credentialpickerconfig1));
	//   25   49:aload           5
	//   26   51:astore_3        
		if(credentialpickerconfig1 == null)
	//*  27   52:aload           5
	//*  28   54:ifnonnull       68
			as = ((String []) ((new CredentialPickerConfig.Builder()).build()));
	//   29   57:new             #76  <Class CredentialPickerConfig$Builder>
	//   30   60:dup             
	//   31   61:invokespecial   #77  <Method void CredentialPickerConfig$Builder()>
	//   32   64:invokevirtual   #81  <Method CredentialPickerConfig CredentialPickerConfig$Builder.build()>
	//   33   67:astore_3        
		zzac = ((CredentialPickerConfig) (as));
	//   34   68:aload_0         
	//   35   69:aload_3         
	//   36   70:putfield        #85  <Field CredentialPickerConfig zzac>
		if(i < 3)
	//*  37   73:iload_1         
	//*  38   74:iconst_3        
	//*  39   75:icmpge          96
		{
			zzad = true;
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:putfield        #87  <Field boolean zzad>
			zzae = null;
	//   43   83:aload_0         
	//   44   84:aconst_null     
	//   45   85:putfield        #89  <Field String zzae>
			zzaf = null;
	//   46   88:aload_0         
	//   47   89:aconst_null     
	//   48   90:putfield        #91  <Field String zzaf>
		} else
	//*  49   93:goto            114
		{
			zzad = flag1;
	//   50   96:aload_0         
	//   51   97:iload           6
	//   52   99:putfield        #87  <Field boolean zzad>
			zzae = s;
	//   53  102:aload_0         
	//   54  103:aload           7
	//   55  105:putfield        #89  <Field String zzae>
			zzaf = s1;
	//   56  108:aload_0         
	//   57  109:aload           8
	//   58  111:putfield        #91  <Field String zzaf>
		}
		zzag = flag2;
	//   59  114:aload_0         
	//   60  115:iload           9
	//   61  117:putfield        #93  <Field boolean zzag>
	//   62  120:return          
	}

	private CredentialRequest(Builder builder)
	{
		this(4, Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder), false);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_1         
	//    3    3:invokestatic    #100 <Method boolean CredentialRequest$Builder.zzc(CredentialRequest$Builder)>
	//    4    6:aload_1         
	//    5    7:invokestatic    #104 <Method String[] CredentialRequest$Builder.zzd(CredentialRequest$Builder)>
	//    6   10:aload_1         
	//    7   11:invokestatic    #108 <Method CredentialPickerConfig CredentialRequest$Builder.zze(CredentialRequest$Builder)>
	//    8   14:aload_1         
	//    9   15:invokestatic    #111 <Method CredentialPickerConfig CredentialRequest$Builder.zzf(CredentialRequest$Builder)>
	//   10   18:aload_1         
	//   11   19:invokestatic    #114 <Method boolean CredentialRequest$Builder.zzg(CredentialRequest$Builder)>
	//   12   22:aload_1         
	//   13   23:invokestatic    #118 <Method String CredentialRequest$Builder.zzh(CredentialRequest$Builder)>
	//   14   26:aload_1         
	//   15   27:invokestatic    #121 <Method String CredentialRequest$Builder.zzi(CredentialRequest$Builder)>
	//   16   30:iconst_0        
	//   17   31:invokespecial   #123 <Method void CredentialRequest(int, boolean, String[], CredentialPickerConfig, CredentialPickerConfig, boolean, String, String, boolean)>
	//   18   34:return          
	}

	CredentialRequest(Builder builder, zzf zzf)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void CredentialRequest(CredentialRequest$Builder)>
	//    3    5:return          
	}

	public final String[] getAccountTypes()
	{
		return zzaa;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String[] zzaa>
	//    2    4:areturn         
	}

	public final Set getAccountTypesSet()
	{
		return ((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (zzaa))))))));
	//    0    0:new             #132 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field String[] zzaa>
	//    4    8:invokestatic    #138 <Method java.util.List Arrays.asList(Object[])>
	//    5   11:invokespecial   #141 <Method void HashSet(java.util.Collection)>
	//    6   14:areturn         
	}

	public final CredentialPickerConfig getCredentialHintPickerConfig()
	{
		return zzac;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field CredentialPickerConfig zzac>
	//    2    4:areturn         
	}

	public final CredentialPickerConfig getCredentialPickerConfig()
	{
		return zzab;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field CredentialPickerConfig zzab>
	//    2    4:areturn         
	}

	public final String getIdTokenNonce()
	{
		return zzaf;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String zzaf>
	//    2    4:areturn         
	}

	public final String getServerClientId()
	{
		return zzae;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String zzae>
	//    2    4:areturn         
	}

	public final boolean getSupportsPasswordLogin()
	{
		return isPasswordLoginSupported();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method boolean isPasswordLoginSupported()>
	//    2    4:ireturn         
	}

	public final boolean isIdTokenRequested()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean zzad>
	//    2    4:ireturn         
	}

	public final boolean isPasswordLoginSupported()
	{
		return zzz;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean zzz>
	//    2    4:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #159 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeBoolean(parcel, 1, isPasswordLoginSupported());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #150 <Method boolean isPasswordLoginSupported()>
	//    7   11:invokestatic    #163 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringArray(parcel, 2, getAccountTypes(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #165 <Method String[] getAccountTypes()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #169 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (getCredentialPickerConfig())), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #171 <Method CredentialPickerConfig getCredentialPickerConfig()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #175 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 4, ((android.os.Parcelable) (getCredentialHintPickerConfig())), i, false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #177 <Method CredentialPickerConfig getCredentialHintPickerConfig()>
	//   25   41:iload_2         
	//   26   42:iconst_0        
	//   27   43:invokestatic    #175 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
	//   28   46:aload_1         
	//   29   47:iconst_5        
	//   30   48:aload_0         
	//   31   49:invokevirtual   #179 <Method boolean isIdTokenRequested()>
	//   32   52:invokestatic    #163 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
	//   33   55:aload_1         
	//   34   56:bipush          6
	//   35   58:aload_0         
	//   36   59:invokevirtual   #181 <Method String getServerClientId()>
	//   37   62:iconst_0        
	//   38   63:invokestatic    #185 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
	//   39   66:aload_1         
	//   40   67:bipush          7
	//   41   69:aload_0         
	//   42   70:invokevirtual   #187 <Method String getIdTokenNonce()>
	//   43   73:iconst_0        
	//   44   74:invokestatic    #185 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, zzu);
	//   45   77:aload_1         
	//   46   78:sipush          1000
	//   47   81:aload_0         
	//   48   82:getfield        #63  <Field int zzu>
	//   49   85:invokestatic    #191 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzag);
	//   50   88:aload_1         
	//   51   89:bipush          8
	//   52   91:aload_0         
	//   53   92:getfield        #93  <Field boolean zzag>
	//   54   95:invokestatic    #163 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   55   98:aload_1         
	//   56   99:iload_3         
	//   57  100:invokestatic    #194 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   58  103:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzg();
	private final String zzaa[];
	private final CredentialPickerConfig zzab;
	private final CredentialPickerConfig zzac;
	private final boolean zzad;
	private final String zzae;
	private final String zzaf;
	private final boolean zzag;
	private final int zzu;
	private final boolean zzz;

	static 
	{
	//    0    0:new             #51  <Class zzg>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void zzg()>
	//    3    7:putstatic       #56  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
