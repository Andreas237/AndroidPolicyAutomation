// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//			LocationSettingsRequest, LocationRequest, zzae

public static final class LocationSettingsRequest$Builder
{

	public final LocationSettingsRequest$Builder addAllLocationRequests(Collection collection)
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

	public final LocationSettingsRequest$Builder addLocationRequest(LocationRequest locationrequest)
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
		return new LocationSettingsRequest(((java.util.List) (zzbk)), zzbh, zzbi, ((zzae) (null)));
	//    0    0:new             #6   <Class LocationSettingsRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ArrayList zzbk>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field boolean zzbh>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field boolean zzbi>
	//    8   16:aconst_null     
	//    9   17:invokespecial   #66  <Method void LocationSettingsRequest(java.util.List, boolean, boolean, zzae)>
	//   10   20:areturn         
	}

	public final LocationSettingsRequest$Builder setAlwaysShow(boolean flag)
	{
		zzbh = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean zzbh>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final LocationSettingsRequest$Builder setNeedBle(boolean flag)
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

	public LocationSettingsRequest$Builder()
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
