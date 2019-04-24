// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.Rect;
import java.util.Comparator;

// Referenced classes of package android.support.v4.widget:
//			FocusStrategy

static class FocusStrategy$SequentialComparator
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
