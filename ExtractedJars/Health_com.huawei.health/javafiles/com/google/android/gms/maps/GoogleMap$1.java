// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.internal.zzd;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$1 extends com.google.android.gms.maps.internal.zzl.zza
{

	public void onIndoorBuildingFocused()
	{
		zzbny.onIndoorBuildingFocused();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnIndoorStateChangeListener zzbny>
	//    2    4:invokeinterface #24  <Method void GoogleMap$OnIndoorStateChangeListener.onIndoorBuildingFocused()>
	//    3    9:return          
	}

	public void zza(zzd zzd)
	{
		zzbny.onIndoorLevelActivated(new IndoorBuilding(zzd));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnIndoorStateChangeListener zzbny>
	//    2    4:new             #28  <Class IndoorBuilding>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #30  <Method void IndoorBuilding(zzd)>
	//    6   12:invokeinterface #34  <Method void GoogleMap$OnIndoorStateChangeListener.onIndoorLevelActivated(IndoorBuilding)>
	//    7   17:return          
	}

	final IndoorStateChangeListener zzbny;

	GoogleMap$1(GoogleMap googlemap, IndoorStateChangeListener indoorstatechangelistener)
	{
		zzbny = indoorstatechangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnIndoorStateChangeListener zzbny>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzl$zza()>
	//    5    9:return          
	}
}
