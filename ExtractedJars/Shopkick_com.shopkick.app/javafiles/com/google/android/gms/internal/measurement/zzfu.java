// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzye, zzxz, 
//			zzya, zzyi

public final class zzfu extends zzyc
{

	public zzfu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzyc()>
		name = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field String name>
		zzaml = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field String zzaml>
		zzaxe = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field Long zzaxe>
		zzaum = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #28  <Field Float zzaum>
		zzaun = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #30  <Field Double zzaun>
		zzcet = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #34  <Field zzye zzcet>
		zzcfd = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #38  <Field int zzcfd>
	//   23   39:return          
	}

	public static zzfu[] zzna()
	{
		if(zzaxd == null)
	//*   0    0:getstatic       #43  <Field zzfu[] zzaxd>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #49  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzaxd == null)
	//*   6   12:getstatic       #43  <Field zzfu[] zzaxd>
	//*   7   15:ifnonnull       25
					zzaxd = new zzfu[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfu[]
	//   10   22:putstatic       #43  <Field zzfu[] zzaxd>
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
		return zzaxd;
	//   19   35:getstatic       #43  <Field zzfu[] zzaxd>
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
		if(!(obj instanceof zzfu))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfu>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfu)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfu>
	//   12   20:astore_1        
		Object obj1 = ((Object) (name));
	//   13   21:aload_0         
	//   14   22:getfield        #22  <Field String name>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfu) (obj)).name != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #22  <Field String name>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfu) (obj)).name))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #22  <Field String name>
	//*  26   44:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzaml));
	//   30   52:aload_0         
	//   31   53:getfield        #24  <Field String zzaml>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfu) (obj)).zzaml != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #24  <Field String zzaml>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfu) (obj)).zzaml))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #24  <Field String zzaml>
	//*  43   75:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (zzaxe));
	//   47   83:aload_0         
	//   48   84:getfield        #26  <Field Long zzaxe>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((zzfu) (obj)).zzaxe != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #26  <Field Long zzaxe>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((Long) (obj1)).equals(((Object) (((zzfu) (obj)).zzaxe))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #26  <Field Long zzaxe>
	//*  60  106:invokevirtual   #58  <Method boolean Long.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		obj1 = ((Object) (zzaum));
	//   64  114:aload_0         
	//   65  115:getfield        #28  <Field Float zzaum>
	//   66  118:astore_2        
		if(obj1 == null)
	//*  67  119:aload_2         
	//*  68  120:ifnonnull       132
		{
			if(((zzfu) (obj)).zzaum != null)
	//*  69  123:aload_1         
	//*  70  124:getfield        #28  <Field Float zzaum>
	//*  71  127:ifnull          145
				return false;
	//   72  130:iconst_0        
	//   73  131:ireturn         
		} else
		if(!((Float) (obj1)).equals(((Object) (((zzfu) (obj)).zzaum))))
	//*  74  132:aload_2         
	//*  75  133:aload_1         
	//*  76  134:getfield        #28  <Field Float zzaum>
	//*  77  137:invokevirtual   #61  <Method boolean Float.equals(Object)>
	//*  78  140:ifne            145
			return false;
	//   79  143:iconst_0        
	//   80  144:ireturn         
		obj1 = ((Object) (zzaun));
	//   81  145:aload_0         
	//   82  146:getfield        #30  <Field Double zzaun>
	//   83  149:astore_2        
		if(obj1 == null)
	//*  84  150:aload_2         
	//*  85  151:ifnonnull       163
		{
			if(((zzfu) (obj)).zzaun != null)
	//*  86  154:aload_1         
	//*  87  155:getfield        #30  <Field Double zzaun>
	//*  88  158:ifnull          176
				return false;
	//   89  161:iconst_0        
	//   90  162:ireturn         
		} else
		if(!((Double) (obj1)).equals(((Object) (((zzfu) (obj)).zzaun))))
	//*  91  163:aload_2         
	//*  92  164:aload_1         
	//*  93  165:getfield        #30  <Field Double zzaun>
	//*  94  168:invokevirtual   #64  <Method boolean Double.equals(Object)>
	//*  95  171:ifne            176
			return false;
	//   96  174:iconst_0        
	//   97  175:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  98  176:aload_0         
	//*  99  177:getfield        #34  <Field zzye zzcet>
	//* 100  180:ifnull          208
	//* 101  183:aload_0         
	//* 102  184:getfield        #34  <Field zzye zzcet>
	//* 103  187:invokevirtual   #70  <Method boolean zzye.isEmpty()>
	//* 104  190:ifeq            196
	//* 105  193:goto            208
			return zzcet.equals(((Object) (((zzfu) (obj)).zzcet)));
	//  106  196:aload_0         
	//  107  197:getfield        #34  <Field zzye zzcet>
	//  108  200:aload_1         
	//  109  201:getfield        #34  <Field zzye zzcet>
	//  110  204:invokevirtual   #71  <Method boolean zzye.equals(Object)>
	//  111  207:ireturn         
		if(((zzfu) (obj)).zzcet != null)
	//* 112  208:aload_1         
	//* 113  209:getfield        #34  <Field zzye zzcet>
	//* 114  212:ifnull          229
			return ((zzfu) (obj)).zzcet.isEmpty();
	//  115  215:aload_1         
	//  116  216:getfield        #34  <Field zzye zzcet>
	//  117  219:invokevirtual   #70  <Method boolean zzye.isEmpty()>
	//  118  222:ifeq            227
	//  119  225:iconst_1        
	//  120  226:ireturn         
	//  121  227:iconst_0        
	//  122  228:ireturn         
		else
			return true;
	//  123  229:iconst_1        
	//  124  230:ireturn         
	}

	public final int hashCode()
	{
		int k1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #85  <Method String Class.getName()>
	//    3    7:invokevirtual   #87  <Method int String.hashCode()>
	//    4   10:istore          8
		Object obj = ((Object) (name));
	//    5   12:aload_0         
	//    6   13:getfield        #22  <Field String name>
	//    7   16:astore          9
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          7
		int i;
		if(obj == null)
	//*  10   21:aload           9
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((String) (obj)).hashCode();
	//   15   31:aload           9
	//   16   33:invokevirtual   #87  <Method int String.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzaml));
	//   18   37:aload_0         
	//   19   38:getfield        #24  <Field String zzaml>
	//   20   41:astore          9
		int j;
		if(obj == null)
	//*  21   43:aload           9
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = ((String) (obj)).hashCode();
	//   26   53:aload           9
	//   27   55:invokevirtual   #87  <Method int String.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (zzaxe));
	//   29   59:aload_0         
	//   30   60:getfield        #26  <Field Long zzaxe>
	//   31   63:astore          9
		int k;
		if(obj == null)
	//*  32   65:aload           9
	//*  33   67:ifnonnull       75
			k = 0;
	//   34   70:iconst_0        
	//   35   71:istore_3        
		else
	//*  36   72:goto            81
			k = ((Long) (obj)).hashCode();
	//   37   75:aload           9
	//   38   77:invokevirtual   #88  <Method int Long.hashCode()>
	//   39   80:istore_3        
		obj = ((Object) (zzaum));
	//   40   81:aload_0         
	//   41   82:getfield        #28  <Field Float zzaum>
	//   42   85:astore          9
		int l;
		if(obj == null)
	//*  43   87:aload           9
	//*  44   89:ifnonnull       98
			l = 0;
	//   45   92:iconst_0        
	//   46   93:istore          4
		else
	//*  47   95:goto            105
			l = ((Float) (obj)).hashCode();
	//   48   98:aload           9
	//   49  100:invokevirtual   #89  <Method int Float.hashCode()>
	//   50  103:istore          4
		obj = ((Object) (zzaun));
	//   51  105:aload_0         
	//   52  106:getfield        #30  <Field Double zzaun>
	//   53  109:astore          9
		int i1;
		if(obj == null)
	//*  54  111:aload           9
	//*  55  113:ifnonnull       122
			i1 = 0;
	//   56  116:iconst_0        
	//   57  117:istore          5
		else
	//*  58  119:goto            129
			i1 = ((Double) (obj)).hashCode();
	//   59  122:aload           9
	//   60  124:invokevirtual   #90  <Method int Double.hashCode()>
	//   61  127:istore          5
		int j1 = ((int) (flag));
	//   62  129:iload           7
	//   63  131:istore          6
		if(zzcet != null)
	//*  64  133:aload_0         
	//*  65  134:getfield        #34  <Field zzye zzcet>
	//*  66  137:ifnull          166
			if(zzcet.isEmpty())
	//*  67  140:aload_0         
	//*  68  141:getfield        #34  <Field zzye zzcet>
	//*  69  144:invokevirtual   #70  <Method boolean zzye.isEmpty()>
	//*  70  147:ifeq            157
				j1 = ((int) (flag));
	//   71  150:iload           7
	//   72  152:istore          6
			else
	//*  73  154:goto            166
				j1 = zzcet.hashCode();
	//   74  157:aload_0         
	//   75  158:getfield        #34  <Field zzye zzcet>
	//   76  161:invokevirtual   #91  <Method int zzye.hashCode()>
	//   77  164:istore          6
		return ((((((k1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1;
	//   78  166:iload           8
	//   79  168:sipush          527
	//   80  171:iadd            
	//   81  172:bipush          31
	//   82  174:imul            
	//   83  175:iload_1         
	//   84  176:iadd            
	//   85  177:bipush          31
	//   86  179:imul            
	//   87  180:iload_2         
	//   88  181:iadd            
	//   89  182:bipush          31
	//   90  184:imul            
	//   91  185:iload_3         
	//   92  186:iadd            
	//   93  187:bipush          31
	//   94  189:imul            
	//   95  190:iload           4
	//   96  192:iadd            
	//   97  193:bipush          31
	//   98  195:imul            
	//   99  196:iload           5
	//  100  198:iadd            
	//  101  199:bipush          31
	//  102  201:imul            
	//  103  202:iload           6
	//  104  204:iadd            
	//  105  205:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #100 <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            120
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          109
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          98
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          84
					{
						if(i != 37)
	//*  14   27:iload_2         
	//*  15   28:bipush          37
	//*  16   30:icmpeq          67
						{
							if(i != 41)
	//*  17   33:iload_2         
	//*  18   34:bipush          41
	//*  19   36:icmpeq          50
							{
								if(!super.zza(zzxz1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #103 <Method boolean zzyc.zza(zzxz, int)>
	//*  24   45:ifne            0
									return ((zzyi) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								zzaun = Double.valueOf(Double.longBitsToDouble(zzxz1.zzve()));
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #107 <Method long zzxz.zzve()>
	//   30   55:invokestatic    #111 <Method double Double.longBitsToDouble(long)>
	//   31   58:invokestatic    #115 <Method Double Double.valueOf(double)>
	//   32   61:putfield        #30  <Field Double zzaun>
							}
						} else
	//*  33   64:goto            0
						{
							zzaum = Float.valueOf(Float.intBitsToFloat(zzxz1.zzvd()));
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:invokevirtual   #118 <Method int zzxz.zzvd()>
	//   37   72:invokestatic    #122 <Method float Float.intBitsToFloat(int)>
	//   38   75:invokestatic    #125 <Method Float Float.valueOf(float)>
	//   39   78:putfield        #28  <Field Float zzaum>
						}
					} else
	//*  40   81:goto            0
					{
						zzaxe = Long.valueOf(zzxz1.zzvc());
	//   41   84:aload_0         
	//   42   85:aload_1         
	//   43   86:invokevirtual   #128 <Method long zzxz.zzvc()>
	//   44   89:invokestatic    #131 <Method Long Long.valueOf(long)>
	//   45   92:putfield        #26  <Field Long zzaxe>
					}
				} else
	//*  46   95:goto            0
				{
					zzaml = zzxz1.readString();
	//   47   98:aload_0         
	//   48   99:aload_1         
	//   49  100:invokevirtual   #134 <Method String zzxz.readString()>
	//   50  103:putfield        #24  <Field String zzaml>
				}
			} else
	//*  51  106:goto            0
			{
				name = zzxz1.readString();
	//   52  109:aload_0         
	//   53  110:aload_1         
	//   54  111:invokevirtual   #134 <Method String zzxz.readString()>
	//   55  114:putfield        #22  <Field String name>
			}
		} while(true);
	//   56  117:goto            0
		return ((zzyi) (this));
	//   57  120:aload_0         
	//   58  121:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (name));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String name>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzya1.zzb(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #142 <Method void zzya.zzb(int, String)>
		obj = ((Object) (zzaml));
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field String zzaml>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			zzya1.zzb(2, ((String) (obj)));
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #142 <Method void zzya.zzb(int, String)>
		obj = ((Object) (zzaxe));
	//   18   30:aload_0         
	//   19   31:getfield        #26  <Field Long zzaxe>
	//   20   34:astore_2        
		if(obj != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          48
			zzya1.zzi(3, ((Long) (obj)).longValue());
	//   23   39:aload_1         
	//   24   40:iconst_3        
	//   25   41:aload_2         
	//   26   42:invokevirtual   #145 <Method long Long.longValue()>
	//   27   45:invokevirtual   #149 <Method void zzya.zzi(int, long)>
		obj = ((Object) (zzaum));
	//   28   48:aload_0         
	//   29   49:getfield        #28  <Field Float zzaum>
	//   30   52:astore_2        
		if(obj != null)
	//*  31   53:aload_2         
	//*  32   54:ifnull          66
			zzya1.zza(4, ((Float) (obj)).floatValue());
	//   33   57:aload_1         
	//   34   58:iconst_4        
	//   35   59:aload_2         
	//   36   60:invokevirtual   #153 <Method float Float.floatValue()>
	//   37   63:invokevirtual   #156 <Method void zzya.zza(int, float)>
		obj = ((Object) (zzaun));
	//   38   66:aload_0         
	//   39   67:getfield        #30  <Field Double zzaun>
	//   40   70:astore_2        
		if(obj != null)
	//*  41   71:aload_2         
	//*  42   72:ifnull          84
			zzya1.zza(5, ((Double) (obj)).doubleValue());
	//   43   75:aload_1         
	//   44   76:iconst_5        
	//   45   77:aload_2         
	//   46   78:invokevirtual   #160 <Method double Double.doubleValue()>
	//   47   81:invokevirtual   #163 <Method void zzya.zza(int, double)>
		super.zza(zzya1);
	//   48   84:aload_0         
	//   49   85:aload_1         
	//   50   86:invokespecial   #165 <Method void zzyc.zza(zzya)>
	//   51   89:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #168 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (name));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field String name>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + zzya.zzc(1, ((String) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #172 <Method int zzya.zzc(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (zzaml));
	//   16   24:aload_0         
	//   17   25:getfield        #24  <Field String zzaml>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + zzya.zzc(2, ((String) (obj)));
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #172 <Method int zzya.zzc(int, String)>
	//   27   41:iadd            
	//   28   42:istore_2        
		obj = ((Object) (zzaxe));
	//   29   43:aload_0         
	//   30   44:getfield        #26  <Field Long zzaxe>
	//   31   47:astore_3        
		i = j;
	//   32   48:iload_2         
	//   33   49:istore_1        
		if(obj != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          65
			i = j + zzya.zzd(3, ((Long) (obj)).longValue());
	//   36   54:iload_2         
	//   37   55:iconst_3        
	//   38   56:aload_3         
	//   39   57:invokevirtual   #145 <Method long Long.longValue()>
	//   40   60:invokestatic    #176 <Method int zzya.zzd(int, long)>
	//   41   63:iadd            
	//   42   64:istore_1        
		obj = ((Object) (zzaum));
	//   43   65:aload_0         
	//   44   66:getfield        #28  <Field Float zzaum>
	//   45   69:astore_3        
		j = i;
	//   46   70:iload_1         
	//   47   71:istore_2        
		if(obj != null)
	//*  48   72:aload_3         
	//*  49   73:ifnull          90
		{
			((Float) (obj)).floatValue();
	//   50   76:aload_3         
	//   51   77:invokevirtual   #153 <Method float Float.floatValue()>
	//   52   80:pop             
			j = i + (zzya.zzbd(4) + 4);
	//   53   81:iload_1         
	//   54   82:iconst_4        
	//   55   83:invokestatic    #180 <Method int zzya.zzbd(int)>
	//   56   86:iconst_4        
	//   57   87:iadd            
	//   58   88:iadd            
	//   59   89:istore_2        
		}
		obj = ((Object) (zzaun));
	//   60   90:aload_0         
	//   61   91:getfield        #30  <Field Double zzaun>
	//   62   94:astore_3        
		i = j;
	//   63   95:iload_2         
	//   64   96:istore_1        
		if(obj != null)
	//*  65   97:aload_3         
	//*  66   98:ifnull          116
		{
			((Double) (obj)).doubleValue();
	//   67  101:aload_3         
	//   68  102:invokevirtual   #160 <Method double Double.doubleValue()>
	//   69  105:pop2            
			i = j + (zzya.zzbd(5) + 8);
	//   70  106:iload_2         
	//   71  107:iconst_5        
	//   72  108:invokestatic    #180 <Method int zzya.zzbd(int)>
	//   73  111:bipush          8
	//   74  113:iadd            
	//   75  114:iadd            
	//   76  115:istore_1        
		}
		return i;
	//   77  116:iload_1         
	//   78  117:ireturn         
	}

	private static volatile zzfu zzaxd[];
	public String name;
	public String zzaml;
	private Float zzaum;
	public Double zzaun;
	public Long zzaxe;
}
