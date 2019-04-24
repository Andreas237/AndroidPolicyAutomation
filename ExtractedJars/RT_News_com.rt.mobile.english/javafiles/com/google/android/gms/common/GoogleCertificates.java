// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.IGoogleCertificatesApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.io.UnsupportedEncodingException;
import java.util.*;

// Referenced classes of package com.google.android.gms.common:
//			GoogleCertificatesQuery, zzg

final class GoogleCertificates
{
	static abstract class CertData extends com.google.android.gms.common.internal.ICertData.Stub
	{

		protected static byte[] zzd(String s)
		{
			try
			{
				s = ((String) (s.getBytes("ISO-8859-1")));
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "ISO-8859-1">
		//    2    3:invokevirtual   #40  <Method byte[] String.getBytes(String)>
		//    3    6:astore_0        
			}
		//*   4    7:aload_0         
		//*   5    8:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   6    9:astore_0        
			{
				throw new AssertionError(((Object) (s)));
		//    7   10:new             #42  <Class AssertionError>
		//    8   13:dup             
		//    9   14:aload_0         
		//   10   15:invokespecial   #45  <Method void AssertionError(Object)>
		//   11   18:athrow          
			}
			return ((byte []) (s));
		}

		public boolean equals(Object obj)
		{
			if(obj == null)
				break MISSING_BLOCK_LABEL_75;
		//    0    0:aload_1         
		//    1    1:ifnull          75
			if(!(obj instanceof ICertData))
		//*   2    4:aload_1         
		//*   3    5:instanceof      #51  <Class ICertData>
		//*   4    8:ifne            13
				return false;
		//    5   11:iconst_0        
		//    6   12:ireturn         
			obj = ((Object) ((ICertData)obj));
		//    7   13:aload_1         
		//    8   14:checkcast       #51  <Class ICertData>
		//    9   17:astore_1        
			if(((ICertData) (obj)).getHashCode() != hashCode())
		//*  10   18:aload_1         
		//*  11   19:invokeinterface #55  <Method int ICertData.getHashCode()>
		//*  12   24:aload_0         
		//*  13   25:invokevirtual   #57  <Method int hashCode()>
		//*  14   28:icmpeq          33
				return false;
		//   15   31:iconst_0        
		//   16   32:ireturn         
			obj = ((Object) (((ICertData) (obj)).getBytesWrapped()));
		//   17   33:aload_1         
		//   18   34:invokeinterface #61  <Method IObjectWrapper ICertData.getBytesWrapped()>
		//   19   39:astore_1        
			if(obj == null)
		//*  20   40:aload_1         
		//*  21   41:ifnonnull       46
				return false;
		//   22   44:iconst_0        
		//   23   45:ireturn         
			boolean flag;
			obj = ((Object) ((byte[])ObjectWrapper.unwrap(((IObjectWrapper) (obj)))));
		//   24   46:aload_1         
		//   25   47:invokestatic    #67  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
		//   26   50:checkcast       #69  <Class byte[]>
		//   27   53:astore_1        
			flag = Arrays.equals(getBytes(), ((byte []) (obj)));
		//   28   54:aload_0         
		//   29   55:invokevirtual   #72  <Method byte[] getBytes()>
		//   30   58:aload_1         
		//   31   59:invokestatic    #75  <Method boolean Arrays.equals(byte[], byte[])>
		//   32   62:istore_2        
			return flag;
		//   33   63:iload_2         
		//   34   64:ireturn         
			obj;
		//   35   65:astore_1        
			Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable) (obj)));
		//   36   66:ldc1            #77  <String "GoogleCertificates">
		//   37   68:ldc1            #79  <String "Failed to get Google certificates from remote">
		//   38   70:aload_1         
		//   39   71:invokestatic    #85  <Method int Log.e(String, String, Throwable)>
		//   40   74:pop             
			return false;
		//   41   75:iconst_0        
		//   42   76:ireturn         
		}

		abstract byte[] getBytes();

		public IObjectWrapper getBytesWrapped()
		{
			return ObjectWrapper.wrap(((Object) (getBytes())));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #72  <Method byte[] getBytes()>
		//    2    4:invokestatic    #89  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
		//    3    7:areturn         
		}

		public int getHashCode()
		{
			return hashCode();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #57  <Method int hashCode()>
		//    2    4:ireturn         
		}

		public int hashCode()
		{
			return zzbc;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int zzbc>
		//    2    4:ireturn         
		}

		private int zzbc;

		protected CertData(byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void com.google.android.gms.common.internal.ICertData$Stub()>
			boolean flag;
			if(abyte0.length == 25)
		//*   2    4:aload_1         
		//*   3    5:arraylength     
		//*   4    6:bipush          25
		//*   5    8:icmpne          16
				flag = true;
		//    6   11:iconst_1        
		//    7   12:istore_2        
			else
		//*   8   13:goto            18
				flag = false;
		//    9   16:iconst_0        
		//   10   17:istore_2        
			Preconditions.checkArgument(flag);
		//   11   18:iload_2         
		//   12   19:invokestatic    #20  <Method void Preconditions.checkArgument(boolean)>
			zzbc = Arrays.hashCode(abyte0);
		//   13   22:aload_0         
		//   14   23:aload_1         
		//   15   24:invokestatic    #26  <Method int Arrays.hashCode(byte[])>
		//   16   27:putfield        #28  <Field int zzbc>
		//   17   30:return          
		}
	}


	static void init(Context context)
	{
		com/google/android/gms/common/GoogleCertificates;
	//    0    0:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzaz != null)
			break MISSING_BLOCK_LABEL_24;
	//    2    3:getstatic       #33  <Field Context zzaz>
	//    3    6:ifnonnull       24
		if(context == null)
			break MISSING_BLOCK_LABEL_32;
	//    4    9:aload_0         
	//    5   10:ifnull          32
		zzaz = context.getApplicationContext();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #39  <Method Context Context.getApplicationContext()>
	//    8   17:putstatic       #33  <Field Context zzaz>
		com/google/android/gms/common/GoogleCertificates;
	//    9   20:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   10   22:monitorexit     
		return;
	//   11   23:return          
		Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
	//   12   24:ldc1            #41  <String "GoogleCertificates">
	//   13   26:ldc1            #43  <String "GoogleCertificates has been initialized already">
	//   14   28:invokestatic    #49  <Method int Log.w(String, String)>
	//   15   31:pop             
		com/google/android/gms/common/GoogleCertificates;
	//   16   32:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   17   34:monitorexit     
		return;
	//   18   35:return          
		context;
	//   19   36:astore_0        
	//*  20   37:ldc1            #2   <Class GoogleCertificates>
		throw context;
	//   21   39:monitorexit     
	//   22   40:aload_0         
	//   23   41:athrow          
	}

	static zzg zza(String s, CertData certdata, boolean flag)
	{
		zzc();
	//    0    0:invokestatic    #58  <Method void zzc()>
		GoogleCertificatesQuery googlecertificatesquery;
		Preconditions.checkNotNull(((Object) (zzaz)));
	//    1    3:getstatic       #33  <Field Context zzaz>
	//    2    6:invokestatic    #64  <Method Object Preconditions.checkNotNull(Object)>
	//    3    9:pop             
		googlecertificatesquery = new GoogleCertificatesQuery(s, certdata, flag);
	//    4   10:new             #66  <Class GoogleCertificatesQuery>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:invokespecial   #69  <Method void GoogleCertificatesQuery(String, GoogleCertificates$CertData, boolean)>
	//   10   20:astore          4
		boolean flag1 = zzax.isGoogleOrPlatformSigned(googlecertificatesquery, ObjectWrapper.wrap(((Object) (zzaz.getPackageManager()))));
	//   11   22:getstatic       #71  <Field IGoogleCertificatesApi zzax>
	//   12   25:aload           4
	//   13   27:getstatic       #33  <Field Context zzaz>
	//   14   30:invokevirtual   #75  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   15   33:invokestatic    #81  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   16   36:invokeinterface #87  <Method boolean IGoogleCertificatesApi.isGoogleOrPlatformSigned(GoogleCertificatesQuery, IObjectWrapper)>
	//   17   41:istore_3        
		if(flag1)
	//*  18   42:iload_3         
	//*  19   43:ifeq            50
			return zzg.zzg();
	//   20   46:invokestatic    #93  <Method zzg zzg.zzg()>
	//   21   49:areturn         
		flag1 = true;
	//   22   50:iconst_1        
	//   23   51:istore_3        
		if(flag || !zza(s, certdata, true).zzbl)
	//*  24   52:iload_2         
	//*  25   53:ifne            71
	//*  26   56:aload_0         
	//*  27   57:aload_1         
	//*  28   58:iconst_1        
	//*  29   59:invokestatic    #95  <Method zzg zza(String, GoogleCertificates$CertData, boolean)>
	//*  30   62:getfield        #99  <Field boolean zzg.zzbl>
	//*  31   65:ifeq            71
	//*  32   68:goto            73
			flag1 = false;
	//   33   71:iconst_0        
	//   34   72:istore_3        
		return zzg.zza(s, certdata, flag, flag1);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:iload_2         
	//   38   76:iload_3         
	//   39   77:invokestatic    #102 <Method zzg zzg.zza(String, GoogleCertificates$CertData, boolean, boolean)>
	//   40   80:areturn         
		s;
	//   41   81:astore_0        
		Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable) (s)));
	//   42   82:ldc1            #41  <String "GoogleCertificates">
	//   43   84:ldc1            #104 <String "Failed to get Google certificates from remote">
	//   44   86:aload_0         
	//   45   87:invokestatic    #108 <Method int Log.e(String, String, Throwable)>
	//   46   90:pop             
		certdata = "module call";
	//   47   91:ldc1            #110 <String "module call">
	//   48   93:astore_1        
_L2:
		return zzg.zza(((String) (certdata)), ((Throwable) (s)));
	//   49   94:aload_1         
	//   50   95:aload_0         
	//   51   96:invokestatic    #113 <Method zzg zzg.zza(String, Throwable)>
	//   52   99:areturn         
		s;
	//   53  100:astore_0        
		certdata = "module init";
	//   54  101:ldc1            #115 <String "module init">
	//   55  103:astore_1        
		if(true) goto _L2; else goto _L1
	//   56  104:goto            94
_L1:
	}

	private static Set zza(IBinder aibinder[])
		throws RemoteException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j = aibinder.length;
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:istore_2        
		HashSet hashset = new HashSet(j);
	//    5    5:new             #118 <Class HashSet>
	//    6    8:dup             
	//    7    9:iload_2         
	//    8   10:invokespecial   #121 <Method void HashSet(int)>
	//    9   13:astore_3        
		for(; i < j; i++)
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          48
		{
			ICertData icertdata = com.google.android.gms.common.internal.ICertData.Stub.asInterface(aibinder[i]);
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:invokestatic    #127 <Method ICertData com.google.android.gms.common.internal.ICertData$Stub.asInterface(IBinder)>
	//   17   25:astore          4
			if(icertdata != null)
	//*  18   27:aload           4
	//*  19   29:ifnull          41
				((Set) (hashset)).add(((Object) (icertdata)));
	//   20   32:aload_3         
	//   21   33:aload           4
	//   22   35:invokeinterface #133 <Method boolean Set.add(Object)>
	//   23   40:pop             
		}

	//   24   41:iload_1         
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:istore_1        
	//*  28   45:goto            14
		return ((Set) (hashset));
	//   29   48:aload_3         
	//   30   49:areturn         
	}

	private static void zzc()
		throws com.google.android.gms.dynamite.DynamiteModule.LoadingException
	{
		if(zzax != null)
	//*   0    0:getstatic       #71  <Field IGoogleCertificatesApi zzax>
	//*   1    3:ifnull          7
			return;
	//    2    6:return          
		Preconditions.checkNotNull(((Object) (zzaz)));
	//    3    7:getstatic       #33  <Field Context zzaz>
	//    4   10:invokestatic    #64  <Method Object Preconditions.checkNotNull(Object)>
	//    5   13:pop             
		synchronized(zzay)
	//*   6   14:getstatic       #28  <Field Object zzay>
	//*   7   17:astore_0        
	//*   8   18:aload_0         
	//*   9   19:monitorenter    
		{
			if(zzax == null)
	//*  10   20:getstatic       #71  <Field IGoogleCertificatesApi zzax>
	//*  11   23:ifnonnull       48
				zzax = com.google.android.gms.common.internal.IGoogleCertificatesApi.Stub.asInterface(DynamiteModule.load(zzaz, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
	//   12   26:getstatic       #33  <Field Context zzaz>
	//   13   29:getstatic       #142 <Field com.google.android.gms.dynamite.DynamiteModule$VersionPolicy DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING>
	//   14   32:ldc1            #144 <String "com.google.android.gms.googlecertificates">
	//   15   34:invokestatic    #148 <Method DynamiteModule DynamiteModule.load(Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, String)>
	//   16   37:ldc1            #150 <String "com.google.android.gms.common.GoogleCertificatesImpl">
	//   17   39:invokevirtual   #154 <Method IBinder DynamiteModule.instantiate(String)>
	//   18   42:invokestatic    #159 <Method IGoogleCertificatesApi com.google.android.gms.common.internal.IGoogleCertificatesApi$Stub.asInterface(IBinder)>
	//   19   45:putstatic       #71  <Field IGoogleCertificatesApi zzax>
		}
	//   20   48:aload_0         
	//   21   49:monitorexit     
		return;
	//   22   50:return          
		exception;
	//   23   51:astore_1        
		obj;
	//   24   52:aload_0         
		JVM INSTR monitorexit ;
	//   25   53:monitorexit     
		throw exception;
	//   26   54:aload_1         
	//   27   55:athrow          
	}

	static Set zzd()
	{
		com/google/android/gms/common/GoogleCertificates;
	//    0    0:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		if(zzba == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #163 <Field Set zzba>
	//    3    6:ifnull          18
		obj = ((Object) (zzba));
	//    4    9:getstatic       #163 <Field Set zzba>
	//    5   12:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//    6   13:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((Set) (obj));
	//    8   16:aload_0         
	//    9   17:areturn         
		zzc();
	//   10   18:invokestatic    #58  <Method void zzc()>
		obj = ((Object) (zzax.getGoogleCertificates()));
	//   11   21:getstatic       #71  <Field IGoogleCertificatesApi zzax>
	//   12   24:invokeinterface #167 <Method IObjectWrapper IGoogleCertificatesApi.getGoogleCertificates()>
	//   13   29:astore_0        
		if(obj != null)
			break MISSING_BLOCK_LABEL_51;
	//   14   30:aload_0         
	//   15   31:ifnonnull       51
		Log.e("GoogleCertificates", "Failed to get Google certificates from remote");
	//   16   34:ldc1            #41  <String "GoogleCertificates">
	//   17   36:ldc1            #104 <String "Failed to get Google certificates from remote">
	//   18   38:invokestatic    #169 <Method int Log.e(String, String)>
	//   19   41:pop             
		obj = ((Object) (Collections.emptySet()));
	//   20   42:invokestatic    #174 <Method Set Collections.emptySet()>
	//   21   45:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   22   46:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   23   48:monitorexit     
		return ((Set) (obj));
	//   24   49:aload_0         
	//   25   50:areturn         
		zzba = zza((IBinder[])ObjectWrapper.unwrap(((IObjectWrapper) (obj))));
	//   26   51:aload_0         
	//   27   52:invokestatic    #178 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   28   55:checkcast       #180 <Class IBinder[]>
	//   29   58:invokestatic    #182 <Method Set zza(IBinder[])>
	//   30   61:putstatic       #163 <Field Set zzba>
		obj = ((Object) (zzba));
	//   31   64:getstatic       #163 <Field Set zzba>
	//   32   67:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   33   68:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		return ((Set) (obj));
	//   35   71:aload_0         
	//   36   72:areturn         
		Object obj1;
		obj1;
	//   37   73:astore_0        
		Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable) (obj1)));
	//   38   74:ldc1            #41  <String "GoogleCertificates">
	//   39   76:ldc1            #104 <String "Failed to get Google certificates from remote">
	//   40   78:aload_0         
	//   41   79:invokestatic    #108 <Method int Log.e(String, String, Throwable)>
	//   42   82:pop             
		obj1 = ((Object) (Collections.emptySet()));
	//   43   83:invokestatic    #174 <Method Set Collections.emptySet()>
	//   44   86:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   45   87:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   46   89:monitorexit     
		return ((Set) (obj1));
	//   47   90:aload_0         
	//   48   91:areturn         
		obj1;
	//   49   92:astore_0        
		Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", ((Throwable) (obj1)));
	//   50   93:ldc1            #41  <String "GoogleCertificates">
	//   51   95:ldc1            #184 <String "Failed to load com.google.android.gms.googlecertificates">
	//   52   97:aload_0         
	//   53   98:invokestatic    #108 <Method int Log.e(String, String, Throwable)>
	//   54  101:pop             
		obj1 = ((Object) (Collections.emptySet()));
	//   55  102:invokestatic    #174 <Method Set Collections.emptySet()>
	//   56  105:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   57  106:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   58  108:monitorexit     
		return ((Set) (obj1));
	//   59  109:aload_0         
	//   60  110:areturn         
		obj1;
	//   61  111:astore_0        
	//*  62  112:ldc1            #2   <Class GoogleCertificates>
		throw obj1;
	//   63  114:monitorexit     
	//   64  115:aload_0         
	//   65  116:athrow          
	}

	static Set zze()
	{
		com/google/android/gms/common/GoogleCertificates;
	//    0    0:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		if(zzbb == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #188 <Field Set zzbb>
	//    3    6:ifnull          18
		obj = ((Object) (zzbb));
	//    4    9:getstatic       #188 <Field Set zzbb>
	//    5   12:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//    6   13:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((Set) (obj));
	//    8   16:aload_0         
	//    9   17:areturn         
		zzc();
	//   10   18:invokestatic    #58  <Method void zzc()>
		obj = ((Object) (zzax.getGoogleReleaseCertificates()));
	//   11   21:getstatic       #71  <Field IGoogleCertificatesApi zzax>
	//   12   24:invokeinterface #191 <Method IObjectWrapper IGoogleCertificatesApi.getGoogleReleaseCertificates()>
	//   13   29:astore_0        
		if(obj != null)
			break MISSING_BLOCK_LABEL_51;
	//   14   30:aload_0         
	//   15   31:ifnonnull       51
		Log.e("GoogleCertificates", "Failed to get Google certificates from remote");
	//   16   34:ldc1            #41  <String "GoogleCertificates">
	//   17   36:ldc1            #104 <String "Failed to get Google certificates from remote">
	//   18   38:invokestatic    #169 <Method int Log.e(String, String)>
	//   19   41:pop             
		obj = ((Object) (Collections.emptySet()));
	//   20   42:invokestatic    #174 <Method Set Collections.emptySet()>
	//   21   45:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   22   46:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   23   48:monitorexit     
		return ((Set) (obj));
	//   24   49:aload_0         
	//   25   50:areturn         
		zzbb = zza((IBinder[])ObjectWrapper.unwrap(((IObjectWrapper) (obj))));
	//   26   51:aload_0         
	//   27   52:invokestatic    #178 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   28   55:checkcast       #180 <Class IBinder[]>
	//   29   58:invokestatic    #182 <Method Set zza(IBinder[])>
	//   30   61:putstatic       #188 <Field Set zzbb>
		obj = ((Object) (zzbb));
	//   31   64:getstatic       #188 <Field Set zzbb>
	//   32   67:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   33   68:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		return ((Set) (obj));
	//   35   71:aload_0         
	//   36   72:areturn         
		Object obj1;
		obj1;
	//   37   73:astore_0        
		Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable) (obj1)));
	//   38   74:ldc1            #41  <String "GoogleCertificates">
	//   39   76:ldc1            #104 <String "Failed to get Google certificates from remote">
	//   40   78:aload_0         
	//   41   79:invokestatic    #108 <Method int Log.e(String, String, Throwable)>
	//   42   82:pop             
		obj1 = ((Object) (Collections.emptySet()));
	//   43   83:invokestatic    #174 <Method Set Collections.emptySet()>
	//   44   86:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   45   87:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   46   89:monitorexit     
		return ((Set) (obj1));
	//   47   90:aload_0         
	//   48   91:areturn         
		obj1;
	//   49   92:astore_0        
		Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", ((Throwable) (obj1)));
	//   50   93:ldc1            #41  <String "GoogleCertificates">
	//   51   95:ldc1            #184 <String "Failed to load com.google.android.gms.googlecertificates">
	//   52   97:aload_0         
	//   53   98:invokestatic    #108 <Method int Log.e(String, String, Throwable)>
	//   54  101:pop             
		obj1 = ((Object) (Collections.emptySet()));
	//   55  102:invokestatic    #174 <Method Set Collections.emptySet()>
	//   56  105:astore_0        
		com/google/android/gms/common/GoogleCertificates;
	//   57  106:ldc1            #2   <Class GoogleCertificates>
		JVM INSTR monitorexit ;
	//   58  108:monitorexit     
		return ((Set) (obj1));
	//   59  109:aload_0         
	//   60  110:areturn         
		obj1;
	//   61  111:astore_0        
	//*  62  112:ldc1            #2   <Class GoogleCertificates>
		throw obj1;
	//   63  114:monitorexit     
	//   64  115:aload_0         
	//   65  116:athrow          
	}

	private static volatile IGoogleCertificatesApi zzax;
	private static final Object zzay = new Object();
	private static Context zzaz;
	private static Set zzba;
	private static Set zzbb;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void Object()>
	//    3    7:putstatic       #28  <Field Object zzay>
	//*   4   10:return          
	}
}
