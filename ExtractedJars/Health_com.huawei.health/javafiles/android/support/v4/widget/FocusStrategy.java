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

	static class SequentialComparator
		implements Comparator
	{

		public int compare(Object obj, Object obj1)
		{
			Rect rect = mTemp1;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Rect mTemp1>
		//    2    4:astore_3        
			Rect rect1 = mTemp2;
		//    3    5:aload_0         
		//    4    6:getfield        #30  <Field Rect mTemp2>
		//    5    9:astore          4
			mAdapter.obtainBounds(obj, rect);
		//    6   11:aload_0         
		//    7   12:getfield        #34  <Field FocusStrategy$BoundsAdapter mAdapter>
		//    8   15:aload_1         
		//    9   16:aload_3         
		//   10   17:invokeinterface #45  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			mAdapter.obtainBounds(obj1, rect1);
		//   11   22:aload_0         
		//   12   23:getfield        #34  <Field FocusStrategy$BoundsAdapter mAdapter>
		//   13   26:aload_2         
		//   14   27:aload           4
		//   15   29:invokeinterface #45  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			if(rect.top < rect1.top)
		//*  16   34:aload_3         
		//*  17   35:getfield        #49  <Field int Rect.top>
		//*  18   38:aload           4
		//*  19   40:getfield        #49  <Field int Rect.top>
		//*  20   43:icmpge          48
				return -1;
		//   21   46:iconst_m1       
		//   22   47:ireturn         
			if(rect.top > rect1.top)
		//*  23   48:aload_3         
		//*  24   49:getfield        #49  <Field int Rect.top>
		//*  25   52:aload           4
		//*  26   54:getfield        #49  <Field int Rect.top>
		//*  27   57:icmple          62
				return 1;
		//   28   60:iconst_1        
		//   29   61:ireturn         
			if(rect.left < rect1.left)
		//*  30   62:aload_3         
		//*  31   63:getfield        #52  <Field int Rect.left>
		//*  32   66:aload           4
		//*  33   68:getfield        #52  <Field int Rect.left>
		//*  34   71:icmpge          85
				return !mIsLayoutRtl ? -1 : 1;
		//   35   74:aload_0         
		//   36   75:getfield        #32  <Field boolean mIsLayoutRtl>
		//   37   78:ifeq            83
		//   38   81:iconst_1        
		//   39   82:ireturn         
		//   40   83:iconst_m1       
		//   41   84:ireturn         
			if(rect.left > rect1.left)
		//*  42   85:aload_3         
		//*  43   86:getfield        #52  <Field int Rect.left>
		//*  44   89:aload           4
		//*  45   91:getfield        #52  <Field int Rect.left>
		//*  46   94:icmple          108
				return !mIsLayoutRtl ? 1 : -1;
		//   47   97:aload_0         
		//   48   98:getfield        #32  <Field boolean mIsLayoutRtl>
		//   49  101:ifeq            106
		//   50  104:iconst_m1       
		//   51  105:ireturn         
		//   52  106:iconst_1        
		//   53  107:ireturn         
			if(rect.bottom < rect1.bottom)
		//*  54  108:aload_3         
		//*  55  109:getfield        #55  <Field int Rect.bottom>
		//*  56  112:aload           4
		//*  57  114:getfield        #55  <Field int Rect.bottom>
		//*  58  117:icmpge          122
				return -1;
		//   59  120:iconst_m1       
		//   60  121:ireturn         
			if(rect.bottom > rect1.bottom)
		//*  61  122:aload_3         
		//*  62  123:getfield        #55  <Field int Rect.bottom>
		//*  63  126:aload           4
		//*  64  128:getfield        #55  <Field int Rect.bottom>
		//*  65  131:icmple          136
				return 1;
		//   66  134:iconst_1        
		//   67  135:ireturn         
			if(rect.right < rect1.right)
		//*  68  136:aload_3         
		//*  69  137:getfield        #58  <Field int Rect.right>
		//*  70  140:aload           4
		//*  71  142:getfield        #58  <Field int Rect.right>
		//*  72  145:icmpge          159
				return !mIsLayoutRtl ? -1 : 1;
		//   73  148:aload_0         
		//   74  149:getfield        #32  <Field boolean mIsLayoutRtl>
		//   75  152:ifeq            157
		//   76  155:iconst_1        
		//   77  156:ireturn         
		//   78  157:iconst_m1       
		//   79  158:ireturn         
			if(rect.right > rect1.right)
		//*  80  159:aload_3         
		//*  81  160:getfield        #58  <Field int Rect.right>
		//*  82  163:aload           4
		//*  83  165:getfield        #58  <Field int Rect.right>
		//*  84  168:icmple          182
				return !mIsLayoutRtl ? 1 : -1;
		//   85  171:aload_0         
		//   86  172:getfield        #32  <Field boolean mIsLayoutRtl>
		//   87  175:ifeq            180
		//   88  178:iconst_m1       
		//   89  179:ireturn         
		//   90  180:iconst_1        
		//   91  181:ireturn         
			else
				return 0;
		//   92  182:iconst_0        
		//   93  183:ireturn         
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
		if(beamsOverlap(i, rect, rect2) || !flag)
	//*   5    8:iload_0         
	//*   6    9:aload_1         
	//*   7   10:aload_3         
	//*   8   11:invokestatic    #25  <Method boolean beamsOverlap(int, Rect, Rect)>
	//*   9   14:ifne            22
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
		if(i == 17 || i == 66)
	//*  21   35:iload_0         
	//*  22   36:bipush          17
	//*  23   38:icmpeq          47
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
	}

	private static boolean beamsOverlap(int i, Rect rect, Rect rect1)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 47
	//	               33: 73
	//	               66: 47
	//	               130: 73
	//*   2   44:goto            99
		case 17: // '\021'
		case 66: // 'B'
			return rect1.bottom >= rect.top && rect1.top <= rect.bottom;
	//    3   47:aload_2         
	//    4   48:getfield        #42  <Field int Rect.bottom>
	//    5   51:aload_1         
	//    6   52:getfield        #45  <Field int Rect.top>
	//    7   55:icmplt          71
	//    8   58:aload_2         
	//    9   59:getfield        #45  <Field int Rect.top>
	//   10   62:aload_1         
	//   11   63:getfield        #42  <Field int Rect.bottom>
	//   12   66:icmpgt          71
	//   13   69:iconst_1        
	//   14   70:ireturn         
	//   15   71:iconst_0        
	//   16   72:ireturn         

		case 33: // '!'
		case 130: 
			return rect1.right >= rect.left && rect1.left <= rect.right;
	//   17   73:aload_2         
	//   18   74:getfield        #48  <Field int Rect.right>
	//   19   77:aload_1         
	//   20   78:getfield        #51  <Field int Rect.left>
	//   21   81:icmplt          97
	//   22   84:aload_2         
	//   23   85:getfield        #51  <Field int Rect.left>
	//   24   88:aload_1         
	//   25   89:getfield        #48  <Field int Rect.right>
	//   26   92:icmpgt          97
	//   27   95:iconst_1        
	//   28   96:ireturn         
	//   29   97:iconst_0        
	//   30   98:ireturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   31   99:new             #53  <Class IllegalArgumentException>
	//   32  102:dup             
	//   33  103:ldc1            #55  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   34  105:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   35  108:athrow          
	}

	public static Object findNextFocusInAbsoluteDirection(Object obj, CollectionAdapter collectionadapter, BoundsAdapter boundsadapter, Object obj1, Rect rect, int i)
	{
		Rect rect1 = new Rect(rect);
	//    0    0:new             #38  <Class Rect>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:invokespecial   #64  <Method void Rect(Rect)>
	//    4    9:astore          10
		switch(i)
	//*   5   11:iload           5
		{
	//*   6   13:lookupswitch    4: default 56
	//	               17: 59
	//	               33: 92
	//	               66: 75
	//	               130: 108
	//*   7   56:goto            125
		case 17: // '\021'
			rect1.offset(rect.width() + 1, 0);
	//    8   59:aload           10
	//    9   61:aload           4
	//   10   63:invokevirtual   #68  <Method int Rect.width()>
	//   11   66:iconst_1        
	//   12   67:iadd            
	//   13   68:iconst_0        
	//   14   69:invokevirtual   #72  <Method void Rect.offset(int, int)>
			break;

	//*  15   72:goto            135
		case 66: // 'B'
			rect1.offset(-(rect.width() + 1), 0);
	//   16   75:aload           10
	//   17   77:aload           4
	//   18   79:invokevirtual   #68  <Method int Rect.width()>
	//   19   82:iconst_1        
	//   20   83:iadd            
	//   21   84:ineg            
	//   22   85:iconst_0        
	//   23   86:invokevirtual   #72  <Method void Rect.offset(int, int)>
			break;

	//*  24   89:goto            135
		case 33: // '!'
			rect1.offset(0, rect.height() + 1);
	//   25   92:aload           10
	//   26   94:iconst_0        
	//   27   95:aload           4
	//   28   97:invokevirtual   #75  <Method int Rect.height()>
	//   29  100:iconst_1        
	//   30  101:iadd            
	//   31  102:invokevirtual   #72  <Method void Rect.offset(int, int)>
			break;

	//*  32  105:goto            135
		case 130: 
			rect1.offset(0, -(rect.height() + 1));
	//   33  108:aload           10
	//   34  110:iconst_0        
	//   35  111:aload           4
	//   36  113:invokevirtual   #75  <Method int Rect.height()>
	//   37  116:iconst_1        
	//   38  117:iadd            
	//   39  118:ineg            
	//   40  119:invokevirtual   #72  <Method void Rect.offset(int, int)>
			break;

	//*  41  122:goto            135
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   42  125:new             #53  <Class IllegalArgumentException>
	//   43  128:dup             
	//   44  129:ldc1            #55  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   45  131:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   46  134:athrow          
		}
		Object obj2 = null;
	//   47  135:aconst_null     
	//   48  136:astore          8
		int k = collectionadapter.size(obj);
	//   49  138:aload_1         
	//   50  139:aload_0         
	//   51  140:invokeinterface #79  <Method int FocusStrategy$CollectionAdapter.size(Object)>
	//   52  145:istore          7
		Rect rect2 = new Rect();
	//   53  147:new             #38  <Class Rect>
	//   54  150:dup             
	//   55  151:invokespecial   #80  <Method void Rect()>
	//   56  154:astore          11
		for(int j = 0; j < k; j++)
	//*  57  156:iconst_0        
	//*  58  157:istore          6
	//*  59  159:iload           6
	//*  60  161:iload           7
	//*  61  163:icmpge          230
		{
			Object obj3 = collectionadapter.get(obj, j);
	//   62  166:aload_1         
	//   63  167:aload_0         
	//   64  168:iload           6
	//   65  170:invokeinterface #84  <Method Object FocusStrategy$CollectionAdapter.get(Object, int)>
	//   66  175:astore          9
			if(obj3 == obj1)
	//*  67  177:aload           9
	//*  68  179:aload_3         
	//*  69  180:if_acmpne       186
				continue;
	//   70  183:goto            221
			boundsadapter.obtainBounds(obj3, rect2);
	//   71  186:aload_2         
	//   72  187:aload           9
	//   73  189:aload           11
	//   74  191:invokeinterface #88  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			if(isBetterCandidate(i, rect, rect2, rect1))
	//*  75  196:iload           5
	//*  76  198:aload           4
	//*  77  200:aload           11
	//*  78  202:aload           10
	//*  79  204:invokestatic    #91  <Method boolean isBetterCandidate(int, Rect, Rect, Rect)>
	//*  80  207:ifeq            221
			{
				rect1.set(rect2);
	//   81  210:aload           10
	//   82  212:aload           11
	//   83  214:invokevirtual   #94  <Method void Rect.set(Rect)>
				obj2 = obj3;
	//   84  217:aload           9
	//   85  219:astore          8
			}
		}

	//   86  221:iload           6
	//   87  223:iconst_1        
	//   88  224:iadd            
	//   89  225:istore          6
	//*  90  227:goto            159
		return obj2;
	//   91  230:aload           8
	//   92  232:areturn         
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
	//*  34   71:lookupswitch    2: default 96
	//	               1: 108
	//	               2: 99
	//*  35   96:goto            117
		case 2: // '\002'
			return getNextFocusable(obj1, arraylist, flag1);
	//   36   99:aload_3         
	//   37  100:aload           9
	//   38  102:iload           6
	//   39  104:invokestatic    #120 <Method Object getNextFocusable(Object, ArrayList, boolean)>
	//   40  107:areturn         

		case 1: // '\001'
			return getPreviousFocusable(obj1, arraylist, flag1);
	//   41  108:aload_3         
	//   42  109:aload           9
	//   43  111:iload           6
	//   44  113:invokestatic    #123 <Method Object getPreviousFocusable(Object, ArrayList, boolean)>
	//   45  116:areturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
	//   46  117:new             #53  <Class IllegalArgumentException>
	//   47  120:dup             
	//   48  121:ldc1            #125 <String "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.">
	//   49  123:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   50  126:athrow          
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
		if(!isCandidate(rect, rect1, i))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:iload_0         
	//*   3    3:invokestatic    #144 <Method boolean isCandidate(Rect, Rect, int)>
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		if(!isCandidate(rect, rect2, i))
	//*   7   11:aload_1         
	//*   8   12:aload_3         
	//*   9   13:iload_0         
	//*  10   14:invokestatic    #144 <Method boolean isCandidate(Rect, Rect, int)>
	//*  11   17:ifne            22
			return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         
		if(beamBeats(i, rect, rect1, rect2))
	//*  14   22:iload_0         
	//*  15   23:aload_1         
	//*  16   24:aload_2         
	//*  17   25:aload_3         
	//*  18   26:invokestatic    #146 <Method boolean beamBeats(int, Rect, Rect, Rect)>
	//*  19   29:ifeq            34
			return true;
	//   20   32:iconst_1        
	//   21   33:ireturn         
		if(beamBeats(i, rect, rect2, rect1))
	//*  22   34:iload_0         
	//*  23   35:aload_1         
	//*  24   36:aload_3         
	//*  25   37:aload_2         
	//*  26   38:invokestatic    #146 <Method boolean beamBeats(int, Rect, Rect, Rect)>
	//*  27   41:ifeq            46
			return false;
	//   28   44:iconst_0        
	//   29   45:ireturn         
		return getWeightedDistanceFor(majorAxisDistance(i, rect, rect1), minorAxisDistance(i, rect, rect1)) < getWeightedDistanceFor(majorAxisDistance(i, rect, rect2), minorAxisDistance(i, rect, rect2));
	//   30   46:iload_0         
	//   31   47:aload_1         
	//   32   48:aload_2         
	//   33   49:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//   34   52:iload_0         
	//   35   53:aload_1         
	//   36   54:aload_2         
	//   37   55:invokestatic    #149 <Method int minorAxisDistance(int, Rect, Rect)>
	//   38   58:invokestatic    #151 <Method int getWeightedDistanceFor(int, int)>
	//   39   61:iload_0         
	//   40   62:aload_1         
	//   41   63:aload_3         
	//   42   64:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//   43   67:iload_0         
	//   44   68:aload_1         
	//   45   69:aload_3         
	//   46   70:invokestatic    #149 <Method int minorAxisDistance(int, Rect, Rect)>
	//   47   73:invokestatic    #151 <Method int getWeightedDistanceFor(int, int)>
	//   48   76:icmpge          81
	//   49   79:iconst_1        
	//   50   80:ireturn         
	//   51   81:iconst_0        
	//   52   82:ireturn         
	}

	private static boolean isCandidate(Rect rect, Rect rect1, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 47
	//	               33: 121
	//	               66: 84
	//	               130: 158
	//*   2   44:goto            195
		case 17: // '\021'
			return (rect.right > rect1.right || rect.left >= rect1.right) && rect.left > rect1.left;
	//    3   47:aload_0         
	//    4   48:getfield        #48  <Field int Rect.right>
	//    5   51:aload_1         
	//    6   52:getfield        #48  <Field int Rect.right>
	//    7   55:icmpgt          69
	//    8   58:aload_0         
	//    9   59:getfield        #51  <Field int Rect.left>
	//   10   62:aload_1         
	//   11   63:getfield        #48  <Field int Rect.right>
	//   12   66:icmplt          82
	//   13   69:aload_0         
	//   14   70:getfield        #51  <Field int Rect.left>
	//   15   73:aload_1         
	//   16   74:getfield        #51  <Field int Rect.left>
	//   17   77:icmple          82
	//   18   80:iconst_1        
	//   19   81:ireturn         
	//   20   82:iconst_0        
	//   21   83:ireturn         

		case 66: // 'B'
			return (rect.left < rect1.left || rect.right <= rect1.left) && rect.right < rect1.right;
	//   22   84:aload_0         
	//   23   85:getfield        #51  <Field int Rect.left>
	//   24   88:aload_1         
	//   25   89:getfield        #51  <Field int Rect.left>
	//   26   92:icmplt          106
	//   27   95:aload_0         
	//   28   96:getfield        #48  <Field int Rect.right>
	//   29   99:aload_1         
	//   30  100:getfield        #51  <Field int Rect.left>
	//   31  103:icmpgt          119
	//   32  106:aload_0         
	//   33  107:getfield        #48  <Field int Rect.right>
	//   34  110:aload_1         
	//   35  111:getfield        #48  <Field int Rect.right>
	//   36  114:icmpge          119
	//   37  117:iconst_1        
	//   38  118:ireturn         
	//   39  119:iconst_0        
	//   40  120:ireturn         

		case 33: // '!'
			return (rect.bottom > rect1.bottom || rect.top >= rect1.bottom) && rect.top > rect1.top;
	//   41  121:aload_0         
	//   42  122:getfield        #42  <Field int Rect.bottom>
	//   43  125:aload_1         
	//   44  126:getfield        #42  <Field int Rect.bottom>
	//   45  129:icmpgt          143
	//   46  132:aload_0         
	//   47  133:getfield        #45  <Field int Rect.top>
	//   48  136:aload_1         
	//   49  137:getfield        #42  <Field int Rect.bottom>
	//   50  140:icmplt          156
	//   51  143:aload_0         
	//   52  144:getfield        #45  <Field int Rect.top>
	//   53  147:aload_1         
	//   54  148:getfield        #45  <Field int Rect.top>
	//   55  151:icmple          156
	//   56  154:iconst_1        
	//   57  155:ireturn         
	//   58  156:iconst_0        
	//   59  157:ireturn         

		case 130: 
			return (rect.top < rect1.top || rect.bottom <= rect1.top) && rect.bottom < rect1.bottom;
	//   60  158:aload_0         
	//   61  159:getfield        #45  <Field int Rect.top>
	//   62  162:aload_1         
	//   63  163:getfield        #45  <Field int Rect.top>
	//   64  166:icmplt          180
	//   65  169:aload_0         
	//   66  170:getfield        #42  <Field int Rect.bottom>
	//   67  173:aload_1         
	//   68  174:getfield        #45  <Field int Rect.top>
	//   69  177:icmpgt          193
	//   70  180:aload_0         
	//   71  181:getfield        #42  <Field int Rect.bottom>
	//   72  184:aload_1         
	//   73  185:getfield        #42  <Field int Rect.bottom>
	//   74  188:icmpge          193
	//   75  191:iconst_1        
	//   76  192:ireturn         
	//   77  193:iconst_0        
	//   78  194:ireturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   79  195:new             #53  <Class IllegalArgumentException>
	//   80  198:dup             
	//   81  199:ldc1            #55  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   82  201:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   83  204:athrow          
	}

	private static boolean isToDirectionOf(int i, Rect rect, Rect rect1)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 47
	//	               33: 77
	//	               66: 62
	//	               130: 92
	//*   2   44:goto            107
		case 17: // '\021'
			return rect.left >= rect1.right;
	//    3   47:aload_1         
	//    4   48:getfield        #51  <Field int Rect.left>
	//    5   51:aload_2         
	//    6   52:getfield        #48  <Field int Rect.right>
	//    7   55:icmplt          60
	//    8   58:iconst_1        
	//    9   59:ireturn         
	//   10   60:iconst_0        
	//   11   61:ireturn         

		case 66: // 'B'
			return rect.right <= rect1.left;
	//   12   62:aload_1         
	//   13   63:getfield        #48  <Field int Rect.right>
	//   14   66:aload_2         
	//   15   67:getfield        #51  <Field int Rect.left>
	//   16   70:icmpgt          75
	//   17   73:iconst_1        
	//   18   74:ireturn         
	//   19   75:iconst_0        
	//   20   76:ireturn         

		case 33: // '!'
			return rect.top >= rect1.bottom;
	//   21   77:aload_1         
	//   22   78:getfield        #45  <Field int Rect.top>
	//   23   81:aload_2         
	//   24   82:getfield        #42  <Field int Rect.bottom>
	//   25   85:icmplt          90
	//   26   88:iconst_1        
	//   27   89:ireturn         
	//   28   90:iconst_0        
	//   29   91:ireturn         

		case 130: 
			return rect.bottom <= rect1.top;
	//   30   92:aload_1         
	//   31   93:getfield        #42  <Field int Rect.bottom>
	//   32   96:aload_2         
	//   33   97:getfield        #45  <Field int Rect.top>
	//   34  100:icmpgt          105
	//   35  103:iconst_1        
	//   36  104:ireturn         
	//   37  105:iconst_0        
	//   38  106:ireturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   39  107:new             #53  <Class IllegalArgumentException>
	//   40  110:dup             
	//   41  111:ldc1            #55  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   42  113:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   43  116:athrow          
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
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 47
	//	               33: 67
	//	               66: 57
	//	               130: 77
	//*   2   44:goto            87
		case 17: // '\021'
			return rect.left - rect1.right;
	//    3   47:aload_1         
	//    4   48:getfield        #51  <Field int Rect.left>
	//    5   51:aload_2         
	//    6   52:getfield        #48  <Field int Rect.right>
	//    7   55:isub            
	//    8   56:ireturn         

		case 66: // 'B'
			return rect1.left - rect.right;
	//    9   57:aload_2         
	//   10   58:getfield        #51  <Field int Rect.left>
	//   11   61:aload_1         
	//   12   62:getfield        #48  <Field int Rect.right>
	//   13   65:isub            
	//   14   66:ireturn         

		case 33: // '!'
			return rect.top - rect1.bottom;
	//   15   67:aload_1         
	//   16   68:getfield        #45  <Field int Rect.top>
	//   17   71:aload_2         
	//   18   72:getfield        #42  <Field int Rect.bottom>
	//   19   75:isub            
	//   20   76:ireturn         

		case 130: 
			return rect1.top - rect.bottom;
	//   21   77:aload_2         
	//   22   78:getfield        #45  <Field int Rect.top>
	//   23   81:aload_1         
	//   24   82:getfield        #42  <Field int Rect.bottom>
	//   25   85:isub            
	//   26   86:ireturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   27   87:new             #53  <Class IllegalArgumentException>
	//   28   90:dup             
	//   29   91:ldc1            #55  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   30   93:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   31   96:athrow          
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
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 47
	//	               33: 67
	//	               66: 57
	//	               130: 77
	//*   2   44:goto            87
		case 17: // '\021'
			return rect.left - rect1.left;
	//    3   47:aload_1         
	//    4   48:getfield        #51  <Field int Rect.left>
	//    5   51:aload_2         
	//    6   52:getfield        #51  <Field int Rect.left>
	//    7   55:isub            
	//    8   56:ireturn         

		case 66: // 'B'
			return rect1.right - rect.right;
	//    9   57:aload_2         
	//   10   58:getfield        #48  <Field int Rect.right>
	//   11   61:aload_1         
	//   12   62:getfield        #48  <Field int Rect.right>
	//   13   65:isub            
	//   14   66:ireturn         

		case 33: // '!'
			return rect.top - rect1.top;
	//   15   67:aload_1         
	//   16   68:getfield        #45  <Field int Rect.top>
	//   17   71:aload_2         
	//   18   72:getfield        #45  <Field int Rect.top>
	//   19   75:isub            
	//   20   76:ireturn         

		case 130: 
			return rect1.bottom - rect.bottom;
	//   21   77:aload_2         
	//   22   78:getfield        #42  <Field int Rect.bottom>
	//   23   81:aload_1         
	//   24   82:getfield        #42  <Field int Rect.bottom>
	//   25   85:isub            
	//   26   86:ireturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   27   87:new             #53  <Class IllegalArgumentException>
	//   28   90:dup             
	//   29   91:ldc1            #55  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   30   93:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   31   96:athrow          
	}

	private static int minorAxisDistance(int i, Rect rect, Rect rect1)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 47
	//	               33: 74
	//	               66: 47
	//	               130: 74
	//*   2   44:goto            101
		case 17: // '\021'
		case 66: // 'B'
			return Math.abs((rect.top + rect.height() / 2) - (rect1.top + rect1.height() / 2));
	//    3   47:aload_1         
	//    4   48:getfield        #45  <Field int Rect.top>
	//    5   51:aload_1         
	//    6   52:invokevirtual   #75  <Method int Rect.height()>
	//    7   55:iconst_2        
	//    8   56:idiv            
	//    9   57:iadd            
	//   10   58:aload_2         
	//   11   59:getfield        #45  <Field int Rect.top>
	//   12   62:aload_2         
	//   13   63:invokevirtual   #75  <Method int Rect.height()>
	//   14   66:iconst_2        
	//   15   67:idiv            
	//   16   68:iadd            
	//   17   69:isub            
	//   18   70:invokestatic    #166 <Method int Math.abs(int)>
	//   19   73:ireturn         

		case 33: // '!'
		case 130: 
			return Math.abs((rect.left + rect.width() / 2) - (rect1.left + rect1.width() / 2));
	//   20   74:aload_1         
	//   21   75:getfield        #51  <Field int Rect.left>
	//   22   78:aload_1         
	//   23   79:invokevirtual   #68  <Method int Rect.width()>
	//   24   82:iconst_2        
	//   25   83:idiv            
	//   26   84:iadd            
	//   27   85:aload_2         
	//   28   86:getfield        #51  <Field int Rect.left>
	//   29   89:aload_2         
	//   30   90:invokevirtual   #68  <Method int Rect.width()>
	//   31   93:iconst_2        
	//   32   94:idiv            
	//   33   95:iadd            
	//   34   96:isub            
	//   35   97:invokestatic    #166 <Method int Math.abs(int)>
	//   36  100:ireturn         
		}
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//   37  101:new             #53  <Class IllegalArgumentException>
	//   38  104:dup             
	//   39  105:ldc1            #55  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   40  107:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//   41  110:athrow          
	}
}
