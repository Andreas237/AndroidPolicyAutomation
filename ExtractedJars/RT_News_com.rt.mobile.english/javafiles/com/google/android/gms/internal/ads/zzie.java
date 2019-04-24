// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzic, zzbez, zzia, 
//			zzbfl, zzbfa, zzbfi

public final class zzie extends zzbfc
{

	public zzie()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbfc()>
		zzamj = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field String zzamj>
		zzamk = zzic.zzhr();
	//    5    9:aload_0         
	//    6   10:invokestatic    #25  <Method zzic[] zzic.zzhr()>
	//    7   13:putfield        #27  <Field zzic[] zzamk>
		zzaml = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #29  <Field Integer zzaml>
		zzamm = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #31  <Field Integer zzamm>
		zzamn = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #33  <Field Integer zzamn>
		zzebk = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #37  <Field zzbfe zzebk>
		zzebt = -1;
	//   20   36:aload_0         
	//   21   37:iconst_m1       
	//   22   38:putfield        #41  <Field int zzebt>
	//   23   41:return          
	}

	private final zzie zzh(zzbez zzbez1)
		throws IOException
	{
_L2:
		int k = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method int zzbez.zzabk()>
	//    2    4:istore_3        
		if(k == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_3         
	//    4    6:ifeq            263
		if(k == 10)
			break MISSING_BLOCK_LABEL_252;
	//    5    9:iload_3         
	//    6   10:bipush          10
	//    7   12:icmpeq          252
		if(k == 18)
			break MISSING_BLOCK_LABEL_131;
	//    8   15:iload_3         
	//    9   16:bipush          18
	//   10   18:icmpeq          131
		if(k == 24)
			break MISSING_BLOCK_LABEL_94;
	//   11   21:iload_3         
	//   12   22:bipush          24
	//   13   24:icmpeq          94
		if(k != 32)
	//*  14   27:iload_3         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          72
		{
			if(k != 40)
	//*  17   33:iload_3         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          50
			{
				if(!super.zza(zzbez1, k))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_3         
	//*  23   42:invokespecial   #58  <Method boolean zzbfc.zza(zzbez, int)>
	//*  24   45:ifne            0
					return this;
	//   25   48:aload_0         
	//   26   49:areturn         
			} else
			{
				int i = zzbez1.getPosition();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #61  <Method int zzbez.getPosition()>
	//   29   54:istore_2        
				try
				{
					zzamn = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   30   55:aload_0         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #64  <Method int zzbez.zzacc()>
	//   33   60:invokestatic    #70  <Method int zzia.zzd(int)>
	//   34   63:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   35   66:putfield        #33  <Field Integer zzamn>
				}
	//*  36   69:goto            0
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #61  <Method int zzbez.getPosition()>
	//*  39   76:istore_2        
	//*  40   77:aload_0         
	//*  41   78:aload_1         
	//*  42   79:invokevirtual   #64  <Method int zzbez.zzacc()>
	//*  43   82:invokestatic    #70  <Method int zzia.zzd(int)>
	//*  44   85:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//*  45   88:putfield        #31  <Field Integer zzamm>
	//*  46   91:goto            0
	//*  47   94:aload_1         
	//*  48   95:invokevirtual   #61  <Method int zzbez.getPosition()>
	//*  49   98:istore_2        
	//*  50   99:aload_0         
	//*  51  100:aload_1         
	//*  52  101:invokevirtual   #64  <Method int zzbez.zzacc()>
	//*  53  104:invokestatic    #70  <Method int zzia.zzd(int)>
	//*  54  107:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//*  55  110:putfield        #29  <Field Integer zzaml>
	//*  56  113:goto            0
	//*  57  116:aload_1         
	//*  58  117:iload_2         
	//*  59  118:invokevirtual   #80  <Method void zzbez.zzdc(int)>
	//*  60  121:aload_0         
	//*  61  122:aload_1         
	//*  62  123:iload_3         
	//*  63  124:invokevirtual   #58  <Method boolean zzbfc.zza(zzbez, int)>
	//*  64  127:pop             
	//*  65  128:goto            0
	//*  66  131:aload_1         
	//*  67  132:bipush          18
	//*  68  134:invokestatic    #86  <Method int zzbfl.zzb(zzbez, int)>
	//*  69  137:istore_3        
	//*  70  138:aload_0         
	//*  71  139:getfield        #27  <Field zzic[] zzamk>
	//*  72  142:ifnonnull       150
	//*  73  145:iconst_0        
	//*  74  146:istore_2        
	//*  75  147:goto            156
	//*  76  150:aload_0         
	//*  77  151:getfield        #27  <Field zzic[] zzamk>
	//*  78  154:arraylength     
	//*  79  155:istore_2        
	//*  80  156:iload_3         
	//*  81  157:iload_2         
	//*  82  158:iadd            
	//*  83  159:anewarray       zzic[]
	//*  84  162:astore          4
	//*  85  164:iload_2         
	//*  86  165:istore_3        
	//*  87  166:iload_2         
	//*  88  167:ifeq            184
	//*  89  170:aload_0         
	//*  90  171:getfield        #27  <Field zzic[] zzamk>
	//*  91  174:iconst_0        
	//*  92  175:aload           4
	//*  93  177:iconst_0        
	//*  94  178:iload_2         
	//*  95  179:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  96  182:iload_2         
	//*  97  183:istore_3        
	//*  98  184:iload_3         
	//*  99  185:aload           4
	//* 100  187:arraylength     
	//* 101  188:iconst_1        
	//* 102  189:isub            
	//* 103  190:icmpge          224
	//* 104  193:aload           4
	//* 105  195:iload_3         
	//* 106  196:new             #21  <Class zzic>
	//* 107  199:dup             
	//* 108  200:invokespecial   #93  <Method void zzic()>
	//* 109  203:aastore         
	//* 110  204:aload_1         
	//* 111  205:aload           4
	//* 112  207:iload_3         
	//* 113  208:aaload          
	//* 114  209:invokevirtual   #96  <Method void zzbez.zza(zzbfi)>
	//* 115  212:aload_1         
	//* 116  213:invokevirtual   #54  <Method int zzbez.zzabk()>
	//* 117  216:pop             
	//* 118  217:iload_3         
	//* 119  218:iconst_1        
	//* 120  219:iadd            
	//* 121  220:istore_3        
	//* 122  221:goto            184
	//* 123  224:aload           4
	//* 124  226:iload_3         
	//* 125  227:new             #21  <Class zzic>
	//* 126  230:dup             
	//* 127  231:invokespecial   #93  <Method void zzic()>
	//* 128  234:aastore         
	//* 129  235:aload_1         
	//* 130  236:aload           4
	//* 131  238:iload_3         
	//* 132  239:aaload          
	//* 133  240:invokevirtual   #96  <Method void zzbez.zza(zzbfi)>
	//* 134  243:aload_0         
	//* 135  244:aload           4
	//* 136  246:putfield        #27  <Field zzic[] zzamk>
	//* 137  249:goto            0
	//* 138  252:aload_0         
	//* 139  253:aload_1         
	//* 140  254:invokevirtual   #100 <Method String zzbez.readString()>
	//* 141  257:putfield        #19  <Field String zzamj>
	//* 142  260:goto            0
	//* 143  263:aload_0         
	//* 144  264:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					zzbez1.zzdc(i);
					((zzbfc)this).zza(zzbez1, k);
				}
			}
			continue; /* Loop/switch isn't completed */
		}
		i = zzbez1.getPosition();
		zzamm = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
		continue; /* Loop/switch isn't completed */
		i = zzbez1.getPosition();
		zzaml = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
		continue; /* Loop/switch isn't completed */
		int l = zzbfl.zzb(zzbez1, 18);
		int j;
		if(zzamk == null)
			j = 0;
		else
			j = zzamk.length;
		zzic azzic[] = new zzic[l + j];
		l = j;
		if(j != 0)
		{
			System.arraycopy(((Object) (zzamk)), 0, ((Object) (azzic)), 0, j);
			l = j;
		}
		for(; l < azzic.length - 1; l++)
		{
			azzic[l] = new zzic();
			zzbez1.zza(((zzbfi) (azzic[l])));
			zzbez1.zzabk();
		}

		azzic[l] = new zzic();
		zzbez1.zza(((zzbfi) (azzic[l])));
		zzamk = azzic;
		continue; /* Loop/switch isn't completed */
		zzamj = zzbez1.readString();
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//* 145  265:astore          4
	//* 146  267:goto            116
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzh(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method zzie zzh(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzamj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field String zzamj>
	//*   2    4:ifnull          16
			zzbfa1.zzf(1, zzamj);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field String zzamj>
	//    7   13:invokevirtual   #111 <Method void zzbfa.zzf(int, String)>
		if(zzamk != null && zzamk.length > 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #27  <Field zzic[] zzamk>
	//*  10   20:ifnull          66
	//*  11   23:aload_0         
	//*  12   24:getfield        #27  <Field zzic[] zzamk>
	//*  13   27:arraylength     
	//*  14   28:ifle            66
		{
			for(int i = 0; i < zzamk.length; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_2        
	//*  17   33:iload_2         
	//*  18   34:aload_0         
	//*  19   35:getfield        #27  <Field zzic[] zzamk>
	//*  20   38:arraylength     
	//*  21   39:icmpge          66
			{
				zzic zzic1 = zzamk[i];
	//   22   42:aload_0         
	//   23   43:getfield        #27  <Field zzic[] zzamk>
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:astore_3        
				if(zzic1 != null)
	//*  27   49:aload_3         
	//*  28   50:ifnull          59
					zzbfa1.zza(2, ((zzbfi) (zzic1)));
	//   29   53:aload_1         
	//   30   54:iconst_2        
	//   31   55:aload_3         
	//   32   56:invokevirtual   #114 <Method void zzbfa.zza(int, zzbfi)>
			}

	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		}
	//*  37   63:goto            33
		if(zzaml != null)
	//*  38   66:aload_0         
	//*  39   67:getfield        #29  <Field Integer zzaml>
	//*  40   70:ifnull          85
			zzbfa1.zzm(3, zzaml.intValue());
	//   41   73:aload_1         
	//   42   74:iconst_3        
	//   43   75:aload_0         
	//   44   76:getfield        #29  <Field Integer zzaml>
	//   45   79:invokevirtual   #117 <Method int Integer.intValue()>
	//   46   82:invokevirtual   #121 <Method void zzbfa.zzm(int, int)>
		if(zzamm != null)
	//*  47   85:aload_0         
	//*  48   86:getfield        #31  <Field Integer zzamm>
	//*  49   89:ifnull          104
			zzbfa1.zzm(4, zzamm.intValue());
	//   50   92:aload_1         
	//   51   93:iconst_4        
	//   52   94:aload_0         
	//   53   95:getfield        #31  <Field Integer zzamm>
	//   54   98:invokevirtual   #117 <Method int Integer.intValue()>
	//   55  101:invokevirtual   #121 <Method void zzbfa.zzm(int, int)>
		if(zzamn != null)
	//*  56  104:aload_0         
	//*  57  105:getfield        #33  <Field Integer zzamn>
	//*  58  108:ifnull          123
			zzbfa1.zzm(5, zzamn.intValue());
	//   59  111:aload_1         
	//   60  112:iconst_5        
	//   61  113:aload_0         
	//   62  114:getfield        #33  <Field Integer zzamn>
	//   63  117:invokevirtual   #117 <Method int Integer.intValue()>
	//   64  120:invokevirtual   #121 <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   65  123:aload_0         
	//   66  124:aload_1         
	//   67  125:invokespecial   #123 <Method void zzbfc.zza(zzbfa)>
	//   68  128:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #126 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzamj != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field String zzamj>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzg(1, zzamj);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field String zzamj>
	//   12   20:invokestatic    #130 <Method int zzbfa.zzg(int, String)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzamk != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #27  <Field zzic[] zzamk>
	//*  19   31:ifnull          90
		{
			j = i;
	//   20   34:iload_1         
	//   21   35:istore_2        
			if(zzamk.length > 0)
	//*  22   36:aload_0         
	//*  23   37:getfield        #27  <Field zzic[] zzamk>
	//*  24   40:arraylength     
	//*  25   41:ifle            90
			{
				int k = 0;
	//   26   44:iconst_0        
	//   27   45:istore_3        
				do
				{
					j = i;
	//   28   46:iload_1         
	//   29   47:istore_2        
					if(k >= zzamk.length)
						break;
	//   30   48:iload_3         
	//   31   49:aload_0         
	//   32   50:getfield        #27  <Field zzic[] zzamk>
	//   33   53:arraylength     
	//   34   54:icmpge          90
					zzic zzic1 = zzamk[k];
	//   35   57:aload_0         
	//   36   58:getfield        #27  <Field zzic[] zzamk>
	//   37   61:iload_3         
	//   38   62:aaload          
	//   39   63:astore          4
					j = i;
	//   40   65:iload_1         
	//   41   66:istore_2        
					if(zzic1 != null)
	//*  42   67:aload           4
	//*  43   69:ifnull          81
						j = i + zzbfa.zzb(2, ((zzbfi) (zzic1)));
	//   44   72:iload_1         
	//   45   73:iconst_2        
	//   46   74:aload           4
	//   47   76:invokestatic    #133 <Method int zzbfa.zzb(int, zzbfi)>
	//   48   79:iadd            
	//   49   80:istore_2        
					k++;
	//   50   81:iload_3         
	//   51   82:iconst_1        
	//   52   83:iadd            
	//   53   84:istore_3        
					i = j;
	//   54   85:iload_2         
	//   55   86:istore_1        
				} while(true);
	//   56   87:goto            46
			}
		}
		i = j;
	//   57   90:iload_2         
	//   58   91:istore_1        
		if(zzaml != null)
	//*  59   92:aload_0         
	//*  60   93:getfield        #29  <Field Integer zzaml>
	//*  61   96:ifnull          113
			i = j + zzbfa.zzq(3, zzaml.intValue());
	//   62   99:iload_2         
	//   63  100:iconst_3        
	//   64  101:aload_0         
	//   65  102:getfield        #29  <Field Integer zzaml>
	//   66  105:invokevirtual   #117 <Method int Integer.intValue()>
	//   67  108:invokestatic    #137 <Method int zzbfa.zzq(int, int)>
	//   68  111:iadd            
	//   69  112:istore_1        
		j = i;
	//   70  113:iload_1         
	//   71  114:istore_2        
		if(zzamm != null)
	//*  72  115:aload_0         
	//*  73  116:getfield        #31  <Field Integer zzamm>
	//*  74  119:ifnull          136
			j = i + zzbfa.zzq(4, zzamm.intValue());
	//   75  122:iload_1         
	//   76  123:iconst_4        
	//   77  124:aload_0         
	//   78  125:getfield        #31  <Field Integer zzamm>
	//   79  128:invokevirtual   #117 <Method int Integer.intValue()>
	//   80  131:invokestatic    #137 <Method int zzbfa.zzq(int, int)>
	//   81  134:iadd            
	//   82  135:istore_2        
		i = j;
	//   83  136:iload_2         
	//   84  137:istore_1        
		if(zzamn != null)
	//*  85  138:aload_0         
	//*  86  139:getfield        #33  <Field Integer zzamn>
	//*  87  142:ifnull          159
			i = j + zzbfa.zzq(5, zzamn.intValue());
	//   88  145:iload_2         
	//   89  146:iconst_5        
	//   90  147:aload_0         
	//   91  148:getfield        #33  <Field Integer zzamn>
	//   92  151:invokevirtual   #117 <Method int Integer.intValue()>
	//   93  154:invokestatic    #137 <Method int zzbfa.zzq(int, int)>
	//   94  157:iadd            
	//   95  158:istore_1        
		return i;
	//   96  159:iload_1         
	//   97  160:ireturn         
	}

	private String zzamj;
	private zzic zzamk[];
	private Integer zzaml;
	private Integer zzamm;
	private Integer zzamn;
}
