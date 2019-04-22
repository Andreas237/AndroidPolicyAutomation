// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.constraint:
//			ConstraintHelper, ConstraintLayout

public class Group extends ConstraintHelper
{

	public Group(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void ConstraintHelper(Context, AttributeSet)>
	//    4    6:return          
	}

	protected void init(AttributeSet attributeset)
	{
		super.init(attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ConstraintHelper.init(AttributeSet)>
		mUseViewMeasure = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field boolean mUseViewMeasure>
	//    6   10:return          
	}

	public void updatePostLayout(ConstraintLayout constraintlayout)
	{
		constraintlayout = ((ConstraintLayout) ((ConstraintLayout.LayoutParams)getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    2    4:checkcast       #25  <Class ConstraintLayout$LayoutParams>
	//    3    7:astore_1        
		((ConstraintLayout.LayoutParams) (constraintlayout)).widget.setWidth(0);
	//    4    8:aload_1         
	//    5    9:getfield        #29  <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #35  <Method void ConstraintWidget.setWidth(int)>
		((ConstraintLayout.LayoutParams) (constraintlayout)).widget.setHeight(0);
	//    8   16:aload_1         
	//    9   17:getfield        #29  <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #38  <Method void ConstraintWidget.setHeight(int)>
	//   12   24:return          
	}

	public void updatePreLayout(ConstraintLayout constraintlayout)
	{
		int j = getVisibility();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method int getVisibility()>
	//    2    4:istore          4
		float f;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    6:getstatic       #49  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    9:bipush          21
	//*   5   11:icmplt          22
			f = getElevation();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #53  <Method float getElevation()>
	//    8   18:fstore_2        
		else
	//*   9   19:goto            24
			f = 0.0F;
	//   10   22:fconst_0        
	//   11   23:fstore_2        
		for(int i = 0; i < mCount; i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_3        
	//*  14   26:iload_3         
	//*  15   27:aload_0         
	//*  16   28:getfield        #56  <Field int mCount>
	//*  17   31:icmpge          85
		{
			View view = constraintlayout.getViewById(mIds[i]);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #60  <Field int[] mIds>
	//   21   39:iload_3         
	//   22   40:iaload          
	//   23   41:invokevirtual   #66  <Method View ConstraintLayout.getViewById(int)>
	//   24   44:astore          5
			if(view == null)
				continue;
	//   25   46:aload           5
	//   26   48:ifnull          78
			view.setVisibility(j);
	//   27   51:aload           5
	//   28   53:iload           4
	//   29   55:invokevirtual   #71  <Method void View.setVisibility(int)>
			if(f > 0.0F && android.os.Build.VERSION.SDK_INT >= 21)
	//*  30   58:fload_2         
	//*  31   59:fconst_0        
	//*  32   60:fcmpl           
	//*  33   61:ifle            78
	//*  34   64:getstatic       #49  <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   67:bipush          21
	//*  36   69:icmplt          78
				view.setElevation(f);
	//   37   72:aload           5
	//   38   74:fload_2         
	//   39   75:invokevirtual   #75  <Method void View.setElevation(float)>
		}

	//   40   78:iload_3         
	//   41   79:iconst_1        
	//   42   80:iadd            
	//   43   81:istore_3        
	//*  44   82:goto            26
	//   45   85:return          
	}
}
