// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.*;

public final class ListUtil
{
	private static final class FiveItemImmutableList extends AbstractList
		implements ImmutableList
	{

		public Object get(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 4: default 36
		//		               0 64
		//		               1 59
		//		               2 54
		//		               3 49
		//		               4 44
			default:
				throw new IndexOutOfBoundsException();
		//    2   36:new             #39  <Class IndexOutOfBoundsException>
		//    3   39:dup             
		//    4   40:invokespecial   #40  <Method void IndexOutOfBoundsException()>
		//    5   43:athrow          

			case 4: // '\004'
				return mItem4;
		//    6   44:aload_0         
		//    7   45:getfield        #32  <Field Object mItem4>
		//    8   48:areturn         

			case 3: // '\003'
				return mItem3;
		//    9   49:aload_0         
		//   10   50:getfield        #30  <Field Object mItem3>
		//   11   53:areturn         

			case 2: // '\002'
				return mItem2;
		//   12   54:aload_0         
		//   13   55:getfield        #28  <Field Object mItem2>
		//   14   58:areturn         

			case 1: // '\001'
				return mItem1;
		//   15   59:aload_0         
		//   16   60:getfield        #26  <Field Object mItem1>
		//   17   63:areturn         

			case 0: // '\0'
				return mItem0;
		//   18   64:aload_0         
		//   19   65:getfield        #24  <Field Object mItem0>
		//   20   68:areturn         
			}
		}

		public int size()
		{
			return 5;
		//    0    0:iconst_5        
		//    1    1:ireturn         
		}

		private final Object mItem0;
		private final Object mItem1;
		private final Object mItem2;
		private final Object mItem3;
		private final Object mItem4;

		public FiveItemImmutableList(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void AbstractList()>
			mItem0 = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field Object mItem0>
			mItem1 = obj1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Object mItem1>
			mItem2 = obj2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field Object mItem2>
			mItem3 = obj3;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field Object mItem3>
			mItem4 = obj4;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #32  <Field Object mItem4>
		//   17   31:return          
		}
	}

	private static final class FourItemImmutableList extends AbstractList
		implements ImmutableList
	{

		public Object get(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 3: default 32
		//		               0 55
		//		               1 50
		//		               2 45
		//		               3 40
			default:
				throw new IndexOutOfBoundsException();
		//    2   32:new             #36  <Class IndexOutOfBoundsException>
		//    3   35:dup             
		//    4   36:invokespecial   #37  <Method void IndexOutOfBoundsException()>
		//    5   39:athrow          

			case 3: // '\003'
				return mItem3;
		//    6   40:aload_0         
		//    7   41:getfield        #29  <Field Object mItem3>
		//    8   44:areturn         

			case 2: // '\002'
				return mItem2;
		//    9   45:aload_0         
		//   10   46:getfield        #27  <Field Object mItem2>
		//   11   49:areturn         

			case 1: // '\001'
				return mItem1;
		//   12   50:aload_0         
		//   13   51:getfield        #25  <Field Object mItem1>
		//   14   54:areturn         

			case 0: // '\0'
				return mItem0;
		//   15   55:aload_0         
		//   16   56:getfield        #23  <Field Object mItem0>
		//   17   59:areturn         
			}
		}

		public int size()
		{
			return 4;
		//    0    0:iconst_4        
		//    1    1:ireturn         
		}

		private final Object mItem0;
		private final Object mItem1;
		private final Object mItem2;
		private final Object mItem3;

		public FourItemImmutableList(Object obj, Object obj1, Object obj2, Object obj3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void AbstractList()>
			mItem0 = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Object mItem0>
			mItem1 = obj1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Object mItem1>
			mItem2 = obj2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field Object mItem2>
			mItem3 = obj3;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #29  <Field Object mItem3>
		//   14   25:return          
		}
	}

	private static final class ImmutableArrayList extends AbstractList
		implements ImmutableList
	{

		public Object get(int i)
		{
			return mArray[i];
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Object[] mArray>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public int size()
		{
			return mArray.length;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Object[] mArray>
		//    2    4:arraylength     
		//    3    5:ireturn         
		}

		private final Object mArray[];

		public ImmutableArrayList(Object aobj[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void AbstractList()>
			mArray = aobj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Object[] mArray>
		//    5    9:return          
		}
	}

	private static interface ImmutableList
		extends List, RandomAccess
	{
	}

	private static final class OneItemImmutableList extends AbstractList
		implements ImmutableList
	{

		public Object get(int i)
		{
			if(i == 0)
		//*   0    0:iload_1         
		//*   1    1:ifne            9
				return mItem;
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field Object mItem>
		//    4    8:areturn         
			else
				throw new IndexOutOfBoundsException();
		//    5    9:new             #27  <Class IndexOutOfBoundsException>
		//    6   12:dup             
		//    7   13:invokespecial   #28  <Method void IndexOutOfBoundsException()>
		//    8   16:athrow          
		}

		public int size()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		private final Object mItem;

		public OneItemImmutableList(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void AbstractList()>
			mItem = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Object mItem>
		//    5    9:return          
		}
	}

	private static final class ThreeItemImmutableList extends AbstractList
		implements ImmutableList
	{

		public Object get(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 46
		//		               1 41
		//		               2 36
			default:
				throw new IndexOutOfBoundsException();
		//    2   28:new             #33  <Class IndexOutOfBoundsException>
		//    3   31:dup             
		//    4   32:invokespecial   #34  <Method void IndexOutOfBoundsException()>
		//    5   35:athrow          

			case 2: // '\002'
				return mItem2;
		//    6   36:aload_0         
		//    7   37:getfield        #26  <Field Object mItem2>
		//    8   40:areturn         

			case 1: // '\001'
				return mItem1;
		//    9   41:aload_0         
		//   10   42:getfield        #24  <Field Object mItem1>
		//   11   45:areturn         

			case 0: // '\0'
				return mItem0;
		//   12   46:aload_0         
		//   13   47:getfield        #22  <Field Object mItem0>
		//   14   50:areturn         
			}
		}

		public int size()
		{
			return 3;
		//    0    0:iconst_3        
		//    1    1:ireturn         
		}

		private final Object mItem0;
		private final Object mItem1;
		private final Object mItem2;

		public ThreeItemImmutableList(Object obj, Object obj1, Object obj2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void AbstractList()>
			mItem0 = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Object mItem0>
			mItem1 = obj1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Object mItem1>
			mItem2 = obj2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field Object mItem2>
		//   11   19:return          
		}
	}

	private static final class TwoItemImmutableList extends AbstractList
		implements ImmutableList
	{

		public Object get(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 37
		//		               1 32
			default:
				throw new IndexOutOfBoundsException();
		//    2   24:new             #30  <Class IndexOutOfBoundsException>
		//    3   27:dup             
		//    4   28:invokespecial   #31  <Method void IndexOutOfBoundsException()>
		//    5   31:athrow          

			case 1: // '\001'
				return mItem1;
		//    6   32:aload_0         
		//    7   33:getfield        #23  <Field Object mItem1>
		//    8   36:areturn         

			case 0: // '\0'
				return mItem0;
		//    9   37:aload_0         
		//   10   38:getfield        #21  <Field Object mItem0>
		//   11   41:areturn         
			}
		}

		public int size()
		{
			return 2;
		//    0    0:iconst_2        
		//    1    1:ireturn         
		}

		private final Object mItem0;
		private final Object mItem1;

		public TwoItemImmutableList(Object obj, Object obj1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void AbstractList()>
			mItem0 = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Object mItem0>
			mItem1 = obj1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Object mItem1>
		//    8   14:return          
		}
	}


	private ListUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static List copyToImmutableList(List list)
	{
		if(list instanceof ImmutableList)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #15  <Class ListUtil$ImmutableList>
	//*   2    4:ifeq            9
			return list;
	//    3    7:aload_0         
	//    4    8:areturn         
		switch(list.size())
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #38  <Method int List.size()>
		{
	//*   7   15:tableswitch     0 5: default 52
	//	               0 211
	//	               1 196
	//	               2 174
	//	               3 145
	//	               4 109
	//	               5 66
		default:
			return ((List) (new ImmutableArrayList(list.toArray())));
	//    8   52:new             #12  <Class ListUtil$ImmutableArrayList>
	//    9   55:dup             
	//   10   56:aload_0         
	//   11   57:invokeinterface #42  <Method Object[] List.toArray()>
	//   12   62:invokespecial   #45  <Method void ListUtil$ImmutableArrayList(Object[])>
	//   13   65:areturn         

		case 5: // '\005'
			return ((List) (new FiveItemImmutableList(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4))));
	//   14   66:new             #6   <Class ListUtil$FiveItemImmutableList>
	//   15   69:dup             
	//   16   70:aload_0         
	//   17   71:iconst_0        
	//   18   72:invokeinterface #49  <Method Object List.get(int)>
	//   19   77:aload_0         
	//   20   78:iconst_1        
	//   21   79:invokeinterface #49  <Method Object List.get(int)>
	//   22   84:aload_0         
	//   23   85:iconst_2        
	//   24   86:invokeinterface #49  <Method Object List.get(int)>
	//   25   91:aload_0         
	//   26   92:iconst_3        
	//   27   93:invokeinterface #49  <Method Object List.get(int)>
	//   28   98:aload_0         
	//   29   99:iconst_4        
	//   30  100:invokeinterface #49  <Method Object List.get(int)>
	//   31  105:invokespecial   #52  <Method void ListUtil$FiveItemImmutableList(Object, Object, Object, Object, Object)>
	//   32  108:areturn         

		case 4: // '\004'
			return ((List) (new FourItemImmutableList(list.get(0), list.get(1), list.get(2), list.get(3))));
	//   33  109:new             #9   <Class ListUtil$FourItemImmutableList>
	//   34  112:dup             
	//   35  113:aload_0         
	//   36  114:iconst_0        
	//   37  115:invokeinterface #49  <Method Object List.get(int)>
	//   38  120:aload_0         
	//   39  121:iconst_1        
	//   40  122:invokeinterface #49  <Method Object List.get(int)>
	//   41  127:aload_0         
	//   42  128:iconst_2        
	//   43  129:invokeinterface #49  <Method Object List.get(int)>
	//   44  134:aload_0         
	//   45  135:iconst_3        
	//   46  136:invokeinterface #49  <Method Object List.get(int)>
	//   47  141:invokespecial   #55  <Method void ListUtil$FourItemImmutableList(Object, Object, Object, Object)>
	//   48  144:areturn         

		case 3: // '\003'
			return ((List) (new ThreeItemImmutableList(list.get(0), list.get(1), list.get(2))));
	//   49  145:new             #21  <Class ListUtil$ThreeItemImmutableList>
	//   50  148:dup             
	//   51  149:aload_0         
	//   52  150:iconst_0        
	//   53  151:invokeinterface #49  <Method Object List.get(int)>
	//   54  156:aload_0         
	//   55  157:iconst_1        
	//   56  158:invokeinterface #49  <Method Object List.get(int)>
	//   57  163:aload_0         
	//   58  164:iconst_2        
	//   59  165:invokeinterface #49  <Method Object List.get(int)>
	//   60  170:invokespecial   #58  <Method void ListUtil$ThreeItemImmutableList(Object, Object, Object)>
	//   61  173:areturn         

		case 2: // '\002'
			return ((List) (new TwoItemImmutableList(list.get(0), list.get(1))));
	//   62  174:new             #24  <Class ListUtil$TwoItemImmutableList>
	//   63  177:dup             
	//   64  178:aload_0         
	//   65  179:iconst_0        
	//   66  180:invokeinterface #49  <Method Object List.get(int)>
	//   67  185:aload_0         
	//   68  186:iconst_1        
	//   69  187:invokeinterface #49  <Method Object List.get(int)>
	//   70  192:invokespecial   #61  <Method void ListUtil$TwoItemImmutableList(Object, Object)>
	//   71  195:areturn         

		case 1: // '\001'
			return ((List) (new OneItemImmutableList(list.get(0))));
	//   72  196:new             #18  <Class ListUtil$OneItemImmutableList>
	//   73  199:dup             
	//   74  200:aload_0         
	//   75  201:iconst_0        
	//   76  202:invokeinterface #49  <Method Object List.get(int)>
	//   77  207:invokespecial   #64  <Method void ListUtil$OneItemImmutableList(Object)>
	//   78  210:areturn         

		case 0: // '\0'
			return Collections.emptyList();
	//   79  211:invokestatic    #70  <Method List Collections.emptyList()>
	//   80  214:areturn         
		}
	}

	public static boolean identityEquals(List list, List list1)
	{
		if(list == list1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		int j = list.size();
	//    5    7:aload_0         
	//    6    8:invokeinterface #38  <Method int List.size()>
	//    7   13:istore_3        
		if(j != list1.size())
	//*   8   14:iload_3         
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #38  <Method int List.size()>
	//*  11   21:icmpeq          26
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		for(int i = 0; i < j; i++)
	//*  14   26:iconst_0        
	//*  15   27:istore_2        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          59
			if(list.get(i) != list1.get(i))
	//*  19   33:aload_0         
	//*  20   34:iload_2         
	//*  21   35:invokeinterface #49  <Method Object List.get(int)>
	//*  22   40:aload_1         
	//*  23   41:iload_2         
	//*  24   42:invokeinterface #49  <Method Object List.get(int)>
	//*  25   47:if_acmpeq       52
				return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         

	//   28   52:iload_2         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_2        
	//*  32   56:goto            28
		return true;
	//   33   59:iconst_1        
	//   34   60:ireturn         
	}

	public static List newImmutableList(Object obj)
	{
		return ((List) (new OneItemImmutableList(obj)));
	//    0    0:new             #18  <Class ListUtil$OneItemImmutableList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #64  <Method void ListUtil$OneItemImmutableList(Object)>
	//    4    8:areturn         
	}
}
