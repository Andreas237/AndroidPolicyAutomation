// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.*;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.iid:
//			zzd, zzc

public class InstanceID
{

	protected InstanceID(Context context, String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		zzbhe = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #49  <String "">
	//    4    7:putfield        #51  <Field String zzbhe>
		mContext = context.getApplicationContext();
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #57  <Method Context Context.getApplicationContext()>
	//    8   15:putfield        #59  <Field Context mContext>
		zzbhe = s;
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:putfield        #51  <Field String zzbhe>
	//   12   23:return          
	}

	public static InstanceID getInstance(Context context)
	{
		return zza(context, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #65  <Method InstanceID zza(Context, Bundle)>
	//    3    5:areturn         
	}

	public static InstanceID zza(Context context, Bundle bundle)
	{
		com/google/android/gms/iid/InstanceID;
	//    0    0:ldc1            #2   <Class InstanceID>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(bundle != null) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:ifnonnull       107
_L1:
		String s = "";
	//    4    7:ldc1            #49  <String "">
	//    5    9:astore_2        
		  goto _L3
	//*   6   10:goto            126
_L5:
		InstanceID instanceid;
		Context context1;
		context1 = context.getApplicationContext();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #57  <Method Context Context.getApplicationContext()>
	//    9   17:astore          4
		if(zzbhb == null)
	//*  10   19:getstatic       #67  <Field zzd zzbhb>
	//*  11   22:ifnonnull       49
		{
			zzbhb = new zzd(context1);
	//   12   25:new             #69  <Class zzd>
	//   13   28:dup             
	//   14   29:aload           4
	//   15   31:invokespecial   #72  <Method void zzd(Context)>
	//   16   34:putstatic       #67  <Field zzd zzbhb>
			zzbhc = new zzc(context1);
	//   17   37:new             #74  <Class zzc>
	//   18   40:dup             
	//   19   41:aload           4
	//   20   43:invokespecial   #75  <Method void zzc(Context)>
	//   21   46:putstatic       #77  <Field zzc zzbhc>
		}
		zzbhg = Integer.toString(zzbf(context1));
	//   22   49:aload           4
	//   23   51:invokestatic    #81  <Method int zzbf(Context)>
	//   24   54:invokestatic    #87  <Method String Integer.toString(int)>
	//   25   57:putstatic       #89  <Field String zzbhg>
		instanceid = (InstanceID)zzbha.get(((Object) (s)));
	//   26   60:getstatic       #44  <Field Map zzbha>
	//   27   63:aload_2         
	//   28   64:invokeinterface #95  <Method Object Map.get(Object)>
	//   29   69:checkcast       #2   <Class InstanceID>
	//   30   72:astore_3        
		context = ((Context) (instanceid));
	//   31   73:aload_3         
	//   32   74:astore_0        
		if(instanceid != null)
			break MISSING_BLOCK_LABEL_102;
	//   33   75:aload_3         
	//   34   76:ifnonnull       102
		context = ((Context) (new InstanceID(context1, s, bundle)));
	//   35   79:new             #2   <Class InstanceID>
	//   36   82:dup             
	//   37   83:aload           4
	//   38   85:aload_2         
	//   39   86:aload_1         
	//   40   87:invokespecial   #97  <Method void InstanceID(Context, String, Bundle)>
	//   41   90:astore_0        
		zzbha.put(((Object) (s)), ((Object) (context)));
	//   42   91:getstatic       #44  <Field Map zzbha>
	//   43   94:aload_2         
	//   44   95:aload_0         
	//   45   96:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   46  101:pop             
		com/google/android/gms/iid/InstanceID;
	//   47  102:ldc1            #2   <Class InstanceID>
		JVM INSTR monitorexit ;
	//   48  104:monitorexit     
		return ((InstanceID) (context));
	//   49  105:aload_0         
	//   50  106:areturn         
_L2:
		s = bundle.getString("subtype");
	//   51  107:aload_1         
	//   52  108:ldc1            #103 <String "subtype">
	//   53  110:invokevirtual   #109 <Method String Bundle.getString(String)>
	//   54  113:astore_2        
		  goto _L3
	//*  55  114:goto            126
		context;
	//   56  117:astore_0        
	//*  57  118:ldc1            #2   <Class InstanceID>
		throw context;
	//   58  120:monitorexit     
	//   59  121:aload_0         
	//   60  122:athrow          
	//*  61  123:goto            13
_L3:
		if(s == null)
	//*  62  126:aload_2         
	//*  63  127:ifnonnull       123
			s = "";
	//   64  130:ldc1            #49  <String "">
	//   65  132:astore_2        
		if(true) goto _L5; else goto _L4
	//   66  133:goto            13
_L4:
	}

	static String zza(KeyPair keypair)
	{
		keypair = ((KeyPair) (keypair.getPublic().getEncoded()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method PublicKey KeyPair.getPublic()>
	//    2    4:invokeinterface #124 <Method byte[] PublicKey.getEncoded()>
	//    3    9:astore_0        
		try
		{
			keypair = ((KeyPair) (MessageDigest.getInstance("SHA1").digest(((byte []) (keypair)))));
	//    4   10:ldc1            #126 <String "SHA1">
	//    5   12:invokestatic    #131 <Method MessageDigest MessageDigest.getInstance(String)>
	//    6   15:aload_0         
	//    7   16:invokevirtual   #135 <Method byte[] MessageDigest.digest(byte[])>
	//    8   19:astore_0        
		}
	//*   9   20:aload_0         
	//*  10   21:iconst_0        
	//*  11   22:aload_0         
	//*  12   23:iconst_0        
	//*  13   24:baload          
	//*  14   25:bipush          15
	//*  15   27:iand            
	//*  16   28:bipush          112
	//*  17   30:iadd            
	//*  18   31:sipush          255
	//*  19   34:iand            
	//*  20   35:int2byte        
	//*  21   36:bastore         
	//*  22   37:aload_0         
	//*  23   38:iconst_0        
	//*  24   39:bipush          8
	//*  25   41:bipush          11
	//*  26   43:invokestatic    #141 <Method String Base64.encodeToString(byte[], int, int, int)>
	//*  27   46:astore_0        
	//*  28   47:aload_0         
	//*  29   48:areturn         
		// Misplaced declaration of an exception variable
		catch(KeyPair keypair)
	//*  30   49:astore_0        
		{
			Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
	//   31   50:ldc1            #143 <String "InstanceID">
	//   32   52:ldc1            #145 <String "Unexpected error, device missing required alghorithms">
	//   33   54:invokestatic    #151 <Method int Log.w(String, String)>
	//   34   57:pop             
			return null;
	//   35   58:aconst_null     
	//   36   59:areturn         
		}
		keypair[0] = (byte)((keypair[0] & 0xf) + 112 & 0xff);
		keypair = ((KeyPair) (Base64.encodeToString(((byte []) (keypair)), 0, 8, 11)));
		return ((String) (keypair));
	}

	static int zzbf(Context context)
	{
		int i;
		try
		{
			i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #161 <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #167 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:getfield        #173 <Field int PackageInfo.versionCode>
	//    7   15:istore_1        
		}
	//*   8   16:iload_1         
	//*   9   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   18:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (context)))));
	//   11   19:aload_0         
	//   12   20:invokestatic    #179 <Method String String.valueOf(Object)>
	//   13   23:astore_0        
			Log.w("InstanceID", (new StringBuilder(String.valueOf(((Object) (context))).length() + 38)).append("Never happens: can't find own package ").append(((String) (context))).toString());
	//   14   24:ldc1            #143 <String "InstanceID">
	//   15   26:new             #181 <Class StringBuilder>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:invokestatic    #179 <Method String String.valueOf(Object)>
	//   19   34:invokevirtual   #185 <Method int String.length()>
	//   20   37:bipush          38
	//   21   39:iadd            
	//   22   40:invokespecial   #188 <Method void StringBuilder(int)>
	//   23   43:ldc1            #190 <String "Never happens: can't find own package ">
	//   24   45:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   25   48:aload_0         
	//   26   49:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   28   55:invokestatic    #151 <Method int Log.w(String, String)>
	//   29   58:pop             
			return 0;
	//   30   59:iconst_0        
	//   31   60:ireturn         
		}
		return i;
	}

	static String zzbg(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #161 <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #167 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:getfield        #201 <Field String PackageInfo.versionName>
	//    7   15:astore_0        
		}
	//*   8   16:aload_0         
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   18:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (context)))));
	//   11   19:aload_0         
	//   12   20:invokestatic    #179 <Method String String.valueOf(Object)>
	//   13   23:astore_0        
			Log.w("InstanceID", (new StringBuilder(String.valueOf(((Object) (context))).length() + 38)).append("Never happens: can't find own package ").append(((String) (context))).toString());
	//   14   24:ldc1            #143 <String "InstanceID">
	//   15   26:new             #181 <Class StringBuilder>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:invokestatic    #179 <Method String String.valueOf(Object)>
	//   19   34:invokevirtual   #185 <Method int String.length()>
	//   20   37:bipush          38
	//   21   39:iadd            
	//   22   40:invokespecial   #188 <Method void StringBuilder(int)>
	//   23   43:ldc1            #190 <String "Never happens: can't find own package ">
	//   24   45:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   25   48:aload_0         
	//   26   49:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   28   55:invokestatic    #151 <Method int Log.w(String, String)>
	//   29   58:pop             
			return null;
	//   30   59:aconst_null     
	//   31   60:areturn         
		}
		return ((String) (context));
	}

	static String zzv(byte abyte0[])
	{
		return Base64.encodeToString(abyte0, 11);
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:invokestatic    #206 <Method String Base64.encodeToString(byte[], int)>
	//    3    6:areturn         
	}

	public void deleteInstanceID()
		throws IOException
	{
		zzb("*", "*", ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #211 <String "*">
	//    2    3:ldc1            #211 <String "*">
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #215 <Method void zzb(String, String, Bundle)>
		zzGu();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #218 <Method void zzGu()>
	//    7   13:return          
	}

	public void deleteToken(String s, String s1)
		throws IOException
	{
		zzb(s, s1, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #215 <Method void zzb(String, String, Bundle)>
	//    5    7:return          
	}

	public long getCreationTime()
	{
		if(zzbhf == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field long zzbhf>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            34
		{
			String s = zzbhb.get(zzbhe, "cre");
	//    5    9:getstatic       #67  <Field zzd zzbhb>
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field String zzbhe>
	//    8   16:ldc1            #227 <String "cre">
	//    9   18:invokevirtual   #230 <Method String zzd.get(String, String)>
	//   10   21:astore_1        
			if(s != null)
	//*  11   22:aload_1         
	//*  12   23:ifnull          34
				zzbhf = Long.parseLong(s);
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokestatic    #236 <Method long Long.parseLong(String)>
	//   16   31:putfield        #225 <Field long zzbhf>
		}
		return zzbhf;
	//   17   34:aload_0         
	//   18   35:getfield        #225 <Field long zzbhf>
	//   19   38:lreturn         
	}

	public String getId()
	{
		return zza(zzGt());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #241 <Method KeyPair zzGt()>
	//    2    4:invokestatic    #243 <Method String zza(KeyPair)>
	//    3    7:areturn         
	}

	public String getToken(String s, String s1)
		throws IOException
	{
		return getToken(s, s1, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #247 <Method String getToken(String, String, Bundle)>
	//    5    7:areturn         
	}

	public String getToken(String s, String s1, Bundle bundle)
		throws IOException
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(Looper.getMainLooper() == Looper.myLooper())
	//*   2    3:invokestatic    #253 <Method Looper Looper.getMainLooper()>
	//*   3    6:invokestatic    #256 <Method Looper Looper.myLooper()>
	//*   4    9:if_acmpne       22
			throw new IOException("MAIN_THREAD");
	//    5   12:new             #209 <Class IOException>
	//    6   15:dup             
	//    7   16:ldc1            #11  <String "MAIN_THREAD">
	//    8   18:invokespecial   #259 <Method void IOException(String)>
	//    9   21:athrow          
		boolean flag = true;
	//   10   22:iconst_1        
	//   11   23:istore          4
		Object obj;
		if(zzGx())
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #263 <Method boolean zzGx()>
	//*  14   29:ifeq            43
			obj = null;
	//   15   32:aconst_null     
	//   16   33:astore          6
		else
	//*  17   35:aload           6
	//*  18   37:ifnull          60
	//*  19   40:aload           6
	//*  20   42:areturn         
			obj = ((Object) (zzbhb.zzh(zzbhe, s, s1)));
	//   21   43:getstatic       #67  <Field zzd zzbhb>
	//   22   46:aload_0         
	//   23   47:getfield        #51  <Field String zzbhe>
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #267 <Method String zzd.zzh(String, String, String)>
	//   27   55:astore          6
		if(obj == null)
	//*  28   57:goto            35
		{
			obj = ((Object) (bundle));
	//   29   60:aload_3         
	//   30   61:astore          6
			if(bundle == null)
	//*  31   63:aload_3         
	//*  32   64:ifnonnull       76
				obj = ((Object) (new Bundle()));
	//   33   67:new             #105 <Class Bundle>
	//   34   70:dup             
	//   35   71:invokespecial   #268 <Method void Bundle()>
	//   36   74:astore          6
			if(((Bundle) (obj)).getString("ttl") != null)
	//*  37   76:aload           6
	//*  38   78:ldc2            #270 <String "ttl">
	//*  39   81:invokevirtual   #109 <Method String Bundle.getString(String)>
	//*  40   84:ifnull          90
				flag = false;
	//   41   87:iconst_0        
	//   42   88:istore          4
			if("jwt".equals(((Object) (((Bundle) (obj)).getString("type")))))
	//*  43   90:ldc2            #272 <String "jwt">
	//*  44   93:aload           6
	//*  45   95:ldc2            #274 <String "type">
	//*  46   98:invokevirtual   #109 <Method String Bundle.getString(String)>
	//*  47  101:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*  48  104:ifeq            153
				flag = flag1;
	//   49  107:iload           5
	//   50  109:istore          4
			bundle = ((Bundle) (zzc(s, s1, ((Bundle) (obj)))));
	//   51  111:aload_0         
	//   52  112:aload_1         
	//   53  113:aload_2         
	//   54  114:aload           6
	//   55  116:invokevirtual   #281 <Method String zzc(String, String, Bundle)>
	//   56  119:astore_3        
			obj = ((Object) (bundle));
	//   57  120:aload_3         
	//   58  121:astore          6
			if(bundle != null)
	//*  59  123:aload_3         
	//*  60  124:ifnull          40
			{
				obj = ((Object) (bundle));
	//   61  127:aload_3         
	//   62  128:astore          6
				if(flag)
	//*  63  130:iload           4
	//*  64  132:ifeq            40
				{
					zzbhb.zza(zzbhe, s, s1, ((String) (bundle)), zzbhg);
	//   65  135:getstatic       #67  <Field zzd zzbhb>
	//   66  138:aload_0         
	//   67  139:getfield        #51  <Field String zzbhe>
	//   68  142:aload_1         
	//   69  143:aload_2         
	//   70  144:aload_3         
	//   71  145:getstatic       #89  <Field String zzbhg>
	//   72  148:invokevirtual   #284 <Method void zzd.zza(String, String, String, String, String)>
					return ((String) (bundle));
	//   73  151:aload_3         
	//   74  152:areturn         
				}
			}
		}
		return ((String) (obj));
	//*  75  153:goto            111
	}

	KeyPair zzGt()
	{
		if(zzbhd == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #286 <Field KeyPair zzbhd>
	//*   2    4:ifnonnull       21
			zzbhd = zzbhb.zzeM(zzbhe);
	//    3    7:aload_0         
	//    4    8:getstatic       #67  <Field zzd zzbhb>
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field String zzbhe>
	//    7   15:invokevirtual   #290 <Method KeyPair zzd.zzeM(String)>
	//    8   18:putfield        #286 <Field KeyPair zzbhd>
		if(zzbhd == null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #286 <Field KeyPair zzbhd>
	//*  11   25:ifnonnull       53
		{
			zzbhf = System.currentTimeMillis();
	//   12   28:aload_0         
	//   13   29:invokestatic    #295 <Method long System.currentTimeMillis()>
	//   14   32:putfield        #225 <Field long zzbhf>
			zzbhd = zzbhb.zze(zzbhe, zzbhf);
	//   15   35:aload_0         
	//   16   36:getstatic       #67  <Field zzd zzbhb>
	//   17   39:aload_0         
	//   18   40:getfield        #51  <Field String zzbhe>
	//   19   43:aload_0         
	//   20   44:getfield        #225 <Field long zzbhf>
	//   21   47:invokevirtual   #299 <Method KeyPair zzd.zze(String, long)>
	//   22   50:putfield        #286 <Field KeyPair zzbhd>
		}
		return zzbhd;
	//   23   53:aload_0         
	//   24   54:getfield        #286 <Field KeyPair zzbhd>
	//   25   57:areturn         
	}

	public void zzGu()
	{
		zzbhf = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #225 <Field long zzbhf>
		zzbhb.zzeN(zzbhe);
	//    3    5:getstatic       #67  <Field zzd zzbhb>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field String zzbhe>
	//    6   12:invokevirtual   #302 <Method void zzd.zzeN(String)>
		zzbhd = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #286 <Field KeyPair zzbhd>
	//   10   20:return          
	}

	public zzd zzGv()
	{
		return zzbhb;
	//    0    0:getstatic       #67  <Field zzd zzbhb>
	//    1    3:areturn         
	}

	public zzc zzGw()
	{
		return zzbhc;
	//    0    0:getstatic       #77  <Field zzc zzbhc>
	//    1    3:areturn         
	}

	boolean zzGx()
	{
		String s = zzbhb.get("appVersion");
	//    0    0:getstatic       #67  <Field zzd zzbhb>
	//    1    3:ldc2            #308 <String "appVersion">
	//    2    6:invokevirtual   #310 <Method String zzd.get(String)>
	//    3    9:astore_3        
		long l;
		if(s != null && s.equals(((Object) (zzbhg))))
	//*   4   10:aload_3         
	//*   5   11:ifnull          24
	//*   6   14:aload_3         
	//*   7   15:getstatic       #89  <Field String zzbhg>
	//*   8   18:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*   9   21:ifne            26
	//*  10   24:iconst_1        
	//*  11   25:ireturn         
	//*  12   26:getstatic       #67  <Field zzd zzbhb>
	//*  13   29:ldc2            #312 <String "lastToken">
	//*  14   32:invokevirtual   #310 <Method String zzd.get(String)>
	//*  15   35:astore_3        
			if((s = zzbhb.get("lastToken")) != null && System.currentTimeMillis() / 1000L - Long.valueOf(l = Long.parseLong(s)).longValue() <= 0x93a80L)
	//*  16   36:aload_3         
	//*  17   37:ifnull          24
	//*  18   40:aload_3         
	//*  19   41:invokestatic    #236 <Method long Long.parseLong(String)>
	//*  20   44:lstore_1        
	//*  21   45:invokestatic    #295 <Method long System.currentTimeMillis()>
	//*  22   48:ldc2w           #313 <Long 1000L>
	//*  23   51:ldiv            
	//*  24   52:lload_1         
	//*  25   53:invokestatic    #317 <Method Long Long.valueOf(long)>
	//*  26   56:invokevirtual   #320 <Method long Long.longValue()>
	//*  27   59:lsub            
	//*  28   60:ldc2w           #321 <Long 0x93a80L>
	//*  29   63:lcmp            
	//*  30   64:ifgt            24
				return false;
	//   31   67:iconst_0        
	//   32   68:ireturn         
		return true;
	}

	public void zzb(String s, String s1, Bundle bundle)
		throws IOException
	{
		if(Looper.getMainLooper() == Looper.myLooper())
	//*   0    0:invokestatic    #253 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #256 <Method Looper Looper.myLooper()>
	//*   2    6:if_acmpne       19
			throw new IOException("MAIN_THREAD");
	//    3    9:new             #209 <Class IOException>
	//    4   12:dup             
	//    5   13:ldc1            #11  <String "MAIN_THREAD">
	//    6   15:invokespecial   #259 <Method void IOException(String)>
	//    7   18:athrow          
		zzbhb.zzi(zzbhe, s, s1);
	//    8   19:getstatic       #67  <Field zzd zzbhb>
	//    9   22:aload_0         
	//   10   23:getfield        #51  <Field String zzbhe>
	//   11   26:aload_1         
	//   12   27:aload_2         
	//   13   28:invokevirtual   #326 <Method void zzd.zzi(String, String, String)>
		Bundle bundle1 = bundle;
	//   14   31:aload_3         
	//   15   32:astore          4
		if(bundle == null)
	//*  16   34:aload_3         
	//*  17   35:ifnonnull       47
			bundle1 = new Bundle();
	//   18   38:new             #105 <Class Bundle>
	//   19   41:dup             
	//   20   42:invokespecial   #268 <Method void Bundle()>
	//   21   45:astore          4
		bundle1.putString("sender", s);
	//   22   47:aload           4
	//   23   49:ldc2            #328 <String "sender">
	//   24   52:aload_1         
	//   25   53:invokevirtual   #331 <Method void Bundle.putString(String, String)>
		if(s1 != null)
	//*  26   56:aload_2         
	//*  27   57:ifnull          69
			bundle1.putString("scope", s1);
	//   28   60:aload           4
	//   29   62:ldc2            #333 <String "scope">
	//   30   65:aload_2         
	//   31   66:invokevirtual   #331 <Method void Bundle.putString(String, String)>
		bundle1.putString("subscription", s);
	//   32   69:aload           4
	//   33   71:ldc2            #335 <String "subscription">
	//   34   74:aload_1         
	//   35   75:invokevirtual   #331 <Method void Bundle.putString(String, String)>
		bundle1.putString("delete", "1");
	//   36   78:aload           4
	//   37   80:ldc2            #337 <String "delete">
	//   38   83:ldc2            #339 <String "1">
	//   39   86:invokevirtual   #331 <Method void Bundle.putString(String, String)>
		bundle1.putString("X-delete", "1");
	//   40   89:aload           4
	//   41   91:ldc2            #341 <String "X-delete">
	//   42   94:ldc2            #339 <String "1">
	//   43   97:invokevirtual   #331 <Method void Bundle.putString(String, String)>
		if("".equals(((Object) (zzbhe))))
	//*  44  100:ldc1            #49  <String "">
	//*  45  102:aload_0         
	//*  46  103:getfield        #51  <Field String zzbhe>
	//*  47  106:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*  48  109:ifeq            165
			s1 = s;
	//   49  112:aload_1         
	//   50  113:astore_2        
		else
	//*  51  114:aload           4
	//*  52  116:ldc1            #103 <String "subtype">
	//*  53  118:aload_2         
	//*  54  119:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//*  55  122:ldc1            #49  <String "">
	//*  56  124:aload_0         
	//*  57  125:getfield        #51  <Field String zzbhe>
	//*  58  128:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*  59  131:ifeq            173
	//*  60  134:aload           4
	//*  61  136:ldc2            #343 <String "X-subtype">
	//*  62  139:aload_1         
	//*  63  140:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//*  64  143:getstatic       #77  <Field zzc zzbhc>
	//*  65  146:aload           4
	//*  66  148:aload_0         
	//*  67  149:invokevirtual   #241 <Method KeyPair zzGt()>
	//*  68  152:invokevirtual   #346 <Method android.content.Intent zzc.zza(Bundle, KeyPair)>
	//*  69  155:astore_1        
	//*  70  156:getstatic       #77  <Field zzc zzbhc>
	//*  71  159:aload_1         
	//*  72  160:invokevirtual   #350 <Method String zzc.zzt(android.content.Intent)>
	//*  73  163:pop             
	//*  74  164:return          
			s1 = zzbhe;
	//   75  165:aload_0         
	//   76  166:getfield        #51  <Field String zzbhe>
	//   77  169:astore_2        
		bundle1.putString("subtype", s1);
		if(!"".equals(((Object) (zzbhe))))
	//*  78  170:goto            114
			s = zzbhe;
	//   79  173:aload_0         
	//   80  174:getfield        #51  <Field String zzbhe>
	//   81  177:astore_1        
		bundle1.putString("X-subtype", s);
		s = ((String) (zzbhc.zza(bundle1, zzGt())));
		zzbhc.zzt(((android.content.Intent) (s)));
	//*  82  178:goto            134
	}

	public String zzc(String s, String s1, Bundle bundle)
		throws IOException
	{
		if(s1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			bundle.putString("scope", s1);
	//    2    4:aload_3         
	//    3    5:ldc2            #333 <String "scope">
	//    4    8:aload_2         
	//    5    9:invokevirtual   #331 <Method void Bundle.putString(String, String)>
		bundle.putString("sender", s);
	//    6   12:aload_3         
	//    7   13:ldc2            #328 <String "sender">
	//    8   16:aload_1         
	//    9   17:invokevirtual   #331 <Method void Bundle.putString(String, String)>
		if("".equals(((Object) (zzbhe))))
	//*  10   20:ldc1            #49  <String "">
	//*  11   22:aload_0         
	//*  12   23:getfield        #51  <Field String zzbhe>
	//*  13   26:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*  14   29:ifeq            95
			s1 = s;
	//   15   32:aload_1         
	//   16   33:astore_2        
		else
	//*  17   34:aload_3         
	//*  18   35:ldc2            #352 <String "legacy.register">
	//*  19   38:invokevirtual   #356 <Method boolean Bundle.containsKey(String)>
	//*  20   41:ifne            75
	//*  21   44:aload_3         
	//*  22   45:ldc2            #335 <String "subscription">
	//*  23   48:aload_1         
	//*  24   49:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//*  25   52:aload_3         
	//*  26   53:ldc1            #103 <String "subtype">
	//*  27   55:aload_2         
	//*  28   56:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//*  29   59:aload_3         
	//*  30   60:ldc2            #358 <String "X-subscription">
	//*  31   63:aload_1         
	//*  32   64:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//*  33   67:aload_3         
	//*  34   68:ldc2            #343 <String "X-subtype">
	//*  35   71:aload_2         
	//*  36   72:invokevirtual   #331 <Method void Bundle.putString(String, String)>
	//*  37   75:getstatic       #77  <Field zzc zzbhc>
	//*  38   78:aload_3         
	//*  39   79:aload_0         
	//*  40   80:invokevirtual   #241 <Method KeyPair zzGt()>
	//*  41   83:invokevirtual   #346 <Method android.content.Intent zzc.zza(Bundle, KeyPair)>
	//*  42   86:astore_1        
	//*  43   87:getstatic       #77  <Field zzc zzbhc>
	//*  44   90:aload_1         
	//*  45   91:invokevirtual   #350 <Method String zzc.zzt(android.content.Intent)>
	//*  46   94:areturn         
			s1 = zzbhe;
	//   47   95:aload_0         
	//   48   96:getfield        #51  <Field String zzbhe>
	//   49   99:astore_2        
		if(!bundle.containsKey("legacy.register"))
		{
			bundle.putString("subscription", s);
			bundle.putString("subtype", s1);
			bundle.putString("X-subscription", s);
			bundle.putString("X-subtype", s1);
		}
		s = ((String) (zzbhc.zza(bundle, zzGt())));
		return zzbhc.zzt(((android.content.Intent) (s)));
	//*  50  100:goto            34
	}

	public static final String ERROR_BACKOFF = "RETRY_LATER";
	public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
	public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
	public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
	public static final String ERROR_TIMEOUT = "TIMEOUT";
	static Map zzbha = new HashMap();
	private static zzd zzbhb;
	private static zzc zzbhc;
	static String zzbhg;
	Context mContext;
	KeyPair zzbhd;
	String zzbhe;
	long zzbhf;

	static 
	{
	//    0    0:new             #39  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void HashMap()>
	//    3    7:putstatic       #44  <Field Map zzbha>
	//*   4   10:return          
	}
}
