// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzqk, zzpw, zzpy, zzpz, 
//			zzane, zzpv

public final class zzqn extends NativeAppInstallAd
{

	public zzqn(zzqk zzqk1)
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void NativeAppInstallAd()>
		zzbko = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List zzbko>
		zzasv = new VideoController();
	//    7   15:aload_0         
	//    8   16:new             #30  <Class VideoController>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void VideoController()>
	//   11   23:putfield        #33  <Field VideoController zzasv>
		zzbkn = zzqk1;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #35  <Field zzqk zzbkn>
		obj = null;
	//   15   31:aconst_null     
	//   16   32:astore_2        
		zzqk1 = ((zzqk) (zzbkn.getImages()));
	//   17   33:aload_0         
	//   18   34:getfield        #35  <Field zzqk zzbkn>
	//   19   37:invokeinterface #41  <Method List zzqk.getImages()>
	//   20   42:astore_1        
		if(zzqk1 == null) goto _L2; else goto _L1
	//   21   43:aload_1         
	//   22   44:ifnull          157
_L1:
		Iterator iterator = ((List) (zzqk1)).iterator();
	//   23   47:aload_1         
	//   24   48:invokeinterface #47  <Method Iterator List.iterator()>
	//   25   53:astore_3        
_L8:
		if(!iterator.hasNext()) goto _L2; else goto _L3
	//   26   54:aload_3         
	//   27   55:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   28   60:ifeq            157
_L3:
		zzqk1 = ((zzqk) (iterator.next()));
	//   29   63:aload_3         
	//   30   64:invokeinterface #57  <Method Object Iterator.next()>
	//   31   69:astore_1        
		if(!(zzqk1 instanceof IBinder))
			break MISSING_BLOCK_LABEL_246;
	//   32   70:aload_1         
	//   33   71:instanceof      #59  <Class IBinder>
	//   34   74:ifeq            246
		zzqk1 = ((zzqk) ((IBinder)zzqk1));
	//   35   77:aload_1         
	//   36   78:checkcast       #59  <Class IBinder>
	//   37   81:astore_1        
		if(zzqk1 == null)
			break MISSING_BLOCK_LABEL_246;
	//   38   82:aload_1         
	//   39   83:ifnull          246
		android.os.IInterface iinterface = ((IBinder) (zzqk1)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
	//   40   86:aload_1         
	//   41   87:ldc1            #61  <String "com.google.android.gms.ads.internal.formats.client.INativeAdImage">
	//   42   89:invokeinterface #65  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   43   94:astore          4
		if(!(iinterface instanceof zzpw)) goto _L5; else goto _L4
	//   44   96:aload           4
	//   45   98:instanceof      #67  <Class zzpw>
	//   46  101:ifeq            113
_L4:
		zzqk1 = ((zzqk) ((zzpw)iinterface));
	//   47  104:aload           4
	//   48  106:checkcast       #67  <Class zzpw>
	//   49  109:astore_1        
		  goto _L6
	//*  50  110:goto            125
_L5:
		zzqk1 = ((zzqk) (new zzpy(((IBinder) (zzqk1)))));
	//   51  113:new             #69  <Class zzpy>
	//   52  116:dup             
	//   53  117:aload_1         
	//   54  118:invokespecial   #72  <Method void zzpy(IBinder)>
	//   55  121:astore_1        
	//*  56  122:goto            125
_L6:
		if(zzqk1 == null) goto _L8; else goto _L7
	//   57  125:aload_1         
	//   58  126:ifnull          54
_L7:
		zzbko.add(((Object) (new zzpz(((zzpw) (zzqk1))))));
	//   59  129:aload_0         
	//   60  130:getfield        #28  <Field List zzbko>
	//   61  133:new             #74  <Class zzpz>
	//   62  136:dup             
	//   63  137:aload_1         
	//   64  138:invokespecial   #77  <Method void zzpz(zzpw)>
	//   65  141:invokeinterface #81  <Method boolean List.add(Object)>
	//   66  146:pop             
		  goto _L8
	//*  67  147:goto            54
		zzqk1;
	//   68  150:astore_1        
		zzane.zzb("", ((Throwable) (zzqk1)));
	//   69  151:ldc1            #83  <String "">
	//   70  153:aload_1         
	//   71  154:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
_L2:
		zzqk1 = ((zzqk) (zzbkn.zzjz()));
	//   72  157:aload_0         
	//   73  158:getfield        #35  <Field zzqk zzbkn>
	//   74  161:invokeinterface #93  <Method zzpw zzqk.zzjz()>
	//   75  166:astore_1        
label0:
		{
			if(zzqk1 != null)
	//*  76  167:aload_1         
	//*  77  168:ifnull          190
				try
				{
					zzqk1 = ((zzqk) (new zzpz(((zzpw) (zzqk1)))));
	//   78  171:new             #74  <Class zzpz>
	//   79  174:dup             
	//   80  175:aload_1         
	//   81  176:invokespecial   #77  <Method void zzpz(zzpw)>
	//   82  179:astore_1        
					break label0;
	//   83  180:goto            192
				}
				// Misplaced declaration of an exception variable
				catch(zzqk zzqk1)
	//*  84  183:astore_1        
				{
					zzane.zzb("", ((Throwable) (zzqk1)));
	//   85  184:ldc1            #83  <String "">
	//   86  186:aload_1         
	//   87  187:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
				}
			zzqk1 = null;
	//   88  190:aconst_null     
	//   89  191:astore_1        
		}
		zzbkp = ((zzpz) (zzqk1));
	//   90  192:aload_0         
	//   91  193:aload_1         
	//   92  194:putfield        #95  <Field zzpz zzbkp>
		zzqk1 = ((zzqk) (obj));
	//   93  197:aload_2         
	//   94  198:astore_1        
		try
		{
			if(zzbkn.zzkf() != null)
	//*  95  199:aload_0         
	//*  96  200:getfield        #35  <Field zzqk zzbkn>
	//*  97  203:invokeinterface #99  <Method zzps zzqk.zzkf()>
	//*  98  208:ifnull          240
				zzqk1 = ((zzqk) (new zzpv(zzbkn.zzkf())));
	//   99  211:new             #101 <Class zzpv>
	//  100  214:dup             
	//  101  215:aload_0         
	//  102  216:getfield        #35  <Field zzqk zzbkn>
	//  103  219:invokeinterface #99  <Method zzps zzqk.zzkf()>
	//  104  224:invokespecial   #104 <Method void zzpv(zzps)>
	//  105  227:astore_1        
		}
	//* 106  228:goto            240
		// Misplaced declaration of an exception variable
		catch(zzqk zzqk1)
	//* 107  231:astore_1        
		{
			zzane.zzb("", ((Throwable) (zzqk1)));
	//  108  232:ldc1            #83  <String "">
	//  109  234:aload_1         
	//  110  235:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
			zzqk1 = ((zzqk) (obj));
	//  111  238:aload_2         
	//  112  239:astore_1        
		}
		zzbkq = ((com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo) (zzqk1));
	//  113  240:aload_0         
	//  114  241:aload_1         
	//  115  242:putfield        #106 <Field com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo zzbkq>
		return;
	//  116  245:return          
		zzqk1 = null;
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
			iobjectwrapper = zzbkn.zzka();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #111 <Method IObjectWrapper zzqk.zzka()>
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

	public final void destroy()
	{
		try
		{
			zzbkn.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #114 <Method void zzqk.destroy()>
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
		return zzbkq;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo zzbkq>
	//    2    4:areturn         
	}

	public final CharSequence getBody()
	{
		String s;
		try
		{
			s = zzbkn.getBody();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #121 <Method String zzqk.getBody()>
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
		return ((CharSequence) (s));
	}

	public final CharSequence getCallToAction()
	{
		String s;
		try
		{
			s = zzbkn.getCallToAction();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #124 <Method String zzqk.getCallToAction()>
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
		return ((CharSequence) (s));
	}

	public final Bundle getExtras()
	{
		Bundle bundle;
		try
		{
			bundle = zzbkn.getExtras();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #128 <Method Bundle zzqk.getExtras()>
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
		return bundle;
	}

	public final CharSequence getHeadline()
	{
		String s;
		try
		{
			s = zzbkn.getHeadline();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #131 <Method String zzqk.getHeadline()>
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
		return ((CharSequence) (s));
	}

	public final com.google.android.gms.ads.formats.NativeAd.Image getIcon()
	{
		return ((com.google.android.gms.ads.formats.NativeAd.Image) (zzbkp));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field zzpz zzbkp>
	//    2    4:areturn         
	}

	public final List getImages()
	{
		return zzbko;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List zzbko>
	//    2    4:areturn         
	}

	public final CharSequence getMediationAdapterClassName()
	{
		String s;
		try
		{
			s = zzbkn.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #138 <Method String zzqk.getMediationAdapterClassName()>
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
		return ((CharSequence) (s));
	}

	public final CharSequence getPrice()
	{
		String s;
		try
		{
			s = zzbkn.getPrice();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #141 <Method String zzqk.getPrice()>
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
		return ((CharSequence) (s));
	}

	public final Double getStarRating()
	{
		double d;
		try
		{
			d = zzbkn.getStarRating();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #146 <Method double zzqk.getStarRating()>
	//    3    9:dstore_1        
		}
	//*   4   10:dload_1         
	//*   5   11:ldc2w           #147 <Double -1D>
	//*   6   14:dcmpl           
	//*   7   15:ifne            20
	//*   8   18:aconst_null     
	//*   9   19:areturn         
	//*  10   20:dload_1         
	//*  11   21:invokestatic    #154 <Method Double Double.valueOf(double)>
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

	public final CharSequence getStore()
	{
		String s;
		try
		{
			s = zzbkn.getStore();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:invokeinterface #157 <Method String zzqk.getStore()>
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
		return ((CharSequence) (s));
	}

	public final VideoController getVideoController()
	{
		try
		{
			if(zzbkn.getVideoController() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field zzqk zzbkn>
	//*   2    4:invokeinterface #162 <Method zzlo zzqk.getVideoController()>
	//*   3    9:ifnull          38
				zzasv.zza(zzbkn.getVideoController());
	//    4   12:aload_0         
	//    5   13:getfield        #33  <Field VideoController zzasv>
	//    6   16:aload_0         
	//    7   17:getfield        #35  <Field zzqk zzbkn>
	//    8   20:invokeinterface #162 <Method zzlo zzqk.getVideoController()>
	//    9   25:invokevirtual   #166 <Method void VideoController.zza(zzlo)>
		}
	//*  10   28:goto            38
		catch(RemoteException remoteexception)
	//*  11   31:astore_1        
		{
			zzane.zzb("Exception occurred while getting video controller", ((Throwable) (remoteexception)));
	//   12   32:ldc1            #168 <String "Exception occurred while getting video controller">
	//   13   34:aload_1         
	//   14   35:invokestatic    #89  <Method void zzane.zzb(String, Throwable)>
		}
		return zzasv;
	//   15   38:aload_0         
	//   16   39:getfield        #33  <Field VideoController zzasv>
	//   17   42:areturn         
	}

	public final void performClick(Bundle bundle)
	{
		try
		{
			zzbkn.performClick(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #172 <Method void zzqk.performClick(Bundle)>
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
			flag = zzbkn.recordImpression(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method boolean zzqk.recordImpression(Bundle)>
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
			zzbkn.reportTouchEvent(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzqk zzbkn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #179 <Method void zzqk.reportTouchEvent(Bundle)>
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

	protected final Object zzbe()
	{
		return ((Object) (zzka()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method IObjectWrapper zzka()>
	//    2    4:areturn         
	}

	private final VideoController zzasv;
	private final zzqk zzbkn;
	private final List zzbko;
	private final zzpz zzbkp;
	private final com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo zzbkq;
}
