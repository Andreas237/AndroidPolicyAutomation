// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaxt, zzaxr, zzaxi, zzbbo, 
//			zzayd, zzaxl

final class zzaup
{

	public static zzaxt zzb(zzaxr zzaxr1)
	{
		zzaxt.zza zza = zzaxt.zzzu().zzbb(zzaxr1.zzzk());
	//    0    0:invokestatic    #27  <Method zzaxt$zza zzaxt.zzzu()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #33  <Method int zzaxr.zzzk()>
	//    3    7:invokevirtual   #39  <Method zzaxt$zza zzaxt$zza.zzbb(int)>
	//    4   10:astore_1        
		zzaxr.zzb zzb1;
		for(zzaxr1 = ((zzaxr) (zzaxr1.zzzl().iterator())); ((Iterator) (zzaxr1)).hasNext(); zza.zzb((zzaxt.zzb)(zzbbo)((zzbbo.zza) (zzaxt.zzb.zzzw().zzeh(zzb1.zzzp().zzyw()).zzb(zzb1.zzzq()).zzb(zzb1.zzzs()).zzbd(zzb1.zzzr()))).zzadi()))
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #43  <Method List zzaxr.zzzl()>
	//*   7   15:invokeinterface #49  <Method Iterator List.iterator()>
	//*   8   20:astore_0        
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            91
			zzb1 = (zzaxr.zzb)((Iterator) (zzaxr1)).next();
	//   12   30:aload_0         
	//   13   31:invokeinterface #59  <Method Object Iterator.next()>
	//   14   36:checkcast       #61  <Class zzaxr$zzb>
	//   15   39:astore_2        

	//   16   40:aload_1         
	//   17   41:invokestatic    #67  <Method zzaxt$zzb$zza zzaxt$zzb.zzzw()>
	//   18   44:aload_2         
	//   19   45:invokevirtual   #71  <Method zzaxi zzaxr$zzb.zzzp()>
	//   20   48:invokevirtual   #77  <Method String zzaxi.zzyw()>
	//   21   51:invokevirtual   #83  <Method zzaxt$zzb$zza zzaxt$zzb$zza.zzeh(String)>
	//   22   54:aload_2         
	//   23   55:invokevirtual   #87  <Method zzaxl zzaxr$zzb.zzzq()>
	//   24   58:invokevirtual   #90  <Method zzaxt$zzb$zza zzaxt$zzb$zza.zzb(zzaxl)>
	//   25   61:aload_2         
	//   26   62:invokevirtual   #94  <Method zzayd zzaxr$zzb.zzzs()>
	//   27   65:invokevirtual   #97  <Method zzaxt$zzb$zza zzaxt$zzb$zza.zzb(zzayd)>
	//   28   68:aload_2         
	//   29   69:invokevirtual   #100 <Method int zzaxr$zzb.zzzr()>
	//   30   72:invokevirtual   #104 <Method zzaxt$zzb$zza zzaxt$zzb$zza.zzbd(int)>
	//   31   75:invokevirtual   #110 <Method zzbbo zzbbo$zza.zzadi()>
	//   32   78:checkcast       #112 <Class zzbbo>
	//   33   81:checkcast       #63  <Class zzaxt$zzb>
	//   34   84:invokevirtual   #115 <Method zzaxt$zza zzaxt$zza.zzb(zzaxt$zzb)>
	//   35   87:pop             
	//*  36   88:goto            21
		return (zzaxt)(zzbbo)((zzbbo.zza) (zza)).zzadi();
	//   37   91:aload_1         
	//   38   92:invokevirtual   #110 <Method zzbbo zzbbo$zza.zzadi()>
	//   39   95:checkcast       #112 <Class zzbbo>
	//   40   98:checkcast       #23  <Class zzaxt>
	//   41  101:areturn         
	}

	public static void zzc(zzaxr zzaxr1)
		throws GeneralSecurityException
	{
		if(zzaxr1.zzzm() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #122 <Method int zzaxr.zzzm()>
	//*   2    4:ifne            17
			throw new GeneralSecurityException("empty keyset");
	//    3    7:new             #119 <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #124 <String "empty keyset">
	//    6   13:invokespecial   #128 <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		int i = zzaxr1.zzzk();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #33  <Method int zzaxr.zzzk()>
	//   10   21:istore          4
		zzaxr1 = ((zzaxr) (zzaxr1.zzzl().iterator()));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #43  <Method List zzaxr.zzzl()>
	//   13   27:invokeinterface #49  <Method Iterator List.iterator()>
	//   14   32:astore_0        
		boolean flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_1        
		boolean flag1 = false;
	//   17   35:iconst_0        
	//   18   36:istore_2        
		do
		{
			if(!((Iterator) (zzaxr1)).hasNext())
				break;
	//   19   37:aload_0         
	//   20   38:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   21   43:ifeq            235
			zzaxr.zzb zzb1 = (zzaxr.zzb)((Iterator) (zzaxr1)).next();
	//   22   46:aload_0         
	//   23   47:invokeinterface #59  <Method Object Iterator.next()>
	//   24   52:checkcast       #61  <Class zzaxr$zzb>
	//   25   55:astore          5
			if(!zzb1.zzzo())
	//*  26   57:aload           5
	//*  27   59:invokevirtual   #131 <Method boolean zzaxr$zzb.zzzo()>
	//*  28   62:ifne            93
				throw new GeneralSecurityException(String.format("key %d has no key data", new Object[] {
					Integer.valueOf(zzb1.zzzr())
				}));
	//   29   65:new             #119 <Class GeneralSecurityException>
	//   30   68:dup             
	//   31   69:ldc1            #133 <String "key %d has no key data">
	//   32   71:iconst_1        
	//   33   72:anewarray       Object[]
	//   34   75:dup             
	//   35   76:iconst_0        
	//   36   77:aload           5
	//   37   79:invokevirtual   #100 <Method int zzaxr$zzb.zzzr()>
	//   38   82:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//   39   85:aastore         
	//   40   86:invokestatic    #145 <Method String String.format(String, Object[])>
	//   41   89:invokespecial   #128 <Method void GeneralSecurityException(String)>
	//   42   92:athrow          
			if(zzb1.zzzs() == zzayd.zzdmk)
	//*  43   93:aload           5
	//*  44   95:invokevirtual   #94  <Method zzayd zzaxr$zzb.zzzs()>
	//*  45   98:getstatic       #151 <Field zzayd zzayd.zzdmk>
	//*  46  101:if_acmpne       132
				throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[] {
					Integer.valueOf(zzb1.zzzr())
				}));
	//   47  104:new             #119 <Class GeneralSecurityException>
	//   48  107:dup             
	//   49  108:ldc1            #153 <String "key %d has unknown prefix">
	//   50  110:iconst_1        
	//   51  111:anewarray       Object[]
	//   52  114:dup             
	//   53  115:iconst_0        
	//   54  116:aload           5
	//   55  118:invokevirtual   #100 <Method int zzaxr$zzb.zzzr()>
	//   56  121:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//   57  124:aastore         
	//   58  125:invokestatic    #145 <Method String String.format(String, Object[])>
	//   59  128:invokespecial   #128 <Method void GeneralSecurityException(String)>
	//   60  131:athrow          
			if(zzb1.zzzq() == zzaxl.zzdld)
	//*  61  132:aload           5
	//*  62  134:invokevirtual   #87  <Method zzaxl zzaxr$zzb.zzzq()>
	//*  63  137:getstatic       #159 <Field zzaxl zzaxl.zzdld>
	//*  64  140:if_acmpne       171
				throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[] {
					Integer.valueOf(zzb1.zzzr())
				}));
	//   65  143:new             #119 <Class GeneralSecurityException>
	//   66  146:dup             
	//   67  147:ldc1            #161 <String "key %d has unknown status">
	//   68  149:iconst_1        
	//   69  150:anewarray       Object[]
	//   70  153:dup             
	//   71  154:iconst_0        
	//   72  155:aload           5
	//   73  157:invokevirtual   #100 <Method int zzaxr$zzb.zzzr()>
	//   74  160:invokestatic    #139 <Method Integer Integer.valueOf(int)>
	//   75  163:aastore         
	//   76  164:invokestatic    #145 <Method String String.format(String, Object[])>
	//   77  167:invokespecial   #128 <Method void GeneralSecurityException(String)>
	//   78  170:athrow          
			boolean flag2 = flag1;
	//   79  171:iload_2         
	//   80  172:istore_3        
			if(zzb1.zzzq() == zzaxl.zzdle)
	//*  81  173:aload           5
	//*  82  175:invokevirtual   #87  <Method zzaxl zzaxr$zzb.zzzq()>
	//*  83  178:getstatic       #164 <Field zzaxl zzaxl.zzdle>
	//*  84  181:if_acmpne       212
			{
				flag2 = flag1;
	//   85  184:iload_2         
	//   86  185:istore_3        
				if(zzb1.zzzr() == i)
	//*  87  186:aload           5
	//*  88  188:invokevirtual   #100 <Method int zzaxr$zzb.zzzr()>
	//*  89  191:iload           4
	//*  90  193:icmpne          212
				{
					if(flag1)
	//*  91  196:iload_2         
	//*  92  197:ifeq            210
						throw new GeneralSecurityException("keyset contains multiple primary keys");
	//   93  200:new             #119 <Class GeneralSecurityException>
	//   94  203:dup             
	//   95  204:ldc1            #166 <String "keyset contains multiple primary keys">
	//   96  206:invokespecial   #128 <Method void GeneralSecurityException(String)>
	//   97  209:athrow          
					flag2 = true;
	//   98  210:iconst_1        
	//   99  211:istore_3        
				}
			}
			flag1 = flag2;
	//  100  212:iload_3         
	//  101  213:istore_2        
			if(zzb1.zzzp().zzyy() != zzaxi.zzb.zzdkz)
	//* 102  214:aload           5
	//* 103  216:invokevirtual   #71  <Method zzaxi zzaxr$zzb.zzzp()>
	//* 104  219:invokevirtual   #170 <Method zzaxi$zzb zzaxi.zzyy()>
	//* 105  222:getstatic       #176 <Field zzaxi$zzb zzaxi$zzb.zzdkz>
	//* 106  225:if_acmpeq       37
			{
				flag = false;
	//  107  228:iconst_0        
	//  108  229:istore_1        
				flag1 = flag2;
	//  109  230:iload_3         
	//  110  231:istore_2        
			}
		} while(true);
	//  111  232:goto            37
		if(!flag1 && !flag)
	//* 112  235:iload_2         
	//* 113  236:ifne            253
	//* 114  239:iload_1         
	//* 115  240:ifne            253
			throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
	//  116  243:new             #119 <Class GeneralSecurityException>
	//  117  246:dup             
	//  118  247:ldc1            #178 <String "keyset doesn't contain a valid primary key">
	//  119  249:invokespecial   #128 <Method void GeneralSecurityException(String)>
	//  120  252:athrow          
		else
			return;
	//  121  253:return          
	}

	private static final Charset UTF_8 = Charset.forName("UTF-8");

	static 
	{
	//    0    0:ldc1            #10  <String "UTF-8">
	//    1    2:invokestatic    #16  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #18  <Field Charset UTF_8>
	//*   3    8:return          
	}
}
