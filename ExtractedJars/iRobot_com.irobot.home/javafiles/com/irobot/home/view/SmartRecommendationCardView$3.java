// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.irobot.home.view:
//			SmartRecommendationCardView

class SmartRecommendationCardView$3 extends Animation
{

	protected void applyTransformation(float f, Transformation transformation)
	{
		transformation = ((Transformation) (b.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SmartRecommendationCardView b>
	//    2    4:invokevirtual   #28  <Method android.view.ViewGroup$LayoutParams SmartRecommendationCardView.getLayoutParams()>
	//    3    7:astore_2        
		int j = f != 1.0F;
	//    4    8:fload_1         
	//    5    9:fconst_1        
	//    6   10:fcmpl           
	//    7   11:istore          4
		int i;
		if(j == 0)
	//*   8   13:iload           4
	//*   9   15:ifne            24
			i = -2;
	//   10   18:bipush          -2
	//   11   20:istore_3        
		else
	//*  12   21:goto            33
			i = (int)((float)a * f);
	//   13   24:aload_0         
	//   14   25:getfield        #19  <Field int a>
	//   15   28:i2f             
	//   16   29:fload_1         
	//   17   30:fmul            
	//   18   31:f2i             
	//   19   32:istore_3        
		transformation.height = i;
	//   20   33:aload_2         
	//   21   34:iload_3         
	//   22   35:putfield        #33  <Field int android.view.ViewGroup$LayoutParams.height>
		transformation = ((Transformation) (b));
	//   23   38:aload_0         
	//   24   39:getfield        #17  <Field SmartRecommendationCardView b>
	//   25   42:astore_2        
		boolean flag1 = false;
	//   26   43:iconst_0        
	//   27   44:istore          6
		boolean flag;
		if(j != 0)
	//*  28   46:iload           4
	//*  29   48:ifeq            57
			flag = true;
	//   30   51:iconst_1        
	//   31   52:istore          5
		else
	//*  32   54:goto            60
			flag = false;
	//   33   57:iconst_0        
	//   34   58:istore          5
		SmartRecommendationCardView.a(((SmartRecommendationCardView) (transformation)), flag);
	//   35   60:aload_2         
	//   36   61:iload           5
	//   37   63:invokestatic    #36  <Method boolean SmartRecommendationCardView.a(SmartRecommendationCardView, boolean)>
	//   38   66:pop             
		transformation = ((Transformation) (b));
	//   39   67:aload_0         
	//   40   68:getfield        #17  <Field SmartRecommendationCardView b>
	//   41   71:astore_2        
		flag = flag1;
	//   42   72:iload           6
	//   43   74:istore          5
		if(j != 0)
	//*  44   76:iload           4
	//*  45   78:ifeq            84
			flag = true;
	//   46   81:iconst_1        
	//   47   82:istore          5
		SmartRecommendationCardView.b(((SmartRecommendationCardView) (transformation)), flag);
	//   48   84:aload_2         
	//   49   85:iload           5
	//   50   87:invokestatic    #38  <Method boolean SmartRecommendationCardView.b(SmartRecommendationCardView, boolean)>
	//   51   90:pop             
		if(j != 0 && SmartRecommendationCardView.c(b) != null)
	//*  52   91:iload           4
	//*  53   93:ifeq            128
	//*  54   96:aload_0         
	//*  55   97:getfield        #17  <Field SmartRecommendationCardView b>
	//*  56  100:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
	//*  57  103:ifnull          128
			SmartRecommendationCardView.c(b).b(SmartRecommendationCardView.b(b));
	//   58  106:aload_0         
	//   59  107:getfield        #17  <Field SmartRecommendationCardView b>
	//   60  110:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
	//   61  113:aload_0         
	//   62  114:getfield        #17  <Field SmartRecommendationCardView b>
	//   63  117:invokestatic    #44  <Method SmartRecommendationCardView SmartRecommendationCardView.b(SmartRecommendationCardView)>
	//   64  120:invokeinterface #49  <Method void com.irobot.home.n.b$c.b(SmartRecommendationCardView)>
		else
	//*  65  125:goto            157
		if(SmartRecommendationCardView.c(b) != null)
	//*  66  128:aload_0         
	//*  67  129:getfield        #17  <Field SmartRecommendationCardView b>
	//*  68  132:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
	//*  69  135:ifnull          157
			SmartRecommendationCardView.c(b).a(SmartRecommendationCardView.b(b));
	//   70  138:aload_0         
	//   71  139:getfield        #17  <Field SmartRecommendationCardView b>
	//   72  142:invokestatic    #41  <Method com.irobot.home.n.b$c SmartRecommendationCardView.c(SmartRecommendationCardView)>
	//   73  145:aload_0         
	//   74  146:getfield        #17  <Field SmartRecommendationCardView b>
	//   75  149:invokestatic    #44  <Method SmartRecommendationCardView SmartRecommendationCardView.b(SmartRecommendationCardView)>
	//   76  152:invokeinterface #51  <Method void com.irobot.home.n.b$c.a(SmartRecommendationCardView)>
		b.requestLayout();
	//   77  157:aload_0         
	//   78  158:getfield        #17  <Field SmartRecommendationCardView b>
	//   79  161:invokevirtual   #54  <Method void SmartRecommendationCardView.requestLayout()>
	//   80  164:return          
	}

	public boolean willChangeBounds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final int a;
	final SmartRecommendationCardView b;

	SmartRecommendationCardView$3(SmartRecommendationCardView smartrecommendationcardview, int i)
	{
		b = smartrecommendationcardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SmartRecommendationCardView b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Animation()>
	//    8   14:return          
	}
}
