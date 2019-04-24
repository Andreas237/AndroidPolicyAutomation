// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzacs, zzacu, zzacz, zzacn, 
//			zzacw

public static class zzacs$zza extends zza
{

	public static zzacs$zza zza(String s, int i, zzacs$zzb zzacs$zzb1, boolean flag)
	{
		return new zzacs$zza(7, flag, 0, false, s, i, ((Class) (null)), zzacs$zzb1);
	//    0    0:new             #2   <Class zzacs$zza>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iload_3         
	//    4    7:iconst_0        
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:aconst_null     
	//    9   12:aload_2         
	//   10   13:invokespecial   #81  <Method void zzacs$zza(int, boolean, int, boolean, String, int, Class, zzacs$zzb)>
	//   11   16:areturn         
	}

	public static zzacs$zza zza(String s, int i, Class class1)
	{
		return new zzacs$zza(11, false, 11, false, s, i, class1, ((zzacs$zzb) (null)));
	//    0    0:new             #2   <Class zzacs$zza>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_0        
	//    4    7:bipush          11
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzacs$zza(int, boolean, int, boolean, String, int, Class, zzacs$zzb)>
	//   11   17:areturn         
	}

	public static zzacs$zza zzb(String s, int i, Class class1)
	{
		return new zzacs$zza(11, true, 11, true, s, i, class1, ((zzacs$zzb) (null)));
	//    0    0:new             #2   <Class zzacs$zza>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_1        
	//    4    7:bipush          11
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzacs$zza(int, boolean, int, boolean, String, int, Class, zzacs$zzb)>
	//   11   17:areturn         
	}

	static zzacs$zzb zzc(zzacs$zza zzacs$zza1)
	{
		return zzacs$zza1.zzaHg;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field zzacs$zzb zzaHg>
	//    2    4:areturn         
	}

	public static zzacs$zza zzk(String s, int i)
	{
		return new zzacs$zza(0, false, 0, false, s, i, ((Class) (null)), ((zzacs$zzb) (null)));
	//    0    0:new             #2   <Class zzacs$zza>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #81  <Method void zzacs$zza(int, boolean, int, boolean, String, int, Class, zzacs$zzb)>
	//   11   15:areturn         
	}

	public static zzacs$zza zzl(String s, int i)
	{
		return new zzacs$zza(6, false, 6, false, s, i, ((Class) (null)), ((zzacs$zzb) (null)));
	//    0    0:new             #2   <Class zzacs$zza>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:iconst_0        
	//    4    7:bipush          6
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzacs$zza(int, boolean, int, boolean, String, int, Class, zzacs$zzb)>
	//   11   17:areturn         
	}

	public static zzacs$zza zzm(String s, int i)
	{
		return new zzacs$zza(7, false, 7, false, s, i, ((Class) (null)), ((zzacs$zzb) (null)));
	//    0    0:new             #2   <Class zzacs$zza>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_0        
	//    4    7:bipush          7
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzacs$zza(int, boolean, int, boolean, String, int, Class, zzacs$zzb)>
	//   11   17:areturn         
	}

	public Object convertBack(Object obj)
	{
		return zzaHg.convertBack(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field zzacs$zzb zzaHg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #101 <Method Object zzacs$zzb.convertBack(Object)>
	//    4   10:areturn         
	}

	public int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public String toString()
	{
		com.google.android.gms.common.internal.zzaa.zza zza1 = zzaa.zzv(((Object) (this))).zzg("versionCode", ((Object) (Integer.valueOf(zzaiI)))).zzg("typeIn", ((Object) (Integer.valueOf(zzaGX)))).zzg("typeInArray", ((Object) (Boolean.valueOf(zzaGY)))).zzg("typeOut", ((Object) (Integer.valueOf(zzaGZ)))).zzg("typeOutArray", ((Object) (Boolean.valueOf(zzaHa)))).zzg("outputFieldName", ((Object) (zzaHb))).zzg("safeParcelFieldId", ((Object) (Integer.valueOf(zzaHc)))).zzg("concreteTypeName", ((Object) (zzyz())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #111 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #113 <String "versionCode">
	//    3    6:aload_0         
	//    4    7:getfield        #43  <Field int zzaiI>
	//    5   10:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//    6   13:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #127 <String "typeIn">
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field int zzaGX>
	//   10   22:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   11   25:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:ldc1            #129 <String "typeInArray">
	//   13   30:aload_0         
	//   14   31:getfield        #47  <Field boolean zzaGY>
	//   15   34:invokestatic    #134 <Method Boolean Boolean.valueOf(boolean)>
	//   16   37:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   17   40:ldc1            #136 <String "typeOut">
	//   18   42:aload_0         
	//   19   43:getfield        #49  <Field int zzaGZ>
	//   20   46:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   21   49:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   22   52:ldc1            #138 <String "typeOutArray">
	//   23   54:aload_0         
	//   24   55:getfield        #51  <Field boolean zzaHa>
	//   25   58:invokestatic    #134 <Method Boolean Boolean.valueOf(boolean)>
	//   26   61:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   27   64:ldc1            #140 <String "outputFieldName">
	//   28   66:aload_0         
	//   29   67:getfield        #53  <Field String zzaHb>
	//   30   70:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   31   73:ldc1            #142 <String "safeParcelFieldId">
	//   32   75:aload_0         
	//   33   76:getfield        #55  <Field int zzaHc>
	//   34   79:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   35   82:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   36   85:ldc1            #144 <String "concreteTypeName">
	//   37   87:aload_0         
	//   38   88:invokevirtual   #147 <Method String zzyz()>
	//   39   91:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   40   94:astore_1        
		Class class1 = zzyy();
	//   41   95:aload_0         
	//   42   96:invokevirtual   #151 <Method Class zzyy()>
	//   43   99:astore_2        
		if(class1 != null)
	//*  44  100:aload_2         
	//*  45  101:ifnull          115
			zza1.zzg("concreteType.class", ((Object) (class1.getCanonicalName())));
	//   46  104:aload_1         
	//   47  105:ldc1            #153 <String "concreteType.class">
	//   48  107:aload_2         
	//   49  108:invokevirtual   #76  <Method String Class.getCanonicalName()>
	//   50  111:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   51  114:pop             
		if(zzaHg != null)
	//*  52  115:aload_0         
	//*  53  116:getfield        #63  <Field zzacs$zzb zzaHg>
	//*  54  119:ifnull          139
			zza1.zzg("converterName", ((Object) (((Object) (zzaHg)).getClass().getCanonicalName())));
	//   55  122:aload_1         
	//   56  123:ldc1            #155 <String "converterName">
	//   57  125:aload_0         
	//   58  126:getfield        #63  <Field zzacs$zzb zzaHg>
	//   59  129:invokevirtual   #160 <Method Class Object.getClass()>
	//   60  132:invokevirtual   #76  <Method String Class.getCanonicalName()>
	//   61  135:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   62  138:pop             
		return zza1.toString();
	//   63  139:aload_1         
	//   64  140:invokevirtual   #162 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   65  143:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzacu.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #167 <Method void com.google.android.gms.internal.zzacu.zza(zzacs$zza, Parcel, int)>
	//    4    6:return          
	}

	public void zza(zzacw zzacw1)
	{
		zzaHf = zzacw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #170 <Field zzacw zzaHf>
	//    3    5:return          
	}

	public boolean zzyA()
	{
		return zzaHg != null;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field zzacs$zzb zzaHg>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	zzacn zzyB()
	{
		if(zzaHg == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field zzacs$zzb zzaHg>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return com.google.android.gms.internal.zzacn.zza(zzaHg);
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field zzacs$zzb zzaHg>
	//    7   13:invokestatic    #177 <Method zzacn com.google.android.gms.internal.zzacn.zza(zzacs$zzb)>
	//    8   16:areturn         
	}

	public Map zzyC()
	{
		zzac.zzw(((Object) (zzaHe)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String zzaHe>
	//    2    4:invokestatic    #184 <Method Object zzac.zzw(Object)>
	//    3    7:pop             
		zzac.zzw(((Object) (zzaHf)));
	//    4    8:aload_0         
	//    5    9:getfield        #170 <Field zzacw zzaHf>
	//    6   12:invokestatic    #184 <Method Object zzac.zzw(Object)>
	//    7   15:pop             
		return zzaHf.zzdw(zzaHe);
	//    8   16:aload_0         
	//    9   17:getfield        #170 <Field zzacw zzaHf>
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field String zzaHe>
	//   12   24:invokevirtual   #190 <Method Map zzacw.zzdw(String)>
	//   13   27:areturn         
	}

	public int zzys()
	{
		return zzaGX;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int zzaGX>
	//    2    4:ireturn         
	}

	public boolean zzyt()
	{
		return zzaGY;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean zzaGY>
	//    2    4:ireturn         
	}

	public int zzyu()
	{
		return zzaGZ;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int zzaGZ>
	//    2    4:ireturn         
	}

	public boolean zzyv()
	{
		return zzaHa;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean zzaHa>
	//    2    4:ireturn         
	}

	public String zzyw()
	{
		return zzaHb;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String zzaHb>
	//    2    4:areturn         
	}

	public int zzyx()
	{
		return zzaHc;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int zzaHc>
	//    2    4:ireturn         
	}

	public Class zzyy()
	{
		return zzaHd;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Class zzaHd>
	//    2    4:areturn         
	}

	String zzyz()
	{
		if(zzaHe == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field String zzaHe>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaHe;
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field String zzaHe>
	//    7   13:areturn         
	}

	public static final zzacu CREATOR = new zzacu();
	protected final int zzaGX;
	protected final boolean zzaGY;
	protected final int zzaGZ;
	protected final boolean zzaHa;
	protected final String zzaHb;
	protected final int zzaHc;
	protected final Class zzaHd;
	protected final String zzaHe;
	private zzacw zzaHf;
	private zzacs$zzb zzaHg;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #33  <Class zzacu>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void zzacu()>
	//    3    7:putstatic       #38  <Field zzacu CREATOR>
	//*   4   10:return          
	}

	zzacs$zza(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
			String s1, zzacn zzacn1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #43  <Field int zzaiI>
		zzaGX = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #45  <Field int zzaGX>
		zzaGY = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #47  <Field boolean zzaGY>
		zzaGZ = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #49  <Field int zzaGZ>
		zzaHa = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #51  <Field boolean zzaHa>
		zzaHb = s;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #53  <Field String zzaHb>
		zzaHc = l;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #55  <Field int zzaHc>
		if(s1 == null)
	//*  23   43:aload           8
	//*  24   45:ifnonnull       61
		{
			zzaHd = null;
	//   25   48:aload_0         
	//   26   49:aconst_null     
	//   27   50:putfield        #57  <Field Class zzaHd>
			zzaHe = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #59  <Field String zzaHe>
		} else
	//*  31   58:goto            73
		{
			zzaHd = com/google/android/gms/internal/zzacz;
	//   32   61:aload_0         
	//   33   62:ldc1            #61  <Class zzacz>
	//   34   64:putfield        #57  <Field Class zzaHd>
			zzaHe = s1;
	//   35   67:aload_0         
	//   36   68:aload           8
	//   37   70:putfield        #59  <Field String zzaHe>
		}
		if(zzacn1 == null)
	//*  38   73:aload           9
	//*  39   75:ifnonnull       84
		{
			zzaHg = null;
	//   40   78:aload_0         
	//   41   79:aconst_null     
	//   42   80:putfield        #63  <Field zzacs$zzb zzaHg>
			return;
	//   43   83:return          
		} else
		{
			zzaHg = zzacn1.zzyp();
	//   44   84:aload_0         
	//   45   85:aload           9
	//   46   87:invokevirtual   #69  <Method zzacs$zzb zzacn.zzyp()>
	//   47   90:putfield        #63  <Field zzacs$zzb zzaHg>
			return;
	//   48   93:return          
		}
	}

	protected zzacs$zza(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
			zzacs$zzb zzacs$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #43  <Field int zzaiI>
		zzaGX = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #45  <Field int zzaGX>
		zzaGY = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #47  <Field boolean zzaGY>
		zzaGZ = j;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #49  <Field int zzaGZ>
		zzaHa = flag1;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #51  <Field boolean zzaHa>
		zzaHb = s;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #53  <Field String zzaHb>
		zzaHc = k;
	//   20   36:aload_0         
	//   21   37:iload           6
	//   22   39:putfield        #55  <Field int zzaHc>
		zzaHd = class1;
	//   23   42:aload_0         
	//   24   43:aload           7
	//   25   45:putfield        #57  <Field Class zzaHd>
		if(class1 == null)
	//*  26   48:aload           7
	//*  27   50:ifnonnull       61
			zzaHe = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #59  <Field String zzaHe>
		else
	//*  31   58:goto            70
			zzaHe = class1.getCanonicalName();
	//   32   61:aload_0         
	//   33   62:aload           7
	//   34   64:invokevirtual   #76  <Method String Class.getCanonicalName()>
	//   35   67:putfield        #59  <Field String zzaHe>
		zzaHg = zzacs$zzb1;
	//   36   70:aload_0         
	//   37   71:aload           8
	//   38   73:putfield        #63  <Field zzacs$zzb zzaHg>
	//   39   76:return          
	}
}
