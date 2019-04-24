// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.Rect;
import java.util.*;

class FocusStrategy
{
	public static interface BoundsAdapter
	{

		public abstract void obtainBounds(Object obj, Rect rect);
	}

	public static interface CollectionAdapter
	{

		public abstract Object get(Object obj, int i);

		public abstract int size(Object obj);
	}

	private static class SequentialComparator
		implements Comparator
	{

		public int compare(Object obj, Object obj1)
		{
			Rect rect = mTemp1;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Rect mTemp1>
		//    2    4:astore          6
			Rect rect1 = mTemp2;
		//    3    6:aload_0         
		//    4    7:getfield        #30  <Field Rect mTemp2>
		//    5   10:astore          7
			mAdapter.obtainBounds(obj, rect);
		//    6   12:aload_0         
		//    7   13:getfield        #34  <Field FocusStrategy$BoundsAdapter mAdapter>
		//    8   16:aload_1         
		//    9   17:aload           6
		//   10   19:invokeinterface #45  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			mAdapter.obtainBounds(obj1, rect1);
		//   11   24:aload_0         
		//   12   25:getfield        #34  <Field FocusStrategy$BoundsAdapter mAdapter>
		//   13   28:aload_2         
		//   14   29:aload           7
		//   15   31:invokeinterface #45  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			int i = rect.top;
		//   16   36:aload           6
		//   17   38:getfield        #49  <Field int Rect.top>
		//   18   41:istore          4
			int j = rect1.top;
		//   19   43:aload           7
		//   20   45:getfield        #49  <Field int Rect.top>
		//   21   48:istore          5
			byte byte0 = -1;
		//   22   50:iconst_m1       
		//   23   51:istore_3        
			if(i < j)
		//*  24   52:iload           4
		//*  25   54:iload           5
		//*  26   56:icmpge          61
				return -1;
		//   27   59:iconst_m1       
		//   28   60:ireturn         
			if(rect.top > rect1.top)
		//*  29   61:aload           6
		//*  30   63:getfield        #49  <Field int Rect.top>
		//*  31   66:aload           7
		//*  32   68:getfield        #49  <Field int Rect.top>
		//*  33   71:icmple          76
				return 1;
		//   34   74:iconst_1        
		//   35   75:ireturn         
			if(rect.left < rect1.left)
		//*  36   76:aload           6
		//*  37   78:getfield        #52  <Field int Rect.left>
		//*  38   81:aload           7
		//*  39   83:getfield        #52  <Field int Rect.left>
		//*  40   86:icmpge          100
			{
				if(mIsLayoutRtl)
		//*  41   89:aload_0         
		//*  42   90:getfield        #32  <Field boolean mIsLayoutRtl>
		//*  43   93:ifeq            98
					byte0 = 1;
		//   44   96:iconst_1        
		//   45   97:istore_3        
				return ((int) (byte0));
		//   46   98:iload_3         
		//   47   99:ireturn         
			}
			if(rect.left > rect1.left)
		//*  48  100:aload           6
		//*  49  102:getfield        #52  <Field int Rect.left>
		//*  50  105:aload           7
		//*  51  107:getfield        #52  <Field int Rect.left>
		//*  52  110:icmple          124
				return !mIsLayoutRtl ? 1 : -1;
		//   53  113:aload_0         
		//   54  114:getfield        #32  <Field boolean mIsLayoutRtl>
		//   55  117:ifeq            122
		//   56  120:iconst_m1       
		//   57  121:ireturn         
		//   58  122:iconst_1        
		//   59  123:ireturn         
			if(rect.bottom < rect1.bottom)
		//*  60  124:aload           6
		//*  61  126:getfield        #55  <Field int Rect.bottom>
		//*  62  129:aload           7
		//*  63  131:getfield        #55  <Field int Rect.bottom>
		//*  64  134:icmpge          139
				return -1;
		//   65  137:iconst_m1       
		//   66  138:ireturn         
			if(rect.bottom > rect1.bottom)
		//*  67  139:aload           6
		//*  68  141:getfield        #55  <Field int Rect.bottom>
		//*  69  144:aload           7
		//*  70  146:getfield        #55  <Field int Rect.bottom>
		//*  71  149:icmple          154
				return 1;
		//   72  152:iconst_1        
		//   73  153:ireturn         
			if(rect.right < rect1.right)
		//*  74  154:aload           6
		//*  75  156:getfield        #58  <Field int Rect.right>
		//*  76  159:aload           7
		//*  77  161:getfield        #58  <Field int Rect.right>
		//*  78  164:icmpge          178
			{
				if(mIsLayoutRtl)
		//*  79  167:aload_0         
		//*  80  168:getfield        #32  <Field boolean mIsLayoutRtl>
		//*  81  171:ifeq            176
					byte0 = 1;
		//   82  174:iconst_1        
		//   83  175:istore_3        
				return ((int) (byte0));
		//   84  176:iload_3         
		//   85  177:ireturn         
			}
			if(rect.right > rect1.right)
		//*  86  178:aload           6
		//*  87  180:getfield        #58  <Field int Rect.right>
		//*  88  183:aload           7
		//*  89  185:getfield        #58  <Field int Rect.right>
		//*  90  188:icmple          202
				return !mIsLayoutRtl ? 1 : -1;
		//   91  191:aload_0         
		//   92  192:getfield        #32  <Field boolean mIsLayoutRtl>
		//   93  195:ifeq            200
		//   94  198:iconst_m1       
		//   95  199:ireturn         
		//   96  200:iconst_1        
		//   97  201:ireturn         
			else
				return 0;
		//   98  202:iconst_0        
		//   99  203:ireturn         
		}

		private final BoundsAdapter mAdapter;
		private final boolean mIsLayoutRtl;
		private final Rect mTemp1 = new Rect();
		private final Rect mTemp2 = new Rect();

		SequentialComparator(boolean flag, BoundsAdapter boundsadapter)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #25  <Class Rect>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void Rect()>
		//    6   12:putfield        #28  <Field Rect mTemp1>
		//    7   15:aload_0         
		//    8   16:new             #25  <Class Rect>
		//    9   19:dup             
		//   10   20:invokespecial   #26  <Method void Rect()>
		//   11   23:putfield        #30  <Field Rect mTemp2>
			mIsLayoutRtl = flag;
		//   12   26:aload_0         
		//   13   27:iload_1         
		//   14   28:putfield        #32  <Field boolean mIsLayoutRtl>
			mAdapter = boundsadapter;
		//   15   31:aload_0         
		//   16   32:aload_2         
		//   17   33:putfield        #34  <Field FocusStrategy$BoundsAdapter mAdapter>
		//   18   36:return          
		}
	}


	FocusStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	private static boolean beamBeats(int i, Rect rect, Rect rect1, Rect rect2)
	{
		boolean flag = beamsOverlap(i, rect, rect1);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #25  <Method boolean beamsOverlap(int, Rect, Rect)>
	//    4    6:istore          4
		if(!beamsOverlap(i, rect, rect2))
	//*   5    8:iload_0         
	//*   6    9:aload_1         
	//*   7   10:aload_3         
	//*   8   11:invokestatic    #25  <Method boolean beamsOverlap(int, Rect, Rect)>
	//*   9   14:ifne            70
		{
			if(!flag)
	//*  10   17:iload           4
	//*  11   19:ifne            24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			if(!isToDirectionOf(i, rect, rect2))
	//*  14   24:iload_0         
	//*  15   25:aload_1         
	//*  16   26:aload_3         
	//*  17   27:invokestatic    #28  <Method boolean isToDirectionOf(int, Rect, Rect)>
	//*  18   30:ifne            35
				return true;
	//   19   33:iconst_1        
	//   20   34:ireturn         
			if(i != 17)
	//*  21   35:iload_0         
	//*  22   36:bipush          17
	//*  23   38:icmpeq          68
			{
				if(i == 66)
	//*  24   41:iload_0         
	//*  25   42:bipush          66
	//*  26   44:icmpne          49
					return true;
	//   27   47:iconst_1        
	//   28   48:ireturn         
				return majorAxisDistance(i, rect, rect1) < majorAxisDistanceToFarEdge(i, rect, rect2);
	//   29   49:iload_0         
	//   30   50:aload_1         
	//   31   51:aload_2         
	//   32   52:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//   33   55:iload_0         
	//   34   56:aload_1         
	//   35   57:aload_3         
	//   36   58:invokestatic    #35  <Method int majorAxisDistanceToFarEdge(int, Rect, Rect)>
	//   37   61:icmpge          66
	//   38   64:iconst_1        
	//   39   65:ireturn         
	//   40   66:iconst_0        
	//   41   67:ireturn         
			} else
			{
				return true;
	//   42   68:iconst_1        
	//   43   69:ireturn         
			}
		} else
		{
			return false;
	//   44   70:iconst_0        
	//   45   71:ireturn         
		}
	}

	private static boolean beamsOverlap(int i, Rect rect, Rect rect1)
	{
		boolean flag3;
label0:
		{
			flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
			boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
			if(i == 17)
				break label0;
	//    4    6:iload_0         
	//    5    7:bipush          17
	//    6    9:icmpeq          73
			if(i != 33)
	//*   7   12:iload_0         
	//*   8   13:bipush          33
	//*   9   15:icmpeq          41
			{
				if(i == 66)
					break label0;
	//   10   18:iload_0         
	//   11   19:bipush          66
	//   12   21:icmpeq          73
				if(i != 130)
	//*  13   24:iload_0         
	//*  14   25:sipush          130
	//*  15   28:icmpeq          41
					throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   16   31:new             #38  <Class IllegalArgumentException>
	//   17   34:dup             
	//   18   35:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   19   37:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   20   40:athrow          
			}
			boolean flag = flag2;
	//   21   41:iload           4
	//   22   43:istore_3        
			if(rect1.right >= rect.left)
	//*  23   44:aload_2         
	//*  24   45:getfield        #49  <Field int Rect.right>
	//*  25   48:aload_1         
	//*  26   49:getfield        #52  <Field int Rect.left>
	//*  27   52:icmplt          71
			{
				flag = flag2;
	//   28   55:iload           4
	//   29   57:istore_3        
				if(rect1.left <= rect.right)
	//*  30   58:aload_2         
	//*  31   59:getfield        #52  <Field int Rect.left>
	//*  32   62:aload_1         
	//*  33   63:getfield        #49  <Field int Rect.right>
	//*  34   66:icmpgt          71
					flag = true;
	//   35   69:iconst_1        
	//   36   70:istore_3        
			}
			return flag;
	//   37   71:iload_3         
	//   38   72:ireturn         
		}
		boolean flag1 = flag3;
	//   39   73:iload           5
	//   40   75:istore_3        
		if(rect1.bottom >= rect.top)
	//*  41   76:aload_2         
	//*  42   77:getfield        #55  <Field int Rect.bottom>
	//*  43   80:aload_1         
	//*  44   81:getfield        #58  <Field int Rect.top>
	//*  45   84:icmplt          103
		{
			flag1 = flag3;
	//   46   87:iload           5
	//   47   89:istore_3        
			if(rect1.top <= rect.bottom)
	//*  48   90:aload_2         
	//*  49   91:getfield        #58  <Field int Rect.top>
	//*  50   94:aload_1         
	//*  51   95:getfield        #55  <Field int Rect.bottom>
	//*  52   98:icmpgt          103
				flag1 = true;
	//   53  101:iconst_1        
	//   54  102:istore_3        
		}
		return flag1;
	//   55  103:iload_3         
	//   56  104:ireturn         
	}

	public static Object findNextFocusInAbsoluteDirection(Object obj, CollectionAdapter collectionadapter, BoundsAdapter boundsadapter, Object obj1, Rect rect, int i)
	{
		Rect rect1 = new Rect(rect);
	//    0    0:new             #45  <Class Rect>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:invokespecial   #64  <Method void Rect(Rect)>
	//    4    9:astore          10
		int j = 0;
	//    5   11:iconst_0        
	//    6   12:istore          6
		if(i != 17)
	//*   7   14:iload           5
	//*   8   16:bipush          17
	//*   9   18:icmpeq          103
		{
			if(i != 33)
	//*  10   21:iload           5
	//*  11   23:bipush          33
	//*  12   25:icmpeq          87
			{
				if(i != 66)
	//*  13   28:iload           5
	//*  14   30:bipush          66
	//*  15   32:icmpeq          70
				{
					if(i != 130)
	//*  16   35:iload           5
	//*  17   37:sipush          130
	//*  18   40:icmpeq          53
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   19   43:new             #38  <Class IllegalArgumentException>
	//   20   46:dup             
	//   21   47:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   22   49:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   23   52:athrow          
					rect1.offset(0, -(rect.height() + 1));
	//   24   53:aload           10
	//   25   55:iconst_0        
	//   26   56:aload           4
	//   27   58:invokevirtual   #68  <Method int Rect.height()>
	//   28   61:iconst_1        
	//   29   62:iadd            
	//   30   63:ineg            
	//   31   64:invokevirtual   #72  <Method void Rect.offset(int, int)>
				} else
	//*  32   67:goto            116
				{
					rect1.offset(-(rect.width() + 1), 0);
	//   33   70:aload           10
	//   34   72:aload           4
	//   35   74:invokevirtual   #75  <Method int Rect.width()>
	//   36   77:iconst_1        
	//   37   78:iadd            
	//   38   79:ineg            
	//   39   80:iconst_0        
	//   40   81:invokevirtual   #72  <Method void Rect.offset(int, int)>
				}
			} else
	//*  41   84:goto            116
			{
				rect1.offset(0, rect.height() + 1);
	//   42   87:aload           10
	//   43   89:iconst_0        
	//   44   90:aload           4
	//   45   92:invokevirtual   #68  <Method int Rect.height()>
	//   46   95:iconst_1        
	//   47   96:iadd            
	//   48   97:invokevirtual   #72  <Method void Rect.offset(int, int)>
			}
		} else
	//*  49  100:goto            116
		{
			rect1.offset(rect.width() + 1, 0);
	//   50  103:aload           10
	//   51  105:aload           4
	//   52  107:invokevirtual   #75  <Method int Rect.width()>
	//   53  110:iconst_1        
	//   54  111:iadd            
	//   55  112:iconst_0        
	//   56  113:invokevirtual   #72  <Method void Rect.offset(int, int)>
		}
		Object obj2 = null;
	//   57  116:aconst_null     
	//   58  117:astore          8
		int k = collectionadapter.size(obj);
	//   59  119:aload_1         
	//   60  120:aload_0         
	//   61  121:invokeinterface #79  <Method int FocusStrategy$CollectionAdapter.size(Object)>
	//   62  126:istore          7
		Rect rect2 = new Rect();
	//   63  128:new             #45  <Class Rect>
	//   64  131:dup             
	//   65  132:invokespecial   #80  <Method void Rect()>
	//   66  135:astore          11
		for(; j < k; j++)
	//*  67  137:iload           6
	//*  68  139:iload           7
	//*  69  141:icmpge          208
		{
			Object obj3 = collectionadapter.get(obj, j);
	//   70  144:aload_1         
	//   71  145:aload_0         
	//   72  146:iload           6
	//   73  148:invokeinterface #84  <Method Object FocusStrategy$CollectionAdapter.get(Object, int)>
	//   74  153:astore          9
			if(obj3 == obj1)
	//*  75  155:aload           9
	//*  76  157:aload_3         
	//*  77  158:if_acmpne       164
				continue;
	//   78  161:goto            199
			boundsadapter.obtainBounds(obj3, rect2);
	//   79  164:aload_2         
	//   80  165:aload           9
	//   81  167:aload           11
	//   82  169:invokeinterface #88  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			if(isBetterCandidate(i, rect, rect2, rect1))
	//*  83  174:iload           5
	//*  84  176:aload           4
	//*  85  178:aload           11
	//*  86  180:aload           10
	//*  87  182:invokestatic    #91  <Method boolean isBetterCandidate(int, Rect, Rect, Rect)>
	//*  88  185:ifeq            199
			{
				rect1.set(rect2);
	//   89  188:aload           10
	//   90  190:aload           11
	//   91  192:invokevirtual   #94  <Method void Rect.set(Rect)>
				obj2 = obj3;
	//   92  195:aload           9
	//   93  197:astore          8
			}
		}

	//   94  199:iload           6
	//   95  201:iconst_1        
	//   96  202:iadd            
	//   97  203:istore          6
	//*  98  205:goto            137
		return obj2;
	//   99  208:aload           8
	//  100  210:areturn         
	}

	public static Object findNextFocusInRelativeDirection(Object obj, CollectionAdapter collectionadapter, BoundsAdapter boundsadapter, Object obj1, int i, boolean flag, boolean flag1)
	{
		int k = collectionadapter.size(obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #79  <Method int FocusStrategy$CollectionAdapter.size(Object)>
	//    3    7:istore          8
		ArrayList arraylist = new ArrayList(k);
	//    4    9:new             #100 <Class ArrayList>
	//    5   12:dup             
	//    6   13:iload           8
	//    7   15:invokespecial   #103 <Method void ArrayList(int)>
	//    8   18:astore          9
		for(int j = 0; j < k; j++)
	//*   9   20:iconst_0        
	//*  10   21:istore          7
	//*  11   23:iload           7
	//*  12   25:iload           8
	//*  13   27:icmpge          54
			arraylist.add(collectionadapter.get(obj, j));
	//   14   30:aload           9
	//   15   32:aload_1         
	//   16   33:aload_0         
	//   17   34:iload           7
	//   18   36:invokeinterface #84  <Method Object FocusStrategy$CollectionAdapter.get(Object, int)>
	//   19   41:invokevirtual   #107 <Method boolean ArrayList.add(Object)>
	//   20   44:pop             

	//   21   45:iload           7
	//   22   47:iconst_1        
	//   23   48:iadd            
	//   24   49:istore          7
	//*  25   51:goto            23
		Collections.sort(((java.util.List) (arraylist)), ((Comparator) (new SequentialComparator(flag, boundsadapter))));
	//   26   54:aload           9
	//   27   56:new             #12  <Class FocusStrategy$SequentialComparator>
	//   28   59:dup             
	//   29   60:iload           5
	//   30   62:aload_2         
	//   31   63:invokespecial   #110 <Method void FocusStrategy$SequentialComparator(boolean, FocusStrategy$BoundsAdapter)>
	//   32   66:invokestatic    #116 <Method void Collections.sort(java.util.List, Comparator)>
		switch(i)
	//*  33   69:iload           4
		{
	//*  34   71:tableswitch     1 2: default 92
	//	               1 111
	//	               2 102
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
	//   35   92:new             #38  <Class IllegalArgumentException>
	//   36   95:dup             
	//   37   96:ldc1            #118 <String "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.">
	//   38   98:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   39  101:athrow          

		case 2: // '\002'
			return getNextFocusable(obj1, arraylist, flag1);
	//   40  102:aload_3         
	//   41  103:aload           9
	//   42  105:iload           6
	//   43  107:invokestatic    #122 <Method Object getNextFocusable(Object, ArrayList, boolean)>
	//   44  110:areturn         

		case 1: // '\001'
			return getPreviousFocusable(obj1, arraylist, flag1);
	//   45  111:aload_3         
	//   46  112:aload           9
	//   47  114:iload           6
	//   48  116:invokestatic    #125 <Method Object getPreviousFocusable(Object, ArrayList, boolean)>
	//   49  119:areturn         
		}
	}

	private static Object getNextFocusable(Object obj, ArrayList arraylist, boolean flag)
	{
		int j = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #128 <Method int ArrayList.size()>
	//    2    4:istore          4
		int i;
		if(obj == null)
	//*   3    6:aload_0         
	//*   4    7:ifnonnull       15
			i = -1;
	//    5   10:iconst_m1       
	//    6   11:istore_3        
		else
	//*   7   12:goto            21
			i = arraylist.lastIndexOf(obj);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #131 <Method int ArrayList.lastIndexOf(Object)>
	//   11   20:istore_3        
		i++;
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_3        
		if(i < j)
	//*  16   25:iload_3         
	//*  17   26:iload           4
	//*  18   28:icmpge          37
			return arraylist.get(i);
	//   19   31:aload_1         
	//   20   32:iload_3         
	//   21   33:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   22   36:areturn         
		if(flag && j > 0)
	//*  23   37:iload_2         
	//*  24   38:ifeq            52
	//*  25   41:iload           4
	//*  26   43:ifle            52
			return arraylist.get(0);
	//   27   46:aload_1         
	//   28   47:iconst_0        
	//   29   48:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   30   51:areturn         
		else
			return ((Object) (null));
	//   31   52:aconst_null     
	//   32   53:areturn         
	}

	private static Object getPreviousFocusable(Object obj, ArrayList arraylist, boolean flag)
	{
		int j = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #128 <Method int ArrayList.size()>
	//    2    4:istore          4
		int i;
		if(obj == null)
	//*   3    6:aload_0         
	//*   4    7:ifnonnull       16
			i = j;
	//    5   10:iload           4
	//    6   12:istore_3        
		else
	//*   7   13:goto            22
			i = arraylist.indexOf(obj);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #138 <Method int ArrayList.indexOf(Object)>
	//   11   21:istore_3        
		i--;
	//   12   22:iload_3         
	//   13   23:iconst_1        
	//   14   24:isub            
	//   15   25:istore_3        
		if(i >= 0)
	//*  16   26:iload_3         
	//*  17   27:iflt            36
			return arraylist.get(i);
	//   18   30:aload_1         
	//   19   31:iload_3         
	//   20   32:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   21   35:areturn         
		if(flag && j > 0)
	//*  22   36:iload_2         
	//*  23   37:ifeq            54
	//*  24   40:iload           4
	//*  25   42:ifle            54
			return arraylist.get(j - 1);
	//   26   45:aload_1         
	//   27   46:iload           4
	//   28   48:iconst_1        
	//   29   49:isub            
	//   30   50:invokevirtual   #134 <Method Object ArrayList.get(int)>
	//   31   53:areturn         
		else
			return ((Object) (null));
	//   32   54:aconst_null     
	//   33   55:areturn         
	}

	private static int getWeightedDistanceFor(int i, int j)
	{
		return 13 * i * i + j * j;
	//    0    0:bipush          13
	//    1    2:iload_0         
	//    2    3:imul            
	//    3    4:iload_0         
	//    4    5:imul            
	//    5    6:iload_1         
	//    6    7:iload_1         
	//    7    8:imul            
	//    8    9:iadd            
	//    9   10:ireturn         
	}

	private static boolean isBetterCandidate(int i, Rect rect, Rect rect1, Rect rect2)
	{
		boolean flag1 = isCandidate(rect, rect1, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_0         
	//    3    3:invokestatic    #144 <Method boolean isCandidate(Rect, Rect, int)>
	//    4    6:istore          5
		boolean flag = false;
	//    5    8:iconst_0        
	//    6    9:istore          4
		if(!flag1)
	//*   7   11:iload           5
	//*   8   13:ifne            18
			return false;
	//    9   16:iconst_0        
	//   10   17:ireturn         
		if(!isCandidate(rect, rect2, i))
	//*  11   18:aload_1         
	//*  12   19:aload_3         
	//*  13   20:iload_0         
	//*  14   21:invokestatic    #144 <Method boolean isCandidate(Rect, Rect, int)>
	//*  15   24:ifne            29
			return true;
	//   16   27:iconst_1        
	//   17   28:ireturn         
		if(beamBeats(i, rect, rect1, rect2))
	//*  18   29:iload_0         
	//*  19   30:aload_1         
	//*  20   31:aload_2         
	//*  21   32:aload_3         
	//*  22   33:invokestatic    #146 <Method boolean beamBeats(int, Rect, Rect, Rect)>
	//*  23   36:ifeq            41
			return true;
	//   24   39:iconst_1        
	//   25   40:ireturn         
		if(beamBeats(i, rect, rect2, rect1))
	//*  26   41:iload_0         
	//*  27   42:aload_1         
	//*  28   43:aload_3         
	//*  29   44:aload_2         
	//*  30   45:invokestatic    #146 <Method boolean beamBeats(int, Rect, Rect, Rect)>
	//*  31   48:ifeq            53
			return false;
	//   32   51:iconst_0        
	//   33   52:ireturn         
		if(getWeightedDistanceFor(majorAxisDistance(i, rect, rect1), minorAxisDistance(i, rect, rect1)) < getWeightedDistanceFor(majorAxisDistance(i, rect, rect2), minorAxisDistance(i, rect, rect2)))
	//*  34   53:iload_0         
	//*  35   54:aload_1         
	//*  36   55:aload_2         
	//*  37   56:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//*  38   59:iload_0         
	//*  39   60:aload_1         
	//*  40   61:aload_2         
	//*  41   62:invokestatic    #149 <Method int minorAxisDistance(int, Rect, Rect)>
	//*  42   65:invokestatic    #151 <Method int getWeightedDistanceFor(int, int)>
	//*  43   68:iload_0         
	//*  44   69:aload_1         
	//*  45   70:aload_3         
	//*  46   71:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//*  47   74:iload_0         
	//*  48   75:aload_1         
	//*  49   76:aload_3         
	//*  50   77:invokestatic    #149 <Method int minorAxisDistance(int, Rect, Rect)>
	//*  51   80:invokestatic    #151 <Method int getWeightedDistanceFor(int, int)>
	//*  52   83:icmpge          89
			flag = true;
	//   53   86:iconst_1        
	//   54   87:istore          4
		return flag;
	//   55   89:iload           4
	//   56   91:ireturn         
	}

	private static boolean isCandidate(Rect rect, Rect rect1, int i)
	{
		boolean flag7;
label0:
		{
			boolean flag6;
label1:
			{
				boolean flag5;
label2:
				{
					boolean flag;
label3:
					{
						flag5 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
						flag6 = false;
	//    2    3:iconst_0        
	//    3    4:istore          6
						flag7 = false;
	//    4    6:iconst_0        
	//    5    7:istore          7
						boolean flag4 = false;
	//    6    9:iconst_0        
	//    7   10:istore          4
						if(i == 17)
							break label0;
	//    8   12:iload_2         
	//    9   13:bipush          17
	//   10   15:icmpeq          176
						if(i == 33)
							break label1;
	//   11   18:iload_2         
	//   12   19:bipush          33
	//   13   21:icmpeq          133
						if(i == 66)
							break label2;
	//   14   24:iload_2         
	//   15   25:bipush          66
	//   16   27:icmpeq          90
						if(i != 130)
	//*  17   30:iload_2         
	//*  18   31:sipush          130
	//*  19   34:icmpeq          47
							throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   20   37:new             #38  <Class IllegalArgumentException>
	//   21   40:dup             
	//   22   41:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   23   43:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
						if(rect.top >= rect1.top)
	//*  25   47:aload_0         
	//*  26   48:getfield        #58  <Field int Rect.top>
	//*  27   51:aload_1         
	//*  28   52:getfield        #58  <Field int Rect.top>
	//*  29   55:icmplt          72
						{
							flag = flag4;
	//   30   58:iload           4
	//   31   60:istore_3        
							if(rect.bottom > rect1.top)
								break label3;
	//   32   61:aload_0         
	//   33   62:getfield        #55  <Field int Rect.bottom>
	//   34   65:aload_1         
	//   35   66:getfield        #58  <Field int Rect.top>
	//   36   69:icmpgt          88
						}
						flag = flag4;
	//   37   72:iload           4
	//   38   74:istore_3        
						if(rect.bottom < rect1.bottom)
	//*  39   75:aload_0         
	//*  40   76:getfield        #55  <Field int Rect.bottom>
	//*  41   79:aload_1         
	//*  42   80:getfield        #55  <Field int Rect.bottom>
	//*  43   83:icmpge          88
							flag = true;
	//   44   86:iconst_1        
	//   45   87:istore_3        
					}
					return flag;
	//   46   88:iload_3         
	//   47   89:ireturn         
				}
				boolean flag1;
label4:
				{
					if(rect.left >= rect1.left)
	//*  48   90:aload_0         
	//*  49   91:getfield        #52  <Field int Rect.left>
	//*  50   94:aload_1         
	//*  51   95:getfield        #52  <Field int Rect.left>
	//*  52   98:icmplt          115
					{
						flag1 = flag5;
	//   53  101:iload           5
	//   54  103:istore_3        
						if(rect.right > rect1.left)
							break label4;
	//   55  104:aload_0         
	//   56  105:getfield        #49  <Field int Rect.right>
	//   57  108:aload_1         
	//   58  109:getfield        #52  <Field int Rect.left>
	//   59  112:icmpgt          131
					}
					flag1 = flag5;
	//   60  115:iload           5
	//   61  117:istore_3        
					if(rect.right < rect1.right)
	//*  62  118:aload_0         
	//*  63  119:getfield        #49  <Field int Rect.right>
	//*  64  122:aload_1         
	//*  65  123:getfield        #49  <Field int Rect.right>
	//*  66  126:icmpge          131
						flag1 = true;
	//   67  129:iconst_1        
	//   68  130:istore_3        
				}
				return flag1;
	//   69  131:iload_3         
	//   70  132:ireturn         
			}
			boolean flag2;
label5:
			{
				if(rect.bottom <= rect1.bottom)
	//*  71  133:aload_0         
	//*  72  134:getfield        #55  <Field int Rect.bottom>
	//*  73  137:aload_1         
	//*  74  138:getfield        #55  <Field int Rect.bottom>
	//*  75  141:icmpgt          158
				{
					flag2 = flag6;
	//   76  144:iload           6
	//   77  146:istore_3        
					if(rect.top < rect1.bottom)
						break label5;
	//   78  147:aload_0         
	//   79  148:getfield        #58  <Field int Rect.top>
	//   80  151:aload_1         
	//   81  152:getfield        #55  <Field int Rect.bottom>
	//   82  155:icmplt          174
				}
				flag2 = flag6;
	//   83  158:iload           6
	//   84  160:istore_3        
				if(rect.top > rect1.top)
	//*  85  161:aload_0         
	//*  86  162:getfield        #58  <Field int Rect.top>
	//*  87  165:aload_1         
	//*  88  166:getfield        #58  <Field int Rect.top>
	//*  89  169:icmple          174
					flag2 = true;
	//   90  172:iconst_1        
	//   91  173:istore_3        
			}
			return flag2;
	//   92  174:iload_3         
	//   93  175:ireturn         
		}
		boolean flag3;
label6:
		{
			if(rect.right <= rect1.right)
	//*  94  176:aload_0         
	//*  95  177:getfield        #49  <Field int Rect.right>
	//*  96  180:aload_1         
	//*  97  181:getfield        #49  <Field int Rect.right>
	//*  98  184:icmpgt          201
			{
				flag3 = flag7;
	//   99  187:iload           7
	//  100  189:istore_3        
				if(rect.left < rect1.right)
					break label6;
	//  101  190:aload_0         
	//  102  191:getfield        #52  <Field int Rect.left>
	//  103  194:aload_1         
	//  104  195:getfield        #49  <Field int Rect.right>
	//  105  198:icmplt          217
			}
			flag3 = flag7;
	//  106  201:iload           7
	//  107  203:istore_3        
			if(rect.left > rect1.left)
	//* 108  204:aload_0         
	//* 109  205:getfield        #52  <Field int Rect.left>
	//* 110  208:aload_1         
	//* 111  209:getfield        #52  <Field int Rect.left>
	//* 112  212:icmple          217
				flag3 = true;
	//  113  215:iconst_1        
	//  114  216:istore_3        
		}
		return flag3;
	//  115  217:iload_3         
	//  116  218:ireturn         
	}

	private static boolean isToDirectionOf(int i, Rect rect, Rect rect1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		boolean flag3 = false;
	//    4    6:iconst_0        
	//    5    7:istore          6
		boolean flag = false;
	//    6    9:iconst_0        
	//    7   10:istore_3        
		if(i != 17)
	//*   8   11:iload_0         
	//*   9   12:bipush          17
	//*  10   14:icmpeq          97
		{
			if(i != 33)
	//*  11   17:iload_0         
	//*  12   18:bipush          33
	//*  13   20:icmpeq          79
			{
				if(i != 66)
	//*  14   23:iload_0         
	//*  15   24:bipush          66
	//*  16   26:icmpeq          61
				{
					if(i != 130)
	//*  17   29:iload_0         
	//*  18   30:sipush          130
	//*  19   33:icmpeq          46
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   20   36:new             #38  <Class IllegalArgumentException>
	//   21   39:dup             
	//   22   40:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   23   42:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   24   45:athrow          
					if(rect.bottom <= rect1.top)
	//*  25   46:aload_1         
	//*  26   47:getfield        #55  <Field int Rect.bottom>
	//*  27   50:aload_2         
	//*  28   51:getfield        #58  <Field int Rect.top>
	//*  29   54:icmpgt          59
						flag = true;
	//   30   57:iconst_1        
	//   31   58:istore_3        
					return flag;
	//   32   59:iload_3         
	//   33   60:ireturn         
				}
				flag = flag1;
	//   34   61:iload           4
	//   35   63:istore_3        
				if(rect.right <= rect1.left)
	//*  36   64:aload_1         
	//*  37   65:getfield        #49  <Field int Rect.right>
	//*  38   68:aload_2         
	//*  39   69:getfield        #52  <Field int Rect.left>
	//*  40   72:icmpgt          77
					flag = true;
	//   41   75:iconst_1        
	//   42   76:istore_3        
				return flag;
	//   43   77:iload_3         
	//   44   78:ireturn         
			}
			flag = flag2;
	//   45   79:iload           5
	//   46   81:istore_3        
			if(rect.top >= rect1.bottom)
	//*  47   82:aload_1         
	//*  48   83:getfield        #58  <Field int Rect.top>
	//*  49   86:aload_2         
	//*  50   87:getfield        #55  <Field int Rect.bottom>
	//*  51   90:icmplt          95
				flag = true;
	//   52   93:iconst_1        
	//   53   94:istore_3        
			return flag;
	//   54   95:iload_3         
	//   55   96:ireturn         
		}
		flag = flag3;
	//   56   97:iload           6
	//   57   99:istore_3        
		if(rect.left >= rect1.right)
	//*  58  100:aload_1         
	//*  59  101:getfield        #52  <Field int Rect.left>
	//*  60  104:aload_2         
	//*  61  105:getfield        #49  <Field int Rect.right>
	//*  62  108:icmplt          113
			flag = true;
	//   63  111:iconst_1        
	//   64  112:istore_3        
		return flag;
	//   65  113:iload_3         
	//   66  114:ireturn         
	}

	private static int majorAxisDistance(int i, Rect rect, Rect rect1)
	{
		return Math.max(0, majorAxisDistanceRaw(i, rect, rect1));
	//    0    0:iconst_0        
	//    1    1:iload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokestatic    #154 <Method int majorAxisDistanceRaw(int, Rect, Rect)>
	//    5    7:invokestatic    #159 <Method int Math.max(int, int)>
	//    6   10:ireturn         
	}

	private static int majorAxisDistanceRaw(int i, Rect rect, Rect rect1)
	{
		if(i != 17)
	//*   0    0:iload_0         
	//*   1    1:bipush          17
	//*   2    3:icmpeq          65
		{
			if(i != 33)
	//*   3    6:iload_0         
	//*   4    7:bipush          33
	//*   5    9:icmpeq          55
			{
				if(i != 66)
	//*   6   12:iload_0         
	//*   7   13:bipush          66
	//*   8   15:icmpeq          45
				{
					if(i != 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpeq          35
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   12   25:new             #38  <Class IllegalArgumentException>
	//   13   28:dup             
	//   14   29:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   15   31:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
					else
						return rect1.top - rect.bottom;
	//   17   35:aload_2         
	//   18   36:getfield        #58  <Field int Rect.top>
	//   19   39:aload_1         
	//   20   40:getfield        #55  <Field int Rect.bottom>
	//   21   43:isub            
	//   22   44:ireturn         
				} else
				{
					return rect1.left - rect.right;
	//   23   45:aload_2         
	//   24   46:getfield        #52  <Field int Rect.left>
	//   25   49:aload_1         
	//   26   50:getfield        #49  <Field int Rect.right>
	//   27   53:isub            
	//   28   54:ireturn         
				}
			} else
			{
				return rect.top - rect1.bottom;
	//   29   55:aload_1         
	//   30   56:getfield        #58  <Field int Rect.top>
	//   31   59:aload_2         
	//   32   60:getfield        #55  <Field int Rect.bottom>
	//   33   63:isub            
	//   34   64:ireturn         
			}
		} else
		{
			return rect.left - rect1.right;
	//   35   65:aload_1         
	//   36   66:getfield        #52  <Field int Rect.left>
	//   37   69:aload_2         
	//   38   70:getfield        #49  <Field int Rect.right>
	//   39   73:isub            
	//   40   74:ireturn         
		}
	}

	private static int majorAxisDistanceToFarEdge(int i, Rect rect, Rect rect1)
	{
		return Math.max(1, majorAxisDistanceToFarEdgeRaw(i, rect, rect1));
	//    0    0:iconst_1        
	//    1    1:iload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokestatic    #162 <Method int majorAxisDistanceToFarEdgeRaw(int, Rect, Rect)>
	//    5    7:invokestatic    #159 <Method int Math.max(int, int)>
	//    6   10:ireturn         
	}

	private static int majorAxisDistanceToFarEdgeRaw(int i, Rect rect, Rect rect1)
	{
		if(i != 17)
	//*   0    0:iload_0         
	//*   1    1:bipush          17
	//*   2    3:icmpeq          65
		{
			if(i != 33)
	//*   3    6:iload_0         
	//*   4    7:bipush          33
	//*   5    9:icmpeq          55
			{
				if(i != 66)
	//*   6   12:iload_0         
	//*   7   13:bipush          66
	//*   8   15:icmpeq          45
				{
					if(i != 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpeq          35
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   12   25:new             #38  <Class IllegalArgumentException>
	//   13   28:dup             
	//   14   29:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   15   31:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
					else
						return rect1.bottom - rect.bottom;
	//   17   35:aload_2         
	//   18   36:getfield        #55  <Field int Rect.bottom>
	//   19   39:aload_1         
	//   20   40:getfield        #55  <Field int Rect.bottom>
	//   21   43:isub            
	//   22   44:ireturn         
				} else
				{
					return rect1.right - rect.right;
	//   23   45:aload_2         
	//   24   46:getfield        #49  <Field int Rect.right>
	//   25   49:aload_1         
	//   26   50:getfield        #49  <Field int Rect.right>
	//   27   53:isub            
	//   28   54:ireturn         
				}
			} else
			{
				return rect.top - rect1.top;
	//   29   55:aload_1         
	//   30   56:getfield        #58  <Field int Rect.top>
	//   31   59:aload_2         
	//   32   60:getfield        #58  <Field int Rect.top>
	//   33   63:isub            
	//   34   64:ireturn         
			}
		} else
		{
			return rect.left - rect1.left;
	//   35   65:aload_1         
	//   36   66:getfield        #52  <Field int Rect.left>
	//   37   69:aload_2         
	//   38   70:getfield        #52  <Field int Rect.left>
	//   39   73:isub            
	//   40   74:ireturn         
		}
	}

	private static int minorAxisDistance(int i, Rect rect, Rect rect1)
	{
label0:
		{
			if(i == 17)
				break label0;
	//    0    0:iload_0         
	//    1    1:bipush          17
	//    2    3:icmpeq          62
			if(i != 33)
	//*   3    6:iload_0         
	//*   4    7:bipush          33
	//*   5    9:icmpeq          35
			{
				if(i == 66)
					break label0;
	//    6   12:iload_0         
	//    7   13:bipush          66
	//    8   15:icmpeq          62
				if(i != 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpeq          35
					throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   12   25:new             #38  <Class IllegalArgumentException>
	//   13   28:dup             
	//   14   29:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   15   31:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
			}
			return Math.abs((rect.left + rect.width() / 2) - (rect1.left + rect1.width() / 2));
	//   17   35:aload_1         
	//   18   36:getfield        #52  <Field int Rect.left>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #75  <Method int Rect.width()>
	//   21   43:iconst_2        
	//   22   44:idiv            
	//   23   45:iadd            
	//   24   46:aload_2         
	//   25   47:getfield        #52  <Field int Rect.left>
	//   26   50:aload_2         
	//   27   51:invokevirtual   #75  <Method int Rect.width()>
	//   28   54:iconst_2        
	//   29   55:idiv            
	//   30   56:iadd            
	//   31   57:isub            
	//   32   58:invokestatic    #166 <Method int Math.abs(int)>
	//   33   61:ireturn         
		}
		return Math.abs((rect.top + rect.height() / 2) - (rect1.top + rect1.height() / 2));
	//   34   62:aload_1         
	//   35   63:getfield        #58  <Field int Rect.top>
	//   36   66:aload_1         
	//   37   67:invokevirtual   #68  <Method int Rect.height()>
	//   38   70:iconst_2        
	//   39   71:idiv            
	//   40   72:iadd            
	//   41   73:aload_2         
	//   42   74:getfield        #58  <Field int Rect.top>
	//   43   77:aload_2         
	//   44   78:invokevirtual   #68  <Method int Rect.height()>
	//   45   81:iconst_2        
	//   46   82:idiv            
	//   47   83:iadd            
	//   48   84:isub            
	//   49   85:invokestatic    #166 <Method int Math.abs(int)>
	//   50   88:ireturn         
	}
}
