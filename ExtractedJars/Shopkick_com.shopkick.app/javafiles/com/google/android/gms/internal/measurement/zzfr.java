// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzfx, zzye, 
//			zzxz, zzya, zzyi

public final class zzfr extends zzyc
{

	public zzfr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzyc()>
		zzave = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Integer zzave>
		zzawt = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field zzfx zzawt>
		zzawu = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field zzfx zzawu>
		zzawv = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #26  <Field Boolean zzawv>
		zzcet = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #30  <Field zzye zzcet>
		zzcfd = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #34  <Field int zzcfd>
	//   20   34:return          
	}

	public static zzfr[] zzmx()
	{
		if(zzaws == null)
	//*   0    0:getstatic       #39  <Field zzfr[] zzaws>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #45  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzaws == null)
	//*   6   12:getstatic       #39  <Field zzfr[] zzaws>
	//*   7   15:ifnonnull       25
					zzaws = new zzfr[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfr[]
	//   10   22:putstatic       #39  <Field zzfr[] zzaws>
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
		return zzaws;
	//   19   35:getstatic       #39  <Field zzfr[] zzaws>
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
		if(!(obj instanceof zzfr))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfr>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfr)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfr>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzave));
	//   13   21:aload_0         
	//   14   22:getfield        #20  <Field Integer zzave>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfr) (obj)).zzave != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #20  <Field Integer zzave>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfr) (obj)).zzave))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #20  <Field Integer zzave>
	//*  26   44:invokevirtual   #51  <Method boolean Integer.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzawt));
	//   30   52:aload_0         
	//   31   53:getfield        #22  <Field zzfx zzawt>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfr) (obj)).zzawt != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #22  <Field zzfx zzawt>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((zzfx) (obj1)).equals(((Object) (((zzfr) (obj)).zzawt))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #22  <Field zzfx zzawt>
	//*  43   75:invokevirtual   #54  <Method boolean zzfx.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (zzawu));
	//   47   83:aload_0         
	//   48   84:getfield        #24  <Field zzfx zzawu>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((zzfr) (obj)).zzawu != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #24  <Field zzfx zzawu>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((zzfx) (obj1)).equals(((Object) (((zzfr) (obj)).zzawu))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #24  <Field zzfx zzawu>
	//*  60  106:invokevirtual   #54  <Method boolean zzfx.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		obj1 = ((Object) (zzawv));
	//   64  114:aload_0         
	//   65  115:getfield        #26  <Field Boolean zzawv>
	//   66  118:astore_2        
		if(obj1 == null)
	//*  67  119:aload_2         
	//*  68  120:ifnonnull       132
		{
			if(((zzfr) (obj)).zzawv != null)
	//*  69  123:aload_1         
	//*  70  124:getfield        #26  <Field Boolean zzawv>
	//*  71  127:ifnull          145
				return false;
	//   72  130:iconst_0        
	//   73  131:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfr) (obj)).zzawv))))
	//*  74  132:aload_2         
	//*  75  133:aload_1         
	//*  76  134:getfield        #26  <Field Boolean zzawv>
	//*  77  137:invokevirtual   #57  <Method boolean Boolean.equals(Object)>
	//*  78  140:ifne            145
			return false;
	//   79  143:iconst_0        
	//   80  144:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  81  145:aload_0         
	//*  82  146:getfield        #30  <Field zzye zzcet>
	//*  83  149:ifnull          177
	//*  84  152:aload_0         
	//*  85  153:getfield        #30  <Field zzye zzcet>
	//*  86  156:invokevirtual   #63  <Method boolean zzye.isEmpty()>
	//*  87  159:ifeq            165
	//*  88  162:goto            177
			return zzcet.equals(((Object) (((zzfr) (obj)).zzcet)));
	//   89  165:aload_0         
	//   90  166:getfield        #30  <Field zzye zzcet>
	//   91  169:aload_1         
	//   92  170:getfield        #30  <Field zzye zzcet>
	//   93  173:invokevirtual   #64  <Method boolean zzye.equals(Object)>
	//   94  176:ireturn         
		if(((zzfr) (obj)).zzcet != null)
	//*  95  177:aload_1         
	//*  96  178:getfield        #30  <Field zzye zzcet>
	//*  97  181:ifnull          198
			return ((zzfr) (obj)).zzcet.isEmpty();
	//   98  184:aload_1         
	//   99  185:getfield        #30  <Field zzye zzcet>
	//  100  188:invokevirtual   #63  <Method boolean zzye.isEmpty()>
	//  101  191:ifeq            196
	//  102  194:iconst_1        
	//  103  195:ireturn         
	//  104  196:iconst_0        
	//  105  197:ireturn         
		else
			return true;
	//  106  198:iconst_1        
	//  107  199:ireturn         
	}

	public final int hashCode()
	{
		int j1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #78  <Method String Class.getName()>
	//    3    7:invokevirtual   #82  <Method int String.hashCode()>
	//    4   10:istore          7
		Object obj = ((Object) (zzave));
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field Integer zzave>
	//    7   16:astore          8
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          6
		int i;
		if(obj == null)
	//*  10   21:aload           8
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((Integer) (obj)).hashCode();
	//   15   31:aload           8
	//   16   33:invokevirtual   #83  <Method int Integer.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzawt));
	//   18   37:aload_0         
	//   19   38:getfield        #22  <Field zzfx zzawt>
	//   20   41:astore          8
		int j;
		if(obj == null)
	//*  21   43:aload           8
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = ((zzfx) (obj)).hashCode();
	//   26   53:aload           8
	//   27   55:invokevirtual   #84  <Method int zzfx.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (zzawu));
	//   29   59:aload_0         
	//   30   60:getfield        #24  <Field zzfx zzawu>
	//   31   63:astore          8
		int k;
		if(obj == null)
	//*  32   65:aload           8
	//*  33   67:ifnonnull       75
			k = 0;
	//   34   70:iconst_0        
	//   35   71:istore_3        
		else
	//*  36   72:goto            81
			k = ((zzfx) (obj)).hashCode();
	//   37   75:aload           8
	//   38   77:invokevirtual   #84  <Method int zzfx.hashCode()>
	//   39   80:istore_3        
		obj = ((Object) (zzawv));
	//   40   81:aload_0         
	//   41   82:getfield        #26  <Field Boolean zzawv>
	//   42   85:astore          8
		int l;
		if(obj == null)
	//*  43   87:aload           8
	//*  44   89:ifnonnull       98
			l = 0;
	//   45   92:iconst_0        
	//   46   93:istore          4
		else
	//*  47   95:goto            105
			l = ((Boolean) (obj)).hashCode();
	//   48   98:aload           8
	//   49  100:invokevirtual   #85  <Method int Boolean.hashCode()>
	//   50  103:istore          4
		int i1 = ((int) (flag));
	//   51  105:iload           6
	//   52  107:istore          5
		if(zzcet != null)
	//*  53  109:aload_0         
	//*  54  110:getfield        #30  <Field zzye zzcet>
	//*  55  113:ifnull          142
			if(zzcet.isEmpty())
	//*  56  116:aload_0         
	//*  57  117:getfield        #30  <Field zzye zzcet>
	//*  58  120:invokevirtual   #63  <Method boolean zzye.isEmpty()>
	//*  59  123:ifeq            133
				i1 = ((int) (flag));
	//   60  126:iload           6
	//   61  128:istore          5
			else
	//*  62  130:goto            142
				i1 = zzcet.hashCode();
	//   63  133:aload_0         
	//   64  134:getfield        #30  <Field zzye zzcet>
	//   65  137:invokevirtual   #86  <Method int zzye.hashCode()>
	//   66  140:istore          5
		return (((((j1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
	//   67  142:iload           7
	//   68  144:sipush          527
	//   69  147:iadd            
	//   70  148:bipush          31
	//   71  150:imul            
	//   72  151:iload_1         
	//   73  152:iadd            
	//   74  153:bipush          31
	//   75  155:imul            
	//   76  156:iload_2         
	//   77  157:iadd            
	//   78  158:bipush          31
	//   79  160:imul            
	//   80  161:iload_3         
	//   81  162:iadd            
	//   82  163:bipush          31
	//   83  165:imul            
	//   84  166:iload           4
	//   85  168:iadd            
	//   86  169:bipush          31
	//   87  171:imul            
	//   88  172:iload           5
	//   89  174:iadd            
	//   90  175:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #95  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            130
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          116
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          87
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          58
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          44
						{
							if(!super.zza(zzxz1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #98  <Method boolean zzyc.zza(zzxz, int)>
	//*  21   39:ifne            0
								return ((zzyi) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
						} else
						{
							zzawv = Boolean.valueOf(zzxz1.zzup());
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #101 <Method boolean zzxz.zzup()>
	//   27   49:invokestatic    #105 <Method Boolean Boolean.valueOf(boolean)>
	//   28   52:putfield        #26  <Field Boolean zzawv>
						}
					} else
	//*  29   55:goto            0
					{
						if(zzawu == null)
	//*  30   58:aload_0         
	//*  31   59:getfield        #24  <Field zzfx zzawu>
	//*  32   62:ifnonnull       76
							zzawu = new zzfx();
	//   33   65:aload_0         
	//   34   66:new             #53  <Class zzfx>
	//   35   69:dup             
	//   36   70:invokespecial   #106 <Method void zzfx()>
	//   37   73:putfield        #24  <Field zzfx zzawu>
						zzxz1.zza(((zzyi) (zzawu)));
	//   38   76:aload_1         
	//   39   77:aload_0         
	//   40   78:getfield        #24  <Field zzfx zzawu>
	//   41   81:invokevirtual   #109 <Method void zzxz.zza(zzyi)>
					}
				} else
	//*  42   84:goto            0
				{
					if(zzawt == null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #22  <Field zzfx zzawt>
	//*  45   91:ifnonnull       105
						zzawt = new zzfx();
	//   46   94:aload_0         
	//   47   95:new             #53  <Class zzfx>
	//   48   98:dup             
	//   49   99:invokespecial   #106 <Method void zzfx()>
	//   50  102:putfield        #22  <Field zzfx zzawt>
					zzxz1.zza(((zzyi) (zzawt)));
	//   51  105:aload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #22  <Field zzfx zzawt>
	//   54  110:invokevirtual   #109 <Method void zzxz.zza(zzyi)>
				}
			} else
	//*  55  113:goto            0
			{
				zzave = Integer.valueOf(zzxz1.zzvb());
	//   56  116:aload_0         
	//   57  117:aload_1         
	//   58  118:invokevirtual   #112 <Method int zzxz.zzvb()>
	//   59  121:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   60  124:putfield        #20  <Field Integer zzave>
			}
		} while(true);
	//   61  127:goto            0
		return ((zzyi) (this));
	//   62  130:aload_0         
	//   63  131:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzave));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Integer zzave>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			zzya1.zzd(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #120 <Method int Integer.intValue()>
	//    9   15:invokevirtual   #126 <Method void zzya.zzd(int, int)>
		obj = ((Object) (zzawt));
	//   10   18:aload_0         
	//   11   19:getfield        #22  <Field zzfx zzawt>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			zzya1.zza(2, ((zzyi) (obj)));
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #129 <Method void zzya.zza(int, zzyi)>
		obj = ((Object) (zzawu));
	//   19   33:aload_0         
	//   20   34:getfield        #24  <Field zzfx zzawu>
	//   21   37:astore_2        
		if(obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          48
			zzya1.zza(3, ((zzyi) (obj)));
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #129 <Method void zzya.zza(int, zzyi)>
		obj = ((Object) (zzawv));
	//   28   48:aload_0         
	//   29   49:getfield        #26  <Field Boolean zzawv>
	//   30   52:astore_2        
		if(obj != null)
	//*  31   53:aload_2         
	//*  32   54:ifnull          66
			zzya1.zzb(4, ((Boolean) (obj)).booleanValue());
	//   33   57:aload_1         
	//   34   58:iconst_4        
	//   35   59:aload_2         
	//   36   60:invokevirtual   #132 <Method boolean Boolean.booleanValue()>
	//   37   63:invokevirtual   #136 <Method void zzya.zzb(int, boolean)>
		super.zza(zzya1);
	//   38   66:aload_0         
	//   39   67:aload_1         
	//   40   68:invokespecial   #138 <Method void zzyc.zza(zzya)>
	//   41   71:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzave));
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field Integer zzave>
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
	//   13   19:invokevirtual   #120 <Method int Integer.intValue()>
	//   14   22:invokestatic    #145 <Method int zzya.zzh(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (zzawt));
	//   17   27:aload_0         
	//   18   28:getfield        #22  <Field zzfx zzawt>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          46
			j = i + zzya.zzb(2, ((zzyi) (obj)));
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokestatic    #148 <Method int zzya.zzb(int, zzyi)>
	//   28   44:iadd            
	//   29   45:istore_2        
		obj = ((Object) (zzawu));
	//   30   46:aload_0         
	//   31   47:getfield        #24  <Field zzfx zzawu>
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
	//   40   60:invokestatic    #148 <Method int zzya.zzb(int, zzyi)>
	//   41   63:iadd            
	//   42   64:istore_1        
		obj = ((Object) (zzawv));
	//   43   65:aload_0         
	//   44   66:getfield        #26  <Field Boolean zzawv>
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
	//   51   77:invokevirtual   #132 <Method boolean Boolean.booleanValue()>
	//   52   80:pop             
			j = i + (zzya.zzbd(4) + 1);
	//   53   81:iload_1         
	//   54   82:iconst_4        
	//   55   83:invokestatic    #152 <Method int zzya.zzbd(int)>
	//   56   86:iconst_1        
	//   57   87:iadd            
	//   58   88:iadd            
	//   59   89:istore_2        
		}
		return j;
	//   60   90:iload_2         
	//   61   91:ireturn         
	}

	private static volatile zzfr zzaws[];
	public Integer zzave;
	public zzfx zzawt;
	public zzfx zzawu;
	public Boolean zzawv;
}
