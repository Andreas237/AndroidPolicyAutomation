// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.irobot.home.view:
//			SmartRecommendationCardView

class SmartRecommendationCardView$1 extends Animation
{

	protected void applyTransformation(float f, Transformation transformation)
	{
		transformation = ((Transformation) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SmartRecommendationCardView b>
	//    2    4:astore_2        
		int i = f != 1.0F;
	//    3    5:fload_1         
	//    4    6:fconst_1        
	//    5    7:fcmpl           
	//    6    8:istore_3        
		boolean flag;
		if(i != 0)
	//*   7    9:iload_3         
	//*   8   10:ifeq            19
			flag = true;
	//    9   13:iconst_1        
	//   10   14:istore          4
		else
	//*  11   16:goto            22
			flag = false;
	//   12   19:iconst_0        
	//   13   20:istore          4
		SmartRecommendationCardView.a(((SmartRecommendationCardView) (transformation)), flag);
	//   14   22:aload_2         
	//   15   23:iload           4
	//   16   25:invokestatic    #26  <Method boolean SmartRecommendationCardView.a(SmartRecommendationCardView, boolean)>
	//   17   28:pop             
		if(i == 0)
	//*  18   29:iload_3         
	//*  19   30:ifne            45
		{
			b.setVisibility(8);
	//   20   33:aload_0         
	//   21   34:getfield        #16  <Field SmartRecommendationCardView b>
	//   22   37:bipush          8
	//   23   39:invokevirtual   #30  <Method void SmartRecommendationCardView.setVisibility(int)>
		} else
	//*  24   42:goto            78
		{
			((android.widget.RelativeLayout.LayoutParams)b.getLayoutParams()).height = a - (int)((float)a * f);
	//   25   45:aload_0         
	//   26   46:getfield        #16  <Field SmartRecommendationCardView b>
	//   27   49:invokevirtual   #34  <Method android.view.ViewGroup$LayoutParams SmartRecommendationCardView.getLayoutParams()>
	//   28   52:checkcast       #36  <Class android.widget.RelativeLayout$LayoutParams>
	//   29   55:aload_0         
	//   30   56:getfield        #18  <Field int a>
	//   31   59:aload_0         
	//   32   60:getfield        #18  <Field int a>
	//   33   63:i2f             
	//   34   64:fload_1         
	//   35   65:fmul            
	//   36   66:f2i             
	//   37   67:isub            
	//   38   68:putfield        #39  <Field int android.widget.RelativeLayout$LayoutParams.height>
			b.requestLayout();
	//   39   71:aload_0         
	//   40   72:getfield        #16  <Field SmartRecommendationCardView b>
	//   41   75:invokevirtual   #42  <Method void SmartRecommendationCardView.requestLayout()>
		}
		if(i != 0 && SmartRecommendationCardView.a(b) != null)
	//*  42   78:iload_3         
	//*  43   79:ifeq            112
	//*  44   82:aload_0         
	//*  45   83:getfield        #16  <Field SmartRecommendationCardView b>
	//*  46   86:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
	//*  47   89:ifnull          112
		{
			SmartRecommendationCardView.a(b).b(SmartRecommendationCardView.b(b));
	//   48   92:aload_0         
	//   49   93:getfield        #16  <Field SmartRecommendationCardView b>
	//   50   96:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
	//   51   99:aload_0         
	//   52  100:getfield        #16  <Field SmartRecommendationCardView b>
	//   53  103:invokestatic    #48  <Method SmartRecommendationCardView SmartRecommendationCardView.b(SmartRecommendationCardView)>
	//   54  106:invokeinterface #53  <Method void com.irobot.home.n.b$b.b(SmartRecommendationCardView)>
			return;
	//   55  111:return          
		}
		if(SmartRecommendationCardView.a(b) != null)
	//*  56  112:aload_0         
	//*  57  113:getfield        #16  <Field SmartRecommendationCardView b>
	//*  58  116:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
	//*  59  119:ifnull          141
			SmartRecommendationCardView.a(b).a(SmartRecommendationCardView.b(b));
	//   60  122:aload_0         
	//   61  123:getfield        #16  <Field SmartRecommendationCardView b>
	//   62  126:invokestatic    #45  <Method com.irobot.home.n.b$b SmartRecommendationCardView.a(SmartRecommendationCardView)>
	//   63  129:aload_0         
	//   64  130:getfield        #16  <Field SmartRecommendationCardView b>
	//   65  133:invokestatic    #48  <Method SmartRecommendationCardView SmartRecommendationCardView.b(SmartRecommendationCardView)>
	//   66  136:invokeinterface #55  <Method void com.irobot.home.n.b$b.a(SmartRecommendationCardView)>
	//   67  141:return          
	}

	public boolean willChangeBounds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final int a;
	final SmartRecommendationCardView b;

	SmartRecommendationCardView$1(SmartRecommendationCardView smartrecommendationcardview, int i)
	{
		b = smartrecommendationcardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SmartRecommendationCardView b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Animation()>
	//    8   14:return          
	}
}
