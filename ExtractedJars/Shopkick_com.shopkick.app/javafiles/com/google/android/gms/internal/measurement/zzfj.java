// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzfk, zzyg, zzfl, 
//			zzye, zzxz, zzyl, zzya, 
//			zzyi

public final class zzfj extends zzyc
{

	public zzfj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zzyc()>
		zzavk = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field Integer zzavk>
		zzavl = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #27  <Field String zzavl>
		zzavm = zzfk.zzmt();
	//    8   14:aload_0         
	//    9   15:invokestatic    #33  <Method zzfk[] zzfk.zzmt()>
	//   10   18:putfield        #35  <Field zzfk[] zzavm>
		zzavn = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #37  <Field Boolean zzavn>
		zzavo = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #39  <Field zzfl zzavo>
		zzavh = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #41  <Field Boolean zzavh>
		zzavi = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #43  <Field Boolean zzavi>
		zzcet = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #47  <Field zzye zzcet>
		zzcfd = -1;
	//   26   46:aload_0         
	//   27   47:iconst_m1       
	//   28   48:putfield        #51  <Field int zzcfd>
	//   29   51:return          
	}

	public static zzfj[] zzms()
	{
		if(zzavj == null)
	//*   0    0:getstatic       #56  <Field zzfj[] zzavj>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #62  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzavj == null)
	//*   6   12:getstatic       #56  <Field zzfj[] zzavj>
	//*   7   15:ifnonnull       25
					zzavj = new zzfj[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfj[]
	//   10   22:putstatic       #56  <Field zzfj[] zzavj>
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
		return zzavj;
	//   19   35:getstatic       #56  <Field zzfj[] zzavj>
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
		if(!(obj instanceof zzfj))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfj>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfj)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfj>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzavk));
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field Integer zzavk>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfj) (obj)).zzavk != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #25  <Field Integer zzavk>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfj) (obj)).zzavk))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #25  <Field Integer zzavk>
	//*  26   44:invokevirtual   #68  <Method boolean Integer.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzavl));
	//   30   52:aload_0         
	//   31   53:getfield        #27  <Field String zzavl>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfj) (obj)).zzavl != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #27  <Field String zzavl>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfj) (obj)).zzavl))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #27  <Field String zzavl>
	//*  43   75:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		if(!zzyg.equals(((Object []) (zzavm)), ((Object []) (((zzfj) (obj)).zzavm))))
	//*  47   83:aload_0         
	//*  48   84:getfield        #35  <Field zzfk[] zzavm>
	//*  49   87:aload_1         
	//*  50   88:getfield        #35  <Field zzfk[] zzavm>
	//*  51   91:invokestatic    #74  <Method boolean zzyg.equals(Object[], Object[])>
	//*  52   94:ifne            99
			return false;
	//   53   97:iconst_0        
	//   54   98:ireturn         
		obj1 = ((Object) (zzavn));
	//   55   99:aload_0         
	//   56  100:getfield        #37  <Field Boolean zzavn>
	//   57  103:astore_2        
		if(obj1 == null)
	//*  58  104:aload_2         
	//*  59  105:ifnonnull       117
		{
			if(((zzfj) (obj)).zzavn != null)
	//*  60  108:aload_1         
	//*  61  109:getfield        #37  <Field Boolean zzavn>
	//*  62  112:ifnull          130
				return false;
	//   63  115:iconst_0        
	//   64  116:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfj) (obj)).zzavn))))
	//*  65  117:aload_2         
	//*  66  118:aload_1         
	//*  67  119:getfield        #37  <Field Boolean zzavn>
	//*  68  122:invokevirtual   #77  <Method boolean Boolean.equals(Object)>
	//*  69  125:ifne            130
			return false;
	//   70  128:iconst_0        
	//   71  129:ireturn         
		obj1 = ((Object) (zzavo));
	//   72  130:aload_0         
	//   73  131:getfield        #39  <Field zzfl zzavo>
	//   74  134:astore_2        
		if(obj1 == null)
	//*  75  135:aload_2         
	//*  76  136:ifnonnull       148
		{
			if(((zzfj) (obj)).zzavo != null)
	//*  77  139:aload_1         
	//*  78  140:getfield        #39  <Field zzfl zzavo>
	//*  79  143:ifnull          161
				return false;
	//   80  146:iconst_0        
	//   81  147:ireturn         
		} else
		if(!((zzfl) (obj1)).equals(((Object) (((zzfj) (obj)).zzavo))))
	//*  82  148:aload_2         
	//*  83  149:aload_1         
	//*  84  150:getfield        #39  <Field zzfl zzavo>
	//*  85  153:invokevirtual   #80  <Method boolean zzfl.equals(Object)>
	//*  86  156:ifne            161
			return false;
	//   87  159:iconst_0        
	//   88  160:ireturn         
		obj1 = ((Object) (zzavh));
	//   89  161:aload_0         
	//   90  162:getfield        #41  <Field Boolean zzavh>
	//   91  165:astore_2        
		if(obj1 == null)
	//*  92  166:aload_2         
	//*  93  167:ifnonnull       179
		{
			if(((zzfj) (obj)).zzavh != null)
	//*  94  170:aload_1         
	//*  95  171:getfield        #41  <Field Boolean zzavh>
	//*  96  174:ifnull          192
				return false;
	//   97  177:iconst_0        
	//   98  178:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfj) (obj)).zzavh))))
	//*  99  179:aload_2         
	//* 100  180:aload_1         
	//* 101  181:getfield        #41  <Field Boolean zzavh>
	//* 102  184:invokevirtual   #77  <Method boolean Boolean.equals(Object)>
	//* 103  187:ifne            192
			return false;
	//  104  190:iconst_0        
	//  105  191:ireturn         
		obj1 = ((Object) (zzavi));
	//  106  192:aload_0         
	//  107  193:getfield        #43  <Field Boolean zzavi>
	//  108  196:astore_2        
		if(obj1 == null)
	//* 109  197:aload_2         
	//* 110  198:ifnonnull       210
		{
			if(((zzfj) (obj)).zzavi != null)
	//* 111  201:aload_1         
	//* 112  202:getfield        #43  <Field Boolean zzavi>
	//* 113  205:ifnull          223
				return false;
	//  114  208:iconst_0        
	//  115  209:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfj) (obj)).zzavi))))
	//* 116  210:aload_2         
	//* 117  211:aload_1         
	//* 118  212:getfield        #43  <Field Boolean zzavi>
	//* 119  215:invokevirtual   #77  <Method boolean Boolean.equals(Object)>
	//* 120  218:ifne            223
			return false;
	//  121  221:iconst_0        
	//  122  222:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//* 123  223:aload_0         
	//* 124  224:getfield        #47  <Field zzye zzcet>
	//* 125  227:ifnull          255
	//* 126  230:aload_0         
	//* 127  231:getfield        #47  <Field zzye zzcet>
	//* 128  234:invokevirtual   #86  <Method boolean zzye.isEmpty()>
	//* 129  237:ifeq            243
	//* 130  240:goto            255
			return zzcet.equals(((Object) (((zzfj) (obj)).zzcet)));
	//  131  243:aload_0         
	//  132  244:getfield        #47  <Field zzye zzcet>
	//  133  247:aload_1         
	//  134  248:getfield        #47  <Field zzye zzcet>
	//  135  251:invokevirtual   #87  <Method boolean zzye.equals(Object)>
	//  136  254:ireturn         
		if(((zzfj) (obj)).zzcet != null)
	//* 137  255:aload_1         
	//* 138  256:getfield        #47  <Field zzye zzcet>
	//* 139  259:ifnull          276
			return ((zzfj) (obj)).zzcet.isEmpty();
	//  140  262:aload_1         
	//  141  263:getfield        #47  <Field zzye zzcet>
	//  142  266:invokevirtual   #86  <Method boolean zzye.isEmpty()>
	//  143  269:ifeq            274
	//  144  272:iconst_1        
	//  145  273:ireturn         
	//  146  274:iconst_0        
	//  147  275:ireturn         
		else
			return true;
	//  148  276:iconst_1        
	//  149  277:ireturn         
	}

	public final int hashCode()
	{
		int l1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #101 <Method String Class.getName()>
	//    3    7:invokevirtual   #103 <Method int String.hashCode()>
	//    4   10:istore          9
		Object obj = ((Object) (zzavk));
	//    5   12:aload_0         
	//    6   13:getfield        #25  <Field Integer zzavk>
	//    7   16:astore          11
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          8
		int i;
		if(obj == null)
	//*  10   21:aload           11
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((Integer) (obj)).hashCode();
	//   15   31:aload           11
	//   16   33:invokevirtual   #104 <Method int Integer.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzavl));
	//   18   37:aload_0         
	//   19   38:getfield        #27  <Field String zzavl>
	//   20   41:astore          11
		int j;
		if(obj == null)
	//*  21   43:aload           11
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = ((String) (obj)).hashCode();
	//   26   53:aload           11
	//   27   55:invokevirtual   #103 <Method int String.hashCode()>
	//   28   58:istore_2        
		int i2 = zzyg.hashCode(((Object []) (zzavm)));
	//   29   59:aload_0         
	//   30   60:getfield        #35  <Field zzfk[] zzavm>
	//   31   63:invokestatic    #107 <Method int zzyg.hashCode(Object[])>
	//   32   66:istore          10
		obj = ((Object) (zzavn));
	//   33   68:aload_0         
	//   34   69:getfield        #37  <Field Boolean zzavn>
	//   35   72:astore          11
		int k;
		if(obj == null)
	//*  36   74:aload           11
	//*  37   76:ifnonnull       84
			k = 0;
	//   38   79:iconst_0        
	//   39   80:istore_3        
		else
	//*  40   81:goto            90
			k = ((Boolean) (obj)).hashCode();
	//   41   84:aload           11
	//   42   86:invokevirtual   #108 <Method int Boolean.hashCode()>
	//   43   89:istore_3        
		obj = ((Object) (zzavo));
	//   44   90:aload_0         
	//   45   91:getfield        #39  <Field zzfl zzavo>
	//   46   94:astore          11
		int l;
		if(obj == null)
	//*  47   96:aload           11
	//*  48   98:ifnonnull       107
			l = 0;
	//   49  101:iconst_0        
	//   50  102:istore          4
		else
	//*  51  104:goto            114
			l = ((zzfl) (obj)).hashCode();
	//   52  107:aload           11
	//   53  109:invokevirtual   #109 <Method int zzfl.hashCode()>
	//   54  112:istore          4
		obj = ((Object) (zzavh));
	//   55  114:aload_0         
	//   56  115:getfield        #41  <Field Boolean zzavh>
	//   57  118:astore          11
		int i1;
		if(obj == null)
	//*  58  120:aload           11
	//*  59  122:ifnonnull       131
			i1 = 0;
	//   60  125:iconst_0        
	//   61  126:istore          5
		else
	//*  62  128:goto            138
			i1 = ((Boolean) (obj)).hashCode();
	//   63  131:aload           11
	//   64  133:invokevirtual   #108 <Method int Boolean.hashCode()>
	//   65  136:istore          5
		obj = ((Object) (zzavi));
	//   66  138:aload_0         
	//   67  139:getfield        #43  <Field Boolean zzavi>
	//   68  142:astore          11
		int j1;
		if(obj == null)
	//*  69  144:aload           11
	//*  70  146:ifnonnull       155
			j1 = 0;
	//   71  149:iconst_0        
	//   72  150:istore          6
		else
	//*  73  152:goto            162
			j1 = ((Boolean) (obj)).hashCode();
	//   74  155:aload           11
	//   75  157:invokevirtual   #108 <Method int Boolean.hashCode()>
	//   76  160:istore          6
		int k1 = ((int) (flag));
	//   77  162:iload           8
	//   78  164:istore          7
		if(zzcet != null)
	//*  79  166:aload_0         
	//*  80  167:getfield        #47  <Field zzye zzcet>
	//*  81  170:ifnull          199
			if(zzcet.isEmpty())
	//*  82  173:aload_0         
	//*  83  174:getfield        #47  <Field zzye zzcet>
	//*  84  177:invokevirtual   #86  <Method boolean zzye.isEmpty()>
	//*  85  180:ifeq            190
				k1 = ((int) (flag));
	//   86  183:iload           8
	//   87  185:istore          7
			else
	//*  88  187:goto            199
				k1 = zzcet.hashCode();
	//   89  190:aload_0         
	//   90  191:getfield        #47  <Field zzye zzcet>
	//   91  194:invokevirtual   #110 <Method int zzye.hashCode()>
	//   92  197:istore          7
		return ((((((((l1 + 527) * 31 + i) * 31 + j) * 31 + i2) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1;
	//   93  199:iload           9
	//   94  201:sipush          527
	//   95  204:iadd            
	//   96  205:bipush          31
	//   97  207:imul            
	//   98  208:iload_1         
	//   99  209:iadd            
	//  100  210:bipush          31
	//  101  212:imul            
	//  102  213:iload_2         
	//  103  214:iadd            
	//  104  215:bipush          31
	//  105  217:imul            
	//  106  218:iload           10
	//  107  220:iadd            
	//  108  221:bipush          31
	//  109  223:imul            
	//  110  224:iload_3         
	//  111  225:iadd            
	//  112  226:bipush          31
	//  113  228:imul            
	//  114  229:iload           4
	//  115  231:iadd            
	//  116  232:bipush          31
	//  117  234:imul            
	//  118  235:iload           5
	//  119  237:iadd            
	//  120  238:bipush          31
	//  121  240:imul            
	//  122  241:iload           6
	//  123  243:iadd            
	//  124  244:bipush          31
	//  125  246:imul            
	//  126  247:iload           7
	//  127  249:iadd            
	//  128  250:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #119 <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            281
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          267
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          256
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          133
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          119
						{
							if(i != 42)
	//*  17   33:iload_2         
	//*  18   34:bipush          42
	//*  19   36:icmpeq          90
							{
								if(i != 48)
	//*  20   39:iload_2         
	//*  21   40:bipush          48
	//*  22   42:icmpeq          76
								{
									if(i != 56)
	//*  23   45:iload_2         
	//*  24   46:bipush          56
	//*  25   48:icmpeq          62
									{
										if(!super.zza(zzxz1, i))
	//*  26   51:aload_0         
	//*  27   52:aload_1         
	//*  28   53:iload_2         
	//*  29   54:invokespecial   #122 <Method boolean zzyc.zza(zzxz, int)>
	//*  30   57:ifne            0
											return ((zzyi) (this));
	//   31   60:aload_0         
	//   32   61:areturn         
									} else
									{
										zzavi = Boolean.valueOf(zzxz1.zzup());
	//   33   62:aload_0         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #125 <Method boolean zzxz.zzup()>
	//   36   67:invokestatic    #129 <Method Boolean Boolean.valueOf(boolean)>
	//   37   70:putfield        #43  <Field Boolean zzavi>
									}
								} else
	//*  38   73:goto            0
								{
									zzavh = Boolean.valueOf(zzxz1.zzup());
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #125 <Method boolean zzxz.zzup()>
	//   42   81:invokestatic    #129 <Method Boolean Boolean.valueOf(boolean)>
	//   43   84:putfield        #41  <Field Boolean zzavh>
								}
							} else
	//*  44   87:goto            0
							{
								if(zzavo == null)
	//*  45   90:aload_0         
	//*  46   91:getfield        #39  <Field zzfl zzavo>
	//*  47   94:ifnonnull       108
									zzavo = new zzfl();
	//   48   97:aload_0         
	//   49   98:new             #79  <Class zzfl>
	//   50  101:dup             
	//   51  102:invokespecial   #130 <Method void zzfl()>
	//   52  105:putfield        #39  <Field zzfl zzavo>
								zzxz1.zza(((zzyi) (zzavo)));
	//   53  108:aload_1         
	//   54  109:aload_0         
	//   55  110:getfield        #39  <Field zzfl zzavo>
	//   56  113:invokevirtual   #133 <Method void zzxz.zza(zzyi)>
							}
						} else
	//*  57  116:goto            0
						{
							zzavn = Boolean.valueOf(zzxz1.zzup());
	//   58  119:aload_0         
	//   59  120:aload_1         
	//   60  121:invokevirtual   #125 <Method boolean zzxz.zzup()>
	//   61  124:invokestatic    #129 <Method Boolean Boolean.valueOf(boolean)>
	//   62  127:putfield        #37  <Field Boolean zzavn>
						}
					} else
	//*  63  130:goto            0
					{
						int k = zzyl.zzb(zzxz1, 26);
	//   64  133:aload_1         
	//   65  134:bipush          26
	//   66  136:invokestatic    #139 <Method int zzyl.zzb(zzxz, int)>
	//   67  139:istore_3        
						zzfk azzfk[] = zzavm;
	//   68  140:aload_0         
	//   69  141:getfield        #35  <Field zzfk[] zzavm>
	//   70  144:astore          4
						int j;
						if(azzfk == null)
	//*  71  146:aload           4
	//*  72  148:ifnonnull       156
							j = 0;
	//   73  151:iconst_0        
	//   74  152:istore_2        
						else
	//*  75  153:goto            160
							j = azzfk.length;
	//   76  156:aload           4
	//   77  158:arraylength     
	//   78  159:istore_2        
						azzfk = new zzfk[k + j];
	//   79  160:iload_3         
	//   80  161:iload_2         
	//   81  162:iadd            
	//   82  163:anewarray       zzfk[]
	//   83  166:astore          4
						k = j;
	//   84  168:iload_2         
	//   85  169:istore_3        
						if(j != 0)
	//*  86  170:iload_2         
	//*  87  171:ifeq            188
						{
							System.arraycopy(((Object) (zzavm)), 0, ((Object) (azzfk)), 0, j);
	//   88  174:aload_0         
	//   89  175:getfield        #35  <Field zzfk[] zzavm>
	//   90  178:iconst_0        
	//   91  179:aload           4
	//   92  181:iconst_0        
	//   93  182:iload_2         
	//   94  183:invokestatic    #145 <Method void System.arraycopy(Object, int, Object, int, int)>
							k = j;
	//   95  186:iload_2         
	//   96  187:istore_3        
						}
						for(; k < azzfk.length - 1; k++)
	//*  97  188:iload_3         
	//*  98  189:aload           4
	//*  99  191:arraylength     
	//* 100  192:iconst_1        
	//* 101  193:isub            
	//* 102  194:icmpge          228
						{
							azzfk[k] = new zzfk();
	//  103  197:aload           4
	//  104  199:iload_3         
	//  105  200:new             #29  <Class zzfk>
	//  106  203:dup             
	//  107  204:invokespecial   #146 <Method void zzfk()>
	//  108  207:aastore         
							zzxz1.zza(((zzyi) (azzfk[k])));
	//  109  208:aload_1         
	//  110  209:aload           4
	//  111  211:iload_3         
	//  112  212:aaload          
	//  113  213:invokevirtual   #133 <Method void zzxz.zza(zzyi)>
							zzxz1.zzuj();
	//  114  216:aload_1         
	//  115  217:invokevirtual   #119 <Method int zzxz.zzuj()>
	//  116  220:pop             
						}

	//  117  221:iload_3         
	//  118  222:iconst_1        
	//  119  223:iadd            
	//  120  224:istore_3        
	//* 121  225:goto            188
						azzfk[k] = new zzfk();
	//  122  228:aload           4
	//  123  230:iload_3         
	//  124  231:new             #29  <Class zzfk>
	//  125  234:dup             
	//  126  235:invokespecial   #146 <Method void zzfk()>
	//  127  238:aastore         
						zzxz1.zza(((zzyi) (azzfk[k])));
	//  128  239:aload_1         
	//  129  240:aload           4
	//  130  242:iload_3         
	//  131  243:aaload          
	//  132  244:invokevirtual   #133 <Method void zzxz.zza(zzyi)>
						zzavm = azzfk;
	//  133  247:aload_0         
	//  134  248:aload           4
	//  135  250:putfield        #35  <Field zzfk[] zzavm>
					}
				} else
	//* 136  253:goto            0
				{
					zzavl = zzxz1.readString();
	//  137  256:aload_0         
	//  138  257:aload_1         
	//  139  258:invokevirtual   #149 <Method String zzxz.readString()>
	//  140  261:putfield        #27  <Field String zzavl>
				}
			} else
	//* 141  264:goto            0
			{
				zzavk = Integer.valueOf(zzxz1.zzvb());
	//  142  267:aload_0         
	//  143  268:aload_1         
	//  144  269:invokevirtual   #152 <Method int zzxz.zzvb()>
	//  145  272:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//  146  275:putfield        #25  <Field Integer zzavk>
			}
		} while(true);
	//  147  278:goto            0
		return ((zzyi) (this));
	//  148  281:aload_0         
	//  149  282:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzavk));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Integer zzavk>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
			zzya1.zzd(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_3         
	//    8   12:invokevirtual   #160 <Method int Integer.intValue()>
	//    9   15:invokevirtual   #166 <Method void zzya.zzd(int, int)>
		obj = ((Object) (zzavl));
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field String zzavl>
	//   12   22:astore_3        
		if(obj != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          33
			zzya1.zzb(2, ((String) (obj)));
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_3         
	//   18   30:invokevirtual   #169 <Method void zzya.zzb(int, String)>
		zzfk azzfk[] = zzavm;
	//   19   33:aload_0         
	//   20   34:getfield        #35  <Field zzfk[] zzavm>
	//   21   37:astore_3        
		if(azzfk != null && azzfk.length > 0)
	//*  22   38:aload_3         
	//*  23   39:ifnull          81
	//*  24   42:aload_3         
	//*  25   43:arraylength     
	//*  26   44:ifle            81
		{
			int i = 0;
	//   27   47:iconst_0        
	//   28   48:istore_2        
			do
			{
				zzfk azzfk1[] = zzavm;
	//   29   49:aload_0         
	//   30   50:getfield        #35  <Field zzfk[] zzavm>
	//   31   53:astore_3        
				if(i >= azzfk1.length)
					break;
	//   32   54:iload_2         
	//   33   55:aload_3         
	//   34   56:arraylength     
	//   35   57:icmpge          81
				azzfk1 = ((zzfk []) (azzfk1[i]));
	//   36   60:aload_3         
	//   37   61:iload_2         
	//   38   62:aaload          
	//   39   63:astore_3        
				if(azzfk1 != null)
	//*  40   64:aload_3         
	//*  41   65:ifnull          74
					zzya1.zza(3, ((zzyi) (azzfk1)));
	//   42   68:aload_1         
	//   43   69:iconst_3        
	//   44   70:aload_3         
	//   45   71:invokevirtual   #172 <Method void zzya.zza(int, zzyi)>
				i++;
	//   46   74:iload_2         
	//   47   75:iconst_1        
	//   48   76:iadd            
	//   49   77:istore_2        
			} while(true);
	//   50   78:goto            49
		}
		azzfk1 = ((zzfk []) (zzavn));
	//   51   81:aload_0         
	//   52   82:getfield        #37  <Field Boolean zzavn>
	//   53   85:astore_3        
		if(azzfk1 != null)
	//*  54   86:aload_3         
	//*  55   87:ifnull          99
			zzya1.zzb(4, ((Boolean) (azzfk1)).booleanValue());
	//   56   90:aload_1         
	//   57   91:iconst_4        
	//   58   92:aload_3         
	//   59   93:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//   60   96:invokevirtual   #178 <Method void zzya.zzb(int, boolean)>
		azzfk1 = ((zzfk []) (zzavo));
	//   61   99:aload_0         
	//   62  100:getfield        #39  <Field zzfl zzavo>
	//   63  103:astore_3        
		if(azzfk1 != null)
	//*  64  104:aload_3         
	//*  65  105:ifnull          114
			zzya1.zza(5, ((zzyi) (azzfk1)));
	//   66  108:aload_1         
	//   67  109:iconst_5        
	//   68  110:aload_3         
	//   69  111:invokevirtual   #172 <Method void zzya.zza(int, zzyi)>
		azzfk1 = ((zzfk []) (zzavh));
	//   70  114:aload_0         
	//   71  115:getfield        #41  <Field Boolean zzavh>
	//   72  118:astore_3        
		if(azzfk1 != null)
	//*  73  119:aload_3         
	//*  74  120:ifnull          133
			zzya1.zzb(6, ((Boolean) (azzfk1)).booleanValue());
	//   75  123:aload_1         
	//   76  124:bipush          6
	//   77  126:aload_3         
	//   78  127:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//   79  130:invokevirtual   #178 <Method void zzya.zzb(int, boolean)>
		azzfk1 = ((zzfk []) (zzavi));
	//   80  133:aload_0         
	//   81  134:getfield        #43  <Field Boolean zzavi>
	//   82  137:astore_3        
		if(azzfk1 != null)
	//*  83  138:aload_3         
	//*  84  139:ifnull          152
			zzya1.zzb(7, ((Boolean) (azzfk1)).booleanValue());
	//   85  142:aload_1         
	//   86  143:bipush          7
	//   87  145:aload_3         
	//   88  146:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//   89  149:invokevirtual   #178 <Method void zzya.zzb(int, boolean)>
		super.zza(zzya1);
	//   90  152:aload_0         
	//   91  153:aload_1         
	//   92  154:invokespecial   #180 <Method void zzyc.zza(zzya)>
	//   93  157:return          
	}

	protected final int zzf()
	{
		int i = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #183 <Method int zzyc.zzf()>
	//    2    4:istore_1        
		Object obj = ((Object) (zzavk));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field Integer zzavk>
	//    5    9:astore          4
		int j = i;
	//    6   11:iload_1         
	//    7   12:istore_2        
		if(obj != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          30
			j = i + zzya.zzh(1, ((Integer) (obj)).intValue());
	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:aload           4
	//   13   22:invokevirtual   #160 <Method int Integer.intValue()>
	//   14   25:invokestatic    #187 <Method int zzya.zzh(int, int)>
	//   15   28:iadd            
	//   16   29:istore_2        
		obj = ((Object) (zzavl));
	//   17   30:aload_0         
	//   18   31:getfield        #27  <Field String zzavl>
	//   19   34:astore          4
		i = j;
	//   20   36:iload_2         
	//   21   37:istore_1        
		if(obj != null)
	//*  22   38:aload           4
	//*  23   40:ifnull          52
			i = j + zzya.zzc(2, ((String) (obj)));
	//   24   43:iload_2         
	//   25   44:iconst_2        
	//   26   45:aload           4
	//   27   47:invokestatic    #191 <Method int zzya.zzc(int, String)>
	//   28   50:iadd            
	//   29   51:istore_1        
		zzfk azzfk[] = zzavm;
	//   30   52:aload_0         
	//   31   53:getfield        #35  <Field zzfk[] zzavm>
	//   32   56:astore          4
		j = i;
	//   33   58:iload_1         
	//   34   59:istore_2        
		if(azzfk != null)
	//*  35   60:aload           4
	//*  36   62:ifnull          121
		{
			j = i;
	//   37   65:iload_1         
	//   38   66:istore_2        
			if(azzfk.length > 0)
	//*  39   67:aload           4
	//*  40   69:arraylength     
	//*  41   70:ifle            121
			{
				int k = 0;
	//   42   73:iconst_0        
	//   43   74:istore_3        
				do
				{
					zzfk azzfk1[] = zzavm;
	//   44   75:aload_0         
	//   45   76:getfield        #35  <Field zzfk[] zzavm>
	//   46   79:astore          4
					j = i;
	//   47   81:iload_1         
	//   48   82:istore_2        
					if(k >= azzfk1.length)
						break;
	//   49   83:iload_3         
	//   50   84:aload           4
	//   51   86:arraylength     
	//   52   87:icmpge          121
					azzfk1 = ((zzfk []) (azzfk1[k]));
	//   53   90:aload           4
	//   54   92:iload_3         
	//   55   93:aaload          
	//   56   94:astore          4
					j = i;
	//   57   96:iload_1         
	//   58   97:istore_2        
					if(azzfk1 != null)
	//*  59   98:aload           4
	//*  60  100:ifnull          112
						j = i + zzya.zzb(3, ((zzyi) (azzfk1)));
	//   61  103:iload_1         
	//   62  104:iconst_3        
	//   63  105:aload           4
	//   64  107:invokestatic    #194 <Method int zzya.zzb(int, zzyi)>
	//   65  110:iadd            
	//   66  111:istore_2        
					k++;
	//   67  112:iload_3         
	//   68  113:iconst_1        
	//   69  114:iadd            
	//   70  115:istore_3        
					i = j;
	//   71  116:iload_2         
	//   72  117:istore_1        
				} while(true);
	//   73  118:goto            75
			}
		}
		azzfk1 = ((zzfk []) (zzavn));
	//   74  121:aload_0         
	//   75  122:getfield        #37  <Field Boolean zzavn>
	//   76  125:astore          4
		i = j;
	//   77  127:iload_2         
	//   78  128:istore_1        
		if(azzfk1 != null)
	//*  79  129:aload           4
	//*  80  131:ifnull          149
		{
			((Boolean) (azzfk1)).booleanValue();
	//   81  134:aload           4
	//   82  136:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//   83  139:pop             
			i = j + (zzya.zzbd(4) + 1);
	//   84  140:iload_2         
	//   85  141:iconst_4        
	//   86  142:invokestatic    #198 <Method int zzya.zzbd(int)>
	//   87  145:iconst_1        
	//   88  146:iadd            
	//   89  147:iadd            
	//   90  148:istore_1        
		}
		azzfk1 = ((zzfk []) (zzavo));
	//   91  149:aload_0         
	//   92  150:getfield        #39  <Field zzfl zzavo>
	//   93  153:astore          4
		j = i;
	//   94  155:iload_1         
	//   95  156:istore_2        
		if(azzfk1 != null)
	//*  96  157:aload           4
	//*  97  159:ifnull          171
			j = i + zzya.zzb(5, ((zzyi) (azzfk1)));
	//   98  162:iload_1         
	//   99  163:iconst_5        
	//  100  164:aload           4
	//  101  166:invokestatic    #194 <Method int zzya.zzb(int, zzyi)>
	//  102  169:iadd            
	//  103  170:istore_2        
		azzfk1 = ((zzfk []) (zzavh));
	//  104  171:aload_0         
	//  105  172:getfield        #41  <Field Boolean zzavh>
	//  106  175:astore          4
		i = j;
	//  107  177:iload_2         
	//  108  178:istore_1        
		if(azzfk1 != null)
	//* 109  179:aload           4
	//* 110  181:ifnull          200
		{
			((Boolean) (azzfk1)).booleanValue();
	//  111  184:aload           4
	//  112  186:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//  113  189:pop             
			i = j + (zzya.zzbd(6) + 1);
	//  114  190:iload_2         
	//  115  191:bipush          6
	//  116  193:invokestatic    #198 <Method int zzya.zzbd(int)>
	//  117  196:iconst_1        
	//  118  197:iadd            
	//  119  198:iadd            
	//  120  199:istore_1        
		}
		azzfk1 = ((zzfk []) (zzavi));
	//  121  200:aload_0         
	//  122  201:getfield        #43  <Field Boolean zzavi>
	//  123  204:astore          4
		j = i;
	//  124  206:iload_1         
	//  125  207:istore_2        
		if(azzfk1 != null)
	//* 126  208:aload           4
	//* 127  210:ifnull          229
		{
			((Boolean) (azzfk1)).booleanValue();
	//  128  213:aload           4
	//  129  215:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//  130  218:pop             
			j = i + (zzya.zzbd(7) + 1);
	//  131  219:iload_1         
	//  132  220:bipush          7
	//  133  222:invokestatic    #198 <Method int zzya.zzbd(int)>
	//  134  225:iconst_1        
	//  135  226:iadd            
	//  136  227:iadd            
	//  137  228:istore_2        
		}
		return j;
	//  138  229:iload_2         
	//  139  230:ireturn         
	}

	private static volatile zzfj zzavj[];
	public Boolean zzavh;
	public Boolean zzavi;
	public Integer zzavk;
	public String zzavl;
	public zzfk zzavm[];
	private Boolean zzavn;
	public zzfl zzavo;
}
