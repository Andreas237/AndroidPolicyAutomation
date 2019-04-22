// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import java.util.Random;

public class PushIdGenerator
{

	public PushIdGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static String generatePushChildName(long l)
	{
		com/firebase/client/utilities/PushIdGenerator;
	//    0    0:ldc1            #2   <Class PushIdGenerator>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		long l1 = lastPushTime;
	//    2    3:getstatic       #28  <Field long lastPushTime>
	//    3    6:lstore          5
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          4
		int i;
		int j;
		char ac[];
		String s;
		Exception exception;
		StringBuilder stringbuilder;
		if(l == l1)
	//*   6   11:lload_0         
	//*   7   12:lload           5
	//*   8   14:lcmp            
	//*   9   15:ifne            178
			i = 1;
	//   10   18:iconst_1        
	//   11   19:istore_2        
		else
	//*  12   20:goto            23
	//*  13   23:lload_0         
	//*  14   24:putstatic       #28  <Field long lastPushTime>
	//*  15   27:bipush          8
	//*  16   29:newarray        char[]
	//*  17   31:astore          7
	//*  18   33:new             #36  <Class StringBuilder>
	//*  19   36:dup             
	//*  20   37:bipush          20
	//*  21   39:invokespecial   #39  <Method void StringBuilder(int)>
	//*  22   42:astore          8
	//*  23   44:bipush          7
	//*  24   46:istore_3        
	//*  25   47:iload_3         
	//*  26   48:iflt            79
	//*  27   51:aload           7
	//*  28   53:iload_3         
	//*  29   54:ldc1            #11  <String "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz">
	//*  30   56:lload_0         
	//*  31   57:ldc2w           #40  <Long 64L>
	//*  32   60:lrem            
	//*  33   61:l2i             
	//*  34   62:invokevirtual   #47  <Method char String.charAt(int)>
	//*  35   65:castore         
	//*  36   66:lload_0         
	//*  37   67:ldc2w           #40  <Long 64L>
	//*  38   70:ldiv            
	//*  39   71:lstore_0        
	//*  40   72:iload_3         
	//*  41   73:iconst_1        
	//*  42   74:isub            
	//*  43   75:istore_3        
	//*  44   76:goto            47
	//*  45   79:aload           8
	//*  46   81:aload           7
	//*  47   83:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char[])>
	//*  48   86:pop             
	//*  49   87:iload_2         
	//*  50   88:ifne            122
	//*  51   91:iconst_0        
	//*  52   92:istore_2        
	//*  53   93:iload           4
	//*  54   95:istore_3        
	//*  55   96:iload_2         
	//*  56   97:bipush          12
	//*  57   99:icmpge          128
	//*  58  102:getstatic       #30  <Field int[] lastRandChars>
	//*  59  105:iload_2         
	//*  60  106:getstatic       #26  <Field Random randGen>
	//*  61  109:bipush          64
	//*  62  111:invokevirtual   #55  <Method int Random.nextInt(int)>
	//*  63  114:iastore         
	//*  64  115:iload_2         
	//*  65  116:iconst_1        
	//*  66  117:iadd            
	//*  67  118:istore_2        
	//*  68  119:goto            93
	//*  69  122:invokestatic    #58  <Method void incrementArray()>
	//*  70  125:iload           4
	//*  71  127:istore_3        
	//*  72  128:iload_3         
	//*  73  129:bipush          12
	//*  74  131:icmpge          157
	//*  75  134:aload           8
	//*  76  136:ldc1            #11  <String "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz">
	//*  77  138:getstatic       #30  <Field int[] lastRandChars>
	//*  78  141:iload_3         
	//*  79  142:iaload          
	//*  80  143:invokevirtual   #47  <Method char String.charAt(int)>
	//*  81  146:invokevirtual   #61  <Method StringBuilder StringBuilder.append(char)>
	//*  82  149:pop             
	//*  83  150:iload_3         
	//*  84  151:iconst_1        
	//*  85  152:iadd            
	//*  86  153:istore_3        
	//*  87  154:goto            128
	//*  88  157:aload           8
	//*  89  159:invokevirtual   #65  <Method String StringBuilder.toString()>
	//*  90  162:astore          7
	//*  91  164:ldc1            #2   <Class PushIdGenerator>
	//*  92  166:monitorexit     
	//*  93  167:aload           7
	//*  94  169:areturn         
	//*  95  170:astore          7
	//*  96  172:ldc1            #2   <Class PushIdGenerator>
	//*  97  174:monitorexit     
	//*  98  175:aload           7
	//*  99  177:athrow          
			i = 0;
	//  100  178:iconst_0        
	//  101  179:istore_2        
		lastPushTime = l;
		ac = new char[8];
		stringbuilder = new StringBuilder(20);
		j = 7;
_L2:
		if(j < 0)
			break; /* Loop/switch isn't completed */
		ac[j] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int)(l % 64L));
		l /= 64L;
		j--;
		if(true) goto _L2; else goto _L1
_L1:
		stringbuilder.append(ac);
		if(i != 0) goto _L4; else goto _L3
_L3:
		i = 0;
_L6:
		j = ((int) (flag));
		if(i >= 12)
			break; /* Loop/switch isn't completed */
		lastRandChars[i] = randGen.nextInt(64);
		i++;
		if(true) goto _L6; else goto _L5
_L4:
		incrementArray();
		j = ((int) (flag));
_L5:
		if(j >= 12)
			break; /* Loop/switch isn't completed */
		stringbuilder.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(lastRandChars[j]));
		j++;
		if(true) goto _L5; else goto _L7
_L7:
		s = stringbuilder.toString();
		com/firebase/client/utilities/PushIdGenerator;
		JVM INSTR monitorexit ;
		return s;
		exception;
		throw exception;
	//* 102  180:goto            23
	}

	private static void incrementArray()
	{
		for(int i = 11; i >= 0; i--)
	//*   0    0:bipush          11
	//*   1    2:istore_0        
	//*   2    3:iload_0         
	//*   3    4:iflt            39
		{
			int ai[] = lastRandChars;
	//    4    7:getstatic       #30  <Field int[] lastRandChars>
	//    5   10:astore_1        
			if(ai[i] != 63)
	//*   6   11:aload_1         
	//*   7   12:iload_0         
	//*   8   13:iaload          
	//*   9   14:bipush          63
	//*  10   16:icmpeq          28
			{
				ai[i] = ai[i] + 1;
	//   11   19:aload_1         
	//   12   20:iload_0         
	//   13   21:aload_1         
	//   14   22:iload_0         
	//   15   23:iaload          
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:iastore         
				return;
	//   19   27:return          
			}
			ai[i] = 0;
	//   20   28:aload_1         
	//   21   29:iload_0         
	//   22   30:iconst_0        
	//   23   31:iastore         
		}

	//   24   32:iload_0         
	//   25   33:iconst_1        
	//   26   34:isub            
	//   27   35:istore_0        
	//*  28   36:goto            3
	//   29   39:return          
	}

	static final boolean $assertionsDisabled = false;
	private static final String PUSH_CHARS = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz";
	private static long lastPushTime = 0L;
	private static final int lastRandChars[] = new int[12];
	private static final Random randGen = new Random();

	static 
	{
	//    0    0:new             #21  <Class Random>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Random()>
	//    3    7:putstatic       #26  <Field Random randGen>
	//    4   10:lconst_0        
	//    5   11:putstatic       #28  <Field long lastPushTime>
	//    6   14:bipush          12
	//    7   16:newarray        int[]
	//    8   18:putstatic       #30  <Field int[] lastRandChars>
	//*   9   21:return          
	}
}
