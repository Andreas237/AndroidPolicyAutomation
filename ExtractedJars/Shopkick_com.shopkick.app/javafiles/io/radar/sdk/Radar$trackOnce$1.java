// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import android.location.Location;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk:
//			Radar

public static final class Radar$trackOnce$1
	implements k
{

	public void onComplete(Radar$RadarStatus radar$radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radar$radarstatus)), "status");
	//    0    0:aload_1         
	//    1    1:ldc1            #47  <String "status">
	//    2    3:invokestatic    #53  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		$block.invoke(((Object) (radar$radarstatus)), ((Object) (location)), ((Object) (aradarevent)), ((Object) (radaruser)));
	//    3    6:aload_0         
	//    4    7:getfield        #40  <Field Function4 $block>
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:aload           4
	//    9   15:invokeinterface #59  <Method Object Function4.invoke(Object, Object, Object, Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	final Function4 $block;

	Radar$trackOnce$1(Function4 function4)
	{
		$block = function4;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field Function4 $block>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #43  <Method void Object()>
	//    5    9:return          
	}
}
