// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Random;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzki, zzkh, zzud, zznk, 
//			zzkb, zzni, zzakk, zztv, 
//			zztw

final class zztu extends zzki
{

	zztu(zzkh zzkh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzki()>
		zzboi = zzkh1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field zzkh zzboi>
	//    5    9:return          
	}

	public final void onAdClicked()
		throws RemoteException
	{
		zzboi.onAdClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzkh zzboi>
	//    2    4:invokeinterface #21  <Method void zzkh.onAdClicked()>
	//    3    9:return          
	}

	public final void onAdClosed()
		throws RemoteException
	{
		if(zzud.zzlv())
	//*   0    0:invokestatic    #29  <Method boolean zzud.zzlv()>
	//*   1    3:ifeq            94
		{
			zzna zzna = zznk.zzazg;
	//    2    6:getstatic       #35  <Field zzna zznk.zzazg>
	//    3    9:astore          5
			int i = ((Integer)zzkb.zzik().zzd(zzna)).intValue();
	//    4   11:invokestatic    #41  <Method zzni zzkb.zzik()>
	//    5   14:aload           5
	//    6   16:invokevirtual   #47  <Method Object zzni.zzd(zzna)>
	//    7   19:checkcast       #49  <Class Integer>
	//    8   22:invokevirtual   #53  <Method int Integer.intValue()>
	//    9   25:istore_1        
			zzna = zznk.zzazh;
	//   10   26:getstatic       #56  <Field zzna zznk.zzazh>
	//   11   29:astore          5
			int j = ((Integer)zzkb.zzik().zzd(zzna)).intValue();
	//   12   31:invokestatic    #41  <Method zzni zzkb.zzik()>
	//   13   34:aload           5
	//   14   36:invokevirtual   #47  <Method Object zzni.zzd(zzna)>
	//   15   39:checkcast       #49  <Class Integer>
	//   16   42:invokevirtual   #53  <Method int Integer.intValue()>
	//   17   45:istore_2        
			if(i > 0 && j >= 0)
	//*  18   46:iload_1         
	//*  19   47:ifle            88
	//*  20   50:iload_2         
	//*  21   51:ifge            57
	//*  22   54:goto            88
			{
				long l = i + (new Random()).nextInt(j + 1);
	//   23   57:iload_1         
	//   24   58:new             #58  <Class Random>
	//   25   61:dup             
	//   26   62:invokespecial   #59  <Method void Random()>
	//   27   65:iload_2         
	//   28   66:iconst_1        
	//   29   67:iadd            
	//   30   68:invokevirtual   #63  <Method int Random.nextInt(int)>
	//   31   71:iadd            
	//   32   72:i2l             
	//   33   73:lstore_3        
				zzakk.zzcrm.postDelayed(zztv.zzboj, l);
	//   34   74:getstatic       #69  <Field Handler zzakk.zzcrm>
	//   35   77:getstatic       #75  <Field Runnable zztv.zzboj>
	//   36   80:lload_3         
	//   37   81:invokevirtual   #81  <Method boolean Handler.postDelayed(Runnable, long)>
	//   38   84:pop             
			} else
	//*  39   85:goto            94
			{
				zzbv.zzex().zzld();
	//   40   88:invokestatic    #87  <Method zztw zzbv.zzex()>
	//   41   91:invokevirtual   #92  <Method void zztw.zzld()>
			}
		}
		zzboi.onAdClosed();
	//   42   94:aload_0         
	//   43   95:getfield        #13  <Field zzkh zzboi>
	//   44   98:invokeinterface #94  <Method void zzkh.onAdClosed()>
	//   45  103:return          
	}

	public final void onAdFailedToLoad(int i)
		throws RemoteException
	{
		zzboi.onAdFailedToLoad(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzkh zzboi>
	//    2    4:iload_1         
	//    3    5:invokeinterface #98  <Method void zzkh.onAdFailedToLoad(int)>
	//    4   10:return          
	}

	public final void onAdImpression()
		throws RemoteException
	{
		zzboi.onAdImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzkh zzboi>
	//    2    4:invokeinterface #101 <Method void zzkh.onAdImpression()>
	//    3    9:return          
	}

	public final void onAdLeftApplication()
		throws RemoteException
	{
		zzboi.onAdLeftApplication();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzkh zzboi>
	//    2    4:invokeinterface #104 <Method void zzkh.onAdLeftApplication()>
	//    3    9:return          
	}

	public final void onAdLoaded()
		throws RemoteException
	{
		zzboi.onAdLoaded();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzkh zzboi>
	//    2    4:invokeinterface #107 <Method void zzkh.onAdLoaded()>
	//    3    9:return          
	}

	public final void onAdOpened()
		throws RemoteException
	{
		zzboi.onAdOpened();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzkh zzboi>
	//    2    4:invokeinterface #110 <Method void zzkh.onAdOpened()>
	//    3    9:return          
	}

	private final zzkh zzboi;
}
