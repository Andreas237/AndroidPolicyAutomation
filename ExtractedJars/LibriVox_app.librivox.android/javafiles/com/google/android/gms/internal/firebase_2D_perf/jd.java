// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ja, jf, jk, je, 
//			g, dx, jg, cv, 
//			f

public abstract class jd extends ja
	implements List, RandomAccess
{

	jd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ja()>
	//    2    4:return          
	}

	static jd a(Object aobj[])
	{
		return b(aobj, aobj.length);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:arraylength     
	//    3    3:invokestatic    #33  <Method jd b(Object[], int)>
	//    4    6:areturn         
	}

	static jd b(Object aobj[], int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            8
			return jk.a;
	//    2    4:getstatic       #19  <Field jd jk.a>
	//    3    7:areturn         
		else
			return ((jd) (new jk(aobj, i)));
	//    4    8:new             #16  <Class jk>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #36  <Method void jk(Object[], int)>
	//    9   17:areturn         
	}

	public static jd f()
	{
		return jk.a;
	//    0    0:getstatic       #19  <Field jd jk.a>
	//    1    3:areturn         
	}

	public static je g()
	{
		return new je();
	//    0    0:new             #42  <Class je>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void je()>
	//    3    7:areturn         
	}

	int a(Object aobj[], int i)
	{
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method int size()>
	//    2    4:istore          4
		for(int j = 0; j < k; j++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          31
			aobj[i + j] = get(j);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:iload_3         
	//   11   17:iadd            
	//   12   18:aload_0         
	//   13   19:iload_3         
	//   14   20:invokevirtual   #52  <Method Object get(int)>
	//   15   23:aastore         

	//   16   24:iload_3         
	//   17   25:iconst_1        
	//   18   26:iadd            
	//   19   27:istore_3        
	//*  20   28:goto            8
		return i + k;
	//   21   31:iload_2         
	//   22   32:iload           4
	//   23   34:iadd            
	//   24   35:ireturn         
	}

	public final f a()
	{
		return ((f) ((g)listIterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method ListIterator listIterator()>
	//    2    4:checkcast       #59  <Class g>
	//    3    7:areturn         
	}

	public jd a(int i, int j)
	{
		dx.a(i, j, size());
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #48  <Method int size()>
	//    4    6:invokestatic    #65  <Method void dx.a(int, int, int)>
		j -= i;
	//    5    9:iload_2         
	//    6   10:iload_1         
	//    7   11:isub            
	//    8   12:istore_2        
		if(j == size())
	//*   9   13:iload_2         
	//*  10   14:aload_0         
	//*  11   15:invokevirtual   #48  <Method int size()>
	//*  12   18:icmpne          23
			return this;
	//   13   21:aload_0         
	//   14   22:areturn         
		if(j == 0)
	//*  15   23:iload_2         
	//*  16   24:ifne            31
			return jk.a;
	//   17   27:getstatic       #19  <Field jd jk.a>
	//   18   30:areturn         
		else
			return ((jd) (new jg(this, i, j)));
	//   19   31:new             #67  <Class jg>
	//   20   34:dup             
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:iload_2         
	//   24   38:invokespecial   #70  <Method void jg(jd, int, int)>
	//   25   41:areturn         
	}

	public final void add(int i, Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #75  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final boolean addAll(int i, Collection collection)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #75  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final jd b()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean contains(Object obj)
	{
		return indexOf(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method int indexOf(Object)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == dx.a(((Object) (this))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokestatic    #91  <Method Object dx.a(Object)>
	//*   3    5:if_acmpne       10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		if(!(obj instanceof List)) goto _L2; else goto _L1
	//    6   10:aload_1         
	//    7   11:instanceof      #6   <Class List>
	//    8   14:ifeq            170
_L1:
		int j;
		Object obj1;
		obj1 = ((Object) ((List)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #6   <Class List>
	//   11   21:astore          4
		j = ((List)this).size();
	//   12   23:aload_0         
	//   13   24:invokeinterface #92  <Method int List.size()>
	//   14   29:istore_3        
		if(j != ((List) (obj1)).size()) goto _L2; else goto _L3
	//   15   30:iload_3         
	//   16   31:aload           4
	//   17   33:invokeinterface #92  <Method int List.size()>
	//   18   38:icmpne          170
_L3:
		if(!(this instanceof RandomAccess) || !(obj1 instanceof RandomAccess)) goto _L5; else goto _L4
	//   19   41:aload_0         
	//   20   42:instanceof      #8   <Class RandomAccess>
	//   21   45:ifeq            93
	//   22   48:aload           4
	//   23   50:instanceof      #8   <Class RandomAccess>
	//   24   53:ifeq            93
_L4:
		int i = 0;
	//   25   56:iconst_0        
	//   26   57:istore_2        
_L9:
		if(i >= j) goto _L7; else goto _L6
	//   27   58:iload_2         
	//   28   59:iload_3         
	//   29   60:icmpge          91
_L6:
		if(!cv.a(((List)this).get(i), ((List) (obj1)).get(i))) goto _L2; else goto _L8
	//   30   63:aload_0         
	//   31   64:iload_2         
	//   32   65:invokeinterface #93  <Method Object List.get(int)>
	//   33   70:aload           4
	//   34   72:iload_2         
	//   35   73:invokeinterface #93  <Method Object List.get(int)>
	//   36   78:invokestatic    #98  <Method boolean cv.a(Object, Object)>
	//   37   81:ifeq            170
_L8:
		i++;
	//   38   84:iload_2         
	//   39   85:iconst_1        
	//   40   86:iadd            
	//   41   87:istore_2        
		  goto _L9
	//*  42   88:goto            58
_L7:
		return true;
	//   43   91:iconst_1        
	//   44   92:ireturn         
_L5:
		obj = ((Object) ((jd)this));
	//   45   93:aload_0         
	//   46   94:checkcast       #2   <Class jd>
	//   47   97:astore_1        
		j = ((jd) (obj)).size();
	//   48   98:aload_1         
	//   49   99:invokevirtual   #48  <Method int size()>
	//   50  102:istore_3        
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   51  103:aload           4
	//   52  105:invokeinterface #102 <Method Iterator List.iterator()>
	//   53  110:astore          4
		i = 0;
	//   54  112:iconst_0        
	//   55  113:istore_2        
_L12:
		if(i >= j) goto _L11; else goto _L10
	//   56  114:iload_2         
	//   57  115:iload_3         
	//   58  116:icmpge          158
_L10:
		Object obj2;
		if(!((Iterator) (obj1)).hasNext())
			break; /* Loop/switch isn't completed */
	//   59  119:aload           4
	//   60  121:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   61  126:ifeq            170
		obj2 = ((jd) (obj)).get(i);
	//   62  129:aload_1         
	//   63  130:iload_2         
	//   64  131:invokevirtual   #52  <Method Object get(int)>
	//   65  134:astore          5
		i++;
	//   66  136:iload_2         
	//   67  137:iconst_1        
	//   68  138:iadd            
	//   69  139:istore_2        
		if(!cv.a(obj2, ((Iterator) (obj1)).next())) goto _L2; else goto _L12
	//   70  140:aload           5
	//   71  142:aload           4
	//   72  144:invokeinterface #112 <Method Object Iterator.next()>
	//   73  149:invokestatic    #98  <Method boolean cv.a(Object, Object)>
	//   74  152:ifeq            170
	//*  75  155:goto            114
_L11:
		if(!((Iterator) (obj1)).hasNext())
	//*  76  158:aload           4
	//*  77  160:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  78  165:ifne            170
			return true;
	//   79  168:iconst_1        
	//   80  169:ireturn         
_L2:
		return false;
	//   81  170:iconst_0        
	//   82  171:ireturn         
	}

	public int hashCode()
	{
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method int size()>
	//    2    4:istore_3        
		int j = 1;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		for(int i = 0; i < k; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_3         
	//*   9   11:icmpge          39
			j = ~~(j * 31 + get(i).hashCode());
	//   10   14:iload_2         
	//   11   15:bipush          31
	//   12   17:imul            
	//   13   18:aload_0         
	//   14   19:iload_1         
	//   15   20:invokevirtual   #52  <Method Object get(int)>
	//   16   23:invokevirtual   #117 <Method int Object.hashCode()>
	//   17   26:iadd            
	//   18   27:iconst_m1       
	//   19   28:ixor            
	//   20   29:iconst_m1       
	//   21   30:ixor            
	//   22   31:istore_2        

	//   23   32:iload_1         
	//   24   33:iconst_1        
	//   25   34:iadd            
	//   26   35:istore_1        
	//*  27   36:goto            9
		return j;
	//   28   39:iload_2         
	//   29   40:ireturn         
	}

	public int indexOf(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		if(this instanceof RandomAccess)
	//*   4    6:aload_0         
	//*   5    7:instanceof      #8   <Class RandomAccess>
	//*   6   10:ifeq            87
		{
			int j = ((List)this).size();
	//    7   13:aload_0         
	//    8   14:invokeinterface #92  <Method int List.size()>
	//    9   19:istore          4
			int i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_2        
			boolean flag = false;
	//   12   23:iconst_0        
	//   13   24:istore_3        
			if(obj == null)
	//*  14   25:aload_1         
	//*  15   26:ifnonnull       56
				for(i = ((int) (flag)); i < j; i++)
	//*  16   29:iload_3         
	//*  17   30:istore_2        
	//*  18   31:iload_2         
	//*  19   32:iload           4
	//*  20   34:icmpge          85
					if(((List)this).get(i) == null)
	//*  21   37:aload_0         
	//*  22   38:iload_2         
	//*  23   39:invokeinterface #93  <Method Object List.get(int)>
	//*  24   44:ifnonnull       49
						return i;
	//   25   47:iload_2         
	//   26   48:ireturn         

	//   27   49:iload_2         
	//   28   50:iconst_1        
	//   29   51:iadd            
	//   30   52:istore_2        
			else
	//*  31   53:goto            31
				for(; i < j; i++)
	//*  32   56:iload_2         
	//*  33   57:iload           4
	//*  34   59:icmpge          85
					if(obj.equals(((List)this).get(i)))
	//*  35   62:aload_1         
	//*  36   63:aload_0         
	//*  37   64:iload_2         
	//*  38   65:invokeinterface #93  <Method Object List.get(int)>
	//*  39   70:invokevirtual   #119 <Method boolean Object.equals(Object)>
	//*  40   73:ifeq            78
						return i;
	//   41   76:iload_2         
	//   42   77:ireturn         

	//   43   78:iload_2         
	//   44   79:iconst_1        
	//   45   80:iadd            
	//   46   81:istore_2        
	//*  47   82:goto            56
			return -1;
	//   48   85:iconst_m1       
	//   49   86:ireturn         
		}
		for(ListIterator listiterator = ((List)this).listIterator(); listiterator.hasNext();)
	//*  50   87:aload_0         
	//*  51   88:invokeinterface #120 <Method ListIterator List.listIterator()>
	//*  52   93:astore          5
	//*  53   95:aload           5
	//*  54   97:invokeinterface #123 <Method boolean ListIterator.hasNext()>
	//*  55  102:ifeq            127
			if(cv.a(obj, listiterator.next()))
	//*  56  105:aload_1         
	//*  57  106:aload           5
	//*  58  108:invokeinterface #124 <Method Object ListIterator.next()>
	//*  59  113:invokestatic    #98  <Method boolean cv.a(Object, Object)>
	//*  60  116:ifeq            95
				return listiterator.previousIndex();
	//   61  119:aload           5
	//   62  121:invokeinterface #127 <Method int ListIterator.previousIndex()>
	//   63  126:ireturn         

		return -1;
	//   64  127:iconst_m1       
	//   65  128:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (((ja)this).a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method f ja.a()>
	//    2    4:areturn         
	}

	public int lastIndexOf(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		if(this instanceof RandomAccess)
	//*   4    6:aload_0         
	//*   5    7:instanceof      #8   <Class RandomAccess>
	//*   6   10:ifeq            87
		{
			if(obj == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       49
			{
				for(int i = ((List)this).size() - 1; i >= 0; i--)
	//*   9   17:aload_0         
	//*  10   18:invokeinterface #92  <Method int List.size()>
	//*  11   23:iconst_1        
	//*  12   24:isub            
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:iflt            85
					if(((List)this).get(i) == null)
	//*  16   30:aload_0         
	//*  17   31:iload_2         
	//*  18   32:invokeinterface #93  <Method Object List.get(int)>
	//*  19   37:ifnonnull       42
						return i;
	//   20   40:iload_2         
	//   21   41:ireturn         

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:isub            
	//   25   45:istore_2        
			} else
	//*  26   46:goto            26
			{
				for(int j = ((List)this).size() - 1; j >= 0; j--)
	//*  27   49:aload_0         
	//*  28   50:invokeinterface #92  <Method int List.size()>
	//*  29   55:iconst_1        
	//*  30   56:isub            
	//*  31   57:istore_2        
	//*  32   58:iload_2         
	//*  33   59:iflt            85
					if(obj.equals(((List)this).get(j)))
	//*  34   62:aload_1         
	//*  35   63:aload_0         
	//*  36   64:iload_2         
	//*  37   65:invokeinterface #93  <Method Object List.get(int)>
	//*  38   70:invokevirtual   #119 <Method boolean Object.equals(Object)>
	//*  39   73:ifeq            78
						return j;
	//   40   76:iload_2         
	//   41   77:ireturn         

	//   42   78:iload_2         
	//   43   79:iconst_1        
	//   44   80:isub            
	//   45   81:istore_2        
			}
	//*  46   82:goto            58
			return -1;
	//   47   85:iconst_m1       
	//   48   86:ireturn         
		}
		for(ListIterator listiterator = ((List)this).listIterator(((List)this).size()); listiterator.hasPrevious();)
	//*  49   87:aload_0         
	//*  50   88:aload_0         
	//*  51   89:invokeinterface #92  <Method int List.size()>
	//*  52   94:invokeinterface #133 <Method ListIterator List.listIterator(int)>
	//*  53   99:astore_3        
	//*  54  100:aload_3         
	//*  55  101:invokeinterface #136 <Method boolean ListIterator.hasPrevious()>
	//*  56  106:ifeq            129
			if(cv.a(obj, listiterator.previous()))
	//*  57  109:aload_1         
	//*  58  110:aload_3         
	//*  59  111:invokeinterface #139 <Method Object ListIterator.previous()>
	//*  60  116:invokestatic    #98  <Method boolean cv.a(Object, Object)>
	//*  61  119:ifeq            100
				return listiterator.nextIndex();
	//   62  122:aload_3         
	//   63  123:invokeinterface #142 <Method int ListIterator.nextIndex()>
	//   64  128:ireturn         

		return -1;
	//   65  129:iconst_m1       
	//   66  130:ireturn         
	}

	public ListIterator listIterator()
	{
		return ((ListIterator) ((g)listIterator(0)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #143 <Method ListIterator listIterator(int)>
	//    3    5:checkcast       #59  <Class g>
	//    4    8:areturn         
	}

	public ListIterator listIterator(int i)
	{
		dx.b(i, size());
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #48  <Method int size()>
	//    3    5:invokestatic    #146 <Method int dx.b(int, int)>
	//    4    8:pop             
		if(isEmpty())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #149 <Method boolean isEmpty()>
	//*   7   13:ifeq            20
			return ((ListIterator) (a));
	//    8   16:getstatic       #25  <Field g a>
	//    9   19:areturn         
		else
			return ((ListIterator) (new jf(this, i)));
	//   10   20:new             #14  <Class jf>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #23  <Method void jf(jd, int)>
	//   15   29:areturn         
	}

	public final Object remove(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #75  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final Object set(int i, Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #75  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public List subList(int i, int j)
	{
		return ((List) (a(i, j)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #156 <Method jd a(int, int)>
	//    4    6:areturn         
	}

	private static final g a;

	static 
	{
		a = ((g) (new jf(jk.a, 0)));
	//    0    0:new             #14  <Class jf>
	//    1    3:dup             
	//    2    4:getstatic       #19  <Field jd jk.a>
	//    3    7:iconst_0        
	//    4    8:invokespecial   #23  <Method void jf(jd, int)>
	//    5   11:putstatic       #25  <Field g a>
	//*   6   14:return          
	}
}
