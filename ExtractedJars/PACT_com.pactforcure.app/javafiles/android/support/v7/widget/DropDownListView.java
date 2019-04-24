// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ListViewCompat

class DropDownListView extends ListViewCompat
{

	public DropDownListView(Context context, boolean flag)
	{
		super(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.dropDownListViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:getstatic       #20  <Field int android.support.v7.appcompat.R$attr.dropDownListViewStyle>
	//    4    6:invokespecial   #23  <Method void ListViewCompat(Context, android.util.AttributeSet, int)>
		mHijackFocus = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field boolean mHijackFocus>
		setCacheColorHint(0);
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #29  <Method void setCacheColorHint(int)>
	//   11   19:return          
	}

	private void clearPressedItem()
	{
		mDrawsInPressedState = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #34  <Field boolean mDrawsInPressedState>
		setPressed(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #38  <Method void setPressed(boolean)>
		drawableStateChanged();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #41  <Method void drawableStateChanged()>
		View view = getChildAt(mMotionPosition - getFirstVisiblePosition());
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #44  <Field int mMotionPosition>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #48  <Method int getFirstVisiblePosition()>
	//   13   23:isub            
	//   14   24:invokevirtual   #52  <Method View getChildAt(int)>
	//   15   27:astore_1        
		if(view != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          37
			view.setPressed(false);
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #55  <Method void View.setPressed(boolean)>
		if(mClickAnimation != null)
	//*  21   37:aload_0         
	//*  22   38:getfield        #57  <Field ViewPropertyAnimatorCompat mClickAnimation>
	//*  23   41:ifnull          56
		{
			mClickAnimation.cancel();
	//   24   44:aload_0         
	//   25   45:getfield        #57  <Field ViewPropertyAnimatorCompat mClickAnimation>
	//   26   48:invokevirtual   #62  <Method void ViewPropertyAnimatorCompat.cancel()>
			mClickAnimation = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #57  <Field ViewPropertyAnimatorCompat mClickAnimation>
		}
	//   30   56:return          
	}

	private void clickPressedItem(View view, int i)
	{
		performItemClick(view, i, getItemIdAtPosition(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:iload_2         
	//    5    5:invokevirtual   #68  <Method long getItemIdAtPosition(int)>
	//    6    8:invokevirtual   #72  <Method boolean performItemClick(View, int, long)>
	//    7   11:pop             
	//    8   12:return          
	}

	private void setPressedItem(View view, int i, float f, float f1)
	{
		mDrawsInPressedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #34  <Field boolean mDrawsInPressedState>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          20
			drawableHotspotChanged(f, f1);
	//    6   13:aload_0         
	//    7   14:fload_3         
	//    8   15:fload           4
	//    9   17:invokevirtual   #83  <Method void drawableHotspotChanged(float, float)>
		if(!isPressed())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #87  <Method boolean isPressed()>
	//*  12   24:ifne            32
			setPressed(true);
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #38  <Method void setPressed(boolean)>
		layoutChildren();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #90  <Method void layoutChildren()>
		if(mMotionPosition != -1)
	//*  18   36:aload_0         
	//*  19   37:getfield        #44  <Field int mMotionPosition>
	//*  20   40:iconst_m1       
	//*  21   41:icmpeq          84
		{
			View view1 = getChildAt(mMotionPosition - getFirstVisiblePosition());
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #44  <Field int mMotionPosition>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #48  <Method int getFirstVisiblePosition()>
	//   27   53:isub            
	//   28   54:invokevirtual   #52  <Method View getChildAt(int)>
	//   29   57:astore          7
			if(view1 != null && view1 != view && view1.isPressed())
	//*  30   59:aload           7
	//*  31   61:ifnull          84
	//*  32   64:aload           7
	//*  33   66:aload_1         
	//*  34   67:if_acmpeq       84
	//*  35   70:aload           7
	//*  36   72:invokevirtual   #91  <Method boolean View.isPressed()>
	//*  37   75:ifeq            84
				view1.setPressed(false);
	//   38   78:aload           7
	//   39   80:iconst_0        
	//   40   81:invokevirtual   #55  <Method void View.setPressed(boolean)>
		}
		mMotionPosition = i;
	//   41   84:aload_0         
	//   42   85:iload_2         
	//   43   86:putfield        #44  <Field int mMotionPosition>
		float f2 = view.getLeft();
	//   44   89:aload_1         
	//   45   90:invokevirtual   #94  <Method int View.getLeft()>
	//   46   93:i2f             
	//   47   94:fstore          5
		float f3 = view.getTop();
	//   48   96:aload_1         
	//   49   97:invokevirtual   #97  <Method int View.getTop()>
	//   50  100:i2f             
	//   51  101:fstore          6
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  52  103:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//*  53  106:bipush          21
	//*  54  108:icmplt          124
			view.drawableHotspotChanged(f - f2, f1 - f3);
	//   55  111:aload_1         
	//   56  112:fload_3         
	//   57  113:fload           5
	//   58  115:fsub            
	//   59  116:fload           4
	//   60  118:fload           6
	//   61  120:fsub            
	//   62  121:invokevirtual   #98  <Method void View.drawableHotspotChanged(float, float)>
		if(!view.isPressed())
	//*  63  124:aload_1         
	//*  64  125:invokevirtual   #91  <Method boolean View.isPressed()>
	//*  65  128:ifne            136
			view.setPressed(true);
	//   66  131:aload_1         
	//   67  132:iconst_1        
	//   68  133:invokevirtual   #55  <Method void View.setPressed(boolean)>
		positionSelectorLikeTouchCompat(i, view, f, f1);
	//   69  136:aload_0         
	//   70  137:iload_2         
	//   71  138:aload_1         
	//   72  139:fload_3         
	//   73  140:fload           4
	//   74  142:invokevirtual   #102 <Method void positionSelectorLikeTouchCompat(int, View, float, float)>
		setSelectorEnabled(false);
	//   75  145:aload_0         
	//   76  146:iconst_0        
	//   77  147:invokevirtual   #105 <Method void setSelectorEnabled(boolean)>
		refreshDrawableState();
	//   78  150:aload_0         
	//   79  151:invokevirtual   #108 <Method void refreshDrawableState()>
	//   80  154:return          
	}

	public boolean hasFocus()
	{
		return mHijackFocus || super.hasFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean mHijackFocus>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:invokespecial   #111 <Method boolean ListViewCompat.hasFocus()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean hasWindowFocus()
	{
		return mHijackFocus || super.hasWindowFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean mHijackFocus>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:invokespecial   #114 <Method boolean ListViewCompat.hasWindowFocus()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isFocused()
	{
		return mHijackFocus || super.isFocused();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean mHijackFocus>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:invokespecial   #117 <Method boolean ListViewCompat.isFocused()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isInTouchMode()
	{
		return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean mHijackFocus>
	//    2    4:ifeq            14
	//    3    7:aload_0         
	//    4    8:getfield        #120 <Field boolean mListSelectionHidden>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:invokespecial   #122 <Method boolean ListViewCompat.isInTouchMode()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean onForwardedEvent(MotionEvent motionevent, int i)
	{
		boolean flag;
		int j;
		boolean flag1;
		boolean flag2;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          7
		flag2 = true;
	//    2    3:iconst_1        
	//    3    4:istore          8
		flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_3        
		j = motionevent.getActionMasked();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #129 <Method int MotionEvent.getActionMasked()>
	//    8   12:istore          4
		j;
	//    9   14:iload           4
		JVM INSTR tableswitch 1 3: default 44
	//	               1 117
	//	               2 120
	//	               3 109;
	//   10   16:tableswitch     1 3: default 44
	//	               1 117
	//	               2 120
	//	               3 109
		   goto _L1 _L2 _L3 _L4
_L1:
		flag1 = flag2;
	//   11   44:iload           8
	//   12   46:istore          7
		i = ((int) (flag));
	//   13   48:iload_3         
	//   14   49:istore_2        
_L10:
		if(!flag1 || i != 0)
	//*  15   50:iload           7
	//*  16   52:ifeq            59
	//*  17   55:iload_2         
	//*  18   56:ifeq            63
			clearPressedItem();
	//   19   59:aload_0         
	//   20   60:invokespecial   #131 <Method void clearPressedItem()>
		if(!flag1) goto _L6; else goto _L5
	//   21   63:iload           7
	//   22   65:ifeq            235
_L5:
		if(mScrollHelper == null)
	//*  23   68:aload_0         
	//*  24   69:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//*  25   72:ifnonnull       87
			mScrollHelper = new ListViewAutoScrollHelper(((android.widget.ListView) (this)));
	//   26   75:aload_0         
	//   27   76:new             #135 <Class ListViewAutoScrollHelper>
	//   28   79:dup             
	//   29   80:aload_0         
	//   30   81:invokespecial   #138 <Method void ListViewAutoScrollHelper(android.widget.ListView)>
	//   31   84:putfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
		mScrollHelper.setEnabled(true);
	//   32   87:aload_0         
	//   33   88:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//   34   91:iconst_1        
	//   35   92:invokevirtual   #142 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//   36   95:pop             
		mScrollHelper.onTouch(((View) (this)), motionevent);
	//   37   96:aload_0         
	//   38   97:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//   39  100:aload_0         
	//   40  101:aload_1         
	//   41  102:invokevirtual   #146 <Method boolean ListViewAutoScrollHelper.onTouch(View, MotionEvent)>
	//   42  105:pop             
_L8:
		return flag1;
	//   43  106:iload           7
	//   44  108:ireturn         
_L4:
		flag1 = false;
	//   45  109:iconst_0        
	//   46  110:istore          7
		i = ((int) (flag));
	//   47  112:iload_3         
	//   48  113:istore_2        
		continue; /* Loop/switch isn't completed */
	//   49  114:goto            50
_L2:
		flag1 = false;
	//   50  117:iconst_0        
	//   51  118:istore          7
_L3:
		int k = motionevent.findPointerIndex(i);
	//   52  120:aload_1         
	//   53  121:iload_2         
	//   54  122:invokevirtual   #150 <Method int MotionEvent.findPointerIndex(int)>
	//   55  125:istore          5
		if(k < 0)
	//*  56  127:iload           5
	//*  57  129:ifge            140
		{
			flag1 = false;
	//   58  132:iconst_0        
	//   59  133:istore          7
			i = ((int) (flag));
	//   60  135:iload_3         
	//   61  136:istore_2        
		} else
	//*  62  137:goto            50
		{
			i = (int)motionevent.getX(k);
	//   63  140:aload_1         
	//   64  141:iload           5
	//   65  143:invokevirtual   #154 <Method float MotionEvent.getX(int)>
	//   66  146:f2i             
	//   67  147:istore_2        
			int l = (int)motionevent.getY(k);
	//   68  148:aload_1         
	//   69  149:iload           5
	//   70  151:invokevirtual   #157 <Method float MotionEvent.getY(int)>
	//   71  154:f2i             
	//   72  155:istore          6
			k = pointToPosition(i, l);
	//   73  157:aload_0         
	//   74  158:iload_2         
	//   75  159:iload           6
	//   76  161:invokevirtual   #161 <Method int pointToPosition(int, int)>
	//   77  164:istore          5
			if(k == -1)
	//*  78  166:iload           5
	//*  79  168:iconst_m1       
	//*  80  169:icmpne          177
			{
				i = 1;
	//   81  172:iconst_1        
	//   82  173:istore_2        
			} else
	//*  83  174:goto            50
			{
				View view = getChildAt(k - getFirstVisiblePosition());
	//   84  177:aload_0         
	//   85  178:iload           5
	//   86  180:aload_0         
	//   87  181:invokevirtual   #48  <Method int getFirstVisiblePosition()>
	//   88  184:isub            
	//   89  185:invokevirtual   #52  <Method View getChildAt(int)>
	//   90  188:astore          9
				setPressedItem(view, k, i, l);
	//   91  190:aload_0         
	//   92  191:aload           9
	//   93  193:iload           5
	//   94  195:iload_2         
	//   95  196:i2f             
	//   96  197:iload           6
	//   97  199:i2f             
	//   98  200:invokespecial   #163 <Method void setPressedItem(View, int, float, float)>
				boolean flag3 = true;
	//   99  203:iconst_1        
	//  100  204:istore          8
				i = ((int) (flag));
	//  101  206:iload_3         
	//  102  207:istore_2        
				flag1 = flag3;
	//  103  208:iload           8
	//  104  210:istore          7
				if(j == 1)
	//* 105  212:iload           4
	//* 106  214:iconst_1        
	//* 107  215:icmpne          50
				{
					clickPressedItem(view, k);
	//  108  218:aload_0         
	//  109  219:aload           9
	//  110  221:iload           5
	//  111  223:invokespecial   #165 <Method void clickPressedItem(View, int)>
					i = ((int) (flag));
	//  112  226:iload_3         
	//  113  227:istore_2        
					flag1 = flag3;
	//  114  228:iload           8
	//  115  230:istore          7
				}
			}
		}
		continue; /* Loop/switch isn't completed */
	//  116  232:goto            50
_L6:
		if(mScrollHelper == null) goto _L8; else goto _L7
	//  117  235:aload_0         
	//  118  236:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//  119  239:ifnull          106
_L7:
		mScrollHelper.setEnabled(false);
	//  120  242:aload_0         
	//  121  243:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//  122  246:iconst_0        
	//  123  247:invokevirtual   #142 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//  124  250:pop             
		return flag1;
	//  125  251:iload           7
	//  126  253:ireturn         
		if(true) goto _L10; else goto _L9
_L9:
	}

	void setListSelectionHidden(boolean flag)
	{
		mListSelectionHidden = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #120 <Field boolean mListSelectionHidden>
	//    3    5:return          
	}

	protected boolean touchModeDrawsInPressedStateCompat()
	{
		return mDrawsInPressedState || super.touchModeDrawsInPressedStateCompat();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean mDrawsInPressedState>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:invokespecial   #169 <Method boolean ListViewCompat.touchModeDrawsInPressedStateCompat()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private ViewPropertyAnimatorCompat mClickAnimation;
	private boolean mDrawsInPressedState;
	private boolean mHijackFocus;
	private boolean mListSelectionHidden;
	private ListViewAutoScrollHelper mScrollHelper;
}
