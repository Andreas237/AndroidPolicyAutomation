// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.random;

import kotlin.internal.PlatformImplementations;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.*;

// Referenced classes of package kotlin.random:
//			PlatformRandomKt, RandomKt

public abstract class Random
{
	public static final class Companion extends Random
	{

		public int nextBits(int i)
		{
			return Random.Default.nextBits(i);
		//    0    0:getstatic       #43  <Field Random$Default Random.Default>
		//    1    3:iload_1         
		//    2    4:invokevirtual   #47  <Method int Random$Default.nextBits(int)>
		//    3    7:ireturn         
		}

		public static final Companion INSTANCE = new Companion();

		static 
		{
		//    0    0:new             #2   <Class Random$Companion>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void Random$Companion()>
		//    3    7:putstatic       #36  <Field Random$Companion INSTANCE>
		//*   4   10:return          
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Random()>
		//    2    4:return          
		}
	}

	public static final class Default extends Random
	{

		public static void Companion$annotations()
		{
		//    0    0:return          
		}

		public int nextBits(int i)
		{
			return Random.defaultRandom.nextBits(i);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:iload_1         
		//    2    4:invokevirtual   #59  <Method int Random.nextBits(int)>
		//    3    7:ireturn         
		}

		public boolean nextBoolean()
		{
			return Random.defaultRandom.nextBoolean();
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:invokevirtual   #62  <Method boolean Random.nextBoolean()>
		//    2    6:ireturn         
		}

		public byte[] nextBytes(int i)
		{
			return Random.defaultRandom.nextBytes(i);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:iload_1         
		//    2    4:invokevirtual   #66  <Method byte[] Random.nextBytes(int)>
		//    3    7:areturn         
		}

		public byte[] nextBytes(byte abyte0[])
		{
			Intrinsics.checkParameterIsNotNull(((Object) (abyte0)), "array");
		//    0    0:aload_1         
		//    1    1:ldc1            #69  <String "array">
		//    2    3:invokestatic    #75  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			return Random.defaultRandom.nextBytes(abyte0);
		//    3    6:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    4    9:aload_1         
		//    5   10:invokevirtual   #77  <Method byte[] Random.nextBytes(byte[])>
		//    6   13:areturn         
		}

		public byte[] nextBytes(byte abyte0[], int i, int j)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (abyte0)), "array");
		//    0    0:aload_1         
		//    1    1:ldc1            #69  <String "array">
		//    2    3:invokestatic    #75  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			return Random.defaultRandom.nextBytes(abyte0, i, j);
		//    3    6:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    4    9:aload_1         
		//    5   10:iload_2         
		//    6   11:iload_3         
		//    7   12:invokevirtual   #81  <Method byte[] Random.nextBytes(byte[], int, int)>
		//    8   15:areturn         
		}

		public double nextDouble()
		{
			return Random.defaultRandom.nextDouble();
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:invokevirtual   #84  <Method double Random.nextDouble()>
		//    2    6:dreturn         
		}

		public double nextDouble(double d)
		{
			return Random.defaultRandom.nextDouble(d);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:dload_1         
		//    2    4:invokevirtual   #87  <Method double Random.nextDouble(double)>
		//    3    7:dreturn         
		}

		public double nextDouble(double d, double d1)
		{
			return Random.defaultRandom.nextDouble(d, d1);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:dload_1         
		//    2    4:dload_3         
		//    3    5:invokevirtual   #90  <Method double Random.nextDouble(double, double)>
		//    4    8:dreturn         
		}

		public float nextFloat()
		{
			return Random.defaultRandom.nextFloat();
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:invokevirtual   #93  <Method float Random.nextFloat()>
		//    2    6:freturn         
		}

		public int nextInt()
		{
			return Random.defaultRandom.nextInt();
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:invokevirtual   #96  <Method int Random.nextInt()>
		//    2    6:ireturn         
		}

		public int nextInt(int i)
		{
			return Random.defaultRandom.nextInt(i);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:iload_1         
		//    2    4:invokevirtual   #98  <Method int Random.nextInt(int)>
		//    3    7:ireturn         
		}

		public int nextInt(int i, int j)
		{
			return Random.defaultRandom.nextInt(i, j);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:iload_1         
		//    2    4:iload_2         
		//    3    5:invokevirtual   #101 <Method int Random.nextInt(int, int)>
		//    4    8:ireturn         
		}

		public long nextLong()
		{
			return Random.defaultRandom.nextLong();
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:invokevirtual   #104 <Method long Random.nextLong()>
		//    2    6:lreturn         
		}

		public long nextLong(long l)
		{
			return Random.defaultRandom.nextLong(l);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:lload_1         
		//    2    4:invokevirtual   #107 <Method long Random.nextLong(long)>
		//    3    7:lreturn         
		}

		public long nextLong(long l, long l1)
		{
			return Random.defaultRandom.nextLong(l, l1);
		//    0    0:invokestatic    #57  <Method Random Random.access$getDefaultRandom$cp()>
		//    1    3:lload_1         
		//    2    4:lload_3         
		//    3    5:invokevirtual   #110 <Method long Random.nextLong(long, long)>
		//    4    8:lreturn         
		}

		private Default()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Random()>
		//    2    4:return          
		}

		public Default(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void Random$Default()>
		//    2    4:return          
		}
	}


	public Random()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] nextBytes$default(Random random, byte abyte0[], int i, int j, int k, Object obj)
	{
		if(obj != null)
	//*   0    0:aload           5
	//*   1    2:ifnull          15
			throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
	//    2    5:new             #82  <Class UnsupportedOperationException>
	//    3    8:dup             
	//    4    9:ldc1            #84  <String "Super calls with default arguments not supported in this target, function: nextBytes">
	//    5   11:invokespecial   #87  <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
		if((k & 2) != 0)
	//*   7   15:iload           4
	//*   8   17:iconst_2        
	//*   9   18:iand            
	//*  10   19:ifeq            24
			i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
		if((k & 4) != 0)
	//*  13   24:iload           4
	//*  14   26:iconst_4        
	//*  15   27:iand            
	//*  16   28:ifeq            34
			j = abyte0.length;
	//   17   31:aload_1         
	//   18   32:arraylength     
	//   19   33:istore_3        
		return random.nextBytes(abyte0, i, j);
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:iload_2         
	//   23   37:iload_3         
	//   24   38:invokevirtual   #90  <Method byte[] nextBytes(byte[], int, int)>
	//   25   41:areturn         
	}

	public abstract int nextBits(int i);

	public boolean nextBoolean()
	{
		return nextBits(1) != 0;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #94  <Method int nextBits(int)>
	//    3    5:ifeq            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public byte[] nextBytes(int i)
	{
		return nextBytes(new byte[i]);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:newarray        byte[]
	//    3    4:invokevirtual   #98  <Method byte[] nextBytes(byte[])>
	//    4    7:areturn         
	}

	public byte[] nextBytes(byte abyte0[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (abyte0)), "array");
	//    0    0:aload_1         
	//    1    1:ldc1            #99  <String "array">
	//    2    3:invokestatic    #105 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return nextBytes(abyte0, 0, abyte0.length);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:arraylength     
	//    8   11:invokevirtual   #90  <Method byte[] nextBytes(byte[], int, int)>
	//    9   14:areturn         
	}

	public byte[] nextBytes(byte abyte0[], int i, int j)
	{
		boolean flag;
		boolean flag1;
		int k1;
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (abyte0)), "array");
	//    0    0:aload_1         
	//    1    1:ldc1            #99  <String "array">
	//    2    3:invokestatic    #105 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
			k1 = 1;
	//    5    9:iconst_1        
	//    6   10:istore          6
			int k = abyte0.length;
	//    7   12:aload_1         
	//    8   13:arraylength     
	//    9   14:istore          4
			if(i >= 0 && k >= i)
	//*  10   16:iload_2         
	//*  11   17:ifge            23
	//*  12   20:goto            52
	//*  13   23:iload           4
	//*  14   25:iload_2         
	//*  15   26:icmplt          52
			{
				int l = abyte0.length;
	//   16   29:aload_1         
	//   17   30:arraylength     
	//   18   31:istore          4
				if(j >= 0 && l >= j)
	//*  19   33:iload_3         
	//*  20   34:ifge            40
	//*  21   37:goto            52
	//*  22   40:iload           4
	//*  23   42:iload_3         
	//*  24   43:icmplt          52
				{
					flag = true;
	//   25   46:iconst_1        
	//   26   47:istore          4
					break label0;
	//   27   49:goto            55
				}
			}
			flag = false;
	//   28   52:iconst_0        
	//   29   53:istore          4
		}
		if(!flag)
	//*  30   55:iload           4
	//*  31   57:ifne            142
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   60:new             #108 <Class StringBuilder>
	//   33   63:dup             
	//   34   64:invokespecial   #109 <Method void StringBuilder()>
	//   35   67:astore          8
			stringbuilder.append("fromIndex (");
	//   36   69:aload           8
	//   37   71:ldc1            #111 <String "fromIndex (">
	//   38   73:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			stringbuilder.append(i);
	//   40   77:aload           8
	//   41   79:iload_2         
	//   42   80:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   43   83:pop             
			stringbuilder.append(") or toIndex (");
	//   44   84:aload           8
	//   45   86:ldc1            #120 <String ") or toIndex (">
	//   46   88:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   47   91:pop             
			stringbuilder.append(j);
	//   48   92:aload           8
	//   49   94:iload_3         
	//   50   95:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   51   98:pop             
			stringbuilder.append(") are out of range: 0..");
	//   52   99:aload           8
	//   53  101:ldc1            #122 <String ") are out of range: 0..">
	//   54  103:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   55  106:pop             
			stringbuilder.append(abyte0.length);
	//   56  107:aload           8
	//   57  109:aload_1         
	//   58  110:arraylength     
	//   59  111:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   60  114:pop             
			stringbuilder.append('.');
	//   61  115:aload           8
	//   62  117:bipush          46
	//   63  119:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
	//   64  122:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (stringbuilder.toString())).toString());
	//   65  123:new             #127 <Class IllegalArgumentException>
	//   66  126:dup             
	//   67  127:aload           8
	//   68  129:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   69  132:invokevirtual   #132 <Method String Object.toString()>
	//   70  135:invokespecial   #133 <Method void IllegalArgumentException(String)>
	//   71  138:checkcast       #135 <Class Throwable>
	//   72  141:athrow          
		}
		if(i <= j)
	//*  73  142:iload_2         
	//*  74  143:iload_3         
	//*  75  144:icmpgt          154
			flag = ((boolean) (k1));
	//   76  147:iload           6
	//   77  149:istore          4
		else
	//*  78  151:goto            157
			flag = false;
	//   79  154:iconst_0        
	//   80  155:istore          4
		if(!flag)
	//*  81  157:iload           4
	//*  82  159:ifne            221
		{
			abyte0 = ((byte []) (new StringBuilder()));
	//   83  162:new             #108 <Class StringBuilder>
	//   84  165:dup             
	//   85  166:invokespecial   #109 <Method void StringBuilder()>
	//   86  169:astore_1        
			((StringBuilder) (abyte0)).append("fromIndex (");
	//   87  170:aload_1         
	//   88  171:ldc1            #111 <String "fromIndex (">
	//   89  173:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   90  176:pop             
			((StringBuilder) (abyte0)).append(i);
	//   91  177:aload_1         
	//   92  178:iload_2         
	//   93  179:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   94  182:pop             
			((StringBuilder) (abyte0)).append(") must be not greater than toIndex (");
	//   95  183:aload_1         
	//   96  184:ldc1            #137 <String ") must be not greater than toIndex (">
	//   97  186:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   98  189:pop             
			((StringBuilder) (abyte0)).append(j);
	//   99  190:aload_1         
	//  100  191:iload_3         
	//  101  192:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//  102  195:pop             
			((StringBuilder) (abyte0)).append(").");
	//  103  196:aload_1         
	//  104  197:ldc1            #139 <String ").">
	//  105  199:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  106  202:pop             
			throw (Throwable)new IllegalArgumentException(((Object) (((StringBuilder) (abyte0)).toString())).toString());
	//  107  203:new             #127 <Class IllegalArgumentException>
	//  108  206:dup             
	//  109  207:aload_1         
	//  110  208:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  111  211:invokevirtual   #132 <Method String Object.toString()>
	//  112  214:invokespecial   #133 <Method void IllegalArgumentException(String)>
	//  113  217:checkcast       #135 <Class Throwable>
	//  114  220:athrow          
		}
		k1 = (j - i) / 4;
	//  115  221:iload_3         
	//  116  222:iload_2         
	//  117  223:isub            
	//  118  224:iconst_4        
	//  119  225:idiv            
	//  120  226:istore          6
		for(int i1 = 0; i1 < k1; i1++)
	//* 121  228:iconst_0        
	//* 122  229:istore          4
	//* 123  231:iload           4
	//* 124  233:iload           6
	//* 125  235:icmpge          296
		{
			int l1 = nextInt();
	//  126  238:aload_0         
	//  127  239:invokevirtual   #142 <Method int nextInt()>
	//  128  242:istore          7
			abyte0[i] = (byte)l1;
	//  129  244:aload_1         
	//  130  245:iload_2         
	//  131  246:iload           7
	//  132  248:int2byte        
	//  133  249:bastore         
			abyte0[i + 1] = (byte)(l1 >>> 8);
	//  134  250:aload_1         
	//  135  251:iload_2         
	//  136  252:iconst_1        
	//  137  253:iadd            
	//  138  254:iload           7
	//  139  256:bipush          8
	//  140  258:iushr           
	//  141  259:int2byte        
	//  142  260:bastore         
			abyte0[i + 2] = (byte)(l1 >>> 16);
	//  143  261:aload_1         
	//  144  262:iload_2         
	//  145  263:iconst_2        
	//  146  264:iadd            
	//  147  265:iload           7
	//  148  267:bipush          16
	//  149  269:iushr           
	//  150  270:int2byte        
	//  151  271:bastore         
			abyte0[i + 3] = (byte)(l1 >>> 24);
	//  152  272:aload_1         
	//  153  273:iload_2         
	//  154  274:iconst_3        
	//  155  275:iadd            
	//  156  276:iload           7
	//  157  278:bipush          24
	//  158  280:iushr           
	//  159  281:int2byte        
	//  160  282:bastore         
			i += 4;
	//  161  283:iload_2         
	//  162  284:iconst_4        
	//  163  285:iadd            
	//  164  286:istore_2        
		}

	//  165  287:iload           4
	//  166  289:iconst_1        
	//  167  290:iadd            
	//  168  291:istore          4
	//* 169  293:goto            231
		int j1 = j - i;
	//  170  296:iload_3         
	//  171  297:iload_2         
	//  172  298:isub            
	//  173  299:istore          4
		k1 = nextBits(j1 * 8);
	//  174  301:aload_0         
	//  175  302:iload           4
	//  176  304:bipush          8
	//  177  306:imul            
	//  178  307:invokevirtual   #94  <Method int nextBits(int)>
	//  179  310:istore          6
		for(j = ((int) (flag1)); j < j1; j++)
	//* 180  312:iload           5
	//* 181  314:istore_3        
	//* 182  315:iload_3         
	//* 183  316:iload           4
	//* 184  318:icmpge          341
			abyte0[i + j] = (byte)(k1 >>> j * 8);
	//  185  321:aload_1         
	//  186  322:iload_2         
	//  187  323:iload_3         
	//  188  324:iadd            
	//  189  325:iload           6
	//  190  327:iload_3         
	//  191  328:bipush          8
	//  192  330:imul            
	//  193  331:iushr           
	//  194  332:int2byte        
	//  195  333:bastore         

	//  196  334:iload_3         
	//  197  335:iconst_1        
	//  198  336:iadd            
	//  199  337:istore_3        
	//* 200  338:goto            315
		return abyte0;
	//  201  341:aload_1         
	//  202  342:areturn         
	}

	public double nextDouble()
	{
		return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
	//    0    0:aload_0         
	//    1    1:bipush          26
	//    2    3:invokevirtual   #94  <Method int nextBits(int)>
	//    3    6:aload_0         
	//    4    7:bipush          27
	//    5    9:invokevirtual   #94  <Method int nextBits(int)>
	//    6   12:invokestatic    #149 <Method double PlatformRandomKt.doubleFromParts(int, int)>
	//    7   15:dreturn         
	}

	public double nextDouble(double d)
	{
		return nextDouble(0.0D, d);
	//    0    0:aload_0         
	//    1    1:dconst_0        
	//    2    2:dload_1         
	//    3    3:invokevirtual   #153 <Method double nextDouble(double, double)>
	//    4    6:dreturn         
	}

	public double nextDouble(double d, double d1)
	{
label0:
		{
			RandomKt.checkRangeBounds(d, d1);
	//    0    0:dload_1         
	//    1    1:dload_3         
	//    2    2:invokestatic    #159 <Method void RandomKt.checkRangeBounds(double, double)>
			double d2 = d1 - d;
	//    3    5:dload_3         
	//    4    6:dload_1         
	//    5    7:dsub            
	//    6    8:dstore          5
			if(Double.isInfinite(d2))
	//*   7   10:dload           5
	//*   8   12:invokestatic    #165 <Method boolean Double.isInfinite(double)>
	//*   9   15:ifeq            118
			{
				boolean flag3 = Double.isInfinite(d);
	//   10   18:dload_1         
	//   11   19:invokestatic    #165 <Method boolean Double.isInfinite(double)>
	//   12   22:istore          11
				boolean flag2 = false;
	//   13   24:iconst_0        
	//   14   25:istore          10
				boolean flag;
				if(!flag3 && !Double.isNaN(d))
	//*  15   27:iload           11
	//*  16   29:ifne            45
	//*  17   32:dload_1         
	//*  18   33:invokestatic    #168 <Method boolean Double.isNaN(double)>
	//*  19   36:ifne            45
					flag = true;
	//   20   39:iconst_1        
	//   21   40:istore          9
				else
	//*  22   42:goto            48
					flag = false;
	//   23   45:iconst_0        
	//   24   46:istore          9
				if(flag)
	//*  25   48:iload           9
	//*  26   50:ifeq            118
				{
					boolean flag1 = flag2;
	//   27   53:iload           10
	//   28   55:istore          9
					if(!Double.isInfinite(d1))
	//*  29   57:dload_3         
	//*  30   58:invokestatic    #165 <Method boolean Double.isInfinite(double)>
	//*  31   61:ifne            78
					{
						flag1 = flag2;
	//   32   64:iload           10
	//   33   66:istore          9
						if(!Double.isNaN(d1))
	//*  34   68:dload_3         
	//*  35   69:invokestatic    #168 <Method boolean Double.isNaN(double)>
	//*  36   72:ifne            78
							flag1 = true;
	//   37   75:iconst_1        
	//   38   76:istore          9
					}
					if(flag1)
	//*  39   78:iload           9
	//*  40   80:ifeq            118
					{
						d2 = nextDouble();
	//   41   83:aload_0         
	//   42   84:invokevirtual   #170 <Method double nextDouble()>
	//   43   87:dstore          5
						double d4 = 2;
	//   44   89:iconst_2        
	//   45   90:i2d             
	//   46   91:dstore          7
						d2 *= d1 / d4 - d / d4;
	//   47   93:dload           5
	//   48   95:dload_3         
	//   49   96:dload           7
	//   50   98:ddiv            
	//   51   99:dload_1         
	//   52  100:dload           7
	//   53  102:ddiv            
	//   54  103:dsub            
	//   55  104:dmul            
	//   56  105:dstore          5
						d = d + d2 + d2;
	//   57  107:dload_1         
	//   58  108:dload           5
	//   59  110:dadd            
	//   60  111:dload           5
	//   61  113:dadd            
	//   62  114:dstore_1        
						break label0;
	//   63  115:goto            128
					}
				}
			}
			d += nextDouble() * d2;
	//   64  118:dload_1         
	//   65  119:aload_0         
	//   66  120:invokevirtual   #170 <Method double nextDouble()>
	//   67  123:dload           5
	//   68  125:dmul            
	//   69  126:dadd            
	//   70  127:dstore_1        
		}
		double d3 = d;
	//   71  128:dload_1         
	//   72  129:dstore          5
		if(d >= d1)
	//*  73  131:dload_1         
	//*  74  132:dload_3         
	//*  75  133:dcmpl           
	//*  76  134:iflt            149
			d3 = Math.nextAfter(d1, DoubleCompanionObject.INSTANCE.getNEGATIVE_INFINITY());
	//   77  137:dload_3         
	//   78  138:getstatic       #175 <Field DoubleCompanionObject DoubleCompanionObject.INSTANCE>
	//   79  141:invokevirtual   #178 <Method double DoubleCompanionObject.getNEGATIVE_INFINITY()>
	//   80  144:invokestatic    #183 <Method double Math.nextAfter(double, double)>
	//   81  147:dstore          5
		return d3;
	//   82  149:dload           5
	//   83  151:dreturn         
	}

	public float nextFloat()
	{
		return (float)nextBits(24) / (float)0x1000000;
	//    0    0:aload_0         
	//    1    1:bipush          24
	//    2    3:invokevirtual   #94  <Method int nextBits(int)>
	//    3    6:i2f             
	//    4    7:ldc1            #185 <Int 0x1000000>
	//    5    9:i2f             
	//    6   10:fdiv            
	//    7   11:freturn         
	}

	public int nextInt()
	{
		return nextBits(32);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #94  <Method int nextBits(int)>
	//    3    6:ireturn         
	}

	public int nextInt(int i)
	{
		return nextInt(0, i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #188 <Method int nextInt(int, int)>
	//    4    6:ireturn         
	}

	public int nextInt(int i, int j)
	{
		RandomKt.checkRangeBounds(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #191 <Method void RandomKt.checkRangeBounds(int, int)>
		int k = j - i;
	//    3    5:iload_2         
	//    4    6:iload_1         
	//    5    7:isub            
	//    6    8:istore_3        
		if(k <= 0 && k != 0x80000000)
	//*   7    9:iload_3         
	//*   8   10:ifgt            42
	//*   9   13:iload_3         
	//*  10   14:ldc1            #192 <Int 0x80000000>
	//*  11   16:icmpne          22
	//*  12   19:goto            42
		{
			do
				k = nextInt();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #142 <Method int nextInt()>
	//   15   26:istore_3        
			while(i > k || j <= k);
	//   16   27:iload_1         
	//   17   28:iload_3         
	//   18   29:icmple          35
	//   19   32:goto            22
	//   20   35:iload_2         
	//   21   36:iload_3         
	//   22   37:icmple          22
			return k;
	//   23   40:iload_3         
	//   24   41:ireturn         
		}
		int l;
		if((-k & k) == k)
	//*  25   42:iload_3         
	//*  26   43:ineg            
	//*  27   44:iload_3         
	//*  28   45:iand            
	//*  29   46:iload_3         
	//*  30   47:icmpne          62
			j = nextBits(PlatformRandomKt.fastLog2(k));
	//   31   50:aload_0         
	//   32   51:iload_3         
	//   33   52:invokestatic    #195 <Method int PlatformRandomKt.fastLog2(int)>
	//   34   55:invokevirtual   #94  <Method int nextBits(int)>
	//   35   58:istore_2        
		else
	//*  36   59:goto            86
			do
			{
				l = nextInt() >>> 1;
	//   37   62:aload_0         
	//   38   63:invokevirtual   #142 <Method int nextInt()>
	//   39   66:iconst_1        
	//   40   67:iushr           
	//   41   68:istore          4
				j = l % k;
	//   42   70:iload           4
	//   43   72:iload_3         
	//   44   73:irem            
	//   45   74:istore_2        
			} while((l - j) + (k - 1) < 0);
	//   46   75:iload           4
	//   47   77:iload_2         
	//   48   78:isub            
	//   49   79:iload_3         
	//   50   80:iconst_1        
	//   51   81:isub            
	//   52   82:iadd            
	//   53   83:iflt            62
		return i + j;
	//   54   86:iload_1         
	//   55   87:iload_2         
	//   56   88:iadd            
	//   57   89:ireturn         
	}

	public long nextLong()
	{
		return ((long)nextInt() << 32) + (long)nextInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #142 <Method int nextInt()>
	//    2    4:i2l             
	//    3    5:bipush          32
	//    4    7:lshl            
	//    5    8:aload_0         
	//    6    9:invokevirtual   #142 <Method int nextInt()>
	//    7   12:i2l             
	//    8   13:ladd            
	//    9   14:lreturn         
	}

	public long nextLong(long l)
	{
		return nextLong(0L, l);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:lload_1         
	//    3    3:invokevirtual   #200 <Method long nextLong(long, long)>
	//    4    6:lreturn         
	}

	public long nextLong(long l, long l1)
	{
		RandomKt.checkRangeBounds(l, l1);
	//    0    0:lload_1         
	//    1    1:lload_3         
	//    2    2:invokestatic    #203 <Method void RandomKt.checkRangeBounds(long, long)>
		long l2 = l1 - l;
	//    3    5:lload_3         
	//    4    6:lload_1         
	//    5    7:lsub            
	//    6    8:lstore          7
		if(l2 > 0L)
	//*   7   10:lload           7
	//*   8   12:lconst_0        
	//*   9   13:lcmp            
	//*  10   14:ifle            139
		{
			long l3;
			if((l2 & -l2) == l2)
	//*  11   17:lload           7
	//*  12   19:lload           7
	//*  13   21:lneg            
	//*  14   22:land            
	//*  15   23:lload           7
	//*  16   25:lcmp            
	//*  17   26:ifne            107
			{
				int i = (int)l2;
	//   18   29:lload           7
	//   19   31:l2i             
	//   20   32:istore          5
				int j = (int)(l2 >>> 32);
	//   21   34:lload           7
	//   22   36:bipush          32
	//   23   38:lushr           
	//   24   39:l2i             
	//   25   40:istore          6
				if(i != 0)
	//*  26   42:iload           5
	//*  27   44:ifeq            65
					l1 = (long)nextBits(PlatformRandomKt.fastLog2(i)) & 0xffffffffL;
	//   28   47:aload_0         
	//   29   48:iload           5
	//   30   50:invokestatic    #195 <Method int PlatformRandomKt.fastLog2(int)>
	//   31   53:invokevirtual   #94  <Method int nextBits(int)>
	//   32   56:i2l             
	//   33   57:ldc2w           #204 <Long 0xffffffffL>
	//   34   60:land            
	//   35   61:lstore_3        
				else
	//*  36   62:goto            135
				if(j == 1)
	//*  37   65:iload           6
	//*  38   67:iconst_1        
	//*  39   68:icmpne          84
					l1 = (long)nextInt() & 0xffffffffL;
	//   40   71:aload_0         
	//   41   72:invokevirtual   #142 <Method int nextInt()>
	//   42   75:i2l             
	//   43   76:ldc2w           #204 <Long 0xffffffffL>
	//   44   79:land            
	//   45   80:lstore_3        
				else
	//*  46   81:goto            135
					l1 = ((long)nextBits(PlatformRandomKt.fastLog2(j)) << 32) + (long)nextInt();
	//   47   84:aload_0         
	//   48   85:iload           6
	//   49   87:invokestatic    #195 <Method int PlatformRandomKt.fastLog2(int)>
	//   50   90:invokevirtual   #94  <Method int nextBits(int)>
	//   51   93:i2l             
	//   52   94:bipush          32
	//   53   96:lshl            
	//   54   97:aload_0         
	//   55   98:invokevirtual   #142 <Method int nextInt()>
	//   56  101:i2l             
	//   57  102:ladd            
	//   58  103:lstore_3        
			} else
	//*  59  104:goto            135
			{
				do
				{
					l3 = nextLong() >>> 1;
	//   60  107:aload_0         
	//   61  108:invokevirtual   #207 <Method long nextLong()>
	//   62  111:iconst_1        
	//   63  112:lushr           
	//   64  113:lstore          9
					l1 = l3 % l2;
	//   65  115:lload           9
	//   66  117:lload           7
	//   67  119:lrem            
	//   68  120:lstore_3        
				} while((l3 - l1) + (l2 - 1L) < 0L);
	//   69  121:lload           9
	//   70  123:lload_3         
	//   71  124:lsub            
	//   72  125:lload           7
	//   73  127:lconst_1        
	//   74  128:lsub            
	//   75  129:ladd            
	//   76  130:lconst_0        
	//   77  131:lcmp            
	//   78  132:iflt            107
			}
			return l + l1;
	//   79  135:lload_1         
	//   80  136:lload_3         
	//   81  137:ladd            
	//   82  138:lreturn         
		}
		do
			l2 = nextLong();
	//   83  139:aload_0         
	//   84  140:invokevirtual   #207 <Method long nextLong()>
	//   85  143:lstore          7
		while(l > l2 || l1 <= l2);
	//   86  145:lload_1         
	//   87  146:lload           7
	//   88  148:lcmp            
	//   89  149:ifle            155
	//   90  152:goto            139
	//   91  155:lload_3         
	//   92  156:lload           7
	//   93  158:lcmp            
	//   94  159:ifle            139
		return l2;
	//   95  162:lload           7
	//   96  164:lreturn         
	}

	public static final Companion Companion;
	public static final Default Default = new Default(((DefaultConstructorMarker) (null)));
	private static final Random defaultRandom;

	static 
	{
	//    0    0:new             #9   <Class Random$Default>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #52  <Method void Random$Default(DefaultConstructorMarker)>
	//    4    8:putstatic       #54  <Field Random$Default Default>
		defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
	//    5   11:getstatic       #60  <Field PlatformImplementations PlatformImplementationsKt.IMPLEMENTATIONS>
	//    6   14:invokevirtual   #66  <Method Random PlatformImplementations.defaultPlatformRandom()>
	//    7   17:putstatic       #68  <Field Random defaultRandom>
		Companion = Companion.INSTANCE;
	//    8   20:getstatic       #71  <Field Random$Companion Random$Companion.INSTANCE>
	//    9   23:putstatic       #73  <Field Random$Companion Companion>
	//*  10   26:return          
	}


/*
	public static final Random access$getDefaultRandom$cp()
	{
		return defaultRandom;
	//    0    0:getstatic       #68  <Field Random defaultRandom>
	//    1    3:areturn         
	}

*/
}
