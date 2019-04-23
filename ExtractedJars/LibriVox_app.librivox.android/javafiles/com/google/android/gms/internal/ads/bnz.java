// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bnl, bnm, bdj, 
//			bng

public final class bnz
{

	private bnz(List list, int i, int j, int k, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field List a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int b>
		d = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int d>
		e = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #25  <Field int e>
		c = f;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:putfield        #27  <Field float c>
	//   17   31:return          
	}

	public static bnz a(bno bno1)
	{
		float f;
		int i;
		int j;
		int k;
		int l;
		ArrayList arraylist;
		try
		{
			bno1.d(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #36  <Method void bno.d(int)>
			k = (bno1.f() & 3) + 1;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #40  <Method int bno.f()>
	//    5    9:iconst_3        
	//    6   10:iand            
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:istore          4
		}
	//*  10   15:iload           4
	//*  11   17:iconst_3        
	//*  12   18:icmpeq          165
	//*  13   21:new             #42  <Class ArrayList>
	//*  14   24:dup             
	//*  15   25:invokespecial   #43  <Method void ArrayList()>
	//*  16   28:astore          6
	//*  17   30:aload_0         
	//*  18   31:invokevirtual   #40  <Method int bno.f()>
	//*  19   34:bipush          31
	//*  20   36:iand            
	//*  21   37:istore_3        
	//*  22   38:iconst_0        
	//*  23   39:istore_2        
	//*  24   40:iload_2         
	//*  25   41:iload_3         
	//*  26   42:icmpge          64
	//*  27   45:aload           6
	//*  28   47:aload_0         
	//*  29   48:invokestatic    #46  <Method byte[] b(bno)>
	//*  30   51:invokeinterface #52  <Method boolean List.add(Object)>
	//*  31   56:pop             
	//*  32   57:iload_2         
	//*  33   58:iconst_1        
	//*  34   59:iadd            
	//*  35   60:istore_2        
	//*  36   61:goto            40
	//*  37   64:aload_0         
	//*  38   65:invokevirtual   #40  <Method int bno.f()>
	//*  39   68:istore          5
	//*  40   70:iconst_0        
	//*  41   71:istore_2        
	//*  42   72:iload_2         
	//*  43   73:iload           5
	//*  44   75:icmpge          97
	//*  45   78:aload           6
	//*  46   80:aload_0         
	//*  47   81:invokestatic    #46  <Method byte[] b(bno)>
	//*  48   84:invokeinterface #52  <Method boolean List.add(Object)>
	//*  49   89:pop             
	//*  50   90:iload_2         
	//*  51   91:iconst_1        
	//*  52   92:iadd            
	//*  53   93:istore_2        
	//*  54   94:goto            72
	//*  55   97:iload_3         
	//*  56   98:ifle            185
	//*  57  101:aload           6
	//*  58  103:iconst_0        
	//*  59  104:invokeinterface #56  <Method Object List.get(int)>
	//*  60  109:checkcast       #58  <Class byte[]>
	//*  61  112:astore_0        
	//*  62  113:aload           6
	//*  63  115:iconst_0        
	//*  64  116:invokeinterface #56  <Method Object List.get(int)>
	//*  65  121:checkcast       #58  <Class byte[]>
	//*  66  124:iload           4
	//*  67  126:aload_0         
	//*  68  127:arraylength     
	//*  69  128:invokestatic    #63  <Method bnm bnl.a(byte[], int, int)>
	//*  70  131:astore_0        
	//*  71  132:aload_0         
	//*  72  133:getfield        #67  <Field int bnm.a>
	//*  73  136:istore_2        
	//*  74  137:aload_0         
	//*  75  138:getfield        #68  <Field int bnm.b>
	//*  76  141:istore_3        
	//*  77  142:aload_0         
	//*  78  143:getfield        #69  <Field float bnm.c>
	//*  79  146:fstore_1        
	//*  80  147:goto            150
	//*  81  150:new             #2   <Class bnz>
	//*  82  153:dup             
	//*  83  154:aload           6
	//*  84  156:iload           4
	//*  85  158:iload_2         
	//*  86  159:iload_3         
	//*  87  160:fload_1         
	//*  88  161:invokespecial   #71  <Method void bnz(List, int, int, int, float)>
	//*  89  164:areturn         
	//*  90  165:new             #73  <Class IllegalStateException>
	//*  91  168:dup             
	//*  92  169:invokespecial   #74  <Method void IllegalStateException()>
	//*  93  172:athrow          
		// Misplaced declaration of an exception variable
		catch(bno bno1)
	//*  94  173:astore_0        
		{
			throw new bdj("Error parsing AVC config", ((Throwable) (bno1)));
	//   95  174:new             #76  <Class bdj>
	//   96  177:dup             
	//   97  178:ldc1            #78  <String "Error parsing AVC config">
	//   98  180:aload_0         
	//   99  181:invokespecial   #81  <Method void bdj(String, Throwable)>
	//  100  184:athrow          
		}
		if(k == 3) goto _L2; else goto _L1
_L1:
		arraylist = new ArrayList();
		j = bno1.f() & 0x1f;
		i = 0;
_L4:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (b(bno1))));
		i++;
		if(true) goto _L4; else goto _L3
_L3:
		l = bno1.f();
		i = 0;
_L6:
		if(i >= l)
			break; /* Loop/switch isn't completed */
		((List) (arraylist)).add(((Object) (b(bno1))));
		i++;
		if(true) goto _L6; else goto _L5
_L5:
		if(j <= 0) goto _L8; else goto _L7
_L7:
		bno1 = ((bno) ((byte[])((List) (arraylist)).get(0)));
		bno1 = ((bno) (bnl.a((byte[])((List) (arraylist)).get(0), k, bno1.length)));
		i = ((bnm) (bno1)).a;
		j = ((bnm) (bno1)).b;
		f = ((bnm) (bno1)).c;
_L10:
		return new bnz(((List) (arraylist)), k, i, j, f);
_L2:
		throw new IllegalStateException();
_L8:
		i = -1;
	//  101  185:iconst_m1       
	//  102  186:istore_2        
		j = -1;
	//  103  187:iconst_m1       
	//  104  188:istore_3        
		f = 1.0F;
	//  105  189:fconst_1        
	//  106  190:fstore_1        
		if(true) goto _L10; else goto _L9
	//  107  191:goto            150
_L9:
	}

	private static byte[] b(bno bno1)
	{
		int i = bno1.g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method int bno.g()>
	//    2    4:istore_1        
		int j = bno1.d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #86  <Method int bno.d()>
	//    5    9:istore_2        
		bno1.d(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #36  <Method void bno.d(int)>
		return bng.a(bno1.a, j, i);
	//    9   15:aload_0         
	//   10   16:getfield        #88  <Field byte[] bno.a>
	//   11   19:iload_2         
	//   12   20:iload_1         
	//   13   21:invokestatic    #93  <Method byte[] bng.a(byte[], int, int)>
	//   14   24:areturn         
	}

	public final List a;
	public final int b;
	public final float c;
	private final int d;
	private final int e;
}
