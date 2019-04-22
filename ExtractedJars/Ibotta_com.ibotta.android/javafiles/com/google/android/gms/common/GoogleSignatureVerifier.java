// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.*;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.*;

// Referenced classes of package com.google.android.gms.common:
//			GoogleCertificates, zzb, GooglePlayServicesUtilLight, zzg, 
//			zzd

public class GoogleSignatureVerifier
{

	private GoogleSignatureVerifier(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #22  <Field Context mContext>
	//    6   12:return          
	}

	public static GoogleSignatureVerifier getInstance(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		com/google/android/gms/common/GoogleSignatureVerifier;
	//    3    5:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorenter ;
	//    4    7:monitorenter    
		if(zzbv == null)
	//*   5    8:getstatic       #33  <Field GoogleSignatureVerifier zzbv>
	//*   6   11:ifnonnull       29
		{
			GoogleCertificates.init(context);
	//    7   14:aload_0         
	//    8   15:invokestatic    #38  <Method void GoogleCertificates.init(Context)>
			zzbv = new GoogleSignatureVerifier(context);
	//    9   18:new             #2   <Class GoogleSignatureVerifier>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokespecial   #40  <Method void GoogleSignatureVerifier(Context)>
	//   13   26:putstatic       #33  <Field GoogleSignatureVerifier zzbv>
		}
		com/google/android/gms/common/GoogleSignatureVerifier;
	//   14   29:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorexit ;
	//   15   31:monitorexit     
		return zzbv;
	//   16   32:getstatic       #33  <Field GoogleSignatureVerifier zzbv>
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

	public static void resetForTests()
	{
		com/google/android/gms/common/GoogleSignatureVerifier;
	//    0    0:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzbv = null;
	//    2    3:aconst_null     
	//    3    4:putstatic       #33  <Field GoogleSignatureVerifier zzbv>
		com/google/android/gms/common/GoogleSignatureVerifier;
	//    4    7:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		Exception exception;
		exception;
	//    7   11:astore_0        
	//*   8   12:ldc1            #2   <Class GoogleSignatureVerifier>
		throw exception;
	//    9   14:monitorexit     
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	private static transient GoogleCertificates.CertData zza(PackageInfo packageinfo, GoogleCertificates.CertData acertdata[])
	{
		if(packageinfo.signatures == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(packageinfo.signatures.length != 1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//*   7   13:arraylength     
	//*   8   14:iconst_1        
	//*   9   15:icmpeq          28
		{
			Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
	//   10   18:ldc1            #53  <String "GoogleSignatureVerifier">
	//   11   20:ldc1            #55  <String "Package has more than one signature.">
	//   12   22:invokestatic    #61  <Method int Log.w(String, String)>
	//   13   25:pop             
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		}
		packageinfo = ((PackageInfo) (packageinfo.signatures));
	//   16   28:aload_0         
	//   17   29:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//   18   32:astore_0        
		int i = 0;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		packageinfo = ((PackageInfo) (new zzb(((Signature) (packageinfo[0])).toByteArray())));
	//   21   35:new             #63  <Class zzb>
	//   22   38:dup             
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:aaload          
	//   26   42:invokevirtual   #69  <Method byte[] Signature.toByteArray()>
	//   27   45:invokespecial   #72  <Method void zzb(byte[])>
	//   28   48:astore_0        
		for(; i < acertdata.length; i++)
	//*  29   49:iload_2         
	//*  30   50:aload_1         
	//*  31   51:arraylength     
	//*  32   52:icmpge          76
			if(acertdata[i].equals(((Object) (packageinfo))))
	//*  33   55:aload_1         
	//*  34   56:iload_2         
	//*  35   57:aaload          
	//*  36   58:aload_0         
	//*  37   59:invokevirtual   #78  <Method boolean GoogleCertificates$CertData.equals(Object)>
	//*  38   62:ifeq            69
				return acertdata[i];
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

	private final zzg zza(PackageInfo packageinfo)
	{
		boolean flag = GooglePlayServicesUtilLight.honorsDebugCertificates(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:invokestatic    #85  <Method boolean GooglePlayServicesUtilLight.honorsDebugCertificates(Context)>
	//    3    7:istore_2        
		if(packageinfo == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			packageinfo = "null pkg";
	//    6   12:ldc1            #87  <String "null pkg">
	//    7   14:astore_1        
		else
	//*   8   15:aload_1         
	//*   9   16:invokestatic    #93  <Method zzg zzg.zze(String)>
	//*  10   19:areturn         
		if(packageinfo.signatures.length != 1)
	//*  11   20:aload_1         
	//*  12   21:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//*  13   24:arraylength     
	//*  14   25:iconst_1        
	//*  15   26:icmpeq          35
		{
			packageinfo = "single cert required";
	//   16   29:ldc1            #95  <String "single cert required">
	//   17   31:astore_1        
		} else
	//*  18   32:goto            15
		{
			zzb zzb1 = new zzb(packageinfo.signatures[0].toByteArray());
	//   19   35:new             #63  <Class zzb>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//   23   43:iconst_0        
	//   24   44:aaload          
	//   25   45:invokevirtual   #69  <Method byte[] Signature.toByteArray()>
	//   26   48:invokespecial   #72  <Method void zzb(byte[])>
	//   27   51:astore_3        
			String s = packageinfo.packageName;
	//   28   52:aload_1         
	//   29   53:getfield        #99  <Field String PackageInfo.packageName>
	//   30   56:astore          4
			zzg zzg1 = GoogleCertificates.zza(s, ((GoogleCertificates.CertData) (zzb1)), flag);
	//   31   58:aload           4
	//   32   60:aload_3         
	//   33   61:iload_2         
	//   34   62:invokestatic    #102 <Method zzg GoogleCertificates.zza(String, GoogleCertificates$CertData, boolean)>
	//   35   65:astore          5
			if(zzg1.zzbl && packageinfo.applicationInfo != null && (packageinfo.applicationInfo.flags & 2) != 0 && (!flag || GoogleCertificates.zza(s, ((GoogleCertificates.CertData) (zzb1)), false).zzbl))
	//*  36   67:aload           5
	//*  37   69:getfield        #106 <Field boolean zzg.zzbl>
	//*  38   72:ifeq            117
	//*  39   75:aload_1         
	//*  40   76:getfield        #110 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  41   79:ifnull          117
	//*  42   82:aload_1         
	//*  43   83:getfield        #110 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  44   86:getfield        #116 <Field int ApplicationInfo.flags>
	//*  45   89:iconst_2        
	//*  46   90:iand            
	//*  47   91:ifeq            117
	//*  48   94:iload_2         
	//*  49   95:ifeq            111
	//*  50   98:aload           4
	//*  51  100:aload_3         
	//*  52  101:iconst_0        
	//*  53  102:invokestatic    #102 <Method zzg GoogleCertificates.zza(String, GoogleCertificates$CertData, boolean)>
	//*  54  105:getfield        #106 <Field boolean zzg.zzbl>
	//*  55  108:ifeq            117
				packageinfo = "debuggable release cert app rejected";
	//   56  111:ldc1            #118 <String "debuggable release cert app rejected">
	//   57  113:astore_1        
			else
	//*  58  114:goto            15
				return zzg1;
	//   59  117:aload           5
	//   60  119:areturn         
		}
		return zzg.zze(((String) (packageinfo)));
	}

	private final zzg zzb(int i)
	{
		String as[] = Wrappers.packageManager(mContext).getPackagesForUid(i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:invokestatic    #126 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #132 <Method String[] PackageManagerWrapper.getPackagesForUid(int)>
	//    5   11:astore          4
		if(as != null && as.length != 0)
	//*   6   13:aload           4
	//*   7   15:ifnull          67
	//*   8   18:aload           4
	//*   9   20:arraylength     
	//*  10   21:ifne            27
	//*  11   24:goto            67
		{
			zzg zzg1 = null;
	//   12   27:aconst_null     
	//   13   28:astore_3        
			int j = as.length;
	//   14   29:aload           4
	//   15   31:arraylength     
	//   16   32:istore_2        
			for(i = 0; i < j; i++)
	//*  17   33:iconst_0        
	//*  18   34:istore_1        
	//*  19   35:iload_1         
	//*  20   36:iload_2         
	//*  21   37:icmpge          65
			{
				zzg1 = zzf(as[i]);
	//   22   40:aload_0         
	//   23   41:aload           4
	//   24   43:iload_1         
	//   25   44:aaload          
	//   26   45:invokespecial   #135 <Method zzg zzf(String)>
	//   27   48:astore_3        
				if(zzg1.zzbl)
	//*  28   49:aload_3         
	//*  29   50:getfield        #106 <Field boolean zzg.zzbl>
	//*  30   53:ifeq            58
					return zzg1;
	//   31   56:aload_3         
	//   32   57:areturn         
			}

	//   33   58:iload_1         
	//   34   59:iconst_1        
	//   35   60:iadd            
	//   36   61:istore_1        
	//*  37   62:goto            35
			return zzg1;
	//   38   65:aload_3         
	//   39   66:areturn         
		} else
		{
			return zzg.zze("no pkgs");
	//   40   67:ldc1            #137 <String "no pkgs">
	//   41   69:invokestatic    #93  <Method zzg zzg.zze(String)>
	//   42   72:areturn         
		}
	}

	private final zzg zzf(String s)
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		PackageInfo packageinfo;
		try
		{
			packageinfo = Wrappers.packageManager(mContext).getPackageInfo(s, 64);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context mContext>
	//    2    4:invokestatic    #126 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    3    7:aload_1         
	//    4    8:bipush          64
	//    5   10:invokevirtual   #143 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    6   13:astore_2        
		}
	//*   7   14:aload_0         
	//*   8   15:aload_2         
	//*   9   16:invokespecial   #145 <Method zzg zza(PackageInfo)>
	//*  10   19:areturn         
	//*  11   20:aload_1         
	//*  12   21:invokestatic    #151 <Method String String.valueOf(Object)>
	//*  13   24:astore_1        
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #155 <Method int String.length()>
	//*  16   29:ifeq            42
	//*  17   32:ldc1            #157 <String "no pkg ">
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #161 <Method String String.concat(String)>
	//*  20   38:astore_1        
	//*  21   39:goto            52
	//*  22   42:new             #147 <Class String>
	//*  23   45:dup             
	//*  24   46:ldc1            #157 <String "no pkg ">
	//*  25   48:invokespecial   #164 <Method void String(String)>
	//*  26   51:astore_1        
	//*  27   52:aload_1         
	//*  28   53:invokestatic    #93  <Method zzg zzg.zze(String)>
	//*  29   56:areturn         
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			s = String.valueOf(((Object) (s)));
			if(s.length() != 0)
				s = "no pkg ".concat(s);
			else
				s = new String("no pkg ");
			return zzg.zze(s);
		}
		return zza(packageinfo);
	//*  30   57:astore_2        
	//*  31   58:goto            20
	}

	public Set getAllGoogleSignatures(boolean flag)
	{
		Object obj;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			obj = ((Object) (GoogleCertificates.zzd()));
	//    2    4:invokestatic    #173 <Method Set GoogleCertificates.zzd()>
	//    3    7:astore_2        
		else
	//*   4    8:goto            15
			obj = ((Object) (GoogleCertificates.zze()));
	//    5   11:invokestatic    #175 <Method Set GoogleCertificates.zze()>
	//    6   14:astore_2        
		HashSet hashset = new HashSet(((Set) (obj)).size());
	//    7   15:new             #177 <Class HashSet>
	//    8   18:dup             
	//    9   19:aload_2         
	//   10   20:invokeinterface #182 <Method int Set.size()>
	//   11   25:invokespecial   #185 <Method void HashSet(int)>
	//   12   28:astore_3        
		try
		{
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Set) (hashset)).add(((Object) ((byte[])ObjectWrapper.unwrap(((ICertData)((Iterator) (obj)).next()).getBytesWrapped())))));
	//   13   29:aload_2         
	//   14   30:invokeinterface #189 <Method Iterator Set.iterator()>
	//   15   35:astore_2        
	//   16   36:aload_2         
	//   17   37:invokeinterface #195 <Method boolean Iterator.hasNext()>
	//   18   42:ifeq            85
	//   19   45:aload_3         
	//   20   46:aload_2         
	//   21   47:invokeinterface #199 <Method Object Iterator.next()>
	//   22   52:checkcast       #201 <Class ICertData>
	//   23   55:invokeinterface #205 <Method com.google.android.gms.dynamic.IObjectWrapper ICertData.getBytesWrapped()>
	//   24   60:invokestatic    #211 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   25   63:checkcast       #213 <Class byte[]>
	//   26   66:invokeinterface #216 <Method boolean Set.add(Object)>
	//   27   71:pop             
		}
	//*  28   72:goto            36
		catch(RemoteException remoteexception)
	//*  29   75:astore_2        
		{
			Log.e("GoogleSignatureVerifier", "Failed to get Google certificates from remote", ((Throwable) (remoteexception)));
	//   30   76:ldc1            #53  <String "GoogleSignatureVerifier">
	//   31   78:ldc1            #218 <String "Failed to get Google certificates from remote">
	//   32   80:aload_2         
	//   33   81:invokestatic    #222 <Method int Log.e(String, String, Throwable)>
	//   34   84:pop             
		}
		return ((Set) (hashset));
	//   35   85:aload_3         
	//   36   86:areturn         
	}

	public boolean isChimeraSigned(PackageManager packagemanager, PackageInfo packageinfo)
	{
		packagemanager = ((PackageManager) (packageinfo.packageName));
	//    0    0:aload_2         
	//    1    1:getfield        #99  <Field String PackageInfo.packageName>
	//    2    4:astore_1        
		packageinfo.packageName = "com.google.android.gms.chimera";
	//    3    5:aload_2         
	//    4    6:ldc1            #229 <String "com.google.android.gms.chimera">
	//    5    8:putfield        #99  <Field String PackageInfo.packageName>
		boolean flag = isPackageGoogleSigned(packageinfo);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokevirtual   #233 <Method boolean isPackageGoogleSigned(PackageInfo)>
	//    9   16:istore_3        
		packageinfo.packageName = ((String) (packagemanager));
	//   10   17:aload_2         
	//   11   18:aload_1         
	//   12   19:putfield        #99  <Field String PackageInfo.packageName>
		return flag;
	//   13   22:iload_3         
	//   14   23:ireturn         
	}

	public boolean isGooglePublicSignedPackage(PackageInfo packageinfo)
	{
		if(packageinfo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(isGooglePublicSignedPackage(packageinfo, false))
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:iconst_0        
	//*   7    9:invokevirtual   #237 <Method boolean isGooglePublicSignedPackage(PackageInfo, boolean)>
	//*   8   12:ifeq            17
			return true;
	//    9   15:iconst_1        
	//   10   16:ireturn         
		if(isGooglePublicSignedPackage(packageinfo, true))
	//*  11   17:aload_0         
	//*  12   18:aload_1         
	//*  13   19:iconst_1        
	//*  14   20:invokevirtual   #237 <Method boolean isGooglePublicSignedPackage(PackageInfo, boolean)>
	//*  15   23:ifeq            46
		{
			if(GooglePlayServicesUtilLight.honorsDebugCertificates(mContext))
	//*  16   26:aload_0         
	//*  17   27:getfield        #22  <Field Context mContext>
	//*  18   30:invokestatic    #85  <Method boolean GooglePlayServicesUtilLight.honorsDebugCertificates(Context)>
	//*  19   33:ifeq            38
				return true;
	//   20   36:iconst_1        
	//   21   37:ireturn         
			Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
	//   22   38:ldc1            #53  <String "GoogleSignatureVerifier">
	//   23   40:ldc1            #239 <String "Test-keys aren't accepted on this build.">
	//   24   42:invokestatic    #61  <Method int Log.w(String, String)>
	//   25   45:pop             
		}
		return false;
	//   26   46:iconst_0        
	//   27   47:ireturn         
	}

	public boolean isGooglePublicSignedPackage(PackageInfo packageinfo, boolean flag)
	{
		if(packageinfo != null && packageinfo.signatures != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          45
	//*   2    4:aload_1         
	//*   3    5:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//*   4    8:ifnull          45
		{
			GoogleCertificates.CertData acertdata[];
			if(flag)
	//*   5   11:iload_2         
	//*   6   12:ifeq            22
			{
				acertdata = zzd.zzbg;
	//    7   15:getstatic       #245 <Field GoogleCertificates$CertData[] zzd.zzbg>
	//    8   18:astore_3        
			} else
	//*   9   19:goto            35
			{
				acertdata = new GoogleCertificates.CertData[1];
	//   10   22:iconst_1        
	//   11   23:anewarray       GoogleCertificates.CertData[]
	//   12   26:astore_3        
				acertdata[0] = zzd.zzbg[0];
	//   13   27:aload_3         
	//   14   28:iconst_0        
	//   15   29:getstatic       #245 <Field GoogleCertificates$CertData[] zzd.zzbg>
	//   16   32:iconst_0        
	//   17   33:aaload          
	//   18   34:aastore         
			}
			if(zza(packageinfo, acertdata) != null)
	//*  19   35:aload_1         
	//*  20   36:aload_3         
	//*  21   37:invokestatic    #247 <Method GoogleCertificates$CertData zza(PackageInfo, GoogleCertificates$CertData[])>
	//*  22   40:ifnull          45
				return true;
	//   23   43:iconst_1        
	//   24   44:ireturn         
		}
		return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
	}

	public boolean isGooglePublicSignedPackage(PackageManager packagemanager, PackageInfo packageinfo)
	{
		return isGooglePublicSignedPackage(packageinfo);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #249 <Method boolean isGooglePublicSignedPackage(PackageInfo)>
	//    3    5:ireturn         
	}

	public boolean isPackageGoogleSigned(PackageInfo packageinfo)
	{
		packageinfo = ((PackageInfo) (zza(packageinfo)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #145 <Method zzg zza(PackageInfo)>
	//    3    5:astore_1        
		((zzg) (packageinfo)).zzi();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #252 <Method void zzg.zzi()>
		return ((zzg) (packageinfo)).zzbl;
	//    6   10:aload_1         
	//    7   11:getfield        #106 <Field boolean zzg.zzbl>
	//    8   14:ireturn         
	}

	public boolean isPackageGoogleSigned(PackageManager packagemanager, PackageInfo packageinfo)
	{
		return isPackageGoogleSigned(packageinfo);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #233 <Method boolean isPackageGoogleSigned(PackageInfo)>
	//    3    5:ireturn         
	}

	public boolean isPackageGoogleSigned(PackageManager packagemanager, String s)
	{
		return isPackageGoogleSigned(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #256 <Method boolean isPackageGoogleSigned(String)>
	//    3    5:ireturn         
	}

	public boolean isPackageGoogleSigned(String s)
	{
		s = ((String) (zzf(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #135 <Method zzg zzf(String)>
	//    3    5:astore_1        
		((zzg) (s)).zzi();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #252 <Method void zzg.zzi()>
		return ((zzg) (s)).zzbl;
	//    6   10:aload_1         
	//    7   11:getfield        #106 <Field boolean zzg.zzbl>
	//    8   14:ireturn         
	}

	public boolean isUidGoogleSigned(int i)
	{
		zzg zzg1 = zzb(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #260 <Method zzg zzb(int)>
	//    3    5:astore_2        
		zzg1.zzi();
	//    4    6:aload_2         
	//    5    7:invokevirtual   #252 <Method void zzg.zzi()>
		return zzg1.zzbl;
	//    6   10:aload_2         
	//    7   11:getfield        #106 <Field boolean zzg.zzbl>
	//    8   14:ireturn         
	}

	public boolean isUidGoogleSigned(PackageManager packagemanager, int i)
	{
		return isUidGoogleSigned(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #263 <Method boolean isUidGoogleSigned(int)>
	//    3    5:ireturn         
	}

	public void verifyPackageIsGoogleSigned(PackageManager packagemanager, String s)
		throws SecurityException
	{
		verifyPackageIsGoogleSigned(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #269 <Method void verifyPackageIsGoogleSigned(String)>
	//    3    5:return          
	}

	public void verifyPackageIsGoogleSigned(String s)
		throws SecurityException
	{
		zzf(s).zzh();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #135 <Method zzg zzf(String)>
	//    3    5:invokevirtual   #273 <Method void zzg.zzh()>
	//    4    8:return          
	}

	public void verifyUidIsGoogleSigned(int i)
		throws SecurityException
	{
		zzb(i).zzh();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #260 <Method zzg zzb(int)>
	//    3    5:invokevirtual   #273 <Method void zzg.zzh()>
	//    4    8:return          
	}

	public void verifyUidIsGoogleSigned(PackageManager packagemanager, int i)
		throws SecurityException
	{
		verifyUidIsGoogleSigned(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #277 <Method void verifyUidIsGoogleSigned(int)>
	//    3    5:return          
	}

	private static GoogleSignatureVerifier zzbv;
	private final Context mContext;
}
