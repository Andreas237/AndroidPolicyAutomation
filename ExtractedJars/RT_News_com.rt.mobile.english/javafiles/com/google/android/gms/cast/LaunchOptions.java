// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzcu;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//			zzah

public class LaunchOptions extends AbstractSafeParcelable
{
	public static final class Builder
	{

		public final LaunchOptions build()
		{
			return zzcz;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field LaunchOptions zzcz>
		//    2    4:areturn         
		}

		public final Builder setLocale(Locale locale)
		{
			zzcz.setLanguage(zzcu.zza(locale));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field LaunchOptions zzcz>
		//    2    4:aload_1         
		//    3    5:invokestatic    #28  <Method String zzcu.zza(Locale)>
		//    4    8:invokevirtual   #32  <Method void LaunchOptions.setLanguage(String)>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public final Builder setRelaunchIfRunning(boolean flag)
		{
			zzcz.setRelaunchIfRunning(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field LaunchOptions zzcz>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #37  <Method void LaunchOptions.setRelaunchIfRunning(boolean)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private LaunchOptions zzcz;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzcz = new LaunchOptions();
		//    2    4:aload_0         
		//    3    5:new             #6   <Class LaunchOptions>
		//    4    8:dup             
		//    5    9:invokespecial   #15  <Method void LaunchOptions()>
		//    6   12:putfield        #17  <Field LaunchOptions zzcz>
		//    7   15:return          
		}
	}


	public LaunchOptions()
	{
		this(false, zzcu.zza(Locale.getDefault()));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #43  <Method Locale Locale.getDefault()>
	//    3    5:invokestatic    #49  <Method String zzcu.zza(Locale)>
	//    4    8:invokespecial   #52  <Method void LaunchOptions(boolean, String)>
	//    5   11:return          
	}

	LaunchOptions(boolean flag, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void AbstractSafeParcelable()>
		zzcx = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #57  <Field boolean zzcx>
		zzcy = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #59  <Field String zzcy>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof LaunchOptions))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LaunchOptions>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((LaunchOptions)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LaunchOptions>
	//   12   20:astore_1        
		return zzcx == ((LaunchOptions) (obj)).zzcx && zzcu.zza(((Object) (zzcy)), ((Object) (((LaunchOptions) (obj)).zzcy)));
	//   13   21:aload_0         
	//   14   22:getfield        #57  <Field boolean zzcx>
	//   15   25:aload_1         
	//   16   26:getfield        #57  <Field boolean zzcx>
	//   17   29:icmpne          48
	//   18   32:aload_0         
	//   19   33:getfield        #59  <Field String zzcy>
	//   20   36:aload_1         
	//   21   37:getfield        #59  <Field String zzcy>
	//   22   40:invokestatic    #66  <Method boolean zzcu.zza(Object, Object)>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public String getLanguage()
	{
		return zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String zzcy>
	//    2    4:areturn         
	}

	public boolean getRelaunchIfRunning()
	{
		return zzcx;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean zzcx>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Boolean.valueOf(zzcx), zzcy
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field boolean zzcx>
	//    6   10:invokestatic    #78  <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #59  <Field String zzcy>
	//   12   20:aastore         
	//   13   21:invokestatic    #83  <Method int Objects.hashCode(Object[])>
	//   14   24:ireturn         
	}

	public void setLanguage(String s)
	{
		zzcy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field String zzcy>
	//    3    5:return          
	}

	public void setRelaunchIfRunning(boolean flag)
	{
		zzcx = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean zzcx>
	//    3    5:return          
	}

	public String toString()
	{
		return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
			Boolean.valueOf(zzcx), zzcy
		});
	//    0    0:ldc1            #90  <String "LaunchOptions(relaunchIfRunning=%b, language=%s)">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #57  <Field boolean zzcx>
	//    7   12:invokestatic    #78  <Method Boolean Boolean.valueOf(boolean)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #59  <Field String zzcy>
	//   13   22:aastore         
	//   14   23:invokestatic    #96  <Method String String.format(String, Object[])>
	//   15   26:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #104 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBoolean(parcel, 2, getRelaunchIfRunning());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #106 <Method boolean getRelaunchIfRunning()>
	//    7   11:invokestatic    #110 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getLanguage(), false);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #112 <Method String getLanguage()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #116 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #119 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzah();
	private boolean zzcx;
	private String zzcy;

	static 
	{
	//    0    0:new             #31  <Class zzah>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void zzah()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
