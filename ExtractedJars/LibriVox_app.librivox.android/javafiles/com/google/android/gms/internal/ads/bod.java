// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bnl, bdj

public final class bod
{

	private bod(List list, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field List a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int b>
	//    8   14:return          
	}

	public static bod a(bno bno1)
	{
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		byte abyte0[];
		try
		{
			bno1.d(21);
	//    0    0:aload_0         
	//    1    1:bipush          21
	//    2    3:invokevirtual   #27  <Method void bno.d(int)>
			i1 = bno1.f();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #31  <Method int bno.f()>
	//    5   10:istore          5
			j1 = bno1.f();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #31  <Method int bno.f()>
	//    8   16:istore          6
			l = bno1.d();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #33  <Method int bno.d()>
	//   11   22:istore          4
		}
	//*  12   24:iconst_0        
	//*  13   25:istore_2        
	//*  14   26:iconst_0        
	//*  15   27:istore_1        
	//*  16   28:iload_2         
	//*  17   29:iload           6
	//*  18   31:icmpge          79
	//*  19   34:aload_0         
	//*  20   35:iconst_1        
	//*  21   36:invokevirtual   #27  <Method void bno.d(int)>
	//*  22   39:aload_0         
	//*  23   40:invokevirtual   #36  <Method int bno.g()>
	//*  24   43:istore          7
	//*  25   45:iconst_0        
	//*  26   46:istore_3        
	//*  27   47:iload_3         
	//*  28   48:iload           7
	//*  29   50:icmpge          219
	//*  30   53:aload_0         
	//*  31   54:invokevirtual   #36  <Method int bno.g()>
	//*  32   57:istore          8
	//*  33   59:iload_1         
	//*  34   60:iload           8
	//*  35   62:iconst_4        
	//*  36   63:iadd            
	//*  37   64:iadd            
	//*  38   65:istore_1        
	//*  39   66:aload_0         
	//*  40   67:iload           8
	//*  41   69:invokevirtual   #27  <Method void bno.d(int)>
	//*  42   72:iload_3         
	//*  43   73:iconst_1        
	//*  44   74:iadd            
	//*  45   75:istore_3        
	//*  46   76:goto            47
	//*  47   79:aload_0         
	//*  48   80:iload           4
	//*  49   82:invokevirtual   #39  <Method void bno.c(int)>
	//*  50   85:iload_1         
	//*  51   86:newarray        byte[]
	//*  52   88:astore          9
	//*  53   90:iconst_0        
	//*  54   91:istore_3        
	//*  55   92:iconst_0        
	//*  56   93:istore_2        
	//*  57   94:iload_3         
	//*  58   95:iload           6
	//*  59   97:icmpge          233
	//*  60  100:aload_0         
	//*  61  101:iconst_1        
	//*  62  102:invokevirtual   #27  <Method void bno.d(int)>
	//*  63  105:aload_0         
	//*  64  106:invokevirtual   #36  <Method int bno.g()>
	//*  65  109:istore          7
	//*  66  111:iconst_0        
	//*  67  112:istore          4
	//*  68  114:iload           4
	//*  69  116:iload           7
	//*  70  118:icmpge          226
	//*  71  121:aload_0         
	//*  72  122:invokevirtual   #36  <Method int bno.g()>
	//*  73  125:istore          8
	//*  74  127:getstatic       #44  <Field byte[] bnl.a>
	//*  75  130:iconst_0        
	//*  76  131:aload           9
	//*  77  133:iload_2         
	//*  78  134:getstatic       #44  <Field byte[] bnl.a>
	//*  79  137:arraylength     
	//*  80  138:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  81  141:iload_2         
	//*  82  142:getstatic       #44  <Field byte[] bnl.a>
	//*  83  145:arraylength     
	//*  84  146:iadd            
	//*  85  147:istore_2        
	//*  86  148:aload_0         
	//*  87  149:getfield        #51  <Field byte[] bno.a>
	//*  88  152:aload_0         
	//*  89  153:invokevirtual   #33  <Method int bno.d()>
	//*  90  156:aload           9
	//*  91  158:iload_2         
	//*  92  159:iload           8
	//*  93  161:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  94  164:iload_2         
	//*  95  165:iload           8
	//*  96  167:iadd            
	//*  97  168:istore_2        
	//*  98  169:aload_0         
	//*  99  170:iload           8
	//* 100  172:invokevirtual   #27  <Method void bno.d(int)>
	//* 101  175:iload           4
	//* 102  177:iconst_1        
	//* 103  178:iadd            
	//* 104  179:istore          4
	//* 105  181:goto            114
	//* 106  184:aload           9
	//* 107  186:invokestatic    #57  <Method List Collections.singletonList(Object)>
	//* 108  189:astore_0        
	//* 109  190:new             #2   <Class bod>
	//* 110  193:dup             
	//* 111  194:aload_0         
	//* 112  195:iload           5
	//* 113  197:iconst_3        
	//* 114  198:iand            
	//* 115  199:iconst_1        
	//* 116  200:iadd            
	//* 117  201:invokespecial   #59  <Method void bod(List, int)>
	//* 118  204:astore_0        
	//* 119  205:aload_0         
	//* 120  206:areturn         
		// Misplaced declaration of an exception variable
		catch(bno bno1)
	//* 121  207:astore_0        
		{
			throw new bdj("Error parsing HEVC config", ((Throwable) (bno1)));
	//  122  208:new             #61  <Class bdj>
	//  123  211:dup             
	//  124  212:ldc1            #63  <String "Error parsing HEVC config">
	//  125  214:aload_0         
	//  126  215:invokespecial   #66  <Method void bdj(String, Throwable)>
	//  127  218:athrow          
		}
		j = 0;
		i = 0;
_L9:
		if(j >= j1) goto _L2; else goto _L1
_L1:
		bno1.d(1);
		k1 = bno1.g();
		k = 0;
_L4:
		if(k >= k1)
			break; /* Loop/switch isn't completed */
		l1 = bno1.g();
		i += l1 + 4;
		bno1.d(l1);
		k++;
		if(true) goto _L4; else goto _L3
_L2:
		bno1.c(l);
		abyte0 = new byte[i];
		k = 0;
		j = 0;
_L10:
		if(k >= j1) goto _L6; else goto _L5
_L5:
		bno1.d(1);
		k1 = bno1.g();
		l = 0;
_L8:
		if(l >= k1)
			continue; /* Loop/switch isn't completed */
		l1 = bno1.g();
		System.arraycopy(((Object) (bnl.a)), 0, ((Object) (abyte0)), j, bnl.a.length);
		j += bnl.a.length;
		System.arraycopy(((Object) (bno1.a)), bno1.d(), ((Object) (abyte0)), j, l1);
		j += l1;
		bno1.d(l1);
		l++;
		if(true) goto _L8; else goto _L7
_L7:
		continue; /* Loop/switch isn't completed */
_L12:
		bno1 = ((bno) (Collections.singletonList(((Object) (abyte0)))));
_L13:
		bno1 = ((bno) (new bod(((List) (bno1)), (i1 & 3) + 1)));
		return ((bod) (bno1));
_L3:
		j++;
	//  128  219:iload_2         
	//  129  220:iconst_1        
	//  130  221:iadd            
	//  131  222:istore_2        
		  goto _L9
	//* 132  223:goto            28
		k++;
	//  133  226:iload_3         
	//  134  227:iconst_1        
	//  135  228:iadd            
	//  136  229:istore_3        
		  goto _L10
	//* 137  230:goto            94
_L6:
		if(i != 0) goto _L12; else goto _L11
	//  138  233:iload_1         
	//  139  234:ifne            184
_L11:
		bno1 = null;
	//  140  237:aconst_null     
	//  141  238:astore_0        
		  goto _L13
	//* 142  239:goto            190
	}

	public final List a;
	public final int b;
}
