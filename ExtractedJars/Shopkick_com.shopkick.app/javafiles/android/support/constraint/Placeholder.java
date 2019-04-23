// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.constraint:
//			ConstraintLayout

public class Placeholder extends View
{

	public Placeholder(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void View(Context)>
		mContentId = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #15  <Field int mContentId>
		mContent = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #17  <Field View mContent>
		mEmptyVisibility = 4;
	//    9   15:aload_0         
	//   10   16:iconst_4        
	//   11   17:putfield        #19  <Field int mEmptyVisibility>
		init(((AttributeSet) (null)));
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:invokespecial   #23  <Method void init(AttributeSet)>
	//   15   25:return          
	}

	public Placeholder(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void View(Context, AttributeSet)>
		mContentId = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #15  <Field int mContentId>
		mContent = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #17  <Field View mContent>
		mEmptyVisibility = 4;
	//   10   16:aload_0         
	//   11   17:iconst_4        
	//   12   18:putfield        #19  <Field int mEmptyVisibility>
		init(attributeset);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokespecial   #23  <Method void init(AttributeSet)>
	//   16   26:return          
	}

	public Placeholder(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #30  <Method void View(Context, AttributeSet, int)>
		mContentId = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #15  <Field int mContentId>
		mContent = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #17  <Field View mContent>
		mEmptyVisibility = 4;
	//   11   17:aload_0         
	//   12   18:iconst_4        
	//   13   19:putfield        #19  <Field int mEmptyVisibility>
		init(attributeset);
	//   14   22:aload_0         
	//   15   23:aload_2         
	//   16   24:invokespecial   #23  <Method void init(AttributeSet)>
	//   17   27:return          
	}

	public Placeholder(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #30  <Method void View(Context, AttributeSet, int)>
		mContentId = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #15  <Field int mContentId>
		mContent = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #17  <Field View mContent>
		mEmptyVisibility = 4;
	//   11   17:aload_0         
	//   12   18:iconst_4        
	//   13   19:putfield        #19  <Field int mEmptyVisibility>
		init(attributeset);
	//   14   22:aload_0         
	//   15   23:aload_2         
	//   16   24:invokespecial   #23  <Method void init(AttributeSet)>
	//   17   27:return          
	}

	private void init(AttributeSet attributeset)
	{
		super.setVisibility(mEmptyVisibility);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field int mEmptyVisibility>
	//    3    5:invokespecial   #35  <Method void View.setVisibility(int)>
		mContentId = -1;
	//    4    8:aload_0         
	//    5    9:iconst_m1       
	//    6   10:putfield        #15  <Field int mContentId>
		if(attributeset != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          102
		{
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, R.styleable.ConstraintLayout_placeholder)));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #39  <Method Context getContext()>
	//   11   21:aload_1         
	//   12   22:getstatic       #45  <Field int[] R$styleable.ConstraintLayout_placeholder>
	//   13   25:invokevirtual   #51  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   28:astore_1        
			int j = ((TypedArray) (attributeset)).getIndexCount();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #57  <Method int TypedArray.getIndexCount()>
	//   17   33:istore_3        
			for(int i = 0; i < j; i++)
	//*  18   34:iconst_0        
	//*  19   35:istore_2        
	//*  20   36:iload_2         
	//*  21   37:iload_3         
	//*  22   38:icmpge          102
			{
				int k = ((TypedArray) (attributeset)).getIndex(i);
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokevirtual   #61  <Method int TypedArray.getIndex(int)>
	//   26   46:istore          4
				if(k == R.styleable.ConstraintLayout_placeholder_content)
	//*  27   48:iload           4
	//*  28   50:getstatic       #64  <Field int R$styleable.ConstraintLayout_placeholder_content>
	//*  29   53:icmpne          73
				{
					mContentId = ((TypedArray) (attributeset)).getResourceId(k, mContentId);
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:iload           4
	//   33   60:aload_0         
	//   34   61:getfield        #15  <Field int mContentId>
	//   35   64:invokevirtual   #68  <Method int TypedArray.getResourceId(int, int)>
	//   36   67:putfield        #15  <Field int mContentId>
					continue;
	//   37   70:goto            95
				}
				if(k == R.styleable.ConstraintLayout_placeholder_emptyVisibility)
	//*  38   73:iload           4
	//*  39   75:getstatic       #71  <Field int R$styleable.ConstraintLayout_placeholder_emptyVisibility>
	//*  40   78:icmpne          95
					mEmptyVisibility = ((TypedArray) (attributeset)).getInt(k, mEmptyVisibility);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:iload           4
	//   44   85:aload_0         
	//   45   86:getfield        #19  <Field int mEmptyVisibility>
	//   46   89:invokevirtual   #74  <Method int TypedArray.getInt(int, int)>
	//   47   92:putfield        #19  <Field int mEmptyVisibility>
			}

	//   48   95:iload_2         
	//   49   96:iconst_1        
	//   50   97:iadd            
	//   51   98:istore_2        
		}
	//*  52   99:goto            36
	//   53  102:return          
	}

	public View getContent()
	{
		return mContent;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field View mContent>
	//    2    4:areturn         
	}

	public int getEmptyVisibility()
	{
		return mEmptyVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mEmptyVisibility>
	//    2    4:ireturn         
	}

	public void onDraw(Canvas canvas)
	{
		if(isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #83  <Method boolean isInEditMode()>
	//*   2    4:ifeq            173
		{
			canvas.drawRGB(223, 223, 223);
	//    3    7:aload_1         
	//    4    8:sipush          223
	//    5   11:sipush          223
	//    6   14:sipush          223
	//    7   17:invokevirtual   #89  <Method void Canvas.drawRGB(int, int, int)>
			Paint paint = new Paint();
	//    8   20:new             #91  <Class Paint>
	//    9   23:dup             
	//   10   24:invokespecial   #94  <Method void Paint()>
	//   11   27:astore          4
			paint.setARGB(255, 210, 210, 210);
	//   12   29:aload           4
	//   13   31:sipush          255
	//   14   34:sipush          210
	//   15   37:sipush          210
	//   16   40:sipush          210
	//   17   43:invokevirtual   #98  <Method void Paint.setARGB(int, int, int, int)>
			paint.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   18   46:aload           4
	//   19   48:getstatic       #104 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   20   51:invokevirtual   #108 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
	//   21   54:aload           4
	//   22   56:getstatic       #114 <Field Typeface Typeface.DEFAULT>
	//   23   59:iconst_0        
	//   24   60:invokestatic    #118 <Method Typeface Typeface.create(Typeface, int)>
	//   25   63:invokevirtual   #122 <Method Typeface Paint.setTypeface(Typeface)>
	//   26   66:pop             
			Rect rect = new Rect();
	//   27   67:new             #124 <Class Rect>
	//   28   70:dup             
	//   29   71:invokespecial   #125 <Method void Rect()>
	//   30   74:astore          5
			canvas.getClipBounds(rect);
	//   31   76:aload_1         
	//   32   77:aload           5
	//   33   79:invokevirtual   #129 <Method boolean Canvas.getClipBounds(Rect)>
	//   34   82:pop             
			paint.setTextSize(rect.height());
	//   35   83:aload           4
	//   36   85:aload           5
	//   37   87:invokevirtual   #132 <Method int Rect.height()>
	//   38   90:i2f             
	//   39   91:invokevirtual   #136 <Method void Paint.setTextSize(float)>
			int i = rect.height();
	//   40   94:aload           5
	//   41   96:invokevirtual   #132 <Method int Rect.height()>
	//   42   99:istore_2        
			int j = rect.width();
	//   43  100:aload           5
	//   44  102:invokevirtual   #139 <Method int Rect.width()>
	//   45  105:istore_3        
			paint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   46  106:aload           4
	//   47  108:getstatic       #142 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   48  111:invokevirtual   #108 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			paint.getTextBounds("?", 0, 1, rect);
	//   49  114:aload           4
	//   50  116:ldc1            #144 <String "?">
	//   51  118:iconst_0        
	//   52  119:iconst_1        
	//   53  120:aload           5
	//   54  122:invokevirtual   #148 <Method void Paint.getTextBounds(String, int, int, Rect)>
			canvas.drawText("?", (float)j / 2.0F - (float)rect.width() / 2.0F - (float)rect.left, ((float)i / 2.0F + (float)rect.height() / 2.0F) - (float)rect.bottom, paint);
	//   55  125:aload_1         
	//   56  126:ldc1            #144 <String "?">
	//   57  128:iload_3         
	//   58  129:i2f             
	//   59  130:fconst_2        
	//   60  131:fdiv            
	//   61  132:aload           5
	//   62  134:invokevirtual   #139 <Method int Rect.width()>
	//   63  137:i2f             
	//   64  138:fconst_2        
	//   65  139:fdiv            
	//   66  140:fsub            
	//   67  141:aload           5
	//   68  143:getfield        #151 <Field int Rect.left>
	//   69  146:i2f             
	//   70  147:fsub            
	//   71  148:iload_2         
	//   72  149:i2f             
	//   73  150:fconst_2        
	//   74  151:fdiv            
	//   75  152:aload           5
	//   76  154:invokevirtual   #132 <Method int Rect.height()>
	//   77  157:i2f             
	//   78  158:fconst_2        
	//   79  159:fdiv            
	//   80  160:fadd            
	//   81  161:aload           5
	//   82  163:getfield        #154 <Field int Rect.bottom>
	//   83  166:i2f             
	//   84  167:fsub            
	//   85  168:aload           4
	//   86  170:invokevirtual   #158 <Method void Canvas.drawText(String, float, float, Paint)>
		}
	//   87  173:return          
	}

	public void setContentId(int i)
	{
		if(mContentId == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field int mContentId>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		View view = mContent;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field View mContent>
	//    7   13:astore_2        
		if(view != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          42
		{
			view.setVisibility(0);
	//   10   18:aload_2         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #35  <Method void View.setVisibility(int)>
			((ConstraintLayout.LayoutParams)mContent.getLayoutParams()).isInPlaceholder = false;
	//   13   23:aload_0         
	//   14   24:getfield        #17  <Field View mContent>
	//   15   27:invokevirtual   #163 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   30:checkcast       #165 <Class ConstraintLayout$LayoutParams>
	//   17   33:iconst_0        
	//   18   34:putfield        #169 <Field boolean ConstraintLayout$LayoutParams.isInPlaceholder>
			mContent = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #17  <Field View mContent>
		}
		mContentId = i;
	//   22   42:aload_0         
	//   23   43:iload_1         
	//   24   44:putfield        #15  <Field int mContentId>
		if(i != -1)
	//*  25   47:iload_1         
	//*  26   48:iconst_m1       
	//*  27   49:icmpeq          74
		{
			View view1 = ((View)getParent()).findViewById(i);
	//   28   52:aload_0         
	//   29   53:invokevirtual   #173 <Method android.view.ViewParent getParent()>
	//   30   56:checkcast       #4   <Class View>
	//   31   59:iload_1         
	//   32   60:invokevirtual   #177 <Method View View.findViewById(int)>
	//   33   63:astore_2        
			if(view1 != null)
	//*  34   64:aload_2         
	//*  35   65:ifnull          74
				view1.setVisibility(8);
	//   36   68:aload_2         
	//   37   69:bipush          8
	//   38   71:invokevirtual   #35  <Method void View.setVisibility(int)>
		}
	//   39   74:return          
	}

	public void setEmptyVisibility(int i)
	{
		mEmptyVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int mEmptyVisibility>
	//    3    5:return          
	}

	public void updatePostMeasure(ConstraintLayout constraintlayout)
	{
		if(mContent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field View mContent>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			constraintlayout = ((ConstraintLayout) ((ConstraintLayout.LayoutParams)getLayoutParams()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #181 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    6   12:checkcast       #165 <Class ConstraintLayout$LayoutParams>
	//    7   15:astore_1        
			ConstraintLayout.LayoutParams layoutparams = (ConstraintLayout.LayoutParams)mContent.getLayoutParams();
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field View mContent>
	//   10   20:invokevirtual   #163 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   23:checkcast       #165 <Class ConstraintLayout$LayoutParams>
	//   12   26:astore_2        
			layoutparams.widget.setVisibility(0);
	//   13   27:aload_2         
	//   14   28:getfield        #185 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #188 <Method void ConstraintWidget.setVisibility(int)>
			((ConstraintLayout.LayoutParams) (constraintlayout)).widget.setWidth(layoutparams.widget.getWidth());
	//   17   35:aload_1         
	//   18   36:getfield        #185 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   19   39:aload_2         
	//   20   40:getfield        #185 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   21   43:invokevirtual   #191 <Method int ConstraintWidget.getWidth()>
	//   22   46:invokevirtual   #194 <Method void ConstraintWidget.setWidth(int)>
			((ConstraintLayout.LayoutParams) (constraintlayout)).widget.setHeight(layoutparams.widget.getHeight());
	//   23   49:aload_1         
	//   24   50:getfield        #185 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   25   53:aload_2         
	//   26   54:getfield        #185 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   27   57:invokevirtual   #197 <Method int ConstraintWidget.getHeight()>
	//   28   60:invokevirtual   #200 <Method void ConstraintWidget.setHeight(int)>
			layoutparams.widget.setVisibility(8);
	//   29   63:aload_2         
	//   30   64:getfield        #185 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   31   67:bipush          8
	//   32   69:invokevirtual   #188 <Method void ConstraintWidget.setVisibility(int)>
			return;
	//   33   72:return          
		}
	}

	public void updatePreLayout(ConstraintLayout constraintlayout)
	{
		if(mContentId == -1 && !isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field int mContentId>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          23
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #83  <Method boolean isInEditMode()>
	//*   6   12:ifne            23
			setVisibility(mEmptyVisibility);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field int mEmptyVisibility>
	//   10   20:invokevirtual   #202 <Method void setVisibility(int)>
		mContent = constraintlayout.findViewById(mContentId);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #15  <Field int mContentId>
	//   15   29:invokevirtual   #205 <Method View ConstraintLayout.findViewById(int)>
	//   16   32:putfield        #17  <Field View mContent>
		constraintlayout = ((ConstraintLayout) (mContent));
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field View mContent>
	//   19   39:astore_1        
		if(constraintlayout != null)
	//*  20   40:aload_1         
	//*  21   41:ifnull          68
		{
			((ConstraintLayout.LayoutParams)((View) (constraintlayout)).getLayoutParams()).isInPlaceholder = true;
	//   22   44:aload_1         
	//   23   45:invokevirtual   #163 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   48:checkcast       #165 <Class ConstraintLayout$LayoutParams>
	//   25   51:iconst_1        
	//   26   52:putfield        #169 <Field boolean ConstraintLayout$LayoutParams.isInPlaceholder>
			mContent.setVisibility(0);
	//   27   55:aload_0         
	//   28   56:getfield        #17  <Field View mContent>
	//   29   59:iconst_0        
	//   30   60:invokevirtual   #35  <Method void View.setVisibility(int)>
			setVisibility(0);
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #202 <Method void setVisibility(int)>
		}
	//   34   68:return          
	}

	private View mContent;
	private int mContentId;
	private int mEmptyVisibility;
}
