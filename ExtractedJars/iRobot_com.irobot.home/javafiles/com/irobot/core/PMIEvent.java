// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PMIEvent
{
	private static final class CppProxy extends PMIEvent
	{

		private native void nativeDestroy(long l);

		private native ArrayList native_arrayIntValue(long l, String s);

		private native ArrayList native_arrayObjectValue(long l, String s);

		private native ArrayList native_arrayStringValue(long l, String s);

		private native boolean native_boolValue(long l, String s, boolean flag);

		private native float native_float32Value(long l, String s, float f);

		private native String native_id(long l);

		private native short native_int16Value(long l, String s, short word0);

		private native int native_int32Value(long l, String s, int i);

		private native ArrayList native_keys(long l);

		private native PMIEvent native_objectValue(long l, String s, PMIEvent pmievent);

		private native String native_rawData(long l);

		private native String native_stringValue(long l, String s, String s1);

		public ArrayList arrayIntValue(String s)
		{
			return native_arrayIntValue(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #61  <Method ArrayList native_arrayIntValue(long, String)>
		//    5    9:areturn         
		}

		public ArrayList arrayObjectValue(String s)
		{
			return native_arrayObjectValue(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #66  <Method ArrayList native_arrayObjectValue(long, String)>
		//    5    9:areturn         
		}

		public ArrayList arrayStringValue(String s)
		{
			return native_arrayStringValue(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #70  <Method ArrayList native_arrayStringValue(long, String)>
		//    5    9:areturn         
		}

		public boolean boolValue(String s, boolean flag)
		{
			return native_boolValue(nativeRef, s, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #75  <Method boolean native_boolValue(long, String, boolean)>
		//    6   10:ireturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #80  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #82  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #85  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #89  <Method void Object.finalize()>
		//    4    8:return          
		}

		public float float32Value(String s, float f)
		{
			return native_float32Value(nativeRef, s, f);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:fload_2         
		//    5    7:invokespecial   #93  <Method float native_float32Value(long, String, float)>
		//    6   10:freturn         
		}

		public String id()
		{
			return native_id(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #97  <Method String native_id(long)>
		//    4    8:areturn         
		}

		public short int16Value(String s, short word0)
		{
			return native_int16Value(nativeRef, s, word0);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #101 <Method short native_int16Value(long, String, short)>
		//    6   10:ireturn         
		}

		public int int32Value(String s, int i)
		{
			return native_int32Value(nativeRef, s, i);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #105 <Method int native_int32Value(long, String, int)>
		//    6   10:ireturn         
		}

		public ArrayList keys()
		{
			return native_keys(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #109 <Method ArrayList native_keys(long)>
		//    4    8:areturn         
		}

		public PMIEvent objectValue(String s, PMIEvent pmievent)
		{
			return native_objectValue(nativeRef, s, pmievent);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #114 <Method PMIEvent native_objectValue(long, String, PMIEvent)>
		//    6   10:areturn         
		}

		public String rawData()
		{
			return native_rawData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #117 <Method String native_rawData(long)>
		//    4    8:areturn         
		}

		public String stringValue(String s, String s1)
		{
			return native_stringValue(nativeRef, s, s1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #121 <Method String native_stringValue(long, String, String)>
		//    6   10:areturn         
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
		//    1    1:invokespecial   #19  <Method void PMIEvent()>
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


	public PMIEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native PMIEvent nullEvent();

	public abstract ArrayList arrayIntValue(String s);

	public abstract ArrayList arrayObjectValue(String s);

	public abstract ArrayList arrayStringValue(String s);

	public abstract boolean boolValue(String s, boolean flag);

	public abstract float float32Value(String s, float f);

	public abstract String id();

	public abstract short int16Value(String s, short word0);

	public abstract int int32Value(String s, int i);

	public abstract ArrayList keys();

	public abstract PMIEvent objectValue(String s, PMIEvent pmievent);

	public abstract String rawData();

	public abstract String stringValue(String s, String s1);
}
