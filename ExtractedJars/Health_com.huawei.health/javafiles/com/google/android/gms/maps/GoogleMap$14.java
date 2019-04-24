// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.internal.zzg;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$14 extends com.google.android.gms.maps.internal.zzz.zza
{

	public void zza(zzg zzg)
	{
		zzbnM.onPolygonClick(new Polygon(zzg));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnPolygonClickListener zzbnM>
	//    2    4:new             #23  <Class Polygon>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void Polygon(zzg)>
	//    6   12:invokeinterface #31  <Method void GoogleMap$OnPolygonClickListener.onPolygonClick(Polygon)>
	//    7   17:return          
	}

	final olygonClickListener zzbnM;

	GoogleMap$14(GoogleMap googlemap, olygonClickListener olygonclicklistener)
	{
		zzbnM = olygonclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnPolygonClickListener zzbnM>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzz$zza()>
	//    5    9:return          
	}
}
