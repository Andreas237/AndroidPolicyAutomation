// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzlx;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//			PublisherAdRequest

public static final class PublisherAdRequest$Builder
{

	static zzlx zza(PublisherAdRequest$Builder publisheradrequest$builder)
	{
		return publisheradrequest$builder.zzuo;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:areturn         
	}

	public final PublisherAdRequest$Builder addCategoryExclusion(String s)
	{
		zzuo.zzai(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method void zzlx.zzai(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
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

	public final PublisherAdRequest$Builder addCustomTargeting(String s, String s1)
	{
		zzuo.zzc(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method void zzlx.zzc(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public final PublisherAdRequest$Builder addCustomTargeting(String s, List list)
	{
		if(list != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          18
			zzuo.zzc(s, TextUtils.join(",", ((Iterable) (list))));
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field zzlx zzuo>
	//    4    8:aload_1         
	//    5    9:ldc1            #45  <String ",">
	//    6   11:aload_2         
	//    7   12:invokestatic    #51  <Method String TextUtils.join(CharSequence, Iterable)>
	//    8   15:invokevirtual   #42  <Method void zzlx.zzc(String, String)>
		return this;
	//    9   18:aload_0         
	//   10   19:areturn         
	}

	public final PublisherAdRequest$Builder addKeyword(String s)
	{
		zzuo.zzac(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method void zzlx.zzac(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder addNetworkExtras(NetworkExtras networkextras)
	{
		zzuo.zza(networkextras);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method void zzlx.zza(NetworkExtras)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
	{
		zzuo.zza(class1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #64  <Method void zzlx.zza(Class, Bundle)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public final PublisherAdRequest$Builder addTestDevice(String s)
	{
		zzuo.zzad(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #69  <Method void zzlx.zzad(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest build()
	{
		return new PublisherAdRequest(this, ((zza) (null)));
	//    0    0:new             #6   <Class PublisherAdRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #74  <Method void PublisherAdRequest(PublisherAdRequest$Builder, zza)>
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder setBirthday(Date date)
	{
		zzuo.zza(date);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method void zzlx.zza(Date)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder setContentUrl(String s)
	{
		Preconditions.checkNotNull(((Object) (s)), "Content URL must be non-null.");
	//    0    0:aload_1         
	//    1    1:ldc1            #82  <String "Content URL must be non-null.">
	//    2    3:invokestatic    #88  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotEmpty(s, "Content URL must be non-empty.");
	//    4    7:aload_1         
	//    5    8:ldc1            #90  <String "Content URL must be non-empty.">
	//    6   10:invokestatic    #94  <Method String Preconditions.checkNotEmpty(String, Object)>
	//    7   13:pop             
		boolean flag;
		if(s.length() <= 512)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #100 <Method int String.length()>
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
	//   18   32:ldc1            #102 <String "Content URL must not exceed %d in length.  Provided length was %d.">
	//   19   34:iconst_2        
	//   20   35:anewarray       Object[]
	//   21   38:dup             
	//   22   39:iconst_0        
	//   23   40:sipush          512
	//   24   43:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//   25   46:aastore         
	//   26   47:dup             
	//   27   48:iconst_1        
	//   28   49:aload_1         
	//   29   50:invokevirtual   #100 <Method int String.length()>
	//   30   53:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//   31   56:aastore         
	//   32   57:invokestatic    #112 <Method void Preconditions.checkArgument(boolean, String, Object[])>
		zzuo.zzaf(s);
	//   33   60:aload_0         
	//   34   61:getfield        #19  <Field zzlx zzuo>
	//   35   64:aload_1         
	//   36   65:invokevirtual   #115 <Method void zzlx.zzaf(String)>
		return this;
	//   37   68:aload_0         
	//   38   69:areturn         
	}

	public final PublisherAdRequest$Builder setGender(int i)
	{
		zzuo.zzt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #121 <Method void zzlx.zzt(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder setIsDesignedForFamilies(boolean flag)
	{
		zzuo.zzk(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #127 <Method void zzlx.zzk(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder setLocation(Location location)
	{
		zzuo.zzb(location);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method void zzlx.zzb(Location)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder setManualImpressionsEnabled(boolean flag)
	{
		zzuo.setManualImpressionsEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #136 <Method void zzlx.setManualImpressionsEnabled(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder setPublisherProvidedId(String s)
	{
		zzuo.zzag(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #141 <Method void zzlx.zzag(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder setRequestAgent(String s)
	{
		zzuo.zzah(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method void zzlx.zzah(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final PublisherAdRequest$Builder tagForChildDirectedTreatment(boolean flag)
	{
		zzuo.zzj(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzlx zzuo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #149 <Method void zzlx.zzj(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final zzlx zzuo = new zzlx();

	public PublisherAdRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class zzlx>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void zzlx()>
	//    6   12:putfield        #19  <Field zzlx zzuo>
	//    7   15:return          
	}
}
