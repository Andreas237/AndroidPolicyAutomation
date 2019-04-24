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
	static class GateKeeperDrawable extends DrawableWrapper
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
		if(listadapter == null || isInTouchMode())
	//*   3    6:aload           5
	//*   4    8:ifnull          18
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #120 <Method boolean isInTouchMode()>
	//*   7   15:ifeq            20
			return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
		int k = listadapter.getCount();
	//   10   20:aload           5
	//   11   22:invokeinterface #126 <Method int ListAdapter.getCount()>
	//   12   27:istore          4
		if(!getAdapter().areAllItemsEnabled())
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #117 <Method ListAdapter getAdapter()>
	//*  15   33:invokeinterface #129 <Method boolean ListAdapter.areAllItemsEnabled()>
	//*  16   38:ifne            128
		{
			int j;
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
						break;
	//   25   53:iload_1         
	//   26   54:iload           4
	//   27   56:icmpge          114
					j = i;
	//   28   59:iload_1         
	//   29   60:istore_3        
					if(listadapter.isEnabled(i))
						break;
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
			} else
			{
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
			}
			if(j < 0 || j >= k)
	//*  60  114:iload_3         
	//*  61  115:iflt            124
	//*  62  118:iload_3         
	//*  63  119:iload           4
	//*  64  121:icmplt          126
				return -1;
	//   65  124:iconst_m1       
	//   66  125:ireturn         
			else
				return j;
	//   67  126:iload_3         
	//   68  127:ireturn         
		}
		if(i < 0 || i >= k)
	//*  69  128:iload_1         
	//*  70  129:iflt            138
	//*  71  132:iload_1         
	//*  72  133:iload           4
	//*  73  135:icmplt          140
			return -1;
	//   74  138:iconst_m1       
	//   75  139:ireturn         
		else
			return i;
	//   76  140:iload_1         
	//   77  141:ireturn         
	}

	public int measureHeightOfChildrenCompat(int i, int j, int k, int l, int i1)
	{
		j = getListPaddingTop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method int getListPaddingTop()>
	//    2    4:istore_2        
		int j1 = getListPaddingBottom();
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
		Object obj = ((Object) (getDivider()));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #162 <Method Drawable getDivider()>
	//   17   30:astore          12
		ListAdapter listadapter = getAdapter();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #117 <Method ListAdapter getAdapter()>
	//   20   36:astore          15
		if(listadapter == null)
	//*  21   38:aload           15
	//*  22   40:ifnonnull       48
			return j + j1;
	//   23   43:iload_2         
	//   24   44:iload           6
	//   25   46:iadd            
	//   26   47:ireturn         
		j += j1;
	//   27   48:iload_2         
	//   28   49:iload           6
	//   29   51:iadd            
	//   30   52:istore_2        
		if(k <= 0 || obj == null)
	//*  31   53:iload_3         
	//*  32   54:ifle            65
	//*  33   57:aload           12
	//*  34   59:ifnull          65
	//*  35   62:goto            67
			k = 0;
	//   36   65:iconst_0        
	//   37   66:istore_3        
		int l1 = 0;
	//   38   67:iconst_0        
	//   39   68:istore          7
		obj = null;
	//   40   70:aconst_null     
	//   41   71:astore          12
		int j2 = 0;
	//   42   73:iconst_0        
	//   43   74:istore          9
		int l2 = listadapter.getCount();
	//   44   76:aload           15
	//   45   78:invokeinterface #126 <Method int ListAdapter.getCount()>
	//   46   83:istore          11
		for(int k1 = 0; k1 < l2;)
	//*  47   85:iconst_0        
	//*  48   86:istore          6
	//*  49   88:iload           6
	//*  50   90:iload           11
	//*  51   92:icmpge          311
		{
			int k2 = listadapter.getItemViewType(k1);
	//   52   95:aload           15
	//   53   97:iload           6
	//   54   99:invokeinterface #166 <Method int ListAdapter.getItemViewType(int)>
	//   55  104:istore          10
			int i2 = j2;
	//   56  106:iload           9
	//   57  108:istore          8
			if(k2 != j2)
	//*  58  110:iload           10
	//*  59  112:iload           9
	//*  60  114:icmpeq          124
			{
				obj = null;
	//   61  117:aconst_null     
	//   62  118:astore          12
				i2 = k2;
	//   63  120:iload           10
	//   64  122:istore          8
			}
			View view = listadapter.getView(k1, ((View) (obj)), ((android.view.ViewGroup) (this)));
	//   65  124:aload           15
	//   66  126:iload           6
	//   67  128:aload           12
	//   68  130:aload_0         
	//   69  131:invokeinterface #170 <Method View ListAdapter.getView(int, View, android.view.ViewGroup)>
	//   70  136:astore          13
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//   71  138:aload           13
	//   72  140:invokevirtual   #176 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   73  143:astore          14
			obj = ((Object) (layoutparams));
	//   74  145:aload           14
	//   75  147:astore          12
			if(layoutparams == null)
	//*  76  149:aload           14
	//*  77  151:ifnonnull       167
			{
				obj = ((Object) (generateDefaultLayoutParams()));
	//   78  154:aload_0         
	//   79  155:invokevirtual   #179 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//   80  158:astore          12
				view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   81  160:aload           13
	//   82  162:aload           12
	//   83  164:invokevirtual   #183 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			if(((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
	//*  84  167:aload           12
	//*  85  169:getfield        #188 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  86  172:ifle            190
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
	//   87  175:aload           12
	//   88  177:getfield        #188 <Field int android.view.ViewGroup$LayoutParams.height>
	//   89  180:ldc1            #189 <Int 0x40000000>
	//   90  182:invokestatic    #194 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   91  185:istore          9
			else
	//*  92  187:goto            197
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   93  190:iconst_0        
	//   94  191:iconst_0        
	//   95  192:invokestatic    #194 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   96  195:istore          9
			view.measure(i, j2);
	//   97  197:aload           13
	//   98  199:iload_1         
	//   99  200:iload           9
	//  100  202:invokevirtual   #198 <Method void View.measure(int, int)>
			view.forceLayout();
	//  101  205:aload           13
	//  102  207:invokevirtual   #201 <Method void View.forceLayout()>
			j2 = j;
	//  103  210:iload_2         
	//  104  211:istore          9
			if(k1 > 0)
	//* 105  213:iload           6
	//* 106  215:ifle            223
				j2 = j + k;
	//  107  218:iload_2         
	//  108  219:iload_3         
	//  109  220:iadd            
	//  110  221:istore          9
			j = j2 + view.getMeasuredHeight();
	//  111  223:iload           9
	//  112  225:aload           13
	//  113  227:invokevirtual   #204 <Method int View.getMeasuredHeight()>
	//  114  230:iadd            
	//  115  231:istore_2        
			if(j >= l)
	//* 116  232:iload_2         
	//* 117  233:iload           4
	//* 118  235:icmplt          267
				if(i1 >= 0 && k1 > i1 && l1 > 0 && j != l)
	//* 119  238:iload           5
	//* 120  240:iflt            264
	//* 121  243:iload           6
	//* 122  245:iload           5
	//* 123  247:icmple          264
	//* 124  250:iload           7
	//* 125  252:ifle            264
	//* 126  255:iload_2         
	//* 127  256:iload           4
	//* 128  258:icmpeq          264
					return l1;
	//  129  261:iload           7
	//  130  263:ireturn         
				else
					return l;
	//  131  264:iload           4
	//  132  266:ireturn         
			j2 = l1;
	//  133  267:iload           7
	//  134  269:istore          9
			if(i1 >= 0)
	//* 135  271:iload           5
	//* 136  273:iflt            290
			{
				j2 = l1;
	//  137  276:iload           7
	//  138  278:istore          9
				if(k1 >= i1)
	//* 139  280:iload           6
	//* 140  282:iload           5
	//* 141  284:icmplt          290
					j2 = j;
	//  142  287:iload_2         
	//  143  288:istore          9
			}
			k1++;
	//  144  290:iload           6
	//  145  292:iconst_1        
	//  146  293:iadd            
	//  147  294:istore          6
			l1 = j2;
	//  148  296:iload           9
	//  149  298:istore          7
			obj = ((Object) (view));
	//  150  300:aload           13
	//  151  302:astore          12
			j2 = i2;
	//  152  304:iload           8
	//  153  306:istore          9
		}

	//* 154  308:goto            88
		return j;
	//  155  311:iload_2         
	//  156  312:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		switch(motionevent.getAction())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #211 <Method int MotionEvent.getAction()>
		{
	//*   2    4:lookupswitch    1: default 24
	//	               0: 27
	//*   3   24:goto            45
		case 0: // '\0'
			mMotionPosition = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//    4   27:aload_0         
	//    5   28:aload_0         
	//    6   29:aload_1         
	//    7   30:invokevirtual   #215 <Method float MotionEvent.getX()>
	//    8   33:f2i             
	//    9   34:aload_1         
	//   10   35:invokevirtual   #218 <Method float MotionEvent.getY()>
	//   11   38:f2i             
	//   12   39:invokevirtual   #221 <Method int pointToPosition(int, int)>
	//   13   42:putfield        #223 <Field int mMotionPosition>
			break;
		}
		return super.onTouchEvent(motionevent);
	//   14   45:aload_0         
	//   15   46:aload_1         
	//   16   47:invokespecial   #225 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//   17   50:ireturn         
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
			break MISSING_BLOCK_LABEL_136;
	//   46   96:aload_2         
	//   47   97:invokevirtual   #263 <Method boolean View.isEnabled()>
	//   48  100:iload_3         
	//   49  101:icmpeq          136
		view = ((View) (mIsChildViewEnabled));
	//   50  104:aload_0         
	//   51  105:getfield        #69  <Field Field mIsChildViewEnabled>
	//   52  108:astore_2        
		if(!flag)
	//*  53  109:iload_3         
	//*  54  110:ifne            143
			flag = true;
	//   55  113:iconst_1        
	//   56  114:istore_3        
		else
	//*  57  115:goto            118
	//*  58  118:aload_2         
	//*  59  119:aload_0         
	//*  60  120:iload_3         
	//*  61  121:invokestatic    #269 <Method Boolean Boolean.valueOf(boolean)>
	//*  62  124:invokevirtual   #272 <Method void Field.set(Object, Object)>
	//*  63  127:iload_1         
	//*  64  128:iconst_m1       
	//*  65  129:icmpeq          136
	//*  66  132:aload_0         
	//*  67  133:invokevirtual   #275 <Method void refreshDrawableState()>
	//*  68  136:return          
	//*  69  137:astore_2        
	//*  70  138:aload_2         
	//*  71  139:invokevirtual   #276 <Method void IllegalAccessException.printStackTrace()>
	//*  72  142:return          
			flag = false;
	//   73  143:iconst_0        
	//   74  144:istore_3        
		try
		{
			((Field) (view)).set(((Object) (this)), ((Object) (Boolean.valueOf(flag))));
		}
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			((IllegalAccessException) (view)).printStackTrace();
			return;
		}
		if(i == -1)
			break MISSING_BLOCK_LABEL_136;
		refreshDrawableState();
	//*  75  145:goto            118
	}

	protected void positionSelectorLikeFocusCompat(int i, View view)
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method Drawable getSelector()>
	//    2    4:astore          7
		boolean flag;
		if(drawable != null && i != -1)
	//*   3    6:aload           7
	//*   4    8:ifnull          22
	//*   5   11:iload_1         
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          22
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore          5
		else
	//*  10   19:goto            25
			flag = false;
	//   11   22:iconst_0        
	//   12   23:istore          5
		if(flag)
	//*  13   25:iload           5
	//*  14   27:ifeq            38
			drawable.setVisible(false, false);
	//   15   30:aload           7
	//   16   32:iconst_0        
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #281 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   19   37:pop             
		positionSelectorCompat(i, view);
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #283 <Method void positionSelectorCompat(int, View)>
		if(flag)
	//*  24   44:iload           5
	//*  25   46:ifeq            98
		{
			view = ((View) (mSelectorRect));
	//   26   49:aload_0         
	//   27   50:getfield        #50  <Field Rect mSelectorRect>
	//   28   53:astore_2        
			float f = ((Rect) (view)).exactCenterX();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #286 <Method float Rect.exactCenterX()>
	//   31   58:fstore_3        
			float f1 = ((Rect) (view)).exactCenterY();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #289 <Method float Rect.exactCenterY()>
	//   34   63:fstore          4
			boolean flag1;
			if(getVisibility() == 0)
	//*  35   65:aload_0         
	//*  36   66:invokevirtual   #292 <Method int getVisibility()>
	//*  37   69:ifne            78
				flag1 = true;
	//   38   72:iconst_1        
	//   39   73:istore          6
			else
	//*  40   75:goto            81
				flag1 = false;
	//   41   78:iconst_0        
	//   42   79:istore          6
			drawable.setVisible(flag1, false);
	//   43   81:aload           7
	//   44   83:iload           6
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #281 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   47   89:pop             
			DrawableCompat.setHotspot(drawable, f, f1);
	//   48   90:aload           7
	//   49   92:fload_3         
	//   50   93:fload           4
	//   51   95:invokestatic    #298 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
		}
	//   52   98:return          
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
	//*   1    1:ifnull          16
			obj = ((Object) (new GateKeeperDrawable(drawable)));
	//    2    4:new             #6   <Class ListViewCompat$GateKeeperDrawable>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #306 <Method void ListViewCompat$GateKeeperDrawable(Drawable)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		mSelector = ((GateKeeperDrawable) (obj));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #308 <Field ListViewCompat$GateKeeperDrawable mSelector>
		super.setSelector(((Drawable) (mSelector)));
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #308 <Field ListViewCompat$GateKeeperDrawable mSelector>
	//   16   28:invokespecial   #310 <Method void ListView.setSelector(Drawable)>
		obj = ((Object) (new Rect()));
	//   17   31:new             #46  <Class Rect>
	//   18   34:dup             
	//   19   35:invokespecial   #48  <Method void Rect()>
	//   20   38:astore_2        
		if(drawable != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          49
			drawable.getPadding(((Rect) (obj)));
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #314 <Method boolean Drawable.getPadding(Rect)>
	//   26   48:pop             
		mSelectionLeftPadding = ((Rect) (obj)).left;
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:getfield        #248 <Field int Rect.left>
	//   30   54:putfield        #52  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = ((Rect) (obj)).top;
	//   31   57:aload_0         
	//   32   58:aload_2         
	//   33   59:getfield        #251 <Field int Rect.top>
	//   34   62:putfield        #54  <Field int mSelectionTopPadding>
		mSelectionRightPadding = ((Rect) (obj)).right;
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:getfield        #254 <Field int Rect.right>
	//   38   70:putfield        #56  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = ((Rect) (obj)).bottom;
	//   39   73:aload_0         
	//   40   74:aload_2         
	//   41   75:getfield        #257 <Field int Rect.bottom>
	//   42   78:putfield        #58  <Field int mSelectionBottomPadding>
	//   43   81:return          
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
