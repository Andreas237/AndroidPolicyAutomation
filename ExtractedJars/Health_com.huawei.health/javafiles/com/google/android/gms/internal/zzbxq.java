// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxm, zzbxo, zzbxv, zzbxt

class zzbxq
	implements Cloneable
{

	zzbxq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzcuP = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List zzcuP>
	//    7   15:return          
	}

	private byte[] toByteArray()
		throws IOException
	{
		byte abyte0[] = new byte[zzu()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int zzu()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		zza(zzbxm.zzag(abyte0));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #38  <Method zzbxm zzbxm.zzag(byte[])>
	//    7   12:invokevirtual   #42  <Method void zza(zzbxm)>
		return abyte0;
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzaeK()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method zzbxq zzaeK()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzbxq))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbxq>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzbxq)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbxq>
	//   12   20:astore_1        
		if(value != null && ((zzbxq) (obj)).value != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #55  <Field Object value>
	//*  15   25:ifnull          259
	//*  16   28:aload_1         
	//*  17   29:getfield        #55  <Field Object value>
	//*  18   32:ifnull          259
		{
			if(zzcuO != ((zzbxq) (obj)).zzcuO)
	//*  19   35:aload_0         
	//*  20   36:getfield        #57  <Field zzbxo zzcuO>
	//*  21   39:aload_1         
	//*  22   40:getfield        #57  <Field zzbxo zzcuO>
	//*  23   43:if_acmpeq       48
				return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
			if(!zzcuO.zzckM.isArray())
	//*  26   48:aload_0         
	//*  27   49:getfield        #57  <Field zzbxo zzcuO>
	//*  28   52:getfield        #63  <Field Class zzbxo.zzckM>
	//*  29   55:invokevirtual   #69  <Method boolean Class.isArray()>
	//*  30   58:ifne            73
				return value.equals(((zzbxq) (obj)).value);
	//   31   61:aload_0         
	//   32   62:getfield        #55  <Field Object value>
	//   33   65:aload_1         
	//   34   66:getfield        #55  <Field Object value>
	//   35   69:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//   36   72:ireturn         
			if(value instanceof byte[])
	//*  37   73:aload_0         
	//*  38   74:getfield        #55  <Field Object value>
	//*  39   77:instanceof      #73  <Class byte[]>
	//*  40   80:ifeq            101
				return Arrays.equals((byte[])value, (byte[])((zzbxq) (obj)).value);
	//   41   83:aload_0         
	//   42   84:getfield        #55  <Field Object value>
	//   43   87:checkcast       #73  <Class byte[]>
	//   44   90:aload_1         
	//   45   91:getfield        #55  <Field Object value>
	//   46   94:checkcast       #73  <Class byte[]>
	//   47   97:invokestatic    #78  <Method boolean Arrays.equals(byte[], byte[])>
	//   48  100:ireturn         
			if(value instanceof int[])
	//*  49  101:aload_0         
	//*  50  102:getfield        #55  <Field Object value>
	//*  51  105:instanceof      #80  <Class int[]>
	//*  52  108:ifeq            129
				return Arrays.equals((int[])value, (int[])((zzbxq) (obj)).value);
	//   53  111:aload_0         
	//   54  112:getfield        #55  <Field Object value>
	//   55  115:checkcast       #80  <Class int[]>
	//   56  118:aload_1         
	//   57  119:getfield        #55  <Field Object value>
	//   58  122:checkcast       #80  <Class int[]>
	//   59  125:invokestatic    #83  <Method boolean Arrays.equals(int[], int[])>
	//   60  128:ireturn         
			if(value instanceof long[])
	//*  61  129:aload_0         
	//*  62  130:getfield        #55  <Field Object value>
	//*  63  133:instanceof      #85  <Class long[]>
	//*  64  136:ifeq            157
				return Arrays.equals((long[])value, (long[])((zzbxq) (obj)).value);
	//   65  139:aload_0         
	//   66  140:getfield        #55  <Field Object value>
	//   67  143:checkcast       #85  <Class long[]>
	//   68  146:aload_1         
	//   69  147:getfield        #55  <Field Object value>
	//   70  150:checkcast       #85  <Class long[]>
	//   71  153:invokestatic    #88  <Method boolean Arrays.equals(long[], long[])>
	//   72  156:ireturn         
			if(value instanceof float[])
	//*  73  157:aload_0         
	//*  74  158:getfield        #55  <Field Object value>
	//*  75  161:instanceof      #90  <Class float[]>
	//*  76  164:ifeq            185
				return Arrays.equals((float[])value, (float[])((zzbxq) (obj)).value);
	//   77  167:aload_0         
	//   78  168:getfield        #55  <Field Object value>
	//   79  171:checkcast       #90  <Class float[]>
	//   80  174:aload_1         
	//   81  175:getfield        #55  <Field Object value>
	//   82  178:checkcast       #90  <Class float[]>
	//   83  181:invokestatic    #93  <Method boolean Arrays.equals(float[], float[])>
	//   84  184:ireturn         
			if(value instanceof double[])
	//*  85  185:aload_0         
	//*  86  186:getfield        #55  <Field Object value>
	//*  87  189:instanceof      #95  <Class double[]>
	//*  88  192:ifeq            213
				return Arrays.equals((double[])value, (double[])((zzbxq) (obj)).value);
	//   89  195:aload_0         
	//   90  196:getfield        #55  <Field Object value>
	//   91  199:checkcast       #95  <Class double[]>
	//   92  202:aload_1         
	//   93  203:getfield        #55  <Field Object value>
	//   94  206:checkcast       #95  <Class double[]>
	//   95  209:invokestatic    #98  <Method boolean Arrays.equals(double[], double[])>
	//   96  212:ireturn         
			if(value instanceof boolean[])
	//*  97  213:aload_0         
	//*  98  214:getfield        #55  <Field Object value>
	//*  99  217:instanceof      #100 <Class boolean[]>
	//* 100  220:ifeq            241
				return Arrays.equals((boolean[])value, (boolean[])((zzbxq) (obj)).value);
	//  101  223:aload_0         
	//  102  224:getfield        #55  <Field Object value>
	//  103  227:checkcast       #100 <Class boolean[]>
	//  104  230:aload_1         
	//  105  231:getfield        #55  <Field Object value>
	//  106  234:checkcast       #100 <Class boolean[]>
	//  107  237:invokestatic    #103 <Method boolean Arrays.equals(boolean[], boolean[])>
	//  108  240:ireturn         
			else
				return Arrays.deepEquals((Object[])value, (Object[])((zzbxq) (obj)).value);
	//  109  241:aload_0         
	//  110  242:getfield        #55  <Field Object value>
	//  111  245:checkcast       #105 <Class Object[]>
	//  112  248:aload_1         
	//  113  249:getfield        #55  <Field Object value>
	//  114  252:checkcast       #105 <Class Object[]>
	//  115  255:invokestatic    #109 <Method boolean Arrays.deepEquals(Object[], Object[])>
	//  116  258:ireturn         
		}
		if(zzcuP != null && ((zzbxq) (obj)).zzcuP != null)
	//* 117  259:aload_0         
	//* 118  260:getfield        #23  <Field List zzcuP>
	//* 119  263:ifnull          287
	//* 120  266:aload_1         
	//* 121  267:getfield        #23  <Field List zzcuP>
	//* 122  270:ifnull          287
			return zzcuP.equals(((Object) (((zzbxq) (obj)).zzcuP)));
	//  123  273:aload_0         
	//  124  274:getfield        #23  <Field List zzcuP>
	//  125  277:aload_1         
	//  126  278:getfield        #23  <Field List zzcuP>
	//  127  281:invokeinterface #112 <Method boolean List.equals(Object)>
	//  128  286:ireturn         
		boolean flag;
		try
		{
			flag = Arrays.equals(toByteArray(), ((zzbxq) (obj)).toByteArray());
	//  129  287:aload_0         
	//  130  288:invokespecial   #114 <Method byte[] toByteArray()>
	//  131  291:aload_1         
	//  132  292:invokespecial   #114 <Method byte[] toByteArray()>
	//  133  295:invokestatic    #78  <Method boolean Arrays.equals(byte[], byte[])>
	//  134  298:istore_2        
		}
	//* 135  299:iload_2         
	//* 136  300:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 137  301:astore_1        
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//  138  302:new             #116 <Class IllegalStateException>
	//  139  305:dup             
	//  140  306:aload_1         
	//  141  307:invokespecial   #119 <Method void IllegalStateException(Throwable)>
	//  142  310:athrow          
		}
		return flag;
	}

	public int hashCode()
	{
		int i;
		try
		{
			i = Arrays.hashCode(toByteArray());
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method byte[] toByteArray()>
	//    2    4:invokestatic    #123 <Method int Arrays.hashCode(byte[])>
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
	//    9   15:new             #116 <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #119 <Method void IllegalStateException(Throwable)>
	//   13   23:athrow          
		}
		return i + 527;
	}

	void zza(zzbxm zzbxm1)
		throws IOException
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Object value>
	//*   2    4:ifnull          20
		{
			zzcuO.zza(value, zzbxm1);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field zzbxo zzcuO>
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field Object value>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #126 <Method void zzbxo.zza(Object, zzbxm)>
			return;
	//    9   19:return          
		}
		for(Iterator iterator = zzcuP.iterator(); iterator.hasNext(); ((zzbxv)iterator.next()).zza(zzbxm1));
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field List zzcuP>
	//   12   24:invokeinterface #130 <Method Iterator List.iterator()>
	//   13   29:astore_2        
	//   14   30:aload_2         
	//   15   31:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            55
	//   17   39:aload_2         
	//   18   40:invokeinterface #138 <Method Object Iterator.next()>
	//   19   45:checkcast       #140 <Class zzbxv>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #141 <Method void zzbxv.zza(zzbxm)>
	//*  22   52:goto            30
	//   23   55:return          
	}

	void zza(zzbxv zzbxv1)
	{
		zzcuP.add(((Object) (zzbxv1)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzcuP>
	//    2    4:aload_1         
	//    3    5:invokeinterface #145 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final zzbxq zzaeK()
	{
		Object obj = ((Object) (new zzbxq()));
	//    0    0:new             #2   <Class zzbxq>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void zzbxq()>
	//    3    7:astore_2        
		obj.zzcuO = zzcuO;
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field zzbxo zzcuO>
	//    7   13:putfield        #57  <Field zzbxo zzcuO>
		if(zzcuP == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #23  <Field List zzcuP>
	//*  10   20:ifnonnull       31
		{
			obj.zzcuP = null;
	//   11   23:aload_2         
	//   12   24:aconst_null     
	//   13   25:putfield        #23  <Field List zzcuP>
			break MISSING_BLOCK_LABEL_45;
	//   14   28:goto            45
		}
		((zzbxq) (obj)).zzcuP.addAll(((java.util.Collection) (zzcuP)));
	//   15   31:aload_2         
	//   16   32:getfield        #23  <Field List zzcuP>
	//   17   35:aload_0         
	//   18   36:getfield        #23  <Field List zzcuP>
	//   19   39:invokeinterface #150 <Method boolean List.addAll(java.util.Collection)>
	//   20   44:pop             
		if(value == null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #55  <Field Object value>
	//*  23   49:ifnonnull       54
			return ((zzbxq) (obj));
	//   24   52:aload_2         
	//   25   53:areturn         
		if(!(value instanceof zzbxt))
			break MISSING_BLOCK_LABEL_83;
	//   26   54:aload_0         
	//   27   55:getfield        #55  <Field Object value>
	//   28   58:instanceof      #152 <Class zzbxt>
	//   29   61:ifeq            83
		obj.value = ((Object) ((zzbxt)((zzbxt)value).clone()));
	//   30   64:aload_2         
	//   31   65:aload_0         
	//   32   66:getfield        #55  <Field Object value>
	//   33   69:checkcast       #152 <Class zzbxt>
	//   34   72:invokevirtual   #154 <Method Object zzbxt.clone()>
	//   35   75:checkcast       #152 <Class zzbxt>
	//   36   78:putfield        #55  <Field Object value>
		return ((zzbxq) (obj));
	//   37   81:aload_2         
	//   38   82:areturn         
		if(!(value instanceof byte[]))
			break MISSING_BLOCK_LABEL_109;
	//   39   83:aload_0         
	//   40   84:getfield        #55  <Field Object value>
	//   41   87:instanceof      #73  <Class byte[]>
	//   42   90:ifeq            109
		obj.value = ((byte []) ((byte[])value)).clone();
	//   43   93:aload_2         
	//   44   94:aload_0         
	//   45   95:getfield        #55  <Field Object value>
	//   46   98:checkcast       #73  <Class byte[]>
	//   47  101:invokevirtual   #155 <Method Object _5B_B.clone()>
	//   48  104:putfield        #55  <Field Object value>
		return ((zzbxq) (obj));
	//   49  107:aload_2         
	//   50  108:areturn         
		Object obj1;
		Object obj2;
		if(!(value instanceof byte[][]))
			break MISSING_BLOCK_LABEL_168;
	//   51  109:aload_0         
	//   52  110:getfield        #55  <Field Object value>
	//   53  113:instanceof      #157 <Class byte[][]>
	//   54  116:ifeq            168
		obj1 = ((Object) ((byte[][])value));
	//   55  119:aload_0         
	//   56  120:getfield        #55  <Field Object value>
	//   57  123:checkcast       #157 <Class byte[][]>
	//   58  126:astore_3        
		obj2 = ((Object) (new byte[obj1.length][]));
	//   59  127:aload_3         
	//   60  128:arraylength     
	//   61  129:anewarray       byte[][]
	//   62  132:astore          4
		obj.value = obj2;
	//   63  134:aload_2         
	//   64  135:aload           4
	//   65  137:putfield        #55  <Field Object value>
		int i = 0;
	//   66  140:iconst_0        
	//   67  141:istore_1        
		do
		{
			try
			{
				if(i >= obj1.length)
					break;
	//   68  142:iload_1         
	//   69  143:aload_3         
	//   70  144:arraylength     
	//   71  145:icmpge          369
				obj2[i] = (byte[])((byte []) (obj1[i])).clone();
	//   72  148:aload           4
	//   73  150:iload_1         
	//   74  151:aload_3         
	//   75  152:iload_1         
	//   76  153:aaload          
	//   77  154:invokevirtual   #155 <Method Object _5B_B.clone()>
	//   78  157:checkcast       #73  <Class byte[]>
	//   79  160:aastore         
			}
	//*  80  161:iload_1         
	//*  81  162:iconst_1        
	//*  82  163:iadd            
	//*  83  164:istore_1        
	//*  84  165:goto            142
	//*  85  168:aload_0         
	//*  86  169:getfield        #55  <Field Object value>
	//*  87  172:instanceof      #100 <Class boolean[]>
	//*  88  175:ifeq            194
	//*  89  178:aload_2         
	//*  90  179:aload_0         
	//*  91  180:getfield        #55  <Field Object value>
	//*  92  183:checkcast       #100 <Class boolean[]>
	//*  93  186:invokevirtual   #158 <Method Object _5B_Z.clone()>
	//*  94  189:putfield        #55  <Field Object value>
	//*  95  192:aload_2         
	//*  96  193:areturn         
	//*  97  194:aload_0         
	//*  98  195:getfield        #55  <Field Object value>
	//*  99  198:instanceof      #80  <Class int[]>
	//* 100  201:ifeq            220
	//* 101  204:aload_2         
	//* 102  205:aload_0         
	//* 103  206:getfield        #55  <Field Object value>
	//* 104  209:checkcast       #80  <Class int[]>
	//* 105  212:invokevirtual   #159 <Method Object _5B_I.clone()>
	//* 106  215:putfield        #55  <Field Object value>
	//* 107  218:aload_2         
	//* 108  219:areturn         
	//* 109  220:aload_0         
	//* 110  221:getfield        #55  <Field Object value>
	//* 111  224:instanceof      #85  <Class long[]>
	//* 112  227:ifeq            246
	//* 113  230:aload_2         
	//* 114  231:aload_0         
	//* 115  232:getfield        #55  <Field Object value>
	//* 116  235:checkcast       #85  <Class long[]>
	//* 117  238:invokevirtual   #160 <Method Object _5B_J.clone()>
	//* 118  241:putfield        #55  <Field Object value>
	//* 119  244:aload_2         
	//* 120  245:areturn         
	//* 121  246:aload_0         
	//* 122  247:getfield        #55  <Field Object value>
	//* 123  250:instanceof      #90  <Class float[]>
	//* 124  253:ifeq            272
	//* 125  256:aload_2         
	//* 126  257:aload_0         
	//* 127  258:getfield        #55  <Field Object value>
	//* 128  261:checkcast       #90  <Class float[]>
	//* 129  264:invokevirtual   #161 <Method Object _5B_F.clone()>
	//* 130  267:putfield        #55  <Field Object value>
	//* 131  270:aload_2         
	//* 132  271:areturn         
	//* 133  272:aload_0         
	//* 134  273:getfield        #55  <Field Object value>
	//* 135  276:instanceof      #95  <Class double[]>
	//* 136  279:ifeq            298
	//* 137  282:aload_2         
	//* 138  283:aload_0         
	//* 139  284:getfield        #55  <Field Object value>
	//* 140  287:checkcast       #95  <Class double[]>
	//* 141  290:invokevirtual   #162 <Method Object _5B_D.clone()>
	//* 142  293:putfield        #55  <Field Object value>
	//* 143  296:aload_2         
	//* 144  297:areturn         
	//* 145  298:aload_0         
	//* 146  299:getfield        #55  <Field Object value>
	//* 147  302:instanceof      #164 <Class zzbxt[]>
	//* 148  305:ifeq            357
	//* 149  308:aload_0         
	//* 150  309:getfield        #55  <Field Object value>
	//* 151  312:checkcast       #164 <Class zzbxt[]>
	//* 152  315:astore_3        
	//* 153  316:aload_3         
	//* 154  317:arraylength     
	//* 155  318:anewarray       zzbxt[]
	//* 156  321:astore          4
	//* 157  323:aload_2         
	//* 158  324:aload           4
	//* 159  326:putfield        #55  <Field Object value>
	//* 160  329:iconst_0        
	//* 161  330:istore_1        
	//* 162  331:iload_1         
	//* 163  332:aload_3         
	//* 164  333:arraylength     
	//* 165  334:icmpge          357
	//* 166  337:aload           4
	//* 167  339:iload_1         
	//* 168  340:aload_3         
	//* 169  341:iload_1         
	//* 170  342:aaload          
	//* 171  343:invokevirtual   #154 <Method Object zzbxt.clone()>
	//* 172  346:checkcast       #152 <Class zzbxt>
	//* 173  349:aastore         
	//* 174  350:iload_1         
	//* 175  351:iconst_1        
	//* 176  352:iadd            
	//* 177  353:istore_1        
	//* 178  354:goto            331
	//* 179  357:aload_2         
	//* 180  358:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 181  359:astore_2        
			{
				throw new AssertionError(obj);
	//  182  360:new             #166 <Class AssertionError>
	//  183  363:dup             
	//  184  364:aload_2         
	//  185  365:invokespecial   #169 <Method void AssertionError(Object)>
	//  186  368:athrow          
			}
			i++;
		} while(true);
		break MISSING_BLOCK_LABEL_369;
		if(!(value instanceof boolean[]))
			break MISSING_BLOCK_LABEL_194;
		obj.value = ((boolean []) ((boolean[])value)).clone();
		return ((zzbxq) (obj));
		if(!(value instanceof int[]))
			break MISSING_BLOCK_LABEL_220;
		obj.value = ((int []) ((int[])value)).clone();
		return ((zzbxq) (obj));
		if(!(value instanceof long[]))
			break MISSING_BLOCK_LABEL_246;
		obj.value = ((long []) ((long[])value)).clone();
		return ((zzbxq) (obj));
		if(!(value instanceof float[]))
			break MISSING_BLOCK_LABEL_272;
		obj.value = ((float []) ((float[])value)).clone();
		return ((zzbxq) (obj));
		if(!(value instanceof double[]))
			break MISSING_BLOCK_LABEL_298;
		obj.value = ((double []) ((double[])value)).clone();
		return ((zzbxq) (obj));
		if(!(value instanceof zzbxt[])) goto _L2; else goto _L1
_L1:
		obj1 = ((Object) ((zzbxt[])value));
		obj2 = ((Object) (new zzbxt[obj1.length]));
		obj.value = obj2;
		i = 0;
_L3:
		if(i >= obj1.length)
			break; /* Loop/switch isn't completed */
		obj2[i] = (zzbxt)obj1[i].clone();
		i++;
		if(true) goto _L3; else goto _L2
_L2:
		return ((zzbxq) (obj));
		return ((zzbxq) (obj));
	//  187  369:aload_2         
	//  188  370:areturn         
	}

	Object zzb(zzbxo zzbxo1)
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Object value>
	//*   2    4:ifnull          28
		{
			if(!zzcuO.equals(((Object) (zzbxo1))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field zzbxo zzcuO>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #172 <Method boolean zzbxo.equals(Object)>
	//*   7   15:ifne            50
				throw new IllegalStateException("Tried to getExtension with a different Extension.");
	//    8   18:new             #116 <Class IllegalStateException>
	//    9   21:dup             
	//   10   22:ldc1            #174 <String "Tried to getExtension with a different Extension.">
	//   11   24:invokespecial   #177 <Method void IllegalStateException(String)>
	//   12   27:athrow          
		} else
		{
			zzcuO = zzbxo1;
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:putfield        #57  <Field zzbxo zzcuO>
			value = zzbxo1.zzac(zzcuP);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #23  <Field List zzcuP>
	//   20   39:invokevirtual   #181 <Method Object zzbxo.zzac(List)>
	//   21   42:putfield        #55  <Field Object value>
			zzcuP = null;
	//   22   45:aload_0         
	//   23   46:aconst_null     
	//   24   47:putfield        #23  <Field List zzcuP>
		}
		return value;
	//   25   50:aload_0         
	//   26   51:getfield        #55  <Field Object value>
	//   27   54:areturn         
	}

	int zzu()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(value != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #55  <Field Object value>
	//*   4    6:ifnull          21
			return zzcuO.zzaU(value);
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field zzbxo zzcuO>
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field Object value>
	//    9   17:invokevirtual   #187 <Method int zzbxo.zzaU(Object)>
	//   10   20:ireturn         
		for(Iterator iterator = zzcuP.iterator(); iterator.hasNext();)
	//*  11   21:aload_0         
	//*  12   22:getfield        #23  <Field List zzcuP>
	//*  13   25:invokeinterface #130 <Method Iterator List.iterator()>
	//*  14   30:astore_2        
	//*  15   31:aload_2         
	//*  16   32:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//*  17   37:ifeq            58
			i += ((zzbxv)iterator.next()).zzu();
	//   18   40:iload_1         
	//   19   41:aload_2         
	//   20   42:invokeinterface #138 <Method Object Iterator.next()>
	//   21   47:checkcast       #140 <Class zzbxv>
	//   22   50:invokevirtual   #188 <Method int zzbxv.zzu()>
	//   23   53:iadd            
	//   24   54:istore_1        

	//*  25   55:goto            31
		return i;
	//   26   58:iload_1         
	//   27   59:ireturn         
	}

	private Object value;
	private zzbxo zzcuO;
	private List zzcuP;
}
