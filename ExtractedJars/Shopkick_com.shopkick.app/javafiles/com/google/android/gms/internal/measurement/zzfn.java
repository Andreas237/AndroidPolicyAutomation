// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyl, zzxz, zzyg, 
//			zzye, zzya, zzyi

public final class zzfn extends zzyc
{

	public zzfn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzyc()>
		zzawc = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field Integer zzawc>
		zzawd = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field String zzawd>
		zzawe = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field Boolean zzawe>
		zzawf = zzyl.zzcfm;
	//   11   19:aload_0         
	//   12   20:getstatic       #28  <Field String[] zzyl.zzcfm>
	//   13   23:putfield        #30  <Field String[] zzawf>
		zzcet = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #34  <Field zzye zzcet>
		zzcfd = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #38  <Field int zzcfd>
	//   20   36:return          
	}

	private final zzfn zzd(zzxz zzxz1)
		throws IOException
	{
_L2:
		int i;
		int k;
		i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            260
		if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          170
		{
			if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          159
			{
				if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          145
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
	//*  20   36:invokespecial   #55  <Method boolean zzyc.zza(zzxz, int)>
	//*  21   39:ifne            0
							return this;
	//   22   42:aload_0         
	//   23   43:areturn         
					} else
					{
						int j = zzyl.zzb(zzxz1, 34);
	//   24   44:aload_1         
	//   25   45:bipush          34
	//   26   47:invokestatic    #59  <Method int zzyl.zzb(zzxz, int)>
	//   27   50:istore_3        
						String as[] = zzawf;
	//   28   51:aload_0         
	//   29   52:getfield        #30  <Field String[] zzawf>
	//   30   55:astore          5
						if(as == null)
	//*  31   57:aload           5
	//*  32   59:ifnonnull       67
							i = 0;
	//   33   62:iconst_0        
	//   34   63:istore_2        
						else
	//*  35   64:goto            71
							i = as.length;
	//   36   67:aload           5
	//   37   69:arraylength     
	//   38   70:istore_2        
						as = new String[j + i];
	//   39   71:iload_3         
	//   40   72:iload_2         
	//   41   73:iadd            
	//   42   74:anewarray       String[]
	//   43   77:astore          5
						j = i;
	//   44   79:iload_2         
	//   45   80:istore_3        
						if(i != 0)
	//*  46   81:iload_2         
	//*  47   82:ifeq            99
						{
							System.arraycopy(((Object) (zzawf)), 0, ((Object) (as)), 0, i);
	//   48   85:aload_0         
	//   49   86:getfield        #30  <Field String[] zzawf>
	//   50   89:iconst_0        
	//   51   90:aload           5
	//   52   92:iconst_0        
	//   53   93:iload_2         
	//   54   94:invokestatic    #67  <Method void System.arraycopy(Object, int, Object, int, int)>
							j = i;
	//   55   97:iload_2         
	//   56   98:istore_3        
						}
						for(; j < as.length - 1; j++)
	//*  57   99:iload_3         
	//*  58  100:aload           5
	//*  59  102:arraylength     
	//*  60  103:iconst_1        
	//*  61  104:isub            
	//*  62  105:icmpge          128
						{
							as[j] = zzxz1.readString();
	//   63  108:aload           5
	//   64  110:iload_3         
	//   65  111:aload_1         
	//   66  112:invokevirtual   #71  <Method String zzxz.readString()>
	//   67  115:aastore         
							zzxz1.zzuj();
	//   68  116:aload_1         
	//   69  117:invokevirtual   #51  <Method int zzxz.zzuj()>
	//   70  120:pop             
						}

	//   71  121:iload_3         
	//   72  122:iconst_1        
	//   73  123:iadd            
	//   74  124:istore_3        
	//*  75  125:goto            99
						as[j] = zzxz1.readString();
	//   76  128:aload           5
	//   77  130:iload_3         
	//   78  131:aload_1         
	//   79  132:invokevirtual   #71  <Method String zzxz.readString()>
	//   80  135:aastore         
						zzawf = as;
	//   81  136:aload_0         
	//   82  137:aload           5
	//   83  139:putfield        #30  <Field String[] zzawf>
					}
				} else
	//*  84  142:goto            0
				{
					zzawe = Boolean.valueOf(zzxz1.zzup());
	//   85  145:aload_0         
	//   86  146:aload_1         
	//   87  147:invokevirtual   #75  <Method boolean zzxz.zzup()>
	//   88  150:invokestatic    #81  <Method Boolean Boolean.valueOf(boolean)>
	//   89  153:putfield        #23  <Field Boolean zzawe>
				}
			} else
	//*  90  156:goto            0
			{
				zzawd = zzxz1.readString();
	//   91  159:aload_0         
	//   92  160:aload_1         
	//   93  161:invokevirtual   #71  <Method String zzxz.readString()>
	//   94  164:putfield        #21  <Field String zzawd>
			}
			continue; /* Loop/switch isn't completed */
	//   95  167:goto            0
		}
		k = zzxz1.getPosition();
	//   96  170:aload_1         
	//   97  171:invokevirtual   #84  <Method int zzxz.getPosition()>
	//   98  174:istore_3        
		int l = zzxz1.zzvb();
	//   99  175:aload_1         
	//  100  176:invokevirtual   #87  <Method int zzxz.zzvb()>
	//  101  179:istore          4
		if(l < 0 || l > 6)
			break MISSING_BLOCK_LABEL_205;
	//  102  181:iload           4
	//  103  183:iflt            205
	//  104  186:iload           4
	//  105  188:bipush          6
	//  106  190:icmpgt          205
		zzawc = Integer.valueOf(l);
	//  107  193:aload_0         
	//  108  194:iload           4
	//  109  196:invokestatic    #92  <Method Integer Integer.valueOf(int)>
	//  110  199:putfield        #19  <Field Integer zzawc>
		continue; /* Loop/switch isn't completed */
	//  111  202:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(41);
	//  112  205:new             #94  <Class StringBuilder>
	//  113  208:dup             
	//  114  209:bipush          41
	//  115  211:invokespecial   #97  <Method void StringBuilder(int)>
	//  116  214:astore          5
			stringbuilder.append(l);
	//  117  216:aload           5
	//  118  218:iload           4
	//  119  220:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//  120  223:pop             
			stringbuilder.append(" is not a valid enum MatchType");
	//  121  224:aload           5
	//  122  226:ldc1            #103 <String " is not a valid enum MatchType">
	//  123  228:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  124  231:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  125  232:new             #45  <Class IllegalArgumentException>
	//  126  235:dup             
	//  127  236:aload           5
	//  128  238:invokevirtual   #109 <Method String StringBuilder.toString()>
	//  129  241:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//  130  244:athrow          
		}
	//* 131  245:aload_1         
	//* 132  246:iload_3         
	//* 133  247:invokevirtual   #115 <Method void zzxz.zzcb(int)>
	//* 134  250:aload_0         
	//* 135  251:aload_1         
	//* 136  252:iload_2         
	//* 137  253:invokevirtual   #55  <Method boolean zzyc.zza(zzxz, int)>
	//* 138  256:pop             
	//* 139  257:goto            0
	//* 140  260:aload_0         
	//* 141  261:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			zzxz1.zzcb(k);
		}
		((zzyc)this).zza(zzxz1, i);
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//* 142  262:astore          5
	//* 143  264:goto            245
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
		if(!(obj instanceof zzfn))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfn>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfn)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfn>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzawc));
	//   13   21:aload_0         
	//   14   22:getfield        #19  <Field Integer zzawc>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfn) (obj)).zzawc != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #19  <Field Integer zzawc>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfn) (obj)).zzawc))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #19  <Field Integer zzawc>
	//*  26   44:invokevirtual   #120 <Method boolean Integer.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzawd));
	//   30   52:aload_0         
	//   31   53:getfield        #21  <Field String zzawd>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfn) (obj)).zzawd != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #21  <Field String zzawd>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfn) (obj)).zzawd))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #21  <Field String zzawd>
	//*  43   75:invokevirtual   #121 <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (zzawe));
	//   47   83:aload_0         
	//   48   84:getfield        #23  <Field Boolean zzawe>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((zzfn) (obj)).zzawe != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #23  <Field Boolean zzawe>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfn) (obj)).zzawe))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #23  <Field Boolean zzawe>
	//*  60  106:invokevirtual   #122 <Method boolean Boolean.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		if(!zzyg.equals(((Object []) (zzawf)), ((Object []) (((zzfn) (obj)).zzawf))))
	//*  64  114:aload_0         
	//*  65  115:getfield        #30  <Field String[] zzawf>
	//*  66  118:aload_1         
	//*  67  119:getfield        #30  <Field String[] zzawf>
	//*  68  122:invokestatic    #127 <Method boolean zzyg.equals(Object[], Object[])>
	//*  69  125:ifne            130
			return false;
	//   70  128:iconst_0        
	//   71  129:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  72  130:aload_0         
	//*  73  131:getfield        #34  <Field zzye zzcet>
	//*  74  134:ifnull          162
	//*  75  137:aload_0         
	//*  76  138:getfield        #34  <Field zzye zzcet>
	//*  77  141:invokevirtual   #132 <Method boolean zzye.isEmpty()>
	//*  78  144:ifeq            150
	//*  79  147:goto            162
			return zzcet.equals(((Object) (((zzfn) (obj)).zzcet)));
	//   80  150:aload_0         
	//   81  151:getfield        #34  <Field zzye zzcet>
	//   82  154:aload_1         
	//   83  155:getfield        #34  <Field zzye zzcet>
	//   84  158:invokevirtual   #133 <Method boolean zzye.equals(Object)>
	//   85  161:ireturn         
		if(((zzfn) (obj)).zzcet != null)
	//*  86  162:aload_1         
	//*  87  163:getfield        #34  <Field zzye zzcet>
	//*  88  166:ifnull          183
			return ((zzfn) (obj)).zzcet.isEmpty();
	//   89  169:aload_1         
	//   90  170:getfield        #34  <Field zzye zzcet>
	//   91  173:invokevirtual   #132 <Method boolean zzye.isEmpty()>
	//   92  176:ifeq            181
	//   93  179:iconst_1        
	//   94  180:ireturn         
	//   95  181:iconst_0        
	//   96  182:ireturn         
		else
			return true;
	//   97  183:iconst_1        
	//   98  184:ireturn         
	}

	public final int hashCode()
	{
		int i1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #145 <Method String Class.getName()>
	//    3    7:invokevirtual   #147 <Method int String.hashCode()>
	//    4   10:istore          6
		Object obj = ((Object) (zzawc));
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field Integer zzawc>
	//    7   16:astore          8
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          5
		int i;
		if(obj == null)
	//*  10   21:aload           8
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((Integer) (obj)).intValue();
	//   15   31:aload           8
	//   16   33:invokevirtual   #150 <Method int Integer.intValue()>
	//   17   36:istore_1        
		obj = ((Object) (zzawd));
	//   18   37:aload_0         
	//   19   38:getfield        #21  <Field String zzawd>
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
			j = ((String) (obj)).hashCode();
	//   26   53:aload           8
	//   27   55:invokevirtual   #147 <Method int String.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (zzawe));
	//   29   59:aload_0         
	//   30   60:getfield        #23  <Field Boolean zzawe>
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
	//   38   77:invokevirtual   #151 <Method int Boolean.hashCode()>
	//   39   80:istore_3        
		int j1 = zzyg.hashCode(((Object []) (zzawf)));
	//   40   81:aload_0         
	//   41   82:getfield        #30  <Field String[] zzawf>
	//   42   85:invokestatic    #154 <Method int zzyg.hashCode(Object[])>
	//   43   88:istore          7
		int l = ((int) (flag));
	//   44   90:iload           5
	//   45   92:istore          4
		if(zzcet != null)
	//*  46   94:aload_0         
	//*  47   95:getfield        #34  <Field zzye zzcet>
	//*  48   98:ifnull          127
			if(zzcet.isEmpty())
	//*  49  101:aload_0         
	//*  50  102:getfield        #34  <Field zzye zzcet>
	//*  51  105:invokevirtual   #132 <Method boolean zzye.isEmpty()>
	//*  52  108:ifeq            118
				l = ((int) (flag));
	//   53  111:iload           5
	//   54  113:istore          4
			else
	//*  55  115:goto            127
				l = zzcet.hashCode();
	//   56  118:aload_0         
	//   57  119:getfield        #34  <Field zzye zzcet>
	//   58  122:invokevirtual   #155 <Method int zzye.hashCode()>
	//   59  125:istore          4
		return (((((i1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + j1) * 31 + l;
	//   60  127:iload           6
	//   61  129:sipush          527
	//   62  132:iadd            
	//   63  133:bipush          31
	//   64  135:imul            
	//   65  136:iload_1         
	//   66  137:iadd            
	//   67  138:bipush          31
	//   68  140:imul            
	//   69  141:iload_2         
	//   70  142:iadd            
	//   71  143:bipush          31
	//   72  145:imul            
	//   73  146:iload_3         
	//   74  147:iadd            
	//   75  148:bipush          31
	//   76  150:imul            
	//   77  151:iload           7
	//   78  153:iadd            
	//   79  154:bipush          31
	//   80  156:imul            
	//   81  157:iload           4
	//   82  159:iadd            
	//   83  160:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		return ((zzyi) (zzd(zzxz1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method zzfn zzd(zzxz)>
	//    3    5:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzawc));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Integer zzawc>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
			zzya1.zzd(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_3         
	//    8   12:invokevirtual   #150 <Method int Integer.intValue()>
	//    9   15:invokevirtual   #164 <Method void zzya.zzd(int, int)>
		obj = ((Object) (zzawd));
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field String zzawd>
	//   12   22:astore_3        
		if(obj != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          33
			zzya1.zzb(2, ((String) (obj)));
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_3         
	//   18   30:invokevirtual   #167 <Method void zzya.zzb(int, String)>
		obj = ((Object) (zzawe));
	//   19   33:aload_0         
	//   20   34:getfield        #23  <Field Boolean zzawe>
	//   21   37:astore_3        
		if(obj != null)
	//*  22   38:aload_3         
	//*  23   39:ifnull          51
			zzya1.zzb(3, ((Boolean) (obj)).booleanValue());
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_3         
	//   27   45:invokevirtual   #170 <Method boolean Boolean.booleanValue()>
	//   28   48:invokevirtual   #173 <Method void zzya.zzb(int, boolean)>
		String as[] = zzawf;
	//   29   51:aload_0         
	//   30   52:getfield        #30  <Field String[] zzawf>
	//   31   55:astore_3        
		if(as != null && as.length > 0)
	//*  32   56:aload_3         
	//*  33   57:ifnull          99
	//*  34   60:aload_3         
	//*  35   61:arraylength     
	//*  36   62:ifle            99
		{
			int i = 0;
	//   37   65:iconst_0        
	//   38   66:istore_2        
			do
			{
				String as1[] = zzawf;
	//   39   67:aload_0         
	//   40   68:getfield        #30  <Field String[] zzawf>
	//   41   71:astore_3        
				if(i >= as1.length)
					break;
	//   42   72:iload_2         
	//   43   73:aload_3         
	//   44   74:arraylength     
	//   45   75:icmpge          99
				String s = as1[i];
	//   46   78:aload_3         
	//   47   79:iload_2         
	//   48   80:aaload          
	//   49   81:astore_3        
				if(s != null)
	//*  50   82:aload_3         
	//*  51   83:ifnull          92
					zzya1.zzb(4, s);
	//   52   86:aload_1         
	//   53   87:iconst_4        
	//   54   88:aload_3         
	//   55   89:invokevirtual   #167 <Method void zzya.zzb(int, String)>
				i++;
	//   56   92:iload_2         
	//   57   93:iconst_1        
	//   58   94:iadd            
	//   59   95:istore_2        
			} while(true);
	//   60   96:goto            67
		}
		super.zza(zzya1);
	//   61   99:aload_0         
	//   62  100:aload_1         
	//   63  101:invokespecial   #175 <Method void zzyc.zza(zzya)>
	//   64  104:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzawc));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Integer zzawc>
	//    5    9:astore          7
		int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
		if(obj != null)
	//*   8   13:aload           7
	//*   9   15:ifnull          30
			i = j + zzya.zzh(1, ((Integer) (obj)).intValue());
	//   10   18:iload_2         
	//   11   19:iconst_1        
	//   12   20:aload           7
	//   13   22:invokevirtual   #150 <Method int Integer.intValue()>
	//   14   25:invokestatic    #182 <Method int zzya.zzh(int, int)>
	//   15   28:iadd            
	//   16   29:istore_1        
		obj = ((Object) (zzawd));
	//   17   30:aload_0         
	//   18   31:getfield        #21  <Field String zzawd>
	//   19   34:astore          7
		j = i;
	//   20   36:iload_1         
	//   21   37:istore_2        
		if(obj != null)
	//*  22   38:aload           7
	//*  23   40:ifnull          52
			j = i + zzya.zzc(2, ((String) (obj)));
	//   24   43:iload_1         
	//   25   44:iconst_2        
	//   26   45:aload           7
	//   27   47:invokestatic    #186 <Method int zzya.zzc(int, String)>
	//   28   50:iadd            
	//   29   51:istore_2        
		obj = ((Object) (zzawe));
	//   30   52:aload_0         
	//   31   53:getfield        #23  <Field Boolean zzawe>
	//   32   56:astore          7
		i = j;
	//   33   58:iload_2         
	//   34   59:istore_1        
		if(obj != null)
	//*  35   60:aload           7
	//*  36   62:ifnull          80
		{
			((Boolean) (obj)).booleanValue();
	//   37   65:aload           7
	//   38   67:invokevirtual   #170 <Method boolean Boolean.booleanValue()>
	//   39   70:pop             
			i = j + (zzya.zzbd(3) + 1);
	//   40   71:iload_2         
	//   41   72:iconst_3        
	//   42   73:invokestatic    #190 <Method int zzya.zzbd(int)>
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:iadd            
	//   46   79:istore_1        
		}
		String as[] = zzawf;
	//   47   80:aload_0         
	//   48   81:getfield        #30  <Field String[] zzawf>
	//   49   84:astore          7
		j = i;
	//   50   86:iload_1         
	//   51   87:istore_2        
		if(as != null)
	//*  52   88:aload           7
	//*  53   90:ifnull          177
		{
			j = i;
	//   54   93:iload_1         
	//   55   94:istore_2        
			if(as.length > 0)
	//*  56   95:aload           7
	//*  57   97:arraylength     
	//*  58   98:ifle            177
			{
				j = 0;
	//   59  101:iconst_0        
	//   60  102:istore_2        
				int k = 0;
	//   61  103:iconst_0        
	//   62  104:istore_3        
				int l = k;
	//   63  105:iload_3         
	//   64  106:istore          4
				do
				{
					String as1[] = zzawf;
	//   65  108:aload_0         
	//   66  109:getfield        #30  <Field String[] zzawf>
	//   67  112:astore          7
					if(j >= as1.length)
						break;
	//   68  114:iload_2         
	//   69  115:aload           7
	//   70  117:arraylength     
	//   71  118:icmpge          168
					String s = as1[j];
	//   72  121:aload           7
	//   73  123:iload_2         
	//   74  124:aaload          
	//   75  125:astore          7
					int j1 = k;
	//   76  127:iload_3         
	//   77  128:istore          6
					int i1 = l;
	//   78  130:iload           4
	//   79  132:istore          5
					if(s != null)
	//*  80  134:aload           7
	//*  81  136:ifnull          154
					{
						i1 = l + 1;
	//   82  139:iload           4
	//   83  141:iconst_1        
	//   84  142:iadd            
	//   85  143:istore          5
						j1 = k + zzya.zzgc(s);
	//   86  145:iload_3         
	//   87  146:aload           7
	//   88  148:invokestatic    #194 <Method int zzya.zzgc(String)>
	//   89  151:iadd            
	//   90  152:istore          6
					}
					j++;
	//   91  154:iload_2         
	//   92  155:iconst_1        
	//   93  156:iadd            
	//   94  157:istore_2        
					k = j1;
	//   95  158:iload           6
	//   96  160:istore_3        
					l = i1;
	//   97  161:iload           5
	//   98  163:istore          4
				} while(true);
	//   99  165:goto            108
				j = i + k + l * 1;
	//  100  168:iload_1         
	//  101  169:iload_3         
	//  102  170:iadd            
	//  103  171:iload           4
	//  104  173:iconst_1        
	//  105  174:imul            
	//  106  175:iadd            
	//  107  176:istore_2        
			}
		}
		return j;
	//  108  177:iload_2         
	//  109  178:ireturn         
	}

	public Integer zzawc;
	public String zzawd;
	public Boolean zzawe;
	public String zzawf[];
}
