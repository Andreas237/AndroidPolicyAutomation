// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;


public final class ApiService$WhenMappings
{

	public static final int $EnumSwitchMapping$0[];

	static 
	{
		$EnumSwitchMapping$0 = new int[io.radar.sdk.model.ification.values().length];
	//    0    0:invokestatic    #22  <Method io.radar.sdk.model.RadarEvent$RadarEventVerification[] io.radar.sdk.model.RadarEvent$RadarEventVerification.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #24  <Field int[] $EnumSwitchMapping$0>
		$EnumSwitchMapping$0[io.radar.sdk.model.ification.ACCEPT.ordinal()] = 1;
	//    4    9:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
	//    5   12:getstatic       #28  <Field io.radar.sdk.model.RadarEvent$RadarEventVerification io.radar.sdk.model.RadarEvent$RadarEventVerification.ACCEPT>
	//    6   15:invokevirtual   #32  <Method int io.radar.sdk.model.RadarEvent$RadarEventVerification.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		$EnumSwitchMapping$0[io.radar.sdk.model.ification.REJECT.ordinal()] = 2;
	//    9   20:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
	//   10   23:getstatic       #35  <Field io.radar.sdk.model.RadarEvent$RadarEventVerification io.radar.sdk.model.RadarEvent$RadarEventVerification.REJECT>
	//   11   26:invokevirtual   #32  <Method int io.radar.sdk.model.RadarEvent$RadarEventVerification.ordinal()>
	//   12   29:iconst_2        
	//   13   30:iastore         
	//*  14   31:return          
	}
}
