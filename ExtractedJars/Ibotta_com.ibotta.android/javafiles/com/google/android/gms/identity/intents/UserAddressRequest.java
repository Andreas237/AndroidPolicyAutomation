// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.identity.intents;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.*;

// Referenced classes of package com.google.android.gms.identity.intents:
//			zzd, zzc

public final class UserAddressRequest extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public final class Builder
	{

		public final Builder addAllowedCountrySpecification(CountrySpecification countryspecification)
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

		public final Builder addAllowedCountrySpecifications(Collection collection)
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

		private Builder()
		{
			zzg = UserAddressRequest.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field UserAddressRequest zzg>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Object()>
		//    5    9:return          
		}

		Builder(zzc zzc)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #20  <Method void UserAddressRequest$Builder(UserAddressRequest)>
		//    3    5:return          
		}
	}


	UserAddressRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
	//    2    4:return          
	}

	UserAddressRequest(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		zzf = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field List zzf>
	//    5    9:return          
	}

	public static Builder newBuilder()
	{
		return ((Builder) (new UserAddressRequest())). new Builder(((zzc) (null)));
	//    0    0:new             #8   <Class UserAddressRequest$Builder>
	//    1    3:dup             
	//    2    4:new             #2   <Class UserAddressRequest>
	//    3    7:dup             
	//    4    8:invokespecial   #47  <Method void UserAddressRequest()>
	//    5   11:aconst_null     
	//    6   12:invokespecial   #50  <Method void UserAddressRequest$Builder(UserAddressRequest, zzc)>
	//    7   15:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeTypedList(parcel, 2, zzf, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field List zzf>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #62  <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #65  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	List zzf;

	static 
	{
	//    0    0:new             #28  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzd()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
