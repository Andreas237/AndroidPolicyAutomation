// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.config;

import java.util.Map;

// Referenced classes of package com.google.android.gms.common.config:
//			GservicesValue

private static final class GservicesValue$zzc
	implements GservicesValue$zza
{

	private final Object zza(String s, Object obj)
	{
		if(values.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Map values>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #31  <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            24
			return values.get(((Object) (s)));
	//    5   13:aload_0         
	//    6   14:getfield        #20  <Field Map values>
	//    7   17:aload_1         
	//    8   18:invokeinterface #35  <Method Object Map.get(Object)>
	//    9   23:areturn         
		else
			return obj;
	//   10   24:aload_2         
	//   11   25:areturn         
	}

	public final Long getLong(String s, Long long1)
	{
		return (Long)zza(s, ((Object) (long1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
	//    4    6:checkcast       #42  <Class Long>
	//    5    9:areturn         
	}

	public final String getString(String s, String s1)
	{
		return (String)zza(s, ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
	//    4    6:checkcast       #46  <Class String>
	//    5    9:areturn         
	}

	public final Boolean zza(String s, Boolean boolean1)
	{
		return (Boolean)zza(s, ((Object) (boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
	//    4    6:checkcast       #49  <Class Boolean>
	//    5    9:areturn         
	}

	public final Double zza(String s, Double double1)
	{
		return (Double)zza(s, ((Object) (double1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
	//    4    6:checkcast       #52  <Class Double>
	//    5    9:areturn         
	}

	public final Float zza(String s, Float float1)
	{
		return (Float)zza(s, ((Object) (float1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
	//    4    6:checkcast       #55  <Class Float>
	//    5    9:areturn         
	}

	public final Integer zza(String s, Integer integer)
	{
		return (Integer)zza(s, ((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
	//    4    6:checkcast       #58  <Class Integer>
	//    5    9:areturn         
	}

	public final String zzb(String s, String s1)
	{
		return (String)zza(s, ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
	//    4    6:checkcast       #46  <Class String>
	//    5    9:areturn         
	}

	private final Map values;

	public GservicesValue$zzc(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		values = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Map values>
	//    5    9:return          
	}
}
