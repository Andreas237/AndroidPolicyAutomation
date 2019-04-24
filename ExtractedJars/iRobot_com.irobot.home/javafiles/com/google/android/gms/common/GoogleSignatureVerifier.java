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
		if(zzal == null)
	//*   5    8:getstatic       #37  <Field GoogleSignatureVerifier zzal>
	//*   6   11:ifnonnull       29
		{
			com.google.android.gms.common.zzc.zza(context);
	//    7   14:aload_0         
	//    8   15:invokestatic    #42  <Method void zzc.zza(Context)>
			zzal = new GoogleSignatureVerifier(context);
	//    9   18:new             #2   <Class GoogleSignatureVerifier>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokespecial   #44  <Method void GoogleSignatureVerifier(Context)>
	//   13   26:putstatic       #37  <Field GoogleSignatureVerifier zzal>
		}
		com/google/android/gms/common/GoogleSignatureVerifier;
	//   14   29:ldc1            #2   <Class GoogleSignatureVerifier>
		JVM INSTR monitorexit ;
	//   15   31:monitorexit     
		return zzal;
	//   16   32:getstatic       #37  <Field GoogleSignatureVerifier zzal>
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

	private final zzm zza(PackageInfo packageinfo)
	{
		boolean flag = GooglePlayServicesUtilLight.honorsDebugCertificates(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Context mContext>
	//    2    4:invokestatic    #86  <Method boolean GooglePlayServicesUtilLight.honorsDebugCertificates(Context)>
	//    3    7:istore_2        
		if(packageinfo == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			packageinfo = "null pkg";
	//    6   12:ldc1            #88  <String "null pkg">
	//    7   14:astore_1        
		else
	//*   8   15:aload_1         
	//*   9   16:invokestatic    #94  <Method zzm zzm.zzb(String)>
	//*  10   19:areturn         
		if(packageinfo.signatures.length != 1)
	//*  11   20:aload_1         
	//*  12   21:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*  13   24:arraylength     
	//*  14   25:iconst_1        
	//*  15   26:icmpeq          35
		{
			packageinfo = "single cert required";
	//   16   29:ldc1            #96  <String "single cert required">
	//   17   31:astore_1        
		} else
	//*  18   32:goto            15
		{
			zzf zzf1 = new zzf(packageinfo.signatures[0].toByteArray());
	//   19   35:new             #64  <Class zzf>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//   23   43:iconst_0        
	//   24   44:aaload          
	//   25   45:invokevirtual   #70  <Method byte[] Signature.toByteArray()>
	//   26   48:invokespecial   #73  <Method void zzf(byte[])>
	//   27   51:astore_3        
			String s = packageinfo.packageName;
	//   28   52:aload_1         
	//   29   53:getfield        #99  <Field String PackageInfo.packageName>
	//   30   56:astore          4
			zzm zzm1 = com.google.android.gms.common.zzc.zza(s, ((zze) (zzf1)), flag);
	//   31   58:aload           4
	//   32   60:aload_3         
	//   33   61:iload_2         
	//   34   62:invokestatic    #102 <Method zzm zzc.zza(String, zze, boolean)>
	//   35   65:astore          5
			if(zzm1.zzac && packageinfo.applicationInfo != null && (packageinfo.applicationInfo.flags & 2) != 0 && (!flag || com.google.android.gms.common.zzc.zza(s, ((zze) (zzf1)), false).zzac))
	//*  36   67:aload           5
	//*  37   69:getfield        #106 <Field boolean zzm.zzac>
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
	//*  53  102:invokestatic    #102 <Method zzm zzc.zza(String, zze, boolean)>
	//*  54  105:getfield        #106 <Field boolean zzm.zzac>
	//*  55  108:ifeq            117
				packageinfo = "debuggable release cert app rejected";
	//   56  111:ldc1            #118 <String "debuggable release cert app rejected">
	//   57  113:astore_1        
			else
	//*  58  114:goto            15
				return zzm1;
	//   59  117:aload           5
	//   60  119:areturn         
		}
		return zzm.zzb(((String) (packageinfo)));
	}

	private final zzm zza(String s, int i)
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		zzm zzm1;
		try
		{
			zzm1 = zza(Wrappers.packageManager(mContext).zza(s, 64, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field Context mContext>
	//    3    5:invokestatic    #127 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    4    8:aload_1         
	//    5    9:bipush          64
	//    6   11:iload_2         
	//    7   12:invokevirtual   #132 <Method PackageInfo PackageManagerWrapper.zza(String, int, int)>
	//    8   15:invokespecial   #134 <Method zzm zza(PackageInfo)>
	//    9   18:astore_3        
		}
	//*  10   19:aload_3         
	//*  11   20:areturn         
	//*  12   21:aload_1         
	//*  13   22:invokestatic    #140 <Method String String.valueOf(Object)>
	//*  14   25:astore_1        
	//*  15   26:aload_1         
	//*  16   27:invokevirtual   #144 <Method int String.length()>
	//*  17   30:ifeq            43
	//*  18   33:ldc1            #146 <String "no pkg ">
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #150 <Method String String.concat(String)>
	//*  21   39:astore_1        
	//*  22   40:goto            53
	//*  23   43:new             #136 <Class String>
	//*  24   46:dup             
	//*  25   47:ldc1            #146 <String "no pkg ">
	//*  26   49:invokespecial   #153 <Method void String(String)>
	//*  27   52:astore_1        
	//*  28   53:aload_1         
	//*  29   54:invokestatic    #94  <Method zzm zzm.zzb(String)>
	//*  30   57:areturn         
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
		return zzm1;
	//*  31   58:astore_3        
	//*  32   59:goto            21
	}

	public static boolean zza(PackageInfo packageinfo, boolean flag)
	{
		if(packageinfo != null && packageinfo.signatures != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          50
	//*   2    4:aload_0         
	//*   3    5:getfield        #52  <Field Signature[] PackageInfo.signatures>
	//*   4    8:ifnull          50
		{
			zze azze[];
			if(flag)
	//*   5   11:iload_1         
	//*   6   12:ifeq            28
			{
				azze = zzh.zzx;
	//    7   15:getstatic       #160 <Field zze[] zzh.zzx>
	//    8   18:astore_2        
			} else
	//*   9   19:aload_0         
	//*  10   20:aload_2         
	//*  11   21:invokestatic    #162 <Method zze zza(PackageInfo, zze[])>
	//*  12   24:astore_0        
	//*  13   25:goto            44
			{
				azze = new zze[1];
	//   14   28:iconst_1        
	//   15   29:anewarray       zze[]
	//   16   32:astore_2        
				azze[0] = zzh.zzx[0];
	//   17   33:aload_2         
	//   18   34:iconst_0        
	//   19   35:getstatic       #160 <Field zze[] zzh.zzx>
	//   20   38:iconst_0        
	//   21   39:aaload          
	//   22   40:aastore         
			}
			packageinfo = ((PackageInfo) (zza(packageinfo, azze)));
	//*  23   41:goto            19
			if(packageinfo != null)
	//*  24   44:aload_0         
	//*  25   45:ifnull          50
				return true;
	//   26   48:iconst_1        
	//   27   49:ireturn         
		}
		return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
	}

	private final zzm zzc(String s)
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			return zzm.zzb("null pkg");
	//    2    4:ldc1            #88  <String "null pkg">
	//    3    6:invokestatic    #94  <Method zzm zzm.zzb(String)>
	//    4    9:areturn         
		if(s.equals(((Object) (zzam))))
	//*   5   10:aload_1         
	//*   6   11:aload_0         
	//*   7   12:getfield        #165 <Field String zzam>
	//*   8   15:invokevirtual   #166 <Method boolean String.equals(Object)>
	//*   9   18:ifeq            25
			return zzm.zze();
	//   10   21:invokestatic    #170 <Method zzm zzm.zze()>
	//   11   24:areturn         
		Object obj;
		try
		{
			obj = ((Object) (Wrappers.packageManager(mContext).getPackageInfo(s, 64)));
	//   12   25:aload_0         
	//   13   26:getfield        #26  <Field Context mContext>
	//   14   29:invokestatic    #127 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   15   32:aload_1         
	//   16   33:bipush          64
	//   17   35:invokevirtual   #174 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//   18   38:astore_2        
		}
	//*  19   39:aload_0         
	//*  20   40:aload_2         
	//*  21   41:invokespecial   #134 <Method zzm zza(PackageInfo)>
	//*  22   44:astore_2        
	//*  23   45:aload_2         
	//*  24   46:getfield        #106 <Field boolean zzm.zzac>
	//*  25   49:ifeq            57
	//*  26   52:aload_0         
	//*  27   53:aload_1         
	//*  28   54:putfield        #165 <Field String zzam>
	//*  29   57:aload_2         
	//*  30   58:areturn         
	//*  31   59:aload_1         
	//*  32   60:invokestatic    #140 <Method String String.valueOf(Object)>
	//*  33   63:astore_1        
	//*  34   64:aload_1         
	//*  35   65:invokevirtual   #144 <Method int String.length()>
	//*  36   68:ifeq            81
	//*  37   71:ldc1            #146 <String "no pkg ">
	//*  38   73:aload_1         
	//*  39   74:invokevirtual   #150 <Method String String.concat(String)>
	//*  40   77:astore_1        
	//*  41   78:goto            91
	//*  42   81:new             #136 <Class String>
	//*  43   84:dup             
	//*  44   85:ldc1            #146 <String "no pkg ">
	//*  45   87:invokespecial   #153 <Method void String(String)>
	//*  46   90:astore_1        
	//*  47   91:aload_1         
	//*  48   92:invokestatic    #94  <Method zzm zzm.zzb(String)>
	//*  49   95:areturn         
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
		obj = ((Object) (zza(((PackageInfo) (obj)))));
		if(((zzm) (obj)).zzac)
			zzam = s;
		return ((zzm) (obj));
	//*  50   96:astore_2        
	//*  51   97:goto            59
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
	//*   6    8:invokestatic    #178 <Method boolean zza(PackageInfo, boolean)>
	//*   7   11:ifeq            16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		if(zza(packageinfo, true))
	//*  10   16:aload_1         
	//*  11   17:iconst_1        
	//*  12   18:invokestatic    #178 <Method boolean zza(PackageInfo, boolean)>
	//*  13   21:ifeq            44
		{
			if(GooglePlayServicesUtilLight.honorsDebugCertificates(mContext))
	//*  14   24:aload_0         
	//*  15   25:getfield        #26  <Field Context mContext>
	//*  16   28:invokestatic    #86  <Method boolean GooglePlayServicesUtilLight.honorsDebugCertificates(Context)>
	//*  17   31:ifeq            36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
			Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
	//   20   36:ldc1            #54  <String "GoogleSignatureVerifier">
	//   21   38:ldc1            #180 <String "Test-keys aren't accepted on this build.">
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
	//    2    2:invokespecial   #184 <Method zzm zzc(String)>
	//    3    5:astore_1        
		((zzm) (s)).zzf();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #187 <Method void zzm.zzf()>
		return ((zzm) (s)).zzac;
	//    6   10:aload_1         
	//    7   11:getfield        #106 <Field boolean zzm.zzac>
	//    8   14:ireturn         
	}

	public boolean isUidGoogleSigned(int i)
	{
		String as[] = Wrappers.packageManager(mContext).getPackagesForUid(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Context mContext>
	//    2    4:invokestatic    #127 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #193 <Method String[] PackageManagerWrapper.getPackagesForUid(int)>
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
	//   27   47:invokespecial   #195 <Method zzm zza(String, int)>
	//   28   50:astore          5
				zzm1 = zzm2;
	//   29   52:aload           5
	//   30   54:astore          4
				if(zzm2.zzac)
					break;
	//   31   56:aload           5
	//   32   58:getfield        #106 <Field boolean zzm.zzac>
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
	//   41   75:ldc1            #197 <String "no pkgs">
	//   42   77:invokestatic    #94  <Method zzm zzm.zzb(String)>
	//   43   80:astore          4
		}
		zzm1.zzf();
	//   44   82:aload           4
	//   45   84:invokevirtual   #187 <Method void zzm.zzf()>
		return zzm1.zzac;
	//   46   87:aload           4
	//   47   89:getfield        #106 <Field boolean zzm.zzac>
	//   48   92:ireturn         
	}

	private static GoogleSignatureVerifier zzal;
	private final Context mContext;
	private volatile String zzam;
}
