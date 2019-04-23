// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			zze, zzd

public final class CredentialPickerConfig extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static class Builder
	{

		static boolean zzc(Builder builder)
		{
			return builder.zzv;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field boolean zzv>
		//    2    4:ireturn         
		}

		static boolean zzd(Builder builder)
		{
			return builder.mShowCancelButton;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field boolean mShowCancelButton>
		//    2    4:ireturn         
		}

		static int zze(Builder builder)
		{
			return builder.zzy;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int zzy>
		//    2    4:ireturn         
		}

		public CredentialPickerConfig build()
		{
			return new CredentialPickerConfig(this, ((zzd) (null)));
		//    0    0:new             #6   <Class CredentialPickerConfig>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #33  <Method void CredentialPickerConfig(CredentialPickerConfig$Builder, zzd)>
		//    5    9:areturn         
		}

		public Builder setForNewAccount(boolean flag)
		{
			int i;
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            9
				i = 3;
		//    2    4:iconst_3        
		//    3    5:istore_2        
			else
		//*   4    6:goto            11
				i = 1;
		//    5    9:iconst_1        
		//    6   10:istore_2        
			zzy = i;
		//    7   11:aload_0         
		//    8   12:iload_2         
		//    9   13:putfield        #22  <Field int zzy>
			return this;
		//   10   16:aload_0         
		//   11   17:areturn         
		}

		public Builder setPrompt(int i)
		{
			zzy = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #22  <Field int zzy>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShowAddAccountButton(boolean flag)
		{
			zzv = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #18  <Field boolean zzv>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShowCancelButton(boolean flag)
		{
			mShowCancelButton = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #20  <Field boolean mShowCancelButton>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean mShowCancelButton;
		private boolean zzv;
		private int zzy;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzv = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #18  <Field boolean zzv>
			mShowCancelButton = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #20  <Field boolean mShowCancelButton>
			zzy = 1;
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:putfield        #22  <Field int zzy>
		//   11   19:return          
		}
	}

	public static interface Prompt
		extends Annotation
	{

		public static final int CONTINUE = 1;
		public static final int SIGN_IN = 2;
		public static final int SIGN_UP = 3;
	}


	CredentialPickerConfig(int i, boolean flag, boolean flag1, boolean flag2, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void AbstractSafeParcelable()>
		zzu = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #54  <Field int zzu>
		zzv = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #56  <Field boolean zzv>
		mShowCancelButton = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #58  <Field boolean mShowCancelButton>
		flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
		boolean flag3 = true;
	//   13   21:iconst_1        
	//   14   22:istore          6
		if(i < 2)
	//*  15   24:iload_1         
	//*  16   25:iconst_2        
	//*  17   26:icmpge          51
		{
			zzw = flag2;
	//   18   29:aload_0         
	//   19   30:iload           4
	//   20   32:putfield        #60  <Field boolean zzw>
			i = ((int) (flag3));
	//   21   35:iload           6
	//   22   37:istore_1        
			if(flag2)
	//*  23   38:iload           4
	//*  24   40:ifeq            45
				i = 3;
	//   25   43:iconst_3        
	//   26   44:istore_1        
			zzx = i;
	//   27   45:aload_0         
	//   28   46:iload_1         
	//   29   47:putfield        #62  <Field int zzx>
			return;
	//   30   50:return          
		}
		if(j != 3)
	//*  31   51:iload           5
	//*  32   53:iconst_3        
	//*  33   54:icmpne          60
	//*  34   57:goto            62
			flag = false;
	//   35   60:iconst_0        
	//   36   61:istore_2        
		zzw = flag;
	//   37   62:aload_0         
	//   38   63:iload_2         
	//   39   64:putfield        #60  <Field boolean zzw>
		zzx = j;
	//   40   67:aload_0         
	//   41   68:iload           5
	//   42   70:putfield        #62  <Field int zzx>
	//   43   73:return          
	}

	private CredentialPickerConfig(Builder builder)
	{
		this(2, Builder.zzc(builder), Builder.zzd(builder), false, Builder.zze(builder));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_1         
	//    3    3:invokestatic    #69  <Method boolean CredentialPickerConfig$Builder.zzc(CredentialPickerConfig$Builder)>
	//    4    6:aload_1         
	//    5    7:invokestatic    #72  <Method boolean CredentialPickerConfig$Builder.zzd(CredentialPickerConfig$Builder)>
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokestatic    #76  <Method int CredentialPickerConfig$Builder.zze(CredentialPickerConfig$Builder)>
	//    9   15:invokespecial   #78  <Method void CredentialPickerConfig(int, boolean, boolean, boolean, int)>
	//   10   18:return          
	}

	CredentialPickerConfig(Builder builder, zzd zzd)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void CredentialPickerConfig(CredentialPickerConfig$Builder)>
	//    3    5:return          
	}

	public final boolean isForNewAccount()
	{
		return zzx == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zzx>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean shouldShowAddAccountButton()
	{
		return zzv;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean zzv>
	//    2    4:ireturn         
	}

	public final boolean shouldShowCancelButton()
	{
		return mShowCancelButton;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean mShowCancelButton>
	//    2    4:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #91  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #93  <Method boolean shouldShowAddAccountButton()>
	//    7   11:invokestatic    #97  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #99  <Method boolean shouldShowCancelButton()>
	//   12   20:invokestatic    #97  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #101 <Method boolean isForNewAccount()>
	//   17   29:invokestatic    #97  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 4, zzx);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #62  <Field int zzx>
	//   22   38:invokestatic    #105 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 1000, zzu);
	//   23   41:aload_1         
	//   24   42:sipush          1000
	//   25   45:aload_0         
	//   26   46:getfield        #54  <Field int zzu>
	//   27   49:invokestatic    #105 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   28   52:aload_1         
	//   29   53:iload_2         
	//   30   54:invokestatic    #108 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   31   57:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	private final boolean mShowCancelButton;
	private final int zzu;
	private final boolean zzv;
	private final boolean zzw;
	private final int zzx;

	static 
	{
	//    0    0:new             #42  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void zze()>
	//    3    7:putstatic       #47  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
