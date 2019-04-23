// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzya, zzyi, zzyd, zzyk, 
//			zzxz, zzyh, zzvv, zzvw

final class zzyf
	implements Cloneable
{

	zzyf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzcfb = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List zzcfb>
	//    7   15:return          
	}

	private final byte[] toByteArray()
		throws IOException
	{
		byte abyte0[] = new byte[zzf()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int zzf()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		zza(zzya.zzo(abyte0));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #38  <Method zzya zzya.zzo(byte[])>
	//    7   12:invokevirtual   #42  <Method void zza(zzya)>
		return abyte0;
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	private final zzyf zzzc()
	{
		zzyf zzyf1 = new zzyf();
	//    0    0:new             #2   <Class zzyf>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void zzyf()>
	//    3    7:astore          4
		zzyf1.zzcfa = zzcfa;
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field zzyd zzcfa>
	//    7   15:putfield        #50  <Field zzyd zzcfa>
		if(zzcfb == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #23  <Field List zzcfb>
	//*  10   22:ifnonnull       34
		{
			zzyf1.zzcfb = null;
	//   11   25:aload           4
	//   12   27:aconst_null     
	//   13   28:putfield        #23  <Field List zzcfb>
			break MISSING_BLOCK_LABEL_49;
	//   14   31:goto            49
		}
		zzyf1.zzcfb.addAll(((java.util.Collection) (zzcfb)));
	//   15   34:aload           4
	//   16   36:getfield        #23  <Field List zzcfb>
	//   17   39:aload_0         
	//   18   40:getfield        #23  <Field List zzcfb>
	//   19   43:invokeinterface #56  <Method boolean List.addAll(java.util.Collection)>
	//   20   48:pop             
		if(value == null) goto _L2; else goto _L1
	//   21   49:aload_0         
	//   22   50:getfield        #58  <Field Object value>
	//   23   53:ifnull          387
_L1:
		if(!(value instanceof zzyi)) goto _L4; else goto _L3
	//   24   56:aload_0         
	//   25   57:getfield        #58  <Field Object value>
	//   26   60:instanceof      #60  <Class zzyi>
	//   27   63:ifeq            87
_L3:
		zzyf1.value = ((Object) ((zzyi)((zzyi)value).clone()));
	//   28   66:aload           4
	//   29   68:aload_0         
	//   30   69:getfield        #58  <Field Object value>
	//   31   72:checkcast       #60  <Class zzyi>
	//   32   75:invokevirtual   #64  <Method Object zzyi.clone()>
	//   33   78:checkcast       #60  <Class zzyi>
	//   34   81:putfield        #58  <Field Object value>
		return zzyf1;
	//   35   84:aload           4
	//   36   86:areturn         
_L4:
		if(!(value instanceof byte[]))
			break MISSING_BLOCK_LABEL_115;
	//   37   87:aload_0         
	//   38   88:getfield        #58  <Field Object value>
	//   39   91:instanceof      #66  <Class byte[]>
	//   40   94:ifeq            115
		zzyf1.value = ((byte []) ((byte[])value)).clone();
	//   41   97:aload           4
	//   42   99:aload_0         
	//   43  100:getfield        #58  <Field Object value>
	//   44  103:checkcast       #66  <Class byte[]>
	//   45  106:invokevirtual   #67  <Method Object _5B_B.clone()>
	//   46  109:putfield        #58  <Field Object value>
		return zzyf1;
	//   47  112:aload           4
	//   48  114:areturn         
		int i;
		boolean flag;
		boolean flag1;
		Object obj;
		Object obj1;
		try
		{
			flag1 = value instanceof byte[][];
	//   49  115:aload_0         
	//   50  116:getfield        #58  <Field Object value>
	//   51  119:instanceof      #69  <Class byte[][]>
	//   52  122:istore_3        
		}
	//*  53  123:iconst_0        
	//*  54  124:istore_2        
	//*  55  125:iconst_0        
	//*  56  126:istore_1        
	//*  57  127:iload_3         
	//*  58  128:ifeq            183
	//*  59  131:aload_0         
	//*  60  132:getfield        #58  <Field Object value>
	//*  61  135:checkcast       #69  <Class byte[][]>
	//*  62  138:astore          5
	//*  63  140:aload           5
	//*  64  142:arraylength     
	//*  65  143:anewarray       byte[][]
	//*  66  146:astore          6
	//*  67  148:aload           4
	//*  68  150:aload           6
	//*  69  152:putfield        #58  <Field Object value>
	//*  70  155:iload_1         
	//*  71  156:aload           5
	//*  72  158:arraylength     
	//*  73  159:icmpge          387
	//*  74  162:aload           6
	//*  75  164:iload_1         
	//*  76  165:aload           5
	//*  77  167:iload_1         
	//*  78  168:aaload          
	//*  79  169:invokevirtual   #67  <Method Object _5B_B.clone()>
	//*  80  172:checkcast       #66  <Class byte[]>
	//*  81  175:aastore         
	//*  82  176:iload_1         
	//*  83  177:iconst_1        
	//*  84  178:iadd            
	//*  85  179:istore_1        
	//*  86  180:goto            155
	//*  87  183:aload_0         
	//*  88  184:getfield        #58  <Field Object value>
	//*  89  187:instanceof      #71  <Class boolean[]>
	//*  90  190:ifeq            211
	//*  91  193:aload           4
	//*  92  195:aload_0         
	//*  93  196:getfield        #58  <Field Object value>
	//*  94  199:checkcast       #71  <Class boolean[]>
	//*  95  202:invokevirtual   #72  <Method Object _5B_Z.clone()>
	//*  96  205:putfield        #58  <Field Object value>
	//*  97  208:aload           4
	//*  98  210:areturn         
	//*  99  211:aload_0         
	//* 100  212:getfield        #58  <Field Object value>
	//* 101  215:instanceof      #74  <Class int[]>
	//* 102  218:ifeq            239
	//* 103  221:aload           4
	//* 104  223:aload_0         
	//* 105  224:getfield        #58  <Field Object value>
	//* 106  227:checkcast       #74  <Class int[]>
	//* 107  230:invokevirtual   #75  <Method Object _5B_I.clone()>
	//* 108  233:putfield        #58  <Field Object value>
	//* 109  236:aload           4
	//* 110  238:areturn         
	//* 111  239:aload_0         
	//* 112  240:getfield        #58  <Field Object value>
	//* 113  243:instanceof      #77  <Class long[]>
	//* 114  246:ifeq            267
	//* 115  249:aload           4
	//* 116  251:aload_0         
	//* 117  252:getfield        #58  <Field Object value>
	//* 118  255:checkcast       #77  <Class long[]>
	//* 119  258:invokevirtual   #78  <Method Object _5B_J.clone()>
	//* 120  261:putfield        #58  <Field Object value>
	//* 121  264:aload           4
	//* 122  266:areturn         
	//* 123  267:aload_0         
	//* 124  268:getfield        #58  <Field Object value>
	//* 125  271:instanceof      #80  <Class float[]>
	//* 126  274:ifeq            295
	//* 127  277:aload           4
	//* 128  279:aload_0         
	//* 129  280:getfield        #58  <Field Object value>
	//* 130  283:checkcast       #80  <Class float[]>
	//* 131  286:invokevirtual   #81  <Method Object _5B_F.clone()>
	//* 132  289:putfield        #58  <Field Object value>
	//* 133  292:aload           4
	//* 134  294:areturn         
	//* 135  295:aload_0         
	//* 136  296:getfield        #58  <Field Object value>
	//* 137  299:instanceof      #83  <Class double[]>
	//* 138  302:ifeq            323
	//* 139  305:aload           4
	//* 140  307:aload_0         
	//* 141  308:getfield        #58  <Field Object value>
	//* 142  311:checkcast       #83  <Class double[]>
	//* 143  314:invokevirtual   #84  <Method Object _5B_D.clone()>
	//* 144  317:putfield        #58  <Field Object value>
	//* 145  320:aload           4
	//* 146  322:areturn         
	//* 147  323:aload_0         
	//* 148  324:getfield        #58  <Field Object value>
	//* 149  327:instanceof      #86  <Class zzyi[]>
	//* 150  330:ifeq            387
	//* 151  333:aload_0         
	//* 152  334:getfield        #58  <Field Object value>
	//* 153  337:checkcast       #86  <Class zzyi[]>
	//* 154  340:astore          5
	//* 155  342:aload           5
	//* 156  344:arraylength     
	//* 157  345:anewarray       zzyi[]
	//* 158  348:astore          6
	//* 159  350:aload           4
	//* 160  352:aload           6
	//* 161  354:putfield        #58  <Field Object value>
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
	//* 173  373:invokevirtual   #64  <Method Object zzyi.clone()>
	//* 174  376:checkcast       #60  <Class zzyi>
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
	//  184  392:new             #88  <Class AssertionError>
	//  185  395:dup             
	//  186  396:aload           4
	//  187  398:invokespecial   #91  <Method void AssertionError(Object)>
	//  188  401:athrow          
		}
		flag = false;
		i = 0;
		if(!flag1) goto _L6; else goto _L5
_L5:
		obj = ((Object) ((byte[][])value));
		obj1 = ((Object) (new byte[obj.length][]));
		zzyf1.value = obj1;
_L8:
		if(i >= obj.length) goto _L2; else goto _L7
_L7:
		obj1[i] = (byte[])((byte []) (obj[i])).clone();
		i++;
		  goto _L8
_L6:
		if(!(value instanceof boolean[]))
			break MISSING_BLOCK_LABEL_211;
		zzyf1.value = ((boolean []) ((boolean[])value)).clone();
		return zzyf1;
		if(!(value instanceof int[]))
			break MISSING_BLOCK_LABEL_239;
		zzyf1.value = ((int []) ((int[])value)).clone();
		return zzyf1;
		if(!(value instanceof long[]))
			break MISSING_BLOCK_LABEL_267;
		zzyf1.value = ((long []) ((long[])value)).clone();
		return zzyf1;
		if(!(value instanceof float[]))
			break MISSING_BLOCK_LABEL_295;
		zzyf1.value = ((float []) ((float[])value)).clone();
		return zzyf1;
		if(!(value instanceof double[]))
			break MISSING_BLOCK_LABEL_323;
		zzyf1.value = ((double []) ((double[])value)).clone();
		return zzyf1;
		if(!(value instanceof zzyi[])) goto _L2; else goto _L9
_L9:
		obj = ((Object) ((zzyi[])value));
		obj1 = ((Object) (new zzyi[obj.length]));
		zzyf1.value = obj1;
		i = ((int) (flag));
_L10:
		if(i >= obj.length)
			break; /* Loop/switch isn't completed */
		obj1[i] = (zzyi)obj[i].clone();
		i++;
		if(true) goto _L10; else goto _L2
_L2:
		return zzyf1;
	}

	public final Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzzc()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method zzyf zzzc()>
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
		if(!(obj instanceof zzyf))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzyf>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzyf)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzyf>
	//   12   20:astore_1        
		if(value != null && ((zzyf) (obj)).value != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #58  <Field Object value>
	//*  15   25:ifnull          224
	//*  16   28:aload_1         
	//*  17   29:getfield        #58  <Field Object value>
	//*  18   32:ifnull          224
		{
			Object obj1 = ((Object) (zzcfa));
	//   19   35:aload_0         
	//   20   36:getfield        #50  <Field zzyd zzcfa>
	//   21   39:astore_3        
			if(obj1 != ((zzyf) (obj)).zzcfa)
	//*  22   40:aload_3         
	//*  23   41:aload_1         
	//*  24   42:getfield        #50  <Field zzyd zzcfa>
	//*  25   45:if_acmpeq       50
				return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
			if(!((zzyd) (obj1)).zzceu.isArray())
	//*  28   50:aload_3         
	//*  29   51:getfield        #101 <Field Class zzyd.zzceu>
	//*  30   54:invokevirtual   #107 <Method boolean Class.isArray()>
	//*  31   57:ifne            72
				return value.equals(((zzyf) (obj)).value);
	//   32   60:aload_0         
	//   33   61:getfield        #58  <Field Object value>
	//   34   64:aload_1         
	//   35   65:getfield        #58  <Field Object value>
	//   36   68:invokevirtual   #109 <Method boolean Object.equals(Object)>
	//   37   71:ireturn         
			obj1 = value;
	//   38   72:aload_0         
	//   39   73:getfield        #58  <Field Object value>
	//   40   76:astore_3        
			if(obj1 instanceof byte[])
	//*  41   77:aload_3         
	//*  42   78:instanceof      #66  <Class byte[]>
	//*  43   81:ifeq            99
				return Arrays.equals((byte[])obj1, (byte[])((zzyf) (obj)).value);
	//   44   84:aload_3         
	//   45   85:checkcast       #66  <Class byte[]>
	//   46   88:aload_1         
	//   47   89:getfield        #58  <Field Object value>
	//   48   92:checkcast       #66  <Class byte[]>
	//   49   95:invokestatic    #114 <Method boolean Arrays.equals(byte[], byte[])>
	//   50   98:ireturn         
			if(obj1 instanceof int[])
	//*  51   99:aload_3         
	//*  52  100:instanceof      #74  <Class int[]>
	//*  53  103:ifeq            121
				return Arrays.equals((int[])obj1, (int[])((zzyf) (obj)).value);
	//   54  106:aload_3         
	//   55  107:checkcast       #74  <Class int[]>
	//   56  110:aload_1         
	//   57  111:getfield        #58  <Field Object value>
	//   58  114:checkcast       #74  <Class int[]>
	//   59  117:invokestatic    #117 <Method boolean Arrays.equals(int[], int[])>
	//   60  120:ireturn         
			if(obj1 instanceof long[])
	//*  61  121:aload_3         
	//*  62  122:instanceof      #77  <Class long[]>
	//*  63  125:ifeq            143
				return Arrays.equals((long[])obj1, (long[])((zzyf) (obj)).value);
	//   64  128:aload_3         
	//   65  129:checkcast       #77  <Class long[]>
	//   66  132:aload_1         
	//   67  133:getfield        #58  <Field Object value>
	//   68  136:checkcast       #77  <Class long[]>
	//   69  139:invokestatic    #120 <Method boolean Arrays.equals(long[], long[])>
	//   70  142:ireturn         
			if(obj1 instanceof float[])
	//*  71  143:aload_3         
	//*  72  144:instanceof      #80  <Class float[]>
	//*  73  147:ifeq            165
				return Arrays.equals((float[])obj1, (float[])((zzyf) (obj)).value);
	//   74  150:aload_3         
	//   75  151:checkcast       #80  <Class float[]>
	//   76  154:aload_1         
	//   77  155:getfield        #58  <Field Object value>
	//   78  158:checkcast       #80  <Class float[]>
	//   79  161:invokestatic    #123 <Method boolean Arrays.equals(float[], float[])>
	//   80  164:ireturn         
			if(obj1 instanceof double[])
	//*  81  165:aload_3         
	//*  82  166:instanceof      #83  <Class double[]>
	//*  83  169:ifeq            187
				return Arrays.equals((double[])obj1, (double[])((zzyf) (obj)).value);
	//   84  172:aload_3         
	//   85  173:checkcast       #83  <Class double[]>
	//   86  176:aload_1         
	//   87  177:getfield        #58  <Field Object value>
	//   88  180:checkcast       #83  <Class double[]>
	//   89  183:invokestatic    #126 <Method boolean Arrays.equals(double[], double[])>
	//   90  186:ireturn         
			if(obj1 instanceof boolean[])
	//*  91  187:aload_3         
	//*  92  188:instanceof      #71  <Class boolean[]>
	//*  93  191:ifeq            209
				return Arrays.equals((boolean[])obj1, (boolean[])((zzyf) (obj)).value);
	//   94  194:aload_3         
	//   95  195:checkcast       #71  <Class boolean[]>
	//   96  198:aload_1         
	//   97  199:getfield        #58  <Field Object value>
	//   98  202:checkcast       #71  <Class boolean[]>
	//   99  205:invokestatic    #129 <Method boolean Arrays.equals(boolean[], boolean[])>
	//  100  208:ireturn         
			else
				return Arrays.deepEquals((Object[])obj1, (Object[])((zzyf) (obj)).value);
	//  101  209:aload_3         
	//  102  210:checkcast       #131 <Class Object[]>
	//  103  213:aload_1         
	//  104  214:getfield        #58  <Field Object value>
	//  105  217:checkcast       #131 <Class Object[]>
	//  106  220:invokestatic    #135 <Method boolean Arrays.deepEquals(Object[], Object[])>
	//  107  223:ireturn         
		}
		List list = zzcfb;
	//  108  224:aload_0         
	//  109  225:getfield        #23  <Field List zzcfb>
	//  110  228:astore_3        
		if(list != null)
	//* 111  229:aload_3         
	//* 112  230:ifnull          253
		{
			List list1 = ((zzyf) (obj)).zzcfb;
	//  113  233:aload_1         
	//  114  234:getfield        #23  <Field List zzcfb>
	//  115  237:astore          4
			if(list1 != null)
	//* 116  239:aload           4
	//* 117  241:ifnull          253
				return list.equals(((Object) (list1)));
	//  118  244:aload_3         
	//  119  245:aload           4
	//  120  247:invokeinterface #136 <Method boolean List.equals(Object)>
	//  121  252:ireturn         
		}
		boolean flag;
		try
		{
			flag = Arrays.equals(toByteArray(), ((zzyf) (obj)).toByteArray());
	//  122  253:aload_0         
	//  123  254:invokespecial   #138 <Method byte[] toByteArray()>
	//  124  257:aload_1         
	//  125  258:invokespecial   #138 <Method byte[] toByteArray()>
	//  126  261:invokestatic    #114 <Method boolean Arrays.equals(byte[], byte[])>
	//  127  264:istore_2        
		}
	//* 128  265:iload_2         
	//* 129  266:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 130  267:astore_1        
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//  131  268:new             #140 <Class IllegalStateException>
	//  132  271:dup             
	//  133  272:aload_1         
	//  134  273:invokespecial   #143 <Method void IllegalStateException(Throwable)>
	//  135  276:athrow          
		}
		return flag;
	}

	public final int hashCode()
	{
		int i;
		try
		{
			i = Arrays.hashCode(toByteArray());
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method byte[] toByteArray()>
	//    2    4:invokestatic    #147 <Method int Arrays.hashCode(byte[])>
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
	//    9   15:new             #140 <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #143 <Method void IllegalStateException(Throwable)>
	//   13   23:athrow          
		}
		return i + 527;
	}

	final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object value>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          76
		{
			zzyd zzyd1 = zzcfa;
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field zzyd zzcfa>
	//    7   15:astore          5
			if(zzyd1.zzcev)
	//*   8   17:aload           5
	//*   9   19:getfield        #151 <Field boolean zzyd.zzcev>
	//*  10   22:ifeq            67
			{
				int j = Array.getLength(obj);
	//   11   25:aload           4
	//   12   27:invokestatic    #157 <Method int Array.getLength(Object)>
	//   13   30:istore_3        
				for(int i = 0; i < j; i++)
	//*  14   31:iconst_0        
	//*  15   32:istore_2        
	//*  16   33:iload_2         
	//*  17   34:iload_3         
	//*  18   35:icmpge          66
				{
					Object obj1 = Array.get(obj, i);
	//   19   38:aload           4
	//   20   40:iload_2         
	//   21   41:invokestatic    #161 <Method Object Array.get(Object, int)>
	//   22   44:astore          6
					if(obj1 != null)
	//*  23   46:aload           6
	//*  24   48:ifnull          59
						zzyd1.zza(obj1, zzya1);
	//   25   51:aload           5
	//   26   53:aload           6
	//   27   55:aload_1         
	//   28   56:invokevirtual   #164 <Method void zzyd.zza(Object, zzya)>
				}

	//   29   59:iload_2         
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore_2        
	//*  33   63:goto            33
				return;
	//   34   66:return          
			} else
			{
				zzyd1.zza(obj, zzya1);
	//   35   67:aload           5
	//   36   69:aload           4
	//   37   71:aload_1         
	//   38   72:invokevirtual   #164 <Method void zzyd.zza(Object, zzya)>
				return;
	//   39   75:return          
			}
		}
		zzyk zzyk1;
		for(Iterator iterator = zzcfb.iterator(); iterator.hasNext(); zzya1.zzp(zzyk1.zzbtx))
	//*  40   76:aload_0         
	//*  41   77:getfield        #23  <Field List zzcfb>
	//*  42   80:invokeinterface #168 <Method Iterator List.iterator()>
	//*  43   85:astore          4
	//*  44   87:aload           4
	//*  45   89:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//*  46   94:ifeq            130
		{
			zzyk1 = (zzyk)iterator.next();
	//   47   97:aload           4
	//   48   99:invokeinterface #176 <Method Object Iterator.next()>
	//   49  104:checkcast       #178 <Class zzyk>
	//   50  107:astore          5
			zzya1.zzcd(zzyk1.tag);
	//   51  109:aload_1         
	//   52  110:aload           5
	//   53  112:getfield        #182 <Field int zzyk.tag>
	//   54  115:invokevirtual   #186 <Method void zzya.zzcd(int)>
		}

	//   55  118:aload_1         
	//   56  119:aload           5
	//   57  121:getfield        #189 <Field byte[] zzyk.zzbtx>
	//   58  124:invokevirtual   #193 <Method void zzya.zzp(byte[])>
	//*  59  127:goto            87
	//   60  130:return          
	}

	final void zza(zzyk zzyk1)
		throws IOException
	{
		Object obj = ((Object) (zzcfb));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzcfb>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
		{
			((List) (obj)).add(((Object) (zzyk1)));
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokeinterface #197 <Method boolean List.add(Object)>
	//    8   16:pop             
			return;
	//    9   17:return          
		}
		obj = value;
	//   10   18:aload_0         
	//   11   19:getfield        #58  <Field Object value>
	//   12   22:astore_3        
		if(obj instanceof zzyi)
	//*  13   23:aload_3         
	//*  14   24:instanceof      #60  <Class zzyi>
	//*  15   27:ifeq            78
		{
			zzyk1 = ((zzyk) (zzyk1.zzbtx));
	//   16   30:aload_1         
	//   17   31:getfield        #189 <Field byte[] zzyk.zzbtx>
	//   18   34:astore_1        
			obj = ((Object) (zzxz.zzj(((byte []) (zzyk1)), 0, zzyk1.length)));
	//   19   35:aload_1         
	//   20   36:iconst_0        
	//   21   37:aload_1         
	//   22   38:arraylength     
	//   23   39:invokestatic    #203 <Method zzxz zzxz.zzj(byte[], int, int)>
	//   24   42:astore_3        
			int i = ((zzxz) (obj)).zzvb();
	//   25   43:aload_3         
	//   26   44:invokevirtual   #206 <Method int zzxz.zzvb()>
	//   27   47:istore_2        
			if(i == zzyk1.length - zzya.zzbe(i))
	//*  28   48:iload_2         
	//*  29   49:aload_1         
	//*  30   50:arraylength     
	//*  31   51:iload_2         
	//*  32   52:invokestatic    #210 <Method int zzya.zzbe(int)>
	//*  33   55:isub            
	//*  34   56:icmpne          74
				zzyk1 = ((zzyk) (((zzyi)value).zza(((zzxz) (obj)))));
	//   35   59:aload_0         
	//   36   60:getfield        #58  <Field Object value>
	//   37   63:checkcast       #60  <Class zzyi>
	//   38   66:aload_3         
	//   39   67:invokevirtual   #213 <Method zzyi zzyi.zza(zzxz)>
	//   40   70:astore_1        
			else
	//*  41   71:goto            259
				throw zzyh.zzzd();
	//   42   74:invokestatic    #219 <Method zzyh zzyh.zzzd()>
	//   43   77:athrow          
		} else
		if(obj instanceof zzyi[])
	//*  44   78:aload_3         
	//*  45   79:instanceof      #86  <Class zzyi[]>
	//*  46   82:ifeq            138
		{
			obj = ((Object) ((zzyi[])zzcfa.zzai(Collections.singletonList(((Object) (zzyk1))))));
	//   47   85:aload_0         
	//   48   86:getfield        #50  <Field zzyd zzcfa>
	//   49   89:aload_1         
	//   50   90:invokestatic    #225 <Method List Collections.singletonList(Object)>
	//   51   93:invokevirtual   #229 <Method Object zzyd.zzai(List)>
	//   52   96:checkcast       #86  <Class zzyi[]>
	//   53   99:astore_3        
			zzyi azzyi[] = (zzyi[])value;
	//   54  100:aload_0         
	//   55  101:getfield        #58  <Field Object value>
	//   56  104:checkcast       #86  <Class zzyi[]>
	//   57  107:astore          4
			zzyk1 = ((zzyk) ((zzyi[])Arrays.copyOf(((Object []) (azzyi)), azzyi.length + obj.length)));
	//   58  109:aload           4
	//   59  111:aload           4
	//   60  113:arraylength     
	//   61  114:aload_3         
	//   62  115:arraylength     
	//   63  116:iadd            
	//   64  117:invokestatic    #233 <Method Object[] Arrays.copyOf(Object[], int)>
	//   65  120:checkcast       #86  <Class zzyi[]>
	//   66  123:astore_1        
			System.arraycopy(obj, 0, ((Object) (zzyk1)), azzyi.length, obj.length);
	//   67  124:aload_3         
	//   68  125:iconst_0        
	//   69  126:aload_1         
	//   70  127:aload           4
	//   71  129:arraylength     
	//   72  130:aload_3         
	//   73  131:arraylength     
	//   74  132:invokestatic    #239 <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//*  75  135:goto            259
		if(obj instanceof zzvv)
	//*  76  138:aload_3         
	//*  77  139:instanceof      #241 <Class zzvv>
	//*  78  142:ifeq            187
		{
			zzyk1 = ((zzyk) ((zzvv)zzcfa.zzai(Collections.singletonList(((Object) (zzyk1))))));
	//   79  145:aload_0         
	//   80  146:getfield        #50  <Field zzyd zzcfa>
	//   81  149:aload_1         
	//   82  150:invokestatic    #225 <Method List Collections.singletonList(Object)>
	//   83  153:invokevirtual   #229 <Method Object zzyd.zzai(List)>
	//   84  156:checkcast       #241 <Class zzvv>
	//   85  159:astore_1        
			zzyk1 = ((zzyk) (((zzvv)value).zzwh().zza(((zzvv) (zzyk1))).zzwo()));
	//   86  160:aload_0         
	//   87  161:getfield        #58  <Field Object value>
	//   88  164:checkcast       #241 <Class zzvv>
	//   89  167:invokeinterface #245 <Method zzvw zzvv.zzwh()>
	//   90  172:aload_1         
	//   91  173:invokeinterface #250 <Method zzvw zzvw.zza(zzvv)>
	//   92  178:invokeinterface #254 <Method zzvv zzvw.zzwo()>
	//   93  183:astore_1        
		} else
	//*  94  184:goto            259
		if(obj instanceof zzvv[])
	//*  95  187:aload_3         
	//*  96  188:instanceof      #256 <Class zzvv[]>
	//*  97  191:ifeq            247
		{
			zzvv azzvv[] = (zzvv[])zzcfa.zzai(Collections.singletonList(((Object) (zzyk1))));
	//   98  194:aload_0         
	//   99  195:getfield        #50  <Field zzyd zzcfa>
	//  100  198:aload_1         
	//  101  199:invokestatic    #225 <Method List Collections.singletonList(Object)>
	//  102  202:invokevirtual   #229 <Method Object zzyd.zzai(List)>
	//  103  205:checkcast       #256 <Class zzvv[]>
	//  104  208:astore_3        
			zzvv azzvv1[] = (zzvv[])value;
	//  105  209:aload_0         
	//  106  210:getfield        #58  <Field Object value>
	//  107  213:checkcast       #256 <Class zzvv[]>
	//  108  216:astore          4
			zzyk1 = ((zzyk) ((zzvv[])Arrays.copyOf(((Object []) (azzvv1)), azzvv1.length + azzvv.length)));
	//  109  218:aload           4
	//  110  220:aload           4
	//  111  222:arraylength     
	//  112  223:aload_3         
	//  113  224:arraylength     
	//  114  225:iadd            
	//  115  226:invokestatic    #233 <Method Object[] Arrays.copyOf(Object[], int)>
	//  116  229:checkcast       #256 <Class zzvv[]>
	//  117  232:astore_1        
			System.arraycopy(((Object) (azzvv)), 0, ((Object) (zzyk1)), azzvv1.length, azzvv.length);
	//  118  233:aload_3         
	//  119  234:iconst_0        
	//  120  235:aload_1         
	//  121  236:aload           4
	//  122  238:arraylength     
	//  123  239:aload_3         
	//  124  240:arraylength     
	//  125  241:invokestatic    #239 <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//* 126  244:goto            259
		{
			zzyk1 = ((zzyk) (zzcfa.zzai(Collections.singletonList(((Object) (zzyk1))))));
	//  127  247:aload_0         
	//  128  248:getfield        #50  <Field zzyd zzcfa>
	//  129  251:aload_1         
	//  130  252:invokestatic    #225 <Method List Collections.singletonList(Object)>
	//  131  255:invokevirtual   #229 <Method Object zzyd.zzai(List)>
	//  132  258:astore_1        
		}
		zzcfa = zzcfa;
	//  133  259:aload_0         
	//  134  260:aload_0         
	//  135  261:getfield        #50  <Field zzyd zzcfa>
	//  136  264:putfield        #50  <Field zzyd zzcfa>
		value = ((Object) (zzyk1));
	//  137  267:aload_0         
	//  138  268:aload_1         
	//  139  269:putfield        #58  <Field Object value>
		zzcfb = null;
	//  140  272:aload_0         
	//  141  273:aconst_null     
	//  142  274:putfield        #23  <Field List zzcfb>
	//  143  277:return          
	}

	final Object zzb(zzyd zzyd1)
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:ifnull          32
		{
			if(!zzcfa.equals(((Object) (zzyd1))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #50  <Field zzyd zzcfa>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #259 <Method boolean zzyd.equals(Object)>
	//*   7   15:ifeq            21
	//*   8   18:goto            54
				throw new IllegalStateException("Tried to getExtension with a different Extension.");
	//    9   21:new             #140 <Class IllegalStateException>
	//   10   24:dup             
	//   11   25:ldc2            #261 <String "Tried to getExtension with a different Extension.">
	//   12   28:invokespecial   #264 <Method void IllegalStateException(String)>
	//   13   31:athrow          
		} else
		{
			zzcfa = zzyd1;
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #50  <Field zzyd zzcfa>
			value = zzyd1.zzai(zzcfb);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #23  <Field List zzcfb>
	//   21   43:invokevirtual   #229 <Method Object zzyd.zzai(List)>
	//   22   46:putfield        #58  <Field Object value>
			zzcfb = null;
	//   23   49:aload_0         
	//   24   50:aconst_null     
	//   25   51:putfield        #23  <Field List zzcfb>
		}
		return value;
	//   26   54:aload_0         
	//   27   55:getfield        #58  <Field Object value>
	//   28   58:areturn         
	}

	final int zzf()
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object value>
	//    2    4:astore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int l;
		if(obj != null)
	//*   5    8:aload           5
	//*   6   10:ifnull          86
		{
			zzyd zzyd1 = zzcfa;
	//    7   13:aload_0         
	//    8   14:getfield        #50  <Field zzyd zzcfa>
	//    9   17:astore          6
			if(zzyd1.zzcev)
	//*  10   19:aload           6
	//*  11   21:getfield        #151 <Field boolean zzyd.zzcev>
	//*  12   24:ifeq            78
			{
				int i1 = Array.getLength(obj);
	//   13   27:aload           5
	//   14   29:invokestatic    #157 <Method int Array.getLength(Object)>
	//   15   32:istore          4
				int i = 0;
	//   16   34:iconst_0        
	//   17   35:istore_1        
				do
				{
					l = i;
	//   18   36:iload_1         
	//   19   37:istore_3        
					if(k >= i1)
						break;
	//   20   38:iload_2         
	//   21   39:iload           4
	//   22   41:icmpge          146
					Object obj1 = Array.get(obj, k);
	//   23   44:aload           5
	//   24   46:iload_2         
	//   25   47:invokestatic    #161 <Method Object Array.get(Object, int)>
	//   26   50:astore          7
					l = i;
	//   27   52:iload_1         
	//   28   53:istore_3        
					if(obj1 != null)
	//*  29   54:aload           7
	//*  30   56:ifnull          69
						l = i + zzyd1.zzao(obj1);
	//   31   59:iload_1         
	//   32   60:aload           6
	//   33   62:aload           7
	//   34   64:invokevirtual   #269 <Method int zzyd.zzao(Object)>
	//   35   67:iadd            
	//   36   68:istore_3        
					k++;
	//   37   69:iload_2         
	//   38   70:iconst_1        
	//   39   71:iadd            
	//   40   72:istore_2        
					i = l;
	//   41   73:iload_3         
	//   42   74:istore_1        
				} while(true);
	//   43   75:goto            36
			} else
			{
				return zzyd1.zzao(obj);
	//   44   78:aload           6
	//   45   80:aload           5
	//   46   82:invokevirtual   #269 <Method int zzyd.zzao(Object)>
	//   47   85:ireturn         
			}
		} else
		{
			Iterator iterator = zzcfb.iterator();
	//   48   86:aload_0         
	//   49   87:getfield        #23  <Field List zzcfb>
	//   50   90:invokeinterface #168 <Method Iterator List.iterator()>
	//   51   95:astore          5
			int j = 0;
	//   52   97:iconst_0        
	//   53   98:istore_1        
			do
			{
				l = j;
	//   54   99:iload_1         
	//   55  100:istore_3        
				if(!iterator.hasNext())
					break;
	//   56  101:aload           5
	//   57  103:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//   58  108:ifeq            146
				zzyk zzyk1 = (zzyk)iterator.next();
	//   59  111:aload           5
	//   60  113:invokeinterface #176 <Method Object Iterator.next()>
	//   61  118:checkcast       #178 <Class zzyk>
	//   62  121:astore          6
				j += zzya.zzbl(zzyk1.tag) + 0 + zzyk1.zzbtx.length;
	//   63  123:iload_1         
	//   64  124:aload           6
	//   65  126:getfield        #182 <Field int zzyk.tag>
	//   66  129:invokestatic    #272 <Method int zzya.zzbl(int)>
	//   67  132:iconst_0        
	//   68  133:iadd            
	//   69  134:aload           6
	//   70  136:getfield        #189 <Field byte[] zzyk.zzbtx>
	//   71  139:arraylength     
	//   72  140:iadd            
	//   73  141:iadd            
	//   74  142:istore_1        
			} while(true);
	//   75  143:goto            99
		}
		return l;
	//   76  146:iload_3         
	//   77  147:ireturn         
	}

	private Object value;
	private zzyd zzcfa;
	private List zzcfb;
}
