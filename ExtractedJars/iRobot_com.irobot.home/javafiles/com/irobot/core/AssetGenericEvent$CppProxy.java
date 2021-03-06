// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetGenericEvent, Event, Error, EventType, 
//			GenericEvent

private static final class AssetGenericEvent$CppProxy extends AssetGenericEvent
{

	private native void nativeDestroy(long l);

	private native ArrayList native_arrayIntValue(long l, String s);

	private native ArrayList native_arrayObjectValue(long l, String s);

	private native ArrayList native_arrayStringValue(long l, String s);

	private native String native_assetId(long l);

	private native boolean native_boolValue(long l, String s, boolean flag);

	private native boolean native_equals(long l, Event event);

	private native Error native_error(long l);

	private native EventType native_eventType(long l);

	private native float native_float32Value(long l, String s, float f);

	private native boolean native_forcedPublish(long l);

	private native String native_id(long l);

	private native short native_int16Value(long l, String s, short word0);

	private native int native_int32Value(long l, String s, int i);

	private native String native_key(long l);

	private native ArrayList native_keys(long l);

	private native GenericEvent native_objectValue(long l, String s, GenericEvent genericevent);

	private native String native_rawData(long l);

	private native String native_stringValue(long l, String s, String s1);

	private native Date native_timestamp(long l);

	public ArrayList arrayIntValue(String s)
	{
		return native_arrayIntValue(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #73  <Method ArrayList native_arrayIntValue(long, String)>
	//    5    9:areturn         
	}

	public ArrayList arrayObjectValue(String s)
	{
		return native_arrayObjectValue(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #78  <Method ArrayList native_arrayObjectValue(long, String)>
	//    5    9:areturn         
	}

	public ArrayList arrayStringValue(String s)
	{
		return native_arrayStringValue(nativeRef, s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #82  <Method ArrayList native_arrayStringValue(long, String)>
	//    5    9:areturn         
	}

	public String assetId()
	{
		return native_assetId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #87  <Method String native_assetId(long)>
	//    4    8:areturn         
	}

	public boolean boolValue(String s, boolean flag)
	{
		return native_boolValue(nativeRef, s, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #91  <Method boolean native_boolValue(long, String, boolean)>
	//    6   10:ireturn         
	}

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #96  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #98  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	public boolean equals(Event event)
	{
		return native_equals(nativeRef, event);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #102 <Method boolean native_equals(long, Event)>
	//    5    9:ireturn         
	}

	public Error error()
	{
		return native_error(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #106 <Method Error native_error(long)>
	//    4    8:areturn         
	}

	public EventType eventType()
	{
		return native_eventType(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #110 <Method EventType native_eventType(long)>
	//    4    8:areturn         
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #117 <Method void Object.finalize()>
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
	//    5    7:invokespecial   #121 <Method float native_float32Value(long, String, float)>
	//    6   10:freturn         
	}

	public boolean forcedPublish()
	{
		return native_forcedPublish(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #125 <Method boolean native_forcedPublish(long)>
	//    4    8:ireturn         
	}

	public String id()
	{
		return native_id(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #128 <Method String native_id(long)>
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
	//    5    7:invokespecial   #132 <Method short native_int16Value(long, String, short)>
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
	//    5    7:invokespecial   #136 <Method int native_int32Value(long, String, int)>
	//    6   10:ireturn         
	}

	public String key()
	{
		return native_key(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #139 <Method String native_key(long)>
	//    4    8:areturn         
	}

	public ArrayList keys()
	{
		return native_keys(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #143 <Method ArrayList native_keys(long)>
	//    4    8:areturn         
	}

	public GenericEvent objectValue(String s, GenericEvent genericevent)
	{
		return native_objectValue(nativeRef, s, genericevent);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #148 <Method GenericEvent native_objectValue(long, String, GenericEvent)>
	//    6   10:areturn         
	}

	public String rawData()
	{
		return native_rawData(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #151 <Method String native_rawData(long)>
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
	//    5    7:invokespecial   #155 <Method String native_stringValue(long, String, String)>
	//    6   10:areturn         
	}

	public Date timestamp()
	{
		return native_timestamp(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #159 <Method Date native_timestamp(long)>
	//    4    8:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private AssetGenericEvent$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AssetGenericEvent()>
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
