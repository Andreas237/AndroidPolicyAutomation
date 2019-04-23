// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzye, zzxz, 
//			zzya, zzyi

public final class zzfo extends zzyc
{

	public zzfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzyc()>
		name = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field String name>
		zzawh = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field Boolean zzawh>
		zzawi = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field Boolean zzawi>
		zzawj = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #26  <Field Integer zzawj>
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

	public static zzfo[] zzmv()
	{
		if(zzawg == null)
	//*   0    0:getstatic       #39  <Field zzfo[] zzawg>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #45  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzawg == null)
	//*   6   12:getstatic       #39  <Field zzfo[] zzawg>
	//*   7   15:ifnonnull       25
					zzawg = new zzfo[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfo[]
	//   10   22:putstatic       #39  <Field zzfo[] zzawg>
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
		return zzawg;
	//   19   35:getstatic       #39  <Field zzfo[] zzawg>
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
		if(!(obj instanceof zzfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfo>
	//   12   20:astore_1        
		Object obj1 = ((Object) (name));
	//   13   21:aload_0         
	//   14   22:getfield        #20  <Field String name>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfo) (obj)).name != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #20  <Field String name>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((zzfo) (obj)).name))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #20  <Field String name>
	//*  26   44:invokevirtual   #51  <Method boolean String.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzawh));
	//   30   52:aload_0         
	//   31   53:getfield        #22  <Field Boolean zzawh>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfo) (obj)).zzawh != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #22  <Field Boolean zzawh>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfo) (obj)).zzawh))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #22  <Field Boolean zzawh>
	//*  43   75:invokevirtual   #54  <Method boolean Boolean.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (zzawi));
	//   47   83:aload_0         
	//   48   84:getfield        #24  <Field Boolean zzawi>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((zzfo) (obj)).zzawi != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #24  <Field Boolean zzawi>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((zzfo) (obj)).zzawi))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #24  <Field Boolean zzawi>
	//*  60  106:invokevirtual   #54  <Method boolean Boolean.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		obj1 = ((Object) (zzawj));
	//   64  114:aload_0         
	//   65  115:getfield        #26  <Field Integer zzawj>
	//   66  118:astore_2        
		if(obj1 == null)
	//*  67  119:aload_2         
	//*  68  120:ifnonnull       132
		{
			if(((zzfo) (obj)).zzawj != null)
	//*  69  123:aload_1         
	//*  70  124:getfield        #26  <Field Integer zzawj>
	//*  71  127:ifnull          145
				return false;
	//   72  130:iconst_0        
	//   73  131:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfo) (obj)).zzawj))))
	//*  74  132:aload_2         
	//*  75  133:aload_1         
	//*  76  134:getfield        #26  <Field Integer zzawj>
	//*  77  137:invokevirtual   #57  <Method boolean Integer.equals(Object)>
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
			return zzcet.equals(((Object) (((zzfo) (obj)).zzcet)));
	//   89  165:aload_0         
	//   90  166:getfield        #30  <Field zzye zzcet>
	//   91  169:aload_1         
	//   92  170:getfield        #30  <Field zzye zzcet>
	//   93  173:invokevirtual   #64  <Method boolean zzye.equals(Object)>
	//   94  176:ireturn         
		if(((zzfo) (obj)).zzcet != null)
	//*  95  177:aload_1         
	//*  96  178:getfield        #30  <Field zzye zzcet>
	//*  97  181:ifnull          198
			return ((zzfo) (obj)).zzcet.isEmpty();
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
	//    3    7:invokevirtual   #80  <Method int String.hashCode()>
	//    4   10:istore          7
		Object obj = ((Object) (name));
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field String name>
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
			i = ((String) (obj)).hashCode();
	//   15   31:aload           8
	//   16   33:invokevirtual   #80  <Method int String.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzawh));
	//   18   37:aload_0         
	//   19   38:getfield        #22  <Field Boolean zzawh>
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
			j = ((Boolean) (obj)).hashCode();
	//   26   53:aload           8
	//   27   55:invokevirtual   #81  <Method int Boolean.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (zzawi));
	//   29   59:aload_0         
	//   30   60:getfield        #24  <Field Boolean zzawi>
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
	//   38   77:invokevirtual   #81  <Method int Boolean.hashCode()>
	//   39   80:istore_3        
		obj = ((Object) (zzawj));
	//   40   81:aload_0         
	//   41   82:getfield        #26  <Field Integer zzawj>
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
			l = ((Integer) (obj)).hashCode();
	//   48   98:aload           8
	//   49  100:invokevirtual   #82  <Method int Integer.hashCode()>
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
	//   65  137:invokevirtual   #83  <Method int zzye.hashCode()>
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
	//    1    1:invokevirtual   #92  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            97
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          86
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          72
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
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
	//*  20   36:invokespecial   #95  <Method boolean zzyc.zza(zzxz, int)>
	//*  21   39:ifne            0
								return ((zzyi) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
						} else
						{
							zzawj = Integer.valueOf(zzxz1.zzvb());
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #98  <Method int zzxz.zzvb()>
	//   27   49:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   28   52:putfield        #26  <Field Integer zzawj>
						}
					} else
	//*  29   55:goto            0
					{
						zzawi = Boolean.valueOf(zzxz1.zzup());
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #105 <Method boolean zzxz.zzup()>
	//   33   63:invokestatic    #108 <Method Boolean Boolean.valueOf(boolean)>
	//   34   66:putfield        #24  <Field Boolean zzawi>
					}
				} else
	//*  35   69:goto            0
				{
					zzawh = Boolean.valueOf(zzxz1.zzup());
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokevirtual   #105 <Method boolean zzxz.zzup()>
	//   39   77:invokestatic    #108 <Method Boolean Boolean.valueOf(boolean)>
	//   40   80:putfield        #22  <Field Boolean zzawh>
				}
			} else
	//*  41   83:goto            0
			{
				name = zzxz1.readString();
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:invokevirtual   #111 <Method String zzxz.readString()>
	//   45   91:putfield        #20  <Field String name>
			}
		} while(true);
	//   46   94:goto            0
		return ((zzyi) (this));
	//   47   97:aload_0         
	//   48   98:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (name));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String name>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzya1.zzb(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #119 <Method void zzya.zzb(int, String)>
		obj = ((Object) (zzawh));
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field Boolean zzawh>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          33
			zzya1.zzb(2, ((Boolean) (obj)).booleanValue());
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #122 <Method boolean Boolean.booleanValue()>
	//   18   30:invokevirtual   #125 <Method void zzya.zzb(int, boolean)>
		obj = ((Object) (zzawi));
	//   19   33:aload_0         
	//   20   34:getfield        #24  <Field Boolean zzawi>
	//   21   37:astore_2        
		if(obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          51
			zzya1.zzb(3, ((Boolean) (obj)).booleanValue());
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #122 <Method boolean Boolean.booleanValue()>
	//   28   48:invokevirtual   #125 <Method void zzya.zzb(int, boolean)>
		obj = ((Object) (zzawj));
	//   29   51:aload_0         
	//   30   52:getfield        #26  <Field Integer zzawj>
	//   31   55:astore_2        
		if(obj != null)
	//*  32   56:aload_2         
	//*  33   57:ifnull          69
			zzya1.zzd(4, ((Integer) (obj)).intValue());
	//   34   60:aload_1         
	//   35   61:iconst_4        
	//   36   62:aload_2         
	//   37   63:invokevirtual   #128 <Method int Integer.intValue()>
	//   38   66:invokevirtual   #132 <Method void zzya.zzd(int, int)>
		super.zza(zzya1);
	//   39   69:aload_0         
	//   40   70:aload_1         
	//   41   71:invokespecial   #134 <Method void zzyc.zza(zzya)>
	//   42   74:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (name));
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field String name>
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
	//   13   19:invokestatic    #141 <Method int zzya.zzc(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (zzawh));
	//   16   24:aload_0         
	//   17   25:getfield        #22  <Field Boolean zzawh>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          49
		{
			((Boolean) (obj)).booleanValue();
	//   23   35:aload_3         
	//   24   36:invokevirtual   #122 <Method boolean Boolean.booleanValue()>
	//   25   39:pop             
			j = i + (zzya.zzbd(2) + 1);
	//   26   40:iload_1         
	//   27   41:iconst_2        
	//   28   42:invokestatic    #145 <Method int zzya.zzbd(int)>
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:iadd            
	//   32   48:istore_2        
		}
		obj = ((Object) (zzawi));
	//   33   49:aload_0         
	//   34   50:getfield        #24  <Field Boolean zzawi>
	//   35   53:astore_3        
		i = j;
	//   36   54:iload_2         
	//   37   55:istore_1        
		if(obj != null)
	//*  38   56:aload_3         
	//*  39   57:ifnull          74
		{
			((Boolean) (obj)).booleanValue();
	//   40   60:aload_3         
	//   41   61:invokevirtual   #122 <Method boolean Boolean.booleanValue()>
	//   42   64:pop             
			i = j + (zzya.zzbd(3) + 1);
	//   43   65:iload_2         
	//   44   66:iconst_3        
	//   45   67:invokestatic    #145 <Method int zzya.zzbd(int)>
	//   46   70:iconst_1        
	//   47   71:iadd            
	//   48   72:iadd            
	//   49   73:istore_1        
		}
		obj = ((Object) (zzawj));
	//   50   74:aload_0         
	//   51   75:getfield        #26  <Field Integer zzawj>
	//   52   78:astore_3        
		j = i;
	//   53   79:iload_1         
	//   54   80:istore_2        
		if(obj != null)
	//*  55   81:aload_3         
	//*  56   82:ifnull          96
			j = i + zzya.zzh(4, ((Integer) (obj)).intValue());
	//   57   85:iload_1         
	//   58   86:iconst_4        
	//   59   87:aload_3         
	//   60   88:invokevirtual   #128 <Method int Integer.intValue()>
	//   61   91:invokestatic    #149 <Method int zzya.zzh(int, int)>
	//   62   94:iadd            
	//   63   95:istore_2        
		return j;
	//   64   96:iload_2         
	//   65   97:ireturn         
	}

	private static volatile zzfo zzawg[];
	public String name;
	public Boolean zzawh;
	public Boolean zzawi;
	public Integer zzawj;
}
