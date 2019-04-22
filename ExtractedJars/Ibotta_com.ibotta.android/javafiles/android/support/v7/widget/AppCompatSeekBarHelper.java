// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.widget:
//			AppCompatProgressBarHelper, TintTypedArray, DrawableUtils

class AppCompatSeekBarHelper extends AppCompatProgressBarHelper
{

	AppCompatSeekBarHelper(SeekBar seekbar)
	{
		super(((android.widget.ProgressBar) (seekbar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void AppCompatProgressBarHelper(android.widget.ProgressBar)>
		mTickMarkTintList = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #22  <Field ColorStateList mTickMarkTintList>
		mTickMarkTintMode = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
		mHasTickMarkTint = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #26  <Field boolean mHasTickMarkTint>
		mHasTickMarkTintMode = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #28  <Field boolean mHasTickMarkTintMode>
		mView = seekbar;
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:putfield        #30  <Field SeekBar mView>
	//   18   30:return          
	}

	private void applyTickMarkTint()
	{
		if(mTickMark != null && (mHasTickMarkTint || mHasTickMarkTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Drawable mTickMark>
	//*   2    4:ifnull          96
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field boolean mHasTickMarkTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #28  <Field boolean mHasTickMarkTintMode>
	//*   8   18:ifeq            96
		{
			mTickMark = DrawableCompat.wrap(mTickMark.mutate());
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field Drawable mTickMark>
	//   12   26:invokevirtual   #41  <Method Drawable Drawable.mutate()>
	//   13   29:invokestatic    #47  <Method Drawable DrawableCompat.wrap(Drawable)>
	//   14   32:putfield        #35  <Field Drawable mTickMark>
			if(mHasTickMarkTint)
	//*  15   35:aload_0         
	//*  16   36:getfield        #26  <Field boolean mHasTickMarkTint>
	//*  17   39:ifeq            53
				DrawableCompat.setTintList(mTickMark, mTickMarkTintList);
	//   18   42:aload_0         
	//   19   43:getfield        #35  <Field Drawable mTickMark>
	//   20   46:aload_0         
	//   21   47:getfield        #22  <Field ColorStateList mTickMarkTintList>
	//   22   50:invokestatic    #51  <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasTickMarkTintMode)
	//*  23   53:aload_0         
	//*  24   54:getfield        #28  <Field boolean mHasTickMarkTintMode>
	//*  25   57:ifeq            71
				DrawableCompat.setTintMode(mTickMark, mTickMarkTintMode);
	//   26   60:aload_0         
	//   27   61:getfield        #35  <Field Drawable mTickMark>
	//   28   64:aload_0         
	//   29   65:getfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
	//   30   68:invokestatic    #55  <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mTickMark.isStateful())
	//*  31   71:aload_0         
	//*  32   72:getfield        #35  <Field Drawable mTickMark>
	//*  33   75:invokevirtual   #59  <Method boolean Drawable.isStateful()>
	//*  34   78:ifeq            96
				mTickMark.setState(mView.getDrawableState());
	//   35   81:aload_0         
	//   36   82:getfield        #35  <Field Drawable mTickMark>
	//   37   85:aload_0         
	//   38   86:getfield        #30  <Field SeekBar mView>
	//   39   89:invokevirtual   #65  <Method int[] SeekBar.getDrawableState()>
	//   40   92:invokevirtual   #69  <Method boolean Drawable.setState(int[])>
	//   41   95:pop             
		}
	//   42   96:return          
	}

	void drawTickMarks(Canvas canvas)
	{
		if(mTickMark != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Drawable mTickMark>
	//*   2    4:ifnull          173
		{
			int l = mView.getMax();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field SeekBar mView>
	//    5   11:invokevirtual   #75  <Method int SeekBar.getMax()>
	//    6   14:istore          5
			int k = 1;
	//    7   16:iconst_1        
	//    8   17:istore          4
			if(l > 1)
	//*   9   19:iload           5
	//*  10   21:iconst_1        
	//*  11   22:icmple          173
			{
				int i = mTickMark.getIntrinsicWidth();
	//   12   25:aload_0         
	//   13   26:getfield        #35  <Field Drawable mTickMark>
	//   14   29:invokevirtual   #78  <Method int Drawable.getIntrinsicWidth()>
	//   15   32:istore_3        
				int i1 = mTickMark.getIntrinsicHeight();
	//   16   33:aload_0         
	//   17   34:getfield        #35  <Field Drawable mTickMark>
	//   18   37:invokevirtual   #81  <Method int Drawable.getIntrinsicHeight()>
	//   19   40:istore          6
				if(i >= 0)
	//*  20   42:iload_3         
	//*  21   43:iflt            53
					i /= 2;
	//   22   46:iload_3         
	//   23   47:iconst_2        
	//   24   48:idiv            
	//   25   49:istore_3        
				else
	//*  26   50:goto            55
					i = 1;
	//   27   53:iconst_1        
	//   28   54:istore_3        
				if(i1 >= 0)
	//*  29   55:iload           6
	//*  30   57:iflt            66
					k = i1 / 2;
	//   31   60:iload           6
	//   32   62:iconst_2        
	//   33   63:idiv            
	//   34   64:istore          4
				mTickMark.setBounds(-i, -k, i, k);
	//   35   66:aload_0         
	//   36   67:getfield        #35  <Field Drawable mTickMark>
	//   37   70:iload_3         
	//   38   71:ineg            
	//   39   72:iload           4
	//   40   74:ineg            
	//   41   75:iload_3         
	//   42   76:iload           4
	//   43   78:invokevirtual   #85  <Method void Drawable.setBounds(int, int, int, int)>
				float f = (float)(mView.getWidth() - mView.getPaddingLeft() - mView.getPaddingRight()) / (float)l;
	//   44   81:aload_0         
	//   45   82:getfield        #30  <Field SeekBar mView>
	//   46   85:invokevirtual   #88  <Method int SeekBar.getWidth()>
	//   47   88:aload_0         
	//   48   89:getfield        #30  <Field SeekBar mView>
	//   49   92:invokevirtual   #91  <Method int SeekBar.getPaddingLeft()>
	//   50   95:isub            
	//   51   96:aload_0         
	//   52   97:getfield        #30  <Field SeekBar mView>
	//   53  100:invokevirtual   #94  <Method int SeekBar.getPaddingRight()>
	//   54  103:isub            
	//   55  104:i2f             
	//   56  105:iload           5
	//   57  107:i2f             
	//   58  108:fdiv            
	//   59  109:fstore_2        
				k = canvas.save();
	//   60  110:aload_1         
	//   61  111:invokevirtual   #99  <Method int Canvas.save()>
	//   62  114:istore          4
				canvas.translate(mView.getPaddingLeft(), mView.getHeight() / 2);
	//   63  116:aload_1         
	//   64  117:aload_0         
	//   65  118:getfield        #30  <Field SeekBar mView>
	//   66  121:invokevirtual   #91  <Method int SeekBar.getPaddingLeft()>
	//   67  124:i2f             
	//   68  125:aload_0         
	//   69  126:getfield        #30  <Field SeekBar mView>
	//   70  129:invokevirtual   #102 <Method int SeekBar.getHeight()>
	//   71  132:iconst_2        
	//   72  133:idiv            
	//   73  134:i2f             
	//   74  135:invokevirtual   #106 <Method void Canvas.translate(float, float)>
				for(int j = 0; j <= l; j++)
	//*  75  138:iconst_0        
	//*  76  139:istore_3        
	//*  77  140:iload_3         
	//*  78  141:iload           5
	//*  79  143:icmpgt          167
				{
					mTickMark.draw(canvas);
	//   80  146:aload_0         
	//   81  147:getfield        #35  <Field Drawable mTickMark>
	//   82  150:aload_1         
	//   83  151:invokevirtual   #109 <Method void Drawable.draw(Canvas)>
					canvas.translate(f, 0.0F);
	//   84  154:aload_1         
	//   85  155:fload_2         
	//   86  156:fconst_0        
	//   87  157:invokevirtual   #106 <Method void Canvas.translate(float, float)>
				}

	//   88  160:iload_3         
	//   89  161:iconst_1        
	//   90  162:iadd            
	//   91  163:istore_3        
	//*  92  164:goto            140
				canvas.restoreToCount(k);
	//   93  167:aload_1         
	//   94  168:iload           4
	//   95  170:invokevirtual   #113 <Method void Canvas.restoreToCount(int)>
			}
		}
	//   96  173:return          
	}

	void drawableStateChanged()
	{
		Drawable drawable = mTickMark;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Drawable mTickMark>
	//    2    4:astore_1        
		if(drawable != null && drawable.isStateful() && drawable.setState(mView.getDrawableState()))
	//*   3    5:aload_1         
	//*   4    6:ifnull          38
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #59  <Method boolean Drawable.isStateful()>
	//*   7   13:ifeq            38
	//*   8   16:aload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #30  <Field SeekBar mView>
	//*  11   21:invokevirtual   #65  <Method int[] SeekBar.getDrawableState()>
	//*  12   24:invokevirtual   #69  <Method boolean Drawable.setState(int[])>
	//*  13   27:ifeq            38
			mView.invalidateDrawable(drawable);
	//   14   30:aload_0         
	//   15   31:getfield        #30  <Field SeekBar mView>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #118 <Method void SeekBar.invalidateDrawable(Drawable)>
	//   18   38:return          
	}

	void jumpDrawablesToCurrentState()
	{
		Drawable drawable = mTickMark;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Drawable mTickMark>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			drawable.jumpToCurrentState();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #122 <Method void Drawable.jumpToCurrentState()>
	//    7   13:return          
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		super.loadFromAttributes(attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #126 <Method void AppCompatProgressBarHelper.loadFromAttributes(AttributeSet, int)>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, android.support.v7.appcompat.R.styleable.AppCompatSeekBar, i, 0)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field SeekBar mView>
	//    6   10:invokevirtual   #130 <Method android.content.Context SeekBar.getContext()>
	//    7   13:aload_1         
	//    8   14:getstatic       #136 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatSeekBar>
	//    9   17:iload_2         
	//   10   18:iconst_0        
	//   11   19:invokestatic    #142 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//   12   22:astore_1        
		Drawable drawable = ((TintTypedArray) (attributeset)).getDrawableIfKnown(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_android_thumb);
	//   13   23:aload_1         
	//   14   24:getstatic       #146 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_android_thumb>
	//   15   27:invokevirtual   #150 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
	//   16   30:astore_3        
		if(drawable != null)
	//*  17   31:aload_3         
	//*  18   32:ifnull          43
			mView.setThumb(drawable);
	//   19   35:aload_0         
	//   20   36:getfield        #30  <Field SeekBar mView>
	//   21   39:aload_3         
	//   22   40:invokevirtual   #153 <Method void SeekBar.setThumb(Drawable)>
		setTickMark(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMark));
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:getstatic       #156 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMark>
	//   26   48:invokevirtual   #159 <Method Drawable TintTypedArray.getDrawable(int)>
	//   27   51:invokevirtual   #162 <Method void setTickMark(Drawable)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode))
	//*  28   54:aload_1         
	//*  29   55:getstatic       #165 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTintMode>
	//*  30   58:invokevirtual   #169 <Method boolean TintTypedArray.hasValue(int)>
	//*  31   61:ifeq            88
		{
			mTickMarkTintMode = DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), mTickMarkTintMode);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getstatic       #165 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTintMode>
	//   35   69:iconst_m1       
	//   36   70:invokevirtual   #173 <Method int TintTypedArray.getInt(int, int)>
	//   37   73:aload_0         
	//   38   74:getfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
	//   39   77:invokestatic    #179 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   40   80:putfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
			mHasTickMarkTintMode = true;
	//   41   83:aload_0         
	//   42   84:iconst_1        
	//   43   85:putfield        #28  <Field boolean mHasTickMarkTintMode>
		}
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint))
	//*  44   88:aload_1         
	//*  45   89:getstatic       #182 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTint>
	//*  46   92:invokevirtual   #169 <Method boolean TintTypedArray.hasValue(int)>
	//*  47   95:ifeq            114
		{
			mTickMarkTintList = ((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint);
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:getstatic       #182 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTint>
	//   51  103:invokevirtual   #186 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   52  106:putfield        #22  <Field ColorStateList mTickMarkTintList>
			mHasTickMarkTint = true;
	//   53  109:aload_0         
	//   54  110:iconst_1        
	//   55  111:putfield        #26  <Field boolean mHasTickMarkTint>
		}
		((TintTypedArray) (attributeset)).recycle();
	//   56  114:aload_1         
	//   57  115:invokevirtual   #189 <Method void TintTypedArray.recycle()>
		applyTickMarkTint();
	//   58  118:aload_0         
	//   59  119:invokespecial   #191 <Method void applyTickMarkTint()>
	//   60  122:return          
	}

	void setTickMark(Drawable drawable)
	{
		Drawable drawable1 = mTickMark;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Drawable mTickMark>
	//    2    4:astore_2        
		if(drawable1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #196 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTickMark = drawable;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #35  <Field Drawable mTickMark>
		if(drawable != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          66
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (mView)));
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #30  <Field SeekBar mView>
	//   16   28:invokevirtual   #196 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			DrawableCompat.setLayoutDirection(drawable, ViewCompat.getLayoutDirection(((android.view.View) (mView))));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #30  <Field SeekBar mView>
	//   20   36:invokestatic    #202 <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//   21   39:invokestatic    #206 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   22   42:pop             
			if(drawable.isStateful())
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #59  <Method boolean Drawable.isStateful()>
	//*  25   47:ifeq            62
				drawable.setState(mView.getDrawableState());
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #30  <Field SeekBar mView>
	//   29   55:invokevirtual   #65  <Method int[] SeekBar.getDrawableState()>
	//   30   58:invokevirtual   #69  <Method boolean Drawable.setState(int[])>
	//   31   61:pop             
			applyTickMarkTint();
	//   32   62:aload_0         
	//   33   63:invokespecial   #191 <Method void applyTickMarkTint()>
		}
		mView.invalidate();
	//   34   66:aload_0         
	//   35   67:getfield        #30  <Field SeekBar mView>
	//   36   70:invokevirtual   #209 <Method void SeekBar.invalidate()>
	//   37   73:return          
	}

	private boolean mHasTickMarkTint;
	private boolean mHasTickMarkTintMode;
	private Drawable mTickMark;
	private ColorStateList mTickMarkTintList;
	private android.graphics.PorterDuff.Mode mTickMarkTintMode;
	private final SeekBar mView;
}
