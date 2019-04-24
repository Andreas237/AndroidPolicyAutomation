// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzk, zzane, zzzs, zzath, 
//			zzati, zzatg, zzzq, zzatf, 
//			zzjn, zzatd, zzzr, zzzt, 
//			zzlo, zzzm, zzzf, zzxt, 
//			zzzh

public final class zzzp extends zzzk
{

	public zzzp(zzatg zzatg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzzk()>
		zzbvi = zzatg1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field zzatg zzbvi>
	//    5    9:return          
	}

	private static Bundle zzbt(String s)
		throws RemoteException
	{
		Object obj = ((Object) (String.valueOf(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(((String) (obj)).length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #30  <Method int String.length()>
	//*   5    9:ifeq            22
			obj = ((Object) ("Server parameters: ".concat(((String) (obj)))));
	//    6   12:ldc1            #32  <String "Server parameters: ">
	//    7   14:aload_1         
	//    8   15:invokevirtual   #36  <Method String String.concat(String)>
	//    9   18:astore_1        
		else
	//*  10   19:goto            32
			obj = ((Object) (new String("Server parameters: ")));
	//   11   22:new             #22  <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #32  <String "Server parameters: ">
	//   14   28:invokespecial   #39  <Method void String(String)>
	//   15   31:astore_1        
		zzane.zzdk(((String) (obj)));
	//   16   32:aload_1         
	//   17   33:invokestatic    #44  <Method void zzane.zzdk(String)>
		JSONObject jsonobject;
		Iterator iterator;
		try
		{
			obj = ((Object) (new Bundle()));
	//   18   36:new             #46  <Class Bundle>
	//   19   39:dup             
	//   20   40:invokespecial   #47  <Method void Bundle()>
	//   21   43:astore_1        
		}
	//*  22   44:aload_0         
	//*  23   45:ifnull          104
	//*  24   48:new             #49  <Class JSONObject>
	//*  25   51:dup             
	//*  26   52:aload_0         
	//*  27   53:invokespecial   #50  <Method void JSONObject(String)>
	//*  28   56:astore_2        
	//*  29   57:new             #46  <Class Bundle>
	//*  30   60:dup             
	//*  31   61:invokespecial   #47  <Method void Bundle()>
	//*  32   64:astore_1        
	//*  33   65:aload_2         
	//*  34   66:invokevirtual   #54  <Method Iterator JSONObject.keys()>
	//*  35   69:astore_3        
	//*  36   70:aload_1         
	//*  37   71:astore_0        
	//*  38   72:aload_3         
	//*  39   73:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  40   78:ifeq            106
	//*  41   81:aload_3         
	//*  42   82:invokeinterface #64  <Method Object Iterator.next()>
	//*  43   87:checkcast       #22  <Class String>
	//*  44   90:astore_0        
	//*  45   91:aload_1         
	//*  46   92:aload_0         
	//*  47   93:aload_2         
	//*  48   94:aload_0         
	//*  49   95:invokevirtual   #67  <Method String JSONObject.getString(String)>
	//*  50   98:invokevirtual   #71  <Method void Bundle.putString(String, String)>
	//*  51  101:goto            70
	//*  52  104:aload_1         
	//*  53  105:astore_0        
	//*  54  106:aload_0         
	//*  55  107:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  56  108:astore_0        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", ((Throwable) (s)));
	//   57  109:ldc1            #73  <String "">
	//   58  111:aload_0         
	//   59  112:invokestatic    #77  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
			throw new RemoteException();
	//   60  115:new             #18  <Class RemoteException>
	//   61  118:dup             
	//   62  119:invokespecial   #78  <Method void RemoteException()>
	//   63  122:athrow          
		}
		if(s == null) goto _L2; else goto _L1
_L1:
		jsonobject = new JSONObject(s);
		obj = ((Object) (new Bundle()));
		iterator = jsonobject.keys();
_L4:
		s = ((String) (obj));
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
		s = (String)iterator.next();
		((Bundle) (obj)).putString(s, jsonobject.getString(s));
		if(true) goto _L4; else goto _L3
_L2:
		s = ((String) (obj));
_L3:
		return ((Bundle) (s));
	}

	public final zzlo getVideoController()
	{
		if(!(zzbvi instanceof zza))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field zzatg zzbvi>
	//*   2    4:instanceof      #85  <Class zza>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		zzlo zzlo;
		try
		{
			zzlo = ((zza)zzbvi).getVideoController();
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field zzatg zzbvi>
	//    8   16:checkcast       #85  <Class zza>
	//    9   19:invokeinterface #87  <Method zzlo zza.getVideoController()>
	//   10   24:astore_1        
		}
	//*  11   25:aload_1         
	//*  12   26:areturn         
		catch(Throwable throwable)
	//*  13   27:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", throwable);
	//   14   28:ldc1            #73  <String "">
	//   15   30:aload_1         
	//   16   31:invokestatic    #77  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
			return null;
	//   17   34:aconst_null     
	//   18   35:areturn         
		}
		return zzlo;
	}

	public final void showInterstitial()
		throws RemoteException
	{
		try
		{
			throw new NullPointerException();
	//    0    0:new             #90  <Class NullPointerException>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void NullPointerException()>
	//    3    7:athrow          
		}
		catch(Throwable throwable)
	//*   4    8:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("", throwable);
	//    5    9:ldc1            #73  <String "">
	//    6   11:aload_1         
	//    7   12:invokestatic    #77  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
		}
		throw new RemoteException();
	//    8   15:new             #18  <Class RemoteException>
	//    9   18:dup             
	//   10   19:invokespecial   #78  <Method void RemoteException()>
	//   11   22:athrow          
	}

	public final void zza(IObjectWrapper iobjectwrapper, String s, Bundle bundle, zzzm zzzm)
		throws RemoteException
	{
		zzatg zzatg1;
		zzzm = ((zzzm) (new zzzs(this, zzzm)));
	//    0    0:new             #95  <Class zzzs>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           4
	//    4    7:invokespecial   #98  <Method void zzzs(zzzp, zzzm)>
	//    5   10:astore          4
		zzatg1 = zzbvi;
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field zzatg zzbvi>
	//    8   16:astore          7
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    9   18:aload_1         
	//   10   19:invokestatic    #104 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   11   22:checkcast       #106 <Class Context>
	//   12   25:astore_1        
		int i = -1;
	//   13   26:iconst_m1       
	//   14   27:istore          5
		int j = s.hashCode();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #109 <Method int String.hashCode()>
	//   17   33:istore          6
		if(j == 0xacc57f2c) goto _L2; else goto _L1
	//   18   35:iload           6
	//   19   37:ldc1            #110 <Int 0xacc57f2c>
	//   20   39:icmpeq          111
_L1:
		if(j == 0xc1425017) goto _L4; else goto _L3
	//   21   42:iload           6
	//   22   44:ldc1            #111 <Int 0xc1425017>
	//   23   46:icmpeq          96
_L3:
		if(j == 0xf1b84c0e) goto _L6; else goto _L5
	//   24   49:iload           6
	//   25   51:ldc1            #112 <Int 0xf1b84c0e>
	//   26   53:icmpeq          81
_L5:
		if(j == 0x240b672c) goto _L8; else goto _L7
	//   27   56:iload           6
	//   28   58:ldc1            #113 <Int 0x240b672c>
	//   29   60:icmpeq          66
	//*  30   63:goto            202
_L8:
		if(s.equals("interstitial"))
	//*  31   66:aload_2         
	//*  32   67:ldc1            #115 <String "interstitial">
	//*  33   69:invokevirtual   #119 <Method boolean String.equals(Object)>
	//*  34   72:ifeq            202
			i = 1;
	//   35   75:iconst_1        
	//   36   76:istore          5
		  goto _L7
	//*  37   78:goto            202
_L6:
		if(s.equals("rewarded"))
	//*  38   81:aload_2         
	//*  39   82:ldc1            #121 <String "rewarded">
	//*  40   84:invokevirtual   #119 <Method boolean String.equals(Object)>
	//*  41   87:ifeq            202
			i = 2;
	//   42   90:iconst_2        
	//   43   91:istore          5
		  goto _L7
	//*  44   93:goto            202
_L4:
		if(s.equals("native"))
	//*  45   96:aload_2         
	//*  46   97:ldc1            #123 <String "native">
	//*  47   99:invokevirtual   #119 <Method boolean String.equals(Object)>
	//*  48  102:ifeq            202
			i = 3;
	//   49  105:iconst_3        
	//   50  106:istore          5
		  goto _L7
	//*  51  108:goto            202
_L2:
		if(s.equals("banner"))
	//*  52  111:aload_2         
	//*  53  112:ldc1            #125 <String "banner">
	//*  54  114:invokevirtual   #119 <Method boolean String.equals(Object)>
	//*  55  117:ifeq            202
			i = 0;
	//   56  120:iconst_0        
	//   57  121:istore          5
		  goto _L7
	//*  58  123:goto            202
	//*  59  126:goto            177
_L16:
		i = zzath.zzdgq;
	//   60  129:getstatic       #131 <Field int zzath.zzdgq>
	//   61  132:istore          5
		  goto _L9
	//*  62  134:goto            158
_L13:
		i = zzath.zzdgp;
	//   63  137:getstatic       #134 <Field int zzath.zzdgp>
	//   64  140:istore          5
		  goto _L9
	//*  65  142:goto            158
_L12:
		i = zzath.zzdgo;
	//   66  145:getstatic       #137 <Field int zzath.zzdgo>
	//   67  148:istore          5
		  goto _L9
	//*  68  150:goto            158
_L11:
		i = zzath.zzdgn;
	//   69  153:getstatic       #140 <Field int zzath.zzdgn>
	//   70  156:istore          5
_L9:
		zzatg1.zza(new zzati(((Context) (iobjectwrapper)), i, bundle), ((zzatj) (zzzm)));
	//   71  158:aload           7
	//   72  160:new             #142 <Class zzati>
	//   73  163:dup             
	//   74  164:aload_1         
	//   75  165:iload           5
	//   76  167:aload_3         
	//   77  168:invokespecial   #145 <Method void zzati(Context, int, Bundle)>
	//   78  171:aload           4
	//   79  173:invokevirtual   #150 <Method void com.google.android.gms.internal.ads.zzatg.zza(zzati, zzatj)>
		return;
	//   80  176:return          
_L10:
		try
		{
			throw new IllegalArgumentException("Internal Error");
	//   81  177:new             #152 <Class IllegalArgumentException>
	//   82  180:dup             
	//   83  181:ldc1            #154 <String "Internal Error">
	//   84  183:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//   85  186:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  86  187:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("Error generating signals for RTB", ((Throwable) (iobjectwrapper)));
	//   87  188:ldc1            #157 <String "Error generating signals for RTB">
	//   88  190:aload_1         
	//   89  191:invokestatic    #77  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
		}
		throw new RemoteException();
	//   90  194:new             #18  <Class RemoteException>
	//   91  197:dup             
	//   92  198:invokespecial   #78  <Method void RemoteException()>
	//   93  201:athrow          
_L7:
		i;
	//   94  202:iload           5
		JVM INSTR tableswitch 0 3: default 236
	//	               0 153
	//	               1 145
	//	               2 137
	//	               3 129;
	//   95  204:tableswitch     0 3: default 236
	//	               0 153
	//	               1 145
	//	               2 137
	//	               3 129
		   goto _L10 _L11 _L12 _L13 _L14
_L14:
		if(true) goto _L16; else goto _L15
_L15:
	//*  96  236:goto            126
	}

	public final void zza(byte abyte0[], String s, Bundle bundle, IObjectWrapper iobjectwrapper, zzzf zzzf, zzxt zzxt, zzjn zzjn1)
		throws RemoteException
	{
		try
		{
			zzzf = ((zzzf) (new zzzq(this, zzzf, zzxt)));
	//    0    0:new             #160 <Class zzzq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:aload           6
	//    5    9:invokespecial   #163 <Method void zzzq(zzzp, zzzf, zzxt)>
	//    6   12:astore          5
			zzxt = ((zzxt) (zzbvi));
	//    7   14:aload_0         
	//    8   15:getfield        #13  <Field zzatg zzbvi>
	//    9   18:astore          6
			new zzatf((Context)ObjectWrapper.unwrap(iobjectwrapper), abyte0, zzbt(s), bundle);
	//   10   20:new             #165 <Class zzatf>
	//   11   23:dup             
	//   12   24:aload           4
	//   13   26:invokestatic    #104 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   14   29:checkcast       #106 <Class Context>
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokestatic    #167 <Method Bundle zzbt(String)>
	//   18   37:aload_3         
	//   19   38:invokespecial   #170 <Method void zzatf(Context, byte[], Bundle, Bundle)>
	//   20   41:pop             
			zzb.zza(zzjn1.width, zzjn1.height, zzjn1.zzarb);
	//   21   42:aload           7
	//   22   44:getfield        #175 <Field int zzjn.width>
	//   23   47:aload           7
	//   24   49:getfield        #178 <Field int zzjn.height>
	//   25   52:aload           7
	//   26   54:getfield        #182 <Field String zzjn.zzarb>
	//   27   57:invokestatic    #187 <Method com.google.android.gms.ads.AdSize zzb.zza(int, int, String)>
	//   28   60:pop             
			((zzatd) (zzzf)).zzau(String.valueOf(((Object) (((Object) (zzxt)).getClass().getSimpleName()))).concat(" does not support banner."));
	//   29   61:aload           5
	//   30   63:aload           6
	//   31   65:invokevirtual   #193 <Method Class Object.getClass()>
	//   32   68:invokevirtual   #199 <Method String Class.getSimpleName()>
	//   33   71:invokestatic    #26  <Method String String.valueOf(Object)>
	//   34   74:ldc1            #201 <String " does not support banner.">
	//   35   76:invokevirtual   #36  <Method String String.concat(String)>
	//   36   79:invokeinterface #206 <Method void zzatd.zzau(String)>
			return;
	//   37   84:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  38   85:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("Adapter failed to render banner ad.", ((Throwable) (abyte0)));
	//   39   86:ldc1            #208 <String "Adapter failed to render banner ad.">
	//   40   88:aload_1         
	//   41   89:invokestatic    #77  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
		}
		throw new RemoteException();
	//   42   92:new             #18  <Class RemoteException>
	//   43   95:dup             
	//   44   96:invokespecial   #78  <Method void RemoteException()>
	//   45   99:athrow          
	}

	public final void zza(byte abyte0[], String s, Bundle bundle, IObjectWrapper iobjectwrapper, zzzh zzzh, zzxt zzxt)
		throws RemoteException
	{
		try
		{
			zzzh = ((zzzh) (new zzzr(this, zzzh, zzxt)));
	//    0    0:new             #211 <Class zzzr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload           5
	//    4    7:aload           6
	//    5    9:invokespecial   #214 <Method void zzzr(zzzp, zzzh, zzxt)>
	//    6   12:astore          5
			zzxt = ((zzxt) (zzbvi));
	//    7   14:aload_0         
	//    8   15:getfield        #13  <Field zzatg zzbvi>
	//    9   18:astore          6
			new zzatf((Context)ObjectWrapper.unwrap(iobjectwrapper), abyte0, zzbt(s), bundle);
	//   10   20:new             #165 <Class zzatf>
	//   11   23:dup             
	//   12   24:aload           4
	//   13   26:invokestatic    #104 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   14   29:checkcast       #106 <Class Context>
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokestatic    #167 <Method Bundle zzbt(String)>
	//   18   37:aload_3         
	//   19   38:invokespecial   #170 <Method void zzatf(Context, byte[], Bundle, Bundle)>
	//   20   41:pop             
			((zzatd) (zzzh)).zzau(String.valueOf(((Object) (((Object) (zzxt)).getClass().getSimpleName()))).concat(" does not support interstitial."));
	//   21   42:aload           5
	//   22   44:aload           6
	//   23   46:invokevirtual   #193 <Method Class Object.getClass()>
	//   24   49:invokevirtual   #199 <Method String Class.getSimpleName()>
	//   25   52:invokestatic    #26  <Method String String.valueOf(Object)>
	//   26   55:ldc1            #216 <String " does not support interstitial.">
	//   27   57:invokevirtual   #36  <Method String String.concat(String)>
	//   28   60:invokeinterface #206 <Method void zzatd.zzau(String)>
			return;
	//   29   65:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  30   66:astore_1        
		{
			com.google.android.gms.internal.ads.zzane.zzb("Adapter failed to render interstitial ad.", ((Throwable) (abyte0)));
	//   31   67:ldc1            #218 <String "Adapter failed to render interstitial ad.">
	//   32   69:aload_1         
	//   33   70:invokestatic    #77  <Method void com.google.android.gms.internal.ads.zzane.zzb(String, Throwable)>
		}
		throw new RemoteException();
	//   34   73:new             #18  <Class RemoteException>
	//   35   76:dup             
	//   36   77:invokespecial   #78  <Method void RemoteException()>
	//   37   80:athrow          
	}

	public final zzzt zznc()
		throws RemoteException
	{
		return com.google.android.gms.internal.ads.zzzt.zza(zzbvi.zzwa());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzatg zzbvi>
	//    2    4:invokevirtual   #224 <Method zzatk zzatg.zzwa()>
	//    3    7:invokestatic    #229 <Method zzzt com.google.android.gms.internal.ads.zzzt.zza(zzatk)>
	//    4   10:areturn         
	}

	public final zzzt zznd()
		throws RemoteException
	{
		return com.google.android.gms.internal.ads.zzzt.zza(zzbvi.zzvz());
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzatg zzbvi>
	//    2    4:invokevirtual   #233 <Method zzatk zzatg.zzvz()>
	//    3    7:invokestatic    #229 <Method zzzt com.google.android.gms.internal.ads.zzzt.zza(zzatk)>
	//    4   10:areturn         
	}

	private final zzatg zzbvi;
}
