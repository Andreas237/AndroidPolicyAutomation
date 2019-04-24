// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			SearchView

private static class SearchView$UpdatableTouchDelegate extends TouchDelegate
{

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		boolean flag1;
		int i;
		int j;
		boolean flag3;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		flag3 = false;
	//    2    2:iconst_0        
	//    3    3:istore          7
		i = (int)motionevent.getX();
	//    4    5:aload_1         
	//    5    6:invokevirtual   #66  <Method float MotionEvent.getX()>
	//    6    9:f2i             
	//    7   10:istore          4
		j = (int)motionevent.getY();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #69  <Method float MotionEvent.getY()>
	//   10   16:f2i             
	//   11   17:istore          5
		motionevent.getAction();
	//   12   19:aload_1         
	//   13   20:invokevirtual   #72  <Method int MotionEvent.getAction()>
		JVM INSTR tableswitch 0 3: default 52
	//	               0 117
	//	               1 144
	//	               2 144
	//	               3 190;
	//   14   23:tableswitch     0 3: default 52
	//	               0 117
	//	               1 144
	//	               2 144
	//	               3 190
		   goto _L1 _L2 _L3 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_190;
_L1:
		boolean flag;
		boolean flag2;
		flag2 = false;
	//   15   52:iconst_0        
	//   16   53:istore          6
		flag = flag1;
	//   17   55:iload_3         
	//   18   56:istore_2        
_L6:
		if(flag2)
	//*  19   57:iload           6
	//*  20   59:ifeq            114
		{
			boolean flag4;
			if(flag && !mActualBounds.contains(i, j))
	//*  21   62:iload_2         
	//*  22   63:ifeq            206
	//*  23   66:aload_0         
	//*  24   67:getfield        #51  <Field Rect mActualBounds>
	//*  25   70:iload           4
	//*  26   72:iload           5
	//*  27   74:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  28   77:ifne            206
				motionevent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
	//   29   80:aload_1         
	//   30   81:aload_0         
	//   31   82:getfield        #57  <Field View mDelegateView>
	//   32   85:invokevirtual   #79  <Method int View.getWidth()>
	//   33   88:iconst_2        
	//   34   89:idiv            
	//   35   90:i2f             
	//   36   91:aload_0         
	//   37   92:getfield        #57  <Field View mDelegateView>
	//   38   95:invokevirtual   #82  <Method int View.getHeight()>
	//   39   98:iconst_2        
	//   40   99:idiv            
	//   41  100:i2f             
	//   42  101:invokevirtual   #86  <Method void MotionEvent.setLocation(float, float)>
			else
	//*  43  104:aload_0         
	//*  44  105:getfield        #57  <Field View mDelegateView>
	//*  45  108:aload_1         
	//*  46  109:invokevirtual   #89  <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//*  47  112:istore          7
	//*  48  114:iload           7
	//*  49  116:ireturn         
	//*  50  117:aload_0         
	//*  51  118:getfield        #47  <Field Rect mTargetBounds>
	//*  52  121:iload           4
	//*  53  123:iload           5
	//*  54  125:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  55  128:ifeq            52
	//*  56  131:aload_0         
	//*  57  132:iconst_1        
	//*  58  133:putfield        #91  <Field boolean mDelegateTargeted>
	//*  59  136:iconst_1        
	//*  60  137:istore          6
	//*  61  139:iload_3         
	//*  62  140:istore_2        
	//*  63  141:goto            57
	//*  64  144:aload_0         
	//*  65  145:getfield        #91  <Field boolean mDelegateTargeted>
	//*  66  148:istore          8
	//*  67  150:iload_3         
	//*  68  151:istore_2        
	//*  69  152:iload           8
	//*  70  154:istore          6
	//*  71  156:iload           8
	//*  72  158:ifeq            57
	//*  73  161:iload_3         
	//*  74  162:istore_2        
	//*  75  163:iload           8
	//*  76  165:istore          6
	//*  77  167:aload_0         
	//*  78  168:getfield        #49  <Field Rect mSlopBounds>
	//*  79  171:iload           4
	//*  80  173:iload           5
	//*  81  175:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  82  178:ifne            57
	//*  83  181:iconst_0        
	//*  84  182:istore_2        
	//*  85  183:iload           8
	//*  86  185:istore          6
	//*  87  187:goto            57
	//*  88  190:aload_0         
	//*  89  191:getfield        #91  <Field boolean mDelegateTargeted>
	//*  90  194:istore          6
	//*  91  196:aload_0         
	//*  92  197:iconst_0        
	//*  93  198:putfield        #91  <Field boolean mDelegateTargeted>
	//*  94  201:iload_3         
	//*  95  202:istore_2        
	//*  96  203:goto            57
				motionevent.setLocation(i - mActualBounds.left, j - mActualBounds.top);
	//   97  206:aload_1         
	//   98  207:iload           4
	//   99  209:aload_0         
	//  100  210:getfield        #51  <Field Rect mActualBounds>
	//  101  213:getfield        #94  <Field int Rect.left>
	//  102  216:isub            
	//  103  217:i2f             
	//  104  218:iload           5
	//  105  220:aload_0         
	//  106  221:getfield        #51  <Field Rect mActualBounds>
	//  107  224:getfield        #97  <Field int Rect.top>
	//  108  227:isub            
	//  109  228:i2f             
	//  110  229:invokevirtual   #86  <Method void MotionEvent.setLocation(float, float)>
			flag3 = mDelegateView.dispatchTouchEvent(motionevent);
		}
		return flag3;
_L2:
		if(!mTargetBounds.contains(i, j)) goto _L1; else goto _L5
_L5:
		mDelegateTargeted = true;
		flag2 = true;
		flag = flag1;
		  goto _L6
_L3:
		flag4 = mDelegateTargeted;
		flag = flag1;
		flag2 = flag4;
		if(flag4)
		{
			flag = flag1;
			flag2 = flag4;
			if(!mSlopBounds.contains(i, j))
			{
				flag = false;
				flag2 = flag4;
			}
		}
		  goto _L6
		flag2 = mDelegateTargeted;
		mDelegateTargeted = false;
		flag = flag1;
		  goto _L6
	//* 111  232:goto            104
	}

	public void setBounds(Rect rect, Rect rect1)
	{
		mTargetBounds.set(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Rect mTargetBounds>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method void Rect.set(Rect)>
		mSlopBounds.set(rect);
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field Rect mSlopBounds>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #101 <Method void Rect.set(Rect)>
		mSlopBounds.inset(-mSlop, -mSlop);
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field Rect mSlopBounds>
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field int mSlop>
	//   12   24:ineg            
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field int mSlop>
	//   15   29:ineg            
	//   16   30:invokevirtual   #105 <Method void Rect.inset(int, int)>
		mActualBounds.set(rect1);
	//   17   33:aload_0         
	//   18   34:getfield        #51  <Field Rect mActualBounds>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #101 <Method void Rect.set(Rect)>
	//   21   41:return          
	}

	private final Rect mActualBounds = new Rect();
	private boolean mDelegateTargeted;
	private final View mDelegateView;
	private final int mSlop;
	private final Rect mSlopBounds = new Rect();
	private final Rect mTargetBounds = new Rect();

	public SearchView$UpdatableTouchDelegate(Rect rect, Rect rect1, View view)
	{
		super(rect, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #22  <Method void TouchDelegate(Rect, View)>
		mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #28  <Method android.content.Context View.getContext()>
	//    7   11:invokestatic    #34  <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//    8   14:invokevirtual   #38  <Method int ViewConfiguration.getScaledTouchSlop()>
	//    9   17:putfield        #40  <Field int mSlop>
	//   10   20:aload_0         
	//   11   21:new             #42  <Class Rect>
	//   12   24:dup             
	//   13   25:invokespecial   #45  <Method void Rect()>
	//   14   28:putfield        #47  <Field Rect mTargetBounds>
	//   15   31:aload_0         
	//   16   32:new             #42  <Class Rect>
	//   17   35:dup             
	//   18   36:invokespecial   #45  <Method void Rect()>
	//   19   39:putfield        #49  <Field Rect mSlopBounds>
	//   20   42:aload_0         
	//   21   43:new             #42  <Class Rect>
	//   22   46:dup             
	//   23   47:invokespecial   #45  <Method void Rect()>
	//   24   50:putfield        #51  <Field Rect mActualBounds>
		setBounds(rect, rect1);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #55  <Method void setBounds(Rect, Rect)>
		mDelegateView = view;
	//   29   59:aload_0         
	//   30   60:aload_3         
	//   31   61:putfield        #57  <Field View mDelegateView>
	//   32   64:return          
	}
}
