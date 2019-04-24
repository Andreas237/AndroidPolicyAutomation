// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzqs, zzane, zzpz

public final class zzqv
	implements NativeCustomTemplateAd
{

	private zzqv(zzqs zzqs1)
	{
		Object obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		zzasv = new VideoController();
	//    2    4:aload_0         
	//    3    5:new             #35  <Class VideoController>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void VideoController()>
	//    6   12:putfield        #38  <Field VideoController zzasv>
		zzbku = zzqs1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #40  <Field zzqs zzbku>
		obj = null;
	//   10   20:aconst_null     
	//   11   21:astore          4
		MediaView mediaview;
		try
		{
			zzqs1 = ((zzqs) ((Context)ObjectWrapper.unwrap(zzqs1.zzkh())));
	//   12   23:aload_1         
	//   13   24:invokeinterface #46  <Method com.google.android.gms.dynamic.IObjectWrapper zzqs.zzkh()>
	//   14   29:invokestatic    #52  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   15   32:checkcast       #54  <Class Context>
	//   16   35:astore_1        
		}
	//*  17   36:goto            48
		// Misplaced declaration of an exception variable
		catch(zzqs zzqs1)
	//*  18   39:astore_1        
		{
			zzane.zzb("", ((Throwable) (zzqs1)));
	//   19   40:ldc1            #56  <String "">
	//   20   42:aload_1         
	//   21   43:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
			zzqs1 = null;
	//   22   46:aconst_null     
	//   23   47:astore_1        
		}
		mediaview = ((MediaView) (obj));
	//   24   48:aload           4
	//   25   50:astore_3        
		if(zzqs1 == null)
			break MISSING_BLOCK_LABEL_101;
	//   26   51:aload_1         
	//   27   52:ifnull          101
		mediaview = new MediaView(((Context) (zzqs1)));
	//   28   55:new             #64  <Class MediaView>
	//   29   58:dup             
	//   30   59:aload_1         
	//   31   60:invokespecial   #67  <Method void MediaView(Context)>
	//   32   63:astore_3        
		boolean flag = zzbku.zzh(ObjectWrapper.wrap(((Object) (mediaview))));
	//   33   64:aload_0         
	//   34   65:getfield        #40  <Field zzqs zzbku>
	//   35   68:aload_3         
	//   36   69:invokestatic    #71  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   37   72:invokeinterface #75  <Method boolean zzqs.zzh(com.google.android.gms.dynamic.IObjectWrapper)>
	//   38   77:istore_2        
		if(!flag)
	//*  39   78:iload_2         
	//*  40   79:ifne            88
			mediaview = ((MediaView) (obj));
	//   41   82:aload           4
	//   42   84:astore_3        
		break MISSING_BLOCK_LABEL_101;
	//   43   85:goto            101
	//*  44   88:goto            101
		zzqs1;
	//   45   91:astore_1        
		zzane.zzb("", ((Throwable) (zzqs1)));
	//   46   92:ldc1            #56  <String "">
	//   47   94:aload_1         
	//   48   95:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
		mediaview = ((MediaView) (obj));
	//   49   98:aload           4
	//   50  100:astore_3        
		zzbkv = mediaview;
	//   51  101:aload_0         
	//   52  102:aload_3         
	//   53  103:putfield        #77  <Field MediaView zzbkv>
		return;
	//   54  106:return          
	}

	public static zzqv zza(zzqs zzqs1)
	{
		WeakHashMap weakhashmap = zzbkt;
	//    0    0:getstatic       #25  <Field WeakHashMap zzbkt>
	//    1    3:astore_1        
		weakhashmap;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		zzqv zzqv1 = (zzqv)zzbkt.get(((Object) (zzqs1.asBinder())));
	//    4    6:getstatic       #25  <Field WeakHashMap zzbkt>
	//    5    9:aload_0         
	//    6   10:invokeinterface #84  <Method android.os.IBinder zzqs.asBinder()>
	//    7   15:invokevirtual   #88  <Method Object WeakHashMap.get(Object)>
	//    8   18:checkcast       #2   <Class zzqv>
	//    9   21:astore_2        
		if(zzqv1 == null)
			break MISSING_BLOCK_LABEL_30;
	//   10   22:aload_2         
	//   11   23:ifnull          30
		weakhashmap;
	//   12   26:aload_1         
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return zzqv1;
	//   14   28:aload_2         
	//   15   29:areturn         
		zzqv1 = new zzqv(zzqs1);
	//   16   30:new             #2   <Class zzqv>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #90  <Method void zzqv(zzqs)>
	//   20   38:astore_2        
		zzbkt.put(((Object) (zzqs1.asBinder())), ((Object) (zzqv1)));
	//   21   39:getstatic       #25  <Field WeakHashMap zzbkt>
	//   22   42:aload_0         
	//   23   43:invokeinterface #84  <Method android.os.IBinder zzqs.asBinder()>
	//   24   48:aload_2         
	//   25   49:invokevirtual   #94  <Method Object WeakHashMap.put(Object, Object)>
	//   26   52:pop             
		weakhashmap;
	//   27   53:aload_1         
		JVM INSTR monitorexit ;
	//   28   54:monitorexit     
		return zzqv1;
	//   29   55:aload_2         
	//   30   56:areturn         
		zzqs1;
	//   31   57:astore_0        
		weakhashmap;
	//   32   58:aload_1         
		JVM INSTR monitorexit ;
	//   33   59:monitorexit     
		throw zzqs1;
	//   34   60:aload_0         
	//   35   61:athrow          
	}

	public final void destroy()
	{
		try
		{
			zzbku.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:invokeinterface #97  <Method void zzqs.destroy()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #56  <String "">
	//    6   13:aload_1         
	//    7   14:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
		}
	//    8   17:return          
	}

	public final List getAvailableAssetNames()
	{
		List list;
		try
		{
			list = zzbku.getAvailableAssetNames();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:invokeinterface #101 <Method List zzqs.getAvailableAssetNames()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return list;
	}

	public final String getCustomTemplateId()
	{
		String s;
		try
		{
			s = zzbku.getCustomTemplateId();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:invokeinterface #107 <Method String zzqs.getCustomTemplateId()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #56  <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final com.google.android.gms.ads.formats.NativeAd.Image getImage(String s)
	{
		s = ((String) (zzbku.zzap(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:aload_1         
	//    3    5:invokeinterface #113 <Method zzpw zzqs.zzap(String)>
	//    4   10:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_33;
	//    5   11:aload_1         
	//    6   12:ifnull          33
		s = ((String) (new zzpz(((zzpw) (s)))));
	//    7   15:new             #115 <Class zzpz>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #118 <Method void zzpz(zzpw)>
	//   11   23:astore_1        
		return ((com.google.android.gms.ads.formats.NativeAd.Image) (s));
	//   12   24:aload_1         
	//   13   25:areturn         
		s;
	//   14   26:astore_1        
		zzane.zzb("", ((Throwable) (s)));
	//   15   27:ldc1            #56  <String "">
	//   16   29:aload_1         
	//   17   30:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
		return null;
	//   18   33:aconst_null     
	//   19   34:areturn         
	}

	public final CharSequence getText(String s)
	{
		try
		{
			s = zzbku.zzao(s);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:aload_1         
	//    3    5:invokeinterface #124 <Method String zzqs.zzao(String)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   13:astore_1        
		{
			zzane.zzb("", ((Throwable) (s)));
	//    8   14:ldc1            #56  <String "">
	//    9   16:aload_1         
	//   10   17:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
			return null;
	//   11   20:aconst_null     
	//   12   21:areturn         
		}
		return ((CharSequence) (s));
	}

	public final VideoController getVideoController()
	{
		zzlo zzlo = zzbku.getVideoController();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:invokeinterface #129 <Method zzlo zzqs.getVideoController()>
	//    3    9:astore_1        
		if(zzlo != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          32
			try
			{
				zzasv.zza(zzlo);
	//    6   14:aload_0         
	//    7   15:getfield        #38  <Field VideoController zzasv>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #132 <Method void VideoController.zza(zzlo)>
			}
	//*  10   22:goto            32
			catch(RemoteException remoteexception)
	//*  11   25:astore_1        
			{
				zzane.zzb("Exception occurred while getting video controller", ((Throwable) (remoteexception)));
	//   12   26:ldc1            #134 <String "Exception occurred while getting video controller">
	//   13   28:aload_1         
	//   14   29:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
			}
		return zzasv;
	//   15   32:aload_0         
	//   16   33:getfield        #38  <Field VideoController zzasv>
	//   17   36:areturn         
	}

	public final MediaView getVideoMediaView()
	{
		return zzbkv;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field MediaView zzbkv>
	//    2    4:areturn         
	}

	public final void performClick(String s)
	{
		try
		{
			zzbku.performClick(s);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:aload_1         
	//    3    5:invokeinterface #140 <Method void zzqs.performClick(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			zzane.zzb("", ((Throwable) (s)));
	//    6   12:ldc1            #56  <String "">
	//    7   14:aload_1         
	//    8   15:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
		}
	//    9   18:return          
	}

	public final void recordImpression()
	{
		try
		{
			zzbku.recordImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:invokeinterface #143 <Method void zzqs.recordImpression()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzb("", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #56  <String "">
	//    6   13:aload_1         
	//    7   14:invokestatic    #62  <Method void zzane.zzb(String, Throwable)>
		}
	//    8   17:return          
	}

	public final zzqs zzku()
	{
		return zzbku;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzqs zzbku>
	//    2    4:areturn         
	}

	private static WeakHashMap zzbkt = new WeakHashMap();
	private final VideoController zzasv;
	private final zzqs zzbku;
	private final MediaView zzbkv;

	static 
	{
	//    0    0:new             #20  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void WeakHashMap()>
	//    3    7:putstatic       #25  <Field WeakHashMap zzbkt>
	//*   4   10:return          
	}
}
