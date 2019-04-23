// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzfu, zzgb, zzfy, zzfw, 
//			zzfs, zzfz

public final class zzgy extends zzfu
	implements Cloneable
{

	public zzgy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzfu()>
		zzbiw = zzgb.zzsc;
	//    2    4:aload_0         
	//    3    5:getstatic       #24  <Field String[] zzgb.zzsc>
	//    4    8:putfield        #26  <Field String[] zzbiw>
		zzbix = zzgb.zzsc;
	//    5   11:aload_0         
	//    6   12:getstatic       #24  <Field String[] zzgb.zzsc>
	//    7   15:putfield        #28  <Field String[] zzbix>
		zzbiy = zzgb.zzrx;
	//    8   18:aload_0         
	//    9   19:getstatic       #31  <Field int[] zzgb.zzrx>
	//   10   22:putfield        #33  <Field int[] zzbiy>
		zzbiz = zzgb.zzry;
	//   11   25:aload_0         
	//   12   26:getstatic       #36  <Field long[] zzgb.zzry>
	//   13   29:putfield        #38  <Field long[] zzbiz>
		zzbja = zzgb.zzry;
	//   14   32:aload_0         
	//   15   33:getstatic       #36  <Field long[] zzgb.zzry>
	//   16   36:putfield        #40  <Field long[] zzbja>
		zzrj = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #44  <Field zzfw zzrj>
		zzrs = -1;
	//   20   44:aload_0         
	//   21   45:iconst_m1       
	//   22   46:putfield        #48  <Field int zzrs>
	//   23   49:return          
	}

	private final zzgy zzgb()
	{
		zzgy zzgy1;
		Object aobj[];
		try
		{
			zzgy1 = (zzgy)super.zzeo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method zzfu zzfu.zzeo()>
	//    2    4:checkcast       #2   <Class zzgy>
	//    3    7:astore_1        
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #26  <Field String[] zzbiw>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:ifnull          33
	//*   9   17:aload_2         
	//*  10   18:arraylength     
	//*  11   19:ifle            33
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #62  <Method Object _5B_Ljava.lang.String_3B_.clone()>
	//*  15   27:checkcast       #58  <Class String[]>
	//*  16   30:putfield        #26  <Field String[] zzbiw>
	//*  17   33:aload_0         
	//*  18   34:getfield        #28  <Field String[] zzbix>
	//*  19   37:astore_2        
	//*  20   38:aload_2         
	//*  21   39:ifnull          58
	//*  22   42:aload_2         
	//*  23   43:arraylength     
	//*  24   44:ifle            58
	//*  25   47:aload_1         
	//*  26   48:aload_2         
	//*  27   49:invokevirtual   #62  <Method Object _5B_Ljava.lang.String_3B_.clone()>
	//*  28   52:checkcast       #58  <Class String[]>
	//*  29   55:putfield        #28  <Field String[] zzbix>
	//*  30   58:aload_0         
	//*  31   59:getfield        #33  <Field int[] zzbiy>
	//*  32   62:astore_2        
	//*  33   63:aload_2         
	//*  34   64:ifnull          83
	//*  35   67:aload_2         
	//*  36   68:arraylength     
	//*  37   69:ifle            83
	//*  38   72:aload_1         
	//*  39   73:aload_2         
	//*  40   74:invokevirtual   #64  <Method Object _5B_I.clone()>
	//*  41   77:checkcast       #63  <Class int[]>
	//*  42   80:putfield        #33  <Field int[] zzbiy>
	//*  43   83:aload_0         
	//*  44   84:getfield        #38  <Field long[] zzbiz>
	//*  45   87:astore_2        
	//*  46   88:aload_2         
	//*  47   89:ifnull          108
	//*  48   92:aload_2         
	//*  49   93:arraylength     
	//*  50   94:ifle            108
	//*  51   97:aload_1         
	//*  52   98:aload_2         
	//*  53   99:invokevirtual   #66  <Method Object _5B_J.clone()>
	//*  54  102:checkcast       #65  <Class long[]>
	//*  55  105:putfield        #38  <Field long[] zzbiz>
	//*  56  108:aload_0         
	//*  57  109:getfield        #40  <Field long[] zzbja>
	//*  58  112:astore_2        
	//*  59  113:aload_2         
	//*  60  114:ifnull          133
	//*  61  117:aload_2         
	//*  62  118:arraylength     
	//*  63  119:ifle            133
	//*  64  122:aload_1         
	//*  65  123:aload_2         
	//*  66  124:invokevirtual   #66  <Method Object _5B_J.clone()>
	//*  67  127:checkcast       #65  <Class long[]>
	//*  68  130:putfield        #40  <Field long[] zzbja>
	//*  69  133:aload_1         
	//*  70  134:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  71  135:astore_1        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//   72  136:new             #68  <Class AssertionError>
	//   73  139:dup             
	//   74  140:aload_1         
	//   75  141:invokespecial   #71  <Method void AssertionError(Object)>
	//   76  144:athrow          
		}
		aobj = ((Object []) (zzbiw));
		if(aobj != null && aobj.length > 0)
			zzgy1.zzbiw = (String[])((String []) (aobj)).clone();
		aobj = ((Object []) (zzbix));
		if(aobj != null && aobj.length > 0)
			zzgy1.zzbix = (String[])((String []) (aobj)).clone();
		aobj = ((Object []) (zzbiy));
		if(aobj != null && aobj.length > 0)
			zzgy1.zzbiy = (int[])((int []) (aobj)).clone();
		aobj = ((Object []) (zzbiz));
		if(aobj != null && aobj.length > 0)
			zzgy1.zzbiz = (long[])((long []) (aobj)).clone();
		aobj = ((Object []) (zzbja));
		if(aobj != null && aobj.length > 0)
			zzgy1.zzbja = (long[])((long []) (aobj)).clone();
		return zzgy1;
	}

	public final Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzgb()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method zzgy zzgb()>
	//    2    4:areturn         
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
		if(!(obj instanceof zzgy))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzgy>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzgy)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzgy>
	//   12   20:astore_1        
		if(!zzfy.equals(((Object []) (zzbiw)), ((Object []) (((zzgy) (obj)).zzbiw))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #26  <Field String[] zzbiw>
	//*  15   25:aload_1         
	//*  16   26:getfield        #26  <Field String[] zzbiw>
	//*  17   29:invokestatic    #81  <Method boolean zzfy.equals(Object[], Object[])>
	//*  18   32:ifne            37
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		if(!zzfy.equals(((Object []) (zzbix)), ((Object []) (((zzgy) (obj)).zzbix))))
	//*  21   37:aload_0         
	//*  22   38:getfield        #28  <Field String[] zzbix>
	//*  23   41:aload_1         
	//*  24   42:getfield        #28  <Field String[] zzbix>
	//*  25   45:invokestatic    #81  <Method boolean zzfy.equals(Object[], Object[])>
	//*  26   48:ifne            53
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		if(!zzfy.equals(zzbiy, ((zzgy) (obj)).zzbiy))
	//*  29   53:aload_0         
	//*  30   54:getfield        #33  <Field int[] zzbiy>
	//*  31   57:aload_1         
	//*  32   58:getfield        #33  <Field int[] zzbiy>
	//*  33   61:invokestatic    #84  <Method boolean zzfy.equals(int[], int[])>
	//*  34   64:ifne            69
			return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		if(!zzfy.equals(zzbiz, ((zzgy) (obj)).zzbiz))
	//*  37   69:aload_0         
	//*  38   70:getfield        #38  <Field long[] zzbiz>
	//*  39   73:aload_1         
	//*  40   74:getfield        #38  <Field long[] zzbiz>
	//*  41   77:invokestatic    #87  <Method boolean zzfy.equals(long[], long[])>
	//*  42   80:ifne            85
			return false;
	//   43   83:iconst_0        
	//   44   84:ireturn         
		if(!zzfy.equals(zzbja, ((zzgy) (obj)).zzbja))
	//*  45   85:aload_0         
	//*  46   86:getfield        #40  <Field long[] zzbja>
	//*  47   89:aload_1         
	//*  48   90:getfield        #40  <Field long[] zzbja>
	//*  49   93:invokestatic    #87  <Method boolean zzfy.equals(long[], long[])>
	//*  50   96:ifne            101
			return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		if(zzrj != null && !zzrj.isEmpty())
	//*  53  101:aload_0         
	//*  54  102:getfield        #44  <Field zzfw zzrj>
	//*  55  105:ifnull          133
	//*  56  108:aload_0         
	//*  57  109:getfield        #44  <Field zzfw zzrj>
	//*  58  112:invokevirtual   #93  <Method boolean zzfw.isEmpty()>
	//*  59  115:ifeq            121
	//*  60  118:goto            133
			return zzrj.equals(((Object) (((zzgy) (obj)).zzrj)));
	//   61  121:aload_0         
	//   62  122:getfield        #44  <Field zzfw zzrj>
	//   63  125:aload_1         
	//   64  126:getfield        #44  <Field zzfw zzrj>
	//   65  129:invokevirtual   #95  <Method boolean zzfw.equals(Object)>
	//   66  132:ireturn         
		if(((zzgy) (obj)).zzrj != null)
	//*  67  133:aload_1         
	//*  68  134:getfield        #44  <Field zzfw zzrj>
	//*  69  137:ifnull          154
			return ((zzgy) (obj)).zzrj.isEmpty();
	//   70  140:aload_1         
	//   71  141:getfield        #44  <Field zzfw zzrj>
	//   72  144:invokevirtual   #93  <Method boolean zzfw.isEmpty()>
	//   73  147:ifeq            152
	//   74  150:iconst_1        
	//   75  151:ireturn         
	//   76  152:iconst_0        
	//   77  153:ireturn         
		else
			return true;
	//   78  154:iconst_1        
	//   79  155:ireturn         
	}

	public final int hashCode()
	{
		int j = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #109 <Method String Class.getName()>
	//    3    7:invokevirtual   #113 <Method int String.hashCode()>
	//    4   10:istore_2        
		int k = zzfy.hashCode(((Object []) (zzbiw)));
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field String[] zzbiw>
	//    7   15:invokestatic    #116 <Method int zzfy.hashCode(Object[])>
	//    8   18:istore_3        
		int l = zzfy.hashCode(((Object []) (zzbix)));
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field String[] zzbix>
	//   11   23:invokestatic    #116 <Method int zzfy.hashCode(Object[])>
	//   12   26:istore          4
		int i1 = zzfy.hashCode(zzbiy);
	//   13   28:aload_0         
	//   14   29:getfield        #33  <Field int[] zzbiy>
	//   15   32:invokestatic    #119 <Method int zzfy.hashCode(int[])>
	//   16   35:istore          5
		int j1 = zzfy.hashCode(zzbiz);
	//   17   37:aload_0         
	//   18   38:getfield        #38  <Field long[] zzbiz>
	//   19   41:invokestatic    #122 <Method int zzfy.hashCode(long[])>
	//   20   44:istore          6
		int k1 = zzfy.hashCode(zzbja);
	//   21   46:aload_0         
	//   22   47:getfield        #40  <Field long[] zzbja>
	//   23   50:invokestatic    #122 <Method int zzfy.hashCode(long[])>
	//   24   53:istore          7
		int i;
		if(zzrj != null && !zzrj.isEmpty())
	//*  25   55:aload_0         
	//*  26   56:getfield        #44  <Field zzfw zzrj>
	//*  27   59:ifnull          86
	//*  28   62:aload_0         
	//*  29   63:getfield        #44  <Field zzfw zzrj>
	//*  30   66:invokevirtual   #93  <Method boolean zzfw.isEmpty()>
	//*  31   69:ifeq            75
	//*  32   72:goto            86
			i = zzrj.hashCode();
	//   33   75:aload_0         
	//   34   76:getfield        #44  <Field zzfw zzrj>
	//   35   79:invokevirtual   #123 <Method int zzfw.hashCode()>
	//   36   82:istore_1        
		else
	//*  37   83:goto            88
			i = 0;
	//   38   86:iconst_0        
	//   39   87:istore_1        
		return ((((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + i;
	//   40   88:iload_2         
	//   41   89:sipush          527
	//   42   92:iadd            
	//   43   93:bipush          31
	//   44   95:imul            
	//   45   96:iload_3         
	//   46   97:iadd            
	//   47   98:bipush          31
	//   48  100:imul            
	//   49  101:iload           4
	//   50  103:iadd            
	//   51  104:bipush          31
	//   52  106:imul            
	//   53  107:iload           5
	//   54  109:iadd            
	//   55  110:bipush          31
	//   56  112:imul            
	//   57  113:iload           6
	//   58  115:iadd            
	//   59  116:bipush          31
	//   60  118:imul            
	//   61  119:iload           7
	//   62  121:iadd            
	//   63  122:bipush          31
	//   64  124:imul            
	//   65  125:iload_1         
	//   66  126:iadd            
	//   67  127:ireturn         
	}

	public final void zza(zzfs zzfs1)
		throws IOException
	{
		Object aobj[] = ((Object []) (zzbiw));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String[] zzbiw>
	//    2    4:astore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(aobj != null && aobj.length > 0)
	//*   5    8:aload           4
	//*   6   10:ifnull          59
	//*   7   13:aload           4
	//*   8   15:arraylength     
	//*   9   16:ifle            59
		{
			int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
			do
			{
				aobj = ((Object []) (zzbiw));
	//   12   21:aload_0         
	//   13   22:getfield        #26  <Field String[] zzbiw>
	//   14   25:astore          4
				if(i >= aobj.length)
					break;
	//   15   27:iload_2         
	//   16   28:aload           4
	//   17   30:arraylength     
	//   18   31:icmpge          59
				String s = aobj[i];
	//   19   34:aload           4
	//   20   36:iload_2         
	//   21   37:aaload          
	//   22   38:astore          4
				if(s != null)
	//*  23   40:aload           4
	//*  24   42:ifnull          52
					zzfs1.zza(1, s);
	//   25   45:aload_1         
	//   26   46:iconst_1        
	//   27   47:aload           4
	//   28   49:invokevirtual   #132 <Method void zzfs.zza(int, String)>
				i++;
	//   29   52:iload_2         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_2        
			} while(true);
	//   33   56:goto            21
		}
		s = ((String) (zzbix));
	//   34   59:aload_0         
	//   35   60:getfield        #28  <Field String[] zzbix>
	//   36   63:astore          4
		if(s != null && s.length > 0)
	//*  37   65:aload           4
	//*  38   67:ifnull          116
	//*  39   70:aload           4
	//*  40   72:arraylength     
	//*  41   73:ifle            116
		{
			int j = 0;
	//   42   76:iconst_0        
	//   43   77:istore_2        
			do
			{
				s = ((String) (zzbix));
	//   44   78:aload_0         
	//   45   79:getfield        #28  <Field String[] zzbix>
	//   46   82:astore          4
				if(j >= s.length)
					break;
	//   47   84:iload_2         
	//   48   85:aload           4
	//   49   87:arraylength     
	//   50   88:icmpge          116
				String s1 = s[j];
	//   51   91:aload           4
	//   52   93:iload_2         
	//   53   94:aaload          
	//   54   95:astore          4
				if(s1 != null)
	//*  55   97:aload           4
	//*  56   99:ifnull          109
					zzfs1.zza(2, s1);
	//   57  102:aload_1         
	//   58  103:iconst_2        
	//   59  104:aload           4
	//   60  106:invokevirtual   #132 <Method void zzfs.zza(int, String)>
				j++;
	//   61  109:iload_2         
	//   62  110:iconst_1        
	//   63  111:iadd            
	//   64  112:istore_2        
			} while(true);
	//   65  113:goto            78
		}
		s1 = ((String) (zzbiy));
	//   66  116:aload_0         
	//   67  117:getfield        #33  <Field int[] zzbiy>
	//   68  120:astore          4
		if(s1 != null && s1.length > 0)
	//*  69  122:aload           4
	//*  70  124:ifnull          164
	//*  71  127:aload           4
	//*  72  129:arraylength     
	//*  73  130:ifle            164
		{
			int k = 0;
	//   74  133:iconst_0        
	//   75  134:istore_2        
			do
			{
				s1 = ((String) (zzbiy));
	//   76  135:aload_0         
	//   77  136:getfield        #33  <Field int[] zzbiy>
	//   78  139:astore          4
				if(k >= s1.length)
					break;
	//   79  141:iload_2         
	//   80  142:aload           4
	//   81  144:arraylength     
	//   82  145:icmpge          164
				zzfs1.zzc(3, s1[k]);
	//   83  148:aload_1         
	//   84  149:iconst_3        
	//   85  150:aload           4
	//   86  152:iload_2         
	//   87  153:iaload          
	//   88  154:invokevirtual   #136 <Method void zzfs.zzc(int, int)>
				k++;
	//   89  157:iload_2         
	//   90  158:iconst_1        
	//   91  159:iadd            
	//   92  160:istore_2        
			} while(true);
	//   93  161:goto            135
		}
		s1 = ((String) (zzbiz));
	//   94  164:aload_0         
	//   95  165:getfield        #38  <Field long[] zzbiz>
	//   96  168:astore          4
		if(s1 != null && s1.length > 0)
	//*  97  170:aload           4
	//*  98  172:ifnull          212
	//*  99  175:aload           4
	//* 100  177:arraylength     
	//* 101  178:ifle            212
		{
			int l = 0;
	//  102  181:iconst_0        
	//  103  182:istore_2        
			do
			{
				s1 = ((String) (zzbiz));
	//  104  183:aload_0         
	//  105  184:getfield        #38  <Field long[] zzbiz>
	//  106  187:astore          4
				if(l >= s1.length)
					break;
	//  107  189:iload_2         
	//  108  190:aload           4
	//  109  192:arraylength     
	//  110  193:icmpge          212
				zzfs1.zzi(4, s1[l]);
	//  111  196:aload_1         
	//  112  197:iconst_4        
	//  113  198:aload           4
	//  114  200:iload_2         
	//  115  201:laload          
	//  116  202:invokevirtual   #140 <Method void zzfs.zzi(int, long)>
				l++;
	//  117  205:iload_2         
	//  118  206:iconst_1        
	//  119  207:iadd            
	//  120  208:istore_2        
			} while(true);
	//  121  209:goto            183
		}
		s1 = ((String) (zzbja));
	//  122  212:aload_0         
	//  123  213:getfield        #40  <Field long[] zzbja>
	//  124  216:astore          4
		if(s1 != null && s1.length > 0)
	//* 125  218:aload           4
	//* 126  220:ifnull          260
	//* 127  223:aload           4
	//* 128  225:arraylength     
	//* 129  226:ifle            260
		{
			int i1 = ((int) (flag));
	//  130  229:iload_3         
	//  131  230:istore_2        
			do
			{
				long al[] = zzbja;
	//  132  231:aload_0         
	//  133  232:getfield        #40  <Field long[] zzbja>
	//  134  235:astore          4
				if(i1 >= al.length)
					break;
	//  135  237:iload_2         
	//  136  238:aload           4
	//  137  240:arraylength     
	//  138  241:icmpge          260
				zzfs1.zzi(5, al[i1]);
	//  139  244:aload_1         
	//  140  245:iconst_5        
	//  141  246:aload           4
	//  142  248:iload_2         
	//  143  249:laload          
	//  144  250:invokevirtual   #140 <Method void zzfs.zzi(int, long)>
				i1++;
	//  145  253:iload_2         
	//  146  254:iconst_1        
	//  147  255:iadd            
	//  148  256:istore_2        
			} while(true);
	//  149  257:goto            231
		}
		super.zza(zzfs1);
	//  150  260:aload_0         
	//  151  261:aload_1         
	//  152  262:invokespecial   #142 <Method void zzfu.zza(zzfs)>
	//  153  265:return          
	}

	protected final int zzen()
	{
		int i3 = super.zzen();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method int zzfu.zzen()>
	//    2    4:istore          6
		Object aobj[] = ((Object []) (zzbiw));
	//    3    6:aload_0         
	//    4    7:getfield        #26  <Field String[] zzbiw>
	//    5   10:astore          8
		boolean flag2 = false;
	//    6   12:iconst_0        
	//    7   13:istore          7
		int i = i3;
	//    8   15:iload           6
	//    9   17:istore_1        
		if(aobj != null)
	//*  10   18:aload           8
	//*  11   20:ifnull          111
		{
			i = i3;
	//   12   23:iload           6
	//   13   25:istore_1        
			if(aobj.length > 0)
	//*  14   26:aload           8
	//*  15   28:arraylength     
	//*  16   29:ifle            111
			{
				boolean flag = false;
	//   17   32:iconst_0        
	//   18   33:istore          4
				i = ((int) (flag));
	//   19   35:iload           4
	//   20   37:istore_1        
				int l = i;
	//   21   38:iload_1         
	//   22   39:istore_3        
				int j = i;
	//   23   40:iload_1         
	//   24   41:istore_2        
				i = ((int) (flag));
	//   25   42:iload           4
	//   26   44:istore_1        
				do
				{
					aobj = ((Object []) (zzbiw));
	//   27   45:aload_0         
	//   28   46:getfield        #26  <Field String[] zzbiw>
	//   29   49:astore          8
					if(i >= aobj.length)
						break;
	//   30   51:iload_1         
	//   31   52:aload           8
	//   32   54:arraylength     
	//   33   55:icmpge          102
					String s = aobj[i];
	//   34   58:aload           8
	//   35   60:iload_1         
	//   36   61:aaload          
	//   37   62:astore          8
					int k2 = j;
	//   38   64:iload_2         
	//   39   65:istore          5
					int i2 = l;
	//   40   67:iload_3         
	//   41   68:istore          4
					if(s != null)
	//*  42   70:aload           8
	//*  43   72:ifnull          89
					{
						i2 = l + 1;
	//   44   75:iload_3         
	//   45   76:iconst_1        
	//   46   77:iadd            
	//   47   78:istore          4
						k2 = j + zzfs.zzh(s);
	//   48   80:iload_2         
	//   49   81:aload           8
	//   50   83:invokestatic    #149 <Method int zzfs.zzh(String)>
	//   51   86:iadd            
	//   52   87:istore          5
					}
					i++;
	//   53   89:iload_1         
	//   54   90:iconst_1        
	//   55   91:iadd            
	//   56   92:istore_1        
					j = k2;
	//   57   93:iload           5
	//   58   95:istore_2        
					l = i2;
	//   59   96:iload           4
	//   60   98:istore_3        
				} while(true);
	//   61   99:goto            45
				i = i3 + j + l * 1;
	//   62  102:iload           6
	//   63  104:iload_2         
	//   64  105:iadd            
	//   65  106:iload_3         
	//   66  107:iconst_1        
	//   67  108:imul            
	//   68  109:iadd            
	//   69  110:istore_1        
			}
		}
		s = ((String) (zzbix));
	//   70  111:aload_0         
	//   71  112:getfield        #28  <Field String[] zzbix>
	//   72  115:astore          8
		int k = i;
	//   73  117:iload_1         
	//   74  118:istore_2        
		if(s != null)
	//*  75  119:aload           8
	//*  76  121:ifnull          215
		{
			k = i;
	//   77  124:iload_1         
	//   78  125:istore_2        
			if(s.length > 0)
	//*  79  126:aload           8
	//*  80  128:arraylength     
	//*  81  129:ifle            215
			{
				boolean flag1 = false;
	//   82  132:iconst_0        
	//   83  133:istore          5
				k = ((int) (flag1));
	//   84  135:iload           5
	//   85  137:istore_2        
				int j2 = k;
	//   86  138:iload_2         
	//   87  139:istore          4
				int i1 = k;
	//   88  141:iload_2         
	//   89  142:istore_3        
				k = ((int) (flag1));
	//   90  143:iload           5
	//   91  145:istore_2        
				do
				{
					s = ((String) (zzbix));
	//   92  146:aload_0         
	//   93  147:getfield        #28  <Field String[] zzbix>
	//   94  150:astore          8
					if(k >= s.length)
						break;
	//   95  152:iload_2         
	//   96  153:aload           8
	//   97  155:arraylength     
	//   98  156:icmpge          206
					String s1 = s[k];
	//   99  159:aload           8
	//  100  161:iload_2         
	//  101  162:aaload          
	//  102  163:astore          8
					int j3 = i1;
	//  103  165:iload_3         
	//  104  166:istore          6
					int l2 = j2;
	//  105  168:iload           4
	//  106  170:istore          5
					if(s1 != null)
	//* 107  172:aload           8
	//* 108  174:ifnull          192
					{
						l2 = j2 + 1;
	//  109  177:iload           4
	//  110  179:iconst_1        
	//  111  180:iadd            
	//  112  181:istore          5
						j3 = i1 + zzfs.zzh(s1);
	//  113  183:iload_3         
	//  114  184:aload           8
	//  115  186:invokestatic    #149 <Method int zzfs.zzh(String)>
	//  116  189:iadd            
	//  117  190:istore          6
					}
					k++;
	//  118  192:iload_2         
	//  119  193:iconst_1        
	//  120  194:iadd            
	//  121  195:istore_2        
					i1 = j3;
	//  122  196:iload           6
	//  123  198:istore_3        
					j2 = l2;
	//  124  199:iload           5
	//  125  201:istore          4
				} while(true);
	//  126  203:goto            146
				k = i + i1 + j2 * 1;
	//  127  206:iload_1         
	//  128  207:iload_3         
	//  129  208:iadd            
	//  130  209:iload           4
	//  131  211:iconst_1        
	//  132  212:imul            
	//  133  213:iadd            
	//  134  214:istore_2        
			}
		}
		s1 = ((String) (zzbiy));
	//  135  215:aload_0         
	//  136  216:getfield        #33  <Field int[] zzbiy>
	//  137  219:astore          8
		i = k;
	//  138  221:iload_2         
	//  139  222:istore_1        
		if(s1 != null)
	//* 140  223:aload           8
	//* 141  225:ifnull          280
		{
			i = k;
	//  142  228:iload_2         
	//  143  229:istore_1        
			if(s1.length > 0)
	//* 144  230:aload           8
	//* 145  232:arraylength     
	//* 146  233:ifle            280
			{
				i = 0;
	//  147  236:iconst_0        
	//  148  237:istore_1        
				int j1 = i;
	//  149  238:iload_1         
	//  150  239:istore_3        
				do
				{
					s1 = ((String) (zzbiy));
	//  151  240:aload_0         
	//  152  241:getfield        #33  <Field int[] zzbiy>
	//  153  244:astore          8
					if(i >= s1.length)
						break;
	//  154  246:iload_1         
	//  155  247:aload           8
	//  156  249:arraylength     
	//  157  250:icmpge          270
					j1 += zzfs.zzs(s1[i]);
	//  158  253:iload_3         
	//  159  254:aload           8
	//  160  256:iload_1         
	//  161  257:iaload          
	//  162  258:invokestatic    #153 <Method int zzfs.zzs(int)>
	//  163  261:iadd            
	//  164  262:istore_3        
					i++;
	//  165  263:iload_1         
	//  166  264:iconst_1        
	//  167  265:iadd            
	//  168  266:istore_1        
				} while(true);
	//  169  267:goto            240
				i = k + j1 + s1.length * 1;
	//  170  270:iload_2         
	//  171  271:iload_3         
	//  172  272:iadd            
	//  173  273:aload           8
	//  174  275:arraylength     
	//  175  276:iconst_1        
	//  176  277:imul            
	//  177  278:iadd            
	//  178  279:istore_1        
			}
		}
		s1 = ((String) (zzbiz));
	//  179  280:aload_0         
	//  180  281:getfield        #38  <Field long[] zzbiz>
	//  181  284:astore          8
		k = i;
	//  182  286:iload_1         
	//  183  287:istore_2        
		if(s1 != null)
	//* 184  288:aload           8
	//* 185  290:ifnull          345
		{
			k = i;
	//  186  293:iload_1         
	//  187  294:istore_2        
			if(s1.length > 0)
	//* 188  295:aload           8
	//* 189  297:arraylength     
	//* 190  298:ifle            345
			{
				k = 0;
	//  191  301:iconst_0        
	//  192  302:istore_2        
				int k1 = k;
	//  193  303:iload_2         
	//  194  304:istore_3        
				do
				{
					s1 = ((String) (zzbiz));
	//  195  305:aload_0         
	//  196  306:getfield        #38  <Field long[] zzbiz>
	//  197  309:astore          8
					if(k >= s1.length)
						break;
	//  198  311:iload_2         
	//  199  312:aload           8
	//  200  314:arraylength     
	//  201  315:icmpge          335
					k1 += zzfs.zzo(s1[k]);
	//  202  318:iload_3         
	//  203  319:aload           8
	//  204  321:iload_2         
	//  205  322:laload          
	//  206  323:invokestatic    #157 <Method int zzfs.zzo(long)>
	//  207  326:iadd            
	//  208  327:istore_3        
					k++;
	//  209  328:iload_2         
	//  210  329:iconst_1        
	//  211  330:iadd            
	//  212  331:istore_2        
				} while(true);
	//  213  332:goto            305
				k = i + k1 + s1.length * 1;
	//  214  335:iload_1         
	//  215  336:iload_3         
	//  216  337:iadd            
	//  217  338:aload           8
	//  218  340:arraylength     
	//  219  341:iconst_1        
	//  220  342:imul            
	//  221  343:iadd            
	//  222  344:istore_2        
			}
		}
		s1 = ((String) (zzbja));
	//  223  345:aload_0         
	//  224  346:getfield        #40  <Field long[] zzbja>
	//  225  349:astore          8
		i = k;
	//  226  351:iload_2         
	//  227  352:istore_1        
		if(s1 != null)
	//* 228  353:aload           8
	//* 229  355:ifnull          411
		{
			i = k;
	//  230  358:iload_2         
	//  231  359:istore_1        
			if(s1.length > 0)
	//* 232  360:aload           8
	//* 233  362:arraylength     
	//* 234  363:ifle            411
			{
				int l1 = 0;
	//  235  366:iconst_0        
	//  236  367:istore_3        
				i = ((int) (flag2));
	//  237  368:iload           7
	//  238  370:istore_1        
				long al[];
				do
				{
					al = zzbja;
	//  239  371:aload_0         
	//  240  372:getfield        #40  <Field long[] zzbja>
	//  241  375:astore          8
					if(i >= al.length)
						break;
	//  242  377:iload_1         
	//  243  378:aload           8
	//  244  380:arraylength     
	//  245  381:icmpge          401
					l1 += zzfs.zzo(al[i]);
	//  246  384:iload_3         
	//  247  385:aload           8
	//  248  387:iload_1         
	//  249  388:laload          
	//  250  389:invokestatic    #157 <Method int zzfs.zzo(long)>
	//  251  392:iadd            
	//  252  393:istore_3        
					i++;
	//  253  394:iload_1         
	//  254  395:iconst_1        
	//  255  396:iadd            
	//  256  397:istore_1        
				} while(true);
	//  257  398:goto            371
				i = k + l1 + al.length * 1;
	//  258  401:iload_2         
	//  259  402:iload_3         
	//  260  403:iadd            
	//  261  404:aload           8
	//  262  406:arraylength     
	//  263  407:iconst_1        
	//  264  408:imul            
	//  265  409:iadd            
	//  266  410:istore_1        
			}
		}
		return i;
	//  267  411:iload_1         
	//  268  412:ireturn         
	}

	public final zzfu zzeo()
		throws CloneNotSupportedException
	{
		return ((zzfu) ((zzgy)((zzfz)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method Object zzfz.clone()>
	//    2    4:checkcast       #2   <Class zzgy>
	//    3    7:areturn         
	}

	public final zzfz zzep()
		throws CloneNotSupportedException
	{
		return ((zzfz) ((zzgy)((zzfz)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method Object zzfz.clone()>
	//    2    4:checkcast       #2   <Class zzgy>
	//    3    7:areturn         
	}

	private String zzbiw[];
	private String zzbix[];
	private int zzbiy[];
	private long zzbiz[];
	private long zzbja[];
}
