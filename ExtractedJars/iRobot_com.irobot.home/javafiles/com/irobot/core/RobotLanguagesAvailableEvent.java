// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetEvent, AssetId, Event, EventType

public abstract class RobotLanguagesAvailableEvent extends AssetEvent
{
	private static final class CppProxy extends RobotLanguagesAvailableEvent
	{

		private native void nativeDestroy(long l);

		private native AssetId native_assetId(long l);

		private native boolean native_equals(long l, Event event);

		private native EventType native_eventType(long l);

		private native boolean native_forcedPublish(long l);

		private native ArrayList native_getLanguages(long l);

		private native String native_key(long l);

		private native Date native_timestamp(long l);

		public AssetId assetId()
		{
			return native_assetId(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #54  <Method AssetId native_assetId(long)>
		//    4    8:areturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #59  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #61  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public boolean equals(Event event)
		{
			return native_equals(nativeRef, event);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #65  <Method boolean native_equals(long, Event)>
		//    5    9:ireturn         
		}

		public EventType eventType()
		{
			return native_eventType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #69  <Method EventType native_eventType(long)>
		//    4    8:areturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #72  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #76  <Method void Object.finalize()>
		//    4    8:return          
		}

		public boolean forcedPublish()
		{
			return native_forcedPublish(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #80  <Method boolean native_forcedPublish(long)>
		//    4    8:ireturn         
		}

		public ArrayList getLanguages()
		{
			return native_getLanguages(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #84  <Method ArrayList native_getLanguages(long)>
		//    4    8:areturn         
		}

		public String key()
		{
			return native_key(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #90  <Method String native_key(long)>
		//    4    8:areturn         
		}

		public Date timestamp()
		{
			return native_timestamp(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #94  <Method Date native_timestamp(long)>
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
		//    1    1:invokespecial   #19  <Method void RobotLanguagesAvailableEvent()>
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


	public RobotLanguagesAvailableEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AssetEvent()>
	//    2    4:return          
	}

	public abstract ArrayList getLanguages();
}
