// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.search;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.ads.zzlx;

// Referenced classes of package com.google.android.gms.ads.search:
//			SearchAdRequest

public static final class SearchAdRequest$Builder
{

	static String zza(SearchAdRequest$Builder searchadrequest$builder)
	{
		return searchadrequest$builder.zzabd;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String zzabd>
	//    2    4:areturn         
	}

	static zzlx zzb(SearchAdRequest$Builder searchadrequest$builder)
	{
		return searchadrequest$builder.zzuo;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzlx zzuo>
	//    2    4:areturn         
	}

	public final SearchAdRequest$Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
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

	public final SearchAdRequest$Builder addNetworkExtras(NetworkExtras networkextras)
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

	public final SearchAdRequest$Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
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

	public final SearchAdRequest$Builder addTestDevice(String s)
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

	public final SearchAdRequest$Builder setAnchorTextColor(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setBackgroundColor(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setBackgroundGradient(int i, int j)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setBorderColor(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setBorderThickness(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setBorderType(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setCallButtonColor(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setCustomChannels(String s)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setDescriptionTextColor(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setFontFace(String s)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setHeaderTextColor(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setHeaderTextSize(int i)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final SearchAdRequest$Builder setLocation(Location location)
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

	public final SearchAdRequest$Builder setQuery(String s)
	{
		zzabd = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String zzabd>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final SearchAdRequest$Builder setRequestAgent(String s)
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

	public final SearchAdRequest$Builder tagForChildDirectedTreatment(boolean flag)
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

	public SearchAdRequest$Builder()
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
