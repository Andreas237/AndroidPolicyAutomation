// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzq, zzo, LocationRequest

public final class LocationSettingsRequest extends zza
{
	public static final class Builder
	{

		public Builder addAllLocationRequests(Collection collection)
		{
			zzbkh.addAll(collection);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ArrayList zzbkh>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method boolean ArrayList.addAll(Collection)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder addLocationRequest(LocationRequest locationrequest)
		{
			zzbkh.add(((Object) (locationrequest)));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ArrayList zzbkh>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public LocationSettingsRequest build()
		{
			return new LocationSettingsRequest(((List) (zzbkh)), zzbke, zzbkf, ((zzo) (null)));
		//    0    0:new             #6   <Class LocationSettingsRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field ArrayList zzbkh>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field boolean zzbke>
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field boolean zzbkf>
		//    8   16:aconst_null     
		//    9   17:invokespecial   #50  <Method void LocationSettingsRequest(List, boolean, boolean, zzo)>
		//   10   20:areturn         
		}

		public Builder setAlwaysShow(boolean flag)
		{
			zzbke = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #26  <Field boolean zzbke>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setNeedBle(boolean flag)
		{
			zzbkf = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field boolean zzbkf>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean zzbke;
		private boolean zzbkf;
		private zzo zzbkg;
		private final ArrayList zzbkh = new ArrayList();

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void ArrayList()>
		//    6   12:putfield        #24  <Field ArrayList zzbkh>
			zzbke = false;
		//    7   15:aload_0         
		//    8   16:iconst_0        
		//    9   17:putfield        #26  <Field boolean zzbke>
			zzbkf = false;
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:putfield        #28  <Field boolean zzbkf>
			zzbkg = null;
		//   13   25:aload_0         
		//   14   26:aconst_null     
		//   15   27:putfield        #30  <Field zzo zzbkg>
		//   16   30:return          
		}
	}


	LocationSettingsRequest(List list, boolean flag, boolean flag1, zzo zzo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zza()>
		zzaWt = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field List zzaWt>
		zzbke = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field boolean zzbke>
		zzbkf = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #36  <Field boolean zzbkf>
		zzbkg = zzo;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #38  <Field zzo zzbkg>
	//   14   25:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzq.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #46  <Method void com.google.android.gms.location.zzq.zza(LocationSettingsRequest, Parcel, int)>
	//    4    6:return          
	}

	public List zzDf()
	{
		return Collections.unmodifiableList(zzaWt);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List zzaWt>
	//    2    4:invokestatic    #54  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public boolean zzIj()
	{
		return zzbke;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean zzbke>
	//    2    4:ireturn         
	}

	public boolean zzIk()
	{
		return zzbkf;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzbkf>
	//    2    4:ireturn         
	}

	public zzo zzIl()
	{
		return zzbkg;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field zzo zzbkg>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzq();
	private final List zzaWt;
	private final boolean zzbke;
	private final boolean zzbkf;
	private zzo zzbkg;

	static 
	{
	//    0    0:new             #22  <Class zzq>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzq()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
