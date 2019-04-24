// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			FloorPlanListItemMode

public abstract class FloorPlanListItem
{
	private static final class CppProxy extends FloorPlanListItem
	{

		private native void nativeDestroy(long l);

		private native int native_getCurrentVersionTimestamp(long l);

		private native int native_getLabeledRegionsCount(long l);

		private native String native_getLastUserEditedMapVersion(long l);

		private native int native_getLearningPercent(long l);

		private native String native_getMapIdString(long l);

		private native int native_getMapNumber(long l);

		private native String native_getMapVersion(long l);

		private native FloorPlanListItemMode native_getMode(long l);

		private native String native_getName(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #53  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #55  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #62  <Method void Object.finalize()>
		//    4    8:return          
		}

		public int getCurrentVersionTimestamp()
		{
			return native_getCurrentVersionTimestamp(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #66  <Method int native_getCurrentVersionTimestamp(long)>
		//    4    8:ireturn         
		}

		public int getLabeledRegionsCount()
		{
			return native_getLabeledRegionsCount(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #69  <Method int native_getLabeledRegionsCount(long)>
		//    4    8:ireturn         
		}

		public String getLastUserEditedMapVersion()
		{
			return native_getLastUserEditedMapVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #73  <Method String native_getLastUserEditedMapVersion(long)>
		//    4    8:areturn         
		}

		public int getLearningPercent()
		{
			return native_getLearningPercent(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #76  <Method int native_getLearningPercent(long)>
		//    4    8:ireturn         
		}

		public String getMapIdString()
		{
			return native_getMapIdString(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #79  <Method String native_getMapIdString(long)>
		//    4    8:areturn         
		}

		public int getMapNumber()
		{
			return native_getMapNumber(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #82  <Method int native_getMapNumber(long)>
		//    4    8:ireturn         
		}

		public String getMapVersion()
		{
			return native_getMapVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #85  <Method String native_getMapVersion(long)>
		//    4    8:areturn         
		}

		public FloorPlanListItemMode getMode()
		{
			return native_getMode(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #89  <Method FloorPlanListItemMode native_getMode(long)>
		//    4    8:areturn         
		}

		public String getName()
		{
			return native_getName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #92  <Method String native_getName(long)>
		//    4    8:areturn         
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
		//    1    1:invokespecial   #19  <Method void FloorPlanListItem()>
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


	public FloorPlanListItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract int getCurrentVersionTimestamp();

	public abstract int getLabeledRegionsCount();

	public abstract String getLastUserEditedMapVersion();

	public abstract int getLearningPercent();

	public abstract String getMapIdString();

	public abstract int getMapNumber();

	public abstract String getMapVersion();

	public abstract FloorPlanListItemMode getMode();

	public abstract String getName();
}
