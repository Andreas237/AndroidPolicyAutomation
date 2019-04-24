// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Slide

static final class Slide$5 extends lculateSlideHorizontal
{

	public float getGoneX(ViewGroup viewgroup, View view)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(ViewCompat.getLayoutDirection(((View) (viewgroup))) != 1)
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #20  <Method int ViewCompat.getLayoutDirection(View)>
	//*   4    6:iconst_1        
	//*   5    7:icmpne          25
	//*   6   10:iload_3         
	//*   7   11:ifeq            30
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #26  <Method float View.getTranslationX()>
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #32  <Method int ViewGroup.getWidth()>
	//*  12   22:i2f             
	//*  13   23:fsub            
	//*  14   24:freturn         
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_3        
		if(flag)
			return view.getTranslationX() - (float)viewgroup.getWidth();
		else
	//*  17   27:goto            10
			return view.getTranslationX() + (float)viewgroup.getWidth();
	//   18   30:aload_2         
	//   19   31:invokevirtual   #26  <Method float View.getTranslationX()>
	//   20   34:aload_1         
	//   21   35:invokevirtual   #32  <Method int ViewGroup.getWidth()>
	//   22   38:i2f             
	//   23   39:fadd            
	//   24   40:freturn         
	}

	Slide$5()
	{
		super(((Slide$1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #11  <Method void Slide$CalculateSlideHorizontal(Slide$1)>
	//    3    5:return          
	}
}
