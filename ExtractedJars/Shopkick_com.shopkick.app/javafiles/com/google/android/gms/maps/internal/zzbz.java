// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zze, zzf

public class zzbz
{

	public zzbz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static zze zza(Context context)
		throws GooglePlayServicesNotAvailableException
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		zze zze1 = zzck;
	//    3    5:getstatic       #36  <Field zze zzck>
	//    4    8:astore_2        
		if(zze1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          15
			return zze1;
	//    7   13:aload_2         
	//    8   14:areturn         
		int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 0xbdfcb8);
	//    9   15:aload_0         
	//   10   16:ldc1            #37  <Int 0xbdfcb8>
	//   11   18:invokestatic    #43  <Method int GooglePlayServicesUtil.isGooglePlayServicesAvailable(Context, int)>
	//   12   21:istore_1        
		if(i == 0)
	//*  13   22:iload_1         
	//*  14   23:ifne            132
		{
			Log.i(TAG, "Making Creator dynamically");
	//   15   26:getstatic       #45  <Field String TAG>
	//   16   29:ldc1            #47  <String "Making Creator dynamically">
	//   17   31:invokestatic    #53  <Method int Log.i(String, String)>
	//   18   34:pop             
			Object obj = ((Object) ((IBinder)zza(zzb(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl")));
	//   19   35:aload_0         
	//   20   36:invokestatic    #57  <Method Context zzb(Context)>
	//   21   39:invokevirtual   #63  <Method ClassLoader Context.getClassLoader()>
	//   22   42:ldc1            #65  <String "com.google.android.gms.maps.internal.CreatorImpl">
	//   23   44:invokestatic    #68  <Method Object zza(ClassLoader, String)>
	//   24   47:checkcast       #70  <Class IBinder>
	//   25   50:astore_2        
			if(obj == null)
	//*  26   51:aload_2         
	//*  27   52:ifnonnull       60
			{
				obj = null;
	//   28   55:aconst_null     
	//   29   56:astore_2        
			} else
	//*  30   57:goto            93
			{
				android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
	//   31   60:aload_2         
	//   32   61:ldc1            #72  <String "com.google.android.gms.maps.internal.ICreator">
	//   33   63:invokeinterface #76  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   34   68:astore_3        
				if(iinterface instanceof zze)
	//*  35   69:aload_3         
	//*  36   70:instanceof      #78  <Class zze>
	//*  37   73:ifeq            84
					obj = ((Object) ((zze)iinterface));
	//   38   76:aload_3         
	//   39   77:checkcast       #78  <Class zze>
	//   40   80:astore_2        
				else
	//*  41   81:goto            93
					obj = ((Object) (new zzf(((IBinder) (obj)))));
	//   42   84:new             #80  <Class zzf>
	//   43   87:dup             
	//   44   88:aload_2         
	//   45   89:invokespecial   #83  <Method void zzf(IBinder)>
	//   46   92:astore_2        
			}
			zzck = ((zze) (obj));
	//   47   93:aload_2         
	//   48   94:putstatic       #36  <Field zze zzck>
			try
			{
				zzck.zza(ObjectWrapper.wrap(((Object) (zzb(context).getResources()))), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
	//   49   97:getstatic       #36  <Field zze zzck>
	//   50  100:aload_0         
	//   51  101:invokestatic    #57  <Method Context zzb(Context)>
	//   52  104:invokevirtual   #87  <Method android.content.res.Resources Context.getResources()>
	//   53  107:invokestatic    #93  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   54  110:getstatic       #97  <Field int GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//   55  113:invokeinterface #100 <Method void zze.zza(com.google.android.gms.dynamic.IObjectWrapper, int)>
			}
	//*  56  118:getstatic       #36  <Field zze zzck>
	//*  57  121:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  58  122:astore_0        
			{
				throw new RuntimeRemoteException(((RemoteException) (context)));
	//   59  123:new             #102 <Class RuntimeRemoteException>
	//   60  126:dup             
	//   61  127:aload_0         
	//   62  128:invokespecial   #105 <Method void RuntimeRemoteException(RemoteException)>
	//   63  131:athrow          
			}
			return zzck;
		} else
		{
			throw new GooglePlayServicesNotAvailableException(i);
	//   64  132:new             #26  <Class GooglePlayServicesNotAvailableException>
	//   65  135:dup             
	//   66  136:iload_1         
	//   67  137:invokespecial   #108 <Method void GooglePlayServicesNotAvailableException(int)>
	//   68  140:athrow          
		}
	}

	private static Object zza(Class class1)
	{
		Object obj1;
		Object obj;
		try
		{
			obj = class1.newInstance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method Object Class.newInstance()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #124 <Method String Class.getName()>
	//*   7   11:invokestatic    #130 <Method String String.valueOf(Object)>
	//*   8   14:astore_0        
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #134 <Method int String.length()>
	//*  11   19:ifeq            32
	//*  12   22:ldc1            #136 <String "Unable to call the default constructor of ">
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #140 <Method String String.concat(String)>
	//*  15   28:astore_0        
	//*  16   29:goto            42
	//*  17   32:new             #126 <Class String>
	//*  18   35:dup             
	//*  19   36:ldc1            #136 <String "Unable to call the default constructor of ">
	//*  20   38:invokespecial   #143 <Method void String(String)>
	//*  21   41:astore_0        
	//*  22   42:new             #145 <Class IllegalStateException>
	//*  23   45:dup             
	//*  24   46:aload_0         
	//*  25   47:invokespecial   #146 <Method void IllegalStateException(String)>
	//*  26   50:athrow          
	//*  27   51:aload_0         
	//*  28   52:invokevirtual   #124 <Method String Class.getName()>
	//*  29   55:invokestatic    #130 <Method String String.valueOf(Object)>
	//*  30   58:astore_0        
	//*  31   59:aload_0         
	//*  32   60:invokevirtual   #134 <Method int String.length()>
	//*  33   63:ifeq            76
	//*  34   66:ldc1            #148 <String "Unable to instantiate the dynamic class ">
	//*  35   68:aload_0         
	//*  36   69:invokevirtual   #140 <Method String String.concat(String)>
	//*  37   72:astore_0        
	//*  38   73:goto            86
	//*  39   76:new             #126 <Class String>
	//*  40   79:dup             
	//*  41   80:ldc1            #148 <String "Unable to instantiate the dynamic class ">
	//*  42   82:invokespecial   #143 <Method void String(String)>
	//*  43   85:astore_0        
	//*  44   86:new             #145 <Class IllegalStateException>
	//*  45   89:dup             
	//*  46   90:aload_0         
	//*  47   91:invokespecial   #146 <Method void IllegalStateException(String)>
	//*  48   94:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			class1 = ((Class) (String.valueOf(((Object) (class1.getName())))));
			if(((String) (class1)).length() != 0)
				class1 = ((Class) ("Unable to instantiate the dynamic class ".concat(((String) (class1)))));
			else
				class1 = ((Class) (new String("Unable to instantiate the dynamic class ")));
			throw new IllegalStateException(((String) (class1)));
		}
	//*  49   95:astore_1        
	//*  50   96:goto            51
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			class1 = ((Class) (String.valueOf(((Object) (class1.getName())))));
			if(((String) (class1)).length() != 0)
				class1 = ((Class) ("Unable to call the default constructor of ".concat(((String) (class1)))));
			else
				class1 = ((Class) (new String("Unable to call the default constructor of ")));
			throw new IllegalStateException(((String) (class1)));
		}
		return obj;
	//*  51   99:astore_1        
	//*  52  100:goto            7
	}

	private static Object zza(ClassLoader classloader, String s)
	{
		try
		{
			classloader = ((ClassLoader) (zza(((ClassLoader)Preconditions.checkNotNull(((Object) (classloader)))).loadClass(s))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:checkcast       #154 <Class ClassLoader>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #158 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokestatic    #160 <Method Object zza(Class)>
	//    6   14:astore_0        
		}
	//*   7   15:aload_0         
	//*   8   16:areturn         
	//*   9   17:aload_1         
	//*  10   18:invokestatic    #130 <Method String String.valueOf(Object)>
	//*  11   21:astore_0        
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #134 <Method int String.length()>
	//*  14   26:ifeq            39
	//*  15   29:ldc1            #162 <String "Unable to find dynamic class ">
	//*  16   31:aload_0         
	//*  17   32:invokevirtual   #140 <Method String String.concat(String)>
	//*  18   35:astore_0        
	//*  19   36:goto            49
	//*  20   39:new             #126 <Class String>
	//*  21   42:dup             
	//*  22   43:ldc1            #162 <String "Unable to find dynamic class ">
	//*  23   45:invokespecial   #143 <Method void String(String)>
	//*  24   48:astore_0        
	//*  25   49:new             #145 <Class IllegalStateException>
	//*  26   52:dup             
	//*  27   53:aload_0         
	//*  28   54:invokespecial   #146 <Method void IllegalStateException(String)>
	//*  29   57:athrow          
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
		{
			classloader = ((ClassLoader) (String.valueOf(((Object) (s)))));
			if(((String) (classloader)).length() != 0)
				classloader = ((ClassLoader) ("Unable to find dynamic class ".concat(((String) (classloader)))));
			else
				classloader = ((ClassLoader) (new String("Unable to find dynamic class ")));
			throw new IllegalStateException(((String) (classloader)));
		}
		return ((Object) (classloader));
	//*  30   58:astore_0        
	//*  31   59:goto            17
	}

	private static Context zzb(Context context)
	{
		Context context1 = zzcj;
	//    0    0:getstatic       #165 <Field Context zzcj>
	//    1    3:astore_1        
		if(context1 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          10
		{
			return context1;
	//    4    8:aload_1         
	//    5    9:areturn         
		} else
		{
			context = zzc(context);
	//    6   10:aload_0         
	//    7   11:invokestatic    #168 <Method Context zzc(Context)>
	//    8   14:astore_0        
			zzcj = context;
	//    9   15:aload_0         
	//   10   16:putstatic       #165 <Field Context zzcj>
			return context;
	//   11   19:aload_0         
	//   12   20:areturn         
		}
	}

	private static Context zzc(Context context)
	{
		Context context1;
		try
		{
			context1 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
	//    0    0:aload_0         
	//    1    1:getstatic       #177 <Field com.google.android.gms.dynamite.DynamiteModule$VersionPolicy DynamiteModule.PREFER_REMOTE>
	//    2    4:ldc1            #179 <String "com.google.android.gms.maps_dynamite">
	//    3    6:invokestatic    #183 <Method DynamiteModule DynamiteModule.load(Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, String)>
	//    4    9:invokevirtual   #187 <Method Context DynamiteModule.getModuleContext()>
	//    5   12:astore_1        
		}
	//*   6   13:aload_1         
	//*   7   14:areturn         
		catch(Throwable throwable)
	//*   8   15:astore_1        
		{
			Log.e(TAG, "Failed to load maps module, use legacy", throwable);
	//    9   16:getstatic       #45  <Field String TAG>
	//   10   19:ldc1            #189 <String "Failed to load maps module, use legacy">
	//   11   21:aload_1         
	//   12   22:invokestatic    #193 <Method int Log.e(String, String, Throwable)>
	//   13   25:pop             
			return GooglePlayServicesUtil.getRemoteContext(context);
	//   14   26:aload_0         
	//   15   27:invokestatic    #196 <Method Context GooglePlayServicesUtil.getRemoteContext(Context)>
	//   16   30:areturn         
		}
		return context1;
	}

	private static final String TAG = "zzbz";
	private static Context zzcj;
	private static zze zzck;

	static 
	{
	//    0    0:return          
	}
}
