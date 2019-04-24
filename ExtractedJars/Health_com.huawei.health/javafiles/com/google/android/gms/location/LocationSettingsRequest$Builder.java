// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.location:
//			LocationSettingsRequest, zzo, LocationRequest

public static final class LocationSettingsRequest$Builder
{

	public LocationSettingsRequest$Builder addAllLocationRequests(Collection collection)
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

	public LocationSettingsRequest$Builder addLocationRequest(LocationRequest locationrequest)
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
		return new LocationSettingsRequest(((java.util.List) (zzbkh)), zzbke, zzbkf, ((zzo) (null)));
	//    0    0:new             #6   <Class LocationSettingsRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ArrayList zzbkh>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field boolean zzbke>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field boolean zzbkf>
	//    8   16:aconst_null     
	//    9   17:invokespecial   #50  <Method void LocationSettingsRequest(java.util.List, boolean, boolean, zzo)>
	//   10   20:areturn         
	}

	public LocationSettingsRequest$Builder setAlwaysShow(boolean flag)
	{
		zzbke = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean zzbke>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LocationSettingsRequest$Builder setNeedBle(boolean flag)
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

	public LocationSettingsRequest$Builder()
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
