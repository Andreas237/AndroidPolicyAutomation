// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class CameraUpdate
{

	CameraUpdate(IObjectWrapper iobjectwrapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbnu = (IObjectWrapper)zzac.zzw(((Object) (iobjectwrapper)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class IObjectWrapper>
	//    6   12:putfield        #21  <Field IObjectWrapper zzbnu>
	//    7   15:return          
	}

	public IObjectWrapper zzJm()
	{
		return zzbnu;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IObjectWrapper zzbnu>
	//    2    4:areturn         
	}

	private final IObjectWrapper zzbnu;
}
