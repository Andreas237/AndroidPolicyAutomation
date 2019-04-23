// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzfq, zzfo, zzfi, 
//			zzyg, zzye, zzxz, zzyl, 
//			zzya, zzyi

public final class zzfp extends zzyc
{

	public zzfp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zzyc()>
		zzawk = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field Long zzawk>
		zzafi = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field String zzafi>
		zzawl = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field Integer zzawl>
		zzawm = zzfq.zzmw();
	//   11   19:aload_0         
	//   12   20:invokestatic    #36  <Method zzfq[] zzfq.zzmw()>
	//   13   23:putfield        #38  <Field zzfq[] zzawm>
		zzawn = zzfo.zzmv();
	//   14   26:aload_0         
	//   15   27:invokestatic    #44  <Method zzfo[] zzfo.zzmv()>
	//   16   30:putfield        #46  <Field zzfo[] zzawn>
		zzawo = zzfi.zzmr();
	//   17   33:aload_0         
	//   18   34:invokestatic    #52  <Method zzfi[] zzfi.zzmr()>
	//   19   37:putfield        #54  <Field zzfi[] zzawo>
		zzawp = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #56  <Field String zzawp>
		zzawq = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #58  <Field Boolean zzawq>
		zzcet = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #62  <Field zzye zzcet>
		zzcfd = -1;
	//   29   55:aload_0         
	//   30   56:iconst_m1       
	//   31   57:putfield        #66  <Field int zzcfd>
	//   32   60:return          
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
		if(!(obj instanceof zzfp))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfp>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfp)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfp>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzawk));
	//   13   21:aload_0         
	//   14   22:getfield        #26  <Field Long zzawk>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfp) (obj)).zzawk != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #26  <Field Long zzawk>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Long) (obj1)).equals(((Object) (((zzfp) (obj)).zzawk))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #26  <Field Long zzawk>
	//*  26   44:invokevirtual   #73  <Method boolean Long.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzafi));
	//   30   52:aload_0         
	//   31   53:getfield        #28  <Field String zzafi>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfp) (obj)).zzafi != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #28  <Field String zzafi>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfp) (obj)).zzafi))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #28  <Field String zzafi>
	//*  43   75:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (zzawl));
	//   47   83:aload_0         
	//   48   84:getfield        #30  <Field Integer zzawl>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((zzfp) (obj)).zzawl != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #30  <Field Integer zzawl>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfp) (obj)).zzawl))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #30  <Field Integer zzawl>
	//*  60  106:invokevirtual   #79  <Method boolean Integer.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		if(!zzyg.equals(((Object []) (zzawm)), ((Object []) (((zzfp) (obj)).zzawm))))
	//*  64  114:aload_0         
	//*  65  115:getfield        #38  <Field zzfq[] zzawm>
	//*  66  118:aload_1         
	//*  67  119:getfield        #38  <Field zzfq[] zzawm>
	//*  68  122:invokestatic    #84  <Method boolean zzyg.equals(Object[], Object[])>
	//*  69  125:ifne            130
			return false;
	//   70  128:iconst_0        
	//   71  129:ireturn         
		if(!zzyg.equals(((Object []) (zzawn)), ((Object []) (((zzfp) (obj)).zzawn))))
	//*  72  130:aload_0         
	//*  73  131:getfield        #46  <Field zzfo[] zzawn>
	//*  74  134:aload_1         
	//*  75  135:getfield        #46  <Field zzfo[] zzawn>
	//*  76  138:invokestatic    #84  <Method boolean zzyg.equals(Object[], Object[])>
	//*  77  141:ifne            146
			return false;
	//   78  144:iconst_0        
	//   79  145:ireturn         
		if(!zzyg.equals(((Object []) (zzawo)), ((Object []) (((zzfp) (obj)).zzawo))))
	//*  80  146:aload_0         
	//*  81  147:getfield        #54  <Field zzfi[] zzawo>
	//*  82  150:aload_1         
	//*  83  151:getfield        #54  <Field zzfi[] zzawo>
	//*  84  154:invokestatic    #84  <Method boolean zzyg.equals(Object[], Object[])>
	//*  85  157:ifne            162
			return false;
	//   86  160:iconst_0        
	//   87  161:ireturn         
		obj1 = ((Object) (zzawp));
	//   88  162:aload_0         
	//   89  163:getfield        #56  <Field String zzawp>
	//   90  166:astore_2        
		if(obj1 == null)
	//*  91  167:aload_2         
	//*  92  168:ifnonnull       180
		{
			if(((zzfp) (obj)).zzawp != null)
	//*  93  171:aload_1         
	//*  94  172:getfield        #56  <Field String zzawp>
	//*  95  175:ifnull          193
				return false;
	//   96  178:iconst_0        
	//   97  179:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfp) (obj)).zzawp))))
	//*  98  180:aload_2         
	//*  99  181:aload_1         
	//* 100  182:getfield        #56  <Field String zzawp>
	//* 101  185:invokevirtual   #76  <Method boolean String.equals(Object)>
	//* 102  188:ifne            193
			return false;
	//  103  191:iconst_0        
	//  104  192:ireturn         
		obj1 = ((Object) (zzawq));
	//  105  193:aload_0         
	//  106  194:getfield        #58  <Field Boolean zzawq>
	//  107  197:astore_2        
		if(obj1 == null)
	//* 108  198:aload_2         
	//* 109  199:ifnonnull       211
		{
			if(((zzfp) (obj)).zzawq != null)
	//* 110  202:aload_1         
	//* 111  203:getfield        #58  <Field Boolean zzawq>
	//* 112  206:ifnull          224
				return false;
	//  113  209:iconst_0        
	//  114  210:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfp) (obj)).zzawq))))
	//* 115  211:aload_2         
	//* 116  212:aload_1         
	//* 117  213:getfield        #58  <Field Boolean zzawq>
	//* 118  216:invokevirtual   #87  <Method boolean Boolean.equals(Object)>
	//* 119  219:ifne            224
			return false;
	//  120  222:iconst_0        
	//  121  223:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//* 122  224:aload_0         
	//* 123  225:getfield        #62  <Field zzye zzcet>
	//* 124  228:ifnull          256
	//* 125  231:aload_0         
	//* 126  232:getfield        #62  <Field zzye zzcet>
	//* 127  235:invokevirtual   #93  <Method boolean zzye.isEmpty()>
	//* 128  238:ifeq            244
	//* 129  241:goto            256
			return zzcet.equals(((Object) (((zzfp) (obj)).zzcet)));
	//  130  244:aload_0         
	//  131  245:getfield        #62  <Field zzye zzcet>
	//  132  248:aload_1         
	//  133  249:getfield        #62  <Field zzye zzcet>
	//  134  252:invokevirtual   #94  <Method boolean zzye.equals(Object)>
	//  135  255:ireturn         
		if(((zzfp) (obj)).zzcet != null)
	//* 136  256:aload_1         
	//* 137  257:getfield        #62  <Field zzye zzcet>
	//* 138  260:ifnull          277
			return ((zzfp) (obj)).zzcet.isEmpty();
	//  139  263:aload_1         
	//  140  264:getfield        #62  <Field zzye zzcet>
	//  141  267:invokevirtual   #93  <Method boolean zzye.isEmpty()>
	//  142  270:ifeq            275
	//  143  273:iconst_1        
	//  144  274:ireturn         
	//  145  275:iconst_0        
	//  146  276:ireturn         
		else
			return true;
	//  147  277:iconst_1        
	//  148  278:ireturn         
	}

	public final int hashCode()
	{
		int k1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #108 <Method String Class.getName()>
	//    3    7:invokevirtual   #110 <Method int String.hashCode()>
	//    4   10:istore          8
		Object obj = ((Object) (zzawk));
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field Long zzawk>
	//    7   16:astore          12
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          7
		int i;
		if(obj == null)
	//*  10   21:aload           12
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((Long) (obj)).hashCode();
	//   15   31:aload           12
	//   16   33:invokevirtual   #111 <Method int Long.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzafi));
	//   18   37:aload_0         
	//   19   38:getfield        #28  <Field String zzafi>
	//   20   41:astore          12
		int j;
		if(obj == null)
	//*  21   43:aload           12
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = ((String) (obj)).hashCode();
	//   26   53:aload           12
	//   27   55:invokevirtual   #110 <Method int String.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (zzawl));
	//   29   59:aload_0         
	//   30   60:getfield        #30  <Field Integer zzawl>
	//   31   63:astore          12
		int k;
		if(obj == null)
	//*  32   65:aload           12
	//*  33   67:ifnonnull       75
			k = 0;
	//   34   70:iconst_0        
	//   35   71:istore_3        
		else
	//*  36   72:goto            81
			k = ((Integer) (obj)).hashCode();
	//   37   75:aload           12
	//   38   77:invokevirtual   #112 <Method int Integer.hashCode()>
	//   39   80:istore_3        
		int l1 = zzyg.hashCode(((Object []) (zzawm)));
	//   40   81:aload_0         
	//   41   82:getfield        #38  <Field zzfq[] zzawm>
	//   42   85:invokestatic    #115 <Method int zzyg.hashCode(Object[])>
	//   43   88:istore          9
		int i2 = zzyg.hashCode(((Object []) (zzawn)));
	//   44   90:aload_0         
	//   45   91:getfield        #46  <Field zzfo[] zzawn>
	//   46   94:invokestatic    #115 <Method int zzyg.hashCode(Object[])>
	//   47   97:istore          10
		int j2 = zzyg.hashCode(((Object []) (zzawo)));
	//   48   99:aload_0         
	//   49  100:getfield        #54  <Field zzfi[] zzawo>
	//   50  103:invokestatic    #115 <Method int zzyg.hashCode(Object[])>
	//   51  106:istore          11
		obj = ((Object) (zzawp));
	//   52  108:aload_0         
	//   53  109:getfield        #56  <Field String zzawp>
	//   54  112:astore          12
		int l;
		if(obj == null)
	//*  55  114:aload           12
	//*  56  116:ifnonnull       125
			l = 0;
	//   57  119:iconst_0        
	//   58  120:istore          4
		else
	//*  59  122:goto            132
			l = ((String) (obj)).hashCode();
	//   60  125:aload           12
	//   61  127:invokevirtual   #110 <Method int String.hashCode()>
	//   62  130:istore          4
		obj = ((Object) (zzawq));
	//   63  132:aload_0         
	//   64  133:getfield        #58  <Field Boolean zzawq>
	//   65  136:astore          12
		int i1;
		if(obj == null)
	//*  66  138:aload           12
	//*  67  140:ifnonnull       149
			i1 = 0;
	//   68  143:iconst_0        
	//   69  144:istore          5
		else
	//*  70  146:goto            156
			i1 = ((Boolean) (obj)).hashCode();
	//   71  149:aload           12
	//   72  151:invokevirtual   #116 <Method int Boolean.hashCode()>
	//   73  154:istore          5
		int j1 = ((int) (flag));
	//   74  156:iload           7
	//   75  158:istore          6
		if(zzcet != null)
	//*  76  160:aload_0         
	//*  77  161:getfield        #62  <Field zzye zzcet>
	//*  78  164:ifnull          193
			if(zzcet.isEmpty())
	//*  79  167:aload_0         
	//*  80  168:getfield        #62  <Field zzye zzcet>
	//*  81  171:invokevirtual   #93  <Method boolean zzye.isEmpty()>
	//*  82  174:ifeq            184
				j1 = ((int) (flag));
	//   83  177:iload           7
	//   84  179:istore          6
			else
	//*  85  181:goto            193
				j1 = zzcet.hashCode();
	//   86  184:aload_0         
	//   87  185:getfield        #62  <Field zzye zzcet>
	//   88  188:invokevirtual   #117 <Method int zzye.hashCode()>
	//   89  191:istore          6
		return (((((((((k1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + l) * 31 + i1) * 31 + j1;
	//   90  193:iload           8
	//   91  195:sipush          527
	//   92  198:iadd            
	//   93  199:bipush          31
	//   94  201:imul            
	//   95  202:iload_1         
	//   96  203:iadd            
	//   97  204:bipush          31
	//   98  206:imul            
	//   99  207:iload_2         
	//  100  208:iadd            
	//  101  209:bipush          31
	//  102  211:imul            
	//  103  212:iload_3         
	//  104  213:iadd            
	//  105  214:bipush          31
	//  106  216:imul            
	//  107  217:iload           9
	//  108  219:iadd            
	//  109  220:bipush          31
	//  110  222:imul            
	//  111  223:iload           10
	//  112  225:iadd            
	//  113  226:bipush          31
	//  114  228:imul            
	//  115  229:iload           11
	//  116  231:iadd            
	//  117  232:bipush          31
	//  118  234:imul            
	//  119  235:iload           4
	//  120  237:iadd            
	//  121  238:bipush          31
	//  122  240:imul            
	//  123  241:iload           5
	//  124  243:iadd            
	//  125  244:bipush          31
	//  126  246:imul            
	//  127  247:iload           6
	//  128  249:iadd            
	//  129  250:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #126 <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            501
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          487
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          476
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          462
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          339
						{
							if(i != 42)
	//*  17   33:iload_2         
	//*  18   34:bipush          42
	//*  19   36:icmpeq          216
							{
								if(i != 50)
	//*  20   39:iload_2         
	//*  21   40:bipush          50
	//*  22   42:icmpeq          93
								{
									if(i != 58)
	//*  23   45:iload_2         
	//*  24   46:bipush          58
	//*  25   48:icmpeq          82
									{
										if(i != 64)
	//*  26   51:iload_2         
	//*  27   52:bipush          64
	//*  28   54:icmpeq          68
										{
											if(!super.zza(zzxz1, i))
	//*  29   57:aload_0         
	//*  30   58:aload_1         
	//*  31   59:iload_2         
	//*  32   60:invokespecial   #129 <Method boolean zzyc.zza(zzxz, int)>
	//*  33   63:ifne            0
												return ((zzyi) (this));
	//   34   66:aload_0         
	//   35   67:areturn         
										} else
										{
											zzawq = Boolean.valueOf(zzxz1.zzup());
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokevirtual   #132 <Method boolean zzxz.zzup()>
	//   39   73:invokestatic    #136 <Method Boolean Boolean.valueOf(boolean)>
	//   40   76:putfield        #58  <Field Boolean zzawq>
										}
									} else
	//*  41   79:goto            0
									{
										zzawp = zzxz1.readString();
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:invokevirtual   #139 <Method String zzxz.readString()>
	//   45   87:putfield        #56  <Field String zzawp>
									}
								} else
	//*  46   90:goto            0
								{
									int i1 = zzyl.zzb(zzxz1, 50);
	//   47   93:aload_1         
	//   48   94:bipush          50
	//   49   96:invokestatic    #145 <Method int zzyl.zzb(zzxz, int)>
	//   50   99:istore_3        
									zzfi azzfi[] = zzawo;
	//   51  100:aload_0         
	//   52  101:getfield        #54  <Field zzfi[] zzawo>
	//   53  104:astore          4
									int j;
									if(azzfi == null)
	//*  54  106:aload           4
	//*  55  108:ifnonnull       116
										j = 0;
	//   56  111:iconst_0        
	//   57  112:istore_2        
									else
	//*  58  113:goto            120
										j = azzfi.length;
	//   59  116:aload           4
	//   60  118:arraylength     
	//   61  119:istore_2        
									azzfi = new zzfi[i1 + j];
	//   62  120:iload_3         
	//   63  121:iload_2         
	//   64  122:iadd            
	//   65  123:anewarray       zzfi[]
	//   66  126:astore          4
									i1 = j;
	//   67  128:iload_2         
	//   68  129:istore_3        
									if(j != 0)
	//*  69  130:iload_2         
	//*  70  131:ifeq            148
									{
										System.arraycopy(((Object) (zzawo)), 0, ((Object) (azzfi)), 0, j);
	//   71  134:aload_0         
	//   72  135:getfield        #54  <Field zzfi[] zzawo>
	//   73  138:iconst_0        
	//   74  139:aload           4
	//   75  141:iconst_0        
	//   76  142:iload_2         
	//   77  143:invokestatic    #151 <Method void System.arraycopy(Object, int, Object, int, int)>
										i1 = j;
	//   78  146:iload_2         
	//   79  147:istore_3        
									}
									for(; i1 < azzfi.length - 1; i1++)
	//*  80  148:iload_3         
	//*  81  149:aload           4
	//*  82  151:arraylength     
	//*  83  152:iconst_1        
	//*  84  153:isub            
	//*  85  154:icmpge          188
									{
										azzfi[i1] = new zzfi();
	//   86  157:aload           4
	//   87  159:iload_3         
	//   88  160:new             #48  <Class zzfi>
	//   89  163:dup             
	//   90  164:invokespecial   #152 <Method void zzfi()>
	//   91  167:aastore         
										zzxz1.zza(((zzyi) (azzfi[i1])));
	//   92  168:aload_1         
	//   93  169:aload           4
	//   94  171:iload_3         
	//   95  172:aaload          
	//   96  173:invokevirtual   #155 <Method void zzxz.zza(zzyi)>
										zzxz1.zzuj();
	//   97  176:aload_1         
	//   98  177:invokevirtual   #126 <Method int zzxz.zzuj()>
	//   99  180:pop             
									}

	//  100  181:iload_3         
	//  101  182:iconst_1        
	//  102  183:iadd            
	//  103  184:istore_3        
	//* 104  185:goto            148
									azzfi[i1] = new zzfi();
	//  105  188:aload           4
	//  106  190:iload_3         
	//  107  191:new             #48  <Class zzfi>
	//  108  194:dup             
	//  109  195:invokespecial   #152 <Method void zzfi()>
	//  110  198:aastore         
									zzxz1.zza(((zzyi) (azzfi[i1])));
	//  111  199:aload_1         
	//  112  200:aload           4
	//  113  202:iload_3         
	//  114  203:aaload          
	//  115  204:invokevirtual   #155 <Method void zzxz.zza(zzyi)>
									zzawo = azzfi;
	//  116  207:aload_0         
	//  117  208:aload           4
	//  118  210:putfield        #54  <Field zzfi[] zzawo>
								}
							} else
	//* 119  213:goto            0
							{
								int j1 = zzyl.zzb(zzxz1, 42);
	//  120  216:aload_1         
	//  121  217:bipush          42
	//  122  219:invokestatic    #145 <Method int zzyl.zzb(zzxz, int)>
	//  123  222:istore_3        
								zzfo azzfo[] = zzawn;
	//  124  223:aload_0         
	//  125  224:getfield        #46  <Field zzfo[] zzawn>
	//  126  227:astore          4
								int k;
								if(azzfo == null)
	//* 127  229:aload           4
	//* 128  231:ifnonnull       239
									k = 0;
	//  129  234:iconst_0        
	//  130  235:istore_2        
								else
	//* 131  236:goto            243
									k = azzfo.length;
	//  132  239:aload           4
	//  133  241:arraylength     
	//  134  242:istore_2        
								azzfo = new zzfo[j1 + k];
	//  135  243:iload_3         
	//  136  244:iload_2         
	//  137  245:iadd            
	//  138  246:anewarray       zzfo[]
	//  139  249:astore          4
								j1 = k;
	//  140  251:iload_2         
	//  141  252:istore_3        
								if(k != 0)
	//* 142  253:iload_2         
	//* 143  254:ifeq            271
								{
									System.arraycopy(((Object) (zzawn)), 0, ((Object) (azzfo)), 0, k);
	//  144  257:aload_0         
	//  145  258:getfield        #46  <Field zzfo[] zzawn>
	//  146  261:iconst_0        
	//  147  262:aload           4
	//  148  264:iconst_0        
	//  149  265:iload_2         
	//  150  266:invokestatic    #151 <Method void System.arraycopy(Object, int, Object, int, int)>
									j1 = k;
	//  151  269:iload_2         
	//  152  270:istore_3        
								}
								for(; j1 < azzfo.length - 1; j1++)
	//* 153  271:iload_3         
	//* 154  272:aload           4
	//* 155  274:arraylength     
	//* 156  275:iconst_1        
	//* 157  276:isub            
	//* 158  277:icmpge          311
								{
									azzfo[j1] = new zzfo();
	//  159  280:aload           4
	//  160  282:iload_3         
	//  161  283:new             #40  <Class zzfo>
	//  162  286:dup             
	//  163  287:invokespecial   #156 <Method void zzfo()>
	//  164  290:aastore         
									zzxz1.zza(((zzyi) (azzfo[j1])));
	//  165  291:aload_1         
	//  166  292:aload           4
	//  167  294:iload_3         
	//  168  295:aaload          
	//  169  296:invokevirtual   #155 <Method void zzxz.zza(zzyi)>
									zzxz1.zzuj();
	//  170  299:aload_1         
	//  171  300:invokevirtual   #126 <Method int zzxz.zzuj()>
	//  172  303:pop             
								}

	//  173  304:iload_3         
	//  174  305:iconst_1        
	//  175  306:iadd            
	//  176  307:istore_3        
	//* 177  308:goto            271
								azzfo[j1] = new zzfo();
	//  178  311:aload           4
	//  179  313:iload_3         
	//  180  314:new             #40  <Class zzfo>
	//  181  317:dup             
	//  182  318:invokespecial   #156 <Method void zzfo()>
	//  183  321:aastore         
								zzxz1.zza(((zzyi) (azzfo[j1])));
	//  184  322:aload_1         
	//  185  323:aload           4
	//  186  325:iload_3         
	//  187  326:aaload          
	//  188  327:invokevirtual   #155 <Method void zzxz.zza(zzyi)>
								zzawn = azzfo;
	//  189  330:aload_0         
	//  190  331:aload           4
	//  191  333:putfield        #46  <Field zzfo[] zzawn>
							}
						} else
	//* 192  336:goto            0
						{
							int k1 = zzyl.zzb(zzxz1, 34);
	//  193  339:aload_1         
	//  194  340:bipush          34
	//  195  342:invokestatic    #145 <Method int zzyl.zzb(zzxz, int)>
	//  196  345:istore_3        
							zzfq azzfq[] = zzawm;
	//  197  346:aload_0         
	//  198  347:getfield        #38  <Field zzfq[] zzawm>
	//  199  350:astore          4
							int l;
							if(azzfq == null)
	//* 200  352:aload           4
	//* 201  354:ifnonnull       362
								l = 0;
	//  202  357:iconst_0        
	//  203  358:istore_2        
							else
	//* 204  359:goto            366
								l = azzfq.length;
	//  205  362:aload           4
	//  206  364:arraylength     
	//  207  365:istore_2        
							azzfq = new zzfq[k1 + l];
	//  208  366:iload_3         
	//  209  367:iload_2         
	//  210  368:iadd            
	//  211  369:anewarray       zzfq[]
	//  212  372:astore          4
							k1 = l;
	//  213  374:iload_2         
	//  214  375:istore_3        
							if(l != 0)
	//* 215  376:iload_2         
	//* 216  377:ifeq            394
							{
								System.arraycopy(((Object) (zzawm)), 0, ((Object) (azzfq)), 0, l);
	//  217  380:aload_0         
	//  218  381:getfield        #38  <Field zzfq[] zzawm>
	//  219  384:iconst_0        
	//  220  385:aload           4
	//  221  387:iconst_0        
	//  222  388:iload_2         
	//  223  389:invokestatic    #151 <Method void System.arraycopy(Object, int, Object, int, int)>
								k1 = l;
	//  224  392:iload_2         
	//  225  393:istore_3        
							}
							for(; k1 < azzfq.length - 1; k1++)
	//* 226  394:iload_3         
	//* 227  395:aload           4
	//* 228  397:arraylength     
	//* 229  398:iconst_1        
	//* 230  399:isub            
	//* 231  400:icmpge          434
							{
								azzfq[k1] = new zzfq();
	//  232  403:aload           4
	//  233  405:iload_3         
	//  234  406:new             #32  <Class zzfq>
	//  235  409:dup             
	//  236  410:invokespecial   #157 <Method void zzfq()>
	//  237  413:aastore         
								zzxz1.zza(((zzyi) (azzfq[k1])));
	//  238  414:aload_1         
	//  239  415:aload           4
	//  240  417:iload_3         
	//  241  418:aaload          
	//  242  419:invokevirtual   #155 <Method void zzxz.zza(zzyi)>
								zzxz1.zzuj();
	//  243  422:aload_1         
	//  244  423:invokevirtual   #126 <Method int zzxz.zzuj()>
	//  245  426:pop             
							}

	//  246  427:iload_3         
	//  247  428:iconst_1        
	//  248  429:iadd            
	//  249  430:istore_3        
	//* 250  431:goto            394
							azzfq[k1] = new zzfq();
	//  251  434:aload           4
	//  252  436:iload_3         
	//  253  437:new             #32  <Class zzfq>
	//  254  440:dup             
	//  255  441:invokespecial   #157 <Method void zzfq()>
	//  256  444:aastore         
							zzxz1.zza(((zzyi) (azzfq[k1])));
	//  257  445:aload_1         
	//  258  446:aload           4
	//  259  448:iload_3         
	//  260  449:aaload          
	//  261  450:invokevirtual   #155 <Method void zzxz.zza(zzyi)>
							zzawm = azzfq;
	//  262  453:aload_0         
	//  263  454:aload           4
	//  264  456:putfield        #38  <Field zzfq[] zzawm>
						}
					} else
	//* 265  459:goto            0
					{
						zzawl = Integer.valueOf(zzxz1.zzvb());
	//  266  462:aload_0         
	//  267  463:aload_1         
	//  268  464:invokevirtual   #160 <Method int zzxz.zzvb()>
	//  269  467:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//  270  470:putfield        #30  <Field Integer zzawl>
					}
				} else
	//* 271  473:goto            0
				{
					zzafi = zzxz1.readString();
	//  272  476:aload_0         
	//  273  477:aload_1         
	//  274  478:invokevirtual   #139 <Method String zzxz.readString()>
	//  275  481:putfield        #28  <Field String zzafi>
				}
			} else
	//* 276  484:goto            0
			{
				zzawk = Long.valueOf(zzxz1.zzvc());
	//  277  487:aload_0         
	//  278  488:aload_1         
	//  279  489:invokevirtual   #167 <Method long zzxz.zzvc()>
	//  280  492:invokestatic    #170 <Method Long Long.valueOf(long)>
	//  281  495:putfield        #26  <Field Long zzawk>
			}
		} while(true);
	//  282  498:goto            0
		return ((zzyi) (this));
	//  283  501:aload_0         
	//  284  502:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzawk));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Long zzawk>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			zzya1.zzi(1, ((Long) (obj)).longValue());
	//    5   11:aload_1         
	//    6   12:iconst_1        
	//    7   13:aload           4
	//    8   15:invokevirtual   #175 <Method long Long.longValue()>
	//    9   18:invokevirtual   #181 <Method void zzya.zzi(int, long)>
		obj = ((Object) (zzafi));
	//   10   21:aload_0         
	//   11   22:getfield        #28  <Field String zzafi>
	//   12   25:astore          4
		if(obj != null)
	//*  13   27:aload           4
	//*  14   29:ifnull          39
			zzya1.zzb(2, ((String) (obj)));
	//   15   32:aload_1         
	//   16   33:iconst_2        
	//   17   34:aload           4
	//   18   36:invokevirtual   #184 <Method void zzya.zzb(int, String)>
		obj = ((Object) (zzawl));
	//   19   39:aload_0         
	//   20   40:getfield        #30  <Field Integer zzawl>
	//   21   43:astore          4
		if(obj != null)
	//*  22   45:aload           4
	//*  23   47:ifnull          60
			zzya1.zzd(3, ((Integer) (obj)).intValue());
	//   24   50:aload_1         
	//   25   51:iconst_3        
	//   26   52:aload           4
	//   27   54:invokevirtual   #187 <Method int Integer.intValue()>
	//   28   57:invokevirtual   #191 <Method void zzya.zzd(int, int)>
		Object aobj[] = ((Object []) (zzawm));
	//   29   60:aload_0         
	//   30   61:getfield        #38  <Field zzfq[] zzawm>
	//   31   64:astore          4
		boolean flag = false;
	//   32   66:iconst_0        
	//   33   67:istore_3        
		if(aobj != null && aobj.length > 0)
	//*  34   68:aload           4
	//*  35   70:ifnull          119
	//*  36   73:aload           4
	//*  37   75:arraylength     
	//*  38   76:ifle            119
		{
			int i = 0;
	//   39   79:iconst_0        
	//   40   80:istore_2        
			do
			{
				aobj = ((Object []) (zzawm));
	//   41   81:aload_0         
	//   42   82:getfield        #38  <Field zzfq[] zzawm>
	//   43   85:astore          4
				if(i >= aobj.length)
					break;
	//   44   87:iload_2         
	//   45   88:aload           4
	//   46   90:arraylength     
	//   47   91:icmpge          119
				aobj = ((Object []) (aobj[i]));
	//   48   94:aload           4
	//   49   96:iload_2         
	//   50   97:aaload          
	//   51   98:astore          4
				if(aobj != null)
	//*  52  100:aload           4
	//*  53  102:ifnull          112
					zzya1.zza(4, ((zzyi) (aobj)));
	//   54  105:aload_1         
	//   55  106:iconst_4        
	//   56  107:aload           4
	//   57  109:invokevirtual   #194 <Method void zzya.zza(int, zzyi)>
				i++;
	//   58  112:iload_2         
	//   59  113:iconst_1        
	//   60  114:iadd            
	//   61  115:istore_2        
			} while(true);
	//   62  116:goto            81
		}
		aobj = ((Object []) (zzawn));
	//   63  119:aload_0         
	//   64  120:getfield        #46  <Field zzfo[] zzawn>
	//   65  123:astore          4
		if(aobj != null && aobj.length > 0)
	//*  66  125:aload           4
	//*  67  127:ifnull          176
	//*  68  130:aload           4
	//*  69  132:arraylength     
	//*  70  133:ifle            176
		{
			int j = 0;
	//   71  136:iconst_0        
	//   72  137:istore_2        
			do
			{
				aobj = ((Object []) (zzawn));
	//   73  138:aload_0         
	//   74  139:getfield        #46  <Field zzfo[] zzawn>
	//   75  142:astore          4
				if(j >= aobj.length)
					break;
	//   76  144:iload_2         
	//   77  145:aload           4
	//   78  147:arraylength     
	//   79  148:icmpge          176
				aobj = ((Object []) (aobj[j]));
	//   80  151:aload           4
	//   81  153:iload_2         
	//   82  154:aaload          
	//   83  155:astore          4
				if(aobj != null)
	//*  84  157:aload           4
	//*  85  159:ifnull          169
					zzya1.zza(5, ((zzyi) (aobj)));
	//   86  162:aload_1         
	//   87  163:iconst_5        
	//   88  164:aload           4
	//   89  166:invokevirtual   #194 <Method void zzya.zza(int, zzyi)>
				j++;
	//   90  169:iload_2         
	//   91  170:iconst_1        
	//   92  171:iadd            
	//   93  172:istore_2        
			} while(true);
	//   94  173:goto            138
		}
		aobj = ((Object []) (zzawo));
	//   95  176:aload_0         
	//   96  177:getfield        #54  <Field zzfi[] zzawo>
	//   97  180:astore          4
		if(aobj != null && aobj.length > 0)
	//*  98  182:aload           4
	//*  99  184:ifnull          234
	//* 100  187:aload           4
	//* 101  189:arraylength     
	//* 102  190:ifle            234
		{
			int k = ((int) (flag));
	//  103  193:iload_3         
	//  104  194:istore_2        
			do
			{
				zzfi azzfi[] = zzawo;
	//  105  195:aload_0         
	//  106  196:getfield        #54  <Field zzfi[] zzawo>
	//  107  199:astore          4
				if(k >= azzfi.length)
					break;
	//  108  201:iload_2         
	//  109  202:aload           4
	//  110  204:arraylength     
	//  111  205:icmpge          234
				azzfi = ((zzfi []) (azzfi[k]));
	//  112  208:aload           4
	//  113  210:iload_2         
	//  114  211:aaload          
	//  115  212:astore          4
				if(azzfi != null)
	//* 116  214:aload           4
	//* 117  216:ifnull          227
					zzya1.zza(6, ((zzyi) (azzfi)));
	//  118  219:aload_1         
	//  119  220:bipush          6
	//  120  222:aload           4
	//  121  224:invokevirtual   #194 <Method void zzya.zza(int, zzyi)>
				k++;
	//  122  227:iload_2         
	//  123  228:iconst_1        
	//  124  229:iadd            
	//  125  230:istore_2        
			} while(true);
	//  126  231:goto            195
		}
		azzfi = ((zzfi []) (zzawp));
	//  127  234:aload_0         
	//  128  235:getfield        #56  <Field String zzawp>
	//  129  238:astore          4
		if(azzfi != null)
	//* 130  240:aload           4
	//* 131  242:ifnull          253
			zzya1.zzb(7, ((String) (azzfi)));
	//  132  245:aload_1         
	//  133  246:bipush          7
	//  134  248:aload           4
	//  135  250:invokevirtual   #184 <Method void zzya.zzb(int, String)>
		azzfi = ((zzfi []) (zzawq));
	//  136  253:aload_0         
	//  137  254:getfield        #58  <Field Boolean zzawq>
	//  138  257:astore          4
		if(azzfi != null)
	//* 139  259:aload           4
	//* 140  261:ifnull          275
			zzya1.zzb(8, ((Boolean) (azzfi)).booleanValue());
	//  141  264:aload_1         
	//  142  265:bipush          8
	//  143  267:aload           4
	//  144  269:invokevirtual   #197 <Method boolean Boolean.booleanValue()>
	//  145  272:invokevirtual   #200 <Method void zzya.zzb(int, boolean)>
		super.zza(zzya1);
	//  146  275:aload_0         
	//  147  276:aload_1         
	//  148  277:invokespecial   #202 <Method void zzyc.zza(zzya)>
	//  149  280:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #205 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzawk));
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field Long zzawk>
	//    5    9:astore          5
		int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
		if(obj != null)
	//*   8   13:aload           5
	//*   9   15:ifnull          30
			i = j + zzya.zzd(1, ((Long) (obj)).longValue());
	//   10   18:iload_2         
	//   11   19:iconst_1        
	//   12   20:aload           5
	//   13   22:invokevirtual   #175 <Method long Long.longValue()>
	//   14   25:invokestatic    #208 <Method int zzya.zzd(int, long)>
	//   15   28:iadd            
	//   16   29:istore_1        
		obj = ((Object) (zzafi));
	//   17   30:aload_0         
	//   18   31:getfield        #28  <Field String zzafi>
	//   19   34:astore          5
		j = i;
	//   20   36:iload_1         
	//   21   37:istore_2        
		if(obj != null)
	//*  22   38:aload           5
	//*  23   40:ifnull          52
			j = i + zzya.zzc(2, ((String) (obj)));
	//   24   43:iload_1         
	//   25   44:iconst_2        
	//   26   45:aload           5
	//   27   47:invokestatic    #212 <Method int zzya.zzc(int, String)>
	//   28   50:iadd            
	//   29   51:istore_2        
		obj = ((Object) (zzawl));
	//   30   52:aload_0         
	//   31   53:getfield        #30  <Field Integer zzawl>
	//   32   56:astore          5
		i = j;
	//   33   58:iload_2         
	//   34   59:istore_1        
		if(obj != null)
	//*  35   60:aload           5
	//*  36   62:ifnull          77
			i = j + zzya.zzh(3, ((Integer) (obj)).intValue());
	//   37   65:iload_2         
	//   38   66:iconst_3        
	//   39   67:aload           5
	//   40   69:invokevirtual   #187 <Method int Integer.intValue()>
	//   41   72:invokestatic    #216 <Method int zzya.zzh(int, int)>
	//   42   75:iadd            
	//   43   76:istore_1        
		Object aobj[] = ((Object []) (zzawm));
	//   44   77:aload_0         
	//   45   78:getfield        #38  <Field zzfq[] zzawm>
	//   46   81:astore          5
		boolean flag = false;
	//   47   83:iconst_0        
	//   48   84:istore          4
		j = i;
	//   49   86:iload_1         
	//   50   87:istore_2        
		if(aobj != null)
	//*  51   88:aload           5
	//*  52   90:ifnull          149
		{
			j = i;
	//   53   93:iload_1         
	//   54   94:istore_2        
			if(aobj.length > 0)
	//*  55   95:aload           5
	//*  56   97:arraylength     
	//*  57   98:ifle            149
			{
				j = 0;
	//   58  101:iconst_0        
	//   59  102:istore_2        
				do
				{
					aobj = ((Object []) (zzawm));
	//   60  103:aload_0         
	//   61  104:getfield        #38  <Field zzfq[] zzawm>
	//   62  107:astore          5
					if(j >= aobj.length)
						break;
	//   63  109:iload_2         
	//   64  110:aload           5
	//   65  112:arraylength     
	//   66  113:icmpge          147
					aobj = ((Object []) (aobj[j]));
	//   67  116:aload           5
	//   68  118:iload_2         
	//   69  119:aaload          
	//   70  120:astore          5
					int k = i;
	//   71  122:iload_1         
	//   72  123:istore_3        
					if(aobj != null)
	//*  73  124:aload           5
	//*  74  126:ifnull          138
						k = i + zzya.zzb(4, ((zzyi) (aobj)));
	//   75  129:iload_1         
	//   76  130:iconst_4        
	//   77  131:aload           5
	//   78  133:invokestatic    #219 <Method int zzya.zzb(int, zzyi)>
	//   79  136:iadd            
	//   80  137:istore_3        
					j++;
	//   81  138:iload_2         
	//   82  139:iconst_1        
	//   83  140:iadd            
	//   84  141:istore_2        
					i = k;
	//   85  142:iload_3         
	//   86  143:istore_1        
				} while(true);
	//   87  144:goto            103
				j = i;
	//   88  147:iload_1         
	//   89  148:istore_2        
			}
		}
		aobj = ((Object []) (zzawn));
	//   90  149:aload_0         
	//   91  150:getfield        #46  <Field zzfo[] zzawn>
	//   92  153:astore          5
		i = j;
	//   93  155:iload_2         
	//   94  156:istore_1        
		if(aobj != null)
	//*  95  157:aload           5
	//*  96  159:ifnull          218
		{
			i = j;
	//   97  162:iload_2         
	//   98  163:istore_1        
			if(aobj.length > 0)
	//*  99  164:aload           5
	//* 100  166:arraylength     
	//* 101  167:ifle            218
			{
				i = j;
	//  102  170:iload_2         
	//  103  171:istore_1        
				j = 0;
	//  104  172:iconst_0        
	//  105  173:istore_2        
				do
				{
					aobj = ((Object []) (zzawn));
	//  106  174:aload_0         
	//  107  175:getfield        #46  <Field zzfo[] zzawn>
	//  108  178:astore          5
					if(j >= aobj.length)
						break;
	//  109  180:iload_2         
	//  110  181:aload           5
	//  111  183:arraylength     
	//  112  184:icmpge          218
					aobj = ((Object []) (aobj[j]));
	//  113  187:aload           5
	//  114  189:iload_2         
	//  115  190:aaload          
	//  116  191:astore          5
					int l = i;
	//  117  193:iload_1         
	//  118  194:istore_3        
					if(aobj != null)
	//* 119  195:aload           5
	//* 120  197:ifnull          209
						l = i + zzya.zzb(5, ((zzyi) (aobj)));
	//  121  200:iload_1         
	//  122  201:iconst_5        
	//  123  202:aload           5
	//  124  204:invokestatic    #219 <Method int zzya.zzb(int, zzyi)>
	//  125  207:iadd            
	//  126  208:istore_3        
					j++;
	//  127  209:iload_2         
	//  128  210:iconst_1        
	//  129  211:iadd            
	//  130  212:istore_2        
					i = l;
	//  131  213:iload_3         
	//  132  214:istore_1        
				} while(true);
	//  133  215:goto            174
			}
		}
		aobj = ((Object []) (zzawo));
	//  134  218:aload_0         
	//  135  219:getfield        #54  <Field zzfi[] zzawo>
	//  136  222:astore          5
		j = i;
	//  137  224:iload_1         
	//  138  225:istore_2        
		if(aobj != null)
	//* 139  226:aload           5
	//* 140  228:ifnull          289
		{
			j = i;
	//  141  231:iload_1         
	//  142  232:istore_2        
			if(aobj.length > 0)
	//* 143  233:aload           5
	//* 144  235:arraylength     
	//* 145  236:ifle            289
			{
				int i1 = ((int) (flag));
	//  146  239:iload           4
	//  147  241:istore_3        
				do
				{
					zzfi azzfi[] = zzawo;
	//  148  242:aload_0         
	//  149  243:getfield        #54  <Field zzfi[] zzawo>
	//  150  246:astore          5
					j = i;
	//  151  248:iload_1         
	//  152  249:istore_2        
					if(i1 >= azzfi.length)
						break;
	//  153  250:iload_3         
	//  154  251:aload           5
	//  155  253:arraylength     
	//  156  254:icmpge          289
					azzfi = ((zzfi []) (azzfi[i1]));
	//  157  257:aload           5
	//  158  259:iload_3         
	//  159  260:aaload          
	//  160  261:astore          5
					j = i;
	//  161  263:iload_1         
	//  162  264:istore_2        
					if(azzfi != null)
	//* 163  265:aload           5
	//* 164  267:ifnull          280
						j = i + zzya.zzb(6, ((zzyi) (azzfi)));
	//  165  270:iload_1         
	//  166  271:bipush          6
	//  167  273:aload           5
	//  168  275:invokestatic    #219 <Method int zzya.zzb(int, zzyi)>
	//  169  278:iadd            
	//  170  279:istore_2        
					i1++;
	//  171  280:iload_3         
	//  172  281:iconst_1        
	//  173  282:iadd            
	//  174  283:istore_3        
					i = j;
	//  175  284:iload_2         
	//  176  285:istore_1        
				} while(true);
	//  177  286:goto            242
			}
		}
		azzfi = ((zzfi []) (zzawp));
	//  178  289:aload_0         
	//  179  290:getfield        #56  <Field String zzawp>
	//  180  293:astore          5
		i = j;
	//  181  295:iload_2         
	//  182  296:istore_1        
		if(azzfi != null)
	//* 183  297:aload           5
	//* 184  299:ifnull          312
			i = j + zzya.zzc(7, ((String) (azzfi)));
	//  185  302:iload_2         
	//  186  303:bipush          7
	//  187  305:aload           5
	//  188  307:invokestatic    #212 <Method int zzya.zzc(int, String)>
	//  189  310:iadd            
	//  190  311:istore_1        
		azzfi = ((zzfi []) (zzawq));
	//  191  312:aload_0         
	//  192  313:getfield        #58  <Field Boolean zzawq>
	//  193  316:astore          5
		j = i;
	//  194  318:iload_1         
	//  195  319:istore_2        
		if(azzfi != null)
	//* 196  320:aload           5
	//* 197  322:ifnull          341
		{
			((Boolean) (azzfi)).booleanValue();
	//  198  325:aload           5
	//  199  327:invokevirtual   #197 <Method boolean Boolean.booleanValue()>
	//  200  330:pop             
			j = i + (zzya.zzbd(8) + 1);
	//  201  331:iload_1         
	//  202  332:bipush          8
	//  203  334:invokestatic    #223 <Method int zzya.zzbd(int)>
	//  204  337:iconst_1        
	//  205  338:iadd            
	//  206  339:iadd            
	//  207  340:istore_2        
		}
		return j;
	//  208  341:iload_2         
	//  209  342:ireturn         
	}

	public String zzafi;
	public Long zzawk;
	private Integer zzawl;
	public zzfq zzawm[];
	public zzfo zzawn[];
	public zzfi zzawo[];
	private String zzawp;
	private Boolean zzawq;
}
