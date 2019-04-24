// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpw, zzane

public final class zzpz extends com.google.android.gms.ads.formats.NativeAd.Image
{

	public zzpz(zzpw zzpw1)
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void com.google.android.gms.ads.formats.NativeAd$Image()>
		zzbkm = zzpw1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field zzpw zzbkm>
		obj = null;
	//    5    9:aconst_null     
	//    6   10:astore          6
		zzpw1 = ((zzpw) (zzbkm.zzjy()));
	//    7   12:aload_0         
	//    8   13:getfield        #22  <Field zzpw zzbkm>
	//    9   16:invokeinterface #28  <Method com.google.android.gms.dynamic.IObjectWrapper zzpw.zzjy()>
	//   10   21:astore_1        
		double d;
label0:
		{
			if(zzpw1 != null)
	//*  11   22:aload_1         
	//*  12   23:ifnull          44
				try
				{
					zzpw1 = ((zzpw) ((Drawable)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (zzpw1)))));
	//   13   26:aload_1         
	//   14   27:invokestatic    #34  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   15   30:checkcast       #36  <Class Drawable>
	//   16   33:astore_1        
					break label0;
	//   17   34:goto            46
				}
				// Misplaced declaration of an exception variable
				catch(zzpw zzpw1)
	//*  18   37:astore_1        
				{
					zzane.zzb("", ((Throwable) (zzpw1)));
	//   19   38:ldc1            #38  <String "">
	//   20   40:aload_1         
	//   21   41:invokestatic    #44  <Method void zzane.zzb(String, Throwable)>
				}
			zzpw1 = null;
	//   22   44:aconst_null     
	//   23   45:astore_1        
		}
		mDrawable = ((Drawable) (zzpw1));
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:putfield        #46  <Field Drawable mDrawable>
		try
		{
			zzpw1 = ((zzpw) (zzbkm.getUri()));
	//   27   51:aload_0         
	//   28   52:getfield        #22  <Field zzpw zzbkm>
	//   29   55:invokeinterface #50  <Method Uri zzpw.getUri()>
	//   30   60:astore_1        
		}
	//*  31   61:goto            74
		// Misplaced declaration of an exception variable
		catch(zzpw zzpw1)
	//*  32   64:astore_1        
		{
			zzane.zzb("", ((Throwable) (zzpw1)));
	//   33   65:ldc1            #38  <String "">
	//   34   67:aload_1         
	//   35   68:invokestatic    #44  <Method void zzane.zzb(String, Throwable)>
			zzpw1 = ((zzpw) (obj));
	//   36   71:aload           6
	//   37   73:astore_1        
		}
		mUri = ((Uri) (zzpw1));
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:putfield        #52  <Field Uri mUri>
		d = 1.0D;
	//   41   79:dconst_1        
	//   42   80:dstore_2        
		double d1 = zzbkm.getScale();
	//   43   81:aload_0         
	//   44   82:getfield        #22  <Field zzpw zzbkm>
	//   45   85:invokeinterface #56  <Method double zzpw.getScale()>
	//   46   90:dstore          4
		d = d1;
	//   47   92:dload           4
	//   48   94:dstore_2        
		break MISSING_BLOCK_LABEL_105;
	//   49   95:goto            105
		zzpw1;
	//   50   98:astore_1        
		zzane.zzb("", ((Throwable) (zzpw1)));
	//   51   99:ldc1            #38  <String "">
	//   52  101:aload_1         
	//   53  102:invokestatic    #44  <Method void zzane.zzb(String, Throwable)>
		zzbhv = d;
	//   54  105:aload_0         
	//   55  106:dload_2         
	//   56  107:putfield        #58  <Field double zzbhv>
		return;
	//   57  110:return          
	}

	public final Drawable getDrawable()
	{
		return mDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Drawable mDrawable>
	//    2    4:areturn         
	}

	public final double getScale()
	{
		return zzbhv;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field double zzbhv>
	//    2    4:dreturn         
	}

	public final Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Uri mUri>
	//    2    4:areturn         
	}

	private final Drawable mDrawable;
	private final Uri mUri;
	private final double zzbhv;
	private final zzpw zzbkm;
}
