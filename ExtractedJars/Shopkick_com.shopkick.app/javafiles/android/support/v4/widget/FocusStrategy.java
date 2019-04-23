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


	private FocusStrategy()
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
label0:
		{
			if(i == 17)
				break label0;
	//    0    0:iload_0         
	//    1    1:bipush          17
	//    2    3:icmpeq          64
			if(i != 33)
	//*   3    6:iload_0         
	//*   4    7:bipush          33
	//*   5    9:icmpeq          38
			{
				if(i == 66)
					break label0;
	//    6   12:iload_0         
	//    7   13:bipush          66
	//    8   15:icmpeq          64
				if(i != 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpne          28
	//*  12   25:goto            38
					throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   13   28:new             #38  <Class IllegalArgumentException>
	//   14   31:dup             
	//   15   32:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   16   34:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
			}
			return rect1.right >= rect.left && rect1.left <= rect.right;
	//   18   38:aload_2         
	//   19   39:getfield        #49  <Field int Rect.right>
	//   20   42:aload_1         
	//   21   43:getfield        #52  <Field int Rect.left>
	//   22   46:icmplt          62
	//   23   49:aload_2         
	//   24   50:getfield        #52  <Field int Rect.left>
	//   25   53:aload_1         
	//   26   54:getfield        #49  <Field int Rect.right>
	//   27   57:icmpgt          62
	//   28   60:iconst_1        
	//   29   61:ireturn         
	//   30   62:iconst_0        
	//   31   63:ireturn         
		}
		return rect1.bottom >= rect.top && rect1.top <= rect.bottom;
	//   32   64:aload_2         
	//   33   65:getfield        #55  <Field int Rect.bottom>
	//   34   68:aload_1         
	//   35   69:getfield        #58  <Field int Rect.top>
	//   36   72:icmplt          88
	//   37   75:aload_2         
	//   38   76:getfield        #58  <Field int Rect.top>
	//   39   79:aload_1         
	//   40   80:getfield        #55  <Field int Rect.bottom>
	//   41   83:icmpgt          88
	//   42   86:iconst_1        
	//   43   87:ireturn         
	//   44   88:iconst_0        
	//   45   89:ireturn         
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
					if(i == 130)
	//*  16   35:iload           5
	//*  17   37:sipush          130
	//*  18   40:icmpne          60
						rect1.offset(0, -(rect.height() + 1));
	//   19   43:aload           10
	//   20   45:iconst_0        
	//   21   46:aload           4
	//   22   48:invokevirtual   #68  <Method int Rect.height()>
	//   23   51:iconst_1        
	//   24   52:iadd            
	//   25   53:ineg            
	//   26   54:invokevirtual   #72  <Method void Rect.offset(int, int)>
					else
	//*  27   57:goto            116
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   28   60:new             #38  <Class IllegalArgumentException>
	//   29   63:dup             
	//   30   64:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   31   66:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   32   69:athrow          
				} else
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
		return i * 13 * i + j * j;
	//    0    0:iload_0         
	//    1    1:bipush          13
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
		if(i != 17)
	//*   0    0:iload_2         
	//*   1    1:bipush          17
	//*   2    3:icmpeq          146
		{
			if(i != 33)
	//*   3    6:iload_2         
	//*   4    7:bipush          33
	//*   5    9:icmpeq          109
			{
				if(i != 66)
	//*   6   12:iload_2         
	//*   7   13:bipush          66
	//*   8   15:icmpeq          72
					if(i == 130)
	//*   9   18:iload_2         
	//*  10   19:sipush          130
	//*  11   22:icmpne          62
						return (rect.top < rect1.top || rect.bottom <= rect1.top) && rect.bottom < rect1.bottom;
	//   12   25:aload_0         
	//   13   26:getfield        #58  <Field int Rect.top>
	//   14   29:aload_1         
	//   15   30:getfield        #58  <Field int Rect.top>
	//   16   33:icmplt          47
	//   17   36:aload_0         
	//   18   37:getfield        #55  <Field int Rect.bottom>
	//   19   40:aload_1         
	//   20   41:getfield        #58  <Field int Rect.top>
	//   21   44:icmpgt          60
	//   22   47:aload_0         
	//   23   48:getfield        #55  <Field int Rect.bottom>
	//   24   51:aload_1         
	//   25   52:getfield        #55  <Field int Rect.bottom>
	//   26   55:icmpge          60
	//   27   58:iconst_1        
	//   28   59:ireturn         
	//   29   60:iconst_0        
	//   30   61:ireturn         
					else
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   31   62:new             #38  <Class IllegalArgumentException>
	//   32   65:dup             
	//   33   66:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   34   68:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   35   71:athrow          
				return (rect.left < rect1.left || rect.right <= rect1.left) && rect.right < rect1.right;
	//   36   72:aload_0         
	//   37   73:getfield        #52  <Field int Rect.left>
	//   38   76:aload_1         
	//   39   77:getfield        #52  <Field int Rect.left>
	//   40   80:icmplt          94
	//   41   83:aload_0         
	//   42   84:getfield        #49  <Field int Rect.right>
	//   43   87:aload_1         
	//   44   88:getfield        #52  <Field int Rect.left>
	//   45   91:icmpgt          107
	//   46   94:aload_0         
	//   47   95:getfield        #49  <Field int Rect.right>
	//   48   98:aload_1         
	//   49   99:getfield        #49  <Field int Rect.right>
	//   50  102:icmpge          107
	//   51  105:iconst_1        
	//   52  106:ireturn         
	//   53  107:iconst_0        
	//   54  108:ireturn         
			}
			return (rect.bottom > rect1.bottom || rect.top >= rect1.bottom) && rect.top > rect1.top;
	//   55  109:aload_0         
	//   56  110:getfield        #55  <Field int Rect.bottom>
	//   57  113:aload_1         
	//   58  114:getfield        #55  <Field int Rect.bottom>
	//   59  117:icmpgt          131
	//   60  120:aload_0         
	//   61  121:getfield        #58  <Field int Rect.top>
	//   62  124:aload_1         
	//   63  125:getfield        #55  <Field int Rect.bottom>
	//   64  128:icmplt          144
	//   65  131:aload_0         
	//   66  132:getfield        #58  <Field int Rect.top>
	//   67  135:aload_1         
	//   68  136:getfield        #58  <Field int Rect.top>
	//   69  139:icmple          144
	//   70  142:iconst_1        
	//   71  143:ireturn         
	//   72  144:iconst_0        
	//   73  145:ireturn         
		}
		return (rect.right > rect1.right || rect.left >= rect1.right) && rect.left > rect1.left;
	//   74  146:aload_0         
	//   75  147:getfield        #49  <Field int Rect.right>
	//   76  150:aload_1         
	//   77  151:getfield        #49  <Field int Rect.right>
	//   78  154:icmpgt          168
	//   79  157:aload_0         
	//   80  158:getfield        #52  <Field int Rect.left>
	//   81  161:aload_1         
	//   82  162:getfield        #49  <Field int Rect.right>
	//   83  165:icmplt          181
	//   84  168:aload_0         
	//   85  169:getfield        #52  <Field int Rect.left>
	//   86  172:aload_1         
	//   87  173:getfield        #52  <Field int Rect.left>
	//   88  176:icmple          181
	//   89  179:iconst_1        
	//   90  180:ireturn         
	//   91  181:iconst_0        
	//   92  182:ireturn         
	}

	private static boolean isToDirectionOf(int i, Rect rect, Rect rect1)
	{
		if(i != 17)
	//*   0    0:iload_0         
	//*   1    1:bipush          17
	//*   2    3:icmpeq          80
		{
			if(i != 33)
	//*   3    6:iload_0         
	//*   4    7:bipush          33
	//*   5    9:icmpeq          65
			{
				if(i != 66)
	//*   6   12:iload_0         
	//*   7   13:bipush          66
	//*   8   15:icmpeq          50
					if(i == 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpne          40
						return rect.bottom <= rect1.top;
	//   12   25:aload_1         
	//   13   26:getfield        #55  <Field int Rect.bottom>
	//   14   29:aload_2         
	//   15   30:getfield        #58  <Field int Rect.top>
	//   16   33:icmpgt          38
	//   17   36:iconst_1        
	//   18   37:ireturn         
	//   19   38:iconst_0        
	//   20   39:ireturn         
					else
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   21   40:new             #38  <Class IllegalArgumentException>
	//   22   43:dup             
	//   23   44:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   24   46:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
				return rect.right <= rect1.left;
	//   26   50:aload_1         
	//   27   51:getfield        #49  <Field int Rect.right>
	//   28   54:aload_2         
	//   29   55:getfield        #52  <Field int Rect.left>
	//   30   58:icmpgt          63
	//   31   61:iconst_1        
	//   32   62:ireturn         
	//   33   63:iconst_0        
	//   34   64:ireturn         
			}
			return rect.top >= rect1.bottom;
	//   35   65:aload_1         
	//   36   66:getfield        #58  <Field int Rect.top>
	//   37   69:aload_2         
	//   38   70:getfield        #55  <Field int Rect.bottom>
	//   39   73:icmplt          78
	//   40   76:iconst_1        
	//   41   77:ireturn         
	//   42   78:iconst_0        
	//   43   79:ireturn         
		}
		return rect.left >= rect1.right;
	//   44   80:aload_1         
	//   45   81:getfield        #52  <Field int Rect.left>
	//   46   84:aload_2         
	//   47   85:getfield        #49  <Field int Rect.right>
	//   48   88:icmplt          93
	//   49   91:iconst_1        
	//   50   92:ireturn         
	//   51   93:iconst_0        
	//   52   94:ireturn         
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
					if(i == 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpne          35
						return rect1.top - rect.bottom;
	//   12   25:aload_2         
	//   13   26:getfield        #58  <Field int Rect.top>
	//   14   29:aload_1         
	//   15   30:getfield        #55  <Field int Rect.bottom>
	//   16   33:isub            
	//   17   34:ireturn         
					else
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   18   35:new             #38  <Class IllegalArgumentException>
	//   19   38:dup             
	//   20   39:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   21   41:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   22   44:athrow          
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
					if(i == 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpne          35
						return rect1.bottom - rect.bottom;
	//   12   25:aload_2         
	//   13   26:getfield        #55  <Field int Rect.bottom>
	//   14   29:aload_1         
	//   15   30:getfield        #55  <Field int Rect.bottom>
	//   16   33:isub            
	//   17   34:ireturn         
					else
						throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   18   35:new             #38  <Class IllegalArgumentException>
	//   19   38:dup             
	//   20   39:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   21   41:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   22   44:athrow          
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
	//    2    3:icmpeq          65
			if(i != 33)
	//*   3    6:iload_0         
	//*   4    7:bipush          33
	//*   5    9:icmpeq          38
			{
				if(i == 66)
					break label0;
	//    6   12:iload_0         
	//    7   13:bipush          66
	//    8   15:icmpeq          65
				if(i != 130)
	//*   9   18:iload_0         
	//*  10   19:sipush          130
	//*  11   22:icmpne          28
	//*  12   25:goto            38
					throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   13   28:new             #38  <Class IllegalArgumentException>
	//   14   31:dup             
	//   15   32:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   16   34:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
			}
			return Math.abs((rect.left + rect.width() / 2) - (rect1.left + rect1.width() / 2));
	//   18   38:aload_1         
	//   19   39:getfield        #52  <Field int Rect.left>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #75  <Method int Rect.width()>
	//   22   46:iconst_2        
	//   23   47:idiv            
	//   24   48:iadd            
	//   25   49:aload_2         
	//   26   50:getfield        #52  <Field int Rect.left>
	//   27   53:aload_2         
	//   28   54:invokevirtual   #75  <Method int Rect.width()>
	//   29   57:iconst_2        
	//   30   58:idiv            
	//   31   59:iadd            
	//   32   60:isub            
	//   33   61:invokestatic    #166 <Method int Math.abs(int)>
	//   34   64:ireturn         
		}
		return Math.abs((rect.top + rect.height() / 2) - (rect1.top + rect1.height() / 2));
	//   35   65:aload_1         
	//   36   66:getfield        #58  <Field int Rect.top>
	//   37   69:aload_1         
	//   38   70:invokevirtual   #68  <Method int Rect.height()>
	//   39   73:iconst_2        
	//   40   74:idiv            
	//   41   75:iadd            
	//   42   76:aload_2         
	//   43   77:getfield        #58  <Field int Rect.top>
	//   44   80:aload_2         
	//   45   81:invokevirtual   #68  <Method int Rect.height()>
	//   46   84:iconst_2        
	//   47   85:idiv            
	//   48   86:iadd            
	//   49   87:isub            
	//   50   88:invokestatic    #166 <Method int Math.abs(int)>
	//   51   91:ireturn         
	}
}
