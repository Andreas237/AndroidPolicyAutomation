// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

public final class azi
{

	public azi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		g = Collections.emptyMap();
	//    2    4:aload_0         
	//    3    5:invokestatic    #27  <Method Map Collections.emptyMap()>
	//    4    8:putfield        #29  <Field Map g>
	//    5   11:return          
	}

	public final boolean a()
	{
		return e < System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long e>
	//    2    4:invokestatic    #39  <Method long System.currentTimeMillis()>
	//    3    7:lcmp            
	//    4    8:ifge            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public byte a[];
	public String b;
	public long c;
	public long d;
	public long e;
	public long f;
	public Map g;
	public List h;
}
