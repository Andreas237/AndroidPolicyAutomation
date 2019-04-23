// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzfm, zzfj, zzyg, 
//			zzye, zzxz, zzyl, zzya, 
//			zzyi

public final class zzfi extends zzyc
{

	public zzfi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzyc()>
		zzave = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field Integer zzave>
		zzavf = zzfm.zzmu();
	//    5    9:aload_0         
	//    6   10:invokestatic    #28  <Method zzfm[] zzfm.zzmu()>
	//    7   13:putfield        #30  <Field zzfm[] zzavf>
		zzavg = zzfj.zzms();
	//    8   16:aload_0         
	//    9   17:invokestatic    #36  <Method zzfj[] zzfj.zzms()>
	//   10   20:putfield        #38  <Field zzfj[] zzavg>
		zzavh = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #40  <Field Boolean zzavh>
		zzavi = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #42  <Field Boolean zzavi>
		zzcet = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #46  <Field zzye zzcet>
		zzcfd = -1;
	//   20   38:aload_0         
	//   21   39:iconst_m1       
	//   22   40:putfield        #50  <Field int zzcfd>
	//   23   43:return          
	}

	public static zzfi[] zzmr()
	{
		if(zzavd == null)
	//*   0    0:getstatic       #55  <Field zzfi[] zzavd>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #61  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzavd == null)
	//*   6   12:getstatic       #55  <Field zzfi[] zzavd>
	//*   7   15:ifnonnull       25
					zzavd = new zzfi[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfi[]
	//   10   22:putstatic       #55  <Field zzfi[] zzavd>
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
		return zzavd;
	//   19   35:getstatic       #55  <Field zzfi[] zzavd>
	//   20   38:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzfi))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfi>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfi)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfi>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzave));
	//   13   21:aload_0         
	//   14   22:getfield        #22  <Field Integer zzave>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfi) (obj)).zzave != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #22  <Field Integer zzave>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfi) (obj)).zzave))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #22  <Field Integer zzave>
	//*  26   44:invokevirtual   #67  <Method boolean Integer.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		if(!zzyg.equals(((Object []) (zzavf)), ((Object []) (((zzfi) (obj)).zzavf))))
	//*  30   52:aload_0         
	//*  31   53:getfield        #30  <Field zzfm[] zzavf>
	//*  32   56:aload_1         
	//*  33   57:getfield        #30  <Field zzfm[] zzavf>
	//*  34   60:invokestatic    #70  <Method boolean zzyg.equals(Object[], Object[])>
	//*  35   63:ifne            68
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		if(!zzyg.equals(((Object []) (zzavg)), ((Object []) (((zzfi) (obj)).zzavg))))
	//*  38   68:aload_0         
	//*  39   69:getfield        #38  <Field zzfj[] zzavg>
	//*  40   72:aload_1         
	//*  41   73:getfield        #38  <Field zzfj[] zzavg>
	//*  42   76:invokestatic    #70  <Method boolean zzyg.equals(Object[], Object[])>
	//*  43   79:ifne            84
			return false;
	//   44   82:iconst_0        
	//   45   83:ireturn         
		obj1 = ((Object) (zzavh));
	//   46   84:aload_0         
	//   47   85:getfield        #40  <Field Boolean zzavh>
	//   48   88:astore_2        
		if(obj1 == null)
	//*  49   89:aload_2         
	//*  50   90:ifnonnull       102
		{
			if(((zzfi) (obj)).zzavh != null)
	//*  51   93:aload_1         
	//*  52   94:getfield        #40  <Field Boolean zzavh>
	//*  53   97:ifnull          115
				return false;
	//   54  100:iconst_0        
	//   55  101:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfi) (obj)).zzavh))))
	//*  56  102:aload_2         
	//*  57  103:aload_1         
	//*  58  104:getfield        #40  <Field Boolean zzavh>
	//*  59  107:invokevirtual   #73  <Method boolean Boolean.equals(Object)>
	//*  60  110:ifne            115
			return false;
	//   61  113:iconst_0        
	//   62  114:ireturn         
		obj1 = ((Object) (zzavi));
	//   63  115:aload_0         
	//   64  116:getfield        #42  <Field Boolean zzavi>
	//   65  119:astore_2        
		if(obj1 == null)
	//*  66  120:aload_2         
	//*  67  121:ifnonnull       133
		{
			if(((zzfi) (obj)).zzavi != null)
	//*  68  124:aload_1         
	//*  69  125:getfield        #42  <Field Boolean zzavi>
	//*  70  128:ifnull          146
				return false;
	//   71  131:iconst_0        
	//   72  132:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfi) (obj)).zzavi))))
	//*  73  133:aload_2         
	//*  74  134:aload_1         
	//*  75  135:getfield        #42  <Field Boolean zzavi>
	//*  76  138:invokevirtual   #73  <Method boolean Boolean.equals(Object)>
	//*  77  141:ifne            146
			return false;
	//   78  144:iconst_0        
	//   79  145:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  80  146:aload_0         
	//*  81  147:getfield        #46  <Field zzye zzcet>
	//*  82  150:ifnull          178
	//*  83  153:aload_0         
	//*  84  154:getfield        #46  <Field zzye zzcet>
	//*  85  157:invokevirtual   #79  <Method boolean zzye.isEmpty()>
	//*  86  160:ifeq            166
	//*  87  163:goto            178
			return zzcet.equals(((Object) (((zzfi) (obj)).zzcet)));
	//   88  166:aload_0         
	//   89  167:getfield        #46  <Field zzye zzcet>
	//   90  170:aload_1         
	//   91  171:getfield        #46  <Field zzye zzcet>
	//   92  174:invokevirtual   #80  <Method boolean zzye.equals(Object)>
	//   93  177:ireturn         
		if(((zzfi) (obj)).zzcet != null)
	//*  94  178:aload_1         
	//*  95  179:getfield        #46  <Field zzye zzcet>
	//*  96  182:ifnull          199
			return ((zzfi) (obj)).zzcet.isEmpty();
	//   97  185:aload_1         
	//   98  186:getfield        #46  <Field zzye zzcet>
	//   99  189:invokevirtual   #79  <Method boolean zzye.isEmpty()>
	//  100  192:ifeq            197
	//  101  195:iconst_1        
	//  102  196:ireturn         
	//  103  197:iconst_0        
	//  104  198:ireturn         
		else
			return true;
	//  105  199:iconst_1        
	//  106  200:ireturn         
	}

	public final int hashCode()
	{
		int i1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #94  <Method String Class.getName()>
	//    3    7:invokevirtual   #98  <Method int String.hashCode()>
	//    4   10:istore          6
		Object obj = ((Object) (zzave));
	//    5   12:aload_0         
	//    6   13:getfield        #22  <Field Integer zzave>
	//    7   16:astore          9
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          5
		int i;
		if(obj == null)
	//*  10   21:aload           9
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((Integer) (obj)).hashCode();
	//   15   31:aload           9
	//   16   33:invokevirtual   #99  <Method int Integer.hashCode()>
	//   17   36:istore_1        
		int j1 = zzyg.hashCode(((Object []) (zzavf)));
	//   18   37:aload_0         
	//   19   38:getfield        #30  <Field zzfm[] zzavf>
	//   20   41:invokestatic    #102 <Method int zzyg.hashCode(Object[])>
	//   21   44:istore          7
		int k1 = zzyg.hashCode(((Object []) (zzavg)));
	//   22   46:aload_0         
	//   23   47:getfield        #38  <Field zzfj[] zzavg>
	//   24   50:invokestatic    #102 <Method int zzyg.hashCode(Object[])>
	//   25   53:istore          8
		obj = ((Object) (zzavh));
	//   26   55:aload_0         
	//   27   56:getfield        #40  <Field Boolean zzavh>
	//   28   59:astore          9
		int j;
		if(obj == null)
	//*  29   61:aload           9
	//*  30   63:ifnonnull       71
			j = 0;
	//   31   66:iconst_0        
	//   32   67:istore_2        
		else
	//*  33   68:goto            77
			j = ((Boolean) (obj)).hashCode();
	//   34   71:aload           9
	//   35   73:invokevirtual   #103 <Method int Boolean.hashCode()>
	//   36   76:istore_2        
		obj = ((Object) (zzavi));
	//   37   77:aload_0         
	//   38   78:getfield        #42  <Field Boolean zzavi>
	//   39   81:astore          9
		int k;
		if(obj == null)
	//*  40   83:aload           9
	//*  41   85:ifnonnull       93
			k = 0;
	//   42   88:iconst_0        
	//   43   89:istore_3        
		else
	//*  44   90:goto            99
			k = ((Boolean) (obj)).hashCode();
	//   45   93:aload           9
	//   46   95:invokevirtual   #103 <Method int Boolean.hashCode()>
	//   47   98:istore_3        
		int l = ((int) (flag));
	//   48   99:iload           5
	//   49  101:istore          4
		if(zzcet != null)
	//*  50  103:aload_0         
	//*  51  104:getfield        #46  <Field zzye zzcet>
	//*  52  107:ifnull          136
			if(zzcet.isEmpty())
	//*  53  110:aload_0         
	//*  54  111:getfield        #46  <Field zzye zzcet>
	//*  55  114:invokevirtual   #79  <Method boolean zzye.isEmpty()>
	//*  56  117:ifeq            127
				l = ((int) (flag));
	//   57  120:iload           5
	//   58  122:istore          4
			else
	//*  59  124:goto            136
				l = zzcet.hashCode();
	//   60  127:aload_0         
	//   61  128:getfield        #46  <Field zzye zzcet>
	//   62  131:invokevirtual   #104 <Method int zzye.hashCode()>
	//   63  134:istore          4
		return ((((((i1 + 527) * 31 + i) * 31 + j1) * 31 + k1) * 31 + j) * 31 + k) * 31 + l;
	//   64  136:iload           6
	//   65  138:sipush          527
	//   66  141:iadd            
	//   67  142:bipush          31
	//   68  144:imul            
	//   69  145:iload_1         
	//   70  146:iadd            
	//   71  147:bipush          31
	//   72  149:imul            
	//   73  150:iload           7
	//   74  152:iadd            
	//   75  153:bipush          31
	//   76  155:imul            
	//   77  156:iload           8
	//   78  158:iadd            
	//   79  159:bipush          31
	//   80  161:imul            
	//   81  162:iload_2         
	//   82  163:iadd            
	//   83  164:bipush          31
	//   84  166:imul            
	//   85  167:iload_3         
	//   86  168:iadd            
	//   87  169:bipush          31
	//   88  171:imul            
	//   89  172:iload           4
	//   90  174:iadd            
	//   91  175:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #113 <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            338
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          324
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          201
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          78
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          64
						{
							if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          50
							{
								if(!super.zza(zzxz1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #116 <Method boolean zzyc.zza(zzxz, int)>
	//*  24   45:ifne            0
									return ((zzyi) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								zzavi = Boolean.valueOf(zzxz1.zzup());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #119 <Method boolean zzxz.zzup()>
	//   30   55:invokestatic    #123 <Method Boolean Boolean.valueOf(boolean)>
	//   31   58:putfield        #42  <Field Boolean zzavi>
							}
						} else
	//*  32   61:goto            0
						{
							zzavh = Boolean.valueOf(zzxz1.zzup());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #119 <Method boolean zzxz.zzup()>
	//   36   69:invokestatic    #123 <Method Boolean Boolean.valueOf(boolean)>
	//   37   72:putfield        #40  <Field Boolean zzavh>
						}
					} else
	//*  38   75:goto            0
					{
						int l = zzyl.zzb(zzxz1, 26);
	//   39   78:aload_1         
	//   40   79:bipush          26
	//   41   81:invokestatic    #129 <Method int zzyl.zzb(zzxz, int)>
	//   42   84:istore_3        
						zzfj azzfj[] = zzavg;
	//   43   85:aload_0         
	//   44   86:getfield        #38  <Field zzfj[] zzavg>
	//   45   89:astore          4
						int j;
						if(azzfj == null)
	//*  46   91:aload           4
	//*  47   93:ifnonnull       101
							j = 0;
	//   48   96:iconst_0        
	//   49   97:istore_2        
						else
	//*  50   98:goto            105
							j = azzfj.length;
	//   51  101:aload           4
	//   52  103:arraylength     
	//   53  104:istore_2        
						azzfj = new zzfj[l + j];
	//   54  105:iload_3         
	//   55  106:iload_2         
	//   56  107:iadd            
	//   57  108:anewarray       zzfj[]
	//   58  111:astore          4
						l = j;
	//   59  113:iload_2         
	//   60  114:istore_3        
						if(j != 0)
	//*  61  115:iload_2         
	//*  62  116:ifeq            133
						{
							System.arraycopy(((Object) (zzavg)), 0, ((Object) (azzfj)), 0, j);
	//   63  119:aload_0         
	//   64  120:getfield        #38  <Field zzfj[] zzavg>
	//   65  123:iconst_0        
	//   66  124:aload           4
	//   67  126:iconst_0        
	//   68  127:iload_2         
	//   69  128:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
							l = j;
	//   70  131:iload_2         
	//   71  132:istore_3        
						}
						for(; l < azzfj.length - 1; l++)
	//*  72  133:iload_3         
	//*  73  134:aload           4
	//*  74  136:arraylength     
	//*  75  137:iconst_1        
	//*  76  138:isub            
	//*  77  139:icmpge          173
						{
							azzfj[l] = new zzfj();
	//   78  142:aload           4
	//   79  144:iload_3         
	//   80  145:new             #32  <Class zzfj>
	//   81  148:dup             
	//   82  149:invokespecial   #136 <Method void zzfj()>
	//   83  152:aastore         
							zzxz1.zza(((zzyi) (azzfj[l])));
	//   84  153:aload_1         
	//   85  154:aload           4
	//   86  156:iload_3         
	//   87  157:aaload          
	//   88  158:invokevirtual   #139 <Method void zzxz.zza(zzyi)>
							zzxz1.zzuj();
	//   89  161:aload_1         
	//   90  162:invokevirtual   #113 <Method int zzxz.zzuj()>
	//   91  165:pop             
						}

	//   92  166:iload_3         
	//   93  167:iconst_1        
	//   94  168:iadd            
	//   95  169:istore_3        
	//*  96  170:goto            133
						azzfj[l] = new zzfj();
	//   97  173:aload           4
	//   98  175:iload_3         
	//   99  176:new             #32  <Class zzfj>
	//  100  179:dup             
	//  101  180:invokespecial   #136 <Method void zzfj()>
	//  102  183:aastore         
						zzxz1.zza(((zzyi) (azzfj[l])));
	//  103  184:aload_1         
	//  104  185:aload           4
	//  105  187:iload_3         
	//  106  188:aaload          
	//  107  189:invokevirtual   #139 <Method void zzxz.zza(zzyi)>
						zzavg = azzfj;
	//  108  192:aload_0         
	//  109  193:aload           4
	//  110  195:putfield        #38  <Field zzfj[] zzavg>
					}
				} else
	//* 111  198:goto            0
				{
					int i1 = zzyl.zzb(zzxz1, 18);
	//  112  201:aload_1         
	//  113  202:bipush          18
	//  114  204:invokestatic    #129 <Method int zzyl.zzb(zzxz, int)>
	//  115  207:istore_3        
					zzfm azzfm[] = zzavf;
	//  116  208:aload_0         
	//  117  209:getfield        #30  <Field zzfm[] zzavf>
	//  118  212:astore          4
					int k;
					if(azzfm == null)
	//* 119  214:aload           4
	//* 120  216:ifnonnull       224
						k = 0;
	//  121  219:iconst_0        
	//  122  220:istore_2        
					else
	//* 123  221:goto            228
						k = azzfm.length;
	//  124  224:aload           4
	//  125  226:arraylength     
	//  126  227:istore_2        
					azzfm = new zzfm[i1 + k];
	//  127  228:iload_3         
	//  128  229:iload_2         
	//  129  230:iadd            
	//  130  231:anewarray       zzfm[]
	//  131  234:astore          4
					i1 = k;
	//  132  236:iload_2         
	//  133  237:istore_3        
					if(k != 0)
	//* 134  238:iload_2         
	//* 135  239:ifeq            256
					{
						System.arraycopy(((Object) (zzavf)), 0, ((Object) (azzfm)), 0, k);
	//  136  242:aload_0         
	//  137  243:getfield        #30  <Field zzfm[] zzavf>
	//  138  246:iconst_0        
	//  139  247:aload           4
	//  140  249:iconst_0        
	//  141  250:iload_2         
	//  142  251:invokestatic    #135 <Method void System.arraycopy(Object, int, Object, int, int)>
						i1 = k;
	//  143  254:iload_2         
	//  144  255:istore_3        
					}
					for(; i1 < azzfm.length - 1; i1++)
	//* 145  256:iload_3         
	//* 146  257:aload           4
	//* 147  259:arraylength     
	//* 148  260:iconst_1        
	//* 149  261:isub            
	//* 150  262:icmpge          296
					{
						azzfm[i1] = new zzfm();
	//  151  265:aload           4
	//  152  267:iload_3         
	//  153  268:new             #24  <Class zzfm>
	//  154  271:dup             
	//  155  272:invokespecial   #140 <Method void zzfm()>
	//  156  275:aastore         
						zzxz1.zza(((zzyi) (azzfm[i1])));
	//  157  276:aload_1         
	//  158  277:aload           4
	//  159  279:iload_3         
	//  160  280:aaload          
	//  161  281:invokevirtual   #139 <Method void zzxz.zza(zzyi)>
						zzxz1.zzuj();
	//  162  284:aload_1         
	//  163  285:invokevirtual   #113 <Method int zzxz.zzuj()>
	//  164  288:pop             
					}

	//  165  289:iload_3         
	//  166  290:iconst_1        
	//  167  291:iadd            
	//  168  292:istore_3        
	//* 169  293:goto            256
					azzfm[i1] = new zzfm();
	//  170  296:aload           4
	//  171  298:iload_3         
	//  172  299:new             #24  <Class zzfm>
	//  173  302:dup             
	//  174  303:invokespecial   #140 <Method void zzfm()>
	//  175  306:aastore         
					zzxz1.zza(((zzyi) (azzfm[i1])));
	//  176  307:aload_1         
	//  177  308:aload           4
	//  178  310:iload_3         
	//  179  311:aaload          
	//  180  312:invokevirtual   #139 <Method void zzxz.zza(zzyi)>
					zzavf = azzfm;
	//  181  315:aload_0         
	//  182  316:aload           4
	//  183  318:putfield        #30  <Field zzfm[] zzavf>
				}
			} else
	//* 184  321:goto            0
			{
				zzave = Integer.valueOf(zzxz1.zzvb());
	//  185  324:aload_0         
	//  186  325:aload_1         
	//  187  326:invokevirtual   #143 <Method int zzxz.zzvb()>
	//  188  329:invokestatic    #146 <Method Integer Integer.valueOf(int)>
	//  189  332:putfield        #22  <Field Integer zzave>
			}
		} while(true);
	//  190  335:goto            0
		return ((zzyi) (this));
	//  191  338:aload_0         
	//  192  339:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzave));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Integer zzave>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			zzya1.zzd(1, ((Integer) (obj)).intValue());
	//    5   11:aload_1         
	//    6   12:iconst_1        
	//    7   13:aload           4
	//    8   15:invokevirtual   #151 <Method int Integer.intValue()>
	//    9   18:invokevirtual   #157 <Method void zzya.zzd(int, int)>
		Object aobj[] = ((Object []) (zzavf));
	//   10   21:aload_0         
	//   11   22:getfield        #30  <Field zzfm[] zzavf>
	//   12   25:astore          4
		boolean flag = false;
	//   13   27:iconst_0        
	//   14   28:istore_3        
		if(aobj != null && aobj.length > 0)
	//*  15   29:aload           4
	//*  16   31:ifnull          80
	//*  17   34:aload           4
	//*  18   36:arraylength     
	//*  19   37:ifle            80
		{
			int i = 0;
	//   20   40:iconst_0        
	//   21   41:istore_2        
			do
			{
				aobj = ((Object []) (zzavf));
	//   22   42:aload_0         
	//   23   43:getfield        #30  <Field zzfm[] zzavf>
	//   24   46:astore          4
				if(i >= aobj.length)
					break;
	//   25   48:iload_2         
	//   26   49:aload           4
	//   27   51:arraylength     
	//   28   52:icmpge          80
				aobj = ((Object []) (aobj[i]));
	//   29   55:aload           4
	//   30   57:iload_2         
	//   31   58:aaload          
	//   32   59:astore          4
				if(aobj != null)
	//*  33   61:aload           4
	//*  34   63:ifnull          73
					zzya1.zza(2, ((zzyi) (aobj)));
	//   35   66:aload_1         
	//   36   67:iconst_2        
	//   37   68:aload           4
	//   38   70:invokevirtual   #160 <Method void zzya.zza(int, zzyi)>
				i++;
	//   39   73:iload_2         
	//   40   74:iconst_1        
	//   41   75:iadd            
	//   42   76:istore_2        
			} while(true);
	//   43   77:goto            42
		}
		aobj = ((Object []) (zzavg));
	//   44   80:aload_0         
	//   45   81:getfield        #38  <Field zzfj[] zzavg>
	//   46   84:astore          4
		if(aobj != null && aobj.length > 0)
	//*  47   86:aload           4
	//*  48   88:ifnull          137
	//*  49   91:aload           4
	//*  50   93:arraylength     
	//*  51   94:ifle            137
		{
			int j = ((int) (flag));
	//   52   97:iload_3         
	//   53   98:istore_2        
			do
			{
				zzfj azzfj[] = zzavg;
	//   54   99:aload_0         
	//   55  100:getfield        #38  <Field zzfj[] zzavg>
	//   56  103:astore          4
				if(j >= azzfj.length)
					break;
	//   57  105:iload_2         
	//   58  106:aload           4
	//   59  108:arraylength     
	//   60  109:icmpge          137
				azzfj = ((zzfj []) (azzfj[j]));
	//   61  112:aload           4
	//   62  114:iload_2         
	//   63  115:aaload          
	//   64  116:astore          4
				if(azzfj != null)
	//*  65  118:aload           4
	//*  66  120:ifnull          130
					zzya1.zza(3, ((zzyi) (azzfj)));
	//   67  123:aload_1         
	//   68  124:iconst_3        
	//   69  125:aload           4
	//   70  127:invokevirtual   #160 <Method void zzya.zza(int, zzyi)>
				j++;
	//   71  130:iload_2         
	//   72  131:iconst_1        
	//   73  132:iadd            
	//   74  133:istore_2        
			} while(true);
	//   75  134:goto            99
		}
		azzfj = ((zzfj []) (zzavh));
	//   76  137:aload_0         
	//   77  138:getfield        #40  <Field Boolean zzavh>
	//   78  141:astore          4
		if(azzfj != null)
	//*  79  143:aload           4
	//*  80  145:ifnull          158
			zzya1.zzb(4, ((Boolean) (azzfj)).booleanValue());
	//   81  148:aload_1         
	//   82  149:iconst_4        
	//   83  150:aload           4
	//   84  152:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//   85  155:invokevirtual   #166 <Method void zzya.zzb(int, boolean)>
		azzfj = ((zzfj []) (zzavi));
	//   86  158:aload_0         
	//   87  159:getfield        #42  <Field Boolean zzavi>
	//   88  162:astore          4
		if(azzfj != null)
	//*  89  164:aload           4
	//*  90  166:ifnull          179
			zzya1.zzb(5, ((Boolean) (azzfj)).booleanValue());
	//   91  169:aload_1         
	//   92  170:iconst_5        
	//   93  171:aload           4
	//   94  173:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//   95  176:invokevirtual   #166 <Method void zzya.zzb(int, boolean)>
		super.zza(zzya1);
	//   96  179:aload_0         
	//   97  180:aload_1         
	//   98  181:invokespecial   #168 <Method void zzyc.zza(zzya)>
	//   99  184:return          
	}

	protected final int zzf()
	{
		int i = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #171 <Method int zzyc.zzf()>
	//    2    4:istore_1        
		Object obj = ((Object) (zzave));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Integer zzave>
	//    5    9:astore          5
		int j = i;
	//    6   11:iload_1         
	//    7   12:istore_2        
		if(obj != null)
	//*   8   13:aload           5
	//*   9   15:ifnull          30
			j = i + zzya.zzh(1, ((Integer) (obj)).intValue());
	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:aload           5
	//   13   22:invokevirtual   #151 <Method int Integer.intValue()>
	//   14   25:invokestatic    #175 <Method int zzya.zzh(int, int)>
	//   15   28:iadd            
	//   16   29:istore_2        
		Object aobj[] = ((Object []) (zzavf));
	//   17   30:aload_0         
	//   18   31:getfield        #30  <Field zzfm[] zzavf>
	//   19   34:astore          5
		boolean flag = false;
	//   20   36:iconst_0        
	//   21   37:istore          4
		i = j;
	//   22   39:iload_2         
	//   23   40:istore_1        
		if(aobj != null)
	//*  24   41:aload           5
	//*  25   43:ifnull          102
		{
			i = j;
	//   26   46:iload_2         
	//   27   47:istore_1        
			if(aobj.length > 0)
	//*  28   48:aload           5
	//*  29   50:arraylength     
	//*  30   51:ifle            102
			{
				i = j;
	//   31   54:iload_2         
	//   32   55:istore_1        
				j = 0;
	//   33   56:iconst_0        
	//   34   57:istore_2        
				do
				{
					aobj = ((Object []) (zzavf));
	//   35   58:aload_0         
	//   36   59:getfield        #30  <Field zzfm[] zzavf>
	//   37   62:astore          5
					if(j >= aobj.length)
						break;
	//   38   64:iload_2         
	//   39   65:aload           5
	//   40   67:arraylength     
	//   41   68:icmpge          102
					aobj = ((Object []) (aobj[j]));
	//   42   71:aload           5
	//   43   73:iload_2         
	//   44   74:aaload          
	//   45   75:astore          5
					int k = i;
	//   46   77:iload_1         
	//   47   78:istore_3        
					if(aobj != null)
	//*  48   79:aload           5
	//*  49   81:ifnull          93
						k = i + zzya.zzb(2, ((zzyi) (aobj)));
	//   50   84:iload_1         
	//   51   85:iconst_2        
	//   52   86:aload           5
	//   53   88:invokestatic    #178 <Method int zzya.zzb(int, zzyi)>
	//   54   91:iadd            
	//   55   92:istore_3        
					j++;
	//   56   93:iload_2         
	//   57   94:iconst_1        
	//   58   95:iadd            
	//   59   96:istore_2        
					i = k;
	//   60   97:iload_3         
	//   61   98:istore_1        
				} while(true);
	//   62   99:goto            58
			}
		}
		aobj = ((Object []) (zzavg));
	//   63  102:aload_0         
	//   64  103:getfield        #38  <Field zzfj[] zzavg>
	//   65  106:astore          5
		j = i;
	//   66  108:iload_1         
	//   67  109:istore_2        
		if(aobj != null)
	//*  68  110:aload           5
	//*  69  112:ifnull          172
		{
			j = i;
	//   70  115:iload_1         
	//   71  116:istore_2        
			if(aobj.length > 0)
	//*  72  117:aload           5
	//*  73  119:arraylength     
	//*  74  120:ifle            172
			{
				int l = ((int) (flag));
	//   75  123:iload           4
	//   76  125:istore_3        
				do
				{
					zzfj azzfj[] = zzavg;
	//   77  126:aload_0         
	//   78  127:getfield        #38  <Field zzfj[] zzavg>
	//   79  130:astore          5
					j = i;
	//   80  132:iload_1         
	//   81  133:istore_2        
					if(l >= azzfj.length)
						break;
	//   82  134:iload_3         
	//   83  135:aload           5
	//   84  137:arraylength     
	//   85  138:icmpge          172
					azzfj = ((zzfj []) (azzfj[l]));
	//   86  141:aload           5
	//   87  143:iload_3         
	//   88  144:aaload          
	//   89  145:astore          5
					j = i;
	//   90  147:iload_1         
	//   91  148:istore_2        
					if(azzfj != null)
	//*  92  149:aload           5
	//*  93  151:ifnull          163
						j = i + zzya.zzb(3, ((zzyi) (azzfj)));
	//   94  154:iload_1         
	//   95  155:iconst_3        
	//   96  156:aload           5
	//   97  158:invokestatic    #178 <Method int zzya.zzb(int, zzyi)>
	//   98  161:iadd            
	//   99  162:istore_2        
					l++;
	//  100  163:iload_3         
	//  101  164:iconst_1        
	//  102  165:iadd            
	//  103  166:istore_3        
					i = j;
	//  104  167:iload_2         
	//  105  168:istore_1        
				} while(true);
	//  106  169:goto            126
			}
		}
		azzfj = ((zzfj []) (zzavh));
	//  107  172:aload_0         
	//  108  173:getfield        #40  <Field Boolean zzavh>
	//  109  176:astore          5
		i = j;
	//  110  178:iload_2         
	//  111  179:istore_1        
		if(azzfj != null)
	//* 112  180:aload           5
	//* 113  182:ifnull          200
		{
			((Boolean) (azzfj)).booleanValue();
	//  114  185:aload           5
	//  115  187:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//  116  190:pop             
			i = j + (zzya.zzbd(4) + 1);
	//  117  191:iload_2         
	//  118  192:iconst_4        
	//  119  193:invokestatic    #182 <Method int zzya.zzbd(int)>
	//  120  196:iconst_1        
	//  121  197:iadd            
	//  122  198:iadd            
	//  123  199:istore_1        
		}
		azzfj = ((zzfj []) (zzavi));
	//  124  200:aload_0         
	//  125  201:getfield        #42  <Field Boolean zzavi>
	//  126  204:astore          5
		j = i;
	//  127  206:iload_1         
	//  128  207:istore_2        
		if(azzfj != null)
	//* 129  208:aload           5
	//* 130  210:ifnull          228
		{
			((Boolean) (azzfj)).booleanValue();
	//  131  213:aload           5
	//  132  215:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//  133  218:pop             
			j = i + (zzya.zzbd(5) + 1);
	//  134  219:iload_1         
	//  135  220:iconst_5        
	//  136  221:invokestatic    #182 <Method int zzya.zzbd(int)>
	//  137  224:iconst_1        
	//  138  225:iadd            
	//  139  226:iadd            
	//  140  227:istore_2        
		}
		return j;
	//  141  228:iload_2         
	//  142  229:ireturn         
	}

	private static volatile zzfi zzavd[];
	public Integer zzave;
	public zzfm zzavf[];
	public zzfj zzavg[];
	private Boolean zzavh;
	private Boolean zzavi;
}
