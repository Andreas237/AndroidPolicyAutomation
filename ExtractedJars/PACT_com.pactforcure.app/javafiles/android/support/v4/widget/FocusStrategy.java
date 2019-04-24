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
			int i;
			boolean flag;
			Rect rect;
			Rect rect1;
			flag = true;
		//    0    0:iconst_1        
		//    1    1:istore          4
			i = 1;
		//    2    3:iconst_1        
		//    3    4:istore_3        
			rect = mTemp1;
		//    4    5:aload_0         
		//    5    6:getfield        #28  <Field Rect mTemp1>
		//    6    9:astore          5
			rect1 = mTemp2;
		//    7   11:aload_0         
		//    8   12:getfield        #30  <Field Rect mTemp2>
		//    9   15:astore          6
			mAdapter.obtainBounds(obj, rect);
		//   10   17:aload_0         
		//   11   18:getfield        #34  <Field FocusStrategy$BoundsAdapter mAdapter>
		//   12   21:aload_1         
		//   13   22:aload           5
		//   14   24:invokeinterface #45  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			mAdapter.obtainBounds(obj1, rect1);
		//   15   29:aload_0         
		//   16   30:getfield        #34  <Field FocusStrategy$BoundsAdapter mAdapter>
		//   17   33:aload_2         
		//   18   34:aload           6
		//   19   36:invokeinterface #45  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
			if(rect.top >= rect1.top) goto _L2; else goto _L1
		//   20   41:aload           5
		//   21   43:getfield        #49  <Field int Rect.top>
		//   22   46:aload           6
		//   23   48:getfield        #49  <Field int Rect.top>
		//   24   51:icmpge          56
_L1:
			return -1;
		//   25   54:iconst_m1       
		//   26   55:ireturn         
_L2:
			if(rect.top > rect1.top)
		//*  27   56:aload           5
		//*  28   58:getfield        #49  <Field int Rect.top>
		//*  29   61:aload           6
		//*  30   63:getfield        #49  <Field int Rect.top>
		//*  31   66:icmple          71
				return 1;
		//   32   69:iconst_1        
		//   33   70:ireturn         
			if(rect.left < rect1.left)
		//*  34   71:aload           5
		//*  35   73:getfield        #52  <Field int Rect.left>
		//*  36   76:aload           6
		//*  37   78:getfield        #52  <Field int Rect.left>
		//*  38   81:icmpge          98
			{
				if(!mIsLayoutRtl)
		//*  39   84:aload_0         
		//*  40   85:getfield        #32  <Field boolean mIsLayoutRtl>
		//*  41   88:ifeq            93
		//*  42   91:iload_3         
		//*  43   92:ireturn         
					i = -1;
		//   44   93:iconst_m1       
		//   45   94:istore_3        
				return i;
			}
		//*  46   95:goto            91
			if(rect.left <= rect1.left)
				continue; /* Loop/switch isn't completed */
		//   47   98:aload           5
		//   48  100:getfield        #52  <Field int Rect.left>
		//   49  103:aload           6
		//   50  105:getfield        #52  <Field int Rect.left>
		//   51  108:icmple          120
			if(!mIsLayoutRtl)
		//*  52  111:aload_0         
		//*  53  112:getfield        #32  <Field boolean mIsLayoutRtl>
		//*  54  115:ifne            54
				return 1;
		//   55  118:iconst_1        
		//   56  119:ireturn         
			continue; /* Loop/switch isn't completed */
			if(rect.bottom < rect1.bottom) goto _L1; else goto _L3
		//   57  120:aload           5
		//   58  122:getfield        #55  <Field int Rect.bottom>
		//   59  125:aload           6
		//   60  127:getfield        #55  <Field int Rect.bottom>
		//   61  130:icmplt          54
_L3:
			if(rect.bottom > rect1.bottom)
		//*  62  133:aload           5
		//*  63  135:getfield        #55  <Field int Rect.bottom>
		//*  64  138:aload           6
		//*  65  140:getfield        #55  <Field int Rect.bottom>
		//*  66  143:icmple          148
				return 1;
		//   67  146:iconst_1        
		//   68  147:ireturn         
			if(rect.right < rect1.right)
		//*  69  148:aload           5
		//*  70  150:getfield        #58  <Field int Rect.right>
		//*  71  153:aload           6
		//*  72  155:getfield        #58  <Field int Rect.right>
		//*  73  158:icmpge          178
			{
				int j;
				if(mIsLayoutRtl)
		//*  74  161:aload_0         
		//*  75  162:getfield        #32  <Field boolean mIsLayoutRtl>
		//*  76  165:ifeq            173
					j = ((int) (flag));
		//   77  168:iload           4
		//   78  170:istore_3        
				else
		//*  79  171:iload_3         
		//*  80  172:ireturn         
					j = -1;
		//   81  173:iconst_m1       
		//   82  174:istore_3        
				return j;
			}
		//*  83  175:goto            171
			if(rect.right > rect1.right)
		//*  84  178:aload           5
		//*  85  180:getfield        #58  <Field int Rect.right>
		//*  86  183:aload           6
		//*  87  185:getfield        #58  <Field int Rect.right>
		//*  88  188:icmple          200
			{
				if(!mIsLayoutRtl)
		//*  89  191:aload_0         
		//*  90  192:getfield        #32  <Field boolean mIsLayoutRtl>
		//*  91  195:ifne            54
					return 1;
		//   92  198:iconst_1        
		//   93  199:ireturn         
			} else
			{
				return 0;
		//   94  200:iconst_0        
		//   95  201:ireturn         
			}
			if(true) goto _L1; else goto _L4
_L4:
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag = beamsOverlap(i, rect, rect1);
	//    2    3:iload_0         
	//    3    4:aload_1         
	//    4    5:aload_2         
	//    5    6:invokestatic    #25  <Method boolean beamsOverlap(int, Rect, Rect)>
	//    6    9:istore          4
		if(beamsOverlap(i, rect, rect2) || !flag)
	//*   7   11:iload_0         
	//*   8   12:aload_1         
	//*   9   13:aload_3         
	//*  10   14:invokestatic    #25  <Method boolean beamsOverlap(int, Rect, Rect)>
	//*  11   17:ifne            25
	//*  12   20:iload           4
	//*  13   22:ifne            31
		{
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore          4
		} else
	//*  16   28:iload           4
	//*  17   30:ireturn         
		{
			flag = flag1;
	//   18   31:iload           5
	//   19   33:istore          4
			if(isToDirectionOf(i, rect, rect2))
	//*  20   35:iload_0         
	//*  21   36:aload_1         
	//*  22   37:aload_3         
	//*  23   38:invokestatic    #28  <Method boolean isToDirectionOf(int, Rect, Rect)>
	//*  24   41:ifeq            28
			{
				flag = flag1;
	//   25   44:iload           5
	//   26   46:istore          4
				if(i != 17)
	//*  27   48:iload_0         
	//*  28   49:bipush          17
	//*  29   51:icmpeq          28
				{
					flag = flag1;
	//   30   54:iload           5
	//   31   56:istore          4
					if(i != 66)
	//*  32   58:iload_0         
	//*  33   59:bipush          66
	//*  34   61:icmpeq          28
					{
						flag = flag1;
	//   35   64:iload           5
	//   36   66:istore          4
						if(majorAxisDistance(i, rect, rect1) >= majorAxisDistanceToFarEdge(i, rect, rect2))
	//*  37   68:iload_0         
	//*  38   69:aload_1         
	//*  39   70:aload_2         
	//*  40   71:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//*  41   74:iload_0         
	//*  42   75:aload_1         
	//*  43   76:aload_3         
	//*  44   77:invokestatic    #35  <Method int majorAxisDistanceToFarEdge(int, Rect, Rect)>
	//*  45   80:icmplt          28
							return false;
	//   46   83:iconst_0        
	//   47   84:ireturn         
					}
				}
			}
		}
		return flag;
	}

	private static boolean beamsOverlap(int i, Rect rect, Rect rect1)
	{
		i;
	//    0    0:iload_0         
		JVM INSTR lookupswitch 4: default 44
	//	               17: 54
	//	               33: 80
	//	               66: 54
	//	               130: 80;
	//    1    1:lookupswitch    4: default 44
	//	               17: 54
	//	               33: 80
	//	               66: 54
	//	               130: 80
		   goto _L1 _L2 _L3 _L2 _L3
_L1:
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    2   44:new             #38  <Class IllegalArgumentException>
	//    3   47:dup             
	//    4   48:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//    5   50:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//    6   53:athrow          
_L2:
		if(rect1.bottom < rect.top || rect1.top > rect.bottom) goto _L5; else goto _L4
	//    7   54:aload_2         
	//    8   55:getfield        #49  <Field int Rect.bottom>
	//    9   58:aload_1         
	//   10   59:getfield        #52  <Field int Rect.top>
	//   11   62:icmplt          78
	//   12   65:aload_2         
	//   13   66:getfield        #52  <Field int Rect.top>
	//   14   69:aload_1         
	//   15   70:getfield        #49  <Field int Rect.bottom>
	//   16   73:icmpgt          78
_L4:
		return true;
	//   17   76:iconst_1        
	//   18   77:ireturn         
_L5:
		return false;
	//   19   78:iconst_0        
	//   20   79:ireturn         
_L3:
		if(rect1.right < rect.left || rect1.left > rect.right)
	//*  21   80:aload_2         
	//*  22   81:getfield        #55  <Field int Rect.right>
	//*  23   84:aload_1         
	//*  24   85:getfield        #58  <Field int Rect.left>
	//*  25   88:icmplt          102
	//*  26   91:aload_2         
	//*  27   92:getfield        #58  <Field int Rect.left>
	//*  28   95:aload_1         
	//*  29   96:getfield        #55  <Field int Rect.right>
	//*  30   99:icmple          76
			return false;
	//   31  102:iconst_0        
	//   32  103:ireturn         
		if(true) goto _L4; else goto _L6
_L6:
	}

	public static Object findNextFocusInAbsoluteDirection(Object obj, CollectionAdapter collectionadapter, BoundsAdapter boundsadapter, Object obj1, Rect rect, int i)
	{
		Rect rect1;
		rect1 = new Rect(rect);
	//    0    0:new             #45  <Class Rect>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:invokespecial   #64  <Method void Rect(Rect)>
	//    4    9:astore          10
		int j;
		int k;
		switch(i)
	//*   5   11:iload           5
		{
	//*   6   13:lookupswitch    4: default 56
	//	               17: 66
	//	               33: 153
	//	               66: 136
	//	               130: 169
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    7   56:new             #38  <Class IllegalArgumentException>
	//    8   59:dup             
	//    9   60:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//   10   62:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//   11   65:athrow          

		case 17: // '\021'
			rect1.offset(rect.width() + 1, 0);
	//   12   66:aload           10
	//   13   68:aload           4
	//   14   70:invokevirtual   #68  <Method int Rect.width()>
	//   15   73:iconst_1        
	//   16   74:iadd            
	//   17   75:iconst_0        
	//   18   76:invokevirtual   #72  <Method void Rect.offset(int, int)>
			break;

	//*  19   79:aconst_null     
	//*  20   80:astore          8
	//*  21   82:aload_1         
	//*  22   83:aload_0         
	//*  23   84:invokeinterface #76  <Method int FocusStrategy$CollectionAdapter.size(Object)>
	//*  24   89:istore          7
	//*  25   91:new             #45  <Class Rect>
	//*  26   94:dup             
	//*  27   95:invokespecial   #77  <Method void Rect()>
	//*  28   98:astore          11
	//*  29  100:iconst_0        
	//*  30  101:istore          6
	//*  31  103:iload           6
	//*  32  105:iload           7
	//*  33  107:icmpge          224
	//*  34  110:aload_1         
	//*  35  111:aload_0         
	//*  36  112:iload           6
	//*  37  114:invokeinterface #81  <Method Object FocusStrategy$CollectionAdapter.get(Object, int)>
	//*  38  119:astore          9
	//*  39  121:aload           9
	//*  40  123:aload_3         
	//*  41  124:if_acmpne       186
	//*  42  127:iload           6
	//*  43  129:iconst_1        
	//*  44  130:iadd            
	//*  45  131:istore          6
	//*  46  133:goto            103
		case 66: // 'B'
			rect1.offset(-(rect.width() + 1), 0);
	//   47  136:aload           10
	//   48  138:aload           4
	//   49  140:invokevirtual   #68  <Method int Rect.width()>
	//   50  143:iconst_1        
	//   51  144:iadd            
	//   52  145:ineg            
	//   53  146:iconst_0        
	//   54  147:invokevirtual   #72  <Method void Rect.offset(int, int)>
			continue;
	//   55  150:goto            79

		case 33: // '!'
			rect1.offset(0, rect.height() + 1);
	//   56  153:aload           10
	//   57  155:iconst_0        
	//   58  156:aload           4
	//   59  158:invokevirtual   #84  <Method int Rect.height()>
	//   60  161:iconst_1        
	//   61  162:iadd            
	//   62  163:invokevirtual   #72  <Method void Rect.offset(int, int)>
			continue;
	//   63  166:goto            79

		case 130: 
			rect1.offset(0, -(rect.height() + 1));
	//   64  169:aload           10
	//   65  171:iconst_0        
	//   66  172:aload           4
	//   67  174:invokevirtual   #84  <Method int Rect.height()>
	//   68  177:iconst_1        
	//   69  178:iadd            
	//   70  179:ineg            
	//   71  180:invokevirtual   #72  <Method void Rect.offset(int, int)>
			continue;
	//   72  183:goto            79
		}
		break;
		do
		{
			Object obj2 = null;
			k = collectionadapter.size(obj);
			Rect rect2 = new Rect();
			j = 0;
			while(j < k) 
			{
				Object obj3 = collectionadapter.get(obj, j);
				if(obj3 != obj1)
				{
					boundsadapter.obtainBounds(obj3, rect2);
	//   73  186:aload_2         
	//   74  187:aload           9
	//   75  189:aload           11
	//   76  191:invokeinterface #88  <Method void FocusStrategy$BoundsAdapter.obtainBounds(Object, Rect)>
					if(isBetterCandidate(i, rect, rect2, rect1))
	//*  77  196:iload           5
	//*  78  198:aload           4
	//*  79  200:aload           11
	//*  80  202:aload           10
	//*  81  204:invokestatic    #91  <Method boolean isBetterCandidate(int, Rect, Rect, Rect)>
	//*  82  207:ifeq            127
					{
						rect1.set(rect2);
	//   83  210:aload           10
	//   84  212:aload           11
	//   85  214:invokevirtual   #94  <Method void Rect.set(Rect)>
						obj2 = obj3;
	//   86  217:aload           9
	//   87  219:astore          8
					}
				}
				j++;
			}
	//*  88  221:goto            127
			return obj2;
	//   89  224:aload           8
	//   90  226:areturn         
		} while(true);
	}

	public static Object findNextFocusInRelativeDirection(Object obj, CollectionAdapter collectionadapter, BoundsAdapter boundsadapter, Object obj1, int i, boolean flag, boolean flag1)
	{
		int k = collectionadapter.size(obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #76  <Method int FocusStrategy$CollectionAdapter.size(Object)>
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
	//   18   36:invokeinterface #81  <Method Object FocusStrategy$CollectionAdapter.get(Object, int)>
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
	//*   4    7:ifnonnull       28
			i = -1;
	//    5   10:iconst_m1       
	//    6   11:istore_3        
		else
	//*   7   12:iload_3         
	//*   8   13:iconst_1        
	//*   9   14:iadd            
	//*  10   15:istore_3        
	//*  11   16:iload_3         
	//*  12   17:iload           4
	//*  13   19:icmpge          37
	//*  14   22:aload_1         
	//*  15   23:iload_3         
	//*  16   24:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//*  17   27:areturn         
			i = arraylist.lastIndexOf(obj);
	//   18   28:aload_1         
	//   19   29:aload_0         
	//   20   30:invokevirtual   #134 <Method int ArrayList.lastIndexOf(Object)>
	//   21   33:istore_3        
		i++;
		if(i < j)
			return arraylist.get(i);
	//*  22   34:goto            12
		if(flag && j > 0)
	//*  23   37:iload_2         
	//*  24   38:ifeq            52
	//*  25   41:iload           4
	//*  26   43:ifle            52
			return arraylist.get(0);
	//   27   46:aload_1         
	//   28   47:iconst_0        
	//   29   48:invokevirtual   #131 <Method Object ArrayList.get(int)>
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
	//*   4    7:ifnonnull       27
			i = j;
	//    5   10:iload           4
	//    6   12:istore_3        
		else
	//*   7   13:iload_3         
	//*   8   14:iconst_1        
	//*   9   15:isub            
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:iflt            36
	//*  13   21:aload_1         
	//*  14   22:iload_3         
	//*  15   23:invokevirtual   #131 <Method Object ArrayList.get(int)>
	//*  16   26:areturn         
			i = arraylist.indexOf(obj);
	//   17   27:aload_1         
	//   18   28:aload_0         
	//   19   29:invokevirtual   #138 <Method int ArrayList.indexOf(Object)>
	//   20   32:istore_3        
		i--;
		if(i >= 0)
			return arraylist.get(i);
	//*  21   33:goto            13
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
	//   30   50:invokevirtual   #131 <Method Object ArrayList.get(int)>
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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag;
		if(!isCandidate(rect, rect1, i))
	//*   2    3:aload_1         
	//*   3    4:aload_2         
	//*   4    5:iload_0         
	//*   5    6:invokestatic    #144 <Method boolean isCandidate(Rect, Rect, int)>
	//*   6    9:ifne            18
		{
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          4
		} else
	//*   9   15:iload           4
	//*  10   17:ireturn         
		{
			flag = flag1;
	//   11   18:iload           5
	//   12   20:istore          4
			if(isCandidate(rect, rect2, i))
	//*  13   22:aload_1         
	//*  14   23:aload_3         
	//*  15   24:iload_0         
	//*  16   25:invokestatic    #144 <Method boolean isCandidate(Rect, Rect, int)>
	//*  17   28:ifeq            15
			{
				flag = flag1;
	//   18   31:iload           5
	//   19   33:istore          4
				if(!beamBeats(i, rect, rect1, rect2))
	//*  20   35:iload_0         
	//*  21   36:aload_1         
	//*  22   37:aload_2         
	//*  23   38:aload_3         
	//*  24   39:invokestatic    #146 <Method boolean beamBeats(int, Rect, Rect, Rect)>
	//*  25   42:ifne            15
				{
					if(beamBeats(i, rect, rect2, rect1))
	//*  26   45:iload_0         
	//*  27   46:aload_1         
	//*  28   47:aload_3         
	//*  29   48:aload_2         
	//*  30   49:invokestatic    #146 <Method boolean beamBeats(int, Rect, Rect, Rect)>
	//*  31   52:ifeq            57
						return false;
	//   32   55:iconst_0        
	//   33   56:ireturn         
					flag = flag1;
	//   34   57:iload           5
	//   35   59:istore          4
					if(getWeightedDistanceFor(majorAxisDistance(i, rect, rect1), minorAxisDistance(i, rect, rect1)) >= getWeightedDistanceFor(majorAxisDistance(i, rect, rect2), minorAxisDistance(i, rect, rect2)))
	//*  36   61:iload_0         
	//*  37   62:aload_1         
	//*  38   63:aload_2         
	//*  39   64:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//*  40   67:iload_0         
	//*  41   68:aload_1         
	//*  42   69:aload_2         
	//*  43   70:invokestatic    #149 <Method int minorAxisDistance(int, Rect, Rect)>
	//*  44   73:invokestatic    #151 <Method int getWeightedDistanceFor(int, int)>
	//*  45   76:iload_0         
	//*  46   77:aload_1         
	//*  47   78:aload_3         
	//*  48   79:invokestatic    #32  <Method int majorAxisDistance(int, Rect, Rect)>
	//*  49   82:iload_0         
	//*  50   83:aload_1         
	//*  51   84:aload_3         
	//*  52   85:invokestatic    #149 <Method int minorAxisDistance(int, Rect, Rect)>
	//*  53   88:invokestatic    #151 <Method int getWeightedDistanceFor(int, int)>
	//*  54   91:icmplt          15
						return false;
	//   55   94:iconst_0        
	//   56   95:ireturn         
				}
			}
		}
		return flag;
	}

	private static boolean isCandidate(Rect rect, Rect rect1, int i)
	{
		i;
	//    0    0:iload_2         
		JVM INSTR lookupswitch 4: default 44
	//	               17: 54
	//	               33: 126
	//	               66: 91
	//	               130: 161;
	//    1    1:lookupswitch    4: default 44
	//	               17: 54
	//	               33: 126
	//	               66: 91
	//	               130: 161
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    2   44:new             #38  <Class IllegalArgumentException>
	//    3   47:dup             
	//    4   48:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//    5   50:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//    6   53:athrow          
_L2:
		if(rect.right <= rect1.right && rect.left < rect1.right || rect.left <= rect1.left) goto _L7; else goto _L6
	//    7   54:aload_0         
	//    8   55:getfield        #55  <Field int Rect.right>
	//    9   58:aload_1         
	//   10   59:getfield        #55  <Field int Rect.right>
	//   11   62:icmpgt          76
	//   12   65:aload_0         
	//   13   66:getfield        #58  <Field int Rect.left>
	//   14   69:aload_1         
	//   15   70:getfield        #55  <Field int Rect.right>
	//   16   73:icmplt          89
	//   17   76:aload_0         
	//   18   77:getfield        #58  <Field int Rect.left>
	//   19   80:aload_1         
	//   20   81:getfield        #58  <Field int Rect.left>
	//   21   84:icmple          89
_L6:
		return true;
	//   22   87:iconst_1        
	//   23   88:ireturn         
_L7:
		return false;
	//   24   89:iconst_0        
	//   25   90:ireturn         
_L4:
		if(rect.left >= rect1.left && rect.right > rect1.left || rect.right >= rect1.right)
	//*  26   91:aload_0         
	//*  27   92:getfield        #58  <Field int Rect.left>
	//*  28   95:aload_1         
	//*  29   96:getfield        #58  <Field int Rect.left>
	//*  30   99:icmplt          113
	//*  31  102:aload_0         
	//*  32  103:getfield        #55  <Field int Rect.right>
	//*  33  106:aload_1         
	//*  34  107:getfield        #58  <Field int Rect.left>
	//*  35  110:icmpgt          124
	//*  36  113:aload_0         
	//*  37  114:getfield        #55  <Field int Rect.right>
	//*  38  117:aload_1         
	//*  39  118:getfield        #55  <Field int Rect.right>
	//*  40  121:icmplt          87
			return false;
	//   41  124:iconst_0        
	//   42  125:ireturn         
		continue; /* Loop/switch isn't completed */
_L3:
		if(rect.bottom <= rect1.bottom && rect.top < rect1.bottom || rect.top <= rect1.top)
	//*  43  126:aload_0         
	//*  44  127:getfield        #49  <Field int Rect.bottom>
	//*  45  130:aload_1         
	//*  46  131:getfield        #49  <Field int Rect.bottom>
	//*  47  134:icmpgt          148
	//*  48  137:aload_0         
	//*  49  138:getfield        #52  <Field int Rect.top>
	//*  50  141:aload_1         
	//*  51  142:getfield        #49  <Field int Rect.bottom>
	//*  52  145:icmplt          159
	//*  53  148:aload_0         
	//*  54  149:getfield        #52  <Field int Rect.top>
	//*  55  152:aload_1         
	//*  56  153:getfield        #52  <Field int Rect.top>
	//*  57  156:icmpgt          87
			return false;
	//   58  159:iconst_0        
	//   59  160:ireturn         
		continue; /* Loop/switch isn't completed */
_L5:
		if(rect.top >= rect1.top && rect.bottom > rect1.top || rect.bottom >= rect1.bottom)
	//*  60  161:aload_0         
	//*  61  162:getfield        #52  <Field int Rect.top>
	//*  62  165:aload_1         
	//*  63  166:getfield        #52  <Field int Rect.top>
	//*  64  169:icmplt          183
	//*  65  172:aload_0         
	//*  66  173:getfield        #49  <Field int Rect.bottom>
	//*  67  176:aload_1         
	//*  68  177:getfield        #52  <Field int Rect.top>
	//*  69  180:icmpgt          194
	//*  70  183:aload_0         
	//*  71  184:getfield        #49  <Field int Rect.bottom>
	//*  72  187:aload_1         
	//*  73  188:getfield        #49  <Field int Rect.bottom>
	//*  74  191:icmplt          87
			return false;
	//   75  194:iconst_0        
	//   76  195:ireturn         
		if(true) goto _L6; else goto _L8
_L8:
	}

	private static boolean isToDirectionOf(int i, Rect rect, Rect rect1)
	{
		i;
	//    0    0:iload_0         
		JVM INSTR lookupswitch 4: default 44
	//	               17: 54
	//	               33: 82
	//	               66: 69
	//	               130: 95;
	//    1    1:lookupswitch    4: default 44
	//	               17: 54
	//	               33: 82
	//	               66: 69
	//	               130: 95
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    2   44:new             #38  <Class IllegalArgumentException>
	//    3   47:dup             
	//    4   48:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//    5   50:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//    6   53:athrow          
_L2:
		if(rect.left < rect1.right) goto _L7; else goto _L6
	//    7   54:aload_1         
	//    8   55:getfield        #58  <Field int Rect.left>
	//    9   58:aload_2         
	//   10   59:getfield        #55  <Field int Rect.right>
	//   11   62:icmplt          67
_L6:
		return true;
	//   12   65:iconst_1        
	//   13   66:ireturn         
_L7:
		return false;
	//   14   67:iconst_0        
	//   15   68:ireturn         
_L4:
		if(rect.right > rect1.left)
	//*  16   69:aload_1         
	//*  17   70:getfield        #55  <Field int Rect.right>
	//*  18   73:aload_2         
	//*  19   74:getfield        #58  <Field int Rect.left>
	//*  20   77:icmple          65
			return false;
	//   21   80:iconst_0        
	//   22   81:ireturn         
		continue; /* Loop/switch isn't completed */
_L3:
		if(rect.top < rect1.bottom)
	//*  23   82:aload_1         
	//*  24   83:getfield        #52  <Field int Rect.top>
	//*  25   86:aload_2         
	//*  26   87:getfield        #49  <Field int Rect.bottom>
	//*  27   90:icmpge          65
			return false;
	//   28   93:iconst_0        
	//   29   94:ireturn         
		continue; /* Loop/switch isn't completed */
_L5:
		if(rect.bottom > rect1.top)
	//*  30   95:aload_1         
	//*  31   96:getfield        #49  <Field int Rect.bottom>
	//*  32   99:aload_2         
	//*  33  100:getfield        #52  <Field int Rect.top>
	//*  34  103:icmple          65
			return false;
	//   35  106:iconst_0        
	//   36  107:ireturn         
		if(true) goto _L6; else goto _L8
_L8:
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
	//	               17: 54
	//	               33: 74
	//	               66: 64
	//	               130: 84
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    2   44:new             #38  <Class IllegalArgumentException>
	//    3   47:dup             
	//    4   48:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//    5   50:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//    6   53:athrow          

		case 17: // '\021'
			return rect.left - rect1.right;
	//    7   54:aload_1         
	//    8   55:getfield        #58  <Field int Rect.left>
	//    9   58:aload_2         
	//   10   59:getfield        #55  <Field int Rect.right>
	//   11   62:isub            
	//   12   63:ireturn         

		case 66: // 'B'
			return rect1.left - rect.right;
	//   13   64:aload_2         
	//   14   65:getfield        #58  <Field int Rect.left>
	//   15   68:aload_1         
	//   16   69:getfield        #55  <Field int Rect.right>
	//   17   72:isub            
	//   18   73:ireturn         

		case 33: // '!'
			return rect.top - rect1.bottom;
	//   19   74:aload_1         
	//   20   75:getfield        #52  <Field int Rect.top>
	//   21   78:aload_2         
	//   22   79:getfield        #49  <Field int Rect.bottom>
	//   23   82:isub            
	//   24   83:ireturn         

		case 130: 
			return rect1.top - rect.bottom;
	//   25   84:aload_2         
	//   26   85:getfield        #52  <Field int Rect.top>
	//   27   88:aload_1         
	//   28   89:getfield        #49  <Field int Rect.bottom>
	//   29   92:isub            
	//   30   93:ireturn         
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
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 54
	//	               33: 74
	//	               66: 64
	//	               130: 84
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    2   44:new             #38  <Class IllegalArgumentException>
	//    3   47:dup             
	//    4   48:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//    5   50:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//    6   53:athrow          

		case 17: // '\021'
			return rect.left - rect1.left;
	//    7   54:aload_1         
	//    8   55:getfield        #58  <Field int Rect.left>
	//    9   58:aload_2         
	//   10   59:getfield        #58  <Field int Rect.left>
	//   11   62:isub            
	//   12   63:ireturn         

		case 66: // 'B'
			return rect1.right - rect.right;
	//   13   64:aload_2         
	//   14   65:getfield        #55  <Field int Rect.right>
	//   15   68:aload_1         
	//   16   69:getfield        #55  <Field int Rect.right>
	//   17   72:isub            
	//   18   73:ireturn         

		case 33: // '!'
			return rect.top - rect1.top;
	//   19   74:aload_1         
	//   20   75:getfield        #52  <Field int Rect.top>
	//   21   78:aload_2         
	//   22   79:getfield        #52  <Field int Rect.top>
	//   23   82:isub            
	//   24   83:ireturn         

		case 130: 
			return rect1.bottom - rect.bottom;
	//   25   84:aload_2         
	//   26   85:getfield        #49  <Field int Rect.bottom>
	//   27   88:aload_1         
	//   28   89:getfield        #49  <Field int Rect.bottom>
	//   29   92:isub            
	//   30   93:ireturn         
		}
	}

	private static int minorAxisDistance(int i, Rect rect, Rect rect1)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    4: default 44
	//	               17: 54
	//	               33: 81
	//	               66: 54
	//	               130: 81
		default:
			throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
	//    2   44:new             #38  <Class IllegalArgumentException>
	//    3   47:dup             
	//    4   48:ldc1            #40  <String "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.">
	//    5   50:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//    6   53:athrow          

		case 17: // '\021'
		case 66: // 'B'
			return Math.abs((rect.top + rect.height() / 2) - (rect1.top + rect1.height() / 2));
	//    7   54:aload_1         
	//    8   55:getfield        #52  <Field int Rect.top>
	//    9   58:aload_1         
	//   10   59:invokevirtual   #84  <Method int Rect.height()>
	//   11   62:iconst_2        
	//   12   63:idiv            
	//   13   64:iadd            
	//   14   65:aload_2         
	//   15   66:getfield        #52  <Field int Rect.top>
	//   16   69:aload_2         
	//   17   70:invokevirtual   #84  <Method int Rect.height()>
	//   18   73:iconst_2        
	//   19   74:idiv            
	//   20   75:iadd            
	//   21   76:isub            
	//   22   77:invokestatic    #166 <Method int Math.abs(int)>
	//   23   80:ireturn         

		case 33: // '!'
		case 130: 
			return Math.abs((rect.left + rect.width() / 2) - (rect1.left + rect1.width() / 2));
	//   24   81:aload_1         
	//   25   82:getfield        #58  <Field int Rect.left>
	//   26   85:aload_1         
	//   27   86:invokevirtual   #68  <Method int Rect.width()>
	//   28   89:iconst_2        
	//   29   90:idiv            
	//   30   91:iadd            
	//   31   92:aload_2         
	//   32   93:getfield        #58  <Field int Rect.left>
	//   33   96:aload_2         
	//   34   97:invokevirtual   #68  <Method int Rect.width()>
	//   35  100:iconst_2        
	//   36  101:idiv            
	//   37  102:iadd            
	//   38  103:isub            
	//   39  104:invokestatic    #166 <Method int Math.abs(int)>
	//   40  107:ireturn         
		}
	}
}
