// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzfu, zzyg, zzye, 
//			zzxz, zzyl, zzya, zzyi

public final class zzft extends zzyc
{

	public zzft()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzyc()>
		zzaxa = zzfu.zzna();
	//    2    4:aload_0         
	//    3    5:invokestatic    #26  <Method zzfu[] zzfu.zzna()>
	//    4    8:putfield        #28  <Field zzfu[] zzaxa>
		name = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #30  <Field String name>
		zzaxb = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #32  <Field Long zzaxb>
		zzaxc = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #34  <Field Long zzaxc>
		count = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #36  <Field Integer count>
		zzcet = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #40  <Field zzye zzcet>
		zzcfd = -1;
	//   20   36:aload_0         
	//   21   37:iconst_m1       
	//   22   38:putfield        #44  <Field int zzcfd>
	//   23   41:return          
	}

	public static zzft[] zzmz()
	{
		if(zzawz == null)
	//*   0    0:getstatic       #49  <Field zzft[] zzawz>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #55  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzawz == null)
	//*   6   12:getstatic       #49  <Field zzft[] zzawz>
	//*   7   15:ifnonnull       25
					zzawz = new zzft[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzft[]
	//   10   22:putstatic       #49  <Field zzft[] zzawz>
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
		return zzawz;
	//   19   35:getstatic       #49  <Field zzft[] zzawz>
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
		if(!(obj instanceof zzft))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzft>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzft)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzft>
	//   12   20:astore_1        
		if(!zzyg.equals(((Object []) (zzaxa)), ((Object []) (((zzft) (obj)).zzaxa))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #28  <Field zzfu[] zzaxa>
	//*  15   25:aload_1         
	//*  16   26:getfield        #28  <Field zzfu[] zzaxa>
	//*  17   29:invokestatic    #60  <Method boolean zzyg.equals(Object[], Object[])>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		Object obj1 = ((Object) (name));
	//   21   37:aload_0         
	//   22   38:getfield        #30  <Field String name>
	//   23   41:astore_2        
		if(obj1 == null)
	//*  24   42:aload_2         
	//*  25   43:ifnonnull       55
		{
			if(((zzft) (obj)).name != null)
	//*  26   46:aload_1         
	//*  27   47:getfield        #30  <Field String name>
	//*  28   50:ifnull          68
				return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzft) (obj)).name))))
	//*  31   55:aload_2         
	//*  32   56:aload_1         
	//*  33   57:getfield        #30  <Field String name>
	//*  34   60:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  35   63:ifne            68
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		obj1 = ((Object) (zzaxb));
	//   38   68:aload_0         
	//   39   69:getfield        #32  <Field Long zzaxb>
	//   40   72:astore_2        
		if(obj1 == null)
	//*  41   73:aload_2         
	//*  42   74:ifnonnull       86
		{
			if(((zzft) (obj)).zzaxb != null)
	//*  43   77:aload_1         
	//*  44   78:getfield        #32  <Field Long zzaxb>
	//*  45   81:ifnull          99
				return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
		} else
		if(!((Long) (obj1)).equals(((Object) (((zzft) (obj)).zzaxb))))
	//*  48   86:aload_2         
	//*  49   87:aload_1         
	//*  50   88:getfield        #32  <Field Long zzaxb>
	//*  51   91:invokevirtual   #67  <Method boolean Long.equals(Object)>
	//*  52   94:ifne            99
			return false;
	//   53   97:iconst_0        
	//   54   98:ireturn         
		obj1 = ((Object) (zzaxc));
	//   55   99:aload_0         
	//   56  100:getfield        #34  <Field Long zzaxc>
	//   57  103:astore_2        
		if(obj1 == null)
	//*  58  104:aload_2         
	//*  59  105:ifnonnull       117
		{
			if(((zzft) (obj)).zzaxc != null)
	//*  60  108:aload_1         
	//*  61  109:getfield        #34  <Field Long zzaxc>
	//*  62  112:ifnull          130
				return false;
	//   63  115:iconst_0        
	//   64  116:ireturn         
		} else
		if(!((Long) (obj1)).equals(((Object) (((zzft) (obj)).zzaxc))))
	//*  65  117:aload_2         
	//*  66  118:aload_1         
	//*  67  119:getfield        #34  <Field Long zzaxc>
	//*  68  122:invokevirtual   #67  <Method boolean Long.equals(Object)>
	//*  69  125:ifne            130
			return false;
	//   70  128:iconst_0        
	//   71  129:ireturn         
		obj1 = ((Object) (count));
	//   72  130:aload_0         
	//   73  131:getfield        #36  <Field Integer count>
	//   74  134:astore_2        
		if(obj1 == null)
	//*  75  135:aload_2         
	//*  76  136:ifnonnull       148
		{
			if(((zzft) (obj)).count != null)
	//*  77  139:aload_1         
	//*  78  140:getfield        #36  <Field Integer count>
	//*  79  143:ifnull          161
				return false;
	//   80  146:iconst_0        
	//   81  147:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzft) (obj)).count))))
	//*  82  148:aload_2         
	//*  83  149:aload_1         
	//*  84  150:getfield        #36  <Field Integer count>
	//*  85  153:invokevirtual   #70  <Method boolean Integer.equals(Object)>
	//*  86  156:ifne            161
			return false;
	//   87  159:iconst_0        
	//   88  160:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  89  161:aload_0         
	//*  90  162:getfield        #40  <Field zzye zzcet>
	//*  91  165:ifnull          193
	//*  92  168:aload_0         
	//*  93  169:getfield        #40  <Field zzye zzcet>
	//*  94  172:invokevirtual   #76  <Method boolean zzye.isEmpty()>
	//*  95  175:ifeq            181
	//*  96  178:goto            193
			return zzcet.equals(((Object) (((zzft) (obj)).zzcet)));
	//   97  181:aload_0         
	//   98  182:getfield        #40  <Field zzye zzcet>
	//   99  185:aload_1         
	//  100  186:getfield        #40  <Field zzye zzcet>
	//  101  189:invokevirtual   #77  <Method boolean zzye.equals(Object)>
	//  102  192:ireturn         
		if(((zzft) (obj)).zzcet != null)
	//* 103  193:aload_1         
	//* 104  194:getfield        #40  <Field zzye zzcet>
	//* 105  197:ifnull          214
			return ((zzft) (obj)).zzcet.isEmpty();
	//  106  200:aload_1         
	//  107  201:getfield        #40  <Field zzye zzcet>
	//  108  204:invokevirtual   #76  <Method boolean zzye.isEmpty()>
	//  109  207:ifeq            212
	//  110  210:iconst_1        
	//  111  211:ireturn         
	//  112  212:iconst_0        
	//  113  213:ireturn         
		else
			return true;
	//  114  214:iconst_1        
	//  115  215:ireturn         
	}

	public final int hashCode()
	{
		int j1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #91  <Method String Class.getName()>
	//    3    7:invokevirtual   #93  <Method int String.hashCode()>
	//    4   10:istore          7
		int k1 = zzyg.hashCode(((Object []) (zzaxa)));
	//    5   12:aload_0         
	//    6   13:getfield        #28  <Field zzfu[] zzaxa>
	//    7   16:invokestatic    #96  <Method int zzyg.hashCode(Object[])>
	//    8   19:istore          8
		Object obj = ((Object) (name));
	//    9   21:aload_0         
	//   10   22:getfield        #30  <Field String name>
	//   11   25:astore          9
		boolean flag = false;
	//   12   27:iconst_0        
	//   13   28:istore          6
		int i;
		if(obj == null)
	//*  14   30:aload           9
	//*  15   32:ifnonnull       40
			i = 0;
	//   16   35:iconst_0        
	//   17   36:istore_1        
		else
	//*  18   37:goto            46
			i = ((String) (obj)).hashCode();
	//   19   40:aload           9
	//   20   42:invokevirtual   #93  <Method int String.hashCode()>
	//   21   45:istore_1        
		obj = ((Object) (zzaxb));
	//   22   46:aload_0         
	//   23   47:getfield        #32  <Field Long zzaxb>
	//   24   50:astore          9
		int j;
		if(obj == null)
	//*  25   52:aload           9
	//*  26   54:ifnonnull       62
			j = 0;
	//   27   57:iconst_0        
	//   28   58:istore_2        
		else
	//*  29   59:goto            68
			j = ((Long) (obj)).hashCode();
	//   30   62:aload           9
	//   31   64:invokevirtual   #97  <Method int Long.hashCode()>
	//   32   67:istore_2        
		obj = ((Object) (zzaxc));
	//   33   68:aload_0         
	//   34   69:getfield        #34  <Field Long zzaxc>
	//   35   72:astore          9
		int k;
		if(obj == null)
	//*  36   74:aload           9
	//*  37   76:ifnonnull       84
			k = 0;
	//   38   79:iconst_0        
	//   39   80:istore_3        
		else
	//*  40   81:goto            90
			k = ((Long) (obj)).hashCode();
	//   41   84:aload           9
	//   42   86:invokevirtual   #97  <Method int Long.hashCode()>
	//   43   89:istore_3        
		obj = ((Object) (count));
	//   44   90:aload_0         
	//   45   91:getfield        #36  <Field Integer count>
	//   46   94:astore          9
		int l;
		if(obj == null)
	//*  47   96:aload           9
	//*  48   98:ifnonnull       107
			l = 0;
	//   49  101:iconst_0        
	//   50  102:istore          4
		else
	//*  51  104:goto            114
			l = ((Integer) (obj)).hashCode();
	//   52  107:aload           9
	//   53  109:invokevirtual   #98  <Method int Integer.hashCode()>
	//   54  112:istore          4
		int i1 = ((int) (flag));
	//   55  114:iload           6
	//   56  116:istore          5
		if(zzcet != null)
	//*  57  118:aload_0         
	//*  58  119:getfield        #40  <Field zzye zzcet>
	//*  59  122:ifnull          151
			if(zzcet.isEmpty())
	//*  60  125:aload_0         
	//*  61  126:getfield        #40  <Field zzye zzcet>
	//*  62  129:invokevirtual   #76  <Method boolean zzye.isEmpty()>
	//*  63  132:ifeq            142
				i1 = ((int) (flag));
	//   64  135:iload           6
	//   65  137:istore          5
			else
	//*  66  139:goto            151
				i1 = zzcet.hashCode();
	//   67  142:aload_0         
	//   68  143:getfield        #40  <Field zzye zzcet>
	//   69  146:invokevirtual   #99  <Method int zzye.hashCode()>
	//   70  149:istore          5
		return ((((((j1 + 527) * 31 + k1) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
	//   71  151:iload           7
	//   72  153:sipush          527
	//   73  156:iadd            
	//   74  157:bipush          31
	//   75  159:imul            
	//   76  160:iload           8
	//   77  162:iadd            
	//   78  163:bipush          31
	//   79  165:imul            
	//   80  166:iload_1         
	//   81  167:iadd            
	//   82  168:bipush          31
	//   83  170:imul            
	//   84  171:iload_2         
	//   85  172:iadd            
	//   86  173:bipush          31
	//   87  175:imul            
	//   88  176:iload_3         
	//   89  177:iadd            
	//   90  178:bipush          31
	//   91  180:imul            
	//   92  181:iload           4
	//   93  183:iadd            
	//   94  184:bipush          31
	//   95  186:imul            
	//   96  187:iload           5
	//   97  189:iadd            
	//   98  190:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            226
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          103
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          92
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
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
	//*  23   42:invokespecial   #111 <Method boolean zzyc.zza(zzxz, int)>
	//*  24   45:ifne            0
									return ((zzyi) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								count = Integer.valueOf(zzxz1.zzvb());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #114 <Method int zzxz.zzvb()>
	//   30   55:invokestatic    #118 <Method Integer Integer.valueOf(int)>
	//   31   58:putfield        #36  <Field Integer count>
							}
						} else
	//*  32   61:goto            0
						{
							zzaxc = Long.valueOf(zzxz1.zzvc());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #122 <Method long zzxz.zzvc()>
	//   36   69:invokestatic    #125 <Method Long Long.valueOf(long)>
	//   37   72:putfield        #34  <Field Long zzaxc>
						}
					} else
	//*  38   75:goto            0
					{
						zzaxb = Long.valueOf(zzxz1.zzvc());
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:invokevirtual   #122 <Method long zzxz.zzvc()>
	//   42   83:invokestatic    #125 <Method Long Long.valueOf(long)>
	//   43   86:putfield        #32  <Field Long zzaxb>
					}
				} else
	//*  44   89:goto            0
				{
					name = zzxz1.readString();
	//   45   92:aload_0         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #128 <Method String zzxz.readString()>
	//   48   97:putfield        #30  <Field String name>
				}
			} else
	//*  49  100:goto            0
			{
				int k = zzyl.zzb(zzxz1, 10);
	//   50  103:aload_1         
	//   51  104:bipush          10
	//   52  106:invokestatic    #134 <Method int zzyl.zzb(zzxz, int)>
	//   53  109:istore_3        
				zzfu azzfu[] = zzaxa;
	//   54  110:aload_0         
	//   55  111:getfield        #28  <Field zzfu[] zzaxa>
	//   56  114:astore          4
				int j;
				if(azzfu == null)
	//*  57  116:aload           4
	//*  58  118:ifnonnull       126
					j = 0;
	//   59  121:iconst_0        
	//   60  122:istore_2        
				else
	//*  61  123:goto            130
					j = azzfu.length;
	//   62  126:aload           4
	//   63  128:arraylength     
	//   64  129:istore_2        
				azzfu = new zzfu[k + j];
	//   65  130:iload_3         
	//   66  131:iload_2         
	//   67  132:iadd            
	//   68  133:anewarray       zzfu[]
	//   69  136:astore          4
				k = j;
	//   70  138:iload_2         
	//   71  139:istore_3        
				if(j != 0)
	//*  72  140:iload_2         
	//*  73  141:ifeq            158
				{
					System.arraycopy(((Object) (zzaxa)), 0, ((Object) (azzfu)), 0, j);
	//   74  144:aload_0         
	//   75  145:getfield        #28  <Field zzfu[] zzaxa>
	//   76  148:iconst_0        
	//   77  149:aload           4
	//   78  151:iconst_0        
	//   79  152:iload_2         
	//   80  153:invokestatic    #140 <Method void System.arraycopy(Object, int, Object, int, int)>
					k = j;
	//   81  156:iload_2         
	//   82  157:istore_3        
				}
				for(; k < azzfu.length - 1; k++)
	//*  83  158:iload_3         
	//*  84  159:aload           4
	//*  85  161:arraylength     
	//*  86  162:iconst_1        
	//*  87  163:isub            
	//*  88  164:icmpge          198
				{
					azzfu[k] = new zzfu();
	//   89  167:aload           4
	//   90  169:iload_3         
	//   91  170:new             #22  <Class zzfu>
	//   92  173:dup             
	//   93  174:invokespecial   #141 <Method void zzfu()>
	//   94  177:aastore         
					zzxz1.zza(((zzyi) (azzfu[k])));
	//   95  178:aload_1         
	//   96  179:aload           4
	//   97  181:iload_3         
	//   98  182:aaload          
	//   99  183:invokevirtual   #144 <Method void zzxz.zza(zzyi)>
					zzxz1.zzuj();
	//  100  186:aload_1         
	//  101  187:invokevirtual   #108 <Method int zzxz.zzuj()>
	//  102  190:pop             
				}

	//  103  191:iload_3         
	//  104  192:iconst_1        
	//  105  193:iadd            
	//  106  194:istore_3        
	//* 107  195:goto            158
				azzfu[k] = new zzfu();
	//  108  198:aload           4
	//  109  200:iload_3         
	//  110  201:new             #22  <Class zzfu>
	//  111  204:dup             
	//  112  205:invokespecial   #141 <Method void zzfu()>
	//  113  208:aastore         
				zzxz1.zza(((zzyi) (azzfu[k])));
	//  114  209:aload_1         
	//  115  210:aload           4
	//  116  212:iload_3         
	//  117  213:aaload          
	//  118  214:invokevirtual   #144 <Method void zzxz.zza(zzyi)>
				zzaxa = azzfu;
	//  119  217:aload_0         
	//  120  218:aload           4
	//  121  220:putfield        #28  <Field zzfu[] zzaxa>
			}
		} while(true);
	//  122  223:goto            0
		return ((zzyi) (this));
	//  123  226:aload_0         
	//  124  227:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		zzfu azzfu[] = zzaxa;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field zzfu[] zzaxa>
	//    2    4:astore_3        
		if(azzfu != null && azzfu.length > 0)
	//*   3    5:aload_3         
	//*   4    6:ifnull          48
	//*   5    9:aload_3         
	//*   6   10:arraylength     
	//*   7   11:ifle            48
		{
			int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
			do
			{
				zzfu azzfu1[] = zzaxa;
	//   10   16:aload_0         
	//   11   17:getfield        #28  <Field zzfu[] zzaxa>
	//   12   20:astore_3        
				if(i >= azzfu1.length)
					break;
	//   13   21:iload_2         
	//   14   22:aload_3         
	//   15   23:arraylength     
	//   16   24:icmpge          48
				zzfu zzfu1 = azzfu1[i];
	//   17   27:aload_3         
	//   18   28:iload_2         
	//   19   29:aaload          
	//   20   30:astore_3        
				if(zzfu1 != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          41
					zzya1.zza(1, ((zzyi) (zzfu1)));
	//   23   35:aload_1         
	//   24   36:iconst_1        
	//   25   37:aload_3         
	//   26   38:invokevirtual   #151 <Method void zzya.zza(int, zzyi)>
				i++;
	//   27   41:iload_2         
	//   28   42:iconst_1        
	//   29   43:iadd            
	//   30   44:istore_2        
			} while(true);
	//   31   45:goto            16
		}
		Object obj = ((Object) (name));
	//   32   48:aload_0         
	//   33   49:getfield        #30  <Field String name>
	//   34   52:astore_3        
		if(obj != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          63
			zzya1.zzb(2, ((String) (obj)));
	//   37   57:aload_1         
	//   38   58:iconst_2        
	//   39   59:aload_3         
	//   40   60:invokevirtual   #154 <Method void zzya.zzb(int, String)>
		obj = ((Object) (zzaxb));
	//   41   63:aload_0         
	//   42   64:getfield        #32  <Field Long zzaxb>
	//   43   67:astore_3        
		if(obj != null)
	//*  44   68:aload_3         
	//*  45   69:ifnull          81
			zzya1.zzi(3, ((Long) (obj)).longValue());
	//   46   72:aload_1         
	//   47   73:iconst_3        
	//   48   74:aload_3         
	//   49   75:invokevirtual   #157 <Method long Long.longValue()>
	//   50   78:invokevirtual   #161 <Method void zzya.zzi(int, long)>
		obj = ((Object) (zzaxc));
	//   51   81:aload_0         
	//   52   82:getfield        #34  <Field Long zzaxc>
	//   53   85:astore_3        
		if(obj != null)
	//*  54   86:aload_3         
	//*  55   87:ifnull          99
			zzya1.zzi(4, ((Long) (obj)).longValue());
	//   56   90:aload_1         
	//   57   91:iconst_4        
	//   58   92:aload_3         
	//   59   93:invokevirtual   #157 <Method long Long.longValue()>
	//   60   96:invokevirtual   #161 <Method void zzya.zzi(int, long)>
		obj = ((Object) (count));
	//   61   99:aload_0         
	//   62  100:getfield        #36  <Field Integer count>
	//   63  103:astore_3        
		if(obj != null)
	//*  64  104:aload_3         
	//*  65  105:ifnull          117
			zzya1.zzd(5, ((Integer) (obj)).intValue());
	//   66  108:aload_1         
	//   67  109:iconst_5        
	//   68  110:aload_3         
	//   69  111:invokevirtual   #164 <Method int Integer.intValue()>
	//   70  114:invokevirtual   #168 <Method void zzya.zzd(int, int)>
		super.zza(zzya1);
	//   71  117:aload_0         
	//   72  118:aload_1         
	//   73  119:invokespecial   #170 <Method void zzyc.zza(zzya)>
	//   74  122:return          
	}

	protected final int zzf()
	{
		int i = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method int zzyc.zzf()>
	//    2    4:istore_1        
		zzfu azzfu[] = zzaxa;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field zzfu[] zzaxa>
	//    5    9:astore          4
		int j = i;
	//    6   11:iload_1         
	//    7   12:istore_2        
		if(azzfu != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          74
		{
			j = i;
	//   10   18:iload_1         
	//   11   19:istore_2        
			if(azzfu.length > 0)
	//*  12   20:aload           4
	//*  13   22:arraylength     
	//*  14   23:ifle            74
			{
				int k = 0;
	//   15   26:iconst_0        
	//   16   27:istore_3        
				do
				{
					zzfu azzfu1[] = zzaxa;
	//   17   28:aload_0         
	//   18   29:getfield        #28  <Field zzfu[] zzaxa>
	//   19   32:astore          4
					j = i;
	//   20   34:iload_1         
	//   21   35:istore_2        
					if(k >= azzfu1.length)
						break;
	//   22   36:iload_3         
	//   23   37:aload           4
	//   24   39:arraylength     
	//   25   40:icmpge          74
					zzfu zzfu1 = azzfu1[k];
	//   26   43:aload           4
	//   27   45:iload_3         
	//   28   46:aaload          
	//   29   47:astore          4
					j = i;
	//   30   49:iload_1         
	//   31   50:istore_2        
					if(zzfu1 != null)
	//*  32   51:aload           4
	//*  33   53:ifnull          65
						j = i + zzya.zzb(1, ((zzyi) (zzfu1)));
	//   34   56:iload_1         
	//   35   57:iconst_1        
	//   36   58:aload           4
	//   37   60:invokestatic    #176 <Method int zzya.zzb(int, zzyi)>
	//   38   63:iadd            
	//   39   64:istore_2        
					k++;
	//   40   65:iload_3         
	//   41   66:iconst_1        
	//   42   67:iadd            
	//   43   68:istore_3        
					i = j;
	//   44   69:iload_2         
	//   45   70:istore_1        
				} while(true);
	//   46   71:goto            28
			}
		}
		Object obj = ((Object) (name));
	//   47   74:aload_0         
	//   48   75:getfield        #30  <Field String name>
	//   49   78:astore          4
		i = j;
	//   50   80:iload_2         
	//   51   81:istore_1        
		if(obj != null)
	//*  52   82:aload           4
	//*  53   84:ifnull          96
			i = j + zzya.zzc(2, ((String) (obj)));
	//   54   87:iload_2         
	//   55   88:iconst_2        
	//   56   89:aload           4
	//   57   91:invokestatic    #180 <Method int zzya.zzc(int, String)>
	//   58   94:iadd            
	//   59   95:istore_1        
		obj = ((Object) (zzaxb));
	//   60   96:aload_0         
	//   61   97:getfield        #32  <Field Long zzaxb>
	//   62  100:astore          4
		j = i;
	//   63  102:iload_1         
	//   64  103:istore_2        
		if(obj != null)
	//*  65  104:aload           4
	//*  66  106:ifnull          121
			j = i + zzya.zzd(3, ((Long) (obj)).longValue());
	//   67  109:iload_1         
	//   68  110:iconst_3        
	//   69  111:aload           4
	//   70  113:invokevirtual   #157 <Method long Long.longValue()>
	//   71  116:invokestatic    #183 <Method int zzya.zzd(int, long)>
	//   72  119:iadd            
	//   73  120:istore_2        
		obj = ((Object) (zzaxc));
	//   74  121:aload_0         
	//   75  122:getfield        #34  <Field Long zzaxc>
	//   76  125:astore          4
		i = j;
	//   77  127:iload_2         
	//   78  128:istore_1        
		if(obj != null)
	//*  79  129:aload           4
	//*  80  131:ifnull          146
			i = j + zzya.zzd(4, ((Long) (obj)).longValue());
	//   81  134:iload_2         
	//   82  135:iconst_4        
	//   83  136:aload           4
	//   84  138:invokevirtual   #157 <Method long Long.longValue()>
	//   85  141:invokestatic    #183 <Method int zzya.zzd(int, long)>
	//   86  144:iadd            
	//   87  145:istore_1        
		obj = ((Object) (count));
	//   88  146:aload_0         
	//   89  147:getfield        #36  <Field Integer count>
	//   90  150:astore          4
		j = i;
	//   91  152:iload_1         
	//   92  153:istore_2        
		if(obj != null)
	//*  93  154:aload           4
	//*  94  156:ifnull          171
			j = i + zzya.zzh(5, ((Integer) (obj)).intValue());
	//   95  159:iload_1         
	//   96  160:iconst_5        
	//   97  161:aload           4
	//   98  163:invokevirtual   #164 <Method int Integer.intValue()>
	//   99  166:invokestatic    #187 <Method int zzya.zzh(int, int)>
	//  100  169:iadd            
	//  101  170:istore_2        
		return j;
	//  102  171:iload_2         
	//  103  172:ireturn         
	}

	private static volatile zzft zzawz[];
	public Integer count;
	public String name;
	public zzfu zzaxa[];
	public Long zzaxb;
	public Long zzaxc;
}
