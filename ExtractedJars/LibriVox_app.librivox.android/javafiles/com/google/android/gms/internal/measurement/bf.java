// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			is, ip, iq, iu, 
//			iy

public final class bf extends is
{

	public bf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void is()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field Integer a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field Boolean b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field String c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field String d>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #26  <Field String e>
		L = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #30  <Field iu L>
		M = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #34  <Field int M>
	//   23   39:return          
	}

	private final bf b(ip ip1)
	{
_L2:
		int i;
		int j;
		i = ip1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method int ip.a()>
	//    2    4:istore_2        
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//    3    5:iload_2         
	//    4    6:ifeq            186
		if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          97
		{
			if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          83
			{
				if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          72
				{
					if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          61
					{
						if(i != 42)
	//*  17   33:iload_2         
	//*  18   34:bipush          42
	//*  19   36:icmpeq          50
						{
							if(!super.a(ip1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #46  <Method boolean is.a(ip, int)>
	//*  24   45:ifne            0
								return this;
	//   25   48:aload_0         
	//   26   49:areturn         
						} else
						{
							e = ip1.c();
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #49  <Method String ip.c()>
	//   30   55:putfield        #26  <Field String e>
						}
					} else
	//*  31   58:goto            0
					{
						d = ip1.c();
	//   32   61:aload_0         
	//   33   62:aload_1         
	//   34   63:invokevirtual   #49  <Method String ip.c()>
	//   35   66:putfield        #24  <Field String d>
					}
				} else
	//*  36   69:goto            0
				{
					c = ip1.c();
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:invokevirtual   #49  <Method String ip.c()>
	//   40   77:putfield        #22  <Field String c>
				}
			} else
	//*  41   80:goto            0
			{
				b = Boolean.valueOf(ip1.b());
	//   42   83:aload_0         
	//   43   84:aload_1         
	//   44   85:invokevirtual   #52  <Method boolean ip.b()>
	//   45   88:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   46   91:putfield        #20  <Field Boolean b>
			}
			continue; /* Loop/switch isn't completed */
	//   47   94:goto            0
		}
		j = ip1.i();
	//   48   97:aload_1         
	//   49   98:invokevirtual   #61  <Method int ip.i()>
	//   50  101:istore_3        
		int k = ip1.d();
	//   51  102:aload_1         
	//   52  103:invokevirtual   #63  <Method int ip.d()>
	//   53  106:istore          4
		if(k < 0 || k > 4)
			break MISSING_BLOCK_LABEL_131;
	//   54  108:iload           4
	//   55  110:iflt            131
	//   56  113:iload           4
	//   57  115:iconst_4        
	//   58  116:icmpgt          131
		a = Integer.valueOf(k);
	//   59  119:aload_0         
	//   60  120:iload           4
	//   61  122:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   62  125:putfield        #18  <Field Integer a>
		continue; /* Loop/switch isn't completed */
	//   63  128:goto            0
		try
		{
			StringBuilder stringbuilder = new StringBuilder(46);
	//   64  131:new             #70  <Class StringBuilder>
	//   65  134:dup             
	//   66  135:bipush          46
	//   67  137:invokespecial   #73  <Method void StringBuilder(int)>
	//   68  140:astore          5
			stringbuilder.append(k);
	//   69  142:aload           5
	//   70  144:iload           4
	//   71  146:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//   72  149:pop             
			stringbuilder.append(" is not a valid enum ComparisonType");
	//   73  150:aload           5
	//   74  152:ldc1            #79  <String " is not a valid enum ComparisonType">
	//   75  154:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   76  157:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   77  158:new             #38  <Class IllegalArgumentException>
	//   78  161:dup             
	//   79  162:aload           5
	//   80  164:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   81  167:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   82  170:athrow          
		}
	//*  83  171:aload_1         
	//*  84  172:iload_3         
	//*  85  173:invokevirtual   #90  <Method void ip.e(int)>
	//*  86  176:aload_0         
	//*  87  177:aload_1         
	//*  88  178:iload_2         
	//*  89  179:invokevirtual   #46  <Method boolean is.a(ip, int)>
	//*  90  182:pop             
	//*  91  183:goto            0
	//*  92  186:aload_0         
	//*  93  187:areturn         
		// Misplaced declaration of an exception variable
		catch(IllegalArgumentException illegalargumentexception)
		{
			ip1.e(j);
		}
		((is)this).a(ip1, i);
		if(true) goto _L2; else goto _L1
_L1:
		IllegalArgumentException illegalargumentexception;
		return this;
	//*  94  188:astore          5
	//*  95  190:goto            171
	}

	public final iy a(ip ip1)
	{
		return ((iy) (b(ip1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method bf b(ip)>
	//    3    5:areturn         
	}

	public final void a(iq iq1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Integer a>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			iq1.a(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #97  <Method int Integer.intValue()>
	//    9   15:invokevirtual   #102 <Method void iq.a(int, int)>
		obj = ((Object) (b));
	//   10   18:aload_0         
	//   11   19:getfield        #20  <Field Boolean b>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			iq1.a(2, ((Boolean) (obj)).booleanValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #105 <Method boolean Boolean.booleanValue()>
	//   19   33:invokevirtual   #108 <Method void iq.a(int, boolean)>
		obj = ((Object) (c));
	//   20   36:aload_0         
	//   21   37:getfield        #22  <Field String c>
	//   22   40:astore_2        
		if(obj != null)
	//*  23   41:aload_2         
	//*  24   42:ifnull          51
			iq1.a(3, ((String) (obj)));
	//   25   45:aload_1         
	//   26   46:iconst_3        
	//   27   47:aload_2         
	//   28   48:invokevirtual   #111 <Method void iq.a(int, String)>
		obj = ((Object) (d));
	//   29   51:aload_0         
	//   30   52:getfield        #24  <Field String d>
	//   31   55:astore_2        
		if(obj != null)
	//*  32   56:aload_2         
	//*  33   57:ifnull          66
			iq1.a(4, ((String) (obj)));
	//   34   60:aload_1         
	//   35   61:iconst_4        
	//   36   62:aload_2         
	//   37   63:invokevirtual   #111 <Method void iq.a(int, String)>
		obj = ((Object) (e));
	//   38   66:aload_0         
	//   39   67:getfield        #26  <Field String e>
	//   40   70:astore_2        
		if(obj != null)
	//*  41   71:aload_2         
	//*  42   72:ifnull          81
			iq1.a(5, ((String) (obj)));
	//   43   75:aload_1         
	//   44   76:iconst_5        
	//   45   77:aload_2         
	//   46   78:invokevirtual   #111 <Method void iq.a(int, String)>
		super.a(iq1);
	//   47   81:aload_0         
	//   48   82:aload_1         
	//   49   83:invokespecial   #113 <Method void is.a(iq)>
	//   50   86:return          
	}

	protected final int b()
	{
		int j = super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method int is.b()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Integer a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + iq.b(1, ((Integer) (obj)).intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #97  <Method int Integer.intValue()>
	//   14   22:invokestatic    #118 <Method int iq.b(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (b));
	//   17   27:aload_0         
	//   18   28:getfield        #20  <Field Boolean b>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          52
		{
			((Boolean) (obj)).booleanValue();
	//   24   38:aload_3         
	//   25   39:invokevirtual   #105 <Method boolean Boolean.booleanValue()>
	//   26   42:pop             
			j = i + (iq.b(2) + 1);
	//   27   43:iload_1         
	//   28   44:iconst_2        
	//   29   45:invokestatic    #121 <Method int iq.b(int)>
	//   30   48:iconst_1        
	//   31   49:iadd            
	//   32   50:iadd            
	//   33   51:istore_2        
		}
		obj = ((Object) (c));
	//   34   52:aload_0         
	//   35   53:getfield        #22  <Field String c>
	//   36   56:astore_3        
		i = j;
	//   37   57:iload_2         
	//   38   58:istore_1        
		if(obj != null)
	//*  39   59:aload_3         
	//*  40   60:ifnull          71
			i = j + iq.b(3, ((String) (obj)));
	//   41   63:iload_2         
	//   42   64:iconst_3        
	//   43   65:aload_3         
	//   44   66:invokestatic    #124 <Method int iq.b(int, String)>
	//   45   69:iadd            
	//   46   70:istore_1        
		obj = ((Object) (d));
	//   47   71:aload_0         
	//   48   72:getfield        #24  <Field String d>
	//   49   75:astore_3        
		j = i;
	//   50   76:iload_1         
	//   51   77:istore_2        
		if(obj != null)
	//*  52   78:aload_3         
	//*  53   79:ifnull          90
			j = i + iq.b(4, ((String) (obj)));
	//   54   82:iload_1         
	//   55   83:iconst_4        
	//   56   84:aload_3         
	//   57   85:invokestatic    #124 <Method int iq.b(int, String)>
	//   58   88:iadd            
	//   59   89:istore_2        
		obj = ((Object) (e));
	//   60   90:aload_0         
	//   61   91:getfield        #26  <Field String e>
	//   62   94:astore_3        
		i = j;
	//   63   95:iload_2         
	//   64   96:istore_1        
		if(obj != null)
	//*  65   97:aload_3         
	//*  66   98:ifnull          109
			i = j + iq.b(5, ((String) (obj)));
	//   67  101:iload_2         
	//   68  102:iconst_5        
	//   69  103:aload_3         
	//   70  104:invokestatic    #124 <Method int iq.b(int, String)>
	//   71  107:iadd            
	//   72  108:istore_1        
		return i;
	//   73  109:iload_1         
	//   74  110:ireturn         
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
		if(!(obj instanceof bf))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class bf>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((bf)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class bf>
	//   12   20:astore_1        
		Object obj1 = ((Object) (a));
	//   13   21:aload_0         
	//   14   22:getfield        #18  <Field Integer a>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((bf) (obj)).a != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #18  <Field Integer a>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((bf) (obj)).a))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #18  <Field Integer a>
	//*  26   44:invokevirtual   #128 <Method boolean Integer.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (b));
	//   30   52:aload_0         
	//   31   53:getfield        #20  <Field Boolean b>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((bf) (obj)).b != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #20  <Field Boolean b>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((Boolean) (obj1)).equals(((Object) (((bf) (obj)).b))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #20  <Field Boolean b>
	//*  43   75:invokevirtual   #129 <Method boolean Boolean.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		obj1 = ((Object) (c));
	//   47   83:aload_0         
	//   48   84:getfield        #22  <Field String c>
	//   49   87:astore_2        
		if(obj1 == null)
	//*  50   88:aload_2         
	//*  51   89:ifnonnull       101
		{
			if(((bf) (obj)).c != null)
	//*  52   92:aload_1         
	//*  53   93:getfield        #22  <Field String c>
	//*  54   96:ifnull          114
				return false;
	//   55   99:iconst_0        
	//   56  100:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((bf) (obj)).c))))
	//*  57  101:aload_2         
	//*  58  102:aload_1         
	//*  59  103:getfield        #22  <Field String c>
	//*  60  106:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  61  109:ifne            114
			return false;
	//   62  112:iconst_0        
	//   63  113:ireturn         
		obj1 = ((Object) (d));
	//   64  114:aload_0         
	//   65  115:getfield        #24  <Field String d>
	//   66  118:astore_2        
		if(obj1 == null)
	//*  67  119:aload_2         
	//*  68  120:ifnonnull       132
		{
			if(((bf) (obj)).d != null)
	//*  69  123:aload_1         
	//*  70  124:getfield        #24  <Field String d>
	//*  71  127:ifnull          145
				return false;
	//   72  130:iconst_0        
	//   73  131:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((bf) (obj)).d))))
	//*  74  132:aload_2         
	//*  75  133:aload_1         
	//*  76  134:getfield        #24  <Field String d>
	//*  77  137:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  78  140:ifne            145
			return false;
	//   79  143:iconst_0        
	//   80  144:ireturn         
		obj1 = ((Object) (e));
	//   81  145:aload_0         
	//   82  146:getfield        #26  <Field String e>
	//   83  149:astore_2        
		if(obj1 == null)
	//*  84  150:aload_2         
	//*  85  151:ifnonnull       163
		{
			if(((bf) (obj)).e != null)
	//*  86  154:aload_1         
	//*  87  155:getfield        #26  <Field String e>
	//*  88  158:ifnull          176
				return false;
	//   89  161:iconst_0        
	//   90  162:ireturn         
		} else
		if(!((String) (obj1)).equals(((Object) (((bf) (obj)).e))))
	//*  91  163:aload_2         
	//*  92  164:aload_1         
	//*  93  165:getfield        #26  <Field String e>
	//*  94  168:invokevirtual   #132 <Method boolean String.equals(Object)>
	//*  95  171:ifne            176
			return false;
	//   96  174:iconst_0        
	//   97  175:ireturn         
		if(L != null && !L.b())
	//*  98  176:aload_0         
	//*  99  177:getfield        #30  <Field iu L>
	//* 100  180:ifnull          208
	//* 101  183:aload_0         
	//* 102  184:getfield        #30  <Field iu L>
	//* 103  187:invokevirtual   #135 <Method boolean iu.b()>
	//* 104  190:ifeq            196
	//* 105  193:goto            208
			return L.equals(((Object) (((bf) (obj)).L)));
	//  106  196:aload_0         
	//  107  197:getfield        #30  <Field iu L>
	//  108  200:aload_1         
	//  109  201:getfield        #30  <Field iu L>
	//  110  204:invokevirtual   #136 <Method boolean iu.equals(Object)>
	//  111  207:ireturn         
		if(((bf) (obj)).L != null)
	//* 112  208:aload_1         
	//* 113  209:getfield        #30  <Field iu L>
	//* 114  212:ifnull          229
			return ((bf) (obj)).L.b();
	//  115  215:aload_1         
	//  116  216:getfield        #30  <Field iu L>
	//  117  219:invokevirtual   #135 <Method boolean iu.b()>
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
	//    1    1:invokevirtual   #143 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #148 <Method String Class.getName()>
	//    3    7:invokevirtual   #150 <Method int String.hashCode()>
	//    4   10:istore          8
		Object obj = ((Object) (a));
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field Integer a>
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
			i = ((Integer) (obj)).intValue();
	//   15   31:aload           9
	//   16   33:invokevirtual   #97  <Method int Integer.intValue()>
	//   17   36:istore_1        
		obj = ((Object) (b));
	//   18   37:aload_0         
	//   19   38:getfield        #20  <Field Boolean b>
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
			j = ((Boolean) (obj)).hashCode();
	//   26   53:aload           9
	//   27   55:invokevirtual   #151 <Method int Boolean.hashCode()>
	//   28   58:istore_2        
		obj = ((Object) (c));
	//   29   59:aload_0         
	//   30   60:getfield        #22  <Field String c>
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
			k = ((String) (obj)).hashCode();
	//   37   75:aload           9
	//   38   77:invokevirtual   #150 <Method int String.hashCode()>
	//   39   80:istore_3        
		obj = ((Object) (d));
	//   40   81:aload_0         
	//   41   82:getfield        #24  <Field String d>
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
			l = ((String) (obj)).hashCode();
	//   48   98:aload           9
	//   49  100:invokevirtual   #150 <Method int String.hashCode()>
	//   50  103:istore          4
		obj = ((Object) (e));
	//   51  105:aload_0         
	//   52  106:getfield        #26  <Field String e>
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
			i1 = ((String) (obj)).hashCode();
	//   59  122:aload           9
	//   60  124:invokevirtual   #150 <Method int String.hashCode()>
	//   61  127:istore          5
		int j1 = ((int) (flag));
	//   62  129:iload           7
	//   63  131:istore          6
		if(L != null)
	//*  64  133:aload_0         
	//*  65  134:getfield        #30  <Field iu L>
	//*  66  137:ifnull          166
			if(L.b())
	//*  67  140:aload_0         
	//*  68  141:getfield        #30  <Field iu L>
	//*  69  144:invokevirtual   #135 <Method boolean iu.b()>
	//*  70  147:ifeq            157
				j1 = ((int) (flag));
	//   71  150:iload           7
	//   72  152:istore          6
			else
	//*  73  154:goto            166
				j1 = L.hashCode();
	//   74  157:aload_0         
	//   75  158:getfield        #30  <Field iu L>
	//   76  161:invokevirtual   #152 <Method int iu.hashCode()>
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

	public Integer a;
	public Boolean b;
	public String c;
	public String d;
	public String e;
}
