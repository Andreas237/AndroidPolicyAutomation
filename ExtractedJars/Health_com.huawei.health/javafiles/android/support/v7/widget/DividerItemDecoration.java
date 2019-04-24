// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public class DividerItemDecoration extends RecyclerView.ItemDecoration
{

	public DividerItemDecoration(Context context, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void RecyclerView$ItemDecoration()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void Rect()>
	//    6   12:putfield        #31  <Field Rect mBounds>
		context = ((Context) (context.obtainStyledAttributes(ATTRS)));
	//    7   15:aload_1         
	//    8   16:getstatic       #21  <Field int[] ATTRS>
	//    9   19:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   10   22:astore_1        
		mDivider = ((TypedArray) (context)).getDrawable(0);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #43  <Method Drawable TypedArray.getDrawable(int)>
	//   15   29:putfield        #45  <Field Drawable mDivider>
		((TypedArray) (context)).recycle();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #48  <Method void TypedArray.recycle()>
		setOrientation(i);
	//   18   36:aload_0         
	//   19   37:iload_2         
	//   20   38:invokevirtual   #52  <Method void setOrientation(int)>
	//   21   41:return          
	}

	private void drawHorizontal(Canvas canvas, RecyclerView recyclerview)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method int Canvas.save()>
	//    2    4:pop             
		int i;
		int j;
		if(recyclerview.getClipToPadding())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #69  <Method boolean RecyclerView.getClipToPadding()>
	//*   5    9:ifeq            52
		{
			i = recyclerview.getPaddingTop();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #72  <Method int RecyclerView.getPaddingTop()>
	//    8   16:istore_3        
			j = recyclerview.getHeight() - recyclerview.getPaddingBottom();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #75  <Method int RecyclerView.getHeight()>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #78  <Method int RecyclerView.getPaddingBottom()>
	//   13   25:isub            
	//   14   26:istore          4
			canvas.clipRect(recyclerview.getPaddingLeft(), i, recyclerview.getWidth() - recyclerview.getPaddingRight(), j);
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #81  <Method int RecyclerView.getPaddingLeft()>
	//   18   33:iload_3         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #84  <Method int RecyclerView.getWidth()>
	//   21   38:aload_2         
	//   22   39:invokevirtual   #87  <Method int RecyclerView.getPaddingRight()>
	//   23   42:isub            
	//   24   43:iload           4
	//   25   45:invokevirtual   #91  <Method boolean Canvas.clipRect(int, int, int, int)>
	//   26   48:pop             
		} else
	//*  27   49:goto            60
		{
			i = 0;
	//   28   52:iconst_0        
	//   29   53:istore_3        
			j = recyclerview.getHeight();
	//   30   54:aload_2         
	//   31   55:invokevirtual   #75  <Method int RecyclerView.getHeight()>
	//   32   58:istore          4
		}
		int l = recyclerview.getChildCount();
	//   33   60:aload_2         
	//   34   61:invokevirtual   #94  <Method int RecyclerView.getChildCount()>
	//   35   64:istore          6
		for(int k = 0; k < l; k++)
	//*  36   66:iconst_0        
	//*  37   67:istore          5
	//*  38   69:iload           5
	//*  39   71:iload           6
	//*  40   73:icmpge          158
		{
			View view = recyclerview.getChildAt(k);
	//   41   76:aload_2         
	//   42   77:iload           5
	//   43   79:invokevirtual   #98  <Method View RecyclerView.getChildAt(int)>
	//   44   82:astore          9
			recyclerview.getLayoutManager().getDecoratedBoundsWithMargins(view, mBounds);
	//   45   84:aload_2         
	//   46   85:invokevirtual   #102 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   47   88:aload           9
	//   48   90:aload_0         
	//   49   91:getfield        #31  <Field Rect mBounds>
	//   50   94:invokevirtual   #108 <Method void RecyclerView$LayoutManager.getDecoratedBoundsWithMargins(View, Rect)>
			int i1 = mBounds.right + Math.round(view.getTranslationX());
	//   51   97:aload_0         
	//   52   98:getfield        #31  <Field Rect mBounds>
	//   53  101:getfield        #111 <Field int Rect.right>
	//   54  104:aload           9
	//   55  106:invokevirtual   #117 <Method float View.getTranslationX()>
	//   56  109:invokestatic    #123 <Method int Math.round(float)>
	//   57  112:iadd            
	//   58  113:istore          7
			int j1 = mDivider.getIntrinsicWidth();
	//   59  115:aload_0         
	//   60  116:getfield        #45  <Field Drawable mDivider>
	//   61  119:invokevirtual   #128 <Method int Drawable.getIntrinsicWidth()>
	//   62  122:istore          8
			mDivider.setBounds(i1 - j1, i, i1, j);
	//   63  124:aload_0         
	//   64  125:getfield        #45  <Field Drawable mDivider>
	//   65  128:iload           7
	//   66  130:iload           8
	//   67  132:isub            
	//   68  133:iload_3         
	//   69  134:iload           7
	//   70  136:iload           4
	//   71  138:invokevirtual   #132 <Method void Drawable.setBounds(int, int, int, int)>
			mDivider.draw(canvas);
	//   72  141:aload_0         
	//   73  142:getfield        #45  <Field Drawable mDivider>
	//   74  145:aload_1         
	//   75  146:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
		}

	//   76  149:iload           5
	//   77  151:iconst_1        
	//   78  152:iadd            
	//   79  153:istore          5
	//*  80  155:goto            69
		canvas.restore();
	//   81  158:aload_1         
	//   82  159:invokevirtual   #139 <Method void Canvas.restore()>
	//   83  162:return          
	}

	private void drawVertical(Canvas canvas, RecyclerView recyclerview)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method int Canvas.save()>
	//    2    4:pop             
		int i;
		int j;
		if(recyclerview.getClipToPadding())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #69  <Method boolean RecyclerView.getClipToPadding()>
	//*   5    9:ifeq            52
		{
			i = recyclerview.getPaddingLeft();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #81  <Method int RecyclerView.getPaddingLeft()>
	//    8   16:istore_3        
			j = recyclerview.getWidth() - recyclerview.getPaddingRight();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #84  <Method int RecyclerView.getWidth()>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #87  <Method int RecyclerView.getPaddingRight()>
	//   13   25:isub            
	//   14   26:istore          4
			canvas.clipRect(i, recyclerview.getPaddingTop(), j, recyclerview.getHeight() - recyclerview.getPaddingBottom());
	//   15   28:aload_1         
	//   16   29:iload_3         
	//   17   30:aload_2         
	//   18   31:invokevirtual   #72  <Method int RecyclerView.getPaddingTop()>
	//   19   34:iload           4
	//   20   36:aload_2         
	//   21   37:invokevirtual   #75  <Method int RecyclerView.getHeight()>
	//   22   40:aload_2         
	//   23   41:invokevirtual   #78  <Method int RecyclerView.getPaddingBottom()>
	//   24   44:isub            
	//   25   45:invokevirtual   #91  <Method boolean Canvas.clipRect(int, int, int, int)>
	//   26   48:pop             
		} else
	//*  27   49:goto            60
		{
			i = 0;
	//   28   52:iconst_0        
	//   29   53:istore_3        
			j = recyclerview.getWidth();
	//   30   54:aload_2         
	//   31   55:invokevirtual   #84  <Method int RecyclerView.getWidth()>
	//   32   58:istore          4
		}
		int l = recyclerview.getChildCount();
	//   33   60:aload_2         
	//   34   61:invokevirtual   #94  <Method int RecyclerView.getChildCount()>
	//   35   64:istore          6
		for(int k = 0; k < l; k++)
	//*  36   66:iconst_0        
	//*  37   67:istore          5
	//*  38   69:iload           5
	//*  39   71:iload           6
	//*  40   73:icmpge          155
		{
			View view = recyclerview.getChildAt(k);
	//   41   76:aload_2         
	//   42   77:iload           5
	//   43   79:invokevirtual   #98  <Method View RecyclerView.getChildAt(int)>
	//   44   82:astore          9
			recyclerview.getDecoratedBoundsWithMargins(view, mBounds);
	//   45   84:aload_2         
	//   46   85:aload           9
	//   47   87:aload_0         
	//   48   88:getfield        #31  <Field Rect mBounds>
	//   49   91:invokevirtual   #142 <Method void RecyclerView.getDecoratedBoundsWithMargins(View, Rect)>
			int i1 = mBounds.bottom + Math.round(view.getTranslationY());
	//   50   94:aload_0         
	//   51   95:getfield        #31  <Field Rect mBounds>
	//   52   98:getfield        #145 <Field int Rect.bottom>
	//   53  101:aload           9
	//   54  103:invokevirtual   #148 <Method float View.getTranslationY()>
	//   55  106:invokestatic    #123 <Method int Math.round(float)>
	//   56  109:iadd            
	//   57  110:istore          7
			int j1 = mDivider.getIntrinsicHeight();
	//   58  112:aload_0         
	//   59  113:getfield        #45  <Field Drawable mDivider>
	//   60  116:invokevirtual   #151 <Method int Drawable.getIntrinsicHeight()>
	//   61  119:istore          8
			mDivider.setBounds(i, i1 - j1, j, i1);
	//   62  121:aload_0         
	//   63  122:getfield        #45  <Field Drawable mDivider>
	//   64  125:iload_3         
	//   65  126:iload           7
	//   66  128:iload           8
	//   67  130:isub            
	//   68  131:iload           4
	//   69  133:iload           7
	//   70  135:invokevirtual   #132 <Method void Drawable.setBounds(int, int, int, int)>
			mDivider.draw(canvas);
	//   71  138:aload_0         
	//   72  139:getfield        #45  <Field Drawable mDivider>
	//   73  142:aload_1         
	//   74  143:invokevirtual   #136 <Method void Drawable.draw(Canvas)>
		}

	//   75  146:iload           5
	//   76  148:iconst_1        
	//   77  149:iadd            
	//   78  150:istore          5
	//*  79  152:goto            69
		canvas.restore();
	//   80  155:aload_1         
	//   81  156:invokevirtual   #139 <Method void Canvas.restore()>
	//   82  159:return          
	}

	public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, RecyclerView.State state)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          23
		{
			rect.set(0, 0, 0, mDivider.getIntrinsicHeight());
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:getfield        #45  <Field Drawable mDivider>
	//   10   16:invokevirtual   #151 <Method int Drawable.getIntrinsicHeight()>
	//   11   19:invokevirtual   #158 <Method void Rect.set(int, int, int, int)>
			return;
	//   12   22:return          
		} else
		{
			rect.set(0, 0, mDivider.getIntrinsicWidth(), 0);
	//   13   23:aload_1         
	//   14   24:iconst_0        
	//   15   25:iconst_0        
	//   16   26:aload_0         
	//   17   27:getfield        #45  <Field Drawable mDivider>
	//   18   30:invokevirtual   #128 <Method int Drawable.getIntrinsicWidth()>
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #158 <Method void Rect.set(int, int, int, int)>
			return;
	//   21   37:return          
		}
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, RecyclerView.State state)
	{
		if(recyclerview.getLayoutManager() == null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #102 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(mOrientation == 1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #155 <Field int mOrientation>
	//*   6   12:iconst_1        
	//*   7   13:icmpne          23
		{
			drawVertical(canvas, recyclerview);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #162 <Method void drawVertical(Canvas, RecyclerView)>
			return;
	//   12   22:return          
		} else
		{
			drawHorizontal(canvas, recyclerview);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokespecial   #164 <Method void drawHorizontal(Canvas, RecyclerView)>
			return;
	//   17   29:return          
		}
	}

	public void setDrawable(Drawable drawable)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Drawable cannot be null.");
	//    2    4:new             #169 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #171 <String "Drawable cannot be null.">
	//    5   10:invokespecial   #174 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			mDivider = drawable;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #45  <Field Drawable mDivider>
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
	//    5    9:new             #169 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #177 <String "Invalid orientation. It should be either HORIZONTAL or VERTICAL">
	//    8   15:invokespecial   #174 <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		} else
		{
			mOrientation = i;
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:putfield        #155 <Field int mOrientation>
			return;
	//   13   24:return          
		}
	}

	private static final int ATTRS[] = {
		0x1010214
	};
	public static final int HORIZONTAL = 0;
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
	//    4    5:ldc1            #19  <Int 0x1010214>
	//    5    7:iastore         
	//    6    8:putstatic       #21  <Field int[] ATTRS>
	//*   7   11:return          
	}
}
