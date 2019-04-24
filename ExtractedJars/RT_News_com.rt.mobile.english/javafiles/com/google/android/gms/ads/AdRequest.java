// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzlw;
import com.google.android.gms.internal.ads.zzlx;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads:
//			zza

public final class AdRequest
{
	public static final class Builder
	{

		static zzlx zza(Builder builder)
		{
			return builder.zzuo;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:areturn         
		}

		public final Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
		{
			zzuo.zzb(class1, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #34  <Method void zzlx.zzb(Class, Bundle)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder addKeyword(String s)
		{
			zzuo.zzac(s);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #41  <Method void zzlx.zzac(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder addNetworkExtras(NetworkExtras networkextras)
		{
			zzuo.zza(networkextras);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #46  <Method void zzlx.zza(NetworkExtras)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
		{
			zzuo.zza(class1, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #49  <Method void zzlx.zza(Class, Bundle)>
			if(((Object) (class1)).equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
		//*   5    9:aload_1         
		//*   6   10:ldc1            #51  <Class AdMobAdapter>
		//*   7   12:invokevirtual   #55  <Method boolean Object.equals(Object)>
		//*   8   15:ifeq            36
		//*   9   18:aload_2         
		//*  10   19:ldc1            #57  <String "_emulatorLiveAds">
		//*  11   21:invokevirtual   #63  <Method boolean Bundle.getBoolean(String)>
		//*  12   24:ifeq            36
				zzuo.zzae("B3EEABB8EE11C2BE770B684D95219ECB");
		//   13   27:aload_0         
		//   14   28:getfield        #19  <Field zzlx zzuo>
		//   15   31:ldc1            #21  <String "B3EEABB8EE11C2BE770B684D95219ECB">
		//   16   33:invokevirtual   #66  <Method void zzlx.zzae(String)>
			return this;
		//   17   36:aload_0         
		//   18   37:areturn         
		}

		public final Builder addTestDevice(String s)
		{
			zzuo.zzad(s);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #25  <Method void zzlx.zzad(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final AdRequest build()
		{
			return new AdRequest(this, ((zza) (null)));
		//    0    0:new             #6   <Class AdRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #73  <Method void AdRequest(AdRequest$Builder, zza)>
		//    5    9:areturn         
		}

		public final Builder setBirthday(Date date)
		{
			zzuo.zza(date);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #78  <Method void zzlx.zza(Date)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder setContentUrl(String s)
		{
			Preconditions.checkNotNull(((Object) (s)), "Content URL must be non-null.");
		//    0    0:aload_1         
		//    1    1:ldc1            #81  <String "Content URL must be non-null.">
		//    2    3:invokestatic    #87  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			Preconditions.checkNotEmpty(s, "Content URL must be non-empty.");
		//    4    7:aload_1         
		//    5    8:ldc1            #89  <String "Content URL must be non-empty.">
		//    6   10:invokestatic    #93  <Method String Preconditions.checkNotEmpty(String, Object)>
		//    7   13:pop             
			boolean flag;
			if(s.length() <= 512)
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #99  <Method int String.length()>
		//*  10   18:sipush          512
		//*  11   21:icmpgt          29
				flag = true;
		//   12   24:iconst_1        
		//   13   25:istore_2        
			else
		//*  14   26:goto            31
				flag = false;
		//   15   29:iconst_0        
		//   16   30:istore_2        
			Preconditions.checkArgument(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
				Integer.valueOf(512), Integer.valueOf(s.length())
			});
		//   17   31:iload_2         
		//   18   32:ldc1            #101 <String "Content URL must not exceed %d in length.  Provided length was %d.">
		//   19   34:iconst_2        
		//   20   35:anewarray       Object[]
		//   21   38:dup             
		//   22   39:iconst_0        
		//   23   40:sipush          512
		//   24   43:invokestatic    #107 <Method Integer Integer.valueOf(int)>
		//   25   46:aastore         
		//   26   47:dup             
		//   27   48:iconst_1        
		//   28   49:aload_1         
		//   29   50:invokevirtual   #99  <Method int String.length()>
		//   30   53:invokestatic    #107 <Method Integer Integer.valueOf(int)>
		//   31   56:aastore         
		//   32   57:invokestatic    #111 <Method void Preconditions.checkArgument(boolean, String, Object[])>
			zzuo.zzaf(s);
		//   33   60:aload_0         
		//   34   61:getfield        #19  <Field zzlx zzuo>
		//   35   64:aload_1         
		//   36   65:invokevirtual   #114 <Method void zzlx.zzaf(String)>
			return this;
		//   37   68:aload_0         
		//   38   69:areturn         
		}

		public final Builder setGender(int i)
		{
			zzuo.zzt(i);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #120 <Method void zzlx.zzt(int)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder setIsDesignedForFamilies(boolean flag)
		{
			zzuo.zzk(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #126 <Method void zzlx.zzk(boolean)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder setLocation(Location location)
		{
			zzuo.zzb(location);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #131 <Method void zzlx.zzb(Location)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder setRequestAgent(String s)
		{
			zzuo.zzah(s);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #135 <Method void zzlx.zzah(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder tagForChildDirectedTreatment(boolean flag)
		{
			zzuo.zzj(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field zzlx zzuo>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #139 <Method void zzlx.zzj(boolean)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private final zzlx zzuo = new zzlx();

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class zzlx>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void zzlx()>
		//    6   12:putfield        #19  <Field zzlx zzuo>
			zzuo.zzad("B3EEABB8EE11C2BE770B684D95219ECB");
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field zzlx zzuo>
		//    9   19:ldc1            #21  <String "B3EEABB8EE11C2BE770B684D95219ECB">
		//   10   21:invokevirtual   #25  <Method void zzlx.zzad(String)>
		//   11   24:return          
		}
	}


	private AdRequest(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		zzun = new zzlw(Builder.zza(builder));
	//    2    4:aload_0         
	//    3    5:new             #35  <Class zzlw>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #39  <Method zzlx AdRequest$Builder.zza(AdRequest$Builder)>
	//    7   13:invokespecial   #42  <Method void zzlw(zzlx)>
	//    8   16:putfield        #44  <Field zzlw zzun>
	//    9   19:return          
	}

	AdRequest(Builder builder, zza zza)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void AdRequest(AdRequest$Builder)>
	//    3    5:return          
	}

	public final Date getBirthday()
	{
		return zzun.getBirthday();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:invokevirtual   #52  <Method Date zzlw.getBirthday()>
	//    3    7:areturn         
	}

	public final String getContentUrl()
	{
		return zzun.getContentUrl();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:invokevirtual   #56  <Method String zzlw.getContentUrl()>
	//    3    7:areturn         
	}

	public final Bundle getCustomEventExtrasBundle(Class class1)
	{
		return zzun.getCustomEventExtrasBundle(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method Bundle zzlw.getCustomEventExtrasBundle(Class)>
	//    4    8:areturn         
	}

	public final int getGender()
	{
		return zzun.getGender();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:invokevirtual   #66  <Method int zzlw.getGender()>
	//    3    7:ireturn         
	}

	public final Set getKeywords()
	{
		return zzun.getKeywords();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:invokevirtual   #70  <Method Set zzlw.getKeywords()>
	//    3    7:areturn         
	}

	public final Location getLocation()
	{
		return zzun.getLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:invokevirtual   #75  <Method Location zzlw.getLocation()>
	//    3    7:areturn         
	}

	public final NetworkExtras getNetworkExtras(Class class1)
	{
		return zzun.getNetworkExtras(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #80  <Method NetworkExtras zzlw.getNetworkExtras(Class)>
	//    4    8:areturn         
	}

	public final Bundle getNetworkExtrasBundle(Class class1)
	{
		return zzun.getNetworkExtrasBundle(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method Bundle zzlw.getNetworkExtrasBundle(Class)>
	//    4    8:areturn         
	}

	public final boolean isTestDevice(Context context)
	{
		return zzun.isTestDevice(context);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #90  <Method boolean zzlw.isTestDevice(Context)>
	//    4    8:ireturn         
	}

	public final zzlw zzay()
	{
		return zzun;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzlw zzun>
	//    2    4:areturn         
	}

	public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
	public static final int ERROR_CODE_INTERNAL_ERROR = 0;
	public static final int ERROR_CODE_INVALID_REQUEST = 1;
	public static final int ERROR_CODE_NETWORK_ERROR = 2;
	public static final int ERROR_CODE_NO_FILL = 3;
	public static final int GENDER_FEMALE = 2;
	public static final int GENDER_MALE = 1;
	public static final int GENDER_UNKNOWN = 0;
	public static final int MAX_CONTENT_URL_LENGTH = 512;
	private final zzlw zzun;
}
