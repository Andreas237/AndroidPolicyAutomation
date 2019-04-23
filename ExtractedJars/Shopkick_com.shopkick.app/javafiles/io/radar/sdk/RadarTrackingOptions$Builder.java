// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk:
//			RadarTrackingOptions

public static final class RadarTrackingOptions$Builder
{

	public final RadarTrackingOptions build()
	{
		return new RadarTrackingOptions(offline, priority, sync, ((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    0    0:new             #6   <Class RadarTrackingOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Radar$RadarTrackingOffline offline>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field Radar$RadarTrackingPriority priority>
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field Radar$RadarTrackingSync sync>
	//    8   16:aconst_null     
	//    9   17:invokespecial   #60  <Method void RadarTrackingOptions(Radar$RadarTrackingOffline, Radar$RadarTrackingPriority, Radar$RadarTrackingSync, kotlin.jvm.internal.DefaultConstructorMarker)>
	//   10   20:areturn         
	}

	public final RadarTrackingOptions$Builder offline(Radar.RadarTrackingOffline radartrackingoffline)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radartrackingoffline)), "offline");
	//    0    0:aload_1         
	//    1    1:ldc1            #63  <String "offline">
	//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		RadarTrackingOptions$Builder radartrackingoptions$builder = (RadarTrackingOptions$Builder)this;
	//    3    6:aload_0         
	//    4    7:checkcast       #2   <Class RadarTrackingOptions$Builder>
	//    5   10:astore_2        
		radartrackingoptions$builder.offline = radartrackingoffline;
	//    6   11:aload_2         
	//    7   12:aload_1         
	//    8   13:putfield        #40  <Field Radar$RadarTrackingOffline offline>
		return radartrackingoptions$builder;
	//    9   16:aload_2         
	//   10   17:areturn         
	}

	public final RadarTrackingOptions$Builder priority(Radar.RadarTrackingPriority radartrackingpriority)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radartrackingpriority)), "priority");
	//    0    0:aload_1         
	//    1    1:ldc1            #72  <String "priority">
	//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		RadarTrackingOptions$Builder radartrackingoptions$builder = (RadarTrackingOptions$Builder)this;
	//    3    6:aload_0         
	//    4    7:checkcast       #2   <Class RadarTrackingOptions$Builder>
	//    5   10:astore_2        
		radartrackingoptions$builder.priority = radartrackingpriority;
	//    6   11:aload_2         
	//    7   12:aload_1         
	//    8   13:putfield        #47  <Field Radar$RadarTrackingPriority priority>
		return radartrackingoptions$builder;
	//    9   16:aload_2         
	//   10   17:areturn         
	}

	public final RadarTrackingOptions$Builder sync(Radar.RadarTrackingSync radartrackingsync)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radartrackingsync)), "sync");
	//    0    0:aload_1         
	//    1    1:ldc1            #74  <String "sync">
	//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		RadarTrackingOptions$Builder radartrackingoptions$builder = (RadarTrackingOptions$Builder)this;
	//    3    6:aload_0         
	//    4    7:checkcast       #2   <Class RadarTrackingOptions$Builder>
	//    5   10:astore_2        
		radartrackingoptions$builder.sync = radartrackingsync;
	//    6   11:aload_2         
	//    7   12:aload_1         
	//    8   13:putfield        #54  <Field Radar$RadarTrackingSync sync>
		return radartrackingoptions$builder;
	//    9   16:aload_2         
	//   10   17:areturn         
	}

	private Radar.RadarTrackingOffline offline;
	private Radar.RadarTrackingPriority priority;
	private Radar.RadarTrackingSync sync;

	public RadarTrackingOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		offline = Radar.RadarTrackingOffline.REPLAY_STOPPED;
	//    2    4:aload_0         
	//    3    5:getstatic       #38  <Field Radar$RadarTrackingOffline Radar$RadarTrackingOffline.REPLAY_STOPPED>
	//    4    8:putfield        #40  <Field Radar$RadarTrackingOffline offline>
		priority = Radar.RadarTrackingPriority.RESPONSIVENESS;
	//    5   11:aload_0         
	//    6   12:getstatic       #45  <Field Radar$RadarTrackingPriority Radar$RadarTrackingPriority.RESPONSIVENESS>
	//    7   15:putfield        #47  <Field Radar$RadarTrackingPriority priority>
		sync = Radar.RadarTrackingSync.POSSIBLE_STATE_CHANGES;
	//    8   18:aload_0         
	//    9   19:getstatic       #52  <Field Radar$RadarTrackingSync Radar$RadarTrackingSync.POSSIBLE_STATE_CHANGES>
	//   10   22:putfield        #54  <Field Radar$RadarTrackingSync sync>
	//   11   25:return          
	}
}
