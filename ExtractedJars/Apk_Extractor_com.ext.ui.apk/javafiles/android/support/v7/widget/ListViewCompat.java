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
	//    7   15:ifeq            22
_L1:
		int j = -1;
	//    8   18:iconst_m1       
	//    9   19:istore_3        
_L4:
		return j;
	//   10   20:iload_3         
	//   11   21:ireturn         
_L2:
		int k;
		k = listadapter.getCount();
	//   12   22:aload           5
	//   13   24:invokeinterface #126 <Method int ListAdapter.getCount()>
	//   14   29:istore          4
		if(getAdapter().areAllItemsEnabled())
			break MISSING_BLOCK_LABEL_130;
	//   15   31:aload_0         
	//   16   32:invokevirtual   #117 <Method ListAdapter getAdapter()>
	//   17   35:invokeinterface #129 <Method boolean ListAdapter.areAllItemsEnabled()>
	//   18   40:ifne            130
		if(flag)
	//*  19   43:iload_2         
	//*  20   44:ifeq            81
		{
			j = Math.max(0, i);
	//   21   47:iconst_0        
	//   22   48:iload_1         
	//   23   49:invokestatic    #135 <Method int Math.max(int, int)>
	//   24   52:istore_3        
			do
			{
				i = j;
	//   25   53:iload_3         
	//   26   54:istore_1        
				if(j >= k)
					break;
	//   27   55:iload_3         
	//   28   56:iload           4
	//   29   58:icmpge          116
				i = j;
	//   30   61:iload_3         
	//   31   62:istore_1        
				if(listadapter.isEnabled(j))
					break;
	//   32   63:aload           5
	//   33   65:iload_3         
	//   34   66:invokeinterface #139 <Method boolean ListAdapter.isEnabled(int)>
	//   35   71:ifne            116
				j++;
	//   36   74:iload_3         
	//   37   75:iconst_1        
	//   38   76:iadd            
	//   39   77:istore_3        
			} while(true);
	//   40   78:goto            53
		} else
		{
			j = Math.min(i, k - 1);
	//   41   81:iload_1         
	//   42   82:iload           4
	//   43   84:iconst_1        
	//   44   85:isub            
	//   45   86:invokestatic    #142 <Method int Math.min(int, int)>
	//   46   89:istore_3        
			do
			{
				i = j;
	//   47   90:iload_3         
	//   48   91:istore_1        
				if(j < 0)
					break;
	//   49   92:iload_3         
	//   50   93:iflt            116
				i = j;
	//   51   96:iload_3         
	//   52   97:istore_1        
				if(listadapter.isEnabled(j))
					break;
	//   53   98:aload           5
	//   54  100:iload_3         
	//   55  101:invokeinterface #139 <Method boolean ListAdapter.isEnabled(int)>
	//   56  106:ifne            116
				j--;
	//   57  109:iload_3         
	//   58  110:iconst_1        
	//   59  111:isub            
	//   60  112:istore_3        
			} while(true);
	//   61  113:goto            90
		}
		if(i < 0)
			break; /* Loop/switch isn't completed */
	//   62  116:iload_1         
	//   63  117:iflt            128
		j = i;
	//   64  120:iload_1         
	//   65  121:istore_3        
		if(i < k) goto _L4; else goto _L3
	//   66  122:iload_1         
	//   67  123:iload           4
	//   68  125:icmplt          20
_L3:
		return -1;
	//   69  128:iconst_m1       
	//   70  129:ireturn         
		if(i < 0)
			break; /* Loop/switch isn't completed */
	//   71  130:iload_1         
	//   72  131:iflt            142
		j = i;
	//   73  134:iload_1         
	//   74  135:istore_3        
		if(i < k) goto _L4; else goto _L5
	//   75  136:iload_1         
	//   76  137:iload           4
	//   77  139:icmplt          20
_L5:
		return -1;
	//   78  142:iconst_m1       
	//   79  143:ireturn         
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
		j1 = getListPaddingBottom();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #150 <Method int getListPaddingBottom()>
	//    5    9:istore          6
		getListPaddingLeft();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #153 <Method int getListPaddingLeft()>
	//    8   15:pop             
		getListPaddingRight();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #156 <Method int getListPaddingRight()>
	//   11   20:pop             
		k = getDividerHeight();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #159 <Method int getDividerHeight()>
	//   14   25:istore_3        
		obj = ((Object) (getDivider()));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #162 <Method Drawable getDivider()>
	//   17   30:astore          11
		listadapter = getAdapter();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #117 <Method ListAdapter getAdapter()>
	//   20   36:astore          14
		if(listadapter != null) goto _L2; else goto _L1
	//   21   38:aload           14
	//   22   40:ifnonnull       50
_L1:
		i = j + j1;
	//   23   43:iload_2         
	//   24   44:iload           6
	//   25   46:iadd            
	//   26   47:istore_1        
_L4:
		return i;
	//   27   48:iload_1         
	//   28   49:ireturn         
_L2:
		j = j1 + j;
	//   29   50:iload           6
	//   30   52:iload_2         
	//   31   53:iadd            
	//   32   54:istore_2        
		int l1;
		int i2;
		int k2;
		if(k <= 0 || obj == null)
	//*  33   55:iload_3         
	//*  34   56:ifle            254
	//*  35   59:aload           11
	//*  36   61:ifnull          254
	//*  37   64:iconst_0        
	//*  38   65:istore          7
	//*  39   67:aconst_null     
	//*  40   68:astore          11
	//*  41   70:iconst_0        
	//*  42   71:istore          8
	//*  43   73:aload           14
	//*  44   75:invokeinterface #126 <Method int ListAdapter.getCount()>
	//*  45   80:istore          10
	//*  46   82:iconst_0        
	//*  47   83:istore          6
	//*  48   85:iload           6
	//*  49   87:iload           10
	//*  50   89:icmpge          309
	//*  51   92:aload           14
	//*  52   94:iload           6
	//*  53   96:invokeinterface #166 <Method int ListAdapter.getItemViewType(int)>
	//*  54  101:istore          9
	//*  55  103:iload           9
	//*  56  105:iload           8
	//*  57  107:icmpeq          311
	//*  58  110:aconst_null     
	//*  59  111:astore          11
	//*  60  113:iload           9
	//*  61  115:istore          8
	//*  62  117:aload           14
	//*  63  119:iload           6
	//*  64  121:aload           11
	//*  65  123:aload_0         
	//*  66  124:invokeinterface #170 <Method View ListAdapter.getView(int, View, android.view.ViewGroup)>
	//*  67  129:astore          12
	//*  68  131:aload           12
	//*  69  133:invokevirtual   #176 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  70  136:astore          13
	//*  71  138:aload           13
	//*  72  140:astore          11
	//*  73  142:aload           13
	//*  74  144:ifnonnull       160
	//*  75  147:aload_0         
	//*  76  148:invokevirtual   #179 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//*  77  151:astore          11
	//*  78  153:aload           12
	//*  79  155:aload           11
	//*  80  157:invokevirtual   #183 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  81  160:aload           11
	//*  82  162:getfield        #188 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  83  165:ifle            259
	//*  84  168:aload           11
	//*  85  170:getfield        #188 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  86  173:ldc1            #189 <Int 0x40000000>
	//*  87  175:invokestatic    #194 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  88  178:istore          9
	//*  89  180:aload           12
	//*  90  182:iload_1         
	//*  91  183:iload           9
	//*  92  185:invokevirtual   #198 <Method void View.measure(int, int)>
	//*  93  188:aload           12
	//*  94  190:invokevirtual   #201 <Method void View.forceLayout()>
	//*  95  193:iload           6
	//*  96  195:ifle            314
	//*  97  198:iload_2         
	//*  98  199:iload_3         
	//*  99  200:iadd            
	//* 100  201:istore_2        
	//* 101  202:iload_2         
	//* 102  203:aload           12
	//* 103  205:invokevirtual   #204 <Method int View.getMeasuredHeight()>
	//* 104  208:iadd            
	//* 105  209:istore_2        
	//* 106  210:iload_2         
	//* 107  211:iload           4
	//* 108  213:icmplt          269
	//* 109  216:iload           4
	//* 110  218:istore_1        
	//* 111  219:iload           5
	//* 112  221:iflt            48
	//* 113  224:iload           4
	//* 114  226:istore_1        
	//* 115  227:iload           6
	//* 116  229:iload           5
	//* 117  231:icmple          48
	//* 118  234:iload           4
	//* 119  236:istore_1        
	//* 120  237:iload           7
	//* 121  239:ifle            48
	//* 122  242:iload           4
	//* 123  244:istore_1        
	//* 124  245:iload_2         
	//* 125  246:iload           4
	//* 126  248:icmpeq          48
	//* 127  251:iload           7
	//* 128  253:ireturn         
			k = 0;
	//  129  254:iconst_0        
	//  130  255:istore_3        
		l1 = 0;
		obj = null;
		i2 = 0;
		k2 = listadapter.getCount();
		for(int k1 = 0; k1 < k2;)
		{
			int j2 = listadapter.getItemViewType(k1);
			if(j2 != i2)
			{
				obj = null;
				i2 = j2;
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
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
			else
	//* 131  256:goto            64
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  132  259:iconst_0        
	//  133  260:iconst_0        
	//  134  261:invokestatic    #194 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  135  264:istore          9
			view.measure(i, j2);
			view.forceLayout();
			if(k1 > 0)
				j += k;
			j += view.getMeasuredHeight();
			if(j >= l)
			{
				i = l;
				if(i1 >= 0)
				{
					i = l;
					if(k1 > i1)
					{
						i = l;
						if(l1 > 0)
						{
							i = l;
							if(j != l)
								return l1;
						}
					}
				}
				continue; /* Loop/switch isn't completed */
			}
	//* 136  266:goto            180
			j2 = l1;
	//  137  269:iload           7
	//  138  271:istore          9
			if(i1 >= 0)
	//* 139  273:iload           5
	//* 140  275:iflt            292
			{
				j2 = l1;
	//  141  278:iload           7
	//  142  280:istore          9
				if(k1 >= i1)
	//* 143  282:iload           6
	//* 144  284:iload           5
	//* 145  286:icmplt          292
					j2 = j;
	//  146  289:iload_2         
	//  147  290:istore          9
			}
			k1++;
	//  148  292:iload           6
	//  149  294:iconst_1        
	//  150  295:iadd            
	//  151  296:istore          6
			l1 = j2;
	//  152  298:iload           9
	//  153  300:istore          7
			obj = ((Object) (view));
	//  154  302:aload           12
	//  155  304:astore          11
		}

	//* 156  306:goto            85
		return j;
	//  157  309:iload_2         
	//  158  310:ireturn         
		if(true) goto _L4; else goto _L3
	//  159  311:goto            117
_L3:
	//* 160  314:goto            202
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
