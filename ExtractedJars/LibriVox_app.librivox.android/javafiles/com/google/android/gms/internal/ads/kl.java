// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.h;
import com.google.ads.mediation.n;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.customevent.f;
import java.lang.reflect.Constructor;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			kn, mk, lp, lk, 
//			aag, kp, mf

public final class kl extends kn
{

	public kl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void kn()>
	//    2    4:return          
	}

	private final kp d(String s)
	{
		Throwable throwable;
		try
		{
			Object obj = ((Object) (Class.forName(s, false, ((Class) (com/google/android/gms/internal/ads/kl)).getClassLoader())));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:ldc1            #2   <Class kl>
	//    3    4:invokevirtual   #30  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokestatic    #34  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    5   10:astore_2        
			if(((Class) (com/google/ads/mediation/h)).isAssignableFrom(((Class) (obj))))
	//*   6   11:ldc1            #36  <Class h>
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #40  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   17:ifeq            66
			{
				obj = ((Object) ((h)((Class) (obj)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
	//   10   20:aload_2         
	//   11   21:iconst_0        
	//   12   22:anewarray       Class[]
	//   13   25:invokevirtual   #44  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   14   28:iconst_0        
	//   15   29:anewarray       Object[]
	//   16   32:invokevirtual   #52  <Method Object Constructor.newInstance(Object[])>
	//   17   35:checkcast       #36  <Class h>
	//   18   38:astore_2        
				return ((kp) (new lp(((h) (obj)), (n)a.get(((Object) (((h) (obj)).getAdditionalParametersType()))))));
	//   19   39:new             #54  <Class lp>
	//   20   42:dup             
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #56  <Field Map a>
	//   24   48:aload_2         
	//   25   49:invokeinterface #60  <Method Class h.getAdditionalParametersType()>
	//   26   54:invokeinterface #66  <Method Object Map.get(Object)>
	//   27   59:checkcast       #68  <Class n>
	//   28   62:invokespecial   #71  <Method void lp(h, n)>
	//   29   65:areturn         
			}
			if(((Class) (com/google/android/gms/ads/mediation/b)).isAssignableFrom(((Class) (obj))))
	//*  30   66:ldc1            #73  <Class b>
	//*  31   68:aload_2         
	//*  32   69:invokevirtual   #40  <Method boolean Class.isAssignableFrom(Class)>
	//*  33   72:ifeq            101
			{
				return ((kp) (new lk((b)((Class) (obj)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]))));
	//   34   75:new             #75  <Class lk>
	//   35   78:dup             
	//   36   79:aload_2         
	//   37   80:iconst_0        
	//   38   81:anewarray       Class[]
	//   39   84:invokevirtual   #44  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   40   87:iconst_0        
	//   41   88:anewarray       Object[]
	//   42   91:invokevirtual   #52  <Method Object Constructor.newInstance(Object[])>
	//   43   94:checkcast       #73  <Class b>
	//   44   97:invokespecial   #78  <Method void lk(b)>
	//   45  100:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 64);
	//   46  101:new             #80  <Class StringBuilder>
	//   47  104:dup             
	//   48  105:aload_1         
	//   49  106:invokestatic    #86  <Method String String.valueOf(Object)>
	//   50  109:invokevirtual   #90  <Method int String.length()>
	//   51  112:bipush          64
	//   52  114:iadd            
	//   53  115:invokespecial   #93  <Method void StringBuilder(int)>
	//   54  118:astore_2        
				stringbuilder.append("Could not instantiate mediation adapter: ");
	//   55  119:aload_2         
	//   56  120:ldc1            #95  <String "Could not instantiate mediation adapter: ">
	//   57  122:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   58  125:pop             
				stringbuilder.append(s);
	//   59  126:aload_2         
	//   60  127:aload_1         
	//   61  128:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   62  131:pop             
				stringbuilder.append(" (not a valid adapter).");
	//   63  132:aload_2         
	//   64  133:ldc1            #101 <String " (not a valid adapter).">
	//   65  135:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
				aag.e(stringbuilder.toString());
	//   67  139:aload_2         
	//   68  140:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   69  143:invokestatic    #111 <Method void aag.e(String)>
				throw new RemoteException();
	//   70  146:new             #113 <Class RemoteException>
	//   71  149:dup             
	//   72  150:invokespecial   #114 <Method void RemoteException()>
	//   73  153:athrow          
			}
		}
	//*  74  154:aload_0         
	//*  75  155:aload_1         
	//*  76  156:invokespecial   #116 <Method kp e(String)>
	//*  77  159:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return e(s);
		}
	//*  78  160:astore_2        
	//*  79  161:goto            154
	}

	private final kp e(String s)
	{
		Object obj;
		com.google.android.gms.internal.ads.aag.b("Reflection failed, retrying using direct instantiation");
	//    0    0:ldc1            #118 <String "Reflection failed, retrying using direct instantiation">
	//    1    2:invokestatic    #120 <Method void com.google.android.gms.internal.ads.aag.b(String)>
		if("com.google.ads.mediation.admob.AdMobAdapter".equals(((Object) (s))))
	//*   2    5:ldc1            #122 <String "com.google.ads.mediation.admob.AdMobAdapter">
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #126 <Method boolean String.equals(Object)>
	//*   5   11:ifeq            29
			return ((kp) (new lk(((b) (new AdMobAdapter())))));
	//    6   14:new             #75  <Class lk>
	//    7   17:dup             
	//    8   18:new             #128 <Class AdMobAdapter>
	//    9   21:dup             
	//   10   22:invokespecial   #129 <Method void AdMobAdapter()>
	//   11   25:invokespecial   #78  <Method void lk(b)>
	//   12   28:areturn         
		if("com.google.ads.mediation.AdUrlAdapter".equals(((Object) (s))))
	//*  13   29:ldc1            #131 <String "com.google.ads.mediation.AdUrlAdapter">
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #126 <Method boolean String.equals(Object)>
	//*  16   35:ifeq            53
			return ((kp) (new lk(((b) (new AdUrlAdapter())))));
	//   17   38:new             #75  <Class lk>
	//   18   41:dup             
	//   19   42:new             #133 <Class AdUrlAdapter>
	//   20   45:dup             
	//   21   46:invokespecial   #134 <Method void AdUrlAdapter()>
	//   22   49:invokespecial   #78  <Method void lk(b)>
	//   23   52:areturn         
		if("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(((Object) (s))))
	//*  24   53:ldc1            #136 <String "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter">
	//*  25   55:aload_1         
	//*  26   56:invokevirtual   #126 <Method boolean String.equals(Object)>
	//*  27   59:ifeq            77
			return ((kp) (new lk(((b) (new CustomEventAdapter())))));
	//   28   62:new             #75  <Class lk>
	//   29   65:dup             
	//   30   66:new             #138 <Class CustomEventAdapter>
	//   31   69:dup             
	//   32   70:invokespecial   #139 <Method void CustomEventAdapter()>
	//   33   73:invokespecial   #78  <Method void lk(b)>
	//   34   76:areturn         
		if(!"com.google.ads.mediation.customevent.CustomEventAdapter".equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_168;
	//   35   77:ldc1            #141 <String "com.google.ads.mediation.customevent.CustomEventAdapter">
	//   36   79:aload_1         
	//   37   80:invokevirtual   #126 <Method boolean String.equals(Object)>
	//   38   83:ifeq            168
		obj = ((Object) (new com.google.ads.mediation.customevent.CustomEventAdapter()));
	//   39   86:new             #143 <Class com.google.ads.mediation.customevent.CustomEventAdapter>
	//   40   89:dup             
	//   41   90:invokespecial   #144 <Method void com.google.ads.mediation.customevent.CustomEventAdapter()>
	//   42   93:astore_2        
		obj = ((Object) (new lp(((h) (obj)), ((n) ((f)a.get(((Object) (((com.google.ads.mediation.customevent.CustomEventAdapter) (obj)).getAdditionalParametersType()))))))));
	//   43   94:new             #54  <Class lp>
	//   44   97:dup             
	//   45   98:aload_2         
	//   46   99:aload_0         
	//   47  100:getfield        #56  <Field Map a>
	//   48  103:aload_2         
	//   49  104:invokevirtual   #145 <Method Class com.google.ads.mediation.customevent.CustomEventAdapter.getAdditionalParametersType()>
	//   50  107:invokeinterface #66  <Method Object Map.get(Object)>
	//   51  112:checkcast       #147 <Class f>
	//   52  115:invokespecial   #71  <Method void lp(h, n)>
	//   53  118:astore_2        
		return ((kp) (obj));
	//   54  119:aload_2         
	//   55  120:areturn         
		Throwable throwable;
		throwable;
	//   56  121:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 43);
	//   57  122:new             #80  <Class StringBuilder>
	//   58  125:dup             
	//   59  126:aload_1         
	//   60  127:invokestatic    #86  <Method String String.valueOf(Object)>
	//   61  130:invokevirtual   #90  <Method int String.length()>
	//   62  133:bipush          43
	//   63  135:iadd            
	//   64  136:invokespecial   #93  <Method void StringBuilder(int)>
	//   65  139:astore_3        
		stringbuilder.append("Could not instantiate mediation adapter: ");
	//   66  140:aload_3         
	//   67  141:ldc1            #95  <String "Could not instantiate mediation adapter: ">
	//   68  143:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   69  146:pop             
		stringbuilder.append(s);
	//   70  147:aload_3         
	//   71  148:aload_1         
	//   72  149:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   73  152:pop             
		stringbuilder.append(". ");
	//   74  153:aload_3         
	//   75  154:ldc1            #149 <String ". ">
	//   76  156:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   77  159:pop             
		aag.c(stringbuilder.toString(), throwable);
	//   78  160:aload_3         
	//   79  161:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   80  164:aload_2         
	//   81  165:invokestatic    #153 <Method void aag.c(String, Throwable)>
		throw new RemoteException();
	//   82  168:new             #113 <Class RemoteException>
	//   83  171:dup             
	//   84  172:invokespecial   #114 <Method void RemoteException()>
	//   85  175:athrow          
	}

	public final kp a(String s)
	{
		return d(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method kp d(String)>
	//    3    5:areturn         
	}

	public final void a(Map map)
	{
		a = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Map a>
	//    3    5:return          
	}

	public final boolean b(String s)
	{
		Throwable throwable;
		boolean flag;
		StringBuilder stringbuilder;
		try
		{
			flag = ((Class) (com/google/android/gms/ads/mediation/customevent/a)).isAssignableFrom(Class.forName(s, false, ((Class) (com/google/android/gms/internal/ads/kl)).getClassLoader()));
	//    0    0:ldc1            #159 <Class a>
	//    1    2:aload_1         
	//    2    3:iconst_0        
	//    3    4:ldc1            #2   <Class kl>
	//    4    6:invokevirtual   #30  <Method ClassLoader Class.getClassLoader()>
	//    5    9:invokestatic    #34  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    6   12:invokevirtual   #40  <Method boolean Class.isAssignableFrom(Class)>
	//    7   15:istore_2        
		}
	//*   8   16:iload_2         
	//*   9   17:ireturn         
	//*  10   18:new             #80  <Class StringBuilder>
	//*  11   21:dup             
	//*  12   22:aload_1         
	//*  13   23:invokestatic    #86  <Method String String.valueOf(Object)>
	//*  14   26:invokevirtual   #90  <Method int String.length()>
	//*  15   29:bipush          80
	//*  16   31:iadd            
	//*  17   32:invokespecial   #93  <Method void StringBuilder(int)>
	//*  18   35:astore_3        
	//*  19   36:aload_3         
	//*  20   37:ldc1            #161 <String "Could not load custom event implementation class: ">
	//*  21   39:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//*  22   42:pop             
	//*  23   43:aload_3         
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//*  26   48:pop             
	//*  27   49:aload_3         
	//*  28   50:ldc1            #163 <String ", assuming old implementation.">
	//*  29   52:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//*  30   55:pop             
	//*  31   56:aload_3         
	//*  32   57:invokevirtual   #105 <Method String StringBuilder.toString()>
	//*  33   60:invokestatic    #111 <Method void aag.e(String)>
	//*  34   63:iconst_0        
	//*  35   64:ireturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 80);
			stringbuilder.append("Could not load custom event implementation class: ");
			stringbuilder.append(s);
			stringbuilder.append(", assuming old implementation.");
			aag.e(stringbuilder.toString());
			return false;
		}
		return flag;
	//*  36   65:astore_3        
	//*  37   66:goto            18
	}

	public final mf c(String s)
	{
		return com.google.android.gms.internal.ads.mk.a(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #166 <Method mf com.google.android.gms.internal.ads.mk.a(String)>
	//    2    4:areturn         
	}

	private static final mk b = new mk();
	private Map a;

	static 
	{
	//    0    0:new             #13  <Class mk>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void mk()>
	//    3    7:putstatic       #18  <Field mk b>
	//*   4   10:return          
	}
}
