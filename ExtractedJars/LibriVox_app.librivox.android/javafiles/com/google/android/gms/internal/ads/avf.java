// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aum, asu, aqq, awf

abstract class avf
{

	avf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	abstract Object a();

	abstract Object a(Object obj);

	abstract void a(Object obj, int i, int j);

	abstract void a(Object obj, int i, long l);

	abstract void a(Object obj, int i, aqq aqq);

	abstract void a(Object obj, int i, Object obj1);

	abstract void a(Object obj, awf awf);

	abstract void a(Object obj, Object obj1);

	abstract boolean a(aum aum1);

	final boolean a(Object obj, aum aum1)
	{
		int i = aum1.b();
	//    0    0:aload_2         
	//    1    1:invokeinterface #26  <Method int aum.b()>
	//    2    6:istore_3        
		int j = i >>> 3;
	//    3    7:iload_3         
	//    4    8:iconst_3        
	//    5    9:iushr           
	//    6   10:istore          4
		switch(i & 7)
	//*   7   12:iload_3         
	//*   8   13:bipush          7
	//*   9   15:iand            
		{
	//*  10   16:tableswitch     0 5: default 56
	//	               0 168
	//	               1 153
	//	               2 138
	//	               3 77
	//	               4 75
	//	               5 60
		default:
			throw asu.f();
	//   11   56:invokestatic    #32  <Method asv asu.f()>
	//   12   59:athrow          

		case 5: // '\005'
			a(obj, j, aum1.j());
	//   13   60:aload_0         
	//   14   61:aload_1         
	//   15   62:iload           4
	//   16   64:aload_2         
	//   17   65:invokeinterface #35  <Method int aum.j()>
	//   18   70:invokevirtual   #37  <Method void a(Object, int, int)>
			return true;
	//   19   73:iconst_1        
	//   20   74:ireturn         

		case 4: // '\004'
			return false;
	//   21   75:iconst_0        
	//   22   76:ireturn         

		case 3: // '\003'
			Object obj1;
			for(obj1 = a(); aum1.a() != 0x7fffffff && a(obj1, aum1););
	//   23   77:aload_0         
	//   24   78:invokevirtual   #39  <Method Object a()>
	//   25   81:astore          5
	//   26   83:aload_2         
	//   27   84:invokeinterface #41  <Method int aum.a()>
	//   28   89:ldc1            #42  <Int 0x7fffffff>
	//   29   91:icmpeq          104
	//   30   94:aload_0         
	//   31   95:aload           5
	//   32   97:aload_2         
	//   33   98:invokevirtual   #44  <Method boolean a(Object, aum)>
	//   34  101:ifne            83
			if((j << 3 | 4) == aum1.b())
	//*  35  104:iload           4
	//*  36  106:iconst_3        
	//*  37  107:ishl            
	//*  38  108:iconst_4        
	//*  39  109:ior             
	//*  40  110:aload_2         
	//*  41  111:invokeinterface #26  <Method int aum.b()>
	//*  42  116:icmpne          134
			{
				a(obj, j, a(obj1));
	//   43  119:aload_0         
	//   44  120:aload_1         
	//   45  121:iload           4
	//   46  123:aload_0         
	//   47  124:aload           5
	//   48  126:invokevirtual   #46  <Method Object a(Object)>
	//   49  129:invokevirtual   #48  <Method void a(Object, int, Object)>
				return true;
	//   50  132:iconst_1        
	//   51  133:ireturn         
			} else
			{
				throw asu.e();
	//   52  134:invokestatic    #52  <Method asu asu.e()>
	//   53  137:athrow          
			}

		case 2: // '\002'
			a(obj, j, aum1.n());
	//   54  138:aload_0         
	//   55  139:aload_1         
	//   56  140:iload           4
	//   57  142:aload_2         
	//   58  143:invokeinterface #56  <Method aqq aum.n()>
	//   59  148:invokevirtual   #58  <Method void a(Object, int, aqq)>
			return true;
	//   60  151:iconst_1        
	//   61  152:ireturn         

		case 1: // '\001'
			b(obj, j, aum1.i());
	//   62  153:aload_0         
	//   63  154:aload_1         
	//   64  155:iload           4
	//   65  157:aload_2         
	//   66  158:invokeinterface #62  <Method long aum.i()>
	//   67  163:invokevirtual   #64  <Method void b(Object, int, long)>
			return true;
	//   68  166:iconst_1        
	//   69  167:ireturn         

		case 0: // '\0'
			a(obj, j, aum1.g());
	//   70  168:aload_0         
	//   71  169:aload_1         
	//   72  170:iload           4
	//   73  172:aload_2         
	//   74  173:invokeinterface #67  <Method long aum.g()>
	//   75  178:invokevirtual   #69  <Method void a(Object, int, long)>
			return true;
	//   76  181:iconst_1        
	//   77  182:ireturn         
		}
	}

	abstract Object b(Object obj);

	abstract void b(Object obj, int i, long l);

	abstract void b(Object obj, awf awf);

	abstract void b(Object obj, Object obj1);

	abstract Object c(Object obj);

	abstract Object c(Object obj, Object obj1);

	abstract void d(Object obj);

	abstract int e(Object obj);

	abstract int f(Object obj);
}
