// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzrj, zzks, zzjf, zzane, 
//			zzjp, zzamu, zzsc

public final class zzsb extends zzrj
{

	public zzsb(OnPublisherAdViewLoadedListener onpublisheradviewloadedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzrj()>
		zzblf = onpublisheradviewloadedlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field OnPublisherAdViewLoadedListener zzblf>
	//    5    9:return          
	}

	static OnPublisherAdViewLoadedListener zza(zzsb zzsb1)
	{
		return zzsb1.zzblf;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field OnPublisherAdViewLoadedListener zzblf>
	//    2    4:areturn         
	}

	public final void zza(zzks zzks1, IObjectWrapper iobjectwrapper)
	{
		if(zzks1 == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          147
_L1:
		Object obj;
		PublisherAdView publisheradview;
		if(iobjectwrapper == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
		publisheradview = new PublisherAdView((Context)ObjectWrapper.unwrap(iobjectwrapper));
	//    5    9:new             #21  <Class PublisherAdView>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokestatic    #27  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    9   17:checkcast       #29  <Class Context>
	//   10   20:invokespecial   #32  <Method void PublisherAdView(Context)>
	//   11   23:astore          4
		obj = null;
	//   12   25:aconst_null     
	//   13   26:astore_3        
		if(!(zzks1.zzbx() instanceof zzjf)) goto _L4; else goto _L3
	//   14   27:aload_1         
	//   15   28:invokeinterface #38  <Method zzkh zzks.zzbx()>
	//   16   33:instanceof      #40  <Class zzjf>
	//   17   36:ifeq            77
_L3:
		iobjectwrapper = ((IObjectWrapper) ((zzjf)zzks1.zzbx()));
	//   18   39:aload_1         
	//   19   40:invokeinterface #38  <Method zzkh zzks.zzbx()>
	//   20   45:checkcast       #40  <Class zzjf>
	//   21   48:astore_2        
		if(iobjectwrapper == null) goto _L6; else goto _L5
	//   22   49:aload_2         
	//   23   50:ifnull          148
_L5:
		iobjectwrapper = ((IObjectWrapper) (((zzjf) (iobjectwrapper)).getAdListener()));
	//   24   53:aload_2         
	//   25   54:invokevirtual   #44  <Method com.google.android.gms.ads.AdListener zzjf.getAdListener()>
	//   26   57:astore_2        
	//*  27   58:goto            61
_L8:
		try
		{
			publisheradview.setAdListener(((com.google.android.gms.ads.AdListener) (iobjectwrapper)));
	//   28   61:aload           4
	//   29   63:aload_2         
	//   30   64:invokevirtual   #48  <Method void PublisherAdView.setAdListener(com.google.android.gms.ads.AdListener)>
		}
	//*  31   67:goto            77
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  32   70:astore_2        
		{
			zzane.zzb("", ((Throwable) (iobjectwrapper)));
	//   33   71:ldc1            #50  <String "">
	//   34   73:aload_2         
	//   35   74:invokestatic    #56  <Method void zzane.zzb(String, Throwable)>
		}
_L4:
		zzjp zzjp1;
		if(!(zzks1.zzbw() instanceof zzjp))
			break MISSING_BLOCK_LABEL_129;
	//   36   77:aload_1         
	//   37   78:invokeinterface #60  <Method zzla zzks.zzbw()>
	//   38   83:instanceof      #62  <Class zzjp>
	//   39   86:ifeq            129
		zzjp1 = (zzjp)zzks1.zzbw();
	//   40   89:aload_1         
	//   41   90:invokeinterface #60  <Method zzla zzks.zzbw()>
	//   42   95:checkcast       #62  <Class zzjp>
	//   43   98:astore          5
		iobjectwrapper = ((IObjectWrapper) (obj));
	//   44  100:aload_3         
	//   45  101:astore_2        
		if(zzjp1 == null)
			break MISSING_BLOCK_LABEL_113;
	//   46  102:aload           5
	//   47  104:ifnull          113
		iobjectwrapper = ((IObjectWrapper) (zzjp1.getAppEventListener()));
	//   48  107:aload           5
	//   49  109:invokevirtual   #66  <Method com.google.android.gms.ads.doubleclick.AppEventListener zzjp.getAppEventListener()>
	//   50  112:astore_2        
		publisheradview.setAppEventListener(((com.google.android.gms.ads.doubleclick.AppEventListener) (iobjectwrapper)));
	//   51  113:aload           4
	//   52  115:aload_2         
	//   53  116:invokevirtual   #70  <Method void PublisherAdView.setAppEventListener(com.google.android.gms.ads.doubleclick.AppEventListener)>
		break MISSING_BLOCK_LABEL_129;
	//   54  119:goto            129
		iobjectwrapper;
	//   55  122:astore_2        
		zzane.zzb("", ((Throwable) (iobjectwrapper)));
	//   56  123:ldc1            #50  <String "">
	//   57  125:aload_2         
	//   58  126:invokestatic    #56  <Method void zzane.zzb(String, Throwable)>
		zzamu.zzsy.post(((Runnable) (new zzsc(this, publisheradview, zzks1))));
	//   59  129:getstatic       #76  <Field Handler zzamu.zzsy>
	//   60  132:new             #78  <Class zzsc>
	//   61  135:dup             
	//   62  136:aload_0         
	//   63  137:aload           4
	//   64  139:aload_1         
	//   65  140:invokespecial   #81  <Method void zzsc(zzsb, PublisherAdView, zzks)>
	//   66  143:invokevirtual   #87  <Method boolean Handler.post(Runnable)>
	//   67  146:pop             
_L2:
		return;
	//   68  147:return          
_L6:
		iobjectwrapper = null;
	//   69  148:aconst_null     
	//   70  149:astore_2        
		if(true) goto _L8; else goto _L7
	//   71  150:goto            61
_L7:
	}

	private final OnPublisherAdViewLoadedListener zzblf;
}
