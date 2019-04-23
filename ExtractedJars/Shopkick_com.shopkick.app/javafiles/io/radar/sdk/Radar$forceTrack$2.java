// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package io.radar.sdk:
//			Radar

static final class Radar$forceTrack$2 extends Lambda
	implements Function1
{

	public volatile Object invoke(Object obj)
	{
		invoke((Location)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #41  <Class Location>
	//    3    5:invokevirtual   #44  <Method void invoke(Location)>
		return ((Object) (Unit.INSTANCE));
	//    4    8:getstatic       #50  <Field Unit Unit.INSTANCE>
	//    5   11:areturn         
	}

	public final void invoke(Location location)
	{
		if(location != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
		{
			Radar.INSTANCE.handleLocation$sdk_release(location);
	//    2    4:getstatic       #54  <Field Radar Radar.INSTANCE>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #57  <Method void Radar.handleLocation$sdk_release(Location)>
			return;
	//    5   11:return          
		}
		location = ((Location) ($callback));
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field Radar$RadarCallback $callback>
	//    8   16:astore_1        
		if(location != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          34
			.DefaultImpls.onComplete._mthdefault((() (location)), Radar.RadarStatus.ERROR_LOCATION, ((Location) (null)), ((io.radar.sdk.model.RadarEvent []) (null)), ((io.radar.sdk.model.RadarUser) (null)), 14, ((Object) (null)));
	//   11   21:aload_1         
	//   12   22:getstatic       #63  <Field Radar$RadarStatus Radar$RadarStatus.ERROR_LOCATION>
	//   13   25:aconst_null     
	//   14   26:aconst_null     
	//   15   27:aconst_null     
	//   16   28:bipush          14
	//   17   30:aconst_null     
	//   18   31:invokestatic    #69  <Method void Radar$RadarCallback$DefaultImpls.onComplete$default(Radar$RadarCallback, Radar$RadarStatus, Location, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser, int, Object)>
		Radar.access$broadcastError(Radar.INSTANCE, Radar.RadarStatus.ERROR_LOCATION);
	//   19   34:getstatic       #54  <Field Radar Radar.INSTANCE>
	//   20   37:getstatic       #63  <Field Radar$RadarStatus Radar$RadarStatus.ERROR_LOCATION>
	//   21   40:invokestatic    #73  <Method void Radar.access$broadcastError(Radar, Radar$RadarStatus)>
	//   22   43:return          
	}

	final  $callback;

	Radar$forceTrack$2( )
	{
		$callback = ;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field Radar$RadarCallback $callback>
		super(1);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokespecial   #37  <Method void Lambda(int)>
	//    6   10:return          
	}
}
