// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpx

public final class zzon extends zzpx
{

	public zzon(Drawable drawable, Uri uri, double d)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzpx()>
		zzbhu = drawable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Drawable zzbhu>
		mUri = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Uri mUri>
		zzbhv = d;
	//    8   14:aload_0         
	//    9   15:dload_3         
	//   10   16:putfield        #22  <Field double zzbhv>
	//   11   19:return          
	}

	public final double getScale()
	{
		return zzbhv;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field double zzbhv>
	//    2    4:dreturn         
	}

	public final Uri getUri()
		throws RemoteException
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Uri mUri>
	//    2    4:areturn         
	}

	public final IObjectWrapper zzjy()
		throws RemoteException
	{
		return ObjectWrapper.wrap(((Object) (zzbhu)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Drawable zzbhu>
	//    2    4:invokestatic    #38  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    3    7:areturn         
	}

	private final Uri mUri;
	private final Drawable zzbhu;
	private final double zzbhv;
}
