// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


final class zzdz
{

	zzdz(Object obj, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		object = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Object object>
		zzbdq = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field boolean zzbdq>
	//    8   14:return          
	}

	public final Object getObject()
	{
		return object;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Object object>
	//    2    4:areturn         
	}

	public final boolean zzpi()
	{
		return zzbdq;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean zzbdq>
	//    2    4:ireturn         
	}

	private final Object object;
	private final boolean zzbdq;
}
