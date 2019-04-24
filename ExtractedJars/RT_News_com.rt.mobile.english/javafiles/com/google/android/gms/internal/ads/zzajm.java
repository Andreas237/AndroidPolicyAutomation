// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakh, zzajt, zzakd, zzajp, 
//			zznk, zzkb, zzni, zzgf, 
//			zzgk, zzadb, zzakb, zzang, 
//			zzadf, zzgg, zzakk, zzes, 
//			zznn, zzajo, zzajx, zzanz, 
//			zzanm, zzajn, zzaki, zzano

public final class zzajm
	implements zzakh
{

	public zzajm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void Object()>
	//    6   12:putfield        #50  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #52  <Class zzajt>
	//    9   19:dup             
	//   10   20:invokespecial   #53  <Method void zzajt()>
	//   11   23:putfield        #55  <Field zzajt zzcpl>
	//   12   26:aload_0         
	//   13   27:new             #57  <Class zzakd>
	//   14   30:dup             
	//   15   31:invokespecial   #58  <Method void zzakd()>
	//   16   34:putfield        #60  <Field zzakd zzcpm>
		zzzv = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #62  <Field boolean zzzv>
		zzcpn = null;
	//   20   42:aload_0         
	//   21   43:aconst_null     
	//   22   44:putfield        #64  <Field zznn zzcpn>
		zzcpo = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #66  <Field zzgk zzcpo>
		zzahz = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #68  <Field zzgf zzahz>
		zzcpp = null;
	//   29   57:aload_0         
	//   30   58:aconst_null     
	//   31   59:putfield        #70  <Field Boolean zzcpp>
	//   32   62:aload_0         
	//   33   63:new             #72  <Class AtomicInteger>
	//   34   66:dup             
	//   35   67:iconst_0        
	//   36   68:invokespecial   #75  <Method void AtomicInteger(int)>
	//   37   71:putfield        #77  <Field AtomicInteger zzcpr>
	//   38   74:aload_0         
	//   39   75:new             #79  <Class zzajp>
	//   40   78:dup             
	//   41   79:aconst_null     
	//   42   80:invokespecial   #82  <Method void zzajp(zzajo)>
	//   43   83:putfield        #84  <Field zzajp zzcps>
	//   44   86:aload_0         
	//   45   87:new             #4   <Class Object>
	//   46   90:dup             
	//   47   91:invokespecial   #48  <Method void Object()>
	//   48   94:putfield        #86  <Field Object zzcpt>
	//   49   97:return          
	}

	static Context zza(zzajm zzajm1)
	{
		return zzajm1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Context mContext>
	//    2    4:areturn         
	}

	private final zzgk zza(Context context, boolean flag, boolean flag1)
	{
		zzna zzna = zznk.zzawk;
	//    0    0:getstatic       #98  <Field zzna zznk.zzawk>
	//    1    3:astore          4
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    5:invokestatic    #104 <Method zzni zzkb.zzik()>
	//*   3    8:aload           4
	//*   4   10:invokevirtual   #110 <Method Object zzni.zzd(zzna)>
	//*   5   13:checkcast       #112 <Class Boolean>
	//*   6   16:invokevirtual   #116 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifne            24
			return null;
	//    8   22:aconst_null     
	//    9   23:areturn         
		if(!PlatformVersion.isAtLeastIceCreamSandwich())
	//*  10   24:invokestatic    #121 <Method boolean PlatformVersion.isAtLeastIceCreamSandwich()>
	//*  11   27:ifne            32
			return null;
	//   12   30:aconst_null     
	//   13   31:areturn         
		zzna = zznk.zzaws;
	//   14   32:getstatic       #124 <Field zzna zznk.zzaws>
	//   15   35:astore          4
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*  16   37:invokestatic    #104 <Method zzni zzkb.zzik()>
	//*  17   40:aload           4
	//*  18   42:invokevirtual   #110 <Method Object zzni.zzd(zzna)>
	//*  19   45:checkcast       #112 <Class Boolean>
	//*  20   48:invokevirtual   #116 <Method boolean Boolean.booleanValue()>
	//*  21   51:ifne            78
		{
			zzna zzna1 = zznk.zzawq;
	//   22   54:getstatic       #127 <Field zzna zznk.zzawq>
	//   23   57:astore          4
			if(!((Boolean)zzkb.zzik().zzd(zzna1)).booleanValue())
	//*  24   59:invokestatic    #104 <Method zzni zzkb.zzik()>
	//*  25   62:aload           4
	//*  26   64:invokevirtual   #110 <Method Object zzni.zzd(zzna)>
	//*  27   67:checkcast       #112 <Class Boolean>
	//*  28   70:invokevirtual   #116 <Method boolean Boolean.booleanValue()>
	//*  29   73:ifne            78
				return null;
	//   30   76:aconst_null     
	//   31   77:areturn         
		}
		if(flag && flag1)
	//*  32   78:iload_2         
	//*  33   79:ifeq            88
	//*  34   82:iload_3         
	//*  35   83:ifeq            88
			return null;
	//   36   86:aconst_null     
	//   37   87:areturn         
		Object obj = mLock;
	//   38   88:aload_0         
	//   39   89:getfield        #50  <Field Object mLock>
	//   40   92:astore          4
		obj;
	//   41   94:aload           4
		JVM INSTR monitorenter ;
	//   42   96:monitorenter    
		if(Looper.getMainLooper() == null || context == null)
	//*  43   97:invokestatic    #133 <Method Looper Looper.getMainLooper()>
	//*  44  100:ifnull          180
	//*  45  103:aload_1         
	//*  46  104:ifnonnull       110
			break MISSING_BLOCK_LABEL_180;
	//   47  107:goto            180
		if(zzahz == null)
	//*  48  110:aload_0         
	//*  49  111:getfield        #68  <Field zzgf zzahz>
	//*  50  114:ifnonnull       128
			zzahz = new zzgf();
	//   51  117:aload_0         
	//   52  118:new             #135 <Class zzgf>
	//   53  121:dup             
	//   54  122:invokespecial   #136 <Method void zzgf()>
	//   55  125:putfield        #68  <Field zzgf zzahz>
		if(zzcpo == null)
	//*  56  128:aload_0         
	//*  57  129:getfield        #66  <Field zzgk zzcpo>
	//*  58  132:ifnonnull       158
			zzcpo = new zzgk(zzahz, zzadb.zzc(context, zzyf));
	//   59  135:aload_0         
	//   60  136:new             #138 <Class zzgk>
	//   61  139:dup             
	//   62  140:aload_0         
	//   63  141:getfield        #68  <Field zzgf zzahz>
	//   64  144:aload_1         
	//   65  145:aload_0         
	//   66  146:getfield        #140 <Field zzang zzyf>
	//   67  149:invokestatic    #146 <Method zzadf zzadb.zzc(Context, zzang)>
	//   68  152:invokespecial   #149 <Method void zzgk(zzgf, zzadf)>
	//   69  155:putfield        #66  <Field zzgk zzcpo>
		zzcpo.zzgw();
	//   70  158:aload_0         
	//   71  159:getfield        #66  <Field zzgk zzcpo>
	//   72  162:invokevirtual   #152 <Method void zzgk.zzgw()>
		zzakb.zzdj("start fetching content...");
	//   73  165:ldc1            #154 <String "start fetching content...">
	//   74  167:invokestatic    #160 <Method void zzakb.zzdj(String)>
		context = ((Context) (zzcpo));
	//   75  170:aload_0         
	//   76  171:getfield        #66  <Field zzgk zzcpo>
	//   77  174:astore_1        
		obj;
	//   78  175:aload           4
		JVM INSTR monitorexit ;
	//   79  177:monitorexit     
		return ((zzgk) (context));
	//   80  178:aload_1         
	//   81  179:areturn         
		obj;
	//   82  180:aload           4
		JVM INSTR monitorexit ;
	//   83  182:monitorexit     
		return null;
	//   84  183:aconst_null     
	//   85  184:areturn         
		context;
	//   86  185:astore_1        
		obj;
	//   87  186:aload           4
		JVM INSTR monitorexit ;
	//   88  188:monitorexit     
		throw context;
	//   89  189:aload_1         
	//   90  190:athrow          
	}

	private static ArrayList zzag(Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #171 <Method void ArrayList()>
	//    3    7:astore_2        
		try
		{
			context = ((Context) (Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 4096)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #177 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #183 <Method ApplicationInfo Context.getApplicationInfo()>
	//    8   16:getfield        #188 <Field String ApplicationInfo.packageName>
	//    9   19:sipush          4096
	//   10   22:invokevirtual   #194 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:getfield        #200 <Field String[] PackageInfo.requestedPermissions>
	//*  14   30:ifnull          82
	//*  15   33:aload_0         
	//*  16   34:getfield        #204 <Field int[] PackageInfo.requestedPermissionsFlags>
	//*  17   37:ifnonnull       42
	//*  18   40:aload_2         
	//*  19   41:areturn         
	//*  20   42:iconst_0        
	//*  21   43:istore_1        
	//*  22   44:iload_1         
	//*  23   45:aload_0         
	//*  24   46:getfield        #200 <Field String[] PackageInfo.requestedPermissions>
	//*  25   49:arraylength     
	//*  26   50:icmpge          82
	//*  27   53:aload_0         
	//*  28   54:getfield        #204 <Field int[] PackageInfo.requestedPermissionsFlags>
	//*  29   57:iload_1         
	//*  30   58:iaload          
	//*  31   59:iconst_2        
	//*  32   60:iand            
	//*  33   61:ifeq            75
	//*  34   64:aload_2         
	//*  35   65:aload_0         
	//*  36   66:getfield        #200 <Field String[] PackageInfo.requestedPermissions>
	//*  37   69:iload_1         
	//*  38   70:aaload          
	//*  39   71:invokevirtual   #208 <Method boolean ArrayList.add(Object)>
	//*  40   74:pop             
	//*  41   75:iload_1         
	//*  42   76:iconst_1        
	//*  43   77:iadd            
	//*  44   78:istore_1        
	//*  45   79:goto            44
	//*  46   82:aload_2         
	//*  47   83:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  48   84:astore_0        
		{
			return arraylist;
	//   49   85:aload_2         
	//   50   86:areturn         
		}
		if(((PackageInfo) (context)).requestedPermissions != null)
		{
			if(((PackageInfo) (context)).requestedPermissionsFlags == null)
				return arraylist;
			for(int i = 0; i < ((PackageInfo) (context)).requestedPermissions.length; i++)
				if((((PackageInfo) (context)).requestedPermissionsFlags[i] & 2) != 0)
					arraylist.add(((Object) (((PackageInfo) (context)).requestedPermissions[i])));

		}
		return arraylist;
	}

	static zzang zzb(zzajm zzajm1)
	{
		return zzajm1.zzyf;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field zzang zzyf>
	//    2    4:areturn         
	}

	static Object zzc(zzajm zzajm1)
	{
		return zzajm1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Object mLock>
	//    2    4:areturn         
	}

	static zznn zzd(zzajm zzajm1)
	{
		return zzajm1.zzcpn;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field zznn zzcpn>
	//    2    4:areturn         
	}

	public final Context getApplicationContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Context mContext>
	//    2    4:areturn         
	}

	public final Resources getResources()
	{
		if(zzyf.zzcvg)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field zzang zzyf>
	//*   2    4:getfield        #226 <Field boolean zzang.zzcvg>
	//*   3    7:ifeq            18
			return mContext.getResources();
	//    4   10:aload_0         
	//    5   11:getfield        #91  <Field Context mContext>
	//    6   14:invokevirtual   #228 <Method Resources Context.getResources()>
	//    7   17:areturn         
		Object obj;
		try
		{
			obj = ((Object) (DynamiteModule.load(mContext, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite")));
	//    8   18:aload_0         
	//    9   19:getfield        #91  <Field Context mContext>
	//   10   22:getstatic       #234 <Field com.google.android.gms.dynamite.DynamiteModule$VersionPolicy DynamiteModule.PREFER_REMOTE>
	//   11   25:ldc1            #236 <String "com.google.android.gms.ads.dynamite">
	//   12   27:invokestatic    #240 <Method DynamiteModule DynamiteModule.load(Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, String)>
	//   13   30:astore_1        
		}
	//*  14   31:aload_1         
	//*  15   32:ifnull          45
	//*  16   35:aload_1         
	//*  17   36:invokevirtual   #243 <Method Context DynamiteModule.getModuleContext()>
	//*  18   39:invokevirtual   #228 <Method Resources Context.getResources()>
	//*  19   42:astore_1        
	//*  20   43:aload_1         
	//*  21   44:areturn         
	//*  22   45:aconst_null     
	//*  23   46:areturn         
		catch(com.google.android.gms.dynamite.DynamiteModule.LoadingException loadingexception)
	//*  24   47:astore_1        
		{
			zzakb.zzc("Cannot load resource from dynamite apk or local jar", ((Throwable) (loadingexception)));
	//   25   48:ldc1            #245 <String "Cannot load resource from dynamite apk or local jar">
	//   26   50:aload_1         
	//   27   51:invokestatic    #248 <Method void zzakb.zzc(String, Throwable)>
			return null;
	//   28   54:aconst_null     
	//   29   55:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_45;
		obj = ((Object) (((DynamiteModule) (obj)).getModuleContext().getResources()));
		return ((Resources) (obj));
		return null;
	}

	public final void zza(Boolean boolean1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzcpp = boolean1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #70  <Field Boolean zzcpp>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		boolean1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw boolean1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void zza(Throwable throwable, String s)
	{
		zzadb.zzc(mContext, zzyf).zza(throwable, s);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field zzang zzyf>
	//    4    8:invokestatic    #146 <Method zzadf zzadb.zzc(Context, zzang)>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #254 <Method void zzadf.zza(Throwable, String)>
	//    8   18:return          
	}

	public final void zzaa(boolean flag)
	{
		zzcps.zzaa(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field zzajp zzcps>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #258 <Method void zzajp.zzaa(boolean)>
	//    4    8:return          
	}

	public final zzgk zzaf(Context context)
	{
		return zza(context, zzcpm.zzqu(), zzcpm.zzqw());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #60  <Field zzakd zzcpm>
	//    4    6:invokevirtual   #263 <Method boolean zzakd.zzqu()>
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field zzakd zzcpm>
	//    7   13:invokevirtual   #266 <Method boolean zzakd.zzqw()>
	//    8   16:invokespecial   #268 <Method zzgk zza(Context, boolean, boolean)>
	//    9   19:areturn         
	}

	public final void zzb(Throwable throwable, String s)
	{
		zzadf zzadf1 = zzadb.zzc(mContext, zzyf);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field zzang zzyf>
	//    4    8:invokestatic    #146 <Method zzadf zzadb.zzc(Context, zzang)>
	//    5   11:astore_3        
		zzna zzna = zznk.zzaul;
	//    6   12:getstatic       #271 <Field zzna zznk.zzaul>
	//    7   15:astore          4
		zzadf1.zza(throwable, s, ((Float)zzkb.zzik().zzd(zzna)).floatValue());
	//    8   17:aload_3         
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokestatic    #104 <Method zzni zzkb.zzik()>
	//   12   23:aload           4
	//   13   25:invokevirtual   #110 <Method Object zzni.zzd(zzna)>
	//   14   28:checkcast       #273 <Class Float>
	//   15   31:invokevirtual   #277 <Method float Float.floatValue()>
	//   16   34:invokeinterface #280 <Method void zzadf.zza(Throwable, String, float)>
	//   17   39:return          
	}

	public final void zzd(Context context, zzang zzang1)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzzv)
			break MISSING_BLOCK_LABEL_179;
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field boolean zzzv>
	//    7   11:ifne            179
		mContext = context.getApplicationContext();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #284 <Method Context Context.getApplicationContext()>
	//   11   19:putfield        #91  <Field Context mContext>
		zzyf = zzang1;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #140 <Field zzang zzyf>
		zzbv.zzen().zza(((zzgj) (zzbv.zzep())));
	//   15   27:invokestatic    #290 <Method zzgg zzbv.zzen()>
	//   16   30:invokestatic    #294 <Method zzajv zzbv.zzep()>
	//   17   33:invokevirtual   #299 <Method void zzgg.zza(zzgj)>
		zzcpm.initialize(mContext);
	//   18   36:aload_0         
	//   19   37:getfield        #60  <Field zzakd zzcpm>
	//   20   40:aload_0         
	//   21   41:getfield        #91  <Field Context mContext>
	//   22   44:invokevirtual   #303 <Method void zzakd.initialize(Context)>
		zzcpm.zza(((zzakh) (this)));
	//   23   47:aload_0         
	//   24   48:getfield        #60  <Field zzakd zzcpm>
	//   25   51:aload_0         
	//   26   52:invokevirtual   #306 <Method void zzakd.zza(zzakh)>
		zzadb.zzc(mContext, zzyf);
	//   27   55:aload_0         
	//   28   56:getfield        #91  <Field Context mContext>
	//   29   59:aload_0         
	//   30   60:getfield        #140 <Field zzang zzyf>
	//   31   63:invokestatic    #146 <Method zzadf zzadb.zzc(Context, zzang)>
	//   32   66:pop             
		zzcpq = zzbv.zzek().zzm(context, zzang1.zzcw);
	//   33   67:aload_0         
	//   34   68:invokestatic    #310 <Method zzakk zzbv.zzek()>
	//   35   71:aload_1         
	//   36   72:aload_2         
	//   37   73:getfield        #313 <Field String zzang.zzcw>
	//   38   76:invokevirtual   #319 <Method String zzakk.zzm(Context, String)>
	//   39   79:putfield        #321 <Field String zzcpq>
		zzvy = new zzes(context.getApplicationContext(), zzyf);
	//   40   82:aload_0         
	//   41   83:new             #323 <Class zzes>
	//   42   86:dup             
	//   43   87:aload_1         
	//   44   88:invokevirtual   #284 <Method Context Context.getApplicationContext()>
	//   45   91:aload_0         
	//   46   92:getfield        #140 <Field zzang zzyf>
	//   47   95:invokespecial   #325 <Method void zzes(Context, zzang)>
	//   48   98:putfield        #327 <Field zzes zzvy>
		zzbv.zzet();
	//   49  101:invokestatic    #331 <Method zznp zzbv.zzet()>
	//   50  104:pop             
		context = ((Context) (zznk.zzawh));
	//   51  105:getstatic       #334 <Field zzna zznk.zzawh>
	//   52  108:astore_1        
		if(((Boolean)zzkb.zzik().zzd(((zzna) (context)))).booleanValue())
			break MISSING_BLOCK_LABEL_136;
	//   53  109:invokestatic    #104 <Method zzni zzkb.zzik()>
	//   54  112:aload_1         
	//   55  113:invokevirtual   #110 <Method Object zzni.zzd(zzna)>
	//   56  116:checkcast       #112 <Class Boolean>
	//   57  119:invokevirtual   #116 <Method boolean Boolean.booleanValue()>
	//   58  122:ifne            136
		zzakb.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
	//   59  125:ldc2            #336 <String "CsiReporterFactory: CSI is not enabled. No CSI reporter created.">
	//   60  128:invokestatic    #339 <Method void zzakb.v(String)>
		context = null;
	//   61  131:aconst_null     
	//   62  132:astore_1        
		break MISSING_BLOCK_LABEL_144;
	//   63  133:goto            144
		context = ((Context) (new zznn()));
	//   64  136:new             #341 <Class zznn>
	//   65  139:dup             
	//   66  140:invokespecial   #342 <Method void zznn()>
	//   67  143:astore_1        
		zzcpn = ((zznn) (context));
	//   68  144:aload_0         
	//   69  145:aload_1         
	//   70  146:putfield        #64  <Field zznn zzcpn>
		zzanm.zza((zzanz)((zzajx) (new zzajo(this))).zznt(), "AppState.registerCsiReporter");
	//   71  149:new             #344 <Class zzajo>
	//   72  152:dup             
	//   73  153:aload_0         
	//   74  154:invokespecial   #347 <Method void zzajo(zzajm)>
	//   75  157:invokevirtual   #353 <Method Object zzajx.zznt()>
	//   76  160:checkcast       #355 <Class zzanz>
	//   77  163:ldc2            #357 <String "AppState.registerCsiReporter">
	//   78  166:invokestatic    #362 <Method void zzanm.zza(zzanz, String)>
		zzzv = true;
	//   79  169:aload_0         
	//   80  170:iconst_1        
	//   81  171:putfield        #62  <Field boolean zzzv>
		zzqi();
	//   82  174:aload_0         
	//   83  175:invokevirtual   #366 <Method zzanz zzqi()>
	//   84  178:pop             
		obj;
	//   85  179:aload_3         
		JVM INSTR monitorexit ;
	//   86  180:monitorexit     
		return;
	//   87  181:return          
		context;
	//   88  182:astore_1        
		obj;
	//   89  183:aload_3         
		JVM INSTR monitorexit ;
	//   90  184:monitorexit     
		throw context;
	//   91  185:aload_1         
	//   92  186:athrow          
	}

	public final void zzd(Bundle bundle)
	{
		if(bundle.containsKey("content_url_opted_out") && bundle.containsKey("content_vertical_opted_out"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #369 <String "content_url_opted_out">
	//*   2    4:invokevirtual   #375 <Method boolean Bundle.containsKey(String)>
	//*   3    7:ifeq            43
	//*   4   10:aload_1         
	//*   5   11:ldc2            #377 <String "content_vertical_opted_out">
	//*   6   14:invokevirtual   #375 <Method boolean Bundle.containsKey(String)>
	//*   7   17:ifeq            43
			zza(mContext, bundle.getBoolean("content_url_opted_out"), bundle.getBoolean("content_vertical_opted_out"));
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:getfield        #91  <Field Context mContext>
	//   11   25:aload_1         
	//   12   26:ldc2            #369 <String "content_url_opted_out">
	//   13   29:invokevirtual   #380 <Method boolean Bundle.getBoolean(String)>
	//   14   32:aload_1         
	//   15   33:ldc2            #377 <String "content_vertical_opted_out">
	//   16   36:invokevirtual   #380 <Method boolean Bundle.getBoolean(String)>
	//   17   39:invokespecial   #268 <Method zzgk zza(Context, boolean, boolean)>
	//   18   42:pop             
	//   19   43:return          
	}

	public final zzajt zzpx()
	{
		return zzcpl;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field zzajt zzcpl>
	//    2    4:areturn         
	}

	public final zznn zzpy()
	{
		zznn zznn1;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zznn1 = zzcpn;
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field zznn zzcpn>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return zznn1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final Boolean zzpz()
	{
		Boolean boolean1;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			boolean1 = zzcpp;
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field Boolean zzcpp>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return boolean1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final boolean zzqa()
	{
		return zzcps.zzqa();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field zzajp zzcps>
	//    2    4:invokevirtual   #389 <Method boolean zzajp.zzqa()>
	//    3    7:ireturn         
	}

	public final boolean zzqb()
	{
		return zzcps.zzqb();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field zzajp zzcps>
	//    2    4:invokevirtual   #392 <Method boolean zzajp.zzqb()>
	//    3    7:ireturn         
	}

	public final void zzqc()
	{
		zzcps.zzqc();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field zzajp zzcps>
	//    2    4:invokevirtual   #395 <Method void zzajp.zzqc()>
	//    3    7:return          
	}

	public final zzes zzqd()
	{
		return zzvy;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field zzes zzvy>
	//    2    4:areturn         
	}

	public final void zzqe()
	{
		zzcpr.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field AtomicInteger zzcpr>
	//    2    4:invokevirtual   #402 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
	//    4    8:return          
	}

	public final void zzqf()
	{
		zzcpr.decrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field AtomicInteger zzcpr>
	//    2    4:invokevirtual   #406 <Method int AtomicInteger.decrementAndGet()>
	//    3    7:pop             
	//    4    8:return          
	}

	public final int zzqg()
	{
		return zzcpr.get();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field AtomicInteger zzcpr>
	//    2    4:invokevirtual   #410 <Method int AtomicInteger.get()>
	//    3    7:ireturn         
	}

	public final zzakd zzqh()
	{
		zzakd zzakd1;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzakd1 = zzcpm;
	//    5    7:aload_0         
	//    6    8:getfield        #60  <Field zzakd zzcpm>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return zzakd1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final zzanz zzqi()
	{
label0:
		{
			if(mContext == null || !PlatformVersion.isAtLeastJellyBean())
				break MISSING_BLOCK_LABEL_85;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Context mContext>
	//    2    4:ifnull          85
	//    3    7:invokestatic    #415 <Method boolean PlatformVersion.isAtLeastJellyBean()>
	//    4   10:ifeq            85
			zzna zzna = zznk.zzbau;
	//    5   13:getstatic       #418 <Field zzna zznk.zzbau>
	//    6   16:astore_1        
			if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   7   17:invokestatic    #104 <Method zzni zzkb.zzik()>
	//*   8   20:aload_1         
	//*   9   21:invokevirtual   #110 <Method Object zzni.zzd(zzna)>
	//*  10   24:checkcast       #112 <Class Boolean>
	//*  11   27:invokevirtual   #116 <Method boolean Boolean.booleanValue()>
	//*  12   30:ifeq            36
				break MISSING_BLOCK_LABEL_85;
	//   13   33:goto            85
			zzanz zzanz1;
			synchronized(zzcpt)
	//*  14   36:aload_0         
	//*  15   37:getfield        #86  <Field Object zzcpt>
	//*  16   40:astore_1        
	//*  17   41:aload_1         
	//*  18   42:monitorenter    
			{
				if(zzcpu == null)
					break label0;
	//   19   43:aload_0         
	//   20   44:getfield        #420 <Field zzanz zzcpu>
	//   21   47:ifnull          59
				zzanz1 = zzcpu;
	//   22   50:aload_0         
	//   23   51:getfield        #420 <Field zzanz zzcpu>
	//   24   54:astore_2        
			}
	//   25   55:aload_1         
	//   26   56:monitorexit     
			return zzanz1;
	//   27   57:aload_2         
	//   28   58:areturn         
		}
		zzanz zzanz2;
		zzanz2 = zzaki.zza(((java.util.concurrent.Callable) (new zzajn(this))));
	//   29   59:new             #422 <Class zzajn>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:invokespecial   #423 <Method void zzajn(zzajm)>
	//   33   67:invokestatic    #428 <Method zzanz zzaki.zza(java.util.concurrent.Callable)>
	//   34   70:astore_2        
		zzcpu = zzanz2;
	//   35   71:aload_0         
	//   36   72:aload_2         
	//   37   73:putfield        #420 <Field zzanz zzcpu>
		obj;
	//   38   76:aload_1         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		return zzanz2;
	//   40   78:aload_2         
	//   41   79:areturn         
		exception;
	//   42   80:astore_2        
		obj;
	//   43   81:aload_1         
		JVM INSTR monitorexit ;
	//   44   82:monitorexit     
		throw exception;
	//   45   83:aload_2         
	//   46   84:athrow          
		return ((zzanz) (zzano.zzi(((Object) (new ArrayList())))));
	//   47   85:new             #170 <Class ArrayList>
	//   48   88:dup             
	//   49   89:invokespecial   #171 <Method void ArrayList()>
	//   50   92:invokestatic    #434 <Method zzany zzano.zzi(Object)>
	//   51   95:areturn         
	}

	final ArrayList zzqj()
		throws Exception
	{
		return zzag(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Context mContext>
	//    2    4:invokestatic    #441 <Method ArrayList zzag(Context)>
	//    3    7:areturn         
	}

	private Context mContext;
	private final Object mLock = new Object();
	private zzgf zzahz;
	private final zzajt zzcpl = new zzajt();
	private final zzakd zzcpm = new zzakd();
	private zznn zzcpn;
	private zzgk zzcpo;
	private Boolean zzcpp;
	private String zzcpq;
	private final AtomicInteger zzcpr = new AtomicInteger(0);
	private final zzajp zzcps = new zzajp(((zzajo) (null)));
	private final Object zzcpt = new Object();
	private zzanz zzcpu;
	private zzes zzvy;
	private zzang zzyf;
	private boolean zzzv;
}
