// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;

public final class zzby
{

	private zzby()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Parcelable zza(Bundle bundle, String s)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		bundle.setClassLoader(((Class) (com/google/android/gms/maps/internal/zzby)).getClassLoader());
	//    4    6:aload_0         
	//    5    7:ldc1            #2   <Class zzby>
	//    6    9:invokevirtual   #18  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #24  <Method void Bundle.setClassLoader(ClassLoader)>
		bundle = bundle.getBundle("map_state");
	//    8   15:aload_0         
	//    9   16:ldc1            #26  <String "map_state">
	//   10   18:invokevirtual   #30  <Method Bundle Bundle.getBundle(String)>
	//   11   21:astore_0        
		if(bundle == null)
	//*  12   22:aload_0         
	//*  13   23:ifnonnull       28
		{
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		} else
		{
			bundle.setClassLoader(((Class) (com/google/android/gms/maps/internal/zzby)).getClassLoader());
	//   16   28:aload_0         
	//   17   29:ldc1            #2   <Class zzby>
	//   18   31:invokevirtual   #18  <Method ClassLoader Class.getClassLoader()>
	//   19   34:invokevirtual   #24  <Method void Bundle.setClassLoader(ClassLoader)>
			return bundle.getParcelable(s);
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:invokevirtual   #34  <Method Parcelable Bundle.getParcelable(String)>
	//   23   42:areturn         
		}
	}

	public static void zza(Bundle bundle, Bundle bundle1)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          106
		{
			if(bundle1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
				return;
	//    4    8:return          
			Parcelable parcelable = zza(bundle, "MapOptions");
	//    5    9:aload_0         
	//    6   10:ldc1            #40  <String "MapOptions">
	//    7   12:invokestatic    #42  <Method Parcelable zza(Bundle, String)>
	//    8   15:astore_2        
			if(parcelable != null)
	//*   9   16:aload_2         
	//*  10   17:ifnull          27
				zza(bundle1, "MapOptions", parcelable);
	//   11   20:aload_1         
	//   12   21:ldc1            #40  <String "MapOptions">
	//   13   23:aload_2         
	//   14   24:invokestatic    #45  <Method void zza(Bundle, String, Parcelable)>
			parcelable = zza(bundle, "StreetViewPanoramaOptions");
	//   15   27:aload_0         
	//   16   28:ldc1            #47  <String "StreetViewPanoramaOptions">
	//   17   30:invokestatic    #42  <Method Parcelable zza(Bundle, String)>
	//   18   33:astore_2        
			if(parcelable != null)
	//*  19   34:aload_2         
	//*  20   35:ifnull          45
				zza(bundle1, "StreetViewPanoramaOptions", parcelable);
	//   21   38:aload_1         
	//   22   39:ldc1            #47  <String "StreetViewPanoramaOptions">
	//   23   41:aload_2         
	//   24   42:invokestatic    #45  <Method void zza(Bundle, String, Parcelable)>
			parcelable = zza(bundle, "camera");
	//   25   45:aload_0         
	//   26   46:ldc1            #49  <String "camera">
	//   27   48:invokestatic    #42  <Method Parcelable zza(Bundle, String)>
	//   28   51:astore_2        
			if(parcelable != null)
	//*  29   52:aload_2         
	//*  30   53:ifnull          63
				zza(bundle1, "camera", parcelable);
	//   31   56:aload_1         
	//   32   57:ldc1            #49  <String "camera">
	//   33   59:aload_2         
	//   34   60:invokestatic    #45  <Method void zza(Bundle, String, Parcelable)>
			if(bundle.containsKey("position"))
	//*  35   63:aload_0         
	//*  36   64:ldc1            #51  <String "position">
	//*  37   66:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  38   69:ifeq            84
				bundle1.putString("position", bundle.getString("position"));
	//   39   72:aload_1         
	//   40   73:ldc1            #51  <String "position">
	//   41   75:aload_0         
	//   42   76:ldc1            #51  <String "position">
	//   43   78:invokevirtual   #59  <Method String Bundle.getString(String)>
	//   44   81:invokevirtual   #63  <Method void Bundle.putString(String, String)>
			if(bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT"))
	//*  45   84:aload_0         
	//*  46   85:ldc1            #65  <String "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT">
	//*  47   87:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
	//*  48   90:ifeq            106
				bundle1.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
	//   49   93:aload_1         
	//   50   94:ldc1            #65  <String "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT">
	//   51   96:aload_0         
	//   52   97:ldc1            #65  <String "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT">
	//   53   99:iconst_0        
	//   54  100:invokevirtual   #69  <Method boolean Bundle.getBoolean(String, boolean)>
	//   55  103:invokevirtual   #73  <Method void Bundle.putBoolean(String, boolean)>
		}
	//   56  106:return          
	}

	public static void zza(Bundle bundle, String s, Parcelable parcelable)
	{
		bundle.setClassLoader(((Class) (com/google/android/gms/maps/internal/zzby)).getClassLoader());
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class zzby>
	//    2    3:invokevirtual   #18  <Method ClassLoader Class.getClassLoader()>
	//    3    6:invokevirtual   #24  <Method void Bundle.setClassLoader(ClassLoader)>
		Bundle bundle2 = bundle.getBundle("map_state");
	//    4    9:aload_0         
	//    5   10:ldc1            #26  <String "map_state">
	//    6   12:invokevirtual   #30  <Method Bundle Bundle.getBundle(String)>
	//    7   15:astore          4
		Bundle bundle1 = bundle2;
	//    8   17:aload           4
	//    9   19:astore_3        
		if(bundle2 == null)
	//*  10   20:aload           4
	//*  11   22:ifnonnull       33
			bundle1 = new Bundle();
	//   12   25:new             #20  <Class Bundle>
	//   13   28:dup             
	//   14   29:invokespecial   #74  <Method void Bundle()>
	//   15   32:astore_3        
		bundle1.setClassLoader(((Class) (com/google/android/gms/maps/internal/zzby)).getClassLoader());
	//   16   33:aload_3         
	//   17   34:ldc1            #2   <Class zzby>
	//   18   36:invokevirtual   #18  <Method ClassLoader Class.getClassLoader()>
	//   19   39:invokevirtual   #24  <Method void Bundle.setClassLoader(ClassLoader)>
		bundle1.putParcelable(s, parcelable);
	//   20   42:aload_3         
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokevirtual   #78  <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putBundle("map_state", bundle1);
	//   24   48:aload_0         
	//   25   49:ldc1            #26  <String "map_state">
	//   26   51:aload_3         
	//   27   52:invokevirtual   #82  <Method void Bundle.putBundle(String, Bundle)>
	//   28   55:return          
	}
}
