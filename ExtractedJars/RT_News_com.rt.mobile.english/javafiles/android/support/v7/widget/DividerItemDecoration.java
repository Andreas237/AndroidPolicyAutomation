// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public class DividerItemDecoration extends RecyclerView.ItemDecoration
{

	public DividerItemDecoration(Context context, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void RecyclerView$ItemDecoration()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Rect()>
	//    6   12:putfield        #35  <Field Rect mBounds>
		context = ((Context) (context.obtainStyledAttributes(ATTRS)));
	//    7   15:aload_1         
	//    8   16:getstatic       #25  <Field int[] ATTRS>
	//    9   19:invokevirtual   #41  <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   10   22:astore_1        
		mDivider = ((TypedArray) (context)).getDrawable(0);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #47  <Method Drawable TypedArray.getDrawable(int)>
	//   15   29:putfield        #49  <Field Drawable mDivider>
		if(mDivider == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #49  <Field Drawable mDivider>
	//*  18   36:ifnonnull       47
			Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
	//   19   39:ldc1            #13  <String "DividerItem">
	//   20   41:ldc1            #51  <String "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()">
	//   21   43:invokestatic    #57  <Method int Log.w(String, String)>
	//   22   46:pop             
		((TypedArray) (context)).recycle();
	//   23   47:aload_1         
	//   24   48:invokevirtual   #60  <Method void TypedArray.recycle()>
		setOrientation(i);
	//   25   51:aload_0         
	//   26   52:iload_2         
	//   27   53:invokevirtual   #64  <Method void setOrientation(int)>
	//   28   56:return          
	}

	private void drawHorizontal(Canvas canvas, RecyclerView recyclerview)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method int Canvas.save()>
	//    2    4:pop             
		boolean flag = recyclerview.getClipToPadding();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #78  <Method boolean RecyclerView.getClipToPadding()>
	//    5    9:istore          9
		int k = 0;
	//    6   11:iconst_0        
	//    7   12:istore          5
		int i;
		int j;
		if(flag)
	//*   8   14:iload           9
	//*   9   16:ifeq            59
		{
			i = recyclerview.getPaddingTop();
	//   10   19:aload_2         
	//   11   20:invokevirtual   #81  <Method int RecyclerView.getPaddingTop()>
	//   12   23:istore_3        
			j = recyclerview.getHeight() - recyclerview.getPaddingBottom();
	//   13   24:aload_2         
	//   14   25:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   15   28:aload_2         
	//   16   29:invokevirtual   #87  <Method int RecyclerView.getPaddingBottom()>
	//   17   32:isub            
	//   18   33:istore          4
			canvas.clipRect(recyclerview.getPaddingLeft(), i, recyclerview.getWidth() - recyclerview.getPaddingRight(), j);
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #90  <Method int RecyclerView.getPaddingLeft()>
	//   22   40:iload_3         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   25   45:aload_2         
	//   26   46:invokevirtual   #96  <Method int RecyclerView.getPaddingRight()>
	//   27   49:isub            
	//   28   50:iload           4
	//   29   52:invokevirtual   #100 <Method boolean Canvas.clipRect(int, int, int, int)>
	//   30   55:pop             
		} else
	//*  31   56:goto            67
		{
			j = recyclerview.getHeight();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   34   63:istore          4
			i = 0;
	//   35   65:iconst_0        
	//   36   66:istore_3        
		}
		for(int l = recyclerview.getChildCount(); k < l; k++)
	//*  37   67:aload_2         
	//*  38   68:invokevirtual   #103 <Method int RecyclerView.getChildCount()>
	//*  39   71:istore          6
	//*  40   73:iload           5
	//*  41   75:iload           6
	//*  42   77:icmpge          162
		{
			View view = recyclerview.getChildAt(k);
	//   43   80:aload_2         
	//   44   81:iload           5
	//   45   83:invokevirtual   #107 <Method View RecyclerView.getChildAt(int)>
	//   46   86:astore          10
			recyclerview.getLayoutManager().getDecoratedBoundsWithMargins(view, mBounds);
	//   47   88:aload_2         
	//   48   89:invokevirtual   #111 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   49   92:aload           10
	//   50   94:aload_0         
	//   51   95:getfield        #35  <Field Rect mBounds>
	//   52   98:invokevirtual   #117 <Method void RecyclerView$LayoutManager.getDecoratedBoundsWithMargins(View, Rect)>
			int i1 = mBounds.right + Math.round(view.getTranslationX());
	//   53  101:aload_0         
	//   54  102:getfield        #35  <Field Rect mBounds>
	//   55  105:getfield        #120 <Field int Rect.right>
	//   56  108:aload           10
	//   57  110:invokevirtual   #126 <Method float View.getTranslationX()>
	//   58  113:invokestatic    #132 <Method int Math.round(float)>
	//   59  116:iadd            
	//   60  117:istore          7
			int j1 = mDivider.getIntrinsicWidth();
	//   61  119:aload_0         
	//   62  120:getfield        #49  <Field Drawable mDivider>
	//   63  123:invokevirtual   #137 <Method int Drawable.getIntrinsicWidth()>
	//   64  126:istore          8
			mDivider.setBounds(i1 - j1, i, i1, j);
	//   65  128:aload_0         
	//   66  129:getfield        #49  <Field Drawable mDivider>
	//   67  132:iload           7
	//   68  134:iload           8
	//   69  136:isub            
	//   70  137:iload_3         
	//   71  138:iload           7
	//   72  140:iload           4
	//   73  142:invokevirtual   #141 <Method void Drawable.setBounds(int, int, int, int)>
			mDivider.draw(canvas);
	//   74  145:aload_0         
	//   75  146:getfield        #49  <Field Drawable mDivider>
	//   76  149:aload_1         
	//   77  150:invokevirtual   #145 <Method void Drawable.draw(Canvas)>
		}

	//   78  153:iload           5
	//   79  155:iconst_1        
	//   80  156:iadd            
	//   81  157:istore          5
	//*  82  159:goto            73
		canvas.restore();
	//   83  162:aload_1         
	//   84  163:invokevirtual   #148 <Method void Canvas.restore()>
	//   85  166:return          
	}

	private void drawVertical(Canvas canvas, RecyclerView recyclerview)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method int Canvas.save()>
	//    2    4:pop             
		boolean flag = recyclerview.getClipToPadding();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #78  <Method boolean RecyclerView.getClipToPadding()>
	//    5    9:istore          9
		int k = 0;
	//    6   11:iconst_0        
	//    7   12:istore          5
		int i;
		int j;
		if(flag)
	//*   8   14:iload           9
	//*   9   16:ifeq            59
		{
			i = recyclerview.getPaddingLeft();
	//   10   19:aload_2         
	//   11   20:invokevirtual   #90  <Method int RecyclerView.getPaddingLeft()>
	//   12   23:istore_3        
			j = recyclerview.getWidth() - recyclerview.getPaddingRight();
	//   13   24:aload_2         
	//   14   25:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   15   28:aload_2         
	//   16   29:invokevirtual   #96  <Method int RecyclerView.getPaddingRight()>
	//   17   32:isub            
	//   18   33:istore          4
			canvas.clipRect(i, recyclerview.getPaddingTop(), j, recyclerview.getHeight() - recyclerview.getPaddingBottom());
	//   19   35:aload_1         
	//   20   36:iload_3         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #81  <Method int RecyclerView.getPaddingTop()>
	//   23   41:iload           4
	//   24   43:aload_2         
	//   25   44:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   26   47:aload_2         
	//   27   48:invokevirtual   #87  <Method int RecyclerView.getPaddingBottom()>
	//   28   51:isub            
	//   29   52:invokevirtual   #100 <Method boolean Canvas.clipRect(int, int, int, int)>
	//   30   55:pop             
		} else
	//*  31   56:goto            67
		{
			j = recyclerview.getWidth();
	//   32   59:aload_2         
	//   33   60:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   34   63:istore          4
			i = 0;
	//   35   65:iconst_0        
	//   36   66:istore_3        
		}
		for(int l = recyclerview.getChildCount(); k < l; k++)
	//*  37   67:aload_2         
	//*  38   68:invokevirtual   #103 <Method int RecyclerView.getChildCount()>
	//*  39   71:istore          6
	//*  40   73:iload           5
	//*  41   75:iload           6
	//*  42   77:icmpge          159
		{
			View view = recyclerview.getChildAt(k);
	//   43   80:aload_2         
	//   44   81:iload           5
	//   45   83:invokevirtual   #107 <Method View RecyclerView.getChildAt(int)>
	//   46   86:astore          10
			recyclerview.getDecoratedBoundsWithMargins(view, mBounds);
	//   47   88:aload_2         
	//   48   89:aload           10
	//   49   91:aload_0         
	//   50   92:getfield        #35  <Field Rect mBounds>
	//   51   95:invokevirtual   #150 <Method void RecyclerView.getDecoratedBoundsWithMargins(View, Rect)>
			int i1 = mBounds.bottom + Math.round(view.getTranslationY());
	//   52   98:aload_0         
	//   53   99:getfield        #35  <Field Rect mBounds>
	//   54  102:getfield        #153 <Field int Rect.bottom>
	//   55  105:aload           10
	//   56  107:invokevirtual   #156 <Method float View.getTranslationY()>
	//   57  110:invokestatic    #132 <Method int Math.round(float)>
	//   58  113:iadd            
	//   59  114:istore          7
			int j1 = mDivider.getIntrinsicHeight();
	//   60  116:aload_0         
	//   61  117:getfield        #49  <Field Drawable mDivider>
	//   62  120:invokevirtual   #159 <Method int Drawable.getIntrinsicHeight()>
	//   63  123:istore          8
			mDivider.setBounds(i, i1 - j1, j, i1);
	//   64  125:aload_0         
	//   65  126:getfield        #49  <Field Drawable mDivider>
	//   66  129:iload_3         
	//   67  130:iload           7
	//   68  132:iload           8
	//   69  134:isub            
	//   70  135:iload           4
	//   71  137:iload           7
	//   72  139:invokevirtual   #141 <Method void Drawable.setBounds(int, int, int, int)>
			mDivider.draw(canvas);
	//   73  142:aload_0         
	//   74  143:getfield        #49  <Field Drawable mDivider>
	//   75  146:aload_1         
	//   76  147:invokevirtual   #145 <Method void Drawable.draw(Canvas)>
		}

	//   77  150:iload           5
	//   78  152:iconst_1        
	//   79  153:iadd            
	//   80  154:istore          5
	//*  81  156:goto            73
		canvas.restore();
	//   82  159:aload_1         
	//   83  160:invokevirtual   #148 <Method void Canvas.restore()>
	//   84  163:return          
	}

	public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, RecyclerView.State state)
	{
		if(mDivider == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field Drawable mDivider>
	//*   2    4:ifnonnull       16
		{
			rect.set(0, 0, 0, 0);
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #164 <Method void Rect.set(int, int, int, int)>
			return;
	//    9   15:return          
		}
		if(mOrientation == 1)
	//*  10   16:aload_0         
	//*  11   17:getfield        #166 <Field int mOrientation>
	//*  12   20:iconst_1        
	//*  13   21:icmpne          39
		{
			rect.set(0, 0, 0, mDivider.getIntrinsicHeight());
	//   14   24:aload_1         
	//   15   25:iconst_0        
	//   16   26:iconst_0        
	//   17   27:iconst_0        
	//   18   28:aload_0         
	//   19   29:getfield        #49  <Field Drawable mDivider>
	//   20   32:invokevirtual   #159 <Method int Drawable.getIntrinsicHeight()>
	//   21   35:invokevirtual   #164 <Method void Rect.set(int, int, int, int)>
			return;
	//   22   38:return          
		} else
		{
			rect.set(0, 0, mDivider.getIntrinsicWidth(), 0);
	//   23   39:aload_1         
	//   24   40:iconst_0        
	//   25   41:iconst_0        
	//   26   42:aload_0         
	//   27   43:getfield        #49  <Field Drawable mDivider>
	//   28   46:invokevirtual   #137 <Method int Drawable.getIntrinsicWidth()>
	//   29   49:iconst_0        
	//   30   50:invokevirtual   #164 <Method void Rect.set(int, int, int, int)>
			return;
	//   31   53:return          
		}
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, RecyclerView.State state)
	{
		if(recyclerview.getLayoutManager() != null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #111 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*   2    4:ifnull          37
		{
			if(mDivider == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field Drawable mDivider>
	//*   5   11:ifnonnull       15
				return;
	//    6   14:return          
			if(mOrientation == 1)
	//*   7   15:aload_0         
	//*   8   16:getfield        #166 <Field int mOrientation>
	//*   9   19:iconst_1        
	//*  10   20:icmpne          30
			{
				drawVertical(canvas, recyclerview);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokespecial   #170 <Method void drawVertical(Canvas, RecyclerView)>
				return;
	//   15   29:return          
			} else
			{
				drawHorizontal(canvas, recyclerview);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokespecial   #172 <Method void drawHorizontal(Canvas, RecyclerView)>
				return;
	//   20   36:return          
			}
		} else
		{
			return;
	//   21   37:return          
		}
	}

	public void setDrawable(Drawable drawable)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Drawable cannot be null.");
	//    2    4:new             #177 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #179 <String "Drawable cannot be null.">
	//    5   10:invokespecial   #182 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			mDivider = drawable;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #49  <Field Drawable mDivider>
			return;
	//   10   19:return          
		}
	}

	public void setOrientation(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          19
		{
			throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
	//    5    9:new             #177 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #185 <String "Invalid orientation. It should be either HORIZONTAL or VERTICAL">
	//    8   15:invokespecial   #182 <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		} else
		{
			mOrientation = i;
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:putfield        #166 <Field int mOrientation>
			return;
	//   13   24:return          
		}
	}

	private static final int ATTRS[] = {
		0x1010214
	};
	public static final int HORIZONTAL = 0;
	private static final String TAG = "DividerItem";
	public static final int VERTICAL = 1;
	private final Rect mBounds = new Rect();
	private Drawable mDivider;
	private int mOrientation;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #23  <Int 0x1010214>
	//    5    7:iastore         
	//    6    8:putstatic       #25  <Field int[] ATTRS>
	//*   7   11:return          
	}
}
