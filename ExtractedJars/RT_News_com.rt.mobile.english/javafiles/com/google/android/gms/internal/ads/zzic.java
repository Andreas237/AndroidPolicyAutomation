// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zziq, zzbfg, 
//			zzbfa, zzbfi

public final class zzic extends zzbfc
{

	public zzic()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzbfc()>
		zzamf = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field Integer zzamf>
		zzamg = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field zziq zzamg>
		zzebk = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field zzbfe zzebk>
		zzebt = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #27  <Field int zzebt>
	//   14   24:return          
	}

	private final zzic zzf(zzbez zzbez1)
		throws IOException
	{
_L2:
		int i;
		int j;
		i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            151
		if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          61
		{
			if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          32
			{
				if(!super.zza(zzbez1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #44  <Method boolean zzbfc.zza(zzbez, int)>
	//*  15   27:ifne            0
					return this;
	//   16   30:aload_0         
	//   17   31:areturn         
			} else
			{
				if(zzamg == null)
	//*  18   32:aload_0         
	//*  19   33:getfield        #19  <Field zziq zzamg>
	//*  20   36:ifnonnull       50
					zzamg = new zziq();
	//   21   39:aload_0         
	//   22   40:new             #46  <Class zziq>
	//   23   43:dup             
	//   24   44:invokespecial   #47  <Method void zziq()>
	//   25   47:putfield        #19  <Field zziq zzamg>
				zzbez1.zza(((zzbfi) (zzamg)));
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #19  <Field zziq zzamg>
	//   29   55:invokevirtual   #50  <Method void zzbez.zza(zzbfi)>
			}
			continue; /* Loop/switch isn't completed */
	//   30   58:goto            0
		}
		j = zzbez1.getPosition();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #53  <Method int zzbez.getPosition()>
	//   33   65:istore_3        
		int k = zzbez1.zzacc();
	//   34   66:aload_1         
	//   35   67:invokevirtual   #56  <Method int zzbez.zzacc()>
	//   36   70:istore          4
		if(k < 0 || k > 10)
			break MISSING_BLOCK_LABEL_96;
	//   37   72:iload           4
	//   38   74:iflt            96
	//   39   77:iload           4
	//   40   79:bipush          10
	//   41   81:icmpgt          96
		zzamf = Integer.valueOf(k);
	//   42   84:aload_0         
	//   43   85:iload           4
	//   44   87:invokestatic    #62  <Method Integer Integer.valueOf(int)>
	//   45   90:putfield        #17  <Field Integer zzamf>
		continue; /* Loop/switch isn't completed */
	//   46   93:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(44);
	//   47   96:new             #64  <Class StringBuilder>
	//   48   99:dup             
	//   49  100:bipush          44
	//   50  102:invokespecial   #67  <Method void StringBuilder(int)>
	//   51  105:astore          5
			stringbuilder.append(k);
	//   52  107:aload           5
	//   53  109:iload           4
	//   54  111:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   55  114:pop             
			stringbuilder.append(" is not a valid enum AdFormatType");
	//   56  115:aload           5
	//   57  117:ldc1            #73  <String " is not a valid enum AdFormatType">
	//   58  119:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   59  122:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   60  123:new             #34  <Class IllegalArgumentException>
	//   61  126:dup             
	//   62  127:aload           5
	//   63  129:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   64  132:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   65  135:athrow          
		}
	//*  66  136:aload_1         
	//*  67  137:iload_3         
	//*  68  138:invokevirtual   #86  <Method void zzbez.zzdc(int)>
	//*  69  141:aload_0         
	//*  70  142:aload_1         
	//*  71  143:iload_2         
	//*  72  144:invokevirtual   #44  <Method boolean zzbfc.zza(zzbez, int)>
	//*  73  147:pop             
	//*  74  148:goto            0
	//*  75  151:aload_0         
	//*  76  152:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzbez1.zzdc(j);
		}
		((zzbfc)this).zza(zzbez1, i);
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//*  77  153:astore          5
	//*  78  155:goto            136
	}

	public static zzic[] zzhr()
	{
		if(zzame == null)
	//*   0    0:getstatic       #91  <Field zzic[] zzame>
	//*   1    3:ifnonnull       35
			synchronized(zzbfg.zzebs)
	//*   2    6:getstatic       #97  <Field Object zzbfg.zzebs>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzame == null)
	//*   6   12:getstatic       #91  <Field zzic[] zzame>
	//*   7   15:ifnonnull       25
					zzame = new zzic[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzic[]
	//   10   22:putstatic       #91  <Field zzic[] zzame>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return zzame;
	//   19   35:getstatic       #91  <Field zzic[] zzame>
	//   20   38:areturn         
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzf(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method zzic zzf(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzamf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Integer zzamf>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzamf.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field Integer zzamf>
	//    7   13:invokevirtual   #104 <Method int Integer.intValue()>
	//    8   16:invokevirtual   #110 <Method void zzbfa.zzm(int, int)>
		if(zzamg != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #19  <Field zziq zzamg>
	//*  11   23:ifnull          35
			zzbfa1.zza(2, ((zzbfi) (zzamg)));
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #19  <Field zziq zzamg>
	//   16   32:invokevirtual   #113 <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #115 <Method void zzbfc.zza(zzbfa)>
	//   20   40:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzamf != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field Integer zzamf>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzamf.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #17  <Field Integer zzamf>
	//   12   20:invokevirtual   #104 <Method int Integer.intValue()>
	//   13   23:invokestatic    #122 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzamg != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #19  <Field zziq zzamg>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzb(2, ((zzbfi) (zzamg)));
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #19  <Field zziq zzamg>
	//   25   43:invokestatic    #126 <Method int zzbfa.zzb(int, zzbfi)>
	//   26   46:iadd            
	//   27   47:istore_2        
		return j;
	//   28   48:iload_2         
	//   29   49:ireturn         
	}

	private static volatile zzic zzame[];
	private Integer zzamf;
	private zziq zzamg;
}
