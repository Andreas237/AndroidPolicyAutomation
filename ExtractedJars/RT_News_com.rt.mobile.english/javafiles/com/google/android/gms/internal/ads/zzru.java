// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzrr, zzpw, zzpy, zzpz, 
//			zzane, zzpv, zzse

public final class zzru extends UnifiedNativeAd
{

	public zzru(zzrr zzrr1)
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void UnifiedNativeAd()>
		zzbkx = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List zzbkx>
		zzbkz = new VideoController();
	//    7   15:aload_0         
	//    8   16:new             #30  <Class VideoController>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void VideoController()>
	//   11   23:putfield        #33  <Field VideoController zzbkz>
		zzbkw = zzrr1;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #35  <Field zzrr zzbkw>
		obj = null;
	//   15   31:aconst_null     
	//   16   32:astore_2        
		zzrr1 = ((zzrr) (zzbkw.getImages()));
	//   17   33:aload_0         
	//   18   34:getfield        #35  <Field zzrr zzbkw>
	//   19   37:invokeinterface #41  <Method List zzrr.getImages()>
	//   20   42:astore_1        
		if(zzrr1 == null) goto _L2; else goto _L1
	//   21   43:aload_1         
	//   22   44:ifnull          157
_L1:
		Iterator iterator = ((List) (zzrr1)).iterator();
	//   23   47:aload_1         
	//   24   48:invokeinterface #47  <Method Iterator List.iterator()>
	//   25   53:astore_3        
_L8:
		if(!iterator.hasNext()) goto _L2; else goto _L3
	//   26   54:aload_3         
	//   27   55:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            157
_L3:
		zzrr1 = ((zzrr) (iterator.next()));
	//   29   63:aload_3         
	//   30   64:invokeinterface #57  <Method Object Iterator.next()>
	//   31   69:astore_1        
		if(!(zzrr1 instanceof IBinder))
			break MISSING_BLOCK_LABEL_246;
	//   32   70:aload_1         
	//   33   71:instanceof      #59  <Class IBinder>
	//   34   74:ifeq            246
		zzrr1 = ((zzrr) ((IBinder)zzrr1));
	//   35   77:aload_1         
	//   36   78:checkcast       #59  <Class IBinder>
	//   37   81:astore_1        
		if(zzrr1 == null)
			break MISSING_BLOCK_LABEL_246;
	//   38   82:aload_1         
	//   39   83:ifnull          246
		android.os.IInterface iinterface = ((IBinder) (zzrr1)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//   40   86:aload_1         
	//   41   87:ldc1            #61  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//   42   89:invokeinterface #65  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   43   94:astore          4
		if(!(iinterface instanceof zzpw)) goto _L5; else goto _L4
	//   44   96:aload           4
	//   45   98:instanceof      #67  <Class zzpw>
	//   46  101:ifeq            113
_L4:
		zzrr1 = ((zzrr) ((zzpw)iinterface));
	//   47  104:aload           4
	//   48  106:checkcast       #67  <Class zzpw>
	//   49  109:astore_1        
		  goto _L6
	//*  50  110:goto            125
_L5:
		zzrr1 = ((zzrr) (new zzpy(((IBinder) (zzrr1)))));
	//   51  113:new             #69  <Class zzpy>
	//   52  116:dup             
	//   53  117:aload_1         
	//   54  118:invokespecial   #72  <Method void zzpy(IBinder)>
	//   55  121:astore_1        
	//*  56  122:goto            125
_L6:
		if(zzrr1 == null) goto _L8; else goto _L7
	//   57  125:aload_1         
	//   58  126:ifnull          54
_L7:
		zzbkx.add(((Object) (new zzpz(((zzpw) (zzrr1))))));
	//   59  129:aload_0         
	//   60  130:getfield        #28  <Field List zzbkx>
	//   61  133:new             #74  <Class zzpz>
	//   62  136:dup             
	//   63  137:aload_1         
	//   64  138:invokespecial   #77  <Method void zzpz(zzpw)>
	//   65  141:invokeinterface #81  <Method boolean List.add(Object)>
	//   66  146:pop             
		  goto _L8
	//*  67  147:goto            54
		zzrr1;
	//   68  150:astore_1        
		zzane.zzb("", ((Throwable) (zzrr1)));
	//   69  151:ldc1            #83  <String "">
	//   70  153:aload_1         
	//   71  154:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
_L2:
		zzrr1 = ((zzrr) (zzbkw.zzjz()));
	//   72  157:aload_0         
	//   73  158:getfield        #35  <Field zzrr zzbkw>
	//   74  161:invokeinterface #93  <Method zzpw zzrr.zzjz()>
	//   75  166:astore_1        
label0:
		{
			if(zzrr1 != null)
	//*  76  167:aload_1         
	//*  77  168:ifnull          190
				try
				{
					zzrr1 = ((zzrr) (new zzpz(((zzpw) (zzrr1)))));
	//   78  171:new             #74  <Class zzpz>
	//   79  174:dup             
	//   80  175:aload_1         
	//   81  176:invokespecial   #77  <Method void zzpz(zzpw)>
	//   82  179:astore_1        
					break label0;
	//   83  180:goto            192
				}
				// Misplaced declaration of an exception variable
				catch(zzrr zzrr1)
	//*  84  183:astore_1        
				{
					zzane.zzb("", ((Throwable) (zzrr1)));
	//   85  184:ldc1            #83  <String "">
	//   86  186:aload_1         
	//   87  187:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
				}
			zzrr1 = null;
	//   88  190:aconst_null     
	//   89  191:astore_1        
		}
		zzbky = ((zzpz) (zzrr1));
	//   90  192:aload_0         
	//   91  193:aload_1         
	//   92  194:putfield        #95  <Field zzpz zzbky>
		zzrr1 = ((zzrr) (obj));
	//   93  197:aload_2         
	//   94  198:astore_1        
		try
		{
			if(zzbkw.zzkf() != null)
	//*  95  199:aload_0         
	//*  96  200:getfield        #35  <Field zzrr zzbkw>
	//*  97  203:invokeinterface #99  <Method zzps zzrr.zzkf()>
	//*  98  208:ifnull          240
				zzrr1 = ((zzrr) (new zzpv(zzbkw.zzkf())));
	//   99  211:new             #101 <Class zzpv>
	//  100  214:dup             
	//  101  215:aload_0         
	//  102  216:getfield        #35  <Field zzrr zzbkw>
	//  103  219:invokeinterface #99  <Method zzps zzrr.zzkf()>
	//  104  224:invokespecial   #104 <Method void zzpv(zzps)>
	//  105  227:astore_1        
		}
	//* 106  228:goto            240
		// Misplaced declaration of an exception variable
		catch(zzrr zzrr1)
	//* 107  231:astore_1        
		{
			zzane.zzb("", ((Throwable) (zzrr1)));
	//  108  232:ldc1            #83  <String "">
	//  109  234:aload_1         
	//  110  235:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			zzrr1 = ((zzrr) (obj));
	//  111  238:aload_2         
	//  112  239:astore_1        
		}
		zzbla = ((com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo) (zzrr1));
	//  113  240:aload_0         
	//  114  241:aload_1         
	//  115  242:putfield        #106 <Field com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo zzbla>
		return;
	//  116  245:return          
		zzrr1 = null;
	//  117  246:aconst_null     
	//  118  247:astore_1        
		  goto _L6
	//* 119  248:goto            125
	}

	private final IObjectWrapper zzka()
	{
		IObjectWrapper iobjectwrapper;
		try
		{
			iobjectwrapper = zzbkw.zzka();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #111 <Method IObjectWrapper zzrr.zzka()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return iobjectwrapper;
	}

	public final void cancelUnconfirmedClick()
	{
		try
		{
			zzbkw.cancelUnconfirmedClick();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #114 <Method void zzrr.cancelUnconfirmedClick()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzb("Failed to cancelUnconfirmedClick", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #116 <String "Failed to cancelUnconfirmedClick">
	//    6   13:aload_1         
	//    7   14:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		}
	//    8   17:return          
	}

	public final void destroy()
	{
		try
		{
			zzbkw.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #119 <Method void zzrr.destroy()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #83  <String "">
	//    6   13:aload_1         
	//    7   14:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		}
	//    8   17:return          
	}

	public final com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo getAdChoicesInfo()
	{
		return zzbla;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo zzbla>
	//    2    4:areturn         
	}

	public final String getAdvertiser()
	{
		String s;
		try
		{
			s = zzbkw.getAdvertiser();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #125 <Method String zzrr.getAdvertiser()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final String getBody()
	{
		String s;
		try
		{
			s = zzbkw.getBody();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #128 <Method String zzrr.getBody()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final String getCallToAction()
	{
		String s;
		try
		{
			s = zzbkw.getCallToAction();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #131 <Method String zzrr.getCallToAction()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final Bundle getExtras()
	{
		Bundle bundle = zzbkw.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #135 <Method Bundle zzrr.getExtras()>
	//    3    9:astore_1        
		if(bundle != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          23
			return bundle;
	//    6   14:aload_1         
	//    7   15:areturn         
		break MISSING_BLOCK_LABEL_23;
		RemoteException remoteexception;
		remoteexception;
	//    8   16:astore_1        
		zzane.zzb("", ((Throwable) (remoteexception)));
	//    9   17:ldc1            #83  <String "">
	//   10   19:aload_1         
	//   11   20:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		return new Bundle();
	//   12   23:new             #137 <Class Bundle>
	//   13   26:dup             
	//   14   27:invokespecial   #138 <Method void Bundle()>
	//   15   30:areturn         
	}

	public final String getHeadline()
	{
		String s;
		try
		{
			s = zzbkw.getHeadline();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #141 <Method String zzrr.getHeadline()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final com.google.android.gms.ads.formats.NativeAd.Image getIcon()
	{
		return ((com.google.android.gms.ads.formats.NativeAd.Image) (zzbky));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field zzpz zzbky>
	//    2    4:areturn         
	}

	public final List getImages()
	{
		return zzbkx;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List zzbkx>
	//    2    4:areturn         
	}

	public final String getMediationAdapterClassName()
	{
		String s;
		try
		{
			s = zzbkw.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #148 <Method String zzrr.getMediationAdapterClassName()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final String getPrice()
	{
		String s;
		try
		{
			s = zzbkw.getPrice();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #151 <Method String zzrr.getPrice()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final Double getStarRating()
	{
		double d;
		try
		{
			d = zzbkw.getStarRating();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #156 <Method double zzrr.getStarRating()>
	//    3    9:dstore_1        
		}
	//*   4   10:dload_1         
	//*   5   11:ldc2w           #157 <Double -1D>
	//*   6   14:dcmpl           
	//*   7   15:ifne            20
	//*   8   18:aconst_null     
	//*   9   19:areturn         
	//*  10   20:dload_1         
	//*  11   21:invokestatic    #164 <Method Double Double.valueOf(double)>
	//*  12   24:areturn         
		catch(RemoteException remoteexception)
	//*  13   25:astore_3        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//   14   26:ldc1            #83  <String "">
	//   15   28:aload_3         
	//   16   29:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
		}
		if(d == -1D)
			return null;
		else
			return Double.valueOf(d);
	}

	public final String getStore()
	{
		String s;
		try
		{
			s = zzbkw.getStore();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #167 <Method String zzrr.getStore()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #83  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final VideoController getVideoController()
	{
		try
		{
			if(zzbkw.getVideoController() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field zzrr zzbkw>
	//*   2    4:invokeinterface #172 <Method zzlo zzrr.getVideoController()>
	//*   3    9:ifnull          38
				zzbkz.zza(zzbkw.getVideoController());
	//    4   12:aload_0         
	//    5   13:getfield        #33  <Field VideoController zzbkz>
	//    6   16:aload_0         
	//    7   17:getfield        #35  <Field zzrr zzbkw>
	//    8   20:invokeinterface #172 <Method zzlo zzrr.getVideoController()>
	//    9   25:invokevirtual   #176 <Method void VideoController.zza(zzlo)>
		}
	//*  10   28:goto            38
		catch(RemoteException remoteexception)
	//*  11   31:astore_1        
		{
			zzane.zzb("Exception occurred while getting video controller", ((Throwable) (remoteexception)));
	//   12   32:ldc1            #178 <String "Exception occurred while getting video controller">
	//   13   34:aload_1         
	//   14   35:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		}
		return zzbkz;
	//   15   38:aload_0         
	//   16   39:getfield        #33  <Field VideoController zzbkz>
	//   17   42:areturn         
	}

	public final void performClick(Bundle bundle)
	{
		try
		{
			zzbkw.performClick(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #182 <Method void zzrr.performClick(Bundle)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   5   11:astore_1        
		{
			zzane.zzb("", ((Throwable) (bundle)));
	//    6   12:ldc1            #83  <String "">
	//    7   14:aload_1         
	//    8   15:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		}
	//    9   18:return          
	}

	public final boolean recordImpression(Bundle bundle)
	{
		boolean flag;
		try
		{
			flag = zzbkw.recordImpression(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #186 <Method boolean zzrr.recordImpression(Bundle)>
	//    4   10:istore_2        
		}
	//*   5   11:iload_2         
	//*   6   12:ireturn         
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   7   13:astore_1        
		{
			zzane.zzb("", ((Throwable) (bundle)));
	//    8   14:ldc1            #83  <String "">
	//    9   16:aload_1         
	//   10   17:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
		}
		return flag;
	}

	public final void reportTouchEvent(Bundle bundle)
	{
		try
		{
			zzbkw.reportTouchEvent(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #189 <Method void zzrr.reportTouchEvent(Bundle)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   5   11:astore_1        
		{
			zzane.zzb("", ((Throwable) (bundle)));
	//    6   12:ldc1            #83  <String "">
	//    7   14:aload_1         
	//    8   15:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		}
	//    9   18:return          
	}

	public final void setUnconfirmedClickListener(com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener unconfirmedclicklistener)
	{
		try
		{
			zzbkw.zza(((zzro) (new zzse(unconfirmedclicklistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:new             #193 <Class zzse>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #195 <Method void zzse(com.google.android.gms.ads.formats.UnifiedNativeAd$UnconfirmedClickListener)>
	//    6   12:invokeinterface #198 <Method void zzrr.zza(zzro)>
			return;
	//    7   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener unconfirmedclicklistener)
	//*   8   18:astore_1        
		{
			zzane.zzb("Failed to setUnconfirmedClickListener", ((Throwable) (unconfirmedclicklistener)));
	//    9   19:ldc1            #200 <String "Failed to setUnconfirmedClickListener">
	//   10   21:aload_1         
	//   11   22:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		}
	//   12   25:return          
	}

	protected final Object zzbe()
	{
		return ((Object) (zzka()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #202 <Method IObjectWrapper zzka()>
	//    2    4:areturn         
	}

	public final Object zzbh()
	{
		Object obj = ((Object) (zzbkw.zzke()));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzrr zzbkw>
	//    2    4:invokeinterface #206 <Method IObjectWrapper zzrr.zzke()>
	//    3    9:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_28;
	//    4   10:aload_1         
	//    5   11:ifnull          28
		obj = ObjectWrapper.unwrap(((IObjectWrapper) (obj)));
	//    6   14:aload_1         
	//    7   15:invokestatic    #212 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    8   18:astore_1        
		return obj;
	//    9   19:aload_1         
	//   10   20:areturn         
		RemoteException remoteexception;
		remoteexception;
	//   11   21:astore_1        
		zzane.zzb("", ((Throwable) (remoteexception)));
	//   12   22:ldc1            #83  <String "">
	//   13   24:aload_1         
	//   14   25:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		return ((Object) (null));
	//   15   28:aconst_null     
	//   16   29:areturn         
	}

	private final zzrr zzbkw;
	private final List zzbkx;
	private final zzpz zzbky;
	private final VideoController zzbkz;
	private final com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo zzbla;
}
