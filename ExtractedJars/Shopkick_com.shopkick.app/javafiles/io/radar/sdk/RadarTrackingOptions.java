// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.*;
import kotlin.reflect.KProperty;

public final class RadarTrackingOptions
{
	public static final class Builder
	{

		public final RadarTrackingOptions build()
		{
			return new RadarTrackingOptions(offline, priority, sync, ((DefaultConstructorMarker) (null)));
		//    0    0:new             #6   <Class RadarTrackingOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #40  <Field Radar$RadarTrackingOffline offline>
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field Radar$RadarTrackingPriority priority>
		//    6   12:aload_0         
		//    7   13:getfield        #54  <Field Radar$RadarTrackingSync sync>
		//    8   16:aconst_null     
		//    9   17:invokespecial   #60  <Method void RadarTrackingOptions(Radar$RadarTrackingOffline, Radar$RadarTrackingPriority, Radar$RadarTrackingSync, DefaultConstructorMarker)>
		//   10   20:areturn         
		}

		public final Builder offline(Radar.RadarTrackingOffline radartrackingoffline)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (radartrackingoffline)), "offline");
		//    0    0:aload_1         
		//    1    1:ldc1            #63  <String "offline">
		//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Builder builder = (Builder)this;
		//    3    6:aload_0         
		//    4    7:checkcast       #2   <Class RadarTrackingOptions$Builder>
		//    5   10:astore_2        
			builder.offline = radartrackingoffline;
		//    6   11:aload_2         
		//    7   12:aload_1         
		//    8   13:putfield        #40  <Field Radar$RadarTrackingOffline offline>
			return builder;
		//    9   16:aload_2         
		//   10   17:areturn         
		}

		public final Builder priority(Radar.RadarTrackingPriority radartrackingpriority)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (radartrackingpriority)), "priority");
		//    0    0:aload_1         
		//    1    1:ldc1            #72  <String "priority">
		//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Builder builder = (Builder)this;
		//    3    6:aload_0         
		//    4    7:checkcast       #2   <Class RadarTrackingOptions$Builder>
		//    5   10:astore_2        
			builder.priority = radartrackingpriority;
		//    6   11:aload_2         
		//    7   12:aload_1         
		//    8   13:putfield        #47  <Field Radar$RadarTrackingPriority priority>
			return builder;
		//    9   16:aload_2         
		//   10   17:areturn         
		}

		public final Builder sync(Radar.RadarTrackingSync radartrackingsync)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (radartrackingsync)), "sync");
		//    0    0:aload_1         
		//    1    1:ldc1            #74  <String "sync">
		//    2    3:invokestatic    #69  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			Builder builder = (Builder)this;
		//    3    6:aload_0         
		//    4    7:checkcast       #2   <Class RadarTrackingOptions$Builder>
		//    5   10:astore_2        
			builder.sync = radartrackingsync;
		//    6   11:aload_2         
		//    7   12:aload_1         
		//    8   13:putfield        #54  <Field Radar$RadarTrackingSync sync>
			return builder;
		//    9   16:aload_2         
		//   10   17:areturn         
		}

		private Radar.RadarTrackingOffline offline;
		private Radar.RadarTrackingPriority priority;
		private Radar.RadarTrackingSync sync;

		public Builder()
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

	public static final class Companion
	{

		public final RadarTrackingOptions getDEFAULT()
		{
			Lazy lazy = RadarTrackingOptions.DEFAULT$delegate;
		//    0    0:invokestatic    #64  <Method Lazy RadarTrackingOptions.access$getDEFAULT$cp()>
		//    1    3:astore_1        
			KProperty kproperty = $$delegatedProperties[0];
		//    2    4:getstatic       #54  <Field KProperty[] $$delegatedProperties>
		//    3    7:iconst_0        
		//    4    8:aaload          
		//    5    9:astore_2        
			return (RadarTrackingOptions)lazy.getValue();
		//    6   10:aload_1         
		//    7   11:invokeinterface #70  <Method Object Lazy.getValue()>
		//    8   16:checkcast       #6   <Class RadarTrackingOptions>
		//    9   19:areturn         
		}

		static final KProperty $$delegatedProperties[] = {
			(KProperty)Reflection.property1(((kotlin.jvm.internal.PropertyReference1) (new PropertyReference1Impl(((kotlin.reflect.KDeclarationContainer) (Reflection.getOrCreateKotlinClass(io/radar/sdk/RadarTrackingOptions$Companion))), "DEFAULT", "getDEFAULT()Lio/radar/sdk/RadarTrackingOptions;"))))
		};

		static 
		{
		//    0    0:iconst_1        
		//    1    1:anewarray       KProperty[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #35  <Class PropertyReference1Impl>
		//    5    9:dup             
		//    6   10:ldc1            #2   <Class RadarTrackingOptions$Companion>
		//    7   12:invokestatic    #41  <Method kotlin.reflect.KClass Reflection.getOrCreateKotlinClass(Class)>
		//    8   15:ldc1            #42  <String "DEFAULT">
		//    9   17:ldc1            #44  <String "getDEFAULT()Lio/radar/sdk/RadarTrackingOptions;">
		//   10   19:invokespecial   #48  <Method void PropertyReference1Impl(kotlin.reflect.KDeclarationContainer, String, String)>
		//   11   22:invokestatic    #52  <Method kotlin.reflect.KProperty1 Reflection.property1(kotlin.jvm.internal.PropertyReference1)>
		//   12   25:checkcast       #33  <Class KProperty>
		//   13   28:aastore         
		//   14   29:putstatic       #54  <Field KProperty[] $$delegatedProperties>
		//*  15   32:return          
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #57  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #59  <Method void RadarTrackingOptions$Companion()>
		//    2    4:return          
		}
	}


	private RadarTrackingOptions(Radar.RadarTrackingOffline radartrackingoffline, Radar.RadarTrackingPriority radartrackingpriority, Radar.RadarTrackingSync radartrackingsync)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		offline = radartrackingoffline;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #70  <Field Radar$RadarTrackingOffline offline>
		priority = radartrackingpriority;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #72  <Field Radar$RadarTrackingPriority priority>
		sync = radartrackingsync;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #74  <Field Radar$RadarTrackingSync sync>
	//   11   19:return          
	}

	public RadarTrackingOptions(Radar.RadarTrackingOffline radartrackingoffline, Radar.RadarTrackingPriority radartrackingpriority, Radar.RadarTrackingSync radartrackingsync, DefaultConstructorMarker defaultconstructormarker)
	{
		this(radartrackingoffline, radartrackingpriority, radartrackingsync);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #77  <Method void RadarTrackingOptions(Radar$RadarTrackingOffline, Radar$RadarTrackingPriority, Radar$RadarTrackingSync)>
	//    5    7:return          
	}

	public final Radar.RadarTrackingOffline getOffline()
	{
		return offline;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Radar$RadarTrackingOffline offline>
	//    2    4:areturn         
	}

	public final Radar.RadarTrackingPriority getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Radar$RadarTrackingPriority priority>
	//    2    4:areturn         
	}

	public final Radar.RadarTrackingSync getSync()
	{
		return sync;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Radar$RadarTrackingSync sync>
	//    2    4:areturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	private static final Lazy DEFAULT$delegate;
	private final Radar.RadarTrackingOffline offline;
	private final Radar.RadarTrackingPriority priority;
	private final Radar.RadarTrackingSync sync;

	static 
	{
	//    0    0:new             #9   <Class RadarTrackingOptions$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #49  <Method void RadarTrackingOptions$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #51  <Field RadarTrackingOptions$Companion Companion>
		static final class Companion.DEFAULT._cls2 extends Lambda
			implements Function0
		{

			public final RadarTrackingOptions invoke()
			{
				return (new Builder()).build();
			//    0    0:new             #40  <Class RadarTrackingOptions$Builder>
			//    1    3:dup             
			//    2    4:invokespecial   #41  <Method void RadarTrackingOptions$Builder()>
			//    3    7:invokevirtual   #44  <Method RadarTrackingOptions RadarTrackingOptions$Builder.build()>
			//    4   10:areturn         
			}

			public volatile Object invoke()
			{
				return ((Object) (invoke()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #48  <Method RadarTrackingOptions invoke()>
			//    2    4:areturn         
			}

			public static final Companion.DEFAULT._cls2 INSTANCE = new Companion.DEFAULT._cls2();

			static 
			{
			//    0    0:new             #2   <Class RadarTrackingOptions$Companion$DEFAULT$2>
			//    1    3:dup             
			//    2    4:invokespecial   #30  <Method void RadarTrackingOptions$Companion$DEFAULT$2()>
			//    3    7:putstatic       #32  <Field RadarTrackingOptions$Companion$DEFAULT$2 INSTANCE>
			//*   4   10:return          
			}

		}

		DEFAULT$delegate = LazyKt.lazy((Function0)Companion.DEFAULT._cls2.INSTANCE);
	//    5   11:getstatic       #55  <Field RadarTrackingOptions$Companion$DEFAULT$2 RadarTrackingOptions$Companion$DEFAULT$2.INSTANCE>
	//    6   14:checkcast       #57  <Class Function0>
	//    7   17:invokestatic    #63  <Method Lazy LazyKt.lazy(Function0)>
	//    8   20:putstatic       #65  <Field Lazy DEFAULT$delegate>
	//*   9   23:return          
	}


/*
	public static final Lazy access$getDEFAULT$cp()
	{
		return DEFAULT$delegate;
	//    0    0:getstatic       #65  <Field Lazy DEFAULT$delegate>
	//    1    3:areturn         
	}

*/
}
