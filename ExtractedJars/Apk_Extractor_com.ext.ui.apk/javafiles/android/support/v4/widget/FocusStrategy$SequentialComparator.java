// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.Rect;
import java.util.Comparator;

// Referenced classes of package android.support.v4.widget:
//			FocusStrategy

private static class FocusStrategy$SequentialComparator
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

	private final FocusStrategy.BoundsAdapter mAdapter;
	private final boolean mIsLayoutRtl;
	private final Rect mTemp1 = new Rect();
	private final Rect mTemp2 = new Rect();

	FocusStrategy$SequentialComparator(boolean flag, FocusStrategy.BoundsAdapter boundsadapter)
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
