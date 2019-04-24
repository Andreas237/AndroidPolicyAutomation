// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzit, zzbfa, 
//			zzbfi

public final class zzih extends zzbfc
{

	public zzih()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzbfc()>
		zzanc = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field Integer zzanc>
		zzand = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field zzit zzand>
		zzane = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field String zzane>
		zzanf = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field String zzanf>
		zzebk = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #28  <Field zzbfe zzebk>
		zzebt = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #32  <Field int zzebt>
	//   20   34:return          
	}

	private final zzih zzj(zzbez zzbez1)
		throws IOException
	{
_L2:
		int i;
		int j;
		i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            184
		if(i != 40)
	//*   5    9:iload_2         
	//*   6   10:bipush          40
	//*   7   12:icmpeq          95
		{
			if(i != 50)
	//*   8   15:iload_2         
	//*   9   16:bipush          50
	//*  10   18:icmpeq          66
			{
				if(i != 58)
	//*  11   21:iload_2         
	//*  12   22:bipush          58
	//*  13   24:icmpeq          55
				{
					if(i != 66)
	//*  14   27:iload_2         
	//*  15   28:bipush          66
	//*  16   30:icmpeq          44
					{
						if(!super.zza(zzbez1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #49  <Method boolean zzbfc.zza(zzbez, int)>
	//*  21   39:ifne            0
							return this;
	//   22   42:aload_0         
	//   23   43:areturn         
					} else
					{
						zzanf = zzbez1.readString();
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #53  <Method String zzbez.readString()>
	//   27   49:putfield        #24  <Field String zzanf>
					}
				} else
	//*  28   52:goto            0
				{
					zzane = zzbez1.readString();
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #53  <Method String zzbez.readString()>
	//   32   60:putfield        #22  <Field String zzane>
				}
			} else
	//*  33   63:goto            0
			{
				if(zzand == null)
	//*  34   66:aload_0         
	//*  35   67:getfield        #20  <Field zzit zzand>
	//*  36   70:ifnonnull       84
					zzand = new zzit();
	//   37   73:aload_0         
	//   38   74:new             #55  <Class zzit>
	//   39   77:dup             
	//   40   78:invokespecial   #56  <Method void zzit()>
	//   41   81:putfield        #20  <Field zzit zzand>
				zzbez1.zza(((zzbfi) (zzand)));
	//   42   84:aload_1         
	//   43   85:aload_0         
	//   44   86:getfield        #20  <Field zzit zzand>
	//   45   89:invokevirtual   #59  <Method void zzbez.zza(zzbfi)>
			}
			continue; /* Loop/switch isn't completed */
	//   46   92:goto            0
		}
		j = zzbez1.getPosition();
	//   47   95:aload_1         
	//   48   96:invokevirtual   #62  <Method int zzbez.getPosition()>
	//   49   99:istore_3        
		int k = zzbez1.zzacc();
	//   50  100:aload_1         
	//   51  101:invokevirtual   #65  <Method int zzbez.zzacc()>
	//   52  104:istore          4
		if(k < 0 || k > 2)
			break MISSING_BLOCK_LABEL_129;
	//   53  106:iload           4
	//   54  108:iflt            129
	//   55  111:iload           4
	//   56  113:iconst_2        
	//   57  114:icmpgt          129
		zzanc = Integer.valueOf(k);
	//   58  117:aload_0         
	//   59  118:iload           4
	//   60  120:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//   61  123:putfield        #18  <Field Integer zzanc>
		continue; /* Loop/switch isn't completed */
	//   62  126:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(40);
	//   63  129:new             #73  <Class StringBuilder>
	//   64  132:dup             
	//   65  133:bipush          40
	//   66  135:invokespecial   #76  <Method void StringBuilder(int)>
	//   67  138:astore          5
			stringbuilder.append(k);
	//   68  140:aload           5
	//   69  142:iload           4
	//   70  144:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   71  147:pop             
			stringbuilder.append(" is not a valid enum Platform");
	//   72  148:aload           5
	//   73  150:ldc1            #82  <String " is not a valid enum Platform">
	//   74  152:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   75  155:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   76  156:new             #39  <Class IllegalArgumentException>
	//   77  159:dup             
	//   78  160:aload           5
	//   79  162:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   80  165:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   81  168:athrow          
		}
	//*  82  169:aload_1         
	//*  83  170:iload_3         
	//*  84  171:invokevirtual   #94  <Method void zzbez.zzdc(int)>
	//*  85  174:aload_0         
	//*  86  175:aload_1         
	//*  87  176:iload_2         
	//*  88  177:invokevirtual   #49  <Method boolean zzbfc.zza(zzbez, int)>
	//*  89  180:pop             
	//*  90  181:goto            0
	//*  91  184:aload_0         
	//*  92  185:areturn         
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
	//*  93  186:astore          5
	//*  94  188:goto            169
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzj(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method zzih zzj(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanc != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Integer zzanc>
	//*   2    4:ifnull          19
			zzbfa1.zzm(5, zzanc.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_5        
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Integer zzanc>
	//    7   13:invokevirtual   #102 <Method int Integer.intValue()>
	//    8   16:invokevirtual   #108 <Method void zzbfa.zzm(int, int)>
		if(zzand != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #20  <Field zzit zzand>
	//*  11   23:ifnull          36
			zzbfa1.zza(6, ((zzbfi) (zzand)));
	//   12   26:aload_1         
	//   13   27:bipush          6
	//   14   29:aload_0         
	//   15   30:getfield        #20  <Field zzit zzand>
	//   16   33:invokevirtual   #111 <Method void zzbfa.zza(int, zzbfi)>
		if(zzane != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #22  <Field String zzane>
	//*  19   40:ifnull          53
			zzbfa1.zzf(7, zzane);
	//   20   43:aload_1         
	//   21   44:bipush          7
	//   22   46:aload_0         
	//   23   47:getfield        #22  <Field String zzane>
	//   24   50:invokevirtual   #115 <Method void zzbfa.zzf(int, String)>
		if(zzanf != null)
	//*  25   53:aload_0         
	//*  26   54:getfield        #24  <Field String zzanf>
	//*  27   57:ifnull          70
			zzbfa1.zzf(8, zzanf);
	//   28   60:aload_1         
	//   29   61:bipush          8
	//   30   63:aload_0         
	//   31   64:getfield        #24  <Field String zzanf>
	//   32   67:invokevirtual   #115 <Method void zzbfa.zzf(int, String)>
		super.zza(zzbfa1);
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:invokespecial   #117 <Method void zzbfc.zza(zzbfa)>
	//   36   75:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzanc != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #18  <Field Integer zzanc>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(5, zzanc.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_5        
	//   10   16:aload_0         
	//   11   17:getfield        #18  <Field Integer zzanc>
	//   12   20:invokevirtual   #102 <Method int Integer.intValue()>
	//   13   23:invokestatic    #124 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzand != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #20  <Field zzit zzand>
	//*  20   34:ifnull          49
			j = i + zzbfa.zzb(6, ((zzbfi) (zzand)));
	//   21   37:iload_1         
	//   22   38:bipush          6
	//   23   40:aload_0         
	//   24   41:getfield        #20  <Field zzit zzand>
	//   25   44:invokestatic    #128 <Method int zzbfa.zzb(int, zzbfi)>
	//   26   47:iadd            
	//   27   48:istore_2        
		i = j;
	//   28   49:iload_2         
	//   29   50:istore_1        
		if(zzane != null)
	//*  30   51:aload_0         
	//*  31   52:getfield        #22  <Field String zzane>
	//*  32   55:ifnull          70
			i = j + zzbfa.zzg(7, zzane);
	//   33   58:iload_2         
	//   34   59:bipush          7
	//   35   61:aload_0         
	//   36   62:getfield        #22  <Field String zzane>
	//   37   65:invokestatic    #132 <Method int zzbfa.zzg(int, String)>
	//   38   68:iadd            
	//   39   69:istore_1        
		j = i;
	//   40   70:iload_1         
	//   41   71:istore_2        
		if(zzanf != null)
	//*  42   72:aload_0         
	//*  43   73:getfield        #24  <Field String zzanf>
	//*  44   76:ifnull          91
			j = i + zzbfa.zzg(8, zzanf);
	//   45   79:iload_1         
	//   46   80:bipush          8
	//   47   82:aload_0         
	//   48   83:getfield        #24  <Field String zzanf>
	//   49   86:invokestatic    #132 <Method int zzbfa.zzg(int, String)>
	//   50   89:iadd            
	//   51   90:istore_2        
		return j;
	//   52   91:iload_2         
	//   53   92:ireturn         
	}

	private Integer zzanc;
	private zzit zzand;
	private String zzane;
	private String zzanf;
}
