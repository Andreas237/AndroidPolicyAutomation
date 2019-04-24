// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzqi, zzqj, zzqf, zzqh, 
//			zzane

public final class zzrw extends RemoteCreator
{

	public zzrw()
	{
		super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl">
	//    2    3:invokespecial   #14  <Method void RemoteCreator(String)>
	//    3    6:return          
	}

	protected final Object getRemoteCreator(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #20  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzqi)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #28  <Class zzqi>
	//*  10   19:ifeq            27
			return ((Object) ((zzqi)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #28  <Class zzqi>
	//   13   26:areturn         
		else
			return ((Object) (new zzqj(ibinder)));
	//   14   27:new             #30  <Class zzqj>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #33  <Method void zzqj(IBinder)>
	//   18   35:areturn         
	}

	public final zzqf zzb(View view, HashMap hashmap, HashMap hashmap1)
	{
		try
		{
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:astore          4
			hashmap = ((HashMap) (ObjectWrapper.wrap(((Object) (hashmap)))));
	//    3    6:aload_2         
	//    4    7:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    5   10:astore_2        
			hashmap1 = ((HashMap) (ObjectWrapper.wrap(((Object) (hashmap1)))));
	//    6   11:aload_3         
	//    7   12:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   15:astore_3        
			view = ((View) (((zzqi)getRemoteCreatorInstance(view.getContext())).zza(iobjectwrapper, ((com.google.android.gms.dynamic.IObjectWrapper) (hashmap)), ((com.google.android.gms.dynamic.IObjectWrapper) (hashmap1)))));
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #51  <Method android.content.Context View.getContext()>
	//   12   21:invokevirtual   #55  <Method Object getRemoteCreatorInstance(android.content.Context)>
	//   13   24:checkcast       #28  <Class zzqi>
	//   14   27:aload           4
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokeinterface #59  <Method IBinder zzqi.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
	//   18   36:astore_1        
		}
	//*  19   37:aload_1         
	//*  20   38:ifnonnull       43
	//*  21   41:aconst_null     
	//*  22   42:areturn         
	//*  23   43:aload_1         
	//*  24   44:ldc1            #61  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate">
	//*  25   46:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  26   51:astore_2        
	//*  27   52:aload_2         
	//*  28   53:instanceof      #63  <Class zzqf>
	//*  29   56:ifeq            64
	//*  30   59:aload_2         
	//*  31   60:checkcast       #63  <Class zzqf>
	//*  32   63:areturn         
	//*  33   64:new             #65  <Class zzqh>
	//*  34   67:dup             
	//*  35   68:aload_1         
	//*  36   69:invokespecial   #66  <Method void zzqh(IBinder)>
	//*  37   72:astore_1        
	//*  38   73:aload_1         
	//*  39   74:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  40   75:astore_1        
		{
			zzane.zzc("Could not create remote NativeAdViewHolderDelegate.", ((Throwable) (view)));
	//   41   76:ldc1            #68  <String "Could not create remote NativeAdViewHolderDelegate.">
	//   42   78:aload_1         
	//   43   79:invokestatic    #74  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   44   82:aconst_null     
	//   45   83:areturn         
		}
		if(view == null)
			return null;
		hashmap = ((HashMap) (((IBinder) (view)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate")));
		if(hashmap instanceof zzqf)
			return (zzqf)hashmap;
		view = ((View) (new zzqh(((IBinder) (view)))));
		return ((zzqf) (view));
	}
}
