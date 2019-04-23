// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			awh, awp, aws, awg, 
//			awo, awk

final class awm
	implements Cloneable
{

	awm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		c = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field List c>
	//    7   15:return          
	}

	private final byte[] b()
	{
		byte abyte0[] = new byte[a()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method int a()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		a(awh.a(abyte0));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #31  <Method awh awh.a(byte[])>
	//    7   12:invokevirtual   #34  <Method void a(awh)>
		return abyte0;
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	private final awm c()
	{
		awm awm1 = new awm();
	//    0    0:new             #2   <Class awm>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void awm()>
	//    3    7:astore          4
		awm1.a = a;
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field awk a>
	//    7   15:putfield        #40  <Field awk a>
		if(c == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #21  <Field List c>
	//*  10   22:ifnonnull       34
		{
			awm1.c = null;
	//   11   25:aload           4
	//   12   27:aconst_null     
	//   13   28:putfield        #21  <Field List c>
			break MISSING_BLOCK_LABEL_49;
	//   14   31:goto            49
		}
		awm1.c.addAll(((java.util.Collection) (c)));
	//   15   34:aload           4
	//   16   36:getfield        #21  <Field List c>
	//   17   39:aload_0         
	//   18   40:getfield        #21  <Field List c>
	//   19   43:invokeinterface #46  <Method boolean List.addAll(java.util.Collection)>
	//   20   48:pop             
		if(b == null) goto _L2; else goto _L1
	//   21   49:aload_0         
	//   22   50:getfield        #48  <Field Object b>
	//   23   53:ifnull          387
_L1:
		if(!(b instanceof awp)) goto _L4; else goto _L3
	//   24   56:aload_0         
	//   25   57:getfield        #48  <Field Object b>
	//   26   60:instanceof      #50  <Class awp>
	//   27   63:ifeq            87
_L3:
		awm1.b = ((Object) ((awp)((awp)b).clone()));
	//   28   66:aload           4
	//   29   68:aload_0         
	//   30   69:getfield        #48  <Field Object b>
	//   31   72:checkcast       #50  <Class awp>
	//   32   75:invokevirtual   #54  <Method Object awp.clone()>
	//   33   78:checkcast       #50  <Class awp>
	//   34   81:putfield        #48  <Field Object b>
		return awm1;
	//   35   84:aload           4
	//   36   86:areturn         
_L4:
		if(!(b instanceof byte[]))
			break MISSING_BLOCK_LABEL_115;
	//   37   87:aload_0         
	//   38   88:getfield        #48  <Field Object b>
	//   39   91:instanceof      #56  <Class byte[]>
	//   40   94:ifeq            115
		awm1.b = ((byte []) ((byte[])b)).clone();
	//   41   97:aload           4
	//   42   99:aload_0         
	//   43  100:getfield        #48  <Field Object b>
	//   44  103:checkcast       #56  <Class byte[]>
	//   45  106:invokevirtual   #57  <Method Object _5B_B.clone()>
	//   46  109:putfield        #48  <Field Object b>
		return awm1;
	//   47  112:aload           4
	//   48  114:areturn         
		int i;
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj1;
		try
		{
			flag1 = b instanceof byte[][];
	//   49  115:aload_0         
	//   50  116:getfield        #48  <Field Object b>
	//   51  119:instanceof      #59  <Class byte[][]>
	//   52  122:istore_3        
		}
	//*  53  123:iconst_0        
	//*  54  124:istore_2        
	//*  55  125:iconst_0        
	//*  56  126:istore_1        
	//*  57  127:iload_3         
	//*  58  128:ifeq            183
	//*  59  131:aload_0         
	//*  60  132:getfield        #48  <Field Object b>
	//*  61  135:checkcast       #59  <Class byte[][]>
	//*  62  138:astore          5
	//*  63  140:aload           5
	//*  64  142:arraylength     
	//*  65  143:anewarray       byte[][]
	//*  66  146:astore          6
	//*  67  148:aload           4
	//*  68  150:aload           6
	//*  69  152:putfield        #48  <Field Object b>
	//*  70  155:iload_1         
	//*  71  156:aload           5
	//*  72  158:arraylength     
	//*  73  159:icmpge          387
	//*  74  162:aload           6
	//*  75  164:iload_1         
	//*  76  165:aload           5
	//*  77  167:iload_1         
	//*  78  168:aaload          
	//*  79  169:invokevirtual   #57  <Method Object _5B_B.clone()>
	//*  80  172:checkcast       #56  <Class byte[]>
	//*  81  175:aastore         
	//*  82  176:iload_1         
	//*  83  177:iconst_1        
	//*  84  178:iadd            
	//*  85  179:istore_1        
	//*  86  180:goto            155
	//*  87  183:aload_0         
	//*  88  184:getfield        #48  <Field Object b>
	//*  89  187:instanceof      #61  <Class boolean[]>
	//*  90  190:ifeq            211
	//*  91  193:aload           4
	//*  92  195:aload_0         
	//*  93  196:getfield        #48  <Field Object b>
	//*  94  199:checkcast       #61  <Class boolean[]>
	//*  95  202:invokevirtual   #62  <Method Object _5B_Z.clone()>
	//*  96  205:putfield        #48  <Field Object b>
	//*  97  208:aload           4
	//*  98  210:areturn         
	//*  99  211:aload_0         
	//* 100  212:getfield        #48  <Field Object b>
	//* 101  215:instanceof      #64  <Class int[]>
	//* 102  218:ifeq            239
	//* 103  221:aload           4
	//* 104  223:aload_0         
	//* 105  224:getfield        #48  <Field Object b>
	//* 106  227:checkcast       #64  <Class int[]>
	//* 107  230:invokevirtual   #65  <Method Object _5B_I.clone()>
	//* 108  233:putfield        #48  <Field Object b>
	//* 109  236:aload           4
	//* 110  238:areturn         
	//* 111  239:aload_0         
	//* 112  240:getfield        #48  <Field Object b>
	//* 113  243:instanceof      #67  <Class long[]>
	//* 114  246:ifeq            267
	//* 115  249:aload           4
	//* 116  251:aload_0         
	//* 117  252:getfield        #48  <Field Object b>
	//* 118  255:checkcast       #67  <Class long[]>
	//* 119  258:invokevirtual   #68  <Method Object _5B_J.clone()>
	//* 120  261:putfield        #48  <Field Object b>
	//* 121  264:aload           4
	//* 122  266:areturn         
	//* 123  267:aload_0         
	//* 124  268:getfield        #48  <Field Object b>
	//* 125  271:instanceof      #70  <Class float[]>
	//* 126  274:ifeq            295
	//* 127  277:aload           4
	//* 128  279:aload_0         
	//* 129  280:getfield        #48  <Field Object b>
	//* 130  283:checkcast       #70  <Class float[]>
	//* 131  286:invokevirtual   #71  <Method Object _5B_F.clone()>
	//* 132  289:putfield        #48  <Field Object b>
	//* 133  292:aload           4
	//* 134  294:areturn         
	//* 135  295:aload_0         
	//* 136  296:getfield        #48  <Field Object b>
	//* 137  299:instanceof      #73  <Class double[]>
	//* 138  302:ifeq            323
	//* 139  305:aload           4
	//* 140  307:aload_0         
	//* 141  308:getfield        #48  <Field Object b>
	//* 142  311:checkcast       #73  <Class double[]>
	//* 143  314:invokevirtual   #74  <Method Object _5B_D.clone()>
	//* 144  317:putfield        #48  <Field Object b>
	//* 145  320:aload           4
	//* 146  322:areturn         
	//* 147  323:aload_0         
	//* 148  324:getfield        #48  <Field Object b>
	//* 149  327:instanceof      #76  <Class awp[]>
	//* 150  330:ifeq            387
	//* 151  333:aload_0         
	//* 152  334:getfield        #48  <Field Object b>
	//* 153  337:checkcast       #76  <Class awp[]>
	//* 154  340:astore          5
	//* 155  342:aload           5
	//* 156  344:arraylength     
	//* 157  345:anewarray       awp[]
	//* 158  348:astore          6
	//* 159  350:aload           4
	//* 160  352:aload           6
	//* 161  354:putfield        #48  <Field Object b>
	//* 162  357:iload_2         
	//* 163  358:istore_1        
	//* 164  359:iload_1         
	//* 165  360:aload           5
	//* 166  362:arraylength     
	//* 167  363:icmpge          387
	//* 168  366:aload           6
	//* 169  368:iload_1         
	//* 170  369:aload           5
	//* 171  371:iload_1         
	//* 172  372:aaload          
	//* 173  373:invokevirtual   #54  <Method Object awp.clone()>
	//* 174  376:checkcast       #50  <Class awp>
	//* 175  379:aastore         
	//* 176  380:iload_1         
	//* 177  381:iconst_1        
	//* 178  382:iadd            
	//* 179  383:istore_1        
	//* 180  384:goto            359
	//* 181  387:aload           4
	//* 182  389:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//* 183  390:astore          4
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//  184  392:new             #78  <Class AssertionError>
	//  185  395:dup             
	//  186  396:aload           4
	//  187  398:invokespecial   #81  <Method void AssertionError(Object)>
	//  188  401:athrow          
		}
		flag = false;
		i = 0;
		if(!flag1) goto _L6; else goto _L5
_L5:
		obj = ((Object) ((byte[][])b));
		obj1 = ((Object) (new byte[obj.length][]));
		awm1.b = obj1;
_L8:
		if(i >= obj.length) goto _L2; else goto _L7
_L7:
		obj1[i] = (byte[])((byte []) (obj[i])).clone();
		i++;
		  goto _L8
_L6:
		if(!(b instanceof boolean[]))
			break MISSING_BLOCK_LABEL_211;
		awm1.b = ((boolean []) ((boolean[])b)).clone();
		return awm1;
		if(!(b instanceof int[]))
			break MISSING_BLOCK_LABEL_239;
		awm1.b = ((int []) ((int[])b)).clone();
		return awm1;
		if(!(b instanceof long[]))
			break MISSING_BLOCK_LABEL_267;
		awm1.b = ((long []) ((long[])b)).clone();
		return awm1;
		if(!(b instanceof float[]))
			break MISSING_BLOCK_LABEL_295;
		awm1.b = ((float []) ((float[])b)).clone();
		return awm1;
		if(!(b instanceof double[]))
			break MISSING_BLOCK_LABEL_323;
		awm1.b = ((double []) ((double[])b)).clone();
		return awm1;
		if(!(b instanceof awp[])) goto _L2; else goto _L9
_L9:
		obj = ((Object) ((awp[])b));
		obj1 = ((Object) (new awp[obj.length]));
		awm1.b = obj1;
		i = ((int) (flag));
_L10:
		if(i >= obj.length)
			break; /* Loop/switch isn't completed */
		obj1[i] = (awp)obj[i].clone();
		i++;
		if(true) goto _L10; else goto _L2
_L2:
		return awm1;
	}

	final int a()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Object b>
	//*   2    4:ifnonnull       61
		{
			Iterator iterator = c.iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field List c>
	//    5   11:invokeinterface #85  <Method Iterator List.iterator()>
	//    6   16:astore_2        
			int i;
			aws aws1;
			for(i = 0; iterator.hasNext(); i += awh.d(aws1.a) + 0 + aws1.b.length)
	//*   7   17:iconst_0        
	//*   8   18:istore_1        
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            59
				aws1 = (aws)iterator.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #94  <Method Object Iterator.next()>
	//   14   34:checkcast       #96  <Class aws>
	//   15   37:astore_3        

	//   16   38:iload_1         
	//   17   39:aload_3         
	//   18   40:getfield        #99  <Field int aws.a>
	//   19   43:invokestatic    #103 <Method int awh.d(int)>
	//   20   46:iconst_0        
	//   21   47:iadd            
	//   22   48:aload_3         
	//   23   49:getfield        #105 <Field byte[] aws.b>
	//   24   52:arraylength     
	//   25   53:iadd            
	//   26   54:iadd            
	//   27   55:istore_1        
	//*  28   56:goto            19
			return i;
	//   29   59:iload_1         
	//   30   60:ireturn         
		} else
		{
			throw new NoSuchMethodError();
	//   31   61:new             #107 <Class NoSuchMethodError>
	//   32   64:dup             
	//   33   65:invokespecial   #108 <Method void NoSuchMethodError()>
	//   34   68:athrow          
		}
	}

	final void a(awh awh1)
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Object b>
	//*   2    4:ifnonnull       56
		{
			aws aws1;
			for(Iterator iterator = c.iterator(); iterator.hasNext(); awh1.c(aws1.b))
	//*   3    7:aload_0         
	//*   4    8:getfield        #21  <Field List c>
	//*   5   11:invokeinterface #85  <Method Iterator List.iterator()>
	//*   6   16:astore_2        
	//*   7   17:aload_2         
	//*   8   18:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//*   9   23:ifeq            55
			{
				aws1 = (aws)iterator.next();
	//   10   26:aload_2         
	//   11   27:invokeinterface #94  <Method Object Iterator.next()>
	//   12   32:checkcast       #96  <Class aws>
	//   13   35:astore_3        
				awh1.c(aws1.a);
	//   14   36:aload_1         
	//   15   37:aload_3         
	//   16   38:getfield        #99  <Field int aws.a>
	//   17   41:invokevirtual   #111 <Method void awh.c(int)>
			}

	//   18   44:aload_1         
	//   19   45:aload_3         
	//   20   46:getfield        #105 <Field byte[] aws.b>
	//   21   49:invokevirtual   #114 <Method void awh.c(byte[])>
	//*  22   52:goto            17
			return;
	//   23   55:return          
		} else
		{
			throw new NoSuchMethodError();
	//   24   56:new             #107 <Class NoSuchMethodError>
	//   25   59:dup             
	//   26   60:invokespecial   #108 <Method void NoSuchMethodError()>
	//   27   63:athrow          
		}
	}

	final void a(aws aws1)
	{
		Object obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List c>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
		{
			((List) (obj)).add(((Object) (aws1)));
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokeinterface #119 <Method boolean List.add(Object)>
	//    8   16:pop             
			return;
	//    9   17:return          
		}
		obj = b;
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field Object b>
	//   12   22:astore_3        
		if(obj instanceof awp)
	//*  13   23:aload_3         
	//*  14   24:instanceof      #50  <Class awp>
	//*  15   27:ifeq            94
		{
			aws1 = ((aws) (aws1.b));
	//   16   30:aload_1         
	//   17   31:getfield        #105 <Field byte[] aws.b>
	//   18   34:astore_1        
			obj = ((Object) (awg.a(((byte []) (aws1)), 0, aws1.length)));
	//   19   35:aload_1         
	//   20   36:iconst_0        
	//   21   37:aload_1         
	//   22   38:arraylength     
	//   23   39:invokestatic    #124 <Method awg awg.a(byte[], int, int)>
	//   24   42:astore_3        
			int i = ((awg) (obj)).g();
	//   25   43:aload_3         
	//   26   44:invokevirtual   #127 <Method int awg.g()>
	//   27   47:istore_2        
			if(i == aws1.length - awh.a(i))
	//*  28   48:iload_2         
	//*  29   49:aload_1         
	//*  30   50:arraylength     
	//*  31   51:iload_2         
	//*  32   52:invokestatic    #129 <Method int awh.a(int)>
	//*  33   55:isub            
	//*  34   56:icmpne          90
			{
				aws1 = ((aws) (((awp)b).a(((awg) (obj)))));
	//   35   59:aload_0         
	//   36   60:getfield        #48  <Field Object b>
	//   37   63:checkcast       #50  <Class awp>
	//   38   66:aload_3         
	//   39   67:invokevirtual   #132 <Method awp awp.a(awg)>
	//   40   70:astore_1        
				a = a;
	//   41   71:aload_0         
	//   42   72:aload_0         
	//   43   73:getfield        #40  <Field awk a>
	//   44   76:putfield        #40  <Field awk a>
				b = ((Object) (aws1));
	//   45   79:aload_0         
	//   46   80:aload_1         
	//   47   81:putfield        #48  <Field Object b>
				c = null;
	//   48   84:aload_0         
	//   49   85:aconst_null     
	//   50   86:putfield        #21  <Field List c>
				return;
	//   51   89:return          
			} else
			{
				throw awo.a();
	//   52   90:invokestatic    #137 <Method awo awo.a()>
	//   53   93:athrow          
			}
		}
		if(obj instanceof awp[])
	//*  54   94:aload_3         
	//*  55   95:instanceof      #76  <Class awp[]>
	//*  56   98:ifeq            114
		{
			Collections.singletonList(((Object) (aws1)));
	//   57  101:aload_1         
	//   58  102:invokestatic    #143 <Method List Collections.singletonList(Object)>
	//   59  105:pop             
			throw new NoSuchMethodError();
	//   60  106:new             #107 <Class NoSuchMethodError>
	//   61  109:dup             
	//   62  110:invokespecial   #108 <Method void NoSuchMethodError()>
	//   63  113:athrow          
		} else
		{
			Collections.singletonList(((Object) (aws1)));
	//   64  114:aload_1         
	//   65  115:invokestatic    #143 <Method List Collections.singletonList(Object)>
	//   66  118:pop             
			throw new NoSuchMethodError();
	//   67  119:new             #107 <Class NoSuchMethodError>
	//   68  122:dup             
	//   69  123:invokespecial   #108 <Method void NoSuchMethodError()>
	//   70  126:athrow          
		}
	}

	public final Object clone()
	{
		return ((Object) (c()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method awm c()>
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
		if(!(obj instanceof awm))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class awm>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((awm)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class awm>
	//   12   20:astore_1        
		if(b != null && ((awm) (obj)).b != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #48  <Field Object b>
	//*  15   25:ifnull          224
	//*  16   28:aload_1         
	//*  17   29:getfield        #48  <Field Object b>
	//*  18   32:ifnull          224
		{
			Object obj1 = ((Object) (a));
	//   19   35:aload_0         
	//   20   36:getfield        #40  <Field awk a>
	//   21   39:astore_3        
			if(obj1 != ((awm) (obj)).a)
	//*  22   40:aload_3         
	//*  23   41:aload_1         
	//*  24   42:getfield        #40  <Field awk a>
	//*  25   45:if_acmpeq       50
				return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
			if(!((awk) (obj1)).a.isArray())
	//*  28   50:aload_3         
	//*  29   51:getfield        #153 <Field Class awk.a>
	//*  30   54:invokevirtual   #158 <Method boolean Class.isArray()>
	//*  31   57:ifne            72
				return b.equals(((awm) (obj)).b);
	//   32   60:aload_0         
	//   33   61:getfield        #48  <Field Object b>
	//   34   64:aload_1         
	//   35   65:getfield        #48  <Field Object b>
	//   36   68:invokevirtual   #160 <Method boolean Object.equals(Object)>
	//   37   71:ireturn         
			obj1 = b;
	//   38   72:aload_0         
	//   39   73:getfield        #48  <Field Object b>
	//   40   76:astore_3        
			if(obj1 instanceof byte[])
	//*  41   77:aload_3         
	//*  42   78:instanceof      #56  <Class byte[]>
	//*  43   81:ifeq            99
				return Arrays.equals((byte[])obj1, (byte[])((awm) (obj)).b);
	//   44   84:aload_3         
	//   45   85:checkcast       #56  <Class byte[]>
	//   46   88:aload_1         
	//   47   89:getfield        #48  <Field Object b>
	//   48   92:checkcast       #56  <Class byte[]>
	//   49   95:invokestatic    #165 <Method boolean Arrays.equals(byte[], byte[])>
	//   50   98:ireturn         
			if(obj1 instanceof int[])
	//*  51   99:aload_3         
	//*  52  100:instanceof      #64  <Class int[]>
	//*  53  103:ifeq            121
				return Arrays.equals((int[])obj1, (int[])((awm) (obj)).b);
	//   54  106:aload_3         
	//   55  107:checkcast       #64  <Class int[]>
	//   56  110:aload_1         
	//   57  111:getfield        #48  <Field Object b>
	//   58  114:checkcast       #64  <Class int[]>
	//   59  117:invokestatic    #168 <Method boolean Arrays.equals(int[], int[])>
	//   60  120:ireturn         
			if(obj1 instanceof long[])
	//*  61  121:aload_3         
	//*  62  122:instanceof      #67  <Class long[]>
	//*  63  125:ifeq            143
				return Arrays.equals((long[])obj1, (long[])((awm) (obj)).b);
	//   64  128:aload_3         
	//   65  129:checkcast       #67  <Class long[]>
	//   66  132:aload_1         
	//   67  133:getfield        #48  <Field Object b>
	//   68  136:checkcast       #67  <Class long[]>
	//   69  139:invokestatic    #171 <Method boolean Arrays.equals(long[], long[])>
	//   70  142:ireturn         
			if(obj1 instanceof float[])
	//*  71  143:aload_3         
	//*  72  144:instanceof      #70  <Class float[]>
	//*  73  147:ifeq            165
				return Arrays.equals((float[])obj1, (float[])((awm) (obj)).b);
	//   74  150:aload_3         
	//   75  151:checkcast       #70  <Class float[]>
	//   76  154:aload_1         
	//   77  155:getfield        #48  <Field Object b>
	//   78  158:checkcast       #70  <Class float[]>
	//   79  161:invokestatic    #174 <Method boolean Arrays.equals(float[], float[])>
	//   80  164:ireturn         
			if(obj1 instanceof double[])
	//*  81  165:aload_3         
	//*  82  166:instanceof      #73  <Class double[]>
	//*  83  169:ifeq            187
				return Arrays.equals((double[])obj1, (double[])((awm) (obj)).b);
	//   84  172:aload_3         
	//   85  173:checkcast       #73  <Class double[]>
	//   86  176:aload_1         
	//   87  177:getfield        #48  <Field Object b>
	//   88  180:checkcast       #73  <Class double[]>
	//   89  183:invokestatic    #177 <Method boolean Arrays.equals(double[], double[])>
	//   90  186:ireturn         
			if(obj1 instanceof boolean[])
	//*  91  187:aload_3         
	//*  92  188:instanceof      #61  <Class boolean[]>
	//*  93  191:ifeq            209
				return Arrays.equals((boolean[])obj1, (boolean[])((awm) (obj)).b);
	//   94  194:aload_3         
	//   95  195:checkcast       #61  <Class boolean[]>
	//   96  198:aload_1         
	//   97  199:getfield        #48  <Field Object b>
	//   98  202:checkcast       #61  <Class boolean[]>
	//   99  205:invokestatic    #180 <Method boolean Arrays.equals(boolean[], boolean[])>
	//  100  208:ireturn         
			else
				return Arrays.deepEquals((Object[])obj1, (Object[])((awm) (obj)).b);
	//  101  209:aload_3         
	//  102  210:checkcast       #182 <Class Object[]>
	//  103  213:aload_1         
	//  104  214:getfield        #48  <Field Object b>
	//  105  217:checkcast       #182 <Class Object[]>
	//  106  220:invokestatic    #186 <Method boolean Arrays.deepEquals(Object[], Object[])>
	//  107  223:ireturn         
		}
		List list = c;
	//  108  224:aload_0         
	//  109  225:getfield        #21  <Field List c>
	//  110  228:astore_3        
		if(list != null)
	//* 111  229:aload_3         
	//* 112  230:ifnull          253
		{
			List list1 = ((awm) (obj)).c;
	//  113  233:aload_1         
	//  114  234:getfield        #21  <Field List c>
	//  115  237:astore          4
			if(list1 != null)
	//* 116  239:aload           4
	//* 117  241:ifnull          253
				return list.equals(((Object) (list1)));
	//  118  244:aload_3         
	//  119  245:aload           4
	//  120  247:invokeinterface #187 <Method boolean List.equals(Object)>
	//  121  252:ireturn         
		}
		boolean flag;
		try
		{
			flag = Arrays.equals(b(), ((awm) (obj)).b());
	//  122  253:aload_0         
	//  123  254:invokespecial   #189 <Method byte[] b()>
	//  124  257:aload_1         
	//  125  258:invokespecial   #189 <Method byte[] b()>
	//  126  261:invokestatic    #165 <Method boolean Arrays.equals(byte[], byte[])>
	//  127  264:istore_2        
		}
	//* 128  265:iload_2         
	//* 129  266:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 130  267:astore_1        
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//  131  268:new             #191 <Class IllegalStateException>
	//  132  271:dup             
	//  133  272:aload_1         
	//  134  273:invokespecial   #194 <Method void IllegalStateException(Throwable)>
	//  135  276:athrow          
		}
		return flag;
	}

	public final int hashCode()
	{
		int i;
		try
		{
			i = Arrays.hashCode(b());
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method byte[] b()>
	//    2    4:invokestatic    #198 <Method int Arrays.hashCode(byte[])>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:sipush          527
	//*   6   12:iadd            
	//*   7   13:ireturn         
		catch(IOException ioexception)
	//*   8   14:astore_2        
		{
			throw new IllegalStateException(((Throwable) (ioexception)));
	//    9   15:new             #191 <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #194 <Method void IllegalStateException(Throwable)>
	//   13   23:athrow          
		}
		return i + 527;
	}

	private awk a;
	private Object b;
	private List c;
}
