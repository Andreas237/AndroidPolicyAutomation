// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.*;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxr, zzane, zzjj, zzkb, 
//			zzamu, zzyq, zzzc, zzjn, 
//			zzlo, zzaic, zzxt, zzpl, 
//			zzxz, zzyc, zzqs, zzyf

public final class zzyp extends zzxr
{

	public zzyp(MediationAdapter mediationadapter, NetworkExtras networkextras)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzxr()>
		zzbvb = mediationadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field MediationAdapter zzbvb>
		zzbvc = networkextras;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field NetworkExtras zzbvc>
	//    8   14:return          
	}

	private final MediationServerParameters zza(String s, int i, String s1)
		throws RemoteException
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_74;
	//    0    0:aload_1         
	//    1    1:ifnull          74
		Object obj;
		Iterator iterator;
		try
		{
			obj = ((Object) (new JSONObject(s)));
	//    2    4:new             #32  <Class JSONObject>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #35  <Method void JSONObject(String)>
	//    6   12:astore          4
			s1 = ((String) (new HashMap(((JSONObject) (obj)).length())));
	//    7   14:new             #37  <Class HashMap>
	//    8   17:dup             
	//    9   18:aload           4
	//   10   20:invokevirtual   #41  <Method int JSONObject.length()>
	//   11   23:invokespecial   #44  <Method void HashMap(int)>
	//   12   26:astore_3        
			iterator = ((JSONObject) (obj)).keys();
	//   13   27:aload           4
	//   14   29:invokevirtual   #48  <Method Iterator JSONObject.keys()>
	//   15   32:astore          5
		}
	//*  16   34:aload_3         
	//*  17   35:astore_1        
	//*  18   36:aload           5
	//*  19   38:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  20   43:ifeq            83
	//*  21   46:aload           5
	//*  22   48:invokeinterface #58  <Method Object Iterator.next()>
	//*  23   53:checkcast       #60  <Class String>
	//*  24   56:astore_1        
	//*  25   57:aload_3         
	//*  26   58:aload_1         
	//*  27   59:aload           4
	//*  28   61:aload_1         
	//*  29   62:invokevirtual   #64  <Method String JSONObject.getString(String)>
	//*  30   65:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//*  31   70:pop             
	//*  32   71:goto            34
	//*  33   74:new             #37  <Class HashMap>
	//*  34   77:dup             
	//*  35   78:iconst_0        
	//*  36   79:invokespecial   #44  <Method void HashMap(int)>
	//*  37   82:astore_1        
	//*  38   83:aload_0         
	//*  39   84:getfield        #19  <Field MediationAdapter zzbvb>
	//*  40   87:invokeinterface #76  <Method Class MediationAdapter.getServerParametersType()>
	//*  41   92:astore          4
	//*  42   94:aconst_null     
	//*  43   95:astore_3        
	//*  44   96:aload           4
	//*  45   98:ifnull          115
	//*  46  101:aload           4
	//*  47  103:invokevirtual   #81  <Method Object Class.newInstance()>
	//*  48  106:checkcast       #83  <Class MediationServerParameters>
	//*  49  109:astore_3        
	//*  50  110:aload_3         
	//*  51  111:aload_1         
	//*  52  112:invokevirtual   #87  <Method void MediationServerParameters.load(Map)>
	//*  53  115:aload_3         
	//*  54  116:areturn         
	//*  55  117:ldc1            #89  <String "">
	//*  56  119:aload_1         
	//*  57  120:invokestatic    #95  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
	//*  58  123:new             #28  <Class RemoteException>
	//*  59  126:dup             
	//*  60  127:invokespecial   #96  <Method void RemoteException()>
	//*  61  130:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			com.google.android.gms.internal.ads.zzane.zzb("", ((Throwable) (s)));
			throw new RemoteException();
		}
		s = s1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_83;
		s = (String)iterator.next();
		((Map) (s1)).put(((Object) (s)), ((Object) (((JSONObject) (obj)).getString(s))));
		break MISSING_BLOCK_LABEL_34;
		s = ((String) (new HashMap(0)));
		obj = ((Object) (zzbvb.getServerParametersType()));
		s1 = null;
		if(obj == null)
			break MISSING_BLOCK_LABEL_115;
		s1 = ((String) ((MediationServerParameters)((Class) (obj)).newInstance()));
		((MediationServerParameters) (s1)).load(((Map) (s)));
		return ((MediationServerParameters) (s1));
	//*  62  131:astore_1        
	//*  63  132:goto            117
	}

	private static boolean zzm(zzjj zzjj1)
	{
		if(!zzjj1.zzapz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field boolean zzjj.zzapz>
	//*   2    4:ifne            22
		{
			zzkb.zzif();
	//    3    7:invokestatic    #112 <Method zzamu zzkb.zzif()>
	//    4   10:pop             
			if(!zzamu.zzsg())
	//*   5   11:invokestatic    #117 <Method boolean zzamu.zzsg()>
	//*   6   14:ifeq            20
	//*   7   17:goto            22
				return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		}
		return true;
	//   10   22:iconst_1        
	//   11   23:ireturn         
	}

	public final void destroy()
		throws RemoteException
	{
		try
		{
			zzbvb.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediationAdapter zzbvb>
	//    2    4:invokeinterface #120 <Method void MediationAdapter.destroy()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", throwable);
	//    5   11:ldc1            #89  <String "">
	//    6   13:aload_1         
	//    7   14:invokestatic    #95  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
		}
		throw new RemoteException();
	//    8   17:new             #28  <Class RemoteException>
	//    9   20:dup             
	//   10   21:invokespecial   #96  <Method void RemoteException()>
	//   11   24:athrow          
	}

	public final Bundle getInterstitialAdapterInfo()
	{
		return new Bundle();
	//    0    0:new             #124 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void Bundle()>
	//    3    7:areturn         
	}

	public final zzlo getVideoController()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final IObjectWrapper getView()
		throws RemoteException
	{
		if(!(zzbvb instanceof MediationBannerAdapter))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field MediationAdapter zzbvb>
	//*   2    4:instanceof      #131 <Class MediationBannerAdapter>
	//*   3    7:ifne            63
		{
			String s = String.valueOf(((Object) (((Object) (zzbvb)).getClass().getCanonicalName())));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field MediationAdapter zzbvb>
	//    6   14:invokevirtual   #136 <Method Class Object.getClass()>
	//    7   17:invokevirtual   #140 <Method String Class.getCanonicalName()>
	//    8   20:invokestatic    #144 <Method String String.valueOf(Object)>
	//    9   23:astore_1        
			if(s.length() != 0)
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #145 <Method int String.length()>
	//*  12   28:ifeq            41
				s = "Not a MediationBannerAdapter: ".concat(s);
	//   13   31:ldc1            #147 <String "Not a MediationBannerAdapter: ">
	//   14   33:aload_1         
	//   15   34:invokevirtual   #150 <Method String String.concat(String)>
	//   16   37:astore_1        
			else
	//*  17   38:goto            51
				s = new String("Not a MediationBannerAdapter: ");
	//   18   41:new             #60  <Class String>
	//   19   44:dup             
	//   20   45:ldc1            #147 <String "Not a MediationBannerAdapter: ">
	//   21   47:invokespecial   #151 <Method void String(String)>
	//   22   50:astore_1        
			zzane.zzdk(s);
	//   23   51:aload_1         
	//   24   52:invokestatic    #154 <Method void zzane.zzdk(String)>
			throw new RemoteException();
	//   25   55:new             #28  <Class RemoteException>
	//   26   58:dup             
	//   27   59:invokespecial   #96  <Method void RemoteException()>
	//   28   62:athrow          
		}
		IObjectWrapper iobjectwrapper;
		try
		{
			iobjectwrapper = ObjectWrapper.wrap(((Object) (((MediationBannerAdapter)zzbvb).getBannerView())));
	//   29   63:aload_0         
	//   30   64:getfield        #19  <Field MediationAdapter zzbvb>
	//   31   67:checkcast       #131 <Class MediationBannerAdapter>
	//   32   70:invokeinterface #158 <Method android.view.View MediationBannerAdapter.getBannerView()>
	//   33   75:invokestatic    #164 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   34   78:astore_1        
		}
	//*  35   79:aload_1         
	//*  36   80:areturn         
		catch(Throwable throwable)
	//*  37   81:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", throwable);
	//   38   82:ldc1            #89  <String "">
	//   39   84:aload_1         
	//   40   85:invokestatic    #95  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
			throw new RemoteException();
	//   41   88:new             #28  <Class RemoteException>
	//   42   91:dup             
	//   43   92:invokespecial   #96  <Method void RemoteException()>
	//   44   95:athrow          
		}
		return iobjectwrapper;
	}

	public final boolean isInitialized()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void pause()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #28  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void resume()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #28  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void setImmersiveMode(boolean flag)
	{
	//    0    0:return          
	}

	public final void showInterstitial()
		throws RemoteException
	{
		if(!(zzbvb instanceof MediationInterstitialAdapter))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field MediationAdapter zzbvb>
	//*   2    4:instanceof      #172 <Class MediationInterstitialAdapter>
	//*   3    7:ifne            63
		{
			String s = String.valueOf(((Object) (((Object) (zzbvb)).getClass().getCanonicalName())));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field MediationAdapter zzbvb>
	//    6   14:invokevirtual   #136 <Method Class Object.getClass()>
	//    7   17:invokevirtual   #140 <Method String Class.getCanonicalName()>
	//    8   20:invokestatic    #144 <Method String String.valueOf(Object)>
	//    9   23:astore_1        
			if(s.length() != 0)
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #145 <Method int String.length()>
	//*  12   28:ifeq            41
				s = "Not a MediationInterstitialAdapter: ".concat(s);
	//   13   31:ldc1            #174 <String "Not a MediationInterstitialAdapter: ">
	//   14   33:aload_1         
	//   15   34:invokevirtual   #150 <Method String String.concat(String)>
	//   16   37:astore_1        
			else
	//*  17   38:goto            51
				s = new String("Not a MediationInterstitialAdapter: ");
	//   18   41:new             #60  <Class String>
	//   19   44:dup             
	//   20   45:ldc1            #174 <String "Not a MediationInterstitialAdapter: ">
	//   21   47:invokespecial   #151 <Method void String(String)>
	//   22   50:astore_1        
			zzane.zzdk(s);
	//   23   51:aload_1         
	//   24   52:invokestatic    #154 <Method void zzane.zzdk(String)>
			throw new RemoteException();
	//   25   55:new             #28  <Class RemoteException>
	//   26   58:dup             
	//   27   59:invokespecial   #96  <Method void RemoteException()>
	//   28   62:athrow          
		}
		zzane.zzck("Showing interstitial from adapter.");
	//   29   63:ldc1            #176 <String "Showing interstitial from adapter.">
	//   30   65:invokestatic    #179 <Method void zzane.zzck(String)>
		try
		{
			((MediationInterstitialAdapter)zzbvb).showInterstitial();
	//   31   68:aload_0         
	//   32   69:getfield        #19  <Field MediationAdapter zzbvb>
	//   33   72:checkcast       #172 <Class MediationInterstitialAdapter>
	//   34   75:invokeinterface #181 <Method void MediationInterstitialAdapter.showInterstitial()>
			return;
	//   35   80:return          
		}
		catch(Throwable throwable)
	//*  36   81:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", throwable);
	//   37   82:ldc1            #89  <String "">
	//   38   84:aload_1         
	//   39   85:invokestatic    #95  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
		}
		throw new RemoteException();
	//   40   88:new             #28  <Class RemoteException>
	//   41   91:dup             
	//   42   92:invokespecial   #96  <Method void RemoteException()>
	//   43   95:athrow          
	}

	public final void showVideo()
	{
	//    0    0:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzaic zzaic, List list)
	{
	//    0    0:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzjj zzjj1, String s, zzaic zzaic, String s1)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzjj zzjj1, String s, zzxt zzxt)
		throws RemoteException
	{
		zza(iobjectwrapper, zzjj1, s, ((String) (null)), zzxt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aload           4
	//    6    7:invokevirtual   #189 <Method void zza(IObjectWrapper, zzjj, String, String, zzxt)>
	//    7   10:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzjj zzjj1, String s, String s1, zzxt zzxt)
		throws RemoteException
	{
		if(!(zzbvb instanceof MediationInterstitialAdapter))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field MediationAdapter zzbvb>
	//*   2    4:instanceof      #172 <Class MediationInterstitialAdapter>
	//*   3    7:ifne            63
		{
			iobjectwrapper = ((IObjectWrapper) (String.valueOf(((Object) (((Object) (zzbvb)).getClass().getCanonicalName())))));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field MediationAdapter zzbvb>
	//    6   14:invokevirtual   #136 <Method Class Object.getClass()>
	//    7   17:invokevirtual   #140 <Method String Class.getCanonicalName()>
	//    8   20:invokestatic    #144 <Method String String.valueOf(Object)>
	//    9   23:astore_1        
			if(((String) (iobjectwrapper)).length() != 0)
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #145 <Method int String.length()>
	//*  12   28:ifeq            41
				iobjectwrapper = ((IObjectWrapper) ("Not a MediationInterstitialAdapter: ".concat(((String) (iobjectwrapper)))));
	//   13   31:ldc1            #174 <String "Not a MediationInterstitialAdapter: ">
	//   14   33:aload_1         
	//   15   34:invokevirtual   #150 <Method String String.concat(String)>
	//   16   37:astore_1        
			else
	//*  17   38:goto            51
				iobjectwrapper = ((IObjectWrapper) (new String("Not a MediationInterstitialAdapter: ")));
	//   18   41:new             #60  <Class String>
	//   19   44:dup             
	//   20   45:ldc1            #174 <String "Not a MediationInterstitialAdapter: ">
	//   21   47:invokespecial   #151 <Method void String(String)>
	//   22   50:astore_1        
			zzane.zzdk(((String) (iobjectwrapper)));
	//   23   51:aload_1         
	//   24   52:invokestatic    #154 <Method void zzane.zzdk(String)>
			throw new RemoteException();
	//   25   55:new             #28  <Class RemoteException>
	//   26   58:dup             
	//   27   59:invokespecial   #96  <Method void RemoteException()>
	//   28   62:athrow          
		}
		zzane.zzck("Requesting interstitial ad from adapter.");
	//   29   63:ldc1            #191 <String "Requesting interstitial ad from adapter.">
	//   30   65:invokestatic    #179 <Method void zzane.zzck(String)>
		try
		{
			((MediationInterstitialAdapter)zzbvb).requestInterstitialAd(((com.google.ads.mediation.MediationInterstitialListener) (new zzyq(zzxt))), (Activity)ObjectWrapper.unwrap(iobjectwrapper), zza(s, zzjj1.zzaqa, s1), zzzc.zza(zzjj1, zzm(zzjj1)), zzbvc);
	//   31   68:aload_0         
	//   32   69:getfield        #19  <Field MediationAdapter zzbvb>
	//   33   72:checkcast       #172 <Class MediationInterstitialAdapter>
	//   34   75:new             #193 <Class zzyq>
	//   35   78:dup             
	//   36   79:aload           5
	//   37   81:invokespecial   #196 <Method void zzyq(zzxt)>
	//   38   84:aload_1         
	//   39   85:invokestatic    #200 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   40   88:checkcast       #202 <Class Activity>
	//   41   91:aload_0         
	//   42   92:aload_3         
	//   43   93:aload_2         
	//   44   94:getfield        #206 <Field int zzjj.zzaqa>
	//   45   97:aload           4
	//   46   99:invokespecial   #208 <Method MediationServerParameters zza(String, int, String)>
	//   47  102:aload_2         
	//   48  103:aload_2         
	//   49  104:invokestatic    #210 <Method boolean zzm(zzjj)>
	//   50  107:invokestatic    #215 <Method com.google.ads.mediation.MediationAdRequest zzzc.zza(zzjj, boolean)>
	//   51  110:aload_0         
	//   52  111:getfield        #21  <Field NetworkExtras zzbvc>
	//   53  114:invokeinterface #219 <Method void MediationInterstitialAdapter.requestInterstitialAd(com.google.ads.mediation.MediationInterstitialListener, Activity, MediationServerParameters, com.google.ads.mediation.MediationAdRequest, NetworkExtras)>
			return;
	//   54  119:return          
		}
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  55  120:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", ((Throwable) (iobjectwrapper)));
	//   56  121:ldc1            #89  <String "">
	//   57  123:aload_1         
	//   58  124:invokestatic    #95  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
		}
		throw new RemoteException();
	//   59  127:new             #28  <Class RemoteException>
	//   60  130:dup             
	//   61  131:invokespecial   #96  <Method void RemoteException()>
	//   62  134:athrow          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzjj zzjj1, String s, String s1, zzxt zzxt, zzpl zzpl, List list)
	{
	//    0    0:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzjn zzjn1, zzjj zzjj1, String s, zzxt zzxt)
		throws RemoteException
	{
		zza(iobjectwrapper, zzjn1, zzjj1, s, ((String) (null)), zzxt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aload           5
	//    7    9:invokevirtual   #225 <Method void zza(IObjectWrapper, zzjn, zzjj, String, String, zzxt)>
	//    8   12:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper, zzjn zzjn1, zzjj zzjj1, String s, String s1, zzxt zzxt)
		throws RemoteException
	{
		int i;
		if(!(zzbvb instanceof MediationBannerAdapter))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field MediationAdapter zzbvb>
	//*   2    4:instanceof      #131 <Class MediationBannerAdapter>
	//*   3    7:ifne            63
		{
			iobjectwrapper = ((IObjectWrapper) (String.valueOf(((Object) (((Object) (zzbvb)).getClass().getCanonicalName())))));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field MediationAdapter zzbvb>
	//    6   14:invokevirtual   #136 <Method Class Object.getClass()>
	//    7   17:invokevirtual   #140 <Method String Class.getCanonicalName()>
	//    8   20:invokestatic    #144 <Method String String.valueOf(Object)>
	//    9   23:astore_1        
			if(((String) (iobjectwrapper)).length() != 0)
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #145 <Method int String.length()>
	//*  12   28:ifeq            41
				iobjectwrapper = ((IObjectWrapper) ("Not a MediationBannerAdapter: ".concat(((String) (iobjectwrapper)))));
	//   13   31:ldc1            #147 <String "Not a MediationBannerAdapter: ">
	//   14   33:aload_1         
	//   15   34:invokevirtual   #150 <Method String String.concat(String)>
	//   16   37:astore_1        
			else
	//*  17   38:goto            51
				iobjectwrapper = ((IObjectWrapper) (new String("Not a MediationBannerAdapter: ")));
	//   18   41:new             #60  <Class String>
	//   19   44:dup             
	//   20   45:ldc1            #147 <String "Not a MediationBannerAdapter: ">
	//   21   47:invokespecial   #151 <Method void String(String)>
	//   22   50:astore_1        
			zzane.zzdk(((String) (iobjectwrapper)));
	//   23   51:aload_1         
	//   24   52:invokestatic    #154 <Method void zzane.zzdk(String)>
			throw new RemoteException();
	//   25   55:new             #28  <Class RemoteException>
	//   26   58:dup             
	//   27   59:invokespecial   #96  <Method void RemoteException()>
	//   28   62:athrow          
		}
		zzane.zzck("Requesting banner ad from adapter.");
	//   29   63:ldc1            #227 <String "Requesting banner ad from adapter.">
	//   30   65:invokestatic    #179 <Method void zzane.zzck(String)>
		MediationBannerAdapter mediationbanneradapter;
		Activity activity;
		try
		{
			mediationbanneradapter = (MediationBannerAdapter)zzbvb;
	//   31   68:aload_0         
	//   32   69:getfield        #19  <Field MediationAdapter zzbvb>
	//   33   72:checkcast       #131 <Class MediationBannerAdapter>
	//   34   75:astore          8
			zzxt = ((zzxt) (new zzyq(zzxt)));
	//   35   77:new             #193 <Class zzyq>
	//   36   80:dup             
	//   37   81:aload           6
	//   38   83:invokespecial   #196 <Method void zzyq(zzxt)>
	//   39   86:astore          6
			activity = (Activity)ObjectWrapper.unwrap(iobjectwrapper);
	//   40   88:aload_1         
	//   41   89:invokestatic    #200 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   42   92:checkcast       #202 <Class Activity>
	//   43   95:astore          9
			s = ((String) (zza(s, zzjj1.zzaqa, s1)));
	//   44   97:aload_0         
	//   45   98:aload           4
	//   46  100:aload_3         
	//   47  101:getfield        #206 <Field int zzjj.zzaqa>
	//   48  104:aload           5
	//   49  106:invokespecial   #208 <Method MediationServerParameters zza(String, int, String)>
	//   50  109:astore          4
			iobjectwrapper = ((IObjectWrapper) (new AdSize[6]));
	//   51  111:bipush          6
	//   52  113:anewarray       AdSize[]
	//   53  116:astore_1        
			s1 = ((String) (AdSize.SMART_BANNER));
	//   54  117:getstatic       #233 <Field AdSize AdSize.SMART_BANNER>
	//   55  120:astore          5
		}
	//*  56  122:iconst_0        
	//*  57  123:istore          7
	//*  58  125:aload_1         
	//*  59  126:iconst_0        
	//*  60  127:aload           5
	//*  61  129:aastore         
	//*  62  130:aload_1         
	//*  63  131:iconst_1        
	//*  64  132:getstatic       #236 <Field AdSize AdSize.BANNER>
	//*  65  135:aastore         
	//*  66  136:aload_1         
	//*  67  137:iconst_2        
	//*  68  138:getstatic       #239 <Field AdSize AdSize.IAB_MRECT>
	//*  69  141:aastore         
	//*  70  142:aload_1         
	//*  71  143:iconst_3        
	//*  72  144:getstatic       #242 <Field AdSize AdSize.IAB_BANNER>
	//*  73  147:aastore         
	//*  74  148:aload_1         
	//*  75  149:iconst_4        
	//*  76  150:getstatic       #245 <Field AdSize AdSize.IAB_LEADERBOARD>
	//*  77  153:aastore         
	//*  78  154:aload_1         
	//*  79  155:iconst_5        
	//*  80  156:getstatic       #248 <Field AdSize AdSize.IAB_WIDE_SKYSCRAPER>
	//*  81  159:aastore         
	//*  82  160:iload           7
	//*  83  162:bipush          6
	//*  84  164:icmpge          203
	//*  85  167:aload_1         
	//*  86  168:iload           7
	//*  87  170:aaload          
	//*  88  171:invokevirtual   #251 <Method int AdSize.getWidth()>
	//*  89  174:aload_2         
	//*  90  175:getfield        #256 <Field int zzjn.width>
	//*  91  178:icmpne          268
	//*  92  181:aload_1         
	//*  93  182:iload           7
	//*  94  184:aaload          
	//*  95  185:invokevirtual   #259 <Method int AdSize.getHeight()>
	//*  96  188:aload_2         
	//*  97  189:getfield        #262 <Field int zzjn.height>
	//*  98  192:icmpne          268
	//*  99  195:aload_1         
	//* 100  196:iload           7
	//* 101  198:aaload          
	//* 102  199:astore_1        
	//* 103  200:goto            226
	//* 104  203:new             #229 <Class AdSize>
	//* 105  206:dup             
	//* 106  207:aload_2         
	//* 107  208:getfield        #256 <Field int zzjn.width>
	//* 108  211:aload_2         
	//* 109  212:getfield        #262 <Field int zzjn.height>
	//* 110  215:aload_2         
	//* 111  216:getfield        #266 <Field String zzjn.zzarb>
	//* 112  219:invokestatic    #271 <Method com.google.android.gms.ads.AdSize zzb.zza(int, int, String)>
	//* 113  222:invokespecial   #274 <Method void AdSize(com.google.android.gms.ads.AdSize)>
	//* 114  225:astore_1        
	//* 115  226:aload           8
	//* 116  228:aload           6
	//* 117  230:aload           9
	//* 118  232:aload           4
	//* 119  234:aload_1         
	//* 120  235:aload_3         
	//* 121  236:aload_3         
	//* 122  237:invokestatic    #210 <Method boolean zzm(zzjj)>
	//* 123  240:invokestatic    #215 <Method com.google.ads.mediation.MediationAdRequest zzzc.zza(zzjj, boolean)>
	//* 124  243:aload_0         
	//* 125  244:getfield        #21  <Field NetworkExtras zzbvc>
	//* 126  247:invokeinterface #278 <Method void MediationBannerAdapter.requestBannerAd(com.google.ads.mediation.MediationBannerListener, Activity, MediationServerParameters, AdSize, com.google.ads.mediation.MediationAdRequest, NetworkExtras)>
	//* 127  252:return          
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//* 128  253:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", ((Throwable) (iobjectwrapper)));
	//  129  254:ldc1            #89  <String "">
	//  130  256:aload_1         
	//  131  257:invokestatic    #95  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
			throw new RemoteException();
	//  132  260:new             #28  <Class RemoteException>
	//  133  263:dup             
	//  134  264:invokespecial   #96  <Method void RemoteException()>
	//  135  267:athrow          
		}
		i = 0;
		iobjectwrapper[0] = ((/*<invalid signature>*/java.lang.Object) (s1));
		iobjectwrapper[1] = ((/*<invalid signature>*/java.lang.Object) (AdSize.BANNER));
		iobjectwrapper[2] = ((/*<invalid signature>*/java.lang.Object) (AdSize.IAB_MRECT));
		iobjectwrapper[3] = ((/*<invalid signature>*/java.lang.Object) (AdSize.IAB_BANNER));
		iobjectwrapper[4] = ((/*<invalid signature>*/java.lang.Object) (AdSize.IAB_LEADERBOARD));
		iobjectwrapper[5] = ((/*<invalid signature>*/java.lang.Object) (AdSize.IAB_WIDE_SKYSCRAPER));
_L2:
		if(i >= 6)
			break MISSING_BLOCK_LABEL_203;
		if(((AdSize) (iobjectwrapper[i])).getWidth() != zzjn1.width || ((AdSize) (iobjectwrapper[i])).getHeight() != zzjn1.height)
			break MISSING_BLOCK_LABEL_268;
		iobjectwrapper = ((IObjectWrapper) (iobjectwrapper[i]));
		break MISSING_BLOCK_LABEL_226;
		iobjectwrapper = ((IObjectWrapper) (new AdSize(zzb.zza(zzjn1.width, zzjn1.height, zzjn1.zzarb))));
		mediationbanneradapter.requestBannerAd(((com.google.ads.mediation.MediationBannerListener) (zzxt)), activity, ((MediationServerParameters) (s)), ((AdSize) (iobjectwrapper)), zzzc.zza(zzjj1, zzm(zzjj1)), zzbvc);
		return;
		i++;
	//  136  268:iload           7
	//  137  270:iconst_1        
	//  138  271:iadd            
	//  139  272:istore          7
		if(true) goto _L2; else goto _L1
	//  140  274:goto            160
_L1:
	}

	public final void zza(zzjj zzjj1, String s, String s1)
	{
	//    0    0:return          
	}

	public final void zzc(zzjj zzjj1, String s)
	{
	//    0    0:return          
	}

	public final void zzi(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final zzxz zzmo()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzyc zzmp()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Bundle zzmq()
	{
		return new Bundle();
	//    0    0:new             #124 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void Bundle()>
	//    3    7:areturn         
	}

	public final Bundle zzmr()
	{
		return new Bundle();
	//    0    0:new             #124 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #125 <Method void Bundle()>
	//    3    7:areturn         
	}

	public final boolean zzms()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final zzqs zzmt()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzyf zzmu()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private final MediationAdapter zzbvb;
	private final NetworkExtras zzbvc;
}
