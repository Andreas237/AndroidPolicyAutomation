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
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		canvas.save();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #72  <Method int Canvas.save()>
	//    4    7:pop             
		int i;
		int j;
		int l;
		if(recyclerview.getClipToPadding())
	//*   5    8:aload_2         
	//*   6    9:invokevirtual   #78  <Method boolean RecyclerView.getClipToPadding()>
	//*   7   12:ifeq            151
		{
			j = recyclerview.getPaddingTop();
	//    8   15:aload_2         
	//    9   16:invokevirtual   #81  <Method int RecyclerView.getPaddingTop()>
	//   10   19:istore          4
			i = recyclerview.getHeight() - recyclerview.getPaddingBottom();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #87  <Method int RecyclerView.getPaddingBottom()>
	//   15   29:isub            
	//   16   30:istore_3        
			canvas.clipRect(recyclerview.getPaddingLeft(), j, recyclerview.getWidth() - recyclerview.getPaddingRight(), i);
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #90  <Method int RecyclerView.getPaddingLeft()>
	//   20   36:iload           4
	//   21   38:aload_2         
	//   22   39:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   23   42:aload_2         
	//   24   43:invokevirtual   #96  <Method int RecyclerView.getPaddingRight()>
	//   25   46:isub            
	//   26   47:iload_3         
	//   27   48:invokevirtual   #100 <Method boolean Canvas.clipRect(int, int, int, int)>
	//   28   51:pop             
		} else
	//*  29   52:aload_2         
	//*  30   53:invokevirtual   #103 <Method int RecyclerView.getChildCount()>
	//*  31   56:istore          6
	//*  32   58:iload           5
	//*  33   60:iload           6
	//*  34   62:icmpge          162
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
	//*  48   93:istore          7
	//*  49   95:aload           9
	//*  50   97:invokevirtual   #126 <Method float View.getTranslationX()>
	//*  51  100:invokestatic    #132 <Method int Math.round(float)>
	//*  52  103:iload           7
	//*  53  105:iadd            
	//*  54  106:istore          7
	//*  55  108:aload_0         
	//*  56  109:getfield        #49  <Field Drawable mDivider>
	//*  57  112:invokevirtual   #137 <Method int Drawable.getIntrinsicWidth()>
	//*  58  115:istore          8
	//*  59  117:aload_0         
	//*  60  118:getfield        #49  <Field Drawable mDivider>
	//*  61  121:iload           7
	//*  62  123:iload           8
	//*  63  125:isub            
	//*  64  126:iload           4
	//*  65  128:iload           7
	//*  66  130:iload_3         
	//*  67  131:invokevirtual   #141 <Method void Drawable.setBounds(int, int, int, int)>
	//*  68  134:aload_0         
	//*  69  135:getfield        #49  <Field Drawable mDivider>
	//*  70  138:aload_1         
	//*  71  139:invokevirtual   #145 <Method void Drawable.draw(Canvas)>
	//*  72  142:iload           5
	//*  73  144:iconst_1        
	//*  74  145:iadd            
	//*  75  146:istore          5
	//*  76  148:goto            58
		{
			i = recyclerview.getHeight();
	//   77  151:aload_2         
	//   78  152:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   79  155:istore_3        
			j = 0;
	//   80  156:iconst_0        
	//   81  157:istore          4
		}
		for(l = recyclerview.getChildCount(); k < l; k++)
		{
			View view = recyclerview.getChildAt(k);
			recyclerview.getLayoutManager().getDecoratedBoundsWithMargins(view, mBounds);
			int i1 = mBounds.right;
			i1 = Math.round(view.getTranslationX()) + i1;
			int j1 = mDivider.getIntrinsicWidth();
			mDivider.setBounds(i1 - j1, j, i1, i);
			mDivider.draw(canvas);
		}

	//*  82  159:goto            52
		canvas.restore();
	//   83  162:aload_1         
	//   84  163:invokevirtual   #148 <Method void Canvas.restore()>
	//   85  166:return          
	}

	private void drawVertical(Canvas canvas, RecyclerView recyclerview)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		canvas.save();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #72  <Method int Canvas.save()>
	//    4    7:pop             
		int i;
		int j;
		int l;
		if(recyclerview.getClipToPadding())
	//*   5    8:aload_2         
	//*   6    9:invokevirtual   #78  <Method boolean RecyclerView.getClipToPadding()>
	//*   7   12:ifeq            148
		{
			j = recyclerview.getPaddingLeft();
	//    8   15:aload_2         
	//    9   16:invokevirtual   #90  <Method int RecyclerView.getPaddingLeft()>
	//   10   19:istore          4
			i = recyclerview.getWidth() - recyclerview.getPaddingRight();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #96  <Method int RecyclerView.getPaddingRight()>
	//   15   29:isub            
	//   16   30:istore_3        
			canvas.clipRect(j, recyclerview.getPaddingTop(), i, recyclerview.getHeight() - recyclerview.getPaddingBottom());
	//   17   31:aload_1         
	//   18   32:iload           4
	//   19   34:aload_2         
	//   20   35:invokevirtual   #81  <Method int RecyclerView.getPaddingTop()>
	//   21   38:iload_3         
	//   22   39:aload_2         
	//   23   40:invokevirtual   #84  <Method int RecyclerView.getHeight()>
	//   24   43:aload_2         
	//   25   44:invokevirtual   #87  <Method int RecyclerView.getPaddingBottom()>
	//   26   47:isub            
	//   27   48:invokevirtual   #100 <Method boolean Canvas.clipRect(int, int, int, int)>
	//   28   51:pop             
		} else
	//*  29   52:aload_2         
	//*  30   53:invokevirtual   #103 <Method int RecyclerView.getChildCount()>
	//*  31   56:istore          6
	//*  32   58:iload           5
	//*  33   60:iload           6
	//*  34   62:icmpge          159
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
	//*  47   90:istore          7
	//*  48   92:aload           9
	//*  49   94:invokevirtual   #156 <Method float View.getTranslationY()>
	//*  50   97:invokestatic    #132 <Method int Math.round(float)>
	//*  51  100:iload           7
	//*  52  102:iadd            
	//*  53  103:istore          7
	//*  54  105:aload_0         
	//*  55  106:getfield        #49  <Field Drawable mDivider>
	//*  56  109:invokevirtual   #159 <Method int Drawable.getIntrinsicHeight()>
	//*  57  112:istore          8
	//*  58  114:aload_0         
	//*  59  115:getfield        #49  <Field Drawable mDivider>
	//*  60  118:iload           4
	//*  61  120:iload           7
	//*  62  122:iload           8
	//*  63  124:isub            
	//*  64  125:iload_3         
	//*  65  126:iload           7
	//*  66  128:invokevirtual   #141 <Method void Drawable.setBounds(int, int, int, int)>
	//*  67  131:aload_0         
	//*  68  132:getfield        #49  <Field Drawable mDivider>
	//*  69  135:aload_1         
	//*  70  136:invokevirtual   #145 <Method void Drawable.draw(Canvas)>
	//*  71  139:iload           5
	//*  72  141:iconst_1        
	//*  73  142:iadd            
	//*  74  143:istore          5
	//*  75  145:goto            58
		{
			i = recyclerview.getWidth();
	//   76  148:aload_2         
	//   77  149:invokevirtual   #93  <Method int RecyclerView.getWidth()>
	//   78  152:istore_3        
			j = 0;
	//   79  153:iconst_0        
	//   80  154:istore          4
		}
		for(l = recyclerview.getChildCount(); k < l; k++)
		{
			View view = recyclerview.getChildAt(k);
			recyclerview.getDecoratedBoundsWithMargins(view, mBounds);
			int i1 = mBounds.bottom;
			i1 = Math.round(view.getTranslationY()) + i1;
			int j1 = mDivider.getIntrinsicHeight();
			mDivider.setBounds(j, i1 - j1, i, i1);
			mDivider.draw(canvas);
		}

	//*  81  156:goto            52
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
