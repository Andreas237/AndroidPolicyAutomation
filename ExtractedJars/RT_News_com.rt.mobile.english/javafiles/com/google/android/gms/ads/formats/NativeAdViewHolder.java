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
		View view;
		if(zzvl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field WeakReference zzvl>
	//*   2    4:ifnull          21
			view = (View)zzvl.get();
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field WeakReference zzvl>
	//    5   11:invokevirtual   #86  <Method Object WeakReference.get()>
	//    6   14:checkcast       #88  <Class View>
	//    7   17:astore_2        
		else
	//*   8   18:goto            23
			view = null;
	//    9   21:aconst_null     
	//   10   22:astore_2        
		if(view == null)
	//*  11   23:aload_2         
	//*  12   24:ifnonnull       33
		{
			zzane.zzdk("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
	//   13   27:ldc1            #90  <String "NativeAdViewHolder.setNativeAd containerView doesn't exist, returning">
	//   14   29:invokestatic    #93  <Method void zzane.zzdk(String)>
			return;
	//   15   32:return          
		}
		if(!zzvk.containsKey(((Object) (view))))
	//*  16   33:getstatic       #21  <Field WeakHashMap zzvk>
	//*  17   36:aload_2         
	//*  18   37:invokevirtual   #97  <Method boolean WeakHashMap.containsKey(Object)>
	//*  19   40:ifne            52
			zzvk.put(((Object) (view)), ((Object) (this)));
	//   20   43:getstatic       #21  <Field WeakHashMap zzvk>
	//   21   46:aload_2         
	//   22   47:aload_0         
	//   23   48:invokevirtual   #51  <Method Object WeakHashMap.put(Object, Object)>
	//   24   51:pop             
		if(zzvj != null)
	//*  25   52:aload_0         
	//*  26   53:getfield        #76  <Field zzqf zzvj>
	//*  27   56:ifnull          77
			try
			{
				zzvj.zza(iobjectwrapper);
	//   28   59:aload_0         
	//   29   60:getfield        #76  <Field zzqf zzvj>
	//   30   63:aload_1         
	//   31   64:invokeinterface #101 <Method void zzqf.zza(IObjectWrapper)>
				return;
	//   32   69:return          
			}
			// Misplaced declaration of an exception variable
			catch(IObjectWrapper iobjectwrapper)
	//*  33   70:astore_1        
			{
				zzane.zzb("Unable to call setNativeAd on delegate", ((Throwable) (iobjectwrapper)));
	//   34   71:ldc1            #103 <String "Unable to call setNativeAd on delegate">
	//   35   73:aload_1         
	//   36   74:invokestatic    #106 <Method void zzane.zzb(String, Throwable)>
			}
	//   37   77:return          
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
		if(zzvj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field zzqf zzvj>
	//*   2    4:ifnull          26
			try
			{
				zzvj.unregisterNativeAd();
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field zzqf zzvj>
	//    5   11:invokeinterface #143 <Method void zzqf.unregisterNativeAd()>
			}
	//*   6   16:goto            26
			catch(RemoteException remoteexception)
	//*   7   19:astore_1        
			{
				zzane.zzb("Unable to call unregisterNativeAd on delegate", ((Throwable) (remoteexception)));
	//    8   20:ldc1            #145 <String "Unable to call unregisterNativeAd on delegate">
	//    9   22:aload_1         
	//   10   23:invokestatic    #106 <Method void zzane.zzb(String, Throwable)>
			}
		View view;
		if(zzvl != null)
	//*  11   26:aload_0         
	//*  12   27:getfield        #58  <Field WeakReference zzvl>
	//*  13   30:ifnull          47
			view = (View)zzvl.get();
	//   14   33:aload_0         
	//   15   34:getfield        #58  <Field WeakReference zzvl>
	//   16   37:invokevirtual   #86  <Method Object WeakReference.get()>
	//   17   40:checkcast       #88  <Class View>
	//   18   43:astore_1        
		else
	//*  19   44:goto            49
			view = null;
	//   20   47:aconst_null     
	//   21   48:astore_1        
		if(view != null)
	//*  22   49:aload_1         
	//*  23   50:ifnull          61
			zzvk.remove(((Object) (view)));
	//   24   53:getstatic       #21  <Field WeakHashMap zzvk>
	//   25   56:aload_1         
	//   26   57:invokevirtual   #148 <Method Object WeakHashMap.remove(Object)>
	//   27   60:pop             
	//   28   61:return          
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
