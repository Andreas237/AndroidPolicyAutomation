// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzfn, zzfl, 
//			zzye, zzxz, zzya, zzyi

public final class zzfk extends zzyc
{

	public zzfk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzyc()>
		zzavq = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field zzfn zzavq>
		zzavr = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field zzfl zzavr>
		zzavs = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #25  <Field Boolean zzavs>
		zzavt = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #27  <Field String zzavt>
		zzcet = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #31  <Field zzye zzcet>
		zzcfd = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #35  <Field int zzcfd>
	//   20   34:return          
	}

	public static zzfk[] zzmt()
	{
		if(zzavp == null)
	//*   0    0:getstatic       #40  <Field zzfk[] zzavp>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #46  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzavp == null)
	//*   6   12:getstatic       #40  <Field zzfk[] zzavp>
	//*   7   15:ifnonnull       25
					zzavp = new zzfk[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfk[]
	//   10   22:putstatic       #40  <Field zzfk[] zzavp>
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
		return zzavp;
	//   19   35:getstatic       #40  <Field zzfk[] zzavp>
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
		if(!(obj instanceof zzfk))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfk>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfk)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfk>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzavq));
	//   13   21:aload_0         
	//   14   22:getfield        #21  <Field zzfn zzavq>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfk) (obj)).zzavq != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #21  <Field zzfn zzavq>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((zzfn) (obj1)).equals(((Object) (((zzfk) (obj)).zzavq))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #21  <Field zzfn zzavq>
	//*  26   44:invokevirtual   #52  <Method boolean zzfn.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzavr));
	//   30   52:aload_0         
	//   31   53:getfield        #23  <Field zzfl zzavr>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfk) (obj)).zzavr != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #23  <Field zzfl zzavr>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((zzfl) (obj1)).equals(((Object) (((zzfk) (obj)).zzavr))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #23  <Field zzfl zzavr>
	//*  43   75:invokevirtual   #55  <Method boolean zzfl.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (zzavs));
	//   47   83:aload_0         
	//   48   84:getfield        #25  <Field Boolean zzavs>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((zzfk) (obj)).zzavs != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #25  <Field Boolean zzavs>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfk) (obj)).zzavs))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #25  <Field Boolean zzavs>
	//*  60  106:invokevirtual   #58  <Method boolean Boolean.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		obj1 = ((Object) (zzavt));
	//   64  114:aload_0         
	//   65  115:getfield        #27  <Field String zzavt>
	//   66  118:astore_2        
		if(obj1 == null)
	//*  67  119:aload_2         
	//*  68  120:ifnonnull       132
		{
			if(((zzfk) (obj)).zzavt != null)
	//*  69  123:aload_1         
	//*  70  124:getfield        #27  <Field String zzavt>
	//*  71  127:ifnull          145
				return false;
	//   72  130:iconst_0        
	//   73  131:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfk) (obj)).zzavt))))
	//*  74  132:aload_2         
	//*  75  133:aload_1         
	//*  76  134:getfield        #27  <Field String zzavt>
	//*  77  137:invokevirtual   #61  <Method boolean String.equals(Object)>
	//*  78  140:ifne            145
			return false;
	//   79  143:iconst_0        
	//   80  144:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  81  145:aload_0         
	//*  82  146:getfield        #31  <Field zzye zzcet>
	//*  83  149:ifnull          177
	//*  84  152:aload_0         
	//*  85  153:getfield        #31  <Field zzye zzcet>
	//*  86  156:invokevirtual   #67  <Method boolean zzye.isEmpty()>
	//*  87  159:ifeq            165
	//*  88  162:goto            177
			return zzcet.equals(((Object) (((zzfk) (obj)).zzcet)));
	//   89  165:aload_0         
	//   90  166:getfield        #31  <Field zzye zzcet>
	//   91  169:aload_1         
	//   92  170:getfield        #31  <Field zzye zzcet>
	//   93  173:invokevirtual   #68  <Method boolean zzye.equals(Object)>
	//   94  176:ireturn         
		if(((zzfk) (obj)).zzcet != null)
	//*  95  177:aload_1         
	//*  96  178:getfield        #31  <Field zzye zzcet>
	//*  97  181:ifnull          198
			return ((zzfk) (obj)).zzcet.isEmpty();
	//   98  184:aload_1         
	//   99  185:getfield        #31  <Field zzye zzcet>
	//  100  188:invokevirtual   #67  <Method boolean zzye.isEmpty()>
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
	//    1    1:invokevirtual   #76  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #82  <Method String Class.getName()>
	//    3    7:invokevirtual   #84  <Method int String.hashCode()>
	//    4   10:istore          7
		Object obj = ((Object) (zzavq));
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field zzfn zzavq>
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
			i = ((zzfn) (obj)).hashCode();
	//   15   31:aload           8
	//   16   33:invokevirtual   #85  <Method int zzfn.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzavr));
	//   18   37:aload_0         
	//   19   38:getfield        #23  <Field zzfl zzavr>
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
			j = ((zzfl) (obj)).hashCode();
	//   26   53:aload           8
	//   27   55:invokevirtual   #86  <Method int zzfl.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (zzavs));
	//   29   59:aload_0         
	//   30   60:getfield        #25  <Field Boolean zzavs>
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
			k = ((Boolean) (obj)).hashCode();
	//   37   75:aload           8
	//   38   77:invokevirtual   #87  <Method int Boolean.hashCode()>
	//   39   80:istore_3        
		obj = ((Object) (zzavt));
	//   40   81:aload_0         
	//   41   82:getfield        #27  <Field String zzavt>
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
			l = ((String) (obj)).hashCode();
	//   48   98:aload           8
	//   49  100:invokevirtual   #84  <Method int String.hashCode()>
	//   50  103:istore          4
		int i1 = ((int) (flag));
	//   51  105:iload           6
	//   52  107:istore          5
		if(zzcet != null)
	//*  53  109:aload_0         
	//*  54  110:getfield        #31  <Field zzye zzcet>
	//*  55  113:ifnull          142
			if(zzcet.isEmpty())
	//*  56  116:aload_0         
	//*  57  117:getfield        #31  <Field zzye zzcet>
	//*  58  120:invokevirtual   #67  <Method boolean zzye.isEmpty()>
	//*  59  123:ifeq            133
				i1 = ((int) (flag));
	//   60  126:iload           6
	//   61  128:istore          5
			else
	//*  62  130:goto            142
				i1 = zzcet.hashCode();
	//   63  133:aload_0         
	//   64  134:getfield        #31  <Field zzye zzcet>
	//   65  137:invokevirtual   #88  <Method int zzye.hashCode()>
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
	//    1    1:invokevirtual   #97  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            127
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          98
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          69
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          55
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          44
						{
							if(!super.zza(zzxz1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #100 <Method boolean zzyc.zza(zzxz, int)>
	//*  21   39:ifne            0
								return ((zzyi) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
						} else
						{
							zzavt = zzxz1.readString();
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #103 <Method String zzxz.readString()>
	//   27   49:putfield        #27  <Field String zzavt>
						}
					} else
	//*  28   52:goto            0
					{
						zzavs = Boolean.valueOf(zzxz1.zzup());
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #106 <Method boolean zzxz.zzup()>
	//   32   60:invokestatic    #110 <Method Boolean Boolean.valueOf(boolean)>
	//   33   63:putfield        #25  <Field Boolean zzavs>
					}
				} else
	//*  34   66:goto            0
				{
					if(zzavr == null)
	//*  35   69:aload_0         
	//*  36   70:getfield        #23  <Field zzfl zzavr>
	//*  37   73:ifnonnull       87
						zzavr = new zzfl();
	//   38   76:aload_0         
	//   39   77:new             #54  <Class zzfl>
	//   40   80:dup             
	//   41   81:invokespecial   #111 <Method void zzfl()>
	//   42   84:putfield        #23  <Field zzfl zzavr>
					zzxz1.zza(((zzyi) (zzavr)));
	//   43   87:aload_1         
	//   44   88:aload_0         
	//   45   89:getfield        #23  <Field zzfl zzavr>
	//   46   92:invokevirtual   #114 <Method void zzxz.zza(zzyi)>
				}
			} else
	//*  47   95:goto            0
			{
				if(zzavq == null)
	//*  48   98:aload_0         
	//*  49   99:getfield        #21  <Field zzfn zzavq>
	//*  50  102:ifnonnull       116
					zzavq = new zzfn();
	//   51  105:aload_0         
	//   52  106:new             #50  <Class zzfn>
	//   53  109:dup             
	//   54  110:invokespecial   #115 <Method void zzfn()>
	//   55  113:putfield        #21  <Field zzfn zzavq>
				zzxz1.zza(((zzyi) (zzavq)));
	//   56  116:aload_1         
	//   57  117:aload_0         
	//   58  118:getfield        #21  <Field zzfn zzavq>
	//   59  121:invokevirtual   #114 <Method void zzxz.zza(zzyi)>
			}
		} while(true);
	//   60  124:goto            0
		return ((zzyi) (this));
	//   61  127:aload_0         
	//   62  128:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzavq));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzfn zzavq>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzya1.zza(1, ((zzyi) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #122 <Method void zzya.zza(int, zzyi)>
		obj = ((Object) (zzavr));
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field zzfl zzavr>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			zzya1.zza(2, ((zzyi) (obj)));
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #122 <Method void zzya.zza(int, zzyi)>
		obj = ((Object) (zzavs));
	//   18   30:aload_0         
	//   19   31:getfield        #25  <Field Boolean zzavs>
	//   20   34:astore_2        
		if(obj != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          48
			zzya1.zzb(3, ((Boolean) (obj)).booleanValue());
	//   23   39:aload_1         
	//   24   40:iconst_3        
	//   25   41:aload_2         
	//   26   42:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//   27   45:invokevirtual   #129 <Method void zzya.zzb(int, boolean)>
		obj = ((Object) (zzavt));
	//   28   48:aload_0         
	//   29   49:getfield        #27  <Field String zzavt>
	//   30   52:astore_2        
		if(obj != null)
	//*  31   53:aload_2         
	//*  32   54:ifnull          63
			zzya1.zzb(4, ((String) (obj)));
	//   33   57:aload_1         
	//   34   58:iconst_4        
	//   35   59:aload_2         
	//   36   60:invokevirtual   #132 <Method void zzya.zzb(int, String)>
		super.zza(zzya1);
	//   37   63:aload_0         
	//   38   64:aload_1         
	//   39   65:invokespecial   #134 <Method void zzyc.zza(zzya)>
	//   40   68:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzavq));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field zzfn zzavq>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + zzya.zzb(1, ((zzyi) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #140 <Method int zzya.zzb(int, zzyi)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (zzavr));
	//   16   24:aload_0         
	//   17   25:getfield        #23  <Field zzfl zzavr>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + zzya.zzb(2, ((zzyi) (obj)));
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #140 <Method int zzya.zzb(int, zzyi)>
	//   27   41:iadd            
	//   28   42:istore_2        
		obj = ((Object) (zzavs));
	//   29   43:aload_0         
	//   30   44:getfield        #25  <Field Boolean zzavs>
	//   31   47:astore_3        
		i = j;
	//   32   48:iload_2         
	//   33   49:istore_1        
		if(obj != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          68
		{
			((Boolean) (obj)).booleanValue();
	//   36   54:aload_3         
	//   37   55:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//   38   58:pop             
			i = j + (zzya.zzbd(3) + 1);
	//   39   59:iload_2         
	//   40   60:iconst_3        
	//   41   61:invokestatic    #144 <Method int zzya.zzbd(int)>
	//   42   64:iconst_1        
	//   43   65:iadd            
	//   44   66:iadd            
	//   45   67:istore_1        
		}
		obj = ((Object) (zzavt));
	//   46   68:aload_0         
	//   47   69:getfield        #27  <Field String zzavt>
	//   48   72:astore_3        
		j = i;
	//   49   73:iload_1         
	//   50   74:istore_2        
		if(obj != null)
	//*  51   75:aload_3         
	//*  52   76:ifnull          87
			j = i + zzya.zzc(4, ((String) (obj)));
	//   53   79:iload_1         
	//   54   80:iconst_4        
	//   55   81:aload_3         
	//   56   82:invokestatic    #148 <Method int zzya.zzc(int, String)>
	//   57   85:iadd            
	//   58   86:istore_2        
		return j;
	//   59   87:iload_2         
	//   60   88:ireturn         
	}

	private static volatile zzfk zzavp[];
	public zzfn zzavq;
	public zzfl zzavr;
	public Boolean zzavs;
	public String zzavt;
}
