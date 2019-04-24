// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfa, zzbfi, zzbfd, zzbfk, 
//			zzbez, zzbfh

final class zzbff
	implements Cloneable
{

	zzbff()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzebr = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List zzebr>
	//    7   15:return          
	}

	private final byte[] toByteArray()
		throws IOException
	{
		byte abyte0[] = new byte[zzr()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int zzr()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		zza(zzbfa.zzu(abyte0));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #38  <Method zzbfa zzbfa.zzu(byte[])>
	//    7   12:invokevirtual   #42  <Method void zza(zzbfa)>
		return abyte0;
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	private final zzbff zzagp()
	{
		zzbff zzbff1 = new zzbff();
	//    0    0:new             #2   <Class zzbff>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void zzbff()>
	//    3    7:astore          5
		zzbff1.zzebq = zzebq;
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field zzbfd zzebq>
	//    7   15:putfield        #50  <Field zzbfd zzebq>
		if(zzebr == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #23  <Field List zzebr>
	//*  10   22:ifnonnull       34
		{
			zzbff1.zzebr = null;
	//   11   25:aload           5
	//   12   27:aconst_null     
	//   13   28:putfield        #23  <Field List zzebr>
			break MISSING_BLOCK_LABEL_49;
	//   14   31:goto            49
		}
		zzbff1.zzebr.addAll(((java.util.Collection) (zzebr)));
	//   15   34:aload           5
	//   16   36:getfield        #23  <Field List zzebr>
	//   17   39:aload_0         
	//   18   40:getfield        #23  <Field List zzebr>
	//   19   43:invokeinterface #56  <Method boolean List.addAll(java.util.Collection)>
	//   20   48:pop             
		if(value == null) goto _L2; else goto _L1
	//   21   49:aload_0         
	//   22   50:getfield        #58  <Field Object value>
	//   23   53:ifnull          373
_L1:
		if(!(value instanceof zzbfi)) goto _L4; else goto _L3
	//   24   56:aload_0         
	//   25   57:getfield        #58  <Field Object value>
	//   26   60:instanceof      #60  <Class zzbfi>
	//   27   63:ifeq            91
_L3:
		Object obj = ((Object) ((zzbfi)((zzbfi)value).clone()));
	//   28   66:aload_0         
	//   29   67:getfield        #58  <Field Object value>
	//   30   70:checkcast       #60  <Class zzbfi>
	//   31   73:invokevirtual   #64  <Method Object zzbfi.clone()>
	//   32   76:checkcast       #60  <Class zzbfi>
	//   33   79:astore          4
_L5:
		zzbff1.value = obj;
	//   34   81:aload           5
	//   35   83:aload           4
	//   36   85:putfield        #58  <Field Object value>
		return zzbff1;
	//   37   88:aload           5
	//   38   90:areturn         
_L4:
label0:
		{
			if(!(value instanceof byte[]))
				break label0;
	//   39   91:aload_0         
	//   40   92:getfield        #58  <Field Object value>
	//   41   95:instanceof      #66  <Class byte[]>
	//   42   98:ifeq            116
			obj = ((byte []) ((byte[])value)).clone();
	//   43  101:aload_0         
	//   44  102:getfield        #58  <Field Object value>
	//   45  105:checkcast       #66  <Class byte[]>
	//   46  108:invokevirtual   #67  <Method Object _5B_B.clone()>
	//   47  111:astore          4
		}
		  goto _L5
	//*  48  113:goto            81
		int i;
		boolean flag;
		boolean flag1;
		zzbfi azzbfi[];
		Object obj1;
		try
		{
			flag1 = value instanceof byte[][];
	//   49  116:aload_0         
	//   50  117:getfield        #58  <Field Object value>
	//   51  120:instanceof      #69  <Class byte[][]>
	//   52  123:istore_3        
		}
	//*  53  124:iconst_0        
	//*  54  125:istore_2        
	//*  55  126:iconst_0        
	//*  56  127:istore_1        
	//*  57  128:iload_3         
	//*  58  129:ifeq            184
	//*  59  132:aload_0         
	//*  60  133:getfield        #58  <Field Object value>
	//*  61  136:checkcast       #69  <Class byte[][]>
	//*  62  139:astore          4
	//*  63  141:aload           4
	//*  64  143:arraylength     
	//*  65  144:anewarray       byte[][]
	//*  66  147:astore          6
	//*  67  149:aload           5
	//*  68  151:aload           6
	//*  69  153:putfield        #58  <Field Object value>
	//*  70  156:iload_1         
	//*  71  157:aload           4
	//*  72  159:arraylength     
	//*  73  160:icmpge          373
	//*  74  163:aload           6
	//*  75  165:iload_1         
	//*  76  166:aload           4
	//*  77  168:iload_1         
	//*  78  169:aaload          
	//*  79  170:invokevirtual   #67  <Method Object _5B_B.clone()>
	//*  80  173:checkcast       #66  <Class byte[]>
	//*  81  176:aastore         
	//*  82  177:iload_1         
	//*  83  178:iconst_1        
	//*  84  179:iadd            
	//*  85  180:istore_1        
	//*  86  181:goto            156
	//*  87  184:aload_0         
	//*  88  185:getfield        #58  <Field Object value>
	//*  89  188:instanceof      #71  <Class boolean[]>
	//*  90  191:ifeq            209
	//*  91  194:aload_0         
	//*  92  195:getfield        #58  <Field Object value>
	//*  93  198:checkcast       #71  <Class boolean[]>
	//*  94  201:invokevirtual   #72  <Method Object _5B_Z.clone()>
	//*  95  204:astore          4
	//*  96  206:goto            81
	//*  97  209:aload_0         
	//*  98  210:getfield        #58  <Field Object value>
	//*  99  213:instanceof      #74  <Class int[]>
	//* 100  216:ifeq            234
	//* 101  219:aload_0         
	//* 102  220:getfield        #58  <Field Object value>
	//* 103  223:checkcast       #74  <Class int[]>
	//* 104  226:invokevirtual   #75  <Method Object _5B_I.clone()>
	//* 105  229:astore          4
	//* 106  231:goto            81
	//* 107  234:aload_0         
	//* 108  235:getfield        #58  <Field Object value>
	//* 109  238:instanceof      #77  <Class long[]>
	//* 110  241:ifeq            259
	//* 111  244:aload_0         
	//* 112  245:getfield        #58  <Field Object value>
	//* 113  248:checkcast       #77  <Class long[]>
	//* 114  251:invokevirtual   #78  <Method Object _5B_J.clone()>
	//* 115  254:astore          4
	//* 116  256:goto            81
	//* 117  259:aload_0         
	//* 118  260:getfield        #58  <Field Object value>
	//* 119  263:instanceof      #80  <Class float[]>
	//* 120  266:ifeq            284
	//* 121  269:aload_0         
	//* 122  270:getfield        #58  <Field Object value>
	//* 123  273:checkcast       #80  <Class float[]>
	//* 124  276:invokevirtual   #81  <Method Object _5B_F.clone()>
	//* 125  279:astore          4
	//* 126  281:goto            81
	//* 127  284:aload_0         
	//* 128  285:getfield        #58  <Field Object value>
	//* 129  288:instanceof      #83  <Class double[]>
	//* 130  291:ifeq            309
	//* 131  294:aload_0         
	//* 132  295:getfield        #58  <Field Object value>
	//* 133  298:checkcast       #83  <Class double[]>
	//* 134  301:invokevirtual   #84  <Method Object _5B_D.clone()>
	//* 135  304:astore          4
	//* 136  306:goto            81
	//* 137  309:aload_0         
	//* 138  310:getfield        #58  <Field Object value>
	//* 139  313:instanceof      #86  <Class zzbfi[]>
	//* 140  316:ifeq            373
	//* 141  319:aload_0         
	//* 142  320:getfield        #58  <Field Object value>
	//* 143  323:checkcast       #86  <Class zzbfi[]>
	//* 144  326:astore          4
	//* 145  328:aload           4
	//* 146  330:arraylength     
	//* 147  331:anewarray       zzbfi[]
	//* 148  334:astore          6
	//* 149  336:aload           5
	//* 150  338:aload           6
	//* 151  340:putfield        #58  <Field Object value>
	//* 152  343:iload_2         
	//* 153  344:istore_1        
	//* 154  345:iload_1         
	//* 155  346:aload           4
	//* 156  348:arraylength     
	//* 157  349:icmpge          373
	//* 158  352:aload           6
	//* 159  354:iload_1         
	//* 160  355:aload           4
	//* 161  357:iload_1         
	//* 162  358:aaload          
	//* 163  359:invokevirtual   #64  <Method Object zzbfi.clone()>
	//* 164  362:checkcast       #60  <Class zzbfi>
	//* 165  365:aastore         
	//* 166  366:iload_1         
	//* 167  367:iconst_1        
	//* 168  368:iadd            
	//* 169  369:istore_1        
	//* 170  370:goto            345
	//* 171  373:aload           5
	//* 172  375:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//* 173  376:astore          4
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//  174  378:new             #88  <Class AssertionError>
	//  175  381:dup             
	//  176  382:aload           4
	//  177  384:invokespecial   #91  <Method void AssertionError(Object)>
	//  178  387:athrow          
		}
		flag = false;
		i = 0;
		if(!flag1) goto _L7; else goto _L6
_L6:
		obj = ((Object) ((byte[][])value));
		obj1 = ((Object) (new byte[obj.length][]));
		zzbff1.value = obj1;
_L9:
		if(i >= obj.length) goto _L2; else goto _L8
_L8:
		obj1[i] = (byte[])((byte []) (obj[i])).clone();
		i++;
		  goto _L9
_L7:
label1:
		{
			if(!(value instanceof boolean[]))
				break label1;
			obj = ((boolean []) ((boolean[])value)).clone();
		}
		  goto _L5
label2:
		{
			if(!(value instanceof int[]))
				break label2;
			obj = ((int []) ((int[])value)).clone();
		}
		  goto _L5
label3:
		{
			if(!(value instanceof long[]))
				break label3;
			obj = ((long []) ((long[])value)).clone();
		}
		  goto _L5
label4:
		{
			if(!(value instanceof float[]))
				break label4;
			obj = ((float []) ((float[])value)).clone();
		}
		  goto _L5
label5:
		{
			if(!(value instanceof double[]))
				break label5;
			obj = ((double []) ((double[])value)).clone();
		}
		  goto _L5
		if(!(value instanceof zzbfi[])) goto _L2; else goto _L10
_L10:
		azzbfi = (zzbfi[])value;
		obj1 = ((Object) (new zzbfi[azzbfi.length]));
		zzbff1.value = obj1;
		i = ((int) (flag));
_L11:
		if(i >= azzbfi.length)
			break; /* Loop/switch isn't completed */
		obj1[i] = (zzbfi)azzbfi[i].clone();
		i++;
		if(true) goto _L11; else goto _L2
_L2:
		return zzbff1;
	}

	public final Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzagp()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method zzbff zzagp()>
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
		if(!(obj instanceof zzbff))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbff>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzbff)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbff>
	//   12   20:astore_1        
		if(value != null && ((zzbff) (obj)).value != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #58  <Field Object value>
	//*  15   25:ifnull          259
	//*  16   28:aload_1         
	//*  17   29:getfield        #58  <Field Object value>
	//*  18   32:ifnull          259
		{
			if(zzebq != ((zzbff) (obj)).zzebq)
	//*  19   35:aload_0         
	//*  20   36:getfield        #50  <Field zzbfd zzebq>
	//*  21   39:aload_1         
	//*  22   40:getfield        #50  <Field zzbfd zzebq>
	//*  23   43:if_acmpeq       48
				return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
			if(!zzebq.zzebl.isArray())
	//*  26   48:aload_0         
	//*  27   49:getfield        #50  <Field zzbfd zzebq>
	//*  28   52:getfield        #101 <Field Class zzbfd.zzebl>
	//*  29   55:invokevirtual   #107 <Method boolean Class.isArray()>
	//*  30   58:ifne            73
				return value.equals(((zzbff) (obj)).value);
	//   31   61:aload_0         
	//   32   62:getfield        #58  <Field Object value>
	//   33   65:aload_1         
	//   34   66:getfield        #58  <Field Object value>
	//   35   69:invokevirtual   #109 <Method boolean Object.equals(Object)>
	//   36   72:ireturn         
			if(value instanceof byte[])
	//*  37   73:aload_0         
	//*  38   74:getfield        #58  <Field Object value>
	//*  39   77:instanceof      #66  <Class byte[]>
	//*  40   80:ifeq            101
				return Arrays.equals((byte[])value, (byte[])((zzbff) (obj)).value);
	//   41   83:aload_0         
	//   42   84:getfield        #58  <Field Object value>
	//   43   87:checkcast       #66  <Class byte[]>
	//   44   90:aload_1         
	//   45   91:getfield        #58  <Field Object value>
	//   46   94:checkcast       #66  <Class byte[]>
	//   47   97:invokestatic    #114 <Method boolean Arrays.equals(byte[], byte[])>
	//   48  100:ireturn         
			if(value instanceof int[])
	//*  49  101:aload_0         
	//*  50  102:getfield        #58  <Field Object value>
	//*  51  105:instanceof      #74  <Class int[]>
	//*  52  108:ifeq            129
				return Arrays.equals((int[])value, (int[])((zzbff) (obj)).value);
	//   53  111:aload_0         
	//   54  112:getfield        #58  <Field Object value>
	//   55  115:checkcast       #74  <Class int[]>
	//   56  118:aload_1         
	//   57  119:getfield        #58  <Field Object value>
	//   58  122:checkcast       #74  <Class int[]>
	//   59  125:invokestatic    #117 <Method boolean Arrays.equals(int[], int[])>
	//   60  128:ireturn         
			if(value instanceof long[])
	//*  61  129:aload_0         
	//*  62  130:getfield        #58  <Field Object value>
	//*  63  133:instanceof      #77  <Class long[]>
	//*  64  136:ifeq            157
				return Arrays.equals((long[])value, (long[])((zzbff) (obj)).value);
	//   65  139:aload_0         
	//   66  140:getfield        #58  <Field Object value>
	//   67  143:checkcast       #77  <Class long[]>
	//   68  146:aload_1         
	//   69  147:getfield        #58  <Field Object value>
	//   70  150:checkcast       #77  <Class long[]>
	//   71  153:invokestatic    #120 <Method boolean Arrays.equals(long[], long[])>
	//   72  156:ireturn         
			if(value instanceof float[])
	//*  73  157:aload_0         
	//*  74  158:getfield        #58  <Field Object value>
	//*  75  161:instanceof      #80  <Class float[]>
	//*  76  164:ifeq            185
				return Arrays.equals((float[])value, (float[])((zzbff) (obj)).value);
	//   77  167:aload_0         
	//   78  168:getfield        #58  <Field Object value>
	//   79  171:checkcast       #80  <Class float[]>
	//   80  174:aload_1         
	//   81  175:getfield        #58  <Field Object value>
	//   82  178:checkcast       #80  <Class float[]>
	//   83  181:invokestatic    #123 <Method boolean Arrays.equals(float[], float[])>
	//   84  184:ireturn         
			if(value instanceof double[])
	//*  85  185:aload_0         
	//*  86  186:getfield        #58  <Field Object value>
	//*  87  189:instanceof      #83  <Class double[]>
	//*  88  192:ifeq            213
				return Arrays.equals((double[])value, (double[])((zzbff) (obj)).value);
	//   89  195:aload_0         
	//   90  196:getfield        #58  <Field Object value>
	//   91  199:checkcast       #83  <Class double[]>
	//   92  202:aload_1         
	//   93  203:getfield        #58  <Field Object value>
	//   94  206:checkcast       #83  <Class double[]>
	//   95  209:invokestatic    #126 <Method boolean Arrays.equals(double[], double[])>
	//   96  212:ireturn         
			if(value instanceof boolean[])
	//*  97  213:aload_0         
	//*  98  214:getfield        #58  <Field Object value>
	//*  99  217:instanceof      #71  <Class boolean[]>
	//* 100  220:ifeq            241
				return Arrays.equals((boolean[])value, (boolean[])((zzbff) (obj)).value);
	//  101  223:aload_0         
	//  102  224:getfield        #58  <Field Object value>
	//  103  227:checkcast       #71  <Class boolean[]>
	//  104  230:aload_1         
	//  105  231:getfield        #58  <Field Object value>
	//  106  234:checkcast       #71  <Class boolean[]>
	//  107  237:invokestatic    #129 <Method boolean Arrays.equals(boolean[], boolean[])>
	//  108  240:ireturn         
			else
				return Arrays.deepEquals((Object[])value, (Object[])((zzbff) (obj)).value);
	//  109  241:aload_0         
	//  110  242:getfield        #58  <Field Object value>
	//  111  245:checkcast       #131 <Class Object[]>
	//  112  248:aload_1         
	//  113  249:getfield        #58  <Field Object value>
	//  114  252:checkcast       #131 <Class Object[]>
	//  115  255:invokestatic    #135 <Method boolean Arrays.deepEquals(Object[], Object[])>
	//  116  258:ireturn         
		}
		if(zzebr != null && ((zzbff) (obj)).zzebr != null)
	//* 117  259:aload_0         
	//* 118  260:getfield        #23  <Field List zzebr>
	//* 119  263:ifnull          287
	//* 120  266:aload_1         
	//* 121  267:getfield        #23  <Field List zzebr>
	//* 122  270:ifnull          287
			return zzebr.equals(((Object) (((zzbff) (obj)).zzebr)));
	//  123  273:aload_0         
	//  124  274:getfield        #23  <Field List zzebr>
	//  125  277:aload_1         
	//  126  278:getfield        #23  <Field List zzebr>
	//  127  281:invokeinterface #136 <Method boolean List.equals(Object)>
	//  128  286:ireturn         
		boolean flag;
		try
		{
			flag = Arrays.equals(toByteArray(), ((zzbff) (obj)).toByteArray());
	//  129  287:aload_0         
	//  130  288:invokespecial   #138 <Method byte[] toByteArray()>
	//  131  291:aload_1         
	//  132  292:invokespecial   #138 <Method byte[] toByteArray()>
	//  133  295:invokestatic    #114 <Method boolean Arrays.equals(byte[], byte[])>
	//  134  298:istore_2        
		}
	//* 135  299:iload_2         
	//* 136  300:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 137  301:astore_1        
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//  138  302:new             #140 <Class IllegalStateException>
	//  139  305:dup             
	//  140  306:aload_1         
	//  141  307:invokespecial   #143 <Method void IllegalStateException(Throwable)>
	//  142  310:athrow          
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
	//*   4    8:sipush          527
	//*   5   11:iload_1         
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
		return 527 + i;
	}

	final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:ifnull          15
			throw new NoSuchMethodError();
	//    3    7:new             #149 <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #150 <Method void NoSuchMethodError()>
	//    6   14:athrow          
		zzbfk zzbfk1;
		for(Iterator iterator = zzebr.iterator(); iterator.hasNext(); zzbfa1.zzw(zzbfk1.zzdpw))
	//*   7   15:aload_0         
	//*   8   16:getfield        #23  <Field List zzebr>
	//*   9   19:invokeinterface #154 <Method Iterator List.iterator()>
	//*  10   24:astore_2        
	//*  11   25:aload_2         
	//*  12   26:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            63
		{
			zzbfk1 = (zzbfk)iterator.next();
	//   14   34:aload_2         
	//   15   35:invokeinterface #162 <Method Object Iterator.next()>
	//   16   40:checkcast       #164 <Class zzbfk>
	//   17   43:astore_3        
			zzbfa1.zzde(zzbfk1.tag);
	//   18   44:aload_1         
	//   19   45:aload_3         
	//   20   46:getfield        #168 <Field int zzbfk.tag>
	//   21   49:invokevirtual   #172 <Method void zzbfa.zzde(int)>
		}

	//   22   52:aload_1         
	//   23   53:aload_3         
	//   24   54:getfield        #175 <Field byte[] zzbfk.zzdpw>
	//   25   57:invokevirtual   #179 <Method void zzbfa.zzw(byte[])>
	//*  26   60:goto            25
	//   27   63:return          
	}

	final void zza(zzbfk zzbfk1)
		throws IOException
	{
		if(zzebr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List zzebr>
	//*   2    4:ifnull          19
		{
			zzebr.add(((Object) (zzbfk1)));
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field List zzebr>
	//    5   11:aload_1         
	//    6   12:invokeinterface #183 <Method boolean List.add(Object)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(value instanceof zzbfi)
	//*   9   19:aload_0         
	//*  10   20:getfield        #58  <Field Object value>
	//*  11   23:instanceof      #60  <Class zzbfi>
	//*  12   26:ifeq            93
		{
			zzbfk1 = ((zzbfk) (zzbfk1.zzdpw));
	//   13   29:aload_1         
	//   14   30:getfield        #175 <Field byte[] zzbfk.zzdpw>
	//   15   33:astore_1        
			zzbez zzbez1 = zzbez.zzi(((byte []) (zzbfk1)), 0, zzbfk1.length);
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:arraylength     
	//   20   38:invokestatic    #189 <Method zzbez zzbez.zzi(byte[], int, int)>
	//   21   41:astore_3        
			int i = zzbez1.zzacc();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #192 <Method int zzbez.zzacc()>
	//   24   46:istore_2        
			if(i != zzbfk1.length - zzbfa.zzce(i))
	//*  25   47:iload_2         
	//*  26   48:aload_1         
	//*  27   49:arraylength     
	//*  28   50:iload_2         
	//*  29   51:invokestatic    #196 <Method int zzbfa.zzce(int)>
	//*  30   54:isub            
	//*  31   55:icmpeq          62
			{
				throw zzbfh.zzagq();
	//   32   58:invokestatic    #202 <Method zzbfh zzbfh.zzagq()>
	//   33   61:athrow          
			} else
			{
				zzbfk1 = ((zzbfk) (((zzbfi)value).zza(zzbez1)));
	//   34   62:aload_0         
	//   35   63:getfield        #58  <Field Object value>
	//   36   66:checkcast       #60  <Class zzbfi>
	//   37   69:aload_3         
	//   38   70:invokevirtual   #205 <Method zzbfi zzbfi.zza(zzbez)>
	//   39   73:astore_1        
				zzebq = zzebq;
	//   40   74:aload_0         
	//   41   75:aload_0         
	//   42   76:getfield        #50  <Field zzbfd zzebq>
	//   43   79:putfield        #50  <Field zzbfd zzebq>
				value = ((Object) (zzbfk1));
	//   44   82:aload_0         
	//   45   83:aload_1         
	//   46   84:putfield        #58  <Field Object value>
				zzebr = null;
	//   47   87:aload_0         
	//   48   88:aconst_null     
	//   49   89:putfield        #23  <Field List zzebr>
				return;
	//   50   92:return          
			}
		}
		if(value instanceof zzbfi[])
	//*  51   93:aload_0         
	//*  52   94:getfield        #58  <Field Object value>
	//*  53   97:instanceof      #86  <Class zzbfi[]>
	//*  54  100:ifeq            116
		{
			Collections.singletonList(((Object) (zzbfk1)));
	//   55  103:aload_1         
	//   56  104:invokestatic    #211 <Method List Collections.singletonList(Object)>
	//   57  107:pop             
			throw new NoSuchMethodError();
	//   58  108:new             #149 <Class NoSuchMethodError>
	//   59  111:dup             
	//   60  112:invokespecial   #150 <Method void NoSuchMethodError()>
	//   61  115:athrow          
		} else
		{
			Collections.singletonList(((Object) (zzbfk1)));
	//   62  116:aload_1         
	//   63  117:invokestatic    #211 <Method List Collections.singletonList(Object)>
	//   64  120:pop             
			throw new NoSuchMethodError();
	//   65  121:new             #149 <Class NoSuchMethodError>
	//   66  124:dup             
	//   67  125:invokespecial   #150 <Method void NoSuchMethodError()>
	//   68  128:athrow          
		}
	}

	final int zzr()
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:ifnull          15
			throw new NoSuchMethodError();
	//    3    7:new             #149 <Class NoSuchMethodError>
	//    4   10:dup             
	//    5   11:invokespecial   #150 <Method void NoSuchMethodError()>
	//    6   14:athrow          
		Iterator iterator = zzebr.iterator();
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field List zzebr>
	//    9   19:invokeinterface #154 <Method Iterator List.iterator()>
	//   10   24:astore_2        
		int i;
		zzbfk zzbfk1;
		for(i = 0; iterator.hasNext(); i += zzbfa.zzcl(zzbfk1.tag) + 0 + zzbfk1.zzdpw.length)
	//*  11   25:iconst_0        
	//*  12   26:istore_1        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            67
			zzbfk1 = (zzbfk)iterator.next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #162 <Method Object Iterator.next()>
	//   18   42:checkcast       #164 <Class zzbfk>
	//   19   45:astore_3        

	//   20   46:iload_1         
	//   21   47:aload_3         
	//   22   48:getfield        #168 <Field int zzbfk.tag>
	//   23   51:invokestatic    #214 <Method int zzbfa.zzcl(int)>
	//   24   54:iconst_0        
	//   25   55:iadd            
	//   26   56:aload_3         
	//   27   57:getfield        #175 <Field byte[] zzbfk.zzdpw>
	//   28   60:arraylength     
	//   29   61:iadd            
	//   30   62:iadd            
	//   31   63:istore_1        
	//*  32   64:goto            27
		return i;
	//   33   67:iload_1         
	//   34   68:ireturn         
	}

	private Object value;
	private zzbfd zzebq;
	private List zzebr;
}
