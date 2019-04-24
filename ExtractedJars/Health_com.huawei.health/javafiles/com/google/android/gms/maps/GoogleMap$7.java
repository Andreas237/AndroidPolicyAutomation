// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$7 extends com.google.android.gms.maps.internal.zzd.zza
{

	public IObjectWrapper zzh(zzf zzf)
	{
		return zzd.zzA(((Object) (zzbnE.getInfoWindow(new Marker(zzf)))));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$InfoWindowAdapter zzbnE>
	//    2    4:new             #23  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #26  <Method void Marker(zzf)>
	//    6   12:invokeinterface #32  <Method android.view.View GoogleMap$InfoWindowAdapter.getInfoWindow(Marker)>
	//    7   17:invokestatic    #38  <Method IObjectWrapper zzd.zzA(Object)>
	//    8   20:areturn         
	}

	public IObjectWrapper zzi(zzf zzf)
	{
		return zzd.zzA(((Object) (zzbnE.getInfoContents(new Marker(zzf)))));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$InfoWindowAdapter zzbnE>
	//    2    4:new             #23  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #26  <Method void Marker(zzf)>
	//    6   12:invokeinterface #42  <Method android.view.View GoogleMap$InfoWindowAdapter.getInfoContents(Marker)>
	//    7   17:invokestatic    #38  <Method IObjectWrapper zzd.zzA(Object)>
	//    8   20:areturn         
	}

	final foWindowAdapter zzbnE;

	GoogleMap$7(GoogleMap googlemap, foWindowAdapter fowindowadapter)
	{
		zzbnE = fowindowadapter;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$InfoWindowAdapter zzbnE>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzd$zza()>
	//    5    9:return          
	}
}
