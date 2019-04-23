// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package android.support.design.chip:
//			Chip, ChipDrawable

class Chip$2 extends ViewOutlineProvider
{

	public void getOutline(View view, Outline outline)
	{
		if(Chip.access$000(Chip.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Chip this$0>
	//*   2    4:invokestatic    #27  <Method ChipDrawable Chip.access$000(Chip)>
	//*   3    7:ifnull          22
		{
			Chip.access$000(Chip.this).getOutline(outline);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field Chip this$0>
	//    6   14:invokestatic    #27  <Method ChipDrawable Chip.access$000(Chip)>
	//    7   17:aload_2         
	//    8   18:invokevirtual   #32  <Method void ChipDrawable.getOutline(Outline)>
			return;
	//    9   21:return          
		} else
		{
			outline.setAlpha(0.0F);
	//   10   22:aload_2         
	//   11   23:fconst_0        
	//   12   24:invokevirtual   #38  <Method void Outline.setAlpha(float)>
			return;
	//   13   27:return          
		}
	}

	final Chip this$0;

	Chip$2()
	{
		this$0 = Chip.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Chip this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void ViewOutlineProvider()>
	//    5    9:return          
	}
}
