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
		boolean flag2;
		boolean flag3;
		i = (int)motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method float MotionEvent.getX()>
	//    2    4:f2i             
	//    3    5:istore          4
		j = (int)motionevent.getY();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #69  <Method float MotionEvent.getY()>
	//    6   11:f2i             
	//    7   12:istore          5
		flag2 = false;
	//    8   14:iconst_0        
	//    9   15:istore          6
		flag1 = true;
	//   10   17:iconst_1        
	//   11   18:istore_3        
		flag3 = false;
	//   12   19:iconst_0        
	//   13   20:istore          7
		motionevent.getAction();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #72  <Method int MotionEvent.getAction()>
		JVM INSTR tableswitch 0 3: default 56
	//	               0 118
	//	               1 147
	//	               2 147
	//	               3 193;
	//   16   26:tableswitch     0 3: default 56
	//	               0 118
	//	               1 147
	//	               2 147
	//	               3 193
		   goto _L1 _L2 _L3 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_193;
_L1:
		boolean flag = flag1;
	//   17   56:iload_3         
	//   18   57:istore_2        
_L5:
		if(flag2)
	//*  19   58:iload           6
	//*  20   60:ifeq            115
		{
			boolean flag4;
			if(flag && !mActualBounds.contains(i, j))
	//*  21   63:iload_2         
	//*  22   64:ifeq            209
	//*  23   67:aload_0         
	//*  24   68:getfield        #51  <Field Rect mActualBounds>
	//*  25   71:iload           4
	//*  26   73:iload           5
	//*  27   75:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  28   78:ifne            209
				motionevent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
	//   29   81:aload_1         
	//   30   82:aload_0         
	//   31   83:getfield        #57  <Field View mDelegateView>
	//   32   86:invokevirtual   #79  <Method int View.getWidth()>
	//   33   89:iconst_2        
	//   34   90:idiv            
	//   35   91:i2f             
	//   36   92:aload_0         
	//   37   93:getfield        #57  <Field View mDelegateView>
	//   38   96:invokevirtual   #82  <Method int View.getHeight()>
	//   39   99:iconst_2        
	//   40  100:idiv            
	//   41  101:i2f             
	//   42  102:invokevirtual   #86  <Method void MotionEvent.setLocation(float, float)>
			else
	//*  43  105:aload_0         
	//*  44  106:getfield        #57  <Field View mDelegateView>
	//*  45  109:aload_1         
	//*  46  110:invokevirtual   #89  <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//*  47  113:istore          7
	//*  48  115:iload           7
	//*  49  117:ireturn         
	//*  50  118:iload_3         
	//*  51  119:istore_2        
	//*  52  120:aload_0         
	//*  53  121:getfield        #47  <Field Rect mTargetBounds>
	//*  54  124:iload           4
	//*  55  126:iload           5
	//*  56  128:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  57  131:ifeq            58
	//*  58  134:aload_0         
	//*  59  135:iconst_1        
	//*  60  136:putfield        #91  <Field boolean mDelegateTargeted>
	//*  61  139:iconst_1        
	//*  62  140:istore          6
	//*  63  142:iload_3         
	//*  64  143:istore_2        
	//*  65  144:goto            58
	//*  66  147:aload_0         
	//*  67  148:getfield        #91  <Field boolean mDelegateTargeted>
	//*  68  151:istore          8
	//*  69  153:iload_3         
	//*  70  154:istore_2        
	//*  71  155:iload           8
	//*  72  157:istore          6
	//*  73  159:iload           8
	//*  74  161:ifeq            58
	//*  75  164:iload_3         
	//*  76  165:istore_2        
	//*  77  166:iload           8
	//*  78  168:istore          6
	//*  79  170:aload_0         
	//*  80  171:getfield        #49  <Field Rect mSlopBounds>
	//*  81  174:iload           4
	//*  82  176:iload           5
	//*  83  178:invokevirtual   #76  <Method boolean Rect.contains(int, int)>
	//*  84  181:ifne            58
	//*  85  184:iconst_0        
	//*  86  185:istore_2        
	//*  87  186:iload           8
	//*  88  188:istore          6
	//*  89  190:goto            58
	//*  90  193:aload_0         
	//*  91  194:getfield        #91  <Field boolean mDelegateTargeted>
	//*  92  197:istore          6
	//*  93  199:aload_0         
	//*  94  200:iconst_0        
	//*  95  201:putfield        #91  <Field boolean mDelegateTargeted>
	//*  96  204:iload_3         
	//*  97  205:istore_2        
	//*  98  206:goto            58
				motionevent.setLocation(i - mActualBounds.left, j - mActualBounds.top);
	//   99  209:aload_1         
	//  100  210:iload           4
	//  101  212:aload_0         
	//  102  213:getfield        #51  <Field Rect mActualBounds>
	//  103  216:getfield        #94  <Field int Rect.left>
	//  104  219:isub            
	//  105  220:i2f             
	//  106  221:iload           5
	//  107  223:aload_0         
	//  108  224:getfield        #51  <Field Rect mActualBounds>
	//  109  227:getfield        #97  <Field int Rect.top>
	//  110  230:isub            
	//  111  231:i2f             
	//  112  232:invokevirtual   #86  <Method void MotionEvent.setLocation(float, float)>
			flag3 = mDelegateView.dispatchTouchEvent(motionevent);
		}
		return flag3;
_L2:
		flag = flag1;
		if(mTargetBounds.contains(i, j))
		{
			mDelegateTargeted = true;
			flag2 = true;
			flag = flag1;
		}
		  goto _L5
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
		  goto _L5
		flag2 = mDelegateTargeted;
		mDelegateTargeted = false;
		flag = flag1;
		  goto _L5
	//* 113  235:goto            105
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
