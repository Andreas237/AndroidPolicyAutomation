// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzc;
import com.google.android.gms.common.util.zzp;
import com.google.android.gms.common.util.zzq;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzacm, zzacr, zzacf, zzaco

public abstract class zzack
{
	public static class zza extends com.google.android.gms.common.internal.safeparcel.zza
	{

		public static zza zza(String s, int i, zzb zzb1, boolean flag)
		{
			return new zza(7, flag, 0, false, s, i, ((Class) (null)), zzb1);
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

		public static zza zza(String s, int i, Class class1)
		{
			return new zza(11, false, 11, false, s, i, class1, ((zzb) (null)));
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

		public static zza zzb(String s, int i, Class class1)
		{
			return new zza(11, true, 11, true, s, i, class1, ((zzb) (null)));
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

		static zzb zzc(zza zza1)
		{
			return zza1.zzaFJ;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field zzack$zzb zzaFJ>
		//    2    4:areturn         
		}

		public static zza zzk(String s, int i)
		{
			return new zza(0, false, 0, false, s, i, ((Class) (null)), ((zzb) (null)));
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

		public static zza zzl(String s, int i)
		{
			return new zza(6, false, 6, false, s, i, ((Class) (null)), ((zzb) (null)));
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

		public static zza zzm(String s, int i)
		{
			return new zza(7, false, 7, false, s, i, ((Class) (null)), ((zzb) (null)));
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
			zzacm.zza(this, parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #167 <Method void zzacm.zza(zzack$zza, Parcel, int)>
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
				return zzacf.zza(zzaFJ);
		//    5    9:aload_0         
		//    6   10:getfield        #61  <Field zzack$zzb zzaFJ>
		//    7   13:invokestatic    #184 <Method zzacf zzacf.zza(zzack$zzb)>
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
		private zzb zzaFJ;

		static 
		{
		//    0    0:new             #33  <Class zzacm>
		//    1    3:dup             
		//    2    4:invokespecial   #36  <Method void zzacm()>
		//    3    7:putstatic       #38  <Field zzacm CREATOR>
		//*   4   10:return          
		}

		zza(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
				String s1, zzacf zzacf1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void com.google.android.gms.common.internal.safeparcel.zza()>
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

		protected zza(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
				zzb zzb1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void com.google.android.gms.common.internal.safeparcel.zza()>
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
			zzaFJ = zzb1;
		//*  39   74:goto            58
		}
	}

	public static interface zzb
	{

		public abstract Object convertBack(Object obj);
	}


	public zzack()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	private void zza(StringBuilder stringbuilder, zza zza1, Object obj)
	{
		if(zza1.zzxL() == 11)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #20  <Method int zzack$zza.zzxL()>
	//*   2    4:bipush          11
	//*   3    6:icmpne          29
		{
			stringbuilder.append(((zzack)zza1.zzxR().cast(obj)).toString());
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #24  <Method Class zzack$zza.zzxR()>
	//    7   14:aload_3         
	//    8   15:invokevirtual   #30  <Method Object Class.cast(Object)>
	//    9   18:checkcast       #2   <Class zzack>
	//   10   21:invokevirtual   #34  <Method String toString()>
	//   11   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			return;
	//   13   28:return          
		}
		if(zza1.zzxL() == 7)
	//*  14   29:aload_2         
	//*  15   30:invokevirtual   #20  <Method int zzack$zza.zzxL()>
	//*  16   33:bipush          7
	//*  17   35:icmpne          65
		{
			stringbuilder.append("\"");
	//   18   38:aload_1         
	//   19   39:ldc1            #42  <String "\"">
	//   20   41:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			stringbuilder.append(zzp.zzdC((String)obj));
	//   22   45:aload_1         
	//   23   46:aload_3         
	//   24   47:checkcast       #44  <Class String>
	//   25   50:invokestatic    #50  <Method String zzp.zzdC(String)>
	//   26   53:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append("\"");
	//   28   57:aload_1         
	//   29   58:ldc1            #42  <String "\"">
	//   30   60:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			return;
	//   32   64:return          
		} else
		{
			stringbuilder.append(obj);
	//   33   65:aload_1         
	//   34   66:aload_3         
	//   35   67:invokevirtual   #53  <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:pop             
			return;
	//   37   71:return          
		}
	}

	private void zza(StringBuilder stringbuilder, zza zza1, ArrayList arraylist)
	{
		stringbuilder.append("[");
	//    0    0:aload_1         
	//    1    1:ldc1            #56  <String "[">
	//    2    3:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore          4
		for(int j = arraylist.size(); i < j; i++)
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #61  <Method int ArrayList.size()>
	//*   8   14:istore          5
	//*   9   16:iload           4
	//*  10   18:iload           5
	//*  11   20:icmpge          65
		{
			if(i > 0)
	//*  12   23:iload           4
	//*  13   25:ifle            35
				stringbuilder.append(",");
	//   14   28:aload_1         
	//   15   29:ldc1            #63  <String ",">
	//   16   31:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			Object obj = arraylist.get(i);
	//   18   35:aload_3         
	//   19   36:iload           4
	//   20   38:invokevirtual   #67  <Method Object ArrayList.get(int)>
	//   21   41:astore          6
			if(obj != null)
	//*  22   43:aload           6
	//*  23   45:ifnull          56
				zza(stringbuilder, zza1, obj);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:aload           6
	//   28   53:invokespecial   #69  <Method void zza(StringBuilder, zzack$zza, Object)>
		}

	//   29   56:iload           4
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore          4
	//*  33   62:goto            16
		stringbuilder.append("]");
	//   34   65:aload_1         
	//   35   66:ldc1            #71  <String "]">
	//   36   68:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
	//   38   72:return          
	}

	public String toString()
	{
		Map map = zzxK();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method Map zzxK()>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder(100);
	//    3    5:new             #36  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          100
	//    6   11:invokespecial   #80  <Method void StringBuilder(int)>
	//    7   14:astore_2        
		Iterator iterator = map.keySet().iterator();
	//    8   15:aload_1         
	//    9   16:invokeinterface #86  <Method Set Map.keySet()>
	//   10   21:invokeinterface #92  <Method Iterator Set.iterator()>
	//   11   26:astore_3        
label0:
		do
		{
			do
			{
				if(!iterator.hasNext())
					break;
	//   12   27:aload_3         
	//   13   28:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   14   33:ifeq            271
				String s = (String)iterator.next();
	//   15   36:aload_3         
	//   16   37:invokeinterface #102 <Method Object Iterator.next()>
	//   17   42:checkcast       #44  <Class String>
	//   18   45:astore          4
				zza zza1 = (zza)map.get(((Object) (s)));
	//   19   47:aload_1         
	//   20   48:aload           4
	//   21   50:invokeinterface #104 <Method Object Map.get(Object)>
	//   22   55:checkcast       #6   <Class zzack$zza>
	//   23   58:astore          5
				if(zza(zza1))
	//*  24   60:aload_0         
	//*  25   61:aload           5
	//*  26   63:invokevirtual   #107 <Method boolean zza(zzack$zza)>
	//*  27   66:ifeq            27
				{
					Object obj = zza(zza1, zzb(zza1));
	//   28   69:aload_0         
	//   29   70:aload           5
	//   30   72:aload_0         
	//   31   73:aload           5
	//   32   75:invokevirtual   #110 <Method Object zzb(zzack$zza)>
	//   33   78:invokevirtual   #113 <Method Object zza(zzack$zza, Object)>
	//   34   81:astore          6
					if(stringbuilder.length() == 0)
	//*  35   83:aload_2         
	//*  36   84:invokevirtual   #116 <Method int StringBuilder.length()>
	//*  37   87:ifne            129
						stringbuilder.append("{");
	//   38   90:aload_2         
	//   39   91:ldc1            #118 <String "{">
	//   40   93:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   41   96:pop             
					else
	//*  42   97:aload_2         
	//*  43   98:ldc1            #42  <String "\"">
	//*  44  100:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  45  103:aload           4
	//*  46  105:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  47  108:ldc1            #120 <String "\":">
	//*  48  110:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  49  113:pop             
	//*  50  114:aload           6
	//*  51  116:ifnonnull       139
	//*  52  119:aload_2         
	//*  53  120:ldc1            #122 <String "null">
	//*  54  122:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  55  125:pop             
	//*  56  126:goto            27
						stringbuilder.append(",");
	//   57  129:aload_2         
	//   58  130:ldc1            #63  <String ",">
	//   59  132:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   60  135:pop             
					stringbuilder.append("\"").append(s).append("\":");
					if(obj == null)
					{
						stringbuilder.append("null");
					} else
	//*  61  136:goto            97
					{
						switch(zza1.zzxN())
	//*  62  139:aload           5
	//*  63  141:invokevirtual   #125 <Method int zzack$zza.zzxN()>
						{
	//*  64  144:tableswitch     8 10: default 172
	//	               8 195
	//	               9 221
	//	               10 247
						default:
							if(zza1.zzxM())
	//*  65  172:aload           5
	//*  66  174:invokevirtual   #128 <Method boolean zzack$zza.zzxM()>
	//*  67  177:ifeq            259
								zza(stringbuilder, zza1, (ArrayList)obj);
	//   68  180:aload_0         
	//   69  181:aload_2         
	//   70  182:aload           5
	//   71  184:aload           6
	//   72  186:checkcast       #58  <Class ArrayList>
	//   73  189:invokespecial   #130 <Method void zza(StringBuilder, zzack$zza, ArrayList)>
							else
	//*  74  192:goto            27
	//*  75  195:aload_2         
	//*  76  196:ldc1            #42  <String "\"">
	//*  77  198:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  78  201:aload           6
	//*  79  203:checkcast       #132 <Class byte[]>
	//*  80  206:invokestatic    #138 <Method String zzc.zzq(byte[])>
	//*  81  209:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  82  212:ldc1            #42  <String "\"">
	//*  83  214:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  84  217:pop             
	//*  85  218:goto            27
	//*  86  221:aload_2         
	//*  87  222:ldc1            #42  <String "\"">
	//*  88  224:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  89  227:aload           6
	//*  90  229:checkcast       #132 <Class byte[]>
	//*  91  232:invokestatic    #141 <Method String zzc.zzr(byte[])>
	//*  92  235:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  93  238:ldc1            #42  <String "\"">
	//*  94  240:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  95  243:pop             
	//*  96  244:goto            27
	//*  97  247:aload_2         
	//*  98  248:aload           6
	//*  99  250:checkcast       #143 <Class HashMap>
	//* 100  253:invokestatic    #148 <Method void zzq.zza(StringBuilder, HashMap)>
	//* 101  256:goto            27
								zza(stringbuilder, zza1, obj);
	//  102  259:aload_0         
	//  103  260:aload_2         
	//  104  261:aload           5
	//  105  263:aload           6
	//  106  265:invokespecial   #69  <Method void zza(StringBuilder, zzack$zza, Object)>
							break;

						case 8: // '\b'
							stringbuilder.append("\"").append(zzc.zzq((byte[])obj)).append("\"");
							break;

						case 9: // '\t'
							stringbuilder.append("\"").append(zzc.zzr((byte[])obj)).append("\"");
							break;

						case 10: // '\n'
							zzq.zza(stringbuilder, (HashMap)obj);
							break;
						}
						continue label0;
	//  107  268:goto            27
					}
				}
			} while(true);
			if(stringbuilder.length() > 0)
	//* 108  271:aload_2         
	//* 109  272:invokevirtual   #116 <Method int StringBuilder.length()>
	//* 110  275:ifle            290
				stringbuilder.append("}");
	//  111  278:aload_2         
	//  112  279:ldc1            #150 <String "}">
	//  113  281:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  114  284:pop             
			else
	//* 115  285:aload_2         
	//* 116  286:invokevirtual   #151 <Method String StringBuilder.toString()>
	//* 117  289:areturn         
				stringbuilder.append("{}");
	//  118  290:aload_2         
	//  119  291:ldc1            #153 <String "{}">
	//  120  293:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//  121  296:pop             
			return stringbuilder.toString();
		} while(true);
	//* 122  297:goto            285
	}

	protected Object zza(zza zza1, Object obj)
	{
		Object obj1 = obj;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(com.google.android.gms.internal.zza.zzc(zza1) != null)
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #157 <Method zzack$zzb com.google.android.gms.internal.zzack$zza.zzc(zzack$zza)>
	//*   4    6:ifnull          15
			obj1 = zza1.convertBack(obj);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #160 <Method Object zzack$zza.convertBack(Object)>
	//    8   14:astore_3        
		return obj1;
	//    9   15:aload_3         
	//   10   16:areturn         
	}

	protected boolean zza(zza zza1)
	{
		if(zza1.zzxN() == 11)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #125 <Method int zzack$zza.zzxN()>
	//*   2    4:bipush          11
	//*   3    6:icmpne          34
		{
			if(zza1.zzxO())
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #164 <Method boolean zzack$zza.zzxO()>
	//*   6   13:ifeq            25
				return zzdz(zza1.zzxP());
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokevirtual   #167 <Method String zzack$zza.zzxP()>
	//   10   21:invokevirtual   #171 <Method boolean zzdz(String)>
	//   11   24:ireturn         
			else
				return zzdy(zza1.zzxP());
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #167 <Method String zzack$zza.zzxP()>
	//   15   30:invokevirtual   #174 <Method boolean zzdy(String)>
	//   16   33:ireturn         
		} else
		{
			return zzdx(zza1.zzxP());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #167 <Method String zzack$zza.zzxP()>
	//   20   39:invokevirtual   #177 <Method boolean zzdx(String)>
	//   21   42:ireturn         
		}
	}

	protected Object zzb(zza zza1)
	{
		String s = zza1.zzxP();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #167 <Method String zzack$zza.zzxP()>
	//    2    4:astore_3        
		if(zza1.zzxR() != null)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #24  <Method Class zzack$zza.zzxR()>
	//*   5    9:ifnull          127
		{
			zzdw(zza1.zzxP());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #167 <Method String zzack$zza.zzxP()>
	//    9   17:invokevirtual   #183 <Method Object zzdw(String)>
	//   10   20:pop             
			zzac.zza(true, "Concrete field shouldn't be value object: %s", new Object[] {
				zza1.zzxP()
			});
	//   11   21:iconst_1        
	//   12   22:ldc1            #185 <String "Concrete field shouldn't be value object: %s">
	//   13   24:iconst_1        
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:aload_1         
	//   18   31:invokevirtual   #167 <Method String zzack$zza.zzxP()>
	//   19   34:aastore         
	//   20   35:invokestatic    #190 <Method void zzac.zza(boolean, String, Object[])>
			zza1.zzxO();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #164 <Method boolean zzack$zza.zzxO()>
	//   23   42:pop             
			try
			{
				char c = Character.toUpperCase(s.charAt(0));
	//   24   43:aload_3         
	//   25   44:iconst_0        
	//   26   45:invokevirtual   #194 <Method char String.charAt(int)>
	//   27   48:invokestatic    #200 <Method char Character.toUpperCase(char)>
	//   28   51:istore_2        
				zza1 = ((zza) (String.valueOf(((Object) (s.substring(1))))));
	//   29   52:aload_3         
	//   30   53:iconst_1        
	//   31   54:invokevirtual   #204 <Method String String.substring(int)>
	//   32   57:invokestatic    #208 <Method String String.valueOf(Object)>
	//   33   60:astore_1        
				zza1 = ((zza) ((new StringBuilder(String.valueOf(((Object) (zza1))).length() + 4)).append("get").append(c).append(((String) (zza1))).toString()));
	//   34   61:new             #36  <Class StringBuilder>
	//   35   64:dup             
	//   36   65:aload_1         
	//   37   66:invokestatic    #208 <Method String String.valueOf(Object)>
	//   38   69:invokevirtual   #209 <Method int String.length()>
	//   39   72:iconst_4        
	//   40   73:iadd            
	//   41   74:invokespecial   #80  <Method void StringBuilder(int)>
	//   42   77:ldc1            #210 <String "get">
	//   43   79:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:iload_2         
	//   45   83:invokevirtual   #213 <Method StringBuilder StringBuilder.append(char)>
	//   46   86:aload_1         
	//   47   87:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   48   90:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   49   93:astore_1        
				zza1 = ((zza) (((Object)this).getClass().getMethod(((String) (zza1)), new Class[0]).invoke(((Object) (this)), new Object[0])));
	//   50   94:aload_0         
	//   51   95:invokevirtual   #216 <Method Class Object.getClass()>
	//   52   98:aload_1         
	//   53   99:iconst_0        
	//   54  100:anewarray       Class[]
	//   55  103:invokevirtual   #220 <Method Method Class.getMethod(String, Class[])>
	//   56  106:aload_0         
	//   57  107:iconst_0        
	//   58  108:anewarray       Object[]
	//   59  111:invokevirtual   #226 <Method Object Method.invoke(Object, Object[])>
	//   60  114:astore_1        
			}
	//*  61  115:aload_1         
	//*  62  116:areturn         
			// Misplaced declaration of an exception variable
			catch(zza zza1)
	//*  63  117:astore_1        
			{
				throw new RuntimeException(((Throwable) (zza1)));
	//   64  118:new             #228 <Class RuntimeException>
	//   65  121:dup             
	//   66  122:aload_1         
	//   67  123:invokespecial   #231 <Method void RuntimeException(Throwable)>
	//   68  126:athrow          
			}
			return ((Object) (zza1));
		} else
		{
			return zzdw(zza1.zzxP());
	//   69  127:aload_0         
	//   70  128:aload_1         
	//   71  129:invokevirtual   #167 <Method String zzack$zza.zzxP()>
	//   72  132:invokevirtual   #183 <Method Object zzdw(String)>
	//   73  135:areturn         
		}
	}

	protected abstract Object zzdw(String s);

	protected abstract boolean zzdx(String s);

	protected boolean zzdy(String s)
	{
		throw new UnsupportedOperationException("Concrete types not supported");
	//    0    0:new             #233 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #235 <String "Concrete types not supported">
	//    3    6:invokespecial   #238 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	protected boolean zzdz(String s)
	{
		throw new UnsupportedOperationException("Concrete type arrays not supported");
	//    0    0:new             #233 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #240 <String "Concrete type arrays not supported">
	//    3    6:invokespecial   #238 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public abstract Map zzxK();
}
