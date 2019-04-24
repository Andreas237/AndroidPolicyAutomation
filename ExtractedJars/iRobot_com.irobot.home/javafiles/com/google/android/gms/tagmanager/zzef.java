// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzp;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

public abstract class zzef extends zzbq
{

	public zzef(String s)
	{
		super(s, new String[] {
			zzbcf, zzbeb
		});
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:anewarray       String[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:getstatic       #23  <Field String zzbcf>
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:getstatic       #28  <Field String zzbeb>
	//   11   17:aastore         
	//   12   18:invokespecial   #36  <Method void zzbq(String, String[])>
	//   13   21:return          
	}

	protected abstract boolean zza(zzp zzp1, zzp zzp2, Map map);

	public final zzp zzc(Map map)
	{
		Iterator iterator = map.values().iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #46  <Method Collection Map.values()>
	//    2    6:invokeinterface #52  <Method Iterator Collection.iterator()>
	//    3   11:astore          4
_L4:
		boolean flag;
		boolean flag1;
		flag = iterator.hasNext();
	//    4   13:aload           4
	//    5   15:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//    6   20:istore_2        
		flag1 = false;
	//    7   21:iconst_0        
	//    8   22:istore_3        
		if(!flag) goto _L2; else goto _L1
	//    9   23:iload_2         
	//   10   24:ifeq            53
_L1:
		if((zzp)iterator.next() != zzgj.zzqq()) goto _L4; else goto _L3
	//   11   27:aload           4
	//   12   29:invokeinterface #62  <Method Object Iterator.next()>
	//   13   34:checkcast       #64  <Class zzp>
	//   14   37:invokestatic    #70  <Method zzp zzgj.zzqq()>
	//   15   40:if_acmpne       13
_L3:
		flag = flag1;
	//   16   43:iload_3         
	//   17   44:istore_2        
_L6:
		return zzgj.zzj(((Object) (Boolean.valueOf(flag))));
	//   18   45:iload_2         
	//   19   46:invokestatic    #76  <Method Boolean Boolean.valueOf(boolean)>
	//   20   49:invokestatic    #80  <Method zzp zzgj.zzj(Object)>
	//   21   52:areturn         
_L2:
		zzp zzp1 = (zzp)map.get(((Object) (zzbcf)));
	//   22   53:aload_1         
	//   23   54:getstatic       #23  <Field String zzbcf>
	//   24   57:invokeinterface #84  <Method Object Map.get(Object)>
	//   25   62:checkcast       #64  <Class zzp>
	//   26   65:astore          4
		zzp zzp2 = (zzp)map.get(((Object) (zzbeb)));
	//   27   67:aload_1         
	//   28   68:getstatic       #28  <Field String zzbeb>
	//   29   71:invokeinterface #84  <Method Object Map.get(Object)>
	//   30   76:checkcast       #64  <Class zzp>
	//   31   79:astore          5
		flag = flag1;
	//   32   81:iload_3         
	//   33   82:istore_2        
		if(zzp1 != null)
	//*  34   83:aload           4
	//*  35   85:ifnull          45
			if(zzp2 == null)
	//*  36   88:aload           5
	//*  37   90:ifnonnull       98
				flag = flag1;
	//   38   93:iload_3         
	//   39   94:istore_2        
			else
	//*  40   95:goto            45
				flag = zza(zzp1, zzp2, map);
	//   41   98:aload_0         
	//   42   99:aload           4
	//   43  101:aload           5
	//   44  103:aload_1         
	//   45  104:invokevirtual   #86  <Method boolean zza(zzp, zzp, Map)>
	//   46  107:istore_2        
		if(true) goto _L6; else goto _L5
	//   47  108:goto            45
_L5:
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final volatile String zzot()
	{
		return super.zzot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method String zzbq.zzot()>
	//    2    4:areturn         
	}

	public final volatile Set zzou()
	{
		return super.zzou();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method Set zzbq.zzou()>
	//    2    4:areturn         
	}

	private static final String zzbcf;
	private static final String zzbeb;

	static 
	{
		zzbcf = zzb.zzef.toString();
	//    0    0:getstatic       #17  <Field zzb zzb.zzef>
	//    1    3:invokevirtual   #21  <Method String zzb.toString()>
	//    2    6:putstatic       #23  <Field String zzbcf>
		zzbeb = zzb.zzeg.toString();
	//    3    9:getstatic       #26  <Field zzb zzb.zzeg>
	//    4   12:invokevirtual   #21  <Method String zzb.toString()>
	//    5   15:putstatic       #28  <Field String zzbeb>
	//*   6   18:return          
	}
}
