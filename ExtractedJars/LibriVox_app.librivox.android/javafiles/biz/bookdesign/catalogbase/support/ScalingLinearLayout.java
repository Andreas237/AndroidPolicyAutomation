// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.catalogbase.support;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.*;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;

// Referenced classes of package biz.bookdesign.catalogbase.support:
//			d, b, c

public class ScalingLinearLayout extends LinearLayout
{

	public ScalingLinearLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void LinearLayout(Context, AttributeSet)>
		b = 1.0F;
	//    4    6:aload_0         
	//    5    7:fconst_1        
	//    6    8:putfield        #19  <Field float b>
		c = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #21  <Field int c>
		d = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #23  <Field int d>
		e = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #25  <Field boolean e>
		b();
	//   16   26:aload_0         
	//   17   27:invokespecial   #28  <Method void b()>
	//   18   30:return          
	}

	static float a(ScalingLinearLayout scalinglinearlayout, float f)
	{
		scalinglinearlayout.b = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float b>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

	static int a(ScalingLinearLayout scalinglinearlayout)
	{
		return scalinglinearlayout.c;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int c>
	//    2    4:ireturn         
	}

	static int a(ScalingLinearLayout scalinglinearlayout, int i)
	{
		scalinglinearlayout.c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int c>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int b(ScalingLinearLayout scalinglinearlayout)
	{
		return scalinglinearlayout.d;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int d>
	//    2    4:ireturn         
	}

	static int b(ScalingLinearLayout scalinglinearlayout, int i)
	{
		scalinglinearlayout.d = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int d>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b()
	{
		if(isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #39  <Method boolean isInEditMode()>
	//*   2    4:ifeq            15
		{
			b = 1.0F;
	//    3    7:aload_0         
	//    4    8:fconst_1        
	//    5    9:putfield        #19  <Field float b>
		} else
	//*   6   12:goto            90
		{
			SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #43  <Method Context getContext()>
	//    9   19:invokestatic    #49  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   10   22:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #51  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #53  <Method void StringBuilder()>
	//   14   30:astore_3        
			stringbuilder.append("biz.bookdesign.librivox.support.ScalingLinearLayout.scale");
	//   15   31:aload_3         
	//   16   32:ldc1            #55  <String "biz.bookdesign.librivox.support.ScalingLinearLayout.scale">
	//   17   34:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(getId());
	//   19   38:aload_3         
	//   20   39:aload_0         
	//   21   40:invokevirtual   #63  <Method int getId()>
	//   22   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(int)>
	//   23   46:pop             
			b = sharedpreferences.getFloat(stringbuilder.toString(), 1.0F);
	//   24   47:aload_0         
	//   25   48:aload_2         
	//   26   49:aload_3         
	//   27   50:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   28   53:fconst_1        
	//   29   54:invokeinterface #76  <Method float SharedPreferences.getFloat(String, float)>
	//   30   59:putfield        #19  <Field float b>
			float f = b;
	//   31   62:aload_0         
	//   32   63:getfield        #19  <Field float b>
	//   33   66:fstore_1        
			if((double)f < 0.5D || (double)f > 2D)
	//*  34   67:fload_1         
	//*  35   68:f2d             
	//*  36   69:ldc2w           #77  <Double 0.5D>
	//*  37   72:dcmpg           
	//*  38   73:iflt            85
	//*  39   76:fload_1         
	//*  40   77:f2d             
	//*  41   78:ldc2w           #79  <Double 2D>
	//*  42   81:dcmpl           
	//*  43   82:ifle            90
				b = 1.0F;
	//   44   85:aload_0         
	//   45   86:fconst_1        
	//   46   87:putfield        #19  <Field float b>
		}
		a = new ScaleGestureDetector(getContext(), ((android.view.ScaleGestureDetector.OnScaleGestureListener) (new d(this, ((b) (null))))));
	//   47   90:aload_0         
	//   48   91:new             #82  <Class ScaleGestureDetector>
	//   49   94:dup             
	//   50   95:aload_0         
	//   51   96:invokevirtual   #43  <Method Context getContext()>
	//   52   99:new             #84  <Class d>
	//   53  102:dup             
	//   54  103:aload_0         
	//   55  104:aconst_null     
	//   56  105:invokespecial   #87  <Method void d(ScalingLinearLayout, b)>
	//   57  108:invokespecial   #90  <Method void ScaleGestureDetector(Context, android.view.ScaleGestureDetector$OnScaleGestureListener)>
	//   58  111:putfield        #92  <Field ScaleGestureDetector a>
		setScaleX(b);
	//   59  114:aload_0         
	//   60  115:aload_0         
	//   61  116:getfield        #19  <Field float b>
	//   62  119:invokevirtual   #96  <Method void setScaleX(float)>
		setScaleY(b);
	//   63  122:aload_0         
	//   64  123:aload_0         
	//   65  124:getfield        #19  <Field float b>
	//   66  127:invokevirtual   #99  <Method void setScaleY(float)>
		if(b != 1.0F)
	//*  67  130:aload_0         
	//*  68  131:getfield        #19  <Field float b>
	//*  69  134:fconst_1        
	//*  70  135:fcmpl           
	//*  71  136:ifeq            154
			getViewTreeObserver().addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (new b(this))));
	//   72  139:aload_0         
	//   73  140:invokevirtual   #103 <Method ViewTreeObserver getViewTreeObserver()>
	//   74  143:new             #105 <Class b>
	//   75  146:dup             
	//   76  147:aload_0         
	//   77  148:invokespecial   #108 <Method void b(ScalingLinearLayout)>
	//   78  151:invokevirtual   #114 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   79  154:return          
	}

	static float c(ScalingLinearLayout scalinglinearlayout)
	{
		return scalinglinearlayout.b;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float b>
	//    2    4:freturn         
	}

	void a()
	{
		setScaleX(b);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field float b>
	//    3    5:invokevirtual   #96  <Method void setScaleX(float)>
		setScaleY(b);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field float b>
	//    7   13:invokevirtual   #99  <Method void setScaleY(float)>
		android.widget.AbsoluteLayout.LayoutParams layoutparams = (android.widget.AbsoluteLayout.LayoutParams)getLayoutParams();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #122 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   10   20:checkcast       #124 <Class android.widget.AbsoluteLayout$LayoutParams>
	//   11   23:astore          5
		int i = c;
	//   12   25:aload_0         
	//   13   26:getfield        #21  <Field int c>
	//   14   29:istore_3        
		float f = i;
	//   15   30:iload_3         
	//   16   31:i2f             
	//   17   32:fstore_1        
		float f1 = b;
	//   18   33:aload_0         
	//   19   34:getfield        #19  <Field float b>
	//   20   37:fstore_2        
		layoutparams.height = (int)(f / f1);
	//   21   38:aload           5
	//   22   40:fload_1         
	//   23   41:fload_2         
	//   24   42:fdiv            
	//   25   43:f2i             
	//   26   44:putfield        #127 <Field int android.widget.AbsoluteLayout$LayoutParams.height>
		int j = d;
	//   27   47:aload_0         
	//   28   48:getfield        #23  <Field int d>
	//   29   51:istore          4
		layoutparams.width = (int)((float)j / f1);
	//   30   53:aload           5
	//   31   55:iload           4
	//   32   57:i2f             
	//   33   58:fload_2         
	//   34   59:fdiv            
	//   35   60:f2i             
	//   36   61:putfield        #130 <Field int android.widget.AbsoluteLayout$LayoutParams.width>
		layoutparams.x = (int)(((float)j * (1.0F - 1.0F / f1)) / 2.0F);
	//   37   64:aload           5
	//   38   66:iload           4
	//   39   68:i2f             
	//   40   69:fconst_1        
	//   41   70:fconst_1        
	//   42   71:fload_2         
	//   43   72:fdiv            
	//   44   73:fsub            
	//   45   74:fmul            
	//   46   75:fconst_2        
	//   47   76:fdiv            
	//   48   77:f2i             
	//   49   78:putfield        #133 <Field int android.widget.AbsoluteLayout$LayoutParams.x>
		layoutparams.y = (int)(((float)i * (1.0F - 1.0F / f1)) / 2.0F);
	//   50   81:aload           5
	//   51   83:iload_3         
	//   52   84:i2f             
	//   53   85:fconst_1        
	//   54   86:fconst_1        
	//   55   87:fload_2         
	//   56   88:fdiv            
	//   57   89:fsub            
	//   58   90:fmul            
	//   59   91:fconst_2        
	//   60   92:fdiv            
	//   61   93:f2i             
	//   62   94:putfield        #136 <Field int android.widget.AbsoluteLayout$LayoutParams.y>
		setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   63   97:aload_0         
	//   64   98:aload           5
	//   65  100:invokevirtual   #140 <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   66  103:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void LinearLayout.onDetachedFromWindow()>
		android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getContext()).edit();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #43  <Method Context getContext()>
	//    4    8:invokestatic    #49  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    5   11:invokeinterface #147 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   16:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   17:new             #51  <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #53  <Method void StringBuilder()>
	//   10   24:astore_2        
		stringbuilder.append("biz.bookdesign.librivox.support.ScalingLinearLayout.scale");
	//   11   25:aload_2         
	//   12   26:ldc1            #55  <String "biz.bookdesign.librivox.support.ScalingLinearLayout.scale">
	//   13   28:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		stringbuilder.append(getId());
	//   15   32:aload_2         
	//   16   33:aload_0         
	//   17   34:invokevirtual   #63  <Method int getId()>
	//   18   37:invokevirtual   #66  <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
		editor.putFloat(stringbuilder.toString(), b);
	//   20   41:aload_1         
	//   21   42:aload_2         
	//   22   43:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   23   46:aload_0         
	//   24   47:getfield        #19  <Field float b>
	//   25   50:invokeinterface #153 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   26   55:pop             
		editor.apply();
	//   27   56:aload_1         
	//   28   57:invokeinterface #156 <Method void android.content.SharedPreferences$Editor.apply()>
	//   29   62:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		return motionevent.getPointerCount() == 2;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #163 <Method int MotionEvent.getPointerCount()>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		if(!e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean e>
	//*   2    4:ifne            30
		{
			e = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #25  <Field boolean e>
			((AbsoluteLayout)getParent()).addOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (new c(this))));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #169 <Method android.view.ViewParent getParent()>
	//    8   16:checkcast       #171 <Class AbsoluteLayout>
	//    9   19:new             #173 <Class c>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #174 <Method void c(ScalingLinearLayout)>
	//   13   27:invokevirtual   #178 <Method void AbsoluteLayout.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		}
		if(d > 0)
	//*  14   30:aload_0         
	//*  15   31:getfield        #23  <Field int d>
	//*  16   34:ifle            41
			a();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #180 <Method void a()>
		super.onMeasure(i, j);
	//   19   41:aload_0         
	//   20   42:iload_1         
	//   21   43:iload_2         
	//   22   44:invokespecial   #182 <Method void LinearLayout.onMeasure(int, int)>
	//   23   47:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		a.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ScaleGestureDetector a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #185 <Method boolean ScaleGestureDetector.onTouchEvent(MotionEvent)>
	//    4    8:pop             
		return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	private ScaleGestureDetector a;
	private float b;
	private int c;
	private int d;
	private boolean e;
}
