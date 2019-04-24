// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;
import java.lang.reflect.Field;

public class ListViewCompat extends ListView
{
	private static class GateKeeperDrawable extends DrawableWrapper
	{

		public void draw(Canvas canvas)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            12
				super.draw(canvas);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #20  <Method void DrawableWrapper.draw(Canvas)>
		//    6   12:return          
		}

		void setEnabled(boolean flag)
		{
			mEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #15  <Field boolean mEnabled>
		//    3    5:return          
		}

		public void setHotspot(float f, float f1)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            13
				super.setHotspot(f, f1);
		//    3    7:aload_0         
		//    4    8:fload_1         
		//    5    9:fload_2         
		//    6   10:invokespecial   #26  <Method void DrawableWrapper.setHotspot(float, float)>
		//    7   13:return          
		}

		public void setHotspotBounds(int i, int j, int k, int l)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            16
				super.setHotspotBounds(i, j, k, l);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:iload           4
		//    8   13:invokespecial   #30  <Method void DrawableWrapper.setHotspotBounds(int, int, int, int)>
		//    9   16:return          
		}

		public boolean setState(int ai[])
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            13
				return super.setState(ai);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #34  <Method boolean DrawableWrapper.setState(int[])>
		//    6   12:ireturn         
			else
				return false;
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public boolean setVisible(boolean flag, boolean flag1)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            14
				return super.setVisible(flag, flag1);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokespecial   #38  <Method boolean DrawableWrapper.setVisible(boolean, boolean)>
		//    7   13:ireturn         
			else
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		private boolean mEnabled;

		public GateKeeperDrawable(Drawable drawable)
		{
			super(drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void DrawableWrapper(Drawable)>
			mEnabled = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #15  <Field boolean mEnabled>
		//    6   10:return          
		}
	}


	public ListViewCompat(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #38  <Method void ListViewCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public ListViewCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #41  <Method void ListViewCompat(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ListViewCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #44  <Method void ListView(Context, AttributeSet, int)>
		mSelectorRect = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #46  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #48  <Method void Rect()>
	//    9   15:putfield        #50  <Field Rect mSelectorRect>
		mSelectionLeftPadding = 0;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #52  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #54  <Field int mSelectionTopPadding>
		mSelectionRightPadding = 0;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #56  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #58  <Field int mSelectionBottomPadding>
		try
		{
			mIsChildViewEnabled = ((Class) (android/widget/AbsListView)).getDeclaredField("mIsChildViewEnabled");
	//   22   38:aload_0         
	//   23   39:ldc1            #60  <Class AbsListView>
	//   24   41:ldc1            #61  <String "mIsChildViewEnabled">
	//   25   43:invokevirtual   #67  <Method Field Class.getDeclaredField(String)>
	//   26   46:putfield        #69  <Field Field mIsChildViewEnabled>
			mIsChildViewEnabled.setAccessible(true);
	//   27   49:aload_0         
	//   28   50:getfield        #69  <Field Field mIsChildViewEnabled>
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #75  <Method void Field.setAccessible(boolean)>
			return;
	//   31   57:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  32   58:astore_1        
		{
			((NoSuchFieldException) (context)).printStackTrace();
	//   33   59:aload_1         
	//   34   60:invokevirtual   #78  <Method void NoSuchFieldException.printStackTrace()>
		}
	//   35   63:return          
	}

	protected void dispatchDraw(Canvas canvas)
	{
		drawSelectorCompat(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #83  <Method void drawSelectorCompat(Canvas)>
		super.dispatchDraw(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #85  <Method void ListView.dispatchDraw(Canvas)>
	//    6   10:return          
	}

	protected void drawSelectorCompat(Canvas canvas)
	{
		if(!mSelectorRect.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Rect mSelectorRect>
	//*   2    4:invokevirtual   #89  <Method boolean Rect.isEmpty()>
	//*   3    7:ifne            32
		{
			Drawable drawable = getSelector();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #93  <Method Drawable getSelector()>
	//    6   14:astore_2        
			if(drawable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          32
			{
				drawable.setBounds(mSelectorRect);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #50  <Field Rect mSelectorRect>
	//   12   24:invokevirtual   #99  <Method void Drawable.setBounds(Rect)>
				drawable.draw(canvas);
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #102 <Method void Drawable.draw(Canvas)>
			}
		}
	//   16   32:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void ListView.drawableStateChanged()>
		setSelectorEnabled(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #108 <Method void setSelectorEnabled(boolean)>
		updateSelectorStateCompat();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #111 <Method void updateSelectorStateCompat()>
	//    7   13:return          
	}

	public int lookForSelectablePosition(int i, boolean flag)
	{
		ListAdapter listadapter = getAdapter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method ListAdapter getAdapter()>
	//    2    4:astore          5
		if(listadapter != null && !isInTouchMode()) goto _L2; else goto _L1
	//    3    6:aload           5
	//    4    8:ifnull          18
	//    5   11:aload_0         
	//    6   12:invokevirtual   #120 <Method boolean isInTouchMode()>
	//    7   15:ifeq            20
_L1:
		return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
_L2:
		int j;
		int k;
		k = listadapter.getCount();
	//   10   20:aload           5
	//   11   22:invokeinterface #126 <Method int ListAdapter.getCount()>
	//   12   27:istore          4
		if(getAdapter().areAllItemsEnabled())
			continue; /* Loop/switch isn't completed */
	//   13   29:aload_0         
	//   14   30:invokevirtual   #117 <Method ListAdapter getAdapter()>
	//   15   33:invokeinterface #129 <Method boolean ListAdapter.areAllItemsEnabled()>
	//   16   38:ifne            126
		if(flag)
	//*  17   41:iload_2         
	//*  18   42:ifeq            79
		{
			i = Math.max(0, i);
	//   19   45:iconst_0        
	//   20   46:iload_1         
	//   21   47:invokestatic    #135 <Method int Math.max(int, int)>
	//   22   50:istore_1        
			do
			{
				j = i;
	//   23   51:iload_1         
	//   24   52:istore_3        
				if(i >= k)
					continue; /* Loop/switch isn't completed */
	//   25   53:iload_1         
	//   26   54:iload           4
	//   27   56:icmpge          114
				j = i;
	//   28   59:iload_1         
	//   29   60:istore_3        
				if(listadapter.isEnabled(i))
					continue; /* Loop/switch isn't completed */
	//   30   61:aload           5
	//   31   63:iload_1         
	//   32   64:invokeinterface #139 <Method boolean ListAdapter.isEnabled(int)>
	//   33   69:ifne            114
				i++;
	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:istore_1        
			} while(true);
	//   38   76:goto            51
		}
		i = Math.min(i, k - 1);
	//   39   79:iload_1         
	//   40   80:iload           4
	//   41   82:iconst_1        
	//   42   83:isub            
	//   43   84:invokestatic    #142 <Method int Math.min(int, int)>
	//   44   87:istore_1        
		do
		{
			j = i;
	//   45   88:iload_1         
	//   46   89:istore_3        
			if(i < 0)
				break;
	//   47   90:iload_1         
	//   48   91:iflt            114
			j = i;
	//   49   94:iload_1         
	//   50   95:istore_3        
			if(listadapter.isEnabled(i))
				break;
	//   51   96:aload           5
	//   52   98:iload_1         
	//   53   99:invokeinterface #139 <Method boolean ListAdapter.isEnabled(int)>
	//   54  104:ifne            114
			i--;
	//   55  107:iload_1         
	//   56  108:iconst_1        
	//   57  109:isub            
	//   58  110:istore_1        
		} while(true);
	//   59  111:goto            88
		if(j < 0 || j >= k) goto _L1; else goto _L3
	//   60  114:iload_3         
	//   61  115:iflt            18
	//   62  118:iload_3         
	//   63  119:iload           4
	//   64  121:icmpge          18
_L3:
		return j;
	//   65  124:iload_3         
	//   66  125:ireturn         
		if(i < 0 || i >= k) goto _L1; else goto _L4
	//   67  126:iload_1         
	//   68  127:iflt            18
	//   69  130:iload_1         
	//   70  131:iload           4
	//   71  133:icmpge          18
_L4:
		return i;
	//   72  136:iload_1         
	//   73  137:ireturn         
	}

	public int measureHeightOfChildrenCompat(int i, int j, int k, int l, int i1)
	{
		int j1;
		Object obj;
		ListAdapter listadapter;
		j = getListPaddingTop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getListPaddingTop()>
	//    2    4:istore_2        
		k = getListPaddingBottom();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #150 <Method int getListPaddingBottom()>
	//    5    9:istore_3        
		getListPaddingLeft();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #153 <Method int getListPaddingLeft()>
	//    8   14:pop             
		getListPaddingRight();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #156 <Method int getListPaddingRight()>
	//   11   19:pop             
		j1 = getDividerHeight();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #159 <Method int getDividerHeight()>
	//   14   24:istore          6
		obj = ((Object) (getDivider()));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #162 <Method Drawable getDivider()>
	//   17   30:astore          12
		listadapter = getAdapter();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #117 <Method ListAdapter getAdapter()>
	//   20   36:astore          15
		if(listadapter != null) goto _L2; else goto _L1
	//   21   38:aload           15
	//   22   40:ifnonnull       49
_L1:
		j += k;
	//   23   43:iload_2         
	//   24   44:iload_3         
	//   25   45:iadd            
	//   26   46:istore_2        
_L4:
		return j;
	//   27   47:iload_2         
	//   28   48:ireturn         
_L2:
		k = j + k;
	//   29   49:iload_2         
	//   30   50:iload_3         
	//   31   51:iadd            
	//   32   52:istore_3        
		int i2;
		int k2;
		if(j1 <= 0 || obj == null)
	//*  33   53:iload           6
	//*  34   55:ifle            249
	//*  35   58:aload           12
	//*  36   60:ifnull          249
	//*  37   63:iconst_0        
	//*  38   64:istore_2        
	//*  39   65:aconst_null     
	//*  40   66:astore          12
	//*  41   68:iconst_0        
	//*  42   69:istore          9
	//*  43   71:aload           15
	//*  44   73:invokeinterface #126 <Method int ListAdapter.getCount()>
	//*  45   78:istore          11
	//*  46   80:iconst_0        
	//*  47   81:istore          7
	//*  48   83:iload           7
	//*  49   85:iload           11
	//*  50   87:icmpge          306
	//*  51   90:aload           15
	//*  52   92:iload           7
	//*  53   94:invokeinterface #166 <Method int ListAdapter.getItemViewType(int)>
	//*  54   99:istore          10
	//*  55  101:iload           9
	//*  56  103:istore          8
	//*  57  105:iload           10
	//*  58  107:iload           9
	//*  59  109:icmpeq          119
	//*  60  112:aconst_null     
	//*  61  113:astore          12
	//*  62  115:iload           10
	//*  63  117:istore          8
	//*  64  119:aload           15
	//*  65  121:iload           7
	//*  66  123:aload           12
	//*  67  125:aload_0         
	//*  68  126:invokeinterface #170 <Method View ListAdapter.getView(int, View, android.view.ViewGroup)>
	//*  69  131:astore          13
	//*  70  133:aload           13
	//*  71  135:invokevirtual   #176 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  72  138:astore          14
	//*  73  140:aload           14
	//*  74  142:astore          12
	//*  75  144:aload           14
	//*  76  146:ifnonnull       162
	//*  77  149:aload_0         
	//*  78  150:invokevirtual   #179 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//*  79  153:astore          12
	//*  80  155:aload           13
	//*  81  157:aload           12
	//*  82  159:invokevirtual   #183 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  83  162:aload           12
	//*  84  164:getfield        #188 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  85  167:ifle            255
	//*  86  170:aload           12
	//*  87  172:getfield        #188 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  88  175:ldc1            #189 <Int 0x40000000>
	//*  89  177:invokestatic    #194 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  90  180:istore          9
	//*  91  182:aload           13
	//*  92  184:iload_1         
	//*  93  185:iload           9
	//*  94  187:invokevirtual   #198 <Method void View.measure(int, int)>
	//*  95  190:aload           13
	//*  96  192:invokevirtual   #201 <Method void View.forceLayout()>
	//*  97  195:iload_3         
	//*  98  196:istore          9
	//*  99  198:iload           7
	//* 100  200:ifle            209
	//* 101  203:iload_3         
	//* 102  204:iload           6
	//* 103  206:iadd            
	//* 104  207:istore          9
	//* 105  209:iload           9
	//* 106  211:aload           13
	//* 107  213:invokevirtual   #204 <Method int View.getMeasuredHeight()>
	//* 108  216:iadd            
	//* 109  217:istore_3        
	//* 110  218:iload_3         
	//* 111  219:iload           4
	//* 112  221:icmplt          265
	//* 113  224:iload           5
	//* 114  226:iflt            246
	//* 115  229:iload           7
	//* 116  231:iload           5
	//* 117  233:icmple          246
	//* 118  236:iload_2         
	//* 119  237:ifle            246
	//* 120  240:iload_3         
	//* 121  241:iload           4
	//* 122  243:icmpne          47
	//* 123  246:iload           4
	//* 124  248:ireturn         
			j1 = 0;
	//  125  249:iconst_0        
	//  126  250:istore          6
		j = 0;
		obj = null;
		i2 = 0;
		k2 = listadapter.getCount();
		for(int k1 = 0; k1 < k2;)
		{
			int j2 = listadapter.getItemViewType(k1);
			int l1 = i2;
			if(j2 != i2)
			{
				obj = null;
				l1 = j2;
			}
			View view = listadapter.getView(k1, ((View) (obj)), ((android.view.ViewGroup) (this)));
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
			obj = ((Object) (layoutparams));
			if(layoutparams == null)
			{
				obj = ((Object) (generateDefaultLayoutParams()));
				view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
			}
			if(((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
				i2 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
			else
	//* 127  252:goto            63
				i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  128  255:iconst_0        
	//  129  256:iconst_0        
	//  130  257:invokestatic    #194 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  131  260:istore          9
			view.measure(i, i2);
			view.forceLayout();
			i2 = k;
			if(k1 > 0)
				i2 = k + j1;
			k = i2 + view.getMeasuredHeight();
			if(k >= l)
			{
				if(i1 < 0 || k1 <= i1 || j <= 0 || k == l)
					return l;
				continue; /* Loop/switch isn't completed */
			}
	//* 132  262:goto            182
			i2 = j;
	//  133  265:iload_2         
	//  134  266:istore          9
			if(i1 >= 0)
	//* 135  268:iload           5
	//* 136  270:iflt            286
			{
				i2 = j;
	//  137  273:iload_2         
	//  138  274:istore          9
				if(k1 >= i1)
	//* 139  276:iload           7
	//* 140  278:iload           5
	//* 141  280:icmplt          286
					i2 = k;
	//  142  283:iload_3         
	//  143  284:istore          9
			}
			k1++;
	//  144  286:iload           7
	//  145  288:iconst_1        
	//  146  289:iadd            
	//  147  290:istore          7
			obj = ((Object) (view));
	//  148  292:aload           13
	//  149  294:astore          12
			j = i2;
	//  150  296:iload           9
	//  151  298:istore_2        
			i2 = l1;
	//  152  299:iload           8
	//  153  301:istore          9
		}

	//* 154  303:goto            83
		return k;
	//  155  306:iload_3         
	//  156  307:ireturn         
		if(true) goto _L4; else goto _L3
_L3:
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #211 <Method int MotionEvent.getAction()>
		JVM INSTR tableswitch 0 0: default 24
	//	               0 30;
	//    2    4:tableswitch     0 0: default 24
	//	               0 30
		   goto _L1 _L2
_L1:
		return super.onTouchEvent(motionevent);
	//    3   24:aload_0         
	//    4   25:aload_1         
	//    5   26:invokespecial   #213 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//    6   29:ireturn         
_L2:
		mMotionPosition = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//    7   30:aload_0         
	//    8   31:aload_0         
	//    9   32:aload_1         
	//   10   33:invokevirtual   #217 <Method float MotionEvent.getX()>
	//   11   36:f2i             
	//   12   37:aload_1         
	//   13   38:invokevirtual   #220 <Method float MotionEvent.getY()>
	//   14   41:f2i             
	//   15   42:invokevirtual   #223 <Method int pointToPosition(int, int)>
	//   16   45:putfield        #225 <Field int mMotionPosition>
		if(true) goto _L1; else goto _L3
	//   17   48:goto            24
_L3:
	}

	protected void positionSelectorCompat(int i, View view)
	{
		Rect rect = mSelectorRect;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Rect mSelectorRect>
	//    2    4:astore          4
		rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//    3    6:aload           4
	//    4    8:aload_2         
	//    5    9:invokevirtual   #232 <Method int View.getLeft()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #235 <Method int View.getTop()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #238 <Method int View.getRight()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #241 <Method int View.getBottom()>
	//   12   24:invokevirtual   #245 <Method void Rect.set(int, int, int, int)>
		rect.left = rect.left - mSelectionLeftPadding;
	//   13   27:aload           4
	//   14   29:aload           4
	//   15   31:getfield        #248 <Field int Rect.left>
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field int mSelectionLeftPadding>
	//   18   38:isub            
	//   19   39:putfield        #248 <Field int Rect.left>
		rect.top = rect.top - mSelectionTopPadding;
	//   20   42:aload           4
	//   21   44:aload           4
	//   22   46:getfield        #251 <Field int Rect.top>
	//   23   49:aload_0         
	//   24   50:getfield        #54  <Field int mSelectionTopPadding>
	//   25   53:isub            
	//   26   54:putfield        #251 <Field int Rect.top>
		rect.right = rect.right + mSelectionRightPadding;
	//   27   57:aload           4
	//   28   59:aload           4
	//   29   61:getfield        #254 <Field int Rect.right>
	//   30   64:aload_0         
	//   31   65:getfield        #56  <Field int mSelectionRightPadding>
	//   32   68:iadd            
	//   33   69:putfield        #254 <Field int Rect.right>
		rect.bottom = rect.bottom + mSelectionBottomPadding;
	//   34   72:aload           4
	//   35   74:aload           4
	//   36   76:getfield        #257 <Field int Rect.bottom>
	//   37   79:aload_0         
	//   38   80:getfield        #58  <Field int mSelectionBottomPadding>
	//   39   83:iadd            
	//   40   84:putfield        #257 <Field int Rect.bottom>
		boolean flag;
		flag = mIsChildViewEnabled.getBoolean(((Object) (this)));
	//   41   87:aload_0         
	//   42   88:getfield        #69  <Field Field mIsChildViewEnabled>
	//   43   91:aload_0         
	//   44   92:invokevirtual   #261 <Method boolean Field.getBoolean(Object)>
	//   45   95:istore_3        
		if(view.isEnabled() == flag)
			break MISSING_BLOCK_LABEL_133;
	//   46   96:aload_2         
	//   47   97:invokevirtual   #263 <Method boolean View.isEnabled()>
	//   48  100:iload_3         
	//   49  101:icmpeq          133
		view = ((View) (mIsChildViewEnabled));
	//   50  104:aload_0         
	//   51  105:getfield        #69  <Field Field mIsChildViewEnabled>
	//   52  108:astore_2        
		if(!flag)
	//*  53  109:iload_3         
	//*  54  110:ifne            134
			flag = true;
	//   55  113:iconst_1        
	//   56  114:istore_3        
		else
	//*  57  115:aload_2         
	//*  58  116:aload_0         
	//*  59  117:iload_3         
	//*  60  118:invokestatic    #269 <Method Boolean Boolean.valueOf(boolean)>
	//*  61  121:invokevirtual   #272 <Method void Field.set(Object, Object)>
	//*  62  124:iload_1         
	//*  63  125:iconst_m1       
	//*  64  126:icmpeq          133
	//*  65  129:aload_0         
	//*  66  130:invokevirtual   #275 <Method void refreshDrawableState()>
	//*  67  133:return          
			flag = false;
	//   68  134:iconst_0        
	//   69  135:istore_3        
		try
		{
			((Field) (view)).set(((Object) (this)), ((Object) (Boolean.valueOf(flag))));
		}
	//*  70  136:goto            115
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  71  139:astore_2        
		{
			((IllegalAccessException) (view)).printStackTrace();
	//   72  140:aload_2         
	//   73  141:invokevirtual   #276 <Method void IllegalAccessException.printStackTrace()>
			return;
	//   74  144:return          
		}
		if(i == -1)
			break MISSING_BLOCK_LABEL_133;
		refreshDrawableState();
	}

	protected void positionSelectorLikeFocusCompat(int i, View view)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		Drawable drawable = getSelector();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #93  <Method Drawable getSelector()>
	//    4    7:astore          7
		boolean flag;
		if(drawable != null && i != -1)
	//*   5    9:aload           7
	//*   6   11:ifnull          87
	//*   7   14:iload_1         
	//*   8   15:iconst_m1       
	//*   9   16:icmpeq          87
			flag = true;
	//   10   19:iconst_1        
	//   11   20:istore          5
		else
	//*  12   22:iload           5
	//*  13   24:ifeq            35
	//*  14   27:aload           7
	//*  15   29:iconst_0        
	//*  16   30:iconst_0        
	//*  17   31:invokevirtual   #281 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  18   34:pop             
	//*  19   35:aload_0         
	//*  20   36:iload_1         
	//*  21   37:aload_2         
	//*  22   38:invokevirtual   #283 <Method void positionSelectorCompat(int, View)>
	//*  23   41:iload           5
	//*  24   43:ifeq            86
	//*  25   46:aload_0         
	//*  26   47:getfield        #50  <Field Rect mSelectorRect>
	//*  27   50:astore_2        
	//*  28   51:aload_2         
	//*  29   52:invokevirtual   #286 <Method float Rect.exactCenterX()>
	//*  30   55:fstore_3        
	//*  31   56:aload_2         
	//*  32   57:invokevirtual   #289 <Method float Rect.exactCenterY()>
	//*  33   60:fstore          4
	//*  34   62:aload_0         
	//*  35   63:invokevirtual   #292 <Method int getVisibility()>
	//*  36   66:ifne            93
	//*  37   69:aload           7
	//*  38   71:iload           6
	//*  39   73:iconst_0        
	//*  40   74:invokevirtual   #281 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  41   77:pop             
	//*  42   78:aload           7
	//*  43   80:fload_3         
	//*  44   81:fload           4
	//*  45   83:invokestatic    #298 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//*  46   86:return          
			flag = false;
	//   47   87:iconst_0        
	//   48   88:istore          5
		if(flag)
			drawable.setVisible(false, false);
		positionSelectorCompat(i, view);
		if(flag)
		{
			view = ((View) (mSelectorRect));
			float f = ((Rect) (view)).exactCenterX();
			float f1 = ((Rect) (view)).exactCenterY();
			if(getVisibility() != 0)
	//*  49   90:goto            22
				flag1 = false;
	//   50   93:iconst_0        
	//   51   94:istore          6
			drawable.setVisible(flag1, false);
			DrawableCompat.setHotspot(drawable, f, f1);
		}
	//*  52   96:goto            69
	}

	protected void positionSelectorLikeTouchCompat(int i, View view, float f, float f1)
	{
		positionSelectorLikeFocusCompat(i, view);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #302 <Method void positionSelectorLikeFocusCompat(int, View)>
		view = ((View) (getSelector()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #93  <Method Drawable getSelector()>
	//    6   10:astore_2        
		if(view != null && i != -1)
	//*   7   11:aload_2         
	//*   8   12:ifnull          27
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          27
			DrawableCompat.setHotspot(((Drawable) (view)), f, f1);
	//   12   20:aload_2         
	//   13   21:fload_3         
	//   14   22:fload           4
	//   15   24:invokestatic    #298 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//   16   27:return          
	}

	public void setSelector(Drawable drawable)
	{
		Object obj;
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          77
			obj = ((Object) (new GateKeeperDrawable(drawable)));
	//    2    4:new             #6   <Class ListViewCompat$GateKeeperDrawable>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #306 <Method void ListViewCompat$GateKeeperDrawable(Drawable)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:putfield        #308 <Field ListViewCompat$GateKeeperDrawable mSelector>
	//*  10   18:aload_0         
	//*  11   19:aload_0         
	//*  12   20:getfield        #308 <Field ListViewCompat$GateKeeperDrawable mSelector>
	//*  13   23:invokespecial   #310 <Method void ListView.setSelector(Drawable)>
	//*  14   26:new             #46  <Class Rect>
	//*  15   29:dup             
	//*  16   30:invokespecial   #48  <Method void Rect()>
	//*  17   33:astore_2        
	//*  18   34:aload_1         
	//*  19   35:ifnull          44
	//*  20   38:aload_1         
	//*  21   39:aload_2         
	//*  22   40:invokevirtual   #314 <Method boolean Drawable.getPadding(Rect)>
	//*  23   43:pop             
	//*  24   44:aload_0         
	//*  25   45:aload_2         
	//*  26   46:getfield        #248 <Field int Rect.left>
	//*  27   49:putfield        #52  <Field int mSelectionLeftPadding>
	//*  28   52:aload_0         
	//*  29   53:aload_2         
	//*  30   54:getfield        #251 <Field int Rect.top>
	//*  31   57:putfield        #54  <Field int mSelectionTopPadding>
	//*  32   60:aload_0         
	//*  33   61:aload_2         
	//*  34   62:getfield        #254 <Field int Rect.right>
	//*  35   65:putfield        #56  <Field int mSelectionRightPadding>
	//*  36   68:aload_0         
	//*  37   69:aload_2         
	//*  38   70:getfield        #257 <Field int Rect.bottom>
	//*  39   73:putfield        #58  <Field int mSelectionBottomPadding>
	//*  40   76:return          
			obj = null;
	//   41   77:aconst_null     
	//   42   78:astore_2        
		mSelector = ((GateKeeperDrawable) (obj));
		super.setSelector(((Drawable) (mSelector)));
		obj = ((Object) (new Rect()));
		if(drawable != null)
			drawable.getPadding(((Rect) (obj)));
		mSelectionLeftPadding = ((Rect) (obj)).left;
		mSelectionTopPadding = ((Rect) (obj)).top;
		mSelectionRightPadding = ((Rect) (obj)).right;
		mSelectionBottomPadding = ((Rect) (obj)).bottom;
	//*  43   79:goto            13
	}

	protected void setSelectorEnabled(boolean flag)
	{
		if(mSelector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #308 <Field ListViewCompat$GateKeeperDrawable mSelector>
	//*   2    4:ifnull          15
			mSelector.setEnabled(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #308 <Field ListViewCompat$GateKeeperDrawable mSelector>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #317 <Method void ListViewCompat$GateKeeperDrawable.setEnabled(boolean)>
	//    7   15:return          
	}

	protected boolean shouldShowSelectorCompat()
	{
		return touchModeDrawsInPressedStateCompat() && isPressed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method boolean touchModeDrawsInPressedStateCompat()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #324 <Method boolean isPressed()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected boolean touchModeDrawsInPressedStateCompat()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void updateSelectorStateCompat()
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method Drawable getSelector()>
	//    2    4:astore_1        
		if(drawable != null && shouldShowSelectorCompat())
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #326 <Method boolean shouldShowSelectorCompat()>
	//*   7   13:ifeq            25
			drawable.setState(getDrawableState());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #330 <Method int[] getDrawableState()>
	//   11   21:invokevirtual   #334 <Method boolean Drawable.setState(int[])>
	//   12   24:pop             
	//   13   25:return          
	}

	public static final int INVALID_POSITION = -1;
	public static final int NO_POSITION = -1;
	private static final int STATE_SET_NOTHING[] = {
		0
	};
	private Field mIsChildViewEnabled;
	protected int mMotionPosition;
	int mSelectionBottomPadding;
	int mSelectionLeftPadding;
	int mSelectionRightPadding;
	int mSelectionTopPadding;
	private GateKeeperDrawable mSelector;
	final Rect mSelectorRect;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_0        
	//    5    6:iastore         
	//    6    7:putstatic       #32  <Field int[] STATE_SET_NOTHING>
	//*   7   10:return          
	}
}
