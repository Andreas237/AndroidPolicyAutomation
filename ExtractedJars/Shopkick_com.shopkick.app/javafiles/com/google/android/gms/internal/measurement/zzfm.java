// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzfk, zzye, 
//			zzxz, zzya, zzyi

public final class zzfm extends zzyc
{

	public zzfm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzyc()>
		zzavk = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field Integer zzavk>
		zzawa = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field String zzawa>
		zzawb = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field zzfk zzawb>
		zzavh = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #28  <Field Boolean zzavh>
		zzavi = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #30  <Field Boolean zzavi>
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

	public static zzfm[] zzmu()
	{
		if(zzavz == null)
	//*   0    0:getstatic       #43  <Field zzfm[] zzavz>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #49  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzavz == null)
	//*   6   12:getstatic       #43  <Field zzfm[] zzavz>
	//*   7   15:ifnonnull       25
					zzavz = new zzfm[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfm[]
	//   10   22:putstatic       #43  <Field zzfm[] zzavz>
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
		return zzavz;
	//   19   35:getstatic       #43  <Field zzfm[] zzavz>
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
		if(!(obj instanceof zzfm))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfm>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfm)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfm>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzavk));
	//   13   21:aload_0         
	//   14   22:getfield        #22  <Field Integer zzavk>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfm) (obj)).zzavk != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #22  <Field Integer zzavk>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfm) (obj)).zzavk))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #22  <Field Integer zzavk>
	//*  26   44:invokevirtual   #55  <Method boolean Integer.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzawa));
	//   30   52:aload_0         
	//   31   53:getfield        #24  <Field String zzawa>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfm) (obj)).zzawa != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #24  <Field String zzawa>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfm) (obj)).zzawa))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #24  <Field String zzawa>
	//*  43   75:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (zzawb));
	//   47   83:aload_0         
	//   48   84:getfield        #26  <Field zzfk zzawb>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((zzfm) (obj)).zzawb != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #26  <Field zzfk zzawb>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((zzfk) (obj1)).equals(((Object) (((zzfm) (obj)).zzawb))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #26  <Field zzfk zzawb>
	//*  60  106:invokevirtual   #61  <Method boolean zzfk.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		obj1 = ((Object) (zzavh));
	//   64  114:aload_0         
	//   65  115:getfield        #28  <Field Boolean zzavh>
	//   66  118:astore_2        
		if(obj1 == null)
	//*  67  119:aload_2         
	//*  68  120:ifnonnull       132
		{
			if(((zzfm) (obj)).zzavh != null)
	//*  69  123:aload_1         
	//*  70  124:getfield        #28  <Field Boolean zzavh>
	//*  71  127:ifnull          145
				return false;
	//   72  130:iconst_0        
	//   73  131:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfm) (obj)).zzavh))))
	//*  74  132:aload_2         
	//*  75  133:aload_1         
	//*  76  134:getfield        #28  <Field Boolean zzavh>
	//*  77  137:invokevirtual   #64  <Method boolean Boolean.equals(Object)>
	//*  78  140:ifne            145
			return false;
	//   79  143:iconst_0        
	//   80  144:ireturn         
		obj1 = ((Object) (zzavi));
	//   81  145:aload_0         
	//   82  146:getfield        #30  <Field Boolean zzavi>
	//   83  149:astore_2        
		if(obj1 == null)
	//*  84  150:aload_2         
	//*  85  151:ifnonnull       163
		{
			if(((zzfm) (obj)).zzavi != null)
	//*  86  154:aload_1         
	//*  87  155:getfield        #30  <Field Boolean zzavi>
	//*  88  158:ifnull          176
				return false;
	//   89  161:iconst_0        
	//   90  162:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfm) (obj)).zzavi))))
	//*  91  163:aload_2         
	//*  92  164:aload_1         
	//*  93  165:getfield        #30  <Field Boolean zzavi>
	//*  94  168:invokevirtual   #64  <Method boolean Boolean.equals(Object)>
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
			return zzcet.equals(((Object) (((zzfm) (obj)).zzcet)));
	//  106  196:aload_0         
	//  107  197:getfield        #34  <Field zzye zzcet>
	//  108  200:aload_1         
	//  109  201:getfield        #34  <Field zzye zzcet>
	//  110  204:invokevirtual   #71  <Method boolean zzye.equals(Object)>
	//  111  207:ireturn         
		if(((zzfm) (obj)).zzcet != null)
	//* 112  208:aload_1         
	//* 113  209:getfield        #34  <Field zzye zzcet>
	//* 114  212:ifnull          229
			return ((zzfm) (obj)).zzcet.isEmpty();
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
		Object obj = ((Object) (zzavk));
	//    5   12:aload_0         
	//    6   13:getfield        #22  <Field Integer zzavk>
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
			i = ((Integer) (obj)).hashCode();
	//   15   31:aload           9
	//   16   33:invokevirtual   #88  <Method int Integer.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzawa));
	//   18   37:aload_0         
	//   19   38:getfield        #24  <Field String zzawa>
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
		obj = ((Object) (zzawb));
	//   29   59:aload_0         
	//   30   60:getfield        #26  <Field zzfk zzawb>
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
			k = ((zzfk) (obj)).hashCode();
	//   37   75:aload           9
	//   38   77:invokevirtual   #89  <Method int zzfk.hashCode()>
	//   39   80:istore_3        
		obj = ((Object) (zzavh));
	//   40   81:aload_0         
	//   41   82:getfield        #28  <Field Boolean zzavh>
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
			l = ((Boolean) (obj)).hashCode();
	//   48   98:aload           9
	//   49  100:invokevirtual   #90  <Method int Boolean.hashCode()>
	//   50  103:istore          4
		obj = ((Object) (zzavi));
	//   51  105:aload_0         
	//   52  106:getfield        #30  <Field Boolean zzavi>
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
			i1 = ((Boolean) (obj)).hashCode();
	//   59  122:aload           9
	//   60  124:invokevirtual   #90  <Method int Boolean.hashCode()>
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
	//    4    6:ifeq            132
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          118
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          107
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
	//*  23   42:invokespecial   #103 <Method boolean zzyc.zza(zzxz, int)>
	//*  24   45:ifne            0
									return ((zzyi) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								zzavi = Boolean.valueOf(zzxz1.zzup());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #106 <Method boolean zzxz.zzup()>
	//   30   55:invokestatic    #110 <Method Boolean Boolean.valueOf(boolean)>
	//   31   58:putfield        #30  <Field Boolean zzavi>
							}
						} else
	//*  32   61:goto            0
						{
							zzavh = Boolean.valueOf(zzxz1.zzup());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #106 <Method boolean zzxz.zzup()>
	//   36   69:invokestatic    #110 <Method Boolean Boolean.valueOf(boolean)>
	//   37   72:putfield        #28  <Field Boolean zzavh>
						}
					} else
	//*  38   75:goto            0
					{
						if(zzawb == null)
	//*  39   78:aload_0         
	//*  40   79:getfield        #26  <Field zzfk zzawb>
	//*  41   82:ifnonnull       96
							zzawb = new zzfk();
	//   42   85:aload_0         
	//   43   86:new             #60  <Class zzfk>
	//   44   89:dup             
	//   45   90:invokespecial   #111 <Method void zzfk()>
	//   46   93:putfield        #26  <Field zzfk zzawb>
						zzxz1.zza(((zzyi) (zzawb)));
	//   47   96:aload_1         
	//   48   97:aload_0         
	//   49   98:getfield        #26  <Field zzfk zzawb>
	//   50  101:invokevirtual   #114 <Method void zzxz.zza(zzyi)>
					}
				} else
	//*  51  104:goto            0
				{
					zzawa = zzxz1.readString();
	//   52  107:aload_0         
	//   53  108:aload_1         
	//   54  109:invokevirtual   #117 <Method String zzxz.readString()>
	//   55  112:putfield        #24  <Field String zzawa>
				}
			} else
	//*  56  115:goto            0
			{
				zzavk = Integer.valueOf(zzxz1.zzvb());
	//   57  118:aload_0         
	//   58  119:aload_1         
	//   59  120:invokevirtual   #120 <Method int zzxz.zzvb()>
	//   60  123:invokestatic    #123 <Method Integer Integer.valueOf(int)>
	//   61  126:putfield        #22  <Field Integer zzavk>
			}
		} while(true);
	//   62  129:goto            0
		return ((zzyi) (this));
	//   63  132:aload_0         
	//   64  133:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzavk));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Integer zzavk>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			zzya1.zzd(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #128 <Method int Integer.intValue()>
	//    9   15:invokevirtual   #134 <Method void zzya.zzd(int, int)>
		obj = ((Object) (zzawa));
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field String zzawa>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			zzya1.zzb(2, ((String) (obj)));
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #138 <Method void zzya.zzb(int, String)>
		obj = ((Object) (zzawb));
	//   19   33:aload_0         
	//   20   34:getfield        #26  <Field zzfk zzawb>
	//   21   37:astore_2        
		if(obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          48
			zzya1.zza(3, ((zzyi) (obj)));
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #141 <Method void zzya.zza(int, zzyi)>
		obj = ((Object) (zzavh));
	//   28   48:aload_0         
	//   29   49:getfield        #28  <Field Boolean zzavh>
	//   30   52:astore_2        
		if(obj != null)
	//*  31   53:aload_2         
	//*  32   54:ifnull          66
			zzya1.zzb(4, ((Boolean) (obj)).booleanValue());
	//   33   57:aload_1         
	//   34   58:iconst_4        
	//   35   59:aload_2         
	//   36   60:invokevirtual   #144 <Method boolean Boolean.booleanValue()>
	//   37   63:invokevirtual   #147 <Method void zzya.zzb(int, boolean)>
		obj = ((Object) (zzavi));
	//   38   66:aload_0         
	//   39   67:getfield        #30  <Field Boolean zzavi>
	//   40   70:astore_2        
		if(obj != null)
	//*  41   71:aload_2         
	//*  42   72:ifnull          84
			zzya1.zzb(5, ((Boolean) (obj)).booleanValue());
	//   43   75:aload_1         
	//   44   76:iconst_5        
	//   45   77:aload_2         
	//   46   78:invokevirtual   #144 <Method boolean Boolean.booleanValue()>
	//   47   81:invokevirtual   #147 <Method void zzya.zzb(int, boolean)>
		super.zza(zzya1);
	//   48   84:aload_0         
	//   49   85:aload_1         
	//   50   86:invokespecial   #149 <Method void zzyc.zza(zzya)>
	//   51   89:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #152 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzavk));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field Integer zzavk>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + zzya.zzh(1, ((Integer) (obj)).intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #128 <Method int Integer.intValue()>
	//   14   22:invokestatic    #156 <Method int zzya.zzh(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (zzawa));
	//   17   27:aload_0         
	//   18   28:getfield        #24  <Field String zzawa>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          46
			j = i + zzya.zzc(2, ((String) (obj)));
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokestatic    #160 <Method int zzya.zzc(int, String)>
	//   28   44:iadd            
	//   29   45:istore_2        
		obj = ((Object) (zzawb));
	//   30   46:aload_0         
	//   31   47:getfield        #26  <Field zzfk zzawb>
	//   32   50:astore_3        
		i = j;
	//   33   51:iload_2         
	//   34   52:istore_1        
		if(obj != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          65
			i = j + zzya.zzb(3, ((zzyi) (obj)));
	//   37   57:iload_2         
	//   38   58:iconst_3        
	//   39   59:aload_3         
	//   40   60:invokestatic    #163 <Method int zzya.zzb(int, zzyi)>
	//   41   63:iadd            
	//   42   64:istore_1        
		obj = ((Object) (zzavh));
	//   43   65:aload_0         
	//   44   66:getfield        #28  <Field Boolean zzavh>
	//   45   69:astore_3        
		j = i;
	//   46   70:iload_1         
	//   47   71:istore_2        
		if(obj != null)
	//*  48   72:aload_3         
	//*  49   73:ifnull          90
		{
			((Boolean) (obj)).booleanValue();
	//   50   76:aload_3         
	//   51   77:invokevirtual   #144 <Method boolean Boolean.booleanValue()>
	//   52   80:pop             
			j = i + (zzya.zzbd(4) + 1);
	//   53   81:iload_1         
	//   54   82:iconst_4        
	//   55   83:invokestatic    #167 <Method int zzya.zzbd(int)>
	//   56   86:iconst_1        
	//   57   87:iadd            
	//   58   88:iadd            
	//   59   89:istore_2        
		}
		obj = ((Object) (zzavi));
	//   60   90:aload_0         
	//   61   91:getfield        #30  <Field Boolean zzavi>
	//   62   94:astore_3        
		i = j;
	//   63   95:iload_2         
	//   64   96:istore_1        
		if(obj != null)
	//*  65   97:aload_3         
	//*  66   98:ifnull          115
		{
			((Boolean) (obj)).booleanValue();
	//   67  101:aload_3         
	//   68  102:invokevirtual   #144 <Method boolean Boolean.booleanValue()>
	//   69  105:pop             
			i = j + (zzya.zzbd(5) + 1);
	//   70  106:iload_2         
	//   71  107:iconst_5        
	//   72  108:invokestatic    #167 <Method int zzya.zzbd(int)>
	//   73  111:iconst_1        
	//   74  112:iadd            
	//   75  113:iadd            
	//   76  114:istore_1        
		}
		return i;
	//   77  115:iload_1         
	//   78  116:ireturn         
	}

	private static volatile zzfm zzavz[];
	public Boolean zzavh;
	public Boolean zzavi;
	public Integer zzavk;
	public String zzawa;
	public zzfk zzawb;
}
