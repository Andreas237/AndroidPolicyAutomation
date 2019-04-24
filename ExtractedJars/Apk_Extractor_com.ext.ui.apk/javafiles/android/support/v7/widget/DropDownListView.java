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
		int j = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #129 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_3        
		j;
	//    3    5:iload_3         
		JVM INSTR tableswitch 1 3: default 32
	//	               1 104
	//	               2 225
	//	               3 96;
	//    4    6:tableswitch     1 3: default 32
	//	               1 104
	//	               2 225
	//	               3 96
		   goto _L1 _L2 _L3 _L4
_L3:
		break MISSING_BLOCK_LABEL_225;
_L1:
		boolean flag;
		i = 0;
	//    5   32:iconst_0        
	//    6   33:istore_2        
		flag = true;
	//    7   34:iconst_1        
	//    8   35:istore          6
_L7:
		if(!flag || i != 0)
	//*   9   37:iload           6
	//*  10   39:ifeq            46
	//*  11   42:iload_2         
	//*  12   43:ifeq            50
			clearPressedItem();
	//   13   46:aload_0         
	//   14   47:invokespecial   #131 <Method void clearPressedItem()>
		if(!flag) goto _L6; else goto _L5
	//   15   50:iload           6
	//   16   52:ifeq            206
_L5:
		if(mScrollHelper == null)
	//*  17   55:aload_0         
	//*  18   56:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//*  19   59:ifnonnull       74
			mScrollHelper = new ListViewAutoScrollHelper(((android.widget.ListView) (this)));
	//   20   62:aload_0         
	//   21   63:new             #135 <Class ListViewAutoScrollHelper>
	//   22   66:dup             
	//   23   67:aload_0         
	//   24   68:invokespecial   #138 <Method void ListViewAutoScrollHelper(android.widget.ListView)>
	//   25   71:putfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
		mScrollHelper.setEnabled(true);
	//   26   74:aload_0         
	//   27   75:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//   28   78:iconst_1        
	//   29   79:invokevirtual   #142 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//   30   82:pop             
		mScrollHelper.onTouch(((View) (this)), motionevent);
	//   31   83:aload_0         
	//   32   84:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//   33   87:aload_0         
	//   34   88:aload_1         
	//   35   89:invokevirtual   #146 <Method boolean ListViewAutoScrollHelper.onTouch(View, MotionEvent)>
	//   36   92:pop             
_L9:
		return flag;
	//   37   93:iload           6
	//   38   95:ireturn         
_L4:
		i = 0;
	//   39   96:iconst_0        
	//   40   97:istore_2        
		flag = false;
	//   41   98:iconst_0        
	//   42   99:istore          6
		  goto _L7
	//*  43  101:goto            37
_L2:
		flag = false;
	//   44  104:iconst_0        
	//   45  105:istore          6
_L10:
		int k;
		int l;
		k = motionevent.findPointerIndex(i);
	//   46  107:aload_1         
	//   47  108:iload_2         
	//   48  109:invokevirtual   #150 <Method int MotionEvent.findPointerIndex(int)>
	//   49  112:istore          4
		if(k < 0)
	//*  50  114:iload           4
	//*  51  116:ifge            127
		{
			i = 0;
	//   52  119:iconst_0        
	//   53  120:istore_2        
			flag = false;
	//   54  121:iconst_0        
	//   55  122:istore          6
		} else
	//*  56  124:goto            37
		{
label0:
			{
				i = (int)motionevent.getX(k);
	//   57  127:aload_1         
	//   58  128:iload           4
	//   59  130:invokevirtual   #154 <Method float MotionEvent.getX(int)>
	//   60  133:f2i             
	//   61  134:istore_2        
				k = (int)motionevent.getY(k);
	//   62  135:aload_1         
	//   63  136:iload           4
	//   64  138:invokevirtual   #157 <Method float MotionEvent.getY(int)>
	//   65  141:f2i             
	//   66  142:istore          4
				l = pointToPosition(i, k);
	//   67  144:aload_0         
	//   68  145:iload_2         
	//   69  146:iload           4
	//   70  148:invokevirtual   #161 <Method int pointToPosition(int, int)>
	//   71  151:istore          5
				if(l != -1)
					break label0;
	//   72  153:iload           5
	//   73  155:iconst_m1       
	//   74  156:icmpne          164
				i = 1;
	//   75  159:iconst_1        
	//   76  160:istore_2        
			}
		}
		  goto _L7
	//*  77  161:goto            37
		View view = getChildAt(l - getFirstVisiblePosition());
	//   78  164:aload_0         
	//   79  165:iload           5
	//   80  167:aload_0         
	//   81  168:invokevirtual   #48  <Method int getFirstVisiblePosition()>
	//   82  171:isub            
	//   83  172:invokevirtual   #52  <Method View getChildAt(int)>
	//   84  175:astore          7
		setPressedItem(view, l, i, k);
	//   85  177:aload_0         
	//   86  178:aload           7
	//   87  180:iload           5
	//   88  182:iload_2         
	//   89  183:i2f             
	//   90  184:iload           4
	//   91  186:i2f             
	//   92  187:invokespecial   #163 <Method void setPressedItem(View, int, float, float)>
		if(j == 1)
	//*  93  190:iload_3         
	//*  94  191:iconst_1        
	//*  95  192:icmpne          32
			clickPressedItem(view, l);
	//   96  195:aload_0         
	//   97  196:aload           7
	//   98  198:iload           5
	//   99  200:invokespecial   #165 <Method void clickPressedItem(View, int)>
		  goto _L1
	//* 100  203:goto            32
_L6:
		if(mScrollHelper == null) goto _L9; else goto _L8
	//  101  206:aload_0         
	//  102  207:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//  103  210:ifnull          93
_L8:
		mScrollHelper.setEnabled(false);
	//  104  213:aload_0         
	//  105  214:getfield        #133 <Field ListViewAutoScrollHelper mScrollHelper>
	//  106  217:iconst_0        
	//  107  218:invokevirtual   #142 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//  108  221:pop             
		return flag;
	//  109  222:iload           6
	//  110  224:ireturn         
		flag = true;
	//  111  225:iconst_1        
	//  112  226:istore          6
		  goto _L10
	//* 113  228:goto            107
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
