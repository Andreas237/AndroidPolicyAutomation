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
//			zzack, zzacm, zzacr, zzacf, 
//			zzaco

public static class zzack$zza extends zza
{

	public static zzack$zza zza(String s, int i, zzack$zzb zzack$zzb1, boolean flag)
	{
		return new zzack$zza(7, flag, 0, false, s, i, ((Class) (null)), zzack$zzb1);
	//    0    0:new             #2   <Class zzack$zza>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iload_3         
	//    4    7:iconst_0        
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:aconst_null     
	//    9   12:aload_2         
	//   10   13:invokespecial   #81  <Method void zzack$zza(int, boolean, int, boolean, String, int, Class, zzack$zzb)>
	//   11   16:areturn         
	}

	public static zzack$zza zza(String s, int i, Class class1)
	{
		return new zzack$zza(11, false, 11, false, s, i, class1, ((zzack$zzb) (null)));
	//    0    0:new             #2   <Class zzack$zza>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_0        
	//    4    7:bipush          11
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzack$zza(int, boolean, int, boolean, String, int, Class, zzack$zzb)>
	//   11   17:areturn         
	}

	public static zzack$zza zzb(String s, int i, Class class1)
	{
		return new zzack$zza(11, true, 11, true, s, i, class1, ((zzack$zzb) (null)));
	//    0    0:new             #2   <Class zzack$zza>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_1        
	//    4    7:bipush          11
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzack$zza(int, boolean, int, boolean, String, int, Class, zzack$zzb)>
	//   11   17:areturn         
	}

	static zzack$zzb zzc(zzack$zza zzack$zza1)
	{
		return zzack$zza1.zzaFJ;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field zzack$zzb zzaFJ>
	//    2    4:areturn         
	}

	public static zzack$zza zzk(String s, int i)
	{
		return new zzack$zza(0, false, 0, false, s, i, ((Class) (null)), ((zzack$zzb) (null)));
	//    0    0:new             #2   <Class zzack$zza>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #81  <Method void zzack$zza(int, boolean, int, boolean, String, int, Class, zzack$zzb)>
	//   11   15:areturn         
	}

	public static zzack$zza zzl(String s, int i)
	{
		return new zzack$zza(6, false, 6, false, s, i, ((Class) (null)), ((zzack$zzb) (null)));
	//    0    0:new             #2   <Class zzack$zza>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:iconst_0        
	//    4    7:bipush          6
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzack$zza(int, boolean, int, boolean, String, int, Class, zzack$zzb)>
	//   11   17:areturn         
	}

	public static zzack$zza zzm(String s, int i)
	{
		return new zzack$zza(7, false, 7, false, s, i, ((Class) (null)), ((zzack$zzb) (null)));
	//    0    0:new             #2   <Class zzack$zza>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_0        
	//    4    7:bipush          7
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #81  <Method void zzack$zza(int, boolean, int, boolean, String, int, Class, zzack$zzb)>
	//   11   17:areturn         
	}

	public Object convertBack(Object obj)
	{
		return zzaFJ.convertBack(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field zzack$zzb zzaFJ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #101 <Method Object zzack$zzb.convertBack(Object)>
	//    4   10:areturn         
	}

	public int getVersionCode()
	{
		return mVersionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mVersionCode>
	//    2    4:ireturn         
	}

	public String toString()
	{
		com.google.android.gms.common.internal.zzaa.zza zza1 = zzaa.zzv(((Object) (this))).zzg("versionCode", ((Object) (Integer.valueOf(mVersionCode)))).zzg("typeIn", ((Object) (Integer.valueOf(zzaFA)))).zzg("typeInArray", ((Object) (Boolean.valueOf(zzaFB)))).zzg("typeOut", ((Object) (Integer.valueOf(zzaFC)))).zzg("typeOutArray", ((Object) (Boolean.valueOf(zzaFD)))).zzg("outputFieldName", ((Object) (zzaFE))).zzg("safeParcelFieldId", ((Object) (Integer.valueOf(zzaFF)))).zzg("concreteTypeName", ((Object) (zzxS())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #111 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #113 <String "versionCode">
	//    3    6:aload_0         
	//    4    7:getfield        #43  <Field int mVersionCode>
	//    5   10:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//    6   13:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #127 <String "typeIn">
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field int zzaFA>
	//   10   22:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   11   25:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:ldc1            #129 <String "typeInArray">
	//   13   30:aload_0         
	//   14   31:getfield        #47  <Field boolean zzaFB>
	//   15   34:invokestatic    #134 <Method Boolean Boolean.valueOf(boolean)>
	//   16   37:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   17   40:ldc1            #136 <String "typeOut">
	//   18   42:aload_0         
	//   19   43:getfield        #49  <Field int zzaFC>
	//   20   46:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   21   49:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   22   52:ldc1            #138 <String "typeOutArray">
	//   23   54:aload_0         
	//   24   55:getfield        #51  <Field boolean zzaFD>
	//   25   58:invokestatic    #134 <Method Boolean Boolean.valueOf(boolean)>
	//   26   61:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   27   64:ldc1            #140 <String "outputFieldName">
	//   28   66:aload_0         
	//   29   67:getfield        #53  <Field String zzaFE>
	//   30   70:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   31   73:ldc1            #142 <String "safeParcelFieldId">
	//   32   75:aload_0         
	//   33   76:getfield        #55  <Field int zzaFF>
	//   34   79:invokestatic    #119 <Method Integer Integer.valueOf(int)>
	//   35   82:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   36   85:ldc1            #144 <String "concreteTypeName">
	//   37   87:aload_0         
	//   38   88:invokevirtual   #147 <Method String zzxS()>
	//   39   91:invokevirtual   #125 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   40   94:astore_1        
		Class class1 = zzxR();
	//   41   95:aload_0         
	//   42   96:invokevirtual   #151 <Method Class zzxR()>
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
		if(zzaFJ != null)
	//*  52  115:aload_0         
	//*  53  116:getfield        #61  <Field zzack$zzb zzaFJ>
	//*  54  119:ifnull          139
			zza1.zzg("converterName", ((Object) (((Object) (zzaFJ)).getClass().getCanonicalName())));
	//   55  122:aload_1         
	//   56  123:ldc1            #155 <String "converterName">
	//   57  125:aload_0         
	//   58  126:getfield        #61  <Field zzack$zzb zzaFJ>
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
		com.google.android.gms.internal.zzacm.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #167 <Method void com.google.android.gms.internal.zzacm.zza(zzack$zza, Parcel, int)>
	//    4    6:return          
	}

	public void zza(zzaco zzaco1)
	{
		zzaFI = zzaco1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #170 <Field zzaco zzaFI>
	//    3    5:return          
	}

	public int zzxL()
	{
		return zzaFA;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int zzaFA>
	//    2    4:ireturn         
	}

	public boolean zzxM()
	{
		return zzaFB;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean zzaFB>
	//    2    4:ireturn         
	}

	public int zzxN()
	{
		return zzaFC;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int zzaFC>
	//    2    4:ireturn         
	}

	public boolean zzxO()
	{
		return zzaFD;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean zzaFD>
	//    2    4:ireturn         
	}

	public String zzxP()
	{
		return zzaFE;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String zzaFE>
	//    2    4:areturn         
	}

	public int zzxQ()
	{
		return zzaFF;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int zzaFF>
	//    2    4:ireturn         
	}

	public Class zzxR()
	{
		return zzaFG;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Class zzaFG>
	//    2    4:areturn         
	}

	String zzxS()
	{
		if(zzaFH == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field String zzaFH>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaFH;
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field String zzaFH>
	//    7   13:areturn         
	}

	public boolean zzxT()
	{
		return zzaFJ != null;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field zzack$zzb zzaFJ>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	zzacf zzxU()
	{
		if(zzaFJ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field zzack$zzb zzaFJ>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return com.google.android.gms.internal.zzacf.zza(zzaFJ);
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field zzack$zzb zzaFJ>
	//    7   13:invokestatic    #184 <Method zzacf com.google.android.gms.internal.zzacf.zza(zzack$zzb)>
	//    8   16:areturn         
	}

	public Map zzxV()
	{
		zzac.zzw(((Object) (zzaFH)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String zzaFH>
	//    2    4:invokestatic    #191 <Method Object zzac.zzw(Object)>
	//    3    7:pop             
		zzac.zzw(((Object) (zzaFI)));
	//    4    8:aload_0         
	//    5    9:getfield        #170 <Field zzaco zzaFI>
	//    6   12:invokestatic    #191 <Method Object zzac.zzw(Object)>
	//    7   15:pop             
		return zzaFI.zzdA(zzaFH);
	//    8   16:aload_0         
	//    9   17:getfield        #170 <Field zzaco zzaFI>
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field String zzaFH>
	//   12   24:invokevirtual   #197 <Method Map zzaco.zzdA(String)>
	//   13   27:areturn         
	}

	public static final zzacm CREATOR = new zzacm();
	private final int mVersionCode;
	protected final int zzaFA;
	protected final boolean zzaFB;
	protected final int zzaFC;
	protected final boolean zzaFD;
	protected final String zzaFE;
	protected final int zzaFF;
	protected final Class zzaFG;
	protected final String zzaFH;
	private zzaco zzaFI;
	private zzack$zzb zzaFJ;

	static 
	{
	//    0    0:new             #33  <Class zzacm>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void zzacm()>
	//    3    7:putstatic       #38  <Field zzacm CREATOR>
	//*   4   10:return          
	}

	zzack$zza(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
			String s1, zzacf zzacf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #43  <Field int mVersionCode>
		zzaFA = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #45  <Field int zzaFA>
		zzaFB = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #47  <Field boolean zzaFB>
		zzaFC = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #49  <Field int zzaFC>
		zzaFD = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #51  <Field boolean zzaFD>
		zzaFE = s;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #53  <Field String zzaFE>
		zzaFF = l;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #55  <Field int zzaFF>
		if(s1 == null)
	//*  23   43:aload           8
	//*  24   45:ifnonnull       69
		{
			zzaFG = null;
	//   25   48:aload_0         
	//   26   49:aconst_null     
	//   27   50:putfield        #57  <Field Class zzaFG>
			zzaFH = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #59  <Field String zzaFH>
		} else
	//*  31   58:aload           9
	//*  32   60:ifnonnull       84
	//*  33   63:aload_0         
	//*  34   64:aconst_null     
	//*  35   65:putfield        #61  <Field zzack$zzb zzaFJ>
	//*  36   68:return          
		{
			zzaFG = com/google/android/gms/internal/zzacr;
	//   37   69:aload_0         
	//   38   70:ldc1            #63  <Class zzacr>
	//   39   72:putfield        #57  <Field Class zzaFG>
			zzaFH = s1;
	//   40   75:aload_0         
	//   41   76:aload           8
	//   42   78:putfield        #59  <Field String zzaFH>
		}
		if(zzacf1 == null)
		{
			zzaFJ = null;
			return;
		} else
	//*  43   81:goto            58
		{
			zzaFJ = zzacf1.zzxI();
	//   44   84:aload_0         
	//   45   85:aload           9
	//   46   87:invokevirtual   #69  <Method zzack$zzb zzacf.zzxI()>
	//   47   90:putfield        #61  <Field zzack$zzb zzaFJ>
			return;
	//   48   93:return          
		}
	}

	protected zzack$zza(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
			zzack$zzb zzack$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zza()>
		mVersionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #43  <Field int mVersionCode>
		zzaFA = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #45  <Field int zzaFA>
		zzaFB = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #47  <Field boolean zzaFB>
		zzaFC = j;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #49  <Field int zzaFC>
		zzaFD = flag1;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #51  <Field boolean zzaFD>
		zzaFE = s;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #53  <Field String zzaFE>
		zzaFF = k;
	//   20   36:aload_0         
	//   21   37:iload           6
	//   22   39:putfield        #55  <Field int zzaFF>
		zzaFG = class1;
	//   23   42:aload_0         
	//   24   43:aload           7
	//   25   45:putfield        #57  <Field Class zzaFG>
		if(class1 == null)
	//*  26   48:aload           7
	//*  27   50:ifnonnull       65
			zzaFH = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #59  <Field String zzaFH>
		else
	//*  31   58:aload_0         
	//*  32   59:aload           8
	//*  33   61:putfield        #61  <Field zzack$zzb zzaFJ>
	//*  34   64:return          
			zzaFH = class1.getCanonicalName();
	//   35   65:aload_0         
	//   36   66:aload           7
	//   37   68:invokevirtual   #76  <Method String Class.getCanonicalName()>
	//   38   71:putfield        #59  <Field String zzaFH>
		zzaFJ = zzack$zzb1;
	//*  39   74:goto            58
	}
}
