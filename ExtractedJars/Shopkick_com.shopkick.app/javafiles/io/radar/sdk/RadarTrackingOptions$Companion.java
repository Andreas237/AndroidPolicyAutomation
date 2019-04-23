// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.Lazy;
import kotlin.jvm.internal.*;
import kotlin.reflect.KProperty;

// Referenced classes of package io.radar.sdk:
//			RadarTrackingOptions

public static final class RadarTrackingOptions$Companion
{

	public final RadarTrackingOptions getDEFAULT()
	{
		Lazy lazy = RadarTrackingOptions.access$getDEFAULT$cp();
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

	private RadarTrackingOptions$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:return          
	}

	public RadarTrackingOptions$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void RadarTrackingOptions$Companion()>
	//    2    4:return          
	}
}
