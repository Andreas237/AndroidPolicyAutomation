// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aaf, zz

final class aaa
	implements aaf
{

	aaa(String s, String s1, Map map, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String b>
		c = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Map c>
		d = abyte0;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field byte[] d>
	//   14   25:return          
	}

	public final void a(JsonWriter jsonwriter)
	{
		zz.a(a, b, c, d, jsonwriter);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String a>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String b>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field Map c>
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field byte[] d>
	//    8   16:aload_1         
	//    9   17:invokestatic    #33  <Method void zz.a(String, String, Map, byte[], JsonWriter)>
	//   10   20:return          
	}

	private final String a;
	private final String b;
	private final Map c;
	private final byte d[];
}
