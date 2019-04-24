// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.lang.reflect.Constructor;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxo, zzzo, zzyp, zzyk, 
//			zzane, zzxq, zzzj

public final class zzxm extends zzxo
{

	public zzxm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zzxo()>
	//    2    4:return          
	}

	private final zzxq zzbo(String s)
		throws RemoteException
	{
		Throwable throwable;
		try
		{
			Object obj = ((Object) (Class.forName(s, false, ((Class) (com/google/android/gms/internal/ads/zzxm)).getClassLoader())));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:ldc1            #2   <Class zzxm>
	//    3    4:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokestatic    #37  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    5   10:astore_2        
			if(((Class) (com/google/ads/mediation/MediationAdapter)).isAssignableFrom(((Class) (obj))))
	//*   6   11:ldc1            #39  <Class MediationAdapter>
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #43  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   17:ifeq            66
			{
				obj = ((Object) ((MediationAdapter)((Class) (obj)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
	//   10   20:aload_2         
	//   11   21:iconst_0        
	//   12   22:anewarray       Class[]
	//   13   25:invokevirtual   #47  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   14   28:iconst_0        
	//   15   29:anewarray       Object[]
	//   16   32:invokevirtual   #55  <Method Object Constructor.newInstance(Object[])>
	//   17   35:checkcast       #39  <Class MediationAdapter>
	//   18   38:astore_2        
				return ((zzxq) (new zzyp(((MediationAdapter) (obj)), (NetworkExtras)zzbuo.get(((Object) (((MediationAdapter) (obj)).getAdditionalParametersType()))))));
	//   19   39:new             #57  <Class zzyp>
	//   20   42:dup             
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #59  <Field Map zzbuo>
	//   24   48:aload_2         
	//   25   49:invokeinterface #63  <Method Class MediationAdapter.getAdditionalParametersType()>
	//   26   54:invokeinterface #69  <Method Object Map.get(Object)>
	//   27   59:checkcast       #71  <Class NetworkExtras>
	//   28   62:invokespecial   #74  <Method void zzyp(MediationAdapter, NetworkExtras)>
	//   29   65:areturn         
			}
			if(((Class) (com/google/android/gms/ads/mediation/MediationAdapter)).isAssignableFrom(((Class) (obj))))
	//*  30   66:ldc1            #76  <Class com.google.android.gms.ads.mediation.MediationAdapter>
	//*  31   68:aload_2         
	//*  32   69:invokevirtual   #43  <Method boolean Class.isAssignableFrom(Class)>
	//*  33   72:ifeq            101
			{
				return ((zzxq) (new zzyk((com.google.android.gms.ads.mediation.MediationAdapter)((Class) (obj)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]))));
	//   34   75:new             #78  <Class zzyk>
	//   35   78:dup             
	//   36   79:aload_2         
	//   37   80:iconst_0        
	//   38   81:anewarray       Class[]
	//   39   84:invokevirtual   #47  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   40   87:iconst_0        
	//   41   88:anewarray       Object[]
	//   42   91:invokevirtual   #55  <Method Object Constructor.newInstance(Object[])>
	//   43   94:checkcast       #76  <Class com.google.android.gms.ads.mediation.MediationAdapter>
	//   44   97:invokespecial   #81  <Method void zzyk(com.google.android.gms.ads.mediation.MediationAdapter)>
	//   45  100:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(64 + String.valueOf(((Object) (s))).length());
	//   46  101:new             #83  <Class StringBuilder>
	//   47  104:dup             
	//   48  105:bipush          64
	//   49  107:aload_1         
	//   50  108:invokestatic    #89  <Method String String.valueOf(Object)>
	//   51  111:invokevirtual   #93  <Method int String.length()>
	//   52  114:iadd            
	//   53  115:invokespecial   #96  <Method void StringBuilder(int)>
	//   54  118:astore_2        
				stringbuilder.append("Could not instantiate mediation adapter: ");
	//   55  119:aload_2         
	//   56  120:ldc1            #98  <String "Could not instantiate mediation adapter: ">
	//   57  122:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   58  125:pop             
				stringbuilder.append(s);
	//   59  126:aload_2         
	//   60  127:aload_1         
	//   61  128:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   62  131:pop             
				stringbuilder.append(" (not a valid adapter).");
	//   63  132:aload_2         
	//   64  133:ldc1            #104 <String " (not a valid adapter).">
	//   65  135:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
				zzane.zzdk(stringbuilder.toString());
	//   67  139:aload_2         
	//   68  140:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   69  143:invokestatic    #114 <Method void zzane.zzdk(String)>
				throw new RemoteException();
	//   70  146:new             #25  <Class RemoteException>
	//   71  149:dup             
	//   72  150:invokespecial   #115 <Method void RemoteException()>
	//   73  153:athrow          
			}
		}
	//*  74  154:aload_0         
	//*  75  155:aload_1         
	//*  76  156:invokespecial   #118 <Method zzxq zzbp(String)>
	//*  77  159:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return zzbp(s);
		}
	//*  78  160:astore_2        
	//*  79  161:goto            154
	}

	private final zzxq zzbp(String s)
		throws RemoteException
	{
		Object obj;
		zzane.zzck("Reflection failed, retrying using direct instantiation");
	//    0    0:ldc1            #123 <String "Reflection failed, retrying using direct instantiation">
	//    1    2:invokestatic    #126 <Method void zzane.zzck(String)>
		if("com.google.ads.mediation.admob.AdMobAdapter".equals(((Object) (s))))
	//*   2    5:ldc1            #128 <String "com.google.ads.mediation.admob.AdMobAdapter">
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*   5   11:ifeq            29
			return ((zzxq) (new zzyk(((com.google.android.gms.ads.mediation.MediationAdapter) (new AdMobAdapter())))));
	//    6   14:new             #78  <Class zzyk>
	//    7   17:dup             
	//    8   18:new             #134 <Class AdMobAdapter>
	//    9   21:dup             
	//   10   22:invokespecial   #135 <Method void AdMobAdapter()>
	//   11   25:invokespecial   #81  <Method void zzyk(com.google.android.gms.ads.mediation.MediationAdapter)>
	//   12   28:areturn         
		if("com.google.ads.mediation.AdUrlAdapter".equals(((Object) (s))))
	//*  13   29:ldc1            #137 <String "com.google.ads.mediation.AdUrlAdapter">
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  16   35:ifeq            53
			return ((zzxq) (new zzyk(((com.google.android.gms.ads.mediation.MediationAdapter) (new AdUrlAdapter())))));
	//   17   38:new             #78  <Class zzyk>
	//   18   41:dup             
	//   19   42:new             #139 <Class AdUrlAdapter>
	//   20   45:dup             
	//   21   46:invokespecial   #140 <Method void AdUrlAdapter()>
	//   22   49:invokespecial   #81  <Method void zzyk(com.google.android.gms.ads.mediation.MediationAdapter)>
	//   23   52:areturn         
		if("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(((Object) (s))))
	//*  24   53:ldc1            #142 <String "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter">
	//*  25   55:aload_1         
	//*  26   56:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  27   59:ifeq            77
			return ((zzxq) (new zzyk(((com.google.android.gms.ads.mediation.MediationAdapter) (new CustomEventAdapter())))));
	//   28   62:new             #78  <Class zzyk>
	//   29   65:dup             
	//   30   66:new             #144 <Class CustomEventAdapter>
	//   31   69:dup             
	//   32   70:invokespecial   #145 <Method void CustomEventAdapter()>
	//   33   73:invokespecial   #81  <Method void zzyk(com.google.android.gms.ads.mediation.MediationAdapter)>
	//   34   76:areturn         
		if(!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_168;
	//   35   77:ldc1            #147 <String "com.google.ads.mediation.customevent.CustomEventAdapter">
	//   36   79:aload_1         
	//   37   80:invokevirtual   #132 <Method boolean String.equals(Object)>
	//   38   83:ifeq            168
		obj = ((Object) (new com.google.ads.mediation.customevent.CustomEventAdapter()));
	//   39   86:new             #149 <Class com.google.ads.mediation.customevent.CustomEventAdapter>
	//   40   89:dup             
	//   41   90:invokespecial   #150 <Method void com.google.ads.mediation.customevent.CustomEventAdapter()>
	//   42   93:astore_2        
		obj = ((Object) (new zzyp(((MediationAdapter) (obj)), ((NetworkExtras) ((CustomEventExtras)zzbuo.get(((Object) (((com.google.ads.mediation.customevent.CustomEventAdapter) (obj)).getAdditionalParametersType()))))))));
	//   43   94:new             #57  <Class zzyp>
	//   44   97:dup             
	//   45   98:aload_2         
	//   46   99:aload_0         
	//   47  100:getfield        #59  <Field Map zzbuo>
	//   48  103:aload_2         
	//   49  104:invokevirtual   #151 <Method Class com.google.ads.mediation.customevent.CustomEventAdapter.getAdditionalParametersType()>
	//   50  107:invokeinterface #69  <Method Object Map.get(Object)>
	//   51  112:checkcast       #153 <Class CustomEventExtras>
	//   52  115:invokespecial   #74  <Method void zzyp(MediationAdapter, NetworkExtras)>
	//   53  118:astore_2        
		return ((zzxq) (obj));
	//   54  119:aload_2         
	//   55  120:areturn         
		Throwable throwable;
		throwable;
	//   56  121:astore_2        
		StringBuilder stringbuilder = new StringBuilder(43 + String.valueOf(((Object) (s))).length());
	//   57  122:new             #83  <Class StringBuilder>
	//   58  125:dup             
	//   59  126:bipush          43
	//   60  128:aload_1         
	//   61  129:invokestatic    #89  <Method String String.valueOf(Object)>
	//   62  132:invokevirtual   #93  <Method int String.length()>
	//   63  135:iadd            
	//   64  136:invokespecial   #96  <Method void StringBuilder(int)>
	//   65  139:astore_3        
		stringbuilder.append("Could not instantiate mediation adapter: ");
	//   66  140:aload_3         
	//   67  141:ldc1            #98  <String "Could not instantiate mediation adapter: ">
	//   68  143:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   69  146:pop             
		stringbuilder.append(s);
	//   70  147:aload_3         
	//   71  148:aload_1         
	//   72  149:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   73  152:pop             
		stringbuilder.append(". ");
	//   74  153:aload_3         
	//   75  154:ldc1            #155 <String ". ">
	//   76  156:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   77  159:pop             
		zzane.zzc(stringbuilder.toString(), throwable);
	//   78  160:aload_3         
	//   79  161:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   80  164:aload_2         
	//   81  165:invokestatic    #159 <Method void zzane.zzc(String, Throwable)>
		throw new RemoteException();
	//   82  168:new             #25  <Class RemoteException>
	//   83  171:dup             
	//   84  172:invokespecial   #115 <Method void RemoteException()>
	//   85  175:athrow          
	}

	public final zzxq zzbm(String s)
		throws RemoteException
	{
		return zzbo(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #162 <Method zzxq zzbo(String)>
	//    3    5:areturn         
	}

	public final boolean zzbn(String s)
		throws RemoteException
	{
		Throwable throwable;
		boolean flag;
		StringBuilder stringbuilder;
		try
		{
			flag = ((Class) (com/google/android/gms/ads/mediation/customevent/CustomEvent)).isAssignableFrom(Class.forName(s, false, ((Class) (com/google/android/gms/internal/ads/zzxm)).getClassLoader()));
	//    0    0:ldc1            #166 <Class CustomEvent>
	//    1    2:aload_1         
	//    2    3:iconst_0        
	//    3    4:ldc1            #2   <Class zzxm>
	//    4    6:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
	//    5    9:invokestatic    #37  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    6   12:invokevirtual   #43  <Method boolean Class.isAssignableFrom(Class)>
	//    7   15:istore_2        
		}
	//*   8   16:iload_2         
	//*   9   17:ireturn         
	//*  10   18:new             #83  <Class StringBuilder>
	//*  11   21:dup             
	//*  12   22:bipush          80
	//*  13   24:aload_1         
	//*  14   25:invokestatic    #89  <Method String String.valueOf(Object)>
	//*  15   28:invokevirtual   #93  <Method int String.length()>
	//*  16   31:iadd            
	//*  17   32:invokespecial   #96  <Method void StringBuilder(int)>
	//*  18   35:astore_3        
	//*  19   36:aload_3         
	//*  20   37:ldc1            #168 <String "Could not load custom event implementation class: ">
	//*  21   39:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*  22   42:pop             
	//*  23   43:aload_3         
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*  26   48:pop             
	//*  27   49:aload_3         
	//*  28   50:ldc1            #170 <String ", assuming old implementation.">
	//*  29   52:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*  30   55:pop             
	//*  31   56:aload_3         
	//*  32   57:invokevirtual   #108 <Method String StringBuilder.toString()>
	//*  33   60:invokestatic    #114 <Method void zzane.zzdk(String)>
	//*  34   63:iconst_0        
	//*  35   64:ireturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			stringbuilder = new StringBuilder(80 + String.valueOf(((Object) (s))).length());
			stringbuilder.append("Could not load custom event implementation class: ");
			stringbuilder.append(s);
			stringbuilder.append(", assuming old implementation.");
			zzane.zzdk(stringbuilder.toString());
			return false;
		}
		return flag;
	//*  36   65:astore_3        
	//*  37   66:goto            18
	}

	public final zzzj zzbq(String s)
		throws RemoteException
	{
		return zzzo.zzbs(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #175 <Method zzzj zzzo.zzbs(String)>
	//    2    4:areturn         
	}

	public final void zzj(Map map)
	{
		zzbuo = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field Map zzbuo>
	//    3    5:return          
	}

	private static final zzzo zzbup = new zzzo();
	private Map zzbuo;

	static 
	{
	//    0    0:new             #14  <Class zzzo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void zzzo()>
	//    3    7:putstatic       #19  <Field zzzo zzbup>
	//*   4   10:return          
	}
}
