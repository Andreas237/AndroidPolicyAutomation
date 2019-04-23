// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			zzag, zzae, LocationRequest

public final class LocationSettingsRequest extends AbstractSafeParcelable
{
	public static final class Builder
	{

		public final Builder addAllLocationRequests(Collection collection)
		{
			collection = ((Collection) (collection.iterator()));
		//    0    0:aload_1         
		//    1    1:invokeinterface #39  <Method Iterator Collection.iterator()>
		//    2    6:astore_1        
			do
			{
				if(!((Iterator) (collection)).hasNext())
					break;
		//    3    7:aload_1         
		//    4    8:invokeinterface #45  <Method boolean Iterator.hasNext()>
		//    5   13:ifeq            42
				LocationRequest locationrequest = (LocationRequest)((Iterator) (collection)).next();
		//    6   16:aload_1         
		//    7   17:invokeinterface #49  <Method Object Iterator.next()>
		//    8   22:checkcast       #51  <Class LocationRequest>
		//    9   25:astore_2        
				if(locationrequest != null)
		//*  10   26:aload_2         
		//*  11   27:ifnull          7
					zzbk.add(((Object) (locationrequest)));
		//   12   30:aload_0         
		//   13   31:getfield        #24  <Field ArrayList zzbk>
		//   14   34:aload_2         
		//   15   35:invokevirtual   #55  <Method boolean ArrayList.add(Object)>
		//   16   38:pop             
			} while(true);
		//   17   39:goto            7
			return this;
		//   18   42:aload_0         
		//   19   43:areturn         
		}

		public final Builder addLocationRequest(LocationRequest locationrequest)
		{
			if(locationrequest != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          13
				zzbk.add(((Object) (locationrequest)));
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field ArrayList zzbk>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #55  <Method boolean ArrayList.add(Object)>
		//    6   12:pop             
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public final LocationSettingsRequest build()
		{
			return new LocationSettingsRequest(((List) (zzbk)), zzbh, zzbi, ((zzae) (null)));
		//    0    0:new             #6   <Class LocationSettingsRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field ArrayList zzbk>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field boolean zzbh>
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field boolean zzbi>
		//    8   16:aconst_null     
		//    9   17:invokespecial   #66  <Method void LocationSettingsRequest(List, boolean, boolean, zzae)>
		//   10   20:areturn         
		}

		public final Builder setAlwaysShow(boolean flag)
		{
			zzbh = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #26  <Field boolean zzbh>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setNeedBle(boolean flag)
		{
			zzbi = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field boolean zzbi>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean zzbh;
		private boolean zzbi;
		private zzae zzbj;
		private final ArrayList zzbk = new ArrayList();

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void ArrayList()>
		//    6   12:putfield        #24  <Field ArrayList zzbk>
			zzbh = false;
		//    7   15:aload_0         
		//    8   16:iconst_0        
		//    9   17:putfield        #26  <Field boolean zzbh>
			zzbi = false;
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:putfield        #28  <Field boolean zzbi>
			zzbj = null;
		//   13   25:aload_0         
		//   14   26:aconst_null     
		//   15   27:putfield        #30  <Field zzae zzbj>
		//   16   30:return          
		}
	}


	LocationSettingsRequest(List list, boolean flag, boolean flag1, zzae zzae)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void AbstractSafeParcelable()>
		zzbg = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field List zzbg>
		zzbh = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #55  <Field boolean zzbh>
		zzbi = flag1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #57  <Field boolean zzbi>
		zzbj = zzae;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #59  <Field zzae zzbj>
	//   14   25:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #71  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(zzbg), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #53  <Field List zzbg>
	//    7   11:invokestatic    #77  <Method List Collections.unmodifiableList(List)>
	//    8   14:iconst_0        
	//    9   15:invokestatic    #81  <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 2, zzbh);
	//   10   18:aload_1         
	//   11   19:iconst_2        
	//   12   20:aload_0         
	//   13   21:getfield        #55  <Field boolean zzbh>
	//   14   24:invokestatic    #85  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 3, zzbi);
	//   15   27:aload_1         
	//   16   28:iconst_3        
	//   17   29:aload_0         
	//   18   30:getfield        #57  <Field boolean zzbi>
	//   19   33:invokestatic    #85  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 5, ((android.os.Parcelable) (zzbj)), i, false);
	//   20   36:aload_1         
	//   21   37:iconst_5        
	//   22   38:aload_0         
	//   23   39:getfield        #59  <Field zzae zzbj>
	//   24   42:iload_2         
	//   25   43:iconst_0        
	//   26   44:invokestatic    #89  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   27   47:aload_1         
	//   28   48:iload_3         
	//   29   49:invokestatic    #92  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   30   52:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzag();
	private final List zzbg;
	private final boolean zzbh;
	private final boolean zzbi;
	private zzae zzbj;

	static 
	{
	//    0    0:new             #41  <Class zzag>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void zzag()>
	//    3    7:putstatic       #46  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
