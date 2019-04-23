// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class BitmapDescriptor
{

	public BitmapDescriptor(IObjectWrapper iobjectwrapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zze = (IObjectWrapper)Preconditions.checkNotNull(((Object) (iobjectwrapper)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #19  <Class IObjectWrapper>
	//    6   12:putfield        #21  <Field IObjectWrapper zze>
	//    7   15:return          
	}

	public final IObjectWrapper zza()
	{
		return zze;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field IObjectWrapper zze>
	//    2    4:areturn         
	}

	private final IObjectWrapper zze;
}
