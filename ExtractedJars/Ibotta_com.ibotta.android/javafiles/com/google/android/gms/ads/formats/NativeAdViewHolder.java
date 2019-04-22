// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.*;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.ads.formats:
//			NativeAdView, UnifiedNativeAdView, NativeAd, UnifiedNativeAd

public final class NativeAdViewHolder
{

	public NativeAdViewHolder(View view, Map map, Map map1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		Preconditions.checkNotNull(((Object) (view)), "ContainerView must not be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #26  <String "ContainerView must not be null">
	//    4    7:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		if(!(view instanceof NativeAdView) && !(view instanceof UnifiedNativeAdView))
	//*   6   11:aload_1         
	//*   7   12:instanceof      #34  <Class NativeAdView>
	//*   8   15:ifne            89
	//*   9   18:aload_1         
	//*  10   19:instanceof      #36  <Class UnifiedNativeAdView>
	//*  11   22:ifeq            28
	//*  12   25:goto            89
		{
			if(zzvk.get(((Object) (view))) != null)
	//*  13   28:getstatic       #21  <Field WeakHashMap zzvk>
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #40  <Method Object WeakHashMap.get(Object)>
	//*  16   35:ifnull          44
			{
				zzane.e("The provided containerView is already in use with another NativeAdViewHolder.");
	//   17   38:ldc1            #42  <String "The provided containerView is already in use with another NativeAdViewHolder.">
	//   18   40:invokestatic    #48  <Method void zzane.e(String)>
				return;
	//   19   43:return          
			} else
			{
				zzvk.put(((Object) (view)), ((Object) (this)));
	//   20   44:getstatic       #21  <Field WeakHashMap zzvk>
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:invokevirtual   #51  <Method Object WeakHashMap.put(Object, Object)>
	//   24   52:pop             
				zzvl = new WeakReference(((Object) (view)));
	//   25   53:aload_0         
	//   26   54:new             #53  <Class WeakReference>
	//   27   57:dup             
	//   28   58:aload_1         
	//   29   59:invokespecial   #56  <Method void WeakReference(Object)>
	//   30   62:putfield        #58  <Field WeakReference zzvl>
				map = ((Map) (zzb(map)));
	//   31   65:aload_2         
	//   32   66:invokestatic    #62  <Method HashMap zzb(Map)>
	//   33   69:astore_2        
				map1 = ((Map) (zzb(map1)));
	//   34   70:aload_3         
	//   35   71:invokestatic    #62  <Method HashMap zzb(Map)>
	//   36   74:astore_3        
				zzvj = zzkb.zzig().zza(view, ((HashMap) (map)), ((HashMap) (map1)));
	//   37   75:aload_0         
	//   38   76:invokestatic    #68  <Method zzjr zzkb.zzig()>
	//   39   79:aload_1         
	//   40   80:aload_2         
	//   41   81:aload_3         
	//   42   82:invokevirtual   #74  <Method zzqf zzjr.zza(View, HashMap, HashMap)>
	//   43   85:putfield        #76  <Field zzqf zzvj>
				return;
	//   44   88:return          
			}
		} else
		{
			zzane.e("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
	//   45   89:ldc1            #78  <String "The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.">
	//   46   91:invokestatic    #48  <Method void zzane.e(String)>
			return;
	//   47   94:return          
		}
	}

	private final void zza(IObjectWrapper iobjectwrapper)
	{
		Object obj = ((Object) (zzvl));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field WeakReference zzvl>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          20
			obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #86  <Method Object WeakReference.get()>
	//    7   13:checkcast       #88  <Class View>
	//    8   16:astore_2        
		else
	//*   9   17:goto            22
			obj = null;
	//   10   20:aconst_null     
	//   11   21:astore_2        
		if(obj == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       32
		{
			zzane.zzdk("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
	//   14   26:ldc1            #90  <String "NativeAdViewHolder.setNativeAd containerView doesn't exist, returning">
	//   15   28:invokestatic    #93  <Method void zzane.zzdk(String)>
			return;
	//   16   31:return          
		}
		if(!zzvk.containsKey(obj))
	//*  17   32:getstatic       #21  <Field WeakHashMap zzvk>
	//*  18   35:aload_2         
	//*  19   36:invokevirtual   #97  <Method boolean WeakHashMap.containsKey(Object)>
	//*  20   39:ifne            51
			zzvk.put(obj, ((Object) (this)));
	//   21   42:getstatic       #21  <Field WeakHashMap zzvk>
	//   22   45:aload_2         
	//   23   46:aload_0         
	//   24   47:invokevirtual   #51  <Method Object WeakHashMap.put(Object, Object)>
	//   25   50:pop             
		obj = ((Object) (zzvj));
	//   26   51:aload_0         
	//   27   52:getfield        #76  <Field zzqf zzvj>
	//   28   55:astore_2        
		if(obj != null)
	//*  29   56:aload_2         
	//*  30   57:ifnull          75
			try
			{
				((zzqf) (obj)).zza(iobjectwrapper);
	//   31   60:aload_2         
	//   32   61:aload_1         
	//   33   62:invokeinterface #101 <Method void zzqf.zza(IObjectWrapper)>
				return;
	//   34   67:return          
			}
			// Misplaced declaration of an exception variable
			catch(IObjectWrapper iobjectwrapper)
	//*  35   68:astore_1        
			{
				zzane.zzb("Unable to call setNativeAd on delegate", ((Throwable) (iobjectwrapper)));
	//   36   69:ldc1            #103 <String "Unable to call setNativeAd on delegate">
	//   37   71:aload_1         
	//   38   72:invokestatic    #106 <Method void zzane.zzb(String, Throwable)>
			}
	//   39   75:return          
	}

	private static HashMap zzb(Map map)
	{
		if(map == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return new HashMap();
	//    2    4:new             #108 <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #109 <Method void HashMap()>
	//    5   11:areturn         
		else
			return new HashMap(map);
	//    6   12:new             #108 <Class HashMap>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #112 <Method void HashMap(Map)>
	//   10   20:areturn         
	}

	public final void setClickConfirmingView(View view)
	{
		try
		{
			zzvj.zzc(ObjectWrapper.wrap(((Object) (view))));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field zzqf zzvj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #121 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #124 <Method void zzqf.zzc(IObjectWrapper)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   6   14:astore_1        
		{
			zzane.zzb("Unable to call setClickConfirmingView on delegate", ((Throwable) (view)));
	//    7   15:ldc1            #126 <String "Unable to call setClickConfirmingView on delegate">
	//    8   17:aload_1         
	//    9   18:invokestatic    #106 <Method void zzane.zzb(String, Throwable)>
		}
	//   10   21:return          
	}

	public final void setNativeAd(NativeAd nativead)
	{
		zza((IObjectWrapper)nativead.zzbe());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method Object NativeAd.zzbe()>
	//    3    5:checkcast       #135 <Class IObjectWrapper>
	//    4    8:invokespecial   #136 <Method void zza(IObjectWrapper)>
	//    5   11:return          
	}

	public final void setNativeAd(UnifiedNativeAd unifiednativead)
	{
		zza((IObjectWrapper)unifiednativead.zzbe());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method Object UnifiedNativeAd.zzbe()>
	//    3    5:checkcast       #135 <Class IObjectWrapper>
	//    4    8:invokespecial   #136 <Method void zza(IObjectWrapper)>
	//    5   11:return          
	}

	public final void unregisterNativeAd()
	{
		Object obj = ((Object) (zzvj));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field zzqf zzvj>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
			try
			{
				((zzqf) (obj)).unregisterNativeAd();
	//    5    9:aload_1         
	//    6   10:invokeinterface #143 <Method void zzqf.unregisterNativeAd()>
			}
	//*   7   15:goto            25
			catch(RemoteException remoteexception)
	//*   8   18:astore_1        
			{
				zzane.zzb("Unable to call unregisterNativeAd on delegate", ((Throwable) (remoteexception)));
	//    9   19:ldc1            #145 <String "Unable to call unregisterNativeAd on delegate">
	//   10   21:aload_1         
	//   11   22:invokestatic    #106 <Method void zzane.zzb(String, Throwable)>
			}
		remoteexception = ((RemoteException) (zzvl));
	//   12   25:aload_0         
	//   13   26:getfield        #58  <Field WeakReference zzvl>
	//   14   29:astore_1        
		if(remoteexception != null)
	//*  15   30:aload_1         
	//*  16   31:ifnull          45
			remoteexception = ((RemoteException) ((View)((WeakReference) (remoteexception)).get()));
	//   17   34:aload_1         
	//   18   35:invokevirtual   #86  <Method Object WeakReference.get()>
	//   19   38:checkcast       #88  <Class View>
	//   20   41:astore_1        
		else
	//*  21   42:goto            47
			remoteexception = null;
	//   22   45:aconst_null     
	//   23   46:astore_1        
		if(remoteexception != null)
	//*  24   47:aload_1         
	//*  25   48:ifnull          59
			zzvk.remove(((Object) (remoteexception)));
	//   26   51:getstatic       #21  <Field WeakHashMap zzvk>
	//   27   54:aload_1         
	//   28   55:invokevirtual   #148 <Method Object WeakHashMap.remove(Object)>
	//   29   58:pop             
	//   30   59:return          
	}

	public static WeakHashMap zzvk = new WeakHashMap();
	private zzqf zzvj;
	private WeakReference zzvl;

	static 
	{
	//    0    0:new             #16  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void WeakHashMap()>
	//    3    7:putstatic       #21  <Field WeakHashMap zzvk>
	//*   4   10:return          
	}
}
