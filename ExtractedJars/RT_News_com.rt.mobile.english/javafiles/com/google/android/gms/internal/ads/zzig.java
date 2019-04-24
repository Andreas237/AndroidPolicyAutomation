// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzia, zzit, 
//			zzis, zzbfa, zzbfi

public final class zzig extends zzbfc
{

	public zzig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zzbfc()>
		zzamu = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field String zzamu>
		zzamv = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field zzis zzamv>
		zzamw = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #27  <Field Integer zzamw>
		zzamx = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #29  <Field zzit zzamx>
		zzamy = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #31  <Field Integer zzamy>
		zzamz = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #33  <Field Integer zzamz>
		zzana = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #35  <Field Integer zzana>
		zzanb = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #37  <Field Integer zzanb>
		zzebk = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #41  <Field zzbfe zzebk>
		zzebt = -1;
	//   29   49:aload_0         
	//   30   50:iconst_m1       
	//   31   51:putfield        #45  <Field int zzebt>
	//   32   54:return          
	}

	private final zzig zzi(zzbez zzbez1)
		throws IOException
	{
_L2:
		int j = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method int zzbez.zzabk()>
	//    2    4:istore_3        
		if(j == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_3         
	//    4    6:ifeq            248
		if(j == 10)
			break MISSING_BLOCK_LABEL_237;
	//    5    9:iload_3         
	//    6   10:bipush          10
	//    7   12:icmpeq          237
		if(j == 18)
			break MISSING_BLOCK_LABEL_204;
	//    8   15:iload_3         
	//    9   16:bipush          18
	//   10   18:icmpeq          204
		if(j == 24)
			break MISSING_BLOCK_LABEL_190;
	//   11   21:iload_3         
	//   12   22:bipush          24
	//   13   24:icmpeq          190
		if(j == 34)
			break MISSING_BLOCK_LABEL_163;
	//   14   27:iload_3         
	//   15   28:bipush          34
	//   16   30:icmpeq          163
		if(j == 40)
			break MISSING_BLOCK_LABEL_149;
	//   17   33:iload_3         
	//   18   34:bipush          40
	//   19   36:icmpeq          149
		if(j == 48)
			break MISSING_BLOCK_LABEL_112;
	//   20   39:iload_3         
	//   21   40:bipush          48
	//   22   42:icmpeq          112
		if(j != 56)
	//*  23   45:iload_3         
	//*  24   46:bipush          56
	//*  25   48:icmpeq          90
		{
			if(j != 64)
	//*  26   51:iload_3         
	//*  27   52:bipush          64
	//*  28   54:icmpeq          68
			{
				if(!super.zza(zzbez1, j))
	//*  29   57:aload_0         
	//*  30   58:aload_1         
	//*  31   59:iload_3         
	//*  32   60:invokespecial   #62  <Method boolean zzbfc.zza(zzbez, int)>
	//*  33   63:ifne            0
					return this;
	//   34   66:aload_0         
	//   35   67:areturn         
			} else
			{
				int i = zzbez1.getPosition();
	//   36   68:aload_1         
	//   37   69:invokevirtual   #65  <Method int zzbez.getPosition()>
	//   38   72:istore_2        
				try
				{
					zzanb = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   39   73:aload_0         
	//   40   74:aload_1         
	//   41   75:invokevirtual   #68  <Method int zzbez.zzacc()>
	//   42   78:invokestatic    #74  <Method int zzia.zzd(int)>
	//   43   81:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//   44   84:putfield        #37  <Field Integer zzanb>
				}
	//*  45   87:goto            0
	//*  46   90:aload_1         
	//*  47   91:invokevirtual   #65  <Method int zzbez.getPosition()>
	//*  48   94:istore_2        
	//*  49   95:aload_0         
	//*  50   96:aload_1         
	//*  51   97:invokevirtual   #68  <Method int zzbez.zzacc()>
	//*  52  100:invokestatic    #74  <Method int zzia.zzd(int)>
	//*  53  103:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//*  54  106:putfield        #35  <Field Integer zzana>
	//*  55  109:goto            0
	//*  56  112:aload_1         
	//*  57  113:invokevirtual   #65  <Method int zzbez.getPosition()>
	//*  58  116:istore_2        
	//*  59  117:aload_0         
	//*  60  118:aload_1         
	//*  61  119:invokevirtual   #68  <Method int zzbez.zzacc()>
	//*  62  122:invokestatic    #74  <Method int zzia.zzd(int)>
	//*  63  125:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//*  64  128:putfield        #33  <Field Integer zzamz>
	//*  65  131:goto            0
	//*  66  134:aload_1         
	//*  67  135:iload_2         
	//*  68  136:invokevirtual   #84  <Method void zzbez.zzdc(int)>
	//*  69  139:aload_0         
	//*  70  140:aload_1         
	//*  71  141:iload_3         
	//*  72  142:invokevirtual   #62  <Method boolean zzbfc.zza(zzbez, int)>
	//*  73  145:pop             
	//*  74  146:goto            0
	//*  75  149:aload_0         
	//*  76  150:aload_1         
	//*  77  151:invokevirtual   #68  <Method int zzbez.zzacc()>
	//*  78  154:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//*  79  157:putfield        #31  <Field Integer zzamy>
	//*  80  160:goto            0
	//*  81  163:aload_0         
	//*  82  164:getfield        #29  <Field zzit zzamx>
	//*  83  167:ifnonnull       181
	//*  84  170:aload_0         
	//*  85  171:new             #86  <Class zzit>
	//*  86  174:dup             
	//*  87  175:invokespecial   #87  <Method void zzit()>
	//*  88  178:putfield        #29  <Field zzit zzamx>
	//*  89  181:aload_0         
	//*  90  182:getfield        #29  <Field zzit zzamx>
	//*  91  185:astore          4
	//*  92  187:goto            228
	//*  93  190:aload_0         
	//*  94  191:aload_1         
	//*  95  192:invokevirtual   #68  <Method int zzbez.zzacc()>
	//*  96  195:invokestatic    #80  <Method Integer Integer.valueOf(int)>
	//*  97  198:putfield        #27  <Field Integer zzamw>
	//*  98  201:goto            0
	//*  99  204:aload_0         
	//* 100  205:getfield        #25  <Field zzis zzamv>
	//* 101  208:ifnonnull       222
	//* 102  211:aload_0         
	//* 103  212:new             #89  <Class zzis>
	//* 104  215:dup             
	//* 105  216:invokespecial   #90  <Method void zzis()>
	//* 106  219:putfield        #25  <Field zzis zzamv>
	//* 107  222:aload_0         
	//* 108  223:getfield        #25  <Field zzis zzamv>
	//* 109  226:astore          4
	//* 110  228:aload_1         
	//* 111  229:aload           4
	//* 112  231:invokevirtual   #93  <Method void zzbez.zza(zzbfi)>
	//* 113  234:goto            0
	//* 114  237:aload_0         
	//* 115  238:aload_1         
	//* 116  239:invokevirtual   #97  <Method String zzbez.readString()>
	//* 117  242:putfield        #23  <Field String zzamu>
	//* 118  245:goto            0
	//* 119  248:aload_0         
	//* 120  249:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					zzbez1.zzdc(i);
					((zzbfc)this).zza(zzbez1, j);
				}
			}
			continue; /* Loop/switch isn't completed */
		}
		i = zzbez1.getPosition();
		zzana = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
		continue; /* Loop/switch isn't completed */
		i = zzbez1.getPosition();
		zzamz = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
		continue; /* Loop/switch isn't completed */
		zzamy = Integer.valueOf(zzbez1.zzacc());
		continue; /* Loop/switch isn't completed */
		Object obj;
		if(zzamx == null)
			zzamx = new zzit();
		obj = ((Object) (zzamx));
		break MISSING_BLOCK_LABEL_228;
		zzamw = Integer.valueOf(zzbez1.zzacc());
		continue; /* Loop/switch isn't completed */
		if(zzamv == null)
			zzamv = new zzis();
		obj = ((Object) (zzamv));
		zzbez1.zza(((zzbfi) (obj)));
		continue; /* Loop/switch isn't completed */
		zzamu = zzbez1.readString();
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//* 121  250:astore          4
	//* 122  252:goto            134
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzi(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method zzig zzi(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzamu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field String zzamu>
	//*   2    4:ifnull          16
			zzbfa1.zzf(1, zzamu);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String zzamu>
	//    7   13:invokevirtual   #108 <Method void zzbfa.zzf(int, String)>
		if(zzamv != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #25  <Field zzis zzamv>
	//*  10   20:ifnull          32
			zzbfa1.zza(2, ((zzbfi) (zzamv)));
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field zzis zzamv>
	//   15   29:invokevirtual   #111 <Method void zzbfa.zza(int, zzbfi)>
		if(zzamw != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #27  <Field Integer zzamw>
	//*  18   36:ifnull          51
			zzbfa1.zzm(3, zzamw.intValue());
	//   19   39:aload_1         
	//   20   40:iconst_3        
	//   21   41:aload_0         
	//   22   42:getfield        #27  <Field Integer zzamw>
	//   23   45:invokevirtual   #114 <Method int Integer.intValue()>
	//   24   48:invokevirtual   #118 <Method void zzbfa.zzm(int, int)>
		if(zzamx != null)
	//*  25   51:aload_0         
	//*  26   52:getfield        #29  <Field zzit zzamx>
	//*  27   55:ifnull          67
			zzbfa1.zza(4, ((zzbfi) (zzamx)));
	//   28   58:aload_1         
	//   29   59:iconst_4        
	//   30   60:aload_0         
	//   31   61:getfield        #29  <Field zzit zzamx>
	//   32   64:invokevirtual   #111 <Method void zzbfa.zza(int, zzbfi)>
		if(zzamy != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #31  <Field Integer zzamy>
	//*  35   71:ifnull          86
			zzbfa1.zzm(5, zzamy.intValue());
	//   36   74:aload_1         
	//   37   75:iconst_5        
	//   38   76:aload_0         
	//   39   77:getfield        #31  <Field Integer zzamy>
	//   40   80:invokevirtual   #114 <Method int Integer.intValue()>
	//   41   83:invokevirtual   #118 <Method void zzbfa.zzm(int, int)>
		if(zzamz != null)
	//*  42   86:aload_0         
	//*  43   87:getfield        #33  <Field Integer zzamz>
	//*  44   90:ifnull          106
			zzbfa1.zzm(6, zzamz.intValue());
	//   45   93:aload_1         
	//   46   94:bipush          6
	//   47   96:aload_0         
	//   48   97:getfield        #33  <Field Integer zzamz>
	//   49  100:invokevirtual   #114 <Method int Integer.intValue()>
	//   50  103:invokevirtual   #118 <Method void zzbfa.zzm(int, int)>
		if(zzana != null)
	//*  51  106:aload_0         
	//*  52  107:getfield        #35  <Field Integer zzana>
	//*  53  110:ifnull          126
			zzbfa1.zzm(7, zzana.intValue());
	//   54  113:aload_1         
	//   55  114:bipush          7
	//   56  116:aload_0         
	//   57  117:getfield        #35  <Field Integer zzana>
	//   58  120:invokevirtual   #114 <Method int Integer.intValue()>
	//   59  123:invokevirtual   #118 <Method void zzbfa.zzm(int, int)>
		if(zzanb != null)
	//*  60  126:aload_0         
	//*  61  127:getfield        #37  <Field Integer zzanb>
	//*  62  130:ifnull          146
			zzbfa1.zzm(8, zzanb.intValue());
	//   63  133:aload_1         
	//   64  134:bipush          8
	//   65  136:aload_0         
	//   66  137:getfield        #37  <Field Integer zzanb>
	//   67  140:invokevirtual   #114 <Method int Integer.intValue()>
	//   68  143:invokevirtual   #118 <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   69  146:aload_0         
	//   70  147:aload_1         
	//   71  148:invokespecial   #120 <Method void zzbfc.zza(zzbfa)>
	//   72  151:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzamu != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #23  <Field String zzamu>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzg(1, zzamu);
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #23  <Field String zzamu>
	//   12   20:invokestatic    #127 <Method int zzbfa.zzg(int, String)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzamv != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #25  <Field zzis zzamv>
	//*  19   31:ifnull          45
			j = i + zzbfa.zzb(2, ((zzbfi) (zzamv)));
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #25  <Field zzis zzamv>
	//   24   40:invokestatic    #131 <Method int zzbfa.zzb(int, zzbfi)>
	//   25   43:iadd            
	//   26   44:istore_2        
		i = j;
	//   27   45:iload_2         
	//   28   46:istore_1        
		if(zzamw != null)
	//*  29   47:aload_0         
	//*  30   48:getfield        #27  <Field Integer zzamw>
	//*  31   51:ifnull          68
			i = j + zzbfa.zzq(3, zzamw.intValue());
	//   32   54:iload_2         
	//   33   55:iconst_3        
	//   34   56:aload_0         
	//   35   57:getfield        #27  <Field Integer zzamw>
	//   36   60:invokevirtual   #114 <Method int Integer.intValue()>
	//   37   63:invokestatic    #135 <Method int zzbfa.zzq(int, int)>
	//   38   66:iadd            
	//   39   67:istore_1        
		j = i;
	//   40   68:iload_1         
	//   41   69:istore_2        
		if(zzamx != null)
	//*  42   70:aload_0         
	//*  43   71:getfield        #29  <Field zzit zzamx>
	//*  44   74:ifnull          88
			j = i + zzbfa.zzb(4, ((zzbfi) (zzamx)));
	//   45   77:iload_1         
	//   46   78:iconst_4        
	//   47   79:aload_0         
	//   48   80:getfield        #29  <Field zzit zzamx>
	//   49   83:invokestatic    #131 <Method int zzbfa.zzb(int, zzbfi)>
	//   50   86:iadd            
	//   51   87:istore_2        
		i = j;
	//   52   88:iload_2         
	//   53   89:istore_1        
		if(zzamy != null)
	//*  54   90:aload_0         
	//*  55   91:getfield        #31  <Field Integer zzamy>
	//*  56   94:ifnull          111
			i = j + zzbfa.zzq(5, zzamy.intValue());
	//   57   97:iload_2         
	//   58   98:iconst_5        
	//   59   99:aload_0         
	//   60  100:getfield        #31  <Field Integer zzamy>
	//   61  103:invokevirtual   #114 <Method int Integer.intValue()>
	//   62  106:invokestatic    #135 <Method int zzbfa.zzq(int, int)>
	//   63  109:iadd            
	//   64  110:istore_1        
		j = i;
	//   65  111:iload_1         
	//   66  112:istore_2        
		if(zzamz != null)
	//*  67  113:aload_0         
	//*  68  114:getfield        #33  <Field Integer zzamz>
	//*  69  117:ifnull          135
			j = i + zzbfa.zzq(6, zzamz.intValue());
	//   70  120:iload_1         
	//   71  121:bipush          6
	//   72  123:aload_0         
	//   73  124:getfield        #33  <Field Integer zzamz>
	//   74  127:invokevirtual   #114 <Method int Integer.intValue()>
	//   75  130:invokestatic    #135 <Method int zzbfa.zzq(int, int)>
	//   76  133:iadd            
	//   77  134:istore_2        
		i = j;
	//   78  135:iload_2         
	//   79  136:istore_1        
		if(zzana != null)
	//*  80  137:aload_0         
	//*  81  138:getfield        #35  <Field Integer zzana>
	//*  82  141:ifnull          159
			i = j + zzbfa.zzq(7, zzana.intValue());
	//   83  144:iload_2         
	//   84  145:bipush          7
	//   85  147:aload_0         
	//   86  148:getfield        #35  <Field Integer zzana>
	//   87  151:invokevirtual   #114 <Method int Integer.intValue()>
	//   88  154:invokestatic    #135 <Method int zzbfa.zzq(int, int)>
	//   89  157:iadd            
	//   90  158:istore_1        
		j = i;
	//   91  159:iload_1         
	//   92  160:istore_2        
		if(zzanb != null)
	//*  93  161:aload_0         
	//*  94  162:getfield        #37  <Field Integer zzanb>
	//*  95  165:ifnull          183
			j = i + zzbfa.zzq(8, zzanb.intValue());
	//   96  168:iload_1         
	//   97  169:bipush          8
	//   98  171:aload_0         
	//   99  172:getfield        #37  <Field Integer zzanb>
	//  100  175:invokevirtual   #114 <Method int Integer.intValue()>
	//  101  178:invokestatic    #135 <Method int zzbfa.zzq(int, int)>
	//  102  181:iadd            
	//  103  182:istore_2        
		return j;
	//  104  183:iload_2         
	//  105  184:ireturn         
	}

	public String zzamu;
	private zzis zzamv;
	private Integer zzamw;
	public zzit zzamx;
	private Integer zzamy;
	private Integer zzamz;
	private Integer zzana;
	private Integer zzanb;
}
