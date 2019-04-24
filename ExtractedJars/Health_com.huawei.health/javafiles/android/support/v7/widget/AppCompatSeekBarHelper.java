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
	//*   2    4:ifnull          176
		{
			int l = mView.getMax();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field SeekBar mView>
	//    5   11:invokevirtual   #75  <Method int SeekBar.getMax()>
	//    6   14:istore          5
			if(l > 1)
	//*   7   16:iload           5
	//*   8   18:iconst_1        
	//*   9   19:icmple          176
			{
				int i = mTickMark.getIntrinsicWidth();
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field Drawable mTickMark>
	//   12   26:invokevirtual   #78  <Method int Drawable.getIntrinsicWidth()>
	//   13   29:istore_3        
				int k = mTickMark.getIntrinsicHeight();
	//   14   30:aload_0         
	//   15   31:getfield        #35  <Field Drawable mTickMark>
	//   16   34:invokevirtual   #81  <Method int Drawable.getIntrinsicHeight()>
	//   17   37:istore          4
				if(i >= 0)
	//*  18   39:iload_3         
	//*  19   40:iflt            50
					i /= 2;
	//   20   43:iload_3         
	//   21   44:iconst_2        
	//   22   45:idiv            
	//   23   46:istore_3        
				else
	//*  24   47:goto            52
					i = 1;
	//   25   50:iconst_1        
	//   26   51:istore_3        
				if(k >= 0)
	//*  27   52:iload           4
	//*  28   54:iflt            66
					k /= 2;
	//   29   57:iload           4
	//   30   59:iconst_2        
	//   31   60:idiv            
	//   32   61:istore          4
				else
	//*  33   63:goto            69
					k = 1;
	//   34   66:iconst_1        
	//   35   67:istore          4
				mTickMark.setBounds(-i, -k, i, k);
	//   36   69:aload_0         
	//   37   70:getfield        #35  <Field Drawable mTickMark>
	//   38   73:iload_3         
	//   39   74:ineg            
	//   40   75:iload           4
	//   41   77:ineg            
	//   42   78:iload_3         
	//   43   79:iload           4
	//   44   81:invokevirtual   #85  <Method void Drawable.setBounds(int, int, int, int)>
				float f = (float)(mView.getWidth() - mView.getPaddingLeft() - mView.getPaddingRight()) / (float)l;
	//   45   84:aload_0         
	//   46   85:getfield        #30  <Field SeekBar mView>
	//   47   88:invokevirtual   #88  <Method int SeekBar.getWidth()>
	//   48   91:aload_0         
	//   49   92:getfield        #30  <Field SeekBar mView>
	//   50   95:invokevirtual   #91  <Method int SeekBar.getPaddingLeft()>
	//   51   98:isub            
	//   52   99:aload_0         
	//   53  100:getfield        #30  <Field SeekBar mView>
	//   54  103:invokevirtual   #94  <Method int SeekBar.getPaddingRight()>
	//   55  106:isub            
	//   56  107:i2f             
	//   57  108:iload           5
	//   58  110:i2f             
	//   59  111:fdiv            
	//   60  112:fstore_2        
				k = canvas.save();
	//   61  113:aload_1         
	//   62  114:invokevirtual   #99  <Method int Canvas.save()>
	//   63  117:istore          4
				canvas.translate(mView.getPaddingLeft(), mView.getHeight() / 2);
	//   64  119:aload_1         
	//   65  120:aload_0         
	//   66  121:getfield        #30  <Field SeekBar mView>
	//   67  124:invokevirtual   #91  <Method int SeekBar.getPaddingLeft()>
	//   68  127:i2f             
	//   69  128:aload_0         
	//   70  129:getfield        #30  <Field SeekBar mView>
	//   71  132:invokevirtual   #102 <Method int SeekBar.getHeight()>
	//   72  135:iconst_2        
	//   73  136:idiv            
	//   74  137:i2f             
	//   75  138:invokevirtual   #106 <Method void Canvas.translate(float, float)>
				for(int j = 0; j <= l; j++)
	//*  76  141:iconst_0        
	//*  77  142:istore_3        
	//*  78  143:iload_3         
	//*  79  144:iload           5
	//*  80  146:icmpgt          170
				{
					mTickMark.draw(canvas);
	//   81  149:aload_0         
	//   82  150:getfield        #35  <Field Drawable mTickMark>
	//   83  153:aload_1         
	//   84  154:invokevirtual   #109 <Method void Drawable.draw(Canvas)>
					canvas.translate(f, 0.0F);
	//   85  157:aload_1         
	//   86  158:fload_2         
	//   87  159:fconst_0        
	//   88  160:invokevirtual   #106 <Method void Canvas.translate(float, float)>
				}

	//   89  163:iload_3         
	//   90  164:iconst_1        
	//   91  165:iadd            
	//   92  166:istore_3        
	//*  93  167:goto            143
				canvas.restoreToCount(k);
	//   94  170:aload_1         
	//   95  171:iload           4
	//   96  173:invokevirtual   #113 <Method void Canvas.restoreToCount(int)>
			}
		}
	//   97  176:return          
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

	Drawable getTickMark()
	{
		return mTickMark;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Drawable mTickMark>
	//    2    4:areturn         
	}

	ColorStateList getTickMarkTintList()
	{
		return mTickMarkTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ColorStateList mTickMarkTintList>
	//    2    4:areturn         
	}

	android.graphics.PorterDuff.Mode getTickMarkTintMode()
	{
		return mTickMarkTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
	//    2    4:areturn         
	}

	void jumpDrawablesToCurrentState()
	{
		if(mTickMark != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Drawable mTickMark>
	//*   2    4:ifnull          14
			mTickMark.jumpToCurrentState();
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Drawable mTickMark>
	//    5   11:invokevirtual   #132 <Method void Drawable.jumpToCurrentState()>
	//    6   14:return          
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		super.loadFromAttributes(attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #136 <Method void AppCompatProgressBarHelper.loadFromAttributes(AttributeSet, int)>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, android.support.v7.appcompat.R.styleable.AppCompatSeekBar, i, 0)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field SeekBar mView>
	//    6   10:invokevirtual   #140 <Method android.content.Context SeekBar.getContext()>
	//    7   13:aload_1         
	//    8   14:getstatic       #146 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatSeekBar>
	//    9   17:iload_2         
	//   10   18:iconst_0        
	//   11   19:invokestatic    #152 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//   12   22:astore_1        
		Drawable drawable = ((TintTypedArray) (attributeset)).getDrawableIfKnown(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_android_thumb);
	//   13   23:aload_1         
	//   14   24:getstatic       #156 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_android_thumb>
	//   15   27:invokevirtual   #160 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
	//   16   30:astore_3        
		if(drawable != null)
	//*  17   31:aload_3         
	//*  18   32:ifnull          43
			mView.setThumb(drawable);
	//   19   35:aload_0         
	//   20   36:getfield        #30  <Field SeekBar mView>
	//   21   39:aload_3         
	//   22   40:invokevirtual   #163 <Method void SeekBar.setThumb(Drawable)>
		setTickMark(((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMark));
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:getstatic       #166 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMark>
	//   26   48:invokevirtual   #169 <Method Drawable TintTypedArray.getDrawable(int)>
	//   27   51:invokevirtual   #172 <Method void setTickMark(Drawable)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode))
	//*  28   54:aload_1         
	//*  29   55:getstatic       #175 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTintMode>
	//*  30   58:invokevirtual   #179 <Method boolean TintTypedArray.hasValue(int)>
	//*  31   61:ifeq            88
		{
			mTickMarkTintMode = DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), mTickMarkTintMode);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getstatic       #175 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTintMode>
	//   35   69:iconst_m1       
	//   36   70:invokevirtual   #183 <Method int TintTypedArray.getInt(int, int)>
	//   37   73:aload_0         
	//   38   74:getfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
	//   39   77:invokestatic    #189 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   40   80:putfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
			mHasTickMarkTintMode = true;
	//   41   83:aload_0         
	//   42   84:iconst_1        
	//   43   85:putfield        #28  <Field boolean mHasTickMarkTintMode>
		}
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint))
	//*  44   88:aload_1         
	//*  45   89:getstatic       #192 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTint>
	//*  46   92:invokevirtual   #179 <Method boolean TintTypedArray.hasValue(int)>
	//*  47   95:ifeq            114
		{
			mTickMarkTintList = ((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint);
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:getstatic       #192 <Field int android.support.v7.appcompat.R$styleable.AppCompatSeekBar_tickMarkTint>
	//   51  103:invokevirtual   #196 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   52  106:putfield        #22  <Field ColorStateList mTickMarkTintList>
			mHasTickMarkTint = true;
	//   53  109:aload_0         
	//   54  110:iconst_1        
	//   55  111:putfield        #26  <Field boolean mHasTickMarkTint>
		}
		((TintTypedArray) (attributeset)).recycle();
	//   56  114:aload_1         
	//   57  115:invokevirtual   #199 <Method void TintTypedArray.recycle()>
		applyTickMarkTint();
	//   58  118:aload_0         
	//   59  119:invokespecial   #201 <Method void applyTickMarkTint()>
	//   60  122:return          
	}

	void setTickMark(Drawable drawable)
	{
		if(mTickMark != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Drawable mTickMark>
	//*   2    4:ifnull          15
			mTickMark.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Drawable mTickMark>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #205 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTickMark = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #35  <Field Drawable mTickMark>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          67
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (mView)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #30  <Field SeekBar mView>
	//   15   29:invokevirtual   #205 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			DrawableCompat.setLayoutDirection(drawable, ViewCompat.getLayoutDirection(((android.view.View) (mView))));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #30  <Field SeekBar mView>
	//   19   37:invokestatic    #211 <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//   20   40:invokestatic    #215 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   21   43:pop             
			if(drawable.isStateful())
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #59  <Method boolean Drawable.isStateful()>
	//*  24   48:ifeq            63
				drawable.setState(mView.getDrawableState());
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #30  <Field SeekBar mView>
	//   28   56:invokevirtual   #65  <Method int[] SeekBar.getDrawableState()>
	//   29   59:invokevirtual   #69  <Method boolean Drawable.setState(int[])>
	//   30   62:pop             
			applyTickMarkTint();
	//   31   63:aload_0         
	//   32   64:invokespecial   #201 <Method void applyTickMarkTint()>
		}
		mView.invalidate();
	//   33   67:aload_0         
	//   34   68:getfield        #30  <Field SeekBar mView>
	//   35   71:invokevirtual   #218 <Method void SeekBar.invalidate()>
	//   36   74:return          
	}

	void setTickMarkTintList(ColorStateList colorstatelist)
	{
		mTickMarkTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ColorStateList mTickMarkTintList>
		mHasTickMarkTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #26  <Field boolean mHasTickMarkTint>
		applyTickMarkTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #201 <Method void applyTickMarkTint()>
	//    8   14:return          
	}

	void setTickMarkTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mTickMarkTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field android.graphics.PorterDuff$Mode mTickMarkTintMode>
		mHasTickMarkTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #28  <Field boolean mHasTickMarkTintMode>
		applyTickMarkTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #201 <Method void applyTickMarkTint()>
	//    8   14:return          
	}

	private boolean mHasTickMarkTint;
	private boolean mHasTickMarkTintMode;
	private Drawable mTickMark;
	private ColorStateList mTickMarkTintList;
	private android.graphics.PorterDuff.Mode mTickMarkTintMode;
	private final SeekBar mView;
}
