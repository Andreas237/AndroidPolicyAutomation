// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aaf, zz

final class aab
	implements aaf
{

	aab(int i, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int a>
		b = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Map b>
	//    8   14:return          
	}

	public final void a(JsonWriter jsonwriter)
	{
		zz.a(a, b, jsonwriter);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map b>
	//    4    8:aload_1         
	//    5    9:invokestatic    #26  <Method void zz.a(int, Map, JsonWriter)>
	//    6   12:return          
	}

	private final int a;
	private final Map b;
}
