// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzn;
import com.google.android.gms.maps.internal.zzaa;
import com.google.android.gms.maps.model.IndoorBuilding;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

final class zza extends zzaa
{

	zza(GoogleMap googlemap, GoogleMap.OnIndoorStateChangeListener onindoorstatechangelistener)
	{
		zzi = onindoorstatechangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field GoogleMap$OnIndoorStateChangeListener zzi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzaa()>
	//    5    9:return          
	}

	public final void onIndoorBuildingFocused()
	{
		zzi.onIndoorBuildingFocused();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field GoogleMap$OnIndoorStateChangeListener zzi>
	//    2    4:invokeinterface #19  <Method void GoogleMap$OnIndoorStateChangeListener.onIndoorBuildingFocused()>
	//    3    9:return          
	}

	public final void zza(zzn zzn)
	{
		zzi.onIndoorLevelActivated(new IndoorBuilding(zzn));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field GoogleMap$OnIndoorStateChangeListener zzi>
	//    2    4:new             #23  <Class IndoorBuilding>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void IndoorBuilding(zzn)>
	//    6   12:invokeinterface #29  <Method void GoogleMap$OnIndoorStateChangeListener.onIndoorLevelActivated(IndoorBuilding)>
	//    7   17:return          
	}

	private final GoogleMap.OnIndoorStateChangeListener zzi;
}
