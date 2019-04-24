// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AltadenaJsonKey
{
	private static final class CppProxy extends AltadenaJsonKey
	{

		private native void nativeDestroy(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #37  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field long nativeRef>
		//    8   16:invokespecial   #39  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #46  <Method void Object.finalize()>
		//    4    8:return          
		}

		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AltadenaJsonKey()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #19  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #21  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #23  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #25  <String "nativeRef is zero">
		//   15   28:invokespecial   #28  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #30  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public AltadenaJsonKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
	//    2    4:return          
	}

	public static final String ALL_PAD_LEVEL = "all_pad_level";
	public static final String BATTERY_CHARGE = "battery_charge";
	public static final String BATTERY_LEVEL = "battery_level";
	public static final String BATTERY_MAXIMUM_CHARGE = "battery_maximum_charge";
	public static final String BATTERY_MAXIMUM_VOLTAGE = "battery_maximum_voltage";
	public static final String BATTERY_MINIMUM_VOLTAGE = "battery_minimum_voltage";
	public static final String BATTERY_VOLTAGE = "battery_voltage";
	public static final String COMMAND = "command";
	public static final String DAMP_PAD_LEVEL = "damp_pad_level";
	public static final String MISSION_STATUS = "mission_status";
	public static final String PAD_TYPE = "pad_type";
	public static final String PREFERENCE = "preference";
	public static final String REUSABLE_DAMP_PAD_LEVEL = "reusable_damp_pad_level";
	public static final String REUSABLE_WET_PAD_LEVEL = "reusable_wet_pad_level";
	public static final String ROBOT_NAME = "robot_name";
	public static final String ROBOT_REGISTERED = "robot_registered";
	public static final String ROBOT_STATE = "robot_state";
	public static final String ROOM_CONFINE = "room_confine";
	public static final String RUNTIME = "runtime";
	public static final String SERIAL_NUMBER = "serial_number";
	public static final String SKU = "sku";
	public static final String SOFTWARE_PACKAGE_UPLOAD = "software_package_upload";
	public static final String SOFTWARE_VERSION = "software_version";
	public static final String UPLOAD_PROGRESS = "upload_progress";
	public static final String UPLOAD_STATE = "upload_state";
	public static final String UPLOAD_TOTAL = "upload_total";
	public static final String VOLUME_LEVEL = "volume_level";
	public static final String WET_PAD_LEVEL = "wet_pad_level";
}
