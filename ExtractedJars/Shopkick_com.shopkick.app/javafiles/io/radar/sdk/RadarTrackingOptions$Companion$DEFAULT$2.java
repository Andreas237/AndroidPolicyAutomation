// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package io.radar.sdk:
//			RadarTrackingOptions

static final class RadarTrackingOptions$Companion$DEFAULT$2 extends Lambda
	implements Function0
{

	public final RadarTrackingOptions invoke()
	{
		return (new RadarTrackingOptions.Builder()).build();
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

	public static final RadarTrackingOptions$Companion$DEFAULT$2 INSTANCE = new RadarTrackingOptions$Companion$DEFAULT$2();

	static 
	{
	//    0    0:new             #2   <Class RadarTrackingOptions$Companion$DEFAULT$2>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void RadarTrackingOptions$Companion$DEFAULT$2()>
	//    3    7:putstatic       #32  <Field RadarTrackingOptions$Companion$DEFAULT$2 INSTANCE>
	//*   4   10:return          
	}

	RadarTrackingOptions$Companion$DEFAULT$2()
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #36  <Method void Lambda(int)>
	//    3    5:return          
	}
}
