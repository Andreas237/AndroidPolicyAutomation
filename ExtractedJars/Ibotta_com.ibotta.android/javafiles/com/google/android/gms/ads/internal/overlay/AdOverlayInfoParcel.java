// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.*;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//			zzm, zzn, zzt, zzc

public final class AdOverlayInfoParcel extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	AdOverlayInfoParcel(zzc zzc1, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, boolean flag, 
			String s1, IBinder ibinder4, int i, int j, String s2, zzang zzang, String s3, 
			zzaq zzaq, IBinder ibinder5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzbyl = zzc1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #87  <Field zzc zzbyl>
		zzbym = (zzjd)ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #93  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    8   14:invokestatic    #99  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    9   17:checkcast       #101 <Class zzjd>
	//   10   20:putfield        #103 <Field zzjd zzbym>
		zzbyn = (zzn)ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder1));
	//   11   23:aload_0         
	//   12   24:aload_3         
	//   13   25:invokestatic    #93  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   14   28:invokestatic    #99  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   15   31:checkcast       #105 <Class zzn>
	//   16   34:putfield        #107 <Field zzn zzbyn>
		zzbyo = (zzaqw)ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder2));
	//   17   37:aload_0         
	//   18   38:aload           4
	//   19   40:invokestatic    #93  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   20   43:invokestatic    #99  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   21   46:checkcast       #109 <Class zzaqw>
	//   22   49:putfield        #111 <Field zzaqw zzbyo>
		zzbyx = (zzb)ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder5));
	//   23   52:aload_0         
	//   24   53:aload           16
	//   25   55:invokestatic    #93  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   26   58:invokestatic    #99  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   27   61:checkcast       #113 <Class zzb>
	//   28   64:putfield        #115 <Field zzb zzbyx>
		zzbyp = (zzd)ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder3));
	//   29   67:aload_0         
	//   30   68:aload           5
	//   31   70:invokestatic    #93  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   32   73:invokestatic    #99  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   33   76:checkcast       #117 <Class zzd>
	//   34   79:putfield        #119 <Field zzd zzbyp>
		zzbyq = s;
	//   35   82:aload_0         
	//   36   83:aload           6
	//   37   85:putfield        #121 <Field String zzbyq>
		zzbyr = flag;
	//   38   88:aload_0         
	//   39   89:iload           7
	//   40   91:putfield        #123 <Field boolean zzbyr>
		zzbys = s1;
	//   41   94:aload_0         
	//   42   95:aload           8
	//   43   97:putfield        #125 <Field String zzbys>
		zzbyt = (zzt)ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(ibinder4));
	//   44  100:aload_0         
	//   45  101:aload           9
	//   46  103:invokestatic    #93  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   47  106:invokestatic    #99  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   48  109:checkcast       #127 <Class zzt>
	//   49  112:putfield        #129 <Field zzt zzbyt>
		orientation = i;
	//   50  115:aload_0         
	//   51  116:iload           10
	//   52  118:putfield        #131 <Field int orientation>
		zzbyu = j;
	//   53  121:aload_0         
	//   54  122:iload           11
	//   55  124:putfield        #133 <Field int zzbyu>
		url = s2;
	//   56  127:aload_0         
	//   57  128:aload           12
	//   58  130:putfield        #135 <Field String url>
		zzacr = zzang;
	//   59  133:aload_0         
	//   60  134:aload           13
	//   61  136:putfield        #137 <Field zzang zzacr>
		zzbyv = s3;
	//   62  139:aload_0         
	//   63  140:aload           14
	//   64  142:putfield        #139 <Field String zzbyv>
		zzbyw = zzaq;
	//   65  145:aload_0         
	//   66  146:aload           15
	//   67  148:putfield        #141 <Field zzaq zzbyw>
	//   68  151:return          
	}

	public AdOverlayInfoParcel(zzc zzc1, zzjd zzjd1, zzn zzn1, zzt zzt1, zzang zzang)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzbyl = zzc1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #87  <Field zzc zzbyl>
		zzbym = zzjd1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #103 <Field zzjd zzbym>
		zzbyn = zzn1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #107 <Field zzn zzbyn>
		zzbyo = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #111 <Field zzaqw zzbyo>
		zzbyx = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #115 <Field zzb zzbyx>
		zzbyp = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #119 <Field zzd zzbyp>
		zzbyq = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #121 <Field String zzbyq>
		zzbyr = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #123 <Field boolean zzbyr>
		zzbys = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #125 <Field String zzbys>
		zzbyt = zzt1;
	//   29   49:aload_0         
	//   30   50:aload           4
	//   31   52:putfield        #129 <Field zzt zzbyt>
		orientation = -1;
	//   32   55:aload_0         
	//   33   56:iconst_m1       
	//   34   57:putfield        #131 <Field int orientation>
		zzbyu = 4;
	//   35   60:aload_0         
	//   36   61:iconst_4        
	//   37   62:putfield        #133 <Field int zzbyu>
		url = null;
	//   38   65:aload_0         
	//   39   66:aconst_null     
	//   40   67:putfield        #135 <Field String url>
		zzacr = zzang;
	//   41   70:aload_0         
	//   42   71:aload           5
	//   43   73:putfield        #137 <Field zzang zzacr>
		zzbyv = null;
	//   44   76:aload_0         
	//   45   77:aconst_null     
	//   46   78:putfield        #139 <Field String zzbyv>
		zzbyw = null;
	//   47   81:aload_0         
	//   48   82:aconst_null     
	//   49   83:putfield        #141 <Field zzaq zzbyw>
	//   50   86:return          
	}

	public AdOverlayInfoParcel(zzjd zzjd1, zzn zzn1, zzb zzb1, zzd zzd1, zzt zzt1, zzaqw zzaqw1, boolean flag, 
			int i, String s, zzang zzang)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzbyl = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #87  <Field zzc zzbyl>
		zzbym = zzjd1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #103 <Field zzjd zzbym>
		zzbyn = zzn1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #107 <Field zzn zzbyn>
		zzbyo = zzaqw1;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #111 <Field zzaqw zzbyo>
		zzbyx = zzb1;
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:putfield        #115 <Field zzb zzbyx>
		zzbyp = zzd1;
	//   17   30:aload_0         
	//   18   31:aload           4
	//   19   33:putfield        #119 <Field zzd zzbyp>
		zzbyq = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #121 <Field String zzbyq>
		zzbyr = flag;
	//   23   41:aload_0         
	//   24   42:iload           7
	//   25   44:putfield        #123 <Field boolean zzbyr>
		zzbys = null;
	//   26   47:aload_0         
	//   27   48:aconst_null     
	//   28   49:putfield        #125 <Field String zzbys>
		zzbyt = zzt1;
	//   29   52:aload_0         
	//   30   53:aload           5
	//   31   55:putfield        #129 <Field zzt zzbyt>
		orientation = i;
	//   32   58:aload_0         
	//   33   59:iload           8
	//   34   61:putfield        #131 <Field int orientation>
		zzbyu = 3;
	//   35   64:aload_0         
	//   36   65:iconst_3        
	//   37   66:putfield        #133 <Field int zzbyu>
		url = s;
	//   38   69:aload_0         
	//   39   70:aload           9
	//   40   72:putfield        #135 <Field String url>
		zzacr = zzang;
	//   41   75:aload_0         
	//   42   76:aload           10
	//   43   78:putfield        #137 <Field zzang zzacr>
		zzbyv = null;
	//   44   81:aload_0         
	//   45   82:aconst_null     
	//   46   83:putfield        #139 <Field String zzbyv>
		zzbyw = null;
	//   47   86:aload_0         
	//   48   87:aconst_null     
	//   49   88:putfield        #141 <Field zzaq zzbyw>
	//   50   91:return          
	}

	public AdOverlayInfoParcel(zzjd zzjd1, zzn zzn1, zzb zzb1, zzd zzd1, zzt zzt1, zzaqw zzaqw1, boolean flag, 
			int i, String s, String s1, zzang zzang)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzbyl = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #87  <Field zzc zzbyl>
		zzbym = zzjd1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #103 <Field zzjd zzbym>
		zzbyn = zzn1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #107 <Field zzn zzbyn>
		zzbyo = zzaqw1;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #111 <Field zzaqw zzbyo>
		zzbyx = zzb1;
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:putfield        #115 <Field zzb zzbyx>
		zzbyp = zzd1;
	//   17   30:aload_0         
	//   18   31:aload           4
	//   19   33:putfield        #119 <Field zzd zzbyp>
		zzbyq = s1;
	//   20   36:aload_0         
	//   21   37:aload           10
	//   22   39:putfield        #121 <Field String zzbyq>
		zzbyr = flag;
	//   23   42:aload_0         
	//   24   43:iload           7
	//   25   45:putfield        #123 <Field boolean zzbyr>
		zzbys = s;
	//   26   48:aload_0         
	//   27   49:aload           9
	//   28   51:putfield        #125 <Field String zzbys>
		zzbyt = zzt1;
	//   29   54:aload_0         
	//   30   55:aload           5
	//   31   57:putfield        #129 <Field zzt zzbyt>
		orientation = i;
	//   32   60:aload_0         
	//   33   61:iload           8
	//   34   63:putfield        #131 <Field int orientation>
		zzbyu = 3;
	//   35   66:aload_0         
	//   36   67:iconst_3        
	//   37   68:putfield        #133 <Field int zzbyu>
		url = null;
	//   38   71:aload_0         
	//   39   72:aconst_null     
	//   40   73:putfield        #135 <Field String url>
		zzacr = zzang;
	//   41   76:aload_0         
	//   42   77:aload           11
	//   43   79:putfield        #137 <Field zzang zzacr>
		zzbyv = null;
	//   44   82:aload_0         
	//   45   83:aconst_null     
	//   46   84:putfield        #139 <Field String zzbyv>
		zzbyw = null;
	//   47   87:aload_0         
	//   48   88:aconst_null     
	//   49   89:putfield        #141 <Field zzaq zzbyw>
	//   50   92:return          
	}

	public AdOverlayInfoParcel(zzjd zzjd1, zzn zzn1, zzt zzt1, zzaqw zzaqw1, int i, zzang zzang, String s, 
			zzaq zzaq)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzbyl = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #87  <Field zzc zzbyl>
		zzbym = zzjd1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #103 <Field zzjd zzbym>
		zzbyn = zzn1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #107 <Field zzn zzbyn>
		zzbyo = zzaqw1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #111 <Field zzaqw zzbyo>
		zzbyx = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #115 <Field zzb zzbyx>
		zzbyp = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #119 <Field zzd zzbyp>
		zzbyq = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #121 <Field String zzbyq>
		zzbyr = false;
	//   23   40:aload_0         
	//   24   41:iconst_0        
	//   25   42:putfield        #123 <Field boolean zzbyr>
		zzbys = null;
	//   26   45:aload_0         
	//   27   46:aconst_null     
	//   28   47:putfield        #125 <Field String zzbys>
		zzbyt = zzt1;
	//   29   50:aload_0         
	//   30   51:aload_3         
	//   31   52:putfield        #129 <Field zzt zzbyt>
		orientation = i;
	//   32   55:aload_0         
	//   33   56:iload           5
	//   34   58:putfield        #131 <Field int orientation>
		zzbyu = 1;
	//   35   61:aload_0         
	//   36   62:iconst_1        
	//   37   63:putfield        #133 <Field int zzbyu>
		url = null;
	//   38   66:aload_0         
	//   39   67:aconst_null     
	//   40   68:putfield        #135 <Field String url>
		zzacr = zzang;
	//   41   71:aload_0         
	//   42   72:aload           6
	//   43   74:putfield        #137 <Field zzang zzacr>
		zzbyv = s;
	//   44   77:aload_0         
	//   45   78:aload           7
	//   46   80:putfield        #139 <Field String zzbyv>
		zzbyw = zzaq;
	//   47   83:aload_0         
	//   48   84:aload           8
	//   49   86:putfield        #141 <Field zzaq zzbyw>
	//   50   89:return          
	}

	public AdOverlayInfoParcel(zzjd zzjd1, zzn zzn1, zzt zzt1, zzaqw zzaqw1, boolean flag, int i, zzang zzang)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzbyl = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #87  <Field zzc zzbyl>
		zzbym = zzjd1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #103 <Field zzjd zzbym>
		zzbyn = zzn1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #107 <Field zzn zzbyn>
		zzbyo = zzaqw1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #111 <Field zzaqw zzbyo>
		zzbyx = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #115 <Field zzb zzbyx>
		zzbyp = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #119 <Field zzd zzbyp>
		zzbyq = null;
	//   20   35:aload_0         
	//   21   36:aconst_null     
	//   22   37:putfield        #121 <Field String zzbyq>
		zzbyr = flag;
	//   23   40:aload_0         
	//   24   41:iload           5
	//   25   43:putfield        #123 <Field boolean zzbyr>
		zzbys = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #125 <Field String zzbys>
		zzbyt = zzt1;
	//   29   51:aload_0         
	//   30   52:aload_3         
	//   31   53:putfield        #129 <Field zzt zzbyt>
		orientation = i;
	//   32   56:aload_0         
	//   33   57:iload           6
	//   34   59:putfield        #131 <Field int orientation>
		zzbyu = 2;
	//   35   62:aload_0         
	//   36   63:iconst_2        
	//   37   64:putfield        #133 <Field int zzbyu>
		url = null;
	//   38   67:aload_0         
	//   39   68:aconst_null     
	//   40   69:putfield        #135 <Field String url>
		zzacr = zzang;
	//   41   72:aload_0         
	//   42   73:aload           7
	//   43   75:putfield        #137 <Field zzang zzacr>
		zzbyv = null;
	//   44   78:aload_0         
	//   45   79:aconst_null     
	//   46   80:putfield        #139 <Field String zzbyv>
		zzbyw = null;
	//   47   83:aload_0         
	//   48   84:aconst_null     
	//   49   85:putfield        #141 <Field zzaq zzbyw>
	//   50   88:return          
	}

	public static void zza(Intent intent, AdOverlayInfoParcel adoverlayinfoparcel)
	{
		Bundle bundle = new Bundle(1);
	//    0    0:new             #152 <Class Bundle>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #155 <Method void Bundle(int)>
	//    4    8:astore_2        
		bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", ((android.os.Parcelable) (adoverlayinfoparcel)));
	//    5    9:aload_2         
	//    6   10:ldc1            #157 <String "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo">
	//    7   12:aload_1         
	//    8   13:invokevirtual   #161 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
	//    9   16:aload_0         
	//   10   17:ldc1            #157 <String "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo">
	//   11   19:aload_2         
	//   12   20:invokevirtual   #167 <Method Intent Intent.putExtra(String, Bundle)>
	//   13   23:pop             
	//   14   24:return          
	}

	public static AdOverlayInfoParcel zzc(Intent intent)
	{
		try
		{
			intent = ((Intent) (intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo")));
	//    0    0:aload_0         
	//    1    1:ldc1            #157 <String "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo">
	//    2    3:invokevirtual   #175 <Method Bundle Intent.getBundleExtra(String)>
	//    3    6:astore_0        
			((Bundle) (intent)).setClassLoader(((Class) (com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel)).getClassLoader());
	//    4    7:aload_0         
	//    5    8:ldc1            #2   <Class AdOverlayInfoParcel>
	//    6   10:invokevirtual   #181 <Method ClassLoader Class.getClassLoader()>
	//    7   13:invokevirtual   #185 <Method void Bundle.setClassLoader(ClassLoader)>
			intent = ((Intent) ((AdOverlayInfoParcel)((Bundle) (intent)).getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo")));
	//    8   16:aload_0         
	//    9   17:ldc1            #157 <String "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo">
	//   10   19:invokevirtual   #189 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   22:checkcast       #2   <Class AdOverlayInfoParcel>
	//   12   25:astore_0        
		}
	//*  13   26:aload_0         
	//*  14   27:areturn         
	//*  15   28:aconst_null     
	//*  16   29:areturn         
		// Misplaced declaration of an exception variable
		catch(Intent intent)
		{
			return null;
		}
		return ((AdOverlayInfoParcel) (intent));
	//*  17   30:astore_0        
	//*  18   31:goto            28
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #197 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zzbyl)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #87  <Field zzc zzbyl>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #201 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(((Object) (zzbym))).asBinder(), false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #103 <Field zzjd zzbym>
	//   14   22:invokestatic    #205 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   15   25:invokeinterface #211 <Method IBinder IObjectWrapper.asBinder()>
	//   16   30:iconst_0        
	//   17   31:invokestatic    #215 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(((Object) (zzbyn))).asBinder(), false);
	//   18   34:aload_1         
	//   19   35:iconst_4        
	//   20   36:aload_0         
	//   21   37:getfield        #107 <Field zzn zzbyn>
	//   22   40:invokestatic    #205 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   23   43:invokeinterface #211 <Method IBinder IObjectWrapper.asBinder()>
	//   24   48:iconst_0        
	//   25   49:invokestatic    #215 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(((Object) (zzbyo))).asBinder(), false);
	//   26   52:aload_1         
	//   27   53:iconst_5        
	//   28   54:aload_0         
	//   29   55:getfield        #111 <Field zzaqw zzbyo>
	//   30   58:invokestatic    #205 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   31   61:invokeinterface #211 <Method IBinder IObjectWrapper.asBinder()>
	//   32   66:iconst_0        
	//   33   67:invokestatic    #215 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(((Object) (zzbyp))).asBinder(), false);
	//   34   70:aload_1         
	//   35   71:bipush          6
	//   36   73:aload_0         
	//   37   74:getfield        #119 <Field zzd zzbyp>
	//   38   77:invokestatic    #205 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   39   80:invokeinterface #211 <Method IBinder IObjectWrapper.asBinder()>
	//   40   85:iconst_0        
	//   41   86:invokestatic    #215 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeString(parcel, 7, zzbyq, false);
	//   42   89:aload_1         
	//   43   90:bipush          7
	//   44   92:aload_0         
	//   45   93:getfield        #121 <Field String zzbyq>
	//   46   96:iconst_0        
	//   47   97:invokestatic    #219 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzbyr);
	//   48  100:aload_1         
	//   49  101:bipush          8
	//   50  103:aload_0         
	//   51  104:getfield        #123 <Field boolean zzbyr>
	//   52  107:invokestatic    #223 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 9, zzbys, false);
	//   53  110:aload_1         
	//   54  111:bipush          9
	//   55  113:aload_0         
	//   56  114:getfield        #125 <Field String zzbys>
	//   57  117:iconst_0        
	//   58  118:invokestatic    #219 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(((Object) (zzbyt))).asBinder(), false);
	//   59  121:aload_1         
	//   60  122:bipush          10
	//   61  124:aload_0         
	//   62  125:getfield        #129 <Field zzt zzbyt>
	//   63  128:invokestatic    #205 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   64  131:invokeinterface #211 <Method IBinder IObjectWrapper.asBinder()>
	//   65  136:iconst_0        
	//   66  137:invokestatic    #215 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeInt(parcel, 11, orientation);
	//   67  140:aload_1         
	//   68  141:bipush          11
	//   69  143:aload_0         
	//   70  144:getfield        #131 <Field int orientation>
	//   71  147:invokestatic    #227 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 12, zzbyu);
	//   72  150:aload_1         
	//   73  151:bipush          12
	//   74  153:aload_0         
	//   75  154:getfield        #133 <Field int zzbyu>
	//   76  157:invokestatic    #227 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 13, url, false);
	//   77  160:aload_1         
	//   78  161:bipush          13
	//   79  163:aload_0         
	//   80  164:getfield        #135 <Field String url>
	//   81  167:iconst_0        
	//   82  168:invokestatic    #219 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 14, ((android.os.Parcelable) (zzacr)), i, false);
	//   83  171:aload_1         
	//   84  172:bipush          14
	//   85  174:aload_0         
	//   86  175:getfield        #137 <Field zzang zzacr>
	//   87  178:iload_2         
	//   88  179:iconst_0        
	//   89  180:invokestatic    #201 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 16, zzbyv, false);
	//   90  183:aload_1         
	//   91  184:bipush          16
	//   92  186:aload_0         
	//   93  187:getfield        #139 <Field String zzbyv>
	//   94  190:iconst_0        
	//   95  191:invokestatic    #219 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 17, ((android.os.Parcelable) (zzbyw)), i, false);
	//   96  194:aload_1         
	//   97  195:bipush          17
	//   98  197:aload_0         
	//   99  198:getfield        #141 <Field zzaq zzbyw>
	//  100  201:iload_2         
	//  101  202:iconst_0        
	//  102  203:invokestatic    #201 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(((Object) (zzbyx))).asBinder(), false);
	//  103  206:aload_1         
	//  104  207:bipush          18
	//  105  209:aload_0         
	//  106  210:getfield        #115 <Field zzb zzbyx>
	//  107  213:invokestatic    #205 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//  108  216:invokeinterface #211 <Method IBinder IObjectWrapper.asBinder()>
	//  109  221:iconst_0        
	//  110  222:invokestatic    #215 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//  111  225:aload_1         
	//  112  226:iload_3         
	//  113  227:invokestatic    #230 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//  114  230:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzm();
	public final int orientation;
	public final String url;
	public final zzang zzacr;
	public final zzc zzbyl;
	public final zzjd zzbym;
	public final zzn zzbyn;
	public final zzaqw zzbyo;
	public final zzd zzbyp;
	public final String zzbyq;
	public final boolean zzbyr;
	public final String zzbys;
	public final zzt zzbyt;
	public final int zzbyu;
	public final String zzbyv;
	public final zzaq zzbyw;
	public final zzb zzbyx;

	static 
	{
	//    0    0:new             #75  <Class zzm>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void zzm()>
	//    3    7:putstatic       #80  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
