// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.ads.zzlw;
import com.google.android.gms.internal.ads.zzlx;

// Referenced classes of package com.google.android.gms.ads.search:
//			zzb

public final class SearchAdRequest
{
	public static final class Builder
	{

		static String zza(Builder builder)
		{
			return builder.zzabd;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field String zzabd>
		//    2    4:areturn         
		}

		static zzlx zzb(Builder builder)
		{
			return builder.zzuo;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:areturn         
		}

		public final Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
		{
			zzuo.zzb(class1, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method void zzlx.zzb(Class, Bundle)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder addNetworkExtras(NetworkExtras networkextras)
		{
			zzuo.zza(networkextras);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #39  <Method void zzlx.zza(NetworkExtras)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
		{
			zzuo.zza(class1, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #42  <Method void zzlx.zza(Class, Bundle)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder addTestDevice(String s)
		{
			zzuo.zzad(s);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #49  <Method void zzlx.zzad(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final SearchAdRequest build()
		{
			return new SearchAdRequest(this, ((zzb) (null)));
		//    0    0:new             #6   <Class SearchAdRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #54  <Method void SearchAdRequest(SearchAdRequest$Builder, zzb)>
		//    5    9:areturn         
		}

		public final Builder setAnchorTextColor(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setBackgroundColor(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setBackgroundGradient(int i, int j)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setBorderColor(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setBorderThickness(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setBorderType(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setCallButtonColor(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setCustomChannels(String s)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setDescriptionTextColor(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setFontFace(String s)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setHeaderTextColor(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setHeaderTextSize(int i)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public final Builder setLocation(Location location)
		{
			zzuo.zzb(location);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #75  <Method void zzlx.zzb(Location)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder setQuery(String s)
		{
			zzabd = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field String zzabd>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setRequestAgent(String s)
		{
			zzuo.zzah(s);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #80  <Method void zzlx.zzah(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public final Builder tagForChildDirectedTreatment(boolean flag)
		{
			zzuo.zzj(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzlx zzuo>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #86  <Method void zzlx.zzj(boolean)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private String zzabd;
		private final zzlx zzuo = new zzlx();

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #17  <Class zzlx>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void zzlx()>
		//    6   12:putfield        #20  <Field zzlx zzuo>
		//    7   15:return          
		}
	}


	private SearchAdRequest(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		zzabd = Builder.zza(builder);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #40  <Method String SearchAdRequest$Builder.zza(SearchAdRequest$Builder)>
	//    5    9:putfield        #42  <Field String zzabd>
		zzun = new zzlw(Builder.zzb(builder), this);
	//    6   12:aload_0         
	//    7   13:new             #44  <Class zzlw>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokestatic    #48  <Method zzlx SearchAdRequest$Builder.zzb(SearchAdRequest$Builder)>
	//   11   21:aload_0         
	//   12   22:invokespecial   #51  <Method void zzlw(zzlx, SearchAdRequest)>
	//   13   25:putfield        #53  <Field zzlw zzun>
	//   14   28:return          
	}

	SearchAdRequest(Builder builder, zzb zzb)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void SearchAdRequest(SearchAdRequest$Builder)>
	//    3    5:return          
	}

	public final int getAnchorTextColor()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getBackgroundColor()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getBackgroundGradientBottom()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getBackgroundGradientTop()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getBorderColor()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getBorderThickness()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getBorderType()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getCallButtonColor()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String getCustomChannels()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Bundle getCustomEventExtrasBundle(Class class1)
	{
		return zzun.getCustomEventExtrasBundle(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method Bundle zzlw.getCustomEventExtrasBundle(Class)>
	//    4    8:areturn         
	}

	public final int getDescriptionTextColor()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String getFontFace()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int getHeaderTextColor()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final int getHeaderTextSize()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Location getLocation()
	{
		return zzun.getLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzlw zzun>
	//    2    4:invokevirtual   #83  <Method Location zzlw.getLocation()>
	//    3    7:areturn         
	}

	public final NetworkExtras getNetworkExtras(Class class1)
	{
		return zzun.getNetworkExtras(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method NetworkExtras zzlw.getNetworkExtras(Class)>
	//    4    8:areturn         
	}

	public final Bundle getNetworkExtrasBundle(Class class1)
	{
		return zzun.getNetworkExtrasBundle(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method Bundle zzlw.getNetworkExtrasBundle(Class)>
	//    4    8:areturn         
	}

	public final String getQuery()
	{
		return zzabd;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String zzabd>
	//    2    4:areturn         
	}

	public final boolean isTestDevice(Context context)
	{
		return zzun.isTestDevice(context);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzlw zzun>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #97  <Method boolean zzlw.isTestDevice(Context)>
	//    4    8:ireturn         
	}

	final zzlw zzay()
	{
		return zzun;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field zzlw zzun>
	//    2    4:areturn         
	}

	public static final int BORDER_TYPE_DASHED = 1;
	public static final int BORDER_TYPE_DOTTED = 2;
	public static final int BORDER_TYPE_NONE = 0;
	public static final int BORDER_TYPE_SOLID = 3;
	public static final int CALL_BUTTON_COLOR_DARK = 2;
	public static final int CALL_BUTTON_COLOR_LIGHT = 0;
	public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
	public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
	public static final int ERROR_CODE_INTERNAL_ERROR = 0;
	public static final int ERROR_CODE_INVALID_REQUEST = 1;
	public static final int ERROR_CODE_NETWORK_ERROR = 2;
	public static final int ERROR_CODE_NO_FILL = 3;
	private final String zzabd;
	private final zzlw zzun;
}
