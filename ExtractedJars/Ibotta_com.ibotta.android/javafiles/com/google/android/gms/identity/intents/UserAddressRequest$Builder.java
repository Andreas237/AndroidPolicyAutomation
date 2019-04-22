// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.identity.intents;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.*;

// Referenced classes of package com.google.android.gms.identity.intents:
//			UserAddressRequest, zzc

public final class UserAddressRequest$Builder
{

	public final UserAddressRequest$Builder addAllowedCountrySpecification(CountrySpecification countryspecification)
	{
		if(zzg.zzf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field UserAddressRequest zzg>
	//*   2    4:getfield        #26  <Field List UserAddressRequest.zzf>
	//*   3    7:ifnonnull       24
			zzg.zzf = ((List) (new ArrayList()));
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field UserAddressRequest zzg>
	//    6   14:new             #28  <Class ArrayList>
	//    7   17:dup             
	//    8   18:invokespecial   #29  <Method void ArrayList()>
	//    9   21:putfield        #26  <Field List UserAddressRequest.zzf>
		zzg.zzf.add(((Object) (countryspecification)));
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field UserAddressRequest zzg>
	//   12   28:getfield        #26  <Field List UserAddressRequest.zzf>
	//   13   31:aload_1         
	//   14   32:invokeinterface #35  <Method boolean List.add(Object)>
	//   15   37:pop             
		return this;
	//   16   38:aload_0         
	//   17   39:areturn         
	}

	public final UserAddressRequest$Builder addAllowedCountrySpecifications(Collection collection)
	{
		if(zzg.zzf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field UserAddressRequest zzg>
	//*   2    4:getfield        #26  <Field List UserAddressRequest.zzf>
	//*   3    7:ifnonnull       24
			zzg.zzf = ((List) (new ArrayList()));
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field UserAddressRequest zzg>
	//    6   14:new             #28  <Class ArrayList>
	//    7   17:dup             
	//    8   18:invokespecial   #29  <Method void ArrayList()>
	//    9   21:putfield        #26  <Field List UserAddressRequest.zzf>
		zzg.zzf.addAll(collection);
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field UserAddressRequest zzg>
	//   12   28:getfield        #26  <Field List UserAddressRequest.zzf>
	//   13   31:aload_1         
	//   14   32:invokeinterface #41  <Method boolean List.addAll(Collection)>
	//   15   37:pop             
		return this;
	//   16   38:aload_0         
	//   17   39:areturn         
	}

	public final UserAddressRequest build()
	{
		if(zzg.zzf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field UserAddressRequest zzg>
	//*   2    4:getfield        #26  <Field List UserAddressRequest.zzf>
	//*   3    7:ifnull          26
		{
			UserAddressRequest useraddressrequest = zzg;
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field UserAddressRequest zzg>
	//    6   14:astore_1        
			useraddressrequest.zzf = Collections.unmodifiableList(useraddressrequest.zzf);
	//    7   15:aload_1         
	//    8   16:aload_1         
	//    9   17:getfield        #26  <Field List UserAddressRequest.zzf>
	//   10   20:invokestatic    #51  <Method List Collections.unmodifiableList(List)>
	//   11   23:putfield        #26  <Field List UserAddressRequest.zzf>
		}
		return zzg;
	//   12   26:aload_0         
	//   13   27:getfield        #13  <Field UserAddressRequest zzg>
	//   14   30:areturn         
	}

	private final UserAddressRequest zzg;

	private UserAddressRequest$Builder(UserAddressRequest useraddressrequest)
	{
		zzg = useraddressrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field UserAddressRequest zzg>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	UserAddressRequest$Builder(UserAddressRequest useraddressrequest, zzc zzc)
	{
		this(useraddressrequest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void UserAddressRequest$Builder(UserAddressRequest)>
	//    3    5:return          
	}
}
