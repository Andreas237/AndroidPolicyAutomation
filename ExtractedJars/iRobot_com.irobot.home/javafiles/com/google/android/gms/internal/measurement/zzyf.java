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
		zzcfd = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List zzcfd>
	//    7   15:return          
	}

	private final byte[] toByteArray()
	{
		byte abyte0[] = new byte[zzf()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method int zzf()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		zza(zzya.zzo(abyte0));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #36  <Method zzya zzya.zzo(byte[])>
	//    7   12:invokevirtual   #40  <Method void zza(zzya)>
		return abyte0;
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	private final zzyf zzzc()
	{
		zzyf zzyf1 = new zzyf();
	//    0    0:new             #2   <Class zzyf>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void zzyf()>
	//    3    7:astore          5
		zzyf1.zzcfc = zzcfc;
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field zzyd zzcfc>
	//    7   15:putfield        #47  <Field zzyd zzcfc>
		if(zzcfd == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #23  <Field List zzcfd>
	//*  10   22:ifnonnull       34
		{
			zzyf1.zzcfd = null;
	//   11   25:aload           5
	//   12   27:aconst_null     
	//   13   28:putfield        #23  <Field List zzcfd>
			break MISSING_BLOCK_LABEL_49;
	//   14   31:goto            49
		}
		zzyf1.zzcfd.addAll(((java.util.Collection) (zzcfd)));
	//   15   34:aload           5
	//   16   36:getfield        #23  <Field List zzcfd>
	//   17   39:aload_0         
	//   18   40:getfield        #23  <Field List zzcfd>
	//   19   43:invokeinterface #53  <Method boolean List.addAll(java.util.Collection)>
	//   20   48:pop             
		if(value == null) goto _L2; else goto _L1
	//   21   49:aload_0         
	//   22   50:getfield        #55  <Field Object value>
	//   23   53:ifnull          373
_L1:
		if(!(value instanceof zzyi)) goto _L4; else goto _L3
	//   24   56:aload_0         
	//   25   57:getfield        #55  <Field Object value>
	//   26   60:instanceof      #57  <Class zzyi>
	//   27   63:ifeq            91
_L3:
		Object obj = ((Object) ((zzyi)((zzyi)value).clone()));
	//   28   66:aload_0         
	//   29   67:getfield        #55  <Field Object value>
	//   30   70:checkcast       #57  <Class zzyi>
	//   31   73:invokevirtual   #61  <Method Object zzyi.clone()>
	//   32   76:checkcast       #57  <Class zzyi>
	//   33   79:astore          4
_L5:
		zzyf1.value = obj;
	//   34   81:aload           5
	//   35   83:aload           4
	//   36   85:putfield        #55  <Field Object value>
		return zzyf1;
	//   37   88:aload           5
	//   38   90:areturn         
_L4:
label0:
		{
			if(!(value instanceof byte[]))
				break label0;
	//   39   91:aload_0         
	//   40   92:getfield        #55  <Field Object value>
	//   41   95:instanceof      #63  <Class byte[]>
	//   42   98:ifeq            116
			obj = ((byte []) ((byte[])value)).clone();
	//   43  101:aload_0         
	//   44  102:getfield        #55  <Field Object value>
	//   45  105:checkcast       #63  <Class byte[]>
	//   46  108:invokevirtual   #64  <Method Object _5B_B.clone()>
	//   47  111:astore          4
		}
		  goto _L5
	//*  48  113:goto            81
		int i;
		boolean flag;
		boolean flag1;
		zzyi azzyi[];
		Object obj1;
		try
		{
			flag1 = value instanceof byte[][];
	//   49  116:aload_0         
	//   50  117:getfield        #55  <Field Object value>
	//   51  120:instanceof      #66  <Class byte[][]>
	//   52  123:istore_3        
		}
	//*  53  124:iconst_0        
	//*  54  125:istore_2        
	//*  55  126:iconst_0        
	//*  56  127:istore_1        
	//*  57  128:iload_3         
	//*  58  129:ifeq            184
	//*  59  132:aload_0         
	//*  60  133:getfield        #55  <Field Object value>
	//*  61  136:checkcast       #66  <Class byte[][]>
	//*  62  139:astore          4
	//*  63  141:aload           4
	//*  64  143:arraylength     
	//*  65  144:anewarray       byte[][]
	//*  66  147:astore          6
	//*  67  149:aload           5
	//*  68  151:aload           6
	//*  69  153:putfield        #55  <Field Object value>
	//*  70  156:iload_1         
	//*  71  157:aload           4
	//*  72  159:arraylength     
	//*  73  160:icmpge          373
	//*  74  163:aload           6
	//*  75  165:iload_1         
	//*  76  166:aload           4
	//*  77  168:iload_1         
	//*  78  169:aaload          
	//*  79  170:invokevirtual   #64  <Method Object _5B_B.clone()>
	//*  80  173:checkcast       #63  <Class byte[]>
	//*  81  176:aastore         
	//*  82  177:iload_1         
	//*  83  178:iconst_1        
	//*  84  179:iadd            
	//*  85  180:istore_1        
	//*  86  181:goto            156
	//*  87  184:aload_0         
	//*  88  185:getfield        #55  <Field Object value>
	//*  89  188:instanceof      #68  <Class boolean[]>
	//*  90  191:ifeq            209
	//*  91  194:aload_0         
	//*  92  195:getfield        #55  <Field Object value>
	//*  93  198:checkcast       #68  <Class boolean[]>
	//*  94  201:invokevirtual   #69  <Method Object _5B_Z.clone()>
	//*  95  204:astore          4
	//*  96  206:goto            81
	//*  97  209:aload_0         
	//*  98  210:getfield        #55  <Field Object value>
	//*  99  213:instanceof      #71  <Class int[]>
	//* 100  216:ifeq            234
	//* 101  219:aload_0         
	//* 102  220:getfield        #55  <Field Object value>
	//* 103  223:checkcast       #71  <Class int[]>
	//* 104  226:invokevirtual   #72  <Method Object _5B_I.clone()>
	//* 105  229:astore          4
	//* 106  231:goto            81
	//* 107  234:aload_0         
	//* 108  235:getfield        #55  <Field Object value>
	//* 109  238:instanceof      #74  <Class long[]>
	//* 110  241:ifeq            259
	//* 111  244:aload_0         
	//* 112  245:getfield        #55  <Field Object value>
	//* 113  248:checkcast       #74  <Class long[]>
	//* 114  251:invokevirtual   #75  <Method Object _5B_J.clone()>
	//* 115  254:astore          4
	//* 116  256:goto            81
	//* 117  259:aload_0         
	//* 118  260:getfield        #55  <Field Object value>
	//* 119  263:instanceof      #77  <Class float[]>
	//* 120  266:ifeq            284
	//* 121  269:aload_0         
	//* 122  270:getfield        #55  <Field Object value>
	//* 123  273:checkcast       #77  <Class float[]>
	//* 124  276:invokevirtual   #78  <Method Object _5B_F.clone()>
	//* 125  279:astore          4
	//* 126  281:goto            81
	//* 127  284:aload_0         
	//* 128  285:getfield        #55  <Field Object value>
	//* 129  288:instanceof      #80  <Class double[]>
	//* 130  291:ifeq            309
	//* 131  294:aload_0         
	//* 132  295:getfield        #55  <Field Object value>
	//* 133  298:checkcast       #80  <Class double[]>
	//* 134  301:invokevirtual   #81  <Method Object _5B_D.clone()>
	//* 135  304:astore          4
	//* 136  306:goto            81
	//* 137  309:aload_0         
	//* 138  310:getfield        #55  <Field Object value>
	//* 139  313:instanceof      #83  <Class zzyi[]>
	//* 140  316:ifeq            373
	//* 141  319:aload_0         
	//* 142  320:getfield        #55  <Field Object value>
	//* 143  323:checkcast       #83  <Class zzyi[]>
	//* 144  326:astore          4
	//* 145  328:aload           4
	//* 146  330:arraylength     
	//* 147  331:anewarray       zzyi[]
	//* 148  334:astore          6
	//* 149  336:aload           5
	//* 150  338:aload           6
	//* 151  340:putfield        #55  <Field Object value>
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
	//* 163  359:invokevirtual   #61  <Method Object zzyi.clone()>
	//* 164  362:checkcast       #57  <Class zzyi>
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
	//  174  378:new             #85  <Class AssertionError>
	//  175  381:dup             
	//  176  382:aload           4
	//  177  384:invokespecial   #88  <Method void AssertionError(Object)>
	//  178  387:athrow          
		}
		flag = false;
		i = 0;
		if(!flag1) goto _L7; else goto _L6
_L6:
		obj = ((Object) ((byte[][])value));
		obj1 = ((Object) (new byte[obj.length][]));
		zzyf1.value = obj1;
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
		if(!(value instanceof zzyi[])) goto _L2; else goto _L10
_L10:
		azzyi = (zzyi[])value;
		obj1 = ((Object) (new zzyi[azzyi.length]));
		zzyf1.value = obj1;
		i = ((int) (flag));
_L11:
		if(i >= azzyi.length)
			break; /* Loop/switch isn't completed */
		obj1[i] = (zzyi)azzyi[i].clone();
		i++;
		if(true) goto _L11; else goto _L2
_L2:
		return zzyf1;
	}

	public final Object clone()
	{
		return ((Object) (zzzc()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method zzyf zzzc()>
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
	//*  14   22:getfield        #55  <Field Object value>
	//*  15   25:ifnull          259
	//*  16   28:aload_1         
	//*  17   29:getfield        #55  <Field Object value>
	//*  18   32:ifnull          259
		{
			if(zzcfc != ((zzyf) (obj)).zzcfc)
	//*  19   35:aload_0         
	//*  20   36:getfield        #47  <Field zzyd zzcfc>
	//*  21   39:aload_1         
	//*  22   40:getfield        #47  <Field zzyd zzcfc>
	//*  23   43:if_acmpeq       48
				return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
			if(!zzcfc.zzcew.isArray())
	//*  26   48:aload_0         
	//*  27   49:getfield        #47  <Field zzyd zzcfc>
	//*  28   52:getfield        #100 <Field Class zzyd.zzcew>
	//*  29   55:invokevirtual   #106 <Method boolean Class.isArray()>
	//*  30   58:ifne            73
				return value.equals(((zzyf) (obj)).value);
	//   31   61:aload_0         
	//   32   62:getfield        #55  <Field Object value>
	//   33   65:aload_1         
	//   34   66:getfield        #55  <Field Object value>
	//   35   69:invokevirtual   #108 <Method boolean Object.equals(Object)>
	//   36   72:ireturn         
			if(value instanceof byte[])
	//*  37   73:aload_0         
	//*  38   74:getfield        #55  <Field Object value>
	//*  39   77:instanceof      #63  <Class byte[]>
	//*  40   80:ifeq            101
				return Arrays.equals((byte[])value, (byte[])((zzyf) (obj)).value);
	//   41   83:aload_0         
	//   42   84:getfield        #55  <Field Object value>
	//   43   87:checkcast       #63  <Class byte[]>
	//   44   90:aload_1         
	//   45   91:getfield        #55  <Field Object value>
	//   46   94:checkcast       #63  <Class byte[]>
	//   47   97:invokestatic    #113 <Method boolean Arrays.equals(byte[], byte[])>
	//   48  100:ireturn         
			if(value instanceof int[])
	//*  49  101:aload_0         
	//*  50  102:getfield        #55  <Field Object value>
	//*  51  105:instanceof      #71  <Class int[]>
	//*  52  108:ifeq            129
				return Arrays.equals((int[])value, (int[])((zzyf) (obj)).value);
	//   53  111:aload_0         
	//   54  112:getfield        #55  <Field Object value>
	//   55  115:checkcast       #71  <Class int[]>
	//   56  118:aload_1         
	//   57  119:getfield        #55  <Field Object value>
	//   58  122:checkcast       #71  <Class int[]>
	//   59  125:invokestatic    #116 <Method boolean Arrays.equals(int[], int[])>
	//   60  128:ireturn         
			if(value instanceof long[])
	//*  61  129:aload_0         
	//*  62  130:getfield        #55  <Field Object value>
	//*  63  133:instanceof      #74  <Class long[]>
	//*  64  136:ifeq            157
				return Arrays.equals((long[])value, (long[])((zzyf) (obj)).value);
	//   65  139:aload_0         
	//   66  140:getfield        #55  <Field Object value>
	//   67  143:checkcast       #74  <Class long[]>
	//   68  146:aload_1         
	//   69  147:getfield        #55  <Field Object value>
	//   70  150:checkcast       #74  <Class long[]>
	//   71  153:invokestatic    #119 <Method boolean Arrays.equals(long[], long[])>
	//   72  156:ireturn         
			if(value instanceof float[])
	//*  73  157:aload_0         
	//*  74  158:getfield        #55  <Field Object value>
	//*  75  161:instanceof      #77  <Class float[]>
	//*  76  164:ifeq            185
				return Arrays.equals((float[])value, (float[])((zzyf) (obj)).value);
	//   77  167:aload_0         
	//   78  168:getfield        #55  <Field Object value>
	//   79  171:checkcast       #77  <Class float[]>
	//   80  174:aload_1         
	//   81  175:getfield        #55  <Field Object value>
	//   82  178:checkcast       #77  <Class float[]>
	//   83  181:invokestatic    #122 <Method boolean Arrays.equals(float[], float[])>
	//   84  184:ireturn         
			if(value instanceof double[])
	//*  85  185:aload_0         
	//*  86  186:getfield        #55  <Field Object value>
	//*  87  189:instanceof      #80  <Class double[]>
	//*  88  192:ifeq            213
				return Arrays.equals((double[])value, (double[])((zzyf) (obj)).value);
	//   89  195:aload_0         
	//   90  196:getfield        #55  <Field Object value>
	//   91  199:checkcast       #80  <Class double[]>
	//   92  202:aload_1         
	//   93  203:getfield        #55  <Field Object value>
	//   94  206:checkcast       #80  <Class double[]>
	//   95  209:invokestatic    #125 <Method boolean Arrays.equals(double[], double[])>
	//   96  212:ireturn         
			if(value instanceof boolean[])
	//*  97  213:aload_0         
	//*  98  214:getfield        #55  <Field Object value>
	//*  99  217:instanceof      #68  <Class boolean[]>
	//* 100  220:ifeq            241
				return Arrays.equals((boolean[])value, (boolean[])((zzyf) (obj)).value);
	//  101  223:aload_0         
	//  102  224:getfield        #55  <Field Object value>
	//  103  227:checkcast       #68  <Class boolean[]>
	//  104  230:aload_1         
	//  105  231:getfield        #55  <Field Object value>
	//  106  234:checkcast       #68  <Class boolean[]>
	//  107  237:invokestatic    #128 <Method boolean Arrays.equals(boolean[], boolean[])>
	//  108  240:ireturn         
			else
				return Arrays.deepEquals((Object[])value, (Object[])((zzyf) (obj)).value);
	//  109  241:aload_0         
	//  110  242:getfield        #55  <Field Object value>
	//  111  245:checkcast       #130 <Class Object[]>
	//  112  248:aload_1         
	//  113  249:getfield        #55  <Field Object value>
	//  114  252:checkcast       #130 <Class Object[]>
	//  115  255:invokestatic    #134 <Method boolean Arrays.deepEquals(Object[], Object[])>
	//  116  258:ireturn         
		}
		if(zzcfd != null && ((zzyf) (obj)).zzcfd != null)
	//* 117  259:aload_0         
	//* 118  260:getfield        #23  <Field List zzcfd>
	//* 119  263:ifnull          287
	//* 120  266:aload_1         
	//* 121  267:getfield        #23  <Field List zzcfd>
	//* 122  270:ifnull          287
			return zzcfd.equals(((Object) (((zzyf) (obj)).zzcfd)));
	//  123  273:aload_0         
	//  124  274:getfield        #23  <Field List zzcfd>
	//  125  277:aload_1         
	//  126  278:getfield        #23  <Field List zzcfd>
	//  127  281:invokeinterface #135 <Method boolean List.equals(Object)>
	//  128  286:ireturn         
		boolean flag;
		try
		{
			flag = Arrays.equals(toByteArray(), ((zzyf) (obj)).toByteArray());
	//  129  287:aload_0         
	//  130  288:invokespecial   #137 <Method byte[] toByteArray()>
	//  131  291:aload_1         
	//  132  292:invokespecial   #137 <Method byte[] toByteArray()>
	//  133  295:invokestatic    #113 <Method boolean Arrays.equals(byte[], byte[])>
	//  134  298:istore_2        
		}
	//* 135  299:iload_2         
	//* 136  300:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 137  301:astore_1        
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//  138  302:new             #139 <Class IllegalStateException>
	//  139  305:dup             
	//  140  306:aload_1         
	//  141  307:invokespecial   #142 <Method void IllegalStateException(Throwable)>
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
	//    1    1:invokespecial   #137 <Method byte[] toByteArray()>
	//    2    4:invokestatic    #146 <Method int Arrays.hashCode(byte[])>
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
	//    9   15:new             #139 <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #142 <Method void IllegalStateException(Throwable)>
	//   13   23:athrow          
		}
		return i + 527;
	}

	final void zza(zzya zzya1)
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Object value>
	//*   2    4:ifnull          78
		{
			zzyd zzyd1 = zzcfc;
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field zzyd zzcfc>
	//    5   11:astore          4
			Object obj = value;
	//    6   13:aload_0         
	//    7   14:getfield        #55  <Field Object value>
	//    8   17:astore          5
			if(zzyd1.zzcex)
	//*   9   19:aload           4
	//*  10   21:getfield        #150 <Field boolean zzyd.zzcex>
	//*  11   24:ifeq            69
			{
				int j = Array.getLength(obj);
	//   12   27:aload           5
	//   13   29:invokestatic    #156 <Method int Array.getLength(Object)>
	//   14   32:istore_3        
				for(int i = 0; i < j; i++)
	//*  15   33:iconst_0        
	//*  16   34:istore_2        
	//*  17   35:iload_2         
	//*  18   36:iload_3         
	//*  19   37:icmpge          68
				{
					Object obj1 = Array.get(obj, i);
	//   20   40:aload           5
	//   21   42:iload_2         
	//   22   43:invokestatic    #160 <Method Object Array.get(Object, int)>
	//   23   46:astore          6
					if(obj1 != null)
	//*  24   48:aload           6
	//*  25   50:ifnull          61
						zzyd1.zza(obj1, zzya1);
	//   26   53:aload           4
	//   27   55:aload           6
	//   28   57:aload_1         
	//   29   58:invokevirtual   #163 <Method void zzyd.zza(Object, zzya)>
				}

	//   30   61:iload_2         
	//   31   62:iconst_1        
	//   32   63:iadd            
	//   33   64:istore_2        
	//*  34   65:goto            35
				return;
	//   35   68:return          
			} else
			{
				zzyd1.zza(obj, zzya1);
	//   36   69:aload           4
	//   37   71:aload           5
	//   38   73:aload_1         
	//   39   74:invokevirtual   #163 <Method void zzyd.zza(Object, zzya)>
				return;
	//   40   77:return          
			}
		}
		zzyk zzyk1;
		for(Iterator iterator = zzcfd.iterator(); iterator.hasNext(); zzya1.zzp(zzyk1.zzbtz))
	//*  41   78:aload_0         
	//*  42   79:getfield        #23  <Field List zzcfd>
	//*  43   82:invokeinterface #167 <Method Iterator List.iterator()>
	//*  44   87:astore          4
	//*  45   89:aload           4
	//*  46   91:invokeinterface #172 <Method boolean Iterator.hasNext()>
	//*  47   96:ifeq            132
		{
			zzyk1 = (zzyk)iterator.next();
	//   48   99:aload           4
	//   49  101:invokeinterface #175 <Method Object Iterator.next()>
	//   50  106:checkcast       #177 <Class zzyk>
	//   51  109:astore          5
			zzya1.zzcd(zzyk1.tag);
	//   52  111:aload_1         
	//   53  112:aload           5
	//   54  114:getfield        #181 <Field int zzyk.tag>
	//   55  117:invokevirtual   #185 <Method void zzya.zzcd(int)>
		}

	//   56  120:aload_1         
	//   57  121:aload           5
	//   58  123:getfield        #188 <Field byte[] zzyk.zzbtz>
	//   59  126:invokevirtual   #192 <Method void zzya.zzp(byte[])>
	//*  60  129:goto            89
	//   61  132:return          
	}

	final void zza(zzyk zzyk1)
	{
		if(zzcfd != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List zzcfd>
	//*   2    4:ifnull          19
		{
			zzcfd.add(((Object) (zzyk1)));
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field List zzcfd>
	//    5   11:aload_1         
	//    6   12:invokeinterface #196 <Method boolean List.add(Object)>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		if(value instanceof zzyi)
	//*   9   19:aload_0         
	//*  10   20:getfield        #55  <Field Object value>
	//*  11   23:instanceof      #57  <Class zzyi>
	//*  12   26:ifeq            80
		{
			zzyk1 = ((zzyk) (zzyk1.zzbtz));
	//   13   29:aload_1         
	//   14   30:getfield        #188 <Field byte[] zzyk.zzbtz>
	//   15   33:astore_1        
			zzxz zzxz1 = zzxz.zzj(((byte []) (zzyk1)), 0, zzyk1.length);
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:arraylength     
	//   20   38:invokestatic    #202 <Method zzxz zzxz.zzj(byte[], int, int)>
	//   21   41:astore          4
			int i = zzxz1.zzvb();
	//   22   43:aload           4
	//   23   45:invokevirtual   #205 <Method int zzxz.zzvb()>
	//   24   48:istore_2        
			if(i != zzyk1.length - zzya.zzbe(i))
	//*  25   49:iload_2         
	//*  26   50:aload_1         
	//*  27   51:arraylength     
	//*  28   52:iload_2         
	//*  29   53:invokestatic    #209 <Method int zzya.zzbe(int)>
	//*  30   56:isub            
	//*  31   57:icmpeq          64
				throw zzyh.zzzd();
	//   32   60:invokestatic    #215 <Method zzyh zzyh.zzzd()>
	//   33   63:athrow          
			zzyk1 = ((zzyk) (((zzyi)value).zza(zzxz1)));
	//   34   64:aload_0         
	//   35   65:getfield        #55  <Field Object value>
	//   36   68:checkcast       #57  <Class zzyi>
	//   37   71:aload           4
	//   38   73:invokevirtual   #218 <Method zzyi zzyi.zza(zzxz)>
	//   39   76:astore_1        
			break MISSING_BLOCK_LABEL_277;
	//   40   77:goto            277
		}
		if(!(value instanceof zzyi[])) goto _L2; else goto _L1
	//   41   80:aload_0         
	//   42   81:getfield        #55  <Field Object value>
	//   43   84:instanceof      #83  <Class zzyi[]>
	//   44   87:ifeq            151
_L1:
		int j;
		int k;
		Object aobj[];
		aobj = ((Object []) ((zzyi[])zzcfc.zzai(Collections.singletonList(((Object) (zzyk1))))));
	//   45   90:aload_0         
	//   46   91:getfield        #47  <Field zzyd zzcfc>
	//   47   94:aload_1         
	//   48   95:invokestatic    #224 <Method List Collections.singletonList(Object)>
	//   49   98:invokevirtual   #228 <Method Object zzyd.zzai(List)>
	//   50  101:checkcast       #83  <Class zzyi[]>
	//   51  104:astore          4
		zzyi azzyi[] = (zzyi[])value;
	//   52  106:aload_0         
	//   53  107:getfield        #55  <Field Object value>
	//   54  110:checkcast       #83  <Class zzyi[]>
	//   55  113:astore          5
		zzyk1 = ((zzyk) ((zzyi[])Arrays.copyOf(((Object []) (azzyi)), azzyi.length + aobj.length)));
	//   56  115:aload           5
	//   57  117:aload           5
	//   58  119:arraylength     
	//   59  120:aload           4
	//   60  122:arraylength     
	//   61  123:iadd            
	//   62  124:invokestatic    #232 <Method Object[] Arrays.copyOf(Object[], int)>
	//   63  127:checkcast       #83  <Class zzyi[]>
	//   64  130:astore_1        
		j = azzyi.length;
	//   65  131:aload           5
	//   66  133:arraylength     
	//   67  134:istore_2        
		k = aobj.length;
	//   68  135:aload           4
	//   69  137:arraylength     
	//   70  138:istore_3        
_L4:
		System.arraycopy(((Object) (aobj)), 0, ((Object) (zzyk1)), j, k);
	//   71  139:aload           4
	//   72  141:iconst_0        
	//   73  142:aload_1         
	//   74  143:iload_2         
	//   75  144:iload_3         
	//   76  145:invokestatic    #238 <Method void System.arraycopy(Object, int, Object, int, int)>
		break MISSING_BLOCK_LABEL_277;
	//   77  148:goto            277
_L2:
		if(value instanceof zzvv)
	//*  78  151:aload_0         
	//*  79  152:getfield        #55  <Field Object value>
	//*  80  155:instanceof      #240 <Class zzvv>
	//*  81  158:ifeq            203
		{
			zzyk1 = ((zzyk) ((zzvv)zzcfc.zzai(Collections.singletonList(((Object) (zzyk1))))));
	//   82  161:aload_0         
	//   83  162:getfield        #47  <Field zzyd zzcfc>
	//   84  165:aload_1         
	//   85  166:invokestatic    #224 <Method List Collections.singletonList(Object)>
	//   86  169:invokevirtual   #228 <Method Object zzyd.zzai(List)>
	//   87  172:checkcast       #240 <Class zzvv>
	//   88  175:astore_1        
			zzyk1 = ((zzyk) (((zzvv)value).zzwh().zza(((zzvv) (zzyk1))).zzwo()));
	//   89  176:aload_0         
	//   90  177:getfield        #55  <Field Object value>
	//   91  180:checkcast       #240 <Class zzvv>
	//   92  183:invokeinterface #244 <Method zzvw zzvv.zzwh()>
	//   93  188:aload_1         
	//   94  189:invokeinterface #249 <Method zzvw zzvw.zza(zzvv)>
	//   95  194:invokeinterface #253 <Method zzvv zzvw.zzwo()>
	//   96  199:astore_1        
			break MISSING_BLOCK_LABEL_277;
	//   97  200:goto            277
		}
		if(!(value instanceof zzvv[]))
			break; /* Loop/switch isn't completed */
	//   98  203:aload_0         
	//   99  204:getfield        #55  <Field Object value>
	//  100  207:instanceof      #255 <Class zzvv[]>
	//  101  210:ifeq            265
		aobj = ((Object []) ((zzvv[])zzcfc.zzai(Collections.singletonList(((Object) (zzyk1))))));
	//  102  213:aload_0         
	//  103  214:getfield        #47  <Field zzyd zzcfc>
	//  104  217:aload_1         
	//  105  218:invokestatic    #224 <Method List Collections.singletonList(Object)>
	//  106  221:invokevirtual   #228 <Method Object zzyd.zzai(List)>
	//  107  224:checkcast       #255 <Class zzvv[]>
	//  108  227:astore          4
		zzvv azzvv[] = (zzvv[])value;
	//  109  229:aload_0         
	//  110  230:getfield        #55  <Field Object value>
	//  111  233:checkcast       #255 <Class zzvv[]>
	//  112  236:astore          5
		zzyk1 = ((zzyk) ((zzvv[])Arrays.copyOf(((Object []) (azzvv)), azzvv.length + aobj.length)));
	//  113  238:aload           5
	//  114  240:aload           5
	//  115  242:arraylength     
	//  116  243:aload           4
	//  117  245:arraylength     
	//  118  246:iadd            
	//  119  247:invokestatic    #232 <Method Object[] Arrays.copyOf(Object[], int)>
	//  120  250:checkcast       #255 <Class zzvv[]>
	//  121  253:astore_1        
		j = azzvv.length;
	//  122  254:aload           5
	//  123  256:arraylength     
	//  124  257:istore_2        
		k = aobj.length;
	//  125  258:aload           4
	//  126  260:arraylength     
	//  127  261:istore_3        
		if(true) goto _L4; else goto _L3
	//  128  262:goto            139
_L3:
		zzyk1 = ((zzyk) (zzcfc.zzai(Collections.singletonList(((Object) (zzyk1))))));
	//  129  265:aload_0         
	//  130  266:getfield        #47  <Field zzyd zzcfc>
	//  131  269:aload_1         
	//  132  270:invokestatic    #224 <Method List Collections.singletonList(Object)>
	//  133  273:invokevirtual   #228 <Method Object zzyd.zzai(List)>
	//  134  276:astore_1        
		zzcfc = zzcfc;
	//  135  277:aload_0         
	//  136  278:aload_0         
	//  137  279:getfield        #47  <Field zzyd zzcfc>
	//  138  282:putfield        #47  <Field zzyd zzcfc>
		value = ((Object) (zzyk1));
	//  139  285:aload_0         
	//  140  286:aload_1         
	//  141  287:putfield        #55  <Field Object value>
		zzcfd = null;
	//  142  290:aload_0         
	//  143  291:aconst_null     
	//  144  292:putfield        #23  <Field List zzcfd>
		return;
	//  145  295:return          
	}

	final Object zzb(zzyd zzyd1)
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Object value>
	//*   2    4:ifnull          29
		{
			if(!zzcfc.equals(((Object) (zzyd1))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field zzyd zzcfc>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #258 <Method boolean zzyd.equals(Object)>
	//*   7   15:ifne            51
				throw new IllegalStateException("Tried to getExtension with a different Extension.");
	//    8   18:new             #139 <Class IllegalStateException>
	//    9   21:dup             
	//   10   22:ldc2            #260 <String "Tried to getExtension with a different Extension.">
	//   11   25:invokespecial   #263 <Method void IllegalStateException(String)>
	//   12   28:athrow          
		} else
		{
			zzcfc = zzyd1;
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:putfield        #47  <Field zzyd zzcfc>
			value = zzyd1.zzai(zzcfd);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #23  <Field List zzcfd>
	//   20   40:invokevirtual   #228 <Method Object zzyd.zzai(List)>
	//   21   43:putfield        #55  <Field Object value>
			zzcfd = null;
	//   22   46:aload_0         
	//   23   47:aconst_null     
	//   24   48:putfield        #23  <Field List zzcfd>
		}
		return value;
	//   25   51:aload_0         
	//   26   52:getfield        #55  <Field Object value>
	//   27   55:areturn         
	}

	final int zzf()
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:astore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int l;
		if(obj != null)
	//*   5    8:aload           5
	//*   6   10:ifnull          92
		{
			zzyd zzyd1 = zzcfc;
	//    7   13:aload_0         
	//    8   14:getfield        #47  <Field zzyd zzcfc>
	//    9   17:astore          5
			Object obj1 = value;
	//   10   19:aload_0         
	//   11   20:getfield        #55  <Field Object value>
	//   12   23:astore          6
			if(zzyd1.zzcex)
	//*  13   25:aload           5
	//*  14   27:getfield        #150 <Field boolean zzyd.zzcex>
	//*  15   30:ifeq            84
			{
				int i1 = Array.getLength(obj1);
	//   16   33:aload           6
	//   17   35:invokestatic    #156 <Method int Array.getLength(Object)>
	//   18   38:istore          4
				int i = 0;
	//   19   40:iconst_0        
	//   20   41:istore_1        
				do
				{
					l = i;
	//   21   42:iload_1         
	//   22   43:istore_3        
					if(k >= i1)
						break;
	//   23   44:iload_2         
	//   24   45:iload           4
	//   25   47:icmpge          152
					Object obj2 = Array.get(obj1, k);
	//   26   50:aload           6
	//   27   52:iload_2         
	//   28   53:invokestatic    #160 <Method Object Array.get(Object, int)>
	//   29   56:astore          7
					l = i;
	//   30   58:iload_1         
	//   31   59:istore_3        
					if(obj2 != null)
	//*  32   60:aload           7
	//*  33   62:ifnull          75
						l = i + zzyd1.zzao(obj2);
	//   34   65:iload_1         
	//   35   66:aload           5
	//   36   68:aload           7
	//   37   70:invokevirtual   #268 <Method int zzyd.zzao(Object)>
	//   38   73:iadd            
	//   39   74:istore_3        
					k++;
	//   40   75:iload_2         
	//   41   76:iconst_1        
	//   42   77:iadd            
	//   43   78:istore_2        
					i = l;
	//   44   79:iload_3         
	//   45   80:istore_1        
				} while(true);
	//   46   81:goto            42
			} else
			{
				return zzyd1.zzao(obj1);
	//   47   84:aload           5
	//   48   86:aload           6
	//   49   88:invokevirtual   #268 <Method int zzyd.zzao(Object)>
	//   50   91:ireturn         
			}
		} else
		{
			Iterator iterator = zzcfd.iterator();
	//   51   92:aload_0         
	//   52   93:getfield        #23  <Field List zzcfd>
	//   53   96:invokeinterface #167 <Method Iterator List.iterator()>
	//   54  101:astore          5
			int j = 0;
	//   55  103:iconst_0        
	//   56  104:istore_1        
			do
			{
				l = j;
	//   57  105:iload_1         
	//   58  106:istore_3        
				if(!iterator.hasNext())
					break;
	//   59  107:aload           5
	//   60  109:invokeinterface #172 <Method boolean Iterator.hasNext()>
	//   61  114:ifeq            152
				zzyk zzyk1 = (zzyk)iterator.next();
	//   62  117:aload           5
	//   63  119:invokeinterface #175 <Method Object Iterator.next()>
	//   64  124:checkcast       #177 <Class zzyk>
	//   65  127:astore          6
				j += zzya.zzbl(zzyk1.tag) + 0 + zzyk1.zzbtz.length;
	//   66  129:iload_1         
	//   67  130:aload           6
	//   68  132:getfield        #181 <Field int zzyk.tag>
	//   69  135:invokestatic    #271 <Method int zzya.zzbl(int)>
	//   70  138:iconst_0        
	//   71  139:iadd            
	//   72  140:aload           6
	//   73  142:getfield        #188 <Field byte[] zzyk.zzbtz>
	//   74  145:arraylength     
	//   75  146:iadd            
	//   76  147:iadd            
	//   77  148:istore_1        
			} while(true);
	//   78  149:goto            105
		}
		return l;
	//   79  152:iload_3         
	//   80  153:ireturn         
	}

	private Object value;
	private zzyd zzcfc;
	private List zzcfd;
}
