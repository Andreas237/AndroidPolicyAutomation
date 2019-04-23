// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			zzj, CredentialPickerConfig, zzi

public final class HintRequest extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static final class Builder
	{

		static CredentialPickerConfig zzc(Builder builder)
		{
			return builder.zzah;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field CredentialPickerConfig zzah>
		//    2    4:areturn         
		}

		static boolean zzd(Builder builder)
		{
			return builder.zzai;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean zzai>
		//    2    4:ireturn         
		}

		static boolean zze(Builder builder)
		{
			return builder.zzaj;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field boolean zzaj>
		//    2    4:ireturn         
		}

		static String[] zzf(Builder builder)
		{
			return builder.zzaa;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String[] zzaa>
		//    2    4:areturn         
		}

		static boolean zzg(Builder builder)
		{
			return builder.zzad;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field boolean zzad>
		//    2    4:ireturn         
		}

		static String zzh(Builder builder)
		{
			return builder.zzae;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field String zzae>
		//    2    4:areturn         
		}

		static String zzi(Builder builder)
		{
			return builder.zzaf;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field String zzaf>
		//    2    4:areturn         
		}

		public final HintRequest build()
		{
			if(zzaa == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field String[] zzaa>
		//*   2    4:ifnonnull       15
				zzaa = new String[0];
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:anewarray       String[]
		//    6   12:putfield        #47  <Field String[] zzaa>
			if(!zzai && !zzaj && zzaa.length == 0)
		//*   7   15:aload_0         
		//*   8   16:getfield        #40  <Field boolean zzai>
		//*   9   19:ifne            50
		//*  10   22:aload_0         
		//*  11   23:getfield        #43  <Field boolean zzaj>
		//*  12   26:ifne            50
		//*  13   29:aload_0         
		//*  14   30:getfield        #47  <Field String[] zzaa>
		//*  15   33:arraylength     
		//*  16   34:ifeq            40
		//*  17   37:goto            50
				throw new IllegalStateException("At least one authentication method must be specified");
		//   18   40:new             #60  <Class IllegalStateException>
		//   19   43:dup             
		//   20   44:ldc1            #62  <String "At least one authentication method must be specified">
		//   21   46:invokespecial   #65  <Method void IllegalStateException(String)>
		//   22   49:athrow          
			else
				return new HintRequest(this, ((zzi) (null)));
		//   23   50:new             #6   <Class HintRequest>
		//   24   53:dup             
		//   25   54:aload_0         
		//   26   55:aconst_null     
		//   27   56:invokespecial   #68  <Method void HintRequest(HintRequest$Builder, zzi)>
		//   28   59:areturn         
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
		//    9   13:putfield        #47  <Field String[] zzaa>
			return this;
		//   10   16:aload_0         
		//   11   17:areturn         
		}

		public final Builder setEmailAddressIdentifierSupported(boolean flag)
		{
			zzai = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #40  <Field boolean zzai>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setHintPickerConfig(CredentialPickerConfig credentialpickerconfig)
		{
			zzah = (CredentialPickerConfig)Preconditions.checkNotNull(((Object) (credentialpickerconfig)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #81  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #83  <Class CredentialPickerConfig>
		//    4    8:putfield        #31  <Field CredentialPickerConfig zzah>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public final Builder setIdTokenNonce(String s)
		{
			zzaf = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #55  <Field String zzaf>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setIdTokenRequested(boolean flag)
		{
			zzad = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #33  <Field boolean zzad>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setPhoneNumberIdentifierSupported(boolean flag)
		{
			zzaj = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #43  <Field boolean zzaj>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setServerClientId(String s)
		{
			zzae = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field String zzae>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String zzaa[];
		private boolean zzad;
		private String zzae;
		private String zzaf;
		private CredentialPickerConfig zzah;
		private boolean zzai;
		private boolean zzaj;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			zzah = (new CredentialPickerConfig.Builder()).build();
		//    2    4:aload_0         
		//    3    5:new             #24  <Class CredentialPickerConfig$Builder>
		//    4    8:dup             
		//    5    9:invokespecial   #25  <Method void CredentialPickerConfig$Builder()>
		//    6   12:invokevirtual   #29  <Method CredentialPickerConfig CredentialPickerConfig$Builder.build()>
		//    7   15:putfield        #31  <Field CredentialPickerConfig zzah>
			zzad = false;
		//    8   18:aload_0         
		//    9   19:iconst_0        
		//   10   20:putfield        #33  <Field boolean zzad>
		//   11   23:return          
		}
	}


	HintRequest(int i, CredentialPickerConfig credentialpickerconfig, boolean flag, boolean flag1, String as[], boolean flag2, String s, 
			String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void AbstractSafeParcelable()>
		zzu = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #62  <Field int zzu>
		zzah = (CredentialPickerConfig)Preconditions.checkNotNull(((Object) (credentialpickerconfig)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #68  <Method Object Preconditions.checkNotNull(Object)>
	//    8   14:checkcast       #70  <Class CredentialPickerConfig>
	//    9   17:putfield        #72  <Field CredentialPickerConfig zzah>
		zzai = flag;
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:putfield        #74  <Field boolean zzai>
		zzaj = flag1;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #76  <Field boolean zzaj>
		zzaa = (String[])Preconditions.checkNotNull(((Object) (as)));
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:invokestatic    #68  <Method Object Preconditions.checkNotNull(Object)>
	//   19   37:checkcast       #77  <Class String[]>
	//   20   40:putfield        #79  <Field String[] zzaa>
		if(zzu < 2)
	//*  21   43:aload_0         
	//*  22   44:getfield        #62  <Field int zzu>
	//*  23   47:iconst_2        
	//*  24   48:icmpge          67
		{
			zzad = true;
	//   25   51:aload_0         
	//   26   52:iconst_1        
	//   27   53:putfield        #81  <Field boolean zzad>
			zzae = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #83  <Field String zzae>
			zzaf = null;
	//   31   61:aload_0         
	//   32   62:aconst_null     
	//   33   63:putfield        #85  <Field String zzaf>
			return;
	//   34   66:return          
		} else
		{
			zzad = flag2;
	//   35   67:aload_0         
	//   36   68:iload           6
	//   37   70:putfield        #81  <Field boolean zzad>
			zzae = s;
	//   38   73:aload_0         
	//   39   74:aload           7
	//   40   76:putfield        #83  <Field String zzae>
			zzaf = s1;
	//   41   79:aload_0         
	//   42   80:aload           8
	//   43   82:putfield        #85  <Field String zzaf>
			return;
	//   44   85:return          
		}
	}

	private HintRequest(Builder builder)
	{
		this(2, Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:invokestatic    #92  <Method CredentialPickerConfig HintRequest$Builder.zzc(HintRequest$Builder)>
	//    4    6:aload_1         
	//    5    7:invokestatic    #96  <Method boolean HintRequest$Builder.zzd(HintRequest$Builder)>
	//    6   10:aload_1         
	//    7   11:invokestatic    #99  <Method boolean HintRequest$Builder.zze(HintRequest$Builder)>
	//    8   14:aload_1         
	//    9   15:invokestatic    #103 <Method String[] HintRequest$Builder.zzf(HintRequest$Builder)>
	//   10   18:aload_1         
	//   11   19:invokestatic    #106 <Method boolean HintRequest$Builder.zzg(HintRequest$Builder)>
	//   12   22:aload_1         
	//   13   23:invokestatic    #110 <Method String HintRequest$Builder.zzh(HintRequest$Builder)>
	//   14   26:aload_1         
	//   15   27:invokestatic    #113 <Method String HintRequest$Builder.zzi(HintRequest$Builder)>
	//   16   30:invokespecial   #115 <Method void HintRequest(int, CredentialPickerConfig, boolean, boolean, String[], boolean, String, String)>
	//   17   33:return          
	}

	HintRequest(Builder builder, zzi zzi)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #118 <Method void HintRequest(HintRequest$Builder)>
	//    3    5:return          
	}

	public final String[] getAccountTypes()
	{
		return zzaa;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String[] zzaa>
	//    2    4:areturn         
	}

	public final CredentialPickerConfig getHintPickerConfig()
	{
		return zzah;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field CredentialPickerConfig zzah>
	//    2    4:areturn         
	}

	public final String getIdTokenNonce()
	{
		return zzaf;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String zzaf>
	//    2    4:areturn         
	}

	public final String getServerClientId()
	{
		return zzae;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String zzae>
	//    2    4:areturn         
	}

	public final boolean isEmailAddressIdentifierSupported()
	{
		return zzai;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field boolean zzai>
	//    2    4:ireturn         
	}

	public final boolean isIdTokenRequested()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean zzad>
	//    2    4:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #132 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 1, ((android.os.Parcelable) (getHintPickerConfig())), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #134 <Method CredentialPickerConfig getHintPickerConfig()>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #138 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 2, isEmailAddressIdentifierSupported());
	//   10   16:aload_1         
	//   11   17:iconst_2        
	//   12   18:aload_0         
	//   13   19:invokevirtual   #140 <Method boolean isEmailAddressIdentifierSupported()>
	//   14   22:invokestatic    #144 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 3, zzaj);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #76  <Field boolean zzaj>
	//   19   31:invokestatic    #144 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeStringArray(parcel, 4, getAccountTypes(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #146 <Method String[] getAccountTypes()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #150 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, isIdTokenRequested());
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #152 <Method boolean isIdTokenRequested()>
	//   30   50:invokestatic    #144 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getServerClientId(), false);
	//   31   53:aload_1         
	//   32   54:bipush          6
	//   33   56:aload_0         
	//   34   57:invokevirtual   #154 <Method String getServerClientId()>
	//   35   60:iconst_0        
	//   36   61:invokestatic    #158 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getIdTokenNonce(), false);
	//   37   64:aload_1         
	//   38   65:bipush          7
	//   39   67:aload_0         
	//   40   68:invokevirtual   #160 <Method String getIdTokenNonce()>
	//   41   71:iconst_0        
	//   42   72:invokestatic    #158 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, zzu);
	//   43   75:aload_1         
	//   44   76:sipush          1000
	//   45   79:aload_0         
	//   46   80:getfield        #62  <Field int zzu>
	//   47   83:invokestatic    #164 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   48   86:aload_1         
	//   49   87:iload_3         
	//   50   88:invokestatic    #167 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   51   91:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzj();
	private final String zzaa[];
	private final boolean zzad;
	private final String zzae;
	private final String zzaf;
	private final CredentialPickerConfig zzah;
	private final boolean zzai;
	private final boolean zzaj;
	private final int zzu;

	static 
	{
	//    0    0:new             #50  <Class zzj>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void zzj()>
	//    3    7:putstatic       #55  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
