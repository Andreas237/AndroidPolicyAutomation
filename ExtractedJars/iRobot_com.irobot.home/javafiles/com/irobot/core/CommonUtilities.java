// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			CarpetBoostMode, CleanPresetType, MultiPassMode, RobotPadWetnessLevel, 
//			RobotRankOverlap, AssetValidationResult

public abstract class CommonUtilities
{
	private static final class CppProxy extends CommonUtilities
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
		//    1    1:invokespecial   #14  <Method void CommonUtilities()>
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


	public CommonUtilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static native CarpetBoostMode carpetBoostModeFromMap(HashMap hashmap);

	public static native CleanPresetType cleanPresetTypeFromMap(HashMap hashmap);

	public static native boolean edgeCleanFromMap(HashMap hashmap);

	public static native HashMap mapFromCarpetBoostMode(CarpetBoostMode carpetboostmode);

	public static native HashMap mapFromCleanPresetType(CleanPresetType cleanpresettype);

	public static native HashMap mapFromEdgeClean(boolean flag);

	public static native HashMap mapFromMultiPassMode(MultiPassMode multipassmode);

	public static native HashMap mapFromRobotPadWetnessLevel(RobotPadWetnessLevel robotpadwetnesslevel);

	public static native HashMap mapFromRobotRankOverlap(RobotRankOverlap robotrankoverlap);

	public static native MultiPassMode multiPassModeFromMap(HashMap hashmap);

	public static native RobotPadWetnessLevel robotPadWetnessLevelFromMap(HashMap hashmap);

	public static native RobotRankOverlap robotRankOverlapFromMap(HashMap hashmap);

	public static native AssetValidationResult validateAssetName(String s);

	public static native AssetValidationResult validateEmail(String s);

	public static final int MAX_ROBOT_NAME_LENGTH = 16;
	public static final int MIN_ROBOT_NAME_LENGTH = 1;
}
