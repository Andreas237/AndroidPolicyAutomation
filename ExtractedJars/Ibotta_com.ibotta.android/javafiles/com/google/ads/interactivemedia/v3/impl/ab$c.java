// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import a.a.a.a.a.b;
import a.a.a.a.a.c;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ab

public static class ab$c
{

	public boolean equals(Object obj)
	{
		return a.a.a.a.a.b.a(((Object) (this)), obj, new String[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:anewarray       String[]
	//    4    6:invokestatic    #39  <Method boolean b.a(Object, Object, String[])>
	//    5    9:ireturn         
	}

	public int hashCode()
	{
		return a.a.a.a.a.c.a(((Object) (this)), new String[0]);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       String[]
	//    3    5:invokestatic    #46  <Method int c.a(Object, String[])>
	//    4    8:ireturn         
	}

	public final com.google.ads.interactivemedia.v3.api.nt.AdEventType a;
	public final com.google.ads.interactivemedia.v3.impl.data.b b;
	public Map c;
	public List d;
	AdProgressInfo e;
	public String f;

	public ab$c(com.google.ads.interactivemedia.v3.api.nt.AdEventType adeventtype, com.google.ads.interactivemedia.v3.impl.data.b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = adeventtype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType a>
		b = b1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field com.google.ads.interactivemedia.v3.impl.data.b b>
	//    8   14:return          
	}
}
