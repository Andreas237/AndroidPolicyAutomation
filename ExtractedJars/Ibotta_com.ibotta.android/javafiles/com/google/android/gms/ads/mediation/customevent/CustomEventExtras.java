// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public final class CustomEventExtras
	implements NetworkExtras
{

	public CustomEventExtras()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field HashMap zzdgj>
	//    7   15:return          
	}

	public final Object getExtra(String s)
	{
		return zzdgj.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field HashMap zzdgj>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method Object HashMap.get(Object)>
	//    4    8:areturn         
	}

	public final void setExtra(String s, Object obj)
	{
		zzdgj.put(((Object) (s)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field HashMap zzdgj>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #32  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	private final HashMap zzdgj = new HashMap();
}
