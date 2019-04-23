// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.*;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

// Referenced classes of package com.google.android.gms.common:
//			zzc, zzf, zze, GooglePlayServicesUtilLight, 
//			zzm, zzh

public class GoogleSignatureVerifier
{

	private GoogleSignatureVerifier(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #26  <Field Context mContext>
	//    6   12:return          
	}

	public static GoogleSignatureVerifier getInstance(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		com/google/android/gms/common/GoogleSignatureVerifier;
	//    3    5:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorenter ;
	//    4    7:monitorenter    
		if(zzam == null)
	//*   5    8:getstatic       #37  <Field GoogleSignatureVerifier zzam>
	//*   6   11:ifnonnull       29
		{
			com.google.android.gms.common.zzc.zza(context);
	//    7   14:aload_0         
	//    8   15:invokestatic    #42  <Method void zzc.zza(Context)>
			zzam = new GoogleSignatureVerifier(context);
	//    9   18:new             #2   <Class GoogleSignatureVerifier>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokespecial   #44  <Method void GoogleSignatureVerifier(Context)>
	//   13   26:putstatic       #37  <Field GoogleSignatureVerifier zzam>
		}
		com/google/android/gms/common/GoogleSignatureVerifier;
	//   14   29:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorexit ;
	//   15   31:monitorexit     
		return zzam;
	//   16   32:getstatic       #37  <Field GoogleSignatureVerifier zzam>
	//   17   35:areturn         
		context;
	//   18   36:astore_0        
		com/google/android/gms/common/GoogleSignatureVerifier;
	//   19   37:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorexit ;
	//   20   39:monitorexit     
		throw context;
	//   21   40:aload_0         
	//   22   41:athrow          
	}

	private static transient zze zza(PackageInfo packageinfo, zze azze[])
	{
		if(packageinfo.signatures == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(packageinfo.signatures.length != 1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*   7   13:arraylength     
	//*   8   14:iconst_1        
	//*   9   15:icmpeq          28
		{
			Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
	//   10   18:ldc1            #54  <String "GoogleSignatureVerifier">
	//   11   20:ldc1            #56  <String "Package has more than one signature.">
	//   12   22:invokestatic    #62  <Method int Log.w(String, String)>
	//   13   25:pop             
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		}
		packageinfo = ((PackageInfo) (packageinfo.signatures));
	//   16   28:aload_0         
	//   17   29:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//   18   32:astore_0        
		int i = 0;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		packageinfo = ((PackageInfo) (new zzf(((Signature) (packageinfo[0])).toByteArray())));
	//   21   35:new             #64  <Class zzf>
	//   22   38:dup             
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:aaload          
	//   26   42:invokevirtual   #70  <Method byte[] Signature.toByteArray()>
	//   27   45:invokespecial   #73  <Method void zzf(byte[])>
	//   28   48:astore_0        
		for(; i < azze.length; i++)
	//*  29   49:iload_2         
	//*  30   50:aload_1         
	//*  31   51:arraylength     
	//*  32   52:icmpge          76
			if(azze[i].equals(((Object) (packageinfo))))
	//*  33   55:aload_1         
	//*  34   56:iload_2         
	//*  35   57:aaload          
	//*  36   58:aload_0         
	//*  37   59:invokevirtual   #79  <Method boolean zze.equals(Object)>
	//*  38   62:ifeq            69
				return azze[i];
	//   39   65:aload_1         
	//   40   66:iload_2         
	//   41   67:aaload          
	//   42   68:areturn         

	//   43   69:iload_2         
	//   44   70:iconst_1        
	//   45   71:iadd            
	//   46   72:istore_2        
	//*  47   73:goto            49
		return null;
	//   48   76:aconst_null     
	//   49   77:areturn         
	}

	private final zzm zza(String s, int i)
	{
		boolean flag;
		Object obj;
		zzf zzf1;
		String s1;
		zzm zzm1;
		try
		{
			obj = ((Object) (Wrappers.packageManager(mContext).zza(s, 64, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Context mContext>
	//    2    4:invokestatic    #88  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    3    7:aload_1         
	//    4    8:bipush          64
	//    5   10:iload_2         
	//    6   11:invokevirtual   #93  <Method PackageInfo PackageManagerWrapper.zza(String, int, int)>
	//    7   14:astore          4
			flag = GooglePlayServicesUtilLight.honorsDebugCertificates(mContext);
	//    8   16:aload_0         
	//    9   17:getfield        #26  <Field Context mContext>
	//   10   20:invokestatic    #99  <Method boolean GooglePlayServicesUtilLight.honorsDebugCertificates(Context)>
	//   11   23:istore_3        
		}
	//*  12   24:aload           4
	//*  13   26:ifnonnull       35
	//*  14   29:ldc1            #101 <String "null pkg">
	//*  15   31:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//*  16   34:areturn         
	//*  17   35:aload           4
	//*  18   37:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*  19   40:arraylength     
	//*  20   41:iconst_1        
	//*  21   42:icmpeq          51
	//*  22   45:ldc1            #109 <String "single cert required">
	//*  23   47:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//*  24   50:areturn         
	//*  25   51:new             #64  <Class zzf>
	//*  26   54:dup             
	//*  27   55:aload           4
	//*  28   57:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*  29   60:iconst_0        
	//*  30   61:aaload          
	//*  31   62:invokevirtual   #70  <Method byte[] Signature.toByteArray()>
	//*  32   65:invokespecial   #73  <Method void zzf(byte[])>
	//*  33   68:astore          5
	//*  34   70:aload           4
	//*  35   72:getfield        #112 <Field String PackageInfo.packageName>
	//*  36   75:astore          6
	//*  37   77:aload           6
	//*  38   79:aload           5
	//*  39   81:iload_3         
	//*  40   82:iconst_0        
	//*  41   83:invokestatic    #115 <Method zzm zzc.zza(String, zze, boolean, boolean)>
	//*  42   86:astore          7
	//*  43   88:aload           7
	//*  44   90:getfield        #119 <Field boolean zzm.zzad>
	//*  45   93:ifeq            146
	//*  46   96:aload           4
	//*  47   98:getfield        #123 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  48  101:ifnull          146
	//*  49  104:aload           4
	//*  50  106:getfield        #123 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  51  109:getfield        #129 <Field int ApplicationInfo.flags>
	//*  52  112:iconst_2        
	//*  53  113:iand            
	//*  54  114:ifeq            146
	//*  55  117:iload_3         
	//*  56  118:ifeq            136
	//*  57  121:aload           6
	//*  58  123:aload           5
	//*  59  125:iconst_0        
	//*  60  126:iconst_0        
	//*  61  127:invokestatic    #115 <Method zzm zzc.zza(String, zze, boolean, boolean)>
	//*  62  130:getfield        #119 <Field boolean zzm.zzad>
	//*  63  133:ifeq            146
	//*  64  136:ldc1            #131 <String "debuggable release cert app rejected">
	//*  65  138:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//*  66  141:astore          4
	//*  67  143:aload           4
	//*  68  145:areturn         
	//*  69  146:aload           7
	//*  70  148:areturn         
	//*  71  149:aload_1         
	//*  72  150:invokestatic    #137 <Method String String.valueOf(Object)>
	//*  73  153:astore_1        
	//*  74  154:aload_1         
	//*  75  155:invokevirtual   #141 <Method int String.length()>
	//*  76  158:ifeq            171
	//*  77  161:ldc1            #143 <String "no pkg ">
	//*  78  163:aload_1         
	//*  79  164:invokevirtual   #147 <Method String String.concat(String)>
	//*  80  167:astore_1        
	//*  81  168:goto            181
	//*  82  171:new             #133 <Class String>
	//*  83  174:dup             
	//*  84  175:ldc1            #143 <String "no pkg ">
	//*  85  177:invokespecial   #150 <Method void String(String)>
	//*  86  180:astore_1        
	//*  87  181:aload_1         
	//*  88  182:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//*  89  185:areturn         
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			s = String.valueOf(((Object) (s)));
			if(s.length() != 0)
				s = "no pkg ".concat(s);
			else
				s = new String("no pkg ");
			return zzm.zzb(s);
		}
		if(obj != null)
			break MISSING_BLOCK_LABEL_35;
		return zzm.zzb("null pkg");
		if(((PackageInfo) (obj)).signatures.length != 1)
			return zzm.zzb("single cert required");
		zzf1 = new zzf(((PackageInfo) (obj)).signatures[0].toByteArray());
		s1 = ((PackageInfo) (obj)).packageName;
		zzm1 = com.google.android.gms.common.zzc.zza(s1, ((zze) (zzf1)), flag, false);
		if(!zzm1.zzad || ((PackageInfo) (obj)).applicationInfo == null || (((PackageInfo) (obj)).applicationInfo.flags & 2) == 0)
			break MISSING_BLOCK_LABEL_146;
		if(!flag)
			break MISSING_BLOCK_LABEL_136;
		if(!com.google.android.gms.common.zzc.zza(s1, ((zze) (zzf1)), false, false).zzad)
			break MISSING_BLOCK_LABEL_146;
		obj = ((Object) (zzm.zzb("debuggable release cert app rejected")));
		return ((zzm) (obj));
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		return zzm1;
	//*  90  186:astore          4
	//*  91  188:goto            149
	}

	public static boolean zza(PackageInfo packageinfo, boolean flag)
	{
		if(packageinfo != null && packageinfo.signatures != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          49
	//*   2    4:aload_0         
	//*   3    5:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*   4    8:ifnull          49
		{
			if(flag)
	//*   5   11:iload_1         
	//*   6   12:ifeq            26
				packageinfo = ((PackageInfo) (zza(packageinfo, zzh.zzx)));
	//    7   15:aload_0         
	//    8   16:getstatic       #157 <Field zze[] zzh.zzx>
	//    9   19:invokestatic    #159 <Method zze zza(PackageInfo, zze[])>
	//   10   22:astore_0        
			else
	//*  11   23:goto            43
				packageinfo = ((PackageInfo) (zza(packageinfo, new zze[] {
					zzh.zzx[0]
				})));
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:anewarray       zze[]
	//   15   31:dup             
	//   16   32:iconst_0        
	//   17   33:getstatic       #157 <Field zze[] zzh.zzx>
	//   18   36:iconst_0        
	//   19   37:aaload          
	//   20   38:aastore         
	//   21   39:invokestatic    #159 <Method zze zza(PackageInfo, zze[])>
	//   22   42:astore_0        
			if(packageinfo != null)
	//*  23   43:aload_0         
	//*  24   44:ifnull          49
				return true;
	//   25   47:iconst_1        
	//   26   48:ireturn         
		}
		return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
	}

	private final zzm zzc(String s)
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			return zzm.zzb("null pkg");
	//    2    4:ldc1            #101 <String "null pkg">
	//    3    6:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//    4    9:areturn         
		if(s.equals(((Object) (zzan))))
	//*   5   10:aload_1         
	//*   6   11:aload_0         
	//*   7   12:getfield        #162 <Field String zzan>
	//*   8   15:invokevirtual   #163 <Method boolean String.equals(Object)>
	//*   9   18:ifeq            25
			return zzm.zze();
	//   10   21:invokestatic    #167 <Method zzm zzm.zze()>
	//   11   24:areturn         
		boolean flag;
		zzm zzm1;
		PackageInfo packageinfo;
		try
		{
			packageinfo = Wrappers.packageManager(mContext).getPackageInfo(s, 64);
	//   12   25:aload_0         
	//   13   26:getfield        #26  <Field Context mContext>
	//   14   29:invokestatic    #88  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   15   32:aload_1         
	//   16   33:bipush          64
	//   17   35:invokevirtual   #171 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//   18   38:astore          4
		}
	//*  19   40:aload_0         
	//*  20   41:getfield        #26  <Field Context mContext>
	//*  21   44:invokestatic    #99  <Method boolean GooglePlayServicesUtilLight.honorsDebugCertificates(Context)>
	//*  22   47:istore_2        
	//*  23   48:aload           4
	//*  24   50:ifnonnull       62
	//*  25   53:ldc1            #101 <String "null pkg">
	//*  26   55:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//*  27   58:astore_3        
	//*  28   59:goto            173
	//*  29   62:aload           4
	//*  30   64:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*  31   67:arraylength     
	//*  32   68:iconst_1        
	//*  33   69:icmpeq          81
	//*  34   72:ldc1            #109 <String "single cert required">
	//*  35   74:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//*  36   77:astore_3        
	//*  37   78:goto            173
	//*  38   81:new             #64  <Class zzf>
	//*  39   84:dup             
	//*  40   85:aload           4
	//*  41   87:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*  42   90:iconst_0        
	//*  43   91:aaload          
	//*  44   92:invokevirtual   #70  <Method byte[] Signature.toByteArray()>
	//*  45   95:invokespecial   #73  <Method void zzf(byte[])>
	//*  46   98:astore          5
	//*  47  100:aload           4
	//*  48  102:getfield        #112 <Field String PackageInfo.packageName>
	//*  49  105:astore          6
	//*  50  107:aload           6
	//*  51  109:aload           5
	//*  52  111:iload_2         
	//*  53  112:iconst_0        
	//*  54  113:invokestatic    #115 <Method zzm zzc.zza(String, zze, boolean, boolean)>
	//*  55  116:astore_3        
	//*  56  117:aload_3         
	//*  57  118:getfield        #119 <Field boolean zzm.zzad>
	//*  58  121:ifeq            173
	//*  59  124:aload           4
	//*  60  126:getfield        #123 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  61  129:ifnull          173
	//*  62  132:aload           4
	//*  63  134:getfield        #123 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  64  137:getfield        #129 <Field int ApplicationInfo.flags>
	//*  65  140:iconst_2        
	//*  66  141:iand            
	//*  67  142:ifeq            173
	//*  68  145:iload_2         
	//*  69  146:ifeq            164
	//*  70  149:aload           6
	//*  71  151:aload           5
	//*  72  153:iconst_0        
	//*  73  154:iconst_0        
	//*  74  155:invokestatic    #115 <Method zzm zzc.zza(String, zze, boolean, boolean)>
	//*  75  158:getfield        #119 <Field boolean zzm.zzad>
	//*  76  161:ifeq            173
	//*  77  164:ldc1            #131 <String "debuggable release cert app rejected">
	//*  78  166:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//*  79  169:astore_3        
	//*  80  170:goto            173
	//*  81  173:aload_3         
	//*  82  174:getfield        #119 <Field boolean zzm.zzad>
	//*  83  177:ifeq            185
	//*  84  180:aload_0         
	//*  85  181:aload_1         
	//*  86  182:putfield        #162 <Field String zzan>
	//*  87  185:aload_3         
	//*  88  186:areturn         
	//*  89  187:aload_1         
	//*  90  188:invokestatic    #137 <Method String String.valueOf(Object)>
	//*  91  191:astore_1        
	//*  92  192:aload_1         
	//*  93  193:invokevirtual   #141 <Method int String.length()>
	//*  94  196:ifeq            209
	//*  95  199:ldc1            #143 <String "no pkg ">
	//*  96  201:aload_1         
	//*  97  202:invokevirtual   #147 <Method String String.concat(String)>
	//*  98  205:astore_1        
	//*  99  206:goto            219
	//* 100  209:new             #133 <Class String>
	//* 101  212:dup             
	//* 102  213:ldc1            #143 <String "no pkg ">
	//* 103  215:invokespecial   #150 <Method void String(String)>
	//* 104  218:astore_1        
	//* 105  219:aload_1         
	//* 106  220:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//* 107  223:areturn         
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			s = String.valueOf(((Object) (s)));
			if(s.length() != 0)
				s = "no pkg ".concat(s);
			else
				s = new String("no pkg ");
			return zzm.zzb(s);
		}
		flag = GooglePlayServicesUtilLight.honorsDebugCertificates(mContext);
		if(packageinfo == null)
			zzm1 = zzm.zzb("null pkg");
		else
		if(packageinfo.signatures.length != 1)
		{
			zzm1 = zzm.zzb("single cert required");
		} else
		{
			zzf zzf1 = new zzf(packageinfo.signatures[0].toByteArray());
			String s1 = packageinfo.packageName;
			zzm1 = com.google.android.gms.common.zzc.zza(s1, ((zze) (zzf1)), flag, false);
			if(zzm1.zzad && packageinfo.applicationInfo != null && (packageinfo.applicationInfo.flags & 2) != 0 && (!flag || com.google.android.gms.common.zzc.zza(s1, ((zze) (zzf1)), false, false).zzad))
				zzm1 = zzm.zzb("debuggable release cert app rejected");
		}
		if(zzm1.zzad)
			zzan = s;
		return zzm1;
	//* 108  224:astore_3        
	//* 109  225:goto            187
	}

	public boolean isGooglePublicSignedPackage(PackageInfo packageinfo)
	{
		if(packageinfo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(zza(packageinfo, false))
	//*   4    6:aload_1         
	//*   5    7:iconst_0        
	//*   6    8:invokestatic    #175 <Method boolean zza(PackageInfo, boolean)>
	//*   7   11:ifeq            16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		if(zza(packageinfo, true))
	//*  10   16:aload_1         
	//*  11   17:iconst_1        
	//*  12   18:invokestatic    #175 <Method boolean zza(PackageInfo, boolean)>
	//*  13   21:ifeq            44
		{
			if(GooglePlayServicesUtilLight.honorsDebugCertificates(mContext))
	//*  14   24:aload_0         
	//*  15   25:getfield        #26  <Field Context mContext>
	//*  16   28:invokestatic    #99  <Method boolean GooglePlayServicesUtilLight.honorsDebugCertificates(Context)>
	//*  17   31:ifeq            36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
			Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
	//   20   36:ldc1            #54  <String "GoogleSignatureVerifier">
	//   21   38:ldc1            #177 <String "Test-keys aren't accepted on this build.">
	//   22   40:invokestatic    #62  <Method int Log.w(String, String)>
	//   23   43:pop             
		}
		return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
	}

	public boolean isPackageGoogleSigned(String s)
	{
		s = ((String) (zzc(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method zzm zzc(String)>
	//    3    5:astore_1        
		((zzm) (s)).zzf();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #184 <Method void zzm.zzf()>
		return ((zzm) (s)).zzad;
	//    6   10:aload_1         
	//    7   11:getfield        #119 <Field boolean zzm.zzad>
	//    8   14:ireturn         
	}

	public boolean isUidGoogleSigned(int i)
	{
		String as[] = Wrappers.packageManager(mContext).getPackagesForUid(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Context mContext>
	//    2    4:invokestatic    #88  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #190 <Method String[] PackageManagerWrapper.getPackagesForUid(int)>
	//    5   11:astore          6
		zzm zzm1;
		if(as != null && as.length != 0)
	//*   6   13:aload           6
	//*   7   15:ifnull          75
	//*   8   18:aload           6
	//*   9   20:arraylength     
	//*  10   21:ifne            27
	//*  11   24:goto            75
		{
			zzm1 = null;
	//   12   27:aconst_null     
	//   13   28:astore          4
			int k = as.length;
	//   14   30:aload           6
	//   15   32:arraylength     
	//   16   33:istore_3        
			int j = 0;
	//   17   34:iconst_0        
	//   18   35:istore_2        
			do
			{
				if(j >= k)
					break;
	//   19   36:iload_2         
	//   20   37:iload_3         
	//   21   38:icmpge          82
				zzm zzm2 = zza(as[j], i);
	//   22   41:aload_0         
	//   23   42:aload           6
	//   24   44:iload_2         
	//   25   45:aaload          
	//   26   46:iload_1         
	//   27   47:invokespecial   #192 <Method zzm zza(String, int)>
	//   28   50:astore          5
				zzm1 = zzm2;
	//   29   52:aload           5
	//   30   54:astore          4
				if(zzm2.zzad)
					break;
	//   31   56:aload           5
	//   32   58:getfield        #119 <Field boolean zzm.zzad>
	//   33   61:ifne            82
				j++;
	//   34   64:iload_2         
	//   35   65:iconst_1        
	//   36   66:iadd            
	//   37   67:istore_2        
				zzm1 = zzm2;
	//   38   68:aload           5
	//   39   70:astore          4
			} while(true);
	//   40   72:goto            36
		} else
		{
			zzm1 = zzm.zzb("no pkgs");
	//   41   75:ldc1            #194 <String "no pkgs">
	//   42   77:invokestatic    #107 <Method zzm zzm.zzb(String)>
	//   43   80:astore          4
		}
		zzm1.zzf();
	//   44   82:aload           4
	//   45   84:invokevirtual   #184 <Method void zzm.zzf()>
		return zzm1.zzad;
	//   46   87:aload           4
	//   47   89:getfield        #119 <Field boolean zzm.zzad>
	//   48   92:ireturn         
	}

	private static GoogleSignatureVerifier zzam;
	private final Context mContext;
	private volatile String zzan;
}
