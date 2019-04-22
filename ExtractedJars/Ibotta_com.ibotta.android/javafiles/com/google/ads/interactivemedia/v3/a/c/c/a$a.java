// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.c;

import java.util.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.c.c:
//			a

static final class a$a extends a
{

	public void a(a$a a$a1)
	{
		aR.add(((Object) (a$a1)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List aR>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void a(a$b a$b1)
	{
		aQ.add(((Object) (a$b1)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List aQ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public a$b d(int i)
	{
		int k = aQ.size();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List aQ>
	//    2    4:invokeinterface #43  <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          51
		{
			a$b a$b1 = (a$b)aQ.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field List aQ>
	//   11   21:iload_2         
	//   12   22:invokeinterface #47  <Method Object List.get(int)>
	//   13   27:checkcast       #49  <Class a$b>
	//   14   30:astore          4
			if(a$b1.aO == i)
	//*  15   32:aload           4
	//*  16   34:getfield        #53  <Field int a$b.aO>
	//*  17   37:iload_1         
	//*  18   38:icmpne          44
				return a$b1;
	//   19   41:aload           4
	//   20   43:areturn         
		}

	//   21   44:iload_2         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:istore_2        
	//*  25   48:goto            12
		return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
	}

	public a$a e(int i)
	{
		int k = aR.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List aR>
	//    2    4:invokeinterface #43  <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          51
		{
			a$a a$a1 = (a$a)aR.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #28  <Field List aR>
	//   11   21:iload_2         
	//   12   22:invokeinterface #47  <Method Object List.get(int)>
	//   13   27:checkcast       #2   <Class a$a>
	//   14   30:astore          4
			if(a$a1.aO == i)
	//*  15   32:aload           4
	//*  16   34:getfield        #56  <Field int aO>
	//*  17   37:iload_1         
	//*  18   38:icmpne          44
				return a$a1;
	//   19   41:aload           4
	//   20   43:areturn         
		}

	//   21   44:iload_2         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:istore_2        
	//*  25   48:goto            12
		return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
	}

	public int f(int i)
	{
		int k1 = aQ.size();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List aQ>
	//    2    4:invokeinterface #43  <Method int List.size()>
	//    3    9:istore          6
		boolean flag = false;
	//    4   11:iconst_0        
	//    5   12:istore          5
		int l = 0;
	//    6   14:iconst_0        
	//    7   15:istore_3        
		int j;
		int i1;
		for(j = 0; l < k1; j = i1)
	//*   8   16:iconst_0        
	//*   9   17:istore_2        
	//*  10   18:iload_3         
	//*  11   19:iload           6
	//*  12   21:icmpge          62
		{
			i1 = j;
	//   13   24:iload_2         
	//   14   25:istore          4
			if(((a$b)aQ.get(l)).aO == i)
	//*  15   27:aload_0         
	//*  16   28:getfield        #26  <Field List aQ>
	//*  17   31:iload_3         
	//*  18   32:invokeinterface #47  <Method Object List.get(int)>
	//*  19   37:checkcast       #49  <Class a$b>
	//*  20   40:getfield        #53  <Field int a$b.aO>
	//*  21   43:iload_1         
	//*  22   44:icmpne          52
				i1 = j + 1;
	//   23   47:iload_2         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore          4
			l++;
	//   27   52:iload_3         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_3        
		}

	//   31   56:iload           4
	//   32   58:istore_2        
	//*  33   59:goto            18
		k1 = aR.size();
	//   34   62:aload_0         
	//   35   63:getfield        #28  <Field List aR>
	//   36   66:invokeinterface #43  <Method int List.size()>
	//   37   71:istore          6
		l = j;
	//   38   73:iload_2         
	//   39   74:istore_3        
		for(int k = ((int) (flag)); k < k1;)
	//*  40   75:iload           5
	//*  41   77:istore_2        
	//*  42   78:iload_2         
	//*  43   79:iload           6
	//*  44   81:icmpge          122
		{
			int j1 = l;
	//   45   84:iload_3         
	//   46   85:istore          4
			if(((a$a)aR.get(k)).aO == i)
	//*  47   87:aload_0         
	//*  48   88:getfield        #28  <Field List aR>
	//*  49   91:iload_2         
	//*  50   92:invokeinterface #47  <Method Object List.get(int)>
	//*  51   97:checkcast       #2   <Class a$a>
	//*  52  100:getfield        #56  <Field int aO>
	//*  53  103:iload_1         
	//*  54  104:icmpne          112
				j1 = l + 1;
	//   55  107:iload_3         
	//   56  108:iconst_1        
	//   57  109:iadd            
	//   58  110:istore          4
			k++;
	//   59  112:iload_2         
	//   60  113:iconst_1        
	//   61  114:iadd            
	//   62  115:istore_2        
			l = j1;
	//   63  116:iload           4
	//   64  118:istore_3        
		}

	//*  65  119:goto            78
		return l;
	//   66  122:iload_3         
	//   67  123:ireturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (c(aO))));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int aO>
	//    2    4:invokestatic    #64  <Method String c(int)>
	//    3    7:invokestatic    #70  <Method String String.valueOf(Object)>
	//    4   10:astore_1        
		String s1 = String.valueOf(((Object) (Arrays.toString(aQ.toArray(((Object []) (new a$b[0])))))));
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field List aQ>
	//    7   15:iconst_0        
	//    8   16:anewarray       a$b[]
	//    9   19:invokeinterface #74  <Method Object[] List.toArray(Object[])>
	//   10   24:invokestatic    #79  <Method String Arrays.toString(Object[])>
	//   11   27:invokestatic    #70  <Method String String.valueOf(Object)>
	//   12   30:astore_2        
		String s2 = String.valueOf(((Object) (Arrays.toString(aR.toArray(((Object []) (new a$a[0])))))));
	//   13   31:aload_0         
	//   14   32:getfield        #28  <Field List aR>
	//   15   35:iconst_0        
	//   16   36:anewarray       a$a[]
	//   17   39:invokeinterface #74  <Method Object[] List.toArray(Object[])>
	//   18   44:invokestatic    #79  <Method String Arrays.toString(Object[])>
	//   19   47:invokestatic    #70  <Method String String.valueOf(Object)>
	//   20   50:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 22 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   21   51:new             #81  <Class StringBuilder>
	//   22   54:dup             
	//   23   55:aload_1         
	//   24   56:invokestatic    #70  <Method String String.valueOf(Object)>
	//   25   59:invokevirtual   #84  <Method int String.length()>
	//   26   62:bipush          22
	//   27   64:iadd            
	//   28   65:aload_2         
	//   29   66:invokestatic    #70  <Method String String.valueOf(Object)>
	//   30   69:invokevirtual   #84  <Method int String.length()>
	//   31   72:iadd            
	//   32   73:aload_3         
	//   33   74:invokestatic    #70  <Method String String.valueOf(Object)>
	//   34   77:invokevirtual   #84  <Method int String.length()>
	//   35   80:iadd            
	//   36   81:invokespecial   #85  <Method void StringBuilder(int)>
	//   37   84:astore          4
		stringbuilder.append(s);
	//   38   86:aload           4
	//   39   88:aload_1         
	//   40   89:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   41   92:pop             
		stringbuilder.append(" leaves: ");
	//   42   93:aload           4
	//   43   95:ldc1            #91  <String " leaves: ">
	//   44   97:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
		stringbuilder.append(s1);
	//   46  101:aload           4
	//   47  103:aload_2         
	//   48  104:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   49  107:pop             
		stringbuilder.append(" containers: ");
	//   50  108:aload           4
	//   51  110:ldc1            #93  <String " containers: ">
	//   52  112:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   53  115:pop             
		stringbuilder.append(s2);
	//   54  116:aload           4
	//   55  118:aload_3         
	//   56  119:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   57  122:pop             
		return stringbuilder.toString();
	//   58  123:aload           4
	//   59  125:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   60  128:areturn         
	}

	public final long aP;
	public final List aQ = new ArrayList();
	public final List aR = new ArrayList();

	public a$a(int i, long l)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #17  <Method void a(int)>
		aP = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #19  <Field long aP>
	//    6   10:aload_0         
	//    7   11:new             #21  <Class ArrayList>
	//    8   14:dup             
	//    9   15:invokespecial   #24  <Method void ArrayList()>
	//   10   18:putfield        #26  <Field List aQ>
	//   11   21:aload_0         
	//   12   22:new             #21  <Class ArrayList>
	//   13   25:dup             
	//   14   26:invokespecial   #24  <Method void ArrayList()>
	//   15   29:putfield        #28  <Field List aR>
	//   16   32:return          
	}
}
