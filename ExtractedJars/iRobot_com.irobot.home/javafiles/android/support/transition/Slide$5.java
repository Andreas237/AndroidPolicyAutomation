// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Slide

static final class Slide$5 extends Slide$b
{

	public float a(ViewGroup viewgroup, View view)
	{
		int i = s.e(((View) (viewgroup)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int s.e(View)>
	//    2    4:istore          4
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		if(i != 1)
	//*   5    8:iload           4
	//*   6   10:iconst_1        
	//*   7   11:icmpne          17
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		if(flag)
	//*  11   19:iload_3         
	//*  12   20:ifeq            34
			return view.getTranslationX() - (float)viewgroup.getWidth();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #26  <Method float View.getTranslationX()>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #32  <Method int ViewGroup.getWidth()>
	//   17   31:i2f             
	//   18   32:fsub            
	//   19   33:freturn         
		else
			return view.getTranslationX() + (float)viewgroup.getWidth();
	//   20   34:aload_2         
	//   21   35:invokevirtual   #26  <Method float View.getTranslationX()>
	//   22   38:aload_1         
	//   23   39:invokevirtual   #32  <Method int ViewGroup.getWidth()>
	//   24   42:i2f             
	//   25   43:fadd            
	//   26   44:freturn         
	}

	Slide$5()
	{
		super(((Slide$1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #11  <Method void Slide$b(Slide$1)>
	//    3    5:return          
	}
}
