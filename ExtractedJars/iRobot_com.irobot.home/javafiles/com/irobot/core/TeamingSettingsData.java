// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetInfo, ScheduleLocationType

public abstract class TeamingSettingsData
{
	private static final class CppProxy extends TeamingSettingsData
	{

		private native void nativeDestroy(long l);

		private native void native_setPrimaryAsset(long l, AssetInfo assetinfo);

		private native void native_setSecondaryLocationType(long l, ScheduleLocationType schedulelocationtype);

		private native void native_setSecondaryMapId(long l, String s);

		private native void native_setSecondaryMapVId(long l, String s);

		private native void native_setSecondaryRegions(long l, ArrayList arraylist);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #50  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #52  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #55  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #59  <Method void Object.finalize()>
		//    4    8:return          
		}

		public void setPrimaryAsset(AssetInfo assetinfo)
		{
			native_setPrimaryAsset(nativeRef, assetinfo);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #63  <Method void native_setPrimaryAsset(long, AssetInfo)>
		//    5    9:return          
		}

		public void setSecondaryLocationType(ScheduleLocationType schedulelocationtype)
		{
			native_setSecondaryLocationType(nativeRef, schedulelocationtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #67  <Method void native_setSecondaryLocationType(long, ScheduleLocationType)>
		//    5    9:return          
		}

		public void setSecondaryMapId(String s)
		{
			native_setSecondaryMapId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #70  <Method void native_setSecondaryMapId(long, String)>
		//    5    9:return          
		}

		public void setSecondaryMapVId(String s)
		{
			native_setSecondaryMapVId(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #73  <Method void native_setSecondaryMapVId(long, String)>
		//    5    9:return          
		}

		public void setSecondaryRegions(ArrayList arraylist)
		{
			native_setSecondaryRegions(nativeRef, arraylist);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #77  <Method void native_setSecondaryRegions(long, ArrayList)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void TeamingSettingsData()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public TeamingSettingsData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native TeamingSettingsData create();

	public abstract void setPrimaryAsset(AssetInfo assetinfo);

	public abstract void setSecondaryLocationType(ScheduleLocationType schedulelocationtype);

	public abstract void setSecondaryMapId(String s);

	public abstract void setSecondaryMapVId(String s);

	public abstract void setSecondaryRegions(ArrayList arraylist);
}
