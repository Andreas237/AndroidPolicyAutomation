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
