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
		int i;
		int j;
		int l;
		if(recyclerview.getClipToPadding())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #78  <Method boolean RecyclerView.getClipToPadding()>
	//*   5    9:ifeq            147
		{
			j = recyclerview.getPaddingTop();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #81  <Method int RecyclerView.getPaddingTop()>
	//    8   16:istore          4
			i = recyclerview.getHeight() - recyclerview.getPaddingBottom();
	//    9   18:aload_2         
	//   10   19:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   11   22:aload_2         
	//   12   23:invokevirtual   #87  <Method int RecyclerView.getPaddingBottom()>
	//   13   26:isub            
	//   14   27:istore_3        
			canvas.clipRect(recyclerview.getPaddingLeft(), j, recyclerview.getWidth() - recyclerview.getPaddingRight(), i);
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #90  <Method int RecyclerView.getPaddingLeft()>
	//   18   33:iload           4
	//   19   35:aload_2         
	//   20   36:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   21   39:aload_2         
	//   22   40:invokevirtual   #96  <Method int RecyclerView.getPaddingRight()>
	//   23   43:isub            
	//   24   44:iload_3         
	//   25   45:invokevirtual   #100 <Method boolean Canvas.clipRect(int, int, int, int)>
	//   26   48:pop             
		} else
	//*  27   49:aload_2         
	//*  28   50:invokevirtual   #103 <Method int RecyclerView.getChildCount()>
	//*  29   53:istore          6
	//*  30   55:iconst_0        
	//*  31   56:istore          5
	//*  32   58:iload           5
	//*  33   60:iload           6
	//*  34   62:icmpge          158
	//*  35   65:aload_2         
	//*  36   66:iload           5
	//*  37   68:invokevirtual   #107 <Method View RecyclerView.getChildAt(int)>
	//*  38   71:astore          9
	//*  39   73:aload_2         
	//*  40   74:invokevirtual   #111 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  41   77:aload           9
	//*  42   79:aload_0         
	//*  43   80:getfield        #35  <Field Rect mBounds>
	//*  44   83:invokevirtual   #117 <Method void RecyclerView$LayoutManager.getDecoratedBoundsWithMargins(View, Rect)>
	//*  45   86:aload_0         
	//*  46   87:getfield        #35  <Field Rect mBounds>
	//*  47   90:getfield        #120 <Field int Rect.right>
	//*  48   93:aload           9
	//*  49   95:invokevirtual   #126 <Method float View.getTranslationX()>
	//*  50   98:invokestatic    #132 <Method int Math.round(float)>
	//*  51  101:iadd            
	//*  52  102:istore          7
	//*  53  104:aload_0         
	//*  54  105:getfield        #49  <Field Drawable mDivider>
	//*  55  108:invokevirtual   #137 <Method int Drawable.getIntrinsicWidth()>
	//*  56  111:istore          8
	//*  57  113:aload_0         
	//*  58  114:getfield        #49  <Field Drawable mDivider>
	//*  59  117:iload           7
	//*  60  119:iload           8
	//*  61  121:isub            
	//*  62  122:iload           4
	//*  63  124:iload           7
	//*  64  126:iload_3         
	//*  65  127:invokevirtual   #141 <Method void Drawable.setBounds(int, int, int, int)>
	//*  66  130:aload_0         
	//*  67  131:getfield        #49  <Field Drawable mDivider>
	//*  68  134:aload_1         
	//*  69  135:invokevirtual   #145 <Method void Drawable.draw(Canvas)>
	//*  70  138:iload           5
	//*  71  140:iconst_1        
	//*  72  141:iadd            
	//*  73  142:istore          5
	//*  74  144:goto            58
		{
			j = 0;
	//   75  147:iconst_0        
	//   76  148:istore          4
			i = recyclerview.getHeight();
	//   77  150:aload_2         
	//   78  151:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   79  154:istore_3        
		}
		l = recyclerview.getChildCount();
		for(int k = 0; k < l; k++)
		{
			View view = recyclerview.getChildAt(k);
			recyclerview.getLayoutManager().getDecoratedBoundsWithMargins(view, mBounds);
			int i1 = mBounds.right + Math.round(view.getTranslationX());
			int j1 = mDivider.getIntrinsicWidth();
			mDivider.setBounds(i1 - j1, j, i1, i);
			mDivider.draw(canvas);
		}

	//*  80  155:goto            49
		canvas.restore();
	//   81  158:aload_1         
	//   82  159:invokevirtual   #148 <Method void Canvas.restore()>
	//   83  162:return          
	}

	private void drawVertical(Canvas canvas, RecyclerView recyclerview)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method int Canvas.save()>
	//    2    4:pop             
		int i;
		int j;
		int l;
		if(recyclerview.getClipToPadding())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #78  <Method boolean RecyclerView.getClipToPadding()>
	//*   5    9:ifeq            144
		{
			i = recyclerview.getPaddingLeft();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #90  <Method int RecyclerView.getPaddingLeft()>
	//    8   16:istore_3        
			j = recyclerview.getWidth() - recyclerview.getPaddingRight();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #96  <Method int RecyclerView.getPaddingRight()>
	//   13   25:isub            
	//   14   26:istore          4
			canvas.clipRect(i, recyclerview.getPaddingTop(), j, recyclerview.getHeight() - recyclerview.getPaddingBottom());
	//   15   28:aload_1         
	//   16   29:iload_3         
	//   17   30:aload_2         
	//   18   31:invokevirtual   #81  <Method int RecyclerView.getPaddingTop()>
	//   19   34:iload           4
	//   20   36:aload_2         
	//   21   37:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   22   40:aload_2         
	//   23   41:invokevirtual   #87  <Method int RecyclerView.getPaddingBottom()>
	//   24   44:isub            
	//   25   45:invokevirtual   #100 <Method boolean Canvas.clipRect(int, int, int, int)>
	//   26   48:pop             
		} else
	//*  27   49:aload_2         
	//*  28   50:invokevirtual   #103 <Method int RecyclerView.getChildCount()>
	//*  29   53:istore          6
	//*  30   55:iconst_0        
	//*  31   56:istore          5
	//*  32   58:iload           5
	//*  33   60:iload           6
	//*  34   62:icmpge          155
	//*  35   65:aload_2         
	//*  36   66:iload           5
	//*  37   68:invokevirtual   #107 <Method View RecyclerView.getChildAt(int)>
	//*  38   71:astore          9
	//*  39   73:aload_2         
	//*  40   74:aload           9
	//*  41   76:aload_0         
	//*  42   77:getfield        #35  <Field Rect mBounds>
	//*  43   80:invokevirtual   #150 <Method void RecyclerView.getDecoratedBoundsWithMargins(View, Rect)>
	//*  44   83:aload_0         
	//*  45   84:getfield        #35  <Field Rect mBounds>
	//*  46   87:getfield        #153 <Field int Rect.bottom>
	//*  47   90:aload           9
	//*  48   92:invokevirtual   #156 <Method float View.getTranslationY()>
	//*  49   95:invokestatic    #132 <Method int Math.round(float)>
	//*  50   98:iadd            
	//*  51   99:istore          7
	//*  52  101:aload_0         
	//*  53  102:getfield        #49  <Field Drawable mDivider>
	//*  54  105:invokevirtual   #159 <Method int Drawable.getIntrinsicHeight()>
	//*  55  108:istore          8
	//*  56  110:aload_0         
	//*  57  111:getfield        #49  <Field Drawable mDivider>
	//*  58  114:iload_3         
	//*  59  115:iload           7
	//*  60  117:iload           8
	//*  61  119:isub            
	//*  62  120:iload           4
	//*  63  122:iload           7
	//*  64  124:invokevirtual   #141 <Method void Drawable.setBounds(int, int, int, int)>
	//*  65  127:aload_0         
	//*  66  128:getfield        #49  <Field Drawable mDivider>
	//*  67  131:aload_1         
	//*  68  132:invokevirtual   #145 <Method void Drawable.draw(Canvas)>
	//*  69  135:iload           5
	//*  70  137:iconst_1        
	//*  71  138:iadd            
	//*  72  139:istore          5
	//*  73  141:goto            58
		{
			i = 0;
	//   74  144:iconst_0        
	//   75  145:istore_3        
			j = recyclerview.getWidth();
	//   76  146:aload_2         
	//   77  147:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   78  150:istore          4
		}
		l = recyclerview.getChildCount();
		for(int k = 0; k < l; k++)
		{
			View view = recyclerview.getChildAt(k);
			recyclerview.getDecoratedBoundsWithMargins(view, mBounds);
			int i1 = mBounds.bottom + Math.round(view.getTranslationY());
			int j1 = mDivider.getIntrinsicHeight();
			mDivider.setBounds(i, i1 - j1, j, i1);
			mDivider.draw(canvas);
		}

	//*  79  152:goto            49
		canvas.restore();
	//   80  155:aload_1         
	//   81  156:invokevirtual   #148 <Method void Canvas.restore()>
	//   82  159:return          
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
		if(recyclerview.getLayoutManager() == null || mDivider == null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #111 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*   2    4:ifnull          14
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
