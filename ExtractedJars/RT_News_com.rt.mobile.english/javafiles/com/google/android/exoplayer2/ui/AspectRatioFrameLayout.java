// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.lang.annotation.Annotation;

public final class AspectRatioFrameLayout extends FrameLayout
{
	public static interface AspectRatioListener
	{

		public abstract void onAspectRatioUpdated(float f, float f1, boolean flag);
	}

	private final class AspectRatioUpdateDispatcher
		implements Runnable
	{

		public void run()
		{
			isScheduled = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #31  <Field boolean isScheduled>
			if(aspectRatioListener == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #21  <Field AspectRatioFrameLayout this$0>
		//*   5    9:invokestatic    #35  <Method AspectRatioFrameLayout$AspectRatioListener AspectRatioFrameLayout.access$100(AspectRatioFrameLayout)>
		//*   6   12:ifnonnull       16
			{
				return;
		//    7   15:return          
			} else
			{
				aspectRatioListener.onAspectRatioUpdated(targetAspectRatio, naturalAspectRatio, aspectRatioMismatch);
		//    8   16:aload_0         
		//    9   17:getfield        #21  <Field AspectRatioFrameLayout this$0>
		//   10   20:invokestatic    #35  <Method AspectRatioFrameLayout$AspectRatioListener AspectRatioFrameLayout.access$100(AspectRatioFrameLayout)>
		//   11   23:aload_0         
		//   12   24:getfield        #37  <Field float targetAspectRatio>
		//   13   27:aload_0         
		//   14   28:getfield        #39  <Field float naturalAspectRatio>
		//   15   31:aload_0         
		//   16   32:getfield        #41  <Field boolean aspectRatioMismatch>
		//   17   35:invokeinterface #47  <Method void AspectRatioFrameLayout$AspectRatioListener.onAspectRatioUpdated(float, float, boolean)>
				return;
		//   18   40:return          
			}
		}

		public void scheduleUpdate(float f, float f1, boolean flag)
		{
			targetAspectRatio = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #37  <Field float targetAspectRatio>
			naturalAspectRatio = f1;
		//    3    5:aload_0         
		//    4    6:fload_2         
		//    5    7:putfield        #39  <Field float naturalAspectRatio>
			aspectRatioMismatch = flag;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #41  <Field boolean aspectRatioMismatch>
			if(!isScheduled)
		//*   9   15:aload_0         
		//*  10   16:getfield        #31  <Field boolean isScheduled>
		//*  11   19:ifne            36
			{
				isScheduled = true;
		//   12   22:aload_0         
		//   13   23:iconst_1        
		//   14   24:putfield        #31  <Field boolean isScheduled>
				post(((Runnable) (this)));
		//   15   27:aload_0         
		//   16   28:getfield        #21  <Field AspectRatioFrameLayout this$0>
		//   17   31:aload_0         
		//   18   32:invokevirtual   #52  <Method boolean AspectRatioFrameLayout.post(Runnable)>
		//   19   35:pop             
			}
		//   20   36:return          
		}

		private boolean aspectRatioMismatch;
		private boolean isScheduled;
		private float naturalAspectRatio;
		private float targetAspectRatio;
		final AspectRatioFrameLayout this$0;

		private AspectRatioUpdateDispatcher()
		{
			this$0 = AspectRatioFrameLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field AspectRatioFrameLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
		//    5    9:return          
		}

	}

	public static interface ResizeMode
		extends Annotation
	{
	}


	public AspectRatioFrameLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #40  <Method void AspectRatioFrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public AspectRatioFrameLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void FrameLayout(Context, AttributeSet)>
		resizeMode = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #44  <Field int resizeMode>
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_55;
	//    7   11:aload_2         
	//    8   12:ifnull          55
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, R.styleable.AspectRatioFrameLayout, 0, 0)));
	//    9   15:aload_1         
	//   10   16:invokevirtual   #50  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   11   19:aload_2         
	//   12   20:getstatic       #56  <Field int[] R$styleable.AspectRatioFrameLayout>
	//   13   23:iconst_0        
	//   14   24:iconst_0        
	//   15   25:invokevirtual   #62  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   16   28:astore_1        
		resizeMode = ((TypedArray) (context)).getInt(R.styleable.AspectRatioFrameLayout_resize_mode, 0);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:getstatic       #65  <Field int R$styleable.AspectRatioFrameLayout_resize_mode>
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #71  <Method int TypedArray.getInt(int, int)>
	//   22   38:putfield        #44  <Field int resizeMode>
		((TypedArray) (context)).recycle();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #75  <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_55;
	//   25   45:goto            55
		attributeset;
	//   26   48:astore_2        
		((TypedArray) (context)).recycle();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #75  <Method void TypedArray.recycle()>
		throw attributeset;
	//   29   53:aload_2         
	//   30   54:athrow          
		aspectRatioUpdateDispatcher = new AspectRatioUpdateDispatcher();
	//   31   55:aload_0         
	//   32   56:new             #11  <Class AspectRatioFrameLayout$AspectRatioUpdateDispatcher>
	//   33   59:dup             
	//   34   60:aload_0         
	//   35   61:aconst_null     
	//   36   62:invokespecial   #78  <Method void AspectRatioFrameLayout$AspectRatioUpdateDispatcher(AspectRatioFrameLayout, AspectRatioFrameLayout$1)>
	//   37   65:putfield        #80  <Field AspectRatioFrameLayout$AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher>
		return;
	//   38   68:return          
	}

	public int getResizeMode()
	{
		return resizeMode;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int resizeMode>
	//    2    4:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void FrameLayout.onMeasure(int, int)>
		if(videoAspectRatio <= 0.0F)
	//*   4    6:aload_0         
	//*   5    7:getfield        #92  <Field float videoAspectRatio>
	//*   6   10:fconst_0        
	//*   7   11:fcmpg           
	//*   8   12:ifgt            16
			return;
	//    9   15:return          
		j = getMeasuredWidth();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #95  <Method int getMeasuredWidth()>
	//   12   20:istore_2        
		i = getMeasuredHeight();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #98  <Method int getMeasuredHeight()>
	//   15   25:istore_1        
		float f = j;
	//   16   26:iload_2         
	//   17   27:i2f             
	//   18   28:fstore_3        
		float f1 = i;
	//   19   29:iload_1         
	//   20   30:i2f             
	//   21   31:fstore          4
		float f2 = f / f1;
	//   22   33:fload_3         
	//   23   34:fload           4
	//   24   36:fdiv            
	//   25   37:fstore          5
		float f3 = videoAspectRatio / f2 - 1.0F;
	//   26   39:aload_0         
	//   27   40:getfield        #92  <Field float videoAspectRatio>
	//   28   43:fload           5
	//   29   45:fdiv            
	//   30   46:fconst_1        
	//   31   47:fsub            
	//   32   48:fstore          6
		if(Math.abs(f3) <= 0.01F)
	//*  33   50:fload           6
	//*  34   52:invokestatic    #104 <Method float Math.abs(float)>
	//*  35   55:ldc1            #18  <Float 0.01F>
	//*  36   57:fcmpg           
	//*  37   58:ifgt            76
		{
			aspectRatioUpdateDispatcher.scheduleUpdate(videoAspectRatio, f2, false);
	//   38   61:aload_0         
	//   39   62:getfield        #80  <Field AspectRatioFrameLayout$AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher>
	//   40   65:aload_0         
	//   41   66:getfield        #92  <Field float videoAspectRatio>
	//   42   69:fload           5
	//   43   71:iconst_0        
	//   44   72:invokevirtual   #108 <Method void AspectRatioFrameLayout$AspectRatioUpdateDispatcher.scheduleUpdate(float, float, boolean)>
			return;
	//   45   75:return          
		}
		int k = resizeMode;
	//   46   76:aload_0         
	//   47   77:getfield        #44  <Field int resizeMode>
	//   48   80:istore          7
		if(k != 4)
	//*  49   82:iload           7
	//*  50   84:iconst_4        
	//*  51   85:icmpeq          172
			switch(k)
	//*  52   88:iload           7
			{
	//*  53   90:tableswitch     0 2: default 116
	//	               0 142
	//	               1 131
	//	               2 119
	//*  54  116:goto            199
			case 2: // '\002'
				j = (int)(f1 * videoAspectRatio);
	//   55  119:fload           4
	//   56  121:aload_0         
	//   57  122:getfield        #92  <Field float videoAspectRatio>
	//   58  125:fmul            
	//   59  126:f2i             
	//   60  127:istore_2        
				break;

	//*  61  128:goto            199
			case 1: // '\001'
				i = (int)(f / videoAspectRatio);
	//   62  131:fload_3         
	//   63  132:aload_0         
	//   64  133:getfield        #92  <Field float videoAspectRatio>
	//   65  136:fdiv            
	//   66  137:f2i             
	//   67  138:istore_1        
				break;

	//*  68  139:goto            199
			case 0: // '\0'
				if(f3 > 0.0F)
	//*  69  142:fload           6
	//*  70  144:fconst_0        
	//*  71  145:fcmpl           
	//*  72  146:ifle            160
					i = (int)(f / videoAspectRatio);
	//   73  149:fload_3         
	//   74  150:aload_0         
	//   75  151:getfield        #92  <Field float videoAspectRatio>
	//   76  154:fdiv            
	//   77  155:f2i             
	//   78  156:istore_1        
				else
	//*  79  157:goto            199
					j = (int)(f1 * videoAspectRatio);
	//   80  160:fload           4
	//   81  162:aload_0         
	//   82  163:getfield        #92  <Field float videoAspectRatio>
	//   83  166:fmul            
	//   84  167:f2i             
	//   85  168:istore_2        
				break;
			}
		else
	//*  86  169:goto            199
		if(f3 > 0.0F)
	//*  87  172:fload           6
	//*  88  174:fconst_0        
	//*  89  175:fcmpl           
	//*  90  176:ifle            191
			j = (int)(f1 * videoAspectRatio);
	//   91  179:fload           4
	//   92  181:aload_0         
	//   93  182:getfield        #92  <Field float videoAspectRatio>
	//   94  185:fmul            
	//   95  186:f2i             
	//   96  187:istore_2        
		else
	//*  97  188:goto            199
			i = (int)(f / videoAspectRatio);
	//   98  191:fload_3         
	//   99  192:aload_0         
	//  100  193:getfield        #92  <Field float videoAspectRatio>
	//  101  196:fdiv            
	//  102  197:f2i             
	//  103  198:istore_1        
		aspectRatioUpdateDispatcher.scheduleUpdate(videoAspectRatio, f2, true);
	//  104  199:aload_0         
	//  105  200:getfield        #80  <Field AspectRatioFrameLayout$AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher>
	//  106  203:aload_0         
	//  107  204:getfield        #92  <Field float videoAspectRatio>
	//  108  207:fload           5
	//  109  209:iconst_1        
	//  110  210:invokevirtual   #108 <Method void AspectRatioFrameLayout$AspectRatioUpdateDispatcher.scheduleUpdate(float, float, boolean)>
		super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000));
	//  111  213:aload_0         
	//  112  214:iload_2         
	//  113  215:ldc1            #109 <Int 0x40000000>
	//  114  217:invokestatic    #114 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  115  220:iload_1         
	//  116  221:ldc1            #109 <Int 0x40000000>
	//  117  223:invokestatic    #114 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  118  226:invokespecial   #90  <Method void FrameLayout.onMeasure(int, int)>
	//  119  229:return          
	}

	public void setAspectRatio(float f)
	{
		if(videoAspectRatio != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field float videoAspectRatio>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			videoAspectRatio = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #92  <Field float videoAspectRatio>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #119 <Method void requestLayout()>
		}
	//   10   18:return          
	}

	public void setAspectRatioListener(AspectRatioListener aspectratiolistener)
	{
		aspectRatioListener = aspectratiolistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field AspectRatioFrameLayout$AspectRatioListener aspectRatioListener>
	//    3    5:return          
	}

	public void setResizeMode(int i)
	{
		if(resizeMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int resizeMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			resizeMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #44  <Field int resizeMode>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #119 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01F;
	public static final int RESIZE_MODE_FILL = 3;
	public static final int RESIZE_MODE_FIT = 0;
	public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
	public static final int RESIZE_MODE_FIXED_WIDTH = 1;
	public static final int RESIZE_MODE_ZOOM = 4;
	private AspectRatioListener aspectRatioListener;
	private final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
	private int resizeMode;
	private float videoAspectRatio;


/*
	static AspectRatioListener access$100(AspectRatioFrameLayout aspectratioframelayout)
	{
		return aspectratioframelayout.aspectRatioListener;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field AspectRatioFrameLayout$AspectRatioListener aspectRatioListener>
	//    2    4:areturn         
	}

*/
}
