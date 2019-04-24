// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.internal.zzb;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$13 extends com.google.android.gms.maps.internal.zzj.zza
{

	public void zza(zzb zzb)
	{
		zzbnL.onCircleClick(new Circle(zzb));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnCircleClickListener zzbnL>
	//    2    4:new             #23  <Class Circle>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void Circle(zzb)>
	//    6   12:invokeinterface #31  <Method void GoogleMap$OnCircleClickListener.onCircleClick(Circle)>
	//    7   17:return          
	}

	final ircleClickListener zzbnL;

	GoogleMap$13(GoogleMap googlemap, ircleClickListener ircleclicklistener)
	{
		zzbnL = ircleclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnCircleClickListener zzbnL>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzj$zza()>
	//    5    9:return          
	}
}
