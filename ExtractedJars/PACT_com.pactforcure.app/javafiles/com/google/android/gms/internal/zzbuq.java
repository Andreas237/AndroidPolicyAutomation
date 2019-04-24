// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbum, zzbuo, zzbuv, zzbut

class zzbuq
	implements Cloneable
{

	zzbuq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzcse = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List zzcse>
	//    7   15:return          
	}

	private byte[] toByteArray()
		throws IOException
	{
		byte abyte0[] = new byte[zzv()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method int zzv()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
		zza(zzbum.zzae(abyte0));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokestatic    #38  <Method zzbum zzbum.zzae(byte[])>
	//    7   12:invokevirtual   #42  <Method void zza(zzbum)>
		return abyte0;
	//    8   15:aload_1         
	//    9   16:areturn         
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzacQ()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method zzbuq zzacQ()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(obj == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       11
		{
			flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
		} else
	//*   7    9:iload_2         
	//*   8   10:ireturn         
		{
			flag = flag2;
	//    9   11:iload_3         
	//   10   12:istore_2        
			if(obj instanceof zzbuq)
	//*  11   13:aload_1         
	//*  12   14:instanceof      #2   <Class zzbuq>
	//*  13   17:ifeq            9
			{
				obj = ((Object) ((zzbuq)obj));
	//   14   20:aload_1         
	//   15   21:checkcast       #2   <Class zzbuq>
	//   16   24:astore_1        
				if(value != null && ((zzbuq) (obj)).value != null)
	//*  17   25:aload_0         
	//*  18   26:getfield        #55  <Field Object value>
	//*  19   29:ifnull          263
	//*  20   32:aload_1         
	//*  21   33:getfield        #55  <Field Object value>
	//*  22   36:ifnull          263
				{
					flag = flag2;
	//   23   39:iload_3         
	//   24   40:istore_2        
					if(zzcsd == ((zzbuq) (obj)).zzcsd)
	//*  25   41:aload_0         
	//*  26   42:getfield        #57  <Field zzbuo zzcsd>
	//*  27   45:aload_1         
	//*  28   46:getfield        #57  <Field zzbuo zzcsd>
	//*  29   49:if_acmpne       9
					{
						if(!zzcsd.zzciF.isArray())
	//*  30   52:aload_0         
	//*  31   53:getfield        #57  <Field zzbuo zzcsd>
	//*  32   56:getfield        #63  <Field Class zzbuo.zzciF>
	//*  33   59:invokevirtual   #69  <Method boolean Class.isArray()>
	//*  34   62:ifne            77
							return value.equals(((zzbuq) (obj)).value);
	//   35   65:aload_0         
	//   36   66:getfield        #55  <Field Object value>
	//   37   69:aload_1         
	//   38   70:getfield        #55  <Field Object value>
	//   39   73:invokevirtual   #71  <Method boolean Object.equals(Object)>
	//   40   76:ireturn         
						if(value instanceof byte[])
	//*  41   77:aload_0         
	//*  42   78:getfield        #55  <Field Object value>
	//*  43   81:instanceof      #73  <Class byte[]>
	//*  44   84:ifeq            105
							return Arrays.equals((byte[])value, (byte[])((zzbuq) (obj)).value);
	//   45   87:aload_0         
	//   46   88:getfield        #55  <Field Object value>
	//   47   91:checkcast       #73  <Class byte[]>
	//   48   94:aload_1         
	//   49   95:getfield        #55  <Field Object value>
	//   50   98:checkcast       #73  <Class byte[]>
	//   51  101:invokestatic    #78  <Method boolean Arrays.equals(byte[], byte[])>
	//   52  104:ireturn         
						if(value instanceof int[])
	//*  53  105:aload_0         
	//*  54  106:getfield        #55  <Field Object value>
	//*  55  109:instanceof      #80  <Class int[]>
	//*  56  112:ifeq            133
							return Arrays.equals((int[])value, (int[])((zzbuq) (obj)).value);
	//   57  115:aload_0         
	//   58  116:getfield        #55  <Field Object value>
	//   59  119:checkcast       #80  <Class int[]>
	//   60  122:aload_1         
	//   61  123:getfield        #55  <Field Object value>
	//   62  126:checkcast       #80  <Class int[]>
	//   63  129:invokestatic    #83  <Method boolean Arrays.equals(int[], int[])>
	//   64  132:ireturn         
						if(value instanceof long[])
	//*  65  133:aload_0         
	//*  66  134:getfield        #55  <Field Object value>
	//*  67  137:instanceof      #85  <Class long[]>
	//*  68  140:ifeq            161
							return Arrays.equals((long[])value, (long[])((zzbuq) (obj)).value);
	//   69  143:aload_0         
	//   70  144:getfield        #55  <Field Object value>
	//   71  147:checkcast       #85  <Class long[]>
	//   72  150:aload_1         
	//   73  151:getfield        #55  <Field Object value>
	//   74  154:checkcast       #85  <Class long[]>
	//   75  157:invokestatic    #88  <Method boolean Arrays.equals(long[], long[])>
	//   76  160:ireturn         
						if(value instanceof float[])
	//*  77  161:aload_0         
	//*  78  162:getfield        #55  <Field Object value>
	//*  79  165:instanceof      #90  <Class float[]>
	//*  80  168:ifeq            189
							return Arrays.equals((float[])value, (float[])((zzbuq) (obj)).value);
	//   81  171:aload_0         
	//   82  172:getfield        #55  <Field Object value>
	//   83  175:checkcast       #90  <Class float[]>
	//   84  178:aload_1         
	//   85  179:getfield        #55  <Field Object value>
	//   86  182:checkcast       #90  <Class float[]>
	//   87  185:invokestatic    #93  <Method boolean Arrays.equals(float[], float[])>
	//   88  188:ireturn         
						if(value instanceof double[])
	//*  89  189:aload_0         
	//*  90  190:getfield        #55  <Field Object value>
	//*  91  193:instanceof      #95  <Class double[]>
	//*  92  196:ifeq            217
							return Arrays.equals((double[])value, (double[])((zzbuq) (obj)).value);
	//   93  199:aload_0         
	//   94  200:getfield        #55  <Field Object value>
	//   95  203:checkcast       #95  <Class double[]>
	//   96  206:aload_1         
	//   97  207:getfield        #55  <Field Object value>
	//   98  210:checkcast       #95  <Class double[]>
	//   99  213:invokestatic    #98  <Method boolean Arrays.equals(double[], double[])>
	//  100  216:ireturn         
						if(value instanceof boolean[])
	//* 101  217:aload_0         
	//* 102  218:getfield        #55  <Field Object value>
	//* 103  221:instanceof      #100 <Class boolean[]>
	//* 104  224:ifeq            245
							return Arrays.equals((boolean[])value, (boolean[])((zzbuq) (obj)).value);
	//  105  227:aload_0         
	//  106  228:getfield        #55  <Field Object value>
	//  107  231:checkcast       #100 <Class boolean[]>
	//  108  234:aload_1         
	//  109  235:getfield        #55  <Field Object value>
	//  110  238:checkcast       #100 <Class boolean[]>
	//  111  241:invokestatic    #103 <Method boolean Arrays.equals(boolean[], boolean[])>
	//  112  244:ireturn         
						else
							return Arrays.deepEquals((Object[])value, (Object[])((zzbuq) (obj)).value);
	//  113  245:aload_0         
	//  114  246:getfield        #55  <Field Object value>
	//  115  249:checkcast       #105 <Class Object[]>
	//  116  252:aload_1         
	//  117  253:getfield        #55  <Field Object value>
	//  118  256:checkcast       #105 <Class Object[]>
	//  119  259:invokestatic    #109 <Method boolean Arrays.deepEquals(Object[], Object[])>
	//  120  262:ireturn         
					}
				} else
				{
					if(zzcse != null && ((zzbuq) (obj)).zzcse != null)
	//* 121  263:aload_0         
	//* 122  264:getfield        #23  <Field List zzcse>
	//* 123  267:ifnull          291
	//* 124  270:aload_1         
	//* 125  271:getfield        #23  <Field List zzcse>
	//* 126  274:ifnull          291
						return zzcse.equals(((Object) (((zzbuq) (obj)).zzcse)));
	//  127  277:aload_0         
	//  128  278:getfield        #23  <Field List zzcse>
	//  129  281:aload_1         
	//  130  282:getfield        #23  <Field List zzcse>
	//  131  285:invokeinterface #112 <Method boolean List.equals(Object)>
	//  132  290:ireturn         
					boolean flag1;
					try
					{
						flag1 = Arrays.equals(toByteArray(), ((zzbuq) (obj)).toByteArray());
	//  133  291:aload_0         
	//  134  292:invokespecial   #114 <Method byte[] toByteArray()>
	//  135  295:aload_1         
	//  136  296:invokespecial   #114 <Method byte[] toByteArray()>
	//  137  299:invokestatic    #78  <Method boolean Arrays.equals(byte[], byte[])>
	//  138  302:istore_2        
					}
	//* 139  303:iload_2         
	//* 140  304:ireturn         
					// Misplaced declaration of an exception variable
					catch(Object obj)
	//* 141  305:astore_1        
					{
						throw new IllegalStateException(((Throwable) (obj)));
	//  142  306:new             #116 <Class IllegalStateException>
	//  143  309:dup             
	//  144  310:aload_1         
	//  145  311:invokespecial   #119 <Method void IllegalStateException(Throwable)>
	//  146  314:athrow          
					}
					return flag1;
				}
			}
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

	void zza(zzbum zzbum1)
		throws IOException
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Object value>
	//*   2    4:ifnull          20
		{
			zzcsd.zza(value, zzbum1);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field zzbuo zzcsd>
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field Object value>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #126 <Method void zzbuo.zza(Object, zzbum)>
		} else
	//*   9   19:return          
		{
			Iterator iterator = zzcse.iterator();
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field List zzcse>
	//   12   24:invokeinterface #130 <Method Iterator List.iterator()>
	//   13   29:astore_2        
			while(iterator.hasNext()) 
	//*  14   30:aload_2         
	//*  15   31:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            19
				((zzbuv)iterator.next()).zza(zzbum1);
	//   17   39:aload_2         
	//   18   40:invokeinterface #138 <Method Object Iterator.next()>
	//   19   45:checkcast       #140 <Class zzbuv>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #141 <Method void zzbuv.zza(zzbum)>
		}
	//*  22   52:goto            30
	}

	void zza(zzbuv zzbuv1)
	{
		zzcse.add(((Object) (zzbuv1)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List zzcse>
	//    2    4:aload_1         
	//    3    5:invokeinterface #145 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final zzbuq zzacQ()
	{
		Object obj = ((Object) (new zzbuq()));
	//    0    0:new             #2   <Class zzbuq>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void zzbuq()>
	//    3    7:astore_2        
		obj.zzcsd = zzcsd;
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field zzbuo zzcsd>
	//    7   13:putfield        #57  <Field zzbuo zzcsd>
		if(zzcse != null) goto _L2; else goto _L1
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field List zzcse>
	//   10   20:ifnonnull       37
_L1:
		obj.zzcse = null;
	//   11   23:aload_2         
	//   12   24:aconst_null     
	//   13   25:putfield        #23  <Field List zzcse>
_L4:
		if(value == null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #55  <Field Object value>
	//*  16   32:ifnonnull       64
			return ((zzbuq) (obj));
	//   17   35:aload_2         
	//   18   36:areturn         
		break; /* Loop/switch isn't completed */
_L2:
		try
		{
			((zzbuq) (obj)).zzcse.addAll(((java.util.Collection) (zzcse)));
	//   19   37:aload_2         
	//   20   38:getfield        #23  <Field List zzcse>
	//   21   41:aload_0         
	//   22   42:getfield        #23  <Field List zzcse>
	//   23   45:invokeinterface #150 <Method boolean List.addAll(java.util.Collection)>
	//   24   50:pop             
		}
	//*  25   51:goto            28
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  26   54:astore_2        
		{
			throw new AssertionError(obj);
	//   27   55:new             #152 <Class AssertionError>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokespecial   #155 <Method void AssertionError(Object)>
	//   31   63:athrow          
		}
		if(true) goto _L4; else goto _L3
_L3:
		if(!(value instanceof zzbut))
			break MISSING_BLOCK_LABEL_93;
	//   32   64:aload_0         
	//   33   65:getfield        #55  <Field Object value>
	//   34   68:instanceof      #157 <Class zzbut>
	//   35   71:ifeq            93
		obj.value = ((Object) ((zzbut)((zzbut)value).clone()));
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #55  <Field Object value>
	//   39   79:checkcast       #157 <Class zzbut>
	//   40   82:invokevirtual   #159 <Method Object zzbut.clone()>
	//   41   85:checkcast       #157 <Class zzbut>
	//   42   88:putfield        #55  <Field Object value>
		return ((zzbuq) (obj));
	//   43   91:aload_2         
	//   44   92:areturn         
		if(!(value instanceof byte[]))
			break MISSING_BLOCK_LABEL_119;
	//   45   93:aload_0         
	//   46   94:getfield        #55  <Field Object value>
	//   47   97:instanceof      #73  <Class byte[]>
	//   48  100:ifeq            119
		obj.value = ((byte []) ((byte[])value)).clone();
	//   49  103:aload_2         
	//   50  104:aload_0         
	//   51  105:getfield        #55  <Field Object value>
	//   52  108:checkcast       #73  <Class byte[]>
	//   53  111:invokevirtual   #160 <Method Object _5B_B.clone()>
	//   54  114:putfield        #55  <Field Object value>
		return ((zzbuq) (obj));
	//   55  117:aload_2         
	//   56  118:areturn         
		if(!(value instanceof byte[][])) goto _L6; else goto _L5
	//   57  119:aload_0         
	//   58  120:getfield        #55  <Field Object value>
	//   59  123:instanceof      #162 <Class byte[][]>
	//   60  126:ifeq            178
_L5:
		Object obj1;
		Object obj2;
		obj1 = ((Object) ((byte[][])value));
	//   61  129:aload_0         
	//   62  130:getfield        #55  <Field Object value>
	//   63  133:checkcast       #162 <Class byte[][]>
	//   64  136:astore_3        
		obj2 = ((Object) (new byte[obj1.length][]));
	//   65  137:aload_3         
	//   66  138:arraylength     
	//   67  139:anewarray       byte[][]
	//   68  142:astore          4
		obj.value = obj2;
	//   69  144:aload_2         
	//   70  145:aload           4
	//   71  147:putfield        #55  <Field Object value>
		int i = 0;
	//   72  150:iconst_0        
	//   73  151:istore_1        
_L8:
		if(i >= obj1.length)
			break; /* Loop/switch isn't completed */
	//   74  152:iload_1         
	//   75  153:aload_3         
	//   76  154:arraylength     
	//   77  155:icmpge          367
		obj2[i] = (byte[])((byte []) (obj1[i])).clone();
	//   78  158:aload           4
	//   79  160:iload_1         
	//   80  161:aload_3         
	//   81  162:iload_1         
	//   82  163:aaload          
	//   83  164:invokevirtual   #160 <Method Object _5B_B.clone()>
	//   84  167:checkcast       #73  <Class byte[]>
	//   85  170:aastore         
		i++;
	//   86  171:iload_1         
	//   87  172:iconst_1        
	//   88  173:iadd            
	//   89  174:istore_1        
		if(true) goto _L8; else goto _L7
	//   90  175:goto            152
_L6:
		if(!(value instanceof boolean[]))
			break MISSING_BLOCK_LABEL_204;
	//   91  178:aload_0         
	//   92  179:getfield        #55  <Field Object value>
	//   93  182:instanceof      #100 <Class boolean[]>
	//   94  185:ifeq            204
		obj.value = ((boolean []) ((boolean[])value)).clone();
	//   95  188:aload_2         
	//   96  189:aload_0         
	//   97  190:getfield        #55  <Field Object value>
	//   98  193:checkcast       #100 <Class boolean[]>
	//   99  196:invokevirtual   #163 <Method Object _5B_Z.clone()>
	//  100  199:putfield        #55  <Field Object value>
		return ((zzbuq) (obj));
	//  101  202:aload_2         
	//  102  203:areturn         
		if(!(value instanceof int[]))
			break MISSING_BLOCK_LABEL_230;
	//  103  204:aload_0         
	//  104  205:getfield        #55  <Field Object value>
	//  105  208:instanceof      #80  <Class int[]>
	//  106  211:ifeq            230
		obj.value = ((int []) ((int[])value)).clone();
	//  107  214:aload_2         
	//  108  215:aload_0         
	//  109  216:getfield        #55  <Field Object value>
	//  110  219:checkcast       #80  <Class int[]>
	//  111  222:invokevirtual   #164 <Method Object _5B_I.clone()>
	//  112  225:putfield        #55  <Field Object value>
		return ((zzbuq) (obj));
	//  113  228:aload_2         
	//  114  229:areturn         
		if(!(value instanceof long[]))
			break MISSING_BLOCK_LABEL_256;
	//  115  230:aload_0         
	//  116  231:getfield        #55  <Field Object value>
	//  117  234:instanceof      #85  <Class long[]>
	//  118  237:ifeq            256
		obj.value = ((long []) ((long[])value)).clone();
	//  119  240:aload_2         
	//  120  241:aload_0         
	//  121  242:getfield        #55  <Field Object value>
	//  122  245:checkcast       #85  <Class long[]>
	//  123  248:invokevirtual   #165 <Method Object _5B_J.clone()>
	//  124  251:putfield        #55  <Field Object value>
		return ((zzbuq) (obj));
	//  125  254:aload_2         
	//  126  255:areturn         
		if(!(value instanceof float[]))
			break MISSING_BLOCK_LABEL_282;
	//  127  256:aload_0         
	//  128  257:getfield        #55  <Field Object value>
	//  129  260:instanceof      #90  <Class float[]>
	//  130  263:ifeq            282
		obj.value = ((float []) ((float[])value)).clone();
	//  131  266:aload_2         
	//  132  267:aload_0         
	//  133  268:getfield        #55  <Field Object value>
	//  134  271:checkcast       #90  <Class float[]>
	//  135  274:invokevirtual   #166 <Method Object _5B_F.clone()>
	//  136  277:putfield        #55  <Field Object value>
		return ((zzbuq) (obj));
	//  137  280:aload_2         
	//  138  281:areturn         
		if(!(value instanceof double[]))
			break MISSING_BLOCK_LABEL_308;
	//  139  282:aload_0         
	//  140  283:getfield        #55  <Field Object value>
	//  141  286:instanceof      #95  <Class double[]>
	//  142  289:ifeq            308
		obj.value = ((double []) ((double[])value)).clone();
	//  143  292:aload_2         
	//  144  293:aload_0         
	//  145  294:getfield        #55  <Field Object value>
	//  146  297:checkcast       #95  <Class double[]>
	//  147  300:invokevirtual   #167 <Method Object _5B_D.clone()>
	//  148  303:putfield        #55  <Field Object value>
		return ((zzbuq) (obj));
	//  149  306:aload_2         
	//  150  307:areturn         
		if(!(value instanceof zzbut[])) goto _L7; else goto _L9
	//  151  308:aload_0         
	//  152  309:getfield        #55  <Field Object value>
	//  153  312:instanceof      #169 <Class zzbut[]>
	//  154  315:ifeq            367
_L9:
		obj1 = ((Object) ((zzbut[])value));
	//  155  318:aload_0         
	//  156  319:getfield        #55  <Field Object value>
	//  157  322:checkcast       #169 <Class zzbut[]>
	//  158  325:astore_3        
		obj2 = ((Object) (new zzbut[obj1.length]));
	//  159  326:aload_3         
	//  160  327:arraylength     
	//  161  328:anewarray       zzbut[]
	//  162  331:astore          4
		obj.value = obj2;
	//  163  333:aload_2         
	//  164  334:aload           4
	//  165  336:putfield        #55  <Field Object value>
		i = 0;
	//  166  339:iconst_0        
	//  167  340:istore_1        
_L10:
		if(i >= obj1.length)
			break; /* Loop/switch isn't completed */
	//  168  341:iload_1         
	//  169  342:aload_3         
	//  170  343:arraylength     
	//  171  344:icmpge          367
		obj2[i] = (zzbut)obj1[i].clone();
	//  172  347:aload           4
	//  173  349:iload_1         
	//  174  350:aload_3         
	//  175  351:iload_1         
	//  176  352:aaload          
	//  177  353:invokevirtual   #159 <Method Object zzbut.clone()>
	//  178  356:checkcast       #157 <Class zzbut>
	//  179  359:aastore         
		i++;
	//  180  360:iload_1         
	//  181  361:iconst_1        
	//  182  362:iadd            
	//  183  363:istore_1        
		if(true) goto _L10; else goto _L7
	//  184  364:goto            341
_L7:
		return ((zzbuq) (obj));
	//  185  367:aload_2         
	//  186  368:areturn         
	}

	Object zzb(zzbuo zzbuo1)
	{
		if(value != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Object value>
	//*   2    4:ifnull          28
		{
			if(!zzcsd.equals(((Object) (zzbuo1))))
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field zzbuo zzcsd>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #172 <Method boolean zzbuo.equals(Object)>
	//*   7   15:ifne            50
				throw new IllegalStateException("Tried to getExtension with a different Extension.");
	//    8   18:new             #116 <Class IllegalStateException>
	//    9   21:dup             
	//   10   22:ldc1            #174 <String "Tried to getExtension with a different Extension.">
	//   11   24:invokespecial   #177 <Method void IllegalStateException(String)>
	//   12   27:athrow          
		} else
		{
			zzcsd = zzbuo1;
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:putfield        #57  <Field zzbuo zzcsd>
			value = zzbuo1.zzZ(zzcse);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #23  <Field List zzcse>
	//   20   39:invokevirtual   #181 <Method Object zzbuo.zzZ(List)>
	//   21   42:putfield        #55  <Field Object value>
			zzcse = null;
	//   22   45:aload_0         
	//   23   46:aconst_null     
	//   24   47:putfield        #23  <Field List zzcse>
		}
		return value;
	//   25   50:aload_0         
	//   26   51:getfield        #55  <Field Object value>
	//   27   54:areturn         
	}

	int zzv()
	{
		if(value == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:ifnull          21
_L1:
		int j = zzcsd.zzaR(value);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field zzbuo zzcsd>
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field Object value>
	//    7   15:invokevirtual   #187 <Method int zzbuo.zzaR(Object)>
	//    8   18:istore_2        
_L4:
		return j;
	//    9   19:iload_2         
	//   10   20:ireturn         
_L2:
		Iterator iterator = zzcse.iterator();
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field List zzcse>
	//   13   25:invokeinterface #130 <Method Iterator List.iterator()>
	//   14   30:astore_3        
		int i = 0;
	//   15   31:iconst_0        
	//   16   32:istore_1        
		do
		{
			j = i;
	//   17   33:iload_1         
	//   18   34:istore_2        
			if(!iterator.hasNext())
				continue;
	//   19   35:aload_3         
	//   20   36:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   21   41:ifeq            19
			i = ((zzbuv)iterator.next()).zzv() + i;
	//   22   44:aload_3         
	//   23   45:invokeinterface #138 <Method Object Iterator.next()>
	//   24   50:checkcast       #140 <Class zzbuv>
	//   25   53:invokevirtual   #188 <Method int zzbuv.zzv()>
	//   26   56:iload_1         
	//   27   57:iadd            
	//   28   58:istore_1        
		} while(true);
	//   29   59:goto            33
		if(true) goto _L4; else goto _L3
_L3:
	}

	private Object value;
	private zzbuo zzcsd;
	private List zzcse;
}
